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

    @OriginalMember(owner = "client", name = "L", descriptor = "[I")
    private int[] field1192 = new int[50];

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field1193 = -36217;

    @OriginalMember(owner = "client", name = "N", descriptor = "Z")
    private boolean field1194 = false;

    @OriginalMember(owner = "client", name = "T", descriptor = "Z")
    private boolean field1200 = false;

    @OriginalMember(owner = "client", name = "V", descriptor = "[Ljb;")
    private Pix32[] field1202 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "W", descriptor = "[I")
    private int[] field1203 = new int[500];

    @OriginalMember(owner = "client", name = "X", descriptor = "[I")
    private int[] field1204 = new int[500];

    @OriginalMember(owner = "client", name = "Y", descriptor = "[I")
    private int[] field1205 = new int[500];

    @OriginalMember(owner = "client", name = "Z", descriptor = "[I")
    private int[] field1206 = new int[500];

    @OriginalMember(owner = "client", name = "bb", descriptor = "[I")
    private int[] field1208 = new int[1000];

    @OriginalMember(owner = "client", name = "cb", descriptor = "[I")
    private int[] field1209 = new int[1000];

    @OriginalMember(owner = "client", name = "db", descriptor = "B")
    private byte field1210 = 4;

    @OriginalMember(owner = "client", name = "eb", descriptor = "[I")
    private int[] field1211 = new int[2000];

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field1212 = 256;

    @OriginalMember(owner = "client", name = "gb", descriptor = "Z")
    private boolean field1213 = false;

    @OriginalMember(owner = "client", name = "mb", descriptor = "[Lab;")
    private NpcEntity[] field1219 = new NpcEntity[16384];

    @OriginalMember(owner = "client", name = "ob", descriptor = "[I")
    public int[] field1221 = new int[16384];

    @OriginalMember(owner = "client", name = "zb", descriptor = "[Lwb;")
    public FileStream[] field1232 = new FileStream[5];

    @OriginalMember(owner = "client", name = "Ab", descriptor = "[Ljc;")
    private CollisionMap[] field1233 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "Db", descriptor = "B")
    private byte field1236 = -65;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1237 = new CRC32();

    @OriginalMember(owner = "client", name = "Fb", descriptor = "Z")
    public boolean field1238 = false;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "Z")
    private boolean field1243 = false;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "[I")
    private int[] field1244 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Mb", descriptor = "[I")
    private int[] field1245 = new int[100];

    @OriginalMember(owner = "client", name = "Nb", descriptor = "[Ljava/lang/String;")
    private String[] field1246 = new String[100];

    @OriginalMember(owner = "client", name = "Ob", descriptor = "[Ljava/lang/String;")
    private String[] field1247 = new String[100];

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field1248 = 3;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private final int field1249 = 100;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "[I")
    private int[] field1250 = new int[100];

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field1252 = 128;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "[Ljava/lang/String;")
    private String[] field1257 = new String[200];

    @OriginalMember(owner = "client", name = "ac", descriptor = "Z")
    private boolean field1259 = true;

    @OriginalMember(owner = "client", name = "bc", descriptor = "Lmb;")
    private Packet field1260 = Packet.method226(1, (byte) 73);

    @OriginalMember(owner = "client", name = "cc", descriptor = "[I")
    private int[] field1261 = new int[5];

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field1273 = 2;

    @OriginalMember(owner = "client", name = "qc", descriptor = "Z")
    private boolean field1275 = false;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field1279 = 2;

    @OriginalMember(owner = "client", name = "yc", descriptor = "Z")
    private boolean field1283 = false;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "Z")
    private boolean field1286 = true;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "[I")
    private int[] field1287 = new int[256];

    @OriginalMember(owner = "client", name = "Dc", descriptor = "Z")
    private boolean field1288 = true;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field1289 = -1;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "[Ljava/lang/String;")
    private String[] field1292 = new String[500];

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field1298 = -1;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field1299 = -1;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "[I")
    private int[] field1305 = new int[50];

    @OriginalMember(owner = "client", name = "ad", descriptor = "[I")
    private int[] field1311 = new int[5];

    @OriginalMember(owner = "client", name = "bd", descriptor = "B")
    private byte field1312 = 7;

    @OriginalMember(owner = "client", name = "ed", descriptor = "Z")
    private boolean field1315 = true;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field1318 = 110;

    @OriginalMember(owner = "client", name = "id", descriptor = "Lmb;")
    private Packet field1319 = Packet.method226(1, (byte) 73);

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field1323 = 2;

    @OriginalMember(owner = "client", name = "qd", descriptor = "[I")
    private int[] field1327 = new int[7];

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field1329 = 50;

    @OriginalMember(owner = "client", name = "td", descriptor = "[I")
    private int[] field1330 = new int[this.field1329];

    @OriginalMember(owner = "client", name = "ud", descriptor = "[I")
    private int[] field1331 = new int[this.field1329];

    @OriginalMember(owner = "client", name = "vd", descriptor = "[I")
    private int[] field1332 = new int[this.field1329];

    @OriginalMember(owner = "client", name = "wd", descriptor = "[I")
    private int[] field1333 = new int[this.field1329];

    @OriginalMember(owner = "client", name = "xd", descriptor = "[I")
    private int[] field1334 = new int[this.field1329];

    @OriginalMember(owner = "client", name = "yd", descriptor = "[I")
    private int[] field1335 = new int[this.field1329];

    @OriginalMember(owner = "client", name = "zd", descriptor = "[I")
    private int[] field1336 = new int[this.field1329];

    @OriginalMember(owner = "client", name = "Ad", descriptor = "[Ljava/lang/String;")
    private String[] field1337 = new String[this.field1329];

    @OriginalMember(owner = "client", name = "Dd", descriptor = "[I")
    private int[] field1340 = new int[50];

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field1349 = 1;

    @OriginalMember(owner = "client", name = "Od", descriptor = "Z")
    private boolean field1351 = true;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "Z")
    private boolean field1352 = false;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[Ljb;")
    private Pix32[] field1353 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Ud", descriptor = "[[I")
    private int[][] field1357 = new int[104][104];

    @OriginalMember(owner = "client", name = "Xd", descriptor = "Z")
    private boolean field1360 = false;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "Z")
    private boolean field1362 = false;

    @OriginalMember(owner = "client", name = "ge", descriptor = "Z")
    private boolean field1369 = false;

    @OriginalMember(owner = "client", name = "me", descriptor = "Z")
    private boolean field1375 = false;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field1376 = 2048;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field1377 = 2047;

    @OriginalMember(owner = "client", name = "pe", descriptor = "[Lbb;")
    private PlayerEntity[] field1378 = new PlayerEntity[this.field1376];

    @OriginalMember(owner = "client", name = "re", descriptor = "[I")
    public int[] field1380 = new int[this.field1376];

    @OriginalMember(owner = "client", name = "te", descriptor = "[I")
    private int[] field1382 = new int[this.field1376];

    @OriginalMember(owner = "client", name = "ue", descriptor = "[Lmb;")
    private Packet[] field1383 = new Packet[this.field1376];

    @OriginalMember(owner = "client", name = "ve", descriptor = "Z")
    private boolean field1384 = false;

    @OriginalMember(owner = "client", name = "we", descriptor = "Z")
    private boolean field1385 = false;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "B")
    private byte field1391 = 7;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "Z")
    private boolean field1395 = false;

    @OriginalMember(owner = "client", name = "He", descriptor = "[[I")
    private int[][] field1396 = new int[104][104];

    @OriginalMember(owner = "client", name = "Je", descriptor = "Z")
    private boolean field1398 = false;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field1405 = 2;

    @OriginalMember(owner = "client", name = "Re", descriptor = "[[[Lpb;")
    private LinkList[][][] field1406 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "Se", descriptor = "Z")
    private boolean field1407 = false;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "Z")
    private boolean field1410 = false;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field1411 = -1;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "[I")
    private int[] field1412 = new int[5];

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field1416 = 8;

    @OriginalMember(owner = "client", name = "cf", descriptor = "Ljava/lang/String;")
    private String field1417 = "";

    @OriginalMember(owner = "client", name = "df", descriptor = "Ljava/lang/String;")
    private String field1418 = "";

    @OriginalMember(owner = "client", name = "ef", descriptor = "[I")
    private int[] field1419 = new int[Stats.field1128];

    @OriginalMember(owner = "client", name = "ff", descriptor = "Z")
    private boolean field1420 = false;

    @OriginalMember(owner = "client", name = "jf", descriptor = "Lpb;")
    private LinkList field1423 = new LinkList(false);

    @OriginalMember(owner = "client", name = "kf", descriptor = "[I")
    private int[] field1424 = new int[33];

    @OriginalMember(owner = "client", name = "lf", descriptor = "Z")
    private boolean field1425 = false;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Ljava/lang/String;")
    private String field1426 = "";

    @OriginalMember(owner = "client", name = "nf", descriptor = "Ljava/lang/String;")
    private String field1427 = "";

    @OriginalMember(owner = "client", name = "tf", descriptor = "Z")
    private boolean field1433 = false;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field1435 = -102;

    @OriginalMember(owner = "client", name = "yf", descriptor = "Z")
    private boolean field1438 = false;

    @OriginalMember(owner = "client", name = "zf", descriptor = "Z")
    private boolean field1439 = false;

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private int field1440 = -1;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field1441 = 256;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Ljava/lang/String;")
    private String field1444 = "";

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field1446 = 1;

    @OriginalMember(owner = "client", name = "If", descriptor = "Z")
    private boolean field1448 = false;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field1449 = 9;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "Lpb;")
    private LinkList field1451 = new LinkList(false);

    @OriginalMember(owner = "client", name = "Of", descriptor = "[I")
    public int[] field1454 = new int[1000];

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field1455 = 2301979;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field1457 = 3353893;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field1459 = -21513;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "[Lkb;")
    private Pix8[] field1460 = new Pix8[13];

    @OriginalMember(owner = "client", name = "bg", descriptor = "[I")
    private int[] field1467 = new int[Stats.field1128];

    @OriginalMember(owner = "client", name = "cg", descriptor = "[I")
    private int[] field1468 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "hg", descriptor = "[Lkb;")
    private Pix8[] field1473 = new Pix8[50];

    @OriginalMember(owner = "client", name = "ug", descriptor = "Ld;")
    private Component field1486 = new Component();

    @OriginalMember(owner = "client", name = "zg", descriptor = "Z")
    private boolean field1491 = false;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "Z")
    private boolean field1494 = true;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "[I")
    private int[] field1497 = new int[2000];

    @OriginalMember(owner = "client", name = "Kg", descriptor = "[I")
    private int[] field1502 = new int[151];

    @OriginalMember(owner = "client", name = "Lg", descriptor = "[I")
    private final int[] field1503 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Qg", descriptor = "Z")
    private boolean field1508 = false;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field1509 = 78;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field1513 = 7759444;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "[I")
    private int[] field1514 = new int[5];

    @OriginalMember(owner = "client", name = "Xg", descriptor = "[J")
    private long[] field1515 = new long[100];

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private int field1516 = 581;

    @OriginalMember(owner = "client", name = "ch", descriptor = "[I")
    private int[] field1520 = new int[5];

    @OriginalMember(owner = "client", name = "dh", descriptor = "[J")
    private long[] field1521 = new long[200];

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field1523 = -1;

    @OriginalMember(owner = "client", name = "kh", descriptor = "Z")
    private boolean field1528 = false;

    @OriginalMember(owner = "client", name = "lh", descriptor = "[I")
    private int[] field1529 = new int[4000];

    @OriginalMember(owner = "client", name = "mh", descriptor = "[I")
    private int[] field1530 = new int[4000];

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field1531 = 2;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field1535 = -13;

    @OriginalMember(owner = "client", name = "sh", descriptor = "Z")
    private boolean field1536 = false;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field1537 = 3;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field1542 = -1;

    @OriginalMember(owner = "client", name = "zh", descriptor = "Lmb;")
    private Packet field1543 = Packet.method226(1, (byte) 73);

    @OriginalMember(owner = "client", name = "Jh", descriptor = "[I")
    private int[] field1553 = new int[200];

    @OriginalMember(owner = "client", name = "Lh", descriptor = "Ljava/lang/String;")
    private String field1555 = "";

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field1557 = 2;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field1558 = -1;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "[Ljb;")
    private Pix32[] field1559 = new Pix32[20];

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field1574 = -1;

    @OriginalMember(owner = "client", name = "fi", descriptor = "[I")
    private int[] field1575 = new int[Stats.field1128];

    @OriginalMember(owner = "client", name = "gi", descriptor = "Ljava/lang/String;")
    private String field1576 = "";

    @OriginalMember(owner = "client", name = "oi", descriptor = "Ljava/lang/String;")
    private String field1584 = "";

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field1585 = 5063219;

    @OriginalMember(owner = "client", name = "qi", descriptor = "[[I")
    private int[][] field1586 = new int[104][104];

    @OriginalMember(owner = "client", name = "si", descriptor = "Ljava/lang/String;")
    private String field1588 = "";

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field1592 = -523;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field1594 = -1;

    @OriginalMember(owner = "client", name = "zi", descriptor = "[I")
    private int[] field1595 = new int[33];

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field1598 = -1;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field1599 = -22996;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "[Ljb;")
    private Pix32[] field1600 = new Pix32[50];

    @OriginalMember(owner = "client", name = "Ji", descriptor = "[Ljava/lang/String;")
    private String[] field1605 = new String[5];

    @OriginalMember(owner = "client", name = "Ki", descriptor = "[Z")
    private boolean[] field1606 = new boolean[5];

    @OriginalMember(owner = "client", name = "Pi", descriptor = "Z")
    private boolean field1611 = false;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "Z")
    public boolean field1612 = true;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "Z")
    private boolean field1617 = false;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "Z")
    private boolean field1621 = false;

    @OriginalMember(owner = "client", name = "aj", descriptor = "[Ljb;")
    private Pix32[] field1622 = new Pix32[8];

    @OriginalMember(owner = "client", name = "bj", descriptor = "Z")
    private boolean field1623 = false;

    @OriginalMember(owner = "client", name = "cj", descriptor = "Z")
    private boolean field1624 = false;

    @OriginalMember(owner = "client", name = "fj", descriptor = "Z")
    private boolean field1627 = false;

    @OriginalMember(owner = "client", name = "gj", descriptor = "B")
    private byte field1628 = -59;

    @OriginalMember(owner = "client", name = "ij", descriptor = "[Lkb;")
    private Pix8[] field1630 = new Pix8[2];

    @OriginalMember(owner = "client", name = "kj", descriptor = "I")
    private int field1632 = -1;

    @OriginalMember(owner = "client", name = "lj", descriptor = "I")
    private int field1633 = -1;

    @OriginalMember(owner = "client", name = "mj", descriptor = "[B")
    private byte[] field1634 = new byte[16384];

    @OriginalMember(owner = "client", name = "oj", descriptor = "Lpb;")
    private LinkList field1636 = new LinkList(false);

    @OriginalMember(owner = "client", name = "pj", descriptor = "[I")
    private int[] field1637 = new int[9];

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private int field1638 = -1;

    @OriginalMember(owner = "client", name = "vj", descriptor = "Z")
    private boolean field1643 = false;

    @OriginalMember(owner = "client", name = "xj", descriptor = "I")
    private int field1645 = -32176;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "[I")
    private int[] field1648 = new int[151];

    @OriginalMember(owner = "client", name = "Bj", descriptor = "[Z")
    private boolean[] field1649 = new boolean[5];

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private static int field1239 = 10;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "Z")
    private static boolean field1241 = true;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "Ljava/lang/String;")
    private static String field1258 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "mc", descriptor = "[I")
    public static final int[] field1271 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client", name = "kd", descriptor = "Z")
    private static boolean field1321 = true;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private static int field1341 = -62;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private static int field1421 = 678;

    @OriginalMember(owner = "client", name = "uf", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1434 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "fg", descriptor = "[I")
    private static int[] field1471 = new int[32];

    @OriginalMember(owner = "client", name = "ig", descriptor = "[I")
    private static int[] field1474;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1507;

    @OriginalMember(owner = "client", name = "uh", descriptor = "[[I")
    public static final int[][] field1538;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private static int field1593;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field1195;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field1196;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field1197;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field1201;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field1207;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field1215;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field1216;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field1217;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field1218;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field1222;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field1223;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field1224;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field1225;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private static int field1235;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field1251;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field1255;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private static int field1256;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field1267;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field1268;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client", name = "lc", descriptor = "I")
    private int field1270;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field1277;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private static int field1284;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private static int field1285;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field1291;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    private int field1293;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private static int field1294;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field1301;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field1304;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field1307;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field1308;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private int field1309;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private int field1313;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field1314;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field1316;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field1317;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field1324;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field1326;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private static int field1338;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private static int field1339;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field1350;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private static int field1354;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private int field1358;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    private int field1359;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field1361;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field1363;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field1364;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field1365;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field1366;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field1367;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field1372;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field1373;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private int field1374;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field1379;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field1381;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field1386;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field1387;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field1388;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field1394;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private static int field1408;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private static int field1409;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private int field1429;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field1430;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private int field1447;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field1450;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private int field1452;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "I")
    private int field1453;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field1456;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    public int field1462;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field1464;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client", name = "kg", descriptor = "I")
    private int field1476;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private int field1478;

    @OriginalMember(owner = "client", name = "ng", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field1488;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field1489;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private static int field1496;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private static int field1511;

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field1524;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field1526;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field1541;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field1554;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field1556;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field1577;

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private int field1578;

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field1579;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field1580;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private int field1581;

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field1582;

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field1583;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private static int field1587;

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private static int field1596;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private static int field1597;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field1601;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field1602;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field1603;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field1604;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field1609;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field1610;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field1616;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private static int field1618;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field1619;

    @OriginalMember(owner = "client", name = "dj", descriptor = "I")
    private int field1625;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    private int field1629;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private int field1631;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private int field1646;

    @OriginalMember(owner = "client", name = "zj", descriptor = "I")
    private static int field1647;

    @OriginalMember(owner = "client", name = "pc", descriptor = "J")
    private long field1274;

    @OriginalMember(owner = "client", name = "he", descriptor = "J")
    public long field1370;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "J")
    private long field1413;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "J")
    private long field1517;

    @OriginalMember(owner = "client", name = "jh", descriptor = "J")
    private long field1527;

    @OriginalMember(owner = "client", name = "Li", descriptor = "Le;")
    private ClientStream field1607;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "Lxb;")
    private Isaac field1461;

    @OriginalMember(owner = "client", name = "ie", descriptor = "Lyb;")
    private Jagfile field1371;

    @OriginalMember(owner = "client", name = "wj", descriptor = "Lfc;")
    public MouseTracking field1644;

    @OriginalMember(owner = "client", name = "af", descriptor = "Lvb;")
    private OnDemand field1415;

    @OriginalMember(owner = "client", name = "dc", descriptor = "Ljb;")
    private Pix32 field1262;

    @OriginalMember(owner = "client", name = "ec", descriptor = "Ljb;")
    private Pix32 field1263;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "Ljb;")
    private Pix32 field1300;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "Ljb;")
    private Pix32 field1303;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "Ljb;")
    private Pix32 field1442;

    @OriginalMember(owner = "client", name = "Df", descriptor = "Ljb;")
    private Pix32 field1443;

    @OriginalMember(owner = "client", name = "ah", descriptor = "Ljb;")
    private Pix32 field1518;

    @OriginalMember(owner = "client", name = "bh", descriptor = "Ljb;")
    private Pix32 field1519;

    @OriginalMember(owner = "client", name = "ai", descriptor = "Ljb;")
    private Pix32 field1570;

    @OriginalMember(owner = "client", name = "bi", descriptor = "Ljb;")
    private Pix32 field1571;

    @OriginalMember(owner = "client", name = "ci", descriptor = "Ljb;")
    private Pix32 field1572;

    @OriginalMember(owner = "client", name = "di", descriptor = "Ljb;")
    private Pix32 field1573;

    @OriginalMember(owner = "client", name = "ui", descriptor = "Ljb;")
    private Pix32 field1590;

    @OriginalMember(owner = "client", name = "tb", descriptor = "Lkb;")
    private Pix8 field1226;

    @OriginalMember(owner = "client", name = "ub", descriptor = "Lkb;")
    private Pix8 field1227;

    @OriginalMember(owner = "client", name = "vb", descriptor = "Lkb;")
    private Pix8 field1228;

    @OriginalMember(owner = "client", name = "wb", descriptor = "Lkb;")
    private Pix8 field1229;

    @OriginalMember(owner = "client", name = "xb", descriptor = "Lkb;")
    private Pix8 field1230;

    @OriginalMember(owner = "client", name = "vc", descriptor = "Lkb;")
    private Pix8 field1280;

    @OriginalMember(owner = "client", name = "wc", descriptor = "Lkb;")
    private Pix8 field1281;

    @OriginalMember(owner = "client", name = "xc", descriptor = "Lkb;")
    private Pix8 field1282;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "Lkb;")
    private Pix8 field1295;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "Lkb;")
    private Pix8 field1296;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "Lkb;")
    private Pix8 field1297;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "Lkb;")
    private Pix8 field1355;

    @OriginalMember(owner = "client", name = "Td", descriptor = "Lkb;")
    private Pix8 field1356;

    @OriginalMember(owner = "client", name = "De", descriptor = "Lkb;")
    private Pix8 field1392;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "Lkb;")
    private Pix8 field1393;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "Lkb;")
    private Pix8 field1399;

    @OriginalMember(owner = "client", name = "Le", descriptor = "Lkb;")
    private Pix8 field1400;

    @OriginalMember(owner = "client", name = "Me", descriptor = "Lkb;")
    private Pix8 field1401;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "Lkb;")
    private Pix8 field1402;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "Lkb;")
    private Pix8 field1403;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "Llb;")
    private PixFont field1344;

    @OriginalMember(owner = "client", name = "Id", descriptor = "Llb;")
    private PixFont field1345;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "Llb;")
    private PixFont field1346;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "Llb;")
    private PixFont field1347;

    @OriginalMember(owner = "client", name = "qg", descriptor = "Lrb;")
    private PixMap field1482;

    @OriginalMember(owner = "client", name = "rg", descriptor = "Lrb;")
    private PixMap field1483;

    @OriginalMember(owner = "client", name = "sg", descriptor = "Lrb;")
    private PixMap field1484;

    @OriginalMember(owner = "client", name = "tg", descriptor = "Lrb;")
    private PixMap field1485;

    @OriginalMember(owner = "client", name = "oh", descriptor = "Lrb;")
    private PixMap field1532;

    @OriginalMember(owner = "client", name = "ph", descriptor = "Lrb;")
    private PixMap field1533;

    @OriginalMember(owner = "client", name = "qh", descriptor = "Lrb;")
    private PixMap field1534;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "Lrb;")
    private PixMap field1544;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "Lrb;")
    private PixMap field1545;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "Lrb;")
    private PixMap field1546;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "Lrb;")
    private PixMap field1547;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "Lrb;")
    private PixMap field1548;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "Lrb;")
    private PixMap field1549;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "Lrb;")
    private PixMap field1550;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "Lrb;")
    private PixMap field1551;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "Lrb;")
    private PixMap field1552;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "Lrb;")
    private PixMap field1560;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "Lrb;")
    private PixMap field1561;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "Lrb;")
    private PixMap field1562;

    @OriginalMember(owner = "client", name = "Th", descriptor = "Lrb;")
    private PixMap field1563;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "Lrb;")
    private PixMap field1564;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Lrb;")
    private PixMap field1565;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Lrb;")
    private PixMap field1566;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "Lrb;")
    private PixMap field1567;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "Lrb;")
    private PixMap field1568;

    @OriginalMember(owner = "client", name = "yb", descriptor = "Lbb;")
    public static PlayerEntity field1231;

    @OriginalMember(owner = "client", name = "od", descriptor = "Ls;")
    private World3D field1325;

    @OriginalMember(owner = "client", name = "S", descriptor = "Ljava/lang/String;")
    public String field1199;

    @OriginalMember(owner = "client", name = "Be", descriptor = "Ljava/lang/String;")
    public String field1390;

    @OriginalMember(owner = "client", name = "dg", descriptor = "Ljava/lang/String;")
    private String field1469;

    @OriginalMember(owner = "client", name = "nj", descriptor = "Ljava/lang/String;")
    private String field1635;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "Z")
    private static boolean field1242;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "Z")
    public static boolean field1397;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "Z")
    private static boolean field1620;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "Z")
    public static boolean field1650;

    @OriginalMember(owner = "client", name = "fc", descriptor = "[I")
    private int[] field1264;

    @OriginalMember(owner = "client", name = "gc", descriptor = "[I")
    private int[] field1265;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "[I")
    private int[] field1465;

    @OriginalMember(owner = "client", name = "ag", descriptor = "[I")
    private int[] field1466;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "[I")
    private int[] field1504;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "[I")
    private int[] field1505;

    @OriginalMember(owner = "client", name = "Og", descriptor = "[I")
    private int[] field1506;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "[I")
    private int[] field1613;

    @OriginalMember(owner = "client", name = "Si", descriptor = "[I")
    private int[] field1614;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "[I")
    private int[] field1615;

    @OriginalMember(owner = "client", name = "rj", descriptor = "[I")
    private int[] field1639;

    @OriginalMember(owner = "client", name = "sj", descriptor = "[I")
    private int[] field1640;

    @OriginalMember(owner = "client", name = "tj", descriptor = "[I")
    private int[] field1641;

    @OriginalMember(owner = "client", name = "uj", descriptor = "[I")
    private int[] field1642;

    @OriginalMember(owner = "client", name = "ej", descriptor = "[Lkb;")
    private Pix8[] field1626;

    @OriginalMember(owner = "client", name = "wf", descriptor = "[[B")
    private byte[][] field1436;

    @OriginalMember(owner = "client", name = "gg", descriptor = "[[B")
    private byte[][] field1472;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "[[[B")
    private byte[][][] field1512;

    @OriginalMember(owner = "client", name = "rc", descriptor = "[[[I")
    private int[][][] field1276;

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)Z")
    public final boolean method431(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            field1421 = 423;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public final String method432(int arg0, boolean arg1) {
        this.field1238 &= arg1;
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method433(byte arg0, int arg1) {
        if (arg1 >= 0) {
            if (this.field1621) {
                this.field1621 = false;
                this.field1528 = true;
            }
            int var3 = this.field1203[arg1];
            int var4 = this.field1204[arg1];
            int var5 = this.field1205[arg1];
            int var6 = this.field1206[arg1];
            if (this.field1391 == arg0) {
                boolean var7 = false;
            } else {
                this.field1439 = !this.field1439;
            }
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 737) {
                this.method442(889);
            }
            if (var5 == 563) {
                this.field1543.method228(4, 102);
                this.field1543.method230(var6);
                this.field1543.method230(var3);
                this.field1543.method230(var4);
                this.field1543.method230(this.field1388);
                this.field1222 = 0;
                this.field1223 = var4;
                this.field1224 = var3;
                this.field1225 = 2;
                if (Component.field70[var4].field76 == this.field1523) {
                    this.field1225 = 1;
                }
                if (Component.field70[var4].field76 == this.field1558) {
                    this.field1225 = 3;
                }
            }
            if (var5 == 694 || var5 == 962 || var5 == 795 || var5 == 681 || var5 == 100) {
                if (var5 == 681) {
                    ++field1618;
                    if (field1618 >= 116) {
                        this.field1543.method228(4, 162);
                        this.field1543.method232(13018169);
                    }
                    this.field1543.method228(4, 163);
                }
                if (var5 == 962) {
                    this.field1543.method228(4, 228);
                }
                if (var5 == 694) {
                    this.field1543.method228(4, 243);
                }
                if (var5 == 100) {
                    this.field1543.method228(4, 74);
                }
                if (var5 == 795) {
                    this.field1543.method228(4, 80);
                }
                this.field1543.method230(var6);
                this.field1543.method230(var3);
                this.field1543.method230(var4);
                this.field1222 = 0;
                this.field1223 = var4;
                this.field1224 = var3;
                this.field1225 = 2;
                if (Component.field70[var4].field76 == this.field1523) {
                    this.field1225 = 1;
                }
                if (Component.field70[var4].field76 == this.field1558) {
                    this.field1225 = 3;
                }
            }
            if (var5 == 398) {
                this.field1543.method228(4, 200);
                this.field1543.method230(var6);
                this.field1543.method230(var3);
                this.field1543.method230(var4);
                this.field1543.method230(this.field1198);
                this.field1543.method230(this.field1196);
                this.field1543.method230(this.field1197);
                this.field1222 = 0;
                this.field1223 = var4;
                this.field1224 = var3;
                this.field1225 = 2;
                if (Component.field70[var4].field76 == this.field1523) {
                    this.field1225 = 1;
                }
                if (Component.field70[var4].field76 == this.field1558) {
                    this.field1225 = 3;
                }
            }
            if (var5 == 231) {
                Component var8 = Component.field70[var4];
                boolean var9 = true;
                if (var8.field79 > 0) {
                    var9 = this.method440(var8, 0);
                }
                if (var9) {
                    this.field1543.method228(4, 244);
                    this.field1543.method230(var4);
                }
            }
            if (var5 == 1714) {
                NpcEntity var10 = this.field1219[var6];
                if (var10 != null) {
                    String var11;
                    if (var10.field465.field986 != null) {
                        var11 = new String(var10.field465.field986);
                    } else {
                        var11 = "It's a " + var10.field465.field985 + ".";
                    }
                    this.method515("", 0, this.field1599, var11);
                }
            }
            if (var5 == 524) {
                String var12 = this.field1292[arg1];
                int var13 = var12.indexOf("@whi@");
                if (var13 != -1) {
                    this.method442(889);
                    this.field1444 = var12.substring(var13 + 5).trim();
                    this.field1623 = false;
                    for (int var14 = 0; var14 < Component.field70.length; ++var14) {
                        if (Component.field70[var14] != null && Component.field70[var14].field79 == 600) {
                            this.field1633 = this.field1523 = Component.field70[var14].field76;
                            break;
                        }
                    }
                }
            }
            if (var5 == 721) {
                field1408 += var4;
                if (field1408 >= 139) {
                    this.field1543.method228(4, 28);
                    this.field1543.method233(0);
                }
                this.method531(var3, this.field1645, var4, var6, 213);
            }
            if (var5 == 242 || var5 == 209 || var5 == 309 || var5 == 852 || var5 == 793) {
                NpcEntity var15 = this.field1219[var6];
                if (var15 != null) {
                    this.method488(0, 1, 0, 9, var15.field460[0], 2, field1231.field461[0], field1231.field460[0], var15.field461[0], false, 1, 0);
                    this.field1498 = super.field30;
                    this.field1499 = super.field31;
                    this.field1501 = 2;
                    this.field1500 = 0;
                    if (var5 == 309) {
                        this.field1543.method228(4, 69);
                    }
                    if (var5 == 852) {
                        this.field1543.method228(4, 122);
                    }
                    if (var5 == 209) {
                        this.field1543.method228(4, 195);
                    }
                    if (var5 == 793) {
                        this.field1543.method228(4, 118);
                    }
                    if (var5 == 242) {
                        this.field1543.method228(4, 143);
                    }
                    this.field1543.method230(var6);
                }
            }
            if (var5 == 899 && this.method531(var3, this.field1645, var4, var6, 26)) {
                this.field1543.method230(this.field1388);
            }
            if (var5 == 225) {
                this.field1543.method228(4, 244);
                this.field1543.method230(var4);
                Component var16 = Component.field70[var4];
                if (var16.field85 != null && var16.field85[0][0] == 5) {
                    int var17 = var16.field85[0][1];
                    if (this.field1211[var17] != var16.field87[0]) {
                        this.field1211[var17] = var16.field87[0];
                        this.method475(false, var17);
                        this.field1200 = true;
                    }
                }
            }
            if (var5 == 1328) {
                ObjType var18 = ObjType.method350(var6);
                Component var19 = Component.field70[var4];
                String var20;
                if (var19 != null && var19.field72[var3] >= 100000) {
                    var20 = var19.field72[var3] + " x " + var18.field1024;
                } else if (var18.field1025 != null) {
                    var20 = new String(var18.field1025);
                } else {
                    var20 = "It's a " + var18.field1024 + ".";
                }
                this.method515("", 0, this.field1599, var20);
            }
            if (var5 == 902) {
                String var21 = this.field1292[arg1];
                int var22 = var21.indexOf("@whi@");
                if (var22 != -1) {
                    long var23 = JString.method310(var21.substring(var22 + 5).trim());
                    int var25 = -1;
                    for (int var26 = 0; var26 < this.field1609; ++var26) {
                        if (this.field1521[var26] == var23) {
                            var25 = var26;
                            break;
                        }
                    }
                    if (var25 != -1 && this.field1553[var25] > 0) {
                        this.field1528 = true;
                        this.field1621 = false;
                        this.field1611 = true;
                        this.field1588 = "";
                        this.field1619 = 3;
                        this.field1413 = this.field1521[var25];
                        this.field1576 = "Enter message to send to " + this.field1257[var25];
                    }
                }
            }
            if (var5 == 357) {
                this.method531(var3, this.field1645, var4, var6, 87);
            }
            if (var5 == 370) {
                boolean var27 = this.method488(0, 0, 0, 9, var3, 2, field1231.field461[0], field1231.field460[0], var4, false, 0, 0);
                if (!var27) {
                    this.method488(0, 1, 0, 9, var3, 2, field1231.field461[0], field1231.field460[0], var4, false, 1, 0);
                }
                this.field1498 = super.field30;
                this.field1499 = super.field31;
                this.field1501 = 2;
                this.field1500 = 0;
                this.field1543.method228(4, 202);
                this.field1543.method230(this.field1487 + var3);
                this.field1543.method230(this.field1488 + var4);
                this.field1543.method230(var6);
                this.field1543.method230(this.field1388);
            }
            if (var5 == 139 || var5 == 778 || var5 == 617 || var5 == 224 || var5 == 662) {
                boolean var29 = this.method488(0, 0, 0, 9, var3, 2, field1231.field461[0], field1231.field460[0], var4, false, 0, 0);
                if (!var29) {
                    this.method488(0, 1, 0, 9, var3, 2, field1231.field461[0], field1231.field460[0], var4, false, 1, 0);
                }
                this.field1498 = super.field30;
                this.field1499 = super.field31;
                this.field1501 = 2;
                this.field1500 = 0;
                if (var5 == 617) {
                    this.field1543.method228(4, 178);
                }
                if (var5 == 662) {
                    field1496 += this.field1488;
                    if (field1496 >= 118) {
                        this.field1543.method228(4, 56);
                        this.field1543.method233(0);
                    }
                    this.field1543.method228(4, 97);
                }
                if (var5 == 778) {
                    this.field1543.method228(4, 67);
                }
                if (var5 == 139) {
                    if ((var3 & 3) == 0) {
                        ++field1235;
                    }
                    if (field1235 >= 123) {
                        this.field1543.method228(4, 187);
                        this.field1543.method233(0);
                    }
                    this.field1543.method228(4, 141);
                }
                if (var5 == 224) {
                    field1597 += var4;
                    if (field1597 >= 75) {
                        this.field1543.method228(4, 206);
                        this.field1543.method229(19);
                    }
                    this.field1543.method228(4, 47);
                }
                this.field1543.method230(this.field1487 + var3);
                this.field1543.method230(this.field1488 + var4);
                this.field1543.method230(var6);
            }
            if (var5 == 507 || var5 == 957) {
                String var31 = this.field1292[arg1];
                int var32 = var31.indexOf("@whi@");
                if (var32 != -1) {
                    String var33 = var31.substring(var32 + 5).trim();
                    String var34 = JString.method314(true, JString.method311(JString.method310(var33), true));
                    boolean var35 = false;
                    for (int var36 = 0; var36 < this.field1379; ++var36) {
                        PlayerEntity var37 = this.field1378[this.field1380[var36]];
                        if (var37 != null && var37.field468 != null && var37.field468.equalsIgnoreCase(var34)) {
                            this.method488(0, 1, 0, 9, var37.field460[0], 2, field1231.field461[0], field1231.field460[0], var37.field461[0], false, 1, 0);
                            if (var5 == 507) {
                                field1338 += var6;
                                if (field1338 >= 66) {
                                    this.field1543.method228(4, 233);
                                    this.field1543.method229(154);
                                }
                                this.field1543.method228(4, 72);
                            }
                            if (var5 == 957) {
                                ++field1647;
                                if (field1647 >= 52) {
                                    this.field1543.method228(4, 121);
                                    this.field1543.method229(131);
                                }
                                this.field1543.method228(4, 192);
                            }
                            this.field1543.method230(this.field1380[var36]);
                            var35 = true;
                            break;
                        }
                    }
                    if (!var35) {
                        this.method515("", 0, this.field1599, "Unable to find " + var34);
                    }
                }
            }
            if (var5 == 810 && this.method531(var3, this.field1645, var4, var6, 240)) {
                this.field1543.method230(this.field1198);
                this.field1543.method230(this.field1196);
                this.field1543.method230(this.field1197);
            }
            if (var5 == 1381) {
                int var38 = var6 >> 14 & 32767;
                LocType var39 = LocType.method334(var38);
                String var40;
                if (var39.field938 != null) {
                    var40 = new String(var39.field938);
                } else {
                    var40 = "It's a " + var39.field937 + ".";
                }
                this.method515("", 0, this.field1599, var40);
            }
            if (var5 == 274) {
                Component var41 = Component.field70[var4];
                this.field1387 = 1;
                this.field1388 = var4;
                this.field1389 = var41.field130;
                this.field1195 = 0;
                this.field1200 = true;
                String var42 = var41.field128;
                if (var42.indexOf(" ") != -1) {
                    var42 = var42.substring(0, var42.indexOf(" "));
                }
                String var43 = var41.field128;
                if (var43.indexOf(" ") != -1) {
                    var43 = var43.substring(var43.indexOf(" ") + 1);
                }
                this.field1390 = var42 + " " + var41.field129 + " " + var43;
                if (this.field1389 == 16) {
                    this.field1200 = true;
                    this.field1248 = 3;
                    this.field1352 = true;
                }
            } else {
                if (var5 == 582 || var5 == 113 || var5 == 555 || var5 == 331 || var5 == 354) {
                    if (var5 == 331) {
                        this.field1543.method228(4, 160);
                    }
                    if (var5 == 582) {
                        if ((var6 & 3) == 0) {
                            ++field1409;
                        }
                        if (field1409 >= 133) {
                            this.field1543.method228(4, 131);
                            this.field1543.method230(6118);
                        }
                        this.field1543.method228(4, 181);
                    }
                    if (var5 == 113) {
                        this.field1543.method228(4, 70);
                    }
                    if (var5 == 555) {
                        this.field1543.method228(4, 59);
                    }
                    if (var5 == 354) {
                        this.field1543.method228(4, 62);
                    }
                    this.field1543.method230(var6);
                    this.field1543.method230(var3);
                    this.field1543.method230(var4);
                    this.field1222 = 0;
                    this.field1223 = var4;
                    this.field1224 = var3;
                    this.field1225 = 2;
                    if (Component.field70[var4].field76 == this.field1523) {
                        this.field1225 = 1;
                    }
                    if (Component.field70[var4].field76 == this.field1558) {
                        this.field1225 = 3;
                    }
                }
                if (var5 == 111) {
                    boolean var44 = this.method488(0, 0, 0, 9, var3, 2, field1231.field461[0], field1231.field460[0], var4, false, 0, 0);
                    if (!var44) {
                        this.method488(0, 1, 0, 9, var3, 2, field1231.field461[0], field1231.field460[0], var4, false, 1, 0);
                    }
                    this.field1498 = super.field30;
                    this.field1499 = super.field31;
                    this.field1501 = 2;
                    this.field1500 = 0;
                    this.field1543.method228(4, 245);
                    this.field1543.method230(this.field1487 + var3);
                    this.field1543.method230(this.field1488 + var4);
                    this.field1543.method230(var6);
                    this.field1543.method230(this.field1198);
                    this.field1543.method230(this.field1196);
                    this.field1543.method230(this.field1197);
                }
                if (var5 == 829) {
                    NpcEntity var46 = this.field1219[var6];
                    if (var46 != null) {
                        this.method488(0, 1, 0, 9, var46.field460[0], 2, field1231.field461[0], field1231.field460[0], var46.field461[0], false, 1, 0);
                        this.field1498 = super.field30;
                        this.field1499 = super.field31;
                        this.field1501 = 2;
                        this.field1500 = 0;
                        this.field1543.method228(4, 119);
                        this.field1543.method230(var6);
                        this.field1543.method230(this.field1198);
                        this.field1543.method230(this.field1196);
                        this.field1543.method230(this.field1197);
                    }
                }
                if (var5 == 718) {
                    if (!this.field1384) {
                        this.field1325.method102(-680, super.field31 - 4, super.field30 - 4);
                    } else {
                        this.field1325.method102(-680, var4 - 4, var3 - 4);
                    }
                }
                if (var5 == 997 && !this.field1420) {
                    this.field1543.method228(4, 146);
                    this.field1543.method230(var4);
                    this.field1420 = true;
                }
                if (var5 == 639 || var5 == 499 || var5 == 27 || var5 == 387 || var5 == 185) {
                    PlayerEntity var47 = this.field1378[var6];
                    if (var47 != null) {
                        this.method488(0, 1, 0, 9, var47.field460[0], 2, field1231.field461[0], field1231.field460[0], var47.field461[0], false, 1, 0);
                        this.field1498 = super.field30;
                        this.field1499 = super.field31;
                        this.field1501 = 2;
                        this.field1500 = 0;
                        if (var5 == 387) {
                            field1338 += var6;
                            if (field1338 >= 66) {
                                this.field1543.method228(4, 233);
                                this.field1543.method229(154);
                            }
                            this.field1543.method228(4, 72);
                        }
                        if (var5 == 27) {
                            this.field1543.method228(4, 18);
                        }
                        if (var5 == 639) {
                            ++field1647;
                            if (field1647 >= 52) {
                                this.field1543.method228(4, 121);
                                this.field1543.method229(131);
                            }
                            this.field1543.method228(4, 192);
                        }
                        if (var5 == 185) {
                            this.field1543.method228(4, 230);
                        }
                        if (var5 == 499) {
                            this.field1543.method228(4, 17);
                        }
                        this.field1543.method230(var6);
                    }
                }
                if (var5 == 435) {
                    this.field1543.method228(4, 244);
                    this.field1543.method230(var4);
                    Component var48 = Component.field70[var4];
                    if (var48.field85 != null && var48.field85[0][0] == 5) {
                        int var49 = var48.field85[0][1];
                        this.field1211[var49] = 1 - this.field1211[var49];
                        this.method475(false, var49);
                        this.field1200 = true;
                    }
                }
                if (var5 == 625) {
                    this.method531(var3, this.field1645, var4, var6, 33);
                }
                if (var5 == 131) {
                    PlayerEntity var50 = this.field1378[var6];
                    if (var50 != null) {
                        this.method488(0, 1, 0, 9, var50.field460[0], 2, field1231.field461[0], field1231.field460[0], var50.field461[0], false, 1, 0);
                        this.field1498 = super.field30;
                        this.field1499 = super.field31;
                        this.field1501 = 2;
                        this.field1500 = 0;
                        this.field1543.method228(4, 68);
                        this.field1543.method230(var6);
                        this.field1543.method230(this.field1388);
                    }
                }
                if (var5 == 1152) {
                    ObjType var51 = ObjType.method350(var6);
                    String var52;
                    if (var51.field1025 != null) {
                        var52 = new String(var51.field1025);
                    } else {
                        var52 = "It's a " + var51.field1024 + ".";
                    }
                    this.method515("", 0, this.field1599, var52);
                }
                if (var5 == 1071) {
                    this.method531(var3, this.field1645, var4, var6, 147);
                }
                if (var5 == 605 || var5 == 47 || var5 == 513 || var5 == 884) {
                    String var53 = this.field1292[arg1];
                    int var54 = var53.indexOf("@whi@");
                    if (var54 != -1) {
                        long var55 = JString.method310(var53.substring(var54 + 5).trim());
                        if (var5 == 605) {
                            this.method504(var55, (byte) -71);
                        }
                        if (var5 == 47) {
                            this.method484(var55, 35615);
                        }
                        if (var5 == 513) {
                            this.method472(var55, false);
                        }
                        if (var5 == 884) {
                            this.method447(var55, -608);
                        }
                    }
                }
                if (var5 == 240) {
                    NpcEntity var57 = this.field1219[var6];
                    if (var57 != null) {
                        this.method488(0, 1, 0, 9, var57.field460[0], 2, field1231.field461[0], field1231.field460[0], var57.field461[0], false, 1, 0);
                        this.field1498 = super.field30;
                        this.field1499 = super.field31;
                        this.field1501 = 2;
                        this.field1500 = 0;
                        this.field1543.method228(4, 231);
                        this.field1543.method230(var6);
                        this.field1543.method230(this.field1388);
                    }
                }
                if (var5 == 275) {
                    PlayerEntity var58 = this.field1378[var6];
                    if (var58 != null) {
                        this.method488(0, 1, 0, 9, var58.field460[0], 2, field1231.field461[0], field1231.field460[0], var58.field461[0], false, 1, 0);
                        this.field1498 = super.field30;
                        this.field1499 = super.field31;
                        this.field1501 = 2;
                        this.field1500 = 0;
                        this.field1543.method228(4, 113);
                        this.field1543.method230(var6);
                        this.field1543.method230(this.field1198);
                        this.field1543.method230(this.field1196);
                        this.field1543.method230(this.field1197);
                    }
                }
                if (var5 == 743) {
                    ++field1284;
                    if (field1284 >= 124) {
                        this.field1543.method228(4, 77);
                        this.field1543.method230(37954);
                    }
                    this.method531(var3, this.field1645, var4, var6, 98);
                }
                if (var5 == 102) {
                    this.field1195 = 1;
                    this.field1196 = var3;
                    this.field1197 = var4;
                    this.field1198 = var6;
                    this.field1199 = ObjType.method350(var6).field1024;
                    this.field1387 = 0;
                    this.field1200 = true;
                } else {
                    this.field1195 = 0;
                    this.field1387 = 0;
                    this.field1200 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    private final void method434(int arg0) {
        if (arg0 != 0) {
            this.method6();
        }
        if (this.field1317 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1636.method258(); var2 != null; var2 = (LocSpawned) this.field1636.method260(6)) {
                if (var2.field740 > 0) {
                    --var2.field740;
                }
                if (var2.field740 == 0) {
                    if (var2.field733 < 0 || World.method30(var2.field733, var2.field735, 23745)) {
                        this.method547(var2.field729, var2.field734, var2.field733, var2.field732, var2.field730, var2.field735, false, var2.field731);
                        var2.method120();
                    }
                } else {
                    if (var2.field739 > 0) {
                        --var2.field739;
                    }
                    if (var2.field739 == 0 && var2.field731 >= 1 && var2.field732 >= 1 && var2.field731 <= 102 && var2.field732 <= 102 && (var2.field736 < 0 || World.method30(var2.field736, var2.field738, 23745))) {
                        this.method547(var2.field729, var2.field737, var2.field736, var2.field732, var2.field730, var2.field738, false, var2.field731);
                        var2.field739 = -1;
                        if (var2.field736 == var2.field733 && var2.field733 == -1) {
                            var2.method120();
                        } else if (var2.field736 == var2.field733 && var2.field737 == var2.field734 && var2.field738 == var2.field735) {
                            var2.method120();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method7(byte arg0) {
        if (!this.field1410 && !this.field1508 && !this.field1194) {
            ++field1591;
            if (!this.field1238) {
                this.method552((byte) 6);
            } else {
                this.method536(0);
            }
            this.method465(0);
            if (arg0 != 68) {
                this.field1543.method229(205);
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method435(int arg0) {
        if (arg0 > 0) {
            if (field1242 && this.field1317 == 2 && World.field45 != this.field1277) {
                this.field1484.method268((byte) 9);
                this.field1345.method214(151, "Loading - please wait.", 0, 257, 0);
                this.field1345.method214(150, "Loading - please wait.", 0, 256, 16777215);
                this.field1484.method269(4, 4, super.field15, true);
                this.field1317 = 1;
                this.field1527 = System.currentTimeMillis();
            }
            if (this.field1317 == 1) {
                int var2 = this.method436((byte) 8);
                if (var2 != 0 && System.currentTimeMillis() - this.field1527 > 360000L) {
                    signlink.reporterror(this.field1426 + " glcfb " + this.field1517 + "," + var2 + "," + field1242 + "," + this.field1232[0] + "," + this.field1415.method290() + "," + this.field1277 + "," + this.field1480 + "," + this.field1481);
                    this.field1527 = System.currentTimeMillis();
                }
            }
            if (this.field1317 == 2 && this.field1638 != this.field1277) {
                this.field1638 = this.field1277;
                this.method527(this.field1277, (byte) -60);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)I")
    public final int method436(byte arg0) {
        for (int var2 = 0; var2 < this.field1472.length; ++var2) {
            if (this.field1472[var2] == null && this.field1505[var2] != -1) {
                return -1;
            }
            if (this.field1436[var2] == null && this.field1506[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1472.length; ++var4) {
            byte[] var6 = this.field1436[var4];
            if (var6 != null) {
                int var7 = (this.field1504[var4] >> 8) * 64 - this.field1487;
                int var8 = (this.field1504[var4] & 255) * 64 - this.field1488;
                var3 &= World.method16(var8, var7, var6, (byte) 74);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field1398) {
            return -4;
        } else {
            this.field1317 = 2;
            if (arg0 == 8) {
                boolean var5 = false;
                World.field45 = this.field1277;
                this.method553((byte) 6);
                this.field1543.method228(4, 134);
                return 0;
            } else {
                return 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZB)V")
    public final void method437(boolean arg0, byte arg1) {
        if (arg1 == 4) {
            boolean var3 = false;
        } else {
            this.method6();
        }
        this.method534(269);
        this.field1546.method268((byte) 9);
        this.field1392.method212(1, 0, 0);
        short var4 = 360;
        short var5 = 200;
        if (this.field1493 == 0) {
            int var6 = var5 / 2 + 80;
            this.field1344.method215(7711145, var4 / 2, this.field1415.field833, true, var6, true);
            int var7 = var5 / 2 - 20;
            this.field1346.method215(16776960, var4 / 2, "Welcome to RuneScape", true, var7, true);
            int var18 = var7 + 30;
            int var8 = var4 / 2 - 80;
            int var9 = var5 / 2 + 20;
            this.field1393.method212(1, var8 - 73, var9 - 20);
            this.field1346.method215(16777215, var8, "New user", true, var9 + 5, true);
            int var10 = var4 / 2 + 80;
            this.field1393.method212(1, var10 - 73, var9 - 20);
            this.field1346.method215(16777215, var10, "Existing User", true, var9 + 5, true);
        }
        if (this.field1493 == 2) {
            int var11 = var5 / 2 - 40;
            if (this.field1417.length() > 0) {
                this.field1346.method215(16776960, var4 / 2, this.field1417, true, var11 - 15, true);
                this.field1346.method215(16776960, var4 / 2, this.field1418, true, var11, true);
                var11 += 30;
            } else {
                this.field1346.method215(16776960, var4 / 2, this.field1418, true, var11 - 7, true);
                var11 += 30;
            }
            this.field1346.method219(true, "Username: " + this.field1426 + (this.field1422 == 0 & field1591 % 40 < 20 ? "@yel@|" : ""), var11, (byte) 45, 16777215, var4 / 2 - 90);
            var11 += 15;
            this.field1346.method219(true, "Password: " + JString.method316(this.field1236, this.field1427) + (this.field1422 == 1 & field1591 % 40 < 20 ? "@yel@|" : ""), var11, (byte) 45, 16777215, var4 / 2 - 88);
            var11 += 15;
            if (!arg0) {
                int var12 = var4 / 2 - 80;
                int var13 = var5 / 2 + 50;
                this.field1393.method212(1, var12 - 73, var13 - 20);
                this.field1346.method215(16777215, var12, "Login", true, var13 + 5, true);
                int var14 = var4 / 2 + 80;
                this.field1393.method212(1, var14 - 73, var13 - 20);
                this.field1346.method215(16777215, var14, "Cancel", true, var13 + 5, true);
            }
        }
        if (this.field1493 == 3) {
            this.field1346.method215(16776960, var4 / 2, "Create a free account", true, var5 / 2 - 60, true);
            int var15 = var5 / 2 - 35;
            this.field1346.method215(16777215, var4 / 2, "To create a new account you need to", true, var15, true);
            int var19 = var15 + 15;
            this.field1346.method215(16777215, var4 / 2, "go back to the main RuneScape webpage", true, var19, true);
            int var20 = var19 + 15;
            this.field1346.method215(16777215, var4 / 2, "and choose the red 'create account'", true, var20, true);
            int var21 = var20 + 15;
            this.field1346.method215(16777215, var4 / 2, "button at the top right of that page.", true, var21, true);
            int var22 = var21 + 15;
            int var16 = var4 / 2;
            int var17 = var5 / 2 + 50;
            this.field1393.method212(1, var16 - 73, var17 - 20);
            this.field1346.method215(16777215, var16, "Cancel", true, var17 + 5, true);
        }
        this.field1546.method269(171, 202, super.field15, true);
        if (this.field1448) {
            this.field1448 = false;
            this.field1544.method269(0, 128, super.field15, true);
            this.field1545.method269(371, 202, super.field15, true);
            this.field1549.method269(265, 0, super.field15, true);
            this.field1550.method269(265, 562, super.field15, true);
            this.field1551.method269(171, 128, super.field15, true);
            this.field1552.method269(171, 562, super.field15, true);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method438(boolean arg0) {
        if (this.field1366 == 0) {
            this.field1292[0] = "Cancel";
            this.field1205[0] = 1106;
            this.field1314 = 1;
            this.method485(0);
            this.field1456 = 0;
            if (super.field23 > 4 && super.field24 > 4 && super.field23 < 516 && super.field24 < 338) {
                if (this.field1523 != -1) {
                    this.method460(super.field24, 4, -653, Component.field70[this.field1523], 4, super.field23, 0);
                } else {
                    this.method496(1);
                }
            }
            if (this.field1582 != this.field1456) {
                this.field1582 = this.field1456;
            }
            this.field1456 = 0;
            if (super.field23 > 553 && super.field24 > 205 && super.field23 < 743 && super.field24 < 466) {
                if (this.field1594 != -1) {
                    this.method460(super.field24, 205, -653, Component.field70[this.field1594], 553, super.field23, 0);
                } else if (this.field1468[this.field1248] != -1) {
                    this.method460(super.field24, 205, -653, Component.field70[this.field1468[this.field1248]], 553, super.field23, 0);
                }
            }
            if (this.field1629 != this.field1456) {
                this.field1200 = true;
                this.field1629 = this.field1456;
            }
            this.field1456 = 0;
            if (super.field23 > 17 && super.field24 > 357 && super.field23 < 496 && super.field24 < 453) {
                if (this.field1558 != -1) {
                    this.method460(super.field24, 357, -653, Component.field70[this.field1558], 17, super.field23, 0);
                } else if (super.field24 < 434 && super.field23 < 426) {
                    this.method532(super.field24 - 357, 616, super.field23 - 17);
                }
            }
            if (this.field1558 != -1 && this.field1608 != this.field1456) {
                this.field1528 = true;
                this.field1608 = this.field1456;
            }
            boolean var2 = false;
            if (arg0) {
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field1314 - 1; ++var3) {
                        if (this.field1205[var3] < 1000 && this.field1205[var3 + 1] > 1000) {
                            String var4 = this.field1292[var3];
                            this.field1292[var3] = this.field1292[var3 + 1];
                            this.field1292[var3 + 1] = var4;
                            int var5 = this.field1205[var3];
                            this.field1205[var3] = this.field1205[var3 + 1];
                            this.field1205[var3 + 1] = var5;
                            int var6 = this.field1203[var3];
                            this.field1203[var3] = this.field1203[var3 + 1];
                            this.field1203[var3 + 1] = var6;
                            int var7 = this.field1204[var3];
                            this.field1204[var3] = this.field1204[var3 + 1];
                            this.field1204[var3 + 1] = var7;
                            int var8 = this.field1206[var3];
                            this.field1206[var3] = this.field1206[var3 + 1];
                            this.field1206[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIILbb;)V")
    public final void method439(boolean arg0, int arg1, int arg2, int arg3, PlayerEntity arg4) {
        if (field1231 != arg4) {
            if (this.field1314 < 400) {
                String var6 = arg4.field468 + method450(-283, arg4.field474, field1231.field474) + " (level-" + arg4.field474 + ")";
                if (this.field1195 == 1) {
                    this.field1292[this.field1314] = "Use " + this.field1199 + " with @whi@" + var6;
                    this.field1205[this.field1314] = 275;
                    this.field1206[this.field1314] = arg2;
                    this.field1203[this.field1314] = arg3;
                    this.field1204[this.field1314] = arg1;
                    ++this.field1314;
                } else if (this.field1387 == 1) {
                    if ((this.field1389 & 8) == 8) {
                        this.field1292[this.field1314] = this.field1390 + " @whi@" + var6;
                        this.field1205[this.field1314] = 131;
                        this.field1206[this.field1314] = arg2;
                        this.field1203[this.field1314] = arg3;
                        this.field1204[this.field1314] = arg1;
                        ++this.field1314;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field1605[var7] != null) {
                            this.field1292[this.field1314] = this.field1605[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field1605[var7].equalsIgnoreCase("attack")) {
                                if (arg4.field474 > field1231.field474) {
                                    var9 = 2000;
                                }
                            } else if (this.field1606[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field1205[this.field1314] = var9 + 639;
                            }
                            if (var7 == 1) {
                                this.field1205[this.field1314] = var9 + 499;
                            }
                            if (var7 == 2) {
                                this.field1205[this.field1314] = var9 + 27;
                            }
                            if (var7 == 3) {
                                this.field1205[this.field1314] = var9 + 387;
                            }
                            if (var7 == 4) {
                                this.field1205[this.field1314] = var9 + 185;
                            }
                            this.field1206[this.field1314] = arg2;
                            this.field1203[this.field1314] = arg3;
                            this.field1204[this.field1314] = arg1;
                            ++this.field1314;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field1314; ++var8) {
                    if (this.field1205[var8] == 718) {
                        this.field1292[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                if (!arg0) {
                    ;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;I)Z")
    public final boolean method440(Component arg0, int arg1) {
        this.field1428 += arg1;
        int var3 = arg0.field79;
        if (this.field1610 == 2) {
            if (var3 == 201) {
                this.field1528 = true;
                this.field1621 = false;
                this.field1611 = true;
                this.field1588 = "";
                this.field1619 = 1;
                this.field1576 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field1528 = true;
                this.field1621 = false;
                this.field1611 = true;
                this.field1588 = "";
                this.field1619 = 2;
                this.field1576 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field1432 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field1528 = true;
                this.field1621 = false;
                this.field1611 = true;
                this.field1588 = "";
                this.field1619 = 4;
                this.field1576 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field1528 = true;
                this.field1621 = false;
                this.field1611 = true;
                this.field1588 = "";
                this.field1619 = 5;
                this.field1576 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field1327[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = IdkType.field1090 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= IdkType.field1090) {
                                var6 = 0;
                            }
                        }
                        if (!IdkType.field1091[var6].field1097 && IdkType.field1091[var6].field1092 == var4 + (this.field1494 ? 0 : 7)) {
                            this.field1327[var4] = var6;
                            this.field1438 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field1514[var7];
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
                this.field1514[var7] = var9;
                this.field1438 = true;
            }
            if (var3 == 324 && !this.field1494) {
                this.field1494 = true;
                this.method452(false);
            }
            if (var3 == 325 && this.field1494) {
                this.field1494 = false;
                this.method452(false);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field1623 = !this.field1623;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method442(889);
                    if (this.field1444.length() > 0) {
                        this.field1543.method228(4, 203);
                        this.field1543.method235(854, JString.method310(this.field1444));
                        this.field1543.method229(var3 - 601);
                        this.field1543.method229(this.field1623 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1543.method228(4, 13);
                this.field1543.method229(this.field1494 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field1543.method229(this.field1327[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field1543.method229(this.field1514[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method441(int arg0) {
        if (arg0 != -7692) {
            this.field1193 = -366;
        }
        try {
            int var2 = field1231.field410 + this.field1556;
            int var3 = field1231.field411 + this.field1272;
            if (this.field1372 - var2 < -500 || this.field1372 - var2 > 500 || this.field1373 - var3 < -500 || this.field1373 - var3 > 500) {
                this.field1372 = var2;
                this.field1373 = var3;
            }
            if (this.field1372 != var2) {
                this.field1372 += (var2 - this.field1372) / 16;
            }
            if (this.field1373 != var3) {
                this.field1373 += (var3 - this.field1373) / 16;
            }
            if (super.field33[1] == 1) {
                this.field1254 += (-24 - this.field1254) / 2;
            } else if (super.field33[2] == 1) {
                this.field1254 += (24 - this.field1254) / 2;
            } else {
                this.field1254 /= 2;
            }
            if (super.field33[3] == 1) {
                this.field1255 += (12 - this.field1255) / 2;
            } else if (super.field33[4] == 1) {
                this.field1255 += (-12 - this.field1255) / 2;
            } else {
                this.field1255 /= 2;
            }
            this.field1253 = this.field1254 / 2 + this.field1253 & 2047;
            this.field1252 += this.field1255 / 2;
            if (this.field1252 < 128) {
                this.field1252 = 128;
            }
            if (this.field1252 > 383) {
                this.field1252 = 383;
            }
            int var4 = this.field1372 >> 7;
            int var5 = this.field1373 >> 7;
            int var6 = this.method470(this.field1373, this.field1277, this.field1372, 9803);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field1277;
                        if (var10 < 3 && (this.field1512[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field1276[var10][var8][var9];
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
            if (var12 > this.field1394) {
                this.field1394 += (var12 - this.field1394) / 24;
            } else if (var12 < this.field1394) {
                this.field1394 += (var12 - this.field1394) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field1231.field410 + "," + field1231.field411 + "," + this.field1372 + "," + this.field1373 + "," + this.field1480 + "," + this.field1481 + "," + this.field1487 + "," + this.field1488);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method442(int arg0) {
        this.field1543.method228(4, 58);
        if (this.field1594 != -1) {
            this.field1594 = -1;
            this.field1200 = true;
            this.field1420 = false;
            this.field1352 = true;
        }
        if (this.field1558 != -1) {
            this.field1558 = -1;
            this.field1528 = true;
            this.field1420 = false;
        }
        this.field1523 = -1;
        if (arg0 <= 0) {
            this.field1645 = -386;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZ)V")
    public final void method443(int arg0, int arg1, boolean arg2) {
        signlink.midivol = arg1;
        this.field1428 += arg0;
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method444(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method445(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field1342 != 0) {
            PixFont var3 = this.field1345;
            int var4 = 0;
            if (this.field1452 != 0) {
                var4 = 1;
            }
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field1247[var5] != null) {
                    int var6 = this.field1245[var5];
                    String var7 = this.field1246[var5];
                    byte var8 = 0;
                    if (var7 != null && var7.startsWith("@cr1@")) {
                        var7 = var7.substring(5);
                        var8 = 1;
                    }
                    if (var7 != null && var7.startsWith("@cr2@")) {
                        var7 = var7.substring(5);
                        var8 = 2;
                    }
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field1625 == 0 || this.field1625 == 1 && this.method448(var7, (byte) -97))) {
                        int var9 = 329 - var4 * 13;
                        byte var10 = 4;
                        var3.method217(0, var10, var9, this.field1537, "From");
                        var3.method217(65535, var10, var9 - 1, this.field1537, "From");
                        int var11 = var10 + var3.method216("From ", true);
                        if (var8 == 1) {
                            this.field1630[0].method212(1, var11, var9 - 12);
                            var11 += 14;
                        }
                        if (var8 == 2) {
                            this.field1630[1].method212(1, var11, var9 - 12);
                            var11 += 14;
                        }
                        var3.method217(0, var11, var9, this.field1537, var7 + ": " + this.field1247[var5]);
                        var3.method217(65535, var11, var9 - 1, this.field1537, var7 + ": " + this.field1247[var5]);
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 5 && this.field1625 < 2) {
                        int var12 = 329 - var4 * 13;
                        var3.method217(0, 4, var12, this.field1537, this.field1247[var5]);
                        var3.method217(65535, 4, var12 - 1, this.field1537, this.field1247[var5]);
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 6 && this.field1625 < 2) {
                        int var13 = 329 - var4 * 13;
                        var3.method217(0, 4, var13, this.field1537, "To " + var7 + ": " + this.field1247[var5]);
                        var3.method217(65535, 4, var13 - 1, this.field1537, "To " + var7 + ": " + this.field1247[var5]);
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILd;II)V")
    public final void method446(int arg0, int arg1, Component arg2, int arg3, int arg4) {
        if (arg2.field77 == 0 && arg2.field92 != null) {
            if (!arg2.field91 || this.field1582 == arg2.field75 || this.field1629 == arg2.field75 || this.field1608 == arg2.field75) {
                int var6 = Pix2D.field628;
                int var7 = Pix2D.field626;
                int var8 = Pix2D.field629;
                int var9 = Pix2D.field627;
                Pix2D.method167(arg2.field80 + arg3, true, arg3, arg2.field81 + arg1, arg1);
                int var10 = arg2.field92.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg2.field93[var11] + arg3;
                    int var13 = arg2.field94[var11] + arg1 - arg4;
                    Component var14 = Component.field70[arg2.field92[var11]];
                    int var15 = var14.field83 + var12;
                    int var16 = var14.field84 + var13;
                    if (var14.field79 > 0) {
                        this.method500(var14, this.field1259);
                    }
                    if (var14.field77 == 0) {
                        if (var14.field90 > var14.field89 - var14.field81) {
                            var14.field90 = var14.field89 - var14.field81;
                        }
                        if (var14.field90 < 0) {
                            var14.field90 = 0;
                        }
                        this.method446(field1421, var16, var14, var15, var14.field90);
                        if (var14.field89 > var14.field81) {
                            this.method478(this.field1592, var14.field81, var14.field89, var14.field80 + var15, var14.field90, var16);
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
                                                var30.method199(1, var20, var21);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field71[var17] - 1;
                                        if (var20 > Pix2D.field628 - 32 && var20 < Pix2D.field629 && var21 > Pix2D.field626 - 32 && var21 < Pix2D.field627 || this.field1366 != 0 && this.field1365 == var17) {
                                            int var25 = 0;
                                            if (this.field1195 == 1 && this.field1196 == var17 && this.field1197 == var14.field75) {
                                                var25 = 16777215;
                                            }
                                            Pix32 var26 = ObjType.method356(var25, var14.field72[var17], var24, 977);
                                            if (var26 != null) {
                                                if (this.field1366 != 0 && this.field1365 == var17 && this.field1364 == var14.field75) {
                                                    var22 = super.field23 - this.field1367;
                                                    var23 = super.field24 - this.field1368;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field1251 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method201(var20 + var22, 609, 128, var21 + var23);
                                                    if (var21 + var23 < Pix2D.field626 && arg2.field90 > 0) {
                                                        int var27 = (Pix2D.field626 - var21 - var23) * this.field1464 / 3;
                                                        if (var27 > this.field1464 * 10) {
                                                            var27 = this.field1464 * 10;
                                                        }
                                                        if (var27 > arg2.field90) {
                                                            var27 = arg2.field90;
                                                        }
                                                        arg2.field90 -= var27;
                                                        this.field1368 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > Pix2D.field627 && arg2.field90 < arg2.field89 - arg2.field81) {
                                                        int var28 = (var21 + var23 + 32 - Pix2D.field627) * this.field1464 / 3;
                                                        if (var28 > this.field1464 * 10) {
                                                            var28 = this.field1464 * 10;
                                                        }
                                                        if (var28 > arg2.field89 - arg2.field81 - arg2.field90) {
                                                            var28 = arg2.field89 - arg2.field81 - arg2.field90;
                                                        }
                                                        arg2.field90 += var28;
                                                        this.field1368 -= var28;
                                                    }
                                                } else if (this.field1225 != 0 && this.field1224 == var17 && this.field1223 == var14.field75) {
                                                    var26.method201(var20, 609, 128, var21);
                                                } else {
                                                    var26.method199(1, var20, var21);
                                                }
                                                if (var26.field671 == 33 || var14.field72[var17] != 1) {
                                                    int var29 = var14.field72[var17];
                                                    this.field1344.method217(0, var20 + 1 + var22, var21 + 10 + var23, this.field1537, method544((byte) 0, var29));
                                                    this.field1344.method217(16776960, var20 + var22, var21 + 9 + var23, this.field1537, method544((byte) 0, var29));
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field77 == 3) {
                            boolean var31 = false;
                            if (this.field1608 == var14.field75 || this.field1629 == var14.field75 || this.field1582 == var14.field75) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method458(this.field1360, var14)) {
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
                                    Pix2D.method170(var14.field81, var14.field80, var15, var16, (byte) 3, var32);
                                } else {
                                    Pix2D.method171(var32, var14.field80, var16, true, var15, var14.field81);
                                }
                            } else if (var14.field107) {
                                Pix2D.method169(var16, 256 - (var14.field82 & 255), var15, 4, var14.field81, var14.field80, var32);
                            } else {
                                Pix2D.method172(256 - (var14.field82 & 255), (byte) 9, var32, var14.field80, var15, var14.field81, var16);
                            }
                        } else if (var14.field77 == 4) {
                            PixFont var33 = var14.field110;
                            String var34 = var14.field111;
                            boolean var35 = false;
                            if (this.field1608 == var14.field75 || this.field1629 == var14.field75 || this.field1582 == var14.field75) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method458(this.field1360, var14)) {
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
                            if (var14.field78 == 6 && this.field1420) {
                                var34 = "Please wait...";
                                var36 = var14.field113;
                            }
                            if (Pix2D.field624 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field694 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method432(this.method546(4, -10666, var14), true) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method432(this.method546(3, -10666, var14), true) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method432(this.method546(2, -10666, var14), true) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method432(this.method546(1, -10666, var14), true) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method432(this.method546(0, -10666, var14), true) + var34.substring(var38 + 2);
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
                                    var33.method215(var36, var14.field80 / 2 + var15, var44, true, var37, var14.field109);
                                } else {
                                    var33.method219(var14.field109, var44, var37, (byte) 45, var36, var15);
                                }
                                var37 += var33.field694;
                            }
                        } else if (var14.field77 == 5) {
                            Pix32 var45;
                            if (this.method458(this.field1360, var14)) {
                                var45 = var14.field118;
                            } else {
                                var45 = var14.field117;
                            }
                            if (var45 != null) {
                                var45.method199(1, var15, var16);
                            }
                        } else if (var14.field77 == 6) {
                            int var46 = Pix3D.field641;
                            int var47 = Pix3D.field642;
                            Pix3D.field641 = var14.field80 / 2 + var15;
                            Pix3D.field642 = var14.field81 / 2 + var16;
                            int var48 = Pix3D.field645[var14.field126] * var14.field125 >> 16;
                            int var49 = Pix3D.field646[var14.field126] * var14.field125 >> 16;
                            boolean var50 = this.method458(this.field1360, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field124;
                            } else {
                                var51 = var14.field123;
                            }
                            Model var52;
                            if (var51 == -1) {
                                var52 = var14.method34(0, -1, var50, -1);
                            } else {
                                SeqType var53 = SeqType.field1112[var51];
                                var52 = var14.method34(0, var53.field1114[var14.field73], var50, var53.field1115[var14.field73]);
                            }
                            if (var52 != null) {
                                var52.method159(0, var14.field127, 0, var14.field126, 0, var48, var49);
                            }
                            Pix3D.field641 = var46;
                            Pix3D.field642 = var47;
                        } else if (var14.field77 == 7) {
                            PixFont var54 = var14.field110;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field81; ++var56) {
                                for (int var57 = 0; var57 < var14.field80; ++var57) {
                                    if (var14.field71[var55] > 0) {
                                        ObjType var58 = ObjType.method350(var14.field71[var55] - 1);
                                        String var59 = var58.field1024;
                                        if (var58.field1035 || var14.field72[var55] != 1) {
                                            var59 = var59 + " x" + method468(var14.field72[var55], 2);
                                        }
                                        int var60 = (var14.field101 + 115) * var57 + var15;
                                        int var61 = (var14.field102 + 12) * var56 + var16;
                                        if (var14.field108) {
                                            var54.method215(var14.field113, var14.field80 / 2 + var60, var59, true, var61, var14.field109);
                                        } else {
                                            var54.method219(var14.field109, var59, var61, (byte) 45, var14.field113, var60);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                Pix2D.method167(var8, true, var6, var9, var7);
                if (arg0 > 0) {
                    ;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method447(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1646; ++var4) {
                if (this.field1515[var4] == arg0) {
                    --this.field1646;
                    this.field1200 = true;
                    for (int var5 = var4; var5 < this.field1646; ++var5) {
                        this.field1515[var5] = this.field1515[var5 + 1];
                    }
                    this.field1543.method228(4, 193);
                    this.field1543.method235(854, arg0);
                    break;
                }
            }
            if (arg1 < 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method448(String arg0, byte arg1) {
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1609; ++var3) {
                if (arg0.equalsIgnoreCase(this.field1257[var3])) {
                    return true;
                }
            }
            if (arg1 != -97) {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
            return arg0.equalsIgnoreCase(field1231.field468);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method449(int arg0) {
        short var2 = 256;
        if (this.field1358 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1358 > 768) {
                    this.field1639[var3] = this.method480(this.field1640[var3], false, 1024 - this.field1358, this.field1641[var3]);
                } else if (this.field1358 > 256) {
                    this.field1639[var3] = this.field1641[var3];
                } else {
                    this.field1639[var3] = this.method480(this.field1641[var3], false, 256 - this.field1358, this.field1640[var3]);
                }
            }
        } else if (this.field1359 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1359 > 768) {
                    this.field1639[var4] = this.method480(this.field1640[var4], false, 1024 - this.field1359, this.field1642[var4]);
                } else if (this.field1359 > 256) {
                    this.field1639[var4] = this.field1642[var4];
                } else {
                    this.field1639[var4] = this.method480(this.field1642[var4], false, 256 - this.field1359, this.field1640[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1639[var5] = this.field1640[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1547.field749[var6] = this.field1518.field666[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1287[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1465[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1639[var26];
                    int var30 = this.field1547.field749[var8];
                    this.field1547.field749[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        if (arg0 == 0) {
            this.field1547.method269(0, 0, super.field15, true);
            for (int var10 = 0; var10 < 33920; ++var10) {
                this.field1548.field749[var10] = this.field1519.field666[var10];
            }
            int var11 = 0;
            int var12 = 1176;
            for (int var13 = 1; var13 < var2 - 1; ++var13) {
                int var14 = (var2 - var13) * this.field1287[var13] / var2;
                int var15 = 103 - var14;
                int var16 = var12 + var14;
                for (int var17 = 0; var17 < var15; ++var17) {
                    int var18 = this.field1465[var11++];
                    if (var18 != 0) {
                        int var20 = 256 - var18;
                        int var21 = this.field1639[var18];
                        int var22 = this.field1548.field749[var16];
                        this.field1548.field749[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                    } else {
                        ++var16;
                    }
                }
                var11 += 128 - var15;
                var12 = 128 - var15 - var14 + var16;
            }
            this.field1548.method269(0, 637, super.field15, true);
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method450(int arg0, int arg1, int arg2) {
        while (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
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
        } else if (var3 > 0) {
            return "@gr1@";
        } else {
            return "@yel@";
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method451(int arg0) {
        if (this.field1485 == null) {
            this.method545(9);
            super.field16 = null;
            this.field1544 = null;
            this.field1545 = null;
            this.field1546 = null;
            this.field1547 = null;
            this.field1548 = null;
            this.field1549 = null;
            this.field1550 = null;
            this.field1551 = null;
            this.field1552 = null;
            this.field1485 = new PixMap(true, this.method11(0), 479, 96);
            this.field1483 = new PixMap(true, this.method11(0), 172, 156);
            Pix2D.method168(-170);
            this.field1296.method212(1, 0, 0);
            this.field1482 = new PixMap(true, this.method11(0), 190, 261);
            if (arg0 != 15583) {
                this.field1536 = !this.field1536;
            }
            this.field1484 = new PixMap(true, this.method11(0), 512, 334);
            Pix2D.method168(-170);
            this.field1532 = new PixMap(true, this.method11(0), 496, 50);
            this.field1533 = new PixMap(true, this.method11(0), 269, 37);
            this.field1534 = new PixMap(true, this.method11(0), 249, 45);
            this.field1448 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method10(int arg0) {
        this.field1448 = true;
        if (arg0 != 0) {
            this.field1543.method229(39);
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1239 = Integer.parseInt(this.getParameter("nodeid"));
        field1240 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method560((byte) -106);
        } else {
            method543((byte) -22);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1241 = false;
        } else {
            field1241 = true;
        }
        this.method2(-74, 503, 765);
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method452(boolean arg0) {
        this.field1438 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1327[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field1090; ++var3) {
                if (!IdkType.field1091[var3].field1097 && IdkType.field1091[var3].field1092 == var2 + (this.field1494 ? 0 : 7)) {
                    this.field1327[var2] = var3;
                    break;
                }
            }
        }
        if (arg0) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method453(boolean arg0) {
        this.field1238 &= arg0;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILob;)V")
    private final void method454(int arg0, LocSpawned arg1) {
        int var3 = 75 / arg0;
        int var4 = 0;
        int var5 = -1;
        int var6 = 0;
        int var7 = 0;
        if (arg1.field730 == 0) {
            var4 = this.field1325.method90(arg1.field729, arg1.field731, arg1.field732);
        }
        if (arg1.field730 == 1) {
            var4 = this.field1325.method91(arg1.field731, arg1.field729, 4, arg1.field732);
        }
        if (arg1.field730 == 2) {
            var4 = this.field1325.method92(arg1.field729, arg1.field731, arg1.field732);
        }
        if (arg1.field730 == 3) {
            var4 = this.field1325.method93(arg1.field729, arg1.field731, arg1.field732);
        }
        if (var4 != 0) {
            int var8 = this.field1325.method94(arg1.field729, arg1.field731, arg1.field732, var4);
            var5 = var4 >> 14 & 32767;
            var6 = var8 & 31;
            var7 = var8 >> 6;
        }
        arg1.field733 = var5;
        arg1.field735 = var6;
        arg1.field734 = var7;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method455(int arg0) {
        this.field1482.method268((byte) 9);
        if (arg0 <= 0) {
            this.field1406 = null;
        }
        Pix3D.field647 = this.field1614;
        this.field1295.method212(1, 0, 0);
        if (this.field1594 != -1) {
            this.method446(field1421, 0, Component.field70[this.field1594], 0, 0);
        } else if (this.field1468[this.field1248] != -1) {
            this.method446(field1421, 0, Component.field70[this.field1468[this.field1248]], 0, 0);
        }
        if (this.field1384 && this.field1214 == 1) {
            this.method548((byte) -122);
        }
        this.field1482.method269(205, 553, super.field15, true);
        this.field1484.method268((byte) 9);
        Pix3D.field647 = this.field1615;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)Z")
    public final boolean method456(boolean arg0) {
        this.field1238 &= arg0;
        if (this.field1607 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1607.method40();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1429 == -1) {
                    this.field1607.method41(this.field1319.field710, 0, 1);
                    this.field1429 = this.field1319.field710[0] & 255;
                    if (this.field1461 != null) {
                        this.field1429 = this.field1429 - this.field1461.method305() & 255;
                    }
                    this.field1428 = Protocol.field1064[this.field1429];
                    --var2;
                }
                if (this.field1428 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1607.method41(this.field1319.field710, 0, 1);
                    this.field1428 = this.field1319.field710[0] & 255;
                    --var2;
                }
                if (this.field1428 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1607.method41(this.field1319.field710, 0, 2);
                    this.field1319.field711 = 0;
                    this.field1428 = this.field1319.method241();
                    var2 -= 2;
                }
                if (var2 < this.field1428) {
                    return false;
                }
                this.field1319.field711 = 0;
                this.field1607.method41(this.field1319.field710, 0, this.field1428);
                this.field1430 = 0;
                this.field1541 = this.field1540;
                this.field1540 = this.field1539;
                this.field1539 = this.field1429;
                if (this.field1429 == 141) {
                    int var3 = this.field1319.method241();
                    this.method521(0, var3);
                    if (this.field1594 != -1) {
                        this.field1594 = -1;
                        this.field1200 = true;
                        this.field1352 = true;
                    }
                    this.field1558 = var3;
                    this.field1528 = true;
                    this.field1523 = -1;
                    this.field1420 = false;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 197) {
                    int var4 = this.field1319.method241();
                    this.method521(0, var4);
                    if (this.field1594 != -1) {
                        this.field1594 = -1;
                        this.field1200 = true;
                        this.field1352 = true;
                    }
                    if (this.field1558 != -1) {
                        this.field1558 = -1;
                        this.field1528 = true;
                    }
                    if (this.field1621) {
                        this.field1621 = false;
                        this.field1528 = true;
                    }
                    this.field1523 = var4;
                    this.field1420 = false;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 167) {
                    this.field1362 = false;
                    for (int var5 = 0; var5 < 5; ++var5) {
                        this.field1649[var5] = false;
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 204) {
                    int var6 = this.field1319.method239();
                    int var7 = this.field1319.method239();
                    String var8 = this.field1319.method246();
                    if (var6 >= 1 && var6 <= 5) {
                        if (var8.equalsIgnoreCase("null")) {
                            var8 = null;
                        }
                        this.field1605[var6 - 1] = var8;
                        this.field1606[var6 - 1] = var7 == 0;
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 146) {
                    this.field1304 = this.field1319.method244();
                    this.field1313 = this.field1319.method241();
                    this.field1631 = this.field1319.method239();
                    this.field1324 = this.field1319.method241();
                    this.field1526 = this.field1319.method239();
                    if (this.field1304 != 0 && this.field1523 == -1) {
                        signlink.dnslookup(JString.method313((byte) -43, this.field1304));
                        this.method442(889);
                        short var9 = 650;
                        if (this.field1631 != 201 || this.field1526 == 1) {
                            var9 = 655;
                        }
                        this.field1444 = "";
                        this.field1623 = false;
                        for (int var10 = 0; var10 < Component.field70.length; ++var10) {
                            if (Component.field70[var10] != null && Component.field70[var10].field79 == var9) {
                                this.field1523 = Component.field70[var10].field76;
                                break;
                            }
                        }
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 222) {
                    int var11 = this.field1319.method241();
                    int var12 = this.field1319.method241();
                    int var13 = this.field1319.method241();
                    ObjType var14 = ObjType.method350(var12);
                    Component.field70[var11].field119 = 4;
                    Component.field70[var11].field120 = var12;
                    Component.field70[var11].field126 = var14.field1029;
                    Component.field70[var11].field127 = var14.field1030;
                    Component.field70[var11].field125 = var14.field1028 * 100 / var13;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 63) {
                    this.field1646 = this.field1428 / 8;
                    for (int var15 = 0; var15 < this.field1646; ++var15) {
                        this.field1515[var15] = this.field1319.method245(0);
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 27) {
                    int var16 = this.field1319.method241();
                    int var17 = this.field1319.method242();
                    int var18 = this.field1319.method242();
                    Component var19 = Component.field70[var16];
                    var19.field83 = var17;
                    var19.field84 = var18;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 196) {
                    int var20 = this.field1319.method241();
                    int var21 = this.field1319.method244();
                    this.field1497[var20] = var21;
                    if (this.field1211[var20] != var21) {
                        this.field1211[var20] = var21;
                        this.method475(false, var20);
                        this.field1200 = true;
                        if (this.field1289 != -1) {
                            this.field1528 = true;
                        }
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 28) {
                    this.field1200 = true;
                    int var22 = this.field1319.method241();
                    Component var23 = Component.field70[var22];
                    int var24 = this.field1319.method239();
                    for (int var25 = 0; var25 < var24; ++var25) {
                        var23.field71[var25] = this.field1319.method241();
                        int var26 = this.field1319.method239();
                        if (var26 == 255) {
                            var26 = this.field1319.method244();
                        }
                        var23.field72[var25] = var26;
                    }
                    for (int var27 = var24; var27 < var23.field71.length; ++var27) {
                        var23.field71[var27] = 0;
                        var23.field72[var27] = 0;
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 136) {
                    this.field1200 = true;
                    int var28 = this.field1319.method239();
                    int var29 = this.field1319.method244();
                    int var30 = this.field1319.method239();
                    this.field1575[var28] = var29;
                    this.field1419[var28] = var30;
                    this.field1467[var28] = 1;
                    for (int var31 = 0; var31 < 98; ++var31) {
                        if (var29 >= field1474[var31]) {
                            this.field1467[var28] = var31 + 2;
                        }
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 187) {
                    int var32 = this.field1319.method241();
                    this.method521(0, var32);
                    if (this.field1558 != -1) {
                        this.field1558 = -1;
                        this.field1528 = true;
                    }
                    if (this.field1621) {
                        this.field1621 = false;
                        this.field1528 = true;
                    }
                    this.field1594 = var32;
                    this.field1200 = true;
                    this.field1352 = true;
                    this.field1523 = -1;
                    this.field1420 = false;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 249) {
                    int var33 = this.field1319.method241();
                    int var34 = this.field1319.method241();
                    if (this.field1558 != -1) {
                        this.field1558 = -1;
                        this.field1528 = true;
                    }
                    if (this.field1621) {
                        this.field1621 = false;
                        this.field1528 = true;
                    }
                    this.field1523 = var33;
                    this.field1594 = var34;
                    this.field1200 = true;
                    this.field1352 = true;
                    this.field1420 = false;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 5) {
                    this.field1611 = false;
                    this.field1621 = true;
                    this.field1584 = "";
                    this.field1528 = true;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 239) {
                    int var35 = this.field1319.method242();
                    this.field1289 = var35;
                    this.field1528 = true;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 38) {
                    int var36 = this.field1319.method241();
                    int var37 = this.field1319.method241();
                    int var38 = var37 >> 10 & 31;
                    int var39 = var37 >> 5 & 31;
                    int var40 = var37 & 31;
                    Component.field70[var36].field113 = (var40 << 3) + (var38 << 19) + (var39 << 11);
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 64) {
                    this.field1458 = this.field1319.method239();
                    if (this.field1458 == 1) {
                        this.field1234 = this.field1319.method241();
                    }
                    if (this.field1458 >= 2 && this.field1458 <= 6) {
                        if (this.field1458 == 2) {
                            this.field1478 = 64;
                            this.field1479 = 64;
                        }
                        if (this.field1458 == 3) {
                            this.field1478 = 0;
                            this.field1479 = 64;
                        }
                        if (this.field1458 == 4) {
                            this.field1478 = 128;
                            this.field1479 = 64;
                        }
                        if (this.field1458 == 5) {
                            this.field1478 = 64;
                            this.field1479 = 0;
                        }
                        if (this.field1458 == 6) {
                            this.field1478 = 64;
                            this.field1479 = 128;
                        }
                        this.field1458 = 2;
                        this.field1475 = this.field1319.method241();
                        this.field1476 = this.field1319.method241();
                        this.field1477 = this.field1319.method239();
                    }
                    if (this.field1458 == 10) {
                        this.field1437 = this.field1319.method241();
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 159) {
                    this.field1603 = this.field1319.method239();
                    this.field1604 = this.field1319.method239();
                    for (int var41 = this.field1603; var41 < this.field1603 + 8; ++var41) {
                        for (int var42 = this.field1604; var42 < this.field1604 + 8; ++var42) {
                            if (this.field1406[this.field1277][var41][var42] != null) {
                                this.field1406[this.field1277][var41][var42] = null;
                                this.method529(var41, var42);
                            }
                        }
                    }
                    for (LocSpawned var43 = (LocSpawned) this.field1636.method258(); var43 != null; var43 = (LocSpawned) this.field1636.method260(6)) {
                        if (var43.field731 >= this.field1603 && var43.field731 < this.field1603 + 8 && var43.field732 >= this.field1604 && var43.field732 < this.field1604 + 8 && this.field1277 == var43.field729) {
                            var43.field740 = 0;
                        }
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 161) {
                    int var44 = this.field1319.method241();
                    Component.field70[var44].field119 = 3;
                    Component.field70[var44].field120 = (field1231.field472[8] << 6) + (field1231.field472[0] << 12) + (field1231.field473[0] << 24) + (field1231.field473[4] << 18) + field1231.field472[11];
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 225) {
                    int var45 = this.field1319.method239();
                    int var46 = this.field1319.method239();
                    int var47 = this.field1319.method239();
                    int var48 = this.field1319.method239();
                    this.field1649[var45] = true;
                    this.field1261[var45] = var46;
                    this.field1520[var45] = var47;
                    this.field1311[var45] = var48;
                    this.field1412[var45] = 0;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 213) {
                    this.field1542 = this.field1319.method241();
                    this.field1492 = this.field1319.method239();
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 170) {
                    this.field1200 = true;
                    int var49 = this.field1319.method241();
                    Component var50 = Component.field70[var49];
                    while (this.field1319.field711 < this.field1428) {
                        int var51 = this.field1319.method239();
                        int var52 = this.field1319.method241();
                        int var53 = this.field1319.method239();
                        if (var53 == 255) {
                            var53 = this.field1319.method244();
                        }
                        if (var51 >= 0 && var51 < var50.field71.length) {
                            var50.field71[var51] = var52;
                            var50.field72[var51] = var53;
                        }
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 138) {
                    this.field1248 = this.field1319.method239();
                    this.field1200 = true;
                    this.field1352 = true;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 255) {
                    this.field1610 = this.field1319.method239();
                    this.field1200 = true;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 61) {
                    this.field1603 = this.field1319.method239();
                    this.field1604 = this.field1319.method239();
                    while (this.field1319.field711 < this.field1428) {
                        int var54 = this.field1319.method239();
                        this.method501(var54, this.field1319, this.field1516);
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 75) {
                    this.field1350 = this.field1319.method239();
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 55) {
                    this.field1362 = true;
                    this.field1306 = this.field1319.method239();
                    this.field1307 = this.field1319.method239();
                    this.field1308 = this.field1319.method241();
                    this.field1309 = this.field1319.method239();
                    this.field1310 = this.field1319.method239();
                    if (this.field1310 >= 100) {
                        this.field1266 = this.field1306 * 128 + 64;
                        this.field1268 = this.field1307 * 128 + 64;
                        this.field1267 = this.method470(this.field1268, this.field1277, this.field1266, 9803) - this.field1308;
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 173) {
                    this.field1603 = this.field1319.method239();
                    this.field1604 = this.field1319.method239();
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 29) {
                    Packet var55 = InputTracking.method47(false);
                    if (var55 != null) {
                        this.field1543.method228(4, 142);
                        this.field1543.method230(var55.field711);
                        this.field1543.method237(0, var55.field710, var55.field711, false);
                        var55.method227(-359);
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 0) {
                    this.field1362 = true;
                    this.field1577 = this.field1319.method239();
                    this.field1578 = this.field1319.method239();
                    this.field1579 = this.field1319.method241();
                    this.field1580 = this.field1319.method239();
                    this.field1581 = this.field1319.method239();
                    if (this.field1581 >= 100) {
                        int var56 = this.field1577 * 128 + 64;
                        int var57 = this.field1578 * 128 + 64;
                        int var58 = this.method470(var57, this.field1277, var56, 9803) - this.field1579;
                        int var59 = var56 - this.field1266;
                        int var60 = var58 - this.field1267;
                        int var61 = var57 - this.field1268;
                        int var62 = (int) Math.sqrt((double) (var59 * var59 + var61 * var61));
                        this.field1269 = (int) (Math.atan2((double) var60, (double) var62) * 325.949D) & 2047;
                        this.field1270 = (int) (Math.atan2((double) var59, (double) var61) * -325.949D) & 2047;
                        if (this.field1269 < 128) {
                            this.field1269 = 128;
                        }
                        if (this.field1269 > 383) {
                            this.field1269 = 383;
                        }
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 95) {
                    int var63 = this.field1319.method241();
                    int var64 = this.field1319.method242();
                    Component var65 = Component.field70[var63];
                    var65.field123 = var64;
                    if (var64 == -1) {
                        var65.field73 = 0;
                        var65.field74 = 0;
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 94) {
                    if (this.field1248 == 12) {
                        this.field1200 = true;
                    }
                    this.field1326 = this.field1319.method239();
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 58) {
                    this.field1632 = this.field1319.method239();
                    if (this.field1632 == this.field1248) {
                        if (this.field1632 == 3) {
                            this.field1248 = 1;
                        } else {
                            this.field1248 = 3;
                        }
                        this.field1200 = true;
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 60) {
                    long var66 = this.field1319.method245(0);
                    int var68 = this.field1319.method244();
                    int var69 = this.field1319.method239();
                    boolean var70 = false;
                    for (int var71 = 0; var71 < 100; ++var71) {
                        if (this.field1250[var71] == var68) {
                            var70 = true;
                            break;
                        }
                    }
                    if (var69 <= 1) {
                        for (int var72 = 0; var72 < this.field1646; ++var72) {
                            if (this.field1515[var72] == var66) {
                                var70 = true;
                                break;
                            }
                        }
                    }
                    if (!var70 && this.field1450 == 0) {
                        try {
                            this.field1250[this.field1601] = var68;
                            this.field1601 = (this.field1601 + 1) % 100;
                            String var73 = WordPack.method317(this.field1319, this.field1428 - 13, -468);
                            String var74 = WordFilter.method403((byte) -13, var73);
                            if (var69 != 2 && var69 != 3) {
                                if (var69 == 1) {
                                    this.method515("@cr1@" + JString.method314(true, JString.method311(var66, true)), 7, this.field1599, var74);
                                } else {
                                    this.method515(JString.method314(true, JString.method311(var66, true)), 3, this.field1599, var74);
                                }
                            } else {
                                this.method515("@cr2@" + JString.method314(true, JString.method311(var66, true)), 7, this.field1599, var74);
                            }
                        } catch (Exception var159) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 143) {
                    this.field1452 = this.field1319.method241() * 30;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 14) {
                    int var76 = this.field1319.method241();
                    int var77 = this.field1319.method241();
                    Component var78 = Component.field70[var76];
                    if (var78 != null && var78.field77 == 0) {
                        if (var77 < 0) {
                            var77 = 0;
                        }
                        if (var77 > var78.field89 - var78.field81) {
                            var77 = var78.field89 - var78.field81;
                        }
                        var78.field90 = var77;
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 3) {
                    int var79 = this.field1319.method241();
                    int var80 = this.field1319.method241();
                    Component.field70[var79].field119 = 2;
                    Component.field70[var79].field120 = var80;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 164) {
                    if (this.field1248 == 12) {
                        this.field1200 = true;
                    }
                    this.field1404 = this.field1319.method242();
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 168) {
                    int var81 = this.field1319.method241();
                    Component var82 = Component.field70[var81];
                    for (int var83 = 0; var83 < var82.field71.length; ++var83) {
                        var82.field71[var83] = -1;
                        var82.field71[var83] = 0;
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 123) {
                    this.method503(41268, this.field1319, this.field1428);
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 211) {
                    int var84 = this.field1319.method241();
                    int var85 = this.field1319.method241();
                    Component.field70[var84].field119 = 1;
                    Component.field70[var84].field120 = var85;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 140) {
                    for (int var86 = 0; var86 < this.field1211.length; ++var86) {
                        if (this.field1497[var86] != this.field1211[var86]) {
                            this.field1211[var86] = this.field1497[var86];
                            this.method475(false, var86);
                            this.field1200 = true;
                        }
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 91) {
                    int var87 = this.field1319.method241();
                    int var88 = this.field1319.method239();
                    if (var87 == 65535) {
                        var87 = -1;
                    }
                    this.field1468[var88] = var87;
                    this.field1200 = true;
                    this.field1352 = true;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 21) {
                    this.method479(0);
                    this.field1429 = -1;
                    return false;
                }
                if (this.field1429 == 163) {
                    int var89 = this.field1319.method241();
                    if (var89 == 65535) {
                        var89 = -1;
                    }
                    if (this.field1598 != var89 && this.field1315 && !field1242 && this.field1569 == 0) {
                        this.field1616 = var89;
                        this.field1617 = true;
                        this.field1415.method289(2, this.field1616);
                    }
                    this.field1598 = var89;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 242) {
                    int var90 = this.field1319.method241();
                    int var91 = this.field1319.method241();
                    if (this.field1315 && !field1242) {
                        this.field1616 = var90;
                        this.field1617 = false;
                        this.field1415.method289(2, this.field1616);
                        this.field1569 = var91;
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 174) {
                    if (this.field1594 != -1) {
                        this.field1594 = -1;
                        this.field1200 = true;
                        this.field1352 = true;
                    }
                    if (this.field1558 != -1) {
                        this.field1558 = -1;
                        this.field1528 = true;
                    }
                    if (this.field1621) {
                        this.field1621 = false;
                        this.field1528 = true;
                    }
                    this.field1523 = -1;
                    this.field1420 = false;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 111) {
                    long var92 = this.field1319.method245(0);
                    int var94 = this.field1319.method239();
                    String var95 = JString.method314(true, JString.method311(var92, true));
                    for (int var96 = 0; var96 < this.field1609; ++var96) {
                        if (this.field1521[var96] == var92) {
                            if (this.field1553[var96] != var94) {
                                this.field1553[var96] = var94;
                                this.field1200 = true;
                                if (var94 > 0) {
                                    this.method515("", 5, this.field1599, var95 + " has logged in.");
                                }
                                if (var94 == 0) {
                                    this.method515("", 5, this.field1599, var95 + " has logged out.");
                                }
                            }
                            var95 = null;
                            break;
                        }
                    }
                    if (var95 != null && this.field1609 < 200) {
                        this.field1521[this.field1609] = var92;
                        this.field1257[this.field1609] = var95;
                        this.field1553[this.field1609] = var94;
                        ++this.field1609;
                        this.field1200 = true;
                    }
                    boolean var97 = false;
                    while (!var97) {
                        var97 = true;
                        for (int var98 = 0; var98 < this.field1609 - 1; ++var98) {
                            if (this.field1553[var98] != field1239 && this.field1553[var98 + 1] == field1239 || this.field1553[var98] == 0 && this.field1553[var98 + 1] != 0) {
                                int var99 = this.field1553[var98];
                                this.field1553[var98] = this.field1553[var98 + 1];
                                this.field1553[var98 + 1] = var99;
                                String var100 = this.field1257[var98];
                                this.field1257[var98] = this.field1257[var98 + 1];
                                this.field1257[var98 + 1] = var100;
                                long var101 = this.field1521[var98];
                                this.field1521[var98] = this.field1521[var98 + 1];
                                this.field1521[var98 + 1] = var101;
                                this.field1200 = true;
                                var97 = false;
                            }
                        }
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 85) {
                    int var103 = this.field1319.method242();
                    if (var103 >= 0) {
                        this.method521(0, var103);
                    }
                    this.field1574 = var103;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 87) {
                    this.method549(this.field1319, 493, this.field1428);
                    this.field1398 = false;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 203) {
                    for (int var104 = 0; var104 < this.field1378.length; ++var104) {
                        if (this.field1378[var104] != null) {
                            this.field1378[var104].field438 = -1;
                        }
                    }
                    for (int var105 = 0; var105 < this.field1219.length; ++var105) {
                        if (this.field1219[var105] != null) {
                            this.field1219[var105].field438 = -1;
                        }
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 227) {
                    int var106 = this.field1319.method241();
                    boolean var107 = this.field1319.method239() == 1;
                    Component.field70[var106].field91 = var107;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 25) {
                    int var108 = this.field1319.method241();
                    int var109 = this.field1319.method239();
                    int var110 = this.field1319.method241();
                    if (this.field1351 && !field1242 && this.field1322 < 50) {
                        this.field1192[this.field1322] = var108;
                        this.field1340[this.field1322] = var109;
                        this.field1305[this.field1322] = Wave.field894[var108] + var110;
                        ++this.field1322;
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 73) {
                    String var111 = this.field1319.method246();
                    if (var111.endsWith(":tradereq:")) {
                        String var112 = var111.substring(0, var111.indexOf(":"));
                        long var113 = JString.method310(var112);
                        boolean var115 = false;
                        for (int var116 = 0; var116 < this.field1646; ++var116) {
                            if (this.field1515[var116] == var113) {
                                var115 = true;
                                break;
                            }
                        }
                        if (!var115 && this.field1450 == 0) {
                            this.method515(var112, 4, this.field1599, "wishes to trade with you.");
                        }
                    } else if (!var111.endsWith(":duelreq:")) {
                        this.method515("", 0, this.field1599, var111);
                    } else {
                        String var117 = var111.substring(0, var111.indexOf(":"));
                        long var118 = JString.method310(var117);
                        boolean var120 = false;
                        for (int var121 = 0; var121 < this.field1646; ++var121) {
                            if (this.field1515[var121] == var118) {
                                var120 = true;
                                break;
                            }
                        }
                        if (!var120 && this.field1450 == 0) {
                            this.method515(var117, 8, this.field1599, "wishes to duel with you.");
                        }
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 41) {
                    int var122 = this.field1319.method241();
                    String var123 = this.field1319.method246();
                    Component.field70[var122].field111 = var123;
                    if (this.field1468[this.field1248] == Component.field70[var122].field76) {
                        this.field1200 = true;
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 24) {
                    this.field1583 = this.field1319.method239();
                    this.field1625 = this.field1319.method239();
                    this.field1554 = this.field1319.method239();
                    this.field1243 = true;
                    this.field1528 = true;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 108) {
                    this.field1301 = 0;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 209) {
                    int var124 = this.field1319.method241();
                    int var125 = this.field1319.method241();
                    if (this.field1480 == var124 && this.field1481 == var125 && this.field1317 == 2) {
                        this.field1429 = -1;
                        return true;
                    }
                    this.field1480 = var124;
                    this.field1481 = var125;
                    this.field1487 = (this.field1480 - 6) * 8;
                    this.field1488 = (this.field1481 - 6) * 8;
                    this.field1275 = false;
                    if ((this.field1480 / 8 == 48 || this.field1480 / 8 == 49) && this.field1481 / 8 == 48) {
                        this.field1275 = true;
                    }
                    if (this.field1480 / 8 == 48 && this.field1481 / 8 == 148) {
                        this.field1275 = true;
                    }
                    this.field1317 = 1;
                    this.field1527 = System.currentTimeMillis();
                    this.field1484.method268((byte) 9);
                    this.field1345.method214(151, "Loading - please wait.", 0, 257, 0);
                    this.field1345.method214(150, "Loading - please wait.", 0, 256, 16777215);
                    this.field1484.method269(4, 4, super.field15, true);
                    int var126 = 0;
                    for (int var127 = (this.field1480 - 6) / 8; var127 <= (this.field1480 + 6) / 8; ++var127) {
                        for (int var128 = (this.field1481 - 6) / 8; var128 <= (this.field1481 + 6) / 8; ++var128) {
                            ++var126;
                        }
                    }
                    this.field1472 = new byte[var126][];
                    this.field1436 = new byte[var126][];
                    this.field1504 = new int[var126];
                    this.field1505 = new int[var126];
                    this.field1506 = new int[var126];
                    int var129 = 0;
                    for (int var130 = (this.field1480 - 6) / 8; var130 <= (this.field1480 + 6) / 8; ++var130) {
                        for (int var131 = (this.field1481 - 6) / 8; var131 <= (this.field1481 + 6) / 8; ++var131) {
                            this.field1504[var129] = (var130 << 8) + var131;
                            if (this.field1275 && (var131 == 49 || var131 == 149 || var131 == 147 || var130 == 50 || var130 == 49 && var131 == 47)) {
                                this.field1505[var129] = -1;
                                this.field1506[var129] = -1;
                                ++var129;
                            } else {
                                int var132 = this.field1505[var129] = this.field1415.method284(var130, var131, 0, field1341);
                                if (var132 != -1) {
                                    this.field1415.method289(3, var132);
                                }
                                int var133 = this.field1506[var129] = this.field1415.method284(var130, var131, 1, field1341);
                                if (var133 != -1) {
                                    this.field1415.method289(3, var133);
                                }
                                ++var129;
                            }
                        }
                    }
                    int var134 = this.field1487 - this.field1489;
                    int var135 = this.field1488 - this.field1490;
                    this.field1489 = this.field1487;
                    this.field1490 = this.field1488;
                    for (int var136 = 0; var136 < 16384; ++var136) {
                        NpcEntity var137 = this.field1219[var136];
                        if (var137 != null) {
                            for (int var138 = 0; var138 < 10; ++var138) {
                                var137.field460[var138] -= var134;
                                var137.field461[var138] -= var135;
                            }
                            var137.field410 -= var134 * 128;
                            var137.field411 -= var135 * 128;
                        }
                    }
                    for (int var139 = 0; var139 < this.field1376; ++var139) {
                        PlayerEntity var140 = this.field1378[var139];
                        if (var140 != null) {
                            for (int var141 = 0; var141 < 10; ++var141) {
                                var140.field460[var141] -= var134;
                                var140.field461[var141] -= var135;
                            }
                            var140.field410 -= var134 * 128;
                            var140.field411 -= var135 * 128;
                        }
                    }
                    this.field1398 = true;
                    byte var142 = 0;
                    byte var143 = 104;
                    byte var144 = 1;
                    if (var134 < 0) {
                        var142 = 103;
                        var143 = -1;
                        var144 = -1;
                    }
                    byte var145 = 0;
                    byte var146 = 104;
                    byte var147 = 1;
                    if (var135 < 0) {
                        var145 = 103;
                        var146 = -1;
                        var147 = -1;
                    }
                    for (int var148 = var142; var143 != var148; var148 += var144) {
                        for (int var149 = var145; var146 != var149; var149 += var147) {
                            int var150 = var134 + var148;
                            int var151 = var135 + var149;
                            for (int var152 = 0; var152 < 4; ++var152) {
                                if (var150 >= 0 && var151 >= 0 && var150 < 104 && var151 < 104) {
                                    this.field1406[var152][var148][var149] = this.field1406[var152][var150][var151];
                                } else {
                                    this.field1406[var152][var148][var149] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var153 = (LocSpawned) this.field1636.method258(); var153 != null; var153 = (LocSpawned) this.field1636.method260(6)) {
                        var153.field731 -= var134;
                        var153.field732 -= var135;
                        if (var153.field731 < 0 || var153.field732 < 0 || var153.field731 >= 104 || var153.field732 >= 104) {
                            var153.method120();
                        }
                    }
                    if (this.field1301 != 0) {
                        this.field1301 -= var134;
                        this.field1302 -= var135;
                    }
                    this.field1362 = false;
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 251) {
                    InputTracking.method44(-591);
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 186) {
                    int var154 = this.field1319.method241();
                    byte var155 = this.field1319.method240();
                    this.field1497[var154] = var155;
                    if (this.field1211[var154] != var155) {
                        this.field1211[var154] = var155;
                        this.method475(false, var154);
                        this.field1200 = true;
                        if (this.field1289 != -1) {
                            this.field1528 = true;
                        }
                    }
                    this.field1429 = -1;
                    return true;
                }
                if (this.field1429 == 98 || this.field1429 == 218 || this.field1429 == 8 || this.field1429 == 114 || this.field1429 == 37 || this.field1429 == 115 || this.field1429 == 120 || this.field1429 == 30 || this.field1429 == 88 || this.field1429 == 70) {
                    this.method501(this.field1429, this.field1319, this.field1516);
                    this.field1429 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1429 + "," + this.field1428 + " - " + this.field1540 + "," + this.field1541);
                this.method479(0);
            } catch (IOException var160) {
                this.method561(this.field1405);
            } catch (Exception var161) {
                String var157 = "T2 - " + this.field1429 + "," + this.field1540 + "," + this.field1541 + " - " + this.field1428 + "," + (field1231.field460[0] + this.field1487) + "," + (field1231.field461[0] + this.field1488) + " - ";
                for (int var158 = 0; var158 < this.field1428 && var158 < 50; ++var158) {
                    var157 = var157 + this.field1319.field710[var158] + ",";
                }
                signlink.reporterror(var157);
                this.method479(0);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method457(int arg0) {
        LocType.field968.method117();
        LocType.field969.method117();
        this.field1428 += arg0;
        NpcType.field1010.method117();
        ObjType.field1061.method117();
        ObjType.field1062.method117();
        PlayerEntity.field490.method117();
        SpotAnimType.field1144.method117();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLd;)Z")
    public final boolean method458(boolean arg0, Component arg1) {
        if (arg0) {
            this.field1406 = null;
        }
        if (arg1.field86 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field86.length; ++var3) {
                int var4 = this.method546(var3, -10666, arg1);
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method459(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1417 = "";
                this.field1418 = "Connecting to server...";
                this.method437(true, (byte) 4);
            }
            this.field1607 = new ClientStream(this, this.method444(field1240 + 43594), 6);
            long var4 = JString.method310(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field1543.field711 = 0;
            this.field1543.method229(14);
            this.field1543.method229(var6);
            this.field1607.method42(this.field1543.field710, 0, 0, 2);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field1607.method39();
            }
            int var8 = this.field1607.method39();
            if (var8 == 0) {
                this.field1607.method41(this.field1319.field710, 0, 8);
                this.field1319.field711 = 0;
                this.field1517 = this.field1319.method245(0);
                int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1517 >> 32), (int) this.field1517 };
                this.field1543.field711 = 0;
                this.field1543.method229(10);
                this.field1543.method233(var9[0]);
                this.field1543.method233(var9[1]);
                this.field1543.method233(var9[2]);
                this.field1543.method233(var9[3]);
                this.field1543.method233(signlink.uid);
                this.field1543.method236(arg0);
                this.field1543.method236(arg1);
                this.field1543.method254(-106, field1507, field1434);
                this.field1260.field711 = 0;
                if (arg2) {
                    this.field1260.method229(18);
                } else {
                    this.field1260.method229(16);
                }
                this.field1260.method229(this.field1543.field711 + 36 + 1 + 1);
                this.field1260.method229(254);
                this.field1260.method229(field1242 ? 1 : 0);
                for (int var10 = 0; var10 < 9; ++var10) {
                    this.field1260.method233(this.field1637[var10]);
                }
                this.field1260.method237(0, this.field1543.field710, this.field1543.field711, false);
                this.field1543.field715 = new Isaac((byte) 4, var9);
                for (int var11 = 0; var11 < 4; ++var11) {
                    var9[var11] += 50;
                }
                this.field1461 = new Isaac((byte) 4, var9);
                this.field1607.method42(this.field1260.field710, 0, 0, this.field1260.field711);
                var8 = this.field1607.method39();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var21) {
                }
                this.method459(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field1510 = this.field1607.method39();
                field1397 = this.field1607.method39() == 1;
                InputTracking.method45(32268);
                this.field1370 = 0L;
                this.field1589 = 0;
                this.field1644.field974 = 0;
                super.field20 = true;
                this.field1612 = true;
                this.field1238 = true;
                this.field1543.field711 = 0;
                this.field1319.field711 = 0;
                this.field1429 = -1;
                this.field1539 = -1;
                this.field1540 = -1;
                this.field1541 = -1;
                this.field1428 = 0;
                this.field1430 = 0;
                this.field1452 = 0;
                this.field1432 = 0;
                this.field1458 = 0;
                this.field1314 = 0;
                this.field1384 = false;
                super.field21 = 0;
                for (int var12 = 0; var12 < 100; ++var12) {
                    this.field1247[var12] = null;
                }
                this.field1195 = 0;
                this.field1387 = 0;
                this.field1317 = 0;
                this.field1322 = 0;
                this.field1556 = (int) (Math.random() * 100.0D) - 50;
                this.field1272 = (int) (Math.random() * 110.0D) - 55;
                this.field1445 = (int) (Math.random() * 80.0D) - 40;
                this.field1278 = (int) (Math.random() * 120.0D) - 60;
                this.field1348 = (int) (Math.random() * 30.0D) - 20;
                this.field1253 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1638 = -1;
                this.field1301 = 0;
                this.field1302 = 0;
                this.field1379 = 0;
                this.field1220 = 0;
                for (int var13 = 0; var13 < this.field1376; ++var13) {
                    this.field1378[var13] = null;
                    this.field1383[var13] = null;
                }
                for (int var14 = 0; var14 < 16384; ++var14) {
                    this.field1219[var14] = null;
                }
                field1231 = this.field1378[this.field1377] = new PlayerEntity();
                this.field1451.method262();
                this.field1423.method262();
                for (int var15 = 0; var15 < 4; ++var15) {
                    for (int var16 = 0; var16 < 104; ++var16) {
                        for (int var17 = 0; var17 < 104; ++var17) {
                            this.field1406[var15][var16][var17] = null;
                        }
                    }
                }
                this.field1636 = new LinkList(false);
                this.field1610 = 0;
                this.field1609 = 0;
                this.field1289 = -1;
                this.field1558 = -1;
                this.field1523 = -1;
                this.field1594 = -1;
                this.field1574 = -1;
                this.field1420 = false;
                this.field1248 = 3;
                this.field1621 = false;
                this.field1384 = false;
                this.field1611 = false;
                this.field1635 = null;
                this.field1350 = 0;
                this.field1632 = -1;
                this.field1494 = true;
                this.method452(false);
                for (int var18 = 0; var18 < 5; ++var18) {
                    this.field1514[var18] = 0;
                }
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field1605[var19] = null;
                    this.field1606[var19] = false;
                }
                field1408 = 0;
                field1284 = 0;
                field1496 = 0;
                field1647 = 0;
                field1338 = 0;
                field1409 = 0;
                field1235 = 0;
                field1597 = 0;
                field1618 = 0;
                field1256 = 0;
                this.method451(15583);
            } else if (var8 == 3) {
                this.field1417 = "";
                this.field1418 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field1417 = "Your account has been disabled.";
                this.field1418 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field1417 = "Your account is already logged in.";
                this.field1418 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field1417 = "RuneScape has been updated!";
                this.field1418 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field1417 = "This world is full.";
                this.field1418 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field1417 = "Unable to connect.";
                this.field1418 = "Login server offline.";
            } else if (var8 == 9) {
                this.field1417 = "Login limit exceeded.";
                this.field1418 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field1417 = "Unable to connect.";
                this.field1418 = "Bad session id.";
            } else if (var8 == 11) {
                this.field1418 = "Login server rejected session.";
                this.field1418 = "Please try again.";
            } else if (var8 == 12) {
                this.field1417 = "You need a members account to login to this world.";
                this.field1418 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field1417 = "Could not complete login.";
                this.field1418 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field1417 = "The server is being updated.";
                this.field1418 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field1238 = true;
                this.field1543.field711 = 0;
                this.field1319.field711 = 0;
                this.field1429 = -1;
                this.field1539 = -1;
                this.field1540 = -1;
                this.field1541 = -1;
                this.field1428 = 0;
                this.field1430 = 0;
                this.field1452 = 0;
                this.field1314 = 0;
                this.field1384 = false;
                this.field1527 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field1417 = "Login attempts exceeded.";
                this.field1418 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field1417 = "You are standing in a members-only area.";
                this.field1418 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field1417 = "Invalid loginserver requested";
                this.field1418 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    this.field1417 = "No response from server";
                    this.field1418 = "Please try using a different world.";
                } else {
                    System.out.println("response:" + var8);
                    this.field1417 = "Unexpected server response";
                    this.field1418 = "Please try using a different world.";
                }
            } else {
                for (int var20 = this.field1607.method39(); var20 >= 0; --var20) {
                    this.field1417 = "You have only just left another world";
                    this.field1418 = "Your profile will be transfered in: " + var20 + " seconds";
                    this.method437(true, (byte) 4);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var22) {
                    }
                }
                this.method459(arg0, arg1, arg2);
            }
        } catch (IOException var23) {
            this.field1417 = "";
            this.field1418 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILd;III)V")
    public final void method460(int arg0, int arg1, int arg2, Component arg3, int arg4, int arg5, int arg6) {
        if (arg3.field77 == 0 && arg3.field92 != null && !arg3.field91) {
            if (arg5 >= arg4 && arg0 >= arg1 && arg5 <= arg3.field80 + arg4 && arg0 <= arg3.field81 + arg1) {
                int var8 = arg3.field92.length;
                if (arg2 >= 0) {
                    this.field1435 = this.field1461.method305();
                }
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg3.field93[var9] + arg4;
                    int var11 = arg3.field94[var9] + arg1 - arg6;
                    Component var12 = Component.field70[arg3.field92[var9]];
                    int var13 = var12.field83 + var10;
                    int var14 = var12.field84 + var11;
                    if ((var12.field88 >= 0 || var12.field115 != 0) && arg5 >= var13 && arg0 >= var14 && arg5 < var12.field80 + var13 && arg0 < var12.field81 + var14) {
                        if (var12.field88 >= 0) {
                            this.field1456 = var12.field88;
                        } else {
                            this.field1456 = var12.field75;
                        }
                    }
                    if (var12.field77 == 0) {
                        this.method460(arg0, var14, -653, var12, var13, arg5, var12.field90);
                        if (var12.field89 > var12.field81) {
                            this.method469(var12.field80 + var13, var12.field89, true, (byte) 116, arg5, var12, arg0, var12.field81, var14);
                        }
                    } else {
                        if (var12.field78 == 1 && arg5 >= var13 && arg0 >= var14 && arg5 < var12.field80 + var13 && arg0 < var12.field81 + var14) {
                            boolean var15 = false;
                            if (var12.field79 != 0) {
                                var15 = this.method530(3, var12);
                            }
                            if (!var15) {
                                this.field1292[this.field1314] = var12.field131;
                                this.field1205[this.field1314] = 231;
                                this.field1204[this.field1314] = var12.field75;
                                ++this.field1314;
                            }
                        }
                        if (var12.field78 == 2 && this.field1387 == 0 && arg5 >= var13 && arg0 >= var14 && arg5 < var12.field80 + var13 && arg0 < var12.field81 + var14) {
                            String var16 = var12.field128;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field1292[this.field1314] = var16 + " @gre@" + var12.field129;
                            this.field1205[this.field1314] = 274;
                            this.field1204[this.field1314] = var12.field75;
                            ++this.field1314;
                        }
                        if (var12.field78 == 3 && arg5 >= var13 && arg0 >= var14 && arg5 < var12.field80 + var13 && arg0 < var12.field81 + var14) {
                            this.field1292[this.field1314] = "Close";
                            this.field1205[this.field1314] = 737;
                            this.field1204[this.field1314] = var12.field75;
                            ++this.field1314;
                        }
                        if (var12.field78 == 4 && arg5 >= var13 && arg0 >= var14 && arg5 < var12.field80 + var13 && arg0 < var12.field81 + var14) {
                            this.field1292[this.field1314] = var12.field131;
                            this.field1205[this.field1314] = 435;
                            this.field1204[this.field1314] = var12.field75;
                            ++this.field1314;
                        }
                        if (var12.field78 == 5 && arg5 >= var13 && arg0 >= var14 && arg5 < var12.field80 + var13 && arg0 < var12.field81 + var14) {
                            this.field1292[this.field1314] = var12.field131;
                            this.field1205[this.field1314] = 225;
                            this.field1204[this.field1314] = var12.field75;
                            ++this.field1314;
                        }
                        if (var12.field78 == 6 && !this.field1420 && arg5 >= var13 && arg0 >= var14 && arg5 < var12.field80 + var13 && arg0 < var12.field81 + var14) {
                            this.field1292[this.field1314] = var12.field131;
                            this.field1205[this.field1314] = 997;
                            this.field1204[this.field1314] = var12.field75;
                            ++this.field1314;
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
                                        this.field1524 = var17;
                                        this.field1525 = var12.field75;
                                        if (var12.field71[var17] > 0) {
                                            ObjType var22 = ObjType.method350(var12.field71[var17] - 1);
                                            if (this.field1195 == 1 && var12.field98) {
                                                if (this.field1197 != var12.field75 || this.field1196 != var17) {
                                                    this.field1292[this.field1314] = "Use " + this.field1199 + " with @lre@" + var22.field1024;
                                                    this.field1205[this.field1314] = 398;
                                                    this.field1206[this.field1314] = var22.field1022;
                                                    this.field1203[this.field1314] = var17;
                                                    this.field1204[this.field1314] = var12.field75;
                                                    ++this.field1314;
                                                }
                                            } else if (this.field1387 == 1 && var12.field98) {
                                                if ((this.field1389 & 16) == 16) {
                                                    this.field1292[this.field1314] = this.field1390 + " @lre@" + var22.field1024;
                                                    this.field1205[this.field1314] = 563;
                                                    this.field1206[this.field1314] = var22.field1022;
                                                    this.field1203[this.field1314] = var17;
                                                    this.field1204[this.field1314] = var12.field75;
                                                    ++this.field1314;
                                                }
                                            } else {
                                                if (var12.field98) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1039 != null && var22.field1039[var23] != null) {
                                                            this.field1292[this.field1314] = var22.field1039[var23] + " @lre@" + var22.field1024;
                                                            if (var23 == 3) {
                                                                this.field1205[this.field1314] = 681;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field1205[this.field1314] = 100;
                                                            }
                                                            this.field1206[this.field1314] = var22.field1022;
                                                            this.field1203[this.field1314] = var17;
                                                            this.field1204[this.field1314] = var12.field75;
                                                            ++this.field1314;
                                                        } else if (var23 == 4) {
                                                            this.field1292[this.field1314] = "Drop @lre@" + var22.field1024;
                                                            this.field1205[this.field1314] = 100;
                                                            this.field1206[this.field1314] = var22.field1022;
                                                            this.field1203[this.field1314] = var17;
                                                            this.field1204[this.field1314] = var12.field75;
                                                            ++this.field1314;
                                                        }
                                                    }
                                                }
                                                if (var12.field99) {
                                                    this.field1292[this.field1314] = "Use @lre@" + var22.field1024;
                                                    this.field1205[this.field1314] = 102;
                                                    this.field1206[this.field1314] = var22.field1022;
                                                    this.field1203[this.field1314] = var17;
                                                    this.field1204[this.field1314] = var12.field75;
                                                    ++this.field1314;
                                                }
                                                if (var12.field98 && var22.field1039 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1039[var24] != null) {
                                                            this.field1292[this.field1314] = var22.field1039[var24] + " @lre@" + var22.field1024;
                                                            if (var24 == 0) {
                                                                this.field1205[this.field1314] = 694;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1205[this.field1314] = 962;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1205[this.field1314] = 795;
                                                            }
                                                            this.field1206[this.field1314] = var22.field1022;
                                                            this.field1203[this.field1314] = var17;
                                                            this.field1204[this.field1314] = var12.field75;
                                                            ++this.field1314;
                                                        }
                                                    }
                                                }
                                                if (var12.field106 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field106[var25] != null) {
                                                            this.field1292[this.field1314] = var12.field106[var25] + " @lre@" + var22.field1024;
                                                            if (var25 == 0) {
                                                                this.field1205[this.field1314] = 582;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1205[this.field1314] = 113;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1205[this.field1314] = 555;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field1205[this.field1314] = 331;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field1205[this.field1314] = 354;
                                                            }
                                                            this.field1206[this.field1314] = var22.field1022;
                                                            this.field1203[this.field1314] = var17;
                                                            this.field1204[this.field1314] = var12.field75;
                                                            ++this.field1314;
                                                        }
                                                    }
                                                }
                                                this.field1292[this.field1314] = "Examine @lre@" + var22.field1024;
                                                this.field1205[this.field1314] = 1328;
                                                this.field1206[this.field1314] = var22.field1022;
                                                this.field1203[this.field1314] = var17;
                                                this.field1204[this.field1314] = var12.field75;
                                                ++this.field1314;
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

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method461(byte arg0) {
        if (arg0 != 0) {
            this.field1429 = this.field1319.method239();
        }
        for (int var2 = -1; var2 < this.field1379; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1377;
            } else {
                var6 = this.field1380[var2];
            }
            PlayerEntity var7 = this.field1378[var6];
            if (var7 != null && var7.field423 > 0) {
                --var7.field423;
                if (var7.field423 == 0) {
                    var7.field422 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field1220; ++var3) {
            int var4 = this.field1221[var3];
            NpcEntity var5 = this.field1219[var4];
            if (var5 != null && var5.field423 > 0) {
                --var5.field423;
                if (var5.field423 == 0) {
                    var5.field422 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method462(int arg0) {
        if (this.field1314 >= 2 || this.field1195 != 0 || this.field1387 != 0) {
            String var2;
            if (this.field1195 == 1 && this.field1314 < 2) {
                var2 = "Use " + this.field1199 + " with...";
            } else if (this.field1387 == 1 && this.field1314 < 2) {
                var2 = this.field1390 + "...";
            } else {
                var2 = this.field1292[this.field1314 - 1];
            }
            if (this.field1314 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1314 - 2) + " more options";
            }
            this.field1346.method220(15, var2, 21042, 16777215, true, field1591 / 1000, 4);
            if (arg0 >= 0) {
                this.field1429 = -1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field1325.method90(arg1, arg2, arg5);
        if (arg3 != 1) {
            this.method6();
        }
        if (var7 != 0) {
            int var8 = this.field1325.method94(arg1, arg2, arg5, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg0;
            if (var7 > 0) {
                var11 = arg4;
            }
            int[] var12 = this.field1303.field666;
            int var13 = (103 - arg5) * 512 * 4 + arg2 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method334(var14);
            if (var15.field955 != -1) {
                Pix8 var16 = this.field1473[var15.field955];
                if (var16 != null) {
                    int var17 = (var15.field941 * 4 - var16.field676) / 2;
                    int var18 = (var15.field942 * 4 - var16.field677) / 2;
                    var16.method212(1, arg2 * 4 + 48 + var17, (104 - arg5 - var15.field942) * 4 + 48 + var18);
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
        int var19 = this.field1325.method92(arg1, arg2, arg5);
        if (var19 != 0) {
            int var20 = this.field1325.method94(arg1, arg2, arg5, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            LocType var24 = LocType.method334(var23);
            if (var24.field955 != -1) {
                Pix8 var25 = this.field1473[var24.field955];
                if (var25 != null) {
                    int var26 = (var24.field941 * 4 - var25.field676) / 2;
                    int var27 = (var24.field942 * 4 - var25.field677) / 2;
                    var25.method212(1, arg2 * 4 + 48 + var26, (104 - arg5 - var24.field942) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field1303.field666;
                int var30 = (103 - arg5) * 512 * 4 + arg2 * 4 + 24624;
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
        int var31 = this.field1325.method93(arg1, arg2, arg5);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            LocType var33 = LocType.method334(var32);
            if (var33.field955 != -1) {
                Pix8 var34 = this.field1473[var33.field955];
                if (var34 != null) {
                    int var35 = (var33.field941 * 4 - var34.field676) / 2;
                    int var36 = (var33.field942 * 4 - var34.field677) / 2;
                    var34.method212(1, arg2 * 4 + 48 + var35, (104 - arg5 - var33.field942) * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method464(int arg0) {
        if (arg0 == -43726) {
            ++field1339;
            if (field1339 > 192) {
                field1339 = 0;
                this.field1543.method228(4, 226);
                this.field1543.method229(232);
            }
            while (true) {
                int var2;
                do {
                    while (true) {
                        var2 = this.method5(this.field1312);
                        if (var2 == -1) {
                            return;
                        }
                        if (this.field1523 != -1 && this.field1633 == this.field1523) {
                            if (var2 == 8 && this.field1444.length() > 0) {
                                this.field1444 = this.field1444.substring(0, this.field1444.length() - 1);
                            }
                            break;
                        }
                        if (this.field1611) {
                            if (var2 >= 32 && var2 <= 122 && this.field1588.length() < 80) {
                                this.field1588 = this.field1588 + (char) var2;
                                this.field1528 = true;
                            }
                            if (var2 == 8 && this.field1588.length() > 0) {
                                this.field1588 = this.field1588.substring(0, this.field1588.length() - 1);
                                this.field1528 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                this.field1611 = false;
                                this.field1528 = true;
                                if (this.field1619 == 1) {
                                    long var3 = JString.method310(this.field1588);
                                    this.method504(var3, (byte) -71);
                                }
                                if (this.field1619 == 2 && this.field1609 > 0) {
                                    long var5 = JString.method310(this.field1588);
                                    this.method472(var5, false);
                                }
                                if (this.field1619 == 3 && this.field1588.length() > 0) {
                                    this.field1543.method228(4, 214);
                                    this.field1543.method229(0);
                                    int var7 = this.field1543.field711;
                                    this.field1543.method235(854, this.field1413);
                                    WordPack.method318(this.field1543, 7, this.field1588);
                                    this.field1543.method238(this.field1543.field711 - var7, true);
                                    this.field1588 = JString.method315(39922, this.field1588);
                                    this.field1588 = WordFilter.method403((byte) -13, this.field1588);
                                    this.method515(JString.method314(true, JString.method311(this.field1413, true)), 6, this.field1599, this.field1588);
                                    if (this.field1625 == 2) {
                                        this.field1625 = 1;
                                        this.field1243 = true;
                                        this.field1543.method228(4, 129);
                                        this.field1543.method229(this.field1583);
                                        this.field1543.method229(this.field1625);
                                        this.field1543.method229(this.field1554);
                                    }
                                }
                                if (this.field1619 == 4 && this.field1646 < 100) {
                                    long var8 = JString.method310(this.field1588);
                                    this.method484(var8, 35615);
                                }
                                if (this.field1619 == 5 && this.field1646 > 0) {
                                    long var10 = JString.method310(this.field1588);
                                    this.method447(var10, -608);
                                }
                            }
                        } else if (this.field1621) {
                            if (var2 >= 48 && var2 <= 57 && this.field1584.length() < 10) {
                                this.field1584 = this.field1584 + (char) var2;
                                this.field1528 = true;
                            }
                            if (var2 == 8 && this.field1584.length() > 0) {
                                this.field1584 = this.field1584.substring(0, this.field1584.length() - 1);
                                this.field1528 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                if (this.field1584.length() > 0) {
                                    int var12 = 0;
                                    try {
                                        var12 = Integer.parseInt(this.field1584);
                                    } catch (Exception var17) {
                                    }
                                    this.field1543.method228(4, 161);
                                    this.field1543.method233(var12);
                                }
                                this.field1621 = false;
                                this.field1528 = true;
                            }
                        } else if (this.field1558 == -1) {
                            if (var2 >= 32 && var2 <= 122 && this.field1555.length() < 80) {
                                this.field1555 = this.field1555 + (char) var2;
                                this.field1528 = true;
                            }
                            if (var2 == 8 && this.field1555.length() > 0) {
                                this.field1555 = this.field1555.substring(0, this.field1555.length() - 1);
                                this.field1528 = true;
                            }
                            if ((var2 == 13 || var2 == 10) && this.field1555.length() > 0) {
                                if (this.field1510 == 2) {
                                    if (this.field1555.equals("::clientdrop")) {
                                        this.method561(this.field1405);
                                    }
                                    if (this.field1555.equals("::lag")) {
                                        this.method491(-610);
                                    }
                                    if (this.field1555.equals("::prefetchmusic")) {
                                        for (int var13 = 0; var13 < this.field1415.method282(2, (byte) -1); ++var13) {
                                            this.field1415.method292(810, 2, (byte) 1, var13);
                                        }
                                    }
                                }
                                if (this.field1555.startsWith("::")) {
                                    this.field1543.method228(4, 86);
                                    this.field1543.method229(this.field1555.length() - 1);
                                    this.field1543.method236(this.field1555.substring(2));
                                } else {
                                    byte var14 = 0;
                                    if (this.field1555.startsWith("yellow:")) {
                                        var14 = 0;
                                        this.field1555 = this.field1555.substring(7);
                                    }
                                    if (this.field1555.startsWith("red:")) {
                                        var14 = 1;
                                        this.field1555 = this.field1555.substring(4);
                                    }
                                    if (this.field1555.startsWith("green:")) {
                                        var14 = 2;
                                        this.field1555 = this.field1555.substring(6);
                                    }
                                    if (this.field1555.startsWith("cyan:")) {
                                        var14 = 3;
                                        this.field1555 = this.field1555.substring(5);
                                    }
                                    if (this.field1555.startsWith("purple:")) {
                                        var14 = 4;
                                        this.field1555 = this.field1555.substring(7);
                                    }
                                    if (this.field1555.startsWith("white:")) {
                                        var14 = 5;
                                        this.field1555 = this.field1555.substring(6);
                                    }
                                    if (this.field1555.startsWith("flash1:")) {
                                        var14 = 6;
                                        this.field1555 = this.field1555.substring(7);
                                    }
                                    if (this.field1555.startsWith("flash2:")) {
                                        var14 = 7;
                                        this.field1555 = this.field1555.substring(7);
                                    }
                                    if (this.field1555.startsWith("flash3:")) {
                                        var14 = 8;
                                        this.field1555 = this.field1555.substring(7);
                                    }
                                    if (this.field1555.startsWith("glow1:")) {
                                        var14 = 9;
                                        this.field1555 = this.field1555.substring(6);
                                    }
                                    if (this.field1555.startsWith("glow2:")) {
                                        var14 = 10;
                                        this.field1555 = this.field1555.substring(6);
                                    }
                                    if (this.field1555.startsWith("glow3:")) {
                                        var14 = 11;
                                        this.field1555 = this.field1555.substring(6);
                                    }
                                    byte var15 = 0;
                                    if (this.field1555.startsWith("wave:")) {
                                        var15 = 1;
                                        this.field1555 = this.field1555.substring(5);
                                    }
                                    if (this.field1555.startsWith("scroll:")) {
                                        var15 = 2;
                                        this.field1555 = this.field1555.substring(7);
                                    }
                                    this.field1543.method228(4, 83);
                                    this.field1543.method229(0);
                                    int var16 = this.field1543.field711;
                                    this.field1543.method229(var14);
                                    this.field1543.method229(var15);
                                    WordPack.method318(this.field1543, 7, this.field1555);
                                    this.field1543.method238(this.field1543.field711 - var16, true);
                                    this.field1555 = JString.method315(39922, this.field1555);
                                    this.field1555 = WordFilter.method403((byte) -13, this.field1555);
                                    field1231.field422 = this.field1555;
                                    field1231.field424 = var14;
                                    field1231.field425 = var15;
                                    field1231.field423 = 150;
                                    if (this.field1510 == 2) {
                                        this.method515("@cr2@" + field1231.field468, 2, this.field1599, field1231.field422);
                                    } else if (this.field1510 == 1) {
                                        this.method515("@cr1@" + field1231.field468, 2, this.field1599, field1231.field422);
                                    } else {
                                        this.method515(field1231.field468, 2, this.field1599, field1231.field422);
                                    }
                                    if (this.field1583 == 2) {
                                        this.field1583 = 3;
                                        this.field1243 = true;
                                        this.field1543.method228(4, 129);
                                        this.field1543.method229(this.field1583);
                                        this.field1543.method229(this.field1625);
                                        this.field1543.method229(this.field1554);
                                    }
                                }
                                this.field1555 = "";
                                this.field1528 = true;
                            }
                        }
                    }
                } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
                if (this.field1444.length() < 12) {
                    this.field1444 = this.field1444 + (char) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method465(int arg0) {
        this.field1428 += arg0;
        while (true) {
            OnDemandRequest var2 = this.field1415.method291();
            if (var2 == null) {
                return;
            }
            if (var2.field724 == 0) {
                Model.method137(var2.field726, false, var2.field725);
                if ((this.field1415.method287((byte) 5, var2.field725) & 98) != 0) {
                    this.field1200 = true;
                    if (this.field1558 != -1) {
                        this.field1528 = true;
                    }
                }
            }
            if (var2.field724 == 1 && var2.field726 != null) {
                AnimFrame.method59(this.field1531, var2.field726);
            }
            if (var2.field724 == 2 && this.field1616 == var2.field725 && var2.field726 != null) {
                this.method541(-434, this.field1617, var2.field726);
            }
            if (var2.field724 == 3 && this.field1317 == 1) {
                for (int var3 = 0; var3 < this.field1472.length; ++var3) {
                    if (this.field1505[var3] == var2.field725) {
                        this.field1472[var3] = var2.field726;
                        if (var2.field726 == null) {
                            this.field1505[var3] = -1;
                        }
                        break;
                    }
                    if (this.field1506[var3] == var2.field725) {
                        this.field1436[var3] = var2.field726;
                        if (var2.field726 == null) {
                            this.field1506[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field724 == 93 && this.field1415.method286(var2.field725, (byte) 1)) {
                World.method17(new Packet(var2.field726, (byte) 3), this.field1415, (byte) -13);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILmb;)V")
    private final void method466(boolean arg0, int arg1, Packet arg2) {
        arg2.method249(0);
        int var4 = arg2.method250(-416, 1);
        if (var4 != 0) {
            int var5 = arg2.method250(-416, 2);
            if (arg0) {
                this.field1429 = arg2.method239();
            }
            if (var5 == 0) {
                this.field1382[this.field1381++] = this.field1377;
            } else if (var5 == 1) {
                int var6 = arg2.method250(-416, 3);
                field1231.method125(false, var6, (byte) 4);
                int var7 = arg2.method250(-416, 1);
                if (var7 == 1) {
                    this.field1382[this.field1381++] = this.field1377;
                }
            } else if (var5 == 2) {
                int var8 = arg2.method250(-416, 3);
                field1231.method125(true, var8, (byte) 4);
                int var9 = arg2.method250(-416, 3);
                field1231.method125(true, var9, (byte) 4);
                int var10 = arg2.method250(-416, 1);
                if (var10 == 1) {
                    this.field1382[this.field1381++] = this.field1377;
                }
            } else if (var5 == 3) {
                this.field1277 = arg2.method250(-416, 2);
                int var11 = arg2.method250(-416, 7);
                int var12 = arg2.method250(-416, 7);
                int var13 = arg2.method250(-416, 1);
                field1231.method124(var12, var11, false, var13 == 1);
                int var14 = arg2.method250(-416, 1);
                if (var14 == 1) {
                    this.field1382[this.field1381++] = this.field1377;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method467(int arg0) {
        if (arg0 != -20582) {
            this.field1406 = null;
        }
        if (super.field29 == 1) {
            if (super.field30 >= 539 && super.field30 <= 573 && super.field31 >= 169 && super.field31 < 205 && this.field1468[0] != -1) {
                this.field1200 = true;
                this.field1248 = 0;
                this.field1352 = true;
            }
            if (super.field30 >= 569 && super.field30 <= 599 && super.field31 >= 168 && super.field31 < 205 && this.field1468[1] != -1) {
                this.field1200 = true;
                this.field1248 = 1;
                this.field1352 = true;
            }
            if (super.field30 >= 597 && super.field30 <= 627 && super.field31 >= 168 && super.field31 < 205 && this.field1468[2] != -1) {
                this.field1200 = true;
                this.field1248 = 2;
                this.field1352 = true;
            }
            if (super.field30 >= 625 && super.field30 <= 669 && super.field31 >= 168 && super.field31 < 203 && this.field1468[3] != -1) {
                this.field1200 = true;
                this.field1248 = 3;
                this.field1352 = true;
            }
            if (super.field30 >= 666 && super.field30 <= 696 && super.field31 >= 168 && super.field31 < 205 && this.field1468[4] != -1) {
                this.field1200 = true;
                this.field1248 = 4;
                this.field1352 = true;
            }
            if (super.field30 >= 694 && super.field30 <= 724 && super.field31 >= 168 && super.field31 < 205 && this.field1468[5] != -1) {
                this.field1200 = true;
                this.field1248 = 5;
                this.field1352 = true;
            }
            if (super.field30 >= 722 && super.field30 <= 756 && super.field31 >= 169 && super.field31 < 205 && this.field1468[6] != -1) {
                this.field1200 = true;
                this.field1248 = 6;
                this.field1352 = true;
            }
            if (super.field30 >= 540 && super.field30 <= 574 && super.field31 >= 466 && super.field31 < 502 && this.field1468[7] != -1) {
                this.field1200 = true;
                this.field1248 = 7;
                this.field1352 = true;
            }
            if (super.field30 >= 572 && super.field30 <= 602 && super.field31 >= 466 && super.field31 < 503 && this.field1468[8] != -1) {
                this.field1200 = true;
                this.field1248 = 8;
                this.field1352 = true;
            }
            if (super.field30 >= 599 && super.field30 <= 629 && super.field31 >= 466 && super.field31 < 503 && this.field1468[9] != -1) {
                this.field1200 = true;
                this.field1248 = 9;
                this.field1352 = true;
            }
            if (super.field30 >= 627 && super.field30 <= 671 && super.field31 >= 467 && super.field31 < 502 && this.field1468[10] != -1) {
                this.field1200 = true;
                this.field1248 = 10;
                this.field1352 = true;
            }
            if (super.field30 >= 669 && super.field30 <= 699 && super.field31 >= 466 && super.field31 < 503 && this.field1468[11] != -1) {
                this.field1200 = true;
                this.field1248 = 11;
                this.field1352 = true;
            }
            if (super.field30 >= 696 && super.field30 <= 726 && super.field31 >= 466 && super.field31 < 503 && this.field1468[12] != -1) {
                this.field1200 = true;
                this.field1248 = 12;
                this.field1352 = true;
            }
            if (super.field30 >= 724 && super.field30 <= 758 && super.field31 >= 466 && super.field31 < 502 && this.field1468[13] != -1) {
                this.field1200 = true;
                this.field1248 = 13;
                this.field1352 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    private static final String method468(int arg0, int arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1 != 2) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZBILd;III)V")
    public final void method469(int arg0, int arg1, boolean arg2, byte arg3, int arg4, Component arg5, int arg6, int arg7, int arg8) {
        if (arg3 != 116) {
            this.field1543.method229(214);
        }
        if (this.field1624) {
            this.field1290 = 32;
        } else {
            this.field1290 = 0;
        }
        this.field1624 = false;
        if (arg4 >= arg0 && arg4 < arg0 + 16 && arg6 >= arg8 && arg6 < arg8 + 16) {
            arg5.field90 -= this.field1361 * 4;
            if (arg2) {
                this.field1200 = true;
                return;
            }
        } else if (arg4 >= arg0 && arg4 < arg0 + 16 && arg6 >= arg7 + arg8 - 16 && arg6 < arg7 + arg8) {
            arg5.field90 += this.field1361 * 4;
            if (arg2) {
                this.field1200 = true;
                return;
            }
        } else {
            if (arg4 < arg0 - this.field1290 || arg4 >= arg0 + 16 + this.field1290 || arg6 < arg8 + 16 || arg6 >= arg7 + arg8 - 16 || this.field1361 <= 0) {
                return;
            }
            int var10 = (arg7 - 32) * arg7 / arg1;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg6 - arg8 - 16 - var10 / 2;
            int var12 = arg7 - 32 - var10;
            arg5.field90 = (arg1 - arg7) * var11 / var12;
            if (arg2) {
                this.field1200 = true;
            }
            this.field1624 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method470(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 >> 7;
        int var6 = arg0 >> 7;
        if (arg3 != 9803) {
            return this.field1323;
        } else if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg1;
            if (arg1 < 3 && (this.field1512[1][var5][var6] & 2) == 2) {
                var7 = arg1 + 1;
            }
            int var8 = arg2 & 127;
            int var9 = arg0 & 127;
            int var10 = (128 - var8) * this.field1276[var7][var5][var6] + this.field1276[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field1276[var7][var5][var6 + 1] + this.field1276[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Z")
    public final boolean method471(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        boolean var5 = false;
        Component var6 = Component.field70[arg2];
        for (int var7 = 0; var7 < var6.field92.length && var6.field92[var7] != -1; ++var7) {
            Component var8 = Component.field70[var6.field92[var7]];
            if (var8.field77 == 1) {
                var5 |= this.method471(0, arg1, var8.field75);
            }
            if (var8.field77 == 6 && (var8.field123 != -1 || var8.field124 != -1)) {
                boolean var9 = this.method458(this.field1360, var8);
                int var10;
                if (var9) {
                    var10 = var8.field124;
                } else {
                    var10 = var8.field123;
                }
                if (var10 != -1) {
                    SeqType var11 = SeqType.field1112[var10];
                    var8.field74 += arg1;
                    while (var8.field74 > var11.method384((byte) -103, var8.field73)) {
                        var8.field74 -= var11.method384((byte) -103, var8.field73) + 1;
                        ++var8.field73;
                        if (var8.field73 >= var11.field1113) {
                            var8.field73 -= var11.field1117;
                            if (var8.field73 < 0 || var8.field73 >= var11.field1113) {
                                var8.field73 = 0;
                            }
                        }
                        var5 = true;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method472(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1609; ++var4) {
                if (this.field1521[var4] == arg0) {
                    --this.field1609;
                    this.field1200 = true;
                    for (int var5 = var4; var5 < this.field1609; ++var5) {
                        this.field1257[var5] = this.field1257[var5 + 1];
                        this.field1553[var5] = this.field1553[var5 + 1];
                        this.field1521[var5] = this.field1521[var5 + 1];
                    }
                    this.field1543.method228(4, 84);
                    this.field1543.method235(854, arg0);
                    break;
                }
            }
            if (arg1) {
                this.field1429 = -1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljb;III)V")
    public final void method473(Pix32 arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1278 + this.field1253 & 2047;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (arg1 != 0) {
            this.field1406 = null;
        }
        if (var6 <= 6400) {
            int var7 = Model.field602[var5];
            int var8 = Model.field603[var5];
            int var9 = var7 * 256 / (this.field1348 + 256);
            int var10 = var8 * 256 / (this.field1348 + 256);
            int var11 = arg2 * var9 + arg3 * var10 >> 16;
            int var12 = arg2 * var10 - arg3 * var9 >> 16;
            if (var6 > 2500) {
                arg0.method205(true, this.field1296, 83 - var12 - arg0.field672 / 2 - 4, var11 + 94 - arg0.field671 / 2 + 4);
            } else {
                arg0.method199(1, var11 + 94 - arg0.field671 / 2 + 4, 83 - var12 - arg0.field672 / 2 - 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method474(boolean arg0) {
        for (int var2 = 0; var2 < this.field1322; ++var2) {
            if (this.field1305[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field1192[var2] == this.field1411 && this.field1340[var2] == this.field1440) {
                        if (!this.method431((byte) 6)) {
                            var3 = true;
                        }
                    } else {
                        Packet var4 = Wave.method323(this.field1340[var2], this.field1192[var2], (byte) -74);
                        if (System.currentTimeMillis() + (long) (var4.field711 / 22) > (long) (this.field1602 / 22) + this.field1274) {
                            this.field1602 = var4.field711;
                            this.field1274 = System.currentTimeMillis();
                            if (this.method505(var4.field710, var4.field711, 0)) {
                                this.field1411 = this.field1192[var2];
                                this.field1440 = this.field1340[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field1305[var2] != -5) {
                    this.field1305[var2] = -5;
                } else {
                    --this.field1322;
                    for (int var6 = var2; var6 < this.field1322; ++var6) {
                        this.field1192[var6] = this.field1192[var6 + 1];
                        this.field1340[var6] = this.field1340[var6 + 1];
                        this.field1305[var6] = this.field1305[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field1305[var2]--;
            }
        }
        if (arg0) {
            this.field1406 = null;
        }
        if (this.field1569 > 0) {
            this.field1569 -= 20;
            if (this.field1569 < 0) {
                this.field1569 = 0;
            }
            if (this.field1569 == 0 && this.field1315 && !field1242) {
                this.field1616 = this.field1598;
                this.field1617 = false;
                this.field1415.method289(2, this.field1616);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method475(boolean arg0, int arg1) {
        if (!arg0) {
            int var3 = VarpType.field1154[arg1].field1162;
            if (var3 != 0) {
                int var4 = this.field1211[arg1];
                if (var3 == 1) {
                    if (var4 == 1) {
                        Pix3D.method186(241, 0.9D);
                    }
                    if (var4 == 2) {
                        Pix3D.method186(241, 0.8D);
                    }
                    if (var4 == 3) {
                        Pix3D.method186(241, 0.7D);
                    }
                    if (var4 == 4) {
                        Pix3D.method186(241, 0.6D);
                    }
                    ObjType.field1062.method117();
                    this.field1448 = true;
                }
                if (var3 == 3) {
                    boolean var5 = this.field1315;
                    if (var4 == 0) {
                        this.method443(0, 0, this.field1315);
                        this.field1315 = true;
                    }
                    if (var4 == 1) {
                        this.method443(0, -400, this.field1315);
                        this.field1315 = true;
                    }
                    if (var4 == 2) {
                        this.method443(0, -800, this.field1315);
                        this.field1315 = true;
                    }
                    if (var4 == 3) {
                        this.method443(0, -1200, this.field1315);
                        this.field1315 = true;
                    }
                    if (var4 == 4) {
                        this.field1315 = false;
                    }
                    if (this.field1315 != var5 && !field1242) {
                        if (this.field1315) {
                            this.field1616 = this.field1598;
                            this.field1617 = false;
                            this.field1415.method289(2, this.field1616);
                        } else {
                            this.method453(true);
                        }
                        this.field1569 = 0;
                    }
                }
                if (var3 == 4) {
                    if (var4 == 0) {
                        this.field1351 = true;
                        this.method522(this.field1212, 0);
                    }
                    if (var4 == 1) {
                        this.field1351 = true;
                        this.method522(this.field1212, -400);
                    }
                    if (var4 == 2) {
                        this.field1351 = true;
                        this.method522(this.field1212, -800);
                    }
                    if (var4 == 3) {
                        this.field1351 = true;
                        this.method522(this.field1212, -1200);
                    }
                    if (var4 == 4) {
                        this.field1351 = false;
                    }
                }
                if (var3 == 5) {
                    this.field1495 = var4;
                }
                if (var3 == 6) {
                    this.field1386 = var4;
                }
                if (var3 == 8) {
                    this.field1342 = var4;
                    this.field1528 = true;
                }
                if (var3 == 9) {
                    this.field1522 = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLmb;)V")
    private final void method476(int arg0, byte arg1, Packet arg2) {
        for (int var4 = 0; var4 < this.field1381; ++var4) {
            int var5 = this.field1382[var4];
            NpcEntity var6 = this.field1219[var5];
            int var7 = arg2.method239();
            if ((var7 & 1) == 1) {
                int var8 = arg2.method239();
                int var9 = arg2.method239();
                var6.method128(172, var9, var8);
                var6.field429 = field1591 + 300;
                var6.field430 = arg2.method239();
                var6.field431 = arg2.method239();
            }
            if ((var7 & 2) == 2) {
                int var10 = arg2.method241();
                if (var10 == 65535) {
                    var10 = -1;
                }
                if (var6.field438 == var10) {
                    var6.field442 = 0;
                }
                int var11 = arg2.method239();
                if (var6.field438 == var10 && var10 != -1) {
                    int var12 = SeqType.field1112[var10].field1126;
                    if (var12 == 1) {
                        var6.field439 = 0;
                        var6.field440 = 0;
                        var6.field441 = var11;
                        var6.field442 = 0;
                    }
                    if (var12 == 2) {
                        var6.field442 = 0;
                    }
                } else if (var10 == -1 || var6.field438 == -1 || SeqType.field1112[var10].field1120 >= SeqType.field1112[var6.field438].field1120) {
                    var6.field438 = var10;
                    var6.field439 = 0;
                    var6.field440 = 0;
                    var6.field441 = var11;
                    var6.field442 = 0;
                    var6.field464 = var6.field459;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field432 = arg2.method241();
                if (var6.field432 == 65535) {
                    var6.field432 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field422 = arg2.method246();
                var6.field423 = 100;
            }
            if ((var7 & 16) == 16) {
                int var13 = arg2.method239();
                int var14 = arg2.method239();
                var6.method128(172, var14, var13);
                var6.field429 = field1591 + 300;
                var6.field430 = arg2.method239();
                var6.field431 = arg2.method239();
            }
            if ((var7 & 32) == 32) {
                var6.field465 = NpcType.method344(arg2.method241());
                var6.field414 = var6.field465.field987;
                var6.field458 = var6.field465.field1009;
                var6.field417 = var6.field465.field991;
                var6.field418 = var6.field465.field992;
                var6.field419 = var6.field465.field993;
                var6.field420 = var6.field465.field994;
                var6.field415 = var6.field465.field990;
            }
            if ((var7 & 64) == 64) {
                var6.field443 = arg2.method241();
                int var15 = arg2.method244();
                var6.field447 = var15 >> 16;
                var6.field446 = (var15 & 65535) + field1591;
                var6.field444 = 0;
                var6.field445 = 0;
                if (var6.field446 > field1591) {
                    var6.field444 = -1;
                }
                if (var6.field443 == 65535) {
                    var6.field443 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field433 = arg2.method241();
                var6.field434 = arg2.method241();
            }
        }
        if (arg1 != -59) {
            this.field1406 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        if (signlink.sunjava) {
            super.field9 = 5;
        }
        if (field1620) {
            this.field1410 = true;
        } else {
            field1620 = true;
            boolean var1 = false;
            String var2 = this.method550(-785);
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
                this.field1194 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1232[var3] = new FileStream(signlink.cache_idx[var3], 0, 500000, var3 + 1, signlink.cache_dat);
                    }
                }
                try {
                    int var4 = 5;
                    this.field1637[8] = 0;
                    while (this.field1637[8] == 0) {
                        this.method13((byte) 6, "Connecting to web server", 20);
                        try {
                            DataInputStream var5 = this.method498("crc" + (int) (Math.random() * 9.9999999E7D));
                            Packet var6 = new Packet(new byte[36], (byte) 3);
                            var5.readFully(var6.field710, 0, 36);
                            for (int var7 = 0; var7 < 9; ++var7) {
                                this.field1637[var7] = var6.method244();
                            }
                            var5.close();
                        } catch (IOException var80) {
                            for (int var8 = var4; var8 > 0; --var8) {
                                this.method13((byte) 6, "Error loading - Will retry in " + var8 + " secs.", 10);
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
                    this.field1371 = this.method533("title screen", this.field1637[1], 25, false, "title", 1);
                    this.field1344 = new PixFont("p11", this.field1371, true);
                    this.field1345 = new PixFont("p12", this.field1371, true);
                    this.field1346 = new PixFont("b12", this.field1371, true);
                    this.field1347 = new PixFont("q8", this.field1371, true);
                    this.method526((byte) 8);
                    this.method558(-111);
                    Jagfile var9 = this.method533("config", this.field1637[2], 30, false, "config", 2);
                    Jagfile var10 = this.method533("interface", this.field1637[3], 35, false, "interface", 3);
                    Jagfile var11 = this.method533("2d graphics", this.field1637[4], 40, false, "media", 4);
                    Jagfile var12 = this.method533("textures", this.field1637[6], 45, false, "textures", 6);
                    Jagfile var13 = this.method533("chat system", this.field1637[7], 50, false, "wordenc", 7);
                    Jagfile var14 = this.method533("sound effects", this.field1637[8], 55, false, "sounds", 8);
                    this.field1512 = new byte[4][104][104];
                    this.field1276 = new int[4][105][105];
                    this.field1325 = new World3D(104, 104, this.field1276, (byte) 56, 4);
                    for (int var15 = 0; var15 < 4; ++var15) {
                        this.field1233[var15] = new CollisionMap(3, 104, 104);
                    }
                    this.field1303 = new Pix32(512, 512);
                    Jagfile var16 = this.method533("update list", this.field1637[5], 60, false, "versionlist", 5);
                    this.method13((byte) 6, "Connecting to update server", 60);
                    this.field1415 = new OnDemand();
                    this.field1415.method280(var16, this);
                    AnimFrame.method58(this.field1415.method283(false));
                    Model.method136(this.field1415.method282(0, (byte) -1), this.field1415);
                    if (!field1242) {
                        this.field1616 = 0;
                        this.field1617 = false;
                        this.field1415.method289(2, this.field1616);
                        while (this.field1415.method290() > 0) {
                            this.method465(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var74) {
                            }
                        }
                    }
                    this.method13((byte) 6, "Requesting animations", 65);
                    int var17 = this.field1415.method282(1, (byte) -1);
                    for (int var18 = 0; var18 < var17; ++var18) {
                        this.field1415.method289(1, var18);
                    }
                    while (this.field1415.method290() > 0) {
                        int var19 = var17 - this.field1415.method290();
                        if (var19 > 0) {
                            this.method13((byte) 6, "Loading animations - " + var19 * 100 / var17 + "%", 65);
                        }
                        this.method465(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var73) {
                        }
                    }
                    this.method13((byte) 6, "Requesting models", 70);
                    int var20 = this.field1415.method282(0, (byte) -1);
                    for (int var21 = 0; var21 < var20; ++var21) {
                        int var22 = this.field1415.method287((byte) 5, var21);
                        if ((var22 & 1) != 0) {
                            this.field1415.method289(0, var21);
                        }
                    }
                    int var23 = this.field1415.method290();
                    while (this.field1415.method290() > 0) {
                        int var24 = var23 - this.field1415.method290();
                        if (var24 > 0) {
                            this.method13((byte) 6, "Loading models - " + var24 * 100 / var23 + "%", 70);
                        }
                        this.method465(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var72) {
                        }
                    }
                    if (this.field1232[0] != null) {
                        this.method13((byte) 6, "Requesting maps", 75);
                        this.field1415.method289(3, this.field1415.method284(47, 48, 0, field1341));
                        this.field1415.method289(3, this.field1415.method284(47, 48, 1, field1341));
                        this.field1415.method289(3, this.field1415.method284(48, 48, 0, field1341));
                        this.field1415.method289(3, this.field1415.method284(48, 48, 1, field1341));
                        this.field1415.method289(3, this.field1415.method284(49, 48, 0, field1341));
                        this.field1415.method289(3, this.field1415.method284(49, 48, 1, field1341));
                        this.field1415.method289(3, this.field1415.method284(47, 47, 0, field1341));
                        this.field1415.method289(3, this.field1415.method284(47, 47, 1, field1341));
                        this.field1415.method289(3, this.field1415.method284(48, 47, 0, field1341));
                        this.field1415.method289(3, this.field1415.method284(48, 47, 1, field1341));
                        this.field1415.method289(3, this.field1415.method284(48, 148, 0, field1341));
                        this.field1415.method289(3, this.field1415.method284(48, 148, 1, field1341));
                        int var25 = this.field1415.method290();
                        while (this.field1415.method290() > 0) {
                            int var26 = var25 - this.field1415.method290();
                            if (var26 > 0) {
                                this.method13((byte) 6, "Loading maps - " + var26 * 100 / var25 + "%", 75);
                            }
                            this.method465(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                        }
                    }
                    int var27 = this.field1415.method282(0, (byte) -1);
                    for (int var28 = 0; var28 < var27; ++var28) {
                        int var29 = this.field1415.method287((byte) 5, var28);
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
                            this.field1415.method292(810, 0, var30, var28);
                        }
                    }
                    this.field1415.method285(41461, field1241);
                    if (!field1242) {
                        int var31 = this.field1415.method282(2, (byte) -1);
                        for (int var32 = 1; var32 < var31; ++var32) {
                            if (this.field1415.method288(var32, false)) {
                                this.field1415.method292(810, 2, (byte) 1, var32);
                            }
                        }
                    }
                    this.method13((byte) 6, "Unpacking media", 80);
                    this.field1295 = new Pix8(var11, "invback", 0);
                    this.field1297 = new Pix8(var11, "chatback", 0);
                    this.field1296 = new Pix8(var11, "mapback", 0);
                    this.field1280 = new Pix8(var11, "backbase1", 0);
                    this.field1281 = new Pix8(var11, "backbase2", 0);
                    this.field1282 = new Pix8(var11, "backhmid1", 0);
                    for (int var33 = 0; var33 < 13; ++var33) {
                        this.field1460[var33] = new Pix8(var11, "sideicons", var33);
                    }
                    this.field1300 = new Pix32(var11, "compass", 0);
                    this.field1590 = new Pix32(var11, "mapedge", 0);
                    this.field1590.method196(false);
                    try {
                        for (int var34 = 0; var34 < 50; ++var34) {
                            this.field1473[var34] = new Pix8(var11, "mapscene", var34);
                        }
                    } catch (Exception var79) {
                    }
                    try {
                        for (int var35 = 0; var35 < 50; ++var35) {
                            this.field1600[var35] = new Pix32(var11, "mapfunction", var35);
                        }
                    } catch (Exception var78) {
                    }
                    try {
                        for (int var36 = 0; var36 < 20; ++var36) {
                            this.field1353[var36] = new Pix32(var11, "hitmarks", var36);
                        }
                    } catch (Exception var77) {
                    }
                    try {
                        for (int var37 = 0; var37 < 20; ++var37) {
                            this.field1559[var37] = new Pix32(var11, "headicons", var37);
                        }
                    } catch (Exception var76) {
                    }
                    this.field1442 = new Pix32(var11, "mapmarker", 0);
                    this.field1443 = new Pix32(var11, "mapmarker", 1);
                    for (int var38 = 0; var38 < 8; ++var38) {
                        this.field1622[var38] = new Pix32(var11, "cross", var38);
                    }
                    this.field1570 = new Pix32(var11, "mapdots", 0);
                    this.field1571 = new Pix32(var11, "mapdots", 1);
                    this.field1572 = new Pix32(var11, "mapdots", 2);
                    this.field1573 = new Pix32(var11, "mapdots", 3);
                    this.field1355 = new Pix8(var11, "scrollbar", 0);
                    this.field1356 = new Pix8(var11, "scrollbar", 1);
                    this.field1399 = new Pix8(var11, "redstone1", 0);
                    this.field1400 = new Pix8(var11, "redstone2", 0);
                    this.field1401 = new Pix8(var11, "redstone3", 0);
                    this.field1402 = new Pix8(var11, "redstone1", 0);
                    this.field1402.method209((byte) 15);
                    this.field1403 = new Pix8(var11, "redstone2", 0);
                    this.field1403.method209((byte) 15);
                    this.field1226 = new Pix8(var11, "redstone1", 0);
                    this.field1226.method210(false);
                    this.field1227 = new Pix8(var11, "redstone2", 0);
                    this.field1227.method210(false);
                    this.field1228 = new Pix8(var11, "redstone3", 0);
                    this.field1228.method210(false);
                    this.field1229 = new Pix8(var11, "redstone1", 0);
                    this.field1229.method209((byte) 15);
                    this.field1229.method210(false);
                    this.field1230 = new Pix8(var11, "redstone2", 0);
                    this.field1230.method209((byte) 15);
                    this.field1230.method210(false);
                    for (int var39 = 0; var39 < 2; ++var39) {
                        this.field1630[var39] = new Pix8(var11, "mod_icons", var39);
                    }
                    Pix32 var40 = new Pix32(var11, "backleft1", 0);
                    this.field1560 = new PixMap(true, this.method11(0), var40.field667, var40.field668);
                    var40.method197(0, -18217, 0);
                    Pix32 var41 = new Pix32(var11, "backleft2", 0);
                    this.field1561 = new PixMap(true, this.method11(0), var41.field667, var41.field668);
                    var41.method197(0, -18217, 0);
                    Pix32 var42 = new Pix32(var11, "backright1", 0);
                    this.field1562 = new PixMap(true, this.method11(0), var42.field667, var42.field668);
                    var42.method197(0, -18217, 0);
                    Pix32 var43 = new Pix32(var11, "backright2", 0);
                    this.field1563 = new PixMap(true, this.method11(0), var43.field667, var43.field668);
                    var43.method197(0, -18217, 0);
                    Pix32 var44 = new Pix32(var11, "backtop1", 0);
                    this.field1564 = new PixMap(true, this.method11(0), var44.field667, var44.field668);
                    var44.method197(0, -18217, 0);
                    Pix32 var45 = new Pix32(var11, "backvmid1", 0);
                    this.field1565 = new PixMap(true, this.method11(0), var45.field667, var45.field668);
                    var45.method197(0, -18217, 0);
                    Pix32 var46 = new Pix32(var11, "backvmid2", 0);
                    this.field1566 = new PixMap(true, this.method11(0), var46.field667, var46.field668);
                    var46.method197(0, -18217, 0);
                    Pix32 var47 = new Pix32(var11, "backvmid3", 0);
                    this.field1567 = new PixMap(true, this.method11(0), var47.field667, var47.field668);
                    var47.method197(0, -18217, 0);
                    Pix32 var48 = new Pix32(var11, "backhmid2", 0);
                    this.field1568 = new PixMap(true, this.method11(0), var48.field667, var48.field668);
                    var48.method197(0, -18217, 0);
                    int var49 = (int) (Math.random() * 21.0D) - 10;
                    int var50 = (int) (Math.random() * 21.0D) - 10;
                    int var51 = (int) (Math.random() * 21.0D) - 10;
                    int var52 = (int) (Math.random() * 41.0D) - 20;
                    for (int var53 = 0; var53 < 50; ++var53) {
                        if (this.field1600[var53] != null) {
                            this.field1600[var53].method195(0, var50 + var52, var49 + var52, var51 + var52);
                        }
                        if (this.field1473[var53] != null) {
                            this.field1473[var53].method211(0, var50 + var52, var49 + var52, var51 + var52);
                        }
                    }
                    this.method13((byte) 6, "Unpacking textures", 83);
                    Pix3D.method182(var12, false);
                    Pix3D.method186(241, 0.8D);
                    Pix3D.method181(0, 20);
                    this.method13((byte) 6, "Unpacking config", 86);
                    SeqType.method383(true, var9);
                    LocType.method332(var9);
                    FloType.method373(true, var9);
                    ObjType.method348(var9);
                    NpcType.method342(var9);
                    IdkType.method377(true, var9);
                    SpotAnimType.method386(true, var9);
                    VarpType.method391(true, var9);
                    VarbitType.method389(true, var9);
                    ObjType.field1021 = field1241;
                    if (!field1242) {
                        this.method13((byte) 6, "Unpacking sounds", 90);
                        byte[] var54 = var14.method309("sounds.dat", (byte[]) null);
                        Packet var55 = new Packet(var54, (byte) 3);
                        Wave.method322(true, var55);
                    }
                    this.method13((byte) 6, "Unpacking interfaces", 95);
                    PixFont[] var56 = new PixFont[] { this.field1344, this.field1345, this.field1346, this.field1347 };
                    Component.method32(var11, 7, var56, var10);
                    this.method13((byte) 6, "Preparing game engine", 100);
                    for (int var57 = 0; var57 < 33; ++var57) {
                        int var58 = 999;
                        int var59 = 0;
                        for (int var60 = 0; var60 < 34; ++var60) {
                            if (this.field1296.field674[this.field1296.field676 * var57 + var60] == 0) {
                                if (var58 == 999) {
                                    var58 = var60;
                                }
                            } else if (var58 != 999) {
                                var59 = var60;
                                break;
                            }
                        }
                        this.field1595[var57] = var58;
                        this.field1424[var57] = var59 - var58;
                    }
                    for (int var61 = 5; var61 < 156; ++var61) {
                        int var62 = 999;
                        int var63 = 0;
                        for (int var64 = 25; var64 < 172; ++var64) {
                            if (this.field1296.field674[this.field1296.field676 * var61 + var64] == 0 && (var64 > 34 || var61 > 34)) {
                                if (var62 == 999) {
                                    var62 = var64;
                                }
                            } else if (var62 != 999) {
                                var63 = var64;
                                break;
                            }
                        }
                        this.field1502[var61 - 5] = var62 - 25;
                        this.field1648[var61 - 5] = var63 - var62;
                    }
                    Pix3D.method179(479, 0, 96);
                    this.field1613 = Pix3D.field647;
                    Pix3D.method179(190, 0, 261);
                    this.field1614 = Pix3D.field647;
                    Pix3D.method179(512, 0, 334);
                    this.field1615 = Pix3D.field647;
                    int[] var65 = new int[9];
                    for (int var66 = 0; var66 < 9; ++var66) {
                        int var67 = var66 * 32 + 128 + 15;
                        int var68 = var67 * 3 + 600;
                        int var69 = Pix3D.field645[var67];
                        var65[var66] = var68 * var69 >> 16;
                    }
                    World3D.method100(500, 512, 334, 800, var65, field1321);
                    WordFilter.method393(var13);
                    this.field1644 = new MouseTracking(0, this);
                    this.method12(this.field1644, 10);
                } catch (Exception var81) {
                    signlink.reporterror("loaderror " + this.field1469 + " " + this.field1201);
                    this.field1508 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method477(boolean arg0, int arg1) {
        for (int var3 = 0; var3 < this.field1220; ++var3) {
            NpcEntity var4 = this.field1219[this.field1221[var3]];
            int var5 = (this.field1221[var3] << 14) + 536870912;
            if (var4 != null && var4.method127(-323) && var4.field465.field1005 == arg0) {
                int var6 = var4.field410 >> 7;
                int var7 = var4.field411 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field414 == 1 && (var4.field410 & 127) == 64 && (var4.field411 & 127) == 64) {
                        if (this.field1586[var6][var7] == this.field1320) {
                            continue;
                        }
                        this.field1586[var6][var7] = this.field1320;
                    }
                    this.field1325.method75(var4.field412, var5, (var4.field414 - 1) * 64 + 60, var4.field410, var4, true, this.method470(var4.field411, this.field1277, var4.field410, 9803), this.field1277, var4.field413, var4.field411);
                }
            }
        }
        if (arg1 == 47055) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)V")
    public final void method478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1355.method212(1, arg3, arg5);
        this.field1356.method212(1, arg3, arg1 + arg5 - 16);
        Pix2D.method170(arg1 - 32, 16, arg3, arg5 + 16, (byte) 3, this.field1455);
        int var7 = (arg1 - 32) * arg1 / arg2;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg1 - 32 - var7) * arg4 / (arg2 - arg1);
        Pix2D.method170(var7, 16, arg3, arg5 + 16 + var8, (byte) 3, this.field1585);
        Pix2D.method175(arg5 + 16 + var8, var7, this.field1513, arg3, -490);
        Pix2D.method175(arg5 + 16 + var8, var7, this.field1513, arg3 + 1, -490);
        Pix2D.method173(arg3, arg5 + 16 + var8, 4, this.field1513, 16);
        Pix2D.method173(arg3, arg5 + 17 + var8, 4, this.field1513, 16);
        Pix2D.method175(arg5 + 16 + var8, var7, this.field1457, arg3 + 15, -490);
        if (arg0 >= 0) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
        Pix2D.method175(arg5 + 17 + var8, var7 - 1, this.field1457, arg3 + 14, -490);
        Pix2D.method173(arg3, arg5 + 15 + var8 + var7, 4, this.field1457, 16);
        Pix2D.method173(arg3 + 1, arg5 + 14 + var8 + var7, 4, this.field1457, 15);
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method479(int arg0) {
        try {
            if (this.field1607 != null) {
                this.field1607.method38();
            }
        } catch (Exception var3) {
        }
        this.field1607 = null;
        this.field1428 += arg0;
        this.field1238 = false;
        this.field1493 = 0;
        this.field1426 = "";
        this.field1427 = "";
        InputTracking.method45(32268);
        this.method457(0);
        this.field1325.method64(29142);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field1233[var2].method361(true);
        }
        System.gc();
        this.method453(true);
        this.field1598 = -1;
        this.field1616 = -1;
        this.field1569 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZII)I")
    public final int method480(int arg0, boolean arg1, int arg2, int arg3) {
        int var5 = 256 - arg2;
        if (arg1) {
            this.field1406 = null;
        }
        return ((arg0 & 16711935) * var5 + (arg3 & 16711935) * arg2 & -16711936) + ((arg0 & 65280) * var5 + (arg3 & 65280) * arg2 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)I")
    public final int method481(byte arg0) {
        int var2 = 3;
        if (arg0 != 34) {
            return this.field1599;
        } else {
            if (this.field1269 < 310) {
                int var3 = this.field1266 >> 7;
                int var4 = this.field1268 >> 7;
                int var5 = field1231.field410 >> 7;
                int var6 = field1231.field411 >> 7;
                if ((this.field1512[this.field1277][var3][var4] & 4) != 0) {
                    var2 = this.field1277;
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
                        if ((this.field1512[this.field1277][var3][var4] & 4) != 0) {
                            var2 = this.field1277;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field1512[this.field1277][var3][var4] & 4) != 0) {
                                var2 = this.field1277;
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
                        if ((this.field1512[this.field1277][var3][var4] & 4) != 0) {
                            var2 = this.field1277;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field1512[this.field1277][var3][var4] & 4) != 0) {
                                var2 = this.field1277;
                            }
                        }
                    }
                }
            }
            if ((this.field1512[this.field1277][field1231.field410 >> 7][field1231.field411 >> 7] & 4) != 0) {
                var2 = this.field1277;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)I")
    public final int method482(boolean arg0) {
        int var2 = this.method470(this.field1268, this.field1277, this.field1266, 9803);
        if (arg0) {
            this.field1406 = null;
        }
        return var2 - this.field1267 < 800 && (this.field1512[this.field1277][this.field1266 >> 7][this.field1268 >> 7] & 4) != 0 ? this.field1277 : 3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILgc;II)V")
    public final void method483(boolean arg0, int arg1, NpcType arg2, int arg3, int arg4) {
        if (this.field1314 < 400) {
            String var6 = arg2.field985;
            this.field1238 &= arg0;
            if (arg2.field1002 != 0) {
                var6 = var6 + method450(-283, arg2.field1002, field1231.field474) + " (level-" + arg2.field1002 + ")";
            }
            if (this.field1195 == 1) {
                this.field1292[this.field1314] = "Use " + this.field1199 + " with @yel@" + var6;
                this.field1205[this.field1314] = 829;
                this.field1206[this.field1314] = arg3;
                this.field1203[this.field1314] = arg1;
                this.field1204[this.field1314] = arg4;
                ++this.field1314;
            } else {
                if (this.field1387 == 1) {
                    if ((this.field1389 & 2) == 2) {
                        this.field1292[this.field1314] = this.field1390 + " @yel@" + var6;
                        this.field1205[this.field1314] = 240;
                        this.field1206[this.field1314] = arg3;
                        this.field1203[this.field1314] = arg1;
                        this.field1204[this.field1314] = arg4;
                        ++this.field1314;
                        return;
                    }
                } else {
                    if (arg2.field997 != null) {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (arg2.field997[var7] != null && !arg2.field997[var7].equalsIgnoreCase("attack")) {
                                this.field1292[this.field1314] = arg2.field997[var7] + " @yel@" + var6;
                                if (var7 == 0) {
                                    this.field1205[this.field1314] = 242;
                                }
                                if (var7 == 1) {
                                    this.field1205[this.field1314] = 209;
                                }
                                if (var7 == 2) {
                                    this.field1205[this.field1314] = 309;
                                }
                                if (var7 == 3) {
                                    this.field1205[this.field1314] = 852;
                                }
                                if (var7 == 4) {
                                    this.field1205[this.field1314] = 793;
                                }
                                this.field1206[this.field1314] = arg3;
                                this.field1203[this.field1314] = arg1;
                                this.field1204[this.field1314] = arg4;
                                ++this.field1314;
                            }
                        }
                    }
                    if (arg2.field997 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (arg2.field997[var8] != null && arg2.field997[var8].equalsIgnoreCase("attack")) {
                                short var9 = 0;
                                if (arg2.field1002 > field1231.field474) {
                                    var9 = 2000;
                                }
                                this.field1292[this.field1314] = arg2.field997[var8] + " @yel@" + var6;
                                if (var8 == 0) {
                                    this.field1205[this.field1314] = var9 + 242;
                                }
                                if (var8 == 1) {
                                    this.field1205[this.field1314] = var9 + 209;
                                }
                                if (var8 == 2) {
                                    this.field1205[this.field1314] = var9 + 309;
                                }
                                if (var8 == 3) {
                                    this.field1205[this.field1314] = var9 + 852;
                                }
                                if (var8 == 4) {
                                    this.field1205[this.field1314] = var9 + 793;
                                }
                                this.field1206[this.field1314] = arg3;
                                this.field1203[this.field1314] = arg1;
                                this.field1204[this.field1314] = arg4;
                                ++this.field1314;
                            }
                        }
                    }
                    this.field1292[this.field1314] = "Examine @yel@" + var6;
                    this.field1205[this.field1314] = 1714;
                    this.field1206[this.field1314] = arg3;
                    this.field1203[this.field1314] = arg1;
                    this.field1204[this.field1314] = arg4;
                    ++this.field1314;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method484(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field1646 >= 100) {
                this.method515("", 0, this.field1599, "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = JString.method314(true, JString.method311(arg0, true));
                for (int var5 = 0; var5 < this.field1646; ++var5) {
                    if (this.field1515[var5] == arg0) {
                        this.method515("", 0, this.field1599, var4 + " is already on your ignore list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1609; ++var6) {
                    if (this.field1521[var6] == arg0) {
                        this.method515("", 0, this.field1599, "Please remove " + var4 + " from your friend list first");
                        return;
                    }
                }
                this.field1515[this.field1646++] = arg0;
                if (arg1 == 35615) {
                    this.field1200 = true;
                    this.field1543.method228(4, 189);
                    this.field1543.method235(854, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method485(int arg0) {
        if (this.field1342 != 0) {
            int var2 = 0;
            if (arg0 != 0) {
                this.field1531 = -287;
            }
            if (this.field1452 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field1247[var3] != null) {
                    int var4 = this.field1245[var3];
                    String var5 = this.field1246[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field1625 == 0 || this.field1625 == 1 && this.method448(var5, (byte) -97))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field23 > 4 && super.field24 - 4 > var9 - 10 && super.field24 - 4 <= var9 + 3) {
                            int var10 = this.field1345.method216("From:  " + var5 + this.field1247[var3], true) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field23 < var10 + 4) {
                                if (this.field1510 >= 1) {
                                    this.field1292[this.field1314] = "Report abuse @whi@" + var5;
                                    this.field1205[this.field1314] = 2524;
                                    ++this.field1314;
                                }
                                this.field1292[this.field1314] = "Add ignore @whi@" + var5;
                                this.field1205[this.field1314] = 2047;
                                ++this.field1314;
                                this.field1292[this.field1314] = "Add friend @whi@" + var5;
                                this.field1205[this.field1314] = 2605;
                                ++this.field1314;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field1625 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLz;)V")
    public final void method486(int arg0, byte arg1, PathingEntity arg2) {
        if (arg1 != 99) {
            this.field1543.method229(172);
        }
        this.method487(arg2.field411, false, arg2.field410, arg0);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZII)V")
    public final void method487(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
            int var5 = this.method470(arg0, this.field1277, arg2, 9803) - arg3;
            int var6 = arg2 - this.field1266;
            int var7 = var5 - this.field1267;
            if (arg1) {
                this.field1406 = null;
            }
            int var8 = arg0 - this.field1268;
            int var9 = Model.field602[this.field1269];
            int var10 = Model.field603[this.field1269];
            int var11 = Model.field602[this.field1270];
            int var12 = Model.field603[this.field1270];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field1298 = (var13 << 9) / var17 + Pix3D.field641;
                this.field1299 = (var16 << 9) / var17 + Pix3D.field642;
            } else {
                this.field1298 = -1;
                this.field1299 = -1;
            }
        } else {
            this.field1298 = -1;
            this.field1299 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIIZII)Z")
    public final boolean method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1396[var15][var35] = 0;
                this.field1357[var15][var35] = 99999999;
            }
        }
        int var16 = arg7;
        int var17 = arg6;
        this.field1396[arg7][arg6] = 99;
        this.field1357[arg7][arg6] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1529[var18] = arg7;
        int var36 = var18 + 1;
        this.field1530[var18] = arg6;
        boolean var20 = false;
        int var21 = this.field1529.length;
        int[][] var22 = this.field1233[this.field1277].field1075;
        while (var36 != var19) {
            var16 = this.field1529[var19];
            var17 = this.field1530[var19];
            var19 = (var19 + 1) % var21;
            if (arg4 == var16 && arg8 == var17) {
                var20 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && this.field1233[this.field1277].method370(343, arg2, arg4, var17, arg8, arg11 - 1, var16)) {
                    var20 = true;
                    break;
                }
                if (arg11 < 10 && this.field1233[this.field1277].method371(this.field1286, arg4, var17, arg11 - 1, arg2, var16, arg8)) {
                    var20 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg1 != 0 && this.field1233[this.field1277].method372(arg10, var16, arg0, arg4, var17, arg1, 530, arg8)) {
                var20 = true;
                break;
            }
            int var34 = this.field1357[var16][var17] + 1;
            if (var16 > 0 && this.field1396[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1529[var36] = var16 - 1;
                this.field1530[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1396[var16 - 1][var17] = 2;
                this.field1357[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1396[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1529[var36] = var16 + 1;
                this.field1530[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1396[var16 + 1][var17] = 8;
                this.field1357[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1396[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1529[var36] = var16;
                this.field1530[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1396[var16][var17 - 1] = 1;
                this.field1357[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1396[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1529[var36] = var16;
                this.field1530[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1396[var16][var17 + 1] = 4;
                this.field1357[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1396[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1529[var36] = var16 - 1;
                this.field1530[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1396[var16 - 1][var17 - 1] = 3;
                this.field1357[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1396[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1529[var36] = var16 + 1;
                this.field1530[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1396[var16 + 1][var17 - 1] = 9;
                this.field1357[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1396[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1529[var36] = var16 - 1;
                this.field1530[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1396[var16 - 1][var17 + 1] = 6;
                this.field1357[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1396[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1529[var36] = var16 + 1;
                this.field1530[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1396[var16 + 1][var17 + 1] = 12;
                this.field1357[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1291 = 0;
        if (!var20) {
            if (arg9) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg4 - var24; var25 <= arg4 + var24; ++var25) {
                        for (int var26 = arg8 - var24; var26 <= arg8 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1357[var25][var26] < var23) {
                                var23 = this.field1357[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1291 = 1;
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
        this.field1529[var27] = var16;
        if (arg3 < 9 || arg3 > 9) {
            this.field1406 = null;
        }
        int var37 = var27 + 1;
        this.field1530[var27] = var17;
        int var28;
        int var29 = var28 = this.field1396[var16][var17];
        while (arg7 != var16 || arg6 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1529[var37] = var16;
                this.field1530[var37++] = var17;
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
            var29 = this.field1396[var16][var17];
        }
        if (var37 <= 0) {
            if (arg5 == 1) {
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
            int var31 = this.field1529[var37];
            int var32 = this.field1530[var37];
            if (arg5 == 0) {
                this.field1543.method228(4, 6);
                this.field1543.method229(var30 + var30 + 3);
            }
            if (arg5 == 1) {
                this.field1543.method228(4, 220);
                this.field1543.method229(var30 + var30 + 3 + 14);
            }
            if (arg5 == 2) {
                this.field1543.method228(4, 127);
                this.field1543.method229(var30 + var30 + 3);
            }
            if (super.field33[5] == 1) {
                this.field1543.method229(1);
            } else {
                this.field1543.method229(0);
            }
            this.field1543.method230(this.field1487 + var31);
            this.field1543.method230(this.field1488 + var32);
            this.field1301 = this.field1529[0];
            this.field1302 = this.field1530[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1543.method229(this.field1529[var37] - var31);
                this.field1543.method229(this.field1530[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method489(int arg0) {
        Graphics var2 = this.method11(0).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method4(this.field1316, 1);
        if (arg0 != -36217) {
            this.field1406 = null;
        }
        if (this.field1508) {
            this.field1627 = false;
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
        if (this.field1194) {
            this.field1627 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1410) {
            this.field1627 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;II)V")
    private final void method490(Packet arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            arg0.method249(0);
            int var4 = arg0.method250(-416, 8);
            if (var4 < this.field1220) {
                for (int var5 = var4; var5 < this.field1220; ++var5) {
                    this.field1454[this.field1453++] = this.field1221[var5];
                }
            }
            if (var4 > this.field1220) {
                signlink.reporterror(this.field1426 + " Too many npcs");
                throw new RuntimeException("eek");
            } else {
                this.field1220 = 0;
                for (int var6 = 0; var6 < var4; ++var6) {
                    int var7 = this.field1221[var6];
                    NpcEntity var8 = this.field1219[var7];
                    int var9 = arg0.method250(-416, 1);
                    if (var9 == 0) {
                        this.field1221[this.field1220++] = var7;
                        var8.field455 = field1591;
                    } else {
                        int var10 = arg0.method250(-416, 2);
                        if (var10 == 0) {
                            this.field1221[this.field1220++] = var7;
                            var8.field455 = field1591;
                            this.field1382[this.field1381++] = var7;
                        } else if (var10 == 1) {
                            this.field1221[this.field1220++] = var7;
                            var8.field455 = field1591;
                            int var11 = arg0.method250(-416, 3);
                            var8.method125(false, var11, (byte) 4);
                            int var12 = arg0.method250(-416, 1);
                            if (var12 == 1) {
                                this.field1382[this.field1381++] = var7;
                            }
                        } else if (var10 == 2) {
                            this.field1221[this.field1220++] = var7;
                            var8.field455 = field1591;
                            int var13 = arg0.method250(-416, 3);
                            var8.method125(true, var13, (byte) 4);
                            int var14 = arg0.method250(-416, 3);
                            var8.method125(true, var14, (byte) 4);
                            int var15 = arg0.method250(-416, 1);
                            if (var15 == 1) {
                                this.field1382[this.field1381++] = var7;
                            }
                        } else if (var10 == 3) {
                            this.field1454[this.field1453++] = var7;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public void method491(int arg0) {
        System.out.println("============");
        if (arg0 >= 0) {
            this.field1543.method229(145);
        }
        System.out.println("flame-cycle:" + this.field1363);
        if (this.field1415 != null) {
            System.out.println("Od-cycle:" + this.field1415.field847);
        }
        System.out.println("loop-cycle:" + field1591);
        System.out.println("draw-cycle:" + field1470);
        System.out.println("ptype:" + this.field1429);
        System.out.println("psize:" + this.field1428);
        if (this.field1607 != null) {
            this.field1607.method43(-610);
        }
        super.field12 = true;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        this.field1428 += arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field18 != null ? super.field18 : this;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;ZI)V")
    private final void method492(Packet arg0, boolean arg1, int arg2) {
        this.field1238 &= arg1;
        while (arg0.field712 + 21 < arg2 * 8) {
            int var4 = arg0.method250(-416, 14);
            if (var4 == 16383) {
                break;
            }
            if (this.field1219[var4] == null) {
                this.field1219[var4] = new NpcEntity();
            }
            NpcEntity var5 = this.field1219[var4];
            this.field1221[this.field1220++] = var4;
            var5.field455 = field1591;
            var5.field465 = NpcType.method344(arg0.method250(-416, 11));
            var5.field414 = var5.field465.field987;
            var5.field458 = var5.field465.field1009;
            var5.field417 = var5.field465.field991;
            var5.field418 = var5.field465.field992;
            var5.field419 = var5.field465.field993;
            var5.field420 = var5.field465.field994;
            var5.field415 = var5.field465.field990;
            int var6 = arg0.method250(-416, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg0.method250(-416, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            var5.method124(field1231.field461[0] + var7, field1231.field460[0] + var6, false, false);
            int var8 = arg0.method250(-416, 1);
            if (var8 == 1) {
                this.field1382[this.field1381++] = var4;
            }
        }
        arg0.method251(6);
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method493(int arg0) {
        if (arg0 != -2068) {
            this.field1535 = -497;
        }
        int var2 = this.field1346.method216("Choose Option", true);
        for (int var3 = 0; var3 < this.field1314; ++var3) {
            int var11 = this.field1346.method216(this.field1292[var3], true);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field1314 * 15 + 21;
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
            this.field1384 = true;
            this.field1214 = 0;
            this.field1215 = var5;
            this.field1216 = var6;
            this.field1217 = var2;
            this.field1218 = this.field1314 * 15 + 22;
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
            this.field1384 = true;
            this.field1214 = 1;
            this.field1215 = var7;
            this.field1216 = var8;
            this.field1217 = var2;
            this.field1218 = this.field1314 * 15 + 22;
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
            this.field1384 = true;
            this.field1214 = 2;
            this.field1215 = var9;
            this.field1216 = var10;
            this.field1217 = var2;
            this.field1218 = this.field1314 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1607 != null) {
                this.field1607.method38();
            }
        } catch (Exception var2) {
        }
        this.field1607 = null;
        this.method453(true);
        if (this.field1644 != null) {
            this.field1644.field972 = false;
        }
        this.field1644 = null;
        this.field1415.method281();
        this.field1415 = null;
        this.field1543 = null;
        this.field1260 = null;
        this.field1319 = null;
        this.field1504 = null;
        this.field1472 = null;
        this.field1436 = null;
        this.field1505 = null;
        this.field1506 = null;
        this.field1276 = null;
        this.field1512 = null;
        this.field1325 = null;
        this.field1233 = null;
        this.field1396 = null;
        this.field1357 = null;
        this.field1529 = null;
        this.field1530 = null;
        this.field1634 = null;
        this.field1482 = null;
        this.field1483 = null;
        this.field1484 = null;
        this.field1485 = null;
        this.field1532 = null;
        this.field1533 = null;
        this.field1534 = null;
        this.field1560 = null;
        this.field1561 = null;
        this.field1562 = null;
        this.field1563 = null;
        this.field1564 = null;
        this.field1565 = null;
        this.field1566 = null;
        this.field1567 = null;
        this.field1568 = null;
        this.field1295 = null;
        if (arg0) {
            field1341 = 227;
        }
        this.field1296 = null;
        this.field1297 = null;
        this.field1280 = null;
        this.field1281 = null;
        this.field1282 = null;
        this.field1460 = null;
        this.field1399 = null;
        this.field1400 = null;
        this.field1401 = null;
        this.field1402 = null;
        this.field1403 = null;
        this.field1226 = null;
        this.field1227 = null;
        this.field1228 = null;
        this.field1229 = null;
        this.field1230 = null;
        this.field1300 = null;
        this.field1353 = null;
        this.field1559 = null;
        this.field1622 = null;
        this.field1570 = null;
        this.field1571 = null;
        this.field1572 = null;
        this.field1573 = null;
        this.field1473 = null;
        this.field1600 = null;
        this.field1586 = null;
        this.field1378 = null;
        this.field1380 = null;
        this.field1382 = null;
        this.field1383 = null;
        this.field1454 = null;
        this.field1219 = null;
        this.field1221 = null;
        this.field1406 = null;
        this.field1636 = null;
        this.field1451 = null;
        this.field1423 = null;
        this.field1203 = null;
        this.field1204 = null;
        this.field1205 = null;
        this.field1206 = null;
        this.field1292 = null;
        this.field1211 = null;
        this.field1208 = null;
        this.field1209 = null;
        this.field1202 = null;
        this.field1303 = null;
        this.field1257 = null;
        this.field1521 = null;
        this.field1553 = null;
        this.field1547 = null;
        this.field1548 = null;
        this.field1544 = null;
        this.field1545 = null;
        this.field1546 = null;
        this.field1549 = null;
        this.field1550 = null;
        this.field1551 = null;
        this.field1552 = null;
        this.method545(9);
        LocType.method333(927);
        NpcType.method343(927);
        ObjType.method349(927);
        FloType.field1077 = null;
        IdkType.field1091 = null;
        Component.field70 = null;
        UnkType.field1098 = null;
        SeqType.field1112 = null;
        SpotAnimType.field1132 = null;
        SpotAnimType.field1144 = null;
        VarpType.field1154 = null;
        super.field16 = null;
        PlayerEntity.field490 = null;
        Pix3D.method177(927);
        World3D.method63(927);
        Model.method135(927);
        AnimFrame.method60(927);
        System.gc();
        if (Linkable.field377) {
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method494(int arg0, int arg1) {
        if (arg1 == -40822) {
            if (!field1242) {
                if (Pix3D.field655[17] >= arg0) {
                    Pix8 var3 = Pix3D.field649[17];
                    int var4 = var3.field677 * var3.field676 - 1;
                    int var5 = this.field1464 * var3.field676 * 2;
                    byte[] var6 = var3.field674;
                    byte[] var7 = this.field1634;
                    for (int var8 = 0; var8 <= var4; ++var8) {
                        var7[var8] = var6[var8 - var5 & var4];
                    }
                    var3.field674 = var7;
                    this.field1634 = var6;
                    Pix3D.method184(3, 17);
                }
                if (Pix3D.field655[24] >= arg0) {
                    Pix8 var9 = Pix3D.field649[24];
                    int var10 = var9.field677 * var9.field676 - 1;
                    int var11 = this.field1464 * var9.field676 * 2;
                    byte[] var12 = var9.field674;
                    byte[] var13 = this.field1634;
                    for (int var14 = 0; var14 <= var10; ++var14) {
                        var13[var14] = var12[var14 - var11 & var10];
                    }
                    var9.field674 = var13;
                    this.field1634 = var12;
                    Pix3D.method184(3, 24);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method495(int arg0) {
        int var2 = this.field1306 * 128 + 64;
        int var3 = this.field1307 * 128 + 64;
        int var4 = this.method470(var3, this.field1277, var2, 9803) - this.field1308;
        if (this.field1266 < var2) {
            this.field1266 += (var2 - this.field1266) * this.field1310 / 1000 + this.field1309;
            if (this.field1266 > var2) {
                this.field1266 = var2;
            }
        }
        if (this.field1266 > var2) {
            this.field1266 -= (this.field1266 - var2) * this.field1310 / 1000 + this.field1309;
            if (this.field1266 < var2) {
                this.field1266 = var2;
            }
        }
        if (this.field1267 < var4) {
            this.field1267 += (var4 - this.field1267) * this.field1310 / 1000 + this.field1309;
            if (this.field1267 > var4) {
                this.field1267 = var4;
            }
        }
        if (this.field1267 > var4) {
            this.field1267 -= (this.field1267 - var4) * this.field1310 / 1000 + this.field1309;
            if (this.field1267 < var4) {
                this.field1267 = var4;
            }
        }
        if (this.field1268 < var3) {
            this.field1268 += (var3 - this.field1268) * this.field1310 / 1000 + this.field1309;
            if (this.field1268 > var3) {
                this.field1268 = var3;
            }
        }
        if (this.field1268 > var3) {
            this.field1268 -= (this.field1268 - var3) * this.field1310 / 1000 + this.field1309;
            if (this.field1268 < var3) {
                this.field1268 = var3;
            }
        }
        int var5 = this.field1577 * 128 + 64;
        int var6 = this.field1578 * 128 + 64;
        int var7 = this.method470(var6, this.field1277, var5, 9803) - this.field1579;
        if (arg0 == -21513) {
            int var8 = var5 - this.field1266;
            int var9 = var7 - this.field1267;
            int var10 = var6 - this.field1268;
            int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
            int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
            int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
            if (var12 < 128) {
                var12 = 128;
            }
            if (var12 > 383) {
                var12 = 383;
            }
            if (this.field1269 < var12) {
                this.field1269 += (var12 - this.field1269) * this.field1581 / 1000 + this.field1580;
                if (this.field1269 > var12) {
                    this.field1269 = var12;
                }
            }
            if (this.field1269 > var12) {
                this.field1269 -= (this.field1269 - var12) * this.field1581 / 1000 + this.field1580;
                if (this.field1269 < var12) {
                    this.field1269 = var12;
                }
            }
            int var14 = var13 - this.field1270;
            if (var14 > 1024) {
                var14 -= 2048;
            }
            if (var14 < -1024) {
                var14 += 2048;
            }
            if (var14 > 0) {
                this.field1270 += this.field1581 * var14 / 1000 + this.field1580;
                this.field1270 &= 2047;
            }
            if (var14 < 0) {
                this.field1270 -= -var14 * this.field1581 / 1000 + this.field1580;
                this.field1270 &= 2047;
            }
            int var15 = var13 - this.field1270;
            if (var15 > 1024) {
                var15 -= 2048;
            }
            if (var15 < -1024) {
                var15 += 2048;
            }
            if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
                this.field1270 = var13;
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method496(int arg0) {
        if (this.field1195 == 0 && this.field1387 == 0) {
            this.field1292[this.field1314] = "Walk here";
            this.field1205[this.field1314] = 718;
            this.field1203[this.field1314] = super.field23;
            this.field1204[this.field1314] = super.field24;
            ++this.field1314;
        }
        int var2 = -1;
        if (arg0 < 1 || arg0 > 1) {
            this.method6();
        }
        for (int var3 = 0; var3 < Model.field600; ++var3) {
            int var4 = Model.field601[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1325.method94(this.field1277, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method334(var8);
                    if (this.field1195 == 1) {
                        this.field1292[this.field1314] = "Use " + this.field1199 + " with @cya@" + var9.field937;
                        this.field1205[this.field1314] = 810;
                        this.field1206[this.field1314] = var4;
                        this.field1203[this.field1314] = var5;
                        this.field1204[this.field1314] = var6;
                        ++this.field1314;
                    } else if (this.field1387 == 1) {
                        if ((this.field1389 & 4) == 4) {
                            this.field1292[this.field1314] = this.field1390 + " @cya@" + var9.field937;
                            this.field1205[this.field1314] = 899;
                            this.field1206[this.field1314] = var4;
                            this.field1203[this.field1314] = var5;
                            this.field1204[this.field1314] = var6;
                            ++this.field1314;
                        }
                    } else {
                        if (var9.field953 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field953[var10] != null) {
                                    this.field1292[this.field1314] = var9.field953[var10] + " @cya@" + var9.field937;
                                    if (var10 == 0) {
                                        this.field1205[this.field1314] = 625;
                                    }
                                    if (var10 == 1) {
                                        this.field1205[this.field1314] = 721;
                                    }
                                    if (var10 == 2) {
                                        this.field1205[this.field1314] = 743;
                                    }
                                    if (var10 == 3) {
                                        this.field1205[this.field1314] = 357;
                                    }
                                    if (var10 == 4) {
                                        this.field1205[this.field1314] = 1071;
                                    }
                                    this.field1206[this.field1314] = var4;
                                    this.field1203[this.field1314] = var5;
                                    this.field1204[this.field1314] = var6;
                                    ++this.field1314;
                                }
                            }
                        }
                        this.field1292[this.field1314] = "Examine @cya@" + var9.field937;
                        this.field1205[this.field1314] = 1381;
                        this.field1206[this.field1314] = var4;
                        this.field1203[this.field1314] = var5;
                        this.field1204[this.field1314] = var6;
                        ++this.field1314;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1219[var8];
                    if (var11.field465.field987 == 1 && (var11.field410 & 127) == 64 && (var11.field411 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1220; ++var12) {
                            NpcEntity var13 = this.field1219[this.field1221[var12]];
                            if (var13 != null && var11 != var13 && var13.field465.field987 == 1 && var11.field410 == var13.field410 && var11.field411 == var13.field411) {
                                this.method483(true, var5, var13.field465, this.field1221[var12], var6);
                            }
                        }
                    }
                    this.method483(true, var5, var11.field465, var8, var6);
                }
                if (var7 == 0) {
                    PlayerEntity var14 = this.field1378[var8];
                    if ((var14.field410 & 127) == 64 && (var14.field411 & 127) == 64) {
                        for (int var15 = 0; var15 < this.field1220; ++var15) {
                            NpcEntity var18 = this.field1219[this.field1221[var15]];
                            if (var18 != null && var18.field465.field987 == 1 && var14.field410 == var18.field410 && var14.field411 == var18.field411) {
                                this.method483(true, var5, var18.field465, this.field1221[var15], var6);
                            }
                        }
                        for (int var16 = 0; var16 < this.field1379; ++var16) {
                            PlayerEntity var17 = this.field1378[this.field1380[var16]];
                            if (var17 != null && var14 != var17 && var14.field410 == var17.field410 && var14.field411 == var17.field411) {
                                this.method439(false, var6, this.field1380[var16], var5, var17);
                            }
                        }
                    }
                    this.method439(false, var6, var8, var5, var14);
                }
                if (var7 == 3) {
                    LinkList var19 = this.field1406[this.field1277][var5][var6];
                    if (var19 != null) {
                        for (ObjStackEntity var20 = (ObjStackEntity) var19.method259((byte) 2); var20 != null; var20 = (ObjStackEntity) var19.method261(0)) {
                            ObjType var21 = ObjType.method350(var20.field501);
                            if (this.field1195 == 1) {
                                this.field1292[this.field1314] = "Use " + this.field1199 + " with @lre@" + var21.field1024;
                                this.field1205[this.field1314] = 111;
                                this.field1206[this.field1314] = var20.field501;
                                this.field1203[this.field1314] = var5;
                                this.field1204[this.field1314] = var6;
                                ++this.field1314;
                            } else if (this.field1387 == 1) {
                                if ((this.field1389 & 1) == 1) {
                                    this.field1292[this.field1314] = this.field1390 + " @lre@" + var21.field1024;
                                    this.field1205[this.field1314] = 370;
                                    this.field1206[this.field1314] = var20.field501;
                                    this.field1203[this.field1314] = var5;
                                    this.field1204[this.field1314] = var6;
                                    ++this.field1314;
                                }
                            } else {
                                for (int var22 = 4; var22 >= 0; --var22) {
                                    if (var21.field1038 != null && var21.field1038[var22] != null) {
                                        this.field1292[this.field1314] = var21.field1038[var22] + " @lre@" + var21.field1024;
                                        if (var22 == 0) {
                                            this.field1205[this.field1314] = 139;
                                        }
                                        if (var22 == 1) {
                                            this.field1205[this.field1314] = 778;
                                        }
                                        if (var22 == 2) {
                                            this.field1205[this.field1314] = 617;
                                        }
                                        if (var22 == 3) {
                                            this.field1205[this.field1314] = 224;
                                        }
                                        if (var22 == 4) {
                                            this.field1205[this.field1314] = 662;
                                        }
                                        this.field1206[this.field1314] = var20.field501;
                                        this.field1203[this.field1314] = var5;
                                        this.field1204[this.field1314] = var6;
                                        ++this.field1314;
                                    } else if (var22 == 2) {
                                        this.field1292[this.field1314] = "Take @lre@" + var21.field1024;
                                        this.field1205[this.field1314] = 617;
                                        this.field1206[this.field1314] = var20.field501;
                                        this.field1203[this.field1314] = var5;
                                        this.field1204[this.field1314] = var6;
                                        ++this.field1314;
                                    }
                                }
                                this.field1292[this.field1314] = "Examine @lre@" + var21.field1024;
                                this.field1205[this.field1314] = 1152;
                                this.field1206[this.field1314] = var20.field501;
                                this.field1203[this.field1314] = var5;
                                this.field1204[this.field1314] = var6;
                                ++this.field1314;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLmb;I)V")
    private final void method497(boolean arg0, Packet arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1381; ++var4) {
            int var5 = this.field1382[var4];
            PlayerEntity var6 = this.field1378[var5];
            int var7 = arg1.method239();
            if ((var7 & 128) == 128) {
                var7 += arg1.method239() << 8;
            }
            this.method517(var7, arg1, var5, -98, var6);
        }
        if (!arg0) {
            this.field1405 = -203;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method498(String arg0) throws IOException {
        return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method499(int arg0) {
        int var2 = 4 / arg0;
        if (this.field1458 == 2) {
            this.method487((this.field1476 - this.field1488 << 7) + this.field1479, false, (this.field1475 - this.field1487 << 7) + this.field1478, this.field1477 * 2);
            if (this.field1298 > -1 && field1591 % 20 < 10) {
                this.field1559[2].method199(1, this.field1298 - 12, this.field1299 - 28);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;Z)V")
    public final void method500(Component arg0, boolean arg1) {
        int var3 = arg0.field79;
        this.field1238 &= arg1;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field1609;
                if (this.field1610 != 2) {
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
                    if (this.field1553[var3] == 0) {
                        arg0.field111 = "@red@Offline";
                    } else if (this.field1553[var3] == field1239) {
                        arg0.field111 = "@gre@World-" + (this.field1553[var3] - 9);
                    } else {
                        arg0.field111 = "@yel@World-" + (this.field1553[var3] - 9);
                    }
                    arg0.field78 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field1609;
                if (this.field1610 != 2) {
                    var6 = 0;
                }
                arg0.field89 = var6 * 15 + 20;
                if (arg0.field89 <= arg0.field81) {
                    arg0.field89 = arg0.field81 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 >= this.field1646) {
                    arg0.field111 = "";
                    arg0.field78 = 0;
                } else {
                    arg0.field111 = JString.method314(true, JString.method311(this.field1515[var3], true));
                    arg0.field78 = 1;
                }
            } else if (var3 == 503) {
                arg0.field89 = this.field1646 * 15 + 20;
                if (arg0.field89 <= arg0.field81) {
                    arg0.field89 = arg0.field81 + 1;
                }
            } else if (var3 == 327) {
                arg0.field126 = 150;
                arg0.field127 = (int) (Math.sin((double) field1591 / 40.0D) * 256.0D) & 2047;
                if (this.field1438) {
                    for (int var7 = 0; var7 < 7; ++var7) {
                        int var14 = this.field1327[var7];
                        if (var14 >= 0 && !IdkType.field1091[var14].method379(false)) {
                            return;
                        }
                    }
                    this.field1438 = false;
                    Model[] var8 = new Model[7];
                    int var9 = 0;
                    for (int var10 = 0; var10 < 7; ++var10) {
                        int var13 = this.field1327[var10];
                        if (var13 >= 0) {
                            var8[var9++] = IdkType.field1091[var13].method380(true);
                        }
                    }
                    Model var11 = new Model(var8, var9, -928);
                    for (int var12 = 0; var12 < 5; ++var12) {
                        if (this.field1514[var12] != 0) {
                            var11.method153(field1538[var12][0], field1538[var12][this.field1514[var12]]);
                            if (var12 == 1) {
                                var11.method153(field1271[0], field1271[this.field1514[var12]]);
                            }
                        }
                    }
                    var11.method146((byte) 112);
                    var11.method147(true, SeqType.field1112[field1231.field415].field1114[0]);
                    var11.method156(64, 850, -30, -50, -30, true);
                    arg0.field119 = 5;
                    arg0.field120 = 0;
                    Component.method36(this.field1288, 0, var11, 5);
                }
            } else if (var3 == 324) {
                if (this.field1262 == null) {
                    this.field1262 = arg0.field117;
                    this.field1263 = arg0.field118;
                }
                if (this.field1494) {
                    arg0.field117 = this.field1263;
                } else {
                    arg0.field117 = this.field1262;
                }
            } else if (var3 == 325) {
                if (this.field1262 == null) {
                    this.field1262 = arg0.field117;
                    this.field1263 = arg0.field118;
                }
                if (this.field1494) {
                    arg0.field117 = this.field1262;
                } else {
                    arg0.field117 = this.field1263;
                }
            } else if (var3 == 600) {
                arg0.field111 = this.field1444;
                if (field1591 % 20 < 10) {
                    arg0.field111 = arg0.field111 + "|";
                } else {
                    arg0.field111 = arg0.field111 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field1510 >= 1) {
                        if (this.field1623) {
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
                    if (this.field1304 != 0) {
                        String var15;
                        if (this.field1313 == 0) {
                            var15 = "earlier today";
                        } else if (this.field1313 == 1) {
                            var15 = "yesterday";
                        } else {
                            var15 = this.field1313 + " days ago";
                        }
                        arg0.field111 = "You last logged in " + var15 + " from: " + signlink.dns;
                    } else {
                        arg0.field111 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field1324 == 0) {
                        arg0.field111 = "0 unread messages";
                        arg0.field113 = 16776960;
                    }
                    if (this.field1324 == 1) {
                        arg0.field111 = "1 unread message";
                        arg0.field113 = 65280;
                    }
                    if (this.field1324 > 1) {
                        arg0.field111 = this.field1324 + " unread messages";
                        arg0.field113 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field1631 == 201) {
                        if (this.field1526 == 1) {
                            arg0.field111 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg0.field111 = "";
                        }
                    } else if (this.field1631 == 200) {
                        arg0.field111 = "You have not yet set any password recovery questions.";
                    } else {
                        String var16;
                        if (this.field1631 == 0) {
                            var16 = "Earlier today";
                        } else if (this.field1631 == 1) {
                            var16 = "Yesterday";
                        } else {
                            var16 = this.field1631 + " days ago";
                        }
                        arg0.field111 = var16 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field1631 == 201) {
                        if (this.field1526 == 1) {
                            arg0.field111 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg0.field111 = "";
                        }
                    } else if (this.field1631 == 200) {
                        arg0.field111 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg0.field111 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field1631 == 201) {
                        if (this.field1526 == 1) {
                            arg0.field111 = "@whi@this world but member benefits are unavailabe whilst here.";
                        } else {
                            arg0.field111 = "";
                        }
                    } else if (this.field1631 == 200) {
                        arg0.field111 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg0.field111 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var3 == 1 && this.field1610 == 0) {
            arg0.field111 = "Loading friend list";
            arg0.field78 = 0;
        } else if (var3 == 1 && this.field1610 == 1) {
            arg0.field111 = "Connecting to friendserver";
            arg0.field78 = 0;
        } else if (var3 == 2 && this.field1610 != 2) {
            arg0.field111 = "Please wait...";
            arg0.field78 = 0;
        } else {
            int var4 = this.field1609;
            if (this.field1610 != 2) {
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
                arg0.field111 = this.field1257[var3];
                arg0.field78 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;I)V")
    public final void method501(int arg0, Packet arg1, int arg2) {
        if (arg2 <= 0) {
            arg0 = arg1.method239();
        }
        if (arg0 != 70 && arg0 != 88) {
            if (arg0 == 30) {
                int var4 = arg1.method239();
                int var5 = (var4 >> 4 & 7) + this.field1603;
                int var6 = (var4 & 7) + this.field1604;
                int var7 = arg1.method239();
                int var8 = var7 >> 2;
                int var9 = var7 & 3;
                int var10 = this.field1503[var8];
                int var11 = arg1.method241();
                if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                    int var12 = this.field1276[this.field1277][var5][var6];
                    int var13 = this.field1276[this.field1277][var5 + 1][var6];
                    int var14 = this.field1276[this.field1277][var5 + 1][var6 + 1];
                    int var15 = this.field1276[this.field1277][var5][var6 + 1];
                    if (var10 == 0) {
                        Wall var16 = this.field1325.method86(this.field1277, var5, var6, -261);
                        if (var16 != null) {
                            int var17 = var16.field287 >> 14 & 32767;
                            if (var8 == 2) {
                                var16.field285 = new LocEntity(2, var9 + 4, var12, var17, 10550, var14, var15, false, var11, var13);
                                var16.field286 = new LocEntity(2, var9 + 1 & 3, var12, var17, 10550, var14, var15, false, var11, var13);
                            } else {
                                var16.field285 = new LocEntity(var8, var9, var12, var17, 10550, var14, var15, false, var11, var13);
                            }
                        }
                    }
                    if (var10 == 1) {
                        Decor var18 = this.field1325.method87((byte) 17, var5, var6, this.field1277);
                        if (var18 != null) {
                            var18.field177 = new LocEntity(4, 0, var12, var18.field178 >> 14 & 32767, 10550, var14, var15, false, var11, var13);
                        }
                    }
                    if (var10 == 2) {
                        Location var19 = this.field1325.method88((byte) 2, var5, var6, this.field1277);
                        if (var8 == 11) {
                            var8 = 10;
                        }
                        if (var19 != null) {
                            var19.field270 = new LocEntity(var8, var9, var12, var19.field278 >> 14 & 32767, 10550, var14, var15, false, var11, var13);
                        }
                    }
                    if (var10 == 3) {
                        GroundDecor var20 = this.field1325.method89(this.field1277, true, var5, var6);
                        if (var20 != null) {
                            var20.field209 = new LocEntity(22, var9, var12, var20.field210 >> 14 & 32767, 10550, var14, var15, false, var11, var13);
                        }
                    }
                }
            } else if (arg0 == 120) {
                int var21 = arg1.method239();
                int var22 = (var21 >> 4 & 7) + this.field1603;
                int var23 = (var21 & 7) + this.field1604;
                int var24 = arg1.method241();
                int var25 = arg1.method241();
                if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                    ObjStackEntity var26 = new ObjStackEntity();
                    var26.field501 = var24;
                    var26.field502 = var25;
                    if (this.field1406[this.field1277][var22][var23] == null) {
                        this.field1406[this.field1277][var22][var23] = new LinkList(false);
                    }
                    this.field1406[this.field1277][var22][var23].method255(var26);
                    this.method529(var22, var23);
                }
            } else if (arg0 == 115) {
                int var27 = arg1.method239();
                int var28 = (var27 >> 4 & 7) + this.field1603;
                int var29 = (var27 & 7) + this.field1604;
                int var30 = arg1.method241();
                if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                    LinkList var31 = this.field1406[this.field1277][var28][var29];
                    if (var31 != null) {
                        for (ObjStackEntity var32 = (ObjStackEntity) var31.method258(); var32 != null; var32 = (ObjStackEntity) var31.method260(6)) {
                            if ((var30 & 32767) == var32.field501) {
                                var32.method120();
                                break;
                            }
                        }
                        if (var31.method258() == null) {
                            this.field1406[this.field1277][var28][var29] = null;
                        }
                        this.method529(var28, var29);
                    }
                }
            } else if (arg0 == 37) {
                int var33 = arg1.method239();
                int var34 = (var33 >> 4 & 7) + this.field1603;
                int var35 = (var33 & 7) + this.field1604;
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
                    ProjectileEntity var50 = new ProjectileEntity(this.field1277, var39, field1591 + var42, field1591 + var43, this.method470(var47, this.field1277, var46, 9803) - var40, var41, var46, var44, var38, 0, var47, var45);
                    var50.method133(var49, this.method470(var49, this.field1277, var48, 9803) - var41, (byte) 0, var48, field1591 + var42);
                    this.field1451.method255(var50);
                }
            } else if (arg0 == 114) {
                int var51 = arg1.method239();
                int var52 = (var51 >> 4 & 7) + this.field1603;
                int var53 = (var51 & 7) + this.field1604;
                int var54 = arg1.method241();
                int var55 = arg1.method239();
                int var56 = arg1.method241();
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                    int var57 = var52 * 128 + 64;
                    int var58 = var53 * 128 + 64;
                    SpotAnimEntity var59 = new SpotAnimEntity(this.method470(var58, this.field1277, var57, 9803) - var55, field1591, var58, this.field1277, var57, var54, 169, var56);
                    this.field1423.method255(var59);
                }
            } else if (arg0 == 8) {
                int var60 = arg1.method239();
                int var61 = (var60 >> 4 & 7) + this.field1603;
                int var62 = (var60 & 7) + this.field1604;
                int var63 = arg1.method241();
                int var64 = arg1.method241();
                int var65 = arg1.method241();
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && this.field1542 != var65) {
                    ObjStackEntity var66 = new ObjStackEntity();
                    var66.field501 = var63;
                    var66.field502 = var64;
                    if (this.field1406[this.field1277][var61][var62] == null) {
                        this.field1406[this.field1277][var61][var62] = new LinkList(false);
                    }
                    this.field1406[this.field1277][var61][var62].method255(var66);
                    this.method529(var61, var62);
                }
            } else {
                if (arg0 == 218) {
                    int var67 = arg1.method239();
                    int var68 = (var67 >> 4 & 7) + this.field1603;
                    int var69 = (var67 & 7) + this.field1604;
                    int var70 = arg1.method239();
                    int var71 = var70 >> 2;
                    int var72 = var70 & 3;
                    int var73 = this.field1503[var71];
                    int var74 = arg1.method241();
                    int var75 = arg1.method241();
                    int var76 = arg1.method241();
                    int var77 = arg1.method241();
                    byte var78 = arg1.method240();
                    byte var79 = arg1.method240();
                    byte var80 = arg1.method240();
                    byte var81 = arg1.method240();
                    PlayerEntity var82;
                    if (this.field1542 == var77) {
                        var82 = field1231;
                    } else {
                        var82 = this.field1378[var77];
                    }
                    if (var82 != null) {
                        LocType var83 = LocType.method334(var74);
                        int var84 = this.field1276[this.field1277][var68][var69];
                        int var85 = this.field1276[this.field1277][var68 + 1][var69];
                        int var86 = this.field1276[this.field1277][var68 + 1][var69 + 1];
                        int var87 = this.field1276[this.field1277][var68][var69 + 1];
                        Model var88 = var83.method340(var71, var72, var84, var85, var86, var87, -1);
                        if (var88 != null) {
                            this.method542(this.field1277, var68, var75 + 1, (byte) 8, -1, 0, var73, var76 + 1, var69, 0);
                            var82.field477 = field1591 + var75;
                            var82.field478 = field1591 + var76;
                            var82.field482 = var88;
                            int var89 = var83.field941;
                            int var90 = var83.field942;
                            if (var72 == 1 || var72 == 3) {
                                var89 = var83.field942;
                                var90 = var83.field941;
                            }
                            var82.field479 = var68 * 128 + var89 * 64;
                            var82.field481 = var69 * 128 + var90 * 64;
                            var82.field480 = this.method470(var82.field481, this.field1277, var82.field479, 9803);
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
                    int var93 = arg1.method239();
                    int var94 = (var93 >> 4 & 7) + this.field1603;
                    int var95 = (var93 & 7) + this.field1604;
                    int var96 = arg1.method241();
                    int var97 = arg1.method241();
                    int var98 = arg1.method241();
                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                        LinkList var99 = this.field1406[this.field1277][var94][var95];
                        if (var99 != null) {
                            for (ObjStackEntity var100 = (ObjStackEntity) var99.method258(); var100 != null; var100 = (ObjStackEntity) var99.method260(6)) {
                                if ((var96 & 32767) == var100.field501 && var100.field502 == var97) {
                                    var100.field502 = var98;
                                    break;
                                }
                            }
                            this.method529(var94, var95);
                        }
                    }
                }
            }
        } else {
            int var101 = arg1.method239();
            int var102 = (var101 >> 4 & 7) + this.field1603;
            int var103 = (var101 & 7) + this.field1604;
            int var104 = arg1.method239();
            int var105 = var104 >> 2;
            int var106 = var104 & 3;
            int var107 = this.field1503[var105];
            int var108;
            if (arg0 == 88) {
                var108 = -1;
            } else {
                var108 = arg1.method241();
            }
            if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                this.method542(this.field1277, var102, 0, (byte) 8, var108, var105, var107, -1, var103, var106);
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method502(byte arg0) {
        if (arg0 == 8) {
            boolean var2 = false;
        } else {
            this.field1643 = !this.field1643;
        }
        if (super.field29 == 1) {
            int var3 = super.field30 - 25 - 550;
            int var4 = super.field31 - 5 - 4;
            if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                var3 -= 73;
                var4 -= 75;
                int var5 = this.field1278 + this.field1253 & 2047;
                int var6 = Pix3D.field645[var5];
                int var7 = Pix3D.field646[var5];
                int var8 = (this.field1348 + 256) * var6 >> 8;
                int var9 = (this.field1348 + 256) * var7 >> 8;
                int var10 = var3 * var9 + var4 * var8 >> 11;
                int var11 = var4 * var9 - var3 * var8 >> 11;
                int var12 = field1231.field410 + var10 >> 7;
                int var13 = field1231.field411 - var11 >> 7;
                boolean var14 = this.method488(0, 0, 0, 9, var12, 1, field1231.field461[0], field1231.field460[0], var13, true, 0, 0);
                if (var14) {
                    this.field1543.method229(var3);
                    this.field1543.method229(var4);
                    this.field1543.method230(this.field1253);
                    this.field1543.method229(57);
                    this.field1543.method229(this.field1278);
                    this.field1543.method229(this.field1348);
                    this.field1543.method229(89);
                    this.field1543.method230(field1231.field410);
                    this.field1543.method230(field1231.field411);
                    this.field1543.method229(this.field1291);
                    this.field1543.method229(63);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILmb;I)V")
    private final void method503(int arg0, Packet arg1, int arg2) {
        this.field1453 = 0;
        this.field1381 = 0;
        this.method490(arg1, arg2, 0);
        this.method492(arg1, true, arg2);
        this.method476(arg2, this.field1628, arg1);
        for (int var4 = 0; var4 < this.field1453; ++var4) {
            int var6 = this.field1454[var4];
            if (field1591 != this.field1219[var6].field455) {
                this.field1219[var6].field465 = null;
                this.field1219[var6] = null;
            }
        }
        if (arg0 == 41268) {
            if (arg1.field711 != arg2) {
                signlink.reporterror(this.field1426 + " size mismatch in getnpcpos - pos:" + arg1.field711 + " psize:" + arg2);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field1220; ++var5) {
                    if (this.field1219[this.field1221[var5]] == null) {
                        signlink.reporterror(this.field1426 + " null entry in npc list - pos:" + var5 + " size:" + this.field1220);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JB)V")
    public final void method504(long arg0, byte arg1) {
        if (arg0 != 0L) {
            if (this.field1609 >= 100 && this.field1492 != 1) {
                this.method515("", 0, this.field1599, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else if (this.field1609 >= 200) {
                this.method515("", 0, this.field1599, "Your friendlist is full. Max of 100 for free users, and 200 for members");
            } else {
                String var4 = JString.method314(true, JString.method311(arg0, true));
                for (int var5 = 0; var5 < this.field1609; ++var5) {
                    if (this.field1521[var5] == arg0) {
                        this.method515("", 0, this.field1599, var4 + " is already on your friend list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1646; ++var6) {
                    if (this.field1515[var6] == arg0) {
                        this.method515("", 0, this.field1599, "Please remove " + var4 + " from your ignore list first");
                        return;
                    }
                }
                if (!var4.equals(field1231.field468)) {
                    this.field1257[this.field1609] = var4;
                    this.field1521[this.field1609] = arg0;
                    this.field1553[this.field1609] = 0;
                    if (arg1 != -71) {
                        for (int var7 = 1; var7 > 0; ++var7) {
                        }
                    }
                    ++this.field1609;
                    this.field1200 = true;
                    this.field1543.method228(4, 9);
                    this.field1543.method235(854, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BII)Z")
    public final boolean method505(byte[] arg0, int arg1, int arg2) {
        this.field1428 += arg2;
        return arg0 == null ? true : signlink.wavesave(arg0, arg1);
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method506(int arg0) {
        if (arg0 >= 0) {
            this.field1429 = -1;
        }
        for (int var2 = 0; var2 < this.field1220; ++var2) {
            int var3 = this.field1221[var2];
            NpcEntity var4 = this.field1219[var3];
            if (var4 != null) {
                this.method507((byte) 1, var4, var4.field465.field987);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLz;I)V")
    public final void method507(byte arg0, PathingEntity arg1, int arg2) {
        if (arg1.field410 < 128 || arg1.field411 < 128 || arg1.field410 >= 13184 || arg1.field411 >= 13184) {
            arg1.field438 = -1;
            arg1.field443 = -1;
            arg1.field452 = 0;
            arg1.field453 = 0;
            arg1.field410 = arg1.field460[0] * 128 + arg1.field414 * 64;
            arg1.field411 = arg1.field461[0] * 128 + arg1.field414 * 64;
            arg1.method126(false);
        }
        if (field1231 == arg1 && (arg1.field410 < 1536 || arg1.field411 < 1536 || arg1.field410 >= 11776 || arg1.field411 >= 11776)) {
            arg1.field438 = -1;
            arg1.field443 = -1;
            arg1.field452 = 0;
            arg1.field453 = 0;
            arg1.field410 = arg1.field460[0] * 128 + arg1.field414 * 64;
            arg1.field411 = arg1.field461[0] * 128 + arg1.field414 * 64;
            arg1.method126(false);
        }
        if (arg1.field452 > field1591) {
            this.method508(arg1, (byte) 6);
        } else if (arg1.field453 >= field1591) {
            this.method509((byte) 5, arg1);
        } else {
            this.method510(arg1, 523);
        }
        this.method511(arg1, 0);
        if (arg0 != 1) {
            this.field1429 = -1;
        }
        this.method512(false, arg1);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;B)V")
    public final void method508(PathingEntity arg0, byte arg1) {
        if (arg1 == 6) {
            boolean var3 = false;
        } else {
            field1341 = 99;
        }
        int var4 = arg0.field452 - field1591;
        int var5 = arg0.field448 * 128 + arg0.field414 * 64;
        int var6 = arg0.field450 * 128 + arg0.field414 * 64;
        arg0.field410 += (var5 - arg0.field410) / var4;
        arg0.field411 += (var6 - arg0.field411) / var4;
        arg0.field463 = 0;
        if (arg0.field454 == 0) {
            arg0.field457 = 1024;
        }
        if (arg0.field454 == 1) {
            arg0.field457 = 1536;
        }
        if (arg0.field454 == 2) {
            arg0.field457 = 0;
        }
        if (arg0.field454 == 3) {
            arg0.field457 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLz;)V")
    public final void method509(byte arg0, PathingEntity arg1) {
        if (field1591 == arg1.field453 || arg1.field438 == -1 || arg1.field441 != 0 || arg1.field440 + 1 > SeqType.field1112[arg1.field438].method384((byte) -103, arg1.field439)) {
            int var3 = arg1.field453 - arg1.field452;
            int var4 = field1591 - arg1.field452;
            int var5 = arg1.field448 * 128 + arg1.field414 * 64;
            int var6 = arg1.field450 * 128 + arg1.field414 * 64;
            int var7 = arg1.field449 * 128 + arg1.field414 * 64;
            int var8 = arg1.field451 * 128 + arg1.field414 * 64;
            arg1.field410 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field411 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field463 = 0;
        if (arg0 != 5) {
            field1321 = !field1321;
        }
        if (arg1.field454 == 0) {
            arg1.field457 = 1024;
        }
        if (arg1.field454 == 1) {
            arg1.field457 = 1536;
        }
        if (arg1.field454 == 2) {
            arg1.field457 = 0;
        }
        if (arg1.field454 == 3) {
            arg1.field457 = 512;
        }
        arg1.field412 = arg1.field457;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;I)V")
    public final void method510(PathingEntity arg0, int arg1) {
        arg0.field435 = arg0.field415;
        if (arg1 <= 0) {
            this.field1536 = !this.field1536;
        }
        if (arg0.field459 == 0) {
            arg0.field463 = 0;
        } else {
            if (arg0.field438 != -1 && arg0.field441 == 0) {
                SeqType var3 = SeqType.field1112[arg0.field438];
                if (arg0.field464 > 0 && var3.field1124 == 0) {
                    ++arg0.field463;
                    return;
                }
                if (arg0.field464 <= 0 && var3.field1125 == 0) {
                    ++arg0.field463;
                    return;
                }
            }
            int var4 = arg0.field410;
            int var5 = arg0.field411;
            int var6 = arg0.field460[arg0.field459 - 1] * 128 + arg0.field414 * 64;
            int var7 = arg0.field461[arg0.field459 - 1] * 128 + arg0.field414 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field457 = 1280;
                    } else if (var5 > var7) {
                        arg0.field457 = 1792;
                    } else {
                        arg0.field457 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field457 = 768;
                    } else if (var5 > var7) {
                        arg0.field457 = 256;
                    } else {
                        arg0.field457 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field457 = 1024;
                } else {
                    arg0.field457 = 0;
                }
                int var8 = arg0.field457 - arg0.field412 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field418;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field417;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field420;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field419;
                }
                if (var9 == -1) {
                    var9 = arg0.field417;
                }
                arg0.field435 = var9;
                int var10 = 4;
                if (arg0.field457 != arg0.field412 && arg0.field432 == -1 && arg0.field458 != 0) {
                    var10 = 2;
                }
                if (arg0.field459 > 2) {
                    var10 = 6;
                }
                if (arg0.field459 > 3) {
                    var10 = 8;
                }
                if (arg0.field463 > 0 && arg0.field459 > 1) {
                    var10 = 8;
                    --arg0.field463;
                }
                if (arg0.field462[arg0.field459 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field435 == arg0.field417 && arg0.field421 != -1) {
                    arg0.field435 = arg0.field421;
                }
                if (var4 < var6) {
                    arg0.field410 += var10;
                    if (arg0.field410 > var6) {
                        arg0.field410 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field410 -= var10;
                    if (arg0.field410 < var6) {
                        arg0.field410 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field411 += var10;
                    if (arg0.field411 > var7) {
                        arg0.field411 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field411 -= var10;
                    if (arg0.field411 < var7) {
                        arg0.field411 = var7;
                    }
                }
                if (arg0.field410 == var6 && arg0.field411 == var7) {
                    --arg0.field459;
                    if (arg0.field464 > 0) {
                        --arg0.field464;
                        return;
                    }
                }
            } else {
                arg0.field410 = var6;
                arg0.field411 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lz;I)V")
    public final void method511(PathingEntity arg0, int arg1) {
        this.field1428 += arg1;
        if (arg0.field458 != 0) {
            if (arg0.field432 != -1 && arg0.field432 < 32768) {
                NpcEntity var3 = this.field1219[arg0.field432];
                if (var3 != null) {
                    int var4 = arg0.field410 - var3.field410;
                    int var5 = arg0.field411 - var3.field411;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field457 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field432 >= 32768) {
                int var6 = arg0.field432 - 32768;
                if (this.field1542 == var6) {
                    var6 = this.field1377;
                }
                PlayerEntity var7 = this.field1378[var6];
                if (var7 != null) {
                    int var8 = arg0.field410 - var7.field410;
                    int var9 = arg0.field411 - var7.field411;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field457 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field433 != 0 || arg0.field434 != 0) && (arg0.field459 == 0 || arg0.field463 > 0)) {
                int var10 = arg0.field410 - (arg0.field433 - this.field1487 - this.field1487) * 64;
                int var11 = arg0.field411 - (arg0.field434 - this.field1488 - this.field1488) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field457 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field433 = 0;
                arg0.field434 = 0;
            }
            int var12 = arg0.field457 - arg0.field412 & 2047;
            if (var12 != 0) {
                if (var12 >= arg0.field458 && var12 <= 2048 - arg0.field458) {
                    if (var12 > 1024) {
                        arg0.field412 -= arg0.field458;
                    } else {
                        arg0.field412 += arg0.field458;
                    }
                } else {
                    arg0.field412 = arg0.field457;
                }
                arg0.field412 &= 2047;
                if (arg0.field435 == arg0.field415 && arg0.field457 != arg0.field412) {
                    if (arg0.field416 != -1) {
                        arg0.field435 = arg0.field416;
                        return;
                    }
                    arg0.field435 = arg0.field417;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLz;)V")
    public final void method512(boolean arg0, PathingEntity arg1) {
        if (arg0) {
            this.field1429 = -1;
        }
        arg1.field413 = false;
        if (arg1.field435 != -1) {
            SeqType var3 = SeqType.field1112[arg1.field435];
            ++arg1.field437;
            if (arg1.field436 < var3.field1113 && arg1.field437 > var3.method384((byte) -103, arg1.field436)) {
                arg1.field437 = 0;
                ++arg1.field436;
            }
            if (arg1.field436 >= var3.field1113) {
                arg1.field437 = 0;
                arg1.field436 = 0;
            }
        }
        if (arg1.field443 != -1 && field1591 >= arg1.field446) {
            if (arg1.field444 < 0) {
                arg1.field444 = 0;
            }
            SeqType var4 = SpotAnimType.field1132[arg1.field443].field1136;
            ++arg1.field445;
            while (arg1.field444 < var4.field1113 && arg1.field445 > var4.method384((byte) -103, arg1.field444)) {
                arg1.field445 -= var4.method384((byte) -103, arg1.field444);
                ++arg1.field444;
            }
            if (arg1.field444 >= var4.field1113 && (arg1.field444 < 0 || arg1.field444 >= var4.field1113)) {
                arg1.field443 = -1;
            }
        }
        if (arg1.field438 != -1 && arg1.field441 <= 1) {
            SeqType var5 = SeqType.field1112[arg1.field438];
            if (var5.field1124 == 1 && arg1.field464 > 0 && arg1.field452 <= field1591 && arg1.field453 < field1591) {
                arg1.field441 = 1;
                return;
            }
        }
        if (arg1.field438 != -1 && arg1.field441 == 0) {
            SeqType var6 = SeqType.field1112[arg1.field438];
            ++arg1.field440;
            while (arg1.field439 < var6.field1113 && arg1.field440 > var6.method384((byte) -103, arg1.field439)) {
                arg1.field440 -= var6.method384((byte) -103, arg1.field439);
                ++arg1.field439;
            }
            if (arg1.field439 >= var6.field1113) {
                arg1.field439 -= var6.field1117;
                ++arg1.field442;
                if (arg1.field442 >= var6.field1123) {
                    arg1.field438 = -1;
                }
                if (arg1.field439 < 0 || arg1.field439 >= var6.field1113) {
                    arg1.field438 = -1;
                }
            }
            arg1.field413 = var6.field1119;
        }
        if (arg1.field441 > 0) {
            --arg1.field441;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method513(boolean arg0) {
        if (arg0) {
            this.field1536 = !this.field1536;
        }
        if (this.field1448) {
            this.field1448 = false;
            this.field1560.method269(4, 0, super.field15, true);
            this.field1561.method269(357, 0, super.field15, true);
            this.field1562.method269(4, 722, super.field15, true);
            this.field1563.method269(205, 743, super.field15, true);
            this.field1564.method269(0, 0, super.field15, true);
            this.field1565.method269(4, 516, super.field15, true);
            this.field1566.method269(205, 516, super.field15, true);
            this.field1567.method269(357, 496, super.field15, true);
            this.field1568.method269(338, 0, super.field15, true);
            this.field1200 = true;
            this.field1528 = true;
            this.field1352 = true;
            this.field1243 = true;
            if (this.field1317 != 2) {
                this.field1484.method269(4, 4, super.field15, true);
                this.field1483.method269(4, 550, super.field15, true);
            }
        }
        if (this.field1317 == 2) {
            this.method540(0);
        }
        if (this.field1384 && this.field1214 == 1) {
            this.field1200 = true;
        }
        if (this.field1594 != -1) {
            boolean var2 = this.method471(0, this.field1464, this.field1594);
            if (var2) {
                this.field1200 = true;
            }
        }
        if (this.field1225 == 2) {
            this.field1200 = true;
        }
        if (this.field1366 == 2) {
            this.field1200 = true;
        }
        if (this.field1200) {
            this.method455(874);
            this.field1200 = false;
        }
        if (this.field1558 == -1) {
            this.field1486.field90 = this.field1509 - this.field1343 - 77;
            if (super.field23 > 448 && super.field23 < 560 && super.field24 > 332) {
                this.method469(463, this.field1509, false, (byte) 116, super.field23 - 17, this.field1486, super.field24 - 357, 77, 0);
            }
            int var3 = this.field1509 - 77 - this.field1486.field90;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1509 - 77) {
                var3 = this.field1509 - 77;
            }
            if (this.field1343 != var3) {
                this.field1343 = var3;
                this.field1528 = true;
            }
        }
        if (this.field1558 != -1) {
            boolean var4 = this.method471(0, this.field1464, this.field1558);
            if (var4) {
                this.field1528 = true;
            }
        }
        if (this.field1225 == 3) {
            this.field1528 = true;
        }
        if (this.field1366 == 3) {
            this.field1528 = true;
        }
        if (this.field1635 != null) {
            this.field1528 = true;
        }
        if (this.field1384 && this.field1214 == 2) {
            this.field1528 = true;
        }
        if (this.field1528) {
            this.method538(0);
            this.field1528 = false;
        }
        if (this.field1317 == 2) {
            this.method516((byte) 3);
            this.field1483.method269(4, 550, super.field15, true);
        }
        if (this.field1632 != -1) {
            this.field1352 = true;
        }
        if (this.field1352) {
            if (this.field1632 != -1 && this.field1632 == this.field1248) {
                this.field1632 = -1;
                this.field1543.method228(4, 201);
                this.field1543.method229(this.field1248);
            }
            this.field1352 = false;
            this.field1534.method268((byte) 9);
            this.field1282.method212(1, 0, 0);
            if (this.field1594 == -1) {
                if (this.field1468[this.field1248] != -1) {
                    if (this.field1248 == 0) {
                        this.field1399.method212(1, 22, 10);
                    }
                    if (this.field1248 == 1) {
                        this.field1400.method212(1, 54, 8);
                    }
                    if (this.field1248 == 2) {
                        this.field1400.method212(1, 82, 8);
                    }
                    if (this.field1248 == 3) {
                        this.field1401.method212(1, 110, 8);
                    }
                    if (this.field1248 == 4) {
                        this.field1403.method212(1, 153, 8);
                    }
                    if (this.field1248 == 5) {
                        this.field1403.method212(1, 181, 8);
                    }
                    if (this.field1248 == 6) {
                        this.field1402.method212(1, 209, 9);
                    }
                }
                if (this.field1468[0] != -1 && (this.field1632 != 0 || field1591 % 20 < 10)) {
                    this.field1460[0].method212(1, 29, 13);
                }
                if (this.field1468[1] != -1 && (this.field1632 != 1 || field1591 % 20 < 10)) {
                    this.field1460[1].method212(1, 53, 11);
                }
                if (this.field1468[2] != -1 && (this.field1632 != 2 || field1591 % 20 < 10)) {
                    this.field1460[2].method212(1, 82, 11);
                }
                if (this.field1468[3] != -1 && (this.field1632 != 3 || field1591 % 20 < 10)) {
                    this.field1460[3].method212(1, 115, 12);
                }
                if (this.field1468[4] != -1 && (this.field1632 != 4 || field1591 % 20 < 10)) {
                    this.field1460[4].method212(1, 153, 13);
                }
                if (this.field1468[5] != -1 && (this.field1632 != 5 || field1591 % 20 < 10)) {
                    this.field1460[5].method212(1, 180, 11);
                }
                if (this.field1468[6] != -1 && (this.field1632 != 6 || field1591 % 20 < 10)) {
                    this.field1460[6].method212(1, 208, 13);
                }
            }
            this.field1534.method269(160, 516, super.field15, true);
            this.field1533.method268((byte) 9);
            this.field1281.method212(1, 0, 0);
            if (this.field1594 == -1) {
                if (this.field1468[this.field1248] != -1) {
                    if (this.field1248 == 7) {
                        this.field1226.method212(1, 42, 0);
                    }
                    if (this.field1248 == 8) {
                        this.field1227.method212(1, 74, 0);
                    }
                    if (this.field1248 == 9) {
                        this.field1227.method212(1, 102, 0);
                    }
                    if (this.field1248 == 10) {
                        this.field1228.method212(1, 130, 1);
                    }
                    if (this.field1248 == 11) {
                        this.field1230.method212(1, 173, 0);
                    }
                    if (this.field1248 == 12) {
                        this.field1230.method212(1, 201, 0);
                    }
                    if (this.field1248 == 13) {
                        this.field1229.method212(1, 229, 0);
                    }
                }
                if (this.field1468[8] != -1 && (this.field1632 != 8 || field1591 % 20 < 10)) {
                    this.field1460[7].method212(1, 74, 2);
                }
                if (this.field1468[9] != -1 && (this.field1632 != 9 || field1591 % 20 < 10)) {
                    this.field1460[8].method212(1, 102, 3);
                }
                if (this.field1468[10] != -1 && (this.field1632 != 10 || field1591 % 20 < 10)) {
                    this.field1460[9].method212(1, 137, 4);
                }
                if (this.field1468[11] != -1 && (this.field1632 != 11 || field1591 % 20 < 10)) {
                    this.field1460[10].method212(1, 174, 2);
                }
                if (this.field1468[12] != -1 && (this.field1632 != 12 || field1591 % 20 < 10)) {
                    this.field1460[11].method212(1, 201, 2);
                }
                if (this.field1468[13] != -1 && (this.field1632 != 13 || field1591 % 20 < 10)) {
                    this.field1460[12].method212(1, 226, 2);
                }
            }
            this.field1533.method269(466, 496, super.field15, true);
            this.field1484.method268((byte) 9);
        }
        if (this.field1243) {
            this.field1243 = false;
            this.field1532.method268((byte) 9);
            this.field1280.method212(1, 0, 0);
            this.field1345.method215(16777215, 55, "Public chat", true, 28, true);
            if (this.field1583 == 0) {
                this.field1345.method215(65280, 55, "On", true, 41, true);
            }
            if (this.field1583 == 1) {
                this.field1345.method215(16776960, 55, "Friends", true, 41, true);
            }
            if (this.field1583 == 2) {
                this.field1345.method215(16711680, 55, "Off", true, 41, true);
            }
            if (this.field1583 == 3) {
                this.field1345.method215(65535, 55, "Hide", true, 41, true);
            }
            this.field1345.method215(16777215, 184, "Private chat", true, 28, true);
            if (this.field1625 == 0) {
                this.field1345.method215(65280, 184, "On", true, 41, true);
            }
            if (this.field1625 == 1) {
                this.field1345.method215(16776960, 184, "Friends", true, 41, true);
            }
            if (this.field1625 == 2) {
                this.field1345.method215(16711680, 184, "Off", true, 41, true);
            }
            this.field1345.method215(16777215, 324, "Trade/duel", true, 28, true);
            if (this.field1554 == 0) {
                this.field1345.method215(65280, 324, "On", true, 41, true);
            }
            if (this.field1554 == 1) {
                this.field1345.method215(16776960, 324, "Friends", true, 41, true);
            }
            if (this.field1554 == 2) {
                this.field1345.method215(16711680, 324, "Off", true, 41, true);
            }
            this.field1345.method215(16777215, 458, "Report abuse", true, 33, true);
            this.field1532.method269(453, 0, super.field15, true);
            this.field1484.method268((byte) 9);
        }
        this.field1464 = 0;
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method514(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1465[(var2 - 2 << 7) + var3] = 255;
            }
        }
        this.field1428 += arg0;
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1465[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1466[var14] = (this.field1465[var14 - 1] + this.field1465[var14 + 1] + this.field1465[var14 - 128] + this.field1465[var14 + 128]) / 4;
            }
        }
        this.field1414 += 128;
        if (this.field1414 > this.field1264.length) {
            this.field1414 -= this.field1264.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method554(this.field1626[var6], (byte) 1);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field1466[var11 + 128] - this.field1264[this.field1414 + var11 & this.field1264.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field1465[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field1287[var8] = this.field1287[var8 + 1];
        }
        this.field1287[var2 - 1] = (int) (Math.sin((double) field1591 / 14.0D) * 16.0D + Math.sin((double) field1591 / 15.0D) * 14.0D + Math.sin((double) field1591 / 16.0D) * 12.0D);
        if (this.field1358 > 0) {
            this.field1358 -= 4;
        }
        if (this.field1359 > 0) {
            this.field1359 -= 4;
        }
        if (this.field1358 == 0 && this.field1359 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field1358 = 1024;
            }
            if (var9 == 1) {
                this.field1359 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
    public final void method515(String arg0, int arg1, int arg2, String arg3) {
        if (arg1 == 0 && this.field1289 != -1) {
            this.field1635 = arg3;
            super.field29 = 0;
        }
        if (this.field1558 == -1) {
            this.field1528 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1245[var5] = this.field1245[var5 - 1];
            this.field1246[var5] = this.field1246[var5 - 1];
            this.field1247[var5] = this.field1247[var5 - 1];
        }
        this.field1245[0] = arg1;
        this.field1246[0] = arg0;
        this.field1247[0] = arg3;
        if (arg2 != -22996) {
            this.field1416 = this.field1461.method305();
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method516(byte arg0) {
        this.field1483.method268((byte) 9);
        int var2 = this.field1278 + this.field1253 & 2047;
        int var3 = field1231.field410 / 32 + 48;
        if (arg0 == 3) {
            boolean var4 = false;
            int var5 = 464 - field1231.field411 / 32;
            this.field1303.method203(146, this.field1502, this.field1348 + 256, this.field1648, false, 25, var3, 151, 5, var5, var2);
            this.field1300.method203(33, this.field1595, 256, this.field1424, false, 0, 25, 33, 0, 25, this.field1253);
            for (int var6 = 0; var6 < this.field1207; ++var6) {
                int var34 = this.field1208[var6] * 4 + 2 - field1231.field410 / 32;
                int var35 = this.field1209[var6] * 4 + 2 - field1231.field411 / 32;
                this.method473(this.field1202[var6], 0, var35, var34);
            }
            for (int var7 = 0; var7 < 104; ++var7) {
                for (int var30 = 0; var30 < 104; ++var30) {
                    LinkList var31 = this.field1406[this.field1277][var7][var30];
                    if (var31 != null) {
                        int var32 = var7 * 4 + 2 - field1231.field410 / 32;
                        int var33 = var30 * 4 + 2 - field1231.field411 / 32;
                        this.method473(this.field1570, 0, var33, var32);
                    }
                }
            }
            for (int var8 = 0; var8 < this.field1220; ++var8) {
                NpcEntity var27 = this.field1219[this.field1221[var8]];
                if (var27 != null && var27.method127(-323) && var27.field465.field1001) {
                    int var28 = var27.field410 / 32 - field1231.field410 / 32;
                    int var29 = var27.field411 / 32 - field1231.field411 / 32;
                    this.method473(this.field1571, 0, var29, var28);
                }
            }
            for (int var9 = 0; var9 < this.field1379; ++var9) {
                PlayerEntity var20 = this.field1378[this.field1380[var9]];
                if (var20 != null && var20.method127(-323)) {
                    int var21 = var20.field410 / 32 - field1231.field410 / 32;
                    int var22 = var20.field411 / 32 - field1231.field411 / 32;
                    boolean var23 = false;
                    long var24 = JString.method310(var20.field468);
                    for (int var26 = 0; var26 < this.field1609; ++var26) {
                        if (this.field1521[var26] == var24 && this.field1553[var26] != 0) {
                            var23 = true;
                            break;
                        }
                    }
                    if (var23) {
                        this.method473(this.field1573, 0, var22, var21);
                    } else {
                        this.method473(this.field1572, 0, var22, var21);
                    }
                }
            }
            if (this.field1458 != 0 && field1591 % 20 < 10) {
                if (this.field1458 == 1 && this.field1234 >= 0 && this.field1234 < this.field1219.length) {
                    NpcEntity var10 = this.field1219[this.field1234];
                    if (var10 != null) {
                        int var11 = var10.field410 / 32 - field1231.field410 / 32;
                        int var12 = var10.field411 / 32 - field1231.field411 / 32;
                        this.method556(this.field1443, var11, var12, 375);
                    }
                }
                if (this.field1458 == 2) {
                    int var13 = (this.field1475 - this.field1487) * 4 + 2 - field1231.field410 / 32;
                    int var14 = (this.field1476 - this.field1488) * 4 + 2 - field1231.field411 / 32;
                    this.method556(this.field1443, var13, var14, 375);
                }
                if (this.field1458 == 10 && this.field1437 >= 0 && this.field1437 < this.field1378.length) {
                    PlayerEntity var15 = this.field1378[this.field1437];
                    if (var15 != null) {
                        int var16 = var15.field410 / 32 - field1231.field410 / 32;
                        int var17 = var15.field411 / 32 - field1231.field411 / 32;
                        this.method556(this.field1443, var16, var17, 375);
                    }
                }
            }
            if (this.field1301 != 0) {
                int var18 = this.field1301 * 4 + 2 - field1231.field410 / 32;
                int var19 = this.field1302 * 4 + 2 - field1231.field411 / 32;
                this.method473(this.field1442, 0, var19, var18);
            }
            Pix2D.method170(3, 3, 97, 78, (byte) 3, 16777215);
            this.field1484.method268((byte) 9);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;IILbb;)V")
    private final void method517(int arg0, Packet arg1, int arg2, int arg3, PlayerEntity arg4) {
        if (arg3 >= 0) {
            field1341 = this.field1461.method305();
        }
        if ((arg0 & 1) == 1) {
            int var6 = arg1.method239();
            byte[] var7 = new byte[var6];
            Packet var8 = new Packet(var7, (byte) 3);
            arg1.method248(0, this.field1535, var7, var6);
            this.field1383[arg2] = var8;
            arg4.method130(var8, true);
        }
        if ((arg0 & 2) == 2) {
            int var9 = arg1.method241();
            if (var9 == 65535) {
                var9 = -1;
            }
            if (arg4.field438 == var9) {
                arg4.field442 = 0;
            }
            int var10 = arg1.method239();
            if (arg4.field438 == var9 && var9 != -1) {
                int var11 = SeqType.field1112[var9].field1126;
                if (var11 == 1) {
                    arg4.field439 = 0;
                    arg4.field440 = 0;
                    arg4.field441 = var10;
                    arg4.field442 = 0;
                }
                if (var11 == 2) {
                    arg4.field442 = 0;
                }
            } else if (var9 == -1 || arg4.field438 == -1 || SeqType.field1112[var9].field1120 >= SeqType.field1112[arg4.field438].field1120) {
                arg4.field438 = var9;
                arg4.field439 = 0;
                arg4.field440 = 0;
                arg4.field441 = var10;
                arg4.field442 = 0;
                arg4.field464 = arg4.field459;
            }
        }
        if ((arg0 & 4) == 4) {
            arg4.field432 = arg1.method241();
            if (arg4.field432 == 65535) {
                arg4.field432 = -1;
            }
        }
        if ((arg0 & 8) == 8) {
            arg4.field422 = arg1.method246();
            arg4.field424 = 0;
            arg4.field425 = 0;
            arg4.field423 = 150;
            this.method515(arg4.field468, 2, this.field1599, arg4.field422);
        }
        if ((arg0 & 16) == 16) {
            int var12 = arg1.method239();
            int var13 = arg1.method239();
            arg4.method128(172, var13, var12);
            arg4.field429 = field1591 + 300;
            arg4.field430 = arg1.method239();
            arg4.field431 = arg1.method239();
        }
        if ((arg0 & 32) == 32) {
            arg4.field433 = arg1.method241();
            arg4.field434 = arg1.method241();
        }
        if ((arg0 & 64) == 64) {
            int var14 = arg1.method241();
            int var15 = arg1.method239();
            int var16 = arg1.method239();
            int var17 = arg1.field711;
            if (arg4.field468 != null && arg4.field469) {
                long var18 = JString.method310(arg4.field468);
                boolean var20 = false;
                if (var15 <= 1) {
                    for (int var21 = 0; var21 < this.field1646; ++var21) {
                        if (this.field1515[var21] == var18) {
                            var20 = true;
                            break;
                        }
                    }
                }
                if (!var20 && this.field1450 == 0) {
                    try {
                        String var22 = WordPack.method317(arg1, var16, -468);
                        String var23 = WordFilter.method403((byte) -13, var22);
                        arg4.field422 = var23;
                        arg4.field424 = var14 >> 8;
                        arg4.field425 = var14 & 255;
                        arg4.field423 = 150;
                        if (var15 != 2 && var15 != 3) {
                            if (var15 == 1) {
                                this.method515("@cr1@" + arg4.field468, 1, this.field1599, var23);
                            } else {
                                this.method515(arg4.field468, 2, this.field1599, var23);
                            }
                        } else {
                            this.method515("@cr2@" + arg4.field468, 1, this.field1599, var23);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg1.field711 = var16 + var17;
        }
        if ((arg0 & 256) == 256) {
            arg4.field443 = arg1.method241();
            int var25 = arg1.method244();
            arg4.field447 = var25 >> 16;
            arg4.field446 = (var25 & 65535) + field1591;
            arg4.field444 = 0;
            arg4.field445 = 0;
            if (arg4.field446 > field1591) {
                arg4.field444 = -1;
            }
            if (arg4.field443 == 65535) {
                arg4.field443 = -1;
            }
        }
        if ((arg0 & 512) == 512) {
            arg4.field448 = arg1.method239();
            arg4.field450 = arg1.method239();
            arg4.field449 = arg1.method239();
            arg4.field451 = arg1.method239();
            arg4.field452 = arg1.method241() + field1591;
            arg4.field453 = arg1.method241() + field1591;
            arg4.field454 = arg1.method239();
            arg4.method126(false);
        }
        if ((arg0 & 1024) == 1024) {
            int var26 = arg1.method239();
            int var27 = arg1.method239();
            arg4.method128(172, var27, var26);
            arg4.field429 = field1591 + 300;
            arg4.field430 = arg1.method239();
            arg4.field431 = arg1.method239();
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method518(int arg0) {
        if (arg0 >= 0) {
            field1321 = !field1321;
        }
        if (this.field1366 == 0) {
            int var2 = super.field29;
            if (this.field1387 == 1 && super.field30 >= 516 && super.field31 >= 160 && super.field30 <= 765 && super.field31 <= 205) {
                var2 = 0;
            }
            if (this.field1384) {
                if (var2 != 1) {
                    int var3 = super.field23;
                    int var4 = super.field24;
                    if (this.field1214 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field1214 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field1214 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field1215 - 10 || var3 > this.field1217 + this.field1215 + 10 || var4 < this.field1216 - 10 || var4 > this.field1218 + this.field1216 + 10) {
                        this.field1384 = false;
                        if (this.field1214 == 1) {
                            this.field1200 = true;
                        }
                        if (this.field1214 == 2) {
                            this.field1528 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field1215;
                    int var6 = this.field1216;
                    int var7 = this.field1217;
                    int var8 = super.field30;
                    int var9 = super.field31;
                    if (this.field1214 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field1214 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field1214 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field1314; ++var11) {
                        int var12 = (this.field1314 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method433((byte) 7, var10);
                    }
                    this.field1384 = false;
                    if (this.field1214 == 1) {
                        this.field1200 = true;
                    }
                    if (this.field1214 == 2) {
                        this.field1528 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field1314 > 0) {
                    int var13 = this.field1205[this.field1314 - 1];
                    if (var13 == 582 || var13 == 113 || var13 == 555 || var13 == 331 || var13 == 354 || var13 == 694 || var13 == 962 || var13 == 795 || var13 == 681 || var13 == 100 || var13 == 102 || var13 == 1328) {
                        int var14 = this.field1203[this.field1314 - 1];
                        int var15 = this.field1204[this.field1314 - 1];
                        Component var16 = Component.field70[var15];
                        if (var16.field97 || var16.field100) {
                            this.field1385 = false;
                            this.field1251 = 0;
                            this.field1364 = var15;
                            this.field1365 = var14;
                            this.field1366 = 2;
                            this.field1367 = super.field30;
                            this.field1368 = super.field31;
                            if (Component.field70[var15].field76 == this.field1523) {
                                this.field1366 = 1;
                            }
                            if (Component.field70[var15].field76 == this.field1558) {
                                this.field1366 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field1495 == 1 || this.method524(this.field1314 - 1, 0)) && this.field1314 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field1314 > 0) {
                    this.method433((byte) 7, this.field1314 - 1);
                }
                if (var2 != 2 || this.field1314 <= 0) {
                    return;
                }
                this.method493(-2068);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lmb;II)V")
    private final void method519(Packet arg0, int arg1, int arg2) {
        int var4 = arg0.method250(-416, 8);
        int var5 = 22 / arg2;
        if (var4 < this.field1379) {
            for (int var6 = var4; var6 < this.field1379; ++var6) {
                this.field1454[this.field1453++] = this.field1380[var6];
            }
        }
        if (var4 > this.field1379) {
            signlink.reporterror(this.field1426 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1379 = 0;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field1380[var7];
                PlayerEntity var9 = this.field1378[var8];
                int var10 = arg0.method250(-416, 1);
                if (var10 == 0) {
                    this.field1380[this.field1379++] = var8;
                    var9.field455 = field1591;
                } else {
                    int var11 = arg0.method250(-416, 2);
                    if (var11 == 0) {
                        this.field1380[this.field1379++] = var8;
                        var9.field455 = field1591;
                        this.field1382[this.field1381++] = var8;
                    } else if (var11 == 1) {
                        this.field1380[this.field1379++] = var8;
                        var9.field455 = field1591;
                        int var12 = arg0.method250(-416, 3);
                        var9.method125(false, var12, (byte) 4);
                        int var13 = arg0.method250(-416, 1);
                        if (var13 == 1) {
                            this.field1382[this.field1381++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field1380[this.field1379++] = var8;
                        var9.field455 = field1591;
                        int var14 = arg0.method250(-416, 3);
                        var9.method125(true, var14, (byte) 4);
                        int var15 = arg0.method250(-416, 3);
                        var9.method125(true, var15, (byte) 4);
                        int var16 = arg0.method250(-416, 1);
                        if (var16 == 1) {
                            this.field1382[this.field1381++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field1454[this.field1453++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method520(int arg0) {
        for (int var2 = -1; var2 < this.field1379; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field1377;
            } else {
                var3 = this.field1380[var2];
            }
            PlayerEntity var4 = this.field1378[var3];
            if (var4 != null) {
                this.method507((byte) 1, var4, 1);
            }
        }
        if (arg0 <= 0) {
            this.field1531 = this.field1461.method305();
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method521(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method6();
        }
        Component var3 = Component.field70[arg1];
        for (int var4 = 0; var4 < var3.field92.length && var3.field92[var4] != -1; ++var4) {
            Component var5 = Component.field70[var3.field92[var4]];
            if (var5.field77 == 1) {
                this.method521(0, var5.field75);
            }
            var5.field73 = 0;
            var5.field74 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method522(int arg0, int arg1) {
        signlink.wavevol = arg1;
        int var3 = 9 / arg0;
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method523(int arg0) {
        this.field1395 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1627) {
                ++this.field1363;
                this.method514(0);
                this.method514(0);
                this.method449(0);
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
        this.field1395 = false;
        if (arg0 != 38950) {
            field1593 = 323;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)Z")
    public final boolean method524(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field1429 = this.field1319.method239();
        }
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field1205[arg0];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 605;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg0 & 2047;
        int var9 = 2048 - arg6 & 2047;
        if (arg4 == 7) {
            int var10 = 0;
            int var11 = 0;
            int var12 = arg5;
            if (var8 != 0) {
                int var13 = Model.field602[var8];
                int var14 = Model.field603[var8];
                int var15 = var11 * var14 - arg5 * var13 >> 16;
                var12 = var11 * var13 + arg5 * var14 >> 16;
                var11 = var15;
            }
            if (var9 != 0) {
                int var16 = Model.field602[var9];
                int var17 = Model.field603[var9];
                int var18 = var10 * var17 + var12 * var16 >> 16;
                var12 = var12 * var17 - var10 * var16 >> 16;
                var10 = var18;
            }
            this.field1266 = arg1 - var10;
            this.field1267 = arg2 - var11;
            this.field1268 = arg3 - var12;
            this.field1269 = arg0;
            this.field1270 = arg6;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I)V")
    public final void method9(int arg0) {
        if (!this.field1410 && !this.field1508 && !this.field1194) {
            ++field1470;
            if (!this.field1238) {
                this.method437(false, (byte) 4);
            } else {
                this.method513(this.field1536);
            }
            this.field1361 = 0;
            if (arg0 != 0) {
                this.field1429 = -1;
            }
        } else {
            this.method489(this.field1193);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method526(byte arg0) {
        byte[] var2 = this.field1371.method309("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1547.method268((byte) 9);
        var3.method197(0, -18217, 0);
        this.field1548.method268((byte) 9);
        var3.method197(0, -18217, -637);
        this.field1544.method268((byte) 9);
        var3.method197(0, -18217, -128);
        this.field1545.method268((byte) 9);
        var3.method197(-371, -18217, -202);
        this.field1546.method268((byte) 9);
        var3.method197(-171, -18217, -202);
        this.field1549.method268((byte) 9);
        var3.method197(-265, -18217, 0);
        this.field1550.method268((byte) 9);
        var3.method197(-265, -18217, -562);
        this.field1551.method268((byte) 9);
        var3.method197(-171, -18217, -128);
        this.field1552.method268((byte) 9);
        var3.method197(-171, -18217, -562);
        int[] var4 = new int[var3.field667];
        for (int var5 = 0; var5 < var3.field668; ++var5) {
            for (int var10 = 0; var10 < var3.field667; ++var10) {
                var4[var10] = var3.field666[var3.field667 * var5 + (var3.field667 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field667; ++var11) {
                var3.field666[var3.field667 * var5 + var11] = var4[var11];
            }
        }
        this.field1547.method268((byte) 9);
        var3.method197(0, -18217, 382);
        this.field1548.method268((byte) 9);
        var3.method197(0, -18217, -255);
        this.field1544.method268((byte) 9);
        var3.method197(0, -18217, 254);
        this.field1545.method268((byte) 9);
        var3.method197(-371, -18217, 180);
        this.field1546.method268((byte) 9);
        var3.method197(-171, -18217, 180);
        this.field1549.method268((byte) 9);
        var3.method197(-265, -18217, 382);
        if (arg0 != 8) {
            this.field1429 = -1;
        }
        this.field1550.method268((byte) 9);
        var3.method197(-265, -18217, -180);
        this.field1551.method268((byte) 9);
        var3.method197(-171, -18217, 254);
        this.field1552.method268((byte) 9);
        var3.method197(-171, -18217, -180);
        Pix32 var6 = new Pix32(this.field1371, "logo", 0);
        this.field1544.method268((byte) 9);
        var6.method199(1, 382 - var6.field667 / 2 - 128, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)V")
    public final void method527(int arg0, byte arg1) {
        int[] var3 = this.field1303.field666;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field1512[arg0][var24][var6] & 24) == 0) {
                    this.field1325.method99(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field1512[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field1325.method99(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1303.method194((byte) 9);
        if (arg1 != -60) {
            this.field1406 = null;
        }
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field1512[arg0][var22][var9] & 24) == 0) {
                    this.method463(var7, arg0, var22, 1, var8, var9);
                }
                if (arg0 < 3 && (this.field1512[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method463(var7, arg0 + 1, var22, 1, var8, var9);
                }
            }
        }
        this.field1484.method268((byte) 9);
        this.field1207 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field1325.method93(this.field1277, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = LocType.method334(var13).field954;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field1233[this.field1277].field1075;
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
                        this.field1202[this.field1207] = this.field1600[var14];
                        this.field1208[this.field1207] = var15;
                        this.field1209[this.field1207] = var16;
                        ++this.field1207;
                    }
                }
            }
        }
        ++field1354;
        if (field1354 > 112) {
            field1354 = 0;
            this.field1543.method228(4, 4);
            this.field1543.method229(50);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)V")
    public final void method528(boolean arg0, int arg1) {
        if (field1231.field410 >> 7 == this.field1301 && field1231.field411 >> 7 == this.field1302) {
            this.field1301 = 0;
            ++field1587;
            if (field1587 > 122) {
                field1587 = 0;
                this.field1543.method228(4, 36);
                this.field1543.method229(62);
            }
        }
        int var3 = this.field1379;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            PlayerEntity var5;
            int var6;
            if (arg0) {
                var5 = field1231;
                var6 = this.field1377 << 14;
            } else {
                var5 = this.field1378[this.field1380[var4]];
                var6 = this.field1380[var4] << 14;
            }
            if (var5 != null && var5.method127(-323)) {
                var5.field487 = false;
                if ((field1242 && this.field1379 > 50 || this.field1379 > 200) && !arg0 && var5.field435 == var5.field415) {
                    var5.field487 = true;
                }
                int var7 = var5.field410 >> 7;
                int var8 = var5.field411 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field482 != null && field1591 >= var5.field477 && field1591 < var5.field478) {
                        var5.field487 = false;
                        var5.field476 = this.method470(var5.field411, this.field1277, var5.field410, 9803);
                        this.field1325.method76(var5.field476, var5.field412, var5.field484, 60, var5.field486, var5.field411, var5, var5.field483, var5.field410, true, var6, this.field1277, var5.field485);
                    } else {
                        if ((var5.field410 & 127) == 64 && (var5.field411 & 127) == 64) {
                            if (this.field1586[var7][var8] == this.field1320) {
                                continue;
                            }
                            this.field1586[var7][var8] = this.field1320;
                        }
                        var5.field476 = this.method470(var5.field411, this.field1277, var5.field410, 9803);
                        this.field1325.method75(var5.field412, var6, 60, var5.field410, var5, true, var5.field476, this.field1277, var5.field413, var5.field411);
                    }
                }
            }
        }
        if (arg1 <= 0) {
            this.field1429 = this.field1319.method239();
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method529(int arg0, int arg1) {
        LinkList var3 = this.field1406[this.field1277][arg0][arg1];
        if (var3 == null) {
            this.field1325.method85(this.field1277, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method258(); var6 != null; var6 = (ObjStackEntity) var3.method260(6)) {
                ObjType var11 = ObjType.method350(var6.field501);
                int var12 = var11.field1036;
                if (var11.field1035) {
                    var12 = (var6.field502 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method256(var5, -176);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method258(); var9 != null; var9 = (ObjStackEntity) var3.method260(6)) {
                if (var5.field501 != var9.field501 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field501 != var9.field501 && var7.field501 != var9.field501 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1325.method71(var5, var10, this.method470(arg1 * 128 + 64, this.field1277, arg0 * 128 + 64, 9803), var8, this.field1277, true, arg0, arg1, var7);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;)Z")
    public final boolean method530(int arg0, Component arg1) {
        int var3 = arg1.field79;
        if (arg0 != 3) {
            this.field1543.method229(227);
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field1292[this.field1314] = "Remove @whi@" + arg1.field111;
                this.field1205[this.field1314] = 884;
                ++this.field1314;
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
            this.field1292[this.field1314] = "Remove @whi@" + this.field1257[var3];
            this.field1205[this.field1314] = 513;
            ++this.field1314;
            this.field1292[this.field1314] = "Message @whi@" + this.field1257[var3];
            this.field1205[this.field1314] = 902;
            ++this.field1314;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)Z")
    public final boolean method531(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg3 >> 14 & 32767;
        if (this.field1645 != arg1) {
            throw new NullPointerException();
        } else {
            int var7 = this.field1325.method94(this.field1277, arg0, arg2, arg3);
            if (var7 == -1) {
                return false;
            } else {
                int var8 = var7 & 31;
                int var9 = var7 >> 6 & 3;
                ++field1285;
                if (field1285 > 1086) {
                    field1285 = 0;
                    this.field1543.method228(4, 225);
                    this.field1543.method229(0);
                    int var10 = this.field1543.field711;
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field1543.method230(16791);
                    }
                    this.field1543.method229(254);
                    this.field1543.method230((int) (Math.random() * 65536.0D));
                    this.field1543.method230(16128);
                    this.field1543.method230(52610);
                    this.field1543.method230((int) (Math.random() * 65536.0D));
                    this.field1543.method230(55420);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field1543.method230(35025);
                    }
                    this.field1543.method230(46628);
                    this.field1543.method229((int) (Math.random() * 256.0D));
                    this.field1543.method238(this.field1543.field711 - var10, true);
                }
                if (var8 != 10 && var8 != 11 && var8 != 22) {
                    this.method488(0, 0, var9, 9, arg0, 2, field1231.field461[0], field1231.field460[0], arg2, false, 0, var8 + 1);
                } else {
                    LocType var11 = LocType.method334(var6);
                    int var12;
                    int var13;
                    if (var9 != 0 && var9 != 2) {
                        var12 = var11.field942;
                        var13 = var11.field941;
                    } else {
                        var12 = var11.field941;
                        var13 = var11.field942;
                    }
                    int var14 = var11.field964;
                    if (var9 != 0) {
                        var14 = (var14 >> 4 - var9) + (var14 << var9 & 15);
                    }
                    this.method488(var14, var13, 0, 9, arg0, 2, field1231.field461[0], field1231.field460[0], arg2, false, var12, 0);
                }
                this.field1498 = super.field30;
                this.field1499 = super.field31;
                this.field1501 = 2;
                this.field1500 = 0;
                this.field1543.method228(4, arg4);
                this.field1543.method230(this.field1487 + arg0);
                this.field1543.method230(this.field1488 + arg2);
                this.field1543.method230(var6);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)V")
    public final void method532(int arg0, int arg1, int arg2) {
        if (arg1 > 0) {
            int var4 = 0;
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field1247[var5] != null) {
                    int var6 = this.field1245[var5];
                    int var7 = 70 - var4 * 14 + this.field1343 + 4;
                    if (var7 < -20) {
                        break;
                    }
                    String var8 = this.field1246[var5];
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
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1583 == 0 || this.field1583 == 1 && this.method448(var8, (byte) -97))) {
                        if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field1231.field468)) {
                            if (this.field1510 >= 1) {
                                this.field1292[this.field1314] = "Report abuse @whi@" + var8;
                                this.field1205[this.field1314] = 524;
                                ++this.field1314;
                            }
                            this.field1292[this.field1314] = "Add ignore @whi@" + var8;
                            this.field1205[this.field1314] = 47;
                            ++this.field1314;
                            this.field1292[this.field1314] = "Add friend @whi@" + var8;
                            this.field1205[this.field1314] = 605;
                            ++this.field1314;
                        }
                        ++var4;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field1342 == 0 && (var6 == 7 || this.field1625 == 0 || this.field1625 == 1 && this.method448(var8, (byte) -97))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            if (this.field1510 >= 1) {
                                this.field1292[this.field1314] = "Report abuse @whi@" + var8;
                                this.field1205[this.field1314] = 524;
                                ++this.field1314;
                            }
                            this.field1292[this.field1314] = "Add ignore @whi@" + var8;
                            this.field1205[this.field1314] = 47;
                            ++this.field1314;
                            this.field1292[this.field1314] = "Add friend @whi@" + var8;
                            this.field1205[this.field1314] = 605;
                            ++this.field1314;
                        }
                        ++var4;
                    }
                    if (var6 == 4 && (this.field1554 == 0 || this.field1554 == 1 && this.method448(var8, (byte) -97))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            this.field1292[this.field1314] = "Accept trade @whi@" + var8;
                            this.field1205[this.field1314] = 507;
                            ++this.field1314;
                        }
                        ++var4;
                    }
                    if ((var6 == 5 || var6 == 6) && this.field1342 == 0 && this.field1625 < 2) {
                        ++var4;
                    }
                    if (var6 == 8 && (this.field1554 == 0 || this.field1554 == 1 && this.method448(var8, (byte) -97))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            this.field1292[this.field1314] = "Accept duel @whi@" + var8;
                            this.field1205[this.field1314] = 957;
                            ++this.field1314;
                        }
                        ++var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 254);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1239 = Integer.parseInt(arg0[0]);
                field1240 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method560((byte) -106);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method543((byte) -22);
                }
                if (arg0[3].equals("free")) {
                    field1241 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1241 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(765, 503, (byte) 7);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field18 != null) {
                    return new URL("http://127.0.0.1:" + (field1240 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public final void method13(byte arg0, String arg1, int arg2) {
        if (arg0 == 6) {
            boolean var4 = false;
            this.field1201 = arg2;
            this.field1469 = arg1;
            this.method534(269);
            if (this.field1371 == null) {
                super.method13((byte) 6, arg1, arg2);
            } else {
                this.field1546.method268((byte) 9);
                short var5 = 360;
                short var6 = 200;
                byte var7 = 20;
                this.field1346.method214(var6 / 2 - 26 - var7, "RuneScape is loading - please wait...", 0, var5 / 2, 16777215);
                int var8 = var6 / 2 - 18 - var7;
                Pix2D.method171(9179409, 304, var8, true, var5 / 2 - 152, 34);
                Pix2D.method171(0, 302, var8 + 1, true, var5 / 2 - 151, 32);
                Pix2D.method170(30, arg2 * 3, var5 / 2 - 150, var8 + 2, (byte) 3, 9179409);
                Pix2D.method170(30, 300 - arg2 * 3, arg2 * 3 + (var5 / 2 - 150), var8 + 2, (byte) 3, 0);
                this.field1346.method214(var6 / 2 + 5 - var7, arg1, 0, var5 / 2, 16777215);
                this.field1546.method269(171, 202, super.field15, true);
                if (this.field1448) {
                    this.field1448 = false;
                    if (!this.field1627) {
                        this.field1547.method269(0, 0, super.field15, true);
                        this.field1548.method269(0, 637, super.field15, true);
                    }
                    this.field1544.method269(0, 128, super.field15, true);
                    this.field1545.method269(371, 202, super.field15, true);
                    this.field1549.method269(265, 0, super.field15, true);
                    this.field1550.method269(265, 562, super.field15, true);
                    this.field1551.method269(171, 128, super.field15, true);
                    this.field1552.method269(171, 562, super.field15, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IIZLjava/lang/String;I)Lyb;")
    public final Jagfile method533(String arg0, int arg1, int arg2, boolean arg3, String arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field1232[0] != null) {
                var7 = this.field1232[0].method301(9, arg5);
            }
        } catch (Exception var29) {
        }
        if (var7 != null) {
            this.field1237.reset();
            this.field1237.update(var7);
            int var9 = (int) this.field1237.getValue();
            if (arg1 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(var7, this.field1416);
        } else {
            int var11 = 0;
            if (arg3) {
                this.method6();
            }
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method13((byte) 6, "Requesting " + arg0, arg2);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method498(arg4 + arg1);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    Packet var17 = new Packet(var16, (byte) 3);
                    var17.field711 = 3;
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
                            this.method13((byte) 6, "Loading " + arg0 + " - " + var23 + "%", arg2);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field1232[0] != null) {
                            this.field1232[0].method302(var7.length, arg5, var7, this.field1407);
                        }
                    } catch (Exception var28) {
                        this.field1232[0] = null;
                    }
                    if (var7 != null) {
                        this.field1237.reset();
                        this.field1237.update(var7);
                        int var24 = (int) this.field1237.getValue();
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
                            this.method13((byte) 6, "Game updated - please reload page", arg2);
                            var25 = 10;
                        } else {
                            this.method13((byte) 6, var12 + " - Retrying in " + var25, arg2);
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
            return new Jagfile(var7, this.field1416);
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method534(int arg0) {
        if (this.field1544 == null) {
            super.field16 = null;
            this.field1485 = null;
            this.field1483 = null;
            this.field1482 = null;
            this.field1484 = null;
            this.field1532 = null;
            this.field1533 = null;
            this.field1534 = null;
            this.field1547 = new PixMap(true, this.method11(0), 128, 265);
            Pix2D.method168(-170);
            this.field1548 = new PixMap(true, this.method11(0), 128, 265);
            Pix2D.method168(-170);
            this.field1544 = new PixMap(true, this.method11(0), 509, 171);
            Pix2D.method168(-170);
            this.field1545 = new PixMap(true, this.method11(0), 360, 132);
            Pix2D.method168(-170);
            this.field1546 = new PixMap(true, this.method11(0), 360, 200);
            Pix2D.method168(-170);
            if (arg0 <= 0) {
                field1341 = this.field1461.method305();
            }
            this.field1549 = new PixMap(true, this.method11(0), 202, 238);
            Pix2D.method168(-170);
            this.field1550 = new PixMap(true, this.method11(0), 203, 238);
            Pix2D.method168(-170);
            this.field1551 = new PixMap(true, this.method11(0), 74, 94);
            Pix2D.method168(-170);
            this.field1552 = new PixMap(true, this.method11(0), 75, 94);
            Pix2D.method168(-170);
            if (this.field1371 != null) {
                this.method526((byte) 8);
                this.method558(-111);
            }
            this.field1448 = true;
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method535(int arg0) {
        this.method445(true);
        if (this.field1501 == 1) {
            this.field1622[this.field1500 / 100].method199(1, this.field1498 - 8 - 4, this.field1499 - 8 - 4);
        }
        if (this.field1501 == 2) {
            this.field1622[this.field1500 / 100 + 4].method199(1, this.field1498 - 8 - 4, this.field1499 - 8 - 4);
            ++field1511;
            if (field1511 > 57) {
                field1511 = 0;
                this.field1543.method228(4, 100);
            }
        }
        if (this.field1574 != -1) {
            this.method471(0, this.field1464, this.field1574);
            this.method446(field1421, 0, Component.field70[this.field1574], 0, 0);
        }
        if (this.field1523 != -1) {
            this.method471(0, this.field1464, this.field1523);
            this.method446(field1421, 0, Component.field70[this.field1523], 0, 0);
        }
        this.method537(0);
        if (arg0 <= 0) {
            this.field1429 = -1;
        }
        if (!this.field1384) {
            this.method438(true);
            this.method462(-812);
        } else if (this.field1214 == 0) {
            this.method548((byte) -122);
        }
        if (this.field1350 == 1) {
            this.field1559[1].method199(1, 472, 296);
        }
        if (this.field1452 != 0) {
            int var2 = this.field1452 / 50;
            int var3 = var2 / 60;
            int var4 = var2 % 60;
            if (var4 < 10) {
                this.field1345.method217(16776960, 4, 329, this.field1537, "System update in: " + var3 + ":0" + var4);
            } else {
                this.field1345.method217(16776960, 4, 329, this.field1537, "System update in: " + var3 + ":" + var4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method536(int arg0) {
        if (this.field1452 > 1) {
            --this.field1452;
        }
        if (this.field1432 > 0) {
            --this.field1432;
        }
        for (int var2 = 0; var2 < 5 && this.method456(true); ++var2) {
        }
        if (this.field1238) {
            Object var3 = this.field1644.field973;
            synchronized (this.field1644.field973) {
                if (!field1397) {
                    this.field1644.field974 = 0;
                } else if (super.field29 != 0 || this.field1644.field974 >= 40) {
                    this.field1543.method228(4, 232);
                    this.field1543.method229(0);
                    int var4 = this.field1543.field711;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field1644.field974 && var4 - this.field1543.field711 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field1644.field976[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field1644.field975[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field1644.field976[var6] == -1 && this.field1644.field975[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field1462 == var8 && this.field1463 == var7) {
                            if (this.field1589 < 2047) {
                                ++this.field1589;
                            }
                        } else {
                            int var10 = var8 - this.field1462;
                            this.field1462 = var8;
                            int var11 = var7 - this.field1463;
                            this.field1463 = var7;
                            if (this.field1589 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field1543.method230((this.field1589 << 12) + (var10 << 6) + var11);
                                this.field1589 = 0;
                            } else if (this.field1589 < 8) {
                                this.field1543.method232((this.field1589 << 19) + 8388608 + var9);
                                this.field1589 = 0;
                            } else {
                                this.field1543.method233((this.field1589 << 19) + -1073741824 + var9);
                                this.field1589 = 0;
                            }
                        }
                    }
                    this.field1543.method238(this.field1543.field711 - var4, true);
                    if (var5 >= this.field1644.field974) {
                        this.field1644.field974 = 0;
                    } else {
                        this.field1644.field974 -= var5;
                        for (int var12 = 0; var12 < this.field1644.field974; ++var12) {
                            this.field1644.field975[var12] = this.field1644.field975[var5 + var12];
                            this.field1644.field976[var12] = this.field1644.field976[var5 + var12];
                        }
                    }
                }
            }
            if (super.field29 != 0) {
                long var13 = (super.field32 - this.field1370) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field1370 = super.field32;
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
                this.field1543.method228(4, 234);
                this.field1543.method233((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field1374 > 0) {
                --this.field1374;
            }
            if (super.field33[1] == 1 || super.field33[2] == 1 || super.field33[3] == 1 || super.field33[4] == 1) {
                this.field1375 = true;
            }
            if (this.field1375 && this.field1374 <= 0) {
                this.field1374 = 20;
                this.field1375 = false;
                this.field1543.method228(4, 91);
                this.field1543.method230(this.field1252);
                this.field1543.method230(this.field1253);
            }
            if (super.field20 && !this.field1612) {
                this.field1612 = true;
                this.field1543.method228(4, 8);
                this.field1543.method229(1);
            }
            if (!super.field20 && this.field1612) {
                this.field1612 = false;
                this.field1543.method228(4, 8);
                this.field1543.method229(0);
            }
            this.method435(292);
            this.method434(0);
            this.method474(false);
            Packet var20 = InputTracking.method46(-9917);
            if (var20 != null) {
                this.field1543.method228(4, 142);
                this.field1543.method230(var20.field711);
                this.field1543.method237(0, var20.field710, var20.field711, false);
                var20.method227(-359);
            }
            ++this.field1430;
            if (this.field1430 > 750) {
                this.method561(this.field1405);
            }
            this.method520(312);
            this.method506(-856);
            this.method461((byte) 0);
            ++this.field1464;
            this.field1428 += arg0;
            if (this.field1501 != 0) {
                this.field1500 += 20;
                if (this.field1500 >= 400) {
                    this.field1501 = 0;
                }
            }
            if (this.field1225 != 0) {
                ++this.field1222;
                if (this.field1222 >= 15) {
                    if (this.field1225 == 2) {
                        this.field1200 = true;
                    }
                    if (this.field1225 == 3) {
                        this.field1528 = true;
                    }
                    this.field1225 = 0;
                }
            }
            if (this.field1366 != 0) {
                ++this.field1251;
                if (super.field23 > this.field1367 + 5 || super.field23 < this.field1367 - 5 || super.field24 > this.field1368 + 5 || super.field24 < this.field1368 - 5) {
                    this.field1385 = true;
                }
                if (super.field22 == 0) {
                    if (this.field1366 == 2) {
                        this.field1200 = true;
                    }
                    if (this.field1366 == 3) {
                        this.field1528 = true;
                    }
                    this.field1366 = 0;
                    if (this.field1385 && this.field1251 >= 5) {
                        this.field1525 = -1;
                        this.method438(true);
                        if (this.field1525 == this.field1364 && this.field1524 != this.field1365) {
                            Component var21 = Component.field70[this.field1364];
                            byte var22 = 0;
                            if (this.field1522 == 1 && var21.field79 == 206) {
                                var22 = 1;
                            }
                            if (var21.field71[this.field1524] <= 0) {
                                var22 = 0;
                            }
                            if (var21.field100) {
                                int var23 = this.field1365;
                                int var24 = this.field1524;
                                var21.field71[var24] = var21.field71[var23];
                                var21.field72[var24] = var21.field72[var23];
                                var21.field71[var23] = -1;
                                var21.field72[var23] = 0;
                            } else if (var22 == 1) {
                                int var25 = this.field1365;
                                int var26 = this.field1524;
                                while (var25 != var26) {
                                    if (var25 > var26) {
                                        var21.method33(var25 - 1, var25, 6);
                                        --var25;
                                    } else if (var25 < var26) {
                                        var21.method33(var25 + 1, var25, 6);
                                        ++var25;
                                    }
                                }
                            } else {
                                var21.method33(this.field1524, this.field1365, 6);
                            }
                            this.field1543.method228(4, 176);
                            this.field1543.method230(this.field1364);
                            this.field1543.method230(this.field1365);
                            this.field1543.method230(this.field1524);
                            this.field1543.method229(var22);
                        }
                    } else if ((this.field1495 == 1 || this.method524(this.field1314 - 1, 0)) && this.field1314 > 2) {
                        this.method493(-2068);
                    } else if (this.field1314 > 0) {
                        this.method433((byte) 7, this.field1314 - 1);
                    }
                    this.field1222 = 10;
                    super.field29 = 0;
                }
            }
            ++field1596;
            if (field1596 > 62) {
                field1596 = 0;
                this.field1543.method228(4, 182);
            }
            if (World3D.field330 != -1) {
                int var27 = World3D.field330;
                int var28 = World3D.field331;
                boolean var29 = this.method488(0, 0, 0, 9, var27, 0, field1231.field461[0], field1231.field460[0], var28, true, 0, 0);
                World3D.field330 = -1;
                if (var29) {
                    this.field1498 = super.field30;
                    this.field1499 = super.field31;
                    this.field1501 = 1;
                    this.field1500 = 0;
                }
            }
            if (super.field29 == 1 && this.field1635 != null) {
                this.field1635 = null;
                this.field1528 = true;
                super.field29 = 0;
            }
            this.method518(this.field1435);
            this.method502((byte) 8);
            this.method467(-20582);
            this.method562((byte) 66);
            if (super.field22 == 1 || super.field29 == 1) {
                ++this.field1361;
            }
            if (this.field1317 == 2) {
                this.method441(-7692);
            }
            if (this.field1317 == 2 && this.field1362) {
                this.method495(this.field1459);
            }
            for (int var30 = 0; var30 < 5; ++var30) {
                int var10002 = this.field1412[var30]++;
            }
            this.method464(-43726);
            ++super.field21;
            if (super.field21 > 4500) {
                this.field1432 = 250;
                super.field21 -= 500;
                this.field1543.method228(4, 144);
            }
            ++this.field1293;
            if (this.field1293 > 500) {
                this.field1293 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field1556 += this.field1557;
                }
                if ((var31 & 2) == 2) {
                    this.field1272 += this.field1273;
                }
                if ((var31 & 4) == 4) {
                    this.field1445 += this.field1446;
                }
            }
            if (this.field1556 < -50) {
                this.field1557 = 2;
            }
            if (this.field1556 > 50) {
                this.field1557 = -2;
            }
            if (this.field1272 < -55) {
                this.field1273 = 2;
            }
            if (this.field1272 > 55) {
                this.field1273 = -2;
            }
            if (this.field1445 < -40) {
                this.field1446 = 1;
            }
            if (this.field1445 > 40) {
                this.field1446 = -1;
            }
            ++this.field1447;
            if (this.field1447 > 500) {
                this.field1447 = 0;
                int var32 = (int) (Math.random() * 8.0D);
                if ((var32 & 1) == 1) {
                    this.field1278 += this.field1279;
                }
                if ((var32 & 2) == 2) {
                    this.field1348 += this.field1349;
                }
            }
            if (this.field1278 < -60) {
                this.field1279 = 2;
            }
            if (this.field1278 > 60) {
                this.field1279 = -2;
            }
            if (this.field1348 < -20) {
                this.field1349 = 1;
            }
            if (this.field1348 > 10) {
                this.field1349 = -1;
            }
            ++this.field1431;
            if (this.field1431 > 50) {
                this.field1543.method228(4, 239);
            }
            try {
                if (this.field1607 != null && this.field1543.field711 > 0) {
                    this.field1607.method42(this.field1543.field710, 0, 0, this.field1543.field711);
                    this.field1543.field711 = 0;
                    this.field1431 = 0;
                }
            } catch (IOException var34) {
                this.method561(this.field1405);
            } catch (Exception var35) {
                this.method479(0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method537(int arg0) {
        if (arg0 != 0) {
            this.field1406 = null;
        }
        this.field1450 = 0;
        int var2 = (field1231.field410 >> 7) + this.field1487;
        int var3 = (field1231.field411 >> 7) + this.field1488;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1450 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1450 = 1;
        }
        if (this.field1450 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1450 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method538(int arg0) {
        this.field1485.method268((byte) 9);
        Pix3D.field647 = this.field1613;
        this.field1297.method212(1, 0, 0);
        if (this.field1611) {
            this.field1346.method214(40, this.field1576, 0, 239, 0);
            this.field1346.method214(60, this.field1588 + "*", 0, 239, 128);
        } else if (this.field1621) {
            this.field1346.method214(40, "Enter amount:", 0, 239, 0);
            this.field1346.method214(60, this.field1584 + "*", 0, 239, 128);
        } else if (this.field1635 != null) {
            this.field1346.method214(40, this.field1635, 0, 239, 0);
            this.field1346.method214(60, "Click to continue", 0, 239, 128);
        } else if (this.field1558 != -1) {
            this.method446(field1421, 0, Component.field70[this.field1558], 0, 0);
        } else if (this.field1289 != -1) {
            this.method446(field1421, 0, Component.field70[this.field1289], 0, 0);
        } else {
            PixFont var2 = this.field1345;
            int var3 = 0;
            Pix2D.method167(463, true, 0, 77, 0);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1247[var4] != null) {
                    int var6 = this.field1245[var4];
                    int var7 = 70 - var3 * 14 + this.field1343;
                    String var8 = this.field1246[var4];
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
                            var2.method217(0, 4, var7, this.field1537, this.field1247[var4]);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1583 == 0 || this.field1583 == 1 && this.method448(var8, (byte) -97))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field1630[0].method212(1, var10, var7 - 12);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field1630[1].method212(1, var10, var7 - 12);
                                var10 += 14;
                            }
                            var2.method217(0, var10, var7, this.field1537, var8 + ":");
                            int var11 = var10 + var2.method216(var8, true) + 8;
                            var2.method217(255, var11, var7, this.field1537, this.field1247[var4]);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field1342 == 0 && (var6 == 7 || this.field1625 == 0 || this.field1625 == 1 && this.method448(var8, (byte) -97))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method217(0, var12, var7, this.field1537, "From");
                            int var13 = var12 + var2.method216("From ", true);
                            if (var9 == 1) {
                                this.field1630[0].method212(1, var13, var7 - 12);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field1630[1].method212(1, var13, var7 - 12);
                                var13 += 14;
                            }
                            var2.method217(0, var13, var7, this.field1537, var8 + ":");
                            int var14 = var13 + var2.method216(var8, true) + 8;
                            var2.method217(8388608, var14, var7, this.field1537, this.field1247[var4]);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field1554 == 0 || this.field1554 == 1 && this.method448(var8, (byte) -97))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method217(8388736, 4, var7, this.field1537, var8 + " " + this.field1247[var4]);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field1342 == 0 && this.field1625 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method217(8388608, 4, var7, this.field1537, this.field1247[var4]);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field1342 == 0 && this.field1625 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method217(0, 4, var7, this.field1537, "To " + var8 + ":");
                            var2.method217(8388608, 12 + var2.method216("To " + var8, true), var7, this.field1537, this.field1247[var4]);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field1554 == 0 || this.field1554 == 1 && this.method448(var8, (byte) -97))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method217(8270336, 4, var7, this.field1537, var8 + " " + this.field1247[var4]);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method166(579);
            this.field1509 = var3 * 14 + 7;
            if (this.field1509 < 78) {
                this.field1509 = 78;
            }
            this.method478(this.field1592, 77, this.field1509, 463, this.field1509 - this.field1343 - 77, 0);
            String var5;
            if (field1231 != null && field1231.field468 != null) {
                var5 = field1231.field468;
            } else {
                var5 = JString.method314(true, this.field1426);
            }
            var2.method217(0, 4, 90, this.field1537, var5 + ":");
            var2.method217(255, 6 + var2.method216(var5 + ": ", true), 90, this.field1537, this.field1555 + "*");
            Pix2D.method173(0, 77, 4, 0, 479);
        }
        if (this.field1384 && this.field1214 == 2) {
            this.method548((byte) -122);
        }
        this.field1485.method269(357, 17, super.field15, true);
        if (arg0 == 0) {
            this.field1484.method268((byte) 9);
            Pix3D.field647 = this.field1615;
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method539(int arg0) {
        SpotAnimEntity var2 = (SpotAnimEntity) this.field1423.method258();
        if (this.field1449 != arg0) {
            this.field1531 = -452;
        }
        while (var2 != null) {
            if (this.field1277 == var2.field610 && !var2.field616) {
                if (field1591 >= var2.field609) {
                    var2.method164(this.field1464, -254);
                    if (var2.field616) {
                        var2.method120();
                    } else {
                        this.field1325.method75(0, -1, 60, var2.field611, var2, true, var2.field613, var2.field610, false, var2.field612);
                    }
                }
            } else {
                var2.method120();
            }
            var2 = (SpotAnimEntity) this.field1423.method260(6);
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method540(int arg0) {
        ++this.field1320;
        this.method528(true, 39);
        this.method477(true, 47055);
        this.method528(false, 39);
        this.method477(false, 47055);
        this.method559(112);
        this.method539(9);
        if (!this.field1362) {
            int var2 = this.field1252;
            if (this.field1394 / 256 > var2) {
                var2 = this.field1394 / 256;
            }
            if (this.field1649[4] && this.field1520[4] + 128 > var2) {
                var2 = this.field1520[4] + 128;
            }
            int var3 = this.field1445 + this.field1253 & 2047;
            this.method525(var2, this.field1372, this.method470(field1231.field411, this.field1277, field1231.field410, 9803) - 50, this.field1373, 7, var2 * 3 + 600, var3);
        }
        int var4;
        if (!this.field1362) {
            var4 = this.method481((byte) 34);
        } else {
            var4 = this.method482(this.field1433);
        }
        int var5 = this.field1266;
        int var6 = this.field1267;
        int var7 = this.field1268;
        int var8 = this.field1269;
        int var9 = this.field1270;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field1649[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field1261[var10] * 2 + 1) - (double) this.field1261[var10] + Math.sin((double) this.field1311[var10] / 100.0D * (double) this.field1412[var10]) * (double) this.field1520[var10]);
                if (var10 == 0) {
                    this.field1266 += var12;
                }
                if (var10 == 1) {
                    this.field1267 += var12;
                }
                if (var10 == 2) {
                    this.field1268 += var12;
                }
                if (var10 == 3) {
                    this.field1270 = this.field1270 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field1269 += var12;
                    if (this.field1269 < 128) {
                        this.field1269 = 128;
                    }
                    if (this.field1269 > 383) {
                        this.field1269 = 383;
                    }
                }
            }
        }
        int var11 = Pix3D.field656;
        Model.field597 = true;
        Model.field600 = 0;
        Model.field598 = super.field23 - 4;
        Model.field599 = super.field24 - 4;
        Pix2D.method168(-170);
        this.field1325.method103(this.field1266, this.field1268, this.field1269, this.field1267, var4, this.field1270, 5);
        this.field1325.method78(-673);
        this.method557(0);
        this.method499(336);
        this.method494(var11, -40822);
        this.method535(864);
        this.field1484.method269(4, 4, super.field15, true);
        this.field1266 = var5;
        this.field1267 = var6;
        this.field1268 = var7;
        this.field1269 = var8;
        this.field1270 = var9;
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ[B)V")
    public final void method541(int arg0, boolean arg1, byte[] arg2) {
        signlink.midifade = arg1 ? 1 : 0;
        signlink.midisave(arg2, arg2.length);
        if (arg0 >= 0) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIBIIIIII)V")
    private final void method542(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        for (LocSpawned var12 = (LocSpawned) this.field1636.method258(); var12 != null; var12 = (LocSpawned) this.field1636.method260(6)) {
            if (var12.field729 == arg0 && var12.field731 == arg1 && var12.field732 == arg8 && var12.field730 == arg6) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field729 = arg0;
            var11.field730 = arg6;
            var11.field731 = arg1;
            var11.field732 = arg8;
            this.method454(341, var11);
            this.field1636.method255(var11);
        }
        var11.field736 = arg4;
        var11.field738 = arg5;
        if (arg3 == 8) {
            boolean var13 = false;
        } else {
            this.field1543.method229(72);
        }
        var11.field737 = arg9;
        var11.field739 = arg2;
        var11.field740 = arg7;
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public static final void method543(byte arg0) {
        World3D.field296 = false;
        Pix3D.field636 = false;
        field1242 = false;
        World.field44 = false;
        if (arg0 != -22) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1369) {
            this.method523(38950);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)Ljava/lang/String;")
    private static final String method544(byte arg0, int arg1) {
        if (arg0 != 0) {
            field1421 = -143;
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method545(int arg0) {
        this.field1627 = false;
        while (this.field1395) {
            this.field1627 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1392 = null;
        this.field1393 = null;
        this.field1626 = null;
        this.field1639 = null;
        this.field1640 = null;
        this.field1641 = null;
        this.field1642 = null;
        this.field1264 = null;
        this.field1265 = null;
        if (arg0 != 9) {
            this.field1429 = -1;
        }
        this.field1465 = null;
        this.field1466 = null;
        this.field1518 = null;
        this.field1519 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILd;)I")
    public final int method546(int arg0, int arg1, Component arg2) {
        if (arg1 != -10666) {
            this.field1406 = null;
        }
        if (arg2.field85 != null && arg0 < arg2.field85.length) {
            try {
                int[] var4 = arg2.field85[arg0];
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
                        var9 = this.field1419[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field1467[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field1575[var4[var6++]];
                    }
                    if (var8 == 4) {
                        Component var11 = Component.field70[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < ObjType.field1016 && (!ObjType.method350(var12).field1037 || field1241)) {
                            for (int var13 = 0; var13 < var11.field71.length; ++var13) {
                                if (var12 + 1 == var11.field71[var13]) {
                                    var9 += var11.field72[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field1211[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field1474[this.field1467[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field1211[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field1231.field474;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < Stats.field1128; ++var14) {
                            if (Stats.field1130[var14]) {
                                var9 += this.field1467[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        Component var15 = Component.field70[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < ObjType.field1016 && (!ObjType.method350(var16).field1037 || field1241)) {
                            for (int var17 = 0; var17 < var15.field71.length; ++var17) {
                                if (var15.field71[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field1326;
                    }
                    if (var8 == 12) {
                        var9 = this.field1404;
                    }
                    if (var8 == 13) {
                        int var18 = this.field1211[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        VarbitType var21 = VarbitType.field1147[var20];
                        int var22 = var21.field1149;
                        int var23 = var21.field1150;
                        int var24 = var21.field1151;
                        int var25 = field1471[var24 - var23];
                        var9 = this.field1211[var22] >> var23 & var25;
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
                        var9 = (field1231.field410 >> 7) + this.field1487;
                    }
                    if (var8 == 19) {
                        var9 = (field1231.field411 >> 7) + this.field1488;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIZI)V")
    private final void method547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if (arg6) {
            this.field1316 = 191;
        }
        if (arg7 >= 1 && arg3 >= 1 && arg7 <= 102 && arg3 <= 102) {
            if (field1242 && this.field1277 != arg0) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg4 == 0) {
                var9 = this.field1325.method90(arg0, arg7, arg3);
            }
            if (arg4 == 1) {
                var9 = this.field1325.method91(arg7, arg0, 4, arg3);
            }
            if (arg4 == 2) {
                var9 = this.field1325.method92(arg0, arg7, arg3);
            }
            if (arg4 == 3) {
                var9 = this.field1325.method93(arg0, arg7, arg3);
            }
            if (var9 != 0) {
                int var13 = this.field1325.method94(arg0, arg7, arg3, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg4 == 0) {
                    this.field1325.method81(arg7, arg0, 0, arg3);
                    LocType var17 = LocType.method334(var14);
                    if (var17.field943) {
                        this.field1233[arg0].method366(var15, this.field1210, arg7, var16, arg3, var17.field944);
                    }
                }
                if (arg4 == 1) {
                    this.field1325.method82(arg7, arg3, true, arg0);
                }
                if (arg4 == 2) {
                    this.field1325.method83(-493, arg3, arg7, arg0);
                    LocType var18 = LocType.method334(var14);
                    if (var18.field941 + arg7 > 103 || var18.field941 + arg3 > 103 || var18.field942 + arg7 > 103 || var18.field942 + arg3 > 103) {
                        return;
                    }
                    if (var18.field943) {
                        this.field1233[arg0].method367(var18.field944, var18.field941, arg3, (byte) 124, var18.field942, var16, arg7);
                    }
                }
                if (arg4 == 3) {
                    this.field1325.method84(arg0, arg3, true, arg7);
                    LocType var19 = LocType.method334(var14);
                    if (var19.field943 && var19.field945) {
                        this.field1233[arg0].method369(false, arg3, arg7);
                    }
                }
            }
            if (arg2 >= 0) {
                int var20 = arg0;
                if (arg0 < 3 && (this.field1512[1][arg7][arg3] & 2) == 2) {
                    var20 = arg0 + 1;
                }
                World.method31(arg1, arg7, this.field1233[arg0], arg3, arg5, arg2, this.field1325, this.field1276, 6, var20, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method548(byte arg0) {
        int var2 = this.field1215;
        int var3 = this.field1216;
        int var4 = this.field1217;
        int var5 = this.field1218;
        int var6 = 6116423;
        Pix2D.method170(var5, var4, var2, var3, (byte) 3, var6);
        Pix2D.method170(16, var4 - 2, var2 + 1, var3 + 1, (byte) 3, 0);
        Pix2D.method171(0, var4 - 2, var3 + 18, true, var2 + 1, var5 - 19);
        this.field1346.method217(var6, var2 + 3, var3 + 14, this.field1537, "Choose Option");
        int var7 = super.field23;
        int var8 = super.field24;
        if (arg0 != -122) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
        if (this.field1214 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field1214 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field1214 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var10 = 0; var10 < this.field1314; ++var10) {
            int var11 = (this.field1314 - 1 - var10) * 15 + var3 + 31;
            int var12 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var11 - 13 && var8 < var11 + 3) {
                var12 = 16776960;
            }
            this.field1346.method219(true, this.field1292[var10], var11, (byte) 45, var12, var2 + 3);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Lmb;II)V")
    private final void method549(Packet arg0, int arg1, int arg2) {
        this.field1453 = 0;
        this.field1381 = 0;
        this.method466(false, arg2, arg0);
        this.method519(arg0, arg2, 832);
        this.method551(arg2, 0, arg0);
        this.method497(true, arg0, arg2);
        for (int var4 = 0; var4 < this.field1453; ++var4) {
            int var6 = this.field1454[var4];
            if (field1591 != this.field1378[var6].field455) {
                this.field1378[var6] = null;
            }
        }
        if (arg1 > 0) {
            if (arg0.field711 != arg2) {
                signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field711 + " psize:" + arg2);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field1379; ++var5) {
                    if (this.field1378[this.field1380[var5]] == null) {
                        signlink.reporterror(this.field1426 + " null entry in pl list - pos:" + var5 + " size:" + this.field1379);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)Ljava/lang/String;")
    public final String method550(int arg0) {
        if (arg0 >= 0) {
            this.field1406 = null;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field18 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILmb;)V")
    private final void method551(int arg0, int arg1, Packet arg2) {
        while (true) {
            if (arg2.field712 + 10 < arg0 * 8) {
                int var4 = arg2.method250(-416, 11);
                if (var4 != 2047) {
                    if (this.field1378[var4] == null) {
                        this.field1378[var4] = new PlayerEntity();
                        if (this.field1383[var4] != null) {
                            this.field1378[var4].method130(this.field1383[var4], true);
                        }
                    }
                    this.field1380[this.field1379++] = var4;
                    PlayerEntity var5 = this.field1378[var4];
                    var5.field455 = field1591;
                    int var6 = arg2.method250(-416, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg2.method250(-416, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg2.method250(-416, 1);
                    var5.method124(field1231.field461[0] + var7, field1231.field460[0] + var6, false, var8 == 1);
                    int var9 = arg2.method250(-416, 1);
                    if (var9 == 1) {
                        this.field1382[this.field1381++] = var4;
                    }
                    continue;
                }
            }
            arg2.method251(6);
            if (arg1 != 0) {
                this.field1429 = -1;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method552(byte arg0) {
        if (arg0 != 6) {
            field1593 = this.field1461.method305();
        }
        if (this.field1493 == 0) {
            int var2 = super.field13 / 2 - 80;
            int var3 = super.field14 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field29 == 1 && super.field30 >= var2 - 75 && super.field30 <= var2 + 75 && super.field31 >= var14 - 20 && super.field31 <= var14 + 20) {
                this.field1493 = 3;
                this.field1422 = 0;
            }
            int var4 = super.field13 / 2 + 80;
            if (super.field29 == 1 && super.field30 >= var4 - 75 && super.field30 <= var4 + 75 && super.field31 >= var14 - 20 && super.field31 <= var14 + 20) {
                this.field1417 = "";
                this.field1418 = "Enter your username & password.";
                this.field1493 = 2;
                this.field1422 = 0;
            }
        } else if (this.field1493 == 2) {
            int var5 = super.field14 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field29 == 1 && super.field31 >= var16 - 15 && super.field31 < var16) {
                this.field1422 = 0;
            }
            var5 = var16 + 15;
            if (super.field29 == 1 && super.field31 >= var5 - 15 && super.field31 < var5) {
                this.field1422 = 1;
            }
            var5 += 15;
            int var6 = super.field13 / 2 - 80;
            int var7 = super.field14 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field29 == 1 && super.field30 >= var6 - 75 && super.field30 <= var6 + 75 && super.field31 >= var17 - 20 && super.field31 <= var17 + 20) {
                this.method459(this.field1426, this.field1427, false);
                if (this.field1238) {
                    return;
                }
            }
            int var8 = super.field13 / 2 + 80;
            if (super.field29 == 1 && super.field30 >= var8 - 75 && super.field30 <= var8 + 75 && super.field31 >= var17 - 20 && super.field31 <= var17 + 20) {
                this.field1493 = 0;
                this.field1426 = "";
                this.field1427 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5(this.field1312);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1258.length(); ++var11) {
                        if (var9 == field1258.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1422 == 0) {
                        if (var9 == 8 && this.field1426.length() > 0) {
                            this.field1426 = this.field1426.substring(0, this.field1426.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1422 = 1;
                        }
                        if (var10) {
                            this.field1426 = this.field1426 + (char) var9;
                        }
                        if (this.field1426.length() > 12) {
                            this.field1426 = this.field1426.substring(0, 12);
                        }
                    } else if (this.field1422 == 1) {
                        if (var9 == 8 && this.field1427.length() > 0) {
                            this.field1427 = this.field1427.substring(0, this.field1427.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1422 = 0;
                        }
                        if (var10) {
                            this.field1427 = this.field1427 + (char) var9;
                        }
                        if (this.field1427.length() > 20) {
                            this.field1427 = this.field1427.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1493 == 3) {
                int var12 = super.field13 / 2;
                int var13 = super.field14 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field29 == 1 && super.field30 >= var12 - 75 && super.field30 <= var12 + 75 && super.field31 >= var18 - 20 && super.field31 <= var18 + 20) {
                    this.field1493 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method553(byte arg0) {
        if (arg0 != 6) {
            this.field1406 = null;
        }
        try {
            this.field1638 = -1;
            this.field1423.method262();
            this.field1451.method262();
            Pix3D.method180(2);
            this.method457(0);
            this.field1325.method64(29142);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1233[var2].method361(true);
            }
            System.gc();
            World var3 = new World(this.field1512, this.field1276, 104, 2, 104);
            int var4 = this.field1472.length;
            World.field44 = World3D.field296;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1504[var5] >> 8;
                int var7 = this.field1504[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field44 = false;
                }
            }
            if (World.field44) {
                this.field1325.method65((byte) -9, this.field1277);
            } else {
                this.field1325.method65((byte) -9, 0);
            }
            this.field1543.method228(4, 239);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1504[var8] >> 8) * 64 - this.field1487;
                int var10 = (this.field1504[var8] & 255) * 64 - this.field1488;
                byte[] var11 = this.field1472[var8];
                if (var11 != null) {
                    var3.method15(var9, (this.field1480 - 6) * 8, var11, (this.field1481 - 6) * 8, 0, var10);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field1504[var12] >> 8) * 64 - this.field1487;
                int var14 = (this.field1504[var12] & 255) * 64 - this.field1488;
                byte[] var15 = this.field1472[var12];
                if (var15 == null && this.field1481 < 800) {
                    var3.method14((byte) 1, 64, var13, var14, 64);
                }
            }
            this.field1543.method228(4, 239);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field1436[var16];
                if (var17 != null) {
                    int var18 = (this.field1504[var16] >> 8) * 64 - this.field1487;
                    int var19 = (this.field1504[var16] & 255) * 64 - this.field1488;
                    var3.method18(var19, this.field1325, var18, var17, this.field1233, (byte) 2);
                }
            }
            this.field1543.method228(4, 239);
            var3.method20(this.field1325, this.field1233, 44106);
            this.field1484.method268((byte) 9);
            this.field1543.method228(4, 239);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method529(var20, var21);
                }
            }
            this.method555(this.field1318);
        } catch (Exception var34) {
        }
        LocType.field968.method117();
        if (field1242 && signlink.cache_dat != null) {
            int var23 = this.field1415.method282(0, (byte) -1);
            for (int var24 = 0; var24 < var23; ++var24) {
                int var25 = this.field1415.method287((byte) 5, var24);
                if ((var25 & 121) == 0) {
                    Model.method138(true, var24);
                }
            }
        }
        System.gc();
        Pix3D.method181(0, 20);
        this.field1415.method293(0);
        int var26 = (this.field1480 - 6) / 8 - 1;
        int var27 = (this.field1480 + 6) / 8 + 1;
        int var28 = (this.field1481 - 6) / 8 - 1;
        int var29 = (this.field1481 + 6) / 8 + 1;
        if (this.field1275) {
            var26 = 49;
            var27 = 50;
            var28 = 49;
            var29 = 50;
        }
        for (int var30 = var26; var30 <= var27; ++var30) {
            for (int var31 = var28; var31 <= var29; ++var31) {
                if (var26 == var30 || var27 == var30 || var28 == var31 || var29 == var31) {
                    int var32 = this.field1415.method284(var30, var31, 0, field1341);
                    if (var32 != -1) {
                        this.field1415.method294(3, var32, 0);
                    }
                    int var33 = this.field1415.method284(var30, var31, 1, field1341);
                    if (var33 != -1) {
                        this.field1415.method294(3, var33, 0);
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;B)V")
    public final void method554(Pix8 arg0, byte arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1264.length; ++var4) {
            this.field1264[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var19 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1264[var19] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var15 = 1; var15 < var3 - 1; ++var15) {
                for (int var17 = 1; var17 < 127; ++var17) {
                    int var18 = (var15 << 7) + var17;
                    this.field1265[var18] = (this.field1264[var18 - 1] + this.field1264[var18 + 1] + this.field1264[var18 - 128] + this.field1264[var18 + 128]) / 4;
                }
            }
            int[] var16 = this.field1264;
            this.field1264 = this.field1265;
            this.field1265 = var16;
        }
        if (arg1 == 1) {
            boolean var7 = false;
        } else {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
        if (arg0 != null) {
            int var9 = 0;
            for (int var10 = 0; var10 < arg0.field677; ++var10) {
                for (int var11 = 0; var11 < arg0.field676; ++var11) {
                    if (arg0.field674[var9++] != 0) {
                        int var12 = var11 + 16 + arg0.field678;
                        int var13 = var10 + 16 + arg0.field679;
                        int var14 = (var13 << 7) + var12;
                        this.field1264[var14] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    private final void method555(int arg0) {
        if (arg0 <= 0) {
            this.field1406 = null;
        }
        for (LocSpawned var2 = (LocSpawned) this.field1636.method258(); var2 != null; var2 = (LocSpawned) this.field1636.method260(6)) {
            if (var2.field740 == -1) {
                var2.field739 = 0;
                this.method454(341, var2);
            } else {
                var2.method120();
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljb;III)V")
    public final void method556(Pix32 arg0, int arg1, int arg2, int arg3) {
        int var5 = 16 / arg3;
        int var6 = arg1 * arg1 + arg2 * arg2;
        if (var6 > 4225 && var6 < 90000) {
            int var7 = this.field1278 + this.field1253 & 2047;
            int var8 = Model.field602[var7];
            int var9 = Model.field603[var7];
            int var10 = var8 * 256 / (this.field1348 + 256);
            int var11 = var9 * 256 / (this.field1348 + 256);
            int var12 = arg1 * var11 + arg2 * var10 >> 16;
            int var13 = arg2 * var11 - arg1 * var10 >> 16;
            double var14 = Math.atan2((double) var12, (double) var13);
            int var16 = (int) (Math.sin(var14) * 63.0D);
            int var17 = (int) (Math.cos(var14) * 57.0D);
            this.field1590.method204(83 - var17 - 20, 20, 256, 15, var16 + 94 + 4 - 10, 4, 20, var14, 15);
        } else {
            this.method473(arg0, 0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "N", descriptor = "(I)V")
    public final void method557(int arg0) {
        this.field1328 = 0;
        for (int var2 = -1; var2 < this.field1379 + this.field1220; ++var2) {
            PathingEntity var17;
            if (var2 == -1) {
                var17 = field1231;
            } else if (var2 < this.field1379) {
                var17 = this.field1378[this.field1380[var2]];
            } else {
                var17 = this.field1219[this.field1221[var2 - this.field1379]];
            }
            if (var17 != null && var17.method127(-323)) {
                if (var2 >= this.field1379) {
                    NpcType var21 = ((NpcEntity) var17).field465;
                    if (var21.field1008 >= 0 && var21.field1008 < this.field1559.length) {
                        this.method486(var17.field456 + 15, (byte) 99, var17);
                        if (this.field1298 > -1) {
                            this.field1559[var21.field1008].method199(1, this.field1298 - 12, this.field1299 - 30);
                        }
                    }
                    if (this.field1458 == 1 && this.field1221[var2 - this.field1379] == this.field1234 && field1591 % 20 < 10) {
                        this.method486(var17.field456 + 15, (byte) 99, var17);
                        if (this.field1298 > -1) {
                            this.field1559[2].method199(1, this.field1298 - 12, this.field1299 - 28);
                        }
                    }
                } else {
                    int var18 = 30;
                    PlayerEntity var19 = (PlayerEntity) var17;
                    if (var19.field471 != 0) {
                        this.method486(var17.field456 + 15, (byte) 99, var17);
                        if (this.field1298 > -1) {
                            for (int var20 = 0; var20 < 8; ++var20) {
                                if ((var19.field471 & 1 << var20) != 0) {
                                    this.field1559[var20].method199(1, this.field1298 - 12, this.field1299 - var18);
                                    var18 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1458 == 10 && this.field1380[var2] == this.field1437) {
                        this.method486(var17.field456 + 15, (byte) 99, var17);
                        if (this.field1298 > -1) {
                            this.field1559[7].method199(1, this.field1298 - 12, this.field1299 - var18);
                        }
                    }
                }
                if (var17.field422 != null && (var2 >= this.field1379 || this.field1583 == 0 || this.field1583 == 3 || this.field1583 == 1 && this.method448(((PlayerEntity) var17).field468, (byte) -97))) {
                    this.method486(var17.field456, (byte) 99, var17);
                    if (this.field1298 > -1 && this.field1328 < this.field1329) {
                        this.field1333[this.field1328] = this.field1346.method216(var17.field422, true) / 2;
                        this.field1332[this.field1328] = this.field1346.field694;
                        this.field1330[this.field1328] = this.field1298;
                        this.field1331[this.field1328] = this.field1299;
                        this.field1334[this.field1328] = var17.field424;
                        this.field1335[this.field1328] = var17.field425;
                        this.field1336[this.field1328] = var17.field423;
                        this.field1337[this.field1328++] = var17.field422;
                        if (this.field1386 == 0 && var17.field425 == 1) {
                            this.field1332[this.field1328] += 10;
                            this.field1331[this.field1328] += 5;
                        }
                        if (this.field1386 == 0 && var17.field425 == 2) {
                            this.field1333[this.field1328] = 60;
                        }
                    }
                }
                if (var17.field429 > field1591) {
                    this.method486(var17.field456 + 15, (byte) 99, var17);
                    if (this.field1298 > -1) {
                        int var22 = var17.field430 * 30 / var17.field431;
                        if (var22 > 30) {
                            var22 = 30;
                        }
                        Pix2D.method170(5, var22, this.field1298 - 15, this.field1299 - 3, (byte) 3, 65280);
                        Pix2D.method170(5, 30 - var22, this.field1298 - 15 + var22, this.field1299 - 3, (byte) 3, 16711680);
                    }
                }
                for (int var23 = 0; var23 < 4; ++var23) {
                    if (var17.field428[var23] > field1591) {
                        this.method486(var17.field456 / 2, (byte) 99, var17);
                        if (this.field1298 > -1) {
                            if (var23 == 1) {
                                this.field1299 -= 20;
                            }
                            if (var23 == 2) {
                                this.field1298 -= 15;
                                this.field1299 -= 10;
                            }
                            if (var23 == 3) {
                                this.field1298 += 15;
                                this.field1299 -= 10;
                            }
                            this.field1353[var17.field427[var23]].method199(1, this.field1298 - 12, this.field1299 - 12);
                            this.field1344.method214(this.field1299 + 4, String.valueOf(var17.field426[var23]), 0, this.field1298, 0);
                            this.field1344.method214(this.field1299 + 3, String.valueOf(var17.field426[var23]), 0, this.field1298 - 1, 16777215);
                        }
                    }
                }
            }
        }
        this.field1428 += arg0;
        for (int var3 = 0; var3 < this.field1328; ++var3) {
            int var4 = this.field1330[var3];
            int var5 = this.field1331[var3];
            int var6 = this.field1333[var3];
            int var7 = this.field1332[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var16 = 0; var16 < var3; ++var16) {
                    if (var5 + 2 > this.field1331[var16] - this.field1332[var16] && var5 - var7 < this.field1331[var16] + 2 && var4 - var6 < this.field1333[var16] + this.field1330[var16] && var4 + var6 > this.field1330[var16] - this.field1333[var16] && this.field1331[var16] - this.field1332[var16] < var5) {
                        var5 = this.field1331[var16] - this.field1332[var16];
                        var8 = true;
                    }
                }
            }
            this.field1298 = this.field1330[var3];
            this.field1299 = this.field1331[var3] = var5;
            String var9 = this.field1337[var3];
            if (this.field1386 == 0) {
                int var10 = 16776960;
                if (this.field1334[var3] < 6) {
                    var10 = this.field1244[this.field1334[var3]];
                }
                if (this.field1334[var3] == 6) {
                    var10 = this.field1320 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1334[var3] == 7) {
                    var10 = this.field1320 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1334[var3] == 8) {
                    var10 = this.field1320 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1334[var3] == 9) {
                    int var11 = 150 - this.field1336[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field1334[var3] == 10) {
                    int var12 = 150 - this.field1336[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field1334[var3] == 11) {
                    int var13 = 150 - this.field1336[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field1335[var3] == 0) {
                    this.field1346.method214(this.field1299 + 1, var9, 0, this.field1298, 0);
                    this.field1346.method214(this.field1299, var9, 0, this.field1298, var10);
                }
                if (this.field1335[var3] == 1) {
                    this.field1346.method218(this.field1320, 0, (byte) -94, this.field1298, var9, this.field1299 + 1);
                    this.field1346.method218(this.field1320, var10, (byte) -94, this.field1298, var9, this.field1299);
                }
                if (this.field1335[var3] == 2) {
                    int var14 = this.field1346.method216(var9, true);
                    int var15 = (150 - this.field1336[var3]) * (var14 + 100) / 150;
                    Pix2D.method167(this.field1298 + 50, true, this.field1298 - 50, 334, 0);
                    this.field1346.method217(0, this.field1298 + 50 - var15, this.field1299 + 1, this.field1537, var9);
                    this.field1346.method217(var10, this.field1298 + 50 - var15, this.field1299, this.field1537, var9);
                    Pix2D.method166(579);
                }
            } else {
                this.field1346.method214(this.field1299 + 1, var9, 0, this.field1298, 0);
                this.field1346.method214(this.field1299, var9, 0, this.field1298, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client", name = "O", descriptor = "(I)V")
    public final void method558(int arg0) {
        this.field1392 = new Pix8(this.field1371, "titlebox", 0);
        this.field1393 = new Pix8(this.field1371, "titlebutton", 0);
        this.field1626 = new Pix8[12];
        if (arg0 >= 0) {
            this.field1429 = -1;
        }
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field1626[var2] = new Pix8(this.field1371, "runes", var2);
        }
        this.field1518 = new Pix32(128, 265);
        this.field1519 = new Pix32(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field1518.field666[var3] = this.field1547.field749[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field1519.field666[var4] = this.field1548.field749[var4];
        }
        this.field1640 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field1640[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field1640[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1640[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1640[var8 + 192] = 16777215;
        }
        this.field1641 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1641[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1641[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1641[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1641[var12 + 192] = 16777215;
        }
        this.field1642 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1642[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1642[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1642[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1642[var16 + 192] = 16777215;
        }
        this.field1639 = new int[256];
        this.field1264 = new int[32768];
        this.field1265 = new int[32768];
        this.method554((Pix8) null, (byte) 1);
        this.field1465 = new int[32768];
        this.field1466 = new int[32768];
        this.method13((byte) 6, "Connecting to fileserver", 10);
        if (!this.field1627) {
            this.field1369 = true;
            this.field1627 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "P", descriptor = "(I)V")
    public final void method559(int arg0) {
        int var2 = 6 / arg0;
        for (ProjectileEntity var3 = (ProjectileEntity) this.field1451.method258(); var3 != null; var3 = (ProjectileEntity) this.field1451.method260(6)) {
            if (this.field1277 == var3.field506 && field1591 <= var3.field512) {
                if (field1591 >= var3.field511) {
                    if (var3.field515 > 0) {
                        NpcEntity var5 = this.field1219[var3.field515 - 1];
                        if (var5 != null && var5.field410 >= 0 && var5.field410 < 13312 && var5.field411 >= 0 && var5.field411 < 13312) {
                            var3.method133(var5.field411, this.method470(var5.field411, var3.field506, var5.field410, 9803) - var3.field510, (byte) 0, var5.field410, field1591);
                        }
                    }
                    if (var3.field515 < 0) {
                        int var6 = -var3.field515 - 1;
                        PlayerEntity var7;
                        if (this.field1542 == var6) {
                            var7 = field1231;
                        } else {
                            var7 = this.field1378[var6];
                        }
                        if (var7 != null && var7.field410 >= 0 && var7.field410 < 13312 && var7.field411 >= 0 && var7.field411 < 13312) {
                            var3.method133(var7.field411, this.method470(var7.field411, var3.field506, var7.field410, 9803) - var3.field510, (byte) 0, var7.field410, field1591);
                        }
                    }
                    var3.method134(-878, this.field1464);
                    this.field1325.method75(var3.field525, -1, 60, (int) var3.field517, var3, true, (int) var3.field519, this.field1277, false, (int) var3.field518);
                }
            } else {
                var3.method120();
            }
        }
        ++field1294;
        if (field1294 > 1174) {
            field1294 = 0;
            this.field1543.method228(4, 51);
            this.field1543.method229(0);
            int var4 = this.field1543.field711;
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1543.method230(11499);
            }
            this.field1543.method230(10548);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1543.method229(139);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1543.method229(94);
            }
            this.field1543.method230(51693);
            this.field1543.method229(16);
            this.field1543.method230(15036);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1543.method229(65);
            }
            this.field1543.method229((int) (Math.random() * 256.0D));
            this.field1543.method230(22990);
            this.field1543.method238(this.field1543.field711 - var4, true);
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public static final void method560(byte arg0) {
        World3D.field296 = true;
        if (arg0 != -106) {
            field1593 = 453;
        }
        Pix3D.field636 = true;
        field1242 = true;
        World.field44 = true;
    }

    @OriginalMember(owner = "client", name = "Q", descriptor = "(I)V")
    public final void method561(int arg0) {
        if (this.field1432 > 0) {
            this.method479(0);
        } else {
            this.field1484.method268((byte) 9);
            this.field1345.method214(144, "Connection lost", 0, 257, 0);
            this.field1345.method214(143, "Connection lost", 0, 256, 16777215);
            this.field1345.method214(159, "Please wait - attempting to reestablish", 0, 257, 0);
            this.field1345.method214(158, "Please wait - attempting to reestablish", 0, 256, 16777215);
            this.field1484.method269(4, 4, super.field15, true);
            this.field1301 = 0;
            if (this.field1323 != arg0) {
                this.field1429 = this.field1319.method239();
            }
            ClientStream var2 = this.field1607;
            this.field1238 = false;
            this.method459(this.field1426, this.field1427, true);
            if (!this.field1238) {
                this.method479(0);
            }
            try {
                var2.method38();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method562(byte arg0) {
        if (arg0 == 66) {
            if (super.field29 == 1) {
                if (super.field30 >= 6 && super.field30 <= 106 && super.field31 >= 467 && super.field31 <= 499) {
                    this.field1583 = (this.field1583 + 1) % 4;
                    this.field1243 = true;
                    this.field1528 = true;
                    this.field1543.method228(4, 129);
                    this.field1543.method229(this.field1583);
                    this.field1543.method229(this.field1625);
                    this.field1543.method229(this.field1554);
                }
                if (super.field30 >= 135 && super.field30 <= 235 && super.field31 >= 467 && super.field31 <= 499) {
                    this.field1625 = (this.field1625 + 1) % 3;
                    this.field1243 = true;
                    this.field1528 = true;
                    this.field1543.method228(4, 129);
                    this.field1543.method229(this.field1583);
                    this.field1543.method229(this.field1625);
                    this.field1543.method229(this.field1554);
                }
                if (super.field30 >= 273 && super.field30 <= 373 && super.field31 >= 467 && super.field31 <= 499) {
                    this.field1554 = (this.field1554 + 1) % 3;
                    this.field1243 = true;
                    this.field1528 = true;
                    this.field1543.method228(4, 129);
                    this.field1543.method229(this.field1583);
                    this.field1543.method229(this.field1625);
                    this.field1543.method229(this.field1554);
                }
                if (super.field30 >= 412 && super.field30 <= 512 && super.field31 >= 467 && super.field31 <= 499) {
                    this.method442(889);
                    this.field1444 = "";
                    this.field1623 = false;
                    for (int var2 = 0; var2 < Component.field70.length; ++var2) {
                        if (Component.field70[var2] != null && Component.field70[var2].field79 == 600) {
                            this.field1633 = this.field1523 = Component.field70[var2].field76;
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field1471[var1] = var0 - 1;
            var0 += var0;
        }
        field1474 = new int[99];
        int var2 = 0;
        for (int var3 = 0; var3 < 99; ++var3) {
            int var4 = var3 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var2 += var5;
            field1474[var3] = var2 / 4;
        }
        field1507 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field1538 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field1593 = 623;
    }
}
