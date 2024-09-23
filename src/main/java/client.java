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

    @OriginalMember(owner = "client", name = "C", descriptor = "I")
    private int field1109 = -579;

    @OriginalMember(owner = "client", name = "E", descriptor = "Lob;")
    private LinkList field1111 = new LinkList((byte) -47);

    @OriginalMember(owner = "client", name = "G", descriptor = "Lob;")
    private LinkList field1113 = new LinkList((byte) -47);

    @OriginalMember(owner = "client", name = "H", descriptor = "[I")
    private int[] field1114 = new int[151];

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field1119 = -1;

    @OriginalMember(owner = "client", name = "N", descriptor = "B")
    private byte field1120 = 8;

    @OriginalMember(owner = "client", name = "O", descriptor = "[Lhb;")
    private Pix32[] field1121 = new Pix32[20];

    @OriginalMember(owner = "client", name = "W", descriptor = "[I")
    private int[] field1129 = new int[100];

    @OriginalMember(owner = "client", name = "X", descriptor = "[Ljava/lang/String;")
    private String[] field1130 = new String[100];

    @OriginalMember(owner = "client", name = "Y", descriptor = "[Ljava/lang/String;")
    private String[] field1131 = new String[100];

    @OriginalMember(owner = "client", name = "Z", descriptor = "Z")
    private boolean field1132 = false;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field1133 = 2048;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field1134 = 2047;

    @OriginalMember(owner = "client", name = "cb", descriptor = "[Lz;")
    private PlayerEntity[] field1135 = new PlayerEntity[this.field1133];

    @OriginalMember(owner = "client", name = "eb", descriptor = "[I")
    public int[] field1137 = new int[this.field1133];

    @OriginalMember(owner = "client", name = "gb", descriptor = "[I")
    private int[] field1139 = new int[this.field1133];

    @OriginalMember(owner = "client", name = "hb", descriptor = "[Lkb;")
    private Packet[] field1140 = new Packet[this.field1133];

    @OriginalMember(owner = "client", name = "ib", descriptor = "[I")
    private int[] field1141 = new int[5];

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field1142 = -1;

    @OriginalMember(owner = "client", name = "mb", descriptor = "Z")
    private boolean field1145 = false;

    @OriginalMember(owner = "client", name = "nb", descriptor = "[[I")
    private int[][] field1146 = new int[104][104];

    @OriginalMember(owner = "client", name = "ob", descriptor = "[Lhb;")
    private Pix32[] field1147 = new Pix32[8];

    @OriginalMember(owner = "client", name = "tb", descriptor = "Z")
    private boolean field1152 = false;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field1153 = -526;

    @OriginalMember(owner = "client", name = "xb", descriptor = "[I")
    private int[] field1156 = new int[1000];

    @OriginalMember(owner = "client", name = "yb", descriptor = "[I")
    private int[] field1157 = new int[1000];

    @OriginalMember(owner = "client", name = "Cb", descriptor = "Z")
    private boolean field1161 = false;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field1162 = -29953;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field1168 = -46854;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "Lob;")
    private LinkList field1169 = new LinkList((byte) -47);

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private int field1172 = 7759444;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "Ljava/lang/Object;")
    private Object field1173 = new Object();

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field1175 = 2;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field1176 = 972;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "[I")
    private int[] field1177 = new int[50];

    @OriginalMember(owner = "client", name = "Tb", descriptor = "Lkb;")
    private Packet field1178 = Packet.method196(false, 1);

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1188 = 1;

    @OriginalMember(owner = "client", name = "ec", descriptor = "Ljava/lang/String;")
    private String field1189 = "";

    @OriginalMember(owner = "client", name = "ic", descriptor = "B")
    private byte field1193 = 8;

    @OriginalMember(owner = "client", name = "jc", descriptor = "[Lhb;")
    private Pix32[] field1194 = new Pix32[20];

    @OriginalMember(owner = "client", name = "kc", descriptor = "Lkb;")
    private Packet field1195 = Packet.method196(false, 1);

    @OriginalMember(owner = "client", name = "lc", descriptor = "[I")
    private int[] field1196 = new int[2000];

    @OriginalMember(owner = "client", name = "mc", descriptor = "Z")
    private boolean field1197 = false;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field1202 = -1;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field1206 = -1;

    @OriginalMember(owner = "client", name = "xc", descriptor = "[Ly;")
    private NpcEntity[] field1208 = new NpcEntity[8192];

    @OriginalMember(owner = "client", name = "zc", descriptor = "[I")
    public int[] field1210 = new int[8192];

    @OriginalMember(owner = "client", name = "Ac", descriptor = "[I")
    private int[] field1211 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Bc", descriptor = "Z")
    private boolean field1212 = true;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "Z")
    private boolean field1213 = false;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "[[I")
    private int[][] field1214 = new int[104][104];

    @OriginalMember(owner = "client", name = "Hc", descriptor = "Z")
    private boolean field1218 = true;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private int field1220 = -37106;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "B")
    private byte field1221 = -60;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field1222 = 923;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field1228 = -1;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field1229 = -1;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "B")
    private byte field1230 = 5;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "Z")
    private boolean field1231 = false;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field1234 = 50;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "[I")
    private int[] field1235 = new int[this.field1234];

    @OriginalMember(owner = "client", name = "Zc", descriptor = "[I")
    private int[] field1236 = new int[this.field1234];

    @OriginalMember(owner = "client", name = "ad", descriptor = "[I")
    private int[] field1237 = new int[this.field1234];

    @OriginalMember(owner = "client", name = "bd", descriptor = "[I")
    private int[] field1238 = new int[this.field1234];

    @OriginalMember(owner = "client", name = "cd", descriptor = "[I")
    private int[] field1239 = new int[this.field1234];

    @OriginalMember(owner = "client", name = "dd", descriptor = "[I")
    private int[] field1240 = new int[this.field1234];

    @OriginalMember(owner = "client", name = "ed", descriptor = "[I")
    private int[] field1241 = new int[this.field1234];

    @OriginalMember(owner = "client", name = "fd", descriptor = "[Ljava/lang/String;")
    private String[] field1242 = new String[this.field1234];

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private final int field1243 = 100;

    @OriginalMember(owner = "client", name = "hd", descriptor = "[I")
    private int[] field1244 = new int[100];

    @OriginalMember(owner = "client", name = "id", descriptor = "[I")
    private int[] field1245 = new int[50];

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field1251 = 3;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field1254 = 8;

    @OriginalMember(owner = "client", name = "sd", descriptor = "Z")
    private boolean field1255 = false;

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private int field1256 = 9;

    @OriginalMember(owner = "client", name = "ud", descriptor = "Z")
    private boolean field1257 = false;

    @OriginalMember(owner = "client", name = "wd", descriptor = "Z")
    private boolean field1259 = false;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field1260 = -514;

    @OriginalMember(owner = "client", name = "yd", descriptor = "[I")
    private int[] field1261 = new int[256];

    @OriginalMember(owner = "client", name = "Bd", descriptor = "[[I")
    private int[][] field1264 = new int[104][104];

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field1265 = -1;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "Ljava/lang/String;")
    private String field1267 = "";

    @OriginalMember(owner = "client", name = "Ld", descriptor = "Z")
    private boolean field1274 = false;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "[Lib;")
    private Pix8[] field1276 = new Pix8[13];

    @OriginalMember(owner = "client", name = "Od", descriptor = "[I")
    private int[] field1277 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field1278 = 2301979;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "B")
    private byte field1280 = -58;

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private int field1282 = 1;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "[Ljava/lang/String;")
    private String[] field1283 = new String[100];

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    private int field1285 = 27394;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1286 = new CRC32();

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private int field1288 = 2;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field1290 = -1;

    @OriginalMember(owner = "client", name = "ce", descriptor = "[I")
    private int[] field1291 = new int[500];

    @OriginalMember(owner = "client", name = "de", descriptor = "[I")
    private int[] field1292 = new int[500];

    @OriginalMember(owner = "client", name = "ee", descriptor = "[I")
    private int[] field1293 = new int[500];

    @OriginalMember(owner = "client", name = "fe", descriptor = "[I")
    private int[] field1294 = new int[500];

    @OriginalMember(owner = "client", name = "ie", descriptor = "Z")
    private boolean field1297 = false;

    @OriginalMember(owner = "client", name = "je", descriptor = "Z")
    private boolean field1298 = true;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field1311 = 3353893;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field1313 = 3;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "B")
    private byte field1320 = 4;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field1329 = -1;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "[Ljava/lang/String;")
    private String[] field1330 = new String[500];

    @OriginalMember(owner = "client", name = "Se", descriptor = "Z")
    private boolean field1333 = false;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field1339 = -1;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "Z")
    private boolean field1340 = false;

    @OriginalMember(owner = "client", name = "af", descriptor = "[Lhb;")
    private Pix32[] field1341 = new Pix32[50];

    @OriginalMember(owner = "client", name = "bf", descriptor = "[I")
    private int[] field1342 = new int[5];

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field1349 = -1;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field1350 = 742;

    @OriginalMember(owner = "client", name = "lf", descriptor = "Z")
    private boolean field1351 = true;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Ljava/lang/String;")
    private String field1352 = "";

    @OriginalMember(owner = "client", name = "nf", descriptor = "Ljava/lang/String;")
    private String field1353 = "";

    @OriginalMember(owner = "client", name = "uf", descriptor = "Z")
    private boolean field1360 = false;

    @OriginalMember(owner = "client", name = "vf", descriptor = "Lkb;")
    private Packet field1361 = Packet.method196(false, 1);

    @OriginalMember(owner = "client", name = "wf", descriptor = "Ljava/lang/String;")
    private String field1362 = "";

    @OriginalMember(owner = "client", name = "yf", descriptor = "Ljava/lang/String;")
    private String field1364 = "";

    @OriginalMember(owner = "client", name = "zf", descriptor = "Z")
    private boolean field1365 = false;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "[I")
    private int[] field1375 = new int[7];

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field1377 = -46854;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "Z")
    private boolean field1381 = false;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "[Lib;")
    private Pix8[] field1382 = new Pix8[50];

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field1383 = -750;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "[I")
    private int[] field1385 = new int[50];

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field1388 = -3154;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "[I")
    private int[] field1389 = new int[100];

    @OriginalMember(owner = "client", name = "Zf", descriptor = "[I")
    private int[] field1391 = new int[50];

    @OriginalMember(owner = "client", name = "cg", descriptor = "Z")
    private boolean field1394 = true;

    @OriginalMember(owner = "client", name = "fg", descriptor = "B")
    private byte field1397 = 3;

    @OriginalMember(owner = "client", name = "gg", descriptor = "Z")
    private boolean field1398 = false;

    @OriginalMember(owner = "client", name = "hg", descriptor = "[I")
    private final int[] field1399 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "kg", descriptor = "Ljava/lang/String;")
    private String field1402 = "";

    @OriginalMember(owner = "client", name = "lg", descriptor = "Ljava/lang/String;")
    private String field1403 = "";

    @OriginalMember(owner = "client", name = "mg", descriptor = "Z")
    private boolean field1404 = false;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field1410 = 5063219;

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private int field1411 = 813;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field1412 = 43166;

    @OriginalMember(owner = "client", name = "zg", descriptor = "[I")
    private int[] field1417 = new int[33];

    @OriginalMember(owner = "client", name = "Ag", descriptor = "[Z")
    private boolean[] field1418 = new boolean[5];

    @OriginalMember(owner = "client", name = "Cg", descriptor = "[I")
    private int[] field1420 = new int[50];

    @OriginalMember(owner = "client", name = "Hg", descriptor = "Lob;")
    private LinkList field1425 = new LinkList((byte) -47);

    @OriginalMember(owner = "client", name = "Jg", descriptor = "Z")
    private boolean field1427 = false;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    private int field1431 = 2;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "[I")
    private int[] field1438 = new int[151];

    @OriginalMember(owner = "client", name = "Vg", descriptor = "[I")
    private int[] field1439 = new int[33];

    @OriginalMember(owner = "client", name = "Wg", descriptor = "[I")
    private int[] field1440 = new int[50];

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Ljava/lang/String;")
    private String field1441 = "";

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Z")
    private boolean field1443 = true;

    @OriginalMember(owner = "client", name = "ch", descriptor = "[Lhb;")
    private Pix32[] field1446 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "dh", descriptor = "[[[Lob;")
    private LinkList[][][] field1447 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "ih", descriptor = "Z")
    private boolean field1452 = true;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field1455 = -1;

    @OriginalMember(owner = "client", name = "mh", descriptor = "[I")
    private int[] field1456 = new int[5];

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field1457 = 78;

    @OriginalMember(owner = "client", name = "oh", descriptor = "[I")
    private int[] field1458 = new int[5];

    @OriginalMember(owner = "client", name = "qh", descriptor = "Z")
    private boolean field1460 = false;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "[J")
    private long[] field1471 = new long[100];

    @OriginalMember(owner = "client", name = "Ph", descriptor = "Z")
    private boolean field1485 = false;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "Z")
    private boolean field1486 = false;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "[B")
    private byte[] field1487 = new byte[16384];

    @OriginalMember(owner = "client", name = "Yh", descriptor = "[I")
    private int[] field1494 = new int[5];

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field1495 = 128;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field1499 = 485;

    @OriginalMember(owner = "client", name = "ei", descriptor = "Z")
    private boolean field1500 = false;

    @OriginalMember(owner = "client", name = "fi", descriptor = "[Lec;")
    private CollisionMap[] field1501 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "li", descriptor = "Z")
    private boolean field1507 = false;

    @OriginalMember(owner = "client", name = "yi", descriptor = "[I")
    public int[] field1520 = new int[1000];

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field1522 = -19523;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field1530 = -715;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "Z")
    private boolean field1531 = false;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "Z")
    private boolean field1532 = false;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "Lob;")
    private LinkList field1535 = new LinkList((byte) -47);

    @OriginalMember(owner = "client", name = "Ri", descriptor = "[J")
    private long[] field1539 = new long[100];

    @OriginalMember(owner = "client", name = "Si", descriptor = "[I")
    private int[] field1540 = new int[2000];

    @OriginalMember(owner = "client", name = "Ti", descriptor = "[I")
    private int[] field1541 = new int[4000];

    @OriginalMember(owner = "client", name = "Ui", descriptor = "[I")
    private int[] field1542 = new int[4000];

    @OriginalMember(owner = "client", name = "Vi", descriptor = "Lhc;")
    private Component field1543 = new Component();

    @OriginalMember(owner = "client", name = "Wi", descriptor = "Z")
    private boolean field1544 = false;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "[I")
    private int[] field1547 = new int[9];

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private static int field1126 = -4165;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "[[I")
    public static final int[][] field1217 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "he", descriptor = "[I")
    public static final int[] field1296 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client", name = "ve", descriptor = "B")
    private static byte field1310 = 4;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private static int field1356 = 10;

    @OriginalMember(owner = "client", name = "sf", descriptor = "Z")
    private static boolean field1358 = true;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "B")
    private static byte field1376 = 8;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1387 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "kh", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1454 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client", name = "Mh", descriptor = "[I")
    private static int[] field1482 = new int[99];

    @OriginalMember(owner = "client", name = "Mi", descriptor = "Ljava/lang/String;")
    private static String field1534;

    @OriginalMember(owner = "client", name = "D", descriptor = "I")
    private int field1110;

    @OriginalMember(owner = "client", name = "F", descriptor = "I")
    private int field1112;

    @OriginalMember(owner = "client", name = "I", descriptor = "I")
    private int field1115;

    @OriginalMember(owner = "client", name = "J", descriptor = "I")
    private int field1116;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field1117;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private static int field1118;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private static int field1122;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field1123;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private static int field1125;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field1127;

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field1128;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private int field1136;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field1138;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field1143;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field1144;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field1151;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private int field1154;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field1155;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field1159;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field1160;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private static int field1167;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field1170;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    private int field1171;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field1174;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field1187;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field1199;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private static int field1200;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field1201;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field1203;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field1207;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field1209;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field1216;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    private int field1219;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field1226;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private static int field1232;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field1246;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field1247;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field1248;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field1249;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field1252;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private int field1258;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private static int field1266;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field1268;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field1270;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field1271;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private int field1273;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private static int field1275;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field1281;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field1312;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field1314;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1315;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field1316;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field1317;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private static int field1321;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field1324;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field1326;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private static int field1327;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field1336;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field1337;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field1338;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field1344;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field1345;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private static int field1357;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field1363;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "I")
    private static int field1370;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field1371;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field1372;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private int field1373;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field1374;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field1384;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private static int field1386;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client", name = "ng", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private static int field1419;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field1424;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private int field1429;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field1430;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field1434;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private static int field1442;

    @OriginalMember(owner = "client", name = "ah", descriptor = "I")
    private int field1444;

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private int field1448;

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field1450;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field1451;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private static int field1459;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private static int field1465;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field1468;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private int field1470;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field1478;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field1484;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field1496;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private int field1504;

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field1518;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field1519;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field1524;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field1526;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field1527;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field1538;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "I")
    private static int field1546;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "J")
    private long field1325;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "J")
    private long field1426;

    @OriginalMember(owner = "client", name = "jh", descriptor = "J")
    private long field1453;

    @OriginalMember(owner = "client", name = "eg", descriptor = "Ld;")
    private ClientStream field1396;

    @OriginalMember(owner = "client", name = "R", descriptor = "Ltb;")
    private Isaac field1124;

    @OriginalMember(owner = "client", name = "pf", descriptor = "Lub;")
    private Jagfile field1355;

    @OriginalMember(owner = "client", name = "zd", descriptor = "Lhb;")
    private Pix32 field1262;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "Lhb;")
    private Pix32 field1263;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "Lhb;")
    private Pix32 field1279;

    @OriginalMember(owner = "client", name = "De", descriptor = "Lhb;")
    private Pix32 field1318;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "Lhb;")
    private Pix32 field1319;

    @OriginalMember(owner = "client", name = "vg", descriptor = "Lhb;")
    private Pix32 field1413;

    @OriginalMember(owner = "client", name = "wg", descriptor = "Lhb;")
    private Pix32 field1414;

    @OriginalMember(owner = "client", name = "xg", descriptor = "Lhb;")
    private Pix32 field1415;

    @OriginalMember(owner = "client", name = "yg", descriptor = "Lhb;")
    private Pix32 field1416;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "Lhb;")
    private Pix32 field1423;

    @OriginalMember(owner = "client", name = "Li", descriptor = "Lhb;")
    private Pix32 field1533;

    @OriginalMember(owner = "client", name = "pb", descriptor = "Lib;")
    private Pix8 field1148;

    @OriginalMember(owner = "client", name = "qb", descriptor = "Lib;")
    private Pix8 field1149;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "Lib;")
    private Pix8 field1179;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "Lib;")
    private Pix8 field1180;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "Lib;")
    private Pix8 field1181;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "Lib;")
    private Pix8 field1182;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "Lib;")
    private Pix8 field1183;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "Lib;")
    private Pix8 field1184;

    @OriginalMember(owner = "client", name = "ac", descriptor = "Lib;")
    private Pix8 field1185;

    @OriginalMember(owner = "client", name = "bc", descriptor = "Lib;")
    private Pix8 field1186;

    @OriginalMember(owner = "client", name = "fc", descriptor = "Lib;")
    private Pix8 field1190;

    @OriginalMember(owner = "client", name = "gc", descriptor = "Lib;")
    private Pix8 field1191;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "Lib;")
    private Pix8 field1223;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "Lib;")
    private Pix8 field1224;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "Lib;")
    private Pix8 field1225;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "Lib;")
    private Pix8 field1473;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "Lib;")
    private Pix8 field1474;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "Lib;")
    private Pix8 field1475;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "Lib;")
    private Pix8 field1476;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "Lib;")
    private Pix8 field1477;

    @OriginalMember(owner = "client", name = "rh", descriptor = "Ljb;")
    private PixFont field1461;

    @OriginalMember(owner = "client", name = "sh", descriptor = "Ljb;")
    private PixFont field1462;

    @OriginalMember(owner = "client", name = "th", descriptor = "Ljb;")
    private PixFont field1463;

    @OriginalMember(owner = "client", name = "uh", descriptor = "Ljb;")
    private PixFont field1464;

    @OriginalMember(owner = "client", name = "le", descriptor = "Lqb;")
    private PixMap field1300;

    @OriginalMember(owner = "client", name = "me", descriptor = "Lqb;")
    private PixMap field1301;

    @OriginalMember(owner = "client", name = "ne", descriptor = "Lqb;")
    private PixMap field1302;

    @OriginalMember(owner = "client", name = "oe", descriptor = "Lqb;")
    private PixMap field1303;

    @OriginalMember(owner = "client", name = "pe", descriptor = "Lqb;")
    private PixMap field1304;

    @OriginalMember(owner = "client", name = "qe", descriptor = "Lqb;")
    private PixMap field1305;

    @OriginalMember(owner = "client", name = "re", descriptor = "Lqb;")
    private PixMap field1306;

    @OriginalMember(owner = "client", name = "se", descriptor = "Lqb;")
    private PixMap field1307;

    @OriginalMember(owner = "client", name = "te", descriptor = "Lqb;")
    private PixMap field1308;

    @OriginalMember(owner = "client", name = "ue", descriptor = "Lqb;")
    private PixMap field1309;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "Lqb;")
    private PixMap field1378;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "Lqb;")
    private PixMap field1379;

    @OriginalMember(owner = "client", name = "Of", descriptor = "Lqb;")
    private PixMap field1380;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "Lqb;")
    private PixMap field1488;

    @OriginalMember(owner = "client", name = "Th", descriptor = "Lqb;")
    private PixMap field1489;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "Lqb;")
    private PixMap field1490;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Lqb;")
    private PixMap field1491;

    @OriginalMember(owner = "client", name = "ni", descriptor = "Lqb;")
    private PixMap field1509;

    @OriginalMember(owner = "client", name = "oi", descriptor = "Lqb;")
    private PixMap field1510;

    @OriginalMember(owner = "client", name = "pi", descriptor = "Lqb;")
    private PixMap field1511;

    @OriginalMember(owner = "client", name = "qi", descriptor = "Lqb;")
    private PixMap field1512;

    @OriginalMember(owner = "client", name = "ri", descriptor = "Lqb;")
    private PixMap field1513;

    @OriginalMember(owner = "client", name = "si", descriptor = "Lqb;")
    private PixMap field1514;

    @OriginalMember(owner = "client", name = "ti", descriptor = "Lqb;")
    private PixMap field1515;

    @OriginalMember(owner = "client", name = "ui", descriptor = "Lqb;")
    private PixMap field1516;

    @OriginalMember(owner = "client", name = "vi", descriptor = "Lqb;")
    private PixMap field1517;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Lz;")
    private PlayerEntity field1492;

    @OriginalMember(owner = "client", name = "hc", descriptor = "Lr;")
    private World3D field1192;

    @OriginalMember(owner = "client", name = "nd", descriptor = "Ljava/lang/String;")
    public String field1250;

    @OriginalMember(owner = "client", name = "ge", descriptor = "Ljava/lang/String;")
    private String field1295;

    @OriginalMember(owner = "client", name = "ji", descriptor = "Ljava/lang/String;")
    public String field1505;

    @OriginalMember(owner = "client", name = "ki", descriptor = "Ljava/lang/String;")
    private String field1506;

    @OriginalMember(owner = "client", name = "zi", descriptor = "Ljava/lang/String;")
    private String field1521;

    @OriginalMember(owner = "client", name = "ae", descriptor = "Z")
    private static boolean field1289;

    @OriginalMember(owner = "client", name = "tf", descriptor = "Z")
    private static boolean field1359;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "[I")
    private int[] field1164;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "[I")
    private int[] field1165;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "[I")
    private int[] field1166;

    @OriginalMember(owner = "client", name = "tc", descriptor = "[I")
    private int[] field1204;

    @OriginalMember(owner = "client", name = "uc", descriptor = "[I")
    private int[] field1205;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "[I")
    private int[] field1215;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "[I")
    private int[] field1331;

    @OriginalMember(owner = "client", name = "Re", descriptor = "[I")
    private int[] field1332;

    @OriginalMember(owner = "client", name = "Af", descriptor = "[I")
    private int[] field1366;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "[I")
    private int[] field1367;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "[I")
    private int[] field1368;

    @OriginalMember(owner = "client", name = "Df", descriptor = "[I")
    private int[] field1369;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "[Lib;")
    private Pix8[] field1472;

    @OriginalMember(owner = "client", name = "rb", descriptor = "[[B")
    private byte[][] field1150;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "[[B")
    private byte[][] field1483;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "[[[B")
    private byte[][][] field1323;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "[[[I")
    private int[][][] field1163;

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILhb;)V")
    public final void method363(int arg0, int arg1, int arg2, Pix32 arg3) {
        int var5 = this.field1496 + this.field1287 & 2047;
        int var6 = arg1 * arg1 + arg2 * arg2;
        if (var6 <= 6400) {
            int var7 = Model.field531[var5];
            int var8 = Model.field532[var5];
            int var9 = var7 * 256 / (this.field1187 + 256);
            int var10 = var8 * 256 / (this.field1187 + 256);
            if (arg0 != 44453) {
                this.field1326 = -188;
            }
            int var11 = arg1 * var9 + arg2 * var10 >> 16;
            int var12 = arg1 * var10 - arg2 * var9 >> 16;
            if (var6 > 2500) {
                arg3.method180(-978, this.field1224, 83 - var12 - arg3.field586 / 2, var11 + 94 - arg3.field585 / 2);
            } else {
                arg3.method173(83 - var12 - arg3.field586 / 2, true, var11 + 94 - arg3.field585 / 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method364(byte arg0) {
        if (this.field1252 == 2) {
            this.method371((this.field1525 - this.field1449 << 7) + this.field1528, this.field1526 * 2, 5, (this.field1524 - this.field1448 << 7) + this.field1527);
            if (arg0 != -95) {
                this.field1447 = null;
            }
            if (this.field1228 > -1 && field1529 % 20 < 10) {
                this.field1194[2].method173(this.field1229 - 28, true, this.field1228 - 12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method365(byte arg0) {
        this.field1259 = false;
        while (this.field1544) {
            this.field1259 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var3) {
            }
        }
        this.field1148 = null;
        this.field1149 = null;
        this.field1472 = null;
        this.field1366 = null;
        this.field1367 = null;
        this.field1368 = null;
        this.field1369 = null;
        this.field1204 = null;
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            this.field1270 = this.field1178.method209();
        }
        this.field1205 = null;
        this.field1331 = null;
        this.field1332 = null;
        this.field1318 = null;
        this.field1319 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method12(Runnable arg0, int arg1) {
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method12(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II[BZ)V")
    public final void method366(int arg0, int arg1, byte[] arg2, boolean arg3) {
        signlink.midifade = arg3 ? 1 : 0;
        signlink.midisave(arg2, arg0);
        if (arg1 != 1) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method367(byte arg0) {
        ++this.field1219;
        this.method452(4);
        this.method401(453);
        this.method397(4);
        this.method380(0);
        this.method375((byte) 6);
        if (!this.field1360) {
            int var2 = this.field1495;
            if (this.field1127 / 256 > var2) {
                var2 = this.field1127 / 256;
            }
            if (this.field1418[4] && this.field1456[4] + 128 > var2) {
                var2 = this.field1456[4] + 128;
            }
            int var3 = this.field1496 + this.field1281 & 2047;
            this.method468(this.field1158, this.method420(this.field1492.field306, this.field1221, this.field1492.field307, this.field1545) - 50, 0, var3, var2 * 3 + 600, var2, this.field1159);
        }
        int var4;
        if (!this.field1360) {
            var4 = this.method402(true);
        } else {
            var4 = this.method403(true);
        }
        int var5 = this.field1343;
        int var6 = this.field1344;
        int var7 = this.field1345;
        int var8 = this.field1346;
        int var9 = this.field1347;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field1418[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field1342[var10] * 2 + 1) - (double) this.field1342[var10] + Math.sin((double) this.field1458[var10] / 100.0D * (double) this.field1494[var10]) * (double) this.field1456[var10]);
                if (var10 == 0) {
                    this.field1343 += var12;
                }
                if (var10 == 1) {
                    this.field1344 += var12;
                }
                if (var10 == 2) {
                    this.field1345 += var12;
                }
                if (var10 == 3) {
                    this.field1347 = this.field1347 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field1346 += var12;
                    if (this.field1346 < 128) {
                        this.field1346 = 128;
                    }
                    if (this.field1346 > 383) {
                        this.field1346 = 383;
                    }
                }
            }
        }
        int var11 = Pix3D.field572;
        Model.field526 = true;
        Model.field529 = 0;
        Model.field527 = super.field19 - 8;
        Model.field528 = super.field20 - 11;
        Pix2D.method148(true);
        this.field1192.method90(var4, this.field1344, this.field1345, this.field1343, -24092, this.field1347, this.field1346);
        this.field1192.method64(110);
        this.method377((byte) 22);
        this.method364((byte) -95);
        this.method383(var11, false);
        this.method396(true);
        this.field1490.method236(11, 8, -715, super.field12);
        if (arg0 != 122) {
            this.field1270 = -1;
        }
        this.field1343 = var5;
        this.field1344 = var6;
        this.field1345 = var7;
        this.field1346 = var8;
        this.field1347 = var9;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method9(int arg0) {
        if (!this.field1333 && !this.field1257 && !this.field1500) {
            if (!this.field1486) {
                this.method416(4);
            } else {
                this.method479(0);
            }
            this.field1393 = 0;
            if (arg0 != 7) {
                this.field1212 = !this.field1212;
            }
        } else {
            this.method430(0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public final void method13(byte arg0, String arg1, int arg2) {
        this.method448(0);
        if (this.field1355 == null) {
            super.method13((byte) 72, arg1, arg2);
        } else {
            this.field1511.method235(0);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1463.method188(var5 / 2 - 26 - var6, 2, "RuneScape is loading - please wait...", var4 / 2, 16777215);
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method150(304, 9179409, var4 / 2 - 152, var7, true, 34);
            Pix2D.method150(302, 0, var4 / 2 - 151, var7 + 1, true, 32);
            Pix2D.method149(var4 / 2 - 150, arg2 * 3, 9179409, 5, var7 + 2, 30);
            Pix2D.method149(arg2 * 3 + (var4 / 2 - 150), 300 - arg2 * 3, 0, 5, var7 + 2, 30);
            this.field1463.method188(var5 / 2 + 5 - var6, 2, arg1, var4 / 2, 16777215);
            this.field1511.method236(186, 214, -715, super.field12);
            if (arg0 != 72) {
                field1321 = this.field1124.method246();
            }
            if (this.field1485) {
                this.field1485 = false;
                if (!this.field1259) {
                    this.field1512.method236(0, 0, -715, super.field12);
                    this.field1513.method236(0, 661, -715, super.field12);
                }
                this.field1509.method236(0, 128, -715, super.field12);
                this.field1510.method236(386, 214, -715, super.field12);
                this.field1514.method236(265, 0, -715, super.field12);
                this.field1515.method236(265, 574, -715, super.field12);
                this.field1516.method236(186, 128, -715, super.field12);
                this.field1517.method236(186, 574, -715, super.field12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method368(int arg0) {
        int var2 = 13 / arg0;
        if (this.field1246 == 0 && this.field1502 == 0) {
            this.field1330[this.field1144] = "Walk here";
            this.field1293[this.field1144] = 981;
            this.field1291[this.field1144] = super.field19;
            this.field1292[this.field1144] = super.field20;
            ++this.field1144;
        }
        int var3 = -1;
        for (int var4 = 0; var4 < Model.field529; ++var4) {
            int var5 = Model.field530[var4];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var3 != var5) {
                var3 = var5;
                if (var8 == 2 && this.field1192.method81(this.field1545, var6, var7, var5) >= 0) {
                    LocType var10 = LocType.method275(var9);
                    if (this.field1246 == 1) {
                        this.field1330[this.field1144] = "Use " + this.field1250 + " with @cya@" + var10.field820;
                        this.field1293[this.field1144] = 505;
                        this.field1294[this.field1144] = var5;
                        this.field1291[this.field1144] = var6;
                        this.field1292[this.field1144] = var7;
                        ++this.field1144;
                    } else if (this.field1502 == 1) {
                        if ((this.field1504 & 4) == 4) {
                            this.field1330[this.field1144] = this.field1505 + " @cya@" + var10.field820;
                            this.field1293[this.field1144] = 737;
                            this.field1294[this.field1144] = var5;
                            this.field1291[this.field1144] = var6;
                            this.field1292[this.field1144] = var7;
                            ++this.field1144;
                        }
                    } else {
                        if (var10.field836 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field836[var11] != null) {
                                    this.field1330[this.field1144] = var10.field836[var11] + " @cya@" + var10.field820;
                                    if (var11 == 0) {
                                        this.field1293[this.field1144] = 798;
                                    }
                                    if (var11 == 1) {
                                        this.field1293[this.field1144] = 829;
                                    }
                                    if (var11 == 2) {
                                        this.field1293[this.field1144] = 873;
                                    }
                                    if (var11 == 3) {
                                        this.field1293[this.field1144] = 104;
                                    }
                                    if (var11 == 4) {
                                        this.field1293[this.field1144] = 1659;
                                    }
                                    this.field1294[this.field1144] = var5;
                                    this.field1291[this.field1144] = var6;
                                    this.field1292[this.field1144] = var7;
                                    ++this.field1144;
                                }
                            }
                        }
                        this.field1330[this.field1144] = "Examine @cya@" + var10.field820;
                        this.field1293[this.field1144] = 1418;
                        this.field1294[this.field1144] = var5;
                        this.field1291[this.field1144] = var6;
                        this.field1292[this.field1144] = var7;
                        ++this.field1144;
                    }
                }
                if (var8 == 1) {
                    NpcEntity var12 = this.field1208[var9];
                    if (var12.field360.field865 == 1 && (var12.field306 & 127) == 64 && (var12.field307 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field1209; ++var13) {
                            NpcEntity var14 = this.field1208[this.field1210[var13]];
                            if (var14 != null && var12 != var14 && var14.field360.field865 == 1 && var12.field306 == var14.field306 && var12.field307 == var14.field307) {
                                this.method446(this.field1210[var13], this.field1109, var7, var6, var14.field360);
                            }
                        }
                    }
                    this.method446(var9, this.field1109, var7, var6, var12.field360);
                }
                if (var8 == 0) {
                    PlayerEntity var15 = this.field1135[var9];
                    if ((var15.field306 & 127) == 64 && (var15.field307 & 127) == 64) {
                        for (int var16 = 0; var16 < this.field1209; ++var16) {
                            NpcEntity var19 = this.field1208[this.field1210[var16]];
                            if (var19 != null && var19.field360.field865 == 1 && var15.field306 == var19.field306 && var15.field307 == var19.field307) {
                                this.method446(this.field1210[var16], this.field1109, var7, var6, var19.field360);
                            }
                        }
                        for (int var17 = 0; var17 < this.field1136; ++var17) {
                            PlayerEntity var18 = this.field1135[this.field1137[var17]];
                            if (var18 != null && var15 != var18 && var15.field306 == var18.field306 && var15.field307 == var18.field307) {
                                this.method440(var6, 517, this.field1137[var17], var7, var18);
                            }
                        }
                    }
                    this.method440(var6, 517, var9, var7, var15);
                }
                if (var8 == 3) {
                    LinkList var20 = this.field1447[this.field1545][var6][var7];
                    if (var20 != null) {
                        for (ObjStackEntity var21 = (ObjStackEntity) var20.method229(0); var21 != null; var21 = (ObjStackEntity) var20.method231(-616)) {
                            ObjType var22 = ObjType.method287(var21.field302);
                            if (this.field1246 == 1) {
                                this.field1330[this.field1144] = "Use " + this.field1250 + " with @lre@" + var22.field897;
                                this.field1293[this.field1144] = 203;
                                this.field1294[this.field1144] = var21.field302;
                                this.field1291[this.field1144] = var6;
                                this.field1292[this.field1144] = var7;
                                ++this.field1144;
                            } else if (this.field1502 == 1) {
                                if ((this.field1504 & 1) == 1) {
                                    this.field1330[this.field1144] = this.field1505 + " @lre@" + var22.field897;
                                    this.field1293[this.field1144] = 543;
                                    this.field1294[this.field1144] = var21.field302;
                                    this.field1291[this.field1144] = var6;
                                    this.field1292[this.field1144] = var7;
                                    ++this.field1144;
                                }
                            } else {
                                for (int var23 = 4; var23 >= 0; --var23) {
                                    if (var22.field912 != null && var22.field912[var23] != null) {
                                        this.field1330[this.field1144] = var22.field912[var23] + " @lre@" + var22.field897;
                                        if (var23 == 0) {
                                            this.field1293[this.field1144] = 56;
                                        }
                                        if (var23 == 1) {
                                            this.field1293[this.field1144] = 321;
                                        }
                                        if (var23 == 2) {
                                            this.field1293[this.field1144] = 552;
                                        }
                                        if (var23 == 3) {
                                            this.field1293[this.field1144] = 43;
                                        }
                                        if (var23 == 4) {
                                            this.field1293[this.field1144] = 687;
                                        }
                                        this.field1294[this.field1144] = var21.field302;
                                        this.field1291[this.field1144] = var6;
                                        this.field1292[this.field1144] = var7;
                                        ++this.field1144;
                                    } else if (var23 == 2) {
                                        this.field1330[this.field1144] = "Take @lre@" + var22.field897;
                                        this.field1293[this.field1144] = 552;
                                        this.field1294[this.field1144] = var21.field302;
                                        this.field1291[this.field1144] = var6;
                                        this.field1292[this.field1144] = var7;
                                        ++this.field1144;
                                    }
                                }
                                this.field1330[this.field1144] = "Examine @lre@" + var22.field897;
                                this.field1293[this.field1144] = 1308;
                                this.field1294[this.field1144] = var21.field302;
                                this.field1291[this.field1144] = var6;
                                this.field1292[this.field1144] = var7;
                                ++this.field1144;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method369(int arg0) {
        if (this.field1407 == 0) {
            this.field1330[0] = "Cancel";
            this.field1293[0] = 1333;
            this.field1144 = 1;
            this.method447(super.field20, super.field19, 0);
            if (arg0 < 9 || arg0 > 9) {
                this.field1447 = null;
            }
            this.field1523 = 0;
            if (super.field19 > 8 && super.field20 > 11 && super.field19 < 520 && super.field20 < 345) {
                if (this.field1290 != -1) {
                    this.method421(Component.field973[this.field1290], 11, super.field20, 0, false, 8, super.field19);
                } else {
                    this.method368(322);
                }
            }
            if (this.field1523 != this.field1390) {
                this.field1390 = this.field1523;
            }
            this.field1523 = 0;
            if (super.field19 > 562 && super.field20 > 231 && super.field19 < 752 && super.field20 < 492) {
                if (this.field1339 != -1) {
                    this.method421(Component.field973[this.field1339], 231, super.field20, 0, false, 562, super.field19);
                } else if (this.field1277[this.field1251] != -1) {
                    this.method421(Component.field973[this.field1277[this.field1251]], 231, super.field20, 0, false, 562, super.field19);
                }
            }
            if (this.field1523 != this.field1117) {
                this.field1197 = true;
                this.field1117 = this.field1523;
            }
            this.field1523 = 0;
            if (super.field19 > 22 && super.field20 > 375 && super.field19 < 431 && super.field20 < 471) {
                if (this.field1455 != -1) {
                    this.method421(Component.field973[this.field1455], 375, super.field20, 0, false, 22, super.field19);
                } else {
                    this.method484(true, super.field20 - 375, super.field19 - 22);
                }
            }
            if (this.field1455 != -1 && this.field1523 != this.field1432) {
                this.field1161 = true;
                this.field1432 = this.field1523;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field1144 - 1; ++var3) {
                    if (this.field1293[var3] < 1000 && this.field1293[var3 + 1] > 1000) {
                        String var4 = this.field1330[var3];
                        this.field1330[var3] = this.field1330[var3 + 1];
                        this.field1330[var3 + 1] = var4;
                        int var5 = this.field1293[var3];
                        this.field1293[var3] = this.field1293[var3 + 1];
                        this.field1293[var3 + 1] = var5;
                        int var6 = this.field1291[var3];
                        this.field1291[var3] = this.field1291[var3 + 1];
                        this.field1291[var3 + 1] = var6;
                        int var7 = this.field1292[var3];
                        this.field1292[var3] = this.field1292[var3 + 1];
                        this.field1292[var3 + 1] = var7;
                        int var8 = this.field1294[var3];
                        this.field1294[var3] = this.field1294[var3 + 1];
                        this.field1294[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lx;II)V")
    public final void method370(PathingEntity arg0, int arg1, int arg2) {
        if (arg2 <= 0) {
            this.field1313 = this.field1124.method246();
        }
        this.method371(arg0.field307, arg1, 5, arg0.field306);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)V")
    public final void method371(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg0 >= 128 && arg3 <= 13056 && arg0 <= 13056) {
            int var5 = this.method420(arg3, this.field1221, arg0, this.field1545) - arg1;
            int var6 = arg3 - this.field1343;
            if (arg2 < 5 || arg2 > 5) {
                this.field1270 = -1;
            }
            int var7 = var5 - this.field1344;
            int var8 = arg0 - this.field1345;
            int var9 = Model.field531[this.field1346];
            int var10 = Model.field532[this.field1346];
            int var11 = Model.field531[this.field1347];
            int var12 = Model.field532[this.field1347];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field1228 = (var13 << 9) / var17 + Pix3D.field557;
                this.field1229 = (var16 << 9) / var17 + Pix3D.field558;
            } else {
                this.field1228 = -1;
                this.field1229 = -1;
            }
        } else {
            this.field1228 = -1;
            this.field1229 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIZ)V")
    public final void method372(byte arg0, int arg1, boolean arg2) {
        if (arg0 == 6) {
            boolean var4 = false;
        } else {
            this.field1270 = this.field1178.method209();
        }
        signlink.midivol = arg1;
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLkb;I)V")
    private final void method373(byte arg0, Packet arg1, int arg2) {
        if (this.field1193 != arg0) {
            this.field1447 = null;
        }
        while (arg1.field624 + 21 < arg2 * 8) {
            int var4 = arg1.method220(13, (byte) 27);
            if (var4 == 8191) {
                break;
            }
            if (this.field1208[var4] == null) {
                this.field1208[var4] = new NpcEntity();
            }
            NpcEntity var5 = this.field1208[var4];
            this.field1210[this.field1209++] = var4;
            var5.field350 = field1529;
            var5.field360 = NpcType.method281(arg1.method220(11, (byte) 27));
            var5.field310 = var5.field360.field865;
            var5.field313 = var5.field360.field869;
            var5.field314 = var5.field360.field870;
            var5.field315 = var5.field360.field871;
            var5.field316 = var5.field360.field872;
            var5.field311 = var5.field360.field868;
            int var6 = arg1.method220(5, (byte) 27);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg1.method220(5, (byte) 27);
            if (var7 > 15) {
                var7 -= 32;
            }
            var5.method109(this.field1492.field355[0] + var7, true, false, this.field1492.field354[0] + var6);
            int var8 = arg1.method220(1, (byte) 27);
            if (var8 == 1) {
                this.field1139[this.field1138++] = var4;
            }
        }
        arg1.method221(this.field1220);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lhc;I)Z")
    public final boolean method374(Component arg0, int arg1) {
        if (arg1 != 0) {
            this.field1350 = this.field1124.method246();
        }
        int var3 = arg0.field982;
        if (var3 == 201) {
            this.field1161 = true;
            this.field1213 = false;
            this.field1398 = true;
            this.field1364 = "";
            this.field1123 = 1;
            this.field1362 = "Enter name of friend to add to list";
        }
        if (var3 == 202) {
            this.field1161 = true;
            this.field1213 = false;
            this.field1398 = true;
            this.field1364 = "";
            this.field1123 = 2;
            this.field1362 = "Enter name of friend to delete from list";
        }
        if (var3 == 205) {
            this.field1273 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field1161 = true;
                this.field1213 = false;
                this.field1398 = true;
                this.field1364 = "";
                this.field1123 = 4;
                this.field1362 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field1161 = true;
                this.field1213 = false;
                this.field1398 = true;
                this.field1364 = "";
                this.field1123 = 5;
                this.field1362 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field1375[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = IdkType.field962 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= IdkType.field962) {
                                var6 = 0;
                            }
                        }
                        if (!IdkType.field963[var6].field969 && IdkType.field963[var6].field964 == var4 + (this.field1218 ? 0 : 7)) {
                            this.field1375[var4] = var6;
                            this.field1460 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field1141[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field1217[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field1217[var7].length) {
                        var9 = 0;
                    }
                }
                this.field1141[var7] = var9;
                this.field1460 = true;
            }
            if (var3 == 324 && !this.field1218) {
                this.field1218 = true;
                this.method463(-6645);
            }
            if (var3 == 325 && this.field1218) {
                this.field1218 = false;
                this.method463(-6645);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field1132 = !this.field1132;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method453(-24081);
                    if (this.field1441.length() > 0) {
                        this.field1195.method198(9, 252);
                        this.field1195.method205(JString.method251(this.field1441), true);
                        this.field1195.method199(var3 - 601);
                        this.field1195.method199(this.field1132 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1195.method198(9, 239);
                this.field1195.method199(this.field1218 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field1195.method199(this.field1375[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field1195.method199(this.field1141[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method375(byte arg0) {
        if (arg0 == 6) {
            for (LocEntity var2 = (LocEntity) this.field1535.method228(); var2 != null; var2 = (LocEntity) this.field1535.method230(this.field1162)) {
                boolean var3 = false;
                var2.field661 += this.field1445;
                if (var2.field660 == -1) {
                    var2.field660 = 0;
                    var3 = true;
                }
                label73: {
                    do {
                        do {
                            if (var2.field661 <= var2.field659.field1047[var2.field660]) {
                                break label73;
                            }
                            var2.field661 -= var2.field659.field1047[var2.field660] + 1;
                            ++var2.field660;
                            var3 = true;
                        } while (var2.field660 < var2.field659.field1044);
                        var2.field660 -= var2.field659.field1048;
                    } while (var2.field660 >= 0 && var2.field660 < var2.field659.field1044);
                    var2.method107();
                    var3 = false;
                }
                if (var3) {
                    int var4 = var2.field654;
                    int var5 = var2.field656;
                    int var6 = var2.field657;
                    int var7 = 0;
                    if (var2.field655 == 0) {
                        var7 = this.field1192.method77(var4, var5, var6);
                    }
                    if (var2.field655 == 1) {
                        var7 = this.field1192.method78(var6, var4, var5, (byte) 89);
                    }
                    if (var2.field655 == 2) {
                        var7 = this.field1192.method79(var4, var5, var6);
                    }
                    if (var2.field655 == 3) {
                        var7 = this.field1192.method80(var4, var5, var6);
                    }
                    if (var7 != 0 && (var7 >> 14 & 32767) == var2.field658) {
                        int var8 = this.field1163[var4][var5][var6];
                        int var9 = this.field1163[var4][var5 + 1][var6];
                        int var10 = this.field1163[var4][var5 + 1][var6 + 1];
                        int var11 = this.field1163[var4][var5][var6 + 1];
                        LocType var12 = LocType.method275(var2.field658);
                        int var13 = -1;
                        if (var2.field660 != -1) {
                            var13 = var2.field659.field1045[var2.field660];
                        }
                        if (var2.field655 == 2) {
                            int var14 = this.field1192.method81(var4, var5, var6, var7);
                            int var15 = var14 & 31;
                            int var16 = var14 >> 6;
                            if (var15 == 11) {
                                var15 = 10;
                            }
                            Model var17 = var12.method278(var15, var16, var8, var9, var10, var11, var13);
                            this.field1192.method66(var5, var17, var4, var6, -132);
                        } else if (var2.field655 == 1) {
                            Model var18 = var12.method278(4, 0, var8, var9, var10, var11, var13);
                            this.field1192.method68(var18, var5, (byte) -5, var6, var4);
                        } else if (var2.field655 == 0) {
                            int var19 = this.field1192.method81(var4, var5, var6, var7);
                            int var20 = var19 & 31;
                            int var21 = var19 >> 6;
                            if (var20 == 2) {
                                int var22 = var21 + 1 & 3;
                                Model var23 = var12.method278(2, var21 + 4, var8, var9, var10, var11, var13);
                                Model var24 = var12.method278(2, var22, var8, var9, var10, var11, var13);
                                this.field1192.method71(var24, true, var23, var6, var4, var5);
                            } else {
                                Model var25 = var12.method278(var20, var21, var8, var9, var10, var11, var13);
                                this.field1192.method70(var4, var25, var5, (byte) 30, var6);
                            }
                        } else if (var2.field655 == 3) {
                            int var26 = this.field1192.method81(var4, var5, var6, var7);
                            int var27 = var26 >> 6;
                            Model var28 = var12.method278(22, var27, var8, var9, var10, var11, var13);
                            this.field1192.method69(var28, var4, var5, false, var6);
                        }
                    } else {
                        var2.method107();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    public final void method376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1269 += arg0;
        if (arg2 >= 1 && arg3 >= 1 && arg2 <= 102 && arg3 <= 102) {
            if (field1359 && this.field1545 != arg5) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg7 == 0) {
                var9 = this.field1192.method77(arg5, arg2, arg3);
            }
            if (arg7 == 1) {
                var9 = this.field1192.method78(arg3, arg5, arg2, (byte) 89);
            }
            if (arg7 == 2) {
                var9 = this.field1192.method79(arg5, arg2, arg3);
            }
            if (arg7 == 3) {
                var9 = this.field1192.method80(arg5, arg2, arg3);
            }
            if (var9 != 0) {
                int var13 = this.field1192.method81(arg5, arg2, arg3, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg7 == 0) {
                    this.field1192.method72(arg5, (byte) 0, arg3, arg2);
                    LocType var17 = LocType.method275(var14);
                    if (var17.field826) {
                        this.field1501[arg5].method300(var17.field827, 477, arg3, var15, arg2, var16);
                    }
                }
                if (arg7 == 1) {
                    this.field1192.method73(arg3, arg2, false, arg5);
                }
                if (arg7 == 2) {
                    this.field1192.method74(arg5, arg2, false, arg3);
                    LocType var18 = LocType.method275(var14);
                    if (var18.field824 + arg2 > 103 || var18.field824 + arg3 > 103 || var18.field825 + arg2 > 103 || var18.field825 + arg3 > 103) {
                        return;
                    }
                    if (var18.field826) {
                        this.field1501[arg5].method301(var16, 0, var18.field824, arg2, arg3, var18.field827, var18.field825);
                    }
                }
                if (arg7 == 3) {
                    this.field1192.method75(arg2, arg3, 0, arg5);
                    LocType var19 = LocType.method275(var14);
                    if (var19.field826 && var19.field828) {
                        this.field1501[arg5].method303(3, arg3, arg2);
                    }
                }
            }
            if (arg4 >= 0) {
                int var20 = arg5;
                if (arg5 < 3 && (this.field1323[1][arg2][arg3] & 2) == 2) {
                    var20 = arg5 + 1;
                }
                World.method28(this.field1501[arg5], this.field1535, arg3, arg4, this.field1192, this.field1163, arg6, arg5, arg1, false, var20, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method377(byte arg0) {
        this.field1233 = 0;
        for (int var2 = -1; var2 < this.field1209 + this.field1136; ++var2) {
            PathingEntity var17;
            if (var2 == -1) {
                var17 = this.field1492;
            } else if (var2 < this.field1136) {
                var17 = this.field1135[this.field1137[var2]];
            } else {
                var17 = this.field1208[this.field1210[var2 - this.field1136]];
            }
            if (var17 != null && var17.method111(this.field1153)) {
                if (var2 >= this.field1136) {
                    if (this.field1252 == 1 && this.field1210[var2 - this.field1136] == this.field1481 && field1529 % 20 < 10) {
                        this.method370(var17, var17.field351 + 15, 333);
                        if (this.field1228 > -1) {
                            this.field1194[2].method173(this.field1229 - 28, true, this.field1228 - 12);
                        }
                    }
                } else {
                    int var18 = 30;
                    PlayerEntity var19 = (PlayerEntity) var17;
                    if (var19.field369 != 0) {
                        this.method370(var17, var17.field351 + 15, 333);
                        if (this.field1228 > -1) {
                            for (int var20 = 0; var20 < 8; ++var20) {
                                if ((var19.field369 & 1 << var20) != 0) {
                                    this.field1194[var20].method173(this.field1229 - var18, true, this.field1228 - 12);
                                    var18 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1252 == 10 && this.field1137[var2] == this.field1444) {
                        this.method370(var17, var17.field351 + 15, 333);
                        if (this.field1228 > -1) {
                            this.field1194[7].method173(this.field1229 - var18, true, this.field1228 - 12);
                        }
                    }
                }
                if (var17.field318 != null && (var2 >= this.field1136 || this.field1170 == 0 || this.field1170 == 3 || this.field1170 == 1 && this.method444(((PlayerEntity) var17).field366, true))) {
                    this.method370(var17, var17.field351, 333);
                    if (this.field1228 > -1 && this.field1233 < this.field1234) {
                        this.field1238[this.field1233] = this.field1463.method190(var17.field318, 9) / 2;
                        this.field1237[this.field1233] = this.field1463.field609;
                        this.field1235[this.field1233] = this.field1228;
                        this.field1236[this.field1233] = this.field1229;
                        this.field1239[this.field1233] = var17.field320;
                        this.field1240[this.field1233] = var17.field321;
                        this.field1241[this.field1233] = var17.field319;
                        this.field1242[this.field1233++] = var17.field318;
                        if (this.field1143 == 0 && var17.field321 == 1) {
                            this.field1237[this.field1233] += 10;
                            this.field1236[this.field1233] += 5;
                        }
                        if (this.field1143 == 0 && var17.field321 == 2) {
                            this.field1238[this.field1233] = 60;
                        }
                    }
                }
                if (var17.field324 > field1529 + 100) {
                    this.method370(var17, var17.field351 + 15, 333);
                    if (this.field1228 > -1) {
                        int var21 = var17.field325 * 30 / var17.field326;
                        if (var21 > 30) {
                            var21 = 30;
                        }
                        Pix2D.method149(this.field1228 - 15, var21, 65280, 5, this.field1229 - 3, 5);
                        Pix2D.method149(this.field1228 - 15 + var21, 30 - var21, 16711680, 5, this.field1229 - 3, 5);
                    }
                }
                if (var17.field324 > field1529 + 330) {
                    this.method370(var17, var17.field351 / 2, 333);
                    if (this.field1228 > -1) {
                        this.field1121[var17.field323].method173(this.field1229 - 12, true, this.field1228 - 12);
                        this.field1461.method188(this.field1229 + 4, 2, String.valueOf(var17.field322), this.field1228, 0);
                        this.field1461.method188(this.field1229 + 3, 2, String.valueOf(var17.field322), this.field1228 - 1, 16777215);
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field1233; ++var3) {
            int var4 = this.field1235[var3];
            int var5 = this.field1236[var3];
            int var6 = this.field1238[var3];
            int var7 = this.field1237[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var16 = 0; var16 < var3; ++var16) {
                    if (var5 + 2 > this.field1236[var16] - this.field1237[var16] && var5 - var7 < this.field1236[var16] + 2 && var4 - var6 < this.field1238[var16] + this.field1235[var16] && var4 + var6 > this.field1235[var16] - this.field1238[var16] && this.field1236[var16] - this.field1237[var16] < var5) {
                        var5 = this.field1236[var16] - this.field1237[var16];
                        var8 = true;
                    }
                }
            }
            this.field1228 = this.field1235[var3];
            this.field1229 = this.field1236[var3] = var5;
            String var9 = this.field1242[var3];
            if (this.field1143 == 0) {
                int var10 = 16776960;
                if (this.field1239[var3] < 6) {
                    var10 = this.field1211[this.field1239[var3]];
                }
                if (this.field1239[var3] == 6) {
                    var10 = this.field1219 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1239[var3] == 7) {
                    var10 = this.field1219 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1239[var3] == 8) {
                    var10 = this.field1219 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1239[var3] == 9) {
                    int var11 = 150 - this.field1241[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field1239[var3] == 10) {
                    int var12 = 150 - this.field1241[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field1239[var3] == 11) {
                    int var13 = 150 - this.field1241[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field1240[var3] == 0) {
                    this.field1463.method188(this.field1229 + 1, 2, var9, this.field1228, 0);
                    this.field1463.method188(this.field1229, 2, var9, this.field1228, var10);
                }
                if (this.field1240[var3] == 1) {
                    this.field1463.method192(0, this.field1219, -873, this.field1228, this.field1229 + 1, var9);
                    this.field1463.method192(var10, this.field1219, -873, this.field1228, this.field1229, var9);
                }
                if (this.field1240[var3] == 2) {
                    int var14 = this.field1463.method190(var9, 9);
                    int var15 = (150 - this.field1241[var3]) * (var14 + 100) / 150;
                    Pix2D.method147(this.field1228 - 50, 0, this.field1228 + 50, 334, 0);
                    this.field1463.method191(476, this.field1229 + 1, var9, this.field1228 + 50 - var15, 0);
                    this.field1463.method191(476, this.field1229, var9, this.field1228 + 50 - var15, var10);
                    Pix2D.method146((byte) 0);
                }
            } else {
                this.field1463.method188(this.field1229 + 1, 2, var9, this.field1228, 0);
                this.field1463.method188(this.field1229, 2, var9, this.field1228, 16776960);
            }
        }
        if (arg0 != 22) {
            this.field1270 = this.field1178.method209();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBIII)Z")
    public final boolean method378(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var6 = arg4 >> 14 & 32767;
        int var7 = this.field1192.method81(this.field1545, arg0, arg3, arg4);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method486(var8 + 1, false, 2, this.field1492.field354[0], arg3, this.field1492.field355[0], 107, 0, var9, arg0, 0, 0);
            } else {
                LocType var10 = LocType.method275(var6);
                int var11;
                int var12;
                if (var9 != 0 && var9 != 2) {
                    var11 = var10.field825;
                    var12 = var10.field824;
                } else {
                    var11 = var10.field824;
                    var12 = var10.field825;
                }
                int var13 = var10.field848;
                if (var9 != 0) {
                    var13 = (var13 >> 4 - var9) + (var13 << var9 & 15);
                }
                this.method486(0, false, 2, this.field1492.field354[0], arg3, this.field1492.field355[0], 107, var13, 0, arg0, var12, var11);
            }
            this.field1314 = super.field22;
            this.field1315 = super.field23;
            this.field1317 = 2;
            this.field1316 = 0;
            this.field1195.method198(9, arg2);
            if (arg1 != 96) {
                throw new NullPointerException();
            } else {
                this.field1195.method200(this.field1448 + arg0);
                this.field1195.method200(this.field1449 + arg3);
                this.field1195.method200(var6);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method379(byte arg0) {
        int var2 = this.field1434;
        int var3 = this.field1435;
        int var4 = this.field1436;
        int var5 = this.field1437;
        int var6 = 6116423;
        Pix2D.method149(var2, var4, var6, 5, var3, var5);
        if (arg0 != 5) {
            this.field1270 = this.field1178.method209();
        }
        Pix2D.method149(var2 + 1, var4 - 2, 0, 5, var3 + 1, 16);
        Pix2D.method150(var4 - 2, 0, var2 + 1, var3 + 18, true, var5 - 19);
        this.field1463.method191(476, var3 + 14, "Choose Option", var2 + 3, var6);
        int var7 = super.field19;
        int var8 = super.field20;
        if (this.field1433 == 0) {
            var7 -= 8;
            var8 -= 11;
        }
        if (this.field1433 == 1) {
            var7 -= 562;
            var8 -= 231;
        }
        if (this.field1433 == 2) {
            var7 -= 22;
            var8 -= 375;
        }
        for (int var9 = 0; var9 < this.field1144; ++var9) {
            int var10 = (this.field1144 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field1463.method193(this.field1330[var9], var11, true, var2 + 3, true, var10);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method380(int arg0) {
        SpotAnimEntity var2 = (SpotAnimEntity) this.field1111.method228();
        this.field1269 += arg0;
        while (var2 != null) {
            if (this.field1545 == var2.field415 && !var2.field421) {
                if (field1529 >= var2.field414) {
                    var2.method118(-17320, this.field1445);
                    if (var2.field421) {
                        var2.method107();
                    } else {
                        this.field1192.method61((Model) null, 18197, var2.field418, -1, var2.field417, 0, 60, false, var2.field416, var2, var2.field415);
                    }
                }
            } else {
                var2.method107();
            }
            var2 = (SpotAnimEntity) this.field1111.method230(this.field1162);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method381(boolean arg0) {
        this.field1486 &= arg0;
        if (super.field21 == 1) {
            if (super.field22 >= 8 && super.field22 <= 108 && super.field23 >= 490 && super.field23 <= 522) {
                this.field1170 = (this.field1170 + 1) % 4;
                this.field1297 = true;
                this.field1161 = true;
                this.field1195.method198(9, 197);
                this.field1195.method199(this.field1170);
                this.field1195.method199(this.field1253);
                this.field1195.method199(this.field1354);
            }
            if (super.field22 >= 137 && super.field22 <= 237 && super.field23 >= 490 && super.field23 <= 522) {
                this.field1253 = (this.field1253 + 1) % 3;
                this.field1297 = true;
                this.field1161 = true;
                this.field1195.method198(9, 197);
                this.field1195.method199(this.field1170);
                this.field1195.method199(this.field1253);
                this.field1195.method199(this.field1354);
            }
            if (super.field22 >= 275 && super.field22 <= 375 && super.field23 >= 490 && super.field23 <= 522) {
                this.field1354 = (this.field1354 + 1) % 3;
                this.field1297 = true;
                this.field1161 = true;
                this.field1195.method198(9, 197);
                this.field1195.method199(this.field1170);
                this.field1195.method199(this.field1253);
                this.field1195.method199(this.field1354);
            }
            if (super.field22 >= 416 && super.field22 <= 516 && super.field23 >= 490 && super.field23 <= 522) {
                this.method453(-24081);
                this.field1441 = "";
                this.field1132 = false;
                for (int var2 = 0; var2 < Component.field973.length; ++var2) {
                    if (Component.field973[var2] != null && Component.field973[var2].field982 == 600) {
                        this.field1329 = this.field1290 = Component.field973[var2].field979;
                        break;
                    }
                }
            }
            ++field1370;
            if (field1370 > 195) {
                field1370 = 0;
                this.field1195.method198(9, 24);
                this.field1195.method199(239);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public final void method382(int arg0, int arg1, String arg2, String arg3) {
        if (arg0 == 0 && this.field1202 != -1) {
            this.field1295 = arg3;
            super.field21 = 0;
        }
        if (this.field1455 == -1) {
            this.field1161 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1129[var5] = this.field1129[var5 - 1];
            this.field1130[var5] = this.field1130[var5 - 1];
            this.field1131[var5] = this.field1131[var5 - 1];
        }
        this.field1129[0] = arg0;
        this.field1269 += arg1;
        this.field1130[0] = arg2;
        this.field1131[0] = arg3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method383(int arg0, boolean arg1) {
        if (arg1) {
            this.field1162 = 377;
        }
        if (!field1359) {
            if (Pix3D.field571[17] >= arg0) {
                Pix8 var3 = Pix3D.field565[17];
                int var4 = var3.field594 * var3.field593 - 1;
                int var5 = this.field1445 * var3.field593 * 2;
                byte[] var6 = var3.field591;
                byte[] var7 = this.field1487;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field591 = var7;
                this.field1487 = var6;
                Pix3D.method160(17, false);
            }
            if (Pix3D.field571[24] >= arg0) {
                Pix8 var9 = Pix3D.field565[24];
                int var10 = var9.field594 * var9.field593 - 1;
                int var11 = this.field1445 * var9.field593 * 2;
                byte[] var12 = var9.field591;
                byte[] var13 = this.field1487;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field591 = var13;
                this.field1487 = var12;
                Pix3D.method160(24, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;II)V")
    private final void method384(Packet arg0, int arg1, int arg2) {
        while (true) {
            if (arg0.field624 + 10 < arg1 * 8) {
                int var4 = arg0.method220(11, (byte) 27);
                if (var4 != 2047) {
                    if (this.field1135[var4] == null) {
                        this.field1135[var4] = new PlayerEntity();
                        if (this.field1140[var4] != null) {
                            this.field1135[var4].method113(-176, this.field1140[var4]);
                        }
                    }
                    this.field1137[this.field1136++] = var4;
                    PlayerEntity var5 = this.field1135[var4];
                    var5.field350 = field1529;
                    int var6 = arg0.method220(5, (byte) 27);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg0.method220(5, (byte) 27);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg0.method220(1, (byte) 27);
                    var5.method109(this.field1492.field355[0] + var7, true, var8 == 1, this.field1492.field354[0] + var6);
                    int var9 = arg0.method220(1, (byte) 27);
                    if (var9 == 1) {
                        this.field1139[this.field1138++] = var4;
                    }
                    continue;
                }
            }
            arg0.method221(this.field1220);
            while (arg2 >= 0) {
                this.field1270 = -1;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLkb;I)V")
    private final void method385(boolean arg0, Packet arg1, int arg2) {
        this.field1519 = 0;
        this.field1138 = 0;
        this.method424(arg1, arg2, (byte) 2);
        if (arg0) {
            this.field1195.method199(136);
        }
        this.method398(false, arg1, arg2);
        this.method384(arg1, arg2, -782);
        this.method431(arg1, arg2, this.field1212);
        for (int var4 = 0; var4 < this.field1519; ++var4) {
            int var6 = this.field1520[var4];
            if (field1529 != this.field1135[var6].field350) {
                this.field1135[var6] = null;
            }
        }
        if (arg1.field623 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field623 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1136; ++var5) {
                if (this.field1135[this.field1137[var5]] == null) {
                    signlink.reporterror(this.field1402 + " null entry in pl list - pos:" + var5 + " size:" + this.field1136);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method386(int arg0, int arg1) {
        if (arg0 == 0) {
            if (arg1 >= 0) {
                if (this.field1213) {
                    this.field1213 = false;
                    this.field1161 = true;
                }
                int var3 = this.field1291[arg1];
                int var4 = this.field1292[arg1];
                int var5 = this.field1293[arg1];
                int var6 = this.field1294[arg1];
                if (var5 >= 2000) {
                    var5 -= 2000;
                }
                if (var5 == 316) {
                    String var7 = this.field1330[arg1];
                    int var8 = var7.indexOf("@whi@");
                    if (var8 != -1) {
                        this.method453(-24081);
                        this.field1441 = var7.substring(var8 + 5).trim();
                        this.field1132 = false;
                        for (int var9 = 0; var9 < Component.field973.length; ++var9) {
                            if (Component.field973[var9] != null && Component.field973[var9].field982 == 600) {
                                this.field1329 = this.field1290 = Component.field973[var9].field979;
                                break;
                            }
                        }
                    }
                }
                if (var5 == 48) {
                    PlayerEntity var10 = this.field1135[var6];
                    if (var10 != null) {
                        this.method486(0, false, 2, this.field1492.field354[0], var10.field355[0], this.field1492.field355[0], 107, 0, 0, var10.field354[0], 1, 1);
                        this.field1314 = super.field22;
                        this.field1315 = super.field23;
                        this.field1317 = 2;
                        this.field1316 = 0;
                        this.field1195.method198(9, 39);
                        this.field1195.method200(var6);
                        this.field1195.method200(this.field1503);
                    }
                }
                if (var5 == 1308) {
                    ObjType var11 = ObjType.method287(var6);
                    String var12;
                    if (var11.field898 != null) {
                        var12 = new String(var11.field898);
                    } else {
                        var12 = "It's a " + var11.field897 + ".";
                    }
                    this.method382(0, 0, "", var12);
                }
                if (var5 == 63) {
                    this.field1195.method198(9, 158);
                    this.field1195.method200(var6);
                    this.field1195.method200(var3);
                    this.field1195.method200(var4);
                    this.field1195.method200(this.field1503);
                    this.field1371 = 0;
                    this.field1372 = var4;
                    this.field1373 = var3;
                    this.field1374 = 2;
                    if (Component.field973[var4].field979 == this.field1290) {
                        this.field1374 = 1;
                    }
                    if (Component.field973[var4].field979 == this.field1455) {
                        this.field1374 = 3;
                    }
                }
                if (var5 == 1814) {
                    NpcEntity var13 = this.field1208[var6];
                    if (var13 != null) {
                        String var14;
                        if (var13.field360.field864 != null) {
                            var14 = new String(var13.field360.field864);
                        } else {
                            var14 = "It's a " + var13.field360.field863 + ".";
                        }
                        this.method382(0, 0, "", var14);
                    }
                }
                if (var5 == 706) {
                    Component var15 = Component.field973[var4];
                    boolean var16 = true;
                    if (var15.field982 > 0) {
                        var16 = this.method374(var15, 0);
                    }
                    if (var16) {
                        this.field1195.method198(9, 222);
                        this.field1195.method200(var4);
                    }
                }
                if (var5 == 1659) {
                    this.method378(var3, (byte) 96, 181, var4, var6);
                }
                if (var5 == 104) {
                    this.method378(var3, (byte) 96, 168, var4, var6);
                }
                if (var5 == 73 && !this.field1365) {
                    this.field1195.method198(9, 218);
                    this.field1195.method200(var4);
                    this.field1365 = true;
                }
                if (var5 == 988 || var5 == 345 || var5 == 249 || var5 == 960 || var5 == 40) {
                    NpcEntity var17 = this.field1208[var6];
                    if (var17 != null) {
                        this.method486(0, false, 2, this.field1492.field354[0], var17.field355[0], this.field1492.field355[0], 107, 0, 0, var17.field354[0], 1, 1);
                        this.field1314 = super.field22;
                        this.field1315 = super.field23;
                        this.field1317 = 2;
                        this.field1316 = 0;
                        if (var5 == 960) {
                            this.field1195.method198(9, 114);
                        }
                        if (var5 == 345) {
                            field1266 += var6;
                            if (field1266 >= 116) {
                                this.field1195.method198(9, 217);
                            }
                            this.field1195.method198(9, 191);
                        }
                        if (var5 == 249) {
                            this.field1195.method198(9, 89);
                        }
                        if (var5 == 40) {
                            this.field1195.method198(9, 198);
                        }
                        if (var5 == 988) {
                            this.field1195.method198(9, 236);
                        }
                        this.field1195.method200(var6);
                    }
                }
                if (var5 == 1418) {
                    int var18 = var6 >> 14 & 32767;
                    LocType var19 = LocType.method275(var18);
                    String var20;
                    if (var19.field821 != null) {
                        var20 = new String(var19.field821);
                    } else {
                        var20 = "It's a " + var19.field820 + ".";
                    }
                    this.method382(0, 0, "", var20);
                }
                if (var5 == 500) {
                    NpcEntity var21 = this.field1208[var6];
                    if (var21 != null) {
                        this.method486(0, false, 2, this.field1492.field354[0], var21.field355[0], this.field1492.field355[0], 107, 0, 0, var21.field354[0], 1, 1);
                        this.field1314 = super.field22;
                        this.field1315 = super.field23;
                        this.field1317 = 2;
                        this.field1316 = 0;
                        this.field1195.method198(9, 244);
                        this.field1195.method200(var6);
                        this.field1195.method200(this.field1503);
                    }
                }
                if (var5 == 967) {
                    this.field1195.method198(9, 222);
                    this.field1195.method200(var4);
                    Component var22 = Component.field973[var4];
                    if (var22.field987 != null && var22.field987[0][0] == 5) {
                        int var23 = var22.field987[0][1];
                        this.field1196[var23] = 1 - this.field1196[var23];
                        this.method487(0, var23);
                        this.field1197 = true;
                    }
                }
                if (var5 == 941) {
                    Component var24 = Component.field973[var4];
                    this.field1502 = 1;
                    this.field1503 = var4;
                    this.field1504 = var24.field1028;
                    this.field1246 = 0;
                    String var25 = var24.field1026;
                    if (var25.indexOf(" ") != -1) {
                        var25 = var25.substring(0, var25.indexOf(" "));
                    }
                    String var26 = var24.field1026;
                    if (var26.indexOf(" ") != -1) {
                        var26 = var26.substring(var26.indexOf(" ") + 1);
                    }
                    this.field1505 = var25 + " " + var24.field1027 + " " + var26;
                    if (this.field1504 == 16) {
                        this.field1197 = true;
                        this.field1251 = 3;
                        this.field1152 = true;
                    }
                } else {
                    if (var5 == 543) {
                        boolean var27 = this.method486(0, false, 2, this.field1492.field354[0], var4, this.field1492.field355[0], 107, 0, 0, var3, 0, 0);
                        if (!var27) {
                            this.method486(0, false, 2, this.field1492.field354[0], var4, this.field1492.field355[0], 107, 0, 0, var3, 1, 1);
                        }
                        this.field1314 = super.field22;
                        this.field1315 = super.field23;
                        this.field1317 = 2;
                        this.field1316 = 0;
                        this.field1195.method198(9, 241);
                        this.field1195.method200(this.field1448 + var3);
                        this.field1195.method200(this.field1449 + var4);
                        this.field1195.method200(var6);
                        this.field1195.method200(this.field1503);
                    }
                    if (var5 == 1974) {
                        ObjType var29 = ObjType.method287(var6);
                        String var30;
                        if (var4 >= 100000) {
                            var30 = var4 + " x " + var29.field897;
                        } else if (var29.field898 != null) {
                            var30 = new String(var29.field898);
                        } else {
                            var30 = "It's a " + var29.field897 + ".";
                        }
                        this.method382(0, 0, "", var30);
                    }
                    if (var5 == 829) {
                        field1275 += var4;
                        if (field1275 >= 132) {
                            this.field1195.method198(9, 27);
                            this.field1195.method200(17379);
                        }
                        this.method378(var3, (byte) 96, 223, var4, var6);
                    }
                    if (var5 == 103) {
                        PlayerEntity var31 = this.field1135[var6];
                        if (var31 != null) {
                            this.method486(0, false, 2, this.field1492.field354[0], var31.field355[0], this.field1492.field355[0], 107, 0, 0, var31.field354[0], 1, 1);
                            this.field1314 = super.field22;
                            this.field1315 = super.field23;
                            this.field1317 = 2;
                            this.field1316 = 0;
                            this.field1195.method198(9, 184);
                            this.field1195.method200(var6);
                            this.field1195.method200(this.field1249);
                            this.field1195.method200(this.field1247);
                            this.field1195.method200(this.field1248);
                        }
                    }
                    if (var5 == 672) {
                        this.field1195.method198(9, 222);
                        this.field1195.method200(var4);
                        Component var32 = Component.field973[var4];
                        if (var32.field987 != null && var32.field987[0][0] == 5) {
                            int var33 = var32.field987[0][1];
                            if (this.field1196[var33] != var32.field989[0]) {
                                this.field1196[var33] = var32.field989[0];
                                this.method487(0, var33);
                                this.field1197 = true;
                            }
                        }
                    }
                    if (var5 == 357) {
                        this.field1246 = 1;
                        this.field1247 = var3;
                        this.field1248 = var4;
                        this.field1249 = var6;
                        this.field1250 = ObjType.method287(var6).field897;
                        this.field1502 = 0;
                    } else {
                        if (var5 == 237) {
                            this.field1195.method198(9, 106);
                            this.field1195.method200(var6);
                            this.field1195.method200(var3);
                            this.field1195.method200(var4);
                            this.field1195.method200(this.field1249);
                            this.field1195.method200(this.field1247);
                            this.field1195.method200(this.field1248);
                            this.field1371 = 0;
                            this.field1372 = var4;
                            this.field1373 = var3;
                            this.field1374 = 2;
                            if (Component.field973[var4].field979 == this.field1290) {
                                this.field1374 = 1;
                            }
                            if (Component.field973[var4].field979 == this.field1455) {
                                this.field1374 = 3;
                            }
                        }
                        if (var5 == 871 || var5 == 526 || var5 == 156 || var5 == 120 || var5 == 796) {
                            if (var5 == 796) {
                                if ((var6 & 3) == 0) {
                                    ++field1465;
                                }
                                if (field1465 >= 124) {
                                    this.field1195.method198(9, 167);
                                    this.field1195.method203(0);
                                }
                                this.field1195.method198(9, 122);
                            }
                            if (var5 == 526) {
                                this.field1195.method198(9, 0);
                            }
                            if (var5 == 120) {
                                this.field1195.method198(9, 112);
                            }
                            if (var5 == 871) {
                                field1118 += var6;
                                if (field1118 >= 76) {
                                    this.field1195.method198(9, 214);
                                    this.field1195.method199(171);
                                }
                                this.field1195.method198(9, 140);
                            }
                            if (var5 == 156) {
                                ++field1546;
                                if (field1546 >= 62) {
                                    this.field1195.method198(9, 82);
                                    this.field1195.method199(142);
                                }
                                this.field1195.method198(9, 155);
                            }
                            this.field1195.method200(var6);
                            this.field1195.method200(var3);
                            this.field1195.method200(var4);
                            this.field1371 = 0;
                            this.field1372 = var4;
                            this.field1373 = var3;
                            this.field1374 = 2;
                            if (Component.field973[var4].field979 == this.field1290) {
                                this.field1374 = 1;
                            }
                            if (Component.field973[var4].field979 == this.field1455) {
                                this.field1374 = 3;
                            }
                        }
                        if (var5 == 595 || var5 == 835) {
                            String var34 = this.field1330[arg1];
                            int var35 = var34.indexOf("@whi@");
                            if (var35 != -1) {
                                String var36 = var34.substring(var35 + 5).trim();
                                String var37 = JString.method255(JString.method252(JString.method251(var36), (byte) -74), true);
                                boolean var38 = false;
                                for (int var39 = 0; var39 < this.field1136; ++var39) {
                                    PlayerEntity var40 = this.field1135[this.field1137[var39]];
                                    if (var40 != null && var40.field366 != null && var40.field366.equalsIgnoreCase(var37)) {
                                        this.method486(0, false, 2, this.field1492.field354[0], var40.field355[0], this.field1492.field355[0], 107, 0, 0, var40.field354[0], 1, 1);
                                        if (var5 == 595) {
                                            this.field1195.method198(9, 245);
                                        }
                                        if (var5 == 835) {
                                            this.field1195.method198(9, 173);
                                        }
                                        this.field1195.method200(this.field1137[var39]);
                                        var38 = true;
                                        break;
                                    }
                                }
                                if (!var38) {
                                    this.method382(0, 0, "", "Unable to find " + var37);
                                }
                            }
                        }
                        if (var5 == 309) {
                            this.method453(-24081);
                        }
                        if (var5 == 447 || var5 == 158 || var5 == 804 || var5 == 521) {
                            String var41 = this.field1330[arg1];
                            int var42 = var41.indexOf("@whi@");
                            if (var42 != -1) {
                                long var43 = JString.method251(var41.substring(var42 + 5).trim());
                                if (var5 == 447) {
                                    this.method412(-980, var43);
                                }
                                if (var5 == 158) {
                                    this.method456(0, var43);
                                }
                                if (var5 == 804) {
                                    this.method417(0, var43);
                                }
                                if (var5 == 521) {
                                    this.method461(var43, this.field1452);
                                }
                            }
                        }
                        if (var5 == 737 && this.method378(var3, (byte) 96, 9, var4, var6)) {
                            this.field1195.method200(this.field1503);
                        }
                        if (var5 == 798) {
                            ++field1167;
                            if (field1167 >= 135) {
                                this.field1195.method198(9, 253);
                                this.field1195.method200(10151);
                            }
                            this.method378(var3, (byte) 96, 207, var4, var6);
                        }
                        if (var5 == 493) {
                            NpcEntity var45 = this.field1208[var6];
                            if (var45 != null) {
                                this.method486(0, false, 2, this.field1492.field354[0], var45.field355[0], this.field1492.field355[0], 107, 0, 0, var45.field354[0], 1, 1);
                                this.field1314 = super.field22;
                                this.field1315 = super.field23;
                                this.field1317 = 2;
                                this.field1316 = 0;
                                this.field1195.method198(9, 36);
                                this.field1195.method200(var6);
                                this.field1195.method200(this.field1249);
                                this.field1195.method200(this.field1247);
                                this.field1195.method200(this.field1248);
                            }
                        }
                        if (var5 == 203) {
                            boolean var46 = this.method486(0, false, 2, this.field1492.field354[0], var4, this.field1492.field355[0], 107, 0, 0, var3, 0, 0);
                            if (!var46) {
                                this.method486(0, false, 2, this.field1492.field354[0], var4, this.field1492.field355[0], 107, 0, 0, var3, 1, 1);
                            }
                            this.field1314 = super.field22;
                            this.field1315 = super.field23;
                            this.field1317 = 2;
                            this.field1316 = 0;
                            this.field1195.method198(9, 183);
                            this.field1195.method200(this.field1448 + var3);
                            this.field1195.method200(this.field1449 + var4);
                            this.field1195.method200(var6);
                            this.field1195.method200(this.field1249);
                            this.field1195.method200(this.field1247);
                            this.field1195.method200(this.field1248);
                        }
                        if (var5 == 873) {
                            this.method378(var3, (byte) 96, 196, var4, var6);
                        }
                        if (var5 == 981) {
                            if (!this.field1381) {
                                this.field1192.method89(super.field22 - 8, super.field23 - 11, 19079);
                            } else {
                                this.field1192.method89(var3 - 8, var4 - 11, 19079);
                            }
                        }
                        if (var5 == 1528 || var5 == 1741 || var5 == 593 || var5 == 1596) {
                            PlayerEntity var48 = this.field1135[var6];
                            if (var48 != null) {
                                this.method486(0, false, 2, this.field1492.field354[0], var48.field355[0], this.field1492.field355[0], 107, 0, 0, var48.field354[0], 1, 1);
                                this.field1314 = super.field22;
                                this.field1315 = super.field23;
                                this.field1317 = 2;
                                this.field1316 = 0;
                                if (var5 == 1596) {
                                    this.field1195.method198(9, 173);
                                }
                                if (var5 == 1741) {
                                    if ((var6 & 3) == 0) {
                                        ++field1386;
                                    }
                                    if (field1386 >= 139) {
                                        this.field1195.method198(9, 84);
                                        this.field1195.method203(0);
                                    }
                                    this.field1195.method198(9, 63);
                                }
                                if (var5 == 1528) {
                                    this.field1195.method198(9, 245);
                                }
                                if (var5 == 593) {
                                    this.field1195.method198(9, 28);
                                }
                                this.field1195.method200(var6);
                            }
                        }
                        if (var5 == 134 || var5 == 701 || var5 == 570 || var5 == 719 || var5 == 440) {
                            if (var5 == 134) {
                                this.field1195.method198(9, 90);
                            }
                            if (var5 == 701) {
                                this.field1195.method198(9, 47);
                            }
                            if (var5 == 719) {
                                this.field1195.method198(9, 186);
                            }
                            if (var5 == 570) {
                                this.field1195.method198(9, 121);
                            }
                            if (var5 == 440) {
                                this.field1195.method198(9, 31);
                            }
                            this.field1195.method200(var6);
                            this.field1195.method200(var3);
                            this.field1195.method200(var4);
                            this.field1371 = 0;
                            this.field1372 = var4;
                            this.field1373 = var3;
                            this.field1374 = 2;
                            if (Component.field973[var4].field979 == this.field1290) {
                                this.field1374 = 1;
                            }
                            if (Component.field973[var4].field979 == this.field1455) {
                                this.field1374 = 3;
                            }
                        }
                        if (var5 == 125) {
                            String var49 = this.field1330[arg1];
                            int var50 = var49.indexOf("@whi@");
                            if (var50 != -1) {
                                long var51 = JString.method251(var49.substring(var50 + 5).trim());
                                int var53 = -1;
                                for (int var54 = 0; var54 < this.field1395; ++var54) {
                                    if (this.field1539[var54] == var51) {
                                        var53 = var54;
                                        break;
                                    }
                                }
                                if (var53 != -1 && this.field1389[var53] > 0) {
                                    this.field1161 = true;
                                    this.field1213 = false;
                                    this.field1398 = true;
                                    this.field1364 = "";
                                    this.field1123 = 3;
                                    this.field1453 = this.field1539[var53];
                                    this.field1362 = "Enter message to send to " + this.field1283[var53];
                                }
                            }
                        }
                        if (var5 == 505 && this.method378(var3, (byte) 96, 139, var4, var6)) {
                            this.field1195.method200(this.field1249);
                            this.field1195.method200(this.field1247);
                            this.field1195.method200(this.field1248);
                        }
                        if (var5 == 56 || var5 == 321 || var5 == 552 || var5 == 43 || var5 == 687) {
                            boolean var55 = this.method486(0, false, 2, this.field1492.field354[0], var4, this.field1492.field355[0], 107, 0, 0, var3, 0, 0);
                            if (!var55) {
                                this.method486(0, false, 2, this.field1492.field354[0], var4, this.field1492.field355[0], 107, 0, 0, var3, 1, 1);
                            }
                            this.field1314 = super.field22;
                            this.field1315 = super.field23;
                            this.field1317 = 2;
                            this.field1316 = 0;
                            if (var5 == 43) {
                                this.field1195.method198(9, 143);
                            }
                            if (var5 == 552) {
                                this.field1195.method198(9, 226);
                            }
                            if (var5 == 687) {
                                ++field1419;
                                if (field1419 >= 121) {
                                    this.field1195.method198(9, 13);
                                    this.field1195.method199(128);
                                }
                                this.field1195.method198(9, 192);
                            }
                            if (var5 == 321) {
                                this.field1195.method198(9, 48);
                            }
                            if (var5 == 56) {
                                this.field1195.method198(9, 91);
                            }
                            this.field1195.method200(this.field1448 + var3);
                            this.field1195.method200(this.field1449 + var4);
                            this.field1195.method200(var6);
                        }
                        this.field1246 = 0;
                        this.field1502 = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method387(byte arg0) {
        if (arg0 == 1) {
            this.field1340 = false;
            while (this.field1443) {
                try {
                    Thread.sleep(50L);
                } catch (Exception var16) {
                }
                Object var2 = this.field1173;
                String var3;
                int var4;
                int var5;
                synchronized (this.field1173) {
                    var3 = this.field1506;
                    var4 = this.field1268;
                    var5 = this.field1328;
                    this.field1506 = null;
                    this.field1268 = 0;
                    this.field1328 = 0;
                }
                if (var3 != null) {
                    byte[] var6 = signlink.cacheload(var3 + ".mid");
                    if (var6 != null && var4 != 12345678) {
                        this.field1286.reset();
                        this.field1286.update(var6);
                        int var7 = (int) this.field1286.getValue();
                        if (var4 != var7) {
                            var6 = null;
                        }
                    }
                    if (var6 == null) {
                        try {
                            DataInputStream var8 = this.method469(var3 + "_" + var4 + ".mid");
                            var6 = new byte[var5];
                            int var10;
                            for (int var9 = 0; var9 < var5; var9 += var10) {
                                var10 = var8.read(var6, var9, var5 - var9);
                                if (var10 == -1) {
                                    byte[] var11 = new byte[var9];
                                    for (int var12 = 0; var12 < var9; ++var12) {
                                        var11[var12] = var6[var12];
                                    }
                                    var6 = var11;
                                    var5 = var9;
                                    break;
                                }
                            }
                            var8.close();
                            signlink.cachesave(var3 + ".mid", var6);
                        } catch (Exception var17) {
                        }
                    }
                    if (var6 == null) {
                        return;
                    }
                    int var13 = (new Packet(var6, 0)).method214();
                    byte[] var14 = new byte[var13];
                    BZip2.method238(var14, var13, var6, var5, 4);
                    this.method366(var13, 1, var14, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method388(boolean arg0) {
        int var2 = this.field1492.field306 + this.field1174;
        int var3 = this.field1492.field307 + this.field1430;
        if (this.field1158 - var2 < -500 || this.field1158 - var2 > 500 || this.field1159 - var3 < -500 || this.field1159 - var3 > 500) {
            this.field1158 = var2;
            this.field1159 = var3;
        }
        if (this.field1158 != var2) {
            this.field1158 += (var2 - this.field1158) / 16;
        }
        if (this.field1159 != var3) {
            this.field1159 += (var3 - this.field1159) / 16;
        }
        if (super.field24[1] == 1) {
            this.field1497 += (-24 - this.field1497) / 2;
        } else if (super.field24[2] == 1) {
            this.field1497 += (24 - this.field1497) / 2;
        } else {
            this.field1497 /= 2;
        }
        if (super.field24[3] == 1) {
            this.field1498 += (12 - this.field1498) / 2;
        } else if (super.field24[4] == 1) {
            this.field1498 += (-12 - this.field1498) / 2;
        } else {
            this.field1498 /= 2;
        }
        this.field1496 = this.field1497 / 2 + this.field1496 & 2047;
        this.field1495 += this.field1498 / 2;
        if (this.field1495 < 128) {
            this.field1495 = 128;
        }
        if (this.field1495 > 383) {
            this.field1495 = 383;
        }
        int var4 = this.field1158 >> 7;
        int var5 = this.field1159 >> 7;
        if (!arg0) {
            this.field1388 = this.field1124.method246();
        }
        int var6 = this.method420(this.field1158, this.field1221, this.field1159, this.field1545);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    int var10 = this.field1545;
                    if (var10 < 3 && (this.field1323[1][var8][var9] & 2) == 2) {
                        ++var10;
                    }
                    int var11 = var6 - this.field1163[var10][var8][var9];
                    if (var11 > var7) {
                        var7 = var11;
                    }
                }
            }
        }
        ++field1232;
        if (field1232 > 77) {
            field1232 = 0;
            this.field1195.method198(9, 57);
        }
        int var12 = var7 * 192;
        if (var12 > 98048) {
            var12 = 98048;
        }
        if (var12 < 32768) {
            var12 = 32768;
        }
        if (var12 > this.field1127) {
            this.field1127 += (var12 - this.field1127) / 24;
        } else if (var12 < this.field1127) {
            this.field1127 += (var12 - this.field1127) / 80;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method389(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method8(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1396 != null) {
                this.field1396.method29();
            }
        } catch (Exception var2) {
        }
        this.field1396 = null;
        this.method470((byte) -57);
        this.field1443 = false;
        this.field1195 = null;
        this.field1361 = null;
        this.field1178 = null;
        this.field1215 = null;
        this.field1150 = null;
        this.field1483 = null;
        this.field1163 = null;
        this.field1323 = null;
        this.field1192 = null;
        this.field1501 = null;
        this.field1264 = null;
        this.field1146 = null;
        this.field1541 = null;
        this.field1542 = null;
        this.field1487 = null;
        this.field1488 = null;
        this.field1489 = null;
        this.field1490 = null;
        this.field1491 = null;
        this.field1378 = null;
        this.field1379 = null;
        this.field1380 = null;
        this.field1300 = null;
        this.field1301 = null;
        this.field1302 = null;
        this.field1303 = null;
        this.field1304 = null;
        this.field1305 = null;
        this.field1306 = null;
        this.field1307 = null;
        this.field1308 = null;
        this.field1309 = null;
        this.field1223 = null;
        this.field1224 = null;
        this.field1225 = null;
        this.field1179 = null;
        this.field1180 = null;
        this.field1181 = null;
        this.field1276 = null;
        this.field1473 = null;
        this.field1474 = null;
        this.field1475 = null;
        this.field1476 = null;
        this.field1477 = null;
        this.field1182 = null;
        this.field1183 = null;
        this.field1184 = null;
        this.field1185 = null;
        this.field1186 = null;
        this.field1279 = null;
        this.field1121 = null;
        this.field1194 = null;
        this.field1147 = null;
        this.field1413 = null;
        this.field1414 = null;
        this.field1415 = null;
        this.field1416 = null;
        this.field1382 = null;
        this.field1341 = null;
        this.field1214 = null;
        this.field1135 = null;
        this.field1137 = null;
        this.field1139 = null;
        this.field1140 = null;
        this.field1520 = null;
        this.field1208 = null;
        this.field1210 = null;
        this.field1447 = null;
        this.field1113 = null;
        this.field1169 = null;
        this.field1425 = null;
        this.field1111 = null;
        this.field1535 = null;
        this.field1291 = null;
        this.field1292 = null;
        this.field1293 = null;
        this.field1294 = null;
        this.field1330 = null;
        this.field1196 = null;
        this.field1156 = null;
        this.field1157 = null;
        this.field1446 = null;
        this.field1423 = null;
        this.field1269 += arg0;
        this.field1283 = null;
        this.field1539 = null;
        this.field1389 = null;
        this.field1512 = null;
        this.field1513 = null;
        this.field1509 = null;
        this.field1510 = null;
        this.field1511 = null;
        this.field1514 = null;
        this.field1515 = null;
        this.field1516 = null;
        this.field1517 = null;
        this.method365((byte) 9);
        LocType.method274(this.field1255);
        NpcType.method280(this.field1255);
        ObjType.method286(this.field1255);
        FloType.field948 = null;
        IdkType.field963 = null;
        Component.field973 = null;
        UnkType.field1034 = null;
        SeqType.field1043 = null;
        SpotAnimType.field1061 = null;
        SpotAnimType.field1073 = null;
        VarpType.field1078 = null;
        super.field13 = null;
        PlayerEntity.field386 = null;
        Pix3D.method153(this.field1255);
        World3D.method49(this.field1255);
        Model.method120(this.field1255);
        AnimBase.field83 = null;
        AnimFrame.field89 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method390(int arg0) {
        if (this.field1207 > 1) {
            --this.field1207;
        }
        if (this.field1273 > 0) {
            --this.field1273;
        }
        for (int var2 = 0; var2 < 5 && this.method423(-50); ++var2) {
        }
        if (this.field1486) {
            int var10002;
            for (int var3 = 0; var3 < this.field1201; ++var3) {
                if (this.field1391[var3] <= 0) {
                    boolean var4 = false;
                    try {
                        if (this.field1440[var3] == this.field1265 && this.field1245[var3] == this.field1142) {
                            if (!this.method406(this.field1397)) {
                                var4 = true;
                            }
                        } else {
                            Packet var5 = Wave.method264(this.field1440[var3], (byte) 119, this.field1245[var3]);
                            if (System.currentTimeMillis() + (long) (var5.field623 / 22) > (long) (this.field1227 / 22) + this.field1325) {
                                this.field1227 = var5.field623;
                                this.field1325 = System.currentTimeMillis();
                                if (this.method405(2, var5.field622, var5.field623)) {
                                    this.field1265 = this.field1440[var3];
                                    this.field1142 = this.field1245[var3];
                                } else {
                                    var4 = true;
                                }
                            }
                        }
                    } catch (Exception var21) {
                    }
                    if (var4 && this.field1391[var3] != -5) {
                        this.field1391[var3] = -5;
                    } else {
                        --this.field1201;
                        for (int var7 = var3; var7 < this.field1201; ++var7) {
                            this.field1440[var7] = this.field1440[var7 + 1];
                            this.field1245[var7] = this.field1245[var7 + 1];
                            this.field1391[var7] = this.field1391[var7 + 1];
                        }
                        --var3;
                    }
                } else {
                    var10002 = this.field1391[var3]--;
                }
            }
            if (this.field1363 > 0) {
                this.field1363 -= 20;
                if (this.field1363 < 0) {
                    this.field1363 = 0;
                }
                if (this.field1363 == 0 && this.field1351 && !field1359) {
                    this.method459(this.field1284, this.field1521, 43166, this.field1424);
                }
            }
            if (InputTracking.field74) {
                Packet var8 = InputTracking.method36(true);
                if (var8 != null) {
                    this.field1195.method198(9, 53);
                    this.field1195.method200(var8.field623);
                    this.field1195.method207(var8.field622, var8.field623, 0, 43539);
                    var8.method197(-10196);
                }
            }
            ++this.field1271;
            if (arg0 == -30820) {
                if (this.field1271 > 750) {
                    this.method410(366);
                }
                this.method432(true);
                this.method472(-45891);
                this.method429((byte) 5);
                this.method460((byte) -96);
                if ((super.field24[1] == 1 || super.field24[2] == 1 || super.field24[3] == 1 || super.field24[4] == 1) && this.field1160++ > 5) {
                    this.field1160 = 0;
                    this.field1195.method198(9, 109);
                    this.field1195.method200(this.field1495);
                    this.field1195.method200(this.field1496);
                    this.field1195.method199(this.field1287);
                    this.field1195.method199(this.field1187);
                }
                ++this.field1445;
                if (this.field1317 != 0) {
                    this.field1316 += 20;
                    if (this.field1316 >= 400) {
                        this.field1317 = 0;
                    }
                }
                if (this.field1374 != 0) {
                    ++this.field1371;
                    if (this.field1371 >= 15) {
                        if (this.field1374 == 2) {
                            this.field1197 = true;
                        }
                        if (this.field1374 == 3) {
                            this.field1161 = true;
                        }
                        this.field1374 = 0;
                    }
                }
                if (this.field1407 != 0) {
                    ++this.field1348;
                    if (super.field19 > this.field1408 + 5 || super.field19 < this.field1408 - 5 || super.field20 > this.field1409 + 5 || super.field20 < this.field1409 - 5) {
                        this.field1404 = true;
                    }
                    if (super.field18 == 0) {
                        if (this.field1407 == 2) {
                            this.field1197 = true;
                        }
                        if (this.field1407 == 3) {
                            this.field1161 = true;
                        }
                        this.field1407 = 0;
                        if (this.field1404 && this.field1348 >= 5) {
                            this.field1116 = -1;
                            this.method369(9);
                            if (this.field1405 == this.field1116 && this.field1406 != this.field1115) {
                                Component var9 = Component.field973[this.field1405];
                                int var10 = var9.field974[this.field1115];
                                var9.field974[this.field1115] = var9.field974[this.field1406];
                                var9.field974[this.field1406] = var10;
                                int var11 = var9.field975[this.field1115];
                                var9.field975[this.field1115] = var9.field975[this.field1406];
                                var9.field975[this.field1406] = var11;
                                this.field1195.method198(9, 80);
                                this.field1195.method200(this.field1405);
                                this.field1195.method200(this.field1406);
                                this.field1195.method200(this.field1115);
                            }
                        } else if ((this.field1299 == 1 || this.method425(true, this.field1144 - 1)) && this.field1144 > 2) {
                            this.method481(9);
                        } else if (this.field1144 > 0) {
                            this.method386(0, this.field1144 - 1);
                        }
                        this.field1371 = 10;
                        super.field21 = 0;
                    }
                }
                if (World3D.field258 != -1) {
                    int var12 = World3D.field258;
                    int var13 = World3D.field259;
                    boolean var14 = this.method486(0, true, 0, this.field1492.field354[0], var13, this.field1492.field355[0], 107, 0, 0, var12, 0, 0);
                    World3D.field258 = -1;
                    if (var14) {
                        this.field1314 = super.field22;
                        this.field1315 = super.field23;
                        this.field1317 = 1;
                        this.field1316 = 0;
                    }
                }
                if (super.field21 == 1 && this.field1295 != null) {
                    this.field1295 = null;
                    this.field1161 = true;
                    super.field21 = 0;
                }
                this.method426(-715);
                this.method414(false);
                this.method443(0);
                this.method381(true);
                if (super.field18 == 1 || super.field21 == 1) {
                    ++this.field1393;
                }
                if (this.field1226 == 2) {
                    this.method388(true);
                }
                if (this.field1226 == 2 && this.field1360) {
                    this.method441(15537);
                }
                for (int var15 = 0; var15 < 5; ++var15) {
                    var10002 = this.field1494[var15]++;
                }
                this.method488(1);
                ++field1459;
                if (field1459 > 54) {
                    field1459 = 0;
                    this.field1195.method198(9, 180);
                }
                ++super.field17;
                if (super.field17 > 4500) {
                    this.field1273 = 250;
                    super.field17 -= 500;
                    this.field1195.method198(9, 161);
                }
                ++this.field1216;
                if (this.field1216 > 500) {
                    this.field1216 = 0;
                    int var16 = (int) (Math.random() * 8.0D);
                    if ((var16 & 1) == 1) {
                        this.field1174 += this.field1175;
                    }
                    if ((var16 & 2) == 2) {
                        this.field1430 += this.field1431;
                    }
                    if ((var16 & 4) == 4) {
                        this.field1281 += this.field1282;
                    }
                }
                if (this.field1174 < -50) {
                    this.field1175 = 2;
                }
                if (this.field1174 > 50) {
                    this.field1175 = -2;
                }
                if (this.field1430 < -55) {
                    this.field1431 = 2;
                }
                if (this.field1430 > 55) {
                    this.field1431 = -2;
                }
                if (this.field1281 < -40) {
                    this.field1282 = 1;
                }
                if (this.field1281 > 40) {
                    this.field1282 = -1;
                }
                ++this.field1484;
                if (this.field1484 > 500) {
                    this.field1484 = 0;
                    int var17 = (int) (Math.random() * 8.0D);
                    if ((var17 & 1) == 1) {
                        this.field1287 += this.field1288;
                    }
                    if ((var17 & 2) == 2) {
                        this.field1187 += this.field1188;
                    }
                }
                if (this.field1287 < -60) {
                    this.field1288 = 2;
                }
                if (this.field1287 > 60) {
                    this.field1288 = -2;
                }
                if (this.field1187 < -20) {
                    this.field1188 = 1;
                }
                if (this.field1187 > 10) {
                    this.field1188 = -1;
                }
                ++this.field1272;
                if (this.field1272 > 50) {
                    this.field1195.method198(9, 126);
                }
                try {
                    if (this.field1396 != null && this.field1195.field623 > 0) {
                        this.field1396.method33(0, this.field1195.field622, this.field1195.field623, this.field1522);
                        this.field1195.field623 = 0;
                        this.field1272 = 0;
                    }
                } catch (IOException var19) {
                    this.method410(366);
                } catch (Exception var20) {
                    this.method465((byte) 117);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method391(int arg0) {
        this.field1488.method235(0);
        Pix3D.field563 = this.field1165;
        int var2 = 78 / arg0;
        this.field1223.method186(0, true, 0);
        if (this.field1339 != -1) {
            this.method434(Component.field973[this.field1339], 0, 0, 0, 0);
        } else if (this.field1277[this.field1251] != -1) {
            this.method434(Component.field973[this.field1277[this.field1251]], 0, 0, 0, 0);
        }
        if (this.field1381 && this.field1433 == 1) {
            this.method379((byte) 5);
        }
        this.field1488.method236(231, 562, -715, super.field12);
        this.field1490.method235(0);
        Pix3D.field563 = this.field1166;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIB)V")
    public final void method392(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        this.field1190.method186(arg3, true, arg4);
        this.field1191.method186(arg1 + arg3 - 16, true, arg4);
        Pix2D.method149(arg4, 16, this.field1278, 5, arg3 + 16, arg1 - 32);
        int var7 = (arg1 - 32) * arg1 / arg0;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg1 - 32 - var7) * arg2 / (arg0 - arg1);
        Pix2D.method149(arg4, 16, this.field1410, 5, arg3 + 16 + var8, var7);
        if (arg5 == -99) {
            Pix2D.method152(-458, this.field1172, arg3 + 16 + var8, var7, arg4);
            Pix2D.method152(-458, this.field1172, arg3 + 16 + var8, var7, arg4 + 1);
            Pix2D.method151(16, arg3 + 16 + var8, this.field1350, arg4, this.field1172);
            Pix2D.method151(16, arg3 + 17 + var8, this.field1350, arg4, this.field1172);
            Pix2D.method152(-458, this.field1311, arg3 + 16 + var8, var7, arg4 + 15);
            Pix2D.method152(-458, this.field1311, arg3 + 17 + var8, var7 - 1, arg4 + 14);
            Pix2D.method151(16, arg3 + 15 + var8 + var7, this.field1350, arg4, this.field1311);
            Pix2D.method151(15, arg3 + 14 + var8 + var7, this.field1350, arg4 + 1, this.field1311);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public static final void method393(int arg0) {
        if (arg0 != 0) {
            field1122 = 417;
        }
        World3D.field224 = true;
        Pix3D.field552 = true;
        field1359 = true;
        World.field36 = true;
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method394(byte arg0) {
        this.field1489.method235(0);
        int var2 = this.field1496 + this.field1287 & 2047;
        int var3 = this.field1492.field306 / 32 + 48;
        int var4 = 464 - this.field1492.field307 / 32;
        this.field1423.method179(this.field1438, 151, this.field1187 + 256, var4, 9, var3, 21, this.field1114, 0, var2, 146);
        this.field1279.method179(this.field1417, 33, 256, 25, 0, 25, 0, this.field1439, 0, this.field1496, 33);
        if (arg0 != 7) {
            this.field1298 = !this.field1298;
        }
        for (int var5 = 0; var5 < this.field1155; ++var5) {
            int var25 = this.field1156[var5] * 4 + 2 - this.field1492.field306 / 32;
            int var26 = this.field1157[var5] * 4 + 2 - this.field1492.field307 / 32;
            this.method363(44453, var26, var25, this.field1446[var5]);
        }
        for (int var6 = 0; var6 < 104; ++var6) {
            for (int var21 = 0; var21 < 104; ++var21) {
                LinkList var22 = this.field1447[this.field1545][var6][var21];
                if (var22 != null) {
                    int var23 = var6 * 4 + 2 - this.field1492.field306 / 32;
                    int var24 = var21 * 4 + 2 - this.field1492.field307 / 32;
                    this.method363(44453, var24, var23, this.field1413);
                }
            }
        }
        for (int var7 = 0; var7 < this.field1209; ++var7) {
            NpcEntity var18 = this.field1208[this.field1210[var7]];
            if (var18 != null && var18.method111(this.field1153) && var18.field360.field880) {
                int var19 = var18.field306 / 32 - this.field1492.field306 / 32;
                int var20 = var18.field307 / 32 - this.field1492.field307 / 32;
                this.method363(44453, var20, var19, this.field1414);
            }
        }
        for (int var8 = 0; var8 < this.field1136; ++var8) {
            PlayerEntity var11 = this.field1135[this.field1137[var8]];
            if (var11 != null && var11.method111(this.field1153)) {
                int var12 = var11.field306 / 32 - this.field1492.field306 / 32;
                int var13 = var11.field307 / 32 - this.field1492.field307 / 32;
                boolean var14 = false;
                long var15 = JString.method251(var11.field366);
                for (int var17 = 0; var17 < this.field1395; ++var17) {
                    if (this.field1539[var17] == var15 && this.field1389[var17] != 0) {
                        var14 = true;
                        break;
                    }
                }
                if (var14) {
                    this.method363(44453, var13, var12, this.field1416);
                } else {
                    this.method363(44453, var13, var12, this.field1415);
                }
            }
        }
        if (this.field1421 != 0) {
            int var9 = this.field1421 * 4 + 2 - this.field1492.field306 / 32;
            int var10 = this.field1422 * 4 + 2 - this.field1492.field307 / 32;
            this.method363(44453, var10, var9, this.field1533);
        }
        Pix2D.method149(93, 3, 16777215, 5, 82, 3);
        this.field1490.method235(0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method395(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1352 = "";
                this.field1353 = "Connecting to server...";
                this.method416(4);
            }
            this.field1396 = new ClientStream(this.method389(field1357 + 43594), this, this.field1388);
            this.field1396.method32(this.field1178.field622, 0, 8);
            this.field1178.field623 = 0;
            this.field1426 = this.field1178.method215((byte) 2);
            int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1426 >> 32), (int) this.field1426 };
            this.field1195.field623 = 0;
            this.field1195.method199(10);
            this.field1195.method203(var4[0]);
            this.field1195.method203(var4[1]);
            this.field1195.method203(var4[2]);
            this.field1195.method203(var4[3]);
            this.field1195.method203(signlink.uid);
            this.field1195.method206(arg0);
            this.field1195.method206(arg1);
            this.field1195.method224(field1454, field1387, 105);
            this.field1361.field623 = 0;
            if (arg2) {
                this.field1361.method199(18);
            } else {
                this.field1361.method199(16);
            }
            this.field1361.method199(this.field1195.field623 + 36 + 1 + 1);
            this.field1361.method199(217);
            this.field1361.method199(field1359 ? 1 : 0);
            for (int var5 = 0; var5 < 9; ++var5) {
                this.field1361.method203(this.field1547[var5]);
            }
            this.field1361.method207(this.field1195.field622, this.field1195.field623, 0, 43539);
            this.field1195.field627 = new Isaac(var4, 1);
            for (int var6 = 0; var6 < 4; ++var6) {
                var4[var6] += 50;
            }
            this.field1124 = new Isaac(var4, 1);
            this.field1396.method33(0, this.field1361.field622, this.field1361.field623, this.field1522);
            int var7 = this.field1396.method30();
            if (var7 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var15) {
                }
                this.method395(arg0, arg1, arg2);
                return;
            }
            if (var7 == 2 || var7 == 18) {
                if (var7 == 18) {
                    this.field1531 = true;
                } else {
                    this.field1531 = false;
                }
                InputTracking.method35(0, false);
                this.field1486 = true;
                this.field1195.field623 = 0;
                this.field1178.field623 = 0;
                this.field1270 = -1;
                this.field1478 = -1;
                this.field1479 = -1;
                this.field1480 = -1;
                this.field1269 = 0;
                this.field1271 = 0;
                this.field1207 = 0;
                this.field1273 = 0;
                this.field1252 = 0;
                this.field1144 = 0;
                this.field1381 = false;
                super.field17 = 0;
                for (int var8 = 0; var8 < 100; ++var8) {
                    this.field1131[var8] = null;
                }
                this.field1246 = 0;
                this.field1502 = 0;
                this.field1226 = 0;
                this.field1201 = 0;
                this.field1174 = (int) (Math.random() * 100.0D) - 50;
                this.field1430 = (int) (Math.random() * 110.0D) - 55;
                this.field1281 = (int) (Math.random() * 80.0D) - 40;
                this.field1287 = (int) (Math.random() * 120.0D) - 60;
                this.field1187 = (int) (Math.random() * 30.0D) - 20;
                this.field1496 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1349 = -1;
                this.field1421 = 0;
                this.field1422 = 0;
                this.field1136 = 0;
                this.field1209 = 0;
                for (int var9 = 0; var9 < this.field1133; ++var9) {
                    this.field1135[var9] = null;
                    this.field1140[var9] = null;
                }
                for (int var10 = 0; var10 < 8192; ++var10) {
                    this.field1208[var10] = null;
                }
                this.field1492 = this.field1135[this.field1134] = new PlayerEntity();
                this.field1425.method232();
                this.field1111.method232();
                this.field1169.method232();
                for (int var11 = 0; var11 < 4; ++var11) {
                    for (int var12 = 0; var12 < 104; ++var12) {
                        for (int var13 = 0; var13 < 104; ++var13) {
                            this.field1447[var11][var12][var13] = null;
                        }
                    }
                }
                this.field1113 = new LinkList((byte) -47);
                this.field1395 = 0;
                this.field1202 = -1;
                this.field1455 = -1;
                this.field1290 = -1;
                this.field1339 = -1;
                this.field1365 = false;
                this.field1251 = 3;
                this.field1213 = false;
                this.field1381 = false;
                this.field1398 = false;
                this.field1295 = null;
                this.field1401 = 0;
                this.field1119 = -1;
                this.field1218 = true;
                this.method463(-6645);
                for (int var14 = 0; var14 < 5; ++var14) {
                    this.field1141[var14] = 0;
                }
                field1546 = 0;
                field1419 = 0;
                field1275 = 0;
                field1200 = 0;
                field1465 = 0;
                field1386 = 0;
                field1266 = 0;
                field1118 = 0;
                field1167 = 0;
                field1125 = 0;
                this.method435(false);
                return;
            }
            if (var7 == 3) {
                this.field1352 = "";
                this.field1353 = "Invalid username or password.";
                return;
            }
            if (var7 == 4) {
                this.field1352 = "Your account has been disabled.";
                this.field1353 = "Please check your message-centre for details.";
                return;
            }
            if (var7 == 5) {
                this.field1352 = "Your account is already logged in.";
                this.field1353 = "Try again in 60 secs...";
                return;
            }
            if (var7 == 6) {
                this.field1352 = "RuneScape has been updated!";
                this.field1353 = "Please reload this page.";
                return;
            }
            if (var7 == 7) {
                this.field1352 = "This world is full.";
                this.field1353 = "Please use a different world.";
                return;
            }
            if (var7 == 8) {
                this.field1352 = "Unable to connect.";
                this.field1353 = "Login server offline.";
                return;
            }
            if (var7 == 9) {
                this.field1352 = "Login limit exceeded.";
                this.field1353 = "Too many connections from your address.";
                return;
            }
            if (var7 == 10) {
                this.field1352 = "Unable to connect.";
                this.field1353 = "Bad session id.";
                return;
            }
            if (var7 == 11) {
                this.field1353 = "Login server rejected session.";
                this.field1353 = "Please try again.";
                return;
            }
            if (var7 == 12) {
                this.field1352 = "You need a members account to login to this world.";
                this.field1353 = "Please subscribe, or use a different world.";
                return;
            }
            if (var7 == 13) {
                this.field1352 = "Could not complete login.";
                this.field1353 = "Please try using a different world.";
                return;
            }
            if (var7 == 14) {
                this.field1352 = "The server is being updated.";
                this.field1353 = "Please wait 1 minute and try again.";
                return;
            }
            if (var7 == 15) {
                this.field1486 = true;
                this.field1195.field623 = 0;
                this.field1178.field623 = 0;
                this.field1270 = -1;
                this.field1478 = -1;
                this.field1479 = -1;
                this.field1480 = -1;
                this.field1269 = 0;
                this.field1271 = 0;
                this.field1207 = 0;
                this.field1144 = 0;
                this.field1381 = false;
                return;
            }
            if (var7 == 16) {
                this.field1352 = "Login attempts exceeded.";
                this.field1353 = "Please wait 1 minute and try again.";
                return;
            }
            if (var7 == 17) {
                this.field1352 = "You are standing in a members-only area.";
                this.field1353 = "To play on this world move to a free area first";
                return;
            }
        } catch (IOException var16) {
            this.field1352 = "";
            this.field1353 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method396(boolean arg0) {
        this.field1486 &= arg0;
        this.method471((byte) 7);
        if (this.field1317 == 1) {
            this.field1147[this.field1316 / 100].method173(this.field1315 - 8 - 11, true, this.field1314 - 8 - 8);
        }
        if (this.field1317 == 2) {
            this.field1147[this.field1316 / 100 + 4].method173(this.field1315 - 8 - 11, true, this.field1314 - 8 - 8);
            ++field1442;
            if (field1442 > 161) {
                field1442 = 0;
                this.field1195.method198(9, 128);
                this.field1195.method200(9331);
            }
        }
        if (this.field1290 != -1) {
            this.method464(27708, this.field1290, this.field1445);
            this.method434(Component.field973[this.field1290], 0, 0, 0, 0);
        }
        this.method409(true);
        if (!this.field1381) {
            this.method369(9);
            this.method482(45);
        } else if (this.field1433 == 0) {
            this.method379((byte) 5);
        }
        if (this.field1401 == 1) {
            if (this.field1324 <= 0 && this.field1312 != 1) {
                this.field1194[1].method173(296, true, 472);
            } else {
                this.field1194[1].method173(258, true, 472);
            }
        }
        if (this.field1324 > 0) {
            this.field1194[0].method173(296, true, 472);
            this.field1462.method188(329, 2, "Level: " + this.field1324, 484, 16776960);
        }
        if (this.field1312 == 1) {
            this.field1194[6].method173(296, true, 472);
            this.field1462.method188(329, 2, "Arena", 484, 16776960);
        }
        if (this.field1207 != 0) {
            int var2 = this.field1207 / 50;
            int var3 = var2 / 60;
            int var4 = var2 % 60;
            if (var4 < 10) {
                this.field1462.method191(476, 329, "System update in: " + var3 + ":0" + var4, 4, 16776960);
            } else {
                this.field1462.method191(476, 329, "System update in: " + var3 + ":" + var4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method397(int arg0) {
        if (arg0 >= 4 && arg0 <= 4) {
            for (ProjectileEntity var2 = (ProjectileEntity) this.field1425.method228(); var2 != null; var2 = (ProjectileEntity) this.field1425.method230(this.field1162)) {
                if (this.field1545 == var2.field389 && field1529 <= var2.field395) {
                    if (field1529 >= var2.field394) {
                        if (var2.field398 > 0) {
                            NpcEntity var3 = this.field1208[var2.field398 - 1];
                            if (var3 != null) {
                                var2.method116(this.method420(var3.field306, this.field1221, var3.field307, var2.field389) - var2.field393, var3.field306, false, var3.field307, field1529);
                            }
                        }
                        if (var2.field398 < 0) {
                            int var4 = -var2.field398 - 1;
                            PlayerEntity var5;
                            if (this.field1206 == var4) {
                                var5 = this.field1492;
                            } else {
                                var5 = this.field1135[var4];
                            }
                            if (var5 != null) {
                                var2.method116(this.method420(var5.field306, this.field1221, var5.field307, var2.field389) - var2.field393, var5.field306, false, var5.field307, field1529);
                            }
                        }
                        var2.method117(false, this.field1445);
                        this.field1192.method61((Model) null, 18197, (int) var2.field402, -1, (int) var2.field401, var2.field408, 60, false, (int) var2.field400, var2, this.field1545);
                    }
                } else {
                    var2.method107();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZLkb;I)V")
    private final void method398(boolean arg0, Packet arg1, int arg2) {
        int var4 = arg1.method220(8, (byte) 27);
        if (!arg0) {
            if (var4 < this.field1136) {
                for (int var5 = var4; var5 < this.field1136; ++var5) {
                    this.field1520[this.field1519++] = this.field1137[var5];
                }
            }
            if (var4 > this.field1136) {
                signlink.reporterror(this.field1402 + " Too many players");
                throw new RuntimeException("eek");
            } else {
                this.field1136 = 0;
                for (int var6 = 0; var6 < var4; ++var6) {
                    int var7 = this.field1137[var6];
                    PlayerEntity var8 = this.field1135[var7];
                    int var9 = arg1.method220(1, (byte) 27);
                    if (var9 == 0) {
                        this.field1137[this.field1136++] = var7;
                        var8.field350 = field1529;
                    } else {
                        int var10 = arg1.method220(2, (byte) 27);
                        if (var10 == 0) {
                            this.field1137[this.field1136++] = var7;
                            var8.field350 = field1529;
                            this.field1139[this.field1138++] = var7;
                        } else if (var10 == 1) {
                            this.field1137[this.field1136++] = var7;
                            var8.field350 = field1529;
                            int var11 = arg1.method220(3, (byte) 27);
                            var8.method110(false, var11, 5);
                            int var12 = arg1.method220(1, (byte) 27);
                            if (var12 == 1) {
                                this.field1139[this.field1138++] = var7;
                            }
                        } else if (var10 == 2) {
                            this.field1137[this.field1136++] = var7;
                            var8.field350 = field1529;
                            int var13 = arg1.method220(3, (byte) 27);
                            var8.method110(true, var13, 5);
                            int var14 = arg1.method220(3, (byte) 27);
                            var8.method110(true, var14, 5);
                            int var15 = arg1.method220(1, (byte) 27);
                            if (var15 == 1) {
                                this.field1139[this.field1138++] = var7;
                            }
                        } else if (var10 == 3) {
                            this.field1520[this.field1519++] = var7;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILhc;)V")
    public final void method399(int arg0, Component arg1) {
        int var3 = arg1.field982;
        if (arg0 < 7 || arg0 > 7) {
            this.field1298 = !this.field1298;
        }
        if (var3 >= 1 && var3 <= 100) {
            --var3;
            if (var3 >= this.field1395) {
                arg1.field1012 = "";
                arg1.field981 = 0;
            } else {
                arg1.field1012 = this.field1283[var3];
                arg1.field981 = 1;
            }
        } else if (var3 >= 101 && var3 <= 200) {
            var3 -= 101;
            if (var3 >= this.field1395) {
                arg1.field1012 = "";
                arg1.field981 = 0;
            } else {
                if (this.field1389[var3] == 0) {
                    arg1.field1012 = "@red@Offline";
                } else if (this.field1389[var3] == field1356) {
                    arg1.field1012 = "@gre@World-" + (this.field1389[var3] - 9);
                } else {
                    arg1.field1012 = "@yel@World-" + (this.field1389[var3] - 9);
                }
                arg1.field981 = 1;
            }
        } else if (var3 == 203) {
            arg1.field991 = this.field1395 * 15 + 20;
            if (arg1.field991 <= arg1.field984) {
                arg1.field991 = arg1.field984 + 1;
            }
        } else if (var3 >= 401 && var3 <= 500) {
            var3 -= 401;
            if (var3 >= this.field1258) {
                arg1.field1012 = "";
                arg1.field981 = 0;
            } else {
                arg1.field1012 = JString.method255(JString.method252(this.field1471[var3], (byte) -74), true);
                arg1.field981 = 1;
            }
        } else if (var3 == 503) {
            arg1.field991 = this.field1258 * 15 + 20;
            if (arg1.field991 <= arg1.field984) {
                arg1.field991 = arg1.field984 + 1;
            }
        } else if (var3 == 327) {
            arg1.field1024 = 150;
            arg1.field1025 = (int) (Math.sin((double) field1529 / 40.0D) * 256.0D) & 2047;
            if (this.field1460) {
                this.field1460 = false;
                Model[] var4 = new Model[7];
                int var5 = 0;
                for (int var6 = 0; var6 < 7; ++var6) {
                    int var9 = this.field1375[var6];
                    if (var9 >= 0) {
                        var4[var5++] = IdkType.field963[var9].method312();
                    }
                }
                Model var7 = new Model(20363, var4, var5);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field1141[var8] != 0) {
                        var7.method133(field1217[var8][0], field1217[var8][this.field1141[var8]]);
                        if (var8 == 1) {
                            var7.method133(field1296[0], field1296[this.field1141[var8]]);
                        }
                    }
                }
                var7.method126(797);
                var7.method127(SeqType.field1043[this.field1492.field311].field1045[0], (byte) -89);
                var7.method136(64, 850, -30, -50, -30, true);
                arg1.field1019 = var7;
            }
        } else if (var3 == 324) {
            if (this.field1262 == null) {
                this.field1262 = arg1.field1017;
                this.field1263 = arg1.field1018;
            }
            if (this.field1218) {
                arg1.field1017 = this.field1263;
            } else {
                arg1.field1017 = this.field1262;
            }
        } else if (var3 == 325) {
            if (this.field1262 == null) {
                this.field1262 = arg1.field1017;
                this.field1263 = arg1.field1018;
            }
            if (this.field1218) {
                arg1.field1017 = this.field1262;
            } else {
                arg1.field1017 = this.field1263;
            }
        } else if (var3 == 600) {
            arg1.field1012 = this.field1441;
            if (field1529 % 20 < 10) {
                arg1.field1012 = arg1.field1012 + "|";
            } else {
                arg1.field1012 = arg1.field1012 + " ";
            }
        } else {
            if (var3 == 613) {
                if (this.field1531) {
                    if (this.field1132) {
                        arg1.field1014 = 16711680;
                        arg1.field1012 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else {
                        arg1.field1014 = 16777215;
                        arg1.field1012 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else {
                    arg1.field1012 = "";
                }
            }
            if (var3 == 650 || var3 == 655) {
                if (this.field1110 != 0) {
                    String var10;
                    if (this.field1508 == 0) {
                        var10 = "earlier today";
                    } else if (this.field1508 == 1) {
                        var10 = "yesterday";
                    } else {
                        var10 = this.field1508 + " days ago";
                    }
                    arg1.field1012 = "You last logged in " + var10 + " from: " + signlink.dns;
                } else {
                    arg1.field1012 = "";
                }
            }
            if (var3 == 651) {
                if (this.field1203 == 0) {
                    arg1.field1012 = "0 unread messages";
                    arg1.field1014 = 16776960;
                }
                if (this.field1203 == 1) {
                    arg1.field1012 = "1 unread message";
                    arg1.field1014 = 65280;
                }
                if (this.field1203 > 1) {
                    arg1.field1012 = this.field1203 + " unread messages";
                    arg1.field1014 = 65280;
                }
            }
            if (var3 == 652) {
                if (this.field1154 == 201) {
                    arg1.field1012 = "";
                } else if (this.field1154 == 200) {
                    arg1.field1012 = "You have not yet set any password recovery questions.";
                } else {
                    String var11;
                    if (this.field1154 == 0) {
                        var11 = "Earlier today";
                    } else if (this.field1154 == 1) {
                        var11 = "Yesterday";
                    } else {
                        var11 = this.field1154 + " days ago";
                    }
                    arg1.field1012 = var11 + " you changed your recovery questions";
                }
            }
            if (var3 == 653) {
                if (this.field1154 == 201) {
                    arg1.field1012 = "";
                } else if (this.field1154 == 200) {
                    arg1.field1012 = "We strongly recommend you do so now to secure your account.";
                } else {
                    arg1.field1012 = "If you do not remember making this change then cancel it immediately";
                }
            }
            if (var3 == 654) {
                if (this.field1154 == 201) {
                    arg1.field1012 = "";
                } else if (this.field1154 == 200) {
                    arg1.field1012 = "Do this from the 'account management' area on our front webpage";
                } else {
                    arg1.field1012 = "Do this from the 'account management' area on our front webpage";
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILhc;IIIZ)V")
    public final void method400(int arg0, int arg1, int arg2, int arg3, Component arg4, int arg5, int arg6, int arg7, boolean arg8) {
        if (this.field1507) {
            this.field1384 = 32;
        } else {
            this.field1384 = 0;
        }
        this.field1507 = false;
        int var10 = 75 / arg0;
        if (arg3 >= arg7 && arg3 < arg7 + 16 && arg5 >= arg1 && arg5 < arg1 + 16) {
            arg4.field992 -= this.field1393 * 4;
            if (arg8) {
                this.field1197 = true;
                return;
            }
        } else if (arg3 >= arg7 && arg3 < arg7 + 16 && arg5 >= arg1 + arg6 - 16 && arg5 < arg1 + arg6) {
            arg4.field992 += this.field1393 * 4;
            if (arg8) {
                this.field1197 = true;
                return;
            }
        } else {
            if (arg3 < arg7 - this.field1384 || arg3 >= arg7 + 16 + this.field1384 || arg5 < arg1 + 16 || arg5 >= arg1 + arg6 - 16 || this.field1393 <= 0) {
                return;
            }
            int var11 = (arg6 - 32) * arg6 / arg2;
            if (var11 < 8) {
                var11 = 8;
            }
            int var12 = arg5 - arg1 - 16 - var11 / 2;
            int var13 = arg6 - 32 - var11;
            arg4.field992 = (arg2 - arg6) * var12 / var13;
            if (arg8) {
                this.field1197 = true;
            }
            this.field1507 = true;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method401(int arg0) {
        if (arg0 <= 0) {
            this.method6();
        }
        for (int var2 = 0; var2 < this.field1209; ++var2) {
            NpcEntity var3 = this.field1208[this.field1210[var2]];
            int var4 = (this.field1210[var2] << 14) + 536870912;
            if (var3 != null && var3.method111(this.field1153)) {
                int var5 = var3.field306 >> 7;
                int var6 = var3.field307 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field310 == 1 && (var3.field306 & 127) == 64 && (var3.field307 & 127) == 64) {
                        if (this.field1214[var5][var6] == this.field1219) {
                            continue;
                        }
                        this.field1214[var5][var6] = this.field1219;
                    }
                    this.field1192.method61((Model) null, 18197, this.method420(var3.field306, this.field1221, var3.field307, this.field1545), var4, var3.field307, var3.field308, (var3.field310 - 1) * 64 + 60, var3.field309, var3.field306, var3, this.field1545);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)I")
    public final int method402(boolean arg0) {
        if (!arg0) {
            return 4;
        } else {
            int var2 = 3;
            if (this.field1346 < 310) {
                int var3 = this.field1343 >> 7;
                int var4 = this.field1345 >> 7;
                int var5 = this.field1492.field306 >> 7;
                int var6 = this.field1492.field307 >> 7;
                if ((this.field1323[this.field1545][var3][var4] & 4) != 0) {
                    var2 = this.field1545;
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
                        if ((this.field1323[this.field1545][var3][var4] & 4) != 0) {
                            var2 = this.field1545;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field1323[this.field1545][var3][var4] & 4) != 0) {
                                var2 = this.field1545;
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
                        if ((this.field1323[this.field1545][var3][var4] & 4) != 0) {
                            var2 = this.field1545;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field1323[this.field1545][var3][var4] & 4) != 0) {
                                var2 = this.field1545;
                            }
                        }
                    }
                }
            }
            if ((this.field1323[this.field1545][this.field1492.field306 >> 7][this.field1492.field307 >> 7] & 4) != 0) {
                var2 = this.field1545;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)I")
    public final int method403(boolean arg0) {
        if (!arg0) {
            return 3;
        } else {
            int var2 = this.method420(this.field1343, this.field1221, this.field1345, this.field1545);
            return var2 - this.field1344 < 800 && (this.field1323[this.field1545][this.field1343 >> 7][this.field1345 >> 7] & 4) != 0 ? this.field1545 : 3;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lhc;I)Z")
    public final boolean method404(Component arg0, int arg1) {
        if (arg1 >= 0) {
            this.method6();
        }
        if (arg0.field988 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field988.length; ++var3) {
                int var4 = this.method436(var3, arg0, this.field1168);
                int var5 = arg0.field989[var3];
                if (arg0.field988[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field988[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field988[var3] == 4) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(I[BI)Z")
    public final boolean method405(int arg0, byte[] arg1, int arg2) {
        if (arg0 < 2 || arg0 > 2) {
            this.field1254 = this.field1124.method246();
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg2);
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)Z")
    public final boolean method406(byte arg0) {
        if (arg0 != 3) {
            throw new NullPointerException();
        } else {
            return signlink.wavereplay();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)V")
    public final void method407(int arg0, byte arg1) {
        signlink.wavevol = arg0;
        if (arg1 != -79) {
            this.field1220 = this.field1124.method246();
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method408(boolean arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1331[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1331[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1332[var14] = (this.field1331[var14 - 1] + this.field1331[var14 + 1] + this.field1331[var14 - 128] + this.field1331[var14 + 128]) / 4;
            }
        }
        this.field1493 += 128;
        if (this.field1493 > this.field1204.length) {
            this.field1493 -= this.field1204.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method442((byte) 3, this.field1472[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field1332[var11 + 128] - this.field1204[this.field1493 + var11 & this.field1204.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field1331[var11] = var12;
            }
        }
        if (arg0) {
            this.field1270 = this.field1178.method209();
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field1261[var8] = this.field1261[var8 + 1];
        }
        this.field1261[var2 - 1] = (int) (Math.sin((double) field1529 / 14.0D) * 16.0D + Math.sin((double) field1529 / 15.0D) * 14.0D + Math.sin((double) field1529 / 16.0D) * 12.0D);
        if (this.field1537 > 0) {
            this.field1537 -= 4;
        }
        if (this.field1538 > 0) {
            this.field1538 -= 4;
        }
        if (this.field1537 == 0 && this.field1538 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field1537 = 1024;
            }
            if (var9 == 1) {
                this.field1538 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method409(boolean arg0) {
        if (!arg0) {
            this.field1313 = -105;
        }
        int var2 = (this.field1492.field306 >> 7) + this.field1448;
        int var3 = (this.field1492.field307 >> 7) + this.field1449;
        if (var2 >= 2944 && var2 < 3392 && var3 >= 3520 && var3 < 6400) {
            this.field1324 = (var3 - 3520) / 8 + 1;
        } else if (var2 >= 2944 && var2 < 3392 && var3 >= 9920 && var3 < 12800) {
            this.field1324 = (var3 - 9920) / 8 + 1;
        } else {
            this.field1324 = 0;
        }
        this.field1312 = 0;
        if (var2 >= 3328 && var2 < 3392 && var3 >= 3200 && var3 < 3264) {
            int var4 = var2 & 63;
            int var5 = var3 & 63;
            if (var4 >= 4 && var4 <= 29 && var5 >= 44 && var5 <= 58) {
                this.field1312 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 44 && var5 <= 58) {
                this.field1312 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 25 && var5 <= 39) {
                this.field1312 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 25 && var5 <= 39) {
                this.field1312 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 6 && var5 <= 20) {
                this.field1312 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 6 && var5 <= 20) {
                this.field1312 = 1;
            }
        }
        if (this.field1312 == 0 && var2 >= 3328 && var2 <= 3393 && var3 >= 3203 && var3 <= 3325) {
            this.field1312 = 2;
        }
        this.field1536 = 0;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1536 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1536 = 1;
        }
        if (this.field1536 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1536 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method410(int arg0) {
        int var2 = 85 / arg0;
        if (this.field1273 > 0) {
            this.method465((byte) 117);
        } else {
            this.field1490.method235(0);
            this.field1462.method188(144, 2, "Connection lost", 257, 0);
            this.field1462.method188(143, 2, "Connection lost", 256, 16777215);
            this.field1462.method188(159, 2, "Please wait - attempting to reestablish", 257, 0);
            this.field1462.method188(158, 2, "Please wait - attempting to reestablish", 256, 16777215);
            this.field1490.method236(11, 8, -715, super.field12);
            this.field1421 = 0;
            ClientStream var3 = this.field1396;
            this.field1486 = false;
            this.method395(this.field1402, this.field1403, true);
            if (!this.field1486) {
                this.method465((byte) 117);
            }
            try {
                var3.method29();
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method411(int arg0) {
        if (this.field1313 != arg0) {
            this.field1270 = -1;
        }
        if (this.field1151 == 0) {
            int var2 = super.field10 / 2 - 80;
            int var3 = super.field11 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field21 == 1 && super.field22 >= var2 - 75 && super.field22 <= var2 + 75 && super.field23 >= var14 - 20 && super.field23 <= var14 + 20) {
                this.field1151 = 3;
                this.field1128 = 0;
            }
            int var4 = super.field10 / 2 + 80;
            if (super.field21 == 1 && super.field22 >= var4 - 75 && super.field22 <= var4 + 75 && super.field23 >= var14 - 20 && super.field23 <= var14 + 20) {
                this.field1352 = "";
                this.field1353 = "Enter your username & password.";
                this.field1151 = 2;
                this.field1128 = 0;
            }
        } else if (this.field1151 == 2) {
            int var5 = super.field11 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field21 == 1 && super.field23 >= var16 - 15 && super.field23 < var16) {
                this.field1128 = 0;
            }
            var5 = var16 + 15;
            if (super.field21 == 1 && super.field23 >= var5 - 15 && super.field23 < var5) {
                this.field1128 = 1;
            }
            var5 += 15;
            int var6 = super.field10 / 2 - 80;
            int var7 = super.field11 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field21 == 1 && super.field22 >= var6 - 75 && super.field22 <= var6 + 75 && super.field23 >= var17 - 20 && super.field23 <= var17 + 20) {
                this.method395(this.field1402, this.field1403, false);
            }
            int var8 = super.field10 / 2 + 80;
            if (super.field21 == 1 && super.field22 >= var8 - 75 && super.field22 <= var8 + 75 && super.field23 >= var17 - 20 && super.field23 <= var17 + 20) {
                this.field1151 = 0;
                this.field1402 = "";
                this.field1403 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5(9);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1534.length(); ++var11) {
                        if (var9 == field1534.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1128 == 0) {
                        if (var9 == 8 && this.field1402.length() > 0) {
                            this.field1402 = this.field1402.substring(0, this.field1402.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1128 = 1;
                        }
                        if (var10) {
                            this.field1402 = this.field1402 + (char) var9;
                        }
                        if (this.field1402.length() > 12) {
                            this.field1402 = this.field1402.substring(0, 12);
                        }
                    } else if (this.field1128 == 1) {
                        if (var9 == 8 && this.field1403.length() > 0) {
                            this.field1403 = this.field1403.substring(0, this.field1403.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1128 = 0;
                        }
                        if (var10) {
                            this.field1403 = this.field1403 + (char) var9;
                        }
                        if (this.field1403.length() > 20) {
                            this.field1403 = this.field1403.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1151 == 3) {
                int var12 = super.field10 / 2;
                int var13 = super.field11 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field21 == 1 && super.field22 >= var12 - 75 && super.field22 <= var12 + 75 && super.field23 >= var18 - 20 && super.field23 <= var18 + 20) {
                    this.field1151 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method412(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1395 >= 100) {
                this.method382(0, 0, "", "Your friends list is full. Max of 100 hit");
            } else {
                String var4 = JString.method255(JString.method252(arg1, (byte) -74), true);
                for (int var5 = 0; var5 < this.field1395; ++var5) {
                    if (this.field1539[var5] == arg1) {
                        this.method382(0, 0, "", var4 + " is already on your friend list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1258; ++var6) {
                    if (this.field1471[var6] == arg1) {
                        this.method382(0, 0, "", "Please remove " + var4 + " from your ignore list first");
                        return;
                    }
                }
                if (!var4.equals(this.field1492.field366)) {
                    this.field1283[this.field1395] = var4;
                    this.field1539[this.field1395] = arg1;
                    this.field1389[this.field1395] = 0;
                    ++this.field1395;
                    this.field1197 = true;
                    if (arg0 >= 0) {
                        this.field1270 = this.field1178.method209();
                    }
                    this.field1195.method198(9, 66);
                    this.field1195.method205(arg1, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lkb;II)V")
    private final void method413(Packet arg0, int arg1, int arg2) {
        while (arg1 >= 0) {
            this.method6();
        }
        arg0.method219(561);
        int var4 = arg0.method220(8, (byte) 27);
        if (var4 < this.field1209) {
            for (int var5 = var4; var5 < this.field1209; ++var5) {
                this.field1520[this.field1519++] = this.field1210[var5];
            }
        }
        if (var4 > this.field1209) {
            signlink.reporterror(this.field1402 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1209 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1210[var6];
                NpcEntity var8 = this.field1208[var7];
                int var9 = arg0.method220(1, (byte) 27);
                if (var9 == 0) {
                    this.field1210[this.field1209++] = var7;
                    var8.field350 = field1529;
                } else {
                    int var10 = arg0.method220(2, (byte) 27);
                    if (var10 == 0) {
                        this.field1210[this.field1209++] = var7;
                        var8.field350 = field1529;
                        this.field1139[this.field1138++] = var7;
                    } else if (var10 == 1) {
                        this.field1210[this.field1209++] = var7;
                        var8.field350 = field1529;
                        int var11 = arg0.method220(3, (byte) 27);
                        var8.method110(false, var11, 5);
                        int var12 = arg0.method220(1, (byte) 27);
                        if (var12 == 1) {
                            this.field1139[this.field1138++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1210[this.field1209++] = var7;
                        var8.field350 = field1529;
                        int var13 = arg0.method220(3, (byte) 27);
                        var8.method110(true, var13, 5);
                        int var14 = arg0.method220(3, (byte) 27);
                        var8.method110(true, var14, 5);
                        int var15 = arg0.method220(1, (byte) 27);
                        if (var15 == 1) {
                            this.field1139[this.field1138++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1520[this.field1519++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method414(boolean arg0) {
        if (arg0) {
            this.field1270 = this.field1178.method209();
        }
        if (super.field21 == 1) {
            int var2 = super.field22 - 21 - 561;
            int var3 = super.field23 - 9 - 5;
            if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                var2 -= 73;
                var3 -= 75;
                int var4 = this.field1496 + this.field1287 & 2047;
                int var5 = Pix3D.field561[var4];
                int var6 = Pix3D.field562[var4];
                int var7 = (this.field1187 + 256) * var5 >> 8;
                int var8 = (this.field1187 + 256) * var6 >> 8;
                int var9 = var2 * var8 + var3 * var7 >> 11;
                int var10 = var3 * var8 - var2 * var7 >> 11;
                int var11 = this.field1492.field306 + var9 >> 7;
                int var12 = this.field1492.field307 - var10 >> 7;
                boolean var13 = this.method486(0, true, 1, this.field1492.field354[0], var12, this.field1492.field355[0], 107, 0, 0, var11, 0, 0);
                if (var13) {
                    this.field1195.method199(var2);
                    this.field1195.method199(var3);
                    this.field1195.method200(this.field1496);
                    this.field1195.method199(57);
                    this.field1195.method199(this.field1287);
                    this.field1195.method199(this.field1187);
                    this.field1195.method199(89);
                    this.field1195.method200(this.field1492.field306);
                    this.field1195.method200(this.field1492.field307);
                    this.field1195.method199(this.field1112);
                    this.field1195.method199(63);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;IZ)V")
    private final void method415(Packet arg0, int arg1, boolean arg2) {
        this.field1519 = 0;
        this.field1138 = 0;
        this.method413(arg0, -266, arg1);
        this.method373((byte) 8, arg0, arg1);
        this.method438((byte) 95, arg0, arg1);
        for (int var4 = 0; var4 < this.field1519; ++var4) {
            int var6 = this.field1520[var4];
            if (field1529 != this.field1208[var6].field350) {
                this.field1208[var6].field360 = null;
                this.field1208[var6] = null;
            }
        }
        if (!arg2) {
            if (arg0.field623 != arg1) {
                signlink.reporterror(this.field1402 + " size mismatch in getnpcpos - pos:" + arg0.field623 + " psize:" + arg1);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field1209; ++var5) {
                    if (this.field1208[this.field1210[var5]] == null) {
                        signlink.reporterror(this.field1402 + " null entry in npc list - pos:" + var5 + " size:" + this.field1209);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        if (signlink.sunjava) {
            super.field7 = 5;
        }
        if (!field1359) {
            this.field1340 = true;
            this.field1443 = true;
            this.method12(this, 2);
            this.method459(12345678, "scape_main", 43166, 40000);
        }
        if (field1289) {
            this.field1333 = true;
        } else {
            field1289 = true;
            boolean var1 = false;
            String var2 = this.method445((byte) 7);
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
                this.field1500 = true;
            } else {
                try {
                    int var3 = 5;
                    this.field1547[8] = 0;
                    while (this.field1547[8] == 0) {
                        this.method13((byte) 72, "Connecting to fileserver", 10);
                        try {
                            DataInputStream var4 = this.method469("crc" + (int) (Math.random() * 9.9999999E7D));
                            Packet var5 = new Packet(new byte[36], 0);
                            var4.readFully(var5.field622, 0, 36);
                            for (int var6 = 0; var6 < 9; ++var6) {
                                this.field1547[var6] = var5.method214();
                            }
                            var4.close();
                        } catch (IOException var54) {
                            for (int var7 = var3; var7 > 0; --var7) {
                                this.method13((byte) 72, "Error loading - Will retry in " + var7 + " secs.", 10);
                                try {
                                    Thread.sleep(1000L);
                                } catch (Exception var49) {
                                }
                            }
                            var3 *= 2;
                            if (var3 > 60) {
                                var3 = 60;
                            }
                        }
                    }
                    this.field1355 = this.method451(10, "title screen", false, this.field1547[1], "title");
                    this.field1461 = new PixFont("p11", 2, this.field1355);
                    this.field1462 = new PixFont("p12", 2, this.field1355);
                    this.field1463 = new PixFont("b12", 2, this.field1355);
                    this.field1464 = new PixFont("q8", 2, this.field1355);
                    this.method480(false);
                    this.method428(true);
                    Jagfile var8 = this.method451(15, "config", false, this.field1547[2], "config");
                    Jagfile var9 = this.method451(20, "interface", false, this.field1547[3], "interface");
                    Jagfile var10 = this.method451(30, "2d graphics", false, this.field1547[4], "media");
                    Jagfile var11 = this.method451(40, "3d graphics", false, this.field1547[5], "models");
                    Jagfile var12 = this.method451(60, "textures", false, this.field1547[6], "textures");
                    Jagfile var13 = this.method451(65, "chat system", false, this.field1547[7], "wordenc");
                    Jagfile var14 = this.method451(70, "sound effects", false, this.field1547[8], "sounds");
                    this.field1323 = new byte[4][104][104];
                    this.field1163 = new int[4][105][105];
                    this.field1192 = new World3D(104, 4, 104, 6, this.field1163);
                    for (int var15 = 0; var15 < 4; ++var15) {
                        this.field1501[var15] = new CollisionMap(104, 104, false);
                    }
                    this.field1423 = new Pix32(512, 512);
                    this.method13((byte) 72, "Unpacking media", 75);
                    this.field1223 = new Pix8(var10, "invback", 0);
                    this.field1225 = new Pix8(var10, "chatback", 0);
                    this.field1224 = new Pix8(var10, "mapback", 0);
                    this.field1179 = new Pix8(var10, "backbase1", 0);
                    this.field1180 = new Pix8(var10, "backbase2", 0);
                    this.field1181 = new Pix8(var10, "backhmid1", 0);
                    for (int var16 = 0; var16 < 13; ++var16) {
                        this.field1276[var16] = new Pix8(var10, "sideicons", var16);
                    }
                    this.field1279 = new Pix32(var10, "compass", 0);
                    try {
                        for (int var17 = 0; var17 < 50; ++var17) {
                            this.field1382[var17] = new Pix8(var10, "mapscene", var17);
                        }
                    } catch (Exception var53) {
                    }
                    try {
                        for (int var18 = 0; var18 < 50; ++var18) {
                            this.field1341[var18] = new Pix32(var10, "mapfunction", var18);
                        }
                    } catch (Exception var52) {
                    }
                    try {
                        for (int var19 = 0; var19 < 20; ++var19) {
                            this.field1121[var19] = new Pix32(var10, "hitmarks", var19);
                        }
                    } catch (Exception var51) {
                    }
                    try {
                        for (int var20 = 0; var20 < 20; ++var20) {
                            this.field1194[var20] = new Pix32(var10, "headicons", var20);
                        }
                    } catch (Exception var50) {
                    }
                    this.field1533 = new Pix32(var10, "mapflag", 0);
                    for (int var21 = 0; var21 < 8; ++var21) {
                        this.field1147[var21] = new Pix32(var10, "cross", var21);
                    }
                    this.field1413 = new Pix32(var10, "mapdots", 0);
                    this.field1414 = new Pix32(var10, "mapdots", 1);
                    this.field1415 = new Pix32(var10, "mapdots", 2);
                    this.field1416 = new Pix32(var10, "mapdots", 3);
                    this.field1190 = new Pix8(var10, "scrollbar", 0);
                    this.field1191 = new Pix8(var10, "scrollbar", 1);
                    this.field1473 = new Pix8(var10, "redstone1", 0);
                    this.field1474 = new Pix8(var10, "redstone2", 0);
                    this.field1475 = new Pix8(var10, "redstone3", 0);
                    this.field1476 = new Pix8(var10, "redstone1", 0);
                    this.field1476.method184(true);
                    this.field1477 = new Pix8(var10, "redstone2", 0);
                    this.field1477.method184(true);
                    this.field1182 = new Pix8(var10, "redstone1", 0);
                    this.field1182.method185(-638);
                    this.field1183 = new Pix8(var10, "redstone2", 0);
                    this.field1183.method185(-638);
                    this.field1184 = new Pix8(var10, "redstone3", 0);
                    this.field1184.method185(-638);
                    this.field1185 = new Pix8(var10, "redstone1", 0);
                    this.field1185.method184(true);
                    this.field1185.method185(-638);
                    this.field1186 = new Pix8(var10, "redstone2", 0);
                    this.field1186.method184(true);
                    this.field1186.method185(-638);
                    Pix32 var22 = new Pix32(var10, "backleft1", 0);
                    this.field1300 = new PixMap(var22.field581, this.method11(16374), var22.field582, 947);
                    var22.method171(0, 0, true);
                    Pix32 var23 = new Pix32(var10, "backleft2", 0);
                    this.field1301 = new PixMap(var23.field581, this.method11(16374), var23.field582, 947);
                    var23.method171(0, 0, true);
                    Pix32 var24 = new Pix32(var10, "backright1", 0);
                    this.field1302 = new PixMap(var24.field581, this.method11(16374), var24.field582, 947);
                    var24.method171(0, 0, true);
                    Pix32 var25 = new Pix32(var10, "backright2", 0);
                    this.field1303 = new PixMap(var25.field581, this.method11(16374), var25.field582, 947);
                    var25.method171(0, 0, true);
                    Pix32 var26 = new Pix32(var10, "backtop1", 0);
                    this.field1304 = new PixMap(var26.field581, this.method11(16374), var26.field582, 947);
                    var26.method171(0, 0, true);
                    Pix32 var27 = new Pix32(var10, "backtop2", 0);
                    this.field1305 = new PixMap(var27.field581, this.method11(16374), var27.field582, 947);
                    var27.method171(0, 0, true);
                    Pix32 var28 = new Pix32(var10, "backvmid1", 0);
                    this.field1306 = new PixMap(var28.field581, this.method11(16374), var28.field582, 947);
                    var28.method171(0, 0, true);
                    Pix32 var29 = new Pix32(var10, "backvmid2", 0);
                    this.field1307 = new PixMap(var29.field581, this.method11(16374), var29.field582, 947);
                    var29.method171(0, 0, true);
                    Pix32 var30 = new Pix32(var10, "backvmid3", 0);
                    this.field1308 = new PixMap(var30.field581, this.method11(16374), var30.field582, 947);
                    var30.method171(0, 0, true);
                    Pix32 var31 = new Pix32(var10, "backhmid2", 0);
                    this.field1309 = new PixMap(var31.field581, this.method11(16374), var31.field582, 947);
                    var31.method171(0, 0, true);
                    this.method13((byte) 72, "Unpacking textures", 80);
                    Pix3D.method158(var12, (byte) 25);
                    Pix3D.method162(0.8D, -72);
                    Pix3D.method157(1000, 20);
                    this.method13((byte) 72, "Unpacking models", 83);
                    Model.method121((byte) -50, var11);
                    AnimBase.method47(field1376, var11);
                    AnimFrame.method48(field1376, var11);
                    this.method13((byte) 72, "Unpacking config", 86);
                    SeqType.method318(4, var8);
                    LocType.method273(var8);
                    FloType.method307(4, var8);
                    ObjType.method285(var8);
                    NpcType.method279(var8);
                    IdkType.method310(4, var8);
                    SpotAnimType.method320(4, var8);
                    VarpType.method323(4, var8);
                    ObjType.field894 = field1358;
                    if (!field1359) {
                        this.method13((byte) 72, "Unpacking sounds", 90);
                        byte[] var32 = var14.method250(field1310, "sounds.dat", (byte[]) null);
                        Packet var33 = new Packet(var32, 0);
                        Wave.method263(4, var33);
                    }
                    this.method13((byte) 72, "Unpacking interfaces", 92);
                    PixFont[] var34 = new PixFont[] { this.field1461, this.field1462, this.field1463, this.field1464 };
                    Component.method314(var10, 25381, var34, var9);
                    this.method13((byte) 72, "Preparing game engine", 97);
                    for (int var35 = 0; var35 < 33; ++var35) {
                        int var36 = 999;
                        int var37 = 0;
                        for (int var38 = 0; var38 < 35; ++var38) {
                            if (this.field1224.field591[this.field1224.field593 * var35 + var38] == 0) {
                                if (var36 == 999) {
                                    var36 = var38;
                                }
                            } else if (var36 != 999) {
                                var37 = var38;
                                break;
                            }
                        }
                        this.field1439[var35] = var36;
                        this.field1417[var35] = var37 - var36;
                    }
                    for (int var39 = 9; var39 < 160; ++var39) {
                        int var40 = 999;
                        int var41 = 0;
                        for (int var42 = 10; var42 < 168; ++var42) {
                            if (this.field1224.field591[this.field1224.field593 * var39 + var42] != 0 || var42 <= 34 && var39 <= 34) {
                                if (var40 != 999) {
                                    var41 = var42;
                                    break;
                                }
                            } else if (var40 == 999) {
                                var40 = var42;
                            }
                        }
                        this.field1114[var39 - 9] = var40 - 21;
                        this.field1438[var39 - 9] = var41 - var40;
                    }
                    Pix3D.method155(96, (byte) 0, 479);
                    this.field1164 = Pix3D.field563;
                    Pix3D.method155(261, (byte) 0, 190);
                    this.field1165 = Pix3D.field563;
                    Pix3D.method155(334, (byte) 0, 512);
                    this.field1166 = Pix3D.field563;
                    int[] var43 = new int[9];
                    for (int var44 = 0; var44 < 9; ++var44) {
                        int var45 = var44 * 32 + 128 + 15;
                        int var46 = var45 * 3 + 600;
                        int var47 = Pix3D.field561[var45];
                        var43[var44] = var46 * var47 >> 16;
                    }
                    World3D.method87(var43, 800, 334, 500, 512, 0);
                    WordFilter.method325(var13);
                } catch (Exception var55) {
                    this.field1257 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method416(int arg0) {
        this.method448(0);
        this.field1511.method235(0);
        this.field1148.method186(0, true, 0);
        short var2 = 360;
        short var3 = 200;
        if (arg0 == 4) {
            if (this.field1151 == 0) {
                int var4 = var3 / 2 - 20;
                this.field1463.method189(-45560, "Welcome to RuneScape", var4, 16776960, true, var2 / 2);
                int var15 = var4 + 30;
                int var5 = var2 / 2 - 80;
                int var6 = var3 / 2 + 20;
                this.field1149.method186(var6 - 20, true, var5 - 73);
                this.field1463.method189(-45560, "New user", var6 + 5, 16777215, true, var5);
                int var7 = var2 / 2 + 80;
                this.field1149.method186(var6 - 20, true, var7 - 73);
                this.field1463.method189(-45560, "Existing User", var6 + 5, 16777215, true, var7);
            }
            if (this.field1151 == 2) {
                int var8 = var3 / 2 - 40;
                if (this.field1352.length() > 0) {
                    this.field1463.method189(-45560, this.field1352, var8 - 15, 16776960, true, var2 / 2);
                    this.field1463.method189(-45560, this.field1353, var8, 16776960, true, var2 / 2);
                    var8 += 30;
                } else {
                    this.field1463.method189(-45560, this.field1353, var8 - 7, 16776960, true, var2 / 2);
                    var8 += 30;
                }
                this.field1463.method193("Username: " + this.field1402 + (this.field1128 == 0 & field1529 % 40 < 20 ? "@yel@|" : ""), 16777215, true, var2 / 2 - 90, true, var8);
                var8 += 15;
                this.field1463.method193("Password: " + JString.method257(this.field1403, 0) + (this.field1128 == 1 & field1529 % 40 < 20 ? "@yel@|" : ""), 16777215, true, var2 / 2 - 88, true, var8);
                var8 += 15;
                int var9 = var2 / 2 - 80;
                int var10 = var3 / 2 + 50;
                this.field1149.method186(var10 - 20, true, var9 - 73);
                this.field1463.method189(-45560, "Login", var10 + 5, 16777215, true, var9);
                int var11 = var2 / 2 + 80;
                this.field1149.method186(var10 - 20, true, var11 - 73);
                this.field1463.method189(-45560, "Cancel", var10 + 5, 16777215, true, var11);
            }
            if (this.field1151 == 3) {
                this.field1463.method189(-45560, "Create a free account", var3 / 2 - 60, 16776960, true, var2 / 2);
                int var12 = var3 / 2 - 35;
                this.field1463.method189(-45560, "To create a new account you need to", var12, 16777215, true, var2 / 2);
                int var16 = var12 + 15;
                this.field1463.method189(-45560, "go back to the main RuneScape webpage", var16, 16777215, true, var2 / 2);
                int var17 = var16 + 15;
                this.field1463.method189(-45560, "and choose the red 'create account'", var17, 16777215, true, var2 / 2);
                int var18 = var17 + 15;
                this.field1463.method189(-45560, "button at the top right of that page.", var18, 16777215, true, var2 / 2);
                int var19 = var18 + 15;
                int var13 = var2 / 2;
                int var14 = var3 / 2 + 50;
                this.field1149.method186(var14 - 20, true, var13 - 73);
                this.field1463.method189(-45560, "Cancel", var14 + 5, 16777215, true, var13);
            }
            this.field1511.method236(186, 214, -715, super.field12);
            if (this.field1485) {
                this.field1485 = false;
                this.field1509.method236(0, 128, -715, super.field12);
                this.field1510.method236(386, 214, -715, super.field12);
                this.field1514.method236(265, 0, -715, super.field12);
                this.field1515.method236(265, 574, -715, super.field12);
                this.field1516.method236(186, 128, -715, super.field12);
                this.field1517.method236(186, 574, -715, super.field12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IJ)V")
    public final void method417(int arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field1395; ++var4) {
                if (this.field1539[var4] == arg1) {
                    --this.field1395;
                    this.field1197 = true;
                    for (int var5 = var4; var5 < this.field1395; ++var5) {
                        this.field1283[var5] = this.field1283[var5 + 1];
                        this.field1389[var5] = this.field1389[var5 + 1];
                        this.field1539[var5] = this.field1539[var5 + 1];
                    }
                    this.field1195.method198(9, 210);
                    this.field1195.method205(arg1, true);
                    break;
                }
            }
            this.field1269 += arg0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method418(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = arg2 - arg0;
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

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method419(boolean arg0) {
        this.field1491.method235(0);
        Pix3D.field563 = this.field1164;
        this.field1225.method186(0, true, 0);
        if (this.field1398) {
            this.field1463.method188(40, 2, this.field1362, 239, 0);
            this.field1463.method188(60, 2, this.field1364 + "*", 239, 128);
        } else if (this.field1213) {
            this.field1463.method188(40, 2, "Enter amount to transfer:", 239, 0);
            this.field1463.method188(60, 2, this.field1267 + "*", 239, 128);
        } else if (this.field1295 != null) {
            this.field1463.method188(40, 2, this.field1295, 239, 0);
            this.field1463.method188(60, 2, "Click to continue", 239, 128);
        } else if (this.field1455 != -1) {
            this.method434(Component.field973[this.field1455], 0, 0, 0, 0);
        } else if (this.field1202 != -1) {
            this.method434(Component.field973[this.field1202], 0, 0, 0, 0);
        } else {
            PixFont var2 = this.field1462;
            int var3 = 0;
            Pix2D.method147(0, 0, 463, 77, 0);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1131[var4] != null) {
                    int var5 = this.field1129[var4];
                    int var6 = 70 - var3 * 14 + this.field1322;
                    if (var5 == 0) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(476, var6, this.field1131[var4], 4, 0);
                        }
                        ++var3;
                    }
                    if (var5 == 1) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(476, var6, this.field1130[var4] + ":", 4, 16777215);
                            var2.method191(476, var6, this.field1131[var4], 12 + var2.method190(this.field1130[var4], 9), 255);
                        }
                        ++var3;
                    }
                    if (var5 == 2 && (this.field1170 == 0 || this.field1170 == 1 && this.method444(this.field1130[var4], true))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(476, var6, this.field1130[var4] + ":", 4, 0);
                            var2.method191(476, var6, this.field1131[var4], 12 + var2.method190(this.field1130[var4], 9), 255);
                        }
                        ++var3;
                    }
                    if ((var5 == 3 || var5 == 7) && this.field1400 == 0 && (var5 == 7 || this.field1253 == 0 || this.field1253 == 1 && this.method444(this.field1130[var4], true))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(476, var6, "From " + this.field1130[var4] + ":", 4, 0);
                            var2.method191(476, var6, this.field1131[var4], 12 + var2.method190("From " + this.field1130[var4], 9), 8388608);
                        }
                        ++var3;
                    }
                    if (var5 == 4 && (this.field1354 == 0 || this.field1354 == 1 && this.method444(this.field1130[var4], true))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(476, var6, this.field1130[var4] + " " + this.field1131[var4], 4, 8388736);
                        }
                        ++var3;
                    }
                    if (var5 == 5 && this.field1400 == 0 && this.field1253 < 2) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(476, var6, this.field1131[var4], 4, 8388608);
                        }
                        ++var3;
                    }
                    if (var5 == 6 && this.field1400 == 0 && this.field1253 < 2) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(476, var6, "To " + this.field1130[var4] + ":", 4, 0);
                            var2.method191(476, var6, this.field1131[var4], 12 + var2.method190("To " + this.field1130[var4], 9), 8388608);
                        }
                        ++var3;
                    }
                    if (var5 == 8 && (this.field1354 == 0 || this.field1354 == 1 && this.method444(this.field1130[var4], true))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(476, var6, this.field1130[var4] + " " + this.field1131[var4], 4, 13350793);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method146((byte) 0);
            this.field1457 = var3 * 14 + 7;
            if (this.field1457 < 78) {
                this.field1457 = 78;
            }
            this.method392(this.field1457, 77, this.field1457 - this.field1322 - 77, 0, 463, (byte) -99);
            var2.method191(476, 90, JString.method255(this.field1402, true) + ":", 4, 0);
            var2.method191(476, 90, this.field1189 + "*", 6 + var2.method190(this.field1402 + ": ", 9), 255);
            Pix2D.method151(479, 77, this.field1350, 0, 0);
        }
        if (this.field1381 && this.field1433 == 2) {
            this.method379((byte) 5);
        }
        this.field1491.method236(375, 22, -715, super.field12);
        this.field1490.method235(0);
        Pix3D.field563 = this.field1166;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBII)I")
    public final int method420(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg2 >> 7;
        if (arg1 != -60) {
            return 2;
        } else {
            int var7 = arg3;
            if (arg3 < 3 && (this.field1323[1][var5][var6] & 2) == 2) {
                var7 = arg3 + 1;
            }
            int var8 = arg0 & 127;
            int var9 = arg2 & 127;
            int var10 = (128 - var8) * this.field1163[var7][var5][var6] + this.field1163[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field1163[var7][var5][var6 + 1] + this.field1163[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lhc;IIIZII)V")
    public final void method421(Component arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg0.field980 == 0 && arg0.field994 != null && !arg0.field993) {
            if (arg6 >= arg5 && arg2 >= arg1 && arg6 <= arg0.field983 + arg5 && arg2 <= arg0.field984 + arg1) {
                int var8 = arg0.field994.length;
                if (arg4) {
                    this.field1270 = this.field1178.method209();
                }
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg0.field995[var9] + arg5;
                    int var11 = arg0.field996[var9] + arg1 - arg3;
                    Component var12 = Component.field973[arg0.field994[var9]];
                    int var13 = var12.field985 + var10;
                    int var14 = var12.field986 + var11;
                    if ((var12.field990 >= 0 || var12.field1016 != 0) && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field983 + var13 && arg2 < var12.field984 + var14) {
                        if (var12.field990 >= 0) {
                            this.field1523 = var12.field990;
                        } else {
                            this.field1523 = var12.field978;
                        }
                    }
                    if (var12.field980 == 0) {
                        this.method421(var12, var14, arg2, var12.field992, false, var13, arg6);
                        if (var12.field991 > var12.field984) {
                            this.method400(this.field1499, var14, var12.field991, arg6, var12, arg2, var12.field984, var12.field983 + var13, true);
                        }
                    } else {
                        if (var12.field981 == 1 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field983 + var13 && arg2 < var12.field984 + var14) {
                            boolean var15 = false;
                            if (var12.field982 != 0) {
                                var15 = this.method455(false, var12);
                            }
                            if (!var15) {
                                this.field1330[this.field1144] = var12.field1029;
                                this.field1293[this.field1144] = 706;
                                this.field1292[this.field1144] = var12.field978;
                                ++this.field1144;
                            }
                        }
                        if (var12.field981 == 2 && this.field1502 == 0 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field983 + var13 && arg2 < var12.field984 + var14) {
                            String var16 = var12.field1026;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field1330[this.field1144] = var16 + " @gre@" + var12.field1027;
                            this.field1293[this.field1144] = 941;
                            this.field1292[this.field1144] = var12.field978;
                            ++this.field1144;
                        }
                        if (var12.field981 == 3 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field983 + var13 && arg2 < var12.field984 + var14) {
                            this.field1330[this.field1144] = "Close";
                            this.field1293[this.field1144] = 309;
                            this.field1292[this.field1144] = var12.field978;
                            ++this.field1144;
                        }
                        if (var12.field981 == 4 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field983 + var13 && arg2 < var12.field984 + var14) {
                            this.field1330[this.field1144] = var12.field1029;
                            this.field1293[this.field1144] = 967;
                            this.field1292[this.field1144] = var12.field978;
                            ++this.field1144;
                        }
                        if (var12.field981 == 5 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field983 + var13 && arg2 < var12.field984 + var14) {
                            this.field1330[this.field1144] = var12.field1029;
                            this.field1293[this.field1144] = 672;
                            this.field1292[this.field1144] = var12.field978;
                            ++this.field1144;
                        }
                        if (var12.field981 == 6 && !this.field1365 && arg6 >= var13 && arg2 >= var14 && arg6 < var12.field983 + var13 && arg2 < var12.field984 + var14) {
                            this.field1330[this.field1144] = var12.field1029;
                            this.field1293[this.field1144] = 73;
                            this.field1292[this.field1144] = var12.field978;
                            ++this.field1144;
                        }
                        if (var12.field980 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field984; ++var18) {
                                for (int var19 = 0; var19 < var12.field983; ++var19) {
                                    int var20 = (var12.field1002 + 32) * var19 + var13;
                                    int var21 = (var12.field1003 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field1005[var17];
                                        var21 += var12.field1006[var17];
                                    }
                                    if (arg6 >= var20 && arg2 >= var21 && arg6 < var20 + 32 && arg2 < var21 + 32) {
                                        this.field1115 = var17;
                                        this.field1116 = var12.field978;
                                        if (var12.field974[var17] > 0) {
                                            ObjType var22 = ObjType.method287(var12.field974[var17] - 1);
                                            if (this.field1246 == 1 && var12.field1000) {
                                                if (this.field1248 != var12.field978 || this.field1247 != var17) {
                                                    this.field1330[this.field1144] = "Use " + this.field1250 + " with @lre@" + var22.field897;
                                                    this.field1293[this.field1144] = 237;
                                                    this.field1294[this.field1144] = var22.field895;
                                                    this.field1291[this.field1144] = var17;
                                                    this.field1292[this.field1144] = var12.field978;
                                                    ++this.field1144;
                                                }
                                            } else if (this.field1502 == 1 && var12.field1000) {
                                                if ((this.field1504 & 16) == 16) {
                                                    this.field1330[this.field1144] = this.field1505 + " @lre@" + var22.field897;
                                                    this.field1293[this.field1144] = 63;
                                                    this.field1294[this.field1144] = var22.field895;
                                                    this.field1291[this.field1144] = var17;
                                                    this.field1292[this.field1144] = var12.field978;
                                                    ++this.field1144;
                                                }
                                            } else {
                                                if (var12.field1000) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field913 != null && var22.field913[var23] != null) {
                                                            this.field1330[this.field1144] = var22.field913[var23] + " @lre@" + var22.field897;
                                                            if (var23 == 3) {
                                                                this.field1293[this.field1144] = 120;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field1293[this.field1144] = 796;
                                                            }
                                                            this.field1294[this.field1144] = var22.field895;
                                                            this.field1291[this.field1144] = var17;
                                                            this.field1292[this.field1144] = var12.field978;
                                                            ++this.field1144;
                                                        } else if (var23 == 4) {
                                                            this.field1330[this.field1144] = "Drop @lre@" + var22.field897;
                                                            this.field1293[this.field1144] = 796;
                                                            this.field1294[this.field1144] = var22.field895;
                                                            this.field1291[this.field1144] = var17;
                                                            this.field1292[this.field1144] = var12.field978;
                                                            ++this.field1144;
                                                        }
                                                    }
                                                }
                                                if (var12.field1001) {
                                                    this.field1330[this.field1144] = "Use @lre@" + var22.field897;
                                                    this.field1293[this.field1144] = 357;
                                                    this.field1294[this.field1144] = var22.field895;
                                                    this.field1291[this.field1144] = var17;
                                                    this.field1292[this.field1144] = var12.field978;
                                                    ++this.field1144;
                                                }
                                                if (var12.field1000 && var22.field913 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field913[var24] != null) {
                                                            this.field1330[this.field1144] = var22.field913[var24] + " @lre@" + var22.field897;
                                                            if (var24 == 0) {
                                                                this.field1293[this.field1144] = 871;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1293[this.field1144] = 526;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1293[this.field1144] = 156;
                                                            }
                                                            this.field1294[this.field1144] = var22.field895;
                                                            this.field1291[this.field1144] = var17;
                                                            this.field1292[this.field1144] = var12.field978;
                                                            ++this.field1144;
                                                        }
                                                    }
                                                }
                                                if (var12.field1007 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field1007[var25] != null) {
                                                            this.field1330[this.field1144] = var12.field1007[var25] + " @lre@" + var22.field897;
                                                            if (var25 == 0) {
                                                                this.field1293[this.field1144] = 134;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1293[this.field1144] = 701;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1293[this.field1144] = 570;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field1293[this.field1144] = 719;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field1293[this.field1144] = 440;
                                                            }
                                                            this.field1294[this.field1144] = var22.field895;
                                                            this.field1291[this.field1144] = var17;
                                                            this.field1292[this.field1144] = var12.field978;
                                                            ++this.field1144;
                                                        }
                                                    }
                                                }
                                                this.field1330[this.field1144] = "Examine @lre@" + var22.field897;
                                                this.field1293[this.field1144] = 1974;
                                                this.field1294[this.field1144] = var22.field895;
                                                this.field1292[this.field1144] = var12.field975[var17];
                                                ++this.field1144;
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    private static final String method422(int arg0, int arg1) {
        int var2 = 84 / arg1;
        String var3 = String.valueOf(arg0);
        for (int var4 = var3.length() - 3; var4 > 0; var4 -= 3) {
            var3 = var3.substring(0, var4) + "," + var3.substring(var4);
        }
        if (var3.length() > 8) {
            var3 = "@gre@" + var3.substring(0, var3.length() - 8) + " million @whi@(" + var3 + ")";
        } else if (var3.length() > 4) {
            var3 = "@cya@" + var3.substring(0, var3.length() - 4) + "K @whi@(" + var3 + ")";
        }
        return " " + var3;
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)Z")
    public final boolean method423(int arg0) {
        label1111: while (true) {
            if (arg0 >= 0) {
                int var2 = 1;
                while (true) {
                    if (var2 <= 0) {
                        continue label1111;
                    }
                    ++var2;
                }
            }
            if (this.field1396 == null) {
                return false;
            }
            try {
                int var3 = this.field1396.method31();
                if (var3 == 0) {
                    return false;
                }
                if (this.field1270 == -1) {
                    this.field1396.method32(this.field1178.field622, 0, 1);
                    this.field1270 = this.field1178.field622[0] & 255;
                    if (this.field1124 != null) {
                        this.field1270 = this.field1270 - this.field1124.method246() & 255;
                    }
                    this.field1269 = Protocol.field931[this.field1270];
                    --var3;
                }
                if (this.field1269 == -1) {
                    if (var3 <= 0) {
                        return false;
                    }
                    this.field1396.method32(this.field1178.field622, 0, 1);
                    this.field1269 = this.field1178.field622[0] & 255;
                    --var3;
                }
                if (this.field1269 == -2) {
                    if (var3 <= 1) {
                        return false;
                    }
                    this.field1396.method32(this.field1178.field622, 0, 2);
                    this.field1178.field623 = 0;
                    this.field1269 = this.field1178.method211();
                    var3 -= 2;
                }
                if (var3 < this.field1269) {
                    return false;
                }
                this.field1178.field623 = 0;
                this.field1396.method32(this.field1178.field622, 0, this.field1269);
                this.field1271 = 0;
                this.field1480 = this.field1479;
                this.field1479 = this.field1478;
                this.field1478 = this.field1270;
                if (this.field1270 == 98) {
                    this.field1119 = this.field1178.method209();
                    if (this.field1251 == this.field1119) {
                        if (this.field1119 == 3) {
                            this.field1251 = 1;
                        } else {
                            this.field1251 = 3;
                        }
                        this.field1197 = true;
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 212) {
                    int var4 = this.field1178.method211();
                    int var5 = this.field1178.method211();
                    int var6 = var5 >> 10 & 31;
                    int var7 = var5 >> 5 & 31;
                    int var8 = var5 & 31;
                    Component.field973[var4].field1014 = (var8 << 3) + (var6 << 19) + (var7 << 11);
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 213) {
                    this.field1170 = this.field1178.method209();
                    this.field1253 = this.field1178.method209();
                    this.field1354 = this.field1178.method209();
                    this.field1297 = true;
                    this.field1161 = true;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 106) {
                    int var9 = this.field1178.method211();
                    this.method483(var9, 972);
                    if (this.field1339 != -1) {
                        this.field1339 = -1;
                        this.field1197 = true;
                        this.field1152 = true;
                    }
                    this.field1455 = var9;
                    this.field1161 = true;
                    this.field1290 = -1;
                    this.field1365 = false;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 191) {
                    int var10 = this.field1178.method211();
                    int var11 = this.field1178.method212();
                    int var12 = this.field1178.method212();
                    Component var13 = Component.field973[var10];
                    var13.field985 = var11;
                    var13.field986 = var12;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 71) {
                    int var14 = this.field1178.method209();
                    int var15 = this.field1178.method209();
                    int var16 = this.field1178.method209();
                    int var17 = this.field1178.method209();
                    this.field1418[var14] = true;
                    this.field1342[var14] = var15;
                    this.field1456[var14] = var16;
                    this.field1458[var14] = var17;
                    this.field1494[var14] = 0;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 12) {
                    int var18 = this.field1178.method209();
                    int var19 = this.field1178.method209();
                    int var20 = -1;
                    for (int var21 = 0; var21 < this.field1215.length; ++var21) {
                        if ((var18 << 8) + var19 == this.field1215[var21]) {
                            var20 = var21;
                        }
                    }
                    if (var20 != -1) {
                        signlink.cachesave("m" + var18 + "_" + var19, this.field1150[var20]);
                        this.field1226 = 1;
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 35) {
                    int var22 = this.field1178.method209();
                    int var23 = this.field1178.method209();
                    int var24 = this.field1178.method211();
                    int var25 = this.field1178.method211();
                    int var26 = -1;
                    for (int var27 = 0; var27 < this.field1215.length; ++var27) {
                        if ((var22 << 8) + var23 == this.field1215[var27]) {
                            var26 = var27;
                        }
                    }
                    if (var26 != -1) {
                        if (this.field1483[var26] == null || this.field1483[var26].length != var25) {
                            this.field1483[var26] = new byte[var25];
                        }
                        this.field1178.method218(var24, this.field1269 - 6, this.field1483[var26], this.field1274);
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 250) {
                    this.field1198 = this.field1178.method209();
                    this.field1199 = this.field1178.method209();
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 253) {
                    int var28 = this.field1178.method211();
                    int var29 = this.field1178.method211();
                    int var30 = this.field1178.method211();
                    Component var31 = Component.field973[var28];
                    Model var32 = var31.field1019;
                    if (var32 != null) {
                        var32.method133(var29, var30);
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 248) {
                    int var33 = this.field1178.method211();
                    int var34 = this.field1178.method211();
                    Component.field973[var33].field1019 = new Model(var34, 6);
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 230) {
                    if (this.field1351 && !field1359) {
                        int var35 = this.field1178.method211();
                        int var36 = this.field1178.method214();
                        int var37 = this.field1269 - 6;
                        byte[] var38 = new byte[var36];
                        BZip2.method238(var38, var36, this.field1178.field622, var37, this.field1178.field623);
                        this.method366(var36, 1, var38, false);
                        this.field1363 = var35;
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 140) {
                    long var39 = this.field1178.method215((byte) 2);
                    int var41 = this.field1178.method209();
                    String var42 = JString.method255(JString.method252(var39, (byte) -74), true);
                    for (int var43 = 0; var43 < this.field1395; ++var43) {
                        if (this.field1539[var43] == var39) {
                            if (this.field1389[var43] != var41) {
                                this.field1389[var43] = var41;
                                this.field1197 = true;
                                if (var41 > 0) {
                                    this.method382(5, 0, "", var42 + " has logged in.");
                                }
                                if (var41 == 0) {
                                    this.method382(5, 0, "", var42 + " has logged out.");
                                }
                            }
                            var42 = null;
                            break;
                        }
                    }
                    if (var42 != null && this.field1395 < 100) {
                        this.field1539[this.field1395] = var39;
                        this.field1283[this.field1395] = var42;
                        this.field1389[this.field1395] = var41;
                        ++this.field1395;
                        this.field1197 = true;
                    }
                    boolean var44 = false;
                    while (!var44) {
                        var44 = true;
                        for (int var45 = 0; var45 < this.field1395 - 1; ++var45) {
                            if (this.field1389[var45] != field1356 && this.field1389[var45 + 1] == field1356 || this.field1389[var45] == 0 && this.field1389[var45 + 1] != 0) {
                                int var46 = this.field1389[var45];
                                this.field1389[var45] = this.field1389[var45 + 1];
                                this.field1389[var45 + 1] = var46;
                                String var47 = this.field1283[var45];
                                this.field1283[var45] = this.field1283[var45 + 1];
                                this.field1283[var45 + 1] = var47;
                                long var48 = this.field1539[var45];
                                this.field1539[var45] = this.field1539[var45 + 1];
                                this.field1539[var45 + 1] = var48;
                                this.field1197 = true;
                                var44 = false;
                            }
                        }
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 132) {
                    InputTracking.method35(0, true);
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 55) {
                    for (int var50 = 0; var50 < this.field1135.length; ++var50) {
                        if (this.field1135[var50] != null) {
                            this.field1135[var50].field333 = -1;
                        }
                    }
                    for (int var51 = 0; var51 < this.field1208.length; ++var51) {
                        if (this.field1208[var51] != null) {
                            this.field1208[var51].field333 = -1;
                        }
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 218) {
                    int var52 = this.field1178.method211();
                    boolean var53 = this.field1178.method209() == 1;
                    Component.field973[var52].field993 = var53;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 113) {
                    this.field1258 = this.field1269 / 8;
                    for (int var54 = 0; var54 < this.field1258; ++var54) {
                        this.field1471[var54] = this.field1178.method215((byte) 2);
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 125) {
                    this.field1421 = 0;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 235) {
                    int var55 = this.field1178.method211();
                    int var56 = this.field1178.method214();
                    this.field1540[var55] = var56;
                    if (this.field1196[var55] != var56) {
                        this.field1196[var55] = var56;
                        this.method487(0, var55);
                        this.field1197 = true;
                        if (this.field1202 != -1) {
                            this.field1161 = true;
                        }
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 174) {
                    this.field1360 = true;
                    this.field1334 = this.field1178.method209();
                    this.field1335 = this.field1178.method209();
                    this.field1336 = this.field1178.method211();
                    this.field1337 = this.field1178.method209();
                    this.field1338 = this.field1178.method209();
                    if (this.field1338 >= 100) {
                        this.field1343 = this.field1334 * 128 + 64;
                        this.field1345 = this.field1335 * 128 + 64;
                        this.field1344 = this.method420(this.field1334, this.field1221, this.field1335, this.field1545) - this.field1336;
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 47) {
                    this.field1360 = false;
                    for (int var57 = 0; var57 < 5; ++var57) {
                        this.field1418[var57] = false;
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 48) {
                    int var58 = this.field1178.method211();
                    int var59 = this.field1178.method211();
                    NpcType var60 = NpcType.method281(var59);
                    Component.field973[var58].field1019 = var60.method284(509);
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 240) {
                    this.field1360 = true;
                    this.field1466 = this.field1178.method209();
                    this.field1467 = this.field1178.method209();
                    this.field1468 = this.field1178.method211();
                    this.field1469 = this.field1178.method209();
                    this.field1470 = this.field1178.method209();
                    if (this.field1470 >= 100) {
                        int var61 = this.field1466 * 128 + 64;
                        int var62 = this.field1467 * 128 + 64;
                        int var63 = this.method420(this.field1466, this.field1221, this.field1467, this.field1545) - this.field1468;
                        int var64 = var61 - this.field1343;
                        int var65 = var63 - this.field1344;
                        int var66 = var62 - this.field1345;
                        int var67 = (int) Math.sqrt((double) (var64 * var64 + var66 * var66));
                        this.field1346 = (int) (Math.atan2((double) var65, (double) var67) * 325.949D) & 2047;
                        this.field1347 = (int) (Math.atan2((double) var64, (double) var66) * -325.949D) & 2047;
                        if (this.field1346 < 128) {
                            this.field1346 = 128;
                        }
                        if (this.field1346 > 383) {
                            this.field1346 = 383;
                        }
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 201) {
                    long var68 = this.field1178.method215((byte) 2);
                    int var70 = this.field1178.method214();
                    int var71 = this.field1178.method209();
                    boolean var72 = false;
                    for (int var73 = 0; var73 < 100; ++var73) {
                        if (this.field1244[var73] == var70) {
                            var72 = true;
                            break;
                        }
                    }
                    if (var71 <= 1) {
                        for (int var74 = 0; var74 < this.field1258; ++var74) {
                            if (this.field1471[var74] == var68) {
                                var72 = true;
                                break;
                            }
                        }
                    }
                    if (!var72 && this.field1536 == 0) {
                        try {
                            this.field1244[this.field1518] = var70;
                            this.field1518 = (this.field1518 + 1) % 100;
                            String var75 = WordPack.method258(-679, this.field1269 - 13, this.field1178);
                            String var76 = WordFilter.method335(var75, true);
                            if (var71 > 1) {
                                this.method382(7, 0, JString.method255(JString.method252(var68, (byte) -74), true), var76);
                            } else {
                                this.method382(3, 0, JString.method255(JString.method252(var68, (byte) -74), true), var76);
                            }
                        } catch (Exception var182) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 186) {
                    int var78 = this.field1178.method211();
                    Component var79 = Component.field973[var78];
                    for (int var80 = 0; var80 < var79.field974.length; ++var80) {
                        var79.field974[var80] = -1;
                        var79.field974[var80] = 0;
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 231) {
                    int var81 = this.field1178.method211();
                    int var82 = this.field1178.method211();
                    if (this.field1455 != -1) {
                        this.field1455 = -1;
                        this.field1161 = true;
                    }
                    if (this.field1213) {
                        this.field1213 = false;
                        this.field1161 = true;
                    }
                    this.field1290 = var81;
                    this.field1339 = var82;
                    this.field1197 = true;
                    this.field1152 = true;
                    this.field1365 = false;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 255) {
                    if (this.field1339 != -1) {
                        this.field1339 = -1;
                        this.field1197 = true;
                        this.field1152 = true;
                    }
                    if (this.field1455 != -1) {
                        this.field1455 = -1;
                        this.field1161 = true;
                    }
                    if (this.field1213) {
                        this.field1213 = false;
                        this.field1161 = true;
                    }
                    this.field1290 = -1;
                    this.field1365 = false;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 202) {
                    int var83 = this.field1178.method211();
                    int var84 = this.field1178.method209();
                    int var85 = this.field1178.method211();
                    if (this.field1394 && !field1359 && this.field1201 < 50) {
                        this.field1440[this.field1201] = var83;
                        this.field1245[this.field1201] = var84;
                        this.field1391[this.field1201] = Wave.field775[var83] + var85;
                        ++this.field1201;
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 216) {
                    for (int var86 = 0; var86 < this.field1196.length; ++var86) {
                        if (this.field1540[var86] != this.field1196[var86]) {
                            this.field1196[var86] = this.field1540[var86];
                            this.method487(0, var86);
                            this.field1197 = true;
                        }
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 33) {
                    int var87 = this.field1178.method211();
                    int var88 = this.field1178.method211();
                    int var89 = this.field1178.method211();
                    ObjType var90 = ObjType.method287(var88);
                    Component.field973[var87].field1019 = var90.method291(50);
                    Component.field973[var87].field1024 = var90.field902;
                    Component.field973[var87].field1025 = var90.field903;
                    Component.field973[var87].field1023 = var90.field901 * 100 / var89;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 39) {
                    this.method465((byte) 117);
                    this.field1270 = -1;
                    return false;
                }
                if (this.field1270 == 169) {
                    int var91 = this.field1178.method211();
                    Component.field973[var91].field1019 = this.field1492.method115(true);
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 57) {
                    if (this.field1251 == 12) {
                        this.field1197 = true;
                    }
                    this.field1171 = this.field1178.method212();
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 153) {
                    int var92 = this.field1178.method211();
                    this.method483(var92, 972);
                    if (this.field1455 != -1) {
                        this.field1455 = -1;
                        this.field1161 = true;
                    }
                    if (this.field1213) {
                        this.field1213 = false;
                        this.field1161 = true;
                    }
                    this.field1339 = var92;
                    this.field1197 = true;
                    this.field1152 = true;
                    this.field1290 = -1;
                    this.field1365 = false;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 176) {
                    int var93 = this.field1178.method211();
                    String var94 = this.field1178.method216();
                    Component.field973[var93].field1012 = var94;
                    if (this.field1277[this.field1251] == Component.field973[var93].field979) {
                        this.field1197 = true;
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 3) {
                    int var95 = this.field1178.method211();
                    int var96 = this.field1178.method211();
                    if (this.field1428 == var95 && this.field1429 == var96 && this.field1226 != 0) {
                        this.field1270 = -1;
                        return true;
                    }
                    this.field1428 = var95;
                    this.field1429 = var96;
                    this.field1448 = (this.field1428 - 6) * 8;
                    this.field1449 = (this.field1429 - 6) * 8;
                    this.field1226 = 1;
                    this.field1490.method235(0);
                    this.field1462.method188(151, 2, "Loading - please wait.", 257, 0);
                    this.field1462.method188(150, 2, "Loading - please wait.", 256, 16777215);
                    this.field1490.method236(11, 8, -715, super.field12);
                    signlink.looprate(5);
                    int var97 = (this.field1269 - 2) / 10;
                    this.field1150 = new byte[var97][];
                    this.field1483 = new byte[var97][];
                    this.field1215 = new int[var97];
                    this.field1195.method198(9, 131);
                    this.field1195.method199(0);
                    int var98 = 0;
                    for (int var99 = 0; var99 < var97; ++var99) {
                        int var100 = this.field1178.method209();
                        int var101 = this.field1178.method209();
                        int var102 = this.field1178.method214();
                        int var103 = this.field1178.method214();
                        this.field1215[var99] = (var100 << 8) + var101;
                        if (var102 != 0) {
                            byte[] var104 = signlink.cacheload("m" + var100 + "_" + var101);
                            if (var104 != null) {
                                this.field1286.reset();
                                this.field1286.update(var104);
                                if ((int) this.field1286.getValue() != var102) {
                                    var104 = null;
                                }
                            }
                            if (var104 != null) {
                                this.field1150[var99] = var104;
                            } else {
                                this.field1226 = 0;
                                this.field1195.method199(0);
                                this.field1195.method199(var100);
                                this.field1195.method199(var101);
                                var98 += 3;
                            }
                        }
                        if (var103 != 0) {
                            byte[] var105 = signlink.cacheload("l" + var100 + "_" + var101);
                            if (var105 != null) {
                                this.field1286.reset();
                                this.field1286.update(var105);
                                if ((int) this.field1286.getValue() != var103) {
                                    var105 = null;
                                }
                            }
                            if (var105 != null) {
                                this.field1483[var99] = var105;
                            } else {
                                this.field1226 = 0;
                                this.field1195.method199(1);
                                this.field1195.method199(var100);
                                this.field1195.method199(var101);
                                var98 += 3;
                            }
                        }
                    }
                    this.field1195.method208(var98, 9026);
                    signlink.looprate(50);
                    this.field1490.method235(0);
                    if (this.field1226 == 0) {
                        this.field1462.method188(166, 2, "Map area updated since last visit, so load will take longer this time only", 257, 0);
                        this.field1462.method188(165, 2, "Map area updated since last visit, so load will take longer this time only", 256, 16777215);
                    }
                    this.field1490.method236(11, 8, -715, super.field12);
                    int var106 = this.field1448 - this.field1450;
                    int var107 = this.field1449 - this.field1451;
                    this.field1450 = this.field1448;
                    this.field1451 = this.field1449;
                    for (int var108 = 0; var108 < 8192; ++var108) {
                        NpcEntity var109 = this.field1208[var108];
                        if (var109 != null) {
                            for (int var110 = 0; var110 < 10; ++var110) {
                                var109.field354[var110] -= var106;
                                var109.field355[var110] -= var107;
                            }
                            var109.field306 -= var106 * 128;
                            var109.field307 -= var107 * 128;
                        }
                    }
                    for (int var111 = 0; var111 < this.field1133; ++var111) {
                        PlayerEntity var112 = this.field1135[var111];
                        if (var112 != null) {
                            for (int var113 = 0; var113 < 10; ++var113) {
                                var112.field354[var113] -= var106;
                                var112.field355[var113] -= var107;
                            }
                            var112.field306 -= var106 * 128;
                            var112.field307 -= var107 * 128;
                        }
                    }
                    byte var114 = 0;
                    byte var115 = 104;
                    byte var116 = 1;
                    if (var106 < 0) {
                        var114 = 103;
                        var115 = -1;
                        var116 = -1;
                    }
                    byte var117 = 0;
                    byte var118 = 104;
                    byte var119 = 1;
                    if (var107 < 0) {
                        var117 = 103;
                        var118 = -1;
                        var119 = -1;
                    }
                    for (int var120 = var114; var115 != var120; var120 += var116) {
                        for (int var121 = var117; var118 != var121; var121 += var119) {
                            int var122 = var106 + var120;
                            int var123 = var107 + var121;
                            for (int var124 = 0; var124 < 4; ++var124) {
                                if (var122 >= 0 && var123 >= 0 && var122 < 104 && var123 < 104) {
                                    this.field1447[var124][var120][var121] = this.field1447[var124][var122][var123];
                                } else {
                                    this.field1447[var124][var120][var121] = null;
                                }
                            }
                        }
                    }
                    for (LocMerged var125 = (LocMerged) this.field1113.method228(); var125 != null; var125 = (LocMerged) this.field1113.method230(this.field1162)) {
                        var125.field637 -= var106;
                        var125.field638 -= var107;
                        if (var125.field637 < 0 || var125.field638 < 0 || var125.field637 >= 104 || var125.field638 >= 104) {
                            var125.method107();
                        }
                    }
                    if (this.field1421 != 0) {
                        this.field1421 -= var106;
                        this.field1422 -= var107;
                    }
                    this.field1360 = false;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 165) {
                    int var126 = this.field1178.method212();
                    this.field1202 = var126;
                    this.field1161 = true;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 147) {
                    this.field1198 = this.field1178.method209();
                    this.field1199 = this.field1178.method209();
                    for (int var127 = this.field1198; var127 < this.field1198 + 8; ++var127) {
                        for (int var128 = this.field1199; var128 < this.field1199 + 8; ++var128) {
                            if (this.field1447[this.field1545][var127][var128] != null) {
                                this.field1447[this.field1545][var127][var128] = null;
                                this.method437(var127, var128);
                            }
                        }
                    }
                    for (LocMerged var129 = (LocMerged) this.field1113.method228(); var129 != null; var129 = (LocMerged) this.field1113.method230(this.field1162)) {
                        if (var129.field637 >= this.field1198 && var129.field637 < this.field1198 + 8 && var129.field638 >= this.field1199 && var129.field638 < this.field1199 + 8 && this.field1545 == var129.field635) {
                            this.method376(0, var129.field643, var129.field637, var129.field638, var129.field642, var129.field635, var129.field644, var129.field636);
                            var129.method107();
                        }
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 85) {
                    this.field1251 = this.field1178.method209();
                    this.field1197 = true;
                    this.field1152 = true;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 107) {
                    if (this.field1251 == 12) {
                        this.field1197 = true;
                    }
                    this.field1392 = this.field1178.method209();
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 192) {
                    this.field1198 = this.field1178.method209();
                    this.field1199 = this.field1178.method209();
                    while (this.field1178.field623 < this.field1269) {
                        int var130 = this.field1178.method209();
                        this.method433(var130, true, this.field1178);
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 38) {
                    this.field1197 = true;
                    int var131 = this.field1178.method211();
                    Component var132 = Component.field973[var131];
                    while (this.field1178.field623 < this.field1269) {
                        int var133 = this.field1178.method209();
                        int var134 = this.field1178.method211();
                        int var135 = this.field1178.method209();
                        if (var135 == 255) {
                            var135 = this.field1178.method214();
                        }
                        if (var133 >= 0 && var133 < var132.field974.length) {
                            var132.field974[var133] = var134;
                            var132.field975[var133] = var135;
                        }
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 80) {
                    int var136 = this.field1178.method211();
                    int var137 = this.field1178.method211();
                    Component.field973[var136].field1021 = var137;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 100) {
                    int var138 = this.field1178.method211();
                    int var139 = this.field1178.method209();
                    if (var138 == 65535) {
                        var138 = -1;
                    }
                    this.field1277[var139] = var138;
                    this.field1197 = true;
                    this.field1152 = true;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 128) {
                    this.method415(this.field1178, this.field1269, false);
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 242) {
                    this.field1207 = this.field1178.method211() * 30;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 177) {
                    this.field1206 = this.field1178.method211();
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 112) {
                    String var140 = this.field1178.method216();
                    if (var140.endsWith(":tradereq:")) {
                        String var141 = var140.substring(0, var140.indexOf(":"));
                        long var142 = JString.method251(var141);
                        boolean var144 = false;
                        for (int var145 = 0; var145 < this.field1258; ++var145) {
                            if (this.field1471[var145] == var142) {
                                var144 = true;
                                break;
                            }
                        }
                        if (!var144 && this.field1536 == 0) {
                            this.method382(4, 0, var141, "wishes to trade with you.");
                        }
                    } else if (!var140.endsWith(":duelreq:")) {
                        this.method382(0, 0, "", var140);
                    } else {
                        String var146 = var140.substring(0, var140.indexOf(":"));
                        long var147 = JString.method251(var146);
                        boolean var149 = false;
                        for (int var150 = 0; var150 < this.field1258; ++var150) {
                            if (this.field1471[var150] == var147) {
                                var149 = true;
                                break;
                            }
                        }
                        if (!var149 && this.field1536 == 0) {
                            this.method382(8, 0, var146, "wishes to duel with you.");
                        }
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 42) {
                    this.field1252 = this.field1178.method209();
                    if (this.field1252 == 1) {
                        this.field1481 = this.field1178.method211();
                    }
                    if (this.field1252 >= 2 && this.field1252 <= 6) {
                        if (this.field1252 == 2) {
                            this.field1527 = 64;
                            this.field1528 = 64;
                        }
                        if (this.field1252 == 3) {
                            this.field1527 = 0;
                            this.field1528 = 64;
                        }
                        if (this.field1252 == 4) {
                            this.field1527 = 128;
                            this.field1528 = 64;
                        }
                        if (this.field1252 == 5) {
                            this.field1527 = 64;
                            this.field1528 = 0;
                        }
                        if (this.field1252 == 6) {
                            this.field1527 = 64;
                            this.field1528 = 128;
                        }
                        this.field1252 = 2;
                        this.field1524 = this.field1178.method211();
                        this.field1525 = this.field1178.method211();
                        this.field1526 = this.field1178.method209();
                    }
                    if (this.field1252 == 10) {
                        this.field1444 = this.field1178.method211();
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 180) {
                    int var151 = this.field1178.method211();
                    this.method483(var151, 972);
                    if (this.field1339 != -1) {
                        this.field1339 = -1;
                        this.field1197 = true;
                        this.field1152 = true;
                    }
                    if (this.field1455 != -1) {
                        this.field1455 = -1;
                        this.field1161 = true;
                    }
                    if (this.field1213) {
                        this.field1213 = false;
                        this.field1161 = true;
                    }
                    this.field1290 = var151;
                    this.field1365 = false;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 66) {
                    int var152 = this.field1178.method209();
                    int var153 = this.field1178.method209();
                    int var154 = this.field1178.method211();
                    int var155 = this.field1178.method211();
                    int var156 = -1;
                    for (int var157 = 0; var157 < this.field1215.length; ++var157) {
                        if ((var152 << 8) + var153 == this.field1215[var157]) {
                            var156 = var157;
                        }
                    }
                    if (var156 != -1) {
                        if (this.field1150[var156] == null || this.field1150[var156].length != var155) {
                            this.field1150[var156] = new byte[var155];
                        }
                        this.field1178.method218(var154, this.field1269 - 6, this.field1150[var156], this.field1274);
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 72) {
                    this.field1401 = this.field1178.method209();
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 117 || this.field1270 == 25 || this.field1270 == 127 || this.field1270 == 195 || this.field1270 == 1 || this.field1270 == 61 || this.field1270 == 246 || this.field1270 == 78 || this.field1270 == 214 || this.field1270 == 220) {
                    this.method433(this.field1270, true, this.field1178);
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 60) {
                    int var158 = this.field1178.method209();
                    int var159 = this.field1178.method209();
                    int var160 = -1;
                    for (int var161 = 0; var161 < this.field1215.length; ++var161) {
                        if ((var158 << 8) + var159 == this.field1215[var161]) {
                            var160 = var161;
                        }
                    }
                    if (var160 != -1) {
                        signlink.cachesave("l" + var158 + "_" + var159, this.field1483[var160]);
                        this.field1226 = 1;
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 171) {
                    this.field1110 = this.field1178.method214();
                    this.field1508 = this.field1178.method211();
                    this.field1154 = this.field1178.method209();
                    this.field1203 = this.field1178.method211();
                    if (this.field1110 != 0 && this.field1290 == -1) {
                        signlink.dnslookup(JString.method254(this.field1110, -639));
                        this.method453(-24081);
                        short var162 = 650;
                        if (this.field1154 != 201) {
                            var162 = 655;
                        }
                        this.field1441 = "";
                        this.field1132 = false;
                        for (int var163 = 0; var163 < Component.field973.length; ++var163) {
                            if (Component.field973[var163] != null && Component.field973[var163].field982 == var162) {
                                this.field1290 = Component.field973[var163].field979;
                                break;
                            }
                        }
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 68) {
                    InputTracking.method34(40470);
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 92) {
                    String var164 = this.field1178.method216();
                    int var165 = this.field1178.method214();
                    int var166 = this.field1178.method214();
                    if (!var164.equals(this.field1521) && this.field1351 && !field1359) {
                        this.method459(var165, var164, 43166, var166);
                    }
                    this.field1521 = var164;
                    this.field1284 = var165;
                    this.field1424 = var166;
                    this.field1363 = 0;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 133) {
                    int var167 = this.field1178.method211();
                    byte var168 = this.field1178.method210();
                    this.field1540[var167] = var168;
                    if (this.field1196[var167] != var168) {
                        this.field1196[var167] = var168;
                        this.method487(0, var167);
                        this.field1197 = true;
                        if (this.field1202 != -1) {
                            this.field1161 = true;
                        }
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 49) {
                    this.method385(false, this.field1178, this.field1269);
                    if (this.field1226 == 1) {
                        this.field1226 = 2;
                        World.field37 = this.field1545;
                        this.method427(0);
                    }
                    if (field1359 && this.field1226 == 2 && World.field37 != this.field1545) {
                        this.field1490.method235(0);
                        this.field1462.method188(151, 2, "Loading - please wait.", 257, 0);
                        this.field1462.method188(150, 2, "Loading - please wait.", 256, 16777215);
                        this.field1490.method236(11, 8, -715, super.field12);
                        World.field37 = this.field1545;
                        this.method427(0);
                    }
                    if (this.field1545 != this.field1349 && this.field1226 == 2) {
                        this.field1349 = this.field1545;
                        this.method449(-88, this.field1545);
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 94) {
                    this.field1197 = true;
                    int var169 = this.field1178.method209();
                    int var170 = this.field1178.method214();
                    int var171 = this.field1178.method209();
                    this.field1177[var169] = var170;
                    this.field1385[var169] = var171;
                    this.field1420[var169] = 1;
                    for (int var172 = 0; var172 < 98; ++var172) {
                        if (var170 >= field1482[var172]) {
                            this.field1420[var169] = var172 + 2;
                        }
                    }
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 254) {
                    this.field1398 = false;
                    this.field1213 = true;
                    this.field1267 = "";
                    this.field1161 = true;
                    this.field1270 = -1;
                    return true;
                }
                if (this.field1270 == 123) {
                    this.field1197 = true;
                    int var173 = this.field1178.method211();
                    Component var174 = Component.field973[var173];
                    int var175 = this.field1178.method209();
                    for (int var176 = 0; var176 < var175; ++var176) {
                        var174.field974[var176] = this.field1178.method211();
                        int var177 = this.field1178.method209();
                        if (var177 == 255) {
                            var177 = this.field1178.method214();
                        }
                        var174.field975[var176] = var177;
                    }
                    for (int var178 = var175; var178 < var174.field974.length; ++var178) {
                        var174.field974[var178] = 0;
                        var174.field975[var178] = 0;
                    }
                    this.field1270 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1270 + "," + this.field1269 + " - " + this.field1479 + "," + this.field1480);
                this.method465((byte) 117);
            } catch (IOException var183) {
                this.method410(366);
            } catch (Exception var184) {
                String var180 = "T2 - " + this.field1270 + "," + this.field1479 + "," + this.field1480 + " - " + this.field1269 + "," + (this.field1492.field354[0] + this.field1448) + "," + (this.field1492.field355[0] + this.field1449) + " - ";
                for (int var181 = 0; var181 < this.field1269 && var181 < 50; ++var181) {
                    var180 = var180 + this.field1178.field622[var181] + ",";
                }
                signlink.reporterror(var180);
                this.method465((byte) 117);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;IB)V")
    private final void method424(Packet arg0, int arg1, byte arg2) {
        arg0.method219(561);
        int var4 = arg0.method220(1, (byte) 27);
        if (arg2 == 2) {
            boolean var5 = false;
        } else {
            this.field1388 = this.field1124.method246();
        }
        if (var4 != 0) {
            int var6 = arg0.method220(2, (byte) 27);
            if (var6 == 0) {
                this.field1139[this.field1138++] = this.field1134;
            } else if (var6 == 1) {
                int var7 = arg0.method220(3, (byte) 27);
                this.field1492.method110(false, var7, 5);
                int var8 = arg0.method220(1, (byte) 27);
                if (var8 == 1) {
                    this.field1139[this.field1138++] = this.field1134;
                }
            } else if (var6 == 2) {
                int var9 = arg0.method220(3, (byte) 27);
                this.field1492.method110(true, var9, 5);
                int var10 = arg0.method220(3, (byte) 27);
                this.field1492.method110(true, var10, 5);
                int var11 = arg0.method220(1, (byte) 27);
                if (var11 == 1) {
                    this.field1139[this.field1138++] = this.field1134;
                }
            } else if (var6 == 3) {
                this.field1545 = arg0.method220(2, (byte) 27);
                int var12 = arg0.method220(7, (byte) 27);
                int var13 = arg0.method220(7, (byte) 27);
                int var14 = arg0.method220(1, (byte) 27);
                this.field1492.method109(var13, true, var14 == 1, var12);
                int var15 = arg0.method220(1, (byte) 27);
                if (var15 == 1) {
                    this.field1139[this.field1138++] = this.field1134;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)Z")
    public final boolean method425(boolean arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field1293[arg1];
            if (!arg0) {
                this.field1222 = 280;
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 447;
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method426(int arg0) {
        while (arg0 >= 0) {
            this.field1195.method199(201);
        }
        if (this.field1407 == 0) {
            int var2 = super.field21;
            if (this.field1502 == 1 && super.field22 >= 520 && super.field23 >= 165 && super.field22 <= 788 && super.field23 <= 230) {
                var2 = 0;
            }
            if (this.field1381) {
                if (var2 != 1) {
                    int var3 = super.field19;
                    int var4 = super.field20;
                    if (this.field1433 == 0) {
                        var3 -= 8;
                        var4 -= 11;
                    }
                    if (this.field1433 == 1) {
                        var3 -= 562;
                        var4 -= 231;
                    }
                    if (this.field1433 == 2) {
                        var3 -= 22;
                        var4 -= 375;
                    }
                    if (var3 < this.field1434 - 10 || var3 > this.field1436 + this.field1434 + 10 || var4 < this.field1435 - 10 || var4 > this.field1437 + this.field1435 + 10) {
                        this.field1381 = false;
                        if (this.field1433 == 1) {
                            this.field1197 = true;
                        }
                        if (this.field1433 == 2) {
                            this.field1161 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field1434;
                    int var6 = this.field1435;
                    int var7 = this.field1436;
                    int var8 = super.field22;
                    int var9 = super.field23;
                    if (this.field1433 == 0) {
                        var8 -= 8;
                        var9 -= 11;
                    }
                    if (this.field1433 == 1) {
                        var8 -= 562;
                        var9 -= 231;
                    }
                    if (this.field1433 == 2) {
                        var8 -= 22;
                        var9 -= 375;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field1144; ++var11) {
                        int var12 = (this.field1144 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method386(0, var10);
                    }
                    this.field1381 = false;
                    if (this.field1433 == 1) {
                        this.field1197 = true;
                    }
                    if (this.field1433 == 2) {
                        this.field1161 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field1144 > 0) {
                    int var13 = this.field1293[this.field1144 - 1];
                    if (var13 == 134 || var13 == 701 || var13 == 570 || var13 == 719 || var13 == 440 || var13 == 871 || var13 == 526 || var13 == 156 || var13 == 120 || var13 == 796 || var13 == 357) {
                        int var14 = this.field1291[this.field1144 - 1];
                        int var15 = this.field1292[this.field1144 - 1];
                        Component var16 = Component.field973[var15];
                        if (var16.field999) {
                            this.field1404 = false;
                            this.field1348 = 0;
                            this.field1405 = var15;
                            this.field1406 = var14;
                            this.field1407 = 2;
                            this.field1408 = super.field22;
                            this.field1409 = super.field23;
                            if (Component.field973[var15].field979 == this.field1290) {
                                this.field1407 = 1;
                            }
                            if (Component.field973[var15].field979 == this.field1455) {
                                this.field1407 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field1299 == 1 || this.method425(true, this.field1144 - 1)) && this.field1144 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field1144 > 0) {
                    this.method386(0, this.field1144 - 1);
                }
                if (var2 != 2 || this.field1144 <= 0) {
                    return;
                }
                this.method481(9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method427(int arg0) {
        try {
            this.field1349 = -1;
            this.field1169.method232();
            this.field1535.method232();
            this.field1111.method232();
            this.field1425.method232();
            Pix3D.method156(1);
            this.method466(-39187);
            this.field1192.method50((byte) -101);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1501[var2].method295(-999);
            }
            System.gc();
            World var3 = new World(this.field1323, this.field1163, 104, 104, this.field1222);
            byte[] var4 = new byte[100000];
            int var5 = this.field1150.length;
            World.field36 = World3D.field224;
            for (int var6 = 0; var6 < var5; ++var6) {
                int var7 = this.field1215[var6] >> 8;
                int var8 = this.field1215[var6] & 255;
                if (var7 == 33 && var8 >= 71 && var8 <= 73) {
                    World.field36 = false;
                }
            }
            if (World.field36) {
                this.field1192.method51(this.field1545, true);
            } else {
                this.field1192.method51(0, true);
            }
            this.field1195.method198(9, 126);
            for (int var9 = 0; var9 < var5; ++var9) {
                int var10 = (this.field1215[var9] >> 8) * 64 - this.field1448;
                int var11 = (this.field1215[var9] & 255) * 64 - this.field1449;
                byte[] var12 = this.field1150[var9];
                if (var12 != null) {
                    int var13 = (new Packet(var12, 0)).method214();
                    BZip2.method238(var4, var13, var12, var12.length - 4, 4);
                    var3.method15((this.field1429 - 6) * 8, -16121, var10, var11, var4, (this.field1428 - 6) * 8);
                } else if (this.field1429 < 800) {
                    var3.method14(var10, var11, 626, 64, 64);
                }
            }
            this.field1195.method198(9, 126);
            for (int var14 = 0; var14 < var5; ++var14) {
                byte[] var15 = this.field1483[var14];
                if (var15 != null) {
                    int var16 = (new Packet(var15, 0)).method214();
                    BZip2.method238(var4, var16, var15, var15.length - 4, 4);
                    int var17 = (this.field1215[var14] >> 8) * 64 - this.field1448;
                    int var18 = (this.field1215[var14] & 255) * 64 - this.field1449;
                    var3.method16(this.field1192, this.field1535, var4, this.field1501, (byte) 5, var17, var18);
                }
            }
            this.field1195.method198(9, 126);
            var3.method18(this.field1192, this.field1285, this.field1501);
            this.field1490.method235(0);
            this.field1195.method198(9, 126);
            for (LocEntity var19 = (LocEntity) this.field1535.method228(); var19 != null; var19 = (LocEntity) this.field1535.method230(this.field1162)) {
                if ((this.field1323[1][var19.field656][var19.field657] & 2) == 2) {
                    --var19.field654;
                    if (var19.field654 < 0) {
                        var19.method107();
                    }
                }
            }
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method437(var20, var21);
                }
            }
            for (LocMerged var22 = (LocMerged) this.field1113.method228(); var22 != null; var22 = (LocMerged) this.field1113.method230(this.field1162)) {
                this.method376(0, var22.field640, var22.field637, var22.field638, var22.field639, var22.field635, var22.field641, var22.field636);
            }
        } catch (Exception var24) {
        }
        LocType.field850.method104();
        System.gc();
        if (arg0 != 0) {
            this.field1195.method199(0);
        }
        Pix3D.method157(1000, 20);
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method428(boolean arg0) {
        this.field1486 &= arg0;
        this.field1148 = new Pix8(this.field1355, "titlebox", 0);
        this.field1149 = new Pix8(this.field1355, "titlebutton", 0);
        this.field1472 = new Pix8[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field1472[var2] = new Pix8(this.field1355, "runes", var2);
        }
        this.field1318 = new Pix32(128, 265);
        this.field1319 = new Pix32(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field1318.field580[var3] = this.field1512.field674[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field1319.field580[var4] = this.field1513.field674[var4];
        }
        this.field1367 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field1367[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field1367[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1367[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1367[var8 + 192] = 16777215;
        }
        this.field1368 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1368[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1368[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1368[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1368[var12 + 192] = 16777215;
        }
        this.field1369 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1369[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1369[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1369[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1369[var16 + 192] = 16777215;
        }
        this.field1366 = new int[256];
        this.field1204 = new int[32768];
        this.field1205 = new int[32768];
        this.method442((byte) 3, (Pix8) null);
        this.field1331 = new int[32768];
        this.field1332 = new int[32768];
        this.method13((byte) 72, "Connecting to fileserver", 10);
        if (!this.field1259) {
            this.field1427 = true;
            this.field1259 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method429(byte arg0) {
        if (this.field1230 != arg0) {
            this.field1195.method199(22);
        }
        for (int var2 = -1; var2 < this.field1136; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1134;
            } else {
                var6 = this.field1137[var2];
            }
            PlayerEntity var7 = this.field1135[var6];
            if (var7 != null && var7.field319 > 0) {
                --var7.field319;
                if (var7.field319 == 0) {
                    var7.field318 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field1209; ++var3) {
            int var4 = this.field1210[var3];
            NpcEntity var5 = this.field1208[var4];
            if (var5 != null && var5.field319 > 0) {
                --var5.field319;
                if (var5.field319 == 0) {
                    var5.field318 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method430(int arg0) {
        Graphics var2 = this.method11(16374).getGraphics();
        var2.setColor(Color.black);
        if (arg0 != 0) {
            this.field1447 = null;
        }
        var2.fillRect(0, 0, 789, 532);
        this.method4(true, 1);
        if (this.field1257) {
            this.field1259 = false;
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
        if (this.field1500) {
            this.field1259 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1333) {
            this.field1259 = false;
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lkb;IZ)V")
    private final void method431(Packet arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < this.field1138; ++var4) {
            int var5 = this.field1139[var4];
            PlayerEntity var6 = this.field1135[var5];
            int var7 = arg0.method209();
            if ((var7 & 128) == 128) {
                var7 += arg0.method209() << 8;
            }
            this.method467((byte) -58, arg0, var7, var5, var6);
        }
        this.field1486 &= arg2;
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method432(boolean arg0) {
        for (int var2 = -1; var2 < this.field1136; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field1134;
            } else {
                var3 = this.field1137[var2];
            }
            PlayerEntity var4 = this.field1135[var3];
            if (var4 != null) {
                this.method473(this.field1298, var4, 1);
            }
        }
        this.field1486 &= arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLkb;)V")
    public final void method433(int arg0, boolean arg1, Packet arg2) {
        if (!arg1) {
            field1122 = 394;
        }
        if (arg0 != 220 && arg0 != 214) {
            if (arg0 == 78) {
                int var4 = arg2.method209();
                int var5 = (var4 >> 4 & 7) + this.field1198;
                int var6 = (var4 & 7) + this.field1199;
                int var7 = arg2.method209();
                int var8 = var7 >> 2;
                int var9 = this.field1399[var8];
                int var10 = arg2.method211();
                if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                    int var11 = 0;
                    if (var9 == 0) {
                        var11 = this.field1192.method77(this.field1545, var5, var6);
                    }
                    if (var9 == 1) {
                        var11 = this.field1192.method78(var6, this.field1545, var5, (byte) 89);
                    }
                    if (var9 == 2) {
                        var11 = this.field1192.method79(this.field1545, var5, var6);
                    }
                    if (var9 == 3) {
                        var11 = this.field1192.method80(this.field1545, var5, var6);
                    }
                    if (var11 != 0) {
                        LocEntity var12 = new LocEntity(false, var11 >> 14 & 32767, (byte) 9, var5, var6, SeqType.field1043[var10], this.field1545, var9);
                        this.field1535.method225(var12);
                    }
                }
            } else if (arg0 == 246) {
                int var13 = arg2.method209();
                int var14 = (var13 >> 4 & 7) + this.field1198;
                int var15 = (var13 & 7) + this.field1199;
                int var16 = arg2.method211();
                int var17 = arg2.method211();
                if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                    ObjStackEntity var18 = new ObjStackEntity();
                    var18.field302 = var16;
                    var18.field303 = var17;
                    if (this.field1447[this.field1545][var14][var15] == null) {
                        this.field1447[this.field1545][var14][var15] = new LinkList((byte) -47);
                    }
                    this.field1447[this.field1545][var14][var15].method225(var18);
                    this.method437(var14, var15);
                }
            } else if (arg0 == 61) {
                int var19 = arg2.method209();
                int var20 = (var19 >> 4 & 7) + this.field1198;
                int var21 = (var19 & 7) + this.field1199;
                int var22 = arg2.method211();
                if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                    LinkList var23 = this.field1447[this.field1545][var20][var21];
                    if (var23 != null) {
                        for (ObjStackEntity var24 = (ObjStackEntity) var23.method228(); var24 != null; var24 = (ObjStackEntity) var23.method230(this.field1162)) {
                            if ((var22 & 32767) == var24.field302) {
                                var24.method107();
                                break;
                            }
                        }
                        if (var23.method228() == null) {
                            this.field1447[this.field1545][var20][var21] = null;
                        }
                        this.method437(var20, var21);
                    }
                }
            } else if (arg0 == 1) {
                int var25 = arg2.method209();
                int var26 = (var25 >> 4 & 7) + this.field1198;
                int var27 = (var25 & 7) + this.field1199;
                int var28 = var26 + arg2.method210();
                int var29 = var27 + arg2.method210();
                int var30 = arg2.method212();
                int var31 = arg2.method211();
                int var32 = arg2.method209();
                int var33 = arg2.method209();
                int var34 = arg2.method211();
                int var35 = arg2.method211();
                int var36 = arg2.method209();
                int var37 = arg2.method209();
                if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                    int var38 = var26 * 128 + 64;
                    int var39 = var27 * 128 + 64;
                    int var40 = var28 * 128 + 64;
                    int var41 = var29 * 128 + 64;
                    ProjectileEntity var42 = new ProjectileEntity(var36, this.field1545, field1529 + var34, var39, var33, var30, var37, this.field1231, this.method420(var38, this.field1221, var39, this.field1545) - var32, var31, var38, field1529 + var35);
                    var42.method116(this.method420(var40, this.field1221, var41, this.field1545) - var33, var40, false, var41, field1529 + var34);
                    this.field1425.method225(var42);
                }
            } else if (arg0 == 195) {
                int var43 = arg2.method209();
                int var44 = (var43 >> 4 & 7) + this.field1198;
                int var45 = (var43 & 7) + this.field1199;
                int var46 = arg2.method211();
                int var47 = arg2.method209();
                int var48 = arg2.method211();
                if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
                    int var49 = var44 * 128 + 64;
                    int var50 = var45 * 128 + 64;
                    SpotAnimEntity var51 = new SpotAnimEntity(5, var50, this.field1545, this.method420(var49, this.field1221, var50, this.field1545) - var47, var46, var49, var48, field1529);
                    this.field1111.method225(var51);
                }
            } else if (arg0 == 127) {
                int var52 = arg2.method209();
                int var53 = (var52 >> 4 & 7) + this.field1198;
                int var54 = (var52 & 7) + this.field1199;
                int var55 = arg2.method211();
                int var56 = arg2.method211();
                int var57 = arg2.method211();
                if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104 && this.field1206 != var57) {
                    ObjStackEntity var58 = new ObjStackEntity();
                    var58.field302 = var55;
                    var58.field303 = var56;
                    if (this.field1447[this.field1545][var53][var54] == null) {
                        this.field1447[this.field1545][var53][var54] = new LinkList((byte) -47);
                    }
                    this.field1447[this.field1545][var53][var54].method225(var58);
                    this.method437(var53, var54);
                }
            } else {
                if (arg0 == 25) {
                    int var59 = arg2.method209();
                    int var60 = (var59 >> 4 & 7) + this.field1198;
                    int var61 = (var59 & 7) + this.field1199;
                    int var62 = arg2.method209();
                    int var63 = var62 >> 2;
                    int var64 = var62 & 3;
                    int var65 = this.field1399[var63];
                    int var66 = arg2.method211();
                    int var67 = arg2.method211();
                    int var68 = arg2.method211();
                    int var69 = arg2.method211();
                    byte var70 = arg2.method210();
                    byte var71 = arg2.method210();
                    byte var72 = arg2.method210();
                    byte var73 = arg2.method210();
                    PlayerEntity var74;
                    if (this.field1206 == var69) {
                        var74 = this.field1492;
                    } else {
                        var74 = this.field1135[var69];
                    }
                    if (var74 != null) {
                        LocSpawned var75 = new LocSpawned(field1529 + var67, var64, (byte) 9, var63, var60, var65, -1, var61, this.field1545);
                        this.field1169.method225(var75);
                        LocSpawned var76 = new LocSpawned(field1529 + var68, var64, (byte) 9, var63, var60, var65, var66, var61, this.field1545);
                        this.field1169.method225(var76);
                        int var77 = this.field1163[this.field1545][var60][var61];
                        int var78 = this.field1163[this.field1545][var60 + 1][var61];
                        int var79 = this.field1163[this.field1545][var60 + 1][var61 + 1];
                        int var80 = this.field1163[this.field1545][var60][var61 + 1];
                        LocType var81 = LocType.method275(var66);
                        var74.field375 = field1529 + var67;
                        var74.field376 = field1529 + var68;
                        var74.field380 = var81.method278(var63, var64, var77, var78, var79, var80, -1);
                        int var82 = var81.field824;
                        int var83 = var81.field825;
                        if (var64 == 1 || var64 == 3) {
                            var82 = var81.field825;
                            var83 = var81.field824;
                        }
                        var74.field377 = var60 * 128 + var82 * 64;
                        var74.field379 = var61 * 128 + var83 * 64;
                        var74.field378 = this.method420(var74.field377, this.field1221, var74.field379, this.field1545);
                        if (var70 > var72) {
                            byte var84 = var70;
                            var70 = var72;
                            var72 = var84;
                        }
                        if (var71 > var73) {
                            byte var85 = var71;
                            var71 = var73;
                            var73 = var85;
                        }
                        var74.field381 = var60 + var70;
                        var74.field383 = var60 + var72;
                        var74.field382 = var61 + var71;
                        var74.field384 = var61 + var73;
                    }
                }
                if (arg0 == 117) {
                    int var86 = arg2.method209();
                    int var87 = (var86 >> 4 & 7) + this.field1198;
                    int var88 = (var86 & 7) + this.field1199;
                    int var89 = arg2.method211();
                    int var90 = arg2.method211();
                    int var91 = arg2.method211();
                    if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                        LinkList var92 = this.field1447[this.field1545][var87][var88];
                        if (var92 != null) {
                            for (ObjStackEntity var93 = (ObjStackEntity) var92.method228(); var93 != null; var93 = (ObjStackEntity) var92.method230(this.field1162)) {
                                if ((var89 & 32767) == var93.field302 && var93.field303 == var90) {
                                    var93.field303 = var91;
                                    break;
                                }
                            }
                            this.method437(var87, var88);
                        }
                    }
                }
            }
        } else {
            int var94 = arg2.method209();
            int var95 = (var94 >> 4 & 7) + this.field1198;
            int var96 = (var94 & 7) + this.field1199;
            int var97 = arg2.method209();
            int var98 = var97 >> 2;
            int var99 = var97 & 3;
            int var100 = this.field1399[var98];
            int var101;
            if (arg0 == 214) {
                var101 = -1;
            } else {
                var101 = arg2.method211();
            }
            if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                LocMerged var102 = null;
                for (LocMerged var103 = (LocMerged) this.field1113.method228(); var103 != null; var103 = (LocMerged) this.field1113.method230(this.field1162)) {
                    if (this.field1545 == var103.field635 && var103.field637 == var95 && var103.field638 == var96 && var103.field636 == var100) {
                        var102 = var103;
                        break;
                    }
                }
                if (var102 == null) {
                    int var104 = 0;
                    int var105 = -1;
                    int var106 = 0;
                    int var107 = 0;
                    if (var100 == 0) {
                        var104 = this.field1192.method77(this.field1545, var95, var96);
                    }
                    if (var100 == 1) {
                        var104 = this.field1192.method78(var96, this.field1545, var95, (byte) 89);
                    }
                    if (var100 == 2) {
                        var104 = this.field1192.method79(this.field1545, var95, var96);
                    }
                    if (var100 == 3) {
                        var104 = this.field1192.method80(this.field1545, var95, var96);
                    }
                    if (var104 != 0) {
                        int var108 = this.field1192.method81(this.field1545, var95, var96, var104);
                        var105 = var104 >> 14 & 32767;
                        var106 = var108 & 31;
                        var107 = var108 >> 6;
                    }
                    var102 = new LocMerged();
                    var102.field635 = this.field1545;
                    var102.field636 = var100;
                    var102.field637 = var95;
                    var102.field638 = var96;
                    var102.field642 = var105;
                    var102.field644 = var106;
                    var102.field643 = var107;
                    this.field1113.method225(var102);
                }
                var102.field639 = var101;
                var102.field641 = var98;
                var102.field640 = var99;
                this.method376(0, var99, var95, var96, var101, this.field1545, var98, var100);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lhc;IIII)V")
    public final void method434(Component arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.field980 == 0 && arg0.field994 != null) {
            if (!arg0.field993 || this.field1390 == arg0.field978 || this.field1117 == arg0.field978 || this.field1432 == arg0.field978) {
                int var6 = Pix2D.field544;
                int var7 = Pix2D.field542;
                int var8 = Pix2D.field545;
                int var9 = Pix2D.field543;
                Pix2D.method147(arg3, arg1, arg0.field983 + arg3, arg0.field984 + arg1, 0);
                int var10 = arg0.field994.length;
                this.field1269 += arg4;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg0.field995[var11] + arg3;
                    int var13 = arg0.field996[var11] + arg1 - arg2;
                    Component var14 = Component.field973[arg0.field994[var11]];
                    int var15 = var14.field985 + var12;
                    int var16 = var14.field986 + var13;
                    if (var14.field982 > 0) {
                        this.method399(7, var14);
                    }
                    if (var14.field980 == 0) {
                        if (var14.field992 > var14.field991 - var14.field984) {
                            var14.field992 = var14.field991 - var14.field984;
                        }
                        if (var14.field992 < 0) {
                            var14.field992 = 0;
                        }
                        this.method434(var14, var16, var14.field992, var15, 0);
                        if (var14.field991 > var14.field984) {
                            this.method392(var14.field991, var14.field984, var14.field992, var16, var14.field983 + var15, (byte) -99);
                        }
                    } else if (var14.field980 != 1) {
                        if (var14.field980 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field984; ++var18) {
                                for (int var19 = 0; var19 < var14.field983; ++var19) {
                                    int var20 = (var14.field1002 + 32) * var19 + var15;
                                    int var21 = (var14.field1003 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1005[var17];
                                        var21 += var14.field1006[var17];
                                    }
                                    if (var14.field974[var17] <= 0) {
                                        if (var14.field1004 != null && var17 < 20) {
                                            Pix32 var27 = var14.field1004[var17];
                                            if (var27 != null) {
                                                var27.method173(var21, true, var20);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field974[var17] - 1;
                                        Pix32 var25 = ObjType.method292(var14.field975[var17], var24, 0);
                                        if (this.field1407 != 0 && this.field1406 == var17 && this.field1405 == var14.field978) {
                                            var22 = super.field19 - this.field1408;
                                            var23 = super.field20 - this.field1409;
                                            if (var22 < 5 && var22 > -5) {
                                                var22 = 0;
                                            }
                                            if (var23 < 5 && var23 > -5) {
                                                var23 = 0;
                                            }
                                            if (this.field1348 < 5) {
                                                var22 = 0;
                                                var23 = 0;
                                            }
                                            var25.method177(var20 + var22, 128, var21 + var23, false);
                                        } else if (this.field1374 != 0 && this.field1373 == var17 && this.field1372 == var14.field978) {
                                            var25.method177(var20, 128, var21, false);
                                        } else {
                                            var25.method173(var21, true, var20);
                                        }
                                        if (var25.field585 == 33 || var14.field975[var17] != 1) {
                                            int var26 = var14.field975[var17];
                                            this.field1461.method191(476, var21 + 10 + var23, method439(this.field1254, var26), var20 + 1 + var22, 0);
                                            this.field1461.method191(476, var21 + 9 + var23, method439(this.field1254, var26), var20 + var22, 16776960);
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field980 == 3) {
                            if (var14.field1008) {
                                Pix2D.method149(var15, var14.field983, var14.field1014, 5, var16, var14.field984);
                            } else {
                                Pix2D.method150(var14.field983, var14.field1014, var15, var16, true, var14.field984);
                            }
                        } else if (var14.field980 == 4) {
                            PixFont var28 = var14.field1011;
                            int var29 = var14.field1014;
                            String var30 = var14.field1012;
                            if ((this.field1432 == var14.field978 || this.field1117 == var14.field978 || this.field1390 == var14.field978) && var14.field1016 != 0) {
                                var29 = var14.field1016;
                            }
                            if (this.method404(var14, this.field1383)) {
                                var29 = var14.field1015;
                                if (var14.field1013.length() > 0) {
                                    var30 = var14.field1013;
                                }
                            }
                            if (var14.field981 == 6 && this.field1365) {
                                var30 = "Please wait...";
                                var29 = var14.field1014;
                            }
                            int var31 = var28.field609 + var16;
                            while (var30.length() > 0) {
                                if (var30.indexOf("%") != -1) {
                                    label242: while (true) {
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
                                                                            break label242;
                                                                        }
                                                                        var30 = var30.substring(0, var36) + this.method485(this.method436(4, var14, this.field1168), 21690) + var30.substring(var36 + 2);
                                                                    }
                                                                }
                                                                var30 = var30.substring(0, var35) + this.method485(this.method436(3, var14, this.field1168), 21690) + var30.substring(var35 + 2);
                                                            }
                                                        }
                                                        var30 = var30.substring(0, var34) + this.method485(this.method436(2, var14, this.field1168), 21690) + var30.substring(var34 + 2);
                                                    }
                                                }
                                                var30 = var30.substring(0, var33) + this.method485(this.method436(1, var14, this.field1168), 21690) + var30.substring(var33 + 2);
                                            }
                                        }
                                        var30 = var30.substring(0, var32) + this.method485(this.method436(0, var14, this.field1168), 21690) + var30.substring(var32 + 2);
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
                                if (var14.field1009) {
                                    var28.method189(-45560, var38, var31, var29, var14.field1010, var14.field983 / 2 + var15);
                                } else {
                                    var28.method193(var38, var29, true, var15, var14.field1010, var31);
                                }
                                var31 += var28.field609;
                            }
                        } else if (var14.field980 == 5) {
                            Pix32 var39;
                            if (this.method404(var14, this.field1383)) {
                                var39 = var14.field1018;
                            } else {
                                var39 = var14.field1017;
                            }
                            if (var39 != null) {
                                var39.method173(var16, true, var15);
                            }
                        } else if (var14.field980 == 6) {
                            int var40 = Pix3D.field557;
                            int var41 = Pix3D.field558;
                            Pix3D.field557 = var14.field983 / 2 + var15;
                            Pix3D.field558 = var14.field984 / 2 + var16;
                            int var42 = Pix3D.field561[var14.field1024] * var14.field1023 >> 16;
                            int var43 = Pix3D.field562[var14.field1024] * var14.field1023 >> 16;
                            boolean var44 = this.method404(var14, this.field1383);
                            int var45;
                            if (var44) {
                                var45 = var14.field1022;
                            } else {
                                var45 = var14.field1021;
                            }
                            Model var46;
                            if (var45 == -1) {
                                var46 = var14.method315(-1, -1, var44);
                            } else {
                                SeqType var47 = SeqType.field1043[var45];
                                var46 = var14.method315(var47.field1045[var14.field976], var47.field1046[var14.field976], var44);
                            }
                            if (var46 != null) {
                                var46.method139(0, var14.field1025, 0, var14.field1024, 0, var42, var43);
                            }
                            Pix3D.field557 = var40;
                            Pix3D.field558 = var41;
                        } else if (var14.field980 == 7) {
                            PixFont var48 = var14.field1011;
                            int var49 = 0;
                            for (int var50 = 0; var50 < var14.field984; ++var50) {
                                for (int var51 = 0; var51 < var14.field983; ++var51) {
                                    if (var14.field974[var49] > 0) {
                                        ObjType var52 = ObjType.method287(var14.field974[var49] - 1);
                                        String var53 = var52.field897;
                                        if (var52.field909 || var14.field975[var49] != 1) {
                                            var53 = var53 + " x" + method422(var14.field975[var49], 929);
                                        }
                                        int var54 = (var14.field1002 + 115) * var51 + var15;
                                        int var55 = (var14.field1003 + 12) * var50 + var16;
                                        if (var14.field1009) {
                                            var48.method189(-45560, var53, var55, var14.field1014, var14.field1010, var14.field983 / 2 + var54);
                                        } else {
                                            var48.method193(var53, var14.field1014, true, var54, var14.field1010, var55);
                                        }
                                    }
                                    ++var49;
                                }
                            }
                        }
                    }
                }
                Pix2D.method147(var6, var7, var8, var9, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method435(boolean arg0) {
        if (this.field1491 == null) {
            this.method365((byte) 9);
            super.field13 = null;
            this.field1509 = null;
            this.field1510 = null;
            this.field1511 = null;
            this.field1512 = null;
            this.field1513 = null;
            this.field1514 = null;
            this.field1515 = null;
            this.field1516 = null;
            this.field1517 = null;
            this.field1491 = new PixMap(479, this.method11(16374), 96, 947);
            this.field1489 = new PixMap(168, this.method11(16374), 160, 947);
            Pix2D.method148(true);
            this.field1224.method186(0, true, 0);
            this.field1488 = new PixMap(190, this.method11(16374), 261, 947);
            this.field1490 = new PixMap(512, this.method11(16374), 334, 947);
            Pix2D.method148(true);
            this.field1378 = new PixMap(501, this.method11(16374), 61, 947);
            this.field1379 = new PixMap(288, this.method11(16374), 40, 947);
            this.field1380 = new PixMap(269, this.method11(16374), 66, 947);
            if (arg0) {
                field1126 = 368;
            }
            this.field1485 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILhc;I)I")
    public final int method436(int arg0, Component arg1, int arg2) {
        if (this.field1377 != arg2) {
            this.field1313 = -446;
        }
        if (arg1.field987 != null && arg0 < arg1.field987.length) {
            try {
                int[] var4 = arg1.field987[arg0];
                int var5 = 0;
                int var6 = 0;
                while (true) {
                    int var7 = var4[var6++];
                    if (var7 == 0) {
                        return var5;
                    }
                    if (var7 == 1) {
                        var5 += this.field1385[var4[var6++]];
                    }
                    if (var7 == 2) {
                        var5 += this.field1420[var4[var6++]];
                    }
                    if (var7 == 3) {
                        var5 += this.field1177[var4[var6++]];
                    }
                    if (var7 == 4) {
                        Component var8 = Component.field973[var4[var6++]];
                        int var9 = var4[var6++] + 1;
                        for (int var10 = 0; var10 < var8.field974.length; ++var10) {
                            if (var8.field974[var10] == var9) {
                                var5 += var8.field975[var10];
                            }
                        }
                    }
                    if (var7 == 5) {
                        var5 += this.field1196[var4[var6++]];
                    }
                    if (var7 == 6) {
                        var5 += field1482[this.field1420[var4[var6++]] - 1];
                    }
                    if (var7 == 7) {
                        var5 += this.field1196[var4[var6++]] * 100 / 46875;
                    }
                    if (var7 == 8) {
                        var5 += this.field1492.field372;
                    }
                    if (var7 == 9) {
                        for (int var11 = 0; var11 < 19; ++var11) {
                            if (var11 == 18) {
                                var11 = 20;
                            }
                            var5 += this.field1420[var11];
                        }
                    }
                    if (var7 == 10) {
                        Component var12 = Component.field973[var4[var6++]];
                        int var13 = var4[var6++] + 1;
                        for (int var14 = 0; var14 < var12.field974.length; ++var14) {
                            if (var12.field974[var14] == var13) {
                                var5 += 999999999;
                                break;
                            }
                        }
                    }
                    if (var7 == 11) {
                        var5 += this.field1392;
                    }
                    if (var7 == 12) {
                        var5 += this.field1171;
                    }
                    if (var7 == 13) {
                        int var15 = this.field1196[var4[var6++]];
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

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1356 = Integer.parseInt(this.getParameter("nodeid"));
        field1357 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method393(field1122);
        } else {
            method457(-4165);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1358 = false;
        } else {
            field1358 = true;
        }
        this.method2(false, 532, 789);
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1427) {
            this.method450(field1321);
        } else if (this.field1340) {
            this.method387((byte) 1);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method10(boolean arg0) {
        this.field1485 = true;
        if (arg0) {
            this.field1447 = null;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method437(int arg0, int arg1) {
        LinkList var3 = this.field1447[this.field1545][arg0][arg1];
        if (var3 == null) {
            this.field1192.method76(this.field1545, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method228(); var6 != null; var6 = (ObjStackEntity) var3.method230(this.field1162)) {
                ObjType var16 = ObjType.method287(var6.field302);
                int var17 = var16.field910;
                if (var16.field909) {
                    var17 = (var6.field303 + 1) * var17;
                }
                if (var17 > var4) {
                    var4 = var17;
                    var5 = var6;
                }
            }
            var3.method226(var5, 0);
            int var7 = -1;
            int var8 = -1;
            int var9 = 0;
            int var10 = 0;
            for (ObjStackEntity var11 = (ObjStackEntity) var3.method228(); var11 != null; var11 = (ObjStackEntity) var3.method230(this.field1162)) {
                if (var5.field302 != var11.field302 && var7 == -1) {
                    var7 = var11.field302;
                    var9 = var11.field303;
                }
                if (var5.field302 != var11.field302 && var11.field302 != var7 && var8 == -1) {
                    var8 = var11.field302;
                    var10 = var11.field303;
                }
            }
            Model var12 = null;
            if (var7 != -1) {
                var12 = ObjType.method287(var7).method291(var9);
            }
            Model var13 = null;
            if (var8 != -1) {
                var13 = ObjType.method287(var8).method291(var10);
            }
            int var14 = (arg1 << 7) + arg0 + 1610612736;
            ObjType var15 = ObjType.method287(var5.field302);
            this.field1192.method57(var12, this.method420(arg0 * 128 + 64, this.field1221, arg1 * 128 + 64, this.field1545), 0, var13, this.field1545, arg1, arg0, var15.method291(var5.field303), var14);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BLkb;I)V")
    private final void method438(byte arg0, Packet arg1, int arg2) {
        if (arg0 != 95) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        for (int var5 = 0; var5 < this.field1138; ++var5) {
            int var6 = this.field1139[var5];
            NpcEntity var7 = this.field1208[var6];
            int var8 = arg1.method209();
            if ((var8 & 2) == 2) {
                int var9 = arg1.method211();
                if (var9 == 65535) {
                    var9 = -1;
                }
                if (var7.field333 == var9) {
                    var7.field337 = 0;
                }
                int var10 = arg1.method209();
                if (var9 == -1 || var7.field333 == -1 || SeqType.field1043[var9].field1051 > SeqType.field1043[var7.field333].field1051 || SeqType.field1043[var7.field333].field1051 == 0) {
                    var7.field333 = var9;
                    var7.field334 = 0;
                    var7.field335 = 0;
                    var7.field336 = var10;
                    var7.field337 = 0;
                }
            }
            if ((var8 & 4) == 4) {
                var7.field327 = arg1.method211();
                if (var7.field327 == 65535) {
                    var7.field327 = -1;
                }
            }
            if ((var8 & 8) == 8) {
                var7.field318 = arg1.method216();
                var7.field319 = 100;
            }
            if ((var8 & 16) == 16) {
                var7.field322 = arg1.method209();
                var7.field323 = arg1.method209();
                var7.field324 = field1529 + 400;
                var7.field325 = arg1.method209();
                var7.field326 = arg1.method209();
            }
            if ((var8 & 32) == 32) {
                var7.field360 = NpcType.method281(arg1.method211());
                var7.field313 = var7.field360.field869;
                var7.field314 = var7.field360.field870;
                var7.field315 = var7.field360.field871;
                var7.field316 = var7.field360.field872;
                var7.field311 = var7.field360.field868;
            }
            if ((var8 & 64) == 64) {
                var7.field338 = arg1.method211();
                int var11 = arg1.method214();
                var7.field342 = var11 >> 16;
                var7.field341 = (var11 & 65535) + field1529;
                var7.field339 = 0;
                var7.field340 = 0;
                if (var7.field341 > field1529) {
                    var7.field339 = -1;
                }
                if (var7.field338 == 65535) {
                    var7.field338 = -1;
                }
            }
            if ((var8 & 128) == 128) {
                var7.field328 = arg1.method211();
                var7.field329 = arg1.method211();
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)Ljava/lang/String;")
    private static final String method439(int arg0, int arg1) {
        if (arg0 < 8 || arg0 > 8) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILz;)V")
    public final void method440(int arg0, int arg1, int arg2, int arg3, PlayerEntity arg4) {
        if (this.field1492 != arg4) {
            if (this.field1144 < 400) {
                String var6 = arg4.field366 + method418(arg4.field372, 0, this.field1492.field372) + " (level-" + arg4.field372 + ")";
                int var7 = 20 / arg1;
                if (this.field1246 == 1) {
                    this.field1330[this.field1144] = "Use " + this.field1250 + " with @whi@" + var6;
                    this.field1293[this.field1144] = 103;
                    this.field1294[this.field1144] = arg2;
                    this.field1291[this.field1144] = arg0;
                    this.field1292[this.field1144] = arg3;
                    ++this.field1144;
                } else if (this.field1502 == 1) {
                    if ((this.field1504 & 8) == 8) {
                        this.field1330[this.field1144] = this.field1505 + " @whi@" + var6;
                        this.field1293[this.field1144] = 48;
                        this.field1294[this.field1144] = arg2;
                        this.field1291[this.field1144] = arg0;
                        this.field1292[this.field1144] = arg3;
                        ++this.field1144;
                    }
                } else {
                    this.field1330[this.field1144] = "Follow @whi@" + var6;
                    this.field1293[this.field1144] = 1741;
                    this.field1294[this.field1144] = arg2;
                    this.field1291[this.field1144] = arg0;
                    this.field1292[this.field1144] = arg3;
                    ++this.field1144;
                    if (this.field1536 == 0) {
                        this.field1330[this.field1144] = "Trade with @whi@" + var6;
                        this.field1293[this.field1144] = 1528;
                        this.field1294[this.field1144] = arg2;
                        this.field1291[this.field1144] = arg0;
                        this.field1292[this.field1144] = arg3;
                        ++this.field1144;
                    }
                    if (this.field1324 > 0) {
                        this.field1330[this.field1144] = "Attack @whi@" + var6;
                        if (this.field1492.field372 >= arg4.field372) {
                            this.field1293[this.field1144] = 593;
                        } else {
                            this.field1293[this.field1144] = 2593;
                        }
                        this.field1294[this.field1144] = arg2;
                        this.field1291[this.field1144] = arg0;
                        this.field1292[this.field1144] = arg3;
                        ++this.field1144;
                    }
                    if (this.field1312 == 1) {
                        this.field1330[this.field1144] = "Fight @whi@" + var6;
                        this.field1293[this.field1144] = 593;
                        this.field1294[this.field1144] = arg2;
                        this.field1291[this.field1144] = arg0;
                        this.field1292[this.field1144] = arg3;
                        ++this.field1144;
                    }
                    if (this.field1312 == 2) {
                        this.field1330[this.field1144] = "Duel-with @whi@" + var6;
                        this.field1293[this.field1144] = 1596;
                        this.field1294[this.field1144] = arg2;
                        this.field1291[this.field1144] = arg0;
                        this.field1292[this.field1144] = arg3;
                        ++this.field1144;
                    }
                }
                for (int var8 = 0; var8 < this.field1144; ++var8) {
                    if (this.field1293[var8] == 981) {
                        this.field1330[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method441(int arg0) {
        int var2 = this.field1334 * 128 + 64;
        int var3 = this.field1335 * 128 + 64;
        int var4 = this.method420(this.field1334, this.field1221, this.field1335, this.field1545) - this.field1336;
        if (this.field1343 < var2) {
            this.field1343 += (var2 - this.field1343) * this.field1338 / 1000 + this.field1337;
            if (this.field1343 > var2) {
                this.field1343 = var2;
            }
        }
        if (this.field1343 > var2) {
            this.field1343 -= (this.field1343 - var2) * this.field1338 / 1000 + this.field1337;
            if (this.field1343 < var2) {
                this.field1343 = var2;
            }
        }
        if (this.field1344 < var4) {
            this.field1344 += (var4 - this.field1344) * this.field1338 / 1000 + this.field1337;
            if (this.field1344 > var4) {
                this.field1344 = var4;
            }
        }
        if (this.field1344 > var4) {
            this.field1344 -= (this.field1344 - var4) * this.field1338 / 1000 + this.field1337;
            if (this.field1344 < var4) {
                this.field1344 = var4;
            }
        }
        if (this.field1345 < var3) {
            this.field1345 += (var3 - this.field1345) * this.field1338 / 1000 + this.field1337;
            if (this.field1345 > var3) {
                this.field1345 = var3;
            }
        }
        if (this.field1345 > var3) {
            this.field1345 -= (this.field1345 - var3) * this.field1338 / 1000 + this.field1337;
            if (this.field1345 < var3) {
                this.field1345 = var3;
            }
        }
        int var5 = this.field1466 * 128 + 64;
        int var6 = this.field1467 * 128 + 64;
        int var7 = this.method420(this.field1466, this.field1221, this.field1467, this.field1545) - this.field1468;
        int var8 = var5 - this.field1343;
        int var9 = var7 - this.field1344;
        int var10 = var6 - this.field1345;
        if (arg0 != 15537) {
            this.field1447 = null;
        }
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1346 < var12) {
            this.field1346 += (var12 - this.field1346) * this.field1470 / 1000 + this.field1469;
            if (this.field1346 > var12) {
                this.field1346 = var12;
            }
        }
        if (this.field1346 > var12) {
            this.field1346 -= (this.field1346 - var12) * this.field1470 / 1000 + this.field1469;
            if (this.field1346 < var12) {
                this.field1346 = var12;
            }
        }
        int var14 = var13 - this.field1347;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1347 += this.field1470 * var14 / 1000 + this.field1469;
            this.field1347 &= 2047;
        }
        if (var14 < 0) {
            this.field1347 -= -var14 * this.field1470 / 1000 + this.field1469;
            this.field1347 &= 2047;
        }
        int var15 = var13 - this.field1347;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1347 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLib;)V")
    public final void method442(byte arg0, Pix8 arg1) {
        if (arg0 == 3) {
            boolean var3 = false;
        } else {
            this.field1388 = this.field1124.method246();
        }
        short var4 = 256;
        for (int var5 = 0; var5 < this.field1204.length; ++var5) {
            this.field1204[var5] = 0;
        }
        for (int var6 = 0; var6 < 5000; ++var6) {
            int var18 = (int) (Math.random() * 128.0D * (double) var4);
            this.field1204[var18] = (int) (Math.random() * 256.0D);
        }
        for (int var7 = 0; var7 < 20; ++var7) {
            for (int var14 = 1; var14 < var4 - 1; ++var14) {
                for (int var16 = 1; var16 < 127; ++var16) {
                    int var17 = (var14 << 7) + var16;
                    this.field1205[var17] = (this.field1204[var17 - 1] + this.field1204[var17 + 1] + this.field1204[var17 - 128] + this.field1204[var17 + 128]) / 4;
                }
            }
            int[] var15 = this.field1204;
            this.field1204 = this.field1205;
            this.field1205 = var15;
        }
        if (arg1 != null) {
            int var8 = 0;
            for (int var9 = 0; var9 < arg1.field594; ++var9) {
                for (int var10 = 0; var10 < arg1.field593; ++var10) {
                    if (arg1.field591[var8++] != 0) {
                        int var11 = var10 + 16 + arg1.field595;
                        int var12 = var9 + 16 + arg1.field596;
                        int var13 = (var12 << 7) + var11;
                        this.field1204[var13] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method443(int arg0) {
        this.field1269 += arg0;
        if (super.field21 == 1) {
            if (super.field22 >= 549 && super.field22 <= 583 && super.field23 >= 195 && super.field23 < 231 && this.field1277[0] != -1) {
                this.field1197 = true;
                this.field1251 = 0;
                this.field1152 = true;
            }
            if (super.field22 >= 579 && super.field22 <= 609 && super.field23 >= 194 && super.field23 < 231 && this.field1277[1] != -1) {
                this.field1197 = true;
                this.field1251 = 1;
                this.field1152 = true;
            }
            if (super.field22 >= 607 && super.field22 <= 637 && super.field23 >= 194 && super.field23 < 231 && this.field1277[2] != -1) {
                this.field1197 = true;
                this.field1251 = 2;
                this.field1152 = true;
            }
            if (super.field22 >= 635 && super.field22 <= 679 && super.field23 >= 194 && super.field23 < 229 && this.field1277[3] != -1) {
                this.field1197 = true;
                this.field1251 = 3;
                this.field1152 = true;
            }
            if (super.field22 >= 676 && super.field22 <= 706 && super.field23 >= 194 && super.field23 < 231 && this.field1277[4] != -1) {
                this.field1197 = true;
                this.field1251 = 4;
                this.field1152 = true;
            }
            if (super.field22 >= 704 && super.field22 <= 734 && super.field23 >= 194 && super.field23 < 231 && this.field1277[5] != -1) {
                this.field1197 = true;
                this.field1251 = 5;
                this.field1152 = true;
            }
            if (super.field22 >= 732 && super.field22 <= 766 && super.field23 >= 195 && super.field23 < 231 && this.field1277[6] != -1) {
                this.field1197 = true;
                this.field1251 = 6;
                this.field1152 = true;
            }
            if (super.field22 >= 550 && super.field22 <= 584 && super.field23 >= 492 && super.field23 < 528 && this.field1277[7] != -1) {
                this.field1197 = true;
                this.field1251 = 7;
                this.field1152 = true;
            }
            if (super.field22 >= 582 && super.field22 <= 612 && super.field23 >= 492 && super.field23 < 529 && this.field1277[8] != -1) {
                this.field1197 = true;
                this.field1251 = 8;
                this.field1152 = true;
            }
            if (super.field22 >= 609 && super.field22 <= 639 && super.field23 >= 492 && super.field23 < 529 && this.field1277[9] != -1) {
                this.field1197 = true;
                this.field1251 = 9;
                this.field1152 = true;
            }
            if (super.field22 >= 637 && super.field22 <= 681 && super.field23 >= 493 && super.field23 < 528 && this.field1277[10] != -1) {
                this.field1197 = true;
                this.field1251 = 10;
                this.field1152 = true;
            }
            if (super.field22 >= 679 && super.field22 <= 709 && super.field23 >= 492 && super.field23 < 529 && this.field1277[11] != -1) {
                this.field1197 = true;
                this.field1251 = 11;
                this.field1152 = true;
            }
            if (super.field22 >= 706 && super.field22 <= 736 && super.field23 >= 492 && super.field23 < 529 && this.field1277[12] != -1) {
                this.field1197 = true;
                this.field1251 = 12;
                this.field1152 = true;
            }
            if (super.field22 >= 734 && super.field22 <= 768 && super.field23 >= 492 && super.field23 < 528 && this.field1277[13] != -1) {
                this.field1197 = true;
                this.field1251 = 13;
                this.field1152 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public final boolean method444(String arg0, boolean arg1) {
        this.field1486 &= arg1;
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1395; ++var3) {
                if (arg0.equalsIgnoreCase(this.field1283[var3])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(this.field1492.field366);
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)Ljava/lang/String;")
    public final String method445(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
            if (signlink.mainapp != null) {
                return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
            } else {
                return super.field15 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILbc;)V")
    public final void method446(int arg0, int arg1, int arg2, int arg3, NpcType arg4) {
        if (arg1 >= 0) {
            this.method6();
        }
        if (this.field1144 < 400) {
            String var6 = arg4.field863;
            if (arg4.field881 != 0) {
                var6 = var6 + method418(arg4.field881, 0, this.field1492.field372) + " (level-" + arg4.field881 + ")";
            }
            if (this.field1246 == 1) {
                this.field1330[this.field1144] = "Use " + this.field1250 + " with @yel@" + var6;
                this.field1293[this.field1144] = 493;
                this.field1294[this.field1144] = arg0;
                this.field1291[this.field1144] = arg3;
                this.field1292[this.field1144] = arg2;
                ++this.field1144;
            } else {
                if (this.field1502 == 1) {
                    if ((this.field1504 & 2) == 2) {
                        this.field1330[this.field1144] = this.field1505 + " @yel@" + var6;
                        this.field1293[this.field1144] = 500;
                        this.field1294[this.field1144] = arg0;
                        this.field1291[this.field1144] = arg3;
                        this.field1292[this.field1144] = arg2;
                        ++this.field1144;
                        return;
                    }
                } else {
                    if (arg4.field876 != null) {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (arg4.field876[var7] != null && !arg4.field876[var7].equalsIgnoreCase("attack")) {
                                this.field1330[this.field1144] = arg4.field876[var7] + " @yel@" + var6;
                                if (var7 == 0) {
                                    this.field1293[this.field1144] = 988;
                                }
                                if (var7 == 1) {
                                    this.field1293[this.field1144] = 345;
                                }
                                if (var7 == 2) {
                                    this.field1293[this.field1144] = 249;
                                }
                                if (var7 == 3) {
                                    this.field1293[this.field1144] = 960;
                                }
                                if (var7 == 4) {
                                    this.field1293[this.field1144] = 40;
                                }
                                this.field1294[this.field1144] = arg0;
                                this.field1291[this.field1144] = arg3;
                                this.field1292[this.field1144] = arg2;
                                ++this.field1144;
                            }
                        }
                    }
                    if (arg4.field876 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (arg4.field876[var8] != null && arg4.field876[var8].equalsIgnoreCase("attack")) {
                                short var9 = 0;
                                if (arg4.field881 > this.field1492.field372) {
                                    var9 = 2000;
                                }
                                this.field1330[this.field1144] = arg4.field876[var8] + " @yel@" + var6;
                                if (var8 == 0) {
                                    this.field1293[this.field1144] = var9 + 988;
                                }
                                if (var8 == 1) {
                                    this.field1293[this.field1144] = var9 + 345;
                                }
                                if (var8 == 2) {
                                    this.field1293[this.field1144] = var9 + 249;
                                }
                                if (var8 == 3) {
                                    this.field1293[this.field1144] = var9 + 960;
                                }
                                if (var8 == 4) {
                                    this.field1293[this.field1144] = var9 + 40;
                                }
                                this.field1294[this.field1144] = arg0;
                                this.field1291[this.field1144] = arg3;
                                this.field1292[this.field1144] = arg2;
                                ++this.field1144;
                            }
                        }
                    }
                    this.field1330[this.field1144] = "Examine @yel@" + var6;
                    this.field1293[this.field1144] = 1814;
                    this.field1294[this.field1144] = arg0;
                    this.field1291[this.field1144] = arg3;
                    this.field1292[this.field1144] = arg2;
                    ++this.field1144;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)V")
    public final void method447(int arg0, int arg1, int arg2) {
        if (this.field1400 != 0) {
            int var4 = 0;
            if (arg2 == 0) {
                if (this.field1207 != 0) {
                    var4 = 1;
                }
                for (int var5 = 0; var5 < 100; ++var5) {
                    if (this.field1131[var5] != null) {
                        int var6 = this.field1129[var5];
                        if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field1253 == 0 || this.field1253 == 1 && this.method444(this.field1130[var5], true))) {
                            int var7 = 329 - var4 * 13;
                            if (super.field19 > 8 && super.field19 < 520 && arg0 - 11 > var7 - 10 && arg0 - 11 <= var7 + 3) {
                                if (this.field1531) {
                                    this.field1330[this.field1144] = "Report abuse @whi@" + this.field1130[var5];
                                    this.field1293[this.field1144] = 2316;
                                    ++this.field1144;
                                }
                                this.field1330[this.field1144] = "Add ignore @whi@" + this.field1130[var5];
                                this.field1293[this.field1144] = 2158;
                                ++this.field1144;
                                this.field1330[this.field1144] = "Add friend @whi@" + this.field1130[var5];
                                this.field1293[this.field1144] = 2447;
                                ++this.field1144;
                            }
                            ++var4;
                            if (var4 >= 5) {
                                return;
                            }
                        }
                        if ((var6 == 5 || var6 == 6) && this.field1253 < 2) {
                            ++var4;
                            if (var4 >= 5) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method448(int arg0) {
        if (this.field1509 == null) {
            super.field13 = null;
            this.field1491 = null;
            if (arg0 != 0) {
                this.field1270 = -1;
            }
            this.field1489 = null;
            this.field1488 = null;
            this.field1490 = null;
            this.field1378 = null;
            this.field1379 = null;
            this.field1380 = null;
            this.field1512 = new PixMap(128, this.method11(16374), 265, 947);
            Pix2D.method148(true);
            this.field1513 = new PixMap(128, this.method11(16374), 265, 947);
            Pix2D.method148(true);
            this.field1509 = new PixMap(533, this.method11(16374), 186, 947);
            Pix2D.method148(true);
            this.field1510 = new PixMap(360, this.method11(16374), 146, 947);
            Pix2D.method148(true);
            this.field1511 = new PixMap(360, this.method11(16374), 200, 947);
            Pix2D.method148(true);
            this.field1514 = new PixMap(214, this.method11(16374), 267, 947);
            Pix2D.method148(true);
            this.field1515 = new PixMap(215, this.method11(16374), 267, 947);
            Pix2D.method148(true);
            this.field1516 = new PixMap(86, this.method11(16374), 79, 947);
            Pix2D.method148(true);
            this.field1517 = new PixMap(87, this.method11(16374), 79, 947);
            Pix2D.method148(true);
            if (this.field1355 != null) {
                this.method480(false);
                this.method428(true);
            }
            this.field1485 = true;
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 217);
            if (arg0.length != 4) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
            } else {
                field1356 = Integer.parseInt(arg0[0]);
                field1357 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method393(field1122);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
                        return;
                    }
                    method457(-4165);
                }
                if (arg0[3].equals("free")) {
                    field1358 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
                        return;
                    }
                    field1358 = true;
                }
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(532, 789, (byte) 2);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method449(int arg0, int arg1) {
        int[] var3 = this.field1423.field580;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var14 = (103 - var6) * 512 * 4 + 24628;
            for (int var15 = 1; var15 < 103; ++var15) {
                if ((this.field1323[arg1][var15][var6] & 24) == 0) {
                    this.field1192.method86(var3, var14, 512, arg1, var15, var6);
                }
                if (arg1 < 3 && (this.field1323[arg1 + 1][var15][var6] & 8) != 0) {
                    this.field1192.method86(var3, var14, 512, arg1 + 1, var15, var6);
                }
                var14 += 4;
            }
        }
        if (arg0 < 0) {
            this.field1423.method170(0);
            for (int var7 = 1; var7 < 103; ++var7) {
                for (int var13 = 1; var13 < 103; ++var13) {
                    if ((this.field1323[arg1][var13][var7] & 24) == 0) {
                        this.method454(var13, arg1, var7, (byte) -96);
                    }
                    if (arg1 < 3 && (this.field1323[arg1 + 1][var13][var7] & 8) != 0) {
                        this.method454(var13, arg1 + 1, var7, (byte) -96);
                    }
                }
            }
            this.field1490.method235(0);
            this.field1155 = 0;
            for (int var8 = 0; var8 < 104; ++var8) {
                for (int var9 = 0; var9 < 104; ++var9) {
                    int var10 = this.field1192.method80(this.field1545, var8, var9);
                    if (var10 != 0) {
                        int var11 = var10 >> 14 & 32767;
                        int var12 = LocType.method275(var11).field838;
                        if (var12 >= 0) {
                            this.field1446[this.field1155] = this.field1341[var12];
                            this.field1156[this.field1155] = var8;
                            this.field1157[this.field1155] = var9;
                            ++this.field1155;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method450(int arg0) {
        this.field1269 += arg0;
        this.field1544 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1259) {
                this.method408(false);
                this.method408(false);
                this.method462(true);
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
        this.field1544 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;ZILjava/lang/String;)Lub;")
    public final Jagfile method451(int arg0, String arg1, boolean arg2, int arg3, String arg4) {
        int var6 = 5;
        byte[] var7 = signlink.cacheload(arg4);
        if (arg2) {
            field1126 = this.field1124.method246();
        }
        if (var7 != null) {
            this.field1286.reset();
            this.field1286.update(var7);
            int var8 = (int) this.field1286.getValue();
            if (arg3 != var8) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(true, var7);
        } else {
            while (var7 == null) {
                this.method13((byte) 72, "Requesting " + arg1, arg0);
                try {
                    int var10 = 0;
                    DataInputStream var11 = this.method469(arg4 + arg3);
                    byte[] var12 = new byte[6];
                    var11.readFully(var12, 0, 6);
                    Packet var13 = new Packet(var12, 0);
                    var13.field623 = 3;
                    int var14 = var13.method213() + 6;
                    int var15 = 6;
                    var7 = new byte[var14];
                    for (int var16 = 0; var16 < 6; ++var16) {
                        var7[var16] = var12[var16];
                    }
                    while (var15 < var14) {
                        int var17 = var14 - var15;
                        if (var17 > 1000) {
                            var17 = 1000;
                        }
                        var15 += var11.read(var7, var15, var17);
                        int var18 = var15 * 100 / var14;
                        if (var10 != var18) {
                            this.method13((byte) 72, "Loading " + arg1 + " - " + var18 + "%", arg0);
                        }
                        var10 = var18;
                    }
                    var11.close();
                } catch (IOException var22) {
                    var7 = null;
                    for (int var19 = var6; var19 > 0; --var19) {
                        this.method13((byte) 72, "Error loading - Will retry in " + var19 + " secs.", arg0);
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception var21) {
                        }
                    }
                    var6 *= 2;
                    if (var6 > 60) {
                        var6 = 60;
                    }
                }
            }
            signlink.cachesave(arg4, var7);
            return new Jagfile(true, var7);
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method452(int arg0) {
        if (this.field1492.field306 >> 7 == this.field1421 && this.field1492.field307 >> 7 == this.field1422) {
            this.field1421 = 0;
        }
        for (int var2 = -1; var2 < this.field1136; ++var2) {
            PlayerEntity var4;
            int var5;
            if (var2 == -1) {
                var4 = this.field1492;
                var5 = this.field1134 << 14;
            } else {
                var4 = this.field1135[this.field1137[var2]];
                var5 = this.field1137[var2] << 14;
            }
            if (var4 != null && var4.method111(this.field1153)) {
                var4.field385 = false;
                if ((field1359 && this.field1136 > 50 || this.field1136 > 200) && var2 != -1 && var4.field330 == var4.field311) {
                    var4.field385 = true;
                }
                int var6 = var4.field306 >> 7;
                int var7 = var4.field307 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field380 != null && field1529 >= var4.field375 && field1529 < var4.field376) {
                        var4.field385 = false;
                        var4.field374 = this.method420(var4.field306, this.field1221, var4.field307, this.field1545);
                        this.field1192.method62(var4.field308, var4.field384, false, this.field1545, var4.field381, var4.field383, (Model) null, var4.field306, var4, var4.field382, 60, var4.field374, var5, var4.field307);
                    } else {
                        if ((var4.field306 & 127) == 64 && (var4.field307 & 127) == 64) {
                            if (this.field1214[var6][var7] == this.field1219) {
                                continue;
                            }
                            this.field1214[var6][var7] = this.field1219;
                        }
                        var4.field374 = this.method420(var4.field306, this.field1221, var4.field307, this.field1545);
                        this.field1192.method61((Model) null, 18197, var4.field374, var5, var4.field307, var4.field308, 60, var4.field309, var4.field306, var4, this.field1545);
                    }
                }
            }
        }
        int var3 = 88 / arg0;
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method453(int arg0) {
        this.field1195.method198(9, 153);
        if (arg0 != -24081) {
            this.field1220 = this.field1124.method246();
        }
        if (this.field1339 != -1) {
            this.field1339 = -1;
            this.field1197 = true;
            this.field1365 = false;
            this.field1152 = true;
        }
        if (this.field1455 != -1) {
            this.field1455 = -1;
            this.field1161 = true;
            this.field1365 = false;
        }
        this.field1290 = -1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIB)V")
    public final void method454(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -96) {
            this.field1270 = this.field1178.method209();
        }
        int var5 = this.field1192.method77(arg1, arg0, arg2);
        if (var5 != 0) {
            int var6 = this.field1192.method81(arg1, arg0, arg2, var5);
            int var7 = var6 >> 6 & 3;
            int var8 = var6 & 31;
            int var9 = 15658734;
            if (var5 > 0) {
                var9 = 15597568;
            }
            int[] var10 = this.field1423.field580;
            int var11 = (103 - arg2) * 512 * 4 + arg0 * 4 + 24624;
            int var12 = var5 >> 14 & 32767;
            LocType var13 = LocType.method275(var12);
            if (var13.field839 != -1) {
                Pix8 var14 = this.field1382[var13.field839];
                if (var14 != null) {
                    int var15 = (var13.field824 * 4 - var14.field593) / 2;
                    int var16 = (var13.field825 * 4 - var14.field594) / 2;
                    var14.method186((104 - arg2 - var13.field825) * 4 + 48 + var16, true, arg0 * 4 + 48 + var15);
                }
            } else {
                if (var8 == 0 || var8 == 2) {
                    if (var7 == 0) {
                        var10[var11] = var9;
                        var10[var11 + 512] = var9;
                        var10[var11 + 1024] = var9;
                        var10[var11 + 1536] = var9;
                    } else if (var7 == 1) {
                        var10[var11] = var9;
                        var10[var11 + 1] = var9;
                        var10[var11 + 2] = var9;
                        var10[var11 + 3] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 3] = var9;
                        var10[var11 + 3 + 512] = var9;
                        var10[var11 + 3 + 1024] = var9;
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 3) {
                        var10[var11 + 1536] = var9;
                        var10[var11 + 1536 + 1] = var9;
                        var10[var11 + 1536 + 2] = var9;
                        var10[var11 + 1536 + 3] = var9;
                    }
                }
                if (var8 == 3) {
                    if (var7 == 0) {
                        var10[var11] = var9;
                    } else if (var7 == 1) {
                        var10[var11 + 3] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 3) {
                        var10[var11 + 1536] = var9;
                    }
                }
                if (var8 == 2) {
                    if (var7 == 3) {
                        var10[var11] = var9;
                        var10[var11 + 512] = var9;
                        var10[var11 + 1024] = var9;
                        var10[var11 + 1536] = var9;
                    } else if (var7 == 0) {
                        var10[var11] = var9;
                        var10[var11 + 1] = var9;
                        var10[var11 + 2] = var9;
                        var10[var11 + 3] = var9;
                    } else if (var7 == 1) {
                        var10[var11 + 3] = var9;
                        var10[var11 + 3 + 512] = var9;
                        var10[var11 + 3 + 1024] = var9;
                        var10[var11 + 3 + 1536] = var9;
                    } else if (var7 == 2) {
                        var10[var11 + 1536] = var9;
                        var10[var11 + 1536 + 1] = var9;
                        var10[var11 + 1536 + 2] = var9;
                        var10[var11 + 1536 + 3] = var9;
                    }
                }
            }
        }
        int var17 = this.field1192.method79(arg1, arg0, arg2);
        if (var17 != 0) {
            int var18 = this.field1192.method81(arg1, arg0, arg2, var17);
            int var19 = var18 >> 6 & 3;
            int var20 = var18 & 31;
            int var21 = var17 >> 14 & 32767;
            LocType var22 = LocType.method275(var21);
            if (var22.field839 != -1) {
                Pix8 var23 = this.field1382[var22.field839];
                if (var23 != null) {
                    int var24 = (var22.field824 * 4 - var23.field593) / 2;
                    int var25 = (var22.field825 * 4 - var23.field594) / 2;
                    var23.method186((104 - arg2 - var22.field825) * 4 + 48 + var25, true, arg0 * 4 + 48 + var24);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = this.field1423.field580;
                int var28 = (103 - arg2) * 512 * 4 + arg0 * 4 + 24624;
                if (var19 != 0 && var19 != 2) {
                    var27[var28] = var26;
                    var27[var28 + 512 + 1] = var26;
                    var27[var28 + 1024 + 2] = var26;
                    var27[var28 + 1536 + 3] = var26;
                } else {
                    var27[var28 + 1536] = var26;
                    var27[var28 + 1024 + 1] = var26;
                    var27[var28 + 512 + 2] = var26;
                    var27[var28 + 3] = var26;
                }
            }
        }
        int var29 = this.field1192.method80(arg1, arg0, arg2);
        if (var29 != 0) {
            int var30 = var29 >> 14 & 32767;
            LocType var31 = LocType.method275(var30);
            if (var31.field839 != -1) {
                Pix8 var32 = this.field1382[var31.field839];
                if (var32 != null) {
                    int var33 = (var31.field824 * 4 - var32.field593) / 2;
                    int var34 = (var31.field825 * 4 - var32.field594) / 2;
                    var32.method186((104 - arg2 - var31.field825) * 4 + 48 + var34, true, arg0 * 4 + 48 + var33);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLhc;)Z")
    public final boolean method455(boolean arg0, Component arg1) {
        int var3 = arg1.field982;
        if (arg0) {
            this.method6();
        }
        if (var3 >= 1 && var3 <= 200) {
            if (var3 >= 101) {
                var3 -= 101;
            } else {
                --var3;
            }
            this.field1330[this.field1144] = "Remove @whi@" + this.field1283[var3];
            this.field1293[this.field1144] = 804;
            ++this.field1144;
            this.field1330[this.field1144] = "Message @whi@" + this.field1283[var3];
            this.field1293[this.field1144] = 125;
            ++this.field1144;
            return true;
        } else if (var3 >= 401 && var3 <= 500) {
            this.field1330[this.field1144] = "Remove @whi@" + arg1.field1012;
            this.field1293[this.field1144] = 521;
            ++this.field1144;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IJ)V")
    public final void method456(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1258 >= 100) {
                this.method382(0, 0, "", "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = JString.method255(JString.method252(arg1, (byte) -74), true);
                for (int var5 = 0; var5 < this.field1258; ++var5) {
                    if (this.field1471[var5] == arg1) {
                        this.method382(0, 0, "", var4 + " is already on your ignore list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1395; ++var6) {
                    if (this.field1539[var6] == arg1) {
                        this.method382(0, 0, "", "Please remove " + var4 + " from your friend list first");
                        return;
                    }
                }
                this.field1471[this.field1258++] = arg1;
                this.field1197 = true;
                this.field1195.method198(9, 175);
                this.field1195.method205(arg1, true);
                if (arg0 != 0) {
                    this.field1270 = this.field1178.method209();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public static final void method457(int arg0) {
        if (field1126 == arg0) {
            World3D.field224 = false;
            Pix3D.field552 = false;
            field1359 = false;
            World.field36 = false;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)I")
    public final int method458(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg0;
        return arg2 < 0 ? ((arg1 & 16711935) * arg0 + (arg3 & 16711935) * var5 & -16711936) + ((arg1 & 65280) * arg0 + (arg3 & 65280) * var5 & 16711680) >> 8 : 1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;II)V")
    public final void method459(int arg0, String arg1, int arg2, int arg3) {
        if (this.field1412 != arg2) {
            this.field1447 = null;
        }
        if (arg1 != null) {
            Object var5 = this.field1173;
            synchronized (this.field1173) {
                this.field1506 = arg1;
                this.field1268 = arg0;
                this.field1328 = arg3;
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method460(byte arg0) {
        if (arg0 == -96) {
            if (this.field1226 == 2) {
                for (LocSpawned var2 = (LocSpawned) this.field1169.method228(); var2 != null; var2 = (LocSpawned) this.field1169.method230(this.field1162)) {
                    if (field1529 >= var2.field652) {
                        this.method376(0, var2.field650, var2.field647, var2.field648, var2.field649, var2.field645, var2.field651, var2.field646);
                        var2.method107();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method461(long arg0, boolean arg1) {
        this.field1486 &= arg1;
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1258; ++var4) {
                if (this.field1471[var4] == arg0) {
                    --this.field1258;
                    this.field1197 = true;
                    for (int var5 = var4; var5 < this.field1258; ++var5) {
                        this.field1471[var5] = this.field1471[var5 + 1];
                    }
                    this.field1195.method198(9, 68);
                    this.field1195.method205(arg0, true);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method462(boolean arg0) {
        short var2 = 256;
        if (this.field1537 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1537 > 768) {
                    this.field1366[var3] = this.method458(1024 - this.field1537, this.field1368[var3], -514, this.field1367[var3]);
                } else if (this.field1537 > 256) {
                    this.field1366[var3] = this.field1368[var3];
                } else {
                    this.field1366[var3] = this.method458(256 - this.field1537, this.field1367[var3], -514, this.field1368[var3]);
                }
            }
        } else if (this.field1538 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1538 > 768) {
                    this.field1366[var4] = this.method458(1024 - this.field1538, this.field1369[var4], -514, this.field1367[var4]);
                } else if (this.field1538 > 256) {
                    this.field1366[var4] = this.field1369[var4];
                } else {
                    this.field1366[var4] = this.method458(256 - this.field1538, this.field1367[var4], -514, this.field1369[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1366[var5] = this.field1367[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1512.field674[var6] = this.field1318.field580[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1261[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1331[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1366[var26];
                    int var30 = this.field1512.field674[var8];
                    this.field1512.field674[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field1512.method236(0, 0, -715, super.field12);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1513.field674[var10] = this.field1319.field580[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1261[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1331[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1366[var18];
                    int var22 = this.field1513.field674[var16];
                    this.field1513.field674[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field1513.method236(0, 661, -715, super.field12);
        if (!arg0) {
            this.field1212 = !this.field1212;
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method463(int arg0) {
        if (arg0 != -6645) {
            this.field1195.method199(153);
        }
        this.field1460 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1375[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field962; ++var3) {
                if (!IdkType.field963[var3].field969 && IdkType.field963[var3].field964 == var2 + (this.field1218 ? 0 : 7)) {
                    this.field1375[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Z")
    public final boolean method464(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        if (arg0 != 27708) {
            this.field1270 = -1;
        }
        Component var5 = Component.field973[arg1];
        for (int var6 = 0; var6 < var5.field994.length && var5.field994[var6] != -1; ++var6) {
            Component var7 = Component.field973[var5.field994[var6]];
            if (var7.field980 == 1) {
                var4 |= this.method464(27708, var7.field978, arg2);
            }
            if (var7.field980 == 6 && (var7.field1021 != -1 || var7.field1022 != -1)) {
                boolean var8 = this.method404(var7, this.field1383);
                int var9;
                if (var8) {
                    var9 = var7.field1022;
                } else {
                    var9 = var7.field1021;
                }
                if (var9 != -1) {
                    SeqType var10 = SeqType.field1043[var9];
                    var7.field977 += arg2;
                    while (var7.field977 > var10.field1047[var7.field976]) {
                        var7.field977 -= var10.field1047[var7.field976] + 1;
                        ++var7.field976;
                        if (var7.field976 >= var10.field1044) {
                            var7.field976 -= var10.field1048;
                            if (var7.field976 < 0 || var7.field976 >= var10.field1044) {
                                var7.field976 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method465(byte arg0) {
        try {
            if (this.field1396 != null) {
                this.field1396.method29();
            }
        } catch (Exception var3) {
        }
        this.field1396 = null;
        if (arg0 != 117) {
            this.field1195.method199(183);
        }
        this.field1486 = false;
        this.field1151 = 0;
        this.field1402 = "";
        this.field1403 = "";
        InputTracking.method35(0, false);
        this.method466(-39187);
        this.field1192.method50((byte) -101);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field1501[var2].method295(-999);
        }
        System.gc();
        this.method470((byte) -57);
        this.field1521 = null;
        this.field1363 = 0;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        if (arg0 != 16374) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field15 != null ? super.field15 : this;
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method466(int arg0) {
        LocType.field850.method104();
        LocType.field851.method104();
        if (arg0 != -39187) {
            this.field1270 = this.field1178.method209();
        }
        NpcType.field884.method104();
        ObjType.field928.method104();
        ObjType.field929.method104();
        PlayerEntity.field386.method104();
        SpotAnimType.field1073.method104();
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field15 != null) {
                    return new URL("http://127.0.0.1:" + (field1357 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLkb;IILz;)V")
    private final void method467(byte arg0, Packet arg1, int arg2, int arg3, PlayerEntity arg4) {
        if (this.field1280 != arg0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if ((arg2 & 1) == 1) {
            int var7 = arg1.method209();
            byte[] var8 = new byte[var7];
            Packet var9 = new Packet(var8, 0);
            arg1.method218(0, var7, var8, this.field1274);
            this.field1140[arg3] = var9;
            arg4.method113(-176, var9);
        }
        if ((arg2 & 2) == 2) {
            int var10 = arg1.method211();
            if (var10 == 65535) {
                var10 = -1;
            }
            if (arg4.field333 == var10) {
                arg4.field337 = 0;
            }
            int var11 = arg1.method209();
            if (var10 == -1 || arg4.field333 == -1 || SeqType.field1043[var10].field1051 > SeqType.field1043[arg4.field333].field1051 || SeqType.field1043[arg4.field333].field1051 == 0) {
                arg4.field333 = var10;
                arg4.field334 = 0;
                arg4.field335 = 0;
                arg4.field336 = var11;
                arg4.field337 = 0;
            }
        }
        if ((arg2 & 4) == 4) {
            arg4.field327 = arg1.method211();
            if (arg4.field327 == 65535) {
                arg4.field327 = -1;
            }
        }
        if ((arg2 & 8) == 8) {
            arg4.field318 = arg1.method216();
            arg4.field320 = 0;
            arg4.field321 = 0;
            arg4.field319 = 150;
            this.method382(2, 0, arg4.field366, arg4.field318);
        }
        if ((arg2 & 16) == 16) {
            arg4.field322 = arg1.method209();
            arg4.field323 = arg1.method209();
            arg4.field324 = field1529 + 400;
            arg4.field325 = arg1.method209();
            arg4.field326 = arg1.method209();
        }
        if ((arg2 & 32) == 32) {
            arg4.field328 = arg1.method211();
            arg4.field329 = arg1.method211();
        }
        if ((arg2 & 64) == 64) {
            int var12 = arg1.method211();
            int var13 = arg1.method209();
            int var14 = arg1.method209();
            int var15 = arg1.field623;
            if (arg4.field366 != null) {
                long var16 = JString.method251(arg4.field366);
                boolean var18 = false;
                if (var13 <= 1) {
                    for (int var19 = 0; var19 < this.field1258; ++var19) {
                        if (this.field1471[var19] == var16) {
                            var18 = true;
                            break;
                        }
                    }
                }
                if (!var18 && this.field1536 == 0) {
                    try {
                        String var20 = WordPack.method258(-679, var14, arg1);
                        String var21 = WordFilter.method335(var20, true);
                        arg4.field318 = var21;
                        arg4.field320 = var12 >> 8;
                        arg4.field321 = var12 & 255;
                        arg4.field319 = 150;
                        if (var13 > 1) {
                            this.method382(1, 0, arg4.field366, var21);
                        } else {
                            this.method382(2, 0, arg4.field366, var21);
                        }
                    } catch (Exception var24) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg1.field623 = var14 + var15;
        }
        if ((arg2 & 256) == 256) {
            arg4.field338 = arg1.method211();
            int var23 = arg1.method214();
            arg4.field342 = var23 >> 16;
            arg4.field341 = (var23 & 65535) + field1529;
            arg4.field339 = 0;
            arg4.field340 = 0;
            if (arg4.field341 > field1529) {
                arg4.field339 = -1;
            }
            if (arg4.field338 == 65535) {
                arg4.field338 = -1;
            }
        }
        if ((arg2 & 512) == 512) {
            arg4.field343 = arg1.method209();
            arg4.field345 = arg1.method209();
            arg4.field344 = arg1.method209();
            arg4.field346 = arg1.method209();
            arg4.field347 = arg1.method211() + field1529;
            arg4.field348 = arg1.method211() + field1529;
            arg4.field349 = arg1.method209();
            arg4.field353 = 0;
            arg4.field354[0] = arg4.field344;
            arg4.field355[0] = arg4.field346;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg5 & 2047;
        int var9 = 2048 - arg3 & 2047;
        this.field1269 += arg2;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg4;
        if (var8 != 0) {
            int var13 = Model.field531[var8];
            int var14 = Model.field532[var8];
            int var15 = var11 * var14 - arg4 * var13 >> 16;
            var12 = var11 * var13 + arg4 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field531[var9];
            int var17 = Model.field532[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1343 = arg0 - var10;
        this.field1344 = arg1 - var11;
        this.field1345 = arg6 - var12;
        this.field1346 = arg5;
        this.field1347 = arg3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method469(String arg0) throws IOException {
        return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method470(byte arg0) {
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 != -57) {
            this.field1412 = 457;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method471(byte arg0) {
        if (this.field1400 != 0) {
            PixFont var2 = this.field1462;
            int var3 = 0;
            if (this.field1207 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1131[var4] != null) {
                    int var5 = this.field1129[var4];
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1253 == 0 || this.field1253 == 1 && this.method444(this.field1130[var4], true))) {
                        int var6 = 329 - var3 * 13;
                        var2.method191(476, var6, "From " + this.field1130[var4] + ": " + this.field1131[var4], 4, 0);
                        var2.method191(476, var6 - 1, "From " + this.field1130[var4] + ": " + this.field1131[var4], 4, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field1253 < 2) {
                        int var7 = 329 - var3 * 13;
                        var2.method191(476, var7, this.field1131[var4], 4, 0);
                        var2.method191(476, var7 - 1, this.field1131[var4], 4, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field1253 < 2) {
                        int var8 = 329 - var3 * 13;
                        var2.method191(476, var8, "To " + this.field1130[var4] + ": " + this.field1131[var4], 4, 0);
                        var2.method191(476, var8 - 1, "To " + this.field1130[var4] + ": " + this.field1131[var4], 4, 65535);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 != 7) {
                this.field1274 = !this.field1274;
            }
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method472(int arg0) {
        if (arg0 != -45891) {
            field1126 = -31;
        }
        for (int var2 = 0; var2 < this.field1209; ++var2) {
            int var3 = this.field1210[var2];
            NpcEntity var4 = this.field1208[var3];
            if (var4 != null) {
                this.method473(this.field1298, var4, var4.field360.field865);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLx;I)V")
    public final void method473(boolean arg0, PathingEntity arg1, int arg2) {
        if (!arg0) {
            this.field1255 = !this.field1255;
        }
        if (arg1.field306 < 128 || arg1.field307 < 128 || arg1.field306 >= 13184 || arg1.field307 >= 13184) {
            arg1.field333 = -1;
            arg1.field338 = -1;
            arg1.field347 = 0;
            arg1.field348 = 0;
            arg1.field306 = arg1.field354[0] * 128 + arg1.field310 * 64;
            arg1.field307 = arg1.field355[0] * 128 + arg1.field310 * 64;
            arg1.field353 = 0;
        }
        if (this.field1492 == arg1 && (arg1.field306 < 1536 || arg1.field307 < 1536 || arg1.field306 >= 11776 || arg1.field307 >= 11776)) {
            arg1.field333 = -1;
            arg1.field338 = -1;
            arg1.field347 = 0;
            arg1.field348 = 0;
            arg1.field306 = arg1.field354[0] * 128 + arg1.field310 * 64;
            arg1.field307 = arg1.field355[0] * 128 + arg1.field310 * 64;
            arg1.field353 = 0;
        }
        if (arg1.field347 > field1529) {
            this.method474(arg1, 71);
        } else if (arg1.field348 >= field1529) {
            this.method475(-33935, arg1);
        } else {
            this.method476(arg1, 45927);
        }
        this.method477(arg1, -485);
        this.method478(arg1, this.field1120);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lx;I)V")
    public final void method474(PathingEntity arg0, int arg1) {
        int var3 = 68 / arg1;
        int var4 = arg0.field347 - field1529;
        int var5 = arg0.field343 * 128 + arg0.field310 * 64;
        int var6 = arg0.field345 * 128 + arg0.field310 * 64;
        arg0.field306 += (var5 - arg0.field306) / var4;
        arg0.field307 += (var6 - arg0.field307) / var4;
        arg0.field357 = 0;
        if (arg0.field349 == 0) {
            arg0.field352 = 1024;
        }
        if (arg0.field349 == 1) {
            arg0.field352 = 1536;
        }
        if (arg0.field349 == 2) {
            arg0.field352 = 0;
        }
        if (arg0.field349 == 3) {
            arg0.field352 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILx;)V")
    public final void method475(int arg0, PathingEntity arg1) {
        if (field1529 == arg1.field348 || arg1.field333 == -1 || arg1.field336 != 0 || arg1.field335 + 1 > SeqType.field1043[arg1.field333].field1047[arg1.field334]) {
            int var3 = arg1.field348 - arg1.field347;
            int var4 = field1529 - arg1.field347;
            int var5 = arg1.field343 * 128 + arg1.field310 * 64;
            int var6 = arg1.field345 * 128 + arg1.field310 * 64;
            int var7 = arg1.field344 * 128 + arg1.field310 * 64;
            int var8 = arg1.field346 * 128 + arg1.field310 * 64;
            arg1.field306 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field307 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field357 = 0;
        if (arg1.field349 == 0) {
            arg1.field352 = 1024;
        }
        if (arg1.field349 == 1) {
            arg1.field352 = 1536;
        }
        if (arg1.field349 == 2) {
            arg1.field352 = 0;
        }
        if (arg1.field349 == 3) {
            arg1.field352 = 512;
        }
        arg1.field308 = arg1.field352;
        if (arg0 != -33935) {
            this.field1447 = null;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lx;I)V")
    public final void method476(PathingEntity arg0, int arg1) {
        arg0.field330 = arg0.field311;
        if (arg0.field353 == 0) {
            arg0.field357 = 0;
        } else {
            if (arg0.field333 != -1 && arg0.field336 == 0) {
                SeqType var3 = SeqType.field1043[arg0.field333];
                if (var3.field1049 == null) {
                    ++arg0.field357;
                    return;
                }
            }
            int var4 = arg0.field306;
            int var5 = arg0.field307;
            int var6 = arg0.field354[arg0.field353 - 1] * 128 + arg0.field310 * 64;
            int var7 = arg0.field355[arg0.field353 - 1] * 128 + arg0.field310 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field352 = 1280;
                    } else if (var5 > var7) {
                        arg0.field352 = 1792;
                    } else {
                        arg0.field352 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field352 = 768;
                    } else if (var5 > var7) {
                        arg0.field352 = 256;
                    } else {
                        arg0.field352 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field352 = 1024;
                } else {
                    arg0.field352 = 0;
                }
                int var8 = arg0.field352 - arg0.field308 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field314;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field313;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field316;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field315;
                }
                if (var9 == -1) {
                    var9 = arg0.field313;
                }
                arg0.field330 = var9;
                int var10 = 4;
                if (arg1 == 45927) {
                    if (arg0.field352 != arg0.field308 && arg0.field327 == -1) {
                        var10 = 2;
                    }
                    if (arg0.field353 > 2) {
                        var10 = 6;
                    }
                    if (arg0.field353 > 3) {
                        var10 = 8;
                    }
                    if (arg0.field357 > 0 && arg0.field353 > 1) {
                        var10 = 8;
                        --arg0.field357;
                    }
                    if (arg0.field356[arg0.field353 - 1]) {
                        var10 <<= 1;
                    }
                    if (var10 >= 8 && arg0.field330 == arg0.field313 && arg0.field317 != -1) {
                        arg0.field330 = arg0.field317;
                    }
                    if (var4 < var6) {
                        arg0.field306 += var10;
                        if (arg0.field306 > var6) {
                            arg0.field306 = var6;
                        }
                    } else if (var4 > var6) {
                        arg0.field306 -= var10;
                        if (arg0.field306 < var6) {
                            arg0.field306 = var6;
                        }
                    }
                    if (var5 < var7) {
                        arg0.field307 += var10;
                        if (arg0.field307 > var7) {
                            arg0.field307 = var7;
                        }
                    } else if (var5 > var7) {
                        arg0.field307 -= var10;
                        if (arg0.field307 < var7) {
                            arg0.field307 = var7;
                        }
                    }
                    if (arg0.field306 == var6 && arg0.field307 == var7) {
                        --arg0.field353;
                    }
                }
            } else {
                arg0.field306 = var6;
                arg0.field307 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Lx;I)V")
    public final void method477(PathingEntity arg0, int arg1) {
        if (arg1 >= 0) {
            this.field1447 = null;
        }
        if (arg0.field327 != -1 && arg0.field327 < 32768) {
            NpcEntity var3 = this.field1208[arg0.field327];
            if (var3 != null) {
                int var4 = arg0.field306 - var3.field306;
                int var5 = arg0.field307 - var3.field307;
                if (var4 != 0 || var5 != 0) {
                    arg0.field352 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                }
            }
        }
        if (arg0.field327 >= 32768) {
            int var6 = arg0.field327 - 32768;
            if (this.field1206 == var6) {
                var6 = this.field1134;
            }
            PlayerEntity var7 = this.field1135[var6];
            if (var7 != null) {
                int var8 = arg0.field306 - var7.field306;
                int var9 = arg0.field307 - var7.field307;
                if (var8 != 0 || var9 != 0) {
                    arg0.field352 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                }
            }
        }
        if ((arg0.field328 != 0 || arg0.field329 != 0) && (arg0.field353 == 0 || arg0.field357 > 0)) {
            int var10 = arg0.field306 - (arg0.field328 - this.field1448 - this.field1448) * 64;
            int var11 = arg0.field307 - (arg0.field329 - this.field1449 - this.field1449) * 64;
            if (var10 != 0 || var11 != 0) {
                arg0.field352 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
            }
            arg0.field328 = 0;
            arg0.field329 = 0;
        }
        int var12 = arg0.field352 - arg0.field308 & 2047;
        if (var12 != 0) {
            if (var12 >= 32 && var12 <= 2016) {
                if (var12 > 1024) {
                    arg0.field308 -= 32;
                } else {
                    arg0.field308 += 32;
                }
            } else {
                arg0.field308 = arg0.field352;
            }
            arg0.field308 &= 2047;
            if (arg0.field330 == arg0.field311 && arg0.field352 != arg0.field308) {
                if (arg0.field312 != -1) {
                    arg0.field330 = arg0.field312;
                    return;
                }
                arg0.field330 = arg0.field313;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lx;B)V")
    public final void method478(PathingEntity arg0, byte arg1) {
        if (arg1 != 8) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        arg0.field309 = false;
        if (arg0.field330 != -1) {
            SeqType var4 = SeqType.field1043[arg0.field330];
            ++arg0.field332;
            if (arg0.field331 < var4.field1044 && arg0.field332 > var4.field1047[arg0.field331]) {
                arg0.field332 = 0;
                ++arg0.field331;
            }
            if (arg0.field331 >= var4.field1044) {
                arg0.field332 = 0;
                arg0.field331 = 0;
            }
        }
        if (arg0.field333 != -1 && arg0.field336 == 0) {
            SeqType var5 = SeqType.field1043[arg0.field333];
            ++arg0.field335;
            while (arg0.field334 < var5.field1044 && arg0.field335 > var5.field1047[arg0.field334]) {
                arg0.field335 -= var5.field1047[arg0.field334];
                ++arg0.field334;
            }
            if (arg0.field334 >= var5.field1044) {
                arg0.field334 -= var5.field1048;
                ++arg0.field337;
                if (arg0.field337 >= var5.field1054) {
                    arg0.field333 = -1;
                }
                if (arg0.field334 < 0 || arg0.field334 >= var5.field1044) {
                    arg0.field333 = -1;
                }
            }
            arg0.field309 = var5.field1050;
        }
        if (arg0.field336 > 0) {
            --arg0.field336;
        }
        if (arg0.field338 != -1 && field1529 >= arg0.field341) {
            if (arg0.field339 < 0) {
                arg0.field339 = 0;
            }
            SeqType var6 = SpotAnimType.field1061[arg0.field338].field1064;
            ++arg0.field340;
            while (arg0.field339 < var6.field1044 && arg0.field340 > var6.field1047[arg0.field339]) {
                arg0.field340 -= var6.field1047[arg0.field339];
                ++arg0.field339;
            }
            if (arg0.field339 >= var6.field1044) {
                if (arg0.field339 < 0 || arg0.field339 >= var6.field1044) {
                    arg0.field338 = -1;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method479(int arg0) {
        if (arg0 != 0) {
            this.field1452 = !this.field1452;
        }
        if (this.field1485) {
            this.field1485 = false;
            this.field1300.method236(11, 0, -715, super.field12);
            this.field1301.method236(375, 0, -715, super.field12);
            this.field1302.method236(5, 729, -715, super.field12);
            this.field1303.method236(231, 752, -715, super.field12);
            this.field1304.method236(0, 0, -715, super.field12);
            this.field1305.method236(0, 561, -715, super.field12);
            this.field1306.method236(11, 520, -715, super.field12);
            this.field1307.method236(231, 520, -715, super.field12);
            this.field1308.method236(375, 501, -715, super.field12);
            this.field1309.method236(345, 0, -715, super.field12);
            this.field1197 = true;
            this.field1161 = true;
            this.field1152 = true;
            this.field1297 = true;
            if (this.field1226 != 2) {
                this.field1490.method236(11, 8, -715, super.field12);
                this.field1489.method236(5, 561, -715, super.field12);
            }
        }
        if (this.field1226 == 2) {
            this.method367((byte) 122);
        }
        if (this.field1381 && this.field1433 == 1) {
            this.field1197 = true;
        }
        if (this.field1339 != -1) {
            boolean var2 = this.method464(27708, this.field1339, this.field1445);
            if (var2) {
                this.field1197 = true;
            }
        }
        if (this.field1374 == 2) {
            this.field1197 = true;
        }
        if (this.field1407 == 2) {
            this.field1197 = true;
        }
        if (this.field1197) {
            this.method391(818);
            this.field1197 = false;
        }
        if (this.field1455 == -1) {
            this.field1543.field992 = this.field1457 - this.field1322 - 77;
            if (super.field19 > 453 && super.field19 < 565 && super.field20 > 350) {
                this.method400(this.field1499, 0, this.field1457, super.field19 - 22, this.field1543, super.field20 - 375, 77, 463, false);
            }
            int var3 = this.field1457 - 77 - this.field1543.field992;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1457 - 77) {
                var3 = this.field1457 - 77;
            }
            if (this.field1322 != var3) {
                this.field1322 = var3;
                this.field1161 = true;
            }
            ++field1327;
            if (field1327 > 87) {
                field1327 = 0;
                this.field1195.method198(9, 225);
            }
        }
        if (this.field1455 != -1) {
            boolean var4 = this.method464(27708, this.field1455, this.field1445);
            if (var4) {
                this.field1161 = true;
            }
        }
        if (this.field1374 == 3) {
            this.field1161 = true;
        }
        if (this.field1407 == 3) {
            this.field1161 = true;
        }
        if (this.field1295 != null) {
            this.field1161 = true;
        }
        if (this.field1381 && this.field1433 == 2) {
            this.field1161 = true;
        }
        if (this.field1161) {
            this.method419(false);
            this.field1161 = false;
        }
        if (this.field1226 == 2) {
            this.method394((byte) 7);
            this.field1489.method236(5, 561, -715, super.field12);
        }
        if (this.field1119 != -1) {
            this.field1152 = true;
        }
        if (this.field1152) {
            if (this.field1119 != -1 && this.field1251 == this.field1119) {
                this.field1119 = -1;
                this.field1195.method198(9, 50);
                this.field1195.method199(this.field1251);
            }
            this.field1152 = false;
            this.field1380.method235(0);
            this.field1181.method186(0, true, 0);
            if (this.field1339 == -1) {
                if (this.field1277[this.field1251] != -1) {
                    if (this.field1251 == 0) {
                        this.field1473.method186(30, true, 29);
                    }
                    if (this.field1251 == 1) {
                        this.field1474.method186(29, true, 59);
                    }
                    if (this.field1251 == 2) {
                        this.field1474.method186(29, true, 87);
                    }
                    if (this.field1251 == 3) {
                        this.field1475.method186(29, true, 115);
                    }
                    if (this.field1251 == 4) {
                        this.field1477.method186(29, true, 156);
                    }
                    if (this.field1251 == 5) {
                        this.field1477.method186(29, true, 184);
                    }
                    if (this.field1251 == 6) {
                        this.field1476.method186(30, true, 212);
                    }
                }
                if (this.field1277[0] != -1 && (this.field1119 != 0 || field1529 % 20 < 10)) {
                    this.field1276[0].method186(34, true, 35);
                }
                if (this.field1277[1] != -1 && (this.field1119 != 1 || field1529 % 20 < 10)) {
                    this.field1276[1].method186(32, true, 59);
                }
                if (this.field1277[2] != -1 && (this.field1119 != 2 || field1529 % 20 < 10)) {
                    this.field1276[2].method186(32, true, 86);
                }
                if (this.field1277[3] != -1 && (this.field1119 != 3 || field1529 % 20 < 10)) {
                    this.field1276[3].method186(33, true, 121);
                }
                if (this.field1277[4] != -1 && (this.field1119 != 4 || field1529 % 20 < 10)) {
                    this.field1276[4].method186(34, true, 157);
                }
                if (this.field1277[5] != -1 && (this.field1119 != 5 || field1529 % 20 < 10)) {
                    this.field1276[5].method186(32, true, 185);
                }
                if (this.field1277[6] != -1 && (this.field1119 != 6 || field1529 % 20 < 10)) {
                    this.field1276[6].method186(34, true, 212);
                }
            }
            this.field1380.method236(165, 520, -715, super.field12);
            this.field1379.method235(0);
            this.field1180.method186(0, true, 0);
            if (this.field1339 == -1) {
                if (this.field1277[this.field1251] != -1) {
                    if (this.field1251 == 7) {
                        this.field1182.method186(0, true, 49);
                    }
                    if (this.field1251 == 8) {
                        this.field1183.method186(0, true, 81);
                    }
                    if (this.field1251 == 9) {
                        this.field1183.method186(0, true, 108);
                    }
                    if (this.field1251 == 10) {
                        this.field1184.method186(1, true, 136);
                    }
                    if (this.field1251 == 11) {
                        this.field1186.method186(0, true, 178);
                    }
                    if (this.field1251 == 12) {
                        this.field1186.method186(0, true, 205);
                    }
                    if (this.field1251 == 13) {
                        this.field1185.method186(0, true, 233);
                    }
                }
                if (this.field1277[8] != -1 && (this.field1119 != 8 || field1529 % 20 < 10)) {
                    this.field1276[7].method186(2, true, 80);
                }
                if (this.field1277[9] != -1 && (this.field1119 != 9 || field1529 % 20 < 10)) {
                    this.field1276[8].method186(3, true, 107);
                }
                if (this.field1277[10] != -1 && (this.field1119 != 10 || field1529 % 20 < 10)) {
                    this.field1276[9].method186(4, true, 142);
                }
                if (this.field1277[11] != -1 && (this.field1119 != 11 || field1529 % 20 < 10)) {
                    this.field1276[10].method186(2, true, 179);
                }
                if (this.field1277[12] != -1 && (this.field1119 != 12 || field1529 % 20 < 10)) {
                    this.field1276[11].method186(2, true, 206);
                }
                if (this.field1277[13] != -1 && (this.field1119 != 13 || field1529 % 20 < 10)) {
                    this.field1276[12].method186(2, true, 230);
                }
            }
            this.field1379.method236(492, 501, -715, super.field12);
            this.field1490.method235(0);
        }
        if (this.field1297) {
            this.field1297 = false;
            this.field1378.method235(0);
            this.field1179.method186(0, true, 0);
            this.field1462.method189(-45560, "Public chat", 33, 16777215, true, 57);
            if (this.field1170 == 0) {
                this.field1462.method189(-45560, "On", 46, 65280, true, 57);
            }
            if (this.field1170 == 1) {
                this.field1462.method189(-45560, "Friends", 46, 16776960, true, 57);
            }
            if (this.field1170 == 2) {
                this.field1462.method189(-45560, "Off", 46, 16711680, true, 57);
            }
            if (this.field1170 == 3) {
                this.field1462.method189(-45560, "Hide", 46, 65535, true, 57);
            }
            this.field1462.method189(-45560, "Private chat", 33, 16777215, true, 186);
            if (this.field1253 == 0) {
                this.field1462.method189(-45560, "On", 46, 65280, true, 186);
            }
            if (this.field1253 == 1) {
                this.field1462.method189(-45560, "Friends", 46, 16776960, true, 186);
            }
            if (this.field1253 == 2) {
                this.field1462.method189(-45560, "Off", 46, 16711680, true, 186);
            }
            this.field1462.method189(-45560, "Trade/duel", 33, 16777215, true, 326);
            if (this.field1354 == 0) {
                this.field1462.method189(-45560, "On", 46, 65280, true, 326);
            }
            if (this.field1354 == 1) {
                this.field1462.method189(-45560, "Friends", 46, 16776960, true, 326);
            }
            if (this.field1354 == 2) {
                this.field1462.method189(-45560, "Off", 46, 16711680, true, 326);
            }
            this.field1462.method189(-45560, "Report abuse", 38, 16777215, true, 462);
            this.field1378.method236(471, 0, -715, super.field12);
            this.field1490.method235(0);
        }
        this.field1445 = 0;
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method480(boolean arg0) {
        byte[] var2 = this.field1355.method250(field1310, "title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1512.method235(0);
        var3.method171(0, 0, true);
        this.field1513.method235(0);
        var3.method171(0, -661, true);
        this.field1509.method235(0);
        var3.method171(0, -128, true);
        this.field1510.method235(0);
        var3.method171(-386, -214, true);
        this.field1511.method235(0);
        var3.method171(-186, -214, true);
        this.field1514.method235(0);
        var3.method171(-265, 0, true);
        this.field1515.method235(0);
        var3.method171(-265, -574, true);
        this.field1516.method235(0);
        var3.method171(-186, -128, true);
        this.field1517.method235(0);
        var3.method171(-186, -574, true);
        int[] var4 = new int[var3.field581];
        for (int var5 = 0; var5 < var3.field582; ++var5) {
            for (int var10 = 0; var10 < var3.field581; ++var10) {
                var4[var10] = var3.field580[var3.field581 * var5 + (var3.field581 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field581; ++var11) {
                var3.field580[var3.field581 * var5 + var11] = var4[var11];
            }
        }
        this.field1512.method235(0);
        var3.method171(0, 394, true);
        this.field1513.method235(0);
        var3.method171(0, -267, true);
        this.field1509.method235(0);
        var3.method171(0, 266, true);
        this.field1510.method235(0);
        var3.method171(-386, 180, true);
        this.field1511.method235(0);
        var3.method171(-186, 180, true);
        this.field1514.method235(0);
        var3.method171(-265, 394, true);
        if (arg0) {
            this.field1447 = null;
        }
        this.field1515.method235(0);
        var3.method171(-265, -180, true);
        this.field1516.method235(0);
        var3.method171(-186, 212, true);
        this.field1517.method235(0);
        var3.method171(-186, -180, true);
        Pix32 var6 = new Pix32(this.field1355, "logo", 0);
        this.field1509.method235(0);
        var6.method173(18, true, super.field10 / 2 - var6.field581 / 2 - 128);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method7(boolean arg0) {
        if (!this.field1333 && !this.field1257 && !this.field1500) {
            ++field1529;
            if (!arg0) {
                this.field1270 = this.field1178.method209();
            }
            if (!this.field1486) {
                this.method411(3);
            } else {
                this.method390(-30820);
            }
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method481(int arg0) {
        int var2 = this.field1463.method190("Choose Option", 9);
        for (int var3 = 0; var3 < this.field1144; ++var3) {
            int var11 = this.field1463.method190(this.field1330[var3], 9);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        if (arg0 < this.field1256 || arg0 > this.field1256) {
            this.field1195.method199(215);
        }
        var2 += 8;
        int var4 = this.field1144 * 15 + 21;
        if (super.field22 > 8 && super.field23 > 11 && super.field22 < 520 && super.field23 < 345) {
            int var5 = super.field22 - 8 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field23 - 11;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field1381 = true;
            this.field1433 = 0;
            this.field1434 = var5;
            this.field1435 = var6;
            this.field1436 = var2;
            this.field1437 = this.field1144 * 15 + 22;
        }
        if (super.field22 > 562 && super.field23 > 231 && super.field22 < 752 && super.field23 < 492) {
            int var7 = super.field22 - 562 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field23 - 231;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field1381 = true;
            this.field1433 = 1;
            this.field1434 = var7;
            this.field1435 = var8;
            this.field1436 = var2;
            this.field1437 = this.field1144 * 15 + 22;
        }
        if (super.field22 > 22 && super.field23 > 375 && super.field22 < 501 && super.field23 < 471) {
            int var9 = super.field22 - 22 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field23 - 375;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field1381 = true;
            this.field1433 = 2;
            this.field1434 = var9;
            this.field1435 = var10;
            this.field1436 = var2;
            this.field1437 = this.field1144 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method482(int arg0) {
        int var2 = 76 / arg0;
        if (this.field1144 >= 2 || this.field1246 != 0 || this.field1502 != 0) {
            String var3;
            if (this.field1246 == 1 && this.field1144 < 2) {
                var3 = "Use " + this.field1250 + " with...";
            } else if (this.field1502 == 1 && this.field1144 < 2) {
                var3 = this.field1505 + "...";
            } else {
                var3 = this.field1330[this.field1144 - 1];
            }
            if (this.field1144 > 2) {
                var3 = var3 + "@whi@ / " + (this.field1144 - 2) + " more options";
            }
            this.field1463.method193(var3, 16777215, true, 4, true, 15);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method483(int arg0, int arg1) {
        Component var3 = Component.field973[arg0];
        for (int var4 = 0; var4 < var3.field994.length && var3.field994[var4] != -1; ++var4) {
            Component var5 = Component.field973[var3.field994[var4]];
            if (var5.field980 == 1) {
                this.method483(var5.field978, 972);
            }
            var5.field976 = 0;
            var5.field977 = 0;
        }
        if (arg1 <= 0) {
            this.field1270 = this.field1178.method209();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZII)V")
    public final void method484(boolean arg0, int arg1, int arg2) {
        int var4 = 0;
        this.field1486 &= arg0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field1131[var5] != null) {
                int var6 = this.field1129[var5];
                int var7 = 70 - var4 * 14 + this.field1322 + 4;
                if (var7 < -20) {
                    break;
                }
                if (var6 == 0) {
                    ++var4;
                }
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1170 == 0 || this.field1170 == 1 && this.method444(this.field1130[var5], true))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !this.field1130[var5].equals(this.field1492.field366)) {
                        if (this.field1531) {
                            this.field1330[this.field1144] = "Report abuse @whi@" + this.field1130[var5];
                            this.field1293[this.field1144] = 316;
                            ++this.field1144;
                        }
                        this.field1330[this.field1144] = "Add ignore @whi@" + this.field1130[var5];
                        this.field1293[this.field1144] = 158;
                        ++this.field1144;
                        this.field1330[this.field1144] = "Add friend @whi@" + this.field1130[var5];
                        this.field1293[this.field1144] = 447;
                        ++this.field1144;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field1400 == 0 && (var6 == 7 || this.field1253 == 0 || this.field1253 == 1 && this.method444(this.field1130[var5], true))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.field1531) {
                            this.field1330[this.field1144] = "Report abuse @whi@" + this.field1130[var5];
                            this.field1293[this.field1144] = 316;
                            ++this.field1144;
                        }
                        this.field1330[this.field1144] = "Add ignore @whi@" + this.field1130[var5];
                        this.field1293[this.field1144] = 158;
                        ++this.field1144;
                        this.field1330[this.field1144] = "Add friend @whi@" + this.field1130[var5];
                        this.field1293[this.field1144] = 447;
                        ++this.field1144;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field1354 == 0 || this.field1354 == 1 && this.method444(this.field1130[var5], true))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field1330[this.field1144] = "Accept trade @whi@" + this.field1130[var5];
                        this.field1293[this.field1144] = 595;
                        ++this.field1144;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field1400 == 0 && this.field1253 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field1354 == 0 || this.field1354 == 1 && this.method444(this.field1130[var5], true))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field1330[this.field1144] = "Accept duel @whi@" + this.field1130[var5];
                        this.field1293[this.field1144] = 835;
                        ++this.field1144;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)Ljava/lang/String;")
    public final String method485(int arg0, int arg1) {
        if (arg1 != 21690) {
            this.field1447 = null;
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIIIIIIIIII)Z")
    public final boolean method486(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var36 = 0; var36 < var14; ++var36) {
                this.field1264[var15][var36] = 0;
                this.field1146[var15][var36] = 99999999;
            }
        }
        int var16 = 69 / arg6;
        int var17 = arg3;
        int var18 = arg5;
        this.field1264[arg3][arg5] = 99;
        this.field1146[arg3][arg5] = 0;
        byte var19 = 0;
        int var20 = 0;
        this.field1541[var19] = arg3;
        int var37 = var19 + 1;
        this.field1542[var19] = arg5;
        boolean var21 = false;
        int var22 = this.field1541.length;
        int[][] var23 = this.field1501[this.field1545].field942;
        while (var37 != var20) {
            var17 = this.field1541[var20];
            var18 = this.field1542[var20];
            var20 = (var20 + 1) % var22;
            if (arg9 == var17 && arg4 == var18) {
                var21 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && this.field1501[this.field1545].method304(arg4, arg9, var18, 928, arg8, var17, arg0 - 1)) {
                    var21 = true;
                    break;
                }
                if (arg0 < 10 && this.field1501[this.field1545].method305(arg9, var18, this.field1320, arg8, arg4, var17, arg0 - 1)) {
                    var21 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg10 != 0 && this.field1501[this.field1545].method306(var17, var18, arg4, 5, arg9, arg7, arg10, arg11)) {
                var21 = true;
                break;
            }
            int var35 = this.field1146[var17][var18] + 1;
            if (var17 > 0 && this.field1264[var17 - 1][var18] == 0 && (var23[var17 - 1][var18] & 2621704) == 0) {
                this.field1541[var37] = var17 - 1;
                this.field1542[var37] = var18;
                var37 = (var37 + 1) % var22;
                this.field1264[var17 - 1][var18] = 2;
                this.field1146[var17 - 1][var18] = var35;
            }
            if (var17 < var13 - 1 && this.field1264[var17 + 1][var18] == 0 && (var23[var17 + 1][var18] & 2621824) == 0) {
                this.field1541[var37] = var17 + 1;
                this.field1542[var37] = var18;
                var37 = (var37 + 1) % var22;
                this.field1264[var17 + 1][var18] = 8;
                this.field1146[var17 + 1][var18] = var35;
            }
            if (var18 > 0 && this.field1264[var17][var18 - 1] == 0 && (var23[var17][var18 - 1] & 2621698) == 0) {
                this.field1541[var37] = var17;
                this.field1542[var37] = var18 - 1;
                var37 = (var37 + 1) % var22;
                this.field1264[var17][var18 - 1] = 1;
                this.field1146[var17][var18 - 1] = var35;
            }
            if (var18 < var14 - 1 && this.field1264[var17][var18 + 1] == 0 && (var23[var17][var18 + 1] & 2621728) == 0) {
                this.field1541[var37] = var17;
                this.field1542[var37] = var18 + 1;
                var37 = (var37 + 1) % var22;
                this.field1264[var17][var18 + 1] = 4;
                this.field1146[var17][var18 + 1] = var35;
            }
            if (var17 > 0 && var18 > 0 && this.field1264[var17 - 1][var18 - 1] == 0 && (var23[var17 - 1][var18 - 1] & 2621710) == 0 && (var23[var17 - 1][var18] & 2621704) == 0 && (var23[var17][var18 - 1] & 2621698) == 0) {
                this.field1541[var37] = var17 - 1;
                this.field1542[var37] = var18 - 1;
                var37 = (var37 + 1) % var22;
                this.field1264[var17 - 1][var18 - 1] = 3;
                this.field1146[var17 - 1][var18 - 1] = var35;
            }
            if (var17 < var13 - 1 && var18 > 0 && this.field1264[var17 + 1][var18 - 1] == 0 && (var23[var17 + 1][var18 - 1] & 2621827) == 0 && (var23[var17 + 1][var18] & 2621824) == 0 && (var23[var17][var18 - 1] & 2621698) == 0) {
                this.field1541[var37] = var17 + 1;
                this.field1542[var37] = var18 - 1;
                var37 = (var37 + 1) % var22;
                this.field1264[var17 + 1][var18 - 1] = 9;
                this.field1146[var17 + 1][var18 - 1] = var35;
            }
            if (var17 > 0 && var18 < var14 - 1 && this.field1264[var17 - 1][var18 + 1] == 0 && (var23[var17 - 1][var18 + 1] & 2621752) == 0 && (var23[var17 - 1][var18] & 2621704) == 0 && (var23[var17][var18 + 1] & 2621728) == 0) {
                this.field1541[var37] = var17 - 1;
                this.field1542[var37] = var18 + 1;
                var37 = (var37 + 1) % var22;
                this.field1264[var17 - 1][var18 + 1] = 6;
                this.field1146[var17 - 1][var18 + 1] = var35;
            }
            if (var17 < var13 - 1 && var18 < var14 - 1 && this.field1264[var17 + 1][var18 + 1] == 0 && (var23[var17 + 1][var18 + 1] & 2621920) == 0 && (var23[var17 + 1][var18] & 2621824) == 0 && (var23[var17][var18 + 1] & 2621728) == 0) {
                this.field1541[var37] = var17 + 1;
                this.field1542[var37] = var18 + 1;
                var37 = (var37 + 1) % var22;
                this.field1264[var17 + 1][var18 + 1] = 12;
                this.field1146[var17 + 1][var18 + 1] = var35;
            }
        }
        this.field1112 = 0;
        if (!var21) {
            if (arg1) {
                int var24 = 100;
                for (int var25 = 1; var25 < 2; ++var25) {
                    for (int var26 = arg9 - var25; var26 <= arg9 + var25; ++var26) {
                        for (int var27 = arg4 - var25; var27 <= arg4 + var25; ++var27) {
                            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field1146[var26][var27] < var24) {
                                var24 = this.field1146[var26][var27];
                                var17 = var26;
                                var18 = var27;
                                this.field1112 = 1;
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
        this.field1541[var28] = var17;
        int var38 = var28 + 1;
        this.field1542[var28] = var18;
        int var29;
        int var30 = var29 = this.field1264[var17][var18];
        while (arg3 != var17 || arg5 != var18) {
            if (var29 != var30) {
                var29 = var30;
                this.field1541[var38] = var17;
                this.field1542[var38++] = var18;
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
            var30 = this.field1264[var17][var18];
        }
        if (var38 <= 0) {
            if (arg2 == 1) {
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
            int var32 = this.field1541[var38];
            int var33 = this.field1542[var38];
            field1200 += var31;
            if (field1200 >= 121) {
                this.field1195.method198(9, 215);
                this.field1195.method200(19217);
            }
            if (arg2 == 0) {
                this.field1195.method198(9, 74);
                this.field1195.method199(var31 + var31 + 3);
            }
            if (arg2 == 1) {
                this.field1195.method198(9, 37);
                this.field1195.method199(var31 + var31 + 3 + 14);
            }
            if (arg2 == 2) {
                this.field1195.method198(9, 73);
                this.field1195.method199(var31 + var31 + 3);
            }
            if (super.field24[5] == 1) {
                this.field1195.method199(1);
            } else {
                this.field1195.method199(0);
            }
            this.field1195.method200(this.field1448 + var32);
            this.field1195.method200(this.field1449 + var33);
            this.field1421 = this.field1541[0];
            this.field1422 = this.field1542[0];
            for (int var34 = 1; var34 < var31; ++var34) {
                --var38;
                this.field1195.method199(this.field1541[var38] - var32);
                this.field1195.method199(this.field1542[var38] - var33);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)V")
    public final void method487(int arg0, int arg1) {
        int var3 = VarpType.field1078[arg1].field1086;
        if (var3 != 0) {
            int var4 = this.field1196[arg1];
            if (arg0 != 0) {
                this.method6();
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    Pix3D.method162(0.9D, -72);
                }
                if (var4 == 2) {
                    Pix3D.method162(0.8D, -72);
                }
                if (var4 == 3) {
                    Pix3D.method162(0.7D, -72);
                }
                if (var4 == 4) {
                    Pix3D.method162(0.6D, -72);
                }
                ObjType.field929.method104();
                this.field1485 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field1351;
                if (var4 == 0) {
                    this.method372((byte) 6, 0, this.field1351);
                    this.field1351 = true;
                }
                if (var4 == 1) {
                    this.method372((byte) 6, -400, this.field1351);
                    this.field1351 = true;
                }
                if (var4 == 2) {
                    this.method372((byte) 6, -800, this.field1351);
                    this.field1351 = true;
                }
                if (var4 == 3) {
                    this.method372((byte) 6, -1200, this.field1351);
                    this.field1351 = true;
                }
                if (var4 == 4) {
                    this.field1351 = false;
                }
                if (this.field1351 != var5) {
                    if (this.field1351) {
                        this.method459(this.field1284, this.field1521, 43166, this.field1424);
                    } else {
                        this.method470((byte) -57);
                    }
                    this.field1363 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field1394 = true;
                    this.method407(0, (byte) -79);
                }
                if (var4 == 1) {
                    this.field1394 = true;
                    this.method407(-400, (byte) -79);
                }
                if (var4 == 2) {
                    this.field1394 = true;
                    this.method407(-800, (byte) -79);
                }
                if (var4 == 3) {
                    this.field1394 = true;
                    this.method407(-1200, (byte) -79);
                }
                if (var4 == 4) {
                    this.field1394 = false;
                }
            }
            if (var3 == 5) {
                this.field1299 = var4;
            }
            if (var3 == 6) {
                this.field1143 = var4;
            }
            if (var3 == 8) {
                this.field1400 = var4;
                this.field1161 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method488(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            this.field1195.method199(163);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method5(9);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field1290 != -1 && this.field1329 == this.field1290) {
                        if (var2 == 8 && this.field1441.length() > 0) {
                            this.field1441 = this.field1441.substring(0, this.field1441.length() - 1);
                        }
                        break;
                    }
                    if (this.field1398) {
                        if (var2 >= 32 && var2 <= 122 && this.field1364.length() < 80) {
                            this.field1364 = this.field1364 + (char) var2;
                            this.field1161 = true;
                        }
                        if (var2 == 8 && this.field1364.length() > 0) {
                            this.field1364 = this.field1364.substring(0, this.field1364.length() - 1);
                            this.field1161 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field1398 = false;
                            this.field1161 = true;
                            if (this.field1123 == 1) {
                                long var3 = JString.method251(this.field1364);
                                this.method412(-980, var3);
                            }
                            if (this.field1123 == 2 && this.field1395 > 0) {
                                long var5 = JString.method251(this.field1364);
                                this.method417(0, var5);
                            }
                            if (this.field1123 == 3 && this.field1364.length() > 0) {
                                this.field1195.method198(9, 6);
                                this.field1195.method199(0);
                                int var7 = this.field1195.field623;
                                this.field1195.method205(this.field1453, true);
                                WordPack.method259(4, this.field1195, this.field1364);
                                this.field1195.method208(this.field1195.field623 - var7, 9026);
                                this.field1364 = JString.method256(this.field1364, (byte) 99);
                                this.field1364 = WordFilter.method335(this.field1364, true);
                                this.method382(6, 0, JString.method255(JString.method252(this.field1453, (byte) -74), true), this.field1364);
                                if (this.field1253 == 2) {
                                    this.field1253 = 1;
                                    this.field1297 = true;
                                    this.field1195.method198(9, 197);
                                    this.field1195.method199(this.field1170);
                                    this.field1195.method199(this.field1253);
                                    this.field1195.method199(this.field1354);
                                }
                            }
                            if (this.field1123 == 4 && this.field1258 < 100) {
                                long var8 = JString.method251(this.field1364);
                                this.method456(0, var8);
                            }
                            if (this.field1123 == 5 && this.field1258 > 0) {
                                long var10 = JString.method251(this.field1364);
                                this.method461(var10, this.field1452);
                            }
                        }
                    } else if (this.field1213) {
                        if (var2 >= 48 && var2 <= 57 && this.field1267.length() < 10) {
                            this.field1267 = this.field1267 + (char) var2;
                            this.field1161 = true;
                        }
                        if (var2 == 8 && this.field1267.length() > 0) {
                            this.field1267 = this.field1267.substring(0, this.field1267.length() - 1);
                            this.field1161 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field1267.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field1267);
                                } catch (Exception var16) {
                                }
                                this.field1195.method198(9, 147);
                                this.field1195.method203(var12);
                            }
                            this.field1213 = false;
                            this.field1161 = true;
                        }
                    } else if (this.field1455 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field1189.length() < 80) {
                            this.field1189 = this.field1189 + (char) var2;
                            this.field1161 = true;
                        }
                        if (var2 == 8 && this.field1189.length() > 0) {
                            this.field1189 = this.field1189.substring(0, this.field1189.length() - 1);
                            this.field1161 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field1189.length() > 0) {
                            if (this.field1189.equals("::clientdrop") && (super.field15 != null || this.method445((byte) 7).indexOf("192.168.1.") != -1)) {
                                this.method410(366);
                            } else if (this.field1189.startsWith("::")) {
                                this.field1195.method198(9, 251);
                                this.field1195.method199(this.field1189.length() - 1);
                                this.field1195.method206(this.field1189.substring(2));
                            } else {
                                byte var13 = 0;
                                if (this.field1189.startsWith("yellow:")) {
                                    var13 = 0;
                                    this.field1189 = this.field1189.substring(7);
                                }
                                if (this.field1189.startsWith("red:")) {
                                    var13 = 1;
                                    this.field1189 = this.field1189.substring(4);
                                }
                                if (this.field1189.startsWith("green:")) {
                                    var13 = 2;
                                    this.field1189 = this.field1189.substring(6);
                                }
                                if (this.field1189.startsWith("cyan:")) {
                                    var13 = 3;
                                    this.field1189 = this.field1189.substring(5);
                                }
                                if (this.field1189.startsWith("purple:")) {
                                    var13 = 4;
                                    this.field1189 = this.field1189.substring(7);
                                }
                                if (this.field1189.startsWith("white:")) {
                                    var13 = 5;
                                    this.field1189 = this.field1189.substring(6);
                                }
                                if (this.field1189.startsWith("flash1:")) {
                                    var13 = 6;
                                    this.field1189 = this.field1189.substring(7);
                                }
                                if (this.field1189.startsWith("flash2:")) {
                                    var13 = 7;
                                    this.field1189 = this.field1189.substring(7);
                                }
                                if (this.field1189.startsWith("flash3:")) {
                                    var13 = 8;
                                    this.field1189 = this.field1189.substring(7);
                                }
                                if (this.field1189.startsWith("glow1:")) {
                                    var13 = 9;
                                    this.field1189 = this.field1189.substring(6);
                                }
                                if (this.field1189.startsWith("glow2:")) {
                                    var13 = 10;
                                    this.field1189 = this.field1189.substring(6);
                                }
                                if (this.field1189.startsWith("glow3:")) {
                                    var13 = 11;
                                    this.field1189 = this.field1189.substring(6);
                                }
                                byte var14 = 0;
                                if (this.field1189.startsWith("wave:")) {
                                    var14 = 1;
                                    this.field1189 = this.field1189.substring(5);
                                }
                                if (this.field1189.startsWith("scroll:")) {
                                    var14 = 2;
                                    this.field1189 = this.field1189.substring(7);
                                }
                                this.field1195.method198(9, 42);
                                this.field1195.method199(0);
                                int var15 = this.field1195.field623;
                                this.field1195.method199(var13);
                                this.field1195.method199(var14);
                                WordPack.method259(4, this.field1195, this.field1189);
                                this.field1195.method208(this.field1195.field623 - var15, 9026);
                                this.field1189 = JString.method256(this.field1189, (byte) 99);
                                this.field1189 = WordFilter.method335(this.field1189, true);
                                this.field1492.field318 = this.field1189;
                                this.field1492.field320 = var13;
                                this.field1492.field321 = var14;
                                this.field1492.field319 = 150;
                                this.method382(2, 0, this.field1492.field366, this.field1492.field318);
                                if (this.field1170 == 2) {
                                    this.field1170 = 3;
                                    this.field1297 = true;
                                    this.field1195.method198(9, 197);
                                    this.field1195.method199(this.field1170);
                                    this.field1195.method199(this.field1253);
                                    this.field1195.method199(this.field1354);
                                }
                            }
                            this.field1189 = "";
                            this.field1161 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field1441.length() < 12) {
                this.field1441 = this.field1441 + (char) var2;
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field1482[var1] = var0 / 4;
        }
        field1534 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    }
}
