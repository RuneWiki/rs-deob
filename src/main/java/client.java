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

    @OriginalMember(owner = "client", name = "L", descriptor = "Z")
    private boolean field1196 = false;

    @OriginalMember(owner = "client", name = "M", descriptor = "Z")
    private boolean field1197 = true;

    @OriginalMember(owner = "client", name = "N", descriptor = "[I")
    private int[] field1198 = new int[5];

    @OriginalMember(owner = "client", name = "V", descriptor = "B")
    private byte field1206 = 9;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field1208 = 2301979;

    @OriginalMember(owner = "client", name = "Z", descriptor = "Ljava/lang/String;")
    private String field1210 = "";

    @OriginalMember(owner = "client", name = "ab", descriptor = "[I")
    private int[] field1211 = new int[Stats.field1137];

    @OriginalMember(owner = "client", name = "bb", descriptor = "Ljava/lang/String;")
    private String field1212 = "";

    @OriginalMember(owner = "client", name = "cb", descriptor = "Ljava/lang/String;")
    private String field1213 = "";

    @OriginalMember(owner = "client", name = "eb", descriptor = "Z")
    private boolean field1215 = false;

    @OriginalMember(owner = "client", name = "fb", descriptor = "Z")
    private boolean field1216 = true;

    @OriginalMember(owner = "client", name = "gb", descriptor = "Z")
    private boolean field1217 = false;

    @OriginalMember(owner = "client", name = "ib", descriptor = "[Ljava/lang/String;")
    private String[] field1219 = new String[200];

    @OriginalMember(owner = "client", name = "mb", descriptor = "Z")
    private boolean field1223 = false;

    @OriginalMember(owner = "client", name = "nb", descriptor = "[I")
    private int[] field1224 = new int[4000];

    @OriginalMember(owner = "client", name = "ob", descriptor = "[I")
    private int[] field1225 = new int[4000];

    @OriginalMember(owner = "client", name = "pb", descriptor = "Z")
    private boolean field1226 = false;

    @OriginalMember(owner = "client", name = "rb", descriptor = "Ld;")
    private Component field1228 = new Component();

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field1238 = 38729;

    @OriginalMember(owner = "client", name = "Db", descriptor = "B")
    private byte field1240 = -81;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Z")
    private boolean field1241 = false;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "Z")
    private boolean field1242 = false;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field1243 = -1;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private int field1247 = 50;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "[I")
    private int[] field1248 = new int[this.field1247];

    @OriginalMember(owner = "client", name = "Mb", descriptor = "[I")
    private int[] field1249 = new int[this.field1247];

    @OriginalMember(owner = "client", name = "Nb", descriptor = "[I")
    private int[] field1250 = new int[this.field1247];

    @OriginalMember(owner = "client", name = "Ob", descriptor = "[I")
    private int[] field1251 = new int[this.field1247];

    @OriginalMember(owner = "client", name = "Pb", descriptor = "[I")
    private int[] field1252 = new int[this.field1247];

    @OriginalMember(owner = "client", name = "Qb", descriptor = "[I")
    private int[] field1253 = new int[this.field1247];

    @OriginalMember(owner = "client", name = "Rb", descriptor = "[I")
    private int[] field1254 = new int[this.field1247];

    @OriginalMember(owner = "client", name = "Sb", descriptor = "[Ljava/lang/String;")
    private String[] field1255 = new String[this.field1247];

    @OriginalMember(owner = "client", name = "Tb", descriptor = "Z")
    private boolean field1256 = true;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field1260 = -1;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field1261 = -1;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field1267 = 3891;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field1273 = -1;

    @OriginalMember(owner = "client", name = "lc", descriptor = "B")
    private byte field1274 = 8;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field1275 = -1;

    @OriginalMember(owner = "client", name = "tc", descriptor = "[I")
    private int[] field1282 = new int[100];

    @OriginalMember(owner = "client", name = "uc", descriptor = "[Ljava/lang/String;")
    private String[] field1283 = new String[100];

    @OriginalMember(owner = "client", name = "vc", descriptor = "[Ljava/lang/String;")
    private String[] field1284 = new String[100];

    @OriginalMember(owner = "client", name = "Cc", descriptor = "[I")
    private int[] field1291 = new int[151];

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    private int field1297 = -171;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "[Ljava/lang/String;")
    private String[] field1309 = new String[5];

    @OriginalMember(owner = "client", name = "Vc", descriptor = "[Z")
    private boolean[] field1310 = new boolean[5];

    @OriginalMember(owner = "client", name = "Xc", descriptor = "[I")
    public int[] field1312 = new int[1000];

    @OriginalMember(owner = "client", name = "Yc", descriptor = "Z")
    private boolean field1313 = false;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field1314 = -1;

    @OriginalMember(owner = "client", name = "ad", descriptor = "[I")
    private int[] field1315 = new int[5];

    @OriginalMember(owner = "client", name = "bd", descriptor = "Z")
    private boolean field1316 = false;

    @OriginalMember(owner = "client", name = "cd", descriptor = "Z")
    private boolean field1317 = true;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field1318 = 128;

    @OriginalMember(owner = "client", name = "hd", descriptor = "Z")
    private boolean field1322 = false;

    @OriginalMember(owner = "client", name = "id", descriptor = "B")
    private byte field1323 = 2;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field1326 = -1;

    @OriginalMember(owner = "client", name = "md", descriptor = "Z")
    private boolean field1327 = true;

    @OriginalMember(owner = "client", name = "qd", descriptor = "Z")
    private boolean field1331 = false;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field1332 = -1;

    @OriginalMember(owner = "client", name = "sd", descriptor = "[Ljb;")
    private Pix32[] field1333 = new Pix32[20];

    @OriginalMember(owner = "client", name = "td", descriptor = "[J")
    private long[] field1334 = new long[100];

    @OriginalMember(owner = "client", name = "wd", descriptor = "B")
    private byte field1337 = -54;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "Lpb;")
    private LinkList field1341 = new LinkList((byte) -118);

    @OriginalMember(owner = "client", name = "Bd", descriptor = "B")
    private byte field1342 = -54;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "Z")
    private boolean field1344 = false;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "Z")
    private boolean field1347 = true;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "[Ljb;")
    private Pix32[] field1348 = new Pix32[50];

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field1353 = 8;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "[I")
    private int[] field1354 = new int[151];

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[Z")
    private boolean[] field1357 = new boolean[5];

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field1359 = -642;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "[I")
    private int[] field1361 = new int[2000];

    @OriginalMember(owner = "client", name = "Vd", descriptor = "Z")
    private boolean field1362 = false;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "Lmb;")
    private Packet field1363 = Packet.method226(1, false);

    @OriginalMember(owner = "client", name = "Yd", descriptor = "[I")
    private int[] field1365 = new int[200];

    @OriginalMember(owner = "client", name = "Zd", descriptor = "[I")
    private int[] field1366 = new int[50];

    @OriginalMember(owner = "client", name = "fe", descriptor = "Z")
    private boolean field1372 = false;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field1373 = -8263;

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private int field1375 = 2;

    @OriginalMember(owner = "client", name = "le", descriptor = "Z")
    private boolean field1378 = false;

    @OriginalMember(owner = "client", name = "ne", descriptor = "Z")
    private boolean field1380 = false;

    @OriginalMember(owner = "client", name = "oe", descriptor = "[[I")
    private int[][] field1381 = new int[104][104];

    @OriginalMember(owner = "client", name = "qe", descriptor = "[I")
    private final int[] field1383 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "se", descriptor = "[J")
    private long[] field1385 = new long[200];

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field1386 = 3;

    @OriginalMember(owner = "client", name = "ve", descriptor = "Z")
    public boolean field1388 = true;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field1392 = 3;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1393 = 2;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field1394 = -1;

    @OriginalMember(owner = "client", name = "De", descriptor = "[Lkb;")
    private Pix8[] field1396 = new Pix8[13];

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field1402 = -1;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field1410 = 3353893;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field1411 = 1;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "Lmb;")
    private Packet field1418 = Packet.method226(1, false);

    @OriginalMember(owner = "client", name = "af", descriptor = "[I")
    private int[] field1419 = new int[5];

    @OriginalMember(owner = "client", name = "cf", descriptor = "Z")
    private boolean field1421 = false;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field1422 = -1;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field1425 = 2;

    @OriginalMember(owner = "client", name = "hf", descriptor = "[Lab;")
    private NpcEntity[] field1426 = new NpcEntity[16384];

    @OriginalMember(owner = "client", name = "kf", descriptor = "[I")
    public int[] field1428 = new int[16384];

    @OriginalMember(owner = "client", name = "nf", descriptor = "[I")
    private int[] field1431 = new int[2000];

    @OriginalMember(owner = "client", name = "of", descriptor = "Z")
    private boolean field1432 = false;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field1434 = 2048;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field1435 = 2047;

    @OriginalMember(owner = "client", name = "sf", descriptor = "[Lbb;")
    private PlayerEntity[] field1436 = new PlayerEntity[this.field1434];

    @OriginalMember(owner = "client", name = "uf", descriptor = "[I")
    public int[] field1438 = new int[this.field1434];

    @OriginalMember(owner = "client", name = "wf", descriptor = "[I")
    private int[] field1440 = new int[this.field1434];

    @OriginalMember(owner = "client", name = "xf", descriptor = "[Lmb;")
    private Packet[] field1441 = new Packet[this.field1434];

    @OriginalMember(owner = "client", name = "zf", descriptor = "Z")
    private boolean field1443 = false;

    @OriginalMember(owner = "client", name = "Af", descriptor = "[Lkb;")
    private Pix8[] field1444 = new Pix8[2];

    @OriginalMember(owner = "client", name = "Bf", descriptor = "[I")
    private int[] field1445 = new int[9];

    @OriginalMember(owner = "client", name = "Df", descriptor = "I")
    private int field1447 = 1;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Z")
    public boolean field1448 = false;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "[[I")
    private int[][] field1451 = new int[104][104];

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private final int field1452 = 100;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "[I")
    private int[] field1453 = new int[100];

    @OriginalMember(owner = "client", name = "Kf", descriptor = "[Lkb;")
    private Pix8[] field1454 = new Pix8[50];

    @OriginalMember(owner = "client", name = "Lf", descriptor = "[I")
    private int[] field1455 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Mf", descriptor = "[Ljb;")
    private Pix32[] field1456 = new Pix32[8];

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field1459 = 548;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field1460 = 2;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "Lmb;")
    private Packet field1461 = Packet.method226(1, false);

    @OriginalMember(owner = "client", name = "Yf", descriptor = "[I")
    private int[] field1468 = new int[5];

    @OriginalMember(owner = "client", name = "Zf", descriptor = "Z")
    private boolean field1469 = false;

    @OriginalMember(owner = "client", name = "ig", descriptor = "[I")
    private int[] field1478 = new int[Stats.field1137];

    @OriginalMember(owner = "client", name = "jg", descriptor = "Z")
    private boolean field1479 = false;

    @OriginalMember(owner = "client", name = "kg", descriptor = "Z")
    private boolean field1480 = true;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field1490 = -1;

    @OriginalMember(owner = "client", name = "xg", descriptor = "[I")
    private int[] field1493 = new int[256];

    @OriginalMember(owner = "client", name = "yg", descriptor = "Z")
    private boolean field1494 = false;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "Ljava/lang/String;")
    private String field1496 = "";

    @OriginalMember(owner = "client", name = "Dg", descriptor = "[I")
    private int[] field1499 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Fg", descriptor = "[I")
    private int[] field1501 = new int[33];

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field1502 = -79;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "[I")
    private int[] field1508 = new int[50];

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field1516 = 78;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "[I")
    private int[] field1517 = new int[Stats.field1137];

    @OriginalMember(owner = "client", name = "gh", descriptor = "Z")
    private boolean field1528 = false;

    @OriginalMember(owner = "client", name = "hh", descriptor = "Z")
    private boolean field1529 = true;

    @OriginalMember(owner = "client", name = "kh", descriptor = "Z")
    private boolean field1532 = false;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field1533 = 7759444;

    @OriginalMember(owner = "client", name = "qh", descriptor = "Z")
    private boolean field1538 = true;

    @OriginalMember(owner = "client", name = "rh", descriptor = "[I")
    private int[] field1539 = new int[500];

    @OriginalMember(owner = "client", name = "sh", descriptor = "[I")
    private int[] field1540 = new int[500];

    @OriginalMember(owner = "client", name = "th", descriptor = "[I")
    private int[] field1541 = new int[500];

    @OriginalMember(owner = "client", name = "uh", descriptor = "[I")
    private int[] field1542 = new int[500];

    @OriginalMember(owner = "client", name = "xh", descriptor = "[I")
    private int[] field1545 = new int[33];

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field1555 = 7;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "[Lwb;")
    public FileStream[] field1558 = new FileStream[5];

    @OriginalMember(owner = "client", name = "Lh", descriptor = "B")
    private byte field1559 = 4;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "[I")
    private int[] field1561 = new int[1000];

    @OriginalMember(owner = "client", name = "Oh", descriptor = "[I")
    private int[] field1562 = new int[1000];

    @OriginalMember(owner = "client", name = "Sh", descriptor = "[I")
    private int[] field1566 = new int[7];

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Lpb;")
    private LinkList field1569 = new LinkList((byte) -118);

    @OriginalMember(owner = "client", name = "Wh", descriptor = "[B")
    private byte[] field1570 = new byte[16384];

    @OriginalMember(owner = "client", name = "Xh", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1571 = new CRC32();

    @OriginalMember(owner = "client", name = "Yh", descriptor = "Z")
    private boolean field1572 = false;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "[Ljb;")
    private Pix32[] field1573 = new Pix32[20];

    @OriginalMember(owner = "client", name = "ji", descriptor = "B")
    private byte field1583 = 2;

    @OriginalMember(owner = "client", name = "li", descriptor = "Ljava/lang/String;")
    private String field1585 = "";

    @OriginalMember(owner = "client", name = "mi", descriptor = "Ljava/lang/String;")
    private String field1586 = "";

    @OriginalMember(owner = "client", name = "oi", descriptor = "Lpb;")
    private LinkList field1588 = new LinkList((byte) -118);

    @OriginalMember(owner = "client", name = "ti", descriptor = "Ljava/lang/String;")
    private String field1593 = "";

    @OriginalMember(owner = "client", name = "ui", descriptor = "Z")
    private boolean field1594 = false;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field1595 = -1;

    @OriginalMember(owner = "client", name = "xi", descriptor = "Z")
    private boolean field1597 = false;

    @OriginalMember(owner = "client", name = "yi", descriptor = "B")
    private byte field1598 = -74;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field1600 = 5063219;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field1603 = -171;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field1604 = 2;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "Z")
    private boolean field1609 = false;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "[Ljb;")
    private Pix32[] field1614 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "Qi", descriptor = "[[[Lpb;")
    private LinkList[][][] field1616 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private int field1619 = -1;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "B")
    private byte field1623 = 8;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    private int field1633 = 6;

    @OriginalMember(owner = "client", name = "kj", descriptor = "Ljava/lang/String;")
    private String field1636 = "";

    @OriginalMember(owner = "client", name = "lj", descriptor = "[Ljc;")
    private CollisionMap[] field1637 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "nj", descriptor = "I")
    private int field1639 = 2;

    @OriginalMember(owner = "client", name = "oj", descriptor = "Ljava/lang/String;")
    private String field1640 = "";

    @OriginalMember(owner = "client", name = "pj", descriptor = "Z")
    private boolean field1641 = false;

    @OriginalMember(owner = "client", name = "sj", descriptor = "I")
    private int field1644 = -612;

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private int field1645 = -589;

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field1648 = 1;

    @OriginalMember(owner = "client", name = "xj", descriptor = "[[I")
    private int[][] field1649 = new int[104][104];

    @OriginalMember(owner = "client", name = "Bj", descriptor = "Z")
    private boolean field1653 = false;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "[Ljava/lang/String;")
    private String[] field1655 = new String[500];

    @OriginalMember(owner = "client", name = "Ej", descriptor = "[I")
    private int[] field1656 = new int[5];

    @OriginalMember(owner = "client", name = "Fj", descriptor = "[I")
    private int[] field1657 = new int[50];

    @OriginalMember(owner = "client", name = "fc", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1268 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private static int field1290 = -258;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private static int field1299 = 10;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "Z")
    private static boolean field1301 = true;

    @OriginalMember(owner = "client", name = "pe", descriptor = "Ljava/lang/String;")
    private static String field1382 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "re", descriptor = "[[I")
    public static final int[][] field1384 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "hg", descriptor = "[I")
    private static int[] field1477 = new int[99];

    @OriginalMember(owner = "client", name = "tg", descriptor = "[I")
    private static int[] field1489;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1507;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private static int field1580;

    @OriginalMember(owner = "client", name = "rj", descriptor = "[I")
    public static final int[] field1643;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field1200;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field1201;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field1202;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field1203;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field1204;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field1207;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field1218;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field1229;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private static int field1231;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private int field1232;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field1235;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field1236;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private static int field1239;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field1244;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private static int field1245;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field1246;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field1257;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private static int field1262;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field1265;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field1276;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field1277;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field1280;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field1281;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field1295;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field1296;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private static int field1298;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field1303;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field1311;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field1319;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field1321;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field1324;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private static int field1325;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field1329;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private int field1336;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field1350;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private int field1351;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private int field1355;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private static int field1356;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private static int field1358;

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private int field1360;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "I")
    private int field1364;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field1367;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field1369;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field1370;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field1371;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field1374;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field1376;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field1379;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private static int field1387;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field1391;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field1398;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field1399;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private static int field1420;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field1424;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field1427;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private static int field1429;

    @OriginalMember(owner = "client", name = "mf", descriptor = "I")
    private int field1430;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field1446;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field1450;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private int field1482;

    @OriginalMember(owner = "client", name = "ng", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field1484;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field1485;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field1488;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field1504;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field1505;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field1506;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    private int field1509;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field1512;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private static int field1515;

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field1527;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private static int field1531;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private static int field1544;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private int field1548;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field1549;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "I")
    private int field1550;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private int field1551;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field1553;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private static int field1554;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field1556;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field1557;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field1563;

    @OriginalMember(owner = "client", name = "Th", descriptor = "I")
    private int field1567;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private int field1568;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field1578;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field1581;

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private int field1582;

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field1587;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field1589;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field1591;

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    private int field1592;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field1596;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private static int field1599;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field1610;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field1611;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field1613;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field1615;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field1617;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field1634;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private static int field1635;

    @OriginalMember(owner = "client", name = "mj", descriptor = "I")
    private int field1638;

    @OriginalMember(owner = "client", name = "uj", descriptor = "I")
    private int field1646;

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field1647;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private int field1650;

    @OriginalMember(owner = "client", name = "zj", descriptor = "I")
    private int field1651;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "I")
    public int field1654;

    @OriginalMember(owner = "client", name = "O", descriptor = "J")
    private long field1199;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "J")
    private long field1345;

    @OriginalMember(owner = "client", name = "ke", descriptor = "J")
    private long field1377;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "J")
    private long field1449;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "J")
    public long field1605;

    @OriginalMember(owner = "client", name = "U", descriptor = "Le;")
    private ClientStream field1205;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "Lxb;")
    private Isaac field1514;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "Lyb;")
    private Jagfile field1352;

    @OriginalMember(owner = "client", name = "Te", descriptor = "Lfc;")
    public MouseTracking field1412;

    @OriginalMember(owner = "client", name = "Y", descriptor = "Lvb;")
    private OnDemand field1209;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "Ljb;")
    private Pix32 field1258;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "Ljb;")
    private Pix32 field1259;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "Ljb;")
    private Pix32 field1413;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "Ljb;")
    private Pix32 field1414;

    @OriginalMember(owner = "client", name = "pf", descriptor = "Ljb;")
    private Pix32 field1433;

    @OriginalMember(owner = "client", name = "mh", descriptor = "Ljb;")
    private Pix32 field1534;

    @OriginalMember(owner = "client", name = "nh", descriptor = "Ljb;")
    private Pix32 field1535;

    @OriginalMember(owner = "client", name = "oh", descriptor = "Ljb;")
    private Pix32 field1536;

    @OriginalMember(owner = "client", name = "ph", descriptor = "Ljb;")
    private Pix32 field1537;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "Ljb;")
    private Pix32 field1564;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "Ljb;")
    private Pix32 field1565;

    @OriginalMember(owner = "client", name = "ki", descriptor = "Ljb;")
    private Pix32 field1584;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "Ljb;")
    private Pix32 field1652;

    @OriginalMember(owner = "client", name = "jb", descriptor = "Lkb;")
    private Pix8 field1220;

    @OriginalMember(owner = "client", name = "kb", descriptor = "Lkb;")
    private Pix8 field1221;

    @OriginalMember(owner = "client", name = "lb", descriptor = "Lkb;")
    private Pix8 field1222;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "Lkb;")
    private Pix8 field1304;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "Lkb;")
    private Pix8 field1305;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "Lkb;")
    private Pix8 field1306;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "Lkb;")
    private Pix8 field1307;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "Lkb;")
    private Pix8 field1308;

    @OriginalMember(owner = "client", name = "xd", descriptor = "Lkb;")
    private Pix8 field1338;

    @OriginalMember(owner = "client", name = "yd", descriptor = "Lkb;")
    private Pix8 field1339;

    @OriginalMember(owner = "client", name = "zd", descriptor = "Lkb;")
    private Pix8 field1340;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "Lkb;")
    private Pix8 field1462;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "Lkb;")
    private Pix8 field1463;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "Lkb;")
    private Pix8 field1464;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "Lkb;")
    private Pix8 field1465;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "Lkb;")
    private Pix8 field1466;

    @OriginalMember(owner = "client", name = "ai", descriptor = "Lkb;")
    private Pix8 field1574;

    @OriginalMember(owner = "client", name = "bi", descriptor = "Lkb;")
    private Pix8 field1575;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "Lkb;")
    private Pix8 field1601;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "Lkb;")
    private Pix8 field1602;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "Llb;")
    private PixFont field1403;

    @OriginalMember(owner = "client", name = "Le", descriptor = "Llb;")
    private PixFont field1404;

    @OriginalMember(owner = "client", name = "Me", descriptor = "Llb;")
    private PixFont field1405;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "Llb;")
    private PixFont field1406;

    @OriginalMember(owner = "client", name = "gc", descriptor = "Lrb;")
    private PixMap field1269;

    @OriginalMember(owner = "client", name = "hc", descriptor = "Lrb;")
    private PixMap field1270;

    @OriginalMember(owner = "client", name = "ic", descriptor = "Lrb;")
    private PixMap field1271;

    @OriginalMember(owner = "client", name = "jc", descriptor = "Lrb;")
    private PixMap field1272;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "Lrb;")
    private PixMap field1292;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "Lrb;")
    private PixMap field1293;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "Lrb;")
    private PixMap field1294;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "Lrb;")
    private PixMap field1518;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Lrb;")
    private PixMap field1519;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "Lrb;")
    private PixMap field1520;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Lrb;")
    private PixMap field1521;

    @OriginalMember(owner = "client", name = "ah", descriptor = "Lrb;")
    private PixMap field1522;

    @OriginalMember(owner = "client", name = "bh", descriptor = "Lrb;")
    private PixMap field1523;

    @OriginalMember(owner = "client", name = "ch", descriptor = "Lrb;")
    private PixMap field1524;

    @OriginalMember(owner = "client", name = "dh", descriptor = "Lrb;")
    private PixMap field1525;

    @OriginalMember(owner = "client", name = "eh", descriptor = "Lrb;")
    private PixMap field1526;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "Lrb;")
    private PixMap field1624;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "Lrb;")
    private PixMap field1625;

    @OriginalMember(owner = "client", name = "aj", descriptor = "Lrb;")
    private PixMap field1626;

    @OriginalMember(owner = "client", name = "bj", descriptor = "Lrb;")
    private PixMap field1627;

    @OriginalMember(owner = "client", name = "cj", descriptor = "Lrb;")
    private PixMap field1628;

    @OriginalMember(owner = "client", name = "dj", descriptor = "Lrb;")
    private PixMap field1629;

    @OriginalMember(owner = "client", name = "ej", descriptor = "Lrb;")
    private PixMap field1630;

    @OriginalMember(owner = "client", name = "fj", descriptor = "Lrb;")
    private PixMap field1631;

    @OriginalMember(owner = "client", name = "gj", descriptor = "Lrb;")
    private PixMap field1632;

    @OriginalMember(owner = "client", name = "qj", descriptor = "Lbb;")
    public static PlayerEntity field1642;

    @OriginalMember(owner = "client", name = "qb", descriptor = "Ls;")
    private World3D field1227;

    @OriginalMember(owner = "client", name = "dc", descriptor = "Ljava/lang/String;")
    public String field1266;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "Ljava/lang/String;")
    public String field1289;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "Ljava/lang/String;")
    private String field1346;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "Ljava/lang/String;")
    private String field1498;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "Z")
    private static boolean field1302;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "Z")
    private static boolean field1416;

    @OriginalMember(owner = "client", name = "yh", descriptor = "Z")
    public static boolean field1546;

    @OriginalMember(owner = "client", name = "fi", descriptor = "Z")
    private static boolean field1579;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "Z")
    public static boolean field1658;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "[I")
    private int[] field1408;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "[I")
    private int[] field1409;

    @OriginalMember(owner = "client", name = "ag", descriptor = "[I")
    private int[] field1470;

    @OriginalMember(owner = "client", name = "bg", descriptor = "[I")
    private int[] field1471;

    @OriginalMember(owner = "client", name = "cg", descriptor = "[I")
    private int[] field1472;

    @OriginalMember(owner = "client", name = "dg", descriptor = "[I")
    private int[] field1473;

    @OriginalMember(owner = "client", name = "eg", descriptor = "[I")
    private int[] field1474;

    @OriginalMember(owner = "client", name = "fg", descriptor = "[I")
    private int[] field1475;

    @OriginalMember(owner = "client", name = "gg", descriptor = "[I")
    private int[] field1476;

    @OriginalMember(owner = "client", name = "ci", descriptor = "[I")
    private int[] field1576;

    @OriginalMember(owner = "client", name = "di", descriptor = "[I")
    private int[] field1577;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "[I")
    private int[] field1620;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "[I")
    private int[] field1621;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "[I")
    private int[] field1622;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "[Lkb;")
    private Pix8[] field1237;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "[[B")
    private byte[][] field1395;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "[[B")
    private byte[][] field1417;

    @OriginalMember(owner = "client", name = "tb", descriptor = "[[[B")
    private byte[][][] field1230;

    @OriginalMember(owner = "client", name = "We", descriptor = "[[[I")
    private int[][][] field1415;

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILgc;IZI)V")
    public final void method431(int arg0, NpcType arg1, int arg2, boolean arg3, int arg4) {
        if (this.field1553 < 400) {
            String var6 = arg1.field992;
            if (arg3) {
                if (arg1.field1009 != 0) {
                    var6 = var6 + method440(arg1.field1009, field1642.field474, 0) + " (level-" + arg1.field1009 + ")";
                }
                if (this.field1285 == 1) {
                    this.field1655[this.field1553] = "Use " + this.field1289 + " with @yel@" + var6;
                    this.field1541[this.field1553] = 829;
                    this.field1542[this.field1553] = arg4;
                    this.field1539[this.field1553] = arg0;
                    this.field1540[this.field1553] = arg2;
                    ++this.field1553;
                } else {
                    if (this.field1263 == 1) {
                        if ((this.field1265 & 2) == 2) {
                            this.field1655[this.field1553] = this.field1266 + " @yel@" + var6;
                            this.field1541[this.field1553] = 240;
                            this.field1542[this.field1553] = arg4;
                            this.field1539[this.field1553] = arg0;
                            this.field1540[this.field1553] = arg2;
                            ++this.field1553;
                            return;
                        }
                    } else {
                        if (arg1.field1004 != null) {
                            for (int var7 = 4; var7 >= 0; --var7) {
                                if (arg1.field1004[var7] != null && !arg1.field1004[var7].equalsIgnoreCase("attack")) {
                                    this.field1655[this.field1553] = arg1.field1004[var7] + " @yel@" + var6;
                                    if (var7 == 0) {
                                        this.field1541[this.field1553] = 242;
                                    }
                                    if (var7 == 1) {
                                        this.field1541[this.field1553] = 209;
                                    }
                                    if (var7 == 2) {
                                        this.field1541[this.field1553] = 309;
                                    }
                                    if (var7 == 3) {
                                        this.field1541[this.field1553] = 852;
                                    }
                                    if (var7 == 4) {
                                        this.field1541[this.field1553] = 793;
                                    }
                                    this.field1542[this.field1553] = arg4;
                                    this.field1539[this.field1553] = arg0;
                                    this.field1540[this.field1553] = arg2;
                                    ++this.field1553;
                                }
                            }
                        }
                        if (arg1.field1004 != null) {
                            for (int var8 = 4; var8 >= 0; --var8) {
                                if (arg1.field1004[var8] != null && arg1.field1004[var8].equalsIgnoreCase("attack")) {
                                    short var9 = 0;
                                    if (arg1.field1009 > field1642.field474) {
                                        var9 = 2000;
                                    }
                                    this.field1655[this.field1553] = arg1.field1004[var8] + " @yel@" + var6;
                                    if (var8 == 0) {
                                        this.field1541[this.field1553] = var9 + 242;
                                    }
                                    if (var8 == 1) {
                                        this.field1541[this.field1553] = var9 + 209;
                                    }
                                    if (var8 == 2) {
                                        this.field1541[this.field1553] = var9 + 309;
                                    }
                                    if (var8 == 3) {
                                        this.field1541[this.field1553] = var9 + 852;
                                    }
                                    if (var8 == 4) {
                                        this.field1541[this.field1553] = var9 + 793;
                                    }
                                    this.field1542[this.field1553] = arg4;
                                    this.field1539[this.field1553] = arg0;
                                    this.field1540[this.field1553] = arg2;
                                    ++this.field1553;
                                }
                            }
                        }
                        this.field1655[this.field1553] = "Examine @yel@" + var6;
                        this.field1541[this.field1553] = 1714;
                        this.field1542[this.field1553] = arg4;
                        this.field1539[this.field1553] = arg0;
                        this.field1540[this.field1553] = arg2;
                        ++this.field1553;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method432(boolean arg0, boolean arg1) {
        this.method486(0);
        this.field1626.method268(false);
        this.field1601.method212(0, -48420, 0);
        short var3 = 360;
        short var4 = 200;
        if (arg1) {
            field1290 = 402;
        }
        if (this.field1646 == 0) {
            int var5 = var4 / 2 + 80;
            this.field1403.method215(this.field1209.field840, -413, var3 / 2, true, 7711145, var5);
            int var6 = var4 / 2 - 20;
            this.field1405.method215("Welcome to RuneScape", -413, var3 / 2, true, 16776960, var6);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field1602.method212(var7 - 73, -48420, var8 - 20);
            this.field1405.method215("New user", -413, var7, true, 16777215, var8 + 5);
            int var9 = var3 / 2 + 80;
            this.field1602.method212(var9 - 73, -48420, var8 - 20);
            this.field1405.method215("Existing User", -413, var9, true, 16777215, var8 + 5);
        }
        if (this.field1646 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field1212.length() > 0) {
                this.field1405.method215(this.field1212, -413, var3 / 2, true, 16776960, var10 - 15);
                this.field1405.method215(this.field1213, -413, var3 / 2, true, 16776960, var10);
                var10 += 30;
            } else {
                this.field1405.method215(this.field1213, -413, var3 / 2, true, 16776960, var10 - 7);
                var10 += 30;
            }
            this.field1405.method219(3, 16777215, true, "Username: " + this.field1585 + (this.field1407 == 0 & field1618 % 40 < 20 ? "@yel@|" : ""), var10, var3 / 2 - 90);
            var10 += 15;
            this.field1405.method219(3, 16777215, true, "Password: " + JString.method316(-594, this.field1586) + (this.field1407 == 1 & field1618 % 40 < 20 ? "@yel@|" : ""), var10, var3 / 2 - 88);
            var10 += 15;
            if (!arg0) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field1602.method212(var11 - 73, -48420, var12 - 20);
                this.field1405.method215("Login", -413, var11, true, 16777215, var12 + 5);
                int var13 = var3 / 2 + 80;
                this.field1602.method212(var13 - 73, -48420, var12 - 20);
                this.field1405.method215("Cancel", -413, var13, true, 16777215, var12 + 5);
            }
        }
        if (this.field1646 == 3) {
            this.field1405.method215("Create a free account", -413, var3 / 2, true, 16776960, var4 / 2 - 60);
            int var14 = var4 / 2 - 35;
            this.field1405.method215("To create a new account you need to", -413, var3 / 2, true, 16777215, var14);
            int var18 = var14 + 15;
            this.field1405.method215("go back to the main RuneScape webpage", -413, var3 / 2, true, 16777215, var18);
            int var19 = var18 + 15;
            this.field1405.method215("and choose the red 'create account'", -413, var3 / 2, true, 16777215, var19);
            int var20 = var19 + 15;
            this.field1405.method215("button at the top right of that page.", -413, var3 / 2, true, 16777215, var20);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field1602.method212(var15 - 73, -48420, var16 - 20);
            this.field1405.method215("Cancel", -413, var15, true, 16777215, var16 + 5);
        }
        this.field1626.method269(super.field15, 171, false, 202);
        if (this.field1380) {
            this.field1380 = false;
            this.field1624.method269(super.field15, 0, false, 128);
            this.field1625.method269(super.field15, 371, false, 202);
            this.field1629.method269(super.field15, 265, false, 0);
            this.field1630.method269(super.field15, 265, false, 562);
            this.field1631.method269(super.field15, 171, false, 128);
            this.field1632.method269(super.field15, 171, false, 562);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public void method433(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field1335);
        if (this.field1209 != null) {
            System.out.println("Od-cycle:" + this.field1209.field854);
        }
        System.out.println("loop-cycle:" + field1618);
        System.out.println("draw-cycle:" + field1389);
        System.out.println("ptype:" + this.field1398);
        this.field1397 += arg0;
        System.out.println("psize:" + this.field1397);
        if (this.field1205 != null) {
            this.field1205.method43(0);
        }
        super.field12 = true;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field18 != null ? super.field18 : this;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLd;IIII)V")
    public final void method434(int arg0, byte arg1, Component arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2.field77 == 0 && arg2.field92 != null && !arg2.field91) {
            if (arg6 >= arg0 && arg3 >= arg5 && arg6 <= arg2.field80 + arg0 && arg3 <= arg2.field81 + arg5) {
                int var8 = arg2.field92.length;
                if (arg1 != -75) {
                    this.field1543 = -219;
                }
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg2.field93[var9] + arg0;
                    int var11 = arg2.field94[var9] + arg5 - arg4;
                    Component var12 = Component.field70[arg2.field92[var9]];
                    int var13 = var12.field83 + var10;
                    int var14 = var12.field84 + var11;
                    if ((var12.field88 >= 0 || var12.field115 != 0) && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field80 + var13 && arg3 < var12.field81 + var14) {
                        if (var12.field88 >= 0) {
                            this.field1360 = var12.field88;
                        } else {
                            this.field1360 = var12.field75;
                        }
                    }
                    if (var12.field77 == 0) {
                        this.method434(var13, (byte) -75, var12, arg3, var12.field90, var14, arg6);
                        if (var12.field89 > var12.field81) {
                            this.method437(var12.field81, var12.field89, var14, (byte) 15, arg3, true, var12.field80 + var13, var12, arg6);
                        }
                    } else {
                        if (var12.field78 == 1 && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field80 + var13 && arg3 < var12.field81 + var14) {
                            boolean var15 = false;
                            if (var12.field79 != 0) {
                                var15 = this.method471(995, var12);
                            }
                            if (!var15) {
                                this.field1655[this.field1553] = var12.field131;
                                this.field1541[this.field1553] = 231;
                                this.field1540[this.field1553] = var12.field75;
                                ++this.field1553;
                            }
                        }
                        if (var12.field78 == 2 && this.field1263 == 0 && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field80 + var13 && arg3 < var12.field81 + var14) {
                            String var16 = var12.field128;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field1655[this.field1553] = var16 + " @gre@" + var12.field129;
                            this.field1541[this.field1553] = 274;
                            this.field1540[this.field1553] = var12.field75;
                            ++this.field1553;
                        }
                        if (var12.field78 == 3 && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field80 + var13 && arg3 < var12.field81 + var14) {
                            this.field1655[this.field1553] = "Close";
                            this.field1541[this.field1553] = 737;
                            this.field1540[this.field1553] = var12.field75;
                            ++this.field1553;
                        }
                        if (var12.field78 == 4 && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field80 + var13 && arg3 < var12.field81 + var14) {
                            this.field1655[this.field1553] = var12.field131;
                            this.field1541[this.field1553] = 435;
                            this.field1540[this.field1553] = var12.field75;
                            ++this.field1553;
                        }
                        if (var12.field78 == 5 && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field80 + var13 && arg3 < var12.field81 + var14) {
                            this.field1655[this.field1553] = var12.field131;
                            this.field1541[this.field1553] = 225;
                            this.field1540[this.field1553] = var12.field75;
                            ++this.field1553;
                        }
                        if (var12.field78 == 6 && !this.field1223 && arg6 >= var13 && arg3 >= var14 && arg6 < var12.field80 + var13 && arg3 < var12.field81 + var14) {
                            this.field1655[this.field1553] = var12.field131;
                            this.field1541[this.field1553] = 997;
                            this.field1540[this.field1553] = var12.field75;
                            ++this.field1553;
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
                                        this.field1589 = var17;
                                        this.field1590 = var12.field75;
                                        if (var12.field71[var17] > 0) {
                                            ObjType var22 = ObjType.method350(var12.field71[var17] - 1);
                                            if (this.field1285 == 1 && var12.field98) {
                                                if (this.field1287 != var12.field75 || this.field1286 != var17) {
                                                    this.field1655[this.field1553] = "Use " + this.field1289 + " with @lre@" + var22.field1032;
                                                    this.field1541[this.field1553] = 398;
                                                    this.field1542[this.field1553] = var22.field1030;
                                                    this.field1539[this.field1553] = var17;
                                                    this.field1540[this.field1553] = var12.field75;
                                                    ++this.field1553;
                                                }
                                            } else if (this.field1263 == 1 && var12.field98) {
                                                if ((this.field1265 & 16) == 16) {
                                                    this.field1655[this.field1553] = this.field1266 + " @lre@" + var22.field1032;
                                                    this.field1541[this.field1553] = 563;
                                                    this.field1542[this.field1553] = var22.field1030;
                                                    this.field1539[this.field1553] = var17;
                                                    this.field1540[this.field1553] = var12.field75;
                                                    ++this.field1553;
                                                }
                                            } else {
                                                if (var12.field98) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1047 != null && var22.field1047[var23] != null) {
                                                            this.field1655[this.field1553] = var22.field1047[var23] + " @lre@" + var22.field1032;
                                                            if (var23 == 3) {
                                                                this.field1541[this.field1553] = 681;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field1541[this.field1553] = 100;
                                                            }
                                                            this.field1542[this.field1553] = var22.field1030;
                                                            this.field1539[this.field1553] = var17;
                                                            this.field1540[this.field1553] = var12.field75;
                                                            ++this.field1553;
                                                        } else if (var23 == 4) {
                                                            this.field1655[this.field1553] = "Drop @lre@" + var22.field1032;
                                                            this.field1541[this.field1553] = 100;
                                                            this.field1542[this.field1553] = var22.field1030;
                                                            this.field1539[this.field1553] = var17;
                                                            this.field1540[this.field1553] = var12.field75;
                                                            ++this.field1553;
                                                        }
                                                    }
                                                }
                                                if (var12.field99) {
                                                    this.field1655[this.field1553] = "Use @lre@" + var22.field1032;
                                                    this.field1541[this.field1553] = 102;
                                                    this.field1542[this.field1553] = var22.field1030;
                                                    this.field1539[this.field1553] = var17;
                                                    this.field1540[this.field1553] = var12.field75;
                                                    ++this.field1553;
                                                }
                                                if (var12.field98 && var22.field1047 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1047[var24] != null) {
                                                            this.field1655[this.field1553] = var22.field1047[var24] + " @lre@" + var22.field1032;
                                                            if (var24 == 0) {
                                                                this.field1541[this.field1553] = 694;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1541[this.field1553] = 962;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1541[this.field1553] = 795;
                                                            }
                                                            this.field1542[this.field1553] = var22.field1030;
                                                            this.field1539[this.field1553] = var17;
                                                            this.field1540[this.field1553] = var12.field75;
                                                            ++this.field1553;
                                                        }
                                                    }
                                                }
                                                if (var12.field106 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field106[var25] != null) {
                                                            this.field1655[this.field1553] = var12.field106[var25] + " @lre@" + var22.field1032;
                                                            if (var25 == 0) {
                                                                this.field1541[this.field1553] = 582;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1541[this.field1553] = 113;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1541[this.field1553] = 555;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field1541[this.field1553] = 331;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field1541[this.field1553] = 354;
                                                            }
                                                            this.field1542[this.field1553] = var22.field1030;
                                                            this.field1539[this.field1553] = var17;
                                                            this.field1540[this.field1553] = var12.field75;
                                                            ++this.field1553;
                                                        }
                                                    }
                                                }
                                                this.field1655[this.field1553] = "Examine @lre@" + var22.field1032;
                                                this.field1541[this.field1553] = 1328;
                                                this.field1542[this.field1553] = var22.field1030;
                                                this.field1539[this.field1553] = var17;
                                                this.field1540[this.field1553] = var12.field75;
                                                ++this.field1553;
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
        if (this.field1313) {
            this.method524(true);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method435(int arg0) {
        if (arg0 < 0) {
            if (this.field1553 >= 2 || this.field1285 != 0 || this.field1263 != 0) {
                String var2;
                if (this.field1285 == 1 && this.field1553 < 2) {
                    var2 = "Use " + this.field1289 + " with...";
                } else if (this.field1263 == 1 && this.field1553 < 2) {
                    var2 = this.field1266 + "...";
                } else {
                    var2 = this.field1655[this.field1553 - 1];
                }
                if (this.field1553 > 2) {
                    var2 = var2 + "@whi@ / " + (this.field1553 - 2) + " more options";
                }
                this.field1405.method220(true, 4, 16777215, 0, 15, field1618 / 1000, var2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BZI)Z")
    public final boolean method436(byte[] arg0, boolean arg1, int arg2) {
        if (arg1) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        return arg0 == null ? true : signlink.wavesave(arg0, arg2);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIBIZILd;I)V")
    public final void method437(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6, Component arg7, int arg8) {
        if (arg3 == 15) {
            if (this.field1532) {
                this.field1349 = 32;
            } else {
                this.field1349 = 0;
            }
            this.field1532 = false;
            if (arg8 >= arg6 && arg8 < arg6 + 16 && arg4 >= arg2 && arg4 < arg2 + 16) {
                arg7.field90 -= this.field1207 * 4;
                if (arg5) {
                    this.field1372 = true;
                    return;
                }
            } else if (arg8 >= arg6 && arg8 < arg6 + 16 && arg4 >= arg0 + arg2 - 16 && arg4 < arg0 + arg2) {
                arg7.field90 += this.field1207 * 4;
                if (arg5) {
                    this.field1372 = true;
                    return;
                }
            } else {
                if (arg8 < arg6 - this.field1349 || arg8 >= arg6 + 16 + this.field1349 || arg4 < arg2 + 16 || arg4 >= arg0 + arg2 - 16 || this.field1207 <= 0) {
                    return;
                }
                int var10 = (arg0 - 32) * arg0 / arg1;
                if (var10 < 8) {
                    var10 = 8;
                }
                int var11 = arg4 - arg2 - 16 - var10 / 2;
                int var12 = arg0 - 32 - var10;
                arg7.field90 = (arg1 - arg0) * var11 / var12;
                if (arg5) {
                    this.field1372 = true;
                }
                this.field1532 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILjb;)V")
    public final void method438(int arg0, int arg1, int arg2, Pix32 arg3) {
        int var5 = arg0 * arg0 + arg2 * arg2;
        if (this.field1603 != arg1) {
            this.field1616 = null;
        }
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field1374 + this.field1319 & 2047;
            int var7 = Model.field608[var6];
            int var8 = Model.field609[var6];
            int var9 = var7 * 256 / (this.field1446 + 256);
            int var10 = var8 * 256 / (this.field1446 + 256);
            int var11 = arg0 * var10 + arg2 * var9 >> 16;
            int var12 = arg2 * var10 - arg0 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field1584.method204(var15 + 94 + 4 - 10, 20, true, 256, 15, 83 - var16 - 20, 20, var13, 15);
        } else {
            this.method506(arg3, arg2, (byte) 2, arg0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method439(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1212 = "";
                this.field1213 = "Connecting to server...";
                this.method432(true, false);
            }
            this.field1205 = new ClientStream((byte) 4, this, this.method500(field1300 + 43594));
            long var4 = JString.method310(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field1461.field717 = 0;
            this.field1461.method229(14);
            this.field1461.method229(var6);
            this.field1205.method42(2, this.field1461.field716, 0, false);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field1205.method39();
            }
            int var8 = this.field1205.method39();
            if (var8 == 0) {
                this.field1205.method41(this.field1418.field716, 0, 8);
                this.field1418.field717 = 0;
                this.field1449 = this.field1418.method245(6);
                int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1449 >> 32), (int) this.field1449 };
                this.field1461.field717 = 0;
                this.field1461.method229(10);
                this.field1461.method233(var9[0]);
                this.field1461.method233(var9[1]);
                this.field1461.method233(var9[2]);
                this.field1461.method233(var9[3]);
                this.field1461.method233(signlink.uid);
                this.field1461.method236(arg0);
                this.field1461.method236(arg1);
                this.field1461.method254(field1268, field1507, 913);
                this.field1363.field717 = 0;
                if (arg2) {
                    this.field1363.method229(18);
                } else {
                    this.field1363.method229(16);
                }
                this.field1363.method229(this.field1461.field717 + 36 + 1 + 1);
                this.field1363.method229(253);
                this.field1363.method229(field1302 ? 1 : 0);
                for (int var10 = 0; var10 < 9; ++var10) {
                    this.field1363.method233(this.field1445[var10]);
                }
                this.field1363.method237(0, this.field1461.field717, false, this.field1461.field716);
                this.field1461.field721 = new Isaac(var9, -44988);
                for (int var11 = 0; var11 < 4; ++var11) {
                    var9[var11] += 50;
                }
                this.field1514 = new Isaac(var9, -44988);
                this.field1205.method42(this.field1363.field717, this.field1363.field716, 0, false);
                var8 = this.field1205.method39();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var21) {
                }
                this.method439(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field1563 = this.field1205.method39();
                field1546 = this.field1205.method39() == 1;
                InputTracking.method45((byte) 2);
                this.field1605 = 0L;
                this.field1654 = 0;
                this.field1412.field979 = 0;
                super.field20 = true;
                this.field1388 = true;
                this.field1448 = true;
                this.field1461.field717 = 0;
                this.field1418.field717 = 0;
                this.field1398 = -1;
                this.field1486 = -1;
                this.field1487 = -1;
                this.field1488 = -1;
                this.field1397 = 0;
                this.field1399 = 0;
                this.field1303 = 0;
                this.field1401 = 0;
                this.field1527 = 0;
                this.field1553 = 0;
                this.field1432 = false;
                super.field21 = 0;
                for (int var12 = 0; var12 < 100; ++var12) {
                    this.field1284[var12] = null;
                }
                this.field1285 = 0;
                this.field1263 = 0;
                this.field1568 = 0;
                this.field1592 = 0;
                this.field1638 = (int) (Math.random() * 100.0D) - 50;
                this.field1424 = (int) (Math.random() * 110.0D) - 55;
                this.field1647 = (int) (Math.random() * 80.0D) - 40;
                this.field1374 = (int) (Math.random() * 120.0D) - 60;
                this.field1446 = (int) (Math.random() * 30.0D) - 20;
                this.field1319 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1595 = -1;
                this.field1650 = 0;
                this.field1651 = 0;
                this.field1437 = 0;
                this.field1427 = 0;
                for (int var13 = 0; var13 < this.field1434; ++var13) {
                    this.field1436[var13] = null;
                    this.field1441[var13] = null;
                }
                for (int var14 = 0; var14 < 16384; ++var14) {
                    this.field1426[var14] = null;
                }
                field1642 = this.field1436[this.field1435] = new PlayerEntity();
                this.field1588.method262();
                this.field1341.method262();
                for (int var15 = 0; var15 < 4; ++var15) {
                    for (int var16 = 0; var16 < 104; ++var16) {
                        for (int var17 = 0; var17 < 104; ++var17) {
                            this.field1616[var15][var16][var17] = null;
                        }
                    }
                }
                this.field1569 = new LinkList((byte) -118);
                this.field1492 = 0;
                this.field1491 = 0;
                this.field1326 = -1;
                this.field1402 = -1;
                this.field1422 = -1;
                this.field1394 = -1;
                this.field1273 = -1;
                this.field1223 = false;
                this.field1386 = 3;
                this.field1594 = false;
                this.field1432 = false;
                this.field1653 = false;
                this.field1346 = null;
                this.field1481 = 0;
                this.field1275 = -1;
                this.field1197 = true;
                this.method472(-367);
                for (int var18 = 0; var18 < 5; ++var18) {
                    this.field1468[var18] = 0;
                }
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field1309[var19] = null;
                    this.field1310[var19] = false;
                }
                field1420 = 0;
                field1298 = 0;
                field1554 = 0;
                field1429 = 0;
                field1599 = 0;
                field1239 = 0;
                field1356 = 0;
                field1387 = 0;
                field1262 = 0;
                field1544 = 0;
                this.method455(true);
            } else if (var8 == 3) {
                this.field1212 = "";
                this.field1213 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field1212 = "Your account has been disabled.";
                this.field1213 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field1212 = "Your account is already logged in.";
                this.field1213 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field1212 = "RuneScape has been updated!";
                this.field1213 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field1212 = "This world is full.";
                this.field1213 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field1212 = "Unable to connect.";
                this.field1213 = "Login server offline.";
            } else if (var8 == 9) {
                this.field1212 = "Login limit exceeded.";
                this.field1213 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field1212 = "Unable to connect.";
                this.field1213 = "Bad session id.";
            } else if (var8 == 11) {
                this.field1213 = "Login server rejected session.";
                this.field1213 = "Please try again.";
            } else if (var8 == 12) {
                this.field1212 = "You need a members account to login to this world.";
                this.field1213 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field1212 = "Could not complete login.";
                this.field1213 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field1212 = "The server is being updated.";
                this.field1213 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field1448 = true;
                this.field1461.field717 = 0;
                this.field1418.field717 = 0;
                this.field1398 = -1;
                this.field1486 = -1;
                this.field1487 = -1;
                this.field1488 = -1;
                this.field1397 = 0;
                this.field1399 = 0;
                this.field1303 = 0;
                this.field1553 = 0;
                this.field1432 = false;
                this.field1377 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field1212 = "Login attempts exceeded.";
                this.field1213 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field1212 = "You are standing in a members-only area.";
                this.field1213 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field1212 = "Invalid loginserver requested";
                this.field1213 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    this.field1212 = "No response from server";
                    this.field1213 = "Please try using a different world.";
                } else {
                    System.out.println("response:" + var8);
                    this.field1212 = "Unexpected server response";
                    this.field1213 = "Please try using a different world.";
                }
            } else {
                for (int var20 = this.field1205.method39(); var20 >= 0; --var20) {
                    this.field1212 = "You have only just left another world";
                    this.field1213 = "Your profile will be transfered in: " + var20 + " seconds";
                    this.method432(true, false);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var22) {
                    }
                }
                this.method439(arg0, arg1, arg2);
            }
        } catch (IOException var23) {
            this.field1212 = "";
            this.field1213 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        while (arg0 >= 0) {
            this.field1461.method229(237);
        }
        if (!this.field1344 && !this.field1609 && !this.field1572) {
            ++field1618;
            if (!this.field1448) {
                this.method485(2);
            } else {
                this.method507(this.field1393);
            }
            this.method519(83);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Ljava/lang/String;")
    public static final String method440(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)V")
    public final void method441(byte arg0, int arg1) {
        int[] var3 = this.field1652.field669;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var24 = (103 - var6) * 512 * 4 + 24628;
            for (int var25 = 1; var25 < 103; ++var25) {
                if ((this.field1230[arg1][var25][var6] & 24) == 0) {
                    this.field1227.method99(var3, var24, 512, arg1, var25, var6);
                }
                if (arg1 < 3 && (this.field1230[arg1 + 1][var25][var6] & 8) != 0) {
                    this.field1227.method99(var3, var24, 512, arg1 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1652.method194(false);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var23 = 1; var23 < 103; ++var23) {
                if ((this.field1230[arg1][var23][var9] & 24) == 0) {
                    this.method456(var7, this.field1240, var8, var23, var9, arg1);
                }
                if (arg1 < 3 && (this.field1230[arg1 + 1][var23][var9] & 8) != 0) {
                    this.method456(var7, this.field1240, var8, var23, var9, arg1 + 1);
                }
            }
        }
        this.field1271.method268(false);
        this.field1560 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var12 = 0; var12 < 104; ++var12) {
                int var13 = this.field1227.method93(this.field1607, var10, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 32767;
                    int var15 = LocType.method334(var14).field960;
                    if (var15 >= 0) {
                        int var16 = var10;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            byte var18 = 104;
                            byte var19 = 104;
                            int[][] var20 = this.field1637[this.field1607].field1082;
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
                        this.field1614[this.field1560] = this.field1348[var15];
                        this.field1561[this.field1560] = var16;
                        this.field1562[this.field1560] = var17;
                        ++this.field1560;
                    }
                }
            }
        }
        if (arg0 != 8) {
            for (int var11 = 1; var11 > 0; ++var11) {
            }
        }
        ++field1245;
        if (field1245 > 112) {
            field1245 = 0;
            this.field1461.method228(4, 0);
            this.field1461.method229(50);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIZIIIIII)Z")
    public final boolean method442(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1451[var15][var35] = 0;
                this.field1381[var15][var35] = 99999999;
            }
        }
        int var16 = arg2;
        int var17 = arg6;
        this.field1451[arg2][arg6] = 99;
        if (arg8 != 0) {
            this.field1461.method229(18);
        }
        this.field1381[arg2][arg6] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1224[var18] = arg2;
        int var36 = var18 + 1;
        this.field1225[var18] = arg6;
        boolean var20 = false;
        int var21 = this.field1224.length;
        int[][] var22 = this.field1637[this.field1607].field1082;
        while (var36 != var19) {
            var16 = this.field1224[var19];
            var17 = this.field1225[var19];
            var19 = (var19 + 1) % var21;
            if (arg9 == var16 && arg4 == var17) {
                var20 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && this.field1637[this.field1607].method370(arg7 - 1, var16, arg4, arg9, -924, var17, arg3)) {
                    var20 = true;
                    break;
                }
                if (arg7 < 10 && this.field1637[this.field1607].method371(-117, arg3, arg9, arg4, var17, var16, arg7 - 1)) {
                    var20 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg10 != 0 && this.field1637[this.field1607].method372(arg11, arg4, arg1, var16, arg10, var17, arg9, -237)) {
                var20 = true;
                break;
            }
            int var34 = this.field1381[var16][var17] + 1;
            if (var16 > 0 && this.field1451[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1224[var36] = var16 - 1;
                this.field1225[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1451[var16 - 1][var17] = 2;
                this.field1381[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1451[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1224[var36] = var16 + 1;
                this.field1225[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1451[var16 + 1][var17] = 8;
                this.field1381[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1451[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1224[var36] = var16;
                this.field1225[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1451[var16][var17 - 1] = 1;
                this.field1381[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1451[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1224[var36] = var16;
                this.field1225[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1451[var16][var17 + 1] = 4;
                this.field1381[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1451[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1224[var36] = var16 - 1;
                this.field1225[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1451[var16 - 1][var17 - 1] = 3;
                this.field1381[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1451[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1224[var36] = var16 + 1;
                this.field1225[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1451[var16 + 1][var17 - 1] = 9;
                this.field1381[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1451[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1224[var36] = var16 - 1;
                this.field1225[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1451[var16 - 1][var17 + 1] = 6;
                this.field1381[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1451[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1224[var36] = var16 + 1;
                this.field1225[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1451[var16 + 1][var17 + 1] = 12;
                this.field1381[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1578 = 0;
        if (!var20) {
            if (arg5) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg9 - var24; var25 <= arg9 + var24; ++var25) {
                        for (int var26 = arg4 - var24; var26 <= arg4 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1381[var25][var26] < var23) {
                                var23 = this.field1381[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1578 = 1;
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
        this.field1224[var27] = var16;
        int var37 = var27 + 1;
        this.field1225[var27] = var17;
        int var28;
        int var29 = var28 = this.field1451[var16][var17];
        while (arg2 != var16 || arg6 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1224[var37] = var16;
                this.field1225[var37++] = var17;
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
            var29 = this.field1451[var16][var17];
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
            int var31 = this.field1224[var37];
            int var32 = this.field1225[var37];
            if (arg0 == 0) {
                this.field1461.method228(6, 0);
                this.field1461.method229(var30 + var30 + 3);
            }
            if (arg0 == 1) {
                this.field1461.method228(220, 0);
                this.field1461.method229(var30 + var30 + 3 + 14);
            }
            if (arg0 == 2) {
                this.field1461.method228(127, 0);
                this.field1461.method229(var30 + var30 + 3);
            }
            if (super.field33[5] == 1) {
                this.field1461.method229(1);
            } else {
                this.field1461.method229(0);
            }
            this.field1461.method230(this.field1503 + var31);
            this.field1461.method230(this.field1504 + var32);
            this.field1650 = this.field1224[0];
            this.field1651 = this.field1225[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1461.method229(this.field1224[var37] - var31);
                this.field1461.method229(this.field1225[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method443(byte arg0) {
        this.field1601 = new Pix8(this.field1352, "titlebox", 0);
        this.field1602 = new Pix8(this.field1352, "titlebutton", 0);
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            this.field1398 = -1;
        }
        this.field1237 = new Pix8[12];
        for (int var3 = 0; var3 < 12; ++var3) {
            this.field1237[var3] = new Pix8(this.field1352, "runes", var3);
        }
        this.field1413 = new Pix32(128, 265);
        this.field1414 = new Pix32(128, 265);
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field1413.field669[var4] = this.field1627.field755[var4];
        }
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field1414.field669[var5] = this.field1628.field755[var5];
        }
        this.field1471 = new int[256];
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field1471[var6] = var6 * 262144;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1471[var7 + 64] = var7 * 1024 + 16711680;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1471[var8 + 128] = var8 * 4 + 16776960;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1471[var9 + 192] = 16777215;
        }
        this.field1472 = new int[256];
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1472[var10] = var10 * 1024;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1472[var11 + 64] = var11 * 4 + 65280;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1472[var12 + 128] = var12 * 262144 + 65535;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1472[var13 + 192] = 16777215;
        }
        this.field1473 = new int[256];
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1473[var14] = var14 * 4;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1473[var15 + 64] = var15 * 262144 + 255;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1473[var16 + 128] = var16 * 1024 + 16711935;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field1473[var17 + 192] = 16777215;
        }
        this.field1470 = new int[256];
        this.field1576 = new int[32768];
        this.field1577 = new int[32768];
        this.method469((byte) 2, (Pix8) null);
        this.field1408 = new int[32768];
        this.field1409 = new int[32768];
        this.method13(0, 10, "Connecting to fileserver");
        if (!this.field1215) {
            this.field1313 = true;
            this.field1215 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method444(int arg0) {
        if (this.field1556 != 0) {
            PixFont var2 = this.field1404;
            int var3 = 0;
            if (arg0 >= 0) {
                this.field1317 = !this.field1317;
            }
            if (this.field1303 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1284[var4] != null) {
                    int var5 = this.field1282[var4];
                    String var6 = this.field1283[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1497 == 0 || this.field1497 == 1 && this.method484(var6, 809))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method217(var8, 0, false, "From", var9);
                        var2.method217(var8 - 1, 65535, false, "From", var9);
                        int var10 = var9 + var2.method216(false, "From ");
                        if (var7 == 1) {
                            this.field1444[0].method212(var10, -48420, var8 - 12);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field1444[1].method212(var10, -48420, var8 - 12);
                            var10 += 14;
                        }
                        var2.method217(var8, 0, false, var6 + ": " + this.field1284[var4], var10);
                        var2.method217(var8 - 1, 65535, false, var6 + ": " + this.field1284[var4], var10);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field1497 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method217(var11, 0, false, this.field1284[var4], 4);
                        var2.method217(var11 - 1, 65535, false, this.field1284[var4], 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field1497 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method217(var12, 0, false, "To " + var6 + ": " + this.field1284[var4], 4);
                        var2.method217(var12 - 1, 65535, false, "To " + var6 + ": " + this.field1284[var4], 4);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLmb;)V")
    public final void method445(int arg0, boolean arg1, Packet arg2) {
        if (!arg1) {
            if (arg0 != 70 && arg0 != 88) {
                if (arg0 == 30) {
                    int var4 = arg2.method239();
                    int var5 = (var4 >> 4 & 7) + this.field1457;
                    int var6 = (var4 & 7) + this.field1458;
                    int var7 = arg2.method239();
                    int var8 = var7 >> 2;
                    int var9 = var7 & 3;
                    int var10 = this.field1383[var8];
                    int var11 = arg2.method241();
                    if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                        int var12 = this.field1415[this.field1607][var5][var6];
                        int var13 = this.field1415[this.field1607][var5 + 1][var6];
                        int var14 = this.field1415[this.field1607][var5 + 1][var6 + 1];
                        int var15 = this.field1415[this.field1607][var5][var6 + 1];
                        if (var10 == 0) {
                            Wall var16 = this.field1227.method86(this.field1607, var6, 815, var5);
                            if (var16 != null) {
                                int var17 = var16.field289 >> 14 & 32767;
                                if (var8 == 2) {
                                    var16.field287 = new LocEntity(1, var14, var12, var17, 2, var9 + 4, var15, var11, false, var13);
                                    var16.field288 = new LocEntity(1, var14, var12, var17, 2, var9 + 1 & 3, var15, var11, false, var13);
                                } else {
                                    var16.field287 = new LocEntity(1, var14, var12, var17, var8, var9, var15, var11, false, var13);
                                }
                            }
                        }
                        if (var10 == 1) {
                            Decor var18 = this.field1227.method87(this.field1634, var5, var6, this.field1607);
                            if (var18 != null) {
                                var18.field180 = new LocEntity(1, var14, var12, var18.field181 >> 14 & 32767, 4, 0, var15, var11, false, var13);
                            }
                        }
                        if (var10 == 2) {
                            Location var19 = this.field1227.method88(var5, this.field1607, var6, (byte) -110);
                            if (var8 == 11) {
                                var8 = 10;
                            }
                            if (var19 != null) {
                                var19.field272 = new LocEntity(1, var14, var12, var19.field280 >> 14 & 32767, var8, var9, var15, var11, false, var13);
                            }
                        }
                        if (var10 == 3) {
                            GroundDecor var20 = this.field1227.method89(false, var5, var6, this.field1607);
                            if (var20 != null) {
                                var20.field211 = new LocEntity(1, var14, var12, var20.field212 >> 14 & 32767, 22, var9, var15, var11, false, var13);
                            }
                        }
                    }
                } else if (arg0 == 120) {
                    int var21 = arg2.method239();
                    int var22 = (var21 >> 4 & 7) + this.field1457;
                    int var23 = (var21 & 7) + this.field1458;
                    int var24 = arg2.method241();
                    int var25 = arg2.method241();
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                        ObjStackEntity var26 = new ObjStackEntity();
                        var26.field501 = var24;
                        var26.field502 = var25;
                        if (this.field1616[this.field1607][var22][var23] == null) {
                            this.field1616[this.field1607][var22][var23] = new LinkList((byte) -118);
                        }
                        this.field1616[this.field1607][var22][var23].method255(var26);
                        this.method560(var22, var23);
                    }
                } else if (arg0 == 115) {
                    int var27 = arg2.method239();
                    int var28 = (var27 >> 4 & 7) + this.field1457;
                    int var29 = (var27 & 7) + this.field1458;
                    int var30 = arg2.method241();
                    if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                        LinkList var31 = this.field1616[this.field1607][var28][var29];
                        if (var31 != null) {
                            for (ObjStackEntity var32 = (ObjStackEntity) var31.method258(); var32 != null; var32 = (ObjStackEntity) var31.method260(-536)) {
                                if ((var30 & 32767) == var32.field501) {
                                    var32.method120();
                                    break;
                                }
                            }
                            if (var31.method258() == null) {
                                this.field1616[this.field1607][var28][var29] = null;
                            }
                            this.method560(var28, var29);
                        }
                    }
                } else if (arg0 == 37) {
                    int var33 = arg2.method239();
                    int var34 = (var33 >> 4 & 7) + this.field1457;
                    int var35 = (var33 & 7) + this.field1458;
                    int var36 = var34 + arg2.method240();
                    int var37 = var35 + arg2.method240();
                    int var38 = arg2.method242();
                    int var39 = arg2.method241();
                    int var40 = arg2.method239() * 4;
                    int var41 = arg2.method239() * 4;
                    int var42 = arg2.method241();
                    int var43 = arg2.method241();
                    int var44 = arg2.method239();
                    int var45 = arg2.method239();
                    if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                        int var46 = var34 * 128 + 64;
                        int var47 = var35 * 128 + 64;
                        int var48 = var36 * 128 + 64;
                        int var49 = var37 * 128 + 64;
                        ProjectileEntity var50 = new ProjectileEntity(var38, var47, var46, var44, field1618 + var42, var41, this.method542(this.field1479, var46, var47, this.field1607) - var40, var45, var39, this.field1607, field1618 + var43, true);
                        var50.method133(var48, field1618 + var42, this.method542(this.field1479, var48, var49, this.field1607) - var41, var49, (byte) 9);
                        this.field1588.method255(var50);
                    }
                } else if (arg0 == 114) {
                    int var51 = arg2.method239();
                    int var52 = (var51 >> 4 & 7) + this.field1457;
                    int var53 = (var51 & 7) + this.field1458;
                    int var54 = arg2.method241();
                    int var55 = arg2.method239();
                    int var56 = arg2.method241();
                    if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                        int var57 = var52 * 128 + 64;
                        int var58 = var53 * 128 + 64;
                        SpotAnimEntity var59 = new SpotAnimEntity(field1618, var54, this.field1607, this.method542(this.field1479, var57, var58, this.field1607) - var55, 535, var56, var57, var58);
                        this.field1341.method255(var59);
                    }
                } else if (arg0 == 8) {
                    int var60 = arg2.method239();
                    int var61 = (var60 >> 4 & 7) + this.field1457;
                    int var62 = (var60 & 7) + this.field1458;
                    int var63 = arg2.method241();
                    int var64 = arg2.method241();
                    int var65 = arg2.method241();
                    if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && this.field1243 != var65) {
                        ObjStackEntity var66 = new ObjStackEntity();
                        var66.field501 = var63;
                        var66.field502 = var64;
                        if (this.field1616[this.field1607][var61][var62] == null) {
                            this.field1616[this.field1607][var61][var62] = new LinkList((byte) -118);
                        }
                        this.field1616[this.field1607][var61][var62].method255(var66);
                        this.method560(var61, var62);
                    }
                } else {
                    if (arg0 == 218) {
                        int var67 = arg2.method239();
                        int var68 = (var67 >> 4 & 7) + this.field1457;
                        int var69 = (var67 & 7) + this.field1458;
                        int var70 = arg2.method239();
                        int var71 = var70 >> 2;
                        int var72 = var70 & 3;
                        int var73 = this.field1383[var71];
                        int var74 = arg2.method241();
                        int var75 = arg2.method241();
                        int var76 = arg2.method241();
                        int var77 = arg2.method241();
                        byte var78 = arg2.method240();
                        byte var79 = arg2.method240();
                        byte var80 = arg2.method240();
                        byte var81 = arg2.method240();
                        PlayerEntity var82;
                        if (this.field1243 == var77) {
                            var82 = field1642;
                        } else {
                            var82 = this.field1436[var77];
                        }
                        if (var82 != null) {
                            LocType var83 = LocType.method334(var74);
                            int var84 = this.field1415[this.field1607][var68][var69];
                            int var85 = this.field1415[this.field1607][var68 + 1][var69];
                            int var86 = this.field1415[this.field1607][var68 + 1][var69 + 1];
                            int var87 = this.field1415[this.field1607][var68][var69 + 1];
                            Model var88 = var83.method340(var71, var72, var84, var85, var86, var87, -1);
                            if (var88 != null) {
                                this.method474(var75 + 1, var73, this.field1459, this.field1607, var68, 0, var76 + 1, 0, var69, -1);
                                var82.field477 = field1618 + var75;
                                var82.field478 = field1618 + var76;
                                var82.field482 = var88;
                                int var89 = var83.field947;
                                int var90 = var83.field948;
                                if (var72 == 1 || var72 == 3) {
                                    var89 = var83.field948;
                                    var90 = var83.field947;
                                }
                                var82.field479 = var68 * 128 + var89 * 64;
                                var82.field481 = var69 * 128 + var90 * 64;
                                var82.field480 = this.method542(this.field1479, var82.field479, var82.field481, this.field1607);
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
                                var82.field483 = var68 + var78;
                                var82.field485 = var68 + var80;
                                var82.field484 = var69 + var79;
                                var82.field486 = var69 + var81;
                            }
                        }
                    }
                    if (arg0 == 98) {
                        int var93 = arg2.method239();
                        int var94 = (var93 >> 4 & 7) + this.field1457;
                        int var95 = (var93 & 7) + this.field1458;
                        int var96 = arg2.method241();
                        int var97 = arg2.method241();
                        int var98 = arg2.method241();
                        if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                            LinkList var99 = this.field1616[this.field1607][var94][var95];
                            if (var99 != null) {
                                for (ObjStackEntity var100 = (ObjStackEntity) var99.method258(); var100 != null; var100 = (ObjStackEntity) var99.method260(-536)) {
                                    if ((var96 & 32767) == var100.field501 && var100.field502 == var97) {
                                        var100.field502 = var98;
                                        break;
                                    }
                                }
                                this.method560(var94, var95);
                            }
                        }
                    }
                }
            } else {
                int var101 = arg2.method239();
                int var102 = (var101 >> 4 & 7) + this.field1457;
                int var103 = (var101 & 7) + this.field1458;
                int var104 = arg2.method239();
                int var105 = var104 >> 2;
                int var106 = var104 & 3;
                int var107 = this.field1383[var105];
                int var108;
                if (arg0 == 88) {
                    var108 = -1;
                } else {
                    var108 = arg2.method241();
                }
                if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                    this.method474(0, var107, this.field1459, this.field1607, var102, var105, -1, var106, var103, var108);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILob;)V")
    private final void method446(int arg0, LocSpawned arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = 0;
        int var5 = -1;
        int var6 = 0;
        int var7 = 0;
        if (arg1.field736 == 0) {
            var4 = this.field1227.method90(arg1.field735, arg1.field737, arg1.field738);
        }
        if (arg1.field736 == 1) {
            var4 = this.field1227.method91(arg1.field735, arg1.field738, true, arg1.field737);
        }
        if (arg1.field736 == 2) {
            var4 = this.field1227.method92(arg1.field735, arg1.field737, arg1.field738);
        }
        if (arg1.field736 == 3) {
            var4 = this.field1227.method93(arg1.field735, arg1.field737, arg1.field738);
        }
        if (var4 != 0) {
            int var8 = this.field1227.method94(arg1.field735, arg1.field737, arg1.field738, var4);
            var5 = var4 >> 14 & 32767;
            var6 = var8 & 31;
            var7 = var8 >> 6;
        }
        arg1.field739 = var5;
        arg1.field741 = var6;
        arg1.field740 = var7;
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)I")
    public final int method447(int arg0) {
        int var2 = 3;
        if (arg0 < 5 || arg0 > 5) {
            this.field1353 = 10;
        }
        if (this.field1512 < 310) {
            int var3 = this.field1509 >> 7;
            int var4 = this.field1511 >> 7;
            int var5 = field1642.field409 >> 7;
            int var6 = field1642.field410 >> 7;
            if ((this.field1230[this.field1607][var3][var4] & 4) != 0) {
                var2 = this.field1607;
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
                    if ((this.field1230[this.field1607][var3][var4] & 4) != 0) {
                        var2 = this.field1607;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field1230[this.field1607][var3][var4] & 4) != 0) {
                            var2 = this.field1607;
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
                    if ((this.field1230[this.field1607][var3][var4] & 4) != 0) {
                        var2 = this.field1607;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field1230[this.field1607][var3][var4] & 4) != 0) {
                            var2 = this.field1607;
                        }
                    }
                }
            }
        }
        if ((this.field1230[this.field1607][field1642.field409 >> 7][field1642.field410 >> 7] & 4) != 0) {
            var2 = this.field1607;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)I")
    public final int method448(int arg0) {
        int var2 = this.method542(this.field1479, this.field1509, this.field1511, this.field1607);
        if (arg0 != 0) {
            return this.field1460;
        } else {
            return var2 - this.field1510 < 800 && (this.field1230[this.field1607][this.field1509 >> 7][this.field1511 >> 7] & 4) != 0 ? this.field1607 : 3;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZI)V")
    public final void method449(int arg0, boolean arg1, int arg2) {
        signlink.midivol = arg2;
        if (arg0 < 3 || arg0 > 3) {
            this.field1633 = 484;
        }
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method450(int arg0) {
        if (this.field1401 > 0) {
            this.method525(0);
        } else {
            this.field1271.method268(false);
            if (arg0 >= 0) {
                this.field1241 = !this.field1241;
            }
            this.field1404.method214(257, "Connection lost", 0, 144, 0);
            this.field1404.method214(256, "Connection lost", 0, 143, 16777215);
            this.field1404.method214(257, "Please wait - attempting to reestablish", 0, 159, 0);
            this.field1404.method214(256, "Please wait - attempting to reestablish", 0, 158, 16777215);
            this.field1271.method269(super.field15, 4, false, 4);
            this.field1650 = 0;
            ClientStream var2 = this.field1205;
            this.field1448 = false;
            this.method439(this.field1585, this.field1586, true);
            if (!this.field1448) {
                this.method525(0);
            }
            try {
                var2.method38();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)Z")
    public final boolean method451(byte arg0) {
        if (this.field1342 != arg0) {
            this.field1461.method229(44);
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public final String method452(boolean arg0, int arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;B)V")
    private final void method453(int arg0, Packet arg1, byte arg2) {
        while (true) {
            if (arg1.field718 + 10 < arg0 * 8) {
                int var4 = arg1.method250(11, (byte) -20);
                if (var4 != 2047) {
                    if (this.field1436[var4] == null) {
                        this.field1436[var4] = new PlayerEntity();
                        if (this.field1441[var4] != null) {
                            this.field1436[var4].method130((byte) -76, this.field1441[var4]);
                        }
                    }
                    this.field1438[this.field1437++] = var4;
                    PlayerEntity var5 = this.field1436[var4];
                    var5.field454 = field1618;
                    int var6 = arg1.method250(5, (byte) -20);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg1.method250(5, (byte) -20);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg1.method250(1, (byte) -20);
                    var5.method124(var8 == 1, field1642.field460[0] + var7, field1642.field459[0] + var6, 3);
                    int var9 = arg1.method250(1, (byte) -20);
                    if (var9 == 1) {
                        this.field1440[this.field1439++] = var4;
                    }
                    continue;
                }
            }
            arg1.method251(980);
            if (arg2 != 4) {
                this.field1398 = -1;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method454(boolean arg0) {
        ProjectileEntity var2 = (ProjectileEntity) this.field1588.method258();
        if (arg0) {
            this.field1645 = this.field1514.method305();
        }
        while (var2 != null) {
            if (this.field1607 == var2.field506 && field1618 <= var2.field512) {
                if (field1618 >= var2.field511) {
                    if (var2.field515 > 0) {
                        NpcEntity var4 = this.field1426[var2.field515 - 1];
                        if (var4 != null && var4.field409 >= 0 && var4.field409 < 13312 && var4.field410 >= 0 && var4.field410 < 13312) {
                            var2.method133(var4.field409, field1618, this.method542(this.field1479, var4.field409, var4.field410, var2.field506) - var2.field510, var4.field410, (byte) 9);
                        }
                    }
                    if (var2.field515 < 0) {
                        int var5 = -var2.field515 - 1;
                        PlayerEntity var6;
                        if (this.field1243 == var5) {
                            var6 = field1642;
                        } else {
                            var6 = this.field1436[var5];
                        }
                        if (var6 != null && var6.field409 >= 0 && var6.field409 < 13312 && var6.field410 >= 0 && var6.field410 < 13312) {
                            var2.method133(var6.field409, field1618, this.method542(this.field1479, var6.field409, var6.field410, var2.field506) - var2.field510, var6.field410, (byte) 9);
                        }
                    }
                    var2.method134(this.field1257, (byte) 5);
                    this.field1227.method75(-1, (int) var2.field517, (int) var2.field519, var2, (int) var2.field518, this.field1607, 60, -769, false, var2.field525);
                }
            } else {
                var2.method120();
            }
            var2 = (ProjectileEntity) this.field1588.method260(-536);
        }
        ++field1635;
        if (field1635 > 1174) {
            field1635 = 0;
            this.field1461.method228(51, 0);
            this.field1461.method229(0);
            int var3 = this.field1461.field717;
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1461.method230(11499);
            }
            this.field1461.method230(10548);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1461.method229(139);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1461.method229(94);
            }
            this.field1461.method230(51693);
            this.field1461.method229(16);
            this.field1461.method230(15036);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1461.method229(65);
            }
            this.field1461.method229((int) (Math.random() * 256.0D));
            this.field1461.method230(22990);
            this.field1461.method238(this.field1461.field717 - var3, (byte) 7);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method455(boolean arg0) {
        if (this.field1272 == null) {
            this.method539(0);
            super.field16 = null;
            this.field1624 = null;
            this.field1625 = null;
            this.field1626 = null;
            this.field1627 = null;
            this.field1628 = null;
            this.field1629 = null;
            this.field1630 = null;
            if (arg0) {
                this.field1631 = null;
                this.field1632 = null;
                this.field1272 = new PixMap(479, 96, 0, this.method11(982));
                this.field1270 = new PixMap(172, 156, 0, this.method11(982));
                Pix2D.method168(this.field1241);
                this.field1339.method212(0, -48420, 0);
                this.field1269 = new PixMap(190, 261, 0, this.method11(982));
                this.field1271 = new PixMap(512, 334, 0, this.method11(982));
                Pix2D.method168(this.field1241);
                this.field1292 = new PixMap(496, 50, 0, this.method11(982));
                this.field1293 = new PixMap(269, 37, 0, this.method11(982));
                this.field1294 = new PixMap(249, 45, 0, this.method11(982));
                this.field1380 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBIIII)V")
    public final void method456(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field1227.method90(arg5, arg3, arg4);
        if (arg1 == -81) {
            if (var7 != 0) {
                int var8 = this.field1227.method94(arg5, arg3, arg4, var7);
                int var9 = var8 >> 6 & 3;
                int var10 = var8 & 31;
                int var11 = arg0;
                if (var7 > 0) {
                    var11 = arg2;
                }
                int[] var12 = this.field1652.field669;
                int var13 = (103 - arg4) * 512 * 4 + arg3 * 4 + 24624;
                int var14 = var7 >> 14 & 32767;
                LocType var15 = LocType.method334(var14);
                if (var15.field961 != -1) {
                    Pix8 var16 = this.field1454[var15.field961];
                    if (var16 != null) {
                        int var17 = (var15.field947 * 4 - var16.field684) / 2;
                        int var18 = (var15.field948 * 4 - var16.field685) / 2;
                        var16.method212(arg3 * 4 + 48 + var17, -48420, (104 - arg4 - var15.field948) * 4 + 48 + var18);
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
            int var19 = this.field1227.method92(arg5, arg3, arg4);
            if (var19 != 0) {
                int var20 = this.field1227.method94(arg5, arg3, arg4, var19);
                int var21 = var20 >> 6 & 3;
                int var22 = var20 & 31;
                int var23 = var19 >> 14 & 32767;
                LocType var24 = LocType.method334(var23);
                if (var24.field961 != -1) {
                    Pix8 var25 = this.field1454[var24.field961];
                    if (var25 != null) {
                        int var26 = (var24.field947 * 4 - var25.field684) / 2;
                        int var27 = (var24.field948 * 4 - var25.field685) / 2;
                        var25.method212(arg3 * 4 + 48 + var26, -48420, (104 - arg4 - var24.field948) * 4 + 48 + var27);
                    }
                } else if (var22 == 9) {
                    int var28 = 15658734;
                    if (var19 > 0) {
                        var28 = 15597568;
                    }
                    int[] var29 = this.field1652.field669;
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
            int var31 = this.field1227.method93(arg5, arg3, arg4);
            if (var31 != 0) {
                int var32 = var31 >> 14 & 32767;
                LocType var33 = LocType.method334(var32);
                if (var33.field961 != -1) {
                    Pix8 var34 = this.field1454[var33.field961];
                    if (var34 != null) {
                        int var35 = (var33.field947 * 4 - var34.field684) / 2;
                        int var36 = (var33.field948 * 4 - var34.field685) / 2;
                        var34.method212(arg3 * 4 + 48 + var35, -48420, (104 - arg4 - var33.field948) * 4 + 48 + var36);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 253);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1299 = Integer.parseInt(arg0[0]);
                field1300 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method480(12);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method470(0);
                }
                if (arg0[3].equals("free")) {
                    field1301 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1301 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(503, 3, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method457(int arg0) {
        int var2 = this.field1278;
        int var3 = this.field1279;
        int var4 = this.field1280;
        int var5 = this.field1281;
        int var6 = 6116423;
        Pix2D.method170(33027, var6, var4, var3, var5, var2);
        Pix2D.method170(33027, 0, var4 - 2, var3 + 1, 16, var2 + 1);
        Pix2D.method171(var5 - 19, var3 + 18, var2 + 1, var4 - 2, this.field1460, 0);
        if (arg0 >= 0) {
            this.field1645 = -276;
        }
        this.field1405.method217(var3 + 14, var6, false, "Choose Option", var2 + 3);
        int var7 = super.field23;
        int var8 = super.field24;
        if (this.field1277 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field1277 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field1277 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field1553; ++var9) {
            int var10 = (this.field1553 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field1405.method219(3, var11, true, this.field1655[var9], var10, var2 + 3);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method458(boolean arg0) {
        if (arg0) {
            this.method6();
        }
        if (super.field29 == 1) {
            if (super.field30 >= 6 && super.field30 <= 106 && super.field31 >= 467 && super.field31 <= 499) {
                this.field1214 = (this.field1214 + 1) % 4;
                this.field1528 = true;
                this.field1217 = true;
                this.field1461.method228(129, 0);
                this.field1461.method229(this.field1214);
                this.field1461.method229(this.field1497);
                this.field1461.method229(this.field1229);
            }
            if (super.field30 >= 135 && super.field30 <= 235 && super.field31 >= 467 && super.field31 <= 499) {
                this.field1497 = (this.field1497 + 1) % 3;
                this.field1528 = true;
                this.field1217 = true;
                this.field1461.method228(129, 0);
                this.field1461.method229(this.field1214);
                this.field1461.method229(this.field1497);
                this.field1461.method229(this.field1229);
            }
            if (super.field30 >= 273 && super.field30 <= 373 && super.field31 >= 467 && super.field31 <= 499) {
                this.field1229 = (this.field1229 + 1) % 3;
                this.field1528 = true;
                this.field1217 = true;
                this.field1461.method228(129, 0);
                this.field1461.method229(this.field1214);
                this.field1461.method229(this.field1497);
                this.field1461.method229(this.field1229);
            }
            if (super.field30 >= 412 && super.field30 <= 512 && super.field31 >= 467 && super.field31 <= 499) {
                this.method521((byte) 1);
                this.field1593 = "";
                this.field1362 = false;
                for (int var2 = 0; var2 < Component.field70.length; ++var2) {
                    if (Component.field70[var2] != null && Component.field70[var2].field79 == 600) {
                        this.field1332 = this.field1422 = Component.field70[var2].field76;
                        return;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method459(int arg0) {
        if (arg0 == -19212) {
            if (this.field1549 == 0) {
                int var2 = super.field29;
                if (this.field1263 == 1 && super.field30 >= 516 && super.field31 >= 160 && super.field30 <= 765 && super.field31 <= 205) {
                    var2 = 0;
                }
                if (this.field1432) {
                    if (var2 != 1) {
                        int var3 = super.field23;
                        int var4 = super.field24;
                        if (this.field1277 == 0) {
                            var3 -= 4;
                            var4 -= 4;
                        }
                        if (this.field1277 == 1) {
                            var3 -= 553;
                            var4 -= 205;
                        }
                        if (this.field1277 == 2) {
                            var3 -= 17;
                            var4 -= 357;
                        }
                        if (var3 < this.field1278 - 10 || var3 > this.field1280 + this.field1278 + 10 || var4 < this.field1279 - 10 || var4 > this.field1281 + this.field1279 + 10) {
                            this.field1432 = false;
                            if (this.field1277 == 1) {
                                this.field1372 = true;
                            }
                            if (this.field1277 == 2) {
                                this.field1217 = true;
                            }
                        }
                    }
                    if (var2 == 1) {
                        int var5 = this.field1278;
                        int var6 = this.field1279;
                        int var7 = this.field1280;
                        int var8 = super.field30;
                        int var9 = super.field31;
                        if (this.field1277 == 0) {
                            var8 -= 4;
                            var9 -= 4;
                        }
                        if (this.field1277 == 1) {
                            var8 -= 553;
                            var9 -= 205;
                        }
                        if (this.field1277 == 2) {
                            var8 -= 17;
                            var9 -= 357;
                        }
                        int var10 = -1;
                        for (int var11 = 0; var11 < this.field1553; ++var11) {
                            int var12 = (this.field1553 - 1 - var11) * 15 + var6 + 31;
                            if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                                var10 = var11;
                            }
                        }
                        if (var10 != -1) {
                            this.method526(8, var10);
                        }
                        this.field1432 = false;
                        if (this.field1277 == 1) {
                            this.field1372 = true;
                        }
                        if (this.field1277 == 2) {
                            this.field1217 = true;
                            return;
                        }
                    }
                } else {
                    if (var2 == 1 && this.field1553 > 0) {
                        int var13 = this.field1541[this.field1553 - 1];
                        if (var13 == 582 || var13 == 113 || var13 == 555 || var13 == 331 || var13 == 354 || var13 == 694 || var13 == 962 || var13 == 795 || var13 == 681 || var13 == 100 || var13 == 102 || var13 == 1328) {
                            int var14 = this.field1539[this.field1553 - 1];
                            int var15 = this.field1540[this.field1553 - 1];
                            Component var16 = Component.field70[var15];
                            if (var16.field97 || var16.field100) {
                                this.field1494 = false;
                                this.field1495 = 0;
                                this.field1547 = var15;
                                this.field1548 = var14;
                                this.field1549 = 2;
                                this.field1550 = super.field30;
                                this.field1551 = super.field31;
                                if (Component.field70[var15].field76 == this.field1422) {
                                    this.field1549 = 1;
                                }
                                if (Component.field70[var15].field76 == this.field1402) {
                                    this.field1549 = 3;
                                }
                                return;
                            }
                        }
                    }
                    if (var2 == 1 && (this.field1557 == 1 || this.method468(this.field1553 - 1, 0)) && this.field1553 > 2) {
                        var2 = 2;
                    }
                    if (var2 == 1 && this.field1553 > 0) {
                        this.method526(8, this.field1553 - 1);
                    }
                    if (var2 != 2 || this.field1553 <= 0) {
                        return;
                    }
                    this.method475(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method460(long arg0, int arg1) {
        if (arg1 != -27945) {
            this.method6();
        }
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1530; ++var4) {
                if (this.field1334[var4] == arg0) {
                    --this.field1530;
                    this.field1372 = true;
                    for (int var5 = var4; var5 < this.field1530; ++var5) {
                        this.field1334[var5] = this.field1334[var5 + 1];
                    }
                    this.field1461.method228(193, 0);
                    this.field1461.method235((byte) -58, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIZI)V")
    public final void method461(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = 2048 - arg4 & 2047;
        int var9 = 2048 - arg1 & 2047;
        if (arg5) {
            this.field1645 = 5;
        }
        int var10 = 0;
        int var11 = 0;
        int var12 = arg2;
        if (var8 != 0) {
            int var13 = Model.field608[var8];
            int var14 = Model.field609[var8];
            int var15 = var11 * var14 - arg2 * var13 >> 16;
            var12 = var11 * var13 + arg2 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field608[var9];
            int var17 = Model.field609[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1509 = arg0 - var10;
        this.field1510 = arg6 - var11;
        this.field1511 = arg3 - var12;
        this.field1512 = arg4;
        this.field1513 = arg1;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)V")
    public final void method462(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        int var5 = 0;
        for (int var6 = 0; var6 < 100; ++var6) {
            if (this.field1284[var6] != null) {
                int var7 = this.field1282[var6];
                int var8 = 70 - var5 * 14 + this.field1364 + 4;
                if (var8 < -20) {
                    break;
                }
                String var9 = this.field1283[var6];
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
                    ++var5;
                }
                if ((var7 == 1 || var7 == 2) && (var7 == 1 || this.field1214 == 0 || this.field1214 == 1 && this.method484(var9, 809))) {
                    if (arg0 > var8 - 14 && arg0 <= var8 && !var9.equals(field1642.field468)) {
                        if (this.field1563 >= 1) {
                            this.field1655[this.field1553] = "Report abuse @whi@" + var9;
                            this.field1541[this.field1553] = 524;
                            ++this.field1553;
                        }
                        this.field1655[this.field1553] = "Add ignore @whi@" + var9;
                        this.field1541[this.field1553] = 47;
                        ++this.field1553;
                        this.field1655[this.field1553] = "Add friend @whi@" + var9;
                        this.field1541[this.field1553] = 605;
                        ++this.field1553;
                    }
                    ++var5;
                }
                if ((var7 == 3 || var7 == 7) && this.field1556 == 0 && (var7 == 7 || this.field1497 == 0 || this.field1497 == 1 && this.method484(var9, 809))) {
                    if (arg0 > var8 - 14 && arg0 <= var8) {
                        if (this.field1563 >= 1) {
                            this.field1655[this.field1553] = "Report abuse @whi@" + var9;
                            this.field1541[this.field1553] = 524;
                            ++this.field1553;
                        }
                        this.field1655[this.field1553] = "Add ignore @whi@" + var9;
                        this.field1541[this.field1553] = 47;
                        ++this.field1553;
                        this.field1655[this.field1553] = "Add friend @whi@" + var9;
                        this.field1541[this.field1553] = 605;
                        ++this.field1553;
                    }
                    ++var5;
                }
                if (var7 == 4 && (this.field1229 == 0 || this.field1229 == 1 && this.method484(var9, 809))) {
                    if (arg0 > var8 - 14 && arg0 <= var8) {
                        this.field1655[this.field1553] = "Accept trade @whi@" + var9;
                        this.field1541[this.field1553] = 507;
                        ++this.field1553;
                    }
                    ++var5;
                }
                if ((var7 == 5 || var7 == 6) && this.field1556 == 0 && this.field1497 < 2) {
                    ++var5;
                }
                if (var7 == 8 && (this.field1229 == 0 || this.field1229 == 1 && this.method484(var9, 809))) {
                    if (arg0 > var8 - 14 && arg0 <= var8) {
                        this.field1655[this.field1553] = "Accept duel @whi@" + var9;
                        this.field1541[this.field1553] = 957;
                        ++this.field1553;
                    }
                    ++var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method463(boolean arg0) {
        if (arg0) {
            this.field1398 = this.field1418.method239();
        }
        if (this.field1527 == 2) {
            this.method494((this.field1201 - this.field1504 << 7) + this.field1204, this.field1202 * 2, (this.field1200 - this.field1503 << 7) + this.field1203, field1416);
            if (this.field1260 > -1 && field1618 % 20 < 10) {
                this.field1573[2].method199(this.field1260 - 12, -48420, this.field1261 - 28);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method464(String arg0) throws IOException {
        return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public final void method465(int arg0, String arg1, String arg2, int arg3) {
        if (arg3 == 0 && this.field1326 != -1) {
            this.field1346 = arg2;
            super.field29 = 0;
        }
        if (this.field1402 == -1) {
            this.field1217 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1282[var5] = this.field1282[var5 - 1];
            this.field1283[var5] = this.field1283[var5 - 1];
            this.field1284[var5] = this.field1284[var5 - 1];
        }
        this.field1282[0] = arg3;
        this.field1283[0] = arg1;
        while (arg0 >= 0) {
            this.field1461.method229(39);
        }
        this.field1284[0] = arg2;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;)V")
    public final void method13(int arg0, int arg1, String arg2) {
        this.field1324 = arg1;
        this.field1498 = arg2;
        this.method486(0);
        if (this.field1352 == null) {
            super.method13(0, arg1, arg2);
        } else {
            this.field1626.method268(false);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1405.method214(var4 / 2, "RuneScape is loading - please wait...", 0, var5 / 2 - 26 - var6, 16777215);
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method171(34, var7, var4 / 2 - 152, 304, this.field1460, 9179409);
            Pix2D.method171(32, var7 + 1, var4 / 2 - 151, 302, this.field1460, 0);
            Pix2D.method170(33027, 9179409, arg1 * 3, var7 + 2, 30, var4 / 2 - 150);
            Pix2D.method170(33027, 0, 300 - arg1 * 3, var7 + 2, 30, arg1 * 3 + (var4 / 2 - 150));
            this.field1405.method214(var4 / 2, arg2, 0, var5 / 2 + 5 - var6, 16777215);
            if (arg0 != 0) {
                this.method6();
            }
            this.field1626.method269(super.field15, 171, false, 202);
            if (this.field1380) {
                this.field1380 = false;
                if (!this.field1215) {
                    this.field1627.method269(super.field15, 0, false, 0);
                    this.field1628.method269(super.field15, 0, false, 637);
                }
                this.field1624.method269(super.field15, 0, false, 128);
                this.field1625.method269(super.field15, 371, false, 202);
                this.field1629.method269(super.field15, 265, false, 0);
                this.field1630.method269(super.field15, 265, false, 562);
                this.field1631.method269(super.field15, 171, false, 128);
                this.field1632.method269(super.field15, 171, false, 562);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)Z")
    public final boolean method466(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg2 >> 14 & 32767;
        int var7 = this.field1227.method94(this.field1607, arg4, arg1, arg2);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            ++field1325;
            if (field1325 > 1086) {
                field1325 = 0;
                this.field1461.method228(225, 0);
                this.field1461.method229(0);
                int var10 = this.field1461.field717;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1461.method230(16791);
                }
                this.field1461.method229(254);
                this.field1461.method230((int) (Math.random() * 65536.0D));
                this.field1461.method230(16128);
                this.field1461.method230(52610);
                this.field1461.method230((int) (Math.random() * 65536.0D));
                this.field1461.method230(55420);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1461.method230(35025);
                }
                this.field1461.method230(46628);
                this.field1461.method229((int) (Math.random() * 256.0D));
                this.field1461.method238(this.field1461.field717 - var10, (byte) 7);
            }
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method442(2, 0, field1642.field459[0], var9, arg1, false, field1642.field460[0], var8 + 1, 0, arg4, 0, 0);
            } else {
                LocType var11 = LocType.method334(var6);
                int var12;
                int var13;
                if (var9 != 0 && var9 != 2) {
                    var12 = var11.field948;
                    var13 = var11.field947;
                } else {
                    var12 = var11.field947;
                    var13 = var11.field948;
                }
                int var14 = var11.field970;
                if (var9 != 0) {
                    var14 = (var14 >> 4 - var9) + (var14 << var9 & 15);
                }
                this.method442(2, var14, field1642.field459[0], 0, arg1, false, field1642.field460[0], 0, 0, arg4, var13, var12);
            }
            this.field1610 = super.field30;
            this.field1611 = super.field31;
            this.field1613 = 2;
            this.field1612 = 0;
            this.field1461.method228(arg0, 0);
            this.field1397 += arg3;
            this.field1461.method230(this.field1503 + arg4);
            this.field1461.method230(this.field1504 + arg1);
            this.field1461.method230(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method467(int arg0) {
        ++this.field1606;
        this.method535(false, true);
        this.method555(true, false);
        this.method535(false, false);
        this.method555(false, false);
        this.method454(false);
        this.method537(6);
        if (!this.field1443) {
            int var2 = this.field1318;
            if (this.field1500 / 256 > var2) {
                var2 = this.field1500 / 256;
            }
            if (this.field1357[4] && this.field1198[4] + 128 > var2) {
                var2 = this.field1198[4] + 128;
            }
            int var3 = this.field1647 + this.field1319 & 2047;
            this.method461(this.field1329, var3, var2 * 3 + 600, this.field1330, var2, false, this.method542(this.field1479, field1642.field409, field1642.field410, this.field1607) - 50);
        }
        int var4;
        if (!this.field1443) {
            var4 = this.method447(5);
        } else {
            var4 = this.method448(0);
        }
        int var5 = this.field1509;
        int var6 = this.field1510;
        int var7 = this.field1511;
        int var8 = this.field1512;
        int var9 = this.field1513;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field1357[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field1315[var10] * 2 + 1) - (double) this.field1315[var10] + Math.sin((double) this.field1419[var10] / 100.0D * (double) this.field1656[var10]) * (double) this.field1198[var10]);
                if (var10 == 0) {
                    this.field1509 += var12;
                }
                if (var10 == 1) {
                    this.field1510 += var12;
                }
                if (var10 == 2) {
                    this.field1511 += var12;
                }
                if (var10 == 3) {
                    this.field1513 = this.field1513 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field1512 += var12;
                    if (this.field1512 < 128) {
                        this.field1512 = 128;
                    }
                    if (this.field1512 > 383) {
                        this.field1512 = 383;
                    }
                }
            }
        }
        int var11 = Pix3D.field661;
        Model.field603 = true;
        Model.field606 = 0;
        Model.field604 = super.field23 - 4;
        Model.field605 = super.field24 - 4;
        Pix2D.method168(this.field1241);
        this.field1227.method103(this.field1512, this.field1509, this.field1511, (byte) -1, this.field1513, this.field1510, var4);
        this.field1227.method78(265);
        this.method511((byte) 0);
        this.method463(false);
        if (arg0 >= 0) {
            this.method6();
        }
        this.method492(this.field1353, var11);
        this.method503(621);
        this.field1271.method269(super.field15, 4, false, 4);
        this.field1509 = var5;
        this.field1510 = var6;
        this.field1511 = var7;
        this.field1512 = var8;
        this.field1513 = var9;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)Z")
    public final boolean method468(int arg0, int arg1) {
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field1541[arg0];
            this.field1397 += arg1;
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 605;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLkb;)V")
    public final void method469(byte arg0, Pix8 arg1) {
        if (arg0 != 2) {
            this.field1398 = -1;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1576.length; ++var4) {
            this.field1576[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1576[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field1577[var16] = (this.field1576[var16 - 1] + this.field1576[var16 + 1] + this.field1576[var16 - 128] + this.field1576[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field1576;
            this.field1576 = this.field1577;
            this.field1577 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field685; ++var8) {
                for (int var9 = 0; var9 < arg1.field684; ++var9) {
                    if (arg1.field682[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field686;
                        int var11 = var8 + 16 + arg1.field687;
                        int var12 = (var11 << 7) + var10;
                        this.field1576[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1205 != null) {
                this.field1205.method38();
            }
        } catch (Exception var2) {
        }
        this.field1205 = null;
        this.method518(0);
        if (this.field1412 != null) {
            this.field1412.field977 = false;
        }
        this.field1412 = null;
        this.field1209.method281();
        this.field1209 = null;
        this.field1461 = null;
        this.field1363 = null;
        this.field1418 = null;
        this.field1474 = null;
        this.field1417 = null;
        this.field1395 = null;
        this.field1475 = null;
        this.field1476 = null;
        this.field1415 = null;
        this.field1230 = null;
        this.field1227 = null;
        this.field1637 = null;
        this.field1451 = null;
        this.field1381 = null;
        this.field1224 = null;
        this.field1225 = null;
        this.field1570 = null;
        this.field1269 = null;
        this.field1270 = null;
        this.field1271 = null;
        this.field1272 = null;
        this.field1292 = null;
        this.field1293 = null;
        this.field1294 = null;
        this.field1518 = null;
        this.field1519 = null;
        this.field1520 = null;
        this.field1521 = null;
        this.field1522 = null;
        this.field1523 = null;
        if (arg0) {
            this.field1398 = this.field1418.method239();
        }
        this.field1524 = null;
        this.field1525 = null;
        this.field1526 = null;
        this.field1338 = null;
        this.field1339 = null;
        this.field1340 = null;
        this.field1220 = null;
        this.field1221 = null;
        this.field1222 = null;
        this.field1396 = null;
        this.field1304 = null;
        this.field1305 = null;
        this.field1306 = null;
        this.field1307 = null;
        this.field1308 = null;
        this.field1462 = null;
        this.field1463 = null;
        this.field1464 = null;
        this.field1465 = null;
        this.field1466 = null;
        this.field1433 = null;
        this.field1333 = null;
        this.field1573 = null;
        this.field1456 = null;
        this.field1534 = null;
        this.field1535 = null;
        this.field1536 = null;
        this.field1537 = null;
        this.field1454 = null;
        this.field1348 = null;
        this.field1649 = null;
        this.field1436 = null;
        this.field1438 = null;
        this.field1440 = null;
        this.field1441 = null;
        this.field1312 = null;
        this.field1426 = null;
        this.field1428 = null;
        this.field1616 = null;
        this.field1569 = null;
        this.field1588 = null;
        this.field1341 = null;
        this.field1539 = null;
        this.field1540 = null;
        this.field1541 = null;
        this.field1542 = null;
        this.field1655 = null;
        this.field1361 = null;
        this.field1561 = null;
        this.field1562 = null;
        this.field1614 = null;
        this.field1652 = null;
        this.field1219 = null;
        this.field1385 = null;
        this.field1365 = null;
        this.field1627 = null;
        this.field1628 = null;
        this.field1624 = null;
        this.field1625 = null;
        this.field1626 = null;
        this.field1629 = null;
        this.field1630 = null;
        this.field1631 = null;
        this.field1632 = null;
        this.method539(0);
        LocType.method333(false);
        NpcType.method343(false);
        ObjType.method349(false);
        FloType.field1084 = null;
        IdkType.field1099 = null;
        Component.field70 = null;
        UnkType.field1106 = null;
        SeqType.field1121 = null;
        SpotAnimType.field1143 = null;
        SpotAnimType.field1155 = null;
        VarpType.field1164 = null;
        super.field16 = null;
        PlayerEntity.field489 = null;
        Pix3D.method177(false);
        World3D.method63(false);
        Model.method135(false);
        AnimFrame.method60(false);
        System.gc();
        if (Linkable.field377) {
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public static final void method470(int arg0) {
        if (arg0 != 0) {
            field1290 = 121;
        }
        World3D.field296 = false;
        Pix3D.field641 = false;
        field1302 = false;
        World.field43 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;)Z")
    public final boolean method471(int arg0, Component arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else {
            int var3 = arg1.field79;
            if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
                if (var3 >= 401 && var3 <= 500) {
                    this.field1655[this.field1553] = "Remove @whi@" + arg1.field111;
                    this.field1541[this.field1553] = 884;
                    ++this.field1553;
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
                this.field1655[this.field1553] = "Remove @whi@" + this.field1219[var3];
                this.field1541[this.field1553] = 513;
                ++this.field1553;
                this.field1655[this.field1553] = "Message @whi@" + this.field1219[var3];
                this.field1541[this.field1553] = 902;
                ++this.field1553;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method472(int arg0) {
        while (arg0 >= 0) {
            this.field1196 = !this.field1196;
        }
        this.field1322 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1566[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field1098; ++var3) {
                if (!IdkType.field1099[var3].field1105 && IdkType.field1099[var3].field1100 == var2 + (this.field1197 ? 0 : 7)) {
                    this.field1566[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method473(int arg0) {
        if (this.field1556 != 0) {
            int var2 = 0;
            if (this.field1303 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field1284[var3] != null) {
                    int var4 = this.field1282[var3];
                    String var5 = this.field1283[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field1497 == 0 || this.field1497 == 1 && this.method484(var5, 809))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field23 > 4 && super.field24 - 4 > var9 - 10 && super.field24 - 4 <= var9 + 3) {
                            int var10 = this.field1404.method216(false, "From:  " + var5 + this.field1284[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field23 < var10 + 4) {
                                if (this.field1563 >= 1) {
                                    this.field1655[this.field1553] = "Report abuse @whi@" + var5;
                                    this.field1541[this.field1553] = 2524;
                                    ++this.field1553;
                                }
                                this.field1655[this.field1553] = "Add ignore @whi@" + var5;
                                this.field1541[this.field1553] = 2047;
                                ++this.field1553;
                                this.field1655[this.field1553] = "Add friend @whi@" + var5;
                                this.field1541[this.field1553] = 2605;
                                ++this.field1553;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field1497 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 < 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        for (LocSpawned var12 = (LocSpawned) this.field1569.method258(); var12 != null; var12 = (LocSpawned) this.field1569.method260(-536)) {
            if (var12.field735 == arg3 && var12.field737 == arg4 && var12.field738 == arg8 && var12.field736 == arg1) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field735 = arg3;
            var11.field736 = arg1;
            var11.field737 = arg4;
            var11.field738 = arg8;
            this.method446(550, var11);
            this.field1569.method255(var11);
        }
        var11.field742 = arg9;
        var11.field744 = arg5;
        if (arg2 > 0) {
            var11.field743 = arg7;
            var11.field745 = arg0;
            var11.field746 = arg6;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method475(boolean arg0) {
        int var2 = this.field1405.method216(false, "Choose Option");
        for (int var3 = 0; var3 < this.field1553; ++var3) {
            int var11 = this.field1405.method216(false, this.field1655[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        if (!arg0) {
            this.field1398 = this.field1418.method239();
        }
        int var4 = this.field1553 * 15 + 21;
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
            this.field1432 = true;
            this.field1277 = 0;
            this.field1278 = var5;
            this.field1279 = var6;
            this.field1280 = var2;
            this.field1281 = this.field1553 * 15 + 22;
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
            this.field1432 = true;
            this.field1277 = 1;
            this.field1278 = var7;
            this.field1279 = var8;
            this.field1280 = var2;
            this.field1281 = this.field1553 * 15 + 22;
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
            this.field1432 = true;
            this.field1277 = 2;
            this.field1278 = var9;
            this.field1279 = var10;
            this.field1280 = var2;
            this.field1281 = this.field1553 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;BI)I")
    public final int method476(Component arg0, byte arg1, int arg2) {
        if (arg1 != 6) {
            this.method6();
        }
        if (arg0.field85 != null && arg2 < arg0.field85.length) {
            try {
                int[] var4 = arg0.field85[arg2];
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
                        var9 = this.field1517[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field1478[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field1211[var4[var6++]];
                    }
                    if (var8 == 4) {
                        Component var11 = Component.field70[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < ObjType.field1024 && (!ObjType.method350(var12).field1045 || field1301)) {
                            for (int var13 = 0; var13 < var11.field71.length; ++var13) {
                                if (var12 + 1 == var11.field71[var13]) {
                                    var9 += var11.field72[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field1361[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field1477[this.field1478[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field1361[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field1642.field474;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < Stats.field1137; ++var14) {
                            if (Stats.field1139[var14]) {
                                var9 += this.field1478[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        Component var15 = Component.field70[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < ObjType.field1024 && (!ObjType.method350(var16).field1045 || field1301)) {
                            for (int var17 = 0; var17 < var15.field71.length; ++var17) {
                                if (var15.field71[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field1350;
                    }
                    if (var8 == 12) {
                        var9 = this.field1351;
                    }
                    if (var8 == 13) {
                        int var18 = this.field1361[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        VarbitType var21 = VarbitType.field1157[var20];
                        int var22 = var21.field1159;
                        int var23 = var21.field1160;
                        int var24 = var21.field1161;
                        int var25 = field1489[var24 - var23];
                        var9 = this.field1361[var22] >> var23 & var25;
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
                        var9 = (field1642.field409 >> 7) + this.field1503;
                    }
                    if (var8 == 19) {
                        var9 = (field1642.field410 >> 7) + this.field1504;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method477(int arg0, boolean arg1) {
        signlink.wavevol = arg0;
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;Z)V")
    private final void method478(int arg0, Packet arg1, boolean arg2) {
        this.field1311 = 0;
        this.field1439 = 0;
        if (arg2) {
            this.method6();
        }
        this.method520(arg0, 2, arg1);
        this.method538(arg1, 0, arg0);
        this.method453(arg0, arg1, this.field1559);
        this.method532(arg0, true, arg1);
        for (int var4 = 0; var4 < this.field1311; ++var4) {
            int var6 = this.field1312[var4];
            if (field1618 != this.field1436[var6].field454) {
                this.field1436[var6] = null;
            }
        }
        if (arg1.field717 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field717 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1437; ++var5) {
                if (this.field1436[this.field1438[var5]] == null) {
                    signlink.reporterror(this.field1585 + " null entry in pl list - pos:" + var5 + " size:" + this.field1437);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    private static final String method479(int arg0, int arg1) {
        if (arg1 <= 0) {
            field1416 = !field1416;
        }
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public static final void method480(int arg0) {
        World3D.field296 = true;
        Pix3D.field641 = true;
        field1302 = true;
        int var1 = 89 / arg0;
        World.field43 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILmb;)V")
    private final void method481(boolean arg0, int arg1, Packet arg2) {
        arg2.method249((byte) 2);
        int var4 = arg2.method250(8, (byte) -20);
        if (var4 < this.field1427) {
            for (int var5 = var4; var5 < this.field1427; ++var5) {
                this.field1312[this.field1311++] = this.field1428[var5];
            }
        }
        if (var4 > this.field1427) {
            signlink.reporterror(this.field1585 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1427 = 0;
            this.field1448 &= arg0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1428[var6];
                NpcEntity var8 = this.field1426[var7];
                int var9 = arg2.method250(1, (byte) -20);
                if (var9 == 0) {
                    this.field1428[this.field1427++] = var7;
                    var8.field454 = field1618;
                } else {
                    int var10 = arg2.method250(2, (byte) -20);
                    if (var10 == 0) {
                        this.field1428[this.field1427++] = var7;
                        var8.field454 = field1618;
                        this.field1440[this.field1439++] = var7;
                    } else if (var10 == 1) {
                        this.field1428[this.field1427++] = var7;
                        var8.field454 = field1618;
                        int var11 = arg2.method250(3, (byte) -20);
                        var8.method125(this.field1633, var11, false);
                        int var12 = arg2.method250(1, (byte) -20);
                        if (var12 == 1) {
                            this.field1440[this.field1439++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1428[this.field1427++] = var7;
                        var8.field454 = field1618;
                        int var13 = arg2.method250(3, (byte) -20);
                        var8.method125(this.field1633, var13, true);
                        int var14 = arg2.method250(3, (byte) -20);
                        var8.method125(this.field1633, var14, true);
                        int var15 = arg2.method250(1, (byte) -20);
                        if (var15 == 1) {
                            this.field1440[this.field1439++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1312[this.field1311++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method482(int arg0) {
        short var2 = 256;
        if (arg0 >= 0) {
            this.field1393 = this.field1514.method305();
        }
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1408[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1408[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1409[var14] = (this.field1408[var14 - 1] + this.field1408[var14 + 1] + this.field1408[var14 - 128] + this.field1408[var14 + 128]) / 4;
            }
        }
        this.field1608 += 128;
        if (this.field1608 > this.field1576.length) {
            this.field1608 -= this.field1576.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method469((byte) 2, this.field1237[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field1409[var11 + 128] - this.field1576[this.field1608 + var11 & this.field1576.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field1408[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field1493[var8] = this.field1493[var8 + 1];
        }
        this.field1493[var2 - 1] = (int) (Math.sin((double) field1618 / 14.0D) * 16.0D + Math.sin((double) field1618 / 15.0D) * 14.0D + Math.sin((double) field1618 / 16.0D) * 12.0D);
        if (this.field1581 > 0) {
            this.field1581 -= 4;
        }
        if (this.field1582 > 0) {
            this.field1582 -= 4;
        }
        if (this.field1581 == 0 && this.field1582 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field1581 = 1024;
            }
            if (var9 == 1) {
                this.field1582 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    private final void method483(boolean arg0) {
        this.field1448 &= arg0;
        if (this.field1568 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1569.method258(); var2 != null; var2 = (LocSpawned) this.field1569.method260(-536)) {
                if (var2.field746 > 0) {
                    --var2.field746;
                }
                if (var2.field746 == 0) {
                    if (var2.field739 < 0 || World.method30(var2.field741, var2.field739, false)) {
                        this.method510(var2.field741, var2.field738, -642, var2.field736, var2.field740, var2.field737, var2.field739, var2.field735);
                        var2.method120();
                    }
                } else {
                    if (var2.field745 > 0) {
                        --var2.field745;
                    }
                    if (var2.field745 == 0 && var2.field737 >= 1 && var2.field738 >= 1 && var2.field737 <= 102 && var2.field738 <= 102 && (var2.field742 < 0 || World.method30(var2.field744, var2.field742, false))) {
                        this.method510(var2.field744, var2.field738, -642, var2.field736, var2.field743, var2.field737, var2.field742, var2.field735);
                        var2.field745 = -1;
                        if (var2.field742 == var2.field739 && var2.field739 == -1) {
                            var2.method120();
                        } else if (var2.field742 == var2.field739 && var2.field743 == var2.field740 && var2.field744 == var2.field741) {
                            var2.method120();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method484(String arg0, int arg1) {
        int var3 = 24 / arg1;
        if (arg0 == null) {
            return false;
        } else {
            for (int var4 = 0; var4 < this.field1491; ++var4) {
                if (arg0.equalsIgnoreCase(this.field1219[var4])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(field1642.field468);
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method485(int arg0) {
        if (arg0 != 2) {
            this.field1616 = null;
        }
        if (this.field1646 == 0) {
            int var2 = super.field13 / 2 - 80;
            int var3 = super.field14 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field29 == 1 && super.field30 >= var2 - 75 && super.field30 <= var2 + 75 && super.field31 >= var14 - 20 && super.field31 <= var14 + 20) {
                this.field1646 = 3;
                this.field1407 = 0;
            }
            int var4 = super.field13 / 2 + 80;
            if (super.field29 == 1 && super.field30 >= var4 - 75 && super.field30 <= var4 + 75 && super.field31 >= var14 - 20 && super.field31 <= var14 + 20) {
                this.field1212 = "";
                this.field1213 = "Enter your username & password.";
                this.field1646 = 2;
                this.field1407 = 0;
            }
        } else if (this.field1646 == 2) {
            int var5 = super.field14 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field29 == 1 && super.field31 >= var16 - 15 && super.field31 < var16) {
                this.field1407 = 0;
            }
            var5 = var16 + 15;
            if (super.field29 == 1 && super.field31 >= var5 - 15 && super.field31 < var5) {
                this.field1407 = 1;
            }
            var5 += 15;
            int var6 = super.field13 / 2 - 80;
            int var7 = super.field14 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field29 == 1 && super.field30 >= var6 - 75 && super.field30 <= var6 + 75 && super.field31 >= var17 - 20 && super.field31 <= var17 + 20) {
                this.method439(this.field1585, this.field1586, false);
                if (this.field1448) {
                    return;
                }
            }
            int var8 = super.field13 / 2 + 80;
            if (super.field29 == 1 && super.field30 >= var8 - 75 && super.field30 <= var8 + 75 && super.field31 >= var17 - 20 && super.field31 <= var17 + 20) {
                this.field1646 = 0;
                this.field1585 = "";
                this.field1586 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5(716);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1382.length(); ++var11) {
                        if (var9 == field1382.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1407 == 0) {
                        if (var9 == 8 && this.field1585.length() > 0) {
                            this.field1585 = this.field1585.substring(0, this.field1585.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1407 = 1;
                        }
                        if (var10) {
                            this.field1585 = this.field1585 + (char) var9;
                        }
                        if (this.field1585.length() > 12) {
                            this.field1585 = this.field1585.substring(0, 12);
                        }
                    } else if (this.field1407 == 1) {
                        if (var9 == 8 && this.field1586.length() > 0) {
                            this.field1586 = this.field1586.substring(0, this.field1586.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1407 = 0;
                        }
                        if (var10) {
                            this.field1586 = this.field1586 + (char) var9;
                        }
                        if (this.field1586.length() > 20) {
                            this.field1586 = this.field1586.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1646 == 3) {
                int var12 = super.field13 / 2;
                int var13 = super.field14 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field29 == 1 && super.field30 >= var12 - 75 && super.field30 <= var12 + 75 && super.field31 >= var18 - 20 && super.field31 <= var18 + 20) {
                    this.field1646 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method486(int arg0) {
        if (this.field1624 == null) {
            super.field16 = null;
            this.field1272 = null;
            this.field1270 = null;
            this.field1269 = null;
            this.field1271 = null;
            this.field1292 = null;
            this.field1293 = null;
            this.field1294 = null;
            this.field1627 = new PixMap(128, 265, 0, this.method11(982));
            Pix2D.method168(this.field1241);
            this.field1628 = new PixMap(128, 265, 0, this.method11(982));
            Pix2D.method168(this.field1241);
            this.field1624 = new PixMap(509, 171, 0, this.method11(982));
            Pix2D.method168(this.field1241);
            this.field1625 = new PixMap(360, 132, 0, this.method11(982));
            Pix2D.method168(this.field1241);
            this.field1626 = new PixMap(360, 200, 0, this.method11(982));
            if (arg0 != 0) {
                this.field1398 = -1;
            }
            Pix2D.method168(this.field1241);
            this.field1629 = new PixMap(202, 238, 0, this.method11(982));
            Pix2D.method168(this.field1241);
            this.field1630 = new PixMap(203, 238, 0, this.method11(982));
            Pix2D.method168(this.field1241);
            this.field1631 = new PixMap(74, 94, 0, this.method11(982));
            Pix2D.method168(this.field1241);
            this.field1632 = new PixMap(75, 94, 0, this.method11(982));
            Pix2D.method168(this.field1241);
            if (this.field1352 != null) {
                this.method523(0);
                this.method443((byte) 5);
            }
            this.field1380 = true;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method487(byte arg0) {
        if (arg0 != 13) {
            this.field1256 = !this.field1256;
        }
        if (super.field29 == 1) {
            int var2 = super.field30 - 25 - 550;
            int var3 = super.field31 - 5 - 4;
            if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                var2 -= 73;
                var3 -= 75;
                int var4 = this.field1374 + this.field1319 & 2047;
                int var5 = Pix3D.field650[var4];
                int var6 = Pix3D.field651[var4];
                int var7 = (this.field1446 + 256) * var5 >> 8;
                int var8 = (this.field1446 + 256) * var6 >> 8;
                int var9 = var2 * var8 + var3 * var7 >> 11;
                int var10 = var3 * var8 - var2 * var7 >> 11;
                int var11 = field1642.field409 + var9 >> 7;
                int var12 = field1642.field410 - var10 >> 7;
                boolean var13 = this.method442(1, 0, field1642.field459[0], 0, var12, true, field1642.field460[0], 0, 0, var11, 0, 0);
                if (var13) {
                    this.field1461.method229(var2);
                    this.field1461.method229(var3);
                    this.field1461.method230(this.field1319);
                    this.field1461.method229(57);
                    this.field1461.method229(this.field1374);
                    this.field1461.method229(this.field1446);
                    this.field1461.method229(89);
                    this.field1461.method230(field1642.field409);
                    this.field1461.method230(field1642.field410);
                    this.field1461.method229(this.field1578);
                    this.field1461.method229(63);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        if (signlink.sunjava) {
            super.field9 = 5;
        }
        if (field1579) {
            this.field1344 = true;
        } else {
            field1579 = true;
            boolean var1 = false;
            String var2 = this.method554(-757);
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
                this.field1572 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1558[var3] = new FileStream((byte) 61, signlink.cache_dat, signlink.cache_idx[var3], 500000, var3 + 1);
                    }
                }
                try {
                    int var4 = 5;
                    this.field1445[8] = 0;
                    while (this.field1445[8] == 0) {
                        this.method13(0, 20, "Connecting to web server");
                        try {
                            DataInputStream var5 = this.method464("crc" + (int) (Math.random() * 9.9999999E7D));
                            Packet var6 = new Packet(16, new byte[36]);
                            var5.readFully(var6.field716, 0, 36);
                            for (int var7 = 0; var7 < 9; ++var7) {
                                this.field1445[var7] = var6.method244();
                            }
                            var5.close();
                        } catch (IOException var80) {
                            for (int var8 = var4; var8 > 0; --var8) {
                                this.method13(0, 10, "Error loading - Will retry in " + var8 + " secs.");
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
                    this.field1352 = this.method513("title", "title screen", this.field1445[1], 1, false, 25);
                    this.field1403 = new PixFont(this.field1352, "p11", (byte) 7);
                    this.field1404 = new PixFont(this.field1352, "p12", (byte) 7);
                    this.field1405 = new PixFont(this.field1352, "b12", (byte) 7);
                    this.field1406 = new PixFont(this.field1352, "q8", (byte) 7);
                    this.method523(0);
                    this.method443((byte) 5);
                    Jagfile var9 = this.method513("config", "config", this.field1445[2], 2, false, 30);
                    Jagfile var10 = this.method513("interface", "interface", this.field1445[3], 3, false, 35);
                    Jagfile var11 = this.method513("media", "2d graphics", this.field1445[4], 4, false, 40);
                    Jagfile var12 = this.method513("textures", "textures", this.field1445[6], 6, false, 45);
                    Jagfile var13 = this.method513("wordenc", "chat system", this.field1445[7], 7, false, 50);
                    Jagfile var14 = this.method513("sounds", "sound effects", this.field1445[8], 8, false, 55);
                    this.field1230 = new byte[4][104][104];
                    this.field1415 = new int[4][105][105];
                    this.field1227 = new World3D(104, (byte) 4, 4, this.field1415, 104);
                    for (int var15 = 0; var15 < 4; ++var15) {
                        this.field1637[var15] = new CollisionMap((byte) 1, 104, 104);
                    }
                    this.field1652 = new Pix32(512, 512);
                    Jagfile var16 = this.method513("versionlist", "update list", this.field1445[5], 5, false, 60);
                    this.method13(0, 60, "Connecting to update server");
                    this.field1209 = new OnDemand();
                    this.field1209.method280(var16, this);
                    AnimFrame.method58(this.field1209.method283(3));
                    Model.method136(this.field1209.method282(0, (byte) 3), this.field1209);
                    if (!field1302) {
                        this.field1596 = 0;
                        this.field1597 = false;
                        this.field1209.method289(2, this.field1596);
                        while (this.field1209.method290() > 0) {
                            this.method519(83);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var74) {
                            }
                        }
                    }
                    this.method13(0, 65, "Requesting animations");
                    int var17 = this.field1209.method282(1, (byte) 3);
                    for (int var18 = 0; var18 < var17; ++var18) {
                        this.field1209.method289(1, var18);
                    }
                    while (this.field1209.method290() > 0) {
                        int var19 = var17 - this.field1209.method290();
                        if (var19 > 0) {
                            this.method13(0, 65, "Loading animations - " + var19 * 100 / var17 + "%");
                        }
                        this.method519(83);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var73) {
                        }
                    }
                    this.method13(0, 70, "Requesting models");
                    int var20 = this.field1209.method282(0, (byte) 3);
                    for (int var21 = 0; var21 < var20; ++var21) {
                        int var22 = this.field1209.method287(var21, (byte) 1);
                        if ((var22 & 1) != 0) {
                            this.field1209.method289(0, var21);
                        }
                    }
                    int var23 = this.field1209.method290();
                    while (this.field1209.method290() > 0) {
                        int var24 = var23 - this.field1209.method290();
                        if (var24 > 0) {
                            this.method13(0, 70, "Loading models - " + var24 * 100 / var23 + "%");
                        }
                        this.method519(83);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var72) {
                        }
                    }
                    if (this.field1558[0] != null) {
                        this.method13(0, 75, "Requesting maps");
                        this.field1209.method289(3, this.field1209.method284(31009, 47, 48, 0));
                        this.field1209.method289(3, this.field1209.method284(31009, 47, 48, 1));
                        this.field1209.method289(3, this.field1209.method284(31009, 48, 48, 0));
                        this.field1209.method289(3, this.field1209.method284(31009, 48, 48, 1));
                        this.field1209.method289(3, this.field1209.method284(31009, 49, 48, 0));
                        this.field1209.method289(3, this.field1209.method284(31009, 49, 48, 1));
                        this.field1209.method289(3, this.field1209.method284(31009, 47, 47, 0));
                        this.field1209.method289(3, this.field1209.method284(31009, 47, 47, 1));
                        this.field1209.method289(3, this.field1209.method284(31009, 48, 47, 0));
                        this.field1209.method289(3, this.field1209.method284(31009, 48, 47, 1));
                        this.field1209.method289(3, this.field1209.method284(31009, 48, 148, 0));
                        this.field1209.method289(3, this.field1209.method284(31009, 48, 148, 1));
                        int var25 = this.field1209.method290();
                        while (this.field1209.method290() > 0) {
                            int var26 = var25 - this.field1209.method290();
                            if (var26 > 0) {
                                this.method13(0, 75, "Loading maps - " + var26 * 100 / var25 + "%");
                            }
                            this.method519(83);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                        }
                    }
                    int var27 = this.field1209.method282(0, (byte) 3);
                    for (int var28 = 0; var28 < var27; ++var28) {
                        int var29 = this.field1209.method287(var28, (byte) 1);
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
                            this.field1209.method292(0, var28, var30, 33601);
                        }
                    }
                    this.field1209.method285(field1301, false);
                    if (!field1302) {
                        int var31 = this.field1209.method282(2, (byte) 3);
                        for (int var32 = 1; var32 < var31; ++var32) {
                            if (this.field1209.method288(-31662, var32)) {
                                this.field1209.method292(2, var32, (byte) 1, 33601);
                            }
                        }
                    }
                    this.method13(0, 80, "Unpacking media");
                    this.field1338 = new Pix8(var11, "invback", 0);
                    this.field1340 = new Pix8(var11, "chatback", 0);
                    this.field1339 = new Pix8(var11, "mapback", 0);
                    this.field1220 = new Pix8(var11, "backbase1", 0);
                    this.field1221 = new Pix8(var11, "backbase2", 0);
                    this.field1222 = new Pix8(var11, "backhmid1", 0);
                    for (int var33 = 0; var33 < 13; ++var33) {
                        this.field1396[var33] = new Pix8(var11, "sideicons", var33);
                    }
                    this.field1433 = new Pix32(var11, "compass", 0);
                    this.field1584 = new Pix32(var11, "mapedge", 0);
                    this.field1584.method196(true);
                    try {
                        for (int var34 = 0; var34 < 50; ++var34) {
                            this.field1454[var34] = new Pix8(var11, "mapscene", var34);
                        }
                    } catch (Exception var79) {
                    }
                    try {
                        for (int var35 = 0; var35 < 50; ++var35) {
                            this.field1348[var35] = new Pix32(var11, "mapfunction", var35);
                        }
                    } catch (Exception var78) {
                    }
                    try {
                        for (int var36 = 0; var36 < 20; ++var36) {
                            this.field1333[var36] = new Pix32(var11, "hitmarks", var36);
                        }
                    } catch (Exception var77) {
                    }
                    try {
                        for (int var37 = 0; var37 < 20; ++var37) {
                            this.field1573[var37] = new Pix32(var11, "headicons", var37);
                        }
                    } catch (Exception var76) {
                    }
                    this.field1258 = new Pix32(var11, "mapmarker", 0);
                    this.field1259 = new Pix32(var11, "mapmarker", 1);
                    for (int var38 = 0; var38 < 8; ++var38) {
                        this.field1456[var38] = new Pix32(var11, "cross", var38);
                    }
                    this.field1534 = new Pix32(var11, "mapdots", 0);
                    this.field1535 = new Pix32(var11, "mapdots", 1);
                    this.field1536 = new Pix32(var11, "mapdots", 2);
                    this.field1537 = new Pix32(var11, "mapdots", 3);
                    this.field1574 = new Pix8(var11, "scrollbar", 0);
                    this.field1575 = new Pix8(var11, "scrollbar", 1);
                    this.field1304 = new Pix8(var11, "redstone1", 0);
                    this.field1305 = new Pix8(var11, "redstone2", 0);
                    this.field1306 = new Pix8(var11, "redstone3", 0);
                    this.field1307 = new Pix8(var11, "redstone1", 0);
                    this.field1307.method209((byte) 0);
                    this.field1308 = new Pix8(var11, "redstone2", 0);
                    this.field1308.method209((byte) 0);
                    this.field1462 = new Pix8(var11, "redstone1", 0);
                    this.field1462.method210(551);
                    this.field1463 = new Pix8(var11, "redstone2", 0);
                    this.field1463.method210(551);
                    this.field1464 = new Pix8(var11, "redstone3", 0);
                    this.field1464.method210(551);
                    this.field1465 = new Pix8(var11, "redstone1", 0);
                    this.field1465.method209((byte) 0);
                    this.field1465.method210(551);
                    this.field1466 = new Pix8(var11, "redstone2", 0);
                    this.field1466.method209((byte) 0);
                    this.field1466.method210(551);
                    for (int var39 = 0; var39 < 2; ++var39) {
                        this.field1444[var39] = new Pix8(var11, "mod_icons", var39);
                    }
                    Pix32 var40 = new Pix32(var11, "backleft1", 0);
                    this.field1518 = new PixMap(var40.field670, var40.field671, 0, this.method11(982));
                    var40.method197((byte) 0, 0, 0);
                    Pix32 var41 = new Pix32(var11, "backleft2", 0);
                    this.field1519 = new PixMap(var41.field670, var41.field671, 0, this.method11(982));
                    var41.method197((byte) 0, 0, 0);
                    Pix32 var42 = new Pix32(var11, "backright1", 0);
                    this.field1520 = new PixMap(var42.field670, var42.field671, 0, this.method11(982));
                    var42.method197((byte) 0, 0, 0);
                    Pix32 var43 = new Pix32(var11, "backright2", 0);
                    this.field1521 = new PixMap(var43.field670, var43.field671, 0, this.method11(982));
                    var43.method197((byte) 0, 0, 0);
                    Pix32 var44 = new Pix32(var11, "backtop1", 0);
                    this.field1522 = new PixMap(var44.field670, var44.field671, 0, this.method11(982));
                    var44.method197((byte) 0, 0, 0);
                    Pix32 var45 = new Pix32(var11, "backvmid1", 0);
                    this.field1523 = new PixMap(var45.field670, var45.field671, 0, this.method11(982));
                    var45.method197((byte) 0, 0, 0);
                    Pix32 var46 = new Pix32(var11, "backvmid2", 0);
                    this.field1524 = new PixMap(var46.field670, var46.field671, 0, this.method11(982));
                    var46.method197((byte) 0, 0, 0);
                    Pix32 var47 = new Pix32(var11, "backvmid3", 0);
                    this.field1525 = new PixMap(var47.field670, var47.field671, 0, this.method11(982));
                    var47.method197((byte) 0, 0, 0);
                    Pix32 var48 = new Pix32(var11, "backhmid2", 0);
                    this.field1526 = new PixMap(var48.field670, var48.field671, 0, this.method11(982));
                    var48.method197((byte) 0, 0, 0);
                    int var49 = (int) (Math.random() * 21.0D) - 10;
                    int var50 = (int) (Math.random() * 21.0D) - 10;
                    int var51 = (int) (Math.random() * 21.0D) - 10;
                    int var52 = (int) (Math.random() * 41.0D) - 20;
                    for (int var53 = 0; var53 < 50; ++var53) {
                        if (this.field1348[var53] != null) {
                            this.field1348[var53].method195(var49 + var52, var50 + var52, var51 + var52, 320);
                        }
                        if (this.field1454[var53] != null) {
                            this.field1454[var53].method211(var49 + var52, var50 + var52, var51 + var52, 320);
                        }
                    }
                    this.method13(0, 83, "Unpacking textures");
                    Pix3D.method182(-984, var12);
                    Pix3D.method186(-208, 0.8D);
                    Pix3D.method181(20, (byte) 3);
                    this.method13(0, 86, "Unpacking config");
                    SeqType.method383(true, var9);
                    LocType.method332(var9);
                    FloType.method373(true, var9);
                    ObjType.method348(var9);
                    NpcType.method342(var9);
                    IdkType.method377(true, var9);
                    SpotAnimType.method386(true, var9);
                    VarpType.method391(true, var9);
                    VarbitType.method389(true, var9);
                    ObjType.field1029 = field1301;
                    if (!field1302) {
                        this.method13(0, 90, "Unpacking sounds");
                        byte[] var54 = var14.method309("sounds.dat", (byte[]) null);
                        Packet var55 = new Packet(16, var54);
                        Wave.method322(true, var55);
                    }
                    this.method13(0, 95, "Unpacking interfaces");
                    PixFont[] var56 = new PixFont[] { this.field1403, this.field1404, this.field1405, this.field1406 };
                    Component.method32(var10, var56, true, var11);
                    this.method13(0, 100, "Preparing game engine");
                    for (int var57 = 0; var57 < 33; ++var57) {
                        int var58 = 999;
                        int var59 = 0;
                        for (int var60 = 0; var60 < 34; ++var60) {
                            if (this.field1339.field682[this.field1339.field684 * var57 + var60] == 0) {
                                if (var58 == 999) {
                                    var58 = var60;
                                }
                            } else if (var58 != 999) {
                                var59 = var60;
                                break;
                            }
                        }
                        this.field1545[var57] = var58;
                        this.field1501[var57] = var59 - var58;
                    }
                    for (int var61 = 5; var61 < 156; ++var61) {
                        int var62 = 999;
                        int var63 = 0;
                        for (int var64 = 25; var64 < 172; ++var64) {
                            if (this.field1339.field682[this.field1339.field684 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
                                if (var62 == 999) {
                                    var62 = var64;
                                }
                            } else if (var62 != 999) {
                                var63 = var64;
                                break;
                            }
                        }
                        this.field1354[var61 - 5] = var62 - 25;
                        this.field1291[var61 - 5] = var63 - var62;
                    }
                    Pix3D.method179(96, 921, 479);
                    this.field1620 = Pix3D.field652;
                    Pix3D.method179(261, 921, 190);
                    this.field1621 = Pix3D.field652;
                    Pix3D.method179(334, 921, 512);
                    this.field1622 = Pix3D.field652;
                    int[] var65 = new int[9];
                    for (int var66 = 0; var66 < 9; ++var66) {
                        int var67 = var66 * 32 + 128 + 15;
                        int var68 = var67 * 3 + 600;
                        int var69 = Pix3D.field650[var67];
                        var65[var66] = var68 * var69 >> 16;
                    }
                    World3D.method100(512, 800, 0, 500, 334, var65);
                    WordFilter.method393(var13);
                    this.field1412 = new MouseTracking(field1580, this);
                } catch (Exception var81) {
                    signlink.reporterror("loaderror " + this.field1498 + " " + this.field1324);
                    this.field1609 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method488(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg2;
        if (arg1 != 38951) {
            this.field1317 = !this.field1317;
        }
        return ((arg0 & 16711935) * var5 + (arg3 & 16711935) * arg2 & -16711936) + ((arg0 & 65280) * var5 + (arg3 & 65280) * arg2 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method489(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (field1302 && this.field1568 == 2 && World.field44 != this.field1607) {
            this.field1271.method268(false);
            this.field1404.method214(257, "Loading - please wait.", 0, 151, 0);
            this.field1404.method214(256, "Loading - please wait.", 0, 150, 16777215);
            this.field1271.method269(super.field15, 4, false, 4);
            this.field1568 = 1;
            this.field1377 = System.currentTimeMillis();
        }
        if (this.field1568 == 1) {
            int var3 = this.method490((byte) -15);
            if (var3 != 0 && System.currentTimeMillis() - this.field1377 > 360000L) {
                signlink.reporterror(this.field1585 + " glcfb " + this.field1449 + "," + var3 + "," + field1302 + "," + this.field1558[0] + "," + this.field1209.method290() + "," + this.field1607 + "," + this.field1390 + "," + this.field1391);
                this.field1377 = System.currentTimeMillis();
            }
        }
        if (this.field1568 == 2 && this.field1607 != this.field1595) {
            this.field1595 = this.field1607;
            this.method441((byte) 8, this.field1607);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)I")
    public final int method490(byte arg0) {
        for (int var2 = 0; var2 < this.field1417.length; ++var2) {
            if (this.field1417[var2] == null && this.field1475[var2] != -1) {
                return -1;
            }
            if (this.field1395[var2] == null && this.field1476[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1417.length; ++var4) {
            byte[] var5 = this.field1395[var4];
            if (var5 != null) {
                int var6 = (this.field1474[var4] >> 8) * 64 - this.field1503;
                int var7 = (this.field1474[var4] & 255) * 64 - this.field1504;
                var3 &= World.method16(var5, var7, 1, var6);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field1242) {
            return -4;
        } else {
            this.field1568 = 2;
            if (arg0 != -15) {
                this.field1502 = this.field1514.method305();
            }
            World.field44 = this.field1607;
            this.method556(false);
            this.field1461.method228(134, 0);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method491(byte arg0) {
        if (this.field1549 == 0) {
            this.field1655[0] = "Cancel";
            this.field1541[0] = 1106;
            this.field1553 = 1;
            this.method473(-812);
            this.field1360 = 0;
            if (super.field23 > 4 && super.field24 > 4 && super.field23 < 516 && super.field24 < 338) {
                if (this.field1422 != -1) {
                    this.method434(4, (byte) -75, Component.field70[this.field1422], super.field24, 0, 4, super.field23);
                } else {
                    this.method541(0);
                }
            }
            if (this.field1360 != this.field1296) {
                this.field1296 = this.field1360;
            }
            this.field1360 = 0;
            if (super.field23 > 553 && super.field24 > 205 && super.field23 < 743 && super.field24 < 466) {
                if (this.field1394 != -1) {
                    this.method434(553, (byte) -75, Component.field70[this.field1394], super.field24, 0, 205, super.field23);
                } else if (this.field1499[this.field1386] != -1) {
                    this.method434(553, (byte) -75, Component.field70[this.field1499[this.field1386]], super.field24, 0, 205, super.field23);
                }
            }
            if (this.field1442 != this.field1360) {
                this.field1372 = true;
                this.field1442 = this.field1360;
            }
            this.field1360 = 0;
            if (this.field1274 == arg0) {
                boolean var2 = false;
            } else {
                this.field1373 = 383;
            }
            if (super.field23 > 17 && super.field24 > 357 && super.field23 < 496 && super.field24 < 453) {
                if (this.field1402 != -1) {
                    this.method434(17, (byte) -75, Component.field70[this.field1402], super.field24, 0, 357, super.field23);
                } else if (super.field24 < 434 && super.field23 < 426) {
                    this.method462(super.field24 - 357, super.field23 - 17, this.field1244);
                }
            }
            if (this.field1402 != -1 && this.field1376 != this.field1360) {
                this.field1217 = true;
                this.field1376 = this.field1360;
            }
            boolean var3 = false;
            while (!var3) {
                var3 = true;
                for (int var4 = 0; var4 < this.field1553 - 1; ++var4) {
                    if (this.field1541[var4] < 1000 && this.field1541[var4 + 1] > 1000) {
                        String var5 = this.field1655[var4];
                        this.field1655[var4] = this.field1655[var4 + 1];
                        this.field1655[var4 + 1] = var5;
                        int var6 = this.field1541[var4];
                        this.field1541[var4] = this.field1541[var4 + 1];
                        this.field1541[var4 + 1] = var6;
                        int var7 = this.field1539[var4];
                        this.field1539[var4] = this.field1539[var4 + 1];
                        this.field1539[var4 + 1] = var7;
                        int var8 = this.field1540[var4];
                        this.field1540[var4] = this.field1540[var4 + 1];
                        this.field1540[var4 + 1] = var8;
                        int var9 = this.field1542[var4];
                        this.field1542[var4] = this.field1542[var4 + 1];
                        this.field1542[var4 + 1] = var9;
                        var3 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method492(int arg0, int arg1) {
        if (arg0 < 8 || arg0 > 8) {
            this.field1616 = null;
        }
        if (!field1302) {
            if (Pix3D.field660[17] >= arg1) {
                Pix8 var3 = Pix3D.field654[17];
                int var4 = var3.field685 * var3.field684 - 1;
                int var5 = this.field1257 * var3.field684 * 2;
                byte[] var6 = var3.field682;
                byte[] var7 = this.field1570;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field682 = var7;
                this.field1570 = var6;
                Pix3D.method184(2, 17);
            }
            if (Pix3D.field660[24] >= arg1) {
                Pix8 var9 = Pix3D.field654[24];
                int var10 = var9.field685 * var9.field684 - 1;
                int var11 = this.field1257 * var9.field684 * 2;
                byte[] var12 = var9.field682;
                byte[] var13 = this.field1570;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field682 = var13;
                this.field1570 = var12;
                Pix3D.method184(2, 24);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;BI)V")
    public final void method493(PathingEntity arg0, byte arg1, int arg2) {
        if (arg1 == 8) {
            boolean var4 = false;
            this.method494(arg0.field410, arg2, arg0.field409, field1416);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIZ)V")
    public final void method494(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
            int var5 = this.method542(this.field1479, arg2, arg0, this.field1607) - arg1;
            int var6 = arg2 - this.field1509;
            int var7 = var5 - this.field1510;
            int var8 = arg0 - this.field1511;
            int var9 = Model.field608[this.field1512];
            int var10 = Model.field609[this.field1512];
            int var11 = Model.field608[this.field1513];
            int var12 = Model.field609[this.field1513];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            if (!arg3) {
                int var16 = var7 * var10 - var9 * var14 >> 16;
                int var17 = var7 * var9 + var10 * var14 >> 16;
                if (var17 >= 50) {
                    this.field1260 = (var13 << 9) / var17 + Pix3D.field646;
                    this.field1261 = (var16 << 9) / var17 + Pix3D.field647;
                } else {
                    this.field1260 = -1;
                    this.field1261 = -1;
                }
            }
        } else {
            this.field1260 = -1;
            this.field1261 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZJ)V")
    public final void method495(boolean arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1491 >= 100 && this.field1450 != 1) {
                this.method465(-547, "", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
            } else if (this.field1491 >= 200) {
                this.method465(-547, "", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
            } else {
                String var4 = JString.method314(true, JString.method311((byte) -49, arg1));
                for (int var5 = 0; var5 < this.field1491; ++var5) {
                    if (this.field1385[var5] == arg1) {
                        this.method465(-547, "", var4 + " is already on your friend list", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1530; ++var6) {
                    if (this.field1334[var6] == arg1) {
                        this.method465(-547, "", "Please remove " + var4 + " from your ignore list first", 0);
                        return;
                    }
                }
                if (!var4.equals(field1642.field468)) {
                    this.field1219[this.field1491] = var4;
                    if (!arg0) {
                        this.field1634 = -358;
                    }
                    this.field1385[this.field1491] = arg1;
                    this.field1365[this.field1491] = 0;
                    ++this.field1491;
                    this.field1372 = true;
                    this.field1461.method228(9, 0);
                    this.field1461.method235((byte) -58, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method496(byte arg0) {
        this.field1615 = 0;
        if (arg0 != -4) {
            this.method6();
        }
        int var2 = (field1642.field409 >> 7) + this.field1503;
        int var3 = (field1642.field410 >> 7) + this.field1504;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1615 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1615 = 1;
        }
        if (this.field1615 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1615 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method497(boolean arg0) {
        this.field1272.method268(false);
        Pix3D.field652 = this.field1620;
        this.field1340.method212(0, -48420, 0);
        if (this.field1653) {
            this.field1405.method214(239, this.field1496, 0, 40, 0);
            this.field1405.method214(239, this.field1636 + "*", 0, 60, 128);
        } else if (this.field1594) {
            this.field1405.method214(239, "Enter amount:", 0, 40, 0);
            this.field1405.method214(239, this.field1640 + "*", 0, 60, 128);
        } else if (this.field1346 != null) {
            this.field1405.method214(239, this.field1346, 0, 40, 0);
            this.field1405.method214(239, "Click to continue", 0, 60, 128);
        } else if (this.field1402 != -1) {
            this.method543(false, 0, 0, Component.field70[this.field1402], 0);
        } else if (this.field1326 != -1) {
            this.method543(false, 0, 0, Component.field70[this.field1326], 0);
        } else {
            PixFont var2 = this.field1404;
            int var3 = 0;
            Pix2D.method167(0, 0, 77, 0, 463);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1284[var4] != null) {
                    int var6 = this.field1282[var4];
                    int var7 = 70 - var3 * 14 + this.field1364;
                    String var8 = this.field1283[var4];
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
                            var2.method217(var7, 0, false, this.field1284[var4], 4);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1214 == 0 || this.field1214 == 1 && this.method484(var8, 809))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field1444[0].method212(var10, -48420, var7 - 12);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field1444[1].method212(var10, -48420, var7 - 12);
                                var10 += 14;
                            }
                            var2.method217(var7, 0, false, var8 + ":", var10);
                            int var11 = var10 + var2.method216(false, var8) + 8;
                            var2.method217(var7, 255, false, this.field1284[var4], var11);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field1556 == 0 && (var6 == 7 || this.field1497 == 0 || this.field1497 == 1 && this.method484(var8, 809))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method217(var7, 0, false, "From", var12);
                            int var13 = var12 + var2.method216(false, "From ");
                            if (var9 == 1) {
                                this.field1444[0].method212(var13, -48420, var7 - 12);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field1444[1].method212(var13, -48420, var7 - 12);
                                var13 += 14;
                            }
                            var2.method217(var7, 0, false, var8 + ":", var13);
                            int var14 = var13 + var2.method216(false, var8) + 8;
                            var2.method217(var7, 8388608, false, this.field1284[var4], var14);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field1229 == 0 || this.field1229 == 1 && this.method484(var8, 809))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method217(var7, 8388736, false, var8 + " " + this.field1284[var4], 4);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field1556 == 0 && this.field1497 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method217(var7, 8388608, false, this.field1284[var4], 4);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field1556 == 0 && this.field1497 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method217(var7, 0, false, "To " + var8 + ":", 4);
                            var2.method217(var7, 8388608, false, this.field1284[var4], 12 + var2.method216(false, "To " + var8));
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field1229 == 0 || this.field1229 == 1 && this.method484(var8, 809))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method217(var7, 8270336, false, var8 + " " + this.field1284[var4], 4);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method166(false);
            this.field1516 = var3 * 14 + 7;
            if (this.field1516 < 78) {
                this.field1516 = 78;
            }
            this.method508(this.field1516 - this.field1364 - 77, 0, -11192, 77, this.field1516, 463);
            String var5;
            if (field1642 != null && field1642.field468 != null) {
                var5 = field1642.field468;
            } else {
                var5 = JString.method314(true, this.field1585);
            }
            var2.method217(90, 0, false, var5 + ":", 4);
            var2.method217(90, 255, false, this.field1210 + "*", 6 + var2.method216(false, var5 + ": "));
            Pix2D.method173(0, 77, -25370, 479, 0);
        }
        if (this.field1432 && this.field1277 == 2) {
            this.method457(-419);
        }
        this.field1272.method269(super.field15, 357, false, 17);
        this.field1271.method268(false);
        Pix3D.field652 = this.field1622;
        if (!arg0) {
            this.field1479 = !this.field1479;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILbb;Lmb;)V")
    private final void method498(int arg0, int arg1, int arg2, PlayerEntity arg3, Packet arg4) {
        if (arg0 == 1) {
            if ((arg2 & 1) == 1) {
                int var6 = arg4.method239();
                byte[] var7 = new byte[var6];
                Packet var8 = new Packet(16, var7);
                arg4.method248(var6, var7, 0, -22245);
                this.field1441[arg1] = var8;
                arg3.method130((byte) -76, var8);
            }
            if ((arg2 & 2) == 2) {
                int var9 = arg4.method241();
                if (var9 == 65535) {
                    var9 = -1;
                }
                if (arg3.field437 == var9) {
                    arg3.field441 = 0;
                }
                int var10 = arg4.method239();
                if (arg3.field437 == var9 && var9 != -1) {
                    int var11 = SeqType.field1121[var9].field1135;
                    if (var11 == 1) {
                        arg3.field438 = 0;
                        arg3.field439 = 0;
                        arg3.field440 = var10;
                        arg3.field441 = 0;
                    }
                    if (var11 == 2) {
                        arg3.field441 = 0;
                    }
                } else if (var9 == -1 || arg3.field437 == -1 || SeqType.field1121[var9].field1129 >= SeqType.field1121[arg3.field437].field1129) {
                    arg3.field437 = var9;
                    arg3.field438 = 0;
                    arg3.field439 = 0;
                    arg3.field440 = var10;
                    arg3.field441 = 0;
                    arg3.field463 = arg3.field458;
                }
            }
            if ((arg2 & 4) == 4) {
                arg3.field431 = arg4.method241();
                if (arg3.field431 == 65535) {
                    arg3.field431 = -1;
                }
            }
            if ((arg2 & 8) == 8) {
                arg3.field421 = arg4.method246();
                arg3.field423 = 0;
                arg3.field424 = 0;
                arg3.field422 = 150;
                this.method465(-547, arg3.field468, arg3.field421, 2);
            }
            if ((arg2 & 16) == 16) {
                int var12 = arg4.method239();
                int var13 = arg4.method239();
                arg3.method128(var13, (byte) 7, var12);
                arg3.field428 = field1618 + 300;
                arg3.field429 = arg4.method239();
                arg3.field430 = arg4.method239();
            }
            if ((arg2 & 32) == 32) {
                arg3.field432 = arg4.method241();
                arg3.field433 = arg4.method241();
            }
            if ((arg2 & 64) == 64) {
                int var14 = arg4.method241();
                int var15 = arg4.method239();
                int var16 = arg4.method239();
                int var17 = arg4.field717;
                if (arg3.field468 != null && arg3.field469) {
                    long var18 = JString.method310(arg3.field468);
                    boolean var20 = false;
                    if (var15 <= 1) {
                        for (int var21 = 0; var21 < this.field1530; ++var21) {
                            if (this.field1334[var21] == var18) {
                                var20 = true;
                                break;
                            }
                        }
                    }
                    if (!var20 && this.field1615 == 0) {
                        try {
                            String var22 = WordPack.method317(var16, arg4, this.field1604);
                            String var23 = WordFilter.method403(var22, false);
                            arg3.field421 = var23;
                            arg3.field423 = var14 >> 8;
                            arg3.field424 = var14 & 255;
                            arg3.field422 = 150;
                            if (var15 != 2 && var15 != 3) {
                                if (var15 == 1) {
                                    this.method465(-547, "@cr1@" + arg3.field468, var23, 1);
                                } else {
                                    this.method465(-547, arg3.field468, var23, 2);
                                }
                            } else {
                                this.method465(-547, "@cr2@" + arg3.field468, var23, 1);
                            }
                        } catch (Exception var28) {
                            signlink.reporterror("cde2");
                        }
                    }
                }
                arg4.field717 = var16 + var17;
            }
            if ((arg2 & 256) == 256) {
                arg3.field442 = arg4.method241();
                int var25 = arg4.method244();
                arg3.field446 = var25 >> 16;
                arg3.field445 = (var25 & 65535) + field1618;
                arg3.field443 = 0;
                arg3.field444 = 0;
                if (arg3.field445 > field1618) {
                    arg3.field443 = -1;
                }
                if (arg3.field442 == 65535) {
                    arg3.field442 = -1;
                }
            }
            if ((arg2 & 512) == 512) {
                arg3.field447 = arg4.method239();
                arg3.field449 = arg4.method239();
                arg3.field448 = arg4.method239();
                arg3.field450 = arg4.method239();
                arg3.field451 = arg4.method241() + field1618;
                arg3.field452 = arg4.method241() + field1618;
                arg3.field453 = arg4.method239();
                arg3.method126(-404);
            }
            if ((arg2 & 1024) == 1024) {
                int var26 = arg4.method239();
                int var27 = arg4.method239();
                arg3.method128(var27, (byte) 7, var26);
                arg3.field428 = field1618 + 300;
                arg3.field429 = arg4.method239();
                arg3.field430 = arg4.method239();
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method9(int arg0) {
        if (!this.field1344 && !this.field1609 && !this.field1572) {
            ++field1389;
            if (!this.field1448) {
                this.method432(false, false);
            } else {
                this.method552(this.field1598);
            }
            this.field1207 = 0;
            int var2 = 29 / arg0;
        } else {
            this.method534((byte) -40);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method499(boolean arg0) {
        this.field1448 &= arg0;
        for (int var2 = -1; var2 < this.field1437; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field1435;
            } else {
                var3 = this.field1438[var2];
            }
            PlayerEntity var4 = this.field1436[var3];
            if (var4 != null) {
                this.method546(var4, -101, 1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method500(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)Z")
    public final boolean method501(boolean arg0) {
        if (arg0) {
            this.field1398 = this.field1418.method239();
        }
        if (this.field1205 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1205.method40();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1398 == -1) {
                    this.field1205.method41(this.field1418.field716, 0, 1);
                    this.field1398 = this.field1418.field716[0] & 255;
                    if (this.field1514 != null) {
                        this.field1398 = this.field1398 - this.field1514.method305() & 255;
                    }
                    this.field1397 = Protocol.field1072[this.field1398];
                    --var2;
                }
                if (this.field1397 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1205.method41(this.field1418.field716, 0, 1);
                    this.field1397 = this.field1418.field716[0] & 255;
                    --var2;
                }
                if (this.field1397 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1205.method41(this.field1418.field716, 0, 2);
                    this.field1418.field717 = 0;
                    this.field1397 = this.field1418.method241();
                    var2 -= 2;
                }
                if (var2 < this.field1397) {
                    return false;
                }
                this.field1418.field717 = 0;
                this.field1205.method41(this.field1418.field716, 0, this.field1397);
                this.field1399 = 0;
                this.field1488 = this.field1487;
                this.field1487 = this.field1486;
                this.field1486 = this.field1398;
                if (this.field1398 == 186) {
                    int var3 = this.field1418.method241();
                    byte var4 = this.field1418.method240();
                    this.field1431[var3] = var4;
                    if (this.field1361[var3] != var4) {
                        this.field1361[var3] = var4;
                        this.method559(var3, 4363);
                        this.field1372 = true;
                        if (this.field1326 != -1) {
                            this.field1217 = true;
                        }
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 29) {
                    Packet var5 = InputTracking.method47(this.field1543);
                    if (var5 != null) {
                        this.field1461.method228(142, 0);
                        this.field1461.method230(var5.field717);
                        this.field1461.method237(0, var5.field717, false, var5.field716);
                        var5.method227(0);
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 64) {
                    this.field1527 = this.field1418.method239();
                    if (this.field1527 == 1) {
                        this.field1617 = this.field1418.method241();
                    }
                    if (this.field1527 >= 2 && this.field1527 <= 6) {
                        if (this.field1527 == 2) {
                            this.field1203 = 64;
                            this.field1204 = 64;
                        }
                        if (this.field1527 == 3) {
                            this.field1203 = 0;
                            this.field1204 = 64;
                        }
                        if (this.field1527 == 4) {
                            this.field1203 = 128;
                            this.field1204 = 64;
                        }
                        if (this.field1527 == 5) {
                            this.field1203 = 64;
                            this.field1204 = 0;
                        }
                        if (this.field1527 == 6) {
                            this.field1203 = 64;
                            this.field1204 = 128;
                        }
                        this.field1527 = 2;
                        this.field1200 = this.field1418.method241();
                        this.field1201 = this.field1418.method241();
                        this.field1202 = this.field1418.method239();
                    }
                    if (this.field1527 == 10) {
                        this.field1336 = this.field1418.method241();
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 146) {
                    this.field1355 = this.field1418.method244();
                    this.field1587 = this.field1418.method241();
                    this.field1423 = this.field1418.method239();
                    this.field1567 = this.field1418.method241();
                    this.field1276 = this.field1418.method239();
                    if (this.field1355 != 0 && this.field1422 == -1) {
                        signlink.dnslookup(JString.method313(3, this.field1355));
                        this.method521((byte) 1);
                        short var6 = 650;
                        if (this.field1423 != 201 || this.field1276 == 1) {
                            var6 = 655;
                        }
                        this.field1593 = "";
                        this.field1362 = false;
                        for (int var7 = 0; var7 < Component.field70.length; ++var7) {
                            if (Component.field70[var7] != null && Component.field70[var7].field79 == var6) {
                                this.field1422 = Component.field70[var7].field76;
                                break;
                            }
                        }
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 227) {
                    int var8 = this.field1418.method241();
                    boolean var9 = this.field1418.method239() == 1;
                    Component.field70[var8].field91 = var9;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 136) {
                    this.field1372 = true;
                    int var10 = this.field1418.method239();
                    int var11 = this.field1418.method244();
                    int var12 = this.field1418.method239();
                    this.field1211[var10] = var11;
                    this.field1517[var10] = var12;
                    this.field1478[var10] = 1;
                    for (int var13 = 0; var13 < 98; ++var13) {
                        if (var11 >= field1477[var13]) {
                            this.field1478[var10] = var13 + 2;
                        }
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 164) {
                    if (this.field1386 == 12) {
                        this.field1372 = true;
                    }
                    this.field1351 = this.field1418.method242();
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 140) {
                    for (int var14 = 0; var14 < this.field1361.length; ++var14) {
                        if (this.field1431[var14] != this.field1361[var14]) {
                            this.field1361[var14] = this.field1431[var14];
                            this.method559(var14, 4363);
                            this.field1372 = true;
                        }
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 14) {
                    int var15 = this.field1418.method241();
                    int var16 = this.field1418.method241();
                    Component var17 = Component.field70[var15];
                    if (var17 != null && var17.field77 == 0) {
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        if (var16 > var17.field89 - var17.field81) {
                            var16 = var17.field89 - var17.field81;
                        }
                        var17.field90 = var16;
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 87) {
                    this.method478(this.field1397, this.field1418, this.field1196);
                    this.field1242 = false;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 159) {
                    this.field1457 = this.field1418.method239();
                    this.field1458 = this.field1418.method239();
                    for (int var18 = this.field1457; var18 < this.field1457 + 8; ++var18) {
                        for (int var19 = this.field1458; var19 < this.field1458 + 8; ++var19) {
                            if (this.field1616[this.field1607][var18][var19] != null) {
                                this.field1616[this.field1607][var18][var19] = null;
                                this.method560(var18, var19);
                            }
                        }
                    }
                    for (LocSpawned var20 = (LocSpawned) this.field1569.method258(); var20 != null; var20 = (LocSpawned) this.field1569.method260(-536)) {
                        if (var20.field737 >= this.field1457 && var20.field737 < this.field1457 + 8 && var20.field738 >= this.field1458 && var20.field738 < this.field1458 + 8 && this.field1607 == var20.field735) {
                            var20.field746 = 0;
                        }
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 251) {
                    InputTracking.method44(5);
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 111) {
                    long var21 = this.field1418.method245(6);
                    int var23 = this.field1418.method239();
                    String var24 = JString.method314(true, JString.method311((byte) -49, var21));
                    for (int var25 = 0; var25 < this.field1491; ++var25) {
                        if (this.field1385[var25] == var21) {
                            if (this.field1365[var25] != var23) {
                                this.field1365[var25] = var23;
                                this.field1372 = true;
                                if (var23 > 0) {
                                    this.method465(-547, "", var24 + " has logged in.", 5);
                                }
                                if (var23 == 0) {
                                    this.method465(-547, "", var24 + " has logged out.", 5);
                                }
                            }
                            var24 = null;
                            break;
                        }
                    }
                    if (var24 != null && this.field1491 < 200) {
                        this.field1385[this.field1491] = var21;
                        this.field1219[this.field1491] = var24;
                        this.field1365[this.field1491] = var23;
                        ++this.field1491;
                        this.field1372 = true;
                    }
                    boolean var26 = false;
                    while (!var26) {
                        var26 = true;
                        for (int var27 = 0; var27 < this.field1491 - 1; ++var27) {
                            if (this.field1365[var27] != field1299 && this.field1365[var27 + 1] == field1299 || this.field1365[var27] == 0 && this.field1365[var27 + 1] != 0) {
                                int var28 = this.field1365[var27];
                                this.field1365[var27] = this.field1365[var27 + 1];
                                this.field1365[var27 + 1] = var28;
                                String var29 = this.field1219[var27];
                                this.field1219[var27] = this.field1219[var27 + 1];
                                this.field1219[var27 + 1] = var29;
                                long var30 = this.field1385[var27];
                                this.field1385[var27] = this.field1385[var27 + 1];
                                this.field1385[var27 + 1] = var30;
                                this.field1372 = true;
                                var26 = false;
                            }
                        }
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 5) {
                    this.field1653 = false;
                    this.field1594 = true;
                    this.field1640 = "";
                    this.field1217 = true;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 203) {
                    for (int var32 = 0; var32 < this.field1436.length; ++var32) {
                        if (this.field1436[var32] != null) {
                            this.field1436[var32].field437 = -1;
                        }
                    }
                    for (int var33 = 0; var33 < this.field1426.length; ++var33) {
                        if (this.field1426[var33] != null) {
                            this.field1426[var33].field437 = -1;
                        }
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 73) {
                    String var34 = this.field1418.method246();
                    if (var34.endsWith(":tradereq:")) {
                        String var35 = var34.substring(0, var34.indexOf(":"));
                        long var36 = JString.method310(var35);
                        boolean var38 = false;
                        for (int var39 = 0; var39 < this.field1530; ++var39) {
                            if (this.field1334[var39] == var36) {
                                var38 = true;
                                break;
                            }
                        }
                        if (!var38 && this.field1615 == 0) {
                            this.method465(-547, var35, "wishes to trade with you.", 4);
                        }
                    } else if (!var34.endsWith(":duelreq:")) {
                        this.method465(-547, "", var34, 0);
                    } else {
                        String var40 = var34.substring(0, var34.indexOf(":"));
                        long var41 = JString.method310(var40);
                        boolean var43 = false;
                        for (int var44 = 0; var44 < this.field1530; ++var44) {
                            if (this.field1334[var44] == var41) {
                                var43 = true;
                                break;
                            }
                        }
                        if (!var43 && this.field1615 == 0) {
                            this.method465(-547, var40, "wishes to duel with you.", 8);
                        }
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 24) {
                    this.field1214 = this.field1418.method239();
                    this.field1497 = this.field1418.method239();
                    this.field1229 = this.field1418.method239();
                    this.field1528 = true;
                    this.field1217 = true;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 63) {
                    this.field1530 = this.field1397 / 8;
                    for (int var45 = 0; var45 < this.field1530; ++var45) {
                        this.field1334[var45] = this.field1418.method245(6);
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 58) {
                    this.field1275 = this.field1418.method239();
                    if (this.field1386 == this.field1275) {
                        if (this.field1275 == 3) {
                            this.field1386 = 1;
                        } else {
                            this.field1386 = 3;
                        }
                        this.field1372 = true;
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 95) {
                    int var46 = this.field1418.method241();
                    int var47 = this.field1418.method242();
                    Component var48 = Component.field70[var46];
                    var48.field123 = var47;
                    if (var47 == -1) {
                        var48.field73 = 0;
                        var48.field74 = 0;
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 170) {
                    this.field1372 = true;
                    int var49 = this.field1418.method241();
                    Component var50 = Component.field70[var49];
                    while (this.field1418.field717 < this.field1397) {
                        int var51 = this.field1418.method239();
                        int var52 = this.field1418.method241();
                        int var53 = this.field1418.method239();
                        if (var53 == 255) {
                            var53 = this.field1418.method244();
                        }
                        if (var51 >= 0 && var51 < var50.field71.length) {
                            var50.field71[var51] = var52;
                            var50.field72[var51] = var53;
                        }
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 108) {
                    this.field1650 = 0;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 75) {
                    this.field1481 = this.field1418.method239();
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 27) {
                    int var54 = this.field1418.method241();
                    int var55 = this.field1418.method242();
                    int var56 = this.field1418.method242();
                    Component var57 = Component.field70[var54];
                    var57.field83 = var55;
                    var57.field84 = var56;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 197) {
                    int var58 = this.field1418.method241();
                    this.method515(var58, 32215);
                    if (this.field1394 != -1) {
                        this.field1394 = -1;
                        this.field1372 = true;
                        this.field1421 = true;
                    }
                    if (this.field1402 != -1) {
                        this.field1402 = -1;
                        this.field1217 = true;
                    }
                    if (this.field1594) {
                        this.field1594 = false;
                        this.field1217 = true;
                    }
                    this.field1422 = var58;
                    this.field1223 = false;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 141) {
                    int var59 = this.field1418.method241();
                    this.method515(var59, 32215);
                    if (this.field1394 != -1) {
                        this.field1394 = -1;
                        this.field1372 = true;
                        this.field1421 = true;
                    }
                    this.field1402 = var59;
                    this.field1217 = true;
                    this.field1422 = -1;
                    this.field1223 = false;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 85) {
                    int var60 = this.field1418.method242();
                    if (var60 >= 0) {
                        this.method515(var60, 32215);
                    }
                    this.field1273 = var60;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 94) {
                    if (this.field1386 == 12) {
                        this.field1372 = true;
                    }
                    this.field1350 = this.field1418.method239();
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 91) {
                    int var61 = this.field1418.method241();
                    int var62 = this.field1418.method239();
                    if (var61 == 65535) {
                        var61 = -1;
                    }
                    this.field1499[var62] = var61;
                    this.field1372 = true;
                    this.field1421 = true;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 55) {
                    this.field1443 = true;
                    this.field1232 = this.field1418.method239();
                    this.field1233 = this.field1418.method239();
                    this.field1234 = this.field1418.method241();
                    this.field1235 = this.field1418.method239();
                    this.field1236 = this.field1418.method239();
                    if (this.field1236 >= 100) {
                        this.field1509 = this.field1232 * 128 + 64;
                        this.field1511 = this.field1233 * 128 + 64;
                        this.field1510 = this.method542(this.field1479, this.field1509, this.field1511, this.field1607) - this.field1234;
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 173) {
                    this.field1457 = this.field1418.method239();
                    this.field1458 = this.field1418.method239();
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 163) {
                    int var63 = this.field1418.method241();
                    if (var63 == 65535) {
                        var63 = -1;
                    }
                    if (this.field1314 != var63 && this.field1480 && !field1302 && this.field1467 == 0) {
                        this.field1596 = var63;
                        this.field1597 = true;
                        this.field1209.method289(2, this.field1596);
                    }
                    this.field1314 = var63;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 242) {
                    int var64 = this.field1418.method241();
                    int var65 = this.field1418.method241();
                    if (this.field1480 && !field1302) {
                        this.field1596 = var64;
                        this.field1597 = false;
                        this.field1209.method289(2, this.field1596);
                        this.field1467 = var65;
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 60) {
                    long var66 = this.field1418.method245(6);
                    int var68 = this.field1418.method244();
                    int var69 = this.field1418.method239();
                    boolean var70 = false;
                    for (int var71 = 0; var71 < 100; ++var71) {
                        if (this.field1453[var71] == var68) {
                            var70 = true;
                            break;
                        }
                    }
                    if (var69 <= 1) {
                        for (int var72 = 0; var72 < this.field1530; ++var72) {
                            if (this.field1334[var72] == var66) {
                                var70 = true;
                                break;
                            }
                        }
                    }
                    if (!var70 && this.field1615 == 0) {
                        try {
                            this.field1453[this.field1552] = var68;
                            this.field1552 = (this.field1552 + 1) % 100;
                            String var73 = WordPack.method317(this.field1397 - 13, this.field1418, this.field1604);
                            String var74 = WordFilter.method403(var73, false);
                            if (var69 != 2 && var69 != 3) {
                                if (var69 == 1) {
                                    this.method465(-547, "@cr1@" + JString.method314(true, JString.method311((byte) -49, var66)), var74, 7);
                                } else {
                                    this.method465(-547, JString.method314(true, JString.method311((byte) -49, var66)), var74, 3);
                                }
                            } else {
                                this.method465(-547, "@cr2@" + JString.method314(true, JString.method311((byte) -49, var66)), var74, 7);
                            }
                        } catch (Exception var159) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 3) {
                    int var76 = this.field1418.method241();
                    int var77 = this.field1418.method241();
                    Component.field70[var76].field119 = 2;
                    Component.field70[var76].field120 = var77;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 213) {
                    this.field1243 = this.field1418.method241();
                    this.field1450 = this.field1418.method239();
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 143) {
                    this.field1303 = this.field1418.method241() * 30;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 168) {
                    int var78 = this.field1418.method241();
                    Component var79 = Component.field70[var78];
                    for (int var80 = 0; var80 < var79.field71.length; ++var80) {
                        var79.field71[var80] = -1;
                        var79.field71[var80] = 0;
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 21) {
                    this.method525(0);
                    this.field1398 = -1;
                    return false;
                }
                if (this.field1398 == 98 || this.field1398 == 218 || this.field1398 == 8 || this.field1398 == 114 || this.field1398 == 37 || this.field1398 == 115 || this.field1398 == 120 || this.field1398 == 30 || this.field1398 == 88 || this.field1398 == 70) {
                    this.method445(this.field1398, false, this.field1418);
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 211) {
                    int var81 = this.field1418.method241();
                    int var82 = this.field1418.method241();
                    Component.field70[var81].field119 = 1;
                    Component.field70[var81].field120 = var82;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 138) {
                    this.field1386 = this.field1418.method239();
                    this.field1372 = true;
                    this.field1421 = true;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 61) {
                    this.field1457 = this.field1418.method239();
                    this.field1458 = this.field1418.method239();
                    while (this.field1418.field717 < this.field1397) {
                        int var83 = this.field1418.method239();
                        this.method445(var83, false, this.field1418);
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 41) {
                    int var84 = this.field1418.method241();
                    String var85 = this.field1418.method246();
                    Component.field70[var84].field111 = var85;
                    if (this.field1499[this.field1386] == Component.field70[var84].field76) {
                        this.field1372 = true;
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 225) {
                    int var86 = this.field1418.method239();
                    int var87 = this.field1418.method239();
                    int var88 = this.field1418.method239();
                    int var89 = this.field1418.method239();
                    this.field1357[var86] = true;
                    this.field1315[var86] = var87;
                    this.field1198[var86] = var88;
                    this.field1419[var86] = var89;
                    this.field1656[var86] = 0;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 0) {
                    this.field1443 = true;
                    this.field1367 = this.field1418.method239();
                    this.field1368 = this.field1418.method239();
                    this.field1369 = this.field1418.method241();
                    this.field1370 = this.field1418.method239();
                    this.field1371 = this.field1418.method239();
                    if (this.field1371 >= 100) {
                        int var90 = this.field1367 * 128 + 64;
                        int var91 = this.field1368 * 128 + 64;
                        int var92 = this.method542(this.field1479, var90, var91, this.field1607) - this.field1369;
                        int var93 = var90 - this.field1509;
                        int var94 = var92 - this.field1510;
                        int var95 = var91 - this.field1511;
                        int var96 = (int) Math.sqrt((double) (var93 * var93 + var95 * var95));
                        this.field1512 = (int) (Math.atan2((double) var94, (double) var96) * 325.949D) & 2047;
                        this.field1513 = (int) (Math.atan2((double) var93, (double) var95) * -325.949D) & 2047;
                        if (this.field1512 < 128) {
                            this.field1512 = 128;
                        }
                        if (this.field1512 > 383) {
                            this.field1512 = 383;
                        }
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 38) {
                    int var97 = this.field1418.method241();
                    int var98 = this.field1418.method241();
                    int var99 = var98 >> 10 & 31;
                    int var100 = var98 >> 5 & 31;
                    int var101 = var98 & 31;
                    Component.field70[var97].field113 = (var101 << 3) + (var99 << 19) + (var100 << 11);
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 204) {
                    int var102 = this.field1418.method239();
                    int var103 = this.field1418.method239();
                    String var104 = this.field1418.method246();
                    if (var102 >= 1 && var102 <= 5) {
                        if (var104.equalsIgnoreCase("null")) {
                            var104 = null;
                        }
                        this.field1309[var102 - 1] = var104;
                        this.field1310[var102 - 1] = var103 == 0;
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 25) {
                    int var105 = this.field1418.method241();
                    int var106 = this.field1418.method239();
                    int var107 = this.field1418.method241();
                    if (this.field1327 && !field1302 && this.field1592 < 50) {
                        this.field1366[this.field1592] = var105;
                        this.field1508[this.field1592] = var106;
                        this.field1657[this.field1592] = Wave.field901[var105] + var107;
                        ++this.field1592;
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 174) {
                    if (this.field1394 != -1) {
                        this.field1394 = -1;
                        this.field1372 = true;
                        this.field1421 = true;
                    }
                    if (this.field1402 != -1) {
                        this.field1402 = -1;
                        this.field1217 = true;
                    }
                    if (this.field1594) {
                        this.field1594 = false;
                        this.field1217 = true;
                    }
                    this.field1422 = -1;
                    this.field1223 = false;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 222) {
                    int var108 = this.field1418.method241();
                    int var109 = this.field1418.method241();
                    int var110 = this.field1418.method241();
                    ObjType var111 = ObjType.method350(var109);
                    Component.field70[var108].field119 = 4;
                    Component.field70[var108].field120 = var109;
                    Component.field70[var108].field126 = var111.field1037;
                    Component.field70[var108].field127 = var111.field1038;
                    Component.field70[var108].field125 = var111.field1036 * 100 / var110;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 161) {
                    int var112 = this.field1418.method241();
                    Component.field70[var112].field119 = 3;
                    Component.field70[var112].field120 = (field1642.field472[8] << 6) + (field1642.field472[0] << 12) + (field1642.field473[0] << 24) + (field1642.field473[4] << 18) + field1642.field472[11];
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 255) {
                    this.field1492 = this.field1418.method239();
                    this.field1372 = true;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 123) {
                    this.method505(this.field1397, this.field1418, 3891);
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 187) {
                    int var113 = this.field1418.method241();
                    this.method515(var113, 32215);
                    if (this.field1402 != -1) {
                        this.field1402 = -1;
                        this.field1217 = true;
                    }
                    if (this.field1594) {
                        this.field1594 = false;
                        this.field1217 = true;
                    }
                    this.field1394 = var113;
                    this.field1372 = true;
                    this.field1421 = true;
                    this.field1422 = -1;
                    this.field1223 = false;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 249) {
                    int var114 = this.field1418.method241();
                    int var115 = this.field1418.method241();
                    if (this.field1402 != -1) {
                        this.field1402 = -1;
                        this.field1217 = true;
                    }
                    if (this.field1594) {
                        this.field1594 = false;
                        this.field1217 = true;
                    }
                    this.field1422 = var114;
                    this.field1394 = var115;
                    this.field1372 = true;
                    this.field1421 = true;
                    this.field1223 = false;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 196) {
                    int var116 = this.field1418.method241();
                    int var117 = this.field1418.method244();
                    this.field1431[var116] = var117;
                    if (this.field1361[var116] != var117) {
                        this.field1361[var116] = var117;
                        this.method559(var116, 4363);
                        this.field1372 = true;
                        if (this.field1326 != -1) {
                            this.field1217 = true;
                        }
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 239) {
                    int var118 = this.field1418.method242();
                    this.field1326 = var118;
                    this.field1217 = true;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 167) {
                    this.field1443 = false;
                    for (int var119 = 0; var119 < 5; ++var119) {
                        this.field1357[var119] = false;
                    }
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 209) {
                    int var120 = this.field1418.method241();
                    int var121 = this.field1418.method241();
                    if (this.field1390 == var120 && this.field1391 == var121 && this.field1568 == 2) {
                        this.field1398 = -1;
                        return true;
                    }
                    this.field1390 = var120;
                    this.field1391 = var121;
                    this.field1503 = (this.field1390 - 6) * 8;
                    this.field1504 = (this.field1391 - 6) * 8;
                    this.field1641 = false;
                    if ((this.field1390 / 8 == 48 || this.field1390 / 8 == 49) && this.field1391 / 8 == 48) {
                        this.field1641 = true;
                    }
                    if (this.field1390 / 8 == 48 && this.field1391 / 8 == 148) {
                        this.field1641 = true;
                    }
                    this.field1568 = 1;
                    this.field1377 = System.currentTimeMillis();
                    this.field1271.method268(false);
                    this.field1404.method214(257, "Loading - please wait.", 0, 151, 0);
                    this.field1404.method214(256, "Loading - please wait.", 0, 150, 16777215);
                    this.field1271.method269(super.field15, 4, false, 4);
                    int var122 = 0;
                    for (int var123 = (this.field1390 - 6) / 8; var123 <= (this.field1390 + 6) / 8; ++var123) {
                        for (int var124 = (this.field1391 - 6) / 8; var124 <= (this.field1391 + 6) / 8; ++var124) {
                            ++var122;
                        }
                    }
                    this.field1417 = new byte[var122][];
                    this.field1395 = new byte[var122][];
                    this.field1474 = new int[var122];
                    this.field1475 = new int[var122];
                    this.field1476 = new int[var122];
                    int var125 = 0;
                    for (int var126 = (this.field1390 - 6) / 8; var126 <= (this.field1390 + 6) / 8; ++var126) {
                        for (int var127 = (this.field1391 - 6) / 8; var127 <= (this.field1391 + 6) / 8; ++var127) {
                            this.field1474[var125] = (var126 << 8) + var127;
                            if (this.field1641 && (var127 == 49 || var127 == 149 || var127 == 147 || var126 == 50 || var126 == 49 && var127 == 47)) {
                                this.field1475[var125] = -1;
                                this.field1476[var125] = -1;
                                ++var125;
                            } else {
                                int var128 = this.field1475[var125] = this.field1209.method284(31009, var126, var127, 0);
                                if (var128 != -1) {
                                    this.field1209.method289(3, var128);
                                }
                                int var129 = this.field1476[var125] = this.field1209.method284(31009, var126, var127, 1);
                                if (var129 != -1) {
                                    this.field1209.method289(3, var129);
                                }
                                ++var125;
                            }
                        }
                    }
                    int var130 = this.field1503 - this.field1505;
                    int var131 = this.field1504 - this.field1506;
                    this.field1505 = this.field1503;
                    this.field1506 = this.field1504;
                    for (int var132 = 0; var132 < 16384; ++var132) {
                        NpcEntity var133 = this.field1426[var132];
                        if (var133 != null) {
                            for (int var134 = 0; var134 < 10; ++var134) {
                                var133.field459[var134] -= var130;
                                var133.field460[var134] -= var131;
                            }
                            var133.field409 -= var130 * 128;
                            var133.field410 -= var131 * 128;
                        }
                    }
                    for (int var135 = 0; var135 < this.field1434; ++var135) {
                        PlayerEntity var136 = this.field1436[var135];
                        if (var136 != null) {
                            for (int var137 = 0; var137 < 10; ++var137) {
                                var136.field459[var137] -= var130;
                                var136.field460[var137] -= var131;
                            }
                            var136.field409 -= var130 * 128;
                            var136.field410 -= var131 * 128;
                        }
                    }
                    this.field1242 = true;
                    byte var138 = 0;
                    byte var139 = 104;
                    byte var140 = 1;
                    if (var130 < 0) {
                        var138 = 103;
                        var139 = -1;
                        var140 = -1;
                    }
                    byte var141 = 0;
                    byte var142 = 104;
                    byte var143 = 1;
                    if (var131 < 0) {
                        var141 = 103;
                        var142 = -1;
                        var143 = -1;
                    }
                    for (int var144 = var138; var139 != var144; var144 += var140) {
                        for (int var145 = var141; var142 != var145; var145 += var143) {
                            int var146 = var130 + var144;
                            int var147 = var131 + var145;
                            for (int var148 = 0; var148 < 4; ++var148) {
                                if (var146 >= 0 && var147 >= 0 && var146 < 104 && var147 < 104) {
                                    this.field1616[var148][var144][var145] = this.field1616[var148][var146][var147];
                                } else {
                                    this.field1616[var148][var144][var145] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var149 = (LocSpawned) this.field1569.method258(); var149 != null; var149 = (LocSpawned) this.field1569.method260(-536)) {
                        var149.field737 -= var130;
                        var149.field738 -= var131;
                        if (var149.field737 < 0 || var149.field738 < 0 || var149.field737 >= 104 || var149.field738 >= 104) {
                            var149.method120();
                        }
                    }
                    if (this.field1650 != 0) {
                        this.field1650 -= var130;
                        this.field1651 -= var131;
                    }
                    this.field1443 = false;
                    this.field1398 = -1;
                    return true;
                }
                if (this.field1398 == 28) {
                    this.field1372 = true;
                    int var150 = this.field1418.method241();
                    Component var151 = Component.field70[var150];
                    int var152 = this.field1418.method239();
                    for (int var153 = 0; var153 < var152; ++var153) {
                        var151.field71[var153] = this.field1418.method241();
                        int var154 = this.field1418.method239();
                        if (var154 == 255) {
                            var154 = this.field1418.method244();
                        }
                        var151.field72[var153] = var154;
                    }
                    for (int var155 = var152; var155 < var151.field71.length; ++var155) {
                        var151.field71[var155] = 0;
                        var151.field72[var155] = 0;
                    }
                    this.field1398 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1398 + "," + this.field1397 + " - " + this.field1487 + "," + this.field1488);
                this.method525(0);
            } catch (IOException var160) {
                this.method450(-889);
            } catch (Exception var161) {
                String var157 = "T2 - " + this.field1398 + "," + this.field1487 + "," + this.field1488 + " - " + this.field1397 + "," + (field1642.field459[0] + this.field1503) + "," + (field1642.field460[0] + this.field1504) + " - ";
                for (int var158 = 0; var158 < this.field1397 && var158 < 50; ++var158) {
                    var157 = var157 + this.field1418.field716[var158] + ",";
                }
                signlink.reporterror(var157);
                this.method525(0);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;I)V")
    public final void method502(Component arg0, int arg1) {
        int var3 = arg0.field79;
        if (arg1 == 11170) {
            if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
                if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                    int var5 = this.field1491;
                    if (this.field1492 != 2) {
                        var5 = 0;
                    }
                    if (var3 > 800) {
                        var3 -= 701;
                    } else {
                        var3 -= 101;
                    }
                    if (var3 >= var5) {
                        arg0.field111 = "";
                        arg0.field78 = 0;
                    } else {
                        if (this.field1365[var3] == 0) {
                            arg0.field111 = "@red@Offline";
                        } else if (this.field1365[var3] == field1299) {
                            arg0.field111 = "@gre@World-" + (this.field1365[var3] - 9);
                        } else {
                            arg0.field111 = "@yel@World-" + (this.field1365[var3] - 9);
                        }
                        arg0.field78 = 1;
                    }
                } else if (var3 == 203) {
                    int var6 = this.field1491;
                    if (this.field1492 != 2) {
                        var6 = 0;
                    }
                    arg0.field89 = var6 * 15 + 20;
                    if (arg0.field89 <= arg0.field81) {
                        arg0.field89 = arg0.field81 + 1;
                    }
                } else if (var3 >= 401 && var3 <= 500) {
                    var3 -= 401;
                    if (var3 >= this.field1530) {
                        arg0.field111 = "";
                        arg0.field78 = 0;
                    } else {
                        arg0.field111 = JString.method314(true, JString.method311((byte) -49, this.field1334[var3]));
                        arg0.field78 = 1;
                    }
                } else if (var3 == 503) {
                    arg0.field89 = this.field1530 * 15 + 20;
                    if (arg0.field89 <= arg0.field81) {
                        arg0.field89 = arg0.field81 + 1;
                    }
                } else if (var3 == 327) {
                    arg0.field126 = 150;
                    arg0.field127 = (int) (Math.sin((double) field1618 / 40.0D) * 256.0D) & 2047;
                    if (this.field1322) {
                        for (int var7 = 0; var7 < 7; ++var7) {
                            int var14 = this.field1566[var7];
                            if (var14 >= 0 && !IdkType.field1099[var14].method379((byte) 9)) {
                                return;
                            }
                        }
                        this.field1322 = false;
                        Model[] var8 = new Model[7];
                        int var9 = 0;
                        for (int var10 = 0; var10 < 7; ++var10) {
                            int var13 = this.field1566[var10];
                            if (var13 >= 0) {
                                var8[var9++] = IdkType.field1099[var13].method380(-84);
                            }
                        }
                        Model var11 = new Model(var8, var9, (byte) 2);
                        for (int var12 = 0; var12 < 5; ++var12) {
                            if (this.field1468[var12] != 0) {
                                var11.method153(field1384[var12][0], field1384[var12][this.field1468[var12]]);
                                if (var12 == 1) {
                                    var11.method153(field1643[0], field1643[this.field1468[var12]]);
                                }
                            }
                        }
                        var11.method146(0);
                        var11.method147((byte) 2, SeqType.field1121[field1642.field414].field1123[0]);
                        var11.method156(64, 850, -30, -50, -30, true);
                        arg0.field119 = 5;
                        arg0.field120 = 0;
                        Component.method36(344, var11, 5, 0);
                    }
                } else if (var3 == 324) {
                    if (this.field1564 == null) {
                        this.field1564 = arg0.field117;
                        this.field1565 = arg0.field118;
                    }
                    if (this.field1197) {
                        arg0.field117 = this.field1565;
                    } else {
                        arg0.field117 = this.field1564;
                    }
                } else if (var3 == 325) {
                    if (this.field1564 == null) {
                        this.field1564 = arg0.field117;
                        this.field1565 = arg0.field118;
                    }
                    if (this.field1197) {
                        arg0.field117 = this.field1564;
                    } else {
                        arg0.field117 = this.field1565;
                    }
                } else if (var3 == 600) {
                    arg0.field111 = this.field1593;
                    if (field1618 % 20 < 10) {
                        arg0.field111 = arg0.field111 + "|";
                    } else {
                        arg0.field111 = arg0.field111 + " ";
                    }
                } else {
                    if (var3 == 613) {
                        if (this.field1563 >= 1) {
                            if (this.field1362) {
                                arg0.field113 = 16711680;
                                arg0.field111 = "Moderator option: Mute player for 48 hours: <ON>";
                            } else {
                                arg0.field113 = 16777215;
                                arg0.field111 = "Moderator option: Mute player for 48 hours: <OFF>";
                            }
                        } else {
                            arg0.field111 = "";
                        }
                    }
                    if (var3 == 650 || var3 == 655) {
                        if (this.field1355 != 0) {
                            String var15;
                            if (this.field1587 == 0) {
                                var15 = "earlier today";
                            } else if (this.field1587 == 1) {
                                var15 = "yesterday";
                            } else {
                                var15 = this.field1587 + " days ago";
                            }
                            arg0.field111 = "You last logged in " + var15 + " from: " + signlink.dns;
                        } else {
                            arg0.field111 = "";
                        }
                    }
                    if (var3 == 651) {
                        if (this.field1567 == 0) {
                            arg0.field111 = "0 unread messages";
                            arg0.field113 = 16776960;
                        }
                        if (this.field1567 == 1) {
                            arg0.field111 = "1 unread message";
                            arg0.field113 = 65280;
                        }
                        if (this.field1567 > 1) {
                            arg0.field111 = this.field1567 + " unread messages";
                            arg0.field113 = 65280;
                        }
                    }
                    if (var3 == 652) {
                        if (this.field1423 == 201) {
                            if (this.field1276 == 1) {
                                arg0.field111 = "@yel@This is a non-members world: @whi@Since you are a member we";
                            } else {
                                arg0.field111 = "";
                            }
                        } else if (this.field1423 == 200) {
                            arg0.field111 = "You have not yet set any password recovery questions.";
                        } else {
                            String var16;
                            if (this.field1423 == 0) {
                                var16 = "Earlier today";
                            } else if (this.field1423 == 1) {
                                var16 = "Yesterday";
                            } else {
                                var16 = this.field1423 + " days ago";
                            }
                            arg0.field111 = var16 + " you changed your recovery questions";
                        }
                    }
                    if (var3 == 653) {
                        if (this.field1423 == 201) {
                            if (this.field1276 == 1) {
                                arg0.field111 = "@whi@recommend you use a members world instead. You may use";
                            } else {
                                arg0.field111 = "";
                            }
                        } else if (this.field1423 == 200) {
                            arg0.field111 = "We strongly recommend you do so now to secure your account.";
                        } else {
                            arg0.field111 = "If you do not remember making this change then cancel it immediately";
                        }
                    }
                    if (var3 == 654) {
                        if (this.field1423 == 201) {
                            if (this.field1276 == 1) {
                                arg0.field111 = "@whi@this world but member benefits are unavailabe whilst here.";
                            } else {
                                arg0.field111 = "";
                            }
                        } else if (this.field1423 == 200) {
                            arg0.field111 = "Do this from the 'account management' area on our front webpage";
                        } else {
                            arg0.field111 = "Do this from the 'account management' area on our front webpage";
                        }
                    }
                }
            } else if (var3 == 1 && this.field1492 == 0) {
                arg0.field111 = "Loading friend list";
                arg0.field78 = 0;
            } else if (var3 == 1 && this.field1492 == 1) {
                arg0.field111 = "Connecting to friendserver";
                arg0.field78 = 0;
            } else if (var3 == 2 && this.field1492 != 2) {
                arg0.field111 = "Please wait...";
                arg0.field78 = 0;
            } else {
                int var4 = this.field1491;
                if (this.field1492 != 2) {
                    var4 = 0;
                }
                if (var3 > 700) {
                    var3 -= 601;
                } else {
                    --var3;
                }
                if (var3 >= var4) {
                    arg0.field111 = "";
                    arg0.field78 = 0;
                } else {
                    arg0.field111 = this.field1219[var3];
                    arg0.field78 = 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method503(int arg0) {
        int var2 = 88 / arg0;
        this.method444(-154);
        if (this.field1613 == 1) {
            this.field1456[this.field1612 / 100].method199(this.field1610 - 8 - 4, -48420, this.field1611 - 8 - 4);
        }
        if (this.field1613 == 2) {
            this.field1456[this.field1612 / 100 + 4].method199(this.field1610 - 8 - 4, -48420, this.field1611 - 8 - 4);
            ++field1231;
            if (field1231 > 57) {
                field1231 = 0;
                this.field1461.method228(100, 0);
            }
        }
        if (this.field1273 != -1) {
            this.method536(this.field1273, this.field1257, (byte) -21);
            this.method543(false, 0, 0, Component.field70[this.field1273], 0);
        }
        if (this.field1422 != -1) {
            this.method536(this.field1422, this.field1257, (byte) -21);
            this.method543(false, 0, 0, Component.field70[this.field1422], 0);
        }
        this.method496((byte) -4);
        if (!this.field1432) {
            this.method491((byte) 8);
            this.method435(-612);
        } else if (this.field1277 == 0) {
            this.method457(-419);
        }
        if (this.field1481 == 1) {
            this.field1573[1].method199(472, -48420, 296);
        }
        if (this.field1303 != 0) {
            int var3 = this.field1303 / 50;
            int var4 = var3 / 60;
            int var5 = var3 % 60;
            if (var5 < 10) {
                this.field1404.method217(329, 16776960, false, "System update in: " + var4 + ":0" + var5, 4);
            } else {
                this.field1404.method217(329, 16776960, false, "System update in: " + var4 + ":" + var5, 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method504(int arg0) {
        this.field1397 += arg0;
        for (int var2 = -1; var2 < this.field1437; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1435;
            } else {
                var6 = this.field1438[var2];
            }
            PlayerEntity var7 = this.field1436[var6];
            if (var7 != null && var7.field422 > 0) {
                --var7.field422;
                if (var7.field422 == 0) {
                    var7.field421 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field1427; ++var3) {
            int var4 = this.field1428[var3];
            NpcEntity var5 = this.field1426[var4];
            if (var5 != null && var5.field422 > 0) {
                --var5.field422;
                if (var5.field422 == 0) {
                    var5.field421 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;I)V")
    private final void method505(int arg0, Packet arg1, int arg2) {
        this.field1311 = 0;
        this.field1439 = 0;
        this.method481(true, arg0, arg1);
        this.method527(arg0, true, arg1);
        this.method561(arg1, arg0, this.field1238);
        if (this.field1267 != arg2) {
            this.field1398 = arg1.method239();
        }
        for (int var4 = 0; var4 < this.field1311; ++var4) {
            int var6 = this.field1312[var4];
            if (field1618 != this.field1426[var6].field454) {
                this.field1426[var6].field464 = null;
                this.field1426[var6] = null;
            }
        }
        if (arg1.field717 != arg0) {
            signlink.reporterror(this.field1585 + " size mismatch in getnpcpos - pos:" + arg1.field717 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1427; ++var5) {
                if (this.field1426[this.field1428[var5]] == null) {
                    signlink.reporterror(this.field1585 + " null entry in npc list - pos:" + var5 + " size:" + this.field1427);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljb;IBI)V")
    public final void method506(Pix32 arg0, int arg1, byte arg2, int arg3) {
        if (this.field1583 != arg2) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        int var6 = this.field1374 + this.field1319 & 2047;
        int var7 = arg1 * arg1 + arg3 * arg3;
        if (var7 <= 6400) {
            int var8 = Model.field608[var6];
            int var9 = Model.field609[var6];
            int var10 = var8 * 256 / (this.field1446 + 256);
            int var11 = var9 * 256 / (this.field1446 + 256);
            int var12 = arg1 * var10 + arg3 * var11 >> 16;
            int var13 = arg1 * var11 - arg3 * var10 >> 16;
            if (var7 > 2500) {
                arg0.method205(83 - var13 - arg0.field675 / 2 - 4, var12 + 94 - arg0.field674 / 2 + 4, 0, this.field1339);
            } else {
                arg0.method199(var12 + 94 - arg0.field674 / 2 + 4, -48420, 83 - var13 - arg0.field675 / 2 - 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method507(int arg0) {
        if (arg0 != 2) {
            this.field1398 = this.field1418.method239();
        }
        if (this.field1303 > 1) {
            --this.field1303;
        }
        if (this.field1401 > 0) {
            --this.field1401;
        }
        for (int var2 = 0; var2 < 5 && this.method501(false); ++var2) {
        }
        if (this.field1448) {
            this.method489(4);
            this.method483(true);
            this.method553(0);
            Packet var3 = InputTracking.method46(true);
            if (var3 != null) {
                this.field1461.method228(142, 0);
                this.field1461.method230(var3.field717);
                this.field1461.method237(0, var3.field717, false, var3.field716);
                var3.method227(0);
            }
            ++this.field1399;
            if (this.field1399 > 750) {
                this.method450(-889);
            }
            this.method499(true);
            this.method545(this.field1256);
            this.method504(0);
            ++this.field1257;
            if (this.field1613 != 0) {
                this.field1612 += 20;
                if (this.field1612 >= 400) {
                    this.field1613 = 0;
                }
            }
            if (this.field1485 != 0) {
                ++this.field1482;
                if (this.field1482 >= 15) {
                    if (this.field1485 == 2) {
                        this.field1372 = true;
                    }
                    if (this.field1485 == 3) {
                        this.field1217 = true;
                    }
                    this.field1485 = 0;
                }
            }
            if (this.field1549 != 0) {
                ++this.field1495;
                if (super.field23 > this.field1550 + 5 || super.field23 < this.field1550 - 5 || super.field24 > this.field1551 + 5 || super.field24 < this.field1551 - 5) {
                    this.field1494 = true;
                }
                if (super.field22 == 0) {
                    if (this.field1549 == 2) {
                        this.field1372 = true;
                    }
                    if (this.field1549 == 3) {
                        this.field1217 = true;
                    }
                    this.field1549 = 0;
                    if (this.field1494 && this.field1495 >= 5) {
                        this.field1590 = -1;
                        this.method491((byte) 8);
                        if (this.field1590 == this.field1547 && this.field1589 != this.field1548) {
                            Component var4 = Component.field70[this.field1547];
                            byte var5 = 0;
                            if (this.field1218 == 1 && var4.field79 == 206) {
                                var5 = 1;
                            }
                            if (var4.field71[this.field1589] <= 0) {
                                var5 = 0;
                            }
                            if (var4.field100) {
                                int var6 = this.field1548;
                                int var7 = this.field1589;
                                var4.field71[var7] = var4.field71[var6];
                                var4.field72[var7] = var4.field72[var6];
                                var4.field71[var6] = -1;
                                var4.field72[var6] = 0;
                            } else if (var5 == 1) {
                                int var8 = this.field1548;
                                int var9 = this.field1589;
                                while (var8 != var9) {
                                    if (var8 > var9) {
                                        var4.method33(var8, 718, var8 - 1);
                                        --var8;
                                    } else if (var8 < var9) {
                                        var4.method33(var8, 718, var8 + 1);
                                        ++var8;
                                    }
                                }
                            } else {
                                var4.method33(this.field1548, 718, this.field1589);
                            }
                            this.field1461.method228(176, 0);
                            this.field1461.method230(this.field1547);
                            this.field1461.method230(this.field1548);
                            this.field1461.method230(this.field1589);
                            this.field1461.method229(var5);
                        }
                    } else if ((this.field1557 == 1 || this.method468(this.field1553 - 1, 0)) && this.field1553 > 2) {
                        this.method475(true);
                    } else if (this.field1553 > 0) {
                        this.method526(8, this.field1553 - 1);
                    }
                    this.field1482 = 10;
                    super.field29 = 0;
                }
            }
            ++field1358;
            if (field1358 > 62) {
                field1358 = 0;
                this.field1461.method228(182, 0);
            }
            if (World3D.field330 != -1) {
                int var10 = World3D.field330;
                int var11 = World3D.field331;
                boolean var12 = this.method442(0, 0, field1642.field459[0], 0, var11, true, field1642.field460[0], 0, 0, var10, 0, 0);
                World3D.field330 = -1;
                if (var12) {
                    this.field1610 = super.field30;
                    this.field1611 = super.field31;
                    this.field1613 = 1;
                    this.field1612 = 0;
                }
            }
            if (super.field29 == 1 && this.field1346 != null) {
                this.field1346 = null;
                this.field1217 = true;
                super.field29 = 0;
            }
            this.method459(-19212);
            this.method487((byte) 13);
            this.method516(-19134);
            this.method458(false);
            if (super.field22 == 1 || super.field29 == 1) {
                ++this.field1207;
            }
            if (this.field1568 == 2) {
                this.method562(18798);
            }
            if (this.field1568 == 2 && this.field1443) {
                this.method514((byte) 9);
            }
            for (int var13 = 0; var13 < 5; ++var13) {
                int var10002 = this.field1656[var13]++;
            }
            this.method528(8);
            ++super.field21;
            if (super.field21 > 4500) {
                this.field1401 = 250;
                super.field21 -= 500;
                this.field1461.method228(144, 0);
            }
            ++this.field1591;
            if (this.field1591 > 500) {
                this.field1591 = 0;
                int var14 = (int) (Math.random() * 8.0D);
                if ((var14 & 1) == 1) {
                    this.field1638 += this.field1639;
                }
                if ((var14 & 2) == 2) {
                    this.field1424 += this.field1425;
                }
                if ((var14 & 4) == 4) {
                    this.field1647 += this.field1648;
                }
            }
            if (this.field1638 < -50) {
                this.field1639 = 2;
            }
            if (this.field1638 > 50) {
                this.field1639 = -2;
            }
            if (this.field1424 < -55) {
                this.field1425 = 2;
            }
            if (this.field1424 > 55) {
                this.field1425 = -2;
            }
            if (this.field1647 < -40) {
                this.field1648 = 1;
            }
            if (this.field1647 > 40) {
                this.field1648 = -1;
            }
            ++this.field1379;
            if (this.field1379 > 500) {
                this.field1379 = 0;
                int var15 = (int) (Math.random() * 8.0D);
                if ((var15 & 1) == 1) {
                    this.field1374 += this.field1375;
                }
                if ((var15 & 2) == 2) {
                    this.field1446 += this.field1447;
                }
            }
            if (this.field1374 < -60) {
                this.field1375 = 2;
            }
            if (this.field1374 > 60) {
                this.field1375 = -2;
            }
            if (this.field1446 < -20) {
                this.field1447 = 1;
            }
            if (this.field1446 > 10) {
                this.field1447 = -1;
            }
            ++this.field1400;
            if (this.field1400 > 50) {
                this.field1461.method228(239, 0);
            }
            try {
                if (this.field1205 != null && this.field1461.field717 > 0) {
                    this.field1205.method42(this.field1461.field717, this.field1461.field716, 0, false);
                    this.field1461.field717 = 0;
                    this.field1400 = 0;
                }
            } catch (IOException var17) {
                this.method450(-889);
            } catch (Exception var18) {
                this.method525(0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1574.method212(arg5, -48420, arg1);
        this.field1575.method212(arg5, -48420, arg1 + arg3 - 16);
        Pix2D.method170(33027, this.field1208, 16, arg1 + 16, arg3 - 32, arg5);
        if (arg2 != -11192) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        int var8 = (arg3 - 32) * arg3 / arg4;
        if (var8 < 8) {
            var8 = 8;
        }
        int var9 = (arg3 - 32 - var8) * arg0 / (arg4 - arg3);
        Pix2D.method170(33027, this.field1600, 16, arg1 + 16 + var9, var8, arg5);
        Pix2D.method175(this.field1555, var8, arg5, arg1 + 16 + var9, this.field1533);
        Pix2D.method175(this.field1555, var8, arg5 + 1, arg1 + 16 + var9, this.field1533);
        Pix2D.method173(this.field1533, arg1 + 16 + var9, -25370, 16, arg5);
        Pix2D.method173(this.field1533, arg1 + 17 + var9, -25370, 16, arg5);
        Pix2D.method175(this.field1555, var8, arg5 + 15, arg1 + 16 + var9, this.field1410);
        Pix2D.method175(this.field1555, var8 - 1, arg5 + 14, arg1 + 17 + var9, this.field1410);
        Pix2D.method173(this.field1410, arg1 + 15 + var9 + var8, -25370, 16, arg5);
        Pix2D.method173(this.field1410, arg1 + 14 + var9 + var8, -25370, 15, arg5 + 1);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLd;)Z")
    public final boolean method509(boolean arg0, Component arg1) {
        int var3 = arg1.field79;
        if (arg0) {
            this.field1461.method229(67);
        }
        if (this.field1492 == 2) {
            if (var3 == 201) {
                this.field1217 = true;
                this.field1594 = false;
                this.field1653 = true;
                this.field1636 = "";
                this.field1328 = 1;
                this.field1496 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field1217 = true;
                this.field1594 = false;
                this.field1653 = true;
                this.field1636 = "";
                this.field1328 = 2;
                this.field1496 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field1401 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field1217 = true;
                this.field1594 = false;
                this.field1653 = true;
                this.field1636 = "";
                this.field1328 = 4;
                this.field1496 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field1217 = true;
                this.field1594 = false;
                this.field1653 = true;
                this.field1636 = "";
                this.field1328 = 5;
                this.field1496 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field1566[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = IdkType.field1098 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= IdkType.field1098) {
                                var6 = 0;
                            }
                        }
                        if (!IdkType.field1099[var6].field1105 && IdkType.field1099[var6].field1100 == var4 + (this.field1197 ? 0 : 7)) {
                            this.field1566[var4] = var6;
                            this.field1322 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field1468[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field1384[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field1384[var7].length) {
                        var9 = 0;
                    }
                }
                this.field1468[var7] = var9;
                this.field1322 = true;
            }
            if (var3 == 324 && !this.field1197) {
                this.field1197 = true;
                this.method472(-367);
            }
            if (var3 == 325 && this.field1197) {
                this.field1197 = false;
                this.method472(-367);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field1362 = !this.field1362;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method521((byte) 1);
                    if (this.field1593.length() > 0) {
                        this.field1461.method228(203, 0);
                        this.field1461.method235((byte) -58, JString.method310(this.field1593));
                        this.field1461.method229(var3 - 601);
                        this.field1461.method229(this.field1362 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1461.method228(13, 0);
                this.field1461.method229(this.field1197 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field1461.method229(this.field1566[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field1461.method229(this.field1468[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 >= 0) {
            this.field1616 = null;
        }
        if (arg5 >= 1 && arg1 >= 1 && arg5 <= 102 && arg1 <= 102) {
            if (field1302 && this.field1607 != arg7) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg3 == 0) {
                var9 = this.field1227.method90(arg7, arg5, arg1);
            }
            if (arg3 == 1) {
                var9 = this.field1227.method91(arg7, arg1, true, arg5);
            }
            if (arg3 == 2) {
                var9 = this.field1227.method92(arg7, arg5, arg1);
            }
            if (arg3 == 3) {
                var9 = this.field1227.method93(arg7, arg5, arg1);
            }
            if (var9 != 0) {
                int var13 = this.field1227.method94(arg7, arg5, arg1, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg3 == 0) {
                    this.field1227.method81((byte) -48, arg1, arg5, arg7);
                    LocType var17 = LocType.method334(var14);
                    if (var17.field949) {
                        this.field1637[arg7].method366(var16, arg1, arg5, var15, var17.field950, (byte) 0);
                    }
                }
                if (arg3 == 1) {
                    this.field1227.method82(arg7, arg1, this.field1373, arg5);
                }
                if (arg3 == 2) {
                    this.field1227.method83(arg7, arg1, -218, arg5);
                    LocType var18 = LocType.method334(var14);
                    if (var18.field947 + arg5 > 103 || var18.field947 + arg1 > 103 || var18.field948 + arg5 > 103 || var18.field948 + arg1 > 103) {
                        return;
                    }
                    if (var18.field949) {
                        this.field1637[arg7].method367(var16, var18.field950, var18.field947, var18.field948, arg5, arg1, 0);
                    }
                }
                if (arg3 == 3) {
                    this.field1227.method84(true, arg7, arg1, arg5);
                    LocType var19 = LocType.method334(var14);
                    if (var19.field949 && var19.field951) {
                        this.field1637[arg7].method369(false, arg1, arg5);
                    }
                }
            }
            if (arg6 >= 0) {
                int var20 = arg7;
                if (arg7 < 3 && (this.field1230[1][arg5][arg1] & 2) == 2) {
                    var20 = arg7 + 1;
                }
                World.method31(arg1, arg4, var20, this.field1637[arg7], arg6, -412, arg0, this.field1227, arg5, arg7, this.field1415);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method511(byte arg0) {
        this.field1246 = 0;
        for (int var2 = -1; var2 < this.field1437 + this.field1427; ++var2) {
            PathingEntity var17;
            if (var2 == -1) {
                var17 = field1642;
            } else if (var2 < this.field1437) {
                var17 = this.field1436[this.field1438[var2]];
            } else {
                var17 = this.field1426[this.field1428[var2 - this.field1437]];
            }
            if (var17 != null && var17.method127(509)) {
                if (var2 >= this.field1437) {
                    NpcType var21 = ((NpcEntity) var17).field464;
                    if (var21.field1015 >= 0 && var21.field1015 < this.field1573.length) {
                        this.method493(var17, (byte) 8, var17.field455 + 15);
                        if (this.field1260 > -1) {
                            this.field1573[var21.field1015].method199(this.field1260 - 12, -48420, this.field1261 - 30);
                        }
                    }
                    if (this.field1527 == 1 && this.field1428[var2 - this.field1437] == this.field1617 && field1618 % 20 < 10) {
                        this.method493(var17, (byte) 8, var17.field455 + 15);
                        if (this.field1260 > -1) {
                            this.field1573[2].method199(this.field1260 - 12, -48420, this.field1261 - 28);
                        }
                    }
                } else {
                    int var18 = 30;
                    PlayerEntity var19 = (PlayerEntity) var17;
                    if (var19.field471 != 0) {
                        this.method493(var17, (byte) 8, var17.field455 + 15);
                        if (this.field1260 > -1) {
                            for (int var20 = 0; var20 < 8; ++var20) {
                                if ((var19.field471 & 1 << var20) != 0) {
                                    this.field1573[var20].method199(this.field1260 - 12, -48420, this.field1261 - var18);
                                    var18 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1527 == 10 && this.field1438[var2] == this.field1336) {
                        this.method493(var17, (byte) 8, var17.field455 + 15);
                        if (this.field1260 > -1) {
                            this.field1573[7].method199(this.field1260 - 12, -48420, this.field1261 - var18);
                        }
                    }
                }
                if (var17.field421 != null && (var2 >= this.field1437 || this.field1214 == 0 || this.field1214 == 3 || this.field1214 == 1 && this.method484(((PlayerEntity) var17).field468, 809))) {
                    this.method493(var17, (byte) 8, var17.field455);
                    if (this.field1260 > -1 && this.field1246 < this.field1247) {
                        this.field1251[this.field1246] = this.field1405.method216(false, var17.field421) / 2;
                        this.field1250[this.field1246] = this.field1405.field701;
                        this.field1248[this.field1246] = this.field1260;
                        this.field1249[this.field1246] = this.field1261;
                        this.field1252[this.field1246] = var17.field423;
                        this.field1253[this.field1246] = var17.field424;
                        this.field1254[this.field1246] = var17.field422;
                        this.field1255[this.field1246++] = var17.field421;
                        if (this.field1295 == 0 && var17.field424 == 1) {
                            this.field1250[this.field1246] += 10;
                            this.field1249[this.field1246] += 5;
                        }
                        if (this.field1295 == 0 && var17.field424 == 2) {
                            this.field1251[this.field1246] = 60;
                        }
                    }
                }
                if (var17.field428 > field1618) {
                    this.method493(var17, (byte) 8, var17.field455 + 15);
                    if (this.field1260 > -1) {
                        int var22 = var17.field429 * 30 / var17.field430;
                        if (var22 > 30) {
                            var22 = 30;
                        }
                        Pix2D.method170(33027, 65280, var22, this.field1261 - 3, 5, this.field1260 - 15);
                        Pix2D.method170(33027, 16711680, 30 - var22, this.field1261 - 3, 5, this.field1260 - 15 + var22);
                    }
                }
                for (int var23 = 0; var23 < 4; ++var23) {
                    if (var17.field427[var23] > field1618) {
                        this.method493(var17, (byte) 8, var17.field455 / 2);
                        if (this.field1260 > -1) {
                            if (var23 == 1) {
                                this.field1261 -= 20;
                            }
                            if (var23 == 2) {
                                this.field1260 -= 15;
                                this.field1261 -= 10;
                            }
                            if (var23 == 3) {
                                this.field1260 += 15;
                                this.field1261 -= 10;
                            }
                            this.field1333[var17.field426[var23]].method199(this.field1260 - 12, -48420, this.field1261 - 12);
                            this.field1403.method214(this.field1260, String.valueOf(var17.field425[var23]), 0, this.field1261 + 4, 0);
                            this.field1403.method214(this.field1260 - 1, String.valueOf(var17.field425[var23]), 0, this.field1261 + 3, 16777215);
                        }
                    }
                }
            }
        }
        if (arg0 != 0) {
            this.field1538 = !this.field1538;
        }
        for (int var3 = 0; var3 < this.field1246; ++var3) {
            int var4 = this.field1248[var3];
            int var5 = this.field1249[var3];
            int var6 = this.field1251[var3];
            int var7 = this.field1250[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var16 = 0; var16 < var3; ++var16) {
                    if (var5 + 2 > this.field1249[var16] - this.field1250[var16] && var5 - var7 < this.field1249[var16] + 2 && var4 - var6 < this.field1251[var16] + this.field1248[var16] && var4 + var6 > this.field1248[var16] - this.field1251[var16] && this.field1249[var16] - this.field1250[var16] < var5) {
                        var5 = this.field1249[var16] - this.field1250[var16];
                        var8 = true;
                    }
                }
            }
            this.field1260 = this.field1248[var3];
            this.field1261 = this.field1249[var3] = var5;
            String var9 = this.field1255[var3];
            if (this.field1295 == 0) {
                int var10 = 16776960;
                if (this.field1252[var3] < 6) {
                    var10 = this.field1455[this.field1252[var3]];
                }
                if (this.field1252[var3] == 6) {
                    var10 = this.field1606 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1252[var3] == 7) {
                    var10 = this.field1606 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1252[var3] == 8) {
                    var10 = this.field1606 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1252[var3] == 9) {
                    int var11 = 150 - this.field1254[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field1252[var3] == 10) {
                    int var12 = 150 - this.field1254[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field1252[var3] == 11) {
                    int var13 = 150 - this.field1254[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field1253[var3] == 0) {
                    this.field1405.method214(this.field1260, var9, 0, this.field1261 + 1, 0);
                    this.field1405.method214(this.field1260, var9, 0, this.field1261, var10);
                }
                if (this.field1253[var3] == 1) {
                    this.field1405.method218(var9, this.field1261 + 1, 288, 0, this.field1606, this.field1260);
                    this.field1405.method218(var9, this.field1261, 288, var10, this.field1606, this.field1260);
                }
                if (this.field1253[var3] == 2) {
                    int var14 = this.field1405.method216(false, var9);
                    int var15 = (150 - this.field1254[var3]) * (var14 + 100) / 150;
                    Pix2D.method167(0, this.field1260 - 50, 334, 0, this.field1260 + 50);
                    this.field1405.method217(this.field1261 + 1, 0, false, var9, this.field1260 + 50 - var15);
                    this.field1405.method217(this.field1261, var10, false, var9, this.field1260 + 50 - var15);
                    Pix2D.method166(false);
                }
            } else {
                this.field1405.method214(this.field1260, var9, 0, this.field1261 + 1, 0);
                this.field1405.method214(this.field1260, var9, 0, this.field1261, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method512(byte arg0) {
        this.field1270.method268(false);
        int var2 = this.field1374 + this.field1319 & 2047;
        int var3 = field1642.field409 / 32 + 48;
        int var4 = 464 - field1642.field410 / 32;
        this.field1652.method203(this.field1354, 5, 25, this.field1291, 0, var3, var4, this.field1446 + 256, var2, 151, 146);
        this.field1433.method203(this.field1545, 0, 0, this.field1501, 0, 25, 25, 256, this.field1319, 33, 33);
        for (int var5 = 0; var5 < this.field1560; ++var5) {
            int var33 = this.field1561[var5] * 4 + 2 - field1642.field409 / 32;
            int var34 = this.field1562[var5] * 4 + 2 - field1642.field410 / 32;
            this.method506(this.field1614[var5], var34, (byte) 2, var33);
        }
        if (arg0 != -36) {
            this.method6();
        }
        for (int var6 = 0; var6 < 104; ++var6) {
            for (int var29 = 0; var29 < 104; ++var29) {
                LinkList var30 = this.field1616[this.field1607][var6][var29];
                if (var30 != null) {
                    int var31 = var6 * 4 + 2 - field1642.field409 / 32;
                    int var32 = var29 * 4 + 2 - field1642.field410 / 32;
                    this.method506(this.field1534, var32, (byte) 2, var31);
                }
            }
        }
        for (int var7 = 0; var7 < this.field1427; ++var7) {
            NpcEntity var26 = this.field1426[this.field1428[var7]];
            if (var26 != null && var26.method127(509) && var26.field464.field1008) {
                int var27 = var26.field409 / 32 - field1642.field409 / 32;
                int var28 = var26.field410 / 32 - field1642.field410 / 32;
                this.method506(this.field1535, var28, (byte) 2, var27);
            }
        }
        for (int var8 = 0; var8 < this.field1437; ++var8) {
            PlayerEntity var19 = this.field1436[this.field1438[var8]];
            if (var19 != null && var19.method127(509)) {
                int var20 = var19.field409 / 32 - field1642.field409 / 32;
                int var21 = var19.field410 / 32 - field1642.field410 / 32;
                boolean var22 = false;
                long var23 = JString.method310(var19.field468);
                for (int var25 = 0; var25 < this.field1491; ++var25) {
                    if (this.field1385[var25] == var23 && this.field1365[var25] != 0) {
                        var22 = true;
                        break;
                    }
                }
                if (var22) {
                    this.method506(this.field1537, var21, (byte) 2, var20);
                } else {
                    this.method506(this.field1536, var21, (byte) 2, var20);
                }
            }
        }
        if (this.field1527 != 0 && field1618 % 20 < 10) {
            if (this.field1527 == 1 && this.field1617 >= 0 && this.field1617 < this.field1426.length) {
                NpcEntity var9 = this.field1426[this.field1617];
                if (var9 != null) {
                    int var10 = var9.field409 / 32 - field1642.field409 / 32;
                    int var11 = var9.field410 / 32 - field1642.field410 / 32;
                    this.method438(var10, this.field1297, var11, this.field1259);
                }
            }
            if (this.field1527 == 2) {
                int var12 = (this.field1200 - this.field1503) * 4 + 2 - field1642.field409 / 32;
                int var13 = (this.field1201 - this.field1504) * 4 + 2 - field1642.field410 / 32;
                this.method438(var12, this.field1297, var13, this.field1259);
            }
            if (this.field1527 == 10 && this.field1336 >= 0 && this.field1336 < this.field1436.length) {
                PlayerEntity var14 = this.field1436[this.field1336];
                if (var14 != null) {
                    int var15 = var14.field409 / 32 - field1642.field409 / 32;
                    int var16 = var14.field410 / 32 - field1642.field410 / 32;
                    this.method438(var15, this.field1297, var16, this.field1259);
                }
            }
        }
        if (this.field1650 != 0) {
            int var17 = this.field1650 * 4 + 2 - field1642.field409 / 32;
            int var18 = this.field1651 * 4 + 2 - field1642.field410 / 32;
            this.method506(this.field1258, var18, (byte) 2, var17);
        }
        Pix2D.method170(33027, 16777215, 3, 78, 3, 97);
        this.field1271.method268(false);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIZI)Lyb;")
    public final Jagfile method513(String arg0, String arg1, int arg2, int arg3, boolean arg4, int arg5) {
        byte[] var7 = null;
        if (arg4) {
            this.field1398 = -1;
        }
        int var8 = 5;
        try {
            if (this.field1558[0] != null) {
                var7 = this.field1558[0].method301(891, arg3);
            }
        } catch (Exception var29) {
        }
        if (var7 != null) {
            this.field1571.reset();
            this.field1571.update(var7);
            int var9 = (int) this.field1571.getValue();
            if (arg2 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(var7, true);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method13(0, arg5, "Requesting " + arg1);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method464(arg0 + arg2);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    Packet var17 = new Packet(16, var16);
                    var17.field717 = 3;
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
                            this.method13(0, arg5, "Loading " + arg1 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field1558[0] != null) {
                            this.field1558[0].method302(arg3, var7, this.field1623, var7.length);
                        }
                    } catch (Exception var28) {
                        this.field1558[0] = null;
                    }
                    if (var7 != null) {
                        this.field1571.reset();
                        this.field1571.update(var7);
                        int var24 = (int) this.field1571.getValue();
                        if (arg2 != var24) {
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
                            this.method13(0, arg5, "Game updated - please reload page");
                            var25 = 10;
                        } else {
                            this.method13(0, arg5, var12 + " - Retrying in " + var25);
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
            return new Jagfile(var7, true);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method514(byte arg0) {
        int var2 = this.field1232 * 128 + 64;
        int var3 = this.field1233 * 128 + 64;
        int var4 = this.method542(this.field1479, var2, var3, this.field1607) - this.field1234;
        if (this.field1206 != arg0) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (this.field1509 < var2) {
            this.field1509 += (var2 - this.field1509) * this.field1236 / 1000 + this.field1235;
            if (this.field1509 > var2) {
                this.field1509 = var2;
            }
        }
        if (this.field1509 > var2) {
            this.field1509 -= (this.field1509 - var2) * this.field1236 / 1000 + this.field1235;
            if (this.field1509 < var2) {
                this.field1509 = var2;
            }
        }
        if (this.field1510 < var4) {
            this.field1510 += (var4 - this.field1510) * this.field1236 / 1000 + this.field1235;
            if (this.field1510 > var4) {
                this.field1510 = var4;
            }
        }
        if (this.field1510 > var4) {
            this.field1510 -= (this.field1510 - var4) * this.field1236 / 1000 + this.field1235;
            if (this.field1510 < var4) {
                this.field1510 = var4;
            }
        }
        if (this.field1511 < var3) {
            this.field1511 += (var3 - this.field1511) * this.field1236 / 1000 + this.field1235;
            if (this.field1511 > var3) {
                this.field1511 = var3;
            }
        }
        if (this.field1511 > var3) {
            this.field1511 -= (this.field1511 - var3) * this.field1236 / 1000 + this.field1235;
            if (this.field1511 < var3) {
                this.field1511 = var3;
            }
        }
        int var6 = this.field1367 * 128 + 64;
        int var7 = this.field1368 * 128 + 64;
        int var8 = this.method542(this.field1479, var6, var7, this.field1607) - this.field1369;
        int var9 = var6 - this.field1509;
        int var10 = var8 - this.field1510;
        int var11 = var7 - this.field1511;
        int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
        int var13 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 2047;
        int var14 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 2047;
        if (var13 < 128) {
            var13 = 128;
        }
        if (var13 > 383) {
            var13 = 383;
        }
        if (this.field1512 < var13) {
            this.field1512 += (var13 - this.field1512) * this.field1371 / 1000 + this.field1370;
            if (this.field1512 > var13) {
                this.field1512 = var13;
            }
        }
        if (this.field1512 > var13) {
            this.field1512 -= (this.field1512 - var13) * this.field1371 / 1000 + this.field1370;
            if (this.field1512 < var13) {
                this.field1512 = var13;
            }
        }
        int var15 = var14 - this.field1513;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 > 0) {
            this.field1513 += this.field1371 * var15 / 1000 + this.field1370;
            this.field1513 &= 2047;
        }
        if (var15 < 0) {
            this.field1513 -= -var15 * this.field1371 / 1000 + this.field1370;
            this.field1513 &= 2047;
        }
        int var16 = var14 - this.field1513;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 < 0 && var15 > 0 || var16 > 0 && var15 < 0) {
            this.field1513 = var14;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method515(int arg0, int arg1) {
        if (arg1 != 32215) {
            this.field1398 = -1;
        }
        Component var3 = Component.field70[arg0];
        for (int var4 = 0; var4 < var3.field92.length && var3.field92[var4] != -1; ++var4) {
            Component var5 = Component.field70[var3.field92[var4]];
            if (var5.field77 == 1) {
                this.method515(var5.field75, 32215);
            }
            var5.field73 = 0;
            var5.field74 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method516(int arg0) {
        if (arg0 == -19134) {
            if (super.field29 == 1) {
                if (super.field30 >= 539 && super.field30 <= 573 && super.field31 >= 169 && super.field31 < 205 && this.field1499[0] != -1) {
                    this.field1372 = true;
                    this.field1386 = 0;
                    this.field1421 = true;
                }
                if (super.field30 >= 569 && super.field30 <= 599 && super.field31 >= 168 && super.field31 < 205 && this.field1499[1] != -1) {
                    this.field1372 = true;
                    this.field1386 = 1;
                    this.field1421 = true;
                }
                if (super.field30 >= 597 && super.field30 <= 627 && super.field31 >= 168 && super.field31 < 205 && this.field1499[2] != -1) {
                    this.field1372 = true;
                    this.field1386 = 2;
                    this.field1421 = true;
                }
                if (super.field30 >= 625 && super.field30 <= 669 && super.field31 >= 168 && super.field31 < 203 && this.field1499[3] != -1) {
                    this.field1372 = true;
                    this.field1386 = 3;
                    this.field1421 = true;
                }
                if (super.field30 >= 666 && super.field30 <= 696 && super.field31 >= 168 && super.field31 < 205 && this.field1499[4] != -1) {
                    this.field1372 = true;
                    this.field1386 = 4;
                    this.field1421 = true;
                }
                if (super.field30 >= 694 && super.field30 <= 724 && super.field31 >= 168 && super.field31 < 205 && this.field1499[5] != -1) {
                    this.field1372 = true;
                    this.field1386 = 5;
                    this.field1421 = true;
                }
                if (super.field30 >= 722 && super.field30 <= 756 && super.field31 >= 169 && super.field31 < 205 && this.field1499[6] != -1) {
                    this.field1372 = true;
                    this.field1386 = 6;
                    this.field1421 = true;
                }
                if (super.field30 >= 540 && super.field30 <= 574 && super.field31 >= 466 && super.field31 < 502 && this.field1499[7] != -1) {
                    this.field1372 = true;
                    this.field1386 = 7;
                    this.field1421 = true;
                }
                if (super.field30 >= 572 && super.field30 <= 602 && super.field31 >= 466 && super.field31 < 503 && this.field1499[8] != -1) {
                    this.field1372 = true;
                    this.field1386 = 8;
                    this.field1421 = true;
                }
                if (super.field30 >= 599 && super.field30 <= 629 && super.field31 >= 466 && super.field31 < 503 && this.field1499[9] != -1) {
                    this.field1372 = true;
                    this.field1386 = 9;
                    this.field1421 = true;
                }
                if (super.field30 >= 627 && super.field30 <= 671 && super.field31 >= 467 && super.field31 < 502 && this.field1499[10] != -1) {
                    this.field1372 = true;
                    this.field1386 = 10;
                    this.field1421 = true;
                }
                if (super.field30 >= 669 && super.field30 <= 699 && super.field31 >= 466 && super.field31 < 503 && this.field1499[11] != -1) {
                    this.field1372 = true;
                    this.field1386 = 11;
                    this.field1421 = true;
                }
                if (super.field30 >= 696 && super.field30 <= 726 && super.field31 >= 466 && super.field31 < 503 && this.field1499[12] != -1) {
                    this.field1372 = true;
                    this.field1386 = 12;
                    this.field1421 = true;
                }
                if (super.field30 >= 724 && super.field30 <= 758 && super.field31 >= 466 && super.field31 < 502 && this.field1499[13] != -1) {
                    this.field1372 = true;
                    this.field1386 = 13;
                    this.field1421 = true;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)Ljava/lang/String;")
    private static final String method517(boolean arg0, int arg1) {
        if (arg0) {
            throw new NullPointerException();
        } else {
            String var2 = String.valueOf(arg1);
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

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method518(int arg0) {
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 != 0) {
            this.field1398 = this.field1418.method239();
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method519(int arg0) {
        if (arg0 <= 0) {
            field1290 = -181;
        }
        while (true) {
            OnDemandRequest var2 = this.field1209.method291();
            if (var2 == null) {
                return;
            }
            if (var2.field730 == 0) {
                Model.method137(var2.field732, var2.field731, 0);
                if ((this.field1209.method287(var2.field731, (byte) 1) & 98) != 0) {
                    this.field1372 = true;
                    if (this.field1402 != -1) {
                        this.field1217 = true;
                    }
                }
            }
            if (var2.field730 == 1 && var2.field732 != null) {
                AnimFrame.method59(var2.field732, 473);
            }
            if (var2.field730 == 2 && this.field1596 == var2.field731 && var2.field732 != null) {
                this.method540(this.field1323, var2.field732, this.field1597);
            }
            if (var2.field730 == 3 && this.field1568 == 1) {
                for (int var3 = 0; var3 < this.field1417.length; ++var3) {
                    if (this.field1475[var3] == var2.field731) {
                        this.field1417[var3] = var2.field732;
                        if (var2.field732 == null) {
                            this.field1475[var3] = -1;
                        }
                        break;
                    }
                    if (this.field1476[var3] == var2.field731) {
                        this.field1395[var3] = var2.field732;
                        if (var2.field732 == null) {
                            this.field1476[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field730 == 93 && this.field1209.method286(var2.field731, 30646)) {
                World.method17(this.field1209, new Packet(16, var2.field732), 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILmb;)V")
    private final void method520(int arg0, int arg1, Packet arg2) {
        arg2.method249((byte) 2);
        int var4 = arg2.method250(1, (byte) -20);
        if (arg1 < 2 || arg1 > 2) {
            this.field1317 = !this.field1317;
        }
        if (var4 != 0) {
            int var5 = arg2.method250(2, (byte) -20);
            if (var5 == 0) {
                this.field1440[this.field1439++] = this.field1435;
            } else if (var5 == 1) {
                int var6 = arg2.method250(3, (byte) -20);
                field1642.method125(this.field1633, var6, false);
                int var7 = arg2.method250(1, (byte) -20);
                if (var7 == 1) {
                    this.field1440[this.field1439++] = this.field1435;
                }
            } else if (var5 == 2) {
                int var8 = arg2.method250(3, (byte) -20);
                field1642.method125(this.field1633, var8, true);
                int var9 = arg2.method250(3, (byte) -20);
                field1642.method125(this.field1633, var9, true);
                int var10 = arg2.method250(1, (byte) -20);
                if (var10 == 1) {
                    this.field1440[this.field1439++] = this.field1435;
                }
            } else if (var5 == 3) {
                this.field1607 = arg2.method250(2, (byte) -20);
                int var11 = arg2.method250(7, (byte) -20);
                int var12 = arg2.method250(7, (byte) -20);
                int var13 = arg2.method250(1, (byte) -20);
                field1642.method124(var13 == 1, var12, var11, 3);
                int var14 = arg2.method250(1, (byte) -20);
                if (var14 == 1) {
                    this.field1440[this.field1439++] = this.field1435;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method521(byte arg0) {
        this.field1461.method228(58, 0);
        if (this.field1394 != -1) {
            this.field1394 = -1;
            this.field1372 = true;
            this.field1223 = false;
            this.field1421 = true;
        }
        if (this.field1402 != -1) {
            this.field1402 = -1;
            this.field1217 = true;
            this.field1223 = false;
        }
        this.field1422 = -1;
        if (arg0 != 1) {
            this.field1398 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method522(int arg0) {
        this.field1269.method268(false);
        Pix3D.field652 = this.field1621;
        this.field1338.method212(0, -48420, 0);
        if (arg0 >= 0) {
            this.field1461.method229(214);
        }
        if (this.field1394 != -1) {
            this.method543(false, 0, 0, Component.field70[this.field1394], 0);
        } else if (this.field1499[this.field1386] != -1) {
            this.method543(false, 0, 0, Component.field70[this.field1499[this.field1386]], 0);
        }
        if (this.field1432 && this.field1277 == 1) {
            this.method457(-419);
        }
        this.field1269.method269(super.field15, 205, false, 553);
        this.field1271.method268(false);
        Pix3D.field652 = this.field1622;
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method523(int arg0) {
        byte[] var2 = this.field1352.method309("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1627.method268(false);
        var3.method197((byte) 0, 0, 0);
        this.field1628.method268(false);
        var3.method197((byte) 0, 0, -637);
        this.field1624.method268(false);
        var3.method197((byte) 0, 0, -128);
        this.field1625.method268(false);
        var3.method197((byte) 0, -371, -202);
        this.field1626.method268(false);
        var3.method197((byte) 0, -171, -202);
        this.field1629.method268(false);
        var3.method197((byte) 0, -265, 0);
        this.field1630.method268(false);
        var3.method197((byte) 0, -265, -562);
        this.field1631.method268(false);
        var3.method197((byte) 0, -171, -128);
        this.field1632.method268(false);
        var3.method197((byte) 0, -171, -562);
        int[] var4 = new int[var3.field670];
        for (int var5 = 0; var5 < var3.field671; ++var5) {
            for (int var10 = 0; var10 < var3.field670; ++var10) {
                var4[var10] = var3.field669[var3.field670 * var5 + (var3.field670 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field670; ++var11) {
                var3.field669[var3.field670 * var5 + var11] = var4[var11];
            }
        }
        this.field1627.method268(false);
        var3.method197((byte) 0, 0, 382);
        this.field1628.method268(false);
        var3.method197((byte) 0, 0, -255);
        this.field1624.method268(false);
        var3.method197((byte) 0, 0, 254);
        this.field1625.method268(false);
        var3.method197((byte) 0, -371, 180);
        this.field1626.method268(false);
        var3.method197((byte) 0, -171, 180);
        this.field1629.method268(false);
        var3.method197((byte) 0, -265, 382);
        this.field1630.method268(false);
        var3.method197((byte) 0, -265, -180);
        this.field1631.method268(false);
        var3.method197((byte) 0, -171, 254);
        this.field1632.method268(false);
        var3.method197((byte) 0, -171, -180);
        Pix32 var6 = new Pix32(this.field1352, "logo", 0);
        this.field1624.method268(false);
        var6.method199(382 - var6.field670 / 2 - 128, -48420, 18);
        Object var7 = null;
        this.field1397 += arg0;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field18 != null) {
                    return new URL("http://127.0.0.1:" + (field1300 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method524(boolean arg0) {
        this.field1316 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1215) {
                ++this.field1335;
                this.method482(-79);
                this.method482(-79);
                this.method544(-593);
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
        this.field1316 = false;
        this.field1448 &= arg0;
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method525(int arg0) {
        try {
            if (this.field1205 != null) {
                this.field1205.method38();
            }
        } catch (Exception var3) {
        }
        this.field1205 = null;
        this.field1448 = false;
        this.field1646 = 0;
        this.field1585 = "";
        this.field1586 = "";
        InputTracking.method45((byte) 2);
        if (arg0 != 0) {
            this.field1461.method229(230);
        }
        this.method529(208);
        this.field1227.method64(true);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field1637[var2].method361(27237);
        }
        System.gc();
        this.method518(0);
        this.field1314 = -1;
        this.field1596 = -1;
        this.field1467 = 0;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method526(int arg0, int arg1) {
        if (arg0 != 8) {
            this.field1616 = null;
        }
        if (arg1 >= 0) {
            if (this.field1594) {
                this.field1594 = false;
                this.field1217 = true;
            }
            int var3 = this.field1539[arg1];
            int var4 = this.field1540[arg1];
            int var5 = this.field1541[arg1];
            int var6 = this.field1542[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 274) {
                Component var7 = Component.field70[var4];
                this.field1263 = 1;
                this.field1264 = var4;
                this.field1265 = var7.field130;
                this.field1285 = 0;
                this.field1372 = true;
                String var8 = var7.field128;
                if (var8.indexOf(" ") != -1) {
                    var8 = var8.substring(0, var8.indexOf(" "));
                }
                String var9 = var7.field128;
                if (var9.indexOf(" ") != -1) {
                    var9 = var9.substring(var9.indexOf(" ") + 1);
                }
                this.field1266 = var8 + " " + var7.field129 + " " + var9;
                if (this.field1265 == 16) {
                    this.field1372 = true;
                    this.field1386 = 3;
                    this.field1421 = true;
                }
            } else {
                if (var5 == 231) {
                    Component var10 = Component.field70[var4];
                    boolean var11 = true;
                    if (var10.field79 > 0) {
                        var11 = this.method509(this.field1226, var10);
                    }
                    if (var11) {
                        this.field1461.method228(244, 0);
                        this.field1461.method230(var4);
                    }
                }
                if (var5 == 240) {
                    NpcEntity var12 = this.field1426[var6];
                    if (var12 != null) {
                        this.method442(2, 0, field1642.field459[0], 0, var12.field460[0], false, field1642.field460[0], 0, 0, var12.field459[0], 1, 1);
                        this.field1610 = super.field30;
                        this.field1611 = super.field31;
                        this.field1613 = 2;
                        this.field1612 = 0;
                        this.field1461.method228(231, 0);
                        this.field1461.method230(var6);
                        this.field1461.method230(this.field1264);
                    }
                }
                if (var5 == 639 || var5 == 499 || var5 == 27 || var5 == 387 || var5 == 185) {
                    PlayerEntity var13 = this.field1436[var6];
                    if (var13 != null) {
                        this.method442(2, 0, field1642.field459[0], 0, var13.field460[0], false, field1642.field460[0], 0, 0, var13.field459[0], 1, 1);
                        this.field1610 = super.field30;
                        this.field1611 = super.field31;
                        this.field1613 = 2;
                        this.field1612 = 0;
                        if (var5 == 387) {
                            field1599 += var6;
                            if (field1599 >= 66) {
                                this.field1461.method228(233, 0);
                                this.field1461.method229(154);
                            }
                            this.field1461.method228(72, 0);
                        }
                        if (var5 == 499) {
                            this.field1461.method228(17, 0);
                        }
                        if (var5 == 27) {
                            this.field1461.method228(18, 0);
                        }
                        if (var5 == 185) {
                            this.field1461.method228(230, 0);
                        }
                        if (var5 == 639) {
                            ++field1429;
                            if (field1429 >= 52) {
                                this.field1461.method228(121, 0);
                                this.field1461.method229(131);
                            }
                            this.field1461.method228(192, 0);
                        }
                        this.field1461.method230(var6);
                    }
                }
                if (var5 == 1152) {
                    ObjType var14 = ObjType.method350(var6);
                    String var15;
                    if (var14.field1033 != null) {
                        var15 = new String(var14.field1033);
                    } else {
                        var15 = "It's a " + var14.field1032 + ".";
                    }
                    this.method465(-547, "", var15, 0);
                }
                if (var5 == 721) {
                    field1420 += var4;
                    if (field1420 >= 139) {
                        this.field1461.method228(28, 0);
                        this.field1461.method233(0);
                    }
                    this.method466(213, var4, var6, this.field1430, var3);
                }
                if (var5 == 357) {
                    this.method466(87, var4, var6, this.field1430, var3);
                }
                if (var5 == 563) {
                    this.field1461.method228(102, 0);
                    this.field1461.method230(var6);
                    this.field1461.method230(var3);
                    this.field1461.method230(var4);
                    this.field1461.method230(this.field1264);
                    this.field1482 = 0;
                    this.field1483 = var4;
                    this.field1484 = var3;
                    this.field1485 = 2;
                    if (Component.field70[var4].field76 == this.field1422) {
                        this.field1485 = 1;
                    }
                    if (Component.field70[var4].field76 == this.field1402) {
                        this.field1485 = 3;
                    }
                }
                if (var5 == 398) {
                    this.field1461.method228(200, 0);
                    this.field1461.method230(var6);
                    this.field1461.method230(var3);
                    this.field1461.method230(var4);
                    this.field1461.method230(this.field1288);
                    this.field1461.method230(this.field1286);
                    this.field1461.method230(this.field1287);
                    this.field1482 = 0;
                    this.field1483 = var4;
                    this.field1484 = var3;
                    this.field1485 = 2;
                    if (Component.field70[var4].field76 == this.field1422) {
                        this.field1485 = 1;
                    }
                    if (Component.field70[var4].field76 == this.field1402) {
                        this.field1485 = 3;
                    }
                }
                if (var5 == 507 || var5 == 957) {
                    String var16 = this.field1655[arg1];
                    int var17 = var16.indexOf("@whi@");
                    if (var17 != -1) {
                        String var18 = var16.substring(var17 + 5).trim();
                        String var19 = JString.method314(true, JString.method311((byte) -49, JString.method310(var18)));
                        boolean var20 = false;
                        for (int var21 = 0; var21 < this.field1437; ++var21) {
                            PlayerEntity var22 = this.field1436[this.field1438[var21]];
                            if (var22 != null && var22.field468 != null && var22.field468.equalsIgnoreCase(var19)) {
                                this.method442(2, 0, field1642.field459[0], 0, var22.field460[0], false, field1642.field460[0], 0, 0, var22.field459[0], 1, 1);
                                if (var5 == 507) {
                                    field1599 += var6;
                                    if (field1599 >= 66) {
                                        this.field1461.method228(233, 0);
                                        this.field1461.method229(154);
                                    }
                                    this.field1461.method228(72, 0);
                                }
                                if (var5 == 957) {
                                    ++field1429;
                                    if (field1429 >= 52) {
                                        this.field1461.method228(121, 0);
                                        this.field1461.method229(131);
                                    }
                                    this.field1461.method228(192, 0);
                                }
                                this.field1461.method230(this.field1438[var21]);
                                var20 = true;
                                break;
                            }
                        }
                        if (!var20) {
                            this.method465(-547, "", "Unable to find " + var19, 0);
                        }
                    }
                }
                if (var5 == 810 && this.method466(240, var4, var6, this.field1430, var3)) {
                    this.field1461.method230(this.field1288);
                    this.field1461.method230(this.field1286);
                    this.field1461.method230(this.field1287);
                }
                if (var5 == 902) {
                    String var23 = this.field1655[arg1];
                    int var24 = var23.indexOf("@whi@");
                    if (var24 != -1) {
                        long var25 = JString.method310(var23.substring(var24 + 5).trim());
                        int var27 = -1;
                        for (int var28 = 0; var28 < this.field1491; ++var28) {
                            if (this.field1385[var28] == var25) {
                                var27 = var28;
                                break;
                            }
                        }
                        if (var27 != -1 && this.field1365[var27] > 0) {
                            this.field1217 = true;
                            this.field1594 = false;
                            this.field1653 = true;
                            this.field1636 = "";
                            this.field1328 = 3;
                            this.field1199 = this.field1385[var27];
                            this.field1496 = "Enter message to send to " + this.field1219[var27];
                        }
                    }
                }
                if (var5 == 899 && this.method466(26, var4, var6, this.field1430, var3)) {
                    this.field1461.method230(this.field1264);
                }
                if (var5 == 1071) {
                    this.method466(147, var4, var6, this.field1430, var3);
                }
                if (var5 == 1328) {
                    ObjType var29 = ObjType.method350(var6);
                    Component var30 = Component.field70[var4];
                    String var31;
                    if (var30 != null && var30.field72[var3] >= 100000) {
                        var31 = var30.field72[var3] + " x " + var29.field1032;
                    } else if (var29.field1033 != null) {
                        var31 = new String(var29.field1033);
                    } else {
                        var31 = "It's a " + var29.field1032 + ".";
                    }
                    this.method465(-547, "", var31, 0);
                }
                if (var5 == 829) {
                    NpcEntity var32 = this.field1426[var6];
                    if (var32 != null) {
                        this.method442(2, 0, field1642.field459[0], 0, var32.field460[0], false, field1642.field460[0], 0, 0, var32.field459[0], 1, 1);
                        this.field1610 = super.field30;
                        this.field1611 = super.field31;
                        this.field1613 = 2;
                        this.field1612 = 0;
                        this.field1461.method228(119, 0);
                        this.field1461.method230(var6);
                        this.field1461.method230(this.field1288);
                        this.field1461.method230(this.field1286);
                        this.field1461.method230(this.field1287);
                    }
                }
                if (var5 == 131) {
                    PlayerEntity var33 = this.field1436[var6];
                    if (var33 != null) {
                        this.method442(2, 0, field1642.field459[0], 0, var33.field460[0], false, field1642.field460[0], 0, 0, var33.field459[0], 1, 1);
                        this.field1610 = super.field30;
                        this.field1611 = super.field31;
                        this.field1613 = 2;
                        this.field1612 = 0;
                        this.field1461.method228(68, 0);
                        this.field1461.method230(var6);
                        this.field1461.method230(this.field1264);
                    }
                }
                if (var5 == 524) {
                    String var34 = this.field1655[arg1];
                    int var35 = var34.indexOf("@whi@");
                    if (var35 != -1) {
                        this.method521((byte) 1);
                        this.field1593 = var34.substring(var35 + 5).trim();
                        this.field1362 = false;
                        for (int var36 = 0; var36 < Component.field70.length; ++var36) {
                            if (Component.field70[var36] != null && Component.field70[var36].field79 == 600) {
                                this.field1332 = this.field1422 = Component.field70[var36].field76;
                                break;
                            }
                        }
                    }
                }
                if (var5 == 743) {
                    ++field1298;
                    if (field1298 >= 124) {
                        this.field1461.method228(77, 0);
                        this.field1461.method230(37954);
                    }
                    this.method466(98, var4, var6, this.field1430, var3);
                }
                if (var5 == 102) {
                    this.field1285 = 1;
                    this.field1286 = var3;
                    this.field1287 = var4;
                    this.field1288 = var6;
                    this.field1289 = ObjType.method350(var6).field1032;
                    this.field1263 = 0;
                    this.field1372 = true;
                } else {
                    if (var5 == 225) {
                        this.field1461.method228(244, 0);
                        this.field1461.method230(var4);
                        Component var37 = Component.field70[var4];
                        if (var37.field85 != null && var37.field85[0][0] == 5) {
                            int var38 = var37.field85[0][1];
                            if (this.field1361[var38] != var37.field87[0]) {
                                this.field1361[var38] = var37.field87[0];
                                this.method559(var38, 4363);
                                this.field1372 = true;
                            }
                        }
                    }
                    if (var5 == 625) {
                        this.method466(33, var4, var6, this.field1430, var3);
                    }
                    if (var5 == 435) {
                        this.field1461.method228(244, 0);
                        this.field1461.method230(var4);
                        Component var39 = Component.field70[var4];
                        if (var39.field85 != null && var39.field85[0][0] == 5) {
                            int var40 = var39.field85[0][1];
                            this.field1361[var40] = 1 - this.field1361[var40];
                            this.method559(var40, 4363);
                            this.field1372 = true;
                        }
                    }
                    if (var5 == 605 || var5 == 47 || var5 == 513 || var5 == 884) {
                        String var41 = this.field1655[arg1];
                        int var42 = var41.indexOf("@whi@");
                        if (var42 != -1) {
                            long var43 = JString.method310(var41.substring(var42 + 5).trim());
                            if (var5 == 605) {
                                this.method495(true, var43);
                            }
                            if (var5 == 47) {
                                this.method557(false, var43);
                            }
                            if (var5 == 513) {
                                this.method558((byte) 106, var43);
                            }
                            if (var5 == 884) {
                                this.method460(var43, -27945);
                            }
                        }
                    }
                    if (var5 == 242 || var5 == 209 || var5 == 309 || var5 == 852 || var5 == 793) {
                        NpcEntity var45 = this.field1426[var6];
                        if (var45 != null) {
                            this.method442(2, 0, field1642.field459[0], 0, var45.field460[0], false, field1642.field460[0], 0, 0, var45.field459[0], 1, 1);
                            this.field1610 = super.field30;
                            this.field1611 = super.field31;
                            this.field1613 = 2;
                            this.field1612 = 0;
                            if (var5 == 309) {
                                this.field1461.method228(69, 0);
                            }
                            if (var5 == 242) {
                                this.field1461.method228(143, 0);
                            }
                            if (var5 == 793) {
                                this.field1461.method228(118, 0);
                            }
                            if (var5 == 209) {
                                this.field1461.method228(195, 0);
                            }
                            if (var5 == 852) {
                                this.field1461.method228(122, 0);
                            }
                            this.field1461.method230(var6);
                        }
                    }
                    if (var5 == 582 || var5 == 113 || var5 == 555 || var5 == 331 || var5 == 354) {
                        if (var5 == 555) {
                            this.field1461.method228(59, 0);
                        }
                        if (var5 == 582) {
                            if ((var6 & 3) == 0) {
                                ++field1239;
                            }
                            if (field1239 >= 133) {
                                this.field1461.method228(131, 0);
                                this.field1461.method230(6118);
                            }
                            this.field1461.method228(181, 0);
                        }
                        if (var5 == 331) {
                            this.field1461.method228(160, 0);
                        }
                        if (var5 == 354) {
                            this.field1461.method228(62, 0);
                        }
                        if (var5 == 113) {
                            this.field1461.method228(70, 0);
                        }
                        this.field1461.method230(var6);
                        this.field1461.method230(var3);
                        this.field1461.method230(var4);
                        this.field1482 = 0;
                        this.field1483 = var4;
                        this.field1484 = var3;
                        this.field1485 = 2;
                        if (Component.field70[var4].field76 == this.field1422) {
                            this.field1485 = 1;
                        }
                        if (Component.field70[var4].field76 == this.field1402) {
                            this.field1485 = 3;
                        }
                    }
                    if (var5 == 111) {
                        boolean var46 = this.method442(2, 0, field1642.field459[0], 0, var4, false, field1642.field460[0], 0, 0, var3, 0, 0);
                        if (!var46) {
                            this.method442(2, 0, field1642.field459[0], 0, var4, false, field1642.field460[0], 0, 0, var3, 1, 1);
                        }
                        this.field1610 = super.field30;
                        this.field1611 = super.field31;
                        this.field1613 = 2;
                        this.field1612 = 0;
                        this.field1461.method228(245, 0);
                        this.field1461.method230(this.field1503 + var3);
                        this.field1461.method230(this.field1504 + var4);
                        this.field1461.method230(var6);
                        this.field1461.method230(this.field1288);
                        this.field1461.method230(this.field1286);
                        this.field1461.method230(this.field1287);
                    }
                    if (var5 == 1714) {
                        NpcEntity var48 = this.field1426[var6];
                        if (var48 != null) {
                            String var49;
                            if (var48.field464.field993 != null) {
                                var49 = new String(var48.field464.field993);
                            } else {
                                var49 = "It's a " + var48.field464.field992 + ".";
                            }
                            this.method465(-547, "", var49, 0);
                        }
                    }
                    if (var5 == 718) {
                        if (!this.field1432) {
                            this.field1227.method102(-110, super.field30 - 4, super.field31 - 4);
                        } else {
                            this.field1227.method102(-110, var3 - 4, var4 - 4);
                        }
                    }
                    if (var5 == 1381) {
                        int var50 = var6 >> 14 & 32767;
                        LocType var51 = LocType.method334(var50);
                        String var52;
                        if (var51.field944 != null) {
                            var52 = new String(var51.field944);
                        } else {
                            var52 = "It's a " + var51.field943 + ".";
                        }
                        this.method465(-547, "", var52, 0);
                    }
                    if (var5 == 694 || var5 == 962 || var5 == 795 || var5 == 681 || var5 == 100) {
                        if (var5 == 681) {
                            ++field1262;
                            if (field1262 >= 116) {
                                this.field1461.method228(162, 0);
                                this.field1461.method232(13018169);
                            }
                            this.field1461.method228(163, 0);
                        }
                        if (var5 == 694) {
                            this.field1461.method228(243, 0);
                        }
                        if (var5 == 100) {
                            this.field1461.method228(74, 0);
                        }
                        if (var5 == 962) {
                            this.field1461.method228(228, 0);
                        }
                        if (var5 == 795) {
                            this.field1461.method228(80, 0);
                        }
                        this.field1461.method230(var6);
                        this.field1461.method230(var3);
                        this.field1461.method230(var4);
                        this.field1482 = 0;
                        this.field1483 = var4;
                        this.field1484 = var3;
                        this.field1485 = 2;
                        if (Component.field70[var4].field76 == this.field1422) {
                            this.field1485 = 1;
                        }
                        if (Component.field70[var4].field76 == this.field1402) {
                            this.field1485 = 3;
                        }
                    }
                    if (var5 == 997 && !this.field1223) {
                        this.field1461.method228(146, 0);
                        this.field1461.method230(var4);
                        this.field1223 = true;
                    }
                    if (var5 == 139 || var5 == 778 || var5 == 617 || var5 == 224 || var5 == 662) {
                        boolean var53 = this.method442(2, 0, field1642.field459[0], 0, var4, false, field1642.field460[0], 0, 0, var3, 0, 0);
                        if (!var53) {
                            this.method442(2, 0, field1642.field459[0], 0, var4, false, field1642.field460[0], 0, 0, var3, 1, 1);
                        }
                        this.field1610 = super.field30;
                        this.field1611 = super.field31;
                        this.field1613 = 2;
                        this.field1612 = 0;
                        if (var5 == 617) {
                            this.field1461.method228(178, 0);
                        }
                        if (var5 == 139) {
                            if ((var3 & 3) == 0) {
                                ++field1356;
                            }
                            if (field1356 >= 123) {
                                this.field1461.method228(187, 0);
                                this.field1461.method233(0);
                            }
                            this.field1461.method228(141, 0);
                        }
                        if (var5 == 662) {
                            field1554 += this.field1504;
                            if (field1554 >= 118) {
                                this.field1461.method228(56, 0);
                                this.field1461.method233(0);
                            }
                            this.field1461.method228(97, 0);
                        }
                        if (var5 == 224) {
                            field1387 += var4;
                            if (field1387 >= 75) {
                                this.field1461.method228(206, 0);
                                this.field1461.method229(19);
                            }
                            this.field1461.method228(47, 0);
                        }
                        if (var5 == 778) {
                            this.field1461.method228(67, 0);
                        }
                        this.field1461.method230(this.field1503 + var3);
                        this.field1461.method230(this.field1504 + var4);
                        this.field1461.method230(var6);
                    }
                    if (var5 == 737) {
                        this.method521((byte) 1);
                    }
                    if (var5 == 275) {
                        PlayerEntity var55 = this.field1436[var6];
                        if (var55 != null) {
                            this.method442(2, 0, field1642.field459[0], 0, var55.field460[0], false, field1642.field460[0], 0, 0, var55.field459[0], 1, 1);
                            this.field1610 = super.field30;
                            this.field1611 = super.field31;
                            this.field1613 = 2;
                            this.field1612 = 0;
                            this.field1461.method228(113, 0);
                            this.field1461.method230(var6);
                            this.field1461.method230(this.field1288);
                            this.field1461.method230(this.field1286);
                            this.field1461.method230(this.field1287);
                        }
                    }
                    if (var5 == 370) {
                        boolean var56 = this.method442(2, 0, field1642.field459[0], 0, var4, false, field1642.field460[0], 0, 0, var3, 0, 0);
                        if (!var56) {
                            this.method442(2, 0, field1642.field459[0], 0, var4, false, field1642.field460[0], 0, 0, var3, 1, 1);
                        }
                        this.field1610 = super.field30;
                        this.field1611 = super.field31;
                        this.field1613 = 2;
                        this.field1612 = 0;
                        this.field1461.method228(202, 0);
                        this.field1461.method230(this.field1503 + var3);
                        this.field1461.method230(this.field1504 + var4);
                        this.field1461.method230(var6);
                        this.field1461.method230(this.field1264);
                    }
                    this.field1285 = 0;
                    this.field1263 = 0;
                    this.field1372 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZLmb;)V")
    private final void method527(int arg0, boolean arg1, Packet arg2) {
        while (true) {
            if (arg2.field718 + 21 < arg0 * 8) {
                int var4 = arg2.method250(14, (byte) -20);
                if (var4 != 16383) {
                    if (this.field1426[var4] == null) {
                        this.field1426[var4] = new NpcEntity();
                    }
                    NpcEntity var5 = this.field1426[var4];
                    this.field1428[this.field1427++] = var4;
                    var5.field454 = field1618;
                    var5.field464 = NpcType.method344(arg2.method250(11, (byte) -20));
                    var5.field413 = var5.field464.field994;
                    var5.field457 = var5.field464.field1016;
                    var5.field416 = var5.field464.field998;
                    var5.field417 = var5.field464.field999;
                    var5.field418 = var5.field464.field1000;
                    var5.field419 = var5.field464.field1001;
                    var5.field414 = var5.field464.field997;
                    int var6 = arg2.method250(5, (byte) -20);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg2.method250(5, (byte) -20);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var5.method124(false, field1642.field460[0] + var7, field1642.field459[0] + var6, 3);
                    int var8 = arg2.method250(1, (byte) -20);
                    if (var8 == 1) {
                        this.field1440[this.field1439++] = var4;
                    }
                    continue;
                }
            }
            arg2.method251(980);
            if (!arg1) {
                this.field1216 = !this.field1216;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method528(int arg0) {
        ++field1531;
        if (arg0 != 8) {
            this.field1616 = null;
        }
        if (field1531 > 192) {
            field1531 = 0;
            this.field1461.method228(226, 0);
            this.field1461.method229(232);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method5(716);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field1422 != -1 && this.field1422 == this.field1332) {
                        if (var2 == 8 && this.field1593.length() > 0) {
                            this.field1593 = this.field1593.substring(0, this.field1593.length() - 1);
                        }
                        break;
                    }
                    if (this.field1653) {
                        if (var2 >= 32 && var2 <= 122 && this.field1636.length() < 80) {
                            this.field1636 = this.field1636 + (char) var2;
                            this.field1217 = true;
                        }
                        if (var2 == 8 && this.field1636.length() > 0) {
                            this.field1636 = this.field1636.substring(0, this.field1636.length() - 1);
                            this.field1217 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field1653 = false;
                            this.field1217 = true;
                            if (this.field1328 == 1) {
                                long var3 = JString.method310(this.field1636);
                                this.method495(true, var3);
                            }
                            if (this.field1328 == 2 && this.field1491 > 0) {
                                long var5 = JString.method310(this.field1636);
                                this.method558((byte) 106, var5);
                            }
                            if (this.field1328 == 3 && this.field1636.length() > 0) {
                                this.field1461.method228(214, 0);
                                this.field1461.method229(0);
                                int var7 = this.field1461.field717;
                                this.field1461.method235((byte) -58, this.field1199);
                                WordPack.method318(this.field1636, this.field1461, 8);
                                this.field1461.method238(this.field1461.field717 - var7, (byte) 7);
                                this.field1636 = JString.method315(this.field1636, -624);
                                this.field1636 = WordFilter.method403(this.field1636, false);
                                this.method465(-547, JString.method314(true, JString.method311((byte) -49, this.field1199)), this.field1636, 6);
                                if (this.field1497 == 2) {
                                    this.field1497 = 1;
                                    this.field1528 = true;
                                    this.field1461.method228(129, 0);
                                    this.field1461.method229(this.field1214);
                                    this.field1461.method229(this.field1497);
                                    this.field1461.method229(this.field1229);
                                }
                            }
                            if (this.field1328 == 4 && this.field1530 < 100) {
                                long var8 = JString.method310(this.field1636);
                                this.method557(false, var8);
                            }
                            if (this.field1328 == 5 && this.field1530 > 0) {
                                long var10 = JString.method310(this.field1636);
                                this.method460(var10, -27945);
                            }
                        }
                    } else if (this.field1594) {
                        if (var2 >= 48 && var2 <= 57 && this.field1640.length() < 10) {
                            this.field1640 = this.field1640 + (char) var2;
                            this.field1217 = true;
                        }
                        if (var2 == 8 && this.field1640.length() > 0) {
                            this.field1640 = this.field1640.substring(0, this.field1640.length() - 1);
                            this.field1217 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field1640.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field1640);
                                } catch (Exception var17) {
                                }
                                this.field1461.method228(161, 0);
                                this.field1461.method233(var12);
                            }
                            this.field1594 = false;
                            this.field1217 = true;
                        }
                    } else if (this.field1402 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field1210.length() < 80) {
                            this.field1210 = this.field1210 + (char) var2;
                            this.field1217 = true;
                        }
                        if (var2 == 8 && this.field1210.length() > 0) {
                            this.field1210 = this.field1210.substring(0, this.field1210.length() - 1);
                            this.field1217 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field1210.length() > 0) {
                            if (this.field1563 == 2) {
                                if (this.field1210.equals("::clientdrop")) {
                                    this.method450(-889);
                                }
                                if (this.field1210.equals("::lag")) {
                                    this.method433(0);
                                }
                                if (this.field1210.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field1209.method282(2, (byte) 3); ++var13) {
                                        this.field1209.method292(2, var13, (byte) 1, 33601);
                                    }
                                }
                            }
                            if (this.field1210.startsWith("::")) {
                                this.field1461.method228(86, 0);
                                this.field1461.method229(this.field1210.length() - 1);
                                this.field1461.method236(this.field1210.substring(2));
                            } else {
                                byte var14 = 0;
                                if (this.field1210.startsWith("yellow:")) {
                                    var14 = 0;
                                    this.field1210 = this.field1210.substring(7);
                                }
                                if (this.field1210.startsWith("red:")) {
                                    var14 = 1;
                                    this.field1210 = this.field1210.substring(4);
                                }
                                if (this.field1210.startsWith("green:")) {
                                    var14 = 2;
                                    this.field1210 = this.field1210.substring(6);
                                }
                                if (this.field1210.startsWith("cyan:")) {
                                    var14 = 3;
                                    this.field1210 = this.field1210.substring(5);
                                }
                                if (this.field1210.startsWith("purple:")) {
                                    var14 = 4;
                                    this.field1210 = this.field1210.substring(7);
                                }
                                if (this.field1210.startsWith("white:")) {
                                    var14 = 5;
                                    this.field1210 = this.field1210.substring(6);
                                }
                                if (this.field1210.startsWith("flash1:")) {
                                    var14 = 6;
                                    this.field1210 = this.field1210.substring(7);
                                }
                                if (this.field1210.startsWith("flash2:")) {
                                    var14 = 7;
                                    this.field1210 = this.field1210.substring(7);
                                }
                                if (this.field1210.startsWith("flash3:")) {
                                    var14 = 8;
                                    this.field1210 = this.field1210.substring(7);
                                }
                                if (this.field1210.startsWith("glow1:")) {
                                    var14 = 9;
                                    this.field1210 = this.field1210.substring(6);
                                }
                                if (this.field1210.startsWith("glow2:")) {
                                    var14 = 10;
                                    this.field1210 = this.field1210.substring(6);
                                }
                                if (this.field1210.startsWith("glow3:")) {
                                    var14 = 11;
                                    this.field1210 = this.field1210.substring(6);
                                }
                                byte var15 = 0;
                                if (this.field1210.startsWith("wave:")) {
                                    var15 = 1;
                                    this.field1210 = this.field1210.substring(5);
                                }
                                if (this.field1210.startsWith("scroll:")) {
                                    var15 = 2;
                                    this.field1210 = this.field1210.substring(7);
                                }
                                this.field1461.method228(83, 0);
                                this.field1461.method229(0);
                                int var16 = this.field1461.field717;
                                this.field1461.method229(var14);
                                this.field1461.method229(var15);
                                WordPack.method318(this.field1210, this.field1461, 8);
                                this.field1461.method238(this.field1461.field717 - var16, (byte) 7);
                                this.field1210 = JString.method315(this.field1210, -624);
                                this.field1210 = WordFilter.method403(this.field1210, false);
                                field1642.field421 = this.field1210;
                                field1642.field423 = var14;
                                field1642.field424 = var15;
                                field1642.field422 = 150;
                                if (this.field1563 == 2) {
                                    this.method465(-547, "@cr2@" + field1642.field468, field1642.field421, 2);
                                } else if (this.field1563 == 1) {
                                    this.method465(-547, "@cr1@" + field1642.field468, field1642.field421, 2);
                                } else {
                                    this.method465(-547, field1642.field468, field1642.field421, 2);
                                }
                                if (this.field1214 == 2) {
                                    this.field1214 = 3;
                                    this.field1528 = true;
                                    this.field1461.method228(129, 0);
                                    this.field1461.method229(this.field1214);
                                    this.field1461.method229(this.field1497);
                                    this.field1461.method229(this.field1229);
                                }
                            }
                            this.field1210 = "";
                            this.field1217 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field1593.length() < 12) {
                this.field1593 = this.field1593 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method529(int arg0) {
        LocType.field974.method117();
        LocType.field975.method117();
        NpcType.field1017.method117();
        int var2 = 67 / arg0;
        ObjType.field1069.method117();
        ObjType.field1070.method117();
        PlayerEntity.field489.method117();
        SpotAnimType.field1155.method117();
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILd;)Z")
    public final boolean method530(int arg0, Component arg1) {
        if (arg0 != 11995) {
            this.method6();
        }
        if (arg1.field86 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field86.length; ++var3) {
                int var4 = this.method476(arg1, (byte) 6, var3);
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
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILbb;)V")
    public final void method531(int arg0, int arg1, int arg2, int arg3, PlayerEntity arg4) {
        if (field1642 != arg4) {
            if (this.field1553 < 400) {
                String var6 = arg4.field468 + method440(arg4.field474, field1642.field474, 0) + " (level-" + arg4.field474 + ")";
                if (this.field1285 == 1) {
                    this.field1655[this.field1553] = "Use " + this.field1289 + " with @whi@" + var6;
                    this.field1541[this.field1553] = 275;
                    this.field1542[this.field1553] = arg0;
                    this.field1539[this.field1553] = arg3;
                    this.field1540[this.field1553] = arg1;
                    ++this.field1553;
                } else if (this.field1263 == 1) {
                    if ((this.field1265 & 8) == 8) {
                        this.field1655[this.field1553] = this.field1266 + " @whi@" + var6;
                        this.field1541[this.field1553] = 131;
                        this.field1542[this.field1553] = arg0;
                        this.field1539[this.field1553] = arg3;
                        this.field1540[this.field1553] = arg1;
                        ++this.field1553;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field1309[var7] != null) {
                            this.field1655[this.field1553] = this.field1309[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field1309[var7].equalsIgnoreCase("attack")) {
                                if (arg4.field474 > field1642.field474) {
                                    var9 = 2000;
                                }
                            } else if (this.field1310[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field1541[this.field1553] = var9 + 639;
                            }
                            if (var7 == 1) {
                                this.field1541[this.field1553] = var9 + 499;
                            }
                            if (var7 == 2) {
                                this.field1541[this.field1553] = var9 + 27;
                            }
                            if (var7 == 3) {
                                this.field1541[this.field1553] = var9 + 387;
                            }
                            if (var7 == 4) {
                                this.field1541[this.field1553] = var9 + 185;
                            }
                            this.field1542[this.field1553] = arg0;
                            this.field1539[this.field1553] = arg3;
                            this.field1540[this.field1553] = arg1;
                            ++this.field1553;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field1553; ++var8) {
                    if (this.field1541[var8] == 718) {
                        this.field1655[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                while (arg2 >= 0) {
                    this.field1398 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IZLmb;)V")
    private final void method532(int arg0, boolean arg1, Packet arg2) {
        for (int var4 = 0; var4 < this.field1439; ++var4) {
            int var5 = this.field1440[var4];
            PlayerEntity var6 = this.field1436[var5];
            int var7 = arg2.method239();
            if ((var7 & 128) == 128) {
                var7 += arg2.method239() << 8;
            }
            this.method498(this.field1411, var5, var7, var6, arg2);
        }
        if (!arg1) {
            this.field1398 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    private final void method533(boolean arg0) {
        if (arg0) {
            this.field1634 = 255;
        }
        for (LocSpawned var2 = (LocSpawned) this.field1569.method258(); var2 != null; var2 = (LocSpawned) this.field1569.method260(-536)) {
            if (var2.field746 == -1) {
                var2.field745 = 0;
                this.method446(550, var2);
            } else {
                var2.method120();
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method534(byte arg0) {
        Graphics var2 = this.method11(982).getGraphics();
        if (arg0 != -40) {
            this.field1398 = this.field1418.method239();
        }
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method4((byte) 6, 1);
        if (this.field1609) {
            this.field1215 = false;
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
        if (this.field1572) {
            this.field1215 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1344) {
            this.field1215 = false;
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZZ)V")
    public final void method535(boolean arg0, boolean arg1) {
        if (field1642.field409 >> 7 == this.field1650 && field1642.field410 >> 7 == this.field1651) {
            this.field1650 = 0;
            ++field1515;
            if (field1515 > 122) {
                field1515 = 0;
                this.field1461.method228(36, 0);
                this.field1461.method229(62);
            }
        }
        int var3 = this.field1437;
        if (arg0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg1) {
            var3 = 1;
        }
        for (int var5 = 0; var5 < var3; ++var5) {
            PlayerEntity var6;
            int var7;
            if (arg1) {
                var6 = field1642;
                var7 = this.field1435 << 14;
            } else {
                var6 = this.field1436[this.field1438[var5]];
                var7 = this.field1438[var5] << 14;
            }
            if (var6 != null && var6.method127(509)) {
                var6.field487 = false;
                if ((field1302 && this.field1437 > 50 || this.field1437 > 200) && !arg1 && var6.field434 == var6.field414) {
                    var6.field487 = true;
                }
                int var8 = var6.field409 >> 7;
                int var9 = var6.field410 >> 7;
                if (var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
                    if (var6.field482 != null && field1618 >= var6.field477 && field1618 < var6.field478) {
                        var6.field487 = false;
                        var6.field476 = this.method542(this.field1479, var6.field409, var6.field410, this.field1607);
                        this.field1227.method76(var6.field410, this.field1645, var6.field411, 60, var7, var6.field485, var6.field486, this.field1607, var6.field483, var6.field484, var6, var6.field476, var6.field409);
                    } else {
                        if ((var6.field409 & 127) == 64 && (var6.field410 & 127) == 64) {
                            if (this.field1649[var8][var9] == this.field1606) {
                                continue;
                            }
                            this.field1649[var8][var9] = this.field1606;
                        }
                        var6.field476 = this.method542(this.field1479, var6.field409, var6.field410, this.field1607);
                        this.field1227.method75(var7, var6.field409, var6.field476, var6, var6.field410, this.field1607, 60, -769, var6.field412, var6.field411);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIB)Z")
    public final boolean method536(int arg0, int arg1, byte arg2) {
        boolean var4 = false;
        Component var5 = Component.field70[arg0];
        for (int var6 = 0; var6 < var5.field92.length && var5.field92[var6] != -1; ++var6) {
            Component var7 = Component.field70[var5.field92[var6]];
            if (var7.field77 == 1) {
                var4 |= this.method536(var7.field75, arg1, (byte) -21);
            }
            if (var7.field77 == 6 && (var7.field123 != -1 || var7.field124 != -1)) {
                boolean var8 = this.method530(11995, var7);
                int var9;
                if (var8) {
                    var9 = var7.field124;
                } else {
                    var9 = var7.field123;
                }
                if (var9 != -1) {
                    SeqType var10 = SeqType.field1121[var9];
                    var7.field74 += arg1;
                    while (var7.field74 > var10.method384(var7.field73, (byte) 2)) {
                        var7.field74 -= var10.method384(var7.field73, (byte) 2) + 1;
                        ++var7.field73;
                        if (var7.field73 >= var10.field1122) {
                            var7.field73 -= var10.field1126;
                            if (var7.field73 < 0 || var7.field73 >= var10.field1122) {
                                var7.field73 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        if (arg2 != -21) {
            this.field1398 = this.field1418.method239();
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method537(int arg0) {
        SpotAnimEntity var2 = (SpotAnimEntity) this.field1341.method258();
        if (arg0 != 6) {
            this.field1461.method229(188);
        }
        while (var2 != null) {
            if (this.field1607 == var2.field616 && !var2.field622) {
                if (field1618 >= var2.field615) {
                    var2.method164(this.field1257, false);
                    if (var2.field622) {
                        var2.method120();
                    } else {
                        this.field1227.method75(-1, var2.field617, var2.field619, var2, var2.field618, var2.field616, 60, -769, false, 0);
                    }
                }
            } else {
                var2.method120();
            }
            var2 = (SpotAnimEntity) this.field1341.method260(-536);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;II)V")
    private final void method538(Packet arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field1241 = !this.field1241;
        }
        int var4 = arg0.method250(8, (byte) -20);
        if (var4 < this.field1437) {
            for (int var5 = var4; var5 < this.field1437; ++var5) {
                this.field1312[this.field1311++] = this.field1438[var5];
            }
        }
        if (var4 > this.field1437) {
            signlink.reporterror(this.field1585 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1437 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1438[var6];
                PlayerEntity var8 = this.field1436[var7];
                int var9 = arg0.method250(1, (byte) -20);
                if (var9 == 0) {
                    this.field1438[this.field1437++] = var7;
                    var8.field454 = field1618;
                } else {
                    int var10 = arg0.method250(2, (byte) -20);
                    if (var10 == 0) {
                        this.field1438[this.field1437++] = var7;
                        var8.field454 = field1618;
                        this.field1440[this.field1439++] = var7;
                    } else if (var10 == 1) {
                        this.field1438[this.field1437++] = var7;
                        var8.field454 = field1618;
                        int var11 = arg0.method250(3, (byte) -20);
                        var8.method125(this.field1633, var11, false);
                        int var12 = arg0.method250(1, (byte) -20);
                        if (var12 == 1) {
                            this.field1440[this.field1439++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1438[this.field1437++] = var7;
                        var8.field454 = field1618;
                        int var13 = arg0.method250(3, (byte) -20);
                        var8.method125(this.field1633, var13, true);
                        int var14 = arg0.method250(3, (byte) -20);
                        var8.method125(this.field1633, var14, true);
                        int var15 = arg0.method250(1, (byte) -20);
                        if (var15 == 1) {
                            this.field1440[this.field1439++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1312[this.field1311++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method539(int arg0) {
        this.field1215 = false;
        while (this.field1316) {
            this.field1215 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1601 = null;
        this.field1602 = null;
        this.field1237 = null;
        this.field1470 = null;
        this.field1471 = null;
        this.field1472 = null;
        this.field1397 += arg0;
        this.field1473 = null;
        this.field1576 = null;
        this.field1577 = null;
        this.field1408 = null;
        this.field1409 = null;
        this.field1413 = null;
        this.field1414 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B[BZ)V")
    public final void method540(byte arg0, byte[] arg1, boolean arg2) {
        if (arg0 == 2) {
            boolean var4 = false;
        } else {
            this.field1398 = -1;
        }
        signlink.midifade = arg2 ? 1 : 0;
        signlink.midisave(arg1, arg1.length);
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method541(int arg0) {
        if (arg0 != 0) {
            this.method6();
        }
        if (this.field1285 == 0 && this.field1263 == 0) {
            this.field1655[this.field1553] = "Walk here";
            this.field1541[this.field1553] = 718;
            this.field1539[this.field1553] = super.field23;
            this.field1540[this.field1553] = super.field24;
            ++this.field1553;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < Model.field606; ++var3) {
            int var4 = Model.field607[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1227.method94(this.field1607, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method334(var8);
                    if (this.field1285 == 1) {
                        this.field1655[this.field1553] = "Use " + this.field1289 + " with @cya@" + var9.field943;
                        this.field1541[this.field1553] = 810;
                        this.field1542[this.field1553] = var4;
                        this.field1539[this.field1553] = var5;
                        this.field1540[this.field1553] = var6;
                        ++this.field1553;
                    } else if (this.field1263 == 1) {
                        if ((this.field1265 & 4) == 4) {
                            this.field1655[this.field1553] = this.field1266 + " @cya@" + var9.field943;
                            this.field1541[this.field1553] = 899;
                            this.field1542[this.field1553] = var4;
                            this.field1539[this.field1553] = var5;
                            this.field1540[this.field1553] = var6;
                            ++this.field1553;
                        }
                    } else {
                        if (var9.field959 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field959[var10] != null) {
                                    this.field1655[this.field1553] = var9.field959[var10] + " @cya@" + var9.field943;
                                    if (var10 == 0) {
                                        this.field1541[this.field1553] = 625;
                                    }
                                    if (var10 == 1) {
                                        this.field1541[this.field1553] = 721;
                                    }
                                    if (var10 == 2) {
                                        this.field1541[this.field1553] = 743;
                                    }
                                    if (var10 == 3) {
                                        this.field1541[this.field1553] = 357;
                                    }
                                    if (var10 == 4) {
                                        this.field1541[this.field1553] = 1071;
                                    }
                                    this.field1542[this.field1553] = var4;
                                    this.field1539[this.field1553] = var5;
                                    this.field1540[this.field1553] = var6;
                                    ++this.field1553;
                                }
                            }
                        }
                        this.field1655[this.field1553] = "Examine @cya@" + var9.field943;
                        this.field1541[this.field1553] = 1381;
                        this.field1542[this.field1553] = var4;
                        this.field1539[this.field1553] = var5;
                        this.field1540[this.field1553] = var6;
                        ++this.field1553;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1426[var8];
                    if (var11.field464.field994 == 1 && (var11.field409 & 127) == 64 && (var11.field410 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1427; ++var12) {
                            NpcEntity var13 = this.field1426[this.field1428[var12]];
                            if (var13 != null && var11 != var13 && var13.field464.field994 == 1 && var11.field409 == var13.field409 && var11.field410 == var13.field410) {
                                this.method431(var5, var13.field464, var6, true, this.field1428[var12]);
                            }
                        }
                    }
                    this.method431(var5, var11.field464, var6, true, var8);
                }
                if (var7 == 0) {
                    PlayerEntity var14 = this.field1436[var8];
                    if ((var14.field409 & 127) == 64 && (var14.field410 & 127) == 64) {
                        for (int var15 = 0; var15 < this.field1427; ++var15) {
                            NpcEntity var18 = this.field1426[this.field1428[var15]];
                            if (var18 != null && var18.field464.field994 == 1 && var14.field409 == var18.field409 && var14.field410 == var18.field410) {
                                this.method431(var5, var18.field464, var6, true, this.field1428[var15]);
                            }
                        }
                        for (int var16 = 0; var16 < this.field1437; ++var16) {
                            PlayerEntity var17 = this.field1436[this.field1438[var16]];
                            if (var17 != null && var14 != var17 && var14.field409 == var17.field409 && var14.field410 == var17.field410) {
                                this.method531(this.field1438[var16], var6, -961, var5, var17);
                            }
                        }
                    }
                    this.method531(var8, var6, -961, var5, var14);
                }
                if (var7 == 3) {
                    LinkList var19 = this.field1616[this.field1607][var5][var6];
                    if (var19 != null) {
                        for (ObjStackEntity var20 = (ObjStackEntity) var19.method259(false); var20 != null; var20 = (ObjStackEntity) var19.method261((byte) 96)) {
                            ObjType var21 = ObjType.method350(var20.field501);
                            if (this.field1285 == 1) {
                                this.field1655[this.field1553] = "Use " + this.field1289 + " with @lre@" + var21.field1032;
                                this.field1541[this.field1553] = 111;
                                this.field1542[this.field1553] = var20.field501;
                                this.field1539[this.field1553] = var5;
                                this.field1540[this.field1553] = var6;
                                ++this.field1553;
                            } else if (this.field1263 == 1) {
                                if ((this.field1265 & 1) == 1) {
                                    this.field1655[this.field1553] = this.field1266 + " @lre@" + var21.field1032;
                                    this.field1541[this.field1553] = 370;
                                    this.field1542[this.field1553] = var20.field501;
                                    this.field1539[this.field1553] = var5;
                                    this.field1540[this.field1553] = var6;
                                    ++this.field1553;
                                }
                            } else {
                                for (int var22 = 4; var22 >= 0; --var22) {
                                    if (var21.field1046 != null && var21.field1046[var22] != null) {
                                        this.field1655[this.field1553] = var21.field1046[var22] + " @lre@" + var21.field1032;
                                        if (var22 == 0) {
                                            this.field1541[this.field1553] = 139;
                                        }
                                        if (var22 == 1) {
                                            this.field1541[this.field1553] = 778;
                                        }
                                        if (var22 == 2) {
                                            this.field1541[this.field1553] = 617;
                                        }
                                        if (var22 == 3) {
                                            this.field1541[this.field1553] = 224;
                                        }
                                        if (var22 == 4) {
                                            this.field1541[this.field1553] = 662;
                                        }
                                        this.field1542[this.field1553] = var20.field501;
                                        this.field1539[this.field1553] = var5;
                                        this.field1540[this.field1553] = var6;
                                        ++this.field1553;
                                    } else if (var22 == 2) {
                                        this.field1655[this.field1553] = "Take @lre@" + var21.field1032;
                                        this.field1541[this.field1553] = 617;
                                        this.field1542[this.field1553] = var20.field501;
                                        this.field1539[this.field1553] = var5;
                                        this.field1540[this.field1553] = var6;
                                        ++this.field1553;
                                    }
                                }
                                this.field1655[this.field1553] = "Examine @lre@" + var21.field1032;
                                this.field1541[this.field1553] = 1152;
                                this.field1542[this.field1553] = var20.field501;
                                this.field1539[this.field1553] = var5;
                                this.field1540[this.field1553] = var6;
                                ++this.field1553;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method10(int arg0) {
        this.field1380 = true;
        while (arg0 >= 0) {
            field1290 = this.field1514.method305();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIII)I")
    public final int method542(boolean arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 >> 7;
        int var6 = arg2 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg3;
            if (arg3 < 3 && (this.field1230[1][var5][var6] & 2) == 2) {
                var7 = arg3 + 1;
            }
            int var8 = arg1 & 127;
            int var9 = arg2 & 127;
            if (arg0) {
                return 3;
            } else {
                int var10 = (128 - var8) * this.field1415[var7][var5][var6] + this.field1415[var7][var5 + 1][var6] * var8 >> 7;
                int var11 = (128 - var8) * this.field1415[var7][var5][var6 + 1] + this.field1415[var7][var5 + 1][var6 + 1] * var8 >> 7;
                return (128 - var9) * var10 + var9 * var11 >> 7;
            }
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIILd;I)V")
    public final void method543(boolean arg0, int arg1, int arg2, Component arg3, int arg4) {
        if (arg3.field77 == 0 && arg3.field92 != null) {
            if (!arg3.field91 || this.field1296 == arg3.field75 || this.field1442 == arg3.field75 || this.field1376 == arg3.field75) {
                int var6 = Pix2D.field632;
                int var7 = Pix2D.field630;
                int var8 = Pix2D.field633;
                int var9 = Pix2D.field631;
                if (arg0) {
                    this.field1634 = -278;
                }
                Pix2D.method167(arg2, arg1, arg3.field81 + arg2, 0, arg3.field80 + arg1);
                int var10 = arg3.field92.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg3.field93[var11] + arg1;
                    int var13 = arg3.field94[var11] + arg2 - arg4;
                    Component var14 = Component.field70[arg3.field92[var11]];
                    int var15 = var14.field83 + var12;
                    int var16 = var14.field84 + var13;
                    if (var14.field79 > 0) {
                        this.method502(var14, 11170);
                    }
                    if (var14.field77 == 0) {
                        if (var14.field90 > var14.field89 - var14.field81) {
                            var14.field90 = var14.field89 - var14.field81;
                        }
                        if (var14.field90 < 0) {
                            var14.field90 = 0;
                        }
                        this.method543(false, var15, var16, var14, var14.field90);
                        if (var14.field89 > var14.field81) {
                            this.method508(var14.field90, var16, -11192, var14.field81, var14.field89, var14.field80 + var15);
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
                                                var30.method199(var20, -48420, var21);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field71[var17] - 1;
                                        if (var20 > Pix2D.field632 - 32 && var20 < Pix2D.field633 && var21 > Pix2D.field630 - 32 && var21 < Pix2D.field631 || this.field1549 != 0 && this.field1548 == var17) {
                                            int var25 = 0;
                                            if (this.field1285 == 1 && this.field1286 == var17 && this.field1287 == var14.field75) {
                                                var25 = 16777215;
                                            }
                                            Pix32 var26 = ObjType.method356(var14.field72[var17], var24, var25, 0);
                                            if (var26 != null) {
                                                if (this.field1549 != 0 && this.field1548 == var17 && this.field1547 == var14.field75) {
                                                    var22 = super.field23 - this.field1550;
                                                    var23 = super.field24 - this.field1551;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field1495 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method201(var20 + var22, 128, 0, var21 + var23);
                                                    if (var21 + var23 < Pix2D.field630 && arg3.field90 > 0) {
                                                        int var27 = (Pix2D.field630 - var21 - var23) * this.field1257 / 3;
                                                        if (var27 > this.field1257 * 10) {
                                                            var27 = this.field1257 * 10;
                                                        }
                                                        if (var27 > arg3.field90) {
                                                            var27 = arg3.field90;
                                                        }
                                                        arg3.field90 -= var27;
                                                        this.field1551 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > Pix2D.field631 && arg3.field90 < arg3.field89 - arg3.field81) {
                                                        int var28 = (var21 + var23 + 32 - Pix2D.field631) * this.field1257 / 3;
                                                        if (var28 > this.field1257 * 10) {
                                                            var28 = this.field1257 * 10;
                                                        }
                                                        if (var28 > arg3.field89 - arg3.field81 - arg3.field90) {
                                                            var28 = arg3.field89 - arg3.field81 - arg3.field90;
                                                        }
                                                        arg3.field90 += var28;
                                                        this.field1551 -= var28;
                                                    }
                                                } else if (this.field1485 != 0 && this.field1484 == var17 && this.field1483 == var14.field75) {
                                                    var26.method201(var20, 128, 0, var21);
                                                } else {
                                                    var26.method199(var20, -48420, var21);
                                                }
                                                if (var26.field674 == 33 || var14.field72[var17] != 1) {
                                                    int var29 = var14.field72[var17];
                                                    this.field1403.method217(var21 + 10 + var23, 0, false, method479(var29, 385), var20 + 1 + var22);
                                                    this.field1403.method217(var21 + 9 + var23, 16776960, false, method479(var29, 385), var20 + var22);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field77 == 3) {
                            boolean var31 = false;
                            if (this.field1376 == var14.field75 || this.field1442 == var14.field75 || this.field1296 == var14.field75) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method530(11995, var14)) {
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
                                    Pix2D.method170(33027, var32, var14.field80, var16, var14.field81, var15);
                                } else {
                                    Pix2D.method171(var14.field81, var16, var15, var14.field80, this.field1460, var32);
                                }
                            } else if (var14.field107) {
                                Pix2D.method169(256 - (var14.field82 & 255), 0, var15, var14.field81, var16, var32, var14.field80);
                            } else {
                                Pix2D.method172(var15, var14.field81, var32, var16, 0, 256 - (var14.field82 & 255), var14.field80);
                            }
                        } else if (var14.field77 == 4) {
                            PixFont var33 = var14.field110;
                            String var34 = var14.field111;
                            boolean var35 = false;
                            if (this.field1376 == var14.field75 || this.field1442 == var14.field75 || this.field1296 == var14.field75) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method530(11995, var14)) {
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
                            if (var14.field78 == 6 && this.field1223) {
                                var34 = "Please wait...";
                                var36 = var14.field113;
                            }
                            if (Pix2D.field628 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field701 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method452(false, this.method476(var14, (byte) 6, 4)) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method452(false, this.method476(var14, (byte) 6, 3)) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method452(false, this.method476(var14, (byte) 6, 2)) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method452(false, this.method476(var14, (byte) 6, 1)) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method452(false, this.method476(var14, (byte) 6, 0)) + var34.substring(var38 + 2);
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
                                    var33.method215(var44, -413, var14.field80 / 2 + var15, var14.field109, var36, var37);
                                } else {
                                    var33.method219(3, var36, var14.field109, var44, var37, var15);
                                }
                                var37 += var33.field701;
                            }
                        } else if (var14.field77 == 5) {
                            Pix32 var45;
                            if (this.method530(11995, var14)) {
                                var45 = var14.field118;
                            } else {
                                var45 = var14.field117;
                            }
                            if (var45 != null) {
                                var45.method199(var15, -48420, var16);
                            }
                        } else if (var14.field77 == 6) {
                            int var46 = Pix3D.field646;
                            int var47 = Pix3D.field647;
                            Pix3D.field646 = var14.field80 / 2 + var15;
                            Pix3D.field647 = var14.field81 / 2 + var16;
                            int var48 = Pix3D.field650[var14.field126] * var14.field125 >> 16;
                            int var49 = Pix3D.field651[var14.field126] * var14.field125 >> 16;
                            boolean var50 = this.method530(11995, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field124;
                            } else {
                                var51 = var14.field123;
                            }
                            Model var52;
                            if (var51 == -1) {
                                var52 = var14.method34(-1, var50, -1, 0);
                            } else {
                                SeqType var53 = SeqType.field1121[var51];
                                var52 = var14.method34(var53.field1123[var14.field73], var50, var53.field1124[var14.field73], 0);
                            }
                            if (var52 != null) {
                                var52.method159(0, var14.field127, 0, var14.field126, 0, var48, var49);
                            }
                            Pix3D.field646 = var46;
                            Pix3D.field647 = var47;
                        } else if (var14.field77 == 7) {
                            PixFont var54 = var14.field110;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field81; ++var56) {
                                for (int var57 = 0; var57 < var14.field80; ++var57) {
                                    if (var14.field71[var55] > 0) {
                                        ObjType var58 = ObjType.method350(var14.field71[var55] - 1);
                                        String var59 = var58.field1032;
                                        if (var58.field1043 || var14.field72[var55] != 1) {
                                            var59 = var59 + " x" + method517(false, var14.field72[var55]);
                                        }
                                        int var60 = (var14.field101 + 115) * var57 + var15;
                                        int var61 = (var14.field102 + 12) * var56 + var16;
                                        if (var14.field108) {
                                            var54.method215(var59, -413, var14.field80 / 2 + var60, var14.field109, var14.field113, var61);
                                        } else {
                                            var54.method219(3, var14.field113, var14.field109, var59, var61, var60);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                Pix2D.method167(var7, var6, var9, 0, var8);
            }
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public final void method544(int arg0) {
        short var2 = 256;
        if (this.field1581 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1581 > 768) {
                    this.field1470[var3] = this.method488(this.field1471[var3], 38951, 1024 - this.field1581, this.field1472[var3]);
                } else if (this.field1581 > 256) {
                    this.field1470[var3] = this.field1472[var3];
                } else {
                    this.field1470[var3] = this.method488(this.field1472[var3], 38951, 256 - this.field1581, this.field1471[var3]);
                }
            }
        } else if (this.field1582 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1582 > 768) {
                    this.field1470[var4] = this.method488(this.field1471[var4], 38951, 1024 - this.field1582, this.field1473[var4]);
                } else if (this.field1582 > 256) {
                    this.field1470[var4] = this.field1473[var4];
                } else {
                    this.field1470[var4] = this.method488(this.field1473[var4], 38951, 256 - this.field1582, this.field1471[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1470[var5] = this.field1471[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1627.field755[var6] = this.field1413.field669[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1493[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1408[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1470[var26];
                    int var30 = this.field1627.field755[var8];
                    this.field1627.field755[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        while (arg0 >= 0) {
            this.field1460 = 499;
        }
        this.field1627.method269(super.field15, 0, false, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1628.field755[var10] = this.field1414.field669[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1493[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1408[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1470[var18];
                    int var22 = this.field1628.field755[var16];
                    this.field1628.field755[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field1628.method269(super.field15, 0, false, 637);
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method545(boolean arg0) {
        this.field1448 &= arg0;
        for (int var2 = 0; var2 < this.field1427; ++var2) {
            int var3 = this.field1428[var2];
            NpcEntity var4 = this.field1426[var3];
            if (var4 != null) {
                this.method546(var4, -101, var4.field464.field994);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;II)V")
    public final void method546(PathingEntity arg0, int arg1, int arg2) {
        if (arg0.field409 < 128 || arg0.field410 < 128 || arg0.field409 >= 13184 || arg0.field410 >= 13184) {
            arg0.field437 = -1;
            arg0.field442 = -1;
            arg0.field451 = 0;
            arg0.field452 = 0;
            arg0.field409 = arg0.field459[0] * 128 + arg0.field413 * 64;
            arg0.field410 = arg0.field460[0] * 128 + arg0.field413 * 64;
            arg0.method126(-404);
        }
        if (field1642 == arg0 && (arg0.field409 < 1536 || arg0.field410 < 1536 || arg0.field409 >= 11776 || arg0.field410 >= 11776)) {
            arg0.field437 = -1;
            arg0.field442 = -1;
            arg0.field451 = 0;
            arg0.field452 = 0;
            arg0.field409 = arg0.field459[0] * 128 + arg0.field413 * 64;
            arg0.field410 = arg0.field460[0] * 128 + arg0.field413 * 64;
            arg0.method126(-404);
        }
        if (arg0.field451 > field1618) {
            this.method547(-638, arg0);
        } else if (arg0.field452 >= field1618) {
            this.method548(arg0, 44471);
        } else {
            this.method549(arg0, -156);
        }
        this.method550(arg0, false);
        this.method551(false, arg0);
        while (arg1 >= 0) {
            this.field1241 = !this.field1241;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILz;)V")
    public final void method547(int arg0, PathingEntity arg1) {
        int var3 = arg1.field451 - field1618;
        int var4 = arg1.field447 * 128 + arg1.field413 * 64;
        int var5 = arg1.field449 * 128 + arg1.field413 * 64;
        arg1.field409 += (var4 - arg1.field409) / var3;
        arg1.field410 += (var5 - arg1.field410) / var3;
        arg1.field462 = 0;
        if (arg0 >= 0) {
            this.method6();
        }
        if (arg1.field453 == 0) {
            arg1.field456 = 1024;
        }
        if (arg1.field453 == 1) {
            arg1.field456 = 1536;
        }
        if (arg1.field453 == 2) {
            arg1.field456 = 0;
        }
        if (arg1.field453 == 3) {
            arg1.field456 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;I)V")
    public final void method548(PathingEntity arg0, int arg1) {
        if (field1618 == arg0.field452 || arg0.field437 == -1 || arg0.field440 != 0 || arg0.field439 + 1 > SeqType.field1121[arg0.field437].method384(arg0.field438, (byte) 2)) {
            int var3 = arg0.field452 - arg0.field451;
            int var4 = field1618 - arg0.field451;
            int var5 = arg0.field447 * 128 + arg0.field413 * 64;
            int var6 = arg0.field449 * 128 + arg0.field413 * 64;
            int var7 = arg0.field448 * 128 + arg0.field413 * 64;
            int var8 = arg0.field450 * 128 + arg0.field413 * 64;
            arg0.field409 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field410 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field462 = 0;
        if (arg0.field453 == 0) {
            arg0.field456 = 1024;
        }
        if (arg0.field453 == 1) {
            arg0.field456 = 1536;
        }
        if (arg0.field453 == 2) {
            arg0.field456 = 0;
        }
        if (arg0.field453 == 3) {
            arg0.field456 = 512;
        }
        arg0.field411 = arg0.field456;
        if (arg1 != 44471) {
            field1580 = this.field1514.method305();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lz;I)V")
    public final void method549(PathingEntity arg0, int arg1) {
        if (arg1 >= 0) {
            this.field1398 = this.field1418.method239();
        }
        arg0.field434 = arg0.field414;
        if (arg0.field458 == 0) {
            arg0.field462 = 0;
        } else {
            if (arg0.field437 != -1 && arg0.field440 == 0) {
                SeqType var3 = SeqType.field1121[arg0.field437];
                if (arg0.field463 > 0 && var3.field1133 == 0) {
                    ++arg0.field462;
                    return;
                }
                if (arg0.field463 <= 0 && var3.field1134 == 0) {
                    ++arg0.field462;
                    return;
                }
            }
            int var4 = arg0.field409;
            int var5 = arg0.field410;
            int var6 = arg0.field459[arg0.field458 - 1] * 128 + arg0.field413 * 64;
            int var7 = arg0.field460[arg0.field458 - 1] * 128 + arg0.field413 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field456 = 1280;
                    } else if (var5 > var7) {
                        arg0.field456 = 1792;
                    } else {
                        arg0.field456 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field456 = 768;
                    } else if (var5 > var7) {
                        arg0.field456 = 256;
                    } else {
                        arg0.field456 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field456 = 1024;
                } else {
                    arg0.field456 = 0;
                }
                int var8 = arg0.field456 - arg0.field411 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field417;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field416;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field419;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field418;
                }
                if (var9 == -1) {
                    var9 = arg0.field416;
                }
                arg0.field434 = var9;
                int var10 = 4;
                if (arg0.field456 != arg0.field411 && arg0.field431 == -1 && arg0.field457 != 0) {
                    var10 = 2;
                }
                if (arg0.field458 > 2) {
                    var10 = 6;
                }
                if (arg0.field458 > 3) {
                    var10 = 8;
                }
                if (arg0.field462 > 0 && arg0.field458 > 1) {
                    var10 = 8;
                    --arg0.field462;
                }
                if (arg0.field461[arg0.field458 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field434 == arg0.field416 && arg0.field420 != -1) {
                    arg0.field434 = arg0.field420;
                }
                if (var4 < var6) {
                    arg0.field409 += var10;
                    if (arg0.field409 > var6) {
                        arg0.field409 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field409 -= var10;
                    if (arg0.field409 < var6) {
                        arg0.field409 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field410 += var10;
                    if (arg0.field410 > var7) {
                        arg0.field410 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field410 -= var10;
                    if (arg0.field410 < var7) {
                        arg0.field410 = var7;
                    }
                }
                if (arg0.field409 == var6 && arg0.field410 == var7) {
                    --arg0.field458;
                    if (arg0.field463 > 0) {
                        --arg0.field463;
                        return;
                    }
                }
            } else {
                arg0.field409 = var6;
                arg0.field410 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;Z)V")
    public final void method550(PathingEntity arg0, boolean arg1) {
        if (arg1) {
            this.field1393 = this.field1514.method305();
        }
        if (arg0.field457 != 0) {
            if (arg0.field431 != -1 && arg0.field431 < 32768) {
                NpcEntity var3 = this.field1426[arg0.field431];
                if (var3 != null) {
                    int var4 = arg0.field409 - var3.field409;
                    int var5 = arg0.field410 - var3.field410;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field456 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field431 >= 32768) {
                int var6 = arg0.field431 - 32768;
                if (this.field1243 == var6) {
                    var6 = this.field1435;
                }
                PlayerEntity var7 = this.field1436[var6];
                if (var7 != null) {
                    int var8 = arg0.field409 - var7.field409;
                    int var9 = arg0.field410 - var7.field410;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field456 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field432 != 0 || arg0.field433 != 0) && (arg0.field458 == 0 || arg0.field462 > 0)) {
                int var10 = arg0.field409 - (arg0.field432 - this.field1503 - this.field1503) * 64;
                int var11 = arg0.field410 - (arg0.field433 - this.field1504 - this.field1504) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field456 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field432 = 0;
                arg0.field433 = 0;
            }
            int var12 = arg0.field456 - arg0.field411 & 2047;
            if (var12 != 0) {
                if (var12 >= arg0.field457 && var12 <= 2048 - arg0.field457) {
                    if (var12 > 1024) {
                        arg0.field411 -= arg0.field457;
                    } else {
                        arg0.field411 += arg0.field457;
                    }
                } else {
                    arg0.field411 = arg0.field456;
                }
                arg0.field411 &= 2047;
                if (arg0.field434 == arg0.field414 && arg0.field456 != arg0.field411) {
                    if (arg0.field415 != -1) {
                        arg0.field434 = arg0.field415;
                        return;
                    }
                    arg0.field434 = arg0.field416;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLz;)V")
    public final void method551(boolean arg0, PathingEntity arg1) {
        if (arg0) {
            this.method6();
        }
        arg1.field412 = false;
        if (arg1.field434 != -1) {
            SeqType var3 = SeqType.field1121[arg1.field434];
            ++arg1.field436;
            if (arg1.field435 < var3.field1122 && arg1.field436 > var3.method384(arg1.field435, (byte) 2)) {
                arg1.field436 = 0;
                ++arg1.field435;
            }
            if (arg1.field435 >= var3.field1122) {
                arg1.field436 = 0;
                arg1.field435 = 0;
            }
        }
        if (arg1.field442 != -1 && field1618 >= arg1.field445) {
            if (arg1.field443 < 0) {
                arg1.field443 = 0;
            }
            SeqType var4 = SpotAnimType.field1143[arg1.field442].field1147;
            ++arg1.field444;
            while (arg1.field443 < var4.field1122 && arg1.field444 > var4.method384(arg1.field443, (byte) 2)) {
                arg1.field444 -= var4.method384(arg1.field443, (byte) 2);
                ++arg1.field443;
            }
            if (arg1.field443 >= var4.field1122 && (arg1.field443 < 0 || arg1.field443 >= var4.field1122)) {
                arg1.field442 = -1;
            }
        }
        if (arg1.field437 != -1 && arg1.field440 <= 1) {
            SeqType var5 = SeqType.field1121[arg1.field437];
            if (var5.field1133 == 1 && arg1.field463 > 0 && arg1.field451 <= field1618 && arg1.field452 < field1618) {
                arg1.field440 = 1;
                return;
            }
        }
        if (arg1.field437 != -1 && arg1.field440 == 0) {
            SeqType var6 = SeqType.field1121[arg1.field437];
            ++arg1.field439;
            while (arg1.field438 < var6.field1122 && arg1.field439 > var6.method384(arg1.field438, (byte) 2)) {
                arg1.field439 -= var6.method384(arg1.field438, (byte) 2);
                ++arg1.field438;
            }
            if (arg1.field438 >= var6.field1122) {
                arg1.field438 -= var6.field1126;
                ++arg1.field441;
                if (arg1.field441 >= var6.field1132) {
                    arg1.field437 = -1;
                }
                if (arg1.field438 < 0 || arg1.field438 >= var6.field1122) {
                    arg1.field437 = -1;
                }
            }
            arg1.field412 = var6.field1128;
        }
        if (arg1.field440 > 0) {
            --arg1.field440;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method552(byte arg0) {
        if (arg0 != -74) {
            this.field1616 = null;
        }
        if (this.field1380) {
            this.field1380 = false;
            this.field1518.method269(super.field15, 4, false, 0);
            this.field1519.method269(super.field15, 357, false, 0);
            this.field1520.method269(super.field15, 4, false, 722);
            this.field1521.method269(super.field15, 205, false, 743);
            this.field1522.method269(super.field15, 0, false, 0);
            this.field1523.method269(super.field15, 4, false, 516);
            this.field1524.method269(super.field15, 205, false, 516);
            this.field1525.method269(super.field15, 357, false, 496);
            this.field1526.method269(super.field15, 338, false, 0);
            this.field1372 = true;
            this.field1217 = true;
            this.field1421 = true;
            this.field1528 = true;
            if (this.field1568 != 2) {
                this.field1271.method269(super.field15, 4, false, 4);
                this.field1270.method269(super.field15, 4, false, 550);
            }
        }
        if (this.field1568 == 2) {
            this.method467(-500);
        }
        if (this.field1432 && this.field1277 == 1) {
            this.field1372 = true;
        }
        if (this.field1394 != -1) {
            boolean var2 = this.method536(this.field1394, this.field1257, (byte) -21);
            if (var2) {
                this.field1372 = true;
            }
        }
        if (this.field1485 == 2) {
            this.field1372 = true;
        }
        if (this.field1549 == 2) {
            this.field1372 = true;
        }
        if (this.field1372) {
            this.method522(-576);
            this.field1372 = false;
        }
        if (this.field1402 == -1) {
            this.field1228.field90 = this.field1516 - this.field1364 - 77;
            if (super.field23 > 448 && super.field23 < 560 && super.field24 > 332) {
                this.method437(77, this.field1516, 0, (byte) 15, super.field24 - 357, false, 463, this.field1228, super.field23 - 17);
            }
            int var3 = this.field1516 - 77 - this.field1228.field90;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1516 - 77) {
                var3 = this.field1516 - 77;
            }
            if (this.field1364 != var3) {
                this.field1364 = var3;
                this.field1217 = true;
            }
        }
        if (this.field1402 != -1) {
            boolean var4 = this.method536(this.field1402, this.field1257, (byte) -21);
            if (var4) {
                this.field1217 = true;
            }
        }
        if (this.field1485 == 3) {
            this.field1217 = true;
        }
        if (this.field1549 == 3) {
            this.field1217 = true;
        }
        if (this.field1346 != null) {
            this.field1217 = true;
        }
        if (this.field1432 && this.field1277 == 2) {
            this.field1217 = true;
        }
        if (this.field1217) {
            this.method497(this.field1529);
            this.field1217 = false;
        }
        if (this.field1568 == 2) {
            this.method512((byte) -36);
            this.field1270.method269(super.field15, 4, false, 550);
        }
        if (this.field1275 != -1) {
            this.field1421 = true;
        }
        if (this.field1421) {
            if (this.field1275 != -1 && this.field1386 == this.field1275) {
                this.field1275 = -1;
                this.field1461.method228(201, 0);
                this.field1461.method229(this.field1386);
            }
            this.field1421 = false;
            this.field1294.method268(false);
            this.field1222.method212(0, -48420, 0);
            if (this.field1394 == -1) {
                if (this.field1499[this.field1386] != -1) {
                    if (this.field1386 == 0) {
                        this.field1304.method212(22, -48420, 10);
                    }
                    if (this.field1386 == 1) {
                        this.field1305.method212(54, -48420, 8);
                    }
                    if (this.field1386 == 2) {
                        this.field1305.method212(82, -48420, 8);
                    }
                    if (this.field1386 == 3) {
                        this.field1306.method212(110, -48420, 8);
                    }
                    if (this.field1386 == 4) {
                        this.field1308.method212(153, -48420, 8);
                    }
                    if (this.field1386 == 5) {
                        this.field1308.method212(181, -48420, 8);
                    }
                    if (this.field1386 == 6) {
                        this.field1307.method212(209, -48420, 9);
                    }
                }
                if (this.field1499[0] != -1 && (this.field1275 != 0 || field1618 % 20 < 10)) {
                    this.field1396[0].method212(29, -48420, 13);
                }
                if (this.field1499[1] != -1 && (this.field1275 != 1 || field1618 % 20 < 10)) {
                    this.field1396[1].method212(53, -48420, 11);
                }
                if (this.field1499[2] != -1 && (this.field1275 != 2 || field1618 % 20 < 10)) {
                    this.field1396[2].method212(82, -48420, 11);
                }
                if (this.field1499[3] != -1 && (this.field1275 != 3 || field1618 % 20 < 10)) {
                    this.field1396[3].method212(115, -48420, 12);
                }
                if (this.field1499[4] != -1 && (this.field1275 != 4 || field1618 % 20 < 10)) {
                    this.field1396[4].method212(153, -48420, 13);
                }
                if (this.field1499[5] != -1 && (this.field1275 != 5 || field1618 % 20 < 10)) {
                    this.field1396[5].method212(180, -48420, 11);
                }
                if (this.field1499[6] != -1 && (this.field1275 != 6 || field1618 % 20 < 10)) {
                    this.field1396[6].method212(208, -48420, 13);
                }
            }
            this.field1294.method269(super.field15, 160, false, 516);
            this.field1293.method268(false);
            this.field1221.method212(0, -48420, 0);
            if (this.field1394 == -1) {
                if (this.field1499[this.field1386] != -1) {
                    if (this.field1386 == 7) {
                        this.field1462.method212(42, -48420, 0);
                    }
                    if (this.field1386 == 8) {
                        this.field1463.method212(74, -48420, 0);
                    }
                    if (this.field1386 == 9) {
                        this.field1463.method212(102, -48420, 0);
                    }
                    if (this.field1386 == 10) {
                        this.field1464.method212(130, -48420, 1);
                    }
                    if (this.field1386 == 11) {
                        this.field1466.method212(173, -48420, 0);
                    }
                    if (this.field1386 == 12) {
                        this.field1466.method212(201, -48420, 0);
                    }
                    if (this.field1386 == 13) {
                        this.field1465.method212(229, -48420, 0);
                    }
                }
                if (this.field1499[8] != -1 && (this.field1275 != 8 || field1618 % 20 < 10)) {
                    this.field1396[7].method212(74, -48420, 2);
                }
                if (this.field1499[9] != -1 && (this.field1275 != 9 || field1618 % 20 < 10)) {
                    this.field1396[8].method212(102, -48420, 3);
                }
                if (this.field1499[10] != -1 && (this.field1275 != 10 || field1618 % 20 < 10)) {
                    this.field1396[9].method212(137, -48420, 4);
                }
                if (this.field1499[11] != -1 && (this.field1275 != 11 || field1618 % 20 < 10)) {
                    this.field1396[10].method212(174, -48420, 2);
                }
                if (this.field1499[12] != -1 && (this.field1275 != 12 || field1618 % 20 < 10)) {
                    this.field1396[11].method212(201, -48420, 2);
                }
                if (this.field1499[13] != -1 && (this.field1275 != 13 || field1618 % 20 < 10)) {
                    this.field1396[12].method212(226, -48420, 2);
                }
            }
            this.field1293.method269(super.field15, 466, false, 496);
            this.field1271.method268(false);
        }
        if (this.field1528) {
            this.field1528 = false;
            this.field1292.method268(false);
            this.field1220.method212(0, -48420, 0);
            this.field1404.method215("Public chat", -413, 55, true, 16777215, 28);
            if (this.field1214 == 0) {
                this.field1404.method215("On", -413, 55, true, 65280, 41);
            }
            if (this.field1214 == 1) {
                this.field1404.method215("Friends", -413, 55, true, 16776960, 41);
            }
            if (this.field1214 == 2) {
                this.field1404.method215("Off", -413, 55, true, 16711680, 41);
            }
            if (this.field1214 == 3) {
                this.field1404.method215("Hide", -413, 55, true, 65535, 41);
            }
            this.field1404.method215("Private chat", -413, 184, true, 16777215, 28);
            if (this.field1497 == 0) {
                this.field1404.method215("On", -413, 184, true, 65280, 41);
            }
            if (this.field1497 == 1) {
                this.field1404.method215("Friends", -413, 184, true, 16776960, 41);
            }
            if (this.field1497 == 2) {
                this.field1404.method215("Off", -413, 184, true, 16711680, 41);
            }
            this.field1404.method215("Trade/duel", -413, 324, true, 16777215, 28);
            if (this.field1229 == 0) {
                this.field1404.method215("On", -413, 324, true, 65280, 41);
            }
            if (this.field1229 == 1) {
                this.field1404.method215("Friends", -413, 324, true, 16776960, 41);
            }
            if (this.field1229 == 2) {
                this.field1404.method215("Off", -413, 324, true, 16711680, 41);
            }
            this.field1404.method215("Report abuse", -413, 458, true, 16777215, 33);
            this.field1292.method269(super.field15, 453, false, 0);
            this.field1271.method268(false);
        }
        this.field1257 = 0;
    }

    @OriginalMember(owner = "client", name = "N", descriptor = "(I)V")
    public final void method553(int arg0) {
        if (arg0 != 0) {
            this.field1398 = this.field1418.method239();
        }
        for (int var2 = 0; var2 < this.field1592; ++var2) {
            if (this.field1657[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field1366[var2] == this.field1619 && this.field1508[var2] == this.field1490) {
                        if (!this.method451(this.field1337)) {
                            var3 = true;
                        }
                    } else {
                        Packet var4 = Wave.method323(0, this.field1508[var2], this.field1366[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field717 / 22) > (long) (this.field1343 / 22) + this.field1345) {
                            this.field1343 = var4.field717;
                            this.field1345 = System.currentTimeMillis();
                            if (this.method436(var4.field716, false, var4.field717)) {
                                this.field1619 = this.field1366[var2];
                                this.field1490 = this.field1508[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field1657[var2] != -5) {
                    this.field1657[var2] = -5;
                } else {
                    --this.field1592;
                    for (int var6 = var2; var6 < this.field1592; ++var6) {
                        this.field1366[var6] = this.field1366[var6 + 1];
                        this.field1508[var6] = this.field1508[var6 + 1];
                        this.field1657[var6] = this.field1657[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field1657[var2]--;
            }
        }
        if (this.field1467 > 0) {
            this.field1467 -= 20;
            if (this.field1467 < 0) {
                this.field1467 = 0;
            }
            if (this.field1467 == 0 && this.field1480 && !field1302) {
                this.field1596 = this.field1314;
                this.field1597 = false;
                this.field1209.method289(2, this.field1596);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1299 = Integer.parseInt(this.getParameter("nodeid"));
        field1300 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method480(12);
        } else {
            method470(0);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1301 = false;
        } else {
            field1301 = true;
        }
        this.method2(503, 765, 0);
    }

    @OriginalMember(owner = "client", name = "O", descriptor = "(I)Ljava/lang/String;")
    public final String method554(int arg0) {
        while (arg0 >= 0) {
            this.field1461.method229(53);
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else if (super.field18 != null) {
            return "runescape.com";
        } else {
            return super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZZ)V")
    public final void method555(boolean arg0, boolean arg1) {
        for (int var3 = 0; var3 < this.field1427; ++var3) {
            NpcEntity var4 = this.field1426[this.field1428[var3]];
            int var5 = (this.field1428[var3] << 14) + 536870912;
            if (var4 != null && var4.method127(509) && var4.field464.field1012 == arg0) {
                int var6 = var4.field409 >> 7;
                int var7 = var4.field410 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field413 == 1 && (var4.field409 & 127) == 64 && (var4.field410 & 127) == 64) {
                        if (this.field1649[var6][var7] == this.field1606) {
                            continue;
                        }
                        this.field1649[var6][var7] = this.field1606;
                    }
                    this.field1227.method75(var5, var4.field409, this.method542(this.field1479, var4.field409, var4.field410, this.field1607), var4, var4.field410, this.field1607, (var4.field413 - 1) * 64 + 60, -769, var4.field412, var4.field411);
                }
            }
        }
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method556(boolean arg0) {
        try {
            this.field1595 = -1;
            this.field1341.method262();
            this.field1588.method262();
            Pix3D.method180(41288);
            this.method529(208);
            this.field1227.method64(true);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1637[var2].method361(27237);
            }
            System.gc();
            World var3 = new World(this.field1415, this.field1230, 104, 49127, 104);
            int var4 = this.field1417.length;
            World.field43 = World3D.field296;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1474[var5] >> 8;
                int var7 = this.field1474[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field43 = false;
                }
            }
            if (World.field43) {
                this.field1227.method65(this.field1607, 7);
            } else {
                this.field1227.method65(0, 7);
            }
            this.field1461.method228(239, 0);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1474[var8] >> 8) * 64 - this.field1503;
                int var10 = (this.field1474[var8] & 255) * 64 - this.field1504;
                byte[] var11 = this.field1417[var8];
                if (var11 != null) {
                    var3.method15((this.field1391 - 6) * 8, var10, (this.field1390 - 6) * 8, var9, var11, 8);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field1474[var12] >> 8) * 64 - this.field1503;
                int var14 = (this.field1474[var12] & 255) * 64 - this.field1504;
                byte[] var15 = this.field1417[var12];
                if (var15 == null && this.field1391 < 800) {
                    var3.method14(64, -190, var14, var13, 64);
                }
            }
            this.field1461.method228(239, 0);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field1395[var16];
                if (var17 != null) {
                    int var18 = (this.field1474[var16] >> 8) * 64 - this.field1503;
                    int var19 = (this.field1474[var16] & 255) * 64 - this.field1504;
                    var3.method18(this.field1227, var18, 6, var19, var17, this.field1637);
                }
            }
            this.field1461.method228(239, 0);
            var3.method20(this.field1227, this.field1637, (byte) 7);
            this.field1271.method268(false);
            this.field1461.method228(239, 0);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method560(var20, var21);
                }
            }
            this.method533(false);
        } catch (Exception var34) {
        }
        LocType.field974.method117();
        if (field1302 && signlink.cache_dat != null) {
            int var23 = this.field1209.method282(0, (byte) 3);
            for (int var24 = 0; var24 < var23; ++var24) {
                int var25 = this.field1209.method287(var24, (byte) 1);
                if ((var25 & 121) == 0) {
                    Model.method138(779, var24);
                }
            }
        }
        System.gc();
        Pix3D.method181(20, (byte) 3);
        this.field1209.method293(-491);
        int var26 = (this.field1390 - 6) / 8 - 1;
        int var27 = (this.field1390 + 6) / 8 + 1;
        int var28 = (this.field1391 - 6) / 8 - 1;
        int var29 = (this.field1391 + 6) / 8 + 1;
        if (!arg0) {
            if (this.field1641) {
                var26 = 49;
                var27 = 50;
                var28 = 49;
                var29 = 50;
            }
            for (int var30 = var26; var30 <= var27; ++var30) {
                for (int var31 = var28; var31 <= var29; ++var31) {
                    if (var26 == var30 || var27 == var30 || var28 == var31 || var29 == var31) {
                        int var32 = this.field1209.method284(31009, var30, var31, 0);
                        if (var32 != -1) {
                            this.field1209.method294((byte) 70, var32, 3);
                        }
                        int var33 = this.field1209.method284(31009, var30, var31, 1);
                        if (var33 != -1) {
                            this.field1209.method294((byte) 70, var33, 3);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZJ)V")
    public final void method557(boolean arg0, long arg1) {
        if (!arg0) {
            if (arg1 != 0L) {
                if (this.field1530 >= 100) {
                    this.method465(-547, "", "Your ignore list is full. Max of 100 hit", 0);
                } else {
                    String var4 = JString.method314(true, JString.method311((byte) -49, arg1));
                    for (int var5 = 0; var5 < this.field1530; ++var5) {
                        if (this.field1334[var5] == arg1) {
                            this.method465(-547, "", var4 + " is already on your ignore list", 0);
                            return;
                        }
                    }
                    for (int var6 = 0; var6 < this.field1491; ++var6) {
                        if (this.field1385[var6] == arg1) {
                            this.method465(-547, "", "Please remove " + var4 + " from your friend list first", 0);
                            return;
                        }
                    }
                    this.field1334[this.field1530++] = arg1;
                    this.field1372 = true;
                    this.field1461.method228(189, 0);
                    this.field1461.method235((byte) -58, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BJ)V")
    public final void method558(byte arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field1491; ++var4) {
                if (this.field1385[var4] == arg1) {
                    --this.field1491;
                    this.field1372 = true;
                    for (int var5 = var4; var5 < this.field1491; ++var5) {
                        this.field1219[var5] = this.field1219[var5 + 1];
                        this.field1365[var5] = this.field1365[var5 + 1];
                        this.field1385[var5] = this.field1385[var5 + 1];
                    }
                    this.field1461.method228(84, 0);
                    this.field1461.method235((byte) -58, arg1);
                    break;
                }
            }
            if (arg0 == 106) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method559(int arg0, int arg1) {
        int var3 = VarpType.field1164[arg0].field1172;
        if (var3 != 0) {
            int var4 = this.field1361[arg0];
            if (arg1 != 4363) {
                this.field1461.method229(208);
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    Pix3D.method186(-208, 0.9D);
                }
                if (var4 == 2) {
                    Pix3D.method186(-208, 0.8D);
                }
                if (var4 == 3) {
                    Pix3D.method186(-208, 0.7D);
                }
                if (var4 == 4) {
                    Pix3D.method186(-208, 0.6D);
                }
                ObjType.field1070.method117();
                this.field1380 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field1480;
                if (var4 == 0) {
                    this.method449(this.field1392, this.field1480, 0);
                    this.field1480 = true;
                }
                if (var4 == 1) {
                    this.method449(this.field1392, this.field1480, -400);
                    this.field1480 = true;
                }
                if (var4 == 2) {
                    this.method449(this.field1392, this.field1480, -800);
                    this.field1480 = true;
                }
                if (var4 == 3) {
                    this.method449(this.field1392, this.field1480, -1200);
                    this.field1480 = true;
                }
                if (var4 == 4) {
                    this.field1480 = false;
                }
                if (this.field1480 != var5 && !field1302) {
                    if (this.field1480) {
                        this.field1596 = this.field1314;
                        this.field1597 = false;
                        this.field1209.method289(2, this.field1596);
                    } else {
                        this.method518(0);
                    }
                    this.field1467 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field1327 = true;
                    this.method477(0, false);
                }
                if (var4 == 1) {
                    this.field1327 = true;
                    this.method477(-400, false);
                }
                if (var4 == 2) {
                    this.field1327 = true;
                    this.method477(-800, false);
                }
                if (var4 == 3) {
                    this.field1327 = true;
                    this.method477(-1200, false);
                }
                if (var4 == 4) {
                    this.field1327 = false;
                }
            }
            if (var3 == 5) {
                this.field1557 = var4;
            }
            if (var3 == 6) {
                this.field1295 = var4;
            }
            if (var3 == 8) {
                this.field1556 = var4;
                this.field1217 = true;
            }
            if (var3 == 9) {
                this.field1218 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method560(int arg0, int arg1) {
        LinkList var3 = this.field1616[this.field1607][arg0][arg1];
        if (var3 == null) {
            this.field1227.method85(this.field1607, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method258(); var6 != null; var6 = (ObjStackEntity) var3.method260(-536)) {
                ObjType var11 = ObjType.method350(var6.field501);
                int var12 = var11.field1044;
                if (var11.field1043) {
                    var12 = (var6.field502 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method256(800, var5);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method258(); var9 != null; var9 = (ObjStackEntity) var3.method260(-536)) {
                if (var5.field501 != var9.field501 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field501 != var9.field501 && var7.field501 != var9.field501 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1227.method71(this.field1607, arg1, this.method542(this.field1479, arg0 * 128 + 64, arg1 * 128 + 64, this.field1607), var10, var5, 5865, var8, var7, arg0);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lmb;II)V")
    private final void method561(Packet arg0, int arg1, int arg2) {
        if (this.field1238 != arg2) {
            this.field1461.method229(102);
        }
        for (int var4 = 0; var4 < this.field1439; ++var4) {
            int var5 = this.field1440[var4];
            NpcEntity var6 = this.field1426[var5];
            int var7 = arg0.method239();
            if ((var7 & 1) == 1) {
                int var8 = arg0.method239();
                int var9 = arg0.method239();
                var6.method128(var9, (byte) 7, var8);
                var6.field428 = field1618 + 300;
                var6.field429 = arg0.method239();
                var6.field430 = arg0.method239();
            }
            if ((var7 & 2) == 2) {
                int var10 = arg0.method241();
                if (var10 == 65535) {
                    var10 = -1;
                }
                if (var6.field437 == var10) {
                    var6.field441 = 0;
                }
                int var11 = arg0.method239();
                if (var6.field437 == var10 && var10 != -1) {
                    int var12 = SeqType.field1121[var10].field1135;
                    if (var12 == 1) {
                        var6.field438 = 0;
                        var6.field439 = 0;
                        var6.field440 = var11;
                        var6.field441 = 0;
                    }
                    if (var12 == 2) {
                        var6.field441 = 0;
                    }
                } else if (var10 == -1 || var6.field437 == -1 || SeqType.field1121[var10].field1129 >= SeqType.field1121[var6.field437].field1129) {
                    var6.field437 = var10;
                    var6.field438 = 0;
                    var6.field439 = 0;
                    var6.field440 = var11;
                    var6.field441 = 0;
                    var6.field463 = var6.field458;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field431 = arg0.method241();
                if (var6.field431 == 65535) {
                    var6.field431 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field421 = arg0.method246();
                var6.field422 = 100;
            }
            if ((var7 & 16) == 16) {
                int var13 = arg0.method239();
                int var14 = arg0.method239();
                var6.method128(var14, (byte) 7, var13);
                var6.field428 = field1618 + 300;
                var6.field429 = arg0.method239();
                var6.field430 = arg0.method239();
            }
            if ((var7 & 32) == 32) {
                var6.field464 = NpcType.method344(arg0.method241());
                var6.field413 = var6.field464.field994;
                var6.field457 = var6.field464.field1016;
                var6.field416 = var6.field464.field998;
                var6.field417 = var6.field464.field999;
                var6.field418 = var6.field464.field1000;
                var6.field419 = var6.field464.field1001;
                var6.field414 = var6.field464.field997;
            }
            if ((var7 & 64) == 64) {
                var6.field442 = arg0.method241();
                int var15 = arg0.method244();
                var6.field446 = var15 >> 16;
                var6.field445 = (var15 & 65535) + field1618;
                var6.field443 = 0;
                var6.field444 = 0;
                if (var6.field445 > field1618) {
                    var6.field443 = -1;
                }
                if (var6.field442 == 65535) {
                    var6.field442 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field432 = arg0.method241();
                var6.field433 = arg0.method241();
            }
        }
    }

    @OriginalMember(owner = "client", name = "P", descriptor = "(I)V")
    public final void method562(int arg0) {
        if (arg0 != 18798) {
            this.field1393 = -286;
        }
        try {
            int var2 = field1642.field409 + this.field1638;
            int var3 = field1642.field410 + this.field1424;
            if (this.field1329 - var2 < -500 || this.field1329 - var2 > 500 || this.field1330 - var3 < -500 || this.field1330 - var3 > 500) {
                this.field1329 = var2;
                this.field1330 = var3;
            }
            if (this.field1329 != var2) {
                this.field1329 += (var2 - this.field1329) / 16;
            }
            if (this.field1330 != var3) {
                this.field1330 += (var3 - this.field1330) / 16;
            }
            if (super.field33[1] == 1) {
                this.field1320 += (-24 - this.field1320) / 2;
            } else if (super.field33[2] == 1) {
                this.field1320 += (24 - this.field1320) / 2;
            } else {
                this.field1320 /= 2;
            }
            if (super.field33[3] == 1) {
                this.field1321 += (12 - this.field1321) / 2;
            } else if (super.field33[4] == 1) {
                this.field1321 += (-12 - this.field1321) / 2;
            } else {
                this.field1321 /= 2;
            }
            this.field1319 = this.field1320 / 2 + this.field1319 & 2047;
            this.field1318 += this.field1321 / 2;
            if (this.field1318 < 128) {
                this.field1318 = 128;
            }
            if (this.field1318 > 383) {
                this.field1318 = 383;
            }
            int var4 = this.field1329 >> 7;
            int var5 = this.field1330 >> 7;
            int var6 = this.method542(this.field1479, this.field1329, this.field1330, this.field1607);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field1607;
                        if (var10 < 3 && (this.field1230[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field1415[var10][var8][var9];
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
            if (var12 > this.field1500) {
                this.field1500 += (var12 - this.field1500) / 24;
            } else if (var12 < this.field1500) {
                this.field1500 += (var12 - this.field1500) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field1642.field409 + "," + field1642.field410 + "," + this.field1329 + "," + this.field1330 + "," + this.field1390 + "," + this.field1391 + "," + this.field1503 + "," + this.field1504);
            throw new RuntimeException("eek");
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field1477[var1] = var0 / 4;
        }
        field1489 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field1489[var3] = var2 - 1;
            var2 += var2;
        }
        field1507 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field1580 = -838;
        field1643 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
    }
}
