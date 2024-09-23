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

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field1098 = 24676;

    @OriginalMember(owner = "client", name = "O", descriptor = "I")
    private int field1099 = -1;

    @OriginalMember(owner = "client", name = "W", descriptor = "[I")
    private int[] field1107 = new int[5];

    @OriginalMember(owner = "client", name = "X", descriptor = "Lkb;")
    private Packet field1108 = Packet.method203(1, -737);

    @OriginalMember(owner = "client", name = "fb", descriptor = "Z")
    private boolean field1116 = false;

    @OriginalMember(owner = "client", name = "gb", descriptor = "Lob;")
    private LinkList field1117 = new LinkList(0);

    @OriginalMember(owner = "client", name = "ib", descriptor = "[Z")
    private boolean[] field1119 = new boolean[5];

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field1121 = 9;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field1122 = 3;

    @OriginalMember(owner = "client", name = "mb", descriptor = "[[I")
    private int[][] field1123 = new int[104][104];

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field1124 = 997;

    @OriginalMember(owner = "client", name = "tb", descriptor = "Ljava/lang/String;")
    private String field1130 = "";

    @OriginalMember(owner = "client", name = "ub", descriptor = "B")
    private byte field1131 = 106;

    @OriginalMember(owner = "client", name = "vb", descriptor = "Lob;")
    private LinkList field1132 = new LinkList(0);

    @OriginalMember(owner = "client", name = "wb", descriptor = "[J")
    private long[] field1133 = new long[100];

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field1136 = 723;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "[I")
    private int[] field1138 = new int[100];

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field1139 = -1;

    @OriginalMember(owner = "client", name = "Db", descriptor = "Ljava/lang/String;")
    private String field1140 = "";

    @OriginalMember(owner = "client", name = "Eb", descriptor = "[Lhb;")
    private Pix32[] field1141 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field1143 = 332;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "Ljava/lang/String;")
    private String field1149 = "";

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field1151 = -1;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "Z")
    private boolean field1152 = true;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "Z")
    private boolean field1153 = false;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "[I")
    private int[] field1154 = new int[7];

    @OriginalMember(owner = "client", name = "Sb", descriptor = "B")
    private byte field1155 = 8;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "[Lhb;")
    private Pix32[] field1156 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field1157 = 78;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "Lkb;")
    private Packet field1160 = Packet.method203(1, -737);

    @OriginalMember(owner = "client", name = "ac", descriptor = "Lkb;")
    private Packet field1163 = Packet.method203(1, -737);

    @OriginalMember(owner = "client", name = "bc", descriptor = "Z")
    private boolean field1164 = false;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field1168 = 3;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field1170 = -655;

    @OriginalMember(owner = "client", name = "jc", descriptor = "[I")
    private int[] field1172 = new int[50];

    @OriginalMember(owner = "client", name = "kc", descriptor = "Lhc;")
    private Component field1173 = new Component();

    @OriginalMember(owner = "client", name = "lc", descriptor = "[I")
    private int[] field1174 = new int[50];

    @OriginalMember(owner = "client", name = "nc", descriptor = "[I")
    private int[] field1176 = new int[9];

    @OriginalMember(owner = "client", name = "oc", descriptor = "Z")
    private boolean field1177 = true;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field1178 = 4277;

    @OriginalMember(owner = "client", name = "qc", descriptor = "[Lib;")
    private Pix8[] field1179 = new Pix8[13];

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field1181 = 128;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field1185 = 2048;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field1186 = 2047;

    @OriginalMember(owner = "client", name = "yc", descriptor = "[Lz;")
    private PlayerEntity[] field1187 = new PlayerEntity[this.field1185];

    @OriginalMember(owner = "client", name = "Ac", descriptor = "[I")
    public int[] field1189 = new int[this.field1185];

    @OriginalMember(owner = "client", name = "Cc", descriptor = "[I")
    private int[] field1191 = new int[this.field1185];

    @OriginalMember(owner = "client", name = "Dc", descriptor = "[Lkb;")
    private Packet[] field1192 = new Packet[this.field1185];

    @OriginalMember(owner = "client", name = "Ic", descriptor = "Lob;")
    private LinkList field1197 = new LinkList(0);

    @OriginalMember(owner = "client", name = "Kc", descriptor = "[Ljava/lang/String;")
    private String[] field1199 = new String[500];

    @OriginalMember(owner = "client", name = "Lc", descriptor = "Z")
    private boolean field1200 = true;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "Z")
    private boolean field1201 = true;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "B")
    private byte field1208 = 4;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "Z")
    private boolean field1214 = false;

    @OriginalMember(owner = "client", name = "ad", descriptor = "[I")
    private int[] field1215 = new int[256];

    @OriginalMember(owner = "client", name = "bd", descriptor = "B")
    private byte field1216 = 2;

    @OriginalMember(owner = "client", name = "gd", descriptor = "[I")
    private int[] field1221 = new int[33];

    @OriginalMember(owner = "client", name = "id", descriptor = "[I")
    private int[] field1223 = new int[50];

    @OriginalMember(owner = "client", name = "kd", descriptor = "Z")
    private boolean field1225 = false;

    @OriginalMember(owner = "client", name = "ld", descriptor = "[I")
    private int[] field1226 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "pd", descriptor = "Z")
    private boolean field1230 = false;

    @OriginalMember(owner = "client", name = "qd", descriptor = "B")
    private byte field1231 = 99;

    @OriginalMember(owner = "client", name = "td", descriptor = "Z")
    private boolean field1234 = false;

    @OriginalMember(owner = "client", name = "wd", descriptor = "Z")
    private boolean field1237 = false;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private final int field1242 = 100;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "[I")
    private int[] field1243 = new int[100];

    @OriginalMember(owner = "client", name = "Dd", descriptor = "Z")
    private boolean field1244 = false;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "Z")
    private boolean field1246 = false;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field1248 = -655;

    @OriginalMember(owner = "client", name = "Id", descriptor = "Lob;")
    private LinkList field1249 = new LinkList(0);

    @OriginalMember(owner = "client", name = "Ud", descriptor = "[I")
    private int[] field1261 = new int[100];

    @OriginalMember(owner = "client", name = "Vd", descriptor = "[Ljava/lang/String;")
    private String[] field1262 = new String[100];

    @OriginalMember(owner = "client", name = "Wd", descriptor = "[Ljava/lang/String;")
    private String[] field1263 = new String[100];

    @OriginalMember(owner = "client", name = "ae", descriptor = "Z")
    private boolean field1267 = false;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field1272 = -1;

    @OriginalMember(owner = "client", name = "ke", descriptor = "Z")
    private boolean field1277 = false;

    @OriginalMember(owner = "client", name = "qe", descriptor = "[I")
    private int[] field1283 = new int[1000];

    @OriginalMember(owner = "client", name = "re", descriptor = "[I")
    private int[] field1284 = new int[1000];

    @OriginalMember(owner = "client", name = "se", descriptor = "[[I")
    private int[][] field1285 = new int[104][104];

    @OriginalMember(owner = "client", name = "te", descriptor = "Z")
    private boolean field1286 = false;

    @OriginalMember(owner = "client", name = "ve", descriptor = "Z")
    private boolean field1288 = false;

    @OriginalMember(owner = "client", name = "ye", descriptor = "[I")
    private int[] field1291 = new int[50];

    @OriginalMember(owner = "client", name = "ze", descriptor = "[Ly;")
    private NpcEntity[] field1292 = new NpcEntity[8192];

    @OriginalMember(owner = "client", name = "Be", descriptor = "[I")
    public int[] field1294 = new int[8192];

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field1296 = 1;

    @OriginalMember(owner = "client", name = "He", descriptor = "B")
    private byte field1300 = -46;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "[I")
    private int[] field1303 = new int[2000];

    @OriginalMember(owner = "client", name = "Me", descriptor = "[I")
    public int[] field1305 = new int[1000];

    @OriginalMember(owner = "client", name = "Pe", descriptor = "[J")
    private long[] field1308 = new long[100];

    @OriginalMember(owner = "client", name = "Ze", descriptor = "[I")
    private int[] field1318 = new int[151];

    @OriginalMember(owner = "client", name = "af", descriptor = "[Lec;")
    private CollisionMap[] field1319 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "cf", descriptor = "[Lhb;")
    private Pix32[] field1321 = new Pix32[20];

    @OriginalMember(owner = "client", name = "ff", descriptor = "[I")
    private int[] field1324 = new int[5];

    @OriginalMember(owner = "client", name = "gf", descriptor = "Z")
    private boolean field1325 = false;

    @OriginalMember(owner = "client", name = "lf", descriptor = "Z")
    private boolean field1329 = false;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Z")
    private boolean field1330 = false;

    @OriginalMember(owner = "client", name = "nf", descriptor = "[I")
    private int[] field1331 = new int[5];

    @OriginalMember(owner = "client", name = "pf", descriptor = "Z")
    private boolean field1333 = false;

    @OriginalMember(owner = "client", name = "rf", descriptor = "Ljava/lang/String;")
    private String field1335 = "";

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field1336 = -1;

    @OriginalMember(owner = "client", name = "vf", descriptor = "Z")
    private boolean field1339 = false;

    @OriginalMember(owner = "client", name = "wf", descriptor = "Z")
    private boolean field1340 = false;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field1345 = 3353893;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "Z")
    private boolean field1355 = false;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field1358 = 7759444;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "[I")
    private int[] field1359 = new int[4000];

    @OriginalMember(owner = "client", name = "Qf", descriptor = "[I")
    private int[] field1360 = new int[4000];

    @OriginalMember(owner = "client", name = "Rf", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1361 = new CRC32();

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field1366 = -1;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field1384 = -1;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field1385 = -1;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field1386 = -1;

    @OriginalMember(owner = "client", name = "sg", descriptor = "Z")
    private boolean field1388 = false;

    @OriginalMember(owner = "client", name = "tg", descriptor = "[I")
    private int[] field1389 = new int[5];

    @OriginalMember(owner = "client", name = "Hg", descriptor = "[Lib;")
    private Pix8[] field1403 = new Pix8[50];

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field1404 = 27808;

    @OriginalMember(owner = "client", name = "Og", descriptor = "[I")
    private int[] field1410 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field1415 = 2301979;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "Z")
    private boolean field1420 = false;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Lob;")
    private LinkList field1421 = new LinkList(0);

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field1430 = -1;

    @OriginalMember(owner = "client", name = "jh", descriptor = "Ljava/lang/String;")
    private String field1431 = "";

    @OriginalMember(owner = "client", name = "kh", descriptor = "Ljava/lang/String;")
    private String field1432 = "";

    @OriginalMember(owner = "client", name = "lh", descriptor = "B")
    private byte field1433 = 7;

    @OriginalMember(owner = "client", name = "mh", descriptor = "[B")
    private byte[] field1434 = new byte[16384];

    @OriginalMember(owner = "client", name = "nh", descriptor = "Z")
    private boolean field1435 = false;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field1436 = 242;

    @OriginalMember(owner = "client", name = "sh", descriptor = "[I")
    private int[] field1440 = new int[2000];

    @OriginalMember(owner = "client", name = "wh", descriptor = "[I")
    private int[] field1444 = new int[50];

    @OriginalMember(owner = "client", name = "xh", descriptor = "Z")
    private boolean field1445 = false;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "Ljava/lang/String;")
    private String field1448 = "";

    @OriginalMember(owner = "client", name = "Bh", descriptor = "Ljava/lang/String;")
    private String field1449 = "";

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private int field1451 = 2;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field1457 = 50;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "[I")
    private int[] field1458 = new int[this.field1457];

    @OriginalMember(owner = "client", name = "Lh", descriptor = "[I")
    private int[] field1459 = new int[this.field1457];

    @OriginalMember(owner = "client", name = "Mh", descriptor = "[I")
    private int[] field1460 = new int[this.field1457];

    @OriginalMember(owner = "client", name = "Nh", descriptor = "[I")
    private int[] field1461 = new int[this.field1457];

    @OriginalMember(owner = "client", name = "Oh", descriptor = "[I")
    private int[] field1462 = new int[this.field1457];

    @OriginalMember(owner = "client", name = "Ph", descriptor = "[I")
    private int[] field1463 = new int[this.field1457];

    @OriginalMember(owner = "client", name = "Qh", descriptor = "[I")
    private int[] field1464 = new int[this.field1457];

    @OriginalMember(owner = "client", name = "Rh", descriptor = "[Ljava/lang/String;")
    private String[] field1465 = new String[this.field1457];

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field1470 = -986;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field1471 = -35388;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "[I")
    private final int[] field1472 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "ii", descriptor = "[I")
    private int[] field1482 = new int[33];

    @OriginalMember(owner = "client", name = "ji", descriptor = "[[I")
    private int[][] field1483 = new int[104][104];

    @OriginalMember(owner = "client", name = "li", descriptor = "[Lhb;")
    private Pix32[] field1485 = new Pix32[8];

    @OriginalMember(owner = "client", name = "mi", descriptor = "Z")
    private boolean field1486 = false;

    @OriginalMember(owner = "client", name = "ni", descriptor = "B")
    private byte field1487 = 94;

    @OriginalMember(owner = "client", name = "oi", descriptor = "Ljava/lang/Object;")
    private Object field1488 = new Object();

    @OriginalMember(owner = "client", name = "pi", descriptor = "[I")
    private int[] field1489 = new int[50];

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field1491 = 2;

    @OriginalMember(owner = "client", name = "si", descriptor = "[Ljava/lang/String;")
    private String[] field1492 = new String[100];

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field1493 = -1;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field1494 = -1;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field1496 = 2;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field1497 = 29286;

    @OriginalMember(owner = "client", name = "yi", descriptor = "[I")
    private int[] field1498 = new int[151];

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field1500 = 1;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "Ljava/lang/String;")
    private String field1502 = "";

    @OriginalMember(owner = "client", name = "Di", descriptor = "[Lhb;")
    private Pix32[] field1503 = new Pix32[50];

    @OriginalMember(owner = "client", name = "Ei", descriptor = "[I")
    private int[] field1504 = new int[500];

    @OriginalMember(owner = "client", name = "Fi", descriptor = "[I")
    private int[] field1505 = new int[500];

    @OriginalMember(owner = "client", name = "Gi", descriptor = "[I")
    private int[] field1506 = new int[500];

    @OriginalMember(owner = "client", name = "Hi", descriptor = "[I")
    private int[] field1507 = new int[500];

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field1508 = 701;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "Z")
    private boolean field1509 = false;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "Z")
    private boolean field1512 = true;

    @OriginalMember(owner = "client", name = "Si", descriptor = "Z")
    private boolean field1518 = true;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "[[[Lob;")
    private LinkList[][][] field1522 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field1523 = 5063219;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "[I")
    private int[] field1524 = new int[5];

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private int field1525 = -676;

    @OriginalMember(owner = "client", name = "F", descriptor = "Ljava/lang/String;")
    private static String field1090 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "od", descriptor = "[I")
    private static int[] field1229 = new int[99];

    @OriginalMember(owner = "client", name = "ud", descriptor = "Z")
    private static boolean field1235;

    @OriginalMember(owner = "client", name = "vd", descriptor = "B")
    private static byte field1236;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private static int field1251;

    @OriginalMember(owner = "client", name = "Md", descriptor = "Z")
    private static boolean field1253;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "I")
    private static int field1264;

    @OriginalMember(owner = "client", name = "ue", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1287;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "[[I")
    public static final int[][] field1307;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private static int field1323;

    @OriginalMember(owner = "client", name = "fh", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1427;

    @OriginalMember(owner = "client", name = "qh", descriptor = "[I")
    public static final int[] field1438;

    @OriginalMember(owner = "client", name = "hi", descriptor = "B")
    private static byte field1481;

    @OriginalMember(owner = "client", name = "E", descriptor = "I")
    private static int field1089;

    @OriginalMember(owner = "client", name = "G", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "client", name = "H", descriptor = "I")
    private int field1092;

    @OriginalMember(owner = "client", name = "I", descriptor = "I")
    private int field1093;

    @OriginalMember(owner = "client", name = "J", descriptor = "I")
    private int field1094;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field1095;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field1096;

    @OriginalMember(owner = "client", name = "M", descriptor = "I")
    private int field1097;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field1103;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field1104;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field1105;

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field1106;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field1109;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private int field1110;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field1111;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field1112;

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    private int field1113;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private int field1114;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private int field1115;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field1120;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private int field1125;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field1126;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field1127;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field1128;

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private int field1129;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field1134;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private static int field1137;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field1144;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field1145;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field1146;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private int field1147;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private int field1150;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field1161;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private static int field1162;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field1165;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1166;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field1167;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private static int field1169;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private static int field1171;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field1175;

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field1180;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field1182;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field1183;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field1184;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field1188;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field1190;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field1193;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field1194;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field1195;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field1202;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field1203;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field1204;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field1209;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field1210;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field1211;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private int field1213;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private static int field1222;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field1224;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field1228;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private static int field1232;

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field1238;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field1239;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field1240;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private static int field1241;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private static int field1247;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field1250;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "I")
    private static int field1252;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private static int field1255;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field1276;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private static int field1278;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field1280;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field1281;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field1282;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field1289;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1293;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field1295;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private static int field1302;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field1304;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field1309;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field1311;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field1312;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field1313;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field1314;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field1315;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field1316;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field1317;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field1328;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field1337;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field1341;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private static int field1363;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field1367;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field1369;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private int field1370;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private static int field1382;

    @OriginalMember(owner = "client", name = "ng", descriptor = "I")
    private int field1383;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field1387;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field1391;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field1392;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field1416;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field1417;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private int field1419;

    @OriginalMember(owner = "client", name = "eh", descriptor = "I")
    private int field1426;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field1441;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field1443;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "I")
    private int field1450;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field1452;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field1453;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private static int field1455;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field1456;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private static int field1473;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field1474;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private int field1476;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field1478;

    @OriginalMember(owner = "client", name = "fi", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field1514;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field1517;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private int field1519;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field1520;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private int field1521;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "J")
    private long field1142;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "J")
    private long field1265;

    @OriginalMember(owner = "client", name = "Li", descriptor = "J")
    private long field1511;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "Ld;")
    private ClientStream field1364;

    @OriginalMember(owner = "client", name = "hb", descriptor = "Ltb;")
    private Isaac field1118;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "Lub;")
    private Jagfile field1501;

    @OriginalMember(owner = "client", name = "hf", descriptor = "Lhb;")
    private Pix32 field1326;

    @OriginalMember(owner = "client", name = "jf", descriptor = "Lhb;")
    private Pix32 field1327;

    @OriginalMember(owner = "client", name = "zf", descriptor = "Lhb;")
    private Pix32 field1343;

    @OriginalMember(owner = "client", name = "Af", descriptor = "Lhb;")
    private Pix32 field1344;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "Lhb;")
    private Pix32 field1362;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "Lhb;")
    private Pix32 field1418;

    @OriginalMember(owner = "client", name = "ah", descriptor = "Lhb;")
    private Pix32 field1422;

    @OriginalMember(owner = "client", name = "bh", descriptor = "Lhb;")
    private Pix32 field1423;

    @OriginalMember(owner = "client", name = "ch", descriptor = "Lhb;")
    private Pix32 field1424;

    @OriginalMember(owner = "client", name = "dh", descriptor = "Lhb;")
    private Pix32 field1425;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "Lhb;")
    private Pix32 field1510;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "Lib;")
    private Pix8 field1256;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "Lib;")
    private Pix8 field1257;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "Lib;")
    private Pix8 field1258;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "Lib;")
    private Pix8 field1259;

    @OriginalMember(owner = "client", name = "Td", descriptor = "Lib;")
    private Pix8 field1260;

    @OriginalMember(owner = "client", name = "ge", descriptor = "Lib;")
    private Pix8 field1273;

    @OriginalMember(owner = "client", name = "he", descriptor = "Lib;")
    private Pix8 field1274;

    @OriginalMember(owner = "client", name = "ie", descriptor = "Lib;")
    private Pix8 field1275;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "Lib;")
    private Pix8 field1346;

    @OriginalMember(owner = "client", name = "Df", descriptor = "Lib;")
    private Pix8 field1347;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Lib;")
    private Pix8 field1348;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "Lib;")
    private Pix8 field1405;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "Lib;")
    private Pix8 field1406;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "Lib;")
    private Pix8 field1407;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "Lib;")
    private Pix8 field1408;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "Lib;")
    private Pix8 field1409;

    @OriginalMember(owner = "client", name = "yh", descriptor = "Lib;")
    private Pix8 field1446;

    @OriginalMember(owner = "client", name = "zh", descriptor = "Lib;")
    private Pix8 field1447;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "Lib;")
    private Pix8 field1468;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Lib;")
    private Pix8 field1469;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "Ljb;")
    private PixFont field1350;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "Ljb;")
    private PixFont field1351;

    @OriginalMember(owner = "client", name = "If", descriptor = "Ljb;")
    private PixFont field1352;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "Ljb;")
    private PixFont field1353;

    @OriginalMember(owner = "client", name = "cd", descriptor = "Lqb;")
    private PixMap field1217;

    @OriginalMember(owner = "client", name = "dd", descriptor = "Lqb;")
    private PixMap field1218;

    @OriginalMember(owner = "client", name = "ed", descriptor = "Lqb;")
    private PixMap field1219;

    @OriginalMember(owner = "client", name = "cg", descriptor = "Lqb;")
    private PixMap field1372;

    @OriginalMember(owner = "client", name = "dg", descriptor = "Lqb;")
    private PixMap field1373;

    @OriginalMember(owner = "client", name = "eg", descriptor = "Lqb;")
    private PixMap field1374;

    @OriginalMember(owner = "client", name = "fg", descriptor = "Lqb;")
    private PixMap field1375;

    @OriginalMember(owner = "client", name = "gg", descriptor = "Lqb;")
    private PixMap field1376;

    @OriginalMember(owner = "client", name = "hg", descriptor = "Lqb;")
    private PixMap field1377;

    @OriginalMember(owner = "client", name = "ig", descriptor = "Lqb;")
    private PixMap field1378;

    @OriginalMember(owner = "client", name = "jg", descriptor = "Lqb;")
    private PixMap field1379;

    @OriginalMember(owner = "client", name = "kg", descriptor = "Lqb;")
    private PixMap field1380;

    @OriginalMember(owner = "client", name = "lg", descriptor = "Lqb;")
    private PixMap field1381;

    @OriginalMember(owner = "client", name = "yg", descriptor = "Lqb;")
    private PixMap field1394;

    @OriginalMember(owner = "client", name = "zg", descriptor = "Lqb;")
    private PixMap field1395;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "Lqb;")
    private PixMap field1396;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "Lqb;")
    private PixMap field1397;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "Lqb;")
    private PixMap field1398;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "Lqb;")
    private PixMap field1399;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "Lqb;")
    private PixMap field1400;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "Lqb;")
    private PixMap field1401;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "Lqb;")
    private PixMap field1402;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "Lqb;")
    private PixMap field1411;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "Lqb;")
    private PixMap field1412;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "Lqb;")
    private PixMap field1413;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "Lqb;")
    private PixMap field1414;

    @OriginalMember(owner = "client", name = "of", descriptor = "Lz;")
    private PlayerEntity field1332;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "Lr;")
    private World3D field1196;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "Ljava/lang/String;")
    private String field1301;

    @OriginalMember(owner = "client", name = "bg", descriptor = "Ljava/lang/String;")
    public String field1371;

    @OriginalMember(owner = "client", name = "xg", descriptor = "Ljava/lang/String;")
    public String field1393;

    @OriginalMember(owner = "client", name = "hh", descriptor = "Ljava/lang/String;")
    private String field1429;

    @OriginalMember(owner = "client", name = "ki", descriptor = "Ljava/lang/String;")
    private String field1484;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "Z")
    private static boolean field1254;

    @OriginalMember(owner = "client", name = "Th", descriptor = "Z")
    private static boolean field1467;

    @OriginalMember(owner = "client", name = "P", descriptor = "[I")
    private int[] field1100;

    @OriginalMember(owner = "client", name = "Q", descriptor = "[I")
    private int[] field1101;

    @OriginalMember(owner = "client", name = "R", descriptor = "[I")
    private int[] field1102;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "[I")
    private int[] field1206;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "[I")
    private int[] field1207;

    @OriginalMember(owner = "client", name = "be", descriptor = "[I")
    private int[] field1268;

    @OriginalMember(owner = "client", name = "ce", descriptor = "[I")
    private int[] field1269;

    @OriginalMember(owner = "client", name = "de", descriptor = "[I")
    private int[] field1270;

    @OriginalMember(owner = "client", name = "ee", descriptor = "[I")
    private int[] field1271;

    @OriginalMember(owner = "client", name = "xe", descriptor = "[I")
    private int[] field1290;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "[I")
    private int[] field1356;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "[I")
    private int[] field1357;

    @OriginalMember(owner = "client", name = "uf", descriptor = "[Lib;")
    private Pix8[] field1338;

    @OriginalMember(owner = "client", name = "yb", descriptor = "[[B")
    private byte[][] field1135;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "[[B")
    private byte[][] field1365;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "[[[B")
    private byte[][][] field1205;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "[[[I")
    private int[][][] field1159;

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILjava/lang/String;I)V")
    public final void method371(boolean arg0, int arg1, String arg2, int arg3) {
        if (arg2 != null) {
            Object var5 = this.field1488;
            synchronized (this.field1488) {
                this.field1429 = arg2;
                this.field1328 = arg1;
                this.field1091 = arg3;
            }
            if (arg0) {
                this.field1145 = -1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method372(int arg0) {
        this.field1456 = 0;
        while (arg0 >= 0) {
            this.field1248 = this.field1118.nextInt();
        }
        for (int var2 = -1; var2 < this.field1293 + this.field1188; ++var2) {
            PathingEntity var17;
            if (var2 == -1) {
                var17 = this.field1332;
            } else if (var2 < this.field1188) {
                var17 = this.field1187[this.field1189[var2]];
            } else {
                var17 = this.field1292[this.field1294[var2 - this.field1188]];
            }
            if (var17 != null && var17.method112(false)) {
                if (var2 >= this.field1188) {
                    if (this.field1276 == 1 && this.field1294[var2 - this.field1188] == this.field1166 && field1320 % 20 < 10) {
                        this.method447(var17.field345 + 15, this.field1225, var17);
                        if (this.field1384 > -1) {
                            this.field1321[2].method175(this.field1385 - 28, this.field1384 - 12, false);
                        }
                    }
                } else {
                    int var18 = 30;
                    PlayerEntity var19 = (PlayerEntity) var17;
                    if (var19.field360 != 0) {
                        this.method447(var17.field345 + 15, this.field1225, var17);
                        if (this.field1384 > -1) {
                            for (int var20 = 0; var20 < 8; ++var20) {
                                if ((var19.field360 & 1 << var20) != 0) {
                                    this.field1321[var20].method175(this.field1385 - var18, this.field1384 - 12, false);
                                    var18 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1276 == 10 && this.field1189[var2] == this.field1441) {
                        this.method447(var17.field345 + 15, this.field1225, var17);
                        if (this.field1384 > -1) {
                            this.field1321[7].method175(this.field1385 - var18, this.field1384 - 12, false);
                        }
                    }
                }
                if (var17.field312 != null && (var2 >= this.field1188 || this.field1341 == 0 || this.field1341 == 3 || this.field1341 == 1 && this.method495(-20, ((PlayerEntity) var17).field357))) {
                    this.method447(var17.field345, this.field1225, var17);
                    if (this.field1384 > -1 && this.field1456 < this.field1457) {
                        this.field1461[this.field1456] = this.field1352.method193(false, var17.field312) / 2;
                        this.field1460[this.field1456] = this.field1352.field609;
                        this.field1458[this.field1456] = this.field1384;
                        this.field1459[this.field1456] = this.field1385;
                        this.field1462[this.field1456] = var17.field314;
                        this.field1463[this.field1456] = var17.field315;
                        this.field1464[this.field1456] = var17.field313;
                        this.field1465[this.field1456++] = var17.field312;
                        if (this.field1165 == 0 && var17.field315 == 1) {
                            this.field1460[this.field1456] += 10;
                            this.field1459[this.field1456] += 5;
                        }
                        if (this.field1165 == 0 && var17.field315 == 2) {
                            this.field1461[this.field1456] = 60;
                        }
                    }
                }
                if (var17.field318 > field1320 + 100) {
                    this.method447(var17.field345 + 15, this.field1225, var17);
                    if (this.field1384 > -1) {
                        int var21 = var17.field319 * 30 / var17.field320;
                        if (var21 > 30) {
                            var21 = 30;
                        }
                        Pix2D.method150(this.field1385 - 3, this.field1384 - 15, 65280, (byte) 93, var21, 5);
                        Pix2D.method150(this.field1385 - 3, this.field1384 - 15 + var21, 16711680, (byte) 93, 30 - var21, 5);
                    }
                }
                if (var17.field318 > field1320 + 330) {
                    this.method447(var17.field345 / 2, this.field1225, var17);
                    if (this.field1384 > -1) {
                        this.field1141[var17.field317].method175(this.field1385 - 12, this.field1384 - 12, false);
                        this.field1350.method191(this.field1385 + 4, (byte) 6, 0, String.valueOf(var17.field316), this.field1384);
                        this.field1350.method191(this.field1385 + 3, (byte) 6, 16777215, String.valueOf(var17.field316), this.field1384 - 1);
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field1456; ++var3) {
            int var4 = this.field1458[var3];
            int var5 = this.field1459[var3];
            int var6 = this.field1461[var3];
            int var7 = this.field1460[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var16 = 0; var16 < var3; ++var16) {
                    if (var5 + 2 > this.field1459[var16] - this.field1460[var16] && var5 - var7 < this.field1459[var16] + 2 && var4 - var6 < this.field1461[var16] + this.field1458[var16] && var4 + var6 > this.field1458[var16] - this.field1461[var16] && this.field1459[var16] - this.field1460[var16] < var5) {
                        var5 = this.field1459[var16] - this.field1460[var16];
                        var8 = true;
                    }
                }
            }
            this.field1384 = this.field1458[var3];
            this.field1385 = this.field1459[var3] = var5;
            String var9 = this.field1465[var3];
            if (this.field1165 == 0) {
                int var10 = 16776960;
                if (this.field1462[var3] < 6) {
                    var10 = this.field1410[this.field1462[var3]];
                }
                if (this.field1462[var3] == 6) {
                    var10 = this.field1202 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1462[var3] == 7) {
                    var10 = this.field1202 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1462[var3] == 8) {
                    var10 = this.field1202 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1462[var3] == 9) {
                    int var11 = 150 - this.field1464[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field1462[var3] == 10) {
                    int var12 = 150 - this.field1464[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field1462[var3] == 11) {
                    int var13 = 150 - this.field1464[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field1463[var3] == 0) {
                    this.field1352.method191(this.field1385 + 1, (byte) 6, 0, var9, this.field1384);
                    this.field1352.method191(this.field1385, (byte) 6, var10, var9, this.field1384);
                }
                if (this.field1463[var3] == 1) {
                    this.field1352.method195(this.field1202, (byte) 8, this.field1384, this.field1385 + 1, 0, var9);
                    this.field1352.method195(this.field1202, (byte) 8, this.field1384, this.field1385, var10, var9);
                }
                if (this.field1463[var3] == 2) {
                    int var14 = this.field1352.method193(false, var9);
                    int var15 = (150 - this.field1464[var3]) * (var14 + 100) / 150;
                    Pix2D.method148(334, 0, this.field1384 + 50, 789, this.field1384 - 50);
                    this.field1352.method194(this.field1384 + 50 - var15, this.field1385 + 1, false, 0, var9);
                    this.field1352.method194(this.field1384 + 50 - var15, this.field1385, false, var10, var9);
                    Pix2D.method147(0);
                }
            } else {
                this.field1352.method191(this.field1385 + 1, (byte) 6, 0, var9, this.field1384);
                this.field1352.method191(this.field1385, (byte) 6, 16776960, var9, this.field1384);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method373(byte arg0) {
        if (arg0 != -60) {
            this.field1522 = null;
        }
        this.field1163.method205((byte) -34, 231);
        if (this.field1494 != -1) {
            this.field1494 = -1;
            this.field1329 = true;
            this.field1237 = false;
            this.field1445 = true;
        }
        if (this.field1366 != -1) {
            this.field1366 = -1;
            this.field1330 = true;
            this.field1237 = false;
        }
        this.field1336 = -1;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method374(int arg0) {
        if (arg0 != 0) {
            this.method6();
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method375(int arg0) {
        int var2 = (this.field1332.field300 >> 7) + this.field1126;
        int var3 = (this.field1332.field301 >> 7) + this.field1127;
        if (arg0 != 39734) {
            this.field1277 = !this.field1277;
        }
        if (var2 >= 2944 && var2 < 3392 && var3 >= 3520 && var3 < 6400) {
            this.field1466 = (var3 - 3520) / 8 + 1;
        } else if (var2 >= 2944 && var2 < 3392 && var3 >= 9920 && var3 < 12800) {
            this.field1466 = (var3 - 9920) / 8 + 1;
        } else {
            this.field1466 = 0;
        }
        this.field1298 = 0;
        if (var2 >= 3328 && var2 < 3392 && var3 >= 3200 && var3 < 3264) {
            int var4 = var2 & 63;
            int var5 = var3 & 63;
            if (var4 >= 4 && var4 <= 29 && var5 >= 44 && var5 <= 58) {
                this.field1298 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 44 && var5 <= 58) {
                this.field1298 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 25 && var5 <= 39) {
                this.field1298 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 25 && var5 <= 39) {
                this.field1298 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 6 && var5 <= 20) {
                this.field1298 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 6 && var5 <= 20) {
                this.field1298 = 1;
            }
        }
        if (this.field1298 == 0 && var2 >= 3328 && var2 <= 3393 && var3 >= 3203 && var3 <= 3325) {
            this.field1298 = 2;
        }
        this.field1167 = 0;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1167 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1167 = 1;
        }
        if (this.field1167 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1167 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method376(int arg0) {
        if (arg0 > 0) {
            if (this.field1198 != 0) {
                PixFont var2 = this.field1351;
                int var3 = 0;
                if (this.field1322 != 0) {
                    var3 = 1;
                }
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field1263[var4] != null) {
                        int var5 = this.field1261[var4];
                        if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1120 == 0 || this.field1120 == 1 && this.method495(-20, this.field1262[var4]))) {
                            int var6 = 329 - var3 * 13;
                            var2.method194(4, var6, false, 0, "From " + this.field1262[var4] + ": " + this.field1263[var4]);
                            var2.method194(4, var6 - 1, false, 65535, "From " + this.field1262[var4] + ": " + this.field1263[var4]);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 5 && this.field1120 < 2) {
                            int var7 = 329 - var3 * 13;
                            var2.method194(4, var7, false, 0, this.field1263[var4]);
                            var2.method194(4, var7 - 1, false, 65535, this.field1263[var4]);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 6 && this.field1120 < 2) {
                            int var8 = 329 - var3 * 13;
                            var2.method194(4, var8, false, 0, "To " + this.field1262[var4] + ": " + this.field1263[var4]);
                            var2.method194(4, var8 - 1, false, 65535, "To " + this.field1262[var4] + ": " + this.field1263[var4]);
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;II)V")
    private final void method377(Packet arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1190; ++var4) {
            int var5 = this.field1191[var4];
            NpcEntity var6 = this.field1292[var5];
            int var7 = arg0.method216();
            if ((var7 & 2) == 2) {
                int var8 = arg0.method218();
                if (var8 == 65535) {
                    var8 = -1;
                }
                if (var6.field327 == var8) {
                    var6.field331 = 0;
                }
                int var9 = arg0.method216();
                if (var8 == -1 || var6.field327 == -1 || SeqType.field1028[var8].field1036 > SeqType.field1028[var6.field327].field1036 || SeqType.field1028[var6.field327].field1036 == 0) {
                    var6.field327 = var8;
                    var6.field328 = 0;
                    var6.field329 = 0;
                    var6.field330 = var9;
                    var6.field331 = 0;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field321 = arg0.method218();
                if (var6.field321 == 65535) {
                    var6.field321 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field312 = arg0.method223();
                var6.field313 = 100;
            }
            if ((var7 & 16) == 16) {
                var6.field316 = arg0.method216();
                var6.field317 = arg0.method216();
                var6.field318 = field1320 + 400;
                var6.field319 = arg0.method216();
                var6.field320 = arg0.method216();
            }
            if ((var7 & 32) == 32) {
                var6.field354 = NpcType.method288(arg0.method218());
                var6.field307 = var6.field354.field855;
                var6.field308 = var6.field354.field856;
                var6.field309 = var6.field354.field857;
                var6.field310 = var6.field354.field858;
                var6.field305 = var6.field354.field854;
            }
            if ((var7 & 64) == 64) {
                var6.field332 = arg0.method218();
                int var10 = arg0.method221();
                var6.field336 = var10 >> 16;
                var6.field335 = (var10 & 65535) + field1320;
                var6.field333 = 0;
                var6.field334 = 0;
                if (var6.field335 > field1320) {
                    var6.field333 = -1;
                }
                if (var6.field332 == 65535) {
                    var6.field332 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field322 = arg0.method218();
                var6.field323 = arg0.method218();
            }
        }
        if (arg2 <= 0) {
            this.field1121 = this.field1118.nextInt();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JB)V")
    public final void method378(long arg0, byte arg1) {
        if (arg0 != 0L) {
            if (this.field1158 >= 100) {
                this.method468(0, "Your ignore list is full. Max of 100 hit", (byte) 4, "");
            } else {
                String var4 = JString.method262(0, JString.method259(arg0, false));
                for (int var5 = 0; var5 < this.field1158; ++var5) {
                    if (this.field1133[var5] == arg0) {
                        this.method468(0, var4 + " is already on your ignore list", (byte) 4, "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1454; ++var6) {
                    if (this.field1308[var6] == arg0) {
                        this.method468(0, "Please remove " + var4 + " from your friend list first", (byte) 4, "");
                        return;
                    }
                }
                this.field1133[this.field1158++] = arg0;
                this.field1329 = true;
                if (arg1 == 3) {
                    this.field1163.method205((byte) -34, 79);
                    this.field1163.method212(true, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLkb;I)V")
    public final void method379(byte arg0, Packet arg1, int arg2) {
        if (arg0 != -45) {
            this.method6();
        }
        if (arg2 != 59 && arg2 != 76) {
            if (arg2 == 42) {
                int var4 = arg1.method216();
                int var5 = (var4 >> 4 & 7) + this.field1227;
                int var6 = (var4 & 7) + this.field1228;
                int var7 = arg1.method216();
                int var8 = var7 >> 2;
                int var9 = this.field1472[var8];
                int var10 = arg1.method218();
                if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                    int var11 = 0;
                    if (var9 == 0) {
                        var11 = this.field1196.method78(this.field1245, var5, var6);
                    }
                    if (var9 == 1) {
                        var11 = this.field1196.method79(this.field1245, var6, 3, var5);
                    }
                    if (var9 == 2) {
                        var11 = this.field1196.method80(this.field1245, var5, var6);
                    }
                    if (var9 == 3) {
                        var11 = this.field1196.method81(this.field1245, var5, var6);
                    }
                    if (var11 != 0) {
                        LocEntity var12 = new LocEntity(false, var11 >> 14 & 32767, this.field1245, 0, var9, SeqType.field1028[var10], var6, var5);
                        this.field1117.method232(var12);
                    }
                }
            } else if (arg2 == 223) {
                int var13 = arg1.method216();
                int var14 = (var13 >> 4 & 7) + this.field1227;
                int var15 = (var13 & 7) + this.field1228;
                int var16 = arg1.method218();
                int var17 = arg1.method218();
                if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                    ObjStackEntity var18 = new ObjStackEntity();
                    var18.field296 = var16;
                    var18.field297 = var17;
                    if (this.field1522[this.field1245][var14][var15] == null) {
                        this.field1522[this.field1245][var14][var15] = new LinkList(0);
                    }
                    this.field1522[this.field1245][var14][var15].method232(var18);
                    this.method480(var14, var15);
                }
            } else if (arg2 == 49) {
                int var19 = arg1.method216();
                int var20 = (var19 >> 4 & 7) + this.field1227;
                int var21 = (var19 & 7) + this.field1228;
                int var22 = arg1.method218();
                if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                    LinkList var23 = this.field1522[this.field1245][var20][var21];
                    if (var23 != null) {
                        for (ObjStackEntity var24 = (ObjStackEntity) var23.method235(); var24 != null; var24 = (ObjStackEntity) var23.method237(551)) {
                            if ((var22 & 32767) == var24.field296) {
                                var24.unlink();
                                break;
                            }
                        }
                        if (var23.method235() == null) {
                            this.field1522[this.field1245][var20][var21] = null;
                        }
                        this.method480(var20, var21);
                    }
                }
            } else if (arg2 == 69) {
                int var25 = arg1.method216();
                int var26 = (var25 >> 4 & 7) + this.field1227;
                int var27 = (var25 & 7) + this.field1228;
                int var28 = var26 + arg1.method217();
                int var29 = var27 + arg1.method217();
                int var30 = arg1.method219();
                int var31 = arg1.method218();
                int var32 = arg1.method216();
                int var33 = arg1.method216();
                int var34 = arg1.method218();
                int var35 = arg1.method218();
                int var36 = arg1.method216();
                int var37 = arg1.method216();
                if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                    int var38 = var26 * 128 + 64;
                    int var39 = var27 * 128 + 64;
                    int var40 = var28 * 128 + 64;
                    int var41 = var29 * 128 + 64;
                    ProjectileEntity var42 = new ProjectileEntity(var33, var36, var39, field1320 + var35, this.field1245, var30, field1320 + var34, var37, 0, this.method390(this.field1245, var38, (byte) 5, var39) - var32, var31, var38);
                    var42.method117(this.method390(this.field1245, var40, (byte) 5, var41) - var33, var41, var40, -855, field1320 + var34);
                    this.field1197.method232(var42);
                }
            } else if (arg2 == 191) {
                int var43 = arg1.method216();
                int var44 = (var43 >> 4 & 7) + this.field1227;
                int var45 = (var43 & 7) + this.field1228;
                int var46 = arg1.method218();
                int var47 = arg1.method216();
                int var48 = arg1.method218();
                if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
                    int var49 = var44 * 128 + 64;
                    int var50 = var45 * 128 + 64;
                    SpotAnimEntity var51 = new SpotAnimEntity(var49, var46, false, var50, var48, this.method390(this.field1245, var49, (byte) 5, var50) - var47, this.field1245, field1320);
                    this.field1421.method232(var51);
                }
            } else if (arg2 == 50) {
                int var52 = arg1.method216();
                int var53 = (var52 >> 4 & 7) + this.field1227;
                int var54 = (var52 & 7) + this.field1228;
                int var55 = arg1.method218();
                int var56 = arg1.method218();
                int var57 = arg1.method218();
                if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104 && this.field1099 != var57) {
                    ObjStackEntity var58 = new ObjStackEntity();
                    var58.field296 = var55;
                    var58.field297 = var56;
                    if (this.field1522[this.field1245][var53][var54] == null) {
                        this.field1522[this.field1245][var53][var54] = new LinkList(0);
                    }
                    this.field1522[this.field1245][var53][var54].method232(var58);
                    this.method480(var53, var54);
                }
            } else {
                if (arg2 == 23) {
                    int var59 = arg1.method216();
                    int var60 = (var59 >> 4 & 7) + this.field1227;
                    int var61 = (var59 & 7) + this.field1228;
                    int var62 = arg1.method216();
                    int var63 = var62 >> 2;
                    int var64 = var62 & 3;
                    int var65 = this.field1472[var63];
                    int var66 = arg1.method218();
                    int var67 = arg1.method218();
                    int var68 = arg1.method218();
                    int var69 = arg1.method218();
                    byte var70 = arg1.method217();
                    byte var71 = arg1.method217();
                    byte var72 = arg1.method217();
                    byte var73 = arg1.method217();
                    PlayerEntity var74;
                    if (this.field1099 == var69) {
                        var74 = this.field1332;
                    } else {
                        var74 = this.field1187[var69];
                    }
                    if (var74 != null) {
                        LocSpawned var75 = new LocSpawned(this.field1245, var64, var61, field1320 + var67, 2, var63, -1, var60, var65);
                        this.field1132.method232(var75);
                        LocSpawned var76 = new LocSpawned(this.field1245, var64, var61, field1320 + var68, 2, var63, var66, var60, var65);
                        this.field1132.method232(var76);
                        int var77 = this.field1159[this.field1245][var60][var61];
                        int var78 = this.field1159[this.field1245][var60 + 1][var61];
                        int var79 = this.field1159[this.field1245][var60 + 1][var61 + 1];
                        int var80 = this.field1159[this.field1245][var60][var61 + 1];
                        LocType var81 = LocType.method282(var66);
                        var74.field366 = field1320 + var67;
                        var74.field367 = field1320 + var68;
                        var74.field371 = var81.method285(var63, var64, var77, var78, var79, var80, -1);
                        int var82 = var81.field814;
                        int var83 = var81.field815;
                        if (var64 == 1 || var64 == 3) {
                            var82 = var81.field815;
                            var83 = var81.field814;
                        }
                        var74.field368 = var60 * 128 + var82 * 64;
                        var74.field370 = var61 * 128 + var83 * 64;
                        var74.field369 = this.method390(this.field1245, var74.field368, (byte) 5, var74.field370);
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
                        var74.field372 = var60 + var70;
                        var74.field374 = var60 + var72;
                        var74.field373 = var61 + var71;
                        var74.field375 = var61 + var73;
                    }
                }
                if (arg2 == 151) {
                    int var86 = arg1.method216();
                    int var87 = (var86 >> 4 & 7) + this.field1227;
                    int var88 = (var86 & 7) + this.field1228;
                    int var89 = arg1.method218();
                    int var90 = arg1.method218();
                    int var91 = arg1.method218();
                    if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                        LinkList var92 = this.field1522[this.field1245][var87][var88];
                        if (var92 != null) {
                            for (ObjStackEntity var93 = (ObjStackEntity) var92.method235(); var93 != null; var93 = (ObjStackEntity) var92.method237(551)) {
                                if ((var89 & 32767) == var93.field296 && var93.field297 == var90) {
                                    var93.field297 = var91;
                                    break;
                                }
                            }
                            this.method480(var87, var88);
                        }
                    }
                }
            }
        } else {
            int var94 = arg1.method216();
            int var95 = (var94 >> 4 & 7) + this.field1227;
            int var96 = (var94 & 7) + this.field1228;
            int var97 = arg1.method216();
            int var98 = var97 >> 2;
            int var99 = var97 & 3;
            int var100 = this.field1472[var98];
            int var101;
            if (arg2 == 76) {
                var101 = -1;
            } else {
                var101 = arg1.method218();
            }
            if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                LocMerged var102 = null;
                for (LocMerged var103 = (LocMerged) this.field1249.method235(); var103 != null; var103 = (LocMerged) this.field1249.method237(551)) {
                    if (this.field1245 == var103.field634 && var103.field636 == var95 && var103.field637 == var96 && var103.field635 == var100) {
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
                        var104 = this.field1196.method78(this.field1245, var95, var96);
                    }
                    if (var100 == 1) {
                        var104 = this.field1196.method79(this.field1245, var96, 3, var95);
                    }
                    if (var100 == 2) {
                        var104 = this.field1196.method80(this.field1245, var95, var96);
                    }
                    if (var100 == 3) {
                        var104 = this.field1196.method81(this.field1245, var95, var96);
                    }
                    if (var104 != 0) {
                        int var108 = this.field1196.method82(this.field1245, var95, var96, var104);
                        var105 = var104 >> 14 & 32767;
                        var106 = var108 & 31;
                        var107 = var108 >> 6;
                    }
                    var102 = new LocMerged();
                    var102.field634 = this.field1245;
                    var102.field635 = var100;
                    var102.field636 = var95;
                    var102.field637 = var96;
                    var102.field641 = var105;
                    var102.field643 = var106;
                    var102.field642 = var107;
                    this.field1249.method232(var102);
                }
                var102.field638 = var101;
                var102.field640 = var98;
                var102.field639 = var99;
                this.method456(var99, var95, var96, var100, var101, var98, -27819, this.field1245);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)I")
    public final int method380(byte arg0) {
        if (arg0 != 106) {
            this.field1145 = this.field1160.method216();
        }
        int var2 = 3;
        if (this.field1479 < 310) {
            int var3 = this.field1476 >> 7;
            int var4 = this.field1478 >> 7;
            int var5 = this.field1332.field300 >> 7;
            int var6 = this.field1332.field301 >> 7;
            if ((this.field1205[this.field1245][var3][var4] & 4) != 0) {
                var2 = this.field1245;
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
                    if ((this.field1205[this.field1245][var3][var4] & 4) != 0) {
                        var2 = this.field1245;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field1205[this.field1245][var3][var4] & 4) != 0) {
                            var2 = this.field1245;
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
                    if ((this.field1205[this.field1245][var3][var4] & 4) != 0) {
                        var2 = this.field1245;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field1205[this.field1245][var3][var4] & 4) != 0) {
                            var2 = this.field1245;
                        }
                    }
                }
            }
        }
        if ((this.field1205[this.field1245][this.field1332.field300 >> 7][this.field1332.field301 >> 7] & 4) != 0) {
            var2 = this.field1245;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)I")
    public final int method381(int arg0) {
        int var2 = this.method390(this.field1245, this.field1476, (byte) 5, this.field1478);
        this.field1144 += arg0;
        return var2 - this.field1477 < 800 && (this.field1205[this.field1245][this.field1476 >> 7][this.field1478 >> 7] & 4) != 0 ? this.field1245 : 3;
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method382(int arg0) {
        ++this.field1202;
        this.method389(284);
        this.method410(false);
        this.field1144 += arg0;
        this.method443((byte) -26);
        this.method462((byte) 106);
        this.method486(254);
        if (!this.field1333) {
            int var2 = this.field1181;
            if (this.field1297 / 256 > var2) {
                var2 = this.field1297 / 256;
            }
            if (this.field1119[4] && this.field1331[4] + 128 > var2) {
                var2 = this.field1331[4] + 128;
            }
            int var3 = this.field1499 + this.field1182 & 2047;
            this.method396(this.method390(this.field1245, this.field1332.field300, (byte) 5, this.field1332.field301) - 50, this.field1279, var3, var2, 16418, this.field1280, var2 * 3 + 600);
            ++field1169;
            if (field1169 > 1802) {
                field1169 = 0;
                this.field1163.method205((byte) -34, 146);
                this.field1163.method206(0);
                int var4 = this.field1163.field622;
                this.field1163.method207(29711);
                this.field1163.method206(70);
                this.field1163.method206((int) (Math.random() * 256.0D));
                this.field1163.method206(242);
                this.field1163.method206(186);
                this.field1163.method206(39);
                this.field1163.method206(61);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1163.method206(13);
                }
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field1163.method207(57856);
                }
                this.field1163.method207((int) (Math.random() * 65536.0D));
                this.field1163.method215(0, this.field1163.field622 - var4);
            }
        }
        int var5;
        if (!this.field1333) {
            var5 = this.method380((byte) 106);
        } else {
            var5 = this.method381(0);
        }
        int var6 = this.field1476;
        int var7 = this.field1477;
        int var8 = this.field1478;
        int var9 = this.field1479;
        int var10 = this.field1480;
        for (int var11 = 0; var11 < 5; ++var11) {
            if (this.field1119[var11]) {
                int var13 = (int) (Math.random() * (double) (this.field1324[var11] * 2 + 1) - (double) this.field1324[var11] + Math.sin((double) this.field1524[var11] / 100.0D * (double) this.field1389[var11]) * (double) this.field1331[var11]);
                if (var11 == 0) {
                    this.field1476 += var13;
                }
                if (var11 == 1) {
                    this.field1477 += var13;
                }
                if (var11 == 2) {
                    this.field1478 += var13;
                }
                if (var11 == 3) {
                    this.field1480 = this.field1480 + var13 & 2047;
                }
                if (var11 == 4) {
                    this.field1479 += var13;
                    if (this.field1479 < 128) {
                        this.field1479 = 128;
                    }
                    if (this.field1479 > 383) {
                        this.field1479 = 383;
                    }
                }
            }
        }
        int var12 = Pix3D.field569;
        Model.field520 = true;
        Model.field523 = 0;
        Model.field521 = super.mouseX - 8;
        Model.field522 = super.mouseY - 11;
        Pix2D.method149(this.field1508);
        this.field1196.method91(this.field1480, this.field1476, var5, this.field1479, this.field1477, this.field1478, 0);
        this.field1196.method65(0);
        this.method372(this.field1170);
        this.method490((byte) -11);
        this.method398(var12, true);
        this.method441(9);
        this.field1413.draw(11, super.graphics, 8, 5193);
        this.field1476 = var6;
        this.field1477 = var7;
        this.field1478 = var8;
        this.field1479 = var9;
        this.field1480 = var10;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method383(boolean arg0) {
        this.field1164 = false;
        if (arg0) {
            while (this.field1177) {
                try {
                    Thread.sleep(50L);
                } catch (Exception var16) {
                }
                Object var2 = this.field1488;
                String var3;
                int var4;
                int var5;
                synchronized (this.field1488) {
                    var3 = this.field1429;
                    var4 = this.field1328;
                    var5 = this.field1091;
                    this.field1429 = null;
                    this.field1328 = 0;
                    this.field1091 = 0;
                }
                if (var3 != null) {
                    byte[] var6 = signlink.cacheload(var3 + ".mid");
                    if (var6 != null && var4 != 12345678) {
                        this.field1361.reset();
                        this.field1361.update(var6);
                        int var7 = (int) this.field1361.getValue();
                        if (var4 != var7) {
                            var6 = null;
                        }
                    }
                    if (var6 == null) {
                        try {
                            DataInputStream var8 = this.method451(var3 + "_" + var4 + ".mid");
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
                    int var13 = (new Packet(363, var6)).method221();
                    byte[] var14 = new byte[var13];
                    BZip2.read(var14, var13, var6, var5, 4);
                    this.method409(var14, 625, var13, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public static final void method384(boolean arg0) {
        if (!arg0) {
            field1235 = !field1235;
        }
        World3D.field219 = true;
        Pix3D.field549 = true;
        field1254 = true;
        World.field36 = true;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method385(boolean arg0) {
        short var2 = 256;
        if (this.field1239 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1239 > 768) {
                    this.field1268[var3] = this.method445(this.field1269[var3], 1024 - this.field1239, this.field1270[var3], 997);
                } else if (this.field1239 > 256) {
                    this.field1268[var3] = this.field1270[var3];
                } else {
                    this.field1268[var3] = this.method445(this.field1270[var3], 256 - this.field1239, this.field1269[var3], 997);
                }
            }
        } else if (this.field1240 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1240 > 768) {
                    this.field1268[var4] = this.method445(this.field1269[var4], 1024 - this.field1240, this.field1271[var4], 997);
                } else if (this.field1240 > 256) {
                    this.field1268[var4] = this.field1271[var4];
                } else {
                    this.field1268[var4] = this.method445(this.field1271[var4], 256 - this.field1240, this.field1269[var4], 997);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1268[var5] = this.field1269[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1397.pixels[var6] = this.field1343.field577[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1215[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1356[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1268[var26];
                    int var30 = this.field1397.pixels[var8];
                    this.field1397.pixels[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field1397.draw(0, super.graphics, 0, 5193);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1398.pixels[var10] = this.field1344.field577[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1215[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1356[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1268[var18];
                    int var22 = this.field1398.pixels[var16];
                    this.field1398.pixels[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        if (!arg0) {
            field1323 = 281;
        }
        this.field1398.draw(0, super.graphics, 661, 5193);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILhc;III)V")
    public final void method386(int arg0, int arg1, int arg2, Component arg3, int arg4, int arg5, int arg6) {
        if (arg3.field966 == 0 && arg3.field980 != null && !arg3.field979) {
            if (arg1 >= arg5 && arg0 >= arg2 && arg1 <= arg3.field969 + arg5 && arg0 <= arg3.field970 + arg2) {
                int var8 = arg3.field980.length;
                if (arg4 != 5082) {
                    this.field1145 = this.field1160.method216();
                }
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg3.field981[var9] + arg5;
                    int var11 = arg3.field982[var9] + arg2 - arg6;
                    Component var12 = Component.field959[arg3.field980[var9]];
                    int var13 = var12.field971 + var10;
                    int var14 = var12.field972 + var11;
                    if ((var12.field976 >= 0 || var12.field1002 != 0) && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field969 + var13 && arg0 < var12.field970 + var14) {
                        if (var12.field976 >= 0) {
                            this.field1233 = var12.field976;
                        } else {
                            this.field1233 = var12.field964;
                        }
                    }
                    if (var12.field966 == 0) {
                        this.method386(arg0, arg1, var14, var12, 5082, var13, var12.field978);
                        if (var12.field977 > var12.field970) {
                            this.method454(arg1, 0, arg0, var12.field977, var12.field970, true, var12.field969 + var13, var14, var12);
                        }
                    } else {
                        if (var12.field967 == 1 && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field969 + var13 && arg0 < var12.field970 + var14) {
                            boolean var15 = false;
                            if (var12.field968 != 0) {
                                var15 = this.method476(var12, (byte) 8);
                            }
                            if (!var15) {
                                this.field1199[this.field1439] = var12.field1015;
                                this.field1506[this.field1439] = 951;
                                this.field1505[this.field1439] = var12.field964;
                                ++this.field1439;
                            }
                        }
                        if (var12.field967 == 2 && this.field1390 == 0 && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field969 + var13 && arg0 < var12.field970 + var14) {
                            String var16 = var12.field1012;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field1199[this.field1439] = var16 + " @gre@" + var12.field1013;
                            this.field1506[this.field1439] = 930;
                            this.field1505[this.field1439] = var12.field964;
                            ++this.field1439;
                        }
                        if (var12.field967 == 3 && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field969 + var13 && arg0 < var12.field970 + var14) {
                            this.field1199[this.field1439] = "Close";
                            this.field1506[this.field1439] = 947;
                            this.field1505[this.field1439] = var12.field964;
                            ++this.field1439;
                        }
                        if (var12.field967 == 4 && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field969 + var13 && arg0 < var12.field970 + var14) {
                            this.field1199[this.field1439] = var12.field1015;
                            this.field1506[this.field1439] = 465;
                            this.field1505[this.field1439] = var12.field964;
                            ++this.field1439;
                        }
                        if (var12.field967 == 5 && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field969 + var13 && arg0 < var12.field970 + var14) {
                            this.field1199[this.field1439] = var12.field1015;
                            this.field1506[this.field1439] = 960;
                            this.field1505[this.field1439] = var12.field964;
                            ++this.field1439;
                        }
                        if (var12.field967 == 6 && !this.field1237 && arg1 >= var13 && arg0 >= var14 && arg1 < var12.field969 + var13 && arg0 < var12.field970 + var14) {
                            this.field1199[this.field1439] = var12.field1015;
                            this.field1506[this.field1439] = 44;
                            this.field1505[this.field1439] = var12.field964;
                            ++this.field1439;
                        }
                        if (var12.field966 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field970; ++var18) {
                                for (int var19 = 0; var19 < var12.field969; ++var19) {
                                    int var20 = (var12.field988 + 32) * var19 + var13;
                                    int var21 = (var12.field989 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field991[var17];
                                        var21 += var12.field992[var17];
                                    }
                                    if (arg1 >= var20 && arg0 >= var21 && arg1 < var20 + 32 && arg0 < var21 + 32) {
                                        this.field1452 = var17;
                                        this.field1453 = var12.field964;
                                        if (var12.field960[var17] > 0) {
                                            ObjType var22 = ObjType.method294(var12.field960[var17] - 1);
                                            if (this.field1367 == 1 && var12.field986) {
                                                if (this.field1369 != var12.field964 || this.field1368 != var17) {
                                                    this.field1199[this.field1439] = "Use " + this.field1371 + " with @lre@" + var22.field883;
                                                    this.field1506[this.field1439] = 881;
                                                    this.field1507[this.field1439] = var22.field881;
                                                    this.field1504[this.field1439] = var17;
                                                    this.field1505[this.field1439] = var12.field964;
                                                    ++this.field1439;
                                                }
                                            } else if (this.field1390 == 1 && var12.field986) {
                                                if ((this.field1392 & 16) == 16) {
                                                    this.field1199[this.field1439] = this.field1393 + " @lre@" + var22.field883;
                                                    this.field1506[this.field1439] = 391;
                                                    this.field1507[this.field1439] = var22.field881;
                                                    this.field1504[this.field1439] = var17;
                                                    this.field1505[this.field1439] = var12.field964;
                                                    ++this.field1439;
                                                }
                                            } else {
                                                if (var12.field986) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field899 != null && var22.field899[var23] != null) {
                                                            this.field1199[this.field1439] = var22.field899[var23] + " @lre@" + var22.field883;
                                                            if (var23 == 3) {
                                                                this.field1506[this.field1439] = 478;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field1506[this.field1439] = 347;
                                                            }
                                                            this.field1507[this.field1439] = var22.field881;
                                                            this.field1504[this.field1439] = var17;
                                                            this.field1505[this.field1439] = var12.field964;
                                                            ++this.field1439;
                                                        } else if (var23 == 4) {
                                                            this.field1199[this.field1439] = "Drop @lre@" + var22.field883;
                                                            this.field1506[this.field1439] = 347;
                                                            this.field1507[this.field1439] = var22.field881;
                                                            this.field1504[this.field1439] = var17;
                                                            this.field1505[this.field1439] = var12.field964;
                                                            ++this.field1439;
                                                        }
                                                    }
                                                }
                                                if (var12.field987) {
                                                    this.field1199[this.field1439] = "Use @lre@" + var22.field883;
                                                    this.field1506[this.field1439] = 188;
                                                    this.field1507[this.field1439] = var22.field881;
                                                    this.field1504[this.field1439] = var17;
                                                    this.field1505[this.field1439] = var12.field964;
                                                    ++this.field1439;
                                                }
                                                if (var12.field986 && var22.field899 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field899[var24] != null) {
                                                            this.field1199[this.field1439] = var22.field899[var24] + " @lre@" + var22.field883;
                                                            if (var24 == 0) {
                                                                this.field1506[this.field1439] = 405;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1506[this.field1439] = 38;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1506[this.field1439] = 422;
                                                            }
                                                            this.field1507[this.field1439] = var22.field881;
                                                            this.field1504[this.field1439] = var17;
                                                            this.field1505[this.field1439] = var12.field964;
                                                            ++this.field1439;
                                                        }
                                                    }
                                                }
                                                if (var12.field993 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field993[var25] != null) {
                                                            this.field1199[this.field1439] = var12.field993[var25] + " @lre@" + var22.field883;
                                                            if (var25 == 0) {
                                                                this.field1506[this.field1439] = 602;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1506[this.field1439] = 596;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1506[this.field1439] = 22;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field1506[this.field1439] = 892;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field1506[this.field1439] = 415;
                                                            }
                                                            this.field1507[this.field1439] = var22.field881;
                                                            this.field1504[this.field1439] = var17;
                                                            this.field1505[this.field1439] = var12.field964;
                                                            ++this.field1439;
                                                        }
                                                    }
                                                }
                                                this.field1199[this.field1439] = "Examine @lre@" + var22.field883;
                                                this.field1506[this.field1439] = 1773;
                                                this.field1507[this.field1439] = var22.field881;
                                                this.field1505[this.field1439] = var12.field961[var17];
                                                ++this.field1439;
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

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method387(int arg0) {
        this.field1144 += arg0;
        if (super.mouseClickButton == 1) {
            if (super.mouseClikcX >= 8 && super.mouseClikcX <= 108 && super.mouseClickY >= 490 && super.mouseClickY <= 522) {
                this.field1341 = (this.field1341 + 1) % 4;
                this.field1286 = true;
                this.field1330 = true;
                this.field1163.method205((byte) -34, 244);
                this.field1163.method206(this.field1341);
                this.field1163.method206(this.field1120);
                this.field1163.method206(this.field1250);
            }
            if (super.mouseClikcX >= 137 && super.mouseClikcX <= 237 && super.mouseClickY >= 490 && super.mouseClickY <= 522) {
                this.field1120 = (this.field1120 + 1) % 3;
                this.field1286 = true;
                this.field1330 = true;
                this.field1163.method205((byte) -34, 244);
                this.field1163.method206(this.field1341);
                this.field1163.method206(this.field1120);
                this.field1163.method206(this.field1250);
            }
            if (super.mouseClikcX >= 275 && super.mouseClikcX <= 375 && super.mouseClickY >= 490 && super.mouseClickY <= 522) {
                this.field1250 = (this.field1250 + 1) % 3;
                this.field1286 = true;
                this.field1330 = true;
                this.field1163.method205((byte) -34, 244);
                this.field1163.method206(this.field1341);
                this.field1163.method206(this.field1120);
                this.field1163.method206(this.field1250);
            }
            if (super.mouseClikcX >= 416 && super.mouseClikcX <= 516 && super.mouseClickY >= 490 && super.mouseClickY <= 522) {
                this.method373((byte) -60);
                this.field1335 = "";
                this.field1246 = false;
                for (int var2 = 0; var2 < Component.field959.length; ++var2) {
                    if (Component.field959[var2] != null && Component.field959[var2].field968 == 600) {
                        this.field1272 = this.field1336 = Component.field959[var2].field965;
                        return;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)V")
    public final void method388(int arg0, int arg1, int arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field1263[var5] != null) {
                int var6 = this.field1261[var5];
                int var7 = 70 - var4 * 14 + this.field1342 + 4;
                if (var7 < -20) {
                    break;
                }
                if (var6 == 0) {
                    ++var4;
                }
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1341 == 0 || this.field1341 == 1 && this.method495(-20, this.field1262[var5]))) {
                    if (arg0 > var7 - 14 && arg0 <= var7 && !this.field1262[var5].equals(this.field1332.field357)) {
                        if (this.field1388) {
                            this.field1199[this.field1439] = "Report abuse @whi@" + this.field1262[var5];
                            this.field1506[this.field1439] = 34;
                            ++this.field1439;
                        }
                        this.field1199[this.field1439] = "Add ignore @whi@" + this.field1262[var5];
                        this.field1506[this.field1439] = 436;
                        ++this.field1439;
                        this.field1199[this.field1439] = "Add friend @whi@" + this.field1262[var5];
                        this.field1506[this.field1439] = 406;
                        ++this.field1439;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field1198 == 0 && (var6 == 7 || this.field1120 == 0 || this.field1120 == 1 && this.method495(-20, this.field1262[var5]))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        if (this.field1388) {
                            this.field1199[this.field1439] = "Report abuse @whi@" + this.field1262[var5];
                            this.field1506[this.field1439] = 34;
                            ++this.field1439;
                        }
                        this.field1199[this.field1439] = "Add ignore @whi@" + this.field1262[var5];
                        this.field1506[this.field1439] = 436;
                        ++this.field1439;
                        this.field1199[this.field1439] = "Add friend @whi@" + this.field1262[var5];
                        this.field1506[this.field1439] = 406;
                        ++this.field1439;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field1250 == 0 || this.field1250 == 1 && this.method495(-20, this.field1262[var5]))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field1199[this.field1439] = "Accept trade @whi@" + this.field1262[var5];
                        this.field1506[this.field1439] = 903;
                        ++this.field1439;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field1198 == 0 && this.field1120 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field1250 == 0 || this.field1250 == 1 && this.method495(-20, this.field1262[var5]))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field1199[this.field1439] = "Accept duel @whi@" + this.field1262[var5];
                        this.field1506[this.field1439] = 363;
                        ++this.field1439;
                    }
                    ++var4;
                }
            }
        }
        this.field1144 += arg1;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method389(int arg0) {
        if (this.field1332.field300 >> 7 == this.field1416 && this.field1332.field301 >> 7 == this.field1417) {
            this.field1416 = 0;
        }
        for (int var2 = -1; var2 < this.field1188; ++var2) {
            PlayerEntity var3;
            int var4;
            if (var2 == -1) {
                var3 = this.field1332;
                var4 = this.field1186 << 14;
            } else {
                var3 = this.field1187[this.field1189[var2]];
                var4 = this.field1189[var2] << 14;
            }
            if (var3 != null && var3.method112(false)) {
                var3.field376 = false;
                if ((field1254 && this.field1188 > 50 || this.field1188 > 200) && var2 != -1 && var3.field324 == var3.field305) {
                    var3.field376 = true;
                }
                int var5 = var3.field300 >> 7;
                int var6 = var3.field301 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field371 != null && field1320 >= var3.field366 && field1320 < var3.field367) {
                        var3.field376 = false;
                        var3.field365 = this.method390(this.field1245, var3.field300, (byte) 5, var3.field301);
                        this.field1196.method63(var3.field374, 60, (Model) null, var3.field301, var3.field365, var4, var3.field302, var3.field373, var3.field372, var3, false, this.field1245, var3.field375, var3.field300);
                    } else {
                        if ((var3.field300 & 127) == 64 && (var3.field301 & 127) == 64) {
                            if (this.field1285[var5][var6] == this.field1202) {
                                continue;
                            }
                            this.field1285[var5][var6] = this.field1202;
                        }
                        var3.field365 = this.method390(this.field1245, var3.field300, (byte) 5, var3.field301);
                        this.field1196.method62(-44713, var3.field301, 60, var3.field302, var3.field300, var4, var3.field303, (Model) null, var3, var3.field365, this.field1245);
                    }
                }
            }
        }
        if (arg0 <= 0) {
            this.field1163.method206(210);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIBI)I")
    public final int method390(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 5) {
            this.field1145 = this.field1160.method216();
        }
        int var5 = arg1 >> 7;
        int var6 = arg3 >> 7;
        int var7 = arg0;
        if (arg0 < 3 && (this.field1205[1][var5][var6] & 2) == 2) {
            var7 = arg0 + 1;
        }
        int var8 = arg1 & 127;
        int var9 = arg3 & 127;
        int var10 = (128 - var8) * this.field1159[var7][var5][var6] + this.field1159[var7][var5 + 1][var6] * var8 >> 7;
        int var11 = (128 - var8) * this.field1159[var7][var5][var6 + 1] + this.field1159[var7][var5 + 1][var6 + 1] * var8 >> 7;
        return (128 - var9) * var10 + var9 * var11 >> 7;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lbc;IIII)V")
    public final void method391(NpcType arg0, int arg1, int arg2, int arg3, int arg4) {
        while (arg1 >= 0) {
            this.field1145 = -1;
        }
        if (this.field1439 < 400) {
            String var6 = arg0.field849;
            if (arg0.field867 != 0) {
                var6 = var6 + method429(this.field1332.field363, false, arg0.field867) + " (level-" + arg0.field867 + ")";
            }
            if (this.field1367 == 1) {
                this.field1199[this.field1439] = "Use " + this.field1371 + " with @yel@" + var6;
                this.field1506[this.field1439] = 900;
                this.field1507[this.field1439] = arg4;
                this.field1504[this.field1439] = arg3;
                this.field1505[this.field1439] = arg2;
                ++this.field1439;
            } else {
                if (this.field1390 == 1) {
                    if ((this.field1392 & 2) == 2) {
                        this.field1199[this.field1439] = this.field1393 + " @yel@" + var6;
                        this.field1506[this.field1439] = 265;
                        this.field1507[this.field1439] = arg4;
                        this.field1504[this.field1439] = arg3;
                        this.field1505[this.field1439] = arg2;
                        ++this.field1439;
                        return;
                    }
                } else {
                    if (arg0.field862 != null) {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (arg0.field862[var7] != null && !arg0.field862[var7].equalsIgnoreCase("attack")) {
                                this.field1199[this.field1439] = arg0.field862[var7] + " @yel@" + var6;
                                if (var7 == 0) {
                                    this.field1506[this.field1439] = 728;
                                }
                                if (var7 == 1) {
                                    this.field1506[this.field1439] = 542;
                                }
                                if (var7 == 2) {
                                    this.field1506[this.field1439] = 6;
                                }
                                if (var7 == 3) {
                                    this.field1506[this.field1439] = 963;
                                }
                                if (var7 == 4) {
                                    this.field1506[this.field1439] = 245;
                                }
                                this.field1507[this.field1439] = arg4;
                                this.field1504[this.field1439] = arg3;
                                this.field1505[this.field1439] = arg2;
                                ++this.field1439;
                            }
                        }
                    }
                    if (arg0.field862 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (arg0.field862[var8] != null && arg0.field862[var8].equalsIgnoreCase("attack")) {
                                short var9 = 0;
                                if (arg0.field867 > this.field1332.field363) {
                                    var9 = 2000;
                                }
                                this.field1199[this.field1439] = arg0.field862[var8] + " @yel@" + var6;
                                if (var8 == 0) {
                                    this.field1506[this.field1439] = var9 + 728;
                                }
                                if (var8 == 1) {
                                    this.field1506[this.field1439] = var9 + 542;
                                }
                                if (var8 == 2) {
                                    this.field1506[this.field1439] = var9 + 6;
                                }
                                if (var8 == 3) {
                                    this.field1506[this.field1439] = var9 + 963;
                                }
                                if (var8 == 4) {
                                    this.field1506[this.field1439] = var9 + 245;
                                }
                                this.field1507[this.field1439] = arg4;
                                this.field1504[this.field1439] = arg3;
                                this.field1505[this.field1439] = arg2;
                                ++this.field1439;
                            }
                        }
                    }
                    this.field1199[this.field1439] = "Examine @yel@" + var6;
                    this.field1506[this.field1439] = 1607;
                    this.field1507[this.field1439] = arg4;
                    this.field1504[this.field1439] = arg3;
                    this.field1505[this.field1439] = arg2;
                    ++this.field1439;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method392(int arg0) {
        if (arg0 != 7) {
            this.field1497 = this.field1118.nextInt();
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.pollKey(false);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field1336 != -1 && this.field1336 == this.field1272) {
                        if (var2 == 8 && this.field1335.length() > 0) {
                            this.field1335 = this.field1335.substring(0, this.field1335.length() - 1);
                        }
                        break;
                    }
                    if (this.field1234) {
                        if (var2 >= 32 && var2 <= 122 && this.field1130.length() < 80) {
                            this.field1130 = this.field1130 + (char) var2;
                            this.field1330 = true;
                        }
                        if (var2 == 8 && this.field1130.length() > 0) {
                            this.field1130 = this.field1130.substring(0, this.field1130.length() - 1);
                            this.field1330 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field1234 = false;
                            this.field1330 = true;
                            if (this.field1125 == 1) {
                                long var3 = JString.method258(this.field1130);
                                this.method457(var3, -460);
                            }
                            if (this.field1125 == 2 && this.field1454 > 0) {
                                long var5 = JString.method258(this.field1130);
                                this.method470(43808, var5);
                            }
                            if (this.field1125 == 3 && this.field1130.length() > 0) {
                                this.field1163.method205((byte) -34, 148);
                                this.field1163.method206(0);
                                int var7 = this.field1163.field622;
                                this.field1163.method212(true, this.field1265);
                                WordPack.method266(this.field1163, true, this.field1130);
                                this.field1163.method215(0, this.field1163.field622 - var7);
                                this.field1130 = JString.method263(this.field1130, 0);
                                this.field1130 = WordFilter.method343(this.field1130, 0);
                                this.method468(6, this.field1130, (byte) 4, JString.method262(0, JString.method259(this.field1265, false)));
                                if (this.field1120 == 2) {
                                    this.field1120 = 1;
                                    this.field1286 = true;
                                    this.field1163.method205((byte) -34, 244);
                                    this.field1163.method206(this.field1341);
                                    this.field1163.method206(this.field1120);
                                    this.field1163.method206(this.field1250);
                                }
                            }
                            if (this.field1125 == 4 && this.field1158 < 100) {
                                long var8 = JString.method258(this.field1130);
                                this.method378(var8, (byte) 3);
                            }
                            if (this.field1125 == 5 && this.field1158 > 0) {
                                long var10 = JString.method258(this.field1130);
                                this.method487(1, var10);
                            }
                        }
                    } else if (this.field1420) {
                        if (var2 >= 48 && var2 <= 57 && this.field1149.length() < 10) {
                            this.field1149 = this.field1149 + (char) var2;
                            this.field1330 = true;
                        }
                        if (var2 == 8 && this.field1149.length() > 0) {
                            this.field1149 = this.field1149.substring(0, this.field1149.length() - 1);
                            this.field1330 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field1149.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field1149);
                                } catch (Exception var16) {
                                }
                                this.field1163.method205((byte) -34, 237);
                                this.field1163.method210(var12);
                            }
                            this.field1420 = false;
                            this.field1330 = true;
                        }
                    } else if (this.field1366 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field1502.length() < 80) {
                            this.field1502 = this.field1502 + (char) var2;
                            this.field1330 = true;
                        }
                        if (var2 == 8 && this.field1502.length() > 0) {
                            this.field1502 = this.field1502.substring(0, this.field1502.length() - 1);
                            this.field1330 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field1502.length() > 0) {
                            if (this.field1502.equals("::clientdrop") && (super.frame != null || this.method430(-7437).indexOf("192.168.1.") != -1)) {
                                this.method478(false);
                            } else if (this.field1502.startsWith("::")) {
                                this.field1163.method205((byte) -34, 4);
                                this.field1163.method206(this.field1502.length() - 1);
                                this.field1163.method213(this.field1502.substring(2));
                            } else {
                                byte var13 = 0;
                                if (this.field1502.startsWith("yellow:")) {
                                    var13 = 0;
                                    this.field1502 = this.field1502.substring(7);
                                }
                                if (this.field1502.startsWith("red:")) {
                                    var13 = 1;
                                    this.field1502 = this.field1502.substring(4);
                                }
                                if (this.field1502.startsWith("green:")) {
                                    var13 = 2;
                                    this.field1502 = this.field1502.substring(6);
                                }
                                if (this.field1502.startsWith("cyan:")) {
                                    var13 = 3;
                                    this.field1502 = this.field1502.substring(5);
                                }
                                if (this.field1502.startsWith("purple:")) {
                                    var13 = 4;
                                    this.field1502 = this.field1502.substring(7);
                                }
                                if (this.field1502.startsWith("white:")) {
                                    var13 = 5;
                                    this.field1502 = this.field1502.substring(6);
                                }
                                if (this.field1502.startsWith("flash1:")) {
                                    var13 = 6;
                                    this.field1502 = this.field1502.substring(7);
                                }
                                if (this.field1502.startsWith("flash2:")) {
                                    var13 = 7;
                                    this.field1502 = this.field1502.substring(7);
                                }
                                if (this.field1502.startsWith("flash3:")) {
                                    var13 = 8;
                                    this.field1502 = this.field1502.substring(7);
                                }
                                if (this.field1502.startsWith("glow1:")) {
                                    var13 = 9;
                                    this.field1502 = this.field1502.substring(6);
                                }
                                if (this.field1502.startsWith("glow2:")) {
                                    var13 = 10;
                                    this.field1502 = this.field1502.substring(6);
                                }
                                if (this.field1502.startsWith("glow3:")) {
                                    var13 = 11;
                                    this.field1502 = this.field1502.substring(6);
                                }
                                byte var14 = 0;
                                if (this.field1502.startsWith("wave:")) {
                                    var14 = 1;
                                    this.field1502 = this.field1502.substring(5);
                                }
                                if (this.field1502.startsWith("scroll:")) {
                                    var14 = 2;
                                    this.field1502 = this.field1502.substring(7);
                                }
                                this.field1163.method205((byte) -34, 158);
                                this.field1163.method206(0);
                                int var15 = this.field1163.field622;
                                this.field1163.method206(var13);
                                this.field1163.method206(var14);
                                WordPack.method266(this.field1163, true, this.field1502);
                                this.field1163.method215(0, this.field1163.field622 - var15);
                                this.field1502 = JString.method263(this.field1502, 0);
                                this.field1502 = WordFilter.method343(this.field1502, 0);
                                this.field1332.field312 = this.field1502;
                                this.field1332.field314 = var13;
                                this.field1332.field315 = var14;
                                this.field1332.field313 = 150;
                                this.method468(2, this.field1332.field312, (byte) 4, this.field1332.field357);
                                if (this.field1341 == 2) {
                                    this.field1341 = 3;
                                    this.field1286 = true;
                                    this.field1163.method205((byte) -34, 244);
                                    this.field1163.method206(this.field1341);
                                    this.field1163.method206(this.field1120);
                                    this.field1163.method206(this.field1250);
                                }
                            }
                            this.field1502 = "";
                            this.field1330 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field1335.length() < 12) {
                this.field1335 = this.field1335 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method9(boolean arg0) {
        if (arg0) {
            this.field1161 = -398;
        }
        if (!this.field1435 && !this.field1230 && !this.field1288) {
            if (!this.field1339) {
                this.method412(4);
            } else {
                this.method426(29510);
            }
            this.field1299 = 0;
        } else {
            this.method484(false);
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method393(byte arg0) {
        if (arg0 != -70) {
            this.field1522 = null;
        }
        if (this.field1474 == 0) {
            int var2 = super.screenWidth / 2 - 80;
            int var3 = super.screenHeight / 2 + 20;
            int var14 = var3 + 20;
            if (super.mouseClickButton == 1 && super.mouseClikcX >= var2 - 75 && super.mouseClikcX <= var2 + 75 && super.mouseClickY >= var14 - 20 && super.mouseClickY <= var14 + 20) {
                this.field1474 = 3;
                this.field1337 = 0;
            }
            int var4 = super.screenWidth / 2 + 80;
            if (super.mouseClickButton == 1 && super.mouseClikcX >= var4 - 75 && super.mouseClikcX <= var4 + 75 && super.mouseClickY >= var14 - 20 && super.mouseClickY <= var14 + 20) {
                this.field1448 = "";
                this.field1449 = "Enter your username & password.";
                this.field1474 = 2;
                this.field1337 = 0;
            }
        } else if (this.field1474 == 2) {
            int var5 = super.screenHeight / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.mouseClickButton == 1 && super.mouseClickY >= var16 - 15 && super.mouseClickY < var16) {
                this.field1337 = 0;
            }
            var5 = var16 + 15;
            if (super.mouseClickButton == 1 && super.mouseClickY >= var5 - 15 && super.mouseClickY < var5) {
                this.field1337 = 1;
            }
            var5 += 15;
            int var6 = super.screenWidth / 2 - 80;
            int var7 = super.screenHeight / 2 + 50;
            int var17 = var7 + 20;
            if (super.mouseClickButton == 1 && super.mouseClikcX >= var6 - 75 && super.mouseClikcX <= var6 + 75 && super.mouseClickY >= var17 - 20 && super.mouseClickY <= var17 + 20) {
                this.method455(this.field1431, this.field1432, false);
            }
            int var8 = super.screenWidth / 2 + 80;
            if (super.mouseClickButton == 1 && super.mouseClikcX >= var8 - 75 && super.mouseClikcX <= var8 + 75 && super.mouseClickY >= var17 - 20 && super.mouseClickY <= var17 + 20) {
                this.field1474 = 0;
                this.field1431 = "";
                this.field1432 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.pollKey(false);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1090.length(); ++var11) {
                        if (var9 == field1090.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1337 == 0) {
                        if (var9 == 8 && this.field1431.length() > 0) {
                            this.field1431 = this.field1431.substring(0, this.field1431.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1337 = 1;
                        }
                        if (var10) {
                            this.field1431 = this.field1431 + (char) var9;
                        }
                        if (this.field1431.length() > 12) {
                            this.field1431 = this.field1431.substring(0, 12);
                        }
                    } else if (this.field1337 == 1) {
                        if (var9 == 8 && this.field1432.length() > 0) {
                            this.field1432 = this.field1432.substring(0, this.field1432.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1337 = 0;
                        }
                        if (var10) {
                            this.field1432 = this.field1432 + (char) var9;
                        }
                        if (this.field1432.length() > 20) {
                            this.field1432 = this.field1432.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1474 == 3) {
                int var12 = super.screenWidth / 2;
                int var13 = super.screenHeight / 2 + 50;
                int var18 = var13 + 20;
                if (super.mouseClickButton == 1 && super.mouseClikcX >= var12 - 75 && super.mouseClikcX <= var12 + 75 && super.mouseClickY >= var18 - 20 && super.mouseClickY <= var18 + 20) {
                    this.field1474 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;II)Lub;")
    public final Jagfile method394(String arg0, int arg1, String arg2, int arg3, int arg4) {
        int var6 = 5;
        byte[] var7 = signlink.cacheload(arg2);
        if (var7 != null) {
            this.field1361.reset();
            this.field1361.update(var7);
            int var8 = (int) this.field1361.getValue();
            if (arg1 != var8) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(var7, this.field1277);
        } else {
            while (var7 == null) {
                this.method13(true, "Requesting " + arg0, arg3);
                try {
                    int var10 = 0;
                    DataInputStream var11 = this.method451(arg2 + arg1);
                    byte[] var12 = new byte[6];
                    var11.readFully(var12, 0, 6);
                    Packet var13 = new Packet(363, var12);
                    var13.field622 = 3;
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
                            this.method13(true, "Loading " + arg0 + " - " + var18 + "%", arg3);
                        }
                        var10 = var18;
                    }
                    var11.close();
                } catch (IOException var23) {
                    var7 = null;
                    for (int var19 = var6; var19 > 0; --var19) {
                        this.method13(true, "Error loading - Will retry in " + var19 + " secs.", arg3);
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception var22) {
                        }
                    }
                    var6 *= 2;
                    if (var6 > 60) {
                        var6 = 60;
                    }
                }
            }
            signlink.cachesave(arg2, var7);
            if (arg4 != 0) {
                for (int var20 = 1; var20 > 0; ++var20) {
                }
            }
            return new Jagfile(var7, this.field1277);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method395(boolean arg0) {
        this.field1267 = false;
        while (this.field1486) {
            this.field1267 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var3) {
            }
        }
        this.field1468 = null;
        this.field1469 = null;
        this.field1338 = null;
        this.field1268 = null;
        this.field1269 = null;
        this.field1270 = null;
        this.field1271 = null;
        this.field1206 = null;
        this.field1207 = null;
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field1356 = null;
        this.field1357 = null;
        this.field1343 = null;
        this.field1344 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method396(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg3 & 2047;
        int var9 = 2048 - arg2 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg6;
        if (var8 != 0) {
            int var13 = Model.field525[var8];
            int var14 = Model.field526[var8];
            int var15 = var11 * var14 - arg6 * var13 >> 16;
            var12 = var11 * var13 + arg6 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field525[var9];
            int var17 = Model.field526[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1476 = arg1 - var10;
        this.field1477 = arg0 - var11;
        this.field1478 = arg5 - var12;
        this.field1479 = arg3;
        if (arg4 != 16418) {
            this.field1522 = null;
        }
        this.field1480 = arg2;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    private static final String method397(int arg0, int arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1 != 0) {
            throw new NullPointerException();
        } else {
            if (var2.length() > 8) {
                var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
            } else if (var2.length() > 4) {
                var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
            }
            return " " + var2;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method398(int arg0, boolean arg1) {
        if (!arg1) {
            this.field1145 = -1;
        }
        if (!field1254) {
            if (Pix3D.field568[17] >= arg0) {
                Pix8 var3 = Pix3D.field562[17];
                int var4 = var3.field591 * var3.field590 - 1;
                int var5 = this.field1334 * var3.field590 * 2;
                byte[] var6 = var3.field588;
                byte[] var7 = this.field1434;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field588 = var7;
                this.field1434 = var6;
                Pix3D.method161(17, 150);
            }
            if (Pix3D.field568[24] >= arg0) {
                Pix8 var9 = Pix3D.field562[24];
                int var10 = var9.field591 * var9.field590 - 1;
                int var11 = this.field1334 * var9.field590 * 2;
                byte[] var12 = var9.field588;
                byte[] var13 = this.field1434;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field588 = var13;
                this.field1434 = var12;
                Pix3D.method161(24, 150);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method399(boolean arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1356[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1356[var17] = 192;
        }
        if (!arg0) {
            this.field1145 = this.field1160.method216();
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1357[var14] = (this.field1356[var14 - 1] + this.field1356[var14 + 1] + this.field1356[var14 - 128] + this.field1356[var14 + 128]) / 4;
            }
        }
        this.field1521 += 128;
        if (this.field1521 > this.field1206.length) {
            this.field1521 -= this.field1206.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method479(578, this.field1338[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field1357[var11 + 128] - this.field1206[this.field1521 + var11 & this.field1206.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field1356[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field1215[var8] = this.field1215[var8 + 1];
        }
        this.field1215[var2 - 1] = (int) (Math.sin((double) field1320 / 14.0D) * 16.0D + Math.sin((double) field1320 / 15.0D) * 14.0D + Math.sin((double) field1320 / 16.0D) * 12.0D);
        if (this.field1239 > 0) {
            this.field1239 -= 4;
        }
        if (this.field1240 > 0) {
            this.field1240 -= 4;
        }
        if (this.field1239 == 0 && this.field1240 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field1239 = 1024;
            }
            if (var9 == 1) {
                this.field1240 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method400(byte arg0) {
        this.field1412.method242((byte) 62);
        if (arg0 != -46) {
            this.method6();
        }
        int var2 = this.field1450 + this.field1182 & 2047;
        int var3 = this.field1332.field300 / 32 + 48;
        int var4 = 464 - this.field1332.field301 / 32;
        this.field1418.method181(var2, 146, this.field1498, 151, var4, this.field1295 + 256, var3, 21, 9, false, this.field1318);
        this.field1510.method181(this.field1182, 33, this.field1221, 33, 25, 256, 25, 0, 0, false, this.field1482);
        for (int var5 = 0; var5 < this.field1282; ++var5) {
            int var25 = this.field1283[var5] * 4 + 2 - this.field1332.field300 / 32;
            int var26 = this.field1284[var5] * 4 + 2 - this.field1332.field301 / 32;
            this.method444(var26, 4, this.field1156[var5], var25);
        }
        for (int var6 = 0; var6 < 104; ++var6) {
            for (int var21 = 0; var21 < 104; ++var21) {
                LinkList var22 = this.field1522[this.field1245][var6][var21];
                if (var22 != null) {
                    int var23 = var6 * 4 + 2 - this.field1332.field300 / 32;
                    int var24 = var21 * 4 + 2 - this.field1332.field301 / 32;
                    this.method444(var24, 4, this.field1422, var23);
                }
            }
        }
        for (int var7 = 0; var7 < this.field1293; ++var7) {
            NpcEntity var18 = this.field1292[this.field1294[var7]];
            if (var18 != null && var18.method112(false) && var18.field354.field866) {
                int var19 = var18.field300 / 32 - this.field1332.field300 / 32;
                int var20 = var18.field301 / 32 - this.field1332.field301 / 32;
                this.method444(var20, 4, this.field1423, var19);
            }
        }
        for (int var8 = 0; var8 < this.field1188; ++var8) {
            PlayerEntity var11 = this.field1187[this.field1189[var8]];
            if (var11 != null && var11.method112(false)) {
                int var12 = var11.field300 / 32 - this.field1332.field300 / 32;
                int var13 = var11.field301 / 32 - this.field1332.field301 / 32;
                boolean var14 = false;
                long var15 = JString.method258(var11.field357);
                for (int var17 = 0; var17 < this.field1454; ++var17) {
                    if (this.field1308[var17] == var15 && this.field1138[var17] != 0) {
                        var14 = true;
                        break;
                    }
                }
                if (var14) {
                    this.method444(var13, 4, this.field1425, var12);
                } else {
                    this.method444(var13, 4, this.field1424, var12);
                }
            }
        }
        if (this.field1416 != 0) {
            int var9 = this.field1416 * 4 + 2 - this.field1332.field300 / 32;
            int var10 = this.field1417 * 4 + 2 - this.field1332.field301 / 32;
            this.method444(var10, 4, this.field1362, var9);
        }
        Pix2D.method150(82, 93, 16777215, (byte) 93, 3, 3);
        this.field1413.method242((byte) 62);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)Ljava/awt/Component;")
    public final java.awt.Component method11(byte arg0) {
        if (arg0 != 3) {
            this.field1124 = 260;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.frame != null ? super.frame : this;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method401(int arg0) {
        if (arg0 <= 0) {
            this.method6();
        }
        if (this.field1443 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1132.method235(); var2 != null; var2 = (LocSpawned) this.field1132.method237(551)) {
                if (field1320 >= var2.field652) {
                    this.method456(var2.field650, var2.field647, var2.field648, var2.field646, var2.field649, var2.field651, -27819, var2.field645);
                    var2.unlink();
                }
            }
            ++field1473;
            if (field1473 > 85) {
                field1473 = 0;
                this.field1163.method205((byte) -34, 85);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method402(int arg0, int arg1) {
        int[] var3 = this.field1418.field577;
        if (arg1 < 0) {
            int var4 = var3.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                var3[var5] = 0;
            }
            for (int var6 = 1; var6 < 103; ++var6) {
                int var23 = (103 - var6) * 512 * 4 + 24628;
                for (int var24 = 1; var24 < 103; ++var24) {
                    if ((this.field1205[arg0][var24][var6] & 24) == 0) {
                        this.field1196.method87(var3, var23, 512, arg0, var24, var6);
                    }
                    if (arg0 < 3 && (this.field1205[arg0 + 1][var24][var6] & 8) != 0) {
                        this.field1196.method87(var3, var23, 512, arg0 + 1, var24, var6);
                    }
                    var23 += 4;
                }
            }
            int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            this.field1418.method171((byte) 62);
            for (int var9 = 1; var9 < 103; ++var9) {
                for (int var22 = 1; var22 < 103; ++var22) {
                    if ((this.field1205[arg0][var22][var9] & 24) == 0) {
                        this.method403(field1264, arg0, var7, var22, var8, var9);
                    }
                    if (arg0 < 3 && (this.field1205[arg0 + 1][var22][var9] & 8) != 0) {
                        this.method403(field1264, arg0 + 1, var7, var22, var8, var9);
                    }
                }
            }
            this.field1413.method242((byte) 62);
            this.field1282 = 0;
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var11 = 0; var11 < 104; ++var11) {
                    int var12 = this.field1196.method81(this.field1245, var10, var11);
                    if (var12 != 0) {
                        int var13 = var12 >> 14 & 32767;
                        int var14 = LocType.method282(var13).field828;
                        if (var14 >= 0) {
                            int var15 = var10;
                            int var16 = var11;
                            if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                                byte var17 = 104;
                                byte var18 = 104;
                                int[][] var19 = this.field1319[this.field1245].field930;
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
                            this.field1156[this.field1282] = this.field1503[var14];
                            this.field1283[this.field1282] = var15;
                            this.field1284[this.field1282] = var16;
                            ++this.field1282;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field1196.method78(arg1, arg3, arg5);
        if (var7 != 0) {
            int var8 = this.field1196.method82(arg1, arg3, arg5, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg2;
            if (var7 > 0) {
                var11 = arg4;
            }
            int[] var12 = this.field1418.field577;
            int var13 = (103 - arg5) * 512 * 4 + arg3 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            LocType var15 = LocType.method282(var14);
            if (var15.field829 != -1) {
                Pix8 var16 = this.field1403[var15.field829];
                if (var16 != null) {
                    int var17 = (var15.field814 * 4 - var16.field590) / 2;
                    int var18 = (var15.field815 * 4 - var16.field591) / 2;
                    var16.method189((104 - arg5 - var15.field815) * 4 + 48 + var18, arg3 * 4 + 48 + var17, false);
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
        int var19 = this.field1196.method80(arg1, arg3, arg5);
        int var20 = 56 / arg0;
        if (var19 != 0) {
            int var21 = this.field1196.method82(arg1, arg3, arg5, var19);
            int var22 = var21 >> 6 & 3;
            int var23 = var21 & 31;
            int var24 = var19 >> 14 & 32767;
            LocType var25 = LocType.method282(var24);
            if (var25.field829 != -1) {
                Pix8 var26 = this.field1403[var25.field829];
                if (var26 != null) {
                    int var27 = (var25.field814 * 4 - var26.field590) / 2;
                    int var28 = (var25.field815 * 4 - var26.field591) / 2;
                    var26.method189((104 - arg5 - var25.field815) * 4 + 48 + var28, arg3 * 4 + 48 + var27, false);
                }
            } else if (var23 == 9) {
                int var29 = 15658734;
                if (var19 > 0) {
                    var29 = 15597568;
                }
                int[] var30 = this.field1418.field577;
                int var31 = (103 - arg5) * 512 * 4 + arg3 * 4 + 24624;
                if (var22 != 0 && var22 != 2) {
                    var30[var31] = var29;
                    var30[var31 + 512 + 1] = var29;
                    var30[var31 + 1024 + 2] = var29;
                    var30[var31 + 1536 + 3] = var29;
                } else {
                    var30[var31 + 1536] = var29;
                    var30[var31 + 1024 + 1] = var29;
                    var30[var31 + 512 + 2] = var29;
                    var30[var31 + 3] = var29;
                }
            }
        }
        int var32 = this.field1196.method81(arg1, arg3, arg5);
        if (var32 != 0) {
            int var33 = var32 >> 14 & 32767;
            LocType var34 = LocType.method282(var33);
            if (var34.field829 != -1) {
                Pix8 var35 = this.field1403[var34.field829];
                if (var35 != null) {
                    int var36 = (var34.field814 * 4 - var35.field590) / 2;
                    int var37 = (var34.field815 * 4 - var35.field591) / 2;
                    var35.method189((104 - arg5 - var34.field815) * 4 + 48 + var37, arg3 * 4 + 48 + var36, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;IZ)V")
    private final void method404(Packet arg0, int arg1, boolean arg2) {
        this.field1304 = 0;
        this.field1190 = 0;
        this.method477(-542, arg0, arg1);
        this.method437(false, arg0, arg1);
        this.method377(arg0, arg1, this.field1436);
        if (arg2) {
            field1323 = 338;
        }
        for (int var4 = 0; var4 < this.field1304; ++var4) {
            int var6 = this.field1305[var4];
            if (field1320 != this.field1292[var6].field344) {
                this.field1292[var6].field354 = null;
                this.field1292[var6] = null;
            }
        }
        if (arg0.field622 != arg1) {
            signlink.reporterror(this.field1431 + " size mismatch in getnpcpos - pos:" + arg0.field622 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1293; ++var5) {
                if (this.field1292[this.field1294[var5]] == null) {
                    signlink.reporterror(this.field1431 + " null entry in npc list - pos:" + var5 + " size:" + this.field1293);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method12(Runnable arg0, int arg1) {
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.startThread(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method405(int arg0) {
        this.field1468 = new Pix8(this.field1501, "titlebox", 0);
        this.field1469 = new Pix8(this.field1501, "titlebutton", 0);
        if (arg0 != 0) {
            this.field1145 = this.field1160.method216();
        }
        this.field1338 = new Pix8[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field1338[var2] = new Pix8(this.field1501, "runes", var2);
        }
        this.field1343 = new Pix32(128, 265);
        this.field1344 = new Pix32(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field1343.field577[var3] = this.field1397.pixels[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field1344.field577[var4] = this.field1398.pixels[var4];
        }
        this.field1269 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field1269[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field1269[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1269[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1269[var8 + 192] = 16777215;
        }
        this.field1270 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1270[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1270[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1270[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1270[var12 + 192] = 16777215;
        }
        this.field1271 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1271[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1271[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1271[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1271[var16 + 192] = 16777215;
        }
        this.field1268 = new int[256];
        this.field1206 = new int[32768];
        this.field1207 = new int[32768];
        this.method479(578, (Pix8) null);
        this.field1356 = new int[32768];
        this.field1357 = new int[32768];
        this.method13(true, "Connecting to fileserver", 10);
        if (!this.field1267) {
            this.field1340 = true;
            this.field1267 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILkb;I)V")
    private final void method406(int arg0, Packet arg1, int arg2) {
        int var4 = arg1.method227(9, 8);
        if (arg2 != 0) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (var4 < this.field1188) {
            for (int var6 = var4; var6 < this.field1188; ++var6) {
                this.field1305[this.field1304++] = this.field1189[var6];
            }
        }
        if (var4 > this.field1188) {
            signlink.reporterror(this.field1431 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1188 = 0;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field1189[var7];
                PlayerEntity var9 = this.field1187[var8];
                int var10 = arg1.method227(9, 1);
                if (var10 == 0) {
                    this.field1189[this.field1188++] = var8;
                    var9.field344 = field1320;
                } else {
                    int var11 = arg1.method227(9, 2);
                    if (var11 == 0) {
                        this.field1189[this.field1188++] = var8;
                        var9.field344 = field1320;
                        this.field1191[this.field1190++] = var8;
                    } else if (var11 == 1) {
                        this.field1189[this.field1188++] = var8;
                        var9.field344 = field1320;
                        int var12 = arg1.method227(9, 3);
                        var9.method111(false, var12, (byte) 6);
                        int var13 = arg1.method227(9, 1);
                        if (var13 == 1) {
                            this.field1191[this.field1190++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field1189[this.field1188++] = var8;
                        var9.field344 = field1320;
                        int var14 = arg1.method227(9, 3);
                        var9.method111(true, var14, (byte) 6);
                        int var15 = arg1.method227(9, 3);
                        var9.method111(true, var15, (byte) 6);
                        int var16 = arg1.method227(9, 1);
                        if (var16 == 1) {
                            this.field1191[this.field1190++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field1305[this.field1304++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)V")
    public final void method407(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1446.method189(arg2, arg1, false);
        this.field1447.method189(arg2 + arg5 - 16, arg1, false);
        Pix2D.method150(arg2 + 16, arg1, this.field1415, (byte) 93, 16, arg5 - 32);
        int var7 = (arg5 - 32) * arg5 / arg4;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - 32 - var7) * arg3 / (arg4 - arg5);
        if (arg0 <= 0) {
            this.field1145 = -1;
        }
        Pix2D.method150(arg2 + 16 + var8, arg1, this.field1523, (byte) 93, 16, var7);
        Pix2D.method153(this.field1358, this.field1092, arg2 + 16 + var8, var7, arg1);
        Pix2D.method153(this.field1358, this.field1092, arg2 + 16 + var8, var7, arg1 + 1);
        Pix2D.method152(this.field1358, 0, arg2 + 16 + var8, 16, arg1);
        Pix2D.method152(this.field1358, 0, arg2 + 17 + var8, 16, arg1);
        Pix2D.method153(this.field1345, this.field1092, arg2 + 16 + var8, var7, arg1 + 15);
        Pix2D.method153(this.field1345, this.field1092, arg2 + 17 + var8, var7 - 1, arg1 + 14);
        Pix2D.method152(this.field1345, 0, arg2 + 15 + var8 + var7, 16, arg1);
        Pix2D.method152(this.field1345, 0, arg2 + 14 + var8 + var7, 15, arg1 + 1);
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method408(byte arg0) {
        this.field1153 = true;
        if (arg0 != -6) {
            this.field1522 = null;
        }
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1154[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field949; ++var3) {
                if (!IdkType.field950[var3].field956 && IdkType.field950[var3].field951 == var2 + (this.field1201 ? 0 : 7)) {
                    this.field1154[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BIIZ)V")
    public final void method409(byte[] arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 <= 0) {
            this.field1214 = !this.field1214;
        }
        signlink.midifade = arg3 ? 1 : 0;
        signlink.midisave(arg0, arg2);
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method410(boolean arg0) {
        for (int var2 = 0; var2 < this.field1293; ++var2) {
            NpcEntity var3 = this.field1292[this.field1294[var2]];
            int var4 = (this.field1294[var2] << 14) + 536870912;
            if (var3 != null && var3.method112(false)) {
                int var5 = var3.field300 >> 7;
                int var6 = var3.field301 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field304 == 1 && (var3.field300 & 127) == 64 && (var3.field301 & 127) == 64) {
                        if (this.field1285[var5][var6] == this.field1202) {
                            continue;
                        }
                        this.field1285[var5][var6] = this.field1202;
                    }
                    this.field1196.method62(-44713, var3.field301, (var3.field304 - 1) * 64 + 60, var3.field302, var3.field300, var4, var3.field303, (Model) null, var3, this.method390(this.field1245, var3.field300, (byte) 5, var3.field301), this.field1245);
                }
            }
        }
        if (arg0) {
            this.field1145 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZ)V")
    public final void method411(int arg0, int arg1, boolean arg2) {
        signlink.midivol = arg1;
        this.field1144 += arg0;
        if (arg2) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method412(int arg0) {
        this.method452((byte) 99);
        this.field1396.method242((byte) 62);
        if (arg0 >= 4 && arg0 <= 4) {
            this.field1468.method189(0, 0, false);
            short var2 = 360;
            short var3 = 200;
            if (this.field1474 == 0) {
                int var4 = var3 / 2 - 20;
                this.field1352.method192(var2 / 2, 16776960, true, var4, "Welcome to RuneScape", 0);
                int var15 = var4 + 30;
                int var5 = var2 / 2 - 80;
                int var6 = var3 / 2 + 20;
                this.field1469.method189(var6 - 20, var5 - 73, false);
                this.field1352.method192(var5, 16777215, true, var6 + 5, "New user", 0);
                int var7 = var2 / 2 + 80;
                this.field1469.method189(var6 - 20, var7 - 73, false);
                this.field1352.method192(var7, 16777215, true, var6 + 5, "Existing User", 0);
            }
            if (this.field1474 == 2) {
                int var8 = var3 / 2 - 40;
                if (this.field1448.length() > 0) {
                    this.field1352.method192(var2 / 2, 16776960, true, var8 - 15, this.field1448, 0);
                    this.field1352.method192(var2 / 2, 16776960, true, var8, this.field1449, 0);
                    var8 += 30;
                } else {
                    this.field1352.method192(var2 / 2, 16776960, true, var8 - 7, this.field1449, 0);
                    var8 += 30;
                }
                this.field1352.method196(var2 / 2 - 90, 6, var8, "Username: " + this.field1431 + (this.field1337 == 0 & field1320 % 40 < 20 ? "@yel@|" : ""), true, 16777215);
                var8 += 15;
                this.field1352.method196(var2 / 2 - 88, 6, var8, "Password: " + JString.method264(7, this.field1432) + (this.field1337 == 1 & field1320 % 40 < 20 ? "@yel@|" : ""), true, 16777215);
                var8 += 15;
                int var9 = var2 / 2 - 80;
                int var10 = var3 / 2 + 50;
                this.field1469.method189(var10 - 20, var9 - 73, false);
                this.field1352.method192(var9, 16777215, true, var10 + 5, "Login", 0);
                int var11 = var2 / 2 + 80;
                this.field1469.method189(var10 - 20, var11 - 73, false);
                this.field1352.method192(var11, 16777215, true, var10 + 5, "Cancel", 0);
            }
            if (this.field1474 == 3) {
                this.field1352.method192(var2 / 2, 16776960, true, var3 / 2 - 60, "Create a free account", 0);
                int var12 = var3 / 2 - 35;
                this.field1352.method192(var2 / 2, 16777215, true, var12, "To create a new account you need to", 0);
                int var16 = var12 + 15;
                this.field1352.method192(var2 / 2, 16777215, true, var16, "go back to the main RuneScape webpage", 0);
                int var17 = var16 + 15;
                this.field1352.method192(var2 / 2, 16777215, true, var17, "and choose the red 'create account'", 0);
                int var18 = var17 + 15;
                this.field1352.method192(var2 / 2, 16777215, true, var18, "button at the top right of that page.", 0);
                int var19 = var18 + 15;
                int var13 = var2 / 2;
                int var14 = var3 / 2 + 50;
                this.field1469.method189(var14 - 20, var13 - 73, false);
                this.field1352.method192(var13, 16777215, true, var14 + 5, "Cancel", 0);
            }
            this.field1396.draw(186, super.graphics, 214, 5193);
            if (this.field1116) {
                this.field1116 = false;
                this.field1394.draw(0, super.graphics, 128, 5193);
                this.field1395.draw(386, super.graphics, 214, 5193);
                this.field1399.draw(265, super.graphics, 0, 5193);
                this.field1400.draw(265, super.graphics, 574, 5193);
                this.field1401.draw(186, super.graphics, 128, 5193);
                this.field1402.draw(186, super.graphics, 574, 5193);
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method413(int arg0) {
        if (this.field1414 == null) {
            this.method395(true);
            super.drawArea = null;
            this.field1394 = null;
            this.field1395 = null;
            this.field1396 = null;
            this.field1397 = null;
            if (arg0 == -7185) {
                this.field1398 = null;
                this.field1399 = null;
                this.field1400 = null;
                this.field1401 = null;
                this.field1402 = null;
                this.field1414 = new PixMap(this.method11(field1481), 479, 299, 96);
                this.field1412 = new PixMap(this.method11(field1481), 168, 299, 160);
                Pix2D.method149(this.field1508);
                this.field1347.method189(0, 0, false);
                this.field1411 = new PixMap(this.method11(field1481), 190, 299, 261);
                this.field1413 = new PixMap(this.method11(field1481), 512, 299, 334);
                Pix2D.method149(this.field1508);
                this.field1217 = new PixMap(this.method11(field1481), 501, 299, 61);
                this.field1218 = new PixMap(this.method11(field1481), 288, 299, 40);
                this.field1219 = new PixMap(this.method11(field1481), 269, 299, 66);
                this.field1116 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILkb;)V")
    private final void method414(int arg0, int arg1, Packet arg2) {
        if (arg0 < 2 || arg0 > 2) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        while (arg2.field623 + 10 < arg1 * 8) {
            int var5 = arg2.method227(9, 11);
            if (var5 == 2047) {
                break;
            }
            if (this.field1187[var5] == null) {
                this.field1187[var5] = new PlayerEntity();
                if (this.field1192[var5] != null) {
                    this.field1187[var5].method114(false, this.field1192[var5]);
                }
            }
            this.field1189[this.field1188++] = var5;
            PlayerEntity var6 = this.field1187[var5];
            var6.field344 = field1320;
            int var7 = arg2.method227(9, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg2.method227(9, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = arg2.method227(9, 1);
            var6.method110(false, var9 == 1, this.field1332.field348[0] + var7, this.field1332.field349[0] + var8);
            int var10 = arg2.method227(9, 1);
            if (var10 == 1) {
                this.field1191[this.field1190++] = var5;
            }
        }
        arg2.method228(this.field1178);
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method415(int arg0) {
        try {
            if (this.field1364 != null) {
                this.field1364.method29();
            }
        } catch (Exception var3) {
        }
        this.field1364 = null;
        this.field1339 = false;
        this.field1474 = 0;
        this.field1431 = "";
        this.field1432 = "";
        InputTracking.method35((byte) 65);
        this.method440(this.field1208);
        if (arg0 < 0) {
            this.field1196.method51(742);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1319[var2].method302((byte) 74);
            }
            System.gc();
            this.method374(0);
            this.field1484 = null;
            this.field1109 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILhc;I)V")
    public final void method416(int arg0, int arg1, int arg2, Component arg3, int arg4) {
        if (arg3.field966 == 0 && arg3.field980 != null) {
            if (!arg3.field979 || this.field1428 == arg3.field964 || this.field1306 == arg3.field964 || this.field1224 == arg3.field964) {
                int var6 = Pix2D.field538;
                int var7 = Pix2D.field536;
                int var8 = Pix2D.field539;
                int var9 = Pix2D.field537;
                if (arg2 != 38682) {
                    this.field1145 = -1;
                }
                Pix2D.method148(arg3.field970 + arg0, arg0, arg3.field969 + arg1, 789, arg1);
                int var10 = arg3.field980.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg3.field981[var11] + arg1;
                    int var13 = arg3.field982[var11] + arg0 - arg4;
                    Component var14 = Component.field959[arg3.field980[var11]];
                    int var15 = var14.field971 + var12;
                    int var16 = var14.field972 + var13;
                    if (var14.field968 > 0) {
                        this.method433(0, var14);
                    }
                    if (var14.field966 == 0) {
                        if (var14.field978 > var14.field977 - var14.field970) {
                            var14.field978 = var14.field977 - var14.field970;
                        }
                        if (var14.field978 < 0) {
                            var14.field978 = 0;
                        }
                        this.method416(var16, var15, 38682, var14, var14.field978);
                        if (var14.field977 > var14.field970) {
                            this.method407(this.field1168, var14.field969 + var15, var16, var14.field978, var14.field977, var14.field970);
                        }
                    } else if (var14.field966 != 1) {
                        if (var14.field966 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field970; ++var18) {
                                for (int var19 = 0; var19 < var14.field969; ++var19) {
                                    int var20 = (var14.field988 + 32) * var19 + var15;
                                    int var21 = (var14.field989 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field991[var17];
                                        var21 += var14.field992[var17];
                                    }
                                    if (var14.field960[var17] <= 0) {
                                        if (var14.field990 != null && var17 < 20) {
                                            Pix32 var27 = var14.field990[var17];
                                            if (var27 != null) {
                                                var27.method175(var21, var20, false);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field960[var17] - 1;
                                        if (var20 >= -32 && var20 <= 512 && var21 >= -32 && var21 <= 334 || this.field1211 != 0 && this.field1210 == var17) {
                                            Pix32 var25 = ObjType.method299(var24, 24638, var14.field961[var17]);
                                            if (this.field1211 != 0 && this.field1210 == var17 && this.field1209 == var14.field964) {
                                                var22 = super.mouseX - this.field1212;
                                                var23 = super.mouseY - this.field1213;
                                                if (var22 < 5 && var22 > -5) {
                                                    var22 = 0;
                                                }
                                                if (var23 < 5 && var23 > -5) {
                                                    var23 = 0;
                                                }
                                                if (this.field1289 < 5) {
                                                    var22 = 0;
                                                    var23 = 0;
                                                }
                                                var25.method179(128, var20 + var22, var21 + var23, (byte) -26);
                                            } else if (this.field1312 != 0 && this.field1311 == var17 && this.field1310 == var14.field964) {
                                                var25.method179(128, var20, var21, (byte) -26);
                                            } else {
                                                var25.method175(var21, var20, false);
                                            }
                                            if (var25.field582 == 33 || var14.field961[var17] != 1) {
                                                int var26 = var14.field961[var17];
                                                this.field1350.method194(var20 + 1 + var22, var21 + 10 + var23, false, 0, method465(true, var26));
                                                this.field1350.method194(var20 + var22, var21 + 9 + var23, false, 16776960, method465(true, var26));
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field966 == 3) {
                            if (var14.field994) {
                                Pix2D.method150(var16, var15, var14.field1000, (byte) 93, var14.field969, var14.field970);
                            } else {
                                Pix2D.method151(3, var15, var14.field1000, var14.field970, var16, var14.field969);
                            }
                        } else if (var14.field966 == 4) {
                            PixFont var28 = var14.field997;
                            int var29 = var14.field1000;
                            String var30 = var14.field998;
                            if ((this.field1224 == var14.field964 || this.field1306 == var14.field964 || this.field1428 == var14.field964) && var14.field1002 != 0) {
                                var29 = var14.field1002;
                            }
                            if (this.method471(var14, 65)) {
                                var29 = var14.field1001;
                                if (var14.field999.length() > 0) {
                                    var30 = var14.field999;
                                }
                            }
                            if (var14.field967 == 6 && this.field1237) {
                                var30 = "Please wait...";
                                var29 = var14.field1000;
                            }
                            int var31 = var28.field609 + var16;
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
                                                                        var30 = var30.substring(0, var36) + this.method446(this.method483(var14, false, 4), -676) + var30.substring(var36 + 2);
                                                                    }
                                                                }
                                                                var30 = var30.substring(0, var35) + this.method446(this.method483(var14, false, 3), -676) + var30.substring(var35 + 2);
                                                            }
                                                        }
                                                        var30 = var30.substring(0, var34) + this.method446(this.method483(var14, false, 2), -676) + var30.substring(var34 + 2);
                                                    }
                                                }
                                                var30 = var30.substring(0, var33) + this.method446(this.method483(var14, false, 1), -676) + var30.substring(var33 + 2);
                                            }
                                        }
                                        var30 = var30.substring(0, var32) + this.method446(this.method483(var14, false, 0), -676) + var30.substring(var32 + 2);
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
                                if (var14.field995) {
                                    var28.method192(var14.field969 / 2 + var15, var29, var14.field996, var31, var38, 0);
                                } else {
                                    var28.method196(var15, 6, var31, var38, var14.field996, var29);
                                }
                                var31 += var28.field609;
                            }
                        } else if (var14.field966 == 5) {
                            Pix32 var39;
                            if (this.method471(var14, 65)) {
                                var39 = var14.field1004;
                            } else {
                                var39 = var14.field1003;
                            }
                            if (var39 != null) {
                                var39.method175(var16, var15, false);
                            }
                        } else if (var14.field966 == 6) {
                            int var40 = Pix3D.field554;
                            int var41 = Pix3D.field555;
                            Pix3D.field554 = var14.field969 / 2 + var15;
                            Pix3D.field555 = var14.field970 / 2 + var16;
                            int var42 = Pix3D.field558[var14.field1010] * var14.field1009 >> 16;
                            int var43 = Pix3D.field559[var14.field1010] * var14.field1009 >> 16;
                            boolean var44 = this.method471(var14, 65);
                            int var45;
                            if (var44) {
                                var45 = var14.field1008;
                            } else {
                                var45 = var14.field1007;
                            }
                            Model var46;
                            if (var45 == -1) {
                                var46 = var14.method323(-1, -1, var44);
                            } else {
                                SeqType var47 = SeqType.field1028[var45];
                                var46 = var14.method323(var47.field1030[var14.field962], var47.field1031[var14.field962], var44);
                            }
                            if (var46 != null) {
                                var46.method140(0, var14.field1011, 0, var14.field1010, 0, var42, var43);
                            }
                            Pix3D.field554 = var40;
                            Pix3D.field555 = var41;
                        } else if (var14.field966 == 7) {
                            PixFont var48 = var14.field997;
                            int var49 = 0;
                            for (int var50 = 0; var50 < var14.field970; ++var50) {
                                for (int var51 = 0; var51 < var14.field969; ++var51) {
                                    if (var14.field960[var49] > 0) {
                                        ObjType var52 = ObjType.method294(var14.field960[var49] - 1);
                                        String var53 = var52.field883;
                                        if (var52.field895 || var14.field961[var49] != 1) {
                                            var53 = var53 + " x" + method397(var14.field961[var49], 0);
                                        }
                                        int var54 = (var14.field988 + 115) * var51 + var15;
                                        int var55 = (var14.field989 + 12) * var50 + var16;
                                        if (var14.field995) {
                                            var48.method192(var14.field969 / 2 + var54, var14.field1000, var14.field996, var55, var53, 0);
                                        } else {
                                            var48.method196(var54, 6, var55, var53, var14.field996, var14.field1000);
                                        }
                                    }
                                    ++var49;
                                }
                            }
                        }
                    }
                }
                Pix2D.method148(var9, var7, var8, 789, var6);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILkb;)V")
    private final void method417(boolean arg0, int arg1, Packet arg2) {
        for (int var4 = 0; var4 < this.field1190; ++var4) {
            int var5 = this.field1191[var4];
            PlayerEntity var6 = this.field1187[var5];
            int var7 = arg2.method216();
            if ((var7 & 128) == 128) {
                var7 += arg2.method216() << 8;
            }
            this.method496(true, var5, var7, arg2, var6);
        }
        this.field1339 &= arg0;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method418(int arg0, int arg1) {
        int var3 = 19 / arg1;
        int var4 = VarpType.field1060[arg0].field1068;
        if (var4 != 0) {
            int var5 = this.field1303[arg0];
            if (var4 == 1) {
                if (var5 == 1) {
                    Pix3D.method163(true, 0.9D);
                }
                if (var5 == 2) {
                    Pix3D.method163(true, 0.8D);
                }
                if (var5 == 3) {
                    Pix3D.method163(true, 0.7D);
                }
                if (var5 == 4) {
                    Pix3D.method163(true, 0.6D);
                }
                ObjType.field917.method105();
                this.field1116 = true;
            }
            if (var4 == 3) {
                boolean var6 = this.field1200;
                if (var5 == 0) {
                    this.method411(0, 0, this.field1200);
                    this.field1200 = true;
                }
                if (var5 == 1) {
                    this.method411(0, -400, this.field1200);
                    this.field1200 = true;
                }
                if (var5 == 2) {
                    this.method411(0, -800, this.field1200);
                    this.field1200 = true;
                }
                if (var5 == 3) {
                    this.method411(0, -1200, this.field1200);
                    this.field1200 = true;
                }
                if (var5 == 4) {
                    this.field1200 = false;
                }
                if (this.field1200 != var6) {
                    if (this.field1200) {
                        this.method371(false, this.field1475, this.field1484, this.field1520);
                    } else {
                        this.method374(0);
                    }
                    this.field1109 = 0;
                }
            }
            if (var4 == 4) {
                if (var5 == 0) {
                    this.field1518 = true;
                    this.method436(0, 0);
                }
                if (var5 == 1) {
                    this.field1518 = true;
                    this.method436(-400, 0);
                }
                if (var5 == 2) {
                    this.field1518 = true;
                    this.method436(-800, 0);
                }
                if (var5 == 3) {
                    this.field1518 = true;
                    this.method436(-1200, 0);
                }
                if (var5 == 4) {
                    this.field1518 = false;
                }
            }
            if (var4 == 5) {
                this.field1175 = var5;
            }
            if (var4 == 6) {
                this.field1165 = var5;
            }
            if (var4 == 8) {
                this.field1198 = var5;
                this.field1330 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method419(boolean arg0) {
        this.field1339 &= arg0;
        for (int var2 = 0; var2 < this.field1293; ++var2) {
            int var3 = this.field1294[var2];
            NpcEntity var4 = this.field1292[var3];
            if (var4 != null) {
                this.method420(var4, (byte) -128, var4.field354.field851);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lx;BI)V")
    public final void method420(PathingEntity arg0, byte arg1, int arg2) {
        if (arg0.field300 < 128 || arg0.field301 < 128 || arg0.field300 >= 13184 || arg0.field301 >= 13184) {
            arg0.field327 = -1;
            arg0.field332 = -1;
            arg0.field341 = 0;
            arg0.field342 = 0;
            arg0.field300 = arg0.field348[0] * 128 + arg0.field304 * 64;
            arg0.field301 = arg0.field349[0] * 128 + arg0.field304 * 64;
            arg0.field347 = 0;
        }
        if (this.field1332 == arg0 && (arg0.field300 < 1536 || arg0.field301 < 1536 || arg0.field300 >= 11776 || arg0.field301 >= 11776)) {
            arg0.field327 = -1;
            arg0.field332 = -1;
            arg0.field341 = 0;
            arg0.field342 = 0;
            arg0.field300 = arg0.field348[0] * 128 + arg0.field304 * 64;
            arg0.field301 = arg0.field349[0] * 128 + arg0.field304 * 64;
            arg0.field347 = 0;
        }
        if (arg0.field341 > field1320) {
            this.method421(arg0, -25115);
        } else if (arg0.field342 >= field1320) {
            this.method422(arg0, 0);
        } else {
            this.method423(598, arg0);
        }
        this.method424(arg0, (byte) 117);
        if (arg1 != -128) {
            this.field1163.method206(11);
        }
        this.method425(this.field1152, arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lx;I)V")
    public final void method421(PathingEntity arg0, int arg1) {
        int var3 = arg0.field341 - field1320;
        int var4 = arg0.field337 * 128 + arg0.field304 * 64;
        int var5 = arg0.field339 * 128 + arg0.field304 * 64;
        arg0.field300 += (var4 - arg0.field300) / var3;
        if (arg1 != -25115) {
            this.field1098 = this.field1118.nextInt();
        }
        arg0.field301 += (var5 - arg0.field301) / var3;
        arg0.field351 = 0;
        if (arg0.field343 == 0) {
            arg0.field346 = 1024;
        }
        if (arg0.field343 == 1) {
            arg0.field346 = 1536;
        }
        if (arg0.field343 == 2) {
            arg0.field346 = 0;
        }
        if (arg0.field343 == 3) {
            arg0.field346 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lx;I)V")
    public final void method422(PathingEntity arg0, int arg1) {
        this.field1144 += arg1;
        if (field1320 == arg0.field342 || arg0.field327 == -1 || arg0.field330 != 0 || arg0.field329 + 1 > SeqType.field1028[arg0.field327].field1032[arg0.field328]) {
            int var3 = arg0.field342 - arg0.field341;
            int var4 = field1320 - arg0.field341;
            int var5 = arg0.field337 * 128 + arg0.field304 * 64;
            int var6 = arg0.field339 * 128 + arg0.field304 * 64;
            int var7 = arg0.field338 * 128 + arg0.field304 * 64;
            int var8 = arg0.field340 * 128 + arg0.field304 * 64;
            arg0.field300 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field301 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field351 = 0;
        if (arg0.field343 == 0) {
            arg0.field346 = 1024;
        }
        if (arg0.field343 == 1) {
            arg0.field346 = 1536;
        }
        if (arg0.field343 == 2) {
            arg0.field346 = 0;
        }
        if (arg0.field343 == 3) {
            arg0.field346 = 512;
        }
        arg0.field302 = arg0.field346;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILx;)V")
    public final void method423(int arg0, PathingEntity arg1) {
        arg1.field324 = arg1.field305;
        int var3 = 56 / arg0;
        if (arg1.field347 == 0) {
            arg1.field351 = 0;
        } else {
            if (arg1.field327 != -1 && arg1.field330 == 0) {
                SeqType var4 = SeqType.field1028[arg1.field327];
                if (var4.field1034 == null) {
                    ++arg1.field351;
                    return;
                }
            }
            int var5 = arg1.field300;
            int var6 = arg1.field301;
            int var7 = arg1.field348[arg1.field347 - 1] * 128 + arg1.field304 * 64;
            int var8 = arg1.field349[arg1.field347 - 1] * 128 + arg1.field304 * 64;
            if (var7 - var5 <= 256 && var7 - var5 >= -256 && var8 - var6 <= 256 && var8 - var6 >= -256) {
                if (var5 < var7) {
                    if (var6 < var8) {
                        arg1.field346 = 1280;
                    } else if (var6 > var8) {
                        arg1.field346 = 1792;
                    } else {
                        arg1.field346 = 1536;
                    }
                } else if (var5 > var7) {
                    if (var6 < var8) {
                        arg1.field346 = 768;
                    } else if (var6 > var8) {
                        arg1.field346 = 256;
                    } else {
                        arg1.field346 = 512;
                    }
                } else if (var6 < var8) {
                    arg1.field346 = 1024;
                } else {
                    arg1.field346 = 0;
                }
                int var9 = arg1.field346 - arg1.field302 & 2047;
                if (var9 > 1024) {
                    var9 -= 2048;
                }
                int var10 = arg1.field308;
                if (var9 >= -256 && var9 <= 256) {
                    var10 = arg1.field307;
                } else if (var9 >= 256 && var9 < 768) {
                    var10 = arg1.field310;
                } else if (var9 >= -768 && var9 <= -256) {
                    var10 = arg1.field309;
                }
                if (var10 == -1) {
                    var10 = arg1.field307;
                }
                arg1.field324 = var10;
                int var11 = 4;
                if (arg1.field346 != arg1.field302 && arg1.field321 == -1) {
                    var11 = 2;
                }
                if (arg1.field347 > 2) {
                    var11 = 6;
                }
                if (arg1.field347 > 3) {
                    var11 = 8;
                }
                if (arg1.field351 > 0 && arg1.field347 > 1) {
                    var11 = 8;
                    --arg1.field351;
                }
                if (arg1.field350[arg1.field347 - 1]) {
                    var11 <<= 1;
                }
                if (var11 >= 8 && arg1.field324 == arg1.field307 && arg1.field311 != -1) {
                    arg1.field324 = arg1.field311;
                }
                if (var5 < var7) {
                    arg1.field300 += var11;
                    if (arg1.field300 > var7) {
                        arg1.field300 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field300 -= var11;
                    if (arg1.field300 < var7) {
                        arg1.field300 = var7;
                    }
                }
                if (var6 < var8) {
                    arg1.field301 += var11;
                    if (arg1.field301 > var8) {
                        arg1.field301 = var8;
                    }
                } else if (var6 > var8) {
                    arg1.field301 -= var11;
                    if (arg1.field301 < var8) {
                        arg1.field301 = var8;
                    }
                }
                if (arg1.field300 == var7 && arg1.field301 == var8) {
                    --arg1.field347;
                }
            } else {
                arg1.field300 = var7;
                arg1.field301 = var8;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lx;B)V")
    public final void method424(PathingEntity arg0, byte arg1) {
        if (arg1 != 117) {
            this.field1163.method206(89);
        }
        if (arg0.field321 != -1 && arg0.field321 < 32768) {
            NpcEntity var3 = this.field1292[arg0.field321];
            if (var3 != null) {
                int var4 = arg0.field300 - var3.field300;
                int var5 = arg0.field301 - var3.field301;
                if (var4 != 0 || var5 != 0) {
                    arg0.field346 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                }
            }
        }
        if (arg0.field321 >= 32768) {
            int var6 = arg0.field321 - 32768;
            if (this.field1099 == var6) {
                var6 = this.field1186;
            }
            PlayerEntity var7 = this.field1187[var6];
            if (var7 != null) {
                int var8 = arg0.field300 - var7.field300;
                int var9 = arg0.field301 - var7.field301;
                if (var8 != 0 || var9 != 0) {
                    arg0.field346 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                }
            }
        }
        if ((arg0.field322 != 0 || arg0.field323 != 0) && (arg0.field347 == 0 || arg0.field351 > 0)) {
            int var10 = arg0.field300 - (arg0.field322 - this.field1126 - this.field1126) * 64;
            int var11 = arg0.field301 - (arg0.field323 - this.field1127 - this.field1127) * 64;
            if (var10 != 0 || var11 != 0) {
                arg0.field346 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
            }
            arg0.field322 = 0;
            arg0.field323 = 0;
        }
        int var12 = arg0.field346 - arg0.field302 & 2047;
        if (var12 != 0) {
            if (var12 >= 32 && var12 <= 2016) {
                if (var12 > 1024) {
                    arg0.field302 -= 32;
                } else {
                    arg0.field302 += 32;
                }
            } else {
                arg0.field302 = arg0.field346;
            }
            arg0.field302 &= 2047;
            if (arg0.field324 == arg0.field305 && arg0.field346 != arg0.field302) {
                if (arg0.field306 != -1) {
                    arg0.field324 = arg0.field306;
                    return;
                }
                arg0.field324 = arg0.field307;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLx;)V")
    public final void method425(boolean arg0, PathingEntity arg1) {
        if (arg0) {
            arg1.field303 = false;
            if (arg1.field324 != -1) {
                SeqType var3 = SeqType.field1028[arg1.field324];
                ++arg1.field326;
                if (arg1.field325 < var3.field1029 && arg1.field326 > var3.field1032[arg1.field325]) {
                    arg1.field326 = 0;
                    ++arg1.field325;
                }
                if (arg1.field325 >= var3.field1029) {
                    arg1.field326 = 0;
                    arg1.field325 = 0;
                }
            }
            if (arg1.field327 != -1 && arg1.field330 == 0) {
                SeqType var4 = SeqType.field1028[arg1.field327];
                ++arg1.field329;
                while (arg1.field328 < var4.field1029 && arg1.field329 > var4.field1032[arg1.field328]) {
                    arg1.field329 -= var4.field1032[arg1.field328];
                    ++arg1.field328;
                }
                if (arg1.field328 >= var4.field1029) {
                    arg1.field328 -= var4.field1033;
                    ++arg1.field331;
                    if (arg1.field331 >= var4.field1039) {
                        arg1.field327 = -1;
                    }
                    if (arg1.field328 < 0 || arg1.field328 >= var4.field1029) {
                        arg1.field327 = -1;
                    }
                }
                arg1.field303 = var4.field1035;
            }
            if (arg1.field330 > 0) {
                --arg1.field330;
            }
            if (arg1.field332 != -1 && field1320 >= arg1.field335) {
                if (arg1.field333 < 0) {
                    arg1.field333 = 0;
                }
                SeqType var5 = SpotAnimType.field1043[arg1.field332].field1047;
                ++arg1.field334;
                while (arg1.field333 < var5.field1029 && arg1.field334 > var5.field1032[arg1.field333]) {
                    arg1.field334 -= var5.field1032[arg1.field333];
                    ++arg1.field333;
                }
                if (arg1.field333 >= var5.field1029) {
                    if (arg1.field333 < 0 || arg1.field333 >= var5.field1029) {
                        arg1.field332 = -1;
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method426(int arg0) {
        if (arg0 != 29510) {
            this.field1497 = 411;
        }
        if (this.field1116) {
            this.field1116 = false;
            this.field1372.draw(11, super.graphics, 0, 5193);
            this.field1373.draw(375, super.graphics, 0, 5193);
            this.field1374.draw(5, super.graphics, 729, 5193);
            this.field1375.draw(231, super.graphics, 752, 5193);
            this.field1376.draw(0, super.graphics, 0, 5193);
            this.field1377.draw(0, super.graphics, 561, 5193);
            this.field1378.draw(11, super.graphics, 520, 5193);
            this.field1379.draw(231, super.graphics, 520, 5193);
            this.field1380.draw(375, super.graphics, 501, 5193);
            this.field1381.draw(345, super.graphics, 0, 5193);
            this.field1329 = true;
            this.field1330 = true;
            this.field1445 = true;
            this.field1286 = true;
            if (this.field1443 != 2) {
                this.field1413.draw(11, super.graphics, 8, 5193);
                this.field1412.draw(5, super.graphics, 561, 5193);
            }
        }
        if (this.field1443 == 2) {
            this.method382(0);
        }
        if (this.field1244 && this.field1513 == 1) {
            this.field1329 = true;
        }
        if (this.field1494 != -1) {
            boolean var2 = this.method467(this.field1494, this.field1334, 623);
            if (var2) {
                this.field1329 = true;
            }
        }
        if (this.field1312 == 2) {
            this.field1329 = true;
        }
        if (this.field1211 == 2) {
            this.field1329 = true;
        }
        if (this.field1329) {
            this.method494((byte) 2);
            this.field1329 = false;
        }
        if (this.field1366 == -1) {
            this.field1173.field978 = this.field1157 - this.field1342 - 77;
            if (super.mouseX > 453 && super.mouseX < 565 && super.mouseY > 350) {
                this.method454(super.mouseX - 22, 0, super.mouseY - 375, this.field1157, 77, false, 463, 0, this.field1173);
            }
            int var3 = this.field1157 - 77 - this.field1173.field978;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1157 - 77) {
                var3 = this.field1157 - 77;
            }
            if (this.field1342 != var3) {
                this.field1342 = var3;
                this.field1330 = true;
            }
        }
        if (this.field1366 != -1) {
            boolean var4 = this.method467(this.field1366, this.field1334, 623);
            if (var4) {
                this.field1330 = true;
            }
        }
        if (this.field1312 == 3) {
            this.field1330 = true;
        }
        if (this.field1211 == 3) {
            this.field1330 = true;
        }
        if (this.field1301 != null) {
            this.field1330 = true;
        }
        if (this.field1244 && this.field1513 == 2) {
            this.field1330 = true;
        }
        if (this.field1330) {
            this.method492(false);
            this.field1330 = false;
        }
        if (this.field1443 == 2) {
            this.method400(this.field1300);
            this.field1412.draw(5, super.graphics, 561, 5193);
        }
        if (this.field1493 != -1) {
            this.field1445 = true;
        }
        if (this.field1445) {
            if (this.field1493 != -1 && this.field1493 == this.field1122) {
                this.field1493 = -1;
                this.field1163.method205((byte) -34, 175);
                this.field1163.method206(this.field1122);
            }
            this.field1445 = false;
            this.field1219.method242((byte) 62);
            this.field1275.method189(0, 0, false);
            if (this.field1494 == -1) {
                if (this.field1226[this.field1122] != -1) {
                    if (this.field1122 == 0) {
                        this.field1256.method189(30, 29, false);
                    }
                    if (this.field1122 == 1) {
                        this.field1257.method189(29, 59, false);
                    }
                    if (this.field1122 == 2) {
                        this.field1257.method189(29, 87, false);
                    }
                    if (this.field1122 == 3) {
                        this.field1258.method189(29, 115, false);
                    }
                    if (this.field1122 == 4) {
                        this.field1260.method189(29, 156, false);
                    }
                    if (this.field1122 == 5) {
                        this.field1260.method189(29, 184, false);
                    }
                    if (this.field1122 == 6) {
                        this.field1259.method189(30, 212, false);
                    }
                }
                if (this.field1226[0] != -1 && (this.field1493 != 0 || field1320 % 20 < 10)) {
                    this.field1179[0].method189(34, 35, false);
                }
                if (this.field1226[1] != -1 && (this.field1493 != 1 || field1320 % 20 < 10)) {
                    this.field1179[1].method189(32, 59, false);
                }
                if (this.field1226[2] != -1 && (this.field1493 != 2 || field1320 % 20 < 10)) {
                    this.field1179[2].method189(32, 86, false);
                }
                if (this.field1226[3] != -1 && (this.field1493 != 3 || field1320 % 20 < 10)) {
                    this.field1179[3].method189(33, 121, false);
                }
                if (this.field1226[4] != -1 && (this.field1493 != 4 || field1320 % 20 < 10)) {
                    this.field1179[4].method189(34, 157, false);
                }
                if (this.field1226[5] != -1 && (this.field1493 != 5 || field1320 % 20 < 10)) {
                    this.field1179[5].method189(32, 185, false);
                }
                if (this.field1226[6] != -1 && (this.field1493 != 6 || field1320 % 20 < 10)) {
                    this.field1179[6].method189(34, 212, false);
                }
            }
            this.field1219.draw(165, super.graphics, 520, 5193);
            this.field1218.method242((byte) 62);
            this.field1274.method189(0, 0, false);
            if (this.field1494 == -1) {
                if (this.field1226[this.field1122] != -1) {
                    if (this.field1122 == 7) {
                        this.field1405.method189(0, 49, false);
                    }
                    if (this.field1122 == 8) {
                        this.field1406.method189(0, 81, false);
                    }
                    if (this.field1122 == 9) {
                        this.field1406.method189(0, 108, false);
                    }
                    if (this.field1122 == 10) {
                        this.field1407.method189(1, 136, false);
                    }
                    if (this.field1122 == 11) {
                        this.field1409.method189(0, 178, false);
                    }
                    if (this.field1122 == 12) {
                        this.field1409.method189(0, 205, false);
                    }
                    if (this.field1122 == 13) {
                        this.field1408.method189(0, 233, false);
                    }
                }
                if (this.field1226[8] != -1 && (this.field1493 != 8 || field1320 % 20 < 10)) {
                    this.field1179[7].method189(2, 80, false);
                }
                if (this.field1226[9] != -1 && (this.field1493 != 9 || field1320 % 20 < 10)) {
                    this.field1179[8].method189(3, 107, false);
                }
                if (this.field1226[10] != -1 && (this.field1493 != 10 || field1320 % 20 < 10)) {
                    this.field1179[9].method189(4, 142, false);
                }
                if (this.field1226[11] != -1 && (this.field1493 != 11 || field1320 % 20 < 10)) {
                    this.field1179[10].method189(2, 179, false);
                }
                if (this.field1226[12] != -1 && (this.field1493 != 12 || field1320 % 20 < 10)) {
                    this.field1179[11].method189(2, 206, false);
                }
                if (this.field1226[13] != -1 && (this.field1493 != 13 || field1320 % 20 < 10)) {
                    this.field1179[12].method189(2, 230, false);
                }
            }
            this.field1218.draw(492, super.graphics, 501, 5193);
            this.field1413.method242((byte) 62);
        }
        if (this.field1286) {
            this.field1286 = false;
            this.field1217.method242((byte) 62);
            this.field1273.method189(0, 0, false);
            this.field1351.method192(57, 16777215, true, 33, "Public chat", 0);
            if (this.field1341 == 0) {
                this.field1351.method192(57, 65280, true, 46, "On", 0);
            }
            if (this.field1341 == 1) {
                this.field1351.method192(57, 16776960, true, 46, "Friends", 0);
            }
            if (this.field1341 == 2) {
                this.field1351.method192(57, 16711680, true, 46, "Off", 0);
            }
            if (this.field1341 == 3) {
                this.field1351.method192(57, 65535, true, 46, "Hide", 0);
            }
            this.field1351.method192(186, 16777215, true, 33, "Private chat", 0);
            if (this.field1120 == 0) {
                this.field1351.method192(186, 65280, true, 46, "On", 0);
            }
            if (this.field1120 == 1) {
                this.field1351.method192(186, 16776960, true, 46, "Friends", 0);
            }
            if (this.field1120 == 2) {
                this.field1351.method192(186, 16711680, true, 46, "Off", 0);
            }
            this.field1351.method192(326, 16777215, true, 33, "Trade/duel", 0);
            if (this.field1250 == 0) {
                this.field1351.method192(326, 65280, true, 46, "On", 0);
            }
            if (this.field1250 == 1) {
                this.field1351.method192(326, 16776960, true, 46, "Friends", 0);
            }
            if (this.field1250 == 2) {
                this.field1351.method192(326, 16711680, true, 46, "Off", 0);
            }
            this.field1351.method192(462, 16777215, true, 38, "Report abuse", 0);
            this.field1217.draw(471, super.graphics, 0, 5193);
            this.field1413.method242((byte) 62);
        }
        this.field1334 = 0;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)Z")
    public final boolean method427(int arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field1506[arg1];
            if (arg0 <= 0) {
                throw new NullPointerException();
            } else {
                if (var3 >= 2000) {
                    var3 -= 2000;
                }
                return var3 == 406;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method428(int arg0, int arg1) {
        if (arg1 >= 0) {
            if (this.field1420) {
                this.field1420 = false;
                this.field1330 = true;
            }
            int var3 = this.field1504[arg1];
            int var4 = this.field1505[arg1];
            int var5 = this.field1506[arg1];
            int var6 = this.field1507[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 903 || var5 == 363) {
                String var7 = this.field1199[arg1];
                int var8 = var7.indexOf("@whi@");
                if (var8 != -1) {
                    String var9 = var7.substring(var8 + 5).trim();
                    String var10 = JString.method262(0, JString.method259(JString.method258(var9), false));
                    boolean var11 = false;
                    for (int var12 = 0; var12 < this.field1188; ++var12) {
                        PlayerEntity var13 = this.field1187[this.field1189[var12]];
                        if (var13 != null && var13.field357 != null && var13.field357.equalsIgnoreCase(var10)) {
                            this.method464(this.field1332.field348[0], 1, false, var13.field348[0], this.field1332.field349[0], 0, 2, 1, var13.field349[0], 0, 0, 0);
                            if (var5 == 903) {
                                this.field1163.method205((byte) -34, 206);
                            }
                            if (var5 == 363) {
                                this.field1163.method205((byte) -34, 164);
                            }
                            this.field1163.method207(this.field1189[var12]);
                            var11 = true;
                            break;
                        }
                    }
                    if (!var11) {
                        this.method468(0, "Unable to find " + var10, (byte) 4, "");
                    }
                }
            }
            if (var5 == 450 && this.method449(75, var3, var4, var6, true)) {
                this.field1163.method207(this.field1370);
                this.field1163.method207(this.field1368);
                this.field1163.method207(this.field1369);
            }
            if (var5 == 405 || var5 == 38 || var5 == 422 || var5 == 478 || var5 == 347) {
                if (var5 == 478) {
                    if ((var3 & 3) == 0) {
                        ++field1089;
                    }
                    if (field1089 >= 90) {
                        this.field1163.method205((byte) -34, 220);
                    }
                    this.field1163.method205((byte) -34, 157);
                }
                if (var5 == 347) {
                    this.field1163.method205((byte) -34, 211);
                }
                if (var5 == 422) {
                    this.field1163.method205((byte) -34, 133);
                }
                if (var5 == 405) {
                    field1171 += var6;
                    if (field1171 >= 97) {
                        this.field1163.method205((byte) -34, 30);
                        this.field1163.method209(14953816);
                    }
                    this.field1163.method205((byte) -34, 195);
                }
                if (var5 == 38) {
                    this.field1163.method205((byte) -34, 71);
                }
                this.field1163.method207(var6);
                this.field1163.method207(var3);
                this.field1163.method207(var4);
                this.field1309 = 0;
                this.field1310 = var4;
                this.field1311 = var3;
                this.field1312 = 2;
                if (Component.field959[var4].field965 == this.field1336) {
                    this.field1312 = 1;
                }
                if (Component.field959[var4].field965 == this.field1366) {
                    this.field1312 = 3;
                }
            }
            if (var5 == 728 || var5 == 542 || var5 == 6 || var5 == 963 || var5 == 245) {
                NpcEntity var14 = this.field1292[var6];
                if (var14 != null) {
                    this.method464(this.field1332.field348[0], 1, false, var14.field348[0], this.field1332.field349[0], 0, 2, 1, var14.field349[0], 0, 0, 0);
                    this.field1103 = super.mouseClikcX;
                    this.field1104 = super.mouseClickY;
                    this.field1106 = 2;
                    this.field1105 = 0;
                    if (var5 == 542) {
                        this.field1163.method205((byte) -34, 8);
                    }
                    if (var5 == 6) {
                        if ((var6 & 3) == 0) {
                            ++field1232;
                        }
                        if (field1232 >= 124) {
                            this.field1163.method205((byte) -34, 88);
                            this.field1163.method210(0);
                        }
                        this.field1163.method205((byte) -34, 27);
                    }
                    if (var5 == 963) {
                        this.field1163.method205((byte) -34, 113);
                    }
                    if (var5 == 728) {
                        this.field1163.method205((byte) -34, 194);
                    }
                    if (var5 == 245) {
                        if ((var6 & 3) == 0) {
                            ++field1162;
                        }
                        if (field1162 >= 85) {
                            this.field1163.method205((byte) -34, 176);
                            this.field1163.method207(39596);
                        }
                        this.field1163.method205((byte) -34, 100);
                    }
                    this.field1163.method207(var6);
                }
            }
            if (var5 == 217) {
                boolean var15 = this.method464(this.field1332.field348[0], 0, false, var3, this.field1332.field349[0], 0, 2, 0, var4, 0, 0, 0);
                if (!var15) {
                    this.method464(this.field1332.field348[0], 1, false, var3, this.field1332.field349[0], 0, 2, 1, var4, 0, 0, 0);
                }
                this.field1103 = super.mouseClikcX;
                this.field1104 = super.mouseClickY;
                this.field1106 = 2;
                this.field1105 = 0;
                this.field1163.method205((byte) -34, 239);
                this.field1163.method207(this.field1126 + var3);
                this.field1163.method207(this.field1127 + var4);
                this.field1163.method207(var6);
                this.field1163.method207(this.field1370);
                this.field1163.method207(this.field1368);
                this.field1163.method207(this.field1369);
            }
            if (var5 == 1175) {
                int var17 = var6 >> 14 & 32767;
                LocType var18 = LocType.method282(var17);
                String var19;
                if (var18.field811 != null) {
                    var19 = new String(var18.field811);
                } else {
                    var19 = "It's a " + var18.field810 + ".";
                }
                this.method468(0, var19, (byte) 4, "");
            }
            if (var5 == 285) {
                this.method449(245, var3, var4, var6, true);
            }
            if (var5 == 881) {
                this.field1163.method205((byte) -34, 130);
                this.field1163.method207(var6);
                this.field1163.method207(var3);
                this.field1163.method207(var4);
                this.field1163.method207(this.field1370);
                this.field1163.method207(this.field1368);
                this.field1163.method207(this.field1369);
                this.field1309 = 0;
                this.field1310 = var4;
                this.field1311 = var3;
                this.field1312 = 2;
                if (Component.field959[var4].field965 == this.field1336) {
                    this.field1312 = 1;
                }
                if (Component.field959[var4].field965 == this.field1366) {
                    this.field1312 = 3;
                }
            }
            if (var5 == 391) {
                this.field1163.method205((byte) -34, 48);
                this.field1163.method207(var6);
                this.field1163.method207(var3);
                this.field1163.method207(var4);
                this.field1163.method207(this.field1391);
                this.field1309 = 0;
                this.field1310 = var4;
                this.field1311 = var3;
                this.field1312 = 2;
                if (Component.field959[var4].field965 == this.field1336) {
                    this.field1312 = 1;
                }
                if (Component.field959[var4].field965 == this.field1366) {
                    this.field1312 = 3;
                }
            }
            if (var5 == 660) {
                if (!this.field1244) {
                    this.field1196.method90(4, super.mouseClickY - 11, super.mouseClikcX - 8);
                } else {
                    this.field1196.method90(4, var4 - 11, var3 - 8);
                }
            }
            if (var5 == 188) {
                this.field1367 = 1;
                this.field1368 = var3;
                this.field1369 = var4;
                this.field1370 = var6;
                this.field1371 = ObjType.method294(var6).field883;
                this.field1390 = 0;
            } else {
                if (var5 == 44 && !this.field1237) {
                    this.field1163.method205((byte) -34, 235);
                    this.field1163.method207(var4);
                    this.field1237 = true;
                }
                if (var5 == 1773) {
                    ObjType var20 = ObjType.method294(var6);
                    String var21;
                    if (var4 >= 100000) {
                        var21 = var4 + " x " + var20.field883;
                    } else if (var20.field884 != null) {
                        var21 = new String(var20.field884);
                    } else {
                        var21 = "It's a " + var20.field883 + ".";
                    }
                    this.method468(0, var21, (byte) 4, "");
                }
                if (var5 == 900) {
                    NpcEntity var22 = this.field1292[var6];
                    if (var22 != null) {
                        this.method464(this.field1332.field348[0], 1, false, var22.field348[0], this.field1332.field349[0], 0, 2, 1, var22.field349[0], 0, 0, 0);
                        this.field1103 = super.mouseClikcX;
                        this.field1104 = super.mouseClickY;
                        this.field1106 = 2;
                        this.field1105 = 0;
                        this.field1163.method205((byte) -34, 202);
                        this.field1163.method207(var6);
                        this.field1163.method207(this.field1370);
                        this.field1163.method207(this.field1368);
                        this.field1163.method207(this.field1369);
                    }
                }
                if (var5 == 1373 || var5 == 1544 || var5 == 151 || var5 == 1101) {
                    PlayerEntity var23 = this.field1187[var6];
                    if (var23 != null) {
                        this.method464(this.field1332.field348[0], 1, false, var23.field348[0], this.field1332.field349[0], 0, 2, 1, var23.field349[0], 0, 0, 0);
                        this.field1103 = super.mouseClikcX;
                        this.field1104 = super.mouseClickY;
                        this.field1106 = 2;
                        this.field1105 = 0;
                        if (var5 == 1101) {
                            this.field1163.method205((byte) -34, 164);
                        }
                        if (var5 == 151) {
                            ++field1255;
                            if (field1255 >= 90) {
                                this.field1163.method205((byte) -34, 2);
                                this.field1163.method207(31114);
                            }
                            this.field1163.method205((byte) -34, 53);
                        }
                        if (var5 == 1373) {
                            this.field1163.method205((byte) -34, 206);
                        }
                        if (var5 == 1544) {
                            this.field1163.method205((byte) -34, 185);
                        }
                        this.field1163.method207(var6);
                    }
                }
                if (var5 == 265) {
                    NpcEntity var24 = this.field1292[var6];
                    if (var24 != null) {
                        this.method464(this.field1332.field348[0], 1, false, var24.field348[0], this.field1332.field349[0], 0, 2, 1, var24.field349[0], 0, 0, 0);
                        this.field1103 = super.mouseClikcX;
                        this.field1104 = super.mouseClickY;
                        this.field1106 = 2;
                        this.field1105 = 0;
                        this.field1163.method205((byte) -34, 134);
                        this.field1163.method207(var6);
                        this.field1163.method207(this.field1391);
                    }
                }
                if (var5 == 679) {
                    String var25 = this.field1199[arg1];
                    int var26 = var25.indexOf("@whi@");
                    if (var26 != -1) {
                        long var27 = JString.method258(var25.substring(var26 + 5).trim());
                        int var29 = -1;
                        for (int var30 = 0; var30 < this.field1454; ++var30) {
                            if (this.field1308[var30] == var27) {
                                var29 = var30;
                                break;
                            }
                        }
                        if (var29 != -1 && this.field1138[var29] > 0) {
                            this.field1330 = true;
                            this.field1420 = false;
                            this.field1234 = true;
                            this.field1130 = "";
                            this.field1125 = 3;
                            this.field1265 = this.field1308[var29];
                            this.field1140 = "Enter message to send to " + this.field1492[var29];
                        }
                    }
                }
                if (var5 == 55 && this.method449(9, var3, var4, var6, true)) {
                    this.field1163.method207(this.field1391);
                }
                if (var5 == 224 || var5 == 993 || var5 == 99 || var5 == 746 || var5 == 877) {
                    boolean var31 = this.method464(this.field1332.field348[0], 0, false, var3, this.field1332.field349[0], 0, 2, 0, var4, 0, 0, 0);
                    if (!var31) {
                        this.method464(this.field1332.field348[0], 1, false, var3, this.field1332.field349[0], 0, 2, 1, var4, 0, 0, 0);
                    }
                    this.field1103 = super.mouseClikcX;
                    this.field1104 = super.mouseClickY;
                    this.field1106 = 2;
                    this.field1105 = 0;
                    if (var5 == 224) {
                        this.field1163.method205((byte) -34, 140);
                    }
                    if (var5 == 746) {
                        this.field1163.method205((byte) -34, 178);
                    }
                    if (var5 == 877) {
                        this.field1163.method205((byte) -34, 247);
                    }
                    if (var5 == 99) {
                        this.field1163.method205((byte) -34, 200);
                    }
                    if (var5 == 993) {
                        this.field1163.method205((byte) -34, 40);
                    }
                    this.field1163.method207(this.field1126 + var3);
                    this.field1163.method207(this.field1127 + var4);
                    this.field1163.method207(var6);
                }
                if (var5 == 1607) {
                    NpcEntity var33 = this.field1292[var6];
                    if (var33 != null) {
                        String var34;
                        if (var33.field354.field850 != null) {
                            var34 = new String(var33.field354.field850);
                        } else {
                            var34 = "It's a " + var33.field354.field849 + ".";
                        }
                        this.method468(0, var34, (byte) 4, "");
                    }
                }
                if (var5 == 504) {
                    this.method449(172, var3, var4, var6, true);
                }
                if (var5 == 930) {
                    Component var35 = Component.field959[var4];
                    this.field1390 = 1;
                    this.field1391 = var4;
                    this.field1392 = var35.field1014;
                    this.field1367 = 0;
                    String var36 = var35.field1012;
                    if (var36.indexOf(" ") != -1) {
                        var36 = var36.substring(0, var36.indexOf(" "));
                    }
                    String var37 = var35.field1012;
                    if (var37.indexOf(" ") != -1) {
                        var37 = var37.substring(var37.indexOf(" ") + 1);
                    }
                    this.field1393 = var36 + " " + var35.field1013 + " " + var37;
                    if (this.field1392 == 16) {
                        this.field1329 = true;
                        this.field1122 = 3;
                        this.field1445 = true;
                    }
                } else {
                    if (var5 == 951) {
                        Component var38 = Component.field959[var4];
                        boolean var39 = true;
                        if (var38.field968 > 0) {
                            var39 = this.method438(false, var38);
                        }
                        if (var39) {
                            this.field1163.method205((byte) -34, 155);
                            this.field1163.method207(var4);
                        }
                    }
                    if (var5 == 602 || var5 == 596 || var5 == 22 || var5 == 892 || var5 == 415) {
                        if (var5 == 22) {
                            this.field1163.method205((byte) -34, 212);
                        }
                        if (var5 == 415) {
                            if ((var4 & 3) == 0) {
                                ++field1302;
                            }
                            if (field1302 >= 55) {
                                this.field1163.method205((byte) -34, 17);
                                this.field1163.method210(0);
                            }
                            this.field1163.method205((byte) -34, 6);
                        }
                        if (var5 == 602) {
                            this.field1163.method205((byte) -34, 31);
                        }
                        if (var5 == 892) {
                            if ((var3 & 3) == 0) {
                                ++field1241;
                            }
                            if (field1241 >= 130) {
                                this.field1163.method205((byte) -34, 238);
                                this.field1163.method206(177);
                            }
                            this.field1163.method205((byte) -34, 38);
                        }
                        if (var5 == 596) {
                            this.field1163.method205((byte) -34, 59);
                        }
                        this.field1163.method207(var6);
                        this.field1163.method207(var3);
                        this.field1163.method207(var4);
                        this.field1309 = 0;
                        this.field1310 = var4;
                        this.field1311 = var3;
                        this.field1312 = 2;
                        if (Component.field959[var4].field965 == this.field1336) {
                            this.field1312 = 1;
                        }
                        if (Component.field959[var4].field965 == this.field1366) {
                            this.field1312 = 3;
                        }
                    }
                    if (var5 == 581) {
                        if ((var6 & 3) == 0) {
                            ++field1137;
                        }
                        if (field1137 >= 99) {
                            this.field1163.method205((byte) -34, 7);
                            this.field1163.method210(0);
                        }
                        this.method449(97, var3, var4, var6, true);
                    }
                    if (var5 == 965) {
                        boolean var40 = this.method464(this.field1332.field348[0], 0, false, var3, this.field1332.field349[0], 0, 2, 0, var4, 0, 0, 0);
                        if (!var40) {
                            this.method464(this.field1332.field348[0], 1, false, var3, this.field1332.field349[0], 0, 2, 1, var4, 0, 0, 0);
                        }
                        this.field1103 = super.mouseClikcX;
                        this.field1104 = super.mouseClickY;
                        this.field1106 = 2;
                        this.field1105 = 0;
                        this.field1163.method205((byte) -34, 138);
                        this.field1163.method207(this.field1126 + var3);
                        this.field1163.method207(this.field1127 + var4);
                        this.field1163.method207(var6);
                        this.field1163.method207(this.field1391);
                    }
                    if (var5 == 1501) {
                        field1222 += this.field1127;
                        if (field1222 >= 92) {
                            this.field1163.method205((byte) -34, 66);
                            this.field1163.method210(0);
                        }
                        this.method449(116, var3, var4, var6, true);
                    }
                    if (var5 == 364) {
                        this.method449(96, var3, var4, var6, true);
                    }
                    if (var5 == 1102) {
                        ObjType var42 = ObjType.method294(var6);
                        String var43;
                        if (var42.field884 != null) {
                            var43 = new String(var42.field884);
                        } else {
                            var43 = "It's a " + var42.field883 + ".";
                        }
                        this.method468(0, var43, (byte) 4, "");
                    }
                    if (var5 == 960) {
                        this.field1163.method205((byte) -34, 155);
                        this.field1163.method207(var4);
                        Component var44 = Component.field959[var4];
                        if (var44.field973 != null && var44.field973[0][0] == 5) {
                            int var45 = var44.field973[0][1];
                            if (this.field1303[var45] != var44.field975[0]) {
                                this.field1303[var45] = var44.field975[0];
                                this.method418(var45, 49);
                                this.field1329 = true;
                            }
                        }
                    }
                    if (var5 == 34) {
                        String var46 = this.field1199[arg1];
                        int var47 = var46.indexOf("@whi@");
                        if (var47 != -1) {
                            this.method373((byte) -60);
                            this.field1335 = var46.substring(var47 + 5).trim();
                            this.field1246 = false;
                            for (int var48 = 0; var48 < Component.field959.length; ++var48) {
                                if (Component.field959[var48] != null && Component.field959[var48].field968 == 600) {
                                    this.field1272 = this.field1336 = Component.field959[var48].field965;
                                    break;
                                }
                            }
                        }
                    }
                    if (var5 == 947) {
                        this.method373((byte) -60);
                    }
                    if (var5 == 367) {
                        PlayerEntity var49 = this.field1187[var6];
                        if (var49 != null) {
                            this.method464(this.field1332.field348[0], 1, false, var49.field348[0], this.field1332.field349[0], 0, 2, 1, var49.field349[0], 0, 0, 0);
                            this.field1103 = super.mouseClikcX;
                            this.field1104 = super.mouseClickY;
                            this.field1106 = 2;
                            this.field1105 = 0;
                            this.field1163.method205((byte) -34, 248);
                            this.field1163.method207(var6);
                            this.field1163.method207(this.field1370);
                            this.field1163.method207(this.field1368);
                            this.field1163.method207(this.field1369);
                        }
                    }
                    if (var5 == 465) {
                        this.field1163.method205((byte) -34, 155);
                        this.field1163.method207(var4);
                        Component var50 = Component.field959[var4];
                        if (var50.field973 != null && var50.field973[0][0] == 5) {
                            int var51 = var50.field973[0][1];
                            this.field1303[var51] = 1 - this.field1303[var51];
                            this.method418(var51, 49);
                            this.field1329 = true;
                        }
                    }
                    if (var5 == 406 || var5 == 436 || var5 == 557 || var5 == 556) {
                        String var52 = this.field1199[arg1];
                        int var53 = var52.indexOf("@whi@");
                        if (var53 != -1) {
                            long var54 = JString.method258(var52.substring(var53 + 5).trim());
                            if (var5 == 406) {
                                this.method457(var54, -460);
                            }
                            if (var5 == 436) {
                                this.method378(var54, (byte) 3);
                            }
                            if (var5 == 557) {
                                this.method470(43808, var54);
                            }
                            if (var5 == 556) {
                                this.method487(1, var54);
                            }
                        }
                    }
                    if (var5 == 651) {
                        PlayerEntity var56 = this.field1187[var6];
                        if (var56 != null) {
                            this.method464(this.field1332.field348[0], 1, false, var56.field348[0], this.field1332.field349[0], 0, 2, 1, var56.field349[0], 0, 0, 0);
                            this.field1103 = super.mouseClikcX;
                            this.field1104 = super.mouseClickY;
                            this.field1106 = 2;
                            this.field1105 = 0;
                            this.field1163.method205((byte) -34, 177);
                            this.field1163.method207(var6);
                            this.field1163.method207(this.field1391);
                        }
                    }
                    this.field1367 = 0;
                    if (arg0 != 6412) {
                        this.method6();
                    }
                    this.field1390 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method429(int arg0, boolean arg1, int arg2) {
        if (arg1) {
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

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)Ljava/lang/String;")
    public final String method430(int arg0) {
        if (arg0 != -7437) {
            this.field1163.method206(216);
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.frame != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method431(int arg0) {
        int var2 = this.field1514;
        int var3 = this.field1515;
        int var4 = this.field1516;
        int var5 = this.field1517;
        int var6 = 6116423;
        Pix2D.method150(var3, var2, var6, (byte) 93, var4, var5);
        Pix2D.method150(var3 + 1, var2 + 1, 0, (byte) 93, var4 - 2, 16);
        Pix2D.method151(3, var2 + 1, 0, var5 - 19, var3 + 18, var4 - 2);
        this.field1352.method194(var2 + 3, var3 + 14, false, var6, "Choose Option");
        int var7 = super.mouseX;
        int var8 = super.mouseY;
        if (this.field1513 == 0) {
            var7 -= 8;
            var8 -= 11;
        }
        if (this.field1513 == 1) {
            var7 -= 562;
            var8 -= 231;
        }
        if (this.field1513 == 2) {
            var7 -= 22;
            var8 -= 375;
        }
        for (int var9 = 0; var9 < this.field1439; ++var9) {
            int var10 = (this.field1439 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field1352.method196(var2 + 3, 6, var10, this.field1199[var9], true, var11);
        }
        if (arg0 >= 0) {
            this.field1145 = this.field1160.method216();
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)V")
    public final void method432(int arg0, int arg1, int arg2) {
        if (this.field1198 != 0) {
            int var4 = 0;
            if (this.field1322 != 0) {
                var4 = 1;
            }
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field1263[var5] != null) {
                    int var6 = this.field1261[var5];
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field1120 == 0 || this.field1120 == 1 && this.method495(-20, this.field1262[var5]))) {
                        int var7 = 329 - var4 * 13;
                        if (super.mouseX > 8 && super.mouseX < 520 && arg2 - 11 > var7 - 10 && arg2 - 11 <= var7 + 3) {
                            if (this.field1388) {
                                this.field1199[this.field1439] = "Report abuse @whi@" + this.field1262[var5];
                                this.field1506[this.field1439] = 2034;
                                ++this.field1439;
                            }
                            this.field1199[this.field1439] = "Add ignore @whi@" + this.field1262[var5];
                            this.field1506[this.field1439] = 2436;
                            ++this.field1439;
                            this.field1199[this.field1439] = "Add friend @whi@" + this.field1262[var5];
                            this.field1506[this.field1439] = 2406;
                            ++this.field1439;
                        }
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                    if ((var6 == 5 || var6 == 6) && this.field1120 < 2) {
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg1 != 27078) {
                this.field1152 = !this.field1152;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILhc;)V")
    public final void method433(int arg0, Component arg1) {
        int var3 = arg1.field968;
        if (arg0 != 0) {
            field1323 = -68;
        }
        if (var3 >= 1 && var3 <= 100) {
            --var3;
            if (var3 >= this.field1454) {
                arg1.field998 = "";
                arg1.field967 = 0;
            } else {
                arg1.field998 = this.field1492[var3];
                arg1.field967 = 1;
            }
        } else if (var3 >= 101 && var3 <= 200) {
            var3 -= 101;
            if (var3 >= this.field1454) {
                arg1.field998 = "";
                arg1.field967 = 0;
            } else {
                if (this.field1138[var3] == 0) {
                    arg1.field998 = "@red@Offline";
                } else if (this.field1138[var3] == field1251) {
                    arg1.field998 = "@gre@World-" + (this.field1138[var3] - 9);
                } else {
                    arg1.field998 = "@yel@World-" + (this.field1138[var3] - 9);
                }
                arg1.field967 = 1;
            }
        } else if (var3 == 203) {
            arg1.field977 = this.field1454 * 15 + 20;
            if (arg1.field977 <= arg1.field970) {
                arg1.field977 = arg1.field970 + 1;
            }
        } else if (var3 >= 401 && var3 <= 500) {
            var3 -= 401;
            if (var3 >= this.field1158) {
                arg1.field998 = "";
                arg1.field967 = 0;
            } else {
                arg1.field998 = JString.method262(0, JString.method259(this.field1133[var3], false));
                arg1.field967 = 1;
            }
        } else if (var3 == 503) {
            arg1.field977 = this.field1158 * 15 + 20;
            if (arg1.field977 <= arg1.field970) {
                arg1.field977 = arg1.field970 + 1;
            }
        } else if (var3 == 327) {
            arg1.field1010 = 150;
            arg1.field1011 = (int) (Math.sin((double) field1320 / 40.0D) * 256.0D) & 2047;
            if (this.field1153) {
                this.field1153 = false;
                Model[] var4 = new Model[7];
                int var5 = 0;
                for (int var6 = 0; var6 < 7; ++var6) {
                    int var9 = this.field1154[var6];
                    if (var9 >= 0) {
                        var4[var5++] = IdkType.field950[var9].method320();
                    }
                }
                Model var7 = new Model(0, var4, var5);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field1107[var8] != 0) {
                        var7.method134(field1307[var8][0], field1307[var8][this.field1107[var8]]);
                        if (var8 == 1) {
                            var7.method134(field1438[0], field1438[this.field1107[var8]]);
                        }
                    }
                }
                var7.method127(4);
                var7.method128(-16599, SeqType.field1028[this.field1332.field305].field1030[0]);
                var7.method137(64, 850, -30, -50, -30, true);
                arg1.field1005 = var7;
            }
        } else if (var3 == 324) {
            if (this.field1326 == null) {
                this.field1326 = arg1.field1003;
                this.field1327 = arg1.field1004;
            }
            if (this.field1201) {
                arg1.field1003 = this.field1327;
            } else {
                arg1.field1003 = this.field1326;
            }
        } else if (var3 == 325) {
            if (this.field1326 == null) {
                this.field1326 = arg1.field1003;
                this.field1327 = arg1.field1004;
            }
            if (this.field1201) {
                arg1.field1003 = this.field1326;
            } else {
                arg1.field1003 = this.field1327;
            }
        } else if (var3 == 600) {
            arg1.field998 = this.field1335;
            if (field1320 % 20 < 10) {
                arg1.field998 = arg1.field998 + "|";
            } else {
                arg1.field998 = arg1.field998 + " ";
            }
        } else {
            if (var3 == 613) {
                if (this.field1388) {
                    if (this.field1246) {
                        arg1.field1000 = 16711680;
                        arg1.field998 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else {
                        arg1.field1000 = 16777215;
                        arg1.field998 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else {
                    arg1.field998 = "";
                }
            }
            if (var3 == 650 || var3 == 655) {
                if (this.field1426 != 0) {
                    String var10;
                    if (this.field1238 == 0) {
                        var10 = "earlier today";
                    } else if (this.field1238 == 1) {
                        var10 = "yesterday";
                    } else {
                        var10 = this.field1238 + " days ago";
                    }
                    arg1.field998 = "You last logged in " + var10 + " from: " + signlink.dns;
                } else {
                    arg1.field998 = "";
                }
            }
            if (var3 == 651) {
                if (this.field1419 == 0) {
                    arg1.field998 = "0 unread messages";
                    arg1.field1000 = 16776960;
                }
                if (this.field1419 == 1) {
                    arg1.field998 = "1 unread message";
                    arg1.field1000 = 65280;
                }
                if (this.field1419 > 1) {
                    arg1.field998 = this.field1419 + " unread messages";
                    arg1.field1000 = 65280;
                }
            }
            if (var3 == 652) {
                if (this.field1266 == 201) {
                    arg1.field998 = "";
                } else if (this.field1266 == 200) {
                    arg1.field998 = "You have not yet set any password recovery questions.";
                } else {
                    String var11;
                    if (this.field1266 == 0) {
                        var11 = "Earlier today";
                    } else if (this.field1266 == 1) {
                        var11 = "Yesterday";
                    } else {
                        var11 = this.field1266 + " days ago";
                    }
                    arg1.field998 = var11 + " you changed your recovery questions";
                }
            }
            if (var3 == 653) {
                if (this.field1266 == 201) {
                    arg1.field998 = "";
                } else if (this.field1266 == 200) {
                    arg1.field998 = "We strongly recommend you do so now to secure your account.";
                } else {
                    arg1.field998 = "If you do not remember making this change then cancel it immediately";
                }
            }
            if (var3 == 654) {
                if (this.field1266 == 201) {
                    arg1.field998 = "";
                } else if (this.field1266 == 200) {
                    arg1.field998 = "Do this from the 'account management' area on our front webpage";
                } else {
                    arg1.field998 = "Do this from the 'account management' area on our front webpage";
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BII)Z")
    public final boolean method434(byte[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field1145 = -1;
        }
        return arg0 == null ? true : signlink.wavesave(arg0, arg1);
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)Z")
    public final boolean method435(int arg0) {
        if (arg0 <= 0) {
            this.field1163.method206(77);
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method436(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field1522 = null;
        }
        signlink.wavevol = arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLkb;I)V")
    private final void method437(boolean arg0, Packet arg1, int arg2) {
        if (arg0) {
            this.method6();
        }
        while (arg1.field623 + 21 < arg2 * 8) {
            int var4 = arg1.method227(9, 13);
            if (var4 == 8191) {
                break;
            }
            if (this.field1292[var4] == null) {
                this.field1292[var4] = new NpcEntity();
            }
            NpcEntity var5 = this.field1292[var4];
            this.field1294[this.field1293++] = var4;
            var5.field344 = field1320;
            var5.field354 = NpcType.method288(arg1.method227(9, 11));
            var5.field304 = var5.field354.field851;
            var5.field307 = var5.field354.field855;
            var5.field308 = var5.field354.field856;
            var5.field309 = var5.field354.field857;
            var5.field310 = var5.field354.field858;
            var5.field305 = var5.field354.field854;
            int var6 = arg1.method227(9, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg1.method227(9, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            var5.method110(false, false, this.field1332.field348[0] + var6, this.field1332.field349[0] + var7);
            int var8 = arg1.method227(9, 1);
            if (var8 == 1) {
                this.field1191[this.field1190++] = var4;
            }
        }
        arg1.method228(this.field1178);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLhc;)Z")
    public final boolean method438(boolean arg0, Component arg1) {
        int var3 = arg1.field968;
        if (arg0) {
            this.method6();
        }
        if (var3 == 201) {
            this.field1330 = true;
            this.field1420 = false;
            this.field1234 = true;
            this.field1130 = "";
            this.field1125 = 1;
            this.field1140 = "Enter name of friend to add to list";
        }
        if (var3 == 202) {
            this.field1330 = true;
            this.field1420 = false;
            this.field1234 = true;
            this.field1130 = "";
            this.field1125 = 2;
            this.field1140 = "Enter name of friend to delete from list";
        }
        if (var3 == 205) {
            this.field1148 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field1330 = true;
                this.field1420 = false;
                this.field1234 = true;
                this.field1130 = "";
                this.field1125 = 4;
                this.field1140 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field1330 = true;
                this.field1420 = false;
                this.field1234 = true;
                this.field1130 = "";
                this.field1125 = 5;
                this.field1140 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field1154[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = IdkType.field949 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= IdkType.field949) {
                                var6 = 0;
                            }
                        }
                        if (!IdkType.field950[var6].field956 && IdkType.field950[var6].field951 == var4 + (this.field1201 ? 0 : 7)) {
                            this.field1154[var4] = var6;
                            this.field1153 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field1107[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field1307[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field1307[var7].length) {
                        var9 = 0;
                    }
                }
                this.field1107[var7] = var9;
                this.field1153 = true;
            }
            if (var3 == 324 && !this.field1201) {
                this.field1201 = true;
                this.method408((byte) -6);
            }
            if (var3 == 325 && this.field1201) {
                this.field1201 = false;
                this.method408((byte) -6);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field1246 = !this.field1246;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method373((byte) -60);
                    if (this.field1335.length() > 0) {
                        this.field1163.method205((byte) -34, 190);
                        this.field1163.method212(true, JString.method258(this.field1335));
                        this.field1163.method206(var3 - 601);
                        this.field1163.method206(this.field1246 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1163.method205((byte) -34, 52);
                this.field1163.method206(this.field1201 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field1163.method206(this.field1154[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field1163.method206(this.field1107[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        if (signlink.sunjava) {
            super.mindel = 5;
        }
        if (!field1254) {
            this.field1164 = true;
            this.field1177 = true;
            this.method12(this, 2);
            this.method371(false, 12345678, "scape_main", 40000);
        }
        if (field1467) {
            this.field1435 = true;
        } else {
            field1467 = true;
            boolean var1 = false;
            String var2 = this.method430(-7437);
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
                this.field1288 = true;
            } else {
                try {
                    int var3 = 5;
                    this.field1176[8] = 0;
                    while (this.field1176[8] == 0) {
                        this.method13(true, "Connecting to fileserver", 10);
                        try {
                            DataInputStream var4 = this.method451("crc" + (int) (Math.random() * 9.9999999E7D));
                            Packet var5 = new Packet(363, new byte[36]);
                            var4.readFully(var5.field621, 0, 36);
                            for (int var6 = 0; var6 < 9; ++var6) {
                                this.field1176[var6] = var5.method221();
                            }
                            var4.close();
                        } catch (IOException var59) {
                            for (int var7 = var3; var7 > 0; --var7) {
                                this.method13(true, "Error loading - Will retry in " + var7 + " secs.", 10);
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
                    this.field1501 = this.method394("title screen", this.field1176[1], "title", 10, 0);
                    this.field1350 = new PixFont(this.field1501, "p11", 530);
                    this.field1351 = new PixFont(this.field1501, "p12", 530);
                    this.field1352 = new PixFont(this.field1501, "b12", 530);
                    this.field1353 = new PixFont(this.field1501, "q8", 530);
                    this.method485((byte) 5);
                    this.method405(0);
                    Jagfile var8 = this.method394("config", this.field1176[2], "config", 15, 0);
                    Jagfile var9 = this.method394("interface", this.field1176[3], "interface", 20, 0);
                    Jagfile var10 = this.method394("2d graphics", this.field1176[4], "media", 30, 0);
                    Jagfile var11 = this.method394("3d graphics", this.field1176[5], "models", 40, 0);
                    Jagfile var12 = this.method394("textures", this.field1176[6], "textures", 60, 0);
                    Jagfile var13 = this.method394("chat system", this.field1176[7], "wordenc", 65, 0);
                    Jagfile var14 = this.method394("sound effects", this.field1176[8], "sounds", 70, 0);
                    this.field1205 = new byte[4][104][104];
                    this.field1159 = new int[4][105][105];
                    this.field1196 = new World3D(415, this.field1159, 104, 4, 104);
                    for (int var15 = 0; var15 < 4; ++var15) {
                        this.field1319[var15] = new CollisionMap(104, -708, 104);
                    }
                    this.field1418 = new Pix32(512, 512);
                    this.method13(true, "Unpacking media", 75);
                    this.field1346 = new Pix8(var10, "invback", 0);
                    this.field1348 = new Pix8(var10, "chatback", 0);
                    this.field1347 = new Pix8(var10, "mapback", 0);
                    this.field1273 = new Pix8(var10, "backbase1", 0);
                    this.field1274 = new Pix8(var10, "backbase2", 0);
                    this.field1275 = new Pix8(var10, "backhmid1", 0);
                    for (int var16 = 0; var16 < 13; ++var16) {
                        this.field1179[var16] = new Pix8(var10, "sideicons", var16);
                    }
                    this.field1510 = new Pix32(var10, "compass", 0);
                    try {
                        for (int var17 = 0; var17 < 50; ++var17) {
                            this.field1403[var17] = new Pix8(var10, "mapscene", var17);
                        }
                    } catch (Exception var58) {
                    }
                    try {
                        for (int var18 = 0; var18 < 50; ++var18) {
                            this.field1503[var18] = new Pix32(var10, "mapfunction", var18);
                        }
                    } catch (Exception var57) {
                    }
                    try {
                        for (int var19 = 0; var19 < 20; ++var19) {
                            this.field1141[var19] = new Pix32(var10, "hitmarks", var19);
                        }
                    } catch (Exception var56) {
                    }
                    try {
                        for (int var20 = 0; var20 < 20; ++var20) {
                            this.field1321[var20] = new Pix32(var10, "headicons", var20);
                        }
                    } catch (Exception var55) {
                    }
                    this.field1362 = new Pix32(var10, "mapflag", 0);
                    for (int var21 = 0; var21 < 8; ++var21) {
                        this.field1485[var21] = new Pix32(var10, "cross", var21);
                    }
                    this.field1422 = new Pix32(var10, "mapdots", 0);
                    this.field1423 = new Pix32(var10, "mapdots", 1);
                    this.field1424 = new Pix32(var10, "mapdots", 2);
                    this.field1425 = new Pix32(var10, "mapdots", 3);
                    this.field1446 = new Pix8(var10, "scrollbar", 0);
                    this.field1447 = new Pix8(var10, "scrollbar", 1);
                    this.field1256 = new Pix8(var10, "redstone1", 0);
                    this.field1257 = new Pix8(var10, "redstone2", 0);
                    this.field1258 = new Pix8(var10, "redstone3", 0);
                    this.field1259 = new Pix8(var10, "redstone1", 0);
                    this.field1259.method186(-725);
                    this.field1260 = new Pix8(var10, "redstone2", 0);
                    this.field1260.method186(-725);
                    this.field1405 = new Pix8(var10, "redstone1", 0);
                    this.field1405.method187((byte) -74);
                    this.field1406 = new Pix8(var10, "redstone2", 0);
                    this.field1406.method187((byte) -74);
                    this.field1407 = new Pix8(var10, "redstone3", 0);
                    this.field1407.method187((byte) -74);
                    this.field1408 = new Pix8(var10, "redstone1", 0);
                    this.field1408.method186(-725);
                    this.field1408.method187((byte) -74);
                    this.field1409 = new Pix8(var10, "redstone2", 0);
                    this.field1409.method186(-725);
                    this.field1409.method187((byte) -74);
                    Pix32 var22 = new Pix32(var10, "backleft1", 0);
                    this.field1372 = new PixMap(this.method11(field1481), var22.field578, 299, var22.field579);
                    var22.method173(34676, 0, 0);
                    Pix32 var23 = new Pix32(var10, "backleft2", 0);
                    this.field1373 = new PixMap(this.method11(field1481), var23.field578, 299, var23.field579);
                    var23.method173(34676, 0, 0);
                    Pix32 var24 = new Pix32(var10, "backright1", 0);
                    this.field1374 = new PixMap(this.method11(field1481), var24.field578, 299, var24.field579);
                    var24.method173(34676, 0, 0);
                    Pix32 var25 = new Pix32(var10, "backright2", 0);
                    this.field1375 = new PixMap(this.method11(field1481), var25.field578, 299, var25.field579);
                    var25.method173(34676, 0, 0);
                    Pix32 var26 = new Pix32(var10, "backtop1", 0);
                    this.field1376 = new PixMap(this.method11(field1481), var26.field578, 299, var26.field579);
                    var26.method173(34676, 0, 0);
                    Pix32 var27 = new Pix32(var10, "backtop2", 0);
                    this.field1377 = new PixMap(this.method11(field1481), var27.field578, 299, var27.field579);
                    var27.method173(34676, 0, 0);
                    Pix32 var28 = new Pix32(var10, "backvmid1", 0);
                    this.field1378 = new PixMap(this.method11(field1481), var28.field578, 299, var28.field579);
                    var28.method173(34676, 0, 0);
                    Pix32 var29 = new Pix32(var10, "backvmid2", 0);
                    this.field1379 = new PixMap(this.method11(field1481), var29.field578, 299, var29.field579);
                    var29.method173(34676, 0, 0);
                    Pix32 var30 = new Pix32(var10, "backvmid3", 0);
                    this.field1380 = new PixMap(this.method11(field1481), var30.field578, 299, var30.field579);
                    var30.method173(34676, 0, 0);
                    Pix32 var31 = new Pix32(var10, "backhmid2", 0);
                    this.field1381 = new PixMap(this.method11(field1481), var31.field578, 299, var31.field579);
                    var31.method173(34676, 0, 0);
                    int var32 = (int) (Math.random() * 21.0D) - 10;
                    int var33 = (int) (Math.random() * 21.0D) - 10;
                    int var34 = (int) (Math.random() * 21.0D) - 10;
                    int var35 = (int) (Math.random() * 41.0D) - 20;
                    for (int var36 = 0; var36 < 50; ++var36) {
                        if (this.field1503[var36] != null) {
                            this.field1503[var36].method172(var32 + var35, var33 + var35, var34 + var35, true);
                        }
                        if (this.field1403[var36] != null) {
                            this.field1403[var36].method188(var32 + var35, var33 + var35, var34 + var35, true);
                        }
                    }
                    this.method13(true, "Unpacking textures", 80);
                    Pix3D.method159((byte) 2, var12);
                    Pix3D.method163(true, 0.8D);
                    Pix3D.method158(20, -20);
                    this.method13(true, "Unpacking models", 83);
                    Model.method122(field1323, var11);
                    AnimBase.unpack(false, var11);
                    AnimFrame.unpack(false, var11);
                    this.method13(true, "Unpacking config", 86);
                    SeqType.method326(var8, 473);
                    LocType.method280(var8);
                    FloType.method314(var8, 473);
                    ObjType.method292(var8);
                    NpcType.method286(var8);
                    IdkType.method318(var8, 473);
                    SpotAnimType.method328(var8, 473);
                    VarpType.method331(var8, 473);
                    ObjType.field880 = field1253;
                    if (!field1254) {
                        this.method13(true, "Unpacking sounds", 90);
                        byte[] var37 = var14.read("sounds.dat", (byte[]) null, (byte) 2);
                        Packet var38 = new Packet(363, var37);
                        Wave.method270(var38, 473);
                    }
                    this.method13(true, "Unpacking interfaces", 92);
                    PixFont[] var39 = new PixFont[] { this.field1350, this.field1351, this.field1352, this.field1353 };
                    Component.method322(var10, var39, 30, var9);
                    this.method13(true, "Preparing game engine", 97);
                    for (int var40 = 0; var40 < 33; ++var40) {
                        int var41 = 999;
                        int var42 = 0;
                        for (int var43 = 0; var43 < 35; ++var43) {
                            if (this.field1347.field588[this.field1347.field590 * var40 + var43] == 0) {
                                if (var41 == 999) {
                                    var41 = var43;
                                }
                            } else if (var41 != 999) {
                                var42 = var43;
                                break;
                            }
                        }
                        this.field1221[var40] = var41;
                        this.field1482[var40] = var42 - var41;
                    }
                    for (int var44 = 9; var44 < 160; ++var44) {
                        int var45 = 999;
                        int var46 = 0;
                        for (int var47 = 10; var47 < 168; ++var47) {
                            if (this.field1347.field588[this.field1347.field590 * var44 + var47] == 0 && (var47 > 34 || var44 > 34)) {
                                if (var45 == 999) {
                                    var45 = var47;
                                }
                            } else if (var45 != 999) {
                                var46 = var47;
                                break;
                            }
                        }
                        this.field1498[var44 - 9] = var45 - 21;
                        this.field1318[var44 - 9] = var46 - var45;
                    }
                    Pix3D.method156(96, 479, 0);
                    this.field1100 = Pix3D.field560;
                    Pix3D.method156(261, 190, 0);
                    this.field1101 = Pix3D.field560;
                    Pix3D.method156(334, 512, 0);
                    this.field1102 = Pix3D.field560;
                    int[] var48 = new int[9];
                    for (int var49 = 0; var49 < 9; ++var49) {
                        int var50 = var49 * 32 + 128 + 15;
                        int var51 = var50 * 3 + 600;
                        int var52 = Pix3D.field558[var50];
                        var48[var49] = var51 * var52 >> 16;
                    }
                    World3D.method88(var48, 800, 512, field1236, 334, 500);
                    WordFilter.method333(var13);
                } catch (Exception var60) {
                    this.field1230 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method439(int arg0) {
        if (this.field1211 == 0) {
            this.field1199[0] = "Cancel";
            this.field1506[0] = 1252;
            this.field1439 = 1;
            this.method432(super.mouseX, 27078, super.mouseY);
            this.field1233 = 0;
            int var2 = 12 / arg0;
            if (super.mouseX > 8 && super.mouseY > 11 && super.mouseX < 520 && super.mouseY < 345) {
                if (this.field1336 != -1) {
                    this.method386(super.mouseY, super.mouseX, 11, Component.field959[this.field1336], 5082, 8, 0);
                } else {
                    this.method488((byte) 2);
                }
            }
            if (this.field1428 != this.field1233) {
                this.field1428 = this.field1233;
            }
            this.field1233 = 0;
            if (super.mouseX > 562 && super.mouseY > 231 && super.mouseX < 752 && super.mouseY < 492) {
                if (this.field1494 != -1) {
                    this.method386(super.mouseY, super.mouseX, 231, Component.field959[this.field1494], 5082, 562, 0);
                } else if (this.field1226[this.field1122] != -1) {
                    this.method386(super.mouseY, super.mouseX, 231, Component.field959[this.field1226[this.field1122]], 5082, 562, 0);
                }
            }
            if (this.field1306 != this.field1233) {
                this.field1329 = true;
                this.field1306 = this.field1233;
            }
            this.field1233 = 0;
            if (super.mouseX > 22 && super.mouseY > 375 && super.mouseX < 431 && super.mouseY < 471) {
                if (this.field1366 != -1) {
                    this.method386(super.mouseY, super.mouseX, 375, Component.field959[this.field1366], 5082, 22, 0);
                } else {
                    this.method388(super.mouseY - 375, 0, super.mouseX - 22);
                }
            }
            if (this.field1366 != -1 && this.field1233 != this.field1224) {
                this.field1330 = true;
                this.field1224 = this.field1233;
            }
            boolean var3 = false;
            while (!var3) {
                var3 = true;
                for (int var4 = 0; var4 < this.field1439 - 1; ++var4) {
                    if (this.field1506[var4] < 1000 && this.field1506[var4 + 1] > 1000) {
                        String var5 = this.field1199[var4];
                        this.field1199[var4] = this.field1199[var4 + 1];
                        this.field1199[var4 + 1] = var5;
                        int var6 = this.field1506[var4];
                        this.field1506[var4] = this.field1506[var4 + 1];
                        this.field1506[var4 + 1] = var6;
                        int var7 = this.field1504[var4];
                        this.field1504[var4] = this.field1504[var4 + 1];
                        this.field1504[var4 + 1] = var7;
                        int var8 = this.field1505[var4];
                        this.field1505[var4] = this.field1505[var4 + 1];
                        this.field1505[var4 + 1] = var8;
                        int var9 = this.field1507[var4];
                        this.field1507[var4] = this.field1507[var4 + 1];
                        this.field1507[var4 + 1] = var9;
                        var3 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method440(byte arg0) {
        LocType.field840.method105();
        LocType.field841.method105();
        NpcType.field870.method105();
        ObjType.field916.method105();
        ObjType.field917.method105();
        PlayerEntity.field377.method105();
        SpotAnimType.field1056.method105();
        if (this.field1208 == arg0) {
            boolean var2 = false;
        } else {
            this.field1512 = !this.field1512;
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method441(int arg0) {
        if (this.field1121 != arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.method376(222);
        if (this.field1106 == 1) {
            this.field1485[this.field1105 / 100].method175(this.field1104 - 8 - 11, this.field1103 - 8 - 8, false);
        }
        if (this.field1106 == 2) {
            this.field1485[this.field1105 / 100 + 4].method175(this.field1104 - 8 - 11, this.field1103 - 8 - 8, false);
        }
        if (this.field1336 != -1) {
            this.method467(this.field1336, this.field1334, 623);
            this.method416(0, 0, 38682, Component.field959[this.field1336], 0);
        }
        this.method375(39734);
        if (!this.field1244) {
            this.method439(26);
            this.method461(true);
        } else if (this.field1513 == 0) {
            this.method431(-961);
        }
        if (this.field1349 == 1) {
            if (this.field1466 <= 0 && this.field1298 != 1) {
                this.field1321[1].method175(296, 472, false);
            } else {
                this.field1321[1].method175(258, 472, false);
            }
        }
        if (this.field1466 > 0) {
            this.field1321[0].method175(296, 472, false);
            this.field1351.method191(329, (byte) 6, 16776960, "Level: " + this.field1466, 484);
        }
        if (this.field1298 == 1) {
            this.field1321[6].method175(296, 472, false);
            this.field1351.method191(329, (byte) 6, 16776960, "Arena", 484);
        }
        if (this.field1322 != 0) {
            int var3 = this.field1322 / 50;
            int var4 = var3 / 60;
            int var5 = var3 % 60;
            if (var5 < 10) {
                this.field1351.method194(4, 329, false, 16776960, "System update in: " + var4 + ":0" + var5);
            } else {
                this.field1351.method194(4, 329, false, 16776960, "System update in: " + var4 + ":" + var5);
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method442(int arg0) {
        int var2 = this.field1332.field300 + this.field1490;
        int var3 = this.field1332.field301 + this.field1495;
        if (this.field1279 - var2 < -500 || this.field1279 - var2 > 500 || this.field1280 - var3 < -500 || this.field1280 - var3 > 500) {
            this.field1279 = var2;
            this.field1280 = var3;
        }
        if (this.field1279 != var2) {
            this.field1279 += (var2 - this.field1279) / 16;
        }
        if (this.field1280 != var3) {
            this.field1280 += (var3 - this.field1280) / 16;
        }
        if (super.actionKey[1] == 1) {
            this.field1183 += (-24 - this.field1183) / 2;
        } else if (super.actionKey[2] == 1) {
            this.field1183 += (24 - this.field1183) / 2;
        } else {
            this.field1183 /= 2;
        }
        if (super.actionKey[3] == 1) {
            this.field1184 += (12 - this.field1184) / 2;
        } else if (super.actionKey[4] == 1) {
            this.field1184 += (-12 - this.field1184) / 2;
        } else {
            this.field1184 /= 2;
        }
        this.field1182 = this.field1183 / 2 + this.field1182 & 2047;
        this.field1144 += arg0;
        this.field1181 += this.field1184 / 2;
        if (this.field1181 < 128) {
            this.field1181 = 128;
        }
        if (this.field1181 > 383) {
            this.field1181 = 383;
        }
        int var4 = this.field1279 >> 7;
        int var5 = this.field1280 >> 7;
        int var6 = this.method390(this.field1245, this.field1279, (byte) 5, this.field1280);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    int var10 = this.field1245;
                    if (var10 < 3 && (this.field1205[1][var8][var9] & 2) == 2) {
                        ++var10;
                    }
                    int var11 = var6 - this.field1159[var10][var8][var9];
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
        if (var12 > this.field1297) {
            this.field1297 += (var12 - this.field1297) / 24;
        } else if (var12 < this.field1297) {
            this.field1297 += (var12 - this.field1297) / 80;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method443(byte arg0) {
        if (arg0 != -26) {
            this.field1145 = -1;
        }
        for (ProjectileEntity var2 = (ProjectileEntity) this.field1197.method235(); var2 != null; var2 = (ProjectileEntity) this.field1197.method237(551)) {
            if (this.field1245 == var2.field381 && field1320 <= var2.field387) {
                if (field1320 >= var2.field386) {
                    if (var2.field390 > 0) {
                        NpcEntity var3 = this.field1292[var2.field390 - 1];
                        if (var3 != null) {
                            var2.method117(this.method390(var2.field381, var3.field300, (byte) 5, var3.field301) - var2.field385, var3.field301, var3.field300, -855, field1320);
                        }
                    }
                    if (var2.field390 < 0) {
                        int var4 = -var2.field390 - 1;
                        PlayerEntity var5;
                        if (this.field1099 == var4) {
                            var5 = this.field1332;
                        } else {
                            var5 = this.field1187[var4];
                        }
                        if (var5 != null) {
                            var2.method117(this.method390(var2.field381, var5.field300, (byte) 5, var5.field301) - var2.field385, var5.field301, var5.field300, -855, field1320);
                        }
                    }
                    var2.method118((byte) -30, this.field1334);
                    this.field1196.method62(-44713, (int) var2.field393, 60, var2.field400, (int) var2.field392, -1, false, (Model) null, var2, (int) var2.field394, this.field1245);
                }
            } else {
                var2.unlink();
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method10(int arg0) {
        if (arg0 != 3) {
            field1235 = !field1235;
        }
        this.field1116 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILhb;I)V")
    public final void method444(int arg0, int arg1, Pix32 arg2, int arg3) {
        int var5 = this.field1450 + this.field1182 & 2047;
        int var6 = arg0 * arg0 + arg3 * arg3;
        if (arg1 != 4) {
            this.field1225 = !this.field1225;
        }
        if (var6 <= 6400) {
            int var7 = Model.field525[var5];
            int var8 = Model.field526[var5];
            int var9 = var7 * 256 / (this.field1295 + 256);
            int var10 = var8 * 256 / (this.field1295 + 256);
            int var11 = arg0 * var9 + arg3 * var10 >> 16;
            int var12 = arg0 * var10 - arg3 * var9 >> 16;
            if (var6 > 2500) {
                arg2.method182(this.field1347, 83 - var12 - arg2.field583 / 2, var11 + 94 - arg2.field582 / 2, (byte) -15);
            } else {
                arg2.method175(83 - var12 - arg2.field583 / 2, var11 + 94 - arg2.field582 / 2, false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method445(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg1;
        if (arg3 <= 0) {
            field1235 = !field1235;
        }
        return ((arg0 & 16711935) * var5 + (arg2 & 16711935) * arg1 & -16711936) + ((arg0 & 65280) * var5 + (arg2 & 65280) * arg1 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)Ljava/lang/String;")
    public final String method446(int arg0, int arg1) {
        if (arg1 >= 0) {
            this.field1497 = -430;
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLx;)V")
    public final void method447(int arg0, boolean arg1, PathingEntity arg2) {
        this.method448(arg2.field301, arg2.field300, this.field1470, arg0);
        if (arg1) {
            this.field1145 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)V")
    public final void method448(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
            int var5 = this.method390(this.field1245, arg1, (byte) 5, arg0) - arg3;
            int var6 = arg1 - this.field1476;
            int var7 = var5 - this.field1477;
            int var8 = arg0 - this.field1478;
            int var9 = Model.field525[this.field1479];
            int var10 = Model.field526[this.field1479];
            int var11 = Model.field525[this.field1480];
            int var12 = Model.field526[this.field1480];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            if (arg2 >= 0) {
                this.field1163.method206(131);
            }
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field1384 = (var13 << 9) / var17 + Pix3D.field554;
                this.field1385 = (var16 << 9) / var17 + Pix3D.field555;
            } else {
                this.field1384 = -1;
                this.field1385 = -1;
            }
        } else {
            this.field1384 = -1;
            this.field1385 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZ)Z")
    public final boolean method449(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = arg3 >> 14 & 32767;
        int var7 = this.field1196.method82(this.field1245, arg1, arg2, arg3);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method464(this.field1332.field348[0], 0, false, arg1, this.field1332.field349[0], 0, 2, 0, arg2, var9, var8 + 1, 0);
            } else {
                LocType var10 = LocType.method282(var6);
                int var11;
                int var12;
                if (var9 != 0 && var9 != 2) {
                    var11 = var10.field815;
                    var12 = var10.field814;
                } else {
                    var11 = var10.field814;
                    var12 = var10.field815;
                }
                int var13 = var10.field838;
                if (var9 != 0) {
                    var13 = (var13 >> 4 - var9) + (var13 << var9 & 15);
                }
                this.method464(this.field1332.field348[0], var11, false, arg1, this.field1332.field349[0], 0, 2, var12, arg2, 0, 0, var13);
            }
            this.field1103 = super.mouseClikcX;
            this.field1104 = super.mouseClickY;
            this.field1106 = 2;
            this.field1105 = 0;
            this.field1163.method205((byte) -34, arg0);
            this.field1163.method207(this.field1126 + arg1);
            this.field1163.method207(this.field1127 + arg2);
            this.field1163.method207(var6);
            if (!arg4) {
                throw new NullPointerException();
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method450(int arg0) {
        int var2 = this.field1352.method193(false, "Choose Option");
        for (int var3 = 0; var3 < this.field1439; ++var3) {
            int var11 = this.field1352.method193(false, this.field1199[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field1439 * 15 + 21;
        if (arg0 < 0) {
            if (super.mouseClikcX > 8 && super.mouseClickY > 11 && super.mouseClikcX < 520 && super.mouseClickY < 345) {
                int var5 = super.mouseClikcX - 8 - var2 / 2;
                if (var2 + var5 > 512) {
                    var5 = 512 - var2;
                }
                if (var5 < 0) {
                    var5 = 0;
                }
                int var6 = super.mouseClickY - 11;
                if (var4 + var6 > 334) {
                    var6 = 334 - var4;
                }
                if (var6 < 0) {
                    var6 = 0;
                }
                this.field1244 = true;
                this.field1513 = 0;
                this.field1514 = var5;
                this.field1515 = var6;
                this.field1516 = var2;
                this.field1517 = this.field1439 * 15 + 22;
            }
            if (super.mouseClikcX > 562 && super.mouseClickY > 231 && super.mouseClikcX < 752 && super.mouseClickY < 492) {
                int var7 = super.mouseClikcX - 562 - var2 / 2;
                if (var7 < 0) {
                    var7 = 0;
                } else if (var2 + var7 > 190) {
                    var7 = 190 - var2;
                }
                int var8 = super.mouseClickY - 231;
                if (var8 < 0) {
                    var8 = 0;
                } else if (var4 + var8 > 261) {
                    var8 = 261 - var4;
                }
                this.field1244 = true;
                this.field1513 = 1;
                this.field1514 = var7;
                this.field1515 = var8;
                this.field1516 = var2;
                this.field1517 = this.field1439 * 15 + 22;
            }
            if (super.mouseClikcX > 22 && super.mouseClickY > 375 && super.mouseClikcX < 501 && super.mouseClickY < 471) {
                int var9 = super.mouseClikcX - 22 - var2 / 2;
                if (var9 < 0) {
                    var9 = 0;
                } else if (var2 + var9 > 479) {
                    var9 = 479 - var2;
                }
                int var10 = super.mouseClickY - 375;
                if (var10 < 0) {
                    var10 = 0;
                } else if (var4 + var10 > 96) {
                    var10 = 96 - var4;
                }
                this.field1244 = true;
                this.field1513 = 2;
                this.field1514 = var9;
                this.field1515 = var10;
                this.field1516 = var2;
                this.field1517 = this.field1439 * 15 + 22;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method451(String arg0) throws IOException {
        return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method452(byte arg0) {
        if (this.field1394 == null) {
            super.drawArea = null;
            this.field1414 = null;
            this.field1412 = null;
            this.field1411 = null;
            this.field1413 = null;
            this.field1217 = null;
            this.field1218 = null;
            this.field1219 = null;
            this.field1397 = new PixMap(this.method11(field1481), 128, 299, 265);
            Pix2D.method149(this.field1508);
            this.field1398 = new PixMap(this.method11(field1481), 128, 299, 265);
            Pix2D.method149(this.field1508);
            this.field1394 = new PixMap(this.method11(field1481), 533, 299, 186);
            Pix2D.method149(this.field1508);
            this.field1395 = new PixMap(this.method11(field1481), 360, 299, 146);
            Pix2D.method149(this.field1508);
            this.field1396 = new PixMap(this.method11(field1481), 360, 299, 200);
            Pix2D.method149(this.field1508);
            this.field1399 = new PixMap(this.method11(field1481), 214, 299, 267);
            Pix2D.method149(this.field1508);
            this.field1400 = new PixMap(this.method11(field1481), 215, 299, 267);
            Pix2D.method149(this.field1508);
            this.field1401 = new PixMap(this.method11(field1481), 86, 299, 79);
            if (this.field1231 != arg0) {
                this.field1163.method206(73);
            }
            Pix2D.method149(this.field1508);
            this.field1402 = new PixMap(this.method11(field1481), 87, 299, 79);
            Pix2D.method149(this.field1508);
            if (this.field1501 != null) {
                this.method485((byte) 5);
                this.method405(0);
            }
            this.field1116 = true;
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method453(int arg0) {
        this.field1486 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1267) {
                this.method399(true);
                this.method399(true);
                this.method385(true);
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
        this.field1486 = false;
        if (arg0 != -33833) {
            field1235 = !field1235;
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1340) {
            this.method453(-33833);
        } else if (this.field1164) {
            this.method383(true);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIZIILhc;)V")
    public final void method454(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, Component arg8) {
        if (this.field1509) {
            this.field1519 = 32;
        } else {
            this.field1519 = 0;
        }
        this.field1509 = false;
        this.field1144 += arg1;
        if (arg0 >= arg6 && arg0 < arg6 + 16 && arg2 >= arg7 && arg2 < arg7 + 16) {
            arg8.field978 -= this.field1299 * 4;
            if (arg5) {
                this.field1329 = true;
                return;
            }
        } else if (arg0 >= arg6 && arg0 < arg6 + 16 && arg2 >= arg4 + arg7 - 16 && arg2 < arg4 + arg7) {
            arg8.field978 += this.field1299 * 4;
            if (arg5) {
                this.field1329 = true;
                return;
            }
        } else {
            if (arg0 < arg6 - this.field1519 || arg0 >= arg6 + 16 + this.field1519 || arg2 < arg7 + 16 || arg2 >= arg4 + arg7 - 16 || this.field1299 <= 0) {
                return;
            }
            int var10 = (arg4 - 32) * arg4 / arg3;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg2 - arg7 - 16 - var10 / 2;
            int var12 = arg4 - 32 - var10;
            arg8.field978 = (arg3 - arg4) * var11 / var12;
            if (arg5) {
                this.field1329 = true;
            }
            this.field1509 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method455(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1448 = "";
                this.field1449 = "Connecting to server...";
                this.method412(4);
            }
            this.field1364 = new ClientStream(this, (byte) 2, this.method458(field1252 + 43594));
            this.field1364.method32(this.field1160.field621, 0, 8);
            this.field1160.field622 = 0;
            this.field1511 = this.field1160.method222(603);
            int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1511 >> 32), (int) this.field1511 };
            this.field1163.field622 = 0;
            this.field1163.method206(10);
            this.field1163.method210(var4[0]);
            this.field1163.method210(var4[1]);
            this.field1163.method210(var4[2]);
            this.field1163.method210(var4[3]);
            this.field1163.method210(signlink.uid);
            this.field1163.method213(arg0);
            this.field1163.method213(arg1);
            this.field1163.method231(field1427, field1287, this.field1098);
            this.field1108.field622 = 0;
            if (arg2) {
                this.field1108.method206(18);
            } else {
                this.field1108.method206(16);
            }
            this.field1108.method206(this.field1163.field622 + 36 + 1 + 1);
            this.field1108.method206(225);
            this.field1108.method206(field1254 ? 1 : 0);
            for (int var5 = 0; var5 < 9; ++var5) {
                this.field1108.method210(this.field1176[var5]);
            }
            this.field1108.method214(this.field1163.field621, this.field1163.field622, 0, (byte) -106);
            this.field1163.field626 = new Isaac((byte) 1, var4);
            for (int var6 = 0; var6 < 4; ++var6) {
                var4[var6] += 50;
            }
            this.field1118 = new Isaac((byte) 1, var4);
            this.field1364.method33(this.field1108.field621, this.field1108.field622, true, 0);
            int var7 = this.field1364.method30();
            if (var7 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var15) {
                }
                this.method455(arg0, arg1, arg2);
                return;
            }
            if (var7 == 2 || var7 == 18) {
                if (var7 == 18) {
                    this.field1388 = true;
                } else {
                    this.field1388 = false;
                }
                InputTracking.method35((byte) 65);
                this.field1339 = true;
                this.field1163.field622 = 0;
                this.field1160.field622 = 0;
                this.field1145 = -1;
                this.field1193 = -1;
                this.field1194 = -1;
                this.field1195 = -1;
                this.field1144 = 0;
                this.field1146 = 0;
                this.field1322 = 0;
                this.field1148 = 0;
                this.field1276 = 0;
                this.field1439 = 0;
                this.field1244 = false;
                super.idleCycles = 0;
                for (int var8 = 0; var8 < 100; ++var8) {
                    this.field1263[var8] = null;
                }
                this.field1367 = 0;
                this.field1390 = 0;
                this.field1443 = 0;
                this.field1383 = 0;
                this.field1490 = (int) (Math.random() * 100.0D) - 50;
                this.field1495 = (int) (Math.random() * 110.0D) - 55;
                this.field1499 = (int) (Math.random() * 80.0D) - 40;
                this.field1450 = (int) (Math.random() * 120.0D) - 60;
                this.field1295 = (int) (Math.random() * 30.0D) - 20;
                this.field1182 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1139 = -1;
                this.field1416 = 0;
                this.field1417 = 0;
                this.field1188 = 0;
                this.field1293 = 0;
                for (int var9 = 0; var9 < this.field1185; ++var9) {
                    this.field1187[var9] = null;
                    this.field1192[var9] = null;
                }
                for (int var10 = 0; var10 < 8192; ++var10) {
                    this.field1292[var10] = null;
                }
                this.field1332 = this.field1187[this.field1186] = new PlayerEntity();
                this.field1197.method239();
                this.field1421.method239();
                this.field1132.method239();
                for (int var11 = 0; var11 < 4; ++var11) {
                    for (int var12 = 0; var12 < 104; ++var12) {
                        for (int var13 = 0; var13 < 104; ++var13) {
                            this.field1522[var11][var12][var13] = null;
                        }
                    }
                }
                this.field1249 = new LinkList(0);
                this.field1454 = 0;
                this.field1386 = -1;
                this.field1366 = -1;
                this.field1336 = -1;
                this.field1494 = -1;
                this.field1237 = false;
                this.field1122 = 3;
                this.field1420 = false;
                this.field1244 = false;
                this.field1234 = false;
                this.field1301 = null;
                this.field1349 = 0;
                this.field1493 = -1;
                this.field1201 = true;
                this.method408((byte) -6);
                for (int var14 = 0; var14 < 5; ++var14) {
                    this.field1107[var14] = 0;
                }
                field1137 = 0;
                field1232 = 0;
                field1171 = 0;
                field1162 = 0;
                field1089 = 0;
                field1222 = 0;
                field1302 = 0;
                field1255 = 0;
                field1241 = 0;
                field1382 = 0;
                this.method413(-7185);
                return;
            }
            if (var7 == 3) {
                this.field1448 = "";
                this.field1449 = "Invalid username or password.";
                return;
            }
            if (var7 == 4) {
                this.field1448 = "Your account has been disabled.";
                this.field1449 = "Please check your message-centre for details.";
                return;
            }
            if (var7 == 5) {
                this.field1448 = "Your account is already logged in.";
                this.field1449 = "Try again in 60 secs...";
                return;
            }
            if (var7 == 6) {
                this.field1448 = "RuneScape has been updated!";
                this.field1449 = "Please reload this page.";
                return;
            }
            if (var7 == 7) {
                this.field1448 = "This world is full.";
                this.field1449 = "Please use a different world.";
                return;
            }
            if (var7 == 8) {
                this.field1448 = "Unable to connect.";
                this.field1449 = "Login server offline.";
                return;
            }
            if (var7 == 9) {
                this.field1448 = "Login limit exceeded.";
                this.field1449 = "Too many connections from your address.";
                return;
            }
            if (var7 == 10) {
                this.field1448 = "Unable to connect.";
                this.field1449 = "Bad session id.";
                return;
            }
            if (var7 == 11) {
                this.field1449 = "Login server rejected session.";
                this.field1449 = "Please try again.";
                return;
            }
            if (var7 == 12) {
                this.field1448 = "You need a members account to login to this world.";
                this.field1449 = "Please subscribe, or use a different world.";
                return;
            }
            if (var7 == 13) {
                this.field1448 = "Could not complete login.";
                this.field1449 = "Please try using a different world.";
                return;
            }
            if (var7 == 14) {
                this.field1448 = "The server is being updated.";
                this.field1449 = "Please wait 1 minute and try again.";
                return;
            }
            if (var7 == 15) {
                this.field1339 = true;
                this.field1163.field622 = 0;
                this.field1160.field622 = 0;
                this.field1145 = -1;
                this.field1193 = -1;
                this.field1194 = -1;
                this.field1195 = -1;
                this.field1144 = 0;
                this.field1146 = 0;
                this.field1322 = 0;
                this.field1439 = 0;
                this.field1244 = false;
                return;
            }
            if (var7 == 16) {
                this.field1448 = "Login attempts exceeded.";
                this.field1449 = "Please wait 1 minute and try again.";
                return;
            }
            if (var7 == 17) {
                this.field1448 = "You are standing in a members-only area.";
                this.field1449 = "To play on this world move to a free area first";
                return;
            }
        } catch (IOException var16) {
            this.field1448 = "";
            this.field1449 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    public final void method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != -27819) {
            this.method6();
        }
        if (arg1 >= 1 && arg2 >= 1 && arg1 <= 102 && arg2 <= 102) {
            if (field1254 && this.field1245 != arg7) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg3 == 0) {
                var9 = this.field1196.method78(arg7, arg1, arg2);
            }
            if (arg3 == 1) {
                var9 = this.field1196.method79(arg7, arg2, 3, arg1);
            }
            if (arg3 == 2) {
                var9 = this.field1196.method80(arg7, arg1, arg2);
            }
            if (arg3 == 3) {
                var9 = this.field1196.method81(arg7, arg1, arg2);
            }
            if (var9 != 0) {
                int var13 = this.field1196.method82(arg7, arg1, arg2, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg3 == 0) {
                    this.field1196.method73(arg1, arg7, arg2, 1);
                    LocType var17 = LocType.method282(var14);
                    if (var17.field816) {
                        this.field1319[arg7].method307(var17.field817, var16, arg1, arg2, 323, var15);
                    }
                }
                if (arg3 == 1) {
                    this.field1196.method74(arg7, arg2, this.field1442, arg1);
                }
                if (arg3 == 2) {
                    this.field1196.method75(arg1, arg2, -54, arg7);
                    LocType var18 = LocType.method282(var14);
                    if (var18.field814 + arg1 > 103 || var18.field814 + arg2 > 103 || var18.field815 + arg1 > 103 || var18.field815 + arg2 > 103) {
                        return;
                    }
                    if (var18.field816) {
                        this.field1319[arg7].method308(arg2, arg1, var16, var18.field814, true, var18.field817, var18.field815);
                    }
                }
                if (arg3 == 3) {
                    this.field1196.method76(arg7, this.field1387, arg1, arg2);
                    LocType var19 = LocType.method282(var14);
                    if (var19.field816 && var19.field818) {
                        this.field1319[arg7].method310(arg2, arg1, 0);
                    }
                }
            }
            if (arg4 >= 0) {
                int var20 = arg7;
                if (arg7 < 3 && (this.field1205[1][arg1][arg2] & 2) == 2) {
                    var20 = arg7 + 1;
                }
                World.method28(arg1, this.field1117, this.field1319[arg7], arg2, arg0, this.field1159, 0, arg7, arg4, arg5, this.field1196, var20);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method457(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field1454 >= 100) {
                this.method468(0, "Your friends list is full. Max of 100 hit", (byte) 4, "");
            } else {
                String var4 = JString.method262(0, JString.method259(arg0, false));
                for (int var5 = 0; var5 < this.field1454; ++var5) {
                    if (this.field1308[var5] == arg0) {
                        this.method468(0, var4 + " is already on your friend list", (byte) 4, "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1158; ++var6) {
                    if (this.field1133[var6] == arg0) {
                        this.method468(0, "Please remove " + var4 + " from your ignore list first", (byte) 4, "");
                        return;
                    }
                }
                if (!var4.equals(this.field1332.field357)) {
                    this.field1492[this.field1454] = var4;
                    this.field1308[this.field1454] = arg0;
                    this.field1138[this.field1454] = 0;
                    ++this.field1454;
                    if (arg1 >= 0) {
                        this.field1404 = this.field1118.nextInt();
                    }
                    this.field1329 = true;
                    this.field1163.method205((byte) -34, 118);
                    this.field1163.method212(true, arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method8(byte arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1364 != null) {
                this.field1364.method29();
            }
        } catch (Exception var2) {
        }
        this.field1364 = null;
        this.method374(0);
        this.field1177 = false;
        this.field1163 = null;
        this.field1108 = null;
        this.field1160 = null;
        this.field1290 = null;
        this.field1135 = null;
        this.field1365 = null;
        this.field1159 = null;
        this.field1205 = null;
        this.field1196 = null;
        this.field1319 = null;
        this.field1483 = null;
        this.field1123 = null;
        this.field1359 = null;
        this.field1360 = null;
        this.field1434 = null;
        this.field1411 = null;
        this.field1412 = null;
        this.field1413 = null;
        this.field1414 = null;
        this.field1217 = null;
        this.field1218 = null;
        this.field1219 = null;
        this.field1372 = null;
        this.field1373 = null;
        this.field1374 = null;
        this.field1375 = null;
        this.field1376 = null;
        this.field1377 = null;
        this.field1378 = null;
        this.field1379 = null;
        this.field1380 = null;
        this.field1381 = null;
        this.field1346 = null;
        this.field1347 = null;
        this.field1348 = null;
        this.field1273 = null;
        this.field1274 = null;
        this.field1275 = null;
        this.field1179 = null;
        this.field1256 = null;
        this.field1257 = null;
        this.field1258 = null;
        this.field1259 = null;
        this.field1260 = null;
        this.field1405 = null;
        this.field1406 = null;
        this.field1407 = null;
        this.field1408 = null;
        this.field1409 = null;
        this.field1510 = null;
        this.field1141 = null;
        this.field1321 = null;
        this.field1485 = null;
        this.field1422 = null;
        this.field1423 = null;
        this.field1424 = null;
        this.field1425 = null;
        this.field1403 = null;
        if (arg0 != -28) {
            this.method6();
        }
        this.field1503 = null;
        this.field1285 = null;
        this.field1187 = null;
        this.field1189 = null;
        this.field1191 = null;
        this.field1192 = null;
        this.field1305 = null;
        this.field1292 = null;
        this.field1294 = null;
        this.field1522 = null;
        this.field1249 = null;
        this.field1132 = null;
        this.field1197 = null;
        this.field1421 = null;
        this.field1117 = null;
        this.field1504 = null;
        this.field1505 = null;
        this.field1506 = null;
        this.field1507 = null;
        this.field1199 = null;
        this.field1303 = null;
        this.field1283 = null;
        this.field1284 = null;
        this.field1156 = null;
        this.field1418 = null;
        this.field1492 = null;
        this.field1308 = null;
        this.field1138 = null;
        this.field1397 = null;
        this.field1398 = null;
        this.field1394 = null;
        this.field1395 = null;
        this.field1396 = null;
        this.field1399 = null;
        this.field1400 = null;
        this.field1401 = null;
        this.field1402 = null;
        this.method395(true);
        LocType.method281(true);
        NpcType.method287(true);
        ObjType.method293(true);
        FloType.field934 = null;
        IdkType.field950 = null;
        Component.field959 = null;
        UnkType.field1019 = null;
        SeqType.field1028 = null;
        SpotAnimType.field1043 = null;
        SpotAnimType.field1056 = null;
        VarpType.field1060 = null;
        super.drawArea = null;
        PlayerEntity.field377 = null;
        Pix3D.method154(true);
        World3D.method50(true);
        Model.method121(true);
        AnimBase.instances = null;
        AnimFrame.instances = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method458(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIILz;I)V")
    public final void method459(boolean arg0, int arg1, int arg2, PlayerEntity arg3, int arg4) {
        if (arg0) {
            this.field1387 = this.field1118.nextInt();
        }
        if (this.field1332 != arg3) {
            if (this.field1439 < 400) {
                String var6 = arg3.field357 + method429(this.field1332.field363, false, arg3.field363) + " (level-" + arg3.field363 + ")";
                if (this.field1367 == 1) {
                    this.field1199[this.field1439] = "Use " + this.field1371 + " with @whi@" + var6;
                    this.field1506[this.field1439] = 367;
                    this.field1507[this.field1439] = arg2;
                    this.field1504[this.field1439] = arg4;
                    this.field1505[this.field1439] = arg1;
                    ++this.field1439;
                } else if (this.field1390 == 1) {
                    if ((this.field1392 & 8) == 8) {
                        this.field1199[this.field1439] = this.field1393 + " @whi@" + var6;
                        this.field1506[this.field1439] = 651;
                        this.field1507[this.field1439] = arg2;
                        this.field1504[this.field1439] = arg4;
                        this.field1505[this.field1439] = arg1;
                        ++this.field1439;
                    }
                } else {
                    this.field1199[this.field1439] = "Follow @whi@" + var6;
                    this.field1506[this.field1439] = 1544;
                    this.field1507[this.field1439] = arg2;
                    this.field1504[this.field1439] = arg4;
                    this.field1505[this.field1439] = arg1;
                    ++this.field1439;
                    if (this.field1167 == 0) {
                        this.field1199[this.field1439] = "Trade with @whi@" + var6;
                        this.field1506[this.field1439] = 1373;
                        this.field1507[this.field1439] = arg2;
                        this.field1504[this.field1439] = arg4;
                        this.field1505[this.field1439] = arg1;
                        ++this.field1439;
                    }
                    if (this.field1466 > 0) {
                        this.field1199[this.field1439] = "Attack @whi@" + var6;
                        if (this.field1332.field363 >= arg3.field363) {
                            this.field1506[this.field1439] = 151;
                        } else {
                            this.field1506[this.field1439] = 2151;
                        }
                        this.field1507[this.field1439] = arg2;
                        this.field1504[this.field1439] = arg4;
                        this.field1505[this.field1439] = arg1;
                        ++this.field1439;
                    }
                    if (this.field1298 == 1) {
                        this.field1199[this.field1439] = "Fight @whi@" + var6;
                        this.field1506[this.field1439] = 151;
                        this.field1507[this.field1439] = arg2;
                        this.field1504[this.field1439] = arg4;
                        this.field1505[this.field1439] = arg1;
                        ++this.field1439;
                    }
                    if (this.field1298 == 2) {
                        this.field1199[this.field1439] = "Duel-with @whi@" + var6;
                        this.field1506[this.field1439] = 1101;
                        this.field1507[this.field1439] = arg2;
                        this.field1504[this.field1439] = arg4;
                        this.field1505[this.field1439] = arg1;
                        ++this.field1439;
                    }
                }
                for (int var7 = 0; var7 < this.field1439; ++var7) {
                    if (this.field1506[var7] == 660) {
                        this.field1199[var7] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method460(boolean arg0) {
        if (this.field1322 > 1) {
            --this.field1322;
        }
        if (this.field1148 > 0) {
            --this.field1148;
        }
        for (int var2 = 0; var2 < 5 && this.method493(false); ++var2) {
        }
        if (!arg0) {
            this.field1145 = this.field1160.method216();
        }
        if (this.field1339) {
            int var10002;
            for (int var3 = 0; var3 < this.field1383; ++var3) {
                if (this.field1223[var3] <= 0) {
                    boolean var4 = false;
                    try {
                        if (this.field1489[var3] == this.field1151 && this.field1174[var3] == this.field1430) {
                            if (!this.method435(this.field1143)) {
                                var4 = true;
                            }
                        } else {
                            Packet var5 = Wave.method271((byte) -16, this.field1174[var3], this.field1489[var3]);
                            if (System.currentTimeMillis() + (long) (var5.field622 / 22) > (long) (this.field1180 / 22) + this.field1142) {
                                this.field1180 = var5.field622;
                                this.field1142 = System.currentTimeMillis();
                                if (this.method434(var5.field621, var5.field622, 0)) {
                                    this.field1151 = this.field1489[var3];
                                    this.field1430 = this.field1174[var3];
                                } else {
                                    var4 = true;
                                }
                            }
                        }
                    } catch (Exception var21) {
                    }
                    if (var4 && this.field1223[var3] != -5) {
                        this.field1223[var3] = -5;
                    } else {
                        --this.field1383;
                        for (int var7 = var3; var7 < this.field1383; ++var7) {
                            this.field1489[var7] = this.field1489[var7 + 1];
                            this.field1174[var7] = this.field1174[var7 + 1];
                            this.field1223[var7] = this.field1223[var7 + 1];
                        }
                        --var3;
                    }
                } else {
                    var10002 = this.field1223[var3]--;
                }
            }
            if (this.field1109 > 0) {
                this.field1109 -= 20;
                if (this.field1109 < 0) {
                    this.field1109 = 0;
                }
                if (this.field1109 == 0 && this.field1200 && !field1254) {
                    this.method371(false, this.field1475, this.field1484, this.field1520);
                }
            }
            Packet var8 = InputTracking.method36(-809);
            if (var8 != null) {
                this.field1163.method205((byte) -34, 81);
                this.field1163.method207(var8.field622);
                this.field1163.method214(var8.field621, var8.field622, 0, (byte) -106);
                var8.method204((byte) 8);
            }
            ++this.field1146;
            if (this.field1146 > 750) {
                this.method478(false);
            }
            this.method489(true);
            this.method419(true);
            this.method482(this.field1487);
            this.method401(this.field1136);
            if ((super.actionKey[1] == 1 || super.actionKey[2] == 1 || super.actionKey[3] == 1 || super.actionKey[4] == 1) && this.field1281++ > 5) {
                this.field1281 = 0;
                this.field1163.method205((byte) -34, 189);
                this.field1163.method207(this.field1181);
                this.field1163.method207(this.field1182);
                this.field1163.method206(this.field1450);
                this.field1163.method206(this.field1295);
            }
            ++this.field1334;
            if (this.field1106 != 0) {
                this.field1105 += 20;
                if (this.field1105 >= 400) {
                    this.field1106 = 0;
                }
            }
            if (this.field1312 != 0) {
                ++this.field1309;
                if (this.field1309 >= 15) {
                    if (this.field1312 == 2) {
                        this.field1329 = true;
                    }
                    if (this.field1312 == 3) {
                        this.field1330 = true;
                    }
                    this.field1312 = 0;
                }
            }
            if (this.field1211 != 0) {
                ++this.field1289;
                if (super.mouseX > this.field1212 + 5 || super.mouseX < this.field1212 - 5 || super.mouseY > this.field1213 + 5 || super.mouseY < this.field1213 - 5) {
                    this.field1325 = true;
                }
                if (super.mouseButton == 0) {
                    if (this.field1211 == 2) {
                        this.field1329 = true;
                    }
                    if (this.field1211 == 3) {
                        this.field1330 = true;
                    }
                    this.field1211 = 0;
                    if (this.field1325 && this.field1289 >= 5) {
                        this.field1453 = -1;
                        this.method439(26);
                        if (this.field1453 == this.field1209 && this.field1452 != this.field1210) {
                            Component var9 = Component.field959[this.field1209];
                            int var10 = var9.field960[this.field1452];
                            var9.field960[this.field1452] = var9.field960[this.field1210];
                            var9.field960[this.field1210] = var10;
                            int var11 = var9.field961[this.field1452];
                            var9.field961[this.field1452] = var9.field961[this.field1210];
                            var9.field961[this.field1210] = var11;
                            this.field1163.method205((byte) -34, 159);
                            this.field1163.method207(this.field1209);
                            this.field1163.method207(this.field1210);
                            this.field1163.method207(this.field1452);
                        }
                    } else if ((this.field1175 == 1 || this.method427(145, this.field1439 - 1)) && this.field1439 > 2) {
                        this.method450(-386);
                    } else if (this.field1439 > 0) {
                        this.method428(6412, this.field1439 - 1);
                    }
                    this.field1309 = 10;
                    super.mouseClickButton = 0;
                }
            }
            ++field1363;
            if (field1363 > 127) {
                field1363 = 0;
                this.field1163.method205((byte) -34, 215);
                this.field1163.method209(4991788);
            }
            if (World3D.field253 != -1) {
                int var12 = World3D.field253;
                int var13 = World3D.field254;
                boolean var14 = this.method464(this.field1332.field348[0], 0, true, var12, this.field1332.field349[0], 0, 0, 0, var13, 0, 0, 0);
                World3D.field253 = -1;
                if (var14) {
                    this.field1103 = super.mouseClikcX;
                    this.field1104 = super.mouseClickY;
                    this.field1106 = 1;
                    this.field1105 = 0;
                }
            }
            if (super.mouseClickButton == 1 && this.field1301 != null) {
                this.field1301 = null;
                this.field1330 = true;
                super.mouseClickButton = 0;
            }
            this.method473((byte) 3);
            this.method472((byte) 7);
            this.method475(this.field1497);
            this.method387(0);
            if (super.mouseButton == 1 || super.mouseClickButton == 1) {
                ++this.field1299;
            }
            if (this.field1443 == 2) {
                this.method442(0);
            }
            if (this.field1443 == 2 && this.field1333) {
                this.method474(this.field1216);
            }
            for (int var15 = 0; var15 < 5; ++var15) {
                var10002 = this.field1389[var15]++;
            }
            this.method392(7);
            ++super.idleCycles;
            if (super.idleCycles > 4500) {
                this.field1148 = 250;
                super.idleCycles -= 500;
                this.field1163.method205((byte) -34, 70);
            }
            ++this.field1150;
            if (this.field1150 > 500) {
                this.field1150 = 0;
                int var16 = (int) (Math.random() * 8.0D);
                if ((var16 & 1) == 1) {
                    this.field1490 += this.field1491;
                }
                if ((var16 & 2) == 2) {
                    this.field1495 += this.field1496;
                }
                if ((var16 & 4) == 4) {
                    this.field1499 += this.field1500;
                }
            }
            if (this.field1490 < -50) {
                this.field1491 = 2;
            }
            if (this.field1490 > 50) {
                this.field1491 = -2;
            }
            if (this.field1495 < -55) {
                this.field1496 = 2;
            }
            if (this.field1495 > 55) {
                this.field1496 = -2;
            }
            if (this.field1499 < -40) {
                this.field1500 = 1;
            }
            if (this.field1499 > 40) {
                this.field1500 = -1;
            }
            ++this.field1115;
            if (this.field1115 > 500) {
                this.field1115 = 0;
                int var17 = (int) (Math.random() * 8.0D);
                if ((var17 & 1) == 1) {
                    this.field1450 += this.field1451;
                }
                if ((var17 & 2) == 2) {
                    this.field1295 += this.field1296;
                }
            }
            if (this.field1450 < -60) {
                this.field1451 = 2;
            }
            if (this.field1450 > 60) {
                this.field1451 = -2;
            }
            if (this.field1295 < -20) {
                this.field1296 = 1;
            }
            if (this.field1295 > 10) {
                this.field1296 = -1;
            }
            ++field1455;
            if (field1455 > 110) {
                field1455 = 0;
                this.field1163.method205((byte) -34, 236);
                this.field1163.method210(0);
            }
            ++this.field1147;
            if (this.field1147 > 50) {
                this.field1163.method205((byte) -34, 108);
            }
            try {
                if (this.field1364 != null && this.field1163.field622 > 0) {
                    this.field1364.method33(this.field1163.field621, this.field1163.field622, true, 0);
                    this.field1163.field622 = 0;
                    this.field1147 = 0;
                }
            } catch (IOException var19) {
                this.method478(false);
            } catch (Exception var20) {
                this.method415(-780);
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method461(boolean arg0) {
        if (this.field1439 >= 2 || this.field1367 != 0 || this.field1390 != 0) {
            String var2;
            if (this.field1367 == 1 && this.field1439 < 2) {
                var2 = "Use " + this.field1371 + " with...";
            } else if (this.field1390 == 1 && this.field1439 < 2) {
                var2 = this.field1393 + "...";
            } else {
                var2 = this.field1199[this.field1439 - 1];
            }
            if (this.field1439 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1439 - 2) + " more options";
            }
            this.field1352.method197(field1320 / 1000, true, (byte) -121, 15, 16777215, var2, 4);
            if (!arg0) {
                this.field1145 = -1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method462(byte arg0) {
        if (this.field1131 != arg0) {
            this.field1170 = -357;
        }
        for (SpotAnimEntity var2 = (SpotAnimEntity) this.field1421.method235(); var2 != null; var2 = (SpotAnimEntity) this.field1421.method237(551)) {
            if (this.field1245 == var2.field408 && !var2.field414) {
                if (field1320 >= var2.field407) {
                    var2.method119(this.field1334, 0);
                    if (var2.field414) {
                        var2.unlink();
                    } else {
                        this.field1196.method62(-44713, var2.field410, 60, 0, var2.field409, -1, false, (Model) null, var2, var2.field411, var2.field408);
                    }
                }
            } else {
                var2.unlink();
            }
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.frame != null) {
                    return new URL("http://127.0.0.1:" + (field1252 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public static final void method463(int arg0) {
        World3D.field219 = false;
        Pix3D.field549 = false;
        if (arg0 == 9) {
            field1254 = false;
            World.field36 = false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZIIIIIIIII)Z")
    public final boolean method464(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1483[var15][var35] = 0;
                this.field1123[var15][var35] = 99999999;
            }
        }
        int var16 = arg0;
        int var17 = arg4;
        this.field1483[arg0][arg4] = 99;
        this.field1123[arg0][arg4] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1359[var18] = arg0;
        int var36 = var18 + 1;
        this.field1360[var18] = arg4;
        boolean var20 = false;
        int var21 = this.field1359.length;
        int[][] var22 = this.field1319[this.field1245].field930;
        while (var36 != var19) {
            var16 = this.field1359[var19];
            var17 = this.field1360[var19];
            var19 = (var19 + 1) % var21;
            if (arg3 == var16 && arg8 == var17) {
                var20 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && this.field1319[this.field1245].method311(-7517, arg9, arg8, arg10 - 1, var17, arg3, var16)) {
                    var20 = true;
                    break;
                }
                if (arg10 < 10 && this.field1319[this.field1245].method312(arg9, arg10 - 1, this.field1404, var16, arg3, var17, arg8)) {
                    var20 = true;
                    break;
                }
            }
            if (arg1 != 0 && arg7 != 0 && this.field1319[this.field1245].method313(var17, arg7, var16, arg3, arg11, arg8, arg1, 168)) {
                var20 = true;
                break;
            }
            int var34 = this.field1123[var16][var17] + 1;
            if (var16 > 0 && this.field1483[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1359[var36] = var16 - 1;
                this.field1360[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1483[var16 - 1][var17] = 2;
                this.field1123[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1483[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1359[var36] = var16 + 1;
                this.field1360[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1483[var16 + 1][var17] = 8;
                this.field1123[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1483[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1359[var36] = var16;
                this.field1360[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1483[var16][var17 - 1] = 1;
                this.field1123[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1483[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1359[var36] = var16;
                this.field1360[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1483[var16][var17 + 1] = 4;
                this.field1123[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1483[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1359[var36] = var16 - 1;
                this.field1360[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1483[var16 - 1][var17 - 1] = 3;
                this.field1123[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1483[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1359[var36] = var16 + 1;
                this.field1360[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1483[var16 + 1][var17 - 1] = 9;
                this.field1123[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1483[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1359[var36] = var16 - 1;
                this.field1360[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1483[var16 - 1][var17 + 1] = 6;
                this.field1123[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1483[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1359[var36] = var16 + 1;
                this.field1360[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1483[var16 + 1][var17 + 1] = 12;
                this.field1123[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1354 = 0;
        if (!var20) {
            if (arg2) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg3 - var24; var25 <= arg3 + var24; ++var25) {
                        for (int var26 = arg8 - var24; var26 <= arg8 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1123[var25][var26] < var23) {
                                var23 = this.field1123[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1354 = 1;
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
        this.field1359[var27] = var16;
        if (arg5 != 0) {
            this.field1145 = this.field1160.method216();
        }
        int var37 = var27 + 1;
        this.field1360[var27] = var17;
        int var28;
        int var29 = var28 = this.field1483[var16][var17];
        while (arg0 != var16 || arg4 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1359[var37] = var16;
                this.field1360[var37++] = var17;
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
            var29 = this.field1483[var16][var17];
        }
        if (var37 <= 0) {
            if (arg6 == 1) {
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
            int var31 = this.field1359[var37];
            int var32 = this.field1360[var37];
            if (arg6 == 0) {
                this.field1163.method205((byte) -34, 181);
                this.field1163.method206(var30 + var30 + 3);
            }
            if (arg6 == 1) {
                this.field1163.method205((byte) -34, 165);
                this.field1163.method206(var30 + var30 + 3 + 14);
            }
            if (arg6 == 2) {
                this.field1163.method205((byte) -34, 93);
                this.field1163.method206(var30 + var30 + 3);
            }
            if (super.actionKey[5] == 1) {
                this.field1163.method206(1);
            } else {
                this.field1163.method206(0);
            }
            this.field1163.method207(this.field1126 + var31);
            this.field1163.method207(this.field1127 + var32);
            this.field1416 = this.field1359[0];
            this.field1417 = this.field1360[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1163.method206(this.field1359[var37] - var31);
                this.field1163.method206(this.field1360[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    private static final String method465(boolean arg0, int arg1) {
        if (!arg0) {
            field1264 = 434;
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lkb;II)V")
    private final void method466(Packet arg0, int arg1, int arg2) {
        this.field1304 = 0;
        this.field1190 = 0;
        this.method491(11522, arg1, arg0);
        this.method406(arg1, arg0, 0);
        this.method414(2, arg1, arg0);
        this.method417(true, arg1, arg0);
        for (int var4 = 0; var4 < this.field1304; ++var4) {
            int var6 = this.field1305[var4];
            if (field1320 != this.field1187[var6].field344) {
                this.field1187[var6] = null;
            }
        }
        if (arg2 > 0) {
            if (arg0.field622 != arg1) {
                signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field622 + " psize:" + arg1);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field1188; ++var5) {
                    if (this.field1187[this.field1189[var5]] == null) {
                        signlink.reporterror(this.field1431 + " null entry in pl list - pos:" + var5 + " size:" + this.field1188);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)Z")
    public final boolean method467(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        Component var5 = Component.field959[arg0];
        for (int var6 = 0; var6 < var5.field980.length && var5.field980[var6] != -1; ++var6) {
            Component var7 = Component.field959[var5.field980[var6]];
            if (var7.field966 == 1) {
                var4 |= this.method467(var7.field964, arg1, 623);
            }
            if (var7.field966 == 6 && (var7.field1007 != -1 || var7.field1008 != -1)) {
                boolean var8 = this.method471(var7, 65);
                int var9;
                if (var8) {
                    var9 = var7.field1008;
                } else {
                    var9 = var7.field1007;
                }
                if (var9 != -1) {
                    SeqType var10 = SeqType.field1028[var9];
                    var7.field963 += arg1;
                    while (var7.field963 > var10.field1032[var7.field962]) {
                        var7.field963 -= var10.field1032[var7.field962] + 1;
                        ++var7.field962;
                        if (var7.field962 >= var10.field1029) {
                            var7.field962 -= var10.field1033;
                            if (var7.field962 < 0 || var7.field962 >= var10.field1029) {
                                var7.field962 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        if (arg2 <= 0) {
            throw new NullPointerException();
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)V")
    public final void method468(int arg0, String arg1, byte arg2, String arg3) {
        if (arg0 == 0 && this.field1386 != -1) {
            this.field1301 = arg1;
            super.mouseClickButton = 0;
        }
        if (this.field1366 == -1) {
            this.field1330 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1261[var5] = this.field1261[var5 - 1];
            this.field1262[var5] = this.field1262[var5 - 1];
            this.field1263[var5] = this.field1263[var5 - 1];
        }
        this.field1261[0] = arg0;
        this.field1262[0] = arg3;
        if (arg2 != 4) {
            this.field1277 = !this.field1277;
        }
        this.field1263[0] = arg1;
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(II)V")
    public final void method469(int arg0, int arg1) {
        Component var3 = Component.field959[arg1];
        for (int var4 = 0; var4 < var3.field980.length && var3.field980[var4] != -1; ++var4) {
            Component var5 = Component.field959[var3.field980[var4]];
            if (var5.field966 == 1) {
                this.method469(-321, var5.field964);
            }
            var5.field962 = 0;
            var5.field963 = 0;
        }
        if (arg0 >= 0) {
            this.field1522 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method470(int arg0, long arg1) {
        if (arg0 != 43808) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (arg1 != 0L) {
            for (int var5 = 0; var5 < this.field1454; ++var5) {
                if (this.field1308[var5] == arg1) {
                    --this.field1454;
                    this.field1329 = true;
                    for (int var6 = var5; var6 < this.field1454; ++var6) {
                        this.field1492[var6] = this.field1492[var6 + 1];
                        this.field1138[var6] = this.field1138[var6 + 1];
                        this.field1308[var6] = this.field1308[var6 + 1];
                    }
                    this.field1163.method205((byte) -34, 11);
                    this.field1163.method212(true, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lhc;I)Z")
    public final boolean method471(Component arg0, int arg1) {
        if (arg0.field974 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field974.length; ++var3) {
                int var4 = this.method483(arg0, false, var3);
                int var5 = arg0.field975[var3];
                if (arg0.field974[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field974[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field974[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg1 <= 0) {
                this.field1163.method206(82);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method472(byte arg0) {
        if (this.field1433 != arg0) {
            this.field1522 = null;
        }
        if (super.mouseClickButton == 1) {
            int var2 = super.mouseClikcX - 21 - 561;
            int var3 = super.mouseClickY - 9 - 5;
            if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                var2 -= 73;
                var3 -= 75;
                int var4 = this.field1450 + this.field1182 & 2047;
                int var5 = Pix3D.field558[var4];
                int var6 = Pix3D.field559[var4];
                int var7 = (this.field1295 + 256) * var5 >> 8;
                int var8 = (this.field1295 + 256) * var6 >> 8;
                int var9 = var2 * var8 + var3 * var7 >> 11;
                int var10 = var3 * var8 - var2 * var7 >> 11;
                int var11 = this.field1332.field300 + var9 >> 7;
                int var12 = this.field1332.field301 - var10 >> 7;
                boolean var13 = this.method464(this.field1332.field348[0], 0, true, var11, this.field1332.field349[0], 0, 1, 0, var12, 0, 0, 0);
                if (var13) {
                    this.field1163.method206(var2);
                    this.field1163.method206(var3);
                    this.field1163.method207(this.field1182);
                    this.field1163.method206(57);
                    this.field1163.method206(this.field1450);
                    this.field1163.method206(this.field1295);
                    this.field1163.method206(89);
                    this.field1163.method207(this.field1332.field300);
                    this.field1163.method207(this.field1332.field301);
                    this.field1163.method206(this.field1354);
                    this.field1163.method206(63);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method473(byte arg0) {
        if (arg0 != 3) {
            this.field1145 = this.field1160.method216();
        }
        if (this.field1211 == 0) {
            int var2 = super.mouseClickButton;
            if (this.field1390 == 1 && super.mouseClikcX >= 520 && super.mouseClickY >= 165 && super.mouseClikcX <= 788 && super.mouseClickY <= 230) {
                var2 = 0;
            }
            if (this.field1244) {
                if (var2 != 1) {
                    int var3 = super.mouseX;
                    int var4 = super.mouseY;
                    if (this.field1513 == 0) {
                        var3 -= 8;
                        var4 -= 11;
                    }
                    if (this.field1513 == 1) {
                        var3 -= 562;
                        var4 -= 231;
                    }
                    if (this.field1513 == 2) {
                        var3 -= 22;
                        var4 -= 375;
                    }
                    if (var3 < this.field1514 - 10 || var3 > this.field1516 + this.field1514 + 10 || var4 < this.field1515 - 10 || var4 > this.field1517 + this.field1515 + 10) {
                        this.field1244 = false;
                        if (this.field1513 == 1) {
                            this.field1329 = true;
                        }
                        if (this.field1513 == 2) {
                            this.field1330 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field1514;
                    int var6 = this.field1515;
                    int var7 = this.field1516;
                    int var8 = super.mouseClikcX;
                    int var9 = super.mouseClickY;
                    if (this.field1513 == 0) {
                        var8 -= 8;
                        var9 -= 11;
                    }
                    if (this.field1513 == 1) {
                        var8 -= 562;
                        var9 -= 231;
                    }
                    if (this.field1513 == 2) {
                        var8 -= 22;
                        var9 -= 375;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field1439; ++var11) {
                        int var12 = (this.field1439 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method428(6412, var10);
                    }
                    this.field1244 = false;
                    if (this.field1513 == 1) {
                        this.field1329 = true;
                    }
                    if (this.field1513 == 2) {
                        this.field1330 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field1439 > 0) {
                    int var13 = this.field1506[this.field1439 - 1];
                    if (var13 == 602 || var13 == 596 || var13 == 22 || var13 == 892 || var13 == 415 || var13 == 405 || var13 == 38 || var13 == 422 || var13 == 478 || var13 == 347 || var13 == 188) {
                        int var14 = this.field1504[this.field1439 - 1];
                        int var15 = this.field1505[this.field1439 - 1];
                        Component var16 = Component.field959[var15];
                        if (var16.field985) {
                            this.field1325 = false;
                            this.field1289 = 0;
                            this.field1209 = var15;
                            this.field1210 = var14;
                            this.field1211 = 2;
                            this.field1212 = super.mouseClikcX;
                            this.field1213 = super.mouseClickY;
                            if (Component.field959[var15].field965 == this.field1336) {
                                this.field1211 = 1;
                            }
                            if (Component.field959[var15].field965 == this.field1366) {
                                this.field1211 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field1175 == 1 || this.method427(145, this.field1439 - 1)) && this.field1439 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field1439 > 0) {
                    this.method428(6412, this.field1439 - 1);
                }
                if (var2 != 2 || this.field1439 <= 0) {
                    return;
                }
                this.method450(-386);
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method474(byte arg0) {
        int var2 = this.field1093 * 128 + 64;
        int var3 = this.field1094 * 128 + 64;
        int var4 = this.method390(this.field1245, this.field1093, (byte) 5, this.field1094) - this.field1095;
        if (this.field1476 < var2) {
            this.field1476 += (var2 - this.field1476) * this.field1097 / 1000 + this.field1096;
            if (this.field1476 > var2) {
                this.field1476 = var2;
            }
        }
        if (this.field1476 > var2) {
            this.field1476 -= (this.field1476 - var2) * this.field1097 / 1000 + this.field1096;
            if (this.field1476 < var2) {
                this.field1476 = var2;
            }
        }
        if (this.field1477 < var4) {
            this.field1477 += (var4 - this.field1477) * this.field1097 / 1000 + this.field1096;
            if (this.field1477 > var4) {
                this.field1477 = var4;
            }
        }
        if (this.field1477 > var4) {
            this.field1477 -= (this.field1477 - var4) * this.field1097 / 1000 + this.field1096;
            if (this.field1477 < var4) {
                this.field1477 = var4;
            }
        }
        if (this.field1478 < var3) {
            this.field1478 += (var3 - this.field1478) * this.field1097 / 1000 + this.field1096;
            if (this.field1478 > var3) {
                this.field1478 = var3;
            }
        }
        if (this.field1478 > var3) {
            this.field1478 -= (this.field1478 - var3) * this.field1097 / 1000 + this.field1096;
            if (this.field1478 < var3) {
                this.field1478 = var3;
            }
        }
        int var5 = this.field1313 * 128 + 64;
        int var6 = this.field1314 * 128 + 64;
        int var7 = this.method390(this.field1245, this.field1313, (byte) 5, this.field1314) - this.field1315;
        int var8 = var5 - this.field1476;
        int var9 = var7 - this.field1477;
        int var10 = var6 - this.field1478;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (arg0 == 2) {
            if (var12 < 128) {
                var12 = 128;
            }
            if (var12 > 383) {
                var12 = 383;
            }
            if (this.field1479 < var12) {
                this.field1479 += (var12 - this.field1479) * this.field1317 / 1000 + this.field1316;
                if (this.field1479 > var12) {
                    this.field1479 = var12;
                }
            }
            if (this.field1479 > var12) {
                this.field1479 -= (this.field1479 - var12) * this.field1317 / 1000 + this.field1316;
                if (this.field1479 < var12) {
                    this.field1479 = var12;
                }
            }
            int var14 = var13 - this.field1480;
            if (var14 > 1024) {
                var14 -= 2048;
            }
            if (var14 < -1024) {
                var14 += 2048;
            }
            if (var14 > 0) {
                this.field1480 += this.field1317 * var14 / 1000 + this.field1316;
                this.field1480 &= 2047;
            }
            if (var14 < 0) {
                this.field1480 -= -var14 * this.field1317 / 1000 + this.field1316;
                this.field1480 &= 2047;
            }
            int var15 = var13 - this.field1480;
            if (var15 > 1024) {
                var15 -= 2048;
            }
            if (var15 < -1024) {
                var15 += 2048;
            }
            if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
                this.field1480 = var13;
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method475(int arg0) {
        if (arg0 != 29286) {
            this.field1136 = this.field1118.nextInt();
        }
        if (super.mouseClickButton == 1) {
            if (super.mouseClikcX >= 549 && super.mouseClikcX <= 583 && super.mouseClickY >= 195 && super.mouseClickY < 231 && this.field1226[0] != -1) {
                this.field1329 = true;
                this.field1122 = 0;
                this.field1445 = true;
            }
            if (super.mouseClikcX >= 579 && super.mouseClikcX <= 609 && super.mouseClickY >= 194 && super.mouseClickY < 231 && this.field1226[1] != -1) {
                this.field1329 = true;
                this.field1122 = 1;
                this.field1445 = true;
            }
            if (super.mouseClikcX >= 607 && super.mouseClikcX <= 637 && super.mouseClickY >= 194 && super.mouseClickY < 231 && this.field1226[2] != -1) {
                this.field1329 = true;
                this.field1122 = 2;
                this.field1445 = true;
            }
            if (super.mouseClikcX >= 635 && super.mouseClikcX <= 679 && super.mouseClickY >= 194 && super.mouseClickY < 229 && this.field1226[3] != -1) {
                this.field1329 = true;
                this.field1122 = 3;
                this.field1445 = true;
            }
            if (super.mouseClikcX >= 676 && super.mouseClikcX <= 706 && super.mouseClickY >= 194 && super.mouseClickY < 231 && this.field1226[4] != -1) {
                this.field1329 = true;
                this.field1122 = 4;
                this.field1445 = true;
            }
            if (super.mouseClikcX >= 704 && super.mouseClikcX <= 734 && super.mouseClickY >= 194 && super.mouseClickY < 231 && this.field1226[5] != -1) {
                this.field1329 = true;
                this.field1122 = 5;
                this.field1445 = true;
            }
            if (super.mouseClikcX >= 732 && super.mouseClikcX <= 766 && super.mouseClickY >= 195 && super.mouseClickY < 231 && this.field1226[6] != -1) {
                this.field1329 = true;
                this.field1122 = 6;
                this.field1445 = true;
            }
            if (super.mouseClikcX >= 550 && super.mouseClikcX <= 584 && super.mouseClickY >= 492 && super.mouseClickY < 528 && this.field1226[7] != -1) {
                this.field1329 = true;
                this.field1122 = 7;
                this.field1445 = true;
            }
            if (super.mouseClikcX >= 582 && super.mouseClikcX <= 612 && super.mouseClickY >= 492 && super.mouseClickY < 529 && this.field1226[8] != -1) {
                this.field1329 = true;
                this.field1122 = 8;
                this.field1445 = true;
            }
            if (super.mouseClikcX >= 609 && super.mouseClikcX <= 639 && super.mouseClickY >= 492 && super.mouseClickY < 529 && this.field1226[9] != -1) {
                this.field1329 = true;
                this.field1122 = 9;
                this.field1445 = true;
            }
            if (super.mouseClikcX >= 637 && super.mouseClikcX <= 681 && super.mouseClickY >= 493 && super.mouseClickY < 528 && this.field1226[10] != -1) {
                this.field1329 = true;
                this.field1122 = 10;
                this.field1445 = true;
            }
            if (super.mouseClikcX >= 679 && super.mouseClikcX <= 709 && super.mouseClickY >= 492 && super.mouseClickY < 529 && this.field1226[11] != -1) {
                this.field1329 = true;
                this.field1122 = 11;
                this.field1445 = true;
            }
            if (super.mouseClikcX >= 706 && super.mouseClikcX <= 736 && super.mouseClickY >= 492 && super.mouseClickY < 529 && this.field1226[12] != -1) {
                this.field1329 = true;
                this.field1122 = 12;
                this.field1445 = true;
            }
            if (super.mouseClikcX >= 734 && super.mouseClikcX <= 768 && super.mouseClickY >= 492 && super.mouseClickY < 528 && this.field1226[13] != -1) {
                this.field1329 = true;
                this.field1122 = 13;
                this.field1445 = true;
            }
            ++field1247;
            if (field1247 > 150) {
                field1247 = 0;
                this.field1163.method205((byte) -34, 233);
                this.field1163.method206(43);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lhc;B)Z")
    public final boolean method476(Component arg0, byte arg1) {
        int var3 = arg0.field968;
        if (this.field1155 != arg1) {
            this.field1404 = this.field1118.nextInt();
        }
        if (var3 >= 1 && var3 <= 200) {
            if (var3 >= 101) {
                var3 -= 101;
            } else {
                --var3;
            }
            this.field1199[this.field1439] = "Remove @whi@" + this.field1492[var3];
            this.field1506[this.field1439] = 557;
            ++this.field1439;
            this.field1199[this.field1439] = "Message @whi@" + this.field1492[var3];
            this.field1506[this.field1439] = 679;
            ++this.field1439;
            return true;
        } else if (var3 >= 401 && var3 <= 500) {
            this.field1199[this.field1439] = "Remove @whi@" + arg0.field998;
            this.field1506[this.field1439] = 556;
            ++this.field1439;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILkb;I)V")
    private final void method477(int arg0, Packet arg1, int arg2) {
        if (arg0 < 0) {
            arg1.method226(223);
            int var4 = arg1.method227(9, 8);
            if (var4 < this.field1293) {
                for (int var5 = var4; var5 < this.field1293; ++var5) {
                    this.field1305[this.field1304++] = this.field1294[var5];
                }
            }
            if (var4 > this.field1293) {
                signlink.reporterror(this.field1431 + " Too many npcs");
                throw new RuntimeException("eek");
            } else {
                this.field1293 = 0;
                for (int var6 = 0; var6 < var4; ++var6) {
                    int var7 = this.field1294[var6];
                    NpcEntity var8 = this.field1292[var7];
                    int var9 = arg1.method227(9, 1);
                    if (var9 == 0) {
                        this.field1294[this.field1293++] = var7;
                        var8.field344 = field1320;
                    } else {
                        int var10 = arg1.method227(9, 2);
                        if (var10 == 0) {
                            this.field1294[this.field1293++] = var7;
                            var8.field344 = field1320;
                            this.field1191[this.field1190++] = var7;
                        } else if (var10 == 1) {
                            this.field1294[this.field1293++] = var7;
                            var8.field344 = field1320;
                            int var11 = arg1.method227(9, 3);
                            var8.method111(false, var11, (byte) 6);
                            int var12 = arg1.method227(9, 1);
                            if (var12 == 1) {
                                this.field1191[this.field1190++] = var7;
                            }
                        } else if (var10 == 2) {
                            this.field1294[this.field1293++] = var7;
                            var8.field344 = field1320;
                            int var13 = arg1.method227(9, 3);
                            var8.method111(true, var13, (byte) 6);
                            int var14 = arg1.method227(9, 3);
                            var8.method111(true, var14, (byte) 6);
                            int var15 = arg1.method227(9, 1);
                            if (var15 == 1) {
                                this.field1191[this.field1190++] = var7;
                            }
                        } else if (var10 == 3) {
                            this.field1305[this.field1304++] = var7;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method478(boolean arg0) {
        if (this.field1148 > 0) {
            this.method415(-780);
        } else {
            this.field1413.method242((byte) 62);
            if (arg0) {
                this.method6();
            }
            this.field1351.method191(144, (byte) 6, 0, "Connection lost", 257);
            this.field1351.method191(143, (byte) 6, 16777215, "Connection lost", 256);
            this.field1351.method191(159, (byte) 6, 0, "Please wait - attempting to reestablish", 257);
            this.field1351.method191(158, (byte) 6, 16777215, "Please wait - attempting to reestablish", 256);
            this.field1413.draw(11, super.graphics, 8, 5193);
            this.field1416 = 0;
            ClientStream var2 = this.field1364;
            this.field1339 = false;
            this.method455(this.field1431, this.field1432, true);
            if (!this.field1339) {
                this.method415(-780);
            }
            try {
                var2.method29();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILib;)V")
    public final void method479(int arg0, Pix8 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1206.length; ++var4) {
            this.field1206[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1206[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field1207[var16] = (this.field1206[var16 - 1] + this.field1206[var16 + 1] + this.field1206[var16 - 128] + this.field1206[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field1206;
            this.field1206 = this.field1207;
            this.field1207 = var14;
        }
        if (arg0 <= 0) {
            this.field1277 = !this.field1277;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field591; ++var8) {
                for (int var9 = 0; var9 < arg1.field590; ++var9) {
                    if (arg1.field588[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field592;
                        int var11 = var8 + 16 + arg1.field593;
                        int var12 = (var11 << 7) + var10;
                        this.field1206[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(II)V")
    public final void method480(int arg0, int arg1) {
        LinkList var3 = this.field1522[this.field1245][arg0][arg1];
        if (var3 == null) {
            this.field1196.method77(this.field1245, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method235(); var6 != null; var6 = (ObjStackEntity) var3.method237(551)) {
                ObjType var16 = ObjType.method294(var6.field296);
                int var17 = var16.field896;
                if (var16.field895) {
                    var17 = (var6.field297 + 1) * var17;
                }
                if (var17 > var4) {
                    var4 = var17;
                    var5 = var6;
                }
            }
            var3.method233(var5, -26173);
            int var7 = -1;
            int var8 = -1;
            int var9 = 0;
            int var10 = 0;
            for (ObjStackEntity var11 = (ObjStackEntity) var3.method235(); var11 != null; var11 = (ObjStackEntity) var3.method237(551)) {
                if (var5.field296 != var11.field296 && var7 == -1) {
                    var7 = var11.field296;
                    var9 = var11.field297;
                }
                if (var5.field296 != var11.field296 && var11.field296 != var7 && var8 == -1) {
                    var8 = var11.field296;
                    var10 = var11.field297;
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
            ObjType var15 = ObjType.method294(var5.field296);
            this.field1196.method58(var15.method298(var5.field297), var12, this.method390(this.field1245, arg0 * 128 + 64, (byte) 5, arg1 * 128 + 64), this.field1245, var14, arg1, arg0, var13, 429);
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method481(int arg0) {
        try {
            this.field1139 = -1;
            this.field1132.method239();
            this.field1117.method239();
            this.field1421.method239();
            this.field1197.method239();
            Pix3D.method157(false);
            this.method440(this.field1208);
            this.field1196.method51(742);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1319[var2].method302((byte) 74);
            }
            System.gc();
            World var3 = new World(104, this.field1205, 104, this.field1159, this.field1471);
            byte[] var4 = new byte[100000];
            int var5 = this.field1135.length;
            World.field36 = World3D.field219;
            for (int var6 = 0; var6 < var5; ++var6) {
                int var7 = this.field1290[var6] >> 8;
                int var8 = this.field1290[var6] & 255;
                if (var7 == 33 && var8 >= 71 && var8 <= 73) {
                    World.field36 = false;
                }
            }
            if (World.field36) {
                this.field1196.method52(0, this.field1245);
            } else {
                this.field1196.method52(0, 0);
            }
            this.field1163.method205((byte) -34, 108);
            for (int var9 = 0; var9 < var5; ++var9) {
                int var10 = (this.field1290[var9] >> 8) * 64 - this.field1126;
                int var11 = (this.field1290[var9] & 255) * 64 - this.field1127;
                byte[] var12 = this.field1135[var9];
                if (var12 != null) {
                    int var13 = (new Packet(363, var12)).method221();
                    BZip2.read(var4, var13, var12, var12.length - 4, 4);
                    var3.method15(var4, (this.field1203 - 6) * 8, 1, var11, var10, (this.field1204 - 6) * 8);
                } else if (this.field1204 < 800) {
                    var3.method14(var10, var11, 3, 64, 64);
                }
            }
            this.field1163.method205((byte) -34, 108);
            for (int var14 = 0; var14 < var5; ++var14) {
                byte[] var15 = this.field1365[var14];
                if (var15 != null) {
                    int var16 = (new Packet(363, var15)).method221();
                    BZip2.read(var4, var16, var15, var15.length - 4, 4);
                    int var17 = (this.field1290[var14] >> 8) * 64 - this.field1126;
                    int var18 = (this.field1290[var14] & 255) * 64 - this.field1127;
                    var3.method16(var4, this.field1196, this.field1319, this.field1117, true, var18, var17);
                }
            }
            this.field1163.method205((byte) -34, 108);
            var3.method18(this.field1196, -270, this.field1319);
            this.field1413.method242((byte) 62);
            this.field1163.method205((byte) -34, 108);
            for (LocEntity var19 = (LocEntity) this.field1117.method235(); var19 != null; var19 = (LocEntity) this.field1117.method237(551)) {
                if ((this.field1205[1][var19.field655][var19.field656] & 2) == 2) {
                    --var19.field653;
                    if (var19.field653 < 0) {
                        var19.unlink();
                    }
                }
            }
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method480(var20, var21);
                }
            }
            for (LocMerged var22 = (LocMerged) this.field1249.method235(); var22 != null; var22 = (LocMerged) this.field1249.method237(551)) {
                this.method456(var22.field639, var22.field636, var22.field637, var22.field635, var22.field638, var22.field640, -27819, var22.field634);
            }
        } catch (Exception var24) {
        }
        LocType.field840.method105();
        if (arg0 <= 0) {
            this.field1512 = !this.field1512;
        }
        System.gc();
        Pix3D.method158(20, -20);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (!this.field1435 && !this.field1230 && !this.field1288) {
            ++field1320;
            if (arg0 > 0) {
                if (!this.field1339) {
                    this.method393((byte) -70);
                } else {
                    this.method460(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method482(byte arg0) {
        if (arg0 != 94) {
            this.method6();
        }
        for (int var2 = -1; var2 < this.field1188; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1186;
            } else {
                var6 = this.field1189[var2];
            }
            PlayerEntity var7 = this.field1187[var6];
            if (var7 != null && var7.field313 > 0) {
                --var7.field313;
                if (var7.field313 == 0) {
                    var7.field312 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field1293; ++var3) {
            int var4 = this.field1294[var3];
            NpcEntity var5 = this.field1292[var4];
            if (var5 != null && var5.field313 > 0) {
                --var5.field313;
                if (var5.field313 == 0) {
                    var5.field312 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lhc;ZI)I")
    public final int method483(Component arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field1214 = !this.field1214;
        }
        if (arg0.field973 != null && arg2 < arg0.field973.length) {
            try {
                int[] var4 = arg0.field973[arg2];
                int var5 = 0;
                int var6 = 0;
                while (true) {
                    int var7 = var4[var6++];
                    if (var7 == 0) {
                        return var5;
                    }
                    if (var7 == 1) {
                        var5 += this.field1172[var4[var6++]];
                    }
                    if (var7 == 2) {
                        var5 += this.field1291[var4[var6++]];
                    }
                    if (var7 == 3) {
                        var5 += this.field1444[var4[var6++]];
                    }
                    if (var7 == 4) {
                        Component var8 = Component.field959[var4[var6++]];
                        int var9 = var4[var6++] + 1;
                        for (int var10 = 0; var10 < var8.field960.length; ++var10) {
                            if (var8.field960[var10] == var9) {
                                var5 += var8.field961[var10];
                            }
                        }
                    }
                    if (var7 == 5) {
                        var5 += this.field1303[var4[var6++]];
                    }
                    if (var7 == 6) {
                        var5 += field1229[this.field1291[var4[var6++]] - 1];
                    }
                    if (var7 == 7) {
                        var5 += this.field1303[var4[var6++]] * 100 / 46875;
                    }
                    if (var7 == 8) {
                        var5 += this.field1332.field363;
                    }
                    if (var7 == 9) {
                        for (int var11 = 0; var11 < 19; ++var11) {
                            if (var11 == 18) {
                                var11 = 20;
                            }
                            var5 += this.field1291[var11];
                        }
                    }
                    if (var7 == 10) {
                        Component var12 = Component.field959[var4[var6++]];
                        int var13 = var4[var6++] + 1;
                        for (int var14 = 0; var14 < var12.field960.length; ++var14) {
                            if (var12.field960[var14] == var13) {
                                var5 += 999999999;
                                break;
                            }
                        }
                    }
                    if (var7 == 11) {
                        var5 += this.field1437;
                    }
                    if (var7 == 12) {
                        var5 += this.field1134;
                    }
                    if (var7 == 13) {
                        int var15 = this.field1303[var4[var6++]];
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

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method484(boolean arg0) {
        Graphics var2 = this.method11(field1481).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 789, 532);
        this.setFramerate(386, 1);
        if (arg0) {
            this.method6();
        }
        if (this.field1230) {
            this.field1267 = false;
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
        if (this.field1288) {
            this.field1267 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1435) {
            this.field1267 = false;
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

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method485(byte arg0) {
        byte[] var2 = this.field1501.read("title.dat", (byte[]) null, (byte) 2);
        Pix32 var3 = new Pix32(var2, this);
        this.field1397.method242((byte) 62);
        var3.method173(34676, 0, 0);
        this.field1398.method242((byte) 62);
        var3.method173(34676, -661, 0);
        this.field1394.method242((byte) 62);
        var3.method173(34676, -128, 0);
        this.field1395.method242((byte) 62);
        var3.method173(34676, -214, -386);
        this.field1396.method242((byte) 62);
        var3.method173(34676, -214, -186);
        this.field1399.method242((byte) 62);
        var3.method173(34676, 0, -265);
        this.field1400.method242((byte) 62);
        var3.method173(34676, -574, -265);
        this.field1401.method242((byte) 62);
        if (arg0 != 5) {
            this.field1277 = !this.field1277;
        }
        var3.method173(34676, -128, -186);
        this.field1402.method242((byte) 62);
        var3.method173(34676, -574, -186);
        int[] var4 = new int[var3.field578];
        for (int var5 = 0; var5 < var3.field579; ++var5) {
            for (int var10 = 0; var10 < var3.field578; ++var10) {
                var4[var10] = var3.field577[var3.field578 * var5 + (var3.field578 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field578; ++var11) {
                var3.field577[var3.field578 * var5 + var11] = var4[var11];
            }
        }
        this.field1397.method242((byte) 62);
        var3.method173(34676, 394, 0);
        this.field1398.method242((byte) 62);
        var3.method173(34676, -267, 0);
        this.field1394.method242((byte) 62);
        var3.method173(34676, 266, 0);
        this.field1395.method242((byte) 62);
        var3.method173(34676, 180, -386);
        this.field1396.method242((byte) 62);
        var3.method173(34676, 180, -186);
        this.field1399.method242((byte) 62);
        var3.method173(34676, 394, -265);
        this.field1400.method242((byte) 62);
        var3.method173(34676, -180, -265);
        this.field1401.method242((byte) 62);
        var3.method173(34676, 212, -186);
        this.field1402.method242((byte) 62);
        var3.method173(34676, -180, -186);
        Pix32 var6 = new Pix32(this.field1501, "logo", 0);
        this.field1394.method242((byte) 62);
        var6.method175(18, super.screenWidth / 2 - var6.field578 / 2 - 128, false);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method486(int arg0) {
        int var2 = 30 / arg0;
        for (LocEntity var3 = (LocEntity) this.field1117.method235(); var3 != null; var3 = (LocEntity) this.field1117.method237(551)) {
            boolean var4 = false;
            var3.field660 += this.field1334;
            if (var3.field659 == -1) {
                var3.field659 = 0;
                var4 = true;
            }
            label69: {
                do {
                    do {
                        if (var3.field660 <= var3.field658.field1032[var3.field659]) {
                            break label69;
                        }
                        var3.field660 -= var3.field658.field1032[var3.field659] + 1;
                        ++var3.field659;
                        var4 = true;
                    } while (var3.field659 < var3.field658.field1029);
                    var3.field659 -= var3.field658.field1033;
                } while (var3.field659 >= 0 && var3.field659 < var3.field658.field1029);
                var3.unlink();
                var4 = false;
            }
            if (var4) {
                int var5 = var3.field653;
                int var6 = var3.field655;
                int var7 = var3.field656;
                int var8 = 0;
                if (var3.field654 == 0) {
                    var8 = this.field1196.method78(var5, var6, var7);
                }
                if (var3.field654 == 1) {
                    var8 = this.field1196.method79(var5, var7, 3, var6);
                }
                if (var3.field654 == 2) {
                    var8 = this.field1196.method80(var5, var6, var7);
                }
                if (var3.field654 == 3) {
                    var8 = this.field1196.method81(var5, var6, var7);
                }
                if (var8 != 0 && (var8 >> 14 & 32767) == var3.field657) {
                    int var9 = this.field1159[var5][var6][var7];
                    int var10 = this.field1159[var5][var6 + 1][var7];
                    int var11 = this.field1159[var5][var6 + 1][var7 + 1];
                    int var12 = this.field1159[var5][var6][var7 + 1];
                    LocType var13 = LocType.method282(var3.field657);
                    int var14 = -1;
                    if (var3.field659 != -1) {
                        var14 = var3.field658.field1030[var3.field659];
                    }
                    if (var3.field654 == 2) {
                        int var15 = this.field1196.method82(var5, var6, var7, var8);
                        int var16 = var15 & 31;
                        int var17 = var15 >> 6;
                        if (var16 == 11) {
                            var16 = 10;
                        }
                        Model var18 = var13.method285(var16, var17, var9, var10, var11, var12, var14);
                        this.field1196.method67(var6, var18, 1, var5, var7);
                    } else if (var3.field654 == 1) {
                        Model var19 = var13.method285(4, 0, var9, var10, var11, var12, var14);
                        this.field1196.method69(266, var7, var6, var19, var5);
                    } else if (var3.field654 == 0) {
                        int var20 = this.field1196.method82(var5, var6, var7, var8);
                        int var21 = var20 & 31;
                        int var22 = var20 >> 6;
                        if (var21 == 2) {
                            int var23 = var22 + 1 & 3;
                            Model var24 = var13.method285(2, var22 + 4, var9, var10, var11, var12, var14);
                            Model var25 = var13.method285(2, var23, var9, var10, var11, var12, var14);
                            this.field1196.method72(var24, var25, var7, this.field1214, var6, var5);
                        } else {
                            Model var26 = var13.method285(var21, var22, var9, var10, var11, var12, var14);
                            this.field1196.method71(35568, var26, var7, var6, var5);
                        }
                    } else if (var3.field654 == 3) {
                        int var27 = this.field1196.method82(var5, var6, var7, var8);
                        int var28 = var27 >> 6;
                        Model var29 = var13.method285(22, var28, var9, var10, var11, var12, var14);
                        this.field1196.method70(var29, var7, -48639, var6, var5);
                    }
                } else {
                    var3.unlink();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IJ)V")
    public final void method487(int arg0, long arg1) {
        if (arg0 != 1) {
            this.field1145 = -1;
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field1158; ++var4) {
                if (this.field1133[var4] == arg1) {
                    --this.field1158;
                    this.field1329 = true;
                    for (int var5 = var4; var5 < this.field1158; ++var5) {
                        this.field1133[var5] = this.field1133[var5 + 1];
                    }
                    this.field1163.method205((byte) -34, 171);
                    this.field1163.method212(true, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(B)V")
    public final void method488(byte arg0) {
        if (this.field1367 == 0 && this.field1390 == 0) {
            this.field1199[this.field1439] = "Walk here";
            this.field1506[this.field1439] = 660;
            this.field1504[this.field1439] = super.mouseX;
            this.field1505[this.field1439] = super.mouseY;
            ++this.field1439;
        }
        int var2 = -1;
        if (arg0 != 2) {
            field1235 = !field1235;
        }
        for (int var3 = 0; var3 < Model.field523; ++var3) {
            int var4 = Model.field524[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1196.method82(this.field1245, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method282(var8);
                    if (this.field1367 == 1) {
                        this.field1199[this.field1439] = "Use " + this.field1371 + " with @cya@" + var9.field810;
                        this.field1506[this.field1439] = 450;
                        this.field1507[this.field1439] = var4;
                        this.field1504[this.field1439] = var5;
                        this.field1505[this.field1439] = var6;
                        ++this.field1439;
                    } else if (this.field1390 == 1) {
                        if ((this.field1392 & 4) == 4) {
                            this.field1199[this.field1439] = this.field1393 + " @cya@" + var9.field810;
                            this.field1506[this.field1439] = 55;
                            this.field1507[this.field1439] = var4;
                            this.field1504[this.field1439] = var5;
                            this.field1505[this.field1439] = var6;
                            ++this.field1439;
                        }
                    } else {
                        if (var9.field826 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field826[var10] != null) {
                                    this.field1199[this.field1439] = var9.field826[var10] + " @cya@" + var9.field810;
                                    if (var10 == 0) {
                                        this.field1506[this.field1439] = 285;
                                    }
                                    if (var10 == 1) {
                                        this.field1506[this.field1439] = 504;
                                    }
                                    if (var10 == 2) {
                                        this.field1506[this.field1439] = 364;
                                    }
                                    if (var10 == 3) {
                                        this.field1506[this.field1439] = 581;
                                    }
                                    if (var10 == 4) {
                                        this.field1506[this.field1439] = 1501;
                                    }
                                    this.field1507[this.field1439] = var4;
                                    this.field1504[this.field1439] = var5;
                                    this.field1505[this.field1439] = var6;
                                    ++this.field1439;
                                }
                            }
                        }
                        this.field1199[this.field1439] = "Examine @cya@" + var9.field810;
                        this.field1506[this.field1439] = 1175;
                        this.field1507[this.field1439] = var4;
                        this.field1504[this.field1439] = var5;
                        this.field1505[this.field1439] = var6;
                        ++this.field1439;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1292[var8];
                    if (var11.field354.field851 == 1 && (var11.field300 & 127) == 64 && (var11.field301 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1293; ++var12) {
                            NpcEntity var13 = this.field1292[this.field1294[var12]];
                            if (var13 != null && var11 != var13 && var13.field354.field851 == 1 && var11.field300 == var13.field300 && var11.field301 == var13.field301) {
                                this.method391(var13.field354, -641, var6, var5, this.field1294[var12]);
                            }
                        }
                    }
                    this.method391(var11.field354, -641, var6, var5, var8);
                }
                if (var7 == 0) {
                    PlayerEntity var14 = this.field1187[var8];
                    if ((var14.field300 & 127) == 64 && (var14.field301 & 127) == 64) {
                        for (int var15 = 0; var15 < this.field1293; ++var15) {
                            NpcEntity var18 = this.field1292[this.field1294[var15]];
                            if (var18 != null && var18.field354.field851 == 1 && var14.field300 == var18.field300 && var14.field301 == var18.field301) {
                                this.method391(var18.field354, -641, var6, var5, this.field1294[var15]);
                            }
                        }
                        for (int var16 = 0; var16 < this.field1188; ++var16) {
                            PlayerEntity var17 = this.field1187[this.field1189[var16]];
                            if (var17 != null && var14 != var17 && var14.field300 == var17.field300 && var14.field301 == var17.field301) {
                                this.method459(false, var6, this.field1189[var16], var17, var5);
                            }
                        }
                    }
                    this.method459(false, var6, var8, var14, var5);
                }
                if (var7 == 3) {
                    LinkList var19 = this.field1522[this.field1245][var5][var6];
                    if (var19 != null) {
                        for (ObjStackEntity var20 = (ObjStackEntity) var19.method236((byte) 2); var20 != null; var20 = (ObjStackEntity) var19.method238(false)) {
                            ObjType var21 = ObjType.method294(var20.field296);
                            if (this.field1367 == 1) {
                                this.field1199[this.field1439] = "Use " + this.field1371 + " with @lre@" + var21.field883;
                                this.field1506[this.field1439] = 217;
                                this.field1507[this.field1439] = var20.field296;
                                this.field1504[this.field1439] = var5;
                                this.field1505[this.field1439] = var6;
                                ++this.field1439;
                            } else if (this.field1390 == 1) {
                                if ((this.field1392 & 1) == 1) {
                                    this.field1199[this.field1439] = this.field1393 + " @lre@" + var21.field883;
                                    this.field1506[this.field1439] = 965;
                                    this.field1507[this.field1439] = var20.field296;
                                    this.field1504[this.field1439] = var5;
                                    this.field1505[this.field1439] = var6;
                                    ++this.field1439;
                                }
                            } else {
                                for (int var22 = 4; var22 >= 0; --var22) {
                                    if (var21.field898 != null && var21.field898[var22] != null) {
                                        this.field1199[this.field1439] = var21.field898[var22] + " @lre@" + var21.field883;
                                        if (var22 == 0) {
                                            this.field1506[this.field1439] = 224;
                                        }
                                        if (var22 == 1) {
                                            this.field1506[this.field1439] = 993;
                                        }
                                        if (var22 == 2) {
                                            this.field1506[this.field1439] = 99;
                                        }
                                        if (var22 == 3) {
                                            this.field1506[this.field1439] = 746;
                                        }
                                        if (var22 == 4) {
                                            this.field1506[this.field1439] = 877;
                                        }
                                        this.field1507[this.field1439] = var20.field296;
                                        this.field1504[this.field1439] = var5;
                                        this.field1505[this.field1439] = var6;
                                        ++this.field1439;
                                    } else if (var22 == 2) {
                                        this.field1199[this.field1439] = "Take @lre@" + var21.field883;
                                        this.field1506[this.field1439] = 99;
                                        this.field1507[this.field1439] = var20.field296;
                                        this.field1504[this.field1439] = var5;
                                        this.field1505[this.field1439] = var6;
                                        ++this.field1439;
                                    }
                                }
                                this.field1199[this.field1439] = "Examine @lre@" + var21.field883;
                                this.field1506[this.field1439] = 1102;
                                this.field1507[this.field1439] = var20.field296;
                                this.field1504[this.field1439] = var5;
                                this.field1505[this.field1439] = var6;
                                ++this.field1439;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method489(boolean arg0) {
        this.field1339 &= arg0;
        for (int var2 = -1; var2 < this.field1188; ++var2) {
            int var4;
            if (var2 == -1) {
                var4 = this.field1186;
            } else {
                var4 = this.field1189[var2];
            }
            PlayerEntity var5 = this.field1187[var4];
            if (var5 != null) {
                this.method420(var5, (byte) -128, 1);
            }
        }
        ++field1278;
        if (field1278 > 1406) {
            field1278 = 0;
            this.field1163.method205((byte) -34, 219);
            this.field1163.method206(0);
            int var3 = this.field1163.field622;
            this.field1163.method206(162);
            this.field1163.method206(22);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1163.method206(84);
            }
            this.field1163.method207(31824);
            this.field1163.method207(13490);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1163.method206(123);
            }
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field1163.method206(134);
            }
            this.field1163.method206(100);
            this.field1163.method206(94);
            this.field1163.method207(35521);
            this.field1163.method215(0, this.field1163.field622 - var3);
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(B)V")
    public final void method490(byte arg0) {
        if (this.field1276 == 2) {
            this.method448((this.field1111 - this.field1127 << 7) + this.field1114, (this.field1110 - this.field1126 << 7) + this.field1113, this.field1470, this.field1112 * 2);
            if (arg0 != -11) {
                this.field1512 = !this.field1512;
            }
            if (this.field1384 > -1 && field1320 % 20 < 10) {
                this.field1321[2].method175(this.field1385 - 28, this.field1384 - 12, false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILkb;)V")
    private final void method491(int arg0, int arg1, Packet arg2) {
        arg2.method226(223);
        int var4 = arg2.method227(9, 1);
        if (arg0 != 11522) {
            this.field1522 = null;
        }
        if (var4 != 0) {
            int var5 = arg2.method227(9, 2);
            if (var5 == 0) {
                this.field1191[this.field1190++] = this.field1186;
            } else if (var5 == 1) {
                int var6 = arg2.method227(9, 3);
                this.field1332.method111(false, var6, (byte) 6);
                int var7 = arg2.method227(9, 1);
                if (var7 == 1) {
                    this.field1191[this.field1190++] = this.field1186;
                }
            } else if (var5 == 2) {
                int var8 = arg2.method227(9, 3);
                this.field1332.method111(true, var8, (byte) 6);
                int var9 = arg2.method227(9, 3);
                this.field1332.method111(true, var9, (byte) 6);
                int var10 = arg2.method227(9, 1);
                if (var10 == 1) {
                    this.field1191[this.field1190++] = this.field1186;
                }
            } else if (var5 == 3) {
                this.field1245 = arg2.method227(9, 2);
                int var11 = arg2.method227(9, 7);
                int var12 = arg2.method227(9, 7);
                int var13 = arg2.method227(9, 1);
                this.field1332.method110(false, var13 == 1, var11, var12);
                int var14 = arg2.method227(9, 1);
                if (var14 == 1) {
                    this.field1191[this.field1190++] = this.field1186;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method492(boolean arg0) {
        if (arg0) {
            this.field1145 = -1;
        }
        this.field1414.method242((byte) 62);
        Pix3D.field560 = this.field1100;
        this.field1348.method189(0, 0, false);
        if (this.field1234) {
            this.field1352.method191(40, (byte) 6, 0, this.field1140, 239);
            this.field1352.method191(60, (byte) 6, 128, this.field1130 + "*", 239);
        } else if (this.field1420) {
            this.field1352.method191(40, (byte) 6, 0, "Enter amount:", 239);
            this.field1352.method191(60, (byte) 6, 128, this.field1149 + "*", 239);
        } else if (this.field1301 != null) {
            this.field1352.method191(40, (byte) 6, 0, this.field1301, 239);
            this.field1352.method191(60, (byte) 6, 128, "Click to continue", 239);
        } else if (this.field1366 != -1) {
            this.method416(0, 0, 38682, Component.field959[this.field1366], 0);
        } else if (this.field1386 != -1) {
            this.method416(0, 0, 38682, Component.field959[this.field1386], 0);
        } else {
            PixFont var2 = this.field1351;
            int var3 = 0;
            Pix2D.method148(77, 0, 463, 789, 0);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1263[var4] != null) {
                    int var5 = this.field1261[var4];
                    int var6 = 70 - var3 * 14 + this.field1342;
                    if (var5 == 0) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method194(4, var6, false, 0, this.field1263[var4]);
                        }
                        ++var3;
                    }
                    if (var5 == 1) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method194(4, var6, false, 16777215, this.field1262[var4] + ":");
                            var2.method194(12 + var2.method193(false, this.field1262[var4]), var6, false, 255, this.field1263[var4]);
                        }
                        ++var3;
                    }
                    if (var5 == 2 && (this.field1341 == 0 || this.field1341 == 1 && this.method495(-20, this.field1262[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method194(4, var6, false, 0, this.field1262[var4] + ":");
                            var2.method194(12 + var2.method193(false, this.field1262[var4]), var6, false, 255, this.field1263[var4]);
                        }
                        ++var3;
                    }
                    if ((var5 == 3 || var5 == 7) && this.field1198 == 0 && (var5 == 7 || this.field1120 == 0 || this.field1120 == 1 && this.method495(-20, this.field1262[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method194(4, var6, false, 0, "From " + this.field1262[var4] + ":");
                            var2.method194(12 + var2.method193(false, "From " + this.field1262[var4]), var6, false, 8388608, this.field1263[var4]);
                        }
                        ++var3;
                    }
                    if (var5 == 4 && (this.field1250 == 0 || this.field1250 == 1 && this.method495(-20, this.field1262[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method194(4, var6, false, 8388736, this.field1262[var4] + " " + this.field1263[var4]);
                        }
                        ++var3;
                    }
                    if (var5 == 5 && this.field1198 == 0 && this.field1120 < 2) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method194(4, var6, false, 8388608, this.field1263[var4]);
                        }
                        ++var3;
                    }
                    if (var5 == 6 && this.field1198 == 0 && this.field1120 < 2) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method194(4, var6, false, 0, "To " + this.field1262[var4] + ":");
                            var2.method194(12 + var2.method193(false, "To " + this.field1262[var4]), var6, false, 8388608, this.field1263[var4]);
                        }
                        ++var3;
                    }
                    if (var5 == 8 && (this.field1250 == 0 || this.field1250 == 1 && this.method495(-20, this.field1262[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method194(4, var6, false, 13350793, this.field1262[var4] + " " + this.field1263[var4]);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method147(0);
            this.field1157 = var3 * 14 + 7;
            if (this.field1157 < 78) {
                this.field1157 = 78;
            }
            this.method407(this.field1168, 463, 0, this.field1157 - this.field1342 - 77, this.field1157, 77);
            var2.method194(4, 90, false, 0, JString.method262(0, this.field1431) + ":");
            var2.method194(6 + var2.method193(false, this.field1431 + ": "), 90, false, 255, this.field1502 + "*");
            Pix2D.method152(0, 0, 77, 479, 0);
        }
        if (this.field1244 && this.field1513 == 2) {
            this.method431(-961);
        }
        this.field1414.draw(375, super.graphics, 22, 5193);
        this.field1413.method242((byte) 62);
        Pix3D.field560 = this.field1102;
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)Z")
    public final boolean method493(boolean arg0) {
        if (arg0) {
            this.field1522 = null;
        }
        if (this.field1364 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1364.method31();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1145 == -1) {
                    this.field1364.method32(this.field1160.field621, 0, 1);
                    this.field1145 = this.field1160.field621[0] & 255;
                    if (this.field1118 != null) {
                        this.field1145 = this.field1145 - this.field1118.nextInt() & 255;
                    }
                    this.field1144 = Protocol.SERVERPROT_SIZES[this.field1145];
                    --var2;
                }
                if (this.field1144 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1364.method32(this.field1160.field621, 0, 1);
                    this.field1144 = this.field1160.field621[0] & 255;
                    --var2;
                }
                if (this.field1144 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1364.method32(this.field1160.field621, 0, 2);
                    this.field1160.field622 = 0;
                    this.field1144 = this.field1160.method218();
                    var2 -= 2;
                }
                if (var2 < this.field1144) {
                    return false;
                }
                this.field1160.field622 = 0;
                this.field1364.method32(this.field1160.field621, 0, this.field1144);
                this.field1146 = 0;
                this.field1195 = this.field1194;
                this.field1194 = this.field1193;
                this.field1193 = this.field1145;
                if (this.field1145 == 150) {
                    int var3 = this.field1160.method218();
                    byte var4 = this.field1160.method217();
                    this.field1440[var3] = var4;
                    if (this.field1303[var3] != var4) {
                        this.field1303[var3] = var4;
                        this.method418(var3, 49);
                        this.field1329 = true;
                        if (this.field1386 != -1) {
                            this.field1330 = true;
                        }
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 152) {
                    long var5 = this.field1160.method222(603);
                    int var7 = this.field1160.method216();
                    String var8 = JString.method262(0, JString.method259(var5, false));
                    for (int var9 = 0; var9 < this.field1454; ++var9) {
                        if (this.field1308[var9] == var5) {
                            if (this.field1138[var9] != var7) {
                                this.field1138[var9] = var7;
                                this.field1329 = true;
                                if (var7 > 0) {
                                    this.method468(5, var8 + " has logged in.", (byte) 4, "");
                                }
                                if (var7 == 0) {
                                    this.method468(5, var8 + " has logged out.", (byte) 4, "");
                                }
                            }
                            var8 = null;
                            break;
                        }
                    }
                    if (var8 != null && this.field1454 < 100) {
                        this.field1308[this.field1454] = var5;
                        this.field1492[this.field1454] = var8;
                        this.field1138[this.field1454] = var7;
                        ++this.field1454;
                        this.field1329 = true;
                    }
                    boolean var10 = false;
                    while (!var10) {
                        var10 = true;
                        for (int var11 = 0; var11 < this.field1454 - 1; ++var11) {
                            if (this.field1138[var11] != field1251 && this.field1138[var11 + 1] == field1251 || this.field1138[var11] == 0 && this.field1138[var11 + 1] != 0) {
                                int var12 = this.field1138[var11];
                                this.field1138[var11] = this.field1138[var11 + 1];
                                this.field1138[var11 + 1] = var12;
                                String var13 = this.field1492[var11];
                                this.field1492[var11] = this.field1492[var11 + 1];
                                this.field1492[var11 + 1] = var13;
                                long var14 = this.field1308[var11];
                                this.field1308[var11] = this.field1308[var11 + 1];
                                this.field1308[var11 + 1] = var14;
                                this.field1329 = true;
                                var10 = false;
                            }
                        }
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 43) {
                    this.field1322 = this.field1160.method218() * 30;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 80) {
                    int var16 = this.field1160.method216();
                    int var17 = this.field1160.method216();
                    int var18 = -1;
                    for (int var19 = 0; var19 < this.field1290.length; ++var19) {
                        if ((var16 << 8) + var17 == this.field1290[var19]) {
                            var18 = var19;
                        }
                    }
                    if (var18 != -1) {
                        signlink.cachesave("m" + var16 + "_" + var17, this.field1135[var18]);
                        this.field1443 = 1;
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 1) {
                    this.method404(this.field1160, this.field1144, false);
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 237) {
                    int var20 = this.field1160.method218();
                    int var21 = this.field1160.method218();
                    if (this.field1203 == var20 && this.field1204 == var21 && this.field1443 != 0) {
                        this.field1145 = -1;
                        return true;
                    }
                    this.field1203 = var20;
                    this.field1204 = var21;
                    this.field1126 = (this.field1203 - 6) * 8;
                    this.field1127 = (this.field1204 - 6) * 8;
                    this.field1443 = 1;
                    this.field1413.method242((byte) 62);
                    this.field1351.method191(151, (byte) 6, 0, "Loading - please wait.", 257);
                    this.field1351.method191(150, (byte) 6, 16777215, "Loading - please wait.", 256);
                    this.field1413.draw(11, super.graphics, 8, 5193);
                    signlink.looprate(5);
                    int var22 = (this.field1144 - 2) / 10;
                    this.field1135 = new byte[var22][];
                    this.field1365 = new byte[var22][];
                    this.field1290 = new int[var22];
                    this.field1163.method205((byte) -34, 150);
                    this.field1163.method206(0);
                    int var23 = 0;
                    for (int var24 = 0; var24 < var22; ++var24) {
                        int var25 = this.field1160.method216();
                        int var26 = this.field1160.method216();
                        int var27 = this.field1160.method221();
                        int var28 = this.field1160.method221();
                        this.field1290[var24] = (var25 << 8) + var26;
                        if (var27 != 0) {
                            byte[] var29 = signlink.cacheload("m" + var25 + "_" + var26);
                            if (var29 != null) {
                                this.field1361.reset();
                                this.field1361.update(var29);
                                if ((int) this.field1361.getValue() != var27) {
                                    var29 = null;
                                }
                            }
                            if (var29 != null) {
                                this.field1135[var24] = var29;
                            } else {
                                this.field1443 = 0;
                                this.field1163.method206(0);
                                this.field1163.method206(var25);
                                this.field1163.method206(var26);
                                var23 += 3;
                            }
                        }
                        if (var28 != 0) {
                            byte[] var30 = signlink.cacheload("l" + var25 + "_" + var26);
                            if (var30 != null) {
                                this.field1361.reset();
                                this.field1361.update(var30);
                                if ((int) this.field1361.getValue() != var28) {
                                    var30 = null;
                                }
                            }
                            if (var30 != null) {
                                this.field1365[var24] = var30;
                            } else {
                                this.field1443 = 0;
                                this.field1163.method206(1);
                                this.field1163.method206(var25);
                                this.field1163.method206(var26);
                                var23 += 3;
                            }
                        }
                    }
                    this.field1163.method215(0, var23);
                    signlink.looprate(50);
                    this.field1413.method242((byte) 62);
                    if (this.field1443 == 0) {
                        this.field1351.method191(166, (byte) 6, 0, "Map area updated since last visit, so load will take longer this time only", 257);
                        this.field1351.method191(165, (byte) 6, 16777215, "Map area updated since last visit, so load will take longer this time only", 256);
                    }
                    this.field1413.draw(11, super.graphics, 8, 5193);
                    int var31 = this.field1126 - this.field1128;
                    int var32 = this.field1127 - this.field1129;
                    this.field1128 = this.field1126;
                    this.field1129 = this.field1127;
                    for (int var33 = 0; var33 < 8192; ++var33) {
                        NpcEntity var34 = this.field1292[var33];
                        if (var34 != null) {
                            for (int var35 = 0; var35 < 10; ++var35) {
                                var34.field348[var35] -= var31;
                                var34.field349[var35] -= var32;
                            }
                            var34.field300 -= var31 * 128;
                            var34.field301 -= var32 * 128;
                        }
                    }
                    for (int var36 = 0; var36 < this.field1185; ++var36) {
                        PlayerEntity var37 = this.field1187[var36];
                        if (var37 != null) {
                            for (int var38 = 0; var38 < 10; ++var38) {
                                var37.field348[var38] -= var31;
                                var37.field349[var38] -= var32;
                            }
                            var37.field300 -= var31 * 128;
                            var37.field301 -= var32 * 128;
                        }
                    }
                    byte var39 = 0;
                    byte var40 = 104;
                    byte var41 = 1;
                    if (var31 < 0) {
                        var39 = 103;
                        var40 = -1;
                        var41 = -1;
                    }
                    byte var42 = 0;
                    byte var43 = 104;
                    byte var44 = 1;
                    if (var32 < 0) {
                        var42 = 103;
                        var43 = -1;
                        var44 = -1;
                    }
                    for (int var45 = var39; var40 != var45; var45 += var41) {
                        for (int var46 = var42; var43 != var46; var46 += var44) {
                            int var47 = var31 + var45;
                            int var48 = var32 + var46;
                            for (int var49 = 0; var49 < 4; ++var49) {
                                if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                                    this.field1522[var49][var45][var46] = this.field1522[var49][var47][var48];
                                } else {
                                    this.field1522[var49][var45][var46] = null;
                                }
                            }
                        }
                    }
                    for (LocMerged var50 = (LocMerged) this.field1249.method235(); var50 != null; var50 = (LocMerged) this.field1249.method237(551)) {
                        var50.field636 -= var31;
                        var50.field637 -= var32;
                        if (var50.field636 < 0 || var50.field637 < 0 || var50.field636 >= 104 || var50.field637 >= 104) {
                            var50.unlink();
                        }
                    }
                    if (this.field1416 != 0) {
                        this.field1416 -= var31;
                        this.field1417 -= var32;
                    }
                    this.field1333 = false;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 197) {
                    int var51 = this.field1160.method218();
                    Component.field959[var51].field1005 = this.field1332.method116(-718);
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 25) {
                    this.field1276 = this.field1160.method216();
                    if (this.field1276 == 1) {
                        this.field1166 = this.field1160.method218();
                    }
                    if (this.field1276 >= 2 && this.field1276 <= 6) {
                        if (this.field1276 == 2) {
                            this.field1113 = 64;
                            this.field1114 = 64;
                        }
                        if (this.field1276 == 3) {
                            this.field1113 = 0;
                            this.field1114 = 64;
                        }
                        if (this.field1276 == 4) {
                            this.field1113 = 128;
                            this.field1114 = 64;
                        }
                        if (this.field1276 == 5) {
                            this.field1113 = 64;
                            this.field1114 = 0;
                        }
                        if (this.field1276 == 6) {
                            this.field1113 = 64;
                            this.field1114 = 128;
                        }
                        this.field1276 = 2;
                        this.field1110 = this.field1160.method218();
                        this.field1111 = this.field1160.method218();
                        this.field1112 = this.field1160.method216();
                    }
                    if (this.field1276 == 10) {
                        this.field1441 = this.field1160.method218();
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 54) {
                    String var52 = this.field1160.method223();
                    int var53 = this.field1160.method221();
                    int var54 = this.field1160.method221();
                    if (!var52.equals(this.field1484) && this.field1200 && !field1254) {
                        this.method371(false, var53, var52, var54);
                    }
                    this.field1484 = var52;
                    this.field1475 = var53;
                    this.field1520 = var54;
                    this.field1109 = 0;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 142) {
                    this.method415(-780);
                    this.field1145 = -1;
                    return false;
                }
                if (this.field1145 == 20) {
                    int var55 = this.field1160.method216();
                    int var56 = this.field1160.method216();
                    int var57 = -1;
                    for (int var58 = 0; var58 < this.field1290.length; ++var58) {
                        if ((var55 << 8) + var56 == this.field1290[var58]) {
                            var57 = var58;
                        }
                    }
                    if (var57 != -1) {
                        signlink.cachesave("l" + var55 + "_" + var56, this.field1365[var57]);
                        this.field1443 = 1;
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 19) {
                    this.field1416 = 0;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 139) {
                    this.field1099 = this.field1160.method218();
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 151 || this.field1145 == 23 || this.field1145 == 50 || this.field1145 == 191 || this.field1145 == 69 || this.field1145 == 49 || this.field1145 == 223 || this.field1145 == 42 || this.field1145 == 76 || this.field1145 == 59) {
                    this.method379((byte) -45, this.field1160, this.field1145);
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 28) {
                    int var59 = this.field1160.method218();
                    int var60 = this.field1160.method218();
                    if (this.field1366 != -1) {
                        this.field1366 = -1;
                        this.field1330 = true;
                    }
                    if (this.field1420) {
                        this.field1420 = false;
                        this.field1330 = true;
                    }
                    this.field1336 = var59;
                    this.field1494 = var60;
                    this.field1329 = true;
                    this.field1445 = true;
                    this.field1237 = false;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 175) {
                    int var61 = this.field1160.method218();
                    int var62 = this.field1160.method221();
                    this.field1440[var61] = var62;
                    if (this.field1303[var61] != var62) {
                        this.field1303[var61] = var62;
                        this.method418(var61, 49);
                        this.field1329 = true;
                        if (this.field1386 != -1) {
                            this.field1330 = true;
                        }
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 146) {
                    int var63 = this.field1160.method218();
                    int var64 = this.field1160.method218();
                    Component.field959[var63].field1007 = var64;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 167) {
                    int var65 = this.field1160.method218();
                    int var66 = this.field1160.method216();
                    if (var65 == 65535) {
                        var65 = -1;
                    }
                    this.field1226[var66] = var65;
                    this.field1329 = true;
                    this.field1445 = true;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 220) {
                    int var67 = this.field1160.method216();
                    int var68 = this.field1160.method216();
                    int var69 = this.field1160.method218();
                    int var70 = this.field1160.method218();
                    int var71 = -1;
                    for (int var72 = 0; var72 < this.field1290.length; ++var72) {
                        if ((var67 << 8) + var68 == this.field1290[var72]) {
                            var71 = var72;
                        }
                    }
                    if (var71 != -1) {
                        if (this.field1365[var71] == null || this.field1365[var71].length != var70) {
                            this.field1365[var71] = new byte[var70];
                        }
                        this.field1160.method225(this.field1144 - 6, -110, var69, this.field1365[var71]);
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 133) {
                    Packet var73 = InputTracking.method37(854);
                    if (var73 != null) {
                        this.field1163.method205((byte) -34, 81);
                        this.field1163.method207(var73.field622);
                        this.field1163.method214(var73.field621, var73.field622, 0, (byte) -106);
                        var73.method204((byte) 8);
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 98) {
                    this.field1329 = true;
                    int var74 = this.field1160.method218();
                    Component var75 = Component.field959[var74];
                    int var76 = this.field1160.method216();
                    for (int var77 = 0; var77 < var76; ++var77) {
                        var75.field960[var77] = this.field1160.method218();
                        int var78 = this.field1160.method216();
                        if (var78 == 255) {
                            var78 = this.field1160.method221();
                        }
                        var75.field961[var77] = var78;
                    }
                    for (int var79 = var76; var79 < var75.field960.length; ++var79) {
                        var75.field960[var79] = 0;
                        var75.field961[var79] = 0;
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 226) {
                    InputTracking.method34(-31717);
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 243) {
                    this.field1234 = false;
                    this.field1420 = true;
                    this.field1149 = "";
                    this.field1330 = true;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 15) {
                    int var80 = this.field1160.method218();
                    Component var81 = Component.field959[var80];
                    for (int var82 = 0; var82 < var81.field960.length; ++var82) {
                        var81.field960[var82] = -1;
                        var81.field960[var82] = 0;
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 140) {
                    this.field1426 = this.field1160.method221();
                    this.field1238 = this.field1160.method218();
                    this.field1266 = this.field1160.method216();
                    this.field1419 = this.field1160.method218();
                    if (this.field1426 != 0 && this.field1336 == -1) {
                        signlink.dnslookup(JString.method261(-946, this.field1426));
                        this.method373((byte) -60);
                        short var83 = 650;
                        if (this.field1266 != 201) {
                            var83 = 655;
                        }
                        this.field1335 = "";
                        this.field1246 = false;
                        for (int var84 = 0; var84 < Component.field959.length; ++var84) {
                            if (Component.field959[var84] != null && Component.field959[var84].field968 == var83) {
                                this.field1336 = Component.field959[var84].field965;
                                break;
                            }
                        }
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 126) {
                    this.field1493 = this.field1160.method216();
                    if (this.field1493 == this.field1122) {
                        if (this.field1493 == 3) {
                            this.field1122 = 1;
                        } else {
                            this.field1122 = 3;
                        }
                        this.field1329 = true;
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 212) {
                    if (this.field1200 && !field1254) {
                        int var85 = this.field1160.method218();
                        int var86 = this.field1160.method221();
                        int var87 = this.field1144 - 6;
                        byte[] var88 = new byte[var86];
                        BZip2.read(var88, var86, this.field1160.field621, var87, this.field1160.field622);
                        this.method409(var88, 625, var86, false);
                        this.field1109 = var85;
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 254) {
                    this.field1349 = this.field1160.method216();
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 12) {
                    int var89 = this.field1160.method218();
                    int var90 = this.field1160.method216();
                    int var91 = this.field1160.method218();
                    if (this.field1518 && !field1254 && this.field1383 < 50) {
                        this.field1489[this.field1383] = var89;
                        this.field1174[this.field1383] = var90;
                        this.field1223[this.field1383] = Wave.field767[var89] + var91;
                        ++this.field1383;
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 204) {
                    int var92 = this.field1160.method218();
                    int var93 = this.field1160.method218();
                    NpcType var94 = NpcType.method288(var93);
                    Component.field959[var92].field1005 = var94.method291(false);
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 7) {
                    this.field1227 = this.field1160.method216();
                    this.field1228 = this.field1160.method216();
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 103) {
                    int var95 = this.field1160.method218();
                    int var96 = this.field1160.method218();
                    int var97 = this.field1160.method218();
                    Component var98 = Component.field959[var95];
                    Model var99 = var98.field1005;
                    if (var99 != null) {
                        var99.method134(var96, var97);
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 32) {
                    this.field1341 = this.field1160.method216();
                    this.field1120 = this.field1160.method216();
                    this.field1250 = this.field1160.method216();
                    this.field1286 = true;
                    this.field1330 = true;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 195) {
                    int var100 = this.field1160.method218();
                    this.method469(-321, var100);
                    if (this.field1366 != -1) {
                        this.field1366 = -1;
                        this.field1330 = true;
                    }
                    if (this.field1420) {
                        this.field1420 = false;
                        this.field1330 = true;
                    }
                    this.field1494 = var100;
                    this.field1329 = true;
                    this.field1445 = true;
                    this.field1336 = -1;
                    this.field1237 = false;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 14) {
                    int var101 = this.field1160.method218();
                    this.method469(-321, var101);
                    if (this.field1494 != -1) {
                        this.field1494 = -1;
                        this.field1329 = true;
                        this.field1445 = true;
                    }
                    this.field1366 = var101;
                    this.field1330 = true;
                    this.field1336 = -1;
                    this.field1237 = false;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 209) {
                    int var102 = this.field1160.method218();
                    int var103 = this.field1160.method219();
                    int var104 = this.field1160.method219();
                    Component var105 = Component.field959[var102];
                    var105.field971 = var103;
                    var105.field972 = var104;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 3) {
                    this.field1333 = true;
                    this.field1093 = this.field1160.method216();
                    this.field1094 = this.field1160.method216();
                    this.field1095 = this.field1160.method218();
                    this.field1096 = this.field1160.method216();
                    this.field1097 = this.field1160.method216();
                    if (this.field1097 >= 100) {
                        this.field1476 = this.field1093 * 128 + 64;
                        this.field1478 = this.field1094 * 128 + 64;
                        this.field1477 = this.method390(this.field1245, this.field1093, (byte) 5, this.field1094) - this.field1095;
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 135) {
                    this.field1227 = this.field1160.method216();
                    this.field1228 = this.field1160.method216();
                    for (int var106 = this.field1227; var106 < this.field1227 + 8; ++var106) {
                        for (int var107 = this.field1228; var107 < this.field1228 + 8; ++var107) {
                            if (this.field1522[this.field1245][var106][var107] != null) {
                                this.field1522[this.field1245][var106][var107] = null;
                                this.method480(var106, var107);
                            }
                        }
                    }
                    for (LocMerged var108 = (LocMerged) this.field1249.method235(); var108 != null; var108 = (LocMerged) this.field1249.method237(551)) {
                        if (var108.field636 >= this.field1227 && var108.field636 < this.field1227 + 8 && var108.field637 >= this.field1228 && var108.field637 < this.field1228 + 8 && this.field1245 == var108.field634) {
                            this.method456(var108.field642, var108.field636, var108.field637, var108.field635, var108.field641, var108.field643, -27819, var108.field634);
                            var108.unlink();
                        }
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 132) {
                    int var109 = this.field1160.method216();
                    int var110 = this.field1160.method216();
                    int var111 = this.field1160.method218();
                    int var112 = this.field1160.method218();
                    int var113 = -1;
                    for (int var114 = 0; var114 < this.field1290.length; ++var114) {
                        if ((var109 << 8) + var110 == this.field1290[var114]) {
                            var113 = var114;
                        }
                    }
                    if (var113 != -1) {
                        if (this.field1135[var113] == null || this.field1135[var113].length != var112) {
                            this.field1135[var113] = new byte[var112];
                        }
                        this.field1160.method225(this.field1144 - 6, -110, var111, this.field1135[var113]);
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 41) {
                    long var115 = this.field1160.method222(603);
                    int var117 = this.field1160.method221();
                    int var118 = this.field1160.method216();
                    boolean var119 = false;
                    for (int var120 = 0; var120 < 100; ++var120) {
                        if (this.field1243[var120] == var117) {
                            var119 = true;
                            break;
                        }
                    }
                    if (var118 <= 1) {
                        for (int var121 = 0; var121 < this.field1158; ++var121) {
                            if (this.field1133[var121] == var115) {
                                var119 = true;
                                break;
                            }
                        }
                    }
                    if (!var119 && this.field1167 == 0) {
                        try {
                            this.field1243[this.field1220] = var117;
                            this.field1220 = (this.field1220 + 1) % 100;
                            String var122 = WordPack.method265(this.field1160, 118, this.field1144 - 13);
                            String var123 = WordFilter.method343(var122, 0);
                            if (var118 > 1) {
                                this.method468(7, var123, (byte) 4, JString.method262(0, JString.method259(var115, false)));
                            } else {
                                this.method468(3, var123, (byte) 4, JString.method262(0, JString.method259(var115, false)));
                            }
                        } catch (Exception var182) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 193) {
                    for (int var125 = 0; var125 < this.field1303.length; ++var125) {
                        if (this.field1440[var125] != this.field1303[var125]) {
                            this.field1303[var125] = this.field1440[var125];
                            this.method418(var125, 49);
                            this.field1329 = true;
                        }
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 87) {
                    int var126 = this.field1160.method218();
                    int var127 = this.field1160.method218();
                    Component.field959[var126].field1005 = new Model(false, var127);
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 185) {
                    int var128 = this.field1160.method219();
                    this.field1386 = var128;
                    this.field1330 = true;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 68) {
                    if (this.field1122 == 12) {
                        this.field1329 = true;
                    }
                    this.field1437 = this.field1160.method216();
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 74) {
                    this.field1333 = true;
                    this.field1313 = this.field1160.method216();
                    this.field1314 = this.field1160.method216();
                    this.field1315 = this.field1160.method218();
                    this.field1316 = this.field1160.method216();
                    this.field1317 = this.field1160.method216();
                    if (this.field1317 >= 100) {
                        int var129 = this.field1313 * 128 + 64;
                        int var130 = this.field1314 * 128 + 64;
                        int var131 = this.method390(this.field1245, this.field1313, (byte) 5, this.field1314) - this.field1315;
                        int var132 = var129 - this.field1476;
                        int var133 = var131 - this.field1477;
                        int var134 = var130 - this.field1478;
                        int var135 = (int) Math.sqrt((double) (var132 * var132 + var134 * var134));
                        this.field1479 = (int) (Math.atan2((double) var133, (double) var135) * 325.949D) & 2047;
                        this.field1480 = (int) (Math.atan2((double) var132, (double) var134) * -325.949D) & 2047;
                        if (this.field1479 < 128) {
                            this.field1479 = 128;
                        }
                        if (this.field1479 > 383) {
                            this.field1479 = 383;
                        }
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 84) {
                    this.field1122 = this.field1160.method216();
                    this.field1329 = true;
                    this.field1445 = true;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 4) {
                    String var136 = this.field1160.method223();
                    if (var136.endsWith(":tradereq:")) {
                        String var137 = var136.substring(0, var136.indexOf(":"));
                        long var138 = JString.method258(var137);
                        boolean var140 = false;
                        for (int var141 = 0; var141 < this.field1158; ++var141) {
                            if (this.field1133[var141] == var138) {
                                var140 = true;
                                break;
                            }
                        }
                        if (!var140 && this.field1167 == 0) {
                            this.method468(4, "wishes to trade with you.", (byte) 4, var137);
                        }
                    } else if (!var136.endsWith(":duelreq:")) {
                        this.method468(0, var136, (byte) 4, "");
                    } else {
                        String var142 = var136.substring(0, var136.indexOf(":"));
                        long var143 = JString.method258(var142);
                        boolean var145 = false;
                        for (int var146 = 0; var146 < this.field1158; ++var146) {
                            if (this.field1133[var146] == var143) {
                                var145 = true;
                                break;
                            }
                        }
                        if (!var145 && this.field1167 == 0) {
                            this.method468(8, "wishes to duel with you.", (byte) 4, var142);
                        }
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 46) {
                    int var147 = this.field1160.method218();
                    int var148 = this.field1160.method218();
                    int var149 = this.field1160.method218();
                    ObjType var150 = ObjType.method294(var148);
                    Component.field959[var147].field1005 = var150.method298(50);
                    Component.field959[var147].field1010 = var150.field888;
                    Component.field959[var147].field1011 = var150.field889;
                    Component.field959[var147].field1009 = var150.field887 * 100 / var149;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 168) {
                    int var151 = this.field1160.method218();
                    this.method469(-321, var151);
                    if (this.field1494 != -1) {
                        this.field1494 = -1;
                        this.field1329 = true;
                        this.field1445 = true;
                    }
                    if (this.field1366 != -1) {
                        this.field1366 = -1;
                        this.field1330 = true;
                    }
                    if (this.field1420) {
                        this.field1420 = false;
                        this.field1330 = true;
                    }
                    this.field1336 = var151;
                    this.field1237 = false;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 2) {
                    int var152 = this.field1160.method218();
                    int var153 = this.field1160.method218();
                    int var154 = var153 >> 10 & 31;
                    int var155 = var153 >> 5 & 31;
                    int var156 = var153 & 31;
                    Component.field959[var152].field1000 = (var156 << 3) + (var154 << 19) + (var155 << 11);
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 136) {
                    for (int var157 = 0; var157 < this.field1187.length; ++var157) {
                        if (this.field1187[var157] != null) {
                            this.field1187[var157].field327 = -1;
                        }
                    }
                    for (int var158 = 0; var158 < this.field1292.length; ++var158) {
                        if (this.field1292[var158] != null) {
                            this.field1292[var158].field327 = -1;
                        }
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 26) {
                    int var159 = this.field1160.method218();
                    boolean var160 = this.field1160.method216() == 1;
                    Component.field959[var159].field979 = var160;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 21) {
                    this.field1158 = this.field1144 / 8;
                    for (int var161 = 0; var161 < this.field1158; ++var161) {
                        this.field1133[var161] = this.field1160.method222(603);
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 239) {
                    this.field1333 = false;
                    for (int var162 = 0; var162 < 5; ++var162) {
                        this.field1119[var162] = false;
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 129) {
                    if (this.field1494 != -1) {
                        this.field1494 = -1;
                        this.field1329 = true;
                        this.field1445 = true;
                    }
                    if (this.field1366 != -1) {
                        this.field1366 = -1;
                        this.field1330 = true;
                    }
                    if (this.field1420) {
                        this.field1420 = false;
                        this.field1330 = true;
                    }
                    this.field1336 = -1;
                    this.field1237 = false;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 201) {
                    int var163 = this.field1160.method218();
                    String var164 = this.field1160.method223();
                    Component.field959[var163].field998 = var164;
                    if (this.field1226[this.field1122] == Component.field959[var163].field965) {
                        this.field1329 = true;
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 44) {
                    this.field1329 = true;
                    int var165 = this.field1160.method216();
                    int var166 = this.field1160.method221();
                    int var167 = this.field1160.method216();
                    this.field1444[var165] = var166;
                    this.field1172[var165] = var167;
                    this.field1291[var165] = 1;
                    for (int var168 = 0; var168 < 98; ++var168) {
                        if (var166 >= field1229[var168]) {
                            this.field1291[var165] = var168 + 2;
                        }
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 162) {
                    this.field1227 = this.field1160.method216();
                    this.field1228 = this.field1160.method216();
                    while (this.field1160.field622 < this.field1144) {
                        int var169 = this.field1160.method216();
                        this.method379((byte) -45, this.field1160, var169);
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 22) {
                    if (this.field1122 == 12) {
                        this.field1329 = true;
                    }
                    this.field1134 = this.field1160.method219();
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 13) {
                    int var170 = this.field1160.method216();
                    int var171 = this.field1160.method216();
                    int var172 = this.field1160.method216();
                    int var173 = this.field1160.method216();
                    this.field1119[var170] = true;
                    this.field1324[var170] = var171;
                    this.field1331[var170] = var172;
                    this.field1524[var170] = var173;
                    this.field1389[var170] = 0;
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 213) {
                    this.field1329 = true;
                    int var174 = this.field1160.method218();
                    Component var175 = Component.field959[var174];
                    while (this.field1160.field622 < this.field1144) {
                        int var176 = this.field1160.method216();
                        int var177 = this.field1160.method218();
                        int var178 = this.field1160.method216();
                        if (var178 == 255) {
                            var178 = this.field1160.method221();
                        }
                        if (var176 >= 0 && var176 < var175.field960.length) {
                            var175.field960[var176] = var177;
                            var175.field961[var176] = var178;
                        }
                    }
                    this.field1145 = -1;
                    return true;
                }
                if (this.field1145 == 184) {
                    this.method466(this.field1160, this.field1144, 822);
                    if (this.field1443 == 1) {
                        this.field1443 = 2;
                        World.field37 = this.field1245;
                        this.method481(869);
                    }
                    if (field1254 && this.field1443 == 2 && World.field37 != this.field1245) {
                        this.field1413.method242((byte) 62);
                        this.field1351.method191(151, (byte) 6, 0, "Loading - please wait.", 257);
                        this.field1351.method191(150, (byte) 6, 16777215, "Loading - please wait.", 256);
                        this.field1413.draw(11, super.graphics, 8, 5193);
                        World.field37 = this.field1245;
                        this.method481(869);
                    }
                    if (this.field1245 != this.field1139 && this.field1443 == 2) {
                        this.field1139 = this.field1245;
                        this.method402(this.field1245, -153);
                    }
                    this.field1145 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1145 + "," + this.field1144 + " - " + this.field1194 + "," + this.field1195);
                this.method415(-780);
            } catch (IOException var183) {
                this.method478(false);
            } catch (Exception var184) {
                String var180 = "T2 - " + this.field1145 + "," + this.field1194 + "," + this.field1195 + " - " + this.field1144 + "," + (this.field1332.field348[0] + this.field1126) + "," + (this.field1332.field349[0] + this.field1127) + " - ";
                for (int var181 = 0; var181 < this.field1144 && var181 < 50; ++var181) {
                    var180 = var180 + this.field1160.field621[var181] + ",";
                }
                signlink.reporterror(var180);
                this.method415(-780);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(B)V")
    public final void method494(byte arg0) {
        this.field1411.method242((byte) 62);
        Pix3D.field560 = this.field1101;
        this.field1346.method189(0, 0, false);
        if (this.field1494 != -1) {
            this.method416(0, 0, 38682, Component.field959[this.field1494], 0);
        } else if (this.field1226[this.field1122] != -1) {
            this.method416(0, 0, 38682, Component.field959[this.field1226[this.field1122]], 0);
        }
        if (this.field1244 && this.field1513 == 1) {
            this.method431(-961);
        }
        this.field1411.draw(231, super.graphics, 562, 5193);
        if (arg0 == 2) {
            boolean var2 = false;
            this.field1413.method242((byte) 62);
            Pix3D.field560 = this.field1102;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method495(int arg0, String arg1) {
        while (arg0 >= 0) {
            this.field1163.method206(74);
        }
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1454; ++var3) {
                if (arg1.equalsIgnoreCase(this.field1492[var3])) {
                    return true;
                }
            }
            if (arg1.equalsIgnoreCase(this.field1332.field357)) {
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1251 = Integer.parseInt(this.getParameter("nodeid"));
        field1252 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method384(true);
        } else {
            method463(9);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1253 = false;
        } else {
            field1253 = true;
        }
        this.initApplet(532, false, 789);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIILkb;Lz;)V")
    private final void method496(boolean arg0, int arg1, int arg2, Packet arg3, PlayerEntity arg4) {
        if (!arg0) {
            this.field1214 = !this.field1214;
        }
        if ((arg2 & 1) == 1) {
            int var6 = arg3.method216();
            byte[] var7 = new byte[var6];
            Packet var8 = new Packet(363, var7);
            arg3.method225(var6, -110, 0, var7);
            this.field1192[arg1] = var8;
            arg4.method114(false, var8);
        }
        if ((arg2 & 2) == 2) {
            int var9 = arg3.method218();
            if (var9 == 65535) {
                var9 = -1;
            }
            if (arg4.field327 == var9) {
                arg4.field331 = 0;
            }
            int var10 = arg3.method216();
            if (var9 == -1 || arg4.field327 == -1 || SeqType.field1028[var9].field1036 > SeqType.field1028[arg4.field327].field1036 || SeqType.field1028[arg4.field327].field1036 == 0) {
                arg4.field327 = var9;
                arg4.field328 = 0;
                arg4.field329 = 0;
                arg4.field330 = var10;
                arg4.field331 = 0;
            }
        }
        if ((arg2 & 4) == 4) {
            arg4.field321 = arg3.method218();
            if (arg4.field321 == 65535) {
                arg4.field321 = -1;
            }
        }
        if ((arg2 & 8) == 8) {
            arg4.field312 = arg3.method223();
            arg4.field314 = 0;
            arg4.field315 = 0;
            arg4.field313 = 150;
            this.method468(2, arg4.field312, (byte) 4, arg4.field357);
        }
        if ((arg2 & 16) == 16) {
            arg4.field316 = arg3.method216();
            arg4.field317 = arg3.method216();
            arg4.field318 = field1320 + 400;
            arg4.field319 = arg3.method216();
            arg4.field320 = arg3.method216();
        }
        if ((arg2 & 32) == 32) {
            arg4.field322 = arg3.method218();
            arg4.field323 = arg3.method218();
        }
        if ((arg2 & 64) == 64) {
            int var11 = arg3.method218();
            int var12 = arg3.method216();
            int var13 = arg3.method216();
            int var14 = arg3.field622;
            if (arg4.field357 != null) {
                long var15 = JString.method258(arg4.field357);
                boolean var17 = false;
                if (var12 <= 1) {
                    for (int var18 = 0; var18 < this.field1158; ++var18) {
                        if (this.field1133[var18] == var15) {
                            var17 = true;
                            break;
                        }
                    }
                }
                if (!var17 && this.field1167 == 0) {
                    try {
                        String var19 = WordPack.method265(arg3, 118, var13);
                        String var20 = WordFilter.method343(var19, 0);
                        arg4.field312 = var20;
                        arg4.field314 = var11 >> 8;
                        arg4.field315 = var11 & 255;
                        arg4.field313 = 150;
                        if (var12 > 1) {
                            this.method468(1, var20, (byte) 4, arg4.field357);
                        } else {
                            this.method468(2, var20, (byte) 4, arg4.field357);
                        }
                    } catch (Exception var23) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg3.field622 = var13 + var14;
        }
        if ((arg2 & 256) == 256) {
            arg4.field332 = arg3.method218();
            int var22 = arg3.method221();
            arg4.field336 = var22 >> 16;
            arg4.field335 = (var22 & 65535) + field1320;
            arg4.field333 = 0;
            arg4.field334 = 0;
            if (arg4.field335 > field1320) {
                arg4.field333 = -1;
            }
            if (arg4.field332 == 65535) {
                arg4.field332 = -1;
            }
        }
        if ((arg2 & 512) == 512) {
            arg4.field337 = arg3.method216();
            arg4.field339 = arg3.method216();
            arg4.field338 = arg3.method216();
            arg4.field340 = arg3.method216();
            arg4.field341 = arg3.method218() + field1320;
            arg4.field342 = arg3.method218() + field1320;
            arg4.field343 = arg3.method216();
            arg4.field347 = 0;
            arg4.field348[0] = arg4.field338;
            arg4.field349[0] = arg4.field340;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public final void method13(boolean arg0, String arg1, int arg2) {
        this.method452((byte) 99);
        if (this.field1501 == null) {
            super.drawProgress(true, arg1, arg2);
        } else {
            this.field1396.method242((byte) 62);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1352.method191(var5 / 2 - 26 - var6, (byte) 6, 16777215, "RuneScape is loading - please wait...", var4 / 2);
            this.field1339 &= arg0;
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method151(3, var4 / 2 - 152, 9179409, 34, var7, 304);
            Pix2D.method151(3, var4 / 2 - 151, 0, 32, var7 + 1, 302);
            Pix2D.method150(var7 + 2, var4 / 2 - 150, 9179409, (byte) 93, arg2 * 3, 30);
            Pix2D.method150(var7 + 2, arg2 * 3 + (var4 / 2 - 150), 0, (byte) 93, 300 - arg2 * 3, 30);
            this.field1352.method191(var5 / 2 + 5 - var6, (byte) 6, 16777215, arg1, var4 / 2);
            this.field1396.draw(186, super.graphics, 214, 5193);
            if (this.field1116) {
                this.field1116 = false;
                if (!this.field1267) {
                    this.field1397.draw(0, super.graphics, 0, 5193);
                    this.field1398.draw(0, super.graphics, 661, 5193);
                }
                this.field1394.draw(0, super.graphics, 128, 5193);
                this.field1395.draw(386, super.graphics, 214, 5193);
                this.field1399.draw(265, super.graphics, 0, 5193);
                this.field1400.draw(265, super.graphics, 574, 5193);
                this.field1401.draw(186, super.graphics, 128, 5193);
                this.field1402.draw(186, super.graphics, 574, 5193);
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 225);
            if (arg0.length != 4) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
            } else {
                field1251 = Integer.parseInt(arg0[0]);
                field1252 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method384(true);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
                        return;
                    }
                    method463(9);
                }
                if (arg0[3].equals("free")) {
                    field1253 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
                        return;
                    }
                    field1253 = true;
                }
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.initApplication(532, 789, 0);
            }
        } catch (Exception var3) {
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field1229[var1] = var0 / 4;
        }
        field1235 = true;
        field1236 = 15;
        field1251 = 10;
        field1253 = true;
        field1264 = 629;
        field1287 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field1307 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field1323 = 3;
        field1427 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field1438 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field1481 = 3;
    }
}
