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

    @OriginalMember(owner = "client", name = "C", descriptor = "Z")
    private boolean field1090 = false;

    @OriginalMember(owner = "client", name = "E", descriptor = "I")
    private int field1092 = 2;

    @OriginalMember(owner = "client", name = "F", descriptor = "Z")
    private boolean field1093 = false;

    @OriginalMember(owner = "client", name = "M", descriptor = "Z")
    private boolean field1100 = false;

    @OriginalMember(owner = "client", name = "N", descriptor = "I")
    private int field1101 = -40687;

    @OriginalMember(owner = "client", name = "O", descriptor = "Z")
    private boolean field1102 = true;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field1103 = -710;

    @OriginalMember(owner = "client", name = "R", descriptor = "Lob;")
    private LinkList field1105 = new LinkList((byte) 3);

    @OriginalMember(owner = "client", name = "S", descriptor = "[B")
    private byte[] field1106 = new byte[16384];

    @OriginalMember(owner = "client", name = "Z", descriptor = "[Ljava/lang/String;")
    private String[] field1113 = new String[100];

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field1114 = 2048;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field1115 = 2047;

    @OriginalMember(owner = "client", name = "cb", descriptor = "[Lz;")
    private PlayerEntity[] field1116 = new PlayerEntity[this.field1114];

    @OriginalMember(owner = "client", name = "eb", descriptor = "[I")
    public int[] field1118 = new int[this.field1114];

    @OriginalMember(owner = "client", name = "gb", descriptor = "[I")
    private int[] field1120 = new int[this.field1114];

    @OriginalMember(owner = "client", name = "hb", descriptor = "[Lkb;")
    private Packet[] field1121 = new Packet[this.field1114];

    @OriginalMember(owner = "client", name = "ib", descriptor = "Z")
    private boolean field1122 = true;

    @OriginalMember(owner = "client", name = "jb", descriptor = "Z")
    private boolean field1123 = false;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field1134 = 2;

    @OriginalMember(owner = "client", name = "vb", descriptor = "Z")
    private boolean field1135 = false;

    @OriginalMember(owner = "client", name = "wb", descriptor = "Z")
    private boolean field1136 = true;

    @OriginalMember(owner = "client", name = "xb", descriptor = "Lob;")
    private LinkList field1137 = new LinkList((byte) 3);

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field1138 = -1;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "[Lec;")
    private CollisionMap[] field1140 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "Gb", descriptor = "[I")
    private int[] field1146 = new int[2000];

    @OriginalMember(owner = "client", name = "Jb", descriptor = "Ljava/lang/String;")
    private String field1149 = "";

    @OriginalMember(owner = "client", name = "Kb", descriptor = "Ljava/lang/String;")
    private String field1150 = "";

    @OriginalMember(owner = "client", name = "Lb", descriptor = "Z")
    private boolean field1151 = false;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "[I")
    private int[] field1153 = new int[5];

    @OriginalMember(owner = "client", name = "Pb", descriptor = "[Ljava/lang/String;")
    private String[] field1155 = new String[100];

    @OriginalMember(owner = "client", name = "Wb", descriptor = "[J")
    private long[] field1162 = new long[100];

    @OriginalMember(owner = "client", name = "Xb", descriptor = "[Z")
    private boolean[] field1163 = new boolean[5];

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field1164 = -34388;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "[I")
    private int[] field1165 = new int[100];

    @OriginalMember(owner = "client", name = "ac", descriptor = "[Lhb;")
    private Pix32[] field1166 = new Pix32[20];

    @OriginalMember(owner = "client", name = "lc", descriptor = "B")
    private byte field1177 = 106;

    @OriginalMember(owner = "client", name = "mc", descriptor = "[I")
    private int[] field1178 = new int[2000];

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field1184 = -1;

    @OriginalMember(owner = "client", name = "tc", descriptor = "Ljava/lang/String;")
    private String field1185 = "";

    @OriginalMember(owner = "client", name = "vc", descriptor = "[Ljava/lang/String;")
    private String[] field1187 = new String[100];

    @OriginalMember(owner = "client", name = "xc", descriptor = "[Ly;")
    private NpcEntity[] field1189 = new NpcEntity[8192];

    @OriginalMember(owner = "client", name = "zc", descriptor = "[I")
    public int[] field1191 = new int[8192];

    @OriginalMember(owner = "client", name = "Ec", descriptor = "Lkb;")
    private Packet field1196 = Packet.method195(1, 0);

    @OriginalMember(owner = "client", name = "Fc", descriptor = "Z")
    private boolean field1197 = false;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "[I")
    private final int[] field1199 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Ic", descriptor = "[I")
    private int[] field1200 = new int[5];

    @OriginalMember(owner = "client", name = "Mc", descriptor = "Ljava/lang/String;")
    private String field1204 = "";

    @OriginalMember(owner = "client", name = "Nc", descriptor = "[Lib;")
    private Pix8[] field1205 = new Pix8[50];

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field1207 = 978;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "[Lhb;")
    private Pix32[] field1208 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field1213 = 78;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "[[I")
    private int[][] field1217 = new int[104][104];

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field1228 = -1;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field1229 = -1;

    @OriginalMember(owner = "client", name = "nd", descriptor = "Z")
    private boolean field1231 = false;

    @OriginalMember(owner = "client", name = "td", descriptor = "Lob;")
    private LinkList field1237 = new LinkList((byte) 3);

    @OriginalMember(owner = "client", name = "ud", descriptor = "Z")
    private boolean field1238 = false;

    @OriginalMember(owner = "client", name = "wd", descriptor = "Z")
    private boolean field1240 = false;

    @OriginalMember(owner = "client", name = "xd", descriptor = "Ljava/lang/String;")
    private String field1241 = "";

    @OriginalMember(owner = "client", name = "Fd", descriptor = "[I")
    private int[] field1249 = new int[50];

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field1250 = -1;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "[I")
    private int[] field1255 = new int[100];

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private int field1258 = 2;

    @OriginalMember(owner = "client", name = "Td", descriptor = "[[[Lob;")
    private LinkList[][][] field1263 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "ee", descriptor = "Z")
    private boolean field1274 = false;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field1277 = 128;

    @OriginalMember(owner = "client", name = "ve", descriptor = "[Ljava/lang/String;")
    private String[] field1291 = new String[500];

    @OriginalMember(owner = "client", name = "xe", descriptor = "[I")
    private int[] field1293 = new int[33];

    @OriginalMember(owner = "client", name = "ye", descriptor = "Lob;")
    private LinkList field1294 = new LinkList((byte) 3);

    @OriginalMember(owner = "client", name = "ze", descriptor = "[I")
    private int[] field1295 = new int[5];

    @OriginalMember(owner = "client", name = "Ae", descriptor = "Z")
    private boolean field1296 = false;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field1297 = -73;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "B")
    private byte field1298 = 1;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "[I")
    private int[] field1300 = new int[50];

    @OriginalMember(owner = "client", name = "Fe", descriptor = "[I")
    private int[] field1301 = new int[256];

    @OriginalMember(owner = "client", name = "He", descriptor = "[I")
    private int[] field1303 = new int[151];

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field1304 = -1;

    @OriginalMember(owner = "client", name = "Je", descriptor = "Z")
    private boolean field1305 = false;

    @OriginalMember(owner = "client", name = "Le", descriptor = "[I")
    private int[] field1307 = new int[1000];

    @OriginalMember(owner = "client", name = "Me", descriptor = "[I")
    private int[] field1308 = new int[1000];

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field1313 = -1;

    @OriginalMember(owner = "client", name = "bf", descriptor = "B")
    private byte field1323 = 3;

    @OriginalMember(owner = "client", name = "df", descriptor = "[I")
    private int[] field1325 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field1326 = -710;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field1328 = 5063219;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field1329 = -1;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field1331 = 2301979;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Z")
    private boolean field1333 = false;

    @OriginalMember(owner = "client", name = "sf", descriptor = "Ljava/lang/String;")
    private String field1339 = "";

    @OriginalMember(owner = "client", name = "tf", descriptor = "Ljava/lang/String;")
    private String field1340 = "";

    @OriginalMember(owner = "client", name = "uf", descriptor = "Z")
    private boolean field1341 = false;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field1342 = 4;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field1348 = 1;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Z")
    private boolean field1351 = false;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "[Lib;")
    private Pix8[] field1352 = new Pix8[13];

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field1365 = 7759444;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "Z")
    private boolean field1366 = false;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1367 = new CRC32();

    @OriginalMember(owner = "client", name = "Xf", descriptor = "B")
    private byte field1370 = 5;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "Lkb;")
    private Packet field1371 = Packet.method195(1, 0);

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field1372 = 4;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field1379 = 50;

    @OriginalMember(owner = "client", name = "hg", descriptor = "[I")
    private int[] field1380 = new int[this.field1379];

    @OriginalMember(owner = "client", name = "ig", descriptor = "[I")
    private int[] field1381 = new int[this.field1379];

    @OriginalMember(owner = "client", name = "jg", descriptor = "[I")
    private int[] field1382 = new int[this.field1379];

    @OriginalMember(owner = "client", name = "kg", descriptor = "[I")
    private int[] field1383 = new int[this.field1379];

    @OriginalMember(owner = "client", name = "lg", descriptor = "[I")
    private int[] field1384 = new int[this.field1379];

    @OriginalMember(owner = "client", name = "mg", descriptor = "[I")
    private int[] field1385 = new int[this.field1379];

    @OriginalMember(owner = "client", name = "ng", descriptor = "[I")
    private int[] field1386 = new int[this.field1379];

    @OriginalMember(owner = "client", name = "og", descriptor = "[Ljava/lang/String;")
    private String[] field1387 = new String[this.field1379];

    @OriginalMember(owner = "client", name = "pg", descriptor = "[I")
    private int[] field1388 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field1390 = -1;

    @OriginalMember(owner = "client", name = "sg", descriptor = "Ljava/lang/String;")
    private String field1391 = "";

    @OriginalMember(owner = "client", name = "yg", descriptor = "[I")
    public int[] field1397 = new int[1000];

    @OriginalMember(owner = "client", name = "Ag", descriptor = "Z")
    private boolean field1399 = false;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "Lob;")
    private LinkList field1401 = new LinkList((byte) 3);

    @OriginalMember(owner = "client", name = "Dg", descriptor = "Z")
    private boolean field1402 = false;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "[I")
    private int[] field1403 = new int[50];

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field1406 = 3;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "Z")
    private boolean field1407 = false;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "Z")
    private boolean field1416 = true;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "[[I")
    private int[][] field1417 = new int[104][104];

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Z")
    private boolean field1422 = false;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "[I")
    private int[] field1423 = new int[5];

    @OriginalMember(owner = "client", name = "Zg", descriptor = "[I")
    private int[] field1424 = new int[50];

    @OriginalMember(owner = "client", name = "eh", descriptor = "Z")
    private boolean field1429 = false;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field1436 = -1;

    @OriginalMember(owner = "client", name = "oh", descriptor = "[I")
    private int[] field1439 = new int[4000];

    @OriginalMember(owner = "client", name = "ph", descriptor = "[I")
    private int[] field1440 = new int[4000];

    @OriginalMember(owner = "client", name = "qh", descriptor = "Z")
    private boolean field1441 = false;

    @OriginalMember(owner = "client", name = "sh", descriptor = "[Lhb;")
    private Pix32[] field1443 = new Pix32[8];

    @OriginalMember(owner = "client", name = "th", descriptor = "[[I")
    private int[][] field1444 = new int[104][104];

    @OriginalMember(owner = "client", name = "uh", descriptor = "[I")
    private int[] field1445 = new int[9];

    @OriginalMember(owner = "client", name = "Ah", descriptor = "[I")
    private int[] field1451 = new int[50];

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private final int field1452 = 100;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "[I")
    private int[] field1453 = new int[100];

    @OriginalMember(owner = "client", name = "Eh", descriptor = "Z")
    private boolean field1455 = false;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "[I")
    private int[] field1458 = new int[7];

    @OriginalMember(owner = "client", name = "Ih", descriptor = "[J")
    private long[] field1459 = new long[100];

    @OriginalMember(owner = "client", name = "Jh", descriptor = "Lhc;")
    private Component field1460 = new Component();

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field1461 = -1;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field1462 = -1;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "[I")
    private int[] field1464 = new int[151];

    @OriginalMember(owner = "client", name = "Oh", descriptor = "[I")
    private int[] field1465 = new int[5];

    @OriginalMember(owner = "client", name = "Rh", descriptor = "Z")
    private boolean field1468 = false;

    @OriginalMember(owner = "client", name = "Th", descriptor = "Lkb;")
    private Packet field1470 = Packet.method195(1, 0);

    @OriginalMember(owner = "client", name = "Uh", descriptor = "Z")
    private boolean field1471 = false;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field1474 = 3353893;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "[I")
    private int[] field1475 = new int[33];

    @OriginalMember(owner = "client", name = "fi", descriptor = "[Lhb;")
    private Pix32[] field1482 = new Pix32[20];

    @OriginalMember(owner = "client", name = "hi", descriptor = "Z")
    private boolean field1484 = false;

    @OriginalMember(owner = "client", name = "ii", descriptor = "B")
    private byte field1485 = 8;

    @OriginalMember(owner = "client", name = "li", descriptor = "[Lhb;")
    private Pix32[] field1488 = new Pix32[50];

    @OriginalMember(owner = "client", name = "mi", descriptor = "Ljava/lang/String;")
    private String field1489 = "";

    @OriginalMember(owner = "client", name = "ni", descriptor = "Z")
    private boolean field1490 = true;

    @OriginalMember(owner = "client", name = "oi", descriptor = "[I")
    private int[] field1491 = new int[50];

    @OriginalMember(owner = "client", name = "wi", descriptor = "Z")
    private boolean field1499 = true;

    @OriginalMember(owner = "client", name = "xi", descriptor = "[I")
    private int[] field1500 = new int[500];

    @OriginalMember(owner = "client", name = "yi", descriptor = "[I")
    private int[] field1501 = new int[500];

    @OriginalMember(owner = "client", name = "zi", descriptor = "[I")
    private int[] field1502 = new int[500];

    @OriginalMember(owner = "client", name = "Ai", descriptor = "[I")
    private int[] field1503 = new int[500];

    @OriginalMember(owner = "client", name = "Bi", descriptor = "Z")
    private boolean field1504 = true;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field1505 = 49437;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "[[I")
    public static final int[][] field1194 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "Dc", descriptor = "B")
    private static byte field1195 = 6;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "[I")
    private static int[] field1201 = new int[99];

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private static int field1211;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    private static int field1264;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "Z")
    private static boolean field1266;

    @OriginalMember(owner = "client", name = "pe", descriptor = "[I")
    public static final int[] field1285;

    @OriginalMember(owner = "client", name = "lf", descriptor = "Z")
    private static boolean field1332;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "Z")
    private static boolean field1400;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private static int field1415;

    @OriginalMember(owner = "client", name = "zh", descriptor = "Ljava/lang/String;")
    private static String field1450;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1469;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1472;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private static int field1506;

    @OriginalMember(owner = "client", name = "D", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "client", name = "G", descriptor = "I")
    private int field1094;

    @OriginalMember(owner = "client", name = "H", descriptor = "I")
    private int field1095;

    @OriginalMember(owner = "client", name = "I", descriptor = "I")
    private int field1096;

    @OriginalMember(owner = "client", name = "J", descriptor = "I")
    private int field1097;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field1098;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field1099;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private static int field1104;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field1107;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field1108;

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field1109;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field1110;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field1111;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field1112;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private int field1117;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field1119;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field1133;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field1139;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field1147;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    private static int field1152;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "I")
    private int field1154;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field1157;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field1159;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field1160;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field1167;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field1168;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1169;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field1170;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field1172;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field1173;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field1174;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private static int field1175;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field1176;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private static int field1186;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field1188;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field1190;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field1192;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private static int field1202;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field1203;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private static int field1206;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field1209;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field1210;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field1215;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private static int field1216;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field1218;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field1219;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field1221;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field1222;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field1223;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field1230;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field1232;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field1234;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field1235;

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field1236;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field1242;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field1243;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "I")
    private static int field1244;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field1248;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private static int field1254;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private static int field1265;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field1268;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field1270;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field1271;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private static int field1273;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field1275;

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field1280;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private int field1281;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field1282;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field1292;

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field1309;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field1314;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field1315;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "I")
    private int field1316;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field1317;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field1319;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field1321;

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field1324;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client", name = "pf", descriptor = "I")
    private int field1336;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field1337;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field1338;

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "I")
    private int field1353;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    private int field1376;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private static int field1377;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field1378;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private static int field1389;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field1394;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field1396;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private static int field1414;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field1419;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field1420;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field1434;

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field1447;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field1448;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field1456;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private static int field1463;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field1476;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field1478;

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private static int field1493;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field1496;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field1507;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "J")
    private long field1408;

    @OriginalMember(owner = "client", name = "nh", descriptor = "J")
    private long field1438;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "J")
    private long field1466;

    @OriginalMember(owner = "client", name = "fh", descriptor = "Ld;")
    private ClientStream field1430;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "Ltb;")
    private Isaac field1369;

    @OriginalMember(owner = "client", name = "ge", descriptor = "Lub;")
    private Jagfile field1276;

    @OriginalMember(owner = "client", name = "nc", descriptor = "Lhb;")
    private Pix32 field1179;

    @OriginalMember(owner = "client", name = "oc", descriptor = "Lhb;")
    private Pix32 field1180;

    @OriginalMember(owner = "client", name = "Df", descriptor = "Lhb;")
    private Pix32 field1350;

    @OriginalMember(owner = "client", name = "tg", descriptor = "Lhb;")
    private Pix32 field1392;

    @OriginalMember(owner = "client", name = "ug", descriptor = "Lhb;")
    private Pix32 field1393;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "Lhb;")
    private Pix32 field1421;

    @OriginalMember(owner = "client", name = "ah", descriptor = "Lhb;")
    private Pix32 field1425;

    @OriginalMember(owner = "client", name = "bh", descriptor = "Lhb;")
    private Pix32 field1426;

    @OriginalMember(owner = "client", name = "ch", descriptor = "Lhb;")
    private Pix32 field1427;

    @OriginalMember(owner = "client", name = "dh", descriptor = "Lhb;")
    private Pix32 field1428;

    @OriginalMember(owner = "client", name = "gi", descriptor = "Lhb;")
    private Pix32 field1483;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "Lib;")
    private Pix8 field1141;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "Lib;")
    private Pix8 field1142;

    @OriginalMember(owner = "client", name = "Db", descriptor = "Lib;")
    private Pix8 field1143;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Lib;")
    private Pix8 field1144;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "Lib;")
    private Pix8 field1145;

    @OriginalMember(owner = "client", name = "pc", descriptor = "Lib;")
    private Pix8 field1181;

    @OriginalMember(owner = "client", name = "qc", descriptor = "Lib;")
    private Pix8 field1182;

    @OriginalMember(owner = "client", name = "rc", descriptor = "Lib;")
    private Pix8 field1183;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "Lib;")
    private Pix8 field1251;

    @OriginalMember(owner = "client", name = "Id", descriptor = "Lib;")
    private Pix8 field1252;

    @OriginalMember(owner = "client", name = "qe", descriptor = "Lib;")
    private Pix8 field1286;

    @OriginalMember(owner = "client", name = "re", descriptor = "Lib;")
    private Pix8 field1287;

    @OriginalMember(owner = "client", name = "se", descriptor = "Lib;")
    private Pix8 field1288;

    @OriginalMember(owner = "client", name = "te", descriptor = "Lib;")
    private Pix8 field1289;

    @OriginalMember(owner = "client", name = "ue", descriptor = "Lib;")
    private Pix8 field1290;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "Lib;")
    private Pix8 field1310;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "Lib;")
    private Pix8 field1311;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "Lib;")
    private Pix8 field1312;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "Lib;")
    private Pix8 field1404;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "Lib;")
    private Pix8 field1405;

    @OriginalMember(owner = "client", name = "wf", descriptor = "Ljb;")
    private PixFont field1343;

    @OriginalMember(owner = "client", name = "xf", descriptor = "Ljb;")
    private PixFont field1344;

    @OriginalMember(owner = "client", name = "yf", descriptor = "Ljb;")
    private PixFont field1345;

    @OriginalMember(owner = "client", name = "zf", descriptor = "Ljb;")
    private PixFont field1346;

    @OriginalMember(owner = "client", name = "kb", descriptor = "Lqb;")
    private PixMap field1124;

    @OriginalMember(owner = "client", name = "lb", descriptor = "Lqb;")
    private PixMap field1125;

    @OriginalMember(owner = "client", name = "mb", descriptor = "Lqb;")
    private PixMap field1126;

    @OriginalMember(owner = "client", name = "nb", descriptor = "Lqb;")
    private PixMap field1127;

    @OriginalMember(owner = "client", name = "ob", descriptor = "Lqb;")
    private PixMap field1128;

    @OriginalMember(owner = "client", name = "pb", descriptor = "Lqb;")
    private PixMap field1129;

    @OriginalMember(owner = "client", name = "qb", descriptor = "Lqb;")
    private PixMap field1130;

    @OriginalMember(owner = "client", name = "rb", descriptor = "Lqb;")
    private PixMap field1131;

    @OriginalMember(owner = "client", name = "sb", descriptor = "Lqb;")
    private PixMap field1132;

    @OriginalMember(owner = "client", name = "gd", descriptor = "Lqb;")
    private PixMap field1224;

    @OriginalMember(owner = "client", name = "hd", descriptor = "Lqb;")
    private PixMap field1225;

    @OriginalMember(owner = "client", name = "id", descriptor = "Lqb;")
    private PixMap field1226;

    @OriginalMember(owner = "client", name = "If", descriptor = "Lqb;")
    private PixMap field1355;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "Lqb;")
    private PixMap field1356;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "Lqb;")
    private PixMap field1357;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "Lqb;")
    private PixMap field1358;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "Lqb;")
    private PixMap field1359;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "Lqb;")
    private PixMap field1360;

    @OriginalMember(owner = "client", name = "Of", descriptor = "Lqb;")
    private PixMap field1361;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "Lqb;")
    private PixMap field1362;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "Lqb;")
    private PixMap field1363;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "Lqb;")
    private PixMap field1364;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "Lqb;")
    private PixMap field1409;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "Lqb;")
    private PixMap field1410;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "Lqb;")
    private PixMap field1411;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "Lqb;")
    private PixMap field1412;

    @OriginalMember(owner = "client", name = "ki", descriptor = "Lz;")
    private PlayerEntity field1487;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "Lr;")
    private World3D field1148;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "Ljava/lang/String;")
    public String field1161;

    @OriginalMember(owner = "client", name = "fc", descriptor = "Ljava/lang/String;")
    public String field1171;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "Ljava/lang/String;")
    private String field1193;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "Ljava/lang/String;")
    private String field1198;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "Z")
    private static boolean field1267;

    @OriginalMember(owner = "client", name = "rh", descriptor = "Z")
    private static boolean field1442;

    @OriginalMember(owner = "client", name = "vd", descriptor = "[B")
    private byte[] field1239;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "[I")
    private int[] field1246;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "[I")
    private int[] field1247;

    @OriginalMember(owner = "client", name = "Md", descriptor = "[I")
    private int[] field1256;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "[I")
    private int[] field1257;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "[I")
    private int[] field1259;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[I")
    private int[] field1260;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "[I")
    private int[] field1261;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "[I")
    private int[] field1262;

    @OriginalMember(owner = "client", name = "ag", descriptor = "[I")
    private int[] field1373;

    @OriginalMember(owner = "client", name = "bg", descriptor = "[I")
    private int[] field1374;

    @OriginalMember(owner = "client", name = "cg", descriptor = "[I")
    private int[] field1375;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "[I")
    private int[] field1418;

    @OriginalMember(owner = "client", name = "ff", descriptor = "[Lib;")
    private Pix8[] field1327;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "[[B")
    private byte[][] field1156;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "[[B")
    private byte[][] field1214;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "[[[B")
    private byte[][][] field1302;

    @OriginalMember(owner = "client", name = "zg", descriptor = "[[[I")
    private int[][][] field1398;

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIILhc;)V")
    public final void method362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Component arg6) {
        if (arg3 != 0) {
            this.field1432 = this.field1371.method208();
        }
        if (arg6.field962 == 0 && arg6.field976 != null && !arg6.field975) {
            if (arg2 >= arg5 && arg0 >= arg1 && arg2 <= arg6.field965 + arg5 && arg0 <= arg6.field966 + arg1) {
                int var8 = arg6.field976.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg6.field977[var9] + arg5;
                    int var11 = arg6.field978[var9] + arg1 - arg4;
                    Component var12 = Component.field955[arg6.field976[var9]];
                    int var13 = var12.field967 + var10;
                    int var14 = var12.field968 + var11;
                    if ((var12.field972 >= 0 || var12.field998 != 0) && arg2 >= var13 && arg0 >= var14 && arg2 < var12.field965 + var13 && arg0 < var12.field966 + var14) {
                        if (var12.field972 >= 0) {
                            this.field1212 = var12.field972;
                        } else {
                            this.field1212 = var12.field960;
                        }
                    }
                    if (var12.field962 == 0) {
                        this.method362(arg0, var14, arg2, 0, var12.field974, var13, var12);
                        if (var12.field973 > var12.field966) {
                            this.method465(true, arg0, 0, var12, var14, var12.field965 + var13, var12.field973, var12.field966, arg2);
                        }
                    } else {
                        if (var12.field963 == 1 && arg2 >= var13 && arg0 >= var14 && arg2 < var12.field965 + var13 && arg0 < var12.field966 + var14) {
                            this.field1291[this.field1139] = var12.field1011;
                            this.field1502[this.field1139] = 238;
                            this.field1501[this.field1139] = var12.field960;
                            ++this.field1139;
                        }
                        if (var12.field963 == 2 && this.field1158 == 0 && arg2 >= var13 && arg0 >= var14 && arg2 < var12.field965 + var13 && arg0 < var12.field966 + var14) {
                            String var15 = var12.field1008;
                            if (var15.indexOf(" ") != -1) {
                                var15 = var15.substring(0, var15.indexOf(" "));
                            }
                            this.field1291[this.field1139] = var15 + " @gre@" + var12.field1009;
                            this.field1502[this.field1139] = 409;
                            this.field1501[this.field1139] = var12.field960;
                            ++this.field1139;
                        }
                        if (var12.field963 == 3 && arg2 >= var13 && arg0 >= var14 && arg2 < var12.field965 + var13 && arg0 < var12.field966 + var14) {
                            this.field1291[this.field1139] = "Close";
                            this.field1502[this.field1139] = 975;
                            this.field1501[this.field1139] = var12.field960;
                            ++this.field1139;
                        }
                        if (var12.field963 == 4 && arg2 >= var13 && arg0 >= var14 && arg2 < var12.field965 + var13 && arg0 < var12.field966 + var14) {
                            this.field1291[this.field1139] = var12.field1011;
                            this.field1502[this.field1139] = 261;
                            this.field1501[this.field1139] = var12.field960;
                            ++this.field1139;
                        }
                        if (var12.field963 == 5 && arg2 >= var13 && arg0 >= var14 && arg2 < var12.field965 + var13 && arg0 < var12.field966 + var14) {
                            this.field1291[this.field1139] = var12.field1011;
                            this.field1502[this.field1139] = 779;
                            this.field1501[this.field1139] = var12.field960;
                            ++this.field1139;
                        }
                        if (var12.field963 == 6 && !this.field1123 && arg2 >= var13 && arg0 >= var14 && arg2 < var12.field965 + var13 && arg0 < var12.field966 + var14) {
                            this.field1291[this.field1139] = var12.field1011;
                            this.field1502[this.field1139] = 785;
                            this.field1501[this.field1139] = var12.field960;
                            ++this.field1139;
                        }
                        if (var12.field962 == 2) {
                            int var16 = 0;
                            for (int var17 = 0; var17 < var12.field966; ++var17) {
                                for (int var18 = 0; var18 < var12.field965; ++var18) {
                                    int var19 = (var12.field984 + 32) * var18 + var13;
                                    int var20 = (var12.field985 + 32) * var17 + var14;
                                    if (var16 < 20) {
                                        var19 += var12.field987[var16];
                                        var20 += var12.field988[var16];
                                    }
                                    if (arg2 >= var19 && arg0 >= var20 && arg2 < var19 + 32 && arg0 < var20 + 32) {
                                        this.field1314 = var16;
                                        this.field1315 = var12.field960;
                                        if (var12.field956[var16] > 0) {
                                            ObjType var21 = ObjType.method286(var12.field956[var16] - 1);
                                            if (this.field1167 == 1 && var12.field982) {
                                                if (this.field1169 != var12.field960 || this.field1168 != var16) {
                                                    this.field1291[this.field1139] = "Use " + this.field1171 + " with @lre@" + var21.field884;
                                                    this.field1502[this.field1139] = 278;
                                                    this.field1503[this.field1139] = var21.field882;
                                                    this.field1500[this.field1139] = var16;
                                                    this.field1501[this.field1139] = var12.field960;
                                                    ++this.field1139;
                                                }
                                            } else if (this.field1158 == 1 && var12.field982) {
                                                if ((this.field1160 & 16) == 16) {
                                                    this.field1291[this.field1139] = this.field1161 + " @lre@" + var21.field884;
                                                    this.field1502[this.field1139] = 45;
                                                    this.field1503[this.field1139] = var21.field882;
                                                    this.field1500[this.field1139] = var16;
                                                    this.field1501[this.field1139] = var12.field960;
                                                    ++this.field1139;
                                                }
                                            } else {
                                                if (var12.field982) {
                                                    for (int var22 = 4; var22 >= 3; --var22) {
                                                        if (var21.field900 != null && var21.field900[var22] != null) {
                                                            this.field1291[this.field1139] = var21.field900[var22] + " @lre@" + var21.field884;
                                                            if (var22 == 3) {
                                                                this.field1502[this.field1139] = 274;
                                                            }
                                                            if (var22 == 4) {
                                                                this.field1502[this.field1139] = 618;
                                                            }
                                                            this.field1503[this.field1139] = var21.field882;
                                                            this.field1500[this.field1139] = var16;
                                                            this.field1501[this.field1139] = var12.field960;
                                                            ++this.field1139;
                                                        } else if (var22 == 4) {
                                                            this.field1291[this.field1139] = "Drop @lre@" + var21.field884;
                                                            this.field1502[this.field1139] = 618;
                                                            this.field1503[this.field1139] = var21.field882;
                                                            this.field1500[this.field1139] = var16;
                                                            this.field1501[this.field1139] = var12.field960;
                                                            ++this.field1139;
                                                        }
                                                    }
                                                }
                                                if (var12.field983) {
                                                    this.field1291[this.field1139] = "Use @lre@" + var21.field884;
                                                    this.field1502[this.field1139] = 215;
                                                    this.field1503[this.field1139] = var21.field882;
                                                    this.field1500[this.field1139] = var16;
                                                    this.field1501[this.field1139] = var12.field960;
                                                    ++this.field1139;
                                                }
                                                if (var12.field982 && var21.field900 != null) {
                                                    for (int var23 = 2; var23 >= 0; --var23) {
                                                        if (var21.field900[var23] != null) {
                                                            this.field1291[this.field1139] = var21.field900[var23] + " @lre@" + var21.field884;
                                                            if (var23 == 0) {
                                                                this.field1502[this.field1139] = 382;
                                                            }
                                                            if (var23 == 1) {
                                                                this.field1502[this.field1139] = 635;
                                                            }
                                                            if (var23 == 2) {
                                                                this.field1502[this.field1139] = 939;
                                                            }
                                                            this.field1503[this.field1139] = var21.field882;
                                                            this.field1500[this.field1139] = var16;
                                                            this.field1501[this.field1139] = var12.field960;
                                                            ++this.field1139;
                                                        }
                                                    }
                                                }
                                                if (var12.field989 != null) {
                                                    for (int var24 = 4; var24 >= 0; --var24) {
                                                        if (var12.field989[var24] != null) {
                                                            this.field1291[this.field1139] = var12.field989[var24] + " @lre@" + var21.field884;
                                                            if (var24 == 0) {
                                                                this.field1502[this.field1139] = 71;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1502[this.field1139] = 897;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1502[this.field1139] = 500;
                                                            }
                                                            if (var24 == 3) {
                                                                this.field1502[this.field1139] = 837;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field1502[this.field1139] = 460;
                                                            }
                                                            this.field1503[this.field1139] = var21.field882;
                                                            this.field1500[this.field1139] = var16;
                                                            this.field1501[this.field1139] = var12.field960;
                                                            ++this.field1139;
                                                        }
                                                    }
                                                }
                                                this.field1291[this.field1139] = "Examine @lre@" + var21.field884;
                                                this.field1502[this.field1139] = 1654;
                                                this.field1503[this.field1139] = var21.field882;
                                                this.field1501[this.field1139] = var12.field957[var16];
                                                ++this.field1139;
                                            }
                                        }
                                    }
                                    ++var16;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method363(byte arg0) {
        this.field1240 = false;
        while (this.field1422) {
            this.field1240 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1251 = null;
        this.field1252 = null;
        if (this.field1323 != arg0) {
            this.field1263 = null;
        }
        this.field1327 = null;
        this.field1259 = null;
        this.field1260 = null;
        this.field1261 = null;
        this.field1262 = null;
        this.field1256 = null;
        this.field1257 = null;
        this.field1246 = null;
        this.field1247 = null;
        this.field1392 = null;
        this.field1393 = null;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method364(byte arg0) {
        if (arg0 != 8) {
            this.field1432 = -1;
        }
        LocType.field840.method103();
        LocType.field841.method103();
        NpcType.field871.method103();
        ObjType.field915.method103();
        ObjType.field916.method103();
        PlayerEntity.field380.method103();
        SpotAnimType.field1055.method103();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg6 & 2047;
        int var9 = 2048 - arg5 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg2;
        if (var8 != 0) {
            int var13 = Model.field525[var8];
            int var14 = Model.field526[var8];
            int var15 = var11 * var14 - arg2 * var13 >> 16;
            var12 = var11 * var13 + arg2 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field525[var9];
            int var17 = Model.field526[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1094 = arg3 - var10;
        this.field1095 = arg4 - var11;
        if (arg0 < 5 || arg0 > 5) {
            this.field1263 = null;
        }
        this.field1096 = arg1 - var12;
        this.field1097 = arg6;
        this.field1098 = arg5;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)V")
    public final void method366(byte arg0, int arg1) {
        Component var3 = Component.field955[arg1];
        for (int var4 = 0; var4 < var3.field976.length && var3.field976[var4] != -1; ++var4) {
            Component var5 = Component.field955[var3.field976[var4]];
            if (var5.field962 == 1) {
                this.method366((byte) 125, var5.field960);
            }
            var5.field958 = 0;
            var5.field959 = 0;
        }
        if (arg0 != 125) {
            this.field1263 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method367(int arg0, int arg1) {
        LinkList var3 = this.field1263[this.field1354][arg0][arg1];
        if (var3 == null) {
            this.field1148.method75(this.field1354, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method227(); var6 != null; var6 = (ObjStackEntity) var3.method229(this.field1485)) {
                ObjType var16 = ObjType.method286(var6.field299);
                int var17 = var16.field897;
                if (var16.field896) {
                    var17 = (var6.field300 + 1) * var17;
                }
                if (var17 > var4) {
                    var4 = var17;
                    var5 = var6;
                }
            }
            var3.method225(var5, 828);
            int var7 = -1;
            int var8 = -1;
            int var9 = 0;
            int var10 = 0;
            for (ObjStackEntity var11 = (ObjStackEntity) var3.method227(); var11 != null; var11 = (ObjStackEntity) var3.method229(this.field1485)) {
                if (var5.field299 != var11.field299 && var7 == -1) {
                    var7 = var11.field299;
                    var9 = var11.field300;
                }
                if (var5.field299 != var11.field299 && var11.field299 != var7 && var8 == -1) {
                    var8 = var11.field299;
                    var10 = var11.field300;
                }
            }
            Model var12 = null;
            if (var7 != -1) {
                var12 = ObjType.method286(var7).method290(var9);
            }
            Model var13 = null;
            if (var8 != -1) {
                var13 = ObjType.method286(var8).method290(var10);
            }
            int var14 = (arg1 << 7) + arg0 + 1610612736;
            ObjType var15 = ObjType.method286(var5.field299);
            this.field1148.method57(this.method419(this.field1354, arg0 * 128 + 64, 0, arg1 * 128 + 64), arg1, (byte) 4, var13, this.field1354, var12, var14, arg0, var15.method290(var5.field300));
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method368(boolean arg0) {
        try {
            this.field1390 = -1;
            this.field1401.method231();
            this.field1105.method231();
            this.field1294.method231();
            this.field1237.method231();
            Pix3D.method155(false);
            this.method364((byte) 8);
            this.field1148.method50((byte) 9);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1140[var2].method294(652);
            }
            System.gc();
            World var3 = new World(104, this.field1302, this.field1398, 104, 27245);
            byte[] var4 = new byte[100000];
            int var5 = this.field1156.length;
            World.field35 = World3D.field222;
            for (int var6 = 0; var6 < var5; ++var6) {
                int var7 = this.field1418[var6] >> 8;
                int var8 = this.field1418[var6] & 255;
                if (var7 == 33 && var8 >= 71 && var8 <= 73) {
                    World.field35 = false;
                }
            }
            if (World.field35) {
                this.field1148.method51(474, this.field1354);
            } else {
                this.field1148.method51(474, 0);
            }
            this.field1196.method197(4, 186);
            for (int var9 = 0; var9 < var5; ++var9) {
                int var10 = (this.field1418[var9] >> 8) * 64 - this.field1108;
                int var11 = (this.field1418[var9] & 255) * 64 - this.field1109;
                byte[] var12 = this.field1156[var9];
                if (var12 != null) {
                    int var13 = (new Packet(var12, field1332)).method213();
                    BZip2.method237(var4, var13, var12, var12.length - 4, 4);
                    var3.method15((byte) 3, var4, var11, (this.field1322 - 6) * 8, (this.field1321 - 6) * 8, var10);
                } else if (this.field1322 < 800) {
                    var3.method14(var11, 64, var10, 595, 64);
                }
            }
            this.field1196.method197(4, 186);
            for (int var14 = 0; var14 < var5; ++var14) {
                byte[] var15 = this.field1214[var14];
                if (var15 != null) {
                    int var16 = (new Packet(var15, field1332)).method213();
                    BZip2.method237(var4, var16, var15, var15.length - 4, 4);
                    int var17 = (this.field1418[var14] >> 8) * 64 - this.field1108;
                    int var18 = (this.field1418[var14] & 255) * 64 - this.field1109;
                    var3.method16(var17, (byte) 50, this.field1140, var4, this.field1105, this.field1148, var18);
                }
            }
            this.field1196.method197(4, 186);
            var3.method18(this.field1148, this.field1140, true);
            this.field1411.method234(0);
            this.field1196.method197(4, 186);
            for (LocEntity var19 = (LocEntity) this.field1105.method227(); var19 != null; var19 = (LocEntity) this.field1105.method229(this.field1485)) {
                if ((this.field1302[1][var19.field655][var19.field656] & 2) == 2) {
                    --var19.field653;
                    if (var19.field653 < 0) {
                        var19.method106();
                    }
                }
            }
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method367(var20, var21);
                }
            }
            for (LocMerged var22 = (LocMerged) this.field1137.method227(); var22 != null; var22 = (LocMerged) this.field1137.method229(this.field1485)) {
                this.method455(true, var22.field636, var22.field639, var22.field635, var22.field634, var22.field638, var22.field637, var22.field640);
            }
        } catch (Exception var24) {
        }
        LocType.field840.method103();
        if (!arg0) {
            System.gc();
            Pix3D.method156(20, 0);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method369(int arg0, int arg1) {
        if (arg0 != -48200) {
            this.field1196.method198(16);
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B[BI)Z")
    public final boolean method370(byte arg0, byte[] arg1, int arg2) {
        if (arg0 != 79) {
            this.field1263 = null;
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg2);
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method371(int arg0) {
        for (int var2 = 0; var2 < this.field1190; ++var2) {
            NpcEntity var3 = this.field1189[this.field1191[var2]];
            int var4 = (this.field1191[var2] << 14) + 536870912;
            if (var3 != null && var3.method110(false)) {
                int var5 = var3.field304 >> 7;
                int var6 = var3.field305 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field308 == 1 && (var3.field304 & 127) == 64 && (var3.field305 & 127) == 64) {
                        if (this.field1217[var5][var6] == this.field1188) {
                            continue;
                        }
                        this.field1217[var5][var6] = this.field1188;
                    }
                    this.field1148.method61(var3.field306, 775, var3, (Model) null, var4, var3.field304, var3.field307, (var3.field308 - 1) * 64 + 60, this.field1354, var3.field305, this.method419(this.field1354, var3.field304, 0, var3.field305));
                }
            }
        }
        while (arg0 >= 0) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method372(int arg0, int arg1) {
        int var3 = VarpType.field1060[arg1].field1068;
        if (var3 != 0) {
            int var4 = this.field1178[arg1];
            if (arg0 <= 0) {
                this.field1432 = -1;
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    Pix3D.method161(0.9D, 0);
                }
                if (var4 == 2) {
                    Pix3D.method161(0.8D, 0);
                }
                if (var4 == 3) {
                    Pix3D.method161(0.7D, 0);
                }
                if (var4 == 4) {
                    Pix3D.method161(0.6D, 0);
                }
                ObjType.field916.method103();
                this.field1296 = true;
            }
            if (var3 == 2) {
                if (var4 == 0) {
                    this.field1490 = true;
                    signlink.jinglevol = 0;
                }
                if (var4 == 1) {
                    this.field1490 = true;
                    signlink.jinglevol = -400;
                }
                if (var4 == 2) {
                    this.field1490 = true;
                    signlink.jinglevol = -800;
                }
                if (var4 == 3) {
                    this.field1490 = true;
                    signlink.jinglevol = -1200;
                }
                if (var4 == 4) {
                    this.field1490 = false;
                }
            }
            if (var3 == 3) {
                boolean var5 = this.field1499;
                int var6 = signlink.musicvol;
                if (var4 == 0) {
                    this.field1499 = true;
                    signlink.musicvol = 0;
                }
                if (var4 == 1) {
                    this.field1499 = true;
                    signlink.musicvol = -400;
                }
                if (var4 == 2) {
                    this.field1499 = true;
                    signlink.musicvol = -800;
                }
                if (var4 == 3) {
                    this.field1499 = true;
                    signlink.musicvol = -1200;
                }
                if (var4 == 4) {
                    this.field1499 = false;
                }
                if (this.field1499 != var5 || signlink.musicvol != var6) {
                    if (this.field1499) {
                        this.method417(this.field1193, 0);
                    } else {
                        this.method417("null", 0);
                    }
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field1102 = true;
                    signlink.wavevol = 0;
                }
                if (var4 == 1) {
                    this.field1102 = true;
                    signlink.wavevol = -400;
                }
                if (var4 == 2) {
                    this.field1102 = true;
                    signlink.wavevol = -800;
                }
                if (var4 == 3) {
                    this.field1102 = true;
                    signlink.wavevol = -1200;
                }
                if (var4 == 4) {
                    this.field1102 = false;
                }
            }
            if (var3 == 5) {
                this.field1353 = var4;
            }
            if (var3 == 6) {
                this.field1330 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method373(int arg0) {
        for (int var2 = -1; var2 < this.field1117; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field1115;
            } else {
                var3 = this.field1118[var2];
            }
            PlayerEntity var4 = this.field1116[var3];
            if (var4 != null) {
                this.method382(0, var4, 1);
            }
        }
        if (arg0 != 22801) {
            field1211 = 214;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method374(boolean arg0) {
        if (arg0) {
            if (this.field1336 == 0) {
                this.field1291[0] = "Cancel";
                this.field1502[0] = 1033;
                this.field1139 = 1;
                this.field1212 = 0;
                if (super.field19 > 8 && super.field20 > 11 && super.field19 < 520 && super.field20 < 345) {
                    if (this.field1250 != -1) {
                        this.method362(super.field20, 11, super.field19, 0, 0, 8, Component.field955[this.field1250]);
                    } else {
                        this.method451(false);
                    }
                }
                if (this.field1212 != this.field1203) {
                    this.field1203 = this.field1212;
                }
                this.field1212 = 0;
                if (super.field19 > 562 && super.field20 > 231 && super.field19 < 752 && super.field20 < 492) {
                    if (this.field1138 != -1) {
                        this.method362(super.field20, 231, super.field19, 0, 0, 562, Component.field955[this.field1138]);
                    } else if (this.field1388[this.field1406] != -1) {
                        this.method362(super.field20, 231, super.field19, 0, 0, 562, Component.field955[this.field1388[this.field1406]]);
                    }
                }
                if (this.field1454 != this.field1212) {
                    this.field1238 = true;
                    this.field1454 = this.field1212;
                }
                this.field1212 = 0;
                if (super.field19 > 22 && super.field20 > 375 && super.field19 < 501 && super.field20 < 471 && this.field1184 != -1) {
                    this.method362(super.field20, 375, super.field19, 0, 0, 22, Component.field955[this.field1184]);
                }
                if (this.field1184 != -1 && this.field1481 != this.field1212) {
                    this.field1399 = true;
                    this.field1481 = this.field1212;
                }
                boolean var2 = false;
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field1139 - 1; ++var3) {
                        if (this.field1502[var3] < 1000 && this.field1502[var3 + 1] > 1000) {
                            String var4 = this.field1291[var3];
                            this.field1291[var3] = this.field1291[var3 + 1];
                            this.field1291[var3 + 1] = var4;
                            int var5 = this.field1502[var3];
                            this.field1502[var3] = this.field1502[var3 + 1];
                            this.field1502[var3 + 1] = var5;
                            int var6 = this.field1500[var3];
                            this.field1500[var3] = this.field1500[var3 + 1];
                            this.field1500[var3 + 1] = var6;
                            int var7 = this.field1501[var3];
                            this.field1501[var3] = this.field1501[var3 + 1];
                            this.field1501[var3 + 1] = var7;
                            int var8 = this.field1503[var3];
                            this.field1503[var3] = this.field1503[var3 + 1];
                            this.field1503[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public final void method375(int arg0, int arg1, String arg2, String arg3) {
        if (arg1 == 0 && this.field1313 != -1) {
            this.field1198 = arg2;
            super.field21 = 0;
        }
        if (this.field1184 == -1) {
            this.field1399 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1255[var5] = this.field1255[var5 - 1];
            this.field1113[var5] = this.field1113[var5 - 1];
            this.field1187[var5] = this.field1187[var5 - 1];
        }
        if (arg0 <= 0) {
            this.field1432 = this.field1371.method208();
        }
        this.field1255[0] = arg1;
        this.field1113[0] = arg3;
        this.field1187[0] = arg2;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLkb;)V")
    private final void method376(int arg0, boolean arg1, Packet arg2) {
        if (arg1) {
            this.field1432 = arg2.method208();
        }
        while (arg2.field623 + 21 < arg0 * 8) {
            int var4 = arg2.method219(7, 13);
            if (var4 == 8191) {
                break;
            }
            if (this.field1189[var4] == null) {
                this.field1189[var4] = new NpcEntity();
            }
            NpcEntity var5 = this.field1189[var4];
            this.field1191[this.field1190++] = var4;
            var5.field348 = field1446;
            var5.field357 = NpcType.method280(arg2.method219(7, 11));
            var5.field308 = var5.field357.field852;
            var5.field311 = var5.field357.field856;
            var5.field312 = var5.field357.field857;
            var5.field313 = var5.field357.field858;
            var5.field314 = var5.field357.field859;
            var5.field309 = var5.field357.field855;
            int var6 = arg2.method219(7, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg2.method219(7, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            var5.method108(this.field1297, this.field1487.field352[0] + var6, this.field1487.field353[0] + var7, false);
            int var8 = arg2.method219(7, 1);
            if (var8 == 1) {
                this.field1120[this.field1119++] = var4;
            }
        }
        arg2.method220(-714);
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field15 != null) {
                    return new URL("http://127.0.0.1:" + (field1265 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method377(int arg0) {
        if (this.field1124 == null) {
            super.field13 = null;
            this.field1412 = null;
            this.field1410 = null;
            this.field1409 = null;
            this.field1411 = null;
            this.field1224 = null;
            this.field1225 = null;
            this.field1226 = null;
            this.field1127 = new PixMap(this.method11((byte) 9), 128, 265, true);
            Pix2D.method147(true);
            this.field1128 = new PixMap(this.method11((byte) 9), 128, 265, true);
            Pix2D.method147(true);
            this.field1124 = new PixMap(this.method11((byte) 9), 533, 186, true);
            Pix2D.method147(true);
            this.field1125 = new PixMap(this.method11((byte) 9), 360, 146, true);
            Pix2D.method147(true);
            this.field1126 = new PixMap(this.method11((byte) 9), 360, 200, true);
            Pix2D.method147(true);
            this.field1129 = new PixMap(this.method11((byte) 9), 214, 267, true);
            Pix2D.method147(true);
            this.field1130 = new PixMap(this.method11((byte) 9), 215, 267, true);
            Pix2D.method147(true);
            this.field1131 = new PixMap(this.method11((byte) 9), 86, 79, true);
            Pix2D.method147(true);
            while (arg0 >= 0) {
                this.field1432 = -1;
            }
            this.field1132 = new PixMap(this.method11((byte) 9), 87, 79, true);
            Pix2D.method147(true);
            if (this.field1276 != null) {
                this.method463((byte) 106);
                this.method409(688);
            }
            this.field1296 = true;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method378(byte arg0) {
        int var2 = this.field1487.field304 + this.field1133;
        int var3 = this.field1487.field305 + this.field1091;
        if (this.field1447 - var2 < -500 || this.field1447 - var2 > 500 || this.field1448 - var3 < -500 || this.field1448 - var3 > 500) {
            this.field1447 = var2;
            this.field1448 = var3;
        }
        if (this.field1447 != var2) {
            this.field1447 += (var2 - this.field1447) / 16;
        }
        if (this.field1448 != var3) {
            this.field1448 += (var3 - this.field1448) / 16;
        }
        if (super.field24[1] == 1) {
            this.field1279 += (-24 - this.field1279) / 2;
        } else if (super.field24[2] == 1) {
            this.field1279 += (24 - this.field1279) / 2;
        } else {
            this.field1279 /= 2;
        }
        if (super.field24[3] == 1) {
            this.field1280 += (12 - this.field1280) / 2;
        } else if (super.field24[4] == 1) {
            this.field1280 += (-12 - this.field1280) / 2;
        } else {
            this.field1280 /= 2;
        }
        this.field1278 = this.field1279 / 2 + this.field1278 & 2047;
        this.field1277 += this.field1280 / 2;
        if (this.field1277 < 128) {
            this.field1277 = 128;
        }
        if (this.field1277 > 383) {
            this.field1277 = 383;
        }
        int var4 = this.field1447 >> 7;
        int var5 = this.field1448 >> 7;
        int var6 = this.method419(this.field1354, this.field1447, 0, this.field1448);
        int var7 = 0;
        if (arg0 == 5) {
            boolean var8 = false;
        } else {
            this.field1432 = -1;
        }
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var9 = var4 - 4; var9 <= var4 + 4; ++var9) {
                for (int var10 = var5 - 4; var10 <= var5 + 4; ++var10) {
                    int var11 = this.field1354;
                    if (var11 < 3 && (this.field1302[1][var9][var10] & 2) == 2) {
                        ++var11;
                    }
                    int var12 = var6 - this.field1398[var11][var9][var10];
                    if (var12 > var7) {
                        var7 = var12;
                    }
                }
            }
        }
        ++field1389;
        if (field1389 > 77) {
            field1389 = 0;
            this.field1196.method197(4, 156);
        }
        int var13 = var7 * 192;
        if (var13 > 98048) {
            var13 = 98048;
        }
        if (var13 < 32768) {
            var13 = 32768;
        }
        if (var13 > this.field1107) {
            this.field1107 += (var13 - this.field1107) / 24;
        } else if (var13 < this.field1107) {
            this.field1107 += (var13 - this.field1107) / 80;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)Z")
    public final boolean method379(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg4 >> 14 & 32767;
        int var7 = this.field1148.method80(this.field1354, arg3, arg0, arg4);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            while (arg2 >= 0) {
                field1506 = this.field1369.method245();
            }
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method434(false, arg0, this.field1487.field352[0], 0, 0, this.field1487.field353[0], var9, var8 + 1, this.field1151, 0, arg3);
            } else {
                LocType var10 = LocType.method274(var6);
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
                this.method434(false, arg0, this.field1487.field352[0], var12, var11, this.field1487.field353[0], 0, 0, this.field1151, var13, arg3);
            }
            this.field1232 = super.field22;
            this.field1233 = super.field23;
            this.field1235 = 2;
            this.field1234 = 0;
            this.field1196.method197(4, arg1);
            this.field1196.method199(this.field1108 + arg3);
            this.field1196.method199(this.field1109 + arg0);
            this.field1196.method199(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method380(int arg0, int arg1) {
        int[] var3 = this.field1421.field579;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var14 = (103 - var6) * 512 * 4 + 24628;
            for (int var15 = 1; var15 < 103; ++var15) {
                if ((this.field1302[arg1][var15][var6] & 24) == 0) {
                    this.field1148.method85(var3, var14, 512, arg1, var15, var6);
                }
                if (arg1 < 3 && (this.field1302[arg1 + 1][var15][var6] & 8) != 0) {
                    this.field1148.method85(var3, var14, 512, arg1 + 1, var15, var6);
                }
                var14 += 4;
            }
        }
        this.field1421.method169(0);
        for (int var7 = 1; var7 < 103; ++var7) {
            for (int var13 = 1; var13 < 103; ++var13) {
                if ((this.field1302[arg1][var13][var7] & 24) == 0) {
                    this.method445(arg1, var7, var13, 702);
                }
                if (arg1 < 3 && (this.field1302[arg1 + 1][var13][var7] & 8) != 0) {
                    this.method445(arg1 + 1, var7, var13, 702);
                }
            }
        }
        this.field1411.method234(0);
        this.field1306 = 0;
        if (arg0 != 6) {
            this.field1263 = null;
        }
        for (int var8 = 0; var8 < 104; ++var8) {
            for (int var9 = 0; var9 < 104; ++var9) {
                int var10 = this.field1148.method79(this.field1354, var8, var9);
                if (var10 != 0) {
                    int var11 = var10 >> 14 & 32767;
                    int var12 = LocType.method274(var11).field828;
                    if (var12 >= 0) {
                        this.field1208[this.field1306] = this.field1488[var12];
                        this.field1307[this.field1306] = var8;
                        this.field1308[this.field1306] = var9;
                        ++this.field1306;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method381(byte arg0) {
        for (int var2 = 0; var2 < this.field1190; ++var2) {
            int var5 = this.field1191[var2];
            NpcEntity var6 = this.field1189[var5];
            if (var6 != null) {
                this.method382(0, var6, var6.field357.field852);
            }
        }
        if (arg0 == 5) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILx;I)V")
    public final void method382(int arg0, PathingEntity arg1, int arg2) {
        if (arg1.field304 < 128 || arg1.field305 < 128 || arg1.field304 >= 13184 || arg1.field305 >= 13184) {
            arg1.field331 = -1;
            arg1.field336 = -1;
            arg1.field345 = 0;
            arg1.field346 = 0;
            arg1.field304 = arg1.field352[0] * 128 + arg1.field308 * 64;
            arg1.field305 = arg1.field353[0] * 128 + arg1.field308 * 64;
            arg1.field351 = 0;
        }
        if (this.field1487 == arg1 && (arg1.field304 < 1536 || arg1.field305 < 1536 || arg1.field304 >= 11776 || arg1.field305 >= 11776)) {
            arg1.field331 = -1;
            arg1.field336 = -1;
            arg1.field345 = 0;
            arg1.field346 = 0;
            arg1.field304 = arg1.field352[0] * 128 + arg1.field308 * 64;
            arg1.field305 = arg1.field353[0] * 128 + arg1.field308 * 64;
            arg1.field351 = 0;
        }
        if (arg1.field345 > field1446) {
            this.method383(arg1, 2);
        } else if (arg1.field346 >= field1446) {
            this.method384((byte) 1, arg1);
        } else {
            this.method385(-484, arg1);
        }
        this.method386(arg1, 6);
        this.field1431 += arg0;
        this.method387(true, arg1);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lx;I)V")
    public final void method383(PathingEntity arg0, int arg1) {
        int var3 = arg0.field345 - field1446;
        int var4 = arg0.field341 * 128 + arg0.field308 * 64;
        int var5 = arg0.field343 * 128 + arg0.field308 * 64;
        arg0.field304 += (var4 - arg0.field304) / var3;
        arg0.field305 += (var5 - arg0.field305) / var3;
        if (arg1 < 2 || arg1 > 2) {
            this.field1263 = null;
        }
        arg0.field355 = 0;
        if (arg0.field347 == 0) {
            arg0.field350 = 1024;
        }
        if (arg0.field347 == 1) {
            arg0.field350 = 1536;
        }
        if (arg0.field347 == 2) {
            arg0.field350 = 0;
        }
        if (arg0.field347 == 3) {
            arg0.field350 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLx;)V")
    public final void method384(byte arg0, PathingEntity arg1) {
        if (field1446 == arg1.field346 || arg1.field331 == -1 || arg1.field334 != 0 || arg1.field333 + 1 > SeqType.field1026[arg1.field331].field1030[arg1.field332]) {
            int var3 = arg1.field346 - arg1.field345;
            int var4 = field1446 - arg1.field345;
            int var5 = arg1.field341 * 128 + arg1.field308 * 64;
            int var6 = arg1.field343 * 128 + arg1.field308 * 64;
            int var7 = arg1.field342 * 128 + arg1.field308 * 64;
            int var8 = arg1.field344 * 128 + arg1.field308 * 64;
            arg1.field304 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field305 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field355 = 0;
        if (arg0 == 1) {
            boolean var9 = false;
        } else {
            this.field1196.method198(254);
        }
        if (arg1.field347 == 0) {
            arg1.field350 = 1024;
        }
        if (arg1.field347 == 1) {
            arg1.field350 = 1536;
        }
        if (arg1.field347 == 2) {
            arg1.field350 = 0;
        }
        if (arg1.field347 == 3) {
            arg1.field350 = 512;
        }
        arg1.field306 = arg1.field350;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILx;)V")
    public final void method385(int arg0, PathingEntity arg1) {
        arg1.field328 = arg1.field309;
        if (arg1.field351 == 0) {
            arg1.field355 = 0;
        } else {
            if (arg1.field331 != -1 && arg1.field334 == 0) {
                SeqType var3 = SeqType.field1026[arg1.field331];
                if (var3.field1032 == null) {
                    ++arg1.field355;
                    return;
                }
            }
            int var4 = arg1.field304;
            int var5 = arg1.field305;
            int var6 = arg1.field352[arg1.field351 - 1] * 128 + arg1.field308 * 64;
            int var7 = arg1.field353[arg1.field351 - 1] * 128 + arg1.field308 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field350 = 1280;
                    } else if (var5 > var7) {
                        arg1.field350 = 1792;
                    } else {
                        arg1.field350 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field350 = 768;
                    } else if (var5 > var7) {
                        arg1.field350 = 256;
                    } else {
                        arg1.field350 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field350 = 1024;
                } else {
                    arg1.field350 = 0;
                }
                int var8 = arg1.field350 - arg1.field306 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field312;
                if (arg0 < 0) {
                    if (var8 >= -256 && var8 <= 256) {
                        var9 = arg1.field311;
                    } else if (var8 >= 256 && var8 < 768) {
                        var9 = arg1.field314;
                    } else if (var8 >= -768 && var8 <= -256) {
                        var9 = arg1.field313;
                    }
                    if (var9 == -1) {
                        var9 = arg1.field311;
                    }
                    arg1.field328 = var9;
                    int var10 = 4;
                    if (arg1.field350 != arg1.field306 && arg1.field325 == -1) {
                        var10 = 2;
                    }
                    if (arg1.field351 > 2) {
                        var10 = 6;
                    }
                    if (arg1.field351 > 3) {
                        var10 = 8;
                    }
                    if (arg1.field355 > 0 && arg1.field351 > 1) {
                        var10 = 8;
                        --arg1.field355;
                    }
                    if (arg1.field354[arg1.field351 - 1]) {
                        var10 <<= 1;
                    }
                    if (var10 >= 8 && arg1.field328 == arg1.field311 && arg1.field315 != -1) {
                        arg1.field328 = arg1.field315;
                    }
                    if (var4 < var6) {
                        arg1.field304 += var10;
                        if (arg1.field304 > var6) {
                            arg1.field304 = var6;
                        }
                    } else if (var4 > var6) {
                        arg1.field304 -= var10;
                        if (arg1.field304 < var6) {
                            arg1.field304 = var6;
                        }
                    }
                    if (var5 < var7) {
                        arg1.field305 += var10;
                        if (arg1.field305 > var7) {
                            arg1.field305 = var7;
                        }
                    } else if (var5 > var7) {
                        arg1.field305 -= var10;
                        if (arg1.field305 < var7) {
                            arg1.field305 = var7;
                        }
                    }
                    if (arg1.field304 == var6 && arg1.field305 == var7) {
                        --arg1.field351;
                    }
                }
            } else {
                arg1.field304 = var6;
                arg1.field305 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lx;I)V")
    public final void method386(PathingEntity arg0, int arg1) {
        if (arg1 != 6) {
            this.field1263 = null;
        }
        if (arg0.field325 != -1 && arg0.field325 < 32768) {
            NpcEntity var3 = this.field1189[arg0.field325];
            if (var3 != null) {
                int var4 = arg0.field304 - var3.field304;
                int var5 = arg0.field305 - var3.field305;
                if (var4 != 0 || var5 != 0) {
                    arg0.field350 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                }
            }
        }
        if (arg0.field325 >= 32768) {
            int var6 = arg0.field325 - 32768;
            if (this.field1329 == var6) {
                var6 = this.field1115;
            }
            PlayerEntity var7 = this.field1116[var6];
            if (var7 != null) {
                int var8 = arg0.field304 - var7.field304;
                int var9 = arg0.field305 - var7.field305;
                if (var8 != 0 || var9 != 0) {
                    arg0.field350 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                }
            }
        }
        if ((arg0.field326 != 0 || arg0.field327 != 0) && (arg0.field351 == 0 || arg0.field355 > 0)) {
            int var10 = arg0.field304 - (arg0.field326 - this.field1108 - this.field1108) * 64;
            int var11 = arg0.field305 - (arg0.field327 - this.field1109 - this.field1109) * 64;
            if (var10 != 0 || var11 != 0) {
                arg0.field350 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
            }
            arg0.field326 = 0;
            arg0.field327 = 0;
        }
        int var12 = arg0.field350 - arg0.field306 & 2047;
        if (var12 != 0) {
            if (var12 >= 32 && var12 <= 2016) {
                if (var12 > 1024) {
                    arg0.field306 -= 32;
                } else {
                    arg0.field306 += 32;
                }
            } else {
                arg0.field306 = arg0.field350;
            }
            arg0.field306 &= 2047;
            if (arg0.field328 == arg0.field309 && arg0.field350 != arg0.field306) {
                if (arg0.field310 != -1) {
                    arg0.field328 = arg0.field310;
                    return;
                }
                arg0.field328 = arg0.field311;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLx;)V")
    public final void method387(boolean arg0, PathingEntity arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        arg1.field307 = false;
        if (arg1.field328 != -1) {
            SeqType var4 = SeqType.field1026[arg1.field328];
            ++arg1.field330;
            if (arg1.field329 < var4.field1027 && arg1.field330 > var4.field1030[arg1.field329]) {
                arg1.field330 = 0;
                ++arg1.field329;
            }
            if (arg1.field329 >= var4.field1027) {
                arg1.field330 = 0;
                arg1.field329 = 0;
            }
        }
        if (arg1.field331 != -1 && arg1.field334 == 0) {
            SeqType var5 = SeqType.field1026[arg1.field331];
            ++arg1.field333;
            while (arg1.field332 < var5.field1027 && arg1.field333 > var5.field1030[arg1.field332]) {
                arg1.field333 -= var5.field1030[arg1.field332];
                ++arg1.field332;
            }
            if (arg1.field332 >= var5.field1027) {
                arg1.field332 -= var5.field1031;
                ++arg1.field335;
                if (arg1.field335 >= var5.field1037) {
                    arg1.field331 = -1;
                }
                if (arg1.field332 < 0 || arg1.field332 >= var5.field1027) {
                    arg1.field331 = -1;
                }
            }
            arg1.field307 = var5.field1033;
        }
        if (arg1.field334 > 0) {
            --arg1.field334;
        }
        if (arg1.field336 != -1 && field1446 >= arg1.field339) {
            if (arg1.field337 < 0) {
                arg1.field337 = 0;
            }
            SeqType var6 = SpotAnimType.field1043[arg1.field336].field1046;
            ++arg1.field338;
            while (arg1.field337 < var6.field1027 && arg1.field338 > var6.field1030[arg1.field337]) {
                arg1.field338 -= var6.field1030[arg1.field337];
                ++arg1.field337;
            }
            if (arg1.field337 >= var6.field1027) {
                if (arg1.field337 < 0 || arg1.field337 >= var6.field1027) {
                    arg1.field336 = -1;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method388(int arg0) {
        if (arg0 >= 0) {
            this.field1432 = -1;
        }
        if (this.field1296) {
            this.field1296 = false;
            this.field1355.method235(2, super.field12, 0, 11);
            this.field1356.method235(2, super.field12, 0, 375);
            this.field1357.method235(2, super.field12, 729, 5);
            this.field1358.method235(2, super.field12, 752, 231);
            this.field1359.method235(2, super.field12, 0, 0);
            this.field1360.method235(2, super.field12, 561, 0);
            this.field1361.method235(2, super.field12, 520, 11);
            this.field1362.method235(2, super.field12, 520, 231);
            this.field1363.method235(2, super.field12, 501, 375);
            this.field1364.method235(2, super.field12, 0, 345);
            this.field1238 = true;
            this.field1399 = true;
            this.field1402 = true;
            this.field1341 = true;
            if (this.field1099 != 2) {
                this.field1411.method235(2, super.field12, 8, 11);
                this.field1410.method235(2, super.field12, 561, 5);
            }
        }
        if (this.field1099 == 2) {
            this.method416(true);
        }
        if (this.field1231 && this.field1316 == 1) {
            this.field1238 = true;
        }
        if (this.field1138 != -1) {
            boolean var2 = this.method447(this.field1192, this.field1138, 400);
            if (var2) {
                this.field1238 = true;
            }
        }
        if (this.field1480 == 2) {
            this.field1238 = true;
        }
        if (this.field1336 == 2) {
            this.field1238 = true;
        }
        if (this.field1238) {
            this.method443(-708);
            this.field1238 = false;
        }
        if (this.field1184 == -1) {
            this.field1460.field974 = this.field1213 - this.field1476 - 77;
            if (super.field19 > 453 && super.field19 < 565 && super.field20 > 350) {
                this.method465(false, super.field20 - 375, 0, this.field1460, 0, 463, this.field1213, 77, super.field19 - 22);
            }
            int var3 = this.field1213 - 77 - this.field1460.field974;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1213 - 77) {
                var3 = this.field1213 - 77;
            }
            if (this.field1476 != var3) {
                this.field1476 = var3;
                this.field1399 = true;
            }
            ++field1273;
            if (field1273 > 87) {
                field1273 = 0;
                this.field1196.method197(4, 108);
            }
        }
        if (this.field1184 != -1) {
            boolean var4 = this.method447(this.field1192, this.field1184, 400);
            if (var4) {
                this.field1399 = true;
            }
        }
        if (this.field1480 == 3) {
            this.field1399 = true;
        }
        if (this.field1336 == 3) {
            this.field1399 = true;
        }
        if (this.field1198 != null) {
            this.field1399 = true;
        }
        if (this.field1399) {
            this.method401(this.field1253);
            this.field1399 = false;
        }
        if (this.field1099 == 2) {
            if (field1267 && this.field1279 == 0 && field1446 - this.field1395 > 25) {
                this.field1395 = field1446;
                this.field1394 = 1 - this.field1394;
                if (this.field1394 == 0) {
                    this.method389((byte) 6);
                } else {
                    this.field1410.method235(2, super.field12, 561, 5);
                }
            }
            if (!field1267) {
                this.method389((byte) 6);
                this.field1410.method235(2, super.field12, 561, 5);
            }
        }
        if (this.field1304 != -1) {
            this.field1402 = true;
        }
        if (this.field1402) {
            if (this.field1304 != -1 && this.field1406 == this.field1304) {
                this.field1304 = -1;
                this.field1196.method197(4, 193);
                this.field1196.method198(this.field1406);
            }
            this.field1402 = false;
            this.field1226.method234(0);
            this.field1183.method185(0, 0, 0);
            if (this.field1138 == -1) {
                if (this.field1388[this.field1406] != -1) {
                    if (this.field1406 == 0) {
                        this.field1286.method185(29, 0, 30);
                    }
                    if (this.field1406 == 1) {
                        this.field1287.method185(59, 0, 29);
                    }
                    if (this.field1406 == 2) {
                        this.field1287.method185(87, 0, 29);
                    }
                    if (this.field1406 == 3) {
                        this.field1288.method185(115, 0, 29);
                    }
                    if (this.field1406 == 4) {
                        this.field1290.method185(156, 0, 29);
                    }
                    if (this.field1406 == 5) {
                        this.field1290.method185(184, 0, 29);
                    }
                    if (this.field1406 == 6) {
                        this.field1289.method185(212, 0, 30);
                    }
                }
                if (this.field1388[0] != -1 && (this.field1304 != 0 || field1446 % 20 < 10)) {
                    this.field1352[0].method185(35, 0, 34);
                }
                if (this.field1388[1] != -1 && (this.field1304 != 1 || field1446 % 20 < 10)) {
                    this.field1352[1].method185(59, 0, 32);
                }
                if (this.field1388[2] != -1 && (this.field1304 != 2 || field1446 % 20 < 10)) {
                    this.field1352[2].method185(86, 0, 32);
                }
                if (this.field1388[3] != -1 && (this.field1304 != 3 || field1446 % 20 < 10)) {
                    this.field1352[3].method185(121, 0, 33);
                }
                if (this.field1388[4] != -1 && (this.field1304 != 4 || field1446 % 20 < 10)) {
                    this.field1352[4].method185(157, 0, 34);
                }
                if (this.field1388[5] != -1 && (this.field1304 != 5 || field1446 % 20 < 10)) {
                    this.field1352[5].method185(185, 0, 32);
                }
                if (this.field1388[6] != -1 && (this.field1304 != 6 || field1446 % 20 < 10)) {
                    this.field1352[6].method185(212, 0, 34);
                }
            }
            this.field1226.method235(2, super.field12, 520, 165);
            this.field1225.method234(0);
            this.field1182.method185(0, 0, 0);
            if (this.field1138 == -1) {
                if (this.field1388[this.field1406] != -1) {
                    if (this.field1406 == 7) {
                        this.field1141.method185(49, 0, 0);
                    }
                    if (this.field1406 == 8) {
                        this.field1142.method185(81, 0, 0);
                    }
                    if (this.field1406 == 9) {
                        this.field1142.method185(108, 0, 0);
                    }
                    if (this.field1406 == 10) {
                        this.field1143.method185(136, 0, 1);
                    }
                    if (this.field1406 == 11) {
                        this.field1145.method185(178, 0, 0);
                    }
                    if (this.field1406 == 12) {
                        this.field1145.method185(205, 0, 0);
                    }
                    if (this.field1406 == 13) {
                        this.field1144.method185(233, 0, 0);
                    }
                }
                if (this.field1388[8] != -1 && (this.field1304 != 8 || field1446 % 20 < 10)) {
                    this.field1352[7].method185(80, 0, 2);
                }
                if (this.field1388[9] != -1 && (this.field1304 != 9 || field1446 % 20 < 10)) {
                    this.field1352[8].method185(107, 0, 3);
                }
                if (this.field1388[10] != -1 && (this.field1304 != 10 || field1446 % 20 < 10)) {
                    this.field1352[9].method185(142, 0, 4);
                }
                if (this.field1388[11] != -1 && (this.field1304 != 11 || field1446 % 20 < 10)) {
                    this.field1352[10].method185(179, 0, 2);
                }
                if (this.field1388[12] != -1 && (this.field1304 != 12 || field1446 % 20 < 10)) {
                    this.field1352[11].method185(206, 0, 2);
                }
                if (this.field1388[13] != -1 && (this.field1304 != 13 || field1446 % 20 < 10)) {
                    this.field1352[12].method185(230, 0, 2);
                }
            }
            this.field1225.method235(2, super.field12, 501, 492);
            this.field1411.method234(0);
        }
        if (this.field1341) {
            this.field1341 = false;
            this.field1224.method234(0);
            this.field1181.method185(0, 0, 0);
            this.field1344.method188(33, "Public chat", false, 16777215, true, 57);
            if (this.field1112 == 0) {
                this.field1344.method188(46, "On", false, 65280, true, 57);
            }
            if (this.field1112 == 1) {
                this.field1344.method188(46, "Friends", false, 16776960, true, 57);
            }
            if (this.field1112 == 2) {
                this.field1344.method188(46, "Off", false, 16711680, true, 57);
            }
            this.field1344.method188(33, "Private chat", false, 16777215, true, 186);
            if (this.field1245 == 0) {
                this.field1344.method188(46, "On", false, 65280, true, 186);
            }
            if (this.field1245 == 1) {
                this.field1344.method188(46, "Friends", false, 16776960, true, 186);
            }
            if (this.field1245 == 2) {
                this.field1344.method188(46, "Off", false, 16711680, true, 186);
            }
            this.field1344.method188(33, "Trade/duel", false, 16777215, true, 326);
            if (this.field1492 == 0) {
                this.field1344.method188(46, "On", false, 65280, true, 326);
            }
            if (this.field1492 == 1) {
                this.field1344.method188(46, "Friends", false, 16776960, true, 326);
            }
            if (this.field1492 == 2) {
                this.field1344.method188(46, "Off", false, 16711680, true, 326);
            }
            this.field1344.method188(38, "Report abuse", false, 16777215, true, 462);
            this.field1224.method235(2, super.field12, 0, 471);
            this.field1411.method234(0);
        }
        this.field1192 = 0;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method389(byte arg0) {
        this.field1410.method234(0);
        if (arg0 == 6) {
            int var2 = this.field1487.field304 / 32 + 48;
            int var3 = 464 - this.field1487.field305 / 32;
            this.field1421.method178(var2, this.field1303, this.field1278, 9, var3, 4, 151, 146, 21, this.field1464);
            this.field1483.method178(25, this.field1475, this.field1278, 0, 25, 4, 33, 33, 0, this.field1293);
            for (int var4 = 0; var4 < this.field1306; ++var4) {
                int var24 = this.field1307[var4] * 4 + 2 - this.field1487.field304 / 32;
                int var25 = this.field1308[var4] * 4 + 2 - this.field1487.field305 / 32;
                this.method438(0, var24, this.field1208[var4], var25);
            }
            for (int var5 = 0; var5 < 104; ++var5) {
                for (int var20 = 0; var20 < 104; ++var20) {
                    LinkList var21 = this.field1263[this.field1354][var5][var20];
                    if (var21 != null) {
                        int var22 = var5 * 4 + 2 - this.field1487.field304 / 32;
                        int var23 = var20 * 4 + 2 - this.field1487.field305 / 32;
                        this.method438(0, var22, this.field1425, var23);
                    }
                }
            }
            for (int var6 = 0; var6 < this.field1190; ++var6) {
                NpcEntity var17 = this.field1189[this.field1191[var6]];
                if (var17 != null && var17.method110(false) && var17.field357.field867) {
                    int var18 = var17.field304 / 32 - this.field1487.field304 / 32;
                    int var19 = var17.field305 / 32 - this.field1487.field305 / 32;
                    this.method438(0, var18, this.field1426, var19);
                }
            }
            for (int var7 = 0; var7 < this.field1117; ++var7) {
                PlayerEntity var10 = this.field1116[this.field1118[var7]];
                if (var10 != null && var10.method110(false)) {
                    int var11 = var10.field304 / 32 - this.field1487.field304 / 32;
                    int var12 = var10.field305 / 32 - this.field1487.field305 / 32;
                    boolean var13 = false;
                    long var14 = JString.method250(var10.field360);
                    for (int var16 = 0; var16 < this.field1248; ++var16) {
                        if (this.field1459[var16] == var14 && this.field1165[var16] != 0) {
                            var13 = true;
                            break;
                        }
                    }
                    if (var13) {
                        this.method438(0, var11, this.field1428, var12);
                    } else {
                        this.method438(0, var11, this.field1427, var12);
                    }
                }
            }
            if (this.field1419 != 0) {
                int var8 = this.field1419 * 4 + 2 - this.field1487.field304 / 32;
                int var9 = this.field1420 * 4 + 2 - this.field1487.field305 / 32;
                this.method438(0, var8, this.field1350, var9);
            }
            Pix2D.method148(16777215, 82, 93, (byte) 107, 3, 3);
            this.field1411.method234(0);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method10(int arg0) {
        while (arg0 >= 0) {
            this.method6();
        }
        this.field1296 = true;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method390(int arg0) {
        ProjectileEntity var2 = (ProjectileEntity) this.field1237.method227();
        int var3 = 53 / arg0;
        while (var2 != null) {
            if (this.field1354 == var2.field382 && field1446 <= var2.field388) {
                if (field1446 >= var2.field387) {
                    if (var2.field391 > 0) {
                        NpcEntity var4 = this.field1189[var2.field391 - 1];
                        if (var4 != null) {
                            var2.method115(var4.field305, -822, this.method419(var2.field382, var4.field304, 0, var4.field305) - var2.field386, field1446, var4.field304);
                        }
                    }
                    if (var2.field391 < 0) {
                        int var5 = -var2.field391 - 1;
                        PlayerEntity var6;
                        if (this.field1329 == var5) {
                            var6 = this.field1487;
                        } else {
                            var6 = this.field1116[var5];
                        }
                        if (var6 != null) {
                            var2.method115(var6.field305, -822, this.method419(var2.field382, var6.field304, 0, var6.field305) - var2.field386, field1446, var6.field304);
                        }
                    }
                    var2.method116(0, this.field1192);
                    this.field1148.method61(var2.field401, 775, var2, (Model) null, -1, (int) var2.field393, false, 60, this.field1354, (int) var2.field394, (int) var2.field395);
                }
            } else {
                var2.method106();
            }
            var2 = (ProjectileEntity) this.field1237.method229(this.field1485);
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method391(int arg0) {
        Graphics var2 = this.method11((byte) 9).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 789, 532);
        this.method4((byte) 5, 1);
        if (arg0 < 0) {
            if (this.field1407) {
                this.field1240 = false;
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
            if (this.field1274) {
                this.field1240 = false;
                var2.setFont(new Font("Helvetica", 1, 20));
                var2.setColor(Color.white);
                var2.drawString("Error - unable to load game!", 50, 50);
                var2.drawString("To play RuneScape make sure you play from", 50, 100);
                var2.drawString("http://www.runescape.com", 50, 150);
            }
            if (this.field1468) {
                this.field1240 = false;
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

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method392(byte arg0) {
        if (arg0 != 5) {
            this.field1432 = this.field1371.method208();
        }
        if (this.field1467 == 0) {
            int var2 = super.field10 / 2;
            int var3 = super.field11 / 2 + 90;
            if (super.field21 == 1 && super.field22 >= var2 - 75 && super.field22 <= var2 + 75 && super.field23 >= var3 - 20 && super.field23 <= var3 + 20) {
                this.field1149 = "";
                this.field1150 = "Enter your username & password.";
                this.field1467 = 2;
                this.field1309 = 0;
            }
        } else if (this.field1467 == 2) {
            int var4 = super.field11 / 2 - 30;
            int var11 = var4 + 30;
            if (super.field21 == 1 && super.field23 >= var11 - 15 && super.field23 < var11) {
                this.field1309 = 0;
            }
            var4 = var11 + 15;
            if (super.field21 == 1 && super.field23 >= var4 - 15 && super.field23 < var4) {
                this.field1309 = 1;
            }
            var4 += 15;
            int var5 = super.field10 / 2 - 80;
            int var6 = super.field11 / 2 + 60;
            if (super.field21 == 1 && super.field22 >= var5 - 75 && super.field22 <= var5 + 75 && super.field23 >= var6 - 20 && super.field23 <= var6 + 20) {
                this.method406(this.field1339, this.field1340, false);
            }
            int var7 = super.field10 / 2 + 80;
            if (super.field21 == 1 && super.field22 >= var7 - 75 && super.field22 <= var7 + 75 && super.field23 >= var6 - 20 && super.field23 <= var6 + 20) {
                this.field1467 = 0;
                this.field1339 = "";
                this.field1340 = "";
            }
            while (true) {
                while (true) {
                    int var8 = this.method5(5);
                    if (var8 == -1) {
                        return;
                    }
                    boolean var9 = false;
                    for (int var10 = 0; var10 < field1450.length(); ++var10) {
                        if (var8 == field1450.charAt(var10)) {
                            var9 = true;
                            break;
                        }
                    }
                    if (this.field1309 == 0) {
                        if (var8 == 8 && this.field1339.length() > 0) {
                            this.field1339 = this.field1339.substring(0, this.field1339.length() - 1);
                        }
                        if (var8 == 9 || var8 == 10 || var8 == 13) {
                            this.field1309 = 1;
                        }
                        if (var9) {
                            this.field1339 = this.field1339 + (char) var8;
                        }
                        if (this.field1339.length() > 12) {
                            this.field1339 = this.field1339.substring(0, 12);
                        }
                    } else if (this.field1309 == 1) {
                        if (var8 == 8 && this.field1340.length() > 0) {
                            this.field1340 = this.field1340.substring(0, this.field1340.length() - 1);
                        }
                        if (var8 == 9 || var8 == 10 || var8 == 13) {
                            this.field1309 = 0;
                        }
                        if (var9) {
                            this.field1340 = this.field1340 + (char) var8;
                        }
                        if (this.field1340.length() > 20) {
                            this.field1340 = this.field1340.substring(0, 20);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method393(boolean arg0) {
        if (arg0) {
            this.field1263 = null;
        }
        if (super.field21 == 1) {
            if (super.field22 >= 549 && super.field22 <= 583 && super.field23 >= 195 && super.field23 < 231 && this.field1388[0] != -1) {
                this.field1238 = true;
                this.field1406 = 0;
                this.field1402 = true;
            }
            if (super.field22 >= 579 && super.field22 <= 609 && super.field23 >= 194 && super.field23 < 231 && this.field1388[1] != -1) {
                this.field1238 = true;
                this.field1406 = 1;
                this.field1402 = true;
            }
            if (super.field22 >= 607 && super.field22 <= 637 && super.field23 >= 194 && super.field23 < 231 && this.field1388[2] != -1) {
                this.field1238 = true;
                this.field1406 = 2;
                this.field1402 = true;
            }
            if (super.field22 >= 635 && super.field22 <= 679 && super.field23 >= 194 && super.field23 < 229 && this.field1388[3] != -1) {
                this.field1238 = true;
                this.field1406 = 3;
                this.field1402 = true;
            }
            if (super.field22 >= 676 && super.field22 <= 706 && super.field23 >= 194 && super.field23 < 231 && this.field1388[4] != -1) {
                this.field1238 = true;
                this.field1406 = 4;
                this.field1402 = true;
            }
            if (super.field22 >= 704 && super.field22 <= 734 && super.field23 >= 194 && super.field23 < 231 && this.field1388[5] != -1) {
                this.field1238 = true;
                this.field1406 = 5;
                this.field1402 = true;
            }
            if (super.field22 >= 732 && super.field22 <= 766 && super.field23 >= 195 && super.field23 < 231 && this.field1388[6] != -1) {
                this.field1238 = true;
                this.field1406 = 6;
                this.field1402 = true;
            }
            if (super.field22 >= 550 && super.field22 <= 584 && super.field23 >= 492 && super.field23 < 528 && this.field1388[7] != -1) {
                this.field1238 = true;
                this.field1406 = 7;
                this.field1402 = true;
            }
            if (super.field22 >= 582 && super.field22 <= 612 && super.field23 >= 492 && super.field23 < 529 && this.field1388[8] != -1) {
                this.field1238 = true;
                this.field1406 = 8;
                this.field1402 = true;
            }
            if (super.field22 >= 609 && super.field22 <= 639 && super.field23 >= 492 && super.field23 < 529 && this.field1388[9] != -1) {
                this.field1238 = true;
                this.field1406 = 9;
                this.field1402 = true;
            }
            if (super.field22 >= 637 && super.field22 <= 681 && super.field23 >= 493 && super.field23 < 528 && this.field1388[10] != -1) {
                this.field1238 = true;
                this.field1406 = 10;
                this.field1402 = true;
            }
            if (super.field22 >= 679 && super.field22 <= 709 && super.field23 >= 492 && super.field23 < 529 && this.field1388[11] != -1) {
                this.field1238 = true;
                this.field1406 = 11;
                this.field1402 = true;
            }
            if (super.field22 >= 706 && super.field22 <= 736 && super.field23 >= 492 && super.field23 < 529 && this.field1388[12] != -1) {
                this.field1238 = true;
                this.field1406 = 12;
                this.field1402 = true;
            }
            if (super.field22 >= 734 && super.field22 <= 768 && super.field23 >= 492 && super.field23 < 528 && this.field1388[13] != -1) {
                this.field1238 = true;
                this.field1406 = 13;
                this.field1402 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILz;III)V")
    public final void method394(int arg0, PlayerEntity arg1, int arg2, int arg3, int arg4) {
        if (this.field1487 != arg1) {
            if (this.field1139 < 400) {
                String var6 = arg1.field360 + method473(arg1.field366, this.field1487.field366, -29344) + " (level-" + arg1.field366 + ")";
                if (this.field1167 == 1) {
                    this.field1291[this.field1139] = "Use " + this.field1171 + " with @whi@" + var6;
                    this.field1502[this.field1139] = 65;
                    this.field1503[this.field1139] = arg2;
                    this.field1500[this.field1139] = arg0;
                    this.field1501[this.field1139] = arg4;
                    ++this.field1139;
                } else if (this.field1158 == 1) {
                    if ((this.field1160 & 8) == 8) {
                        this.field1291[this.field1139] = this.field1161 + " @whi@" + var6;
                        this.field1502[this.field1139] = 92;
                        this.field1503[this.field1139] = arg2;
                        this.field1500[this.field1139] = arg0;
                        this.field1501[this.field1139] = arg4;
                        ++this.field1139;
                    }
                } else {
                    this.field1291[this.field1139] = "Follow @whi@" + var6;
                    this.field1502[this.field1139] = 1958;
                    this.field1503[this.field1139] = arg2;
                    this.field1500[this.field1139] = arg0;
                    this.field1501[this.field1139] = arg4;
                    ++this.field1139;
                    if (this.field1449 == 0) {
                        this.field1291[this.field1139] = "Trade with @whi@" + var6;
                        this.field1502[this.field1139] = 1390;
                        this.field1503[this.field1139] = arg2;
                        this.field1500[this.field1139] = arg0;
                        this.field1501[this.field1139] = arg4;
                        ++this.field1139;
                    }
                    if (this.field1275 > 0) {
                        this.field1291[this.field1139] = "Attack @whi@" + var6;
                        if (this.field1487.field366 >= arg1.field366) {
                            this.field1502[this.field1139] = 905;
                        } else {
                            this.field1502[this.field1139] = 2905;
                        }
                        this.field1503[this.field1139] = arg2;
                        this.field1500[this.field1139] = arg0;
                        this.field1501[this.field1139] = arg4;
                        ++this.field1139;
                    }
                    if (this.field1299 == 1) {
                        this.field1291[this.field1139] = "Fight @whi@" + var6;
                        this.field1502[this.field1139] = 905;
                        this.field1503[this.field1139] = arg2;
                        this.field1500[this.field1139] = arg0;
                        this.field1501[this.field1139] = arg4;
                        ++this.field1139;
                    }
                    if (this.field1299 == 2) {
                        this.field1291[this.field1139] = "Duel-with @whi@" + var6;
                        this.field1502[this.field1139] = 656;
                        this.field1503[this.field1139] = arg2;
                        this.field1500[this.field1139] = arg0;
                        this.field1501[this.field1139] = arg4;
                        ++this.field1139;
                    }
                }
                for (int var7 = 0; var7 < this.field1139; ++var7) {
                    if (this.field1502[var7] == 256) {
                        this.field1291[var7] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                if (arg3 < 4 || arg3 > 4) {
                    this.field1103 = this.field1369.method245();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(BI)V")
    public final void method395(byte arg0, int arg1) {
        if (arg1 >= 0) {
            if (this.field1305) {
                this.field1305 = false;
                this.field1399 = true;
            }
            int var3 = this.field1500[arg1];
            int var4 = this.field1501[arg1];
            int var5 = this.field1502[arg1];
            int var6 = this.field1503[arg1];
            if (arg0 != 9) {
                this.field1263 = null;
            }
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 825 && this.method379(var4, 43, -63, var3, var6)) {
                this.field1196.method199(this.field1170);
                this.field1196.method199(this.field1168);
                this.field1196.method199(this.field1169);
            }
            if (var5 == 238) {
                Component var7 = Component.field955[var4];
                boolean var8 = true;
                if (var7.field964 > 0) {
                    var8 = this.method439(var7, (byte) -11);
                }
                if (var8) {
                    this.field1196.method197(4, 203);
                    this.field1196.method199(var4);
                }
            }
            if (var5 == 771 && this.method379(var4, 109, -63, var3, var6)) {
                this.field1196.method199(this.field1159);
            }
            if (var5 == 788) {
                boolean var9 = this.method434(false, var4, this.field1487.field352[0], 0, 0, this.field1487.field353[0], 0, 0, this.field1151, 0, var3);
                if (!var9) {
                    this.method434(false, var4, this.field1487.field352[0], 1, 1, this.field1487.field353[0], 0, 0, this.field1151, 0, var3);
                }
                this.field1232 = super.field22;
                this.field1233 = super.field23;
                this.field1235 = 2;
                this.field1234 = 0;
                this.field1196.method197(4, 88);
                this.field1196.method199(this.field1108 + var3);
                this.field1196.method199(this.field1109 + var4);
                this.field1196.method199(var6);
                this.field1196.method199(this.field1159);
            }
            if (var5 == 106) {
                boolean var11 = this.method434(false, var4, this.field1487.field352[0], 0, 0, this.field1487.field353[0], 0, 0, this.field1151, 0, var3);
                if (!var11) {
                    this.method434(false, var4, this.field1487.field352[0], 1, 1, this.field1487.field353[0], 0, 0, this.field1151, 0, var3);
                }
                this.field1232 = super.field22;
                this.field1233 = super.field23;
                this.field1235 = 2;
                this.field1234 = 0;
                this.field1196.method197(4, 31);
                this.field1196.method199(this.field1108 + var3);
                this.field1196.method199(this.field1109 + var4);
                this.field1196.method199(var6);
                this.field1196.method199(this.field1170);
                this.field1196.method199(this.field1168);
                this.field1196.method199(this.field1169);
            }
            if (var5 == 779) {
                this.field1196.method197(4, 203);
                this.field1196.method199(var4);
                Component var13 = Component.field955[var4];
                if (var13.field969 != null && var13.field969[0][0] == 5) {
                    int var14 = var13.field969[0][1];
                    if (this.field1178[var14] != var13.field971[0]) {
                        this.field1178[var14] = var13.field971[0];
                        this.method372(649, var14);
                        this.field1238 = true;
                    }
                }
            }
            if (var5 == 1387) {
                int var15 = var6 >> 14 & 32767;
                LocType var16 = LocType.method274(var15);
                String var17;
                if (var16.field811 != null) {
                    var17 = new String(var16.field811);
                } else {
                    var17 = "It's a " + var16.field810 + ".";
                }
                this.method375(386, 0, var17, "");
            }
            if (var5 == 129) {
                NpcEntity var18 = this.field1189[var6];
                if (var18 != null) {
                    this.method434(false, var18.field353[0], this.field1487.field352[0], 1, 1, this.field1487.field353[0], 0, 0, this.field1151, 0, var18.field352[0]);
                    this.field1232 = super.field22;
                    this.field1233 = super.field23;
                    this.field1235 = 2;
                    this.field1234 = 0;
                    this.field1196.method197(4, 139);
                    this.field1196.method199(var6);
                    this.field1196.method199(this.field1159);
                }
            }
            if (var5 == 1536) {
                ObjType var19 = ObjType.method286(var6);
                String var20;
                if (var19.field885 != null) {
                    var20 = new String(var19.field885);
                } else {
                    var20 = "It's a " + var19.field884 + ".";
                }
                this.method375(386, 0, var20, "");
            }
            if (var5 == 688) {
                NpcEntity var21 = this.field1189[var6];
                if (var21 != null) {
                    this.method434(false, var21.field353[0], this.field1487.field352[0], 1, 1, this.field1487.field353[0], 0, 0, this.field1151, 0, var21.field352[0]);
                    this.field1232 = super.field22;
                    this.field1233 = super.field23;
                    this.field1235 = 2;
                    this.field1234 = 0;
                    this.field1196.method197(4, 106);
                    this.field1196.method199(var6);
                    this.field1196.method199(this.field1170);
                    this.field1196.method199(this.field1168);
                    this.field1196.method199(this.field1169);
                }
            }
            if (var5 == 278) {
                this.field1196.method197(4, 42);
                this.field1196.method199(var6);
                this.field1196.method199(var3);
                this.field1196.method199(var4);
                this.field1196.method199(this.field1170);
                this.field1196.method199(this.field1168);
                this.field1196.method199(this.field1169);
                this.field1477 = 0;
                this.field1478 = var4;
                this.field1479 = var3;
                this.field1480 = 2;
                if (Component.field955[var4].field961 == this.field1250) {
                    this.field1480 = 1;
                }
                if (Component.field955[var4].field961 == this.field1184) {
                    this.field1480 = 3;
                }
            }
            if (var5 == 382 || var5 == 635 || var5 == 939 || var5 == 274 || var5 == 618) {
                if (var5 == 635) {
                    this.field1196.method197(4, 145);
                }
                if (var5 == 939) {
                    ++field1206;
                    if (field1206 >= 62) {
                        this.field1196.method197(4, 208);
                        this.field1196.method198(142);
                    }
                    this.field1196.method197(4, 63);
                }
                if (var5 == 382) {
                    field1175 += var6;
                    if (field1175 >= 76) {
                        this.field1196.method197(4, 112);
                        this.field1196.method198(171);
                    }
                    this.field1196.method197(4, 255);
                }
                if (var5 == 274) {
                    this.field1196.method197(4, 59);
                }
                if (var5 == 618) {
                    if ((var6 & 3) == 0) {
                        ++field1202;
                    }
                    if (field1202 >= 124) {
                        this.field1196.method197(4, 236);
                        this.field1196.method202(0);
                    }
                    this.field1196.method197(4, 163);
                }
                this.field1196.method199(var6);
                this.field1196.method199(var3);
                this.field1196.method199(var4);
                this.field1477 = 0;
                this.field1478 = var4;
                this.field1479 = var3;
                this.field1480 = 2;
                if (Component.field955[var4].field961 == this.field1250) {
                    this.field1480 = 1;
                }
                if (Component.field955[var4].field961 == this.field1184) {
                    this.field1480 = 3;
                }
            }
            if (var5 == 1390 || var5 == 1958 || var5 == 905 || var5 == 656) {
                PlayerEntity var22 = this.field1116[var6];
                if (var22 != null) {
                    this.method434(false, var22.field353[0], this.field1487.field352[0], 1, 1, this.field1487.field353[0], 0, 0, this.field1151, 0, var22.field352[0]);
                    this.field1232 = super.field22;
                    this.field1233 = super.field23;
                    this.field1235 = 2;
                    this.field1234 = 0;
                    if (var5 == 1958) {
                        if ((var6 & 3) == 0) {
                            ++field1377;
                        }
                        if (field1377 >= 139) {
                            this.field1196.method197(4, 111);
                            this.field1196.method202(0);
                        }
                        this.field1196.method197(4, 3);
                    }
                    if (var5 == 656) {
                        this.field1196.method197(4, 50);
                    }
                    if (var5 == 1390) {
                        this.field1196.method197(4, 232);
                    }
                    if (var5 == 905) {
                        this.field1196.method197(4, 12);
                    }
                    this.field1196.method199(var6);
                }
            }
            if (var5 == 71 || var5 == 897 || var5 == 500 || var5 == 837 || var5 == 460) {
                if (var5 == 897) {
                    this.field1196.method197(4, 227);
                }
                if (var5 == 460) {
                    this.field1196.method197(4, 5);
                }
                if (var5 == 837) {
                    this.field1196.method197(4, 180);
                }
                if (var5 == 71) {
                    this.field1196.method197(4, 61);
                }
                if (var5 == 500) {
                    this.field1196.method197(4, 10);
                }
                this.field1196.method199(var6);
                this.field1196.method199(var3);
                this.field1196.method199(var4);
                this.field1477 = 0;
                this.field1478 = var4;
                this.field1479 = var3;
                this.field1480 = 2;
                if (Component.field955[var4].field961 == this.field1250) {
                    this.field1480 = 1;
                }
                if (Component.field955[var4].field961 == this.field1184) {
                    this.field1480 = 3;
                }
            }
            if (var5 == 782) {
                field1244 += var4;
                if (field1244 >= 132) {
                    this.field1196.method197(4, 231);
                    this.field1196.method199(17379);
                }
                this.method379(var4, 242, -63, var3, var6);
            }
            if (var5 == 68) {
                this.method379(var4, 171, -63, var3, var6);
            }
            if (var5 == 975) {
                this.method431((byte) 7);
            }
            if (var5 == 215) {
                this.field1167 = 1;
                this.field1168 = var3;
                this.field1169 = var4;
                this.field1170 = var6;
                this.field1171 = ObjType.method286(var6).field884;
                this.field1158 = 0;
            } else {
                if (var5 == 45) {
                    this.field1196.method197(4, 174);
                    this.field1196.method199(var6);
                    this.field1196.method199(var3);
                    this.field1196.method199(var4);
                    this.field1196.method199(this.field1159);
                    this.field1477 = 0;
                    this.field1478 = var4;
                    this.field1479 = var3;
                    this.field1480 = 2;
                    if (Component.field955[var4].field961 == this.field1250) {
                        this.field1480 = 1;
                    }
                    if (Component.field955[var4].field961 == this.field1184) {
                        this.field1480 = 3;
                    }
                }
                if (var5 == 943) {
                    ++field1104;
                    if (field1104 >= 135) {
                        this.field1196.method197(4, 85);
                        this.field1196.method199(10151);
                    }
                    this.method379(var4, 140, -63, var3, var6);
                }
                if (var5 == 614 || var5 == 719 || var5 == 969 || var5 == 890 || var5 == 983) {
                    NpcEntity var23 = this.field1189[var6];
                    if (var23 != null) {
                        this.method434(false, var23.field353[0], this.field1487.field352[0], 1, 1, this.field1487.field353[0], 0, 0, this.field1151, 0, var23.field352[0]);
                        this.field1232 = super.field22;
                        this.field1233 = super.field23;
                        this.field1235 = 2;
                        this.field1234 = 0;
                        if (var5 == 890) {
                            this.field1196.method197(4, 33);
                        }
                        if (var5 == 983) {
                            this.field1196.method197(4, 175);
                        }
                        if (var5 == 614) {
                            this.field1196.method197(4, 122);
                        }
                        if (var5 == 969) {
                            this.field1196.method197(4, 87);
                        }
                        if (var5 == 719) {
                            field1254 += var6;
                            if (field1254 >= 116) {
                                this.field1196.method197(4, 121);
                            }
                            this.field1196.method197(4, 60);
                        }
                        this.field1196.method199(var6);
                    }
                }
                if (var5 == 256) {
                    if (!this.field1231) {
                        this.field1148.method88(super.field22 - 8, super.field23 - 11, this.field1505);
                    } else {
                        this.field1148.method88(var3 - 8, var4 - 11, this.field1505);
                    }
                }
                if (var5 == 409) {
                    Component var24 = Component.field955[var4];
                    this.field1158 = 1;
                    this.field1159 = var4;
                    this.field1160 = var24.field1010;
                    this.field1167 = 0;
                    String var25 = var24.field1008;
                    if (var25.indexOf(" ") != -1) {
                        var25 = var25.substring(0, var25.indexOf(" "));
                    }
                    String var26 = var24.field1008;
                    if (var26.indexOf(" ") != -1) {
                        var26 = var26.substring(var26.indexOf(" ") + 1);
                    }
                    this.field1161 = var25 + " " + var24.field1009 + " " + var26;
                    if (this.field1160 == 16) {
                        this.field1238 = true;
                        this.field1406 = 3;
                        this.field1402 = true;
                    }
                } else {
                    if (var5 == 393) {
                        this.method379(var4, 51, -63, var3, var6);
                    }
                    if (var5 == 653) {
                        this.method379(var4, 62, -63, var3, var6);
                    }
                    if (var5 == 1654) {
                        ObjType var27 = ObjType.method286(var6);
                        String var28;
                        if (var4 >= 100000) {
                            var28 = var4 + " x " + var27.field884;
                        } else if (var27.field885 != null) {
                            var28 = new String(var27.field885);
                        } else {
                            var28 = "It's a " + var27.field884 + ".";
                        }
                        this.method375(386, 0, var28, "");
                    }
                    if (var5 == 785 && !this.field1123) {
                        this.field1196.method197(4, 197);
                        this.field1196.method199(var4);
                        this.field1123 = true;
                    }
                    if (var5 == 261) {
                        this.field1196.method197(4, 203);
                        this.field1196.method199(var4);
                        Component var29 = Component.field955[var4];
                        if (var29.field969 != null && var29.field969[0][0] == 5) {
                            int var30 = var29.field969[0][1];
                            this.field1178[var30] = 1 - this.field1178[var30];
                            this.method372(649, var30);
                            this.field1238 = true;
                        }
                    }
                    if (var5 == 1586) {
                        NpcEntity var31 = this.field1189[var6];
                        if (var31 != null) {
                            String var32;
                            if (var31.field357.field851 != null) {
                                var32 = new String(var31.field357.field851);
                            } else {
                                var32 = "It's a " + var31.field357.field850 + ".";
                            }
                            this.method375(386, 0, var32, "");
                        }
                    }
                    if (var5 == 308 || var5 == 445 || var5 == 848 || var5 == 221 || var5 == 273) {
                        boolean var33 = this.method434(false, var4, this.field1487.field352[0], 0, 0, this.field1487.field353[0], 0, 0, this.field1151, 0, var3);
                        if (!var33) {
                            this.method434(false, var4, this.field1487.field352[0], 1, 1, this.field1487.field353[0], 0, 0, this.field1151, 0, var3);
                        }
                        this.field1232 = super.field22;
                        this.field1233 = super.field23;
                        this.field1235 = 2;
                        this.field1234 = 0;
                        if (var5 == 445) {
                            this.field1196.method197(4, 17);
                        }
                        if (var5 == 221) {
                            this.field1196.method197(4, 69);
                        }
                        if (var5 == 273) {
                            ++field1493;
                            if (field1493 >= 121) {
                                this.field1196.method197(4, 210);
                                this.field1196.method198(128);
                            }
                            this.field1196.method197(4, 135);
                        }
                        if (var5 == 848) {
                            this.field1196.method197(4, 55);
                        }
                        if (var5 == 308) {
                            this.field1196.method197(4, 239);
                        }
                        this.field1196.method199(this.field1108 + var3);
                        this.field1196.method199(this.field1109 + var4);
                        this.field1196.method199(var6);
                    }
                    if (var5 == 92) {
                        PlayerEntity var35 = this.field1116[var6];
                        if (var35 != null) {
                            this.method434(false, var35.field353[0], this.field1487.field352[0], 1, 1, this.field1487.field353[0], 0, 0, this.field1151, 0, var35.field352[0]);
                            this.field1232 = super.field22;
                            this.field1233 = super.field23;
                            this.field1235 = 2;
                            this.field1234 = 0;
                            this.field1196.method197(4, 4);
                            this.field1196.method199(var6);
                            this.field1196.method199(this.field1159);
                        }
                    }
                    if (var5 == 65) {
                        PlayerEntity var36 = this.field1116[var6];
                        if (var36 != null) {
                            this.method434(false, var36.field353[0], this.field1487.field352[0], 1, 1, this.field1487.field353[0], 0, 0, this.field1151, 0, var36.field352[0]);
                            this.field1232 = super.field22;
                            this.field1233 = super.field23;
                            this.field1235 = 2;
                            this.field1234 = 0;
                            this.field1196.method197(4, 100);
                            this.field1196.method199(var6);
                            this.field1196.method199(this.field1170);
                            this.field1196.method199(this.field1168);
                            this.field1196.method199(this.field1169);
                        }
                    }
                    this.field1167 = 0;
                    this.field1158 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method396(boolean arg0, String arg1) {
        if (!arg0) {
            this.method6();
        }
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1248; ++var3) {
                if (arg1.equalsIgnoreCase(this.field1155[var3])) {
                    return true;
                }
            }
            return arg1.equalsIgnoreCase(this.field1487.field360);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method397(boolean arg0) {
        this.method377(-643);
        this.field1429 &= arg0;
        this.field1126.method234(0);
        this.field1251.method185(0, 0, 0);
        short var2 = 360;
        short var3 = 200;
        if (this.field1467 == 0) {
            int var4 = var3 / 2 - 80;
            this.field1345.method188(var4, "Welcome to the RuneScape-2 BETA test.", false, 16776960, true, var2 / 2);
            int var11 = var4 + 15;
            int var12 = var11 + 15;
            this.field1343.method188(var12, "Please note this test version of the game is provided for ", false, 16777215, true, var2 / 2);
            int var13 = var12 + 15;
            this.field1343.method188(var13, "testing/preview purposes only. As such please bear in mind that:", false, 16777215, true, var2 / 2);
            int var14 = var13 + 15;
            int var15 = var14 + 10;
            this.field1343.method188(var15, "a) Everything you do/gain here will be forgotten when the beta ends.", false, 16777215, true, var2 / 2);
            int var16 = var15 + 15;
            this.field1343.method188(var16, "b) No customer support is available for the beta.", false, 16777215, true, var2 / 2);
            int var17 = var16 + 15;
            this.field1343.method188(var17, "c) The beta may be incomplete/buggy, we're still working on it.", false, 16777215, true, var2 / 2);
            int var18 = var17 + 15;
            this.field1343.method188(var18, "d) The beta may be totally unavailable at times.", false, 16777215, true, var2 / 2);
            int var19 = var18 + 15;
            int var5 = var2 / 2;
            int var6 = var3 / 2 + 65;
            this.field1252.method185(var5 - 73, 0, var6 - 20);
            this.field1345.method188(var6 + 5, "Click here to login.", false, 16777215, true, var2 / 2);
        }
        if (this.field1467 == 2) {
            int var7 = var3 / 2 - 50;
            if (this.field1149.length() > 0) {
                this.field1345.method188(var7 - 15, this.field1149, false, 16776960, true, var2 / 2);
                this.field1345.method188(var7, this.field1150, false, 16776960, true, var2 / 2);
                var7 += 30;
            } else {
                this.field1345.method188(var7 - 7, this.field1150, false, 16776960, true, var2 / 2);
                var7 += 30;
            }
            this.field1345.method192(true, 16777215, false, var2 / 2 - 90, var7, "Username: " + this.field1339 + (this.field1309 == 0 & field1446 % 40 < 20 ? "@yel@|" : ""));
            var7 += 15;
            this.field1345.method192(true, 16777215, false, var2 / 2 - 88, var7, "Password: " + JString.method256(this.field1340, 0) + (this.field1309 == 1 & field1446 % 40 < 20 ? "@yel@|" : ""));
            var7 += 15;
            int var8 = var2 / 2 - 80;
            int var9 = var3 / 2 + 40;
            this.field1252.method185(var8 - 73, 0, var9 - 20);
            this.field1345.method188(var9 + 5, "Login", false, 16777215, true, var8);
            int var10 = var2 / 2 + 80;
            this.field1252.method185(var10 - 73, 0, var9 - 20);
            this.field1345.method188(var9 + 5, "Cancel", false, 16777215, true, var10);
        }
        this.field1126.method235(2, super.field12, 214, 186);
        if (this.field1296) {
            this.field1296 = false;
            this.field1124.method235(2, super.field12, 128, 0);
            this.field1125.method235(2, super.field12, 214, 386);
            this.field1129.method235(2, super.field12, 0, 265);
            this.field1130.method235(2, super.field12, 574, 265);
            this.field1131.method235(2, super.field12, 128, 186);
            this.field1132.method235(2, super.field12, 574, 186);
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method398(int arg0) {
        if (this.field1376 == 2) {
            this.method472(this.field1270 * 2, (this.field1269 - this.field1109 << 7) + this.field1272, (this.field1268 - this.field1108 << 7) + this.field1271, false);
            if (arg0 >= 0) {
                this.field1432 = -1;
            }
            if (this.field1461 > -1 && field1446 % 20 < 10) {
                this.field1482[2].method172(this.field1461 - 12, 0, this.field1462 - 28);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLib;)V")
    public final void method399(byte arg0, Pix8 arg1) {
        short var3 = 256;
        if (arg0 == 7) {
            for (int var4 = 0; var4 < this.field1256.length; ++var4) {
                this.field1256[var4] = 0;
            }
            for (int var5 = 0; var5 < 5000; ++var5) {
                int var17 = (int) (Math.random() * 128.0D * (double) var3);
                this.field1256[var17] = (int) (Math.random() * 256.0D);
            }
            for (int var6 = 0; var6 < 20; ++var6) {
                for (int var13 = 1; var13 < var3 - 1; ++var13) {
                    for (int var15 = 1; var15 < 127; ++var15) {
                        int var16 = (var13 << 7) + var15;
                        this.field1257[var16] = (this.field1256[var16 - 1] + this.field1256[var16 + 1] + this.field1256[var16 - 128] + this.field1256[var16 + 128]) / 4;
                    }
                }
                int[] var14 = this.field1256;
                this.field1256 = this.field1257;
                this.field1257 = var14;
            }
            if (arg1 != null) {
                int var7 = 0;
                for (int var8 = 0; var8 < arg1.field596; ++var8) {
                    for (int var9 = 0; var9 < arg1.field595; ++var9) {
                        if (arg1.field593[var7++] != 0) {
                            int var10 = var9 + 16 + arg1.field597;
                            int var11 = var8 + 16 + arg1.field598;
                            int var12 = (var11 << 7) + var10;
                            this.field1256[var12] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method400(String arg0) throws IOException {
        return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method401(int arg0) {
        this.field1412.method234(0);
        Pix3D.field560 = this.field1373;
        this.field1312.method185(0, 0, 0);
        if (this.field1351) {
            this.field1345.method187(this.field1391, 40, 239, (byte) 0, 0);
            this.field1345.method187(this.field1204 + "*", 60, 239, (byte) 0, 128);
        } else if (this.field1305) {
            this.field1345.method187("Enter amount to transfer:", 40, 239, (byte) 0, 0);
            this.field1345.method187(this.field1241 + "*", 60, 239, (byte) 0, 128);
        } else if (this.field1198 != null) {
            this.field1345.method187(this.field1198, 40, 239, (byte) 0, 0);
            this.field1345.method187("Click to continue", 60, 239, (byte) 0, 128);
        } else if (this.field1184 != -1) {
            this.method469(0, Component.field955[this.field1184], this.field1298, 0, 0);
        } else if (this.field1313 != -1) {
            this.method469(0, Component.field955[this.field1313], this.field1298, 0, 0);
        } else {
            PixFont var2 = this.field1344;
            int var3 = 0;
            Pix2D.method146(this.field1136, 0, 0, 463, 77);
            for (int var4 = 0; var4 < 50; ++var4) {
                if (this.field1187[var4] != null) {
                    int var5 = this.field1255[var4];
                    int var6 = 70 - var3 * 14 + this.field1476;
                    if (var5 == 0) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method190(this.field1187[var4], 4, -729, var6, 0);
                        }
                        ++var3;
                    }
                    if (var5 == 1) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method190(this.field1113[var4] + ":", 4, -729, var6, 16777215);
                            var2.method190(this.field1187[var4], 12 + var2.method189(0, this.field1113[var4]), -729, var6, 255);
                        }
                        ++var3;
                    }
                    if (var5 == 2 && (this.field1112 == 0 || this.field1112 == 1 && this.method396(true, this.field1113[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method190(this.field1113[var4] + ":", 4, -729, var6, 0);
                            var2.method190(this.field1187[var4], 12 + var2.method189(0, this.field1113[var4]), -729, var6, 255);
                        }
                        ++var3;
                    }
                    if (var5 == 3 && (this.field1245 == 0 || this.field1245 == 1 && this.method396(true, this.field1113[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method190("From " + this.field1113[var4] + ":", 4, -729, var6, 0);
                            var2.method190(this.field1187[var4], 12 + var2.method189(0, "From " + this.field1113[var4]), -729, var6, 8388608);
                        }
                        ++var3;
                    }
                    if (var5 == 4 && (this.field1492 == 0 || this.field1492 == 1 && this.method396(true, this.field1113[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method190(this.field1113[var4] + " " + this.field1187[var4], 4, -729, var6, 8388736);
                        }
                        ++var3;
                    }
                    if (var5 == 5 && this.field1245 < 2) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method190(this.field1187[var4], 4, -729, var6, 8388608);
                        }
                        ++var3;
                    }
                    if (var5 == 6 && this.field1245 < 2) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method190("To " + this.field1113[var4] + ":", 4, -729, var6, 0);
                            var2.method190(this.field1187[var4], 12 + var2.method189(0, "To " + this.field1113[var4]), -729, var6, 8388608);
                        }
                        ++var3;
                    }
                    if (var5 == 7) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method190("From " + this.field1113[var4] + ":", 4, -729, var6, 0);
                            var2.method190(this.field1187[var4], 12 + var2.method189(0, "From " + this.field1113[var4]), -729, var6, 8388608);
                        }
                        ++var3;
                    }
                    if (var5 == 8 && (this.field1492 == 0 || this.field1492 == 1 && this.method396(true, this.field1113[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method190(this.field1113[var4] + " " + this.field1187[var4], 4, -729, var6, 13350793);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method145(false);
            this.field1213 = var3 * 14 + 7;
            if (this.field1213 < 78) {
                this.field1213 = 78;
            }
            this.method404(463, 0, this.field1213 - this.field1476 - 77, 77, 0, this.field1213);
            var2.method190(JString.method254((byte) -10, this.field1339) + ":", 4, -729, 90, 0);
            var2.method190(this.field1185 + "*", 6 + var2.method189(0, this.field1339 + ": "), -729, 90, 255);
            Pix2D.method150(0, 77, 479, 0, 0);
        }
        this.field1412.method235(2, super.field12, 22, 375);
        this.field1411.method234(0);
        this.field1431 += arg0;
        Pix3D.field560 = this.field1375;
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1264 = Integer.parseInt(this.getParameter("nodeid"));
        field1265 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method461(9);
        } else {
            method403(-461);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1266 = false;
        } else {
            field1266 = true;
        }
        this.method2(789, true, 532);
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method402(int arg0) {
        this.field1431 += arg0;
        int var2 = this.field1317;
        int var3 = this.field1318;
        int var4 = this.field1319;
        int var5 = this.field1320;
        int var6 = 6116423;
        Pix2D.method148(var6, var3, var2, (byte) 107, var4, var5);
        Pix2D.method148(0, var3 + 1, var2 + 1, (byte) 107, var4 - 2, 16);
        Pix2D.method149(var4 - 2, 0, var3 + 18, var2 + 1, var5 - 19, 649);
        this.field1345.method190("Choose Option", var2 + 3, -729, var3 + 14, var6);
        int var7 = super.field19;
        int var8 = super.field20;
        if (this.field1316 == 0) {
            var7 -= 8;
            var8 -= 11;
        }
        if (this.field1316 == 1) {
            var7 -= 562;
            var8 -= 231;
        }
        for (int var9 = 0; var9 < this.field1139; ++var9) {
            int var10 = (this.field1139 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field1345.method192(true, var11, false, var2 + 3, var10, this.field1291[var9]);
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public static final void method403(int arg0) {
        World3D.field222 = false;
        Pix3D.field549 = false;
        field1267 = false;
        World.field35 = false;
        while (arg0 >= 0) {
            field1506 = 469;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1404.method185(arg0, 0, arg4);
        this.field1405.method185(arg0, 0, arg3 + arg4 - 16);
        this.field1431 += arg1;
        Pix2D.method148(this.field1331, arg4 + 16, arg0, (byte) 107, 16, arg3 - 32);
        int var7 = (arg3 - 32) * arg3 / arg5;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg3 - 32 - var7) * arg2 / (arg5 - arg3);
        Pix2D.method148(this.field1328, arg4 + 16 + var8, arg0, (byte) 107, 16, var7);
        Pix2D.method151(var7, false, this.field1365, arg4 + 16 + var8, arg0);
        Pix2D.method151(var7, false, this.field1365, arg4 + 16 + var8, arg0 + 1);
        Pix2D.method150(arg0, arg4 + 16 + var8, 16, 0, this.field1365);
        Pix2D.method150(arg0, arg4 + 17 + var8, 16, 0, this.field1365);
        Pix2D.method151(var7, false, this.field1474, arg4 + 16 + var8, arg0 + 15);
        Pix2D.method151(var7 - 1, false, this.field1474, arg4 + 17 + var8, arg0 + 14);
        Pix2D.method150(arg0, arg4 + 15 + var8 + var7, 16, 0, this.field1474);
        Pix2D.method150(arg0 + 1, arg4 + 14 + var8 + var7, 15, 0, this.field1474);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZLkb;)V")
    private final void method405(int arg0, boolean arg1, Packet arg2) {
        this.field1396 = 0;
        this.field1119 = 0;
        this.method448(arg0, this.field1164, arg2);
        this.method441(21055, arg2, arg0);
        this.method453(arg0, arg2, -126);
        this.method414(arg0, arg2, 4);
        for (int var4 = 0; var4 < this.field1396; ++var4) {
            int var6 = this.field1397[var4];
            if (field1446 != this.field1116[var6].field348) {
                this.field1116[var6] = null;
            }
        }
        if (!arg1) {
            field1415 = this.field1369.method245();
        }
        if (arg2.field622 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field622 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1117; ++var5) {
                if (this.field1116[this.field1118[var5]] == null) {
                    signlink.reporterror(this.field1339 + " null entry in pl list - pos:" + var5 + " size:" + this.field1117);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method406(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1149 = "";
                this.field1150 = "Connecting to server...";
                this.method397(true);
            }
            this.field1430 = new ClientStream(this.method429(field1265 + 43594), this, (byte) 7);
            this.field1430.method32(this.field1371.field621, 0, 8);
            this.field1371.field622 = 0;
            this.field1466 = this.field1371.method214(-29068);
            int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1466 >> 32), (int) this.field1466 };
            this.field1196.field622 = 0;
            this.field1196.method198(10);
            this.field1196.method202(var4[0]);
            this.field1196.method202(var4[1]);
            this.field1196.method202(var4[2]);
            this.field1196.method202(var4[3]);
            this.field1196.method202(signlink.uid);
            this.field1196.method205(arg0);
            this.field1196.method205(arg1);
            this.field1196.method223(field1472, 5, field1469);
            this.field1470.field622 = 0;
            if (arg2) {
                this.field1470.method198(18);
            } else {
                this.field1470.method198(16);
            }
            this.field1470.method198(this.field1196.field622 + 36 + 1);
            this.field1470.method198(204);
            for (int var5 = 0; var5 < 9; ++var5) {
                this.field1470.method202(this.field1445[var5]);
            }
            this.field1470.method206((byte) 4, this.field1196.field622, this.field1196.field621, 0);
            this.field1196.field626 = new Isaac((byte) 68, var4);
            for (int var6 = 0; var6 < 4; ++var6) {
                var4[var6] += 50;
            }
            this.field1369 = new Isaac((byte) 68, var4);
            this.field1430.method33(this.field1470.field621, this.field1441, this.field1470.field622, 0);
            int var7 = this.field1430.method30();
            if (var7 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var15) {
                }
                this.method406(arg0, arg1, arg2);
                return;
            }
            if (var7 == 2 || var7 == 18) {
                if (var7 == 18) {
                    this.field1366 = true;
                } else {
                    this.field1366 = false;
                }
                InputTracking.method35(true, false);
                this.field1429 = true;
                this.field1196.field622 = 0;
                this.field1371.field622 = 0;
                this.field1432 = -1;
                this.field1281 = -1;
                this.field1282 = -1;
                this.field1283 = -1;
                this.field1431 = 0;
                this.field1433 = 0;
                this.field1210 = 0;
                this.field1435 = 0;
                this.field1376 = 0;
                this.field1139 = 0;
                this.field1231 = false;
                super.field17 = 0;
                for (int var8 = 0; var8 < 100; ++var8) {
                    this.field1187[var8] = null;
                }
                this.field1167 = 0;
                this.field1158 = 0;
                this.field1099 = 0;
                this.field1413 = 0;
                this.field1390 = -1;
                this.field1419 = 0;
                this.field1420 = 0;
                this.field1117 = 0;
                this.field1190 = 0;
                for (int var9 = 0; var9 < this.field1114; ++var9) {
                    this.field1116[var9] = null;
                    this.field1121[var9] = null;
                }
                for (int var10 = 0; var10 < 8192; ++var10) {
                    this.field1189[var10] = null;
                }
                this.field1487 = this.field1116[this.field1115] = new PlayerEntity();
                this.field1237.method231();
                this.field1294.method231();
                this.field1401.method231();
                for (int var11 = 0; var11 < 4; ++var11) {
                    for (int var12 = 0; var12 < 104; ++var12) {
                        for (int var13 = 0; var13 < 104; ++var13) {
                            this.field1263[var11][var12][var13] = null;
                        }
                    }
                }
                this.field1137 = new LinkList((byte) 3);
                this.field1248 = 0;
                this.field1313 = -1;
                this.field1184 = -1;
                this.field1250 = -1;
                this.field1138 = -1;
                this.field1123 = false;
                this.field1406 = 3;
                this.field1305 = false;
                this.field1231 = false;
                this.field1351 = false;
                this.field1198 = null;
                this.field1227 = 0;
                this.field1504 = true;
                this.method462(false);
                for (int var14 = 0; var14 < 5; ++var14) {
                    this.field1200[var14] = 0;
                }
                field1206 = 0;
                field1493 = 0;
                field1244 = 0;
                field1216 = 0;
                field1202 = 0;
                field1377 = 0;
                field1254 = 0;
                field1175 = 0;
                field1104 = 0;
                field1186 = 0;
                this.method411(-242);
                return;
            }
            if (var7 == 3) {
                this.field1149 = "";
                this.field1150 = "Invalid username or password.";
                return;
            }
            if (var7 == 4) {
                this.field1149 = "Your account has been disabled.";
                this.field1150 = "Please check your message-centre for details.";
                return;
            }
            if (var7 == 5) {
                this.field1149 = "Your account is already logged in.";
                this.field1150 = "Try again in 60 secs...";
                return;
            }
            if (var7 == 6) {
                this.field1149 = "RuneScape has been updated!";
                this.field1150 = "Please reload this page.";
                return;
            }
            if (var7 == 7) {
                this.field1149 = "This world is full.";
                this.field1150 = "Please use a different world.";
                return;
            }
            if (var7 == 8) {
                this.field1149 = "Unable to connect.";
                this.field1150 = "Login server offline.";
                return;
            }
            if (var7 == 9) {
                this.field1149 = "Login limit exceeded.";
                this.field1150 = "Too many connections from your address.";
                return;
            }
            if (var7 == 10) {
                this.field1149 = "Unable to connect.";
                this.field1150 = "Bad session id.";
                return;
            }
            if (var7 == 11) {
                this.field1150 = "Login server rejected session.";
                this.field1150 = "Please try again";
                return;
            }
            if (var7 == 12) {
                this.field1149 = "You need a members account to beta-test";
                this.field1150 = "Please subscribe, or play RS1 instead";
                return;
            }
            if (var7 == 13) {
                this.field1149 = "Could not complete login";
                this.field1150 = "Please try using a different world";
                return;
            }
            if (var7 == 14) {
                this.field1149 = "The server is being updated";
                this.field1150 = "Please wait 1 minute and try again";
                return;
            }
            if (var7 == 15) {
                this.field1429 = true;
                this.field1196.field622 = 0;
                this.field1371.field622 = 0;
                this.field1432 = -1;
                this.field1281 = -1;
                this.field1282 = -1;
                this.field1283 = -1;
                this.field1431 = 0;
                this.field1433 = 0;
                this.field1210 = 0;
                this.field1139 = 0;
                this.field1231 = false;
                return;
            }
            if (var7 == 16) {
                this.field1149 = "Login attempts exceeded";
                this.field1150 = "Please wait 1 minute and try again";
                return;
            }
            if (var7 == 17) {
                this.field1149 = "You are standing in a members-only area";
                this.field1150 = "To play on this world move to a free area first";
                return;
            }
        } catch (IOException var16) {
            this.field1149 = "";
            this.field1150 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method407(int arg0) {
        if (arg0 <= 0) {
            this.field1101 = 372;
        }
        if (super.field21 == 1) {
            if (super.field22 >= 8 && super.field22 <= 108 && super.field23 >= 490 && super.field23 <= 522) {
                this.field1112 = (this.field1112 + 1) % 3;
                this.field1341 = true;
                this.field1399 = true;
                this.field1196.method197(4, 206);
                this.field1196.method198(this.field1112);
                this.field1196.method198(this.field1245);
                this.field1196.method198(this.field1492);
            }
            if (super.field22 >= 137 && super.field22 <= 237 && super.field23 >= 490 && super.field23 <= 522) {
                this.field1245 = (this.field1245 + 1) % 3;
                this.field1341 = true;
                this.field1399 = true;
                this.field1196.method197(4, 206);
                this.field1196.method198(this.field1112);
                this.field1196.method198(this.field1245);
                this.field1196.method198(this.field1492);
            }
            if (super.field22 >= 275 && super.field22 <= 375 && super.field23 >= 490 && super.field23 <= 522) {
                this.field1492 = (this.field1492 + 1) % 3;
                this.field1341 = true;
                this.field1399 = true;
                this.field1196.method197(4, 206);
                this.field1196.method198(this.field1112);
                this.field1196.method198(this.field1245);
                this.field1196.method198(this.field1492);
            }
            if (super.field22 >= 416 && super.field22 <= 516 && super.field23 >= 490 && super.field23 <= 522) {
                this.method431((byte) 7);
                this.field1489 = "";
                this.field1333 = false;
                for (int var2 = 0; var2 < Component.field955.length; ++var2) {
                    if (Component.field955[var2] != null && Component.field955[var2].field964 == 600) {
                        this.field1436 = this.field1250 = Component.field955[var2].field961;
                        break;
                    }
                }
            }
            ++field1463;
            if (field1463 > 195) {
                field1463 = 0;
                this.field1196.method197(4, 29);
                this.field1196.method198(239);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method408(byte arg0) {
        SpotAnimEntity var2 = (SpotAnimEntity) this.field1294.method227();
        if (arg0 == 85) {
            while (var2 != null) {
                if (this.field1354 == var2.field409 && !var2.field415) {
                    if (field1446 >= var2.field408) {
                        var2.method117((byte) 7, this.field1192);
                        if (var2.field415) {
                            var2.method106();
                        } else {
                            this.field1148.method61(0, 775, var2, (Model) null, -1, var2.field410, false, 60, var2.field409, var2.field411, var2.field412);
                        }
                    }
                } else {
                    var2.method106();
                }
                var2 = (SpotAnimEntity) this.field1294.method229(this.field1485);
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method409(int arg0) {
        this.field1251 = new Pix8(this.field1276, "titlebox", 0);
        this.field1252 = new Pix8(this.field1276, "titlebutton", 0);
        this.field1327 = new Pix8[12];
        if (arg0 <= 0) {
            this.field1416 = !this.field1416;
        }
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field1327[var2] = new Pix8(this.field1276, "runes", var2);
        }
        this.field1392 = new Pix32(128, 265);
        this.field1393 = new Pix32(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field1392.field579[var3] = this.field1127.field671[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field1393.field579[var4] = this.field1128.field671[var4];
        }
        this.field1260 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field1260[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field1260[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1260[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1260[var8 + 192] = 16777215;
        }
        this.field1261 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1261[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1261[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1261[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1261[var12 + 192] = 16777215;
        }
        this.field1262 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1262[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1262[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1262[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1262[var16 + 192] = 16777215;
        }
        this.field1259 = new int[256];
        this.field1256 = new int[32768];
        this.field1257 = new int[32768];
        this.method399((byte) 7, (Pix8) null);
        this.field1246 = new int[32768];
        this.field1247 = new int[32768];
        this.method13(10, 0, "Connecting to fileserver");
        if (!this.field1240) {
            this.field1135 = true;
            this.field1240 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method410(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg2;
        if (arg1 <= 0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        return ((arg0 & 16711935) * var5 + (arg3 & 16711935) * arg2 & -16711936) + ((arg0 & 65280) * var5 + (arg3 & 65280) * arg2 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method411(int arg0) {
        if (this.field1412 == null) {
            this.method363((byte) 3);
            super.field13 = null;
            this.field1124 = null;
            if (arg0 < 0) {
                this.field1125 = null;
                this.field1126 = null;
                this.field1127 = null;
                this.field1128 = null;
                this.field1129 = null;
                this.field1130 = null;
                this.field1131 = null;
                this.field1132 = null;
                this.field1412 = new PixMap(this.method11((byte) 9), 479, 96, true);
                this.field1410 = new PixMap(this.method11((byte) 9), 168, 160, true);
                Pix2D.method147(true);
                this.field1311.method185(0, 0, 0);
                this.field1409 = new PixMap(this.method11((byte) 9), 190, 261, true);
                this.field1411 = new PixMap(this.method11((byte) 9), 512, 334, true);
                Pix2D.method147(true);
                this.field1224 = new PixMap(this.method11((byte) 9), 501, 61, true);
                this.field1225 = new PixMap(this.method11((byte) 9), 288, 40, true);
                this.field1226 = new PixMap(this.method11((byte) 9), 269, 66, true);
                this.field1296 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method412(int arg0) {
        int var2 = (this.field1487.field304 >> 7) + this.field1108;
        int var3 = (this.field1487.field305 >> 7) + this.field1109;
        if (var2 >= 2944 && var2 < 3392 && var3 >= 3520 && var3 < 6400) {
            this.field1275 = (var3 - 3520) / 8 + 1;
        } else if (var2 >= 2944 && var2 < 3392 && var3 >= 9920 && var3 < 12800) {
            this.field1275 = (var3 - 9920) / 8 + 1;
        } else {
            this.field1275 = 0;
        }
        this.field1299 = 0;
        if (var2 >= 3328 && var2 < 3392 && var3 >= 3200 && var3 < 3264) {
            int var4 = var2 & 63;
            int var5 = var3 & 63;
            if (var4 >= 4 && var4 <= 29 && var5 >= 44 && var5 <= 58) {
                this.field1299 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 44 && var5 <= 58) {
                this.field1299 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 25 && var5 <= 39) {
                this.field1299 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 25 && var5 <= 39) {
                this.field1299 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 6 && var5 <= 20) {
                this.field1299 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 6 && var5 <= 20) {
                this.field1299 = 1;
            }
        }
        if (this.field1299 == 0 && var2 >= 3328 && var2 <= 3393 && var3 >= 3203 && var3 <= 3325) {
            this.field1299 = 2;
        }
        this.field1449 = 0;
        int var6 = 71 / arg0;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1449 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1449 = 1;
        }
        if (this.field1449 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1449 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method413(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field1435 > 0) {
            this.method464((byte) 38);
        } else {
            this.field1411.method234(0);
            this.field1344.method187("Connection lost", 144, 257, (byte) 0, 0);
            this.field1344.method187("Connection lost", 143, 256, (byte) 0, 16777215);
            this.field1344.method187("Please wait - attempting to reestablish", 159, 257, (byte) 0, 0);
            this.field1344.method187("Please wait - attempting to reestablish", 158, 256, (byte) 0, 16777215);
            this.field1411.method235(2, super.field12, 8, 11);
            this.field1419 = 0;
            ClientStream var3 = this.field1430;
            this.field1429 = false;
            this.method406(this.field1339, this.field1340, true);
            if (!this.field1429) {
                this.method464((byte) 38);
            }
            try {
                var3.method29();
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILkb;I)V")
    private final void method414(int arg0, Packet arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1119; ++var4) {
            int var5 = this.field1120[var4];
            PlayerEntity var6 = this.field1116[var5];
            int var7 = arg1.method208();
            if ((var7 & 128) == 128) {
                var7 += arg1.method208() << 8;
            }
            this.method460(-141, var6, arg1, var7, var5);
        }
        if (arg2 < 4 || arg2 > 4) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method415(int arg0) {
        int var2 = this.field1219 * 128 + 64;
        int var3 = this.field1220 * 128 + 64;
        int var4 = this.method419(this.field1354, this.field1219, 0, this.field1220) - this.field1221;
        if (this.field1094 < var2) {
            this.field1094 += (var2 - this.field1094) * this.field1223 / 1000 + this.field1222;
            if (this.field1094 > var2) {
                this.field1094 = var2;
            }
        }
        if (this.field1094 > var2) {
            this.field1094 -= (this.field1094 - var2) * this.field1223 / 1000 + this.field1222;
            if (this.field1094 < var2) {
                this.field1094 = var2;
            }
        }
        if (this.field1095 < var4) {
            this.field1095 += (var4 - this.field1095) * this.field1223 / 1000 + this.field1222;
            if (this.field1095 > var4) {
                this.field1095 = var4;
            }
        }
        if (this.field1095 > var4) {
            this.field1095 -= (this.field1095 - var4) * this.field1223 / 1000 + this.field1222;
            if (this.field1095 < var4) {
                this.field1095 = var4;
            }
        }
        if (this.field1096 < var3) {
            this.field1096 += (var3 - this.field1096) * this.field1223 / 1000 + this.field1222;
            if (this.field1096 > var3) {
                this.field1096 = var3;
            }
        }
        if (this.field1096 > var3) {
            this.field1096 -= (this.field1096 - var3) * this.field1223 / 1000 + this.field1222;
            if (this.field1096 < var3) {
                this.field1096 = var3;
            }
        }
        int var5 = this.field1494 * 128 + 64;
        if (arg0 != -40687) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        int var7 = this.field1495 * 128 + 64;
        int var8 = this.method419(this.field1354, this.field1494, 0, this.field1495) - this.field1496;
        int var9 = var5 - this.field1094;
        int var10 = var8 - this.field1095;
        int var11 = var7 - this.field1096;
        int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
        int var13 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 2047;
        int var14 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 2047;
        if (var13 < 128) {
            var13 = 128;
        }
        if (var13 > 383) {
            var13 = 383;
        }
        if (this.field1097 < var13) {
            this.field1097 += (var13 - this.field1097) * this.field1498 / 1000 + this.field1497;
            if (this.field1097 > var13) {
                this.field1097 = var13;
            }
        }
        if (this.field1097 > var13) {
            this.field1097 -= (this.field1097 - var13) * this.field1498 / 1000 + this.field1497;
            if (this.field1097 < var13) {
                this.field1097 = var13;
            }
        }
        int var15 = var14 - this.field1098;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 > 0) {
            this.field1098 += this.field1498 * var15 / 1000 + this.field1497;
        }
        if (var15 < 0) {
            this.field1098 -= -var15 * this.field1498 / 1000 + this.field1497;
        }
        int var16 = var14 - this.field1098;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 < 0 && var15 > 0 || var16 > 0 && var15 < 0) {
            this.field1098 = var14;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method416(boolean arg0) {
        ++this.field1188;
        this.method430(false);
        this.method371(-3);
        this.method390(665);
        this.method408((byte) 85);
        this.method459(3);
        if (!this.field1455) {
            int var2 = this.field1277;
            if (this.field1107 / 256 > var2) {
                var2 = this.field1107 / 256;
            }
            if (this.field1163[4] && this.field1423[4] + 128 > var2) {
                var2 = this.field1423[4] + 128;
            }
            int var3 = this.field1347 + this.field1278 & 2047;
            this.method365(5, this.field1448, var2 * 3 + 600, this.field1447, this.method420(this.field1487.field304, this.field1447, this.field1354, this.field1448, this.field1324, this.field1487.field305) - 50, var3, var2);
        }
        int var4;
        if (!this.field1455) {
            var4 = this.method432(6);
        } else {
            var4 = this.method433(true);
        }
        int var5 = this.field1094;
        int var6 = this.field1095;
        int var7 = this.field1096;
        int var8 = this.field1097;
        int var9 = this.field1098;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field1163[var10]) {
                int var13 = (int) (Math.random() * (double) (this.field1465[var10] * 2 + 1) - (double) this.field1465[var10] + Math.sin((double) this.field1295[var10] / 100.0D * (double) this.field1153[var10]) * (double) this.field1423[var10]);
                if (var10 == 0) {
                    this.field1094 += var13;
                }
                if (var10 == 1) {
                    this.field1095 += var13;
                }
                if (var10 == 2) {
                    this.field1096 += var13;
                }
                if (var10 == 3) {
                    this.field1098 = this.field1098 + var13 & 2047;
                }
                if (var10 == 4) {
                    this.field1097 += var13;
                    if (this.field1097 < 128) {
                        this.field1097 = 128;
                    }
                    if (this.field1097 > 383) {
                        this.field1097 = 383;
                    }
                }
            }
        }
        int var11 = Pix3D.field569;
        Model.field520 = true;
        Model.field523 = 0;
        Model.field521 = super.field19 - 8;
        Model.field522 = super.field20 - 11;
        Pix2D.method147(true);
        this.field1148.method89(this.field1095, this.field1096, this.field1097, this.field1098, var4, (byte) 2, this.field1094);
        this.field1148.method64(0);
        this.method466(3);
        this.method398(-617);
        this.method421(true, var11);
        this.method456(-311);
        this.field1411.method235(2, super.field12, 8, 11);
        if (!arg0) {
            for (int var12 = 1; var12 > 0; ++var12) {
            }
        }
        this.field1094 = var5;
        this.field1095 = var6;
        this.field1096 = var7;
        this.field1097 = var8;
        this.field1098 = var9;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method417(String arg0, int arg1) {
        this.field1431 += arg1;
        signlink.music = arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;II)Lub;")
    public final Jagfile method418(String arg0, int arg1, String arg2, int arg3, int arg4) {
        if (arg4 <= 0) {
            field1332 = !field1332;
        }
        int var6 = 5;
        byte[] var7 = signlink.cacheload(arg0);
        if (var7 != null) {
            this.field1367.reset();
            this.field1367.update(var7);
            int var8 = (int) this.field1367.getValue();
            if (arg1 != var8) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(var7, -856);
        } else {
            while (var7 == null) {
                this.method13(arg3, 0, "Requesting " + arg2);
                try {
                    int var10 = 0;
                    DataInputStream var11 = this.method400(arg0 + arg1);
                    byte[] var12 = new byte[6];
                    var11.readFully(var12, 0, 6);
                    Packet var13 = new Packet(var12, field1332);
                    var13.field622 = 3;
                    int var14 = var13.method212() + 6;
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
                            this.method13(arg3, 0, "Loading " + arg2 + " - " + var18 + "%");
                        }
                        var10 = var18;
                    }
                    var11.close();
                } catch (IOException var22) {
                    var7 = null;
                    for (int var19 = var6; var19 > 0; --var19) {
                        this.method13(arg3, 0, "Error loading - Will retry in " + var19 + " secs.");
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
            return new Jagfile(var7, -856);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)I")
    public final int method419(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 >> 7;
        int var6 = arg3 >> 7;
        int var7 = arg0;
        if (arg0 < 3 && (this.field1302[1][var5][var6] & 2) == 2) {
            var7 = arg0 + 1;
        }
        int var8 = arg1 & 127;
        int var9 = arg3 & 127;
        int var10 = (128 - var8) * this.field1398[var7][var5][var6] + this.field1398[var7][var5 + 1][var6] * var8 >> 7;
        this.field1431 += arg2;
        int var11 = (128 - var8) * this.field1398[var7][var5][var6 + 1] + this.field1398[var7][var5 + 1][var6 + 1] * var8 >> 7;
        return (128 - var9) * var10 + var9 * var11 >> 7;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)I")
    public final int method420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2;
        if (arg2 < 3 && (this.field1302[1][arg0 >> 7][arg5 >> 7] & 2) == 2) {
            var7 = arg2 + 1;
        }
        int var8 = arg1 >> 7;
        int var9 = arg3 >> 7;
        if (arg4 != 0) {
            this.field1432 = this.field1371.method208();
        }
        int var10 = arg1 & 127;
        int var11 = arg3 & 127;
        int var12 = (128 - var10) * this.field1398[var7][var8][var9] + this.field1398[var7][var8 + 1][var9] * var10 >> 7;
        int var13 = (128 - var10) * this.field1398[var7][var8][var9 + 1] + this.field1398[var7][var8 + 1][var9 + 1] * var10 >> 7;
        return (128 - var11) * var12 + var11 * var13 >> 7;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method421(boolean arg0, int arg1) {
        this.field1429 &= arg0;
        if (!field1267) {
            if (Pix3D.field568[17] >= arg1) {
                Pix8 var3 = Pix3D.field562[17];
                int var4 = var3.field596 * var3.field595 - 1;
                int var5 = this.field1192 * var3.field595 * 2;
                byte[] var6 = var3.field593;
                byte[] var7 = this.field1106;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field593 = var7;
                this.field1106 = var6;
                Pix3D.method159(true, 17);
            }
            if (Pix3D.field568[24] >= arg1) {
                Pix8 var9 = Pix3D.field562[24];
                int var10 = var9.field596 * var9.field595 - 1;
                int var11 = this.field1192 * var9.field595 * 2;
                byte[] var12 = var9.field593;
                byte[] var13 = this.field1106;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field593 = var13;
                this.field1106 = var12;
                Pix3D.method159(true, 24);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)Z")
    public final boolean method422(int arg0) {
        if (arg0 != 4) {
            this.method6();
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)Ljava/lang/String;")
    private static final String method423(int arg0, int arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1 != 9) {
            field1415 = 180;
        }
        if (var2.length() > 8) {
            var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
        } else if (var2.length() > 4) {
            var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
        }
        return " " + var2;
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 204);
            if (arg0.length != 4) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
            } else {
                field1264 = Integer.parseInt(arg0[0]);
                field1265 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method461(9);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
                        return;
                    }
                    method403(-461);
                }
                if (arg0[3].equals("free")) {
                    field1266 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
                        return;
                    }
                    field1266 = true;
                }
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(true, 789, 532);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)Ljava/lang/String;")
    public final String method424(boolean arg0) {
        this.field1429 &= arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field15 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II[BI)V")
    public final void method425(int arg0, int arg1, byte[] arg2, int arg3) {
        signlink.jinglesave(arg2, arg3, arg0);
        while (arg1 >= 0) {
            this.field1196.method198(12);
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method426(int arg0) {
        if (arg0 < 8 || arg0 > 8) {
            this.field1196.method198(74);
        }
        if (this.field1099 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1401.method227(); var2 != null; var2 = (LocSpawned) this.field1401.method229(this.field1485)) {
                if (field1446 >= var2.field651) {
                    this.method455(true, var2.field646, var2.field649, var2.field645, var2.field644, var2.field648, var2.field647, var2.field650);
                    var2.method106();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method427(int arg0) {
        if (arg0 < 0) {
            if (this.field1336 == 0) {
                int var2 = super.field21;
                if (this.field1158 == 1 && super.field22 >= 520 && super.field23 >= 165 && super.field22 <= 788 && super.field23 <= 230) {
                    var2 = 0;
                }
                if (this.field1231) {
                    if (var2 != 1) {
                        int var3 = super.field19;
                        int var4 = super.field20;
                        if (this.field1316 == 0) {
                            var3 -= 8;
                            var4 -= 11;
                        }
                        if (this.field1316 == 1) {
                            var3 -= 562;
                            var4 -= 231;
                        }
                        if (var3 < this.field1317 - 10 || var3 > this.field1319 + this.field1317 + 10 || var4 < this.field1318 - 10 || var4 > this.field1320 + this.field1318 + 10) {
                            this.field1231 = false;
                            if (this.field1316 == 1) {
                                this.field1238 = true;
                            }
                        }
                    }
                    if (var2 == 1) {
                        int var5 = this.field1317;
                        int var6 = this.field1318;
                        int var7 = this.field1319;
                        int var8 = super.field22;
                        int var9 = super.field23;
                        if (this.field1316 == 0) {
                            var8 -= 8;
                            var9 -= 11;
                        }
                        if (this.field1316 == 1) {
                            var8 -= 562;
                            var9 -= 231;
                        }
                        int var10 = -1;
                        for (int var11 = 0; var11 < this.field1139; ++var11) {
                            int var12 = (this.field1139 - 1 - var11) * 15 + var6 + 31;
                            if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                                var10 = var11;
                            }
                        }
                        if (var10 != -1) {
                            this.method395((byte) 9, var10);
                        }
                        this.field1231 = false;
                        if (this.field1316 == 1) {
                            this.field1238 = true;
                            return;
                        }
                    }
                } else {
                    if (var2 == 1 && this.field1139 > 0) {
                        int var13 = this.field1502[this.field1139 - 1];
                        if (var13 == 71 || var13 == 897 || var13 == 500 || var13 == 837 || var13 == 460 || var13 == 382 || var13 == 635 || var13 == 939 || var13 == 274 || var13 == 618 || var13 == 215) {
                            int var14 = this.field1500[this.field1139 - 1];
                            int var15 = this.field1501[this.field1139 - 1];
                            Component var16 = Component.field955[var15];
                            if (var16.field981) {
                                this.field1093 = false;
                                this.field1230 = 0;
                                this.field1334 = var15;
                                this.field1335 = var14;
                                this.field1336 = 2;
                                this.field1337 = super.field22;
                                this.field1338 = super.field23;
                                if (Component.field955[var15].field961 == this.field1250) {
                                    this.field1336 = 1;
                                }
                                if (Component.field955[var15].field961 == this.field1184) {
                                    this.field1336 = 3;
                                }
                                return;
                            }
                        }
                    }
                    if (var2 == 1 && this.field1353 == 1 && this.field1139 > 2) {
                        var2 = 2;
                    }
                    if (var2 == 1 && this.field1139 > 0) {
                        this.method395((byte) 9, this.field1139 - 1);
                    }
                    if (var2 != 2 || this.field1139 <= 0) {
                        return;
                    }
                    this.method437(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method428(boolean arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1246[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1246[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1247[var14] = (this.field1246[var14 - 1] + this.field1246[var14 + 1] + this.field1246[var14 - 128] + this.field1246[var14 + 128]) / 4;
            }
        }
        this.field1437 += 128;
        if (!arg0) {
            if (this.field1437 > this.field1256.length) {
                this.field1437 -= this.field1256.length;
                int var6 = (int) (Math.random() * 12.0D);
                this.method399((byte) 7, this.field1327[var6]);
            }
            for (int var7 = 1; var7 < var2 - 1; ++var7) {
                for (int var10 = 1; var10 < 127; ++var10) {
                    int var11 = (var7 << 7) + var10;
                    int var12 = this.field1247[var11 + 128] - this.field1256[this.field1437 + var11 & this.field1256.length - 1] / 5;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    this.field1246[var11] = var12;
                }
            }
            for (int var8 = 0; var8 < var2 - 1; ++var8) {
                this.field1301[var8] = this.field1301[var8 + 1];
            }
            this.field1301[var2 - 1] = (int) (Math.sin((double) field1446 / 14.0D) * 16.0D + Math.sin((double) field1446 / 15.0D) * 14.0D + Math.sin((double) field1446 / 16.0D) * 12.0D);
            if (this.field1172 > 0) {
                this.field1172 -= 4;
            }
            if (this.field1173 > 0) {
                this.field1173 -= 4;
            }
            if (this.field1172 == 0 && this.field1173 == 0) {
                int var9 = (int) (Math.random() * 2000.0D);
                if (var9 == 0) {
                    this.field1172 = 1024;
                }
                if (var9 == 1) {
                    this.field1173 = 1024;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method429(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method430(boolean arg0) {
        if (arg0) {
            field1332 = !field1332;
        }
        if (this.field1487.field304 >> 7 == this.field1419 && this.field1487.field305 >> 7 == this.field1420) {
            this.field1419 = 0;
        }
        for (int var2 = -1; var2 < this.field1117; ++var2) {
            PlayerEntity var3;
            int var4;
            if (var2 == -1) {
                var3 = this.field1487;
                var4 = this.field1115 << 14;
            } else {
                var3 = this.field1116[this.field1118[var2]];
                var4 = this.field1118[var2] << 14;
            }
            if (var3 != null && var3.method110(false)) {
                var3.field379 = false;
                if ((field1267 && this.field1117 > 50 || this.field1117 > 200) && var2 != -1 && var3.field328 == var3.field309) {
                    var3.field379 = true;
                }
                int var5 = var3.field304 >> 7;
                int var6 = var3.field305 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field374 != null && field1446 >= var3.field369 && field1446 < var3.field370) {
                        var3.field379 = false;
                        var3.field368 = this.method419(this.field1354, var3.field304, 0, var3.field305);
                        this.field1148.method62(var3.field305, var3.field378, var4, 2, this.field1354, var3, 60, var3.field368, var3.field376, var3.field375, var3.field306, (Model) null, var3.field377, var3.field304);
                    } else {
                        if ((var3.field304 & 127) == 64 && (var3.field305 & 127) == 64) {
                            if (this.field1217[var5][var6] == this.field1188) {
                                continue;
                            }
                            this.field1217[var5][var6] = this.field1188;
                        }
                        var3.field368 = this.method419(this.field1354, var3.field304, 0, var3.field305);
                        this.field1148.method61(var3.field306, 775, var3, (Model) null, var4, var3.field304, var3.field307, 60, this.field1354, var3.field305, var3.field368);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method431(byte arg0) {
        this.field1196.method197(4, 40);
        if (this.field1138 != -1) {
            this.field1138 = -1;
            this.field1238 = true;
            this.field1123 = false;
            this.field1402 = true;
        }
        if (this.field1184 != -1) {
            this.field1184 = -1;
            this.field1399 = true;
            this.field1123 = false;
        }
        this.field1250 = -1;
        if (arg0 != 7) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method9(int arg0) {
        if (arg0 > 0) {
            if (!this.field1468 && !this.field1407 && !this.field1274) {
                if (!this.field1429) {
                    this.method397(true);
                } else {
                    this.method388(-659);
                }
                this.field1236 = 0;
            } else {
                this.method391(this.field1326);
            }
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)I")
    public final int method432(int arg0) {
        if (arg0 != 6) {
            this.field1196.method198(7);
        }
        int var2 = 3;
        if (this.field1097 < 310) {
            int var3 = this.field1094 >> 7;
            int var4 = this.field1096 >> 7;
            int var5 = this.field1487.field304 >> 7;
            int var6 = this.field1487.field305 >> 7;
            if ((this.field1302[this.field1354][var3][var4] & 4) != 0) {
                var2 = this.field1354;
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
                    if ((this.field1302[this.field1354][var3][var4] & 4) != 0) {
                        var2 = this.field1354;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field1302[this.field1354][var3][var4] & 4) != 0) {
                            var2 = this.field1354;
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
                    if ((this.field1302[this.field1354][var3][var4] & 4) != 0) {
                        var2 = this.field1354;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field1302[this.field1354][var3][var4] & 4) != 0) {
                            var2 = this.field1354;
                        }
                    }
                }
            }
        }
        if ((this.field1302[this.field1354][this.field1487.field304 >> 7][this.field1487.field305 >> 7] & 4) != 0) {
            var2 = this.field1354;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)I")
    public final int method433(boolean arg0) {
        int var2 = this.method419(this.field1354, this.field1094, 0, this.field1096);
        if (!arg0) {
            this.method6();
        }
        return var2 - this.field1095 < 800 && (this.field1302[this.field1354][this.field1094 >> 7][this.field1096 >> 7] & 4) != 0 ? this.field1354 : 3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIIIIIIZII)Z")
    public final boolean method434(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        byte var12 = 104;
        byte var13 = 104;
        for (int var14 = 0; var14 < var12; ++var14) {
            for (int var34 = 0; var34 < var13; ++var34) {
                this.field1444[var14][var34] = 0;
                this.field1417[var14][var34] = 99999999;
            }
        }
        int var15 = arg2;
        int var16 = arg5;
        this.field1444[arg2][arg5] = 99;
        this.field1417[arg2][arg5] = 0;
        byte var17 = 0;
        int var18 = 0;
        this.field1439[var17] = arg2;
        int var35 = var17 + 1;
        this.field1440[var17] = arg5;
        boolean var19 = false;
        int var20 = this.field1439.length;
        int[][] var21 = this.field1140[this.field1354].field927;
        while (var35 != var18) {
            var15 = this.field1439[var18];
            var16 = this.field1440[var18];
            var18 = (var18 + 1) % var20;
            if (arg10 == var15 && arg1 == var16) {
                var19 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && this.field1140[this.field1354].method303(0, var15, arg6, arg10, var16, arg7 - 1, arg1)) {
                    var19 = true;
                    break;
                }
                if (arg7 < 10 && this.field1140[this.field1354].method304(arg7 - 1, arg1, arg6, var15, arg10, 219, var16)) {
                    var19 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg3 != 0 && this.field1140[this.field1354].method305(arg10, arg1, -100, var16, var15, arg3, arg9, arg4)) {
                var19 = true;
                break;
            }
            int var33 = this.field1417[var15][var16] + 1;
            if (var15 > 0 && this.field1444[var15 - 1][var16] == 0 && (var21[var15 - 1][var16] & 2621704) == 0) {
                this.field1439[var35] = var15 - 1;
                this.field1440[var35] = var16;
                var35 = (var35 + 1) % var20;
                this.field1444[var15 - 1][var16] = 2;
                this.field1417[var15 - 1][var16] = var33;
            }
            if (var15 < var12 - 1 && this.field1444[var15 + 1][var16] == 0 && (var21[var15 + 1][var16] & 2621824) == 0) {
                this.field1439[var35] = var15 + 1;
                this.field1440[var35] = var16;
                var35 = (var35 + 1) % var20;
                this.field1444[var15 + 1][var16] = 8;
                this.field1417[var15 + 1][var16] = var33;
            }
            if (var16 > 0 && this.field1444[var15][var16 - 1] == 0 && (var21[var15][var16 - 1] & 2621698) == 0) {
                this.field1439[var35] = var15;
                this.field1440[var35] = var16 - 1;
                var35 = (var35 + 1) % var20;
                this.field1444[var15][var16 - 1] = 1;
                this.field1417[var15][var16 - 1] = var33;
            }
            if (var16 < var13 - 1 && this.field1444[var15][var16 + 1] == 0 && (var21[var15][var16 + 1] & 2621728) == 0) {
                this.field1439[var35] = var15;
                this.field1440[var35] = var16 + 1;
                var35 = (var35 + 1) % var20;
                this.field1444[var15][var16 + 1] = 4;
                this.field1417[var15][var16 + 1] = var33;
            }
            if (var15 > 0 && var16 > 0 && this.field1444[var15 - 1][var16 - 1] == 0 && (var21[var15 - 1][var16 - 1] & 2621710) == 0 && (var21[var15 - 1][var16] & 2621704) == 0 && (var21[var15][var16 - 1] & 2621698) == 0) {
                this.field1439[var35] = var15 - 1;
                this.field1440[var35] = var16 - 1;
                var35 = (var35 + 1) % var20;
                this.field1444[var15 - 1][var16 - 1] = 3;
                this.field1417[var15 - 1][var16 - 1] = var33;
            }
            if (var15 < var12 - 1 && var16 > 0 && this.field1444[var15 + 1][var16 - 1] == 0 && (var21[var15 + 1][var16 - 1] & 2621827) == 0 && (var21[var15 + 1][var16] & 2621824) == 0 && (var21[var15][var16 - 1] & 2621698) == 0) {
                this.field1439[var35] = var15 + 1;
                this.field1440[var35] = var16 - 1;
                var35 = (var35 + 1) % var20;
                this.field1444[var15 + 1][var16 - 1] = 9;
                this.field1417[var15 + 1][var16 - 1] = var33;
            }
            if (var15 > 0 && var16 < var13 - 1 && this.field1444[var15 - 1][var16 + 1] == 0 && (var21[var15 - 1][var16 + 1] & 2621752) == 0 && (var21[var15 - 1][var16] & 2621704) == 0 && (var21[var15][var16 + 1] & 2621728) == 0) {
                this.field1439[var35] = var15 - 1;
                this.field1440[var35] = var16 + 1;
                var35 = (var35 + 1) % var20;
                this.field1444[var15 - 1][var16 + 1] = 6;
                this.field1417[var15 - 1][var16 + 1] = var33;
            }
            if (var15 < var12 - 1 && var16 < var13 - 1 && this.field1444[var15 + 1][var16 + 1] == 0 && (var21[var15 + 1][var16 + 1] & 2621920) == 0 && (var21[var15 + 1][var16] & 2621824) == 0 && (var21[var15][var16 + 1] & 2621728) == 0) {
                this.field1439[var35] = var15 + 1;
                this.field1440[var35] = var16 + 1;
                var35 = (var35 + 1) % var20;
                this.field1444[var15 + 1][var16 + 1] = 12;
                this.field1417[var15 + 1][var16 + 1] = var33;
            }
        }
        if (!var19) {
            if (arg0) {
                int var22 = 100;
                for (int var23 = 1; var23 < 2; ++var23) {
                    for (int var24 = arg10 - var23; var24 <= arg10 + var23; ++var24) {
                        for (int var25 = arg1 - var23; var25 <= arg1 + var23; ++var25) {
                            if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && this.field1417[var24][var25] < var22) {
                                var22 = this.field1417[var24][var25];
                                var15 = var24;
                                var16 = var25;
                                var19 = true;
                            }
                        }
                    }
                    if (var19) {
                        break;
                    }
                }
            }
            if (!var19) {
                return false;
            }
        }
        byte var26 = 0;
        this.field1439[var26] = var15;
        if (arg8) {
            this.field1349 = -257;
        }
        int var36 = var26 + 1;
        this.field1440[var26] = var16;
        int var27;
        int var28 = var27 = this.field1444[var15][var16];
        while (arg2 != var15 || arg5 != var16) {
            if (var27 != var28) {
                var27 = var28;
                this.field1439[var36] = var15;
                this.field1440[var36++] = var16;
            }
            if ((var28 & 2) != 0) {
                ++var15;
            } else if ((var28 & 8) != 0) {
                --var15;
            }
            if ((var28 & 1) != 0) {
                ++var16;
            } else if ((var28 & 4) != 0) {
                --var16;
            }
            var28 = this.field1444[var15][var16];
        }
        if (var36 > 0) {
            int var29 = var36;
            if (var36 > 25) {
                var29 = 25;
            }
            --var36;
            int var30 = this.field1439[var36];
            int var31 = this.field1440[var36];
            field1216 += var29;
            if (field1216 >= 121) {
                this.field1196.method197(4, 241);
                this.field1196.method199(19217);
            }
            if (super.field24[5] == 1) {
                this.field1196.method197(4, 205);
            } else {
                this.field1196.method197(4, 169);
            }
            this.field1196.method198(var29 + var29 + 2);
            this.field1196.method199(this.field1108 + var30);
            this.field1196.method199(this.field1109 + var31);
            this.field1419 = this.field1439[0];
            this.field1420 = this.field1440[0];
            for (int var32 = 1; var32 < var29; ++var32) {
                --var36;
                this.field1196.method198(this.field1439[var36] - var30);
                this.field1196.method198(this.field1440[var36] - var31);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILkb;I)V")
    private final void method435(int arg0, Packet arg1, int arg2) {
        this.field1396 = 0;
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        this.field1119 = 0;
        this.method454(arg2, arg1, false);
        this.method376(arg2, false, arg1);
        this.method452(arg2, 0, arg1);
        for (int var5 = 0; var5 < this.field1396; ++var5) {
            int var7 = this.field1397[var5];
            if (field1446 != this.field1189[var7].field348) {
                this.field1189[var7].field357 = null;
                this.field1189[var7] = null;
            }
        }
        if (arg1.field622 != arg2) {
            signlink.reporterror(this.field1339 + " size mismatch in getnpcpos - pos:" + arg1.field622 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field1190; ++var6) {
                if (this.field1189[this.field1191[var6]] == null) {
                    signlink.reporterror(this.field1339 + " null entry in npc list - pos:" + var6 + " size:" + this.field1190);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method436(int arg0) {
        if (this.field1210 > 1) {
            --this.field1210;
        }
        if (this.field1435 > 0) {
            --this.field1435;
        }
        for (int var2 = 0; var2 < 5 && this.method442(-17511); ++var2) {
        }
        if (this.field1429) {
            int var10002;
            for (int var3 = 0; var3 < this.field1413; ++var3) {
                if (this.field1403[var3] <= 0) {
                    boolean var4 = false;
                    try {
                        if (this.field1249[var3] == this.field1228 && this.field1424[var3] == this.field1229) {
                            if (!this.method422(4)) {
                                var4 = true;
                            }
                        } else {
                            Packet var5 = Wave.method263(this.field1249[var3], this.field1349, this.field1424[var3]);
                            if (System.currentTimeMillis() + (long) (var5.field622 / 22) > (long) (this.field1157 / 22) + this.field1408) {
                                this.field1157 = var5.field622;
                                this.field1408 = System.currentTimeMillis();
                                if (this.method370((byte) 79, var5.field621, var5.field622)) {
                                    this.field1228 = this.field1249[var3];
                                    this.field1229 = this.field1424[var3];
                                } else {
                                    var4 = true;
                                }
                            }
                        }
                    } catch (Exception var20) {
                    }
                    if (var4 && this.field1403[var3] != -5) {
                        this.field1403[var3] = -5;
                    } else {
                        --this.field1413;
                        for (int var7 = var3; var7 < this.field1413; ++var7) {
                            this.field1249[var7] = this.field1249[var7 + 1];
                            this.field1424[var7] = this.field1424[var7 + 1];
                            this.field1403[var7] = this.field1403[var7 + 1];
                        }
                        --var3;
                    }
                } else {
                    var10002 = this.field1403[var3]--;
                }
            }
            if (InputTracking.field71) {
                Packet var8 = InputTracking.method36(38238);
                if (var8 != null) {
                    this.field1196.method197(4, 196);
                    this.field1196.method199(var8.field622);
                    this.field1196.method206((byte) 4, var8.field622, var8.field621, 0);
                    var8.method196(933);
                }
            }
            ++this.field1433;
            if (this.field1433 > 750) {
                this.method413(0);
            }
            this.method373(22801);
            this.method381((byte) 5);
            this.method444(true);
            this.method426(8);
            if (arg0 != 19955) {
                this.field1432 = -1;
            }
            ++this.field1192;
            if (this.field1235 != 0) {
                this.field1234 += 20;
                if (this.field1234 >= 400) {
                    this.field1235 = 0;
                }
            }
            if (this.field1480 != 0) {
                ++this.field1477;
                if (this.field1477 >= 15) {
                    if (this.field1480 == 2) {
                        this.field1238 = true;
                    }
                    if (this.field1480 == 3) {
                        this.field1399 = true;
                    }
                    this.field1480 = 0;
                }
            }
            if (this.field1336 != 0) {
                ++this.field1230;
                if (super.field19 > this.field1337 + 5 || super.field19 < this.field1337 - 5 || super.field20 > this.field1338 + 5 || super.field20 < this.field1338 - 5) {
                    this.field1093 = true;
                }
                if (super.field18 == 0) {
                    if (this.field1336 == 2) {
                        this.field1238 = true;
                    }
                    if (this.field1336 == 3) {
                        this.field1399 = true;
                    }
                    this.field1336 = 0;
                    if (this.field1093 && this.field1230 >= 5) {
                        this.field1315 = -1;
                        this.method374(this.field1122);
                        if (this.field1334 == this.field1315 && this.field1335 != this.field1314) {
                            Component var9 = Component.field955[this.field1334];
                            int var10 = var9.field956[this.field1314];
                            var9.field956[this.field1314] = var9.field956[this.field1335];
                            var9.field956[this.field1335] = var10;
                            int var11 = var9.field957[this.field1314];
                            var9.field957[this.field1314] = var9.field957[this.field1335];
                            var9.field957[this.field1335] = var11;
                            this.field1196.method197(4, 162);
                            this.field1196.method199(this.field1334);
                            this.field1196.method199(this.field1335);
                            this.field1196.method199(this.field1314);
                        }
                    } else if (this.field1353 == 1 && this.field1139 > 2) {
                        this.method437(true);
                    } else if (this.field1139 > 0) {
                        this.method395((byte) 9, this.field1139 - 1);
                    }
                    this.field1477 = 10;
                    super.field21 = 0;
                }
            }
            if (World3D.field256 != -1) {
                int var12 = World3D.field256;
                int var13 = World3D.field257;
                boolean var14 = this.method434(true, var13, this.field1487.field352[0], 0, 0, this.field1487.field353[0], 0, 0, this.field1151, 0, var12);
                World3D.field256 = -1;
                if (var14) {
                    this.field1232 = super.field22;
                    this.field1233 = super.field23;
                    this.field1235 = 1;
                    this.field1234 = 0;
                }
            }
            if (super.field21 == 1 && this.field1198 != null) {
                this.field1198 = null;
                this.field1399 = true;
                super.field21 = 0;
            }
            this.method427(-127);
            this.method446((byte) -86);
            this.method393(false);
            this.method407(699);
            if (super.field18 == 1 || super.field21 == 1) {
                ++this.field1236;
            }
            if (this.field1099 == 2) {
                this.method378((byte) 5);
            }
            if (this.field1099 == 2 && this.field1455) {
                this.method415(this.field1101);
            }
            for (int var15 = 0; var15 < 5; ++var15) {
                var10002 = this.field1153[var15]++;
            }
            this.method440(0);
            ++field1152;
            if (field1152 > 54) {
                field1152 = 0;
                this.field1196.method197(4, 39);
            }
            ++super.field17;
            if (super.field17 > 4500) {
                this.field1435 = 250;
                super.field17 -= 500;
                this.field1196.method197(4, 38);
            }
            ++this.field1147;
            if (this.field1147 > 500) {
                this.field1147 = 0;
                int var16 = (int) (Math.random() * 8.0D);
                if ((var16 & 1) == 1) {
                    this.field1133 += this.field1134;
                }
                if ((var16 & 2) == 2) {
                    this.field1091 += this.field1092;
                }
                if ((var16 & 4) == 4) {
                    this.field1347 += this.field1348;
                }
            }
            if (this.field1133 < -50) {
                this.field1134 = 2;
            }
            if (this.field1133 > 50) {
                this.field1134 = -2;
            }
            if (this.field1091 < -55) {
                this.field1092 = 2;
            }
            if (this.field1091 > 55) {
                this.field1092 = -2;
            }
            if (this.field1347 < -40) {
                this.field1348 = 1;
            }
            if (this.field1347 > 40) {
                this.field1348 = -1;
            }
            ++this.field1434;
            if (this.field1434 > 50) {
                this.field1196.method197(4, 186);
            }
            try {
                if (this.field1430 != null && this.field1196.field622 > 0) {
                    this.field1430.method33(this.field1196.field621, this.field1441, this.field1196.field622, 0);
                    this.field1196.field622 = 0;
                    this.field1434 = 0;
                }
            } catch (IOException var18) {
                this.method413(0);
            } catch (Exception var19) {
                this.method464((byte) 38);
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method437(boolean arg0) {
        this.field1429 &= arg0;
        int var2 = this.field1345.method189(0, "Choose Option");
        for (int var3 = 0; var3 < this.field1139; ++var3) {
            int var9 = this.field1345.method189(0, this.field1291[var3]);
            if (var9 > var2) {
                var2 = var9;
            }
        }
        var2 += 8;
        int var4 = this.field1139 * 15 + 21;
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
            this.field1231 = true;
            this.field1316 = 0;
            this.field1317 = var5;
            this.field1318 = var6;
            this.field1319 = var2;
            this.field1320 = this.field1139 * 15 + 22;
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
            this.field1231 = true;
            this.field1316 = 1;
            this.field1317 = var7;
            this.field1318 = var8;
            this.field1319 = var2;
            this.field1320 = this.field1139 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILhb;I)V")
    public final void method438(int arg0, int arg1, Pix32 arg2, int arg3) {
        int var5 = arg1 * arg1 + arg3 * arg3;
        if (arg0 != 0) {
            field1211 = this.field1369.method245();
        }
        if (var5 <= 6400) {
            int var6 = Model.field525[this.field1278];
            int var7 = Model.field526[this.field1278];
            int var8 = arg1 * var7 + arg3 * var6 >> 16;
            int var9 = arg3 * var7 - arg1 * var6 >> 16;
            if (var5 > 2500) {
                arg2.method179(83 - var9 - arg2.field585 / 2, this.field1311, false, var8 + 94 - arg2.field584 / 2);
            } else {
                arg2.method172(var8 + 94 - arg2.field584 / 2, 0, 83 - var9 - arg2.field585 / 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lhc;B)Z")
    public final boolean method439(Component arg0, byte arg1) {
        int var3 = arg0.field964;
        if (arg1 != -11) {
            this.field1263 = null;
        }
        if (var3 == 201) {
            this.field1399 = true;
            this.field1305 = false;
            this.field1351 = true;
            this.field1204 = "";
            this.field1284 = 1;
            this.field1391 = "Enter name of friend to add to list";
        }
        if (var3 == 202) {
            this.field1399 = true;
            this.field1305 = false;
            this.field1351 = true;
            this.field1204 = "";
            this.field1284 = 2;
            this.field1391 = "Enter name of friend to delete from list";
        }
        if (var3 >= 1 && var3 <= 200) {
            if (var3 >= 101) {
                var3 -= 101;
            } else {
                --var3;
            }
            if (var3 >= 0 && var3 < this.field1248 && this.field1165[var3] > 0) {
                this.field1399 = true;
                this.field1305 = false;
                this.field1351 = true;
                this.field1204 = "";
                this.field1284 = 3;
                this.field1438 = this.field1459[var3];
                this.field1391 = "Enter message to send to " + this.field1155[var3];
            }
        }
        if (var3 == 205) {
            this.field1435 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field1399 = true;
                this.field1305 = false;
                this.field1351 = true;
                this.field1204 = "";
                this.field1284 = 4;
                this.field1391 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field1399 = true;
                this.field1305 = false;
                this.field1351 = true;
                this.field1204 = "";
                this.field1284 = 5;
                this.field1391 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field1458[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = IdkType.field946 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= IdkType.field946) {
                                var6 = 0;
                            }
                        }
                        if (IdkType.field947[var6].field948 == var4 + (this.field1504 ? 0 : 7)) {
                            this.field1458[var4] = var6;
                            this.field1090 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field1200[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field1194[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field1194[var7].length) {
                        var9 = 0;
                    }
                }
                this.field1200[var7] = var9;
                this.field1090 = true;
            }
            if (var3 == 324 && !this.field1504) {
                this.field1504 = true;
                this.method462(false);
            }
            if (var3 == 325 && this.field1504) {
                this.field1504 = false;
                this.method462(false);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field1333 = !this.field1333;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method431((byte) 7);
                    if (this.field1489.length() > 0) {
                        this.field1196.method197(4, 53);
                        this.field1196.method204(8, JString.method250(this.field1489));
                        this.field1196.method198(var3 - 601);
                        this.field1196.method198(this.field1333 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1196.method197(4, 128);
                this.field1196.method198(this.field1504 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field1196.method198(this.field1458[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field1196.method198(this.field1200[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method440(int arg0) {
        if (arg0 != 0) {
            this.field1196.method198(231);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method5(5);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field1250 != -1 && this.field1436 == this.field1250) {
                        if (var2 == 8 && this.field1489.length() > 0) {
                            this.field1489 = this.field1489.substring(0, this.field1489.length() - 1);
                        }
                        break;
                    }
                    if (this.field1351) {
                        if (var2 >= 32 && var2 <= 122 && this.field1204.length() < 80) {
                            this.field1204 = this.field1204 + (char) var2;
                            this.field1399 = true;
                        }
                        if (var2 == 8 && this.field1204.length() > 0) {
                            this.field1204 = this.field1204.substring(0, this.field1204.length() - 1);
                            this.field1399 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field1351 = false;
                            this.field1399 = true;
                            if (this.field1284 == 1 && this.field1248 < 100) {
                                long var3 = JString.method250(this.field1204);
                                this.field1204 = JString.method254((byte) -10, JString.method251(4, var3));
                                if (var3 != 0L) {
                                    boolean var5 = false;
                                    for (int var6 = 0; var6 < this.field1248; ++var6) {
                                        if (this.field1459[var6] == var3) {
                                            this.method375(386, 0, this.field1204 + " is already on your friend list", "");
                                            var5 = true;
                                            break;
                                        }
                                    }
                                    for (int var7 = 0; var7 < this.field1473; ++var7) {
                                        if (this.field1162[var7] == var3) {
                                            this.method375(386, 0, "Please remove " + this.field1204 + " from your ignore list first", "");
                                            var5 = true;
                                            break;
                                        }
                                    }
                                    if (this.field1204.equals(this.field1487.field360)) {
                                        var5 = true;
                                    }
                                    if (!var5) {
                                        this.field1155[this.field1248] = this.field1204;
                                        this.field1459[this.field1248] = var3;
                                        this.field1165[this.field1248] = 0;
                                        ++this.field1248;
                                        this.field1238 = true;
                                        this.field1196.method197(4, 115);
                                        this.field1196.method204(8, var3);
                                    }
                                }
                            }
                            if (this.field1284 == 2 && this.field1248 > 0) {
                                long var8 = JString.method250(this.field1204);
                                this.field1204 = JString.method254((byte) -10, JString.method251(4, var8));
                                if (var8 != 0L) {
                                    for (int var10 = 0; var10 < this.field1248; ++var10) {
                                        if (this.field1459[var10] == var8) {
                                            --this.field1248;
                                            this.field1238 = true;
                                            for (int var11 = var10; var11 < this.field1248; ++var11) {
                                                this.field1155[var11] = this.field1155[var11 + 1];
                                                this.field1165[var11] = this.field1165[var11 + 1];
                                                this.field1459[var11] = this.field1459[var11 + 1];
                                            }
                                            this.field1196.method197(4, 57);
                                            this.field1196.method204(8, var8);
                                            break;
                                        }
                                    }
                                }
                            }
                            if (this.field1284 == 3 && this.field1204.length() > 0) {
                                this.field1196.method197(4, 250);
                                this.field1196.method198(0);
                                int var12 = this.field1196.field622;
                                this.field1196.method204(8, this.field1438);
                                WordPack.method258(this.field1196, this.field1204, (byte) 3);
                                this.field1196.method207(this.field1196.field622 - var12, -69);
                                this.field1204 = JString.method255(837, this.field1204);
                                this.field1204 = WordFilter.method334(false, this.field1204);
                                this.method375(386, 6, this.field1204, JString.method254((byte) -10, JString.method251(4, this.field1438)));
                                if (this.field1245 == 2) {
                                    this.field1245 = 1;
                                    this.field1341 = true;
                                    this.field1196.method197(4, 206);
                                    this.field1196.method198(this.field1112);
                                    this.field1196.method198(this.field1245);
                                    this.field1196.method198(this.field1492);
                                }
                            }
                            if (this.field1284 == 4 && this.field1473 < 100 && this.field1204.length() > 0) {
                                long var13 = JString.method250(this.field1204);
                                boolean var15 = false;
                                for (int var16 = 0; var16 < this.field1473; ++var16) {
                                    if (this.field1162[var16] == var13) {
                                        this.method375(386, 0, this.field1204 + " is already on your ignore list", "");
                                        var15 = true;
                                        break;
                                    }
                                }
                                for (int var17 = 0; var17 < this.field1248; ++var17) {
                                    if (this.field1459[var17] == var13) {
                                        this.method375(386, 0, "Please remove " + this.field1204 + " from your friend list first", "");
                                        var15 = true;
                                        break;
                                    }
                                }
                                if (!var15) {
                                    this.field1162[this.field1473++] = var13;
                                    this.field1238 = true;
                                    this.field1196.method197(4, 251);
                                    this.field1196.method204(8, var13);
                                }
                            }
                            if (this.field1284 == 5 && this.field1473 > 0 && this.field1204.length() > 0) {
                                long var18 = JString.method250(this.field1204);
                                for (int var20 = 0; var20 < this.field1473; ++var20) {
                                    if (this.field1162[var20] == var18) {
                                        --this.field1473;
                                        this.field1238 = true;
                                        for (int var21 = var20; var21 < this.field1473; ++var21) {
                                            this.field1162[var21] = this.field1162[var21 + 1];
                                        }
                                        this.field1196.method197(4, 188);
                                        this.field1196.method204(8, var18);
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.field1305) {
                        if (var2 >= 48 && var2 <= 57 && this.field1241.length() < 10) {
                            this.field1241 = this.field1241 + (char) var2;
                            this.field1399 = true;
                        }
                        if (var2 == 8 && this.field1241.length() > 0) {
                            this.field1241 = this.field1241.substring(0, this.field1241.length() - 1);
                            this.field1399 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field1241.length() > 0) {
                                int var22 = 0;
                                try {
                                    var22 = Integer.parseInt(this.field1241);
                                } catch (Exception var26) {
                                }
                                this.field1196.method197(4, 184);
                                this.field1196.method202(var22);
                            }
                            this.field1305 = false;
                            this.field1399 = true;
                        }
                    } else if (this.field1184 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field1185.length() < 80) {
                            this.field1185 = this.field1185 + (char) var2;
                            this.field1399 = true;
                        }
                        if (var2 == 8 && this.field1185.length() > 0) {
                            this.field1185 = this.field1185.substring(0, this.field1185.length() - 1);
                            this.field1399 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field1185.length() > 0) {
                            if (this.field1185.equals("::clientdrop") && super.field15 != null) {
                                this.method413(0);
                            } else if (this.field1185.startsWith("::")) {
                                this.field1196.method197(4, 24);
                                this.field1196.method198(this.field1185.length() - 1);
                                this.field1196.method205(this.field1185.substring(2));
                            } else {
                                byte var23 = 0;
                                if (this.field1185.startsWith("yellow:")) {
                                    var23 = 0;
                                    this.field1185 = this.field1185.substring(7);
                                }
                                if (this.field1185.startsWith("red:")) {
                                    var23 = 1;
                                    this.field1185 = this.field1185.substring(4);
                                }
                                if (this.field1185.startsWith("green:")) {
                                    var23 = 2;
                                    this.field1185 = this.field1185.substring(6);
                                }
                                if (this.field1185.startsWith("cyan:")) {
                                    var23 = 3;
                                    this.field1185 = this.field1185.substring(5);
                                }
                                if (this.field1185.startsWith("purple:")) {
                                    var23 = 4;
                                    this.field1185 = this.field1185.substring(7);
                                }
                                if (this.field1185.startsWith("white:")) {
                                    var23 = 5;
                                    this.field1185 = this.field1185.substring(6);
                                }
                                if (this.field1185.startsWith("flash1:")) {
                                    var23 = 6;
                                    this.field1185 = this.field1185.substring(7);
                                }
                                if (this.field1185.startsWith("flash2:")) {
                                    var23 = 7;
                                    this.field1185 = this.field1185.substring(7);
                                }
                                if (this.field1185.startsWith("flash3:")) {
                                    var23 = 8;
                                    this.field1185 = this.field1185.substring(7);
                                }
                                if (this.field1185.startsWith("glow1:")) {
                                    var23 = 9;
                                    this.field1185 = this.field1185.substring(6);
                                }
                                if (this.field1185.startsWith("glow2:")) {
                                    var23 = 10;
                                    this.field1185 = this.field1185.substring(6);
                                }
                                if (this.field1185.startsWith("glow3:")) {
                                    var23 = 11;
                                    this.field1185 = this.field1185.substring(6);
                                }
                                byte var24 = 0;
                                if (this.field1185.startsWith("wave:")) {
                                    var24 = 1;
                                    this.field1185 = this.field1185.substring(5);
                                }
                                if (this.field1185.startsWith("scroll:")) {
                                    var24 = 2;
                                    this.field1185 = this.field1185.substring(7);
                                }
                                this.field1196.method197(4, 11);
                                this.field1196.method198(0);
                                int var25 = this.field1196.field622;
                                this.field1196.method198(var23);
                                this.field1196.method198(var24);
                                WordPack.method258(this.field1196, this.field1185, (byte) 3);
                                this.field1196.method207(this.field1196.field622 - var25, -69);
                                this.field1185 = JString.method255(837, this.field1185);
                                this.field1185 = WordFilter.method334(false, this.field1185);
                                this.field1487.field316 = this.field1185;
                                this.field1487.field318 = var23;
                                this.field1487.field319 = var24;
                                this.field1487.field317 = 150;
                                this.method375(386, 2, this.field1487.field316, this.field1487.field360);
                                if (this.field1112 == 2) {
                                    this.field1112 = 1;
                                    this.field1341 = true;
                                    this.field1196.method197(4, 206);
                                    this.field1196.method198(this.field1112);
                                    this.field1196.method198(this.field1245);
                                    this.field1196.method198(this.field1492);
                                }
                            }
                            this.field1185 = "";
                            this.field1399 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field1489.length() < 12) {
                this.field1489 = this.field1489 + (char) var2;
            }
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

    @OriginalMember(owner = "client", name = "c", descriptor = "(ILkb;I)V")
    private final void method441(int arg0, Packet arg1, int arg2) {
        if (arg0 != 21055) {
            this.field1432 = arg1.method208();
        }
        int var4 = arg1.method219(7, 8);
        if (var4 < this.field1117) {
            for (int var5 = var4; var5 < this.field1117; ++var5) {
                this.field1397[this.field1396++] = this.field1118[var5];
            }
        }
        if (var4 > this.field1117) {
            signlink.reporterror(this.field1339 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1117 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1118[var6];
                PlayerEntity var8 = this.field1116[var7];
                int var9 = arg1.method219(7, 1);
                if (var9 == 0) {
                    this.field1118[this.field1117++] = var7;
                    var8.field348 = field1446;
                } else {
                    int var10 = arg1.method219(7, 2);
                    if (var10 == 0) {
                        this.field1118[this.field1117++] = var7;
                        var8.field348 = field1446;
                        this.field1120[this.field1119++] = var7;
                    } else if (var10 == 1) {
                        this.field1118[this.field1117++] = var7;
                        var8.field348 = field1446;
                        int var11 = arg1.method219(7, 3);
                        var8.method109(false, var11, false);
                        int var12 = arg1.method219(7, 1);
                        if (var12 == 1) {
                            this.field1120[this.field1119++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1118[this.field1117++] = var7;
                        var8.field348 = field1446;
                        int var13 = arg1.method219(7, 3);
                        var8.method109(true, var13, false);
                        int var14 = arg1.method219(7, 3);
                        var8.method109(true, var14, false);
                        int var15 = arg1.method219(7, 1);
                        if (var15 == 1) {
                            this.field1120[this.field1119++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1397[this.field1396++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)Z")
    public final boolean method442(int arg0) {
        if (arg0 != -17511) {
            this.method6();
        }
        if (this.field1430 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1430.method31();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1432 == -1) {
                    this.field1430.method32(this.field1371.field621, 0, 1);
                    this.field1432 = this.field1371.field621[0] & 255;
                    if (this.field1369 != null) {
                        this.field1432 = this.field1432 - this.field1369.method245() & 255;
                    }
                    this.field1431 = Protocol.field918[this.field1432];
                    --var2;
                }
                if (this.field1431 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1430.method32(this.field1371.field621, 0, 1);
                    this.field1431 = this.field1371.field621[0] & 255;
                    --var2;
                }
                if (this.field1431 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1430.method32(this.field1371.field621, 0, 2);
                    this.field1371.field622 = 0;
                    this.field1431 = this.field1371.method210();
                    var2 -= 2;
                }
                if (var2 < this.field1431) {
                    return false;
                }
                this.field1371.field622 = 0;
                this.field1430.method32(this.field1371.field621, 0, this.field1431);
                this.field1433 = 0;
                this.field1283 = this.field1282;
                this.field1282 = this.field1281;
                this.field1281 = this.field1432;
                if (this.field1432 == 94) {
                    if (this.field1406 == 12) {
                        this.field1238 = true;
                    }
                    this.field1154 = this.field1371.method208();
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 148) {
                    this.method405(this.field1431, true, this.field1371);
                    if (this.field1099 == 1) {
                        this.field1099 = 2;
                        World.field36 = this.field1354;
                        this.method368(this.field1471);
                    }
                    if (field1267 && this.field1099 == 2 && World.field36 != this.field1354) {
                        this.field1411.method234(0);
                        this.field1344.method187("Loading - please wait.", 151, 257, (byte) 0, 0);
                        this.field1344.method187("Loading - please wait.", 150, 256, (byte) 0, 16777215);
                        this.field1411.method235(2, super.field12, 8, 11);
                        World.field36 = this.field1354;
                        this.method368(this.field1471);
                    }
                    if (this.field1390 != this.field1354 && this.field1099 == 2) {
                        this.field1390 = this.field1354;
                        this.method380(6, this.field1354);
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 167) {
                    int var3 = this.field1371.method210();
                    int var4 = this.field1371.method210();
                    int var5 = var4 >> 10 & 31;
                    int var6 = var4 >> 5 & 31;
                    int var7 = var4 & 31;
                    Component.field955[var3].field996 = (var7 << 3) + (var5 << 19) + (var6 << 11);
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 161) {
                    InputTracking.method34(567);
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 86) {
                    int var8 = this.field1371.method208();
                    int var9 = this.field1371.method208();
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field1418.length; ++var11) {
                        if ((var8 << 8) + var9 == this.field1418[var11]) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        signlink.cachesave("m" + var8 + "_" + var9, this.field1156[var10]);
                        this.field1099 = 1;
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 195) {
                    int var12 = this.field1371.method210();
                    int var13 = this.field1371.method208();
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    this.field1388[var13] = var12;
                    this.field1238 = true;
                    this.field1402 = true;
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 240) {
                    int var14 = this.field1371.method210();
                    String var15 = this.field1371.method215();
                    Component.field955[var14].field994 = var15;
                    if (this.field1388[this.field1406] == Component.field955[var14].field961) {
                        this.field1238 = true;
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 231) {
                    this.field1419 = 0;
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 151) {
                    this.field1112 = this.field1371.method208();
                    this.field1245 = this.field1371.method208();
                    this.field1492 = this.field1371.method208();
                    this.field1341 = true;
                    this.field1399 = true;
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 48) {
                    long var16 = this.field1371.method214(-29068);
                    int var18 = this.field1371.method208();
                    String var19 = JString.method254((byte) -10, JString.method251(4, var16));
                    for (int var20 = 0; var20 < this.field1248; ++var20) {
                        if (this.field1459[var20] == var16) {
                            if (this.field1165[var20] != var18) {
                                this.field1165[var20] = var18;
                                this.field1238 = true;
                                if (var18 > 0) {
                                    this.method375(386, 5, var19 + " has logged in.", "");
                                }
                                if (var18 == 0) {
                                    this.method375(386, 5, var19 + " has logged out.", "");
                                }
                            }
                            var19 = null;
                            break;
                        }
                    }
                    if (var19 != null && this.field1248 < 100) {
                        this.field1459[this.field1248] = var16;
                        this.field1155[this.field1248] = var19;
                        this.field1165[this.field1248] = var18;
                        ++this.field1248;
                        this.field1238 = true;
                    }
                    boolean var21 = false;
                    while (!var21) {
                        var21 = true;
                        for (int var22 = 0; var22 < this.field1248 - 1; ++var22) {
                            if (this.field1165[var22] != field1264 && this.field1165[var22 + 1] == field1264 || this.field1165[var22] == 0 && this.field1165[var22 + 1] != 0) {
                                int var23 = this.field1165[var22];
                                this.field1165[var22] = this.field1165[var22 + 1];
                                this.field1165[var22 + 1] = var23;
                                String var24 = this.field1155[var22];
                                this.field1155[var22] = this.field1155[var22 + 1];
                                this.field1155[var22 + 1] = var24;
                                long var25 = this.field1459[var22];
                                this.field1459[var22] = this.field1459[var22 + 1];
                                this.field1459[var22 + 1] = var25;
                                this.field1238 = true;
                                var21 = false;
                            }
                        }
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 60) {
                    this.field1473 = this.field1431 / 8;
                    for (int var27 = 0; var27 < this.field1473; ++var27) {
                        this.field1162[var27] = this.field1371.method214(-29068);
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 29) {
                    int var28 = this.field1371.method210();
                    int var29 = this.field1371.method210();
                    if (this.field1321 == var28 && this.field1322 == var29 && this.field1099 != 0) {
                        this.field1432 = -1;
                        return true;
                    }
                    this.field1321 = var28;
                    this.field1322 = var29;
                    this.field1108 = (this.field1321 - 6) * 8;
                    this.field1109 = (this.field1322 - 6) * 8;
                    this.field1099 = 1;
                    this.field1411.method234(0);
                    this.field1344.method187("Loading - please wait.", 151, 257, (byte) 0, 0);
                    this.field1344.method187("Loading - please wait.", 150, 256, (byte) 0, 16777215);
                    this.field1411.method235(2, super.field12, 8, 11);
                    signlink.looprate(5);
                    int var30 = (this.field1431 - 2) / 10;
                    this.field1156 = new byte[var30][];
                    this.field1214 = new byte[var30][];
                    this.field1418 = new int[var30];
                    this.field1196.method197(4, 58);
                    this.field1196.method198(0);
                    int var31 = 0;
                    for (int var32 = 0; var32 < var30; ++var32) {
                        int var33 = this.field1371.method208();
                        int var34 = this.field1371.method208();
                        int var35 = this.field1371.method213();
                        int var36 = this.field1371.method213();
                        this.field1418[var32] = (var33 << 8) + var34;
                        if (var35 != 0) {
                            byte[] var37 = signlink.cacheload("m" + var33 + "_" + var34);
                            if (var37 != null) {
                                this.field1367.reset();
                                this.field1367.update(var37);
                                if ((int) this.field1367.getValue() != var35) {
                                    var37 = null;
                                }
                            }
                            if (var37 != null) {
                                this.field1156[var32] = var37;
                            } else {
                                this.field1099 = 0;
                                this.field1196.method198(0);
                                this.field1196.method198(var33);
                                this.field1196.method198(var34);
                                var31 += 3;
                            }
                        }
                        if (var36 != 0) {
                            byte[] var38 = signlink.cacheload("l" + var33 + "_" + var34);
                            if (var38 != null) {
                                this.field1367.reset();
                                this.field1367.update(var38);
                                if ((int) this.field1367.getValue() != var36) {
                                    var38 = null;
                                }
                            }
                            if (var38 != null) {
                                this.field1214[var32] = var38;
                            } else {
                                this.field1099 = 0;
                                this.field1196.method198(1);
                                this.field1196.method198(var33);
                                this.field1196.method198(var34);
                                var31 += 3;
                            }
                        }
                    }
                    this.field1196.method207(var31, -69);
                    signlink.looprate(50);
                    this.field1411.method234(0);
                    if (this.field1099 == 0) {
                        this.field1344.method187("Map area updated since last visit, so load will take longer this time only", 166, 257, (byte) 0, 0);
                        this.field1344.method187("Map area updated since last visit, so load will take longer this time only", 165, 256, (byte) 0, 16777215);
                    }
                    this.field1411.method235(2, super.field12, 8, 11);
                    int var39 = this.field1108 - this.field1110;
                    int var40 = this.field1109 - this.field1111;
                    this.field1110 = this.field1108;
                    this.field1111 = this.field1109;
                    for (int var41 = 0; var41 < 8192; ++var41) {
                        NpcEntity var42 = this.field1189[var41];
                        if (var42 != null) {
                            for (int var43 = 0; var43 < 10; ++var43) {
                                var42.field352[var43] -= var39;
                                var42.field353[var43] -= var40;
                            }
                            var42.field304 -= var39 * 128;
                            var42.field305 -= var40 * 128;
                        }
                    }
                    for (int var44 = 0; var44 < this.field1114; ++var44) {
                        PlayerEntity var45 = this.field1116[var44];
                        if (var45 != null) {
                            for (int var46 = 0; var46 < 10; ++var46) {
                                var45.field352[var46] -= var39;
                                var45.field353[var46] -= var40;
                            }
                            var45.field304 -= var39 * 128;
                            var45.field305 -= var40 * 128;
                        }
                    }
                    byte var47 = 0;
                    byte var48 = 104;
                    byte var49 = 1;
                    if (var39 < 0) {
                        var47 = 103;
                        var48 = -1;
                        var49 = -1;
                    }
                    byte var50 = 0;
                    byte var51 = 104;
                    byte var52 = 1;
                    if (var40 < 0) {
                        var50 = 103;
                        var51 = -1;
                        var52 = -1;
                    }
                    for (int var53 = var47; var48 != var53; var53 += var49) {
                        for (int var54 = var50; var51 != var54; var54 += var52) {
                            int var55 = var39 + var53;
                            int var56 = var40 + var54;
                            for (int var57 = 0; var57 < 4; ++var57) {
                                if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                                    this.field1263[var57][var53][var54] = this.field1263[var57][var55][var56];
                                } else {
                                    this.field1263[var57][var53][var54] = null;
                                }
                            }
                        }
                    }
                    for (LocMerged var58 = (LocMerged) this.field1137.method227(); var58 != null; var58 = (LocMerged) this.field1137.method229(this.field1485)) {
                        var58.field636 -= var39;
                        var58.field637 -= var40;
                        if (var58.field636 < 0 || var58.field637 < 0 || var58.field636 >= 104 || var58.field637 >= 104) {
                            var58.method106();
                        }
                    }
                    if (this.field1419 != 0) {
                        this.field1419 -= var39;
                        this.field1420 -= var40;
                    }
                    this.field1455 = false;
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 188) {
                    int var59 = this.field1371.method210();
                    int var60 = this.field1371.method210();
                    Component.field955[var59].field1003 = var60;
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 233) {
                    int var61 = this.field1371.method210();
                    int var62 = this.field1371.method210();
                    NpcType var63 = NpcType.method280(var62);
                    Component.field955[var61].field1001 = var63.method283((byte) 88);
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 208) {
                    this.field1304 = this.field1371.method208();
                    if (this.field1406 == this.field1304) {
                        if (this.field1304 == 3) {
                            this.field1406 = 1;
                        } else {
                            this.field1406 = 3;
                        }
                        this.field1238 = true;
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 18) {
                    this.method435(0, this.field1371, this.field1431);
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 24) {
                    int var64 = this.field1371.method210();
                    boolean var65 = this.field1371.method208() == 1;
                    Component.field955[var64].field975 = var65;
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 171) {
                    int var66 = this.field1371.method208();
                    int var67 = this.field1371.method208();
                    int var68 = -1;
                    for (int var69 = 0; var69 < this.field1418.length; ++var69) {
                        if ((var66 << 8) + var67 == this.field1418[var69]) {
                            var68 = var69;
                        }
                    }
                    if (var68 != -1) {
                        signlink.cachesave("l" + var66 + "_" + var67, this.field1214[var68]);
                        this.field1099 = 1;
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 199) {
                    this.field1351 = false;
                    this.field1305 = true;
                    this.field1241 = "";
                    this.field1399 = true;
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 34) {
                    int var70 = this.field1371.method210();
                    byte var71 = this.field1371.method209();
                    this.field1146[var70] = var71;
                    if (this.field1178[var70] != var71) {
                        this.field1178[var70] = var71;
                        this.method372(649, var70);
                        this.field1238 = true;
                        if (this.field1313 != -1) {
                            this.field1399 = true;
                        }
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 235) {
                    this.field1242 = this.field1371.method208();
                    this.field1243 = this.field1371.method208();
                    for (int var72 = this.field1242; var72 < this.field1242 + 8; ++var72) {
                        for (int var73 = this.field1243; var73 < this.field1243 + 8; ++var73) {
                            if (this.field1263[this.field1354][var72][var73] != null) {
                                this.field1263[this.field1354][var72][var73] = null;
                                this.method367(var72, var73);
                            }
                        }
                    }
                    for (LocMerged var74 = (LocMerged) this.field1137.method227(); var74 != null; var74 = (LocMerged) this.field1137.method229(this.field1485)) {
                        if (var74.field636 >= this.field1242 && var74.field636 < this.field1242 + 8 && var74.field637 >= this.field1243 && var74.field637 < this.field1243 + 8 && this.field1354 == var74.field634) {
                            this.method455(true, var74.field636, var74.field642, var74.field635, var74.field634, var74.field641, var74.field637, var74.field643);
                            var74.method106();
                        }
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 22) {
                    this.field1376 = this.field1371.method208();
                    if (this.field1376 == 1) {
                        this.field1368 = this.field1371.method210();
                    }
                    if (this.field1376 >= 2 && this.field1376 <= 6) {
                        if (this.field1376 == 2) {
                            this.field1271 = 64;
                            this.field1272 = 64;
                        }
                        if (this.field1376 == 3) {
                            this.field1271 = 0;
                            this.field1272 = 64;
                        }
                        if (this.field1376 == 4) {
                            this.field1271 = 128;
                            this.field1272 = 64;
                        }
                        if (this.field1376 == 5) {
                            this.field1271 = 64;
                            this.field1272 = 0;
                        }
                        if (this.field1376 == 6) {
                            this.field1271 = 64;
                            this.field1272 = 128;
                        }
                        this.field1376 = 2;
                        this.field1268 = this.field1371.method210();
                        this.field1269 = this.field1371.method210();
                        this.field1270 = this.field1371.method208();
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 135) {
                    this.method464((byte) 38);
                    this.field1432 = -1;
                    return false;
                }
                if (this.field1432 == 185) {
                    for (int var75 = 0; var75 < this.field1178.length; ++var75) {
                        if (this.field1178[var75] != this.field1146[var75]) {
                            this.field1178[var75] = this.field1146[var75];
                            this.method372(649, var75);
                            this.field1238 = true;
                        }
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 248) {
                    for (int var76 = 0; var76 < this.field1116.length; ++var76) {
                        if (this.field1116[var76] != null) {
                            this.field1116[var76].field331 = -1;
                        }
                    }
                    for (int var77 = 0; var77 < this.field1189.length; ++var77) {
                        if (this.field1189[var77] != null) {
                            this.field1189[var77].field331 = -1;
                        }
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 26) {
                    if (this.field1406 == 12) {
                        this.field1238 = true;
                    }
                    this.field1215 = this.field1371.method211();
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 154) {
                    int var78 = this.field1371.method210();
                    int var79 = this.field1371.method210();
                    int var80 = this.field1371.method210();
                    Component var81 = Component.field955[var78];
                    Model var82 = var81.field1001;
                    if (var82 != null) {
                        var82.method132(var79, var80);
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 112) {
                    this.field1455 = false;
                    for (int var83 = 0; var83 < 5; ++var83) {
                        this.field1163[var83] = false;
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 5) {
                    int var84 = this.field1371.method208();
                    int var85 = this.field1371.method208();
                    int var86 = this.field1371.method208();
                    int var87 = this.field1371.method208();
                    this.field1163[var84] = true;
                    this.field1465[var84] = var85;
                    this.field1423[var84] = var86;
                    this.field1295[var84] = var87;
                    this.field1153[var84] = 0;
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 124) {
                    this.field1455 = true;
                    this.field1494 = this.field1371.method208();
                    this.field1495 = this.field1371.method208();
                    this.field1496 = this.field1371.method210();
                    this.field1497 = this.field1371.method208();
                    this.field1498 = this.field1371.method208();
                    if (this.field1498 >= 100) {
                        int var88 = this.field1494 * 128 + 64;
                        int var89 = this.field1495 * 128 + 64;
                        int var90 = this.method419(this.field1354, this.field1494, 0, this.field1495) - this.field1496;
                        int var91 = var88 - this.field1094;
                        int var92 = var90 - this.field1095;
                        int var93 = var89 - this.field1096;
                        int var94 = (int) Math.sqrt((double) (var91 * var91 + var93 * var93));
                        this.field1097 = (int) (Math.atan2((double) var92, (double) var94) * 325.949D) & 2047;
                        this.field1098 = (int) (Math.atan2((double) var91, (double) var93) * -325.949D) & 2047;
                        if (this.field1097 < 128) {
                            this.field1097 = 128;
                        }
                        if (this.field1097 > 383) {
                            this.field1097 = 383;
                        }
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 116) {
                    this.field1406 = this.field1371.method208();
                    this.field1238 = true;
                    this.field1402 = true;
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 236) {
                    this.field1174 = this.field1371.method213();
                    this.field1457 = this.field1371.method210();
                    this.field1209 = this.field1371.method208();
                    this.field1218 = this.field1371.method210();
                    if (this.field1174 != 0 && this.field1250 == -1) {
                        signlink.dnslookup(JString.method253(this.field1174, false));
                        this.method431((byte) 7);
                        short var95 = 650;
                        if (this.field1209 != 201) {
                            var95 = 655;
                        }
                        this.field1489 = "";
                        this.field1333 = false;
                        for (int var96 = 0; var96 < Component.field955.length; ++var96) {
                            if (Component.field955[var96] != null && Component.field955[var96].field964 == var95) {
                                this.field1250 = Component.field955[var96].field961;
                                break;
                            }
                        }
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 245) {
                    InputTracking.method35(true, true);
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 7) {
                    int var97 = this.field1371.method210();
                    int var98 = this.field1371.method210();
                    int var99 = this.field1371.method210();
                    ObjType var100 = ObjType.method286(var98);
                    Component.field955[var97].field1001 = var100.method290(50);
                    Component.field955[var97].field1006 = var100.field889;
                    Component.field955[var97].field1007 = var100.field890;
                    Component.field955[var97].field1005 = var100.field888 * 100 / var99;
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 223) {
                    int var101 = this.field1371.method210();
                    this.method366((byte) 125, var101);
                    if (this.field1184 != -1) {
                        this.field1184 = -1;
                        this.field1399 = true;
                    }
                    if (this.field1305) {
                        this.field1305 = false;
                        this.field1399 = true;
                    }
                    this.field1138 = var101;
                    this.field1238 = true;
                    this.field1402 = true;
                    this.field1250 = -1;
                    this.field1123 = false;
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 191) {
                    this.field1242 = this.field1371.method208();
                    this.field1243 = this.field1371.method208();
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 156 || this.field1432 == 146 || this.field1432 == 181 || this.field1432 == 209 || this.field1432 == 175 || this.field1432 == 106 || this.field1432 == 134 || this.field1432 == 63 || this.field1432 == 140 || this.field1432 == 204) {
                    this.method458(this.field1371, this.field1432, this.field1207);
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 90) {
                    int var102 = this.field1371.method208();
                    int var103 = this.field1371.method208();
                    int var104 = this.field1371.method210();
                    int var105 = this.field1371.method210();
                    int var106 = -1;
                    for (int var107 = 0; var107 < this.field1418.length; ++var107) {
                        if ((var102 << 8) + var103 == this.field1418[var107]) {
                            var106 = var107;
                        }
                    }
                    if (var106 != -1) {
                        if (this.field1214[var106] == null || this.field1214[var106].length != var105) {
                            this.field1214[var106] = new byte[var105];
                        }
                        this.field1371.method217(this.field1214[var106], this.field1431 - 6, var104, 0);
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 38) {
                    int var108 = this.field1371.method210();
                    Component.field955[var108].field1001 = this.field1487.method114(-13298);
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 138) {
                    this.field1210 = this.field1371.method210() * 30;
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 150) {
                    if (this.field1490 && !field1267) {
                        if (this.field1239 == null) {
                            this.field1239 = new byte[10000];
                        }
                        int var109 = this.field1371.method210();
                        int var110 = this.field1371.method213();
                        int var111 = this.field1431 - 6;
                        BZip2.method237(this.field1239, var110, this.field1371.field621, var111, this.field1371.field622);
                        this.method425(var109, -656, this.field1239, var110);
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 32) {
                    this.field1329 = this.field1371.method210();
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 170) {
                    int var112 = this.field1371.method210();
                    int var113 = this.field1371.method211();
                    int var114 = this.field1371.method211();
                    Component var115 = Component.field955[var112];
                    var115.field967 = var113;
                    var115.field968 = var114;
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 16) {
                    this.field1238 = true;
                    int var116 = this.field1371.method210();
                    Component var117 = Component.field955[var116];
                    while (this.field1371.field622 < this.field1431) {
                        int var118 = this.field1371.method208();
                        int var119 = this.field1371.method210();
                        int var120 = this.field1371.method208();
                        if (var120 == 255) {
                            var120 = this.field1371.method213();
                        }
                        if (var118 >= 0 && var118 < var117.field956.length) {
                            var117.field956[var118] = var119;
                            var117.field957[var118] = var120;
                        }
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 187) {
                    String var121 = this.field1371.method215();
                    if (!var121.equals(this.field1193)) {
                        this.field1193 = var121;
                        if (this.field1499) {
                            this.method417(var121, 0);
                        }
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 47) {
                    this.field1238 = true;
                    int var122 = this.field1371.method210();
                    Component var123 = Component.field955[var122];
                    int var124 = this.field1371.method208();
                    for (int var125 = 0; var125 < var124; ++var125) {
                        var123.field956[var125] = this.field1371.method210();
                        int var126 = this.field1371.method208();
                        if (var126 == 255) {
                            var126 = this.field1371.method213();
                        }
                        var123.field957[var125] = var126;
                    }
                    for (int var127 = var124; var127 < var123.field956.length; ++var127) {
                        var123.field956[var127] = 0;
                        var123.field957[var127] = 0;
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 55) {
                    int var128 = this.field1371.method210();
                    Component var129 = Component.field955[var128];
                    for (int var130 = 0; var130 < var129.field956.length; ++var130) {
                        var129.field956[var130] = -1;
                        var129.field956[var130] = 0;
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 234) {
                    this.field1242 = this.field1371.method208();
                    this.field1243 = this.field1371.method208();
                    while (this.field1371.field622 < this.field1431) {
                        int var131 = this.field1371.method208();
                        this.method458(this.field1371, var131, this.field1207);
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 160) {
                    int var132 = this.field1371.method210();
                    int var133 = this.field1371.method208();
                    int var134 = this.field1371.method210();
                    if (this.field1102 && !field1267 && this.field1413 < 50) {
                        this.field1249[this.field1413] = var132;
                        this.field1424[this.field1413] = var133;
                        this.field1403[this.field1413] = Wave.field767[var132] + var134;
                        ++this.field1413;
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 89) {
                    int var135 = this.field1371.method210();
                    this.method366((byte) 125, var135);
                    if (this.field1138 != -1) {
                        this.field1138 = -1;
                        this.field1238 = true;
                        this.field1402 = true;
                    }
                    this.field1184 = var135;
                    this.field1399 = true;
                    this.field1250 = -1;
                    this.field1123 = false;
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 37) {
                    int var136 = this.field1371.method210();
                    this.method366((byte) 125, var136);
                    if (this.field1138 != -1) {
                        this.field1138 = -1;
                        this.field1238 = true;
                        this.field1402 = true;
                    }
                    if (this.field1184 != -1) {
                        this.field1184 = -1;
                        this.field1399 = true;
                    }
                    if (this.field1305) {
                        this.field1305 = false;
                        this.field1399 = true;
                    }
                    this.field1250 = var136;
                    this.field1123 = false;
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 9) {
                    if (this.field1138 != -1) {
                        this.field1138 = -1;
                        this.field1238 = true;
                        this.field1402 = true;
                    }
                    if (this.field1184 != -1) {
                        this.field1184 = -1;
                        this.field1399 = true;
                    }
                    if (this.field1305) {
                        this.field1305 = false;
                        this.field1399 = true;
                    }
                    this.field1250 = -1;
                    this.field1123 = false;
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 203) {
                    long var137 = this.field1371.method214(-29068);
                    int var139 = this.field1371.method213();
                    int var140 = this.field1371.method208();
                    boolean var141 = false;
                    for (int var142 = 0; var142 < 100; ++var142) {
                        if (this.field1453[var142] == var139) {
                            var141 = true;
                            break;
                        }
                    }
                    if (var140 <= 1) {
                        for (int var143 = 0; var143 < this.field1473; ++var143) {
                            if (this.field1162[var143] == var137) {
                                var141 = true;
                                break;
                            }
                        }
                    }
                    if (!var141 && this.field1449 == 0) {
                        try {
                            this.field1453[this.field1507] = var139;
                            this.field1507 = (this.field1507 + 1) % 100;
                            String var144 = WordPack.method257(this.field1431 - 13, 2, this.field1371);
                            String var145 = WordFilter.method334(false, var144);
                            if (var140 > 1) {
                                this.method375(386, 7, var145, JString.method254((byte) -10, JString.method251(4, var137)));
                            } else {
                                this.method375(386, 3, var145, JString.method254((byte) -10, JString.method251(4, var137)));
                            }
                        } catch (Exception var178) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 102) {
                    this.field1455 = true;
                    this.field1219 = this.field1371.method208();
                    this.field1220 = this.field1371.method208();
                    this.field1221 = this.field1371.method210();
                    this.field1222 = this.field1371.method208();
                    this.field1223 = this.field1371.method208();
                    if (this.field1223 >= 100) {
                        this.field1094 = this.field1219 * 128 + 64;
                        this.field1096 = this.field1220 * 128 + 64;
                        this.field1095 = this.method419(this.field1354, this.field1219, 0, this.field1220) - this.field1221;
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 74) {
                    this.field1227 = this.field1371.method208();
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 121) {
                    int var147 = this.field1371.method210();
                    int var148 = this.field1371.method210();
                    Component.field955[var147].field1001 = new Model(var148, true);
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 120) {
                    int var149 = this.field1371.method210();
                    int var150 = this.field1371.method210();
                    if (this.field1184 != -1) {
                        this.field1184 = -1;
                        this.field1399 = true;
                    }
                    if (this.field1305) {
                        this.field1305 = false;
                        this.field1399 = true;
                    }
                    this.field1250 = var149;
                    this.field1138 = var150;
                    this.field1238 = true;
                    this.field1402 = true;
                    this.field1123 = false;
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 36) {
                    int var151 = this.field1371.method208();
                    int var152 = this.field1371.method208();
                    int var153 = this.field1371.method210();
                    int var154 = this.field1371.method210();
                    int var155 = -1;
                    for (int var156 = 0; var156 < this.field1418.length; ++var156) {
                        if ((var151 << 8) + var152 == this.field1418[var156]) {
                            var155 = var156;
                        }
                    }
                    if (var155 != -1) {
                        if (this.field1156[var155] == null || this.field1156[var155].length != var154) {
                            this.field1156[var155] = new byte[var154];
                        }
                        this.field1371.method217(this.field1156[var155], this.field1431 - 6, var153, 0);
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 118) {
                    this.field1238 = true;
                    int var157 = this.field1371.method208();
                    int var158 = this.field1371.method213();
                    int var159 = this.field1371.method208();
                    this.field1300[var157] = var158;
                    this.field1491[var157] = var159;
                    this.field1451[var157] = 1;
                    for (int var160 = 0; var160 < 98; ++var160) {
                        if (var158 >= field1201[var160]) {
                            this.field1451[var157] = var160 + 2;
                        }
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 230) {
                    int var161 = this.field1371.method210();
                    int var162 = this.field1371.method213();
                    this.field1146[var161] = var162;
                    if (this.field1178[var161] != var162) {
                        this.field1178[var161] = var162;
                        this.method372(649, var161);
                        this.field1238 = true;
                        if (this.field1313 != -1) {
                            this.field1399 = true;
                        }
                    }
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 27) {
                    int var163 = this.field1371.method211();
                    this.field1313 = var163;
                    this.field1399 = true;
                    this.field1432 = -1;
                    return true;
                }
                if (this.field1432 == 35) {
                    String var164 = this.field1371.method215();
                    if (var164.endsWith(":tradereq:")) {
                        String var165 = var164.substring(0, var164.indexOf(":"));
                        long var166 = JString.method250(var165);
                        boolean var168 = false;
                        for (int var169 = 0; var169 < this.field1473; ++var169) {
                            if (this.field1162[var169] == var166) {
                                var168 = true;
                                break;
                            }
                        }
                        if (!var168 && this.field1449 == 0) {
                            this.method375(386, 4, "wishes to trade with you.", var165);
                        }
                    } else if (!var164.endsWith(":duelreq:")) {
                        this.method375(386, 0, var164, "");
                    } else {
                        String var170 = var164.substring(0, var164.indexOf(":"));
                        long var171 = JString.method250(var170);
                        boolean var173 = false;
                        for (int var174 = 0; var174 < this.field1473; ++var174) {
                            if (this.field1162[var174] == var171) {
                                var173 = true;
                                break;
                            }
                        }
                        if (!var173 && this.field1449 == 0) {
                            this.method375(386, 8, "wishes to duel with you.", var170);
                        }
                    }
                    this.field1432 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1432 + "," + this.field1431 + " - " + this.field1282 + "," + this.field1283);
                this.method464((byte) 38);
            } catch (IOException var179) {
                this.method413(0);
            } catch (Exception var180) {
                String var176 = "T2 - " + this.field1432 + "," + this.field1282 + "," + this.field1283 + " - " + this.field1431 + "," + (this.field1487.field352[0] + this.field1108) + "," + (this.field1487.field353[0] + this.field1109) + " - ";
                for (int var177 = 0; var177 < this.field1431 && var177 < 50; ++var177) {
                    var176 = var176 + this.field1371.field621[var177] + ",";
                }
                signlink.reporterror(var176);
                this.method464((byte) 38);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method443(int arg0) {
        this.field1409.method234(0);
        while (arg0 >= 0) {
            this.field1103 = 236;
        }
        Pix3D.field560 = this.field1374;
        this.field1310.method185(0, 0, 0);
        if (this.field1138 != -1) {
            this.method469(0, Component.field955[this.field1138], this.field1298, 0, 0);
        } else if (this.field1388[this.field1406] != -1) {
            this.method469(0, Component.field955[this.field1388[this.field1406]], this.field1298, 0, 0);
        }
        if (this.field1231 && this.field1316 == 1) {
            this.method402(0);
        }
        this.field1409.method235(2, super.field12, 562, 231);
        this.field1411.method234(0);
        Pix3D.field560 = this.field1375;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method444(boolean arg0) {
        for (int var2 = -1; var2 < this.field1117; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1115;
            } else {
                var6 = this.field1118[var2];
            }
            PlayerEntity var7 = this.field1116[var6];
            if (var7 != null && var7.field317 > 0) {
                --var7.field317;
                if (var7.field317 == 0) {
                    var7.field316 = null;
                }
            }
        }
        this.field1429 &= arg0;
        for (int var3 = 0; var3 < this.field1190; ++var3) {
            int var4 = this.field1191[var3];
            NpcEntity var5 = this.field1189[var4];
            if (var5 != null && var5.field317 > 0) {
                --var5.field317;
                if (var5.field317 == 0) {
                    var5.field316 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IIII)V")
    public final void method445(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1148.method76(arg0, arg2, arg1);
        if (arg3 <= 0) {
            field1211 = -289;
        }
        if (var5 != 0) {
            int var6 = this.field1148.method80(arg0, arg2, arg1, var5);
            int var7 = var6 >> 6 & 3;
            int var8 = var6 & 31;
            int var9 = 15658734;
            if (var5 > 0) {
                var9 = 15597568;
            }
            int[] var10 = this.field1421.field579;
            int var11 = (103 - arg1) * 512 * 4 + arg2 * 4 + 24624;
            int var12 = var5 >> 14 & 32767;
            LocType var13 = LocType.method274(var12);
            if (var13.field829 != -1) {
                Pix8 var14 = this.field1205[var13.field829];
                if (var14 != null) {
                    int var15 = (var13.field814 * 4 - var14.field595) / 2;
                    int var16 = (var13.field815 * 4 - var14.field596) / 2;
                    var14.method185(arg2 * 4 + 48 + var15, 0, (104 - arg1 - var13.field815) * 4 + 48 + var16);
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
        int var17 = this.field1148.method78(arg0, arg2, arg1);
        if (var17 != 0) {
            int var18 = this.field1148.method80(arg0, arg2, arg1, var17);
            int var19 = var18 >> 6 & 3;
            int var20 = var18 & 31;
            int var21 = var17 >> 14 & 32767;
            LocType var22 = LocType.method274(var21);
            if (var22.field829 != -1) {
                Pix8 var23 = this.field1205[var22.field829];
                if (var23 != null) {
                    int var24 = (var22.field814 * 4 - var23.field595) / 2;
                    int var25 = (var22.field815 * 4 - var23.field596) / 2;
                    var23.method185(arg2 * 4 + 48 + var24, 0, (104 - arg1 - var22.field815) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = this.field1421.field579;
                int var28 = (103 - arg1) * 512 * 4 + arg2 * 4 + 24624;
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
        int var29 = this.field1148.method79(arg0, arg2, arg1);
        if (var29 != 0) {
            int var30 = var29 >> 14 & 32767;
            LocType var31 = LocType.method274(var30);
            if (var31.field829 != -1) {
                Pix8 var32 = this.field1205[var31.field829];
                if (var32 != null) {
                    int var33 = (var31.field814 * 4 - var32.field595) / 2;
                    int var34 = (var31.field815 * 4 - var32.field596) / 2;
                    var32.method185(arg2 * 4 + 48 + var33, 0, (104 - arg1 - var31.field815) * 4 + 48 + var34);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method446(byte arg0) {
        if (arg0 != -86) {
            this.field1349 = -72;
        }
        if (super.field21 == 1) {
            int var2 = super.field22 - 21 - 561;
            int var3 = super.field23 - 9 - 5;
            if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                var2 -= 73;
                var3 -= 75;
                int var4 = Pix3D.field558[this.field1278];
                int var5 = Pix3D.field559[this.field1278];
                int var6 = var2 * var5 + var3 * var4 >> 11;
                int var7 = var3 * var5 - var2 * var4 >> 11;
                int var8 = this.field1487.field304 + var6 >> 7;
                int var9 = this.field1487.field305 - var7 >> 7;
                this.method434(true, var9, this.field1487.field352[0], 0, 0, this.field1487.field353[0], 0, 0, this.field1151, 0, var8);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(III)Z")
    public final boolean method447(int arg0, int arg1, int arg2) {
        int var4 = 97 / arg2;
        boolean var5 = false;
        Component var6 = Component.field955[arg1];
        for (int var7 = 0; var7 < var6.field976.length && var6.field976[var7] != -1; ++var7) {
            Component var8 = Component.field955[var6.field976[var7]];
            if (var8.field962 == 1) {
                var5 |= this.method447(arg0, var8.field960, 400);
            }
            if (var8.field962 == 6 && (var8.field1003 != -1 || var8.field1004 != -1)) {
                boolean var9 = this.method474(var8, 4);
                int var10;
                if (var9) {
                    var10 = var8.field1004;
                } else {
                    var10 = var8.field1003;
                }
                if (var10 != -1) {
                    SeqType var11 = SeqType.field1026[var10];
                    var8.field959 += arg0;
                    while (var8.field959 > var11.field1030[var8.field958]) {
                        var8.field959 -= var11.field1030[var8.field958] + 1;
                        ++var8.field958;
                        if (var8.field958 >= var11.field1027) {
                            var8.field958 -= var11.field1031;
                            if (var8.field958 < 0 || var8.field958 >= var11.field1027) {
                                var8.field958 = 0;
                            }
                        }
                        var5 = true;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILkb;)V")
    private final void method448(int arg0, int arg1, Packet arg2) {
        arg2.method218(212);
        int var4 = arg2.method219(7, 1);
        if (var4 != 0) {
            int var5 = arg2.method219(7, 2);
            if (arg1 == -34388) {
                if (var5 == 0) {
                    this.field1120[this.field1119++] = this.field1115;
                } else if (var5 == 1) {
                    int var6 = arg2.method219(7, 3);
                    this.field1487.method109(false, var6, false);
                    int var7 = arg2.method219(7, 1);
                    if (var7 == 1) {
                        this.field1120[this.field1119++] = this.field1115;
                    }
                } else if (var5 == 2) {
                    int var8 = arg2.method219(7, 3);
                    this.field1487.method109(true, var8, false);
                    int var9 = arg2.method219(7, 3);
                    this.field1487.method109(true, var9, false);
                    int var10 = arg2.method219(7, 1);
                    if (var10 == 1) {
                        this.field1120[this.field1119++] = this.field1115;
                    }
                } else if (var5 == 3) {
                    this.field1354 = arg2.method219(7, 2);
                    int var11 = arg2.method219(7, 7);
                    int var12 = arg2.method219(7, 7);
                    int var13 = arg2.method219(7, 1);
                    this.field1487.method108(this.field1297, var11, var12, var13 == 1);
                    int var14 = arg2.method219(7, 1);
                    if (var14 == 1) {
                        this.field1120[this.field1119++] = this.field1115;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lbc;BIII)V")
    public final void method449(NpcType arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 2) {
            this.field1432 = this.field1371.method208();
        }
        if (this.field1139 < 400) {
            String var6 = arg0.field850;
            if (arg0.field868 != 0) {
                var6 = var6 + method473(arg0.field868, this.field1487.field366, -29344) + " (level-" + arg0.field868 + ")";
            }
            if (this.field1167 == 1) {
                this.field1291[this.field1139] = "Use " + this.field1171 + " with @yel@" + var6;
                this.field1502[this.field1139] = 688;
                this.field1503[this.field1139] = arg4;
                this.field1500[this.field1139] = arg3;
                this.field1501[this.field1139] = arg2;
                ++this.field1139;
            } else {
                if (this.field1158 == 1) {
                    if ((this.field1160 & 2) == 2) {
                        this.field1291[this.field1139] = this.field1161 + " @yel@" + var6;
                        this.field1502[this.field1139] = 129;
                        this.field1503[this.field1139] = arg4;
                        this.field1500[this.field1139] = arg3;
                        this.field1501[this.field1139] = arg2;
                        ++this.field1139;
                        return;
                    }
                } else {
                    if (arg0.field863 != null) {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (arg0.field863[var7] != null && !arg0.field863[var7].equalsIgnoreCase("attack")) {
                                this.field1291[this.field1139] = arg0.field863[var7] + " @yel@" + var6;
                                if (var7 == 0) {
                                    this.field1502[this.field1139] = 614;
                                }
                                if (var7 == 1) {
                                    this.field1502[this.field1139] = 719;
                                }
                                if (var7 == 2) {
                                    this.field1502[this.field1139] = 969;
                                }
                                if (var7 == 3) {
                                    this.field1502[this.field1139] = 890;
                                }
                                if (var7 == 4) {
                                    this.field1502[this.field1139] = 983;
                                }
                                this.field1503[this.field1139] = arg4;
                                this.field1500[this.field1139] = arg3;
                                this.field1501[this.field1139] = arg2;
                                ++this.field1139;
                            }
                        }
                    }
                    if (arg0.field863 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (arg0.field863[var8] != null && arg0.field863[var8].equalsIgnoreCase("attack")) {
                                short var9 = 0;
                                if (arg0.field868 > this.field1487.field366) {
                                    var9 = 2000;
                                }
                                this.field1291[this.field1139] = arg0.field863[var8] + " @yel@" + var6;
                                if (var8 == 0) {
                                    this.field1502[this.field1139] = var9 + 614;
                                }
                                if (var8 == 1) {
                                    this.field1502[this.field1139] = var9 + 719;
                                }
                                if (var8 == 2) {
                                    this.field1502[this.field1139] = var9 + 969;
                                }
                                if (var8 == 3) {
                                    this.field1502[this.field1139] = var9 + 890;
                                }
                                if (var8 == 4) {
                                    this.field1502[this.field1139] = var9 + 983;
                                }
                                this.field1503[this.field1139] = arg4;
                                this.field1500[this.field1139] = arg3;
                                this.field1501[this.field1139] = arg2;
                                ++this.field1139;
                            }
                        }
                    }
                    this.field1291[this.field1139] = "Examine @yel@" + var6;
                    this.field1502[this.field1139] = 1586;
                    this.field1503[this.field1139] = arg4;
                    this.field1500[this.field1139] = arg3;
                    this.field1501[this.field1139] = arg2;
                    ++this.field1139;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILhc;)V")
    public final void method450(int arg0, Component arg1) {
        if (arg0 >= 2 && arg0 <= 2) {
            int var3 = arg1.field964;
            if (var3 >= 1 && var3 <= 100) {
                --var3;
                if (var3 >= this.field1248) {
                    arg1.field994 = "";
                    arg1.field963 = 0;
                } else {
                    arg1.field994 = this.field1155[var3];
                    arg1.field963 = 1;
                    if (arg1.field1011 == null) {
                        arg1.field963 = 0;
                    }
                }
            } else if (var3 >= 101 && var3 <= 200) {
                var3 -= 101;
                if (var3 >= this.field1248) {
                    arg1.field994 = "";
                    arg1.field963 = 0;
                } else {
                    if (this.field1165[var3] == 0) {
                        arg1.field994 = "@red@Offline";
                    } else if (this.field1165[var3] == field1264) {
                        arg1.field994 = "@gre@World-" + (this.field1165[var3] - 9);
                    } else {
                        arg1.field994 = "@yel@World-" + (this.field1165[var3] - 9);
                    }
                    arg1.field963 = 1;
                    if (arg1.field1011 == null) {
                        arg1.field963 = 0;
                    }
                }
            } else if (var3 == 203) {
                arg1.field973 = this.field1248 * 15 + 20;
                if (arg1.field973 <= arg1.field966) {
                    arg1.field973 = arg1.field966 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 >= this.field1473) {
                    arg1.field994 = "";
                    arg1.field963 = 0;
                } else {
                    arg1.field994 = JString.method254((byte) -10, JString.method251(4, this.field1162[var3]));
                }
            } else if (var3 == 503) {
                arg1.field973 = this.field1473 * 15 + 20;
                if (arg1.field973 <= arg1.field966) {
                    arg1.field973 = arg1.field966 + 1;
                }
            } else if (var3 == 327) {
                arg1.field1006 = 150;
                arg1.field1007 = (int) (Math.sin((double) field1446 / 40.0D) * 256.0D) & 2047;
                if (this.field1090) {
                    this.field1090 = false;
                    Model[] var4 = new Model[7];
                    int var5 = 0;
                    for (int var6 = 0; var6 < 7; ++var6) {
                        int var9 = this.field1458[var6];
                        if (var9 >= 0) {
                            var4[var5++] = IdkType.field947[var9].method311();
                        }
                    }
                    Model var7 = new Model(16925, var5, var4);
                    for (int var8 = 0; var8 < 5; ++var8) {
                        if (this.field1200[var8] != 0) {
                            var7.method132(field1194[var8][0], field1194[var8][this.field1200[var8]]);
                            if (var8 == 1) {
                                var7.method132(field1285[0], field1285[this.field1200[var8]]);
                            }
                        }
                    }
                    var7.method125((byte) -17);
                    var7.method126(SeqType.field1026[this.field1487.field309].field1028[0], (byte) 1);
                    var7.method135(64, 850, -30, -50, -30, true);
                    arg1.field1001 = var7;
                }
            } else if (var3 == 324) {
                if (this.field1179 == null) {
                    this.field1179 = arg1.field999;
                    this.field1180 = arg1.field1000;
                }
                if (this.field1504) {
                    arg1.field999 = this.field1180;
                } else {
                    arg1.field999 = this.field1179;
                }
            } else if (var3 == 325) {
                if (this.field1179 == null) {
                    this.field1179 = arg1.field999;
                    this.field1180 = arg1.field1000;
                }
                if (this.field1504) {
                    arg1.field999 = this.field1179;
                } else {
                    arg1.field999 = this.field1180;
                }
            } else if (var3 == 600) {
                arg1.field994 = this.field1489;
                if (field1446 % 20 < 10) {
                    arg1.field994 = arg1.field994 + "|";
                } else {
                    arg1.field994 = arg1.field994 + " ";
                }
            } else {
                if (var3 == 613) {
                    if (this.field1366) {
                        if (this.field1333) {
                            arg1.field996 = 16711680;
                            arg1.field994 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field996 = 16777215;
                            arg1.field994 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field994 = "";
                    }
                }
                if (var3 == 650 || var3 == 655) {
                    if (this.field1174 != 0) {
                        String var10;
                        if (this.field1457 == 0) {
                            var10 = "earlier today";
                        } else if (this.field1457 == 1) {
                            var10 = "yesterday";
                        } else {
                            var10 = this.field1457 + " days ago";
                        }
                        arg1.field994 = "You last logged in " + var10 + " from: " + signlink.dns;
                    } else {
                        arg1.field994 = "";
                    }
                }
                if (var3 == 651) {
                    if (this.field1218 == 0) {
                        arg1.field994 = "0 unread messages";
                        arg1.field996 = 16776960;
                    }
                    if (this.field1218 == 1) {
                        arg1.field994 = "1 unread message";
                        arg1.field996 = 65280;
                    }
                    if (this.field1218 > 1) {
                        arg1.field994 = this.field1218 + " unread messages";
                        arg1.field996 = 65280;
                    }
                }
                if (var3 == 652) {
                    if (this.field1209 == 201) {
                        arg1.field994 = "";
                    } else if (this.field1209 == 200) {
                        arg1.field994 = "You have not yet set any password recovery questions.";
                    } else {
                        String var11;
                        if (this.field1209 == 0) {
                            var11 = "Earlier today";
                        } else if (this.field1209 == 1) {
                            var11 = "Yesterday";
                        } else {
                            var11 = this.field1209 + " days ago";
                        }
                        arg1.field994 = var11 + " you changed your recovery questions";
                    }
                }
                if (var3 == 653) {
                    if (this.field1209 == 201) {
                        arg1.field994 = "";
                    } else if (this.field1209 == 200) {
                        arg1.field994 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg1.field994 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var3 == 654) {
                    if (this.field1209 == 201) {
                        arg1.field994 = "";
                    } else if (this.field1209 == 200) {
                        arg1.field994 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg1.field994 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method451(boolean arg0) {
        if (this.field1167 == 0 && this.field1158 == 0) {
            this.field1291[this.field1139] = "Walk here";
            this.field1502[this.field1139] = 256;
            this.field1500[this.field1139] = super.field19;
            this.field1501[this.field1139] = super.field20;
            ++this.field1139;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < Model.field523; ++var3) {
            int var4 = Model.field524[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1148.method80(this.field1354, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method274(var8);
                    if (this.field1167 == 1) {
                        this.field1291[this.field1139] = "Use " + this.field1171 + " with @cya@" + var9.field810;
                        this.field1502[this.field1139] = 825;
                        this.field1503[this.field1139] = var4;
                        this.field1500[this.field1139] = var5;
                        this.field1501[this.field1139] = var6;
                        ++this.field1139;
                    } else if (this.field1158 == 1) {
                        if ((this.field1160 & 4) == 4) {
                            this.field1291[this.field1139] = this.field1161 + " @cya@" + var9.field810;
                            this.field1502[this.field1139] = 771;
                            this.field1503[this.field1139] = var4;
                            this.field1500[this.field1139] = var5;
                            this.field1501[this.field1139] = var6;
                            ++this.field1139;
                        }
                    } else {
                        if (var9.field826 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field826[var10] != null) {
                                    this.field1291[this.field1139] = var9.field826[var10] + " @cya@" + var9.field810;
                                    if (var10 == 0) {
                                        this.field1502[this.field1139] = 943;
                                    }
                                    if (var10 == 1) {
                                        this.field1502[this.field1139] = 782;
                                    }
                                    if (var10 == 2) {
                                        this.field1502[this.field1139] = 393;
                                    }
                                    if (var10 == 3) {
                                        this.field1502[this.field1139] = 68;
                                    }
                                    if (var10 == 4) {
                                        this.field1502[this.field1139] = 653;
                                    }
                                    this.field1503[this.field1139] = var4;
                                    this.field1500[this.field1139] = var5;
                                    this.field1501[this.field1139] = var6;
                                    ++this.field1139;
                                }
                            }
                        }
                        this.field1291[this.field1139] = "Examine @cya@" + var9.field810;
                        this.field1502[this.field1139] = 1387;
                        this.field1503[this.field1139] = var4;
                        this.field1500[this.field1139] = var5;
                        this.field1501[this.field1139] = var6;
                        ++this.field1139;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1189[var8];
                    if (var11.field357.field852 == 1 && (var11.field304 & 127) == 64 && (var11.field305 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1190; ++var12) {
                            NpcEntity var13 = this.field1189[this.field1191[var12]];
                            if (var13 != null && var11 != var13 && var13.field357.field852 == 1 && var11.field304 == var13.field304 && var11.field305 == var13.field305) {
                                this.method449(var13.field357, (byte) 2, var6, var5, this.field1191[var12]);
                            }
                        }
                    }
                    this.method449(var11.field357, (byte) 2, var6, var5, var8);
                }
                if (var7 == 0) {
                    PlayerEntity var14 = this.field1116[var8];
                    if ((var14.field304 & 127) == 64 && (var14.field305 & 127) == 64) {
                        for (int var15 = 0; var15 < this.field1190; ++var15) {
                            NpcEntity var18 = this.field1189[this.field1191[var15]];
                            if (var18 != null && var18.field357.field852 == 1 && var14.field304 == var18.field304 && var14.field305 == var18.field305) {
                                this.method449(var18.field357, (byte) 2, var6, var5, this.field1191[var15]);
                            }
                        }
                        for (int var16 = 0; var16 < this.field1117; ++var16) {
                            PlayerEntity var17 = this.field1116[this.field1118[var16]];
                            if (var17 != null && var14 != var17 && var14.field304 == var17.field304 && var14.field305 == var17.field305) {
                                this.method394(var5, var17, this.field1118[var16], this.field1372, var6);
                            }
                        }
                    }
                    this.method394(var5, var14, var8, this.field1372, var6);
                }
                if (var7 == 3) {
                    LinkList var19 = this.field1263[this.field1354][var5][var6];
                    if (var19 != null) {
                        for (ObjStackEntity var20 = (ObjStackEntity) var19.method228(-13562); var20 != null; var20 = (ObjStackEntity) var19.method230((byte) 4)) {
                            ObjType var21 = ObjType.method286(var20.field299);
                            if (this.field1167 == 1) {
                                this.field1291[this.field1139] = "Use " + this.field1171 + " with @lre@" + var21.field884;
                                this.field1502[this.field1139] = 106;
                                this.field1503[this.field1139] = var20.field299;
                                this.field1500[this.field1139] = var5;
                                this.field1501[this.field1139] = var6;
                                ++this.field1139;
                            } else if (this.field1158 == 1) {
                                if ((this.field1160 & 1) == 1) {
                                    this.field1291[this.field1139] = this.field1161 + " @lre@" + var21.field884;
                                    this.field1502[this.field1139] = 788;
                                    this.field1503[this.field1139] = var20.field299;
                                    this.field1500[this.field1139] = var5;
                                    this.field1501[this.field1139] = var6;
                                    ++this.field1139;
                                }
                            } else {
                                for (int var22 = 4; var22 >= 0; --var22) {
                                    if (var21.field899 != null && var21.field899[var22] != null) {
                                        this.field1291[this.field1139] = var21.field899[var22] + " @lre@" + var21.field884;
                                        if (var22 == 0) {
                                            this.field1502[this.field1139] = 308;
                                        }
                                        if (var22 == 1) {
                                            this.field1502[this.field1139] = 445;
                                        }
                                        if (var22 == 2) {
                                            this.field1502[this.field1139] = 848;
                                        }
                                        if (var22 == 3) {
                                            this.field1502[this.field1139] = 221;
                                        }
                                        if (var22 == 4) {
                                            this.field1502[this.field1139] = 273;
                                        }
                                        this.field1503[this.field1139] = var20.field299;
                                        this.field1500[this.field1139] = var5;
                                        this.field1501[this.field1139] = var6;
                                        ++this.field1139;
                                    } else if (var22 == 2) {
                                        this.field1291[this.field1139] = "Take @lre@" + var21.field884;
                                        this.field1502[this.field1139] = 848;
                                        this.field1503[this.field1139] = var20.field299;
                                        this.field1500[this.field1139] = var5;
                                        this.field1501[this.field1139] = var6;
                                        ++this.field1139;
                                    }
                                }
                                this.field1291[this.field1139] = "Examine @lre@" + var21.field884;
                                this.field1502[this.field1139] = 1536;
                                this.field1503[this.field1139] = var20.field299;
                                this.field1500[this.field1139] = var5;
                                this.field1501[this.field1139] = var6;
                                ++this.field1139;
                            }
                        }
                    }
                }
            }
        }
        if (arg0) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILkb;)V")
    private final void method452(int arg0, int arg1, Packet arg2) {
        for (int var4 = 0; var4 < this.field1119; ++var4) {
            int var5 = this.field1120[var4];
            NpcEntity var6 = this.field1189[var5];
            int var7 = arg2.method208();
            if ((var7 & 2) == 2) {
                int var8 = arg2.method210();
                if (var8 == 65535) {
                    var8 = -1;
                }
                if (var6.field331 == var8) {
                    var6.field335 = 0;
                }
                int var9 = arg2.method208();
                if (var8 == -1 || var6.field331 == -1 || SeqType.field1026[var8].field1034 > SeqType.field1026[var6.field331].field1034 || SeqType.field1026[var6.field331].field1034 == 0) {
                    var6.field331 = var8;
                    var6.field332 = 0;
                    var6.field333 = 0;
                    var6.field334 = var9;
                    var6.field335 = 0;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field325 = arg2.method210();
                if (var6.field325 == 65535) {
                    var6.field325 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field316 = arg2.method215();
                var6.field317 = 100;
            }
            if ((var7 & 16) == 16) {
                var6.field320 = arg2.method208();
                var6.field321 = arg2.method208();
                var6.field322 = field1446 + 400;
                var6.field323 = arg2.method208();
                var6.field324 = arg2.method208();
            }
            if ((var7 & 32) == 32) {
                var6.field357 = NpcType.method280(arg2.method210());
                var6.field311 = var6.field357.field856;
                var6.field312 = var6.field357.field857;
                var6.field313 = var6.field357.field858;
                var6.field314 = var6.field357.field859;
                var6.field309 = var6.field357.field855;
            }
            if ((var7 & 64) == 64) {
                var6.field336 = arg2.method210();
                int var10 = arg2.method213();
                var6.field340 = var10 >> 16;
                var6.field339 = (var10 & 65535) + field1446;
                var6.field337 = 0;
                var6.field338 = 0;
                if (var6.field339 > field1446) {
                    var6.field337 = -1;
                }
                if (var6.field336 == 65535) {
                    var6.field336 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field326 = arg2.method210();
                var6.field327 = arg2.method210();
            }
        }
        if (arg1 != 0) {
            this.field1326 = this.field1369.method245();
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        while (arg0 >= 0) {
            field1506 = 85;
        }
        if (!this.field1468 && !this.field1407 && !this.field1274) {
            ++field1446;
            if (!this.field1429) {
                this.method392((byte) 5);
            } else {
                this.method436(19955);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(ILkb;I)V")
    private final void method453(int arg0, Packet arg1, int arg2) {
        while (true) {
            if (arg1.field623 + 10 < arg0 * 8) {
                int var4 = arg1.method219(7, 11);
                if (var4 != 2047) {
                    if (this.field1116[var4] == null) {
                        this.field1116[var4] = new PlayerEntity();
                        if (this.field1121[var4] != null) {
                            this.field1116[var4].method112(265, this.field1121[var4]);
                        }
                    }
                    this.field1118[this.field1117++] = var4;
                    PlayerEntity var5 = this.field1116[var4];
                    var5.field348 = field1446;
                    int var6 = arg1.method219(7, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg1.method219(7, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg1.method219(7, 1);
                    var5.method108(this.field1297, this.field1487.field352[0] + var6, this.field1487.field353[0] + var7, var8 == 1);
                    this.field1120[this.field1119++] = var4;
                    continue;
                }
            }
            arg1.method220(-714);
            if (arg2 < 0) {
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILkb;Z)V")
    private final void method454(int arg0, Packet arg1, boolean arg2) {
        arg1.method218(212);
        int var4 = arg1.method219(7, 8);
        if (var4 < this.field1190) {
            for (int var5 = var4; var5 < this.field1190; ++var5) {
                this.field1397[this.field1396++] = this.field1191[var5];
            }
        }
        if (var4 > this.field1190) {
            signlink.reporterror(this.field1339 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1190 = 0;
            if (arg2) {
                this.field1456 = 331;
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1191[var6];
                NpcEntity var8 = this.field1189[var7];
                int var9 = arg1.method219(7, 1);
                if (var9 == 0) {
                    this.field1191[this.field1190++] = var7;
                    var8.field348 = field1446;
                } else {
                    int var10 = arg1.method219(7, 2);
                    if (var10 == 0) {
                        this.field1191[this.field1190++] = var7;
                        var8.field348 = field1446;
                        this.field1120[this.field1119++] = var7;
                    } else if (var10 == 1) {
                        this.field1191[this.field1190++] = var7;
                        var8.field348 = field1446;
                        int var11 = arg1.method219(7, 3);
                        var8.method109(false, var11, false);
                        int var12 = arg1.method219(7, 1);
                        if (var12 == 1) {
                            this.field1120[this.field1119++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1191[this.field1190++] = var7;
                        var8.field348 = field1446;
                        int var13 = arg1.method219(7, 3);
                        var8.method109(true, var13, false);
                        int var14 = arg1.method219(7, 3);
                        var8.method109(true, var14, false);
                        int var15 = arg1.method219(7, 1);
                        if (var15 == 1) {
                            this.field1120[this.field1119++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1397[this.field1396++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIIIIII)V")
    public final void method455(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1429 &= arg0;
        if (arg1 >= 1 && arg6 >= 1 && arg1 <= 102 && arg6 <= 102) {
            if (field1267 && this.field1354 != arg4) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg3 == 0) {
                var9 = this.field1148.method76(arg4, arg1, arg6);
            }
            if (arg3 == 1) {
                var9 = this.field1148.method77(arg1, (byte) -54, arg4, arg6);
            }
            if (arg3 == 2) {
                var9 = this.field1148.method78(arg4, arg1, arg6);
            }
            if (arg3 == 3) {
                var9 = this.field1148.method79(arg4, arg1, arg6);
            }
            if (var9 != 0) {
                int var13 = this.field1148.method80(arg4, arg1, arg6, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg3 == 0) {
                    this.field1148.method71(arg1, arg4, (byte) 5, arg6);
                    LocType var17 = LocType.method274(var14);
                    if (var17.field816) {
                        this.field1140[arg4].method299(arg6, var17.field817, var15, arg1, true, var16);
                    }
                }
                if (arg3 == 1) {
                    this.field1148.method72(arg1, 437, arg4, arg6);
                }
                if (arg3 == 2) {
                    this.field1148.method73(arg6, arg4, arg1, false);
                    LocType var18 = LocType.method274(var14);
                    if (var18.field814 + arg1 > 103 || var18.field814 + arg6 > 103 || var18.field815 + arg1 > 103 || var18.field815 + arg6 > 103) {
                        return;
                    }
                    if (var18.field816) {
                        this.field1140[arg4].method300(var18.field815, 9, arg1, var18.field817, var18.field814, var16, arg6);
                    }
                }
                if (arg3 == 3) {
                    this.field1148.method74(arg4, true, arg1, arg6);
                    LocType var19 = LocType.method274(var14);
                    if (var19.field816 && var19.field818) {
                        this.field1140[arg4].method302(arg6, arg1, 1);
                    }
                }
            }
            if (arg5 >= 0) {
                int var20 = arg4;
                if (arg4 < 3 && (this.field1302[1][arg1][arg6] & 2) == 2) {
                    var20 = arg4 + 1;
                }
                World.method28(this.field1148, arg5, this.field1140[arg4], arg1, this.field1398, arg6, arg4, this.field1105, (byte) 8, var20, arg7, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "getjinglelen", descriptor = "()I")
    public final int getjinglelen() {
        return signlink.jinglems;
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method456(int arg0) {
        if (this.field1235 == 1) {
            this.field1443[this.field1234 / 100].method172(this.field1232 - 8 - 8, 0, this.field1233 - 8 - 11);
        }
        if (this.field1235 == 2) {
            this.field1443[this.field1234 / 100 + 4].method172(this.field1232 - 8 - 8, 0, this.field1233 - 8 - 11);
            ++field1414;
            if (field1414 > 161) {
                field1414 = 0;
                this.field1196.method197(4, 249);
                this.field1196.method199(9331);
            }
        }
        if (this.field1250 != -1) {
            this.method447(this.field1192, this.field1250, 400);
            this.method469(0, Component.field955[this.field1250], this.field1298, 0, 0);
        }
        this.method412(724);
        while (arg0 >= 0) {
            this.field1263 = null;
        }
        if (!this.field1231) {
            this.method374(this.field1122);
            this.method457(true);
        } else if (this.field1316 == 0) {
            this.method402(0);
        }
        if (this.field1227 == 1) {
            this.field1482[1].method172(5, 0, 296);
        }
        if (this.field1275 > 0) {
            this.field1482[0].method172(472, 0, 296);
            this.field1344.method187("Level: " + this.field1275, 329, 484, (byte) 0, 16776960);
        }
        if (this.field1299 == 1) {
            this.field1482[0].method172(472, 0, 296);
            this.field1344.method187("Arena", 329, 484, (byte) 0, 16776960);
        } else if (field1267) {
            int var2 = 16776960;
            Runtime var3 = Runtime.getRuntime();
            long var4 = var3.totalMemory();
            long var6 = var3.freeMemory();
            if (!signlink.sunjava && var4 - var6 > 33554432L && field1446 > field1486 + 500) {
                this.method364((byte) 8);
                var3.gc();
                int var8 = 16711680;
                field1486 = field1446;
            }
        }
        if (this.field1210 != 0) {
            int var9 = this.field1210 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field1344.method187("System update in: " + var10 + ":0" + var11, 329, 256, (byte) 0, 16776960);
            } else {
                this.field1344.method187("System update in: " + var10 + ":" + var11, 329, 256, (byte) 0, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method457(boolean arg0) {
        if (arg0) {
            if (this.field1139 >= 2 || this.field1167 != 0 || this.field1158 != 0) {
                String var2;
                if (this.field1167 == 1 && this.field1139 < 2) {
                    var2 = "Use " + this.field1171 + " with...";
                } else if (this.field1158 == 1 && this.field1139 < 2) {
                    var2 = this.field1161 + "...";
                } else {
                    var2 = this.field1291[this.field1139 - 1];
                }
                if (this.field1139 > 2) {
                    var2 = var2 + "@whi@ / " + (this.field1139 - 2) + " more options";
                }
                this.field1345.method192(true, 16777215, false, 4, 15, var2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        if (signlink.sunjava) {
            super.field7 = 5;
        }
        this.method417("scape_main", 0);
        if (field1442) {
            this.field1468 = true;
        } else {
            field1442 = true;
            boolean var1 = false;
            String var2 = this.method424(true);
            if (var2.endsWith("jagex.com")) {
                var1 = true;
            }
            if (var2.endsWith("runescape.com")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.2")) {
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
                this.field1274 = true;
            } else {
                try {
                    int var3 = 5;
                    this.field1445[8] = 0;
                    while (this.field1445[8] == 0) {
                        this.method13(10, 0, "Connecting to fileserver");
                        try {
                            DataInputStream var4 = this.method400("crc" + (int) (Math.random() * 9.9999999E7D));
                            Packet var5 = new Packet(new byte[36], field1332);
                            var4.readFully(var5.field621, 0, 36);
                            for (int var6 = 0; var6 < 9; ++var6) {
                                this.field1445[var6] = var5.method213();
                            }
                            var4.close();
                        } catch (IOException var54) {
                            for (int var7 = var3; var7 > 0; --var7) {
                                this.method13(10, 0, "Error loading - Will retry in " + var7 + " secs.");
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
                    this.field1276 = this.method418("title", this.field1445[1], "title screen", 10, 353);
                    this.field1343 = new PixFont("p11", this.field1276, -37957);
                    this.field1344 = new PixFont("p12", this.field1276, -37957);
                    this.field1345 = new PixFont("b12", this.field1276, -37957);
                    this.field1346 = new PixFont("q8", this.field1276, -37957);
                    this.method463((byte) 106);
                    this.method409(688);
                    Jagfile var8 = this.method418("config", this.field1445[2], "config", 15, 353);
                    Jagfile var9 = this.method418("interface", this.field1445[3], "interface", 20, 353);
                    Jagfile var10 = this.method418("media", this.field1445[4], "2d graphics", 30, 353);
                    Jagfile var11 = this.method418("models", this.field1445[5], "3d graphics", 40, 353);
                    Jagfile var12 = this.method418("textures", this.field1445[6], "textures", 60, 353);
                    Jagfile var13 = this.method418("wordenc", this.field1445[7], "chat system", 65, 353);
                    Jagfile var14 = this.method418("sounds", this.field1445[8], "sound effects", 70, 353);
                    this.field1302 = new byte[4][104][104];
                    this.field1398 = new int[4][105][105];
                    this.field1148 = new World3D(3, this.field1398, 4, 104, 104);
                    for (int var15 = 0; var15 < 4; ++var15) {
                        this.field1140[var15] = new CollisionMap(104, (byte) 8, 104);
                    }
                    this.field1421 = new Pix32(512, 512);
                    this.method13(75, 0, "Unpacking media");
                    this.field1310 = new Pix8(var10, "invback", 0);
                    this.field1312 = new Pix8(var10, "chatback", 0);
                    this.field1311 = new Pix8(var10, "mapback", 0);
                    this.field1181 = new Pix8(var10, "backbase1", 0);
                    this.field1182 = new Pix8(var10, "backbase2", 0);
                    this.field1183 = new Pix8(var10, "backhmid1", 0);
                    for (int var16 = 0; var16 < 13; ++var16) {
                        this.field1352[var16] = new Pix8(var10, "sideicons", var16);
                    }
                    this.field1483 = new Pix32(var10, "compass", 0);
                    try {
                        for (int var17 = 0; var17 < 50; ++var17) {
                            this.field1205[var17] = new Pix8(var10, "mapscene", var17);
                        }
                    } catch (Exception var53) {
                    }
                    try {
                        for (int var18 = 0; var18 < 50; ++var18) {
                            this.field1488[var18] = new Pix32(var10, "mapfunction", var18);
                        }
                    } catch (Exception var52) {
                    }
                    try {
                        for (int var19 = 0; var19 < 20; ++var19) {
                            this.field1166[var19] = new Pix32(var10, "hitmarks", var19);
                        }
                    } catch (Exception var51) {
                    }
                    try {
                        for (int var20 = 0; var20 < 20; ++var20) {
                            this.field1482[var20] = new Pix32(var10, "headicons", var20);
                        }
                    } catch (Exception var50) {
                    }
                    this.field1350 = new Pix32(var10, "mapflag", 0);
                    for (int var21 = 0; var21 < 8; ++var21) {
                        this.field1443[var21] = new Pix32(var10, "cross", var21);
                    }
                    this.field1425 = new Pix32(var10, "mapdots", 0);
                    this.field1426 = new Pix32(var10, "mapdots", 1);
                    this.field1427 = new Pix32(var10, "mapdots", 2);
                    this.field1428 = new Pix32(var10, "mapdots", 3);
                    this.field1404 = new Pix8(var10, "scrollbar", 0);
                    this.field1405 = new Pix8(var10, "scrollbar", 1);
                    this.field1286 = new Pix8(var10, "redstone1", 0);
                    this.field1287 = new Pix8(var10, "redstone2", 0);
                    this.field1288 = new Pix8(var10, "redstone3", 0);
                    this.field1289 = new Pix8(var10, "redstone1", 0);
                    this.field1289.method183(1);
                    this.field1290 = new Pix8(var10, "redstone2", 0);
                    this.field1290.method183(1);
                    this.field1141 = new Pix8(var10, "redstone1", 0);
                    this.field1141.method184(0);
                    this.field1142 = new Pix8(var10, "redstone2", 0);
                    this.field1142.method184(0);
                    this.field1143 = new Pix8(var10, "redstone3", 0);
                    this.field1143.method184(0);
                    this.field1144 = new Pix8(var10, "redstone1", 0);
                    this.field1144.method183(1);
                    this.field1144.method184(0);
                    this.field1145 = new Pix8(var10, "redstone2", 0);
                    this.field1145.method183(1);
                    this.field1145.method184(0);
                    Pix32 var22 = new Pix32(var10, "backleft1", 0);
                    this.field1355 = new PixMap(this.method11((byte) 9), var22.field580, var22.field581, true);
                    var22.method170(field1211, 0, 0);
                    Pix32 var23 = new Pix32(var10, "backleft2", 0);
                    this.field1356 = new PixMap(this.method11((byte) 9), var23.field580, var23.field581, true);
                    var23.method170(field1211, 0, 0);
                    Pix32 var24 = new Pix32(var10, "backright1", 0);
                    this.field1357 = new PixMap(this.method11((byte) 9), var24.field580, var24.field581, true);
                    var24.method170(field1211, 0, 0);
                    Pix32 var25 = new Pix32(var10, "backright2", 0);
                    this.field1358 = new PixMap(this.method11((byte) 9), var25.field580, var25.field581, true);
                    var25.method170(field1211, 0, 0);
                    Pix32 var26 = new Pix32(var10, "backtop1", 0);
                    this.field1359 = new PixMap(this.method11((byte) 9), var26.field580, var26.field581, true);
                    var26.method170(field1211, 0, 0);
                    Pix32 var27 = new Pix32(var10, "backtop2", 0);
                    this.field1360 = new PixMap(this.method11((byte) 9), var27.field580, var27.field581, true);
                    var27.method170(field1211, 0, 0);
                    Pix32 var28 = new Pix32(var10, "backvmid1", 0);
                    this.field1361 = new PixMap(this.method11((byte) 9), var28.field580, var28.field581, true);
                    var28.method170(field1211, 0, 0);
                    Pix32 var29 = new Pix32(var10, "backvmid2", 0);
                    this.field1362 = new PixMap(this.method11((byte) 9), var29.field580, var29.field581, true);
                    var29.method170(field1211, 0, 0);
                    Pix32 var30 = new Pix32(var10, "backvmid3", 0);
                    this.field1363 = new PixMap(this.method11((byte) 9), var30.field580, var30.field581, true);
                    var30.method170(field1211, 0, 0);
                    Pix32 var31 = new Pix32(var10, "backhmid2", 0);
                    this.field1364 = new PixMap(this.method11((byte) 9), var31.field580, var31.field581, true);
                    var31.method170(field1211, 0, 0);
                    this.method13(80, 0, "Unpacking textures");
                    Pix3D.method157(0, var12);
                    Pix3D.method161(0.8D, 0);
                    Pix3D.method156(20, 0);
                    this.method13(83, 0, "Unpacking models");
                    Model.method120(var11, -617);
                    AnimBase.method47(field1195, var11);
                    AnimFrame.method48(field1195, var11);
                    this.method13(86, 0, "Unpacking config");
                    SeqType.method317(0, var8);
                    LocType.method272(var8);
                    FloType.method306(0, var8);
                    ObjType.method284(var8);
                    NpcType.method278(var8);
                    IdkType.method309(0, var8);
                    SpotAnimType.method319(0, var8);
                    VarpType.method322(0, var8);
                    ObjType.field881 = field1266;
                    if (!field1267) {
                        this.method13(90, 0, "Unpacking sounds");
                        byte[] var32 = var14.method249("sounds.dat", true, (byte[]) null);
                        Packet var33 = new Packet(var32, field1332);
                        Wave.method262(0, var33);
                    }
                    this.method13(92, 0, "Unpacking interfaces");
                    PixFont[] var34 = new PixFont[] { this.field1343, this.field1344, this.field1345, this.field1346 };
                    Component.method313(var10, -873, var9, var34);
                    this.method13(97, 0, "Preparing game engine");
                    for (int var35 = 0; var35 < 33; ++var35) {
                        int var36 = 999;
                        int var37 = 0;
                        for (int var38 = 0; var38 < 35; ++var38) {
                            if (this.field1311.field593[this.field1311.field595 * var35 + var38] == 0) {
                                if (var36 == 999) {
                                    var36 = var38;
                                }
                            } else if (var36 != 999) {
                                var37 = var38;
                                break;
                            }
                        }
                        this.field1293[var35] = var36;
                        this.field1475[var35] = var37 - var36;
                    }
                    for (int var39 = 9; var39 < 160; ++var39) {
                        int var40 = 999;
                        int var41 = 0;
                        for (int var42 = 10; var42 < 168; ++var42) {
                            if (this.field1311.field593[this.field1311.field595 * var39 + var42] == 0 && (var42 > 34 || var39 > 34)) {
                                if (var40 == 999) {
                                    var40 = var42;
                                }
                            } else if (var40 != 999) {
                                var41 = var42;
                                break;
                            }
                        }
                        this.field1464[var39 - 9] = var40 - 21;
                        this.field1303[var39 - 9] = var41 - var40;
                    }
                    Pix3D.method154(true, 479, 96);
                    this.field1373 = Pix3D.field560;
                    Pix3D.method154(true, 190, 261);
                    this.field1374 = Pix3D.field560;
                    Pix3D.method154(true, 512, 334);
                    this.field1375 = Pix3D.field560;
                    int[] var43 = new int[9];
                    for (int var44 = 0; var44 < 9; ++var44) {
                        int var45 = var44 * 32 + 128 + 15;
                        int var46 = var45 * 3 + 600;
                        int var47 = Pix3D.field558[var45];
                        var43[var44] = var46 * var47 >> 16;
                    }
                    World3D.method86(512, 800, (byte) 9, var43, 500, 334);
                    WordFilter.method324(var13);
                } catch (Exception var55) {
                    this.field1407 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;II)V")
    public final void method458(Packet arg0, int arg1, int arg2) {
        int var4 = 44 / arg2;
        if (arg1 != 204 && arg1 != 140) {
            if (arg1 == 63) {
                int var5 = arg0.method208();
                int var6 = (var5 >> 4 & 7) + this.field1242;
                int var7 = (var5 & 7) + this.field1243;
                int var8 = arg0.method208();
                int var9 = var8 >> 2;
                int var10 = this.field1199[var9];
                int var11 = arg0.method210();
                if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                    int var12 = 0;
                    if (var10 == 0) {
                        var12 = this.field1148.method76(this.field1354, var6, var7);
                    }
                    if (var10 == 1) {
                        var12 = this.field1148.method77(var6, (byte) -54, this.field1354, var7);
                    }
                    if (var10 == 2) {
                        var12 = this.field1148.method78(this.field1354, var6, var7);
                    }
                    if (var10 == 3) {
                        var12 = this.field1148.method79(this.field1354, var6, var7);
                    }
                    if (var12 != 0) {
                        LocEntity var13 = new LocEntity(var12 >> 14 & 32767, var7, this.field1354, SeqType.field1026[var11], var6, var10, (byte) -50, false);
                        this.field1105.method224(var13);
                    }
                }
            } else if (arg1 == 134) {
                int var14 = arg0.method208();
                int var15 = (var14 >> 4 & 7) + this.field1242;
                int var16 = (var14 & 7) + this.field1243;
                int var17 = arg0.method210();
                int var18 = arg0.method210();
                if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                    ObjStackEntity var19 = new ObjStackEntity();
                    var19.field299 = var17;
                    var19.field300 = var18;
                    if (this.field1263[this.field1354][var15][var16] == null) {
                        this.field1263[this.field1354][var15][var16] = new LinkList((byte) 3);
                    }
                    this.field1263[this.field1354][var15][var16].method224(var19);
                    this.method367(var15, var16);
                }
            } else if (arg1 == 106) {
                int var20 = arg0.method208();
                int var21 = (var20 >> 4 & 7) + this.field1242;
                int var22 = (var20 & 7) + this.field1243;
                int var23 = arg0.method210();
                if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                    LinkList var24 = this.field1263[this.field1354][var21][var22];
                    if (var24 != null) {
                        for (ObjStackEntity var25 = (ObjStackEntity) var24.method227(); var25 != null; var25 = (ObjStackEntity) var24.method229(this.field1485)) {
                            if ((var23 & 32767) == var25.field299) {
                                var25.method106();
                                break;
                            }
                        }
                        if (var24.method227() == null) {
                            this.field1263[this.field1354][var21][var22] = null;
                        }
                        this.method367(var21, var22);
                    }
                }
            } else if (arg1 == 175) {
                int var26 = arg0.method208();
                int var27 = (var26 >> 4 & 7) + this.field1242;
                int var28 = (var26 & 7) + this.field1243;
                int var29 = var27 + arg0.method209();
                int var30 = var28 + arg0.method209();
                int var31 = arg0.method211();
                int var32 = arg0.method210();
                int var33 = arg0.method208();
                int var34 = arg0.method208();
                int var35 = arg0.method210();
                int var36 = arg0.method210();
                int var37 = arg0.method208();
                int var38 = arg0.method208();
                if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                    int var39 = var27 * 128 + 64;
                    int var40 = var28 * 128 + 64;
                    int var41 = var29 * 128 + 64;
                    int var42 = var30 * 128 + 64;
                    ProjectileEntity var43 = new ProjectileEntity(this.field1354, var39, field1446 + var36, var38, this.method419(this.field1354, var39, 0, var40) - var33, var37, var34, var32, this.field1456, var31, field1446 + var35, var40);
                    var43.method115(var42, -822, this.method419(this.field1354, var41, 0, var42) - var34, field1446 + var35, var41);
                    this.field1237.method224(var43);
                }
            } else if (arg1 == 209) {
                int var44 = arg0.method208();
                int var45 = (var44 >> 4 & 7) + this.field1242;
                int var46 = (var44 & 7) + this.field1243;
                int var47 = arg0.method210();
                int var48 = arg0.method208();
                int var49 = arg0.method210();
                if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                    int var50 = var45 * 128 + 64;
                    int var51 = var46 * 128 + 64;
                    SpotAnimEntity var52 = new SpotAnimEntity(var49, (byte) -108, this.method419(this.field1354, var50, 0, var51) - var48, var47, var51, var50, field1446, this.field1354);
                    this.field1294.method224(var52);
                }
            } else if (arg1 == 181) {
                int var53 = arg0.method208();
                int var54 = (var53 >> 4 & 7) + this.field1242;
                int var55 = (var53 & 7) + this.field1243;
                int var56 = arg0.method210();
                int var57 = arg0.method210();
                int var58 = arg0.method210();
                if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104 && this.field1329 != var58) {
                    ObjStackEntity var59 = new ObjStackEntity();
                    var59.field299 = var56;
                    var59.field300 = var57;
                    if (this.field1263[this.field1354][var54][var55] == null) {
                        this.field1263[this.field1354][var54][var55] = new LinkList((byte) 3);
                    }
                    this.field1263[this.field1354][var54][var55].method224(var59);
                    this.method367(var54, var55);
                }
            } else {
                if (arg1 == 146) {
                    int var60 = arg0.method208();
                    int var61 = (var60 >> 4 & 7) + this.field1242;
                    int var62 = (var60 & 7) + this.field1243;
                    int var63 = arg0.method208();
                    int var64 = var63 >> 2;
                    int var65 = var63 & 3;
                    int var66 = this.field1199[var64];
                    int var67 = arg0.method210();
                    int var68 = arg0.method210();
                    int var69 = arg0.method210();
                    int var70 = arg0.method210();
                    byte var71 = arg0.method209();
                    byte var72 = arg0.method209();
                    byte var73 = arg0.method209();
                    byte var74 = arg0.method209();
                    PlayerEntity var75;
                    if (this.field1329 == var70) {
                        var75 = this.field1487;
                    } else {
                        var75 = this.field1116[var70];
                    }
                    if (var75 != null) {
                        LocSpawned var76 = new LocSpawned(var61, var66, var65, this.field1354, -1, var64, var62, field1446 + var68, 999);
                        this.field1401.method224(var76);
                        LocSpawned var77 = new LocSpawned(var61, var66, var65, this.field1354, var67, var64, var62, field1446 + var69, 999);
                        this.field1401.method224(var77);
                        int var78 = this.field1398[this.field1354][var61][var62];
                        int var79 = this.field1398[this.field1354][var61 + 1][var62];
                        int var80 = this.field1398[this.field1354][var61 + 1][var62 + 1];
                        int var81 = this.field1398[this.field1354][var61][var62 + 1];
                        LocType var82 = LocType.method274(var67);
                        var75.field369 = field1446 + var68;
                        var75.field370 = field1446 + var69;
                        var75.field374 = var82.method277(var64, var65, var78, var79, var80, var81, -1);
                        int var83 = var82.field814;
                        int var84 = var82.field815;
                        if (var65 == 1 || var65 == 3) {
                            var83 = var82.field815;
                            var84 = var82.field814;
                        }
                        var75.field371 = var61 * 128 + var83 * 64;
                        var75.field373 = var62 * 128 + var84 * 64;
                        var75.field372 = this.method419(this.field1354, var75.field371, 0, var75.field373);
                        if (var71 > var73) {
                            byte var85 = var71;
                            var71 = var73;
                            var73 = var85;
                        }
                        if (var72 > var74) {
                            byte var86 = var72;
                            var72 = var74;
                            var74 = var86;
                        }
                        var75.field375 = var61 + var71;
                        var75.field377 = var61 + var73;
                        var75.field376 = var62 + var72;
                        var75.field378 = var62 + var74;
                    }
                }
                if (arg1 == 156) {
                    int var87 = arg0.method208();
                    int var88 = (var87 >> 4 & 7) + this.field1242;
                    int var89 = (var87 & 7) + this.field1243;
                    int var90 = arg0.method210();
                    int var91 = arg0.method210();
                    int var92 = arg0.method210();
                    if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                        LinkList var93 = this.field1263[this.field1354][var88][var89];
                        if (var93 != null) {
                            for (ObjStackEntity var94 = (ObjStackEntity) var93.method227(); var94 != null; var94 = (ObjStackEntity) var93.method229(this.field1485)) {
                                if ((var90 & 32767) == var94.field299 && var94.field300 == var91) {
                                    var94.field300 = var92;
                                    break;
                                }
                            }
                            this.method367(var88, var89);
                        }
                    }
                }
            }
        } else {
            int var95 = arg0.method208();
            int var96 = (var95 >> 4 & 7) + this.field1242;
            int var97 = (var95 & 7) + this.field1243;
            int var98 = arg0.method208();
            int var99 = var98 >> 2;
            int var100 = var98 & 3;
            int var101 = this.field1199[var99];
            int var102;
            if (arg1 == 140) {
                var102 = -1;
            } else {
                var102 = arg0.method210();
            }
            if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104) {
                LocMerged var103 = null;
                for (LocMerged var104 = (LocMerged) this.field1137.method227(); var104 != null; var104 = (LocMerged) this.field1137.method229(this.field1485)) {
                    if (this.field1354 == var104.field634 && var104.field636 == var96 && var104.field637 == var97 && var104.field635 == var101) {
                        var103 = var104;
                        break;
                    }
                }
                if (var103 == null) {
                    int var105 = 0;
                    int var106 = -1;
                    int var107 = 0;
                    int var108 = 0;
                    if (var101 == 0) {
                        var105 = this.field1148.method76(this.field1354, var96, var97);
                    }
                    if (var101 == 1) {
                        var105 = this.field1148.method77(var96, (byte) -54, this.field1354, var97);
                    }
                    if (var101 == 2) {
                        var105 = this.field1148.method78(this.field1354, var96, var97);
                    }
                    if (var101 == 3) {
                        var105 = this.field1148.method79(this.field1354, var96, var97);
                    }
                    if (var105 != 0) {
                        int var109 = this.field1148.method80(this.field1354, var96, var97, var105);
                        var106 = var105 >> 14 & 32767;
                        var107 = var109 & 31;
                        var108 = var109 >> 6;
                    }
                    var103 = new LocMerged();
                    var103.field634 = this.field1354;
                    var103.field635 = var101;
                    var103.field636 = var96;
                    var103.field637 = var97;
                    var103.field641 = var106;
                    var103.field643 = var107;
                    var103.field642 = var108;
                    this.field1137.method224(var103);
                }
                var103.field638 = var102;
                var103.field640 = var99;
                var103.field639 = var100;
                this.method455(true, var96, var100, var101, this.field1354, var102, var97, var99);
            }
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method459(int arg0) {
        if (arg0 >= 3 && arg0 <= 3) {
            for (LocEntity var2 = (LocEntity) this.field1105.method227(); var2 != null; var2 = (LocEntity) this.field1105.method229(this.field1485)) {
                boolean var3 = false;
                var2.field660 += this.field1192;
                if (var2.field659 == -1) {
                    var2.field659 = 0;
                    var3 = true;
                }
                label73: {
                    do {
                        do {
                            if (var2.field660 <= var2.field658.field1030[var2.field659]) {
                                break label73;
                            }
                            var2.field660 -= var2.field658.field1030[var2.field659] + 1;
                            ++var2.field659;
                            var3 = true;
                        } while (var2.field659 < var2.field658.field1027);
                        var2.field659 -= var2.field658.field1031;
                    } while (var2.field659 >= 0 && var2.field659 < var2.field658.field1027);
                    var2.method106();
                    var3 = false;
                }
                if (var3) {
                    int var4 = var2.field653;
                    int var5 = var2.field655;
                    int var6 = var2.field656;
                    int var7 = 0;
                    if (var2.field654 == 0) {
                        var7 = this.field1148.method76(var4, var5, var6);
                    }
                    if (var2.field654 == 1) {
                        var7 = this.field1148.method77(var5, (byte) -54, var4, var6);
                    }
                    if (var2.field654 == 2) {
                        var7 = this.field1148.method78(var4, var5, var6);
                    }
                    if (var2.field654 == 3) {
                        var7 = this.field1148.method79(var4, var5, var6);
                    }
                    if (var7 != 0 && (var7 >> 14 & 32767) == var2.field657) {
                        int var8 = this.field1398[var4][var5][var6];
                        int var9 = this.field1398[var4][var5 + 1][var6];
                        int var10 = this.field1398[var4][var5 + 1][var6 + 1];
                        int var11 = this.field1398[var4][var5][var6 + 1];
                        LocType var12 = LocType.method274(var2.field657);
                        int var13 = -1;
                        if (var2.field659 != -1) {
                            var13 = var2.field658.field1028[var2.field659];
                        }
                        if (var2.field654 == 2) {
                            int var14 = this.field1148.method80(var4, var5, var6, var7);
                            int var15 = var14 & 31;
                            int var16 = var14 >> 6;
                            if (var15 == 11) {
                                var15 = 10;
                            }
                            Model var17 = var12.method277(var15, var16, var8, var9, var10, var11, var13);
                            this.field1148.method66(2, var5, var17, var6, var4);
                        } else if (var2.field654 == 1) {
                            Model var18 = var12.method277(4, 0, var8, var9, var10, var11, var13);
                            this.field1148.method67(-48979, var5, var18, var6, var4);
                        } else if (var2.field654 == 0) {
                            int var19 = this.field1148.method80(var4, var5, var6, var7);
                            int var20 = var19 & 31;
                            int var21 = var19 >> 6;
                            if (var20 == 2) {
                                int var22 = var21 + 1 & 3;
                                Model var23 = var12.method277(2, var21 + 4, var8, var9, var10, var11, var13);
                                Model var24 = var12.method277(2, var22, var8, var9, var10, var11, var13);
                                this.field1148.method70(var5, var23, var6, var24, true, var4);
                            } else {
                                Model var25 = var12.method277(var20, var21, var8, var9, var10, var11, var13);
                                this.field1148.method69(var6, var25, -310, var5, var4);
                            }
                        } else if (var2.field654 == 3) {
                            int var26 = this.field1148.method80(var4, var5, var6, var7);
                            int var27 = var26 >> 6;
                            Model var28 = var12.method277(22, var27, var8, var9, var10, var11, var13);
                            this.field1148.method68(var6, 0, var28, var5, var4);
                        }
                    } else {
                        var2.method106();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILz;Lkb;II)V")
    private final void method460(int arg0, PlayerEntity arg1, Packet arg2, int arg3, int arg4) {
        while (arg0 >= 0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if ((arg3 & 1) == 1) {
            int var7 = arg2.method208();
            byte[] var8 = new byte[var7];
            Packet var9 = new Packet(var8, field1332);
            arg2.method217(var8, var7, 0, 0);
            this.field1121[arg4] = var9;
            arg1.method112(265, var9);
        }
        if ((arg3 & 2) == 2) {
            int var10 = arg2.method210();
            if (var10 == 65535) {
                var10 = -1;
            }
            if (arg1.field331 == var10) {
                arg1.field335 = 0;
            }
            int var11 = arg2.method208();
            if (var10 == -1 || arg1.field331 == -1 || SeqType.field1026[var10].field1034 > SeqType.field1026[arg1.field331].field1034 || SeqType.field1026[arg1.field331].field1034 == 0) {
                arg1.field331 = var10;
                arg1.field332 = 0;
                arg1.field333 = 0;
                arg1.field334 = var11;
                arg1.field335 = 0;
            }
        }
        if ((arg3 & 4) == 4) {
            arg1.field325 = arg2.method210();
            if (arg1.field325 == 65535) {
                arg1.field325 = -1;
            }
        }
        if ((arg3 & 8) == 8) {
            arg1.field316 = arg2.method215();
            arg1.field318 = 0;
            arg1.field319 = 0;
            arg1.field317 = 150;
            this.method375(386, 2, arg1.field316, arg1.field360);
        }
        if ((arg3 & 16) == 16) {
            arg1.field320 = arg2.method208();
            arg1.field321 = arg2.method208();
            arg1.field322 = field1446 + 400;
            arg1.field323 = arg2.method208();
            arg1.field324 = arg2.method208();
        }
        if ((arg3 & 32) == 32) {
            arg1.field326 = arg2.method210();
            arg1.field327 = arg2.method210();
        }
        if ((arg3 & 64) == 64) {
            int var12 = arg2.method210();
            int var13 = arg2.method208();
            int var14 = arg2.method208();
            int var15 = arg2.field622;
            if (arg1.field360 != null) {
                long var16 = JString.method250(arg1.field360);
                boolean var18 = false;
                if (var13 <= 1) {
                    for (int var19 = 0; var19 < this.field1473; ++var19) {
                        if (this.field1162[var19] == var16) {
                            var18 = true;
                            break;
                        }
                    }
                }
                if (!var18 && this.field1449 == 0) {
                    try {
                        String var20 = WordPack.method257(var14, 2, arg2);
                        String var21 = WordFilter.method334(false, var20);
                        arg1.field316 = var21;
                        arg1.field318 = var12 >> 8;
                        arg1.field319 = var12 & 255;
                        arg1.field317 = 150;
                        if (var13 > 1) {
                            this.method375(386, 1, var21, arg1.field360);
                        } else {
                            this.method375(386, 2, var21, arg1.field360);
                        }
                    } catch (Exception var24) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg2.field622 = var14 + var15;
        }
        if ((arg3 & 256) == 256) {
            arg1.field336 = arg2.method210();
            int var23 = arg2.method213();
            arg1.field340 = var23 >> 16;
            arg1.field339 = (var23 & 65535) + field1446;
            arg1.field337 = 0;
            arg1.field338 = 0;
            if (arg1.field339 > field1446) {
                arg1.field337 = -1;
            }
            if (arg1.field336 == 65535) {
                arg1.field336 = -1;
            }
        }
        if ((arg3 & 512) == 512) {
            arg1.field341 = arg2.method208();
            arg1.field343 = arg2.method208();
            arg1.field342 = arg2.method208();
            arg1.field344 = arg2.method208();
            arg1.field345 = arg2.method210() + field1446;
            arg1.field346 = arg2.method210() + field1446;
            arg1.field347 = arg2.method208();
            arg1.field351 = 0;
            arg1.field352[0] = arg1.field342;
            arg1.field353[0] = arg1.field344;
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public static final void method461(int arg0) {
        if (arg0 < 9 || arg0 > 9) {
            field1400 = !field1400;
        }
        World3D.field222 = true;
        Pix3D.field549 = true;
        field1267 = true;
        World.field35 = true;
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method462(boolean arg0) {
        this.field1090 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1458[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field946; ++var3) {
                if (IdkType.field947[var3].field948 == var2 + (this.field1504 ? 0 : 7)) {
                    this.field1458[var2] = var3;
                    break;
                }
            }
        }
        if (arg0) {
            this.field1372 = 335;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method463(byte arg0) {
        byte[] var2 = this.field1276.method249("title.dat", true, (byte[]) null);
        Pix32 var3 = new Pix32(var2, this);
        this.field1127.method234(0);
        var3.method170(field1211, 0, 0);
        this.field1128.method234(0);
        var3.method170(field1211, 0, -661);
        this.field1124.method234(0);
        var3.method170(field1211, 0, -128);
        this.field1125.method234(0);
        var3.method170(field1211, -386, -214);
        this.field1126.method234(0);
        var3.method170(field1211, -186, -214);
        this.field1129.method234(0);
        var3.method170(field1211, -265, 0);
        this.field1130.method234(0);
        var3.method170(field1211, -265, -574);
        this.field1131.method234(0);
        var3.method170(field1211, -186, -128);
        this.field1132.method234(0);
        var3.method170(field1211, -186, -574);
        int[] var4 = new int[var3.field580];
        for (int var5 = 0; var5 < var3.field581; ++var5) {
            for (int var10 = 0; var10 < var3.field580; ++var10) {
                var4[var10] = var3.field579[var3.field580 * var5 + (var3.field580 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field580; ++var11) {
                var3.field579[var3.field580 * var5 + var11] = var4[var11];
            }
        }
        this.field1127.method234(0);
        var3.method170(field1211, 0, 394);
        this.field1128.method234(0);
        var3.method170(field1211, 0, -267);
        this.field1124.method234(0);
        var3.method170(field1211, 0, 266);
        this.field1125.method234(0);
        var3.method170(field1211, -386, 180);
        this.field1126.method234(0);
        var3.method170(field1211, -186, 180);
        if (this.field1177 == arg0) {
            this.field1129.method234(0);
            var3.method170(field1211, -265, 394);
            this.field1130.method234(0);
            var3.method170(field1211, -265, -180);
            this.field1131.method234(0);
            var3.method170(field1211, -186, 212);
            this.field1132.method234(0);
            var3.method170(field1211, -186, -180);
            Pix32 var6 = new Pix32(this.field1276, "logo", 0);
            this.field1124.method234(0);
            var6.method172(super.field10 / 2 - var6.field580 / 2 - 128, 0, 18);
            Object var7 = null;
            Object var8 = null;
            Object var9 = null;
            System.gc();
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method464(byte arg0) {
        try {
            if (this.field1430 != null) {
                this.field1430.method29();
            }
        } catch (Exception var4) {
        }
        this.field1430 = null;
        this.field1429 = false;
        this.field1467 = 0;
        this.field1339 = "";
        this.field1340 = "";
        InputTracking.method35(true, false);
        this.method364((byte) 8);
        if (arg0 != 38) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field1148.method50((byte) 9);
        for (int var3 = 0; var3 < 4; ++var3) {
            this.field1140[var3].method294(652);
        }
        System.gc();
        this.method417("null", 0);
        this.field1193 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIILhc;IIIII)V")
    public final void method465(boolean arg0, int arg1, int arg2, Component arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 < 0 || arg2 > 0) {
            this.field1263 = null;
        }
        if (this.field1197) {
            this.field1292 = 32;
        } else {
            this.field1292 = 0;
        }
        this.field1197 = false;
        if (arg8 >= arg5 && arg8 < arg5 + 16 && arg1 >= arg4 && arg1 < arg4 + 16) {
            arg3.field974 -= this.field1236 * 4;
            if (arg0) {
                this.field1238 = true;
                return;
            }
        } else if (arg8 >= arg5 && arg8 < arg5 + 16 && arg1 >= arg4 + arg7 - 16 && arg1 < arg4 + arg7) {
            arg3.field974 += this.field1236 * 4;
            if (arg0) {
                this.field1238 = true;
                return;
            }
        } else {
            if (arg8 < arg5 - this.field1292 || arg8 >= arg5 + 16 + this.field1292 || arg1 < arg4 + 16 || arg1 >= arg4 + arg7 - 16 || this.field1236 <= 0) {
                return;
            }
            int var10 = (arg7 - 32) * arg7 / arg6;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg1 - arg4 - 16 - var10 / 2;
            int var12 = arg7 - 32 - var10;
            arg3.field974 = (arg6 - arg7) * var11 / var12;
            if (arg0) {
                this.field1238 = true;
            }
            this.field1197 = true;
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method466(int arg0) {
        this.field1378 = 0;
        if (arg0 != 3) {
            this.method6();
        }
        for (int var2 = -1; var2 < this.field1190 + this.field1117; ++var2) {
            PathingEntity var17;
            if (var2 == -1) {
                var17 = this.field1487;
            } else if (var2 < this.field1117) {
                var17 = this.field1116[this.field1118[var2]];
            } else {
                var17 = this.field1189[this.field1191[var2 - this.field1117]];
            }
            if (var17 != null && var17.method110(false)) {
                if (var2 < this.field1117) {
                    PlayerEntity var18 = (PlayerEntity) var17;
                    if (var18.field363 != 0) {
                        this.method471(var17, (byte) 2, var17.field349 + 15);
                        if (this.field1461 > -1) {
                            int var19 = 28;
                            for (int var20 = 0; var20 < 8; ++var20) {
                                if ((var18.field363 & 1 << var20) != 0) {
                                    this.field1482[var20].method172(this.field1461 - 12, 0, this.field1462 - var19);
                                    var19 -= 25;
                                }
                            }
                        }
                    }
                } else if (this.field1376 == 1 && this.field1191[var2 - this.field1117] == this.field1368 && field1446 % 20 < 10) {
                    this.method471(var17, (byte) 2, var17.field349 + 15);
                    if (this.field1461 > -1) {
                        this.field1482[2].method172(this.field1461 - 12, 0, this.field1462 - 28);
                    }
                }
                if (var17.field316 != null && (var2 >= this.field1117 || this.field1112 == 0 || this.field1112 == 1 && this.method396(true, ((PlayerEntity) var17).field360))) {
                    this.method471(var17, (byte) 2, var17.field349);
                    if (this.field1461 > -1 && this.field1378 < this.field1379) {
                        this.field1383[this.field1378] = this.field1345.method189(0, var17.field316) / 2;
                        this.field1382[this.field1378] = this.field1345.field610;
                        this.field1380[this.field1378] = this.field1461;
                        this.field1381[this.field1378] = this.field1462;
                        this.field1384[this.field1378] = var17.field318;
                        this.field1385[this.field1378] = var17.field319;
                        this.field1386[this.field1378] = var17.field317;
                        this.field1387[this.field1378++] = var17.field316;
                        if (this.field1330 == 0 && var17.field319 == 1) {
                            this.field1382[this.field1378] += 10;
                            this.field1381[this.field1378] += 5;
                        }
                        if (this.field1330 == 0 && var17.field319 == 2) {
                            this.field1383[this.field1378] = 60;
                        }
                    }
                }
                if (var17.field322 > field1446 + 100) {
                    this.method471(var17, (byte) 2, var17.field349 + 15);
                    if (this.field1461 > -1) {
                        int var21 = var17.field323 * 30 / var17.field324;
                        if (var21 > 30) {
                            var21 = 30;
                        }
                        Pix2D.method148(65280, this.field1462 - 3, this.field1461 - 15, (byte) 107, var21, 5);
                        Pix2D.method148(16711680, this.field1462 - 3, this.field1461 - 15 + var21, (byte) 107, 30 - var21, 5);
                    }
                }
                if (var17.field322 > field1446 + 330) {
                    this.method471(var17, (byte) 2, var17.field349 / 2);
                    if (this.field1461 > -1) {
                        this.field1166[var17.field321].method172(this.field1461 - 12, 0, this.field1462 - 12);
                        this.field1343.method187(String.valueOf(var17.field320), this.field1462 + 4, this.field1461, (byte) 0, 0);
                        this.field1343.method187(String.valueOf(var17.field320), this.field1462 + 3, this.field1461 - 1, (byte) 0, 16777215);
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field1378; ++var3) {
            int var4 = this.field1380[var3];
            int var5 = this.field1381[var3];
            int var6 = this.field1383[var3];
            int var7 = this.field1382[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var16 = 0; var16 < var3; ++var16) {
                    if (var5 + 2 > this.field1381[var16] - this.field1382[var16] && var5 - var7 < this.field1381[var16] + 2 && var4 - var6 < this.field1383[var16] + this.field1380[var16] && var4 + var6 > this.field1380[var16] - this.field1383[var16] && this.field1381[var16] - this.field1382[var16] < var5) {
                        var5 = this.field1381[var16] - this.field1382[var16];
                        var8 = true;
                    }
                }
            }
            this.field1461 = this.field1380[var3];
            this.field1462 = this.field1381[var3] = var5;
            String var9 = this.field1387[var3];
            if (this.field1330 == 0) {
                int var10 = 16776960;
                if (this.field1384[var3] < 6) {
                    var10 = this.field1325[this.field1384[var3]];
                }
                if (this.field1384[var3] == 6) {
                    var10 = this.field1188 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1384[var3] == 7) {
                    var10 = this.field1188 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1384[var3] == 8) {
                    var10 = this.field1188 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1384[var3] == 9) {
                    int var11 = 150 - this.field1386[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field1384[var3] == 10) {
                    int var12 = 150 - this.field1386[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field1384[var3] == 11) {
                    int var13 = 150 - this.field1386[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field1385[var3] == 0) {
                    this.field1345.method187(var9, this.field1462 + 1, this.field1461, (byte) 0, 0);
                    this.field1345.method187(var9, this.field1462, this.field1461, (byte) 0, var10);
                }
                if (this.field1385[var3] == 1) {
                    this.field1345.method191(var9, this.field1461, this.field1462 + 1, 0, this.field1176, this.field1188);
                    this.field1345.method191(var9, this.field1461, this.field1462, var10, this.field1176, this.field1188);
                }
                if (this.field1385[var3] == 2) {
                    int var14 = this.field1345.method189(0, var9);
                    int var15 = (150 - this.field1386[var3]) * (var14 + 100) / 150;
                    Pix2D.method146(this.field1136, this.field1461 - 50, 0, this.field1461 + 50, 334);
                    this.field1345.method190(var9, this.field1461 + 50 - var15, -729, this.field1462 + 1, 0);
                    this.field1345.method190(var9, this.field1461 + 50 - var15, -729, this.field1462, var10);
                    Pix2D.method145(false);
                }
            } else {
                this.field1345.method187(var9, this.field1462 + 1, this.field1461, (byte) 0, 0);
                this.field1345.method187(var9, this.field1462, this.field1461, (byte) 0, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (!this.field1135) {
            super.run();
        } else {
            this.field1422 = true;
            try {
                long var1 = System.currentTimeMillis();
                int var3 = 0;
                int var4 = 20;
                while (this.field1240) {
                    this.method428(false);
                    this.method428(false);
                    this.method467(-372);
                    ++var3;
                    if (var3 > 10) {
                        long var5 = System.currentTimeMillis();
                        int var7 = (int) (var5 - var1) / 10 - var4;
                        var4 = 40 - var7;
                        if (var4 < 5) {
                            var4 = 5;
                        }
                        var3 = 0;
                        var1 = var5;
                    }
                    try {
                        Thread.sleep((long) var4);
                    } catch (Exception var8) {
                    }
                }
            } catch (Exception var9) {
            }
            this.field1422 = false;
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method467(int arg0) {
        short var2 = 256;
        if (this.field1172 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1172 > 768) {
                    this.field1259[var3] = this.method410(this.field1260[var3], 535, 1024 - this.field1172, this.field1261[var3]);
                } else if (this.field1172 > 256) {
                    this.field1259[var3] = this.field1261[var3];
                } else {
                    this.field1259[var3] = this.method410(this.field1261[var3], 535, 256 - this.field1172, this.field1260[var3]);
                }
            }
        } else if (this.field1173 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1173 > 768) {
                    this.field1259[var4] = this.method410(this.field1260[var4], 535, 1024 - this.field1173, this.field1262[var4]);
                } else if (this.field1173 > 256) {
                    this.field1259[var4] = this.field1262[var4];
                } else {
                    this.field1259[var4] = this.method410(this.field1262[var4], 535, 256 - this.field1173, this.field1260[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1259[var5] = this.field1260[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1127.field671[var6] = this.field1392.field579[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1301[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1246[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1259[var26];
                    int var30 = this.field1127.field671[var8];
                    this.field1127.field671[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field1127.method235(2, super.field12, 0, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1128.field671[var10] = this.field1393.field579[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1301[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1246[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1259[var18];
                    int var22 = this.field1128.field671[var16];
                    this.field1128.field671[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field1128.method235(2, super.field12, 661, 0);
        while (arg0 >= 0) {
            this.field1432 = this.field1371.method208();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lhc;II)I")
    public final int method468(Component arg0, int arg1, int arg2) {
        if (arg1 >= 0) {
            return this.field1326;
        } else if (arg0.field969 != null && arg2 < arg0.field969.length) {
            try {
                int[] var4 = arg0.field969[arg2];
                int var5 = 0;
                int var6 = 0;
                while (true) {
                    int var7 = var4[var6++];
                    if (var7 == 0) {
                        return var5;
                    }
                    if (var7 == 1) {
                        var5 += this.field1491[var4[var6++]];
                    }
                    if (var7 == 2) {
                        var5 += this.field1451[var4[var6++]];
                    }
                    if (var7 == 3) {
                        var5 += this.field1300[var4[var6++]];
                    }
                    if (var7 == 4) {
                        Component var8 = Component.field955[var4[var6++]];
                        int var9 = var4[var6++] + 1;
                        for (int var10 = 0; var10 < var8.field956.length; ++var10) {
                            if (var8.field956[var10] == var9) {
                                var5 += var8.field957[var10];
                            }
                        }
                    }
                    if (var7 == 5) {
                        var5 += this.field1178[var4[var6++]];
                    }
                    if (var7 == 6) {
                        var5 += field1201[this.field1451[var4[var6++]] - 1];
                    }
                    if (var7 == 7) {
                        var5 += this.field1178[var4[var6++]] * 100 / 46875;
                    }
                    if (var7 == 8) {
                        var5 += this.field1487.field366;
                    }
                    if (var7 == 9) {
                        for (int var11 = 0; var11 < 19; ++var11) {
                            if (var11 == 18) {
                                var11 = 20;
                            }
                            var5 += this.field1451[var11];
                        }
                    }
                    if (var7 == 10) {
                        Component var12 = Component.field955[var4[var6++]];
                        int var13 = var4[var6++] + 1;
                        for (int var14 = 0; var14 < var12.field956.length; ++var14) {
                            if (var12.field956[var14] == var13) {
                                var5 += 999999999;
                                break;
                            }
                        }
                    }
                    if (var7 == 11) {
                        var5 += this.field1154;
                    }
                    if (var7 == 12) {
                        var5 += this.field1215;
                    }
                    if (var7 == 13) {
                        int var15 = this.field1178[var4[var6++]];
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;)V")
    public final void method13(int arg0, int arg1, String arg2) {
        this.method377(-643);
        if (this.field1276 == null) {
            super.method13(arg0, 0, arg2);
        } else {
            this.field1126.method234(0);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1345.method187("RuneScape is loading - please wait...", var5 / 2 - 26 - var6, var4 / 2, (byte) 0, 16777215);
            int var7 = var5 / 2 - 18 - var6;
            this.field1431 += arg1;
            Pix2D.method149(304, 9179409, var7, var4 / 2 - 152, 34, 649);
            Pix2D.method149(302, 0, var7 + 1, var4 / 2 - 151, 32, 649);
            Pix2D.method148(9179409, var7 + 2, var4 / 2 - 150, (byte) 107, arg0 * 3, 30);
            Pix2D.method148(0, var7 + 2, arg0 * 3 + (var4 / 2 - 150), (byte) 107, 300 - arg0 * 3, 30);
            this.field1345.method187(arg2, var5 / 2 + 5 - var6, var4 / 2, (byte) 0, 16777215);
            this.field1126.method235(2, super.field12, 214, 186);
            if (this.field1296) {
                this.field1296 = false;
                if (!this.field1240) {
                    this.field1127.method235(2, super.field12, 0, 0);
                    this.field1128.method235(2, super.field12, 661, 0);
                }
                this.field1124.method235(2, super.field12, 128, 0);
                this.field1125.method235(2, super.field12, 214, 386);
                this.field1129.method235(2, super.field12, 0, 265);
                this.field1130.method235(2, super.field12, 574, 265);
                this.field1131.method235(2, super.field12, 128, 186);
                this.field1132.method235(2, super.field12, 574, 186);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILhc;BII)V")
    public final void method469(int arg0, Component arg1, byte arg2, int arg3, int arg4) {
        if (arg1.field962 == 0 && arg1.field976 != null) {
            if (!arg1.field975 || this.field1203 == arg1.field960 || this.field1454 == arg1.field960 || this.field1481 == arg1.field960) {
                int var6 = Pix2D.field539;
                int var7 = Pix2D.field537;
                int var8 = Pix2D.field540;
                int var9 = Pix2D.field538;
                Pix2D.method146(this.field1136, arg0, arg3, arg1.field965 + arg0, arg1.field966 + arg3);
                if (arg2 != 1) {
                    for (int var10 = 1; var10 > 0; ++var10) {
                    }
                }
                int var11 = arg1.field976.length;
                for (int var12 = 0; var12 < var11; ++var12) {
                    int var13 = arg1.field977[var12] + arg0;
                    int var14 = arg1.field978[var12] + arg3 - arg4;
                    Component var15 = Component.field955[arg1.field976[var12]];
                    int var16 = var15.field967 + var13;
                    int var17 = var15.field968 + var14;
                    if (var15.field964 > 0) {
                        this.method450(this.field1258, var15);
                    }
                    if (var15.field962 == 0) {
                        if (var15.field974 > var15.field973 - var15.field966) {
                            var15.field974 = var15.field973 - var15.field966;
                        }
                        if (var15.field974 < 0) {
                            var15.field974 = 0;
                        }
                        this.method469(var16, var15, this.field1298, var17, var15.field974);
                        if (var15.field973 > var15.field966) {
                            this.method404(var15.field965 + var16, 0, var15.field974, var15.field966, var17, var15.field973);
                        }
                    } else if (var15.field962 != 1) {
                        if (var15.field962 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var15.field966; ++var19) {
                                for (int var20 = 0; var20 < var15.field965; ++var20) {
                                    int var21 = (var15.field984 + 32) * var20 + var16;
                                    int var22 = (var15.field985 + 32) * var19 + var17;
                                    if (var18 < 20) {
                                        var21 += var15.field987[var18];
                                        var22 += var15.field988[var18];
                                    }
                                    if (var15.field956[var18] <= 0) {
                                        if (var15.field986 != null && var18 < 20) {
                                            Pix32 var28 = var15.field986[var18];
                                            if (var28 != null) {
                                                var28.method172(var21, 0, var22);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field956[var18] - 1;
                                        Pix32 var26 = ObjType.method291(var25, var15.field957[var18], 44);
                                        if (this.field1336 != 0 && this.field1335 == var18 && this.field1334 == var15.field960) {
                                            var23 = super.field19 - this.field1337;
                                            var24 = super.field20 - this.field1338;
                                            if (var23 < 5 && var23 > -5) {
                                                var23 = 0;
                                            }
                                            if (var24 < 5 && var24 > -5) {
                                                var24 = 0;
                                            }
                                            if (this.field1230 < 5) {
                                                var23 = 0;
                                                var24 = 0;
                                            }
                                            var26.method176(var21 + var23, this.field1370, var22 + var24, 128);
                                        } else if (this.field1480 != 0 && this.field1479 == var18 && this.field1478 == var15.field960) {
                                            var26.method176(var21, this.field1370, var22, 128);
                                        } else {
                                            var26.method172(var21, 0, var22);
                                        }
                                        if (var26.field584 == 33 || var15.field957[var18] != 1) {
                                            int var27 = var15.field957[var18];
                                            this.field1343.method190(method470(var27, 601), var21 + 1 + var23, -729, var22 + 10 + var24, 0);
                                            this.field1343.method190(method470(var27, 601), var21 + var23, -729, var22 + 9 + var24, 16776960);
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field962 == 3) {
                            if (var15.field990) {
                                Pix2D.method148(var15.field996, var17, var16, (byte) 107, var15.field965, var15.field966);
                            } else {
                                Pix2D.method149(var15.field965, var15.field996, var17, var16, var15.field966, 649);
                            }
                        } else if (var15.field962 == 4) {
                            PixFont var29 = var15.field993;
                            int var30 = var15.field996;
                            String var31 = var15.field994;
                            if ((this.field1481 == var15.field960 || this.field1454 == var15.field960 || this.field1203 == var15.field960) && var15.field998 != 0) {
                                var30 = var15.field998;
                            }
                            if (this.method474(var15, 4)) {
                                var30 = var15.field997;
                                if (var15.field995.length() > 0) {
                                    var31 = var15.field995;
                                }
                            }
                            if (var15.field963 == 6 && this.field1123) {
                                var31 = "Please wait...";
                                var30 = var15.field996;
                            }
                            int var32 = var29.field610 + var17;
                            while (var31.length() > 0) {
                                if (var31.indexOf("%") != -1) {
                                    label246: while (true) {
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
                                                                            break label246;
                                                                        }
                                                                        var31 = var31.substring(0, var37) + this.method369(-48200, this.method468(var15, -295, 4)) + var31.substring(var37 + 2);
                                                                    }
                                                                }
                                                                var31 = var31.substring(0, var36) + this.method369(-48200, this.method468(var15, -295, 3)) + var31.substring(var36 + 2);
                                                            }
                                                        }
                                                        var31 = var31.substring(0, var35) + this.method369(-48200, this.method468(var15, -295, 2)) + var31.substring(var35 + 2);
                                                    }
                                                }
                                                var31 = var31.substring(0, var34) + this.method369(-48200, this.method468(var15, -295, 1)) + var31.substring(var34 + 2);
                                            }
                                        }
                                        var31 = var31.substring(0, var33) + this.method369(-48200, this.method468(var15, -295, 0)) + var31.substring(var33 + 2);
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
                                if (var15.field991) {
                                    var29.method188(var32, var39, false, var30, var15.field992, var15.field965 / 2 + var16);
                                } else {
                                    var29.method192(var15.field992, var30, false, var16, var32, var39);
                                }
                                var32 += var29.field610;
                            }
                        } else if (var15.field962 == 5) {
                            Pix32 var40;
                            if (this.method474(var15, 4)) {
                                var40 = var15.field1000;
                            } else {
                                var40 = var15.field999;
                            }
                            if (var40 != null) {
                                var40.method172(var16, 0, var17);
                            }
                        } else if (var15.field962 == 6) {
                            int var41 = Pix3D.field554;
                            int var42 = Pix3D.field555;
                            Pix3D.field554 = var15.field965 / 2 + var16;
                            Pix3D.field555 = var15.field966 / 2 + var17;
                            int var43 = Pix3D.field558[var15.field1006] * var15.field1005 >> 16;
                            int var44 = Pix3D.field559[var15.field1006] * var15.field1005 >> 16;
                            boolean var45 = this.method474(var15, 4);
                            int var46;
                            if (var45) {
                                var46 = var15.field1004;
                            } else {
                                var46 = var15.field1003;
                            }
                            Model var47;
                            if (var46 == -1) {
                                var47 = var15.method314(-1, -1, var45);
                            } else {
                                SeqType var48 = SeqType.field1026[var46];
                                var47 = var15.method314(var48.field1028[var15.field958], var48.field1029[var15.field958], var45);
                            }
                            if (var47 != null) {
                                var47.method138(0, var15.field1007, 0, var15.field1006, 0, var43, var44);
                            }
                            Pix3D.field554 = var41;
                            Pix3D.field555 = var42;
                        } else if (var15.field962 == 7) {
                            PixFont var49 = var15.field993;
                            int var50 = 0;
                            for (int var51 = 0; var51 < var15.field966; ++var51) {
                                for (int var52 = 0; var52 < var15.field965; ++var52) {
                                    if (var15.field956[var50] > 0) {
                                        ObjType var53 = ObjType.method286(var15.field956[var50] - 1);
                                        String var54 = var53.field884;
                                        if (var53.field896 || var15.field957[var50] != 1) {
                                            var54 = var54 + " x" + method423(var15.field957[var50], 9);
                                        }
                                        int var55 = (var15.field984 + 115) * var52 + var16;
                                        int var56 = (var15.field985 + 12) * var51 + var17;
                                        if (var15.field991) {
                                            var49.method188(var56, var54, false, var15.field996, var15.field992, var15.field965 / 2 + var55);
                                        } else {
                                            var49.method192(var15.field992, var15.field996, false, var55, var56, var54);
                                        }
                                    }
                                    ++var50;
                                }
                            }
                        }
                    }
                }
                Pix2D.method146(this.field1136, var6, var7, var8, var9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)Ljava/lang/String;")
    private static final String method470(int arg0, int arg1) {
        int var2 = 43 / arg1;
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lx;BI)V")
    public final void method471(PathingEntity arg0, byte arg1, int arg2) {
        this.method472(arg2, arg0.field305, arg0.field304, false);
        if (arg1 == 2) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIZ)V")
    public final void method472(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
            int var5 = this.method419(this.field1354, arg2, 0, arg1) - arg0;
            int var6 = arg2 - this.field1094;
            int var7 = var5 - this.field1095;
            int var8 = arg1 - this.field1096;
            int var9 = Model.field525[this.field1097];
            int var10 = Model.field526[this.field1097];
            if (arg3) {
                this.field1122 = !this.field1122;
            }
            int var11 = Model.field525[this.field1098];
            int var12 = Model.field526[this.field1098];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field1461 = (var13 << 9) / var17 + Pix3D.field554;
                this.field1462 = (var16 << 9) / var17 + Pix3D.field555;
            } else {
                this.field1461 = -1;
                this.field1462 = -1;
            }
        } else {
            this.field1461 = -1;
            this.field1462 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method473(int arg0, int arg1, int arg2) {
        if (arg2 != -29344) {
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

    @OriginalMember(owner = "client", name = "getjingle", descriptor = "()Ljava/lang/String;")
    public final String getjingle() {
        if (signlink.jingle == null) {
            return "none";
        } else {
            String var1 = signlink.jingle;
            signlink.jingle = null;
            return var1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lhc;I)Z")
    public final boolean method474(Component arg0, int arg1) {
        if (arg0.field970 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field970.length; ++var3) {
                int var4 = this.method468(arg0, -295, var3);
                int var5 = arg0.field971[var3];
                if (arg0.field970[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field970[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field970[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg1 >= this.field1342 && arg1 <= this.field1342) {
                return true;
            } else {
                throw new NullPointerException();
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method8(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1430 != null) {
                this.field1430.method29();
            }
        } catch (Exception var2) {
        }
        this.field1430 = null;
        this.method417("null", 0);
        this.field1196 = null;
        this.field1470 = null;
        this.field1371 = null;
        this.field1418 = null;
        this.field1156 = null;
        this.field1214 = null;
        this.field1398 = null;
        this.field1302 = null;
        this.field1148 = null;
        this.field1140 = null;
        this.field1444 = null;
        this.field1417 = null;
        this.field1439 = null;
        this.field1440 = null;
        this.field1106 = null;
        this.field1409 = null;
        this.field1410 = null;
        this.field1411 = null;
        this.field1412 = null;
        this.field1224 = null;
        this.field1225 = null;
        this.field1226 = null;
        this.field1355 = null;
        this.field1356 = null;
        this.field1357 = null;
        this.field1358 = null;
        this.field1359 = null;
        this.field1360 = null;
        this.field1361 = null;
        this.field1362 = null;
        this.field1363 = null;
        this.field1364 = null;
        this.field1310 = null;
        this.field1311 = null;
        this.field1312 = null;
        this.field1181 = null;
        this.field1182 = null;
        if (arg0 >= 0) {
            field1211 = -26;
        }
        this.field1183 = null;
        this.field1352 = null;
        this.field1286 = null;
        this.field1287 = null;
        this.field1288 = null;
        this.field1289 = null;
        this.field1290 = null;
        this.field1141 = null;
        this.field1142 = null;
        this.field1143 = null;
        this.field1144 = null;
        this.field1145 = null;
        this.field1483 = null;
        this.field1166 = null;
        this.field1482 = null;
        this.field1443 = null;
        this.field1425 = null;
        this.field1426 = null;
        this.field1427 = null;
        this.field1428 = null;
        this.field1205 = null;
        this.field1488 = null;
        this.field1217 = null;
        this.field1116 = null;
        this.field1118 = null;
        this.field1120 = null;
        this.field1121 = null;
        this.field1397 = null;
        this.field1189 = null;
        this.field1191 = null;
        this.field1263 = null;
        this.field1137 = null;
        this.field1401 = null;
        this.field1237 = null;
        this.field1294 = null;
        this.field1105 = null;
        this.field1500 = null;
        this.field1501 = null;
        this.field1502 = null;
        this.field1503 = null;
        this.field1291 = null;
        this.field1178 = null;
        this.field1307 = null;
        this.field1308 = null;
        this.field1208 = null;
        this.field1421 = null;
        this.field1155 = null;
        this.field1459 = null;
        this.field1165 = null;
        this.field1127 = null;
        this.field1128 = null;
        this.field1124 = null;
        this.field1125 = null;
        this.field1126 = null;
        this.field1129 = null;
        this.field1130 = null;
        this.field1131 = null;
        this.field1132 = null;
        this.method363((byte) 3);
        LocType.method273(this.field1100);
        NpcType.method279(this.field1100);
        ObjType.method285(this.field1100);
        FloType.field931 = null;
        IdkType.field947 = null;
        Component.field955 = null;
        UnkType.field1016 = null;
        SeqType.field1026 = null;
        SpotAnimType.field1043 = null;
        SpotAnimType.field1055 = null;
        VarpType.field1060 = null;
        super.field13 = null;
        PlayerEntity.field380 = null;
        Pix3D.method152(this.field1100);
        World3D.method49(this.field1100);
        Model.method119(this.field1100);
        AnimBase.field81 = null;
        AnimFrame.field87 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)Ljava/awt/Component;")
    public final java.awt.Component method11(byte arg0) {
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            this.field1258 = this.field1369.method245();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field15 != null ? super.field15 : this;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field1201[var1] = var0 / 4;
        }
        field1211 = -359;
        field1264 = 10;
        field1266 = true;
        field1285 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field1332 = true;
        field1400 = true;
        field1415 = 724;
        field1450 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field1469 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field1472 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field1506 = 171;
    }
}
