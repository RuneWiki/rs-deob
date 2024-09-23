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

    @OriginalMember(owner = "client", name = "J", descriptor = "Ljava/lang/String;")
    private String field1208 = "";

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field1212 = -1;

    @OriginalMember(owner = "client", name = "O", descriptor = "Z")
    private boolean field1213 = false;

    @OriginalMember(owner = "client", name = "Q", descriptor = "Z")
    private boolean field1215 = false;

    @OriginalMember(owner = "client", name = "R", descriptor = "Z")
    public boolean field1216 = true;

    @OriginalMember(owner = "client", name = "U", descriptor = "Ljava/lang/String;")
    private String field1219 = "";

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field1224 = 50;

    @OriginalMember(owner = "client", name = "ab", descriptor = "[I")
    private int[] field1225 = new int[this.field1224];

    @OriginalMember(owner = "client", name = "bb", descriptor = "[I")
    private int[] field1226 = new int[this.field1224];

    @OriginalMember(owner = "client", name = "cb", descriptor = "[I")
    private int[] field1227 = new int[this.field1224];

    @OriginalMember(owner = "client", name = "db", descriptor = "[I")
    private int[] field1228 = new int[this.field1224];

    @OriginalMember(owner = "client", name = "eb", descriptor = "[I")
    private int[] field1229 = new int[this.field1224];

    @OriginalMember(owner = "client", name = "fb", descriptor = "[I")
    private int[] field1230 = new int[this.field1224];

    @OriginalMember(owner = "client", name = "gb", descriptor = "[I")
    private int[] field1231 = new int[this.field1224];

    @OriginalMember(owner = "client", name = "hb", descriptor = "[Ljava/lang/String;")
    private String[] field1232 = new String[this.field1224];

    @OriginalMember(owner = "client", name = "jb", descriptor = "B")
    private byte field1234 = 4;

    @OriginalMember(owner = "client", name = "kb", descriptor = "[Ljc;")
    private CollisionMap[] field1235 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "lb", descriptor = "Z")
    private boolean field1236 = false;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "Z")
    private boolean field1253 = false;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Lob;")
    private LinkList field1255 = new LinkList(false);

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field1256 = 7759444;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "Z")
    private boolean field1257 = true;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field1262 = 2;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "B")
    private byte field1263 = 37;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "[Lib;")
    private Pix32[] field1264 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Ob", descriptor = "[[I")
    private int[][] field1265 = new int[104][104];

    @OriginalMember(owner = "client", name = "Wb", descriptor = "[I")
    private int[] field1273 = new int[7];

    @OriginalMember(owner = "client", name = "ec", descriptor = "[[I")
    private int[][] field1281 = new int[104][104];

    @OriginalMember(owner = "client", name = "kc", descriptor = "[B")
    private byte[] field1287 = new byte[16384];

    @OriginalMember(owner = "client", name = "lc", descriptor = "I")
    private int field1288 = -1;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field1289 = -1;

    @OriginalMember(owner = "client", name = "nc", descriptor = "Z")
    private boolean field1290 = false;

    @OriginalMember(owner = "client", name = "oc", descriptor = "[I")
    private int[] field1291 = new int[5];

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field1292 = -455;

    @OriginalMember(owner = "client", name = "sc", descriptor = "[I")
    private int[] field1295 = new int[5];

    @OriginalMember(owner = "client", name = "tc", descriptor = "Z")
    private boolean field1296 = false;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "Z")
    private boolean field1304 = false;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "B")
    private byte field1314 = 2;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "[I")
    private int[] field1317 = new int[50];

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field1325 = 1;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private int field1331 = -173;

    @OriginalMember(owner = "client", name = "dd", descriptor = "Ljava/lang/String;")
    private String field1332 = "";

    @OriginalMember(owner = "client", name = "ed", descriptor = "Ljava/lang/String;")
    private String field1333 = "";

    @OriginalMember(owner = "client", name = "ld", descriptor = "[I")
    private final int[] field1340 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "md", descriptor = "[I")
    private int[] field1341 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "od", descriptor = "[I")
    private int[] field1343 = new int[33];

    @OriginalMember(owner = "client", name = "pd", descriptor = "Ljava/lang/String;")
    private String field1344 = "";

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field1346 = 2048;

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field1347 = 2047;

    @OriginalMember(owner = "client", name = "td", descriptor = "[Lab;")
    private PlayerEntity[] field1348 = new PlayerEntity[this.field1346];

    @OriginalMember(owner = "client", name = "vd", descriptor = "[I")
    public int[] field1350 = new int[this.field1346];

    @OriginalMember(owner = "client", name = "xd", descriptor = "[I")
    private int[] field1352 = new int[this.field1346];

    @OriginalMember(owner = "client", name = "yd", descriptor = "[Llb;")
    private Packet[] field1353 = new Packet[this.field1346];

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field1357 = 2301979;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "Z")
    private boolean field1358 = false;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "[[I")
    private int[][] field1373 = new int[104][104];

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private int field1374 = -1;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private int field1376 = -12224;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "[I")
    private int[] field1377 = new int[Stats.field1143];

    @OriginalMember(owner = "client", name = "be", descriptor = "B")
    private byte field1382 = 22;

    @OriginalMember(owner = "client", name = "ce", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1383 = new CRC32();

    @OriginalMember(owner = "client", name = "ie", descriptor = "Z")
    private boolean field1389 = false;

    @OriginalMember(owner = "client", name = "ne", descriptor = "Z")
    private boolean field1394 = false;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field1396 = 8;

    @OriginalMember(owner = "client", name = "qe", descriptor = "[I")
    private int[] field1397 = new int[33];

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field1398 = -1;

    @OriginalMember(owner = "client", name = "ve", descriptor = "[Ljava/lang/String;")
    private String[] field1402 = new String[500];

    @OriginalMember(owner = "client", name = "we", descriptor = "[J")
    private long[] field1403 = new long[200];

    @OriginalMember(owner = "client", name = "Ce", descriptor = "[Lib;")
    private Pix32[] field1409 = new Pix32[8];

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field1416 = -1;

    @OriginalMember(owner = "client", name = "Te", descriptor = "Lob;")
    private LinkList field1426 = new LinkList(false);

    @OriginalMember(owner = "client", name = "Ue", descriptor = "Z")
    private boolean field1427 = false;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "[Ljb;")
    private Pix8[] field1432 = new Pix8[100];

    @OriginalMember(owner = "client", name = "af", descriptor = "[I")
    private int[] field1433 = new int[Stats.field1143];

    @OriginalMember(owner = "client", name = "cf", descriptor = "[I")
    private int[] field1435 = new int[50];

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field1438 = 3;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Llb;")
    private Packet field1444 = Packet.method213(1, 1);

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field1445 = 11300;

    @OriginalMember(owner = "client", name = "of", descriptor = "[I")
    private int[] field1446 = new int[Stats.field1143];

    @OriginalMember(owner = "client", name = "vf", descriptor = "[I")
    private int[] field1453 = new int[50];

    @OriginalMember(owner = "client", name = "wf", descriptor = "Z")
    private boolean field1454 = false;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field1460 = 78;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Z")
    private boolean field1462 = true;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "[I")
    private int[] field1463 = new int[100];

    @OriginalMember(owner = "client", name = "Gf", descriptor = "[Ljava/lang/String;")
    private String[] field1464 = new String[100];

    @OriginalMember(owner = "client", name = "Hf", descriptor = "[Ljava/lang/String;")
    private String[] field1465 = new String[100];

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field1467 = 2;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "Llb;")
    private Packet field1470 = Packet.method213(1, 1);

    @OriginalMember(owner = "client", name = "Nf", descriptor = "Z")
    private boolean field1471 = false;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field1474 = 2;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "[Ljb;")
    private Pix8[] field1477 = new Pix8[13];

    @OriginalMember(owner = "client", name = "Vf", descriptor = "[I")
    private int[] field1479 = new int[1000];

    @OriginalMember(owner = "client", name = "Wf", descriptor = "[I")
    private int[] field1480 = new int[1000];

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field1482 = 1;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field1483 = 462;

    @OriginalMember(owner = "client", name = "ag", descriptor = "[I")
    private int[] field1484 = new int[5];

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field1485 = -1;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field1486 = 5063219;

    @OriginalMember(owner = "client", name = "hg", descriptor = "Z")
    private boolean field1491 = false;

    @OriginalMember(owner = "client", name = "kg", descriptor = "[I")
    private int[] field1494 = new int[151];

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field1498 = -909;

    @OriginalMember(owner = "client", name = "pg", descriptor = "Z")
    private boolean field1499 = false;

    @OriginalMember(owner = "client", name = "qg", descriptor = "Z")
    private boolean field1500 = false;

    @OriginalMember(owner = "client", name = "sg", descriptor = "Z")
    private boolean field1502 = false;

    @OriginalMember(owner = "client", name = "vg", descriptor = "[Lib;")
    private Pix32[] field1505 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field1521 = 3353893;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "[Ljb;")
    private Pix8[] field1522 = new Pix8[2];

    @OriginalMember(owner = "client", name = "Ng", descriptor = "Z")
    private boolean field1523 = false;

    @OriginalMember(owner = "client", name = "Og", descriptor = "[Ljava/lang/String;")
    private String[] field1524 = new String[200];

    @OriginalMember(owner = "client", name = "Qg", descriptor = "Z")
    private boolean field1526 = false;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "Ljava/lang/String;")
    private String field1527 = "";

    @OriginalMember(owner = "client", name = "oh", descriptor = "Z")
    private boolean field1550 = true;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field1554 = 2;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field1556 = 45827;

    @OriginalMember(owner = "client", name = "zh", descriptor = "[Ljava/lang/String;")
    private String[] field1561 = new String[5];

    @OriginalMember(owner = "client", name = "Ah", descriptor = "[Z")
    private boolean[] field1562 = new boolean[5];

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field1563 = 9;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "B")
    private byte field1564 = 1;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "[I")
    private int[] field1565 = new int[5];

    @OriginalMember(owner = "client", name = "Kh", descriptor = "Z")
    private boolean field1572 = false;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "[I")
    private int[] field1577 = new int[2000];

    @OriginalMember(owner = "client", name = "Qh", descriptor = "Z")
    public boolean field1578 = false;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "Llb;")
    private Packet field1579 = Packet.method213(1, 1);

    @OriginalMember(owner = "client", name = "Xh", descriptor = "[I")
    private int[] field1585 = new int[2000];

    @OriginalMember(owner = "client", name = "Yh", descriptor = "[Lvb;")
    public FileStream[] field1586 = new FileStream[5];

    @OriginalMember(owner = "client", name = "Zh", descriptor = "[Lib;")
    private Pix32[] field1587 = new Pix32[100];

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field1588 = 128;

    @OriginalMember(owner = "client", name = "fi", descriptor = "[I")
    public int[] field1593 = new int[1000];

    @OriginalMember(owner = "client", name = "ii", descriptor = "Z")
    private boolean field1596 = false;

    @OriginalMember(owner = "client", name = "ji", descriptor = "Ljava/lang/String;")
    private String field1597 = "";

    @OriginalMember(owner = "client", name = "ki", descriptor = "Ljava/lang/String;")
    private String field1598 = "";

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private int field1599 = -1;

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field1600 = -1;

    @OriginalMember(owner = "client", name = "ni", descriptor = "I")
    private int field1601 = -1;

    @OriginalMember(owner = "client", name = "oi", descriptor = "Z")
    private boolean field1602 = false;

    @OriginalMember(owner = "client", name = "pi", descriptor = "[Lz;")
    private NpcEntity[] field1603 = new NpcEntity[16384];

    @OriginalMember(owner = "client", name = "ri", descriptor = "[I")
    public int[] field1605 = new int[16384];

    @OriginalMember(owner = "client", name = "si", descriptor = "[I")
    private int[] field1606 = new int[500];

    @OriginalMember(owner = "client", name = "ti", descriptor = "[I")
    private int[] field1607 = new int[500];

    @OriginalMember(owner = "client", name = "ui", descriptor = "[I")
    private int[] field1608 = new int[500];

    @OriginalMember(owner = "client", name = "vi", descriptor = "[I")
    private int[] field1609 = new int[500];

    @OriginalMember(owner = "client", name = "wi", descriptor = "[I")
    private int[] field1610 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "xi", descriptor = "Lob;")
    private LinkList field1611 = new LinkList(false);

    @OriginalMember(owner = "client", name = "zi", descriptor = "[I")
    private int[] field1613 = new int[5];

    @OriginalMember(owner = "client", name = "Ai", descriptor = "[Z")
    private boolean[] field1614 = new boolean[5];

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private final int field1615 = 100;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "[I")
    private int[] field1616 = new int[100];

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field1617 = -1;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "[J")
    private long[] field1618 = new long[100];

    @OriginalMember(owner = "client", name = "Ki", descriptor = "Z")
    private boolean field1624 = true;

    @OriginalMember(owner = "client", name = "Li", descriptor = "Ld;")
    private Component field1625 = new Component();

    @OriginalMember(owner = "client", name = "Ni", descriptor = "[I")
    private int[] field1627 = new int[9];

    @OriginalMember(owner = "client", name = "Oi", descriptor = "[[[Lob;")
    private LinkList[][][] field1628 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "Pi", descriptor = "Ljava/lang/String;")
    private String field1629 = "";

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field1630 = 936;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "[Lib;")
    private Pix32[] field1631 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field1632 = -1;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private int field1636 = -1;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field1637 = -1;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "Z")
    private boolean field1638 = false;

    @OriginalMember(owner = "client", name = "bj", descriptor = "B")
    private byte field1641 = -18;

    @OriginalMember(owner = "client", name = "hj", descriptor = "Z")
    private boolean field1647 = false;

    @OriginalMember(owner = "client", name = "nj", descriptor = "[I")
    private int[] field1653 = new int[256];

    @OriginalMember(owner = "client", name = "oj", descriptor = "Z")
    private boolean field1654 = false;

    @OriginalMember(owner = "client", name = "pj", descriptor = "[I")
    private int[] field1655 = new int[200];

    @OriginalMember(owner = "client", name = "qj", descriptor = "Z")
    private boolean field1656 = false;

    @OriginalMember(owner = "client", name = "rj", descriptor = "[I")
    private int[] field1657 = new int[4000];

    @OriginalMember(owner = "client", name = "sj", descriptor = "[I")
    private int[] field1658 = new int[4000];

    @OriginalMember(owner = "client", name = "tj", descriptor = "[I")
    private int[] field1659 = new int[151];

    @OriginalMember(owner = "client", name = "L", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1210 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "S", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1217 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private static int field1306 = 10;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "Z")
    private static boolean field1308 = true;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "Z")
    private static boolean field1322 = true;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private static int field1329 = 438;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "[I")
    private static int[] field1356 = new int[99];

    @OriginalMember(owner = "client", name = "te", descriptor = "[[I")
    public static final int[][] field1400;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "[I")
    public static final int[] field1423;

    @OriginalMember(owner = "client", name = "wg", descriptor = "Ljava/lang/String;")
    private static String field1506;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private static int field1642;

    @OriginalMember(owner = "client", name = "kj", descriptor = "[I")
    private static int[] field1650;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field1209;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field1211;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private static int field1221;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private static int field1222;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field1223;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private int field1239;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field1240;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field1241;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field1242;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field1243;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private static int field1258;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private int field1261;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field1268;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field1270;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field1271;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private static int field1272;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field1275;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field1276;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private static int field1279;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1280;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field1293;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field1294;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private static int field1297;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field1300;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field1301;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field1303;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field1305;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private int field1312;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field1313;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private int field1315;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private static int field1316;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field1319;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field1321;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field1323;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field1324;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field1326;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private int field1327;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field1336;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field1338;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field1339;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    private int field1351;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private static int field1355;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field1359;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field1360;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field1361;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field1362;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private int field1369;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field1370;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private int field1372;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "I")
    private int field1378;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private static int field1390;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field1391;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private static int field1395;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    public int field1405;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private static int field1407;

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field1415;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field1417;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field1418;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field1419;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field1420;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private static int field1424;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field1425;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field1440;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field1441;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field1448;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field1450;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field1451;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private int field1452;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field1455;

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client", name = "Df", descriptor = "I")
    private static int field1461;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field1468;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private static int field1469;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field1472;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field1476;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field1478;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field1520;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field1529;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private static int field1535;

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field1541;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field1544;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field1548;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private static int field1553;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field1555;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field1557;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field1566;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field1567;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field1568;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field1571;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field1576;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "I")
    private int field1583;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field1589;

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field1591;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field1592;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field1594;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field1595;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field1604;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private static int field1612;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field1619;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field1620;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field1621;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field1623;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field1626;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private int field1633;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field1634;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private int field1635;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    public int field1639;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    public int field1640;

    @OriginalMember(owner = "client", name = "ij", descriptor = "I")
    private int field1648;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private static int field1649;

    @OriginalMember(owner = "client", name = "lj", descriptor = "I")
    private int field1651;

    @OriginalMember(owner = "client", name = "mb", descriptor = "J")
    public long field1237;

    @OriginalMember(owner = "client", name = "bf", descriptor = "J")
    private long field1434;

    @OriginalMember(owner = "client", name = "pf", descriptor = "J")
    private long field1447;

    @OriginalMember(owner = "client", name = "nh", descriptor = "J")
    private long field1549;

    @OriginalMember(owner = "client", name = "mj", descriptor = "J")
    private long field1652;

    @OriginalMember(owner = "client", name = "se", descriptor = "Le;")
    private ClientStream field1399;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "Lwb;")
    private Isaac field1375;

    @OriginalMember(owner = "client", name = "eh", descriptor = "Lxb;")
    private Jagfile field1540;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "Lfc;")
    public MouseTracking field1274;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "Lub;")
    private OnDemand field1459;

    @OriginalMember(owner = "client", name = "ac", descriptor = "Lib;")
    private Pix32 field1277;

    @OriginalMember(owner = "client", name = "fc", descriptor = "Lib;")
    private Pix32 field1282;

    @OriginalMember(owner = "client", name = "gc", descriptor = "Lib;")
    private Pix32 field1283;

    @OriginalMember(owner = "client", name = "hc", descriptor = "Lib;")
    private Pix32 field1284;

    @OriginalMember(owner = "client", name = "ic", descriptor = "Lib;")
    private Pix32 field1285;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "Lib;")
    private Pix32 field1328;

    @OriginalMember(owner = "client", name = "eg", descriptor = "Lib;")
    private Pix32 field1488;

    @OriginalMember(owner = "client", name = "fg", descriptor = "Lib;")
    private Pix32 field1489;

    @OriginalMember(owner = "client", name = "tg", descriptor = "Lib;")
    private Pix32 field1503;

    @OriginalMember(owner = "client", name = "ug", descriptor = "Lib;")
    private Pix32 field1504;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "Lib;")
    private Pix32 field1574;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "Lib;")
    private Pix32 field1575;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Lib;")
    private Pix32 field1584;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "Ljb;")
    private Pix8 field1266;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "Ljb;")
    private Pix8 field1267;

    @OriginalMember(owner = "client", name = "Id", descriptor = "Ljb;")
    private Pix8 field1363;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "Ljb;")
    private Pix8 field1364;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "Ljb;")
    private Pix8 field1365;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "Ljb;")
    private Pix8 field1366;

    @OriginalMember(owner = "client", name = "Md", descriptor = "Ljb;")
    private Pix8 field1367;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "Ljb;")
    private Pix8 field1379;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "Ljb;")
    private Pix8 field1380;

    @OriginalMember(owner = "client", name = "ae", descriptor = "Ljb;")
    private Pix8 field1381;

    @OriginalMember(owner = "client", name = "de", descriptor = "Ljb;")
    private Pix8 field1384;

    @OriginalMember(owner = "client", name = "ee", descriptor = "Ljb;")
    private Pix8 field1385;

    @OriginalMember(owner = "client", name = "fe", descriptor = "Ljb;")
    private Pix8 field1386;

    @OriginalMember(owner = "client", name = "ge", descriptor = "Ljb;")
    private Pix8 field1387;

    @OriginalMember(owner = "client", name = "he", descriptor = "Ljb;")
    private Pix8 field1388;

    @OriginalMember(owner = "client", name = "bh", descriptor = "Ljb;")
    private Pix8 field1537;

    @OriginalMember(owner = "client", name = "ch", descriptor = "Ljb;")
    private Pix8 field1538;

    @OriginalMember(owner = "client", name = "dh", descriptor = "Ljb;")
    private Pix8 field1539;

    @OriginalMember(owner = "client", name = "ph", descriptor = "Ljb;")
    private Pix8 field1551;

    @OriginalMember(owner = "client", name = "qh", descriptor = "Ljb;")
    private Pix8 field1552;

    @OriginalMember(owner = "client", name = "dj", descriptor = "Lkb;")
    private PixFont field1643;

    @OriginalMember(owner = "client", name = "ej", descriptor = "Lkb;")
    private PixFont field1644;

    @OriginalMember(owner = "client", name = "fj", descriptor = "Lkb;")
    private PixFont field1645;

    @OriginalMember(owner = "client", name = "gj", descriptor = "Lkb;")
    private PixFont field1646;

    @OriginalMember(owner = "client", name = "tb", descriptor = "Lqb;")
    private PixMap field1244;

    @OriginalMember(owner = "client", name = "ub", descriptor = "Lqb;")
    private PixMap field1245;

    @OriginalMember(owner = "client", name = "vb", descriptor = "Lqb;")
    private PixMap field1246;

    @OriginalMember(owner = "client", name = "wb", descriptor = "Lqb;")
    private PixMap field1247;

    @OriginalMember(owner = "client", name = "xb", descriptor = "Lqb;")
    private PixMap field1248;

    @OriginalMember(owner = "client", name = "yb", descriptor = "Lqb;")
    private PixMap field1249;

    @OriginalMember(owner = "client", name = "zb", descriptor = "Lqb;")
    private PixMap field1250;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "Lqb;")
    private PixMap field1251;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "Lqb;")
    private PixMap field1252;

    @OriginalMember(owner = "client", name = "lg", descriptor = "Lqb;")
    private PixMap field1495;

    @OriginalMember(owner = "client", name = "mg", descriptor = "Lqb;")
    private PixMap field1496;

    @OriginalMember(owner = "client", name = "ng", descriptor = "Lqb;")
    private PixMap field1497;

    @OriginalMember(owner = "client", name = "xg", descriptor = "Lqb;")
    private PixMap field1507;

    @OriginalMember(owner = "client", name = "yg", descriptor = "Lqb;")
    private PixMap field1508;

    @OriginalMember(owner = "client", name = "zg", descriptor = "Lqb;")
    private PixMap field1509;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "Lqb;")
    private PixMap field1510;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "Lqb;")
    private PixMap field1511;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "Lqb;")
    private PixMap field1512;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "Lqb;")
    private PixMap field1513;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "Lqb;")
    private PixMap field1514;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "Lqb;")
    private PixMap field1515;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "Lqb;")
    private PixMap field1516;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "Lqb;")
    private PixMap field1517;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "Lqb;")
    private PixMap field1518;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "Lqb;")
    private PixMap field1519;

    @OriginalMember(owner = "client", name = "bc", descriptor = "Lab;")
    public static PlayerEntity field1278;

    @OriginalMember(owner = "client", name = "ah", descriptor = "Lr;")
    private World3D field1536;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "Ljava/lang/String;")
    public String field1371;

    @OriginalMember(owner = "client", name = "Be", descriptor = "Ljava/lang/String;")
    private String field1408;

    @OriginalMember(owner = "client", name = "lf", descriptor = "Ljava/lang/String;")
    public String field1443;

    @OriginalMember(owner = "client", name = "yf", descriptor = "Ljava/lang/String;")
    private String field1456;

    @OriginalMember(owner = "client", name = "id", descriptor = "Ljava/net/Socket;")
    private Socket field1337;

    @OriginalMember(owner = "client", name = "T", descriptor = "Z")
    private static boolean field1218;

    @OriginalMember(owner = "client", name = "V", descriptor = "Z")
    private static boolean field1220;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "Z")
    private static boolean field1309;

    @OriginalMember(owner = "client", name = "qd", descriptor = "Z")
    public static boolean field1345;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "Z")
    private static boolean field1573;

    @OriginalMember(owner = "client", name = "uj", descriptor = "Z")
    public static boolean field1660;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "[I")
    private int[] field1259;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "[I")
    private int[] field1260;

    @OriginalMember(owner = "client", name = "fd", descriptor = "[I")
    private int[] field1334;

    @OriginalMember(owner = "client", name = "gd", descriptor = "[I")
    private int[] field1335;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "[I")
    private int[] field1428;

    @OriginalMember(owner = "client", name = "We", descriptor = "[I")
    private int[] field1429;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "[I")
    private int[] field1430;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "[I")
    private int[] field1431;

    @OriginalMember(owner = "client", name = "wh", descriptor = "[I")
    private int[] field1558;

    @OriginalMember(owner = "client", name = "xh", descriptor = "[I")
    private int[] field1559;

    @OriginalMember(owner = "client", name = "yh", descriptor = "[I")
    private int[] field1560;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "[I")
    private int[] field1580;

    @OriginalMember(owner = "client", name = "Th", descriptor = "[I")
    private int[] field1581;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "[I")
    private int[] field1582;

    @OriginalMember(owner = "client", name = "dg", descriptor = "[Ljb;")
    private Pix8[] field1487;

    @OriginalMember(owner = "client", name = "zf", descriptor = "[[B")
    private byte[][] field1457;

    @OriginalMember(owner = "client", name = "kh", descriptor = "[[B")
    private byte[][] field1546;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "[[[B")
    private byte[][][] field1422;

    @OriginalMember(owner = "client", name = "gg", descriptor = "[[[I")
    private int[][][] field1490;

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIIIIILd;B)V")
    public final void method423(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Component arg7, byte arg8) {
        if (arg8 == 7) {
            boolean var10 = false;
        } else {
            this.method6();
        }
        if (this.field1236) {
            this.field1305 = 32;
        } else {
            this.field1305 = 0;
        }
        this.field1236 = false;
        if (arg2 >= arg4 && arg2 < arg4 + 16 && arg6 >= arg1 && arg6 < arg1 + 16) {
            arg7.field88 -= this.field1492 * 4;
            if (arg0) {
                this.field1572 = true;
                return;
            }
        } else if (arg2 >= arg4 && arg2 < arg4 + 16 && arg6 >= arg1 + arg3 - 16 && arg6 < arg1 + arg3) {
            arg7.field88 += this.field1492 * 4;
            if (arg0) {
                this.field1572 = true;
                return;
            }
        } else {
            if (arg2 < arg4 - this.field1305 || arg2 >= arg4 + 16 + this.field1305 || arg6 < arg1 + 16 || arg6 >= arg1 + arg3 - 16 || this.field1492 <= 0) {
                return;
            }
            int var11 = (arg3 - 32) * arg3 / arg5;
            if (var11 < 8) {
                var11 = 8;
            }
            int var12 = arg6 - arg1 - 16 - var11 / 2;
            int var13 = arg3 - 32 - var11;
            arg7.field88 = (arg5 - arg3) * var12 / var13;
            if (arg0) {
                this.field1572 = true;
            }
            this.field1236 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;)V")
    public final void method424(int arg0, Component arg1) {
        int var3 = 56 / arg0;
        int var4 = arg1.field77;
        if ((var4 < 1 || var4 > 100) && (var4 < 701 || var4 > 800)) {
            if (var4 >= 101 && var4 <= 200 || var4 >= 801 && var4 <= 900) {
                int var6 = this.field1242;
                if (this.field1243 != 2) {
                    var6 = 0;
                }
                if (var4 > 800) {
                    var4 -= 701;
                } else {
                    var4 -= 101;
                }
                if (var4 >= var6) {
                    arg1.field109 = "";
                    arg1.field76 = 0;
                } else {
                    if (this.field1655[var4] == 0) {
                        arg1.field109 = "@red@Offline";
                    } else if (this.field1655[var4] == field1306) {
                        arg1.field109 = "@gre@World-" + (this.field1655[var4] - 9);
                    } else {
                        arg1.field109 = "@yel@World-" + (this.field1655[var4] - 9);
                    }
                    arg1.field76 = 1;
                }
            } else if (var4 == 203) {
                int var7 = this.field1242;
                if (this.field1243 != 2) {
                    var7 = 0;
                }
                arg1.field87 = var7 * 15 + 20;
                if (arg1.field87 <= arg1.field79) {
                    arg1.field87 = arg1.field79 + 1;
                }
            } else if (var4 >= 401 && var4 <= 500) {
                var4 -= 401;
                if (var4 == 0 && this.field1243 == 0) {
                    arg1.field109 = "Loading ignore list";
                    arg1.field76 = 0;
                } else if (var4 == 1 && this.field1243 == 0) {
                    arg1.field109 = "Please wait...";
                    arg1.field76 = 0;
                } else {
                    int var8 = this.field1313;
                    if (this.field1243 == 0) {
                        var8 = 0;
                    }
                    if (var4 >= var8) {
                        arg1.field109 = "";
                        arg1.field76 = 0;
                    } else {
                        arg1.field109 = JString.method300((byte) 81, JString.method297((byte) 3, this.field1618[var4]));
                        arg1.field76 = 1;
                    }
                }
            } else if (var4 == 503) {
                arg1.field87 = this.field1313 * 15 + 20;
                if (arg1.field87 <= arg1.field79) {
                    arg1.field87 = arg1.field79 + 1;
                }
            } else if (var4 == 327) {
                arg1.field124 = 150;
                arg1.field125 = (int) (Math.sin((double) field1330 / 40.0D) * 256.0D) & 2047;
                if (this.field1654) {
                    for (int var9 = 0; var9 < 7; ++var9) {
                        int var16 = this.field1273[var9];
                        if (var16 >= 0 && !IdkType.field1103[var16].method371((byte) 0)) {
                            return;
                        }
                    }
                    this.field1654 = false;
                    Model[] var10 = new Model[7];
                    int var11 = 0;
                    for (int var12 = 0; var12 < 7; ++var12) {
                        int var15 = this.field1273[var12];
                        if (var15 >= 0) {
                            var10[var11++] = IdkType.field1103[var15].method372(true);
                        }
                    }
                    Model var13 = new Model((byte) 3, var11, var10);
                    for (int var14 = 0; var14 < 5; ++var14) {
                        if (this.field1295[var14] != 0) {
                            var13.method139(field1400[var14][0], field1400[var14][this.field1295[var14]]);
                            if (var14 == 1) {
                                var13.method139(field1423[0], field1423[this.field1295[var14]]);
                            }
                        }
                    }
                    var13.method132(45941);
                    var13.method133(3, SeqType.field1126[field1278.field402].field1128[0]);
                    var13.method142(64, 850, -30, -50, -30, true);
                    arg1.field117 = 5;
                    arg1.field118 = 0;
                    Component.method36(5, var13, 0, (byte) -84);
                }
            } else if (var4 == 324) {
                if (this.field1503 == null) {
                    this.field1503 = arg1.field115;
                    this.field1504 = arg1.field116;
                }
                if (this.field1462) {
                    arg1.field115 = this.field1504;
                } else {
                    arg1.field115 = this.field1503;
                }
            } else if (var4 == 325) {
                if (this.field1503 == null) {
                    this.field1503 = arg1.field115;
                    this.field1504 = arg1.field116;
                }
                if (this.field1462) {
                    arg1.field115 = this.field1503;
                } else {
                    arg1.field115 = this.field1504;
                }
            } else if (var4 == 600) {
                arg1.field109 = this.field1344;
                if (field1330 % 20 < 10) {
                    arg1.field109 = arg1.field109 + "|";
                } else {
                    arg1.field109 = arg1.field109 + " ";
                }
            } else {
                if (var4 == 613) {
                    if (this.field1458 >= 1) {
                        if (this.field1647) {
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
                if (var4 == 650 || var4 == 655) {
                    if (this.field1209 != 0) {
                        String var17;
                        if (this.field1401 == 0) {
                            var17 = "earlier today";
                        } else if (this.field1401 == 1) {
                            var17 = "yesterday";
                        } else {
                            var17 = this.field1401 + " days ago";
                        }
                        arg1.field109 = "You last logged in " + var17 + " from: " + signlink.dns;
                    } else {
                        arg1.field109 = "";
                    }
                }
                if (var4 == 651) {
                    if (this.field1468 == 0) {
                        arg1.field109 = "0 unread messages";
                        arg1.field111 = 16776960;
                    }
                    if (this.field1468 == 1) {
                        arg1.field109 = "1 unread message";
                        arg1.field111 = 65280;
                    }
                    if (this.field1468 > 1) {
                        arg1.field109 = this.field1468 + " unread messages";
                        arg1.field111 = 65280;
                    }
                }
                if (var4 == 652) {
                    if (this.field1280 == 201) {
                        if (this.field1626 == 1) {
                            arg1.field109 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg1.field109 = "";
                        }
                    } else if (this.field1280 == 200) {
                        arg1.field109 = "You have not yet set any password recovery questions.";
                    } else {
                        String var18;
                        if (this.field1280 == 0) {
                            var18 = "Earlier today";
                        } else if (this.field1280 == 1) {
                            var18 = "Yesterday";
                        } else {
                            var18 = this.field1280 + " days ago";
                        }
                        arg1.field109 = var18 + " you changed your recovery questions";
                    }
                }
                if (var4 == 653) {
                    if (this.field1280 == 201) {
                        if (this.field1626 == 1) {
                            arg1.field109 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg1.field109 = "";
                        }
                    } else if (this.field1280 == 200) {
                        arg1.field109 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg1.field109 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var4 == 654) {
                    if (this.field1280 == 201) {
                        if (this.field1626 == 1) {
                            arg1.field109 = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg1.field109 = "";
                        }
                    } else if (this.field1280 == 200) {
                        arg1.field109 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg1.field109 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var4 == 1 && this.field1243 == 0) {
            arg1.field109 = "Loading friend list";
            arg1.field76 = 0;
        } else if (var4 == 1 && this.field1243 == 1) {
            arg1.field109 = "Connecting to friendserver";
            arg1.field76 = 0;
        } else if (var4 == 2 && this.field1243 != 2) {
            arg1.field109 = "Please wait...";
            arg1.field76 = 0;
        } else {
            int var5 = this.field1242;
            if (this.field1243 != 2) {
                var5 = 0;
            }
            if (var4 > 700) {
                var4 -= 601;
            } else {
                --var4;
            }
            if (var4 >= var5) {
                arg1.field109 = "";
                arg1.field76 = 0;
            } else {
                arg1.field109 = this.field1524[var4];
                arg1.field76 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;B)Z")
    public final boolean method425(Component arg0, byte arg1) {
        if (arg0.field84 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field84.length; ++var3) {
                int var5 = this.method540(arg0, var3, 862);
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
            if (arg1 == 8) {
                boolean var4 = false;
            } else {
                this.field1628 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method426(boolean arg0) {
        if (arg0) {
            this.field1396 = -69;
        }
        if (this.field1336 == 0) {
            if (super.field27 == 1) {
                int var2 = super.field28 - 25 - 550;
                int var3 = super.field29 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field1589 + this.field1473 & 2047;
                    int var5 = Pix3D.field643[var4];
                    int var6 = Pix3D.field644[var4];
                    int var7 = (this.field1324 + 256) * var5 >> 8;
                    int var8 = (this.field1324 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field1278.field397 + var9 >> 7;
                    int var12 = field1278.field398 - var10 >> 7;
                    boolean var13 = this.method508(true, 0, field1278.field448[0], 0, field1278.field447[0], 0, var11, 0, var12, 0, 1, true);
                    if (var13) {
                        this.field1444.method215(var2);
                        this.field1444.method215(var3);
                        this.field1444.method216(this.field1589);
                        this.field1444.method215(57);
                        this.field1444.method215(this.field1473);
                        this.field1444.method215(this.field1324);
                        this.field1444.method215(89);
                        this.field1444.method216(field1278.field397);
                        this.field1444.method216(field1278.field398);
                        this.field1444.method215(this.field1528);
                        this.field1444.method215(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method427(int arg0) {
        if (arg0 == 0) {
            ++field1553;
            if (field1553 > 192) {
                field1553 = 0;
                this.field1444.method214(230, 0);
                this.field1444.method215(232);
            }
            while (true) {
                int var2;
                do {
                    while (true) {
                        var2 = this.method5(11545);
                        if (var2 == -1) {
                            return;
                        }
                        if (this.field1617 != -1 && this.field1632 == this.field1617) {
                            if (var2 == 8 && this.field1344.length() > 0) {
                                this.field1344 = this.field1344.substring(0, this.field1344.length() - 1);
                            }
                            break;
                        }
                        if (this.field1215) {
                            if (var2 >= 32 && var2 <= 122 && this.field1219.length() < 80) {
                                this.field1219 = this.field1219 + (char) var2;
                                this.field1389 = true;
                            }
                            if (var2 == 8 && this.field1219.length() > 0) {
                                this.field1219 = this.field1219.substring(0, this.field1219.length() - 1);
                                this.field1389 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                this.field1215 = false;
                                this.field1389 = true;
                                if (this.field1294 == 1) {
                                    long var3 = JString.method296(this.field1219);
                                    this.method443(var3, true);
                                }
                                if (this.field1294 == 2 && this.field1242 > 0) {
                                    long var5 = JString.method296(this.field1219);
                                    this.method448(var5, 748);
                                }
                                if (this.field1294 == 3 && this.field1219.length() > 0) {
                                    this.field1444.method214(139, 0);
                                    this.field1444.method215(0);
                                    int var7 = this.field1444.field708;
                                    this.field1444.method221(9, this.field1447);
                                    WordPack.method304(this.field1219, true, this.field1444);
                                    this.field1444.method224(this.field1444.field708 - var7, false);
                                    this.field1219 = JString.method301(this.field1219, (byte) -70);
                                    this.field1219 = WordFilter.method395(this.field1219, 7);
                                    this.method544(this.field1234, JString.method300((byte) 81, JString.method297((byte) 3, this.field1447)), this.field1219, 6);
                                    if (this.field1529 == 2) {
                                        this.field1529 = 1;
                                        this.field1290 = true;
                                        this.field1444.method214(154, 0);
                                        this.field1444.method215(this.field1651);
                                        this.field1444.method215(this.field1529);
                                        this.field1444.method215(this.field1269);
                                    }
                                }
                                if (this.field1294 == 4 && this.field1313 < 100) {
                                    long var8 = JString.method296(this.field1219);
                                    this.method543(var8, -589);
                                }
                                if (this.field1294 == 5 && this.field1313 > 0) {
                                    long var10 = JString.method296(this.field1219);
                                    this.method531(var10, 0);
                                }
                            }
                        } else if (this.field1638) {
                            if (var2 >= 48 && var2 <= 57 && this.field1208.length() < 10) {
                                this.field1208 = this.field1208 + (char) var2;
                                this.field1389 = true;
                            }
                            if (var2 == 8 && this.field1208.length() > 0) {
                                this.field1208 = this.field1208.substring(0, this.field1208.length() - 1);
                                this.field1389 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                if (this.field1208.length() > 0) {
                                    int var12 = 0;
                                    try {
                                        var12 = Integer.parseInt(this.field1208);
                                    } catch (Exception var17) {
                                    }
                                    this.field1444.method214(102, 0);
                                    this.field1444.method219(var12);
                                }
                                this.field1638 = false;
                                this.field1389 = true;
                            }
                        } else if (this.field1601 == -1) {
                            if (var2 >= 32 && var2 <= 122 && this.field1629.length() < 80) {
                                this.field1629 = this.field1629 + (char) var2;
                                this.field1389 = true;
                            }
                            if (var2 == 8 && this.field1629.length() > 0) {
                                this.field1629 = this.field1629.substring(0, this.field1629.length() - 1);
                                this.field1389 = true;
                            }
                            if ((var2 == 13 || var2 == 10) && this.field1629.length() > 0) {
                                if (this.field1458 == 2) {
                                    if (this.field1629.equals("::clientdrop")) {
                                        this.method510((byte) -31);
                                    }
                                    if (this.field1629.equals("::lag")) {
                                        this.method435((byte) 2);
                                    }
                                    if (this.field1629.equals("::prefetchmusic")) {
                                        for (int var13 = 0; var13 < this.field1459.method268(2, -833); ++var13) {
                                            this.field1459.method278(var13, (byte) 1, 0, 2);
                                        }
                                    }
                                }
                                if (this.field1629.startsWith("::")) {
                                    this.field1444.method214(224, 0);
                                    this.field1444.method215(this.field1629.length() - 1);
                                    this.field1444.method222(this.field1629.substring(2));
                                } else {
                                    byte var14 = 0;
                                    if (this.field1629.startsWith("yellow:")) {
                                        var14 = 0;
                                        this.field1629 = this.field1629.substring(7);
                                    }
                                    if (this.field1629.startsWith("red:")) {
                                        var14 = 1;
                                        this.field1629 = this.field1629.substring(4);
                                    }
                                    if (this.field1629.startsWith("green:")) {
                                        var14 = 2;
                                        this.field1629 = this.field1629.substring(6);
                                    }
                                    if (this.field1629.startsWith("cyan:")) {
                                        var14 = 3;
                                        this.field1629 = this.field1629.substring(5);
                                    }
                                    if (this.field1629.startsWith("purple:")) {
                                        var14 = 4;
                                        this.field1629 = this.field1629.substring(7);
                                    }
                                    if (this.field1629.startsWith("white:")) {
                                        var14 = 5;
                                        this.field1629 = this.field1629.substring(6);
                                    }
                                    if (this.field1629.startsWith("flash1:")) {
                                        var14 = 6;
                                        this.field1629 = this.field1629.substring(7);
                                    }
                                    if (this.field1629.startsWith("flash2:")) {
                                        var14 = 7;
                                        this.field1629 = this.field1629.substring(7);
                                    }
                                    if (this.field1629.startsWith("flash3:")) {
                                        var14 = 8;
                                        this.field1629 = this.field1629.substring(7);
                                    }
                                    if (this.field1629.startsWith("glow1:")) {
                                        var14 = 9;
                                        this.field1629 = this.field1629.substring(6);
                                    }
                                    if (this.field1629.startsWith("glow2:")) {
                                        var14 = 10;
                                        this.field1629 = this.field1629.substring(6);
                                    }
                                    if (this.field1629.startsWith("glow3:")) {
                                        var14 = 11;
                                        this.field1629 = this.field1629.substring(6);
                                    }
                                    byte var15 = 0;
                                    if (this.field1629.startsWith("wave:")) {
                                        var15 = 1;
                                        this.field1629 = this.field1629.substring(5);
                                    }
                                    if (this.field1629.startsWith("scroll:")) {
                                        var15 = 2;
                                        this.field1629 = this.field1629.substring(7);
                                    }
                                    this.field1444.method214(253, 0);
                                    this.field1444.method215(0);
                                    int var16 = this.field1444.field708;
                                    this.field1444.method215(var14);
                                    this.field1444.method215(var15);
                                    WordPack.method304(this.field1629, true, this.field1444);
                                    this.field1444.method224(this.field1444.field708 - var16, false);
                                    this.field1629 = JString.method301(this.field1629, (byte) -70);
                                    this.field1629 = WordFilter.method395(this.field1629, 7);
                                    field1278.field409 = this.field1629;
                                    field1278.field411 = var14;
                                    field1278.field412 = var15;
                                    field1278.field410 = 150;
                                    if (this.field1458 == 2) {
                                        this.method544(this.field1234, "@cr2@" + field1278.field458, field1278.field409, 2);
                                    } else if (this.field1458 == 1) {
                                        this.method544(this.field1234, "@cr1@" + field1278.field458, field1278.field409, 2);
                                    } else {
                                        this.method544(this.field1234, field1278.field458, field1278.field409, 2);
                                    }
                                    if (this.field1651 == 2) {
                                        this.field1651 = 3;
                                        this.field1290 = true;
                                        this.field1444.method214(154, 0);
                                        this.field1444.method215(this.field1651);
                                        this.field1444.method215(this.field1529);
                                        this.field1444.method215(this.field1269);
                                    }
                                }
                                this.field1629 = "";
                                this.field1389 = true;
                            }
                        }
                    }
                } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
                if (this.field1344.length() < 12) {
                    this.field1344 = this.field1344 + (char) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I[BZ)V")
    public final void method428(int arg0, byte[] arg1, boolean arg2) {
        while (arg0 >= 0) {
            this.field1411 = -1;
        }
        signlink.midifade = arg2 ? 1 : 0;
        signlink.midisave(arg1, arg1.length);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILlb;)V")
    private final void method429(int arg0, int arg1, Packet arg2) {
        while (true) {
            if (arg2.field709 + 10 < arg0 * 8) {
                int var4 = arg2.method236(0, 11);
                if (var4 != 2047) {
                    if (this.field1348[var4] == null) {
                        this.field1348[var4] = new PlayerEntity();
                        if (this.field1353[var4] != null) {
                            this.field1348[var4].method116(false, this.field1353[var4]);
                        }
                    }
                    this.field1350[this.field1349++] = var4;
                    PlayerEntity var5 = this.field1348[var4];
                    var5.field442 = field1330;
                    int var6 = arg2.method236(0, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg2.method236(0, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg2.method236(0, 1);
                    var5.method110(field1278.field447[0] + var6, var8 == 1, field1278.field448[0] + var7, true);
                    int var9 = arg2.method236(0, 1);
                    if (var9 == 1) {
                        this.field1352[this.field1351++] = var4;
                    }
                    continue;
                }
            }
            arg2.method237(-317);
            int var10 = 0 / arg1;
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method430(int arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1242; ++var3) {
                if (arg1.equalsIgnoreCase(this.field1524[var3])) {
                    return true;
                }
            }
            if (arg0 != 2) {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
            return arg1.equalsIgnoreCase(field1278.field458);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1410 += arg2;
        LocSpawned var11 = null;
        for (LocSpawned var12 = (LocSpawned) this.field1611.method244(); var12 != null; var12 = (LocSpawned) this.field1611.method246(false)) {
            if (var12.field726 == arg6 && var12.field728 == arg5 && var12.field729 == arg8 && var12.field727 == arg7) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field726 = arg6;
            var11.field727 = arg7;
            var11.field728 = arg5;
            var11.field729 = arg8;
            this.method516(var11, -707);
            this.field1611.method241(var11);
        }
        var11.field733 = arg9;
        var11.field735 = arg4;
        var11.field734 = arg3;
        var11.field736 = arg1;
        var11.field737 = arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method432(String arg0) throws IOException {
        if (!this.field1304) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field1337 != null) {
                try {
                    this.field1337.close();
                } catch (Exception var4) {
                }
                this.field1337 = null;
            }
            this.field1337 = this.method512(43595);
            this.field1337.setSoTimeout(10000);
            InputStream var2 = this.field1337.getInputStream();
            OutputStream var3 = this.field1337.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method433(boolean arg0) {
        this.field1508.method254(979);
        if (this.field1336 == 2) {
            byte[] var2 = this.field1380.field673;
            int[] var3 = Pix2D.field620;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field1328.method189(33, -522, 25, this.field1343, 25, this.field1397, 0, 33, 256, 0, this.field1589);
            this.field1509.method254(979);
        } else {
            int var6 = this.field1589 + this.field1473 & 2047;
            int var7 = field1278.field397 / 32 + 48;
            int var8 = 464 - field1278.field398 / 32;
            this.field1277.method189(146, -522, var7, this.field1494, var8, this.field1659, 5, 151, this.field1324 + 256, 25, var6);
            this.field1328.method189(33, -522, 25, this.field1343, 25, this.field1397, 0, 33, 256, 0, this.field1589);
            for (int var9 = 0; var9 < this.field1478; ++var9) {
                int var37 = this.field1479[var9] * 4 + 2 - field1278.field397 / 32;
                int var38 = this.field1480[var9] * 4 + 2 - field1278.field398 / 32;
                this.method553(this.field1631[var9], 0, var37, var38);
            }
            if (!arg0) {
                this.method6();
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var33 = 0; var33 < 104; ++var33) {
                    LinkList var34 = this.field1628[this.field1303][var10][var33];
                    if (var34 != null) {
                        int var35 = var10 * 4 + 2 - field1278.field397 / 32;
                        int var36 = var33 * 4 + 2 - field1278.field398 / 32;
                        this.method553(this.field1282, 0, var35, var36);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field1604; ++var11) {
                NpcEntity var30 = this.field1603[this.field1605[var11]];
                if (var30 != null && var30.method113((byte) 121) && var30.field455.field1013) {
                    int var31 = var30.field397 / 32 - field1278.field397 / 32;
                    int var32 = var30.field398 / 32 - field1278.field398 / 32;
                    this.method553(this.field1283, 0, var31, var32);
                }
            }
            for (int var12 = 0; var12 < this.field1349; ++var12) {
                PlayerEntity var23 = this.field1348[this.field1350[var12]];
                if (var23 != null && var23.method113((byte) 121)) {
                    int var24 = var23.field397 / 32 - field1278.field397 / 32;
                    int var25 = var23.field398 / 32 - field1278.field398 / 32;
                    boolean var26 = false;
                    long var27 = JString.method296(var23.field458);
                    for (int var29 = 0; var29 < this.field1242; ++var29) {
                        if (this.field1403[var29] == var27 && this.field1655[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    if (field1278.field481 != 0 && var23.field481 != 0) {
                        if (field1278.field481 == var23.field481) {
                            var26 = true;
                        } else {
                            var26 = false;
                        }
                    }
                    if (var26) {
                        this.method553(this.field1285, 0, var24, var25);
                    } else {
                        this.method553(this.field1284, 0, var24, var25);
                    }
                }
            }
            if (this.field1404 != 0 && field1330 % 20 < 10) {
                if (this.field1404 == 1 && this.field1310 >= 0 && this.field1310 < this.field1603.length) {
                    NpcEntity var13 = this.field1603[this.field1310];
                    if (var13 != null) {
                        int var14 = var13.field397 / 32 - field1278.field397 / 32;
                        int var15 = var13.field398 / 32 - field1278.field398 / 32;
                        this.method514(var15, this.field1575, var14, (byte) 33);
                    }
                }
                if (this.field1404 == 2) {
                    int var16 = (this.field1298 - this.field1359) * 4 + 2 - field1278.field397 / 32;
                    int var17 = (this.field1299 - this.field1360) * 4 + 2 - field1278.field398 / 32;
                    this.method514(var17, this.field1575, var16, (byte) 33);
                }
                if (this.field1404 == 10 && this.field1648 >= 0 && this.field1648 < this.field1348.length) {
                    PlayerEntity var18 = this.field1348[this.field1648];
                    if (var18 != null) {
                        int var19 = var18.field397 / 32 - field1278.field397 / 32;
                        int var20 = var18.field398 / 32 - field1278.field398 / 32;
                        this.method514(var20, this.field1575, var19, (byte) 33);
                    }
                }
            }
            if (this.field1275 != 0) {
                int var21 = this.field1275 * 4 + 2 - field1278.field397 / 32;
                int var22 = this.field1276 * 4 + 2 - field1278.field398 / 32;
                this.method553(this.field1574, 0, var21, var22);
            }
            Pix2D.method156(97, 16777215, 3, 3, -37952, 78);
            this.field1509.method254(979);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)Ljava/lang/String;")
    public final String method434(int arg0) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else if (super.field16 != null) {
            return "runescape.com";
        } else {
            return super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public void method435(byte arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field1406);
        if (this.field1459 != null) {
            System.out.println("Od-cycle:" + this.field1459.field847);
        }
        System.out.println("loop-cycle:" + field1330);
        System.out.println("draw-cycle:" + field1311);
        System.out.println("ptype:" + this.field1411);
        if (arg0 == 2) {
            System.out.println("psize:" + this.field1410);
            if (this.field1399 != null) {
                this.field1399.method43((byte) 2);
            }
            super.field10 = true;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        if (arg0 != 37639) {
            this.field1628 = null;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field16 != null ? super.field16 : this;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method436(int arg0) {
        if (this.field1293 != 0) {
            int var2 = 0;
            if (this.field1633 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field1465[var3] != null) {
                    int var4 = this.field1463[var3];
                    String var5 = this.field1464[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field1529 == 0 || this.field1529 == 1 && this.method430(2, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field21 > 4 && super.field22 - 4 > var9 - 10 && super.field22 - 4 <= var9 + 3) {
                            int var10 = this.field1644.method202("From:  " + var5 + this.field1465[var3], 5) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field21 < var10 + 4) {
                                if (this.field1458 >= 1) {
                                    this.field1402[this.field1254] = "Report abuse @whi@" + var5;
                                    this.field1608[this.field1254] = 2524;
                                    ++this.field1254;
                                }
                                this.field1402[this.field1254] = "Add ignore @whi@" + var5;
                                this.field1608[this.field1254] = 2047;
                                ++this.field1254;
                                this.field1402[this.field1254] = "Add friend @whi@" + var5;
                                this.field1608[this.field1254] = 2605;
                                ++this.field1254;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field1529 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 != 45189) {
                field1322 = !field1322;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method437(int arg0, boolean arg1) {
        int var3 = VarpType.field1173[arg0].field1181;
        if (arg1) {
            this.field1628 = null;
        }
        if (var3 != 0) {
            int var4 = this.field1577[arg0];
            if (var3 == 1) {
                if (var4 == 1) {
                    Pix3D.method172(0.9D, false);
                }
                if (var4 == 2) {
                    Pix3D.method172(0.8D, false);
                }
                if (var4 == 3) {
                    Pix3D.method172(0.7D, false);
                }
                if (var4 == 4) {
                    Pix3D.method172(0.6D, false);
                }
                ObjType.field1073.method103();
                this.field1526 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field1257;
                if (var4 == 0) {
                    this.method524(-859, 0, this.field1257);
                    this.field1257 = true;
                }
                if (var4 == 1) {
                    this.method524(-859, -400, this.field1257);
                    this.field1257 = true;
                }
                if (var4 == 2) {
                    this.method524(-859, -800, this.field1257);
                    this.field1257 = true;
                }
                if (var4 == 3) {
                    this.method524(-859, -1200, this.field1257);
                    this.field1257 = true;
                }
                if (var4 == 4) {
                    this.field1257 = false;
                }
                if (this.field1257 != var5 && !field1309) {
                    if (this.field1257) {
                        this.field1623 = this.field1289;
                        this.field1624 = true;
                        this.field1459.method275(2, this.field1623);
                    } else {
                        this.method460(-232);
                    }
                    this.field1211 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field1550 = true;
                    this.method534(0, this.field1483);
                }
                if (var4 == 1) {
                    this.field1550 = true;
                    this.method534(-400, this.field1483);
                }
                if (var4 == 2) {
                    this.field1550 = true;
                    this.method534(-800, this.field1483);
                }
                if (var4 == 3) {
                    this.field1550 = true;
                    this.method534(-1200, this.field1483);
                }
                if (var4 == 4) {
                    this.field1550 = false;
                }
            }
            if (var3 == 5) {
                this.field1576 = var4;
            }
            if (var3 == 6) {
                this.field1583 = var4;
            }
            if (var3 == 8) {
                this.field1293 = var4;
                this.field1389 = true;
            }
            if (var3 == 9) {
                this.field1436 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method438(int arg0) {
        if (this.field1511 == null) {
            super.field14 = null;
            this.field1510 = null;
            this.field1508 = null;
            this.field1507 = null;
            this.field1509 = null;
            this.field1495 = null;
            this.field1496 = null;
            if (arg0 < 0) {
                this.field1497 = null;
                this.field1514 = new PixMap(265, 128, this.method11(37639), false);
                Pix2D.method154(false);
                this.field1515 = new PixMap(265, 128, this.method11(37639), false);
                Pix2D.method154(false);
                this.field1511 = new PixMap(171, 509, this.method11(37639), false);
                Pix2D.method154(false);
                this.field1512 = new PixMap(132, 360, this.method11(37639), false);
                Pix2D.method154(false);
                this.field1513 = new PixMap(200, 360, this.method11(37639), false);
                Pix2D.method154(false);
                this.field1516 = new PixMap(238, 202, this.method11(37639), false);
                Pix2D.method154(false);
                this.field1517 = new PixMap(238, 203, this.method11(37639), false);
                Pix2D.method154(false);
                this.field1518 = new PixMap(94, 74, this.method11(37639), false);
                Pix2D.method154(false);
                this.field1519 = new PixMap(94, 75, this.method11(37639), false);
                Pix2D.method154(false);
                if (this.field1540 != null) {
                    this.method526(false);
                    this.method507(7);
                }
                this.field1526 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILlb;)V")
    private final void method439(byte arg0, int arg1, Packet arg2) {
        if (arg0 != -86) {
            this.field1292 = -136;
        }
        while (arg2.field709 + 21 < arg1 * 8) {
            int var4 = arg2.method236(0, 14);
            if (var4 == 16383) {
                break;
            }
            if (this.field1603[var4] == null) {
                this.field1603[var4] = new NpcEntity();
            }
            NpcEntity var5 = this.field1603[var4];
            this.field1605[this.field1604++] = var4;
            var5.field442 = field1330;
            var5.field455 = NpcType.method336(arg2.method236(0, 11));
            var5.field401 = var5.field455.field999;
            var5.field445 = var5.field455.field1021;
            var5.field404 = var5.field455.field1003;
            var5.field405 = var5.field455.field1004;
            var5.field406 = var5.field455.field1005;
            var5.field407 = var5.field455.field1006;
            var5.field402 = var5.field455.field1002;
            int var6 = arg2.method236(0, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg2.method236(0, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg2.method236(0, 1);
            var5.method110(field1278.field447[0] + var6, var8 == 1, field1278.field448[0] + var7, true);
            int var9 = arg2.method236(0, 1);
            if (var9 == 1) {
                this.field1352[this.field1351++] = var4;
            }
        }
        arg2.method237(-317);
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method440(boolean arg0) {
        if (this.field1293 != 0) {
            PixFont var2 = this.field1644;
            if (!arg0) {
                this.field1445 = 95;
            }
            int var3 = 0;
            if (this.field1633 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1465[var4] != null) {
                    int var5 = this.field1463[var4];
                    String var6 = this.field1464[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1529 == 0 || this.field1529 == 1 && this.method430(2, var6))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method204(var9, "From", -1765, var8, 0);
                        var2.method204(var9, "From", -1765, var8 - 1, 65535);
                        int var10 = var9 + var2.method202("From ", 5);
                        if (var7 == 1) {
                            this.field1522[0].method198(var10, (byte) 1, var8 - 12);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field1522[1].method198(var10, (byte) 1, var8 - 12);
                            var10 += 14;
                        }
                        var2.method204(var10, var6 + ": " + this.field1465[var4], -1765, var8, 0);
                        var2.method204(var10, var6 + ": " + this.field1465[var4], -1765, var8 - 1, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field1529 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method204(4, this.field1465[var4], -1765, var11, 0);
                        var2.method204(4, this.field1465[var4], -1765, var11 - 1, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field1529 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method204(4, "To " + var6 + ": " + this.field1465[var4], -1765, var12, 0);
                        var2.method204(4, "To " + var6 + ": " + this.field1465[var4], -1765, var12 - 1, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method441(int arg0) {
        for (int var2 = -1; var2 < this.field1349; ++var2) {
            int var4;
            if (var2 == -1) {
                var4 = this.field1347;
            } else {
                var4 = this.field1350[var2];
            }
            PlayerEntity var5 = this.field1348[var4];
            if (var5 != null) {
                this.method450(var5, 1, true);
            }
        }
        int var3 = 80 / arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILlb;I)V")
    public final void method442(int arg0, Packet arg1, int arg2) {
        if (arg2 != 3872) {
            arg0 = arg1.method225();
        }
        if (arg0 != 138 && arg0 != 173) {
            if (arg0 == 48) {
                int var4 = arg1.method225();
                int var5 = (var4 >> 4 & 7) + this.field1270;
                int var6 = (var4 & 7) + this.field1271;
                int var7 = arg1.method225();
                int var8 = var7 >> 2;
                int var9 = var7 & 3;
                int var10 = this.field1340[var8];
                int var11 = arg1.method227();
                if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                    int var12 = this.field1490[this.field1303][var5][var6];
                    int var13 = this.field1490[this.field1303][var5 + 1][var6];
                    int var14 = this.field1490[this.field1303][var5 + 1][var6 + 1];
                    int var15 = this.field1490[this.field1303][var5][var6 + 1];
                    if (var10 == 0) {
                        Wall var16 = this.field1536.method72(this.field1303, var5, var6, (byte) -61);
                        if (var16 != null) {
                            int var17 = var16.field272 >> 14 & 32767;
                            if (var8 == 2) {
                                var16.field270 = new LocEntity(2, false, var12, var15, var14, var13, var11, false, var9 + 4, var17);
                                var16.field271 = new LocEntity(2, false, var12, var15, var14, var13, var11, false, var9 + 1 & 3, var17);
                            } else {
                                var16.field270 = new LocEntity(var8, false, var12, var15, var14, var13, var11, false, var9, var17);
                            }
                        }
                    }
                    if (var10 == 1) {
                        Decor var18 = this.field1536.method73((byte) -22, var5, this.field1303, var6);
                        if (var18 != null) {
                            var18.field163 = new LocEntity(4, false, var12, var15, var14, var13, var11, false, 0, var18.field164 >> 14 & 32767);
                        }
                    }
                    if (var10 == 2) {
                        Location var19 = this.field1536.method74(var5, this.field1303, 592, var6);
                        if (var8 == 11) {
                            var8 = 10;
                        }
                        if (var19 != null) {
                            var19.field255 = new LocEntity(var8, false, var12, var15, var14, var13, var11, false, var9, var19.field263 >> 14 & 32767);
                        }
                    }
                    if (var10 == 3) {
                        GroundDecor var20 = this.field1536.method75(var6, (byte) 53, var5, this.field1303);
                        if (var20 != null) {
                            var20.field194 = new LocEntity(22, false, var12, var15, var14, var13, var11, false, var9, var20.field195 >> 14 & 32767);
                        }
                    }
                }
            } else if (arg0 == 81) {
                int var21 = arg1.method225();
                int var22 = (var21 >> 4 & 7) + this.field1270;
                int var23 = (var21 & 7) + this.field1271;
                int var24 = arg1.method227();
                int var25 = arg1.method227();
                if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                    ObjStackEntity var26 = new ObjStackEntity();
                    var26.field496 = var24;
                    var26.field497 = var25;
                    if (this.field1628[this.field1303][var22][var23] == null) {
                        this.field1628[this.field1303][var22][var23] = new LinkList(false);
                    }
                    this.field1628[this.field1303][var22][var23].method241(var26);
                    this.method517(var22, var23);
                }
            } else if (arg0 == 52) {
                int var27 = arg1.method225();
                int var28 = (var27 >> 4 & 7) + this.field1270;
                int var29 = (var27 & 7) + this.field1271;
                int var30 = arg1.method227();
                if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                    LinkList var31 = this.field1628[this.field1303][var28][var29];
                    if (var31 != null) {
                        for (ObjStackEntity var32 = (ObjStackEntity) var31.method244(); var32 != null; var32 = (ObjStackEntity) var31.method246(false)) {
                            if ((var30 & 32767) == var32.field496) {
                                var32.method106();
                                break;
                            }
                        }
                        if (var31.method244() == null) {
                            this.field1628[this.field1303][var28][var29] = null;
                        }
                        this.method517(var28, var29);
                    }
                }
            } else if (arg0 == 107) {
                int var33 = arg1.method225();
                int var34 = (var33 >> 4 & 7) + this.field1270;
                int var35 = (var33 & 7) + this.field1271;
                int var36 = var34 + arg1.method226();
                int var37 = var35 + arg1.method226();
                int var38 = arg1.method228();
                int var39 = arg1.method227();
                int var40 = arg1.method225() * 4;
                int var41 = arg1.method225() * 4;
                int var42 = arg1.method227();
                int var43 = arg1.method227();
                int var44 = arg1.method225();
                int var45 = arg1.method225();
                if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                    int var46 = var34 * 128 + 64;
                    int var47 = var35 * 128 + 64;
                    int var48 = var36 * 128 + 64;
                    int var49 = var37 * 128 + 64;
                    ProjectileEntity var50 = new ProjectileEntity(field1330 + var42, var44, var47, var41, this.method474(var47, var46, -195, this.field1303) - var40, var45, var46, field1330 + var43, var38, 556, var39, this.field1303);
                    var50.method119(var49, var48, -630, this.method474(var49, var48, -195, this.field1303) - var41, field1330 + var42);
                    this.field1426.method241(var50);
                }
            } else if (arg0 == 85) {
                int var51 = arg1.method225();
                int var52 = (var51 >> 4 & 7) + this.field1270;
                int var53 = (var51 & 7) + this.field1271;
                int var54 = arg1.method227();
                int var55 = arg1.method225();
                int var56 = arg1.method227();
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                    int var57 = var52 * 128 + 64;
                    int var58 = var53 * 128 + 64;
                    SpotAnimEntity var59 = new SpotAnimEntity(0, var54, this.field1303, var58, this.method474(var58, var57, -195, this.field1303) - var55, field1330, var57, var56);
                    this.field1255.method241(var59);
                }
            } else if (arg0 == 219) {
                int var60 = arg1.method225();
                int var61 = (var60 >> 4 & 7) + this.field1270;
                int var62 = (var60 & 7) + this.field1271;
                int var63 = arg1.method227();
                int var64 = arg1.method227();
                int var65 = arg1.method227();
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && this.field1485 != var65) {
                    ObjStackEntity var66 = new ObjStackEntity();
                    var66.field496 = var63;
                    var66.field497 = var64;
                    if (this.field1628[this.field1303][var61][var62] == null) {
                        this.field1628[this.field1303][var61][var62] = new LinkList(false);
                    }
                    this.field1628[this.field1303][var61][var62].method241(var66);
                    this.method517(var61, var62);
                }
            } else {
                if (arg0 == 176) {
                    int var67 = arg1.method225();
                    int var68 = (var67 >> 4 & 7) + this.field1270;
                    int var69 = (var67 & 7) + this.field1271;
                    int var70 = arg1.method225();
                    int var71 = var70 >> 2;
                    int var72 = var70 & 3;
                    int var73 = this.field1340[var71];
                    int var74 = arg1.method227();
                    int var75 = arg1.method227();
                    int var76 = arg1.method227();
                    int var77 = arg1.method227();
                    byte var78 = arg1.method226();
                    byte var79 = arg1.method226();
                    byte var80 = arg1.method226();
                    byte var81 = arg1.method226();
                    PlayerEntity var82;
                    if (this.field1485 == var77) {
                        var82 = field1278;
                    } else {
                        var82 = this.field1348[var77];
                    }
                    if (var82 != null) {
                        LocType var83 = LocType.method326(var74);
                        int var84 = this.field1490[this.field1303][var68][var69];
                        int var85 = this.field1490[this.field1303][var68 + 1][var69];
                        int var86 = this.field1490[this.field1303][var68 + 1][var69 + 1];
                        int var87 = this.field1490[this.field1303][var68][var69 + 1];
                        Model var88 = var83.method332(var71, var72, var84, var85, var86, var87, -1);
                        if (var88 != null) {
                            this.method431(var76 + 1, var75 + 1, 0, 0, 0, var68, this.field1303, var73, var69, -1);
                            var82.field468 = field1330 + var75;
                            var82.field469 = field1330 + var76;
                            var82.field473 = var88;
                            int var89 = var83.field953;
                            int var90 = var83.field954;
                            if (var72 == 1 || var72 == 3) {
                                var89 = var83.field954;
                                var90 = var83.field953;
                            }
                            var82.field470 = var68 * 128 + var89 * 64;
                            var82.field472 = var69 * 128 + var90 * 64;
                            var82.field471 = this.method474(var82.field472, var82.field470, -195, this.field1303);
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
                if (arg0 == 95) {
                    int var93 = arg1.method225();
                    int var94 = (var93 >> 4 & 7) + this.field1270;
                    int var95 = (var93 & 7) + this.field1271;
                    int var96 = arg1.method227();
                    int var97 = arg1.method227();
                    int var98 = arg1.method227();
                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                        LinkList var99 = this.field1628[this.field1303][var94][var95];
                        if (var99 != null) {
                            for (ObjStackEntity var100 = (ObjStackEntity) var99.method244(); var100 != null; var100 = (ObjStackEntity) var99.method246(false)) {
                                if ((var96 & 32767) == var100.field496 && var100.field497 == var97) {
                                    var100.field497 = var98;
                                    break;
                                }
                            }
                            this.method517(var94, var95);
                        }
                    }
                }
            }
        } else {
            int var101 = arg1.method225();
            int var102 = (var101 >> 4 & 7) + this.field1270;
            int var103 = (var101 & 7) + this.field1271;
            int var104 = arg1.method225();
            int var105 = var104 >> 2;
            int var106 = var104 & 3;
            int var107 = this.field1340[var105];
            int var108;
            if (arg0 == 173) {
                var108 = -1;
            } else {
                var108 = arg1.method227();
            }
            if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                this.method431(-1, 0, 0, var106, var105, var102, this.field1303, var107, var103, var108);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method443(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            if (this.field1242 >= 100 && this.field1571 != 1) {
                this.method544(this.field1234, "", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
            } else if (this.field1242 >= 200) {
                this.method544(this.field1234, "", "Your friendlist is full. Max of 100 for free users, and 200 for members", 0);
            } else {
                String var4 = JString.method300((byte) 81, JString.method297((byte) 3, arg0));
                this.field1578 &= arg1;
                for (int var5 = 0; var5 < this.field1242; ++var5) {
                    if (this.field1403[var5] == arg0) {
                        this.method544(this.field1234, "", var4 + " is already on your friend list", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1313; ++var6) {
                    if (this.field1618[var6] == arg0) {
                        this.method544(this.field1234, "", "Please remove " + var4 + " from your ignore list first", 0);
                        return;
                    }
                }
                if (!var4.equals(field1278.field458)) {
                    this.field1524[this.field1242] = var4;
                    this.field1403[this.field1242] = arg0;
                    this.field1655[this.field1242] = 0;
                    ++this.field1242;
                    this.field1572 = true;
                    this.field1444.method214(13, 0);
                    this.field1444.method221(9, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method444(int arg0) {
        if (arg0 == 4974) {
            try {
                int var2 = field1278.field397 + this.field1261;
                int var3 = field1278.field398 + this.field1466;
                if (this.field1391 - var2 < -500 || this.field1391 - var2 > 500 || this.field1392 - var3 < -500 || this.field1392 - var3 > 500) {
                    this.field1391 = var2;
                    this.field1392 = var3;
                }
                if (this.field1391 != var2) {
                    this.field1391 += (var2 - this.field1391) / 16;
                }
                if (this.field1392 != var3) {
                    this.field1392 += (var3 - this.field1392) / 16;
                }
                if (super.field31[1] == 1) {
                    this.field1590 += (-24 - this.field1590) / 2;
                } else if (super.field31[2] == 1) {
                    this.field1590 += (24 - this.field1590) / 2;
                } else {
                    this.field1590 /= 2;
                }
                if (super.field31[3] == 1) {
                    this.field1591 += (12 - this.field1591) / 2;
                } else if (super.field31[4] == 1) {
                    this.field1591 += (-12 - this.field1591) / 2;
                } else {
                    this.field1591 /= 2;
                }
                this.field1589 = this.field1590 / 2 + this.field1589 & 2047;
                this.field1588 += this.field1591 / 2;
                if (this.field1588 < 128) {
                    this.field1588 = 128;
                }
                if (this.field1588 > 383) {
                    this.field1588 = 383;
                }
                int var4 = this.field1391 >> 7;
                int var5 = this.field1392 >> 7;
                int var6 = this.method474(this.field1392, this.field1391, -195, this.field1303);
                int var7 = 0;
                if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                    for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                        for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                            int var10 = this.field1303;
                            if (var10 < 3 && (this.field1422[1][var8][var9] & 2) == 2) {
                                ++var10;
                            }
                            int var11 = var6 - this.field1490[var10][var8][var9];
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
                if (var12 > this.field1327) {
                    this.field1327 += (var12 - this.field1327) / 24;
                } else if (var12 < this.field1327) {
                    this.field1327 += (var12 - this.field1327) / 80;
                }
            } catch (Exception var13) {
                signlink.reporterror("glfc_ex " + field1278.field397 + "," + field1278.field398 + "," + this.field1391 + "," + this.field1392 + "," + this.field1594 + "," + this.field1595 + "," + this.field1359 + "," + this.field1360);
                throw new RuntimeException("eek");
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method445(int arg0) {
        if (this.field1404 == 2) {
            this.method486((this.field1299 - this.field1360 << 7) + this.field1302, 25656, this.field1300 * 2, (this.field1298 - this.field1359 << 7) + this.field1301);
            if (arg0 != 11300) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
            if (this.field1636 > -1 && field1330 % 20 < 10) {
                this.field1505[2].method185(this.field1636 - 12, (byte) 1, this.field1637 - 28);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BII)Z")
    public final boolean method446(byte[] arg0, int arg1, int arg2) {
        if (arg2 >= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        return arg0 == null ? true : signlink.wavesave(arg0, arg1);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;IIIIZI)V")
    public final void method447(Component arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg0.field75 == 0 && arg0.field90 != null && !arg0.field89) {
            if (arg2 >= arg1 && arg3 >= arg6 && arg2 <= arg0.field78 + arg1 && arg3 <= arg0.field79 + arg6) {
                int var8 = arg0.field90.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg0.field91[var9] + arg1;
                    int var11 = arg0.field92[var9] + arg6 - arg4;
                    Component var12 = Component.field68[arg0.field90[var9]];
                    int var13 = var12.field81 + var10;
                    int var14 = var12.field82 + var11;
                    if ((var12.field86 >= 0 || var12.field113 != 0) && arg2 >= var13 && arg3 >= var14 && arg2 < var12.field78 + var13 && arg3 < var12.field79 + var14) {
                        if (var12.field86 >= 0) {
                            this.field1472 = var12.field86;
                        } else {
                            this.field1472 = var12.field73;
                        }
                    }
                    if (var12.field75 == 0) {
                        this.method447(var12, var13, arg2, arg3, var12.field88, true, var14);
                        if (var12.field87 > var12.field79) {
                            this.method423(true, var14, arg2, var12.field79, var12.field78 + var13, var12.field87, arg3, var12, (byte) 7);
                        }
                    } else {
                        if (var12.field76 == 1 && arg2 >= var13 && arg3 >= var14 && arg2 < var12.field78 + var13 && arg3 < var12.field79 + var14) {
                            boolean var15 = false;
                            if (var12.field77 != 0) {
                                var15 = this.method527(var12, this.field1263);
                            }
                            if (!var15) {
                                this.field1402[this.field1254] = var12.field129;
                                this.field1608[this.field1254] = 231;
                                this.field1607[this.field1254] = var12.field73;
                                ++this.field1254;
                            }
                        }
                        if (var12.field76 == 2 && this.field1368 == 0 && arg2 >= var13 && arg3 >= var14 && arg2 < var12.field78 + var13 && arg3 < var12.field79 + var14) {
                            String var16 = var12.field126;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field1402[this.field1254] = var16 + " @gre@" + var12.field127;
                            this.field1608[this.field1254] = 274;
                            this.field1607[this.field1254] = var12.field73;
                            ++this.field1254;
                        }
                        if (var12.field76 == 3 && arg2 >= var13 && arg3 >= var14 && arg2 < var12.field78 + var13 && arg3 < var12.field79 + var14) {
                            this.field1402[this.field1254] = "Close";
                            this.field1608[this.field1254] = 737;
                            this.field1607[this.field1254] = var12.field73;
                            ++this.field1254;
                        }
                        if (var12.field76 == 4 && arg2 >= var13 && arg3 >= var14 && arg2 < var12.field78 + var13 && arg3 < var12.field79 + var14) {
                            this.field1402[this.field1254] = var12.field129;
                            this.field1608[this.field1254] = 435;
                            this.field1607[this.field1254] = var12.field73;
                            ++this.field1254;
                        }
                        if (var12.field76 == 5 && arg2 >= var13 && arg3 >= var14 && arg2 < var12.field78 + var13 && arg3 < var12.field79 + var14) {
                            this.field1402[this.field1254] = var12.field129;
                            this.field1608[this.field1254] = 225;
                            this.field1607[this.field1254] = var12.field73;
                            ++this.field1254;
                        }
                        if (var12.field76 == 6 && !this.field1502 && arg2 >= var13 && arg3 >= var14 && arg2 < var12.field78 + var13 && arg3 < var12.field79 + var14) {
                            this.field1402[this.field1254] = var12.field129;
                            this.field1608[this.field1254] = 997;
                            this.field1607[this.field1254] = var12.field73;
                            ++this.field1254;
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
                                    if (arg2 >= var20 && arg3 >= var21 && arg2 < var20 + 32 && arg3 < var21 + 32) {
                                        this.field1547 = var17;
                                        this.field1548 = var12.field73;
                                        if (var12.field69[var17] > 0) {
                                            ObjType var22 = ObjType.method342(var12.field69[var17] - 1);
                                            if (this.field1439 == 1 && var12.field96) {
                                                if (this.field1441 != var12.field73 || this.field1440 != var17) {
                                                    this.field1402[this.field1254] = "Use " + this.field1443 + " with @lre@" + var22.field1034;
                                                    this.field1608[this.field1254] = 398;
                                                    this.field1609[this.field1254] = var22.field1032;
                                                    this.field1606[this.field1254] = var17;
                                                    this.field1607[this.field1254] = var12.field73;
                                                    ++this.field1254;
                                                }
                                            } else if (this.field1368 == 1 && var12.field96) {
                                                if ((this.field1370 & 16) == 16) {
                                                    this.field1402[this.field1254] = this.field1371 + " @lre@" + var22.field1034;
                                                    this.field1608[this.field1254] = 563;
                                                    this.field1609[this.field1254] = var22.field1032;
                                                    this.field1606[this.field1254] = var17;
                                                    this.field1607[this.field1254] = var12.field73;
                                                    ++this.field1254;
                                                }
                                            } else {
                                                if (var12.field96) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1049 != null && var22.field1049[var23] != null) {
                                                            this.field1402[this.field1254] = var22.field1049[var23] + " @lre@" + var22.field1034;
                                                            if (var23 == 3) {
                                                                this.field1608[this.field1254] = 681;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field1608[this.field1254] = 100;
                                                            }
                                                            this.field1609[this.field1254] = var22.field1032;
                                                            this.field1606[this.field1254] = var17;
                                                            this.field1607[this.field1254] = var12.field73;
                                                            ++this.field1254;
                                                        } else if (var23 == 4) {
                                                            this.field1402[this.field1254] = "Drop @lre@" + var22.field1034;
                                                            this.field1608[this.field1254] = 100;
                                                            this.field1609[this.field1254] = var22.field1032;
                                                            this.field1606[this.field1254] = var17;
                                                            this.field1607[this.field1254] = var12.field73;
                                                            ++this.field1254;
                                                        }
                                                    }
                                                }
                                                if (var12.field97) {
                                                    this.field1402[this.field1254] = "Use @lre@" + var22.field1034;
                                                    this.field1608[this.field1254] = 102;
                                                    this.field1609[this.field1254] = var22.field1032;
                                                    this.field1606[this.field1254] = var17;
                                                    this.field1607[this.field1254] = var12.field73;
                                                    ++this.field1254;
                                                }
                                                if (var12.field96 && var22.field1049 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1049[var24] != null) {
                                                            this.field1402[this.field1254] = var22.field1049[var24] + " @lre@" + var22.field1034;
                                                            if (var24 == 0) {
                                                                this.field1608[this.field1254] = 694;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1608[this.field1254] = 962;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1608[this.field1254] = 795;
                                                            }
                                                            this.field1609[this.field1254] = var22.field1032;
                                                            this.field1606[this.field1254] = var17;
                                                            this.field1607[this.field1254] = var12.field73;
                                                            ++this.field1254;
                                                        }
                                                    }
                                                }
                                                if (var12.field104 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field104[var25] != null) {
                                                            this.field1402[this.field1254] = var12.field104[var25] + " @lre@" + var22.field1034;
                                                            if (var25 == 0) {
                                                                this.field1608[this.field1254] = 582;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1608[this.field1254] = 113;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1608[this.field1254] = 555;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field1608[this.field1254] = 331;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field1608[this.field1254] = 354;
                                                            }
                                                            this.field1609[this.field1254] = var22.field1032;
                                                            this.field1606[this.field1254] = var17;
                                                            this.field1607[this.field1254] = var12.field73;
                                                            ++this.field1254;
                                                        }
                                                    }
                                                }
                                                this.field1402[this.field1254] = "Examine @lre@" + var22.field1034;
                                                this.field1608[this.field1254] = 1328;
                                                this.field1609[this.field1254] = var22.field1032;
                                                this.field1606[this.field1254] = var17;
                                                this.field1607[this.field1254] = var12.field73;
                                                ++this.field1254;
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        }
                    }
                }
                this.field1578 &= arg5;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method448(long arg0, int arg1) {
        if (arg1 > 0) {
            if (arg0 != 0L) {
                for (int var4 = 0; var4 < this.field1242; ++var4) {
                    if (this.field1403[var4] == arg0) {
                        --this.field1242;
                        this.field1572 = true;
                        for (int var5 = var4; var5 < this.field1242; ++var5) {
                            this.field1524[var5] = this.field1524[var5 + 1];
                            this.field1655[var5] = this.field1655[var5 + 1];
                            this.field1403[var5] = this.field1403[var5 + 1];
                        }
                        this.field1444.method214(106, 0);
                        this.field1444.method221(9, arg0);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method449(int arg0) {
        if (arg0 != 0) {
            field1573 = true;
        }
        for (int var2 = 0; var2 < this.field1604; ++var2) {
            int var3 = this.field1605[var2];
            NpcEntity var4 = this.field1603[var3];
            if (var4 != null) {
                this.method450(var4, var4.field455.field999, true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;IZ)V")
    public final void method450(PathingEntity arg0, int arg1, boolean arg2) {
        if (arg0.field397 < 128 || arg0.field398 < 128 || arg0.field397 >= 13184 || arg0.field398 >= 13184) {
            arg0.field425 = -1;
            arg0.field430 = -1;
            arg0.field439 = 0;
            arg0.field440 = 0;
            arg0.field397 = arg0.field447[0] * 128 + arg0.field401 * 64;
            arg0.field398 = arg0.field448[0] * 128 + arg0.field401 * 64;
            arg0.method112((byte) 57);
        }
        if (field1278 == arg0 && (arg0.field397 < 1536 || arg0.field398 < 1536 || arg0.field397 >= 11776 || arg0.field398 >= 11776)) {
            arg0.field425 = -1;
            arg0.field430 = -1;
            arg0.field439 = 0;
            arg0.field440 = 0;
            arg0.field397 = arg0.field447[0] * 128 + arg0.field401 * 64;
            arg0.field398 = arg0.field448[0] * 128 + arg0.field401 * 64;
            arg0.method112((byte) 57);
        }
        if (arg0.field439 > field1330) {
            this.method451(arg0, (byte) 4);
        } else if (arg0.field440 >= field1330) {
            this.method452(arg0, -30935);
        } else {
            this.method453(arg0, false);
        }
        this.method454(1, arg0);
        this.method455(arg0, (byte) -93);
        if (arg2) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;B)V")
    public final void method451(PathingEntity arg0, byte arg1) {
        int var3 = arg0.field439 - field1330;
        int var4 = arg0.field435 * 128 + arg0.field401 * 64;
        int var5 = arg0.field437 * 128 + arg0.field401 * 64;
        arg0.field397 += (var4 - arg0.field397) / var3;
        if (arg1 != 4) {
            field1573 = true;
        }
        arg0.field398 += (var5 - arg0.field398) / var3;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;I)V")
    public final void method452(PathingEntity arg0, int arg1) {
        if (field1330 == arg0.field440 || arg0.field425 == -1 || arg0.field428 != 0 || arg0.field427 + 1 > SeqType.field1126[arg0.field425].method376(-346, arg0.field426)) {
            int var3 = arg0.field440 - arg0.field439;
            int var4 = field1330 - arg0.field439;
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
        if (arg1 != -30935) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ly;Z)V")
    public final void method453(PathingEntity arg0, boolean arg1) {
        if (arg1) {
            field1573 = true;
        }
        arg0.field422 = arg0.field402;
        if (arg0.field446 == 0) {
            arg0.field450 = 0;
        } else {
            if (arg0.field425 != -1 && arg0.field428 == 0) {
                SeqType var3 = SeqType.field1126[arg0.field425];
                if (arg0.field451 > 0 && var3.field1138 == 0) {
                    ++arg0.field450;
                    return;
                }
                if (arg0.field451 <= 0 && var3.field1139 == 0) {
                    ++arg0.field450;
                    return;
                }
            }
            int var4 = arg0.field397;
            int var5 = arg0.field398;
            int var6 = arg0.field447[arg0.field446 - 1] * 128 + arg0.field401 * 64;
            int var7 = arg0.field448[arg0.field446 - 1] * 128 + arg0.field401 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field444 = 1280;
                    } else if (var5 > var7) {
                        arg0.field444 = 1792;
                    } else {
                        arg0.field444 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field444 = 768;
                    } else if (var5 > var7) {
                        arg0.field444 = 256;
                    } else {
                        arg0.field444 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field444 = 1024;
                } else {
                    arg0.field444 = 0;
                }
                int var8 = arg0.field444 - arg0.field399 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field405;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field404;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field407;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field406;
                }
                if (var9 == -1) {
                    var9 = arg0.field404;
                }
                arg0.field422 = var9;
                int var10 = 4;
                if (arg0.field444 != arg0.field399 && arg0.field419 == -1 && arg0.field445 != 0) {
                    var10 = 2;
                }
                if (arg0.field446 > 2) {
                    var10 = 6;
                }
                if (arg0.field446 > 3) {
                    var10 = 8;
                }
                if (arg0.field450 > 0 && arg0.field446 > 1) {
                    var10 = 8;
                    --arg0.field450;
                }
                if (arg0.field449[arg0.field446 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field422 == arg0.field404 && arg0.field408 != -1) {
                    arg0.field422 = arg0.field408;
                }
                if (var4 < var6) {
                    arg0.field397 += var10;
                    if (arg0.field397 > var6) {
                        arg0.field397 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field397 -= var10;
                    if (arg0.field397 < var6) {
                        arg0.field397 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field398 += var10;
                    if (arg0.field398 > var7) {
                        arg0.field398 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field398 -= var10;
                    if (arg0.field398 < var7) {
                        arg0.field398 = var7;
                    }
                }
                if (arg0.field397 == var6 && arg0.field398 == var7) {
                    --arg0.field446;
                    if (arg0.field451 > 0) {
                        --arg0.field451;
                        return;
                    }
                }
            } else {
                arg0.field397 = var6;
                arg0.field398 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILy;)V")
    public final void method454(int arg0, PathingEntity arg1) {
        if (arg0 == 1) {
            if (arg1.field445 != 0) {
                if (arg1.field419 != -1 && arg1.field419 < 32768) {
                    NpcEntity var3 = this.field1603[arg1.field419];
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
                    if (this.field1485 == var6) {
                        var6 = this.field1347;
                    }
                    PlayerEntity var7 = this.field1348[var6];
                    if (var7 != null) {
                        int var8 = arg1.field397 - var7.field397;
                        int var9 = arg1.field398 - var7.field398;
                        if (var8 != 0 || var9 != 0) {
                            arg1.field444 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                        }
                    }
                }
                if ((arg1.field420 != 0 || arg1.field421 != 0) && (arg1.field446 == 0 || arg1.field450 > 0)) {
                    int var10 = arg1.field397 - (arg1.field420 - this.field1359 - this.field1359) * 64;
                    int var11 = arg1.field398 - (arg1.field421 - this.field1360 - this.field1360) * 64;
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
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ly;B)V")
    public final void method455(PathingEntity arg0, byte arg1) {
        if (arg1 != -93) {
            this.field1411 = -1;
        }
        arg0.field400 = false;
        if (arg0.field422 != -1) {
            SeqType var3 = SeqType.field1126[arg0.field422];
            ++arg0.field424;
            if (arg0.field423 < var3.field1127 && arg0.field424 > var3.method376(-346, arg0.field423)) {
                arg0.field424 = 0;
                ++arg0.field423;
            }
            if (arg0.field423 >= var3.field1127) {
                arg0.field424 = 0;
                arg0.field423 = 0;
            }
        }
        if (arg0.field430 != -1 && field1330 >= arg0.field433) {
            if (arg0.field431 < 0) {
                arg0.field431 = 0;
            }
            SeqType var4 = SpotAnimType.field1148[arg0.field430].field1152;
            ++arg0.field432;
            while (arg0.field431 < var4.field1127 && arg0.field432 > var4.method376(-346, arg0.field431)) {
                arg0.field432 -= var4.method376(-346, arg0.field431);
                ++arg0.field431;
            }
            if (arg0.field431 >= var4.field1127 && (arg0.field431 < 0 || arg0.field431 >= var4.field1127)) {
                arg0.field430 = -1;
            }
        }
        if (arg0.field425 != -1 && arg0.field428 <= 1) {
            SeqType var5 = SeqType.field1126[arg0.field425];
            if (var5.field1138 == 1 && arg0.field451 > 0 && arg0.field439 <= field1330 && arg0.field440 < field1330) {
                arg0.field428 = 1;
                return;
            }
        }
        if (arg0.field425 != -1 && arg0.field428 == 0) {
            SeqType var6 = SeqType.field1126[arg0.field425];
            ++arg0.field427;
            while (arg0.field426 < var6.field1127 && arg0.field427 > var6.method376(-346, arg0.field426)) {
                arg0.field427 -= var6.method376(-346, arg0.field426);
                ++arg0.field426;
            }
            if (arg0.field426 >= var6.field1127) {
                arg0.field426 -= var6.field1131;
                ++arg0.field429;
                if (arg0.field429 >= var6.field1137) {
                    arg0.field425 = -1;
                }
                if (arg0.field426 < 0 || arg0.field426 >= var6.field1127) {
                    arg0.field425 = -1;
                }
            }
            arg0.field400 = var6.field1133;
        }
        if (arg0.field428 > 0) {
            --arg0.field428;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method456(int arg0) {
        if (this.field1526) {
            this.field1526 = false;
            this.field1244.method255(super.field13, 0, 0, 4);
            this.field1245.method255(super.field13, 0, 0, 357);
            this.field1246.method255(super.field13, 722, 0, 4);
            this.field1247.method255(super.field13, 743, 0, 205);
            this.field1248.method255(super.field13, 0, 0, 0);
            this.field1249.method255(super.field13, 516, 0, 4);
            this.field1250.method255(super.field13, 516, 0, 205);
            this.field1251.method255(super.field13, 496, 0, 357);
            this.field1252.method255(super.field13, 0, 0, 338);
            this.field1572 = true;
            this.field1389 = true;
            this.field1296 = true;
            this.field1290 = true;
            if (this.field1493 != 2) {
                this.field1509.method255(super.field13, 4, 0, 4);
                this.field1508.method255(super.field13, 550, 0, 4);
            }
        }
        if (this.field1493 == 2) {
            this.method530(true);
        }
        if (this.field1523 && this.field1448 == 1) {
            this.field1572 = true;
        }
        if (this.field1599 != -1) {
            boolean var2 = this.method509(this.field1599, this.field1312, 2);
            if (var2) {
                this.field1572 = true;
            }
        }
        if (this.field1622 == 2) {
            this.field1572 = true;
        }
        if (this.field1532 == 2) {
            this.field1572 = true;
        }
        if (this.field1572) {
            this.method462(640);
            this.field1572 = false;
        }
        if (this.field1601 == -1) {
            this.field1625.field88 = this.field1460 - this.field1475 - 77;
            if (super.field21 > 448 && super.field21 < 560 && super.field22 > 332) {
                this.method423(false, 0, super.field21 - 17, 77, 463, this.field1460, super.field22 - 357, this.field1625, (byte) 7);
            }
            int var3 = this.field1460 - 77 - this.field1625.field88;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1460 - 77) {
                var3 = this.field1460 - 77;
            }
            if (this.field1475 != var3) {
                this.field1475 = var3;
                this.field1389 = true;
            }
        }
        if (this.field1601 != -1) {
            boolean var4 = this.method509(this.field1601, this.field1312, 2);
            if (var4) {
                this.field1389 = true;
            }
        }
        if (this.field1622 == 3) {
            this.field1389 = true;
        }
        if (this.field1532 == 3) {
            this.field1389 = true;
        }
        if (this.field1456 != null) {
            this.field1389 = true;
        }
        if (this.field1523 && this.field1448 == 2) {
            this.field1389 = true;
        }
        if (this.field1389) {
            this.method541((byte) 6);
            this.field1389 = false;
        }
        if (this.field1493 == 2) {
            this.method433(true);
            this.field1508.method255(super.field13, 550, 0, 4);
        }
        if (this.field1374 != -1) {
            this.field1296 = true;
        }
        if (this.field1296) {
            if (this.field1374 != -1 && this.field1438 == this.field1374) {
                this.field1374 = -1;
                this.field1444.method214(94, 0);
                this.field1444.method215(this.field1438);
            }
            this.field1296 = false;
            this.field1497.method254(979);
            this.field1539.method198(0, (byte) 1, 0);
            if (this.field1599 == -1) {
                if (this.field1341[this.field1438] != -1) {
                    if (this.field1438 == 0) {
                        this.field1384.method198(22, (byte) 1, 10);
                    }
                    if (this.field1438 == 1) {
                        this.field1385.method198(54, (byte) 1, 8);
                    }
                    if (this.field1438 == 2) {
                        this.field1385.method198(82, (byte) 1, 8);
                    }
                    if (this.field1438 == 3) {
                        this.field1386.method198(110, (byte) 1, 8);
                    }
                    if (this.field1438 == 4) {
                        this.field1388.method198(153, (byte) 1, 8);
                    }
                    if (this.field1438 == 5) {
                        this.field1388.method198(181, (byte) 1, 8);
                    }
                    if (this.field1438 == 6) {
                        this.field1387.method198(209, (byte) 1, 9);
                    }
                }
                if (this.field1341[0] != -1 && (this.field1374 != 0 || field1330 % 20 < 10)) {
                    this.field1477[0].method198(29, (byte) 1, 13);
                }
                if (this.field1341[1] != -1 && (this.field1374 != 1 || field1330 % 20 < 10)) {
                    this.field1477[1].method198(53, (byte) 1, 11);
                }
                if (this.field1341[2] != -1 && (this.field1374 != 2 || field1330 % 20 < 10)) {
                    this.field1477[2].method198(82, (byte) 1, 11);
                }
                if (this.field1341[3] != -1 && (this.field1374 != 3 || field1330 % 20 < 10)) {
                    this.field1477[3].method198(115, (byte) 1, 12);
                }
                if (this.field1341[4] != -1 && (this.field1374 != 4 || field1330 % 20 < 10)) {
                    this.field1477[4].method198(153, (byte) 1, 13);
                }
                if (this.field1341[5] != -1 && (this.field1374 != 5 || field1330 % 20 < 10)) {
                    this.field1477[5].method198(180, (byte) 1, 11);
                }
                if (this.field1341[6] != -1 && (this.field1374 != 6 || field1330 % 20 < 10)) {
                    this.field1477[6].method198(208, (byte) 1, 13);
                }
            }
            this.field1497.method255(super.field13, 516, 0, 160);
            this.field1496.method254(979);
            this.field1538.method198(0, (byte) 1, 0);
            if (this.field1599 == -1) {
                if (this.field1341[this.field1438] != -1) {
                    if (this.field1438 == 7) {
                        this.field1363.method198(42, (byte) 1, 0);
                    }
                    if (this.field1438 == 8) {
                        this.field1364.method198(74, (byte) 1, 0);
                    }
                    if (this.field1438 == 9) {
                        this.field1364.method198(102, (byte) 1, 0);
                    }
                    if (this.field1438 == 10) {
                        this.field1365.method198(130, (byte) 1, 1);
                    }
                    if (this.field1438 == 11) {
                        this.field1367.method198(173, (byte) 1, 0);
                    }
                    if (this.field1438 == 12) {
                        this.field1367.method198(201, (byte) 1, 0);
                    }
                    if (this.field1438 == 13) {
                        this.field1366.method198(229, (byte) 1, 0);
                    }
                }
                if (this.field1341[8] != -1 && (this.field1374 != 8 || field1330 % 20 < 10)) {
                    this.field1477[7].method198(74, (byte) 1, 2);
                }
                if (this.field1341[9] != -1 && (this.field1374 != 9 || field1330 % 20 < 10)) {
                    this.field1477[8].method198(102, (byte) 1, 3);
                }
                if (this.field1341[10] != -1 && (this.field1374 != 10 || field1330 % 20 < 10)) {
                    this.field1477[9].method198(137, (byte) 1, 4);
                }
                if (this.field1341[11] != -1 && (this.field1374 != 11 || field1330 % 20 < 10)) {
                    this.field1477[10].method198(174, (byte) 1, 2);
                }
                if (this.field1341[12] != -1 && (this.field1374 != 12 || field1330 % 20 < 10)) {
                    this.field1477[11].method198(201, (byte) 1, 2);
                }
                if (this.field1341[13] != -1 && (this.field1374 != 13 || field1330 % 20 < 10)) {
                    this.field1477[12].method198(226, (byte) 1, 2);
                }
            }
            this.field1496.method255(super.field13, 496, 0, 466);
            this.field1509.method254(979);
        }
        if (this.field1290) {
            this.field1290 = false;
            this.field1495.method254(979);
            this.field1537.method198(0, (byte) 1, 0);
            this.field1644.method201(true, 28, "Public chat", 55, false, 16777215);
            if (this.field1651 == 0) {
                this.field1644.method201(true, 41, "On", 55, false, 65280);
            }
            if (this.field1651 == 1) {
                this.field1644.method201(true, 41, "Friends", 55, false, 16776960);
            }
            if (this.field1651 == 2) {
                this.field1644.method201(true, 41, "Off", 55, false, 16711680);
            }
            if (this.field1651 == 3) {
                this.field1644.method201(true, 41, "Hide", 55, false, 65535);
            }
            this.field1644.method201(true, 28, "Private chat", 184, false, 16777215);
            if (this.field1529 == 0) {
                this.field1644.method201(true, 41, "On", 184, false, 65280);
            }
            if (this.field1529 == 1) {
                this.field1644.method201(true, 41, "Friends", 184, false, 16776960);
            }
            if (this.field1529 == 2) {
                this.field1644.method201(true, 41, "Off", 184, false, 16711680);
            }
            this.field1644.method201(true, 28, "Trade/compete", 324, false, 16777215);
            if (this.field1269 == 0) {
                this.field1644.method201(true, 41, "On", 324, false, 65280);
            }
            if (this.field1269 == 1) {
                this.field1644.method201(true, 41, "Friends", 324, false, 16776960);
            }
            if (this.field1269 == 2) {
                this.field1644.method201(true, 41, "Off", 324, false, 16711680);
            }
            this.field1644.method201(true, 33, "Report abuse", 458, false, 16777215);
            this.field1495.method255(super.field13, 0, 0, 453);
            this.field1509.method254(979);
        }
        this.field1312 = 0;
        if (arg0 != 38919) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method457(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field1223 = 0;
        for (int var3 = -1; var3 < this.field1604 + this.field1349; ++var3) {
            PathingEntity var18;
            if (var3 == -1) {
                var18 = field1278;
            } else if (var3 < this.field1349) {
                var18 = this.field1348[this.field1350[var3]];
            } else {
                var18 = this.field1603[this.field1605[var3 - this.field1349]];
            }
            if (var18 != null && var18.method113((byte) 121)) {
                if (var3 >= this.field1349) {
                    NpcType var22 = ((NpcEntity) var18).field455;
                    if (var22.field1020 >= 0 && var22.field1020 < this.field1505.length) {
                        this.method485(var18.field443 + 15, (byte) 67, var18);
                        if (this.field1636 > -1) {
                            this.field1505[var22.field1020].method185(this.field1636 - 12, (byte) 1, this.field1637 - 30);
                        }
                    }
                    if (this.field1404 == 1 && this.field1605[var3 - this.field1349] == this.field1310 && field1330 % 20 < 10) {
                        this.method485(var18.field443 + 15, (byte) 67, var18);
                        if (this.field1636 > -1) {
                            this.field1505[2].method185(this.field1636 - 12, (byte) 1, this.field1637 - 28);
                        }
                    }
                } else {
                    int var19 = 30;
                    PlayerEntity var20 = (PlayerEntity) var18;
                    if (var20.field461 != 0) {
                        this.method485(var18.field443 + 15, (byte) 67, var18);
                        if (this.field1636 > -1) {
                            for (int var21 = 0; var21 < 8; ++var21) {
                                if ((var20.field461 & 1 << var21) != 0) {
                                    this.field1505[var21].method185(this.field1636 - 12, (byte) 1, this.field1637 - var19);
                                    var19 -= 25;
                                }
                            }
                        }
                    }
                    if (var3 >= 0 && this.field1404 == 10 && this.field1350[var3] == this.field1648) {
                        this.method485(var18.field443 + 15, (byte) 67, var18);
                        if (this.field1636 > -1) {
                            this.field1505[7].method185(this.field1636 - 12, (byte) 1, this.field1637 - var19);
                        }
                    }
                }
                if (var18.field409 != null && (var3 >= this.field1349 || this.field1651 == 0 || this.field1651 == 3 || this.field1651 == 1 && this.method430(2, ((PlayerEntity) var18).field458))) {
                    this.method485(var18.field443, (byte) 67, var18);
                    if (this.field1636 > -1 && this.field1223 < this.field1224) {
                        this.field1228[this.field1223] = this.field1645.method203(var18.field409, 479) / 2;
                        this.field1227[this.field1223] = this.field1645.field691;
                        this.field1225[this.field1223] = this.field1636;
                        this.field1226[this.field1223] = this.field1637;
                        this.field1229[this.field1223] = var18.field411;
                        this.field1230[this.field1223] = var18.field412;
                        this.field1231[this.field1223] = var18.field410;
                        this.field1232[this.field1223++] = var18.field409;
                        if (this.field1583 == 0 && var18.field412 == 1) {
                            this.field1227[this.field1223] += 10;
                            this.field1226[this.field1223] += 5;
                        }
                        if (this.field1583 == 0 && var18.field412 == 2) {
                            this.field1228[this.field1223] = 60;
                        }
                    }
                }
                if (var18.field416 > field1330) {
                    this.method485(var18.field443 + 15, (byte) 67, var18);
                    if (this.field1636 > -1) {
                        int var23 = var18.field417 * 30 / var18.field418;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        Pix2D.method156(this.field1636 - 15, 65280, 5, var23, -37952, this.field1637 - 3);
                        Pix2D.method156(this.field1636 - 15 + var23, 16711680, 5, 30 - var23, -37952, this.field1637 - 3);
                    }
                }
                for (int var24 = 0; var24 < 4; ++var24) {
                    if (var18.field415[var24] > field1330) {
                        this.method485(var18.field443 / 2, (byte) 67, var18);
                        if (this.field1636 > -1) {
                            if (var24 == 1) {
                                this.field1637 -= 20;
                            }
                            if (var24 == 2) {
                                this.field1636 -= 15;
                                this.field1637 -= 10;
                            }
                            if (var24 == 3) {
                                this.field1636 += 15;
                                this.field1637 -= 10;
                            }
                            this.field1264[var18.field414[var24]].method185(this.field1636 - 12, (byte) 1, this.field1637 - 12);
                            this.field1643.method200(this.field1636, (byte) 2, 0, String.valueOf(var18.field413[var24]), this.field1637 + 4);
                            this.field1643.method200(this.field1636 - 1, (byte) 2, 16777215, String.valueOf(var18.field413[var24]), this.field1637 + 3);
                        }
                    }
                }
            }
        }
        for (int var4 = 0; var4 < this.field1223; ++var4) {
            int var5 = this.field1225[var4];
            int var6 = this.field1226[var4];
            int var7 = this.field1228[var4];
            int var8 = this.field1227[var4];
            boolean var9 = true;
            while (var9) {
                var9 = false;
                for (int var17 = 0; var17 < var4; ++var17) {
                    if (var6 + 2 > this.field1226[var17] - this.field1227[var17] && var6 - var8 < this.field1226[var17] + 2 && var5 - var7 < this.field1228[var17] + this.field1225[var17] && var5 + var7 > this.field1225[var17] - this.field1228[var17] && this.field1226[var17] - this.field1227[var17] < var6) {
                        var6 = this.field1226[var17] - this.field1227[var17];
                        var9 = true;
                    }
                }
            }
            this.field1636 = this.field1225[var4];
            this.field1637 = this.field1226[var4] = var6;
            String var10 = this.field1232[var4];
            if (this.field1583 == 0) {
                int var11 = 16776960;
                if (this.field1229[var4] < 6) {
                    var11 = this.field1610[this.field1229[var4]];
                }
                if (this.field1229[var4] == 6) {
                    var11 = this.field1455 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1229[var4] == 7) {
                    var11 = this.field1455 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1229[var4] == 8) {
                    var11 = this.field1455 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1229[var4] == 9) {
                    int var12 = 150 - this.field1231[var4];
                    if (var12 < 50) {
                        var11 = var12 * 1280 + 16711680;
                    } else if (var12 < 100) {
                        var11 = 16776960 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var11 = (var12 - 100) * 5 + 65280;
                    }
                }
                if (this.field1229[var4] == 10) {
                    int var13 = 150 - this.field1231[var4];
                    if (var13 < 50) {
                        var11 = var13 * 5 + 16711680;
                    } else if (var13 < 100) {
                        var11 = 16711935 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var11 = (var13 - 100) * 327680 + 255 - (var13 - 100) * 5;
                    }
                }
                if (this.field1229[var4] == 11) {
                    int var14 = 150 - this.field1231[var4];
                    if (var14 < 50) {
                        var11 = 16777215 - var14 * 327685;
                    } else if (var14 < 100) {
                        var11 = (var14 - 50) * 327685 + 65280;
                    } else if (var14 < 150) {
                        var11 = 16777215 - (var14 - 100) * 327680;
                    }
                }
                if (this.field1230[var4] == 0) {
                    this.field1645.method200(this.field1636, (byte) 2, 0, var10, this.field1637 + 1);
                    this.field1645.method200(this.field1636, (byte) 2, var11, var10, this.field1637);
                }
                if (this.field1230[var4] == 1) {
                    this.field1645.method205(0, var10, this.field1455, this.field1637 + 1, this.field1636, (byte) 8);
                    this.field1645.method205(var11, var10, this.field1455, this.field1637, this.field1636, (byte) 8);
                }
                if (this.field1230[var4] == 2) {
                    int var15 = this.field1645.method203(var10, 479);
                    int var16 = (150 - this.field1231[var4]) * (var15 + 100) / 150;
                    Pix2D.method153(0, this.field1636 - 50, this.field1636 + 50, 334, 297);
                    this.field1645.method204(this.field1636 + 50 - var16, var10, -1765, this.field1637 + 1, 0);
                    this.field1645.method204(this.field1636 + 50 - var16, var10, -1765, this.field1637, var11);
                    Pix2D.method152(false);
                }
            } else {
                this.field1645.method200(this.field1636, (byte) 2, 0, var10, this.field1637 + 1);
                this.field1645.method200(this.field1636, (byte) 2, 16776960, var10, this.field1637);
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method458(int arg0) {
        Graphics var2 = this.method11(37639).getGraphics();
        var2.setColor(Color.black);
        if (arg0 != 0) {
            this.field1628 = null;
        }
        var2.fillRect(0, 0, 765, 503);
        this.method4(1, (byte) 1);
        if (this.field1596) {
            this.field1491 = false;
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
        if (this.field1213) {
            this.field1491 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1471) {
            this.field1491 = false;
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

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method459(boolean arg0) {
        this.field1491 = false;
        while (this.field1500) {
            this.field1491 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1266 = null;
        this.field1267 = null;
        if (arg0) {
            field1218 = !field1218;
        }
        this.field1487 = null;
        this.field1428 = null;
        this.field1429 = null;
        this.field1430 = null;
        this.field1431 = null;
        this.field1259 = null;
        this.field1260 = null;
        this.field1334 = null;
        this.field1335 = null;
        this.field1488 = null;
        this.field1489 = null;
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method460(int arg0) {
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 >= 0) {
            this.field1411 = this.field1470.method225();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljb;I)V")
    public final void method461(Pix8 arg0, int arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1259.length; ++var4) {
            this.field1259[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1259[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field1260[var16] = (this.field1259[var16 - 1] + this.field1259[var16 + 1] + this.field1259[var16 - 128] + this.field1259[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field1259;
            this.field1259 = this.field1260;
            this.field1260 = var14;
        }
        if (arg1 == 0) {
            if (arg0 != null) {
                int var7 = 0;
                for (int var8 = 0; var8 < arg0.field676; ++var8) {
                    for (int var9 = 0; var9 < arg0.field675; ++var9) {
                        if (arg0.field673[var7++] != 0) {
                            int var10 = var9 + 16 + arg0.field677;
                            int var11 = var8 + 16 + arg0.field678;
                            int var12 = (var11 << 7) + var10;
                            this.field1259[var12] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method462(int arg0) {
        this.field1507.method254(979);
        int var2 = 90 / arg0;
        Pix3D.field645 = this.field1559;
        this.field1379.method198(0, (byte) 1, 0);
        if (this.field1599 != -1) {
            this.method555(Component.field68[this.field1599], 2712, 0, 0, 0);
        } else if (this.field1341[this.field1438] != -1) {
            this.method555(Component.field68[this.field1341[this.field1438]], 2712, 0, 0, 0);
        }
        if (this.field1523 && this.field1448 == 1) {
            this.method498(185);
        }
        this.field1507.method255(super.field13, 553, 0, 205);
        this.field1509.method254(979);
        Pix3D.field645 = this.field1560;
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method463(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        int var3 = 5;
        this.field1627[8] = 0;
        int var4 = 0;
        while (this.field1627[8] == 0) {
            String var5 = "Unknown problem";
            this.method13(9, 20, "Connecting to web server");
            try {
                DataInputStream var6 = this.method432("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 282);
                Packet var7 = new Packet(new byte[40], 185);
                var6.readFully(var7.field707, 0, 40);
                var6.close();
                for (int var8 = 0; var8 < 9; ++var8) {
                    this.field1627[var8] = var7.method230();
                }
                int var9 = var7.method230();
                int var10 = 1234;
                for (int var11 = 0; var11 < 9; ++var11) {
                    var10 = (var10 << 1) + this.field1627[var11];
                }
                if (var9 != var10) {
                    var5 = "checksum problem";
                    this.field1627[8] = 0;
                }
            } catch (EOFException var14) {
                var5 = "EOF problem";
                this.field1627[8] = 0;
            } catch (IOException var15) {
                var5 = "connection problem";
                this.field1627[8] = 0;
            } catch (Exception var16) {
                var5 = "logic problem";
                this.field1627[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field1627[8] == 0) {
                ++var4;
                for (int var12 = var3; var12 > 0; --var12) {
                    if (var4 >= 10) {
                        this.method13(9, 10, "Game updated - please reload page");
                        var12 = 10;
                    } else {
                        this.method13(9, 10, var5 + " - Will retry in " + var12 + " secs.");
                    }
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var13) {
                    }
                }
                var3 *= 2;
                if (var3 > 60) {
                    var3 = 60;
                }
                this.field1304 = !this.field1304;
            }
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field16 != null) {
                    return new URL("http://127.0.0.1:" + (field1307 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Ljava/lang/String;")
    public static final String method464(int arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            throw new NullPointerException();
        } else {
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
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method465(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg2;
        this.field1410 += arg3;
        return ((arg0 & 16711935) * arg2 + (arg1 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg2 + (arg1 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method466(byte arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1334[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1334[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1335[var14] = (this.field1334[var14 - 1] + this.field1334[var14 + 1] + this.field1334[var14 - 128] + this.field1334[var14 + 128]) / 4;
            }
        }
        this.field1415 += 128;
        if (arg0 != 16) {
            this.method6();
        }
        if (this.field1415 > this.field1259.length) {
            this.field1415 -= this.field1259.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method461(this.field1487[var6], 0);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field1335[var11 + 128] - this.field1259[this.field1415 + var11 & this.field1259.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field1334[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field1653[var8] = this.field1653[var8 + 1];
        }
        this.field1653[var2 - 1] = (int) (Math.sin((double) field1330 / 14.0D) * 16.0D + Math.sin((double) field1330 / 15.0D) * 14.0D + Math.sin((double) field1330 / 16.0D) * 12.0D);
        if (this.field1634 > 0) {
            this.field1634 -= 4;
        }
        if (this.field1635 > 0) {
            this.field1635 -= 4;
        }
        if (this.field1634 == 0 && this.field1635 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field1634 = 1024;
            }
            if (var9 == 1) {
                this.field1635 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method467(int arg0) {
        for (int var2 = 0; var2 < this.field1326; ++var2) {
            if (this.field1317[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field1453[var2] == this.field1600 && this.field1435[var2] == this.field1416) {
                        if (!this.method519((byte) 5)) {
                            var3 = true;
                        }
                    } else {
                        Packet var4 = Wave.method315(-42410, this.field1453[var2], this.field1435[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field708 / 22) > (long) (this.field1501 / 22) + this.field1652) {
                            this.field1501 = var4.field708;
                            this.field1652 = System.currentTimeMillis();
                            if (this.method446(var4.field707, var4.field708, -237)) {
                                this.field1600 = this.field1453[var2];
                                this.field1416 = this.field1435[var2];
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
                    --this.field1326;
                    for (int var6 = var2; var6 < this.field1326; ++var6) {
                        this.field1453[var6] = this.field1453[var6 + 1];
                        this.field1435[var6] = this.field1435[var6 + 1];
                        this.field1317[var6] = this.field1317[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field1317[var2]--;
            }
        }
        if (arg0 != 9) {
            this.field1411 = this.field1470.method225();
        }
        if (this.field1211 > 0) {
            this.field1211 -= 20;
            if (this.field1211 < 0) {
                this.field1211 = 0;
            }
            if (this.field1211 == 0 && this.field1257 && !field1309) {
                this.field1623 = this.field1289;
                this.field1624 = true;
                this.field1459.method275(2, this.field1623);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;IB)V")
    private final void method468(Packet arg0, int arg1, byte arg2) {
        arg0.method235(false);
        int var4 = arg0.method236(0, 1);
        if (var4 != 0) {
            int var5 = arg0.method236(0, 2);
            if (arg2 != 0) {
                for (int var6 = 1; var6 > 0; ++var6) {
                }
            }
            if (var5 == 0) {
                this.field1352[this.field1351++] = this.field1347;
            } else if (var5 == 1) {
                int var7 = arg0.method236(0, 3);
                field1278.method111((byte) 5, var7, false);
                int var8 = arg0.method236(0, 1);
                if (var8 == 1) {
                    this.field1352[this.field1351++] = this.field1347;
                }
            } else if (var5 == 2) {
                int var9 = arg0.method236(0, 3);
                field1278.method111((byte) 5, var9, true);
                int var10 = arg0.method236(0, 3);
                field1278.method111((byte) 5, var10, true);
                int var11 = arg0.method236(0, 1);
                if (var11 == 1) {
                    this.field1352[this.field1351++] = this.field1347;
                }
            } else if (var5 == 3) {
                this.field1303 = arg0.method236(0, 2);
                int var12 = arg0.method236(0, 7);
                int var13 = arg0.method236(0, 7);
                int var14 = arg0.method236(0, 1);
                field1278.method110(var12, var14 == 1, var13, true);
                int var15 = arg0.method236(0, 1);
                if (var15 == 1) {
                    this.field1352[this.field1351++] = this.field1347;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method469(boolean arg0) {
        if (!arg0) {
            this.method6();
        }
        if (field1309 && this.field1493 == 2 && World.field43 != this.field1303) {
            this.field1509.method254(979);
            this.field1644.method200(257, (byte) 2, 0, "Loading - please wait.", 151);
            this.field1644.method200(256, (byte) 2, 16777215, "Loading - please wait.", 150);
            this.field1509.method255(super.field13, 4, 0, 4);
            this.field1493 = 1;
            this.field1549 = System.currentTimeMillis();
        }
        if (this.field1493 == 1) {
            int var2 = this.method470(false);
            if (var2 != 0 && System.currentTimeMillis() - this.field1549 > 360000L) {
                signlink.reporterror(this.field1597 + " glcfb " + this.field1434 + "," + var2 + "," + field1309 + "," + this.field1586[0] + "," + this.field1459.method276() + "," + this.field1303 + "," + this.field1594 + "," + this.field1595);
                this.field1549 = System.currentTimeMillis();
            }
        }
        if (this.field1493 == 2 && this.field1303 != this.field1212) {
            this.field1212 = this.field1303;
            this.method505(this.field1303, 2412);
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)I")
    public final int method470(boolean arg0) {
        for (int var2 = 0; var2 < this.field1546.length; ++var2) {
            if (this.field1546[var2] == null && this.field1581[var2] != -1) {
                return -1;
            }
            if (this.field1457[var2] == null && this.field1582[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1546.length; ++var4) {
            byte[] var5 = this.field1457[var4];
            if (var5 != null) {
                int var6 = (this.field1580[var4] >> 8) * 64 - this.field1359;
                int var7 = (this.field1580[var4] & 255) * 64 - this.field1360;
                var3 &= World.method16(var7, var5, var6, false);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field1427) {
            return -4;
        } else {
            this.field1493 = 2;
            World.field43 = this.field1303;
            if (arg0) {
                this.field1444.method215(50);
            }
            this.method549((byte) 45);
            this.field1444.method214(214, 0);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;ILab;II)V")
    private final void method471(Packet arg0, int arg1, PlayerEntity arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if ((arg1 & 1) == 1) {
            int var7 = arg0.method225();
            byte[] var8 = new byte[var7];
            Packet var9 = new Packet(var8, 185);
            arg0.method234(0, 0, var7, var8);
            this.field1353[arg3] = var9;
            arg2.method116(false, var9);
        }
        if ((arg1 & 2) == 2) {
            int var10 = arg0.method227();
            if (var10 == 65535) {
                var10 = -1;
            }
            if (arg2.field425 == var10) {
                arg2.field429 = 0;
            }
            int var11 = arg0.method225();
            if (arg2.field425 == var10 && var10 != -1) {
                int var12 = SeqType.field1126[var10].field1140;
                if (var12 == 1) {
                    arg2.field426 = 0;
                    arg2.field427 = 0;
                    arg2.field428 = var11;
                    arg2.field429 = 0;
                }
                if (var12 == 2) {
                    arg2.field429 = 0;
                }
            } else if (var10 == -1 || arg2.field425 == -1 || SeqType.field1126[var10].field1134 >= SeqType.field1126[arg2.field425].field1134) {
                arg2.field425 = var10;
                arg2.field426 = 0;
                arg2.field427 = 0;
                arg2.field428 = var11;
                arg2.field429 = 0;
                arg2.field451 = arg2.field446;
            }
        }
        if ((arg1 & 4) == 4) {
            arg2.field419 = arg0.method227();
            if (arg2.field419 == 65535) {
                arg2.field419 = -1;
            }
        }
        if ((arg1 & 8) == 8) {
            arg2.field409 = arg0.method232();
            arg2.field411 = 0;
            arg2.field412 = 0;
            arg2.field410 = 150;
            this.method544(this.field1234, arg2.field458, arg2.field409, 2);
        }
        if ((arg1 & 16) == 16) {
            int var13 = arg0.method225();
            int var14 = arg0.method225();
            arg2.method114(var13, var14, field1330, -284);
            arg2.field416 = field1330 + 300;
            arg2.field417 = arg0.method225();
            arg2.field418 = arg0.method225();
        }
        if ((arg1 & 32) == 32) {
            arg2.field420 = arg0.method227();
            arg2.field421 = arg0.method227();
        }
        if ((arg1 & 64) == 64) {
            int var15 = arg0.method227();
            int var16 = arg0.method225();
            int var17 = arg0.method225();
            int var18 = arg0.field708;
            if (arg2.field458 != null && arg2.field459) {
                long var19 = JString.method296(arg2.field458);
                boolean var21 = false;
                if (var16 <= 1) {
                    for (int var22 = 0; var22 < this.field1313; ++var22) {
                        if (this.field1618[var22] == var19) {
                            var21 = true;
                            break;
                        }
                    }
                }
                if (!var21 && this.field1437 == 0) {
                    try {
                        String var23 = WordPack.method303(var17, (byte) 7, arg0);
                        String var24 = WordFilter.method395(var23, 7);
                        arg2.field409 = var24;
                        arg2.field411 = var15 >> 8;
                        arg2.field412 = var15 & 255;
                        arg2.field410 = 150;
                        if (var16 != 2 && var16 != 3) {
                            if (var16 == 1) {
                                this.method544(this.field1234, "@cr1@" + arg2.field458, var24, 1);
                            } else {
                                this.method544(this.field1234, arg2.field458, var24, 2);
                            }
                        } else {
                            this.method544(this.field1234, "@cr2@" + arg2.field458, var24, 1);
                        }
                    } catch (Exception var29) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg0.field708 = var17 + var18;
        }
        if ((arg1 & 256) == 256) {
            arg2.field430 = arg0.method227();
            int var26 = arg0.method230();
            arg2.field434 = var26 >> 16;
            arg2.field433 = (var26 & 65535) + field1330;
            arg2.field431 = 0;
            arg2.field432 = 0;
            if (arg2.field433 > field1330) {
                arg2.field431 = -1;
            }
            if (arg2.field430 == 65535) {
                arg2.field430 = -1;
            }
        }
        if ((arg1 & 512) == 512) {
            arg2.field435 = arg0.method225();
            arg2.field437 = arg0.method225();
            arg2.field436 = arg0.method225();
            arg2.field438 = arg0.method225();
            arg2.field439 = arg0.method227() + field1330;
            arg2.field440 = arg0.method227() + field1330;
            arg2.field441 = arg0.method225();
            arg2.method112((byte) 57);
        }
        if ((arg1 & 1024) == 1024) {
            int var27 = arg0.method225();
            int var28 = arg0.method225();
            arg2.method114(var27, var28, field1330, -284);
            arg2.field416 = field1330 + 300;
            arg2.field417 = arg0.method225();
            arg2.field418 = arg0.method225();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        this.method13(9, 20, "Starting up");
        if (signlink.sunjava) {
            super.field7 = 5;
        }
        if (field1220) {
            this.field1471 = true;
        } else {
            field1220 = true;
            boolean var1 = false;
            String var2 = this.method434(-834);
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
                this.field1213 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1586[var3] = new FileStream(284, 500000, signlink.cache_idx[var3], var3 + 1, signlink.cache_dat);
                    }
                }
                try {
                    this.method463(0);
                    this.field1540 = this.method473(1, "title", this.field1627[1], "title screen", 25, 0);
                    this.field1643 = new PixFont(this.field1540, false, "p11_full", 8);
                    this.field1644 = new PixFont(this.field1540, false, "p12_full", 8);
                    this.field1645 = new PixFont(this.field1540, false, "b12_full", 8);
                    this.field1646 = new PixFont(this.field1540, true, "q8_full", 8);
                    this.method526(false);
                    this.method507(7);
                    Jagfile var4 = this.method473(2, "config", this.field1627[2], "config", 30, 0);
                    Jagfile var5 = this.method473(3, "interface", this.field1627[3], "interface", 35, 0);
                    Jagfile var6 = this.method473(4, "media", this.field1627[4], "2d graphics", 40, 0);
                    Jagfile var7 = this.method473(6, "textures", this.field1627[6], "textures", 45, 0);
                    Jagfile var8 = this.method473(7, "wordenc", this.field1627[7], "chat system", 50, 0);
                    Jagfile var9 = this.method473(8, "sounds", this.field1627[8], "sound effects", 55, 0);
                    this.field1422 = new byte[4][104][104];
                    this.field1490 = new int[4][105][105];
                    this.field1536 = new World3D(16215, 104, 4, this.field1490, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field1235[var10] = new CollisionMap((byte) -97, 104, 104);
                    }
                    this.field1277 = new Pix32(512, 512);
                    Jagfile var11 = this.method473(5, "versionlist", this.field1627[5], "update list", 60, 0);
                    this.method13(9, 60, "Connecting to update server");
                    this.field1459 = new OnDemand();
                    this.field1459.method266(var11, this);
                    AnimFrame.method44(this.field1459.method269(-937));
                    Model.method122(this.field1459.method268(0, -833), this.field1459);
                    if (!field1309) {
                        this.field1623 = 0;
                        try {
                            this.field1623 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field1624 = true;
                        this.field1459.method275(2, this.field1623);
                        while (this.field1459.method276() > 0) {
                            this.method552(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field1459.field838 > 3) {
                                this.method491("ondemand");
                                return;
                            }
                        }
                    }
                    this.method13(9, 65, "Requesting animations");
                    int var12 = this.field1459.method268(1, -833);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field1459.method275(1, var13);
                    }
                    while (this.field1459.method276() > 0) {
                        int var14 = var12 - this.field1459.method276();
                        if (var14 > 0) {
                            this.method13(9, 65, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method552(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field1459.field838 > 3) {
                            this.method491("ondemand");
                            return;
                        }
                    }
                    this.method13(9, 70, "Requesting models");
                    int var15 = this.field1459.method268(0, -833);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field1459.method273(var16, 30455);
                        if ((var17 & 1) != 0) {
                            this.field1459.method275(0, var16);
                        }
                    }
                    int var18 = this.field1459.method276();
                    while (this.field1459.method276() > 0) {
                        int var19 = var18 - this.field1459.method276();
                        if (var19 > 0) {
                            this.method13(9, 70, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method552(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field1586[0] != null) {
                        this.method13(9, 75, "Requesting maps");
                        this.field1459.method275(3, this.field1459.method270(0, 47, 48, true));
                        this.field1459.method275(3, this.field1459.method270(1, 47, 48, true));
                        this.field1459.method275(3, this.field1459.method270(0, 48, 48, true));
                        this.field1459.method275(3, this.field1459.method270(1, 48, 48, true));
                        this.field1459.method275(3, this.field1459.method270(0, 49, 48, true));
                        this.field1459.method275(3, this.field1459.method270(1, 49, 48, true));
                        this.field1459.method275(3, this.field1459.method270(0, 47, 47, true));
                        this.field1459.method275(3, this.field1459.method270(1, 47, 47, true));
                        this.field1459.method275(3, this.field1459.method270(0, 48, 47, true));
                        this.field1459.method275(3, this.field1459.method270(1, 48, 47, true));
                        this.field1459.method275(3, this.field1459.method270(0, 48, 148, true));
                        this.field1459.method275(3, this.field1459.method270(1, 48, 148, true));
                        int var20 = this.field1459.method276();
                        while (this.field1459.method276() > 0) {
                            int var21 = var20 - this.field1459.method276();
                            if (var21 > 0) {
                                this.method13(9, 75, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method552(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field1459.method268(0, -833);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field1459.method273(var23, 30455);
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
                            this.field1459.method278(var23, var25, 0, 0);
                        }
                    }
                    this.field1459.method271((byte) 9, field1308);
                    if (!field1309) {
                        int var26 = this.field1459.method268(2, -833);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field1459.method274(-685, var27)) {
                                this.field1459.method278(var27, (byte) 1, 0, 2);
                            }
                        }
                    }
                    this.method13(9, 80, "Unpacking media");
                    this.field1379 = new Pix8(var6, "invback", 0);
                    this.field1381 = new Pix8(var6, "chatback", 0);
                    this.field1380 = new Pix8(var6, "mapback", 0);
                    this.field1537 = new Pix8(var6, "backbase1", 0);
                    this.field1538 = new Pix8(var6, "backbase2", 0);
                    this.field1539 = new Pix8(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field1477[var28] = new Pix8(var6, "sideicons", var28);
                    }
                    this.field1328 = new Pix32(var6, "compass", 0);
                    this.field1584 = new Pix32(var6, "mapedge", 0);
                    this.field1584.method182(false);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field1432[var29] = new Pix8(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field1587[var30] = new Pix32(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field1264[var31] = new Pix32(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field1505[var32] = new Pix32(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field1574 = new Pix32(var6, "mapmarker", 0);
                    this.field1575 = new Pix32(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field1409[var33] = new Pix32(var6, "cross", var33);
                    }
                    this.field1282 = new Pix32(var6, "mapdots", 0);
                    this.field1283 = new Pix32(var6, "mapdots", 1);
                    this.field1284 = new Pix32(var6, "mapdots", 2);
                    this.field1285 = new Pix32(var6, "mapdots", 3);
                    this.field1551 = new Pix8(var6, "scrollbar", 0);
                    this.field1552 = new Pix8(var6, "scrollbar", 1);
                    this.field1384 = new Pix8(var6, "redstone1", 0);
                    this.field1385 = new Pix8(var6, "redstone2", 0);
                    this.field1386 = new Pix8(var6, "redstone3", 0);
                    this.field1387 = new Pix8(var6, "redstone1", 0);
                    this.field1387.method195(field1329);
                    this.field1388 = new Pix8(var6, "redstone2", 0);
                    this.field1388.method195(field1329);
                    this.field1363 = new Pix8(var6, "redstone1", 0);
                    this.field1363.method196(0);
                    this.field1364 = new Pix8(var6, "redstone2", 0);
                    this.field1364.method196(0);
                    this.field1365 = new Pix8(var6, "redstone3", 0);
                    this.field1365.method196(0);
                    this.field1366 = new Pix8(var6, "redstone1", 0);
                    this.field1366.method195(field1329);
                    this.field1366.method196(0);
                    this.field1367 = new Pix8(var6, "redstone2", 0);
                    this.field1367.method195(field1329);
                    this.field1367.method196(0);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field1522[var34] = new Pix8(var6, "mod_icons", var34);
                    }
                    Pix32 var35 = new Pix32(var6, "backleft1", 0);
                    this.field1244 = new PixMap(var35.field665, var35.field664, this.method11(37639), false);
                    var35.method183(0, 5, 0);
                    Pix32 var36 = new Pix32(var6, "backleft2", 0);
                    this.field1245 = new PixMap(var36.field665, var36.field664, this.method11(37639), false);
                    var36.method183(0, 5, 0);
                    Pix32 var37 = new Pix32(var6, "backright1", 0);
                    this.field1246 = new PixMap(var37.field665, var37.field664, this.method11(37639), false);
                    var37.method183(0, 5, 0);
                    Pix32 var38 = new Pix32(var6, "backright2", 0);
                    this.field1247 = new PixMap(var38.field665, var38.field664, this.method11(37639), false);
                    var38.method183(0, 5, 0);
                    Pix32 var39 = new Pix32(var6, "backtop1", 0);
                    this.field1248 = new PixMap(var39.field665, var39.field664, this.method11(37639), false);
                    var39.method183(0, 5, 0);
                    Pix32 var40 = new Pix32(var6, "backvmid1", 0);
                    this.field1249 = new PixMap(var40.field665, var40.field664, this.method11(37639), false);
                    var40.method183(0, 5, 0);
                    Pix32 var41 = new Pix32(var6, "backvmid2", 0);
                    this.field1250 = new PixMap(var41.field665, var41.field664, this.method11(37639), false);
                    var41.method183(0, 5, 0);
                    Pix32 var42 = new Pix32(var6, "backvmid3", 0);
                    this.field1251 = new PixMap(var42.field665, var42.field664, this.method11(37639), false);
                    var42.method183(0, 5, 0);
                    Pix32 var43 = new Pix32(var6, "backhmid2", 0);
                    this.field1252 = new PixMap(var43.field665, var43.field664, this.method11(37639), false);
                    var43.method183(0, 5, 0);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field1587[var48] != null) {
                            this.field1587[var48].method181(var45 + var47, var46 + var47, true, var44 + var47);
                        }
                        if (this.field1432[var48] != null) {
                            this.field1432[var48].method197(var45 + var47, var46 + var47, true, var44 + var47);
                        }
                    }
                    this.method13(9, 83, "Unpacking textures");
                    Pix3D.method168(field1642, var7);
                    Pix3D.method172(0.8D, false);
                    Pix3D.method167((byte) -42, 20);
                    this.method13(9, 86, "Unpacking config");
                    SeqType.method375(var4, -474);
                    LocType.method324(var4);
                    FloType.method365(var4, -474);
                    ObjType.method340(var4);
                    NpcType.method334(var4);
                    IdkType.method369(var4, -474);
                    SpotAnimType.method378(var4, -474);
                    VarpType.method383(var4, -474);
                    VarbitType.method381(var4, -474);
                    ObjType.field1031 = field1308;
                    if (!field1309) {
                        this.method13(9, 90, "Unpacking sounds");
                        byte[] var49 = var9.method295("sounds.dat", (byte[]) null);
                        Packet var50 = new Packet(var49, 185);
                        Wave.method314(var50, -474);
                    }
                    this.method13(9, 95, "Unpacking interfaces");
                    PixFont[] var51 = new PixFont[] { this.field1643, this.field1644, this.field1645, this.field1646 };
                    Component.method32(var5, var6, 7, var51);
                    this.method13(9, 100, "Preparing game engine");
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field1380.field673[this.field1380.field675 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field1397[var52] = var53;
                        this.field1343[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field1380.field673[this.field1380.field675 * var56 + var59] != 0 || var59 <= 34 && var56 <= 34) {
                                if (var57 != 999) {
                                    var58 = var59;
                                    break;
                                }
                            } else if (var57 == 999) {
                                var57 = var59;
                            }
                        }
                        this.field1659[var56 - 5] = var57 - 25;
                        this.field1494[var56 - 5] = var58 - var57;
                    }
                    Pix3D.method165(true, 479, 96);
                    this.field1558 = Pix3D.field645;
                    Pix3D.method165(true, 190, 261);
                    this.field1559 = Pix3D.field645;
                    Pix3D.method165(true, 512, 334);
                    this.field1560 = Pix3D.field645;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = Pix3D.field643[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    World3D.method86(true, 334, var60, 512, 500, 800);
                    WordFilter.method385(var8);
                    this.field1274 = new MouseTracking(this, true);
                    this.method12(this.field1274, 10);
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field1408 + " " + this.field1557);
                    this.field1596 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method472(boolean arg0, boolean arg1) {
        this.method438(-925);
        this.field1513.method254(979);
        this.field1266.method198(0, (byte) 1, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field1338 == 0) {
            int var5 = var4 / 2 + 80;
            this.field1643.method201(true, var5, this.field1459.field832, var3 / 2, false, 7711145);
            int var6 = var4 / 2 - 20;
            this.field1645.method201(true, var6, "Welcome to RuneScape", var3 / 2, false, 16776960);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field1267.method198(var7 - 73, (byte) 1, var8 - 20);
            this.field1645.method201(true, var8 + 5, "New User", var7, false, 16777215);
            int var9 = var3 / 2 + 80;
            this.field1267.method198(var9 - 73, (byte) 1, var8 - 20);
            this.field1645.method201(true, var8 + 5, "Existing User", var9, false, 16777215);
        }
        if (this.field1338 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field1332.length() > 0) {
                this.field1645.method201(true, var10 - 15, this.field1332, var3 / 2, false, 16776960);
                this.field1645.method201(true, var10, this.field1333, var3 / 2, false, 16776960);
                var10 += 30;
            } else {
                this.field1645.method201(true, var10 - 7, this.field1333, var3 / 2, false, 16776960);
                var10 += 30;
            }
            this.field1645.method206(var10, 12, var3 / 2 - 90, true, 16777215, "Username: " + this.field1597 + (this.field1233 == 0 & field1330 % 40 < 20 ? "@yel@|" : ""));
            var10 += 15;
            this.field1645.method206(var10, 12, var3 / 2 - 88, true, 16777215, "Password: " + JString.method302(this.field1598, -238) + (this.field1233 == 1 & field1330 % 40 < 20 ? "@yel@|" : ""));
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field1267.method198(var11 - 73, (byte) 1, var12 - 20);
                this.field1645.method201(true, var12 + 5, "Login", var11, false, 16777215);
                int var13 = var3 / 2 + 80;
                this.field1267.method198(var13 - 73, (byte) 1, var12 - 20);
                this.field1645.method201(true, var12 + 5, "Cancel", var13, false, 16777215);
            }
        }
        if (this.field1338 == 3) {
            this.field1645.method201(true, var4 / 2 - 60, "Create a free account", var3 / 2, false, 16776960);
            int var14 = var4 / 2 - 35;
            this.field1645.method201(true, var14, "To create a new account you need to", var3 / 2, false, 16777215);
            int var18 = var14 + 15;
            this.field1645.method201(true, var18, "go back to the main RuneScape webpage", var3 / 2, false, 16777215);
            int var19 = var18 + 15;
            this.field1645.method201(true, var19, "and choose the red 'create account'", var3 / 2, false, 16777215);
            int var20 = var19 + 15;
            this.field1645.method201(true, var20, "button at the top right of that page.", var3 / 2, false, 16777215);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field1267.method198(var15 - 73, (byte) 1, var16 - 20);
            this.field1645.method201(true, var16 + 5, "Cancel", var15, false, 16777215);
        }
        this.field1513.method255(super.field13, 202, 0, 171);
        this.field1578 &= arg0;
        if (this.field1526) {
            this.field1526 = false;
            this.field1511.method255(super.field13, 128, 0, 0);
            this.field1512.method255(super.field13, 202, 0, 371);
            this.field1516.method255(super.field13, 0, 0, 265);
            this.field1517.method255(super.field13, 562, 0, 265);
            this.field1518.method255(super.field13, 128, 0, 171);
            this.field1519.method255(super.field13, 562, 0, 171);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;II)Lxb;")
    public final Jagfile method473(int arg0, String arg1, int arg2, String arg3, int arg4, int arg5) {
        this.field1410 += arg5;
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field1586[0] != null) {
                var7 = this.field1586[0].method287(arg0, (byte) 81);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field1383.reset();
            this.field1383.update(var7);
            int var9 = (int) this.field1383.getValue();
            if (arg2 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(-32452, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method13(9, arg4, "Requesting " + arg3);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method432(arg1 + arg2);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    Packet var17 = new Packet(var16, 185);
                    var17.field708 = 3;
                    int var18 = var17.method229() + 6;
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
                            this.method13(9, arg4, "Loading " + arg3 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field1586[0] != null) {
                            this.field1586[0].method288(var7, -381, arg0, var7.length);
                        }
                    } catch (Exception var29) {
                        this.field1586[0] = null;
                    }
                    if (var7 != null) {
                        this.field1383.reset();
                        this.field1383.update(var7);
                        int var24 = (int) this.field1383.getValue();
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
                            this.method13(9, arg4, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method13(9, arg4, var12 + " - Retrying in " + var26);
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
                    this.field1304 = !this.field1304;
                }
            }
            return new Jagfile(-32452, var7);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)I")
    public final int method474(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 >> 7;
        int var6 = arg0 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg3;
            if (arg2 >= 0) {
                this.field1396 = this.field1375.method291();
            }
            if (arg3 < 3 && (this.field1422[1][var5][var6] & 2) == 2) {
                var7 = arg3 + 1;
            }
            int var8 = arg1 & 127;
            int var9 = arg0 & 127;
            int var10 = (128 - var8) * this.field1490[var7][var5][var6] + this.field1490[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field1490[var7][var5][var6 + 1] + this.field1490[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)Z")
    public final boolean method475(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg3 >> 14 & 32767;
        int var7 = this.field1536.method80(this.field1303, arg1, arg4, arg3);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            ++field1469;
            if (field1469 > 1086) {
                field1469 = 0;
                this.field1444.method214(149, 0);
                this.field1444.method215(0);
                int var10 = this.field1444.field708;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1444.method216(16791);
                }
                this.field1444.method215(254);
                this.field1444.method216((int) (Math.random() * 65536.0D));
                this.field1444.method216(16128);
                this.field1444.method216(52610);
                this.field1444.method216((int) (Math.random() * 65536.0D));
                this.field1444.method216(55420);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1444.method216(35025);
                }
                this.field1444.method216(46628);
                this.field1444.method215((int) (Math.random() * 256.0D));
                this.field1444.method224(this.field1444.field708 - var10, false);
            }
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method508(false, 0, field1278.field448[0], 0, field1278.field447[0], var8 + 1, arg1, 0, arg4, var9, 2, true);
            } else {
                LocType var11 = LocType.method326(var6);
                int var12;
                int var13;
                if (var9 != 0 && var9 != 2) {
                    var12 = var11.field954;
                    var13 = var11.field953;
                } else {
                    var12 = var11.field953;
                    var13 = var11.field954;
                }
                int var14 = var11.field976;
                if (var9 != 0) {
                    var14 = (var14 >> 4 - var9) + (var14 << var9 & 15);
                }
                this.method508(false, var14, field1278.field448[0], var12, field1278.field447[0], 0, arg1, var13, arg4, 0, 2, true);
            }
            this.field1318 = super.field28;
            this.field1410 += arg2;
            this.field1319 = super.field29;
            this.field1321 = 2;
            this.field1320 = 0;
            this.field1444.method214(arg0, 0);
            this.field1444.method216(this.field1359 + arg1);
            this.field1444.method216(this.field1360 + arg4);
            this.field1444.method216(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;)V")
    public final void method13(int arg0, int arg1, String arg2) {
        this.field1557 = arg1;
        this.field1408 = arg2;
        this.method438(-925);
        if (this.field1540 == null) {
            super.method13(9, arg1, arg2);
        } else {
            this.field1513.method254(979);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1645.method200(var4 / 2, (byte) 2, 16777215, "RuneScape is loading - please wait...", var5 / 2 - 26 - var6);
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method157(304, 9179409, 34, 0, var7, var4 / 2 - 152);
            if (this.field1563 == arg0) {
                Pix2D.method157(302, 0, 32, 0, var7 + 1, var4 / 2 - 151);
                Pix2D.method156(var4 / 2 - 150, 9179409, 30, arg1 * 3, -37952, var7 + 2);
                Pix2D.method156(arg1 * 3 + (var4 / 2 - 150), 0, 30, 300 - arg1 * 3, -37952, var7 + 2);
                this.field1645.method200(var4 / 2, (byte) 2, 16777215, arg2, var5 / 2 + 5 - var6);
                this.field1513.method255(super.field13, 202, 0, 171);
                if (this.field1526) {
                    this.field1526 = false;
                    if (!this.field1491) {
                        this.field1514.method255(super.field13, 0, 0, 0);
                        this.field1515.method255(super.field13, 637, 0, 0);
                    }
                    this.field1511.method255(super.field13, 128, 0, 0);
                    this.field1512.method255(super.field13, 202, 0, 371);
                    this.field1516.method255(super.field13, 0, 0, 265);
                    this.field1517.method255(super.field13, 562, 0, 265);
                    this.field1518.method255(super.field13, 128, 0, 171);
                    this.field1519.method255(super.field13, 562, 0, 171);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method476(int arg0) {
        if (arg0 < 0) {
            this.field1444.method214(51, 0);
            if (this.field1599 != -1) {
                this.field1599 = -1;
                this.field1572 = true;
                this.field1502 = false;
                this.field1296 = true;
            }
            if (this.field1601 != -1) {
                this.field1601 = -1;
                this.field1389 = true;
                this.field1502 = false;
            }
            this.field1617 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Llb;II)V")
    private final void method477(Packet arg0, int arg1, int arg2) {
        arg0.method235(false);
        if (arg2 != 0) {
            field1218 = !field1218;
        }
        int var4 = arg0.method236(0, 8);
        if (var4 < this.field1604) {
            for (int var5 = var4; var5 < this.field1604; ++var5) {
                this.field1593[this.field1592++] = this.field1605[var5];
            }
        }
        if (var4 > this.field1604) {
            signlink.reporterror(this.field1597 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1604 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1605[var6];
                NpcEntity var8 = this.field1603[var7];
                int var9 = arg0.method236(0, 1);
                if (var9 == 0) {
                    this.field1605[this.field1604++] = var7;
                    var8.field442 = field1330;
                } else {
                    int var10 = arg0.method236(0, 2);
                    if (var10 == 0) {
                        this.field1605[this.field1604++] = var7;
                        var8.field442 = field1330;
                        this.field1352[this.field1351++] = var7;
                    } else if (var10 == 1) {
                        this.field1605[this.field1604++] = var7;
                        var8.field442 = field1330;
                        int var11 = arg0.method236(0, 3);
                        var8.method111((byte) 5, var11, false);
                        int var12 = arg0.method236(0, 1);
                        if (var12 == 1) {
                            this.field1352[this.field1351++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1605[this.field1604++] = var7;
                        var8.field442 = field1330;
                        int var13 = arg0.method236(0, 3);
                        var8.method111((byte) 5, var13, true);
                        int var14 = arg0.method236(0, 3);
                        var8.method111((byte) 5, var14, true);
                        int var15 = arg0.method236(0, 1);
                        if (var15 == 1) {
                            this.field1352[this.field1351++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1593[this.field1592++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method478(byte arg0) {
        if (this.field1510 == null) {
            this.method459(false);
            super.field14 = null;
            this.field1511 = null;
            this.field1512 = null;
            this.field1513 = null;
            this.field1514 = null;
            this.field1515 = null;
            this.field1516 = null;
            if (arg0 == 9) {
                boolean var2 = false;
                this.field1517 = null;
                this.field1518 = null;
                this.field1519 = null;
                this.field1510 = new PixMap(96, 479, this.method11(37639), false);
                this.field1508 = new PixMap(156, 172, this.method11(37639), false);
                Pix2D.method154(false);
                this.field1380.method198(0, (byte) 1, 0);
                this.field1507 = new PixMap(261, 190, this.method11(37639), false);
                this.field1509 = new PixMap(334, 512, this.method11(37639), false);
                Pix2D.method154(false);
                this.field1495 = new PixMap(50, 496, this.method11(37639), false);
                this.field1496 = new PixMap(37, 269, this.method11(37639), false);
                this.field1497 = new PixMap(45, 249, this.method11(37639), false);
                this.field1526 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method479(int arg0) {
        try {
            if (this.field1399 != null) {
                this.field1399.method38();
            }
        } catch (Exception var4) {
        }
        this.field1399 = null;
        this.field1578 = false;
        this.field1338 = 0;
        this.field1597 = "";
        this.field1598 = "";
        this.method503(0);
        this.field1536.method50(4);
        int var2 = 80 / arg0;
        for (int var3 = 0; var3 < 4; ++var3) {
            this.field1235[var3].method353(-49006);
        }
        System.gc();
        this.method460(-232);
        this.field1289 = -1;
        this.field1623 = -1;
        this.field1211 = 0;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Llb;II)V")
    private final void method480(Packet arg0, int arg1, int arg2) {
        if (arg1 < 1 || arg1 > 1) {
            this.field1445 = -240;
        }
        for (int var4 = 0; var4 < this.field1351; ++var4) {
            int var5 = this.field1352[var4];
            NpcEntity var6 = this.field1603[var5];
            int var7 = arg0.method225();
            if ((var7 & 1) == 1) {
                int var8 = arg0.method225();
                int var9 = arg0.method225();
                var6.method114(var8, var9, field1330, -284);
                var6.field416 = field1330 + 300;
                var6.field417 = arg0.method225();
                var6.field418 = arg0.method225();
            }
            if ((var7 & 2) == 2) {
                int var10 = arg0.method227();
                if (var10 == 65535) {
                    var10 = -1;
                }
                if (var6.field425 == var10) {
                    var6.field429 = 0;
                }
                int var11 = arg0.method225();
                if (var6.field425 == var10 && var10 != -1) {
                    int var12 = SeqType.field1126[var10].field1140;
                    if (var12 == 1) {
                        var6.field426 = 0;
                        var6.field427 = 0;
                        var6.field428 = var11;
                        var6.field429 = 0;
                    }
                    if (var12 == 2) {
                        var6.field429 = 0;
                    }
                } else if (var10 == -1 || var6.field425 == -1 || SeqType.field1126[var10].field1134 >= SeqType.field1126[var6.field425].field1134) {
                    var6.field425 = var10;
                    var6.field426 = 0;
                    var6.field427 = 0;
                    var6.field428 = var11;
                    var6.field429 = 0;
                    var6.field451 = var6.field446;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field419 = arg0.method227();
                if (var6.field419 == 65535) {
                    var6.field419 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field409 = arg0.method232();
                var6.field410 = 100;
            }
            if ((var7 & 16) == 16) {
                int var13 = arg0.method225();
                int var14 = arg0.method225();
                var6.method114(var13, var14, field1330, -284);
                var6.field416 = field1330 + 300;
                var6.field417 = arg0.method225();
                var6.field418 = arg0.method225();
            }
            if ((var7 & 32) == 32) {
                var6.field455 = NpcType.method336(arg0.method227());
                var6.field401 = var6.field455.field999;
                var6.field445 = var6.field455.field1021;
                var6.field404 = var6.field455.field1003;
                var6.field405 = var6.field455.field1004;
                var6.field406 = var6.field455.field1005;
                var6.field407 = var6.field455.field1006;
                var6.field402 = var6.field455.field1002;
            }
            if ((var7 & 64) == 64) {
                var6.field430 = arg0.method227();
                int var15 = arg0.method230();
                var6.field434 = var15 >> 16;
                var6.field433 = (var15 & 65535) + field1330;
                var6.field431 = 0;
                var6.field432 = 0;
                if (var6.field433 > field1330) {
                    var6.field431 = -1;
                }
                if (var6.field430 == 65535) {
                    var6.field430 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field420 = arg0.method227();
                var6.field421 = arg0.method227();
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)I")
    public final int method481(boolean arg0) {
        if (arg0) {
            this.field1498 = this.field1375.method291();
        }
        int var2 = 3;
        if (this.field1544 < 310) {
            int var3 = this.field1541 >> 7;
            int var4 = this.field1543 >> 7;
            int var5 = field1278.field397 >> 7;
            int var6 = field1278.field398 >> 7;
            if ((this.field1422[this.field1303][var3][var4] & 4) != 0) {
                var2 = this.field1303;
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
                    if ((this.field1422[this.field1303][var3][var4] & 4) != 0) {
                        var2 = this.field1303;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field1422[this.field1303][var3][var4] & 4) != 0) {
                            var2 = this.field1303;
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
                    if ((this.field1422[this.field1303][var3][var4] & 4) != 0) {
                        var2 = this.field1303;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field1422[this.field1303][var3][var4] & 4) != 0) {
                            var2 = this.field1303;
                        }
                    }
                }
            }
        }
        if ((this.field1422[this.field1303][field1278.field397 >> 7][field1278.field398 >> 7] & 4) != 0) {
            var2 = this.field1303;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)I")
    public final int method482(boolean arg0) {
        if (arg0) {
            field1573 = true;
        }
        int var2 = this.method474(this.field1543, this.field1541, -195, this.field1303);
        return var2 - this.field1542 < 800 && (this.field1422[this.field1303][this.field1541 >> 7][this.field1543 >> 7] & 4) != 0 ? this.field1303 : 3;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method483(byte arg0) {
        if (arg0 == 38) {
            for (SpotAnimEntity var2 = (SpotAnimEntity) this.field1255.method244(); var2 != null; var2 = (SpotAnimEntity) this.field1255.method246(false)) {
                if (this.field1303 == var2.field611 && !var2.field617) {
                    if (field1330 >= var2.field610) {
                        var2.method150(0, this.field1312);
                        if (var2.field617) {
                            var2.method106();
                        } else {
                            this.field1536.method61(var2.field614, var2.field612, 0, var2.field611, var2, -1, false, 60, (byte) 33, var2.field613);
                        }
                    }
                } else {
                    var2.method106();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)Ljava/lang/String;")
    private static final String method484(int arg0, int arg1) {
        if (arg0 != 0) {
            field1322 = !field1322;
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLy;)V")
    public final void method485(int arg0, byte arg1, PathingEntity arg2) {
        this.method486(arg2.field398, 25656, arg0, arg2.field397);
        if (arg1 != 67) {
            this.field1331 = this.field1375.method291();
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IIII)V")
    public final void method486(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg0 >= 128 && arg3 <= 13056 && arg0 <= 13056) {
            int var5 = this.method474(arg0, arg3, -195, this.field1303) - arg2;
            if (arg1 == 25656) {
                int var6 = arg3 - this.field1541;
                int var7 = var5 - this.field1542;
                int var8 = arg0 - this.field1543;
                int var9 = Model.field601[this.field1544];
                int var10 = Model.field602[this.field1544];
                int var11 = Model.field601[this.field1545];
                int var12 = Model.field602[this.field1545];
                int var13 = var6 * var12 + var8 * var11 >> 16;
                int var14 = var8 * var12 - var6 * var11 >> 16;
                int var16 = var7 * var10 - var9 * var14 >> 16;
                int var17 = var7 * var9 + var10 * var14 >> 16;
                if (var17 >= 50) {
                    this.field1636 = (var13 << 9) / var17 + Pix3D.field639;
                    this.field1637 = (var16 << 9) / var17 + Pix3D.field640;
                } else {
                    this.field1636 = -1;
                    this.field1637 = -1;
                }
            }
        } else {
            this.field1636 = -1;
            this.field1637 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method487(byte arg0) {
        if (arg0 != -116) {
            this.field1339 = this.field1375.method291();
        }
        if (super.field27 == 1) {
            if (super.field28 >= 6 && super.field28 <= 106 && super.field29 >= 467 && super.field29 <= 499) {
                this.field1651 = (this.field1651 + 1) % 4;
                this.field1290 = true;
                this.field1389 = true;
                this.field1444.method214(154, 0);
                this.field1444.method215(this.field1651);
                this.field1444.method215(this.field1529);
                this.field1444.method215(this.field1269);
            }
            if (super.field28 >= 135 && super.field28 <= 235 && super.field29 >= 467 && super.field29 <= 499) {
                this.field1529 = (this.field1529 + 1) % 3;
                this.field1290 = true;
                this.field1389 = true;
                this.field1444.method214(154, 0);
                this.field1444.method215(this.field1651);
                this.field1444.method215(this.field1529);
                this.field1444.method215(this.field1269);
            }
            if (super.field28 >= 273 && super.field28 <= 373 && super.field29 >= 467 && super.field29 <= 499) {
                this.field1269 = (this.field1269 + 1) % 3;
                this.field1290 = true;
                this.field1389 = true;
                this.field1444.method214(154, 0);
                this.field1444.method215(this.field1651);
                this.field1444.method215(this.field1529);
                this.field1444.method215(this.field1269);
            }
            if (super.field28 >= 412 && super.field28 <= 512 && super.field29 >= 467 && super.field29 <= 499) {
                if (this.field1617 == -1) {
                    this.method476(-364);
                    this.field1344 = "";
                    this.field1647 = false;
                    for (int var2 = 0; var2 < Component.field68.length; ++var2) {
                        if (Component.field68[var2] != null && Component.field68[var2].field77 == 600) {
                            this.field1632 = this.field1617 = Component.field68[var2].field74;
                            return;
                        }
                    }
                    return;
                }
                this.method544(this.field1234, "", "Please close the interface you have open before using 'report abuse'", 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method488(byte arg0) {
        if (this.field1532 == 0) {
            int var2 = super.field27;
            if (arg0 != 51) {
                field1395 = 410;
            }
            if (this.field1368 == 1 && super.field28 >= 516 && super.field29 >= 160 && super.field28 <= 765 && super.field29 <= 205) {
                var2 = 0;
            }
            if (this.field1523) {
                if (var2 != 1) {
                    int var3 = super.field21;
                    int var4 = super.field22;
                    if (this.field1448 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field1448 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field1448 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field1449 - 10 || var3 > this.field1451 + this.field1449 + 10 || var4 < this.field1450 - 10 || var4 > this.field1452 + this.field1450 + 10) {
                        this.field1523 = false;
                        if (this.field1448 == 1) {
                            this.field1572 = true;
                        }
                        if (this.field1448 == 2) {
                            this.field1389 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field1449;
                    int var6 = this.field1450;
                    int var7 = this.field1451;
                    int var8 = super.field28;
                    int var9 = super.field29;
                    if (this.field1448 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field1448 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field1448 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field1254; ++var11) {
                        int var12 = (this.field1254 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method546(var10, false);
                    }
                    this.field1523 = false;
                    if (this.field1448 == 1) {
                        this.field1572 = true;
                    }
                    if (this.field1448 == 2) {
                        this.field1389 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field1254 > 0) {
                    int var13 = this.field1608[this.field1254 - 1];
                    if (var13 == 582 || var13 == 113 || var13 == 555 || var13 == 331 || var13 == 354 || var13 == 694 || var13 == 962 || var13 == 795 || var13 == 681 || var13 == 100 || var13 == 102 || var13 == 1328) {
                        int var14 = this.field1606[this.field1254 - 1];
                        int var15 = this.field1607[this.field1254 - 1];
                        Component var16 = Component.field68[var15];
                        if (var16.field95 || var16.field98) {
                            this.field1499 = false;
                            this.field1555 = 0;
                            this.field1530 = var15;
                            this.field1531 = var14;
                            this.field1532 = 2;
                            this.field1533 = super.field28;
                            this.field1534 = super.field29;
                            if (Component.field68[var15].field74 == this.field1617) {
                                this.field1532 = 1;
                            }
                            if (Component.field68[var15].field74 == this.field1601) {
                                this.field1532 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field1576 == 1 || this.method496(-29317, this.field1254 - 1)) && this.field1254 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field1254 > 0) {
                    this.method546(this.field1254 - 1, false);
                }
                if (var2 != 2 || this.field1254 <= 0) {
                    return;
                }
                this.method554(0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != 0) {
            field1642 = 225;
        }
        if (arg0 >= 1 && arg1 >= 1 && arg0 <= 102 && arg1 <= 102) {
            if (field1309 && this.field1303 != arg3) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg5 == 0) {
                var9 = this.field1536.method76(arg3, arg0, arg1);
            }
            if (arg5 == 1) {
                var9 = this.field1536.method77(arg3, arg0, false, arg1);
            }
            if (arg5 == 2) {
                var9 = this.field1536.method78(arg3, arg0, arg1);
            }
            if (arg5 == 3) {
                var9 = this.field1536.method79(arg3, arg0, arg1);
            }
            if (var9 != 0) {
                int var13 = this.field1536.method80(arg3, arg0, arg1, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg5 == 0) {
                    this.field1536.method67(arg1, true, arg0, arg3);
                    LocType var17 = LocType.method326(var14);
                    if (var17.field955) {
                        this.field1235[arg3].method358(this.field1372, arg1, arg0, var16, var15, var17.field956);
                    }
                }
                if (arg5 == 1) {
                    this.field1536.method68(arg0, arg3, -412, arg1);
                }
                if (arg5 == 2) {
                    this.field1536.method69(arg1, -150, arg3, arg0);
                    LocType var18 = LocType.method326(var14);
                    if (var18.field953 + arg0 > 103 || var18.field953 + arg1 > 103 || var18.field954 + arg0 > 103 || var18.field954 + arg1 > 103) {
                        return;
                    }
                    if (var18.field955) {
                        this.field1235[arg3].method359(var18.field954, arg1, var18.field953, -705, arg0, var16, var18.field956);
                    }
                }
                if (arg5 == 3) {
                    this.field1536.method70(false, arg1, arg3, arg0);
                    LocType var19 = LocType.method326(var14);
                    if (var19.field955 && var19.field957) {
                        this.field1235[arg3].method361(arg0, (byte) -21, arg1);
                    }
                }
            }
            if (arg4 >= 0) {
                int var20 = arg3;
                if (arg3 < 3 && (this.field1422[1][arg0][arg1] & 2) == 2) {
                    var20 = arg3 + 1;
                }
                World.method31(arg0, var20, this.field1490, arg1, arg4, this.field1536, arg6, this.field1235[arg3], arg3, arg7, 7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Llb;II)V")
    private final void method490(Packet arg0, int arg1, int arg2) {
        this.field1592 = 0;
        this.field1351 = 0;
        this.method477(arg0, arg2, this.field1241);
        this.method439((byte) -86, arg2, arg0);
        if (arg1 != 3) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        this.method480(arg0, 1, arg2);
        for (int var5 = 0; var5 < this.field1592; ++var5) {
            int var7 = this.field1593[var5];
            if (field1330 != this.field1603[var7].field442) {
                this.field1603[var7].field455 = null;
                this.field1603[var7] = null;
            }
        }
        if (arg0.field708 != arg2) {
            signlink.reporterror(this.field1597 + " size mismatch in getnpcpos - pos:" + arg0.field708 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field1604; ++var6) {
                if (this.field1603[this.field1605[var6]] == null) {
                    signlink.reporterror(this.field1597 + " null entry in npc list - pos:" + var6 + " size:" + this.field1604);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method491(String arg0) {
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

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 282);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1306 = Integer.parseInt(arg0[0]);
                field1307 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method536(-3259);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method501(field1395);
                }
                if (arg0[3].equals("free")) {
                    field1308 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1308 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(503, 765, 461);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method492(int arg0) {
        if (this.field1439 == 0 && this.field1368 == 0) {
            this.field1402[this.field1254] = "Walk here";
            this.field1608[this.field1254] = 718;
            this.field1606[this.field1254] = super.field21;
            this.field1607[this.field1254] = super.field22;
            ++this.field1254;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < Model.field599; ++var3) {
            int var4 = Model.field600[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1536.method80(this.field1303, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method326(var8);
                    if (this.field1439 == 1) {
                        this.field1402[this.field1254] = "Use " + this.field1443 + " with @cya@" + var9.field949;
                        this.field1608[this.field1254] = 810;
                        this.field1609[this.field1254] = var4;
                        this.field1606[this.field1254] = var5;
                        this.field1607[this.field1254] = var6;
                        ++this.field1254;
                    } else if (this.field1368 == 1) {
                        if ((this.field1370 & 4) == 4) {
                            this.field1402[this.field1254] = this.field1371 + " @cya@" + var9.field949;
                            this.field1608[this.field1254] = 899;
                            this.field1609[this.field1254] = var4;
                            this.field1606[this.field1254] = var5;
                            this.field1607[this.field1254] = var6;
                            ++this.field1254;
                        }
                    } else {
                        if (var9.field965 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field965[var10] != null) {
                                    this.field1402[this.field1254] = var9.field965[var10] + " @cya@" + var9.field949;
                                    if (var10 == 0) {
                                        this.field1608[this.field1254] = 625;
                                    }
                                    if (var10 == 1) {
                                        this.field1608[this.field1254] = 721;
                                    }
                                    if (var10 == 2) {
                                        this.field1608[this.field1254] = 743;
                                    }
                                    if (var10 == 3) {
                                        this.field1608[this.field1254] = 357;
                                    }
                                    if (var10 == 4) {
                                        this.field1608[this.field1254] = 1071;
                                    }
                                    this.field1609[this.field1254] = var4;
                                    this.field1606[this.field1254] = var5;
                                    this.field1607[this.field1254] = var6;
                                    ++this.field1254;
                                }
                            }
                        }
                        this.field1402[this.field1254] = "Examine @cya@" + var9.field949;
                        this.field1608[this.field1254] = 1381;
                        this.field1609[this.field1254] = var4;
                        this.field1606[this.field1254] = var5;
                        this.field1607[this.field1254] = var6;
                        ++this.field1254;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1603[var8];
                    if (var11.field455.field999 == 1 && (var11.field397 & 127) == 64 && (var11.field398 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1604; ++var12) {
                            NpcEntity var15 = this.field1603[this.field1605[var12]];
                            if (var15 != null && var11 != var15 && var15.field455.field999 == 1 && var11.field397 == var15.field397 && var11.field398 == var15.field398) {
                                this.method529(var6, this.field1605[var12], 177, var15.field455, var5);
                            }
                        }
                        for (int var13 = 0; var13 < this.field1349; ++var13) {
                            PlayerEntity var14 = this.field1348[this.field1350[var13]];
                            if (var14 != null && var11.field397 == var14.field397 && var11.field398 == var14.field398) {
                                this.method495(var5, this.field1350[var13], (byte) 23, var6, var14);
                            }
                        }
                    }
                    this.method529(var6, var8, 177, var11.field455, var5);
                }
                if (var7 == 0) {
                    PlayerEntity var16 = this.field1348[var8];
                    if ((var16.field397 & 127) == 64 && (var16.field398 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field1604; ++var17) {
                            NpcEntity var20 = this.field1603[this.field1605[var17]];
                            if (var20 != null && var20.field455.field999 == 1 && var16.field397 == var20.field397 && var16.field398 == var20.field398) {
                                this.method529(var6, this.field1605[var17], 177, var20.field455, var5);
                            }
                        }
                        for (int var18 = 0; var18 < this.field1349; ++var18) {
                            PlayerEntity var19 = this.field1348[this.field1350[var18]];
                            if (var19 != null && var16 != var19 && var16.field397 == var19.field397 && var16.field398 == var19.field398) {
                                this.method495(var5, this.field1350[var18], (byte) 23, var6, var19);
                            }
                        }
                    }
                    this.method495(var5, var8, (byte) 23, var6, var16);
                }
                if (var7 == 3) {
                    LinkList var21 = this.field1628[this.field1303][var5][var6];
                    if (var21 != null) {
                        for (ObjStackEntity var22 = (ObjStackEntity) var21.method245((byte) 5); var22 != null; var22 = (ObjStackEntity) var21.method247(this.field1323)) {
                            ObjType var23 = ObjType.method342(var22.field496);
                            if (this.field1439 == 1) {
                                this.field1402[this.field1254] = "Use " + this.field1443 + " with @lre@" + var23.field1034;
                                this.field1608[this.field1254] = 111;
                                this.field1609[this.field1254] = var22.field496;
                                this.field1606[this.field1254] = var5;
                                this.field1607[this.field1254] = var6;
                                ++this.field1254;
                            } else if (this.field1368 == 1) {
                                if ((this.field1370 & 1) == 1) {
                                    this.field1402[this.field1254] = this.field1371 + " @lre@" + var23.field1034;
                                    this.field1608[this.field1254] = 370;
                                    this.field1609[this.field1254] = var22.field496;
                                    this.field1606[this.field1254] = var5;
                                    this.field1607[this.field1254] = var6;
                                    ++this.field1254;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1048 != null && var23.field1048[var24] != null) {
                                        this.field1402[this.field1254] = var23.field1048[var24] + " @lre@" + var23.field1034;
                                        if (var24 == 0) {
                                            this.field1608[this.field1254] = 139;
                                        }
                                        if (var24 == 1) {
                                            this.field1608[this.field1254] = 778;
                                        }
                                        if (var24 == 2) {
                                            this.field1608[this.field1254] = 617;
                                        }
                                        if (var24 == 3) {
                                            this.field1608[this.field1254] = 224;
                                        }
                                        if (var24 == 4) {
                                            this.field1608[this.field1254] = 662;
                                        }
                                        this.field1609[this.field1254] = var22.field496;
                                        this.field1606[this.field1254] = var5;
                                        this.field1607[this.field1254] = var6;
                                        ++this.field1254;
                                    } else if (var24 == 2) {
                                        this.field1402[this.field1254] = "Take @lre@" + var23.field1034;
                                        this.field1608[this.field1254] = 617;
                                        this.field1609[this.field1254] = var22.field496;
                                        this.field1606[this.field1254] = var5;
                                        this.field1607[this.field1254] = var6;
                                        ++this.field1254;
                                    }
                                }
                                this.field1402[this.field1254] = "Examine @lre@" + var23.field1034;
                                this.field1608[this.field1254] = 1152;
                                this.field1609[this.field1254] = var22.field496;
                                this.field1606[this.field1254] = var5;
                                this.field1607[this.field1254] = var6;
                                ++this.field1254;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 0) {
            field1329 = this.field1375.method291();
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    private final void method493(byte arg0) {
        if (this.field1382 == arg0) {
            if (this.field1493 == 2) {
                for (LocSpawned var2 = (LocSpawned) this.field1611.method244(); var2 != null; var2 = (LocSpawned) this.field1611.method246(false)) {
                    if (var2.field737 > 0) {
                        --var2.field737;
                    }
                    if (var2.field737 == 0) {
                        if (var2.field730 < 0 || World.method30(var2.field730, (byte) 110, var2.field732)) {
                            this.method489(var2.field728, var2.field729, 0, var2.field726, var2.field730, var2.field727, var2.field732, var2.field731);
                            var2.method106();
                        }
                    } else {
                        if (var2.field736 > 0) {
                            --var2.field736;
                        }
                        if (var2.field736 == 0 && var2.field728 >= 1 && var2.field729 >= 1 && var2.field728 <= 102 && var2.field729 <= 102 && (var2.field733 < 0 || World.method30(var2.field733, (byte) 110, var2.field735))) {
                            this.method489(var2.field728, var2.field729, 0, var2.field726, var2.field733, var2.field727, var2.field735, var2.field734);
                            var2.field736 = -1;
                            if (var2.field733 == var2.field730 && var2.field730 == -1) {
                                var2.method106();
                            } else if (var2.field733 == var2.field730 && var2.field734 == var2.field731 && var2.field735 == var2.field732) {
                                var2.method106();
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    private final void method494(byte arg0) {
        LocSpawned var2 = (LocSpawned) this.field1611.method244();
        if (arg0 != 5) {
            this.field1411 = -1;
        }
        while (var2 != null) {
            if (var2.field737 == -1) {
                var2.field736 = 0;
                this.method516(var2, -707);
            } else {
                var2.method106();
            }
            var2 = (LocSpawned) this.field1611.method246(false);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBILab;)V")
    public final void method495(int arg0, int arg1, byte arg2, int arg3, PlayerEntity arg4) {
        if (field1278 != arg4) {
            if (this.field1254 < 400) {
                String var6;
                if (arg4.field465 == 0) {
                    var6 = arg4.field458 + method464(field1278.field464, 2, arg4.field464) + " (level-" + arg4.field464 + ")";
                } else {
                    var6 = arg4.field458 + " (skill-" + arg4.field465 + ")";
                }
                if (this.field1439 == 1) {
                    this.field1402[this.field1254] = "Use " + this.field1443 + " with @whi@" + var6;
                    this.field1608[this.field1254] = 275;
                    this.field1609[this.field1254] = arg1;
                    this.field1606[this.field1254] = arg0;
                    this.field1607[this.field1254] = arg3;
                    ++this.field1254;
                } else if (this.field1368 == 1) {
                    if ((this.field1370 & 8) == 8) {
                        this.field1402[this.field1254] = this.field1371 + " @whi@" + var6;
                        this.field1608[this.field1254] = 131;
                        this.field1609[this.field1254] = arg1;
                        this.field1606[this.field1254] = arg0;
                        this.field1607[this.field1254] = arg3;
                        ++this.field1254;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field1561[var7] != null) {
                            this.field1402[this.field1254] = this.field1561[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field1561[var7].equalsIgnoreCase("attack")) {
                                if (arg4.field464 > field1278.field464) {
                                    var9 = 2000;
                                }
                                if (field1278.field481 != 0 && arg4.field481 != 0) {
                                    if (field1278.field481 == arg4.field481) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field1562[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field1608[this.field1254] = var9 + 639;
                            }
                            if (var7 == 1) {
                                this.field1608[this.field1254] = var9 + 499;
                            }
                            if (var7 == 2) {
                                this.field1608[this.field1254] = var9 + 27;
                            }
                            if (var7 == 3) {
                                this.field1608[this.field1254] = var9 + 387;
                            }
                            if (var7 == 4) {
                                this.field1608[this.field1254] = var9 + 185;
                            }
                            this.field1609[this.field1254] = arg1;
                            this.field1606[this.field1254] = arg0;
                            this.field1607[this.field1254] = arg3;
                            ++this.field1254;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field1254; ++var8) {
                    if (this.field1608[var8] == 718) {
                        this.field1402[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                if (arg2 != 23) {
                    this.field1444.method215(247);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Z")
    public final boolean method496(int arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field1608[arg1];
            if (arg0 != -29317) {
                this.field1444.method215(245);
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 605;
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)Z")
    public final boolean method497(byte arg0) {
        if (arg0 != -2) {
            throw new NullPointerException();
        } else if (this.field1399 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1399.method40();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1411 == -1) {
                    this.field1399.method41(this.field1470.field707, 0, 1);
                    this.field1411 = this.field1470.field707[0] & 255;
                    if (this.field1375 != null) {
                        this.field1411 = this.field1411 - this.field1375.method291() & 255;
                    }
                    this.field1410 = Protocol.field1075[this.field1411];
                    --var2;
                }
                if (this.field1410 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1399.method41(this.field1470.field707, 0, 1);
                    this.field1410 = this.field1470.field707[0] & 255;
                    --var2;
                }
                if (this.field1410 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1399.method41(this.field1470.field707, 0, 2);
                    this.field1470.field708 = 0;
                    this.field1410 = this.field1470.method227();
                    var2 -= 2;
                }
                if (var2 < this.field1410) {
                    return false;
                }
                this.field1470.field708 = 0;
                this.field1399.method41(this.field1470.field707, 0, this.field1410);
                this.field1412 = 0;
                this.field1240 = this.field1239;
                this.field1239 = this.field1238;
                this.field1238 = this.field1411;
                if (this.field1411 == 130) {
                    int var3 = this.field1470.method228();
                    this.field1288 = var3;
                    this.field1389 = true;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 90) {
                    this.field1374 = this.field1470.method225();
                    if (this.field1438 == this.field1374) {
                        if (this.field1374 == 3) {
                            this.field1438 = 1;
                        } else {
                            this.field1438 = 3;
                        }
                        this.field1572 = true;
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 64) {
                    int var4 = this.field1470.method225();
                    int var5 = this.field1470.method225();
                    int var6 = this.field1470.method225();
                    int var7 = this.field1470.method225();
                    this.field1614[var4] = true;
                    this.field1565[var4] = var5;
                    this.field1291[var4] = var6;
                    this.field1613[var4] = var7;
                    this.field1484[var4] = 0;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 142) {
                    int var8 = this.field1470.method227();
                    int var9 = this.field1470.method227();
                    Component.field68[var8].field117 = 2;
                    Component.field68[var8].field118 = var9;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 158) {
                    int var10 = this.field1470.method227();
                    int var11 = this.field1470.method227();
                    if (this.field1601 != -1) {
                        this.field1601 = -1;
                        this.field1389 = true;
                    }
                    if (this.field1638) {
                        this.field1638 = false;
                        this.field1389 = true;
                    }
                    this.field1617 = var10;
                    this.field1599 = var11;
                    this.field1572 = true;
                    this.field1296 = true;
                    this.field1502 = false;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 106) {
                    this.field1572 = true;
                    int var12 = this.field1470.method227();
                    Component var13 = Component.field68[var12];
                    int var14 = this.field1470.method225();
                    for (int var15 = 0; var15 < var14; ++var15) {
                        var13.field69[var15] = this.field1470.method227();
                        int var16 = this.field1470.method225();
                        if (var16 == 255) {
                            var16 = this.field1470.method230();
                        }
                        var13.field70[var15] = var16;
                    }
                    for (int var17 = var14; var17 < var13.field69.length; ++var17) {
                        var13.field69[var17] = 0;
                        var13.field70[var17] = 0;
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 23) {
                    int var18 = this.field1470.method227();
                    if (var18 == 65535) {
                        var18 = -1;
                    }
                    if (this.field1289 != var18 && this.field1257 && !field1309 && this.field1211 == 0) {
                        this.field1623 = var18;
                        this.field1624 = true;
                        this.field1459.method275(2, this.field1623);
                    }
                    this.field1289 = var18;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 15) {
                    int var19 = this.field1470.method227();
                    int var20 = this.field1470.method227();
                    if (this.field1257 && !field1309) {
                        this.field1623 = var19;
                        this.field1624 = false;
                        this.field1459.method275(2, this.field1623);
                        this.field1211 = var20;
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 77) {
                    int var21 = this.field1470.method227();
                    int var22 = this.field1470.method228();
                    int var23 = this.field1470.method228();
                    Component var24 = Component.field68[var21];
                    var24.field81 = var22;
                    var24.field82 = var23;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 153) {
                    this.field1270 = this.field1470.method225();
                    this.field1271 = this.field1470.method225();
                    for (int var25 = this.field1270; var25 < this.field1270 + 8; ++var25) {
                        for (int var26 = this.field1271; var26 < this.field1271 + 8; ++var26) {
                            if (this.field1628[this.field1303][var25][var26] != null) {
                                this.field1628[this.field1303][var25][var26] = null;
                                this.method517(var25, var26);
                            }
                        }
                    }
                    for (LocSpawned var27 = (LocSpawned) this.field1611.method244(); var27 != null; var27 = (LocSpawned) this.field1611.method246(false)) {
                        if (var27.field728 >= this.field1270 && var27.field728 < this.field1270 + 8 && var27.field729 >= this.field1271 && var27.field729 < this.field1271 + 8 && this.field1303 == var27.field726) {
                            var27.field737 = 0;
                        }
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 171) {
                    if (this.field1599 != -1) {
                        this.field1599 = -1;
                        this.field1572 = true;
                        this.field1296 = true;
                    }
                    if (this.field1601 != -1) {
                        this.field1601 = -1;
                        this.field1389 = true;
                    }
                    if (this.field1638) {
                        this.field1638 = false;
                        this.field1389 = true;
                    }
                    this.field1617 = -1;
                    this.field1502 = false;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 161) {
                    String var28 = this.field1470.method232();
                    if (var28.endsWith(":tradereq:")) {
                        String var29 = var28.substring(0, var28.indexOf(":"));
                        long var30 = JString.method296(var29);
                        boolean var32 = false;
                        for (int var33 = 0; var33 < this.field1313; ++var33) {
                            if (this.field1618[var33] == var30) {
                                var32 = true;
                                break;
                            }
                        }
                        if (!var32 && this.field1437 == 0) {
                            this.method544(this.field1234, var29, "wishes to trade with you.", 4);
                        }
                    } else if (var28.endsWith(":duelreq:")) {
                        String var34 = var28.substring(0, var28.indexOf(":"));
                        long var35 = JString.method296(var34);
                        boolean var37 = false;
                        for (int var38 = 0; var38 < this.field1313; ++var38) {
                            if (this.field1618[var38] == var35) {
                                var37 = true;
                                break;
                            }
                        }
                        if (!var37 && this.field1437 == 0) {
                            this.method544(this.field1234, var34, "wishes to duel with you.", 8);
                        }
                    } else if (!var28.endsWith(":chalreq:")) {
                        this.method544(this.field1234, "", var28, 0);
                    } else {
                        String var39 = var28.substring(0, var28.indexOf(":"));
                        long var40 = JString.method296(var39);
                        boolean var42 = false;
                        for (int var43 = 0; var43 < this.field1313; ++var43) {
                            if (this.field1618[var43] == var40) {
                                var42 = true;
                                break;
                            }
                        }
                        if (!var42 && this.field1437 == 0) {
                            String var44 = var28.substring(var28.indexOf(":") + 1, var28.length() - 9);
                            this.method544(this.field1234, var39, var44, 8);
                        }
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 129) {
                    int var45 = this.field1470.method227();
                    int var46 = this.field1470.method227();
                    Component.field68[var45].field117 = 1;
                    Component.field68[var45].field118 = var46;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 231) {
                    int var47 = this.field1470.method227();
                    int var48 = this.field1470.method227();
                    if (this.field1594 == var47 && this.field1595 == var48 && this.field1493 == 2) {
                        this.field1411 = -1;
                        return true;
                    }
                    this.field1594 = var47;
                    this.field1595 = var48;
                    this.field1359 = (this.field1594 - 6) * 8;
                    this.field1360 = (this.field1595 - 6) * 8;
                    this.field1602 = false;
                    if ((this.field1594 / 8 == 48 || this.field1594 / 8 == 49) && this.field1595 / 8 == 48) {
                        this.field1602 = true;
                    }
                    if (this.field1594 / 8 == 48 && this.field1595 / 8 == 148) {
                        this.field1602 = true;
                    }
                    this.field1493 = 1;
                    this.field1549 = System.currentTimeMillis();
                    this.field1509.method254(979);
                    this.field1644.method200(257, (byte) 2, 0, "Loading - please wait.", 151);
                    this.field1644.method200(256, (byte) 2, 16777215, "Loading - please wait.", 150);
                    this.field1509.method255(super.field13, 4, 0, 4);
                    int var49 = 0;
                    for (int var50 = (this.field1594 - 6) / 8; var50 <= (this.field1594 + 6) / 8; ++var50) {
                        for (int var51 = (this.field1595 - 6) / 8; var51 <= (this.field1595 + 6) / 8; ++var51) {
                            ++var49;
                        }
                    }
                    this.field1546 = new byte[var49][];
                    this.field1457 = new byte[var49][];
                    this.field1580 = new int[var49];
                    this.field1581 = new int[var49];
                    this.field1582 = new int[var49];
                    int var52 = 0;
                    for (int var53 = (this.field1594 - 6) / 8; var53 <= (this.field1594 + 6) / 8; ++var53) {
                        for (int var54 = (this.field1595 - 6) / 8; var54 <= (this.field1595 + 6) / 8; ++var54) {
                            this.field1580[var52] = (var53 << 8) + var54;
                            if (this.field1602 && (var54 == 49 || var54 == 149 || var54 == 147 || var53 == 50 || var53 == 49 && var54 == 47)) {
                                this.field1581[var52] = -1;
                                this.field1582[var52] = -1;
                                ++var52;
                            } else {
                                int var55 = this.field1581[var52] = this.field1459.method270(0, var53, var54, true);
                                if (var55 != -1) {
                                    this.field1459.method275(3, var55);
                                }
                                int var56 = this.field1582[var52] = this.field1459.method270(1, var53, var54, true);
                                if (var56 != -1) {
                                    this.field1459.method275(3, var56);
                                }
                                ++var52;
                            }
                        }
                    }
                    int var57 = this.field1359 - this.field1361;
                    int var58 = this.field1360 - this.field1362;
                    this.field1361 = this.field1359;
                    this.field1362 = this.field1360;
                    for (int var59 = 0; var59 < 16384; ++var59) {
                        NpcEntity var60 = this.field1603[var59];
                        if (var60 != null) {
                            for (int var61 = 0; var61 < 10; ++var61) {
                                var60.field447[var61] -= var57;
                                var60.field448[var61] -= var58;
                            }
                            var60.field397 -= var57 * 128;
                            var60.field398 -= var58 * 128;
                        }
                    }
                    for (int var62 = 0; var62 < this.field1346; ++var62) {
                        PlayerEntity var63 = this.field1348[var62];
                        if (var63 != null) {
                            for (int var64 = 0; var64 < 10; ++var64) {
                                var63.field447[var64] -= var57;
                                var63.field448[var64] -= var58;
                            }
                            var63.field397 -= var57 * 128;
                            var63.field398 -= var58 * 128;
                        }
                    }
                    this.field1427 = true;
                    byte var65 = 0;
                    byte var66 = 104;
                    byte var67 = 1;
                    if (var57 < 0) {
                        var65 = 103;
                        var66 = -1;
                        var67 = -1;
                    }
                    byte var68 = 0;
                    byte var69 = 104;
                    byte var70 = 1;
                    if (var58 < 0) {
                        var68 = 103;
                        var69 = -1;
                        var70 = -1;
                    }
                    for (int var71 = var65; var66 != var71; var71 += var67) {
                        for (int var72 = var68; var69 != var72; var72 += var70) {
                            int var73 = var57 + var71;
                            int var74 = var58 + var72;
                            for (int var75 = 0; var75 < 4; ++var75) {
                                if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                                    this.field1628[var75][var71][var72] = this.field1628[var75][var73][var74];
                                } else {
                                    this.field1628[var75][var71][var72] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var76 = (LocSpawned) this.field1611.method244(); var76 != null; var76 = (LocSpawned) this.field1611.method246(false)) {
                        var76.field728 -= var57;
                        var76.field729 -= var58;
                        if (var76.field728 < 0 || var76.field729 < 0 || var76.field728 >= 104 || var76.field729 >= 104) {
                            var76.method106();
                        }
                    }
                    if (this.field1275 != 0) {
                        this.field1275 -= var57;
                        this.field1276 -= var58;
                    }
                    this.field1358 = false;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 192) {
                    int var77 = this.field1470.method227();
                    Component.field68[var77].field117 = 3;
                    if (field1278.field480 == null) {
                        Component.field68[var77].field118 = (field1278.field462[8] << 6) + (field1278.field462[0] << 12) + (field1278.field463[0] << 24) + (field1278.field463[4] << 18) + field1278.field462[11];
                    } else {
                        Component.field68[var77].field118 = (int) (field1278.field480.field996 + 305419896L);
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 167) {
                    this.method504(230, this.field1410, this.field1470);
                    this.field1427 = false;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 17) {
                    int var78 = this.field1470.method225();
                    int var79 = this.field1470.method225();
                    String var80 = this.field1470.method232();
                    if (var78 >= 1 && var78 <= 5) {
                        if (var80.equalsIgnoreCase("null")) {
                            var80 = null;
                        }
                        this.field1561[var78 - 1] = var80;
                        this.field1562[var78 - 1] = var79 == 0;
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 240) {
                    int var81 = this.field1470.method228();
                    if (var81 >= 0) {
                        this.method556(var81, 95);
                    }
                    this.field1398 = var81;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 203) {
                    int var82 = this.field1470.method227();
                    byte var83 = this.field1470.method226();
                    this.field1585[var82] = var83;
                    if (this.field1577[var82] != var83) {
                        this.field1577[var82] = var83;
                        this.method437(var82, false);
                        this.field1572 = true;
                        if (this.field1288 != -1) {
                            this.field1389 = true;
                        }
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 245) {
                    int var84 = this.field1470.method227();
                    int var85 = this.field1470.method230();
                    this.field1585[var84] = var85;
                    if (this.field1577[var84] != var85) {
                        this.field1577[var84] = var85;
                        this.method437(var84, false);
                        this.field1572 = true;
                        if (this.field1288 != -1) {
                            this.field1389 = true;
                        }
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 156) {
                    this.field1404 = this.field1470.method225();
                    if (this.field1404 == 1) {
                        this.field1310 = this.field1470.method227();
                    }
                    if (this.field1404 >= 2 && this.field1404 <= 6) {
                        if (this.field1404 == 2) {
                            this.field1301 = 64;
                            this.field1302 = 64;
                        }
                        if (this.field1404 == 3) {
                            this.field1301 = 0;
                            this.field1302 = 64;
                        }
                        if (this.field1404 == 4) {
                            this.field1301 = 128;
                            this.field1302 = 64;
                        }
                        if (this.field1404 == 5) {
                            this.field1301 = 64;
                            this.field1302 = 0;
                        }
                        if (this.field1404 == 6) {
                            this.field1301 = 64;
                            this.field1302 = 128;
                        }
                        this.field1404 = 2;
                        this.field1298 = this.field1470.method227();
                        this.field1299 = this.field1470.method227();
                        this.field1300 = this.field1470.method225();
                    }
                    if (this.field1404 == 10) {
                        this.field1648 = this.field1470.method227();
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 227) {
                    int var86 = this.field1470.method227();
                    Component var87 = Component.field68[var86];
                    for (int var88 = 0; var88 < var87.field69.length; ++var88) {
                        var87.field69[var88] = -1;
                        var87.field69[var88] = 0;
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 134) {
                    int var89 = this.field1470.method227();
                    int var90 = this.field1470.method228();
                    Component var91 = Component.field68[var89];
                    var91.field121 = var90;
                    if (var90 == -1) {
                        var91.field71 = 0;
                        var91.field72 = 0;
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 233) {
                    this.field1358 = true;
                    this.field1417 = this.field1470.method225();
                    this.field1418 = this.field1470.method225();
                    this.field1419 = this.field1470.method227();
                    this.field1420 = this.field1470.method225();
                    this.field1421 = this.field1470.method225();
                    if (this.field1421 >= 100) {
                        int var92 = this.field1417 * 128 + 64;
                        int var93 = this.field1418 * 128 + 64;
                        int var94 = this.method474(var93, var92, -195, this.field1303) - this.field1419;
                        int var95 = var92 - this.field1541;
                        int var96 = var94 - this.field1542;
                        int var97 = var93 - this.field1543;
                        int var98 = (int) Math.sqrt((double) (var95 * var95 + var97 * var97));
                        this.field1544 = (int) (Math.atan2((double) var96, (double) var98) * 325.949D) & 2047;
                        this.field1545 = (int) (Math.atan2((double) var95, (double) var97) * -325.949D) & 2047;
                        if (this.field1544 < 128) {
                            this.field1544 = 128;
                        }
                        if (this.field1544 > 383) {
                            this.field1544 = 383;
                        }
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 210) {
                    this.field1215 = false;
                    this.field1638 = true;
                    this.field1208 = "";
                    this.field1389 = true;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 195) {
                    this.field1270 = this.field1470.method225();
                    this.field1271 = this.field1470.method225();
                    while (this.field1470.field708 < this.field1410) {
                        int var99 = this.field1470.method225();
                        this.method442(var99, this.field1470, 3872);
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 105) {
                    this.field1572 = true;
                    int var100 = this.field1470.method225();
                    int var101 = this.field1470.method230();
                    int var102 = this.field1470.method225();
                    this.field1377[var100] = var101;
                    this.field1446[var100] = var102;
                    this.field1433[var100] = 1;
                    for (int var103 = 0; var103 < 98; ++var103) {
                        if (var101 >= field1356[var103]) {
                            this.field1433[var100] = var103 + 2;
                        }
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 114) {
                    this.field1651 = this.field1470.method225();
                    this.field1529 = this.field1470.method225();
                    this.field1269 = this.field1470.method225();
                    this.field1290 = true;
                    this.field1389 = true;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 235) {
                    long var104 = this.field1470.method231(false);
                    int var106 = this.field1470.method230();
                    int var107 = this.field1470.method225();
                    boolean var108 = false;
                    for (int var109 = 0; var109 < 100; ++var109) {
                        if (this.field1616[var109] == var106) {
                            var108 = true;
                            break;
                        }
                    }
                    if (var107 <= 1) {
                        for (int var110 = 0; var110 < this.field1313; ++var110) {
                            if (this.field1618[var110] == var104) {
                                var108 = true;
                                break;
                            }
                        }
                    }
                    if (!var108 && this.field1437 == 0) {
                        try {
                            this.field1616[this.field1425] = var106;
                            this.field1425 = (this.field1425 + 1) % 100;
                            String var111 = WordPack.method303(this.field1410 - 13, (byte) 7, this.field1470);
                            String var112 = WordFilter.method395(var111, 7);
                            if (var107 != 2 && var107 != 3) {
                                if (var107 == 1) {
                                    this.method544(this.field1234, "@cr1@" + JString.method300((byte) 81, JString.method297((byte) 3, var104)), var112, 7);
                                } else {
                                    this.method544(this.field1234, JString.method300((byte) 81, JString.method297((byte) 3, var104)), var112, 3);
                                }
                            } else {
                                this.method544(this.field1234, "@cr2@" + JString.method300((byte) 81, JString.method297((byte) 3, var104)), var112, 7);
                            }
                        } catch (Exception var164) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 183) {
                    int var114 = this.field1470.method227();
                    int var115 = this.field1470.method227();
                    int var116 = var115 >> 10 & 31;
                    int var117 = var115 >> 5 & 31;
                    int var118 = var115 & 31;
                    Component.field68[var114].field111 = (var118 << 3) + (var116 << 19) + (var117 << 11);
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 10) {
                    int var119 = this.field1470.method227();
                    boolean var120 = this.field1470.method225() == 1;
                    Component.field68[var119].field89 = var120;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 194) {
                    this.field1336 = this.field1470.method225();
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 89) {
                    this.field1633 = this.field1470.method227() * 30;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 190) {
                    for (int var121 = 0; var121 < this.field1577.length; ++var121) {
                        if (this.field1585[var121] != this.field1577[var121]) {
                            this.field1577[var121] = this.field1585[var121];
                            this.method437(var121, false);
                            this.field1572 = true;
                        }
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 32) {
                    this.field1270 = this.field1470.method225();
                    this.field1271 = this.field1470.method225();
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 247) {
                    long var122 = this.field1470.method231(false);
                    int var124 = this.field1470.method225();
                    String var125 = JString.method300((byte) 81, JString.method297((byte) 3, var122));
                    for (int var126 = 0; var126 < this.field1242; ++var126) {
                        if (this.field1403[var126] == var122) {
                            if (this.field1655[var126] != var124) {
                                this.field1655[var126] = var124;
                                this.field1572 = true;
                                if (var124 > 0) {
                                    this.method544(this.field1234, "", var125 + " has logged in.", 5);
                                }
                                if (var124 == 0) {
                                    this.method544(this.field1234, "", var125 + " has logged out.", 5);
                                }
                            }
                            var125 = null;
                            break;
                        }
                    }
                    if (var125 != null && this.field1242 < 200) {
                        this.field1403[this.field1242] = var122;
                        this.field1524[this.field1242] = var125;
                        this.field1655[this.field1242] = var124;
                        ++this.field1242;
                        this.field1572 = true;
                    }
                    boolean var127 = false;
                    while (!var127) {
                        var127 = true;
                        for (int var128 = 0; var128 < this.field1242 - 1; ++var128) {
                            if (this.field1655[var128] != field1306 && this.field1655[var128 + 1] == field1306 || this.field1655[var128] == 0 && this.field1655[var128 + 1] != 0) {
                                int var129 = this.field1655[var128];
                                this.field1655[var128] = this.field1655[var128 + 1];
                                this.field1655[var128 + 1] = var129;
                                String var130 = this.field1524[var128];
                                this.field1524[var128] = this.field1524[var128 + 1];
                                this.field1524[var128 + 1] = var130;
                                long var131 = this.field1403[var128];
                                this.field1403[var128] = this.field1403[var128 + 1];
                                this.field1403[var128 + 1] = var131;
                                this.field1572 = true;
                                var127 = false;
                            }
                        }
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 200) {
                    this.field1358 = true;
                    this.field1566 = this.field1470.method225();
                    this.field1567 = this.field1470.method225();
                    this.field1568 = this.field1470.method227();
                    this.field1569 = this.field1470.method225();
                    this.field1570 = this.field1470.method225();
                    if (this.field1570 >= 100) {
                        this.field1541 = this.field1566 * 128 + 64;
                        this.field1543 = this.field1567 * 128 + 64;
                        this.field1542 = this.method474(this.field1543, this.field1541, -195, this.field1303) - this.field1568;
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 215) {
                    int var133 = this.field1470.method227();
                    int var134 = this.field1470.method225();
                    if (var133 == 65535) {
                        var133 = -1;
                    }
                    this.field1341[var134] = var133;
                    this.field1572 = true;
                    this.field1296 = true;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 115) {
                    this.field1275 = 0;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 44) {
                    int var135 = this.field1470.method227();
                    String var136 = this.field1470.method232();
                    Component.field68[var135].field109 = var136;
                    if (this.field1341[this.field1438] == Component.field68[var135].field74) {
                        this.field1572 = true;
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 166) {
                    int var137 = this.field1470.method227();
                    this.method556(var137, 95);
                    if (this.field1599 != -1) {
                        this.field1599 = -1;
                        this.field1572 = true;
                        this.field1296 = true;
                    }
                    this.field1601 = var137;
                    this.field1389 = true;
                    this.field1617 = -1;
                    this.field1502 = false;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 91) {
                    this.field1209 = this.field1470.method230();
                    this.field1401 = this.field1470.method227();
                    this.field1280 = this.field1470.method225();
                    this.field1468 = this.field1470.method227();
                    this.field1626 = this.field1470.method225();
                    if (this.field1209 != 0 && this.field1617 == -1) {
                        signlink.dnslookup(JString.method299(this.field1209, 9));
                        this.method476(-364);
                        short var138 = 650;
                        if (this.field1280 != 201 || this.field1626 == 1) {
                            var138 = 655;
                        }
                        this.field1344 = "";
                        this.field1647 = false;
                        for (int var139 = 0; var139 < Component.field68.length; ++var139) {
                            if (Component.field68[var139] != null && Component.field68[var139].field77 == var138) {
                                this.field1617 = Component.field68[var139].field74;
                                break;
                            }
                        }
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 133) {
                    this.field1485 = this.field1470.method227();
                    this.field1571 = this.field1470.method225();
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 207) {
                    this.field1354 = this.field1470.method225();
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 172) {
                    this.field1572 = true;
                    int var140 = this.field1470.method227();
                    Component var141 = Component.field68[var140];
                    while (this.field1470.field708 < this.field1410) {
                        int var142 = this.field1470.method225();
                        int var143 = this.field1470.method227();
                        int var144 = this.field1470.method225();
                        if (var144 == 255) {
                            var144 = this.field1470.method230();
                        }
                        if (var142 >= 0 && var142 < var141.field69.length) {
                            var141.field69[var142] = var143;
                            var141.field70[var142] = var144;
                        }
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 88) {
                    this.method479(184);
                    this.field1411 = -1;
                    return false;
                }
                if (this.field1411 == 241) {
                    this.field1438 = this.field1470.method225();
                    this.field1572 = true;
                    this.field1296 = true;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 28) {
                    int var145 = this.field1470.method227();
                    int var146 = this.field1470.method227();
                    int var147 = this.field1470.method227();
                    if (var146 == 65535) {
                        Component.field68[var145].field117 = 0;
                        this.field1411 = -1;
                        return true;
                    }
                    ObjType var148 = ObjType.method342(var146);
                    Component.field68[var145].field117 = 4;
                    Component.field68[var145].field118 = var146;
                    Component.field68[var145].field124 = var148.field1039;
                    Component.field68[var145].field125 = var148.field1040;
                    Component.field68[var145].field123 = var148.field1038 * 100 / var147;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 211) {
                    int var149 = this.field1470.method227();
                    this.method556(var149, 95);
                    if (this.field1599 != -1) {
                        this.field1599 = -1;
                        this.field1572 = true;
                        this.field1296 = true;
                    }
                    if (this.field1601 != -1) {
                        this.field1601 = -1;
                        this.field1389 = true;
                    }
                    if (this.field1638) {
                        this.field1638 = false;
                        this.field1389 = true;
                    }
                    this.field1617 = var149;
                    this.field1502 = false;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 101) {
                    this.field1358 = false;
                    for (int var150 = 0; var150 < 5; ++var150) {
                        this.field1614[var150] = false;
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 3) {
                    this.field1313 = this.field1410 / 8;
                    for (int var151 = 0; var151 < this.field1313; ++var151) {
                        this.field1618[var151] = this.field1470.method231(false);
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 47) {
                    for (int var152 = 0; var152 < this.field1348.length; ++var152) {
                        if (this.field1348[var152] != null) {
                            this.field1348[var152].field425 = -1;
                        }
                    }
                    for (int var153 = 0; var153 < this.field1603.length; ++var153) {
                        if (this.field1603[var153] != null) {
                            this.field1603[var153].field425 = -1;
                        }
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 67) {
                    if (this.field1438 == 12) {
                        this.field1572 = true;
                    }
                    this.field1476 = this.field1470.method228();
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 95 || this.field1411 == 176 || this.field1411 == 219 || this.field1411 == 85 || this.field1411 == 107 || this.field1411 == 52 || this.field1411 == 81 || this.field1411 == 48 || this.field1411 == 173 || this.field1411 == 138) {
                    this.method442(this.field1411, this.field1470, 3872);
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 54) {
                    int var154 = this.field1470.method227();
                    int var155 = this.field1470.method227();
                    Component var156 = Component.field68[var154];
                    if (var156 != null && var156.field75 == 0) {
                        if (var155 < 0) {
                            var155 = 0;
                        }
                        if (var155 > var156.field87 - var156.field79) {
                            var155 = var156.field87 - var156.field79;
                        }
                        var156.field88 = var155;
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 83) {
                    if (this.field1438 == 12) {
                        this.field1572 = true;
                    }
                    this.field1378 = this.field1470.method225();
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 197) {
                    this.method490(this.field1470, 3, this.field1410);
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 185) {
                    this.field1243 = this.field1470.method225();
                    this.field1572 = true;
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 34) {
                    int var157 = this.field1470.method227();
                    int var158 = this.field1470.method225();
                    int var159 = this.field1470.method227();
                    if (this.field1550 && !field1309 && this.field1326 < 50) {
                        this.field1453[this.field1326] = var157;
                        this.field1435[this.field1326] = var158;
                        this.field1317[this.field1326] = Wave.field906[var157] + var159;
                        ++this.field1326;
                    }
                    this.field1411 = -1;
                    return true;
                }
                if (this.field1411 == 16) {
                    int var160 = this.field1470.method227();
                    this.method556(var160, 95);
                    if (this.field1601 != -1) {
                        this.field1601 = -1;
                        this.field1389 = true;
                    }
                    if (this.field1638) {
                        this.field1638 = false;
                        this.field1389 = true;
                    }
                    this.field1599 = var160;
                    this.field1572 = true;
                    this.field1296 = true;
                    this.field1617 = -1;
                    this.field1502 = false;
                    this.field1411 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1411 + "," + this.field1410 + " - " + this.field1239 + "," + this.field1240);
                this.method479(184);
            } catch (IOException var165) {
                this.method510((byte) -31);
            } catch (Exception var166) {
                String var162 = "T2 - " + this.field1411 + "," + this.field1239 + "," + this.field1240 + " - " + this.field1410 + "," + (field1278.field447[0] + this.field1359) + "," + (field1278.field448[0] + this.field1360) + " - ";
                for (int var163 = 0; var163 < this.field1410 && var163 < 50; ++var163) {
                    var162 = var162 + this.field1470.field707[var163] + ",";
                }
                signlink.reporterror(var162);
                this.method479(184);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method498(int arg0) {
        int var2 = this.field1449;
        int var3 = this.field1450;
        int var4 = this.field1451;
        int var5 = this.field1452;
        int var6 = 6116423;
        if (arg0 <= 0) {
            field1573 = true;
        }
        Pix2D.method156(var2, var6, var5, var4, -37952, var3);
        Pix2D.method156(var2 + 1, 0, 16, var4 - 2, -37952, var3 + 1);
        Pix2D.method157(var4 - 2, 0, var5 - 19, 0, var3 + 18, var2 + 1);
        this.field1645.method204(var2 + 3, "Choose Option", -1765, var3 + 14, var6);
        int var7 = super.field21;
        int var8 = super.field22;
        if (this.field1448 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field1448 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field1448 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field1254; ++var9) {
            int var10 = (this.field1254 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field1645.method206(var10, 12, var2 + 3, true, var11, this.field1402[var9]);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method499(boolean arg0) {
        if (this.field1532 == 0) {
            this.field1402[0] = "Cancel";
            this.field1608[0] = 1106;
            this.field1254 = 1;
            this.method436(45189);
            this.field1472 = 0;
            if (super.field21 > 4 && super.field22 > 4 && super.field21 < 516 && super.field22 < 338) {
                if (this.field1617 != -1) {
                    this.method447(Component.field68[this.field1617], 4, super.field21, super.field22, 0, true, 4);
                } else {
                    this.method492(0);
                }
            }
            if (this.field1472 != this.field1286) {
                this.field1286 = this.field1472;
            }
            this.field1472 = 0;
            if (arg0) {
                if (super.field21 > 553 && super.field22 > 205 && super.field21 < 743 && super.field22 < 466) {
                    if (this.field1599 != -1) {
                        this.method447(Component.field68[this.field1599], 553, super.field21, super.field22, 0, true, 205);
                    } else if (this.field1341[this.field1438] != -1) {
                        this.method447(Component.field68[this.field1341[this.field1438]], 553, super.field21, super.field22, 0, true, 205);
                    }
                }
                if (this.field1472 != this.field1268) {
                    this.field1572 = true;
                    this.field1268 = this.field1472;
                }
                this.field1472 = 0;
                if (super.field21 > 17 && super.field22 > 357 && super.field21 < 496 && super.field22 < 453) {
                    if (this.field1601 != -1) {
                        this.method447(Component.field68[this.field1601], 17, super.field21, super.field22, 0, true, 357);
                    } else if (super.field22 < 434 && super.field21 < 426) {
                        this.method500(super.field22 - 357, super.field21 - 17, 45827);
                    }
                }
                if (this.field1601 != -1 && this.field1472 != this.field1315) {
                    this.field1389 = true;
                    this.field1315 = this.field1472;
                }
                boolean var2 = false;
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field1254 - 1; ++var3) {
                        if (this.field1608[var3] < 1000 && this.field1608[var3 + 1] > 1000) {
                            String var4 = this.field1402[var3];
                            this.field1402[var3] = this.field1402[var3 + 1];
                            this.field1402[var3 + 1] = var4;
                            int var5 = this.field1608[var3];
                            this.field1608[var3] = this.field1608[var3 + 1];
                            this.field1608[var3 + 1] = var5;
                            int var6 = this.field1606[var3];
                            this.field1606[var3] = this.field1606[var3 + 1];
                            this.field1606[var3 + 1] = var6;
                            int var7 = this.field1607[var3];
                            this.field1607[var3] = this.field1607[var3 + 1];
                            this.field1607[var3 + 1] = var7;
                            int var8 = this.field1609[var3];
                            this.field1609[var3] = this.field1609[var3 + 1];
                            this.field1609[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)V")
    public final void method500(int arg0, int arg1, int arg2) {
        if (this.field1556 != arg2) {
            this.field1444.method215(35);
        }
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field1465[var5] != null) {
                int var6 = this.field1463[var5];
                int var7 = 70 - var4 * 14 + this.field1475 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field1464[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1651 == 0 || this.field1651 == 1 && this.method430(2, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field1278.field458)) {
                        if (this.field1458 >= 1) {
                            this.field1402[this.field1254] = "Report abuse @whi@" + var8;
                            this.field1608[this.field1254] = 524;
                            ++this.field1254;
                        }
                        this.field1402[this.field1254] = "Add ignore @whi@" + var8;
                        this.field1608[this.field1254] = 47;
                        ++this.field1254;
                        this.field1402[this.field1254] = "Add friend @whi@" + var8;
                        this.field1608[this.field1254] = 605;
                        ++this.field1254;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field1293 == 0 && (var6 == 7 || this.field1529 == 0 || this.field1529 == 1 && this.method430(2, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        if (this.field1458 >= 1) {
                            this.field1402[this.field1254] = "Report abuse @whi@" + var8;
                            this.field1608[this.field1254] = 524;
                            ++this.field1254;
                        }
                        this.field1402[this.field1254] = "Add ignore @whi@" + var8;
                        this.field1608[this.field1254] = 47;
                        ++this.field1254;
                        this.field1402[this.field1254] = "Add friend @whi@" + var8;
                        this.field1608[this.field1254] = 605;
                        ++this.field1254;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field1269 == 0 || this.field1269 == 1 && this.method430(2, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field1402[this.field1254] = "Accept trade @whi@" + var8;
                        this.field1608[this.field1254] = 507;
                        ++this.field1254;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field1293 == 0 && this.field1529 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field1269 == 0 || this.field1269 == 1 && this.method430(2, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field1402[this.field1254] = "Accept challenge @whi@" + var8;
                        this.field1608[this.field1254] = 957;
                        ++this.field1254;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public static final void method501(int arg0) {
        World3D.field281 = false;
        Pix3D.field634 = false;
        field1309 = false;
        World.field42 = false;
        if (arg0 != 0) {
            field1573 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method502(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1551.method198(arg2, (byte) 1, arg1);
        this.field1552.method198(arg2, (byte) 1, arg1 + arg4 - 16);
        Pix2D.method156(arg2, this.field1357, arg4 - 32, 16, -37952, arg1 + 16);
        if (arg5 != 223) {
            this.field1628 = null;
        }
        int var7 = (arg4 - 32) * arg4 / arg0;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg4 - 32 - var7) * arg3 / (arg0 - arg4);
        Pix2D.method156(arg2, this.field1486, var7, 16, -37952, arg1 + 16 + var8);
        Pix2D.method161(true, var7, arg2, arg1 + 16 + var8, this.field1256);
        Pix2D.method161(true, var7, arg2 + 1, arg1 + 16 + var8, this.field1256);
        Pix2D.method159(arg1 + 16 + var8, this.field1256, 16, 0, arg2);
        Pix2D.method159(arg1 + 17 + var8, this.field1256, 16, 0, arg2);
        Pix2D.method161(true, var7, arg2 + 15, arg1 + 16 + var8, this.field1521);
        Pix2D.method161(true, var7 - 1, arg2 + 14, arg1 + 17 + var8, this.field1521);
        Pix2D.method159(arg1 + 15 + var8 + var7, this.field1521, 16, 0, arg2);
        Pix2D.method159(arg1 + 14 + var8 + var7, this.field1521, 15, 0, arg2 + 1);
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method503(int arg0) {
        LocType.field980.method103();
        LocType.field981.method103();
        NpcType.field1022.method103();
        ObjType.field1072.method103();
        if (arg0 != 0) {
            this.field1444.method215(69);
        }
        ObjType.field1073.method103();
        PlayerEntity.field482.method103();
        SpotAnimType.field1160.method103();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILlb;)V")
    private final void method504(int arg0, int arg1, Packet arg2) {
        this.field1592 = 0;
        this.field1351 = 0;
        int var4 = 51 / arg0;
        this.method468(arg2, arg1, (byte) 0);
        this.method511((byte) -18, arg2, arg1);
        this.method429(arg1, 368, arg2);
        this.method525(arg2, 6, arg1);
        for (int var5 = 0; var5 < this.field1592; ++var5) {
            int var7 = this.field1593[var5];
            if (field1330 != this.field1348[var7].field442) {
                this.field1348[var7] = null;
            }
        }
        if (arg2.field708 != arg1) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field708 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field1349; ++var6) {
                if (this.field1348[this.field1350[var6]] == null) {
                    signlink.reporterror(this.field1597 + " null entry in pl list - pos:" + var6 + " size:" + this.field1349);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method505(int arg0, int arg1) {
        int[] var3 = this.field1277.field663;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field1422[arg0][var24][var6] & 24) == 0) {
                    this.field1536.method85(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field1422[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field1536.method85(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1277.method180(979);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field1422[arg0][var22][var9] & 24) == 0) {
                    this.method528(var7, true, var9, var22, var8, arg0);
                }
                if (arg0 < 3 && (this.field1422[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method528(var7, true, var9, var22, var8, arg0 + 1);
                }
            }
        }
        this.field1509.method254(979);
        this.field1478 = 0;
        if (arg1 != 2412) {
            this.field1628 = null;
        }
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field1536.method79(this.field1303, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = LocType.method326(var13).field966;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field1235[this.field1303].field1085;
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
                        this.field1631[this.field1478] = this.field1587[var14];
                        this.field1479[this.field1478] = var15;
                        this.field1480[this.field1478] = var16;
                        ++this.field1478;
                    }
                }
            }
        }
        ++field1649;
        if (field1649 > 112) {
            field1649 = 0;
            this.field1444.method214(52, 0);
            this.field1444.method215(50);
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method506(int arg0) {
        if (arg0 <= 0) {
            field1573 = true;
        }
        short var2 = 256;
        if (this.field1634 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1634 > 768) {
                    this.field1428[var3] = this.method465(this.field1430[var3], this.field1429[var3], 1024 - this.field1634, 0);
                } else if (this.field1634 > 256) {
                    this.field1428[var3] = this.field1430[var3];
                } else {
                    this.field1428[var3] = this.method465(this.field1429[var3], this.field1430[var3], 256 - this.field1634, 0);
                }
            }
        } else if (this.field1635 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1635 > 768) {
                    this.field1428[var4] = this.method465(this.field1431[var4], this.field1429[var4], 1024 - this.field1635, 0);
                } else if (this.field1635 > 256) {
                    this.field1428[var4] = this.field1431[var4];
                } else {
                    this.field1428[var4] = this.method465(this.field1429[var4], this.field1431[var4], 256 - this.field1635, 0);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1428[var5] = this.field1429[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1514.field747[var6] = this.field1488.field663[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1653[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1334[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1428[var26];
                    int var30 = this.field1514.field747[var8];
                    this.field1514.field747[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field1514.method255(super.field13, 0, 0, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1515.field747[var10] = this.field1489.field663[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1653[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1334[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1428[var18];
                    int var22 = this.field1515.field747[var16];
                    this.field1515.field747[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field1515.method255(super.field13, 637, 0, 0);
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method507(int arg0) {
        this.field1266 = new Pix8(this.field1540, "titlebox", 0);
        this.field1267 = new Pix8(this.field1540, "titlebutton", 0);
        if (arg0 != 7) {
            this.field1444.method215(150);
        }
        this.field1487 = new Pix8[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field1487[var3] = new Pix8(this.field1540, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field1487[var4] = new Pix8(this.field1540, "runes", (var4 & 3) + 12);
            }
        }
        this.field1488 = new Pix32(128, 265);
        this.field1489 = new Pix32(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field1488.field663[var5] = this.field1514.field747[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1489.field663[var6] = this.field1515.field747[var6];
        }
        this.field1429 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1429[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1429[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1429[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1429[var10 + 192] = 16777215;
        }
        this.field1430 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1430[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1430[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1430[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1430[var14 + 192] = 16777215;
        }
        this.field1431 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1431[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1431[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field1431[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field1431[var18 + 192] = 16777215;
        }
        this.field1428 = new int[256];
        this.field1259 = new int[32768];
        this.field1260 = new int[32768];
        this.method461((Pix8) null, 0);
        this.field1334 = new int[32768];
        this.field1335 = new int[32768];
        this.method13(9, 10, "Connecting to fileserver");
        if (!this.field1491) {
            this.field1656 = true;
            this.field1491 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIIIIIIIIIZ)Z")
    public final boolean method508(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1281[var15][var35] = 0;
                this.field1265[var15][var35] = 99999999;
            }
        }
        int var16 = arg4;
        int var17 = arg2;
        this.field1281[arg4][arg2] = 99;
        this.field1265[arg4][arg2] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1657[var18] = arg4;
        int var36 = var18 + 1;
        this.field1658[var18] = arg2;
        boolean var20 = false;
        int var21 = this.field1657.length;
        if (!arg11) {
            field1329 = this.field1375.method291();
        }
        int[][] var22 = this.field1235[this.field1303].field1085;
        while (var36 != var19) {
            var16 = this.field1657[var19];
            var17 = this.field1658[var19];
            var19 = (var19 + 1) % var21;
            if (arg6 == var16 && arg8 == var17) {
                var20 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && this.field1235[this.field1303].method362(var17, arg9, arg8, false, var16, arg6, arg5 - 1)) {
                    var20 = true;
                    break;
                }
                if (arg5 < 10 && this.field1235[this.field1303].method363(var16, var17, arg5 - 1, arg8, arg6, arg9, -272)) {
                    var20 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg7 != 0 && this.field1235[this.field1303].method364(arg6, var16, arg8, arg3, this.field1630, var17, arg1, arg7)) {
                var20 = true;
                break;
            }
            int var34 = this.field1265[var16][var17] + 1;
            if (var16 > 0 && this.field1281[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1657[var36] = var16 - 1;
                this.field1658[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1281[var16 - 1][var17] = 2;
                this.field1265[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1281[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1657[var36] = var16 + 1;
                this.field1658[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1281[var16 + 1][var17] = 8;
                this.field1265[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1281[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1657[var36] = var16;
                this.field1658[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1281[var16][var17 - 1] = 1;
                this.field1265[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1281[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1657[var36] = var16;
                this.field1658[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1281[var16][var17 + 1] = 4;
                this.field1265[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1281[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1657[var36] = var16 - 1;
                this.field1658[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1281[var16 - 1][var17 - 1] = 3;
                this.field1265[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1281[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1657[var36] = var16 + 1;
                this.field1658[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1281[var16 + 1][var17 - 1] = 9;
                this.field1265[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1281[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1657[var36] = var16 - 1;
                this.field1658[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1281[var16 - 1][var17 + 1] = 6;
                this.field1265[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1281[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1657[var36] = var16 + 1;
                this.field1658[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1281[var16 + 1][var17 + 1] = 12;
                this.field1265[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1528 = 0;
        if (!var20) {
            if (arg0) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg6 - var24; var25 <= arg6 + var24; ++var25) {
                        for (int var26 = arg8 - var24; var26 <= arg8 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1265[var25][var26] < var23) {
                                var23 = this.field1265[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1528 = 1;
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
        this.field1657[var27] = var16;
        int var37 = var27 + 1;
        this.field1658[var27] = var17;
        int var28;
        int var29 = var28 = this.field1281[var16][var17];
        while (arg4 != var16 || arg2 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1657[var37] = var16;
                this.field1658[var37++] = var17;
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
            var29 = this.field1281[var16][var17];
        }
        if (var37 <= 0) {
            if (arg10 == 1) {
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
            int var31 = this.field1657[var37];
            int var32 = this.field1658[var37];
            if (arg10 == 0) {
                this.field1444.method214(207, 0);
                this.field1444.method215(var30 + var30 + 3);
            }
            if (arg10 == 1) {
                this.field1444.method214(86, 0);
                this.field1444.method215(var30 + var30 + 3 + 14);
            }
            if (arg10 == 2) {
                this.field1444.method214(138, 0);
                this.field1444.method215(var30 + var30 + 3);
            }
            if (super.field31[5] == 1) {
                this.field1444.method215(1);
            } else {
                this.field1444.method215(0);
            }
            this.field1444.method216(this.field1359 + var31);
            this.field1444.method216(this.field1360 + var32);
            this.field1275 = this.field1657[0];
            this.field1276 = this.field1658[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1444.method215(this.field1657[var37] - var31);
                this.field1444.method215(this.field1658[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(III)Z")
    public final boolean method509(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        Component var5 = Component.field68[arg0];
        for (int var6 = 0; var6 < var5.field90.length && var5.field90[var6] != -1; ++var6) {
            Component var7 = Component.field68[var5.field90[var6]];
            if (var7.field75 == 1) {
                var4 |= this.method509(var7.field73, arg1, 2);
            }
            if (var7.field75 == 6 && (var7.field121 != -1 || var7.field122 != -1)) {
                boolean var8 = this.method425(var7, (byte) 8);
                int var9;
                if (var8) {
                    var9 = var7.field122;
                } else {
                    var9 = var7.field121;
                }
                if (var9 != -1) {
                    SeqType var10 = SeqType.field1126[var9];
                    var7.field72 += arg1;
                    while (var7.field72 > var10.method376(-346, var7.field71)) {
                        var7.field72 -= var10.method376(-346, var7.field71) + 1;
                        ++var7.field71;
                        if (var7.field71 >= var10.field1127) {
                            var7.field71 -= var10.field1131;
                            if (var7.field71 < 0 || var7.field71 >= var10.field1127) {
                                var7.field71 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        if (arg2 < 2 || arg2 > 2) {
            this.field1411 = -1;
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method8(byte arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1399 != null) {
                this.field1399.method38();
            }
        } catch (Exception var3) {
        }
        this.field1399 = null;
        this.method460(-232);
        if (this.field1274 != null) {
            this.field1274.field984 = false;
        }
        this.field1274 = null;
        this.field1459.method267();
        this.field1459 = null;
        this.field1444 = null;
        this.field1579 = null;
        this.field1470 = null;
        this.field1580 = null;
        this.field1546 = null;
        this.field1457 = null;
        this.field1581 = null;
        this.field1582 = null;
        this.field1490 = null;
        this.field1422 = null;
        this.field1536 = null;
        this.field1235 = null;
        this.field1281 = null;
        this.field1265 = null;
        this.field1657 = null;
        this.field1658 = null;
        this.field1287 = null;
        this.field1507 = null;
        this.field1508 = null;
        this.field1509 = null;
        this.field1510 = null;
        this.field1495 = null;
        this.field1496 = null;
        this.field1497 = null;
        this.field1244 = null;
        this.field1245 = null;
        this.field1246 = null;
        this.field1247 = null;
        this.field1248 = null;
        this.field1249 = null;
        this.field1250 = null;
        this.field1251 = null;
        this.field1252 = null;
        this.field1379 = null;
        this.field1380 = null;
        this.field1381 = null;
        this.field1537 = null;
        this.field1538 = null;
        this.field1539 = null;
        this.field1477 = null;
        this.field1384 = null;
        this.field1385 = null;
        this.field1386 = null;
        this.field1387 = null;
        this.field1388 = null;
        this.field1363 = null;
        this.field1364 = null;
        this.field1365 = null;
        this.field1366 = null;
        this.field1367 = null;
        this.field1328 = null;
        this.field1264 = null;
        this.field1505 = null;
        this.field1409 = null;
        this.field1282 = null;
        this.field1283 = null;
        this.field1284 = null;
        this.field1285 = null;
        this.field1432 = null;
        this.field1587 = null;
        this.field1373 = null;
        this.field1348 = null;
        this.field1350 = null;
        this.field1352 = null;
        this.field1353 = null;
        this.field1593 = null;
        this.field1603 = null;
        this.field1605 = null;
        this.field1628 = null;
        this.field1611 = null;
        this.field1426 = null;
        this.field1255 = null;
        this.field1606 = null;
        this.field1607 = null;
        this.field1608 = null;
        this.field1609 = null;
        this.field1402 = null;
        this.field1577 = null;
        this.field1479 = null;
        this.field1480 = null;
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            this.field1444.method215(11);
        }
        this.field1631 = null;
        this.field1277 = null;
        this.field1524 = null;
        this.field1403 = null;
        this.field1655 = null;
        this.field1514 = null;
        this.field1515 = null;
        this.field1511 = null;
        this.field1512 = null;
        this.field1513 = null;
        this.field1516 = null;
        this.field1517 = null;
        this.field1518 = null;
        this.field1519 = null;
        this.method459(false);
        LocType.method325(0);
        NpcType.method335(0);
        ObjType.method341(0);
        FloType.field1088 = null;
        IdkType.field1103 = null;
        Component.field68 = null;
        UnkType.field1111 = null;
        SeqType.field1126 = null;
        SpotAnimType.field1148 = null;
        SpotAnimType.field1160 = null;
        VarpType.field1173 = null;
        super.field14 = null;
        PlayerEntity.field482 = null;
        Pix3D.method163(0);
        World3D.method49(0);
        Model.method121(0);
        AnimFrame.method46(0);
        System.gc();
        if (Linkable.field360) {
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method510(byte arg0) {
        if (this.field1414 > 0) {
            this.method479(184);
        } else {
            this.field1509.method254(979);
            this.field1644.method200(257, (byte) 2, 0, "Connection lost", 144);
            this.field1644.method200(256, (byte) 2, 16777215, "Connection lost", 143);
            if (arg0 != -31) {
                field1395 = -132;
            }
            this.field1644.method200(257, (byte) 2, 0, "Please wait - attempting to reestablish", 159);
            this.field1644.method200(256, (byte) 2, 16777215, "Please wait - attempting to reestablish", 158);
            this.field1509.method255(super.field13, 4, 0, 4);
            this.field1336 = 0;
            this.field1275 = 0;
            ClientStream var2 = this.field1399;
            this.field1578 = false;
            this.method542(this.field1597, this.field1598, true);
            if (!this.field1578) {
                this.method479(184);
            }
            try {
                var2.method38();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLlb;I)V")
    private final void method511(byte arg0, Packet arg1, int arg2) {
        int var4 = arg1.method236(0, 8);
        if (this.field1641 != arg0) {
            this.field1628 = null;
        }
        if (var4 < this.field1349) {
            for (int var5 = var4; var5 < this.field1349; ++var5) {
                this.field1593[this.field1592++] = this.field1350[var5];
            }
        }
        if (var4 > this.field1349) {
            signlink.reporterror(this.field1597 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1349 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1350[var6];
                PlayerEntity var8 = this.field1348[var7];
                int var9 = arg1.method236(0, 1);
                if (var9 == 0) {
                    this.field1350[this.field1349++] = var7;
                    var8.field442 = field1330;
                } else {
                    int var10 = arg1.method236(0, 2);
                    if (var10 == 0) {
                        this.field1350[this.field1349++] = var7;
                        var8.field442 = field1330;
                        this.field1352[this.field1351++] = var7;
                    } else if (var10 == 1) {
                        this.field1350[this.field1349++] = var7;
                        var8.field442 = field1330;
                        int var11 = arg1.method236(0, 3);
                        var8.method111((byte) 5, var11, false);
                        int var12 = arg1.method236(0, 1);
                        if (var12 == 1) {
                            this.field1352[this.field1351++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1350[this.field1349++] = var7;
                        var8.field442 = field1330;
                        int var13 = arg1.method236(0, 3);
                        var8.method111((byte) 5, var13, true);
                        int var14 = arg1.method236(0, 3);
                        var8.method111((byte) 5, var14, true);
                        int var15 = arg1.method236(0, 1);
                        if (var15 == 1) {
                            this.field1352[this.field1351++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1593[this.field1592++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method512(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBIIIII)V")
    public final void method513(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg2 & 2047;
        int var9 = 2048 - arg5 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg3;
        if (var8 != 0) {
            int var13 = Model.field601[var8];
            int var14 = Model.field602[var8];
            int var15 = var11 * var14 - arg3 * var13 >> 16;
            var12 = var11 * var13 + arg3 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field601[var9];
            int var17 = Model.field602[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1541 = arg6 - var10;
        if (arg1 != 0) {
            this.field1520 = 118;
        }
        this.field1542 = arg4 - var11;
        this.field1543 = arg0 - var12;
        this.field1544 = arg2;
        this.field1545 = arg5;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILib;IB)V")
    public final void method514(int arg0, Pix32 arg1, int arg2, byte arg3) {
        if (arg3 == 33) {
            int var5 = arg0 * arg0 + arg2 * arg2;
            if (var5 > 4225 && var5 < 90000) {
                int var6 = this.field1589 + this.field1473 & 2047;
                int var7 = Model.field601[var6];
                int var8 = Model.field602[var6];
                int var9 = var7 * 256 / (this.field1324 + 256);
                int var10 = var8 * 256 / (this.field1324 + 256);
                int var11 = arg0 * var9 + arg2 * var10 >> 16;
                int var12 = arg0 * var10 - arg2 * var9 >> 16;
                double var13 = Math.atan2((double) var11, (double) var12);
                int var15 = (int) (Math.sin(var13) * 63.0D);
                int var16 = (int) (Math.cos(var13) * 57.0D);
                this.field1584.method190(20, var13, var15 + 94 + 4 - 10, 15, 15, 83 - var16 - 20, 0, 20, 256);
            } else {
                this.method553(arg1, 0, arg2, arg0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method515(byte arg0, boolean arg1) {
        for (int var3 = 0; var3 < this.field1604; ++var3) {
            NpcEntity var4 = this.field1603[this.field1605[var3]];
            int var5 = (this.field1605[var3] << 14) + 536870912;
            if (var4 != null && var4.method113((byte) 121) && var4.field455.field1017 == arg1) {
                int var6 = var4.field397 >> 7;
                int var7 = var4.field398 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field401 == 1 && (var4.field397 & 127) == 64 && (var4.field398 & 127) == 64) {
                        if (this.field1373[var6][var7] == this.field1455) {
                            continue;
                        }
                        this.field1373[var6][var7] = this.field1455;
                    }
                    this.field1536.method61(this.method474(var4.field398, var4.field397, -195, this.field1303), var4.field397, var4.field399, this.field1303, var4, var5, var4.field400, (var4.field401 - 1) * 64 + 60, (byte) 33, var4.field398);
                }
            }
        }
        if (arg0 != 2) {
            this.field1444.method215(5);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lnb;I)V")
    private final void method516(LocSpawned arg0, int arg1) {
        while (arg1 >= 0) {
            this.field1411 = this.field1470.method225();
        }
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field727 == 0) {
            var3 = this.field1536.method76(arg0.field726, arg0.field728, arg0.field729);
        }
        if (arg0.field727 == 1) {
            var3 = this.field1536.method77(arg0.field726, arg0.field728, false, arg0.field729);
        }
        if (arg0.field727 == 2) {
            var3 = this.field1536.method78(arg0.field726, arg0.field728, arg0.field729);
        }
        if (arg0.field727 == 3) {
            var3 = this.field1536.method79(arg0.field726, arg0.field728, arg0.field729);
        }
        if (var3 != 0) {
            int var7 = this.field1536.method80(arg0.field726, arg0.field728, arg0.field729, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field730 = var4;
        arg0.field732 = var5;
        arg0.field731 = var6;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method517(int arg0, int arg1) {
        LinkList var3 = this.field1628[this.field1303][arg0][arg1];
        if (var3 == null) {
            this.field1536.method71(this.field1303, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method244(); var6 != null; var6 = (ObjStackEntity) var3.method246(false)) {
                ObjType var11 = ObjType.method342(var6.field496);
                int var12 = var11.field1046;
                if (var11.field1045) {
                    var12 = (var6.field497 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method242(var5, false);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method244(); var9 != null; var9 = (ObjStackEntity) var3.method246(false)) {
                if (var5.field496 != var9.field496 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field496 != var9.field496 && var7.field496 != var9.field496 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1536.method57(arg0, this.field1303, this.method474(arg1 * 128 + 64, arg0 * 128 + 64, -195, this.field1303), var10, arg1, var5, var7, false, var8);
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method518(int arg0) {
        int var2 = this.field1566 * 128 + 64;
        int var3 = this.field1567 * 128 + 64;
        int var4 = this.method474(var3, var2, -195, this.field1303) - this.field1568;
        if (this.field1541 < var2) {
            this.field1541 += (var2 - this.field1541) * this.field1570 / 1000 + this.field1569;
            if (this.field1541 > var2) {
                this.field1541 = var2;
            }
        }
        if (this.field1541 > var2) {
            this.field1541 -= (this.field1541 - var2) * this.field1570 / 1000 + this.field1569;
            if (this.field1541 < var2) {
                this.field1541 = var2;
            }
        }
        if (this.field1542 < var4) {
            this.field1542 += (var4 - this.field1542) * this.field1570 / 1000 + this.field1569;
            if (this.field1542 > var4) {
                this.field1542 = var4;
            }
        }
        if (this.field1542 > var4) {
            this.field1542 -= (this.field1542 - var4) * this.field1570 / 1000 + this.field1569;
            if (this.field1542 < var4) {
                this.field1542 = var4;
            }
        }
        if (this.field1543 < var3) {
            this.field1543 += (var3 - this.field1543) * this.field1570 / 1000 + this.field1569;
            if (this.field1543 > var3) {
                this.field1543 = var3;
            }
        }
        if (this.field1543 > var3) {
            this.field1543 -= (this.field1543 - var3) * this.field1570 / 1000 + this.field1569;
            if (this.field1543 < var3) {
                this.field1543 = var3;
            }
        }
        int var5 = this.field1417 * 128 + 64;
        int var6 = this.field1418 * 128 + 64;
        int var7 = this.method474(var6, var5, -195, this.field1303) - this.field1419;
        int var8 = var5 - this.field1541;
        int var9 = var7 - this.field1542;
        int var10 = var6 - this.field1543;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        while (arg0 >= 0) {
            this.field1520 = 412;
        }
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1544 < var12) {
            this.field1544 += (var12 - this.field1544) * this.field1421 / 1000 + this.field1420;
            if (this.field1544 > var12) {
                this.field1544 = var12;
            }
        }
        if (this.field1544 > var12) {
            this.field1544 -= (this.field1544 - var12) * this.field1421 / 1000 + this.field1420;
            if (this.field1544 < var12) {
                this.field1544 = var12;
            }
        }
        int var14 = var13 - this.field1545;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1545 += this.field1421 * var14 / 1000 + this.field1420;
            this.field1545 &= 2047;
        }
        if (var14 < 0) {
            this.field1545 -= -var14 * this.field1421 / 1000 + this.field1420;
            this.field1545 &= 2047;
        }
        int var15 = var13 - this.field1545;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1545 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)Z")
    public final boolean method519(byte arg0) {
        if (arg0 == 5) {
            boolean var2 = false;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)Ljava/lang/String;")
    private static final String method520(int arg0, int arg1) {
        String var2 = String.valueOf(arg0);
        int var3 = 29 / arg1;
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

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method521(boolean arg0) {
        this.field1500 = true;
        if (arg0) {
            this.field1628 = null;
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1491) {
                ++this.field1406;
                this.method466((byte) 16);
                this.method466((byte) 16);
                this.method506(631);
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
        this.field1500 = false;
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method522(int arg0) {
        ProjectileEntity var2 = (ProjectileEntity) this.field1426.method244();
        if (this.field1376 == arg0) {
            while (var2 != null) {
                if (this.field1303 == var2.field503 && field1330 <= var2.field509) {
                    if (field1330 >= var2.field508) {
                        if (var2.field512 > 0) {
                            NpcEntity var4 = this.field1603[var2.field512 - 1];
                            if (var4 != null && var4.field397 >= 0 && var4.field397 < 13312 && var4.field398 >= 0 && var4.field398 < 13312) {
                                var2.method119(var4.field398, var4.field397, -630, this.method474(var4.field398, var4.field397, -195, var2.field503) - var2.field507, field1330);
                            }
                        }
                        if (var2.field512 < 0) {
                            int var5 = -var2.field512 - 1;
                            PlayerEntity var6;
                            if (this.field1485 == var5) {
                                var6 = field1278;
                            } else {
                                var6 = this.field1348[var5];
                            }
                            if (var6 != null && var6.field397 >= 0 && var6.field397 < 13312 && var6.field398 >= 0 && var6.field398 < 13312) {
                                var2.method119(var6.field398, var6.field397, -630, this.method474(var6.field398, var6.field397, -195, var2.field503) - var2.field507, field1330);
                            }
                        }
                        var2.method120(4, this.field1312);
                        this.field1536.method61((int) var2.field516, (int) var2.field514, var2.field522, this.field1303, var2, -1, false, 60, (byte) 33, (int) var2.field515);
                    }
                } else {
                    var2.method106();
                }
                var2 = (ProjectileEntity) this.field1426.method246(false);
            }
            ++field1461;
            if (field1461 > 1174) {
                field1461 = 0;
                this.field1444.method214(12, 0);
                this.field1444.method215(0);
                int var3 = this.field1444.field708;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1444.method216(11499);
                }
                this.field1444.method216(10548);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1444.method215(139);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1444.method215(94);
                }
                this.field1444.method216(51693);
                this.field1444.method215(16);
                this.field1444.method216(15036);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1444.method215(65);
                }
                this.field1444.method215((int) (Math.random() * 256.0D));
                this.field1444.method216(22990);
                this.field1444.method224(this.field1444.field708 - var3, false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method9(int arg0) {
        if (!this.field1471 && !this.field1596 && !this.field1213) {
            ++field1311;
            int var2 = 77 / arg0;
            if (!this.field1578) {
                this.method472(true, false);
            } else {
                this.method456(38919);
            }
            this.field1492 = 0;
        } else {
            this.method458(0);
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method523(int arg0) {
        this.method440(true);
        if (this.field1321 == 1) {
            this.field1409[this.field1320 / 100].method185(this.field1318 - 8 - 4, (byte) 1, this.field1319 - 8 - 4);
        }
        if (this.field1321 == 2) {
            this.field1409[this.field1320 / 100 + 4].method185(this.field1318 - 8 - 4, (byte) 1, this.field1319 - 8 - 4);
            ++field1612;
            if (field1612 > 57) {
                field1612 = 0;
                this.field1444.method214(100, 0);
            }
        }
        if (this.field1398 != -1) {
            this.method509(this.field1398, this.field1312, 2);
            this.method555(Component.field68[this.field1398], 2712, 0, 0, 0);
        }
        if (this.field1617 != -1) {
            this.method509(this.field1617, this.field1312, 2);
            this.method555(Component.field68[this.field1617], 2712, 0, 0, 0);
        }
        this.method532(4);
        while (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (!this.field1523) {
            this.method499(true);
            this.method551(805);
        } else if (this.field1448 == 0) {
            this.method498(185);
        }
        if (this.field1354 == 1) {
            this.field1505[1].method185(472, (byte) 1, 296);
        }
        if (this.field1633 != 0) {
            int var2 = this.field1633 / 50;
            int var3 = var2 / 60;
            int var4 = var2 % 60;
            if (var4 < 10) {
                this.field1644.method204(4, "System update in: " + var3 + ":0" + var4, -1765, 329, 16776960);
            } else {
                this.field1644.method204(4, "System update in: " + var3 + ":" + var4, -1765, 329, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZ)V")
    public final void method524(int arg0, int arg1, boolean arg2) {
        signlink.midivol = arg1;
        while (arg0 >= 0) {
            this.field1444.method215(27);
        }
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1306 = Integer.parseInt(this.getParameter("nodeid"));
        field1307 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method536(-3259);
        } else {
            method501(field1395);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1308 = false;
        } else {
            field1308 = true;
        }
        this.method2(765, 0, 503);
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Llb;II)V")
    private final void method525(Packet arg0, int arg1, int arg2) {
        if (arg1 >= 6 && arg1 <= 6) {
            for (int var4 = 0; var4 < this.field1351; ++var4) {
                int var5 = this.field1352[var4];
                PlayerEntity var6 = this.field1348[var5];
                int var7 = arg0.method225();
                if ((var7 & 128) == 128) {
                    var7 += arg0.method225() << 8;
                }
                this.method471(arg0, var7, var6, var5, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method526(boolean arg0) {
        byte[] var2 = this.field1540.method295("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1514.method254(979);
        var3.method183(0, 5, 0);
        this.field1515.method254(979);
        var3.method183(0, 5, -637);
        this.field1511.method254(979);
        var3.method183(0, 5, -128);
        this.field1512.method254(979);
        var3.method183(-371, 5, -202);
        this.field1513.method254(979);
        var3.method183(-171, 5, -202);
        this.field1516.method254(979);
        var3.method183(-265, 5, 0);
        this.field1517.method254(979);
        var3.method183(-265, 5, -562);
        this.field1518.method254(979);
        var3.method183(-171, 5, -128);
        this.field1519.method254(979);
        var3.method183(-171, 5, -562);
        int[] var4 = new int[var3.field664];
        for (int var5 = 0; var5 < var3.field665; ++var5) {
            for (int var10 = 0; var10 < var3.field664; ++var10) {
                var4[var10] = var3.field663[var3.field664 * var5 + (var3.field664 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field664; ++var11) {
                var3.field663[var3.field664 * var5 + var11] = var4[var11];
            }
        }
        this.field1514.method254(979);
        var3.method183(0, 5, 382);
        this.field1515.method254(979);
        var3.method183(0, 5, -255);
        if (arg0) {
            this.field1411 = this.field1470.method225();
        }
        this.field1511.method254(979);
        var3.method183(0, 5, 254);
        this.field1512.method254(979);
        var3.method183(-371, 5, 180);
        this.field1513.method254(979);
        var3.method183(-171, 5, 180);
        this.field1516.method254(979);
        var3.method183(-265, 5, 382);
        this.field1517.method254(979);
        var3.method183(-265, 5, -180);
        this.field1518.method254(979);
        var3.method183(-171, 5, 254);
        this.field1519.method254(979);
        var3.method183(-171, 5, -180);
        Pix32 var6 = new Pix32(this.field1540, "logo", 0);
        this.field1511.method254(979);
        var6.method185(382 - var6.field664 / 2 - 128, (byte) 1, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ld;B)Z")
    public final boolean method527(Component arg0, byte arg1) {
        if (arg1 != 37) {
            throw new NullPointerException();
        } else {
            int var3 = arg0.field77;
            if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
                if (var3 >= 401 && var3 <= 500) {
                    this.field1402[this.field1254] = "Remove @whi@" + arg0.field109;
                    this.field1608[this.field1254] = 884;
                    ++this.field1254;
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
                this.field1402[this.field1254] = "Remove @whi@" + this.field1524[var3];
                this.field1608[this.field1254] = 513;
                ++this.field1254;
                this.field1402[this.field1254] = "Message @whi@" + this.field1524[var3];
                this.field1608[this.field1254] = 902;
                ++this.field1254;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIIII)V")
    public final void method528(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg1) {
            field1573 = true;
        }
        int var7 = this.field1536.method76(arg5, arg3, arg2);
        if (var7 != 0) {
            int var8 = this.field1536.method80(arg5, arg3, arg2, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg0;
            if (var7 > 0) {
                var11 = arg4;
            }
            int[] var12 = this.field1277.field663;
            int var13 = (103 - arg2) * 512 * 4 + arg3 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method326(var14);
            if (var15.field967 != -1) {
                Pix8 var16 = this.field1432[var15.field967];
                if (var16 != null) {
                    int var17 = (var15.field953 * 4 - var16.field675) / 2;
                    int var18 = (var15.field954 * 4 - var16.field676) / 2;
                    var16.method198(arg3 * 4 + 48 + var17, (byte) 1, (104 - arg2 - var15.field954) * 4 + 48 + var18);
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
        int var19 = this.field1536.method78(arg5, arg3, arg2);
        if (var19 != 0) {
            int var20 = this.field1536.method80(arg5, arg3, arg2, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            LocType var24 = LocType.method326(var23);
            if (var24.field967 != -1) {
                Pix8 var25 = this.field1432[var24.field967];
                if (var25 != null) {
                    int var26 = (var24.field953 * 4 - var25.field675) / 2;
                    int var27 = (var24.field954 * 4 - var25.field676) / 2;
                    var25.method198(arg3 * 4 + 48 + var26, (byte) 1, (104 - arg2 - var24.field954) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field1277.field663;
                int var30 = (103 - arg2) * 512 * 4 + arg3 * 4 + 24624;
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
        int var31 = this.field1536.method79(arg5, arg3, arg2);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            LocType var33 = LocType.method326(var32);
            if (var33.field967 != -1) {
                Pix8 var34 = this.field1432[var33.field967];
                if (var34 != null) {
                    int var35 = (var33.field953 * 4 - var34.field675) / 2;
                    int var36 = (var33.field954 * 4 - var34.field676) / 2;
                    var34.method198(arg3 * 4 + 48 + var35, (byte) 1, (104 - arg2 - var33.field954) * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method7(int arg0) {
        this.field1410 += arg0;
        if (!this.field1471 && !this.field1596 && !this.field1213) {
            ++field1330;
            if (!this.field1578) {
                this.method547(-19490);
            } else {
                this.method545(7);
            }
            this.method552(0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILgc;I)V")
    public final void method529(int arg0, int arg1, int arg2, NpcType arg3, int arg4) {
        if (this.field1254 < 400) {
            String var6 = arg3.field997;
            int var7 = 44 / arg2;
            if (arg3.field1014 != 0) {
                var6 = var6 + method464(field1278.field464, 2, arg3.field1014) + " (level-" + arg3.field1014 + ")";
            }
            if (this.field1439 == 1) {
                this.field1402[this.field1254] = "Use " + this.field1443 + " with @yel@" + var6;
                this.field1608[this.field1254] = 829;
                this.field1609[this.field1254] = arg1;
                this.field1606[this.field1254] = arg4;
                this.field1607[this.field1254] = arg0;
                ++this.field1254;
            } else {
                if (this.field1368 == 1) {
                    if ((this.field1370 & 2) == 2) {
                        this.field1402[this.field1254] = this.field1371 + " @yel@" + var6;
                        this.field1608[this.field1254] = 240;
                        this.field1609[this.field1254] = arg1;
                        this.field1606[this.field1254] = arg4;
                        this.field1607[this.field1254] = arg0;
                        ++this.field1254;
                        return;
                    }
                } else {
                    if (arg3.field1009 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (arg3.field1009[var8] != null && !arg3.field1009[var8].equalsIgnoreCase("attack")) {
                                this.field1402[this.field1254] = arg3.field1009[var8] + " @yel@" + var6;
                                if (var8 == 0) {
                                    this.field1608[this.field1254] = 242;
                                }
                                if (var8 == 1) {
                                    this.field1608[this.field1254] = 209;
                                }
                                if (var8 == 2) {
                                    this.field1608[this.field1254] = 309;
                                }
                                if (var8 == 3) {
                                    this.field1608[this.field1254] = 852;
                                }
                                if (var8 == 4) {
                                    this.field1608[this.field1254] = 793;
                                }
                                this.field1609[this.field1254] = arg1;
                                this.field1606[this.field1254] = arg4;
                                this.field1607[this.field1254] = arg0;
                                ++this.field1254;
                            }
                        }
                    }
                    if (arg3.field1009 != null) {
                        for (int var9 = 4; var9 >= 0; --var9) {
                            if (arg3.field1009[var9] != null && arg3.field1009[var9].equalsIgnoreCase("attack")) {
                                short var10 = 0;
                                if (arg3.field1014 > field1278.field464) {
                                    var10 = 2000;
                                }
                                this.field1402[this.field1254] = arg3.field1009[var9] + " @yel@" + var6;
                                if (var9 == 0) {
                                    this.field1608[this.field1254] = var10 + 242;
                                }
                                if (var9 == 1) {
                                    this.field1608[this.field1254] = var10 + 209;
                                }
                                if (var9 == 2) {
                                    this.field1608[this.field1254] = var10 + 309;
                                }
                                if (var9 == 3) {
                                    this.field1608[this.field1254] = var10 + 852;
                                }
                                if (var9 == 4) {
                                    this.field1608[this.field1254] = var10 + 793;
                                }
                                this.field1609[this.field1254] = arg1;
                                this.field1606[this.field1254] = arg4;
                                this.field1607[this.field1254] = arg0;
                                ++this.field1254;
                            }
                        }
                    }
                    this.field1402[this.field1254] = "Examine @yel@" + var6;
                    this.field1608[this.field1254] = 1714;
                    this.field1609[this.field1254] = arg1;
                    this.field1606[this.field1254] = arg4;
                    this.field1607[this.field1254] = arg0;
                    ++this.field1254;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method530(boolean arg0) {
        ++this.field1455;
        this.method548(true, 0);
        this.method515(this.field1314, true);
        this.method548(false, 0);
        this.method515(this.field1314, false);
        this.method522(-12224);
        this.method483((byte) 38);
        if (!this.field1358) {
            int var2 = this.field1588;
            if (this.field1327 / 256 > var2) {
                var2 = this.field1327 / 256;
            }
            if (this.field1614[4] && this.field1291[4] + 128 > var2) {
                var2 = this.field1291[4] + 128;
            }
            int var3 = this.field1589 + this.field1481 & 2047;
            this.method513(this.field1392, (byte) 0, var2, var2 * 3 + 600, this.method474(field1278.field398, field1278.field397, -195, this.field1303) - 50, var3, this.field1391);
        }
        int var4;
        if (!this.field1358) {
            var4 = this.method481(false);
        } else {
            var4 = this.method482(false);
        }
        int var5 = this.field1541;
        int var6 = this.field1542;
        int var7 = this.field1543;
        int var8 = this.field1544;
        int var9 = this.field1545;
        this.field1578 &= arg0;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field1614[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field1565[var10] * 2 + 1) - (double) this.field1565[var10] + Math.sin((double) this.field1613[var10] / 100.0D * (double) this.field1484[var10]) * (double) this.field1291[var10]);
                if (var10 == 0) {
                    this.field1541 += var12;
                }
                if (var10 == 1) {
                    this.field1542 += var12;
                }
                if (var10 == 2) {
                    this.field1543 += var12;
                }
                if (var10 == 3) {
                    this.field1545 = this.field1545 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field1544 += var12;
                    if (this.field1544 < 128) {
                        this.field1544 = 128;
                    }
                    if (this.field1544 > 383) {
                        this.field1544 = 383;
                    }
                }
            }
        }
        int var11 = Pix3D.field654;
        Model.field596 = true;
        Model.field599 = 0;
        Model.field597 = super.field21 - 4;
        Model.field598 = super.field22 - 4;
        Pix2D.method154(false);
        this.field1536.method89(this.field1544, 3, this.field1545, this.field1542, this.field1541, this.field1543, var4);
        this.field1536.method64(0);
        this.method457(false);
        this.method445(this.field1445);
        this.method537(-14374, var11);
        this.method523(this.field1331);
        this.field1509.method255(super.field13, 4, 0, 4);
        this.field1541 = var5;
        this.field1542 = var6;
        this.field1543 = var7;
        this.field1544 = var8;
        this.field1545 = var9;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method531(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1313; ++var4) {
                if (this.field1618[var4] == arg0) {
                    --this.field1313;
                    this.field1572 = true;
                    for (int var5 = var4; var5 < this.field1313; ++var5) {
                        this.field1618[var5] = this.field1618[var5 + 1];
                    }
                    this.field1444.method214(101, 0);
                    this.field1444.method221(9, arg0);
                    break;
                }
            }
            this.field1410 += arg1;
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method532(int arg0) {
        this.field1437 = 0;
        if (arg0 < 4 || arg0 > 4) {
            this.field1411 = -1;
        }
        int var2 = (field1278.field397 >> 7) + this.field1359;
        int var3 = (field1278.field398 >> 7) + this.field1360;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1437 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1437 = 1;
        }
        if (this.field1437 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1437 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public final String method533(boolean arg0, int arg1) {
        if (arg0) {
            this.field1628 = null;
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method534(int arg0, int arg1) {
        signlink.wavevol = arg0;
        if (arg1 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;I)Z")
    public final boolean method535(Component arg0, int arg1) {
        if (arg1 != 0) {
            this.field1628 = null;
        }
        int var3 = arg0.field77;
        if (this.field1243 == 2) {
            if (var3 == 201) {
                this.field1389 = true;
                this.field1638 = false;
                this.field1215 = true;
                this.field1219 = "";
                this.field1294 = 1;
                this.field1527 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field1389 = true;
                this.field1638 = false;
                this.field1215 = true;
                this.field1219 = "";
                this.field1294 = 2;
                this.field1527 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field1414 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field1389 = true;
                this.field1638 = false;
                this.field1215 = true;
                this.field1219 = "";
                this.field1294 = 4;
                this.field1527 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field1389 = true;
                this.field1638 = false;
                this.field1215 = true;
                this.field1219 = "";
                this.field1294 = 5;
                this.field1527 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field1273[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = IdkType.field1102 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= IdkType.field1102) {
                                var6 = 0;
                            }
                        }
                        if (!IdkType.field1103[var6].field1109 && IdkType.field1103[var6].field1104 == var4 + (this.field1462 ? 0 : 7)) {
                            this.field1273[var4] = var6;
                            this.field1654 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field1295[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field1400[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field1400[var7].length) {
                        var9 = 0;
                    }
                }
                this.field1295[var7] = var9;
                this.field1654 = true;
            }
            if (var3 == 324 && !this.field1462) {
                this.field1462 = true;
                this.method539(-346);
            }
            if (var3 == 325 && this.field1462) {
                this.field1462 = false;
                this.method539(-346);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field1647 = !this.field1647;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method476(-364);
                    if (this.field1344.length() > 0) {
                        this.field1444.method214(137, 0);
                        this.field1444.method221(9, JString.method296(this.field1344));
                        this.field1444.method215(var3 - 601);
                        this.field1444.method215(this.field1647 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1444.method214(125, 0);
                this.field1444.method215(this.field1462 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field1444.method215(this.field1273[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field1444.method215(this.field1295[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public static final void method536(int arg0) {
        World3D.field281 = true;
        Pix3D.field634 = true;
        field1309 = true;
        if (arg0 != -3259) {
            field1573 = true;
        }
        World.field42 = true;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method537(int arg0, int arg1) {
        if (arg0 != -14374) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (!field1309) {
            if (Pix3D.field653[17] >= arg1) {
                Pix8 var4 = Pix3D.field647[17];
                int var5 = var4.field676 * var4.field675 - 1;
                int var6 = this.field1312 * var4.field675 * 2;
                byte[] var7 = var4.field673;
                byte[] var8 = this.field1287;
                for (int var9 = 0; var9 <= var5; ++var9) {
                    var8[var9] = var7[var9 - var6 & var5];
                }
                var4.field673 = var8;
                this.field1287 = var7;
                Pix3D.method170(499, 17);
            }
            if (Pix3D.field653[24] >= arg1) {
                Pix8 var10 = Pix3D.field647[24];
                int var11 = var10.field676 * var10.field675 - 1;
                int var12 = this.field1312 * var10.field675 * 2;
                byte[] var13 = var10.field673;
                byte[] var14 = this.field1287;
                for (int var15 = 0; var15 <= var11; ++var15) {
                    var14[var15] = var13[var15 - var12 & var11];
                }
                var10.field673 = var14;
                this.field1287 = var13;
                Pix3D.method170(499, 24);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method538(int arg0) {
        for (int var2 = -1; var2 < this.field1349; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1347;
            } else {
                var6 = this.field1350[var2];
            }
            PlayerEntity var7 = this.field1348[var6];
            if (var7 != null && var7.field410 > 0) {
                --var7.field410;
                if (var7.field410 == 0) {
                    var7.field409 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field1604; ++var3) {
            int var4 = this.field1605[var3];
            NpcEntity var5 = this.field1603[var4];
            if (var5 != null && var5.field410 > 0) {
                --var5.field410;
                if (var5.field410 == 0) {
                    var5.field409 = null;
                }
            }
        }
        if (arg0 == 8) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method539(int arg0) {
        this.field1654 = true;
        while (arg0 >= 0) {
            this.field1554 = 102;
        }
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1273[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field1102; ++var3) {
                if (!IdkType.field1103[var3].field1109 && IdkType.field1103[var3].field1104 == var2 + (this.field1462 ? 0 : 7)) {
                    this.field1273[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;II)I")
    public final int method540(Component arg0, int arg1, int arg2) {
        if (arg2 <= 0) {
            this.method6();
        }
        if (arg0.field83 != null && arg1 < arg0.field83.length) {
            try {
                int[] var4 = arg0.field83[arg1];
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
                        var9 = this.field1446[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field1433[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field1377[var4[var6++]];
                    }
                    if (var8 == 4) {
                        Component var11 = Component.field68[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < ObjType.field1026 && (!ObjType.method342(var12).field1047 || field1308)) {
                            for (int var13 = 0; var13 < var11.field69.length; ++var13) {
                                if (var12 + 1 == var11.field69[var13]) {
                                    var9 += var11.field70[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field1577[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field1356[this.field1433[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field1577[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field1278.field464;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < Stats.field1143; ++var14) {
                            if (Stats.field1145[var14]) {
                                var9 += this.field1433[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        Component var15 = Component.field68[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < ObjType.field1026 && (!ObjType.method342(var16).field1047 || field1308)) {
                            for (int var17 = 0; var17 < var15.field69.length; ++var17) {
                                if (var15.field69[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field1378;
                    }
                    if (var8 == 12) {
                        var9 = this.field1476;
                    }
                    if (var8 == 13) {
                        int var18 = this.field1577[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        VarbitType var21 = VarbitType.field1163[var20];
                        int var22 = var21.field1165;
                        int var23 = var21.field1166;
                        int var24 = var21.field1167;
                        int var25 = field1650[var24 - var23];
                        var9 = this.field1577[var22] >> var23 & var25;
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
                        var9 = (field1278.field397 >> 7) + this.field1359;
                    }
                    if (var8 == 19) {
                        var9 = (field1278.field398 >> 7) + this.field1360;
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

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method541(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            this.field1444.method215(132);
        }
        this.field1510.method254(979);
        Pix3D.field645 = this.field1558;
        this.field1381.method198(0, (byte) 1, 0);
        if (this.field1215) {
            this.field1645.method200(239, (byte) 2, 0, this.field1527, 40);
            this.field1645.method200(239, (byte) 2, 128, this.field1219 + "*", 60);
        } else if (this.field1638) {
            this.field1645.method200(239, (byte) 2, 0, "Enter amount:", 40);
            this.field1645.method200(239, (byte) 2, 128, this.field1208 + "*", 60);
        } else if (this.field1456 != null) {
            this.field1645.method200(239, (byte) 2, 0, this.field1456, 40);
            this.field1645.method200(239, (byte) 2, 128, "Click to continue", 60);
        } else if (this.field1601 != -1) {
            this.method555(Component.field68[this.field1601], 2712, 0, 0, 0);
        } else if (this.field1288 != -1) {
            this.method555(Component.field68[this.field1288], 2712, 0, 0, 0);
        } else {
            PixFont var3 = this.field1644;
            int var4 = 0;
            Pix2D.method153(0, 0, 463, 77, 297);
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field1465[var5] != null) {
                    int var7 = this.field1463[var5];
                    int var8 = 70 - var4 * 14 + this.field1475;
                    String var9 = this.field1464[var5];
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
                            var3.method204(4, this.field1465[var5], -1765, var8, 0);
                        }
                        ++var4;
                    }
                    if ((var7 == 1 || var7 == 2) && (var7 == 1 || this.field1651 == 0 || this.field1651 == 1 && this.method430(2, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            int var11 = 4;
                            if (var10 == 1) {
                                this.field1522[0].method198(var11, (byte) 1, var8 - 12);
                                var11 += 14;
                            }
                            if (var10 == 2) {
                                this.field1522[1].method198(var11, (byte) 1, var8 - 12);
                                var11 += 14;
                            }
                            var3.method204(var11, var9 + ":", -1765, var8, 0);
                            int var12 = var11 + var3.method202(var9, 5) + 8;
                            var3.method204(var12, this.field1465[var5], -1765, var8, 255);
                        }
                        ++var4;
                    }
                    if ((var7 == 3 || var7 == 7) && this.field1293 == 0 && (var7 == 7 || this.field1529 == 0 || this.field1529 == 1 && this.method430(2, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            byte var13 = 4;
                            var3.method204(var13, "From", -1765, var8, 0);
                            int var14 = var13 + var3.method202("From ", 5);
                            if (var10 == 1) {
                                this.field1522[0].method198(var14, (byte) 1, var8 - 12);
                                var14 += 14;
                            }
                            if (var10 == 2) {
                                this.field1522[1].method198(var14, (byte) 1, var8 - 12);
                                var14 += 14;
                            }
                            var3.method204(var14, var9 + ":", -1765, var8, 0);
                            int var15 = var14 + var3.method202(var9, 5) + 8;
                            var3.method204(var15, this.field1465[var5], -1765, var8, 8388608);
                        }
                        ++var4;
                    }
                    if (var7 == 4 && (this.field1269 == 0 || this.field1269 == 1 && this.method430(2, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method204(4, var9 + " " + this.field1465[var5], -1765, var8, 8388736);
                        }
                        ++var4;
                    }
                    if (var7 == 5 && this.field1293 == 0 && this.field1529 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method204(4, this.field1465[var5], -1765, var8, 8388608);
                        }
                        ++var4;
                    }
                    if (var7 == 6 && this.field1293 == 0 && this.field1529 < 2) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method204(4, "To " + var9 + ":", -1765, var8, 0);
                            var3.method204(12 + var3.method202("To " + var9, 5), this.field1465[var5], -1765, var8, 8388608);
                        }
                        ++var4;
                    }
                    if (var7 == 8 && (this.field1269 == 0 || this.field1269 == 1 && this.method430(2, var9))) {
                        if (var8 > 0 && var8 < 110) {
                            var3.method204(4, var9 + " " + this.field1465[var5], -1765, var8, 8270336);
                        }
                        ++var4;
                    }
                }
            }
            Pix2D.method152(false);
            this.field1460 = var4 * 14 + 7;
            if (this.field1460 < 78) {
                this.field1460 = 78;
            }
            this.method502(this.field1460, 0, 463, this.field1460 - this.field1475 - 77, 77, 223);
            String var6;
            if (field1278 != null && field1278.field458 != null) {
                var6 = field1278.field458;
            } else {
                var6 = JString.method300((byte) 81, this.field1597);
            }
            var3.method204(4, var6 + ":", -1765, 90, 0);
            var3.method204(6 + var3.method202(var6 + ": ", 5), this.field1629 + "*", -1765, 90, 255);
            Pix2D.method159(77, 0, 479, 0, 0);
        }
        if (this.field1523 && this.field1448 == 2) {
            this.method498(185);
        }
        this.field1510.method255(super.field13, 17, 0, 357);
        this.field1509.method254(979);
        Pix3D.field645 = this.field1560;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method542(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1332 = "";
                this.field1333 = "Connecting to server...";
                this.method472(true, true);
            }
            this.field1399 = new ClientStream(this, this.method512(field1307 + 43594), (byte) -14);
            long var4 = JString.method296(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field1444.field708 = 0;
            this.field1444.method215(14);
            this.field1444.method215(var6);
            this.field1399.method42(0, this.field1444.field707, 190, 2);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field1399.method39();
            }
            int var8 = this.field1399.method39();
            if (var8 == 0) {
                this.field1399.method41(this.field1470.field707, 0, 8);
                this.field1470.field708 = 0;
                this.field1434 = this.field1470.method231(false);
                int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1434 >> 32), (int) this.field1434 };
                this.field1444.field708 = 0;
                this.field1444.method215(10);
                this.field1444.method219(var9[0]);
                this.field1444.method219(var9[1]);
                this.field1444.method219(var9[2]);
                this.field1444.method219(var9[3]);
                this.field1444.method219(signlink.uid);
                this.field1444.method222(arg0);
                this.field1444.method222(arg1);
                this.field1444.method240(field1217, field1210, 0);
                this.field1579.field708 = 0;
                if (arg2) {
                    this.field1579.method215(18);
                } else {
                    this.field1579.method215(16);
                }
                this.field1579.method215(this.field1444.field708 + 36 + 1 + 1 + 2);
                this.field1579.method215(255);
                this.field1579.method216(282);
                this.field1579.method215(field1309 ? 1 : 0);
                for (int var10 = 0; var10 < 9; ++var10) {
                    this.field1579.method219(this.field1627[var10]);
                }
                this.field1579.method223(this.field1444.field707, 699, 0, this.field1444.field708);
                this.field1444.field712 = new Isaac(var9, this.field1396);
                for (int var11 = 0; var11 < 4; ++var11) {
                    var9[var11] += 50;
                }
                this.field1375 = new Isaac(var9, this.field1396);
                this.field1399.method42(0, this.field1579.field707, 190, this.field1579.field708);
                var8 = this.field1399.method39();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var21) {
                }
                this.method542(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field1458 = this.field1399.method39();
                field1345 = this.field1399.method39() == 1;
                this.field1237 = 0L;
                this.field1405 = 0;
                this.field1274.field986 = 0;
                super.field18 = true;
                this.field1216 = true;
                this.field1578 = true;
                this.field1444.field708 = 0;
                this.field1470.field708 = 0;
                this.field1411 = -1;
                this.field1238 = -1;
                this.field1239 = -1;
                this.field1240 = -1;
                this.field1410 = 0;
                this.field1412 = 0;
                this.field1633 = 0;
                this.field1414 = 0;
                this.field1404 = 0;
                this.field1254 = 0;
                this.field1523 = false;
                super.field19 = 0;
                for (int var12 = 0; var12 < 100; ++var12) {
                    this.field1465[var12] = null;
                }
                this.field1439 = 0;
                this.field1368 = 0;
                this.field1493 = 0;
                this.field1326 = 0;
                this.field1261 = (int) (Math.random() * 100.0D) - 50;
                this.field1466 = (int) (Math.random() * 110.0D) - 55;
                this.field1481 = (int) (Math.random() * 80.0D) - 40;
                this.field1473 = (int) (Math.random() * 120.0D) - 60;
                this.field1324 = (int) (Math.random() * 30.0D) - 20;
                this.field1589 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1336 = 0;
                this.field1212 = -1;
                this.field1275 = 0;
                this.field1276 = 0;
                this.field1349 = 0;
                this.field1604 = 0;
                for (int var13 = 0; var13 < this.field1346; ++var13) {
                    this.field1348[var13] = null;
                    this.field1353[var13] = null;
                }
                for (int var14 = 0; var14 < 16384; ++var14) {
                    this.field1603[var14] = null;
                }
                field1278 = this.field1348[this.field1347] = new PlayerEntity();
                this.field1426.method248();
                this.field1255.method248();
                for (int var15 = 0; var15 < 4; ++var15) {
                    for (int var16 = 0; var16 < 104; ++var16) {
                        for (int var17 = 0; var17 < 104; ++var17) {
                            this.field1628[var15][var16][var17] = null;
                        }
                    }
                }
                this.field1611 = new LinkList(false);
                this.field1243 = 0;
                this.field1242 = 0;
                this.field1288 = -1;
                this.field1601 = -1;
                this.field1617 = -1;
                this.field1599 = -1;
                this.field1398 = -1;
                this.field1502 = false;
                this.field1438 = 3;
                this.field1638 = false;
                this.field1523 = false;
                this.field1215 = false;
                this.field1456 = null;
                this.field1354 = 0;
                this.field1374 = -1;
                this.field1462 = true;
                this.method539(-346);
                for (int var18 = 0; var18 < 5; ++var18) {
                    this.field1295[var18] = 0;
                }
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field1561[var19] = null;
                    this.field1562[var19] = false;
                }
                field1279 = 0;
                field1424 = 0;
                field1221 = 0;
                field1535 = 0;
                field1272 = 0;
                field1390 = 0;
                field1222 = 0;
                field1355 = 0;
                field1258 = 0;
                field1316 = 0;
                this.method478((byte) 9);
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
                this.field1578 = true;
                this.field1444.field708 = 0;
                this.field1470.field708 = 0;
                this.field1411 = -1;
                this.field1238 = -1;
                this.field1239 = -1;
                this.field1240 = -1;
                this.field1410 = 0;
                this.field1412 = 0;
                this.field1633 = 0;
                this.field1254 = 0;
                this.field1523 = false;
                this.field1549 = System.currentTimeMillis();
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
                for (int var20 = this.field1399.method39(); var20 >= 0; --var20) {
                    this.field1332 = "You have only just left another world";
                    this.field1333 = "Your profile will be transferred in: " + var20 + " seconds";
                    this.method472(true, true);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var22) {
                    }
                }
                this.method542(arg0, arg1, arg2);
            }
        } catch (IOException var23) {
            this.field1332 = "";
            this.field1333 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(JI)V")
    public final void method543(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field1313 >= 100) {
                this.method544(this.field1234, "", "Your ignore list is full. Max of 100 hit", 0);
            } else {
                String var4 = JString.method300((byte) 81, JString.method297((byte) 3, arg0));
                if (arg1 < 0) {
                    for (int var5 = 0; var5 < this.field1313; ++var5) {
                        if (this.field1618[var5] == arg0) {
                            this.method544(this.field1234, "", var4 + " is already on your ignore list", 0);
                            return;
                        }
                    }
                    for (int var6 = 0; var6 < this.field1242; ++var6) {
                        if (this.field1403[var6] == arg0) {
                            this.method544(this.field1234, "", "Please remove " + var4 + " from your friend list first", 0);
                            return;
                        }
                    }
                    this.field1618[this.field1313++] = arg0;
                    this.field1572 = true;
                    this.field1444.method214(255, 0);
                    this.field1444.method221(9, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;I)V")
    public final void method544(byte arg0, String arg1, String arg2, int arg3) {
        if (arg0 == 4) {
            if (arg3 == 0 && this.field1288 != -1) {
                this.field1456 = arg2;
                super.field27 = 0;
            }
            if (this.field1601 == -1) {
                this.field1389 = true;
            }
            for (int var5 = 99; var5 > 0; --var5) {
                this.field1463[var5] = this.field1463[var5 - 1];
                this.field1464[var5] = this.field1464[var5 - 1];
                this.field1465[var5] = this.field1465[var5 - 1];
            }
            this.field1463[0] = arg3;
            this.field1464[0] = arg1;
            this.field1465[0] = arg2;
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method545(int arg0) {
        if (this.field1633 > 1) {
            --this.field1633;
        }
        if (this.field1414 > 0) {
            --this.field1414;
        }
        for (int var2 = 0; var2 < 5 && this.method497((byte) -2); ++var2) {
        }
        if (this.field1578) {
            Object var3 = this.field1274.field985;
            synchronized (this.field1274.field985) {
                if (!field1345) {
                    this.field1274.field986 = 0;
                } else if (super.field27 != 0 || this.field1274.field986 >= 40) {
                    this.field1444.method214(222, 0);
                    this.field1444.method215(0);
                    int var4 = this.field1444.field708;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field1274.field986 && var4 - this.field1444.field708 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field1274.field988[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field1274.field987[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field1274.field988[var6] == -1 && this.field1274.field987[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field1639 == var8 && this.field1640 == var7) {
                            if (this.field1405 < 2047) {
                                ++this.field1405;
                            }
                        } else {
                            int var10 = var8 - this.field1639;
                            this.field1639 = var8;
                            int var11 = var7 - this.field1640;
                            this.field1640 = var7;
                            if (this.field1405 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field1444.method216((this.field1405 << 12) + (var10 << 6) + var11);
                                this.field1405 = 0;
                            } else if (this.field1405 < 8) {
                                this.field1444.method218((this.field1405 << 19) + 8388608 + var9);
                                this.field1405 = 0;
                            } else {
                                this.field1444.method219((this.field1405 << 19) + -1073741824 + var9);
                                this.field1405 = 0;
                            }
                        }
                    }
                    this.field1444.method224(this.field1444.field708 - var4, false);
                    if (var5 >= this.field1274.field986) {
                        this.field1274.field986 = 0;
                    } else {
                        this.field1274.field986 -= var5;
                        for (int var12 = 0; var12 < this.field1274.field986; ++var12) {
                            this.field1274.field987[var12] = this.field1274.field987[var5 + var12];
                            this.field1274.field988[var12] = this.field1274.field988[var5 + var12];
                        }
                    }
                }
            }
            if (super.field27 != 0) {
                long var13 = (super.field30 - this.field1237) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field1237 = super.field30;
                int var15 = super.field29;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field28;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field27 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field1444.method214(20, 0);
                this.field1444.method219((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field1393 > 0) {
                --this.field1393;
            }
            if (super.field31[1] == 1 || super.field31[2] == 1 || super.field31[3] == 1 || super.field31[4] == 1) {
                this.field1394 = true;
            }
            if (this.field1394 && this.field1393 <= 0) {
                this.field1393 = 20;
                this.field1394 = false;
                this.field1444.method214(53, 0);
                this.field1444.method216(this.field1588);
                this.field1444.method216(this.field1589);
            }
            if (super.field18 && !this.field1216) {
                this.field1216 = true;
                this.field1444.method214(73, 0);
                this.field1444.method215(1);
            }
            if (!super.field18 && this.field1216) {
                this.field1216 = false;
                this.field1444.method214(73, 0);
                this.field1444.method215(0);
            }
            this.method469(true);
            this.method493((byte) 22);
            this.method467(9);
            ++this.field1412;
            if (this.field1412 > 750) {
                this.method510((byte) -31);
            }
            this.method441(759);
            this.method449(0);
            this.method538(8);
            ++this.field1312;
            if (this.field1321 != 0) {
                this.field1320 += 20;
                if (this.field1320 >= 400) {
                    this.field1321 = 0;
                }
            }
            if (this.field1622 != 0) {
                ++this.field1619;
                if (this.field1619 >= 15) {
                    if (this.field1622 == 2) {
                        this.field1572 = true;
                    }
                    if (this.field1622 == 3) {
                        this.field1389 = true;
                    }
                    this.field1622 = 0;
                }
            }
            if (this.field1532 != 0) {
                ++this.field1555;
                if (super.field21 > this.field1533 + 5 || super.field21 < this.field1533 - 5 || super.field22 > this.field1534 + 5 || super.field22 < this.field1534 - 5) {
                    this.field1499 = true;
                }
                if (super.field20 == 0) {
                    if (this.field1532 == 2) {
                        this.field1572 = true;
                    }
                    if (this.field1532 == 3) {
                        this.field1389 = true;
                    }
                    this.field1532 = 0;
                    if (this.field1499 && this.field1555 >= 5) {
                        this.field1548 = -1;
                        this.method499(true);
                        if (this.field1548 == this.field1530 && this.field1547 != this.field1531) {
                            Component var20 = Component.field68[this.field1530];
                            byte var21 = 0;
                            if (this.field1436 == 1 && var20.field77 == 206) {
                                var21 = 1;
                            }
                            if (var20.field69[this.field1547] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field98) {
                                int var22 = this.field1531;
                                int var23 = this.field1547;
                                var20.field69[var23] = var20.field69[var22];
                                var20.field70[var23] = var20.field70[var22];
                                var20.field69[var22] = -1;
                                var20.field70[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field1531;
                                int var25 = this.field1547;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method33(var24, var24 - 1, this.field1292);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method33(var24, var24 + 1, this.field1292);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method33(this.field1531, this.field1547, this.field1292);
                            }
                            this.field1444.method214(93, 0);
                            this.field1444.method216(this.field1530);
                            this.field1444.method216(this.field1531);
                            this.field1444.method216(this.field1547);
                            this.field1444.method215(var21);
                        }
                    } else if ((this.field1576 == 1 || this.method496(-29317, this.field1254 - 1)) && this.field1254 > 2) {
                        this.method554(0);
                    } else if (this.field1254 > 0) {
                        this.method546(this.field1254 - 1, false);
                    }
                    this.field1619 = 10;
                    super.field27 = 0;
                }
            }
            ++field1297;
            if (field1297 > 62) {
                field1297 = 0;
                this.field1444.method214(89, 0);
            }
            if (World3D.field315 != -1) {
                int var26 = World3D.field315;
                int var27 = World3D.field316;
                boolean var28 = this.method508(true, 0, field1278.field448[0], 0, field1278.field447[0], 0, var26, 0, var27, 0, 0, true);
                World3D.field315 = -1;
                if (var28) {
                    this.field1318 = super.field28;
                    this.field1319 = super.field29;
                    this.field1321 = 1;
                    this.field1320 = 0;
                }
            }
            if (super.field27 == 1 && this.field1456 != null) {
                this.field1456 = null;
                this.field1389 = true;
                super.field27 = 0;
            }
            this.method488((byte) 51);
            this.method426(false);
            this.method550(this.field1520);
            this.method487((byte) -116);
            if (super.field20 == 1 || super.field27 == 1) {
                ++this.field1492;
            }
            if (this.field1493 == 2) {
                this.method444(4974);
            }
            if (this.field1493 == 2 && this.field1358) {
                this.method518(-810);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field1484[var29]++;
            }
            this.method427(0);
            ++super.field19;
            if (super.field19 > 4500) {
                this.field1414 = 250;
                super.field19 -= 500;
                this.field1444.method214(209, 0);
            }
            ++this.field1214;
            if (this.field1214 > 500) {
                this.field1214 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field1261 += this.field1262;
                }
                if ((var30 & 2) == 2) {
                    this.field1466 += this.field1467;
                }
                if ((var30 & 4) == 4) {
                    this.field1481 += this.field1482;
                }
            }
            if (this.field1261 < -50) {
                this.field1262 = 2;
            }
            if (this.field1261 > 50) {
                this.field1262 = -2;
            }
            if (this.field1466 < -55) {
                this.field1467 = 2;
            }
            if (this.field1466 > 55) {
                this.field1467 = -2;
            }
            if (this.field1481 < -40) {
                this.field1482 = 1;
            }
            if (this.field1481 > 40) {
                this.field1482 = -1;
            }
            ++this.field1525;
            if (arg0 != 7) {
                this.field1411 = this.field1470.method225();
            }
            if (this.field1525 > 500) {
                this.field1525 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field1473 += this.field1474;
                }
                if ((var31 & 2) == 2) {
                    this.field1324 += this.field1325;
                }
            }
            if (this.field1473 < -60) {
                this.field1474 = 2;
            }
            if (this.field1473 > 60) {
                this.field1474 = -2;
            }
            if (this.field1324 < -20) {
                this.field1325 = 1;
            }
            if (this.field1324 > 10) {
                this.field1325 = -1;
            }
            ++this.field1413;
            if (this.field1413 > 50) {
                this.field1444.method214(120, 0);
            }
            try {
                if (this.field1399 != null && this.field1444.field708 > 0) {
                    this.field1399.method42(0, this.field1444.field707, 190, this.field1444.field708);
                    this.field1444.field708 = 0;
                    this.field1413 = 0;
                }
            } catch (IOException var33) {
                this.method510((byte) -31);
            } catch (Exception var34) {
                this.method479(184);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)V")
    public final void method546(int arg0, boolean arg1) {
        if (arg1) {
            this.field1628 = null;
        }
        if (arg0 >= 0) {
            if (this.field1638) {
                this.field1638 = false;
                this.field1389 = true;
            }
            int var3 = this.field1606[arg0];
            int var4 = this.field1607[arg0];
            int var5 = this.field1608[arg0];
            int var6 = this.field1609[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 1381) {
                int var7 = var6 >> 14 & 32767;
                LocType var8 = LocType.method326(var7);
                String var9;
                if (var8.field950 != null) {
                    var9 = new String(var8.field950);
                } else {
                    var9 = "It's a " + var8.field949 + ".";
                }
                this.method544(this.field1234, "", var9, 0);
            }
            if (var5 == 111) {
                boolean var10 = this.method508(false, 0, field1278.field448[0], 0, field1278.field447[0], 0, var3, 0, var4, 0, 2, true);
                if (!var10) {
                    this.method508(false, 0, field1278.field448[0], 1, field1278.field447[0], 0, var3, 1, var4, 0, 2, true);
                }
                this.field1318 = super.field28;
                this.field1319 = super.field29;
                this.field1321 = 2;
                this.field1320 = 0;
                this.field1444.method214(39, 0);
                this.field1444.method216(this.field1359 + var3);
                this.field1444.method216(this.field1360 + var4);
                this.field1444.method216(var6);
                this.field1444.method216(this.field1442);
                this.field1444.method216(this.field1440);
                this.field1444.method216(this.field1441);
            }
            if (var5 == 718) {
                if (!this.field1523) {
                    this.field1536.method88(super.field29 - 4, 0, super.field28 - 4);
                } else {
                    this.field1536.method88(var4 - 4, 0, var3 - 4);
                }
            }
            if (var5 == 507 || var5 == 957) {
                String var12 = this.field1402[arg0];
                int var13 = var12.indexOf("@whi@");
                if (var13 != -1) {
                    String var14 = var12.substring(var13 + 5).trim();
                    String var15 = JString.method300((byte) 81, JString.method297((byte) 3, JString.method296(var14)));
                    boolean var16 = false;
                    for (int var17 = 0; var17 < this.field1349; ++var17) {
                        PlayerEntity var18 = this.field1348[this.field1350[var17]];
                        if (var18 != null && var18.field458 != null && var18.field458.equalsIgnoreCase(var15)) {
                            this.method508(false, 0, field1278.field448[0], 1, field1278.field447[0], 0, var18.field447[0], 1, var18.field448[0], 0, 2, true);
                            if (var5 == 507) {
                                field1272 += var6;
                                if (field1272 >= 66) {
                                    this.field1444.method214(235, 0);
                                    this.field1444.method215(154);
                                }
                                this.field1444.method214(98, 0);
                            }
                            if (var5 == 957) {
                                ++field1535;
                                if (field1535 >= 52) {
                                    this.field1444.method214(80, 0);
                                    this.field1444.method215(131);
                                }
                                this.field1444.method214(109, 0);
                            }
                            this.field1444.method216(this.field1350[var17]);
                            var16 = true;
                            break;
                        }
                    }
                    if (!var16) {
                        this.method544(this.field1234, "", "Unable to find " + var15, 0);
                    }
                }
            }
            if (var5 == 899 && this.method475(213, var3, 0, var6, var4)) {
                this.field1444.method216(this.field1369);
            }
            if (var5 == 1714) {
                NpcEntity var19 = this.field1603[var6];
                if (var19 != null) {
                    String var20;
                    if (var19.field455.field998 != null) {
                        var20 = new String(var19.field455.field998);
                    } else {
                        var20 = "It's a " + var19.field455.field997 + ".";
                    }
                    this.method544(this.field1234, "", var20, 0);
                }
            }
            if (var5 == 435) {
                this.field1444.method214(9, 0);
                this.field1444.method216(var4);
                Component var21 = Component.field68[var4];
                if (var21.field83 != null && var21.field83[0][0] == 5) {
                    int var22 = var21.field83[0][1];
                    this.field1577[var22] = 1 - this.field1577[var22];
                    this.method437(var22, false);
                    this.field1572 = true;
                }
            }
            if (var5 == 225) {
                this.field1444.method214(9, 0);
                this.field1444.method216(var4);
                Component var23 = Component.field68[var4];
                if (var23.field83 != null && var23.field83[0][0] == 5) {
                    int var24 = var23.field83[0][1];
                    if (this.field1577[var24] != var23.field85[0]) {
                        this.field1577[var24] = var23.field85[0];
                        this.method437(var24, false);
                        this.field1572 = true;
                    }
                }
            }
            if (var5 == 582 || var5 == 113 || var5 == 555 || var5 == 331 || var5 == 354) {
                if (var5 == 113) {
                    this.field1444.method214(82, 0);
                }
                if (var5 == 331) {
                    this.field1444.method214(179, 0);
                }
                if (var5 == 354) {
                    this.field1444.method214(46, 0);
                }
                if (var5 == 582) {
                    if ((var6 & 3) == 0) {
                        ++field1390;
                    }
                    if (field1390 >= 133) {
                        this.field1444.method214(250, 0);
                        this.field1444.method216(6118);
                    }
                    this.field1444.method214(74, 0);
                }
                if (var5 == 555) {
                    this.field1444.method214(239, 0);
                }
                this.field1444.method216(var6);
                this.field1444.method216(var3);
                this.field1444.method216(var4);
                this.field1619 = 0;
                this.field1620 = var4;
                this.field1621 = var3;
                this.field1622 = 2;
                if (Component.field68[var4].field74 == this.field1617) {
                    this.field1622 = 1;
                }
                if (Component.field68[var4].field74 == this.field1601) {
                    this.field1622 = 3;
                }
            }
            if (var5 == 357) {
                this.method475(157, var3, 0, var6, var4);
            }
            if (var5 == 1152) {
                ObjType var25 = ObjType.method342(var6);
                String var26;
                if (var25.field1035 != null) {
                    var26 = new String(var25.field1035);
                } else {
                    var26 = "It's a " + var25.field1034 + ".";
                }
                this.method544(this.field1234, "", var26, 0);
            }
            if (var5 == 139 || var5 == 778 || var5 == 617 || var5 == 224 || var5 == 662) {
                boolean var27 = this.method508(false, 0, field1278.field448[0], 0, field1278.field447[0], 0, var3, 0, var4, 0, 2, true);
                if (!var27) {
                    this.method508(false, 0, field1278.field448[0], 1, field1278.field447[0], 0, var3, 1, var4, 0, 2, true);
                }
                this.field1318 = super.field28;
                this.field1319 = super.field29;
                this.field1321 = 2;
                this.field1320 = 0;
                if (var5 == 617) {
                    this.field1444.method214(108, 0);
                }
                if (var5 == 224) {
                    field1355 += var4;
                    if (field1355 >= 75) {
                        this.field1444.method214(0, 0);
                        this.field1444.method215(19);
                    }
                    this.field1444.method214(62, 0);
                }
                if (var5 == 139) {
                    if ((var3 & 3) == 0) {
                        ++field1222;
                    }
                    if (field1222 >= 123) {
                        this.field1444.method214(25, 0);
                        this.field1444.method219(0);
                    }
                    this.field1444.method214(247, 0);
                }
                if (var5 == 778) {
                    this.field1444.method214(169, 0);
                }
                if (var5 == 662) {
                    field1221 += this.field1360;
                    if (field1221 >= 118) {
                        this.field1444.method214(41, 0);
                        this.field1444.method219(0);
                    }
                    this.field1444.method214(117, 0);
                }
                this.field1444.method216(this.field1359 + var3);
                this.field1444.method216(this.field1360 + var4);
                this.field1444.method216(var6);
            }
            if (var5 == 639 || var5 == 499 || var5 == 27 || var5 == 387 || var5 == 185) {
                PlayerEntity var29 = this.field1348[var6];
                if (var29 != null) {
                    this.method508(false, 0, field1278.field448[0], 1, field1278.field447[0], 0, var29.field447[0], 1, var29.field448[0], 0, 2, true);
                    this.field1318 = super.field28;
                    this.field1319 = super.field29;
                    this.field1321 = 2;
                    this.field1320 = 0;
                    if (var5 == 499) {
                        this.field1444.method214(166, 0);
                    }
                    if (var5 == 185) {
                        this.field1444.method214(174, 0);
                    }
                    if (var5 == 27) {
                        this.field1444.method214(196, 0);
                    }
                    if (var5 == 387) {
                        field1272 += var6;
                        if (field1272 >= 66) {
                            this.field1444.method214(235, 0);
                            this.field1444.method215(154);
                        }
                        this.field1444.method214(98, 0);
                    }
                    if (var5 == 639) {
                        ++field1535;
                        if (field1535 >= 52) {
                            this.field1444.method214(80, 0);
                            this.field1444.method215(131);
                        }
                        this.field1444.method214(109, 0);
                    }
                    this.field1444.method216(var6);
                }
            }
            if (var5 == 625) {
                this.method475(215, var3, 0, var6, var4);
            }
            if (var5 == 810 && this.method475(60, var3, 0, var6, var4)) {
                this.field1444.method216(this.field1442);
                this.field1444.method216(this.field1440);
                this.field1444.method216(this.field1441);
            }
            if (var5 == 274) {
                Component var30 = Component.field68[var4];
                this.field1368 = 1;
                this.field1369 = var4;
                this.field1370 = var30.field128;
                this.field1439 = 0;
                this.field1572 = true;
                String var31 = var30.field126;
                if (var31.indexOf(" ") != -1) {
                    var31 = var31.substring(0, var31.indexOf(" "));
                }
                String var32 = var30.field126;
                if (var32.indexOf(" ") != -1) {
                    var32 = var32.substring(var32.indexOf(" ") + 1);
                }
                this.field1371 = var31 + " " + var30.field127 + " " + var32;
                if (this.field1370 == 16) {
                    this.field1572 = true;
                    this.field1438 = 3;
                    this.field1296 = true;
                }
            } else {
                if (var5 == 997 && !this.field1502) {
                    this.field1444.method214(72, 0);
                    this.field1444.method216(var4);
                    this.field1502 = true;
                }
                if (var5 == 829) {
                    NpcEntity var33 = this.field1603[var6];
                    if (var33 != null) {
                        this.method508(false, 0, field1278.field448[0], 1, field1278.field447[0], 0, var33.field447[0], 1, var33.field448[0], 0, 2, true);
                        this.field1318 = super.field28;
                        this.field1319 = super.field29;
                        this.field1321 = 2;
                        this.field1320 = 0;
                        this.field1444.method214(150, 0);
                        this.field1444.method216(var6);
                        this.field1444.method216(this.field1442);
                        this.field1444.method216(this.field1440);
                        this.field1444.method216(this.field1441);
                    }
                }
                if (var5 == 1328) {
                    ObjType var34 = ObjType.method342(var6);
                    Component var35 = Component.field68[var4];
                    String var36;
                    if (var35 != null && var35.field70[var3] >= 100000) {
                        var36 = var35.field70[var3] + " x " + var34.field1034;
                    } else if (var34.field1035 != null) {
                        var36 = new String(var34.field1035);
                    } else {
                        var36 = "It's a " + var34.field1034 + ".";
                    }
                    this.method544(this.field1234, "", var36, 0);
                }
                if (var5 == 902) {
                    String var37 = this.field1402[arg0];
                    int var38 = var37.indexOf("@whi@");
                    if (var38 != -1) {
                        long var39 = JString.method296(var37.substring(var38 + 5).trim());
                        int var41 = -1;
                        for (int var42 = 0; var42 < this.field1242; ++var42) {
                            if (this.field1403[var42] == var39) {
                                var41 = var42;
                                break;
                            }
                        }
                        if (var41 != -1 && this.field1655[var41] > 0) {
                            this.field1389 = true;
                            this.field1638 = false;
                            this.field1215 = true;
                            this.field1219 = "";
                            this.field1294 = 3;
                            this.field1447 = this.field1403[var41];
                            this.field1527 = "Enter message to send to " + this.field1524[var41];
                        }
                    }
                }
                if (var5 == 743) {
                    ++field1424;
                    if (field1424 >= 124) {
                        this.field1444.method214(201, 0);
                        this.field1444.method216(37954);
                    }
                    this.method475(187, var3, 0, var6, var4);
                }
                if (var5 == 524) {
                    String var43 = this.field1402[arg0];
                    int var44 = var43.indexOf("@whi@");
                    if (var44 != -1) {
                        if (this.field1617 == -1) {
                            this.method476(-364);
                            this.field1344 = var43.substring(var44 + 5).trim();
                            this.field1647 = false;
                            for (int var45 = 0; var45 < Component.field68.length; ++var45) {
                                if (Component.field68[var45] != null && Component.field68[var45].field77 == 600) {
                                    this.field1632 = this.field1617 = Component.field68[var45].field74;
                                    break;
                                }
                            }
                        } else {
                            this.method544(this.field1234, "", "Please close the interface you have open before using 'report abuse'", 0);
                        }
                    }
                }
                if (var5 == 605 || var5 == 47 || var5 == 513 || var5 == 884) {
                    String var46 = this.field1402[arg0];
                    int var47 = var46.indexOf("@whi@");
                    if (var47 != -1) {
                        long var48 = JString.method296(var46.substring(var47 + 5).trim());
                        if (var5 == 605) {
                            this.method443(var48, true);
                        }
                        if (var5 == 47) {
                            this.method543(var48, -589);
                        }
                        if (var5 == 513) {
                            this.method448(var48, 748);
                        }
                        if (var5 == 884) {
                            this.method531(var48, 0);
                        }
                    }
                }
                if (var5 == 398) {
                    this.field1444.method214(136, 0);
                    this.field1444.method216(var6);
                    this.field1444.method216(var3);
                    this.field1444.method216(var4);
                    this.field1444.method216(this.field1442);
                    this.field1444.method216(this.field1440);
                    this.field1444.method216(this.field1441);
                    this.field1619 = 0;
                    this.field1620 = var4;
                    this.field1621 = var3;
                    this.field1622 = 2;
                    if (Component.field68[var4].field74 == this.field1617) {
                        this.field1622 = 1;
                    }
                    if (Component.field68[var4].field74 == this.field1601) {
                        this.field1622 = 3;
                    }
                }
                if (var5 == 231) {
                    Component var50 = Component.field68[var4];
                    boolean var51 = true;
                    if (var50.field77 > 0) {
                        var51 = this.method535(var50, this.field1342);
                    }
                    if (var51) {
                        this.field1444.method214(9, 0);
                        this.field1444.method216(var4);
                    }
                }
                if (var5 == 242 || var5 == 209 || var5 == 309 || var5 == 852 || var5 == 793) {
                    NpcEntity var52 = this.field1603[var6];
                    if (var52 != null) {
                        this.method508(false, 0, field1278.field448[0], 1, field1278.field447[0], 0, var52.field447[0], 1, var52.field448[0], 0, 2, true);
                        this.field1318 = super.field28;
                        this.field1319 = super.field29;
                        this.field1321 = 2;
                        this.field1320 = 0;
                        if (var5 == 242) {
                            this.field1444.method214(236, 0);
                        }
                        if (var5 == 793) {
                            this.field1444.method214(189, 0);
                        }
                        if (var5 == 209) {
                            this.field1444.method214(233, 0);
                        }
                        if (var5 == 852) {
                            this.field1444.method214(147, 0);
                        }
                        if (var5 == 309) {
                            this.field1444.method214(223, 0);
                        }
                        this.field1444.method216(var6);
                    }
                }
                if (var5 == 102) {
                    this.field1439 = 1;
                    this.field1440 = var3;
                    this.field1441 = var4;
                    this.field1442 = var6;
                    this.field1443 = ObjType.method342(var6).field1034;
                    this.field1368 = 0;
                    this.field1572 = true;
                } else {
                    if (var5 == 275) {
                        PlayerEntity var53 = this.field1348[var6];
                        if (var53 != null) {
                            this.method508(false, 0, field1278.field448[0], 1, field1278.field447[0], 0, var53.field447[0], 1, var53.field448[0], 0, 2, true);
                            this.field1318 = super.field28;
                            this.field1319 = super.field29;
                            this.field1321 = 2;
                            this.field1320 = 0;
                            this.field1444.method214(36, 0);
                            this.field1444.method216(var6);
                            this.field1444.method216(this.field1442);
                            this.field1444.method216(this.field1440);
                            this.field1444.method216(this.field1441);
                        }
                    }
                    if (var5 == 131) {
                        PlayerEntity var54 = this.field1348[var6];
                        if (var54 != null) {
                            this.method508(false, 0, field1278.field448[0], 1, field1278.field447[0], 0, var54.field447[0], 1, var54.field448[0], 0, 2, true);
                            this.field1318 = super.field28;
                            this.field1319 = super.field29;
                            this.field1321 = 2;
                            this.field1320 = 0;
                            this.field1444.method214(240, 0);
                            this.field1444.method216(var6);
                            this.field1444.method216(this.field1369);
                        }
                    }
                    if (var5 == 563) {
                        this.field1444.method214(135, 0);
                        this.field1444.method216(var6);
                        this.field1444.method216(var3);
                        this.field1444.method216(var4);
                        this.field1444.method216(this.field1369);
                        this.field1619 = 0;
                        this.field1620 = var4;
                        this.field1621 = var3;
                        this.field1622 = 2;
                        if (Component.field68[var4].field74 == this.field1617) {
                            this.field1622 = 1;
                        }
                        if (Component.field68[var4].field74 == this.field1601) {
                            this.field1622 = 3;
                        }
                    }
                    if (var5 == 737) {
                        this.method476(-364);
                    }
                    if (var5 == 694 || var5 == 962 || var5 == 795 || var5 == 681 || var5 == 100) {
                        if (var5 == 681) {
                            ++field1258;
                            if (field1258 >= 116) {
                                this.field1444.method214(24, 0);
                                this.field1444.method218(13018169);
                            }
                            this.field1444.method214(216, 0);
                        }
                        if (var5 == 694) {
                            this.field1444.method214(185, 0);
                        }
                        if (var5 == 962) {
                            this.field1444.method214(2, 0);
                        }
                        if (var5 == 100) {
                            this.field1444.method214(42, 0);
                        }
                        if (var5 == 795) {
                            this.field1444.method214(123, 0);
                        }
                        this.field1444.method216(var6);
                        this.field1444.method216(var3);
                        this.field1444.method216(var4);
                        this.field1619 = 0;
                        this.field1620 = var4;
                        this.field1621 = var3;
                        this.field1622 = 2;
                        if (Component.field68[var4].field74 == this.field1617) {
                            this.field1622 = 1;
                        }
                        if (Component.field68[var4].field74 == this.field1601) {
                            this.field1622 = 3;
                        }
                    }
                    if (var5 == 1071) {
                        this.method475(127, var3, 0, var6, var4);
                    }
                    if (var5 == 240) {
                        NpcEntity var55 = this.field1603[var6];
                        if (var55 != null) {
                            this.method508(false, 0, field1278.field448[0], 1, field1278.field447[0], 0, var55.field447[0], 1, var55.field448[0], 0, 2, true);
                            this.field1318 = super.field28;
                            this.field1319 = super.field29;
                            this.field1321 = 2;
                            this.field1320 = 0;
                            this.field1444.method214(181, 0);
                            this.field1444.method216(var6);
                            this.field1444.method216(this.field1369);
                        }
                    }
                    if (var5 == 721) {
                        field1279 += var4;
                        if (field1279 >= 139) {
                            this.field1444.method214(219, 0);
                            this.field1444.method219(0);
                        }
                        this.method475(103, var3, 0, var6, var4);
                    }
                    if (var5 == 370) {
                        boolean var56 = this.method508(false, 0, field1278.field448[0], 0, field1278.field447[0], 0, var3, 0, var4, 0, 2, true);
                        if (!var56) {
                            this.method508(false, 0, field1278.field448[0], 1, field1278.field447[0], 0, var3, 1, var4, 0, 2, true);
                        }
                        this.field1318 = super.field28;
                        this.field1319 = super.field29;
                        this.field1321 = 2;
                        this.field1320 = 0;
                        this.field1444.method214(91, 0);
                        this.field1444.method216(this.field1359 + var3);
                        this.field1444.method216(this.field1360 + var4);
                        this.field1444.method216(var6);
                        this.field1444.method216(this.field1369);
                    }
                    this.field1439 = 0;
                    this.field1368 = 0;
                    this.field1572 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method547(int arg0) {
        if (arg0 != -19490) {
            this.field1411 = -1;
        }
        if (this.field1338 == 0) {
            int var2 = super.field11 / 2 - 80;
            int var3 = super.field12 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field27 == 1 && super.field28 >= var2 - 75 && super.field28 <= var2 + 75 && super.field29 >= var14 - 20 && super.field29 <= var14 + 20) {
                this.field1338 = 3;
                this.field1233 = 0;
            }
            int var4 = super.field11 / 2 + 80;
            if (super.field27 == 1 && super.field28 >= var4 - 75 && super.field28 <= var4 + 75 && super.field29 >= var14 - 20 && super.field29 <= var14 + 20) {
                this.field1332 = "";
                this.field1333 = "Enter your username & password.";
                this.field1338 = 2;
                this.field1233 = 0;
            }
        } else if (this.field1338 == 2) {
            int var5 = super.field12 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field27 == 1 && super.field29 >= var16 - 15 && super.field29 < var16) {
                this.field1233 = 0;
            }
            var5 = var16 + 15;
            if (super.field27 == 1 && super.field29 >= var5 - 15 && super.field29 < var5) {
                this.field1233 = 1;
            }
            var5 += 15;
            int var6 = super.field11 / 2 - 80;
            int var7 = super.field12 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field27 == 1 && super.field28 >= var6 - 75 && super.field28 <= var6 + 75 && super.field29 >= var17 - 20 && super.field29 <= var17 + 20) {
                this.method542(this.field1597, this.field1598, false);
                if (this.field1578) {
                    return;
                }
            }
            int var8 = super.field11 / 2 + 80;
            if (super.field27 == 1 && super.field28 >= var8 - 75 && super.field28 <= var8 + 75 && super.field29 >= var17 - 20 && super.field29 <= var17 + 20) {
                this.field1338 = 0;
                this.field1597 = "";
                this.field1598 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5(11545);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1506.length(); ++var11) {
                        if (var9 == field1506.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1233 == 0) {
                        if (var9 == 8 && this.field1597.length() > 0) {
                            this.field1597 = this.field1597.substring(0, this.field1597.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1233 = 1;
                        }
                        if (var10) {
                            this.field1597 = this.field1597 + (char) var9;
                        }
                        if (this.field1597.length() > 12) {
                            this.field1597 = this.field1597.substring(0, 12);
                        }
                    } else if (this.field1233 == 1) {
                        if (var9 == 8 && this.field1598.length() > 0) {
                            this.field1598 = this.field1598.substring(0, this.field1598.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1233 = 0;
                        }
                        if (var10) {
                            this.field1598 = this.field1598 + (char) var9;
                        }
                        if (this.field1598.length() > 20) {
                            this.field1598 = this.field1598.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1338 == 3) {
                int var12 = super.field11 / 2;
                int var13 = super.field12 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field27 == 1 && super.field28 >= var12 - 75 && super.field28 <= var12 + 75 && super.field29 >= var18 - 20 && super.field29 <= var18 + 20) {
                    this.field1338 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method548(boolean arg0, int arg1) {
        if (field1278.field397 >> 7 == this.field1275 && field1278.field398 >> 7 == this.field1276) {
            this.field1275 = 0;
            ++field1407;
            if (field1407 > 122) {
                field1407 = 0;
                this.field1444.method214(188, 0);
                this.field1444.method215(62);
            }
        }
        int var3 = this.field1349;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            PlayerEntity var5;
            int var6;
            if (arg0) {
                var5 = field1278;
                var6 = this.field1347 << 14;
            } else {
                var5 = this.field1348[this.field1350[var4]];
                var6 = this.field1350[var4] << 14;
            }
            if (var5 != null && var5.method113((byte) 121)) {
                var5.field478 = false;
                if ((field1309 && this.field1349 > 50 || this.field1349 > 200) && !arg0 && var5.field422 == var5.field402) {
                    var5.field478 = true;
                }
                int var7 = var5.field397 >> 7;
                int var8 = var5.field398 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field473 != null && field1330 >= var5.field468 && field1330 < var5.field469) {
                        var5.field478 = false;
                        var5.field467 = this.method474(var5.field398, var5.field397, -195, this.field1303);
                        this.field1536.method62(var5.field399, var6, var5.field477, var5.field474, var5.field467, 60, var5.field476, false, var5, var5.field398, this.field1303, var5.field475, var5.field397);
                    } else {
                        if ((var5.field397 & 127) == 64 && (var5.field398 & 127) == 64) {
                            if (this.field1373[var7][var8] == this.field1455) {
                                continue;
                            }
                            this.field1373[var7][var8] = this.field1455;
                        }
                        var5.field467 = this.method474(var5.field398, var5.field397, -195, this.field1303);
                        this.field1536.method61(var5.field467, var5.field397, var5.field399, this.field1303, var5, var6, var5.field400, 60, (byte) 33, var5.field398);
                    }
                }
            }
        }
        if (arg1 != 0) {
            field1329 = 388;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method549(byte arg0) {
        try {
            this.field1212 = -1;
            this.field1255.method248();
            this.field1426.method248();
            Pix3D.method166(7);
            this.method503(0);
            this.field1536.method50(4);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1235[var2].method353(-49006);
            }
            System.gc();
            World var3 = new World((byte) 113, this.field1490, this.field1422, 104, 104);
            int var4 = this.field1546.length;
            World.field42 = World3D.field281;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1580[var5] >> 8;
                int var7 = this.field1580[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field42 = false;
                }
            }
            if (World.field42) {
                this.field1536.method51(this.field1303, (byte) 47);
            } else {
                this.field1536.method51(0, (byte) 47);
            }
            this.field1444.method214(120, 0);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1580[var8] >> 8) * 64 - this.field1359;
                int var10 = (this.field1580[var8] & 255) * 64 - this.field1360;
                byte[] var11 = this.field1546[var8];
                if (var11 != null) {
                    var3.method15((this.field1594 - 6) * 8, var11, var9, (this.field1595 - 6) * 8, var10, 2);
                }
            }
            for (int var12 = 0; var12 < var4; ++var12) {
                int var13 = (this.field1580[var12] >> 8) * 64 - this.field1359;
                int var14 = (this.field1580[var12] & 255) * 64 - this.field1360;
                byte[] var15 = this.field1546[var12];
                if (var15 == null && this.field1595 < 800) {
                    var3.method14(var13, 64, 64, var14, this.field1554);
                }
            }
            this.field1444.method214(120, 0);
            for (int var16 = 0; var16 < var4; ++var16) {
                byte[] var17 = this.field1457[var16];
                if (var17 != null) {
                    int var18 = (this.field1580[var16] >> 8) * 64 - this.field1359;
                    int var19 = (this.field1580[var16] & 255) * 64 - this.field1360;
                    var3.method18(var18, var19, this.field1564, this.field1235, this.field1536, var17);
                }
            }
            this.field1444.method214(120, 0);
            var3.method20((byte) 59, this.field1536, this.field1235);
            this.field1509.method254(979);
            this.field1444.method214(120, 0);
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method517(var20, var21);
                }
            }
            this.method494((byte) 5);
        } catch (Exception var34) {
        }
        LocType.field980.method103();
        if (field1309 && signlink.cache_dat != null) {
            int var23 = this.field1459.method268(0, -833);
            for (int var24 = 0; var24 < var23; ++var24) {
                int var25 = this.field1459.method273(var24, 30455);
                if ((var25 & 121) == 0) {
                    Model.method124(var24, (byte) 81);
                }
            }
        }
        System.gc();
        Pix3D.method167((byte) -42, 20);
        if (arg0 != 45) {
            this.field1411 = -1;
        }
        this.field1459.method279((byte) -5);
        int var26 = (this.field1594 - 6) / 8 - 1;
        int var27 = (this.field1594 + 6) / 8 + 1;
        int var28 = (this.field1595 - 6) / 8 - 1;
        int var29 = (this.field1595 + 6) / 8 + 1;
        if (this.field1602) {
            var26 = 49;
            var27 = 50;
            var28 = 49;
            var29 = 50;
        }
        for (int var30 = var26; var30 <= var27; ++var30) {
            for (int var31 = var28; var31 <= var29; ++var31) {
                if (var26 == var30 || var27 == var30 || var28 == var31 || var29 == var31) {
                    int var32 = this.field1459.method270(0, var30, var31, true);
                    if (var32 != -1) {
                        this.field1459.method280(false, 3, var32);
                    }
                    int var33 = this.field1459.method270(1, var30, var31, true);
                    if (var33 != -1) {
                        this.field1459.method280(false, 3, var33);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method10(int arg0) {
        this.field1526 = true;
        if (arg0 < 0) {
            ;
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

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1656) {
            this.method521(field1218);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method550(int arg0) {
        if (arg0 != 0) {
            field1573 = true;
        }
        if (super.field27 == 1) {
            if (super.field28 >= 539 && super.field28 <= 573 && super.field29 >= 169 && super.field29 < 205 && this.field1341[0] != -1) {
                this.field1572 = true;
                this.field1438 = 0;
                this.field1296 = true;
            }
            if (super.field28 >= 569 && super.field28 <= 599 && super.field29 >= 168 && super.field29 < 205 && this.field1341[1] != -1) {
                this.field1572 = true;
                this.field1438 = 1;
                this.field1296 = true;
            }
            if (super.field28 >= 597 && super.field28 <= 627 && super.field29 >= 168 && super.field29 < 205 && this.field1341[2] != -1) {
                this.field1572 = true;
                this.field1438 = 2;
                this.field1296 = true;
            }
            if (super.field28 >= 625 && super.field28 <= 669 && super.field29 >= 168 && super.field29 < 203 && this.field1341[3] != -1) {
                this.field1572 = true;
                this.field1438 = 3;
                this.field1296 = true;
            }
            if (super.field28 >= 666 && super.field28 <= 696 && super.field29 >= 168 && super.field29 < 205 && this.field1341[4] != -1) {
                this.field1572 = true;
                this.field1438 = 4;
                this.field1296 = true;
            }
            if (super.field28 >= 694 && super.field28 <= 724 && super.field29 >= 168 && super.field29 < 205 && this.field1341[5] != -1) {
                this.field1572 = true;
                this.field1438 = 5;
                this.field1296 = true;
            }
            if (super.field28 >= 722 && super.field28 <= 756 && super.field29 >= 169 && super.field29 < 205 && this.field1341[6] != -1) {
                this.field1572 = true;
                this.field1438 = 6;
                this.field1296 = true;
            }
            if (super.field28 >= 540 && super.field28 <= 574 && super.field29 >= 466 && super.field29 < 502 && this.field1341[7] != -1) {
                this.field1572 = true;
                this.field1438 = 7;
                this.field1296 = true;
            }
            if (super.field28 >= 572 && super.field28 <= 602 && super.field29 >= 466 && super.field29 < 503 && this.field1341[8] != -1) {
                this.field1572 = true;
                this.field1438 = 8;
                this.field1296 = true;
            }
            if (super.field28 >= 599 && super.field28 <= 629 && super.field29 >= 466 && super.field29 < 503 && this.field1341[9] != -1) {
                this.field1572 = true;
                this.field1438 = 9;
                this.field1296 = true;
            }
            if (super.field28 >= 627 && super.field28 <= 671 && super.field29 >= 467 && super.field29 < 502 && this.field1341[10] != -1) {
                this.field1572 = true;
                this.field1438 = 10;
                this.field1296 = true;
            }
            if (super.field28 >= 669 && super.field28 <= 699 && super.field29 >= 466 && super.field29 < 503 && this.field1341[11] != -1) {
                this.field1572 = true;
                this.field1438 = 11;
                this.field1296 = true;
            }
            if (super.field28 >= 696 && super.field28 <= 726 && super.field29 >= 466 && super.field29 < 503 && this.field1341[12] != -1) {
                this.field1572 = true;
                this.field1438 = 12;
                this.field1296 = true;
            }
            if (super.field28 >= 724 && super.field28 <= 758 && super.field29 >= 466 && super.field29 < 502 && this.field1341[13] != -1) {
                this.field1572 = true;
                this.field1438 = 13;
                this.field1296 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public final void method551(int arg0) {
        if (this.field1254 >= 2 || this.field1439 != 0 || this.field1368 != 0) {
            String var2;
            if (this.field1439 == 1 && this.field1254 < 2) {
                var2 = "Use " + this.field1443 + " with...";
            } else if (this.field1368 == 1 && this.field1254 < 2) {
                var2 = this.field1371 + "...";
            } else {
                var2 = this.field1402[this.field1254 - 1];
            }
            if (this.field1254 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1254 - 2) + " more options";
            }
            this.field1645.method207(var2, 16777215, 15, true, field1330 / 1000, 4, false);
            if (arg0 <= 0) {
                field1322 = !field1322;
            }
        }
    }

    @OriginalMember(owner = "client", name = "N", descriptor = "(I)V")
    public final void method552(int arg0) {
        this.field1410 += arg0;
        while (true) {
            OnDemandRequest var2 = this.field1459.method277();
            if (var2 == null) {
                return;
            }
            if (var2.field721 == 0) {
                Model.method123(false, var2.field722, var2.field723);
                if ((this.field1459.method273(var2.field722, 30455) & 98) != 0) {
                    this.field1572 = true;
                    if (this.field1601 != -1) {
                        this.field1389 = true;
                    }
                }
            }
            if (var2.field721 == 1 && var2.field723 != null) {
                AnimFrame.method45(-635, var2.field723);
            }
            if (var2.field721 == 2 && this.field1623 == var2.field722 && var2.field723 != null) {
                this.method428(this.field1498, var2.field723, this.field1624);
            }
            if (var2.field721 == 3 && this.field1493 == 1) {
                for (int var3 = 0; var3 < this.field1546.length; ++var3) {
                    if (this.field1581[var3] == var2.field722) {
                        this.field1546[var3] = var2.field723;
                        if (var2.field723 == null) {
                            this.field1581[var3] = -1;
                        }
                        break;
                    }
                    if (this.field1582[var3] == var2.field722) {
                        this.field1457[var3] = var2.field723;
                        if (var2.field723 == null) {
                            this.field1582[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field721 == 93 && this.field1459.method272(5, var2.field722)) {
                World.method17(new Packet(var2.field723, 185), -936, this.field1459);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lib;III)V")
    public final void method553(Pix32 arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1589 + this.field1473 & 2047;
        if (arg1 != 0) {
            this.method6();
        }
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = Model.field601[var5];
            int var8 = Model.field602[var5];
            int var9 = var7 * 256 / (this.field1324 + 256);
            int var10 = var8 * 256 / (this.field1324 + 256);
            int var11 = arg2 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg2 * var9 >> 16;
            if (var6 > 2500) {
                arg0.method191(var11 + 94 - arg0.field668 / 2 + 4, (byte) 0, 83 - var12 - arg0.field669 / 2 - 4, this.field1380);
            } else {
                arg0.method185(var11 + 94 - arg0.field668 / 2 + 4, (byte) 1, 83 - var12 - arg0.field669 / 2 - 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "O", descriptor = "(I)V")
    public final void method554(int arg0) {
        int var2 = this.field1645.method202("Choose Option", 5);
        for (int var3 = 0; var3 < this.field1254; ++var3) {
            int var11 = this.field1645.method202(this.field1402[var3], 5);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field1254 * 15 + 21;
        if (arg0 != 0) {
            this.field1628 = null;
        }
        if (super.field28 > 4 && super.field29 > 4 && super.field28 < 516 && super.field29 < 338) {
            int var5 = super.field28 - 4 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field29 - 4;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field1523 = true;
            this.field1448 = 0;
            this.field1449 = var5;
            this.field1450 = var6;
            this.field1451 = var2;
            this.field1452 = this.field1254 * 15 + 22;
        }
        if (super.field28 > 553 && super.field29 > 205 && super.field28 < 743 && super.field29 < 466) {
            int var7 = super.field28 - 553 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field29 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field1523 = true;
            this.field1448 = 1;
            this.field1449 = var7;
            this.field1450 = var8;
            this.field1451 = var2;
            this.field1452 = this.field1254 * 15 + 22;
        }
        if (super.field28 > 17 && super.field29 > 357 && super.field28 < 496 && super.field29 < 453) {
            int var9 = super.field28 - 17 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field29 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field1523 = true;
            this.field1448 = 2;
            this.field1449 = var9;
            this.field1450 = var10;
            this.field1451 = var2;
            this.field1452 = this.field1254 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;IIII)V")
    public final void method555(Component arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.field75 == 0 && arg0.field90 != null) {
            if (!arg0.field89 || this.field1286 == arg0.field73 || this.field1268 == arg0.field73 || this.field1315 == arg0.field73) {
                int var6 = Pix2D.field625;
                int var7 = Pix2D.field623;
                int var8 = Pix2D.field626;
                int var9 = Pix2D.field624;
                Pix2D.method153(arg3, arg4, arg0.field78 + arg4, arg0.field79 + arg3, 297);
                int var10 = arg0.field90.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var13 = arg0.field91[var11] + arg4;
                    int var14 = arg0.field92[var11] + arg3 - arg2;
                    Component var15 = Component.field68[arg0.field90[var11]];
                    int var16 = var15.field81 + var13;
                    int var17 = var15.field82 + var14;
                    if (var15.field77 > 0) {
                        this.method424(606, var15);
                    }
                    if (var15.field75 == 0) {
                        if (var15.field88 > var15.field87 - var15.field79) {
                            var15.field88 = var15.field87 - var15.field79;
                        }
                        if (var15.field88 < 0) {
                            var15.field88 = 0;
                        }
                        this.method555(var15, 2712, var15.field88, var17, var16);
                        if (var15.field87 > var15.field79) {
                            this.method502(var15.field87, var17, var15.field78 + var16, var15.field88, var15.field79, 223);
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
                                                var31.method185(var21, (byte) 1, var22);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field69[var18] - 1;
                                        if (var21 > Pix2D.field625 - 32 && var21 < Pix2D.field626 && var22 > Pix2D.field623 - 32 && var22 < Pix2D.field624 || this.field1532 != 0 && this.field1531 == var18) {
                                            int var26 = 0;
                                            if (this.field1439 == 1 && this.field1440 == var18 && this.field1441 == var15.field73) {
                                                var26 = 16777215;
                                            }
                                            Pix32 var27 = ObjType.method348(var15.field70[var18], var25, var26, (byte) 3);
                                            if (var27 != null) {
                                                if (this.field1532 != 0 && this.field1531 == var18 && this.field1530 == var15.field73) {
                                                    var23 = super.field21 - this.field1533;
                                                    var24 = super.field22 - this.field1534;
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 5 && var24 > -5) {
                                                        var24 = 0;
                                                    }
                                                    if (this.field1555 < 5) {
                                                        var23 = 0;
                                                        var24 = 0;
                                                    }
                                                    var27.method187(128, var21 + var23, var22 + var24, -6626);
                                                    if (var22 + var24 < Pix2D.field623 && arg0.field88 > 0) {
                                                        int var28 = (Pix2D.field623 - var22 - var24) * this.field1312 / 3;
                                                        if (var28 > this.field1312 * 10) {
                                                            var28 = this.field1312 * 10;
                                                        }
                                                        if (var28 > arg0.field88) {
                                                            var28 = arg0.field88;
                                                        }
                                                        arg0.field88 -= var28;
                                                        this.field1534 += var28;
                                                    }
                                                    if (var22 + var24 + 32 > Pix2D.field624 && arg0.field88 < arg0.field87 - arg0.field79) {
                                                        int var29 = (var22 + var24 + 32 - Pix2D.field624) * this.field1312 / 3;
                                                        if (var29 > this.field1312 * 10) {
                                                            var29 = this.field1312 * 10;
                                                        }
                                                        if (var29 > arg0.field87 - arg0.field79 - arg0.field88) {
                                                            var29 = arg0.field87 - arg0.field79 - arg0.field88;
                                                        }
                                                        arg0.field88 += var29;
                                                        this.field1534 -= var29;
                                                    }
                                                } else if (this.field1622 != 0 && this.field1621 == var18 && this.field1620 == var15.field73) {
                                                    var27.method187(128, var21, var22, -6626);
                                                } else {
                                                    var27.method185(var21, (byte) 1, var22);
                                                }
                                                if (var27.field668 == 33 || var15.field70[var18] != 1) {
                                                    int var30 = var15.field70[var18];
                                                    this.field1643.method204(var21 + 1 + var23, method484(0, var30), -1765, var22 + 10 + var24, 0);
                                                    this.field1643.method204(var21 + var23, method484(0, var30), -1765, var22 + 9 + var24, 16776960);
                                                }
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field75 == 3) {
                            boolean var32 = false;
                            if (this.field1315 == var15.field73 || this.field1268 == var15.field73 || this.field1286 == var15.field73) {
                                var32 = true;
                            }
                            int var33;
                            if (this.method425(var15, (byte) 8)) {
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
                                    Pix2D.method156(var16, var33, var15.field79, var15.field78, -37952, var17);
                                } else {
                                    Pix2D.method157(var15.field78, var33, var15.field79, 0, var17, var16);
                                }
                            } else if (var15.field105) {
                                Pix2D.method155(false, 256 - (var15.field80 & 255), var15.field78, var33, var16, var15.field79, var17);
                            } else {
                                Pix2D.method158(256 - (var15.field80 & 255), var33, (byte) 0, var17, var16, var15.field78, var15.field79);
                            }
                        } else if (var15.field75 == 4) {
                            PixFont var34 = var15.field108;
                            String var35 = var15.field109;
                            boolean var36 = false;
                            if (this.field1315 == var15.field73 || this.field1268 == var15.field73 || this.field1286 == var15.field73) {
                                var36 = true;
                            }
                            int var37;
                            if (this.method425(var15, (byte) 8)) {
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
                            if (var15.field76 == 6 && this.field1502) {
                                var35 = "Please wait...";
                                var37 = var15.field111;
                            }
                            if (Pix2D.field621 == 479) {
                                if (var37 == 16776960) {
                                    var37 = 255;
                                }
                                if (var37 == 49152) {
                                    var37 = 16777215;
                                }
                            }
                            int var38 = var34.field691 + var17;
                            while (var35.length() > 0) {
                                if (var35.indexOf("%") != -1) {
                                    label327: while (true) {
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
                                                                            break label327;
                                                                        }
                                                                        var35 = var35.substring(0, var43) + this.method533(false, this.method540(var15, 4, 862)) + var35.substring(var43 + 2);
                                                                    }
                                                                }
                                                                var35 = var35.substring(0, var42) + this.method533(false, this.method540(var15, 3, 862)) + var35.substring(var42 + 2);
                                                            }
                                                        }
                                                        var35 = var35.substring(0, var41) + this.method533(false, this.method540(var15, 2, 862)) + var35.substring(var41 + 2);
                                                    }
                                                }
                                                var35 = var35.substring(0, var40) + this.method533(false, this.method540(var15, 1, 862)) + var35.substring(var40 + 2);
                                            }
                                        }
                                        var35 = var35.substring(0, var39) + this.method533(false, this.method540(var15, 0, 862)) + var35.substring(var39 + 2);
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
                                    var34.method201(var15.field107, var38, var45, var15.field78 / 2 + var16, false, var37);
                                } else {
                                    var34.method206(var38, 12, var16, var15.field107, var37, var45);
                                }
                                var38 += var34.field691;
                            }
                        } else if (var15.field75 == 5) {
                            Pix32 var46;
                            if (this.method425(var15, (byte) 8)) {
                                var46 = var15.field116;
                            } else {
                                var46 = var15.field115;
                            }
                            if (var46 != null) {
                                var46.method185(var16, (byte) 1, var17);
                            }
                        } else if (var15.field75 == 6) {
                            int var47 = Pix3D.field639;
                            int var48 = Pix3D.field640;
                            Pix3D.field639 = var15.field78 / 2 + var16;
                            Pix3D.field640 = var15.field79 / 2 + var17;
                            int var49 = Pix3D.field643[var15.field124] * var15.field123 >> 16;
                            int var50 = Pix3D.field644[var15.field124] * var15.field123 >> 16;
                            boolean var51 = this.method425(var15, (byte) 8);
                            int var52;
                            if (var51) {
                                var52 = var15.field122;
                            } else {
                                var52 = var15.field121;
                            }
                            Model var53;
                            if (var52 == -1) {
                                var53 = var15.method34(0, -1, -1, var51);
                            } else {
                                SeqType var54 = SeqType.field1126[var52];
                                var53 = var15.method34(0, var54.field1128[var15.field71], var54.field1129[var15.field71], var51);
                            }
                            if (var53 != null) {
                                var53.method145(0, var15.field125, 0, var15.field124, 0, var49, var50);
                            }
                            Pix3D.field639 = var47;
                            Pix3D.field640 = var48;
                        } else if (var15.field75 == 7) {
                            PixFont var55 = var15.field108;
                            int var56 = 0;
                            for (int var57 = 0; var57 < var15.field79; ++var57) {
                                for (int var58 = 0; var58 < var15.field78; ++var58) {
                                    if (var15.field69[var56] > 0) {
                                        ObjType var59 = ObjType.method342(var15.field69[var56] - 1);
                                        String var60 = var59.field1034;
                                        if (var59.field1045 || var15.field70[var56] != 1) {
                                            var60 = var60 + " x" + method520(var15.field70[var56], 57);
                                        }
                                        int var61 = (var15.field99 + 115) * var58 + var16;
                                        int var62 = (var15.field100 + 12) * var57 + var17;
                                        if (var15.field106) {
                                            var55.method201(var15.field107, var62, var60, var15.field78 / 2 + var61, false, var15.field111);
                                        } else {
                                            var55.method206(var62, 12, var61, var15.field107, var15.field111, var60);
                                        }
                                    }
                                    ++var56;
                                }
                            }
                        }
                    }
                }
                if (arg1 != 2712) {
                    for (int var12 = 1; var12 > 0; ++var12) {
                    }
                }
                Pix2D.method153(var7, var6, var8, var9, 297);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)V")
    public final void method556(int arg0, int arg1) {
        Component var3 = Component.field68[arg0];
        for (int var4 = 0; var4 < var3.field90.length && var3.field90[var4] != -1; ++var4) {
            Component var5 = Component.field68[var3.field90[var4]];
            if (var5.field75 == 1) {
                this.method556(var5.field73, 95);
            }
            var5.field71 = 0;
            var5.field72 = 0;
        }
        if (arg1 <= 0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field1356[var1] = var0 / 4;
        }
        field1400 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field1423 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field1506 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field1642 = -554;
        field1650 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field1650[var3] = var2 - 1;
            var2 += var2;
        }
    }
}
