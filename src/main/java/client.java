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

    @OriginalMember(owner = "client", name = "D", descriptor = "Z")
    private boolean field1132 = false;

    @OriginalMember(owner = "client", name = "F", descriptor = "[I")
    private int[] field1134 = new int[100];

    @OriginalMember(owner = "client", name = "G", descriptor = "[Ljava/lang/String;")
    private String[] field1135 = new String[100];

    @OriginalMember(owner = "client", name = "H", descriptor = "[Ljava/lang/String;")
    private String[] field1136 = new String[100];

    @OriginalMember(owner = "client", name = "N", descriptor = "Z")
    private boolean field1142 = false;

    @OriginalMember(owner = "client", name = "O", descriptor = "[Ljava/lang/String;")
    private String[] field1143 = new String[100];

    @OriginalMember(owner = "client", name = "P", descriptor = "[Ljb;")
    private Pix32[] field1144 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Q", descriptor = "B")
    private byte field1145 = 0;

    @OriginalMember(owner = "client", name = "S", descriptor = "Z")
    private boolean field1147 = true;

    @OriginalMember(owner = "client", name = "T", descriptor = "B")
    private byte field1148 = 114;

    @OriginalMember(owner = "client", name = "X", descriptor = "[I")
    private int[] field1152 = new int[50];

    @OriginalMember(owner = "client", name = "Y", descriptor = "Z")
    private boolean field1153 = true;

    @OriginalMember(owner = "client", name = "Z", descriptor = "[I")
    private int[] field1154 = new int[50];

    @OriginalMember(owner = "client", name = "bb", descriptor = "Z")
    private boolean field1156 = false;

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    private int field1157 = 5063219;

    @OriginalMember(owner = "client", name = "eb", descriptor = "Z")
    private boolean field1159 = false;

    @OriginalMember(owner = "client", name = "ib", descriptor = "Lpb;")
    private LinkList field1163 = new LinkList(-740);

    @OriginalMember(owner = "client", name = "jb", descriptor = "[[I")
    private int[][] field1164 = new int[104][104];

    @OriginalMember(owner = "client", name = "kb", descriptor = "[Lkb;")
    private Pix8[] field1165 = new Pix8[50];

    @OriginalMember(owner = "client", name = "lb", descriptor = "[I")
    private int[] field1166 = new int[50];

    @OriginalMember(owner = "client", name = "mb", descriptor = "Z")
    private boolean field1167 = false;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field1170 = -1;

    @OriginalMember(owner = "client", name = "qb", descriptor = "[J")
    private long[] field1171 = new long[100];

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field1172 = -1;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field1181 = 1;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field1184 = -281;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Z")
    private boolean field1185 = false;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field1186 = -1;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field1188 = 7;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "[Z")
    private boolean[] field1189 = new boolean[5];

    @OriginalMember(owner = "client", name = "Kb", descriptor = "Z")
    private boolean field1191 = false;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    private int field1193 = 2;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "Z")
    private boolean field1197 = true;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field1198 = -491;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field1200 = 2;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "Z")
    private boolean field1206 = false;

    @OriginalMember(owner = "client", name = "ac", descriptor = "[I")
    private int[] field1207 = new int[5];

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field1208 = -1;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field1209 = -1;

    @OriginalMember(owner = "client", name = "ec", descriptor = "[Ljb;")
    private Pix32[] field1211 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "fc", descriptor = "[I")
    private final int[] field1212 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "gc", descriptor = "[I")
    private int[] field1213 = new int[151];

    @OriginalMember(owner = "client", name = "ic", descriptor = "[I")
    private int[] field1215 = new int[1000];

    @OriginalMember(owner = "client", name = "jc", descriptor = "[I")
    private int[] field1216 = new int[1000];

    @OriginalMember(owner = "client", name = "kc", descriptor = "Ljava/lang/String;")
    private String field1217 = "";

    @OriginalMember(owner = "client", name = "lc", descriptor = "[Lwb;")
    public FileStream[] field1218 = new FileStream[5];

    @OriginalMember(owner = "client", name = "vc", descriptor = "[I")
    private int[] field1228 = new int[256];

    @OriginalMember(owner = "client", name = "xc", descriptor = "[Lab;")
    private NpcEntity[] field1230 = new NpcEntity[8192];

    @OriginalMember(owner = "client", name = "zc", descriptor = "[I")
    public int[] field1232 = new int[8192];

    @OriginalMember(owner = "client", name = "Qc", descriptor = "Lpb;")
    private LinkList field1249 = new LinkList(-740);

    @OriginalMember(owner = "client", name = "Rc", descriptor = "B")
    private byte field1250 = 7;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "[I")
    private int[] field1254 = new int[33];

    @OriginalMember(owner = "client", name = "id", descriptor = "[Ljb;")
    private Pix32[] field1267 = new Pix32[8];

    @OriginalMember(owner = "client", name = "jd", descriptor = "[I")
    private int[] field1268 = new int[100];

    @OriginalMember(owner = "client", name = "kd", descriptor = "[I")
    private int[] field1269 = new int[2000];

    @OriginalMember(owner = "client", name = "ld", descriptor = "[[I")
    private int[][] field1270 = new int[104][104];

    @OriginalMember(owner = "client", name = "nd", descriptor = "Ld;")
    private Component field1272 = new Component();

    @OriginalMember(owner = "client", name = "Ad", descriptor = "[[I")
    private int[][] field1285 = new int[104][104];

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field1287 = 668;

    @OriginalMember(owner = "client", name = "Id", descriptor = "[I")
    private int[] field1293 = new int[33];

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private int field1295 = 2;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "B")
    private byte field1301 = 26;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "[I")
    private int[] field1302 = new int[50];

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field1303 = 7;

    @OriginalMember(owner = "client", name = "Td", descriptor = "Ljava/lang/String;")
    private String field1304 = "";

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field1321 = 883;

    @OriginalMember(owner = "client", name = "oe", descriptor = "[I")
    private int[] field1325 = new int[5];

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field1326 = 7759444;

    @OriginalMember(owner = "client", name = "qe", descriptor = "Z")
    private boolean field1327 = false;

    @OriginalMember(owner = "client", name = "re", descriptor = "[I")
    private int[] field1328 = new int[5];

    @OriginalMember(owner = "client", name = "se", descriptor = "[[[Lpb;")
    private LinkList[][][] field1329 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "ve", descriptor = "[Ljb;")
    private Pix32[] field1332 = new Pix32[20];

    @OriginalMember(owner = "client", name = "we", descriptor = "[I")
    private int[] field1333 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field1335 = -75;

    @OriginalMember(owner = "client", name = "ze", descriptor = "Ljava/lang/String;")
    private String field1336 = "";

    @OriginalMember(owner = "client", name = "Ae", descriptor = "Z")
    private boolean field1337 = false;

    @OriginalMember(owner = "client", name = "De", descriptor = "Z")
    private boolean field1340 = false;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "[J")
    private long[] field1345 = new long[100];

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field1347 = 1;

    @OriginalMember(owner = "client", name = "Le", descriptor = "Z")
    private boolean field1348 = false;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field1349 = -1;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "[I")
    public int[] field1351 = new int[1000];

    @OriginalMember(owner = "client", name = "df", descriptor = "Z")
    private boolean field1366 = false;

    @OriginalMember(owner = "client", name = "gf", descriptor = "[I")
    private int[] field1369 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "hf", descriptor = "[I")
    private int[] field1370 = new int[50];

    @OriginalMember(owner = "client", name = "mf", descriptor = "Z")
    private boolean field1374 = false;

    @OriginalMember(owner = "client", name = "nf", descriptor = "[Ljb;")
    private Pix32[] field1375 = new Pix32[50];

    @OriginalMember(owner = "client", name = "of", descriptor = "[I")
    private int[] field1376 = new int[500];

    @OriginalMember(owner = "client", name = "pf", descriptor = "[I")
    private int[] field1377 = new int[500];

    @OriginalMember(owner = "client", name = "qf", descriptor = "[I")
    private int[] field1378 = new int[500];

    @OriginalMember(owner = "client", name = "rf", descriptor = "[I")
    private int[] field1379 = new int[500];

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field1381 = 50;

    @OriginalMember(owner = "client", name = "uf", descriptor = "[I")
    private int[] field1382 = new int[this.field1381];

    @OriginalMember(owner = "client", name = "vf", descriptor = "[I")
    private int[] field1383 = new int[this.field1381];

    @OriginalMember(owner = "client", name = "wf", descriptor = "[I")
    private int[] field1384 = new int[this.field1381];

    @OriginalMember(owner = "client", name = "xf", descriptor = "[I")
    private int[] field1385 = new int[this.field1381];

    @OriginalMember(owner = "client", name = "yf", descriptor = "[I")
    private int[] field1386 = new int[this.field1381];

    @OriginalMember(owner = "client", name = "zf", descriptor = "[I")
    private int[] field1387 = new int[this.field1381];

    @OriginalMember(owner = "client", name = "Af", descriptor = "[I")
    private int[] field1388 = new int[this.field1381];

    @OriginalMember(owner = "client", name = "Bf", descriptor = "[Ljava/lang/String;")
    private String[] field1389 = new String[this.field1381];

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field1390 = -1;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "B")
    private byte field1397 = 6;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "Z")
    private boolean field1398 = true;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "[I")
    private int[] field1400 = new int[151];

    @OriginalMember(owner = "client", name = "Nf", descriptor = "Ljava/lang/String;")
    private String field1401 = "";

    @OriginalMember(owner = "client", name = "Of", descriptor = "Ljava/lang/String;")
    private String field1402 = "";

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field1403 = 13841;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "Lmb;")
    private Packet field1405 = Packet.method218(false, 1);

    @OriginalMember(owner = "client", name = "Sf", descriptor = "Z")
    private boolean field1406 = false;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field1415 = -1;

    @OriginalMember(owner = "client", name = "cg", descriptor = "[B")
    private byte[] field1416 = new byte[16384];

    @OriginalMember(owner = "client", name = "dg", descriptor = "Z")
    private boolean field1417 = false;

    @OriginalMember(owner = "client", name = "kg", descriptor = "[I")
    private int[] field1424 = new int[5];

    @OriginalMember(owner = "client", name = "lg", descriptor = "Z")
    private boolean field1425 = false;

    @OriginalMember(owner = "client", name = "mg", descriptor = "Lmb;")
    private Packet field1426 = Packet.method218(false, 1);

    @OriginalMember(owner = "client", name = "ng", descriptor = "I")
    private int field1427 = -1;

    @OriginalMember(owner = "client", name = "og", descriptor = "Z")
    private boolean field1428 = false;

    @OriginalMember(owner = "client", name = "vg", descriptor = "Z")
    private boolean field1435 = false;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "[Ljava/lang/String;")
    private String[] field1444 = new String[500];

    @OriginalMember(owner = "client", name = "Ig", descriptor = "Z")
    private boolean field1448 = false;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "Z")
    private boolean field1449 = false;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "Z")
    private boolean field1450 = false;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "Ljava/lang/String;")
    private String field1451 = "";

    @OriginalMember(owner = "client", name = "Mg", descriptor = "Ljava/lang/String;")
    private String field1452 = "";

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field1456 = 78;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "Z")
    private boolean field1457 = true;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "Z")
    private boolean field1462 = false;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Z")
    public boolean field1463 = false;

    @OriginalMember(owner = "client", name = "fh", descriptor = "[Lic;")
    private CollisionMap[] field1471 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "jh", descriptor = "[I")
    private int[] field1475 = new int[50];

    @OriginalMember(owner = "client", name = "mh", descriptor = "Z")
    private boolean field1478 = false;

    @OriginalMember(owner = "client", name = "qh", descriptor = "I")
    private int field1482 = 3353893;

    @OriginalMember(owner = "client", name = "sh", descriptor = "Z")
    private boolean field1484 = false;

    @OriginalMember(owner = "client", name = "th", descriptor = "[I")
    private int[] field1485 = new int[5];

    @OriginalMember(owner = "client", name = "zh", descriptor = "Lmb;")
    private Packet field1491 = Packet.method218(false, 1);

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private int field1492 = 2048;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field1493 = 2047;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "[Lbb;")
    private PlayerEntity[] field1494 = new PlayerEntity[this.field1492];

    @OriginalMember(owner = "client", name = "Eh", descriptor = "[I")
    public int[] field1496 = new int[this.field1492];

    @OriginalMember(owner = "client", name = "Gh", descriptor = "[I")
    private int[] field1498 = new int[this.field1492];

    @OriginalMember(owner = "client", name = "Hh", descriptor = "[Lmb;")
    private Packet[] field1499 = new Packet[this.field1492];

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field1501 = -1;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "Ljava/lang/String;")
    private String field1506 = "";

    @OriginalMember(owner = "client", name = "Ph", descriptor = "Ljava/lang/String;")
    private String field1507 = "";

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    private int field1508 = 281;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "Z")
    private boolean field1515 = true;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private final int field1517 = 100;

    @OriginalMember(owner = "client", name = "ai", descriptor = "[I")
    private int[] field1518 = new int[100];

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field1521 = -1;

    @OriginalMember(owner = "client", name = "ei", descriptor = "Lpb;")
    private LinkList field1522 = new LinkList(-740);

    @OriginalMember(owner = "client", name = "hi", descriptor = "[I")
    private int[] field1525 = new int[9];

    @OriginalMember(owner = "client", name = "ji", descriptor = "Z")
    private boolean field1527 = false;

    @OriginalMember(owner = "client", name = "ki", descriptor = "[Lkb;")
    private Pix8[] field1528 = new Pix8[13];

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field1530 = -1;

    @OriginalMember(owner = "client", name = "ni", descriptor = "[I")
    private int[] field1531 = new int[2000];

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field1533 = 2301979;

    @OriginalMember(owner = "client", name = "qi", descriptor = "[I")
    private int[] field1534 = new int[7];

    @OriginalMember(owner = "client", name = "ri", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1535 = new CRC32();

    @OriginalMember(owner = "client", name = "si", descriptor = "Z")
    private boolean field1536 = false;

    @OriginalMember(owner = "client", name = "ui", descriptor = "B")
    private byte field1538 = 8;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field1540 = 3;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field1542 = 128;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field1553 = -203;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "Z")
    private boolean field1554 = true;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "[I")
    private int[] field1559 = new int[4000];

    @OriginalMember(owner = "client", name = "Qi", descriptor = "[I")
    private int[] field1560 = new int[4000];

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field1561 = -1;

    @OriginalMember(owner = "client", name = "I", descriptor = "I")
    private static int field1137 = 10;

    @OriginalMember(owner = "client", name = "K", descriptor = "Z")
    private static boolean field1139 = true;

    @OriginalMember(owner = "client", name = "xb", descriptor = "[I")
    private static int[] field1178 = new int[99];

    @OriginalMember(owner = "client", name = "Bb", descriptor = "[[I")
    public static final int[][] field1182;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1258;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private static int field1260;

    @OriginalMember(owner = "client", name = "md", descriptor = "[I")
    public static final int[] field1271;

    @OriginalMember(owner = "client", name = "od", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1273;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private static int field1472;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "Ljava/lang/String;")
    private static String field1500;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private static int field1532;

    @OriginalMember(owner = "client", name = "C", descriptor = "I")
    private static int field1131;

    @OriginalMember(owner = "client", name = "J", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field1141;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field1146;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private static int field1149;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field1155;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private static int field1160;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field1162;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private static int field1168;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private int field1169;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field1173;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field1174;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field1175;

    @OriginalMember(owner = "client", name = "vb", descriptor = "I")
    private int field1176;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private static int field1179;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field1180;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private static int field1183;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field1190;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field1192;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private int field1194;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field1195;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field1196;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field1199;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field1201;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field1202;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field1203;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field1204;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1210;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field1219;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field1221;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field1222;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field1223;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field1229;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field1235;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field1236;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field1237;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private static int field1248;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field1251;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field1252;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field1265;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field1274;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field1275;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field1276;

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field1277;

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field1289;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field1294;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private int field1296;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field1300;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    private int field1305;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field1315;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field1323;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field1324;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private static int field1334;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field1338;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field1339;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field1341;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field1350;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field1355;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field1365;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field1367;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field1371;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field1372;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field1399;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private static int field1404;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field1419;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field1420;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field1421;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field1440;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field1441;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field1446;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field1447;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "I")
    private static int field1453;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private static int field1455;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private static int field1459;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private static int field1460;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client", name = "ah", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client", name = "bh", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private int field1468;

    @OriginalMember(owner = "client", name = "dh", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private int field1470;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field1474;

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private static int field1476;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private static int field1477;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private static int field1483;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field1488;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field1489;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field1509;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client", name = "Th", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private int field1512;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private static int field1519;

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private static int field1537;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field1541;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field1544;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field1548;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field1549;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field1550;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field1551;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client", name = "E", descriptor = "J")
    private long field1133;

    @OriginalMember(owner = "client", name = "ug", descriptor = "J")
    private long field1434;

    @OriginalMember(owner = "client", name = "nh", descriptor = "J")
    private long field1479;

    @OriginalMember(owner = "client", name = "ed", descriptor = "Le;")
    private ClientStream field1263;

    @OriginalMember(owner = "client", name = "ci", descriptor = "Lxb;")
    private Isaac field1520;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Lyb;")
    private Jagfile field1514;

    @OriginalMember(owner = "client", name = "ad", descriptor = "Lvb;")
    private OnDemand field1259;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "Ljb;")
    private Pix32 field1187;

    @OriginalMember(owner = "client", name = "rc", descriptor = "Ljb;")
    private Pix32 field1224;

    @OriginalMember(owner = "client", name = "sc", descriptor = "Ljb;")
    private Pix32 field1225;

    @OriginalMember(owner = "client", name = "tc", descriptor = "Ljb;")
    private Pix32 field1226;

    @OriginalMember(owner = "client", name = "uc", descriptor = "Ljb;")
    private Pix32 field1227;

    @OriginalMember(owner = "client", name = "te", descriptor = "Ljb;")
    private Pix32 field1330;

    @OriginalMember(owner = "client", name = "ue", descriptor = "Ljb;")
    private Pix32 field1331;

    @OriginalMember(owner = "client", name = "He", descriptor = "Ljb;")
    private Pix32 field1344;

    @OriginalMember(owner = "client", name = "lf", descriptor = "Ljb;")
    private Pix32 field1373;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "Ljb;")
    private Pix32 field1464;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Ljb;")
    private Pix32 field1465;

    @OriginalMember(owner = "client", name = "cd", descriptor = "Lkb;")
    private Pix8 field1261;

    @OriginalMember(owner = "client", name = "dd", descriptor = "Lkb;")
    private Pix8 field1262;

    @OriginalMember(owner = "client", name = "vd", descriptor = "Lkb;")
    private Pix8 field1280;

    @OriginalMember(owner = "client", name = "wd", descriptor = "Lkb;")
    private Pix8 field1281;

    @OriginalMember(owner = "client", name = "xd", descriptor = "Lkb;")
    private Pix8 field1282;

    @OriginalMember(owner = "client", name = "yd", descriptor = "Lkb;")
    private Pix8 field1283;

    @OriginalMember(owner = "client", name = "zd", descriptor = "Lkb;")
    private Pix8 field1284;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "Lkb;")
    private Pix8 field1291;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "Lkb;")
    private Pix8 field1292;

    @OriginalMember(owner = "client", name = "be", descriptor = "Lkb;")
    private Pix8 field1312;

    @OriginalMember(owner = "client", name = "ce", descriptor = "Lkb;")
    private Pix8 field1313;

    @OriginalMember(owner = "client", name = "de", descriptor = "Lkb;")
    private Pix8 field1314;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "Lkb;")
    private Pix8 field1352;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "Lkb;")
    private Pix8 field1353;

    @OriginalMember(owner = "client", name = "Re", descriptor = "Lkb;")
    private Pix8 field1354;

    @OriginalMember(owner = "client", name = "Df", descriptor = "Lkb;")
    private Pix8 field1391;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Lkb;")
    private Pix8 field1392;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "Lkb;")
    private Pix8 field1393;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "Lkb;")
    private Pix8 field1394;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "Lkb;")
    private Pix8 field1395;

    @OriginalMember(owner = "client", name = "ge", descriptor = "Llb;")
    private PixFont field1317;

    @OriginalMember(owner = "client", name = "he", descriptor = "Llb;")
    private PixFont field1318;

    @OriginalMember(owner = "client", name = "ie", descriptor = "Llb;")
    private PixFont field1319;

    @OriginalMember(owner = "client", name = "je", descriptor = "Llb;")
    private PixFont field1320;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "Lrb;")
    private PixMap field1238;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "Lrb;")
    private PixMap field1239;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "Lrb;")
    private PixMap field1240;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "Lrb;")
    private PixMap field1241;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "Lrb;")
    private PixMap field1242;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "Lrb;")
    private PixMap field1243;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "Lrb;")
    private PixMap field1244;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "Lrb;")
    private PixMap field1245;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "Lrb;")
    private PixMap field1246;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "Lrb;")
    private PixMap field1247;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "Lrb;")
    private PixMap field1255;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "Lrb;")
    private PixMap field1256;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "Lrb;")
    private PixMap field1257;

    @OriginalMember(owner = "client", name = "Te", descriptor = "Lrb;")
    private PixMap field1356;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "Lrb;")
    private PixMap field1357;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "Lrb;")
    private PixMap field1358;

    @OriginalMember(owner = "client", name = "We", descriptor = "Lrb;")
    private PixMap field1359;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "Lrb;")
    private PixMap field1360;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "Lrb;")
    private PixMap field1361;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "Lrb;")
    private PixMap field1362;

    @OriginalMember(owner = "client", name = "af", descriptor = "Lrb;")
    private PixMap field1363;

    @OriginalMember(owner = "client", name = "bf", descriptor = "Lrb;")
    private PixMap field1364;

    @OriginalMember(owner = "client", name = "pg", descriptor = "Lrb;")
    private PixMap field1429;

    @OriginalMember(owner = "client", name = "qg", descriptor = "Lrb;")
    private PixMap field1430;

    @OriginalMember(owner = "client", name = "rg", descriptor = "Lrb;")
    private PixMap field1431;

    @OriginalMember(owner = "client", name = "sg", descriptor = "Lrb;")
    private PixMap field1432;

    @OriginalMember(owner = "client", name = "fe", descriptor = "Lbb;")
    public static PlayerEntity field1316;

    @OriginalMember(owner = "client", name = "li", descriptor = "Ls;")
    private World3D field1529;

    @OriginalMember(owner = "client", name = "wb", descriptor = "Ljava/lang/String;")
    public String field1177;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "Ljava/lang/String;")
    public String field1205;

    @OriginalMember(owner = "client", name = "eg", descriptor = "Ljava/lang/String;")
    private String field1418;

    @OriginalMember(owner = "client", name = "L", descriptor = "Z")
    private static boolean field1140;

    @OriginalMember(owner = "client", name = "fd", descriptor = "Z")
    private static boolean field1264;

    @OriginalMember(owner = "client", name = "oh", descriptor = "Z")
    private static boolean field1480;

    @OriginalMember(owner = "client", name = "Si", descriptor = "Z")
    public static boolean field1562;

    @OriginalMember(owner = "client", name = "V", descriptor = "[I")
    private int[] field1150;

    @OriginalMember(owner = "client", name = "W", descriptor = "[I")
    private int[] field1151;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "[I")
    private int[] field1307;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "[I")
    private int[] field1308;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "[I")
    private int[] field1309;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "[I")
    private int[] field1310;

    @OriginalMember(owner = "client", name = "ae", descriptor = "[I")
    private int[] field1311;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "[I")
    private int[] field1503;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "[I")
    private int[] field1504;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "[I")
    private int[] field1505;

    @OriginalMember(owner = "client", name = "Li", descriptor = "[I")
    private int[] field1555;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "[I")
    private int[] field1556;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "[I")
    private int[] field1557;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "[I")
    private int[] field1558;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "[Lkb;")
    private Pix8[] field1546;

    @OriginalMember(owner = "client", name = "If", descriptor = "[[B")
    private byte[][] field1396;

    @OriginalMember(owner = "client", name = "fi", descriptor = "[[B")
    private byte[][] field1523;

    @OriginalMember(owner = "client", name = "ii", descriptor = "[[[B")
    private byte[][][] field1526;

    @OriginalMember(owner = "client", name = "gi", descriptor = "[[[I")
    private int[][][] field1524;

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method9(byte arg0) {
        if (!this.field1327 && !this.field1449 && !this.field1340) {
            ++field1161;
            if (!this.field1463) {
                this.method466(false);
            } else {
                this.method528(72);
            }
            this.field1141 = 0;
            if (arg0 != 4) {
                this.field1491.method221(122);
            }
        } else {
            this.method487(-171);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZII)V")
    public final void method414(boolean arg0, int arg1, int arg2) {
        signlink.midivol = arg1;
        this.field1547 += arg2;
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field15 != null) {
                    return new URL("http://127.0.0.1:" + (field1138 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;Z)V")
    private final void method415(int arg0, Packet arg1, boolean arg2) {
        this.field1350 = 0;
        this.field1497 = 0;
        this.method490(arg1, arg0, (byte) 4);
        if (arg2) {
            this.field1197 = !this.field1197;
        }
        this.method426(arg1, 10091, arg0);
        this.method420(this.field1153, arg0, arg1);
        for (int var4 = 0; var4 < this.field1350; ++var4) {
            int var6 = this.field1351[var4];
            if (field1288 != this.field1230[var6].field441) {
                this.field1230[var6].field450 = null;
                this.field1230[var6] = null;
            }
        }
        if (arg1.field694 != arg0) {
            signlink.reporterror(this.field1451 + " size mismatch in getnpcpos - pos:" + arg1.field694 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1231; ++var5) {
                if (this.field1230[this.field1232[var5]] == null) {
                    signlink.reporterror(this.field1451 + " null entry in npc list - pos:" + var5 + " size:" + this.field1231);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIIIIIBIIII)Z")
    public final boolean method416(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var36 = 0; var36 < var14; ++var36) {
                this.field1285[var15][var36] = 0;
                this.field1270[var15][var36] = 99999999;
            }
        }
        int var16 = arg2;
        int var17 = arg3;
        this.field1285[arg2][arg3] = 99;
        this.field1270[arg2][arg3] = 0;
        byte var18 = 0;
        int var19 = 0;
        if (arg7 == 8) {
            boolean var20 = false;
        } else {
            field1160 = this.field1520.method291();
        }
        this.field1559[var18] = arg2;
        int var37 = var18 + 1;
        this.field1560[var18] = arg3;
        boolean var21 = false;
        int var22 = this.field1559.length;
        int[][] var23 = this.field1471[this.field1146].field1034;
        while (var37 != var19) {
            var16 = this.field1559[var19];
            var17 = this.field1560[var19];
            var19 = (var19 + 1) % var22;
            if (arg9 == var16 && arg1 == var17) {
                var21 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && this.field1471[this.field1146].method355(arg10 - 1, arg9, var17, arg1, var16, arg4, 0)) {
                    var21 = true;
                    break;
                }
                if (arg10 < 10 && this.field1471[this.field1146].method356(arg4, var17, 5, arg9, var16, arg1, arg10 - 1)) {
                    var21 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg8 != 0 && this.field1471[this.field1146].method357(arg8, arg1, arg11, 2, arg9, var16, arg5, var17)) {
                var21 = true;
                break;
            }
            int var35 = this.field1270[var16][var17] + 1;
            if (var16 > 0 && this.field1285[var16 - 1][var17] == 0 && (var23[var16 - 1][var17] & 2621704) == 0) {
                this.field1559[var37] = var16 - 1;
                this.field1560[var37] = var17;
                var37 = (var37 + 1) % var22;
                this.field1285[var16 - 1][var17] = 2;
                this.field1270[var16 - 1][var17] = var35;
            }
            if (var16 < var13 - 1 && this.field1285[var16 + 1][var17] == 0 && (var23[var16 + 1][var17] & 2621824) == 0) {
                this.field1559[var37] = var16 + 1;
                this.field1560[var37] = var17;
                var37 = (var37 + 1) % var22;
                this.field1285[var16 + 1][var17] = 8;
                this.field1270[var16 + 1][var17] = var35;
            }
            if (var17 > 0 && this.field1285[var16][var17 - 1] == 0 && (var23[var16][var17 - 1] & 2621698) == 0) {
                this.field1559[var37] = var16;
                this.field1560[var37] = var17 - 1;
                var37 = (var37 + 1) % var22;
                this.field1285[var16][var17 - 1] = 1;
                this.field1270[var16][var17 - 1] = var35;
            }
            if (var17 < var14 - 1 && this.field1285[var16][var17 + 1] == 0 && (var23[var16][var17 + 1] & 2621728) == 0) {
                this.field1559[var37] = var16;
                this.field1560[var37] = var17 + 1;
                var37 = (var37 + 1) % var22;
                this.field1285[var16][var17 + 1] = 4;
                this.field1270[var16][var17 + 1] = var35;
            }
            if (var16 > 0 && var17 > 0 && this.field1285[var16 - 1][var17 - 1] == 0 && (var23[var16 - 1][var17 - 1] & 2621710) == 0 && (var23[var16 - 1][var17] & 2621704) == 0 && (var23[var16][var17 - 1] & 2621698) == 0) {
                this.field1559[var37] = var16 - 1;
                this.field1560[var37] = var17 - 1;
                var37 = (var37 + 1) % var22;
                this.field1285[var16 - 1][var17 - 1] = 3;
                this.field1270[var16 - 1][var17 - 1] = var35;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1285[var16 + 1][var17 - 1] == 0 && (var23[var16 + 1][var17 - 1] & 2621827) == 0 && (var23[var16 + 1][var17] & 2621824) == 0 && (var23[var16][var17 - 1] & 2621698) == 0) {
                this.field1559[var37] = var16 + 1;
                this.field1560[var37] = var17 - 1;
                var37 = (var37 + 1) % var22;
                this.field1285[var16 + 1][var17 - 1] = 9;
                this.field1270[var16 + 1][var17 - 1] = var35;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1285[var16 - 1][var17 + 1] == 0 && (var23[var16 - 1][var17 + 1] & 2621752) == 0 && (var23[var16 - 1][var17] & 2621704) == 0 && (var23[var16][var17 + 1] & 2621728) == 0) {
                this.field1559[var37] = var16 - 1;
                this.field1560[var37] = var17 + 1;
                var37 = (var37 + 1) % var22;
                this.field1285[var16 - 1][var17 + 1] = 6;
                this.field1270[var16 - 1][var17 + 1] = var35;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1285[var16 + 1][var17 + 1] == 0 && (var23[var16 + 1][var17 + 1] & 2621920) == 0 && (var23[var16 + 1][var17] & 2621824) == 0 && (var23[var16][var17 + 1] & 2621728) == 0) {
                this.field1559[var37] = var16 + 1;
                this.field1560[var37] = var17 + 1;
                var37 = (var37 + 1) % var22;
                this.field1285[var16 + 1][var17 + 1] = 12;
                this.field1270[var16 + 1][var17 + 1] = var35;
            }
        }
        this.field1279 = 0;
        if (!var21) {
            if (arg0) {
                int var24 = 100;
                for (int var25 = 1; var25 < 2; ++var25) {
                    for (int var26 = arg9 - var25; var26 <= arg9 + var25; ++var26) {
                        for (int var27 = arg1 - var25; var27 <= arg1 + var25; ++var27) {
                            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field1270[var26][var27] < var24) {
                                var24 = this.field1270[var26][var27];
                                var16 = var26;
                                var17 = var27;
                                this.field1279 = 1;
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
        this.field1559[var28] = var16;
        int var38 = var28 + 1;
        this.field1560[var28] = var17;
        int var29;
        int var30 = var29 = this.field1285[var16][var17];
        while (arg2 != var16 || arg3 != var17) {
            if (var29 != var30) {
                var29 = var30;
                this.field1559[var38] = var16;
                this.field1560[var38++] = var17;
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
            var30 = this.field1285[var16][var17];
        }
        if (var38 <= 0) {
            if (arg6 == 1) {
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
            int var32 = this.field1559[var38];
            int var33 = this.field1560[var38];
            if (arg6 == 0) {
                this.field1491.method220(this.field1553, 222);
                this.field1491.method221(var31 + var31 + 3);
            }
            if (arg6 == 1) {
                this.field1491.method220(this.field1553, 201);
                this.field1491.method221(var31 + var31 + 3 + 14);
            }
            if (arg6 == 2) {
                this.field1491.method220(this.field1553, 140);
                this.field1491.method221(var31 + var31 + 3);
            }
            if (super.field24[5] == 1) {
                this.field1491.method221(1);
            } else {
                this.field1491.method221(0);
            }
            this.field1491.method222(this.field1487 + var32);
            this.field1491.method222(this.field1488 + var33);
            this.field1371 = this.field1559[0];
            this.field1372 = this.field1560[0];
            for (int var34 = 1; var34 < var31; ++var34) {
                --var38;
                this.field1491.method221(this.field1559[var38] - var32);
                this.field1491.method221(this.field1560[var38] - var33);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method417(int arg0) {
        if (this.field1290 != 0) {
            PixFont var2 = this.field1318;
            int var3 = 0;
            if (arg0 < 6 || arg0 > 6) {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
            if (this.field1286 != 0) {
                var3 = 1;
            }
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field1136[var5] != null) {
                    int var6 = this.field1134[var5];
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field1443 == 0 || this.field1443 == 1 && this.method454(true, this.field1135[var5]))) {
                        int var7 = 329 - var3 * 13;
                        var2.method209(4, "From " + this.field1135[var5] + ": " + this.field1136[var5], this.field1142, 0, var7);
                        var2.method209(4, "From " + this.field1135[var5] + ": " + this.field1136[var5], this.field1142, 65535, var7 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 5 && this.field1443 < 2) {
                        int var8 = 329 - var3 * 13;
                        var2.method209(4, this.field1136[var5], this.field1142, 0, var8);
                        var2.method209(4, this.field1136[var5], this.field1142, 65535, var8 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 6 && this.field1443 < 2) {
                        int var9 = 329 - var3 * 13;
                        var2.method209(4, "To " + this.field1135[var5] + ": " + this.field1136[var5], this.field1142, 0, var9);
                        var2.method209(4, "To " + this.field1135[var5] + ": " + this.field1136[var5], this.field1142, 65535, var9 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method418(int arg0) {
        try {
            if (this.field1263 != null) {
                this.field1263.method37();
            }
        } catch (Exception var3) {
        }
        this.field1263 = null;
        this.field1463 = false;
        if (arg0 != 2) {
            this.field1548 = this.field1426.method231();
        }
        this.field1252 = 0;
        this.field1451 = "";
        this.field1452 = "";
        InputTracking.method44(49423);
        this.method542(true);
        this.field1529.method62(this.field1403);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field1471[var2].method346((byte) 77);
        }
        System.gc();
        this.method543(3);
        this.field1186 = -1;
        this.field1190 = -1;
        this.field1539 = 0;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)Z")
    public final boolean method419(byte arg0) {
        if (this.field1538 == arg0) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILmb;)V")
    private final void method420(boolean arg0, int arg1, Packet arg2) {
        for (int var4 = 0; var4 < this.field1497; ++var4) {
            int var5 = this.field1498[var4];
            NpcEntity var6 = this.field1230[var5];
            int var7 = arg2.method231();
            if ((var7 & 2) == 2) {
                int var8 = arg2.method233();
                if (var8 == 65535) {
                    var8 = -1;
                }
                if (var6.field424 == var8) {
                    var6.field428 = 0;
                }
                int var9 = arg2.method231();
                if (var8 == -1 || var6.field424 == -1 || SeqType.field1069[var8].field1077 > SeqType.field1069[var6.field424].field1077 || SeqType.field1069[var6.field424].field1077 == 0) {
                    var6.field424 = var8;
                    var6.field425 = 0;
                    var6.field426 = 0;
                    var6.field427 = var9;
                    var6.field428 = 0;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field418 = arg2.method233();
                if (var6.field418 == 65535) {
                    var6.field418 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field409 = arg2.method238();
                var6.field410 = 100;
            }
            if ((var7 & 16) == 16) {
                var6.field413 = arg2.method231();
                var6.field414 = arg2.method231();
                var6.field415 = field1288 + 400;
                var6.field416 = arg2.method231();
                var6.field417 = arg2.method231();
            }
            if ((var7 & 32) == 32) {
                var6.field450 = NpcType.method329(arg2.method233());
                var6.field404 = var6.field450.field960;
                var6.field405 = var6.field450.field961;
                var6.field406 = var6.field450.field962;
                var6.field407 = var6.field450.field963;
                var6.field402 = var6.field450.field959;
            }
            if ((var7 & 64) == 64) {
                var6.field429 = arg2.method233();
                int var10 = arg2.method236();
                var6.field433 = var10 >> 16;
                var6.field432 = (var10 & 65535) + field1288;
                var6.field430 = 0;
                var6.field431 = 0;
                if (var6.field432 > field1288) {
                    var6.field430 = -1;
                }
                if (var6.field429 == 65535) {
                    var6.field429 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field419 = arg2.method233();
                var6.field420 = arg2.method233();
            }
        }
        if (!arg0) {
            this.field1548 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method421(int arg0) {
        int var2 = this.field1233 * 128 + 64;
        int var3 = this.field1234 * 128 + 64;
        int var4 = this.method499(this.field1234, this.field1233, this.field1146, (byte) 67) - this.field1235;
        if (this.field1219 < var2) {
            this.field1219 += (var2 - this.field1219) * this.field1237 / 1000 + this.field1236;
            if (this.field1219 > var2) {
                this.field1219 = var2;
            }
        }
        if (this.field1219 > var2) {
            this.field1219 -= (this.field1219 - var2) * this.field1237 / 1000 + this.field1236;
            if (this.field1219 < var2) {
                this.field1219 = var2;
            }
        }
        if (this.field1220 < var4) {
            this.field1220 += (var4 - this.field1220) * this.field1237 / 1000 + this.field1236;
            if (this.field1220 > var4) {
                this.field1220 = var4;
            }
        }
        if (this.field1220 > var4) {
            this.field1220 -= (this.field1220 - var4) * this.field1237 / 1000 + this.field1236;
            if (this.field1220 < var4) {
                this.field1220 = var4;
            }
        }
        if (this.field1221 < var3) {
            this.field1221 += (var3 - this.field1221) * this.field1237 / 1000 + this.field1236;
            if (this.field1221 > var3) {
                this.field1221 = var3;
            }
        }
        if (this.field1221 > var3) {
            this.field1221 -= (this.field1221 - var3) * this.field1237 / 1000 + this.field1236;
            if (this.field1221 < var3) {
                this.field1221 = var3;
            }
        }
        int var5 = this.field1274 * 128 + 64;
        int var6 = this.field1275 * 128 + 64;
        int var7 = this.method499(this.field1275, this.field1274, this.field1146, (byte) 67) - this.field1276;
        int var8 = var5 - this.field1219;
        int var9 = var7 - this.field1220;
        int var10 = var6 - this.field1221;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        this.field1547 += arg0;
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1222 < var12) {
            this.field1222 += (var12 - this.field1222) * this.field1278 / 1000 + this.field1277;
            if (this.field1222 > var12) {
                this.field1222 = var12;
            }
        }
        if (this.field1222 > var12) {
            this.field1222 -= (this.field1222 - var12) * this.field1278 / 1000 + this.field1277;
            if (this.field1222 < var12) {
                this.field1222 = var12;
            }
        }
        int var14 = var13 - this.field1223;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1223 += this.field1278 * var14 / 1000 + this.field1277;
            this.field1223 &= 2047;
        }
        if (var14 < 0) {
            this.field1223 -= -var14 * this.field1278 / 1000 + this.field1277;
            this.field1223 &= 2047;
        }
        int var15 = var13 - this.field1223;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1223 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;I)Z")
    public final boolean method422(Component arg0, int arg1) {
        int var3 = arg0.field71;
        while (arg1 >= 0) {
            this.field1305 = -244;
        }
        if (var3 >= 1 && var3 <= 200) {
            if (var3 >= 101) {
                var3 -= 101;
            } else {
                --var3;
            }
            this.field1444[this.field1502] = "Remove @whi@" + this.field1143[var3];
            this.field1378[this.field1502] = 557;
            ++this.field1502;
            this.field1444[this.field1502] = "Message @whi@" + this.field1143[var3];
            this.field1378[this.field1502] = 679;
            ++this.field1502;
            return true;
        } else if (var3 >= 401 && var3 <= 500) {
            this.field1444[this.field1502] = "Remove @whi@" + arg0.field101;
            this.field1378[this.field1502] = 556;
            ++this.field1502;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBIIII)V")
    public final void method423(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1261.method204(arg3, arg4, 373);
        this.field1262.method204(arg3, arg4 + arg5 - 16, 373);
        Pix2D.method165(arg3, 16, this.field1533, arg5 - 32, (byte) 5, arg4 + 16);
        int var7 = (arg5 - 32) * arg5 / arg2;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - 32 - var7) * arg0 / (arg2 - arg5);
        Pix2D.method165(arg3, 16, this.field1157, var7, (byte) 5, arg4 + 16 + var8);
        Pix2D.method168(arg4 + 16 + var8, this.field1326, arg3, var7, true);
        Pix2D.method168(arg4 + 16 + var8, this.field1326, arg3 + 1, var7, true);
        Pix2D.method167(arg3, (byte) 9, this.field1326, 16, arg4 + 16 + var8);
        Pix2D.method167(arg3, (byte) 9, this.field1326, 16, arg4 + 17 + var8);
        Pix2D.method168(arg4 + 16 + var8, this.field1482, arg3 + 15, var7, true);
        Pix2D.method168(arg4 + 17 + var8, this.field1482, arg3 + 14, var7 - 1, true);
        if (arg1 != -34) {
            for (int var9 = 1; var9 > 0; ++var9) {
            }
        }
        Pix2D.method167(arg3, (byte) 9, this.field1482, 16, arg4 + 15 + var8 + var7);
        Pix2D.method167(arg3 + 1, (byte) 9, this.field1482, 15, arg4 + 14 + var8 + var7);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method424(int arg0, int arg1) {
        LinkList var3 = this.field1329[this.field1146][arg0][arg1];
        if (var3 == null) {
            this.field1529.method83(this.field1146, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method250(); var6 != null; var6 = (ObjStackEntity) var3.method252(7)) {
                ObjType var11 = ObjType.method335(var6.field487);
                int var12 = var11.field999;
                if (var11.field998) {
                    var12 = (var6.field488 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method248(var5, -253);
            ObjStackEntity var7 = null;
            ObjStackEntity var8 = null;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method250(); var9 != null; var9 = (ObjStackEntity) var3.method252(7)) {
                if (var5.field487 != var9.field487 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field487 != var9.field487 && var7.field487 != var9.field487 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field1529.method69(var10, var7, arg0, arg1, this.field1146, var8, this.method499(arg1 * 128 + 64, arg0 * 128 + 64, this.field1146, (byte) 67), (byte) 2, var5);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILbb;III)V")
    public final void method425(int arg0, PlayerEntity arg1, int arg2, int arg3, int arg4) {
        if (field1316 != arg1) {
            if (this.field1502 < 400) {
                String var6 = arg1.field453 + method439(field1316.field459, arg1.field459, this.field1287) + " (level-" + arg1.field459 + ")";
                if (this.field1201 == 1) {
                    this.field1444[this.field1502] = "Use " + this.field1205 + " with @whi@" + var6;
                    this.field1378[this.field1502] = 367;
                    this.field1379[this.field1502] = arg2;
                    this.field1376[this.field1502] = arg0;
                    this.field1377[this.field1502] = arg3;
                    ++this.field1502;
                } else if (this.field1174 == 1) {
                    if ((this.field1176 & 8) == 8) {
                        this.field1444[this.field1502] = this.field1177 + " @whi@" + var6;
                        this.field1378[this.field1502] = 651;
                        this.field1379[this.field1502] = arg2;
                        this.field1376[this.field1502] = arg0;
                        this.field1377[this.field1502] = arg3;
                        ++this.field1502;
                    }
                } else {
                    this.field1444[this.field1502] = "Follow @whi@" + var6;
                    this.field1378[this.field1502] = 1544;
                    this.field1379[this.field1502] = arg2;
                    this.field1376[this.field1502] = arg0;
                    this.field1377[this.field1502] = arg3;
                    ++this.field1502;
                    if (this.field1516 == 0) {
                        this.field1444[this.field1502] = "Trade with @whi@" + var6;
                        this.field1378[this.field1502] = 1373;
                        this.field1379[this.field1502] = arg2;
                        this.field1376[this.field1502] = arg0;
                        this.field1377[this.field1502] = arg3;
                        ++this.field1502;
                    }
                    if (this.field1229 > 0) {
                        this.field1444[this.field1502] = "Attack @whi@" + var6;
                        if (field1316.field459 >= arg1.field459) {
                            this.field1378[this.field1502] = 151;
                        } else {
                            this.field1378[this.field1502] = 2151;
                        }
                        this.field1379[this.field1502] = arg2;
                        this.field1376[this.field1502] = arg0;
                        this.field1377[this.field1502] = arg3;
                        ++this.field1502;
                    }
                    if (this.field1473 == 1) {
                        this.field1444[this.field1502] = "Fight @whi@" + var6;
                        this.field1378[this.field1502] = 151;
                        this.field1379[this.field1502] = arg2;
                        this.field1376[this.field1502] = arg0;
                        this.field1377[this.field1502] = arg3;
                        ++this.field1502;
                    }
                    if (this.field1473 == 2) {
                        this.field1444[this.field1502] = "Duel-with @whi@" + var6;
                        this.field1378[this.field1502] = 1101;
                        this.field1379[this.field1502] = arg2;
                        this.field1376[this.field1502] = arg0;
                        this.field1377[this.field1502] = arg3;
                        ++this.field1502;
                    }
                }
                for (int var7 = 0; var7 < this.field1502; ++var7) {
                    if (this.field1378[var7] == 660) {
                        this.field1444[var7] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                if (arg4 >= 0) {
                    this.field1329 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;II)V")
    private final void method426(Packet arg0, int arg1, int arg2) {
        if (arg1 != 10091) {
            this.field1548 = arg0.method231();
        }
        while (arg0.field695 + 21 < arg2 * 8) {
            int var4 = arg0.method242(13, false);
            if (var4 == 8191) {
                break;
            }
            if (this.field1230[var4] == null) {
                this.field1230[var4] = new NpcEntity();
            }
            NpcEntity var5 = this.field1230[var4];
            this.field1232[this.field1231++] = var4;
            var5.field441 = field1288;
            var5.field450 = NpcType.method329(arg0.method242(11, false));
            var5.field401 = var5.field450.field956;
            var5.field404 = var5.field450.field960;
            var5.field405 = var5.field450.field961;
            var5.field406 = var5.field450.field962;
            var5.field407 = var5.field450.field963;
            var5.field402 = var5.field450.field959;
            int var6 = arg0.method242(5, false);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg0.method242(5, false);
            if (var7 > 15) {
                var7 -= 32;
            }
            var5.method122(false, false, field1316.field446[0] + var7, field1316.field445[0] + var6);
            int var8 = arg0.method242(1, false);
            if (var8 == 1) {
                this.field1498[this.field1497++] = var4;
            }
        }
        arg0.method243(this.field1321);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILmb;Z)V")
    public final void method427(int arg0, Packet arg1, boolean arg2) {
        this.field1463 &= arg2;
        if (arg0 != 112 && arg0 != 31) {
            if (arg0 == 230) {
                int var4 = arg1.method231();
                int var5 = (var4 >> 4 & 7) + this.field1436;
                int var6 = (var4 & 7) + this.field1437;
                int var7 = arg1.method231();
                int var8 = var7 >> 2;
                int var9 = var7 & 3;
                int var10 = this.field1212[var8];
                int var11 = arg1.method233();
                if (var5 >= 0 && var6 >= 0 && var5 < 103 && var6 < 103) {
                    int var12 = this.field1524[this.field1146][var5][var6];
                    int var13 = this.field1524[this.field1146][var5 + 1][var6];
                    int var14 = this.field1524[this.field1146][var5 + 1][var6 + 1];
                    int var15 = this.field1524[this.field1146][var5][var6 + 1];
                    if (var10 == 0) {
                        Wall var16 = this.field1529.method84((byte) 119, var5, var6, this.field1146);
                        if (var16 != null) {
                            int var17 = var16.field274 >> 14 & 32767;
                            if (var8 == 2) {
                                var16.field272 = new LocEntity(var12, var9 + 4, 214, var13, var17, var14, var11, false, 2, var15);
                                var16.field273 = new LocEntity(var12, var9 + 1 & 3, 214, var13, var17, var14, var11, false, 2, var15);
                            } else {
                                var16.field272 = new LocEntity(var12, var9, 214, var13, var17, var14, var11, false, var8, var15);
                            }
                        }
                    }
                    if (var10 == 1) {
                        Decor var18 = this.field1529.method85(var5, var6, this.field1146, this.field1305);
                        if (var18 != null) {
                            var18.field165 = new LocEntity(var12, 0, 214, var13, var18.field166 >> 14 & 32767, var14, var11, false, 4, var15);
                        }
                    }
                    if (var10 == 2) {
                        Location var19 = this.field1529.method86(var5, 501, this.field1146, var6);
                        if (var8 == 11) {
                            var8 = 10;
                        }
                        if (var19 != null) {
                            var19.field257 = new LocEntity(var12, var9, 214, var13, var19.field265 >> 14 & 32767, var14, var11, false, var8, var15);
                        }
                    }
                    if (var10 == 3) {
                        GroundDecor var20 = this.field1529.method87(var5, this.field1146, var6, this.field1197);
                        if (var20 != null) {
                            var20.field196 = new LocEntity(var12, var9, 214, var13, var20.field197 >> 14 & 32767, var14, var11, false, 22, var15);
                        }
                    }
                }
            } else if (arg0 == 167) {
                int var21 = arg1.method231();
                int var22 = (var21 >> 4 & 7) + this.field1436;
                int var23 = (var21 & 7) + this.field1437;
                int var24 = arg1.method233();
                int var25 = arg1.method233();
                if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                    ObjStackEntity var26 = new ObjStackEntity();
                    var26.field487 = var24;
                    var26.field488 = var25;
                    if (this.field1329[this.field1146][var22][var23] == null) {
                        this.field1329[this.field1146][var22][var23] = new LinkList(-740);
                    }
                    this.field1329[this.field1146][var22][var23].method247(var26);
                    this.method424(var22, var23);
                }
            } else if (arg0 == 247) {
                int var27 = arg1.method231();
                int var28 = (var27 >> 4 & 7) + this.field1436;
                int var29 = (var27 & 7) + this.field1437;
                int var30 = arg1.method233();
                if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                    LinkList var31 = this.field1329[this.field1146][var28][var29];
                    if (var31 != null) {
                        for (ObjStackEntity var32 = (ObjStackEntity) var31.method250(); var32 != null; var32 = (ObjStackEntity) var31.method252(7)) {
                            if ((var30 & 32767) == var32.field487) {
                                var32.method118();
                                break;
                            }
                        }
                        if (var31.method250() == null) {
                            this.field1329[this.field1146][var28][var29] = null;
                        }
                        this.method424(var28, var29);
                    }
                }
            } else if (arg0 == 67) {
                int var33 = arg1.method231();
                int var34 = (var33 >> 4 & 7) + this.field1436;
                int var35 = (var33 & 7) + this.field1437;
                int var36 = var34 + arg1.method232();
                int var37 = var35 + arg1.method232();
                int var38 = arg1.method234();
                int var39 = arg1.method233();
                int var40 = arg1.method231();
                int var41 = arg1.method231();
                int var42 = arg1.method233();
                int var43 = arg1.method233();
                int var44 = arg1.method231();
                int var45 = arg1.method231();
                if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                    int var46 = var34 * 128 + 64;
                    int var47 = var35 * 128 + 64;
                    int var48 = var36 * 128 + 64;
                    int var49 = var37 * 128 + 64;
                    ProjectileEntity var50 = new ProjectileEntity(var38, var45, field1288 + var42, 9, var44, var47, var46, field1288 + var43, this.field1146, var39, this.method499(var47, var46, this.field1146, (byte) 67) - var40, var41);
                    var50.method129(172, var48, field1288 + var42, this.method499(var49, var48, this.field1146, (byte) 67) - var41, var49);
                    this.field1249.method247(var50);
                }
            } else if (arg0 == 215) {
                int var51 = arg1.method231();
                int var52 = (var51 >> 4 & 7) + this.field1436;
                int var53 = (var51 & 7) + this.field1437;
                int var54 = arg1.method233();
                int var55 = arg1.method231();
                int var56 = arg1.method233();
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                    int var57 = var52 * 128 + 64;
                    int var58 = var53 * 128 + 64;
                    SpotAnimEntity var59 = new SpotAnimEntity(var54, var56, this.method499(var58, var57, this.field1146, (byte) 67) - var55, var58, field1288, var57, -533, this.field1146);
                    this.field1522.method247(var59);
                }
            } else if (arg0 == 131) {
                int var60 = arg1.method231();
                int var61 = (var60 >> 4 & 7) + this.field1436;
                int var62 = (var60 & 7) + this.field1437;
                int var63 = arg1.method233();
                int var64 = arg1.method233();
                int var65 = arg1.method233();
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104 && this.field1521 != var65) {
                    ObjStackEntity var66 = new ObjStackEntity();
                    var66.field487 = var63;
                    var66.field488 = var64;
                    if (this.field1329[this.field1146][var61][var62] == null) {
                        this.field1329[this.field1146][var61][var62] = new LinkList(-740);
                    }
                    this.field1329[this.field1146][var61][var62].method247(var66);
                    this.method424(var61, var62);
                }
            } else {
                if (arg0 == 248) {
                    int var67 = arg1.method231();
                    int var68 = (var67 >> 4 & 7) + this.field1436;
                    int var69 = (var67 & 7) + this.field1437;
                    int var70 = arg1.method231();
                    int var71 = var70 >> 2;
                    int var72 = var70 & 3;
                    int var73 = this.field1212[var71];
                    int var74 = arg1.method233();
                    int var75 = arg1.method233();
                    int var76 = arg1.method233();
                    int var77 = arg1.method233();
                    byte var78 = arg1.method232();
                    byte var79 = arg1.method232();
                    byte var80 = arg1.method232();
                    byte var81 = arg1.method232();
                    PlayerEntity var82;
                    if (this.field1521 == var77) {
                        var82 = field1316;
                    } else {
                        var82 = this.field1494[var77];
                    }
                    if (var82 != null) {
                        LocType var83 = LocType.method320(var74);
                        int var84 = this.field1524[this.field1146][var68][var69];
                        int var85 = this.field1524[this.field1146][var68 + 1][var69];
                        int var86 = this.field1524[this.field1146][var68 + 1][var69 + 1];
                        int var87 = this.field1524[this.field1146][var68][var69 + 1];
                        Model var88 = var83.method326(var71, var72, var84, var85, var86, var87, -1);
                        if (var88 != null) {
                            this.method480(var69, this.field1146, var76 + 1, 0, var75 + 1, 0, -1, -491, var73, var68);
                            var82.field462 = field1288 + var75;
                            var82.field463 = field1288 + var76;
                            var82.field467 = var88;
                            int var89 = var83.field920;
                            int var90 = var83.field921;
                            if (var72 == 1 || var72 == 3) {
                                var89 = var83.field921;
                                var90 = var83.field920;
                            }
                            var82.field464 = var68 * 128 + var89 * 64;
                            var82.field466 = var69 * 128 + var90 * 64;
                            var82.field465 = this.method499(var82.field466, var82.field464, this.field1146, (byte) 67);
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
                            var82.field468 = var68 + var78;
                            var82.field470 = var68 + var80;
                            var82.field469 = var69 + var79;
                            var82.field471 = var69 + var81;
                        }
                    }
                }
                if (arg0 == 246) {
                    int var93 = arg1.method231();
                    int var94 = (var93 >> 4 & 7) + this.field1436;
                    int var95 = (var93 & 7) + this.field1437;
                    int var96 = arg1.method233();
                    int var97 = arg1.method233();
                    int var98 = arg1.method233();
                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                        LinkList var99 = this.field1329[this.field1146][var94][var95];
                        if (var99 != null) {
                            for (ObjStackEntity var100 = (ObjStackEntity) var99.method250(); var100 != null; var100 = (ObjStackEntity) var99.method252(7)) {
                                if ((var96 & 32767) == var100.field487 && var100.field488 == var97) {
                                    var100.field488 = var98;
                                    break;
                                }
                            }
                            this.method424(var94, var95);
                        }
                    }
                }
            }
        } else {
            int var101 = arg1.method231();
            int var102 = (var101 >> 4 & 7) + this.field1436;
            int var103 = (var101 & 7) + this.field1437;
            int var104 = arg1.method231();
            int var105 = var104 >> 2;
            int var106 = var104 & 3;
            int var107 = this.field1212[var105];
            int var108;
            if (arg0 == 31) {
                var108 = -1;
            } else {
                var108 = arg1.method233();
            }
            if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                this.method480(var103, this.field1146, -1, var105, 0, var106, var108, -491, var107, var102);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method428(boolean arg0) {
        short var2 = 256;
        if (this.field1440 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1440 > 768) {
                    this.field1555[var3] = this.method513(1024 - this.field1440, field1260, this.field1556[var3], this.field1557[var3]);
                } else if (this.field1440 > 256) {
                    this.field1555[var3] = this.field1557[var3];
                } else {
                    this.field1555[var3] = this.method513(256 - this.field1440, field1260, this.field1557[var3], this.field1556[var3]);
                }
            }
        } else if (this.field1441 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1441 > 768) {
                    this.field1555[var4] = this.method513(1024 - this.field1441, field1260, this.field1556[var4], this.field1558[var4]);
                } else if (this.field1441 > 256) {
                    this.field1555[var4] = this.field1558[var4];
                } else {
                    this.field1555[var4] = this.method513(256 - this.field1441, field1260, this.field1558[var4], this.field1556[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1555[var5] = this.field1556[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1359.field731[var6] = this.field1464.field651[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1228[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1310[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1555[var26];
                    int var30 = this.field1359.field731[var8];
                    this.field1359.field731[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        if (!arg0) {
            this.field1359.method261(0, -49767, super.field12, 0);
            for (int var10 = 0; var10 < 33920; ++var10) {
                this.field1360.field731[var10] = this.field1465.field651[var10];
            }
            int var11 = 0;
            int var12 = 1176;
            for (int var13 = 1; var13 < var2 - 1; ++var13) {
                int var14 = (var2 - var13) * this.field1228[var13] / var2;
                int var15 = 103 - var14;
                int var16 = var12 + var14;
                for (int var17 = 0; var17 < var15; ++var17) {
                    int var18 = this.field1310[var11++];
                    if (var18 != 0) {
                        int var20 = 256 - var18;
                        int var21 = this.field1555[var18];
                        int var22 = this.field1360.field731[var16];
                        this.field1360.field731[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                    } else {
                        ++var16;
                    }
                }
                var11 += 128 - var15;
                var12 = 128 - var15 - var14 + var16;
            }
            this.field1360.method261(661, -49767, super.field12, 0);
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

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method429(int arg0, int arg1) {
        if (arg0 < 3 || arg0 > 3) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (!field1140) {
            if (Pix3D.field642[17] >= arg1) {
                Pix8 var4 = Pix3D.field636[17];
                int var5 = var4.field663 * var4.field662 - 1;
                int var6 = this.field1338 * var4.field662 * 2;
                byte[] var7 = var4.field660;
                byte[] var8 = this.field1416;
                for (int var9 = 0; var9 <= var5; ++var9) {
                    var8[var9] = var7[var9 - var6 & var5];
                }
                var4.field660 = var8;
                this.field1416 = var7;
                Pix3D.method176(-676, 17);
            }
            if (Pix3D.field642[24] >= arg1) {
                Pix8 var10 = Pix3D.field636[24];
                int var11 = var10.field663 * var10.field662 - 1;
                int var12 = this.field1338 * var10.field662 * 2;
                byte[] var13 = var10.field660;
                byte[] var14 = this.field1416;
                for (int var15 = 0; var15 <= var11; ++var15) {
                    var14[var15] = var13[var15 - var12 & var11];
                }
                var10.field660 = var14;
                this.field1416 = var13;
                Pix3D.method176(-676, 24);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method430(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1401 = "";
                this.field1402 = "Connecting to server...";
                this.method466(false);
            }
            this.field1263 = new ClientStream(this.method436(field1138 + 43594), this, 0);
            this.field1263.method40(this.field1426.field693, 0, 8);
            this.field1426.field694 = 0;
            this.field1133 = this.field1426.method237(-960);
            int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1133 >> 32), (int) this.field1133 };
            this.field1491.field694 = 0;
            this.field1491.method221(10);
            this.field1491.method225(var4[0]);
            this.field1491.method225(var4[1]);
            this.field1491.method225(var4[2]);
            this.field1491.method225(var4[3]);
            this.field1491.method225(signlink.uid);
            this.field1491.method228(arg0);
            this.field1491.method228(arg1);
            this.field1491.method246(field1258, field1273, false);
            this.field1405.field694 = 0;
            if (arg2) {
                this.field1405.method221(18);
            } else {
                this.field1405.method221(16);
            }
            this.field1405.method221(this.field1491.field694 + 36 + 1 + 1);
            this.field1405.method221(234);
            this.field1405.method221(field1140 ? 1 : 0);
            for (int var5 = 0; var5 < 9; ++var5) {
                this.field1405.method225(this.field1525[var5]);
            }
            this.field1405.method229(this.field1491.field693, this.field1491.field694, 0, false);
            this.field1491.field698 = new Isaac(946, var4);
            for (int var6 = 0; var6 < 4; ++var6) {
                var4[var6] += 50;
            }
            this.field1520 = new Isaac(946, var4);
            this.field1263.method41(this.field1250, this.field1405.field694, this.field1405.field693, 0);
            int var7 = this.field1263.method38();
            if (var7 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var15) {
                }
                this.method430(arg0, arg1, arg2);
                return;
            }
            if (var7 == 2 || var7 == 18) {
                if (var7 == 18) {
                    this.field1450 = true;
                } else {
                    this.field1450 = false;
                }
                InputTracking.method44(49423);
                this.field1463 = true;
                this.field1491.field694 = 0;
                this.field1426.field694 = 0;
                this.field1548 = -1;
                this.field1445 = -1;
                this.field1446 = -1;
                this.field1447 = -1;
                this.field1547 = 0;
                this.field1549 = 0;
                this.field1286 = 0;
                this.field1551 = 0;
                this.field1419 = 0;
                this.field1502 = 0;
                this.field1435 = false;
                super.field17 = 0;
                for (int var8 = 0; var8 < 100; ++var8) {
                    this.field1136[var8] = null;
                }
                this.field1201 = 0;
                this.field1174 = 0;
                this.field1196 = 0;
                this.field1173 = 0;
                this.field1192 = (int) (Math.random() * 100.0D) - 50;
                this.field1294 = (int) (Math.random() * 110.0D) - 55;
                this.field1180 = (int) (Math.random() * 80.0D) - 40;
                this.field1199 = (int) (Math.random() * 120.0D) - 60;
                this.field1346 = (int) (Math.random() * 30.0D) - 20;
                this.field1543 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1170 = -1;
                this.field1371 = 0;
                this.field1372 = 0;
                this.field1495 = 0;
                this.field1231 = 0;
                for (int var9 = 0; var9 < this.field1492; ++var9) {
                    this.field1494[var9] = null;
                    this.field1499[var9] = null;
                }
                for (int var10 = 0; var10 < 8192; ++var10) {
                    this.field1230[var10] = null;
                }
                field1316 = this.field1494[this.field1493] = new PlayerEntity();
                this.field1249.method254();
                this.field1522.method254();
                for (int var11 = 0; var11 < 4; ++var11) {
                    for (int var12 = 0; var12 < 104; ++var12) {
                        for (int var13 = 0; var13 < 104; ++var13) {
                            this.field1329[var11][var12][var13] = null;
                        }
                    }
                }
                this.field1163 = new LinkList(-740);
                this.field1251 = 0;
                this.field1530 = -1;
                this.field1501 = -1;
                this.field1561 = -1;
                this.field1390 = -1;
                this.field1185 = false;
                this.field1540 = 3;
                this.field1484 = false;
                this.field1435 = false;
                this.field1348 = false;
                this.field1418 = null;
                this.field1486 = 0;
                this.field1415 = -1;
                this.field1554 = true;
                this.method455((byte) 7);
                for (int var14 = 0; var14 < 5; ++var14) {
                    this.field1485[var14] = 0;
                }
                field1537 = 0;
                field1179 = 0;
                field1404 = 0;
                field1459 = 0;
                field1149 = 0;
                field1455 = 0;
                field1168 = 0;
                field1131 = 0;
                field1477 = 0;
                field1476 = 0;
                this.method538(-279);
                return;
            }
            if (var7 == 3) {
                this.field1401 = "";
                this.field1402 = "Invalid username or password.";
                return;
            }
            if (var7 == 4) {
                this.field1401 = "Your account has been disabled.";
                this.field1402 = "Please check your message-centre for details.";
                return;
            }
            if (var7 == 5) {
                this.field1401 = "Your account is already logged in.";
                this.field1402 = "Try again in 60 secs...";
                return;
            }
            if (var7 == 6) {
                this.field1401 = "RuneScape has been updated!";
                this.field1402 = "Please reload this page.";
                return;
            }
            if (var7 == 7) {
                this.field1401 = "This world is full.";
                this.field1402 = "Please use a different world.";
                return;
            }
            if (var7 == 8) {
                this.field1401 = "Unable to connect.";
                this.field1402 = "Login server offline.";
                return;
            }
            if (var7 == 9) {
                this.field1401 = "Login limit exceeded.";
                this.field1402 = "Too many connections from your address.";
                return;
            }
            if (var7 == 10) {
                this.field1401 = "Unable to connect.";
                this.field1402 = "Bad session id.";
                return;
            }
            if (var7 == 11) {
                this.field1402 = "Login server rejected session.";
                this.field1402 = "Please try again.";
                return;
            }
            if (var7 == 12) {
                this.field1401 = "You need a members account to login to this world.";
                this.field1402 = "Please subscribe, or use a different world.";
                return;
            }
            if (var7 == 13) {
                this.field1401 = "Could not complete login.";
                this.field1402 = "Please try using a different world.";
                return;
            }
            if (var7 == 14) {
                this.field1401 = "The server is being updated.";
                this.field1402 = "Please wait 1 minute and try again.";
                return;
            }
            if (var7 == 15) {
                this.field1463 = true;
                this.field1491.field694 = 0;
                this.field1426.field694 = 0;
                this.field1548 = -1;
                this.field1445 = -1;
                this.field1446 = -1;
                this.field1447 = -1;
                this.field1547 = 0;
                this.field1549 = 0;
                this.field1286 = 0;
                this.field1502 = 0;
                this.field1435 = false;
                return;
            }
            if (var7 == 16) {
                this.field1401 = "Login attempts exceeded.";
                this.field1402 = "Please wait 1 minute and try again.";
                return;
            }
            if (var7 == 17) {
                this.field1401 = "You are standing in a members-only area.";
                this.field1402 = "To play on this world move to a free area first";
                return;
            }
        } catch (IOException var16) {
            this.field1401 = "";
            this.field1402 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILob;)V")
    private final void method431(int arg0, LocSpawned arg1) {
        if (arg0 < 3 || arg0 > 3) {
            this.field1553 = this.field1520.method291();
        }
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1.field712 == 0) {
            var3 = this.field1529.method88(arg1.field711, arg1.field713, arg1.field714);
        }
        if (arg1.field712 == 1) {
            var3 = this.field1529.method89(arg1.field711, arg1.field714, arg1.field713, 5);
        }
        if (arg1.field712 == 2) {
            var3 = this.field1529.method90(arg1.field711, arg1.field713, arg1.field714);
        }
        if (arg1.field712 == 3) {
            var3 = this.field1529.method91(arg1.field711, arg1.field713, arg1.field714);
        }
        if (var3 != 0) {
            int var7 = this.field1529.method92(arg1.field711, arg1.field713, arg1.field714, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg1.field715 = var4;
        arg1.field717 = var5;
        arg1.field716 = var6;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIB)Z")
    public final boolean method432(int arg0, int arg1, byte arg2) {
        boolean var4 = false;
        Component var5 = Component.field62[arg1];
        for (int var6 = 0; var6 < var5.field83.length && var5.field83[var6] != -1; ++var6) {
            Component var7 = Component.field62[var5.field83[var6]];
            if (var7.field69 == 1) {
                var4 |= this.method432(arg0, var7.field67, (byte) -124);
            }
            if (var7.field69 == 6 && (var7.field112 != -1 || var7.field113 != -1)) {
                boolean var8 = this.method498(true, var7);
                int var9;
                if (var8) {
                    var9 = var7.field113;
                } else {
                    var9 = var7.field112;
                }
                if (var9 != -1) {
                    SeqType var10 = SeqType.field1069[var9];
                    var7.field66 += arg0;
                    while (var7.field66 > var10.method369(7, var7.field65)) {
                        var7.field66 -= var10.method369(7, var7.field65) + 1;
                        ++var7.field65;
                        if (var7.field65 >= var10.field1070) {
                            var7.field65 -= var10.field1074;
                            if (var7.field65 < 0 || var7.field65 >= var10.field1070) {
                                var7.field65 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        if (arg2 != -124) {
            throw new NullPointerException();
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method433(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field1461 >= 100) {
                this.method458("Your ignore list is full. Max of 100 hit", 0, "", true);
            } else {
                String var4 = JString.method300(JString.method297(9, arg0), 1);
                for (int var5 = 0; var5 < this.field1461; ++var5) {
                    if (this.field1171[var5] == arg0) {
                        this.method458(var4 + " is already on your ignore list", 0, "", true);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1251; ++var6) {
                    if (this.field1345[var6] == arg0) {
                        this.method458("Please remove " + var4 + " from your friend list first", 0, "", true);
                        return;
                    }
                }
                this.field1171[this.field1461++] = arg0;
                this.field1527 = true;
                this.field1491.method220(this.field1553, 84);
                if (arg1 >= 0) {
                    field1160 = 409;
                }
                this.field1491.method227(arg0, true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method434(byte arg0) {
        if (arg0 != 5) {
            field1453 = 472;
        }
        if (this.field1252 == 0) {
            int var2 = super.field10 / 2 - 80;
            int var3 = super.field11 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field21 == 1 && super.field22 >= var2 - 75 && super.field22 <= var2 + 75 && super.field23 >= var14 - 20 && super.field23 <= var14 + 20) {
                this.field1252 = 3;
                this.field1265 = 0;
            }
            int var4 = super.field10 / 2 + 80;
            if (super.field21 == 1 && super.field22 >= var4 - 75 && super.field22 <= var4 + 75 && super.field23 >= var14 - 20 && super.field23 <= var14 + 20) {
                this.field1401 = "";
                this.field1402 = "Enter your username & password.";
                this.field1252 = 2;
                this.field1265 = 0;
            }
        } else if (this.field1252 == 2) {
            int var5 = super.field11 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field21 == 1 && super.field23 >= var16 - 15 && super.field23 < var16) {
                this.field1265 = 0;
            }
            var5 = var16 + 15;
            if (super.field21 == 1 && super.field23 >= var5 - 15 && super.field23 < var5) {
                this.field1265 = 1;
            }
            var5 += 15;
            int var6 = super.field10 / 2 - 80;
            int var7 = super.field11 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field21 == 1 && super.field22 >= var6 - 75 && super.field22 <= var6 + 75 && super.field23 >= var17 - 20 && super.field23 <= var17 + 20) {
                this.method430(this.field1451, this.field1452, false);
            }
            int var8 = super.field10 / 2 + 80;
            if (super.field21 == 1 && super.field22 >= var8 - 75 && super.field22 <= var8 + 75 && super.field23 >= var17 - 20 && super.field23 <= var17 + 20) {
                this.field1252 = 0;
                this.field1451 = "";
                this.field1452 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5((byte) 5);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1500.length(); ++var11) {
                        if (var9 == field1500.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1265 == 0) {
                        if (var9 == 8 && this.field1451.length() > 0) {
                            this.field1451 = this.field1451.substring(0, this.field1451.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1265 = 1;
                        }
                        if (var10) {
                            this.field1451 = this.field1451 + (char) var9;
                        }
                        if (this.field1451.length() > 12) {
                            this.field1451 = this.field1451.substring(0, 12);
                        }
                    } else if (this.field1265 == 1) {
                        if (var9 == 8 && this.field1452.length() > 0) {
                            this.field1452 = this.field1452.substring(0, this.field1452.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1265 = 0;
                        }
                        if (var10) {
                            this.field1452 = this.field1452 + (char) var9;
                        }
                        if (this.field1452.length() > 20) {
                            this.field1452 = this.field1452.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1252 == 3) {
                int var12 = super.field10 / 2;
                int var13 = super.field11 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field21 == 1 && super.field22 >= var12 - 75 && super.field22 <= var12 + 75 && super.field23 >= var18 - 20 && super.field23 <= var18 + 20) {
                    this.field1252 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILkb;)V")
    public final void method435(int arg0, Pix8 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1150.length; ++var4) {
            this.field1150[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1150[var17] = (int) (Math.random() * 256.0D);
        }
        if (arg0 <= 0) {
            this.field1425 = !this.field1425;
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field1151[var16] = (this.field1150[var16 - 1] + this.field1150[var16 + 1] + this.field1150[var16 - 128] + this.field1150[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field1150;
            this.field1150 = this.field1151;
            this.field1151 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field663; ++var8) {
                for (int var9 = 0; var9 < arg1.field662; ++var9) {
                    if (arg1.field660[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field664;
                        int var11 = var8 + 16 + arg1.field665;
                        int var12 = (var11 << 7) + var10;
                        this.field1150[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method436(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method437(boolean arg0) {
        if (!arg0) {
            for (int var2 = 0; var2 < this.field1231; ++var2) {
                NpcEntity var3 = this.field1230[this.field1232[var2]];
                int var4 = (this.field1232[var2] << 14) + 536870912;
                if (var3 != null && var3.method124(0)) {
                    int var5 = var3.field397 >> 7;
                    int var6 = var3.field398 >> 7;
                    if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                        if (var3.field401 == 1 && (var3.field397 & 127) == 64 && (var3.field398 & 127) == 64) {
                            if (this.field1164[var5][var6] == this.field1341) {
                                continue;
                            }
                            this.field1164[var5][var6] = this.field1341;
                        }
                        this.field1529.method73(var3.field397, var3.field399, (byte) 6, var4, this.field1146, var3.field398, var3.field400, var3, (var3.field401 - 1) * 64 + 60, this.method499(var3.field398, var3.field397, this.field1146, (byte) 67));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method438(byte arg0) {
        for (int var2 = -1; var2 < this.field1495; ++var2) {
            int var7;
            if (var2 == -1) {
                var7 = this.field1493;
            } else {
                var7 = this.field1496[var2];
            }
            PlayerEntity var8 = this.field1494[var7];
            if (var8 != null && var8.field410 > 0) {
                --var8.field410;
                if (var8.field410 == 0) {
                    var8.field409 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field1231; ++var3) {
            int var5 = this.field1232[var3];
            NpcEntity var6 = this.field1230[var5];
            if (var6 != null && var6.field410 > 0) {
                --var6.field410;
                if (var6.field410 == 0) {
                    var6.field409 = null;
                }
            }
        }
        if (arg0 == 1) {
            boolean var4 = false;
        } else {
            this.field1425 = !this.field1425;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Ljava/lang/String;")
    public static final String method439(int arg0, int arg1, int arg2) {
        int var3 = 54 / arg2;
        int var4 = arg0 - arg1;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBIII)V")
    public final void method440(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field1529.method88(arg3, arg1, arg5);
        if (var7 != 0) {
            int var8 = this.field1529.method92(arg3, arg1, arg5, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg0;
            if (var7 > 0) {
                var11 = arg4;
            }
            int[] var12 = this.field1373.field651;
            int var13 = (103 - arg5) * 512 * 4 + arg1 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method320(var14);
            if (var15.field935 != -1) {
                Pix8 var16 = this.field1165[var15.field935];
                if (var16 != null) {
                    int var17 = (var15.field920 * 4 - var16.field662) / 2;
                    int var18 = (var15.field921 * 4 - var16.field663) / 2;
                    var16.method204(arg1 * 4 + 48 + var17, (104 - arg5 - var15.field921) * 4 + 48 + var18, 373);
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
        int var19 = this.field1529.method90(arg3, arg1, arg5);
        if (var19 != 0) {
            int var20 = this.field1529.method92(arg3, arg1, arg5, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            LocType var24 = LocType.method320(var23);
            if (var24.field935 != -1) {
                Pix8 var25 = this.field1165[var24.field935];
                if (var25 != null) {
                    int var26 = (var24.field920 * 4 - var25.field662) / 2;
                    int var27 = (var24.field921 * 4 - var25.field663) / 2;
                    var25.method204(arg1 * 4 + 48 + var26, (104 - arg5 - var24.field921) * 4 + 48 + var27, 373);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field1373.field651;
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
        int var31 = this.field1529.method91(arg3, arg1, arg5);
        if (arg2 != 72) {
            this.field1329 = null;
        }
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            LocType var33 = LocType.method320(var32);
            if (var33.field935 != -1) {
                Pix8 var34 = this.field1165[var33.field935];
                if (var34 != null) {
                    int var35 = (var33.field920 * 4 - var34.field662) / 2;
                    int var36 = (var33.field921 * 4 - var34.field663) / 2;
                    var34.method204(arg1 * 4 + 48 + var35, (104 - arg5 - var33.field921) * 4 + 48 + var36, 373);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method441(byte arg0) {
        if (this.field1551 > 0) {
            this.method418(2);
        } else {
            this.field1431.method260((byte) 0);
            this.field1318.method206("Connection lost", 257, 144, 39475, 0);
            this.field1318.method206("Connection lost", 256, 143, 39475, 16777215);
            this.field1318.method206("Please wait - attempting to reestablish", 257, 159, 39475, 0);
            this.field1318.method206("Please wait - attempting to reestablish", 256, 158, 39475, 16777215);
            this.field1431.method261(8, -49767, super.field12, 11);
            if (arg0 != 66) {
                this.method6();
            }
            this.field1371 = 0;
            ClientStream var2 = this.field1263;
            this.field1463 = false;
            this.method430(this.field1451, this.field1452, true);
            if (!this.field1463) {
                this.method418(2);
            }
            try {
                var2.method37();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)V")
    public final void method442(int arg0, int arg1, int arg2) {
        if (arg1 != 5) {
            this.field1491.method221(47);
        }
        if (this.field1290 != 0) {
            int var4 = 0;
            if (this.field1286 != 0) {
                var4 = 1;
            }
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field1136[var5] != null) {
                    int var6 = this.field1134[var5];
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field1443 == 0 || this.field1443 == 1 && this.method454(true, this.field1135[var5]))) {
                        int var7 = 329 - var4 * 13;
                        if (super.field19 > 8 && super.field19 < 520 && arg0 - 11 > var7 - 10 && arg0 - 11 <= var7 + 3) {
                            if (this.field1450) {
                                this.field1444[this.field1502] = "Report abuse @whi@" + this.field1135[var5];
                                this.field1378[this.field1502] = 2034;
                                ++this.field1502;
                            }
                            this.field1444[this.field1502] = "Add ignore @whi@" + this.field1135[var5];
                            this.field1378[this.field1502] = 2436;
                            ++this.field1502;
                            this.field1444[this.field1502] = "Add friend @whi@" + this.field1135[var5];
                            this.field1378[this.field1502] = 2406;
                            ++this.field1502;
                        }
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                    if ((var6 == 5 || var6 == 6) && this.field1443 < 2) {
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method443(int arg0, int arg1) {
        Component var3 = Component.field62[arg0];
        for (int var4 = 0; var4 < var3.field83.length && var3.field83[var4] != -1; ++var4) {
            Component var5 = Component.field62[var3.field83[var4]];
            if (var5.field69 == 1) {
                this.method443(var5.field67, 47034);
            }
            var5.field65 = 0;
            var5.field66 = 0;
        }
        if (arg1 != 47034) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method444(int arg0) {
        if (arg0 != 7) {
            this.field1553 = -221;
        }
        if (field1140 && this.field1196 == 2 && World.field37 != this.field1146) {
            this.field1431.method260((byte) 0);
            this.field1318.method206("Loading - please wait.", 257, 151, 39475, 0);
            this.field1318.method206("Loading - please wait.", 256, 150, 39475, 16777215);
            this.field1431.method261(8, -49767, super.field12, 11);
            this.field1196 = 1;
        }
        if (this.field1196 == 1) {
            for (int var2 = 0; var2 < this.field1523.length; ++var2) {
                if (this.field1523[var2] == null && this.field1504[var2] != -1) {
                    return;
                }
                if (this.field1396[var2] == null && this.field1505[var2] != -1) {
                    return;
                }
            }
            boolean var3 = true;
            for (int var4 = 0; var4 < this.field1523.length; ++var4) {
                byte[] var5 = this.field1396[var4];
                if (var5 != null) {
                    int var6 = (this.field1503[var4] >> 8) * 64 - this.field1487;
                    int var7 = (this.field1503[var4] & 255) * 64 - this.field1488;
                    var3 &= World.method16(7, var5, var6, var7);
                }
            }
            if (!var3) {
                return;
            }
            this.field1196 = 2;
            World.field37 = this.field1146;
            this.method470(-209);
        }
        if (this.field1196 == 2 && this.field1170 != this.field1146) {
            this.field1170 = this.field1146;
            this.method534(this.field1146, true);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;IBI)V")
    public final void method445(int arg0, Component arg1, int arg2, byte arg3, int arg4) {
        if (arg1.field69 == 0 && arg1.field83 != null) {
            if (!arg1.field82 || this.field1158 == arg1.field67 || this.field1195 == arg1.field67 || this.field1194 == arg1.field67) {
                int var6 = Pix2D.field613;
                int var7 = Pix2D.field611;
                int var8 = Pix2D.field614;
                int var9 = Pix2D.field612;
                Pix2D.method163(false, arg2, arg4, arg1.field73 + arg4, arg1.field72 + arg2);
                if (this.field1145 == arg3) {
                    boolean var10 = false;
                } else {
                    this.field1548 = this.field1426.method231();
                }
                int var11 = arg1.field83.length;
                for (int var12 = 0; var12 < var11; ++var12) {
                    int var13 = arg1.field84[var12] + arg2;
                    int var14 = arg1.field85[var12] + arg4 - arg0;
                    Component var15 = Component.field62[arg1.field83[var12]];
                    int var16 = var15.field74 + var13;
                    int var17 = var15.field75 + var14;
                    if (var15.field71 > 0) {
                        this.method531(var15, true);
                    }
                    if (var15.field69 == 0) {
                        if (var15.field81 > var15.field80 - var15.field73) {
                            var15.field81 = var15.field80 - var15.field73;
                        }
                        if (var15.field81 < 0) {
                            var15.field81 = 0;
                        }
                        this.method445(var15.field81, var15, var16, (byte) 0, var17);
                        if (var15.field80 > var15.field73) {
                            this.method423(var15.field81, (byte) -34, var15.field80, var15.field72 + var16, var17, var15.field73);
                        }
                    } else if (var15.field69 != 1) {
                        if (var15.field69 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var15.field73; ++var19) {
                                for (int var20 = 0; var20 < var15.field72; ++var20) {
                                    int var21 = (var15.field91 + 32) * var20 + var16;
                                    int var22 = (var15.field92 + 32) * var19 + var17;
                                    if (var18 < 20) {
                                        var21 += var15.field94[var18];
                                        var22 += var15.field95[var18];
                                    }
                                    if (var15.field63[var18] <= 0) {
                                        if (var15.field93 != null && var18 < 20) {
                                            Pix32 var28 = var15.field93[var18];
                                            if (var28 != null) {
                                                var28.method190(var21, var22, 373);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field63[var18] - 1;
                                        if (var21 > Pix2D.field613 - 32 && var21 < Pix2D.field614 && var22 > Pix2D.field611 - 32 && var22 < Pix2D.field612 || this.field1298 != 0 && this.field1297 == var18) {
                                            Pix32 var26 = ObjType.method341(var15.field64[var18], -539, var25);
                                            if (var26 != null) {
                                                if (this.field1298 != 0 && this.field1297 == var18 && this.field1296 == var15.field67) {
                                                    var23 = super.field19 - this.field1299;
                                                    var24 = super.field20 - this.field1300;
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 5 && var24 > -5) {
                                                        var24 = 0;
                                                    }
                                                    if (this.field1339 < 5) {
                                                        var23 = 0;
                                                        var24 = 0;
                                                    }
                                                    var26.method194(128, var21 + var23, var22 + var24, 1);
                                                } else if (this.field1513 != 0 && this.field1512 == var18 && this.field1511 == var15.field67) {
                                                    var26.method194(128, var21, var22, 1);
                                                } else {
                                                    var26.method190(var21, var22, 373);
                                                }
                                                if (var26.field656 == 33 || var15.field64[var18] != 1) {
                                                    int var27 = var15.field64[var18];
                                                    this.field1317.method209(var21 + 1 + var23, method520(var27, 640), this.field1142, 0, var22 + 10 + var24);
                                                    this.field1317.method209(var21 + var23, method520(var27, 640), this.field1142, 16776960, var22 + 9 + var24);
                                                }
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field69 == 3) {
                            if (var15.field97) {
                                Pix2D.method165(var16, var15.field72, var15.field103, var15.field73, (byte) 5, var17);
                            } else {
                                Pix2D.method166(var17, var15.field73, var16, var15.field72, var15.field103, (byte) 0);
                            }
                        } else if (var15.field69 == 4) {
                            PixFont var29 = var15.field100;
                            int var30 = var15.field103;
                            String var31 = var15.field101;
                            if ((this.field1194 == var15.field67 || this.field1195 == var15.field67 || this.field1158 == var15.field67) && var15.field105 != 0) {
                                var30 = var15.field105;
                            }
                            if (this.method498(true, var15)) {
                                var30 = var15.field104;
                                if (var15.field102.length() > 0) {
                                    var31 = var15.field102;
                                }
                            }
                            if (var15.field70 == 6 && this.field1185) {
                                var31 = "Please wait...";
                                var30 = var15.field103;
                            }
                            int var32 = var29.field678 + var17;
                            while (var31.length() > 0) {
                                if (var31.indexOf("%") != -1) {
                                    label266: while (true) {
                                        int var33 = var31.indexOf("%1");
                                        if (var33 == -1) {
                                            while (true) {
                                                int var34 = var31.indexOf("%2");
                                                if (var34 == -1) {
                                                    while (true) {
                                                        int var35 = var31.indexOf("%3");
                                                        if (var35 == -1) {
                                                            while (true) {
                                                                int var36 = var31.indexOf("%4");
                                                                if (var36 == -1) {
                                                                    while (true) {
                                                                        int var37 = var31.indexOf("%5");
                                                                        if (var37 == -1) {
                                                                            break label266;
                                                                        }
                                                                        var31 = var31.substring(0, var37) + this.method473(this.method506(568, 4, var15), true) + var31.substring(var37 + 2);
                                                                    }
                                                                }
                                                                var31 = var31.substring(0, var36) + this.method473(this.method506(568, 3, var15), true) + var31.substring(var36 + 2);
                                                            }
                                                        }
                                                        var31 = var31.substring(0, var35) + this.method473(this.method506(568, 2, var15), true) + var31.substring(var35 + 2);
                                                    }
                                                }
                                                var31 = var31.substring(0, var34) + this.method473(this.method506(568, 1, var15), true) + var31.substring(var34 + 2);
                                            }
                                        }
                                        var31 = var31.substring(0, var33) + this.method473(this.method506(568, 0, var15), true) + var31.substring(var33 + 2);
                                    }
                                }
                                int var38 = var31.indexOf("\\n");
                                String var39;
                                if (var38 != -1) {
                                    var39 = var31.substring(0, var38);
                                    var31 = var31.substring(var38 + 2);
                                } else {
                                    var39 = var31;
                                    var31 = "";
                                }
                                if (var15.field98) {
                                    var29.method207((byte) 9, var15.field99, var32, var39, var30, var15.field72 / 2 + var16);
                                } else {
                                    var29.method211(var15.field99, var39, false, var30, var32, var16);
                                }
                                var32 += var29.field678;
                            }
                        } else if (var15.field69 == 5) {
                            Pix32 var40;
                            if (this.method498(true, var15)) {
                                var40 = var15.field107;
                            } else {
                                var40 = var15.field106;
                            }
                            if (var40 != null) {
                                var40.method190(var16, var17, 373);
                            }
                        } else if (var15.field69 == 6) {
                            int var41 = Pix3D.field628;
                            int var42 = Pix3D.field629;
                            Pix3D.field628 = var15.field72 / 2 + var16;
                            Pix3D.field629 = var15.field73 / 2 + var17;
                            int var43 = Pix3D.field632[var15.field115] * var15.field114 >> 16;
                            int var44 = Pix3D.field633[var15.field115] * var15.field114 >> 16;
                            boolean var45 = this.method498(true, var15);
                            int var46;
                            if (var45) {
                                var46 = var15.field113;
                            } else {
                                var46 = var15.field112;
                            }
                            Model var47;
                            if (var46 == -1) {
                                var47 = var15.method33(-1, -1, var45, 0);
                            } else {
                                SeqType var48 = SeqType.field1069[var46];
                                var47 = var15.method33(var48.field1071[var15.field65], var48.field1072[var15.field65], var45, 0);
                            }
                            if (var47 != null) {
                                var47.method155(0, var15.field116, 0, var15.field115, 0, var43, var44);
                            }
                            Pix3D.field628 = var41;
                            Pix3D.field629 = var42;
                        } else if (var15.field69 == 7) {
                            PixFont var49 = var15.field100;
                            int var50 = 0;
                            for (int var51 = 0; var51 < var15.field73; ++var51) {
                                for (int var52 = 0; var52 < var15.field72; ++var52) {
                                    if (var15.field63[var50] > 0) {
                                        ObjType var53 = ObjType.method335(var15.field63[var50] - 1);
                                        String var54 = var53.field986;
                                        if (var53.field998 || var15.field64[var50] != 1) {
                                            var54 = var54 + " x" + method489(0, var15.field64[var50]);
                                        }
                                        int var55 = (var15.field91 + 115) * var52 + var16;
                                        int var56 = (var15.field92 + 12) * var51 + var17;
                                        if (var15.field98) {
                                            var49.method207((byte) 9, var15.field99, var56, var54, var15.field103, var15.field72 / 2 + var55);
                                        } else {
                                            var49.method211(var15.field99, var54, false, var15.field103, var56, var55);
                                        }
                                    }
                                    ++var50;
                                }
                            }
                        }
                    }
                }
                Pix2D.method163(false, var6, var7, var9, var8);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method446(boolean arg0) {
        if (this.field1286 > 1) {
            --this.field1286;
        }
        if (this.field1551 > 0) {
            --this.field1551;
        }
        for (int var2 = 0; var2 < 5 && this.method512(0); ++var2) {
        }
        if (this.field1463) {
            this.method444(7);
            this.method449(819);
            this.method450(-402);
            Packet var3 = InputTracking.method45(451);
            if (var3 != null) {
                this.field1491.method220(this.field1553, 54);
                this.field1491.method222(var3.field694);
                this.field1491.method229(var3.field693, var3.field694, 0, false);
                var3.method219(0);
            }
            ++this.field1549;
            if (this.field1549 > 750) {
                this.method441((byte) 66);
            }
            this.method459(true);
            this.method521(0);
            this.method438((byte) 1);
            if ((super.field24[1] == 1 || super.field24[2] == 1 || super.field24[3] == 1 || super.field24[4] == 1) && this.field1324++ > 5) {
                this.field1324 = 0;
                this.field1491.method220(this.field1553, 152);
                this.field1491.method222(this.field1542);
                this.field1491.method222(this.field1543);
                this.field1491.method221(this.field1199);
                this.field1491.method221(this.field1346);
            }
            ++this.field1338;
            if (this.field1423 != 0) {
                this.field1422 += 20;
                if (this.field1422 >= 400) {
                    this.field1423 = 0;
                }
            }
            if (this.field1513 != 0) {
                ++this.field1510;
                if (this.field1510 >= 15) {
                    if (this.field1513 == 2) {
                        this.field1527 = true;
                    }
                    if (this.field1513 == 3) {
                        this.field1417 = true;
                    }
                    this.field1513 = 0;
                }
            }
            if (this.field1298 != 0) {
                ++this.field1339;
                if (super.field19 > this.field1299 + 5 || super.field19 < this.field1299 - 5 || super.field20 > this.field1300 + 5 || super.field20 < this.field1300 - 5) {
                    this.field1132 = true;
                }
                if (super.field18 == 0) {
                    if (this.field1298 == 2) {
                        this.field1527 = true;
                    }
                    if (this.field1298 == 3) {
                        this.field1417 = true;
                    }
                    this.field1298 = 0;
                    if (this.field1132 && this.field1339 >= 5) {
                        this.field1439 = -1;
                        this.method476(633);
                        if (this.field1439 == this.field1296 && this.field1438 != this.field1297) {
                            Component var4 = Component.field62[this.field1296];
                            int var5 = var4.field63[this.field1438];
                            var4.field63[this.field1438] = var4.field63[this.field1297];
                            var4.field63[this.field1297] = var5;
                            int var6 = var4.field64[this.field1438];
                            var4.field64[this.field1438] = var4.field64[this.field1297];
                            var4.field64[this.field1297] = var6;
                            this.field1491.method220(this.field1553, 128);
                            this.field1491.method222(this.field1296);
                            this.field1491.method222(this.field1297);
                            this.field1491.method222(this.field1438);
                        }
                    } else if ((this.field1454 == 1 || this.method537((byte) 78, this.field1502 - 1)) && this.field1502 > 2) {
                        this.method475(false);
                    } else if (this.field1502 > 0) {
                        this.method464(this.field1502 - 1, 2);
                    }
                    this.field1510 = 10;
                    super.field21 = 0;
                }
            }
            ++field1248;
            if (field1248 > 127) {
                field1248 = 0;
                this.field1491.method220(this.field1553, 225);
                this.field1491.method224(4991788);
            }
            if (World3D.field319 != -1) {
                int var7 = World3D.field319;
                int var8 = World3D.field320;
                boolean var9 = this.method416(true, var8, field1316.field445[0], field1316.field446[0], 0, 0, 0, (byte) 8, 0, var7, 0, 0);
                World3D.field319 = -1;
                if (var9) {
                    this.field1420 = super.field22;
                    this.field1421 = super.field23;
                    this.field1423 = 1;
                    this.field1422 = 0;
                }
            }
            if (super.field21 == 1 && this.field1418 != null) {
                this.field1418 = null;
                this.field1417 = true;
                super.field21 = 0;
            }
            this.method507((byte) 5);
            this.method478((byte) 2);
            this.method477(7);
            this.method495(-75);
            if (super.field18 == 1 || super.field21 == 1) {
                ++this.field1141;
            }
            if (this.field1196 == 2) {
                this.method519((byte) -81);
            }
            if (this.field1196 == 2 && this.field1428) {
                this.method421(0);
            }
            for (int var10 = 0; var10 < 5; ++var10) {
                int var10002 = this.field1328[var10]++;
            }
            this.method530((byte) 4);
            ++super.field17;
            if (super.field17 > 4500) {
                this.field1551 = 250;
                super.field17 -= 500;
                this.field1491.method220(this.field1553, 113);
            }
            ++this.field1343;
            if (this.field1343 > 500) {
                this.field1343 = 0;
                int var11 = (int) (Math.random() * 8.0D);
                if ((var11 & 1) == 1) {
                    this.field1192 += this.field1193;
                }
                if ((var11 & 2) == 2) {
                    this.field1294 += this.field1295;
                }
                if ((var11 & 4) == 4) {
                    this.field1180 += this.field1181;
                }
            }
            if (this.field1192 < -50) {
                this.field1193 = 2;
            }
            if (this.field1192 > 50) {
                this.field1193 = -2;
            }
            if (this.field1294 < -55) {
                this.field1295 = 2;
            }
            if (this.field1294 > 55) {
                this.field1295 = -2;
            }
            if (this.field1180 < -40) {
                this.field1181 = 1;
            }
            if (this.field1180 > 40) {
                this.field1181 = -1;
            }
            ++this.field1365;
            if (this.field1365 > 500) {
                this.field1365 = 0;
                int var12 = (int) (Math.random() * 8.0D);
                if ((var12 & 1) == 1) {
                    this.field1199 += this.field1200;
                }
                if ((var12 & 2) == 2) {
                    this.field1346 += this.field1347;
                }
            }
            if (this.field1199 < -60) {
                this.field1200 = 2;
            }
            if (this.field1199 > 60) {
                this.field1200 = -2;
            }
            if (this.field1346 < -20) {
                this.field1347 = 1;
            }
            if (this.field1346 > 10) {
                this.field1347 = -1;
            }
            ++field1183;
            if (arg0) {
                this.field1329 = null;
            }
            if (field1183 > 110) {
                field1183 = 0;
                this.field1491.method220(this.field1553, 227);
                this.field1491.method225(0);
            }
            ++this.field1550;
            if (this.field1550 > 50) {
                this.field1491.method220(this.field1553, 251);
            }
            try {
                if (this.field1263 != null && this.field1491.field694 > 0) {
                    this.field1263.method41(this.field1250, this.field1491.field694, this.field1491.field693, 0);
                    this.field1491.field694 = 0;
                    this.field1550 = 0;
                }
            } catch (IOException var14) {
                this.method441((byte) 66);
            } catch (Exception var15) {
                this.method418(2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public static final void method447(int arg0) {
        World3D.field285 = true;
        Pix3D.field623 = true;
        field1140 = true;
        if (arg0 >= 0) {
            field1160 = -114;
        }
        World.field36 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILmb;I)V")
    private final void method448(int arg0, Packet arg1, int arg2) {
        int var4 = arg1.method242(8, false);
        if (var4 < this.field1495) {
            for (int var5 = var4; var5 < this.field1495; ++var5) {
                this.field1351[this.field1350++] = this.field1496[var5];
            }
        }
        if (var4 > this.field1495) {
            signlink.reporterror(this.field1451 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1495 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1496[var6];
                PlayerEntity var8 = this.field1494[var7];
                int var9 = arg1.method242(1, false);
                if (var9 == 0) {
                    this.field1496[this.field1495++] = var7;
                    var8.field441 = field1288;
                } else {
                    int var10 = arg1.method242(2, false);
                    if (var10 == 0) {
                        this.field1496[this.field1495++] = var7;
                        var8.field441 = field1288;
                        this.field1498[this.field1497++] = var7;
                    } else if (var10 == 1) {
                        this.field1496[this.field1495++] = var7;
                        var8.field441 = field1288;
                        int var11 = arg1.method242(3, false);
                        var8.method123(false, var11, 0);
                        int var12 = arg1.method242(1, false);
                        if (var12 == 1) {
                            this.field1498[this.field1497++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1496[this.field1495++] = var7;
                        var8.field441 = field1288;
                        int var13 = arg1.method242(3, false);
                        var8.method123(true, var13, 0);
                        int var14 = arg1.method242(3, false);
                        var8.method123(true, var14, 0);
                        int var15 = arg1.method242(1, false);
                        if (var15 == 1) {
                            this.field1498[this.field1497++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1351[this.field1350++] = var7;
                    }
                }
            }
            while (arg0 >= 0) {
                this.field1142 = !this.field1142;
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    private final void method449(int arg0) {
        if (arg0 <= 0) {
            this.field1491.method221(125);
        }
        if (this.field1196 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1163.method250(); var2 != null; var2 = (LocSpawned) this.field1163.method252(7)) {
                if (var2.field722 > 0) {
                    --var2.field722;
                }
                if (var2.field722 == 0) {
                    if (var2.field715 < 0 || World.method30(var2.field715, false, var2.field717)) {
                        this.method462(var2.field716, var2.field715, true, var2.field714, var2.field711, var2.field712, var2.field717, var2.field713);
                        var2.method118();
                    }
                } else {
                    if (var2.field721 > 0) {
                        --var2.field721;
                    }
                    if (var2.field721 == 0 && (var2.field718 < 0 || World.method30(var2.field718, false, var2.field720))) {
                        this.method462(var2.field719, var2.field718, true, var2.field714, var2.field711, var2.field712, var2.field720, var2.field713);
                        var2.field721 = -1;
                        if (var2.field718 == var2.field715 && var2.field715 == -1) {
                            var2.method118();
                        } else if (var2.field718 == var2.field715 && var2.field719 == var2.field716 && var2.field720 == var2.field717) {
                            var2.method118();
                        }
                    }
                }
            }
            ++field1334;
            if (field1334 > 85) {
                field1334 = 0;
                this.field1491.method220(this.field1553, 120);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method450(int arg0) {
        for (int var2 = 0; var2 < this.field1173; ++var2) {
            if (this.field1152[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field1370[var2] == this.field1427 && this.field1475[var2] == this.field1349) {
                        if (!this.method419(this.field1538)) {
                            var3 = true;
                        }
                    } else {
                        Packet var4 = Wave.method309(this.field1475[var2], -872, this.field1370[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field694 / 22) > (long) (this.field1355 / 22) + this.field1479) {
                            this.field1355 = var4.field694;
                            this.field1479 = System.currentTimeMillis();
                            if (this.method502(var4.field694, 0, var4.field693)) {
                                this.field1427 = this.field1370[var2];
                                this.field1349 = this.field1475[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var8) {
                }
                if (var3 && this.field1152[var2] != -5) {
                    this.field1152[var2] = -5;
                } else {
                    --this.field1173;
                    for (int var6 = var2; var6 < this.field1173; ++var6) {
                        this.field1370[var6] = this.field1370[var6 + 1];
                        this.field1475[var6] = this.field1475[var6 + 1];
                        this.field1152[var6] = this.field1152[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field1152[var2]--;
            }
        }
        while (arg0 >= 0) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        if (this.field1539 > 0) {
            this.field1539 -= 20;
            if (this.field1539 < 0) {
                this.field1539 = 0;
            }
            if (this.field1539 == 0 && this.field1398 && !field1140) {
                this.field1190 = this.field1186;
                this.field1191 = false;
                this.field1259.method279(2, this.field1190);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)V")
    public final void method451(int arg0, byte arg1) {
        int var3 = VarpType.field1099[arg0].field1107;
        if (arg1 != 4) {
            this.field1329 = null;
        }
        if (var3 != 0) {
            int var4 = this.field1269[arg0];
            if (var3 == 1) {
                if (var4 == 1) {
                    Pix3D.method178(true, 0.9D);
                }
                if (var4 == 2) {
                    Pix3D.method178(true, 0.8D);
                }
                if (var4 == 3) {
                    Pix3D.method178(true, 0.7D);
                }
                if (var4 == 4) {
                    Pix3D.method178(true, 0.6D);
                }
                ObjType.field1020.method115();
                this.field1366 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field1398;
                if (var4 == 0) {
                    this.method414(this.field1398, 0, this.field1552);
                    this.field1398 = true;
                }
                if (var4 == 1) {
                    this.method414(this.field1398, -400, this.field1552);
                    this.field1398 = true;
                }
                if (var4 == 2) {
                    this.method414(this.field1398, -800, this.field1552);
                    this.field1398 = true;
                }
                if (var4 == 3) {
                    this.method414(this.field1398, -1200, this.field1552);
                    this.field1398 = true;
                }
                if (var4 == 4) {
                    this.field1398 = false;
                }
                if (this.field1398 != var5 && !field1140) {
                    if (this.field1398) {
                        this.field1190 = this.field1186;
                        this.field1191 = false;
                        this.field1259.method279(2, this.field1190);
                    } else {
                        this.method543(3);
                    }
                    this.field1539 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field1457 = true;
                    this.method496(-3, 0);
                }
                if (var4 == 1) {
                    this.field1457 = true;
                    this.method496(-3, -400);
                }
                if (var4 == 2) {
                    this.field1457 = true;
                    this.method496(-3, -800);
                }
                if (var4 == 3) {
                    this.field1457 = true;
                    this.method496(-3, -1200);
                }
                if (var4 == 4) {
                    this.field1457 = false;
                }
            }
            if (var3 == 5) {
                this.field1454 = var4;
            }
            if (var3 == 6) {
                this.field1541 = var4;
            }
            if (var3 == 8) {
                this.field1290 = var4;
                this.field1417 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method452(int arg0) {
        if (this.field1419 == 2) {
            this.method469((this.field1407 - this.field1487 << 7) + this.field1410, this.field1409 * 2, false, (this.field1408 - this.field1488 << 7) + this.field1411);
            if (arg0 <= 0) {
                this.field1491.method221(89);
            }
            if (this.field1208 > -1 && field1288 % 20 < 10) {
                this.field1144[2].method190(this.field1208 - 12, this.field1209 - 28, 373);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILd;)Z")
    public final boolean method453(int arg0, Component arg1) {
        int var3 = arg1.field71;
        if (arg0 != -29977) {
            this.field1329 = null;
        }
        if (var3 == 201) {
            this.field1417 = true;
            this.field1484 = false;
            this.field1348 = true;
            this.field1217 = "";
            this.field1162 = 1;
            this.field1336 = "Enter name of friend to add to list";
        }
        if (var3 == 202) {
            this.field1417 = true;
            this.field1484 = false;
            this.field1348 = true;
            this.field1217 = "";
            this.field1162 = 2;
            this.field1336 = "Enter name of friend to delete from list";
        }
        if (var3 == 205) {
            this.field1551 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field1417 = true;
                this.field1484 = false;
                this.field1348 = true;
                this.field1217 = "";
                this.field1162 = 4;
                this.field1336 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field1417 = true;
                this.field1484 = false;
                this.field1348 = true;
                this.field1217 = "";
                this.field1162 = 5;
                this.field1336 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field1534[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = IdkType.field1050 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= IdkType.field1050) {
                                var6 = 0;
                            }
                        }
                        if (!IdkType.field1051[var6].field1057 && IdkType.field1051[var6].field1052 == var4 + (this.field1554 ? 0 : 7)) {
                            this.field1534[var4] = var6;
                            this.field1536 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field1485[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field1182[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field1182[var7].length) {
                        var9 = 0;
                    }
                }
                this.field1485[var7] = var9;
                this.field1536 = true;
            }
            if (var3 == 324 && !this.field1554) {
                this.field1554 = true;
                this.method455((byte) 7);
            }
            if (var3 == 325 && this.field1554) {
                this.field1554 = false;
                this.method455((byte) 7);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field1448 = !this.field1448;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method465(-968);
                    if (this.field1506.length() > 0) {
                        this.field1491.method220(this.field1553, 144);
                        this.field1491.method227(JString.method296(this.field1506), true);
                        this.field1491.method221(var3 - 601);
                        this.field1491.method221(this.field1448 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1491.method220(this.field1553, 188);
                this.field1491.method221(this.field1554 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field1491.method221(this.field1534[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field1491.method221(this.field1485[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method10(int arg0) {
        if (arg0 != -22285) {
            this.field1491.method221(199);
        }
        this.field1366 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method454(boolean arg0, String arg1) {
        this.field1463 &= arg0;
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1251; ++var3) {
                if (arg1.equalsIgnoreCase(this.field1143[var3])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(field1316.field453);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method455(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            this.field1305 = this.field1520.method291();
        }
        this.field1536 = true;
        for (int var3 = 0; var3 < 7; ++var3) {
            this.field1534[var3] = -1;
            for (int var4 = 0; var4 < IdkType.field1050; ++var4) {
                if (!IdkType.field1051[var4].field1057 && IdkType.field1051[var4].field1052 == var3 + (this.field1554 ? 0 : 7)) {
                    this.field1534[var3] = var4;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method456(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field1251 >= 100) {
                this.method458("Your friends list is full. Max of 100 hit", 0, "", true);
            } else {
                String var4 = JString.method300(JString.method297(9, arg0), 1);
                for (int var5 = 0; var5 < this.field1251; ++var5) {
                    if (this.field1345[var5] == arg0) {
                        this.method458(var4 + " is already on your friend list", 0, "", true);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1461; ++var6) {
                    if (this.field1171[var6] == arg0) {
                        this.method458("Please remove " + var4 + " from your ignore list first", 0, "", true);
                        return;
                    }
                }
                if (!var4.equals(field1316.field453)) {
                    this.field1143[this.field1251] = var4;
                    this.field1345[this.field1251] = arg0;
                    this.field1547 += arg1;
                    this.field1268[this.field1251] = 0;
                    ++this.field1251;
                    this.field1527 = true;
                    this.field1491.method220(this.field1553, 8);
                    this.field1491.method227(arg0, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lmb;II)V")
    private final void method457(Packet arg0, int arg1, int arg2) {
        arg0.method241(-156);
        int var4 = arg0.method242(1, false);
        if (arg2 != -33779) {
            this.field1329 = null;
        }
        if (var4 != 0) {
            int var5 = arg0.method242(2, false);
            if (var5 == 0) {
                this.field1498[this.field1497++] = this.field1493;
            } else if (var5 == 1) {
                int var6 = arg0.method242(3, false);
                field1316.method123(false, var6, 0);
                int var7 = arg0.method242(1, false);
                if (var7 == 1) {
                    this.field1498[this.field1497++] = this.field1493;
                }
            } else if (var5 == 2) {
                int var8 = arg0.method242(3, false);
                field1316.method123(true, var8, 0);
                int var9 = arg0.method242(3, false);
                field1316.method123(true, var9, 0);
                int var10 = arg0.method242(1, false);
                if (var10 == 1) {
                    this.field1498[this.field1497++] = this.field1493;
                }
            } else if (var5 == 3) {
                this.field1146 = arg0.method242(2, false);
                int var11 = arg0.method242(7, false);
                int var12 = arg0.method242(7, false);
                int var13 = arg0.method242(1, false);
                field1316.method122(var13 == 1, false, var12, var11);
                int var14 = arg0.method242(1, false);
                if (var14 == 1) {
                    this.field1498[this.field1497++] = this.field1493;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)V")
    public final void method458(String arg0, int arg1, String arg2, boolean arg3) {
        if (!arg3) {
            field1260 = this.field1520.method291();
        }
        if (arg1 == 0 && this.field1530 != -1) {
            this.field1418 = arg0;
            super.field21 = 0;
        }
        if (this.field1501 == -1) {
            this.field1417 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1134[var5] = this.field1134[var5 - 1];
            this.field1135[var5] = this.field1135[var5 - 1];
            this.field1136[var5] = this.field1136[var5 - 1];
        }
        this.field1134[0] = arg1;
        this.field1135[0] = arg2;
        this.field1136[0] = arg0;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method459(boolean arg0) {
        this.field1463 &= arg0;
        for (int var2 = -1; var2 < this.field1495; ++var2) {
            int var4;
            if (var2 == -1) {
                var4 = this.field1493;
            } else {
                var4 = this.field1496[var2];
            }
            PlayerEntity var5 = this.field1494[var4];
            if (var5 != null) {
                this.method522(var5, 1, (byte) 114);
            }
        }
        ++field1519;
        if (field1519 > 1406) {
            field1519 = 0;
            this.field1491.method220(this.field1553, 124);
            this.field1491.method221(0);
            int var3 = this.field1491.field694;
            this.field1491.method221(162);
            this.field1491.method221(22);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1491.method221(84);
            }
            this.field1491.method222(31824);
            this.field1491.method222(13490);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1491.method221(123);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1491.method221(134);
            }
            this.field1491.method221(100);
            this.field1491.method221(94);
            this.field1491.method222(35521);
            this.field1491.method230(this.field1491.field694 - var3, (byte) 9);
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method460(byte arg0) {
        if (arg0 != -125) {
            this.method6();
        }
        while (true) {
            OnDemandRequest var2 = this.field1259.method281();
            if (var2 == null) {
                return;
            }
            if (var2.field706 == 0) {
                Model.method133(var2.field708, (byte) 19, var2.field707);
                if ((this.field1259.method278(var2.field707, 547) & 98) != 0) {
                    this.field1527 = true;
                    if (this.field1501 != -1) {
                        this.field1417 = true;
                    }
                }
            }
            if (var2.field706 == 1 && var2.field708 != null) {
                AnimFrame.method58(4, var2.field708);
            }
            if (var2.field706 == 2 && this.field1190 == var2.field707 && var2.field708 != null) {
                this.method508(7, var2.field708, this.field1191);
            }
            if (var2.field706 == 3 && this.field1196 == 1) {
                for (int var3 = 0; var3 < this.field1523.length; ++var3) {
                    if (this.field1504[var3] == var2.field707) {
                        this.field1523[var3] = var2.field708;
                        if (var2.field708 == null) {
                            this.field1504[var3] = -1;
                        }
                        break;
                    }
                    if (this.field1505[var3] == var2.field707) {
                        this.field1396[var3] = var2.field708;
                        if (var2.field708 == null) {
                            this.field1505[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field706 == 93 && this.field1259.method277(false, var2.field707)) {
                World.method17(new Packet(699, var2.field708), this.field1259, -444);
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method461(int arg0) {
        this.field1206 = false;
        while (this.field1374) {
            this.field1206 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var3) {
            }
        }
        this.field1291 = null;
        this.field1292 = null;
        this.field1546 = null;
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field1555 = null;
        this.field1556 = null;
        this.field1557 = null;
        this.field1558 = null;
        this.field1150 = null;
        this.field1151 = null;
        this.field1310 = null;
        this.field1311 = null;
        this.field1464 = null;
        this.field1465 = null;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method7(byte arg0) {
        if (!this.field1327 && !this.field1449 && !this.field1340) {
            ++field1288;
            if (!this.field1463) {
                this.method434((byte) 5);
            } else {
                this.method446(false);
            }
            this.method460((byte) -125);
            if (arg0 == 2) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZIIIII)V")
    private final void method462(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1463 &= arg2;
        if (arg7 >= 1 && arg3 >= 1 && arg7 <= 102 && arg3 <= 102) {
            if (field1140 && this.field1146 != arg4) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg5 == 0) {
                var9 = this.field1529.method88(arg4, arg7, arg3);
            }
            if (arg5 == 1) {
                var9 = this.field1529.method89(arg4, arg3, arg7, 5);
            }
            if (arg5 == 2) {
                var9 = this.field1529.method90(arg4, arg7, arg3);
            }
            if (arg5 == 3) {
                var9 = this.field1529.method91(arg4, arg7, arg3);
            }
            if (var9 != 0) {
                int var13 = this.field1529.method92(arg4, arg7, arg3, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg5 == 0) {
                    this.field1529.method79(arg3, arg4, 9, arg7);
                    LocType var17 = LocType.method320(var14);
                    if (var17.field922) {
                        this.field1471[arg4].method351(var17.field923, var16, var15, true, arg7, arg3);
                    }
                }
                if (arg5 == 1) {
                    this.field1529.method80(arg4, arg7, arg3, (byte) -11);
                }
                if (arg5 == 2) {
                    this.field1529.method81(arg7, 3042, arg3, arg4);
                    LocType var18 = LocType.method320(var14);
                    if (var18.field920 + arg7 > 103 || var18.field920 + arg3 > 103 || var18.field921 + arg7 > 103 || var18.field921 + arg3 > 103) {
                        return;
                    }
                    if (var18.field922) {
                        this.field1471[arg4].method352(var18.field923, arg7, 0, arg3, var18.field920, var18.field921, var16);
                    }
                }
                if (arg5 == 3) {
                    this.field1529.method82(false, arg3, arg7, arg4);
                    LocType var19 = LocType.method320(var14);
                    if (var19.field922 && var19.field924) {
                        this.field1471[arg4].method354(arg3, arg7, 695);
                    }
                }
            }
            if (arg1 >= 0) {
                int var20 = arg4;
                if (arg4 < 3 && (this.field1526[1][arg7][arg3] & 2) == 2) {
                    var20 = arg4 + 1;
                }
                World.method31(this.field1471[arg4], arg3, arg1, this.field1524, var20, arg0, this.field1529, (byte) 9, arg4, arg6, arg7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjb;B)V")
    public final void method463(int arg0, int arg1, Pix32 arg2, byte arg3) {
        int var5 = this.field1543 + this.field1199 & 2047;
        if (arg3 == 0) {
            int var6 = arg0 * arg0 + arg1 * arg1;
            if (var6 <= 6400) {
                int var7 = Model.field588[var5];
                int var8 = Model.field589[var5];
                int var9 = var7 * 256 / (this.field1346 + 256);
                int var10 = var8 * 256 / (this.field1346 + 256);
                int var11 = arg0 * var9 + arg1 * var10 >> 16;
                int var12 = arg0 * var10 - arg1 * var9 >> 16;
                if (var6 > 2500) {
                    arg2.method197(this.field1353, true, var11 + 94 - arg2.field656 / 2, 83 - var12 - arg2.field657 / 2);
                } else {
                    arg2.method190(var11 + 94 - arg2.field656 / 2, 83 - var12 - arg2.field657 / 2, 373);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method464(int arg0, int arg1) {
        if (arg0 >= 0) {
            if (this.field1484) {
                this.field1484 = false;
                this.field1417 = true;
            }
            int var3 = this.field1376[arg0];
            int var4 = this.field1377[arg0];
            int var5 = this.field1378[arg0];
            int var6 = this.field1379[arg0];
            if (arg1 < 2 || arg1 > 2) {
                this.field1142 = !this.field1142;
            }
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 224 || var5 == 993 || var5 == 99 || var5 == 746 || var5 == 877) {
                boolean var7 = this.method416(false, var4, field1316.field445[0], field1316.field446[0], 0, 0, 2, (byte) 8, 0, var3, 0, 0);
                if (!var7) {
                    this.method416(false, var4, field1316.field445[0], field1316.field446[0], 0, 0, 2, (byte) 8, 1, var3, 0, 1);
                }
                this.field1420 = super.field22;
                this.field1421 = super.field23;
                this.field1423 = 2;
                this.field1422 = 0;
                if (var5 == 993) {
                    this.field1491.method220(this.field1553, 46);
                }
                if (var5 == 224) {
                    this.field1491.method220(this.field1553, 186);
                }
                if (var5 == 877) {
                    this.field1491.method220(this.field1553, 139);
                }
                if (var5 == 99) {
                    this.field1491.method220(this.field1553, 86);
                }
                if (var5 == 746) {
                    this.field1491.method220(this.field1553, 195);
                }
                this.field1491.method222(this.field1487 + var3);
                this.field1491.method222(this.field1488 + var4);
                this.field1491.method222(var6);
            }
            if (var5 == 903 || var5 == 363) {
                String var9 = this.field1444[arg0];
                int var10 = var9.indexOf("@whi@");
                if (var10 != -1) {
                    String var11 = var9.substring(var10 + 5).trim();
                    String var12 = JString.method300(JString.method297(9, JString.method296(var11)), 1);
                    boolean var13 = false;
                    for (int var14 = 0; var14 < this.field1495; ++var14) {
                        PlayerEntity var15 = this.field1494[this.field1496[var14]];
                        if (var15 != null && var15.field453 != null && var15.field453.equalsIgnoreCase(var12)) {
                            this.method416(false, var15.field446[0], field1316.field445[0], field1316.field446[0], 0, 0, 2, (byte) 8, 1, var15.field445[0], 0, 1);
                            if (var5 == 903) {
                                this.field1491.method220(this.field1553, 192);
                            }
                            if (var5 == 363) {
                                this.field1491.method220(this.field1553, 223);
                            }
                            this.field1491.method222(this.field1496[var14]);
                            var13 = true;
                            break;
                        }
                    }
                    if (!var13) {
                        this.method458("Unable to find " + var12, 0, "", true);
                    }
                }
            }
            if (var5 == 728 || var5 == 542 || var5 == 6 || var5 == 963 || var5 == 245) {
                NpcEntity var16 = this.field1230[var6];
                if (var16 != null) {
                    this.method416(false, var16.field446[0], field1316.field445[0], field1316.field446[0], 0, 0, 2, (byte) 8, 1, var16.field445[0], 0, 1);
                    this.field1420 = super.field22;
                    this.field1421 = super.field23;
                    this.field1423 = 2;
                    this.field1422 = 0;
                    if (var5 == 963) {
                        this.field1491.method220(this.field1553, 99);
                    }
                    if (var5 == 6) {
                        if ((var6 & 3) == 0) {
                            ++field1179;
                        }
                        if (field1179 >= 124) {
                            this.field1491.method220(this.field1553, 55);
                            this.field1491.method225(0);
                        }
                        this.field1491.method220(this.field1553, 237);
                    }
                    if (var5 == 542) {
                        this.field1491.method220(this.field1553, 158);
                    }
                    if (var5 == 728) {
                        this.field1491.method220(this.field1553, 149);
                    }
                    if (var5 == 245) {
                        if ((var6 & 3) == 0) {
                            ++field1459;
                        }
                        if (field1459 >= 85) {
                            this.field1491.method220(this.field1553, 174);
                            this.field1491.method222(39596);
                        }
                        this.field1491.method220(this.field1553, 242);
                    }
                    this.field1491.method222(var6);
                }
            }
            if (var5 == 651) {
                PlayerEntity var17 = this.field1494[var6];
                if (var17 != null) {
                    this.method416(false, var17.field446[0], field1316.field445[0], field1316.field446[0], 0, 0, 2, (byte) 8, 1, var17.field445[0], 0, 1);
                    this.field1420 = super.field22;
                    this.field1421 = super.field23;
                    this.field1423 = 2;
                    this.field1422 = 0;
                    this.field1491.method220(this.field1553, 116);
                    this.field1491.method222(var6);
                    this.field1491.method222(this.field1175);
                }
            }
            if (var5 == 930) {
                Component var18 = Component.field62[var4];
                this.field1174 = 1;
                this.field1175 = var4;
                this.field1176 = var18.field119;
                this.field1201 = 0;
                String var19 = var18.field117;
                if (var19.indexOf(" ") != -1) {
                    var19 = var19.substring(0, var19.indexOf(" "));
                }
                String var20 = var18.field117;
                if (var20.indexOf(" ") != -1) {
                    var20 = var20.substring(var20.indexOf(" ") + 1);
                }
                this.field1177 = var19 + " " + var18.field118 + " " + var20;
                if (this.field1176 == 16) {
                    this.field1527 = true;
                    this.field1540 = 3;
                    this.field1159 = true;
                }
            } else {
                if (var5 == 1102) {
                    ObjType var21 = ObjType.method335(var6);
                    String var22;
                    if (var21.field987 != null) {
                        var22 = new String(var21.field987);
                    } else {
                        var22 = "It's a " + var21.field986 + ".";
                    }
                    this.method458(var22, 0, "", true);
                }
                if (var5 == 265) {
                    NpcEntity var23 = this.field1230[var6];
                    if (var23 != null) {
                        this.method416(false, var23.field446[0], field1316.field445[0], field1316.field446[0], 0, 0, 2, (byte) 8, 1, var23.field445[0], 0, 1);
                        this.field1420 = super.field22;
                        this.field1421 = super.field23;
                        this.field1423 = 2;
                        this.field1422 = 0;
                        this.field1491.method220(this.field1553, 114);
                        this.field1491.method222(var6);
                        this.field1491.method222(this.field1175);
                    }
                }
                if (var5 == 1607) {
                    NpcEntity var24 = this.field1230[var6];
                    if (var24 != null) {
                        String var25;
                        if (var24.field450.field955 != null) {
                            var25 = new String(var24.field450.field955);
                        } else {
                            var25 = "It's a " + var24.field450.field954 + ".";
                        }
                        this.method458(var25, 0, "", true);
                    }
                }
                if (var5 == 217) {
                    boolean var26 = this.method416(false, var4, field1316.field445[0], field1316.field446[0], 0, 0, 2, (byte) 8, 0, var3, 0, 0);
                    if (!var26) {
                        this.method416(false, var4, field1316.field445[0], field1316.field446[0], 0, 0, 2, (byte) 8, 1, var3, 0, 1);
                    }
                    this.field1420 = super.field22;
                    this.field1421 = super.field23;
                    this.field1423 = 2;
                    this.field1422 = 0;
                    this.field1491.method220(this.field1553, 76);
                    this.field1491.method222(this.field1487 + var3);
                    this.field1491.method222(this.field1488 + var4);
                    this.field1491.method222(var6);
                    this.field1491.method222(this.field1204);
                    this.field1491.method222(this.field1202);
                    this.field1491.method222(this.field1203);
                }
                if (var5 == 1175) {
                    int var28 = var6 >> 14 & 32767;
                    LocType var29 = LocType.method320(var28);
                    String var30;
                    if (var29.field917 != null) {
                        var30 = new String(var29.field917);
                    } else {
                        var30 = "It's a " + var29.field916 + ".";
                    }
                    this.method458(var30, 0, "", true);
                }
                if (var5 == 947) {
                    this.method465(-968);
                }
                if (var5 == 602 || var5 == 596 || var5 == 22 || var5 == 892 || var5 == 415) {
                    if (var5 == 596) {
                        this.field1491.method220(this.field1553, 81);
                    }
                    if (var5 == 415) {
                        if ((var4 & 3) == 0) {
                            ++field1168;
                        }
                        if (field1168 >= 55) {
                            this.field1491.method220(this.field1553, 126);
                            this.field1491.method225(0);
                        }
                        this.field1491.method220(this.field1553, 154);
                    }
                    if (var5 == 22) {
                        this.field1491.method220(this.field1553, 239);
                    }
                    if (var5 == 602) {
                        this.field1491.method220(this.field1553, 22);
                    }
                    if (var5 == 892) {
                        if ((var3 & 3) == 0) {
                            ++field1477;
                        }
                        if (field1477 >= 130) {
                            this.field1491.method220(this.field1553, 36);
                            this.field1491.method221(177);
                        }
                        this.field1491.method220(this.field1553, 77);
                    }
                    this.field1491.method222(var6);
                    this.field1491.method222(var3);
                    this.field1491.method222(var4);
                    this.field1510 = 0;
                    this.field1511 = var4;
                    this.field1512 = var3;
                    this.field1513 = 2;
                    if (Component.field62[var4].field68 == this.field1561) {
                        this.field1513 = 1;
                    }
                    if (Component.field62[var4].field68 == this.field1501) {
                        this.field1513 = 3;
                    }
                }
                if (var5 == 285) {
                    this.method503(47, var6, 6, var4, var3);
                }
                if (var5 == 951) {
                    Component var31 = Component.field62[var4];
                    boolean var32 = true;
                    if (var31.field71 > 0) {
                        var32 = this.method453(-29977, var31);
                    }
                    if (var32) {
                        this.field1491.method220(this.field1553, 111);
                        this.field1491.method222(var4);
                    }
                }
                if (var5 == 504) {
                    this.method503(185, var6, 6, var4, var3);
                }
                if (var5 == 1501) {
                    field1455 += this.field1488;
                    if (field1455 >= 92) {
                        this.field1491.method220(this.field1553, 220);
                        this.field1491.method225(0);
                    }
                    this.method503(134, var6, 6, var4, var3);
                }
                if (var5 == 188) {
                    this.field1201 = 1;
                    this.field1202 = var3;
                    this.field1203 = var4;
                    this.field1204 = var6;
                    this.field1205 = ObjType.method335(var6).field986;
                    this.field1174 = 0;
                } else {
                    if (var5 == 960) {
                        this.field1491.method220(this.field1553, 111);
                        this.field1491.method222(var4);
                        Component var33 = Component.field62[var4];
                        if (var33.field76 != null && var33.field76[0][0] == 5) {
                            int var34 = var33.field76[0][1];
                            if (this.field1269[var34] != var33.field78[0]) {
                                this.field1269[var34] = var33.field78[0];
                                this.method451(var34, (byte) 4);
                                this.field1527 = true;
                            }
                        }
                    }
                    if (var5 == 367) {
                        PlayerEntity var35 = this.field1494[var6];
                        if (var35 != null) {
                            this.method416(false, var35.field446[0], field1316.field445[0], field1316.field446[0], 0, 0, 2, (byte) 8, 1, var35.field445[0], 0, 1);
                            this.field1420 = super.field22;
                            this.field1421 = super.field23;
                            this.field1423 = 2;
                            this.field1422 = 0;
                            this.field1491.method220(this.field1553, 101);
                            this.field1491.method222(var6);
                            this.field1491.method222(this.field1204);
                            this.field1491.method222(this.field1202);
                            this.field1491.method222(this.field1203);
                        }
                    }
                    if (var5 == 679) {
                        String var36 = this.field1444[arg0];
                        int var37 = var36.indexOf("@whi@");
                        if (var37 != -1) {
                            long var38 = JString.method296(var36.substring(var37 + 5).trim());
                            int var40 = -1;
                            for (int var41 = 0; var41 < this.field1251; ++var41) {
                                if (this.field1345[var41] == var38) {
                                    var40 = var41;
                                    break;
                                }
                            }
                            if (var40 != -1 && this.field1268[var40] > 0) {
                                this.field1417 = true;
                                this.field1484 = false;
                                this.field1348 = true;
                                this.field1217 = "";
                                this.field1162 = 3;
                                this.field1434 = this.field1345[var40];
                                this.field1336 = "Enter message to send to " + this.field1143[var40];
                            }
                        }
                    }
                    if (var5 == 660) {
                        if (!this.field1435) {
                            this.field1529.method100(super.field23 - 11, false, super.field22 - 8);
                        } else {
                            this.field1529.method100(var4 - 11, false, var3 - 8);
                        }
                    }
                    if (var5 == 965) {
                        boolean var42 = this.method416(false, var4, field1316.field445[0], field1316.field446[0], 0, 0, 2, (byte) 8, 0, var3, 0, 0);
                        if (!var42) {
                            this.method416(false, var4, field1316.field445[0], field1316.field446[0], 0, 0, 2, (byte) 8, 1, var3, 0, 1);
                        }
                        this.field1420 = super.field22;
                        this.field1421 = super.field23;
                        this.field1423 = 2;
                        this.field1422 = 0;
                        this.field1491.method220(this.field1553, 78);
                        this.field1491.method222(this.field1487 + var3);
                        this.field1491.method222(this.field1488 + var4);
                        this.field1491.method222(var6);
                        this.field1491.method222(this.field1175);
                    }
                    if (var5 == 465) {
                        this.field1491.method220(this.field1553, 111);
                        this.field1491.method222(var4);
                        Component var44 = Component.field62[var4];
                        if (var44.field76 != null && var44.field76[0][0] == 5) {
                            int var45 = var44.field76[0][1];
                            this.field1269[var45] = 1 - this.field1269[var45];
                            this.method451(var45, (byte) 4);
                            this.field1527 = true;
                        }
                    }
                    if (var5 == 405 || var5 == 38 || var5 == 422 || var5 == 478 || var5 == 347) {
                        if (var5 == 347) {
                            this.field1491.method220(this.field1553, 127);
                        }
                        if (var5 == 422) {
                            this.field1491.method220(this.field1553, 176);
                        }
                        if (var5 == 478) {
                            if ((var3 & 3) == 0) {
                                ++field1149;
                            }
                            if (field1149 >= 90) {
                                this.field1491.method220(this.field1553, 52);
                            }
                            this.field1491.method220(this.field1553, 85);
                        }
                        if (var5 == 405) {
                            field1404 += var6;
                            if (field1404 >= 97) {
                                this.field1491.method220(this.field1553, 161);
                                this.field1491.method224(14953816);
                            }
                            this.field1491.method220(this.field1553, 93);
                        }
                        if (var5 == 38) {
                            this.field1491.method220(this.field1553, 203);
                        }
                        this.field1491.method222(var6);
                        this.field1491.method222(var3);
                        this.field1491.method222(var4);
                        this.field1510 = 0;
                        this.field1511 = var4;
                        this.field1512 = var3;
                        this.field1513 = 2;
                        if (Component.field62[var4].field68 == this.field1561) {
                            this.field1513 = 1;
                        }
                        if (Component.field62[var4].field68 == this.field1501) {
                            this.field1513 = 3;
                        }
                    }
                    if (var5 == 44 && !this.field1185) {
                        this.field1491.method220(this.field1553, 157);
                        this.field1491.method222(var4);
                        this.field1185 = true;
                    }
                    if (var5 == 881) {
                        this.field1491.method220(this.field1553, 45);
                        this.field1491.method222(var6);
                        this.field1491.method222(var3);
                        this.field1491.method222(var4);
                        this.field1491.method222(this.field1204);
                        this.field1491.method222(this.field1202);
                        this.field1491.method222(this.field1203);
                        this.field1510 = 0;
                        this.field1511 = var4;
                        this.field1512 = var3;
                        this.field1513 = 2;
                        if (Component.field62[var4].field68 == this.field1561) {
                            this.field1513 = 1;
                        }
                        if (Component.field62[var4].field68 == this.field1501) {
                            this.field1513 = 3;
                        }
                    }
                    if (var5 == 406 || var5 == 436 || var5 == 557 || var5 == 556) {
                        String var46 = this.field1444[arg0];
                        int var47 = var46.indexOf("@whi@");
                        if (var47 != -1) {
                            long var48 = JString.method296(var46.substring(var47 + 5).trim());
                            if (var5 == 406) {
                                this.method456(var48, 0);
                            }
                            if (var5 == 436) {
                                this.method433(var48, -338);
                            }
                            if (var5 == 557) {
                                this.method467((byte) 8, var48);
                            }
                            if (var5 == 556) {
                                this.method517(var48, 3);
                            }
                        }
                    }
                    if (var5 == 581) {
                        if ((var6 & 3) == 0) {
                            ++field1537;
                        }
                        if (field1537 >= 99) {
                            this.field1491.method220(this.field1553, 255);
                            this.field1491.method225(0);
                        }
                        this.method503(83, var6, 6, var4, var3);
                    }
                    if (var5 == 1773) {
                        ObjType var50 = ObjType.method335(var6);
                        String var51;
                        if (var4 >= 100000) {
                            var51 = var4 + " x " + var50.field986;
                        } else if (var50.field987 != null) {
                            var51 = new String(var50.field987);
                        } else {
                            var51 = "It's a " + var50.field986 + ".";
                        }
                        this.method458(var51, 0, "", true);
                    }
                    if (var5 == 391) {
                        this.field1491.method220(this.field1553, 90);
                        this.field1491.method222(var6);
                        this.field1491.method222(var3);
                        this.field1491.method222(var4);
                        this.field1491.method222(this.field1175);
                        this.field1510 = 0;
                        this.field1511 = var4;
                        this.field1512 = var3;
                        this.field1513 = 2;
                        if (Component.field62[var4].field68 == this.field1561) {
                            this.field1513 = 1;
                        }
                        if (Component.field62[var4].field68 == this.field1501) {
                            this.field1513 = 3;
                        }
                    }
                    if (var5 == 364) {
                        this.method503(75, var6, 6, var4, var3);
                    }
                    if (var5 == 1373 || var5 == 1544 || var5 == 151 || var5 == 1101) {
                        PlayerEntity var52 = this.field1494[var6];
                        if (var52 != null) {
                            this.method416(false, var52.field446[0], field1316.field445[0], field1316.field446[0], 0, 0, 2, (byte) 8, 1, var52.field445[0], 0, 1);
                            this.field1420 = super.field22;
                            this.field1421 = super.field23;
                            this.field1423 = 2;
                            this.field1422 = 0;
                            if (var5 == 151) {
                                ++field1131;
                                if (field1131 >= 90) {
                                    this.field1491.method220(this.field1553, 65);
                                    this.field1491.method222(31114);
                                }
                                this.field1491.method220(this.field1553, 94);
                            }
                            if (var5 == 1544) {
                                this.field1491.method220(this.field1553, 66);
                            }
                            if (var5 == 1101) {
                                this.field1491.method220(this.field1553, 223);
                            }
                            if (var5 == 1373) {
                                this.field1491.method220(this.field1553, 192);
                            }
                            this.field1491.method222(var6);
                        }
                    }
                    if (var5 == 450 && this.method503(160, var6, 6, var4, var3)) {
                        this.field1491.method222(this.field1204);
                        this.field1491.method222(this.field1202);
                        this.field1491.method222(this.field1203);
                    }
                    if (var5 == 34) {
                        String var53 = this.field1444[arg0];
                        int var54 = var53.indexOf("@whi@");
                        if (var54 != -1) {
                            this.method465(-968);
                            this.field1506 = var53.substring(var54 + 5).trim();
                            this.field1448 = false;
                            for (int var55 = 0; var55 < Component.field62.length; ++var55) {
                                if (Component.field62[var55] != null && Component.field62[var55].field71 == 600) {
                                    this.field1172 = this.field1561 = Component.field62[var55].field68;
                                    break;
                                }
                            }
                        }
                    }
                    if (var5 == 900) {
                        NpcEntity var56 = this.field1230[var6];
                        if (var56 != null) {
                            this.method416(false, var56.field446[0], field1316.field445[0], field1316.field446[0], 0, 0, 2, (byte) 8, 1, var56.field445[0], 0, 1);
                            this.field1420 = super.field22;
                            this.field1421 = super.field23;
                            this.field1423 = 2;
                            this.field1422 = 0;
                            this.field1491.method220(this.field1553, 21);
                            this.field1491.method222(var6);
                            this.field1491.method222(this.field1204);
                            this.field1491.method222(this.field1202);
                            this.field1491.method222(this.field1203);
                        }
                    }
                    if (var5 == 55 && this.method503(62, var6, 6, var4, var3)) {
                        this.field1491.method222(this.field1175);
                    }
                    this.field1201 = 0;
                    this.field1174 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method465(int arg0) {
        if (arg0 < 0) {
            this.field1491.method220(this.field1553, 224);
            if (this.field1390 != -1) {
                this.field1390 = -1;
                this.field1527 = true;
                this.field1185 = false;
                this.field1159 = true;
            }
            if (this.field1501 != -1) {
                this.field1501 = -1;
                this.field1417 = true;
                this.field1185 = false;
            }
            this.field1561 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method466(boolean arg0) {
        this.method493((byte) 82);
        this.field1358.method260((byte) 0);
        this.field1291.method204(0, 0, 373);
        if (!arg0) {
            short var2 = 360;
            short var3 = 200;
            if (this.field1252 == 0) {
                int var4 = var3 / 2 + 80;
                this.field1317.method207((byte) 9, true, var4, this.field1259.field809, 7711145, var2 / 2);
                int var5 = var3 / 2 - 20;
                this.field1319.method207((byte) 9, true, var5, "Welcome to RuneScape", 16776960, var2 / 2);
                int var16 = var5 + 30;
                int var6 = var2 / 2 - 80;
                int var7 = var3 / 2 + 20;
                this.field1292.method204(var6 - 73, var7 - 20, 373);
                this.field1319.method207((byte) 9, true, var7 + 5, "New user", 16777215, var6);
                int var8 = var2 / 2 + 80;
                this.field1292.method204(var8 - 73, var7 - 20, 373);
                this.field1319.method207((byte) 9, true, var7 + 5, "Existing User", 16777215, var8);
            }
            if (this.field1252 == 2) {
                int var9 = var3 / 2 - 40;
                if (this.field1401.length() > 0) {
                    this.field1319.method207((byte) 9, true, var9 - 15, this.field1401, 16776960, var2 / 2);
                    this.field1319.method207((byte) 9, true, var9, this.field1402, 16776960, var2 / 2);
                    var9 += 30;
                } else {
                    this.field1319.method207((byte) 9, true, var9 - 7, this.field1402, 16776960, var2 / 2);
                    var9 += 30;
                }
                this.field1319.method211(true, "Username: " + this.field1451 + (this.field1265 == 0 & field1288 % 40 < 20 ? "@yel@|" : ""), false, 16777215, var9, var2 / 2 - 90);
                var9 += 15;
                this.field1319.method211(true, "Password: " + JString.method302(this.field1452, -530) + (this.field1265 == 1 & field1288 % 40 < 20 ? "@yel@|" : ""), false, 16777215, var9, var2 / 2 - 88);
                var9 += 15;
                int var10 = var2 / 2 - 80;
                int var11 = var3 / 2 + 50;
                this.field1292.method204(var10 - 73, var11 - 20, 373);
                this.field1319.method207((byte) 9, true, var11 + 5, "Login", 16777215, var10);
                int var12 = var2 / 2 + 80;
                this.field1292.method204(var12 - 73, var11 - 20, 373);
                this.field1319.method207((byte) 9, true, var11 + 5, "Cancel", 16777215, var12);
            }
            if (this.field1252 == 3) {
                this.field1319.method207((byte) 9, true, var3 / 2 - 60, "Create a free account", 16776960, var2 / 2);
                int var13 = var3 / 2 - 35;
                this.field1319.method207((byte) 9, true, var13, "To create a new account you need to", 16777215, var2 / 2);
                int var17 = var13 + 15;
                this.field1319.method207((byte) 9, true, var17, "go back to the main RuneScape webpage", 16777215, var2 / 2);
                int var18 = var17 + 15;
                this.field1319.method207((byte) 9, true, var18, "and choose the red 'create account'", 16777215, var2 / 2);
                int var19 = var18 + 15;
                this.field1319.method207((byte) 9, true, var19, "button at the top right of that page.", 16777215, var2 / 2);
                int var20 = var19 + 15;
                int var14 = var2 / 2;
                int var15 = var3 / 2 + 50;
                this.field1292.method204(var14 - 73, var15 - 20, 373);
                this.field1319.method207((byte) 9, true, var15 + 5, "Cancel", 16777215, var14);
            }
            this.field1358.method261(214, -49767, super.field12, 186);
            if (this.field1366) {
                this.field1366 = false;
                this.field1356.method261(128, -49767, super.field12, 0);
                this.field1357.method261(214, -49767, super.field12, 386);
                this.field1361.method261(0, -49767, super.field12, 265);
                this.field1362.method261(574, -49767, super.field12, 265);
                this.field1363.method261(128, -49767, super.field12, 186);
                this.field1364.method261(574, -49767, super.field12, 186);
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1137 = Integer.parseInt(this.getParameter("nodeid"));
        field1138 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method447(-147);
        } else {
            method501(false);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1139 = false;
        } else {
            field1139 = true;
        }
        this.method2(-2082, 789, 532);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BJ)V")
    public final void method467(byte arg0, long arg1) {
        if (arg0 != 8) {
            this.field1153 = !this.field1153;
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field1251; ++var4) {
                if (this.field1345[var4] == arg1) {
                    --this.field1251;
                    this.field1527 = true;
                    for (int var5 = var4; var5 < this.field1251; ++var5) {
                        this.field1143[var5] = this.field1143[var5 + 1];
                        this.field1268[var5] = this.field1268[var5 + 1];
                        this.field1345[var5] = this.field1345[var5 + 1];
                    }
                    this.field1491.method220(this.field1553, 39);
                    this.field1491.method227(arg1, true);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;II)V")
    public final void method468(PathingEntity arg0, int arg1, int arg2) {
        this.method469(arg0.field397, arg2, false, arg0.field398);
        while (arg1 >= 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZI)V")
    public final void method469(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg0 >= 128 && arg3 >= 128 && arg0 <= 13056 && arg3 <= 13056) {
            int var5 = this.method499(arg3, arg0, this.field1146, (byte) 67) - arg1;
            if (arg2) {
                this.field1553 = 203;
            }
            int var6 = arg0 - this.field1219;
            int var7 = var5 - this.field1220;
            int var8 = arg3 - this.field1221;
            int var9 = Model.field588[this.field1222];
            int var10 = Model.field589[this.field1222];
            int var11 = Model.field588[this.field1223];
            int var12 = Model.field589[this.field1223];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field1208 = (var13 << 9) / var17 + Pix3D.field628;
                this.field1209 = (var16 << 9) / var17 + Pix3D.field629;
            } else {
                this.field1208 = -1;
                this.field1209 = -1;
            }
        } else {
            this.field1208 = -1;
            this.field1209 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method470(int arg0) {
        try {
            this.field1170 = -1;
            this.field1522.method254();
            this.field1249.method254();
            Pix3D.method172((byte) 78);
            this.method542(true);
            this.field1529.method62(this.field1403);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1471[var2].method346((byte) 77);
            }
            System.gc();
            World var3 = new World(104, this.field1524, this.field1526, 0, 104);
            int var4 = this.field1523.length;
            World.field36 = World3D.field285;
            for (int var5 = 0; var5 < var4; ++var5) {
                int var6 = this.field1503[var5] >> 8;
                int var7 = this.field1503[var5] & 255;
                if (var6 == 33 && var7 >= 71 && var7 <= 73) {
                    World.field36 = false;
                }
            }
            if (World.field36) {
                this.field1529.method63(this.field1146, false);
            } else {
                this.field1529.method63(0, false);
            }
            this.field1491.method220(this.field1553, 251);
            for (int var8 = 0; var8 < var4; ++var8) {
                int var9 = (this.field1503[var8] >> 8) * 64 - this.field1487;
                int var10 = (this.field1503[var8] & 255) * 64 - this.field1488;
                byte[] var11 = this.field1523[var8];
                if (var11 != null) {
                    var3.method15(var11, (this.field1414 - 6) * 8, 0, var10, var9, (this.field1413 - 6) * 8);
                } else if (this.field1414 < 800) {
                    var3.method14(64, var10, (byte) 3, var9, 64);
                }
            }
            this.field1491.method220(this.field1553, 251);
            for (int var12 = 0; var12 < var4; ++var12) {
                byte[] var13 = this.field1396[var12];
                if (var13 != null) {
                    int var14 = (this.field1503[var12] >> 8) * 64 - this.field1487;
                    int var15 = (this.field1503[var12] & 255) * 64 - this.field1488;
                    var3.method18(this.field1471, this.field1529, var15, -369, var14, var13);
                }
            }
            this.field1491.method220(this.field1553, 251);
            var3.method20(this.field1529, 9, this.field1471);
            this.field1431.method260((byte) 0);
            this.field1491.method220(this.field1553, 251);
            for (int var16 = 0; var16 < 104; ++var16) {
                for (int var17 = 0; var17 < 104; ++var17) {
                    this.method424(var16, var17);
                }
            }
            this.method482(true);
        } catch (Exception var30) {
        }
        LocType.field946.method115();
        if (field1140 && signlink.cache_dat != null) {
            int var19 = this.field1259.method274(-504, 0);
            for (int var20 = 0; var20 < var19; ++var20) {
                int var21 = this.field1259.method278(var20, 547);
                if ((var21 & 121) == 0) {
                    Model.method134(-724, var20);
                }
            }
        }
        System.gc();
        Pix3D.method173(field1532, 20);
        this.field1259.method283(false);
        int var22 = (this.field1413 - 6) / 8 - 1;
        int var23 = (this.field1413 + 6) / 8 + 1;
        if (arg0 >= 0) {
            field1472 = this.field1520.method291();
        }
        int var24 = (this.field1414 - 6) / 8 - 1;
        int var25 = (this.field1414 + 6) / 8 + 1;
        if (this.field1462) {
            var22 = 49;
            var23 = 50;
            var24 = 49;
            var25 = 50;
        }
        for (int var26 = var22; var26 <= var23; ++var26) {
            for (int var27 = var24; var27 <= var25; ++var27) {
                if (var22 == var26 || var23 == var26 || var24 == var27 || var25 == var27) {
                    int var28 = this.field1259.method276(7, var26, var27, 0);
                    if (var28 != -1) {
                        this.field1259.method284(3, var28, 0);
                    }
                    int var29 = this.field1259.method276(7, var26, var27, 1);
                    if (var29 != -1) {
                        this.field1259.method284(3, var29, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)Ljava/lang/String;")
    public final String method471(int arg0) {
        if (arg0 != 0) {
            this.field1491.method221(253);
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field15 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLd;IIIIIZ)V")
    public final void method472(int arg0, boolean arg1, Component arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        if (this.field1406) {
            this.field1315 = 32;
        } else {
            this.field1315 = 0;
        }
        this.field1406 = false;
        if (!arg8) {
            this.field1321 = this.field1520.method291();
        }
        if (arg7 >= arg3 && arg7 < arg3 + 16 && arg4 >= arg6 && arg4 < arg6 + 16) {
            arg2.field81 -= this.field1141 * 4;
            if (arg1) {
                this.field1527 = true;
                return;
            }
        } else if (arg7 >= arg3 && arg7 < arg3 + 16 && arg4 >= arg0 + arg6 - 16 && arg4 < arg0 + arg6) {
            arg2.field81 += this.field1141 * 4;
            if (arg1) {
                this.field1527 = true;
                return;
            }
        } else {
            if (arg7 < arg3 - this.field1315 || arg7 >= arg3 + 16 + this.field1315 || arg4 < arg6 + 16 || arg4 >= arg0 + arg6 - 16 || this.field1141 <= 0) {
                return;
            }
            int var10 = (arg0 - 32) * arg0 / arg5;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg4 - arg6 - 16 - var10 / 2;
            int var12 = arg0 - 32 - var10;
            arg2.field81 = (arg5 - arg0) * var11 / var12;
            if (arg1) {
                this.field1527 = true;
            }
            this.field1406 = true;
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1478) {
            this.method484((byte) 5);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public final String method473(int arg0, boolean arg1) {
        this.field1463 &= arg1;
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method474(boolean arg0) {
        this.field1430.method260((byte) 0);
        int var2 = this.field1543 + this.field1199 & 2047;
        int var3 = field1316.field397 / 32 + 48;
        if (arg0) {
            this.field1548 = this.field1426.method231();
        }
        int var4 = 464 - field1316.field398 / 32;
        this.field1373.method196(this.field1346 + 256, this.field1400, var3, var4, 21, 151, this.field1213, var2, 146, -634, 9);
        this.field1187.method196(256, this.field1254, 25, 25, 0, 33, this.field1293, this.field1543, 33, -634, 0);
        for (int var5 = 0; var5 < this.field1214; ++var5) {
            int var25 = this.field1215[var5] * 4 + 2 - field1316.field397 / 32;
            int var26 = this.field1216[var5] * 4 + 2 - field1316.field398 / 32;
            this.method463(var26, var25, this.field1211[var5], (byte) 0);
        }
        for (int var6 = 0; var6 < 104; ++var6) {
            for (int var21 = 0; var21 < 104; ++var21) {
                LinkList var22 = this.field1329[this.field1146][var6][var21];
                if (var22 != null) {
                    int var23 = var6 * 4 + 2 - field1316.field397 / 32;
                    int var24 = var21 * 4 + 2 - field1316.field398 / 32;
                    this.method463(var24, var23, this.field1224, (byte) 0);
                }
            }
        }
        for (int var7 = 0; var7 < this.field1231; ++var7) {
            NpcEntity var18 = this.field1230[this.field1232[var7]];
            if (var18 != null && var18.method124(0) && var18.field450.field971) {
                int var19 = var18.field397 / 32 - field1316.field397 / 32;
                int var20 = var18.field398 / 32 - field1316.field398 / 32;
                this.method463(var20, var19, this.field1225, (byte) 0);
            }
        }
        for (int var8 = 0; var8 < this.field1495; ++var8) {
            PlayerEntity var11 = this.field1494[this.field1496[var8]];
            if (var11 != null && var11.method124(0)) {
                int var12 = var11.field397 / 32 - field1316.field397 / 32;
                int var13 = var11.field398 / 32 - field1316.field398 / 32;
                boolean var14 = false;
                long var15 = JString.method296(var11.field453);
                for (int var17 = 0; var17 < this.field1251; ++var17) {
                    if (this.field1345[var17] == var15 && this.field1268[var17] != 0) {
                        var14 = true;
                        break;
                    }
                }
                if (var14) {
                    this.method463(var13, var12, this.field1227, (byte) 0);
                } else {
                    this.method463(var13, var12, this.field1226, (byte) 0);
                }
            }
        }
        if (this.field1371 != 0) {
            int var9 = this.field1371 * 4 + 2 - field1316.field397 / 32;
            int var10 = this.field1372 * 4 + 2 - field1316.field398 / 32;
            this.method463(var10, var9, this.field1344, (byte) 0);
        }
        Pix2D.method165(93, 3, 16777215, 3, (byte) 5, 82);
        this.field1431.method260((byte) 0);
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method475(boolean arg0) {
        int var2 = this.field1319.method208((byte) 37, "Choose Option");
        if (arg0) {
            field1264 = !field1264;
        }
        for (int var3 = 0; var3 < this.field1502; ++var3) {
            int var11 = this.field1319.method208((byte) 37, this.field1444[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field1502 * 15 + 21;
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
            this.field1435 = true;
            this.field1466 = 0;
            this.field1467 = var5;
            this.field1468 = var6;
            this.field1469 = var2;
            this.field1470 = this.field1502 * 15 + 22;
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
            this.field1435 = true;
            this.field1466 = 1;
            this.field1467 = var7;
            this.field1468 = var8;
            this.field1469 = var2;
            this.field1470 = this.field1502 * 15 + 22;
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
            this.field1435 = true;
            this.field1466 = 2;
            this.field1467 = var9;
            this.field1468 = var10;
            this.field1469 = var2;
            this.field1470 = this.field1502 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method476(int arg0) {
        if (this.field1298 == 0) {
            this.field1444[0] = "Cancel";
            this.field1378[0] = 1252;
            this.field1502 = 1;
            this.method442(super.field20, 5, super.field19);
            this.field1306 = 0;
            if (super.field19 > 8 && super.field20 > 11 && super.field19 < 520 && super.field20 < 345) {
                if (this.field1561 != -1) {
                    this.method516(8, 11, super.field19, super.field20, 972, 0, Component.field62[this.field1561]);
                } else {
                    this.method532((byte) 40);
                }
            }
            if (this.field1306 != this.field1158) {
                this.field1158 = this.field1306;
            }
            this.field1306 = 0;
            if (super.field19 > 562 && super.field20 > 231 && super.field19 < 752 && super.field20 < 492) {
                if (this.field1390 != -1) {
                    this.method516(562, 231, super.field19, super.field20, 972, 0, Component.field62[this.field1390]);
                } else if (this.field1369[this.field1540] != -1) {
                    this.method516(562, 231, super.field19, super.field20, 972, 0, Component.field62[this.field1369[this.field1540]]);
                }
            }
            if (this.field1306 != this.field1195) {
                this.field1527 = true;
                this.field1195 = this.field1306;
            }
            this.field1306 = 0;
            if (arg0 <= 0) {
                this.field1329 = null;
            }
            if (super.field19 > 22 && super.field20 > 375 && super.field19 < 431 && super.field20 < 471) {
                if (this.field1501 != -1) {
                    this.method516(22, 375, super.field19, super.field20, 972, 0, Component.field62[this.field1501]);
                } else {
                    this.method510(super.field19 - 22, true, super.field20 - 375);
                }
            }
            if (this.field1501 != -1 && this.field1306 != this.field1194) {
                this.field1417 = true;
                this.field1194 = this.field1306;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field1502 - 1; ++var3) {
                    if (this.field1378[var3] < 1000 && this.field1378[var3 + 1] > 1000) {
                        String var4 = this.field1444[var3];
                        this.field1444[var3] = this.field1444[var3 + 1];
                        this.field1444[var3 + 1] = var4;
                        int var5 = this.field1378[var3];
                        this.field1378[var3] = this.field1378[var3 + 1];
                        this.field1378[var3 + 1] = var5;
                        int var6 = this.field1376[var3];
                        this.field1376[var3] = this.field1376[var3 + 1];
                        this.field1376[var3 + 1] = var6;
                        int var7 = this.field1377[var3];
                        this.field1377[var3] = this.field1377[var3 + 1];
                        this.field1377[var3 + 1] = var7;
                        int var8 = this.field1379[var3];
                        this.field1379[var3] = this.field1379[var3 + 1];
                        this.field1379[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method477(int arg0) {
        if (this.field1303 != arg0) {
            this.field1491.method221(221);
        }
        if (super.field21 == 1) {
            if (super.field22 >= 549 && super.field22 <= 583 && super.field23 >= 195 && super.field23 < 231 && this.field1369[0] != -1) {
                this.field1527 = true;
                this.field1540 = 0;
                this.field1159 = true;
            }
            if (super.field22 >= 579 && super.field22 <= 609 && super.field23 >= 194 && super.field23 < 231 && this.field1369[1] != -1) {
                this.field1527 = true;
                this.field1540 = 1;
                this.field1159 = true;
            }
            if (super.field22 >= 607 && super.field22 <= 637 && super.field23 >= 194 && super.field23 < 231 && this.field1369[2] != -1) {
                this.field1527 = true;
                this.field1540 = 2;
                this.field1159 = true;
            }
            if (super.field22 >= 635 && super.field22 <= 679 && super.field23 >= 194 && super.field23 < 229 && this.field1369[3] != -1) {
                this.field1527 = true;
                this.field1540 = 3;
                this.field1159 = true;
            }
            if (super.field22 >= 676 && super.field22 <= 706 && super.field23 >= 194 && super.field23 < 231 && this.field1369[4] != -1) {
                this.field1527 = true;
                this.field1540 = 4;
                this.field1159 = true;
            }
            if (super.field22 >= 704 && super.field22 <= 734 && super.field23 >= 194 && super.field23 < 231 && this.field1369[5] != -1) {
                this.field1527 = true;
                this.field1540 = 5;
                this.field1159 = true;
            }
            if (super.field22 >= 732 && super.field22 <= 766 && super.field23 >= 195 && super.field23 < 231 && this.field1369[6] != -1) {
                this.field1527 = true;
                this.field1540 = 6;
                this.field1159 = true;
            }
            if (super.field22 >= 550 && super.field22 <= 584 && super.field23 >= 492 && super.field23 < 528 && this.field1369[7] != -1) {
                this.field1527 = true;
                this.field1540 = 7;
                this.field1159 = true;
            }
            if (super.field22 >= 582 && super.field22 <= 612 && super.field23 >= 492 && super.field23 < 529 && this.field1369[8] != -1) {
                this.field1527 = true;
                this.field1540 = 8;
                this.field1159 = true;
            }
            if (super.field22 >= 609 && super.field22 <= 639 && super.field23 >= 492 && super.field23 < 529 && this.field1369[9] != -1) {
                this.field1527 = true;
                this.field1540 = 9;
                this.field1159 = true;
            }
            if (super.field22 >= 637 && super.field22 <= 681 && super.field23 >= 493 && super.field23 < 528 && this.field1369[10] != -1) {
                this.field1527 = true;
                this.field1540 = 10;
                this.field1159 = true;
            }
            if (super.field22 >= 679 && super.field22 <= 709 && super.field23 >= 492 && super.field23 < 529 && this.field1369[11] != -1) {
                this.field1527 = true;
                this.field1540 = 11;
                this.field1159 = true;
            }
            if (super.field22 >= 706 && super.field22 <= 736 && super.field23 >= 492 && super.field23 < 529 && this.field1369[12] != -1) {
                this.field1527 = true;
                this.field1540 = 12;
                this.field1159 = true;
            }
            if (super.field22 >= 734 && super.field22 <= 768 && super.field23 >= 492 && super.field23 < 528 && this.field1369[13] != -1) {
                this.field1527 = true;
                this.field1540 = 13;
                this.field1159 = true;
            }
            ++field1483;
            if (field1483 > 150) {
                field1483 = 0;
                this.field1491.method220(this.field1553, 43);
                this.field1491.method221(43);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method478(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            this.field1548 = this.field1426.method231();
        }
        if (super.field21 == 1) {
            int var3 = super.field22 - 21 - 561;
            int var4 = super.field23 - 9 - 5;
            if (var3 >= 0 && var4 >= 0 && var3 < 146 && var4 < 151) {
                var3 -= 73;
                var4 -= 75;
                int var5 = this.field1543 + this.field1199 & 2047;
                int var6 = Pix3D.field632[var5];
                int var7 = Pix3D.field633[var5];
                int var8 = (this.field1346 + 256) * var6 >> 8;
                int var9 = (this.field1346 + 256) * var7 >> 8;
                int var10 = var3 * var9 + var4 * var8 >> 11;
                int var11 = var4 * var9 - var3 * var8 >> 11;
                int var12 = field1316.field397 + var10 >> 7;
                int var13 = field1316.field398 - var11 >> 7;
                boolean var14 = this.method416(true, var13, field1316.field445[0], field1316.field446[0], 0, 0, 1, (byte) 8, 0, var12, 0, 0);
                if (var14) {
                    this.field1491.method221(var3);
                    this.field1491.method221(var4);
                    this.field1491.method222(this.field1543);
                    this.field1491.method221(57);
                    this.field1491.method221(this.field1199);
                    this.field1491.method221(this.field1346);
                    this.field1491.method221(89);
                    this.field1491.method222(field1316.field397);
                    this.field1491.method222(field1316.field398);
                    this.field1491.method221(this.field1279);
                    this.field1491.method221(63);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBIILfc;)V")
    public final void method479(int arg0, byte arg1, int arg2, int arg3, NpcType arg4) {
        if (this.field1502 < 400) {
            String var6 = arg4.field954;
            if (arg1 != -50) {
                this.field1491.method221(100);
            }
            if (arg4.field972 != 0) {
                var6 = var6 + method439(field1316.field459, arg4.field972, this.field1287) + " (level-" + arg4.field972 + ")";
            }
            if (this.field1201 == 1) {
                this.field1444[this.field1502] = "Use " + this.field1205 + " with @yel@" + var6;
                this.field1378[this.field1502] = 900;
                this.field1379[this.field1502] = arg2;
                this.field1376[this.field1502] = arg0;
                this.field1377[this.field1502] = arg3;
                ++this.field1502;
            } else {
                if (this.field1174 == 1) {
                    if ((this.field1176 & 2) == 2) {
                        this.field1444[this.field1502] = this.field1177 + " @yel@" + var6;
                        this.field1378[this.field1502] = 265;
                        this.field1379[this.field1502] = arg2;
                        this.field1376[this.field1502] = arg0;
                        this.field1377[this.field1502] = arg3;
                        ++this.field1502;
                        return;
                    }
                } else {
                    if (arg4.field967 != null) {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (arg4.field967[var7] != null && !arg4.field967[var7].equalsIgnoreCase("attack")) {
                                this.field1444[this.field1502] = arg4.field967[var7] + " @yel@" + var6;
                                if (var7 == 0) {
                                    this.field1378[this.field1502] = 728;
                                }
                                if (var7 == 1) {
                                    this.field1378[this.field1502] = 542;
                                }
                                if (var7 == 2) {
                                    this.field1378[this.field1502] = 6;
                                }
                                if (var7 == 3) {
                                    this.field1378[this.field1502] = 963;
                                }
                                if (var7 == 4) {
                                    this.field1378[this.field1502] = 245;
                                }
                                this.field1379[this.field1502] = arg2;
                                this.field1376[this.field1502] = arg0;
                                this.field1377[this.field1502] = arg3;
                                ++this.field1502;
                            }
                        }
                    }
                    if (arg4.field967 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (arg4.field967[var8] != null && arg4.field967[var8].equalsIgnoreCase("attack")) {
                                short var9 = 0;
                                if (arg4.field972 > field1316.field459) {
                                    var9 = 2000;
                                }
                                this.field1444[this.field1502] = arg4.field967[var8] + " @yel@" + var6;
                                if (var8 == 0) {
                                    this.field1378[this.field1502] = var9 + 728;
                                }
                                if (var8 == 1) {
                                    this.field1378[this.field1502] = var9 + 542;
                                }
                                if (var8 == 2) {
                                    this.field1378[this.field1502] = var9 + 6;
                                }
                                if (var8 == 3) {
                                    this.field1378[this.field1502] = var9 + 963;
                                }
                                if (var8 == 4) {
                                    this.field1378[this.field1502] = var9 + 245;
                                }
                                this.field1379[this.field1502] = arg2;
                                this.field1376[this.field1502] = arg0;
                                this.field1377[this.field1502] = arg3;
                                ++this.field1502;
                            }
                        }
                    }
                    this.field1444[this.field1502] = "Examine @yel@" + var6;
                    this.field1378[this.field1502] = 1607;
                    this.field1379[this.field1502] = arg2;
                    this.field1376[this.field1502] = arg0;
                    this.field1377[this.field1502] = arg3;
                    ++this.field1502;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        LocSpawned var11 = null;
        for (LocSpawned var12 = (LocSpawned) this.field1163.method250(); var12 != null; var12 = (LocSpawned) this.field1163.method252(7)) {
            if (var12.field711 == arg1 && var12.field713 == arg9 && var12.field714 == arg0 && var12.field712 == arg8) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new LocSpawned();
            var11.field711 = arg1;
            var11.field712 = arg8;
            var11.field713 = arg9;
            var11.field714 = arg0;
            this.method431(3, var11);
            this.field1163.method247(var11);
        }
        var11.field718 = arg6;
        var11.field720 = arg3;
        if (arg7 < 0) {
            var11.field719 = arg5;
            var11.field721 = arg4;
            var11.field722 = arg2;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method481(byte arg0) {
        this.field1429.method260((byte) 0);
        Pix3D.field634 = this.field1308;
        if (arg0 != 49) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field1352.method204(0, 0, 373);
        if (this.field1390 != -1) {
            this.method445(0, Component.field62[this.field1390], 0, (byte) 0, 0);
        } else if (this.field1369[this.field1540] != -1) {
            this.method445(0, Component.field62[this.field1369[this.field1540]], 0, (byte) 0, 0);
        }
        if (this.field1435 && this.field1466 == 1) {
            this.method492(-45712);
        }
        this.field1429.method261(562, -49767, super.field12, 231);
        this.field1431.method260((byte) 0);
        Pix3D.field634 = this.field1309;
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    private final void method482(boolean arg0) {
        LocSpawned var2 = (LocSpawned) this.field1163.method250();
        this.field1463 &= arg0;
        while (var2 != null) {
            if (var2.field722 == -1) {
                var2.field721 = 0;
                this.method431(3, var2);
            } else {
                var2.method118();
            }
            var2 = (LocSpawned) this.field1163.method252(7);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg1 & 2047;
        int var9 = 2048 - arg3 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg6;
        if (var8 != 0) {
            int var13 = Model.field588[var8];
            int var14 = Model.field589[var8];
            int var15 = var11 * var14 - arg6 * var13 >> 16;
            var12 = var11 * var13 + arg6 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field588[var9];
            int var17 = Model.field589[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1219 = arg2 - var10;
        if (arg5 == -12945) {
            this.field1220 = arg0 - var11;
            this.field1221 = arg4 - var12;
            this.field1222 = arg1;
            this.field1223 = arg3;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method484(byte arg0) {
        this.field1374 = true;
        if (arg0 != 5) {
            this.field1329 = null;
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1206) {
                ++this.field1155;
                this.method529(205);
                this.method529(205);
                this.method428(false);
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
        this.field1374 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILmb;)V")
    private final void method485(int arg0, int arg1, Packet arg2) {
        this.field1350 = 0;
        if (arg1 == 9) {
            this.field1497 = 0;
            this.method457(arg2, arg0, -33779);
            this.method448(-356, arg2, arg0);
            this.method511(false, arg0, arg2);
            this.method515(arg0, arg2, 0);
            for (int var4 = 0; var4 < this.field1350; ++var4) {
                int var6 = this.field1351[var4];
                if (field1288 != this.field1494[var6].field441) {
                    this.field1494[var6] = null;
                }
            }
            if (arg2.field694 != arg0) {
                signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field694 + " psize:" + arg0);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field1495; ++var5) {
                    if (this.field1494[this.field1496[var5]] == null) {
                        signlink.reporterror(this.field1451 + " null entry in pl list - pos:" + var5 + " size:" + this.field1495);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method486(int arg0) {
        ++this.field1341;
        this.method509((byte) 2);
        this.method437(false);
        this.method536(0);
        while (arg0 >= 0) {
            field1472 = 254;
        }
        this.method504(true);
        if (!this.field1428) {
            int var2 = this.field1542;
            if (this.field1342 / 256 > var2) {
                var2 = this.field1342 / 256;
            }
            if (this.field1189[4] && this.field1424[4] + 128 > var2) {
                var2 = this.field1424[4] + 128;
            }
            int var3 = this.field1543 + this.field1180 & 2047;
            this.method483(this.method499(field1316.field398, field1316.field397, this.field1146, (byte) 67) - 50, var2, this.field1322, var3, this.field1323, -12945, var2 * 3 + 600);
            ++field1460;
            if (field1460 > 1802) {
                field1460 = 0;
                this.field1491.method220(this.field1553, 15);
                this.field1491.method221(0);
                int var4 = this.field1491.field694;
                this.field1491.method222(29711);
                this.field1491.method221(70);
                this.field1491.method221((int) (Math.random() * 256.0D));
                this.field1491.method221(242);
                this.field1491.method221(186);
                this.field1491.method221(39);
                this.field1491.method221(61);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1491.method221(13);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1491.method222(57856);
                }
                this.field1491.method222((int) (Math.random() * 65536.0D));
                this.field1491.method230(this.field1491.field694 - var4, (byte) 9);
            }
        }
        int var5;
        if (!this.field1428) {
            var5 = this.method539((byte) 3);
        } else {
            var5 = this.method540(6);
        }
        int var6 = this.field1219;
        int var7 = this.field1220;
        int var8 = this.field1221;
        int var9 = this.field1222;
        int var10 = this.field1223;
        for (int var11 = 0; var11 < 5; ++var11) {
            if (this.field1189[var11]) {
                int var13 = (int) (Math.random() * (double) (this.field1325[var11] * 2 + 1) - (double) this.field1325[var11] + Math.sin((double) this.field1207[var11] / 100.0D * (double) this.field1328[var11]) * (double) this.field1424[var11]);
                if (var11 == 0) {
                    this.field1219 += var13;
                }
                if (var11 == 1) {
                    this.field1220 += var13;
                }
                if (var11 == 2) {
                    this.field1221 += var13;
                }
                if (var11 == 3) {
                    this.field1223 = this.field1223 + var13 & 2047;
                }
                if (var11 == 4) {
                    this.field1222 += var13;
                    if (this.field1222 < 128) {
                        this.field1222 = 128;
                    }
                    if (this.field1222 > 383) {
                        this.field1222 = 383;
                    }
                }
            }
        }
        int var12 = Pix3D.field643;
        Model.field583 = true;
        Model.field586 = 0;
        Model.field584 = super.field19 - 8;
        Model.field585 = super.field20 - 11;
        Pix2D.method164(this.field1184);
        this.field1529.method101(this.field1221, this.field1222, this.field1220, this.field1219, this.field1442, var5, this.field1223);
        this.field1529.method76((byte) -106);
        this.method488(0);
        this.method452(281);
        this.method429(3, var12);
        this.method518(true);
        this.field1431.method261(8, -49767, super.field12, 11);
        this.field1219 = var6;
        this.field1220 = var7;
        this.field1221 = var8;
        this.field1222 = var9;
        this.field1223 = var10;
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method487(int arg0) {
        Graphics var2 = this.method11(true).getGraphics();
        if (arg0 >= 0) {
            this.field1329 = null;
        }
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 789, 532);
        this.method4(-165, 1);
        if (this.field1449) {
            this.field1206 = false;
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
        if (this.field1340) {
            this.field1206 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1327) {
            this.field1206 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        if (signlink.sunjava) {
            super.field6 = 5;
        }
        if (field1480) {
            this.field1327 = true;
        } else {
            field1480 = true;
            boolean var1 = false;
            String var2 = this.method471(0);
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
                this.field1340 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field1218[var3] = new FileStream(field1472, var3 + 1, 500000, signlink.cache_idx[var3], signlink.cache_dat);
                    }
                }
                try {
                    int var4 = 5;
                    this.field1525[8] = 0;
                    while (this.field1525[8] == 0) {
                        this.method13(field1453, 20, "Connecting to web server");
                        try {
                            DataInputStream var5 = this.method533("crc" + (int) (Math.random() * 9.9999999E7D));
                            Packet var6 = new Packet(699, new byte[36]);
                            var5.readFully(var6.field693, 0, 36);
                            for (int var7 = 0; var7 < 9; ++var7) {
                                this.field1525[var7] = var6.method236();
                            }
                            var5.close();
                        } catch (IOException var82) {
                            for (int var8 = var4; var8 > 0; --var8) {
                                this.method13(field1453, 10, "Error loading - Will retry in " + var8 + " secs.");
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
                    this.field1514 = this.method541(2, "title", 25, this.field1525[1], "title screen", 1);
                    this.field1317 = new PixFont((byte) 9, this.field1514, "p11");
                    this.field1318 = new PixFont((byte) 9, this.field1514, "p12");
                    this.field1319 = new PixFont((byte) 9, this.field1514, "b12");
                    this.field1320 = new PixFont((byte) 9, this.field1514, "q8");
                    this.method535(3);
                    this.method494(19297);
                    Jagfile var9 = this.method541(2, "config", 30, this.field1525[2], "config", 2);
                    Jagfile var10 = this.method541(2, "interface", 35, this.field1525[3], "interface", 3);
                    Jagfile var11 = this.method541(2, "media", 40, this.field1525[4], "2d graphics", 4);
                    Jagfile var12 = this.method541(2, "textures", 45, this.field1525[6], "textures", 6);
                    Jagfile var13 = this.method541(2, "wordenc", 50, this.field1525[7], "chat system", 7);
                    Jagfile var14 = this.method541(2, "sounds", 55, this.field1525[8], "sound effects", 8);
                    this.field1526 = new byte[4][104][104];
                    this.field1524 = new int[4][105][105];
                    this.field1529 = new World3D(692, 4, 104, this.field1524, 104);
                    for (int var15 = 0; var15 < 4; ++var15) {
                        this.field1471[var15] = new CollisionMap(846, 104, 104);
                    }
                    this.field1373 = new Pix32(512, 512);
                    Jagfile var16 = this.method541(2, "versionlist", 60, this.field1525[5], "update list", 5);
                    this.method13(field1453, 60, "Connecting to update server");
                    this.field1259 = new OnDemand();
                    this.field1259.method272(var16, this);
                    AnimFrame.method57(this.field1259.method275((byte) 94));
                    Model.method132(this.field1259.method274(-504, 0), this.field1259);
                    if (!field1140) {
                        this.field1190 = 0;
                        this.field1191 = false;
                        this.field1259.method279(2, this.field1190);
                        while (this.field1259.method280() > 0) {
                            this.method460((byte) -125);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var76) {
                            }
                        }
                    }
                    this.method13(field1453, 65, "Requesting animations");
                    int var17 = this.field1259.method274(-504, 1);
                    for (int var18 = 0; var18 < var17; ++var18) {
                        this.field1259.method279(1, var18);
                    }
                    while (this.field1259.method280() > 0) {
                        int var19 = var17 - this.field1259.method280();
                        if (var19 > 0) {
                            this.method13(field1453, 65, "Loading animations - " + var19 * 100 / var17 + "%");
                        }
                        this.method460((byte) -125);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var75) {
                        }
                    }
                    this.method13(field1453, 70, "Requesting models");
                    int var20 = this.field1259.method274(-504, 0);
                    for (int var21 = 0; var21 < var20; ++var21) {
                        int var22 = this.field1259.method278(var21, 547);
                        if ((var22 & 1) != 0) {
                            this.field1259.method279(0, var21);
                        }
                    }
                    int var23 = this.field1259.method280();
                    while (this.field1259.method280() > 0) {
                        int var24 = var23 - this.field1259.method280();
                        if (var24 > 0) {
                            this.method13(field1453, 70, "Loading models - " + var24 * 100 / var23 + "%");
                        }
                        this.method460((byte) -125);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var74) {
                        }
                    }
                    if (this.field1218[0] != null) {
                        this.method13(field1453, 75, "Requesting maps");
                        this.field1259.method279(3, this.field1259.method276(7, 47, 48, 0));
                        this.field1259.method279(3, this.field1259.method276(7, 47, 48, 1));
                        this.field1259.method279(3, this.field1259.method276(7, 48, 48, 0));
                        this.field1259.method279(3, this.field1259.method276(7, 48, 48, 1));
                        this.field1259.method279(3, this.field1259.method276(7, 49, 48, 0));
                        this.field1259.method279(3, this.field1259.method276(7, 49, 48, 1));
                        this.field1259.method279(3, this.field1259.method276(7, 47, 47, 0));
                        this.field1259.method279(3, this.field1259.method276(7, 47, 47, 1));
                        this.field1259.method279(3, this.field1259.method276(7, 48, 47, 0));
                        this.field1259.method279(3, this.field1259.method276(7, 48, 47, 1));
                        this.field1259.method279(3, this.field1259.method276(7, 48, 148, 0));
                        this.field1259.method279(3, this.field1259.method276(7, 48, 148, 1));
                        int var25 = this.field1259.method280();
                        while (this.field1259.method280() > 0) {
                            int var26 = var25 - this.field1259.method280();
                            if (var26 > 0) {
                                this.method13(field1453, 75, "Loading maps - " + var26 * 100 / var25 + "%");
                            }
                            this.method460((byte) -125);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var73) {
                            }
                        }
                    }
                    int var27 = this.field1259.method274(-504, 0);
                    for (int var28 = 0; var28 < var27; ++var28) {
                        int var29 = this.field1259.method278(var28, 547);
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
                            this.field1259.method282(0, (byte) 0, var30, var28);
                        }
                    }
                    int var31 = this.field1259.method274(-504, 3);
                    for (int var32 = 0; var32 < var31; ++var32) {
                        this.field1259.method282(3, (byte) 0, (byte) 2, var32);
                    }
                    if (!field1140) {
                        int var33 = this.field1259.method274(-504, 2);
                        for (int var34 = 1; var34 < var33; ++var34) {
                            this.field1259.method282(2, (byte) 0, (byte) 1, var34);
                        }
                    }
                    this.method13(field1453, 80, "Unpacking media");
                    this.field1352 = new Pix8(var11, "invback", 0);
                    this.field1354 = new Pix8(var11, "chatback", 0);
                    this.field1353 = new Pix8(var11, "mapback", 0);
                    this.field1312 = new Pix8(var11, "backbase1", 0);
                    this.field1313 = new Pix8(var11, "backbase2", 0);
                    this.field1314 = new Pix8(var11, "backhmid1", 0);
                    for (int var35 = 0; var35 < 13; ++var35) {
                        this.field1528[var35] = new Pix8(var11, "sideicons", var35);
                    }
                    this.field1187 = new Pix32(var11, "compass", 0);
                    try {
                        for (int var36 = 0; var36 < 50; ++var36) {
                            this.field1165[var36] = new Pix8(var11, "mapscene", var36);
                        }
                    } catch (Exception var81) {
                    }
                    try {
                        for (int var37 = 0; var37 < 50; ++var37) {
                            this.field1375[var37] = new Pix32(var11, "mapfunction", var37);
                        }
                    } catch (Exception var80) {
                    }
                    try {
                        for (int var38 = 0; var38 < 20; ++var38) {
                            this.field1332[var38] = new Pix32(var11, "hitmarks", var38);
                        }
                    } catch (Exception var79) {
                    }
                    try {
                        for (int var39 = 0; var39 < 20; ++var39) {
                            this.field1144[var39] = new Pix32(var11, "headicons", var39);
                        }
                    } catch (Exception var78) {
                    }
                    this.field1344 = new Pix32(var11, "mapflag", 0);
                    for (int var40 = 0; var40 < 8; ++var40) {
                        this.field1267[var40] = new Pix32(var11, "cross", var40);
                    }
                    this.field1224 = new Pix32(var11, "mapdots", 0);
                    this.field1225 = new Pix32(var11, "mapdots", 1);
                    this.field1226 = new Pix32(var11, "mapdots", 2);
                    this.field1227 = new Pix32(var11, "mapdots", 3);
                    this.field1261 = new Pix8(var11, "scrollbar", 0);
                    this.field1262 = new Pix8(var11, "scrollbar", 1);
                    this.field1280 = new Pix8(var11, "redstone1", 0);
                    this.field1281 = new Pix8(var11, "redstone2", 0);
                    this.field1282 = new Pix8(var11, "redstone3", 0);
                    this.field1283 = new Pix8(var11, "redstone1", 0);
                    this.field1283.method201((byte) 123);
                    this.field1284 = new Pix8(var11, "redstone2", 0);
                    this.field1284.method201((byte) 123);
                    this.field1391 = new Pix8(var11, "redstone1", 0);
                    this.field1391.method202(0);
                    this.field1392 = new Pix8(var11, "redstone2", 0);
                    this.field1392.method202(0);
                    this.field1393 = new Pix8(var11, "redstone3", 0);
                    this.field1393.method202(0);
                    this.field1394 = new Pix8(var11, "redstone1", 0);
                    this.field1394.method201((byte) 123);
                    this.field1394.method202(0);
                    this.field1395 = new Pix8(var11, "redstone2", 0);
                    this.field1395.method201((byte) 123);
                    this.field1395.method202(0);
                    Pix32 var41 = new Pix32(var11, "backleft1", 0);
                    this.field1238 = new PixMap(this.method11(true), var41.field652, true, var41.field653);
                    var41.method188(0, 0, -7650);
                    Pix32 var42 = new Pix32(var11, "backleft2", 0);
                    this.field1239 = new PixMap(this.method11(true), var42.field652, true, var42.field653);
                    var42.method188(0, 0, -7650);
                    Pix32 var43 = new Pix32(var11, "backright1", 0);
                    this.field1240 = new PixMap(this.method11(true), var43.field652, true, var43.field653);
                    var43.method188(0, 0, -7650);
                    Pix32 var44 = new Pix32(var11, "backright2", 0);
                    this.field1241 = new PixMap(this.method11(true), var44.field652, true, var44.field653);
                    var44.method188(0, 0, -7650);
                    Pix32 var45 = new Pix32(var11, "backtop1", 0);
                    this.field1242 = new PixMap(this.method11(true), var45.field652, true, var45.field653);
                    var45.method188(0, 0, -7650);
                    Pix32 var46 = new Pix32(var11, "backtop2", 0);
                    this.field1243 = new PixMap(this.method11(true), var46.field652, true, var46.field653);
                    var46.method188(0, 0, -7650);
                    Pix32 var47 = new Pix32(var11, "backvmid1", 0);
                    this.field1244 = new PixMap(this.method11(true), var47.field652, true, var47.field653);
                    var47.method188(0, 0, -7650);
                    Pix32 var48 = new Pix32(var11, "backvmid2", 0);
                    this.field1245 = new PixMap(this.method11(true), var48.field652, true, var48.field653);
                    var48.method188(0, 0, -7650);
                    Pix32 var49 = new Pix32(var11, "backvmid3", 0);
                    this.field1246 = new PixMap(this.method11(true), var49.field652, true, var49.field653);
                    var49.method188(0, 0, -7650);
                    Pix32 var50 = new Pix32(var11, "backhmid2", 0);
                    this.field1247 = new PixMap(this.method11(true), var50.field652, true, var50.field653);
                    var50.method188(0, 0, -7650);
                    int var51 = (int) (Math.random() * 21.0D) - 10;
                    int var52 = (int) (Math.random() * 21.0D) - 10;
                    int var53 = (int) (Math.random() * 21.0D) - 10;
                    int var54 = (int) (Math.random() * 41.0D) - 20;
                    for (int var55 = 0; var55 < 50; ++var55) {
                        if (this.field1375[var55] != null) {
                            this.field1375[var55].method187(var51 + var54, var52 + var54, var53 + var54, 0);
                        }
                        if (this.field1165[var55] != null) {
                            this.field1165[var55].method203(var51 + var54, var52 + var54, var53 + var54, 0);
                        }
                    }
                    this.method13(field1453, 83, "Unpacking textures");
                    Pix3D.method174(var12, 567);
                    Pix3D.method178(true, 0.8D);
                    Pix3D.method173(field1532, 20);
                    this.method13(field1453, 86, "Unpacking config");
                    SeqType.method368(var9, (byte) 7);
                    LocType.method318(var9);
                    FloType.method358(var9, (byte) 7);
                    ObjType.method333(var9);
                    NpcType.method327(var9);
                    IdkType.method362(var9, (byte) 7);
                    SpotAnimType.method371(var9, (byte) 7);
                    VarpType.method374(var9, (byte) 7);
                    ObjType.field983 = field1139;
                    if (!field1140) {
                        this.method13(field1453, 90, "Unpacking sounds");
                        byte[] var56 = var14.method295("sounds.dat", (byte[]) null);
                        Packet var57 = new Packet(699, var56);
                        Wave.method308(var57, (byte) 7);
                    }
                    this.method13(field1453, 95, "Unpacking interfaces");
                    PixFont[] var58 = new PixFont[] { this.field1317, this.field1318, this.field1319, this.field1320 };
                    Component.method32((byte) 36, var10, var58, var11);
                    this.method13(field1453, 100, "Preparing game engine");
                    for (int var59 = 0; var59 < 33; ++var59) {
                        int var60 = 999;
                        int var61 = 0;
                        for (int var62 = 0; var62 < 35; ++var62) {
                            if (this.field1353.field660[this.field1353.field662 * var59 + var62] == 0) {
                                if (var60 == 999) {
                                    var60 = var62;
                                }
                            } else if (var60 != 999) {
                                var61 = var62;
                                break;
                            }
                        }
                        this.field1293[var59] = var60;
                        this.field1254[var59] = var61 - var60;
                    }
                    for (int var63 = 9; var63 < 160; ++var63) {
                        int var64 = 999;
                        int var65 = 0;
                        for (int var66 = 10; var66 < 168; ++var66) {
                            if (this.field1353.field660[this.field1353.field662 * var63 + var66] != 0 || var66 <= 34 && var63 <= 34) {
                                if (var64 != 999) {
                                    var65 = var66;
                                    break;
                                }
                            } else if (var64 == 999) {
                                var64 = var66;
                            }
                        }
                        this.field1213[var63 - 9] = var64 - 21;
                        this.field1400[var63 - 9] = var65 - var64;
                    }
                    Pix3D.method171(479, 96, 0);
                    this.field1307 = Pix3D.field634;
                    Pix3D.method171(190, 261, 0);
                    this.field1308 = Pix3D.field634;
                    Pix3D.method171(512, 334, 0);
                    this.field1309 = Pix3D.field634;
                    int[] var67 = new int[9];
                    for (int var68 = 0; var68 < 9; ++var68) {
                        int var69 = var68 * 32 + 128 + 15;
                        int var70 = var69 * 3 + 600;
                        int var71 = Pix3D.field632[var69];
                        var67[var68] = var70 * var71 >> 16;
                    }
                    World3D.method98(var67, 512, 500, 800, 5, 334);
                    WordFilter.method376(var13);
                } catch (Exception var83) {
                    signlink.reporterror("loaderror - " + var83.getMessage());
                    this.field1449 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method488(int arg0) {
        this.field1380 = 0;
        for (int var2 = -1; var2 < this.field1495 + this.field1231; ++var2) {
            PathingEntity var17;
            if (var2 == -1) {
                var17 = field1316;
            } else if (var2 < this.field1495) {
                var17 = this.field1494[this.field1496[var2]];
            } else {
                var17 = this.field1230[this.field1232[var2 - this.field1495]];
            }
            if (var17 != null && var17.method124(0)) {
                if (var2 >= this.field1495) {
                    if (this.field1419 == 1 && this.field1232[var2 - this.field1495] == this.field1289 && field1288 % 20 < 10) {
                        this.method468(var17, -109, var17.field442 + 15);
                        if (this.field1208 > -1) {
                            this.field1144[2].method190(this.field1208 - 12, this.field1209 - 28, 373);
                        }
                    }
                } else {
                    int var18 = 30;
                    PlayerEntity var19 = (PlayerEntity) var17;
                    if (var19.field456 != 0) {
                        this.method468(var17, -109, var17.field442 + 15);
                        if (this.field1208 > -1) {
                            for (int var20 = 0; var20 < 8; ++var20) {
                                if ((var19.field456 & 1 << var20) != 0) {
                                    this.field1144[var20].method190(this.field1208 - 12, this.field1209 - var18, 373);
                                    var18 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1419 == 10 && this.field1496[var2] == this.field1169) {
                        this.method468(var17, -109, var17.field442 + 15);
                        if (this.field1208 > -1) {
                            this.field1144[7].method190(this.field1208 - 12, this.field1209 - var18, 373);
                        }
                    }
                }
                if (var17.field409 != null && (var2 >= this.field1495 || this.field1458 == 0 || this.field1458 == 3 || this.field1458 == 1 && this.method454(true, ((PlayerEntity) var17).field453))) {
                    this.method468(var17, -109, var17.field442);
                    if (this.field1208 > -1 && this.field1380 < this.field1381) {
                        this.field1385[this.field1380] = this.field1319.method208((byte) 37, var17.field409) / 2;
                        this.field1384[this.field1380] = this.field1319.field678;
                        this.field1382[this.field1380] = this.field1208;
                        this.field1383[this.field1380] = this.field1209;
                        this.field1386[this.field1380] = var17.field411;
                        this.field1387[this.field1380] = var17.field412;
                        this.field1388[this.field1380] = var17.field410;
                        this.field1389[this.field1380++] = var17.field409;
                        if (this.field1541 == 0 && var17.field412 == 1) {
                            this.field1384[this.field1380] += 10;
                            this.field1383[this.field1380] += 5;
                        }
                        if (this.field1541 == 0 && var17.field412 == 2) {
                            this.field1385[this.field1380] = 60;
                        }
                    }
                }
                if (var17.field415 > field1288 + 100) {
                    this.method468(var17, -109, var17.field442 + 15);
                    if (this.field1208 > -1) {
                        int var21 = var17.field416 * 30 / var17.field417;
                        if (var21 > 30) {
                            var21 = 30;
                        }
                        Pix2D.method165(this.field1208 - 15, var21, 65280, 5, (byte) 5, this.field1209 - 3);
                        Pix2D.method165(this.field1208 - 15 + var21, 30 - var21, 16711680, 5, (byte) 5, this.field1209 - 3);
                    }
                }
                if (var17.field415 > field1288 + 330) {
                    this.method468(var17, -109, var17.field442 / 2);
                    if (this.field1208 > -1) {
                        this.field1332[var17.field414].method190(this.field1208 - 12, this.field1209 - 12, 373);
                        this.field1317.method206(String.valueOf(var17.field413), this.field1208, this.field1209 + 4, 39475, 0);
                        this.field1317.method206(String.valueOf(var17.field413), this.field1208 - 1, this.field1209 + 3, 39475, 16777215);
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field1380; ++var3) {
            int var4 = this.field1382[var3];
            int var5 = this.field1383[var3];
            int var6 = this.field1385[var3];
            int var7 = this.field1384[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var16 = 0; var16 < var3; ++var16) {
                    if (var5 + 2 > this.field1383[var16] - this.field1384[var16] && var5 - var7 < this.field1383[var16] + 2 && var4 - var6 < this.field1385[var16] + this.field1382[var16] && var4 + var6 > this.field1382[var16] - this.field1385[var16] && this.field1383[var16] - this.field1384[var16] < var5) {
                        var5 = this.field1383[var16] - this.field1384[var16];
                        var8 = true;
                    }
                }
            }
            this.field1208 = this.field1382[var3];
            this.field1209 = this.field1383[var3] = var5;
            String var9 = this.field1389[var3];
            if (this.field1541 == 0) {
                int var10 = 16776960;
                if (this.field1386[var3] < 6) {
                    var10 = this.field1333[this.field1386[var3]];
                }
                if (this.field1386[var3] == 6) {
                    var10 = this.field1341 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1386[var3] == 7) {
                    var10 = this.field1341 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1386[var3] == 8) {
                    var10 = this.field1341 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1386[var3] == 9) {
                    int var11 = 150 - this.field1388[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field1386[var3] == 10) {
                    int var12 = 150 - this.field1388[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field1386[var3] == 11) {
                    int var13 = 150 - this.field1388[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field1387[var3] == 0) {
                    this.field1319.method206(var9, this.field1208, this.field1209 + 1, 39475, 0);
                    this.field1319.method206(var9, this.field1208, this.field1209, 39475, var10);
                }
                if (this.field1387[var3] == 1) {
                    this.field1319.method210(this.field1341, this.field1209 + 1, 0, 2, this.field1208, var9);
                    this.field1319.method210(this.field1341, this.field1209, var10, 2, this.field1208, var9);
                }
                if (this.field1387[var3] == 2) {
                    int var14 = this.field1319.method208((byte) 37, var9);
                    int var15 = (150 - this.field1388[var3]) * (var14 + 100) / 150;
                    Pix2D.method163(false, this.field1208 - 50, 0, 334, this.field1208 + 50);
                    this.field1319.method209(this.field1208 + 50 - var15, var9, this.field1142, 0, this.field1209 + 1);
                    this.field1319.method209(this.field1208 + 50 - var15, var9, this.field1142, var10, this.field1209);
                    Pix2D.method162(705);
                }
            } else {
                this.field1319.method206(var9, this.field1208, this.field1209 + 1, 39475, 0);
                this.field1319.method206(var9, this.field1208, this.field1209, 39475, 16776960);
            }
        }
        this.field1547 += arg0;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)Ljava/lang/String;")
    private static final String method489(int arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg0 != 0) {
            field1260 = 52;
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lmb;IB)V")
    private final void method490(Packet arg0, int arg1, byte arg2) {
        if (arg2 == 4) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        arg0.method241(-156);
        int var6 = arg0.method242(8, false);
        if (var6 < this.field1231) {
            for (int var7 = var6; var7 < this.field1231; ++var7) {
                this.field1351[this.field1350++] = this.field1232[var7];
            }
        }
        if (var6 > this.field1231) {
            signlink.reporterror(this.field1451 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1231 = 0;
            for (int var8 = 0; var8 < var6; ++var8) {
                int var9 = this.field1232[var8];
                NpcEntity var10 = this.field1230[var9];
                int var11 = arg0.method242(1, false);
                if (var11 == 0) {
                    this.field1232[this.field1231++] = var9;
                    var10.field441 = field1288;
                } else {
                    int var12 = arg0.method242(2, false);
                    if (var12 == 0) {
                        this.field1232[this.field1231++] = var9;
                        var10.field441 = field1288;
                        this.field1498[this.field1497++] = var9;
                    } else if (var12 == 1) {
                        this.field1232[this.field1231++] = var9;
                        var10.field441 = field1288;
                        int var13 = arg0.method242(3, false);
                        var10.method123(false, var13, 0);
                        int var14 = arg0.method242(1, false);
                        if (var14 == 1) {
                            this.field1498[this.field1497++] = var9;
                        }
                    } else if (var12 == 2) {
                        this.field1232[this.field1231++] = var9;
                        var10.field441 = field1288;
                        int var15 = arg0.method242(3, false);
                        var10.method123(true, var15, 0);
                        int var16 = arg0.method242(3, false);
                        var10.method123(true, var16, 0);
                        int var17 = arg0.method242(1, false);
                        if (var17 == 1) {
                            this.field1498[this.field1497++] = var9;
                        }
                    } else if (var12 == 3) {
                        this.field1351[this.field1350++] = var9;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLbb;ILmb;I)V")
    private final void method491(byte arg0, PlayerEntity arg1, int arg2, Packet arg3, int arg4) {
        if (arg0 != -64) {
            this.field1329 = null;
        }
        if ((arg4 & 1) == 1) {
            int var6 = arg3.method231();
            byte[] var7 = new byte[var6];
            Packet var8 = new Packet(699, var7);
            arg3.method240(var6, 0, var7, -162);
            this.field1499[arg2] = var8;
            arg1.method126(false, var8);
        }
        if ((arg4 & 2) == 2) {
            int var9 = arg3.method233();
            if (var9 == 65535) {
                var9 = -1;
            }
            if (arg1.field424 == var9) {
                arg1.field428 = 0;
            }
            int var10 = arg3.method231();
            if (var9 == -1 || arg1.field424 == -1 || SeqType.field1069[var9].field1077 > SeqType.field1069[arg1.field424].field1077 || SeqType.field1069[arg1.field424].field1077 == 0) {
                arg1.field424 = var9;
                arg1.field425 = 0;
                arg1.field426 = 0;
                arg1.field427 = var10;
                arg1.field428 = 0;
            }
        }
        if ((arg4 & 4) == 4) {
            arg1.field418 = arg3.method233();
            if (arg1.field418 == 65535) {
                arg1.field418 = -1;
            }
        }
        if ((arg4 & 8) == 8) {
            arg1.field409 = arg3.method238();
            arg1.field411 = 0;
            arg1.field412 = 0;
            arg1.field410 = 150;
            this.method458(arg1.field409, 2, arg1.field453, true);
        }
        if ((arg4 & 16) == 16) {
            arg1.field413 = arg3.method231();
            arg1.field414 = arg3.method231();
            arg1.field415 = field1288 + 400;
            arg1.field416 = arg3.method231();
            arg1.field417 = arg3.method231();
        }
        if ((arg4 & 32) == 32) {
            arg1.field419 = arg3.method233();
            arg1.field420 = arg3.method233();
        }
        if ((arg4 & 64) == 64) {
            int var11 = arg3.method233();
            int var12 = arg3.method231();
            int var13 = arg3.method231();
            int var14 = arg3.field694;
            if (arg1.field453 != null) {
                long var15 = JString.method296(arg1.field453);
                boolean var17 = false;
                if (var12 <= 1) {
                    for (int var18 = 0; var18 < this.field1461; ++var18) {
                        if (this.field1171[var18] == var15) {
                            var17 = true;
                            break;
                        }
                    }
                }
                if (!var17 && this.field1516 == 0) {
                    try {
                        String var19 = WordPack.method303(var13, arg3, -19777);
                        String var20 = WordFilter.method386(var19, 713);
                        arg1.field409 = var20;
                        arg1.field411 = var11 >> 8;
                        arg1.field412 = var11 & 255;
                        arg1.field410 = 150;
                        if (var12 > 1) {
                            this.method458(var20, 1, arg1.field453, true);
                        } else {
                            this.method458(var20, 2, arg1.field453, true);
                        }
                    } catch (Exception var23) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg3.field694 = var13 + var14;
        }
        if ((arg4 & 256) == 256) {
            arg1.field429 = arg3.method233();
            int var22 = arg3.method236();
            arg1.field433 = var22 >> 16;
            arg1.field432 = (var22 & 65535) + field1288;
            arg1.field430 = 0;
            arg1.field431 = 0;
            if (arg1.field432 > field1288) {
                arg1.field430 = -1;
            }
            if (arg1.field429 == 65535) {
                arg1.field429 = -1;
            }
        }
        if ((arg4 & 512) == 512) {
            arg1.field434 = arg3.method231();
            arg1.field436 = arg3.method231();
            arg1.field435 = arg3.method231();
            arg1.field437 = arg3.method231();
            arg1.field438 = arg3.method233() + field1288;
            arg1.field439 = arg3.method233() + field1288;
            arg1.field440 = arg3.method231();
            arg1.field444 = 0;
            arg1.field445[0] = arg1.field435;
            arg1.field446[0] = arg1.field437;
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method492(int arg0) {
        if (arg0 == -45712) {
            int var2 = this.field1467;
            int var3 = this.field1468;
            int var4 = this.field1469;
            int var5 = this.field1470;
            int var6 = 6116423;
            Pix2D.method165(var2, var4, var6, var5, (byte) 5, var3);
            Pix2D.method165(var2 + 1, var4 - 2, 0, 16, (byte) 5, var3 + 1);
            Pix2D.method166(var3 + 18, var5 - 19, var2 + 1, var4 - 2, 0, (byte) 0);
            this.field1319.method209(var2 + 3, "Choose Option", this.field1142, var6, var3 + 14);
            int var7 = super.field19;
            int var8 = super.field20;
            if (this.field1466 == 0) {
                var7 -= 8;
                var8 -= 11;
            }
            if (this.field1466 == 1) {
                var7 -= 562;
                var8 -= 231;
            }
            if (this.field1466 == 2) {
                var7 -= 22;
                var8 -= 375;
            }
            for (int var9 = 0; var9 < this.field1502; ++var9) {
                int var10 = (this.field1502 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                this.field1319.method211(true, this.field1444[var9], false, var11, var10, var2 + 3);
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method493(byte arg0) {
        if (this.field1356 == null) {
            super.field13 = null;
            this.field1432 = null;
            this.field1430 = null;
            this.field1429 = null;
            this.field1431 = null;
            this.field1255 = null;
            this.field1256 = null;
            this.field1257 = null;
            this.field1359 = new PixMap(this.method11(true), 128, true, 265);
            Pix2D.method164(this.field1184);
            this.field1360 = new PixMap(this.method11(true), 128, true, 265);
            Pix2D.method164(this.field1184);
            this.field1356 = new PixMap(this.method11(true), 533, true, 186);
            Pix2D.method164(this.field1184);
            this.field1357 = new PixMap(this.method11(true), 360, true, 146);
            Pix2D.method164(this.field1184);
            this.field1358 = new PixMap(this.method11(true), 360, true, 200);
            Pix2D.method164(this.field1184);
            this.field1361 = new PixMap(this.method11(true), 214, true, 267);
            Pix2D.method164(this.field1184);
            this.field1362 = new PixMap(this.method11(true), 215, true, 267);
            if (arg0 == 82) {
                Pix2D.method164(this.field1184);
                this.field1363 = new PixMap(this.method11(true), 86, true, 79);
                Pix2D.method164(this.field1184);
                this.field1364 = new PixMap(this.method11(true), 87, true, 79);
                Pix2D.method164(this.field1184);
                if (this.field1514 != null) {
                    this.method535(3);
                    this.method494(19297);
                }
                this.field1366 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method494(int arg0) {
        this.field1291 = new Pix8(this.field1514, "titlebox", 0);
        this.field1292 = new Pix8(this.field1514, "titlebutton", 0);
        this.field1546 = new Pix8[12];
        if (arg0 != 19297) {
            this.method6();
        }
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field1546[var2] = new Pix8(this.field1514, "runes", var2);
        }
        this.field1464 = new Pix32(128, 265);
        this.field1465 = new Pix32(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field1464.field651[var3] = this.field1359.field731[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field1465.field651[var4] = this.field1360.field731[var4];
        }
        this.field1556 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field1556[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field1556[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1556[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1556[var8 + 192] = 16777215;
        }
        this.field1557 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1557[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1557[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1557[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1557[var12 + 192] = 16777215;
        }
        this.field1558 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1558[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1558[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1558[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1558[var16 + 192] = 16777215;
        }
        this.field1555 = new int[256];
        this.field1150 = new int[32768];
        this.field1151 = new int[32768];
        this.method435(298, (Pix8) null);
        this.field1310 = new int[32768];
        this.field1311 = new int[32768];
        this.method13(field1453, 10, "Connecting to fileserver");
        if (!this.field1206) {
            this.field1478 = true;
            this.field1206 = true;
            this.method12(this, 2);
        } else {
            if (Linkable.field365) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method495(int arg0) {
        while (arg0 >= 0) {
            this.field1548 = this.field1426.method231();
        }
        if (super.field21 == 1) {
            if (super.field22 >= 8 && super.field22 <= 108 && super.field23 >= 490 && super.field23 <= 522) {
                this.field1458 = (this.field1458 + 1) % 4;
                this.field1337 = true;
                this.field1417 = true;
                this.field1491.method220(this.field1553, 130);
                this.field1491.method221(this.field1458);
                this.field1491.method221(this.field1443);
                this.field1491.method221(this.field1210);
            }
            if (super.field22 >= 137 && super.field22 <= 237 && super.field23 >= 490 && super.field23 <= 522) {
                this.field1443 = (this.field1443 + 1) % 3;
                this.field1337 = true;
                this.field1417 = true;
                this.field1491.method220(this.field1553, 130);
                this.field1491.method221(this.field1458);
                this.field1491.method221(this.field1443);
                this.field1491.method221(this.field1210);
            }
            if (super.field22 >= 275 && super.field22 <= 375 && super.field23 >= 490 && super.field23 <= 522) {
                this.field1210 = (this.field1210 + 1) % 3;
                this.field1337 = true;
                this.field1417 = true;
                this.field1491.method220(this.field1553, 130);
                this.field1491.method221(this.field1458);
                this.field1491.method221(this.field1443);
                this.field1491.method221(this.field1210);
            }
            if (super.field22 >= 416 && super.field22 <= 516 && super.field23 >= 490 && super.field23 <= 522) {
                this.method465(-968);
                this.field1506 = "";
                this.field1448 = false;
                for (int var2 = 0; var2 < Component.field62.length; ++var2) {
                    if (Component.field62[var2] != null && Component.field62[var2].field71 == 600) {
                        this.field1172 = this.field1561 = Component.field62[var2].field68;
                        return;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method8(byte arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1263 != null) {
                this.field1263.method37();
            }
        } catch (Exception var2) {
        }
        this.field1263 = null;
        this.method543(3);
        this.field1259.method273();
        this.field1259 = null;
        this.field1491 = null;
        this.field1405 = null;
        this.field1426 = null;
        this.field1503 = null;
        this.field1523 = null;
        this.field1396 = null;
        this.field1504 = null;
        this.field1505 = null;
        this.field1524 = null;
        this.field1526 = null;
        this.field1529 = null;
        this.field1471 = null;
        this.field1285 = null;
        this.field1270 = null;
        this.field1559 = null;
        this.field1560 = null;
        this.field1416 = null;
        this.field1429 = null;
        this.field1430 = null;
        this.field1431 = null;
        this.field1432 = null;
        this.field1255 = null;
        this.field1256 = null;
        this.field1257 = null;
        this.field1238 = null;
        this.field1239 = null;
        this.field1240 = null;
        this.field1241 = null;
        this.field1242 = null;
        this.field1243 = null;
        this.field1244 = null;
        this.field1245 = null;
        if (arg0 == -83) {
            this.field1246 = null;
            this.field1247 = null;
            this.field1352 = null;
            this.field1353 = null;
            this.field1354 = null;
            this.field1312 = null;
            this.field1313 = null;
            this.field1314 = null;
            this.field1528 = null;
            this.field1280 = null;
            this.field1281 = null;
            this.field1282 = null;
            this.field1283 = null;
            this.field1284 = null;
            this.field1391 = null;
            this.field1392 = null;
            this.field1393 = null;
            this.field1394 = null;
            this.field1395 = null;
            this.field1187 = null;
            this.field1332 = null;
            this.field1144 = null;
            this.field1267 = null;
            this.field1224 = null;
            this.field1225 = null;
            this.field1226 = null;
            this.field1227 = null;
            this.field1165 = null;
            this.field1375 = null;
            this.field1164 = null;
            this.field1494 = null;
            this.field1496 = null;
            this.field1498 = null;
            this.field1499 = null;
            this.field1351 = null;
            this.field1230 = null;
            this.field1232 = null;
            this.field1329 = null;
            this.field1163 = null;
            this.field1249 = null;
            this.field1522 = null;
            this.field1376 = null;
            this.field1377 = null;
            this.field1378 = null;
            this.field1379 = null;
            this.field1444 = null;
            this.field1269 = null;
            this.field1215 = null;
            this.field1216 = null;
            this.field1211 = null;
            this.field1373 = null;
            this.field1143 = null;
            this.field1345 = null;
            this.field1268 = null;
            this.field1359 = null;
            this.field1360 = null;
            this.field1356 = null;
            this.field1357 = null;
            this.field1358 = null;
            this.field1361 = null;
            this.field1362 = null;
            this.field1363 = null;
            this.field1364 = null;
            this.method461(715);
            LocType.method319(true);
            NpcType.method328(true);
            ObjType.method334(true);
            FloType.field1036 = null;
            IdkType.field1051 = null;
            Component.field62 = null;
            UnkType.field1059 = null;
            SeqType.field1069 = null;
            SpotAnimType.field1084 = null;
            SpotAnimType.field1097 = null;
            VarpType.field1099 = null;
            super.field13 = null;
            PlayerEntity.field474 = null;
            Pix3D.method169(true);
            World3D.method61(true);
            Model.method131(true);
            AnimFrame.method59(true);
            System.gc();
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method496(int arg0, int arg1) {
        signlink.wavevol = arg1;
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public void method497(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field1155);
        if (this.field1259 != null) {
            System.out.println("Od-cycle:" + this.field1259.field823);
        }
        System.out.println("loop-cycle:" + field1288);
        this.field1547 += arg0;
        System.out.println("draw-cycle:" + field1161);
        System.out.println("ptype:" + this.field1548);
        System.out.println("psize:" + this.field1547);
        if (this.field1263 != null) {
            this.field1263.method42(0);
        }
        super.field9 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)Ljava/awt/Component;")
    public final java.awt.Component method11(boolean arg0) {
        if (!arg0) {
            this.method6();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field15 != null ? super.field15 : this;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLd;)Z")
    public final boolean method498(boolean arg0, Component arg1) {
        if (arg1.field77 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field77.length; ++var3) {
                int var4 = this.method506(568, var3, arg1);
                int var5 = arg1.field78[var3];
                if (arg1.field77[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field77[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field77[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            this.field1463 &= arg0;
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 234);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field1137 = Integer.parseInt(arg0[0]);
                field1138 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method447(-147);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method501(false);
                }
                if (arg0[3].equals("free")) {
                    field1139 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field1139 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(789, 532, -946);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIB)I")
    public final int method499(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = arg1 >> 7;
        int var6 = arg0 >> 7;
        int var7 = arg2;
        if (arg2 < 3 && (this.field1526[1][var5][var6] & 2) == 2) {
            var7 = arg2 + 1;
        }
        int var8 = arg1 & 127;
        int var9 = arg0 & 127;
        int var10 = (128 - var8) * this.field1524[var7][var5][var6] + this.field1524[var7][var5 + 1][var6] * var8 >> 7;
        int var11 = (128 - var8) * this.field1524[var7][var5][var6 + 1] + this.field1524[var7][var5 + 1][var6 + 1] * var8 >> 7;
        if (arg3 != 67) {
            this.method6();
        }
        return (128 - var9) * var10 + var9 * var11 >> 7;
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method500(byte arg0) {
        int var2 = (field1316.field397 >> 7) + this.field1487;
        int var3 = (field1316.field398 >> 7) + this.field1488;
        if (var2 >= 2944 && var2 < 3392 && var3 >= 3520 && var3 < 6400) {
            this.field1229 = (var3 - 3520) / 8 + 1;
        } else if (var2 >= 2944 && var2 < 3392 && var3 >= 9920 && var3 < 12800) {
            this.field1229 = (var3 - 9920) / 8 + 1;
        } else {
            this.field1229 = 0;
        }
        this.field1473 = 0;
        if (var2 >= 3328 && var2 < 3392 && var3 >= 3200 && var3 < 3264) {
            int var4 = var2 & 63;
            int var5 = var3 & 63;
            if (var4 >= 4 && var4 <= 29 && var5 >= 44 && var5 <= 58) {
                this.field1473 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 44 && var5 <= 58) {
                this.field1473 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 25 && var5 <= 39) {
                this.field1473 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 25 && var5 <= 39) {
                this.field1473 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 6 && var5 <= 20) {
                this.field1473 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 6 && var5 <= 20) {
                this.field1473 = 1;
            }
        }
        if (this.field1473 == 0 && var2 >= 3328 && var2 <= 3393 && var3 >= 3203 && var3 <= 3325) {
            this.field1473 = 2;
        }
        this.field1516 = 0;
        if (arg0 != 106) {
            this.field1142 = !this.field1142;
        }
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1516 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1516 = 1;
        }
        if (this.field1516 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1516 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public static final void method501(boolean arg0) {
        World3D.field285 = false;
        Pix3D.field623 = false;
        if (arg0) {
            field1264 = !field1264;
        }
        field1140 = false;
        World.field36 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II[B)Z")
    public final boolean method502(int arg0, int arg1, byte[] arg2) {
        if (arg1 != 0) {
            this.field1329 = null;
        }
        return arg2 == null ? true : signlink.wavesave(arg2, arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)Z")
    public final boolean method503(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1 >> 14 & 32767;
        int var7 = this.field1529.method92(this.field1146, arg4, arg3, arg1);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method416(false, arg3, field1316.field445[0], field1316.field446[0], var9, 0, 2, (byte) 8, 0, arg4, var8 + 1, 0);
            } else {
                LocType var10 = LocType.method320(var6);
                int var11;
                int var12;
                if (var9 != 0 && var9 != 2) {
                    var11 = var10.field921;
                    var12 = var10.field920;
                } else {
                    var11 = var10.field920;
                    var12 = var10.field921;
                }
                int var13 = var10.field944;
                if (var9 != 0) {
                    var13 = (var13 >> 4 - var9) + (var13 << var9 & 15);
                }
                this.method416(false, arg3, field1316.field445[0], field1316.field446[0], 0, var13, 2, (byte) 8, var12, arg4, 0, var11);
            }
            this.field1420 = super.field22;
            this.field1421 = super.field23;
            this.field1423 = 2;
            this.field1422 = 0;
            if (arg2 != 6) {
                this.field1399 = this.field1520.method291();
            }
            this.field1491.method220(this.field1553, arg0);
            this.field1491.method222(this.field1487 + arg4);
            this.field1491.method222(this.field1488 + arg3);
            this.field1491.method222(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method504(boolean arg0) {
        this.field1463 &= arg0;
        for (SpotAnimEntity var2 = (SpotAnimEntity) this.field1522.method250(); var2 != null; var2 = (SpotAnimEntity) this.field1522.method252(7)) {
            if (this.field1146 == var2.field596 && !var2.field602) {
                if (field1288 >= var2.field595) {
                    var2.method160(176, this.field1338);
                    if (var2.field602) {
                        var2.method118();
                    } else {
                        this.field1529.method73(var2.field597, 0, (byte) 6, -1, var2.field596, var2.field598, false, var2, 60, var2.field599);
                    }
                }
            } else {
                var2.method118();
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method505(boolean arg0) {
        this.field1432.method260((byte) 0);
        Pix3D.field634 = this.field1307;
        this.field1354.method204(0, 0, 373);
        if (!arg0) {
            if (this.field1348) {
                this.field1319.method206(this.field1336, 239, 40, 39475, 0);
                this.field1319.method206(this.field1217 + "*", 239, 60, 39475, 128);
            } else if (this.field1484) {
                this.field1319.method206("Enter amount:", 239, 40, 39475, 0);
                this.field1319.method206(this.field1304 + "*", 239, 60, 39475, 128);
            } else if (this.field1418 != null) {
                this.field1319.method206(this.field1418, 239, 40, 39475, 0);
                this.field1319.method206("Click to continue", 239, 60, 39475, 128);
            } else if (this.field1501 != -1) {
                this.method445(0, Component.field62[this.field1501], 0, (byte) 0, 0);
            } else if (this.field1530 != -1) {
                this.method445(0, Component.field62[this.field1530], 0, (byte) 0, 0);
            } else {
                PixFont var2 = this.field1318;
                int var3 = 0;
                Pix2D.method163(false, 0, 0, 77, 463);
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field1136[var4] != null) {
                        int var5 = this.field1134[var4];
                        int var6 = 70 - var3 * 14 + this.field1412;
                        if (var5 == 0) {
                            if (var6 > 0 && var6 < 110) {
                                var2.method209(4, this.field1136[var4], this.field1142, 0, var6);
                            }
                            ++var3;
                        }
                        if (var5 == 1) {
                            if (var6 > 0 && var6 < 110) {
                                var2.method209(4, this.field1135[var4] + ":", this.field1142, 16777215, var6);
                                var2.method209(12 + var2.method208((byte) 37, this.field1135[var4]), this.field1136[var4], this.field1142, 255, var6);
                            }
                            ++var3;
                        }
                        if (var5 == 2 && (this.field1458 == 0 || this.field1458 == 1 && this.method454(true, this.field1135[var4]))) {
                            if (var6 > 0 && var6 < 110) {
                                var2.method209(4, this.field1135[var4] + ":", this.field1142, 0, var6);
                                var2.method209(12 + var2.method208((byte) 37, this.field1135[var4]), this.field1136[var4], this.field1142, 255, var6);
                            }
                            ++var3;
                        }
                        if ((var5 == 3 || var5 == 7) && this.field1290 == 0 && (var5 == 7 || this.field1443 == 0 || this.field1443 == 1 && this.method454(true, this.field1135[var4]))) {
                            if (var6 > 0 && var6 < 110) {
                                var2.method209(4, "From " + this.field1135[var4] + ":", this.field1142, 0, var6);
                                var2.method209(12 + var2.method208((byte) 37, "From " + this.field1135[var4]), this.field1136[var4], this.field1142, 8388608, var6);
                            }
                            ++var3;
                        }
                        if (var5 == 4 && (this.field1210 == 0 || this.field1210 == 1 && this.method454(true, this.field1135[var4]))) {
                            if (var6 > 0 && var6 < 110) {
                                var2.method209(4, this.field1135[var4] + " " + this.field1136[var4], this.field1142, 8388736, var6);
                            }
                            ++var3;
                        }
                        if (var5 == 5 && this.field1290 == 0 && this.field1443 < 2) {
                            if (var6 > 0 && var6 < 110) {
                                var2.method209(4, this.field1136[var4], this.field1142, 8388608, var6);
                            }
                            ++var3;
                        }
                        if (var5 == 6 && this.field1290 == 0 && this.field1443 < 2) {
                            if (var6 > 0 && var6 < 110) {
                                var2.method209(4, "To " + this.field1135[var4] + ":", this.field1142, 0, var6);
                                var2.method209(12 + var2.method208((byte) 37, "To " + this.field1135[var4]), this.field1136[var4], this.field1142, 8388608, var6);
                            }
                            ++var3;
                        }
                        if (var5 == 8 && (this.field1210 == 0 || this.field1210 == 1 && this.method454(true, this.field1135[var4]))) {
                            if (var6 > 0 && var6 < 110) {
                                var2.method209(4, this.field1135[var4] + " " + this.field1136[var4], this.field1142, 13350793, var6);
                            }
                            ++var3;
                        }
                    }
                }
                Pix2D.method162(705);
                this.field1456 = var3 * 14 + 7;
                if (this.field1456 < 78) {
                    this.field1456 = 78;
                }
                this.method423(this.field1456 - this.field1412 - 77, (byte) -34, this.field1456, 463, 0, 77);
                var2.method209(4, JString.method300(this.field1451, 1) + ":", this.field1142, 0, 90);
                var2.method209(6 + var2.method208((byte) 37, this.field1451 + ": "), this.field1507 + "*", this.field1142, 255, 90);
                Pix2D.method167(0, (byte) 9, 0, 479, 77);
            }
            if (this.field1435 && this.field1466 == 2) {
                this.method492(-45712);
            }
            this.field1432.method261(22, -49767, super.field12, 375);
            this.field1431.method260((byte) 0);
            Pix3D.field634 = this.field1309;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILd;)I")
    public final int method506(int arg0, int arg1, Component arg2) {
        if (arg0 <= 0) {
            this.field1442 = 76;
        }
        if (arg2.field76 != null && arg1 < arg2.field76.length) {
            try {
                int[] var4 = arg2.field76[arg1];
                int var5 = 0;
                int var6 = 0;
                while (true) {
                    int var7 = var4[var6++];
                    if (var7 == 0) {
                        return var5;
                    }
                    if (var7 == 1) {
                        var5 += this.field1166[var4[var6++]];
                    }
                    if (var7 == 2) {
                        var5 += this.field1154[var4[var6++]];
                    }
                    if (var7 == 3) {
                        var5 += this.field1302[var4[var6++]];
                    }
                    if (var7 == 4) {
                        Component var8 = Component.field62[var4[var6++]];
                        int var9 = var4[var6++] + 1;
                        for (int var10 = 0; var10 < var8.field63.length; ++var10) {
                            if (var8.field63[var10] == var9) {
                                var5 += var8.field64[var10];
                            }
                        }
                    }
                    if (var7 == 5) {
                        var5 += this.field1269[var4[var6++]];
                    }
                    if (var7 == 6) {
                        var5 += field1178[this.field1154[var4[var6++]] - 1];
                    }
                    if (var7 == 7) {
                        var5 += this.field1269[var4[var6++]] * 100 / 46875;
                    }
                    if (var7 == 8) {
                        var5 += field1316.field459;
                    }
                    if (var7 == 9) {
                        for (int var11 = 0; var11 < 19; ++var11) {
                            if (var11 == 18) {
                                var11 = 20;
                            }
                            var5 += this.field1154[var11];
                        }
                    }
                    if (var7 == 10) {
                        Component var12 = Component.field62[var4[var6++]];
                        int var13 = var4[var6++] + 1;
                        for (int var14 = 0; var14 < var12.field63.length; ++var14) {
                            if (var12.field63[var14] == var13) {
                                var5 += 999999999;
                                break;
                            }
                        }
                    }
                    if (var7 == 11) {
                        var5 += this.field1266;
                    }
                    if (var7 == 12) {
                        var5 += this.field1433;
                    }
                    if (var7 == 13) {
                        int var15 = this.field1269[var4[var6++]];
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

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method507(byte arg0) {
        if (arg0 == 5) {
            boolean var2 = false;
            if (this.field1298 == 0) {
                int var3 = super.field21;
                if (this.field1174 == 1 && super.field22 >= 520 && super.field23 >= 165 && super.field22 <= 788 && super.field23 <= 230) {
                    var3 = 0;
                }
                if (this.field1435) {
                    if (var3 != 1) {
                        int var4 = super.field19;
                        int var5 = super.field20;
                        if (this.field1466 == 0) {
                            var4 -= 8;
                            var5 -= 11;
                        }
                        if (this.field1466 == 1) {
                            var4 -= 562;
                            var5 -= 231;
                        }
                        if (this.field1466 == 2) {
                            var4 -= 22;
                            var5 -= 375;
                        }
                        if (var4 < this.field1467 - 10 || var4 > this.field1469 + this.field1467 + 10 || var5 < this.field1468 - 10 || var5 > this.field1470 + this.field1468 + 10) {
                            this.field1435 = false;
                            if (this.field1466 == 1) {
                                this.field1527 = true;
                            }
                            if (this.field1466 == 2) {
                                this.field1417 = true;
                            }
                        }
                    }
                    if (var3 == 1) {
                        int var6 = this.field1467;
                        int var7 = this.field1468;
                        int var8 = this.field1469;
                        int var9 = super.field22;
                        int var10 = super.field23;
                        if (this.field1466 == 0) {
                            var9 -= 8;
                            var10 -= 11;
                        }
                        if (this.field1466 == 1) {
                            var9 -= 562;
                            var10 -= 231;
                        }
                        if (this.field1466 == 2) {
                            var9 -= 22;
                            var10 -= 375;
                        }
                        int var11 = -1;
                        for (int var12 = 0; var12 < this.field1502; ++var12) {
                            int var13 = (this.field1502 - 1 - var12) * 15 + var7 + 31;
                            if (var9 > var6 && var9 < var6 + var8 && var10 > var13 - 13 && var10 < var13 + 3) {
                                var11 = var12;
                            }
                        }
                        if (var11 != -1) {
                            this.method464(var11, 2);
                        }
                        this.field1435 = false;
                        if (this.field1466 == 1) {
                            this.field1527 = true;
                        }
                        if (this.field1466 == 2) {
                            this.field1417 = true;
                            return;
                        }
                    }
                } else {
                    if (var3 == 1 && this.field1502 > 0) {
                        int var14 = this.field1378[this.field1502 - 1];
                        if (var14 == 602 || var14 == 596 || var14 == 22 || var14 == 892 || var14 == 415 || var14 == 405 || var14 == 38 || var14 == 422 || var14 == 478 || var14 == 347 || var14 == 188) {
                            int var15 = this.field1376[this.field1502 - 1];
                            int var16 = this.field1377[this.field1502 - 1];
                            Component var17 = Component.field62[var16];
                            if (var17.field88) {
                                this.field1132 = false;
                                this.field1339 = 0;
                                this.field1296 = var16;
                                this.field1297 = var15;
                                this.field1298 = 2;
                                this.field1299 = super.field22;
                                this.field1300 = super.field23;
                                if (Component.field62[var16].field68 == this.field1561) {
                                    this.field1298 = 1;
                                }
                                if (Component.field62[var16].field68 == this.field1501) {
                                    this.field1298 = 3;
                                }
                                return;
                            }
                        }
                    }
                    if (var3 == 1 && (this.field1454 == 1 || this.method537((byte) 78, this.field1502 - 1)) && this.field1502 > 2) {
                        var3 = 2;
                    }
                    if (var3 == 1 && this.field1502 > 0) {
                        this.method464(this.field1502 - 1, 2);
                    }
                    if (var3 != 2 || this.field1502 <= 0) {
                        return;
                    }
                    this.method475(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I[BZ)V")
    public final void method508(int arg0, byte[] arg1, boolean arg2) {
        if (this.field1188 != arg0) {
            this.field1147 = !this.field1147;
        }
        signlink.midifade = arg2 ? 1 : 0;
        signlink.midisave(arg1, arg1.length);
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(B)V")
    public final void method509(byte arg0) {
        if (field1316.field397 >> 7 == this.field1371 && field1316.field398 >> 7 == this.field1372) {
            this.field1371 = 0;
        }
        for (int var2 = -1; var2 < this.field1495; ++var2) {
            PlayerEntity var4;
            int var5;
            if (var2 == -1) {
                var4 = field1316;
                var5 = this.field1493 << 14;
            } else {
                var4 = this.field1494[this.field1496[var2]];
                var5 = this.field1496[var2] << 14;
            }
            if (var4 != null && var4.method124(0)) {
                var4.field472 = false;
                if ((field1140 && this.field1495 > 50 || this.field1495 > 200) && var2 != -1 && var4.field421 == var4.field402) {
                    var4.field472 = true;
                }
                int var6 = var4.field397 >> 7;
                int var7 = var4.field398 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field467 != null && field1288 >= var4.field462 && field1288 < var4.field463) {
                        var4.field472 = false;
                        var4.field461 = this.method499(var4.field398, var4.field397, this.field1146, (byte) 67);
                        this.field1529.method74(var4, var4.field398, var4.field470, var4.field468, var4.field471, this.field1146, var4.field397, var4.field461, var5, var4.field399, 60, var4.field469, 7);
                    } else {
                        if ((var4.field397 & 127) == 64 && (var4.field398 & 127) == 64) {
                            if (this.field1164[var6][var7] == this.field1341) {
                                continue;
                            }
                            this.field1164[var6][var7] = this.field1341;
                        }
                        var4.field461 = this.method499(var4.field398, var4.field397, this.field1146, (byte) 67);
                        this.field1529.method73(var4.field397, var4.field399, (byte) 6, var5, this.field1146, var4.field398, var4.field400, var4, 60, var4.field461);
                    }
                }
            }
        }
        if (arg0 == 2) {
            boolean var3 = false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZI)V")
    public final void method510(int arg0, boolean arg1, int arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field1136[var5] != null) {
                int var6 = this.field1134[var5];
                int var7 = 70 - var4 * 14 + this.field1412 + 4;
                if (var7 < -20) {
                    break;
                }
                if (var6 == 0) {
                    ++var4;
                }
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1458 == 0 || this.field1458 == 1 && this.method454(true, this.field1135[var5]))) {
                    if (arg2 > var7 - 14 && arg2 <= var7 && !this.field1135[var5].equals(field1316.field453)) {
                        if (this.field1450) {
                            this.field1444[this.field1502] = "Report abuse @whi@" + this.field1135[var5];
                            this.field1378[this.field1502] = 34;
                            ++this.field1502;
                        }
                        this.field1444[this.field1502] = "Add ignore @whi@" + this.field1135[var5];
                        this.field1378[this.field1502] = 436;
                        ++this.field1502;
                        this.field1444[this.field1502] = "Add friend @whi@" + this.field1135[var5];
                        this.field1378[this.field1502] = 406;
                        ++this.field1502;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field1290 == 0 && (var6 == 7 || this.field1443 == 0 || this.field1443 == 1 && this.method454(true, this.field1135[var5]))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        if (this.field1450) {
                            this.field1444[this.field1502] = "Report abuse @whi@" + this.field1135[var5];
                            this.field1378[this.field1502] = 34;
                            ++this.field1502;
                        }
                        this.field1444[this.field1502] = "Add ignore @whi@" + this.field1135[var5];
                        this.field1378[this.field1502] = 436;
                        ++this.field1502;
                        this.field1444[this.field1502] = "Add friend @whi@" + this.field1135[var5];
                        this.field1378[this.field1502] = 406;
                        ++this.field1502;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field1210 == 0 || this.field1210 == 1 && this.method454(true, this.field1135[var5]))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field1444[this.field1502] = "Accept trade @whi@" + this.field1135[var5];
                        this.field1378[this.field1502] = 903;
                        ++this.field1502;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field1290 == 0 && this.field1443 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field1210 == 0 || this.field1210 == 1 && this.method454(true, this.field1135[var5]))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field1444[this.field1502] = "Accept duel @whi@" + this.field1135[var5];
                        this.field1378[this.field1502] = 363;
                        ++this.field1502;
                    }
                    ++var4;
                }
            }
        }
        if (!arg1) {
            field1532 = 466;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZILmb;)V")
    private final void method511(boolean arg0, int arg1, Packet arg2) {
        while (true) {
            if (arg2.field695 + 10 < arg1 * 8) {
                int var4 = arg2.method242(11, false);
                if (var4 != 2047) {
                    if (this.field1494[var4] == null) {
                        this.field1494[var4] = new PlayerEntity();
                        if (this.field1499[var4] != null) {
                            this.field1494[var4].method126(false, this.field1499[var4]);
                        }
                    }
                    this.field1496[this.field1495++] = var4;
                    PlayerEntity var5 = this.field1494[var4];
                    var5.field441 = field1288;
                    int var6 = arg2.method242(5, false);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg2.method242(5, false);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg2.method242(1, false);
                    var5.method122(var8 == 1, false, field1316.field446[0] + var7, field1316.field445[0] + var6);
                    int var9 = arg2.method242(1, false);
                    if (var9 == 1) {
                        this.field1498[this.field1497++] = var4;
                    }
                    continue;
                }
            }
            arg2.method243(this.field1321);
            if (arg0) {
                this.field1548 = -1;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)Z")
    public final boolean method512(int arg0) {
        if (arg0 != 0) {
            this.field1548 = -1;
        }
        if (this.field1263 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1263.method39();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1548 == -1) {
                    this.field1263.method40(this.field1426.field693, 0, 1);
                    this.field1548 = this.field1426.field693[0] & 255;
                    if (this.field1520 != null) {
                        this.field1548 = this.field1548 - this.field1520.method291() & 255;
                    }
                    this.field1547 = Protocol.field1022[this.field1548];
                    --var2;
                }
                if (this.field1547 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1263.method40(this.field1426.field693, 0, 1);
                    this.field1547 = this.field1426.field693[0] & 255;
                    --var2;
                }
                if (this.field1547 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1263.method40(this.field1426.field693, 0, 2);
                    this.field1426.field694 = 0;
                    this.field1547 = this.field1426.method233();
                    var2 -= 2;
                }
                if (var2 < this.field1547) {
                    return false;
                }
                this.field1426.field694 = 0;
                this.field1263.method40(this.field1426.field693, 0, this.field1547);
                this.field1549 = 0;
                this.field1447 = this.field1446;
                this.field1446 = this.field1445;
                this.field1445 = this.field1548;
                if (this.field1548 == 11) {
                    this.field1286 = this.field1426.method233() * 30;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 64) {
                    this.field1461 = this.field1547 / 8;
                    for (int var3 = 0; var3 < this.field1461; ++var3) {
                        this.field1171[var3] = this.field1426.method237(-960);
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 18) {
                    this.method418(2);
                    this.field1548 = -1;
                    return false;
                }
                if (this.field1548 == 120) {
                    int var4 = this.field1426.method233();
                    int var5 = this.field1426.method233();
                    int var6 = var5 >> 10 & 31;
                    int var7 = var5 >> 5 & 31;
                    int var8 = var5 & 31;
                    Component.field62[var4].field103 = (var8 << 3) + (var6 << 19) + (var7 << 11);
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 115) {
                    if (this.field1390 != -1) {
                        this.field1390 = -1;
                        this.field1527 = true;
                        this.field1159 = true;
                    }
                    if (this.field1501 != -1) {
                        this.field1501 = -1;
                        this.field1417 = true;
                    }
                    if (this.field1484) {
                        this.field1484 = false;
                        this.field1417 = true;
                    }
                    this.field1561 = -1;
                    this.field1185 = false;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 135) {
                    int var9 = this.field1426.method233();
                    byte var10 = this.field1426.method232();
                    this.field1531[var9] = var10;
                    if (this.field1269[var9] != var10) {
                        this.field1269[var9] = var10;
                        this.method451(var9, (byte) 4);
                        this.field1527 = true;
                        if (this.field1530 != -1) {
                            this.field1417 = true;
                        }
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 211) {
                    int var11 = this.field1426.method233();
                    int var12 = this.field1426.method233();
                    Component.field62[var11].field108 = 1;
                    Component.field62[var11].field109 = var12;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 78) {
                    int var13 = this.field1426.method233();
                    int var14 = this.field1426.method233();
                    int var15 = this.field1426.method233();
                    ObjType var16 = ObjType.method335(var14);
                    Component.field62[var13].field108 = 4;
                    Component.field62[var13].field109 = var14;
                    Component.field62[var13].field115 = var16.field991;
                    Component.field62[var13].field116 = var16.field992;
                    Component.field62[var13].field114 = var16.field990 * 100 / var15;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 46) {
                    int var17 = this.field1426.method233();
                    this.method443(var17, 47034);
                    if (this.field1390 != -1) {
                        this.field1390 = -1;
                        this.field1527 = true;
                        this.field1159 = true;
                    }
                    this.field1501 = var17;
                    this.field1417 = true;
                    this.field1561 = -1;
                    this.field1185 = false;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 8) {
                    this.field1428 = false;
                    for (int var18 = 0; var18 < 5; ++var18) {
                        this.field1189[var18] = false;
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 35) {
                    this.field1458 = this.field1426.method231();
                    this.field1443 = this.field1426.method231();
                    this.field1210 = this.field1426.method231();
                    this.field1337 = true;
                    this.field1417 = true;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 3) {
                    int var19 = this.field1426.method233();
                    int var20 = this.field1426.method233();
                    if (this.field1413 == var19 && this.field1414 == var20 && this.field1196 == 2) {
                        this.field1548 = -1;
                        return true;
                    }
                    this.field1413 = var19;
                    this.field1414 = var20;
                    this.field1487 = (this.field1413 - 6) * 8;
                    this.field1488 = (this.field1414 - 6) * 8;
                    this.field1462 = false;
                    if ((this.field1413 / 8 == 48 || this.field1413 / 8 == 49) && this.field1414 / 8 == 48) {
                        this.field1462 = true;
                    }
                    if (this.field1413 / 8 == 48 && this.field1414 / 8 == 148) {
                        this.field1462 = true;
                    }
                    this.field1196 = 1;
                    this.field1431.method260((byte) 0);
                    this.field1318.method206("Loading - please wait.", 257, 151, 39475, 0);
                    this.field1318.method206("Loading - please wait.", 256, 150, 39475, 16777215);
                    this.field1431.method261(8, -49767, super.field12, 11);
                    int var21 = 0;
                    for (int var22 = (this.field1413 - 6) / 8; var22 <= (this.field1413 + 6) / 8; ++var22) {
                        for (int var23 = (this.field1414 - 6) / 8; var23 <= (this.field1414 + 6) / 8; ++var23) {
                            ++var21;
                        }
                    }
                    this.field1523 = new byte[var21][];
                    this.field1396 = new byte[var21][];
                    this.field1503 = new int[var21];
                    this.field1504 = new int[var21];
                    this.field1505 = new int[var21];
                    int var24 = 0;
                    for (int var25 = (this.field1413 - 6) / 8; var25 <= (this.field1413 + 6) / 8; ++var25) {
                        for (int var26 = (this.field1414 - 6) / 8; var26 <= (this.field1414 + 6) / 8; ++var26) {
                            this.field1503[var24] = (var25 << 8) + var26;
                            if (!this.field1462 || var26 != 49 && var26 != 149 && var26 != 147 && var25 != 50 && (var25 != 49 || var26 != 47)) {
                                int var27 = this.field1504[var24] = this.field1259.method276(7, var25, var26, 0);
                                if (var27 != -1) {
                                    this.field1259.method279(3, var27);
                                }
                                int var28 = this.field1505[var24] = this.field1259.method276(7, var25, var26, 1);
                                if (var28 != -1) {
                                    this.field1259.method279(3, var28);
                                }
                                ++var24;
                            } else {
                                this.field1504[var24] = -1;
                                this.field1505[var24] = -1;
                                ++var24;
                            }
                        }
                    }
                    int var29 = this.field1487 - this.field1489;
                    int var30 = this.field1488 - this.field1490;
                    this.field1489 = this.field1487;
                    this.field1490 = this.field1488;
                    for (int var31 = 0; var31 < 8192; ++var31) {
                        NpcEntity var32 = this.field1230[var31];
                        if (var32 != null) {
                            for (int var33 = 0; var33 < 10; ++var33) {
                                var32.field445[var33] -= var29;
                                var32.field446[var33] -= var30;
                            }
                            var32.field397 -= var29 * 128;
                            var32.field398 -= var30 * 128;
                        }
                    }
                    for (int var34 = 0; var34 < this.field1492; ++var34) {
                        PlayerEntity var35 = this.field1494[var34];
                        if (var35 != null) {
                            for (int var36 = 0; var36 < 10; ++var36) {
                                var35.field445[var36] -= var29;
                                var35.field446[var36] -= var30;
                            }
                            var35.field397 -= var29 * 128;
                            var35.field398 -= var30 * 128;
                        }
                    }
                    byte var37 = 0;
                    byte var38 = 104;
                    byte var39 = 1;
                    if (var29 < 0) {
                        var37 = 103;
                        var38 = -1;
                        var39 = -1;
                    }
                    byte var40 = 0;
                    byte var41 = 104;
                    byte var42 = 1;
                    if (var30 < 0) {
                        var40 = 103;
                        var41 = -1;
                        var42 = -1;
                    }
                    for (int var43 = var37; var38 != var43; var43 += var39) {
                        for (int var44 = var40; var41 != var44; var44 += var42) {
                            int var45 = var29 + var43;
                            int var46 = var30 + var44;
                            for (int var47 = 0; var47 < 4; ++var47) {
                                if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                                    this.field1329[var47][var43][var44] = this.field1329[var47][var45][var46];
                                } else {
                                    this.field1329[var47][var43][var44] = null;
                                }
                            }
                        }
                    }
                    for (LocSpawned var48 = (LocSpawned) this.field1163.method250(); var48 != null; var48 = (LocSpawned) this.field1163.method252(7)) {
                        var48.field713 -= var29;
                        var48.field714 -= var30;
                        if (var48.field713 < 0 || var48.field714 < 0 || var48.field713 >= 104 || var48.field714 >= 104) {
                            var48.method118();
                        }
                    }
                    if (this.field1371 != 0) {
                        this.field1371 -= var29;
                        this.field1372 -= var30;
                    }
                    this.field1428 = false;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 25) {
                    InputTracking.method43(true);
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 94) {
                    this.field1415 = this.field1426.method231();
                    if (this.field1540 == this.field1415) {
                        if (this.field1415 == 3) {
                            this.field1540 = 1;
                        } else {
                            this.field1540 = 3;
                        }
                        this.field1527 = true;
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 246 || this.field1548 == 248 || this.field1548 == 131 || this.field1548 == 215 || this.field1548 == 67 || this.field1548 == 247 || this.field1548 == 167 || this.field1548 == 230 || this.field1548 == 31 || this.field1548 == 112) {
                    this.method427(this.field1548, this.field1426, true);
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 146) {
                    int var49 = this.field1426.method233();
                    int var50 = this.field1426.method233();
                    Component.field62[var49].field108 = 2;
                    Component.field62[var49].field109 = var50;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 159) {
                    this.field1527 = true;
                    int var51 = this.field1426.method231();
                    int var52 = this.field1426.method236();
                    int var53 = this.field1426.method231();
                    this.field1302[var51] = var52;
                    this.field1166[var51] = var53;
                    this.field1154[var51] = 1;
                    for (int var54 = 0; var54 < 98; ++var54) {
                        if (var52 >= field1178[var54]) {
                            this.field1154[var51] = var54 + 2;
                        }
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 15) {
                    int var55 = this.field1426.method233();
                    int var56 = this.field1426.method231();
                    if (var55 == 65535) {
                        var55 = -1;
                    }
                    this.field1369[var56] = var55;
                    this.field1527 = true;
                    this.field1159 = true;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 202) {
                    this.field1428 = true;
                    this.field1233 = this.field1426.method231();
                    this.field1234 = this.field1426.method231();
                    this.field1235 = this.field1426.method233();
                    this.field1236 = this.field1426.method231();
                    this.field1237 = this.field1426.method231();
                    if (this.field1237 >= 100) {
                        this.field1219 = this.field1233 * 128 + 64;
                        this.field1221 = this.field1234 * 128 + 64;
                        this.field1220 = this.method499(this.field1234, this.field1233, this.field1146, (byte) 67) - this.field1235;
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 107) {
                    int var57 = this.field1426.method233();
                    this.method443(var57, 47034);
                    if (this.field1501 != -1) {
                        this.field1501 = -1;
                        this.field1417 = true;
                    }
                    if (this.field1484) {
                        this.field1484 = false;
                        this.field1417 = true;
                    }
                    this.field1390 = var57;
                    this.field1527 = true;
                    this.field1159 = true;
                    this.field1561 = -1;
                    this.field1185 = false;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 250) {
                    this.field1436 = this.field1426.method231();
                    this.field1437 = this.field1426.method231();
                    while (this.field1426.field694 < this.field1547) {
                        int var58 = this.field1426.method231();
                        this.method427(var58, this.field1426, true);
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 2) {
                    long var59 = this.field1426.method237(-960);
                    int var61 = this.field1426.method231();
                    String var62 = JString.method300(JString.method297(9, var59), 1);
                    for (int var63 = 0; var63 < this.field1251; ++var63) {
                        if (this.field1345[var63] == var59) {
                            if (this.field1268[var63] != var61) {
                                this.field1268[var63] = var61;
                                this.field1527 = true;
                                if (var61 > 0) {
                                    this.method458(var62 + " has logged in.", 5, "", true);
                                }
                                if (var61 == 0) {
                                    this.method458(var62 + " has logged out.", 5, "", true);
                                }
                            }
                            var62 = null;
                            break;
                        }
                    }
                    if (var62 != null && this.field1251 < 100) {
                        this.field1345[this.field1251] = var59;
                        this.field1143[this.field1251] = var62;
                        this.field1268[this.field1251] = var61;
                        ++this.field1251;
                        this.field1527 = true;
                    }
                    boolean var64 = false;
                    while (!var64) {
                        var64 = true;
                        for (int var65 = 0; var65 < this.field1251 - 1; ++var65) {
                            if (this.field1268[var65] != field1137 && this.field1268[var65 + 1] == field1137 || this.field1268[var65] == 0 && this.field1268[var65 + 1] != 0) {
                                int var66 = this.field1268[var65];
                                this.field1268[var65] = this.field1268[var65 + 1];
                                this.field1268[var65 + 1] = var66;
                                String var67 = this.field1143[var65];
                                this.field1143[var65] = this.field1143[var65 + 1];
                                this.field1143[var65 + 1] = var67;
                                long var68 = this.field1345[var65];
                                this.field1345[var65] = this.field1345[var65 + 1];
                                this.field1345[var65 + 1] = var68;
                                this.field1527 = true;
                                var64 = false;
                            }
                        }
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 130) {
                    this.method415(this.field1547, this.field1426, false);
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 13) {
                    this.field1540 = this.field1426.method231();
                    this.field1527 = true;
                    this.field1159 = true;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 173) {
                    int var70 = this.field1426.method233();
                    boolean var71 = this.field1426.method231() == 1;
                    Component.field62[var70].field82 = var71;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 65) {
                    this.field1371 = 0;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 153) {
                    for (int var72 = 0; var72 < this.field1494.length; ++var72) {
                        if (this.field1494[var72] != null) {
                            this.field1494[var72].field424 = -1;
                        }
                    }
                    for (int var73 = 0; var73 < this.field1230.length; ++var73) {
                        if (this.field1230[var73] != null) {
                            this.field1230[var73].field424 = -1;
                        }
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 22) {
                    this.field1348 = false;
                    this.field1484 = true;
                    this.field1304 = "";
                    this.field1417 = true;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 186) {
                    if (this.field1540 == 12) {
                        this.field1527 = true;
                    }
                    this.field1266 = this.field1426.method231();
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 182) {
                    this.field1527 = true;
                    int var74 = this.field1426.method233();
                    Component var75 = Component.field62[var74];
                    while (this.field1426.field694 < this.field1547) {
                        int var76 = this.field1426.method231();
                        int var77 = this.field1426.method233();
                        int var78 = this.field1426.method231();
                        if (var78 == 255) {
                            var78 = this.field1426.method236();
                        }
                        if (var76 >= 0 && var76 < var75.field63.length) {
                            var75.field63[var76] = var77;
                            var75.field64[var76] = var78;
                        }
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 200) {
                    if (this.field1540 == 12) {
                        this.field1527 = true;
                    }
                    this.field1433 = this.field1426.method234();
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 21) {
                    int var79 = this.field1426.method233();
                    Component.field62[var79].field108 = 3;
                    Component.field62[var79].field109 = (field1316.field457[8] << 6) + (field1316.field457[0] << 12) + (field1316.field458[0] << 24) + (field1316.field458[4] << 18) + field1316.field457[11];
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 183) {
                    int var80 = this.field1426.method233();
                    int var81 = this.field1426.method233();
                    Component.field62[var80].field112 = var81;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 140) {
                    int var82 = this.field1426.method233();
                    int var83 = this.field1426.method233();
                    if (this.field1501 != -1) {
                        this.field1501 = -1;
                        this.field1417 = true;
                    }
                    if (this.field1484) {
                        this.field1484 = false;
                        this.field1417 = true;
                    }
                    this.field1561 = var82;
                    this.field1390 = var83;
                    this.field1527 = true;
                    this.field1159 = true;
                    this.field1185 = false;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 178) {
                    int var84 = this.field1426.method233();
                    if (var84 == 65535) {
                        var84 = -1;
                    }
                    if (this.field1186 != var84 && this.field1398 && !field1140) {
                        this.field1190 = var84;
                        this.field1191 = true;
                        this.field1259.method279(2, this.field1190);
                    }
                    this.field1186 = var84;
                    this.field1539 = 0;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 75) {
                    int var85 = this.field1426.method233();
                    int var86 = this.field1426.method233();
                    if (this.field1398 && !field1140) {
                        this.field1190 = var85;
                        this.field1191 = false;
                        this.field1259.method279(2, this.field1190);
                        this.field1539 = var86;
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 157) {
                    int var87 = this.field1426.method233();
                    Component var88 = Component.field62[var87];
                    for (int var89 = 0; var89 < var88.field63.length; ++var89) {
                        var88.field63[var89] = -1;
                        var88.field63[var89] = 0;
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 155) {
                    int var90 = this.field1426.method233();
                    int var91 = this.field1426.method234();
                    int var92 = this.field1426.method234();
                    Component var93 = Component.field62[var90];
                    var93.field74 = var91;
                    var93.field75 = var92;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 24) {
                    this.field1367 = this.field1426.method236();
                    this.field1509 = this.field1426.method233();
                    this.field1368 = this.field1426.method231();
                    this.field1474 = this.field1426.method233();
                    if (this.field1367 != 0 && this.field1561 == -1) {
                        signlink.dnslookup(JString.method299(this.field1367, 0));
                        this.method465(-968);
                        short var94 = 650;
                        if (this.field1368 != 201) {
                            var94 = 655;
                        }
                        this.field1506 = "";
                        this.field1448 = false;
                        for (int var95 = 0; var95 < Component.field62.length; ++var95) {
                            if (Component.field62[var95] != null && Component.field62[var95].field71 == var94) {
                                this.field1561 = Component.field62[var95].field68;
                                break;
                            }
                        }
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 203) {
                    this.field1527 = true;
                    int var96 = this.field1426.method233();
                    Component var97 = Component.field62[var96];
                    int var98 = this.field1426.method231();
                    for (int var99 = 0; var99 < var98; ++var99) {
                        var97.field63[var99] = this.field1426.method233();
                        int var100 = this.field1426.method231();
                        if (var100 == 255) {
                            var100 = this.field1426.method236();
                        }
                        var97.field64[var99] = var100;
                    }
                    for (int var101 = var98; var101 < var97.field63.length; ++var101) {
                        var97.field63[var101] = 0;
                        var97.field64[var101] = 0;
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 181) {
                    int var102 = this.field1426.method233();
                    int var103 = this.field1426.method236();
                    this.field1531[var102] = var103;
                    if (this.field1269[var102] != var103) {
                        this.field1269[var102] = var103;
                        this.method451(var102, (byte) 4);
                        this.field1527 = true;
                        if (this.field1530 != -1) {
                            this.field1417 = true;
                        }
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 110) {
                    Packet var104 = InputTracking.method46((byte) 106);
                    if (var104 != null) {
                        this.field1491.method220(this.field1553, 54);
                        this.field1491.method222(var104.field694);
                        this.field1491.method229(var104.field693, var104.field694, 0, false);
                        var104.method219(0);
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 0) {
                    this.field1428 = true;
                    this.field1274 = this.field1426.method231();
                    this.field1275 = this.field1426.method231();
                    this.field1276 = this.field1426.method233();
                    this.field1277 = this.field1426.method231();
                    this.field1278 = this.field1426.method231();
                    if (this.field1278 >= 100) {
                        int var105 = this.field1274 * 128 + 64;
                        int var106 = this.field1275 * 128 + 64;
                        int var107 = this.method499(this.field1275, this.field1274, this.field1146, (byte) 67) - this.field1276;
                        int var108 = var105 - this.field1219;
                        int var109 = var107 - this.field1220;
                        int var110 = var106 - this.field1221;
                        int var111 = (int) Math.sqrt((double) (var108 * var108 + var110 * var110));
                        this.field1222 = (int) (Math.atan2((double) var109, (double) var111) * 325.949D) & 2047;
                        this.field1223 = (int) (Math.atan2((double) var108, (double) var110) * -325.949D) & 2047;
                        if (this.field1222 < 128) {
                            this.field1222 = 128;
                        }
                        if (this.field1222 > 383) {
                            this.field1222 = 383;
                        }
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 168) {
                    int var112 = this.field1426.method234();
                    this.field1530 = var112;
                    this.field1417 = true;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 98) {
                    int var113 = this.field1426.method233();
                    String var114 = this.field1426.method238();
                    Component.field62[var113].field101 = var114;
                    if (this.field1369[this.field1540] == Component.field62[var113].field68) {
                        this.field1527 = true;
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 82) {
                    long var115 = this.field1426.method237(-960);
                    int var117 = this.field1426.method236();
                    int var118 = this.field1426.method231();
                    boolean var119 = false;
                    for (int var120 = 0; var120 < 100; ++var120) {
                        if (this.field1518[var120] == var117) {
                            var119 = true;
                            break;
                        }
                    }
                    if (var118 <= 1) {
                        for (int var121 = 0; var121 < this.field1461; ++var121) {
                            if (this.field1171[var121] == var115) {
                                var119 = true;
                                break;
                            }
                        }
                    }
                    if (!var119 && this.field1516 == 0) {
                        try {
                            this.field1518[this.field1481] = var117;
                            this.field1481 = (this.field1481 + 1) % 100;
                            String var122 = WordPack.method303(this.field1547 - 13, this.field1426, -19777);
                            String var123 = WordFilter.method386(var122, 713);
                            if (var118 > 1) {
                                this.method458(var123, 7, JString.method300(JString.method297(9, var115), 1), true);
                            } else {
                                this.method458(var123, 3, JString.method300(JString.method297(9, var115), 1), true);
                            }
                        } catch (Exception var151) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 144) {
                    this.field1436 = this.field1426.method231();
                    this.field1437 = this.field1426.method231();
                    for (int var125 = this.field1436; var125 < this.field1436 + 8; ++var125) {
                        for (int var126 = this.field1437; var126 < this.field1437 + 8; ++var126) {
                            if (this.field1329[this.field1146][var125][var126] != null) {
                                this.field1329[this.field1146][var125][var126] = null;
                                this.method424(var125, var126);
                            }
                        }
                    }
                    for (LocSpawned var127 = (LocSpawned) this.field1163.method250(); var127 != null; var127 = (LocSpawned) this.field1163.method252(7)) {
                        if (var127.field713 >= this.field1436 && var127.field713 < this.field1436 + 8 && var127.field714 >= this.field1437 && var127.field714 < this.field1437 + 8 && this.field1146 == var127.field711) {
                            var127.field722 = 0;
                        }
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 254) {
                    this.method485(this.field1547, 9, this.field1426);
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 90) {
                    this.field1436 = this.field1426.method231();
                    this.field1437 = this.field1426.method231();
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 96) {
                    int var128 = this.field1426.method233();
                    int var129 = this.field1426.method231();
                    int var130 = this.field1426.method233();
                    if (this.field1457 && !field1140 && this.field1173 < 50) {
                        this.field1370[this.field1173] = var128;
                        this.field1475[this.field1173] = var129;
                        this.field1152[this.field1173] = Wave.field874[var128] + var130;
                        ++this.field1173;
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 36) {
                    int var131 = this.field1426.method233();
                    this.method443(var131, 47034);
                    if (this.field1390 != -1) {
                        this.field1390 = -1;
                        this.field1527 = true;
                        this.field1159 = true;
                    }
                    if (this.field1501 != -1) {
                        this.field1501 = -1;
                        this.field1417 = true;
                    }
                    if (this.field1484) {
                        this.field1484 = false;
                        this.field1417 = true;
                    }
                    this.field1561 = var131;
                    this.field1185 = false;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 199) {
                    this.field1486 = this.field1426.method231();
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 118) {
                    int var132 = this.field1426.method231();
                    int var133 = this.field1426.method231();
                    int var134 = this.field1426.method231();
                    int var135 = this.field1426.method231();
                    this.field1189[var132] = true;
                    this.field1325[var132] = var133;
                    this.field1424[var132] = var134;
                    this.field1207[var132] = var135;
                    this.field1328[var132] = 0;
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 177) {
                    String var136 = this.field1426.method238();
                    if (var136.endsWith(":tradereq:")) {
                        String var137 = var136.substring(0, var136.indexOf(":"));
                        long var138 = JString.method296(var137);
                        boolean var140 = false;
                        for (int var141 = 0; var141 < this.field1461; ++var141) {
                            if (this.field1171[var141] == var138) {
                                var140 = true;
                                break;
                            }
                        }
                        if (!var140 && this.field1516 == 0) {
                            this.method458("wishes to trade with you.", 4, var137, true);
                        }
                    } else if (!var136.endsWith(":duelreq:")) {
                        this.method458(var136, 0, "", true);
                    } else {
                        String var142 = var136.substring(0, var136.indexOf(":"));
                        long var143 = JString.method296(var142);
                        boolean var145 = false;
                        for (int var146 = 0; var146 < this.field1461; ++var146) {
                            if (this.field1171[var146] == var143) {
                                var145 = true;
                                break;
                            }
                        }
                        if (!var145 && this.field1516 == 0) {
                            this.method458("wishes to duel with you.", 8, var142, true);
                        }
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 228) {
                    this.field1419 = this.field1426.method231();
                    if (this.field1419 == 1) {
                        this.field1289 = this.field1426.method233();
                    }
                    if (this.field1419 >= 2 && this.field1419 <= 6) {
                        if (this.field1419 == 2) {
                            this.field1410 = 64;
                            this.field1411 = 64;
                        }
                        if (this.field1419 == 3) {
                            this.field1410 = 0;
                            this.field1411 = 64;
                        }
                        if (this.field1419 == 4) {
                            this.field1410 = 128;
                            this.field1411 = 64;
                        }
                        if (this.field1419 == 5) {
                            this.field1410 = 64;
                            this.field1411 = 0;
                        }
                        if (this.field1419 == 6) {
                            this.field1410 = 64;
                            this.field1411 = 128;
                        }
                        this.field1419 = 2;
                        this.field1407 = this.field1426.method233();
                        this.field1408 = this.field1426.method233();
                        this.field1409 = this.field1426.method231();
                    }
                    if (this.field1419 == 10) {
                        this.field1169 = this.field1426.method233();
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 43) {
                    for (int var147 = 0; var147 < this.field1269.length; ++var147) {
                        if (this.field1531[var147] != this.field1269[var147]) {
                            this.field1269[var147] = this.field1531[var147];
                            this.method451(var147, (byte) 4);
                            this.field1527 = true;
                        }
                    }
                    this.field1548 = -1;
                    return true;
                }
                if (this.field1548 == 27) {
                    this.field1521 = this.field1426.method233();
                    this.field1548 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1548 + "," + this.field1547 + " - " + this.field1446 + "," + this.field1447);
                this.method418(2);
            } catch (IOException var152) {
                this.method441((byte) 66);
            } catch (Exception var153) {
                String var149 = "T2 - " + this.field1548 + "," + this.field1446 + "," + this.field1447 + " - " + this.field1547 + "," + (field1316.field445[0] + this.field1487) + "," + (field1316.field446[0] + this.field1488) + " - ";
                for (int var150 = 0; var150 < this.field1547 && var150 < 50; ++var150) {
                    var149 = var149 + this.field1426.field693[var150] + ",";
                }
                signlink.reporterror(var149);
                this.method418(2);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method513(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg0;
        return arg1 < 0 ? ((arg2 & 16711935) * var5 + (arg3 & 16711935) * arg0 & -16711936) + ((arg2 & 65280) * var5 + (arg3 & 65280) * arg0 & 16711680) >> 8 : this.field1184;
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method514(boolean arg0) {
        if (this.field1502 >= 2 || this.field1201 != 0 || this.field1174 != 0) {
            if (arg0) {
                field1260 = this.field1520.method291();
            }
            String var2;
            if (this.field1201 == 1 && this.field1502 < 2) {
                var2 = "Use " + this.field1205 + " with...";
            } else if (this.field1174 == 1 && this.field1502 < 2) {
                var2 = this.field1177 + "...";
            } else {
                var2 = this.field1444[this.field1502 - 1];
            }
            if (this.field1502 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1502 - 2) + " more options";
            }
            this.field1319.method212(16777215, var2, field1288 / 1000, 4, false, 15, true);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILmb;I)V")
    private final void method515(int arg0, Packet arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1497; ++var4) {
            int var5 = this.field1498[var4];
            PlayerEntity var6 = this.field1494[var5];
            int var7 = arg1.method231();
            if ((var7 & 128) == 128) {
                var7 += arg1.method231() << 8;
            }
            this.method491((byte) -64, var6, var5, arg1, var7);
        }
        if (arg2 != 0) {
            this.field1399 = this.field1520.method291();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIILd;)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Component arg6) {
        if (arg6.field69 == 0 && arg6.field83 != null && !arg6.field82) {
            if (arg2 >= arg0 && arg3 >= arg1 && arg2 <= arg6.field72 + arg0 && arg3 <= arg6.field73 + arg1) {
                int var8 = arg6.field83.length;
                int var9 = 16 / arg4;
                for (int var10 = 0; var10 < var8; ++var10) {
                    int var11 = arg6.field84[var10] + arg0;
                    int var12 = arg6.field85[var10] + arg1 - arg5;
                    Component var13 = Component.field62[arg6.field83[var10]];
                    int var14 = var13.field74 + var11;
                    int var15 = var13.field75 + var12;
                    if ((var13.field79 >= 0 || var13.field105 != 0) && arg2 >= var14 && arg3 >= var15 && arg2 < var13.field72 + var14 && arg3 < var13.field73 + var15) {
                        if (var13.field79 >= 0) {
                            this.field1306 = var13.field79;
                        } else {
                            this.field1306 = var13.field67;
                        }
                    }
                    if (var13.field69 == 0) {
                        this.method516(var14, var15, arg2, arg3, 972, var13.field81, var13);
                        if (var13.field80 > var13.field73) {
                            this.method472(var13.field73, true, var13, var13.field72 + var14, arg3, var13.field80, var15, arg2, true);
                        }
                    } else {
                        if (var13.field70 == 1 && arg2 >= var14 && arg3 >= var15 && arg2 < var13.field72 + var14 && arg3 < var13.field73 + var15) {
                            boolean var16 = false;
                            if (var13.field71 != 0) {
                                var16 = this.method422(var13, -626);
                            }
                            if (!var16) {
                                this.field1444[this.field1502] = var13.field120;
                                this.field1378[this.field1502] = 951;
                                this.field1377[this.field1502] = var13.field67;
                                ++this.field1502;
                            }
                        }
                        if (var13.field70 == 2 && this.field1174 == 0 && arg2 >= var14 && arg3 >= var15 && arg2 < var13.field72 + var14 && arg3 < var13.field73 + var15) {
                            String var17 = var13.field117;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field1444[this.field1502] = var17 + " @gre@" + var13.field118;
                            this.field1378[this.field1502] = 930;
                            this.field1377[this.field1502] = var13.field67;
                            ++this.field1502;
                        }
                        if (var13.field70 == 3 && arg2 >= var14 && arg3 >= var15 && arg2 < var13.field72 + var14 && arg3 < var13.field73 + var15) {
                            this.field1444[this.field1502] = "Close";
                            this.field1378[this.field1502] = 947;
                            this.field1377[this.field1502] = var13.field67;
                            ++this.field1502;
                        }
                        if (var13.field70 == 4 && arg2 >= var14 && arg3 >= var15 && arg2 < var13.field72 + var14 && arg3 < var13.field73 + var15) {
                            this.field1444[this.field1502] = var13.field120;
                            this.field1378[this.field1502] = 465;
                            this.field1377[this.field1502] = var13.field67;
                            ++this.field1502;
                        }
                        if (var13.field70 == 5 && arg2 >= var14 && arg3 >= var15 && arg2 < var13.field72 + var14 && arg3 < var13.field73 + var15) {
                            this.field1444[this.field1502] = var13.field120;
                            this.field1378[this.field1502] = 960;
                            this.field1377[this.field1502] = var13.field67;
                            ++this.field1502;
                        }
                        if (var13.field70 == 6 && !this.field1185 && arg2 >= var14 && arg3 >= var15 && arg2 < var13.field72 + var14 && arg3 < var13.field73 + var15) {
                            this.field1444[this.field1502] = var13.field120;
                            this.field1378[this.field1502] = 44;
                            this.field1377[this.field1502] = var13.field67;
                            ++this.field1502;
                        }
                        if (var13.field69 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field73; ++var19) {
                                for (int var20 = 0; var20 < var13.field72; ++var20) {
                                    int var21 = (var13.field91 + 32) * var20 + var14;
                                    int var22 = (var13.field92 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field94[var18];
                                        var22 += var13.field95[var18];
                                    }
                                    if (arg2 >= var21 && arg3 >= var22 && arg2 < var21 + 32 && arg3 < var22 + 32) {
                                        this.field1438 = var18;
                                        this.field1439 = var13.field67;
                                        if (var13.field63[var18] > 0) {
                                            ObjType var23 = ObjType.method335(var13.field63[var18] - 1);
                                            if (this.field1201 == 1 && var13.field89) {
                                                if (this.field1203 != var13.field67 || this.field1202 != var18) {
                                                    this.field1444[this.field1502] = "Use " + this.field1205 + " with @lre@" + var23.field986;
                                                    this.field1378[this.field1502] = 881;
                                                    this.field1379[this.field1502] = var23.field984;
                                                    this.field1376[this.field1502] = var18;
                                                    this.field1377[this.field1502] = var13.field67;
                                                    ++this.field1502;
                                                }
                                            } else if (this.field1174 == 1 && var13.field89) {
                                                if ((this.field1176 & 16) == 16) {
                                                    this.field1444[this.field1502] = this.field1177 + " @lre@" + var23.field986;
                                                    this.field1378[this.field1502] = 391;
                                                    this.field1379[this.field1502] = var23.field984;
                                                    this.field1376[this.field1502] = var18;
                                                    this.field1377[this.field1502] = var13.field67;
                                                    ++this.field1502;
                                                }
                                            } else {
                                                if (var13.field89) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field1002 != null && var23.field1002[var24] != null) {
                                                            this.field1444[this.field1502] = var23.field1002[var24] + " @lre@" + var23.field986;
                                                            if (var24 == 3) {
                                                                this.field1378[this.field1502] = 478;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field1378[this.field1502] = 347;
                                                            }
                                                            this.field1379[this.field1502] = var23.field984;
                                                            this.field1376[this.field1502] = var18;
                                                            this.field1377[this.field1502] = var13.field67;
                                                            ++this.field1502;
                                                        } else if (var24 == 4) {
                                                            this.field1444[this.field1502] = "Drop @lre@" + var23.field986;
                                                            this.field1378[this.field1502] = 347;
                                                            this.field1379[this.field1502] = var23.field984;
                                                            this.field1376[this.field1502] = var18;
                                                            this.field1377[this.field1502] = var13.field67;
                                                            ++this.field1502;
                                                        }
                                                    }
                                                }
                                                if (var13.field90) {
                                                    this.field1444[this.field1502] = "Use @lre@" + var23.field986;
                                                    this.field1378[this.field1502] = 188;
                                                    this.field1379[this.field1502] = var23.field984;
                                                    this.field1376[this.field1502] = var18;
                                                    this.field1377[this.field1502] = var13.field67;
                                                    ++this.field1502;
                                                }
                                                if (var13.field89 && var23.field1002 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field1002[var25] != null) {
                                                            this.field1444[this.field1502] = var23.field1002[var25] + " @lre@" + var23.field986;
                                                            if (var25 == 0) {
                                                                this.field1378[this.field1502] = 405;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1378[this.field1502] = 38;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1378[this.field1502] = 422;
                                                            }
                                                            this.field1379[this.field1502] = var23.field984;
                                                            this.field1376[this.field1502] = var18;
                                                            this.field1377[this.field1502] = var13.field67;
                                                            ++this.field1502;
                                                        }
                                                    }
                                                }
                                                if (var13.field96 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field96[var26] != null) {
                                                            this.field1444[this.field1502] = var13.field96[var26] + " @lre@" + var23.field986;
                                                            if (var26 == 0) {
                                                                this.field1378[this.field1502] = 602;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field1378[this.field1502] = 596;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field1378[this.field1502] = 22;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field1378[this.field1502] = 892;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field1378[this.field1502] = 415;
                                                            }
                                                            this.field1379[this.field1502] = var23.field984;
                                                            this.field1376[this.field1502] = var18;
                                                            this.field1377[this.field1502] = var13.field67;
                                                            ++this.field1502;
                                                        }
                                                    }
                                                }
                                                this.field1444[this.field1502] = "Examine @lre@" + var23.field986;
                                                this.field1378[this.field1502] = 1773;
                                                this.field1379[this.field1502] = var23.field984;
                                                this.field1377[this.field1502] = var13.field64[var18];
                                                ++this.field1502;
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

    @OriginalMember(owner = "client", name = "c", descriptor = "(JI)V")
    public final void method517(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1461; ++var4) {
                if (this.field1171[var4] == arg0) {
                    --this.field1461;
                    this.field1527 = true;
                    for (int var5 = var4; var5 < this.field1461; ++var5) {
                        this.field1171[var5] = this.field1171[var5 + 1];
                    }
                    this.field1491.method220(this.field1553, 181);
                    this.field1491.method227(arg0, true);
                    break;
                }
            }
            if (arg1 == 3) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method518(boolean arg0) {
        this.method417(6);
        this.field1463 &= arg0;
        if (this.field1423 == 1) {
            this.field1267[this.field1422 / 100].method190(this.field1420 - 8 - 8, this.field1421 - 8 - 11, 373);
        }
        if (this.field1423 == 2) {
            this.field1267[this.field1422 / 100 + 4].method190(this.field1420 - 8 - 8, this.field1421 - 8 - 11, 373);
        }
        if (this.field1561 != -1) {
            this.method432(this.field1338, this.field1561, (byte) -124);
            this.method445(0, Component.field62[this.field1561], 0, (byte) 0, 0);
        }
        this.method500((byte) 106);
        if (!this.field1435) {
            this.method476(633);
            this.method514(false);
        } else if (this.field1466 == 0) {
            this.method492(-45712);
        }
        if (this.field1486 == 1) {
            if (this.field1229 <= 0 && this.field1473 != 1) {
                this.field1144[1].method190(472, 296, 373);
            } else {
                this.field1144[1].method190(472, 258, 373);
            }
        }
        if (this.field1229 > 0) {
            this.field1144[0].method190(472, 296, 373);
            this.field1318.method206("Level: " + this.field1229, 484, 329, 39475, 16776960);
        }
        if (this.field1473 == 1) {
            this.field1144[6].method190(472, 296, 373);
            this.field1318.method206("Arena", 484, 329, 39475, 16776960);
        }
        if (this.field1286 != 0) {
            int var2 = this.field1286 / 50;
            int var3 = var2 / 60;
            int var4 = var2 % 60;
            if (var4 < 10) {
                this.field1318.method209(4, "System update in: " + var3 + ":0" + var4, this.field1142, 16776960, 329);
            } else {
                this.field1318.method209(4, "System update in: " + var3 + ":" + var4, this.field1142, 16776960, 329);
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(B)V")
    public final void method519(byte arg0) {
        int var2 = field1316.field397 + this.field1192;
        int var3 = field1316.field398 + this.field1294;
        if (this.field1322 - var2 < -500 || this.field1322 - var2 > 500 || this.field1323 - var3 < -500 || this.field1323 - var3 > 500) {
            this.field1322 = var2;
            this.field1323 = var3;
        }
        if (this.field1322 != var2) {
            this.field1322 += (var2 - this.field1322) / 16;
        }
        if (this.field1323 != var3) {
            this.field1323 += (var3 - this.field1323) / 16;
        }
        if (super.field24[1] == 1) {
            this.field1544 += (-24 - this.field1544) / 2;
        } else if (super.field24[2] == 1) {
            this.field1544 += (24 - this.field1544) / 2;
        } else {
            this.field1544 /= 2;
        }
        if (super.field24[3] == 1) {
            this.field1545 += (12 - this.field1545) / 2;
        } else if (super.field24[4] == 1) {
            this.field1545 += (-12 - this.field1545) / 2;
        } else {
            this.field1545 /= 2;
        }
        this.field1543 = this.field1544 / 2 + this.field1543 & 2047;
        this.field1542 += this.field1545 / 2;
        if (arg0 != -81) {
            field1264 = !field1264;
        }
        if (this.field1542 < 128) {
            this.field1542 = 128;
        }
        if (this.field1542 > 383) {
            this.field1542 = 383;
        }
        int var4 = this.field1322 >> 7;
        int var5 = this.field1323 >> 7;
        int var6 = this.method499(this.field1323, this.field1322, this.field1146, (byte) 67);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    int var10 = this.field1146;
                    if (var10 < 3 && (this.field1526[1][var8][var9] & 2) == 2) {
                        ++var10;
                    }
                    int var11 = var6 - this.field1524[var10][var8][var9];
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
        if (var12 > this.field1342) {
            this.field1342 += (var12 - this.field1342) / 24;
        } else if (var12 < this.field1342) {
            this.field1342 += (var12 - this.field1342) / 80;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)Ljava/lang/String;")
    private static final String method520(int arg0, int arg1) {
        int var2 = 61 / arg1;
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method521(int arg0) {
        this.field1547 += arg0;
        for (int var2 = 0; var2 < this.field1231; ++var2) {
            int var3 = this.field1232[var2];
            NpcEntity var4 = this.field1230[var3];
            if (var4 != null) {
                this.method522(var4, var4.field450.field956, (byte) 114);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;IB)V")
    public final void method522(PathingEntity arg0, int arg1, byte arg2) {
        if (arg0.field397 < 128 || arg0.field398 < 128 || arg0.field397 >= 13184 || arg0.field398 >= 13184) {
            arg0.field424 = -1;
            arg0.field429 = -1;
            arg0.field438 = 0;
            arg0.field439 = 0;
            arg0.field397 = arg0.field445[0] * 128 + arg0.field401 * 64;
            arg0.field398 = arg0.field446[0] * 128 + arg0.field401 * 64;
            arg0.field444 = 0;
        }
        if (field1316 == arg0 && (arg0.field397 < 1536 || arg0.field398 < 1536 || arg0.field397 >= 11776 || arg0.field398 >= 11776)) {
            arg0.field424 = -1;
            arg0.field429 = -1;
            arg0.field438 = 0;
            arg0.field439 = 0;
            arg0.field397 = arg0.field445[0] * 128 + arg0.field401 * 64;
            arg0.field398 = arg0.field446[0] * 128 + arg0.field401 * 64;
            arg0.field444 = 0;
        }
        if (arg0.field438 > field1288) {
            this.method523((byte) 26, arg0);
        } else if (arg0.field439 >= field1288) {
            this.method524(arg0, (byte) -26);
        } else {
            this.method525(this.field1397, arg0);
        }
        this.method526(arg0, this.field1399);
        if (this.field1148 != arg2) {
            this.field1335 = this.field1520.method291();
        }
        this.method527(arg0, (byte) 6);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLz;)V")
    public final void method523(byte arg0, PathingEntity arg1) {
        int var3 = arg1.field438 - field1288;
        int var4 = arg1.field434 * 128 + arg1.field401 * 64;
        int var5 = arg1.field436 * 128 + arg1.field401 * 64;
        if (this.field1301 == arg0) {
            arg1.field397 += (var4 - arg1.field397) / var3;
            arg1.field398 += (var5 - arg1.field398) / var3;
            arg1.field448 = 0;
            if (arg1.field440 == 0) {
                arg1.field443 = 1024;
            }
            if (arg1.field440 == 1) {
                arg1.field443 = 1536;
            }
            if (arg1.field440 == 2) {
                arg1.field443 = 0;
            }
            if (arg1.field440 == 3) {
                arg1.field443 = 512;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;B)V")
    public final void method524(PathingEntity arg0, byte arg1) {
        if (arg1 != -26) {
            this.method6();
        }
        if (field1288 == arg0.field439 || arg0.field424 == -1 || arg0.field427 != 0 || arg0.field426 + 1 > SeqType.field1069[arg0.field424].method369(7, arg0.field425)) {
            int var3 = arg0.field439 - arg0.field438;
            int var4 = field1288 - arg0.field438;
            int var5 = arg0.field434 * 128 + arg0.field401 * 64;
            int var6 = arg0.field436 * 128 + arg0.field401 * 64;
            int var7 = arg0.field435 * 128 + arg0.field401 * 64;
            int var8 = arg0.field437 * 128 + arg0.field401 * 64;
            arg0.field397 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field398 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field448 = 0;
        if (arg0.field440 == 0) {
            arg0.field443 = 1024;
        }
        if (arg0.field440 == 1) {
            arg0.field443 = 1536;
        }
        if (arg0.field440 == 2) {
            arg0.field443 = 0;
        }
        if (arg0.field440 == 3) {
            arg0.field443 = 512;
        }
        arg0.field399 = arg0.field443;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BLz;)V")
    public final void method525(byte arg0, PathingEntity arg1) {
        arg1.field421 = arg1.field402;
        if (arg1.field444 == 0) {
            arg1.field448 = 0;
        } else {
            if (arg1.field424 != -1 && arg1.field427 == 0) {
                SeqType var3 = SeqType.field1069[arg1.field424];
                if (var3.field1075 == null) {
                    ++arg1.field448;
                    return;
                }
            }
            int var4 = arg1.field397;
            int var5 = arg1.field398;
            int var6 = arg1.field445[arg1.field444 - 1] * 128 + arg1.field401 * 64;
            int var7 = arg1.field446[arg1.field444 - 1] * 128 + arg1.field401 * 64;
            if (arg0 != 6) {
                this.field1548 = -1;
            }
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field443 = 1280;
                    } else if (var5 > var7) {
                        arg1.field443 = 1792;
                    } else {
                        arg1.field443 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field443 = 768;
                    } else if (var5 > var7) {
                        arg1.field443 = 256;
                    } else {
                        arg1.field443 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field443 = 1024;
                } else {
                    arg1.field443 = 0;
                }
                int var8 = arg1.field443 - arg1.field399 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field405;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field404;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field407;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field406;
                }
                if (var9 == -1) {
                    var9 = arg1.field404;
                }
                arg1.field421 = var9;
                int var10 = 4;
                if (arg1.field443 != arg1.field399 && arg1.field418 == -1) {
                    var10 = 2;
                }
                if (arg1.field444 > 2) {
                    var10 = 6;
                }
                if (arg1.field444 > 3) {
                    var10 = 8;
                }
                if (arg1.field448 > 0 && arg1.field444 > 1) {
                    var10 = 8;
                    --arg1.field448;
                }
                if (arg1.field447[arg1.field444 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field421 == arg1.field404 && arg1.field408 != -1) {
                    arg1.field421 = arg1.field408;
                }
                if (var4 < var6) {
                    arg1.field397 += var10;
                    if (arg1.field397 > var6) {
                        arg1.field397 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field397 -= var10;
                    if (arg1.field397 < var6) {
                        arg1.field397 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field398 += var10;
                    if (arg1.field398 > var7) {
                        arg1.field398 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field398 -= var10;
                    if (arg1.field398 < var7) {
                        arg1.field398 = var7;
                    }
                }
                if (arg1.field397 == var6 && arg1.field398 == var7) {
                    --arg1.field444;
                }
            } else {
                arg1.field397 = var6;
                arg1.field398 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;I)V")
    public final void method526(PathingEntity arg0, int arg1) {
        this.field1547 += arg1;
        if (arg0.field418 != -1 && arg0.field418 < 32768) {
            NpcEntity var3 = this.field1230[arg0.field418];
            if (var3 != null) {
                int var4 = arg0.field397 - var3.field397;
                int var5 = arg0.field398 - var3.field398;
                if (var4 != 0 || var5 != 0) {
                    arg0.field443 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                }
            }
        }
        if (arg0.field418 >= 32768) {
            int var6 = arg0.field418 - 32768;
            if (this.field1521 == var6) {
                var6 = this.field1493;
            }
            PlayerEntity var7 = this.field1494[var6];
            if (var7 != null) {
                int var8 = arg0.field397 - var7.field397;
                int var9 = arg0.field398 - var7.field398;
                if (var8 != 0 || var9 != 0) {
                    arg0.field443 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                }
            }
        }
        if ((arg0.field419 != 0 || arg0.field420 != 0) && (arg0.field444 == 0 || arg0.field448 > 0)) {
            int var10 = arg0.field397 - (arg0.field419 - this.field1487 - this.field1487) * 64;
            int var11 = arg0.field398 - (arg0.field420 - this.field1488 - this.field1488) * 64;
            if (var10 != 0 || var11 != 0) {
                arg0.field443 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
            }
            arg0.field419 = 0;
            arg0.field420 = 0;
        }
        int var12 = arg0.field443 - arg0.field399 & 2047;
        if (var12 != 0) {
            if (var12 >= 32 && var12 <= 2016) {
                if (var12 > 1024) {
                    arg0.field399 -= 32;
                } else {
                    arg0.field399 += 32;
                }
            } else {
                arg0.field399 = arg0.field443;
            }
            arg0.field399 &= 2047;
            if (arg0.field421 == arg0.field402 && arg0.field443 != arg0.field399) {
                if (arg0.field403 != -1) {
                    arg0.field421 = arg0.field403;
                    return;
                }
                arg0.field421 = arg0.field404;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lz;B)V")
    public final void method527(PathingEntity arg0, byte arg1) {
        if (arg1 == 6) {
            boolean var3 = false;
        } else {
            this.field1167 = !this.field1167;
        }
        arg0.field400 = false;
        if (arg0.field421 != -1) {
            SeqType var4 = SeqType.field1069[arg0.field421];
            ++arg0.field423;
            if (arg0.field422 < var4.field1070 && arg0.field423 > var4.method369(7, arg0.field422)) {
                arg0.field423 = 0;
                ++arg0.field422;
            }
            if (arg0.field422 >= var4.field1070) {
                arg0.field423 = 0;
                arg0.field422 = 0;
            }
        }
        if (arg0.field424 != -1 && arg0.field427 == 0) {
            SeqType var5 = SeqType.field1069[arg0.field424];
            ++arg0.field426;
            while (arg0.field425 < var5.field1070 && arg0.field426 > var5.method369(7, arg0.field425)) {
                arg0.field426 -= var5.method369(7, arg0.field425);
                ++arg0.field425;
            }
            if (arg0.field425 >= var5.field1070) {
                arg0.field425 -= var5.field1074;
                ++arg0.field428;
                if (arg0.field428 >= var5.field1080) {
                    arg0.field424 = -1;
                }
                if (arg0.field425 < 0 || arg0.field425 >= var5.field1070) {
                    arg0.field424 = -1;
                }
            }
            arg0.field400 = var5.field1076;
        }
        if (arg0.field427 > 0) {
            --arg0.field427;
        }
        if (arg0.field429 != -1 && field1288 >= arg0.field432) {
            if (arg0.field430 < 0) {
                arg0.field430 = 0;
            }
            SeqType var6 = SpotAnimType.field1084[arg0.field429].field1088;
            ++arg0.field431;
            while (arg0.field430 < var6.field1070 && arg0.field431 > var6.method369(7, arg0.field430)) {
                arg0.field431 -= var6.method369(7, arg0.field430);
                ++arg0.field430;
            }
            if (arg0.field430 >= var6.field1070) {
                if (arg0.field430 < 0 || arg0.field430 >= var6.field1070) {
                    arg0.field429 = -1;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method528(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field1366) {
            this.field1366 = false;
            this.field1238.method261(0, -49767, super.field12, 11);
            this.field1239.method261(0, -49767, super.field12, 375);
            this.field1240.method261(729, -49767, super.field12, 5);
            this.field1241.method261(752, -49767, super.field12, 231);
            this.field1242.method261(0, -49767, super.field12, 0);
            this.field1243.method261(561, -49767, super.field12, 0);
            this.field1244.method261(520, -49767, super.field12, 11);
            this.field1245.method261(520, -49767, super.field12, 231);
            this.field1246.method261(501, -49767, super.field12, 375);
            this.field1247.method261(0, -49767, super.field12, 345);
            this.field1527 = true;
            this.field1417 = true;
            this.field1159 = true;
            this.field1337 = true;
            if (this.field1196 != 2) {
                this.field1431.method261(8, -49767, super.field12, 11);
                this.field1430.method261(561, -49767, super.field12, 5);
            }
        }
        if (this.field1196 == 2) {
            this.method486(-389);
        }
        if (this.field1435 && this.field1466 == 1) {
            this.field1527 = true;
        }
        if (this.field1390 != -1) {
            boolean var3 = this.method432(this.field1338, this.field1390, (byte) -124);
            if (var3) {
                this.field1527 = true;
            }
        }
        if (this.field1513 == 2) {
            this.field1527 = true;
        }
        if (this.field1298 == 2) {
            this.field1527 = true;
        }
        if (this.field1527) {
            this.method481((byte) 49);
            this.field1527 = false;
        }
        if (this.field1501 == -1) {
            this.field1272.field81 = this.field1456 - this.field1412 - 77;
            if (super.field19 > 453 && super.field19 < 565 && super.field20 > 350) {
                this.method472(77, false, this.field1272, 463, super.field20 - 375, this.field1456, 0, super.field19 - 22, true);
            }
            int var4 = this.field1456 - 77 - this.field1272.field81;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var4 > this.field1456 - 77) {
                var4 = this.field1456 - 77;
            }
            if (this.field1412 != var4) {
                this.field1412 = var4;
                this.field1417 = true;
            }
        }
        if (this.field1501 != -1) {
            boolean var5 = this.method432(this.field1338, this.field1501, (byte) -124);
            if (var5) {
                this.field1417 = true;
            }
        }
        if (this.field1513 == 3) {
            this.field1417 = true;
        }
        if (this.field1298 == 3) {
            this.field1417 = true;
        }
        if (this.field1418 != null) {
            this.field1417 = true;
        }
        if (this.field1435 && this.field1466 == 2) {
            this.field1417 = true;
        }
        if (this.field1417) {
            this.method505(false);
            this.field1417 = false;
        }
        if (this.field1196 == 2) {
            this.method474(false);
            this.field1430.method261(561, -49767, super.field12, 5);
        }
        if (this.field1415 != -1) {
            this.field1159 = true;
        }
        if (this.field1159) {
            if (this.field1415 != -1 && this.field1540 == this.field1415) {
                this.field1415 = -1;
                this.field1491.method220(this.field1553, 48);
                this.field1491.method221(this.field1540);
            }
            this.field1159 = false;
            this.field1257.method260((byte) 0);
            this.field1314.method204(0, 0, 373);
            if (this.field1390 == -1) {
                if (this.field1369[this.field1540] != -1) {
                    if (this.field1540 == 0) {
                        this.field1280.method204(29, 30, 373);
                    }
                    if (this.field1540 == 1) {
                        this.field1281.method204(59, 29, 373);
                    }
                    if (this.field1540 == 2) {
                        this.field1281.method204(87, 29, 373);
                    }
                    if (this.field1540 == 3) {
                        this.field1282.method204(115, 29, 373);
                    }
                    if (this.field1540 == 4) {
                        this.field1284.method204(156, 29, 373);
                    }
                    if (this.field1540 == 5) {
                        this.field1284.method204(184, 29, 373);
                    }
                    if (this.field1540 == 6) {
                        this.field1283.method204(212, 30, 373);
                    }
                }
                if (this.field1369[0] != -1 && (this.field1415 != 0 || field1288 % 20 < 10)) {
                    this.field1528[0].method204(35, 34, 373);
                }
                if (this.field1369[1] != -1 && (this.field1415 != 1 || field1288 % 20 < 10)) {
                    this.field1528[1].method204(59, 32, 373);
                }
                if (this.field1369[2] != -1 && (this.field1415 != 2 || field1288 % 20 < 10)) {
                    this.field1528[2].method204(86, 32, 373);
                }
                if (this.field1369[3] != -1 && (this.field1415 != 3 || field1288 % 20 < 10)) {
                    this.field1528[3].method204(121, 33, 373);
                }
                if (this.field1369[4] != -1 && (this.field1415 != 4 || field1288 % 20 < 10)) {
                    this.field1528[4].method204(157, 34, 373);
                }
                if (this.field1369[5] != -1 && (this.field1415 != 5 || field1288 % 20 < 10)) {
                    this.field1528[5].method204(185, 32, 373);
                }
                if (this.field1369[6] != -1 && (this.field1415 != 6 || field1288 % 20 < 10)) {
                    this.field1528[6].method204(212, 34, 373);
                }
            }
            this.field1257.method261(520, -49767, super.field12, 165);
            this.field1256.method260((byte) 0);
            this.field1313.method204(0, 0, 373);
            if (this.field1390 == -1) {
                if (this.field1369[this.field1540] != -1) {
                    if (this.field1540 == 7) {
                        this.field1391.method204(49, 0, 373);
                    }
                    if (this.field1540 == 8) {
                        this.field1392.method204(81, 0, 373);
                    }
                    if (this.field1540 == 9) {
                        this.field1392.method204(108, 0, 373);
                    }
                    if (this.field1540 == 10) {
                        this.field1393.method204(136, 1, 373);
                    }
                    if (this.field1540 == 11) {
                        this.field1395.method204(178, 0, 373);
                    }
                    if (this.field1540 == 12) {
                        this.field1395.method204(205, 0, 373);
                    }
                    if (this.field1540 == 13) {
                        this.field1394.method204(233, 0, 373);
                    }
                }
                if (this.field1369[8] != -1 && (this.field1415 != 8 || field1288 % 20 < 10)) {
                    this.field1528[7].method204(80, 2, 373);
                }
                if (this.field1369[9] != -1 && (this.field1415 != 9 || field1288 % 20 < 10)) {
                    this.field1528[8].method204(107, 3, 373);
                }
                if (this.field1369[10] != -1 && (this.field1415 != 10 || field1288 % 20 < 10)) {
                    this.field1528[9].method204(142, 4, 373);
                }
                if (this.field1369[11] != -1 && (this.field1415 != 11 || field1288 % 20 < 10)) {
                    this.field1528[10].method204(179, 2, 373);
                }
                if (this.field1369[12] != -1 && (this.field1415 != 12 || field1288 % 20 < 10)) {
                    this.field1528[11].method204(206, 2, 373);
                }
                if (this.field1369[13] != -1 && (this.field1415 != 13 || field1288 % 20 < 10)) {
                    this.field1528[12].method204(230, 2, 373);
                }
            }
            this.field1256.method261(501, -49767, super.field12, 492);
            this.field1431.method260((byte) 0);
        }
        if (this.field1337) {
            this.field1337 = false;
            this.field1255.method260((byte) 0);
            this.field1312.method204(0, 0, 373);
            this.field1318.method207((byte) 9, true, 33, "Public chat", 16777215, 57);
            if (this.field1458 == 0) {
                this.field1318.method207((byte) 9, true, 46, "On", 65280, 57);
            }
            if (this.field1458 == 1) {
                this.field1318.method207((byte) 9, true, 46, "Friends", 16776960, 57);
            }
            if (this.field1458 == 2) {
                this.field1318.method207((byte) 9, true, 46, "Off", 16711680, 57);
            }
            if (this.field1458 == 3) {
                this.field1318.method207((byte) 9, true, 46, "Hide", 65535, 57);
            }
            this.field1318.method207((byte) 9, true, 33, "Private chat", 16777215, 186);
            if (this.field1443 == 0) {
                this.field1318.method207((byte) 9, true, 46, "On", 65280, 186);
            }
            if (this.field1443 == 1) {
                this.field1318.method207((byte) 9, true, 46, "Friends", 16776960, 186);
            }
            if (this.field1443 == 2) {
                this.field1318.method207((byte) 9, true, 46, "Off", 16711680, 186);
            }
            this.field1318.method207((byte) 9, true, 33, "Trade/duel", 16777215, 326);
            if (this.field1210 == 0) {
                this.field1318.method207((byte) 9, true, 46, "On", 65280, 326);
            }
            if (this.field1210 == 1) {
                this.field1318.method207((byte) 9, true, 46, "Friends", 16776960, 326);
            }
            if (this.field1210 == 2) {
                this.field1318.method207((byte) 9, true, 46, "Off", 16711680, 326);
            }
            this.field1318.method207((byte) 9, true, 38, "Report abuse", 16777215, 462);
            this.field1255.method261(0, -49767, super.field12, 471);
            this.field1431.method260((byte) 0);
        }
        this.field1338 = 0;
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method529(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1310[(var2 - 2 << 7) + var3] = 255;
            }
        }
        if (arg0 <= 0) {
            this.field1184 = 211;
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1310[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1311[var14] = (this.field1310[var14 - 1] + this.field1310[var14 + 1] + this.field1310[var14 - 128] + this.field1310[var14 + 128]) / 4;
            }
        }
        this.field1253 += 128;
        if (this.field1253 > this.field1150.length) {
            this.field1253 -= this.field1150.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method435(298, this.field1546[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field1311[var11 + 128] - this.field1150[this.field1253 + var11 & this.field1150.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field1310[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field1228[var8] = this.field1228[var8 + 1];
        }
        this.field1228[var2 - 1] = (int) (Math.sin((double) field1288 / 14.0D) * 16.0D + Math.sin((double) field1288 / 15.0D) * 14.0D + Math.sin((double) field1288 / 16.0D) * 12.0D);
        if (this.field1440 > 0) {
            this.field1440 -= 4;
        }
        if (this.field1441 > 0) {
            this.field1441 -= 4;
        }
        if (this.field1440 == 0 && this.field1441 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field1440 = 1024;
            }
            if (var9 == 1) {
                this.field1441 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(B)V")
    public final void method530(byte arg0) {
        if (arg0 != 4) {
            field1453 = this.field1520.method291();
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method5((byte) 5);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field1561 != -1 && this.field1561 == this.field1172) {
                        if (var2 == 8 && this.field1506.length() > 0) {
                            this.field1506 = this.field1506.substring(0, this.field1506.length() - 1);
                        }
                        break;
                    }
                    if (this.field1348) {
                        if (var2 >= 32 && var2 <= 122 && this.field1217.length() < 80) {
                            this.field1217 = this.field1217 + (char) var2;
                            this.field1417 = true;
                        }
                        if (var2 == 8 && this.field1217.length() > 0) {
                            this.field1217 = this.field1217.substring(0, this.field1217.length() - 1);
                            this.field1417 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field1348 = false;
                            this.field1417 = true;
                            if (this.field1162 == 1) {
                                long var3 = JString.method296(this.field1217);
                                this.method456(var3, 0);
                            }
                            if (this.field1162 == 2 && this.field1251 > 0) {
                                long var5 = JString.method296(this.field1217);
                                this.method467((byte) 8, var5);
                            }
                            if (this.field1162 == 3 && this.field1217.length() > 0) {
                                this.field1491.method220(this.field1553, 183);
                                this.field1491.method221(0);
                                int var7 = this.field1491.field694;
                                this.field1491.method227(this.field1434, true);
                                WordPack.method304(false, this.field1217, this.field1491);
                                this.field1491.method230(this.field1491.field694 - var7, (byte) 9);
                                this.field1217 = JString.method301(this.field1217, (byte) 7);
                                this.field1217 = WordFilter.method386(this.field1217, 713);
                                this.method458(this.field1217, 6, JString.method300(JString.method297(9, this.field1434), 1), true);
                                if (this.field1443 == 2) {
                                    this.field1443 = 1;
                                    this.field1337 = true;
                                    this.field1491.method220(this.field1553, 130);
                                    this.field1491.method221(this.field1458);
                                    this.field1491.method221(this.field1443);
                                    this.field1491.method221(this.field1210);
                                }
                            }
                            if (this.field1162 == 4 && this.field1461 < 100) {
                                long var8 = JString.method296(this.field1217);
                                this.method433(var8, -338);
                            }
                            if (this.field1162 == 5 && this.field1461 > 0) {
                                long var10 = JString.method296(this.field1217);
                                this.method517(var10, 3);
                            }
                        }
                    } else if (this.field1484) {
                        if (var2 >= 48 && var2 <= 57 && this.field1304.length() < 10) {
                            this.field1304 = this.field1304 + (char) var2;
                            this.field1417 = true;
                        }
                        if (var2 == 8 && this.field1304.length() > 0) {
                            this.field1304 = this.field1304.substring(0, this.field1304.length() - 1);
                            this.field1417 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field1304.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field1304);
                                } catch (Exception var16) {
                                }
                                this.field1491.method220(this.field1553, 206);
                                this.field1491.method225(var12);
                            }
                            this.field1484 = false;
                            this.field1417 = true;
                        }
                    } else if (this.field1501 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field1507.length() < 80) {
                            this.field1507 = this.field1507 + (char) var2;
                            this.field1417 = true;
                        }
                        if (var2 == 8 && this.field1507.length() > 0) {
                            this.field1507 = this.field1507.substring(0, this.field1507.length() - 1);
                            this.field1417 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field1507.length() > 0) {
                            if (this.field1507.equals("::clientdrop") && (super.field15 != null || this.method471(0).indexOf("192.168.1.") != -1)) {
                                this.method441((byte) 66);
                            } else if (this.field1507.equals("::lag")) {
                                this.method497(0);
                            } else if (this.field1507.startsWith("::")) {
                                this.field1491.method220(this.field1553, 91);
                                this.field1491.method221(this.field1507.length() - 1);
                                this.field1491.method228(this.field1507.substring(2));
                            } else {
                                byte var13 = 0;
                                if (this.field1507.startsWith("yellow:")) {
                                    var13 = 0;
                                    this.field1507 = this.field1507.substring(7);
                                }
                                if (this.field1507.startsWith("red:")) {
                                    var13 = 1;
                                    this.field1507 = this.field1507.substring(4);
                                }
                                if (this.field1507.startsWith("green:")) {
                                    var13 = 2;
                                    this.field1507 = this.field1507.substring(6);
                                }
                                if (this.field1507.startsWith("cyan:")) {
                                    var13 = 3;
                                    this.field1507 = this.field1507.substring(5);
                                }
                                if (this.field1507.startsWith("purple:")) {
                                    var13 = 4;
                                    this.field1507 = this.field1507.substring(7);
                                }
                                if (this.field1507.startsWith("white:")) {
                                    var13 = 5;
                                    this.field1507 = this.field1507.substring(6);
                                }
                                if (this.field1507.startsWith("flash1:")) {
                                    var13 = 6;
                                    this.field1507 = this.field1507.substring(7);
                                }
                                if (this.field1507.startsWith("flash2:")) {
                                    var13 = 7;
                                    this.field1507 = this.field1507.substring(7);
                                }
                                if (this.field1507.startsWith("flash3:")) {
                                    var13 = 8;
                                    this.field1507 = this.field1507.substring(7);
                                }
                                if (this.field1507.startsWith("glow1:")) {
                                    var13 = 9;
                                    this.field1507 = this.field1507.substring(6);
                                }
                                if (this.field1507.startsWith("glow2:")) {
                                    var13 = 10;
                                    this.field1507 = this.field1507.substring(6);
                                }
                                if (this.field1507.startsWith("glow3:")) {
                                    var13 = 11;
                                    this.field1507 = this.field1507.substring(6);
                                }
                                byte var14 = 0;
                                if (this.field1507.startsWith("wave:")) {
                                    var14 = 1;
                                    this.field1507 = this.field1507.substring(5);
                                }
                                if (this.field1507.startsWith("scroll:")) {
                                    var14 = 2;
                                    this.field1507 = this.field1507.substring(7);
                                }
                                this.field1491.method220(this.field1553, 89);
                                this.field1491.method221(0);
                                int var15 = this.field1491.field694;
                                this.field1491.method221(var13);
                                this.field1491.method221(var14);
                                WordPack.method304(false, this.field1507, this.field1491);
                                this.field1491.method230(this.field1491.field694 - var15, (byte) 9);
                                this.field1507 = JString.method301(this.field1507, (byte) 7);
                                this.field1507 = WordFilter.method386(this.field1507, 713);
                                field1316.field409 = this.field1507;
                                field1316.field411 = var13;
                                field1316.field412 = var14;
                                field1316.field410 = 150;
                                this.method458(field1316.field409, 2, field1316.field453, true);
                                if (this.field1458 == 2) {
                                    this.field1458 = 3;
                                    this.field1337 = true;
                                    this.field1491.method220(this.field1553, 130);
                                    this.field1491.method221(this.field1458);
                                    this.field1491.method221(this.field1443);
                                    this.field1491.method221(this.field1210);
                                }
                            }
                            this.field1507 = "";
                            this.field1417 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field1506.length() < 12) {
                this.field1506 = this.field1506 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ld;Z)V")
    public final void method531(Component arg0, boolean arg1) {
        int var3 = arg0.field71;
        if (!arg1) {
            this.field1491.method221(12);
        }
        if (var3 >= 1 && var3 <= 100) {
            --var3;
            if (var3 >= this.field1251) {
                arg0.field101 = "";
                arg0.field70 = 0;
            } else {
                arg0.field101 = this.field1143[var3];
                arg0.field70 = 1;
            }
        } else if (var3 >= 101 && var3 <= 200) {
            var3 -= 101;
            if (var3 >= this.field1251) {
                arg0.field101 = "";
                arg0.field70 = 0;
            } else {
                if (this.field1268[var3] == 0) {
                    arg0.field101 = "@red@Offline";
                } else if (this.field1268[var3] == field1137) {
                    arg0.field101 = "@gre@World-" + (this.field1268[var3] - 9);
                } else {
                    arg0.field101 = "@yel@World-" + (this.field1268[var3] - 9);
                }
                arg0.field70 = 1;
            }
        } else if (var3 == 203) {
            arg0.field80 = this.field1251 * 15 + 20;
            if (arg0.field80 <= arg0.field73) {
                arg0.field80 = arg0.field73 + 1;
            }
        } else if (var3 >= 401 && var3 <= 500) {
            var3 -= 401;
            if (var3 >= this.field1461) {
                arg0.field101 = "";
                arg0.field70 = 0;
            } else {
                arg0.field101 = JString.method300(JString.method297(9, this.field1171[var3]), 1);
                arg0.field70 = 1;
            }
        } else if (var3 == 503) {
            arg0.field80 = this.field1461 * 15 + 20;
            if (arg0.field80 <= arg0.field73) {
                arg0.field80 = arg0.field73 + 1;
            }
        } else if (var3 == 327) {
            arg0.field115 = 150;
            arg0.field116 = (int) (Math.sin((double) field1288 / 40.0D) * 256.0D) & 2047;
            if (this.field1536) {
                for (int var4 = 0; var4 < 7; ++var4) {
                    int var11 = this.field1534[var4];
                    if (var11 >= 0 && !IdkType.field1051[var11].method364(0)) {
                        return;
                    }
                }
                this.field1536 = false;
                Model[] var5 = new Model[7];
                int var6 = 0;
                for (int var7 = 0; var7 < 7; ++var7) {
                    int var10 = this.field1534[var7];
                    if (var10 >= 0) {
                        var5[var6++] = IdkType.field1051[var10].method365(0);
                    }
                }
                Model var8 = new Model(var6, false, var5);
                for (int var9 = 0; var9 < 5; ++var9) {
                    if (this.field1485[var9] != 0) {
                        var8.method149(field1182[var9][0], field1182[var9][this.field1485[var9]]);
                        if (var9 == 1) {
                            var8.method149(field1271[0], field1271[this.field1485[var9]]);
                        }
                    }
                }
                var8.method142((byte) 9);
                var8.method143(SeqType.field1069[field1316.field402].field1071[0], false);
                var8.method152(64, 850, -30, -50, -30, true);
                arg0.field108 = 5;
                arg0.field109 = 0;
                Component.method35(5, 17829, 0, var8);
            }
        } else if (var3 == 324) {
            if (this.field1330 == null) {
                this.field1330 = arg0.field106;
                this.field1331 = arg0.field107;
            }
            if (this.field1554) {
                arg0.field106 = this.field1331;
            } else {
                arg0.field106 = this.field1330;
            }
        } else if (var3 == 325) {
            if (this.field1330 == null) {
                this.field1330 = arg0.field106;
                this.field1331 = arg0.field107;
            }
            if (this.field1554) {
                arg0.field106 = this.field1330;
            } else {
                arg0.field106 = this.field1331;
            }
        } else if (var3 == 600) {
            arg0.field101 = this.field1506;
            if (field1288 % 20 < 10) {
                arg0.field101 = arg0.field101 + "|";
            } else {
                arg0.field101 = arg0.field101 + " ";
            }
        } else {
            if (var3 == 613) {
                if (this.field1450) {
                    if (this.field1448) {
                        arg0.field103 = 16711680;
                        arg0.field101 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else {
                        arg0.field103 = 16777215;
                        arg0.field101 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else {
                    arg0.field101 = "";
                }
            }
            if (var3 == 650 || var3 == 655) {
                if (this.field1367 != 0) {
                    String var12;
                    if (this.field1509 == 0) {
                        var12 = "earlier today";
                    } else if (this.field1509 == 1) {
                        var12 = "yesterday";
                    } else {
                        var12 = this.field1509 + " days ago";
                    }
                    arg0.field101 = "You last logged in " + var12 + " from: " + signlink.dns;
                } else {
                    arg0.field101 = "";
                }
            }
            if (var3 == 651) {
                if (this.field1474 == 0) {
                    arg0.field101 = "0 unread messages";
                    arg0.field103 = 16776960;
                }
                if (this.field1474 == 1) {
                    arg0.field101 = "1 unread message";
                    arg0.field103 = 65280;
                }
                if (this.field1474 > 1) {
                    arg0.field101 = this.field1474 + " unread messages";
                    arg0.field103 = 65280;
                }
            }
            if (var3 == 652) {
                if (this.field1368 == 201) {
                    arg0.field101 = "";
                } else if (this.field1368 == 200) {
                    arg0.field101 = "You have not yet set any password recovery questions.";
                } else {
                    String var13;
                    if (this.field1368 == 0) {
                        var13 = "Earlier today";
                    } else if (this.field1368 == 1) {
                        var13 = "Yesterday";
                    } else {
                        var13 = this.field1368 + " days ago";
                    }
                    arg0.field101 = var13 + " you changed your recovery questions";
                }
            }
            if (var3 == 653) {
                if (this.field1368 == 201) {
                    arg0.field101 = "";
                } else if (this.field1368 == 200) {
                    arg0.field101 = "We strongly recommend you do so now to secure your account.";
                } else {
                    arg0.field101 = "If you do not remember making this change then cancel it immediately";
                }
            }
            if (var3 == 654) {
                if (this.field1368 == 201) {
                    arg0.field101 = "";
                } else if (this.field1368 == 200) {
                    arg0.field101 = "Do this from the 'account management' area on our front webpage";
                } else {
                    arg0.field101 = "Do this from the 'account management' area on our front webpage";
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(B)V")
    public final void method532(byte arg0) {
        if (this.field1201 == 0 && this.field1174 == 0) {
            this.field1444[this.field1502] = "Walk here";
            this.field1378[this.field1502] = 660;
            this.field1376[this.field1502] = super.field19;
            this.field1377[this.field1502] = super.field20;
            ++this.field1502;
        }
        int var2 = -1;
        if (arg0 != 40) {
            this.field1305 = this.field1520.method291();
        }
        for (int var3 = 0; var3 < Model.field586; ++var3) {
            int var4 = Model.field587[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1529.method92(this.field1146, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method320(var8);
                    if (this.field1201 == 1) {
                        this.field1444[this.field1502] = "Use " + this.field1205 + " with @cya@" + var9.field916;
                        this.field1378[this.field1502] = 450;
                        this.field1379[this.field1502] = var4;
                        this.field1376[this.field1502] = var5;
                        this.field1377[this.field1502] = var6;
                        ++this.field1502;
                    } else if (this.field1174 == 1) {
                        if ((this.field1176 & 4) == 4) {
                            this.field1444[this.field1502] = this.field1177 + " @cya@" + var9.field916;
                            this.field1378[this.field1502] = 55;
                            this.field1379[this.field1502] = var4;
                            this.field1376[this.field1502] = var5;
                            this.field1377[this.field1502] = var6;
                            ++this.field1502;
                        }
                    } else {
                        if (var9.field932 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field932[var10] != null) {
                                    this.field1444[this.field1502] = var9.field932[var10] + " @cya@" + var9.field916;
                                    if (var10 == 0) {
                                        this.field1378[this.field1502] = 285;
                                    }
                                    if (var10 == 1) {
                                        this.field1378[this.field1502] = 504;
                                    }
                                    if (var10 == 2) {
                                        this.field1378[this.field1502] = 364;
                                    }
                                    if (var10 == 3) {
                                        this.field1378[this.field1502] = 581;
                                    }
                                    if (var10 == 4) {
                                        this.field1378[this.field1502] = 1501;
                                    }
                                    this.field1379[this.field1502] = var4;
                                    this.field1376[this.field1502] = var5;
                                    this.field1377[this.field1502] = var6;
                                    ++this.field1502;
                                }
                            }
                        }
                        this.field1444[this.field1502] = "Examine @cya@" + var9.field916;
                        this.field1378[this.field1502] = 1175;
                        this.field1379[this.field1502] = var4;
                        this.field1376[this.field1502] = var5;
                        this.field1377[this.field1502] = var6;
                        ++this.field1502;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1230[var8];
                    if (var11.field450.field956 == 1 && (var11.field397 & 127) == 64 && (var11.field398 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1231; ++var12) {
                            NpcEntity var13 = this.field1230[this.field1232[var12]];
                            if (var13 != null && var11 != var13 && var13.field450.field956 == 1 && var11.field397 == var13.field397 && var11.field398 == var13.field398) {
                                this.method479(var5, (byte) -50, this.field1232[var12], var6, var13.field450);
                            }
                        }
                    }
                    this.method479(var5, (byte) -50, var8, var6, var11.field450);
                }
                if (var7 == 0) {
                    PlayerEntity var14 = this.field1494[var8];
                    if ((var14.field397 & 127) == 64 && (var14.field398 & 127) == 64) {
                        for (int var15 = 0; var15 < this.field1231; ++var15) {
                            NpcEntity var18 = this.field1230[this.field1232[var15]];
                            if (var18 != null && var18.field450.field956 == 1 && var14.field397 == var18.field397 && var14.field398 == var18.field398) {
                                this.method479(var5, (byte) -50, this.field1232[var15], var6, var18.field450);
                            }
                        }
                        for (int var16 = 0; var16 < this.field1495; ++var16) {
                            PlayerEntity var17 = this.field1494[this.field1496[var16]];
                            if (var17 != null && var14 != var17 && var14.field397 == var17.field397 && var14.field398 == var17.field398) {
                                this.method425(var5, var17, this.field1496[var16], var6, -431);
                            }
                        }
                    }
                    this.method425(var5, var14, var8, var6, -431);
                }
                if (var7 == 3) {
                    LinkList var19 = this.field1329[this.field1146][var5][var6];
                    if (var19 != null) {
                        for (ObjStackEntity var20 = (ObjStackEntity) var19.method251(true); var20 != null; var20 = (ObjStackEntity) var19.method253(true)) {
                            ObjType var21 = ObjType.method335(var20.field487);
                            if (this.field1201 == 1) {
                                this.field1444[this.field1502] = "Use " + this.field1205 + " with @lre@" + var21.field986;
                                this.field1378[this.field1502] = 217;
                                this.field1379[this.field1502] = var20.field487;
                                this.field1376[this.field1502] = var5;
                                this.field1377[this.field1502] = var6;
                                ++this.field1502;
                            } else if (this.field1174 == 1) {
                                if ((this.field1176 & 1) == 1) {
                                    this.field1444[this.field1502] = this.field1177 + " @lre@" + var21.field986;
                                    this.field1378[this.field1502] = 965;
                                    this.field1379[this.field1502] = var20.field487;
                                    this.field1376[this.field1502] = var5;
                                    this.field1377[this.field1502] = var6;
                                    ++this.field1502;
                                }
                            } else {
                                for (int var22 = 4; var22 >= 0; --var22) {
                                    if (var21.field1001 != null && var21.field1001[var22] != null) {
                                        this.field1444[this.field1502] = var21.field1001[var22] + " @lre@" + var21.field986;
                                        if (var22 == 0) {
                                            this.field1378[this.field1502] = 224;
                                        }
                                        if (var22 == 1) {
                                            this.field1378[this.field1502] = 993;
                                        }
                                        if (var22 == 2) {
                                            this.field1378[this.field1502] = 99;
                                        }
                                        if (var22 == 3) {
                                            this.field1378[this.field1502] = 746;
                                        }
                                        if (var22 == 4) {
                                            this.field1378[this.field1502] = 877;
                                        }
                                        this.field1379[this.field1502] = var20.field487;
                                        this.field1376[this.field1502] = var5;
                                        this.field1377[this.field1502] = var6;
                                        ++this.field1502;
                                    } else if (var22 == 2) {
                                        this.field1444[this.field1502] = "Take @lre@" + var21.field986;
                                        this.field1378[this.field1502] = 99;
                                        this.field1379[this.field1502] = var20.field487;
                                        this.field1376[this.field1502] = var5;
                                        this.field1377[this.field1502] = var6;
                                        ++this.field1502;
                                    }
                                }
                                this.field1444[this.field1502] = "Examine @lre@" + var21.field986;
                                this.field1378[this.field1502] = 1102;
                                this.field1379[this.field1502] = var20.field487;
                                this.field1376[this.field1502] = var5;
                                this.field1377[this.field1502] = var6;
                                ++this.field1502;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method533(String arg0) throws IOException {
        return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)V")
    public final void method534(int arg0, boolean arg1) {
        int[] var3 = this.field1373.field651;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field1526[arg0][var24][var6] & 24) == 0) {
                    this.field1529.method97(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field1526[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field1529.method97(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field1373.method186((byte) 0);
        if (!arg1) {
            this.field1548 = this.field1426.method231();
        }
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field1526[arg0][var22][var9] & 24) == 0) {
                    this.method440(var7, var22, (byte) 72, arg0, var8, var9);
                }
                if (arg0 < 3 && (this.field1526[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method440(var7, var22, (byte) 72, arg0 + 1, var8, var9);
                }
            }
        }
        this.field1431.method260((byte) 0);
        this.field1214 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field1529.method91(this.field1146, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = LocType.method320(var13).field934;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field1471[this.field1146].field1034;
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
                        this.field1211[this.field1214] = this.field1375[var14];
                        this.field1215[this.field1214] = var15;
                        this.field1216[this.field1214] = var16;
                        ++this.field1214;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method535(int arg0) {
        byte[] var2 = this.field1514.method295("title.dat", (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1359.method260((byte) 0);
        var3.method188(0, 0, -7650);
        this.field1360.method260((byte) 0);
        var3.method188(-661, 0, -7650);
        if (arg0 >= 3 && arg0 <= 3) {
            this.field1356.method260((byte) 0);
            var3.method188(-128, 0, -7650);
            this.field1357.method260((byte) 0);
            var3.method188(-214, -386, -7650);
            this.field1358.method260((byte) 0);
            var3.method188(-214, -186, -7650);
            this.field1361.method260((byte) 0);
            var3.method188(0, -265, -7650);
            this.field1362.method260((byte) 0);
            var3.method188(-574, -265, -7650);
            this.field1363.method260((byte) 0);
            var3.method188(-128, -186, -7650);
            this.field1364.method260((byte) 0);
            var3.method188(-574, -186, -7650);
            int[] var4 = new int[var3.field652];
            for (int var5 = 0; var5 < var3.field653; ++var5) {
                for (int var10 = 0; var10 < var3.field652; ++var10) {
                    var4[var10] = var3.field651[var3.field652 * var5 + (var3.field652 - var10 - 1)];
                }
                for (int var11 = 0; var11 < var3.field652; ++var11) {
                    var3.field651[var3.field652 * var5 + var11] = var4[var11];
                }
            }
            this.field1359.method260((byte) 0);
            var3.method188(394, 0, -7650);
            this.field1360.method260((byte) 0);
            var3.method188(-267, 0, -7650);
            this.field1356.method260((byte) 0);
            var3.method188(266, 0, -7650);
            this.field1357.method260((byte) 0);
            var3.method188(180, -386, -7650);
            this.field1358.method260((byte) 0);
            var3.method188(180, -186, -7650);
            this.field1361.method260((byte) 0);
            var3.method188(394, -265, -7650);
            this.field1362.method260((byte) 0);
            var3.method188(-180, -265, -7650);
            this.field1363.method260((byte) 0);
            var3.method188(212, -186, -7650);
            this.field1364.method260((byte) 0);
            var3.method188(-180, -186, -7650);
            Pix32 var6 = new Pix32(this.field1514, "logo", 0);
            this.field1356.method260((byte) 0);
            var6.method190(super.field10 / 2 - var6.field652 / 2 - 128, 18, 373);
            Object var7 = null;
            Object var8 = null;
            Object var9 = null;
            System.gc();
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method536(int arg0) {
        ProjectileEntity var2 = (ProjectileEntity) this.field1249.method250();
        if (arg0 != 0) {
            this.field1491.method221(30);
        }
        while (var2 != null) {
            if (this.field1146 == var2.field493 && field1288 <= var2.field499) {
                if (field1288 >= var2.field498) {
                    if (var2.field502 > 0) {
                        NpcEntity var3 = this.field1230[var2.field502 - 1];
                        if (var3 != null) {
                            var2.method129(172, var3.field397, field1288, this.method499(var3.field398, var3.field397, var2.field493, (byte) 67) - var2.field497, var3.field398);
                        }
                    }
                    if (var2.field502 < 0) {
                        int var4 = -var2.field502 - 1;
                        PlayerEntity var5;
                        if (this.field1521 == var4) {
                            var5 = field1316;
                        } else {
                            var5 = this.field1494[var4];
                        }
                        if (var5 != null) {
                            var2.method129(172, var5.field397, field1288, this.method499(var5.field398, var5.field397, var2.field493, (byte) 67) - var2.field497, var5.field398);
                        }
                    }
                    var2.method130(this.field1338, 6);
                    this.field1529.method73((int) var2.field504, var2.field512, (byte) 6, -1, this.field1146, (int) var2.field505, false, var2, 60, (int) var2.field506);
                }
            } else {
                var2.method118();
            }
            var2 = (ProjectileEntity) this.field1249.method252(7);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)Z")
    public final boolean method537(byte arg0, int arg1) {
        if (arg0 != 78) {
            this.method6();
        }
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field1378[arg1];
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 406;
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method538(int arg0) {
        if (this.field1432 == null) {
            this.method461(715);
            super.field13 = null;
            this.field1356 = null;
            this.field1357 = null;
            this.field1358 = null;
            this.field1359 = null;
            this.field1360 = null;
            this.field1361 = null;
            this.field1362 = null;
            this.field1363 = null;
            this.field1364 = null;
            this.field1432 = new PixMap(this.method11(true), 479, true, 96);
            this.field1430 = new PixMap(this.method11(true), 168, true, 160);
            Pix2D.method164(this.field1184);
            this.field1353.method204(0, 0, 373);
            this.field1429 = new PixMap(this.method11(true), 190, true, 261);
            this.field1431 = new PixMap(this.method11(true), 512, true, 334);
            Pix2D.method164(this.field1184);
            this.field1255 = new PixMap(this.method11(true), 501, true, 61);
            this.field1256 = new PixMap(this.method11(true), 288, true, 40);
            this.field1257 = new PixMap(this.method11(true), 269, true, 66);
            this.field1366 = true;
            while (arg0 >= 0) {
                this.field1548 = -1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(B)I")
    public final int method539(byte arg0) {
        int var2 = 3;
        if (arg0 != 3) {
            return this.field1335;
        } else {
            if (this.field1222 < 310) {
                int var3 = this.field1219 >> 7;
                int var4 = this.field1221 >> 7;
                int var5 = field1316.field397 >> 7;
                int var6 = field1316.field398 >> 7;
                if ((this.field1526[this.field1146][var3][var4] & 4) != 0) {
                    var2 = this.field1146;
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
                        if ((this.field1526[this.field1146][var3][var4] & 4) != 0) {
                            var2 = this.field1146;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field1526[this.field1146][var3][var4] & 4) != 0) {
                                var2 = this.field1146;
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
                        if ((this.field1526[this.field1146][var3][var4] & 4) != 0) {
                            var2 = this.field1146;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field1526[this.field1146][var3][var4] & 4) != 0) {
                                var2 = this.field1146;
                            }
                        }
                    }
                }
            }
            if ((this.field1526[this.field1146][field1316.field397 >> 7][field1316.field398 >> 7] & 4) != 0) {
                var2 = this.field1146;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)I")
    public final int method540(int arg0) {
        int var2 = this.method499(this.field1221, this.field1219, this.field1146, (byte) 67);
        if (arg0 != 6) {
            return 0;
        } else {
            return var2 - this.field1220 < 800 && (this.field1526[this.field1146][this.field1219 >> 7][this.field1221 >> 7] & 4) != 0 ? this.field1146 : 3;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;)V")
    public final void method13(int arg0, int arg1, String arg2) {
        this.method493((byte) 82);
        if (this.field1514 == null) {
            super.method13(field1453, arg1, arg2);
        } else {
            this.field1358.method260((byte) 0);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1319.method206("RuneScape is loading - please wait...", var4 / 2, var5 / 2 - 26 - var6, 39475, 16777215);
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method166(var7, 34, var4 / 2 - 152, 304, 9179409, (byte) 0);
            Pix2D.method166(var7 + 1, 32, var4 / 2 - 151, 302, 0, (byte) 0);
            Pix2D.method165(var4 / 2 - 150, arg1 * 3, 9179409, 30, (byte) 5, var7 + 2);
            this.field1547 += arg0;
            Pix2D.method165(arg1 * 3 + (var4 / 2 - 150), 300 - arg1 * 3, 0, 30, (byte) 5, var7 + 2);
            this.field1319.method206(arg2, var4 / 2, var5 / 2 + 5 - var6, 39475, 16777215);
            this.field1358.method261(214, -49767, super.field12, 186);
            if (this.field1366) {
                this.field1366 = false;
                if (!this.field1206) {
                    this.field1359.method261(0, -49767, super.field12, 0);
                    this.field1360.method261(661, -49767, super.field12, 0);
                }
                this.field1356.method261(128, -49767, super.field12, 0);
                this.field1357.method261(214, -49767, super.field12, 386);
                this.field1361.method261(0, -49767, super.field12, 265);
                this.field1362.method261(574, -49767, super.field12, 265);
                this.field1363.method261(128, -49767, super.field12, 186);
                this.field1364.method261(574, -49767, super.field12, 186);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;IILjava/lang/String;I)Lyb;")
    public final Jagfile method541(int arg0, String arg1, int arg2, int arg3, String arg4, int arg5) {
        byte[] var7 = null;
        if (arg0 < 2 || arg0 > 2) {
            this.method6();
        }
        int var8 = 5;
        try {
            if (this.field1218[0] != null) {
                var7 = this.field1218[0].method287(false, arg5);
            }
        } catch (Exception var25) {
            signlink.reporterror("loaderror: lj1 " + arg1);
        }
        if (var7 != null) {
            this.field1535.reset();
            this.field1535.update(var7);
            int var9 = (int) this.field1535.getValue();
            if (arg3 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(var7, (byte) 49);
        } else {
            while (var7 == null) {
                this.method13(field1453, arg2, "Requesting " + arg4);
                try {
                    int var11 = 0;
                    DataInputStream var12 = this.method533(arg1 + arg3);
                    byte[] var13 = new byte[6];
                    var12.readFully(var13, 0, 6);
                    Packet var14 = new Packet(699, var13);
                    var14.field694 = 3;
                    int var15 = var14.method235() + 6;
                    int var16 = 6;
                    var7 = new byte[var15];
                    for (int var17 = 0; var17 < 6; ++var17) {
                        var7[var17] = var13[var17];
                    }
                    while (var16 < var15) {
                        int var18 = var15 - var16;
                        if (var18 > 1000) {
                            var18 = 1000;
                        }
                        var16 += var12.read(var7, var16, var18);
                        int var19 = var16 * 100 / var15;
                        if (var11 != var19) {
                            this.method13(field1453, arg2, "Loading " + arg4 + " - " + var19 + "%");
                        }
                        var11 = var19;
                    }
                    var12.close();
                    try {
                        if (this.field1218[0] != null) {
                            this.field1218[0].method288(var7.length, var7, -437, arg5);
                        }
                    } catch (Exception var24) {
                        signlink.reporterror("loaderror: lj3 " + arg1);
                    }
                    this.field1535.reset();
                    this.field1535.update(var7);
                    int var20 = (int) this.field1535.getValue();
                    if (arg3 != var20) {
                        signlink.reporterror("loaderror: lj2 " + arg1 + " crc:" + arg3 + " crc2:" + var20);
                    }
                } catch (IOException var26) {
                    var7 = null;
                    for (int var21 = var8; var21 > 0; --var21) {
                        this.method13(field1453, arg2, "Error loading - Will retry in " + var21 + " secs.");
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception var23) {
                        }
                    }
                    var8 *= 2;
                    if (var8 > 60) {
                        var8 = 60;
                    }
                } catch (Exception var27) {
                    signlink.reporterror("loaderror: lj4 " + arg1);
                }
            }
            return new Jagfile(var7, (byte) 49);
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method542(boolean arg0) {
        if (!arg0) {
            this.field1548 = this.field1426.method231();
        }
        LocType.field946.method115();
        LocType.field947.method115();
        NpcType.field975.method115();
        ObjType.field1019.method115();
        ObjType.field1020.method115();
        PlayerEntity.field474.method115();
        SpotAnimType.field1097.method115();
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method543(int arg0) {
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 != 3) {
            this.field1548 = -1;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field1178[var1] = var0 / 4;
        }
        field1182 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field1258 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field1260 = -930;
        field1271 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field1273 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field1472 = -31142;
        field1500 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field1532 = -796;
    }
}
