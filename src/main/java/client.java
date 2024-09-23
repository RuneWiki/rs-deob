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

    @OriginalMember(owner = "client", name = "I", descriptor = "Z")
    private boolean field1143 = false;

    @OriginalMember(owner = "client", name = "K", descriptor = "[I")
    private int[] field1145 = new int[9];

    @OriginalMember(owner = "client", name = "L", descriptor = "[B")
    private byte[] field1146 = new byte[16384];

    @OriginalMember(owner = "client", name = "M", descriptor = "[I")
    private int[] field1147 = new int[256];

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field1150 = 50;

    @OriginalMember(owner = "client", name = "Q", descriptor = "[I")
    private int[] field1151 = new int[this.field1150];

    @OriginalMember(owner = "client", name = "R", descriptor = "[I")
    private int[] field1152 = new int[this.field1150];

    @OriginalMember(owner = "client", name = "S", descriptor = "[I")
    private int[] field1153 = new int[this.field1150];

    @OriginalMember(owner = "client", name = "T", descriptor = "[I")
    private int[] field1154 = new int[this.field1150];

    @OriginalMember(owner = "client", name = "U", descriptor = "[I")
    private int[] field1155 = new int[this.field1150];

    @OriginalMember(owner = "client", name = "V", descriptor = "[I")
    private int[] field1156 = new int[this.field1150];

    @OriginalMember(owner = "client", name = "W", descriptor = "[I")
    private int[] field1157 = new int[this.field1150];

    @OriginalMember(owner = "client", name = "X", descriptor = "[Ljava/lang/String;")
    private String[] field1158 = new String[this.field1150];

    @OriginalMember(owner = "client", name = "fb", descriptor = "Z")
    private boolean field1166 = false;

    @OriginalMember(owner = "client", name = "jb", descriptor = "[I")
    private int[] field1170 = new int[1000];

    @OriginalMember(owner = "client", name = "kb", descriptor = "[I")
    private int[] field1171 = new int[1000];

    @OriginalMember(owner = "client", name = "lb", descriptor = "Z")
    private boolean field1172 = false;

    @OriginalMember(owner = "client", name = "mb", descriptor = "B")
    private byte field1173 = -43;

    @OriginalMember(owner = "client", name = "nb", descriptor = "Lpb;")
    private LinkList field1174 = new LinkList((byte) 115);

    @OriginalMember(owner = "client", name = "ob", descriptor = "[I")
    private int[] field1175 = new int[151];

    @OriginalMember(owner = "client", name = "qb", descriptor = "Z")
    private boolean field1177 = false;

    @OriginalMember(owner = "client", name = "vb", descriptor = "[Ljb;")
    private Pix32[] field1182 = new Pix32[20];

    @OriginalMember(owner = "client", name = "wb", descriptor = "[I")
    private int[] field1183 = new int[4000];

    @OriginalMember(owner = "client", name = "xb", descriptor = "[I")
    private int[] field1184 = new int[4000];

    @OriginalMember(owner = "client", name = "zb", descriptor = "Z")
    private boolean field1186 = true;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "[Lic;")
    private CollisionMap[] field1187 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "Bb", descriptor = "[I")
    private int[] field1188 = new int[50];

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field1190 = -1;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field1191 = -1;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "[I")
    private int[] field1192 = new int[5];

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field1193 = -797;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "[I")
    private int[] field1199 = new int[33];

    @OriginalMember(owner = "client", name = "Nb", descriptor = "B")
    private byte field1200 = -102;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "Z")
    private boolean field1201 = true;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field1203 = -1;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "[Z")
    private boolean[] field1204 = new boolean[5];

    @OriginalMember(owner = "client", name = "Tb", descriptor = "B")
    private byte field1206 = 0;

    @OriginalMember(owner = "client", name = "ac", descriptor = "[I")
    private int[] field1213 = new int[5];

    @OriginalMember(owner = "client", name = "bc", descriptor = "[I")
    private int[] field1214 = new int[5];

    @OriginalMember(owner = "client", name = "cc", descriptor = "Z")
    private boolean field1215 = false;

    @OriginalMember(owner = "client", name = "dc", descriptor = "Z")
    private boolean field1216 = false;

    @OriginalMember(owner = "client", name = "ec", descriptor = "[I")
    private int[] field1217 = new int[50];

    @OriginalMember(owner = "client", name = "hc", descriptor = "[Lwb;")
    public FileStream[] field1220 = new FileStream[5];

    @OriginalMember(owner = "client", name = "ic", descriptor = "Z")
    private boolean field1221 = false;

    @OriginalMember(owner = "client", name = "jc", descriptor = "Z")
    private boolean field1222 = false;

    @OriginalMember(owner = "client", name = "oc", descriptor = "Z")
    private boolean field1227 = false;

    @OriginalMember(owner = "client", name = "pc", descriptor = "B")
    private byte field1228 = -107;

    @OriginalMember(owner = "client", name = "qc", descriptor = "[I")
    private int[] field1229 = new int[5];

    @OriginalMember(owner = "client", name = "wc", descriptor = "[I")
    private int[] field1235 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "yc", descriptor = "Ljava/lang/String;")
    private String field1237 = "";

    @OriginalMember(owner = "client", name = "zc", descriptor = "[Ljava/lang/String;")
    private String[] field1238 = new String[500];

    @OriginalMember(owner = "client", name = "Ac", descriptor = "[Lkb;")
    private Pix8[] field1239 = new Pix8[13];

    @OriginalMember(owner = "client", name = "Bc", descriptor = "Lmb;")
    private Packet field1240 = Packet.method218(527, 1);

    @OriginalMember(owner = "client", name = "Dc", descriptor = "[[I")
    private int[][] field1242 = new int[104][104];

    @OriginalMember(owner = "client", name = "Ec", descriptor = "Z")
    private boolean field1243 = false;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field1246 = 7;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "Lmb;")
    private Packet field1250 = Packet.method218(527, 1);

    @OriginalMember(owner = "client", name = "Mc", descriptor = "[Lkb;")
    private Pix8[] field1251 = new Pix8[50];

    @OriginalMember(owner = "client", name = "Qc", descriptor = "[J")
    private long[] field1255 = new long[100];

    @OriginalMember(owner = "client", name = "Rc", descriptor = "[I")
    private int[] field1256 = new int[2000];

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field1257 = 404;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "Z")
    private boolean field1258 = false;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "Z")
    private boolean field1260 = false;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field1271 = -1;

    @OriginalMember(owner = "client", name = "id", descriptor = "[I")
    private final int[] field1273 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "kd", descriptor = "B")
    private byte field1275 = 117;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field1281 = -1;

    @OriginalMember(owner = "client", name = "xd", descriptor = "Z")
    private boolean field1288 = false;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "[I")
    private int[] field1304 = new int[100];

    @OriginalMember(owner = "client", name = "Od", descriptor = "[Ljava/lang/String;")
    private String[] field1305 = new String[100];

    @OriginalMember(owner = "client", name = "Pd", descriptor = "[Ljava/lang/String;")
    private String[] field1306 = new String[100];

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[I")
    private int[] field1307 = new int[50];

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private int field1308 = 1;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "[I")
    public int[] field1312 = new int[1000];

    @OriginalMember(owner = "client", name = "Xd", descriptor = "Z")
    private boolean field1314 = false;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field1315 = 6;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "Z")
    private boolean field1316 = false;

    @OriginalMember(owner = "client", name = "he", descriptor = "Ljava/lang/String;")
    private String field1324 = "";

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field1331 = 1;

    @OriginalMember(owner = "client", name = "De", descriptor = "Z")
    private boolean field1346 = false;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field1349 = 2;

    @OriginalMember(owner = "client", name = "Je", descriptor = "[Ljb;")
    private Pix32[] field1352 = new Pix32[50];

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field1353 = 3;

    @OriginalMember(owner = "client", name = "Le", descriptor = "[I")
    private int[] field1354 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field1355 = -1;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field1358 = 933;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "[I")
    private int[] field1359 = new int[50];

    @OriginalMember(owner = "client", name = "Se", descriptor = "[[I")
    private int[][] field1361 = new int[104][104];

    @OriginalMember(owner = "client", name = "Te", descriptor = "Ljava/lang/String;")
    private String field1362 = "";

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field1368 = -1;

    @OriginalMember(owner = "client", name = "af", descriptor = "[I")
    private int[] field1369 = new int[50];

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field1370 = -1;

    @OriginalMember(owner = "client", name = "cf", descriptor = "[Ljb;")
    private Pix32[] field1371 = new Pix32[20];

    @OriginalMember(owner = "client", name = "df", descriptor = "[I")
    private int[] field1372 = new int[50];

    @OriginalMember(owner = "client", name = "ef", descriptor = "[Ljb;")
    private Pix32[] field1373 = new Pix32[8];

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field1375 = 2;

    @OriginalMember(owner = "client", name = "kf", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1378 = new CRC32();

    @OriginalMember(owner = "client", name = "mf", descriptor = "Z")
    private boolean field1380 = false;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field1381 = 3353893;

    @OriginalMember(owner = "client", name = "rf", descriptor = "Ld;")
    private Component field1385 = new Component();

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field1386 = 226;

    @OriginalMember(owner = "client", name = "tf", descriptor = "[I")
    private int[] field1387 = new int[7];

    @OriginalMember(owner = "client", name = "wf", descriptor = "Lpb;")
    private LinkList field1390 = new LinkList((byte) 115);

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field1391 = 57;

    @OriginalMember(owner = "client", name = "yf", descriptor = "[Ljava/lang/String;")
    private String[] field1392 = new String[100];

    @OriginalMember(owner = "client", name = "Jf", descriptor = "[Lab;")
    private NpcEntity[] field1403 = new NpcEntity[8192];

    @OriginalMember(owner = "client", name = "Lf", descriptor = "[I")
    public int[] field1405 = new int[8192];

    @OriginalMember(owner = "client", name = "Mf", descriptor = "Ljava/lang/String;")
    private String field1406 = "";

    @OriginalMember(owner = "client", name = "Nf", descriptor = "Ljava/lang/String;")
    private String field1407 = "";

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field1408 = -1;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field1409 = -466;

    @OriginalMember(owner = "client", name = "ag", descriptor = "Z")
    private boolean field1420 = false;

    @OriginalMember(owner = "client", name = "bg", descriptor = "B")
    private byte field1421 = 0;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field1431 = -1;

    @OriginalMember(owner = "client", name = "sg", descriptor = "Z")
    private boolean field1438 = true;

    @OriginalMember(owner = "client", name = "tg", descriptor = "[I")
    private int[] field1439 = new int[151];

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field1441 = 1;

    @OriginalMember(owner = "client", name = "wg", descriptor = "[J")
    private long[] field1442 = new long[100];

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field1447 = 2;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field1449 = -1;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field1451 = 2301979;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "B")
    private byte field1458 = 68;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "B")
    private byte field1459 = -81;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field1460 = 40443;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "Z")
    private boolean field1461 = false;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "B")
    private byte field1462 = 5;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "Z")
    private boolean field1463 = false;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "Z")
    private boolean field1464 = true;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private final int field1467 = 100;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "[I")
    private int[] field1468 = new int[100];

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private int field1470 = 2048;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private int field1471 = 2047;

    @OriginalMember(owner = "client", name = "ah", descriptor = "[Lbb;")
    private PlayerEntity[] field1472 = new PlayerEntity[this.field1470];

    @OriginalMember(owner = "client", name = "ch", descriptor = "[I")
    public int[] field1474 = new int[this.field1470];

    @OriginalMember(owner = "client", name = "eh", descriptor = "[I")
    private int[] field1476 = new int[this.field1470];

    @OriginalMember(owner = "client", name = "fh", descriptor = "[Lmb;")
    private Packet[] field1477 = new Packet[this.field1470];

    @OriginalMember(owner = "client", name = "hh", descriptor = "Z")
    private boolean field1479 = false;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field1481 = -31190;

    @OriginalMember(owner = "client", name = "kh", descriptor = "Z")
    private boolean field1482 = false;

    @OriginalMember(owner = "client", name = "mh", descriptor = "[I")
    private int[] field1484 = new int[2000];

    @OriginalMember(owner = "client", name = "rh", descriptor = "[I")
    private int[] field1489 = new int[33];

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field1497 = -1;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private int field1498 = -1;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "B")
    private byte field1502 = -102;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field1504 = -688;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field1506 = 7759444;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field1507 = 78;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "B")
    private byte field1510 = 8;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "Z")
    private boolean field1511 = false;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "[I")
    private int[] field1512 = new int[100];

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    private int field1514 = 414;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "Z")
    private boolean field1516 = true;

    @OriginalMember(owner = "client", name = "Th", descriptor = "[I")
    private int[] field1517 = new int[500];

    @OriginalMember(owner = "client", name = "Uh", descriptor = "[I")
    private int[] field1518 = new int[500];

    @OriginalMember(owner = "client", name = "Vh", descriptor = "[I")
    private int[] field1519 = new int[500];

    @OriginalMember(owner = "client", name = "Wh", descriptor = "[I")
    private int[] field1520 = new int[500];

    @OriginalMember(owner = "client", name = "Xh", descriptor = "Z")
    private boolean field1521 = false;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field1522 = 761;

    @OriginalMember(owner = "client", name = "ni", descriptor = "Z")
    private boolean field1537 = true;

    @OriginalMember(owner = "client", name = "pi", descriptor = "B")
    private byte field1539 = -53;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field1540 = 5063219;

    @OriginalMember(owner = "client", name = "ri", descriptor = "Ljava/lang/String;")
    private String field1541 = "";

    @OriginalMember(owner = "client", name = "si", descriptor = "Ljava/lang/String;")
    private String field1542 = "";

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field1543 = -19361;

    @OriginalMember(owner = "client", name = "ui", descriptor = "[[[Lpb;")
    private LinkList[][][] field1544 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "Di", descriptor = "Z")
    private boolean field1553 = false;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "Z")
    private boolean field1555 = true;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "Z")
    private boolean field1566 = false;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "Ljava/lang/String;")
    private String field1569 = "";

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private int field1571 = 128;

    @OriginalMember(owner = "client", name = "aj", descriptor = "[I")
    private int[] field1576 = new int[5];

    @OriginalMember(owner = "client", name = "bj", descriptor = "Z")
    public boolean field1577 = false;

    @OriginalMember(owner = "client", name = "cj", descriptor = "Z")
    private boolean field1578 = false;

    @OriginalMember(owner = "client", name = "dj", descriptor = "[Ljb;")
    private Pix32[] field1579 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "hj", descriptor = "Lmb;")
    private Packet field1583 = Packet.method218(527, 1);

    @OriginalMember(owner = "client", name = "ij", descriptor = "Lpb;")
    private LinkList field1584 = new LinkList((byte) 115);

    @OriginalMember(owner = "client", name = "jj", descriptor = "Ljava/lang/String;")
    private String field1585 = "";

    @OriginalMember(owner = "client", name = "kj", descriptor = "[[I")
    private int[][] field1586 = new int[104][104];

    @OriginalMember(owner = "client", name = "Yb", descriptor = "B")
    private static byte field1211 = 38;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private static int field1230 = 10;

    @OriginalMember(owner = "client", name = "tc", descriptor = "Z")
    private static boolean field1232 = true;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1249 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client", name = "Uc", descriptor = "[[I")
    public static final int[][] field1259 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "ye", descriptor = "Z")
    private static boolean field1341 = true;

    @OriginalMember(owner = "client", name = "Re", descriptor = "[I")
    public static final int[] field1360 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client", name = "Ue", descriptor = "Z")
    private static boolean field1363 = true;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "B")
    private static byte field1415 = 9;

    @OriginalMember(owner = "client", name = "mg", descriptor = "Ljava/lang/String;")
    private static String field1432 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private static int field1508 = 6;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "[I")
    private static int[] field1558 = new int[99];

    @OriginalMember(owner = "client", name = "Ri", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1567;

    @OriginalMember(owner = "client", name = "H", descriptor = "I")
    private static int field1142;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private static int field1148;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field1149;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private static int field1159;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field1167;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field1169;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field1178;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field1179;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field1180;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field1181;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private static int field1185;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private static int field1189;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field1194;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field1195;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field1196;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private int field1197;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private static int field1202;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field1205;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field1207;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field1208;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field1209;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field1210;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field1223;

    @OriginalMember(owner = "client", name = "lc", descriptor = "I")
    private int field1224;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field1225;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field1226;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private static int field1236;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field1244;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private int field1248;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field1252;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field1261;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field1262;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field1265;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private int field1267;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field1268;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field1282;

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    private static int field1287;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field1289;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private int field1291;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private int field1292;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field1293;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field1294;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field1309;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    private int field1311;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private static int field1317;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field1319;

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private int field1325;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field1329;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field1333;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field1345;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private static int field1350;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field1351;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field1356;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field1357;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field1364;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field1365;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field1366;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field1367;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field1374;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field1376;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field1377;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field1379;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field1384;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field1416;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    private static int field1423;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private static int field1429;

    @OriginalMember(owner = "client", name = "kg", descriptor = "I")
    private int field1430;

    @OriginalMember(owner = "client", name = "ng", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private static int field1437;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field1440;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field1446;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field1448;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private static int field1452;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field1453;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field1455;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field1456;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client", name = "dh", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field1478;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field1485;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field1496;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field1505;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field1509;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private static int field1513;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field1529;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private int field1535;

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field1538;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field1548;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field1549;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field1550;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field1551;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field1559;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "I")
    private int field1560;

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field1561;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "I")
    private int field1562;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field1563;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field1564;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field1565;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private int field1572;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field1573;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private int field1574;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private static int field1575;

    @OriginalMember(owner = "client", name = "Z", descriptor = "J")
    private long field1160;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "J")
    private long field1247;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "J")
    private long field1450;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "J")
    private long field1556;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "Le;")
    private ClientStream field1554;

    @OriginalMember(owner = "client", name = "jd", descriptor = "Lxb;")
    private Isaac field1274;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "Lyb;")
    private Jagfile field1254;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "Lvb;")
    private OnDemand field1410;

    @OriginalMember(owner = "client", name = "hb", descriptor = "Ljb;")
    private Pix32 field1168;

    @OriginalMember(owner = "client", name = "fc", descriptor = "Ljb;")
    private Pix32 field1218;

    @OriginalMember(owner = "client", name = "gc", descriptor = "Ljb;")
    private Pix32 field1219;

    @OriginalMember(owner = "client", name = "ed", descriptor = "Ljb;")
    private Pix32 field1269;

    @OriginalMember(owner = "client", name = "fd", descriptor = "Ljb;")
    private Pix32 field1270;

    @OriginalMember(owner = "client", name = "Be", descriptor = "Ljb;")
    private Pix32 field1344;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "Ljb;")
    private Pix32 field1411;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "Ljb;")
    private Pix32 field1412;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "Ljb;")
    private Pix32 field1413;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "Ljb;")
    private Pix32 field1414;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "Ljb;")
    private Pix32 field1515;

    @OriginalMember(owner = "client", name = "ab", descriptor = "Lkb;")
    private Pix8 field1161;

    @OriginalMember(owner = "client", name = "bb", descriptor = "Lkb;")
    private Pix8 field1162;

    @OriginalMember(owner = "client", name = "cb", descriptor = "Lkb;")
    private Pix8 field1163;

    @OriginalMember(owner = "client", name = "db", descriptor = "Lkb;")
    private Pix8 field1164;

    @OriginalMember(owner = "client", name = "eb", descriptor = "Lkb;")
    private Pix8 field1165;

    @OriginalMember(owner = "client", name = "od", descriptor = "Lkb;")
    private Pix8 field1279;

    @OriginalMember(owner = "client", name = "pd", descriptor = "Lkb;")
    private Pix8 field1280;

    @OriginalMember(owner = "client", name = "je", descriptor = "Lkb;")
    private Pix8 field1326;

    @OriginalMember(owner = "client", name = "ke", descriptor = "Lkb;")
    private Pix8 field1327;

    @OriginalMember(owner = "client", name = "le", descriptor = "Lkb;")
    private Pix8 field1328;

    @OriginalMember(owner = "client", name = "of", descriptor = "Lkb;")
    private Pix8 field1382;

    @OriginalMember(owner = "client", name = "pf", descriptor = "Lkb;")
    private Pix8 field1383;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "Lkb;")
    private Pix8 field1523;

    @OriginalMember(owner = "client", name = "ai", descriptor = "Lkb;")
    private Pix8 field1524;

    @OriginalMember(owner = "client", name = "bi", descriptor = "Lkb;")
    private Pix8 field1525;

    @OriginalMember(owner = "client", name = "ci", descriptor = "Lkb;")
    private Pix8 field1526;

    @OriginalMember(owner = "client", name = "di", descriptor = "Lkb;")
    private Pix8 field1527;

    @OriginalMember(owner = "client", name = "ej", descriptor = "Lkb;")
    private Pix8 field1580;

    @OriginalMember(owner = "client", name = "fj", descriptor = "Lkb;")
    private Pix8 field1581;

    @OriginalMember(owner = "client", name = "gj", descriptor = "Lkb;")
    private Pix8 field1582;

    @OriginalMember(owner = "client", name = "eg", descriptor = "Llb;")
    private PixFont field1424;

    @OriginalMember(owner = "client", name = "fg", descriptor = "Llb;")
    private PixFont field1425;

    @OriginalMember(owner = "client", name = "gg", descriptor = "Llb;")
    private PixFont field1426;

    @OriginalMember(owner = "client", name = "hg", descriptor = "Llb;")
    private PixFont field1427;

    @OriginalMember(owner = "client", name = "ld", descriptor = "Lrb;")
    private PixMap field1276;

    @OriginalMember(owner = "client", name = "md", descriptor = "Lrb;")
    private PixMap field1277;

    @OriginalMember(owner = "client", name = "nd", descriptor = "Lrb;")
    private PixMap field1278;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "Lrb;")
    private PixMap field1295;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "Lrb;")
    private PixMap field1296;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "Lrb;")
    private PixMap field1297;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "Lrb;")
    private PixMap field1298;

    @OriginalMember(owner = "client", name = "Id", descriptor = "Lrb;")
    private PixMap field1299;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "Lrb;")
    private PixMap field1300;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "Lrb;")
    private PixMap field1301;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "Lrb;")
    private PixMap field1302;

    @OriginalMember(owner = "client", name = "Md", descriptor = "Lrb;")
    private PixMap field1303;

    @OriginalMember(owner = "client", name = "de", descriptor = "Lrb;")
    private PixMap field1320;

    @OriginalMember(owner = "client", name = "ee", descriptor = "Lrb;")
    private PixMap field1321;

    @OriginalMember(owner = "client", name = "fe", descriptor = "Lrb;")
    private PixMap field1322;

    @OriginalMember(owner = "client", name = "ge", descriptor = "Lrb;")
    private PixMap field1323;

    @OriginalMember(owner = "client", name = "zf", descriptor = "Lrb;")
    private PixMap field1393;

    @OriginalMember(owner = "client", name = "Af", descriptor = "Lrb;")
    private PixMap field1394;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "Lrb;")
    private PixMap field1395;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "Lrb;")
    private PixMap field1396;

    @OriginalMember(owner = "client", name = "Df", descriptor = "Lrb;")
    private PixMap field1397;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Lrb;")
    private PixMap field1398;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "Lrb;")
    private PixMap field1399;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "Lrb;")
    private PixMap field1400;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "Lrb;")
    private PixMap field1401;

    @OriginalMember(owner = "client", name = "If", descriptor = "Lrb;")
    private PixMap field1402;

    @OriginalMember(owner = "client", name = "Td", descriptor = "Lbb;")
    public static PlayerEntity field1310;

    @OriginalMember(owner = "client", name = "J", descriptor = "Ls;")
    private World3D field1144;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "Ljava/lang/String;")
    public String field1457;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "Ljava/lang/String;")
    private String field1465;

    @OriginalMember(owner = "client", name = "qh", descriptor = "Ljava/lang/String;")
    public String field1488;

    @OriginalMember(owner = "client", name = "lj", descriptor = "Ljava/lang/String;")
    private String field1587;

    @OriginalMember(owner = "client", name = "pb", descriptor = "Z")
    private static boolean field1176;

    @OriginalMember(owner = "client", name = "uc", descriptor = "Z")
    private static boolean field1233;

    @OriginalMember(owner = "client", name = "mj", descriptor = "Z")
    public static boolean field1588;

    @OriginalMember(owner = "client", name = "te", descriptor = "[I")
    private int[] field1336;

    @OriginalMember(owner = "client", name = "ue", descriptor = "[I")
    private int[] field1337;

    @OriginalMember(owner = "client", name = "ve", descriptor = "[I")
    private int[] field1338;

    @OriginalMember(owner = "client", name = "we", descriptor = "[I")
    private int[] field1339;

    @OriginalMember(owner = "client", name = "uf", descriptor = "[I")
    private int[] field1388;

    @OriginalMember(owner = "client", name = "vf", descriptor = "[I")
    private int[] field1389;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "[I")
    private int[] field1417;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "[I")
    private int[] field1418;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "[I")
    private int[] field1419;

    @OriginalMember(owner = "client", name = "og", descriptor = "[I")
    private int[] field1434;

    @OriginalMember(owner = "client", name = "pg", descriptor = "[I")
    private int[] field1435;

    @OriginalMember(owner = "client", name = "qg", descriptor = "[I")
    private int[] field1436;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "[I")
    private int[] field1500;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "[I")
    private int[] field1501;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "[Lkb;")
    private Pix8[] field1557;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "[[B")
    private byte[][] field1313;

    @OriginalMember(owner = "client", name = "ih", descriptor = "[[B")
    private byte[][] field1480;

    @OriginalMember(owner = "client", name = "Si", descriptor = "[[[B")
    private byte[][][] field1568;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "[[[I")
    private int[][][] field1241;

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method418(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1406 = "";
                this.field1407 = "Connecting to server...";
                this.method424(0);
            }
            this.field1554 = new ClientStream(this.method541(field1231 + 43594), false, this);
            this.field1554.method40(this.field1583.field697, 0, 8);
            this.field1583.field698 = 0;
            this.field1247 = this.field1583.method237(408);
            int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1247 >> 32), (int) this.field1247 };
            this.field1240.field698 = 0;
            this.field1240.method221(10);
            this.field1240.method225(var4[0]);
            this.field1240.method225(var4[1]);
            this.field1240.method225(var4[2]);
            this.field1240.method225(var4[3]);
            this.field1240.method225(signlink.uid);
            this.field1240.method228(arg0);
            this.field1240.method228(arg1);
            this.field1240.method246(field1567, 0, field1249);
            this.field1250.field698 = 0;
            if (arg2) {
                this.field1250.method221(18);
            } else {
                this.field1250.method221(16);
            }
            this.field1250.method221(this.field1240.field698 + 36 + 1 + 1);
            this.field1250.method221(237);
            this.field1250.method221(field1233 ? 1 : 0);
            for (int var5 = 0; var5 < 9; ++var5) {
                this.field1250.method225(this.field1145[var5]);
            }
            this.field1250.method229(0, this.field1240.field697, (byte) -66, this.field1240.field698);
            this.field1240.field702 = new Isaac(var4, this.field1206);
            for (int var6 = 0; var6 < 4; ++var6) {
                var4[var6] += 50;
            }
            this.field1274 = new Isaac(var4, this.field1206);
            this.field1554.method41(this.field1250.field697, 0, this.field1250.field698, false);
            int var7 = this.field1554.method38();
            if (var7 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var15) {
                }
                this.method418(arg0, arg1, arg2);
                return;
            }
            if (var7 == 2 || var7 == 18) {
                if (var7 == 18) {
                    this.field1420 = true;
                } else {
                    this.field1420 = false;
                }
                InputTracking.method44((byte) 3);
                this.field1577 = true;
                this.field1240.field698 = 0;
                this.field1583.field698 = 0;
                this.field1547 = -1;
                this.field1529 = -1;
                this.field1530 = -1;
                this.field1531 = -1;
                this.field1546 = 0;
                this.field1548 = 0;
                this.field1551 = 0;
                this.field1550 = 0;
                this.field1565 = 0;
                this.field1478 = 0;
                this.field1521 = false;
                super.field22 = 0;
                for (int var8 = 0; var8 < 100; ++var8) {
                    this.field1306[var8] = null;
                }
                this.field1453 = 0;
                this.field1485 = 0;
                this.field1505 = 0;
                this.field1376 = 0;
                this.field1348 = (int) (Math.random() * 100.0D) - 50;
                this.field1374 = (int) (Math.random() * 110.0D) - 55;
                this.field1330 = (int) (Math.random() * 80.0D) - 40;
                this.field1446 = (int) (Math.random() * 120.0D) - 60;
                this.field1440 = (int) (Math.random() * 30.0D) - 20;
                this.field1572 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1368 = -1;
                this.field1342 = 0;
                this.field1343 = 0;
                this.field1473 = 0;
                this.field1404 = 0;
                for (int var9 = 0; var9 < this.field1470; ++var9) {
                    this.field1472[var9] = null;
                    this.field1477[var9] = null;
                }
                for (int var10 = 0; var10 < 8192; ++var10) {
                    this.field1403[var10] = null;
                }
                field1310 = this.field1472[this.field1471] = new PlayerEntity();
                this.field1390.method254();
                this.field1584.method254();
                for (int var11 = 0; var11 < 4; ++var11) {
                    for (int var12 = 0; var12 < 104; ++var12) {
                        for (int var13 = 0; var13 < 104; ++var13) {
                            this.field1544[var11][var12][var13] = null;
                        }
                    }
                }
                this.field1174 = new LinkList((byte) 115);
                this.field1365 = 0;
                this.field1431 = -1;
                this.field1408 = -1;
                this.field1281 = -1;
                this.field1203 = -1;
                this.field1316 = false;
                this.field1353 = 3;
                this.field1243 = false;
                this.field1521 = false;
                this.field1143 = false;
                this.field1465 = null;
                this.field1466 = 0;
                this.field1449 = -1;
                this.field1555 = true;
                this.method477(771);
                for (int var14 = 0; var14 < 5; ++var14) {
                    this.field1213[var14] = 0;
                }
                field1142 = 0;
                field1437 = 0;
                field1423 = 0;
                field1202 = 0;
                field1236 = 0;
                field1148 = 0;
                field1350 = 0;
                field1185 = 0;
                field1452 = 0;
                field1189 = 0;
                this.method513(this.field1543);
                return;
            }
            if (var7 == 3) {
                this.field1406 = "";
                this.field1407 = "Invalid username or password.";
                return;
            }
            if (var7 == 4) {
                this.field1406 = "Your account has been disabled.";
                this.field1407 = "Please check your message-centre for details.";
                return;
            }
            if (var7 == 5) {
                this.field1406 = "Your account is already logged in.";
                this.field1407 = "Try again in 60 secs...";
                return;
            }
            if (var7 == 6) {
                this.field1406 = "RuneScape has been updated!";
                this.field1407 = "Please reload this page.";
                return;
            }
            if (var7 == 7) {
                this.field1406 = "This world is full.";
                this.field1407 = "Please use a different world.";
                return;
            }
            if (var7 == 8) {
                this.field1406 = "Unable to connect.";
                this.field1407 = "Login server offline.";
                return;
            }
            if (var7 == 9) {
                this.field1406 = "Login limit exceeded.";
                this.field1407 = "Too many connections from your address.";
                return;
            }
            if (var7 == 10) {
                this.field1406 = "Unable to connect.";
                this.field1407 = "Bad session id.";
                return;
            }
            if (var7 == 11) {
                this.field1407 = "Login server rejected session.";
                this.field1407 = "Please try again.";
                return;
            }
            if (var7 == 12) {
                this.field1406 = "You need a members account to login to this world.";
                this.field1407 = "Please subscribe, or use a different world.";
                return;
            }
            if (var7 == 13) {
                this.field1406 = "Could not complete login.";
                this.field1407 = "Please try using a different world.";
                return;
            }
            if (var7 == 14) {
                this.field1406 = "The server is being updated.";
                this.field1407 = "Please wait 1 minute and try again.";
                return;
            }
            if (var7 == 15) {
                this.field1577 = true;
                this.field1240.field698 = 0;
                this.field1583.field698 = 0;
                this.field1547 = -1;
                this.field1529 = -1;
                this.field1530 = -1;
                this.field1531 = -1;
                this.field1546 = 0;
                this.field1548 = 0;
                this.field1551 = 0;
                this.field1478 = 0;
                this.field1521 = false;
                this.field1450 = System.currentTimeMillis();
                return;
            }
            if (var7 == 16) {
                this.field1406 = "Login attempts exceeded.";
                this.field1407 = "Please wait 1 minute and try again.";
                return;
            }
            if (var7 == 17) {
                this.field1406 = "You are standing in a members-only area.";
                this.field1407 = "To play on this world move to a free area first";
                return;
            }
        } catch (IOException var16) {
            this.field1406 = "";
            this.field1407 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI[B)Z")
    public final boolean method419(boolean arg0, int arg1, byte[] arg2) {
        if (!arg0) {
            this.field1315 = 232;
        }
        return arg2 == null ? true : signlink.wavesave(arg2, arg1);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZ)V")
    public final void method420(int arg0, int arg1, boolean arg2) {
        if (this.field1545 != 0) {
            int var4 = 0;
            if (this.field1551 != 0) {
                var4 = 1;
            }
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field1306[var5] != null) {
                    int var6 = this.field1304[var5];
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field1483 == 0 || this.field1483 == 1 && this.method480(790, this.field1305[var5]))) {
                        int var7 = 329 - var4 * 13;
                        if (super.field24 > 8 && super.field24 < 520 && arg0 - 11 > var7 - 10 && arg0 - 11 <= var7 + 3) {
                            if (this.field1420) {
                                this.field1238[this.field1478] = "Report abuse @whi@" + this.field1305[var5];
                                this.field1519[this.field1478] = 2034;
                                ++this.field1478;
                            }
                            this.field1238[this.field1478] = "Add ignore @whi@" + this.field1305[var5];
                            this.field1519[this.field1478] = 2436;
                            ++this.field1478;
                            this.field1238[this.field1478] = "Add friend @whi@" + this.field1305[var5];
                            this.field1519[this.field1478] = 2406;
                            ++this.field1478;
                        }
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                    if ((var6 == 5 || var6 == 6) && this.field1483 < 2) {
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                }
            }
            this.field1577 &= arg2;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    private final void method421(int arg0) {
        LocSpawned var2 = (LocSpawned) this.field1174.method250();
        if (arg0 <= 0) {
            this.field1547 = this.field1583.method231();
        }
        while (var2 != null) {
            if (var2.field726 == -1) {
                var2.field725 = 0;
                this.method462(false, var2);
            } else {
                var2.method118();
            }
            var2 = (LocSpawned) this.field1174.method252(true);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIZIBLd;)V")
    public final void method422(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, byte arg7, Component arg8) {
        if (arg7 == 10) {
            if (this.field1482) {
                this.field1448 = 32;
            } else {
                this.field1448 = 0;
            }
            this.field1482 = false;
            if (arg6 >= arg0 && arg6 < arg0 + 16 && arg3 >= arg4 && arg3 < arg4 + 16) {
                arg8.field86 -= this.field1212 * 4;
                if (arg5) {
                    this.field1258 = true;
                    return;
                }
            } else if (arg6 >= arg0 && arg6 < arg0 + 16 && arg3 >= arg2 + arg4 - 16 && arg3 < arg2 + arg4) {
                arg8.field86 += this.field1212 * 4;
                if (arg5) {
                    this.field1258 = true;
                    return;
                }
            } else {
                if (arg6 < arg0 - this.field1448 || arg6 >= arg0 + 16 + this.field1448 || arg3 < arg4 + 16 || arg3 >= arg2 + arg4 - 16 || this.field1212 <= 0) {
                    return;
                }
                int var10 = (arg2 - 32) * arg2 / arg1;
                if (var10 < 8) {
                    var10 = 8;
                }
                int var11 = arg3 - arg4 - 16 - var10 / 2;
                int var12 = arg2 - 32 - var10;
                arg8.field86 = (arg1 - arg2) * var11 / var12;
                if (arg5) {
                    this.field1258 = true;
                }
                this.field1482 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public void method423(byte arg0) {
        if (arg0 != 30) {
            this.method6();
        }
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field1364);
        if (this.field1410 != null) {
            System.out.println("Od-cycle:" + this.field1410.field833);
        }
        System.out.println("loop-cycle:" + field1433);
        System.out.println("draw-cycle:" + field1552);
        System.out.println("ptype:" + this.field1547);
        System.out.println("psize:" + this.field1546);
        if (this.field1554 != null) {
            this.field1554.method42((byte) 30);
        }
        super.field14 = true;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)Ljava/awt/Component;")
    public final java.awt.Component method11(byte arg0) {
        if (arg0 != 9) {
            this.field1240.method221(31);
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field20 != null ? super.field20 : this;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method424(int arg0) {
        this.method528(595);
        this.field1297.method260((byte) 1);
        if (arg0 != 0) {
            this.field1193 = this.field1274.method295();
        }
        this.field1382.method204(0, 217, 0);
        short var2 = 360;
        short var3 = 200;
        if (this.field1377 == 0) {
            int var4 = var3 / 2 + 80;
            this.field1424.method207(7711145, true, var2 / 2, var4, -400, this.field1410.field819);
            int var5 = var3 / 2 - 20;
            this.field1426.method207(16776960, true, var2 / 2, var5, -400, "Welcome to RuneScape");
            int var16 = var5 + 30;
            int var6 = var2 / 2 - 80;
            int var7 = var3 / 2 + 20;
            this.field1383.method204(var7 - 20, 217, var6 - 73);
            this.field1426.method207(16777215, true, var6, var7 + 5, -400, "New user");
            int var8 = var2 / 2 + 80;
            this.field1383.method204(var7 - 20, 217, var8 - 73);
            this.field1426.method207(16777215, true, var8, var7 + 5, -400, "Existing User");
        }
        if (this.field1377 == 2) {
            int var9 = var3 / 2 - 40;
            if (this.field1406.length() > 0) {
                this.field1426.method207(16776960, true, var2 / 2, var9 - 15, -400, this.field1406);
                this.field1426.method207(16776960, true, var2 / 2, var9, -400, this.field1407);
                var9 += 30;
            } else {
                this.field1426.method207(16776960, true, var2 / 2, var9 - 7, -400, this.field1407);
                var9 += 30;
            }
            this.field1426.method211(16777215, var9, false, "Username: " + this.field1541 + (this.field1180 == 0 & field1433 % 40 < 20 ? "@yel@|" : ""), true, var2 / 2 - 90);
            var9 += 15;
            this.field1426.method211(16777215, var9, false, "Password: " + JString.method306(-46918, this.field1542) + (this.field1180 == 1 & field1433 % 40 < 20 ? "@yel@|" : ""), true, var2 / 2 - 88);
            var9 += 15;
            int var10 = var2 / 2 - 80;
            int var11 = var3 / 2 + 50;
            this.field1383.method204(var11 - 20, 217, var10 - 73);
            this.field1426.method207(16777215, true, var10, var11 + 5, -400, "Login");
            int var12 = var2 / 2 + 80;
            this.field1383.method204(var11 - 20, 217, var12 - 73);
            this.field1426.method207(16777215, true, var12, var11 + 5, -400, "Cancel");
        }
        if (this.field1377 == 3) {
            this.field1426.method207(16776960, true, var2 / 2, var3 / 2 - 60, -400, "Create a free account");
            int var13 = var3 / 2 - 35;
            this.field1426.method207(16777215, true, var2 / 2, var13, -400, "To create a new account you need to");
            int var17 = var13 + 15;
            this.field1426.method207(16777215, true, var2 / 2, var17, -400, "go back to the main RuneScape webpage");
            int var18 = var17 + 15;
            this.field1426.method207(16777215, true, var2 / 2, var18, -400, "and choose the red 'create account'");
            int var19 = var18 + 15;
            this.field1426.method207(16777215, true, var2 / 2, var19, -400, "button at the top right of that page.");
            int var20 = var19 + 15;
            int var14 = var2 / 2;
            int var15 = var3 / 2 + 50;
            this.field1383.method204(var15 - 20, 217, var14 - 73);
            this.field1426.method207(16777215, true, var14, var15 + 5, -400, "Cancel");
        }
        this.field1297.method261(3, 214, super.field17, 186);
        if (this.field1380) {
            this.field1380 = false;
            this.field1295.method261(3, 128, super.field17, 0);
            this.field1296.method261(3, 214, super.field17, 386);
            this.field1300.method261(3, 0, super.field17, 265);
            this.field1301.method261(3, 574, super.field17, 265);
            this.field1302.method261(3, 128, super.field17, 186);
            this.field1303.method261(3, 574, super.field17, 186);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;ZI)V")
    private final void method425(Packet arg0, boolean arg1, int arg2) {
        this.field1311 = 0;
        this.field1475 = 0;
        this.method456(false, arg2, arg0);
        this.method473(arg2, this.field1200, arg0);
        this.method436(arg0, arg2, 7);
        this.method504(-716, arg0, arg2);
        if (arg1) {
            this.field1544 = null;
        }
        for (int var4 = 0; var4 < this.field1311; ++var4) {
            int var6 = this.field1312[var4];
            if (field1433 != this.field1472[var6].field446) {
                this.field1472[var6] = null;
            }
        }
        if (arg0.field698 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field698 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1473; ++var5) {
                if (this.field1472[this.field1474[var5]] == null) {
                    signlink.reporterror(this.field1541 + " null entry in pl list - pos:" + var5 + " size:" + this.field1473);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method426(byte arg0) {
        int var2 = this.field1283;
        int var3 = this.field1284;
        int var4 = this.field1285;
        int var5 = this.field1286;
        int var6 = 6116423;
        Pix2D.method165(var5, 660, var3, var4, var2, var6);
        Pix2D.method165(16, 660, var3 + 1, var4 - 2, var2 + 1, 0);
        Pix2D.method166(var3 + 18, var2 + 1, (byte) -109, var4 - 2, 0, var5 - 19);
        this.field1426.method209(var6, var2 + 3, 9, var3 + 14, "Choose Option");
        int var7 = super.field24;
        int var8 = super.field25;
        if (arg0 != 7) {
            this.field1221 = !this.field1221;
        }
        if (this.field1282 == 0) {
            var7 -= 8;
            var8 -= 11;
        }
        if (this.field1282 == 1) {
            var7 -= 562;
            var8 -= 231;
        }
        if (this.field1282 == 2) {
            var7 -= 22;
            var8 -= 375;
        }
        for (int var9 = 0; var9 < this.field1478; ++var9) {
            int var10 = (this.field1478 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field1426.method211(var11, var10, false, this.field1238[var9], true, var2 + 3);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I)V")
    public final void method9(int arg0) {
        if (!this.field1511 && !this.field1215 && !this.field1578) {
            ++field1552;
            if (arg0 <= 0) {
                this.field1547 = -1;
            }
            if (!this.field1577) {
                this.method424(0);
            } else {
                this.method503(true);
            }
            this.field1212 = 0;
        } else {
            this.method463(-12973);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)Ljava/lang/String;")
    private static final String method427(int arg0, int arg1) {
        if (arg1 != 0) {
            field1341 = !field1341;
        }
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method428(int arg0, int arg1) {
        int var3 = 26 / arg1;
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method429(byte arg0) {
        if (this.field1228 == arg0) {
            ++this.field1444;
            this.method548(true);
            this.method469(this.field1391);
            this.method538((byte) 5);
            this.method489(-888);
            if (!this.field1314) {
                int var2 = this.field1571;
                if (this.field1356 / 256 > var2) {
                    var2 = this.field1356 / 256;
                }
                if (this.field1204[4] && this.field1192[4] + 128 > var2) {
                    var2 = this.field1192[4] + 128;
                }
                int var3 = this.field1572 + this.field1330 & 2047;
                this.method485(this.field1266, var2, var2 * 3 + 600, this.field1265, var3, this.method520(0, this.field1340, field1310.field403, field1310.field402) - 50, 445);
                ++field1575;
                if (field1575 > 1802) {
                    field1575 = 0;
                    this.field1240.method220((byte) 78, 15);
                    this.field1240.method221(0);
                    int var4 = this.field1240.field698;
                    this.field1240.method222(29711);
                    this.field1240.method221(70);
                    this.field1240.method221((int) (Math.random() * 256.0D));
                    this.field1240.method221(242);
                    this.field1240.method221(186);
                    this.field1240.method221(39);
                    this.field1240.method221(61);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field1240.method221(13);
                    }
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field1240.method222(57856);
                    }
                    this.field1240.method222((int) (Math.random() * 65536.0D));
                    this.field1240.method230(this.field1240.field698 - var4, 316);
                }
            }
            int var5;
            if (!this.field1314) {
                var5 = this.method471(false);
            } else {
                var5 = this.method472(true);
            }
            int var6 = this.field1194;
            int var7 = this.field1195;
            int var8 = this.field1196;
            int var9 = this.field1197;
            int var10 = this.field1198;
            for (int var11 = 0; var11 < 5; ++var11) {
                if (this.field1204[var11]) {
                    int var13 = (int) (Math.random() * (double) (this.field1214[var11] * 2 + 1) - (double) this.field1214[var11] + Math.sin((double) this.field1576[var11] / 100.0D * (double) this.field1229[var11]) * (double) this.field1192[var11]);
                    if (var11 == 0) {
                        this.field1194 += var13;
                    }
                    if (var11 == 1) {
                        this.field1195 += var13;
                    }
                    if (var11 == 2) {
                        this.field1196 += var13;
                    }
                    if (var11 == 3) {
                        this.field1198 = this.field1198 + var13 & 2047;
                    }
                    if (var11 == 4) {
                        this.field1197 += var13;
                        if (this.field1197 < 128) {
                            this.field1197 = 128;
                        }
                        if (this.field1197 > 383) {
                            this.field1197 = 383;
                        }
                    }
                }
            }
            int var12 = Pix3D.field649;
            Model.field592 = true;
            Model.field595 = 0;
            Model.field593 = super.field24 - 8;
            Model.field594 = super.field25 - 11;
            Pix2D.method164(296);
            this.field1144.method101(this.field1195, this.field1194, this.field1197, (byte) -8, var5, this.field1198, this.field1196);
            this.field1144.method76(46450);
            this.method484((byte) -17);
            this.method441(true);
            this.method494(false, var12);
            this.method479(false);
            this.field1322.method261(3, 8, super.field17, 11);
            this.field1194 = var6;
            this.field1195 = var7;
            this.field1196 = var8;
            this.field1197 = var9;
            this.field1198 = var10;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method430(int arg0, int arg1) {
        int[] var3 = this.field1344.field657;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field1568[arg0][var24][var6] & 24) == 0) {
                    this.field1144.method97(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field1568[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field1144.method97(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        if (arg1 <= 0) {
            this.field1547 = -1;
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1344.method186((byte) 1);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field1568[arg0][var22][var9] & 24) == 0) {
                    this.method521(this.field1460, var22, var9, var7, arg0, var8);
                }
                if (arg0 < 3 && (this.field1568[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method521(this.field1460, var22, var9, var7, arg0 + 1, var8);
                }
            }
        }
        this.field1322.method260((byte) 1);
        this.field1169 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field1144.method91(this.field1340, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = LocType.method324(var13).field941;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field1187[this.field1340].field1044;
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
                        this.field1579[this.field1169] = this.field1352[var14];
                        this.field1170[this.field1169] = var15;
                        this.field1171[this.field1169] = var16;
                        ++this.field1169;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILd;IIII)V")
    public final void method431(int arg0, int arg1, Component arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 11721) {
            this.field1544 = null;
        }
        if (arg2.field74 == 0 && arg2.field88 != null && !arg2.field87) {
            if (arg0 >= arg4 && arg6 >= arg5 && arg0 <= arg2.field77 + arg4 && arg6 <= arg2.field78 + arg5) {
                int var8 = arg2.field88.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg2.field89[var9] + arg4;
                    int var11 = arg2.field90[var9] + arg5 - arg1;
                    Component var12 = Component.field67[arg2.field88[var9]];
                    int var13 = var12.field79 + var10;
                    int var14 = var12.field80 + var11;
                    if ((var12.field84 >= 0 || var12.field110 != 0) && arg0 >= var13 && arg6 >= var14 && arg0 < var12.field77 + var13 && arg6 < var12.field78 + var14) {
                        if (var12.field84 >= 0) {
                            this.field1167 = var12.field84;
                        } else {
                            this.field1167 = var12.field72;
                        }
                    }
                    if (var12.field74 == 0) {
                        this.method431(arg0, var12.field86, var12, 11721, var13, var14, arg6);
                        if (var12.field85 > var12.field78) {
                            this.method422(var12.field77 + var13, var12.field85, var12.field78, arg6, var14, true, arg0, (byte) 10, var12);
                        }
                    } else {
                        if (var12.field75 == 1 && arg0 >= var13 && arg6 >= var14 && arg0 < var12.field77 + var13 && arg6 < var12.field78 + var14) {
                            boolean var15 = false;
                            if (var12.field76 != 0) {
                                var15 = this.method508(var12, this.field1504);
                            }
                            if (!var15) {
                                this.field1238[this.field1478] = var12.field125;
                                this.field1519[this.field1478] = 951;
                                this.field1518[this.field1478] = var12.field72;
                                ++this.field1478;
                            }
                        }
                        if (var12.field75 == 2 && this.field1485 == 0 && arg0 >= var13 && arg6 >= var14 && arg0 < var12.field77 + var13 && arg6 < var12.field78 + var14) {
                            String var16 = var12.field122;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field1238[this.field1478] = var16 + " @gre@" + var12.field123;
                            this.field1519[this.field1478] = 930;
                            this.field1518[this.field1478] = var12.field72;
                            ++this.field1478;
                        }
                        if (var12.field75 == 3 && arg0 >= var13 && arg6 >= var14 && arg0 < var12.field77 + var13 && arg6 < var12.field78 + var14) {
                            this.field1238[this.field1478] = "Close";
                            this.field1519[this.field1478] = 947;
                            this.field1518[this.field1478] = var12.field72;
                            ++this.field1478;
                        }
                        if (var12.field75 == 4 && arg0 >= var13 && arg6 >= var14 && arg0 < var12.field77 + var13 && arg6 < var12.field78 + var14) {
                            this.field1238[this.field1478] = var12.field125;
                            this.field1519[this.field1478] = 465;
                            this.field1518[this.field1478] = var12.field72;
                            ++this.field1478;
                        }
                        if (var12.field75 == 5 && arg0 >= var13 && arg6 >= var14 && arg0 < var12.field77 + var13 && arg6 < var12.field78 + var14) {
                            this.field1238[this.field1478] = var12.field125;
                            this.field1519[this.field1478] = 960;
                            this.field1518[this.field1478] = var12.field72;
                            ++this.field1478;
                        }
                        if (var12.field75 == 6 && !this.field1316 && arg0 >= var13 && arg6 >= var14 && arg0 < var12.field77 + var13 && arg6 < var12.field78 + var14) {
                            this.field1238[this.field1478] = var12.field125;
                            this.field1519[this.field1478] = 44;
                            this.field1518[this.field1478] = var12.field72;
                            ++this.field1478;
                        }
                        if (var12.field74 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field78; ++var18) {
                                for (int var19 = 0; var19 < var12.field77; ++var19) {
                                    int var20 = (var12.field96 + 32) * var19 + var13;
                                    int var21 = (var12.field97 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field99[var17];
                                        var21 += var12.field100[var17];
                                    }
                                    if (arg0 >= var20 && arg6 >= var21 && arg0 < var20 + 32 && arg6 < var21 + 32) {
                                        this.field1244 = var17;
                                        this.field1245 = var12.field72;
                                        if (var12.field68[var17] > 0) {
                                            ObjType var22 = ObjType.method339(var12.field68[var17] - 1);
                                            if (this.field1453 == 1 && var12.field94) {
                                                if (this.field1455 != var12.field72 || this.field1454 != var17) {
                                                    this.field1238[this.field1478] = "Use " + this.field1457 + " with @lre@" + var22.field998;
                                                    this.field1519[this.field1478] = 881;
                                                    this.field1520[this.field1478] = var22.field996;
                                                    this.field1517[this.field1478] = var17;
                                                    this.field1518[this.field1478] = var12.field72;
                                                    ++this.field1478;
                                                }
                                            } else if (this.field1485 == 1 && var12.field94) {
                                                if ((this.field1487 & 16) == 16) {
                                                    this.field1238[this.field1478] = this.field1488 + " @lre@" + var22.field998;
                                                    this.field1519[this.field1478] = 391;
                                                    this.field1520[this.field1478] = var22.field996;
                                                    this.field1517[this.field1478] = var17;
                                                    this.field1518[this.field1478] = var12.field72;
                                                    ++this.field1478;
                                                }
                                            } else {
                                                if (var12.field94) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field1014 != null && var22.field1014[var23] != null) {
                                                            this.field1238[this.field1478] = var22.field1014[var23] + " @lre@" + var22.field998;
                                                            if (var23 == 3) {
                                                                this.field1519[this.field1478] = 478;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field1519[this.field1478] = 347;
                                                            }
                                                            this.field1520[this.field1478] = var22.field996;
                                                            this.field1517[this.field1478] = var17;
                                                            this.field1518[this.field1478] = var12.field72;
                                                            ++this.field1478;
                                                        } else if (var23 == 4) {
                                                            this.field1238[this.field1478] = "Drop @lre@" + var22.field998;
                                                            this.field1519[this.field1478] = 347;
                                                            this.field1520[this.field1478] = var22.field996;
                                                            this.field1517[this.field1478] = var17;
                                                            this.field1518[this.field1478] = var12.field72;
                                                            ++this.field1478;
                                                        }
                                                    }
                                                }
                                                if (var12.field95) {
                                                    this.field1238[this.field1478] = "Use @lre@" + var22.field998;
                                                    this.field1519[this.field1478] = 188;
                                                    this.field1520[this.field1478] = var22.field996;
                                                    this.field1517[this.field1478] = var17;
                                                    this.field1518[this.field1478] = var12.field72;
                                                    ++this.field1478;
                                                }
                                                if (var12.field94 && var22.field1014 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field1014[var24] != null) {
                                                            this.field1238[this.field1478] = var22.field1014[var24] + " @lre@" + var22.field998;
                                                            if (var24 == 0) {
                                                                this.field1519[this.field1478] = 405;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1519[this.field1478] = 38;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1519[this.field1478] = 422;
                                                            }
                                                            this.field1520[this.field1478] = var22.field996;
                                                            this.field1517[this.field1478] = var17;
                                                            this.field1518[this.field1478] = var12.field72;
                                                            ++this.field1478;
                                                        }
                                                    }
                                                }
                                                if (var12.field101 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field101[var25] != null) {
                                                            this.field1238[this.field1478] = var12.field101[var25] + " @lre@" + var22.field998;
                                                            if (var25 == 0) {
                                                                this.field1519[this.field1478] = 602;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1519[this.field1478] = 596;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1519[this.field1478] = 22;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field1519[this.field1478] = 892;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field1519[this.field1478] = 415;
                                                            }
                                                            this.field1520[this.field1478] = var22.field996;
                                                            this.field1517[this.field1478] = var17;
                                                            this.field1518[this.field1478] = var12.field72;
                                                            ++this.field1478;
                                                        }
                                                    }
                                                }
                                                this.field1238[this.field1478] = "Examine @lre@" + var22.field998;
                                                this.field1519[this.field1478] = 1773;
                                                this.field1520[this.field1478] = var22.field996;
                                                this.field1518[this.field1478] = var12.field69[var17];
                                                ++this.field1478;
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

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method432(byte arg0) {
        this.field1260 = true;
        if (arg0 != 7) {
            this.field1547 = this.field1583.method231();
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1346) {
                ++this.field1364;
                this.method515(-31190);
                this.method515(-31190);
                this.method527(this.field1409);
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
        this.field1260 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I[BZ)V")
    public final void method433(int arg0, byte[] arg1, boolean arg2) {
        int var4 = 9 / arg0;
        signlink.midifade = arg2 ? 1 : 0;
        signlink.midisave(arg1, arg1.length);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BJ)V")
    public final void method434(byte arg0, long arg1) {
        if (arg0 != 9) {
            this.field1544 = null;
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field1365; ++var4) {
                if (this.field1255[var4] == arg1) {
                    --this.field1365;
                    this.field1258 = true;
                    for (int var5 = var4; var5 < this.field1365; ++var5) {
                        this.field1392[var5] = this.field1392[var5 + 1];
                        this.field1512[var5] = this.field1512[var5 + 1];
                        this.field1255[var5] = this.field1255[var5 + 1];
                    }
                    this.field1240.method220((byte) 78, 39);
                    this.field1240.method227(arg1, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method435(byte arg0) {
        this.field1240.method220((byte) 78, 224);
        if (this.field1203 != -1) {
            this.field1203 = -1;
            this.field1258 = true;
            this.field1316 = false;
            this.field1461 = true;
        }
        if (this.field1408 != -1) {
            this.field1408 = -1;
            this.field1463 = true;
            this.field1316 = false;
        }
        this.field1281 = -1;
        if (arg0 != 84) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;II)V")
    private final void method436(Packet arg0, int arg1, int arg2) {
        if (arg2 < this.field1246 || arg2 > this.field1246) {
            this.field1547 = -1;
        }
        while (arg0.field699 + 10 < arg1 * 8) {
            int var4 = arg0.method242(this.field1315, 11);
            if (var4 == 2047) {
                break;
            }
            if (this.field1472[var4] == null) {
                this.field1472[var4] = new PlayerEntity();
                if (this.field1477[var4] != null) {
                    this.field1472[var4].method126(this.field1477[var4], -58);
                }
            }
            this.field1474[this.field1473++] = var4;
            PlayerEntity var5 = this.field1472[var4];
            var5.field446 = field1433;
            int var6 = arg0.method242(this.field1315, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg0.method242(this.field1315, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg0.method242(this.field1315, 1);
            var5.method122(field1310.field450[0] + var6, field1310.field451[0] + var7, var8 == 1, (byte) 9);
            int var9 = arg0.method242(this.field1315, 1);
            if (var9 == 1) {
                this.field1476[this.field1475++] = var4;
            }
        }
        arg0.method243((byte) 0);
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method437(int arg0) {
        int var2 = this.field1426.method208((byte) 2, "Choose Option");
        for (int var3 = 0; var3 < this.field1478; ++var3) {
            int var11 = this.field1426.method208((byte) 2, this.field1238[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        if (arg0 >= 0) {
            this.field1409 = -342;
        }
        var2 += 8;
        int var4 = this.field1478 * 15 + 21;
        if (super.field27 > 8 && super.field28 > 11 && super.field27 < 520 && super.field28 < 345) {
            int var5 = super.field27 - 8 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field28 - 11;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field1521 = true;
            this.field1282 = 0;
            this.field1283 = var5;
            this.field1284 = var6;
            this.field1285 = var2;
            this.field1286 = this.field1478 * 15 + 22;
        }
        if (super.field27 > 562 && super.field28 > 231 && super.field27 < 752 && super.field28 < 492) {
            int var7 = super.field27 - 562 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field28 - 231;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field1521 = true;
            this.field1282 = 1;
            this.field1283 = var7;
            this.field1284 = var8;
            this.field1285 = var2;
            this.field1286 = this.field1478 * 15 + 22;
        }
        if (super.field27 > 22 && super.field28 > 375 && super.field27 < 501 && super.field28 < 471) {
            int var9 = super.field27 - 22 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field28 - 375;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field1521 = true;
            this.field1282 = 2;
            this.field1283 = var9;
            this.field1284 = var10;
            this.field1285 = var2;
            this.field1286 = this.field1478 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method438(int arg0) {
        byte[] var2 = this.field1254.method299("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1298.method260((byte) 1);
        var3.method188(8, 0, 0);
        this.field1299.method260((byte) 1);
        if (arg0 != 0) {
            this.field1240.method221(136);
        }
        var3.method188(8, 0, -661);
        this.field1295.method260((byte) 1);
        var3.method188(8, 0, -128);
        this.field1296.method260((byte) 1);
        var3.method188(8, -386, -214);
        this.field1297.method260((byte) 1);
        var3.method188(8, -186, -214);
        this.field1300.method260((byte) 1);
        var3.method188(8, -265, 0);
        this.field1301.method260((byte) 1);
        var3.method188(8, -265, -574);
        this.field1302.method260((byte) 1);
        var3.method188(8, -186, -128);
        this.field1303.method260((byte) 1);
        var3.method188(8, -186, -574);
        int[] var4 = new int[var3.field658];
        for (int var5 = 0; var5 < var3.field659; ++var5) {
            for (int var10 = 0; var10 < var3.field658; ++var10) {
                var4[var10] = var3.field657[var3.field658 * var5 + (var3.field658 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field658; ++var11) {
                var3.field657[var3.field658 * var5 + var11] = var4[var11];
            }
        }
        this.field1298.method260((byte) 1);
        var3.method188(8, 0, 394);
        this.field1299.method260((byte) 1);
        var3.method188(8, 0, -267);
        this.field1295.method260((byte) 1);
        var3.method188(8, 0, 266);
        this.field1296.method260((byte) 1);
        var3.method188(8, -386, 180);
        this.field1297.method260((byte) 1);
        var3.method188(8, -186, 180);
        this.field1300.method260((byte) 1);
        var3.method188(8, -265, 394);
        this.field1301.method260((byte) 1);
        var3.method188(8, -265, -180);
        this.field1302.method260((byte) 1);
        var3.method188(8, -186, 212);
        this.field1303.method260((byte) 1);
        var3.method188(8, -186, -180);
        Pix32 var6 = new Pix32(this.field1254, "logo", 0);
        this.field1295.method260((byte) 1);
        var6.method190(18, 217, super.field15 / 2 - var6.field658 / 2 - 128);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
        if (Linkable.field369) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;I)Z")
    public final boolean method439(Component arg0, int arg1) {
        if (arg0.field82 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field82.length; ++var3) {
                int var4 = this.method531(var3, true, arg0);
                int var5 = arg0.field83[var3];
                if (arg0.field82[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field82[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field82[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg1 < 3 || arg1 > 3) {
                this.field1386 = 47;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIB)V")
    private final void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 == 9) {
            boolean var9 = false;
        } else {
            this.field1547 = -1;
        }
        if (arg2 >= 1 && arg1 >= 1 && arg2 <= 102 && arg1 <= 102) {
            if (field1233 && this.field1340 != arg5) {
                return;
            }
            int var10 = 0;
            boolean var11 = true;
            boolean var12 = false;
            boolean var13 = false;
            if (arg0 == 0) {
                var10 = this.field1144.method88(arg5, arg2, arg1);
            }
            if (arg0 == 1) {
                var10 = this.field1144.method89(arg2, this.field1221, arg1, arg5);
            }
            if (arg0 == 2) {
                var10 = this.field1144.method90(arg5, arg2, arg1);
            }
            if (arg0 == 3) {
                var10 = this.field1144.method91(arg5, arg2, arg1);
            }
            if (var10 != 0) {
                int var14 = this.field1144.method92(arg5, arg2, arg1, var10);
                int var15 = var10 >> 14 & 32767;
                int var16 = var14 & 31;
                int var17 = var14 >> 6;
                if (arg0 == 0) {
                    this.field1144.method79(arg5, -47761, arg1, arg2);
                    LocType var18 = LocType.method324(var15);
                    if (var18.field929) {
                        this.field1187[arg5].method355(var18.field930, 7, var16, var17, arg2, arg1);
                    }
                }
                if (arg0 == 1) {
                    this.field1144.method80(arg2, arg5, true, arg1);
                }
                if (arg0 == 2) {
                    this.field1144.method81(arg2, arg1, (byte) 75, arg5);
                    LocType var19 = LocType.method324(var15);
                    if (var19.field927 + arg2 > 103 || var19.field927 + arg1 > 103 || var19.field928 + arg2 > 103 || var19.field928 + arg1 > 103) {
                        return;
                    }
                    if (var19.field929) {
                        this.field1187[arg5].method356(var19.field927, (byte) 7, var17, var19.field930, arg2, var19.field928, arg1);
                    }
                }
                if (arg0 == 3) {
                    this.field1144.method82(arg1, arg2, true, arg5);
                    LocType var20 = LocType.method324(var15);
                    if (var20.field929 && var20.field931) {
                        this.field1187[arg5].method358(this.field1496, arg1, arg2);
                    }
                }
            }
            if (arg4 >= 0) {
                int var21 = arg5;
                if (arg5 < 3 && (this.field1568[1][arg2][arg1] & 2) == 2) {
                    var21 = arg5 + 1;
                }
                World.method31(982, arg4, arg6, arg1, arg5, this.field1241, var21, this.field1187[arg5], arg3, this.field1144, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method441(boolean arg0) {
        if (this.field1565 == 2) {
            this.method517((this.field1559 - this.field1261 << 7) + this.field1562, (this.field1560 - this.field1262 << 7) + this.field1563, this.field1561 * 2, false);
            this.field1577 &= arg0;
            if (this.field1497 > -1 && field1433 % 20 < 10) {
                this.field1182[2].method190(this.field1498 - 28, 217, this.field1497 - 12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)Z")
    public final boolean method442(int arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg0 < 0) {
            return false;
        } else {
            int var4 = this.field1519[arg0];
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            return var4 == 406;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method443(int arg0) {
        if (arg0 <= 0) {
            this.field1547 = this.field1583.method231();
        }
        if (this.field1291 == 0) {
            int var2 = super.field26;
            if (this.field1485 == 1 && super.field27 >= 520 && super.field28 >= 165 && super.field27 <= 788 && super.field28 <= 230) {
                var2 = 0;
            }
            if (this.field1521) {
                if (var2 != 1) {
                    int var3 = super.field24;
                    int var4 = super.field25;
                    if (this.field1282 == 0) {
                        var3 -= 8;
                        var4 -= 11;
                    }
                    if (this.field1282 == 1) {
                        var3 -= 562;
                        var4 -= 231;
                    }
                    if (this.field1282 == 2) {
                        var3 -= 22;
                        var4 -= 375;
                    }
                    if (var3 < this.field1283 - 10 || var3 > this.field1285 + this.field1283 + 10 || var4 < this.field1284 - 10 || var4 > this.field1286 + this.field1284 + 10) {
                        this.field1521 = false;
                        if (this.field1282 == 1) {
                            this.field1258 = true;
                        }
                        if (this.field1282 == 2) {
                            this.field1463 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field1283;
                    int var6 = this.field1284;
                    int var7 = this.field1285;
                    int var8 = super.field27;
                    int var9 = super.field28;
                    if (this.field1282 == 0) {
                        var8 -= 8;
                        var9 -= 11;
                    }
                    if (this.field1282 == 1) {
                        var8 -= 562;
                        var9 -= 231;
                    }
                    if (this.field1282 == 2) {
                        var8 -= 22;
                        var9 -= 375;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field1478; ++var11) {
                        int var12 = (this.field1478 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method486(7, var10);
                    }
                    this.field1521 = false;
                    if (this.field1282 == 1) {
                        this.field1258 = true;
                    }
                    if (this.field1282 == 2) {
                        this.field1463 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field1478 > 0) {
                    int var13 = this.field1519[this.field1478 - 1];
                    if (var13 == 602 || var13 == 596 || var13 == 22 || var13 == 892 || var13 == 415 || var13 == 405 || var13 == 38 || var13 == 422 || var13 == 478 || var13 == 347 || var13 == 188) {
                        int var14 = this.field1517[this.field1478 - 1];
                        int var15 = this.field1518[this.field1478 - 1];
                        Component var16 = Component.field67[var15];
                        if (var16.field93) {
                            this.field1288 = false;
                            this.field1570 = 0;
                            this.field1289 = var15;
                            this.field1290 = var14;
                            this.field1291 = 2;
                            this.field1292 = super.field27;
                            this.field1293 = super.field28;
                            if (Component.field67[var15].field73 == this.field1281) {
                                this.field1291 = 1;
                            }
                            if (Component.field67[var15].field73 == this.field1408) {
                                this.field1291 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field1178 == 1 || this.method442(this.field1478 - 1, false)) && this.field1478 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field1478 > 0) {
                    this.method486(7, this.field1478 - 1);
                }
                if (var2 != 2 || this.field1478 <= 0) {
                    return;
                }
                this.method437(-819);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method444(boolean arg0, int arg1) {
        if (!arg0) {
            int var3 = VarpType.field1112[arg1].field1120;
            if (var3 != 0) {
                int var4 = this.field1256[arg1];
                if (var3 == 1) {
                    if (var4 == 1) {
                        Pix3D.method178((byte) 8, 0.9D);
                    }
                    if (var4 == 2) {
                        Pix3D.method178((byte) 8, 0.8D);
                    }
                    if (var4 == 3) {
                        Pix3D.method178((byte) 8, 0.7D);
                    }
                    if (var4 == 4) {
                        Pix3D.method178((byte) 8, 0.6D);
                    }
                    ObjType.field1032.method115();
                    this.field1380 = true;
                }
                if (var3 == 3) {
                    boolean var5 = this.field1201;
                    if (var4 == 0) {
                        this.method448(this.field1201, 0, this.field1272);
                        this.field1201 = true;
                    }
                    if (var4 == 1) {
                        this.method448(this.field1201, -400, this.field1272);
                        this.field1201 = true;
                    }
                    if (var4 == 2) {
                        this.method448(this.field1201, -800, this.field1272);
                        this.field1201 = true;
                    }
                    if (var4 == 3) {
                        this.method448(this.field1201, -1200, this.field1272);
                        this.field1201 = true;
                    }
                    if (var4 == 4) {
                        this.field1201 = false;
                    }
                    if (this.field1201 != var5 && !field1233) {
                        if (this.field1201) {
                            this.field1226 = this.field1191;
                            this.field1227 = false;
                            this.field1410.method279(2, this.field1226);
                        } else {
                            this.method544(true);
                        }
                        this.field1357 = 0;
                    }
                }
                if (var3 == 4) {
                    if (var4 == 0) {
                        this.field1186 = true;
                        this.method507(-552, 0);
                    }
                    if (var4 == 1) {
                        this.field1186 = true;
                        this.method507(-552, -400);
                    }
                    if (var4 == 2) {
                        this.field1186 = true;
                        this.method507(-552, -800);
                    }
                    if (var4 == 3) {
                        this.field1186 = true;
                        this.method507(-552, -1200);
                    }
                    if (var4 == 4) {
                        this.field1186 = false;
                    }
                }
                if (var3 == 5) {
                    this.field1178 = var4;
                }
                if (var3 == 6) {
                    this.field1528 = var4;
                }
                if (var3 == 8) {
                    this.field1545 = var4;
                    this.field1463 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)Ljava/lang/String;")
    private static final String method445(boolean arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (!arg0) {
            field1508 = -20;
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method446(int arg0) {
        for (int var2 = -1; var2 < this.field1473; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1471;
            } else {
                var6 = this.field1474[var2];
            }
            PlayerEntity var7 = this.field1472[var6];
            if (var7 != null && var7.field415 > 0) {
                --var7.field415;
                if (var7.field415 == 0) {
                    var7.field414 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field1404; ++var3) {
            int var4 = this.field1405[var3];
            NpcEntity var5 = this.field1403[var4];
            if (var5 != null && var5.field415 > 0) {
                --var5.field415;
                if (var5.field415 == 0) {
                    var5.field414 = null;
                }
            }
        }
        this.field1546 += arg0;
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method447(int arg0) {
        this.field1546 += arg0;
        if (super.field26 == 1) {
            if (super.field27 >= 549 && super.field27 <= 583 && super.field28 >= 195 && super.field28 < 231 && this.field1354[0] != -1) {
                this.field1258 = true;
                this.field1353 = 0;
                this.field1461 = true;
            }
            if (super.field27 >= 579 && super.field27 <= 609 && super.field28 >= 194 && super.field28 < 231 && this.field1354[1] != -1) {
                this.field1258 = true;
                this.field1353 = 1;
                this.field1461 = true;
            }
            if (super.field27 >= 607 && super.field27 <= 637 && super.field28 >= 194 && super.field28 < 231 && this.field1354[2] != -1) {
                this.field1258 = true;
                this.field1353 = 2;
                this.field1461 = true;
            }
            if (super.field27 >= 635 && super.field27 <= 679 && super.field28 >= 194 && super.field28 < 229 && this.field1354[3] != -1) {
                this.field1258 = true;
                this.field1353 = 3;
                this.field1461 = true;
            }
            if (super.field27 >= 676 && super.field27 <= 706 && super.field28 >= 194 && super.field28 < 231 && this.field1354[4] != -1) {
                this.field1258 = true;
                this.field1353 = 4;
                this.field1461 = true;
            }
            if (super.field27 >= 704 && super.field27 <= 734 && super.field28 >= 194 && super.field28 < 231 && this.field1354[5] != -1) {
                this.field1258 = true;
                this.field1353 = 5;
                this.field1461 = true;
            }
            if (super.field27 >= 732 && super.field27 <= 766 && super.field28 >= 195 && super.field28 < 231 && this.field1354[6] != -1) {
                this.field1258 = true;
                this.field1353 = 6;
                this.field1461 = true;
            }
            if (super.field27 >= 550 && super.field27 <= 584 && super.field28 >= 492 && super.field28 < 528 && this.field1354[7] != -1) {
                this.field1258 = true;
                this.field1353 = 7;
                this.field1461 = true;
            }
            if (super.field27 >= 582 && super.field27 <= 612 && super.field28 >= 492 && super.field28 < 529 && this.field1354[8] != -1) {
                this.field1258 = true;
                this.field1353 = 8;
                this.field1461 = true;
            }
            if (super.field27 >= 609 && super.field27 <= 639 && super.field28 >= 492 && super.field28 < 529 && this.field1354[9] != -1) {
                this.field1258 = true;
                this.field1353 = 9;
                this.field1461 = true;
            }
            if (super.field27 >= 637 && super.field27 <= 681 && super.field28 >= 493 && super.field28 < 528 && this.field1354[10] != -1) {
                this.field1258 = true;
                this.field1353 = 10;
                this.field1461 = true;
            }
            if (super.field27 >= 679 && super.field27 <= 709 && super.field28 >= 492 && super.field28 < 529 && this.field1354[11] != -1) {
                this.field1258 = true;
                this.field1353 = 11;
                this.field1461 = true;
            }
            if (super.field27 >= 706 && super.field27 <= 736 && super.field28 >= 492 && super.field28 < 529 && this.field1354[12] != -1) {
                this.field1258 = true;
                this.field1353 = 12;
                this.field1461 = true;
            }
            if (super.field27 >= 734 && super.field27 <= 768 && super.field28 >= 492 && super.field28 < 528 && this.field1354[13] != -1) {
                this.field1258 = true;
                this.field1353 = 13;
                this.field1461 = true;
            }
            ++field1513;
            if (field1513 > 150) {
                field1513 = 0;
                this.field1240.method220((byte) 78, 43);
                this.field1240.method221(43);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZII)V")
    public final void method448(boolean arg0, int arg1, int arg2) {
        signlink.midivol = arg1;
        this.field1546 += arg2;
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)V")
    public final void method449(int arg0, byte arg1, String arg2, String arg3) {
        if (arg0 == 0 && this.field1431 != -1) {
            this.field1465 = arg3;
            super.field26 = 0;
        }
        if (this.field1408 == -1) {
            this.field1463 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1304[var5] = this.field1304[var5 - 1];
            this.field1305[var5] = this.field1305[var5 - 1];
            this.field1306[var5] = this.field1306[var5 - 1];
        }
        this.field1304[0] = arg0;
        if (arg1 != 3) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        this.field1305[0] = arg2;
        this.field1306[0] = arg3;
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method450(int arg0) {
        if (arg0 != -42794) {
            this.field1430 = this.field1274.method295();
        }
        while (true) {
            OnDemandRequest var2 = this.field1410.method281();
            if (var2 == null) {
                return;
            }
            if (var2.field710 == 0) {
                Model.method133(var2.field712, -850, var2.field711);
                if ((this.field1410.method278(0, var2.field711) & 98) != 0) {
                    this.field1258 = true;
                    if (this.field1408 != -1) {
                        this.field1463 = true;
                    }
                }
            }
            if (var2.field710 == 1 && var2.field712 != null) {
                AnimFrame.method58(-137, var2.field712);
            }
            if (var2.field710 == 2 && this.field1226 == var2.field711 && var2.field712 != null) {
                this.method433(678, var2.field712, this.field1227);
            }
            if (var2.field710 == 3 && this.field1505 == 1) {
                for (int var3 = 0; var3 < this.field1480.length; ++var3) {
                    if (this.field1435[var3] == var2.field711) {
                        this.field1480[var3] = var2.field712;
                        if (var2.field712 == null) {
                            this.field1435[var3] = -1;
                        }
                        break;
                    }
                    if (this.field1436[var3] == var2.field711) {
                        this.field1313[var3] = var2.field712;
                        if (var2.field712 == null) {
                            this.field1436[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field710 == 93 && this.field1410.method277(var2.field711, false)) {
                World.method17(new Packet(var2.field712, true), this.field1410, false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method451(byte arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (field1233 && this.field1505 == 2 && World.field41 != this.field1340) {
            this.field1322.method260((byte) 1);
            this.field1425.method206(this.field1539, "Loading - please wait.", 257, 151, 0);
            this.field1425.method206(this.field1539, "Loading - please wait.", 256, 150, 16777215);
            this.field1322.method261(3, 8, super.field17, 11);
            this.field1505 = 1;
            this.field1450 = System.currentTimeMillis();
        }
        if (this.field1505 == 1) {
            int var3 = this.method452((byte) -11);
            if (var3 != 0 && System.currentTimeMillis() - this.field1450 > 360000L) {
                signlink.reporterror(this.field1541 + " glcfb " + this.field1247 + "," + var3 + "," + field1233 + "," + this.field1220[0] + "," + this.field1410.method280() + "," + this.field1340 + "," + this.field1252 + "," + this.field1253);
                this.field1450 = System.currentTimeMillis();
            }
        }
        if (this.field1505 == 2 && this.field1368 != this.field1340) {
            this.field1368 = this.field1340;
            this.method430(this.field1340, 6);
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)I")
    public final int method452(byte arg0) {
        for (int var2 = 0; var2 < this.field1480.length; ++var2) {
            if (this.field1480[var2] == null && this.field1435[var2] != -1) {
                return -1;
            }
            if (this.field1313[var2] == null && this.field1436[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1480.length; ++var4) {
            byte[] var6 = this.field1313[var4];
            if (var6 != null) {
                int var7 = (this.field1434[var4] >> 8) * 64 - this.field1261;
                int var8 = (this.field1434[var4] & 255) * 64 - this.field1262;
                var3 &= World.method16(var8, var7, var6, -179);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field1566) {
            return -4;
        } else {
            this.field1505 = 2;
            if (arg0 != -11) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
            World.field41 = this.field1340;
            this.method505(this.field1216);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILmb;)V")
    private final void method453(boolean arg0, int arg1, Packet arg2) {
        if (!arg0) {
            while (arg2.field699 + 21 < arg1 * 8) {
                int var4 = arg2.method242(this.field1315, 13);
                if (var4 == 8191) {
                    break;
                }
                if (this.field1403[var4] == null) {
                    this.field1403[var4] = new NpcEntity();
                }
                NpcEntity var5 = this.field1403[var4];
                this.field1405[this.field1404++] = var4;
                var5.field446 = field1433;
                var5.field456 = NpcType.method333(arg2.method242(this.field1315, 11));
                var5.field406 = var5.field456.field965;
                var5.field409 = var5.field456.field969;
                var5.field410 = var5.field456.field970;
                var5.field411 = var5.field456.field971;
                var5.field412 = var5.field456.field972;
                var5.field407 = var5.field456.field968;
                int var6 = arg2.method242(this.field1315, 5);
                if (var6 > 15) {
                    var6 -= 32;
                }
                int var7 = arg2.method242(this.field1315, 5);
                if (var7 > 15) {
                    var7 -= 32;
                }
                var5.method122(field1310.field450[0] + var6, field1310.field451[0] + var7, false, (byte) 9);
                int var8 = arg2.method242(this.field1315, 1);
                if (var8 == 1) {
                    this.field1476[this.field1475++] = var4;
                }
            }
            arg2.method243((byte) 0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IIBILjava/lang/String;)Lyb;")
    public final Jagfile method454(String arg0, int arg1, int arg2, byte arg3, int arg4, String arg5) {
        byte[] var7 = null;
        if (arg3 == 7) {
            boolean var8 = false;
        } else {
            this.method6();
        }
        int var9 = 5;
        try {
            if (this.field1220[0] != null) {
                var7 = this.field1220[0].method291(3251, arg4);
            }
        } catch (Exception var29) {
        }
        if (var7 != null) {
            this.field1378.reset();
            this.field1378.update(var7);
            int var10 = (int) this.field1378.getValue();
            if (arg1 != var10) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(var7, true);
        } else {
            int var12 = 0;
            while (var7 == null) {
                this.method13("Requesting " + arg5, (byte) 4, arg2);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method493(arg0 + arg1);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    Packet var17 = new Packet(var16, true);
                    var17.field698 = 3;
                    int var18 = var17.method235() + 6;
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
                            throw new IOException("EOF");
                        }
                        var19 += var22;
                        int var23 = var19 * 100 / var18;
                        if (var14 != var23) {
                            this.method13("Loading " + arg5 + " - " + var23 + "%", (byte) 4, arg2);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field1220[0] != null) {
                            this.field1220[0].method292(arg4, var7.length, var7, (byte) -83);
                        }
                    } catch (Exception var28) {
                        this.field1220[0] = null;
                    }
                    if (var7 != null) {
                        this.field1378.reset();
                        this.field1378.update(var7);
                        int var24 = (int) this.field1378.getValue();
                        if (arg1 != var24) {
                            var7 = null;
                            ++var12;
                        }
                    }
                } catch (IOException var30) {
                    var7 = null;
                } catch (Exception var31) {
                    var7 = null;
                    if (!signlink.reporterror) {
                        return null;
                    }
                }
                if (var7 == null) {
                    for (int var25 = var9; var25 > 0; --var25) {
                        if (var12 >= 3) {
                            this.method13("Game updated - please reload page", (byte) 4, arg2);
                            var25 = 10;
                        } else {
                            this.method13("Error loading - Will retry in " + var25 + " secs.", (byte) 4, arg2);
                        }
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception var27) {
                        }
                    }
                    var9 *= 2;
                    if (var9 > 60) {
                        var9 = 60;
                    }
                }
            }
            return new Jagfile(var7, true);
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public static final void method455(byte arg0) {
        if (arg0 == -102) {
            World3D.field292 = true;
            Pix3D.field629 = true;
            field1233 = true;
            World.field40 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZILmb;)V")
    private final void method456(boolean arg0, int arg1, Packet arg2) {
        arg2.method241(0);
        int var4 = arg2.method242(this.field1315, 1);
        if (var4 != 0) {
            int var5 = arg2.method242(this.field1315, 2);
            if (arg0) {
                for (int var6 = 1; var6 > 0; ++var6) {
                }
            }
            if (var5 == 0) {
                this.field1476[this.field1475++] = this.field1471;
            } else if (var5 == 1) {
                int var7 = arg2.method242(this.field1315, 3);
                field1310.method123(var7, false, (byte) 43);
                int var8 = arg2.method242(this.field1315, 1);
                if (var8 == 1) {
                    this.field1476[this.field1475++] = this.field1471;
                }
            } else if (var5 == 2) {
                int var9 = arg2.method242(this.field1315, 3);
                field1310.method123(var9, true, (byte) 43);
                int var10 = arg2.method242(this.field1315, 3);
                field1310.method123(var10, true, (byte) 43);
                int var11 = arg2.method242(this.field1315, 1);
                if (var11 == 1) {
                    this.field1476[this.field1475++] = this.field1471;
                }
            } else if (var5 == 3) {
                this.field1340 = arg2.method242(this.field1315, 2);
                int var12 = arg2.method242(this.field1315, 7);
                int var13 = arg2.method242(this.field1315, 7);
                int var14 = arg2.method242(this.field1315, 1);
                field1310.method122(var12, var13, var14 == 1, (byte) 9);
                int var15 = arg2.method242(this.field1315, 1);
                if (var15 == 1) {
                    this.field1476[this.field1475++] = this.field1471;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method457(byte arg0) {
        this.field1382 = new Pix8(this.field1254, "titlebox", 0);
        this.field1383 = new Pix8(this.field1254, "titlebutton", 0);
        if (arg0 == 38) {
            this.field1557 = new Pix8[12];
            for (int var2 = 0; var2 < 12; ++var2) {
                this.field1557[var2] = new Pix8(this.field1254, "runes", var2);
            }
            this.field1269 = new Pix32(128, 265);
            this.field1270 = new Pix32(128, 265);
            for (int var3 = 0; var3 < 33920; ++var3) {
                this.field1269.field657[var3] = this.field1298.field737[var3];
            }
            for (int var4 = 0; var4 < 33920; ++var4) {
                this.field1270.field657[var4] = this.field1299.field737[var4];
            }
            this.field1337 = new int[256];
            for (int var5 = 0; var5 < 64; ++var5) {
                this.field1337[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; ++var6) {
                this.field1337[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; ++var7) {
                this.field1337[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; ++var8) {
                this.field1337[var8 + 192] = 16777215;
            }
            this.field1338 = new int[256];
            for (int var9 = 0; var9 < 64; ++var9) {
                this.field1338[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; ++var10) {
                this.field1338[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; ++var11) {
                this.field1338[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; ++var12) {
                this.field1338[var12 + 192] = 16777215;
            }
            this.field1339 = new int[256];
            for (int var13 = 0; var13 < 64; ++var13) {
                this.field1339[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; ++var14) {
                this.field1339[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; ++var15) {
                this.field1339[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; ++var16) {
                this.field1339[var16 + 192] = 16777215;
            }
            this.field1336 = new int[256];
            this.field1388 = new int[32768];
            this.field1389 = new int[32768];
            this.method488(true, (Pix8) null);
            this.field1500 = new int[32768];
            this.field1501 = new int[32768];
            this.method13("Connecting to fileserver", (byte) 4, 10);
            if (!this.field1346) {
                this.field1479 = true;
                this.field1346 = true;
                this.method12(this, 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method458(int arg0) {
        if (this.field1309 != arg0) {
            this.field1547 = this.field1583.method231();
        }
        try {
            int var2 = field1310.field402 + this.field1348;
            int var3 = field1310.field403 + this.field1374;
            if (this.field1265 - var2 < -500 || this.field1265 - var2 > 500 || this.field1266 - var3 < -500 || this.field1266 - var3 > 500) {
                this.field1265 = var2;
                this.field1266 = var3;
            }
            if (this.field1265 != var2) {
                this.field1265 += (var2 - this.field1265) / 16;
            }
            if (this.field1266 != var3) {
                this.field1266 += (var3 - this.field1266) / 16;
            }
            if (super.field29[1] == 1) {
                this.field1573 += (-24 - this.field1573) / 2;
            } else if (super.field29[2] == 1) {
                this.field1573 += (24 - this.field1573) / 2;
            } else {
                this.field1573 /= 2;
            }
            if (super.field29[3] == 1) {
                this.field1574 += (12 - this.field1574) / 2;
            } else if (super.field29[4] == 1) {
                this.field1574 += (-12 - this.field1574) / 2;
            } else {
                this.field1574 /= 2;
            }
            this.field1572 = this.field1573 / 2 + this.field1572 & 2047;
            this.field1571 += this.field1574 / 2;
            if (this.field1571 < 128) {
                this.field1571 = 128;
            }
            if (this.field1571 > 383) {
                this.field1571 = 383;
            }
            int var4 = this.field1265 >> 7;
            int var5 = this.field1266 >> 7;
            int var6 = this.method520(0, this.field1340, this.field1266, this.field1265);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field1340;
                        if (var10 < 3 && (this.field1568[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field1241[var10][var8][var9];
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
            if (var12 > this.field1356) {
                this.field1356 += (var12 - this.field1356) / 24;
            } else if (var12 < this.field1356) {
                this.field1356 += (var12 - this.field1356) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field1310.field402 + "," + field1310.field403 + "," + this.field1265 + "," + this.field1266 + "," + this.field1252 + "," + this.field1253 + "," + this.field1261 + "," + this.field1262);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method459(byte arg0) {
        try {
            if (this.field1554 != null) {
                this.field1554.method37();
            }
        } catch (Exception var4) {
        }
        this.field1554 = null;
        this.field1577 = false;
        this.field1377 = 0;
        this.field1541 = "";
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            this.field1544 = null;
        }
        this.field1542 = "";
        InputTracking.method44((byte) 3);
        this.method481(false);
        this.field1144.method62(this.field1510);
        for (int var3 = 0; var3 < 4; ++var3) {
            this.field1187[var3].method350(this.field1367);
        }
        System.gc();
        this.method544(true);
        this.field1191 = -1;
        this.field1226 = -1;
        this.field1357 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIZIIIIIIII)Z")
    public final boolean method460(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1242[var15][var35] = 0;
                this.field1361[var15][var35] = 99999999;
            }
        }
        int var16 = arg11;
        int var17 = arg4;
        if (!arg1) {
            this.field1543 = -188;
        }
        this.field1242[arg11][arg4] = 99;
        this.field1361[arg11][arg4] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1183[var18] = arg11;
        int var36 = var18 + 1;
        this.field1184[var18] = arg4;
        boolean var20 = false;
        int var21 = this.field1183.length;
        int[][] var22 = this.field1187[this.field1340].field1044;
        while (var36 != var19) {
            var16 = this.field1183[var19];
            var17 = this.field1184[var19];
            var19 = (var19 + 1) % var21;
            if (arg0 == var16 && arg6 == var17) {
                var20 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && this.field1187[this.field1340].method359(-324, arg6, arg9 - 1, arg5, var17, var16, arg0)) {
                    var20 = true;
                    break;
                }
                if (arg9 < 10 && this.field1187[this.field1340].method360(var17, arg6, arg9 - 1, arg0, this.field1537, arg5, var16)) {
                    var20 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg10 != 0 && this.field1187[this.field1340].method361(var16, arg2, arg0, arg6, var17, (byte) -14, arg8, arg10)) {
                var20 = true;
                break;
            }
            int var34 = this.field1361[var16][var17] + 1;
            if (var16 > 0 && this.field1242[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1183[var36] = var16 - 1;
                this.field1184[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1242[var16 - 1][var17] = 2;
                this.field1361[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1242[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1183[var36] = var16 + 1;
                this.field1184[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1242[var16 + 1][var17] = 8;
                this.field1361[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1242[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1183[var36] = var16;
                this.field1184[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1242[var16][var17 - 1] = 1;
                this.field1361[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1242[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1183[var36] = var16;
                this.field1184[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1242[var16][var17 + 1] = 4;
                this.field1361[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1242[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1183[var36] = var16 - 1;
                this.field1184[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1242[var16 - 1][var17 - 1] = 3;
                this.field1361[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1242[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1183[var36] = var16 + 1;
                this.field1184[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1242[var16 + 1][var17 - 1] = 9;
                this.field1361[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1242[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1183[var36] = var16 - 1;
                this.field1184[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1242[var16 - 1][var17 + 1] = 6;
                this.field1361[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1242[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1183[var36] = var16 + 1;
                this.field1184[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1242[var16 + 1][var17 + 1] = 12;
                this.field1361[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1503 = 0;
        if (!var20) {
            if (arg3) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg0 - var24; var25 <= arg0 + var24; ++var25) {
                        for (int var26 = arg6 - var24; var26 <= arg6 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1361[var25][var26] < var23) {
                                var23 = this.field1361[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1503 = 1;
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
        this.field1183[var27] = var16;
        int var37 = var27 + 1;
        this.field1184[var27] = var17;
        int var28;
        int var29 = var28 = this.field1242[var16][var17];
        while (arg11 != var16 || arg4 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1183[var37] = var16;
                this.field1184[var37++] = var17;
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
            var29 = this.field1242[var16][var17];
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
            int var31 = this.field1183[var37];
            int var32 = this.field1184[var37];
            if (arg7 == 0) {
                this.field1240.method220((byte) 78, 222);
                this.field1240.method221(var30 + var30 + 3);
            }
            if (arg7 == 1) {
                this.field1240.method220((byte) 78, 201);
                this.field1240.method221(var30 + var30 + 3 + 14);
            }
            if (arg7 == 2) {
                this.field1240.method220((byte) 78, 140);
                this.field1240.method221(var30 + var30 + 3);
            }
            if (super.field29[5] == 1) {
                this.field1240.method221(1);
            } else {
                this.field1240.method221(0);
            }
            this.field1240.method222(this.field1261 + var31);
            this.field1240.method222(this.field1262 + var32);
            this.field1342 = this.field1183[0];
            this.field1343 = this.field1184[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1240.method221(this.field1183[var37] - var31);
                this.field1240.method221(this.field1184[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZIII)V")
    public final void method461(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        this.field1279.method204(arg1, 217, arg4);
        this.field1280.method204(arg1 + arg5 - 16, 217, arg4);
        Pix2D.method165(arg5 - 32, 660, arg1 + 16, 16, arg4, this.field1451);
        int var7 = (arg5 - 32) * arg5 / arg3;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - 32 - var7) * arg0 / (arg3 - arg5);
        Pix2D.method165(var7, 660, arg1 + 16 + var8, 16, arg4, this.field1540);
        Pix2D.method168(this.field1506, arg1 + 16 + var8, var7, 0, arg4);
        Pix2D.method168(this.field1506, arg1 + 16 + var8, var7, 0, arg4 + 1);
        if (arg2) {
            this.field1544 = null;
        }
        Pix2D.method167(arg4, arg1 + 16 + var8, 16, this.field1308, this.field1506);
        Pix2D.method167(arg4, arg1 + 17 + var8, 16, this.field1308, this.field1506);
        Pix2D.method168(this.field1381, arg1 + 16 + var8, var7, 0, arg4 + 15);
        Pix2D.method168(this.field1381, arg1 + 17 + var8, var7 - 1, 0, arg4 + 14);
        Pix2D.method167(arg4, arg1 + 15 + var8 + var7, 16, this.field1308, this.field1381);
        Pix2D.method167(arg4 + 1, arg1 + 14 + var8 + var7, 15, this.field1308, this.field1381);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        if (signlink.sunjava) {
            super.field11 = 5;
        }
        if (field1176) {
            this.field1511 = true;
        } else {
            field1176 = true;
            boolean var1 = false;
            String var2 = this.method476(false);
            if (var2.endsWith("jagex.com")) {
                var1 = true;
            }
            if (var2.endsWith("runescape.com")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.2")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.249")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.252")) {
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
                this.field1578 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1220[var3] = new FileStream(500000, signlink.cache_dat, var3 + 1, signlink.cache_idx[var3], (byte) 4);
                    }
                }
                try {
                    int var4 = 5;
                    this.field1145[8] = 0;
                    while (this.field1145[8] == 0) {
                        this.method13("Connecting to web server", (byte) 4, 20);
                        try {
                            DataInputStream var5 = this.method493("crc" + (int) (Math.random() * 9.9999999E7D));
                            Packet var6 = new Packet(new byte[36], true);
                            var5.readFully(var6.field697, 0, 36);
                            for (int var7 = 0; var7 < 9; ++var7) {
                                this.field1145[var7] = var6.method236();
                            }
                            var5.close();
                        } catch (IOException var82) {
                            for (int var8 = var4; var8 > 0; --var8) {
                                this.method13("Error loading - Will retry in " + var8 + " secs.", (byte) 4, 10);
                                try {
                                    Thread.sleep(1000L);
                                } catch (Exception var77) {
                                }
                            }
                            var4 *= 2;
                            if (var4 > 60) {
                                var4 = 60;
                            }
                        }
                    }
                    this.field1254 = this.method454("title", this.field1145[1], 25, (byte) 7, 1, "title screen");
                    this.field1424 = new PixFont((byte) 121, "p11", this.field1254);
                    this.field1425 = new PixFont((byte) 121, "p12", this.field1254);
                    this.field1426 = new PixFont((byte) 121, "b12", this.field1254);
                    this.field1427 = new PixFont((byte) 121, "q8", this.field1254);
                    this.method438(0);
                    this.method457(field1211);
                    Jagfile var9 = this.method454("config", this.field1145[2], 30, (byte) 7, 2, "config");
                    Jagfile var10 = this.method454("interface", this.field1145[3], 35, (byte) 7, 3, "interface");
                    Jagfile var11 = this.method454("media", this.field1145[4], 40, (byte) 7, 4, "2d graphics");
                    Jagfile var12 = this.method454("textures", this.field1145[6], 45, (byte) 7, 6, "textures");
                    Jagfile var13 = this.method454("wordenc", this.field1145[7], 50, (byte) 7, 7, "chat system");
                    Jagfile var14 = this.method454("sounds", this.field1145[8], 55, (byte) 7, 8, "sound effects");
                    this.field1568 = new byte[4][104][104];
                    this.field1241 = new int[4][105][105];
                    this.field1144 = new World3D(4, this.field1241, 2, 104, 104);
                    for (int var15 = 0; var15 < 4; ++var15) {
                        this.field1187[var15] = new CollisionMap(false, 104, 104);
                    }
                    this.field1344 = new Pix32(512, 512);
                    Jagfile var16 = this.method454("versionlist", this.field1145[5], 60, (byte) 7, 5, "update list");
                    this.method13("Connecting to update server", (byte) 4, 60);
                    this.field1410 = new OnDemand();
                    this.field1410.method272(var16, this);
                    AnimFrame.method57(this.field1410.method275((byte) -34));
                    Model.method132(this.field1410.method274(0, 4), this.field1410);
                    if (!field1233) {
                        this.field1226 = 0;
                        this.field1227 = false;
                        this.field1410.method279(2, this.field1226);
                        while (this.field1410.method280() > 0) {
                            this.method450(-42794);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var76) {
                            }
                        }
                    }
                    this.method13("Requesting animations", (byte) 4, 65);
                    int var17 = this.field1410.method274(1, 4);
                    for (int var18 = 0; var18 < var17; ++var18) {
                        this.field1410.method279(1, var18);
                    }
                    while (this.field1410.method280() > 0) {
                        int var19 = var17 - this.field1410.method280();
                        if (var19 > 0) {
                            this.method13("Loading animations - " + var19 * 100 / var17 + "%", (byte) 4, 65);
                        }
                        this.method450(-42794);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var75) {
                        }
                    }
                    this.method13("Requesting models", (byte) 4, 70);
                    int var20 = this.field1410.method274(0, 4);
                    for (int var21 = 0; var21 < var20; ++var21) {
                        int var22 = this.field1410.method278(0, var21);
                        if ((var22 & 1) != 0) {
                            this.field1410.method279(0, var21);
                        }
                    }
                    int var23 = this.field1410.method280();
                    while (this.field1410.method280() > 0) {
                        int var24 = var23 - this.field1410.method280();
                        if (var24 > 0) {
                            this.method13("Loading models - " + var24 * 100 / var23 + "%", (byte) 4, 70);
                        }
                        this.method450(-42794);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var74) {
                        }
                    }
                    if (this.field1220[0] != null) {
                        this.method13("Requesting maps", (byte) 4, 75);
                        this.field1410.method279(3, this.field1410.method276(48, 0, 47, (byte) 1));
                        this.field1410.method279(3, this.field1410.method276(48, 1, 47, (byte) 1));
                        this.field1410.method279(3, this.field1410.method276(48, 0, 48, (byte) 1));
                        this.field1410.method279(3, this.field1410.method276(48, 1, 48, (byte) 1));
                        this.field1410.method279(3, this.field1410.method276(48, 0, 49, (byte) 1));
                        this.field1410.method279(3, this.field1410.method276(48, 1, 49, (byte) 1));
                        this.field1410.method279(3, this.field1410.method276(47, 0, 47, (byte) 1));
                        this.field1410.method279(3, this.field1410.method276(47, 1, 47, (byte) 1));
                        this.field1410.method279(3, this.field1410.method276(47, 0, 48, (byte) 1));
                        this.field1410.method279(3, this.field1410.method276(47, 1, 48, (byte) 1));
                        this.field1410.method279(3, this.field1410.method276(148, 0, 48, (byte) 1));
                        this.field1410.method279(3, this.field1410.method276(148, 1, 48, (byte) 1));
                        int var25 = this.field1410.method280();
                        while (this.field1410.method280() > 0) {
                            int var26 = var25 - this.field1410.method280();
                            if (var26 > 0) {
                                this.method13("Loading maps - " + var26 * 100 / var25 + "%", (byte) 4, 75);
                            }
                            this.method450(-42794);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var73) {
                            }
                        }
                    }
                    int var27 = this.field1410.method274(0, 4);
                    for (int var28 = 0; var28 < var27; ++var28) {
                        int var29 = this.field1410.method278(0, var28);
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
                            this.field1410.method282(var28, 0, 0, var30);
                        }
                    }
                    int var31 = this.field1410.method274(3, 4);
                    for (int var32 = 0; var32 < var31; ++var32) {
                        this.field1410.method282(var32, 3, 0, (byte) 2);
                    }
                    if (!field1233) {
                        int var33 = this.field1410.method274(2, 4);
                        for (int var34 = 1; var34 < var33; ++var34) {
                            this.field1410.method282(var34, 2, 0, (byte) 1);
                        }
                    }
                    this.method13("Unpacking media", (byte) 4, 80);
                    this.field1326 = new Pix8(var11, "invback", 0);
                    this.field1328 = new Pix8(var11, "chatback", 0);
                    this.field1327 = new Pix8(var11, "mapback", 0);
                    this.field1580 = new Pix8(var11, "backbase1", 0);
                    this.field1581 = new Pix8(var11, "backbase2", 0);
                    this.field1582 = new Pix8(var11, "backhmid1", 0);
                    for (int var35 = 0; var35 < 13; ++var35) {
                        this.field1239[var35] = new Pix8(var11, "sideicons", var35);
                    }
                    this.field1515 = new Pix32(var11, "compass", 0);
                    try {
                        for (int var36 = 0; var36 < 50; ++var36) {
                            this.field1251[var36] = new Pix8(var11, "mapscene", var36);
                        }
                    } catch (Exception var81) {
                    }
                    try {
                        for (int var37 = 0; var37 < 50; ++var37) {
                            this.field1352[var37] = new Pix32(var11, "mapfunction", var37);
                        }
                    } catch (Exception var80) {
                    }
                    try {
                        for (int var38 = 0; var38 < 20; ++var38) {
                            this.field1371[var38] = new Pix32(var11, "hitmarks", var38);
                        }
                    } catch (Exception var79) {
                    }
                    try {
                        for (int var39 = 0; var39 < 20; ++var39) {
                            this.field1182[var39] = new Pix32(var11, "headicons", var39);
                        }
                    } catch (Exception var78) {
                    }
                    this.field1168 = new Pix32(var11, "mapflag", 0);
                    for (int var40 = 0; var40 < 8; ++var40) {
                        this.field1373[var40] = new Pix32(var11, "cross", var40);
                    }
                    this.field1411 = new Pix32(var11, "mapdots", 0);
                    this.field1412 = new Pix32(var11, "mapdots", 1);
                    this.field1413 = new Pix32(var11, "mapdots", 2);
                    this.field1414 = new Pix32(var11, "mapdots", 3);
                    this.field1279 = new Pix8(var11, "scrollbar", 0);
                    this.field1280 = new Pix8(var11, "scrollbar", 1);
                    this.field1523 = new Pix8(var11, "redstone1", 0);
                    this.field1524 = new Pix8(var11, "redstone2", 0);
                    this.field1525 = new Pix8(var11, "redstone3", 0);
                    this.field1526 = new Pix8(var11, "redstone1", 0);
                    this.field1526.method201(-960);
                    this.field1527 = new Pix8(var11, "redstone2", 0);
                    this.field1527.method201(-960);
                    this.field1161 = new Pix8(var11, "redstone1", 0);
                    this.field1161.method202(-21472);
                    this.field1162 = new Pix8(var11, "redstone2", 0);
                    this.field1162.method202(-21472);
                    this.field1163 = new Pix8(var11, "redstone3", 0);
                    this.field1163.method202(-21472);
                    this.field1164 = new Pix8(var11, "redstone1", 0);
                    this.field1164.method201(-960);
                    this.field1164.method202(-21472);
                    this.field1165 = new Pix8(var11, "redstone2", 0);
                    this.field1165.method201(-960);
                    this.field1165.method202(-21472);
                    Pix32 var41 = new Pix32(var11, "backleft1", 0);
                    this.field1393 = new PixMap((byte) 9, var41.field659, var41.field658, this.method11(field1415));
                    var41.method188(8, 0, 0);
                    Pix32 var42 = new Pix32(var11, "backleft2", 0);
                    this.field1394 = new PixMap((byte) 9, var42.field659, var42.field658, this.method11(field1415));
                    var42.method188(8, 0, 0);
                    Pix32 var43 = new Pix32(var11, "backright1", 0);
                    this.field1395 = new PixMap((byte) 9, var43.field659, var43.field658, this.method11(field1415));
                    var43.method188(8, 0, 0);
                    Pix32 var44 = new Pix32(var11, "backright2", 0);
                    this.field1396 = new PixMap((byte) 9, var44.field659, var44.field658, this.method11(field1415));
                    var44.method188(8, 0, 0);
                    Pix32 var45 = new Pix32(var11, "backtop1", 0);
                    this.field1397 = new PixMap((byte) 9, var45.field659, var45.field658, this.method11(field1415));
                    var45.method188(8, 0, 0);
                    Pix32 var46 = new Pix32(var11, "backtop2", 0);
                    this.field1398 = new PixMap((byte) 9, var46.field659, var46.field658, this.method11(field1415));
                    var46.method188(8, 0, 0);
                    Pix32 var47 = new Pix32(var11, "backvmid1", 0);
                    this.field1399 = new PixMap((byte) 9, var47.field659, var47.field658, this.method11(field1415));
                    var47.method188(8, 0, 0);
                    Pix32 var48 = new Pix32(var11, "backvmid2", 0);
                    this.field1400 = new PixMap((byte) 9, var48.field659, var48.field658, this.method11(field1415));
                    var48.method188(8, 0, 0);
                    Pix32 var49 = new Pix32(var11, "backvmid3", 0);
                    this.field1401 = new PixMap((byte) 9, var49.field659, var49.field658, this.method11(field1415));
                    var49.method188(8, 0, 0);
                    Pix32 var50 = new Pix32(var11, "backhmid2", 0);
                    this.field1402 = new PixMap((byte) 9, var50.field659, var50.field658, this.method11(field1415));
                    var50.method188(8, 0, 0);
                    int var51 = (int) (Math.random() * 21.0D) - 10;
                    int var52 = (int) (Math.random() * 21.0D) - 10;
                    int var53 = (int) (Math.random() * 21.0D) - 10;
                    int var54 = (int) (Math.random() * 41.0D) - 20;
                    for (int var55 = 0; var55 < 50; ++var55) {
                        if (this.field1352[var55] != null) {
                            this.field1352[var55].method187(var51 + var54, (byte) 3, var52 + var54, var53 + var54);
                        }
                        if (this.field1251[var55] != null) {
                            this.field1251[var55].method203(var51 + var54, (byte) 3, var52 + var54, var53 + var54);
                        }
                    }
                    this.method13("Unpacking textures", (byte) 4, 83);
                    Pix3D.method174(var12, -395);
                    Pix3D.method178((byte) 8, 0.8D);
                    Pix3D.method173(20, (byte) -125);
                    this.method13("Unpacking config", (byte) 4, 86);
                    SeqType.method372(var9, 439);
                    LocType.method322(var9);
                    FloType.method362(var9, 439);
                    ObjType.method337(var9);
                    NpcType.method331(var9);
                    IdkType.method366(var9, 439);
                    SpotAnimType.method375(var9, 439);
                    VarpType.method378(var9, 439);
                    ObjType.field995 = field1232;
                    if (!field1233) {
                        this.method13("Unpacking sounds", (byte) 4, 90);
                        byte[] var56 = var14.method299("sounds.dat", (byte[]) null);
                        Packet var57 = new Packet(var56, true);
                        Wave.method312(var57, 439);
                    }
                    this.method13("Unpacking interfaces", (byte) 4, 95);
                    PixFont[] var58 = new PixFont[] { this.field1424, this.field1425, this.field1426, this.field1427 };
                    Component.method32(var58, var11, -361, var10);
                    this.method13("Preparing game engine", (byte) 4, 100);
                    for (int var59 = 0; var59 < 33; ++var59) {
                        int var60 = 999;
                        int var61 = 0;
                        for (int var62 = 0; var62 < 35; ++var62) {
                            if (this.field1327.field671[this.field1327.field673 * var59 + var62] == 0) {
                                if (var60 == 999) {
                                    var60 = var62;
                                }
                            } else if (var60 != 999) {
                                var61 = var62;
                                break;
                            }
                        }
                        this.field1489[var59] = var60;
                        this.field1199[var59] = var61 - var60;
                    }
                    for (int var63 = 9; var63 < 160; ++var63) {
                        int var64 = 999;
                        int var65 = 0;
                        for (int var66 = 10; var66 < 168; ++var66) {
                            if (this.field1327.field671[this.field1327.field673 * var63 + var66] != 0 || var66 <= 34 && var63 <= 34) {
                                if (var64 != 999) {
                                    var65 = var66;
                                    break;
                                }
                            } else if (var64 == 999) {
                                var64 = var66;
                            }
                        }
                        this.field1175[var63 - 9] = var64 - 21;
                        this.field1439[var63 - 9] = var65 - var64;
                    }
                    Pix3D.method171(479, 96, true);
                    this.field1417 = Pix3D.field640;
                    Pix3D.method171(190, 261, true);
                    this.field1418 = Pix3D.field640;
                    Pix3D.method171(512, 334, true);
                    this.field1419 = Pix3D.field640;
                    int[] var67 = new int[9];
                    for (int var68 = 0; var68 < 9; ++var68) {
                        int var69 = var68 * 32 + 128 + 15;
                        int var70 = var69 * 3 + 600;
                        int var71 = Pix3D.field638[var69];
                        var67[var68] = var70 * var71 >> 16;
                    }
                    World3D.method98(500, 512, 334, 458, 800, var67);
                    WordFilter.method380(var13);
                } catch (Exception var83) {
                    signlink.reporterror("loaderror " + this.field1587 + " " + this.field1234);
                    this.field1215 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLob;)V")
    private final void method462(boolean arg0, LocSpawned arg1) {
        if (arg0) {
            field1508 = this.field1274.method295();
        }
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field716 == 0) {
            var3 = this.field1144.method88(arg1.field715, arg1.field717, arg1.field718);
        }
        if (arg1.field716 == 1) {
            var3 = this.field1144.method89(arg1.field717, this.field1221, arg1.field718, arg1.field715);
        }
        if (arg1.field716 == 2) {
            var3 = this.field1144.method90(arg1.field715, arg1.field717, arg1.field718);
        }
        if (arg1.field716 == 3) {
            var3 = this.field1144.method91(arg1.field715, arg1.field717, arg1.field718);
        }
        if (var3 != 0) {
            int var7 = this.field1144.method92(arg1.field715, arg1.field717, arg1.field718, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field719 = var4;
        arg1.field721 = var5;
        arg1.field720 = var6;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method463(int arg0) {
        Graphics var2 = this.method11(field1415).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 789, 532);
        this.method4(1, (byte) 0);
        if (arg0 != -12973) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (this.field1215) {
            this.field1346 = false;
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
        if (this.field1578) {
            this.field1346 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1511) {
            this.field1346 = false;
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

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method464(int arg0) {
        int var2 = (field1310.field402 >> 7) + this.field1261;
        int var3 = (field1310.field403 >> 7) + this.field1262;
        if (var2 >= 2944 && var2 < 3392 && var3 >= 3520 && var3 < 6400) {
            this.field1490 = (var3 - 3520) / 8 + 1;
        } else if (var2 >= 2944 && var2 < 3392 && var3 >= 9920 && var3 < 12800) {
            this.field1490 = (var3 - 9920) / 8 + 1;
        } else {
            this.field1490 = 0;
        }
        this.field1443 = 0;
        if (var2 >= 3328 && var2 < 3392 && var3 >= 3200 && var3 < 3264) {
            int var4 = var2 & 63;
            int var5 = var3 & 63;
            if (var4 >= 4 && var4 <= 29 && var5 >= 44 && var5 <= 58) {
                this.field1443 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 44 && var5 <= 58) {
                this.field1443 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 25 && var5 <= 39) {
                this.field1443 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 25 && var5 <= 39) {
                this.field1443 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 6 && var5 <= 20) {
                this.field1443 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 6 && var5 <= 20) {
                this.field1443 = 1;
            }
        }
        if (this.field1443 == 0 && var2 >= 3328 && var2 <= 3393 && var3 >= 3203 && var3 <= 3325) {
            this.field1443 = 2;
        }
        this.field1469 = 0;
        int var6 = 16 / arg0;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1469 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1469 = 1;
        }
        if (this.field1469 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1469 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    public final void method13(String arg0, byte arg1, int arg2) {
        this.field1234 = arg2;
        if (arg1 == 4) {
            this.field1587 = arg0;
            this.method528(595);
            if (this.field1254 == null) {
                super.method13(arg0, (byte) 4, arg2);
            } else {
                this.field1297.method260((byte) 1);
                short var4 = 360;
                short var5 = 200;
                byte var6 = 20;
                this.field1426.method206(this.field1539, "RuneScape is loading - please wait...", var4 / 2, var5 / 2 - 26 - var6, 16777215);
                int var7 = var5 / 2 - 18 - var6;
                Pix2D.method166(var7, var4 / 2 - 152, (byte) -109, 304, 9179409, 34);
                Pix2D.method166(var7 + 1, var4 / 2 - 151, (byte) -109, 302, 0, 32);
                Pix2D.method165(30, 660, var7 + 2, arg2 * 3, var4 / 2 - 150, 9179409);
                Pix2D.method165(30, 660, var7 + 2, 300 - arg2 * 3, arg2 * 3 + (var4 / 2 - 150), 0);
                this.field1426.method206(this.field1539, arg0, var4 / 2, var5 / 2 + 5 - var6, 16777215);
                this.field1297.method261(3, 214, super.field17, 186);
                if (this.field1380) {
                    this.field1380 = false;
                    if (!this.field1346) {
                        this.field1298.method261(3, 0, super.field17, 0);
                        this.field1299.method261(3, 661, super.field17, 0);
                    }
                    this.field1295.method261(3, 128, super.field17, 0);
                    this.field1296.method261(3, 214, super.field17, 386);
                    this.field1300.method261(3, 0, super.field17, 265);
                    this.field1301.method261(3, 574, super.field17, 265);
                    this.field1302.method261(3, 128, super.field17, 186);
                    this.field1303.method261(3, 574, super.field17, 186);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIZII)V")
    private final void method465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        for (LocSpawned var12 = (LocSpawned) this.field1174.method250(); var12 != null; var12 = (LocSpawned) this.field1174.method252(true)) {
            if (var12.field715 == arg8 && var12.field717 == arg9 && var12.field718 == arg6 && var12.field716 == arg4) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field715 = arg8;
            var11.field716 = arg4;
            var11.field717 = arg9;
            var11.field718 = arg6;
            this.method462(false, var11);
            this.field1174.method247(var11);
        }
        var11.field722 = arg5;
        var11.field724 = arg0;
        var11.field723 = arg1;
        if (!arg7) {
            this.method6();
        }
        var11.field725 = arg3;
        var11.field726 = arg2;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIB)V")
    public final void method466(int arg0, int arg1, byte arg2) {
        if (arg2 == -7) {
            int var4 = 0;
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field1306[var5] != null) {
                    int var6 = this.field1304[var5];
                    int var7 = 70 - var4 * 14 + this.field1538 + 4;
                    if (var7 < -20) {
                        break;
                    }
                    if (var6 == 0) {
                        ++var4;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1416 == 0 || this.field1416 == 1 && this.method480(790, this.field1305[var5]))) {
                        if (arg1 > var7 - 14 && arg1 <= var7 && !this.field1305[var5].equals(field1310.field460)) {
                            if (this.field1420) {
                                this.field1238[this.field1478] = "Report abuse @whi@" + this.field1305[var5];
                                this.field1519[this.field1478] = 34;
                                ++this.field1478;
                            }
                            this.field1238[this.field1478] = "Add ignore @whi@" + this.field1305[var5];
                            this.field1519[this.field1478] = 436;
                            ++this.field1478;
                            this.field1238[this.field1478] = "Add friend @whi@" + this.field1305[var5];
                            this.field1519[this.field1478] = 406;
                            ++this.field1478;
                        }
                        ++var4;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field1545 == 0 && (var6 == 7 || this.field1483 == 0 || this.field1483 == 1 && this.method480(790, this.field1305[var5]))) {
                        if (arg1 > var7 - 14 && arg1 <= var7) {
                            if (this.field1420) {
                                this.field1238[this.field1478] = "Report abuse @whi@" + this.field1305[var5];
                                this.field1519[this.field1478] = 34;
                                ++this.field1478;
                            }
                            this.field1238[this.field1478] = "Add ignore @whi@" + this.field1305[var5];
                            this.field1519[this.field1478] = 436;
                            ++this.field1478;
                            this.field1238[this.field1478] = "Add friend @whi@" + this.field1305[var5];
                            this.field1519[this.field1478] = 406;
                            ++this.field1478;
                        }
                        ++var4;
                    }
                    if (var6 == 4 && (this.field1268 == 0 || this.field1268 == 1 && this.method480(790, this.field1305[var5]))) {
                        if (arg1 > var7 - 14 && arg1 <= var7) {
                            this.field1238[this.field1478] = "Accept trade @whi@" + this.field1305[var5];
                            this.field1519[this.field1478] = 903;
                            ++this.field1478;
                        }
                        ++var4;
                    }
                    if ((var6 == 5 || var6 == 6) && this.field1545 == 0 && this.field1483 < 2) {
                        ++var4;
                    }
                    if (var6 == 8 && (this.field1268 == 0 || this.field1268 == 1 && this.method480(790, this.field1305[var5]))) {
                        if (arg1 > var7 - 14 && arg1 <= var7) {
                            this.field1238[this.field1478] = "Accept duel @whi@" + this.field1305[var5];
                            this.field1519[this.field1478] = 363;
                            ++this.field1478;
                        }
                        ++var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLd;)V")
    public final void method467(byte arg0, Component arg1) {
        if (arg0 != 5) {
            field1341 = !field1341;
        }
        int var3 = arg1.field76;
        if (var3 >= 1 && var3 <= 100) {
            --var3;
            if (var3 >= this.field1365) {
                arg1.field106 = "";
                arg1.field75 = 0;
            } else {
                arg1.field106 = this.field1392[var3];
                arg1.field75 = 1;
            }
        } else if (var3 >= 101 && var3 <= 200) {
            var3 -= 101;
            if (var3 >= this.field1365) {
                arg1.field106 = "";
                arg1.field75 = 0;
            } else {
                if (this.field1512[var3] == 0) {
                    arg1.field106 = "@red@Offline";
                } else if (this.field1512[var3] == field1230) {
                    arg1.field106 = "@gre@World-" + (this.field1512[var3] - 9);
                } else {
                    arg1.field106 = "@yel@World-" + (this.field1512[var3] - 9);
                }
                arg1.field75 = 1;
            }
        } else if (var3 == 203) {
            arg1.field85 = this.field1365 * 15 + 20;
            if (arg1.field85 <= arg1.field78) {
                arg1.field85 = arg1.field78 + 1;
            }
        } else if (var3 >= 401 && var3 <= 500) {
            var3 -= 401;
            if (var3 >= this.field1225) {
                arg1.field106 = "";
                arg1.field75 = 0;
            } else {
                arg1.field106 = JString.method304((byte) 7, JString.method301(this.field1442[var3], -16782));
                arg1.field75 = 1;
            }
        } else if (var3 == 503) {
            arg1.field85 = this.field1225 * 15 + 20;
            if (arg1.field85 <= arg1.field78) {
                arg1.field85 = arg1.field78 + 1;
            }
        } else if (var3 == 327) {
            arg1.field120 = 150;
            arg1.field121 = (int) (Math.sin((double) field1433 / 40.0D) * 256.0D) & 2047;
            if (this.field1553) {
                for (int var4 = 0; var4 < 7; ++var4) {
                    int var11 = this.field1387[var4];
                    if (var11 >= 0 && !IdkType.field1062[var11].method368(false)) {
                        return;
                    }
                }
                this.field1553 = false;
                Model[] var5 = new Model[7];
                int var6 = 0;
                for (int var7 = 0; var7 < 7; ++var7) {
                    int var10 = this.field1387[var7];
                    if (var10 >= 0) {
                        var5[var6++] = IdkType.field1062[var10].method369(208);
                    }
                }
                Model var8 = new Model(var6, var5, (byte) 4);
                for (int var9 = 0; var9 < 5; ++var9) {
                    if (this.field1213[var9] != 0) {
                        var8.method149(field1259[var9][0], field1259[var9][this.field1213[var9]]);
                        if (var9 == 1) {
                            var8.method149(field1360[0], field1360[this.field1213[var9]]);
                        }
                    }
                }
                var8.method142(8);
                var8.method143(true, SeqType.field1081[field1310.field407].field1083[0]);
                var8.method152(64, 850, -30, -50, -30, true);
                arg1.field113 = 5;
                arg1.field114 = 0;
                Component.method35(5, 16036, 0, var8);
            }
        } else if (var3 == 324) {
            if (this.field1218 == null) {
                this.field1218 = arg1.field111;
                this.field1219 = arg1.field112;
            }
            if (this.field1555) {
                arg1.field111 = this.field1219;
            } else {
                arg1.field111 = this.field1218;
            }
        } else if (var3 == 325) {
            if (this.field1218 == null) {
                this.field1218 = arg1.field111;
                this.field1219 = arg1.field112;
            }
            if (this.field1555) {
                arg1.field111 = this.field1218;
            } else {
                arg1.field111 = this.field1219;
            }
        } else if (var3 == 600) {
            arg1.field106 = this.field1362;
            if (field1433 % 20 < 10) {
                arg1.field106 = arg1.field106 + "|";
            } else {
                arg1.field106 = arg1.field106 + " ";
            }
        } else {
            if (var3 == 613) {
                if (this.field1420) {
                    if (this.field1222) {
                        arg1.field108 = 16711680;
                        arg1.field106 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else {
                        arg1.field108 = 16777215;
                        arg1.field106 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else {
                    arg1.field106 = "";
                }
            }
            if (var3 == 650 || var3 == 655) {
                if (this.field1366 != 0) {
                    String var12;
                    if (this.field1205 == 0) {
                        var12 = "earlier today";
                    } else if (this.field1205 == 1) {
                        var12 = "yesterday";
                    } else {
                        var12 = this.field1205 + " days ago";
                    }
                    arg1.field106 = "You last logged in " + var12 + " from: " + signlink.dns;
                } else {
                    arg1.field106 = "";
                }
            }
            if (var3 == 651) {
                if (this.field1351 == 0) {
                    arg1.field106 = "0 unread messages";
                    arg1.field108 = 16776960;
                }
                if (this.field1351 == 1) {
                    arg1.field106 = "1 unread message";
                    arg1.field108 = 65280;
                }
                if (this.field1351 > 1) {
                    arg1.field106 = this.field1351 + " unread messages";
                    arg1.field108 = 65280;
                }
            }
            if (var3 == 652) {
                if (this.field1499 == 201) {
                    arg1.field106 = "";
                } else if (this.field1499 == 200) {
                    arg1.field106 = "You have not yet set any password recovery questions.";
                } else {
                    String var13;
                    if (this.field1499 == 0) {
                        var13 = "Earlier today";
                    } else if (this.field1499 == 1) {
                        var13 = "Yesterday";
                    } else {
                        var13 = this.field1499 + " days ago";
                    }
                    arg1.field106 = var13 + " you changed your recovery questions";
                }
            }
            if (var3 == 653) {
                if (this.field1499 == 201) {
                    arg1.field106 = "";
                } else if (this.field1499 == 200) {
                    arg1.field106 = "We strongly recommend you do so now to secure your account.";
                } else {
                    arg1.field106 = "If you do not remember making this change then cancel it immediately";
                }
            }
            if (var3 == 654) {
                if (this.field1499 == 201) {
                    arg1.field106 = "";
                } else if (this.field1499 == 200) {
                    arg1.field106 = "Do this from the 'account management' area on our front webpage";
                } else {
                    arg1.field106 = "Do this from the 'account management' area on our front webpage";
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)Z")
    public final boolean method468(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method469(int arg0) {
        int var2 = 92 / arg0;
        for (int var3 = 0; var3 < this.field1404; ++var3) {
            NpcEntity var4 = this.field1403[this.field1405[var3]];
            int var5 = (this.field1405[var3] << 14) + 536870912;
            if (var4 != null && var4.method124(-27441)) {
                int var6 = var4.field402 >> 7;
                int var7 = var4.field403 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field406 == 1 && (var4.field402 & 127) == 64 && (var4.field403 & 127) == 64) {
                        if (this.field1586[var6][var7] == this.field1444) {
                            continue;
                        }
                        this.field1586[var6][var7] = this.field1444;
                    }
                    this.field1144.method73(var4.field405, var5, this.method520(0, this.field1340, var4.field403, var4.field402), (var4.field406 - 1) * 64 + 60, this.field1340, var4.field404, var4, var4.field402, (byte) 9, var4.field403);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method470(byte arg0) {
        if (arg0 != 7) {
            this.method6();
        }
        if (super.field26 == 1) {
            if (super.field27 >= 8 && super.field27 <= 108 && super.field28 >= 490 && super.field28 <= 522) {
                this.field1416 = (this.field1416 + 1) % 4;
                this.field1166 = true;
                this.field1463 = true;
                this.field1240.method220((byte) 78, 130);
                this.field1240.method221(this.field1416);
                this.field1240.method221(this.field1483);
                this.field1240.method221(this.field1268);
            }
            if (super.field27 >= 137 && super.field27 <= 237 && super.field28 >= 490 && super.field28 <= 522) {
                this.field1483 = (this.field1483 + 1) % 3;
                this.field1166 = true;
                this.field1463 = true;
                this.field1240.method220((byte) 78, 130);
                this.field1240.method221(this.field1416);
                this.field1240.method221(this.field1483);
                this.field1240.method221(this.field1268);
            }
            if (super.field27 >= 275 && super.field27 <= 375 && super.field28 >= 490 && super.field28 <= 522) {
                this.field1268 = (this.field1268 + 1) % 3;
                this.field1166 = true;
                this.field1463 = true;
                this.field1240.method220((byte) 78, 130);
                this.field1240.method221(this.field1416);
                this.field1240.method221(this.field1483);
                this.field1240.method221(this.field1268);
            }
            if (super.field27 >= 416 && super.field27 <= 516 && super.field28 >= 490 && super.field28 <= 522) {
                this.method435((byte) 84);
                this.field1362 = "";
                this.field1222 = false;
                for (int var2 = 0; var2 < Component.field67.length; ++var2) {
                    if (Component.field67[var2] != null && Component.field67[var2].field76 == 600) {
                        this.field1355 = this.field1281 = Component.field67[var2].field73;
                        return;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)I")
    public final int method471(boolean arg0) {
        if (arg0) {
            this.field1522 = this.field1274.method295();
        }
        int var2 = 3;
        if (this.field1197 < 310) {
            int var3 = this.field1194 >> 7;
            int var4 = this.field1196 >> 7;
            int var5 = field1310.field402 >> 7;
            int var6 = field1310.field403 >> 7;
            if ((this.field1568[this.field1340][var3][var4] & 4) != 0) {
                var2 = this.field1340;
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
                    if ((this.field1568[this.field1340][var3][var4] & 4) != 0) {
                        var2 = this.field1340;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field1568[this.field1340][var3][var4] & 4) != 0) {
                            var2 = this.field1340;
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
                    if ((this.field1568[this.field1340][var3][var4] & 4) != 0) {
                        var2 = this.field1340;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field1568[this.field1340][var3][var4] & 4) != 0) {
                            var2 = this.field1340;
                        }
                    }
                }
            }
        }
        if ((this.field1568[this.field1340][field1310.field402 >> 7][field1310.field403 >> 7] & 4) != 0) {
            var2 = this.field1340;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)I")
    public final int method472(boolean arg0) {
        int var2 = this.method520(0, this.field1340, this.field1196, this.field1194);
        if (!arg0) {
            this.field1547 = this.field1583.method231();
        }
        return var2 - this.field1195 < 800 && (this.field1568[this.field1340][this.field1194 >> 7][this.field1196 >> 7] & 4) != 0 ? this.field1340 : 3;
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1479) {
            this.method432((byte) 7);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLmb;)V")
    private final void method473(int arg0, byte arg1, Packet arg2) {
        int var4 = arg2.method242(this.field1315, 8);
        if (var4 < this.field1473) {
            for (int var5 = var4; var5 < this.field1473; ++var5) {
                this.field1312[this.field1311++] = this.field1474[var5];
            }
        }
        if (var4 > this.field1473) {
            signlink.reporterror(this.field1541 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1473 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1474[var6];
                PlayerEntity var8 = this.field1472[var7];
                int var9 = arg2.method242(this.field1315, 1);
                if (var9 == 0) {
                    this.field1474[this.field1473++] = var7;
                    var8.field446 = field1433;
                } else {
                    int var10 = arg2.method242(this.field1315, 2);
                    if (var10 == 0) {
                        this.field1474[this.field1473++] = var7;
                        var8.field446 = field1433;
                        this.field1476[this.field1475++] = var7;
                    } else if (var10 == 1) {
                        this.field1474[this.field1473++] = var7;
                        var8.field446 = field1433;
                        int var11 = arg2.method242(this.field1315, 3);
                        var8.method123(var11, false, (byte) 43);
                        int var12 = arg2.method242(this.field1315, 1);
                        if (var12 == 1) {
                            this.field1476[this.field1475++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1474[this.field1473++] = var7;
                        var8.field446 = field1433;
                        int var13 = arg2.method242(this.field1315, 3);
                        var8.method123(var13, true, (byte) 43);
                        int var14 = arg2.method242(this.field1315, 3);
                        var8.method123(var14, true, (byte) 43);
                        int var15 = arg2.method242(this.field1315, 1);
                        if (var15 == 1) {
                            this.field1476[this.field1475++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1312[this.field1311++] = var7;
                    }
                }
            }
            if (this.field1502 == arg1) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method474(boolean arg0) {
        if (this.field1545 != 0) {
            PixFont var2 = this.field1425;
            int var3 = 0;
            this.field1577 &= arg0;
            if (this.field1551 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1306[var4] != null) {
                    int var5 = this.field1304[var4];
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1483 == 0 || this.field1483 == 1 && this.method480(790, this.field1305[var4]))) {
                        int var6 = 329 - var3 * 13;
                        var2.method209(0, 4, 9, var6, "From " + this.field1305[var4] + ": " + this.field1306[var4]);
                        var2.method209(65535, 4, 9, var6 - 1, "From " + this.field1305[var4] + ": " + this.field1306[var4]);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field1483 < 2) {
                        int var7 = 329 - var3 * 13;
                        var2.method209(0, 4, 9, var7, this.field1306[var4]);
                        var2.method209(65535, 4, 9, var7 - 1, this.field1306[var4]);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field1483 < 2) {
                        int var8 = 329 - var3 * 13;
                        var2.method209(0, 4, 9, var8, "To " + this.field1305[var4] + ": " + this.field1306[var4]);
                        var2.method209(65535, 4, 9, var8 - 1, "To " + this.field1305[var4] + ": " + this.field1306[var4]);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;IIII)V")
    public final void method475(Component arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.field74 == 0 && arg0.field88 != null) {
            if (!arg0.field87 || this.field1384 == arg0.field72 || this.field1179 == arg0.field72 || this.field1248 == arg0.field72) {
                int var6 = Pix2D.field621;
                int var7 = Pix2D.field619;
                int var8 = Pix2D.field622;
                int var9 = Pix2D.field620;
                if (arg4 >= 0) {
                    this.field1193 = -194;
                }
                Pix2D.method163(arg0.field78 + arg3, arg3, arg1, arg0.field77 + arg1, 5);
                int var10 = arg0.field88.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg0.field89[var11] + arg1;
                    int var13 = arg0.field90[var11] + arg3 - arg2;
                    Component var14 = Component.field67[arg0.field88[var11]];
                    int var15 = var14.field79 + var12;
                    int var16 = var14.field80 + var13;
                    if (var14.field76 > 0) {
                        this.method467(this.field1462, var14);
                    }
                    if (var14.field74 == 0) {
                        if (var14.field86 > var14.field85 - var14.field78) {
                            var14.field86 = var14.field85 - var14.field78;
                        }
                        if (var14.field86 < 0) {
                            var14.field86 = 0;
                        }
                        this.method475(var14, var15, var14.field86, var16, -181);
                        if (var14.field85 > var14.field78) {
                            this.method461(var14.field86, var16, false, var14.field85, var14.field77 + var15, var14.field78);
                        }
                    } else if (var14.field74 != 1) {
                        if (var14.field74 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field78; ++var18) {
                                for (int var19 = 0; var19 < var14.field77; ++var19) {
                                    int var20 = (var14.field96 + 32) * var19 + var15;
                                    int var21 = (var14.field97 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field99[var17];
                                        var21 += var14.field100[var17];
                                    }
                                    if (var14.field68[var17] <= 0) {
                                        if (var14.field98 != null && var17 < 20) {
                                            Pix32 var27 = var14.field98[var17];
                                            if (var27 != null) {
                                                var27.method190(var21, 217, var20);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field68[var17] - 1;
                                        if (var20 > Pix2D.field621 - 32 && var20 < Pix2D.field622 && var21 > Pix2D.field619 - 32 && var21 < Pix2D.field620 || this.field1291 != 0 && this.field1290 == var17) {
                                            Pix32 var25 = ObjType.method345(var14.field69[var17], 9, var24);
                                            if (var25 != null) {
                                                if (this.field1291 != 0 && this.field1290 == var17 && this.field1289 == var14.field72) {
                                                    var22 = super.field24 - this.field1292;
                                                    var23 = super.field25 - this.field1293;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field1570 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var25.method194(128, var20 + var22, 0, var21 + var23);
                                                } else if (this.field1210 != 0 && this.field1209 == var17 && this.field1208 == var14.field72) {
                                                    var25.method194(128, var20, 0, var21);
                                                } else {
                                                    var25.method190(var21, 217, var20);
                                                }
                                                if (var25.field662 == 33 || var14.field69[var17] != 1) {
                                                    int var26 = var14.field69[var17];
                                                    this.field1424.method209(0, var20 + 1 + var22, 9, var21 + 10 + var23, method427(var26, 0));
                                                    this.field1424.method209(16776960, var20 + var22, 9, var21 + 9 + var23, method427(var26, 0));
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field74 == 3) {
                            if (var14.field102) {
                                Pix2D.method165(var14.field78, 660, var16, var14.field77, var15, var14.field108);
                            } else {
                                Pix2D.method166(var16, var15, (byte) -109, var14.field77, var14.field108, var14.field78);
                            }
                        } else if (var14.field74 == 4) {
                            PixFont var28 = var14.field105;
                            int var29 = var14.field108;
                            String var30 = var14.field106;
                            if ((this.field1248 == var14.field72 || this.field1179 == var14.field72 || this.field1384 == var14.field72) && var14.field110 != 0) {
                                var29 = var14.field110;
                            }
                            if (this.method439(var14, 3)) {
                                var29 = var14.field109;
                                if (var14.field107.length() > 0) {
                                    var30 = var14.field107;
                                }
                            }
                            if (var14.field75 == 6 && this.field1316) {
                                var30 = "Please wait...";
                                var29 = var14.field108;
                            }
                            int var31 = var28.field690 + var16;
                            while (var30.length() > 0) {
                                if (var30.indexOf("%") != -1) {
                                    label265: while (true) {
                                        int var32 = var30.indexOf("%1");
                                        if (var32 == -1) {
                                            while (true) {
                                                int var33 = var30.indexOf("%2");
                                                if (var33 == -1) {
                                                    while (true) {
                                                        int var34 = var30.indexOf("%3");
                                                        if (var34 == -1) {
                                                            while (true) {
                                                                int var35 = var30.indexOf("%4");
                                                                if (var35 == -1) {
                                                                    while (true) {
                                                                        int var36 = var30.indexOf("%5");
                                                                        if (var36 == -1) {
                                                                            break label265;
                                                                        }
                                                                        var30 = var30.substring(0, var36) + this.method428(this.method531(4, true, var14), 226) + var30.substring(var36 + 2);
                                                                    }
                                                                }
                                                                var30 = var30.substring(0, var35) + this.method428(this.method531(3, true, var14), 226) + var30.substring(var35 + 2);
                                                            }
                                                        }
                                                        var30 = var30.substring(0, var34) + this.method428(this.method531(2, true, var14), 226) + var30.substring(var34 + 2);
                                                    }
                                                }
                                                var30 = var30.substring(0, var33) + this.method428(this.method531(1, true, var14), 226) + var30.substring(var33 + 2);
                                            }
                                        }
                                        var30 = var30.substring(0, var32) + this.method428(this.method531(0, true, var14), 226) + var30.substring(var32 + 2);
                                    }
                                }
                                int var37 = var30.indexOf("\\n");
                                String var38;
                                if (var37 != -1) {
                                    var38 = var30.substring(0, var37);
                                    var30 = var30.substring(var37 + 2);
                                } else {
                                    var38 = var30;
                                    var30 = "";
                                }
                                if (var14.field103) {
                                    var28.method207(var29, var14.field104, var14.field77 / 2 + var15, var31, -400, var38);
                                } else {
                                    var28.method211(var29, var31, false, var38, var14.field104, var15);
                                }
                                var31 += var28.field690;
                            }
                        } else if (var14.field74 == 5) {
                            Pix32 var39;
                            if (this.method439(var14, 3)) {
                                var39 = var14.field112;
                            } else {
                                var39 = var14.field111;
                            }
                            if (var39 != null) {
                                var39.method190(var16, 217, var15);
                            }
                        } else if (var14.field74 == 6) {
                            int var40 = Pix3D.field634;
                            int var41 = Pix3D.field635;
                            Pix3D.field634 = var14.field77 / 2 + var15;
                            Pix3D.field635 = var14.field78 / 2 + var16;
                            int var42 = Pix3D.field638[var14.field120] * var14.field119 >> 16;
                            int var43 = Pix3D.field639[var14.field120] * var14.field119 >> 16;
                            boolean var44 = this.method439(var14, 3);
                            int var45;
                            if (var44) {
                                var45 = var14.field118;
                            } else {
                                var45 = var14.field117;
                            }
                            Model var46;
                            if (var45 == -1) {
                                var46 = var14.method33(-1, -1, false, var44);
                            } else {
                                SeqType var47 = SeqType.field1081[var45];
                                var46 = var14.method33(var47.field1084[var14.field70], var47.field1083[var14.field70], false, var44);
                            }
                            if (var46 != null) {
                                var46.method155(0, var14.field121, 0, var14.field120, 0, var42, var43);
                            }
                            Pix3D.field634 = var40;
                            Pix3D.field635 = var41;
                        } else if (var14.field74 == 7) {
                            PixFont var48 = var14.field105;
                            int var49 = 0;
                            for (int var50 = 0; var50 < var14.field78; ++var50) {
                                for (int var51 = 0; var51 < var14.field77; ++var51) {
                                    if (var14.field68[var49] > 0) {
                                        ObjType var52 = ObjType.method339(var14.field68[var49] - 1);
                                        String var53 = var52.field998;
                                        if (var52.field1010 || var14.field69[var49] != 1) {
                                            var53 = var53 + " x" + method445(true, var14.field69[var49]);
                                        }
                                        int var54 = (var14.field96 + 115) * var51 + var15;
                                        int var55 = (var14.field97 + 12) * var50 + var16;
                                        if (var14.field103) {
                                            var48.method207(var14.field108, var14.field104, var14.field77 / 2 + var54, var55, -400, var53);
                                        } else {
                                            var48.method211(var14.field108, var55, false, var53, var14.field104, var54);
                                        }
                                    }
                                    ++var49;
                                }
                            }
                        }
                    }
                }
                Pix2D.method163(var9, var7, var6, var8, 5);
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)Ljava/lang/String;")
    public final String method476(boolean arg0) {
        if (arg0) {
            field1341 = !field1341;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field20 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method477(int arg0) {
        this.field1553 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1387[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field1061; ++var3) {
                if (!IdkType.field1062[var3].field1068 && IdkType.field1062[var3].field1063 == var2 + (this.field1555 ? 0 : 7)) {
                    this.field1387[var2] = var3;
                    break;
                }
            }
        }
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Ljava/lang/String;")
    public static final String method478(int arg0, int arg1, int arg2) {
        int var3 = 34 / arg0;
        int var4 = arg1 - arg2;
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

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method479(boolean arg0) {
        this.method474(true);
        if (this.field1335 == 1) {
            this.field1373[this.field1334 / 100].method190(this.field1333 - 8 - 11, 217, this.field1332 - 8 - 8);
        }
        if (this.field1335 == 2) {
            this.field1373[this.field1334 / 100 + 4].method190(this.field1333 - 8 - 11, 217, this.field1332 - 8 - 8);
        }
        if (this.field1281 != -1) {
            this.method514(this.field1281, this.field1325, true);
            this.method475(Component.field67[this.field1281], 0, 0, 0, -181);
        }
        this.method464(414);
        if (!arg0) {
            if (!this.field1521) {
                this.method536(931);
                this.method509(385);
            } else if (this.field1282 == 0) {
                this.method426((byte) 7);
            }
            if (this.field1466 == 1) {
                if (this.field1490 <= 0 && this.field1443 != 1) {
                    this.field1182[1].method190(296, 217, 472);
                } else {
                    this.field1182[1].method190(258, 217, 472);
                }
            }
            if (this.field1490 > 0) {
                this.field1182[0].method190(296, 217, 472);
                this.field1425.method206(this.field1539, "Level: " + this.field1490, 484, 329, 16776960);
            }
            if (this.field1443 == 1) {
                this.field1182[6].method190(296, 217, 472);
                this.field1425.method206(this.field1539, "Arena", 484, 329, 16776960);
            }
            if (this.field1551 != 0) {
                int var2 = this.field1551 / 50;
                int var3 = var2 / 60;
                int var4 = var2 % 60;
                if (var4 < 10) {
                    this.field1425.method209(16776960, 4, 9, 329, "System update in: " + var3 + ":0" + var4);
                } else {
                    this.field1425.method209(16776960, 4, 9, 329, "System update in: " + var3 + ":" + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method480(int arg0, String arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1365; ++var3) {
                if (arg1.equalsIgnoreCase(this.field1392[var3])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(field1310.field460);
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        LocType.field953.method115();
        LocType.field954.method115();
        if (arg0) {
            field1341 = !field1341;
        }
        NpcType.field984.method115();
        ObjType.field1031.method115();
        ObjType.field1032.method115();
        PlayerEntity.field481.method115();
        SpotAnimType.field1110.method115();
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 237);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1230 = Integer.parseInt(arg0[0]);
                field1231 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method455((byte) -102);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method519(true);
                }
                if (arg0[3].equals("free")) {
                    field1232 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1232 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(789, 532, 587);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method482(int arg0) {
        this.field1546 += arg0;
        if (super.field26 == 1) {
            int var2 = super.field27 - 21 - 561;
            int var3 = super.field28 - 9 - 5;
            if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                var2 -= 73;
                var3 -= 75;
                int var4 = this.field1572 + this.field1446 & 2047;
                int var5 = Pix3D.field638[var4];
                int var6 = Pix3D.field639[var4];
                int var7 = (this.field1440 + 256) * var5 >> 8;
                int var8 = (this.field1440 + 256) * var6 >> 8;
                int var9 = var2 * var8 + var3 * var7 >> 11;
                int var10 = var3 * var8 - var2 * var7 >> 11;
                int var11 = field1310.field402 + var9 >> 7;
                int var12 = field1310.field403 - var10 >> 7;
                boolean var13 = this.method460(var11, true, 0, true, field1310.field451[0], 0, var12, 1, 0, 0, 0, field1310.field450[0]);
                if (var13) {
                    this.field1240.method221(var2);
                    this.field1240.method221(var3);
                    this.field1240.method222(this.field1572);
                    this.field1240.method221(57);
                    this.field1240.method221(this.field1446);
                    this.field1240.method221(this.field1440);
                    this.field1240.method221(89);
                    this.field1240.method222(field1310.field402);
                    this.field1240.method222(field1310.field403);
                    this.field1240.method221(this.field1503);
                    this.field1240.method221(63);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method483(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            if (this.field1225 >= 100) {
                this.method449(0, (byte) 3, "", "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = JString.method304((byte) 7, JString.method301(arg0, -16782));
                for (int var5 = 0; var5 < this.field1225; ++var5) {
                    if (this.field1442[var5] == arg0) {
                        this.method449(0, (byte) 3, "", var4 + " is already on your ignore list");
                        return;
                    }
                }
                this.field1577 &= arg1;
                for (int var6 = 0; var6 < this.field1365; ++var6) {
                    if (this.field1255[var6] == arg0) {
                        this.method449(0, (byte) 3, "", "Please remove " + var4 + " from your friend list first");
                        return;
                    }
                }
                this.field1442[this.field1225++] = arg0;
                this.field1258 = true;
                this.field1240.method220((byte) 78, 84);
                this.field1240.method227(arg0, false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(B)V")
    public final void method484(byte arg0) {
        this.field1149 = 0;
        for (int var2 = -1; var2 < this.field1473 + this.field1404; ++var2) {
            PathingEntity var17;
            if (var2 == -1) {
                var17 = field1310;
            } else if (var2 < this.field1473) {
                var17 = this.field1472[this.field1474[var2]];
            } else {
                var17 = this.field1403[this.field1405[var2 - this.field1473]];
            }
            if (var17 != null && var17.method124(-27441)) {
                if (var2 >= this.field1473) {
                    if (this.field1565 == 1 && this.field1405[var2 - this.field1473] == this.field1329 && field1433 % 20 < 10) {
                        this.method516(var17.field447 + 15, var17, 933);
                        if (this.field1497 > -1) {
                            this.field1182[2].method190(this.field1498 - 28, 217, this.field1497 - 12);
                        }
                    }
                } else {
                    int var18 = 30;
                    PlayerEntity var19 = (PlayerEntity) var17;
                    if (var19.field463 != 0) {
                        this.method516(var17.field447 + 15, var17, 933);
                        if (this.field1497 > -1) {
                            for (int var20 = 0; var20 < 8; ++var20) {
                                if ((var19.field463 & 1 << var20) != 0) {
                                    this.field1182[var20].method190(this.field1498 - var18, 217, this.field1497 - 12);
                                    var18 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1565 == 10 && this.field1474[var2] == this.field1445) {
                        this.method516(var17.field447 + 15, var17, 933);
                        if (this.field1497 > -1) {
                            this.field1182[7].method190(this.field1498 - var18, 217, this.field1497 - 12);
                        }
                    }
                }
                if (var17.field414 != null && (var2 >= this.field1473 || this.field1416 == 0 || this.field1416 == 3 || this.field1416 == 1 && this.method480(790, ((PlayerEntity) var17).field460))) {
                    this.method516(var17.field447, var17, 933);
                    if (this.field1497 > -1 && this.field1149 < this.field1150) {
                        this.field1154[this.field1149] = this.field1426.method208((byte) 2, var17.field414) / 2;
                        this.field1153[this.field1149] = this.field1426.field690;
                        this.field1151[this.field1149] = this.field1497;
                        this.field1152[this.field1149] = this.field1498;
                        this.field1155[this.field1149] = var17.field416;
                        this.field1156[this.field1149] = var17.field417;
                        this.field1157[this.field1149] = var17.field415;
                        this.field1158[this.field1149++] = var17.field414;
                        if (this.field1528 == 0 && var17.field417 == 1) {
                            this.field1153[this.field1149] += 10;
                            this.field1152[this.field1149] += 5;
                        }
                        if (this.field1528 == 0 && var17.field417 == 2) {
                            this.field1154[this.field1149] = 60;
                        }
                    }
                }
                if (var17.field420 > field1433 + 100) {
                    this.method516(var17.field447 + 15, var17, 933);
                    if (this.field1497 > -1) {
                        int var21 = var17.field421 * 30 / var17.field422;
                        if (var21 > 30) {
                            var21 = 30;
                        }
                        Pix2D.method165(5, 660, this.field1498 - 3, var21, this.field1497 - 15, 65280);
                        Pix2D.method165(5, 660, this.field1498 - 3, 30 - var21, this.field1497 - 15 + var21, 16711680);
                    }
                }
                if (var17.field420 > field1433 + 330) {
                    this.method516(var17.field447 / 2, var17, 933);
                    if (this.field1497 > -1) {
                        this.field1371[var17.field419].method190(this.field1498 - 12, 217, this.field1497 - 12);
                        this.field1424.method206(this.field1539, String.valueOf(var17.field418), this.field1497, this.field1498 + 4, 0);
                        this.field1424.method206(this.field1539, String.valueOf(var17.field418), this.field1497 - 1, this.field1498 + 3, 16777215);
                    }
                }
            }
        }
        if (arg0 != -17) {
            this.field1547 = this.field1583.method231();
        }
        for (int var3 = 0; var3 < this.field1149; ++var3) {
            int var4 = this.field1151[var3];
            int var5 = this.field1152[var3];
            int var6 = this.field1154[var3];
            int var7 = this.field1153[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var16 = 0; var16 < var3; ++var16) {
                    if (var5 + 2 > this.field1152[var16] - this.field1153[var16] && var5 - var7 < this.field1152[var16] + 2 && var4 - var6 < this.field1154[var16] + this.field1151[var16] && var4 + var6 > this.field1151[var16] - this.field1154[var16] && this.field1152[var16] - this.field1153[var16] < var5) {
                        var5 = this.field1152[var16] - this.field1153[var16];
                        var8 = true;
                    }
                }
            }
            this.field1497 = this.field1151[var3];
            this.field1498 = this.field1152[var3] = var5;
            String var9 = this.field1158[var3];
            if (this.field1528 == 0) {
                int var10 = 16776960;
                if (this.field1155[var3] < 6) {
                    var10 = this.field1235[this.field1155[var3]];
                }
                if (this.field1155[var3] == 6) {
                    var10 = this.field1444 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1155[var3] == 7) {
                    var10 = this.field1444 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1155[var3] == 8) {
                    var10 = this.field1444 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1155[var3] == 9) {
                    int var11 = 150 - this.field1157[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field1155[var3] == 10) {
                    int var12 = 150 - this.field1157[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field1155[var3] == 11) {
                    int var13 = 150 - this.field1157[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field1156[var3] == 0) {
                    this.field1426.method206(this.field1539, var9, this.field1497, this.field1498 + 1, 0);
                    this.field1426.method206(this.field1539, var9, this.field1497, this.field1498, var10);
                }
                if (this.field1156[var3] == 1) {
                    this.field1426.method210(this.field1275, var9, 0, this.field1498 + 1, this.field1444, this.field1497);
                    this.field1426.method210(this.field1275, var9, var10, this.field1498, this.field1444, this.field1497);
                }
                if (this.field1156[var3] == 2) {
                    int var14 = this.field1426.method208((byte) 2, var9);
                    int var15 = (150 - this.field1157[var3]) * (var14 + 100) / 150;
                    Pix2D.method163(334, 0, this.field1497 - 50, this.field1497 + 50, 5);
                    this.field1426.method209(0, this.field1497 + 50 - var15, 9, this.field1498 + 1, var9);
                    this.field1426.method209(var10, this.field1497 + 50 - var15, 9, this.field1498, var9);
                    Pix2D.method162(958);
                }
            } else {
                this.field1426.method206(this.field1539, var9, this.field1497, this.field1498 + 1, 0);
                this.field1426.method206(this.field1539, var9, this.field1497, this.field1498, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 95 / arg6;
        int var9 = 2048 - arg1 & 2047;
        int var10 = 2048 - arg4 & 2047;
        int var11 = 0;
        int var12 = 0;
        int var13 = arg2;
        if (var9 != 0) {
            int var14 = Model.field597[var9];
            int var15 = Model.field598[var9];
            int var16 = var12 * var15 - arg2 * var14 >> 16;
            var13 = var12 * var14 + arg2 * var15 >> 16;
            var12 = var16;
        }
        if (var10 != 0) {
            int var17 = Model.field597[var10];
            int var18 = Model.field598[var10];
            int var19 = var11 * var18 + var13 * var17 >> 16;
            var13 = var13 * var18 - var11 * var17 >> 16;
            var11 = var19;
        }
        this.field1194 = arg3 - var11;
        this.field1195 = arg5 - var12;
        this.field1196 = arg0 - var13;
        this.field1197 = arg1;
        this.field1198 = arg4;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method486(int arg0, int arg1) {
        if (arg1 >= 0) {
            if (this.field1243) {
                this.field1243 = false;
                this.field1463 = true;
            }
            int var3 = this.field1517[arg1];
            int var4 = this.field1518[arg1];
            int var5 = this.field1519[arg1];
            int var6 = this.field1520[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 55 && this.method490(var6, 143, var4, 62, var3)) {
                this.field1240.method222(this.field1486);
            }
            if (var5 == 367) {
                PlayerEntity var7 = this.field1472[var6];
                if (var7 != null) {
                    this.method460(var7.field450[0], true, 0, false, field1310.field451[0], 0, var7.field451[0], 2, 1, 0, 1, field1310.field450[0]);
                    this.field1332 = super.field27;
                    this.field1333 = super.field28;
                    this.field1335 = 2;
                    this.field1334 = 0;
                    this.field1240.method220((byte) 78, 101);
                    this.field1240.method222(var6);
                    this.field1240.method222(this.field1456);
                    this.field1240.method222(this.field1454);
                    this.field1240.method222(this.field1455);
                }
            }
            if (var5 == 34) {
                String var8 = this.field1238[arg1];
                int var9 = var8.indexOf("@whi@");
                if (var9 != -1) {
                    this.method435((byte) 84);
                    this.field1362 = var8.substring(var9 + 5).trim();
                    this.field1222 = false;
                    for (int var10 = 0; var10 < Component.field67.length; ++var10) {
                        if (Component.field67[var10] != null && Component.field67[var10].field76 == 600) {
                            this.field1355 = this.field1281 = Component.field67[var10].field73;
                            break;
                        }
                    }
                }
            }
            if (var5 == 930) {
                Component var11 = Component.field67[var4];
                this.field1485 = 1;
                this.field1486 = var4;
                this.field1487 = var11.field124;
                this.field1453 = 0;
                String var12 = var11.field122;
                if (var12.indexOf(" ") != -1) {
                    var12 = var12.substring(0, var12.indexOf(" "));
                }
                String var13 = var11.field122;
                if (var13.indexOf(" ") != -1) {
                    var13 = var13.substring(var13.indexOf(" ") + 1);
                }
                this.field1488 = var12 + " " + var11.field123 + " " + var13;
                if (this.field1487 == 16) {
                    this.field1258 = true;
                    this.field1353 = 3;
                    this.field1461 = true;
                }
            } else {
                if (var5 == 217) {
                    boolean var14 = this.method460(var3, true, 0, false, field1310.field451[0], 0, var4, 2, 0, 0, 0, field1310.field450[0]);
                    if (!var14) {
                        this.method460(var3, true, 0, false, field1310.field451[0], 0, var4, 2, 1, 0, 1, field1310.field450[0]);
                    }
                    this.field1332 = super.field27;
                    this.field1333 = super.field28;
                    this.field1335 = 2;
                    this.field1334 = 0;
                    this.field1240.method220((byte) 78, 76);
                    this.field1240.method222(this.field1261 + var3);
                    this.field1240.method222(this.field1262 + var4);
                    this.field1240.method222(var6);
                    this.field1240.method222(this.field1456);
                    this.field1240.method222(this.field1454);
                    this.field1240.method222(this.field1455);
                }
                if (var5 == 660) {
                    if (!this.field1521) {
                        this.field1144.method100(super.field27 - 8, super.field28 - 11, -19180);
                    } else {
                        this.field1144.method100(var3 - 8, var4 - 11, -19180);
                    }
                }
                if (var5 == 450 && this.method490(var6, 143, var4, 160, var3)) {
                    this.field1240.method222(this.field1456);
                    this.field1240.method222(this.field1454);
                    this.field1240.method222(this.field1455);
                }
                if (var5 == 391) {
                    this.field1240.method220((byte) 78, 90);
                    this.field1240.method222(var6);
                    this.field1240.method222(var3);
                    this.field1240.method222(var4);
                    this.field1240.method222(this.field1486);
                    this.field1207 = 0;
                    this.field1208 = var4;
                    this.field1209 = var3;
                    this.field1210 = 2;
                    if (Component.field67[var4].field73 == this.field1281) {
                        this.field1210 = 1;
                    }
                    if (Component.field67[var4].field73 == this.field1408) {
                        this.field1210 = 3;
                    }
                }
                if (var5 == 965) {
                    boolean var16 = this.method460(var3, true, 0, false, field1310.field451[0], 0, var4, 2, 0, 0, 0, field1310.field450[0]);
                    if (!var16) {
                        this.method460(var3, true, 0, false, field1310.field451[0], 0, var4, 2, 1, 0, 1, field1310.field450[0]);
                    }
                    this.field1332 = super.field27;
                    this.field1333 = super.field28;
                    this.field1335 = 2;
                    this.field1334 = 0;
                    this.field1240.method220((byte) 78, 78);
                    this.field1240.method222(this.field1261 + var3);
                    this.field1240.method222(this.field1262 + var4);
                    this.field1240.method222(var6);
                    this.field1240.method222(this.field1486);
                }
                if (var5 == 465) {
                    this.field1240.method220((byte) 78, 111);
                    this.field1240.method222(var4);
                    Component var18 = Component.field67[var4];
                    if (var18.field81 != null && var18.field81[0][0] == 5) {
                        int var19 = var18.field81[0][1];
                        this.field1256[var19] = 1 - this.field1256[var19];
                        this.method444(false, var19);
                        this.field1258 = true;
                    }
                }
                if (var5 == 900) {
                    NpcEntity var20 = this.field1403[var6];
                    if (var20 != null) {
                        this.method460(var20.field450[0], true, 0, false, field1310.field451[0], 0, var20.field451[0], 2, 1, 0, 1, field1310.field450[0]);
                        this.field1332 = super.field27;
                        this.field1333 = super.field28;
                        this.field1335 = 2;
                        this.field1334 = 0;
                        this.field1240.method220((byte) 78, 21);
                        this.field1240.method222(var6);
                        this.field1240.method222(this.field1456);
                        this.field1240.method222(this.field1454);
                        this.field1240.method222(this.field1455);
                    }
                }
                if (var5 == 947) {
                    this.method435((byte) 84);
                }
                if (var5 == 960) {
                    this.field1240.method220((byte) 78, 111);
                    this.field1240.method222(var4);
                    Component var21 = Component.field67[var4];
                    if (var21.field81 != null && var21.field81[0][0] == 5) {
                        int var22 = var21.field81[0][1];
                        if (this.field1256[var22] != var21.field83[0]) {
                            this.field1256[var22] = var21.field83[0];
                            this.method444(false, var22);
                            this.field1258 = true;
                        }
                    }
                }
                if (var5 == 1773) {
                    ObjType var23 = ObjType.method339(var6);
                    String var24;
                    if (var4 >= 100000) {
                        var24 = var4 + " x " + var23.field998;
                    } else if (var23.field999 != null) {
                        var24 = new String(var23.field999);
                    } else {
                        var24 = "It's a " + var23.field998 + ".";
                    }
                    this.method449(0, (byte) 3, "", var24);
                }
                if (var5 == 881) {
                    this.field1240.method220((byte) 78, 45);
                    this.field1240.method222(var6);
                    this.field1240.method222(var3);
                    this.field1240.method222(var4);
                    this.field1240.method222(this.field1456);
                    this.field1240.method222(this.field1454);
                    this.field1240.method222(this.field1455);
                    this.field1207 = 0;
                    this.field1208 = var4;
                    this.field1209 = var3;
                    this.field1210 = 2;
                    if (Component.field67[var4].field73 == this.field1281) {
                        this.field1210 = 1;
                    }
                    if (Component.field67[var4].field73 == this.field1408) {
                        this.field1210 = 3;
                    }
                }
                if (var5 == 951) {
                    Component var25 = Component.field67[var4];
                    boolean var26 = true;
                    if (var25.field76 > 0) {
                        var26 = this.method529(var25, (byte) 8);
                    }
                    if (var26) {
                        this.field1240.method220((byte) 78, 111);
                        this.field1240.method222(var4);
                    }
                }
                if (var5 == 265) {
                    NpcEntity var27 = this.field1403[var6];
                    if (var27 != null) {
                        this.method460(var27.field450[0], true, 0, false, field1310.field451[0], 0, var27.field451[0], 2, 1, 0, 1, field1310.field450[0]);
                        this.field1332 = super.field27;
                        this.field1333 = super.field28;
                        this.field1335 = 2;
                        this.field1334 = 0;
                        this.field1240.method220((byte) 78, 114);
                        this.field1240.method222(var6);
                        this.field1240.method222(this.field1486);
                    }
                }
                if (var5 == 1175) {
                    int var28 = var6 >> 14 & 32767;
                    LocType var29 = LocType.method324(var28);
                    String var30;
                    if (var29.field924 != null) {
                        var30 = new String(var29.field924);
                    } else {
                        var30 = "It's a " + var29.field923 + ".";
                    }
                    this.method449(0, (byte) 3, "", var30);
                }
                if (var5 == 602 || var5 == 596 || var5 == 22 || var5 == 892 || var5 == 415) {
                    if (var5 == 602) {
                        this.field1240.method220((byte) 78, 22);
                    }
                    if (var5 == 892) {
                        if ((var3 & 3) == 0) {
                            ++field1452;
                        }
                        if (field1452 >= 130) {
                            this.field1240.method220((byte) 78, 36);
                            this.field1240.method221(177);
                        }
                        this.field1240.method220((byte) 78, 77);
                    }
                    if (var5 == 22) {
                        this.field1240.method220((byte) 78, 239);
                    }
                    if (var5 == 596) {
                        this.field1240.method220((byte) 78, 81);
                    }
                    if (var5 == 415) {
                        if ((var4 & 3) == 0) {
                            ++field1350;
                        }
                        if (field1350 >= 55) {
                            this.field1240.method220((byte) 78, 126);
                            this.field1240.method225(0);
                        }
                        this.field1240.method220((byte) 78, 154);
                    }
                    this.field1240.method222(var6);
                    this.field1240.method222(var3);
                    this.field1240.method222(var4);
                    this.field1207 = 0;
                    this.field1208 = var4;
                    this.field1209 = var3;
                    this.field1210 = 2;
                    if (Component.field67[var4].field73 == this.field1281) {
                        this.field1210 = 1;
                    }
                    if (Component.field67[var4].field73 == this.field1408) {
                        this.field1210 = 3;
                    }
                }
                if (var5 == 1373 || var5 == 1544 || var5 == 151 || var5 == 1101) {
                    PlayerEntity var31 = this.field1472[var6];
                    if (var31 != null) {
                        this.method460(var31.field450[0], true, 0, false, field1310.field451[0], 0, var31.field451[0], 2, 1, 0, 1, field1310.field450[0]);
                        this.field1332 = super.field27;
                        this.field1333 = super.field28;
                        this.field1335 = 2;
                        this.field1334 = 0;
                        if (var5 == 1101) {
                            this.field1240.method220((byte) 78, 223);
                        }
                        if (var5 == 151) {
                            ++field1185;
                            if (field1185 >= 90) {
                                this.field1240.method220((byte) 78, 65);
                                this.field1240.method222(31114);
                            }
                            this.field1240.method220((byte) 78, 94);
                        }
                        if (var5 == 1373) {
                            this.field1240.method220((byte) 78, 192);
                        }
                        if (var5 == 1544) {
                            this.field1240.method220((byte) 78, 66);
                        }
                        this.field1240.method222(var6);
                    }
                }
                if (var5 == 285) {
                    this.method490(var6, 143, var4, 47, var3);
                }
                if (var5 == 405 || var5 == 38 || var5 == 422 || var5 == 478 || var5 == 347) {
                    if (var5 == 422) {
                        this.field1240.method220((byte) 78, 176);
                    }
                    if (var5 == 478) {
                        if ((var3 & 3) == 0) {
                            ++field1236;
                        }
                        if (field1236 >= 90) {
                            this.field1240.method220((byte) 78, 52);
                        }
                        this.field1240.method220((byte) 78, 85);
                    }
                    if (var5 == 38) {
                        this.field1240.method220((byte) 78, 203);
                    }
                    if (var5 == 405) {
                        field1423 += var6;
                        if (field1423 >= 97) {
                            this.field1240.method220((byte) 78, 161);
                            this.field1240.method224(14953816);
                        }
                        this.field1240.method220((byte) 78, 93);
                    }
                    if (var5 == 347) {
                        this.field1240.method220((byte) 78, 127);
                    }
                    this.field1240.method222(var6);
                    this.field1240.method222(var3);
                    this.field1240.method222(var4);
                    this.field1207 = 0;
                    this.field1208 = var4;
                    this.field1209 = var3;
                    this.field1210 = 2;
                    if (Component.field67[var4].field73 == this.field1281) {
                        this.field1210 = 1;
                    }
                    if (Component.field67[var4].field73 == this.field1408) {
                        this.field1210 = 3;
                    }
                }
                if (var5 == 188) {
                    this.field1453 = 1;
                    this.field1454 = var3;
                    this.field1455 = var4;
                    this.field1456 = var6;
                    this.field1457 = ObjType.method339(var6).field998;
                    this.field1485 = 0;
                } else {
                    if (var5 == 1607) {
                        NpcEntity var32 = this.field1403[var6];
                        if (var32 != null) {
                            String var33;
                            if (var32.field456.field964 != null) {
                                var33 = new String(var32.field456.field964);
                            } else {
                                var33 = "It's a " + var32.field456.field963 + ".";
                            }
                            this.method449(0, (byte) 3, "", var33);
                        }
                    }
                    if (var5 == 651) {
                        PlayerEntity var34 = this.field1472[var6];
                        if (var34 != null) {
                            this.method460(var34.field450[0], true, 0, false, field1310.field451[0], 0, var34.field451[0], 2, 1, 0, 1, field1310.field450[0]);
                            this.field1332 = super.field27;
                            this.field1333 = super.field28;
                            this.field1335 = 2;
                            this.field1334 = 0;
                            this.field1240.method220((byte) 78, 116);
                            this.field1240.method222(var6);
                            this.field1240.method222(this.field1486);
                        }
                    }
                    if (var5 == 504) {
                        this.method490(var6, 143, var4, 185, var3);
                    }
                    if (var5 == 224 || var5 == 993 || var5 == 99 || var5 == 746 || var5 == 877) {
                        boolean var35 = this.method460(var3, true, 0, false, field1310.field451[0], 0, var4, 2, 0, 0, 0, field1310.field450[0]);
                        if (!var35) {
                            this.method460(var3, true, 0, false, field1310.field451[0], 0, var4, 2, 1, 0, 1, field1310.field450[0]);
                        }
                        this.field1332 = super.field27;
                        this.field1333 = super.field28;
                        this.field1335 = 2;
                        this.field1334 = 0;
                        if (var5 == 746) {
                            this.field1240.method220((byte) 78, 195);
                        }
                        if (var5 == 877) {
                            this.field1240.method220((byte) 78, 139);
                        }
                        if (var5 == 224) {
                            this.field1240.method220((byte) 78, 186);
                        }
                        if (var5 == 993) {
                            this.field1240.method220((byte) 78, 46);
                        }
                        if (var5 == 99) {
                            this.field1240.method220((byte) 78, 86);
                        }
                        this.field1240.method222(this.field1261 + var3);
                        this.field1240.method222(this.field1262 + var4);
                        this.field1240.method222(var6);
                    }
                    if (var5 == 581) {
                        if ((var6 & 3) == 0) {
                            ++field1142;
                        }
                        if (field1142 >= 99) {
                            this.field1240.method220((byte) 78, 255);
                            this.field1240.method225(0);
                        }
                        this.method490(var6, 143, var4, 83, var3);
                    }
                    if (var5 == 728 || var5 == 542 || var5 == 6 || var5 == 963 || var5 == 245) {
                        NpcEntity var37 = this.field1403[var6];
                        if (var37 != null) {
                            this.method460(var37.field450[0], true, 0, false, field1310.field451[0], 0, var37.field451[0], 2, 1, 0, 1, field1310.field450[0]);
                            this.field1332 = super.field27;
                            this.field1333 = super.field28;
                            this.field1335 = 2;
                            this.field1334 = 0;
                            if (var5 == 542) {
                                this.field1240.method220((byte) 78, 158);
                            }
                            if (var5 == 245) {
                                if ((var6 & 3) == 0) {
                                    ++field1202;
                                }
                                if (field1202 >= 85) {
                                    this.field1240.method220((byte) 78, 174);
                                    this.field1240.method222(39596);
                                }
                                this.field1240.method220((byte) 78, 242);
                            }
                            if (var5 == 963) {
                                this.field1240.method220((byte) 78, 99);
                            }
                            if (var5 == 728) {
                                this.field1240.method220((byte) 78, 149);
                            }
                            if (var5 == 6) {
                                if ((var6 & 3) == 0) {
                                    ++field1437;
                                }
                                if (field1437 >= 124) {
                                    this.field1240.method220((byte) 78, 55);
                                    this.field1240.method225(0);
                                }
                                this.field1240.method220((byte) 78, 237);
                            }
                            this.field1240.method222(var6);
                        }
                    }
                    if (var5 == 364) {
                        this.method490(var6, 143, var4, 75, var3);
                    }
                    if (var5 == 406 || var5 == 436 || var5 == 557 || var5 == 556) {
                        String var38 = this.field1238[arg1];
                        int var39 = var38.indexOf("@whi@");
                        if (var39 != -1) {
                            long var40 = JString.method300(var38.substring(var39 + 5).trim());
                            if (var5 == 406) {
                                this.method518(var40, 0);
                            }
                            if (var5 == 436) {
                                this.method483(var40, true);
                            }
                            if (var5 == 557) {
                                this.method434((byte) 9, var40);
                            }
                            if (var5 == 556) {
                                this.method523(var40, 1);
                            }
                        }
                    }
                    if (var5 == 903 || var5 == 363) {
                        String var42 = this.field1238[arg1];
                        int var43 = var42.indexOf("@whi@");
                        if (var43 != -1) {
                            String var44 = var42.substring(var43 + 5).trim();
                            String var45 = JString.method304((byte) 7, JString.method301(JString.method300(var44), -16782));
                            boolean var46 = false;
                            for (int var47 = 0; var47 < this.field1473; ++var47) {
                                PlayerEntity var48 = this.field1472[this.field1474[var47]];
                                if (var48 != null && var48.field460 != null && var48.field460.equalsIgnoreCase(var45)) {
                                    this.method460(var48.field450[0], true, 0, false, field1310.field451[0], 0, var48.field451[0], 2, 1, 0, 1, field1310.field450[0]);
                                    if (var5 == 903) {
                                        this.field1240.method220((byte) 78, 192);
                                    }
                                    if (var5 == 363) {
                                        this.field1240.method220((byte) 78, 223);
                                    }
                                    this.field1240.method222(this.field1474[var47]);
                                    var46 = true;
                                    break;
                                }
                            }
                            if (!var46) {
                                this.method449(0, (byte) 3, "", "Unable to find " + var45);
                            }
                        }
                    }
                    if (var5 == 44 && !this.field1316) {
                        this.field1240.method220((byte) 78, 157);
                        this.field1240.method222(var4);
                        this.field1316 = true;
                    }
                    if (var5 == 1501) {
                        field1148 += this.field1262;
                        if (field1148 >= 92) {
                            this.field1240.method220((byte) 78, 220);
                            this.field1240.method225(0);
                        }
                        this.method490(var6, 143, var4, 134, var3);
                    }
                    if (var5 == 679) {
                        String var49 = this.field1238[arg1];
                        int var50 = var49.indexOf("@whi@");
                        if (var50 != -1) {
                            long var51 = JString.method300(var49.substring(var50 + 5).trim());
                            int var53 = -1;
                            for (int var54 = 0; var54 < this.field1365; ++var54) {
                                if (this.field1255[var54] == var51) {
                                    var53 = var54;
                                    break;
                                }
                            }
                            if (var53 != -1 && this.field1512[var53] > 0) {
                                this.field1463 = true;
                                this.field1243 = false;
                                this.field1143 = true;
                                this.field1569 = "";
                                this.field1428 = 3;
                                this.field1160 = this.field1255[var53];
                                this.field1585 = "Enter message to send to " + this.field1392[var53];
                            }
                        }
                    }
                    if (var5 == 1102) {
                        ObjType var55 = ObjType.method339(var6);
                        String var56;
                        if (var55.field999 != null) {
                            var56 = new String(var55.field999);
                        } else {
                            var56 = "It's a " + var55.field998 + ".";
                        }
                        this.method449(0, (byte) 3, "", var56);
                    }
                    this.field1453 = 0;
                    this.field1485 = 0;
                    if (arg0 < 7 || arg0 > 7) {
                        this.field1409 = -143;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method487(int arg0) {
        this.field1546 += arg0;
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method5((byte) 7);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field1281 != -1 && this.field1355 == this.field1281) {
                        if (var2 == 8 && this.field1362.length() > 0) {
                            this.field1362 = this.field1362.substring(0, this.field1362.length() - 1);
                        }
                        break;
                    }
                    if (this.field1143) {
                        if (var2 >= 32 && var2 <= 122 && this.field1569.length() < 80) {
                            this.field1569 = this.field1569 + (char) var2;
                            this.field1463 = true;
                        }
                        if (var2 == 8 && this.field1569.length() > 0) {
                            this.field1569 = this.field1569.substring(0, this.field1569.length() - 1);
                            this.field1463 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field1143 = false;
                            this.field1463 = true;
                            if (this.field1428 == 1) {
                                long var3 = JString.method300(this.field1569);
                                this.method518(var3, 0);
                            }
                            if (this.field1428 == 2 && this.field1365 > 0) {
                                long var5 = JString.method300(this.field1569);
                                this.method434((byte) 9, var5);
                            }
                            if (this.field1428 == 3 && this.field1569.length() > 0) {
                                this.field1240.method220((byte) 78, 183);
                                this.field1240.method221(0);
                                int var7 = this.field1240.field698;
                                this.field1240.method227(this.field1160, false);
                                WordPack.method308((byte) 50, this.field1569, this.field1240);
                                this.field1240.method230(this.field1240.field698 - var7, 316);
                                this.field1569 = JString.method305((byte) 30, this.field1569);
                                this.field1569 = WordFilter.method390(22793, this.field1569);
                                this.method449(6, (byte) 3, JString.method304((byte) 7, JString.method301(this.field1160, -16782)), this.field1569);
                                if (this.field1483 == 2) {
                                    this.field1483 = 1;
                                    this.field1166 = true;
                                    this.field1240.method220((byte) 78, 130);
                                    this.field1240.method221(this.field1416);
                                    this.field1240.method221(this.field1483);
                                    this.field1240.method221(this.field1268);
                                }
                            }
                            if (this.field1428 == 4 && this.field1225 < 100) {
                                long var8 = JString.method300(this.field1569);
                                this.method483(var8, true);
                            }
                            if (this.field1428 == 5 && this.field1225 > 0) {
                                long var10 = JString.method300(this.field1569);
                                this.method523(var10, 1);
                            }
                        }
                    } else if (this.field1243) {
                        if (var2 >= 48 && var2 <= 57 && this.field1324.length() < 10) {
                            this.field1324 = this.field1324 + (char) var2;
                            this.field1463 = true;
                        }
                        if (var2 == 8 && this.field1324.length() > 0) {
                            this.field1324 = this.field1324.substring(0, this.field1324.length() - 1);
                            this.field1463 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field1324.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field1324);
                                } catch (Exception var16) {
                                }
                                this.field1240.method220((byte) 78, 206);
                                this.field1240.method225(var12);
                            }
                            this.field1243 = false;
                            this.field1463 = true;
                        }
                    } else if (this.field1408 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field1237.length() < 80) {
                            this.field1237 = this.field1237 + (char) var2;
                            this.field1463 = true;
                        }
                        if (var2 == 8 && this.field1237.length() > 0) {
                            this.field1237 = this.field1237.substring(0, this.field1237.length() - 1);
                            this.field1463 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field1237.length() > 0) {
                            if (this.field1237.equals("::clientdrop") && (super.field20 != null || this.method476(false).indexOf("192.168.1.") != -1)) {
                                this.method542(5);
                            } else if (this.field1237.equals("::lag")) {
                                this.method423((byte) 30);
                            } else if (this.field1237.startsWith("::")) {
                                this.field1240.method220((byte) 78, 91);
                                this.field1240.method221(this.field1237.length() - 1);
                                this.field1240.method228(this.field1237.substring(2));
                            } else {
                                byte var13 = 0;
                                if (this.field1237.startsWith("yellow:")) {
                                    var13 = 0;
                                    this.field1237 = this.field1237.substring(7);
                                }
                                if (this.field1237.startsWith("red:")) {
                                    var13 = 1;
                                    this.field1237 = this.field1237.substring(4);
                                }
                                if (this.field1237.startsWith("green:")) {
                                    var13 = 2;
                                    this.field1237 = this.field1237.substring(6);
                                }
                                if (this.field1237.startsWith("cyan:")) {
                                    var13 = 3;
                                    this.field1237 = this.field1237.substring(5);
                                }
                                if (this.field1237.startsWith("purple:")) {
                                    var13 = 4;
                                    this.field1237 = this.field1237.substring(7);
                                }
                                if (this.field1237.startsWith("white:")) {
                                    var13 = 5;
                                    this.field1237 = this.field1237.substring(6);
                                }
                                if (this.field1237.startsWith("flash1:")) {
                                    var13 = 6;
                                    this.field1237 = this.field1237.substring(7);
                                }
                                if (this.field1237.startsWith("flash2:")) {
                                    var13 = 7;
                                    this.field1237 = this.field1237.substring(7);
                                }
                                if (this.field1237.startsWith("flash3:")) {
                                    var13 = 8;
                                    this.field1237 = this.field1237.substring(7);
                                }
                                if (this.field1237.startsWith("glow1:")) {
                                    var13 = 9;
                                    this.field1237 = this.field1237.substring(6);
                                }
                                if (this.field1237.startsWith("glow2:")) {
                                    var13 = 10;
                                    this.field1237 = this.field1237.substring(6);
                                }
                                if (this.field1237.startsWith("glow3:")) {
                                    var13 = 11;
                                    this.field1237 = this.field1237.substring(6);
                                }
                                byte var14 = 0;
                                if (this.field1237.startsWith("wave:")) {
                                    var14 = 1;
                                    this.field1237 = this.field1237.substring(5);
                                }
                                if (this.field1237.startsWith("scroll:")) {
                                    var14 = 2;
                                    this.field1237 = this.field1237.substring(7);
                                }
                                this.field1240.method220((byte) 78, 89);
                                this.field1240.method221(0);
                                int var15 = this.field1240.field698;
                                this.field1240.method221(var13);
                                this.field1240.method221(var14);
                                WordPack.method308((byte) 50, this.field1237, this.field1240);
                                this.field1240.method230(this.field1240.field698 - var15, 316);
                                this.field1237 = JString.method305((byte) 30, this.field1237);
                                this.field1237 = WordFilter.method390(22793, this.field1237);
                                field1310.field414 = this.field1237;
                                field1310.field416 = var13;
                                field1310.field417 = var14;
                                field1310.field415 = 150;
                                this.method449(2, (byte) 3, field1310.field460, field1310.field414);
                                if (this.field1416 == 2) {
                                    this.field1416 = 3;
                                    this.field1166 = true;
                                    this.field1240.method220((byte) 78, 130);
                                    this.field1240.method221(this.field1416);
                                    this.field1240.method221(this.field1483);
                                    this.field1240.method221(this.field1268);
                                }
                            }
                            this.field1237 = "";
                            this.field1463 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field1362.length() < 12) {
                this.field1362 = this.field1362 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLkb;)V")
    public final void method488(boolean arg0, Pix8 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1388.length; ++var4) {
            this.field1388[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1388[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field1389[var16] = (this.field1388[var16 - 1] + this.field1388[var16 + 1] + this.field1388[var16 - 128] + this.field1388[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field1388;
            this.field1388 = this.field1389;
            this.field1389 = var14;
        }
        if (!arg0) {
            this.field1240.method221(191);
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field674; ++var8) {
                for (int var9 = 0; var9 < arg1.field673; ++var9) {
                    if (arg1.field671[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field675;
                        int var11 = var8 + 16 + arg1.field676;
                        int var12 = (var11 << 7) + var10;
                        this.field1388[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method489(int arg0) {
        if (arg0 >= 0) {
            this.field1522 = 36;
        }
        for (SpotAnimEntity var2 = (SpotAnimEntity) this.field1584.method250(); var2 != null; var2 = (SpotAnimEntity) this.field1584.method252(true)) {
            if (this.field1340 == var2.field604 && !var2.field610) {
                if (field1433 >= var2.field603) {
                    var2.method160(0, this.field1325);
                    if (var2.field610) {
                        var2.method118();
                    } else {
                        this.field1144.method73(false, -1, var2.field607, 60, var2.field604, 0, var2, var2.field605, (byte) 9, var2.field606);
                    }
                }
            } else {
                var2.method118();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)Z")
    public final boolean method490(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 0) {
            arg3 = this.field1583.method231();
        }
        int var6 = arg0 >> 14 & 32767;
        int var7 = this.field1144.method92(this.field1340, arg4, arg2, arg0);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method460(arg4, true, 0, false, field1310.field451[0], var9, arg2, 2, 0, var8 + 1, 0, field1310.field450[0]);
            } else {
                LocType var10 = LocType.method324(var6);
                int var11;
                int var12;
                if (var9 != 0 && var9 != 2) {
                    var11 = var10.field928;
                    var12 = var10.field927;
                } else {
                    var11 = var10.field927;
                    var12 = var10.field928;
                }
                int var13 = var10.field951;
                if (var9 != 0) {
                    var13 = (var13 >> 4 - var9) + (var13 << var9 & 15);
                }
                this.method460(arg4, true, var13, false, field1310.field451[0], 0, arg2, 2, var11, 0, var12, field1310.field450[0]);
            }
            this.field1332 = super.field27;
            this.field1333 = super.field28;
            this.field1335 = 2;
            this.field1334 = 0;
            this.field1240.method220((byte) 78, arg3);
            this.field1240.method222(this.field1261 + arg4);
            this.field1240.method222(this.field1262 + arg2);
            this.field1240.method222(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method491(int arg0) {
        if (arg0 != 17165) {
            field1341 = !field1341;
        }
        if (this.field1377 == 0) {
            int var2 = super.field15 / 2 - 80;
            int var3 = super.field16 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field26 == 1 && super.field27 >= var2 - 75 && super.field27 <= var2 + 75 && super.field28 >= var14 - 20 && super.field28 <= var14 + 20) {
                this.field1377 = 3;
                this.field1180 = 0;
            }
            int var4 = super.field15 / 2 + 80;
            if (super.field26 == 1 && super.field27 >= var4 - 75 && super.field27 <= var4 + 75 && super.field28 >= var14 - 20 && super.field28 <= var14 + 20) {
                this.field1406 = "";
                this.field1407 = "Enter your username & password.";
                this.field1377 = 2;
                this.field1180 = 0;
                return;
            }
        } else {
            if (this.field1377 == 2) {
                int var5 = super.field16 / 2 - 40;
                int var15 = var5 + 30;
                int var16 = var15 + 25;
                if (super.field26 == 1 && super.field28 >= var16 - 15 && super.field28 < var16) {
                    this.field1180 = 0;
                }
                var5 = var16 + 15;
                if (super.field26 == 1 && super.field28 >= var5 - 15 && super.field28 < var5) {
                    this.field1180 = 1;
                }
                var5 += 15;
                int var6 = super.field15 / 2 - 80;
                int var7 = super.field16 / 2 + 50;
                int var17 = var7 + 20;
                if (super.field26 == 1 && super.field27 >= var6 - 75 && super.field27 <= var6 + 75 && super.field28 >= var17 - 20 && super.field28 <= var17 + 20) {
                    this.method418(this.field1541, this.field1542, false);
                }
                int var8 = super.field15 / 2 + 80;
                if (super.field26 == 1 && super.field27 >= var8 - 75 && super.field27 <= var8 + 75 && super.field28 >= var17 - 20 && super.field28 <= var17 + 20) {
                    this.field1377 = 0;
                    this.field1541 = "";
                    this.field1542 = "";
                }
                while (true) {
                    while (true) {
                        int var9 = this.method5((byte) 7);
                        if (var9 == -1) {
                            return;
                        }
                        boolean var10 = false;
                        for (int var11 = 0; var11 < field1432.length(); ++var11) {
                            if (var9 == field1432.charAt(var11)) {
                                var10 = true;
                                break;
                            }
                        }
                        if (this.field1180 == 0) {
                            if (var9 == 8 && this.field1541.length() > 0) {
                                this.field1541 = this.field1541.substring(0, this.field1541.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field1180 = 1;
                            }
                            if (var10) {
                                this.field1541 = this.field1541 + (char) var9;
                            }
                            if (this.field1541.length() > 12) {
                                this.field1541 = this.field1541.substring(0, 12);
                            }
                        } else if (this.field1180 == 1) {
                            if (var9 == 8 && this.field1542.length() > 0) {
                                this.field1542 = this.field1542.substring(0, this.field1542.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field1180 = 0;
                            }
                            if (var10) {
                                this.field1542 = this.field1542 + (char) var9;
                            }
                            if (this.field1542.length() > 20) {
                                this.field1542 = this.field1542.substring(0, 20);
                            }
                        }
                    }
                }
            }
            if (this.field1377 != 3) {
                return;
            }
            int var12 = super.field15 / 2;
            int var13 = super.field16 / 2 + 50;
            int var18 = var13 + 20;
            if (super.field26 != 1 || super.field27 < var12 - 75 || super.field27 > var12 + 75 || super.field28 < var18 - 20 || super.field28 > var18 + 20) {
                return;
            }
            this.field1377 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(B)V")
    public final void method492(byte arg0) {
        if (this.field1551 > 1) {
            --this.field1551;
        }
        if (this.field1550 > 0) {
            --this.field1550;
        }
        for (int var2 = 0; var2 < 5 && this.method510(field1341); ++var2) {
        }
        if (this.field1577) {
            this.method451(this.field1421);
            this.method526(true);
            this.method537(283);
            Packet var3 = InputTracking.method45((byte) -7);
            if (var3 != null) {
                this.field1240.method220((byte) 78, 54);
                this.field1240.method222(var3.field698);
                this.field1240.method229(0, var3.field697, (byte) -66, var3.field698);
                var3.method219(-42845);
            }
            ++this.field1548;
            if (this.field1548 > 750) {
                this.method542(5);
            }
            this.method512(3);
            this.method496((byte) 8);
            this.method446(0);
            if ((super.field29[1] == 1 || super.field29[2] == 1 || super.field29[3] == 1 || super.field29[4] == 1) && this.field1267++ > 5) {
                this.field1267 = 0;
                this.field1240.method220((byte) 78, 152);
                this.field1240.method222(this.field1571);
                this.field1240.method222(this.field1572);
                this.field1240.method221(this.field1446);
                this.field1240.method221(this.field1440);
            }
            ++this.field1325;
            if (this.field1335 != 0) {
                this.field1334 += 20;
                if (this.field1334 >= 400) {
                    this.field1335 = 0;
                }
            }
            if (this.field1210 != 0) {
                ++this.field1207;
                if (this.field1207 >= 15) {
                    if (this.field1210 == 2) {
                        this.field1258 = true;
                    }
                    if (this.field1210 == 3) {
                        this.field1463 = true;
                    }
                    this.field1210 = 0;
                }
            }
            if (this.field1291 != 0) {
                ++this.field1570;
                if (super.field24 > this.field1292 + 5 || super.field24 < this.field1292 - 5 || super.field25 > this.field1293 + 5 || super.field25 < this.field1293 - 5) {
                    this.field1288 = true;
                }
                if (super.field23 == 0) {
                    if (this.field1291 == 2) {
                        this.field1258 = true;
                    }
                    if (this.field1291 == 3) {
                        this.field1463 = true;
                    }
                    this.field1291 = 0;
                    if (this.field1288 && this.field1570 >= 5) {
                        this.field1245 = -1;
                        this.method536(931);
                        if (this.field1289 == this.field1245 && this.field1290 != this.field1244) {
                            Component var4 = Component.field67[this.field1289];
                            int var5 = var4.field68[this.field1244];
                            var4.field68[this.field1244] = var4.field68[this.field1290];
                            var4.field68[this.field1290] = var5;
                            int var6 = var4.field69[this.field1244];
                            var4.field69[this.field1244] = var4.field69[this.field1290];
                            var4.field69[this.field1290] = var6;
                            this.field1240.method220((byte) 78, 128);
                            this.field1240.method222(this.field1289);
                            this.field1240.method222(this.field1290);
                            this.field1240.method222(this.field1244);
                        }
                    } else if ((this.field1178 == 1 || this.method442(this.field1478 - 1, false)) && this.field1478 > 2) {
                        this.method437(-819);
                    } else if (this.field1478 > 0) {
                        this.method486(7, this.field1478 - 1);
                    }
                    this.field1207 = 10;
                    super.field26 = 0;
                }
            }
            ++field1429;
            if (arg0 != -47) {
                this.method6();
            }
            if (field1429 > 127) {
                field1429 = 0;
                this.field1240.method220((byte) 78, 225);
                this.field1240.method224(4991788);
            }
            if (World3D.field326 != -1) {
                int var7 = World3D.field326;
                int var8 = World3D.field327;
                boolean var9 = this.method460(var7, true, 0, true, field1310.field451[0], 0, var8, 0, 0, 0, 0, field1310.field450[0]);
                World3D.field326 = -1;
                if (var9) {
                    this.field1332 = super.field27;
                    this.field1333 = super.field28;
                    this.field1335 = 1;
                    this.field1334 = 0;
                }
            }
            if (super.field26 == 1 && this.field1465 != null) {
                this.field1465 = null;
                this.field1463 = true;
                super.field26 = 0;
            }
            this.method443(83);
            this.method482(0);
            this.method447(0);
            this.method470((byte) 7);
            if (super.field23 == 1 || super.field26 == 1) {
                ++this.field1212;
            }
            if (this.field1505 == 2) {
                this.method458(0);
            }
            if (this.field1505 == 2 && this.field1314) {
                this.method533(0);
            }
            for (int var10 = 0; var10 < 5; ++var10) {
                int var10002 = this.field1229[var10]++;
            }
            this.method487(0);
            ++super.field22;
            if (super.field22 > 4500) {
                this.field1550 = 250;
                super.field22 -= 500;
                this.field1240.method220((byte) 78, 113);
            }
            ++this.field1564;
            if (this.field1564 > 500) {
                this.field1564 = 0;
                int var11 = (int) (Math.random() * 8.0D);
                if ((var11 & 1) == 1) {
                    this.field1348 += this.field1349;
                }
                if ((var11 & 2) == 2) {
                    this.field1374 += this.field1375;
                }
                if ((var11 & 4) == 4) {
                    this.field1330 += this.field1331;
                }
            }
            if (this.field1348 < -50) {
                this.field1349 = 2;
            }
            if (this.field1348 > 50) {
                this.field1349 = -2;
            }
            if (this.field1374 < -55) {
                this.field1375 = 2;
            }
            if (this.field1374 > 55) {
                this.field1375 = -2;
            }
            if (this.field1330 < -40) {
                this.field1331 = 1;
            }
            if (this.field1330 > 40) {
                this.field1331 = -1;
            }
            ++this.field1379;
            if (this.field1379 > 500) {
                this.field1379 = 0;
                int var12 = (int) (Math.random() * 8.0D);
                if ((var12 & 1) == 1) {
                    this.field1446 += this.field1447;
                }
                if ((var12 & 2) == 2) {
                    this.field1440 += this.field1441;
                }
            }
            if (this.field1446 < -60) {
                this.field1447 = 2;
            }
            if (this.field1446 > 60) {
                this.field1447 = -2;
            }
            if (this.field1440 < -20) {
                this.field1441 = 1;
            }
            if (this.field1440 > 10) {
                this.field1441 = -1;
            }
            ++field1159;
            if (field1159 > 110) {
                field1159 = 0;
                this.field1240.method220((byte) 78, 227);
                this.field1240.method225(0);
            }
            ++this.field1549;
            if (this.field1549 > 50) {
                this.field1240.method220((byte) 78, 251);
            }
            try {
                if (this.field1554 != null && this.field1240.field698 > 0) {
                    this.field1554.method41(this.field1240.field697, 0, this.field1240.field698, false);
                    this.field1240.field698 = 0;
                    this.field1549 = 0;
                }
            } catch (IOException var14) {
                this.method542(5);
            } catch (Exception var15) {
                this.method459((byte) 5);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method493(String arg0) throws IOException {
        return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)V")
    public final void method494(boolean arg0, int arg1) {
        if (!arg0) {
            if (!field1233) {
                if (Pix3D.field648[17] >= arg1) {
                    Pix8 var3 = Pix3D.field642[17];
                    int var4 = var3.field674 * var3.field673 - 1;
                    int var5 = this.field1325 * var3.field673 * 2;
                    byte[] var6 = var3.field671;
                    byte[] var7 = this.field1146;
                    for (int var8 = 0; var8 <= var4; ++var8) {
                        var7[var8] = var6[var8 - var5 & var4];
                    }
                    var3.field671 = var7;
                    this.field1146 = var6;
                    Pix3D.method176(17, (byte) 4);
                }
                if (Pix3D.field648[24] >= arg1) {
                    Pix8 var9 = Pix3D.field642[24];
                    int var10 = var9.field674 * var9.field673 - 1;
                    int var11 = this.field1325 * var9.field673 * 2;
                    byte[] var12 = var9.field671;
                    byte[] var13 = this.field1146;
                    for (int var14 = 0; var14 <= var10; ++var14) {
                        var13[var14] = var12[var14 - var11 & var10];
                    }
                    var9.field671 = var13;
                    this.field1146 = var12;
                    Pix3D.method176(24, (byte) 4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method495(int arg0, int arg1) {
        Component var3 = Component.field67[arg0];
        for (int var4 = 0; var4 < var3.field88.length && var3.field88[var4] != -1; ++var4) {
            Component var5 = Component.field67[var3.field88[var4]];
            if (var5.field74 == 1) {
                this.method495(var5.field72, -99);
            }
            var5.field70 = 0;
            var5.field71 = 0;
        }
        if (arg1 >= 0) {
            field1363 = !field1363;
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(B)V")
    public final void method496(byte arg0) {
        for (int var2 = 0; var2 < this.field1404; ++var2) {
            int var3 = this.field1405[var2];
            NpcEntity var4 = this.field1403[var3];
            if (var4 != null) {
                this.method497(var4, false, var4.field456.field965);
            }
        }
        if (arg0 != 8) {
            field1341 = !field1341;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;ZI)V")
    public final void method497(PathingEntity arg0, boolean arg1, int arg2) {
        if (arg0.field402 < 128 || arg0.field403 < 128 || arg0.field402 >= 13184 || arg0.field403 >= 13184) {
            arg0.field429 = -1;
            arg0.field434 = -1;
            arg0.field443 = 0;
            arg0.field444 = 0;
            arg0.field402 = arg0.field450[0] * 128 + arg0.field406 * 64;
            arg0.field403 = arg0.field451[0] * 128 + arg0.field406 * 64;
            arg0.field449 = 0;
        }
        if (field1310 == arg0 && (arg0.field402 < 1536 || arg0.field403 < 1536 || arg0.field402 >= 11776 || arg0.field403 >= 11776)) {
            arg0.field429 = -1;
            arg0.field434 = -1;
            arg0.field443 = 0;
            arg0.field444 = 0;
            arg0.field402 = arg0.field450[0] * 128 + arg0.field406 * 64;
            arg0.field403 = arg0.field451[0] * 128 + arg0.field406 * 64;
            arg0.field449 = 0;
        }
        if (arg0.field443 > field1433) {
            this.method498(arg0, 47);
        } else if (arg0.field444 >= field1433) {
            this.method499(false, arg0);
        } else {
            this.method500(0, arg0);
        }
        this.method501(arg0, -976);
        if (!arg1) {
            this.method502(arg0, (byte) 2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;I)V")
    public final void method498(PathingEntity arg0, int arg1) {
        int var3 = arg0.field443 - field1433;
        int var4 = arg0.field439 * 128 + arg0.field406 * 64;
        int var5 = arg0.field441 * 128 + arg0.field406 * 64;
        arg0.field402 += (var4 - arg0.field402) / var3;
        arg0.field403 += (var5 - arg0.field403) / var3;
        if (arg1 <= 0) {
            this.field1547 = this.field1583.method231();
        }
        arg0.field453 = 0;
        if (arg0.field445 == 0) {
            arg0.field448 = 1024;
        }
        if (arg0.field445 == 1) {
            arg0.field448 = 1536;
        }
        if (arg0.field445 == 2) {
            arg0.field448 = 0;
        }
        if (arg0.field445 == 3) {
            arg0.field448 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLz;)V")
    public final void method499(boolean arg0, PathingEntity arg1) {
        if (field1433 == arg1.field444 || arg1.field429 == -1 || arg1.field432 != 0 || arg1.field431 + 1 > SeqType.field1081[arg1.field429].method373(true, arg1.field430)) {
            int var3 = arg1.field444 - arg1.field443;
            int var4 = field1433 - arg1.field443;
            int var5 = arg1.field439 * 128 + arg1.field406 * 64;
            int var6 = arg1.field441 * 128 + arg1.field406 * 64;
            int var7 = arg1.field440 * 128 + arg1.field406 * 64;
            int var8 = arg1.field442 * 128 + arg1.field406 * 64;
            arg1.field402 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field403 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field453 = 0;
        if (arg0) {
            this.field1544 = null;
        }
        if (arg1.field445 == 0) {
            arg1.field448 = 1024;
        }
        if (arg1.field445 == 1) {
            arg1.field448 = 1536;
        }
        if (arg1.field445 == 2) {
            arg1.field448 = 0;
        }
        if (arg1.field445 == 3) {
            arg1.field448 = 512;
        }
        arg1.field404 = arg1.field448;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILz;)V")
    public final void method500(int arg0, PathingEntity arg1) {
        arg1.field426 = arg1.field407;
        if (arg1.field449 == 0) {
            arg1.field453 = 0;
        } else {
            if (arg1.field429 != -1 && arg1.field432 == 0) {
                SeqType var3 = SeqType.field1081[arg1.field429];
                if (var3.field1087 == null) {
                    ++arg1.field453;
                    return;
                }
            }
            int var4 = arg1.field402;
            int var5 = arg1.field403;
            this.field1546 += arg0;
            int var6 = arg1.field450[arg1.field449 - 1] * 128 + arg1.field406 * 64;
            int var7 = arg1.field451[arg1.field449 - 1] * 128 + arg1.field406 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field448 = 1280;
                    } else if (var5 > var7) {
                        arg1.field448 = 1792;
                    } else {
                        arg1.field448 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field448 = 768;
                    } else if (var5 > var7) {
                        arg1.field448 = 256;
                    } else {
                        arg1.field448 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field448 = 1024;
                } else {
                    arg1.field448 = 0;
                }
                int var8 = arg1.field448 - arg1.field404 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field410;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field409;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field412;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field411;
                }
                if (var9 == -1) {
                    var9 = arg1.field409;
                }
                arg1.field426 = var9;
                int var10 = 4;
                if (arg1.field448 != arg1.field404 && arg1.field423 == -1) {
                    var10 = 2;
                }
                if (arg1.field449 > 2) {
                    var10 = 6;
                }
                if (arg1.field449 > 3) {
                    var10 = 8;
                }
                if (arg1.field453 > 0 && arg1.field449 > 1) {
                    var10 = 8;
                    --arg1.field453;
                }
                if (arg1.field452[arg1.field449 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field426 == arg1.field409 && arg1.field413 != -1) {
                    arg1.field426 = arg1.field413;
                }
                if (var4 < var6) {
                    arg1.field402 += var10;
                    if (arg1.field402 > var6) {
                        arg1.field402 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field402 -= var10;
                    if (arg1.field402 < var6) {
                        arg1.field402 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field403 += var10;
                    if (arg1.field403 > var7) {
                        arg1.field403 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field403 -= var10;
                    if (arg1.field403 < var7) {
                        arg1.field403 = var7;
                    }
                }
                if (arg1.field402 == var6 && arg1.field403 == var7) {
                    --arg1.field449;
                }
            } else {
                arg1.field402 = var6;
                arg1.field403 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lz;I)V")
    public final void method501(PathingEntity arg0, int arg1) {
        if (arg1 < 0) {
            if (arg0.field423 != -1 && arg0.field423 < 32768) {
                NpcEntity var3 = this.field1403[arg0.field423];
                if (var3 != null) {
                    int var4 = arg0.field402 - var3.field402;
                    int var5 = arg0.field403 - var3.field403;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field448 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field423 >= 32768) {
                int var6 = arg0.field423 - 32768;
                if (this.field1190 == var6) {
                    var6 = this.field1471;
                }
                PlayerEntity var7 = this.field1472[var6];
                if (var7 != null) {
                    int var8 = arg0.field402 - var7.field402;
                    int var9 = arg0.field403 - var7.field403;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field448 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field424 != 0 || arg0.field425 != 0) && (arg0.field449 == 0 || arg0.field453 > 0)) {
                int var10 = arg0.field402 - (arg0.field424 - this.field1261 - this.field1261) * 64;
                int var11 = arg0.field403 - (arg0.field425 - this.field1262 - this.field1262) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field448 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field424 = 0;
                arg0.field425 = 0;
            }
            int var12 = arg0.field448 - arg0.field404 & 2047;
            if (var12 != 0) {
                if (var12 >= 32 && var12 <= 2016) {
                    if (var12 > 1024) {
                        arg0.field404 -= 32;
                    } else {
                        arg0.field404 += 32;
                    }
                } else {
                    arg0.field404 = arg0.field448;
                }
                arg0.field404 &= 2047;
                if (arg0.field426 == arg0.field407 && arg0.field448 != arg0.field404) {
                    if (arg0.field408 != -1) {
                        arg0.field426 = arg0.field408;
                        return;
                    }
                    arg0.field426 = arg0.field409;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;B)V")
    public final void method502(PathingEntity arg0, byte arg1) {
        if (arg1 != 2) {
            field1341 = !field1341;
        }
        arg0.field405 = false;
        if (arg0.field426 != -1) {
            SeqType var3 = SeqType.field1081[arg0.field426];
            ++arg0.field428;
            if (arg0.field427 < var3.field1082 && arg0.field428 > var3.method373(true, arg0.field427)) {
                arg0.field428 = 0;
                ++arg0.field427;
            }
            if (arg0.field427 >= var3.field1082) {
                arg0.field428 = 0;
                arg0.field427 = 0;
            }
        }
        if (arg0.field429 != -1 && arg0.field432 == 0) {
            SeqType var4 = SeqType.field1081[arg0.field429];
            ++arg0.field431;
            while (arg0.field430 < var4.field1082 && arg0.field431 > var4.method373(true, arg0.field430)) {
                arg0.field431 -= var4.method373(true, arg0.field430);
                ++arg0.field430;
            }
            if (arg0.field430 >= var4.field1082) {
                arg0.field430 -= var4.field1086;
                ++arg0.field433;
                if (arg0.field433 >= var4.field1092) {
                    arg0.field429 = -1;
                }
                if (arg0.field430 < 0 || arg0.field430 >= var4.field1082) {
                    arg0.field429 = -1;
                }
            }
            arg0.field405 = var4.field1088;
        }
        if (arg0.field432 > 0) {
            --arg0.field432;
        }
        if (arg0.field434 != -1 && field1433 >= arg0.field437) {
            if (arg0.field435 < 0) {
                arg0.field435 = 0;
            }
            SeqType var5 = SpotAnimType.field1097[arg0.field434].field1101;
            ++arg0.field436;
            while (arg0.field435 < var5.field1082 && arg0.field436 > var5.method373(true, arg0.field435)) {
                arg0.field436 -= var5.method373(true, arg0.field435);
                ++arg0.field435;
            }
            if (arg0.field435 >= var5.field1082) {
                if (arg0.field435 < 0 || arg0.field435 >= var5.field1082) {
                    arg0.field434 = -1;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method503(boolean arg0) {
        if (this.field1380) {
            this.field1380 = false;
            this.field1393.method261(3, 0, super.field17, 11);
            this.field1394.method261(3, 0, super.field17, 375);
            this.field1395.method261(3, 729, super.field17, 5);
            this.field1396.method261(3, 752, super.field17, 231);
            this.field1397.method261(3, 0, super.field17, 0);
            this.field1398.method261(3, 561, super.field17, 0);
            this.field1399.method261(3, 520, super.field17, 11);
            this.field1400.method261(3, 520, super.field17, 231);
            this.field1401.method261(3, 501, super.field17, 375);
            this.field1402.method261(3, 0, super.field17, 345);
            this.field1258 = true;
            this.field1463 = true;
            this.field1461 = true;
            this.field1166 = true;
            if (this.field1505 != 2) {
                this.field1322.method261(3, 8, super.field17, 11);
                this.field1321.method261(3, 561, super.field17, 5);
            }
        }
        if (this.field1505 == 2) {
            this.method429((byte) -107);
        }
        if (this.field1521 && this.field1282 == 1) {
            this.field1258 = true;
        }
        if (this.field1203 != -1) {
            boolean var2 = this.method514(this.field1203, this.field1325, true);
            if (var2) {
                this.field1258 = true;
            }
        }
        if (this.field1210 == 2) {
            this.field1258 = true;
        }
        if (this.field1291 == 2) {
            this.field1258 = true;
        }
        if (this.field1258) {
            this.method506(true);
            this.field1258 = false;
        }
        if (this.field1408 == -1) {
            this.field1385.field86 = this.field1507 - this.field1538 - 77;
            if (super.field24 > 453 && super.field24 < 565 && super.field25 > 350) {
                this.method422(463, this.field1507, 77, super.field25 - 375, 0, false, super.field24 - 22, (byte) 10, this.field1385);
            }
            int var3 = this.field1507 - 77 - this.field1385.field86;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1507 - 77) {
                var3 = this.field1507 - 77;
            }
            if (this.field1538 != var3) {
                this.field1538 = var3;
                this.field1463 = true;
            }
        }
        if (this.field1408 != -1) {
            boolean var4 = this.method514(this.field1408, this.field1325, true);
            if (var4) {
                this.field1463 = true;
            }
        }
        if (this.field1210 == 3) {
            this.field1463 = true;
        }
        if (this.field1291 == 3) {
            this.field1463 = true;
        }
        if (this.field1465 != null) {
            this.field1463 = true;
        }
        if (this.field1521 && this.field1282 == 2) {
            this.field1463 = true;
        }
        if (this.field1463) {
            this.method525(0);
            this.field1463 = false;
        }
        if (this.field1505 == 2) {
            this.method546(false);
            this.field1321.method261(3, 561, super.field17, 5);
        }
        if (this.field1449 != -1) {
            this.field1461 = true;
        }
        if (this.field1461) {
            if (this.field1449 != -1 && this.field1449 == this.field1353) {
                this.field1449 = -1;
                this.field1240.method220((byte) 78, 48);
                this.field1240.method221(this.field1353);
            }
            this.field1461 = false;
            this.field1278.method260((byte) 1);
            this.field1582.method204(0, 217, 0);
            if (this.field1203 == -1) {
                if (this.field1354[this.field1353] != -1) {
                    if (this.field1353 == 0) {
                        this.field1523.method204(30, 217, 29);
                    }
                    if (this.field1353 == 1) {
                        this.field1524.method204(29, 217, 59);
                    }
                    if (this.field1353 == 2) {
                        this.field1524.method204(29, 217, 87);
                    }
                    if (this.field1353 == 3) {
                        this.field1525.method204(29, 217, 115);
                    }
                    if (this.field1353 == 4) {
                        this.field1527.method204(29, 217, 156);
                    }
                    if (this.field1353 == 5) {
                        this.field1527.method204(29, 217, 184);
                    }
                    if (this.field1353 == 6) {
                        this.field1526.method204(30, 217, 212);
                    }
                }
                if (this.field1354[0] != -1 && (this.field1449 != 0 || field1433 % 20 < 10)) {
                    this.field1239[0].method204(34, 217, 35);
                }
                if (this.field1354[1] != -1 && (this.field1449 != 1 || field1433 % 20 < 10)) {
                    this.field1239[1].method204(32, 217, 59);
                }
                if (this.field1354[2] != -1 && (this.field1449 != 2 || field1433 % 20 < 10)) {
                    this.field1239[2].method204(32, 217, 86);
                }
                if (this.field1354[3] != -1 && (this.field1449 != 3 || field1433 % 20 < 10)) {
                    this.field1239[3].method204(33, 217, 121);
                }
                if (this.field1354[4] != -1 && (this.field1449 != 4 || field1433 % 20 < 10)) {
                    this.field1239[4].method204(34, 217, 157);
                }
                if (this.field1354[5] != -1 && (this.field1449 != 5 || field1433 % 20 < 10)) {
                    this.field1239[5].method204(32, 217, 185);
                }
                if (this.field1354[6] != -1 && (this.field1449 != 6 || field1433 % 20 < 10)) {
                    this.field1239[6].method204(34, 217, 212);
                }
            }
            this.field1278.method261(3, 520, super.field17, 165);
            this.field1277.method260((byte) 1);
            this.field1581.method204(0, 217, 0);
            if (this.field1203 == -1) {
                if (this.field1354[this.field1353] != -1) {
                    if (this.field1353 == 7) {
                        this.field1161.method204(0, 217, 49);
                    }
                    if (this.field1353 == 8) {
                        this.field1162.method204(0, 217, 81);
                    }
                    if (this.field1353 == 9) {
                        this.field1162.method204(0, 217, 108);
                    }
                    if (this.field1353 == 10) {
                        this.field1163.method204(1, 217, 136);
                    }
                    if (this.field1353 == 11) {
                        this.field1165.method204(0, 217, 178);
                    }
                    if (this.field1353 == 12) {
                        this.field1165.method204(0, 217, 205);
                    }
                    if (this.field1353 == 13) {
                        this.field1164.method204(0, 217, 233);
                    }
                }
                if (this.field1354[8] != -1 && (this.field1449 != 8 || field1433 % 20 < 10)) {
                    this.field1239[7].method204(2, 217, 80);
                }
                if (this.field1354[9] != -1 && (this.field1449 != 9 || field1433 % 20 < 10)) {
                    this.field1239[8].method204(3, 217, 107);
                }
                if (this.field1354[10] != -1 && (this.field1449 != 10 || field1433 % 20 < 10)) {
                    this.field1239[9].method204(4, 217, 142);
                }
                if (this.field1354[11] != -1 && (this.field1449 != 11 || field1433 % 20 < 10)) {
                    this.field1239[10].method204(2, 217, 179);
                }
                if (this.field1354[12] != -1 && (this.field1449 != 12 || field1433 % 20 < 10)) {
                    this.field1239[11].method204(2, 217, 206);
                }
                if (this.field1354[13] != -1 && (this.field1449 != 13 || field1433 % 20 < 10)) {
                    this.field1239[12].method204(2, 217, 230);
                }
            }
            this.field1277.method261(3, 501, super.field17, 492);
            this.field1322.method260((byte) 1);
        }
        if (this.field1166) {
            this.field1166 = false;
            this.field1276.method260((byte) 1);
            this.field1580.method204(0, 217, 0);
            this.field1425.method207(16777215, true, 57, 33, -400, "Public chat");
            if (this.field1416 == 0) {
                this.field1425.method207(65280, true, 57, 46, -400, "On");
            }
            if (this.field1416 == 1) {
                this.field1425.method207(16776960, true, 57, 46, -400, "Friends");
            }
            if (this.field1416 == 2) {
                this.field1425.method207(16711680, true, 57, 46, -400, "Off");
            }
            if (this.field1416 == 3) {
                this.field1425.method207(65535, true, 57, 46, -400, "Hide");
            }
            this.field1425.method207(16777215, true, 186, 33, -400, "Private chat");
            if (this.field1483 == 0) {
                this.field1425.method207(65280, true, 186, 46, -400, "On");
            }
            if (this.field1483 == 1) {
                this.field1425.method207(16776960, true, 186, 46, -400, "Friends");
            }
            if (this.field1483 == 2) {
                this.field1425.method207(16711680, true, 186, 46, -400, "Off");
            }
            this.field1425.method207(16777215, true, 326, 33, -400, "Trade/duel");
            if (this.field1268 == 0) {
                this.field1425.method207(65280, true, 326, 46, -400, "On");
            }
            if (this.field1268 == 1) {
                this.field1425.method207(16776960, true, 326, 46, -400, "Friends");
            }
            if (this.field1268 == 2) {
                this.field1425.method207(16711680, true, 326, 46, -400, "Off");
            }
            this.field1425.method207(16777215, true, 462, 38, -400, "Report abuse");
            this.field1276.method261(3, 0, super.field17, 471);
            this.field1322.method260((byte) 1);
        }
        this.field1325 = 0;
        this.field1577 &= arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;I)V")
    private final void method504(int arg0, Packet arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1475; ++var4) {
            int var5 = this.field1476[var4];
            PlayerEntity var6 = this.field1472[var5];
            int var7 = arg1.method231();
            if ((var7 & 128) == 128) {
                var7 += arg1.method231() << 8;
            }
            this.method524(var5, arg1, var6, (byte) 1, var7);
        }
        while (arg0 >= 0) {
            this.field1547 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method505(boolean arg0) {
        try {
            this.field1368 = -1;
            this.field1584.method254();
            this.field1390.method254();
            Pix3D.method172(false);
            this.method481(false);
            this.field1144.method62(this.field1510);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1187[var2].method350(this.field1367);
            }
            System.gc();
            World var3 = new World(22035, 104, 104, this.field1241, this.field1568);
            int var4 = this.field1480.length;
            World.field40 = World3D.field292;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1434[var5] >> 8;
                int var7 = this.field1434[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field40 = false;
                }
            }
            if (World.field40) {
                this.field1144.method63(8, this.field1340);
            } else {
                this.field1144.method63(8, 0);
            }
            this.field1240.method220((byte) 78, 251);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1434[var8] >> 8) * 64 - this.field1261;
                int var10 = (this.field1434[var8] & 255) * 64 - this.field1262;
                byte[] var11 = this.field1480[var8];
                if (var11 != null) {
                    var3.method15(var11, (this.field1253 - 6) * 8, var9, (this.field1252 - 6) * 8, true, var10);
                } else if (this.field1253 < 800) {
                    var3.method14(var9, 64, 2, 64, var10);
                }
            }
            this.field1240.method220((byte) 78, 251);
            for (int var12 = 0; var12 < var4; ++var12) {
                byte[] var13 = this.field1313[var12];
                if (var13 != null) {
                    int var14 = (this.field1434[var12] >> 8) * 64 - this.field1261;
                    int var15 = (this.field1434[var12] & 255) * 64 - this.field1262;
                    var3.method18(var15, this.field1187, this.field1422, var13, var14, this.field1144);
                }
            }
            this.field1240.method220((byte) 78, 251);
            var3.method20(this.field1144, this.field1187, false);
            this.field1322.method260((byte) 1);
            this.field1240.method220((byte) 78, 251);
            for (int var16 = 0; var16 < 104; ++var16) {
                for (int var17 = 0; var17 < 104; ++var17) {
                    this.method530(var16, var17);
                }
            }
            this.method421(80);
        } catch (Exception var30) {
        }
        LocType.field953.method115();
        if (arg0) {
            this.field1240.method221(42);
        }
        if (field1233 && signlink.cache_dat != null) {
            int var19 = this.field1410.method274(0, 4);
            for (int var20 = 0; var20 < var19; ++var20) {
                int var21 = this.field1410.method278(0, var20);
                if ((var21 & 121) == 0) {
                    Model.method134(var20, -537);
                }
            }
        }
        System.gc();
        Pix3D.method173(20, (byte) -125);
        this.field1410.method283(true);
        int var22 = (this.field1252 - 6) / 8 - 1;
        int var23 = (this.field1252 + 6) / 8 + 1;
        int var24 = (this.field1253 - 6) / 8 - 1;
        int var25 = (this.field1253 + 6) / 8 + 1;
        if (this.field1172) {
            var22 = 49;
            var23 = 50;
            var24 = 49;
            var25 = 50;
        }
        for (int var26 = var22; var26 <= var23; ++var26) {
            for (int var27 = var24; var27 <= var25; ++var27) {
                if (var22 == var26 || var23 == var26 || var24 == var27 || var25 == var27) {
                    int var28 = this.field1410.method276(var27, 0, var26, (byte) 1);
                    if (var28 != -1) {
                        this.field1410.method284(true, 3, var28);
                    }
                    int var29 = this.field1410.method276(var27, 1, var26, (byte) 1);
                    if (var29 != -1) {
                        this.field1410.method284(true, 3, var29);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method506(boolean arg0) {
        this.field1320.method260((byte) 1);
        Pix3D.field640 = this.field1418;
        this.field1326.method204(0, 217, 0);
        if (this.field1203 != -1) {
            this.method475(Component.field67[this.field1203], 0, 0, 0, -181);
        } else if (this.field1354[this.field1353] != -1) {
            this.method475(Component.field67[this.field1354[this.field1353]], 0, 0, 0, -181);
        }
        if (this.field1521 && this.field1282 == 1) {
            this.method426((byte) 7);
        }
        this.field1320.method261(3, 562, super.field17, 231);
        this.field1322.method260((byte) 1);
        Pix3D.field640 = this.field1419;
        if (!arg0) {
            this.field1522 = this.field1274.method295();
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method8(byte arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1554 != null) {
                this.field1554.method37();
            }
        } catch (Exception var2) {
        }
        this.field1554 = null;
        this.method544(true);
        this.field1410.method273();
        this.field1410 = null;
        this.field1240 = null;
        this.field1250 = null;
        this.field1583 = null;
        this.field1434 = null;
        this.field1480 = null;
        this.field1313 = null;
        this.field1435 = null;
        this.field1436 = null;
        this.field1241 = null;
        this.field1568 = null;
        this.field1144 = null;
        this.field1187 = null;
        this.field1242 = null;
        this.field1361 = null;
        this.field1183 = null;
        this.field1184 = null;
        this.field1146 = null;
        this.field1320 = null;
        this.field1321 = null;
        this.field1322 = null;
        this.field1323 = null;
        this.field1276 = null;
        this.field1277 = null;
        this.field1278 = null;
        this.field1393 = null;
        this.field1394 = null;
        this.field1395 = null;
        this.field1396 = null;
        this.field1397 = null;
        if (this.field1458 == arg0) {
            this.field1398 = null;
            this.field1399 = null;
            this.field1400 = null;
            this.field1401 = null;
            this.field1402 = null;
            this.field1326 = null;
            this.field1327 = null;
            this.field1328 = null;
            this.field1580 = null;
            this.field1581 = null;
            this.field1582 = null;
            this.field1239 = null;
            this.field1523 = null;
            this.field1524 = null;
            this.field1525 = null;
            this.field1526 = null;
            this.field1527 = null;
            this.field1161 = null;
            this.field1162 = null;
            this.field1163 = null;
            this.field1164 = null;
            this.field1165 = null;
            this.field1515 = null;
            this.field1371 = null;
            this.field1182 = null;
            this.field1373 = null;
            this.field1411 = null;
            this.field1412 = null;
            this.field1413 = null;
            this.field1414 = null;
            this.field1251 = null;
            this.field1352 = null;
            this.field1586 = null;
            this.field1472 = null;
            this.field1474 = null;
            this.field1476 = null;
            this.field1477 = null;
            this.field1312 = null;
            this.field1403 = null;
            this.field1405 = null;
            this.field1544 = null;
            this.field1174 = null;
            this.field1390 = null;
            this.field1584 = null;
            this.field1517 = null;
            this.field1518 = null;
            this.field1519 = null;
            this.field1520 = null;
            this.field1238 = null;
            this.field1256 = null;
            this.field1170 = null;
            this.field1171 = null;
            this.field1579 = null;
            this.field1344 = null;
            this.field1392 = null;
            this.field1255 = null;
            this.field1512 = null;
            this.field1298 = null;
            this.field1299 = null;
            this.field1295 = null;
            this.field1296 = null;
            this.field1297 = null;
            this.field1300 = null;
            this.field1301 = null;
            this.field1302 = null;
            this.field1303 = null;
            this.method532((byte) 56);
            LocType.method323((byte) 7);
            NpcType.method332((byte) 7);
            ObjType.method338((byte) 7);
            FloType.field1047 = null;
            IdkType.field1062 = null;
            Component.field67 = null;
            UnkType.field1070 = null;
            SeqType.field1081 = null;
            SpotAnimType.field1097 = null;
            SpotAnimType.field1110 = null;
            VarpType.field1112 = null;
            super.field18 = null;
            PlayerEntity.field481 = null;
            Pix3D.method169((byte) 7);
            World3D.method61((byte) 7);
            Model.method131((byte) 7);
            AnimFrame.method59((byte) 7);
            System.gc();
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method507(int arg0, int arg1) {
        while (arg0 >= 0) {
            this.field1547 = this.field1583.method231();
        }
        signlink.wavevol = arg1;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ld;I)Z")
    public final boolean method508(Component arg0, int arg1) {
        while (arg1 >= 0) {
            this.field1547 = this.field1583.method231();
        }
        int var3 = arg0.field76;
        if (var3 >= 1 && var3 <= 200) {
            if (var3 >= 101) {
                var3 -= 101;
            } else {
                --var3;
            }
            this.field1238[this.field1478] = "Remove @whi@" + this.field1392[var3];
            this.field1519[this.field1478] = 557;
            ++this.field1478;
            this.field1238[this.field1478] = "Message @whi@" + this.field1392[var3];
            this.field1519[this.field1478] = 679;
            ++this.field1478;
            return true;
        } else if (var3 >= 401 && var3 <= 500) {
            this.field1238[this.field1478] = "Remove @whi@" + arg0.field106;
            this.field1519[this.field1478] = 556;
            ++this.field1478;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method509(int arg0) {
        if (this.field1478 >= 2 || this.field1453 != 0 || this.field1485 != 0) {
            if (arg0 <= 0) {
                this.field1547 = -1;
            }
            String var2;
            if (this.field1453 == 1 && this.field1478 < 2) {
                var2 = "Use " + this.field1457 + " with...";
            } else if (this.field1485 == 1 && this.field1478 < 2) {
                var2 = this.field1488 + "...";
            } else {
                var2 = this.field1238[this.field1478 - 1];
            }
            if (this.field1478 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1478 - 2) + " more options";
            }
            this.field1426.method212(15, field1433 / 1000, true, var2, 4, false, 16777215);
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)Z")
    public final boolean method510(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        } else if (this.field1554 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1554.method39();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1547 == -1) {
                    this.field1554.method40(this.field1583.field697, 0, 1);
                    this.field1547 = this.field1583.field697[0] & 255;
                    if (this.field1274 != null) {
                        this.field1547 = this.field1547 - this.field1274.method295() & 255;
                    }
                    this.field1546 = Protocol.field1034[this.field1547];
                    --var2;
                }
                if (this.field1546 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1554.method40(this.field1583.field697, 0, 1);
                    this.field1546 = this.field1583.field697[0] & 255;
                    --var2;
                }
                if (this.field1546 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1554.method40(this.field1583.field697, 0, 2);
                    this.field1583.field698 = 0;
                    this.field1546 = this.field1583.method233();
                    var2 -= 2;
                }
                if (var2 < this.field1546) {
                    return false;
                }
                this.field1583.field698 = 0;
                this.field1554.method40(this.field1583.field697, 0, this.field1546);
                this.field1548 = 0;
                this.field1531 = this.field1530;
                this.field1530 = this.field1529;
                this.field1529 = this.field1547;
                if (this.field1547 == 11) {
                    this.field1551 = this.field1583.method233() * 30;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 90) {
                    this.field1318 = this.field1583.method231();
                    this.field1319 = this.field1583.method231();
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 202) {
                    this.field1314 = true;
                    this.field1532 = this.field1583.method231();
                    this.field1533 = this.field1583.method231();
                    this.field1534 = this.field1583.method233();
                    this.field1535 = this.field1583.method231();
                    this.field1536 = this.field1583.method231();
                    if (this.field1536 >= 100) {
                        this.field1194 = this.field1532 * 128 + 64;
                        this.field1196 = this.field1533 * 128 + 64;
                        this.field1195 = this.method520(0, this.field1340, this.field1533, this.field1532) - this.field1534;
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 159) {
                    this.field1258 = true;
                    int var3 = this.field1583.method231();
                    int var4 = this.field1583.method236();
                    int var5 = this.field1583.method231();
                    this.field1217[var3] = var4;
                    this.field1359[var3] = var5;
                    this.field1188[var3] = 1;
                    for (int var6 = 0; var6 < 98; ++var6) {
                        if (var4 >= field1558[var6]) {
                            this.field1188[var3] = var6 + 2;
                        }
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 3) {
                    int var7 = this.field1583.method233();
                    int var8 = this.field1583.method233();
                    if (this.field1252 == var7 && this.field1253 == var8 && this.field1505 == 2) {
                        this.field1547 = -1;
                        return true;
                    }
                    this.field1252 = var7;
                    this.field1253 = var8;
                    this.field1261 = (this.field1252 - 6) * 8;
                    this.field1262 = (this.field1253 - 6) * 8;
                    this.field1172 = false;
                    if ((this.field1252 / 8 == 48 || this.field1252 / 8 == 49) && this.field1253 / 8 == 48) {
                        this.field1172 = true;
                    }
                    if (this.field1252 / 8 == 48 && this.field1253 / 8 == 148) {
                        this.field1172 = true;
                    }
                    this.field1505 = 1;
                    this.field1450 = System.currentTimeMillis();
                    this.field1322.method260((byte) 1);
                    this.field1425.method206(this.field1539, "Loading - please wait.", 257, 151, 0);
                    this.field1425.method206(this.field1539, "Loading - please wait.", 256, 150, 16777215);
                    this.field1322.method261(3, 8, super.field17, 11);
                    int var9 = 0;
                    for (int var10 = (this.field1252 - 6) / 8; var10 <= (this.field1252 + 6) / 8; ++var10) {
                        for (int var11 = (this.field1253 - 6) / 8; var11 <= (this.field1253 + 6) / 8; ++var11) {
                            ++var9;
                        }
                    }
                    this.field1480 = new byte[var9][];
                    this.field1313 = new byte[var9][];
                    this.field1434 = new int[var9];
                    this.field1435 = new int[var9];
                    this.field1436 = new int[var9];
                    int var12 = 0;
                    for (int var13 = (this.field1252 - 6) / 8; var13 <= (this.field1252 + 6) / 8; ++var13) {
                        for (int var14 = (this.field1253 - 6) / 8; var14 <= (this.field1253 + 6) / 8; ++var14) {
                            this.field1434[var12] = (var13 << 8) + var14;
                            if (this.field1172 && (var14 == 49 || var14 == 149 || var14 == 147 || var13 == 50 || var13 == 49 && var14 == 47)) {
                                this.field1435[var12] = -1;
                                this.field1436[var12] = -1;
                                ++var12;
                            } else {
                                int var15 = this.field1435[var12] = this.field1410.method276(var14, 0, var13, (byte) 1);
                                if (var15 != -1) {
                                    this.field1410.method279(3, var15);
                                }
                                int var16 = this.field1436[var12] = this.field1410.method276(var14, 1, var13, (byte) 1);
                                if (var16 != -1) {
                                    this.field1410.method279(3, var16);
                                }
                                ++var12;
                            }
                        }
                    }
                    int var17 = this.field1261 - this.field1263;
                    int var18 = this.field1262 - this.field1264;
                    this.field1263 = this.field1261;
                    this.field1264 = this.field1262;
                    for (int var19 = 0; var19 < 8192; ++var19) {
                        NpcEntity var20 = this.field1403[var19];
                        if (var20 != null) {
                            for (int var21 = 0; var21 < 10; ++var21) {
                                var20.field450[var21] -= var17;
                                var20.field451[var21] -= var18;
                            }
                            var20.field402 -= var17 * 128;
                            var20.field403 -= var18 * 128;
                        }
                    }
                    for (int var22 = 0; var22 < this.field1470; ++var22) {
                        PlayerEntity var23 = this.field1472[var22];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < 10; ++var24) {
                                var23.field450[var24] -= var17;
                                var23.field451[var24] -= var18;
                            }
                            var23.field402 -= var17 * 128;
                            var23.field403 -= var18 * 128;
                        }
                    }
                    this.field1566 = true;
                    byte var25 = 0;
                    byte var26 = 104;
                    byte var27 = 1;
                    if (var17 < 0) {
                        var25 = 103;
                        var26 = -1;
                        var27 = -1;
                    }
                    byte var28 = 0;
                    byte var29 = 104;
                    byte var30 = 1;
                    if (var18 < 0) {
                        var28 = 103;
                        var29 = -1;
                        var30 = -1;
                    }
                    for (int var31 = var25; var26 != var31; var31 += var27) {
                        for (int var32 = var28; var29 != var32; var32 += var30) {
                            int var33 = var17 + var31;
                            int var34 = var18 + var32;
                            for (int var35 = 0; var35 < 4; ++var35) {
                                if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                                    this.field1544[var35][var31][var32] = this.field1544[var35][var33][var34];
                                } else {
                                    this.field1544[var35][var31][var32] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var36 = (LocSpawned) this.field1174.method250(); var36 != null; var36 = (LocSpawned) this.field1174.method252(true)) {
                        var36.field717 -= var17;
                        var36.field718 -= var18;
                        if (var36.field717 < 0 || var36.field718 < 0 || var36.field717 >= 104 || var36.field718 >= 104) {
                            var36.method118();
                        }
                    }
                    if (this.field1342 != 0) {
                        this.field1342 -= var17;
                        this.field1343 -= var18;
                    }
                    this.field1314 = false;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 110) {
                    Packet var37 = InputTracking.method46(false);
                    if (var37 != null) {
                        this.field1240.method220((byte) 78, 54);
                        this.field1240.method222(var37.field698);
                        this.field1240.method229(0, var37.field697, (byte) -66, var37.field698);
                        var37.method219(-42845);
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 82) {
                    long var38 = this.field1583.method237(408);
                    int var40 = this.field1583.method236();
                    int var41 = this.field1583.method231();
                    boolean var42 = false;
                    for (int var43 = 0; var43 < 100; ++var43) {
                        if (this.field1468[var43] == var40) {
                            var42 = true;
                            break;
                        }
                    }
                    if (var41 <= 1) {
                        for (int var44 = 0; var44 < this.field1225; ++var44) {
                            if (this.field1442[var44] == var38) {
                                var42 = true;
                                break;
                            }
                        }
                    }
                    if (!var42 && this.field1469 == 0) {
                        try {
                            this.field1468[this.field1294] = var40;
                            this.field1294 = (this.field1294 + 1) % 100;
                            String var45 = WordPack.method307(this.field1546 - 13, 113, this.field1583);
                            String var46 = WordFilter.method390(22793, var45);
                            if (var41 > 1) {
                                this.method449(7, (byte) 3, JString.method304((byte) 7, JString.method301(var38, -16782)), var46);
                            } else {
                                this.method449(3, (byte) 3, JString.method304((byte) 7, JString.method301(var38, -16782)), var46);
                            }
                        } catch (Exception var151) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 64) {
                    this.field1225 = this.field1546 / 8;
                    for (int var48 = 0; var48 < this.field1225; ++var48) {
                        this.field1442[var48] = this.field1583.method237(408);
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 15) {
                    int var49 = this.field1583.method233();
                    int var50 = this.field1583.method231();
                    if (var49 == 65535) {
                        var49 = -1;
                    }
                    this.field1354[var50] = var49;
                    this.field1258 = true;
                    this.field1461 = true;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 153) {
                    for (int var51 = 0; var51 < this.field1472.length; ++var51) {
                        if (this.field1472[var51] != null) {
                            this.field1472[var51].field429 = -1;
                        }
                    }
                    for (int var52 = 0; var52 < this.field1403.length; ++var52) {
                        if (this.field1403[var52] != null) {
                            this.field1403[var52].field429 = -1;
                        }
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 254) {
                    this.method425(this.field1583, false, this.field1546);
                    this.field1566 = false;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 228) {
                    this.field1565 = this.field1583.method231();
                    if (this.field1565 == 1) {
                        this.field1329 = this.field1583.method233();
                    }
                    if (this.field1565 >= 2 && this.field1565 <= 6) {
                        if (this.field1565 == 2) {
                            this.field1562 = 64;
                            this.field1563 = 64;
                        }
                        if (this.field1565 == 3) {
                            this.field1562 = 0;
                            this.field1563 = 64;
                        }
                        if (this.field1565 == 4) {
                            this.field1562 = 128;
                            this.field1563 = 64;
                        }
                        if (this.field1565 == 5) {
                            this.field1562 = 64;
                            this.field1563 = 0;
                        }
                        if (this.field1565 == 6) {
                            this.field1562 = 64;
                            this.field1563 = 128;
                        }
                        this.field1565 = 2;
                        this.field1559 = this.field1583.method233();
                        this.field1560 = this.field1583.method233();
                        this.field1561 = this.field1583.method231();
                    }
                    if (this.field1565 == 10) {
                        this.field1445 = this.field1583.method233();
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 130) {
                    this.method539(this.field1583, this.field1546, -134);
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 200) {
                    if (this.field1353 == 12) {
                        this.field1258 = true;
                    }
                    this.field1181 = this.field1583.method234();
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 118) {
                    int var53 = this.field1583.method231();
                    int var54 = this.field1583.method231();
                    int var55 = this.field1583.method231();
                    int var56 = this.field1583.method231();
                    this.field1204[var53] = true;
                    this.field1214[var53] = var54;
                    this.field1192[var53] = var55;
                    this.field1576[var53] = var56;
                    this.field1229[var53] = 0;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 27) {
                    this.field1190 = this.field1583.method233();
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 35) {
                    this.field1416 = this.field1583.method231();
                    this.field1483 = this.field1583.method231();
                    this.field1268 = this.field1583.method231();
                    this.field1166 = true;
                    this.field1463 = true;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 115) {
                    if (this.field1203 != -1) {
                        this.field1203 = -1;
                        this.field1258 = true;
                        this.field1461 = true;
                    }
                    if (this.field1408 != -1) {
                        this.field1408 = -1;
                        this.field1463 = true;
                    }
                    if (this.field1243) {
                        this.field1243 = false;
                        this.field1463 = true;
                    }
                    this.field1281 = -1;
                    this.field1316 = false;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 2) {
                    long var57 = this.field1583.method237(408);
                    int var59 = this.field1583.method231();
                    String var60 = JString.method304((byte) 7, JString.method301(var57, -16782));
                    for (int var61 = 0; var61 < this.field1365; ++var61) {
                        if (this.field1255[var61] == var57) {
                            if (this.field1512[var61] != var59) {
                                this.field1512[var61] = var59;
                                this.field1258 = true;
                                if (var59 > 0) {
                                    this.method449(5, (byte) 3, "", var60 + " has logged in.");
                                }
                                if (var59 == 0) {
                                    this.method449(5, (byte) 3, "", var60 + " has logged out.");
                                }
                            }
                            var60 = null;
                            break;
                        }
                    }
                    if (var60 != null && this.field1365 < 100) {
                        this.field1255[this.field1365] = var57;
                        this.field1392[this.field1365] = var60;
                        this.field1512[this.field1365] = var59;
                        ++this.field1365;
                        this.field1258 = true;
                    }
                    boolean var62 = false;
                    while (!var62) {
                        var62 = true;
                        for (int var63 = 0; var63 < this.field1365 - 1; ++var63) {
                            if (this.field1512[var63] != field1230 && this.field1512[var63 + 1] == field1230 || this.field1512[var63] == 0 && this.field1512[var63 + 1] != 0) {
                                int var64 = this.field1512[var63];
                                this.field1512[var63] = this.field1512[var63 + 1];
                                this.field1512[var63 + 1] = var64;
                                String var65 = this.field1392[var63];
                                this.field1392[var63] = this.field1392[var63 + 1];
                                this.field1392[var63 + 1] = var65;
                                long var66 = this.field1255[var63];
                                this.field1255[var63] = this.field1255[var63 + 1];
                                this.field1255[var63 + 1] = var66;
                                this.field1258 = true;
                                var62 = false;
                            }
                        }
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 65) {
                    this.field1342 = 0;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 8) {
                    this.field1314 = false;
                    for (int var68 = 0; var68 < 5; ++var68) {
                        this.field1204[var68] = false;
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 21) {
                    int var69 = this.field1583.method233();
                    Component.field67[var69].field113 = 3;
                    Component.field67[var69].field114 = (field1310.field464[8] << 6) + (field1310.field464[0] << 12) + (field1310.field465[0] << 24) + (field1310.field465[4] << 18) + field1310.field464[11];
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 183) {
                    int var70 = this.field1583.method233();
                    int var71 = this.field1583.method233();
                    Component.field67[var70].field117 = var71;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 182) {
                    this.field1258 = true;
                    int var72 = this.field1583.method233();
                    Component var73 = Component.field67[var72];
                    while (this.field1583.field698 < this.field1546) {
                        int var74 = this.field1583.method231();
                        int var75 = this.field1583.method233();
                        int var76 = this.field1583.method231();
                        if (var76 == 255) {
                            var76 = this.field1583.method236();
                        }
                        if (var74 >= 0 && var74 < var73.field68.length) {
                            var73.field68[var74] = var75;
                            var73.field69[var74] = var76;
                        }
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 24) {
                    this.field1366 = this.field1583.method236();
                    this.field1205 = this.field1583.method233();
                    this.field1499 = this.field1583.method231();
                    this.field1351 = this.field1583.method233();
                    if (this.field1366 != 0 && this.field1281 == -1) {
                        signlink.dnslookup(JString.method303(false, this.field1366));
                        this.method435((byte) 84);
                        short var77 = 650;
                        if (this.field1499 != 201) {
                            var77 = 655;
                        }
                        this.field1362 = "";
                        this.field1222 = false;
                        for (int var78 = 0; var78 < Component.field67.length; ++var78) {
                            if (Component.field67[var78] != null && Component.field67[var78].field76 == var77) {
                                this.field1281 = Component.field67[var78].field73;
                                break;
                            }
                        }
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 186) {
                    if (this.field1353 == 12) {
                        this.field1258 = true;
                    }
                    this.field1345 = this.field1583.method231();
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 155) {
                    int var79 = this.field1583.method233();
                    int var80 = this.field1583.method234();
                    int var81 = this.field1583.method234();
                    Component var82 = Component.field67[var79];
                    var82.field79 = var80;
                    var82.field80 = var81;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 211) {
                    int var83 = this.field1583.method233();
                    int var84 = this.field1583.method233();
                    Component.field67[var83].field113 = 1;
                    Component.field67[var83].field114 = var84;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 177) {
                    String var85 = this.field1583.method238();
                    if (var85.endsWith(":tradereq:")) {
                        String var86 = var85.substring(0, var85.indexOf(":"));
                        long var87 = JString.method300(var86);
                        boolean var89 = false;
                        for (int var90 = 0; var90 < this.field1225; ++var90) {
                            if (this.field1442[var90] == var87) {
                                var89 = true;
                                break;
                            }
                        }
                        if (!var89 && this.field1469 == 0) {
                            this.method449(4, (byte) 3, var86, "wishes to trade with you.");
                        }
                    } else if (!var85.endsWith(":duelreq:")) {
                        this.method449(0, (byte) 3, "", var85);
                    } else {
                        String var91 = var85.substring(0, var85.indexOf(":"));
                        long var92 = JString.method300(var91);
                        boolean var94 = false;
                        for (int var95 = 0; var95 < this.field1225; ++var95) {
                            if (this.field1442[var95] == var92) {
                                var94 = true;
                                break;
                            }
                        }
                        if (!var94 && this.field1469 == 0) {
                            this.method449(8, (byte) 3, var91, "wishes to duel with you.");
                        }
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 178) {
                    int var96 = this.field1583.method233();
                    if (var96 == 65535) {
                        var96 = -1;
                    }
                    if (this.field1191 != var96 && this.field1201 && !field1233) {
                        this.field1226 = var96;
                        this.field1227 = true;
                        this.field1410.method279(2, this.field1226);
                    }
                    this.field1191 = var96;
                    this.field1357 = 0;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 75) {
                    int var97 = this.field1583.method233();
                    int var98 = this.field1583.method233();
                    if (this.field1201 && !field1233) {
                        this.field1226 = var97;
                        this.field1227 = false;
                        this.field1410.method279(2, this.field1226);
                        this.field1357 = var98;
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 157) {
                    int var99 = this.field1583.method233();
                    Component var100 = Component.field67[var99];
                    for (int var101 = 0; var101 < var100.field68.length; ++var101) {
                        var100.field68[var101] = -1;
                        var100.field68[var101] = 0;
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 144) {
                    this.field1318 = this.field1583.method231();
                    this.field1319 = this.field1583.method231();
                    for (int var102 = this.field1318; var102 < this.field1318 + 8; ++var102) {
                        for (int var103 = this.field1319; var103 < this.field1319 + 8; ++var103) {
                            if (this.field1544[this.field1340][var102][var103] != null) {
                                this.field1544[this.field1340][var102][var103] = null;
                                this.method530(var102, var103);
                            }
                        }
                    }
                    for (LocSpawned var104 = (LocSpawned) this.field1174.method250(); var104 != null; var104 = (LocSpawned) this.field1174.method252(true)) {
                        if (var104.field717 >= this.field1318 && var104.field717 < this.field1318 + 8 && var104.field718 >= this.field1319 && var104.field718 < this.field1319 + 8 && this.field1340 == var104.field715) {
                            var104.field726 = 0;
                        }
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 43) {
                    for (int var105 = 0; var105 < this.field1256.length; ++var105) {
                        if (this.field1484[var105] != this.field1256[var105]) {
                            this.field1256[var105] = this.field1484[var105];
                            this.method444(false, var105);
                            this.field1258 = true;
                        }
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 22) {
                    this.field1143 = false;
                    this.field1243 = true;
                    this.field1324 = "";
                    this.field1463 = true;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 36) {
                    int var106 = this.field1583.method233();
                    this.method495(var106, -99);
                    if (this.field1203 != -1) {
                        this.field1203 = -1;
                        this.field1258 = true;
                        this.field1461 = true;
                    }
                    if (this.field1408 != -1) {
                        this.field1408 = -1;
                        this.field1463 = true;
                    }
                    if (this.field1243) {
                        this.field1243 = false;
                        this.field1463 = true;
                    }
                    this.field1281 = var106;
                    this.field1316 = false;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 135) {
                    int var107 = this.field1583.method233();
                    byte var108 = this.field1583.method232();
                    this.field1484[var107] = var108;
                    if (this.field1256[var107] != var108) {
                        this.field1256[var107] = var108;
                        this.method444(false, var107);
                        this.field1258 = true;
                        if (this.field1431 != -1) {
                            this.field1463 = true;
                        }
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 246 || this.field1547 == 248 || this.field1547 == 131 || this.field1547 == 215 || this.field1547 == 67 || this.field1547 == 247 || this.field1547 == 167 || this.field1547 == 230 || this.field1547 == 31 || this.field1547 == 112) {
                    this.method547(this.field1583, this.field1547, 37157);
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 78) {
                    int var109 = this.field1583.method233();
                    int var110 = this.field1583.method233();
                    int var111 = this.field1583.method233();
                    ObjType var112 = ObjType.method339(var110);
                    Component.field67[var109].field113 = 4;
                    Component.field67[var109].field114 = var110;
                    Component.field67[var109].field120 = var112.field1003;
                    Component.field67[var109].field121 = var112.field1004;
                    Component.field67[var109].field119 = var112.field1002 * 100 / var111;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 120) {
                    int var113 = this.field1583.method233();
                    int var114 = this.field1583.method233();
                    int var115 = var114 >> 10 & 31;
                    int var116 = var114 >> 5 & 31;
                    int var117 = var114 & 31;
                    Component.field67[var113].field108 = (var117 << 3) + (var115 << 19) + (var116 << 11);
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 250) {
                    this.field1318 = this.field1583.method231();
                    this.field1319 = this.field1583.method231();
                    while (this.field1583.field698 < this.field1546) {
                        int var118 = this.field1583.method231();
                        this.method547(this.field1583, var118, 37157);
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 13) {
                    this.field1353 = this.field1583.method231();
                    this.field1258 = true;
                    this.field1461 = true;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 199) {
                    this.field1466 = this.field1583.method231();
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 46) {
                    int var119 = this.field1583.method233();
                    this.method495(var119, -99);
                    if (this.field1203 != -1) {
                        this.field1203 = -1;
                        this.field1258 = true;
                        this.field1461 = true;
                    }
                    this.field1408 = var119;
                    this.field1463 = true;
                    this.field1281 = -1;
                    this.field1316 = false;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 168) {
                    int var120 = this.field1583.method234();
                    this.field1431 = var120;
                    this.field1463 = true;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 173) {
                    int var121 = this.field1583.method233();
                    boolean var122 = this.field1583.method231() == 1;
                    Component.field67[var121].field87 = var122;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 18) {
                    this.method459((byte) 5);
                    this.field1547 = -1;
                    return false;
                }
                if (this.field1547 == 181) {
                    int var123 = this.field1583.method233();
                    int var124 = this.field1583.method236();
                    this.field1484[var123] = var124;
                    if (this.field1256[var123] != var124) {
                        this.field1256[var123] = var124;
                        this.method444(false, var123);
                        this.field1258 = true;
                        if (this.field1431 != -1) {
                            this.field1463 = true;
                        }
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 107) {
                    int var125 = this.field1583.method233();
                    this.method495(var125, -99);
                    if (this.field1408 != -1) {
                        this.field1408 = -1;
                        this.field1463 = true;
                    }
                    if (this.field1243) {
                        this.field1243 = false;
                        this.field1463 = true;
                    }
                    this.field1203 = var125;
                    this.field1258 = true;
                    this.field1461 = true;
                    this.field1281 = -1;
                    this.field1316 = false;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 96) {
                    int var126 = this.field1583.method233();
                    int var127 = this.field1583.method231();
                    int var128 = this.field1583.method233();
                    if (this.field1186 && !field1233 && this.field1376 < 50) {
                        this.field1372[this.field1376] = var126;
                        this.field1307[this.field1376] = var127;
                        this.field1369[this.field1376] = Wave.field880[var126] + var128;
                        ++this.field1376;
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 203) {
                    this.field1258 = true;
                    int var129 = this.field1583.method233();
                    Component var130 = Component.field67[var129];
                    int var131 = this.field1583.method231();
                    for (int var132 = 0; var132 < var131; ++var132) {
                        var130.field68[var132] = this.field1583.method233();
                        int var133 = this.field1583.method231();
                        if (var133 == 255) {
                            var133 = this.field1583.method236();
                        }
                        var130.field69[var132] = var133;
                    }
                    for (int var134 = var131; var134 < var130.field68.length; ++var134) {
                        var130.field68[var134] = 0;
                        var130.field69[var134] = 0;
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 94) {
                    this.field1449 = this.field1583.method231();
                    if (this.field1449 == this.field1353) {
                        if (this.field1449 == 3) {
                            this.field1353 = 1;
                        } else {
                            this.field1353 = 3;
                        }
                        this.field1258 = true;
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 0) {
                    this.field1314 = true;
                    this.field1491 = this.field1583.method231();
                    this.field1492 = this.field1583.method231();
                    this.field1493 = this.field1583.method233();
                    this.field1494 = this.field1583.method231();
                    this.field1495 = this.field1583.method231();
                    if (this.field1495 >= 100) {
                        int var135 = this.field1491 * 128 + 64;
                        int var136 = this.field1492 * 128 + 64;
                        int var137 = this.method520(0, this.field1340, this.field1492, this.field1491) - this.field1493;
                        int var138 = var135 - this.field1194;
                        int var139 = var137 - this.field1195;
                        int var140 = var136 - this.field1196;
                        int var141 = (int) Math.sqrt((double) (var138 * var138 + var140 * var140));
                        this.field1197 = (int) (Math.atan2((double) var139, (double) var141) * 325.949D) & 2047;
                        this.field1198 = (int) (Math.atan2((double) var138, (double) var140) * -325.949D) & 2047;
                        if (this.field1197 < 128) {
                            this.field1197 = 128;
                        }
                        if (this.field1197 > 383) {
                            this.field1197 = 383;
                        }
                    }
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 146) {
                    int var142 = this.field1583.method233();
                    int var143 = this.field1583.method233();
                    Component.field67[var142].field113 = 2;
                    Component.field67[var142].field114 = var143;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 25) {
                    InputTracking.method43(true);
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 140) {
                    int var144 = this.field1583.method233();
                    int var145 = this.field1583.method233();
                    if (this.field1408 != -1) {
                        this.field1408 = -1;
                        this.field1463 = true;
                    }
                    if (this.field1243) {
                        this.field1243 = false;
                        this.field1463 = true;
                    }
                    this.field1281 = var144;
                    this.field1203 = var145;
                    this.field1258 = true;
                    this.field1461 = true;
                    this.field1316 = false;
                    this.field1547 = -1;
                    return true;
                }
                if (this.field1547 == 98) {
                    int var146 = this.field1583.method233();
                    String var147 = this.field1583.method238();
                    Component.field67[var146].field106 = var147;
                    if (this.field1354[this.field1353] == Component.field67[var146].field73) {
                        this.field1258 = true;
                    }
                    this.field1547 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1547 + "," + this.field1546 + " - " + this.field1530 + "," + this.field1531);
                this.method459((byte) 5);
            } catch (IOException var152) {
                this.method542(5);
            } catch (Exception var153) {
                String var149 = "T2 - " + this.field1547 + "," + this.field1530 + "," + this.field1531 + " - " + this.field1546 + "," + (field1310.field450[0] + this.field1261) + "," + (field1310.field451[0] + this.field1262) + " - ";
                for (int var150 = 0; var150 < this.field1546 && var150 < 50; ++var150) {
                    var149 = var149 + this.field1583.field697[var150] + ",";
                }
                signlink.reporterror(var149);
                this.method459((byte) 5);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILmb;)V")
    private final void method511(int arg0, int arg1, Packet arg2) {
        arg2.method241(0);
        if (arg1 != -48698) {
            this.field1514 = this.field1274.method295();
        }
        int var4 = arg2.method242(this.field1315, 8);
        if (var4 < this.field1404) {
            for (int var5 = var4; var5 < this.field1404; ++var5) {
                this.field1312[this.field1311++] = this.field1405[var5];
            }
        }
        if (var4 > this.field1404) {
            signlink.reporterror(this.field1541 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1404 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1405[var6];
                NpcEntity var8 = this.field1403[var7];
                int var9 = arg2.method242(this.field1315, 1);
                if (var9 == 0) {
                    this.field1405[this.field1404++] = var7;
                    var8.field446 = field1433;
                } else {
                    int var10 = arg2.method242(this.field1315, 2);
                    if (var10 == 0) {
                        this.field1405[this.field1404++] = var7;
                        var8.field446 = field1433;
                        this.field1476[this.field1475++] = var7;
                    } else if (var10 == 1) {
                        this.field1405[this.field1404++] = var7;
                        var8.field446 = field1433;
                        int var11 = arg2.method242(this.field1315, 3);
                        var8.method123(var11, false, (byte) 43);
                        int var12 = arg2.method242(this.field1315, 1);
                        if (var12 == 1) {
                            this.field1476[this.field1475++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1405[this.field1404++] = var7;
                        var8.field446 = field1433;
                        int var13 = arg2.method242(this.field1315, 3);
                        var8.method123(var13, true, (byte) 43);
                        int var14 = arg2.method242(this.field1315, 3);
                        var8.method123(var14, true, (byte) 43);
                        int var15 = arg2.method242(this.field1315, 1);
                        if (var15 == 1) {
                            this.field1476[this.field1475++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1312[this.field1311++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method512(int arg0) {
        for (int var2 = -1; var2 < this.field1473; ++var2) {
            int var4;
            if (var2 == -1) {
                var4 = this.field1471;
            } else {
                var4 = this.field1474[var2];
            }
            PlayerEntity var5 = this.field1472[var4];
            if (var5 != null) {
                this.method497(var5, false, 1);
            }
        }
        ++field1287;
        if (arg0 >= 3 && arg0 <= 3) {
            if (field1287 > 1406) {
                field1287 = 0;
                this.field1240.method220((byte) 78, 124);
                this.field1240.method221(0);
                int var3 = this.field1240.field698;
                this.field1240.method221(162);
                this.field1240.method221(22);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1240.method221(84);
                }
                this.field1240.method222(31824);
                this.field1240.method222(13490);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1240.method221(123);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1240.method221(134);
                }
                this.field1240.method221(100);
                this.field1240.method221(94);
                this.field1240.method222(35521);
                this.field1240.method230(this.field1240.field698 - var3, 316);
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method513(int arg0) {
        if (this.field1323 == null) {
            this.method532((byte) 56);
            super.field18 = null;
            this.field1295 = null;
            this.field1296 = null;
            this.field1297 = null;
            this.field1298 = null;
            this.field1299 = null;
            this.field1300 = null;
            this.field1301 = null;
            this.field1302 = null;
            this.field1303 = null;
            this.field1323 = new PixMap((byte) 9, 96, 479, this.method11(field1415));
            this.field1321 = new PixMap((byte) 9, 160, 168, this.method11(field1415));
            Pix2D.method164(296);
            this.field1327.method204(0, 217, 0);
            if (arg0 != -19361) {
                this.field1430 = 54;
            }
            this.field1320 = new PixMap((byte) 9, 261, 190, this.method11(field1415));
            this.field1322 = new PixMap((byte) 9, 334, 512, this.method11(field1415));
            Pix2D.method164(296);
            this.field1276 = new PixMap((byte) 9, 61, 501, this.method11(field1415));
            this.field1277 = new PixMap((byte) 9, 40, 288, this.method11(field1415));
            this.field1278 = new PixMap((byte) 9, 66, 269, this.method11(field1415));
            this.field1380 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIZ)Z")
    public final boolean method514(int arg0, int arg1, boolean arg2) {
        boolean var4 = false;
        this.field1577 &= arg2;
        Component var5 = Component.field67[arg0];
        for (int var6 = 0; var6 < var5.field88.length && var5.field88[var6] != -1; ++var6) {
            Component var7 = Component.field67[var5.field88[var6]];
            if (var7.field74 == 1) {
                var4 |= this.method514(var7.field72, arg1, true);
            }
            if (var7.field74 == 6 && (var7.field117 != -1 || var7.field118 != -1)) {
                boolean var8 = this.method439(var7, 3);
                int var9;
                if (var8) {
                    var9 = var7.field118;
                } else {
                    var9 = var7.field117;
                }
                if (var9 != -1) {
                    SeqType var10 = SeqType.field1081[var9];
                    var7.field71 += arg1;
                    while (var7.field71 > var10.method373(true, var7.field70)) {
                        var7.field71 -= var10.method373(true, var7.field70) + 1;
                        ++var7.field70;
                        if (var7.field70 >= var10.field1082) {
                            var7.field70 -= var10.field1086;
                            if (var7.field70 < 0 || var7.field70 >= var10.field1082) {
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

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method515(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1500[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1500[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1501[var14] = (this.field1500[var14 - 1] + this.field1500[var14 + 1] + this.field1500[var14 - 128] + this.field1500[var14 + 128]) / 4;
            }
        }
        this.field1509 += 128;
        if (this.field1481 != arg0) {
            this.field1240.method221(246);
        }
        if (this.field1509 > this.field1388.length) {
            this.field1509 -= this.field1388.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method488(true, this.field1557[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field1501[var11 + 128] - this.field1388[this.field1509 + var11 & this.field1388.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field1500[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field1147[var8] = this.field1147[var8 + 1];
        }
        this.field1147[var2 - 1] = (int) (Math.sin((double) field1433 / 14.0D) * 16.0D + Math.sin((double) field1433 / 15.0D) * 14.0D + Math.sin((double) field1433 / 16.0D) * 12.0D);
        if (this.field1223 > 0) {
            this.field1223 -= 4;
        }
        if (this.field1224 > 0) {
            this.field1224 -= 4;
        }
        if (this.field1223 == 0 && this.field1224 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field1223 = 1024;
            }
            if (var9 == 1) {
                this.field1224 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILz;I)V")
    public final void method516(int arg0, PathingEntity arg1, int arg2) {
        if (arg2 <= 0) {
            this.field1547 = this.field1583.method231();
        }
        this.method517(arg1.field402, arg1.field403, arg0, false);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIZ)V")
    public final void method517(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.field1240.method221(66);
        }
        if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
            int var5 = this.method520(0, this.field1340, arg1, arg0) - arg2;
            int var6 = arg0 - this.field1194;
            int var7 = var5 - this.field1195;
            int var8 = arg1 - this.field1196;
            int var9 = Model.field597[this.field1197];
            int var10 = Model.field598[this.field1197];
            int var11 = Model.field597[this.field1198];
            int var12 = Model.field598[this.field1198];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field1497 = (var13 << 9) / var17 + Pix3D.field634;
                this.field1498 = (var16 << 9) / var17 + Pix3D.field635;
            } else {
                this.field1497 = -1;
                this.field1498 = -1;
            }
        } else {
            this.field1497 = -1;
            this.field1498 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1230 = Integer.parseInt(this.getParameter("nodeid"));
        field1231 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method455((byte) -102);
        } else {
            method519(true);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1232 = false;
        } else {
            field1232 = true;
        }
        this.method2(0, 532, 789);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method518(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field1365 >= 100) {
                this.method449(0, (byte) 3, "", "Your friends list is full. Max of 100 hit");
            } else {
                String var4 = JString.method304((byte) 7, JString.method301(arg0, -16782));
                for (int var5 = 0; var5 < this.field1365; ++var5) {
                    if (this.field1255[var5] == arg0) {
                        this.method449(0, (byte) 3, "", var4 + " is already on your friend list");
                        return;
                    }
                }
                if (arg1 != 0) {
                    this.field1391 = this.field1274.method295();
                }
                for (int var6 = 0; var6 < this.field1225; ++var6) {
                    if (this.field1442[var6] == arg0) {
                        this.method449(0, (byte) 3, "", "Please remove " + var4 + " from your ignore list first");
                        return;
                    }
                }
                if (!var4.equals(field1310.field460)) {
                    this.field1392[this.field1365] = var4;
                    this.field1255[this.field1365] = arg0;
                    this.field1512[this.field1365] = 0;
                    ++this.field1365;
                    this.field1258 = true;
                    this.field1240.method220((byte) 78, 8);
                    this.field1240.method227(arg0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public static final void method519(boolean arg0) {
        if (!arg0) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
        World3D.field292 = false;
        Pix3D.field629 = false;
        field1233 = false;
        World.field40 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method520(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 7;
        int var6 = arg2 >> 7;
        int var7 = arg1;
        this.field1546 += arg0;
        if (arg1 < 3 && (this.field1568[1][var5][var6] & 2) == 2) {
            var7 = arg1 + 1;
        }
        int var8 = arg3 & 127;
        int var9 = arg2 & 127;
        int var10 = (128 - var8) * this.field1241[var7][var5][var6] + this.field1241[var7][var5 + 1][var6] * var8 >> 7;
        int var11 = (128 - var8) * this.field1241[var7][var5][var6 + 1] + this.field1241[var7][var5 + 1][var6 + 1] * var8 >> 7;
        return (128 - var9) * var10 + var9 * var11 >> 7;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 40443) {
            this.method6();
        }
        int var7 = this.field1144.method88(arg4, arg1, arg2);
        if (var7 != 0) {
            int var8 = this.field1144.method92(arg4, arg1, arg2, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg3;
            if (var7 > 0) {
                var11 = arg5;
            }
            int[] var12 = this.field1344.field657;
            int var13 = (103 - arg2) * 512 * 4 + arg1 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method324(var14);
            if (var15.field942 != -1) {
                Pix8 var16 = this.field1251[var15.field942];
                if (var16 != null) {
                    int var17 = (var15.field927 * 4 - var16.field673) / 2;
                    int var18 = (var15.field928 * 4 - var16.field674) / 2;
                    var16.method204((104 - arg2 - var15.field928) * 4 + 48 + var18, 217, arg1 * 4 + 48 + var17);
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
        int var19 = this.field1144.method90(arg4, arg1, arg2);
        if (var19 != 0) {
            int var20 = this.field1144.method92(arg4, arg1, arg2, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            LocType var24 = LocType.method324(var23);
            if (var24.field942 != -1) {
                Pix8 var25 = this.field1251[var24.field942];
                if (var25 != null) {
                    int var26 = (var24.field927 * 4 - var25.field673) / 2;
                    int var27 = (var24.field928 * 4 - var25.field674) / 2;
                    var25.method204((104 - arg2 - var24.field928) * 4 + 48 + var27, 217, arg1 * 4 + 48 + var26);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field1344.field657;
                int var30 = (103 - arg2) * 512 * 4 + arg1 * 4 + 24624;
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
        int var31 = this.field1144.method91(arg4, arg1, arg2);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            LocType var33 = LocType.method324(var32);
            if (var33.field942 != -1) {
                Pix8 var34 = this.field1251[var33.field942];
                if (var34 != null) {
                    int var35 = (var33.field927 * 4 - var34.field673) / 2;
                    int var36 = (var33.field928 * 4 - var34.field674) / 2;
                    var34.method204((104 - arg2 - var33.field928) * 4 + 48 + var36, 217, arg1 * 4 + 48 + var35);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjb;II)V")
    public final void method522(int arg0, Pix32 arg1, int arg2, int arg3) {
        int var5 = this.field1572 + this.field1446 & 2047;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = Model.field597[var5];
            int var8 = Model.field598[var5];
            if (arg0 <= 0) {
                this.field1422 = -430;
            }
            int var9 = var7 * 256 / (this.field1440 + 256);
            int var10 = var8 * 256 / (this.field1440 + 256);
            int var11 = arg2 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg2 * var9 >> 16;
            if (var6 > 2500) {
                arg1.method197(-558, var11 + 94 - arg1.field662 / 2, 83 - var12 - arg1.field663 / 2, this.field1327);
            } else {
                arg1.method190(83 - var12 - arg1.field663 / 2, 217, var11 + 94 - arg1.field662 / 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method523(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1225; ++var4) {
                if (this.field1442[var4] == arg0) {
                    --this.field1225;
                    this.field1258 = true;
                    for (int var5 = var4; var5 < this.field1225; ++var5) {
                        this.field1442[var5] = this.field1442[var5 + 1];
                    }
                    this.field1240.method220((byte) 78, 181);
                    this.field1240.method227(arg0, false);
                    break;
                }
            }
            if (arg1 < 1 || arg1 > 1) {
                for (int var6 = 1; var6 > 0; ++var6) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;Lbb;BI)V")
    private final void method524(int arg0, Packet arg1, PlayerEntity arg2, byte arg3, int arg4) {
        if (arg3 == 1) {
            if ((arg4 & 1) == 1) {
                int var6 = arg1.method231();
                byte[] var7 = new byte[var6];
                Packet var8 = new Packet(var7, true);
                arg1.method240(0, var7, var6, true);
                this.field1477[arg0] = var8;
                arg2.method126(var8, -58);
            }
            if ((arg4 & 2) == 2) {
                int var9 = arg1.method233();
                if (var9 == 65535) {
                    var9 = -1;
                }
                if (arg2.field429 == var9) {
                    arg2.field433 = 0;
                }
                int var10 = arg1.method231();
                if (var9 == -1 || arg2.field429 == -1 || SeqType.field1081[var9].field1089 > SeqType.field1081[arg2.field429].field1089 || SeqType.field1081[arg2.field429].field1089 == 0) {
                    arg2.field429 = var9;
                    arg2.field430 = 0;
                    arg2.field431 = 0;
                    arg2.field432 = var10;
                    arg2.field433 = 0;
                }
            }
            if ((arg4 & 4) == 4) {
                arg2.field423 = arg1.method233();
                if (arg2.field423 == 65535) {
                    arg2.field423 = -1;
                }
            }
            if ((arg4 & 8) == 8) {
                arg2.field414 = arg1.method238();
                arg2.field416 = 0;
                arg2.field417 = 0;
                arg2.field415 = 150;
                this.method449(2, (byte) 3, arg2.field460, arg2.field414);
            }
            if ((arg4 & 16) == 16) {
                arg2.field418 = arg1.method231();
                arg2.field419 = arg1.method231();
                arg2.field420 = field1433 + 400;
                arg2.field421 = arg1.method231();
                arg2.field422 = arg1.method231();
            }
            if ((arg4 & 32) == 32) {
                arg2.field424 = arg1.method233();
                arg2.field425 = arg1.method233();
            }
            if ((arg4 & 64) == 64) {
                int var11 = arg1.method233();
                int var12 = arg1.method231();
                int var13 = arg1.method231();
                int var14 = arg1.field698;
                if (arg2.field460 != null) {
                    long var15 = JString.method300(arg2.field460);
                    boolean var17 = false;
                    if (var12 <= 1) {
                        for (int var18 = 0; var18 < this.field1225; ++var18) {
                            if (this.field1442[var18] == var15) {
                                var17 = true;
                                break;
                            }
                        }
                    }
                    if (!var17 && this.field1469 == 0) {
                        try {
                            String var19 = WordPack.method307(var13, 113, arg1);
                            String var20 = WordFilter.method390(22793, var19);
                            arg2.field414 = var20;
                            arg2.field416 = var11 >> 8;
                            arg2.field417 = var11 & 255;
                            arg2.field415 = 150;
                            if (var12 > 1) {
                                this.method449(1, (byte) 3, arg2.field460, var20);
                            } else {
                                this.method449(2, (byte) 3, arg2.field460, var20);
                            }
                        } catch (Exception var23) {
                            signlink.reporterror("cde2");
                        }
                    }
                }
                arg1.field698 = var13 + var14;
            }
            if ((arg4 & 256) == 256) {
                arg2.field434 = arg1.method233();
                int var22 = arg1.method236();
                arg2.field438 = var22 >> 16;
                arg2.field437 = (var22 & 65535) + field1433;
                arg2.field435 = 0;
                arg2.field436 = 0;
                if (arg2.field437 > field1433) {
                    arg2.field435 = -1;
                }
                if (arg2.field434 == 65535) {
                    arg2.field434 = -1;
                }
            }
            if ((arg4 & 512) == 512) {
                arg2.field439 = arg1.method231();
                arg2.field441 = arg1.method231();
                arg2.field440 = arg1.method231();
                arg2.field442 = arg1.method231();
                arg2.field443 = arg1.method233() + field1433;
                arg2.field444 = arg1.method233() + field1433;
                arg2.field445 = arg1.method231();
                arg2.field449 = 0;
                arg2.field450[0] = arg2.field440;
                arg2.field451[0] = arg2.field442;
            }
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field20 != null) {
                    return new URL("http://127.0.0.1:" + (field1231 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method525(int arg0) {
        this.field1546 += arg0;
        this.field1323.method260((byte) 1);
        Pix3D.field640 = this.field1417;
        this.field1328.method204(0, 217, 0);
        if (this.field1143) {
            this.field1426.method206(this.field1539, this.field1585, 239, 40, 0);
            this.field1426.method206(this.field1539, this.field1569 + "*", 239, 60, 128);
        } else if (this.field1243) {
            this.field1426.method206(this.field1539, "Enter amount:", 239, 40, 0);
            this.field1426.method206(this.field1539, this.field1324 + "*", 239, 60, 128);
        } else if (this.field1465 != null) {
            this.field1426.method206(this.field1539, this.field1465, 239, 40, 0);
            this.field1426.method206(this.field1539, "Click to continue", 239, 60, 128);
        } else if (this.field1408 != -1) {
            this.method475(Component.field67[this.field1408], 0, 0, 0, -181);
        } else if (this.field1431 != -1) {
            this.method475(Component.field67[this.field1431], 0, 0, 0, -181);
        } else {
            PixFont var2 = this.field1425;
            int var3 = 0;
            Pix2D.method163(77, 0, 0, 463, 5);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1306[var4] != null) {
                    int var5 = this.field1304[var4];
                    int var6 = 70 - var3 * 14 + this.field1538;
                    if (var5 == 0) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method209(0, 4, 9, var6, this.field1306[var4]);
                        }
                        ++var3;
                    }
                    if (var5 == 1) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method209(16777215, 4, 9, var6, this.field1305[var4] + ":");
                            var2.method209(255, 12 + var2.method208((byte) 2, this.field1305[var4]), 9, var6, this.field1306[var4]);
                        }
                        ++var3;
                    }
                    if (var5 == 2 && (this.field1416 == 0 || this.field1416 == 1 && this.method480(790, this.field1305[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method209(0, 4, 9, var6, this.field1305[var4] + ":");
                            var2.method209(255, 12 + var2.method208((byte) 2, this.field1305[var4]), 9, var6, this.field1306[var4]);
                        }
                        ++var3;
                    }
                    if ((var5 == 3 || var5 == 7) && this.field1545 == 0 && (var5 == 7 || this.field1483 == 0 || this.field1483 == 1 && this.method480(790, this.field1305[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method209(0, 4, 9, var6, "From " + this.field1305[var4] + ":");
                            var2.method209(8388608, 12 + var2.method208((byte) 2, "From " + this.field1305[var4]), 9, var6, this.field1306[var4]);
                        }
                        ++var3;
                    }
                    if (var5 == 4 && (this.field1268 == 0 || this.field1268 == 1 && this.method480(790, this.field1305[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method209(8388736, 4, 9, var6, this.field1305[var4] + " " + this.field1306[var4]);
                        }
                        ++var3;
                    }
                    if (var5 == 5 && this.field1545 == 0 && this.field1483 < 2) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method209(8388608, 4, 9, var6, this.field1306[var4]);
                        }
                        ++var3;
                    }
                    if (var5 == 6 && this.field1545 == 0 && this.field1483 < 2) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method209(0, 4, 9, var6, "To " + this.field1305[var4] + ":");
                            var2.method209(8388608, 12 + var2.method208((byte) 2, "To " + this.field1305[var4]), 9, var6, this.field1306[var4]);
                        }
                        ++var3;
                    }
                    if (var5 == 8 && (this.field1268 == 0 || this.field1268 == 1 && this.method480(790, this.field1305[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method209(13350793, 4, 9, var6, this.field1305[var4] + " " + this.field1306[var4]);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method162(958);
            this.field1507 = var3 * 14 + 7;
            if (this.field1507 < 78) {
                this.field1507 = 78;
            }
            this.method461(this.field1507 - this.field1538 - 77, 0, false, this.field1507, 463, 77);
            var2.method209(0, 4, 9, 90, JString.method304((byte) 7, this.field1541) + ":");
            var2.method209(255, 6 + var2.method208((byte) 2, this.field1541 + ": "), 9, 90, this.field1237 + "*");
            Pix2D.method167(0, 77, 479, this.field1308, 0);
        }
        if (this.field1521 && this.field1282 == 2) {
            this.method426((byte) 7);
        }
        this.field1323.method261(3, 22, super.field17, 375);
        this.field1322.method260((byte) 1);
        Pix3D.field640 = this.field1419;
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    private final void method526(boolean arg0) {
        this.field1577 &= arg0;
        if (this.field1505 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1174.method250(); var2 != null; var2 = (LocSpawned) this.field1174.method252(true)) {
                if (var2.field726 > 0) {
                    --var2.field726;
                }
                if (var2.field726 == 0) {
                    if (var2.field719 < 0 || World.method30(var2.field719, var2.field721, this.field1459)) {
                        this.method440(var2.field716, var2.field718, var2.field717, var2.field720, var2.field719, var2.field715, var2.field721, (byte) 9);
                        var2.method118();
                    }
                } else {
                    if (var2.field725 > 0) {
                        --var2.field725;
                    }
                    if (var2.field725 == 0 && (var2.field722 < 0 || World.method30(var2.field722, var2.field724, this.field1459))) {
                        this.method440(var2.field716, var2.field718, var2.field717, var2.field723, var2.field722, var2.field715, var2.field724, (byte) 9);
                        var2.field725 = -1;
                        if (var2.field722 == var2.field719 && var2.field719 == -1) {
                            var2.method118();
                        } else if (var2.field722 == var2.field719 && var2.field723 == var2.field720 && var2.field724 == var2.field721) {
                            var2.method118();
                        }
                    }
                }
            }
            ++field1317;
            if (field1317 > 85) {
                field1317 = 0;
                this.field1240.method220((byte) 78, 120);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method527(int arg0) {
        short var2 = 256;
        if (this.field1223 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1223 > 768) {
                    this.field1336[var3] = this.method534(this.field1337[var3], 1024 - this.field1223, false, this.field1338[var3]);
                } else if (this.field1223 > 256) {
                    this.field1336[var3] = this.field1338[var3];
                } else {
                    this.field1336[var3] = this.method534(this.field1338[var3], 256 - this.field1223, false, this.field1337[var3]);
                }
            }
        } else if (this.field1224 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1224 > 768) {
                    this.field1336[var4] = this.method534(this.field1337[var4], 1024 - this.field1224, false, this.field1339[var4]);
                } else if (this.field1224 > 256) {
                    this.field1336[var4] = this.field1339[var4];
                } else {
                    this.field1336[var4] = this.method534(this.field1339[var4], 256 - this.field1224, false, this.field1337[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1336[var5] = this.field1337[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1298.field737[var6] = this.field1269.field657[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1147[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1500[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1336[var26];
                    int var30 = this.field1298.field737[var8];
                    this.field1298.field737[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field1298.method261(3, 0, super.field17, 0);
        if (arg0 < 0) {
            for (int var10 = 0; var10 < 33920; ++var10) {
                this.field1299.field737[var10] = this.field1270.field657[var10];
            }
            int var11 = 0;
            int var12 = 1176;
            for (int var13 = 1; var13 < var2 - 1; ++var13) {
                int var14 = (var2 - var13) * this.field1147[var13] / var2;
                int var15 = 103 - var14;
                int var16 = var12 + var14;
                for (int var17 = 0; var17 < var15; ++var17) {
                    int var18 = this.field1500[var11++];
                    if (var18 != 0) {
                        int var20 = 256 - var18;
                        int var21 = this.field1336[var18];
                        int var22 = this.field1299.field737[var16];
                        this.field1299.field737[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                    } else {
                        ++var16;
                    }
                }
                var11 += 128 - var15;
                var12 = 128 - var15 - var14 + var16;
            }
            this.field1299.method261(3, 661, super.field17, 0);
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method528(int arg0) {
        int var2 = 12 / arg0;
        if (this.field1295 == null) {
            super.field18 = null;
            this.field1323 = null;
            this.field1321 = null;
            this.field1320 = null;
            this.field1322 = null;
            this.field1276 = null;
            this.field1277 = null;
            this.field1278 = null;
            this.field1298 = new PixMap((byte) 9, 265, 128, this.method11(field1415));
            Pix2D.method164(296);
            this.field1299 = new PixMap((byte) 9, 265, 128, this.method11(field1415));
            Pix2D.method164(296);
            this.field1295 = new PixMap((byte) 9, 186, 533, this.method11(field1415));
            Pix2D.method164(296);
            this.field1296 = new PixMap((byte) 9, 146, 360, this.method11(field1415));
            Pix2D.method164(296);
            this.field1297 = new PixMap((byte) 9, 200, 360, this.method11(field1415));
            Pix2D.method164(296);
            this.field1300 = new PixMap((byte) 9, 267, 214, this.method11(field1415));
            Pix2D.method164(296);
            this.field1301 = new PixMap((byte) 9, 267, 215, this.method11(field1415));
            Pix2D.method164(296);
            this.field1302 = new PixMap((byte) 9, 79, 86, this.method11(field1415));
            Pix2D.method164(296);
            this.field1303 = new PixMap((byte) 9, 79, 87, this.method11(field1415));
            Pix2D.method164(296);
            if (this.field1254 != null) {
                this.method438(0);
                this.method457(field1211);
            }
            this.field1380 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;B)Z")
    public final boolean method529(Component arg0, byte arg1) {
        if (arg1 == 8) {
            boolean var3 = false;
        } else {
            this.field1240.method221(125);
        }
        int var4 = arg0.field76;
        if (var4 == 201) {
            this.field1463 = true;
            this.field1243 = false;
            this.field1143 = true;
            this.field1569 = "";
            this.field1428 = 1;
            this.field1585 = "Enter name of friend to add to list";
        }
        if (var4 == 202) {
            this.field1463 = true;
            this.field1243 = false;
            this.field1143 = true;
            this.field1569 = "";
            this.field1428 = 2;
            this.field1585 = "Enter name of friend to delete from list";
        }
        if (var4 == 205) {
            this.field1550 = 250;
            return true;
        } else {
            if (var4 == 501) {
                this.field1463 = true;
                this.field1243 = false;
                this.field1143 = true;
                this.field1569 = "";
                this.field1428 = 4;
                this.field1585 = "Enter name of player to add to list";
            }
            if (var4 == 502) {
                this.field1463 = true;
                this.field1243 = false;
                this.field1143 = true;
                this.field1569 = "";
                this.field1428 = 5;
                this.field1585 = "Enter name of player to delete from list";
            }
            if (var4 >= 300 && var4 <= 313) {
                int var5 = (var4 - 300) / 2;
                int var6 = var4 & 1;
                int var7 = this.field1387[var5];
                if (var7 != -1) {
                    while (true) {
                        if (var6 == 0) {
                            --var7;
                            if (var7 < 0) {
                                var7 = IdkType.field1061 - 1;
                            }
                        }
                        if (var6 == 1) {
                            ++var7;
                            if (var7 >= IdkType.field1061) {
                                var7 = 0;
                            }
                        }
                        if (!IdkType.field1062[var7].field1068 && IdkType.field1062[var7].field1063 == var5 + (this.field1555 ? 0 : 7)) {
                            this.field1387[var5] = var7;
                            this.field1553 = true;
                            break;
                        }
                    }
                }
            }
            if (var4 >= 314 && var4 <= 323) {
                int var8 = (var4 - 314) / 2;
                int var9 = var4 & 1;
                int var10 = this.field1213[var8];
                if (var9 == 0) {
                    --var10;
                    if (var10 < 0) {
                        var10 = field1259[var8].length - 1;
                    }
                }
                if (var9 == 1) {
                    ++var10;
                    if (var10 >= field1259[var8].length) {
                        var10 = 0;
                    }
                }
                this.field1213[var8] = var10;
                this.field1553 = true;
            }
            if (var4 == 324 && !this.field1555) {
                this.field1555 = true;
                this.method477(771);
            }
            if (var4 == 325 && this.field1555) {
                this.field1555 = false;
                this.method477(771);
            }
            if (var4 != 326) {
                if (var4 == 613) {
                    this.field1222 = !this.field1222;
                }
                if (var4 >= 601 && var4 <= 612) {
                    this.method435((byte) 84);
                    if (this.field1362.length() > 0) {
                        this.field1240.method220((byte) 78, 144);
                        this.field1240.method227(JString.method300(this.field1362), false);
                        this.field1240.method221(var4 - 601);
                        this.field1240.method221(this.field1222 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1240.method220((byte) 78, 188);
                this.field1240.method221(this.field1555 ? 0 : 1);
                for (int var11 = 0; var11 < 7; ++var11) {
                    this.field1240.method221(this.field1387[var11]);
                }
                for (int var12 = 0; var12 < 5; ++var12) {
                    this.field1240.method221(this.field1213[var12]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method530(int arg0, int arg1) {
        LinkList var3 = this.field1544[this.field1340][arg0][arg1];
        if (var3 == null) {
            this.field1144.method83(this.field1340, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method250(); var6 != null; var6 = (ObjStackEntity) var3.method252(true)) {
                ObjType var11 = ObjType.method339(var6.field494);
                int var12 = var11.field1011;
                if (var11.field1010) {
                    var12 = (var6.field495 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method248(var5, -31692);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method250(); var9 != null; var9 = (ObjStackEntity) var3.method252(true)) {
                if (var5.field494 != var9.field494 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field494 != var9.field494 && var7.field494 != var9.field494 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1144.method69(var8, var10, var5, this.field1340, var7, this.method520(0, this.field1340, arg1 * 128 + 64, arg0 * 128 + 64), 4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLd;)I")
    public final int method531(int arg0, boolean arg1, Component arg2) {
        if (!arg1) {
            this.field1544 = null;
        }
        if (arg2.field81 != null && arg0 < arg2.field81.length) {
            try {
                int[] var4 = arg2.field81[arg0];
                int var5 = 0;
                int var6 = 0;
                while (true) {
                    int var7 = var4[var6++];
                    if (var7 == 0) {
                        return var5;
                    }
                    if (var7 == 1) {
                        var5 += this.field1359[var4[var6++]];
                    }
                    if (var7 == 2) {
                        var5 += this.field1188[var4[var6++]];
                    }
                    if (var7 == 3) {
                        var5 += this.field1217[var4[var6++]];
                    }
                    if (var7 == 4) {
                        Component var8 = Component.field67[var4[var6++]];
                        int var9 = var4[var6++] + 1;
                        for (int var10 = 0; var10 < var8.field68.length; ++var10) {
                            if (var8.field68[var10] == var9) {
                                var5 += var8.field69[var10];
                            }
                        }
                    }
                    if (var7 == 5) {
                        var5 += this.field1256[var4[var6++]];
                    }
                    if (var7 == 6) {
                        var5 += field1558[this.field1188[var4[var6++]] - 1];
                    }
                    if (var7 == 7) {
                        var5 += this.field1256[var4[var6++]] * 100 / 46875;
                    }
                    if (var7 == 8) {
                        var5 += field1310.field466;
                    }
                    if (var7 == 9) {
                        for (int var11 = 0; var11 < 19; ++var11) {
                            if (var11 == 18) {
                                var11 = 20;
                            }
                            var5 += this.field1188[var11];
                        }
                    }
                    if (var7 == 10) {
                        Component var12 = Component.field67[var4[var6++]];
                        int var13 = var4[var6++] + 1;
                        for (int var14 = 0; var14 < var12.field68.length; ++var14) {
                            if (var12.field68[var14] == var13) {
                                var5 += 999999999;
                                break;
                            }
                        }
                    }
                    if (var7 == 11) {
                        var5 += this.field1345;
                    }
                    if (var7 == 12) {
                        var5 += this.field1181;
                    }
                    if (var7 == 13) {
                        int var15 = this.field1256[var4[var6++]];
                        int var16 = var4[var6++];
                        var5 += (var15 & 1 << var16) != 0 ? 1 : 0;
                    }
                }
            } catch (Exception var17) {
                return -1;
            }
        } else {
            return -2;
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

    @OriginalMember(owner = "client", name = "t", descriptor = "(B)V")
    public final void method532(byte arg0) {
        this.field1346 = false;
        while (this.field1260) {
            this.field1346 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1382 = null;
        this.field1383 = null;
        this.field1557 = null;
        this.field1336 = null;
        if (arg0 == 56) {
            this.field1337 = null;
            this.field1338 = null;
            this.field1339 = null;
            this.field1388 = null;
            this.field1389 = null;
            this.field1500 = null;
            this.field1501 = null;
            this.field1269 = null;
            this.field1270 = null;
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method533(int arg0) {
        int var2 = this.field1532 * 128 + 64;
        int var3 = this.field1533 * 128 + 64;
        int var4 = this.method520(0, this.field1340, this.field1533, this.field1532) - this.field1534;
        if (this.field1194 < var2) {
            this.field1194 += (var2 - this.field1194) * this.field1536 / 1000 + this.field1535;
            if (this.field1194 > var2) {
                this.field1194 = var2;
            }
        }
        if (this.field1194 > var2) {
            this.field1194 -= (this.field1194 - var2) * this.field1536 / 1000 + this.field1535;
            if (this.field1194 < var2) {
                this.field1194 = var2;
            }
        }
        if (this.field1195 < var4) {
            this.field1195 += (var4 - this.field1195) * this.field1536 / 1000 + this.field1535;
            if (this.field1195 > var4) {
                this.field1195 = var4;
            }
        }
        if (this.field1195 > var4) {
            this.field1195 -= (this.field1195 - var4) * this.field1536 / 1000 + this.field1535;
            if (this.field1195 < var4) {
                this.field1195 = var4;
            }
        }
        if (this.field1196 < var3) {
            this.field1196 += (var3 - this.field1196) * this.field1536 / 1000 + this.field1535;
            if (this.field1196 > var3) {
                this.field1196 = var3;
            }
        }
        if (this.field1196 > var3) {
            this.field1196 -= (this.field1196 - var3) * this.field1536 / 1000 + this.field1535;
            if (this.field1196 < var3) {
                this.field1196 = var3;
            }
        }
        int var5 = this.field1491 * 128 + 64;
        int var6 = this.field1492 * 128 + 64;
        if (arg0 == 0) {
            int var7 = this.method520(0, this.field1340, this.field1492, this.field1491) - this.field1493;
            int var8 = var5 - this.field1194;
            int var9 = var7 - this.field1195;
            int var10 = var6 - this.field1196;
            int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
            int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
            int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
            if (var12 < 128) {
                var12 = 128;
            }
            if (var12 > 383) {
                var12 = 383;
            }
            if (this.field1197 < var12) {
                this.field1197 += (var12 - this.field1197) * this.field1495 / 1000 + this.field1494;
                if (this.field1197 > var12) {
                    this.field1197 = var12;
                }
            }
            if (this.field1197 > var12) {
                this.field1197 -= (this.field1197 - var12) * this.field1495 / 1000 + this.field1494;
                if (this.field1197 < var12) {
                    this.field1197 = var12;
                }
            }
            int var14 = var13 - this.field1198;
            if (var14 > 1024) {
                var14 -= 2048;
            }
            if (var14 < -1024) {
                var14 += 2048;
            }
            if (var14 > 0) {
                this.field1198 += this.field1495 * var14 / 1000 + this.field1494;
                this.field1198 &= 2047;
            }
            if (var14 < 0) {
                this.field1198 -= -var14 * this.field1495 / 1000 + this.field1494;
                this.field1198 &= 2047;
            }
            int var15 = var13 - this.field1198;
            if (var15 > 1024) {
                var15 -= 2048;
            }
            if (var15 < -1024) {
                var15 += 2048;
            }
            if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
                this.field1198 = var13;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZI)I")
    public final int method534(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.field1430 = -66;
        }
        int var5 = 256 - arg1;
        return ((arg0 & 16711935) * var5 + (arg3 & 16711935) * arg1 & -16711936) + ((arg0 & 65280) * var5 + (arg3 & 65280) * arg1 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILfc;I)V")
    public final void method535(int arg0, int arg1, int arg2, NpcType arg3, int arg4) {
        if (arg2 != 2) {
            field1508 = 106;
        }
        if (this.field1478 < 400) {
            String var6 = arg3.field963;
            if (arg3.field981 != 0) {
                var6 = var6 + method478(886, field1310.field466, arg3.field981) + " (level-" + arg3.field981 + ")";
            }
            if (this.field1453 == 1) {
                this.field1238[this.field1478] = "Use " + this.field1457 + " with @yel@" + var6;
                this.field1519[this.field1478] = 900;
                this.field1520[this.field1478] = arg1;
                this.field1517[this.field1478] = arg4;
                this.field1518[this.field1478] = arg0;
                ++this.field1478;
            } else {
                if (this.field1485 == 1) {
                    if ((this.field1487 & 2) == 2) {
                        this.field1238[this.field1478] = this.field1488 + " @yel@" + var6;
                        this.field1519[this.field1478] = 265;
                        this.field1520[this.field1478] = arg1;
                        this.field1517[this.field1478] = arg4;
                        this.field1518[this.field1478] = arg0;
                        ++this.field1478;
                        return;
                    }
                } else {
                    if (arg3.field976 != null) {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (arg3.field976[var7] != null && !arg3.field976[var7].equalsIgnoreCase("attack")) {
                                this.field1238[this.field1478] = arg3.field976[var7] + " @yel@" + var6;
                                if (var7 == 0) {
                                    this.field1519[this.field1478] = 728;
                                }
                                if (var7 == 1) {
                                    this.field1519[this.field1478] = 542;
                                }
                                if (var7 == 2) {
                                    this.field1519[this.field1478] = 6;
                                }
                                if (var7 == 3) {
                                    this.field1519[this.field1478] = 963;
                                }
                                if (var7 == 4) {
                                    this.field1519[this.field1478] = 245;
                                }
                                this.field1520[this.field1478] = arg1;
                                this.field1517[this.field1478] = arg4;
                                this.field1518[this.field1478] = arg0;
                                ++this.field1478;
                            }
                        }
                    }
                    if (arg3.field976 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (arg3.field976[var8] != null && arg3.field976[var8].equalsIgnoreCase("attack")) {
                                short var9 = 0;
                                if (arg3.field981 > field1310.field466) {
                                    var9 = 2000;
                                }
                                this.field1238[this.field1478] = arg3.field976[var8] + " @yel@" + var6;
                                if (var8 == 0) {
                                    this.field1519[this.field1478] = var9 + 728;
                                }
                                if (var8 == 1) {
                                    this.field1519[this.field1478] = var9 + 542;
                                }
                                if (var8 == 2) {
                                    this.field1519[this.field1478] = var9 + 6;
                                }
                                if (var8 == 3) {
                                    this.field1519[this.field1478] = var9 + 963;
                                }
                                if (var8 == 4) {
                                    this.field1519[this.field1478] = var9 + 245;
                                }
                                this.field1520[this.field1478] = arg1;
                                this.field1517[this.field1478] = arg4;
                                this.field1518[this.field1478] = arg0;
                                ++this.field1478;
                            }
                        }
                    }
                    this.field1238[this.field1478] = "Examine @yel@" + var6;
                    this.field1519[this.field1478] = 1607;
                    this.field1520[this.field1478] = arg1;
                    this.field1517[this.field1478] = arg4;
                    this.field1518[this.field1478] = arg0;
                    ++this.field1478;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method536(int arg0) {
        if (this.field1291 == 0) {
            this.field1238[0] = "Cancel";
            int var2 = 77 / arg0;
            this.field1519[0] = 1252;
            this.field1478 = 1;
            this.method420(super.field25, super.field24, true);
            this.field1167 = 0;
            if (super.field24 > 8 && super.field25 > 11 && super.field24 < 520 && super.field25 < 345) {
                if (this.field1281 != -1) {
                    this.method431(super.field24, 0, Component.field67[this.field1281], 11721, 8, 11, super.field25);
                } else {
                    this.method545(0);
                }
            }
            if (this.field1384 != this.field1167) {
                this.field1384 = this.field1167;
            }
            this.field1167 = 0;
            if (super.field24 > 562 && super.field25 > 231 && super.field24 < 752 && super.field25 < 492) {
                if (this.field1203 != -1) {
                    this.method431(super.field24, 0, Component.field67[this.field1203], 11721, 562, 231, super.field25);
                } else if (this.field1354[this.field1353] != -1) {
                    this.method431(super.field24, 0, Component.field67[this.field1354[this.field1353]], 11721, 562, 231, super.field25);
                }
            }
            if (this.field1179 != this.field1167) {
                this.field1258 = true;
                this.field1179 = this.field1167;
            }
            this.field1167 = 0;
            if (super.field24 > 22 && super.field25 > 375 && super.field24 < 431 && super.field25 < 471) {
                if (this.field1408 != -1) {
                    this.method431(super.field24, 0, Component.field67[this.field1408], 11721, 22, 375, super.field25);
                } else {
                    this.method466(super.field24 - 22, super.field25 - 375, (byte) -7);
                }
            }
            if (this.field1408 != -1 && this.field1248 != this.field1167) {
                this.field1463 = true;
                this.field1248 = this.field1167;
            }
            boolean var3 = false;
            while (!var3) {
                var3 = true;
                for (int var4 = 0; var4 < this.field1478 - 1; ++var4) {
                    if (this.field1519[var4] < 1000 && this.field1519[var4 + 1] > 1000) {
                        String var5 = this.field1238[var4];
                        this.field1238[var4] = this.field1238[var4 + 1];
                        this.field1238[var4 + 1] = var5;
                        int var6 = this.field1519[var4];
                        this.field1519[var4] = this.field1519[var4 + 1];
                        this.field1519[var4 + 1] = var6;
                        int var7 = this.field1517[var4];
                        this.field1517[var4] = this.field1517[var4 + 1];
                        this.field1517[var4 + 1] = var7;
                        int var8 = this.field1518[var4];
                        this.field1518[var4] = this.field1518[var4 + 1];
                        this.field1518[var4 + 1] = var8;
                        int var9 = this.field1520[var4];
                        this.field1520[var4] = this.field1520[var4 + 1];
                        this.field1520[var4 + 1] = var9;
                        var3 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method537(int arg0) {
        for (int var2 = 0; var2 < this.field1376; ++var2) {
            if (this.field1369[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field1372[var2] == this.field1370 && this.field1307[var2] == this.field1271) {
                        if (!this.method468(this.field1522)) {
                            var3 = true;
                        }
                    } else {
                        Packet var4 = Wave.method313(this.field1307[var2], this.field1372[var2], 3);
                        if (System.currentTimeMillis() + (long) (var4.field698 / 22) > (long) (this.field1347 / 22) + this.field1556) {
                            this.field1347 = var4.field698;
                            this.field1556 = System.currentTimeMillis();
                            if (this.method419(true, var4.field698, var4.field697)) {
                                this.field1370 = this.field1372[var2];
                                this.field1271 = this.field1307[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var8) {
                }
                if (var3 && this.field1369[var2] != -5) {
                    this.field1369[var2] = -5;
                } else {
                    --this.field1376;
                    for (int var6 = var2; var6 < this.field1376; ++var6) {
                        this.field1372[var6] = this.field1372[var6 + 1];
                        this.field1307[var6] = this.field1307[var6 + 1];
                        this.field1369[var6] = this.field1369[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field1369[var2]--;
            }
        }
        int var7 = 49 / arg0;
        if (this.field1357 > 0) {
            this.field1357 -= 20;
            if (this.field1357 < 0) {
                this.field1357 = 0;
            }
            if (this.field1357 == 0 && this.field1201 && !field1233) {
                this.field1226 = this.field1191;
                this.field1227 = false;
                this.field1410.method279(2, this.field1226);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(B)V")
    public final void method538(byte arg0) {
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            this.field1409 = 494;
        }
        for (ProjectileEntity var3 = (ProjectileEntity) this.field1390.method250(); var3 != null; var3 = (ProjectileEntity) this.field1390.method252(true)) {
            if (this.field1340 == var3.field498 && field1433 <= var3.field504) {
                if (field1433 >= var3.field503) {
                    if (var3.field507 > 0) {
                        NpcEntity var4 = this.field1403[var3.field507 - 1];
                        if (var4 != null) {
                            var3.method129(this.method520(0, var3.field498, var4.field403, var4.field402) - var3.field502, (byte) 3, var4.field403, field1433, var4.field402);
                        }
                    }
                    if (var3.field507 < 0) {
                        int var5 = -var3.field507 - 1;
                        PlayerEntity var6;
                        if (this.field1190 == var5) {
                            var6 = field1310;
                        } else {
                            var6 = this.field1472[var5];
                        }
                        if (var6 != null) {
                            var3.method129(this.method520(0, var3.field498, var6.field403, var6.field402) - var3.field502, (byte) 3, var6.field403, field1433, var6.field402);
                        }
                    }
                    var3.method130(true, this.field1325);
                    this.field1144.method73(false, -1, (int) var3.field511, 60, this.field1340, var3.field517, var3, (int) var3.field509, (byte) 9, (int) var3.field510);
                }
            } else {
                var3.method118();
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lmb;II)V")
    private final void method539(Packet arg0, int arg1, int arg2) {
        if (arg2 >= 0) {
            this.method6();
        }
        this.field1311 = 0;
        this.field1475 = 0;
        this.method511(arg1, -48698, arg0);
        this.method453(false, arg1, arg0);
        this.method543(arg1, arg0, false);
        for (int var4 = 0; var4 < this.field1311; ++var4) {
            int var6 = this.field1312[var4];
            if (field1433 != this.field1403[var6].field446) {
                this.field1403[var6].field456 = null;
                this.field1403[var6] = null;
            }
        }
        if (arg0.field698 != arg1) {
            signlink.reporterror(this.field1541 + " size mismatch in getnpcpos - pos:" + arg0.field698 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1404; ++var5) {
                if (this.field1403[this.field1405[var5]] == null) {
                    signlink.reporterror(this.field1541 + " null entry in npc list - pos:" + var5 + " size:" + this.field1404);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILbb;I)V")
    public final void method540(int arg0, int arg1, int arg2, PlayerEntity arg3, int arg4) {
        int var6 = 54 / arg4;
        if (field1310 != arg3) {
            if (this.field1478 < 400) {
                String var7 = arg3.field460 + method478(886, field1310.field466, arg3.field466) + " (level-" + arg3.field466 + ")";
                if (this.field1453 == 1) {
                    this.field1238[this.field1478] = "Use " + this.field1457 + " with @whi@" + var7;
                    this.field1519[this.field1478] = 367;
                    this.field1520[this.field1478] = arg2;
                    this.field1517[this.field1478] = arg0;
                    this.field1518[this.field1478] = arg1;
                    ++this.field1478;
                } else if (this.field1485 == 1) {
                    if ((this.field1487 & 8) == 8) {
                        this.field1238[this.field1478] = this.field1488 + " @whi@" + var7;
                        this.field1519[this.field1478] = 651;
                        this.field1520[this.field1478] = arg2;
                        this.field1517[this.field1478] = arg0;
                        this.field1518[this.field1478] = arg1;
                        ++this.field1478;
                    }
                } else {
                    this.field1238[this.field1478] = "Follow @whi@" + var7;
                    this.field1519[this.field1478] = 1544;
                    this.field1520[this.field1478] = arg2;
                    this.field1517[this.field1478] = arg0;
                    this.field1518[this.field1478] = arg1;
                    ++this.field1478;
                    if (this.field1469 == 0) {
                        this.field1238[this.field1478] = "Trade with @whi@" + var7;
                        this.field1519[this.field1478] = 1373;
                        this.field1520[this.field1478] = arg2;
                        this.field1517[this.field1478] = arg0;
                        this.field1518[this.field1478] = arg1;
                        ++this.field1478;
                    }
                    if (this.field1490 > 0) {
                        this.field1238[this.field1478] = "Attack @whi@" + var7;
                        if (field1310.field466 >= arg3.field466) {
                            this.field1519[this.field1478] = 151;
                        } else {
                            this.field1519[this.field1478] = 2151;
                        }
                        this.field1520[this.field1478] = arg2;
                        this.field1517[this.field1478] = arg0;
                        this.field1518[this.field1478] = arg1;
                        ++this.field1478;
                    }
                    if (this.field1443 == 1) {
                        this.field1238[this.field1478] = "Fight @whi@" + var7;
                        this.field1519[this.field1478] = 151;
                        this.field1520[this.field1478] = arg2;
                        this.field1517[this.field1478] = arg0;
                        this.field1518[this.field1478] = arg1;
                        ++this.field1478;
                    }
                    if (this.field1443 == 2) {
                        this.field1238[this.field1478] = "Duel-with @whi@" + var7;
                        this.field1519[this.field1478] = 1101;
                        this.field1520[this.field1478] = arg2;
                        this.field1517[this.field1478] = arg0;
                        this.field1518[this.field1478] = arg1;
                        ++this.field1478;
                    }
                }
                for (int var8 = 0; var8 < this.field1478; ++var8) {
                    if (this.field1519[var8] == 660) {
                        this.field1238[var8] = "Walk here @whi@" + var7;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method541(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method542(int arg0) {
        if (this.field1550 > 0) {
            this.method459((byte) 5);
        } else {
            this.field1322.method260((byte) 1);
            this.field1425.method206(this.field1539, "Connection lost", 257, 144, 0);
            this.field1425.method206(this.field1539, "Connection lost", 256, 143, 16777215);
            this.field1425.method206(this.field1539, "Please wait - attempting to reestablish", 257, 159, 0);
            this.field1425.method206(this.field1539, "Please wait - attempting to reestablish", 256, 158, 16777215);
            this.field1322.method261(3, 8, super.field17, 11);
            this.field1342 = 0;
            ClientStream var2 = this.field1554;
            this.field1577 = false;
            this.method418(this.field1541, this.field1542, true);
            if (arg0 < 5 || arg0 > 5) {
                this.field1544 = null;
            }
            if (!this.field1577) {
                this.method459((byte) 5);
            }
            try {
                var2.method37();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;Z)V")
    private final void method543(int arg0, Packet arg1, boolean arg2) {
        if (arg2) {
            this.field1544 = null;
        }
        for (int var4 = 0; var4 < this.field1475; ++var4) {
            int var5 = this.field1476[var4];
            NpcEntity var6 = this.field1403[var5];
            int var7 = arg1.method231();
            if ((var7 & 2) == 2) {
                int var8 = arg1.method233();
                if (var8 == 65535) {
                    var8 = -1;
                }
                if (var6.field429 == var8) {
                    var6.field433 = 0;
                }
                int var9 = arg1.method231();
                if (var8 == -1 || var6.field429 == -1 || SeqType.field1081[var8].field1089 > SeqType.field1081[var6.field429].field1089 || SeqType.field1081[var6.field429].field1089 == 0) {
                    var6.field429 = var8;
                    var6.field430 = 0;
                    var6.field431 = 0;
                    var6.field432 = var9;
                    var6.field433 = 0;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field423 = arg1.method233();
                if (var6.field423 == 65535) {
                    var6.field423 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field414 = arg1.method238();
                var6.field415 = 100;
            }
            if ((var7 & 16) == 16) {
                var6.field418 = arg1.method231();
                var6.field419 = arg1.method231();
                var6.field420 = field1433 + 400;
                var6.field421 = arg1.method231();
                var6.field422 = arg1.method231();
            }
            if ((var7 & 32) == 32) {
                var6.field456 = NpcType.method333(arg1.method233());
                var6.field409 = var6.field456.field969;
                var6.field410 = var6.field456.field970;
                var6.field411 = var6.field456.field971;
                var6.field412 = var6.field456.field972;
                var6.field407 = var6.field456.field968;
            }
            if ((var7 & 64) == 64) {
                var6.field434 = arg1.method233();
                int var10 = arg1.method236();
                var6.field438 = var10 >> 16;
                var6.field437 = (var10 & 65535) + field1433;
                var6.field435 = 0;
                var6.field436 = 0;
                if (var6.field437 > field1433) {
                    var6.field435 = -1;
                }
                if (var6.field434 == 65535) {
                    var6.field434 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field424 = arg1.method233();
                var6.field425 = arg1.method233();
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method544(boolean arg0) {
        if (!arg0) {
            this.field1544 = null;
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method10(byte arg0) {
        this.field1380 = true;
        if (this.field1173 != arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method545(int arg0) {
        if (this.field1453 == 0 && this.field1485 == 0) {
            this.field1238[this.field1478] = "Walk here";
            this.field1519[this.field1478] = 660;
            this.field1517[this.field1478] = super.field24;
            this.field1518[this.field1478] = super.field25;
            ++this.field1478;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < Model.field595; ++var3) {
            int var4 = Model.field596[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1144.method92(this.field1340, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method324(var8);
                    if (this.field1453 == 1) {
                        this.field1238[this.field1478] = "Use " + this.field1457 + " with @cya@" + var9.field923;
                        this.field1519[this.field1478] = 450;
                        this.field1520[this.field1478] = var4;
                        this.field1517[this.field1478] = var5;
                        this.field1518[this.field1478] = var6;
                        ++this.field1478;
                    } else if (this.field1485 == 1) {
                        if ((this.field1487 & 4) == 4) {
                            this.field1238[this.field1478] = this.field1488 + " @cya@" + var9.field923;
                            this.field1519[this.field1478] = 55;
                            this.field1520[this.field1478] = var4;
                            this.field1517[this.field1478] = var5;
                            this.field1518[this.field1478] = var6;
                            ++this.field1478;
                        }
                    } else {
                        if (var9.field939 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field939[var10] != null) {
                                    this.field1238[this.field1478] = var9.field939[var10] + " @cya@" + var9.field923;
                                    if (var10 == 0) {
                                        this.field1519[this.field1478] = 285;
                                    }
                                    if (var10 == 1) {
                                        this.field1519[this.field1478] = 504;
                                    }
                                    if (var10 == 2) {
                                        this.field1519[this.field1478] = 364;
                                    }
                                    if (var10 == 3) {
                                        this.field1519[this.field1478] = 581;
                                    }
                                    if (var10 == 4) {
                                        this.field1519[this.field1478] = 1501;
                                    }
                                    this.field1520[this.field1478] = var4;
                                    this.field1517[this.field1478] = var5;
                                    this.field1518[this.field1478] = var6;
                                    ++this.field1478;
                                }
                            }
                        }
                        this.field1238[this.field1478] = "Examine @cya@" + var9.field923;
                        this.field1519[this.field1478] = 1175;
                        this.field1520[this.field1478] = var4;
                        this.field1517[this.field1478] = var5;
                        this.field1518[this.field1478] = var6;
                        ++this.field1478;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1403[var8];
                    if (var11.field456.field965 == 1 && (var11.field402 & 127) == 64 && (var11.field403 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1404; ++var12) {
                            NpcEntity var13 = this.field1403[this.field1405[var12]];
                            if (var13 != null && var11 != var13 && var13.field456.field965 == 1 && var11.field402 == var13.field402 && var11.field403 == var13.field403) {
                                this.method535(var6, this.field1405[var12], 2, var13.field456, var5);
                            }
                        }
                    }
                    this.method535(var6, var8, 2, var11.field456, var5);
                }
                if (var7 == 0) {
                    PlayerEntity var14 = this.field1472[var8];
                    if ((var14.field402 & 127) == 64 && (var14.field403 & 127) == 64) {
                        for (int var15 = 0; var15 < this.field1404; ++var15) {
                            NpcEntity var18 = this.field1403[this.field1405[var15]];
                            if (var18 != null && var18.field456.field965 == 1 && var14.field402 == var18.field402 && var14.field403 == var18.field403) {
                                this.method535(var6, this.field1405[var15], 2, var18.field456, var5);
                            }
                        }
                        for (int var16 = 0; var16 < this.field1473; ++var16) {
                            PlayerEntity var17 = this.field1472[this.field1474[var16]];
                            if (var17 != null && var14 != var17 && var14.field402 == var17.field402 && var14.field403 == var17.field403) {
                                this.method540(var5, var6, this.field1474[var16], var17, 624);
                            }
                        }
                    }
                    this.method540(var5, var6, var8, var14, 624);
                }
                if (var7 == 3) {
                    LinkList var19 = this.field1544[this.field1340][var5][var6];
                    if (var19 != null) {
                        for (ObjStackEntity var20 = (ObjStackEntity) var19.method251((byte) 127); var20 != null; var20 = (ObjStackEntity) var19.method253((byte) 15)) {
                            ObjType var21 = ObjType.method339(var20.field494);
                            if (this.field1453 == 1) {
                                this.field1238[this.field1478] = "Use " + this.field1457 + " with @lre@" + var21.field998;
                                this.field1519[this.field1478] = 217;
                                this.field1520[this.field1478] = var20.field494;
                                this.field1517[this.field1478] = var5;
                                this.field1518[this.field1478] = var6;
                                ++this.field1478;
                            } else if (this.field1485 == 1) {
                                if ((this.field1487 & 1) == 1) {
                                    this.field1238[this.field1478] = this.field1488 + " @lre@" + var21.field998;
                                    this.field1519[this.field1478] = 965;
                                    this.field1520[this.field1478] = var20.field494;
                                    this.field1517[this.field1478] = var5;
                                    this.field1518[this.field1478] = var6;
                                    ++this.field1478;
                                }
                            } else {
                                for (int var22 = 4; var22 >= 0; --var22) {
                                    if (var21.field1013 != null && var21.field1013[var22] != null) {
                                        this.field1238[this.field1478] = var21.field1013[var22] + " @lre@" + var21.field998;
                                        if (var22 == 0) {
                                            this.field1519[this.field1478] = 224;
                                        }
                                        if (var22 == 1) {
                                            this.field1519[this.field1478] = 993;
                                        }
                                        if (var22 == 2) {
                                            this.field1519[this.field1478] = 99;
                                        }
                                        if (var22 == 3) {
                                            this.field1519[this.field1478] = 746;
                                        }
                                        if (var22 == 4) {
                                            this.field1519[this.field1478] = 877;
                                        }
                                        this.field1520[this.field1478] = var20.field494;
                                        this.field1517[this.field1478] = var5;
                                        this.field1518[this.field1478] = var6;
                                        ++this.field1478;
                                    } else if (var22 == 2) {
                                        this.field1238[this.field1478] = "Take @lre@" + var21.field998;
                                        this.field1519[this.field1478] = 99;
                                        this.field1520[this.field1478] = var20.field494;
                                        this.field1517[this.field1478] = var5;
                                        this.field1518[this.field1478] = var6;
                                        ++this.field1478;
                                    }
                                }
                                this.field1238[this.field1478] = "Examine @lre@" + var21.field998;
                                this.field1519[this.field1478] = 1102;
                                this.field1520[this.field1478] = var20.field494;
                                this.field1517[this.field1478] = var5;
                                this.field1518[this.field1478] = var6;
                                ++this.field1478;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 0) {
            this.field1240.method221(90);
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method546(boolean arg0) {
        this.field1321.method260((byte) 1);
        int var2 = this.field1572 + this.field1446 & 2047;
        int var3 = field1310.field402 / 32 + 48;
        int var4 = 464 - field1310.field403 / 32;
        this.field1344.method196(var4, var3, 146, 151, true, 9, this.field1439, 21, this.field1175, var2, this.field1440 + 256);
        this.field1515.method196(25, 25, 33, 33, true, 0, this.field1199, 0, this.field1489, this.field1572, 256);
        for (int var5 = 0; var5 < this.field1169; ++var5) {
            int var25 = this.field1170[var5] * 4 + 2 - field1310.field402 / 32;
            int var26 = this.field1171[var5] * 4 + 2 - field1310.field403 / 32;
            this.method522(404, this.field1579[var5], var25, var26);
        }
        for (int var6 = 0; var6 < 104; ++var6) {
            for (int var21 = 0; var21 < 104; ++var21) {
                LinkList var22 = this.field1544[this.field1340][var6][var21];
                if (var22 != null) {
                    int var23 = var6 * 4 + 2 - field1310.field402 / 32;
                    int var24 = var21 * 4 + 2 - field1310.field403 / 32;
                    this.method522(404, this.field1411, var23, var24);
                }
            }
        }
        if (!arg0) {
            for (int var7 = 0; var7 < this.field1404; ++var7) {
                NpcEntity var18 = this.field1403[this.field1405[var7]];
                if (var18 != null && var18.method124(-27441) && var18.field456.field980) {
                    int var19 = var18.field402 / 32 - field1310.field402 / 32;
                    int var20 = var18.field403 / 32 - field1310.field403 / 32;
                    this.method522(404, this.field1412, var19, var20);
                }
            }
            for (int var8 = 0; var8 < this.field1473; ++var8) {
                PlayerEntity var11 = this.field1472[this.field1474[var8]];
                if (var11 != null && var11.method124(-27441)) {
                    int var12 = var11.field402 / 32 - field1310.field402 / 32;
                    int var13 = var11.field403 / 32 - field1310.field403 / 32;
                    boolean var14 = false;
                    long var15 = JString.method300(var11.field460);
                    for (int var17 = 0; var17 < this.field1365; ++var17) {
                        if (this.field1255[var17] == var15 && this.field1512[var17] != 0) {
                            var14 = true;
                            break;
                        }
                    }
                    if (var14) {
                        this.method522(404, this.field1414, var12, var13);
                    } else {
                        this.method522(404, this.field1413, var12, var13);
                    }
                }
            }
            if (this.field1342 != 0) {
                int var9 = this.field1342 * 4 + 2 - field1310.field402 / 32;
                int var10 = this.field1343 * 4 + 2 - field1310.field403 / 32;
                this.method522(404, this.field1168, var9, var10);
            }
            Pix2D.method165(3, 660, 82, 3, 93, 16777215);
            this.field1322.method260((byte) 1);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Lmb;II)V")
    public final void method547(Packet arg0, int arg1, int arg2) {
        if (arg2 != 37157) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg1 != 112 && arg1 != 31) {
            if (arg1 == 230) {
                int var5 = arg0.method231();
                int var6 = (var5 >> 4 & 7) + this.field1318;
                int var7 = (var5 & 7) + this.field1319;
                int var8 = arg0.method231();
                int var9 = var8 >> 2;
                int var10 = var8 & 3;
                int var11 = this.field1273[var9];
                int var12 = arg0.method233();
                if (var6 >= 0 && var7 >= 0 && var6 < 103 && var7 < 103) {
                    int var13 = this.field1241[this.field1340][var6][var7];
                    int var14 = this.field1241[this.field1340][var6 + 1][var7];
                    int var15 = this.field1241[this.field1340][var6 + 1][var7 + 1];
                    int var16 = this.field1241[this.field1340][var6][var7 + 1];
                    if (var11 == 0) {
                        Wall var17 = this.field1144.method84(var7, var6, -808, this.field1340);
                        if (var17 != null) {
                            int var18 = var17.field278 >> 14 & 32767;
                            if (var9 == 2) {
                                var17.field276 = new LocEntity(2, var18, var15, var12, var10 + 4, 0, false, var14, var16, var13);
                                var17.field277 = new LocEntity(2, var18, var15, var12, var10 + 1 & 3, 0, false, var14, var16, var13);
                            } else {
                                var17.field276 = new LocEntity(var9, var18, var15, var12, var10, 0, false, var14, var16, var13);
                            }
                        }
                    }
                    if (var11 == 1) {
                        Decor var19 = this.field1144.method85(0, this.field1340, var6, var7);
                        if (var19 != null) {
                            var19.field169 = new LocEntity(4, var19.field170 >> 14 & 32767, var15, var12, 0, 0, false, var14, var16, var13);
                        }
                    }
                    if (var11 == 2) {
                        Location var20 = this.field1144.method86(var6, var7, this.field1340, (byte) 56);
                        if (var9 == 11) {
                            var9 = 10;
                        }
                        if (var20 != null) {
                            var20.field261 = new LocEntity(var9, var20.field269 >> 14 & 32767, var15, var12, var10, 0, false, var14, var16, var13);
                        }
                    }
                    if (var11 == 3) {
                        GroundDecor var21 = this.field1144.method87(0, var7, var6, this.field1340);
                        if (var21 != null) {
                            var21.field200 = new LocEntity(22, var21.field201 >> 14 & 32767, var15, var12, var10, 0, false, var14, var16, var13);
                        }
                    }
                }
            } else if (arg1 == 167) {
                int var22 = arg0.method231();
                int var23 = (var22 >> 4 & 7) + this.field1318;
                int var24 = (var22 & 7) + this.field1319;
                int var25 = arg0.method233();
                int var26 = arg0.method233();
                if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                    ObjStackEntity var27 = new ObjStackEntity();
                    var27.field494 = var25;
                    var27.field495 = var26;
                    if (this.field1544[this.field1340][var23][var24] == null) {
                        this.field1544[this.field1340][var23][var24] = new LinkList((byte) 115);
                    }
                    this.field1544[this.field1340][var23][var24].method247(var27);
                    this.method530(var23, var24);
                }
            } else if (arg1 == 247) {
                int var28 = arg0.method231();
                int var29 = (var28 >> 4 & 7) + this.field1318;
                int var30 = (var28 & 7) + this.field1319;
                int var31 = arg0.method233();
                if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                    LinkList var32 = this.field1544[this.field1340][var29][var30];
                    if (var32 != null) {
                        for (ObjStackEntity var33 = (ObjStackEntity) var32.method250(); var33 != null; var33 = (ObjStackEntity) var32.method252(true)) {
                            if ((var31 & 32767) == var33.field494) {
                                var33.method118();
                                break;
                            }
                        }
                        if (var32.method250() == null) {
                            this.field1544[this.field1340][var29][var30] = null;
                        }
                        this.method530(var29, var30);
                    }
                }
            } else if (arg1 == 67) {
                int var34 = arg0.method231();
                int var35 = (var34 >> 4 & 7) + this.field1318;
                int var36 = (var34 & 7) + this.field1319;
                int var37 = var35 + arg0.method232();
                int var38 = var36 + arg0.method232();
                int var39 = arg0.method234();
                int var40 = arg0.method233();
                int var41 = arg0.method231();
                int var42 = arg0.method231();
                int var43 = arg0.method233();
                int var44 = arg0.method233();
                int var45 = arg0.method231();
                int var46 = arg0.method231();
                if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104 && var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                    int var47 = var35 * 128 + 64;
                    int var48 = var36 * 128 + 64;
                    int var49 = var37 * 128 + 64;
                    int var50 = var38 * 128 + 64;
                    ProjectileEntity var51 = new ProjectileEntity(field1433 + var44, var42, var47, var40, var46, this.method520(0, this.field1340, var48, var47) - var41, var48, field1433 + var43, var45, this.field1340, var39, 0);
                    var51.method129(this.method520(0, this.field1340, var50, var49) - var42, (byte) 3, var50, field1433 + var43, var49);
                    this.field1390.method247(var51);
                }
            } else if (arg1 == 215) {
                int var52 = arg0.method231();
                int var53 = (var52 >> 4 & 7) + this.field1318;
                int var54 = (var52 & 7) + this.field1319;
                int var55 = arg0.method233();
                int var56 = arg0.method231();
                int var57 = arg0.method233();
                if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                    int var58 = var53 * 128 + 64;
                    int var59 = var54 * 128 + 64;
                    SpotAnimEntity var60 = new SpotAnimEntity(var59, var58, var55, field1433, var57, this.method520(0, this.field1340, var59, var58) - var56, this.field1340, true);
                    this.field1584.method247(var60);
                }
            } else if (arg1 == 131) {
                int var61 = arg0.method231();
                int var62 = (var61 >> 4 & 7) + this.field1318;
                int var63 = (var61 & 7) + this.field1319;
                int var64 = arg0.method233();
                int var65 = arg0.method233();
                int var66 = arg0.method233();
                if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && this.field1190 != var66) {
                    ObjStackEntity var67 = new ObjStackEntity();
                    var67.field494 = var64;
                    var67.field495 = var65;
                    if (this.field1544[this.field1340][var62][var63] == null) {
                        this.field1544[this.field1340][var62][var63] = new LinkList((byte) 115);
                    }
                    this.field1544[this.field1340][var62][var63].method247(var67);
                    this.method530(var62, var63);
                }
            } else {
                if (arg1 == 248) {
                    int var68 = arg0.method231();
                    int var69 = (var68 >> 4 & 7) + this.field1318;
                    int var70 = (var68 & 7) + this.field1319;
                    int var71 = arg0.method231();
                    int var72 = var71 >> 2;
                    int var73 = var71 & 3;
                    int var74 = this.field1273[var72];
                    int var75 = arg0.method233();
                    int var76 = arg0.method233();
                    int var77 = arg0.method233();
                    int var78 = arg0.method233();
                    byte var79 = arg0.method232();
                    byte var80 = arg0.method232();
                    byte var81 = arg0.method232();
                    byte var82 = arg0.method232();
                    PlayerEntity var83;
                    if (this.field1190 == var78) {
                        var83 = field1310;
                    } else {
                        var83 = this.field1472[var78];
                    }
                    if (var83 != null) {
                        LocType var84 = LocType.method324(var75);
                        int var85 = this.field1241[this.field1340][var69][var70];
                        int var86 = this.field1241[this.field1340][var69 + 1][var70];
                        int var87 = this.field1241[this.field1340][var69 + 1][var70 + 1];
                        int var88 = this.field1241[this.field1340][var69][var70 + 1];
                        Model var89 = var84.method330(var72, var73, var85, var86, var87, var88, -1);
                        if (var89 != null) {
                            this.method465(0, 0, var77 + 1, var76 + 1, var74, -1, var70, true, this.field1340, var69);
                            var83.field469 = field1433 + var76;
                            var83.field470 = field1433 + var77;
                            var83.field474 = var89;
                            int var90 = var84.field927;
                            int var91 = var84.field928;
                            if (var73 == 1 || var73 == 3) {
                                var90 = var84.field928;
                                var91 = var84.field927;
                            }
                            var83.field471 = var69 * 128 + var90 * 64;
                            var83.field473 = var70 * 128 + var91 * 64;
                            var83.field472 = this.method520(0, this.field1340, var83.field473, var83.field471);
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
                            var83.field475 = var69 + var79;
                            var83.field477 = var69 + var81;
                            var83.field476 = var70 + var80;
                            var83.field478 = var70 + var82;
                        }
                    }
                }
                if (arg1 == 246) {
                    int var94 = arg0.method231();
                    int var95 = (var94 >> 4 & 7) + this.field1318;
                    int var96 = (var94 & 7) + this.field1319;
                    int var97 = arg0.method233();
                    int var98 = arg0.method233();
                    int var99 = arg0.method233();
                    if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                        LinkList var100 = this.field1544[this.field1340][var95][var96];
                        if (var100 != null) {
                            for (ObjStackEntity var101 = (ObjStackEntity) var100.method250(); var101 != null; var101 = (ObjStackEntity) var100.method252(true)) {
                                if ((var97 & 32767) == var101.field494 && var101.field495 == var98) {
                                    var101.field495 = var99;
                                    break;
                                }
                            }
                            this.method530(var95, var96);
                        }
                    }
                }
            }
        } else {
            int var102 = arg0.method231();
            int var103 = (var102 >> 4 & 7) + this.field1318;
            int var104 = (var102 & 7) + this.field1319;
            int var105 = arg0.method231();
            int var106 = var105 >> 2;
            int var107 = var105 & 3;
            int var108 = this.field1273[var106];
            int var109;
            if (arg1 == 31) {
                var109 = -1;
            } else {
                var109 = arg0.method233();
            }
            if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                this.method465(var106, var107, -1, 0, var108, var109, var104, true, this.field1340, var103);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method7(boolean arg0) {
        if (!this.field1511 && !this.field1215 && !this.field1578) {
            ++field1433;
            if (!this.field1577) {
                this.method491(17165);
            } else {
                this.method492((byte) -47);
            }
            this.method450(-42794);
            this.field1577 &= arg0;
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(Z)V")
    public final void method548(boolean arg0) {
        if (field1310.field402 >> 7 == this.field1342 && field1310.field403 >> 7 == this.field1343) {
            this.field1342 = 0;
        }
        for (int var2 = -1; var2 < this.field1473; ++var2) {
            PlayerEntity var3;
            int var4;
            if (var2 == -1) {
                var3 = field1310;
                var4 = this.field1471 << 14;
            } else {
                var3 = this.field1472[this.field1474[var2]];
                var4 = this.field1474[var2] << 14;
            }
            if (var3 != null && var3.method124(-27441)) {
                var3.field479 = false;
                if ((field1233 && this.field1473 > 50 || this.field1473 > 200) && var2 != -1 && var3.field426 == var3.field407) {
                    var3.field479 = true;
                }
                int var5 = var3.field402 >> 7;
                int var6 = var3.field403 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field474 != null && field1433 >= var3.field469 && field1433 < var3.field470) {
                        var3.field479 = false;
                        var3.field468 = this.method520(0, this.field1340, var3.field403, var3.field402);
                        this.field1144.method74(this.field1340, var3.field476, var4, false, var3.field404, var3.field402, var3.field475, var3.field477, var3.field478, var3, var3.field403, var3.field468, 60);
                    } else {
                        if ((var3.field402 & 127) == 64 && (var3.field403 & 127) == 64) {
                            if (this.field1586[var5][var6] == this.field1444) {
                                continue;
                            }
                            this.field1586[var5][var6] = this.field1444;
                        }
                        var3.field468 = this.method520(0, this.field1340, var3.field403, var3.field402);
                        this.field1144.method73(var3.field405, var4, var3.field468, 60, this.field1340, var3.field404, var3, var3.field402, (byte) 9, var3.field403);
                    }
                }
            }
        }
        this.field1577 &= arg0;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field1558[var1] = var0 / 4;
        }
        field1567 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
    }
}
