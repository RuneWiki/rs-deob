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

    @OriginalMember(owner = "client", name = "F", descriptor = "Ljava/lang/String;")
    private String field1079 = "";

    @OriginalMember(owner = "client", name = "G", descriptor = "Ljava/lang/String;")
    private String field1080 = "";

    @OriginalMember(owner = "client", name = "H", descriptor = "[I")
    private int[] field1081 = new int[5];

    @OriginalMember(owner = "client", name = "J", descriptor = "[Lib;")
    private Pix8[] field1083 = new Pix8[50];

    @OriginalMember(owner = "client", name = "N", descriptor = "Z")
    private boolean field1087 = false;

    @OriginalMember(owner = "client", name = "U", descriptor = "Z")
    private boolean field1094 = false;

    @OriginalMember(owner = "client", name = "fb", descriptor = "[I")
    private int[] field1105 = new int[50];

    @OriginalMember(owner = "client", name = "ib", descriptor = "Lhc;")
    private Component field1108 = new Component();

    @OriginalMember(owner = "client", name = "kb", descriptor = "[I")
    private int[] field1110 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "lb", descriptor = "B")
    private byte field1111 = 31;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field1112 = -1;

    @OriginalMember(owner = "client", name = "nb", descriptor = "Z")
    private boolean field1113 = false;

    @OriginalMember(owner = "client", name = "pb", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1115 = new CRC32();

    @OriginalMember(owner = "client", name = "wb", descriptor = "Z")
    private boolean field1122 = false;

    @OriginalMember(owner = "client", name = "xb", descriptor = "Z")
    private boolean field1123 = true;

    @OriginalMember(owner = "client", name = "yb", descriptor = "[Lib;")
    private Pix8[] field1124 = new Pix8[13];

    @OriginalMember(owner = "client", name = "Ab", descriptor = "Ljava/lang/String;")
    private String field1126 = "";

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field1131 = 50;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "[I")
    private int[] field1132 = new int[this.field1131];

    @OriginalMember(owner = "client", name = "Hb", descriptor = "[I")
    private int[] field1133 = new int[this.field1131];

    @OriginalMember(owner = "client", name = "Ib", descriptor = "[I")
    private int[] field1134 = new int[this.field1131];

    @OriginalMember(owner = "client", name = "Jb", descriptor = "[I")
    private int[] field1135 = new int[this.field1131];

    @OriginalMember(owner = "client", name = "Kb", descriptor = "[I")
    private int[] field1136 = new int[this.field1131];

    @OriginalMember(owner = "client", name = "Lb", descriptor = "[I")
    private int[] field1137 = new int[this.field1131];

    @OriginalMember(owner = "client", name = "Mb", descriptor = "[I")
    private int[] field1138 = new int[this.field1131];

    @OriginalMember(owner = "client", name = "Nb", descriptor = "[Ljava/lang/String;")
    private String[] field1139 = new String[this.field1131];

    @OriginalMember(owner = "client", name = "Xb", descriptor = "Lob;")
    private LinkList field1149 = new LinkList((byte) 30);

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field1150 = -1;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field1152 = 1;

    @OriginalMember(owner = "client", name = "kc", descriptor = "Z")
    private boolean field1162 = true;

    @OriginalMember(owner = "client", name = "nc", descriptor = "Z")
    private boolean field1165 = false;

    @OriginalMember(owner = "client", name = "oc", descriptor = "[I")
    private int[] field1166 = new int[2000];

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field1168 = -142;

    @OriginalMember(owner = "client", name = "rc", descriptor = "Z")
    private boolean field1169 = false;

    @OriginalMember(owner = "client", name = "sc", descriptor = "[I")
    private int[] field1170 = new int[5];

    @OriginalMember(owner = "client", name = "tc", descriptor = "Z")
    private boolean field1171 = false;

    @OriginalMember(owner = "client", name = "uc", descriptor = "[I")
    private final int[] field1172 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "zc", descriptor = "[I")
    private int[] field1177 = new int[151];

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field1182 = -1;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "Ljava/lang/String;")
    private String field1183 = "";

    @OriginalMember(owner = "client", name = "Sc", descriptor = "[Ljava/lang/String;")
    private String[] field1196 = new String[500];

    @OriginalMember(owner = "client", name = "Uc", descriptor = "[I")
    private int[] field1198 = new int[5];

    @OriginalMember(owner = "client", name = "Wc", descriptor = "Z")
    private boolean field1200 = false;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "Z")
    private boolean field1201 = false;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private int field1202 = 78;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "Z")
    private boolean field1203 = false;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field1205 = 1;

    @OriginalMember(owner = "client", name = "cd", descriptor = "[Ljava/lang/String;")
    private String[] field1206 = new String[100];

    @OriginalMember(owner = "client", name = "dd", descriptor = "Lob;")
    private LinkList field1207 = new LinkList((byte) 30);

    @OriginalMember(owner = "client", name = "ed", descriptor = "[Lhb;")
    private Pix32[] field1208 = new Pix32[8];

    @OriginalMember(owner = "client", name = "fd", descriptor = "[I")
    private int[] field1209 = new int[256];

    @OriginalMember(owner = "client", name = "hd", descriptor = "[B")
    private byte[] field1211 = new byte[16384];

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field1215 = 732;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field1218 = -1;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field1219 = -1;

    @OriginalMember(owner = "client", name = "td", descriptor = "[I")
    private int[] field1223 = new int[50];

    @OriginalMember(owner = "client", name = "ud", descriptor = "Z")
    private boolean field1224 = false;

    @OriginalMember(owner = "client", name = "wd", descriptor = "[I")
    private int[] field1226 = new int[50];

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private final int field1227 = 100;

    @OriginalMember(owner = "client", name = "yd", descriptor = "[I")
    private int[] field1228 = new int[100];

    @OriginalMember(owner = "client", name = "Ad", descriptor = "Z")
    private boolean field1230 = false;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "Ljava/lang/String;")
    private String field1236 = "";

    @OriginalMember(owner = "client", name = "Hd", descriptor = "Ljava/lang/String;")
    private String field1237 = "";

    @OriginalMember(owner = "client", name = "Id", descriptor = "Z")
    private boolean field1238 = false;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field1241 = 3;

    @OriginalMember(owner = "client", name = "Md", descriptor = "Z")
    private boolean field1242 = false;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "Ljava/lang/String;")
    private String field1243 = "";

    @OriginalMember(owner = "client", name = "Qd", descriptor = "Z")
    private boolean field1246 = true;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private int field1247 = 9;

    @OriginalMember(owner = "client", name = "Td", descriptor = "[J")
    private long[] field1249 = new long[100];

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    private int field1252 = 2301979;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field1258 = 3353893;

    @OriginalMember(owner = "client", name = "ke", descriptor = "Z")
    private boolean field1266 = false;

    @OriginalMember(owner = "client", name = "le", descriptor = "[I")
    private int[] field1267 = new int[100];

    @OriginalMember(owner = "client", name = "me", descriptor = "[Ljava/lang/String;")
    private String[] field1268 = new String[100];

    @OriginalMember(owner = "client", name = "ne", descriptor = "[Ljava/lang/String;")
    private String[] field1269 = new String[100];

    @OriginalMember(owner = "client", name = "ve", descriptor = "Ljava/lang/String;")
    private String field1277 = "";

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1282 = -1;

    @OriginalMember(owner = "client", name = "Be", descriptor = "[Ly;")
    private NpcEntity[] field1283 = new NpcEntity[8192];

    @OriginalMember(owner = "client", name = "De", descriptor = "[I")
    public int[] field1285 = new int[8192];

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field1288 = -25272;

    @OriginalMember(owner = "client", name = "He", descriptor = "[Lhb;")
    private Pix32[] field1289 = new Pix32[50];

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field1290 = 63;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "Z")
    private boolean field1296 = true;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "[I")
    public int[] field1298 = new int[1000];

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field1304 = 7759444;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "[I")
    private int[] field1305 = new int[2000];

    @OriginalMember(owner = "client", name = "Ye", descriptor = "[Lhb;")
    private Pix32[] field1306 = new Pix32[20];

    @OriginalMember(owner = "client", name = "af", descriptor = "B")
    private byte field1308 = 7;

    @OriginalMember(owner = "client", name = "hf", descriptor = "Z")
    private boolean field1315 = false;

    @OriginalMember(owner = "client", name = "jf", descriptor = "B")
    private byte field1316 = 80;

    @OriginalMember(owner = "client", name = "lf", descriptor = "Z")
    private boolean field1318 = true;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private int field1321 = 2;

    @OriginalMember(owner = "client", name = "rf", descriptor = "B")
    private byte field1324 = 112;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field1329 = 128;

    @OriginalMember(owner = "client", name = "Af", descriptor = "Z")
    private boolean field1333 = false;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "[I")
    private int[] field1334 = new int[50];

    @OriginalMember(owner = "client", name = "Df", descriptor = "B")
    private byte field1336 = 6;

    @OriginalMember(owner = "client", name = "If", descriptor = "Z")
    private boolean field1341 = false;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field1347 = -1;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "[J")
    private long[] field1355 = new long[100];

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field1358 = -1;

    @OriginalMember(owner = "client", name = "cg", descriptor = "Lob;")
    private LinkList field1361 = new LinkList((byte) 30);

    @OriginalMember(owner = "client", name = "dg", descriptor = "Lkb;")
    private Packet field1362 = Packet.method203(3, 1);

    @OriginalMember(owner = "client", name = "fg", descriptor = "Z")
    private boolean field1364 = false;

    @OriginalMember(owner = "client", name = "gg", descriptor = "Z")
    private boolean field1365 = false;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field1366 = 2048;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field1367 = 2047;

    @OriginalMember(owner = "client", name = "jg", descriptor = "[Lz;")
    private PlayerEntity[] field1368 = new PlayerEntity[this.field1366];

    @OriginalMember(owner = "client", name = "lg", descriptor = "[I")
    public int[] field1370 = new int[this.field1366];

    @OriginalMember(owner = "client", name = "ng", descriptor = "[I")
    private int[] field1372 = new int[this.field1366];

    @OriginalMember(owner = "client", name = "og", descriptor = "[Lkb;")
    private Packet[] field1373 = new Packet[this.field1366];

    @OriginalMember(owner = "client", name = "pg", descriptor = "[[I")
    private int[][] field1374 = new int[104][104];

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field1376 = 2;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "[I")
    private int[] field1387 = new int[4000];

    @OriginalMember(owner = "client", name = "Dg", descriptor = "[I")
    private int[] field1388 = new int[4000];

    @OriginalMember(owner = "client", name = "Fg", descriptor = "[I")
    private int[] field1390 = new int[9];

    @OriginalMember(owner = "client", name = "Ig", descriptor = "Z")
    private boolean field1393 = true;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "[I")
    private int[] field1396 = new int[50];

    @OriginalMember(owner = "client", name = "Mg", descriptor = "[Lhb;")
    private Pix32[] field1397 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "Vg", descriptor = "Z")
    private boolean field1406 = false;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "[I")
    private int[] field1407 = new int[50];

    @OriginalMember(owner = "client", name = "bh", descriptor = "[I")
    private int[] field1412 = new int[100];

    @OriginalMember(owner = "client", name = "ch", descriptor = "[I")
    private int[] field1413 = new int[5];

    @OriginalMember(owner = "client", name = "fh", descriptor = "[I")
    private int[] field1416 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "gh", descriptor = "[I")
    private int[] field1417 = new int[5];

    @OriginalMember(owner = "client", name = "hh", descriptor = "[[[Lob;")
    private LinkList[][][] field1418 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "ih", descriptor = "B")
    private byte field1419 = 25;

    @OriginalMember(owner = "client", name = "jh", descriptor = "[I")
    private int[] field1420 = new int[33];

    @OriginalMember(owner = "client", name = "lh", descriptor = "Z")
    private boolean field1422 = true;

    @OriginalMember(owner = "client", name = "nh", descriptor = "B")
    private byte field1424 = 5;

    @OriginalMember(owner = "client", name = "oh", descriptor = "Lkb;")
    private Packet field1425 = Packet.method203(3, 1);

    @OriginalMember(owner = "client", name = "ph", descriptor = "B")
    private byte field1426 = 6;

    @OriginalMember(owner = "client", name = "qh", descriptor = "I")
    private int field1427 = 24924;

    @OriginalMember(owner = "client", name = "rh", descriptor = "[I")
    private int[] field1428 = new int[7];

    @OriginalMember(owner = "client", name = "th", descriptor = "Z")
    private boolean field1430 = true;

    @OriginalMember(owner = "client", name = "uh", descriptor = "[[I")
    private int[][] field1431 = new int[104][104];

    @OriginalMember(owner = "client", name = "vh", descriptor = "Lkb;")
    private Packet field1432 = Packet.method203(3, 1);

    @OriginalMember(owner = "client", name = "wh", descriptor = "Z")
    private boolean field1433 = false;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field1436 = 2;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "Z")
    private boolean field1439 = false;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "[Lhb;")
    private Pix32[] field1442 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Hh", descriptor = "[I")
    private int[] field1444 = new int[500];

    @OriginalMember(owner = "client", name = "Ih", descriptor = "[I")
    private int[] field1445 = new int[500];

    @OriginalMember(owner = "client", name = "Jh", descriptor = "[I")
    private int[] field1446 = new int[500];

    @OriginalMember(owner = "client", name = "Kh", descriptor = "[I")
    private int[] field1447 = new int[500];

    @OriginalMember(owner = "client", name = "Lh", descriptor = "Ljava/lang/Object;")
    private Object field1448 = new Object();

    @OriginalMember(owner = "client", name = "Mh", descriptor = "B")
    private byte field1449 = 62;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field1450 = -1;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "Z")
    private boolean field1454 = false;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private int field1455 = -1;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Ljava/lang/String;")
    private String field1458 = "";

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Z")
    private boolean field1459 = false;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field1462 = -1;

    @OriginalMember(owner = "client", name = "bi", descriptor = "[Z")
    private boolean[] field1464 = new boolean[5];

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private int field1465 = -1910;

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private int field1471 = -1;

    @OriginalMember(owner = "client", name = "ji", descriptor = "[[I")
    private int[][] field1472 = new int[104][104];

    @OriginalMember(owner = "client", name = "li", descriptor = "[I")
    private int[] field1474 = new int[1000];

    @OriginalMember(owner = "client", name = "mi", descriptor = "[I")
    private int[] field1475 = new int[1000];

    @OriginalMember(owner = "client", name = "ni", descriptor = "Z")
    private boolean field1476 = false;

    @OriginalMember(owner = "client", name = "oi", descriptor = "[I")
    private int[] field1477 = new int[151];

    @OriginalMember(owner = "client", name = "si", descriptor = "Z")
    private boolean field1481 = true;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "B")
    private byte field1496 = 96;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "Z")
    private boolean field1497 = false;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field1498 = 222;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "[Lec;")
    private CollisionMap[] field1499 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "Li", descriptor = "I")
    private int field1500 = 9;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "[I")
    private int[] field1501 = new int[33];

    @OriginalMember(owner = "client", name = "Ni", descriptor = "Lob;")
    private LinkList field1502 = new LinkList((byte) 30);

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field1505 = 5063219;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "Lob;")
    private LinkList field1510 = new LinkList((byte) 30);

    @OriginalMember(owner = "client", name = "Yi", descriptor = "Z")
    private boolean field1513 = false;

    @OriginalMember(owner = "client", name = "O", descriptor = "B")
    private static byte field1088 = 7;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "[[I")
    public static final int[][] field1184 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "Hc", descriptor = "[I")
    private static int[] field1185 = new int[99];

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private static int field1213;

    @OriginalMember(owner = "client", name = "de", descriptor = "B")
    private static byte field1259;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private static int field1262;

    @OriginalMember(owner = "client", name = "ie", descriptor = "Z")
    private static boolean field1264;

    @OriginalMember(owner = "client", name = "bf", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1309;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private static int field1349;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "Ljava/lang/String;")
    private static String field1351;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1394;

    @OriginalMember(owner = "client", name = "ti", descriptor = "[I")
    public static final int[] field1482;

    @OriginalMember(owner = "client", name = "I", descriptor = "I")
    private int field1082;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field1084;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field1085;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field1086;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field1089;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field1092;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field1093;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field1106;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field1107;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private static int field1109;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field1116;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field1118;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field1119;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field1120;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field1125;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private static int field1127;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field1128;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field1129;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field1130;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field1141;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field1142;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field1143;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field1144;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field1145;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field1146;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field1147;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field1151;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field1153;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field1154;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1155;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field1156;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field1157;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field1159;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field1160;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field1161;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field1164;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field1167;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field1173;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field1174;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field1175;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field1176;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    private static int field1186;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private static int field1187;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field1188;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private static int field1189;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private int field1190;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field1191;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field1192;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field1193;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field1194;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field1195;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field1197;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field1199;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field1204;

    @OriginalMember(owner = "client", name = "id", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field1221;

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field1222;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private int field1225;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field1229;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field1232;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field1235;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private static int field1239;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private int field1240;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field1248;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private int field1255;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field1257;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private static int field1260;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field1261;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private static int field1263;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private static int field1271;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private static int field1276;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field1300;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field1301;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field1303;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field1307;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private static int field1311;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field1312;

    @OriginalMember(owner = "client", name = "mf", descriptor = "I")
    private int field1319;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field1323;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "I")
    private static int field1337;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field1352;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field1353;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private int field1359;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field1360;

    @OriginalMember(owner = "client", name = "kg", descriptor = "I")
    private int field1369;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private int field1371;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field1377;

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private int field1378;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private static int field1389;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field1391;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    private int field1398;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field1399;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private static int field1403;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private static int field1405;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client", name = "ah", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field1429;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field1434;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private static int field1440;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client", name = "Th", descriptor = "I")
    private int field1456;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field1468;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client", name = "hi", descriptor = "I")
    private int field1470;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field1478;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field1504;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field1509;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private static int field1514;

    @OriginalMember(owner = "client", name = "ob", descriptor = "J")
    private long field1114;

    @OriginalMember(owner = "client", name = "md", descriptor = "J")
    private long field1216;

    @OriginalMember(owner = "client", name = "kf", descriptor = "J")
    private long field1317;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "Ld;")
    private ClientStream field1437;

    @OriginalMember(owner = "client", name = "eg", descriptor = "Ltb;")
    private Isaac field1363;

    @OriginalMember(owner = "client", name = "rb", descriptor = "Lub;")
    private Jagfile field1117;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "Lhb;")
    private Pix32 field1178;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "Lhb;")
    private Pix32 field1179;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "Lhb;")
    private Pix32 field1180;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "Lhb;")
    private Pix32 field1181;

    @OriginalMember(owner = "client", name = "nd", descriptor = "Lhb;")
    private Pix32 field1217;

    @OriginalMember(owner = "client", name = "Od", descriptor = "Lhb;")
    private Pix32 field1244;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "Lhb;")
    private Pix32 field1245;

    @OriginalMember(owner = "client", name = "cf", descriptor = "Lhb;")
    private Pix32 field1310;

    @OriginalMember(owner = "client", name = "ri", descriptor = "Lhb;")
    private Pix32 field1480;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "Lhb;")
    private Pix32 field1511;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "Lhb;")
    private Pix32 field1512;

    @OriginalMember(owner = "client", name = "Je", descriptor = "Lib;")
    private Pix8 field1291;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "Lib;")
    private Pix8 field1292;

    @OriginalMember(owner = "client", name = "Le", descriptor = "Lib;")
    private Pix8 field1293;

    @OriginalMember(owner = "client", name = "Me", descriptor = "Lib;")
    private Pix8 field1294;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "Lib;")
    private Pix8 field1295;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "Lib;")
    private Pix8 field1338;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "Lib;")
    private Pix8 field1339;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "Lib;")
    private Pix8 field1340;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "Lib;")
    private Pix8 field1342;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "Lib;")
    private Pix8 field1343;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "Lib;")
    private Pix8 field1344;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "Lib;")
    private Pix8 field1345;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "Lib;")
    private Pix8 field1346;

    @OriginalMember(owner = "client", name = "ug", descriptor = "Lib;")
    private Pix8 field1379;

    @OriginalMember(owner = "client", name = "vg", descriptor = "Lib;")
    private Pix8 field1380;

    @OriginalMember(owner = "client", name = "wg", descriptor = "Lib;")
    private Pix8 field1381;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "Lib;")
    private Pix8 field1451;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "Lib;")
    private Pix8 field1452;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "Lib;")
    private Pix8 field1460;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "Lib;")
    private Pix8 field1461;

    @OriginalMember(owner = "client", name = "qe", descriptor = "Ljb;")
    private PixFont field1272;

    @OriginalMember(owner = "client", name = "re", descriptor = "Ljb;")
    private PixFont field1273;

    @OriginalMember(owner = "client", name = "se", descriptor = "Ljb;")
    private PixFont field1274;

    @OriginalMember(owner = "client", name = "te", descriptor = "Ljb;")
    private PixFont field1275;

    @OriginalMember(owner = "client", name = "V", descriptor = "Lqb;")
    private PixMap field1095;

    @OriginalMember(owner = "client", name = "W", descriptor = "Lqb;")
    private PixMap field1096;

    @OriginalMember(owner = "client", name = "X", descriptor = "Lqb;")
    private PixMap field1097;

    @OriginalMember(owner = "client", name = "Y", descriptor = "Lqb;")
    private PixMap field1098;

    @OriginalMember(owner = "client", name = "Z", descriptor = "Lqb;")
    private PixMap field1099;

    @OriginalMember(owner = "client", name = "ab", descriptor = "Lqb;")
    private PixMap field1100;

    @OriginalMember(owner = "client", name = "bb", descriptor = "Lqb;")
    private PixMap field1101;

    @OriginalMember(owner = "client", name = "cb", descriptor = "Lqb;")
    private PixMap field1102;

    @OriginalMember(owner = "client", name = "db", descriptor = "Lqb;")
    private PixMap field1103;

    @OriginalMember(owner = "client", name = "eb", descriptor = "Lqb;")
    private PixMap field1104;

    @OriginalMember(owner = "client", name = "xe", descriptor = "Lqb;")
    private PixMap field1279;

    @OriginalMember(owner = "client", name = "ye", descriptor = "Lqb;")
    private PixMap field1280;

    @OriginalMember(owner = "client", name = "ze", descriptor = "Lqb;")
    private PixMap field1281;

    @OriginalMember(owner = "client", name = "yg", descriptor = "Lqb;")
    private PixMap field1383;

    @OriginalMember(owner = "client", name = "zg", descriptor = "Lqb;")
    private PixMap field1384;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "Lqb;")
    private PixMap field1385;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "Lqb;")
    private PixMap field1386;

    @OriginalMember(owner = "client", name = "ui", descriptor = "Lqb;")
    private PixMap field1483;

    @OriginalMember(owner = "client", name = "vi", descriptor = "Lqb;")
    private PixMap field1484;

    @OriginalMember(owner = "client", name = "wi", descriptor = "Lqb;")
    private PixMap field1485;

    @OriginalMember(owner = "client", name = "xi", descriptor = "Lqb;")
    private PixMap field1486;

    @OriginalMember(owner = "client", name = "yi", descriptor = "Lqb;")
    private PixMap field1487;

    @OriginalMember(owner = "client", name = "zi", descriptor = "Lqb;")
    private PixMap field1488;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "Lqb;")
    private PixMap field1489;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "Lqb;")
    private PixMap field1490;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "Lqb;")
    private PixMap field1491;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "Lz;")
    private PlayerEntity field1453;

    @OriginalMember(owner = "client", name = "pf", descriptor = "Lr;")
    private World3D field1322;

    @OriginalMember(owner = "client", name = "vb", descriptor = "Ljava/lang/String;")
    public String field1121;

    @OriginalMember(owner = "client", name = "lc", descriptor = "Ljava/lang/String;")
    private String field1163;

    @OriginalMember(owner = "client", name = "ff", descriptor = "Ljava/lang/String;")
    private String field1313;

    @OriginalMember(owner = "client", name = "gf", descriptor = "Ljava/lang/String;")
    private String field1314;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "Ljava/lang/String;")
    public String field1402;

    @OriginalMember(owner = "client", name = "je", descriptor = "Z")
    private static boolean field1265;

    @OriginalMember(owner = "client", name = "ai", descriptor = "Z")
    private static boolean field1463;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "Z")
    private static boolean field1503;

    @OriginalMember(owner = "client", name = "gd", descriptor = "[I")
    private int[] field1210;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "[I")
    private int[] field1250;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "[I")
    private int[] field1251;

    @OriginalMember(owner = "client", name = "sf", descriptor = "[I")
    private int[] field1325;

    @OriginalMember(owner = "client", name = "tf", descriptor = "[I")
    private int[] field1326;

    @OriginalMember(owner = "client", name = "uf", descriptor = "[I")
    private int[] field1327;

    @OriginalMember(owner = "client", name = "vf", descriptor = "[I")
    private int[] field1328;

    @OriginalMember(owner = "client", name = "dh", descriptor = "[I")
    private int[] field1414;

    @OriginalMember(owner = "client", name = "eh", descriptor = "[I")
    private int[] field1415;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "[I")
    private int[] field1506;

    @OriginalMember(owner = "client", name = "Si", descriptor = "[I")
    private int[] field1507;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "[I")
    private int[] field1508;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "[Lib;")
    private Pix8[] field1441;

    @OriginalMember(owner = "client", name = "oe", descriptor = "[[B")
    private byte[][] field1270;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "[[B")
    private byte[][] field1357;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "[[[B")
    private byte[][][] field1350;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "[[[I")
    private int[][][] field1140;

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILhc;II)V")
    public final void method371(int arg0, int arg1, Component arg2, int arg3, int arg4) {
        if (arg2.field958 == 0 && arg2.field972 != null) {
            if (!arg2.field971 || this.field1220 == arg2.field956 || this.field1377 == arg2.field956 || this.field1434 == arg2.field956) {
                int var6 = Pix2D.field549;
                int var7 = Pix2D.field547;
                int var8 = Pix2D.field550;
                int var9 = Pix2D.field548;
                Pix2D.method148(arg1, arg2.field961 + arg1, arg2.field962 + arg3, 770, arg3);
                int var10 = arg2.field972.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg2.field973[var11] + arg1;
                    int var13 = arg2.field974[var11] + arg3 - arg0;
                    Component var14 = Component.field951[arg2.field972[var11]];
                    int var15 = var14.field963 + var12;
                    int var16 = var14.field964 + var13;
                    if (var14.field960 > 0) {
                        this.method426(var14, 14658);
                    }
                    if (var14.field958 == 0) {
                        if (var14.field970 > var14.field969 - var14.field962) {
                            var14.field970 = var14.field969 - var14.field962;
                        }
                        if (var14.field970 < 0) {
                            var14.field970 = 0;
                        }
                        this.method371(var14.field970, var15, var14, var16, 0);
                        if (var14.field969 > var14.field962) {
                            this.method403(-92, var14.field969, var16, var14.field962, var14.field970, var14.field961 + var15);
                        }
                    } else if (var14.field958 != 1) {
                        if (var14.field958 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field962; ++var18) {
                                for (int var19 = 0; var19 < var14.field961; ++var19) {
                                    int var20 = (var14.field980 + 32) * var19 + var15;
                                    int var21 = (var14.field981 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field983[var17];
                                        var21 += var14.field984[var17];
                                    }
                                    if (var14.field952[var17] <= 0) {
                                        if (var14.field982 != null && var17 < 20) {
                                            Pix32 var27 = var14.field982[var17];
                                            if (var27 != null) {
                                                var27.method175(var21, -462, var20);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field952[var17] - 1;
                                        if (var20 >= -32 && var20 <= 512 && var21 >= -32 && var21 <= 334 || this.field1146 != 0 && this.field1145 == var17) {
                                            Pix32 var25 = ObjType.method299(var24, false, var14.field953[var17]);
                                            if (this.field1146 != 0 && this.field1145 == var17 && this.field1144 == var14.field956) {
                                                var22 = super.field22 - this.field1147;
                                                var23 = super.field23 - this.field1148;
                                                if (var22 < 5 && var22 > -5) {
                                                    var22 = 0;
                                                }
                                                if (var23 < 5 && var23 > -5) {
                                                    var23 = 0;
                                                }
                                                if (this.field1143 < 5) {
                                                    var22 = 0;
                                                    var23 = 0;
                                                }
                                                var25.method179(var20 + var22, (byte) 34, var21 + var23, 128);
                                            } else if (this.field1495 != 0 && this.field1494 == var17 && this.field1493 == var14.field956) {
                                                var25.method179(var20, (byte) 34, var21, 128);
                                            } else {
                                                var25.method175(var21, -462, var20);
                                            }
                                            if (var25.field592 == 33 || var14.field953[var17] != 1) {
                                                int var26 = var14.field953[var17];
                                                this.field1272.method194(var21 + 10 + var23, method408(var26, (byte) -75), 0, var20 + 1 + var22, 0);
                                                this.field1272.method194(var21 + 9 + var23, method408(var26, (byte) -75), 16776960, var20 + var22, 0);
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field958 == 3) {
                            if (var14.field986) {
                                Pix2D.method150(var16, var14.field961, 8, var15, var14.field962, var14.field992);
                            } else {
                                Pix2D.method151(var14.field961, (byte) -103, var14.field962, var16, var15, var14.field992);
                            }
                        } else if (var14.field958 == 4) {
                            PixFont var28 = var14.field989;
                            int var29 = var14.field992;
                            String var30 = var14.field990;
                            if ((this.field1434 == var14.field956 || this.field1377 == var14.field956 || this.field1220 == var14.field956) && var14.field994 != 0) {
                                var29 = var14.field994;
                            }
                            if (this.method463(var14, 108)) {
                                var29 = var14.field993;
                                if (var14.field991.length() > 0) {
                                    var30 = var14.field991;
                                }
                            }
                            if (var14.field959 == 6 && this.field1459) {
                                var30 = "Please wait...";
                                var29 = var14.field992;
                            }
                            int var31 = var28.field614 + var16;
                            while (var30.length() > 0) {
                                if (var30.indexOf("%") != -1) {
                                    label262: while (true) {
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
                                                                            break label262;
                                                                        }
                                                                        var30 = var30.substring(0, var36) + this.method460(this.method466(9, var14, 4), true) + var30.substring(var36 + 2);
                                                                    }
                                                                }
                                                                var30 = var30.substring(0, var35) + this.method460(this.method466(9, var14, 3), true) + var30.substring(var35 + 2);
                                                            }
                                                        }
                                                        var30 = var30.substring(0, var34) + this.method460(this.method466(9, var14, 2), true) + var30.substring(var34 + 2);
                                                    }
                                                }
                                                var30 = var30.substring(0, var33) + this.method460(this.method466(9, var14, 1), true) + var30.substring(var33 + 2);
                                            }
                                        }
                                        var30 = var30.substring(0, var32) + this.method460(this.method466(9, var14, 0), true) + var30.substring(var32 + 2);
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
                                if (var14.field987) {
                                    var28.method192(var38, var14.field988, var29, var14.field961 / 2 + var15, (byte) -58, var31);
                                } else {
                                    var28.method196(var31, 0, var15, var14.field988, var29, var38);
                                }
                                var31 += var28.field614;
                            }
                        } else if (var14.field958 == 5) {
                            Pix32 var39;
                            if (this.method463(var14, 108)) {
                                var39 = var14.field996;
                            } else {
                                var39 = var14.field995;
                            }
                            if (var39 != null) {
                                var39.method175(var16, -462, var15);
                            }
                        } else if (var14.field958 == 6) {
                            int var40 = Pix3D.field565;
                            int var41 = Pix3D.field566;
                            Pix3D.field565 = var14.field961 / 2 + var15;
                            Pix3D.field566 = var14.field962 / 2 + var16;
                            int var42 = Pix3D.field569[var14.field1002] * var14.field1001 >> 16;
                            int var43 = Pix3D.field570[var14.field1002] * var14.field1001 >> 16;
                            boolean var44 = this.method463(var14, 108);
                            int var45;
                            if (var44) {
                                var45 = var14.field1000;
                            } else {
                                var45 = var14.field999;
                            }
                            Model var46;
                            if (var45 == -1) {
                                var46 = var14.method323(-1, -1, var44);
                            } else {
                                SeqType var47 = SeqType.field1018[var45];
                                var46 = var14.method323(var47.field1020[var14.field954], var47.field1021[var14.field954], var44);
                            }
                            if (var46 != null) {
                                var46.method140(0, var14.field1003, 0, var14.field1002, 0, var42, var43);
                            }
                            Pix3D.field565 = var40;
                            Pix3D.field566 = var41;
                        } else if (var14.field958 == 7) {
                            PixFont var48 = var14.field989;
                            int var49 = 0;
                            for (int var50 = 0; var50 < var14.field962; ++var50) {
                                for (int var51 = 0; var51 < var14.field961; ++var51) {
                                    if (var14.field952[var49] > 0) {
                                        ObjType var52 = ObjType.method294(var14.field952[var49] - 1);
                                        String var53 = var52.field878;
                                        if (var52.field890 || var14.field953[var49] != 1) {
                                            var53 = var53 + " x" + method398(721, var14.field953[var49]);
                                        }
                                        int var54 = (var14.field980 + 115) * var51 + var15;
                                        int var55 = (var14.field981 + 12) * var50 + var16;
                                        if (var14.field987) {
                                            var48.method192(var53, var14.field988, var14.field992, var14.field961 / 2 + var54, (byte) -58, var55);
                                        } else {
                                            var48.method196(var55, 0, var54, var14.field988, var14.field992, var53);
                                        }
                                    }
                                    ++var49;
                                }
                            }
                        }
                    }
                }
                if (arg4 != 0) {
                    this.field1290 = -342;
                }
                Pix2D.method148(var6, var8, var9, 770, var7);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILkb;I)V")
    private final void method372(int arg0, Packet arg1, int arg2) {
        arg1.method226((byte) -43);
        int var4 = arg1.method227(8, (byte) 6);
        if (var4 < this.field1284) {
            for (int var5 = var4; var5 < this.field1284; ++var5) {
                this.field1298[this.field1297++] = this.field1285[var5];
            }
        }
        if (var4 > this.field1284) {
            signlink.reporterror(this.field1236 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1284 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1285[var6];
                NpcEntity var8 = this.field1283[var7];
                int var9 = arg1.method227(1, (byte) 6);
                if (var9 == 0) {
                    this.field1285[this.field1284++] = var7;
                    var8.field352 = field1356;
                } else {
                    int var10 = arg1.method227(2, (byte) 6);
                    if (var10 == 0) {
                        this.field1285[this.field1284++] = var7;
                        var8.field352 = field1356;
                        this.field1372[this.field1371++] = var7;
                    } else if (var10 == 1) {
                        this.field1285[this.field1284++] = var7;
                        var8.field352 = field1356;
                        int var11 = arg1.method227(3, (byte) 6);
                        var8.method111(var11, false, 75);
                        int var12 = arg1.method227(1, (byte) 6);
                        if (var12 == 1) {
                            this.field1372[this.field1371++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1285[this.field1284++] = var7;
                        var8.field352 = field1356;
                        int var13 = arg1.method227(3, (byte) 6);
                        var8.method111(var13, true, 75);
                        int var14 = arg1.method227(3, (byte) 6);
                        var8.method111(var14, true, 75);
                        int var15 = arg1.method227(1, (byte) 6);
                        if (var15 == 1) {
                            this.field1372[this.field1371++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1298[this.field1297++] = var7;
                    }
                }
            }
            if (arg0 < 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method373(int arg0) {
        while (arg0 >= 0) {
            this.field1188 = 405;
        }
        if (this.field1167 >= 2 || this.field1398 != 0 || this.field1118 != 0) {
            String var2;
            if (this.field1398 == 1 && this.field1167 < 2) {
                var2 = "Use " + this.field1402 + " with...";
            } else if (this.field1118 == 1 && this.field1167 < 2) {
                var2 = this.field1121 + "...";
            } else {
                var2 = this.field1196[this.field1167 - 1];
            }
            if (this.field1167 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1167 - 2) + " more options";
            }
            this.field1274.method197(-13789, 15, 16777215, var2, field1356 / 1000, true, 4);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JB)V")
    public final void method374(long arg0, byte arg1) {
        if (arg1 != 88) {
            this.field1190 = this.field1363.method253();
        }
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1199; ++var4) {
                if (this.field1355[var4] == arg0) {
                    --this.field1199;
                    this.field1094 = true;
                    for (int var5 = var4; var5 < this.field1199; ++var5) {
                        this.field1206[var5] = this.field1206[var5 + 1];
                        this.field1412[var5] = this.field1412[var5 + 1];
                        this.field1355[var5] = this.field1355[var5 + 1];
                    }
                    this.field1425.method205(false, 11);
                    this.field1425.method212(0, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)V")
    public final void method375(int arg0, int arg1, int arg2) {
        int var4 = 0;
        int var5 = 20 / arg0;
        for (int var6 = 0; var6 < 100; ++var6) {
            if (this.field1269[var6] != null) {
                int var7 = this.field1267[var6];
                int var8 = 70 - var4 * 14 + this.field1125 + 4;
                if (var8 < -20) {
                    break;
                }
                if (var7 == 0) {
                    ++var4;
                }
                if ((var7 == 1 || var7 == 2) && (var7 == 1 || this.field1504 == 0 || this.field1504 == 1 && this.method470(this.field1268[var6], 0))) {
                    if (arg2 > var8 - 14 && arg2 <= var8 && !this.field1268[var6].equals(this.field1453.field367)) {
                        if (this.field1433) {
                            this.field1196[this.field1167] = "Report abuse @whi@" + this.field1268[var6];
                            this.field1446[this.field1167] = 34;
                            ++this.field1167;
                        }
                        this.field1196[this.field1167] = "Add ignore @whi@" + this.field1268[var6];
                        this.field1446[this.field1167] = 436;
                        ++this.field1167;
                        this.field1196[this.field1167] = "Add friend @whi@" + this.field1268[var6];
                        this.field1446[this.field1167] = 406;
                        ++this.field1167;
                    }
                    ++var4;
                }
                if ((var7 == 3 || var7 == 7) && this.field1395 == 0 && (var7 == 7 || this.field1106 == 0 || this.field1106 == 1 && this.method470(this.field1268[var6], 0))) {
                    if (arg2 > var8 - 14 && arg2 <= var8) {
                        if (this.field1433) {
                            this.field1196[this.field1167] = "Report abuse @whi@" + this.field1268[var6];
                            this.field1446[this.field1167] = 34;
                            ++this.field1167;
                        }
                        this.field1196[this.field1167] = "Add ignore @whi@" + this.field1268[var6];
                        this.field1446[this.field1167] = 436;
                        ++this.field1167;
                        this.field1196[this.field1167] = "Add friend @whi@" + this.field1268[var6];
                        this.field1446[this.field1167] = 406;
                        ++this.field1167;
                    }
                    ++var4;
                }
                if (var7 == 4 && (this.field1240 == 0 || this.field1240 == 1 && this.method470(this.field1268[var6], 0))) {
                    if (arg2 > var8 - 14 && arg2 <= var8) {
                        this.field1196[this.field1167] = "Accept trade @whi@" + this.field1268[var6];
                        this.field1446[this.field1167] = 903;
                        ++this.field1167;
                    }
                    ++var4;
                }
                if ((var7 == 5 || var7 == 6) && this.field1395 == 0 && this.field1106 < 2) {
                    ++var4;
                }
                if (var7 == 8 && (this.field1240 == 0 || this.field1240 == 1 && this.method470(this.field1268[var6], 0))) {
                    if (arg2 > var8 - 14 && arg2 <= var8) {
                        this.field1196[this.field1167] = "Accept duel @whi@" + this.field1268[var6];
                        this.field1446[this.field1167] = 363;
                        ++this.field1167;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method376(int arg0) {
        if (arg0 >= 0) {
            this.field1425.method206(40);
        }
        if (super.field24 == 1) {
            if (super.field25 >= 8 && super.field25 <= 108 && super.field26 >= 490 && super.field26 <= 522) {
                this.field1504 = (this.field1504 + 1) % 4;
                this.field1406 = true;
                this.field1171 = true;
                this.field1425.method205(false, 244);
                this.field1425.method206(this.field1504);
                this.field1425.method206(this.field1106);
                this.field1425.method206(this.field1240);
            }
            if (super.field25 >= 137 && super.field25 <= 237 && super.field26 >= 490 && super.field26 <= 522) {
                this.field1106 = (this.field1106 + 1) % 3;
                this.field1406 = true;
                this.field1171 = true;
                this.field1425.method205(false, 244);
                this.field1425.method206(this.field1504);
                this.field1425.method206(this.field1106);
                this.field1425.method206(this.field1240);
            }
            if (super.field25 >= 275 && super.field25 <= 375 && super.field26 >= 490 && super.field26 <= 522) {
                this.field1240 = (this.field1240 + 1) % 3;
                this.field1406 = true;
                this.field1171 = true;
                this.field1425.method205(false, 244);
                this.field1425.method206(this.field1504);
                this.field1425.method206(this.field1106);
                this.field1425.method206(this.field1240);
            }
            if (super.field25 >= 416 && super.field25 <= 516 && super.field26 >= 490 && super.field26 <= 522) {
                this.method422(this.field1498);
                this.field1277 = "";
                this.field1203 = false;
                for (int var2 = 0; var2 < Component.field951.length; ++var2) {
                    if (Component.field951[var2] != null && Component.field951[var2].field960 == 600) {
                        this.field1455 = this.field1112 = Component.field951[var2].field957;
                        return;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method377(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1307 >= 100) {
                this.method379("Your ignore list is full. Max of 100 hit", this.field1496, "", 0);
            } else {
                String var4 = JString.method262(0, JString.method259(arg1, true));
                while (arg0 >= 0) {
                    this.method6();
                }
                for (int var5 = 0; var5 < this.field1307; ++var5) {
                    if (this.field1249[var5] == arg1) {
                        this.method379(var4 + " is already on your ignore list", this.field1496, "", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1199; ++var6) {
                    if (this.field1355[var6] == arg1) {
                        this.method379("Please remove " + var4 + " from your friend list first", this.field1496, "", 0);
                        return;
                    }
                }
                this.field1249[this.field1307++] = arg1;
                this.field1094 = true;
                this.field1425.method205(false, 79);
                this.field1425.method212(0, arg1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method378(int arg0) {
        Graphics var2 = this.method11((byte) -66).getGraphics();
        var2.setColor(Color.black);
        while (arg0 >= 0) {
        }
        var2.fillRect(0, 0, 789, 532);
        this.method4(0, 1);
        if (this.field1230) {
            this.field1242 = false;
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
        if (this.field1200) {
            this.field1242 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1476) {
            this.field1242 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)V")
    public final void method379(String arg0, byte arg1, String arg2, int arg3) {
        if (arg3 == 0 && this.field1471 != -1) {
            this.field1313 = arg0;
            super.field24 = 0;
        }
        if (this.field1182 == -1) {
            this.field1171 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1267[var5] = this.field1267[var5 - 1];
            this.field1268[var5] = this.field1268[var5 - 1];
            this.field1269[var5] = this.field1269[var5 - 1];
        }
        this.field1267[0] = arg3;
        this.field1268[0] = arg2;
        this.field1269[0] = arg0;
        if (arg1 != 96) {
            this.field1168 = -465;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method380(int arg0) {
        if (this.field1146 == 0) {
            this.field1196[0] = "Cancel";
            this.field1446[0] = 1252;
            this.field1167 = 1;
            this.method406((byte) 5, super.field23, super.field22);
            this.field1129 = 0;
            if (super.field22 > 8 && super.field23 > 11 && super.field22 < 520 && super.field23 < 345) {
                if (this.field1112 != -1) {
                    this.method459(8, 0, 0, 11, super.field23, super.field22, Component.field951[this.field1112]);
                } else {
                    this.method438(this.field1190);
                }
            }
            if (this.field1220 != this.field1129) {
                this.field1220 = this.field1129;
            }
            this.field1129 = 0;
            if (super.field22 > 562 && super.field23 > 231 && super.field22 < 752 && super.field23 < 492) {
                if (this.field1462 != -1) {
                    this.method459(562, 0, 0, 231, super.field23, super.field22, Component.field951[this.field1462]);
                } else if (this.field1110[this.field1241] != -1) {
                    this.method459(562, 0, 0, 231, super.field23, super.field22, Component.field951[this.field1110[this.field1241]]);
                }
            }
            if (this.field1377 != this.field1129) {
                this.field1094 = true;
                this.field1377 = this.field1129;
            }
            this.field1129 = 0;
            if (super.field22 > 22 && super.field23 > 375 && super.field22 < 431 && super.field23 < 471) {
                if (this.field1182 != -1) {
                    this.method459(22, 0, 0, 375, super.field23, super.field22, Component.field951[this.field1182]);
                } else {
                    this.method375(94, super.field22 - 22, super.field23 - 375);
                }
            }
            if (this.field1182 != -1 && this.field1434 != this.field1129) {
                this.field1171 = true;
                this.field1434 = this.field1129;
            }
            boolean var2 = false;
            if (arg0 <= 0) {
                this.field1429 = this.field1363.method253();
            }
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field1167 - 1; ++var3) {
                    if (this.field1446[var3] < 1000 && this.field1446[var3 + 1] > 1000) {
                        String var4 = this.field1196[var3];
                        this.field1196[var3] = this.field1196[var3 + 1];
                        this.field1196[var3 + 1] = var4;
                        int var5 = this.field1446[var3];
                        this.field1446[var3] = this.field1446[var3 + 1];
                        this.field1446[var3 + 1] = var5;
                        int var6 = this.field1444[var3];
                        this.field1444[var3] = this.field1444[var3 + 1];
                        this.field1444[var3 + 1] = var6;
                        int var7 = this.field1445[var3];
                        this.field1445[var3] = this.field1445[var3 + 1];
                        this.field1445[var3 + 1] = var7;
                        int var8 = this.field1447[var3];
                        this.field1447[var3] = this.field1447[var3 + 1];
                        this.field1447[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method381(byte arg0) {
        byte[] var2 = this.field1117.method257((byte[]) null, "title.dat", -31149);
        Pix32 var3 = new Pix32(var2, this);
        this.field1486.method242(false);
        var3.method173(0, 0, 0);
        this.field1487.method242(false);
        var3.method173(-661, 0, 0);
        this.field1483.method242(false);
        var3.method173(-128, 0, 0);
        this.field1484.method242(false);
        if (arg0 != 24) {
            this.field1418 = null;
        }
        var3.method173(-214, 0, -386);
        this.field1485.method242(false);
        var3.method173(-214, 0, -186);
        this.field1488.method242(false);
        var3.method173(0, 0, -265);
        this.field1489.method242(false);
        var3.method173(-574, 0, -265);
        this.field1490.method242(false);
        var3.method173(-128, 0, -186);
        this.field1491.method242(false);
        var3.method173(-574, 0, -186);
        int[] var4 = new int[var3.field588];
        for (int var5 = 0; var5 < var3.field589; ++var5) {
            for (int var10 = 0; var10 < var3.field588; ++var10) {
                var4[var10] = var3.field587[var3.field588 * var5 + (var3.field588 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field588; ++var11) {
                var3.field587[var3.field588 * var5 + var11] = var4[var11];
            }
        }
        this.field1486.method242(false);
        var3.method173(394, 0, 0);
        this.field1487.method242(false);
        var3.method173(-267, 0, 0);
        this.field1483.method242(false);
        var3.method173(266, 0, 0);
        this.field1484.method242(false);
        var3.method173(180, 0, -386);
        this.field1485.method242(false);
        var3.method173(180, 0, -186);
        this.field1488.method242(false);
        var3.method173(394, 0, -265);
        this.field1489.method242(false);
        var3.method173(-180, 0, -265);
        this.field1490.method242(false);
        var3.method173(212, 0, -186);
        this.field1491.method242(false);
        var3.method173(-180, 0, -186);
        Pix32 var6 = new Pix32(this.field1117, "logo", 0);
        this.field1483.method242(false);
        var6.method175(18, -462, super.field13 / 2 - var6.field588 / 2 - 128);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method382(byte arg0) {
        if (this.field1483 == null) {
            super.field16 = null;
            this.field1386 = null;
            this.field1384 = null;
            this.field1383 = null;
            this.field1385 = null;
            this.field1279 = null;
            this.field1280 = null;
            this.field1281 = null;
            this.field1486 = new PixMap(265, 128, field1259, this.method11((byte) -66));
            Pix2D.method149(730);
            this.field1487 = new PixMap(265, 128, field1259, this.method11((byte) -66));
            Pix2D.method149(730);
            this.field1483 = new PixMap(186, 533, field1259, this.method11((byte) -66));
            Pix2D.method149(730);
            this.field1484 = new PixMap(146, 360, field1259, this.method11((byte) -66));
            Pix2D.method149(730);
            this.field1485 = new PixMap(200, 360, field1259, this.method11((byte) -66));
            Pix2D.method149(730);
            this.field1488 = new PixMap(267, 214, field1259, this.method11((byte) -66));
            Pix2D.method149(730);
            if (arg0 != -58) {
                this.field1481 = !this.field1481;
            }
            this.field1489 = new PixMap(267, 215, field1259, this.method11((byte) -66));
            Pix2D.method149(730);
            this.field1490 = new PixMap(79, 86, field1259, this.method11((byte) -66));
            Pix2D.method149(730);
            this.field1491 = new PixMap(79, 87, field1259, this.method11((byte) -66));
            Pix2D.method149(730);
            if (this.field1117 != null) {
                this.method381((byte) 24);
                this.method458(0);
            }
            this.field1439 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I[BI)Z")
    public final boolean method383(int arg0, byte[] arg1, int arg2) {
        if (arg2 != -12770) {
            this.field1418 = null;
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg0);
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)Z")
    public final boolean method384(int arg0) {
        if (arg0 != 0) {
            this.method6();
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method385(int arg0, int arg1) {
        signlink.wavevol = arg0;
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLhc;)Z")
    public final boolean method386(byte arg0, Component arg1) {
        int var3 = arg1.field960;
        if (this.field1316 != arg0) {
            this.field1429 = this.field1363.method253();
        }
        if (var3 == 201) {
            this.field1171 = true;
            this.field1113 = false;
            this.field1333 = true;
            this.field1183 = "";
            this.field1391 = 1;
            this.field1458 = "Enter name of friend to add to list";
        }
        if (var3 == 202) {
            this.field1171 = true;
            this.field1113 = false;
            this.field1333 = true;
            this.field1183 = "";
            this.field1391 = 2;
            this.field1458 = "Enter name of friend to delete from list";
        }
        if (var3 == 205) {
            this.field1093 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field1171 = true;
                this.field1113 = false;
                this.field1333 = true;
                this.field1183 = "";
                this.field1391 = 4;
                this.field1458 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field1171 = true;
                this.field1113 = false;
                this.field1333 = true;
                this.field1183 = "";
                this.field1391 = 5;
                this.field1458 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field1428[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = IdkType.field942 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= IdkType.field942) {
                                var6 = 0;
                            }
                        }
                        if (!IdkType.field943[var6].field949 && IdkType.field943[var6].field944 == var4 + (this.field1393 ? 0 : 7)) {
                            this.field1428[var4] = var6;
                            this.field1364 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field1081[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field1184[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field1184[var7].length) {
                        var9 = 0;
                    }
                }
                this.field1081[var7] = var9;
                this.field1364 = true;
            }
            if (var3 == 324 && !this.field1393) {
                this.field1393 = true;
                this.method461(this.field1165);
            }
            if (var3 == 325 && this.field1393) {
                this.field1393 = false;
                this.method461(this.field1165);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field1203 = !this.field1203;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method422(this.field1498);
                    if (this.field1277.length() > 0) {
                        this.field1425.method205(false, 190);
                        this.field1425.method212(0, JString.method258(this.field1277));
                        this.field1425.method206(var3 - 601);
                        this.field1425.method206(this.field1203 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1425.method205(false, 52);
                this.field1425.method206(this.field1393 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field1425.method206(this.field1428[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field1425.method206(this.field1081[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILkb;B)V")
    private final void method387(int arg0, Packet arg1, byte arg2) {
        if (arg2 != 4) {
            this.field1090 = -1;
        }
        arg1.method226((byte) -43);
        int var4 = arg1.method227(1, (byte) 6);
        if (var4 != 0) {
            int var5 = arg1.method227(2, (byte) 6);
            if (var5 == 0) {
                this.field1372[this.field1371++] = this.field1367;
            } else if (var5 == 1) {
                int var6 = arg1.method227(3, (byte) 6);
                this.field1453.method111(var6, false, 75);
                int var7 = arg1.method227(1, (byte) 6);
                if (var7 == 1) {
                    this.field1372[this.field1371++] = this.field1367;
                }
            } else if (var5 == 2) {
                int var8 = arg1.method227(3, (byte) 6);
                this.field1453.method111(var8, true, 75);
                int var9 = arg1.method227(3, (byte) 6);
                this.field1453.method111(var9, true, 75);
                int var10 = arg1.method227(1, (byte) 6);
                if (var10 == 1) {
                    this.field1372[this.field1371++] = this.field1367;
                }
            } else if (var5 == 3) {
                this.field1221 = arg1.method227(2, (byte) 6);
                int var11 = arg1.method227(7, (byte) 6);
                int var12 = arg1.method227(7, (byte) 6);
                int var13 = arg1.method227(1, (byte) 6);
                this.field1453.method110(var11, -398, var13 == 1, var12);
                int var14 = arg1.method227(1, (byte) 6);
                if (var14 == 1) {
                    this.field1372[this.field1371++] = this.field1367;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field1322.method78(arg4, arg1, arg0);
        if (var7 != 0) {
            int var8 = this.field1322.method82(arg4, arg1, arg0, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg2;
            if (var7 > 0) {
                var11 = arg5;
            }
            int[] var12 = this.field1480.field587;
            int var13 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method282(var14);
            if (var15.field826 != -1) {
                Pix8 var16 = this.field1083[var15.field826];
                if (var16 != null) {
                    int var17 = (var15.field811 * 4 - var16.field599) / 2;
                    int var18 = (var15.field812 * 4 - var16.field600) / 2;
                    var16.method189((104 - arg0 - var15.field812) * 4 + 48 + var18, -462, arg1 * 4 + 48 + var17);
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
        int var19 = this.field1322.method80(arg4, arg1, arg0);
        if (var19 != 0) {
            int var20 = this.field1322.method82(arg4, arg1, arg0, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            LocType var24 = LocType.method282(var23);
            if (var24.field826 != -1) {
                Pix8 var25 = this.field1083[var24.field826];
                if (var25 != null) {
                    int var26 = (var24.field811 * 4 - var25.field599) / 2;
                    int var27 = (var24.field812 * 4 - var25.field600) / 2;
                    var25.method189((104 - arg0 - var24.field812) * 4 + 48 + var27, -462, arg1 * 4 + 48 + var26);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field1480.field587;
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
        int var31 = this.field1322.method81(arg4, arg1, arg0);
        if (arg3 != 14108) {
            this.field1165 = !this.field1165;
        }
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            LocType var33 = LocType.method282(var32);
            if (var33.field826 != -1) {
                Pix8 var34 = this.field1083[var33.field826];
                if (var34 != null) {
                    int var35 = (var33.field811 * 4 - var34.field599) / 2;
                    int var36 = (var33.field812 * 4 - var34.field600) / 2;
                    var34.method189((104 - arg0 - var33.field812) * 4 + 48 + var36, -462, arg1 * 4 + 48 + var35);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method8(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1437 != null) {
                this.field1437.method29();
            }
        } catch (Exception var2) {
        }
        this.field1437 = null;
        this.method390(false);
        this.field1430 = false;
        this.field1425 = null;
        this.field1362 = null;
        this.field1432 = null;
        this.field1210 = null;
        this.field1357 = null;
        this.field1270 = null;
        this.field1140 = null;
        this.field1350 = null;
        this.field1322 = null;
        this.field1499 = null;
        this.field1472 = null;
        this.field1374 = null;
        this.field1387 = null;
        this.field1388 = null;
        this.field1211 = null;
        this.field1383 = null;
        this.field1384 = null;
        this.field1385 = null;
        this.field1386 = null;
        this.field1279 = null;
        this.field1280 = null;
        this.field1281 = null;
        this.field1095 = null;
        this.field1096 = null;
        this.field1097 = null;
        this.field1098 = null;
        this.field1099 = null;
        this.field1100 = null;
        this.field1101 = null;
        this.field1102 = null;
        this.field1103 = null;
        this.field1104 = null;
        this.field1379 = null;
        while (arg0 >= 0) {
            field1503 = true;
        }
        this.field1380 = null;
        this.field1381 = null;
        this.field1338 = null;
        this.field1339 = null;
        this.field1340 = null;
        this.field1124 = null;
        this.field1291 = null;
        this.field1292 = null;
        this.field1293 = null;
        this.field1294 = null;
        this.field1295 = null;
        this.field1342 = null;
        this.field1343 = null;
        this.field1344 = null;
        this.field1345 = null;
        this.field1346 = null;
        this.field1217 = null;
        this.field1442 = null;
        this.field1306 = null;
        this.field1208 = null;
        this.field1178 = null;
        this.field1179 = null;
        this.field1180 = null;
        this.field1181 = null;
        this.field1083 = null;
        this.field1289 = null;
        this.field1431 = null;
        this.field1368 = null;
        this.field1370 = null;
        this.field1372 = null;
        this.field1373 = null;
        this.field1298 = null;
        this.field1283 = null;
        this.field1285 = null;
        this.field1418 = null;
        this.field1361 = null;
        this.field1510 = null;
        this.field1207 = null;
        this.field1149 = null;
        this.field1502 = null;
        this.field1444 = null;
        this.field1445 = null;
        this.field1446 = null;
        this.field1447 = null;
        this.field1196 = null;
        this.field1305 = null;
        this.field1474 = null;
        this.field1475 = null;
        this.field1397 = null;
        this.field1480 = null;
        this.field1206 = null;
        this.field1355 = null;
        this.field1412 = null;
        this.field1486 = null;
        this.field1487 = null;
        this.field1483 = null;
        this.field1484 = null;
        this.field1485 = null;
        this.field1488 = null;
        this.field1489 = null;
        this.field1490 = null;
        this.field1491 = null;
        this.method401(true);
        LocType.method281(-25);
        NpcType.method287(-25);
        ObjType.method293(-25);
        FloType.field928 = null;
        IdkType.field943 = null;
        Component.field951 = null;
        UnkType.field1010 = null;
        SeqType.field1018 = null;
        SpotAnimType.field1033 = null;
        SpotAnimType.field1046 = null;
        VarpType.field1049 = null;
        super.field16 = null;
        PlayerEntity.field387 = null;
        Pix3D.method154(-25);
        World3D.method50(-25);
        Model.method121(-25);
        AnimBase.field85 = null;
        AnimFrame.field89 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method389(int arg0) {
        this.method382((byte) -58);
        this.field1485.method242(false);
        this.field1460.method189(0, -462, 0);
        short var2 = 360;
        short var3 = 200;
        int var4 = 36 / arg0;
        if (this.field1457 == 0) {
            int var5 = var3 / 2 - 20;
            this.field1274.method192("Welcome to RuneScape", true, 16776960, var2 / 2, (byte) -58, var5);
            int var16 = var5 + 30;
            int var6 = var2 / 2 - 80;
            int var7 = var3 / 2 + 20;
            this.field1461.method189(var7 - 20, -462, var6 - 73);
            this.field1274.method192("New user", true, 16777215, var6, (byte) -58, var7 + 5);
            int var8 = var2 / 2 + 80;
            this.field1461.method189(var7 - 20, -462, var8 - 73);
            this.field1274.method192("Existing User", true, 16777215, var8, (byte) -58, var7 + 5);
        }
        if (this.field1457 == 2) {
            int var9 = var3 / 2 - 40;
            if (this.field1079.length() > 0) {
                this.field1274.method192(this.field1079, true, 16776960, var2 / 2, (byte) -58, var9 - 15);
                this.field1274.method192(this.field1080, true, 16776960, var2 / 2, (byte) -58, var9);
                var9 += 30;
            } else {
                this.field1274.method192(this.field1080, true, 16776960, var2 / 2, (byte) -58, var9 - 7);
                var9 += 30;
            }
            this.field1274.method196(var9, 0, var2 / 2 - 90, true, 16777215, "Username: " + this.field1236 + (this.field1229 == 0 & field1356 % 40 < 20 ? "@yel@|" : ""));
            var9 += 15;
            this.field1274.method196(var9, 0, var2 / 2 - 88, true, 16777215, "Password: " + JString.method264(0, this.field1237) + (this.field1229 == 1 & field1356 % 40 < 20 ? "@yel@|" : ""));
            var9 += 15;
            int var10 = var2 / 2 - 80;
            int var11 = var3 / 2 + 50;
            this.field1461.method189(var11 - 20, -462, var10 - 73);
            this.field1274.method192("Login", true, 16777215, var10, (byte) -58, var11 + 5);
            int var12 = var2 / 2 + 80;
            this.field1461.method189(var11 - 20, -462, var12 - 73);
            this.field1274.method192("Cancel", true, 16777215, var12, (byte) -58, var11 + 5);
        }
        if (this.field1457 == 3) {
            this.field1274.method192("Create a free account", true, 16776960, var2 / 2, (byte) -58, var3 / 2 - 60);
            int var13 = var3 / 2 - 35;
            this.field1274.method192("To create a new account you need to", true, 16777215, var2 / 2, (byte) -58, var13);
            int var17 = var13 + 15;
            this.field1274.method192("go back to the main RuneScape webpage", true, 16777215, var2 / 2, (byte) -58, var17);
            int var18 = var17 + 15;
            this.field1274.method192("and choose the red 'create account'", true, 16777215, var2 / 2, (byte) -58, var18);
            int var19 = var18 + 15;
            this.field1274.method192("button at the top right of that page.", true, 16777215, var2 / 2, (byte) -58, var19);
            int var20 = var19 + 15;
            int var14 = var2 / 2;
            int var15 = var3 / 2 + 50;
            this.field1461.method189(var15 - 20, -462, var14 - 73);
            this.field1274.method192("Cancel", true, 16777215, var14, (byte) -58, var15 + 5);
        }
        this.field1485.method243(super.field15, 186, 2, 214);
        if (this.field1439) {
            this.field1439 = false;
            this.field1483.method243(super.field15, 0, 2, 128);
            this.field1484.method243(super.field15, 386, 2, 214);
            this.field1488.method243(super.field15, 265, 2, 0);
            this.field1489.method243(super.field15, 265, 2, 574);
            this.field1490.method243(super.field15, 186, 2, 128);
            this.field1491.method243(super.field15, 186, 2, 574);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method390(boolean arg0) {
        if (arg0) {
            this.field1290 = this.field1363.method253();
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method391(int arg0, int arg1) {
        this.field1089 += arg1;
        Component var3 = Component.field951[arg0];
        for (int var4 = 0; var4 < var3.field972.length && var3.field972[var4] != -1; ++var4) {
            Component var5 = Component.field951[var3.field972[var4]];
            if (var5.field958 == 1) {
                this.method391(var5.field956, 0);
            }
            var5.field954 = 0;
            var5.field955 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BZZI)V")
    public final void method392(byte[] arg0, boolean arg1, boolean arg2, int arg3) {
        signlink.midifade = arg2 ? 1 : 0;
        signlink.midisave(arg0, arg3);
        if (arg1) {
            this.field1418 = null;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)Ljava/lang/String;")
    public final String method393(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field18 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method394(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg3;
        if (arg1 != -10835) {
            this.field1165 = !this.field1165;
        }
        return ((arg0 & 16711935) * var5 + (arg2 & 16711935) * arg3 & -16711936) + ((arg0 & 65280) * var5 + (arg2 & 65280) * arg3 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method395(boolean arg0) {
        short var2 = 256;
        if (arg0) {
            this.method6();
        }
        if (this.field1084 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1084 > 768) {
                    this.field1325[var3] = this.method394(this.field1326[var3], -10835, this.field1327[var3], 1024 - this.field1084);
                } else if (this.field1084 > 256) {
                    this.field1325[var3] = this.field1327[var3];
                } else {
                    this.field1325[var3] = this.method394(this.field1327[var3], -10835, this.field1326[var3], 256 - this.field1084);
                }
            }
        } else if (this.field1085 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1085 > 768) {
                    this.field1325[var4] = this.method394(this.field1326[var4], -10835, this.field1328[var4], 1024 - this.field1085);
                } else if (this.field1085 > 256) {
                    this.field1325[var4] = this.field1328[var4];
                } else {
                    this.field1325[var4] = this.method394(this.field1328[var4], -10835, this.field1326[var4], 256 - this.field1085);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1325[var5] = this.field1326[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1486.field671[var6] = this.field1244.field587[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1209[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1250[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1325[var26];
                    int var30 = this.field1486.field671[var8];
                    this.field1486.field671[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field1486.method243(super.field15, 0, 2, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1487.field671[var10] = this.field1245.field587[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1209[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1250[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1325[var18];
                    int var22 = this.field1487.field671[var16];
                    this.field1487.field671[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field1487.method243(super.field15, 0, 2, 661);
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method396(boolean arg0) {
        for (int var2 = -1; var2 < this.field1369; ++var2) {
            int var4;
            if (var2 == -1) {
                var4 = this.field1367;
            } else {
                var4 = this.field1370[var2];
            }
            PlayerEntity var5 = this.field1368[var4];
            if (var5 != null) {
                this.method449(var5, true, 1);
            }
        }
        ++field1186;
        if (!arg0) {
            field1503 = true;
        }
        if (field1186 > 1406) {
            field1186 = 0;
            this.field1425.method205(false, 219);
            this.field1425.method206(0);
            int var3 = this.field1425.field624;
            this.field1425.method206(162);
            this.field1425.method206(22);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1425.method206(84);
            }
            this.field1425.method207(31824);
            this.field1425.method207(13490);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1425.method206(123);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1425.method206(134);
            }
            this.field1425.method206(100);
            this.field1425.method206(94);
            this.field1425.method207(35521);
            this.field1425.method215(this.field1425.field624 - var3, (byte) 3);
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method397(int arg0) {
        if (arg0 <= 0) {
            this.field1454 = !this.field1454;
        }
        this.method446((byte) 9);
        if (this.field1195 == 1) {
            this.field1208[this.field1194 / 100].method175(this.field1193 - 8 - 11, -462, this.field1192 - 8 - 8);
        }
        if (this.field1195 == 2) {
            this.field1208[this.field1194 / 100 + 4].method175(this.field1193 - 8 - 11, -462, this.field1192 - 8 - 8);
        }
        if (this.field1112 != -1) {
            this.method476(this.field1112, this.field1456, (byte) 46);
            this.method371(0, 0, Component.field951[this.field1112], 0, 0);
        }
        this.method486(true);
        if (!this.field1315) {
            this.method380(783);
            this.method373(-275);
        } else if (this.field1157 == 0) {
            this.method409(7);
        }
        if (this.field1443 == 1) {
            if (this.field1116 <= 0 && this.field1214 != 1) {
                this.field1306[1].method175(296, -462, 472);
            } else {
                this.field1306[1].method175(258, -462, 472);
            }
        }
        if (this.field1116 > 0) {
            this.field1306[0].method175(296, -462, 472);
            this.field1273.method191(-83, 484, 329, "Level: " + this.field1116, 16776960);
        }
        if (this.field1214 == 1) {
            this.field1306[6].method175(296, -462, 472);
            this.field1273.method191(-83, 484, 329, "Arena", 16776960);
        }
        if (this.field1421 != 0) {
            int var2 = this.field1421 / 50;
            int var3 = var2 / 60;
            int var4 = var2 % 60;
            if (var4 < 10) {
                this.field1273.method194(329, "System update in: " + var3 + ":0" + var4, 16776960, 4, 0);
            } else {
                this.field1273.method194(329, "System update in: " + var3 + ":" + var4, 16776960, 4, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)Ljava/lang/String;")
    private static final String method398(int arg0, int arg1) {
        int var2 = 65 / arg0;
        String var3 = String.valueOf(arg1);
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lib;I)V")
    public final void method399(Pix8 arg0, int arg1) {
        short var3 = 256;
        if (arg1 <= 0) {
            field1349 = 26;
        }
        for (int var4 = 0; var4 < this.field1414.length; ++var4) {
            this.field1414[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1414[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field1415[var16] = (this.field1414[var16 - 1] + this.field1414[var16 + 1] + this.field1414[var16 - 128] + this.field1414[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field1414;
            this.field1414 = this.field1415;
            this.field1415 = var14;
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field600; ++var8) {
                for (int var9 = 0; var9 < arg0.field599; ++var9) {
                    if (arg0.field597[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field601;
                        int var11 = var8 + 16 + arg0.field602;
                        int var12 = (var11 << 7) + var10;
                        this.field1414[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLkb;)V")
    private final void method400(int arg0, byte arg1, Packet arg2) {
        if (this.field1449 == arg1) {
            int var4 = arg2.method227(8, (byte) 6);
            if (var4 < this.field1369) {
                for (int var5 = var4; var5 < this.field1369; ++var5) {
                    this.field1298[this.field1297++] = this.field1370[var5];
                }
            }
            if (var4 > this.field1369) {
                signlink.reporterror(this.field1236 + " Too many players");
                throw new RuntimeException("eek");
            } else {
                this.field1369 = 0;
                for (int var6 = 0; var6 < var4; ++var6) {
                    int var7 = this.field1370[var6];
                    PlayerEntity var8 = this.field1368[var7];
                    int var9 = arg2.method227(1, (byte) 6);
                    if (var9 == 0) {
                        this.field1370[this.field1369++] = var7;
                        var8.field352 = field1356;
                    } else {
                        int var10 = arg2.method227(2, (byte) 6);
                        if (var10 == 0) {
                            this.field1370[this.field1369++] = var7;
                            var8.field352 = field1356;
                            this.field1372[this.field1371++] = var7;
                        } else if (var10 == 1) {
                            this.field1370[this.field1369++] = var7;
                            var8.field352 = field1356;
                            int var11 = arg2.method227(3, (byte) 6);
                            var8.method111(var11, false, 75);
                            int var12 = arg2.method227(1, (byte) 6);
                            if (var12 == 1) {
                                this.field1372[this.field1371++] = var7;
                            }
                        } else if (var10 == 2) {
                            this.field1370[this.field1369++] = var7;
                            var8.field352 = field1356;
                            int var13 = arg2.method227(3, (byte) 6);
                            var8.method111(var13, true, 75);
                            int var14 = arg2.method227(3, (byte) 6);
                            var8.method111(var14, true, 75);
                            int var15 = arg2.method227(1, (byte) 6);
                            if (var15 == 1) {
                                this.field1372[this.field1371++] = var7;
                            }
                        } else if (var10 == 3) {
                            this.field1298[this.field1297++] = var7;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method401(boolean arg0) {
        this.field1242 = false;
        while (this.field1201) {
            this.field1242 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1460 = null;
        this.field1461 = null;
        this.field1441 = null;
        this.field1325 = null;
        this.field1326 = null;
        this.field1327 = null;
        this.field1328 = null;
        this.field1414 = null;
        this.field1415 = null;
        this.field1250 = null;
        if (arg0) {
            this.field1251 = null;
            this.field1244 = null;
            this.field1245 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        if (signlink.sunjava) {
            super.field10 = 5;
        }
        if (!field1265) {
            this.field1497 = true;
            this.field1430 = true;
            this.method12(this, 2);
            this.method485("scape_main", 40000, 12345678, -242);
        }
        if (field1463) {
            this.field1476 = true;
        } else {
            field1463 = true;
            boolean var1 = false;
            String var2 = this.method393(34);
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
                this.field1200 = true;
            } else {
                try {
                    int var3 = 5;
                    this.field1390[8] = 0;
                    while (this.field1390[8] == 0) {
                        this.method13("Connecting to fileserver", 10, -745);
                        try {
                            DataInputStream var4 = this.method435("crc" + (int) (Math.random() * 9.9999999E7D));
                            Packet var5 = new Packet((byte) 64, new byte[36]);
                            var4.readFully(var5.field623, 0, 36);
                            for (int var6 = 0; var6 < 9; ++var6) {
                                this.field1390[var6] = var5.method221();
                            }
                            var4.close();
                        } catch (IOException var59) {
                            for (int var7 = var3; var7 > 0; --var7) {
                                this.method13("Error loading - Will retry in " + var7 + " secs.", 10, -745);
                                try {
                                    Thread.sleep(1000L);
                                } catch (Exception var54) {
                                }
                            }
                            var3 *= 2;
                            if (var3 > 60) {
                                var3 = 60;
                            }
                        }
                    }
                    this.field1117 = this.method477("title", 10, -27314, this.field1390[1], "title screen");
                    this.field1272 = new PixFont(this.field1117, 0, "p11");
                    this.field1273 = new PixFont(this.field1117, 0, "p12");
                    this.field1274 = new PixFont(this.field1117, 0, "b12");
                    this.field1275 = new PixFont(this.field1117, 0, "q8");
                    this.method381((byte) 24);
                    this.method458(0);
                    Jagfile var8 = this.method477("config", 15, -27314, this.field1390[2], "config");
                    Jagfile var9 = this.method477("interface", 20, -27314, this.field1390[3], "interface");
                    Jagfile var10 = this.method477("media", 30, -27314, this.field1390[4], "2d graphics");
                    Jagfile var11 = this.method477("models", 40, -27314, this.field1390[5], "3d graphics");
                    Jagfile var12 = this.method477("textures", 60, -27314, this.field1390[6], "textures");
                    Jagfile var13 = this.method477("wordenc", 65, -27314, this.field1390[7], "chat system");
                    Jagfile var14 = this.method477("sounds", 70, -27314, this.field1390[8], "sound effects");
                    this.field1350 = new byte[4][104][104];
                    this.field1140 = new int[4][105][105];
                    this.field1322 = new World3D(4, 104, this.field1140, 104, 38656);
                    for (int var15 = 0; var15 < 4; ++var15) {
                        this.field1499[var15] = new CollisionMap(104, 104, 4);
                    }
                    this.field1480 = new Pix32(512, 512);
                    this.method13("Unpacking media", 75, -745);
                    this.field1379 = new Pix8(var10, "invback", 0);
                    this.field1381 = new Pix8(var10, "chatback", 0);
                    this.field1380 = new Pix8(var10, "mapback", 0);
                    this.field1338 = new Pix8(var10, "backbase1", 0);
                    this.field1339 = new Pix8(var10, "backbase2", 0);
                    this.field1340 = new Pix8(var10, "backhmid1", 0);
                    for (int var16 = 0; var16 < 13; ++var16) {
                        this.field1124[var16] = new Pix8(var10, "sideicons", var16);
                    }
                    this.field1217 = new Pix32(var10, "compass", 0);
                    try {
                        for (int var17 = 0; var17 < 50; ++var17) {
                            this.field1083[var17] = new Pix8(var10, "mapscene", var17);
                        }
                    } catch (Exception var58) {
                    }
                    try {
                        for (int var18 = 0; var18 < 50; ++var18) {
                            this.field1289[var18] = new Pix32(var10, "mapfunction", var18);
                        }
                    } catch (Exception var57) {
                    }
                    try {
                        for (int var19 = 0; var19 < 20; ++var19) {
                            this.field1442[var19] = new Pix32(var10, "hitmarks", var19);
                        }
                    } catch (Exception var56) {
                    }
                    try {
                        for (int var20 = 0; var20 < 20; ++var20) {
                            this.field1306[var20] = new Pix32(var10, "headicons", var20);
                        }
                    } catch (Exception var55) {
                    }
                    this.field1310 = new Pix32(var10, "mapflag", 0);
                    for (int var21 = 0; var21 < 8; ++var21) {
                        this.field1208[var21] = new Pix32(var10, "cross", var21);
                    }
                    this.field1178 = new Pix32(var10, "mapdots", 0);
                    this.field1179 = new Pix32(var10, "mapdots", 1);
                    this.field1180 = new Pix32(var10, "mapdots", 2);
                    this.field1181 = new Pix32(var10, "mapdots", 3);
                    this.field1451 = new Pix8(var10, "scrollbar", 0);
                    this.field1452 = new Pix8(var10, "scrollbar", 1);
                    this.field1291 = new Pix8(var10, "redstone1", 0);
                    this.field1292 = new Pix8(var10, "redstone2", 0);
                    this.field1293 = new Pix8(var10, "redstone3", 0);
                    this.field1294 = new Pix8(var10, "redstone1", 0);
                    this.field1294.method186(0);
                    this.field1295 = new Pix8(var10, "redstone2", 0);
                    this.field1295.method186(0);
                    this.field1342 = new Pix8(var10, "redstone1", 0);
                    this.field1342.method187(0);
                    this.field1343 = new Pix8(var10, "redstone2", 0);
                    this.field1343.method187(0);
                    this.field1344 = new Pix8(var10, "redstone3", 0);
                    this.field1344.method187(0);
                    this.field1345 = new Pix8(var10, "redstone1", 0);
                    this.field1345.method186(0);
                    this.field1345.method187(0);
                    this.field1346 = new Pix8(var10, "redstone2", 0);
                    this.field1346.method186(0);
                    this.field1346.method187(0);
                    Pix32 var22 = new Pix32(var10, "backleft1", 0);
                    this.field1095 = new PixMap(var22.field589, var22.field588, field1259, this.method11((byte) -66));
                    var22.method173(0, 0, 0);
                    Pix32 var23 = new Pix32(var10, "backleft2", 0);
                    this.field1096 = new PixMap(var23.field589, var23.field588, field1259, this.method11((byte) -66));
                    var23.method173(0, 0, 0);
                    Pix32 var24 = new Pix32(var10, "backright1", 0);
                    this.field1097 = new PixMap(var24.field589, var24.field588, field1259, this.method11((byte) -66));
                    var24.method173(0, 0, 0);
                    Pix32 var25 = new Pix32(var10, "backright2", 0);
                    this.field1098 = new PixMap(var25.field589, var25.field588, field1259, this.method11((byte) -66));
                    var25.method173(0, 0, 0);
                    Pix32 var26 = new Pix32(var10, "backtop1", 0);
                    this.field1099 = new PixMap(var26.field589, var26.field588, field1259, this.method11((byte) -66));
                    var26.method173(0, 0, 0);
                    Pix32 var27 = new Pix32(var10, "backtop2", 0);
                    this.field1100 = new PixMap(var27.field589, var27.field588, field1259, this.method11((byte) -66));
                    var27.method173(0, 0, 0);
                    Pix32 var28 = new Pix32(var10, "backvmid1", 0);
                    this.field1101 = new PixMap(var28.field589, var28.field588, field1259, this.method11((byte) -66));
                    var28.method173(0, 0, 0);
                    Pix32 var29 = new Pix32(var10, "backvmid2", 0);
                    this.field1102 = new PixMap(var29.field589, var29.field588, field1259, this.method11((byte) -66));
                    var29.method173(0, 0, 0);
                    Pix32 var30 = new Pix32(var10, "backvmid3", 0);
                    this.field1103 = new PixMap(var30.field589, var30.field588, field1259, this.method11((byte) -66));
                    var30.method173(0, 0, 0);
                    Pix32 var31 = new Pix32(var10, "backhmid2", 0);
                    this.field1104 = new PixMap(var31.field589, var31.field588, field1259, this.method11((byte) -66));
                    var31.method173(0, 0, 0);
                    int var32 = (int) (Math.random() * 21.0D) - 10;
                    int var33 = (int) (Math.random() * 21.0D) - 10;
                    int var34 = (int) (Math.random() * 21.0D) - 10;
                    int var35 = (int) (Math.random() * 41.0D) - 20;
                    for (int var36 = 0; var36 < 50; ++var36) {
                        if (this.field1289[var36] != null) {
                            this.field1289[var36].method172(var34 + var35, var33 + var35, 9, var32 + var35);
                        }
                        if (this.field1083[var36] != null) {
                            this.field1083[var36].method188(var34 + var35, var33 + var35, 9, var32 + var35);
                        }
                    }
                    this.method13("Unpacking textures", 80, -745);
                    Pix3D.method159(field1349, var12);
                    Pix3D.method163(-37756, 0.8D);
                    Pix3D.method158(20, (byte) 8);
                    this.method13("Unpacking models", 83, -745);
                    Model.method122(var11, 87);
                    AnimBase.method48(var11, true);
                    AnimFrame.method49(var11, true);
                    this.method13("Unpacking config", 86, -745);
                    SeqType.method326(-5880, var8);
                    LocType.method280(var8);
                    FloType.method314(-5880, var8);
                    ObjType.method292(var8);
                    NpcType.method286(var8);
                    IdkType.method318(-5880, var8);
                    SpotAnimType.method328(-5880, var8);
                    VarpType.method331(-5880, var8);
                    ObjType.field875 = field1264;
                    if (!field1265) {
                        this.method13("Unpacking sounds", 90, -745);
                        byte[] var37 = var14.method257((byte[]) null, "sounds.dat", -31149);
                        Packet var38 = new Packet((byte) 64, var37);
                        Wave.method270(-5880, var38);
                    }
                    this.method13("Unpacking interfaces", 92, -745);
                    PixFont[] var39 = new PixFont[] { this.field1272, this.field1273, this.field1274, this.field1275 };
                    Component.method322(true, var10, var9, var39);
                    this.method13("Preparing game engine", 97, -745);
                    for (int var40 = 0; var40 < 33; ++var40) {
                        int var41 = 999;
                        int var42 = 0;
                        for (int var43 = 0; var43 < 35; ++var43) {
                            if (this.field1380.field597[this.field1380.field599 * var40 + var43] == 0) {
                                if (var41 == 999) {
                                    var41 = var43;
                                }
                            } else if (var41 != 999) {
                                var42 = var43;
                                break;
                            }
                        }
                        this.field1420[var40] = var41;
                        this.field1501[var40] = var42 - var41;
                    }
                    for (int var44 = 9; var44 < 160; ++var44) {
                        int var45 = 999;
                        int var46 = 0;
                        for (int var47 = 10; var47 < 168; ++var47) {
                            if (this.field1380.field597[this.field1380.field599 * var44 + var47] == 0 && (var47 > 34 || var44 > 34)) {
                                if (var45 == 999) {
                                    var45 = var47;
                                }
                            } else if (var45 != 999) {
                                var46 = var47;
                                break;
                            }
                        }
                        this.field1477[var44 - 9] = var45 - 21;
                        this.field1177[var44 - 9] = var46 - var45;
                    }
                    Pix3D.method156(479, (byte) 7, 96);
                    this.field1506 = Pix3D.field571;
                    Pix3D.method156(190, (byte) 7, 261);
                    this.field1507 = Pix3D.field571;
                    Pix3D.method156(512, (byte) 7, 334);
                    this.field1508 = Pix3D.field571;
                    int[] var48 = new int[9];
                    for (int var49 = 0; var49 < 9; ++var49) {
                        int var50 = var49 * 32 + 128 + 15;
                        int var51 = var50 * 3 + 600;
                        int var52 = Pix3D.field569[var50];
                        var48[var49] = var51 * var52 >> 16;
                    }
                    World3D.method88(512, 334, -285, 500, var48, 800);
                    WordFilter.method333(var13);
                } catch (Exception var60) {
                    this.field1230 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    public final void method402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        while (arg1 >= 0) {
            this.field1425.method206(245);
        }
        if (arg7 >= 1 && arg0 >= 1 && arg7 <= 102 && arg0 <= 102) {
            if (field1265 && this.field1221 != arg6) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg2 == 0) {
                var9 = this.field1322.method78(arg6, arg7, arg0);
            }
            if (arg2 == 1) {
                var9 = this.field1322.method79(false, arg7, arg6, arg0);
            }
            if (arg2 == 2) {
                var9 = this.field1322.method80(arg6, arg7, arg0);
            }
            if (arg2 == 3) {
                var9 = this.field1322.method81(arg6, arg7, arg0);
            }
            if (var9 != 0) {
                int var13 = this.field1322.method82(arg6, arg7, arg0, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg2 == 0) {
                    this.field1322.method73(arg7, arg6, arg0, this.field1290);
                    LocType var17 = LocType.method282(var14);
                    if (var17.field813) {
                        this.field1499[arg6].method307(arg7, var15, 0, arg0, var17.field814, var16);
                    }
                }
                if (arg2 == 1) {
                    this.field1322.method74(290, arg0, arg7, arg6);
                }
                if (arg2 == 2) {
                    this.field1322.method75(arg6, 0, arg0, arg7);
                    LocType var18 = LocType.method282(var14);
                    if (var18.field811 + arg7 > 103 || var18.field811 + arg0 > 103 || var18.field812 + arg7 > 103 || var18.field812 + arg0 > 103) {
                        return;
                    }
                    if (var18.field813) {
                        this.field1499[arg6].method308(var16, var18.field814, arg7, (byte) 45, arg0, var18.field811, var18.field812);
                    }
                }
                if (arg2 == 3) {
                    this.field1322.method76(-7834, arg0, arg6, arg7);
                    LocType var19 = LocType.method282(var14);
                    if (var19.field813 && var19.field815) {
                        this.field1499[arg6].method310(arg0, arg7, -5686);
                    }
                }
            }
            if (arg3 >= 0) {
                int var20 = arg6;
                if (arg6 < 3 && (this.field1350[1][arg7][arg0] & 2) == 2) {
                    var20 = arg6 + 1;
                }
                World.method28(arg6, arg4, arg7, 0, arg5, var20, arg0, this.field1499[arg6], this.field1322, arg3, this.field1502, this.field1140);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)V")
    public final void method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1451.method189(arg2, -462, arg5);
        this.field1452.method189(arg2 + arg3 - 16, -462, arg5);
        Pix2D.method150(arg2 + 16, 16, 8, arg5, arg3 - 32, this.field1252);
        int var7 = (arg3 - 32) * arg3 / arg1;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg3 - 32 - var7) * arg4 / (arg1 - arg3);
        if (arg0 >= 0) {
            this.field1481 = !this.field1481;
        }
        Pix2D.method150(arg2 + 16 + var8, 16, 8, arg5, var7, this.field1505);
        Pix2D.method153(var7, arg2 + 16 + var8, 0, arg5, this.field1304);
        Pix2D.method153(var7, arg2 + 16 + var8, 0, arg5 + 1, this.field1304);
        Pix2D.method152(arg2 + 16 + var8, this.field1304, 16, arg5, this.field1247);
        Pix2D.method152(arg2 + 17 + var8, this.field1304, 16, arg5, this.field1247);
        Pix2D.method153(var7, arg2 + 16 + var8, 0, arg5 + 15, this.field1258);
        Pix2D.method153(var7 - 1, arg2 + 17 + var8, 0, arg5 + 14, this.field1258);
        Pix2D.method152(arg2 + 15 + var8 + var7, this.field1258, 16, arg5, this.field1247);
        Pix2D.method152(arg2 + 14 + var8 + var7, this.field1258, 15, arg5 + 1, this.field1247);
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method404(int arg0, int arg1) {
        int[] var3 = this.field1480.field587;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field1350[arg0][var24][var6] & 24) == 0) {
                    this.field1322.method87(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field1350[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field1322.method87(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1089 += arg1;
        this.field1480.method171(false);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field1350[arg0][var22][var9] & 24) == 0) {
                    this.method388(var9, var22, var7, 14108, arg0, var8);
                }
                if (arg0 < 3 && (this.field1350[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method388(var9, var22, var7, 14108, arg0 + 1, var8);
                }
            }
        }
        this.field1385.method242(false);
        this.field1473 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field1322.method81(this.field1221, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = LocType.method282(var13).field825;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field1499[this.field1221].field925;
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
                        this.field1397[this.field1473] = this.field1289[var14];
                        this.field1474[this.field1473] = var15;
                        this.field1475[this.field1473] = var16;
                        ++this.field1473;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method9(boolean arg0) {
        if (!this.field1476 && !this.field1230 && !this.field1200) {
            if (!this.field1169) {
                this.method389(884);
            } else {
                this.method455((byte) -58);
            }
            this.field1359 = 0;
            if (!arg0) {
                ;
            }
        } else {
            this.method378(-575);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBIIII)V")
    public final void method405(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg6 & 2047;
        int var9 = 2048 - arg3 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg0;
        if (var8 != 0) {
            int var13 = Model.field534[var8];
            int var14 = Model.field535[var8];
            int var15 = var11 * var14 - arg0 * var13 >> 16;
            var12 = var11 * var13 + arg0 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field534[var9];
            int var17 = Model.field535[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1299 = arg1 - var10;
        this.field1300 = arg4 - var11;
        this.field1301 = arg5 - var12;
        this.field1302 = arg6;
        if (arg2 != 25) {
            this.field1188 = this.field1363.method253();
        }
        this.field1303 = arg3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BII)V")
    public final void method406(byte arg0, int arg1, int arg2) {
        if (this.field1395 != 0) {
            int var4 = 0;
            if (this.field1421 != 0) {
                var4 = 1;
            }
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field1269[var5] != null) {
                    int var6 = this.field1267[var5];
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field1106 == 0 || this.field1106 == 1 && this.method470(this.field1268[var5], 0))) {
                        int var7 = 329 - var4 * 13;
                        if (super.field22 > 8 && super.field22 < 520 && arg1 - 11 > var7 - 10 && arg1 - 11 <= var7 + 3) {
                            if (this.field1433) {
                                this.field1196[this.field1167] = "Report abuse @whi@" + this.field1268[var5];
                                this.field1446[this.field1167] = 2034;
                                ++this.field1167;
                            }
                            this.field1196[this.field1167] = "Add ignore @whi@" + this.field1268[var5];
                            this.field1446[this.field1167] = 2436;
                            ++this.field1167;
                            this.field1196[this.field1167] = "Add friend @whi@" + this.field1268[var5];
                            this.field1446[this.field1167] = 2406;
                            ++this.field1167;
                        }
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                    if ((var6 == 5 || var6 == 6) && this.field1106 < 2) {
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg0 == 5) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method407(int arg0, int arg1) {
        if (arg0 < 8 || arg0 > 8) {
            this.field1168 = this.field1363.method253();
        }
        if (!field1265) {
            if (Pix3D.field579[17] >= arg1) {
                Pix8 var3 = Pix3D.field573[17];
                int var4 = var3.field600 * var3.field599 - 1;
                int var5 = this.field1456 * var3.field599 * 2;
                byte[] var6 = var3.field597;
                byte[] var7 = this.field1211;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field597 = var7;
                this.field1211 = var6;
                Pix3D.method161(true, 17);
            }
            if (Pix3D.field579[24] >= arg1) {
                Pix8 var9 = Pix3D.field573[24];
                int var10 = var9.field600 * var9.field599 - 1;
                int var11 = this.field1456 * var9.field599 * 2;
                byte[] var12 = var9.field597;
                byte[] var13 = this.field1211;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field597 = var13;
                this.field1211 = var12;
                Pix3D.method161(true, 24);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)Ljava/lang/String;")
    private static final String method408(int arg0, byte arg1) {
        if (arg1 != -75) {
            throw new NullPointerException();
        } else if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method409(int arg0) {
        int var2 = this.field1158;
        int var3 = this.field1159;
        int var4 = this.field1160;
        int var5 = this.field1161;
        int var6 = 6116423;
        Pix2D.method150(var3, var4, 8, var2, var5, var6);
        Pix2D.method150(var3 + 1, var4 - 2, 8, var2 + 1, 16, 0);
        Pix2D.method151(var4 - 2, (byte) -103, var5 - 19, var3 + 18, var2 + 1, 0);
        this.field1274.method194(var3 + 14, "Choose Option", var6, var2 + 3, 0);
        int var7 = super.field22;
        int var8 = super.field23;
        if (this.field1157 == 0) {
            var7 -= 8;
            var8 -= 11;
        }
        if (this.field1157 == 1) {
            var7 -= 562;
            var8 -= 231;
        }
        if (this.field1157 == 2) {
            var7 -= 22;
            var8 -= 375;
        }
        for (int var9 = 0; var9 < this.field1167; ++var9) {
            int var10 = (this.field1167 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field1274.method196(var10, 0, var2 + 3, true, var11, this.field1196[var9]);
        }
        if (arg0 < 7 || arg0 > 7) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method410(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1250[(var2 - 2 << 7) + var3] = 255;
            }
        }
        if (arg0 == 8) {
            for (int var4 = 0; var4 < 100; ++var4) {
                int var15 = (int) (Math.random() * 124.0D) + 2;
                int var16 = (int) (Math.random() * 128.0D) + 128;
                int var17 = (var16 << 7) + var15;
                this.field1250[var17] = 192;
            }
            for (int var5 = 1; var5 < var2 - 1; ++var5) {
                for (int var13 = 1; var13 < 127; ++var13) {
                    int var14 = (var5 << 7) + var13;
                    this.field1251[var14] = (this.field1250[var14 - 1] + this.field1250[var14 + 1] + this.field1250[var14 - 128] + this.field1250[var14 + 128]) / 4;
                }
            }
            this.field1082 += 128;
            if (this.field1082 > this.field1414.length) {
                this.field1082 -= this.field1414.length;
                int var6 = (int) (Math.random() * 12.0D);
                this.method399(this.field1441[var6], 888);
            }
            for (int var7 = 1; var7 < var2 - 1; ++var7) {
                for (int var10 = 1; var10 < 127; ++var10) {
                    int var11 = (var7 << 7) + var10;
                    int var12 = this.field1251[var11 + 128] - this.field1414[this.field1082 + var11 & this.field1414.length - 1] / 5;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    this.field1250[var11] = var12;
                }
            }
            for (int var8 = 0; var8 < var2 - 1; ++var8) {
                this.field1209[var8] = this.field1209[var8 + 1];
            }
            this.field1209[var2 - 1] = (int) (Math.sin((double) field1356 / 14.0D) * 16.0D + Math.sin((double) field1356 / 15.0D) * 14.0D + Math.sin((double) field1356 / 16.0D) * 12.0D);
            if (this.field1084 > 0) {
                this.field1084 -= 4;
            }
            if (this.field1085 > 0) {
                this.field1085 -= 4;
            }
            if (this.field1084 == 0 && this.field1085 == 0) {
                int var9 = (int) (Math.random() * 2000.0D);
                if (var9 == 0) {
                    this.field1084 = 1024;
                }
                if (var9 == 1) {
                    this.field1085 = 1024;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method411(int arg0) {
        int var2 = this.field1453.field308 + this.field1320;
        int var3 = this.field1453.field309 + this.field1435;
        if (this.field1154 - var2 < -500 || this.field1154 - var2 > 500 || this.field1155 - var3 < -500 || this.field1155 - var3 > 500) {
            this.field1154 = var2;
            this.field1155 = var3;
        }
        if (this.field1154 != var2) {
            this.field1154 += (var2 - this.field1154) / 16;
        }
        if (this.field1155 != var3) {
            this.field1155 += (var3 - this.field1155) / 16;
        }
        if (super.field27[1] == 1) {
            this.field1331 += (-24 - this.field1331) / 2;
        } else if (super.field27[2] == 1) {
            this.field1331 += (24 - this.field1331) / 2;
        } else {
            this.field1331 /= 2;
        }
        if (super.field27[3] == 1) {
            this.field1332 += (12 - this.field1332) / 2;
        } else if (super.field27[4] == 1) {
            this.field1332 += (-12 - this.field1332) / 2;
        } else {
            this.field1332 /= 2;
        }
        this.field1330 = this.field1331 / 2 + this.field1330 & 2047;
        this.field1329 += this.field1332 / 2;
        if (this.field1329 < 128) {
            this.field1329 = 128;
        }
        if (this.field1329 > 383) {
            this.field1329 = 383;
        }
        int var4 = this.field1154 >> 7;
        int var5 = this.field1155 >> 7;
        if (arg0 != -7753) {
            this.field1090 = this.field1432.method216();
        }
        int var6 = this.method495(this.field1155, false, this.field1221, this.field1154);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    int var10 = this.field1221;
                    if (var10 < 3 && (this.field1350[1][var8][var9] & 2) == 2) {
                        ++var10;
                    }
                    int var11 = var6 - this.field1140[var10][var8][var9];
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
        if (var12 > this.field1312) {
            this.field1312 += (var12 - this.field1312) / 24;
        } else if (var12 < this.field1312) {
            this.field1312 += (var12 - this.field1312) / 80;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIILbc;)V")
    public final void method412(int arg0, boolean arg1, int arg2, int arg3, NpcType arg4) {
        if (arg1) {
            this.method6();
        }
        if (this.field1167 < 400) {
            String var6 = arg4.field847;
            if (arg4.field865 != 0) {
                var6 = var6 + method462(-653, this.field1453.field373, arg4.field865) + " (level-" + arg4.field865 + ")";
            }
            if (this.field1398 == 1) {
                this.field1196[this.field1167] = "Use " + this.field1402 + " with @yel@" + var6;
                this.field1446[this.field1167] = 900;
                this.field1447[this.field1167] = arg2;
                this.field1444[this.field1167] = arg3;
                this.field1445[this.field1167] = arg0;
                ++this.field1167;
            } else {
                if (this.field1118 == 1) {
                    if ((this.field1120 & 2) == 2) {
                        this.field1196[this.field1167] = this.field1121 + " @yel@" + var6;
                        this.field1446[this.field1167] = 265;
                        this.field1447[this.field1167] = arg2;
                        this.field1444[this.field1167] = arg3;
                        this.field1445[this.field1167] = arg0;
                        ++this.field1167;
                        return;
                    }
                } else {
                    if (arg4.field860 != null) {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (arg4.field860[var7] != null && !arg4.field860[var7].equalsIgnoreCase("attack")) {
                                this.field1196[this.field1167] = arg4.field860[var7] + " @yel@" + var6;
                                if (var7 == 0) {
                                    this.field1446[this.field1167] = 728;
                                }
                                if (var7 == 1) {
                                    this.field1446[this.field1167] = 542;
                                }
                                if (var7 == 2) {
                                    this.field1446[this.field1167] = 6;
                                }
                                if (var7 == 3) {
                                    this.field1446[this.field1167] = 963;
                                }
                                if (var7 == 4) {
                                    this.field1446[this.field1167] = 245;
                                }
                                this.field1447[this.field1167] = arg2;
                                this.field1444[this.field1167] = arg3;
                                this.field1445[this.field1167] = arg0;
                                ++this.field1167;
                            }
                        }
                    }
                    if (arg4.field860 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (arg4.field860[var8] != null && arg4.field860[var8].equalsIgnoreCase("attack")) {
                                short var9 = 0;
                                if (arg4.field865 > this.field1453.field373) {
                                    var9 = 2000;
                                }
                                this.field1196[this.field1167] = arg4.field860[var8] + " @yel@" + var6;
                                if (var8 == 0) {
                                    this.field1446[this.field1167] = var9 + 728;
                                }
                                if (var8 == 1) {
                                    this.field1446[this.field1167] = var9 + 542;
                                }
                                if (var8 == 2) {
                                    this.field1446[this.field1167] = var9 + 6;
                                }
                                if (var8 == 3) {
                                    this.field1446[this.field1167] = var9 + 963;
                                }
                                if (var8 == 4) {
                                    this.field1446[this.field1167] = var9 + 245;
                                }
                                this.field1447[this.field1167] = arg2;
                                this.field1444[this.field1167] = arg3;
                                this.field1445[this.field1167] = arg0;
                                ++this.field1167;
                            }
                        }
                    }
                    this.field1196[this.field1167] = "Examine @yel@" + var6;
                    this.field1446[this.field1167] = 1607;
                    this.field1447[this.field1167] = arg2;
                    this.field1444[this.field1167] = arg3;
                    this.field1445[this.field1167] = arg0;
                    ++this.field1167;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method413(boolean arg0) {
        this.field1384.method242(false);
        int var2 = this.field1375 + this.field1330 & 2047;
        int var3 = this.field1453.field308 / 32 + 48;
        int var4 = 464 - this.field1453.field309 / 32;
        this.field1480.method181(var2, var3, 21, var4, -163, this.field1177, this.field1204 + 256, 151, 146, 9, this.field1477);
        this.field1217.method181(this.field1330, 25, 0, 25, -163, this.field1501, 256, 33, 33, 0, this.field1420);
        for (int var5 = 0; var5 < this.field1473; ++var5) {
            int var25 = this.field1474[var5] * 4 + 2 - this.field1453.field308 / 32;
            int var26 = this.field1475[var5] * 4 + 2 - this.field1453.field309 / 32;
            this.method427(this.field1397[var5], var25, -508, var26);
        }
        if (!arg0) {
            for (int var6 = 0; var6 < 104; ++var6) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    LinkList var22 = this.field1418[this.field1221][var6][var21];
                    if (var22 != null) {
                        int var23 = var6 * 4 + 2 - this.field1453.field308 / 32;
                        int var24 = var21 * 4 + 2 - this.field1453.field309 / 32;
                        this.method427(this.field1178, var23, -508, var24);
                    }
                }
            }
            for (int var7 = 0; var7 < this.field1284; ++var7) {
                NpcEntity var18 = this.field1283[this.field1285[var7]];
                if (var18 != null && var18.method112(574) && var18.field361.field864) {
                    int var19 = var18.field308 / 32 - this.field1453.field308 / 32;
                    int var20 = var18.field309 / 32 - this.field1453.field309 / 32;
                    this.method427(this.field1179, var19, -508, var20);
                }
            }
            for (int var8 = 0; var8 < this.field1369; ++var8) {
                PlayerEntity var11 = this.field1368[this.field1370[var8]];
                if (var11 != null && var11.method112(574)) {
                    int var12 = var11.field308 / 32 - this.field1453.field308 / 32;
                    int var13 = var11.field309 / 32 - this.field1453.field309 / 32;
                    boolean var14 = false;
                    long var15 = JString.method258(var11.field367);
                    for (int var17 = 0; var17 < this.field1199; ++var17) {
                        if (this.field1355[var17] == var15 && this.field1412[var17] != 0) {
                            var14 = true;
                            break;
                        }
                    }
                    if (var14) {
                        this.method427(this.field1181, var12, -508, var13);
                    } else {
                        this.method427(this.field1180, var12, -508, var13);
                    }
                }
            }
            if (this.field1478 != 0) {
                int var9 = this.field1478 * 4 + 2 - this.field1453.field308 / 32;
                int var10 = this.field1479 * 4 + 2 - this.field1453.field309 / 32;
                this.method427(this.field1310, var9, -508, var10);
            }
            Pix2D.method150(82, 3, 8, 93, 3, 16777215);
            this.field1385.method242(false);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)Z")
    public final boolean method414(boolean arg0) {
        if (!arg0) {
            this.method6();
        }
        if (this.field1437 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1437.method31();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1090 == -1) {
                    this.field1437.method32(this.field1432.field623, 0, 1);
                    this.field1090 = this.field1432.field623[0] & 255;
                    if (this.field1363 != null) {
                        this.field1090 = this.field1090 - this.field1363.method253() & 255;
                    }
                    this.field1089 = Protocol.field914[this.field1090];
                    --var2;
                }
                if (this.field1089 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1437.method32(this.field1432.field623, 0, 1);
                    this.field1089 = this.field1432.field623[0] & 255;
                    --var2;
                }
                if (this.field1089 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1437.method32(this.field1432.field623, 0, 2);
                    this.field1432.field624 = 0;
                    this.field1089 = this.field1432.method218();
                    var2 -= 2;
                }
                if (var2 < this.field1089) {
                    return false;
                }
                this.field1432.field624 = 0;
                this.field1437.method32(this.field1432.field623, 0, this.field1089);
                this.field1091 = 0;
                this.field1354 = this.field1353;
                this.field1353 = this.field1352;
                this.field1352 = this.field1090;
                if (this.field1090 == 1) {
                    this.method437(this.field1422, this.field1089, this.field1432);
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 195) {
                    int var3 = this.field1432.method218();
                    this.method391(var3, 0);
                    if (this.field1182 != -1) {
                        this.field1182 = -1;
                        this.field1171 = true;
                    }
                    if (this.field1113) {
                        this.field1113 = false;
                        this.field1171 = true;
                    }
                    this.field1462 = var3;
                    this.field1094 = true;
                    this.field1365 = true;
                    this.field1112 = -1;
                    this.field1459 = false;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 103) {
                    int var4 = this.field1432.method218();
                    int var5 = this.field1432.method218();
                    int var6 = this.field1432.method218();
                    Component var7 = Component.field951[var4];
                    Model var8 = var7.field997;
                    if (var8 != null) {
                        var8.method134(var5, var6);
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 151 || this.field1090 == 23 || this.field1090 == 50 || this.field1090 == 191 || this.field1090 == 69 || this.field1090 == 49 || this.field1090 == 223 || this.field1090 == 42 || this.field1090 == 76 || this.field1090 == 59) {
                    this.method496(this.field1432, 0, this.field1090);
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 197) {
                    int var9 = this.field1432.method218();
                    Component.field951[var9].field997 = this.field1453.method116(this.field1308);
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 87) {
                    int var10 = this.field1432.method218();
                    int var11 = this.field1432.method218();
                    Component.field951[var10].field997 = new Model(var11, (byte) 1);
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 41) {
                    long var12 = this.field1432.method222((byte) 2);
                    int var14 = this.field1432.method221();
                    int var15 = this.field1432.method216();
                    boolean var16 = false;
                    for (int var17 = 0; var17 < 100; ++var17) {
                        if (this.field1228[var17] == var14) {
                            var16 = true;
                            break;
                        }
                    }
                    if (var15 <= 1) {
                        for (int var18 = 0; var18 < this.field1307; ++var18) {
                            if (this.field1249[var18] == var12) {
                                var16 = true;
                                break;
                            }
                        }
                    }
                    if (!var16 && this.field1164 == 0) {
                        try {
                            this.field1228[this.field1128] = var14;
                            this.field1128 = (this.field1128 + 1) % 100;
                            String var19 = WordPack.method265(this.field1432, (byte) 1, this.field1089 - 13);
                            String var20 = WordFilter.method343(var19, 400);
                            if (var15 > 1) {
                                this.method379(var20, this.field1496, JString.method262(0, JString.method259(var12, true)), 7);
                            } else {
                                this.method379(var20, this.field1496, JString.method262(0, JString.method259(var12, true)), 3);
                            }
                        } catch (Exception var182) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 4) {
                    String var22 = this.field1432.method223();
                    if (var22.endsWith(":tradereq:")) {
                        String var23 = var22.substring(0, var22.indexOf(":"));
                        long var24 = JString.method258(var23);
                        boolean var26 = false;
                        for (int var27 = 0; var27 < this.field1307; ++var27) {
                            if (this.field1249[var27] == var24) {
                                var26 = true;
                                break;
                            }
                        }
                        if (!var26 && this.field1164 == 0) {
                            this.method379("wishes to trade with you.", this.field1496, var23, 4);
                        }
                    } else if (!var22.endsWith(":duelreq:")) {
                        this.method379(var22, this.field1496, "", 0);
                    } else {
                        String var28 = var22.substring(0, var22.indexOf(":"));
                        long var29 = JString.method258(var28);
                        boolean var31 = false;
                        for (int var32 = 0; var32 < this.field1307; ++var32) {
                            if (this.field1249[var32] == var29) {
                                var31 = true;
                                break;
                            }
                        }
                        if (!var31 && this.field1164 == 0) {
                            this.method379("wishes to duel with you.", this.field1496, var28, 8);
                        }
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 28) {
                    int var33 = this.field1432.method218();
                    int var34 = this.field1432.method218();
                    if (this.field1182 != -1) {
                        this.field1182 = -1;
                        this.field1171 = true;
                    }
                    if (this.field1113) {
                        this.field1113 = false;
                        this.field1171 = true;
                    }
                    this.field1112 = var33;
                    this.field1462 = var34;
                    this.field1094 = true;
                    this.field1365 = true;
                    this.field1459 = false;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 3) {
                    this.field1238 = true;
                    this.field1466 = this.field1432.method216();
                    this.field1467 = this.field1432.method216();
                    this.field1468 = this.field1432.method218();
                    this.field1469 = this.field1432.method216();
                    this.field1470 = this.field1432.method216();
                    if (this.field1470 >= 100) {
                        this.field1299 = this.field1466 * 128 + 64;
                        this.field1301 = this.field1467 * 128 + 64;
                        this.field1300 = this.method495(this.field1467, false, this.field1221, this.field1466) - this.field1468;
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 226) {
                    InputTracking.method34(-42259);
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 7) {
                    this.field1286 = this.field1432.method216();
                    this.field1287 = this.field1432.method216();
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 129) {
                    if (this.field1462 != -1) {
                        this.field1462 = -1;
                        this.field1094 = true;
                        this.field1365 = true;
                    }
                    if (this.field1182 != -1) {
                        this.field1182 = -1;
                        this.field1171 = true;
                    }
                    if (this.field1113) {
                        this.field1113 = false;
                        this.field1171 = true;
                    }
                    this.field1112 = -1;
                    this.field1459 = false;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 20) {
                    int var35 = this.field1432.method216();
                    int var36 = this.field1432.method216();
                    int var37 = -1;
                    for (int var38 = 0; var38 < this.field1210.length; ++var38) {
                        if ((var35 << 8) + var36 == this.field1210[var38]) {
                            var37 = var38;
                        }
                    }
                    if (var37 != -1) {
                        signlink.cachesave("l" + var35 + "_" + var36, this.field1270[var37]);
                        this.field1212 = 1;
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 44) {
                    this.field1094 = true;
                    int var39 = this.field1432.method216();
                    int var40 = this.field1432.method221();
                    int var41 = this.field1432.method216();
                    this.field1396[var39] = var40;
                    this.field1334[var39] = var41;
                    this.field1105[var39] = 1;
                    for (int var42 = 0; var42 < 98; ++var42) {
                        if (var40 >= field1185[var42]) {
                            this.field1105[var39] = var42 + 2;
                        }
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 212) {
                    if (this.field1246 && !field1265) {
                        int var43 = this.field1432.method218();
                        int var44 = this.field1432.method221();
                        int var45 = this.field1089 - 6;
                        byte[] var46 = new byte[var44];
                        BZip2.method245(var46, var44, this.field1432.field623, var45, this.field1432.field624);
                        this.method392(var46, false, false, var44);
                        this.field1107 = var43;
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 126) {
                    this.field1450 = this.field1432.method216();
                    if (this.field1450 == this.field1241) {
                        if (this.field1450 == 3) {
                            this.field1241 = 1;
                        } else {
                            this.field1241 = 3;
                        }
                        this.field1094 = true;
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 243) {
                    this.field1333 = false;
                    this.field1113 = true;
                    this.field1126 = "";
                    this.field1171 = true;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 46) {
                    int var47 = this.field1432.method218();
                    int var48 = this.field1432.method218();
                    int var49 = this.field1432.method218();
                    ObjType var50 = ObjType.method294(var48);
                    Component.field951[var47].field997 = var50.method298(50);
                    Component.field951[var47].field1002 = var50.field883;
                    Component.field951[var47].field1003 = var50.field884;
                    Component.field951[var47].field1001 = var50.field882 * 100 / var49;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 136) {
                    for (int var51 = 0; var51 < this.field1368.length; ++var51) {
                        if (this.field1368[var51] != null) {
                            this.field1368[var51].field335 = -1;
                        }
                    }
                    for (int var52 = 0; var52 < this.field1283.length; ++var52) {
                        if (this.field1283[var52] != null) {
                            this.field1283[var52].field335 = -1;
                        }
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 26) {
                    int var53 = this.field1432.method218();
                    boolean var54 = this.field1432.method216() == 1;
                    Component.field951[var53].field971 = var54;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 167) {
                    int var55 = this.field1432.method218();
                    int var56 = this.field1432.method216();
                    if (var55 == 65535) {
                        var55 = -1;
                    }
                    this.field1110[var56] = var55;
                    this.field1094 = true;
                    this.field1365 = true;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 13) {
                    int var57 = this.field1432.method216();
                    int var58 = this.field1432.method216();
                    int var59 = this.field1432.method216();
                    int var60 = this.field1432.method216();
                    this.field1464[var57] = true;
                    this.field1413[var57] = var58;
                    this.field1417[var57] = var59;
                    this.field1198[var57] = var60;
                    this.field1170[var57] = 0;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 209) {
                    int var61 = this.field1432.method218();
                    int var62 = this.field1432.method219();
                    int var63 = this.field1432.method219();
                    Component var64 = Component.field951[var61];
                    var64.field963 = var62;
                    var64.field964 = var63;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 162) {
                    this.field1286 = this.field1432.method216();
                    this.field1287 = this.field1432.method216();
                    while (this.field1432.field624 < this.field1089) {
                        int var65 = this.field1432.method216();
                        this.method496(this.field1432, 0, var65);
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 204) {
                    int var66 = this.field1432.method218();
                    int var67 = this.field1432.method218();
                    NpcType var68 = NpcType.method288(var67);
                    Component.field951[var66].field997 = var68.method291(-284);
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 2) {
                    int var69 = this.field1432.method218();
                    int var70 = this.field1432.method218();
                    int var71 = var70 >> 10 & 31;
                    int var72 = var70 >> 5 & 31;
                    int var73 = var70 & 31;
                    Component.field951[var69].field992 = (var73 << 3) + (var71 << 19) + (var72 << 11);
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 12) {
                    int var74 = this.field1432.method218();
                    int var75 = this.field1432.method216();
                    int var76 = this.field1432.method218();
                    if (this.field1162 && !field1265 && this.field1191 < 50) {
                        this.field1407[this.field1191] = var74;
                        this.field1223[this.field1191] = var75;
                        this.field1226[this.field1191] = Wave.field765[var74] + var76;
                        ++this.field1191;
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 43) {
                    this.field1421 = this.field1432.method218() * 30;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 239) {
                    this.field1238 = false;
                    for (int var77 = 0; var77 < 5; ++var77) {
                        this.field1464[var77] = false;
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 150) {
                    int var78 = this.field1432.method218();
                    byte var79 = this.field1432.method217();
                    this.field1166[var78] = var79;
                    if (this.field1305[var78] != var79) {
                        this.field1305[var78] = var79;
                        this.method441(var78, (byte) 64);
                        this.field1094 = true;
                        if (this.field1471 != -1) {
                            this.field1171 = true;
                        }
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 84) {
                    this.field1241 = this.field1432.method216();
                    this.field1094 = true;
                    this.field1365 = true;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 213) {
                    this.field1094 = true;
                    int var80 = this.field1432.method218();
                    Component var81 = Component.field951[var80];
                    while (this.field1432.field624 < this.field1089) {
                        int var82 = this.field1432.method216();
                        int var83 = this.field1432.method218();
                        int var84 = this.field1432.method216();
                        if (var84 == 255) {
                            var84 = this.field1432.method221();
                        }
                        if (var82 >= 0 && var82 < var81.field952.length) {
                            var81.field952[var82] = var83;
                            var81.field953[var82] = var84;
                        }
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 54) {
                    String var85 = this.field1432.method223();
                    int var86 = this.field1432.method221();
                    int var87 = this.field1432.method221();
                    if (!var85.equals(this.field1163) && this.field1246 && !field1265) {
                        this.method485(var85, var87, var86, -242);
                    }
                    this.field1163 = var85;
                    this.field1392 = var86;
                    this.field1323 = var87;
                    this.field1107 = 0;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 98) {
                    this.field1094 = true;
                    int var88 = this.field1432.method218();
                    Component var89 = Component.field951[var88];
                    int var90 = this.field1432.method216();
                    for (int var91 = 0; var91 < var90; ++var91) {
                        var89.field952[var91] = this.field1432.method218();
                        int var92 = this.field1432.method216();
                        if (var92 == 255) {
                            var92 = this.field1432.method221();
                        }
                        var89.field953[var91] = var92;
                    }
                    for (int var93 = var90; var93 < var89.field952.length; ++var93) {
                        var89.field952[var93] = 0;
                        var89.field953[var93] = 0;
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 139) {
                    this.field1282 = this.field1432.method218();
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 193) {
                    for (int var94 = 0; var94 < this.field1305.length; ++var94) {
                        if (this.field1305[var94] != this.field1166[var94]) {
                            this.field1305[var94] = this.field1166[var94];
                            this.method441(var94, (byte) 64);
                            this.field1094 = true;
                        }
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 15) {
                    int var95 = this.field1432.method218();
                    Component var96 = Component.field951[var95];
                    for (int var97 = 0; var97 < var96.field952.length; ++var97) {
                        var96.field952[var97] = -1;
                        var96.field952[var97] = 0;
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 135) {
                    this.field1286 = this.field1432.method216();
                    this.field1287 = this.field1432.method216();
                    for (int var98 = this.field1286; var98 < this.field1286 + 8; ++var98) {
                        for (int var99 = this.field1287; var99 < this.field1287 + 8; ++var99) {
                            if (this.field1418[this.field1221][var98][var99] != null) {
                                this.field1418[this.field1221][var98][var99] = null;
                                this.method430(var98, var99);
                            }
                        }
                    }
                    for (LocMerged var100 = (LocMerged) this.field1361.method235(); var100 != null; var100 = (LocMerged) this.field1361.method237(-754)) {
                        if (var100.field638 >= this.field1286 && var100.field638 < this.field1286 + 8 && var100.field639 >= this.field1287 && var100.field639 < this.field1287 + 8 && this.field1221 == var100.field636) {
                            this.method402(var100.field639, this.field1168, var100.field637, var100.field643, var100.field645, var100.field644, var100.field636, var100.field638);
                            var100.method108();
                        }
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 184) {
                    this.method489(this.field1432, this.field1089, this.field1288);
                    if (this.field1212 == 1) {
                        this.field1212 = 2;
                        World.field37 = this.field1221;
                        this.method474((byte) 0);
                    }
                    if (field1265 && this.field1212 == 2 && World.field37 != this.field1221) {
                        this.field1385.method242(false);
                        this.field1273.method191(-83, 257, 151, "Loading - please wait.", 0);
                        this.field1273.method191(-83, 256, 150, "Loading - please wait.", 16777215);
                        this.field1385.method243(super.field15, 11, 2, 8);
                        World.field37 = this.field1221;
                        this.method474((byte) 0);
                    }
                    if (this.field1358 != this.field1221 && this.field1212 == 2) {
                        this.field1358 = this.field1221;
                        this.method404(this.field1221, 0);
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 68) {
                    if (this.field1241 == 12) {
                        this.field1094 = true;
                    }
                    this.field1142 = this.field1432.method216();
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 80) {
                    int var101 = this.field1432.method216();
                    int var102 = this.field1432.method216();
                    int var103 = -1;
                    for (int var104 = 0; var104 < this.field1210.length; ++var104) {
                        if ((var101 << 8) + var102 == this.field1210[var104]) {
                            var103 = var104;
                        }
                    }
                    if (var103 != -1) {
                        signlink.cachesave("m" + var101 + "_" + var102, this.field1357[var103]);
                        this.field1212 = 1;
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 133) {
                    Packet var105 = InputTracking.method37((byte) 29);
                    if (var105 != null) {
                        this.field1425.method205(false, 81);
                        this.field1425.method207(var105.field624);
                        this.field1425.method214((byte) -41, var105.field623, var105.field624, 0);
                        var105.method204(true);
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 254) {
                    this.field1443 = this.field1432.method216();
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 32) {
                    this.field1504 = this.field1432.method216();
                    this.field1106 = this.field1432.method216();
                    this.field1240 = this.field1432.method216();
                    this.field1406 = true;
                    this.field1171 = true;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 220) {
                    int var106 = this.field1432.method216();
                    int var107 = this.field1432.method216();
                    int var108 = this.field1432.method218();
                    int var109 = this.field1432.method218();
                    int var110 = -1;
                    for (int var111 = 0; var111 < this.field1210.length; ++var111) {
                        if ((var106 << 8) + var107 == this.field1210[var111]) {
                            var110 = var111;
                        }
                    }
                    if (var110 != -1) {
                        if (this.field1270[var110] == null || this.field1270[var110].length != var109) {
                            this.field1270[var110] = new byte[var109];
                        }
                        this.field1432.method225(this.field1089 - 6, 5, this.field1270[var110], var108);
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 74) {
                    this.field1238 = true;
                    this.field1231 = this.field1432.method216();
                    this.field1232 = this.field1432.method216();
                    this.field1233 = this.field1432.method218();
                    this.field1234 = this.field1432.method216();
                    this.field1235 = this.field1432.method216();
                    if (this.field1235 >= 100) {
                        int var112 = this.field1231 * 128 + 64;
                        int var113 = this.field1232 * 128 + 64;
                        int var114 = this.method495(this.field1232, false, this.field1221, this.field1231) - this.field1233;
                        int var115 = var112 - this.field1299;
                        int var116 = var114 - this.field1300;
                        int var117 = var113 - this.field1301;
                        int var118 = (int) Math.sqrt((double) (var115 * var115 + var117 * var117));
                        this.field1302 = (int) (Math.atan2((double) var116, (double) var118) * 325.949D) & 2047;
                        this.field1303 = (int) (Math.atan2((double) var115, (double) var117) * -325.949D) & 2047;
                        if (this.field1302 < 128) {
                            this.field1302 = 128;
                        }
                        if (this.field1302 > 383) {
                            this.field1302 = 383;
                        }
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 142) {
                    this.method420(false);
                    this.field1090 = -1;
                    return false;
                }
                if (this.field1090 == 14) {
                    int var119 = this.field1432.method218();
                    this.method391(var119, 0);
                    if (this.field1462 != -1) {
                        this.field1462 = -1;
                        this.field1094 = true;
                        this.field1365 = true;
                    }
                    this.field1182 = var119;
                    this.field1171 = true;
                    this.field1112 = -1;
                    this.field1459 = false;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 175) {
                    int var120 = this.field1432.method218();
                    int var121 = this.field1432.method221();
                    this.field1166[var120] = var121;
                    if (this.field1305[var120] != var121) {
                        this.field1305[var120] = var121;
                        this.method441(var120, (byte) 64);
                        this.field1094 = true;
                        if (this.field1471 != -1) {
                            this.field1171 = true;
                        }
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 201) {
                    int var122 = this.field1432.method218();
                    String var123 = this.field1432.method223();
                    Component.field951[var122].field990 = var123;
                    if (this.field1110[this.field1241] == Component.field951[var122].field957) {
                        this.field1094 = true;
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 19) {
                    this.field1478 = 0;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 146) {
                    int var124 = this.field1432.method218();
                    int var125 = this.field1432.method218();
                    Component.field951[var124].field999 = var125;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 25) {
                    this.field1261 = this.field1432.method216();
                    if (this.field1261 == 1) {
                        this.field1335 = this.field1432.method218();
                    }
                    if (this.field1261 >= 2 && this.field1261 <= 6) {
                        if (this.field1261 == 2) {
                            this.field1256 = 64;
                            this.field1257 = 64;
                        }
                        if (this.field1261 == 3) {
                            this.field1256 = 0;
                            this.field1257 = 64;
                        }
                        if (this.field1261 == 4) {
                            this.field1256 = 128;
                            this.field1257 = 64;
                        }
                        if (this.field1261 == 5) {
                            this.field1256 = 64;
                            this.field1257 = 0;
                        }
                        if (this.field1261 == 6) {
                            this.field1256 = 64;
                            this.field1257 = 128;
                        }
                        this.field1261 = 2;
                        this.field1253 = this.field1432.method218();
                        this.field1254 = this.field1432.method218();
                        this.field1255 = this.field1432.method216();
                    }
                    if (this.field1261 == 10) {
                        this.field1360 = this.field1432.method218();
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 140) {
                    this.field1153 = this.field1432.method221();
                    this.field1423 = this.field1432.method218();
                    this.field1197 = this.field1432.method216();
                    this.field1319 = this.field1432.method218();
                    if (this.field1153 != 0 && this.field1112 == -1) {
                        signlink.dnslookup(JString.method261(this.field1153, this.field1424));
                        this.method422(this.field1498);
                        short var126 = 650;
                        if (this.field1197 != 201) {
                            var126 = 655;
                        }
                        this.field1277 = "";
                        this.field1203 = false;
                        for (int var127 = 0; var127 < Component.field951.length; ++var127) {
                            if (Component.field951[var127] != null && Component.field951[var127].field960 == var126) {
                                this.field1112 = Component.field951[var127].field957;
                                break;
                            }
                        }
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 132) {
                    int var128 = this.field1432.method216();
                    int var129 = this.field1432.method216();
                    int var130 = this.field1432.method218();
                    int var131 = this.field1432.method218();
                    int var132 = -1;
                    for (int var133 = 0; var133 < this.field1210.length; ++var133) {
                        if ((var128 << 8) + var129 == this.field1210[var133]) {
                            var132 = var133;
                        }
                    }
                    if (var132 != -1) {
                        if (this.field1357[var132] == null || this.field1357[var132].length != var131) {
                            this.field1357[var132] = new byte[var131];
                        }
                        this.field1432.method225(this.field1089 - 6, 5, this.field1357[var132], var130);
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 22) {
                    if (this.field1241 == 12) {
                        this.field1094 = true;
                    }
                    this.field1248 = this.field1432.method219();
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 185) {
                    int var134 = this.field1432.method219();
                    this.field1471 = var134;
                    this.field1171 = true;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 152) {
                    long var135 = this.field1432.method222((byte) 2);
                    int var137 = this.field1432.method216();
                    String var138 = JString.method262(0, JString.method259(var135, true));
                    for (int var139 = 0; var139 < this.field1199; ++var139) {
                        if (this.field1355[var139] == var135) {
                            if (this.field1412[var139] != var137) {
                                this.field1412[var139] = var137;
                                this.field1094 = true;
                                if (var137 > 0) {
                                    this.method379(var138 + " has logged in.", this.field1496, "", 5);
                                }
                                if (var137 == 0) {
                                    this.method379(var138 + " has logged out.", this.field1496, "", 5);
                                }
                            }
                            var138 = null;
                            break;
                        }
                    }
                    if (var138 != null && this.field1199 < 100) {
                        this.field1355[this.field1199] = var135;
                        this.field1206[this.field1199] = var138;
                        this.field1412[this.field1199] = var137;
                        ++this.field1199;
                        this.field1094 = true;
                    }
                    boolean var140 = false;
                    while (!var140) {
                        var140 = true;
                        for (int var141 = 0; var141 < this.field1199 - 1; ++var141) {
                            if (this.field1412[var141] != field1262 && this.field1412[var141 + 1] == field1262 || this.field1412[var141] == 0 && this.field1412[var141 + 1] != 0) {
                                int var142 = this.field1412[var141];
                                this.field1412[var141] = this.field1412[var141 + 1];
                                this.field1412[var141 + 1] = var142;
                                String var143 = this.field1206[var141];
                                this.field1206[var141] = this.field1206[var141 + 1];
                                this.field1206[var141 + 1] = var143;
                                long var144 = this.field1355[var141];
                                this.field1355[var141] = this.field1355[var141 + 1];
                                this.field1355[var141 + 1] = var144;
                                this.field1094 = true;
                                var140 = false;
                            }
                        }
                    }
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 237) {
                    int var146 = this.field1432.method218();
                    int var147 = this.field1432.method218();
                    if (this.field1410 == var146 && this.field1411 == var147 && this.field1212 != 0) {
                        this.field1090 = -1;
                        return true;
                    }
                    this.field1410 = var146;
                    this.field1411 = var147;
                    this.field1173 = (this.field1410 - 6) * 8;
                    this.field1174 = (this.field1411 - 6) * 8;
                    this.field1212 = 1;
                    this.field1385.method242(false);
                    this.field1273.method191(-83, 257, 151, "Loading - please wait.", 0);
                    this.field1273.method191(-83, 256, 150, "Loading - please wait.", 16777215);
                    this.field1385.method243(super.field15, 11, 2, 8);
                    signlink.looprate(5);
                    int var148 = (this.field1089 - 2) / 10;
                    this.field1357 = new byte[var148][];
                    this.field1270 = new byte[var148][];
                    this.field1210 = new int[var148];
                    this.field1425.method205(false, 150);
                    this.field1425.method206(0);
                    int var149 = 0;
                    for (int var150 = 0; var150 < var148; ++var150) {
                        int var151 = this.field1432.method216();
                        int var152 = this.field1432.method216();
                        int var153 = this.field1432.method221();
                        int var154 = this.field1432.method221();
                        this.field1210[var150] = (var151 << 8) + var152;
                        if (var153 != 0) {
                            byte[] var155 = signlink.cacheload("m" + var151 + "_" + var152);
                            if (var155 != null) {
                                this.field1115.reset();
                                this.field1115.update(var155);
                                if ((int) this.field1115.getValue() != var153) {
                                    var155 = null;
                                }
                            }
                            if (var155 != null) {
                                this.field1357[var150] = var155;
                            } else {
                                this.field1212 = 0;
                                this.field1425.method206(0);
                                this.field1425.method206(var151);
                                this.field1425.method206(var152);
                                var149 += 3;
                            }
                        }
                        if (var154 != 0) {
                            byte[] var156 = signlink.cacheload("l" + var151 + "_" + var152);
                            if (var156 != null) {
                                this.field1115.reset();
                                this.field1115.update(var156);
                                if ((int) this.field1115.getValue() != var154) {
                                    var156 = null;
                                }
                            }
                            if (var156 != null) {
                                this.field1270[var150] = var156;
                            } else {
                                this.field1212 = 0;
                                this.field1425.method206(1);
                                this.field1425.method206(var151);
                                this.field1425.method206(var152);
                                var149 += 3;
                            }
                        }
                    }
                    this.field1425.method215(var149, (byte) 3);
                    signlink.looprate(50);
                    this.field1385.method242(false);
                    if (this.field1212 == 0) {
                        this.field1273.method191(-83, 257, 166, "Map area updated since last visit, so load will take longer this time only", 0);
                        this.field1273.method191(-83, 256, 165, "Map area updated since last visit, so load will take longer this time only", 16777215);
                    }
                    this.field1385.method243(super.field15, 11, 2, 8);
                    int var157 = this.field1173 - this.field1175;
                    int var158 = this.field1174 - this.field1176;
                    this.field1175 = this.field1173;
                    this.field1176 = this.field1174;
                    for (int var159 = 0; var159 < 8192; ++var159) {
                        NpcEntity var160 = this.field1283[var159];
                        if (var160 != null) {
                            for (int var161 = 0; var161 < 10; ++var161) {
                                var160.field356[var161] -= var157;
                                var160.field357[var161] -= var158;
                            }
                            var160.field308 -= var157 * 128;
                            var160.field309 -= var158 * 128;
                        }
                    }
                    for (int var162 = 0; var162 < this.field1366; ++var162) {
                        PlayerEntity var163 = this.field1368[var162];
                        if (var163 != null) {
                            for (int var164 = 0; var164 < 10; ++var164) {
                                var163.field356[var164] -= var157;
                                var163.field357[var164] -= var158;
                            }
                            var163.field308 -= var157 * 128;
                            var163.field309 -= var158 * 128;
                        }
                    }
                    byte var165 = 0;
                    byte var166 = 104;
                    byte var167 = 1;
                    if (var157 < 0) {
                        var165 = 103;
                        var166 = -1;
                        var167 = -1;
                    }
                    byte var168 = 0;
                    byte var169 = 104;
                    byte var170 = 1;
                    if (var158 < 0) {
                        var168 = 103;
                        var169 = -1;
                        var170 = -1;
                    }
                    for (int var171 = var165; var166 != var171; var171 += var167) {
                        for (int var172 = var168; var169 != var172; var172 += var170) {
                            int var173 = var157 + var171;
                            int var174 = var158 + var172;
                            for (int var175 = 0; var175 < 4; ++var175) {
                                if (var173 >= 0 && var174 >= 0 && var173 < 104 && var174 < 104) {
                                    this.field1418[var175][var171][var172] = this.field1418[var175][var173][var174];
                                } else {
                                    this.field1418[var175][var171][var172] = null;
                                }
                            }
                        }
                    }
                    for (LocMerged var176 = (LocMerged) this.field1361.method235(); var176 != null; var176 = (LocMerged) this.field1361.method237(-754)) {
                        var176.field638 -= var157;
                        var176.field639 -= var158;
                        if (var176.field638 < 0 || var176.field639 < 0 || var176.field638 >= 104 || var176.field639 >= 104) {
                            var176.method108();
                        }
                    }
                    if (this.field1478 != 0) {
                        this.field1478 -= var157;
                        this.field1479 -= var158;
                    }
                    this.field1238 = false;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 168) {
                    int var177 = this.field1432.method218();
                    this.method391(var177, 0);
                    if (this.field1462 != -1) {
                        this.field1462 = -1;
                        this.field1094 = true;
                        this.field1365 = true;
                    }
                    if (this.field1182 != -1) {
                        this.field1182 = -1;
                        this.field1171 = true;
                    }
                    if (this.field1113) {
                        this.field1113 = false;
                        this.field1171 = true;
                    }
                    this.field1112 = var177;
                    this.field1459 = false;
                    this.field1090 = -1;
                    return true;
                }
                if (this.field1090 == 21) {
                    this.field1307 = this.field1089 / 8;
                    for (int var178 = 0; var178 < this.field1307; ++var178) {
                        this.field1249[var178] = this.field1432.method222((byte) 2);
                    }
                    this.field1090 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1090 + "," + this.field1089 + " - " + this.field1353 + "," + this.field1354);
                this.method420(false);
            } catch (IOException var183) {
                this.method418((byte) -84);
            } catch (Exception var184) {
                String var180 = "T2 - " + this.field1090 + "," + this.field1353 + "," + this.field1354 + " - " + this.field1089 + "," + (this.field1453.field356[0] + this.field1173) + "," + (this.field1453.field357[0] + this.field1174) + " - ";
                for (int var181 = 0; var181 < this.field1089 && var181 < 50; ++var181) {
                    var180 = var180 + this.field1432.field623[var181] + ",";
                }
                signlink.reporterror(var180);
                this.method420(false);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method415(int arg0) {
        if (this.field1421 > 1) {
            --this.field1421;
        }
        if (this.field1093 > 0) {
            --this.field1093;
        }
        for (int var2 = 0; var2 < 5 && this.method414(true); ++var2) {
        }
        if (this.field1169) {
            int var10002;
            for (int var3 = 0; var3 < this.field1191; ++var3) {
                if (this.field1226[var3] <= 0) {
                    boolean var4 = false;
                    try {
                        if (this.field1407[var3] == this.field1150 && this.field1223[var3] == this.field1347) {
                            if (!this.method384(0)) {
                                var4 = true;
                            }
                        } else {
                            Packet var5 = Wave.method271(false, this.field1223[var3], this.field1407[var3]);
                            if (System.currentTimeMillis() + (long) (var5.field624 / 22) > (long) (this.field1278 / 22) + this.field1114) {
                                this.field1278 = var5.field624;
                                this.field1114 = System.currentTimeMillis();
                                if (this.method383(var5.field624, var5.field623, -12770)) {
                                    this.field1150 = this.field1407[var3];
                                    this.field1347 = this.field1223[var3];
                                } else {
                                    var4 = true;
                                }
                            }
                        }
                    } catch (Exception var21) {
                    }
                    if (var4 && this.field1226[var3] != -5) {
                        this.field1226[var3] = -5;
                    } else {
                        --this.field1191;
                        for (int var7 = var3; var7 < this.field1191; ++var7) {
                            this.field1407[var7] = this.field1407[var7 + 1];
                            this.field1223[var7] = this.field1223[var7 + 1];
                            this.field1226[var7] = this.field1226[var7 + 1];
                        }
                        --var3;
                    }
                } else {
                    var10002 = this.field1226[var3]--;
                }
            }
            if (arg0 != -46235) {
                this.field1165 = !this.field1165;
            }
            if (this.field1107 > 0) {
                this.field1107 -= 20;
                if (this.field1107 < 0) {
                    this.field1107 = 0;
                }
                if (this.field1107 == 0 && this.field1246 && !field1265) {
                    this.method485(this.field1163, this.field1323, this.field1392, -242);
                }
            }
            Packet var8 = InputTracking.method36(505);
            if (var8 != null) {
                this.field1425.method205(false, 81);
                this.field1425.method207(var8.field624);
                this.field1425.method214((byte) -41, var8.field623, var8.field624, 0);
                var8.method204(true);
            }
            ++this.field1091;
            if (this.field1091 > 750) {
                this.method418((byte) -84);
            }
            this.method396(true);
            this.method448((byte) -24);
            this.method457(38691);
            this.method425(-755);
            if ((super.field27[1] == 1 || super.field27[2] == 1 || super.field27[3] == 1 || super.field27[4] == 1) && this.field1156++ > 5) {
                this.field1156 = 0;
                this.field1425.method205(false, 189);
                this.field1425.method207(this.field1329);
                this.field1425.method207(this.field1330);
                this.field1425.method206(this.field1375);
                this.field1425.method206(this.field1204);
            }
            ++this.field1456;
            if (this.field1195 != 0) {
                this.field1194 += 20;
                if (this.field1194 >= 400) {
                    this.field1195 = 0;
                }
            }
            if (this.field1495 != 0) {
                ++this.field1492;
                if (this.field1492 >= 15) {
                    if (this.field1495 == 2) {
                        this.field1094 = true;
                    }
                    if (this.field1495 == 3) {
                        this.field1171 = true;
                    }
                    this.field1495 = 0;
                }
            }
            if (this.field1146 != 0) {
                ++this.field1143;
                if (super.field22 > this.field1147 + 5 || super.field22 < this.field1147 - 5 || super.field23 > this.field1148 + 5 || super.field23 < this.field1148 - 5) {
                    this.field1224 = true;
                }
                if (super.field21 == 0) {
                    if (this.field1146 == 2) {
                        this.field1094 = true;
                    }
                    if (this.field1146 == 3) {
                        this.field1171 = true;
                    }
                    this.field1146 = 0;
                    if (this.field1224 && this.field1143 >= 5) {
                        this.field1409 = -1;
                        this.method380(783);
                        if (this.field1409 == this.field1144 && this.field1408 != this.field1145) {
                            Component var9 = Component.field951[this.field1144];
                            int var10 = var9.field952[this.field1408];
                            var9.field952[this.field1408] = var9.field952[this.field1145];
                            var9.field952[this.field1145] = var10;
                            int var11 = var9.field953[this.field1408];
                            var9.field953[this.field1408] = var9.field953[this.field1145];
                            var9.field953[this.field1145] = var11;
                            this.field1425.method205(false, 159);
                            this.field1425.method207(this.field1144);
                            this.field1425.method207(this.field1145);
                            this.field1425.method207(this.field1408);
                        }
                    } else if ((this.field1509 == 1 || this.method471(this.field1167 - 1, -13246)) && this.field1167 > 2) {
                        this.method467(-468);
                    } else if (this.field1167 > 0) {
                        this.method436(this.field1167 - 1, 0);
                    }
                    this.field1492 = 10;
                    super.field24 = 0;
                }
            }
            ++field1189;
            if (field1189 > 127) {
                field1189 = 0;
                this.field1425.method205(false, 215);
                this.field1425.method209(4991788);
            }
            if (World3D.field260 != -1) {
                int var12 = World3D.field260;
                int var13 = World3D.field261;
                boolean var14 = this.method484(this.field1453.field357[0], 0, 0, var13, true, 0, var12, 0, 980, this.field1453.field356[0], 0, 0);
                World3D.field260 = -1;
                if (var14) {
                    this.field1192 = super.field25;
                    this.field1193 = super.field26;
                    this.field1195 = 1;
                    this.field1194 = 0;
                }
            }
            if (super.field24 == 1 && this.field1313 != null) {
                this.field1313 = null;
                this.field1171 = true;
                super.field24 = 0;
            }
            this.method490(-225);
            this.method483((byte) 0);
            this.method432(0);
            this.method376(-692);
            if (super.field21 == 1 || super.field24 == 1) {
                ++this.field1359;
            }
            if (this.field1212 == 2) {
                this.method411(-7753);
            }
            if (this.field1212 == 2 && this.field1238) {
                this.method464(7);
            }
            for (int var15 = 0; var15 < 5; ++var15) {
                var10002 = this.field1170[var15]++;
            }
            this.method480(-799);
            ++super.field20;
            if (super.field20 > 4500) {
                this.field1093 = 250;
                super.field20 -= 500;
                this.field1425.method205(false, 70);
            }
            ++this.field1086;
            if (this.field1086 > 500) {
                this.field1086 = 0;
                int var16 = (int) (Math.random() * 8.0D);
                if ((var16 & 1) == 1) {
                    this.field1320 += this.field1321;
                }
                if ((var16 & 2) == 2) {
                    this.field1435 += this.field1436;
                }
                if ((var16 & 4) == 4) {
                    this.field1151 += this.field1152;
                }
            }
            if (this.field1320 < -50) {
                this.field1321 = 2;
            }
            if (this.field1320 > 50) {
                this.field1321 = -2;
            }
            if (this.field1435 < -55) {
                this.field1436 = 2;
            }
            if (this.field1435 > 55) {
                this.field1436 = -2;
            }
            if (this.field1151 < -40) {
                this.field1152 = 1;
            }
            if (this.field1151 > 40) {
                this.field1152 = -1;
            }
            ++this.field1438;
            if (this.field1438 > 500) {
                this.field1438 = 0;
                int var17 = (int) (Math.random() * 8.0D);
                if ((var17 & 1) == 1) {
                    this.field1375 += this.field1376;
                }
                if ((var17 & 2) == 2) {
                    this.field1204 += this.field1205;
                }
            }
            if (this.field1375 < -60) {
                this.field1376 = 2;
            }
            if (this.field1375 > 60) {
                this.field1376 = -2;
            }
            if (this.field1204 < -20) {
                this.field1205 = 1;
            }
            if (this.field1204 > 10) {
                this.field1205 = -1;
            }
            ++field1260;
            if (field1260 > 110) {
                field1260 = 0;
                this.field1425.method205(false, 236);
                this.field1425.method210(0);
            }
            ++this.field1092;
            if (this.field1092 > 50) {
                this.field1425.method205(false, 108);
            }
            try {
                if (this.field1437 != null && this.field1425.field624 > 0) {
                    this.field1437.method33(this.field1425.field623, 0, this.field1425.field624, 0);
                    this.field1425.field624 = 0;
                    this.field1092 = 0;
                }
            } catch (IOException var19) {
                this.method418((byte) -84);
            } catch (Exception var20) {
                this.method420(false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public final void method13(String arg0, int arg1, int arg2) {
        this.method382((byte) -58);
        if (this.field1117 == null) {
            super.method13(arg0, arg1, -745);
        } else {
            this.field1485.method242(false);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1274.method191(-83, var4 / 2, var5 / 2 - 26 - var6, "RuneScape is loading - please wait...", 16777215);
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method151(304, (byte) -103, 34, var7, var4 / 2 - 152, 9179409);
            Pix2D.method151(302, (byte) -103, 32, var7 + 1, var4 / 2 - 151, 0);
            Pix2D.method150(var7 + 2, arg1 * 3, 8, var4 / 2 - 150, 30, 9179409);
            Pix2D.method150(var7 + 2, 300 - arg1 * 3, 8, arg1 * 3 + (var4 / 2 - 150), 30, 0);
            this.field1274.method191(-83, var4 / 2, var5 / 2 + 5 - var6, arg0, 16777215);
            if (arg2 >= 0) {
                this.field1404 = -487;
            }
            this.field1485.method243(super.field15, 186, 2, 214);
            if (this.field1439) {
                this.field1439 = false;
                if (!this.field1242) {
                    this.field1486.method243(super.field15, 0, 2, 0);
                    this.field1487.method243(super.field15, 0, 2, 661);
                }
                this.field1483.method243(super.field15, 0, 2, 128);
                this.field1484.method243(super.field15, 386, 2, 214);
                this.field1488.method243(super.field15, 265, 2, 0);
                this.field1489.method243(super.field15, 265, 2, 574);
                this.field1490.method243(super.field15, 186, 2, 128);
                this.field1491.method243(super.field15, 186, 2, 574);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method416(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1079 = "";
                this.field1080 = "Connecting to server...";
                this.method389(884);
            }
            this.field1437 = new ClientStream(this, this.method481(field1263 + 43594), false);
            this.field1437.method32(this.field1432.field623, 0, 8);
            this.field1432.field624 = 0;
            this.field1317 = this.field1432.method222((byte) 2);
            int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1317 >> 32), (int) this.field1317 };
            this.field1425.field624 = 0;
            this.field1425.method206(10);
            this.field1425.method210(var4[0]);
            this.field1425.method210(var4[1]);
            this.field1425.method210(var4[2]);
            this.field1425.method210(var4[3]);
            this.field1425.method210(signlink.uid);
            this.field1425.method213(arg0);
            this.field1425.method213(arg1);
            this.field1425.method231(field1309, field1394, 282);
            this.field1362.field624 = 0;
            if (arg2) {
                this.field1362.method206(18);
            } else {
                this.field1362.method206(16);
            }
            this.field1362.method206(this.field1425.field624 + 36 + 1 + 1);
            this.field1362.method206(222);
            this.field1362.method206(field1265 ? 1 : 0);
            for (int var5 = 0; var5 < 9; ++var5) {
                this.field1362.method210(this.field1390[var5]);
            }
            this.field1362.method214((byte) -41, this.field1425.field623, this.field1425.field624, 0);
            this.field1425.field628 = new Isaac((byte) 6, var4);
            for (int var6 = 0; var6 < 4; ++var6) {
                var4[var6] += 50;
            }
            this.field1363 = new Isaac((byte) 6, var4);
            this.field1437.method33(this.field1362.field623, 0, this.field1362.field624, 0);
            int var7 = this.field1437.method30();
            if (var7 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var15) {
                }
                this.method416(arg0, arg1, arg2);
                return;
            }
            if (var7 == 2 || var7 == 18) {
                if (var7 == 18) {
                    this.field1433 = true;
                } else {
                    this.field1433 = false;
                }
                InputTracking.method35(0);
                this.field1169 = true;
                this.field1425.field624 = 0;
                this.field1432.field624 = 0;
                this.field1090 = -1;
                this.field1352 = -1;
                this.field1353 = -1;
                this.field1354 = -1;
                this.field1089 = 0;
                this.field1091 = 0;
                this.field1421 = 0;
                this.field1093 = 0;
                this.field1261 = 0;
                this.field1167 = 0;
                this.field1315 = false;
                super.field20 = 0;
                for (int var8 = 0; var8 < 100; ++var8) {
                    this.field1269[var8] = null;
                }
                this.field1398 = 0;
                this.field1118 = 0;
                this.field1212 = 0;
                this.field1191 = 0;
                this.field1320 = (int) (Math.random() * 100.0D) - 50;
                this.field1435 = (int) (Math.random() * 110.0D) - 55;
                this.field1151 = (int) (Math.random() * 80.0D) - 40;
                this.field1375 = (int) (Math.random() * 120.0D) - 60;
                this.field1204 = (int) (Math.random() * 30.0D) - 20;
                this.field1330 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1358 = -1;
                this.field1478 = 0;
                this.field1479 = 0;
                this.field1369 = 0;
                this.field1284 = 0;
                for (int var9 = 0; var9 < this.field1366; ++var9) {
                    this.field1368[var9] = null;
                    this.field1373[var9] = null;
                }
                for (int var10 = 0; var10 < 8192; ++var10) {
                    this.field1283[var10] = null;
                }
                this.field1453 = this.field1368[this.field1367] = new PlayerEntity();
                this.field1207.method239();
                this.field1149.method239();
                this.field1510.method239();
                for (int var11 = 0; var11 < 4; ++var11) {
                    for (int var12 = 0; var12 < 104; ++var12) {
                        for (int var13 = 0; var13 < 104; ++var13) {
                            this.field1418[var11][var12][var13] = null;
                        }
                    }
                }
                this.field1361 = new LinkList((byte) 30);
                this.field1199 = 0;
                this.field1471 = -1;
                this.field1182 = -1;
                this.field1112 = -1;
                this.field1462 = -1;
                this.field1459 = false;
                this.field1241 = 3;
                this.field1113 = false;
                this.field1315 = false;
                this.field1333 = false;
                this.field1313 = null;
                this.field1443 = 0;
                this.field1450 = -1;
                this.field1393 = true;
                this.method461(this.field1165);
                for (int var14 = 0; var14 < 5; ++var14) {
                    this.field1081[var14] = 0;
                }
                field1109 = 0;
                field1440 = 0;
                field1271 = 0;
                field1311 = 0;
                field1389 = 0;
                field1187 = 0;
                field1514 = 0;
                field1127 = 0;
                field1239 = 0;
                field1403 = 0;
                this.method434(5);
                return;
            }
            if (var7 == 3) {
                this.field1079 = "";
                this.field1080 = "Invalid username or password.";
                return;
            }
            if (var7 == 4) {
                this.field1079 = "Your account has been disabled.";
                this.field1080 = "Please check your message-centre for details.";
                return;
            }
            if (var7 == 5) {
                this.field1079 = "Your account is already logged in.";
                this.field1080 = "Try again in 60 secs...";
                return;
            }
            if (var7 == 6) {
                this.field1079 = "RuneScape has been updated!";
                this.field1080 = "Please reload this page.";
                return;
            }
            if (var7 == 7) {
                this.field1079 = "This world is full.";
                this.field1080 = "Please use a different world.";
                return;
            }
            if (var7 == 8) {
                this.field1079 = "Unable to connect.";
                this.field1080 = "Login server offline.";
                return;
            }
            if (var7 == 9) {
                this.field1079 = "Login limit exceeded.";
                this.field1080 = "Too many connections from your address.";
                return;
            }
            if (var7 == 10) {
                this.field1079 = "Unable to connect.";
                this.field1080 = "Bad session id.";
                return;
            }
            if (var7 == 11) {
                this.field1080 = "Login server rejected session.";
                this.field1080 = "Please try again.";
                return;
            }
            if (var7 == 12) {
                this.field1079 = "You need a members account to login to this world.";
                this.field1080 = "Please subscribe, or use a different world.";
                return;
            }
            if (var7 == 13) {
                this.field1079 = "Could not complete login.";
                this.field1080 = "Please try using a different world.";
                return;
            }
            if (var7 == 14) {
                this.field1079 = "The server is being updated.";
                this.field1080 = "Please wait 1 minute and try again.";
                return;
            }
            if (var7 == 15) {
                this.field1169 = true;
                this.field1425.field624 = 0;
                this.field1432.field624 = 0;
                this.field1090 = -1;
                this.field1352 = -1;
                this.field1353 = -1;
                this.field1354 = -1;
                this.field1089 = 0;
                this.field1091 = 0;
                this.field1421 = 0;
                this.field1167 = 0;
                this.field1315 = false;
                return;
            }
            if (var7 == 16) {
                this.field1079 = "Login attempts exceeded.";
                this.field1080 = "Please wait 1 minute and try again.";
                return;
            }
            if (var7 == 17) {
                this.field1079 = "You are standing in a members-only area.";
                this.field1080 = "To play on this world move to a free area first";
                return;
            }
        } catch (IOException var16) {
            this.field1079 = "";
            this.field1080 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 222);
            if (arg0.length != 4) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
            } else {
                field1262 = Integer.parseInt(arg0[0]);
                field1263 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method479(false);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
                        return;
                    }
                    method429(3161);
                }
                if (arg0[3].equals("free")) {
                    field1264 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
                        return;
                    }
                    field1264 = true;
                }
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(0, 789, 532);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method417(byte arg0) {
        if (arg0 != 103) {
            this.field1090 = this.field1432.method216();
        }
        if (this.field1453.field308 >> 7 == this.field1478 && this.field1453.field309 >> 7 == this.field1479) {
            this.field1478 = 0;
        }
        for (int var2 = -1; var2 < this.field1369; ++var2) {
            PlayerEntity var3;
            int var4;
            if (var2 == -1) {
                var3 = this.field1453;
                var4 = this.field1367 << 14;
            } else {
                var3 = this.field1368[this.field1370[var2]];
                var4 = this.field1370[var2] << 14;
            }
            if (var3 != null && var3.method112(574)) {
                var3.field386 = false;
                if ((field1265 && this.field1369 > 50 || this.field1369 > 200) && var2 != -1 && var3.field332 == var3.field313) {
                    var3.field386 = true;
                }
                int var5 = var3.field308 >> 7;
                int var6 = var3.field309 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field381 != null && field1356 >= var3.field376 && field1356 < var3.field377) {
                        var3.field386 = false;
                        var3.field375 = this.method495(var3.field309, false, this.field1221, var3.field308);
                        this.field1322.method63((Model) null, var3.field309, var3.field383, var4, 60, var3, var3.field384, var3.field382, var3.field308, 911, var3.field375, var3.field310, this.field1221, var3.field385);
                    } else {
                        if ((var3.field308 & 127) == 64 && (var3.field309 & 127) == 64) {
                            if (this.field1431[var5][var6] == this.field1348) {
                                continue;
                            }
                            this.field1431[var5][var6] = this.field1348;
                        }
                        var3.field375 = this.method495(var3.field309, false, this.field1221, var3.field308);
                        this.field1322.method62(60, var3.field308, var3.field309, (Model) null, var4, var3.field375, var3.field310, false, this.field1221, var3, var3.field311);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method418(byte arg0) {
        if (this.field1093 > 0) {
            this.method420(false);
        } else {
            this.field1385.method242(false);
            this.field1273.method191(-83, 257, 144, "Connection lost", 0);
            this.field1273.method191(-83, 256, 143, "Connection lost", 16777215);
            this.field1273.method191(-83, 257, 159, "Please wait - attempting to reestablish", 0);
            this.field1273.method191(-83, 256, 158, "Please wait - attempting to reestablish", 16777215);
            this.field1385.method243(super.field15, 11, 2, 8);
            if (arg0 != -84) {
                this.field1215 = this.field1363.method253();
            }
            this.field1478 = 0;
            ClientStream var2 = this.field1437;
            this.field1169 = false;
            this.method416(this.field1236, this.field1237, true);
            if (!this.field1169) {
                this.method420(false);
            }
            try {
                var2.method29();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method419(int arg0) {
        this.field1130 = 0;
        for (int var2 = -1; var2 < this.field1369 + this.field1284; ++var2) {
            PathingEntity var18;
            if (var2 == -1) {
                var18 = this.field1453;
            } else if (var2 < this.field1369) {
                var18 = this.field1368[this.field1370[var2]];
            } else {
                var18 = this.field1283[this.field1285[var2 - this.field1369]];
            }
            if (var18 != null && var18.method112(574)) {
                if (var2 >= this.field1369) {
                    if (this.field1261 == 1 && this.field1285[var2 - this.field1369] == this.field1335 && field1356 % 20 < 10) {
                        this.method423(var18.field353 + 15, true, var18);
                        if (this.field1218 > -1) {
                            this.field1306[2].method175(this.field1219 - 28, -462, this.field1218 - 12);
                        }
                    }
                } else {
                    int var19 = 30;
                    PlayerEntity var20 = (PlayerEntity) var18;
                    if (var20.field370 != 0) {
                        this.method423(var18.field353 + 15, true, var18);
                        if (this.field1218 > -1) {
                            for (int var21 = 0; var21 < 8; ++var21) {
                                if ((var20.field370 & 1 << var21) != 0) {
                                    this.field1306[var21].method175(this.field1219 - var19, -462, this.field1218 - 12);
                                    var19 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1261 == 10 && this.field1370[var2] == this.field1360) {
                        this.method423(var18.field353 + 15, true, var18);
                        if (this.field1218 > -1) {
                            this.field1306[7].method175(this.field1219 - var19, -462, this.field1218 - 12);
                        }
                    }
                }
                if (var18.field320 != null && (var2 >= this.field1369 || this.field1504 == 0 || this.field1504 == 3 || this.field1504 == 1 && this.method470(((PlayerEntity) var18).field367, 0))) {
                    this.method423(var18.field353, true, var18);
                    if (this.field1218 > -1 && this.field1130 < this.field1131) {
                        this.field1135[this.field1130] = this.field1274.method193(6, var18.field320) / 2;
                        this.field1134[this.field1130] = this.field1274.field614;
                        this.field1132[this.field1130] = this.field1218;
                        this.field1133[this.field1130] = this.field1219;
                        this.field1136[this.field1130] = var18.field322;
                        this.field1137[this.field1130] = var18.field323;
                        this.field1138[this.field1130] = var18.field321;
                        this.field1139[this.field1130++] = var18.field320;
                        if (this.field1225 == 0 && var18.field323 == 1) {
                            this.field1134[this.field1130] += 10;
                            this.field1133[this.field1130] += 5;
                        }
                        if (this.field1225 == 0 && var18.field323 == 2) {
                            this.field1135[this.field1130] = 60;
                        }
                    }
                }
                if (var18.field326 > field1356 + 100) {
                    this.method423(var18.field353 + 15, true, var18);
                    if (this.field1218 > -1) {
                        int var22 = var18.field327 * 30 / var18.field328;
                        if (var22 > 30) {
                            var22 = 30;
                        }
                        Pix2D.method150(this.field1219 - 3, var22, 8, this.field1218 - 15, 5, 65280);
                        Pix2D.method150(this.field1219 - 3, 30 - var22, 8, this.field1218 - 15 + var22, 5, 16711680);
                    }
                }
                if (var18.field326 > field1356 + 330) {
                    this.method423(var18.field353 / 2, true, var18);
                    if (this.field1218 > -1) {
                        this.field1442[var18.field325].method175(this.field1219 - 12, -462, this.field1218 - 12);
                        this.field1272.method191(-83, this.field1218, this.field1219 + 4, String.valueOf(var18.field324), 0);
                        this.field1272.method191(-83, this.field1218 - 1, this.field1219 + 3, String.valueOf(var18.field324), 16777215);
                    }
                }
            }
        }
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        for (int var4 = 0; var4 < this.field1130; ++var4) {
            int var5 = this.field1132[var4];
            int var6 = this.field1133[var4];
            int var7 = this.field1135[var4];
            int var8 = this.field1134[var4];
            boolean var9 = true;
            while (var9) {
                var9 = false;
                for (int var17 = 0; var17 < var4; ++var17) {
                    if (var6 + 2 > this.field1133[var17] - this.field1134[var17] && var6 - var8 < this.field1133[var17] + 2 && var5 - var7 < this.field1135[var17] + this.field1132[var17] && var5 + var7 > this.field1132[var17] - this.field1135[var17] && this.field1133[var17] - this.field1134[var17] < var6) {
                        var6 = this.field1133[var17] - this.field1134[var17];
                        var9 = true;
                    }
                }
            }
            this.field1218 = this.field1132[var4];
            this.field1219 = this.field1133[var4] = var6;
            String var10 = this.field1139[var4];
            if (this.field1225 == 0) {
                int var11 = 16776960;
                if (this.field1136[var4] < 6) {
                    var11 = this.field1416[this.field1136[var4]];
                }
                if (this.field1136[var4] == 6) {
                    var11 = this.field1348 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1136[var4] == 7) {
                    var11 = this.field1348 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1136[var4] == 8) {
                    var11 = this.field1348 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1136[var4] == 9) {
                    int var12 = 150 - this.field1138[var4];
                    if (var12 < 50) {
                        var11 = var12 * 1280 + 16711680;
                    } else if (var12 < 100) {
                        var11 = 16776960 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var11 = (var12 - 100) * 5 + 65280;
                    }
                }
                if (this.field1136[var4] == 10) {
                    int var13 = 150 - this.field1138[var4];
                    if (var13 < 50) {
                        var11 = var13 * 5 + 16711680;
                    } else if (var13 < 100) {
                        var11 = 16711935 - (var13 - 50) * 327680;
                    } else if (var13 < 150) {
                        var11 = (var13 - 100) * 327680 + 255 - (var13 - 100) * 5;
                    }
                }
                if (this.field1136[var4] == 11) {
                    int var14 = 150 - this.field1138[var4];
                    if (var14 < 50) {
                        var11 = 16777215 - var14 * 327685;
                    } else if (var14 < 100) {
                        var11 = (var14 - 50) * 327685 + 65280;
                    } else if (var14 < 150) {
                        var11 = 16777215 - (var14 - 100) * 327680;
                    }
                }
                if (this.field1137[var4] == 0) {
                    this.field1274.method191(-83, this.field1218, this.field1219 + 1, var10, 0);
                    this.field1274.method191(-83, this.field1218, this.field1219, var10, var11);
                }
                if (this.field1137[var4] == 1) {
                    this.field1274.method195(this.field1219 + 1, this.field1218, var10, 0, this.field1348, false);
                    this.field1274.method195(this.field1219, this.field1218, var10, var11, this.field1348, false);
                }
                if (this.field1137[var4] == 2) {
                    int var15 = this.field1274.method193(6, var10);
                    int var16 = (150 - this.field1138[var4]) * (var15 + 100) / 150;
                    Pix2D.method148(this.field1218 - 50, this.field1218 + 50, 334, 770, 0);
                    this.field1274.method194(this.field1219 + 1, var10, 0, this.field1218 + 50 - var16, 0);
                    this.field1274.method194(this.field1219, var10, var11, this.field1218 + 50 - var16, 0);
                    Pix2D.method147(3);
                }
            } else {
                this.field1274.method191(-83, this.field1218, this.field1219 + 1, var10, 0);
                this.field1274.method191(-83, this.field1218, this.field1219, var10, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method420(boolean arg0) {
        try {
            if (this.field1437 != null) {
                this.field1437.method29();
            }
        } catch (Exception var3) {
        }
        this.field1437 = null;
        this.field1169 = false;
        this.field1457 = 0;
        this.field1236 = "";
        this.field1237 = "";
        InputTracking.method35(0);
        this.method492((byte) 9);
        this.field1322.method51(602);
        if (arg0) {
            this.field1090 = this.field1432.method216();
        }
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field1499[var2].method302(930);
        }
        System.gc();
        this.method390(false);
        this.field1163 = null;
        this.field1107 = 0;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IBLkb;)V")
    private final void method421(int arg0, byte arg1, Packet arg2) {
        if (arg1 != -55) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        while (arg2.field625 + 21 < arg0 * 8) {
            int var5 = arg2.method227(13, (byte) 6);
            if (var5 == 8191) {
                break;
            }
            if (this.field1283[var5] == null) {
                this.field1283[var5] = new NpcEntity();
            }
            NpcEntity var6 = this.field1283[var5];
            this.field1285[this.field1284++] = var5;
            var6.field352 = field1356;
            var6.field361 = NpcType.method288(arg2.method227(11, (byte) 6));
            var6.field312 = var6.field361.field849;
            var6.field315 = var6.field361.field853;
            var6.field316 = var6.field361.field854;
            var6.field317 = var6.field361.field855;
            var6.field318 = var6.field361.field856;
            var6.field313 = var6.field361.field852;
            int var7 = arg2.method227(5, (byte) 6);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg2.method227(5, (byte) 6);
            if (var8 > 15) {
                var8 -= 32;
            }
            var6.method110(this.field1453.field356[0] + var7, -398, false, this.field1453.field357[0] + var8);
            int var9 = arg2.method227(1, (byte) 6);
            if (var9 == 1) {
                this.field1372[this.field1371++] = var5;
            }
        }
        arg2.method228(-561);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)Ljava/awt/Component;")
    public final java.awt.Component method11(byte arg0) {
        if (arg0 != -66) {
            this.field1425.method206(37);
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field18 != null ? super.field18 : this;
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method422(int arg0) {
        this.field1425.method205(false, 231);
        if (this.field1462 != -1) {
            this.field1462 = -1;
            this.field1094 = true;
            this.field1459 = false;
            this.field1365 = true;
        }
        if (this.field1182 != -1) {
            this.field1182 = -1;
            this.field1171 = true;
            this.field1459 = false;
        }
        this.field1112 = -1;
        int var2 = 45 / arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLx;)V")
    public final void method423(int arg0, boolean arg1, PathingEntity arg2) {
        this.method424((byte) 8, arg2.field309, arg0, arg2.field308);
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIII)V")
    public final void method424(byte arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg1 >= 128 && arg3 <= 13056 && arg1 <= 13056) {
            int var5 = this.method495(arg1, false, this.field1221, arg3) - arg2;
            int var6 = arg3 - this.field1299;
            int var7 = var5 - this.field1300;
            if (arg0 == 8) {
                boolean var8 = false;
            } else {
                this.field1296 = !this.field1296;
            }
            int var9 = arg1 - this.field1301;
            int var10 = Model.field534[this.field1302];
            int var11 = Model.field535[this.field1302];
            int var12 = Model.field534[this.field1303];
            int var13 = Model.field535[this.field1303];
            int var14 = var6 * var13 + var9 * var12 >> 16;
            int var15 = var9 * var13 - var6 * var12 >> 16;
            int var17 = var7 * var11 - var10 * var15 >> 16;
            int var18 = var7 * var10 + var11 * var15 >> 16;
            if (var18 >= 50) {
                this.field1218 = (var14 << 9) / var18 + Pix3D.field565;
                this.field1219 = (var17 << 9) / var18 + Pix3D.field566;
            } else {
                this.field1218 = -1;
                this.field1219 = -1;
            }
        } else {
            this.field1218 = -1;
            this.field1219 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method425(int arg0) {
        if (arg0 >= 0) {
            this.field1404 = this.field1363.method253();
        }
        if (this.field1212 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1510.method235(); var2 != null; var2 = (LocSpawned) this.field1510.method237(-754)) {
                if (field1356 >= var2.field653) {
                    this.method402(var2.field649, this.field1168, var2.field647, var2.field650, var2.field652, var2.field651, var2.field646, var2.field648);
                    var2.method108();
                }
            }
            ++field1276;
            if (field1276 > 85) {
                field1276 = 0;
                this.field1425.method205(false, 85);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lhc;I)V")
    public final void method426(Component arg0, int arg1) {
        int var3 = arg0.field960;
        if (arg1 != 14658) {
            this.field1498 = this.field1363.method253();
        }
        if (var3 >= 1 && var3 <= 100) {
            --var3;
            if (var3 >= this.field1199) {
                arg0.field990 = "";
                arg0.field959 = 0;
            } else {
                arg0.field990 = this.field1206[var3];
                arg0.field959 = 1;
            }
        } else if (var3 >= 101 && var3 <= 200) {
            var3 -= 101;
            if (var3 >= this.field1199) {
                arg0.field990 = "";
                arg0.field959 = 0;
            } else {
                if (this.field1412[var3] == 0) {
                    arg0.field990 = "@red@Offline";
                } else if (this.field1412[var3] == field1262) {
                    arg0.field990 = "@gre@World-" + (this.field1412[var3] - 9);
                } else {
                    arg0.field990 = "@yel@World-" + (this.field1412[var3] - 9);
                }
                arg0.field959 = 1;
            }
        } else if (var3 == 203) {
            arg0.field969 = this.field1199 * 15 + 20;
            if (arg0.field969 <= arg0.field962) {
                arg0.field969 = arg0.field962 + 1;
            }
        } else if (var3 >= 401 && var3 <= 500) {
            var3 -= 401;
            if (var3 >= this.field1307) {
                arg0.field990 = "";
                arg0.field959 = 0;
            } else {
                arg0.field990 = JString.method262(0, JString.method259(this.field1249[var3], true));
                arg0.field959 = 1;
            }
        } else if (var3 == 503) {
            arg0.field969 = this.field1307 * 15 + 20;
            if (arg0.field969 <= arg0.field962) {
                arg0.field969 = arg0.field962 + 1;
            }
        } else if (var3 == 327) {
            arg0.field1002 = 150;
            arg0.field1003 = (int) (Math.sin((double) field1356 / 40.0D) * 256.0D) & 2047;
            if (this.field1364) {
                this.field1364 = false;
                Model[] var4 = new Model[7];
                int var5 = 0;
                for (int var6 = 0; var6 < 7; ++var6) {
                    int var9 = this.field1428[var6];
                    if (var9 >= 0) {
                        var4[var5++] = IdkType.field943[var9].method320();
                    }
                }
                Model var7 = new Model(-406, var4, var5);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field1081[var8] != 0) {
                        var7.method134(field1184[var8][0], field1184[var8][this.field1081[var8]]);
                        if (var8 == 1) {
                            var7.method134(field1482[0], field1482[this.field1081[var8]]);
                        }
                    }
                }
                var7.method127(false);
                var7.method128(SeqType.field1018[this.field1453.field313].field1020[0], 5565);
                var7.method137(64, 850, -30, -50, -30, true);
                arg0.field997 = var7;
            }
        } else if (var3 == 324) {
            if (this.field1511 == null) {
                this.field1511 = arg0.field995;
                this.field1512 = arg0.field996;
            }
            if (this.field1393) {
                arg0.field995 = this.field1512;
            } else {
                arg0.field995 = this.field1511;
            }
        } else if (var3 == 325) {
            if (this.field1511 == null) {
                this.field1511 = arg0.field995;
                this.field1512 = arg0.field996;
            }
            if (this.field1393) {
                arg0.field995 = this.field1511;
            } else {
                arg0.field995 = this.field1512;
            }
        } else if (var3 == 600) {
            arg0.field990 = this.field1277;
            if (field1356 % 20 < 10) {
                arg0.field990 = arg0.field990 + "|";
            } else {
                arg0.field990 = arg0.field990 + " ";
            }
        } else {
            if (var3 == 613) {
                if (this.field1433) {
                    if (this.field1203) {
                        arg0.field992 = 16711680;
                        arg0.field990 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else {
                        arg0.field992 = 16777215;
                        arg0.field990 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else {
                    arg0.field990 = "";
                }
            }
            if (var3 == 650 || var3 == 655) {
                if (this.field1153 != 0) {
                    String var10;
                    if (this.field1423 == 0) {
                        var10 = "earlier today";
                    } else if (this.field1423 == 1) {
                        var10 = "yesterday";
                    } else {
                        var10 = this.field1423 + " days ago";
                    }
                    arg0.field990 = "You last logged in " + var10 + " from: " + signlink.dns;
                } else {
                    arg0.field990 = "";
                }
            }
            if (var3 == 651) {
                if (this.field1319 == 0) {
                    arg0.field990 = "0 unread messages";
                    arg0.field992 = 16776960;
                }
                if (this.field1319 == 1) {
                    arg0.field990 = "1 unread message";
                    arg0.field992 = 65280;
                }
                if (this.field1319 > 1) {
                    arg0.field990 = this.field1319 + " unread messages";
                    arg0.field992 = 65280;
                }
            }
            if (var3 == 652) {
                if (this.field1197 == 201) {
                    arg0.field990 = "";
                } else if (this.field1197 == 200) {
                    arg0.field990 = "You have not yet set any password recovery questions.";
                } else {
                    String var11;
                    if (this.field1197 == 0) {
                        var11 = "Earlier today";
                    } else if (this.field1197 == 1) {
                        var11 = "Yesterday";
                    } else {
                        var11 = this.field1197 + " days ago";
                    }
                    arg0.field990 = var11 + " you changed your recovery questions";
                }
            }
            if (var3 == 653) {
                if (this.field1197 == 201) {
                    arg0.field990 = "";
                } else if (this.field1197 == 200) {
                    arg0.field990 = "We strongly recommend you do so now to secure your account.";
                } else {
                    arg0.field990 = "If you do not remember making this change then cancel it immediately";
                }
            }
            if (var3 == 654) {
                if (this.field1197 == 201) {
                    arg0.field990 = "";
                } else if (this.field1197 == 200) {
                    arg0.field990 = "Do this from the 'account management' area on our front webpage";
                } else {
                    arg0.field990 = "Do this from the 'account management' area on our front webpage";
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field18 != null) {
                    return new URL("http://127.0.0.1:" + (field1263 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lhb;III)V")
    public final void method427(Pix32 arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1375 + this.field1330 & 2047;
        int var6 = arg1 * arg1 + arg3 * arg3;
        if (var6 <= 6400) {
            int var7 = Model.field534[var5];
            int var8 = Model.field535[var5];
            int var9 = var7 * 256 / (this.field1204 + 256);
            while (arg2 >= 0) {
                field1213 = this.field1363.method253();
            }
            int var10 = var8 * 256 / (this.field1204 + 256);
            int var11 = arg1 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg1 * var9 >> 16;
            if (var6 > 2500) {
                arg0.method182(false, this.field1380, var11 + 94 - arg0.field592 / 2, 83 - var12 - arg0.field593 / 2);
            } else {
                arg0.method175(83 - var12 - arg0.field593 / 2, -462, var11 + 94 - arg0.field592 / 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method428(byte arg0) {
        this.field1386.method242(false);
        Pix3D.field571 = this.field1506;
        if (arg0 == 2) {
            this.field1381.method189(0, -462, 0);
            if (this.field1333) {
                this.field1274.method191(-83, 239, 40, this.field1458, 0);
                this.field1274.method191(-83, 239, 60, this.field1183 + "*", 128);
            } else if (this.field1113) {
                this.field1274.method191(-83, 239, 40, "Enter amount:", 0);
                this.field1274.method191(-83, 239, 60, this.field1126 + "*", 128);
            } else if (this.field1313 != null) {
                this.field1274.method191(-83, 239, 40, this.field1313, 0);
                this.field1274.method191(-83, 239, 60, "Click to continue", 128);
            } else if (this.field1182 != -1) {
                this.method371(0, 0, Component.field951[this.field1182], 0, 0);
            } else if (this.field1471 != -1) {
                this.method371(0, 0, Component.field951[this.field1471], 0, 0);
            } else {
                PixFont var2 = this.field1273;
                int var3 = 0;
                Pix2D.method148(0, 463, 77, 770, 0);
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field1269[var4] != null) {
                        int var5 = this.field1267[var4];
                        int var6 = 70 - var3 * 14 + this.field1125;
                        if (var5 == 0) {
                            if (var6 > 0 && var6 < 110) {
                                var2.method194(var6, this.field1269[var4], 0, 4, 0);
                            }
                            ++var3;
                        }
                        if (var5 == 1) {
                            if (var6 > 0 && var6 < 110) {
                                var2.method194(var6, this.field1268[var4] + ":", 16777215, 4, 0);
                                var2.method194(var6, this.field1269[var4], 255, 12 + var2.method193(6, this.field1268[var4]), 0);
                            }
                            ++var3;
                        }
                        if (var5 == 2 && (this.field1504 == 0 || this.field1504 == 1 && this.method470(this.field1268[var4], 0))) {
                            if (var6 > 0 && var6 < 110) {
                                var2.method194(var6, this.field1268[var4] + ":", 0, 4, 0);
                                var2.method194(var6, this.field1269[var4], 255, 12 + var2.method193(6, this.field1268[var4]), 0);
                            }
                            ++var3;
                        }
                        if ((var5 == 3 || var5 == 7) && this.field1395 == 0 && (var5 == 7 || this.field1106 == 0 || this.field1106 == 1 && this.method470(this.field1268[var4], 0))) {
                            if (var6 > 0 && var6 < 110) {
                                var2.method194(var6, "From " + this.field1268[var4] + ":", 0, 4, 0);
                                var2.method194(var6, this.field1269[var4], 8388608, 12 + var2.method193(6, "From " + this.field1268[var4]), 0);
                            }
                            ++var3;
                        }
                        if (var5 == 4 && (this.field1240 == 0 || this.field1240 == 1 && this.method470(this.field1268[var4], 0))) {
                            if (var6 > 0 && var6 < 110) {
                                var2.method194(var6, this.field1268[var4] + " " + this.field1269[var4], 8388736, 4, 0);
                            }
                            ++var3;
                        }
                        if (var5 == 5 && this.field1395 == 0 && this.field1106 < 2) {
                            if (var6 > 0 && var6 < 110) {
                                var2.method194(var6, this.field1269[var4], 8388608, 4, 0);
                            }
                            ++var3;
                        }
                        if (var5 == 6 && this.field1395 == 0 && this.field1106 < 2) {
                            if (var6 > 0 && var6 < 110) {
                                var2.method194(var6, "To " + this.field1268[var4] + ":", 0, 4, 0);
                                var2.method194(var6, this.field1269[var4], 8388608, 12 + var2.method193(6, "To " + this.field1268[var4]), 0);
                            }
                            ++var3;
                        }
                        if (var5 == 8 && (this.field1240 == 0 || this.field1240 == 1 && this.method470(this.field1268[var4], 0))) {
                            if (var6 > 0 && var6 < 110) {
                                var2.method194(var6, this.field1268[var4] + " " + this.field1269[var4], 13350793, 4, 0);
                            }
                            ++var3;
                        }
                    }
                }
                Pix2D.method147(3);
                this.field1202 = var3 * 14 + 7;
                if (this.field1202 < 78) {
                    this.field1202 = 78;
                }
                this.method403(-92, this.field1202, 0, 77, this.field1202 - this.field1125 - 77, 463);
                var2.method194(90, JString.method262(0, this.field1236) + ":", 0, 4, 0);
                var2.method194(90, this.field1243 + "*", 255, 6 + var2.method193(6, this.field1236 + ": "), 0);
                Pix2D.method152(77, 0, 479, 0, this.field1247);
            }
            if (this.field1315 && this.field1157 == 2) {
                this.method409(7);
            }
            this.field1386.method243(super.field15, 375, 2, 22);
            this.field1385.method242(false);
            Pix3D.field571 = this.field1508;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method12(Runnable arg0, int arg1) {
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method12(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public static final void method429(int arg0) {
        if (arg0 == 3161) {
            World3D.field226 = false;
            Pix3D.field560 = false;
            field1265 = false;
            World.field36 = false;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method430(int arg0, int arg1) {
        LinkList var3 = this.field1418[this.field1221][arg0][arg1];
        if (var3 == null) {
            this.field1322.method77(this.field1221, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method235(); var6 != null; var6 = (ObjStackEntity) var3.method237(-754)) {
                ObjType var16 = ObjType.method294(var6.field303);
                int var17 = var16.field891;
                if (var16.field890) {
                    var17 = (var6.field304 + 1) * var17;
                }
                if (var17 > var4) {
                    var4 = var17;
                    var5 = var6;
                }
            }
            var3.method233(var5, (byte) 4);
            int var7 = -1;
            int var8 = -1;
            int var9 = 0;
            int var10 = 0;
            for (ObjStackEntity var11 = (ObjStackEntity) var3.method235(); var11 != null; var11 = (ObjStackEntity) var3.method237(-754)) {
                if (var5.field303 != var11.field303 && var7 == -1) {
                    var7 = var11.field303;
                    var9 = var11.field304;
                }
                if (var5.field303 != var11.field303 && var11.field303 != var7 && var8 == -1) {
                    var8 = var11.field303;
                    var10 = var11.field304;
                }
            }
            Model var12 = null;
            if (var7 != -1) {
                var12 = ObjType.method294(var7).method298(var9);
            }
            Model var13 = null;
            if (var8 != -1) {
                var13 = ObjType.method294(var8).method298(var10);
            }
            int var14 = (arg1 << 7) + arg0 + 1610612736;
            ObjType var15 = ObjType.method294(var5.field303);
            this.field1322.method58(var15.method298(var5.field304), var14, this.method495(arg1 * 128 + 64, false, this.field1221, arg0 * 128 + 64), arg0, this.field1221, arg1, var13, var12, this.field1123);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method431(byte arg0) {
        this.field1497 = false;
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            this.field1481 = !this.field1481;
        }
        while (this.field1430) {
            try {
                Thread.sleep(50L);
            } catch (Exception var17) {
            }
            Object var3 = this.field1448;
            String var4;
            int var5;
            int var6;
            synchronized (this.field1448) {
                var4 = this.field1314;
                var5 = this.field1141;
                var6 = this.field1378;
                this.field1314 = null;
                this.field1141 = 0;
                this.field1378 = 0;
            }
            if (var4 != null) {
                byte[] var7 = signlink.cacheload(var4 + ".mid");
                if (var7 != null && var5 != 12345678) {
                    this.field1115.reset();
                    this.field1115.update(var7);
                    int var8 = (int) this.field1115.getValue();
                    if (var5 != var8) {
                        var7 = null;
                    }
                }
                if (var7 == null) {
                    try {
                        DataInputStream var9 = this.method435(var4 + "_" + var5 + ".mid");
                        var7 = new byte[var6];
                        int var11;
                        for (int var10 = 0; var10 < var6; var10 += var11) {
                            var11 = var9.read(var7, var10, var6 - var10);
                            if (var11 == -1) {
                                byte[] var12 = new byte[var10];
                                for (int var13 = 0; var13 < var10; ++var13) {
                                    var12[var13] = var7[var13];
                                }
                                var7 = var12;
                                var6 = var10;
                                break;
                            }
                        }
                        var9.close();
                        signlink.cachesave(var4 + ".mid", var7);
                    } catch (Exception var18) {
                    }
                }
                if (var7 == null) {
                    return;
                }
                int var14 = (new Packet((byte) 64, var7)).method221();
                byte[] var15 = new byte[var14];
                BZip2.method245(var15, var14, var7, var6, 4);
                this.method392(var15, false, true, var14);
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1087) {
            this.method491(-40223);
        } else if (this.field1497) {
            this.method431((byte) 2);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method432(int arg0) {
        if (arg0 != 0) {
            this.field1090 = this.field1432.method216();
        }
        if (super.field24 == 1) {
            if (super.field25 >= 549 && super.field25 <= 583 && super.field26 >= 195 && super.field26 < 231 && this.field1110[0] != -1) {
                this.field1094 = true;
                this.field1241 = 0;
                this.field1365 = true;
            }
            if (super.field25 >= 579 && super.field25 <= 609 && super.field26 >= 194 && super.field26 < 231 && this.field1110[1] != -1) {
                this.field1094 = true;
                this.field1241 = 1;
                this.field1365 = true;
            }
            if (super.field25 >= 607 && super.field25 <= 637 && super.field26 >= 194 && super.field26 < 231 && this.field1110[2] != -1) {
                this.field1094 = true;
                this.field1241 = 2;
                this.field1365 = true;
            }
            if (super.field25 >= 635 && super.field25 <= 679 && super.field26 >= 194 && super.field26 < 229 && this.field1110[3] != -1) {
                this.field1094 = true;
                this.field1241 = 3;
                this.field1365 = true;
            }
            if (super.field25 >= 676 && super.field25 <= 706 && super.field26 >= 194 && super.field26 < 231 && this.field1110[4] != -1) {
                this.field1094 = true;
                this.field1241 = 4;
                this.field1365 = true;
            }
            if (super.field25 >= 704 && super.field25 <= 734 && super.field26 >= 194 && super.field26 < 231 && this.field1110[5] != -1) {
                this.field1094 = true;
                this.field1241 = 5;
                this.field1365 = true;
            }
            if (super.field25 >= 732 && super.field25 <= 766 && super.field26 >= 195 && super.field26 < 231 && this.field1110[6] != -1) {
                this.field1094 = true;
                this.field1241 = 6;
                this.field1365 = true;
            }
            if (super.field25 >= 550 && super.field25 <= 584 && super.field26 >= 492 && super.field26 < 528 && this.field1110[7] != -1) {
                this.field1094 = true;
                this.field1241 = 7;
                this.field1365 = true;
            }
            if (super.field25 >= 582 && super.field25 <= 612 && super.field26 >= 492 && super.field26 < 529 && this.field1110[8] != -1) {
                this.field1094 = true;
                this.field1241 = 8;
                this.field1365 = true;
            }
            if (super.field25 >= 609 && super.field25 <= 639 && super.field26 >= 492 && super.field26 < 529 && this.field1110[9] != -1) {
                this.field1094 = true;
                this.field1241 = 9;
                this.field1365 = true;
            }
            if (super.field25 >= 637 && super.field25 <= 681 && super.field26 >= 493 && super.field26 < 528 && this.field1110[10] != -1) {
                this.field1094 = true;
                this.field1241 = 10;
                this.field1365 = true;
            }
            if (super.field25 >= 679 && super.field25 <= 709 && super.field26 >= 492 && super.field26 < 529 && this.field1110[11] != -1) {
                this.field1094 = true;
                this.field1241 = 11;
                this.field1365 = true;
            }
            if (super.field25 >= 706 && super.field25 <= 736 && super.field26 >= 492 && super.field26 < 529 && this.field1110[12] != -1) {
                this.field1094 = true;
                this.field1241 = 12;
                this.field1365 = true;
            }
            if (super.field25 >= 734 && super.field25 <= 768 && super.field26 >= 492 && super.field26 < 528 && this.field1110[13] != -1) {
                this.field1094 = true;
                this.field1241 = 13;
                this.field1365 = true;
            }
            ++field1405;
            if (field1405 > 150) {
                field1405 = 0;
                this.field1425.method205(false, 233);
                this.field1425.method206(43);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILhc;BIIZII)V")
    public final void method433(int arg0, int arg1, Component arg2, byte arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (this.field1513) {
            this.field1382 = 32;
        } else {
            this.field1382 = 0;
        }
        this.field1513 = false;
        if (arg3 == 4) {
            boolean var10 = false;
            if (arg1 >= arg4 && arg1 < arg4 + 16 && arg0 >= arg8 && arg0 < arg8 + 16) {
                arg2.field970 -= this.field1359 * 4;
                if (arg6) {
                    this.field1094 = true;
                    return;
                }
            } else if (arg1 >= arg4 && arg1 < arg4 + 16 && arg0 >= arg5 + arg8 - 16 && arg0 < arg5 + arg8) {
                arg2.field970 += this.field1359 * 4;
                if (arg6) {
                    this.field1094 = true;
                    return;
                }
            } else {
                if (arg1 < arg4 - this.field1382 || arg1 >= arg4 + 16 + this.field1382 || arg0 < arg8 + 16 || arg0 >= arg5 + arg8 - 16 || this.field1359 <= 0) {
                    return;
                }
                int var11 = (arg5 - 32) * arg5 / arg7;
                if (var11 < 8) {
                    var11 = 8;
                }
                int var12 = arg0 - arg8 - 16 - var11 / 2;
                int var13 = arg5 - 32 - var11;
                arg2.field970 = (arg7 - arg5) * var12 / var13;
                if (arg6) {
                    this.field1094 = true;
                }
                this.field1513 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method434(int arg0) {
        if (this.field1386 == null) {
            this.method401(true);
            super.field16 = null;
            this.field1483 = null;
            if (arg0 < 5 || arg0 > 5) {
                this.field1090 = this.field1432.method216();
            }
            this.field1484 = null;
            this.field1485 = null;
            this.field1486 = null;
            this.field1487 = null;
            this.field1488 = null;
            this.field1489 = null;
            this.field1490 = null;
            this.field1491 = null;
            this.field1386 = new PixMap(96, 479, field1259, this.method11((byte) -66));
            this.field1384 = new PixMap(160, 168, field1259, this.method11((byte) -66));
            Pix2D.method149(730);
            this.field1380.method189(0, -462, 0);
            this.field1383 = new PixMap(261, 190, field1259, this.method11((byte) -66));
            this.field1385 = new PixMap(334, 512, field1259, this.method11((byte) -66));
            Pix2D.method149(730);
            this.field1279 = new PixMap(61, 501, field1259, this.method11((byte) -66));
            this.field1280 = new PixMap(40, 288, field1259, this.method11((byte) -66));
            this.field1281 = new PixMap(66, 269, field1259, this.method11((byte) -66));
            this.field1439 = true;
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1262 = Integer.parseInt(this.getParameter("nodeid"));
        field1263 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method479(false);
        } else {
            method429(3161);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1264 = false;
        } else {
            field1264 = true;
        }
        this.method2(532, 789, field1088);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method435(String arg0) throws IOException {
        return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)V")
    public final void method436(int arg0, int arg1) {
        if (arg0 >= 0) {
            if (this.field1113) {
                this.field1113 = false;
                this.field1171 = true;
            }
            int var3 = this.field1444[arg0];
            int var4 = this.field1445[arg0];
            int var5 = this.field1446[arg0];
            int var6 = this.field1447[arg0];
            if (arg1 == 0) {
                if (var5 >= 2000) {
                    var5 -= 2000;
                }
                if (var5 == 450 && this.method473(var3, var4, var6, 75, false)) {
                    this.field1425.method207(this.field1401);
                    this.field1425.method207(this.field1399);
                    this.field1425.method207(this.field1400);
                }
                if (var5 == 581) {
                    if ((var6 & 3) == 0) {
                        ++field1109;
                    }
                    if (field1109 >= 99) {
                        this.field1425.method205(false, 7);
                        this.field1425.method210(0);
                    }
                    this.method473(var3, var4, var6, 97, false);
                }
                if (var5 == 285) {
                    this.method473(var3, var4, var6, 245, false);
                }
                if (var5 == 900) {
                    NpcEntity var7 = this.field1283[var6];
                    if (var7 != null) {
                        this.method484(this.field1453.field357[0], 0, 2, var7.field357[0], false, 0, var7.field356[0], 1, 980, this.field1453.field356[0], 1, 0);
                        this.field1192 = super.field25;
                        this.field1193 = super.field26;
                        this.field1195 = 2;
                        this.field1194 = 0;
                        this.field1425.method205(false, 202);
                        this.field1425.method207(var6);
                        this.field1425.method207(this.field1401);
                        this.field1425.method207(this.field1399);
                        this.field1425.method207(this.field1400);
                    }
                }
                if (var5 == 1102) {
                    ObjType var8 = ObjType.method294(var6);
                    String var9;
                    if (var8.field879 != null) {
                        var9 = new String(var8.field879);
                    } else {
                        var9 = "It's a " + var8.field878 + ".";
                    }
                    this.method379(var9, this.field1496, "", 0);
                }
                if (var5 == 1175) {
                    int var10 = var6 >> 14 & 32767;
                    LocType var11 = LocType.method282(var10);
                    String var12;
                    if (var11.field808 != null) {
                        var12 = new String(var11.field808);
                    } else {
                        var12 = "It's a " + var11.field807 + ".";
                    }
                    this.method379(var12, this.field1496, "", 0);
                }
                if (var5 == 465) {
                    this.field1425.method205(false, 155);
                    this.field1425.method207(var4);
                    Component var13 = Component.field951[var4];
                    if (var13.field965 != null && var13.field965[0][0] == 5) {
                        int var14 = var13.field965[0][1];
                        this.field1305[var14] = 1 - this.field1305[var14];
                        this.method441(var14, (byte) 64);
                        this.field1094 = true;
                    }
                }
                if (var5 == 930) {
                    Component var15 = Component.field951[var4];
                    this.field1118 = 1;
                    this.field1119 = var4;
                    this.field1120 = var15.field1006;
                    this.field1398 = 0;
                    String var16 = var15.field1004;
                    if (var16.indexOf(" ") != -1) {
                        var16 = var16.substring(0, var16.indexOf(" "));
                    }
                    String var17 = var15.field1004;
                    if (var17.indexOf(" ") != -1) {
                        var17 = var17.substring(var17.indexOf(" ") + 1);
                    }
                    this.field1121 = var16 + " " + var15.field1005 + " " + var17;
                    if (this.field1120 == 16) {
                        this.field1094 = true;
                        this.field1241 = 3;
                        this.field1365 = true;
                    }
                } else {
                    if (var5 == 405 || var5 == 38 || var5 == 422 || var5 == 478 || var5 == 347) {
                        if (var5 == 478) {
                            if ((var3 & 3) == 0) {
                                ++field1389;
                            }
                            if (field1389 >= 90) {
                                this.field1425.method205(false, 220);
                            }
                            this.field1425.method205(false, 157);
                        }
                        if (var5 == 347) {
                            this.field1425.method205(false, 211);
                        }
                        if (var5 == 405) {
                            field1271 += var6;
                            if (field1271 >= 97) {
                                this.field1425.method205(false, 30);
                                this.field1425.method209(14953816);
                            }
                            this.field1425.method205(false, 195);
                        }
                        if (var5 == 38) {
                            this.field1425.method205(false, 71);
                        }
                        if (var5 == 422) {
                            this.field1425.method205(false, 133);
                        }
                        this.field1425.method207(var6);
                        this.field1425.method207(var3);
                        this.field1425.method207(var4);
                        this.field1492 = 0;
                        this.field1493 = var4;
                        this.field1494 = var3;
                        this.field1495 = 2;
                        if (Component.field951[var4].field957 == this.field1112) {
                            this.field1495 = 1;
                        }
                        if (Component.field951[var4].field957 == this.field1182) {
                            this.field1495 = 3;
                        }
                    }
                    if (var5 == 951) {
                        Component var18 = Component.field951[var4];
                        boolean var19 = true;
                        if (var18.field960 > 0) {
                            var19 = this.method386((byte) 80, var18);
                        }
                        if (var19) {
                            this.field1425.method205(false, 155);
                            this.field1425.method207(var4);
                        }
                    }
                    if (var5 == 367) {
                        PlayerEntity var20 = this.field1368[var6];
                        if (var20 != null) {
                            this.method484(this.field1453.field357[0], 0, 2, var20.field357[0], false, 0, var20.field356[0], 1, 980, this.field1453.field356[0], 1, 0);
                            this.field1192 = super.field25;
                            this.field1193 = super.field26;
                            this.field1195 = 2;
                            this.field1194 = 0;
                            this.field1425.method205(false, 248);
                            this.field1425.method207(var6);
                            this.field1425.method207(this.field1401);
                            this.field1425.method207(this.field1399);
                            this.field1425.method207(this.field1400);
                        }
                    }
                    if (var5 == 265) {
                        NpcEntity var21 = this.field1283[var6];
                        if (var21 != null) {
                            this.method484(this.field1453.field357[0], 0, 2, var21.field357[0], false, 0, var21.field356[0], 1, 980, this.field1453.field356[0], 1, 0);
                            this.field1192 = super.field25;
                            this.field1193 = super.field26;
                            this.field1195 = 2;
                            this.field1194 = 0;
                            this.field1425.method205(false, 134);
                            this.field1425.method207(var6);
                            this.field1425.method207(this.field1119);
                        }
                    }
                    if (var5 == 728 || var5 == 542 || var5 == 6 || var5 == 963 || var5 == 245) {
                        NpcEntity var22 = this.field1283[var6];
                        if (var22 != null) {
                            this.method484(this.field1453.field357[0], 0, 2, var22.field357[0], false, 0, var22.field356[0], 1, 980, this.field1453.field356[0], 1, 0);
                            this.field1192 = super.field25;
                            this.field1193 = super.field26;
                            this.field1195 = 2;
                            this.field1194 = 0;
                            if (var5 == 542) {
                                this.field1425.method205(false, 8);
                            }
                            if (var5 == 728) {
                                this.field1425.method205(false, 194);
                            }
                            if (var5 == 245) {
                                if ((var6 & 3) == 0) {
                                    ++field1311;
                                }
                                if (field1311 >= 85) {
                                    this.field1425.method205(false, 176);
                                    this.field1425.method207(39596);
                                }
                                this.field1425.method205(false, 100);
                            }
                            if (var5 == 6) {
                                if ((var6 & 3) == 0) {
                                    ++field1440;
                                }
                                if (field1440 >= 124) {
                                    this.field1425.method205(false, 88);
                                    this.field1425.method210(0);
                                }
                                this.field1425.method205(false, 27);
                            }
                            if (var5 == 963) {
                                this.field1425.method205(false, 113);
                            }
                            this.field1425.method207(var6);
                        }
                    }
                    if (var5 == 1607) {
                        NpcEntity var23 = this.field1283[var6];
                        if (var23 != null) {
                            String var24;
                            if (var23.field361.field848 != null) {
                                var24 = new String(var23.field361.field848);
                            } else {
                                var24 = "It's a " + var23.field361.field847 + ".";
                            }
                            this.method379(var24, this.field1496, "", 0);
                        }
                    }
                    if (var5 == 602 || var5 == 596 || var5 == 22 || var5 == 892 || var5 == 415) {
                        if (var5 == 596) {
                            this.field1425.method205(false, 59);
                        }
                        if (var5 == 22) {
                            this.field1425.method205(false, 212);
                        }
                        if (var5 == 602) {
                            this.field1425.method205(false, 31);
                        }
                        if (var5 == 415) {
                            if ((var4 & 3) == 0) {
                                ++field1514;
                            }
                            if (field1514 >= 55) {
                                this.field1425.method205(false, 17);
                                this.field1425.method210(0);
                            }
                            this.field1425.method205(false, 6);
                        }
                        if (var5 == 892) {
                            if ((var3 & 3) == 0) {
                                ++field1239;
                            }
                            if (field1239 >= 130) {
                                this.field1425.method205(false, 238);
                                this.field1425.method206(177);
                            }
                            this.field1425.method205(false, 38);
                        }
                        this.field1425.method207(var6);
                        this.field1425.method207(var3);
                        this.field1425.method207(var4);
                        this.field1492 = 0;
                        this.field1493 = var4;
                        this.field1494 = var3;
                        this.field1495 = 2;
                        if (Component.field951[var4].field957 == this.field1112) {
                            this.field1495 = 1;
                        }
                        if (Component.field951[var4].field957 == this.field1182) {
                            this.field1495 = 3;
                        }
                    }
                    if (var5 == 188) {
                        this.field1398 = 1;
                        this.field1399 = var3;
                        this.field1400 = var4;
                        this.field1401 = var6;
                        this.field1402 = ObjType.method294(var6).field878;
                        this.field1118 = 0;
                    } else {
                        if (var5 == 406 || var5 == 436 || var5 == 557 || var5 == 556) {
                            String var25 = this.field1196[arg0];
                            int var26 = var25.indexOf("@whi@");
                            if (var26 != -1) {
                                long var27 = JString.method258(var25.substring(var26 + 5).trim());
                                if (var5 == 406) {
                                    this.method465(var27, 0);
                                }
                                if (var5 == 436) {
                                    this.method377(-811, var27);
                                }
                                if (var5 == 557) {
                                    this.method374(var27, (byte) 88);
                                }
                                if (var5 == 556) {
                                    this.method493(var27, 0);
                                }
                            }
                        }
                        if (var5 == 55 && this.method473(var3, var4, var6, 9, false)) {
                            this.field1425.method207(this.field1119);
                        }
                        if (var5 == 660) {
                            if (!this.field1315) {
                                this.field1322.method90(super.field26 - 11, super.field25 - 8, true);
                            } else {
                                this.field1322.method90(var4 - 11, var3 - 8, true);
                            }
                        }
                        if (var5 == 504) {
                            this.method473(var3, var4, var6, 172, false);
                        }
                        if (var5 == 651) {
                            PlayerEntity var29 = this.field1368[var6];
                            if (var29 != null) {
                                this.method484(this.field1453.field357[0], 0, 2, var29.field357[0], false, 0, var29.field356[0], 1, 980, this.field1453.field356[0], 1, 0);
                                this.field1192 = super.field25;
                                this.field1193 = super.field26;
                                this.field1195 = 2;
                                this.field1194 = 0;
                                this.field1425.method205(false, 177);
                                this.field1425.method207(var6);
                                this.field1425.method207(this.field1119);
                            }
                        }
                        if (var5 == 1773) {
                            ObjType var30 = ObjType.method294(var6);
                            String var31;
                            if (var4 >= 100000) {
                                var31 = var4 + " x " + var30.field878;
                            } else if (var30.field879 != null) {
                                var31 = new String(var30.field879);
                            } else {
                                var31 = "It's a " + var30.field878 + ".";
                            }
                            this.method379(var31, this.field1496, "", 0);
                        }
                        if (var5 == 903 || var5 == 363) {
                            String var32 = this.field1196[arg0];
                            int var33 = var32.indexOf("@whi@");
                            if (var33 != -1) {
                                String var34 = var32.substring(var33 + 5).trim();
                                String var35 = JString.method262(0, JString.method259(JString.method258(var34), true));
                                boolean var36 = false;
                                for (int var37 = 0; var37 < this.field1369; ++var37) {
                                    PlayerEntity var38 = this.field1368[this.field1370[var37]];
                                    if (var38 != null && var38.field367 != null && var38.field367.equalsIgnoreCase(var35)) {
                                        this.method484(this.field1453.field357[0], 0, 2, var38.field357[0], false, 0, var38.field356[0], 1, 980, this.field1453.field356[0], 1, 0);
                                        if (var5 == 903) {
                                            this.field1425.method205(false, 206);
                                        }
                                        if (var5 == 363) {
                                            this.field1425.method205(false, 164);
                                        }
                                        this.field1425.method207(this.field1370[var37]);
                                        var36 = true;
                                        break;
                                    }
                                }
                                if (!var36) {
                                    this.method379("Unable to find " + var35, this.field1496, "", 0);
                                }
                            }
                        }
                        if (var5 == 391) {
                            this.field1425.method205(false, 48);
                            this.field1425.method207(var6);
                            this.field1425.method207(var3);
                            this.field1425.method207(var4);
                            this.field1425.method207(this.field1119);
                            this.field1492 = 0;
                            this.field1493 = var4;
                            this.field1494 = var3;
                            this.field1495 = 2;
                            if (Component.field951[var4].field957 == this.field1112) {
                                this.field1495 = 1;
                            }
                            if (Component.field951[var4].field957 == this.field1182) {
                                this.field1495 = 3;
                            }
                        }
                        if (var5 == 1501) {
                            field1187 += this.field1174;
                            if (field1187 >= 92) {
                                this.field1425.method205(false, 66);
                                this.field1425.method210(0);
                            }
                            this.method473(var3, var4, var6, 116, false);
                        }
                        if (var5 == 364) {
                            this.method473(var3, var4, var6, 96, false);
                        }
                        if (var5 == 965) {
                            boolean var39 = this.method484(this.field1453.field357[0], 0, 2, var4, false, 0, var3, 0, 980, this.field1453.field356[0], 0, 0);
                            if (!var39) {
                                this.method484(this.field1453.field357[0], 0, 2, var4, false, 0, var3, 1, 980, this.field1453.field356[0], 1, 0);
                            }
                            this.field1192 = super.field25;
                            this.field1193 = super.field26;
                            this.field1195 = 2;
                            this.field1194 = 0;
                            this.field1425.method205(false, 138);
                            this.field1425.method207(this.field1173 + var3);
                            this.field1425.method207(this.field1174 + var4);
                            this.field1425.method207(var6);
                            this.field1425.method207(this.field1119);
                        }
                        if (var5 == 881) {
                            this.field1425.method205(false, 130);
                            this.field1425.method207(var6);
                            this.field1425.method207(var3);
                            this.field1425.method207(var4);
                            this.field1425.method207(this.field1401);
                            this.field1425.method207(this.field1399);
                            this.field1425.method207(this.field1400);
                            this.field1492 = 0;
                            this.field1493 = var4;
                            this.field1494 = var3;
                            this.field1495 = 2;
                            if (Component.field951[var4].field957 == this.field1112) {
                                this.field1495 = 1;
                            }
                            if (Component.field951[var4].field957 == this.field1182) {
                                this.field1495 = 3;
                            }
                        }
                        if (var5 == 217) {
                            boolean var41 = this.method484(this.field1453.field357[0], 0, 2, var4, false, 0, var3, 0, 980, this.field1453.field356[0], 0, 0);
                            if (!var41) {
                                this.method484(this.field1453.field357[0], 0, 2, var4, false, 0, var3, 1, 980, this.field1453.field356[0], 1, 0);
                            }
                            this.field1192 = super.field25;
                            this.field1193 = super.field26;
                            this.field1195 = 2;
                            this.field1194 = 0;
                            this.field1425.method205(false, 239);
                            this.field1425.method207(this.field1173 + var3);
                            this.field1425.method207(this.field1174 + var4);
                            this.field1425.method207(var6);
                            this.field1425.method207(this.field1401);
                            this.field1425.method207(this.field1399);
                            this.field1425.method207(this.field1400);
                        }
                        if (var5 == 224 || var5 == 993 || var5 == 99 || var5 == 746 || var5 == 877) {
                            boolean var43 = this.method484(this.field1453.field357[0], 0, 2, var4, false, 0, var3, 0, 980, this.field1453.field356[0], 0, 0);
                            if (!var43) {
                                this.method484(this.field1453.field357[0], 0, 2, var4, false, 0, var3, 1, 980, this.field1453.field356[0], 1, 0);
                            }
                            this.field1192 = super.field25;
                            this.field1193 = super.field26;
                            this.field1195 = 2;
                            this.field1194 = 0;
                            if (var5 == 746) {
                                this.field1425.method205(false, 178);
                            }
                            if (var5 == 99) {
                                this.field1425.method205(false, 200);
                            }
                            if (var5 == 224) {
                                this.field1425.method205(false, 140);
                            }
                            if (var5 == 993) {
                                this.field1425.method205(false, 40);
                            }
                            if (var5 == 877) {
                                this.field1425.method205(false, 247);
                            }
                            this.field1425.method207(this.field1173 + var3);
                            this.field1425.method207(this.field1174 + var4);
                            this.field1425.method207(var6);
                        }
                        if (var5 == 1373 || var5 == 1544 || var5 == 151 || var5 == 1101) {
                            PlayerEntity var45 = this.field1368[var6];
                            if (var45 != null) {
                                this.method484(this.field1453.field357[0], 0, 2, var45.field357[0], false, 0, var45.field356[0], 1, 980, this.field1453.field356[0], 1, 0);
                                this.field1192 = super.field25;
                                this.field1193 = super.field26;
                                this.field1195 = 2;
                                this.field1194 = 0;
                                if (var5 == 1373) {
                                    this.field1425.method205(false, 206);
                                }
                                if (var5 == 1101) {
                                    this.field1425.method205(false, 164);
                                }
                                if (var5 == 1544) {
                                    this.field1425.method205(false, 185);
                                }
                                if (var5 == 151) {
                                    ++field1127;
                                    if (field1127 >= 90) {
                                        this.field1425.method205(false, 2);
                                        this.field1425.method207(31114);
                                    }
                                    this.field1425.method205(false, 53);
                                }
                                this.field1425.method207(var6);
                            }
                        }
                        if (var5 == 947) {
                            this.method422(this.field1498);
                        }
                        if (var5 == 679) {
                            String var46 = this.field1196[arg0];
                            int var47 = var46.indexOf("@whi@");
                            if (var47 != -1) {
                                long var48 = JString.method258(var46.substring(var47 + 5).trim());
                                int var50 = -1;
                                for (int var51 = 0; var51 < this.field1199; ++var51) {
                                    if (this.field1355[var51] == var48) {
                                        var50 = var51;
                                        break;
                                    }
                                }
                                if (var50 != -1 && this.field1412[var50] > 0) {
                                    this.field1171 = true;
                                    this.field1113 = false;
                                    this.field1333 = true;
                                    this.field1183 = "";
                                    this.field1391 = 3;
                                    this.field1216 = this.field1355[var50];
                                    this.field1458 = "Enter message to send to " + this.field1206[var50];
                                }
                            }
                        }
                        if (var5 == 960) {
                            this.field1425.method205(false, 155);
                            this.field1425.method207(var4);
                            Component var52 = Component.field951[var4];
                            if (var52.field965 != null && var52.field965[0][0] == 5) {
                                int var53 = var52.field965[0][1];
                                if (this.field1305[var53] != var52.field967[0]) {
                                    this.field1305[var53] = var52.field967[0];
                                    this.method441(var53, (byte) 64);
                                    this.field1094 = true;
                                }
                            }
                        }
                        if (var5 == 34) {
                            String var54 = this.field1196[arg0];
                            int var55 = var54.indexOf("@whi@");
                            if (var55 != -1) {
                                this.method422(this.field1498);
                                this.field1277 = var54.substring(var55 + 5).trim();
                                this.field1203 = false;
                                for (int var56 = 0; var56 < Component.field951.length; ++var56) {
                                    if (Component.field951[var56] != null && Component.field951[var56].field960 == 600) {
                                        this.field1455 = this.field1112 = Component.field951[var56].field957;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var5 == 44 && !this.field1459) {
                            this.field1425.method205(false, 235);
                            this.field1425.method207(var4);
                            this.field1459 = true;
                        }
                        this.field1398 = 0;
                        this.field1118 = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILkb;)V")
    private final void method437(boolean arg0, int arg1, Packet arg2) {
        this.field1297 = 0;
        this.field1371 = 0;
        this.method372(-186, arg2, arg1);
        if (!arg0) {
            this.field1296 = !this.field1296;
        }
        this.method421(arg1, (byte) -55, arg2);
        this.method444(arg2, arg1, 473);
        for (int var4 = 0; var4 < this.field1297; ++var4) {
            int var6 = this.field1298[var4];
            if (field1356 != this.field1283[var6].field352) {
                this.field1283[var6].field361 = null;
                this.field1283[var6] = null;
            }
        }
        if (arg2.field624 != arg1) {
            signlink.reporterror(this.field1236 + " size mismatch in getnpcpos - pos:" + arg2.field624 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1284; ++var5) {
                if (this.field1283[this.field1285[var5]] == null) {
                    signlink.reporterror(this.field1236 + " null entry in npc list - pos:" + var5 + " size:" + this.field1284);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method438(int arg0) {
        if (this.field1398 == 0 && this.field1118 == 0) {
            this.field1196[this.field1167] = "Walk here";
            this.field1446[this.field1167] = 660;
            this.field1444[this.field1167] = super.field22;
            this.field1445[this.field1167] = super.field23;
            ++this.field1167;
        }
        int var2 = -1;
        if (arg0 != 0) {
            this.field1422 = !this.field1422;
        }
        for (int var3 = 0; var3 < Model.field532; ++var3) {
            int var4 = Model.field533[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1322.method82(this.field1221, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method282(var8);
                    if (this.field1398 == 1) {
                        this.field1196[this.field1167] = "Use " + this.field1402 + " with @cya@" + var9.field807;
                        this.field1446[this.field1167] = 450;
                        this.field1447[this.field1167] = var4;
                        this.field1444[this.field1167] = var5;
                        this.field1445[this.field1167] = var6;
                        ++this.field1167;
                    } else if (this.field1118 == 1) {
                        if ((this.field1120 & 4) == 4) {
                            this.field1196[this.field1167] = this.field1121 + " @cya@" + var9.field807;
                            this.field1446[this.field1167] = 55;
                            this.field1447[this.field1167] = var4;
                            this.field1444[this.field1167] = var5;
                            this.field1445[this.field1167] = var6;
                            ++this.field1167;
                        }
                    } else {
                        if (var9.field823 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field823[var10] != null) {
                                    this.field1196[this.field1167] = var9.field823[var10] + " @cya@" + var9.field807;
                                    if (var10 == 0) {
                                        this.field1446[this.field1167] = 285;
                                    }
                                    if (var10 == 1) {
                                        this.field1446[this.field1167] = 504;
                                    }
                                    if (var10 == 2) {
                                        this.field1446[this.field1167] = 364;
                                    }
                                    if (var10 == 3) {
                                        this.field1446[this.field1167] = 581;
                                    }
                                    if (var10 == 4) {
                                        this.field1446[this.field1167] = 1501;
                                    }
                                    this.field1447[this.field1167] = var4;
                                    this.field1444[this.field1167] = var5;
                                    this.field1445[this.field1167] = var6;
                                    ++this.field1167;
                                }
                            }
                        }
                        this.field1196[this.field1167] = "Examine @cya@" + var9.field807;
                        this.field1446[this.field1167] = 1175;
                        this.field1447[this.field1167] = var4;
                        this.field1444[this.field1167] = var5;
                        this.field1445[this.field1167] = var6;
                        ++this.field1167;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1283[var8];
                    if (var11.field361.field849 == 1 && (var11.field308 & 127) == 64 && (var11.field309 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1284; ++var12) {
                            NpcEntity var13 = this.field1283[this.field1285[var12]];
                            if (var13 != null && var11 != var13 && var13.field361.field849 == 1 && var11.field308 == var13.field308 && var11.field309 == var13.field309) {
                                this.method412(var6, false, this.field1285[var12], var5, var13.field361);
                            }
                        }
                    }
                    this.method412(var6, false, var8, var5, var11.field361);
                }
                if (var7 == 0) {
                    PlayerEntity var14 = this.field1368[var8];
                    if ((var14.field308 & 127) == 64 && (var14.field309 & 127) == 64) {
                        for (int var15 = 0; var15 < this.field1284; ++var15) {
                            NpcEntity var18 = this.field1283[this.field1285[var15]];
                            if (var18 != null && var18.field361.field849 == 1 && var14.field308 == var18.field308 && var14.field309 == var18.field309) {
                                this.method412(var6, false, this.field1285[var15], var5, var18.field361);
                            }
                        }
                        for (int var16 = 0; var16 < this.field1369; ++var16) {
                            PlayerEntity var17 = this.field1368[this.field1370[var16]];
                            if (var17 != null && var14 != var17 && var14.field308 == var17.field308 && var14.field309 == var17.field309) {
                                this.method468(0, var17, var6, var5, this.field1370[var16]);
                            }
                        }
                    }
                    this.method468(0, var14, var6, var5, var8);
                }
                if (var7 == 3) {
                    LinkList var19 = this.field1418[this.field1221][var5][var6];
                    if (var19 != null) {
                        for (ObjStackEntity var20 = (ObjStackEntity) var19.method236(485); var20 != null; var20 = (ObjStackEntity) var19.method238((byte) 6)) {
                            ObjType var21 = ObjType.method294(var20.field303);
                            if (this.field1398 == 1) {
                                this.field1196[this.field1167] = "Use " + this.field1402 + " with @lre@" + var21.field878;
                                this.field1446[this.field1167] = 217;
                                this.field1447[this.field1167] = var20.field303;
                                this.field1444[this.field1167] = var5;
                                this.field1445[this.field1167] = var6;
                                ++this.field1167;
                            } else if (this.field1118 == 1) {
                                if ((this.field1120 & 1) == 1) {
                                    this.field1196[this.field1167] = this.field1121 + " @lre@" + var21.field878;
                                    this.field1446[this.field1167] = 965;
                                    this.field1447[this.field1167] = var20.field303;
                                    this.field1444[this.field1167] = var5;
                                    this.field1445[this.field1167] = var6;
                                    ++this.field1167;
                                }
                            } else {
                                for (int var22 = 4; var22 >= 0; --var22) {
                                    if (var21.field893 != null && var21.field893[var22] != null) {
                                        this.field1196[this.field1167] = var21.field893[var22] + " @lre@" + var21.field878;
                                        if (var22 == 0) {
                                            this.field1446[this.field1167] = 224;
                                        }
                                        if (var22 == 1) {
                                            this.field1446[this.field1167] = 993;
                                        }
                                        if (var22 == 2) {
                                            this.field1446[this.field1167] = 99;
                                        }
                                        if (var22 == 3) {
                                            this.field1446[this.field1167] = 746;
                                        }
                                        if (var22 == 4) {
                                            this.field1446[this.field1167] = 877;
                                        }
                                        this.field1447[this.field1167] = var20.field303;
                                        this.field1444[this.field1167] = var5;
                                        this.field1445[this.field1167] = var6;
                                        ++this.field1167;
                                    } else if (var22 == 2) {
                                        this.field1196[this.field1167] = "Take @lre@" + var21.field878;
                                        this.field1446[this.field1167] = 99;
                                        this.field1447[this.field1167] = var20.field303;
                                        this.field1444[this.field1167] = var5;
                                        this.field1445[this.field1167] = var6;
                                        ++this.field1167;
                                    }
                                }
                                this.field1196[this.field1167] = "Examine @lre@" + var21.field878;
                                this.field1446[this.field1167] = 1102;
                                this.field1447[this.field1167] = var20.field303;
                                this.field1444[this.field1167] = var5;
                                this.field1445[this.field1167] = var6;
                                ++this.field1167;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILkb;B)V")
    private final void method439(int arg0, Packet arg1, byte arg2) {
        if (this.field1426 == arg2) {
            boolean var4 = false;
        } else {
            this.method6();
        }
        while (arg1.field625 + 10 < arg0 * 8) {
            int var5 = arg1.method227(11, (byte) 6);
            if (var5 == 2047) {
                break;
            }
            if (this.field1368[var5] == null) {
                this.field1368[var5] = new PlayerEntity();
                if (this.field1373[var5] != null) {
                    this.field1368[var5].method114(this.field1373[var5], (byte) 4);
                }
            }
            this.field1370[this.field1369++] = var5;
            PlayerEntity var6 = this.field1368[var5];
            var6.field352 = field1356;
            int var7 = arg1.method227(5, (byte) 6);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg1.method227(5, (byte) 6);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = arg1.method227(1, (byte) 6);
            var6.method110(this.field1453.field356[0] + var7, -398, var9 == 1, this.field1453.field357[0] + var8);
            int var10 = arg1.method227(1, (byte) 6);
            if (var10 == 1) {
                this.field1372[this.field1371++] = var5;
            }
        }
        arg1.method228(-561);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;IZ)V")
    private final void method440(Packet arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < this.field1371; ++var4) {
            int var5 = this.field1372[var4];
            PlayerEntity var6 = this.field1368[var5];
            int var7 = arg0.method216();
            if ((var7 & 128) == 128) {
                var7 += arg0.method216() << 8;
            }
            this.method445(var5, var6, arg0, -931, var7);
        }
        if (arg2) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IB)V")
    public final void method441(int arg0, byte arg1) {
        if (arg1 == 64) {
            int var3 = VarpType.field1049[arg0].field1057;
            if (var3 != 0) {
                int var4 = this.field1305[arg0];
                if (var3 == 1) {
                    if (var4 == 1) {
                        Pix3D.method163(-37756, 0.9D);
                    }
                    if (var4 == 2) {
                        Pix3D.method163(-37756, 0.8D);
                    }
                    if (var4 == 3) {
                        Pix3D.method163(-37756, 0.7D);
                    }
                    if (var4 == 4) {
                        Pix3D.method163(-37756, 0.6D);
                    }
                    ObjType.field912.method105();
                    this.field1439 = true;
                }
                if (var3 == 3) {
                    boolean var5 = this.field1246;
                    if (var4 == 0) {
                        this.method478(this.field1111, 0, this.field1246);
                        this.field1246 = true;
                    }
                    if (var4 == 1) {
                        this.method478(this.field1111, -400, this.field1246);
                        this.field1246 = true;
                    }
                    if (var4 == 2) {
                        this.method478(this.field1111, -800, this.field1246);
                        this.field1246 = true;
                    }
                    if (var4 == 3) {
                        this.method478(this.field1111, -1200, this.field1246);
                        this.field1246 = true;
                    }
                    if (var4 == 4) {
                        this.field1246 = false;
                    }
                    if (this.field1246 != var5) {
                        if (this.field1246) {
                            this.method485(this.field1163, this.field1323, this.field1392, -242);
                        } else {
                            this.method390(false);
                        }
                        this.field1107 = 0;
                    }
                }
                if (var3 == 4) {
                    if (var4 == 0) {
                        this.field1162 = true;
                        this.method385(0, 0);
                    }
                    if (var4 == 1) {
                        this.field1162 = true;
                        this.method385(-400, 0);
                    }
                    if (var4 == 2) {
                        this.field1162 = true;
                        this.method385(-800, 0);
                    }
                    if (var4 == 3) {
                        this.field1162 = true;
                        this.method385(-1200, 0);
                    }
                    if (var4 == 4) {
                        this.field1162 = false;
                    }
                }
                if (var3 == 5) {
                    this.field1509 = var4;
                }
                if (var3 == 6) {
                    this.field1225 = var4;
                }
                if (var3 == 8) {
                    this.field1395 = var4;
                    this.field1171 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method442(int arg0) {
        for (int var2 = 0; var2 < this.field1284; ++var2) {
            NpcEntity var3 = this.field1283[this.field1285[var2]];
            int var4 = (this.field1285[var2] << 14) + 536870912;
            if (var3 != null && var3.method112(574)) {
                int var5 = var3.field308 >> 7;
                int var6 = var3.field309 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field312 == 1 && (var3.field308 & 127) == 64 && (var3.field309 & 127) == 64) {
                        if (this.field1431[var5][var6] == this.field1348) {
                            continue;
                        }
                        this.field1431[var5][var6] = this.field1348;
                    }
                    this.field1322.method62((var3.field312 - 1) * 64 + 60, var3.field308, var3.field309, (Model) null, var4, this.method495(var3.field309, false, this.field1221, var3.field308), var3.field310, false, this.field1221, var3, var3.field311);
                }
            }
        }
        this.field1089 += arg0;
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method443(int arg0) {
        this.field1383.method242(false);
        while (arg0 >= 0) {
            this.method6();
        }
        Pix3D.field571 = this.field1507;
        this.field1379.method189(0, -462, 0);
        if (this.field1462 != -1) {
            this.method371(0, 0, Component.field951[this.field1462], 0, 0);
        } else if (this.field1110[this.field1241] != -1) {
            this.method371(0, 0, Component.field951[this.field1110[this.field1241]], 0, 0);
        }
        if (this.field1315 && this.field1157 == 1) {
            this.method409(7);
        }
        this.field1383.method243(super.field15, 231, 2, 562);
        this.field1385.method242(false);
        Pix3D.field571 = this.field1508;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;II)V")
    private final void method444(Packet arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1371; ++var4) {
            int var5 = this.field1372[var4];
            NpcEntity var6 = this.field1283[var5];
            int var7 = arg0.method216();
            if ((var7 & 2) == 2) {
                int var8 = arg0.method218();
                if (var8 == 65535) {
                    var8 = -1;
                }
                if (var6.field335 == var8) {
                    var6.field339 = 0;
                }
                int var9 = arg0.method216();
                if (var8 == -1 || var6.field335 == -1 || SeqType.field1018[var8].field1026 > SeqType.field1018[var6.field335].field1026 || SeqType.field1018[var6.field335].field1026 == 0) {
                    var6.field335 = var8;
                    var6.field336 = 0;
                    var6.field337 = 0;
                    var6.field338 = var9;
                    var6.field339 = 0;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field329 = arg0.method218();
                if (var6.field329 == 65535) {
                    var6.field329 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field320 = arg0.method223();
                var6.field321 = 100;
            }
            if ((var7 & 16) == 16) {
                var6.field324 = arg0.method216();
                var6.field325 = arg0.method216();
                var6.field326 = field1356 + 400;
                var6.field327 = arg0.method216();
                var6.field328 = arg0.method216();
            }
            if ((var7 & 32) == 32) {
                var6.field361 = NpcType.method288(arg0.method218());
                var6.field315 = var6.field361.field853;
                var6.field316 = var6.field361.field854;
                var6.field317 = var6.field361.field855;
                var6.field318 = var6.field361.field856;
                var6.field313 = var6.field361.field852;
            }
            if ((var7 & 64) == 64) {
                var6.field340 = arg0.method218();
                int var10 = arg0.method221();
                var6.field344 = var10 >> 16;
                var6.field343 = (var10 & 65535) + field1356;
                var6.field341 = 0;
                var6.field342 = 0;
                if (var6.field343 > field1356) {
                    var6.field341 = -1;
                }
                if (var6.field340 == 65535) {
                    var6.field340 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field330 = arg0.method218();
                var6.field331 = arg0.method218();
            }
        }
        if (arg2 <= 0) {
            this.field1090 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILz;Lkb;II)V")
    private final void method445(int arg0, PlayerEntity arg1, Packet arg2, int arg3, int arg4) {
        while (arg3 >= 0) {
            this.field1418 = null;
        }
        if ((arg4 & 1) == 1) {
            int var6 = arg2.method216();
            byte[] var7 = new byte[var6];
            Packet var8 = new Packet((byte) 64, var7);
            arg2.method225(var6, 5, var7, 0);
            this.field1373[arg0] = var8;
            arg1.method114(var8, (byte) 4);
        }
        if ((arg4 & 2) == 2) {
            int var9 = arg2.method218();
            if (var9 == 65535) {
                var9 = -1;
            }
            if (arg1.field335 == var9) {
                arg1.field339 = 0;
            }
            int var10 = arg2.method216();
            if (var9 == -1 || arg1.field335 == -1 || SeqType.field1018[var9].field1026 > SeqType.field1018[arg1.field335].field1026 || SeqType.field1018[arg1.field335].field1026 == 0) {
                arg1.field335 = var9;
                arg1.field336 = 0;
                arg1.field337 = 0;
                arg1.field338 = var10;
                arg1.field339 = 0;
            }
        }
        if ((arg4 & 4) == 4) {
            arg1.field329 = arg2.method218();
            if (arg1.field329 == 65535) {
                arg1.field329 = -1;
            }
        }
        if ((arg4 & 8) == 8) {
            arg1.field320 = arg2.method223();
            arg1.field322 = 0;
            arg1.field323 = 0;
            arg1.field321 = 150;
            this.method379(arg1.field320, this.field1496, arg1.field367, 2);
        }
        if ((arg4 & 16) == 16) {
            arg1.field324 = arg2.method216();
            arg1.field325 = arg2.method216();
            arg1.field326 = field1356 + 400;
            arg1.field327 = arg2.method216();
            arg1.field328 = arg2.method216();
        }
        if ((arg4 & 32) == 32) {
            arg1.field330 = arg2.method218();
            arg1.field331 = arg2.method218();
        }
        if ((arg4 & 64) == 64) {
            int var11 = arg2.method218();
            int var12 = arg2.method216();
            int var13 = arg2.method216();
            int var14 = arg2.field624;
            if (arg1.field367 != null) {
                long var15 = JString.method258(arg1.field367);
                boolean var17 = false;
                if (var12 <= 1) {
                    for (int var18 = 0; var18 < this.field1307; ++var18) {
                        if (this.field1249[var18] == var15) {
                            var17 = true;
                            break;
                        }
                    }
                }
                if (!var17 && this.field1164 == 0) {
                    try {
                        String var19 = WordPack.method265(arg2, (byte) 1, var13);
                        String var20 = WordFilter.method343(var19, 400);
                        arg1.field320 = var20;
                        arg1.field322 = var11 >> 8;
                        arg1.field323 = var11 & 255;
                        arg1.field321 = 150;
                        if (var12 > 1) {
                            this.method379(var20, this.field1496, arg1.field367, 1);
                        } else {
                            this.method379(var20, this.field1496, arg1.field367, 2);
                        }
                    } catch (Exception var23) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg2.field624 = var13 + var14;
        }
        if ((arg4 & 256) == 256) {
            arg1.field340 = arg2.method218();
            int var22 = arg2.method221();
            arg1.field344 = var22 >> 16;
            arg1.field343 = (var22 & 65535) + field1356;
            arg1.field341 = 0;
            arg1.field342 = 0;
            if (arg1.field343 > field1356) {
                arg1.field341 = -1;
            }
            if (arg1.field340 == 65535) {
                arg1.field340 = -1;
            }
        }
        if ((arg4 & 512) == 512) {
            arg1.field345 = arg2.method216();
            arg1.field347 = arg2.method216();
            arg1.field346 = arg2.method216();
            arg1.field348 = arg2.method216();
            arg1.field349 = arg2.method218() + field1356;
            arg1.field350 = arg2.method218() + field1356;
            arg1.field351 = arg2.method216();
            arg1.field355 = 0;
            arg1.field356[0] = arg1.field346;
            arg1.field357[0] = arg1.field348;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method446(byte arg0) {
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            this.field1425.method206(142);
        }
        if (this.field1395 != 0) {
            PixFont var3 = this.field1273;
            int var4 = 0;
            if (this.field1421 != 0) {
                var4 = 1;
            }
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field1269[var5] != null) {
                    int var6 = this.field1267[var5];
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field1106 == 0 || this.field1106 == 1 && this.method470(this.field1268[var5], 0))) {
                        int var7 = 329 - var4 * 13;
                        var3.method194(var7, "From " + this.field1268[var5] + ": " + this.field1269[var5], 0, 4, 0);
                        var3.method194(var7 - 1, "From " + this.field1268[var5] + ": " + this.field1269[var5], 65535, 4, 0);
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 5 && this.field1106 < 2) {
                        int var8 = 329 - var4 * 13;
                        var3.method194(var8, this.field1269[var5], 0, 4, 0);
                        var3.method194(var8 - 1, this.field1269[var5], 65535, 4, 0);
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 6 && this.field1106 < 2) {
                        int var9 = 329 - var4 * 13;
                        var3.method194(var9, "To " + this.field1268[var5] + ": " + this.field1269[var5], 0, 4, 0);
                        var3.method194(var9 - 1, "To " + this.field1268[var5] + ": " + this.field1269[var5], 65535, 4, 0);
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method447(int arg0) {
        SpotAnimEntity var2 = (SpotAnimEntity) this.field1149.method235();
        if (arg0 >= 0) {
            field1349 = this.field1363.method253();
        }
        while (var2 != null) {
            if (this.field1221 == var2.field419 && !var2.field425) {
                if (field1356 >= var2.field418) {
                    var2.method119(this.field1456, 8);
                    if (var2.field425) {
                        var2.method108();
                    } else {
                        this.field1322.method62(60, var2.field420, var2.field421, (Model) null, -1, var2.field422, 0, false, var2.field419, var2, false);
                    }
                }
            } else {
                var2.method108();
            }
            var2 = (SpotAnimEntity) this.field1149.method237(-754);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method448(byte arg0) {
        if (arg0 == -24) {
            for (int var2 = 0; var2 < this.field1284; ++var2) {
                int var3 = this.field1285[var2];
                NpcEntity var4 = this.field1283[var3];
                if (var4 != null) {
                    this.method449(var4, true, var4.field361.field849);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lx;ZI)V")
    public final void method449(PathingEntity arg0, boolean arg1, int arg2) {
        if (arg0.field308 < 128 || arg0.field309 < 128 || arg0.field308 >= 13184 || arg0.field309 >= 13184) {
            arg0.field335 = -1;
            arg0.field340 = -1;
            arg0.field349 = 0;
            arg0.field350 = 0;
            arg0.field308 = arg0.field356[0] * 128 + arg0.field312 * 64;
            arg0.field309 = arg0.field357[0] * 128 + arg0.field312 * 64;
            arg0.field355 = 0;
        }
        if (this.field1453 == arg0 && (arg0.field308 < 1536 || arg0.field309 < 1536 || arg0.field308 >= 11776 || arg0.field309 >= 11776)) {
            arg0.field335 = -1;
            arg0.field340 = -1;
            arg0.field349 = 0;
            arg0.field350 = 0;
            arg0.field308 = arg0.field356[0] * 128 + arg0.field312 * 64;
            arg0.field309 = arg0.field357[0] * 128 + arg0.field312 * 64;
            arg0.field355 = 0;
        }
        if (arg0.field349 > field1356) {
            this.method450(arg0, 773);
        } else if (arg0.field350 >= field1356) {
            this.method451(arg0, 0);
        } else {
            this.method452(arg0, 7);
        }
        this.method453(false, arg0);
        this.method454(-39261, arg0);
        this.field1169 &= arg1;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lx;I)V")
    public final void method450(PathingEntity arg0, int arg1) {
        int var3 = arg0.field349 - field1356;
        int var4 = 85 / arg1;
        int var5 = arg0.field345 * 128 + arg0.field312 * 64;
        int var6 = arg0.field347 * 128 + arg0.field312 * 64;
        arg0.field308 += (var5 - arg0.field308) / var3;
        arg0.field309 += (var6 - arg0.field309) / var3;
        arg0.field359 = 0;
        if (arg0.field351 == 0) {
            arg0.field354 = 1024;
        }
        if (arg0.field351 == 1) {
            arg0.field354 = 1536;
        }
        if (arg0.field351 == 2) {
            arg0.field354 = 0;
        }
        if (arg0.field351 == 3) {
            arg0.field354 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lx;I)V")
    public final void method451(PathingEntity arg0, int arg1) {
        if (field1356 == arg0.field350 || arg0.field335 == -1 || arg0.field338 != 0 || arg0.field337 + 1 > SeqType.field1018[arg0.field335].field1022[arg0.field336]) {
            int var3 = arg0.field350 - arg0.field349;
            int var4 = field1356 - arg0.field349;
            int var5 = arg0.field345 * 128 + arg0.field312 * 64;
            int var6 = arg0.field347 * 128 + arg0.field312 * 64;
            int var7 = arg0.field346 * 128 + arg0.field312 * 64;
            int var8 = arg0.field348 * 128 + arg0.field312 * 64;
            arg0.field308 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field309 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field359 = 0;
        if (arg1 < 0 || arg1 > 0) {
            this.field1498 = 107;
        }
        if (arg0.field351 == 0) {
            arg0.field354 = 1024;
        }
        if (arg0.field351 == 1) {
            arg0.field354 = 1536;
        }
        if (arg0.field351 == 2) {
            arg0.field354 = 0;
        }
        if (arg0.field351 == 3) {
            arg0.field354 = 512;
        }
        arg0.field310 = arg0.field354;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Lx;I)V")
    public final void method452(PathingEntity arg0, int arg1) {
        arg0.field332 = arg0.field313;
        if (arg0.field355 == 0) {
            arg0.field359 = 0;
        } else {
            if (arg0.field335 != -1 && arg0.field338 == 0) {
                SeqType var3 = SeqType.field1018[arg0.field335];
                if (var3.field1024 == null) {
                    ++arg0.field359;
                    return;
                }
            }
            int var4 = arg0.field308;
            int var5 = arg0.field309;
            int var6 = arg0.field356[arg0.field355 - 1] * 128 + arg0.field312 * 64;
            int var7 = arg0.field357[arg0.field355 - 1] * 128 + arg0.field312 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field354 = 1280;
                    } else if (var5 > var7) {
                        arg0.field354 = 1792;
                    } else {
                        arg0.field354 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field354 = 768;
                    } else if (var5 > var7) {
                        arg0.field354 = 256;
                    } else {
                        arg0.field354 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field354 = 1024;
                } else {
                    arg0.field354 = 0;
                }
                int var8 = arg0.field354 - arg0.field310 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field316;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field315;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field318;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field317;
                }
                if (var9 == -1) {
                    var9 = arg0.field315;
                }
                arg0.field332 = var9;
                int var10 = 4;
                if (arg1 == 7) {
                    if (arg0.field354 != arg0.field310 && arg0.field329 == -1) {
                        var10 = 2;
                    }
                    if (arg0.field355 > 2) {
                        var10 = 6;
                    }
                    if (arg0.field355 > 3) {
                        var10 = 8;
                    }
                    if (arg0.field359 > 0 && arg0.field355 > 1) {
                        var10 = 8;
                        --arg0.field359;
                    }
                    if (arg0.field358[arg0.field355 - 1]) {
                        var10 <<= 1;
                    }
                    if (var10 >= 8 && arg0.field332 == arg0.field315 && arg0.field319 != -1) {
                        arg0.field332 = arg0.field319;
                    }
                    if (var4 < var6) {
                        arg0.field308 += var10;
                        if (arg0.field308 > var6) {
                            arg0.field308 = var6;
                        }
                    } else if (var4 > var6) {
                        arg0.field308 -= var10;
                        if (arg0.field308 < var6) {
                            arg0.field308 = var6;
                        }
                    }
                    if (var5 < var7) {
                        arg0.field309 += var10;
                        if (arg0.field309 > var7) {
                            arg0.field309 = var7;
                        }
                    } else if (var5 > var7) {
                        arg0.field309 -= var10;
                        if (arg0.field309 < var7) {
                            arg0.field309 = var7;
                        }
                    }
                    if (arg0.field308 == var6 && arg0.field309 == var7) {
                        --arg0.field355;
                    }
                }
            } else {
                arg0.field308 = var6;
                arg0.field309 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLx;)V")
    public final void method453(boolean arg0, PathingEntity arg1) {
        if (arg0) {
            this.field1168 = -122;
        }
        if (arg1.field329 != -1 && arg1.field329 < 32768) {
            NpcEntity var3 = this.field1283[arg1.field329];
            if (var3 != null) {
                int var4 = arg1.field308 - var3.field308;
                int var5 = arg1.field309 - var3.field309;
                if (var4 != 0 || var5 != 0) {
                    arg1.field354 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                }
            }
        }
        if (arg1.field329 >= 32768) {
            int var6 = arg1.field329 - 32768;
            if (this.field1282 == var6) {
                var6 = this.field1367;
            }
            PlayerEntity var7 = this.field1368[var6];
            if (var7 != null) {
                int var8 = arg1.field308 - var7.field308;
                int var9 = arg1.field309 - var7.field309;
                if (var8 != 0 || var9 != 0) {
                    arg1.field354 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                }
            }
        }
        if ((arg1.field330 != 0 || arg1.field331 != 0) && (arg1.field355 == 0 || arg1.field359 > 0)) {
            int var10 = arg1.field308 - (arg1.field330 - this.field1173 - this.field1173) * 64;
            int var11 = arg1.field309 - (arg1.field331 - this.field1174 - this.field1174) * 64;
            if (var10 != 0 || var11 != 0) {
                arg1.field354 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
            }
            arg1.field330 = 0;
            arg1.field331 = 0;
        }
        int var12 = arg1.field354 - arg1.field310 & 2047;
        if (var12 != 0) {
            if (var12 >= 32 && var12 <= 2016) {
                if (var12 > 1024) {
                    arg1.field310 -= 32;
                } else {
                    arg1.field310 += 32;
                }
            } else {
                arg1.field310 = arg1.field354;
            }
            arg1.field310 &= 2047;
            if (arg1.field332 == arg1.field313 && arg1.field354 != arg1.field310) {
                if (arg1.field314 != -1) {
                    arg1.field332 = arg1.field314;
                    return;
                }
                arg1.field332 = arg1.field315;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILx;)V")
    public final void method454(int arg0, PathingEntity arg1) {
        if (arg0 != -39261) {
            this.field1425.method206(144);
        }
        arg1.field311 = false;
        if (arg1.field332 != -1) {
            SeqType var3 = SeqType.field1018[arg1.field332];
            ++arg1.field334;
            if (arg1.field333 < var3.field1019 && arg1.field334 > var3.field1022[arg1.field333]) {
                arg1.field334 = 0;
                ++arg1.field333;
            }
            if (arg1.field333 >= var3.field1019) {
                arg1.field334 = 0;
                arg1.field333 = 0;
            }
        }
        if (arg1.field335 != -1 && arg1.field338 == 0) {
            SeqType var4 = SeqType.field1018[arg1.field335];
            ++arg1.field337;
            while (arg1.field336 < var4.field1019 && arg1.field337 > var4.field1022[arg1.field336]) {
                arg1.field337 -= var4.field1022[arg1.field336];
                ++arg1.field336;
            }
            if (arg1.field336 >= var4.field1019) {
                arg1.field336 -= var4.field1023;
                ++arg1.field339;
                if (arg1.field339 >= var4.field1029) {
                    arg1.field335 = -1;
                }
                if (arg1.field336 < 0 || arg1.field336 >= var4.field1019) {
                    arg1.field335 = -1;
                }
            }
            arg1.field311 = var4.field1025;
        }
        if (arg1.field338 > 0) {
            --arg1.field338;
        }
        if (arg1.field340 != -1 && field1356 >= arg1.field343) {
            if (arg1.field341 < 0) {
                arg1.field341 = 0;
            }
            SeqType var5 = SpotAnimType.field1033[arg1.field340].field1037;
            ++arg1.field342;
            while (arg1.field341 < var5.field1019 && arg1.field342 > var5.field1022[arg1.field341]) {
                arg1.field342 -= var5.field1022[arg1.field341];
                ++arg1.field341;
            }
            if (arg1.field341 >= var5.field1019) {
                if (arg1.field341 < 0 || arg1.field341 >= var5.field1019) {
                    arg1.field340 = -1;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method455(byte arg0) {
        if (this.field1439) {
            this.field1439 = false;
            this.field1095.method243(super.field15, 11, 2, 0);
            this.field1096.method243(super.field15, 375, 2, 0);
            this.field1097.method243(super.field15, 5, 2, 729);
            this.field1098.method243(super.field15, 231, 2, 752);
            this.field1099.method243(super.field15, 0, 2, 0);
            this.field1100.method243(super.field15, 0, 2, 561);
            this.field1101.method243(super.field15, 11, 2, 520);
            this.field1102.method243(super.field15, 231, 2, 520);
            this.field1103.method243(super.field15, 375, 2, 501);
            this.field1104.method243(super.field15, 345, 2, 0);
            this.field1094 = true;
            this.field1171 = true;
            this.field1365 = true;
            this.field1406 = true;
            if (this.field1212 != 2) {
                this.field1385.method243(super.field15, 11, 2, 8);
                this.field1384.method243(super.field15, 5, 2, 561);
            }
        }
        if (this.field1212 == 2) {
            this.method469(this.field1427);
        }
        if (this.field1315 && this.field1157 == 1) {
            this.field1094 = true;
        }
        if (this.field1462 != -1) {
            boolean var2 = this.method476(this.field1462, this.field1456, (byte) 46);
            if (var2) {
                this.field1094 = true;
            }
        }
        if (this.field1495 == 2) {
            this.field1094 = true;
        }
        if (this.field1146 == 2) {
            this.field1094 = true;
        }
        if (this.field1094) {
            this.method443(-777);
            this.field1094 = false;
        }
        if (this.field1182 == -1) {
            this.field1108.field970 = this.field1202 - this.field1125 - 77;
            if (super.field22 > 453 && super.field22 < 565 && super.field23 > 350) {
                this.method433(super.field23 - 375, super.field22 - 22, this.field1108, (byte) 4, 463, 77, false, this.field1202, 0);
            }
            int var3 = this.field1202 - 77 - this.field1108.field970;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1202 - 77) {
                var3 = this.field1202 - 77;
            }
            if (this.field1125 != var3) {
                this.field1125 = var3;
                this.field1171 = true;
            }
        }
        if (this.field1182 != -1) {
            boolean var4 = this.method476(this.field1182, this.field1456, (byte) 46);
            if (var4) {
                this.field1171 = true;
            }
        }
        if (this.field1495 == 3) {
            this.field1171 = true;
        }
        if (this.field1146 == 3) {
            this.field1171 = true;
        }
        if (this.field1313 != null) {
            this.field1171 = true;
        }
        if (this.field1315 && this.field1157 == 2) {
            this.field1171 = true;
        }
        if (this.field1171) {
            this.method428((byte) 2);
            this.field1171 = false;
        }
        if (this.field1212 == 2) {
            this.method413(false);
            this.field1384.method243(super.field15, 5, 2, 561);
        }
        if (this.field1450 != -1) {
            this.field1365 = true;
        }
        if (this.field1365) {
            if (this.field1450 != -1 && this.field1450 == this.field1241) {
                this.field1450 = -1;
                this.field1425.method205(false, 175);
                this.field1425.method206(this.field1241);
            }
            this.field1365 = false;
            this.field1281.method242(false);
            this.field1340.method189(0, -462, 0);
            if (this.field1462 == -1) {
                if (this.field1110[this.field1241] != -1) {
                    if (this.field1241 == 0) {
                        this.field1291.method189(30, -462, 29);
                    }
                    if (this.field1241 == 1) {
                        this.field1292.method189(29, -462, 59);
                    }
                    if (this.field1241 == 2) {
                        this.field1292.method189(29, -462, 87);
                    }
                    if (this.field1241 == 3) {
                        this.field1293.method189(29, -462, 115);
                    }
                    if (this.field1241 == 4) {
                        this.field1295.method189(29, -462, 156);
                    }
                    if (this.field1241 == 5) {
                        this.field1295.method189(29, -462, 184);
                    }
                    if (this.field1241 == 6) {
                        this.field1294.method189(30, -462, 212);
                    }
                }
                if (this.field1110[0] != -1 && (this.field1450 != 0 || field1356 % 20 < 10)) {
                    this.field1124[0].method189(34, -462, 35);
                }
                if (this.field1110[1] != -1 && (this.field1450 != 1 || field1356 % 20 < 10)) {
                    this.field1124[1].method189(32, -462, 59);
                }
                if (this.field1110[2] != -1 && (this.field1450 != 2 || field1356 % 20 < 10)) {
                    this.field1124[2].method189(32, -462, 86);
                }
                if (this.field1110[3] != -1 && (this.field1450 != 3 || field1356 % 20 < 10)) {
                    this.field1124[3].method189(33, -462, 121);
                }
                if (this.field1110[4] != -1 && (this.field1450 != 4 || field1356 % 20 < 10)) {
                    this.field1124[4].method189(34, -462, 157);
                }
                if (this.field1110[5] != -1 && (this.field1450 != 5 || field1356 % 20 < 10)) {
                    this.field1124[5].method189(32, -462, 185);
                }
                if (this.field1110[6] != -1 && (this.field1450 != 6 || field1356 % 20 < 10)) {
                    this.field1124[6].method189(34, -462, 212);
                }
            }
            this.field1281.method243(super.field15, 165, 2, 520);
            this.field1280.method242(false);
            this.field1339.method189(0, -462, 0);
            if (this.field1462 == -1) {
                if (this.field1110[this.field1241] != -1) {
                    if (this.field1241 == 7) {
                        this.field1342.method189(0, -462, 49);
                    }
                    if (this.field1241 == 8) {
                        this.field1343.method189(0, -462, 81);
                    }
                    if (this.field1241 == 9) {
                        this.field1343.method189(0, -462, 108);
                    }
                    if (this.field1241 == 10) {
                        this.field1344.method189(1, -462, 136);
                    }
                    if (this.field1241 == 11) {
                        this.field1346.method189(0, -462, 178);
                    }
                    if (this.field1241 == 12) {
                        this.field1346.method189(0, -462, 205);
                    }
                    if (this.field1241 == 13) {
                        this.field1345.method189(0, -462, 233);
                    }
                }
                if (this.field1110[8] != -1 && (this.field1450 != 8 || field1356 % 20 < 10)) {
                    this.field1124[7].method189(2, -462, 80);
                }
                if (this.field1110[9] != -1 && (this.field1450 != 9 || field1356 % 20 < 10)) {
                    this.field1124[8].method189(3, -462, 107);
                }
                if (this.field1110[10] != -1 && (this.field1450 != 10 || field1356 % 20 < 10)) {
                    this.field1124[9].method189(4, -462, 142);
                }
                if (this.field1110[11] != -1 && (this.field1450 != 11 || field1356 % 20 < 10)) {
                    this.field1124[10].method189(2, -462, 179);
                }
                if (this.field1110[12] != -1 && (this.field1450 != 12 || field1356 % 20 < 10)) {
                    this.field1124[11].method189(2, -462, 206);
                }
                if (this.field1110[13] != -1 && (this.field1450 != 13 || field1356 % 20 < 10)) {
                    this.field1124[12].method189(2, -462, 230);
                }
            }
            this.field1280.method243(super.field15, 492, 2, 501);
            this.field1385.method242(false);
        }
        if (this.field1406) {
            this.field1406 = false;
            this.field1279.method242(false);
            this.field1338.method189(0, -462, 0);
            this.field1273.method192("Public chat", true, 16777215, 57, (byte) -58, 33);
            if (this.field1504 == 0) {
                this.field1273.method192("On", true, 65280, 57, (byte) -58, 46);
            }
            if (this.field1504 == 1) {
                this.field1273.method192("Friends", true, 16776960, 57, (byte) -58, 46);
            }
            if (this.field1504 == 2) {
                this.field1273.method192("Off", true, 16711680, 57, (byte) -58, 46);
            }
            if (this.field1504 == 3) {
                this.field1273.method192("Hide", true, 65535, 57, (byte) -58, 46);
            }
            this.field1273.method192("Private chat", true, 16777215, 186, (byte) -58, 33);
            if (this.field1106 == 0) {
                this.field1273.method192("On", true, 65280, 186, (byte) -58, 46);
            }
            if (this.field1106 == 1) {
                this.field1273.method192("Friends", true, 16776960, 186, (byte) -58, 46);
            }
            if (this.field1106 == 2) {
                this.field1273.method192("Off", true, 16711680, 186, (byte) -58, 46);
            }
            this.field1273.method192("Trade/duel", true, 16777215, 326, (byte) -58, 33);
            if (this.field1240 == 0) {
                this.field1273.method192("On", true, 65280, 326, (byte) -58, 46);
            }
            if (this.field1240 == 1) {
                this.field1273.method192("Friends", true, 16776960, 326, (byte) -58, 46);
            }
            if (this.field1240 == 2) {
                this.field1273.method192("Off", true, 16711680, 326, (byte) -58, 46);
            }
            this.field1273.method192("Report abuse", true, 16777215, 462, (byte) -58, 38);
            this.field1279.method243(super.field15, 471, 2, 0);
            this.field1385.method242(false);
        }
        this.field1456 = 0;
        if (arg0 == -58) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method456(byte arg0) {
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            this.method6();
        }
        for (LocEntity var3 = (LocEntity) this.field1502.method235(); var3 != null; var3 = (LocEntity) this.field1502.method237(-754)) {
            boolean var4 = false;
            var3.field661 += this.field1456;
            if (var3.field660 == -1) {
                var3.field660 = 0;
                var4 = true;
            }
            label74: {
                do {
                    do {
                        if (var3.field661 <= var3.field659.field1022[var3.field660]) {
                            break label74;
                        }
                        var3.field661 -= var3.field659.field1022[var3.field660] + 1;
                        ++var3.field660;
                        var4 = true;
                    } while (var3.field660 < var3.field659.field1019);
                    var3.field660 -= var3.field659.field1023;
                } while (var3.field660 >= 0 && var3.field660 < var3.field659.field1019);
                var3.method108();
                var4 = false;
            }
            if (var4) {
                int var5 = var3.field654;
                int var6 = var3.field656;
                int var7 = var3.field657;
                int var8 = 0;
                if (var3.field655 == 0) {
                    var8 = this.field1322.method78(var5, var6, var7);
                }
                if (var3.field655 == 1) {
                    var8 = this.field1322.method79(false, var6, var5, var7);
                }
                if (var3.field655 == 2) {
                    var8 = this.field1322.method80(var5, var6, var7);
                }
                if (var3.field655 == 3) {
                    var8 = this.field1322.method81(var5, var6, var7);
                }
                if (var8 != 0 && (var8 >> 14 & 32767) == var3.field658) {
                    int var9 = this.field1140[var5][var6][var7];
                    int var10 = this.field1140[var5][var6 + 1][var7];
                    int var11 = this.field1140[var5][var6 + 1][var7 + 1];
                    int var12 = this.field1140[var5][var6][var7 + 1];
                    LocType var13 = LocType.method282(var3.field658);
                    int var14 = -1;
                    if (var3.field660 != -1) {
                        var14 = var3.field659.field1020[var3.field660];
                    }
                    if (var3.field655 == 2) {
                        int var15 = this.field1322.method82(var5, var6, var7, var8);
                        int var16 = var15 & 31;
                        int var17 = var15 >> 6;
                        if (var16 == 11) {
                            var16 = 10;
                        }
                        Model var18 = var13.method285(var16, var17, var9, var10, var11, var12, var14);
                        this.field1322.method67(this.field1188, var18, var5, var7, var6);
                    } else if (var3.field655 == 1) {
                        Model var19 = var13.method285(4, 0, var9, var10, var11, var12, var14);
                        this.field1322.method69(var7, 18628, var6, var5, var19);
                    } else if (var3.field655 == 0) {
                        int var20 = this.field1322.method82(var5, var6, var7, var8);
                        int var21 = var20 & 31;
                        int var22 = var20 >> 6;
                        if (var21 == 2) {
                            int var23 = var22 + 1 & 3;
                            Model var24 = var13.method285(2, var22 + 4, var9, var10, var11, var12, var14);
                            Model var25 = var13.method285(2, var23, var9, var10, var11, var12, var14);
                            this.field1322.method72(var25, var5, var7, 0, var6, var24);
                        } else {
                            Model var26 = var13.method285(var21, var22, var9, var10, var11, var12, var14);
                            this.field1322.method71(var6, var5, var26, 5, var7);
                        }
                    } else if (var3.field655 == 3) {
                        int var27 = this.field1322.method82(var5, var6, var7, var8);
                        int var28 = var27 >> 6;
                        Model var29 = var13.method285(22, var28, var9, var10, var11, var12, var14);
                        this.field1322.method70(var7, var6, 6, var5, var29);
                    }
                } else {
                    var3.method108();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method457(int arg0) {
        if (arg0 != 38691) {
            this.field1215 = this.field1363.method253();
        }
        for (int var2 = -1; var2 < this.field1369; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1367;
            } else {
                var6 = this.field1370[var2];
            }
            PlayerEntity var7 = this.field1368[var6];
            if (var7 != null && var7.field321 > 0) {
                --var7.field321;
                if (var7.field321 == 0) {
                    var7.field320 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field1284; ++var3) {
            int var4 = this.field1285[var3];
            NpcEntity var5 = this.field1283[var4];
            if (var5 != null && var5.field321 > 0) {
                --var5.field321;
                if (var5.field321 == 0) {
                    var5.field320 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method458(int arg0) {
        this.field1460 = new Pix8(this.field1117, "titlebox", 0);
        if (arg0 != 0) {
            this.field1090 = -1;
        }
        this.field1461 = new Pix8(this.field1117, "titlebutton", 0);
        this.field1441 = new Pix8[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field1441[var2] = new Pix8(this.field1117, "runes", var2);
        }
        this.field1244 = new Pix32(128, 265);
        this.field1245 = new Pix32(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field1244.field587[var3] = this.field1486.field671[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field1245.field587[var4] = this.field1487.field671[var4];
        }
        this.field1326 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field1326[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field1326[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1326[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1326[var8 + 192] = 16777215;
        }
        this.field1327 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1327[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1327[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1327[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1327[var12 + 192] = 16777215;
        }
        this.field1328 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1328[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1328[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1328[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1328[var16 + 192] = 16777215;
        }
        this.field1325 = new int[256];
        this.field1414 = new int[32768];
        this.field1415 = new int[32768];
        this.method399((Pix8) null, 888);
        this.field1250 = new int[32768];
        this.field1251 = new int[32768];
        this.method13("Connecting to fileserver", 10, -745);
        if (!this.field1242) {
            this.field1087 = true;
            this.field1242 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method7(boolean arg0) {
        if (arg0) {
            this.field1425.method206(48);
        }
        if (!this.field1476 && !this.field1230 && !this.field1200) {
            ++field1356;
            if (!this.field1169) {
                this.method494(this.field1215);
            } else {
                this.method415(-46235);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIILhc;)V")
    public final void method459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Component arg6) {
        this.field1089 += arg2;
        if (arg6.field958 == 0 && arg6.field972 != null && !arg6.field971) {
            if (arg5 >= arg0 && arg4 >= arg3 && arg5 <= arg6.field961 + arg0 && arg4 <= arg6.field962 + arg3) {
                int var8 = arg6.field972.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg6.field973[var9] + arg0;
                    int var11 = arg6.field974[var9] + arg3 - arg1;
                    Component var12 = Component.field951[arg6.field972[var9]];
                    int var13 = var12.field963 + var10;
                    int var14 = var12.field964 + var11;
                    if ((var12.field968 >= 0 || var12.field994 != 0) && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field961 + var13 && arg4 < var12.field962 + var14) {
                        if (var12.field968 >= 0) {
                            this.field1129 = var12.field968;
                        } else {
                            this.field1129 = var12.field956;
                        }
                    }
                    if (var12.field958 == 0) {
                        this.method459(var13, var12.field970, 0, var14, arg4, arg5, var12);
                        if (var12.field969 > var12.field962) {
                            this.method433(arg4, arg5, var12, (byte) 4, var12.field961 + var13, var12.field962, true, var12.field969, var14);
                        }
                    } else {
                        if (var12.field959 == 1 && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field961 + var13 && arg4 < var12.field962 + var14) {
                            boolean var15 = false;
                            if (var12.field960 != 0) {
                                var15 = this.method482(var12, this.field1465);
                            }
                            if (!var15) {
                                this.field1196[this.field1167] = var12.field1007;
                                this.field1446[this.field1167] = 951;
                                this.field1445[this.field1167] = var12.field956;
                                ++this.field1167;
                            }
                        }
                        if (var12.field959 == 2 && this.field1118 == 0 && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field961 + var13 && arg4 < var12.field962 + var14) {
                            String var16 = var12.field1004;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field1196[this.field1167] = var16 + " @gre@" + var12.field1005;
                            this.field1446[this.field1167] = 930;
                            this.field1445[this.field1167] = var12.field956;
                            ++this.field1167;
                        }
                        if (var12.field959 == 3 && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field961 + var13 && arg4 < var12.field962 + var14) {
                            this.field1196[this.field1167] = "Close";
                            this.field1446[this.field1167] = 947;
                            this.field1445[this.field1167] = var12.field956;
                            ++this.field1167;
                        }
                        if (var12.field959 == 4 && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field961 + var13 && arg4 < var12.field962 + var14) {
                            this.field1196[this.field1167] = var12.field1007;
                            this.field1446[this.field1167] = 465;
                            this.field1445[this.field1167] = var12.field956;
                            ++this.field1167;
                        }
                        if (var12.field959 == 5 && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field961 + var13 && arg4 < var12.field962 + var14) {
                            this.field1196[this.field1167] = var12.field1007;
                            this.field1446[this.field1167] = 960;
                            this.field1445[this.field1167] = var12.field956;
                            ++this.field1167;
                        }
                        if (var12.field959 == 6 && !this.field1459 && arg5 >= var13 && arg4 >= var14 && arg5 < var12.field961 + var13 && arg4 < var12.field962 + var14) {
                            this.field1196[this.field1167] = var12.field1007;
                            this.field1446[this.field1167] = 44;
                            this.field1445[this.field1167] = var12.field956;
                            ++this.field1167;
                        }
                        if (var12.field958 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field962; ++var18) {
                                for (int var19 = 0; var19 < var12.field961; ++var19) {
                                    int var20 = (var12.field980 + 32) * var19 + var13;
                                    int var21 = (var12.field981 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field983[var17];
                                        var21 += var12.field984[var17];
                                    }
                                    if (arg5 >= var20 && arg4 >= var21 && arg5 < var20 + 32 && arg4 < var21 + 32) {
                                        this.field1408 = var17;
                                        this.field1409 = var12.field956;
                                        if (var12.field952[var17] > 0) {
                                            ObjType var22 = ObjType.method294(var12.field952[var17] - 1);
                                            if (this.field1398 == 1 && var12.field978) {
                                                if (this.field1400 != var12.field956 || this.field1399 != var17) {
                                                    this.field1196[this.field1167] = "Use " + this.field1402 + " with @lre@" + var22.field878;
                                                    this.field1446[this.field1167] = 881;
                                                    this.field1447[this.field1167] = var22.field876;
                                                    this.field1444[this.field1167] = var17;
                                                    this.field1445[this.field1167] = var12.field956;
                                                    ++this.field1167;
                                                }
                                            } else if (this.field1118 == 1 && var12.field978) {
                                                if ((this.field1120 & 16) == 16) {
                                                    this.field1196[this.field1167] = this.field1121 + " @lre@" + var22.field878;
                                                    this.field1446[this.field1167] = 391;
                                                    this.field1447[this.field1167] = var22.field876;
                                                    this.field1444[this.field1167] = var17;
                                                    this.field1445[this.field1167] = var12.field956;
                                                    ++this.field1167;
                                                }
                                            } else {
                                                if (var12.field978) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field894 != null && var22.field894[var23] != null) {
                                                            this.field1196[this.field1167] = var22.field894[var23] + " @lre@" + var22.field878;
                                                            if (var23 == 3) {
                                                                this.field1446[this.field1167] = 478;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field1446[this.field1167] = 347;
                                                            }
                                                            this.field1447[this.field1167] = var22.field876;
                                                            this.field1444[this.field1167] = var17;
                                                            this.field1445[this.field1167] = var12.field956;
                                                            ++this.field1167;
                                                        } else if (var23 == 4) {
                                                            this.field1196[this.field1167] = "Drop @lre@" + var22.field878;
                                                            this.field1446[this.field1167] = 347;
                                                            this.field1447[this.field1167] = var22.field876;
                                                            this.field1444[this.field1167] = var17;
                                                            this.field1445[this.field1167] = var12.field956;
                                                            ++this.field1167;
                                                        }
                                                    }
                                                }
                                                if (var12.field979) {
                                                    this.field1196[this.field1167] = "Use @lre@" + var22.field878;
                                                    this.field1446[this.field1167] = 188;
                                                    this.field1447[this.field1167] = var22.field876;
                                                    this.field1444[this.field1167] = var17;
                                                    this.field1445[this.field1167] = var12.field956;
                                                    ++this.field1167;
                                                }
                                                if (var12.field978 && var22.field894 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field894[var24] != null) {
                                                            this.field1196[this.field1167] = var22.field894[var24] + " @lre@" + var22.field878;
                                                            if (var24 == 0) {
                                                                this.field1446[this.field1167] = 405;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1446[this.field1167] = 38;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1446[this.field1167] = 422;
                                                            }
                                                            this.field1447[this.field1167] = var22.field876;
                                                            this.field1444[this.field1167] = var17;
                                                            this.field1445[this.field1167] = var12.field956;
                                                            ++this.field1167;
                                                        }
                                                    }
                                                }
                                                if (var12.field985 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field985[var25] != null) {
                                                            this.field1196[this.field1167] = var12.field985[var25] + " @lre@" + var22.field878;
                                                            if (var25 == 0) {
                                                                this.field1446[this.field1167] = 602;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1446[this.field1167] = 596;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1446[this.field1167] = 22;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field1446[this.field1167] = 892;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field1446[this.field1167] = 415;
                                                            }
                                                            this.field1447[this.field1167] = var22.field876;
                                                            this.field1444[this.field1167] = var17;
                                                            this.field1445[this.field1167] = var12.field956;
                                                            ++this.field1167;
                                                        }
                                                    }
                                                }
                                                this.field1196[this.field1167] = "Examine @lre@" + var22.field878;
                                                this.field1446[this.field1167] = 1773;
                                                this.field1447[this.field1167] = var22.field876;
                                                this.field1445[this.field1167] = var12.field953[var17];
                                                ++this.field1167;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public final String method460(int arg0, boolean arg1) {
        if (!arg1) {
            this.field1454 = !this.field1454;
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method461(boolean arg0) {
        if (arg0) {
            this.field1090 = this.field1432.method216();
        }
        this.field1364 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1428[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field942; ++var3) {
                if (!IdkType.field943[var3].field949 && IdkType.field943[var3].field944 == var2 + (this.field1393 ? 0 : 7)) {
                    this.field1428[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method10(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field1439 = true;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Ljava/lang/String;")
    public static final String method462(int arg0, int arg1, int arg2) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else {
            int var3 = arg1 - arg2;
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lhc;I)Z")
    public final boolean method463(Component arg0, int arg1) {
        if (arg0.field966 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field966.length; ++var3) {
                int var4 = this.method466(9, arg0, var3);
                int var5 = arg0.field967[var3];
                if (arg0.field966[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field966[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field966[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg1 <= 0) {
                this.field1090 = -1;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method464(int arg0) {
        int var2 = this.field1466 * 128 + 64;
        int var3 = this.field1467 * 128 + 64;
        int var4 = this.method495(this.field1467, false, this.field1221, this.field1466) - this.field1468;
        if (this.field1299 < var2) {
            this.field1299 += (var2 - this.field1299) * this.field1470 / 1000 + this.field1469;
            if (this.field1299 > var2) {
                this.field1299 = var2;
            }
        }
        if (this.field1299 > var2) {
            this.field1299 -= (this.field1299 - var2) * this.field1470 / 1000 + this.field1469;
            if (this.field1299 < var2) {
                this.field1299 = var2;
            }
        }
        if (this.field1300 < var4) {
            this.field1300 += (var4 - this.field1300) * this.field1470 / 1000 + this.field1469;
            if (this.field1300 > var4) {
                this.field1300 = var4;
            }
        }
        if (this.field1300 > var4) {
            this.field1300 -= (this.field1300 - var4) * this.field1470 / 1000 + this.field1469;
            if (this.field1300 < var4) {
                this.field1300 = var4;
            }
        }
        if (this.field1301 < var3) {
            this.field1301 += (var3 - this.field1301) * this.field1470 / 1000 + this.field1469;
            if (this.field1301 > var3) {
                this.field1301 = var3;
            }
        }
        if (this.field1301 > var3) {
            this.field1301 -= (this.field1301 - var3) * this.field1470 / 1000 + this.field1469;
            if (this.field1301 < var3) {
                this.field1301 = var3;
            }
        }
        int var5 = this.field1231 * 128 + 64;
        if (arg0 != 7) {
            this.field1090 = -1;
        }
        int var6 = this.field1232 * 128 + 64;
        int var7 = this.method495(this.field1232, false, this.field1221, this.field1231) - this.field1233;
        int var8 = var5 - this.field1299;
        int var9 = var7 - this.field1300;
        int var10 = var6 - this.field1301;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1302 < var12) {
            this.field1302 += (var12 - this.field1302) * this.field1235 / 1000 + this.field1234;
            if (this.field1302 > var12) {
                this.field1302 = var12;
            }
        }
        if (this.field1302 > var12) {
            this.field1302 -= (this.field1302 - var12) * this.field1235 / 1000 + this.field1234;
            if (this.field1302 < var12) {
                this.field1302 = var12;
            }
        }
        int var14 = var13 - this.field1303;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1303 += this.field1235 * var14 / 1000 + this.field1234;
            this.field1303 &= 2047;
        }
        if (var14 < 0) {
            this.field1303 -= -var14 * this.field1235 / 1000 + this.field1234;
            this.field1303 &= 2047;
        }
        int var15 = var13 - this.field1303;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1303 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method465(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field1199 >= 100) {
                this.method379("Your friends list is full. Max of 100 hit", this.field1496, "", 0);
            } else {
                String var4 = JString.method262(0, JString.method259(arg0, true));
                for (int var5 = 0; var5 < this.field1199; ++var5) {
                    if (this.field1355[var5] == arg0) {
                        this.method379(var4 + " is already on your friend list", this.field1496, "", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1307; ++var6) {
                    if (this.field1249[var6] == arg0) {
                        this.method379("Please remove " + var4 + " from your ignore list first", this.field1496, "", 0);
                        return;
                    }
                }
                if (!var4.equals(this.field1453.field367)) {
                    this.field1206[this.field1199] = var4;
                    this.field1355[this.field1199] = arg0;
                    this.field1412[this.field1199] = 0;
                    ++this.field1199;
                    this.field1094 = true;
                    this.field1089 += arg1;
                    this.field1425.method205(false, 118);
                    this.field1425.method212(0, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILhc;I)I")
    public final int method466(int arg0, Component arg1, int arg2) {
        if (arg0 < this.field1500 || arg0 > this.field1500) {
            this.field1188 = 168;
        }
        if (arg1.field965 != null && arg2 < arg1.field965.length) {
            try {
                int[] var4 = arg1.field965[arg2];
                int var5 = 0;
                int var6 = 0;
                while (true) {
                    int var7 = var4[var6++];
                    if (var7 == 0) {
                        return var5;
                    }
                    if (var7 == 1) {
                        var5 += this.field1334[var4[var6++]];
                    }
                    if (var7 == 2) {
                        var5 += this.field1105[var4[var6++]];
                    }
                    if (var7 == 3) {
                        var5 += this.field1396[var4[var6++]];
                    }
                    if (var7 == 4) {
                        Component var8 = Component.field951[var4[var6++]];
                        int var9 = var4[var6++] + 1;
                        for (int var10 = 0; var10 < var8.field952.length; ++var10) {
                            if (var8.field952[var10] == var9) {
                                var5 += var8.field953[var10];
                            }
                        }
                    }
                    if (var7 == 5) {
                        var5 += this.field1305[var4[var6++]];
                    }
                    if (var7 == 6) {
                        var5 += field1185[this.field1105[var4[var6++]] - 1];
                    }
                    if (var7 == 7) {
                        var5 += this.field1305[var4[var6++]] * 100 / 46875;
                    }
                    if (var7 == 8) {
                        var5 += this.field1453.field373;
                    }
                    if (var7 == 9) {
                        for (int var11 = 0; var11 < 19; ++var11) {
                            if (var11 == 18) {
                                var11 = 20;
                            }
                            var5 += this.field1105[var11];
                        }
                    }
                    if (var7 == 10) {
                        Component var12 = Component.field951[var4[var6++]];
                        int var13 = var4[var6++] + 1;
                        for (int var14 = 0; var14 < var12.field952.length; ++var14) {
                            if (var12.field952[var14] == var13) {
                                var5 += 999999999;
                                break;
                            }
                        }
                    }
                    if (var7 == 11) {
                        var5 += this.field1142;
                    }
                    if (var7 == 12) {
                        var5 += this.field1248;
                    }
                    if (var7 == 13) {
                        int var15 = this.field1305[var4[var6++]];
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

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method467(int arg0) {
        while (arg0 >= 0) {
            this.field1188 = 453;
        }
        int var2 = this.field1274.method193(6, "Choose Option");
        for (int var3 = 0; var3 < this.field1167; ++var3) {
            int var11 = this.field1274.method193(6, this.field1196[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field1167 * 15 + 21;
        if (super.field25 > 8 && super.field26 > 11 && super.field25 < 520 && super.field26 < 345) {
            int var5 = super.field25 - 8 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field26 - 11;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field1315 = true;
            this.field1157 = 0;
            this.field1158 = var5;
            this.field1159 = var6;
            this.field1160 = var2;
            this.field1161 = this.field1167 * 15 + 22;
        }
        if (super.field25 > 562 && super.field26 > 231 && super.field25 < 752 && super.field26 < 492) {
            int var7 = super.field25 - 562 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field26 - 231;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field1315 = true;
            this.field1157 = 1;
            this.field1158 = var7;
            this.field1159 = var8;
            this.field1160 = var2;
            this.field1161 = this.field1167 * 15 + 22;
        }
        if (super.field25 > 22 && super.field26 > 375 && super.field25 < 501 && super.field26 < 471) {
            int var9 = super.field25 - 22 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field26 - 375;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field1315 = true;
            this.field1157 = 2;
            this.field1158 = var9;
            this.field1159 = var10;
            this.field1160 = var2;
            this.field1161 = this.field1167 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILz;III)V")
    public final void method468(int arg0, PlayerEntity arg1, int arg2, int arg3, int arg4) {
        if (arg0 == 0) {
            if (this.field1453 != arg1) {
                if (this.field1167 < 400) {
                    String var6 = arg1.field367 + method462(-653, this.field1453.field373, arg1.field373) + " (level-" + arg1.field373 + ")";
                    if (this.field1398 == 1) {
                        this.field1196[this.field1167] = "Use " + this.field1402 + " with @whi@" + var6;
                        this.field1446[this.field1167] = 367;
                        this.field1447[this.field1167] = arg4;
                        this.field1444[this.field1167] = arg3;
                        this.field1445[this.field1167] = arg2;
                        ++this.field1167;
                    } else if (this.field1118 == 1) {
                        if ((this.field1120 & 8) == 8) {
                            this.field1196[this.field1167] = this.field1121 + " @whi@" + var6;
                            this.field1446[this.field1167] = 651;
                            this.field1447[this.field1167] = arg4;
                            this.field1444[this.field1167] = arg3;
                            this.field1445[this.field1167] = arg2;
                            ++this.field1167;
                        }
                    } else {
                        this.field1196[this.field1167] = "Follow @whi@" + var6;
                        this.field1446[this.field1167] = 1544;
                        this.field1447[this.field1167] = arg4;
                        this.field1444[this.field1167] = arg3;
                        this.field1445[this.field1167] = arg2;
                        ++this.field1167;
                        if (this.field1164 == 0) {
                            this.field1196[this.field1167] = "Trade with @whi@" + var6;
                            this.field1446[this.field1167] = 1373;
                            this.field1447[this.field1167] = arg4;
                            this.field1444[this.field1167] = arg3;
                            this.field1445[this.field1167] = arg2;
                            ++this.field1167;
                        }
                        if (this.field1116 > 0) {
                            this.field1196[this.field1167] = "Attack @whi@" + var6;
                            if (this.field1453.field373 >= arg1.field373) {
                                this.field1446[this.field1167] = 151;
                            } else {
                                this.field1446[this.field1167] = 2151;
                            }
                            this.field1447[this.field1167] = arg4;
                            this.field1444[this.field1167] = arg3;
                            this.field1445[this.field1167] = arg2;
                            ++this.field1167;
                        }
                        if (this.field1214 == 1) {
                            this.field1196[this.field1167] = "Fight @whi@" + var6;
                            this.field1446[this.field1167] = 151;
                            this.field1447[this.field1167] = arg4;
                            this.field1444[this.field1167] = arg3;
                            this.field1445[this.field1167] = arg2;
                            ++this.field1167;
                        }
                        if (this.field1214 == 2) {
                            this.field1196[this.field1167] = "Duel-with @whi@" + var6;
                            this.field1446[this.field1167] = 1101;
                            this.field1447[this.field1167] = arg4;
                            this.field1444[this.field1167] = arg3;
                            this.field1445[this.field1167] = arg2;
                            ++this.field1167;
                        }
                    }
                    for (int var7 = 0; var7 < this.field1167; ++var7) {
                        if (this.field1446[var7] == 660) {
                            this.field1196[var7] = "Walk here @whi@" + var6;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method469(int arg0) {
        ++this.field1348;
        this.method417((byte) 103);
        this.method442(0);
        this.method475(true);
        this.method447(-698);
        if (arg0 != 24924) {
            this.field1296 = !this.field1296;
        }
        this.method456((byte) 5);
        if (!this.field1238) {
            int var2 = this.field1329;
            if (this.field1312 / 256 > var2) {
                var2 = this.field1312 / 256;
            }
            if (this.field1464[4] && this.field1417[4] + 128 > var2) {
                var2 = this.field1417[4] + 128;
            }
            int var3 = this.field1330 + this.field1151 & 2047;
            this.method405(var2 * 3 + 600, this.field1154, this.field1419, var3, this.method495(this.field1453.field309, false, this.field1221, this.field1453.field308) - 50, this.field1155, var2);
            ++field1337;
            if (field1337 > 1802) {
                field1337 = 0;
                this.field1425.method205(false, 146);
                this.field1425.method206(0);
                int var4 = this.field1425.field624;
                this.field1425.method207(29711);
                this.field1425.method206(70);
                this.field1425.method206((int) (Math.random() * 256.0D));
                this.field1425.method206(242);
                this.field1425.method206(186);
                this.field1425.method206(39);
                this.field1425.method206(61);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1425.method206(13);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1425.method207(57856);
                }
                this.field1425.method207((int) (Math.random() * 65536.0D));
                this.field1425.method215(this.field1425.field624 - var4, (byte) 3);
            }
        }
        int var5;
        if (!this.field1238) {
            var5 = this.method487((byte) 4);
        } else {
            var5 = this.method488(this.field1336);
        }
        int var6 = this.field1299;
        int var7 = this.field1300;
        int var8 = this.field1301;
        int var9 = this.field1302;
        int var10 = this.field1303;
        for (int var11 = 0; var11 < 5; ++var11) {
            if (this.field1464[var11]) {
                int var13 = (int) (Math.random() * (double) (this.field1413[var11] * 2 + 1) - (double) this.field1413[var11] + Math.sin((double) this.field1198[var11] / 100.0D * (double) this.field1170[var11]) * (double) this.field1417[var11]);
                if (var11 == 0) {
                    this.field1299 += var13;
                }
                if (var11 == 1) {
                    this.field1300 += var13;
                }
                if (var11 == 2) {
                    this.field1301 += var13;
                }
                if (var11 == 3) {
                    this.field1303 = this.field1303 + var13 & 2047;
                }
                if (var11 == 4) {
                    this.field1302 += var13;
                    if (this.field1302 < 128) {
                        this.field1302 = 128;
                    }
                    if (this.field1302 > 383) {
                        this.field1302 = 383;
                    }
                }
            }
        }
        int var12 = Pix3D.field580;
        Model.field529 = true;
        Model.field532 = 0;
        Model.field530 = super.field22 - 8;
        Model.field531 = super.field23 - 11;
        Pix2D.method149(730);
        this.field1322.method91(this.field1303, var5, this.field1299, this.field1301, this.field1300, this.field1302, 6);
        this.field1322.method65(0);
        this.method419(this.field1429);
        this.method472(2);
        this.method407(8, var12);
        this.method397(857);
        this.field1385.method243(super.field15, 11, 2, 8);
        this.field1299 = var6;
        this.field1300 = var7;
        this.field1301 = var8;
        this.field1302 = var9;
        this.field1303 = var10;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method470(String arg0, int arg1) {
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1199; ++var3) {
                if (arg0.equalsIgnoreCase(this.field1206[var3])) {
                    return true;
                }
            }
            if (arg1 != 0) {
                this.field1288 = this.field1363.method253();
            }
            return arg0.equalsIgnoreCase(this.field1453.field367);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(II)Z")
    public final boolean method471(int arg0, int arg1) {
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field1446[arg0];
            if (arg1 != -13246) {
                this.field1266 = !this.field1266;
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 406;
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method472(int arg0) {
        if (this.field1261 == 2) {
            this.method424((byte) 8, (this.field1254 - this.field1174 << 7) + this.field1257, this.field1255 * 2, (this.field1253 - this.field1173 << 7) + this.field1256);
            if (arg0 != 2) {
                this.field1481 = !this.field1481;
            }
            if (this.field1218 > -1 && field1356 % 20 < 10) {
                this.field1306[2].method175(this.field1219 - 28, -462, this.field1218 - 12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZ)Z")
    public final boolean method473(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg2 >> 14 & 32767;
        int var7 = this.field1322.method82(this.field1221, arg0, arg1, arg2);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            if (arg4) {
                for (int var10 = 1; var10 > 0; ++var10) {
                }
            }
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method484(this.field1453.field357[0], var8 + 1, 2, arg1, false, 0, arg0, 0, 980, this.field1453.field356[0], 0, var9);
            } else {
                LocType var11 = LocType.method282(var6);
                int var12;
                int var13;
                if (var9 != 0 && var9 != 2) {
                    var12 = var11.field812;
                    var13 = var11.field811;
                } else {
                    var12 = var11.field811;
                    var13 = var11.field812;
                }
                int var14 = var11.field835;
                if (var9 != 0) {
                    var14 = (var14 >> 4 - var9) + (var14 << var9 & 15);
                }
                this.method484(this.field1453.field357[0], 0, 2, arg1, false, var14, arg0, var13, 980, this.field1453.field356[0], var12, 0);
            }
            this.field1192 = super.field25;
            this.field1193 = super.field26;
            this.field1195 = 2;
            this.field1194 = 0;
            this.field1425.method205(false, arg3);
            this.field1425.method207(this.field1173 + arg0);
            this.field1425.method207(this.field1174 + arg1);
            this.field1425.method207(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method474(byte arg0) {
        if (arg0 == 0) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        try {
            this.field1358 = -1;
            this.field1510.method239();
            this.field1502.method239();
            this.field1149.method239();
            this.field1207.method239();
            Pix3D.method157(true);
            this.method492((byte) 9);
            this.field1322.method51(602);
            for (int var4 = 0; var4 < 4; ++var4) {
                this.field1499[var4].method302(930);
            }
            System.gc();
            World var5 = new World(false, 104, this.field1350, 104, this.field1140);
            byte[] var6 = new byte[100000];
            int var7 = this.field1357.length;
            World.field36 = World3D.field226;
            for (int var8 = 0; var8 < var7; ++var8) {
                int var9 = this.field1210[var8] >> 8;
                int var10 = this.field1210[var8] & 255;
                if (var9 == 33 && var10 >= 71 && var10 <= 73) {
                    World.field36 = false;
                }
            }
            if (World.field36) {
                this.field1322.method52(6, this.field1221);
            } else {
                this.field1322.method52(6, 0);
            }
            this.field1425.method205(false, 108);
            for (int var11 = 0; var11 < var7; ++var11) {
                int var12 = (this.field1210[var11] >> 8) * 64 - this.field1173;
                int var13 = (this.field1210[var11] & 255) * 64 - this.field1174;
                byte[] var14 = this.field1357[var11];
                if (var14 != null) {
                    int var15 = (new Packet((byte) 64, var14)).method221();
                    BZip2.method245(var6, var15, var14, var14.length - 4, 4);
                    var5.method15(var13, (this.field1411 - 6) * 8, (this.field1410 - 6) * 8, var6, 0, var12);
                } else if (this.field1411 < 800) {
                    var5.method14(64, var12, var13, true, 64);
                }
            }
            this.field1425.method205(false, 108);
            for (int var16 = 0; var16 < var7; ++var16) {
                byte[] var17 = this.field1270[var16];
                if (var17 != null) {
                    int var18 = (new Packet((byte) 64, var17)).method221();
                    BZip2.method245(var6, var18, var17, var17.length - 4, 4);
                    int var19 = (this.field1210[var16] >> 8) * 64 - this.field1173;
                    int var20 = (this.field1210[var16] & 255) * 64 - this.field1174;
                    var5.method16(false, this.field1502, var6, this.field1499, this.field1322, var20, var19);
                }
            }
            this.field1425.method205(false, 108);
            var5.method18(this.field1499, -19432, this.field1322);
            this.field1385.method242(false);
            this.field1425.method205(false, 108);
            for (LocEntity var21 = (LocEntity) this.field1502.method235(); var21 != null; var21 = (LocEntity) this.field1502.method237(-754)) {
                if ((this.field1350[1][var21.field656][var21.field657] & 2) == 2) {
                    --var21.field654;
                    if (var21.field654 < 0) {
                        var21.method108();
                    }
                }
            }
            for (int var22 = 0; var22 < 104; ++var22) {
                for (int var23 = 0; var23 < 104; ++var23) {
                    this.method430(var22, var23);
                }
            }
            for (LocMerged var24 = (LocMerged) this.field1361.method235(); var24 != null; var24 = (LocMerged) this.field1361.method237(-754)) {
                this.method402(var24.field639, this.field1168, var24.field637, var24.field640, var24.field642, var24.field641, var24.field636, var24.field638);
            }
        } catch (Exception var26) {
        }
        LocType.field837.method105();
        System.gc();
        Pix3D.method158(20, (byte) 8);
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method475(boolean arg0) {
        ProjectileEntity var2 = (ProjectileEntity) this.field1207.method235();
        this.field1169 &= arg0;
        while (var2 != null) {
            if (this.field1221 == var2.field391 && field1356 <= var2.field397) {
                if (field1356 >= var2.field396) {
                    if (var2.field400 > 0) {
                        NpcEntity var3 = this.field1283[var2.field400 - 1];
                        if (var3 != null) {
                            var2.method117(var3.field308, field1356, var3.field309, 709, this.method495(var3.field309, false, var2.field391, var3.field308) - var2.field395);
                        }
                    }
                    if (var2.field400 < 0) {
                        int var4 = -var2.field400 - 1;
                        PlayerEntity var5;
                        if (this.field1282 == var4) {
                            var5 = this.field1453;
                        } else {
                            var5 = this.field1368[var4];
                        }
                        if (var5 != null) {
                            var2.method117(var5.field308, field1356, var5.field309, 709, this.method495(var5.field309, false, var2.field391, var5.field308) - var2.field395);
                        }
                    }
                    var2.method118(this.field1456, false);
                    this.field1322.method62(60, (int) var2.field402, (int) var2.field403, (Model) null, -1, (int) var2.field404, var2.field410, false, this.field1221, var2, false);
                }
            } else {
                var2.method108();
            }
            var2 = (ProjectileEntity) this.field1207.method237(-754);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIB)Z")
    public final boolean method476(int arg0, int arg1, byte arg2) {
        if (arg2 != 46) {
            throw new NullPointerException();
        } else {
            boolean var4 = false;
            Component var5 = Component.field951[arg0];
            for (int var6 = 0; var6 < var5.field972.length && var5.field972[var6] != -1; ++var6) {
                Component var7 = Component.field951[var5.field972[var6]];
                if (var7.field958 == 1) {
                    var4 |= this.method476(var7.field956, arg1, (byte) 46);
                }
                if (var7.field958 == 6 && (var7.field999 != -1 || var7.field1000 != -1)) {
                    boolean var8 = this.method463(var7, 108);
                    int var9;
                    if (var8) {
                        var9 = var7.field1000;
                    } else {
                        var9 = var7.field999;
                    }
                    if (var9 != -1) {
                        SeqType var10 = SeqType.field1018[var9];
                        var7.field955 += arg1;
                        while (var7.field955 > var10.field1022[var7.field954]) {
                            var7.field955 -= var10.field1022[var7.field954] + 1;
                            ++var7.field954;
                            if (var7.field954 >= var10.field1019) {
                                var7.field954 -= var10.field1023;
                                if (var7.field954 < 0 || var7.field954 >= var10.field1019) {
                                    var7.field954 = 0;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;)Lub;")
    public final Jagfile method477(String arg0, int arg1, int arg2, int arg3, String arg4) {
        if (arg2 != -27314) {
            this.field1429 = -28;
        }
        int var6 = 5;
        byte[] var7 = signlink.cacheload(arg0);
        if (var7 != null) {
            this.field1115.reset();
            this.field1115.update(var7);
            int var8 = (int) this.field1115.getValue();
            if (arg3 != var8) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(this.field1404, var7);
        } else {
            while (var7 == null) {
                this.method13("Requesting " + arg4, arg1, -745);
                try {
                    int var10 = 0;
                    DataInputStream var11 = this.method435(arg0 + arg3);
                    byte[] var12 = new byte[6];
                    var11.readFully(var12, 0, 6);
                    Packet var13 = new Packet((byte) 64, var12);
                    var13.field624 = 3;
                    int var14 = var13.method220() + 6;
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
                            this.method13("Loading " + arg4 + " - " + var18 + "%", arg1, -745);
                        }
                        var10 = var18;
                    }
                    var11.close();
                } catch (IOException var22) {
                    var7 = null;
                    for (int var19 = var6; var19 > 0; --var19) {
                        this.method13("Error loading - Will retry in " + var19 + " secs.", arg1, -745);
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
            signlink.cachesave(arg0, var7);
            return new Jagfile(this.field1404, var7);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIZ)V")
    public final void method478(byte arg0, int arg1, boolean arg2) {
        signlink.midivol = arg1;
        if (arg0 != 31) {
            field1213 = this.field1363.method253();
        }
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public static final void method479(boolean arg0) {
        World3D.field226 = true;
        if (arg0) {
            field1503 = true;
        }
        Pix3D.field560 = true;
        field1265 = true;
        World.field36 = true;
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method480(int arg0) {
        while (arg0 >= 0) {
            field1349 = -209;
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method5(-16167);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field1112 != -1 && this.field1455 == this.field1112) {
                        if (var2 == 8 && this.field1277.length() > 0) {
                            this.field1277 = this.field1277.substring(0, this.field1277.length() - 1);
                        }
                        break;
                    }
                    if (this.field1333) {
                        if (var2 >= 32 && var2 <= 122 && this.field1183.length() < 80) {
                            this.field1183 = this.field1183 + (char) var2;
                            this.field1171 = true;
                        }
                        if (var2 == 8 && this.field1183.length() > 0) {
                            this.field1183 = this.field1183.substring(0, this.field1183.length() - 1);
                            this.field1171 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field1333 = false;
                            this.field1171 = true;
                            if (this.field1391 == 1) {
                                long var3 = JString.method258(this.field1183);
                                this.method465(var3, 0);
                            }
                            if (this.field1391 == 2 && this.field1199 > 0) {
                                long var5 = JString.method258(this.field1183);
                                this.method374(var5, (byte) 88);
                            }
                            if (this.field1391 == 3 && this.field1183.length() > 0) {
                                this.field1425.method205(false, 148);
                                this.field1425.method206(0);
                                int var7 = this.field1425.field624;
                                this.field1425.method212(0, this.field1216);
                                WordPack.method266(this.field1425, this.field1183, (byte) 109);
                                this.field1425.method215(this.field1425.field624 - var7, (byte) 3);
                                this.field1183 = JString.method263(false, this.field1183);
                                this.field1183 = WordFilter.method343(this.field1183, 400);
                                this.method379(this.field1183, this.field1496, JString.method262(0, JString.method259(this.field1216, true)), 6);
                                if (this.field1106 == 2) {
                                    this.field1106 = 1;
                                    this.field1406 = true;
                                    this.field1425.method205(false, 244);
                                    this.field1425.method206(this.field1504);
                                    this.field1425.method206(this.field1106);
                                    this.field1425.method206(this.field1240);
                                }
                            }
                            if (this.field1391 == 4 && this.field1307 < 100) {
                                long var8 = JString.method258(this.field1183);
                                this.method377(-811, var8);
                            }
                            if (this.field1391 == 5 && this.field1307 > 0) {
                                long var10 = JString.method258(this.field1183);
                                this.method493(var10, 0);
                            }
                        }
                    } else if (this.field1113) {
                        if (var2 >= 48 && var2 <= 57 && this.field1126.length() < 10) {
                            this.field1126 = this.field1126 + (char) var2;
                            this.field1171 = true;
                        }
                        if (var2 == 8 && this.field1126.length() > 0) {
                            this.field1126 = this.field1126.substring(0, this.field1126.length() - 1);
                            this.field1171 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field1126.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field1126);
                                } catch (Exception var16) {
                                }
                                this.field1425.method205(false, 237);
                                this.field1425.method210(var12);
                            }
                            this.field1113 = false;
                            this.field1171 = true;
                        }
                    } else if (this.field1182 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field1243.length() < 80) {
                            this.field1243 = this.field1243 + (char) var2;
                            this.field1171 = true;
                        }
                        if (var2 == 8 && this.field1243.length() > 0) {
                            this.field1243 = this.field1243.substring(0, this.field1243.length() - 1);
                            this.field1171 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field1243.length() > 0) {
                            if (this.field1243.equals("::clientdrop") && (super.field18 != null || this.method393(34).indexOf("192.168.1.") != -1)) {
                                this.method418((byte) -84);
                            } else if (this.field1243.startsWith("::")) {
                                this.field1425.method205(false, 4);
                                this.field1425.method206(this.field1243.length() - 1);
                                this.field1425.method213(this.field1243.substring(2));
                            } else {
                                byte var13 = 0;
                                if (this.field1243.startsWith("yellow:")) {
                                    var13 = 0;
                                    this.field1243 = this.field1243.substring(7);
                                }
                                if (this.field1243.startsWith("red:")) {
                                    var13 = 1;
                                    this.field1243 = this.field1243.substring(4);
                                }
                                if (this.field1243.startsWith("green:")) {
                                    var13 = 2;
                                    this.field1243 = this.field1243.substring(6);
                                }
                                if (this.field1243.startsWith("cyan:")) {
                                    var13 = 3;
                                    this.field1243 = this.field1243.substring(5);
                                }
                                if (this.field1243.startsWith("purple:")) {
                                    var13 = 4;
                                    this.field1243 = this.field1243.substring(7);
                                }
                                if (this.field1243.startsWith("white:")) {
                                    var13 = 5;
                                    this.field1243 = this.field1243.substring(6);
                                }
                                if (this.field1243.startsWith("flash1:")) {
                                    var13 = 6;
                                    this.field1243 = this.field1243.substring(7);
                                }
                                if (this.field1243.startsWith("flash2:")) {
                                    var13 = 7;
                                    this.field1243 = this.field1243.substring(7);
                                }
                                if (this.field1243.startsWith("flash3:")) {
                                    var13 = 8;
                                    this.field1243 = this.field1243.substring(7);
                                }
                                if (this.field1243.startsWith("glow1:")) {
                                    var13 = 9;
                                    this.field1243 = this.field1243.substring(6);
                                }
                                if (this.field1243.startsWith("glow2:")) {
                                    var13 = 10;
                                    this.field1243 = this.field1243.substring(6);
                                }
                                if (this.field1243.startsWith("glow3:")) {
                                    var13 = 11;
                                    this.field1243 = this.field1243.substring(6);
                                }
                                byte var14 = 0;
                                if (this.field1243.startsWith("wave:")) {
                                    var14 = 1;
                                    this.field1243 = this.field1243.substring(5);
                                }
                                if (this.field1243.startsWith("scroll:")) {
                                    var14 = 2;
                                    this.field1243 = this.field1243.substring(7);
                                }
                                this.field1425.method205(false, 158);
                                this.field1425.method206(0);
                                int var15 = this.field1425.field624;
                                this.field1425.method206(var13);
                                this.field1425.method206(var14);
                                WordPack.method266(this.field1425, this.field1243, (byte) 109);
                                this.field1425.method215(this.field1425.field624 - var15, (byte) 3);
                                this.field1243 = JString.method263(false, this.field1243);
                                this.field1243 = WordFilter.method343(this.field1243, 400);
                                this.field1453.field320 = this.field1243;
                                this.field1453.field322 = var13;
                                this.field1453.field323 = var14;
                                this.field1453.field321 = 150;
                                this.method379(this.field1453.field320, this.field1496, this.field1453.field367, 2);
                                if (this.field1504 == 2) {
                                    this.field1504 = 3;
                                    this.field1406 = true;
                                    this.field1425.method205(false, 244);
                                    this.field1425.method206(this.field1504);
                                    this.field1425.method206(this.field1106);
                                    this.field1425.method206(this.field1240);
                                }
                            }
                            this.field1243 = "";
                            this.field1171 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field1277.length() < 12) {
                this.field1277 = this.field1277 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method481(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Lhc;I)Z")
    public final boolean method482(Component arg0, int arg1) {
        int var3 = arg0.field960;
        if (arg1 != -1910) {
            this.field1418 = null;
        }
        if (var3 >= 1 && var3 <= 200) {
            if (var3 >= 101) {
                var3 -= 101;
            } else {
                --var3;
            }
            this.field1196[this.field1167] = "Remove @whi@" + this.field1206[var3];
            this.field1446[this.field1167] = 557;
            ++this.field1167;
            this.field1196[this.field1167] = "Message @whi@" + this.field1206[var3];
            this.field1446[this.field1167] = 679;
            ++this.field1167;
            return true;
        } else if (var3 >= 401 && var3 <= 500) {
            this.field1196[this.field1167] = "Remove @whi@" + arg0.field990;
            this.field1446[this.field1167] = 556;
            ++this.field1167;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method483(byte arg0) {
        if (arg0 != 0) {
            this.field1090 = this.field1432.method216();
        }
        if (super.field24 == 1) {
            int var2 = super.field25 - 21 - 561;
            int var3 = super.field26 - 9 - 5;
            if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                var2 -= 73;
                var3 -= 75;
                int var4 = this.field1375 + this.field1330 & 2047;
                int var5 = Pix3D.field569[var4];
                int var6 = Pix3D.field570[var4];
                int var7 = (this.field1204 + 256) * var5 >> 8;
                int var8 = (this.field1204 + 256) * var6 >> 8;
                int var9 = var2 * var8 + var3 * var7 >> 11;
                int var10 = var3 * var8 - var2 * var7 >> 11;
                int var11 = this.field1453.field308 + var9 >> 7;
                int var12 = this.field1453.field309 - var10 >> 7;
                boolean var13 = this.method484(this.field1453.field357[0], 0, 1, var12, true, 0, var11, 0, 980, this.field1453.field356[0], 0, 0);
                if (var13) {
                    this.field1425.method206(var2);
                    this.field1425.method206(var3);
                    this.field1425.method207(this.field1330);
                    this.field1425.method206(57);
                    this.field1425.method206(this.field1375);
                    this.field1425.method206(this.field1204);
                    this.field1425.method206(89);
                    this.field1425.method207(this.field1453.field308);
                    this.field1425.method207(this.field1453.field309);
                    this.field1425.method206(this.field1222);
                    this.field1425.method206(63);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZIIIIIII)Z")
    public final boolean method484(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        if (arg8 <= 0) {
            this.field1427 = this.field1363.method253();
        }
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1472[var15][var35] = 0;
                this.field1374[var15][var35] = 99999999;
            }
        }
        int var16 = arg9;
        int var17 = arg0;
        this.field1472[arg9][arg0] = 99;
        this.field1374[arg9][arg0] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1387[var18] = arg9;
        int var36 = var18 + 1;
        this.field1388[var18] = arg0;
        boolean var20 = false;
        int var21 = this.field1387.length;
        int[][] var22 = this.field1499[this.field1221].field925;
        while (var36 != var19) {
            var16 = this.field1387[var19];
            var17 = this.field1388[var19];
            var19 = (var19 + 1) % var21;
            if (arg6 == var16 && arg3 == var17) {
                var20 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && this.field1499[this.field1221].method311(arg3, arg1 - 1, var17, arg11, arg6, true, var16)) {
                    var20 = true;
                    break;
                }
                if (arg1 < 10 && this.field1499[this.field1221].method312(var17, arg6, (byte) -89, var16, arg3, arg1 - 1, arg11)) {
                    var20 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg7 != 0 && this.field1499[this.field1221].method313(var16, arg10, arg3, arg6, arg7, true, arg5, var17)) {
                var20 = true;
                break;
            }
            int var34 = this.field1374[var16][var17] + 1;
            if (var16 > 0 && this.field1472[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1387[var36] = var16 - 1;
                this.field1388[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1472[var16 - 1][var17] = 2;
                this.field1374[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1472[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1387[var36] = var16 + 1;
                this.field1388[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1472[var16 + 1][var17] = 8;
                this.field1374[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1472[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1387[var36] = var16;
                this.field1388[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1472[var16][var17 - 1] = 1;
                this.field1374[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1472[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1387[var36] = var16;
                this.field1388[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1472[var16][var17 + 1] = 4;
                this.field1374[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1472[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1387[var36] = var16 - 1;
                this.field1388[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1472[var16 - 1][var17 - 1] = 3;
                this.field1374[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1472[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1387[var36] = var16 + 1;
                this.field1388[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1472[var16 + 1][var17 - 1] = 9;
                this.field1374[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1472[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1387[var36] = var16 - 1;
                this.field1388[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1472[var16 - 1][var17 + 1] = 6;
                this.field1374[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1472[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1387[var36] = var16 + 1;
                this.field1388[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1472[var16 + 1][var17 + 1] = 12;
                this.field1374[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1222 = 0;
        if (!var20) {
            if (arg4) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg6 - var24; var25 <= arg6 + var24; ++var25) {
                        for (int var26 = arg3 - var24; var26 <= arg3 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1374[var25][var26] < var23) {
                                var23 = this.field1374[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1222 = 1;
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
        this.field1387[var27] = var16;
        int var37 = var27 + 1;
        this.field1388[var27] = var17;
        int var28;
        int var29 = var28 = this.field1472[var16][var17];
        while (arg9 != var16 || arg0 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1387[var37] = var16;
                this.field1388[var37++] = var17;
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
            var29 = this.field1472[var16][var17];
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
            int var31 = this.field1387[var37];
            int var32 = this.field1388[var37];
            if (arg2 == 0) {
                this.field1425.method205(false, 181);
                this.field1425.method206(var30 + var30 + 3);
            }
            if (arg2 == 1) {
                this.field1425.method205(false, 165);
                this.field1425.method206(var30 + var30 + 3 + 14);
            }
            if (arg2 == 2) {
                this.field1425.method205(false, 93);
                this.field1425.method206(var30 + var30 + 3);
            }
            if (super.field27[5] == 1) {
                this.field1425.method206(1);
            } else {
                this.field1425.method206(0);
            }
            this.field1425.method207(this.field1173 + var31);
            this.field1425.method207(this.field1174 + var32);
            this.field1478 = this.field1387[0];
            this.field1479 = this.field1388[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1425.method206(this.field1387[var37] - var31);
                this.field1425.method206(this.field1388[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;III)V")
    public final void method485(String arg0, int arg1, int arg2, int arg3) {
        if (arg0 != null) {
            Object var5 = this.field1448;
            synchronized (this.field1448) {
                this.field1314 = arg0;
                this.field1141 = arg2;
                this.field1378 = arg1;
            }
            while (arg3 >= 0) {
                this.field1498 = 290;
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method486(boolean arg0) {
        int var2 = (this.field1453.field308 >> 7) + this.field1173;
        int var3 = (this.field1453.field309 >> 7) + this.field1174;
        this.field1169 &= arg0;
        if (var2 >= 2944 && var2 < 3392 && var3 >= 3520 && var3 < 6400) {
            this.field1116 = (var3 - 3520) / 8 + 1;
        } else if (var2 >= 2944 && var2 < 3392 && var3 >= 9920 && var3 < 12800) {
            this.field1116 = (var3 - 9920) / 8 + 1;
        } else {
            this.field1116 = 0;
        }
        this.field1214 = 0;
        if (var2 >= 3328 && var2 < 3392 && var3 >= 3200 && var3 < 3264) {
            int var4 = var2 & 63;
            int var5 = var3 & 63;
            if (var4 >= 4 && var4 <= 29 && var5 >= 44 && var5 <= 58) {
                this.field1214 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 44 && var5 <= 58) {
                this.field1214 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 25 && var5 <= 39) {
                this.field1214 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 25 && var5 <= 39) {
                this.field1214 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 6 && var5 <= 20) {
                this.field1214 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 6 && var5 <= 20) {
                this.field1214 = 1;
            }
        }
        if (this.field1214 == 0 && var2 >= 3328 && var2 <= 3393 && var3 >= 3203 && var3 <= 3325) {
            this.field1214 = 2;
        }
        this.field1164 = 0;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1164 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1164 = 1;
        }
        if (this.field1164 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1164 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)I")
    public final int method487(byte arg0) {
        int var2 = 3;
        if (arg0 != 4) {
            return 0;
        } else {
            boolean var3 = false;
            if (this.field1302 < 310) {
                int var4 = this.field1299 >> 7;
                int var5 = this.field1301 >> 7;
                int var6 = this.field1453.field308 >> 7;
                int var7 = this.field1453.field309 >> 7;
                if ((this.field1350[this.field1221][var4][var5] & 4) != 0) {
                    var2 = this.field1221;
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
                        if ((this.field1350[this.field1221][var4][var5] & 4) != 0) {
                            var2 = this.field1221;
                        }
                        var11 += var10;
                        if (var11 >= 65536) {
                            var11 -= 65536;
                            if (var5 < var7) {
                                ++var5;
                            } else if (var5 > var7) {
                                --var5;
                            }
                            if ((this.field1350[this.field1221][var4][var5] & 4) != 0) {
                                var2 = this.field1221;
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
                        if ((this.field1350[this.field1221][var4][var5] & 4) != 0) {
                            var2 = this.field1221;
                        }
                        var13 += var12;
                        if (var13 >= 65536) {
                            var13 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field1350[this.field1221][var4][var5] & 4) != 0) {
                                var2 = this.field1221;
                            }
                        }
                    }
                }
            }
            if ((this.field1350[this.field1221][this.field1453.field308 >> 7][this.field1453.field309 >> 7] & 4) != 0) {
                var2 = this.field1221;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)I")
    public final int method488(byte arg0) {
        if (arg0 != 6) {
            return 0;
        } else {
            int var2 = this.method495(this.field1301, false, this.field1221, this.field1299);
            return var2 - this.field1300 < 800 && (this.field1350[this.field1221][this.field1299 >> 7][this.field1301 >> 7] & 4) != 0 ? this.field1221 : 3;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lkb;II)V")
    private final void method489(Packet arg0, int arg1, int arg2) {
        this.field1297 = 0;
        this.field1371 = 0;
        this.method387(arg1, arg0, (byte) 4);
        this.method400(arg1, (byte) 62, arg0);
        this.method439(arg1, arg0, (byte) 6);
        this.method440(arg0, arg1, true);
        for (int var4 = 0; var4 < this.field1297; ++var4) {
            int var6 = this.field1298[var4];
            if (field1356 != this.field1368[var6].field352) {
                this.field1368[var6] = null;
            }
        }
        if (arg2 != -25272) {
            this.method6();
        }
        if (arg0.field624 != arg1) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field624 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1369; ++var5) {
                if (this.field1368[this.field1370[var5]] == null) {
                    signlink.reporterror(this.field1236 + " null entry in pl list - pos:" + var5 + " size:" + this.field1369);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method490(int arg0) {
        if (arg0 >= 0) {
            this.field1188 = this.field1363.method253();
        }
        if (this.field1146 == 0) {
            int var2 = super.field24;
            if (this.field1118 == 1 && super.field25 >= 520 && super.field26 >= 165 && super.field25 <= 788 && super.field26 <= 230) {
                var2 = 0;
            }
            if (this.field1315) {
                if (var2 != 1) {
                    int var3 = super.field22;
                    int var4 = super.field23;
                    if (this.field1157 == 0) {
                        var3 -= 8;
                        var4 -= 11;
                    }
                    if (this.field1157 == 1) {
                        var3 -= 562;
                        var4 -= 231;
                    }
                    if (this.field1157 == 2) {
                        var3 -= 22;
                        var4 -= 375;
                    }
                    if (var3 < this.field1158 - 10 || var3 > this.field1160 + this.field1158 + 10 || var4 < this.field1159 - 10 || var4 > this.field1161 + this.field1159 + 10) {
                        this.field1315 = false;
                        if (this.field1157 == 1) {
                            this.field1094 = true;
                        }
                        if (this.field1157 == 2) {
                            this.field1171 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field1158;
                    int var6 = this.field1159;
                    int var7 = this.field1160;
                    int var8 = super.field25;
                    int var9 = super.field26;
                    if (this.field1157 == 0) {
                        var8 -= 8;
                        var9 -= 11;
                    }
                    if (this.field1157 == 1) {
                        var8 -= 562;
                        var9 -= 231;
                    }
                    if (this.field1157 == 2) {
                        var8 -= 22;
                        var9 -= 375;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field1167; ++var11) {
                        int var12 = (this.field1167 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method436(var10, 0);
                    }
                    this.field1315 = false;
                    if (this.field1157 == 1) {
                        this.field1094 = true;
                    }
                    if (this.field1157 == 2) {
                        this.field1171 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field1167 > 0) {
                    int var13 = this.field1446[this.field1167 - 1];
                    if (var13 == 602 || var13 == 596 || var13 == 22 || var13 == 892 || var13 == 415 || var13 == 405 || var13 == 38 || var13 == 422 || var13 == 478 || var13 == 347 || var13 == 188) {
                        int var14 = this.field1444[this.field1167 - 1];
                        int var15 = this.field1445[this.field1167 - 1];
                        Component var16 = Component.field951[var15];
                        if (var16.field977) {
                            this.field1224 = false;
                            this.field1143 = 0;
                            this.field1144 = var15;
                            this.field1145 = var14;
                            this.field1146 = 2;
                            this.field1147 = super.field25;
                            this.field1148 = super.field26;
                            if (Component.field951[var15].field957 == this.field1112) {
                                this.field1146 = 1;
                            }
                            if (Component.field951[var15].field957 == this.field1182) {
                                this.field1146 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field1509 == 1 || this.method471(this.field1167 - 1, -13246)) && this.field1167 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field1167 > 0) {
                    this.method436(this.field1167 - 1, 0);
                }
                if (var2 != 2 || this.field1167 <= 0) {
                    return;
                }
                this.method467(-468);
            }
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method491(int arg0) {
        this.field1201 = true;
        if (arg0 != -40223) {
            this.field1418 = null;
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1242) {
                this.method410(8);
                this.method410(8);
                this.method395(this.field1266);
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
        this.field1201 = false;
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method492(byte arg0) {
        LocType.field837.method105();
        if (arg0 != 9) {
            this.field1090 = -1;
        }
        LocType.field838.method105();
        NpcType.field868.method105();
        ObjType.field911.method105();
        ObjType.field912.method105();
        PlayerEntity.field387.method105();
        SpotAnimType.field1046.method105();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method493(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1307; ++var4) {
                if (this.field1249[var4] == arg0) {
                    --this.field1307;
                    this.field1094 = true;
                    for (int var5 = var4; var5 < this.field1307; ++var5) {
                        this.field1249[var5] = this.field1249[var5 + 1];
                    }
                    this.field1425.method205(false, 171);
                    this.field1425.method212(0, arg0);
                    break;
                }
            }
            this.field1089 += arg1;
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method494(int arg0) {
        if (arg0 <= 0) {
            this.field1090 = -1;
        }
        if (this.field1457 == 0) {
            int var2 = super.field13 / 2 - 80;
            int var3 = super.field14 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field24 == 1 && super.field25 >= var2 - 75 && super.field25 <= var2 + 75 && super.field26 >= var14 - 20 && super.field26 <= var14 + 20) {
                this.field1457 = 3;
                this.field1229 = 0;
            }
            int var4 = super.field13 / 2 + 80;
            if (super.field24 == 1 && super.field25 >= var4 - 75 && super.field25 <= var4 + 75 && super.field26 >= var14 - 20 && super.field26 <= var14 + 20) {
                this.field1079 = "";
                this.field1080 = "Enter your username & password.";
                this.field1457 = 2;
                this.field1229 = 0;
            }
        } else if (this.field1457 == 2) {
            int var5 = super.field14 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field24 == 1 && super.field26 >= var16 - 15 && super.field26 < var16) {
                this.field1229 = 0;
            }
            var5 = var16 + 15;
            if (super.field24 == 1 && super.field26 >= var5 - 15 && super.field26 < var5) {
                this.field1229 = 1;
            }
            var5 += 15;
            int var6 = super.field13 / 2 - 80;
            int var7 = super.field14 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field24 == 1 && super.field25 >= var6 - 75 && super.field25 <= var6 + 75 && super.field26 >= var17 - 20 && super.field26 <= var17 + 20) {
                this.method416(this.field1236, this.field1237, false);
            }
            int var8 = super.field13 / 2 + 80;
            if (super.field24 == 1 && super.field25 >= var8 - 75 && super.field25 <= var8 + 75 && super.field26 >= var17 - 20 && super.field26 <= var17 + 20) {
                this.field1457 = 0;
                this.field1236 = "";
                this.field1237 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5(-16167);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1351.length(); ++var11) {
                        if (var9 == field1351.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1229 == 0) {
                        if (var9 == 8 && this.field1236.length() > 0) {
                            this.field1236 = this.field1236.substring(0, this.field1236.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1229 = 1;
                        }
                        if (var10) {
                            this.field1236 = this.field1236 + (char) var9;
                        }
                        if (this.field1236.length() > 12) {
                            this.field1236 = this.field1236.substring(0, 12);
                        }
                    } else if (this.field1229 == 1) {
                        if (var9 == 8 && this.field1237.length() > 0) {
                            this.field1237 = this.field1237.substring(0, this.field1237.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1229 = 0;
                        }
                        if (var10) {
                            this.field1237 = this.field1237 + (char) var9;
                        }
                        if (this.field1237.length() > 20) {
                            this.field1237 = this.field1237.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1457 == 3) {
                int var12 = super.field13 / 2;
                int var13 = super.field14 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field24 == 1 && super.field25 >= var12 - 75 && super.field25 <= var12 + 75 && super.field26 >= var18 - 20 && super.field26 <= var18 + 20) {
                    this.field1457 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZII)I")
    public final int method495(int arg0, boolean arg1, int arg2, int arg3) {
        int var5 = arg3 >> 7;
        int var6 = arg0 >> 7;
        int var7 = arg2;
        if (arg1) {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
        if (arg2 < 3 && (this.field1350[1][var5][var6] & 2) == 2) {
            var7 = arg2 + 1;
        }
        int var9 = arg3 & 127;
        int var10 = arg0 & 127;
        int var11 = (128 - var9) * this.field1140[var7][var5][var6] + this.field1140[var7][var5 + 1][var6] * var9 >> 7;
        int var12 = (128 - var9) * this.field1140[var7][var5][var6 + 1] + this.field1140[var7][var5 + 1][var6 + 1] * var9 >> 7;
        return (128 - var10) * var11 + var10 * var12 >> 7;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Lkb;II)V")
    public final void method496(Packet arg0, int arg1, int arg2) {
        this.field1089 += arg1;
        if (arg2 != 59 && arg2 != 76) {
            if (arg2 == 42) {
                int var4 = arg0.method216();
                int var5 = (var4 >> 4 & 7) + this.field1286;
                int var6 = (var4 & 7) + this.field1287;
                int var7 = arg0.method216();
                int var8 = var7 >> 2;
                int var9 = this.field1172[var8];
                int var10 = arg0.method218();
                if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                    int var11 = 0;
                    if (var9 == 0) {
                        var11 = this.field1322.method78(this.field1221, var5, var6);
                    }
                    if (var9 == 1) {
                        var11 = this.field1322.method79(false, var5, this.field1221, var6);
                    }
                    if (var9 == 2) {
                        var11 = this.field1322.method80(this.field1221, var5, var6);
                    }
                    if (var9 == 3) {
                        var11 = this.field1322.method81(this.field1221, var5, var6);
                    }
                    if (var11 != 0) {
                        LocEntity var12 = new LocEntity(var6, var5, SeqType.field1018[var10], var9, var11 >> 14 & 32767, false, this.field1221, 1);
                        this.field1502.method232(var12);
                    }
                }
            } else if (arg2 == 223) {
                int var13 = arg0.method216();
                int var14 = (var13 >> 4 & 7) + this.field1286;
                int var15 = (var13 & 7) + this.field1287;
                int var16 = arg0.method218();
                int var17 = arg0.method218();
                if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                    ObjStackEntity var18 = new ObjStackEntity();
                    var18.field303 = var16;
                    var18.field304 = var17;
                    if (this.field1418[this.field1221][var14][var15] == null) {
                        this.field1418[this.field1221][var14][var15] = new LinkList((byte) 30);
                    }
                    this.field1418[this.field1221][var14][var15].method232(var18);
                    this.method430(var14, var15);
                }
            } else if (arg2 == 49) {
                int var19 = arg0.method216();
                int var20 = (var19 >> 4 & 7) + this.field1286;
                int var21 = (var19 & 7) + this.field1287;
                int var22 = arg0.method218();
                if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                    LinkList var23 = this.field1418[this.field1221][var20][var21];
                    if (var23 != null) {
                        for (ObjStackEntity var24 = (ObjStackEntity) var23.method235(); var24 != null; var24 = (ObjStackEntity) var23.method237(-754)) {
                            if ((var22 & 32767) == var24.field303) {
                                var24.method108();
                                break;
                            }
                        }
                        if (var23.method235() == null) {
                            this.field1418[this.field1221][var20][var21] = null;
                        }
                        this.method430(var20, var21);
                    }
                }
            } else if (arg2 == 69) {
                int var25 = arg0.method216();
                int var26 = (var25 >> 4 & 7) + this.field1286;
                int var27 = (var25 & 7) + this.field1287;
                int var28 = var26 + arg0.method217();
                int var29 = var27 + arg0.method217();
                int var30 = arg0.method219();
                int var31 = arg0.method218();
                int var32 = arg0.method216();
                int var33 = arg0.method216();
                int var34 = arg0.method218();
                int var35 = arg0.method218();
                int var36 = arg0.method216();
                int var37 = arg0.method216();
                if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                    int var38 = var26 * 128 + 64;
                    int var39 = var27 * 128 + 64;
                    int var40 = var28 * 128 + 64;
                    int var41 = var29 * 128 + 64;
                    ProjectileEntity var42 = new ProjectileEntity(var39, var31, field1356 + var34, var30, field1356 + var35, var37, var33, this.method495(var39, false, this.field1221, var38) - var32, this.field1221, 45526, var36, var38);
                    var42.method117(var40, field1356 + var34, var41, 709, this.method495(var41, false, this.field1221, var40) - var33);
                    this.field1207.method232(var42);
                }
            } else if (arg2 == 191) {
                int var43 = arg0.method216();
                int var44 = (var43 >> 4 & 7) + this.field1286;
                int var45 = (var43 & 7) + this.field1287;
                int var46 = arg0.method218();
                int var47 = arg0.method216();
                int var48 = arg0.method218();
                if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
                    int var49 = var44 * 128 + 64;
                    int var50 = var45 * 128 + 64;
                    SpotAnimEntity var51 = new SpotAnimEntity(this.field1221, var50, field1356, var46, 6, var48, var49, this.method495(var50, false, this.field1221, var49) - var47);
                    this.field1149.method232(var51);
                }
            } else if (arg2 == 50) {
                int var52 = arg0.method216();
                int var53 = (var52 >> 4 & 7) + this.field1286;
                int var54 = (var52 & 7) + this.field1287;
                int var55 = arg0.method218();
                int var56 = arg0.method218();
                int var57 = arg0.method218();
                if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104 && this.field1282 != var57) {
                    ObjStackEntity var58 = new ObjStackEntity();
                    var58.field303 = var55;
                    var58.field304 = var56;
                    if (this.field1418[this.field1221][var53][var54] == null) {
                        this.field1418[this.field1221][var53][var54] = new LinkList((byte) 30);
                    }
                    this.field1418[this.field1221][var53][var54].method232(var58);
                    this.method430(var53, var54);
                }
            } else {
                if (arg2 == 23) {
                    int var59 = arg0.method216();
                    int var60 = (var59 >> 4 & 7) + this.field1286;
                    int var61 = (var59 & 7) + this.field1287;
                    int var62 = arg0.method216();
                    int var63 = var62 >> 2;
                    int var64 = var62 & 3;
                    int var65 = this.field1172[var63];
                    int var66 = arg0.method218();
                    int var67 = arg0.method218();
                    int var68 = arg0.method218();
                    int var69 = arg0.method218();
                    byte var70 = arg0.method217();
                    byte var71 = arg0.method217();
                    byte var72 = arg0.method217();
                    byte var73 = arg0.method217();
                    PlayerEntity var74;
                    if (this.field1282 == var69) {
                        var74 = this.field1453;
                    } else {
                        var74 = this.field1368[var69];
                    }
                    if (var74 != null) {
                        LocSpawned var75 = new LocSpawned(this.field1221, var61, field1356 + var67, var64, var60, var63, 41, var65, -1);
                        this.field1510.method232(var75);
                        LocSpawned var76 = new LocSpawned(this.field1221, var61, field1356 + var68, var64, var60, var63, 41, var65, var66);
                        this.field1510.method232(var76);
                        int var77 = this.field1140[this.field1221][var60][var61];
                        int var78 = this.field1140[this.field1221][var60 + 1][var61];
                        int var79 = this.field1140[this.field1221][var60 + 1][var61 + 1];
                        int var80 = this.field1140[this.field1221][var60][var61 + 1];
                        LocType var81 = LocType.method282(var66);
                        var74.field376 = field1356 + var67;
                        var74.field377 = field1356 + var68;
                        var74.field381 = var81.method285(var63, var64, var77, var78, var79, var80, -1);
                        int var82 = var81.field811;
                        int var83 = var81.field812;
                        if (var64 == 1 || var64 == 3) {
                            var82 = var81.field812;
                            var83 = var81.field811;
                        }
                        var74.field378 = var60 * 128 + var82 * 64;
                        var74.field380 = var61 * 128 + var83 * 64;
                        var74.field379 = this.method495(var74.field380, false, this.field1221, var74.field378);
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
                        var74.field382 = var60 + var70;
                        var74.field384 = var60 + var72;
                        var74.field383 = var61 + var71;
                        var74.field385 = var61 + var73;
                    }
                }
                if (arg2 == 151) {
                    int var86 = arg0.method216();
                    int var87 = (var86 >> 4 & 7) + this.field1286;
                    int var88 = (var86 & 7) + this.field1287;
                    int var89 = arg0.method218();
                    int var90 = arg0.method218();
                    int var91 = arg0.method218();
                    if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                        LinkList var92 = this.field1418[this.field1221][var87][var88];
                        if (var92 != null) {
                            for (ObjStackEntity var93 = (ObjStackEntity) var92.method235(); var93 != null; var93 = (ObjStackEntity) var92.method237(-754)) {
                                if ((var89 & 32767) == var93.field303 && var93.field304 == var90) {
                                    var93.field304 = var91;
                                    break;
                                }
                            }
                            this.method430(var87, var88);
                        }
                    }
                }
            }
        } else {
            int var94 = arg0.method216();
            int var95 = (var94 >> 4 & 7) + this.field1286;
            int var96 = (var94 & 7) + this.field1287;
            int var97 = arg0.method216();
            int var98 = var97 >> 2;
            int var99 = var97 & 3;
            int var100 = this.field1172[var98];
            int var101;
            if (arg2 == 76) {
                var101 = -1;
            } else {
                var101 = arg0.method218();
            }
            if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                LocMerged var102 = null;
                for (LocMerged var103 = (LocMerged) this.field1361.method235(); var103 != null; var103 = (LocMerged) this.field1361.method237(-754)) {
                    if (this.field1221 == var103.field636 && var103.field638 == var95 && var103.field639 == var96 && var103.field637 == var100) {
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
                        var104 = this.field1322.method78(this.field1221, var95, var96);
                    }
                    if (var100 == 1) {
                        var104 = this.field1322.method79(false, var95, this.field1221, var96);
                    }
                    if (var100 == 2) {
                        var104 = this.field1322.method80(this.field1221, var95, var96);
                    }
                    if (var100 == 3) {
                        var104 = this.field1322.method81(this.field1221, var95, var96);
                    }
                    if (var104 != 0) {
                        int var108 = this.field1322.method82(this.field1221, var95, var96, var104);
                        var105 = var104 >> 14 & 32767;
                        var106 = var108 & 31;
                        var107 = var108 >> 6;
                    }
                    var102 = new LocMerged();
                    var102.field636 = this.field1221;
                    var102.field637 = var100;
                    var102.field638 = var95;
                    var102.field639 = var96;
                    var102.field643 = var105;
                    var102.field645 = var106;
                    var102.field644 = var107;
                    this.field1361.method232(var102);
                }
                var102.field640 = var101;
                var102.field642 = var98;
                var102.field641 = var99;
                this.method402(var96, this.field1168, var100, var101, var98, var99, this.field1221, var95);
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field1185[var1] = var0 / 4;
        }
        field1213 = 721;
        field1259 = 21;
        field1262 = 10;
        field1264 = true;
        field1309 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field1349 = -638;
        field1351 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field1394 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field1482 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
    }
}
