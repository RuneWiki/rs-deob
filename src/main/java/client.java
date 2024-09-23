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

    @OriginalMember(owner = "client", name = "C", descriptor = "Ljava/lang/String;")
    private String field1059 = "";

    @OriginalMember(owner = "client", name = "I", descriptor = "I")
    private int field1065 = 128;

    @OriginalMember(owner = "client", name = "M", descriptor = "Lob;")
    private LinkList field1069 = new LinkList((byte) 5);

    @OriginalMember(owner = "client", name = "N", descriptor = "Z")
    private boolean field1070 = false;

    @OriginalMember(owner = "client", name = "P", descriptor = "[B")
    private byte[] field1072 = new byte[16384];

    @OriginalMember(owner = "client", name = "Q", descriptor = "[I")
    private int[] field1073 = new int[4000];

    @OriginalMember(owner = "client", name = "R", descriptor = "[I")
    private int[] field1074 = new int[4000];

    @OriginalMember(owner = "client", name = "bb", descriptor = "Ljava/lang/String;")
    private String field1084 = "";

    @OriginalMember(owner = "client", name = "fb", descriptor = "[Lhb;")
    private Pix32[] field1088 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field1089 = 2301979;

    @OriginalMember(owner = "client", name = "hb", descriptor = "Z")
    private boolean field1090 = false;

    @OriginalMember(owner = "client", name = "ib", descriptor = "Z")
    private boolean field1091 = false;

    @OriginalMember(owner = "client", name = "jb", descriptor = "Z")
    private boolean field1092 = false;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field1094 = -1;

    @OriginalMember(owner = "client", name = "mb", descriptor = "Z")
    private boolean field1095 = false;

    @OriginalMember(owner = "client", name = "sb", descriptor = "Z")
    private boolean field1101 = false;

    @OriginalMember(owner = "client", name = "xb", descriptor = "[I")
    private int[] field1106 = new int[50];

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field1107 = -1;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field1110 = 681;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "[I")
    private int[] field1111 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Fb", descriptor = "Z")
    private boolean field1114 = true;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "Z")
    private boolean field1115 = true;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "Lkb;")
    private Packet field1119 = Packet.method196(1, true);

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private final int field1120 = 100;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "[I")
    private int[] field1121 = new int[100];

    @OriginalMember(owner = "client", name = "Ob", descriptor = "Ljava/lang/String;")
    private String field1123 = "";

    @OriginalMember(owner = "client", name = "Pb", descriptor = "Ljava/lang/String;")
    private String field1124 = "";

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field1125 = -588;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "[I")
    private final int[] field1126 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Sb", descriptor = "B")
    private byte field1127 = 0;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "Z")
    private boolean field1128 = false;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "[Lhb;")
    private Pix32[] field1130 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Zb", descriptor = "Z")
    private boolean field1134 = true;

    @OriginalMember(owner = "client", name = "gc", descriptor = "[I")
    private int[] field1141 = new int[33];

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field1142 = -1;

    @OriginalMember(owner = "client", name = "jc", descriptor = "[I")
    private int[] field1144 = new int[50];

    @OriginalMember(owner = "client", name = "mc", descriptor = "[I")
    private int[] field1147 = new int[33];

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field1148 = 21710;

    @OriginalMember(owner = "client", name = "oc", descriptor = "Lob;")
    private LinkList field1149 = new LinkList((byte) 5);

    @OriginalMember(owner = "client", name = "pc", descriptor = "Z")
    private boolean field1150 = false;

    @OriginalMember(owner = "client", name = "vc", descriptor = "Z")
    private boolean field1156 = false;

    @OriginalMember(owner = "client", name = "wc", descriptor = "B")
    private byte field1157 = 5;

    @OriginalMember(owner = "client", name = "xc", descriptor = "[Ljava/lang/String;")
    private String[] field1158 = new String[500];

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field1159 = 9;

    @OriginalMember(owner = "client", name = "zc", descriptor = "Z")
    private boolean field1160 = true;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "B")
    private byte field1163 = 119;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "I")
    private int field1165 = -1;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field1166 = -1;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "Z")
    private boolean field1173 = false;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "Z")
    private boolean field1175 = false;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "Z")
    private boolean field1176 = false;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "[I")
    private int[] field1177 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Rc", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1178 = new CRC32();

    @OriginalMember(owner = "client", name = "Tc", descriptor = "Ljava/lang/String;")
    private String field1180 = "";

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field1181 = -1;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "[J")
    private long[] field1182 = new long[100];

    @OriginalMember(owner = "client", name = "Wc", descriptor = "[I")
    private int[] field1183 = new int[256];

    @OriginalMember(owner = "client", name = "cd", descriptor = "[Z")
    private boolean[] field1189 = new boolean[5];

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field1196 = 1;

    @OriginalMember(owner = "client", name = "kd", descriptor = "[I")
    private int[] field1197 = new int[151];

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field1201 = 1;

    @OriginalMember(owner = "client", name = "qd", descriptor = "[I")
    private int[] field1203 = new int[50];

    @OriginalMember(owner = "client", name = "vd", descriptor = "Lhc;")
    private Component field1208 = new Component();

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field1210 = 2;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "[J")
    private long[] field1234 = new long[100];

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field1241 = 419;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field1242 = -1;

    @OriginalMember(owner = "client", name = "le", descriptor = "[[I")
    private int[][] field1250 = new int[104][104];

    @OriginalMember(owner = "client", name = "me", descriptor = "Z")
    private boolean field1251 = false;

    @OriginalMember(owner = "client", name = "ne", descriptor = "[[I")
    private int[][] field1252 = new int[104][104];

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field1254 = 979;

    @OriginalMember(owner = "client", name = "se", descriptor = "Ljava/lang/Object;")
    private Object field1257 = new Object();

    @OriginalMember(owner = "client", name = "we", descriptor = "Lob;")
    private LinkList field1261 = new LinkList((byte) 5);

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field1268 = -1;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "[Lhb;")
    private Pix32[] field1269 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Fe", descriptor = "[Lib;")
    private Pix8[] field1270 = new Pix8[13];

    @OriginalMember(owner = "client", name = "He", descriptor = "Z")
    private boolean field1272 = false;

    @OriginalMember(owner = "client", name = "Je", descriptor = "I")
    private int field1274 = 4;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "[I")
    private int[] field1275 = new int[5];

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field1278 = 7759444;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field1282 = 34304;

    @OriginalMember(owner = "client", name = "Se", descriptor = "B")
    private byte field1283 = 78;

    @OriginalMember(owner = "client", name = "Te", descriptor = "[I")
    private int[] field1284 = new int[5];

    @OriginalMember(owner = "client", name = "Ue", descriptor = "Z")
    private boolean field1285 = false;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field1286 = 833;

    @OriginalMember(owner = "client", name = "We", descriptor = "[I")
    private int[] field1287 = new int[2000];

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field1292 = 701;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field1293 = 8;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field1294 = -1;

    @OriginalMember(owner = "client", name = "ff", descriptor = "[Lhb;")
    private Pix32[] field1296 = new Pix32[50];

    @OriginalMember(owner = "client", name = "nf", descriptor = "Lkb;")
    private Packet field1303 = Packet.method196(1, true);

    @OriginalMember(owner = "client", name = "pf", descriptor = "Z")
    private boolean field1305 = false;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field1313 = 737;

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private int field1316 = -31746;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "[Ly;")
    private NpcEntity[] field1317 = new NpcEntity[8192];

    @OriginalMember(owner = "client", name = "Df", descriptor = "[I")
    public int[] field1319 = new int[8192];

    @OriginalMember(owner = "client", name = "Ef", descriptor = "[I")
    private int[] field1320 = new int[100];

    @OriginalMember(owner = "client", name = "Ff", descriptor = "[Lib;")
    private Pix8[] field1321 = new Pix8[50];

    @OriginalMember(owner = "client", name = "Gf", descriptor = "[[[Lob;")
    private LinkList[][][] field1322 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "Hf", descriptor = "Z")
    private boolean field1323 = false;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "[Ljava/lang/String;")
    private String[] field1328 = new String[100];

    @OriginalMember(owner = "client", name = "Nf", descriptor = "Z")
    private boolean field1329 = false;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field1335 = 3353893;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "[I")
    private int[] field1336 = new int[7];

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field1341 = 2048;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private int field1342 = 2047;

    @OriginalMember(owner = "client", name = "bg", descriptor = "[Lz;")
    private PlayerEntity[] field1343 = new PlayerEntity[this.field1341];

    @OriginalMember(owner = "client", name = "dg", descriptor = "[I")
    public int[] field1345 = new int[this.field1341];

    @OriginalMember(owner = "client", name = "fg", descriptor = "[I")
    private int[] field1347 = new int[this.field1341];

    @OriginalMember(owner = "client", name = "gg", descriptor = "[Lkb;")
    private Packet[] field1348 = new Packet[this.field1341];

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field1351 = -1;

    @OriginalMember(owner = "client", name = "ng", descriptor = "[[I")
    private int[][] field1355 = new int[104][104];

    @OriginalMember(owner = "client", name = "og", descriptor = "[I")
    private int[] field1356 = new int[2000];

    @OriginalMember(owner = "client", name = "pg", descriptor = "Ljava/lang/String;")
    private String field1357 = "";

    @OriginalMember(owner = "client", name = "qg", descriptor = "Ljava/lang/String;")
    private String field1358 = "";

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field1360 = 2;

    @OriginalMember(owner = "client", name = "tg", descriptor = "[I")
    private int[] field1361 = new int[50];

    @OriginalMember(owner = "client", name = "Bg", descriptor = "[Lec;")
    private CollisionMap[] field1369 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "Dg", descriptor = "[I")
    private int[] field1371 = new int[5];

    @OriginalMember(owner = "client", name = "Fg", descriptor = "[I")
    private int[] field1373 = new int[50];

    @OriginalMember(owner = "client", name = "Ig", descriptor = "[I")
    private int[] field1376 = new int[100];

    @OriginalMember(owner = "client", name = "Jg", descriptor = "[Ljava/lang/String;")
    private String[] field1377 = new String[100];

    @OriginalMember(owner = "client", name = "Kg", descriptor = "[Ljava/lang/String;")
    private String[] field1378 = new String[100];

    @OriginalMember(owner = "client", name = "Lg", descriptor = "Lob;")
    private LinkList field1379 = new LinkList((byte) 5);

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field1380 = 733;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "[Lhb;")
    private Pix32[] field1381 = new Pix32[8];

    @OriginalMember(owner = "client", name = "Og", descriptor = "Z")
    private boolean field1382 = true;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "Z")
    private boolean field1383 = false;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field1386 = -1;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field1387 = 78;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Z")
    private boolean field1391 = false;

    @OriginalMember(owner = "client", name = "hh", descriptor = "Z")
    private boolean field1401 = true;

    @OriginalMember(owner = "client", name = "lh", descriptor = "Z")
    private boolean field1405 = false;

    @OriginalMember(owner = "client", name = "mh", descriptor = "[I")
    private int[] field1406 = new int[5];

    @OriginalMember(owner = "client", name = "nh", descriptor = "Z")
    private boolean field1407 = false;

    @OriginalMember(owner = "client", name = "ph", descriptor = "Ljava/lang/String;")
    private String field1409 = "";

    @OriginalMember(owner = "client", name = "wh", descriptor = "Ljava/lang/String;")
    private String field1416 = "";

    @OriginalMember(owner = "client", name = "xh", descriptor = "Z")
    private boolean field1417 = false;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "[I")
    private int[] field1420 = new int[500];

    @OriginalMember(owner = "client", name = "Bh", descriptor = "[I")
    private int[] field1421 = new int[500];

    @OriginalMember(owner = "client", name = "Ch", descriptor = "[I")
    private int[] field1422 = new int[500];

    @OriginalMember(owner = "client", name = "Dh", descriptor = "[I")
    private int[] field1423 = new int[500];

    @OriginalMember(owner = "client", name = "Eh", descriptor = "Z")
    private boolean field1424 = false;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "[I")
    private int[] field1425 = new int[50];

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field1427 = 3;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field1428 = 5063219;

    @OriginalMember(owner = "client", name = "Th", descriptor = "I")
    private int field1439 = 50;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "[I")
    private int[] field1440 = new int[this.field1439];

    @OriginalMember(owner = "client", name = "Vh", descriptor = "[I")
    private int[] field1441 = new int[this.field1439];

    @OriginalMember(owner = "client", name = "Wh", descriptor = "[I")
    private int[] field1442 = new int[this.field1439];

    @OriginalMember(owner = "client", name = "Xh", descriptor = "[I")
    private int[] field1443 = new int[this.field1439];

    @OriginalMember(owner = "client", name = "Yh", descriptor = "[I")
    private int[] field1444 = new int[this.field1439];

    @OriginalMember(owner = "client", name = "Zh", descriptor = "[I")
    private int[] field1445 = new int[this.field1439];

    @OriginalMember(owner = "client", name = "ai", descriptor = "[I")
    private int[] field1446 = new int[this.field1439];

    @OriginalMember(owner = "client", name = "bi", descriptor = "[Ljava/lang/String;")
    private String[] field1447 = new String[this.field1439];

    @OriginalMember(owner = "client", name = "ei", descriptor = "[I")
    public int[] field1450 = new int[1000];

    @OriginalMember(owner = "client", name = "fi", descriptor = "Lkb;")
    private Packet field1451 = Packet.method196(1, true);

    @OriginalMember(owner = "client", name = "hi", descriptor = "[I")
    private int[] field1453 = new int[9];

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private int field1454 = 8;

    @OriginalMember(owner = "client", name = "xi", descriptor = "[I")
    private int[] field1469 = new int[5];

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field1477 = -1;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field1478 = 30850;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "[I")
    private int[] field1480 = new int[1000];

    @OriginalMember(owner = "client", name = "Ji", descriptor = "[I")
    private int[] field1481 = new int[1000];

    @OriginalMember(owner = "client", name = "Ki", descriptor = "[I")
    private int[] field1482 = new int[151];

    @OriginalMember(owner = "client", name = "Li", descriptor = "Z")
    private boolean field1483 = false;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "Lob;")
    private LinkList field1484 = new LinkList((byte) 5);

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field1485 = -24040;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field1487 = 2;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "Z")
    private boolean field1489 = false;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private static int field1122 = -757;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private static int field1131 = -251;

    @OriginalMember(owner = "client", name = "kc", descriptor = "[I")
    public static final int[] field1145 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client", name = "sd", descriptor = "[[I")
    public static final int[][] field1205 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client", name = "Pe", descriptor = "[I")
    private static int[] field1280 = new int[99];

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private static int field1324;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "Z")
    private static boolean field1326;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1337;

    @OriginalMember(owner = "client", name = "kh", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1404;

    @OriginalMember(owner = "client", name = "Si", descriptor = "Ljava/lang/String;")
    private static String field1490;

    @OriginalMember(owner = "client", name = "B", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "client", name = "J", descriptor = "I")
    private int field1066;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field1076;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private static int field1082;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private static int field1083;

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    private int field1085;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private int field1086;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private static int field1093;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field1096;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private int field1097;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field1098;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field1099;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field1100;

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field1102;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field1108;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field1109;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field1113;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field1117;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field1129;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field1133;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field1136;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field1137;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1138;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field1139;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field1140;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field1143;

    @OriginalMember(owner = "client", name = "lc", descriptor = "I")
    private int field1146;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private static int field1162;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field1164;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field1167;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field1168;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    private int field1169;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private int field1170;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field1171;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field1172;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private static int field1174;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field1179;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field1184;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field1190;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field1191;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field1192;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field1193;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field1194;

    @OriginalMember(owner = "client", name = "id", descriptor = "I")
    private int field1195;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field1199;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field1200;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private int field1202;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field1204;

    @OriginalMember(owner = "client", name = "wd", descriptor = "I")
    private int field1209;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field1215;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field1216;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field1217;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field1218;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "I")
    private static int field1229;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    private int field1235;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field1243;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field1255;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field1258;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field1259;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field1260;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private int field1262;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1265;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field1267;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field1271;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field1273;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field1277;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field1281;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field1289;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private int field1291;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field1295;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field1300;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field1301;

    @OriginalMember(owner = "client", name = "mf", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client", name = "of", descriptor = "I")
    private static int field1304;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private static int field1311;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private static int field1312;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private int field1314;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field1315;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private static int field1325;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private static int field1332;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field1333;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field1334;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private static int field1338;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private static int field1339;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private static int field1340;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field1344;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field1353;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field1359;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private static int field1363;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field1364;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field1365;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private static int field1367;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field1370;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private static int field1372;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field1374;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field1384;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field1385;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field1388;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client", name = "qh", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field1415;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field1426;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field1429;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field1430;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field1449;

    @OriginalMember(owner = "client", name = "gi", descriptor = "I")
    private int field1452;

    @OriginalMember(owner = "client", name = "ji", descriptor = "I")
    private int field1455;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private int field1456;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field1461;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field1462;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field1463;

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field1470;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field1471;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private static int field1472;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field1474;

    @OriginalMember(owner = "client", name = "Di", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field1476;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field1479;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field1488;

    @OriginalMember(owner = "client", name = "S", descriptor = "J")
    private long field1075;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "J")
    private long field1132;

    @OriginalMember(owner = "client", name = "Le", descriptor = "J")
    private long field1276;

    @OriginalMember(owner = "client", name = "ac", descriptor = "Ld;")
    private ClientStream field1135;

    @OriginalMember(owner = "client", name = "uf", descriptor = "Ltb;")
    private Isaac field1310;

    @OriginalMember(owner = "client", name = "oi", descriptor = "Lub;")
    private Jagfile field1460;

    @OriginalMember(owner = "client", name = "D", descriptor = "Lhb;")
    private Pix32 field1060;

    @OriginalMember(owner = "client", name = "E", descriptor = "Lhb;")
    private Pix32 field1061;

    @OriginalMember(owner = "client", name = "F", descriptor = "Lhb;")
    private Pix32 field1062;

    @OriginalMember(owner = "client", name = "G", descriptor = "Lhb;")
    private Pix32 field1063;

    @OriginalMember(owner = "client", name = "eb", descriptor = "Lhb;")
    private Pix32 field1087;

    @OriginalMember(owner = "client", name = "Db", descriptor = "Lhb;")
    private Pix32 field1112;

    @OriginalMember(owner = "client", name = "td", descriptor = "Lhb;")
    private Pix32 field1206;

    @OriginalMember(owner = "client", name = "ud", descriptor = "Lhb;")
    private Pix32 field1207;

    @OriginalMember(owner = "client", name = "fe", descriptor = "Lhb;")
    private Pix32 field1244;

    @OriginalMember(owner = "client", name = "ge", descriptor = "Lhb;")
    private Pix32 field1245;

    @OriginalMember(owner = "client", name = "kg", descriptor = "Lhb;")
    private Pix32 field1352;

    @OriginalMember(owner = "client", name = "ub", descriptor = "Lib;")
    private Pix8 field1103;

    @OriginalMember(owner = "client", name = "vb", descriptor = "Lib;")
    private Pix8 field1104;

    @OriginalMember(owner = "client", name = "wb", descriptor = "Lib;")
    private Pix8 field1105;

    @OriginalMember(owner = "client", name = "qc", descriptor = "Lib;")
    private Pix8 field1151;

    @OriginalMember(owner = "client", name = "rc", descriptor = "Lib;")
    private Pix8 field1152;

    @OriginalMember(owner = "client", name = "sc", descriptor = "Lib;")
    private Pix8 field1153;

    @OriginalMember(owner = "client", name = "tc", descriptor = "Lib;")
    private Pix8 field1154;

    @OriginalMember(owner = "client", name = "uc", descriptor = "Lib;")
    private Pix8 field1155;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "Lib;")
    private Pix8 field1236;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "Lib;")
    private Pix8 field1237;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "Lib;")
    private Pix8 field1238;

    @OriginalMember(owner = "client", name = "ae", descriptor = "Lib;")
    private Pix8 field1239;

    @OriginalMember(owner = "client", name = "be", descriptor = "Lib;")
    private Pix8 field1240;

    @OriginalMember(owner = "client", name = "rf", descriptor = "Lib;")
    private Pix8 field1307;

    @OriginalMember(owner = "client", name = "sf", descriptor = "Lib;")
    private Pix8 field1308;

    @OriginalMember(owner = "client", name = "tf", descriptor = "Lib;")
    private Pix8 field1309;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "Lib;")
    private Pix8 field1389;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "Lib;")
    private Pix8 field1390;

    @OriginalMember(owner = "client", name = "ih", descriptor = "Lib;")
    private Pix8 field1402;

    @OriginalMember(owner = "client", name = "jh", descriptor = "Lib;")
    private Pix8 field1403;

    @OriginalMember(owner = "client", name = "he", descriptor = "Ljb;")
    private PixFont field1246;

    @OriginalMember(owner = "client", name = "ie", descriptor = "Ljb;")
    private PixFont field1247;

    @OriginalMember(owner = "client", name = "je", descriptor = "Ljb;")
    private PixFont field1248;

    @OriginalMember(owner = "client", name = "ke", descriptor = "Ljb;")
    private PixFont field1249;

    @OriginalMember(owner = "client", name = "yd", descriptor = "Lqb;")
    private PixMap field1211;

    @OriginalMember(owner = "client", name = "zd", descriptor = "Lqb;")
    private PixMap field1212;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "Lqb;")
    private PixMap field1213;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "Lqb;")
    private PixMap field1214;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "Lqb;")
    private PixMap field1219;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "Lqb;")
    private PixMap field1220;

    @OriginalMember(owner = "client", name = "Id", descriptor = "Lqb;")
    private PixMap field1221;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "Lqb;")
    private PixMap field1222;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "Lqb;")
    private PixMap field1223;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "Lqb;")
    private PixMap field1224;

    @OriginalMember(owner = "client", name = "Md", descriptor = "Lqb;")
    private PixMap field1225;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "Lqb;")
    private PixMap field1226;

    @OriginalMember(owner = "client", name = "Od", descriptor = "Lqb;")
    private PixMap field1227;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "Lqb;")
    private PixMap field1228;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "Lqb;")
    private PixMap field1231;

    @OriginalMember(owner = "client", name = "Td", descriptor = "Lqb;")
    private PixMap field1232;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "Lqb;")
    private PixMap field1233;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "Lqb;")
    private PixMap field1392;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Lqb;")
    private PixMap field1393;

    @OriginalMember(owner = "client", name = "ah", descriptor = "Lqb;")
    private PixMap field1394;

    @OriginalMember(owner = "client", name = "bh", descriptor = "Lqb;")
    private PixMap field1395;

    @OriginalMember(owner = "client", name = "ch", descriptor = "Lqb;")
    private PixMap field1396;

    @OriginalMember(owner = "client", name = "dh", descriptor = "Lqb;")
    private PixMap field1397;

    @OriginalMember(owner = "client", name = "eh", descriptor = "Lqb;")
    private PixMap field1398;

    @OriginalMember(owner = "client", name = "fh", descriptor = "Lqb;")
    private PixMap field1399;

    @OriginalMember(owner = "client", name = "gh", descriptor = "Lqb;")
    private PixMap field1400;

    @OriginalMember(owner = "client", name = "si", descriptor = "Lz;")
    private PlayerEntity field1464;

    @OriginalMember(owner = "client", name = "ci", descriptor = "Lr;")
    private World3D field1448;

    @OriginalMember(owner = "client", name = "ig", descriptor = "Ljava/lang/String;")
    private String field1350;

    @OriginalMember(owner = "client", name = "ug", descriptor = "Ljava/lang/String;")
    private String field1362;

    @OriginalMember(owner = "client", name = "yg", descriptor = "Ljava/lang/String;")
    private String field1366;

    @OriginalMember(owner = "client", name = "ni", descriptor = "Ljava/lang/String;")
    public String field1459;

    @OriginalMember(owner = "client", name = "wi", descriptor = "Ljava/lang/String;")
    public String field1468;

    @OriginalMember(owner = "client", name = "H", descriptor = "Z")
    private static boolean field1064;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "Z")
    private static boolean field1230;

    @OriginalMember(owner = "client", name = "ye", descriptor = "Z")
    private static boolean field1263;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "Z")
    private static boolean field1327;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "Z")
    private static boolean field1434;

    @OriginalMember(owner = "client", name = "U", descriptor = "[I")
    private int[] field1077;

    @OriginalMember(owner = "client", name = "V", descriptor = "[I")
    private int[] field1078;

    @OriginalMember(owner = "client", name = "W", descriptor = "[I")
    private int[] field1079;

    @OriginalMember(owner = "client", name = "X", descriptor = "[I")
    private int[] field1080;

    @OriginalMember(owner = "client", name = "Y", descriptor = "[I")
    private int[] field1081;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "[I")
    private int[] field1185;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "[I")
    private int[] field1186;

    @OriginalMember(owner = "client", name = "ad", descriptor = "[I")
    private int[] field1187;

    @OriginalMember(owner = "client", name = "bd", descriptor = "[I")
    private int[] field1188;

    @OriginalMember(owner = "client", name = "Of", descriptor = "[I")
    private int[] field1330;

    @OriginalMember(owner = "client", name = "yh", descriptor = "[I")
    private int[] field1418;

    @OriginalMember(owner = "client", name = "zh", descriptor = "[I")
    private int[] field1419;

    @OriginalMember(owner = "client", name = "O", descriptor = "[Lib;")
    private Pix8[] field1071;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "[[B")
    private byte[][] field1116;

    @OriginalMember(owner = "client", name = "hg", descriptor = "[[B")
    private byte[][] field1349;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "[[[B")
    private byte[][][] field1118;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "[[[I")
    private int[][][] field1161;

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method363(int arg0) {
        int var2 = 93 / arg0;
        for (LocEntity var3 = (LocEntity) this.field1484.method228(); var3 != null; var3 = (LocEntity) this.field1484.method230(735)) {
            boolean var4 = false;
            var3.field649 += this.field1271;
            if (var3.field648 == -1) {
                var3.field648 = 0;
                var4 = true;
            }
            label69: {
                do {
                    do {
                        if (var3.field649 <= var3.field647.field1003[var3.field648]) {
                            break label69;
                        }
                        var3.field649 -= var3.field647.field1003[var3.field648] + 1;
                        ++var3.field648;
                        var4 = true;
                    } while (var3.field648 < var3.field647.field1000);
                    var3.field648 -= var3.field647.field1004;
                } while (var3.field648 >= 0 && var3.field648 < var3.field647.field1000);
                var3.method107();
                var4 = false;
            }
            if (var4) {
                int var5 = var3.field642;
                int var6 = var3.field644;
                int var7 = var3.field645;
                int var8 = 0;
                if (var3.field643 == 0) {
                    var8 = this.field1448.method77(var5, var6, var7);
                }
                if (var3.field643 == 1) {
                    var8 = this.field1448.method78(var6, (byte) 116, var7, var5);
                }
                if (var3.field643 == 2) {
                    var8 = this.field1448.method79(var5, var6, var7);
                }
                if (var3.field643 == 3) {
                    var8 = this.field1448.method80(var5, var6, var7);
                }
                if (var8 != 0 && (var8 >> 14 & 32767) == var3.field646) {
                    int var9 = this.field1161[var5][var6][var7];
                    int var10 = this.field1161[var5][var6 + 1][var7];
                    int var11 = this.field1161[var5][var6 + 1][var7 + 1];
                    int var12 = this.field1161[var5][var6][var7 + 1];
                    LocType var13 = LocType.method275(var3.field646);
                    int var14 = -1;
                    if (var3.field648 != -1) {
                        var14 = var3.field647.field1001[var3.field648];
                    }
                    if (var3.field643 == 2) {
                        int var15 = this.field1448.method81(var5, var6, var7, var8);
                        int var16 = var15 & 31;
                        int var17 = var15 >> 6;
                        if (var16 == 11) {
                            var16 = 10;
                        }
                        Model var18 = var13.method278(var16, var17, var9, var10, var11, var12, var14);
                        this.field1448.method66(var6, (byte) -46, var5, var18, var7);
                    } else if (var3.field643 == 1) {
                        Model var19 = var13.method278(4, 0, var9, var10, var11, var12, var14);
                        this.field1448.method68(var19, var7, false, var5, var6);
                    } else if (var3.field643 == 0) {
                        int var20 = this.field1448.method81(var5, var6, var7, var8);
                        int var21 = var20 & 31;
                        int var22 = var20 >> 6;
                        if (var21 == 2) {
                            int var23 = var22 + 1 & 3;
                            Model var24 = var13.method278(2, var22 + 4, var9, var10, var11, var12, var14);
                            Model var25 = var13.method278(2, var23, var9, var10, var11, var12, var14);
                            this.field1448.method71(var5, var24, var7, var6, (byte) 4, var25);
                        } else {
                            Model var26 = var13.method278(var21, var22, var9, var10, var11, var12, var14);
                            this.field1448.method70(var7, var6, var5, var26, (byte) 8);
                        }
                    } else if (var3.field643 == 3) {
                        int var27 = this.field1448.method81(var5, var6, var7, var8);
                        int var28 = var27 >> 6;
                        Model var29 = var13.method278(22, var28, var9, var10, var11, var12, var14);
                        this.field1448.method69(var6, var7, var5, var29, (byte) -58);
                    }
                } else {
                    var3.method107();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIZIILhc;)V")
    public final void method364(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, Component arg8) {
        if (arg3 != 8) {
            this.field1168 = this.field1119.method209();
        }
        if (this.field1329) {
            this.field1375 = 32;
        } else {
            this.field1375 = 0;
        }
        this.field1329 = false;
        if (arg1 >= arg4 && arg1 < arg4 + 16 && arg2 >= arg7 && arg2 < arg7 + 16) {
            arg8.field952 -= this.field1408 * 4;
            if (arg5) {
                this.field1092 = true;
                return;
            }
        } else if (arg1 >= arg4 && arg1 < arg4 + 16 && arg2 >= arg6 + arg7 - 16 && arg2 < arg6 + arg7) {
            arg8.field952 += this.field1408 * 4;
            if (arg5) {
                this.field1092 = true;
                return;
            }
        } else {
            if (arg1 < arg4 - this.field1375 || arg1 >= arg4 + 16 + this.field1375 || arg2 < arg7 + 16 || arg2 >= arg6 + arg7 - 16 || this.field1408 <= 0) {
                return;
            }
            int var10 = (arg6 - 32) * arg6 / arg0;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg2 - arg7 - 16 - var10 / 2;
            int var12 = arg6 - 32 - var10;
            arg8.field952 = (arg0 - arg6) * var11 / var12;
            if (arg5) {
                this.field1092 = true;
            }
            this.field1329 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1167 += arg4;
        this.field1389.method186(arg1, arg0, -141);
        this.field1390.method186(arg1, arg0 + arg2 - 16, -141);
        Pix2D.method149(16, arg2 - 32, this.field1089, arg0 + 16, (byte) -37, arg1);
        int var7 = (arg2 - 32) * arg2 / arg3;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg2 - 32 - var7) * arg5 / (arg3 - arg2);
        Pix2D.method149(16, var7, this.field1428, arg0 + 16 + var8, (byte) -37, arg1);
        Pix2D.method152(var7, this.field1278, arg0 + 16 + var8, -829, arg1);
        Pix2D.method152(var7, this.field1278, arg0 + 16 + var8, -829, arg1 + 1);
        Pix2D.method151(1, arg0 + 16 + var8, this.field1278, arg1, 16);
        Pix2D.method151(1, arg0 + 17 + var8, this.field1278, arg1, 16);
        Pix2D.method152(var7, this.field1335, arg0 + 16 + var8, -829, arg1 + 15);
        Pix2D.method152(var7 - 1, this.field1335, arg0 + 17 + var8, -829, arg1 + 14);
        Pix2D.method151(1, arg0 + 15 + var8 + var7, this.field1335, arg1, 16);
        Pix2D.method151(1, arg0 + 14 + var8 + var7, this.field1335, arg1 + 1, 15);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method366(boolean arg0) {
        int var2 = this.field1410 * 128 + 64;
        int var3 = this.field1411 * 128 + 64;
        int var4 = this.method449(this.field1333, field1131, this.field1411, this.field1410) - this.field1412;
        if (this.field1136 < var2) {
            this.field1136 += (var2 - this.field1136) * this.field1414 / 1000 + this.field1413;
            if (this.field1136 > var2) {
                this.field1136 = var2;
            }
        }
        if (this.field1136 > var2) {
            this.field1136 -= (this.field1136 - var2) * this.field1414 / 1000 + this.field1413;
            if (this.field1136 < var2) {
                this.field1136 = var2;
            }
        }
        if (this.field1137 < var4) {
            this.field1137 += (var4 - this.field1137) * this.field1414 / 1000 + this.field1413;
            if (this.field1137 > var4) {
                this.field1137 = var4;
            }
        }
        if (this.field1137 > var4) {
            this.field1137 -= (this.field1137 - var4) * this.field1414 / 1000 + this.field1413;
            if (this.field1137 < var4) {
                this.field1137 = var4;
            }
        }
        if (this.field1138 < var3) {
            this.field1138 += (var3 - this.field1138) * this.field1414 / 1000 + this.field1413;
            if (this.field1138 > var3) {
                this.field1138 = var3;
            }
        }
        if (this.field1138 > var3) {
            this.field1138 -= (this.field1138 - var3) * this.field1414 / 1000 + this.field1413;
            if (this.field1138 < var3) {
                this.field1138 = var3;
            }
        }
        int var5 = this.field1429 * 128 + 64;
        int var6 = this.field1430 * 128 + 64;
        this.field1483 &= arg0;
        int var7 = this.method449(this.field1333, field1131, this.field1430, this.field1429) - this.field1431;
        int var8 = var5 - this.field1136;
        int var9 = var7 - this.field1137;
        int var10 = var6 - this.field1138;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1139 < var12) {
            this.field1139 += (var12 - this.field1139) * this.field1433 / 1000 + this.field1432;
            if (this.field1139 > var12) {
                this.field1139 = var12;
            }
        }
        if (this.field1139 > var12) {
            this.field1139 -= (this.field1139 - var12) * this.field1433 / 1000 + this.field1432;
            if (this.field1139 < var12) {
                this.field1139 = var12;
            }
        }
        int var14 = var13 - this.field1140;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1140 += this.field1433 * var14 / 1000 + this.field1432;
            this.field1140 &= 2047;
        }
        if (var14 < 0) {
            this.field1140 -= -var14 * this.field1433 / 1000 + this.field1432;
            this.field1140 &= 2047;
        }
        int var15 = var13 - this.field1140;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1140 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)Ljava/lang/String;")
    private static final String method367(int arg0, int arg1) {
        if (arg0 < 2 || arg0 > 2) {
            field1263 = !field1263;
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method368(int arg0) {
        if (this.field1164 >= 2 || this.field1455 != 0 || this.field1465 != 0) {
            String var2;
            if (this.field1455 == 1 && this.field1164 < 2) {
                var2 = "Use " + this.field1459 + " with...";
            } else if (this.field1465 == 1 && this.field1164 < 2) {
                var2 = this.field1468 + "...";
            } else {
                var2 = this.field1158[this.field1164 - 1];
            }
            if (this.field1164 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1164 - 2) + " more options";
            }
            this.field1248.method193(931, true, var2, 15, 4, 16777215);
            if (arg0 < 4 || arg0 > 4) {
                field1372 = 270;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;IB)V")
    private final void method369(Packet arg0, int arg1, byte arg2) {
        while (true) {
            if (arg0.field613 + 21 < arg1 * 8) {
                int var4 = arg0.method220(false, 13);
                if (var4 != 8191) {
                    if (this.field1317[var4] == null) {
                        this.field1317[var4] = new NpcEntity();
                    }
                    NpcEntity var5 = this.field1317[var4];
                    this.field1319[this.field1318++] = var4;
                    var5.field342 = field1354;
                    var5.field352 = NpcType.method281(arg0.method220(false, 11));
                    var5.field302 = var5.field352.field831;
                    var5.field305 = var5.field352.field835;
                    var5.field306 = var5.field352.field836;
                    var5.field307 = var5.field352.field837;
                    var5.field308 = var5.field352.field838;
                    var5.field303 = var5.field352.field834;
                    int var6 = arg0.method220(false, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg0.method220(false, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var5.method109(698, this.field1464.field346[0] + var6, this.field1464.field347[0] + var7, false);
                    int var8 = arg0.method220(false, 1);
                    if (var8 == 1) {
                        this.field1347[this.field1346++] = var4;
                    }
                    continue;
                }
            }
            arg0.method221((byte) 53);
            if (arg2 != 23) {
                field1434 = !field1434;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        if (signlink.sunjava) {
            super.field6 = 5;
        }
        if (!field1327) {
            this.field1156 = true;
            this.field1115 = true;
            this.method12(this, 2);
            this.method425(40000, "scape_main", -48, 12345678);
        }
        if (field1064) {
            this.field1405 = true;
        } else {
            field1064 = true;
            boolean var1 = false;
            String var2 = this.method477(105);
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
                this.field1091 = true;
            } else {
                try {
                    int var3 = 5;
                    this.field1453[8] = 0;
                    while (this.field1453[8] == 0) {
                        this.method13(10, "Connecting to fileserver", 0);
                        try {
                            DataInputStream var4 = this.method479("crc" + (int) (Math.random() * 9.9999999E7D));
                            Packet var5 = new Packet(575, new byte[36]);
                            var4.readFully(var5.field611, 0, 36);
                            for (int var6 = 0; var6 < 9; ++var6) {
                                this.field1453[var6] = var5.method214();
                            }
                            var4.close();
                        } catch (IOException var54) {
                            for (int var7 = var3; var7 > 0; --var7) {
                                this.method13(10, "Error loading - Will retry in " + var7 + " secs.", 0);
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
                    this.field1460 = this.method459(0, "title screen", "title", 10, this.field1453[1]);
                    this.field1246 = new PixFont("p11", this.field1460, -703);
                    this.field1247 = new PixFont("p12", this.field1460, -703);
                    this.field1248 = new PixFont("b12", this.field1460, -703);
                    this.field1249 = new PixFont("q8", this.field1460, -703);
                    this.method447(0);
                    this.method395((byte) -42);
                    Jagfile var8 = this.method459(0, "config", "config", 15, this.field1453[2]);
                    Jagfile var9 = this.method459(0, "interface", "interface", 20, this.field1453[3]);
                    Jagfile var10 = this.method459(0, "2d graphics", "media", 30, this.field1453[4]);
                    Jagfile var11 = this.method459(0, "3d graphics", "models", 40, this.field1453[5]);
                    Jagfile var12 = this.method459(0, "textures", "textures", 60, this.field1453[6]);
                    Jagfile var13 = this.method459(0, "chat system", "wordenc", 65, this.field1453[7]);
                    Jagfile var14 = this.method459(0, "sound effects", "sounds", 70, this.field1453[8]);
                    this.field1118 = new byte[4][104][104];
                    this.field1161 = new int[4][105][105];
                    this.field1448 = new World3D(this.field1161, 4, 104, -10463, 104);
                    for (int var15 = 0; var15 < 4; ++var15) {
                        this.field1369[var15] = new CollisionMap(104, 104, true);
                    }
                    this.field1087 = new Pix32(512, 512);
                    this.method13(75, "Unpacking media", 0);
                    this.field1103 = new Pix8(var10, "invback", 0);
                    this.field1105 = new Pix8(var10, "chatback", 0);
                    this.field1104 = new Pix8(var10, "mapback", 0);
                    this.field1307 = new Pix8(var10, "backbase1", 0);
                    this.field1308 = new Pix8(var10, "backbase2", 0);
                    this.field1309 = new Pix8(var10, "backhmid1", 0);
                    for (int var16 = 0; var16 < 13; ++var16) {
                        this.field1270[var16] = new Pix8(var10, "sideicons", var16);
                    }
                    this.field1352 = new Pix32(var10, "compass", 0);
                    try {
                        for (int var17 = 0; var17 < 50; ++var17) {
                            this.field1321[var17] = new Pix8(var10, "mapscene", var17);
                        }
                    } catch (Exception var53) {
                    }
                    try {
                        for (int var18 = 0; var18 < 50; ++var18) {
                            this.field1296[var18] = new Pix32(var10, "mapfunction", var18);
                        }
                    } catch (Exception var52) {
                    }
                    try {
                        for (int var19 = 0; var19 < 20; ++var19) {
                            this.field1269[var19] = new Pix32(var10, "hitmarks", var19);
                        }
                    } catch (Exception var51) {
                    }
                    try {
                        for (int var20 = 0; var20 < 20; ++var20) {
                            this.field1130[var20] = new Pix32(var10, "headicons", var20);
                        }
                    } catch (Exception var50) {
                    }
                    this.field1112 = new Pix32(var10, "mapflag", 0);
                    for (int var21 = 0; var21 < 8; ++var21) {
                        this.field1381[var21] = new Pix32(var10, "cross", var21);
                    }
                    this.field1060 = new Pix32(var10, "mapdots", 0);
                    this.field1061 = new Pix32(var10, "mapdots", 1);
                    this.field1062 = new Pix32(var10, "mapdots", 2);
                    this.field1063 = new Pix32(var10, "mapdots", 3);
                    this.field1389 = new Pix8(var10, "scrollbar", 0);
                    this.field1390 = new Pix8(var10, "scrollbar", 1);
                    this.field1151 = new Pix8(var10, "redstone1", 0);
                    this.field1152 = new Pix8(var10, "redstone2", 0);
                    this.field1153 = new Pix8(var10, "redstone3", 0);
                    this.field1154 = new Pix8(var10, "redstone1", 0);
                    this.field1154.method184(978);
                    this.field1155 = new Pix8(var10, "redstone2", 0);
                    this.field1155.method184(978);
                    this.field1236 = new Pix8(var10, "redstone1", 0);
                    this.field1236.method185(2);
                    this.field1237 = new Pix8(var10, "redstone2", 0);
                    this.field1237.method185(2);
                    this.field1238 = new Pix8(var10, "redstone3", 0);
                    this.field1238.method185(2);
                    this.field1239 = new Pix8(var10, "redstone1", 0);
                    this.field1239.method184(978);
                    this.field1239.method185(2);
                    this.field1240 = new Pix8(var10, "redstone2", 0);
                    this.field1240.method184(978);
                    this.field1240.method185(2);
                    Pix32 var22 = new Pix32(var10, "backleft1", 0);
                    this.field1219 = new PixMap(929, var22.field573, var22.field574, this.method11(101));
                    var22.method171(0, field1372, 0);
                    Pix32 var23 = new Pix32(var10, "backleft2", 0);
                    this.field1220 = new PixMap(929, var23.field573, var23.field574, this.method11(101));
                    var23.method171(0, field1372, 0);
                    Pix32 var24 = new Pix32(var10, "backright1", 0);
                    this.field1221 = new PixMap(929, var24.field573, var24.field574, this.method11(101));
                    var24.method171(0, field1372, 0);
                    Pix32 var25 = new Pix32(var10, "backright2", 0);
                    this.field1222 = new PixMap(929, var25.field573, var25.field574, this.method11(101));
                    var25.method171(0, field1372, 0);
                    Pix32 var26 = new Pix32(var10, "backtop1", 0);
                    this.field1223 = new PixMap(929, var26.field573, var26.field574, this.method11(101));
                    var26.method171(0, field1372, 0);
                    Pix32 var27 = new Pix32(var10, "backtop2", 0);
                    this.field1224 = new PixMap(929, var27.field573, var27.field574, this.method11(101));
                    var27.method171(0, field1372, 0);
                    Pix32 var28 = new Pix32(var10, "backvmid1", 0);
                    this.field1225 = new PixMap(929, var28.field573, var28.field574, this.method11(101));
                    var28.method171(0, field1372, 0);
                    Pix32 var29 = new Pix32(var10, "backvmid2", 0);
                    this.field1226 = new PixMap(929, var29.field573, var29.field574, this.method11(101));
                    var29.method171(0, field1372, 0);
                    Pix32 var30 = new Pix32(var10, "backvmid3", 0);
                    this.field1227 = new PixMap(929, var30.field573, var30.field574, this.method11(101));
                    var30.method171(0, field1372, 0);
                    Pix32 var31 = new Pix32(var10, "backhmid2", 0);
                    this.field1228 = new PixMap(929, var31.field573, var31.field574, this.method11(101));
                    var31.method171(0, field1372, 0);
                    this.method13(80, "Unpacking textures", 0);
                    Pix3D.method158(var12, -610);
                    Pix3D.method162(0.8D, field1122);
                    Pix3D.method157(false, 20);
                    this.method13(83, "Unpacking models", 0);
                    Model.method121(var11, false);
                    AnimBase.method47(var11, (byte) 6);
                    AnimFrame.method48(var11, (byte) 6);
                    this.method13(86, "Unpacking config", 0);
                    SeqType.method318(9, var8);
                    LocType.method273(var8);
                    FloType.method307(9, var8);
                    ObjType.method285(var8);
                    NpcType.method279(var8);
                    IdkType.method310(9, var8);
                    SpotAnimType.method320(9, var8);
                    VarpType.method323(9, var8);
                    ObjType.field858 = field1326;
                    if (!field1327) {
                        this.method13(90, "Unpacking sounds", 0);
                        byte[] var32 = var14.method250((byte[]) null, 3, "sounds.dat");
                        Packet var33 = new Packet(575, var32);
                        Wave.method263(9, var33);
                    }
                    this.method13(92, "Unpacking interfaces", 0);
                    PixFont[] var34 = new PixFont[] { this.field1246, this.field1247, this.field1248, this.field1249 };
                    Component.method314(var9, 0, var34, var10);
                    this.method13(97, "Preparing game engine", 0);
                    for (int var35 = 0; var35 < 33; ++var35) {
                        int var36 = 999;
                        int var37 = 0;
                        for (int var38 = 0; var38 < 35; ++var38) {
                            if (this.field1104.field582[this.field1104.field584 * var35 + var38] == 0) {
                                if (var36 == 999) {
                                    var36 = var38;
                                }
                            } else if (var36 != 999) {
                                var37 = var38;
                                break;
                            }
                        }
                        this.field1147[var35] = var36;
                        this.field1141[var35] = var37 - var36;
                    }
                    for (int var39 = 9; var39 < 160; ++var39) {
                        int var40 = 999;
                        int var41 = 0;
                        for (int var42 = 10; var42 < 168; ++var42) {
                            if (this.field1104.field582[this.field1104.field584 * var39 + var42] != 0 || var42 <= 34 && var39 <= 34) {
                                if (var40 != 999) {
                                    var41 = var42;
                                    break;
                                }
                            } else if (var40 == 999) {
                                var40 = var42;
                            }
                        }
                        this.field1197[var39 - 9] = var40 - 21;
                        this.field1482[var39 - 9] = var41 - var40;
                    }
                    Pix3D.method155(true, 96, 479);
                    this.field1077 = Pix3D.field557;
                    Pix3D.method155(true, 261, 190);
                    this.field1078 = Pix3D.field557;
                    Pix3D.method155(true, 334, 512);
                    this.field1079 = Pix3D.field557;
                    int[] var43 = new int[9];
                    for (int var44 = 0; var44 < 9; ++var44) {
                        int var45 = var44 * 32 + 128 + 15;
                        int var46 = var45 * 3 + 600;
                        int var47 = Pix3D.field555[var45];
                        var43[var44] = var46 * var47 >> 16;
                    }
                    World3D.method87(512, var43, 800, (byte) 73, 334, 500);
                    WordFilter.method325(var13);
                } catch (Exception var55) {
                    this.field1323 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method10(boolean arg0) {
        this.field1483 &= arg0;
        this.field1489 = true;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method370(int arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1243; ++var3) {
                if (arg1.equalsIgnoreCase(this.field1328[var3])) {
                    return true;
                }
            }
            if (this.field1282 != arg0) {
                throw new NullPointerException();
            } else {
                return arg1.equalsIgnoreCase(this.field1464.field356);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method371(int arg0) {
        while (arg0 >= 0) {
            this.field1451.method199(101);
        }
        this.field1156 = false;
        while (this.field1115) {
            try {
                Thread.sleep(50L);
            } catch (Exception var16) {
            }
            Object var2 = this.field1257;
            String var3;
            int var4;
            int var5;
            synchronized (this.field1257) {
                var3 = this.field1366;
                var4 = this.field1461;
                var5 = this.field1452;
                this.field1366 = null;
                this.field1461 = 0;
                this.field1452 = 0;
            }
            if (var3 != null) {
                byte[] var6 = signlink.cacheload(var3 + ".mid");
                if (var6 != null && var4 != 12345678) {
                    this.field1178.reset();
                    this.field1178.update(var6);
                    int var7 = (int) this.field1178.getValue();
                    if (var4 != var7) {
                        var6 = null;
                    }
                }
                if (var6 == null) {
                    try {
                        DataInputStream var8 = this.method479(var3 + "_" + var4 + ".mid");
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
                int var13 = (new Packet(575, var6)).method214();
                byte[] var14 = new byte[var13];
                BZip2.method238(var14, var13, var6, var5, 4);
                this.method460(false, true, var14, var13);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILhc;)I")
    public final int method372(int arg0, int arg1, Component arg2) {
        label128: while (true) {
            if (arg1 >= 0) {
                int var4 = 1;
                while (true) {
                    if (var4 <= 0) {
                        continue label128;
                    }
                    ++var4;
                }
            }
            if (arg2.field947 != null && arg0 < arg2.field947.length) {
                try {
                    int[] var5 = arg2.field947[arg0];
                    int var6 = 0;
                    int var7 = 0;
                    while (true) {
                        int var8 = var5[var7++];
                        if (var8 == 0) {
                            return var6;
                        }
                        if (var8 == 1) {
                            var6 += this.field1144[var5[var7++]];
                        }
                        if (var8 == 2) {
                            var6 += this.field1373[var5[var7++]];
                        }
                        if (var8 == 3) {
                            var6 += this.field1425[var5[var7++]];
                        }
                        if (var8 == 4) {
                            Component var9 = Component.field933[var5[var7++]];
                            int var10 = var5[var7++] + 1;
                            for (int var11 = 0; var11 < var9.field934.length; ++var11) {
                                if (var9.field934[var11] == var10) {
                                    var6 += var9.field935[var11];
                                }
                            }
                        }
                        if (var8 == 5) {
                            var6 += this.field1287[var5[var7++]];
                        }
                        if (var8 == 6) {
                            var6 += field1280[this.field1373[var5[var7++]] - 1];
                        }
                        if (var8 == 7) {
                            var6 += this.field1287[var5[var7++]] * 100 / 46875;
                        }
                        if (var8 == 8) {
                            var6 += this.field1464.field362;
                        }
                        if (var8 == 9) {
                            for (int var12 = 0; var12 < 19; ++var12) {
                                if (var12 == 18) {
                                    var12 = 20;
                                }
                                var6 += this.field1373[var12];
                            }
                        }
                        if (var8 == 10) {
                            Component var13 = Component.field933[var5[var7++]];
                            int var14 = var5[var7++] + 1;
                            for (int var15 = 0; var15 < var13.field934.length; ++var15) {
                                if (var13.field934[var15] == var14) {
                                    var6 += 999999999;
                                    break;
                                }
                            }
                        }
                        if (var8 == 11) {
                            var6 += this.field1331;
                        }
                        if (var8 == 12) {
                            var6 += this.field1314;
                        }
                        if (var8 == 13) {
                            int var16 = this.field1287[var5[var7++]];
                            int var17 = var5[var7++];
                            var6 += (var16 & 1 << var17) != 0 ? 1 : 0;
                        }
                    }
                } catch (Exception var18) {
                    return -1;
                }
            }
            return -2;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method373(boolean arg0) {
        int var2 = this.field1191;
        int var3 = this.field1192;
        int var4 = this.field1193;
        int var5 = this.field1194;
        int var6 = 6116423;
        Pix2D.method149(var4, var5, var6, var3, (byte) -37, var2);
        Pix2D.method149(var4 - 2, 16, 0, var3 + 1, (byte) -37, var2 + 1);
        if (arg0) {
            Pix2D.method150(var3 + 18, 712, var5 - 19, 0, var4 - 2, var2 + 1);
            this.field1248.method191(1, var6, var2 + 3, "Choose Option", var3 + 14);
            int var7 = super.field18;
            int var8 = super.field19;
            if (this.field1190 == 0) {
                var7 -= 8;
                var8 -= 11;
            }
            if (this.field1190 == 1) {
                var7 -= 562;
                var8 -= 231;
            }
            if (this.field1190 == 2) {
                var7 -= 22;
                var8 -= 375;
            }
            for (int var9 = 0; var9 < this.field1164; ++var9) {
                int var10 = (this.field1164 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                this.field1248.method193(931, true, this.field1158[var9], var10, var2 + 3, var11);
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method374(boolean arg0) {
        if (!arg0) {
            this.field1254 = this.field1310.method246();
        }
        if (this.field1353 == 2) {
            this.method470((this.field1097 - this.field1474 << 7) + this.field1100, this.field1098 * 2, (this.field1096 - this.field1473 << 7) + this.field1099, 25880);
            if (this.field1165 > -1 && field1354 % 20 < 10) {
                this.field1130[2].method173(this.field1165 - 12, this.field1166 - 28, -141);
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method375(int arg0) {
        ++this.field1370;
        this.method398(this.field1380);
        int var2 = 72 / arg0;
        this.method412(7);
        this.method480(979);
        this.method481(true);
        this.method363(487);
        if (!this.field1305) {
            int var3 = this.field1065;
            if (this.field1364 / 256 > var3) {
                var3 = this.field1364 / 256;
            }
            if (this.field1189[4] && this.field1371[4] + 128 > var3) {
                var3 = this.field1371[4] + 128;
            }
            int var4 = this.field1200 + this.field1066 & 2047;
            this.method397(var4, (byte) 123, this.field1258, this.method449(this.field1333, field1131, this.field1464.field299, this.field1464.field298) - 50, var3 * 3 + 600, this.field1259, var3);
        }
        int var5;
        if (!this.field1305) {
            var5 = this.method399((byte) 8);
        } else {
            var5 = this.method400(9);
        }
        int var6 = this.field1136;
        int var7 = this.field1137;
        int var8 = this.field1138;
        int var9 = this.field1139;
        int var10 = this.field1140;
        for (int var11 = 0; var11 < 5; ++var11) {
            if (this.field1189[var11]) {
                int var13 = (int) (Math.random() * (double) (this.field1469[var11] * 2 + 1) - (double) this.field1469[var11] + Math.sin((double) this.field1284[var11] / 100.0D * (double) this.field1275[var11]) * (double) this.field1371[var11]);
                if (var11 == 0) {
                    this.field1136 += var13;
                }
                if (var11 == 1) {
                    this.field1137 += var13;
                }
                if (var11 == 2) {
                    this.field1138 += var13;
                }
                if (var11 == 3) {
                    this.field1140 = this.field1140 + var13 & 2047;
                }
                if (var11 == 4) {
                    this.field1139 += var13;
                    if (this.field1139 < 128) {
                        this.field1139 = 128;
                    }
                    if (this.field1139 > 383) {
                        this.field1139 = 383;
                    }
                }
            }
        }
        int var12 = Pix3D.field566;
        Model.field520 = true;
        Model.field523 = 0;
        Model.field521 = super.field18 - 8;
        Model.field522 = super.field19 - 11;
        Pix2D.method148(false);
        this.field1448.method90(this.field1139, this.field1136, 0, this.field1137, var5, this.field1138, this.field1140);
        this.field1448.method64(0);
        this.method482(3);
        this.method374(true);
        this.method433(false, var12);
        this.method442(865);
        this.field1213.method236(8, 11, super.field11, (byte) 5);
        this.field1136 = var6;
        this.field1137 = var7;
        this.field1138 = var8;
        this.field1139 = var9;
        this.field1140 = var10;
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method376(int arg0) {
        if (arg0 != 38236) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field20 == 1) {
            if (super.field21 >= 8 && super.field21 <= 108 && super.field22 >= 490 && super.field22 <= 522) {
                this.field1470 = (this.field1470 + 1) % 4;
                this.field1101 = true;
                this.field1176 = true;
                this.field1451.method198(true, 197);
                this.field1451.method199(this.field1470);
                this.field1451.method199(this.field1117);
                this.field1451.method199(this.field1108);
            }
            if (super.field21 >= 137 && super.field21 <= 237 && super.field22 >= 490 && super.field22 <= 522) {
                this.field1117 = (this.field1117 + 1) % 3;
                this.field1101 = true;
                this.field1176 = true;
                this.field1451.method198(true, 197);
                this.field1451.method199(this.field1470);
                this.field1451.method199(this.field1117);
                this.field1451.method199(this.field1108);
            }
            if (super.field21 >= 275 && super.field21 <= 375 && super.field22 >= 490 && super.field22 <= 522) {
                this.field1108 = (this.field1108 + 1) % 3;
                this.field1101 = true;
                this.field1176 = true;
                this.field1451.method198(true, 197);
                this.field1451.method199(this.field1470);
                this.field1451.method199(this.field1117);
                this.field1451.method199(this.field1108);
            }
            if (super.field21 >= 416 && super.field21 <= 516 && super.field22 >= 490 && super.field22 <= 522) {
                this.method378(954);
                this.field1084 = "";
                this.field1391 = false;
                for (int var3 = 0; var3 < Component.field933.length; ++var3) {
                    if (Component.field933[var3] != null && Component.field933[var3].field942 == 600) {
                        this.field1181 = this.field1142 = Component.field933[var3].field939;
                        break;
                    }
                }
            }
            ++field1312;
            if (field1312 > 195) {
                field1312 = 0;
                this.field1451.method198(true, 24);
                this.field1451.method199(239);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method8(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1135 != null) {
                this.field1135.method29();
            }
        } catch (Exception var2) {
        }
        this.field1135 = null;
        this.method464((byte) 38);
        this.field1115 = false;
        this.field1451 = null;
        this.field1303 = null;
        this.field1119 = null;
        this.field1330 = null;
        this.field1116 = null;
        this.field1349 = null;
        this.field1161 = null;
        this.field1118 = null;
        this.field1448 = null;
        this.field1369 = null;
        this.field1355 = null;
        this.field1250 = null;
        this.field1073 = null;
        this.field1074 = null;
        this.field1072 = null;
        this.field1211 = null;
        this.field1212 = null;
        this.field1213 = null;
        this.field1214 = null;
        if (arg0 != -17909) {
            this.field1322 = null;
        }
        this.field1231 = null;
        this.field1232 = null;
        this.field1233 = null;
        this.field1219 = null;
        this.field1220 = null;
        this.field1221 = null;
        this.field1222 = null;
        this.field1223 = null;
        this.field1224 = null;
        this.field1225 = null;
        this.field1226 = null;
        this.field1227 = null;
        this.field1228 = null;
        this.field1103 = null;
        this.field1104 = null;
        this.field1105 = null;
        this.field1307 = null;
        this.field1308 = null;
        this.field1309 = null;
        this.field1270 = null;
        this.field1151 = null;
        this.field1152 = null;
        this.field1153 = null;
        this.field1154 = null;
        this.field1155 = null;
        this.field1236 = null;
        this.field1237 = null;
        this.field1238 = null;
        this.field1239 = null;
        this.field1240 = null;
        this.field1352 = null;
        this.field1269 = null;
        this.field1130 = null;
        this.field1381 = null;
        this.field1060 = null;
        this.field1061 = null;
        this.field1062 = null;
        this.field1063 = null;
        this.field1321 = null;
        this.field1296 = null;
        this.field1252 = null;
        this.field1343 = null;
        this.field1345 = null;
        this.field1347 = null;
        this.field1348 = null;
        this.field1450 = null;
        this.field1317 = null;
        this.field1319 = null;
        this.field1322 = null;
        this.field1149 = null;
        this.field1069 = null;
        this.field1261 = null;
        this.field1379 = null;
        this.field1484 = null;
        this.field1420 = null;
        this.field1421 = null;
        this.field1422 = null;
        this.field1423 = null;
        this.field1158 = null;
        this.field1287 = null;
        this.field1480 = null;
        this.field1481 = null;
        this.field1088 = null;
        this.field1087 = null;
        this.field1328 = null;
        this.field1234 = null;
        this.field1320 = null;
        this.field1395 = null;
        this.field1396 = null;
        this.field1392 = null;
        this.field1393 = null;
        this.field1394 = null;
        this.field1397 = null;
        this.field1398 = null;
        this.field1399 = null;
        this.field1400 = null;
        this.method393(0);
        LocType.method274(true);
        NpcType.method280(true);
        ObjType.method286(true);
        FloType.field911 = null;
        IdkType.field924 = null;
        Component.field933 = null;
        UnkType.field992 = null;
        SeqType.field999 = null;
        SpotAnimType.field1015 = null;
        SpotAnimType.field1027 = null;
        VarpType.field1029 = null;
        super.field12 = null;
        PlayerEntity.field376 = null;
        Pix3D.method153(true);
        World3D.method49(true);
        Model.method120(true);
        AnimBase.field81 = null;
        AnimFrame.field85 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1095) {
            this.method486(false);
        } else if (this.field1156) {
            this.method371(-97);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILhc;IIII)V")
    public final void method377(int arg0, int arg1, Component arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 39 / arg0;
        if (arg2.field940 == 0 && arg2.field954 != null && !arg2.field953) {
            if (arg3 >= arg4 && arg5 >= arg6 && arg3 <= arg2.field943 + arg4 && arg5 <= arg2.field944 + arg6) {
                int var9 = arg2.field954.length;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg2.field955[var10] + arg4;
                    int var12 = arg2.field956[var10] + arg6 - arg1;
                    Component var13 = Component.field933[arg2.field954[var10]];
                    int var14 = var13.field945 + var11;
                    int var15 = var13.field946 + var12;
                    if ((var13.field950 >= 0 || var13.field976 != 0) && arg3 >= var14 && arg5 >= var15 && arg3 < var13.field943 + var14 && arg5 < var13.field944 + var15) {
                        if (var13.field950 >= 0) {
                            this.field1374 = var13.field950;
                        } else {
                            this.field1374 = var13.field938;
                        }
                    }
                    if (var13.field940 == 0) {
                        this.method377(224, var13.field952, var13, arg3, var14, arg5, var15);
                        if (var13.field951 > var13.field944) {
                            this.method364(var13.field951, arg3, arg5, 8, var13.field943 + var14, true, var13.field944, var15, var13);
                        }
                    } else {
                        if (var13.field941 == 1 && arg3 >= var14 && arg5 >= var15 && arg3 < var13.field943 + var14 && arg5 < var13.field944 + var15) {
                            boolean var16 = false;
                            if (var13.field942 != 0) {
                                var16 = this.method431(var13, (byte) 6);
                            }
                            if (!var16) {
                                this.field1158[this.field1164] = var13.field989;
                                this.field1422[this.field1164] = 706;
                                this.field1421[this.field1164] = var13.field938;
                                ++this.field1164;
                            }
                        }
                        if (var13.field941 == 2 && this.field1465 == 0 && arg3 >= var14 && arg5 >= var15 && arg3 < var13.field943 + var14 && arg5 < var13.field944 + var15) {
                            String var17 = var13.field986;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field1158[this.field1164] = var17 + " @gre@" + var13.field987;
                            this.field1422[this.field1164] = 941;
                            this.field1421[this.field1164] = var13.field938;
                            ++this.field1164;
                        }
                        if (var13.field941 == 3 && arg3 >= var14 && arg5 >= var15 && arg3 < var13.field943 + var14 && arg5 < var13.field944 + var15) {
                            this.field1158[this.field1164] = "Close";
                            this.field1422[this.field1164] = 309;
                            this.field1421[this.field1164] = var13.field938;
                            ++this.field1164;
                        }
                        if (var13.field941 == 4 && arg3 >= var14 && arg5 >= var15 && arg3 < var13.field943 + var14 && arg5 < var13.field944 + var15) {
                            this.field1158[this.field1164] = var13.field989;
                            this.field1422[this.field1164] = 967;
                            this.field1421[this.field1164] = var13.field938;
                            ++this.field1164;
                        }
                        if (var13.field941 == 5 && arg3 >= var14 && arg5 >= var15 && arg3 < var13.field943 + var14 && arg5 < var13.field944 + var15) {
                            this.field1158[this.field1164] = var13.field989;
                            this.field1422[this.field1164] = 672;
                            this.field1421[this.field1164] = var13.field938;
                            ++this.field1164;
                        }
                        if (var13.field941 == 6 && !this.field1251 && arg3 >= var14 && arg5 >= var15 && arg3 < var13.field943 + var14 && arg5 < var13.field944 + var15) {
                            this.field1158[this.field1164] = var13.field989;
                            this.field1422[this.field1164] = 73;
                            this.field1421[this.field1164] = var13.field938;
                            ++this.field1164;
                        }
                        if (var13.field940 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field944; ++var19) {
                                for (int var20 = 0; var20 < var13.field943; ++var20) {
                                    int var21 = (var13.field962 + 32) * var20 + var14;
                                    int var22 = (var13.field963 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field965[var18];
                                        var22 += var13.field966[var18];
                                    }
                                    if (arg3 >= var21 && arg5 >= var22 && arg3 < var21 + 32 && arg5 < var22 + 32) {
                                        this.field1384 = var18;
                                        this.field1385 = var13.field938;
                                        if (var13.field934[var18] > 0) {
                                            ObjType var23 = ObjType.method287(var13.field934[var18] - 1);
                                            if (this.field1455 == 1 && var13.field960) {
                                                if (this.field1457 != var13.field938 || this.field1456 != var18) {
                                                    this.field1158[this.field1164] = "Use " + this.field1459 + " with @lre@" + var23.field861;
                                                    this.field1422[this.field1164] = 237;
                                                    this.field1423[this.field1164] = var23.field859;
                                                    this.field1420[this.field1164] = var18;
                                                    this.field1421[this.field1164] = var13.field938;
                                                    ++this.field1164;
                                                }
                                            } else if (this.field1465 == 1 && var13.field960) {
                                                if ((this.field1467 & 16) == 16) {
                                                    this.field1158[this.field1164] = this.field1468 + " @lre@" + var23.field861;
                                                    this.field1422[this.field1164] = 63;
                                                    this.field1423[this.field1164] = var23.field859;
                                                    this.field1420[this.field1164] = var18;
                                                    this.field1421[this.field1164] = var13.field938;
                                                    ++this.field1164;
                                                }
                                            } else {
                                                if (var13.field960) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field877 != null && var23.field877[var24] != null) {
                                                            this.field1158[this.field1164] = var23.field877[var24] + " @lre@" + var23.field861;
                                                            if (var24 == 3) {
                                                                this.field1422[this.field1164] = 120;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field1422[this.field1164] = 796;
                                                            }
                                                            this.field1423[this.field1164] = var23.field859;
                                                            this.field1420[this.field1164] = var18;
                                                            this.field1421[this.field1164] = var13.field938;
                                                            ++this.field1164;
                                                        } else if (var24 == 4) {
                                                            this.field1158[this.field1164] = "Drop @lre@" + var23.field861;
                                                            this.field1422[this.field1164] = 796;
                                                            this.field1423[this.field1164] = var23.field859;
                                                            this.field1420[this.field1164] = var18;
                                                            this.field1421[this.field1164] = var13.field938;
                                                            ++this.field1164;
                                                        }
                                                    }
                                                }
                                                if (var13.field961) {
                                                    this.field1158[this.field1164] = "Use @lre@" + var23.field861;
                                                    this.field1422[this.field1164] = 357;
                                                    this.field1423[this.field1164] = var23.field859;
                                                    this.field1420[this.field1164] = var18;
                                                    this.field1421[this.field1164] = var13.field938;
                                                    ++this.field1164;
                                                }
                                                if (var13.field960 && var23.field877 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field877[var25] != null) {
                                                            this.field1158[this.field1164] = var23.field877[var25] + " @lre@" + var23.field861;
                                                            if (var25 == 0) {
                                                                this.field1422[this.field1164] = 871;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1422[this.field1164] = 526;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1422[this.field1164] = 156;
                                                            }
                                                            this.field1423[this.field1164] = var23.field859;
                                                            this.field1420[this.field1164] = var18;
                                                            this.field1421[this.field1164] = var13.field938;
                                                            ++this.field1164;
                                                        }
                                                    }
                                                }
                                                if (var13.field967 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field967[var26] != null) {
                                                            this.field1158[this.field1164] = var13.field967[var26] + " @lre@" + var23.field861;
                                                            if (var26 == 0) {
                                                                this.field1422[this.field1164] = 134;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field1422[this.field1164] = 701;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field1422[this.field1164] = 570;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field1422[this.field1164] = 719;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field1422[this.field1164] = 440;
                                                            }
                                                            this.field1423[this.field1164] = var23.field859;
                                                            this.field1420[this.field1164] = var18;
                                                            this.field1421[this.field1164] = var13.field938;
                                                            ++this.field1164;
                                                        }
                                                    }
                                                }
                                                this.field1158[this.field1164] = "Examine @lre@" + var23.field861;
                                                this.field1422[this.field1164] = 1974;
                                                this.field1423[this.field1164] = var23.field859;
                                                this.field1421[this.field1164] = var13.field935[var18];
                                                ++this.field1164;
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

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method378(int arg0) {
        this.field1451.method198(true, 153);
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field1386 != -1) {
            this.field1386 = -1;
            this.field1092 = true;
            this.field1251 = false;
            this.field1285 = true;
        }
        if (this.field1294 != -1) {
            this.field1294 = -1;
            this.field1176 = true;
            this.field1251 = false;
        }
        this.field1142 = -1;
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method379(int arg0) {
        try {
            if (this.field1135 != null) {
                this.field1135.method29();
            }
        } catch (Exception var3) {
        }
        this.field1135 = null;
        if (arg0 != -41589) {
            this.field1334 = 132;
        }
        this.field1483 = false;
        this.field1297 = 0;
        this.field1123 = "";
        this.field1124 = "";
        InputTracking.method35((byte) 7, false);
        this.method415(4);
        this.field1448.method50(true);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field1369[var2].method295(true);
        }
        System.gc();
        this.method464((byte) 38);
        this.field1350 = null;
        this.field1143 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public final void method380(int arg0, int arg1, String arg2, String arg3) {
        if (arg1 == 0 && this.field1107 != -1) {
            this.field1362 = arg3;
            super.field20 = 0;
        }
        if (this.field1294 == -1) {
            this.field1176 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1376[var5] = this.field1376[var5 - 1];
            this.field1377[var5] = this.field1377[var5 - 1];
            this.field1378[var5] = this.field1378[var5 - 1];
        }
        this.field1376[0] = arg1;
        this.field1377[0] = arg2;
        while (arg0 >= 0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        this.field1378[0] = arg3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;II)V")
    private final void method381(Packet arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field1322 = null;
        }
        while (arg0.field613 + 10 < arg1 * 8) {
            int var4 = arg0.method220(false, 11);
            if (var4 == 2047) {
                break;
            }
            if (this.field1343[var4] == null) {
                this.field1343[var4] = new PlayerEntity();
                if (this.field1348[var4] != null) {
                    this.field1343[var4].method113(0, this.field1348[var4]);
                }
            }
            this.field1345[this.field1344++] = var4;
            PlayerEntity var5 = this.field1343[var4];
            var5.field342 = field1354;
            int var6 = arg0.method220(false, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg0.method220(false, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg0.method220(false, 1);
            var5.method109(698, this.field1464.field346[0] + var6, this.field1464.field347[0] + var7, var8 == 1);
            int var9 = arg0.method220(false, 1);
            if (var9 == 1) {
                this.field1347[this.field1346++] = var4;
            }
        }
        arg0.method221((byte) 53);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method382(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1357 = "";
                this.field1358 = "Connecting to server...";
                this.method487(field1174);
            }
            this.field1135 = new ClientStream(this, true, this.method452(field1325 + 43594));
            this.field1135.method32(this.field1119.field611, 0, 8);
            this.field1119.field612 = 0;
            this.field1075 = this.field1119.method215(6);
            int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1075 >> 32), (int) this.field1075 };
            this.field1451.field612 = 0;
            this.field1451.method199(10);
            this.field1451.method203(var4[0]);
            this.field1451.method203(var4[1]);
            this.field1451.method203(var4[2]);
            this.field1451.method203(var4[3]);
            this.field1451.method203(signlink.uid);
            this.field1451.method206(arg0);
            this.field1451.method206(arg1);
            this.field1451.method224(-44053, field1404, field1337);
            this.field1303.field612 = 0;
            if (arg2) {
                this.field1303.method199(18);
            } else {
                this.field1303.method199(16);
            }
            this.field1303.method199(this.field1451.field612 + 36 + 1 + 1);
            this.field1303.method199(218);
            this.field1303.method199(field1327 ? 1 : 0);
            for (int var5 = 0; var5 < 9; ++var5) {
                this.field1303.method203(this.field1453[var5]);
            }
            this.field1303.method207(this.field1451.field612, this.field1451.field611, 25772, 0);
            this.field1451.field616 = new Isaac((byte) 35, var4);
            for (int var6 = 0; var6 < 4; ++var6) {
                var4[var6] += 50;
            }
            this.field1310 = new Isaac((byte) 35, var4);
            this.field1135.method33(this.field1303.field612, false, this.field1303.field611, 0);
            int var7 = this.field1135.method30();
            if (var7 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var15) {
                }
                this.method382(arg0, arg1, arg2);
                return;
            }
            if (var7 == 2 || var7 == 18) {
                if (var7 == 18) {
                    this.field1090 = true;
                } else {
                    this.field1090 = false;
                }
                InputTracking.method35((byte) 7, false);
                this.field1483 = true;
                this.field1451.field612 = 0;
                this.field1119.field612 = 0;
                this.field1168 = -1;
                this.field1435 = -1;
                this.field1436 = -1;
                this.field1437 = -1;
                this.field1167 = 0;
                this.field1169 = 0;
                this.field1202 = 0;
                this.field1171 = 0;
                this.field1353 = 0;
                this.field1164 = 0;
                this.field1383 = false;
                super.field16 = 0;
                for (int var8 = 0; var8 < 100; ++var8) {
                    this.field1378[var8] = null;
                }
                this.field1455 = 0;
                this.field1465 = 0;
                this.field1277 = 0;
                this.field1253 = 0;
                this.field1209 = (int) (Math.random() * 100.0D) - 50;
                this.field1359 = (int) (Math.random() * 110.0D) - 55;
                this.field1200 = (int) (Math.random() * 80.0D) - 40;
                this.field1486 = (int) (Math.random() * 120.0D) - 60;
                this.field1195 = (int) (Math.random() * 30.0D) - 20;
                this.field1066 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1477 = -1;
                this.field1085 = 0;
                this.field1086 = 0;
                this.field1344 = 0;
                this.field1318 = 0;
                for (int var9 = 0; var9 < this.field1341; ++var9) {
                    this.field1343[var9] = null;
                    this.field1348[var9] = null;
                }
                for (int var10 = 0; var10 < 8192; ++var10) {
                    this.field1317[var10] = null;
                }
                this.field1464 = this.field1343[this.field1342] = new PlayerEntity();
                this.field1261.method232();
                this.field1379.method232();
                this.field1069.method232();
                for (int var11 = 0; var11 < 4; ++var11) {
                    for (int var12 = 0; var12 < 104; ++var12) {
                        for (int var13 = 0; var13 < 104; ++var13) {
                            this.field1322[var11][var12][var13] = null;
                        }
                    }
                }
                this.field1149 = new LinkList((byte) 5);
                this.field1243 = 0;
                this.field1107 = -1;
                this.field1294 = -1;
                this.field1142 = -1;
                this.field1386 = -1;
                this.field1251 = false;
                this.field1427 = 3;
                this.field1070 = false;
                this.field1383 = false;
                this.field1150 = false;
                this.field1362 = null;
                this.field1235 = 0;
                this.field1268 = -1;
                this.field1401 = true;
                this.method386(false);
                for (int var14 = 0; var14 < 5; ++var14) {
                    this.field1406[var14] = 0;
                }
                field1332 = 0;
                field1083 = 0;
                field1162 = 0;
                field1311 = 0;
                field1229 = 0;
                field1338 = 0;
                field1304 = 0;
                field1340 = 0;
                field1472 = 0;
                field1093 = 0;
                this.method416(-588);
                return;
            }
            if (var7 == 3) {
                this.field1357 = "";
                this.field1358 = "Invalid username or password.";
                return;
            }
            if (var7 == 4) {
                this.field1357 = "Your account has been disabled.";
                this.field1358 = "Please check your message-centre for details.";
                return;
            }
            if (var7 == 5) {
                this.field1357 = "Your account is already logged in.";
                this.field1358 = "Try again in 60 secs...";
                return;
            }
            if (var7 == 6) {
                this.field1357 = "RuneScape has been updated!";
                this.field1358 = "Please reload this page.";
                return;
            }
            if (var7 == 7) {
                this.field1357 = "This world is full.";
                this.field1358 = "Please use a different world.";
                return;
            }
            if (var7 == 8) {
                this.field1357 = "Unable to connect.";
                this.field1358 = "Login server offline.";
                return;
            }
            if (var7 == 9) {
                this.field1357 = "Login limit exceeded.";
                this.field1358 = "Too many connections from your address.";
                return;
            }
            if (var7 == 10) {
                this.field1357 = "Unable to connect.";
                this.field1358 = "Bad session id.";
                return;
            }
            if (var7 == 11) {
                this.field1358 = "Login server rejected session.";
                this.field1358 = "Please try again.";
                return;
            }
            if (var7 == 12) {
                this.field1357 = "You need a members account to login to this world.";
                this.field1358 = "Please subscribe, or use a different world.";
                return;
            }
            if (var7 == 13) {
                this.field1357 = "Could not complete login.";
                this.field1358 = "Please try using a different world.";
                return;
            }
            if (var7 == 14) {
                this.field1357 = "The server is being updated.";
                this.field1358 = "Please wait 1 minute and try again.";
                return;
            }
            if (var7 == 15) {
                this.field1483 = true;
                this.field1451.field612 = 0;
                this.field1119.field612 = 0;
                this.field1168 = -1;
                this.field1435 = -1;
                this.field1436 = -1;
                this.field1437 = -1;
                this.field1167 = 0;
                this.field1169 = 0;
                this.field1202 = 0;
                this.field1164 = 0;
                this.field1383 = false;
                return;
            }
            if (var7 == 16) {
                this.field1357 = "Login attempts exceeded.";
                this.field1358 = "Please wait 1 minute and try again.";
                return;
            }
            if (var7 == 17) {
                this.field1357 = "You are standing in a members-only area.";
                this.field1358 = "To play on this world move to a free area first";
                return;
            }
        } catch (IOException var16) {
            this.field1357 = "";
            this.field1358 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method383(byte arg0) {
        if (arg0 != 78) {
            this.field1451.method199(96);
        }
        if (super.field20 == 1) {
            if (super.field21 >= 549 && super.field21 <= 583 && super.field22 >= 195 && super.field22 < 231 && this.field1111[0] != -1) {
                this.field1092 = true;
                this.field1427 = 0;
                this.field1285 = true;
            }
            if (super.field21 >= 579 && super.field21 <= 609 && super.field22 >= 194 && super.field22 < 231 && this.field1111[1] != -1) {
                this.field1092 = true;
                this.field1427 = 1;
                this.field1285 = true;
            }
            if (super.field21 >= 607 && super.field21 <= 637 && super.field22 >= 194 && super.field22 < 231 && this.field1111[2] != -1) {
                this.field1092 = true;
                this.field1427 = 2;
                this.field1285 = true;
            }
            if (super.field21 >= 635 && super.field21 <= 679 && super.field22 >= 194 && super.field22 < 229 && this.field1111[3] != -1) {
                this.field1092 = true;
                this.field1427 = 3;
                this.field1285 = true;
            }
            if (super.field21 >= 676 && super.field21 <= 706 && super.field22 >= 194 && super.field22 < 231 && this.field1111[4] != -1) {
                this.field1092 = true;
                this.field1427 = 4;
                this.field1285 = true;
            }
            if (super.field21 >= 704 && super.field21 <= 734 && super.field22 >= 194 && super.field22 < 231 && this.field1111[5] != -1) {
                this.field1092 = true;
                this.field1427 = 5;
                this.field1285 = true;
            }
            if (super.field21 >= 732 && super.field21 <= 766 && super.field22 >= 195 && super.field22 < 231 && this.field1111[6] != -1) {
                this.field1092 = true;
                this.field1427 = 6;
                this.field1285 = true;
            }
            if (super.field21 >= 550 && super.field21 <= 584 && super.field22 >= 492 && super.field22 < 528 && this.field1111[7] != -1) {
                this.field1092 = true;
                this.field1427 = 7;
                this.field1285 = true;
            }
            if (super.field21 >= 582 && super.field21 <= 612 && super.field22 >= 492 && super.field22 < 529 && this.field1111[8] != -1) {
                this.field1092 = true;
                this.field1427 = 8;
                this.field1285 = true;
            }
            if (super.field21 >= 609 && super.field21 <= 639 && super.field22 >= 492 && super.field22 < 529 && this.field1111[9] != -1) {
                this.field1092 = true;
                this.field1427 = 9;
                this.field1285 = true;
            }
            if (super.field21 >= 637 && super.field21 <= 681 && super.field22 >= 493 && super.field22 < 528 && this.field1111[10] != -1) {
                this.field1092 = true;
                this.field1427 = 10;
                this.field1285 = true;
            }
            if (super.field21 >= 679 && super.field21 <= 709 && super.field22 >= 492 && super.field22 < 529 && this.field1111[11] != -1) {
                this.field1092 = true;
                this.field1427 = 11;
                this.field1285 = true;
            }
            if (super.field21 >= 706 && super.field21 <= 736 && super.field22 >= 492 && super.field22 < 529 && this.field1111[12] != -1) {
                this.field1092 = true;
                this.field1427 = 12;
                this.field1285 = true;
            }
            if (super.field21 >= 734 && super.field21 <= 768 && super.field22 >= 492 && super.field22 < 528 && this.field1111[13] != -1) {
                this.field1092 = true;
                this.field1427 = 13;
                this.field1285 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Ljava/lang/String;")
    public static final String method384(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field1434 = !field1434;
        }
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

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method385(boolean arg0) {
        if (this.field1129 != 0) {
            PixFont var2 = this.field1247;
            int var3 = 0;
            if (arg0) {
                field1122 = this.field1310.method246();
            }
            if (this.field1202 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1378[var4] != null) {
                    int var5 = this.field1376[var4];
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1117 == 0 || this.field1117 == 1 && this.method370(34304, this.field1377[var4]))) {
                        int var6 = 329 - var3 * 13;
                        var2.method191(1, 0, 4, "From " + this.field1377[var4] + ": " + this.field1378[var4], var6);
                        var2.method191(1, 65535, 4, "From " + this.field1377[var4] + ": " + this.field1378[var4], var6 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field1117 < 2) {
                        int var7 = 329 - var3 * 13;
                        var2.method191(1, 0, 4, this.field1378[var4], var7);
                        var2.method191(1, 65535, 4, this.field1378[var4], var7 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field1117 < 2) {
                        int var8 = 329 - var3 * 13;
                        var2.method191(1, 0, 4, "To " + this.field1377[var4] + ": " + this.field1378[var4], var8);
                        var2.method191(1, 65535, 4, "To " + this.field1377[var4] + ": " + this.field1378[var4], var8 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method386(boolean arg0) {
        this.field1424 = true;
        if (arg0) {
            this.field1322 = null;
        }
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1336[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field923; ++var3) {
                if (!IdkType.field924[var3].field930 && IdkType.field924[var3].field925 == var2 + (this.field1401 ? 0 : 7)) {
                    this.field1336[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLkb;)V")
    public final void method387(int arg0, byte arg1, Packet arg2) {
        if (arg1 != 5) {
            this.method6();
        }
        if (arg0 != 220 && arg0 != 214) {
            if (arg0 == 78) {
                int var4 = arg2.method209();
                int var5 = (var4 >> 4 & 7) + this.field1264;
                int var6 = (var4 & 7) + this.field1265;
                int var7 = arg2.method209();
                int var8 = var7 >> 2;
                int var9 = this.field1126[var8];
                int var10 = arg2.method211();
                if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                    int var11 = 0;
                    if (var9 == 0) {
                        var11 = this.field1448.method77(this.field1333, var5, var6);
                    }
                    if (var9 == 1) {
                        var11 = this.field1448.method78(var5, (byte) 116, var6, this.field1333);
                    }
                    if (var9 == 2) {
                        var11 = this.field1448.method79(this.field1333, var5, var6);
                    }
                    if (var9 == 3) {
                        var11 = this.field1448.method80(this.field1333, var5, var6);
                    }
                    if (var11 != 0) {
                        LocEntity var12 = new LocEntity(var11 >> 14 & 32767, var6, this.field1333, var9, false, var5, SeqType.field999[var10], -8072);
                        this.field1484.method225(var12);
                    }
                }
            } else if (arg0 == 246) {
                int var13 = arg2.method209();
                int var14 = (var13 >> 4 & 7) + this.field1264;
                int var15 = (var13 & 7) + this.field1265;
                int var16 = arg2.method211();
                int var17 = arg2.method211();
                if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                    ObjStackEntity var18 = new ObjStackEntity();
                    var18.field294 = var16;
                    var18.field295 = var17;
                    if (this.field1322[this.field1333][var14][var15] == null) {
                        this.field1322[this.field1333][var14][var15] = new LinkList((byte) 5);
                    }
                    this.field1322[this.field1333][var14][var15].method225(var18);
                    this.method451(var14, var15);
                }
            } else if (arg0 == 61) {
                int var19 = arg2.method209();
                int var20 = (var19 >> 4 & 7) + this.field1264;
                int var21 = (var19 & 7) + this.field1265;
                int var22 = arg2.method211();
                if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                    LinkList var23 = this.field1322[this.field1333][var20][var21];
                    if (var23 != null) {
                        for (ObjStackEntity var24 = (ObjStackEntity) var23.method228(); var24 != null; var24 = (ObjStackEntity) var23.method230(735)) {
                            if ((var22 & 32767) == var24.field294) {
                                var24.method107();
                                break;
                            }
                        }
                        if (var23.method228() == null) {
                            this.field1322[this.field1333][var20][var21] = null;
                        }
                        this.method451(var20, var21);
                    }
                }
            } else if (arg0 == 1) {
                int var25 = arg2.method209();
                int var26 = (var25 >> 4 & 7) + this.field1264;
                int var27 = (var25 & 7) + this.field1265;
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
                    ProjectileEntity var42 = new ProjectileEntity(var30, var36, var31, var39, var38, this.field1333, var33, field1354 + var34, field1354 + var35, (byte) 4, var37, this.method449(this.field1333, field1131, var39, var38) - var32);
                    var42.method116(30695, var40, this.method449(this.field1333, field1131, var41, var40) - var33, var41, field1354 + var34);
                    this.field1261.method225(var42);
                }
            } else if (arg0 == 195) {
                int var43 = arg2.method209();
                int var44 = (var43 >> 4 & 7) + this.field1264;
                int var45 = (var43 & 7) + this.field1265;
                int var46 = arg2.method211();
                int var47 = arg2.method209();
                int var48 = arg2.method211();
                if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
                    int var49 = var44 * 128 + 64;
                    int var50 = var45 * 128 + 64;
                    SpotAnimEntity var51 = new SpotAnimEntity(var50, field1354, var48, this.field1333, var46, this.method449(this.field1333, field1131, var50, var49) - var47, var49, 2);
                    this.field1379.method225(var51);
                }
            } else if (arg0 == 127) {
                int var52 = arg2.method209();
                int var53 = (var52 >> 4 & 7) + this.field1264;
                int var54 = (var52 & 7) + this.field1265;
                int var55 = arg2.method211();
                int var56 = arg2.method211();
                int var57 = arg2.method211();
                if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104 && this.field1094 != var57) {
                    ObjStackEntity var58 = new ObjStackEntity();
                    var58.field294 = var55;
                    var58.field295 = var56;
                    if (this.field1322[this.field1333][var53][var54] == null) {
                        this.field1322[this.field1333][var53][var54] = new LinkList((byte) 5);
                    }
                    this.field1322[this.field1333][var53][var54].method225(var58);
                    this.method451(var53, var54);
                }
            } else {
                if (arg0 == 25) {
                    int var59 = arg2.method209();
                    int var60 = (var59 >> 4 & 7) + this.field1264;
                    int var61 = (var59 & 7) + this.field1265;
                    int var62 = arg2.method209();
                    int var63 = var62 >> 2;
                    int var64 = var62 & 3;
                    int var65 = this.field1126[var63];
                    int var66 = arg2.method211();
                    int var67 = arg2.method211();
                    int var68 = arg2.method211();
                    int var69 = arg2.method211();
                    byte var70 = arg2.method210();
                    byte var71 = arg2.method210();
                    byte var72 = arg2.method210();
                    byte var73 = arg2.method210();
                    PlayerEntity var74;
                    if (this.field1094 == var69) {
                        var74 = this.field1464;
                    } else {
                        var74 = this.field1343[var69];
                    }
                    if (var74 != null) {
                        LocSpawned var75 = new LocSpawned(-1, var61, var60, field1354 + var67, this.field1333, 0, var65, var64, var63);
                        this.field1069.method225(var75);
                        LocSpawned var76 = new LocSpawned(var66, var61, var60, field1354 + var68, this.field1333, 0, var65, var64, var63);
                        this.field1069.method225(var76);
                        int var77 = this.field1161[this.field1333][var60][var61];
                        int var78 = this.field1161[this.field1333][var60 + 1][var61];
                        int var79 = this.field1161[this.field1333][var60 + 1][var61 + 1];
                        int var80 = this.field1161[this.field1333][var60][var61 + 1];
                        LocType var81 = LocType.method275(var66);
                        var74.field365 = field1354 + var67;
                        var74.field366 = field1354 + var68;
                        var74.field370 = var81.method278(var63, var64, var77, var78, var79, var80, -1);
                        int var82 = var81.field794;
                        int var83 = var81.field795;
                        if (var64 == 1 || var64 == 3) {
                            var82 = var81.field795;
                            var83 = var81.field794;
                        }
                        var74.field367 = var60 * 128 + var82 * 64;
                        var74.field369 = var61 * 128 + var83 * 64;
                        var74.field368 = this.method449(this.field1333, field1131, var74.field369, var74.field367);
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
                        var74.field371 = var60 + var70;
                        var74.field373 = var60 + var72;
                        var74.field372 = var61 + var71;
                        var74.field374 = var61 + var73;
                    }
                }
                if (arg0 == 117) {
                    int var86 = arg2.method209();
                    int var87 = (var86 >> 4 & 7) + this.field1264;
                    int var88 = (var86 & 7) + this.field1265;
                    int var89 = arg2.method211();
                    int var90 = arg2.method211();
                    int var91 = arg2.method211();
                    if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                        LinkList var92 = this.field1322[this.field1333][var87][var88];
                        if (var92 != null) {
                            for (ObjStackEntity var93 = (ObjStackEntity) var92.method228(); var93 != null; var93 = (ObjStackEntity) var92.method230(735)) {
                                if ((var89 & 32767) == var93.field294 && var93.field295 == var90) {
                                    var93.field295 = var91;
                                    break;
                                }
                            }
                            this.method451(var87, var88);
                        }
                    }
                }
            }
        } else {
            int var94 = arg2.method209();
            int var95 = (var94 >> 4 & 7) + this.field1264;
            int var96 = (var94 & 7) + this.field1265;
            int var97 = arg2.method209();
            int var98 = var97 >> 2;
            int var99 = var97 & 3;
            int var100 = this.field1126[var98];
            int var101;
            if (arg0 == 214) {
                var101 = -1;
            } else {
                var101 = arg2.method211();
            }
            if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                LocMerged var102 = null;
                for (LocMerged var103 = (LocMerged) this.field1149.method228(); var103 != null; var103 = (LocMerged) this.field1149.method230(735)) {
                    if (this.field1333 == var103.field624 && var103.field626 == var95 && var103.field627 == var96 && var103.field625 == var100) {
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
                        var104 = this.field1448.method77(this.field1333, var95, var96);
                    }
                    if (var100 == 1) {
                        var104 = this.field1448.method78(var95, (byte) 116, var96, this.field1333);
                    }
                    if (var100 == 2) {
                        var104 = this.field1448.method79(this.field1333, var95, var96);
                    }
                    if (var100 == 3) {
                        var104 = this.field1448.method80(this.field1333, var95, var96);
                    }
                    if (var104 != 0) {
                        int var108 = this.field1448.method81(this.field1333, var95, var96, var104);
                        var105 = var104 >> 14 & 32767;
                        var106 = var108 & 31;
                        var107 = var108 >> 6;
                    }
                    var102 = new LocMerged();
                    var102.field624 = this.field1333;
                    var102.field625 = var100;
                    var102.field626 = var95;
                    var102.field627 = var96;
                    var102.field631 = var105;
                    var102.field633 = var106;
                    var102.field632 = var107;
                    this.field1149.method225(var102);
                }
                var102.field628 = var101;
                var102.field630 = var98;
                var102.field629 = var99;
                this.method475(var98, var99, var101, var95, var96, 221, this.field1333, var100);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method388(int arg0, int arg1) {
        Component var3 = Component.field933[arg0];
        for (int var4 = 0; var4 < var3.field954.length && var3.field954[var4] != -1; ++var4) {
            Component var5 = Component.field933[var3.field954[var4]];
            if (var5.field940 == 1) {
                this.method388(var5.field938, 49065);
            }
            var5.field936 = 0;
            var5.field937 = 0;
        }
        if (arg1 != 49065) {
            this.field1168 = this.field1119.method209();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method389(int arg0, long arg1) {
        int var4 = 46 / arg0;
        if (arg1 != 0L) {
            for (int var5 = 0; var5 < this.field1306; ++var5) {
                if (this.field1182[var5] == arg1) {
                    --this.field1306;
                    this.field1092 = true;
                    for (int var6 = var5; var6 < this.field1306; ++var6) {
                        this.field1182[var6] = this.field1182[var6 + 1];
                    }
                    this.field1451.method198(true, 68);
                    this.field1451.method205(arg1, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lkb;II)V")
    private final void method390(Packet arg0, int arg1, int arg2) {
        if (arg1 <= 0) {
            this.field1168 = arg0.method209();
        }
        this.field1449 = 0;
        this.field1346 = 0;
        this.method409(this.field1283, arg0, arg2);
        this.method369(arg0, arg2, (byte) 23);
        this.method404(arg2, arg0, 4);
        for (int var4 = 0; var4 < this.field1449; ++var4) {
            int var6 = this.field1450[var4];
            if (field1354 != this.field1317[var6].field342) {
                this.field1317[var6].field352 = null;
                this.field1317[var6] = null;
            }
        }
        if (arg0.field612 != arg2) {
            signlink.reporterror(this.field1123 + " size mismatch in getnpcpos - pos:" + arg0.field612 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1318; ++var5) {
                if (this.field1317[this.field1319[var5]] == null) {
                    signlink.reporterror(this.field1123 + " null entry in npc list - pos:" + var5 + " size:" + this.field1318);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method391(byte arg0) {
        if (arg0 == 119) {
            if (super.field20 == 1) {
                int var2 = super.field21 - 21 - 561;
                int var3 = super.field22 - 9 - 5;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field1486 + this.field1066 & 2047;
                    int var5 = Pix3D.field555[var4];
                    int var6 = Pix3D.field556[var4];
                    int var7 = (this.field1195 + 256) * var5 >> 8;
                    int var8 = (this.field1195 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = this.field1464.field298 + var9 >> 7;
                    int var12 = this.field1464.field299 - var10 >> 7;
                    boolean var13 = this.method474(0, var12, this.field1464.field347[0], 1, 0, 737, this.field1464.field346[0], 0, var11, true, 0, 0);
                    if (var13) {
                        this.field1451.method199(var2);
                        this.field1451.method199(var3);
                        this.field1451.method200(this.field1066);
                        this.field1451.method199(57);
                        this.field1451.method199(this.field1486);
                        this.field1451.method199(this.field1195);
                        this.field1451.method199(89);
                        this.field1451.method200(this.field1464.field298);
                        this.field1451.method200(this.field1464.field299);
                        this.field1451.method199(this.field1462);
                        this.field1451.method199(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method392(boolean arg0) {
        this.field1211.method235(735);
        Pix3D.field557 = this.field1078;
        this.field1103.method186(0, 0, -141);
        if (this.field1386 != -1) {
            this.method448(0, 0, 4, 0, Component.field933[this.field1386]);
        } else if (this.field1111[this.field1427] != -1) {
            this.method448(0, 0, 4, 0, Component.field933[this.field1111[this.field1427]]);
        }
        if (this.field1383 && this.field1190 == 1) {
            this.method373(true);
        }
        this.field1211.method236(562, 231, super.field11, (byte) 5);
        this.field1213.method235(735);
        Pix3D.field557 = this.field1079;
        this.field1483 &= arg0;
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method393(int arg0) {
        if (arg0 != 0) {
            this.field1451.method199(214);
        }
        this.field1272 = false;
        while (this.field1175) {
            this.field1272 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1402 = null;
        this.field1403 = null;
        this.field1071 = null;
        this.field1185 = null;
        this.field1186 = null;
        this.field1187 = null;
        this.field1188 = null;
        this.field1080 = null;
        this.field1081 = null;
        this.field1418 = null;
        this.field1419 = null;
        this.field1206 = null;
        this.field1207 = null;
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method394(int arg0) {
        if (arg0 < 0 || arg0 > 0) {
            this.field1168 = -1;
        }
        if (this.field1171 > 0) {
            this.method379(-41589);
        } else {
            this.field1213.method235(735);
            this.field1247.method188("Connection lost", 144, 257, field1263, 0);
            this.field1247.method188("Connection lost", 143, 256, field1263, 16777215);
            this.field1247.method188("Please wait - attempting to reestablish", 159, 257, field1263, 0);
            this.field1247.method188("Please wait - attempting to reestablish", 158, 256, field1263, 16777215);
            this.field1213.method236(8, 11, super.field11, (byte) 5);
            this.field1085 = 0;
            ClientStream var2 = this.field1135;
            this.field1483 = false;
            this.method382(this.field1123, this.field1124, true);
            if (!this.field1483) {
                this.method379(-41589);
            }
            try {
                var2.method29();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method395(byte arg0) {
        this.field1402 = new Pix8(this.field1460, "titlebox", 0);
        this.field1403 = new Pix8(this.field1460, "titlebutton", 0);
        if (arg0 != -42) {
            field1131 = this.field1310.method246();
        }
        this.field1071 = new Pix8[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field1071[var2] = new Pix8(this.field1460, "runes", var2);
        }
        this.field1206 = new Pix32(128, 265);
        this.field1207 = new Pix32(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field1206.field572[var3] = this.field1395.field658[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field1207.field572[var4] = this.field1396.field658[var4];
        }
        this.field1186 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field1186[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field1186[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1186[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1186[var8 + 192] = 16777215;
        }
        this.field1187 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1187[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1187[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1187[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1187[var12 + 192] = 16777215;
        }
        this.field1188 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1188[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1188[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1188[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1188[var16 + 192] = 16777215;
        }
        this.field1185 = new int[256];
        this.field1080 = new int[32768];
        this.field1081 = new int[32768];
        this.method427(0, (Pix8) null);
        this.field1418 = new int[32768];
        this.field1419 = new int[32768];
        this.method13(10, "Connecting to fileserver", 0);
        if (!this.field1272) {
            this.field1095 = true;
            this.field1272 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZI)Z")
    public final boolean method396(int arg0, boolean arg1, int arg2) {
        boolean var4 = false;
        if (arg1) {
            throw new NullPointerException();
        } else {
            Component var5 = Component.field933[arg2];
            for (int var6 = 0; var6 < var5.field954.length && var5.field954[var6] != -1; ++var6) {
                Component var7 = Component.field933[var5.field954[var6]];
                if (var7.field940 == 1) {
                    var4 |= this.method396(arg0, false, var7.field938);
                }
                if (var7.field940 == 6 && (var7.field981 != -1 || var7.field982 != -1)) {
                    boolean var8 = this.method405(false, var7);
                    int var9;
                    if (var8) {
                        var9 = var7.field982;
                    } else {
                        var9 = var7.field981;
                    }
                    if (var9 != -1) {
                        SeqType var10 = SeqType.field999[var9];
                        var7.field937 += arg0;
                        while (var7.field937 > var10.field1003[var7.field936]) {
                            var7.field937 -= var10.field1003[var7.field936] + 1;
                            ++var7.field936;
                            if (var7.field936 >= var10.field1000) {
                                var7.field936 -= var10.field1004;
                                if (var7.field936 < 0 || var7.field936 >= var10.field1000) {
                                    var7.field936 = 0;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBIIIII)V")
    public final void method397(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg6 & 2047;
        int var9 = 2048 - arg0 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg4;
        if (var8 != 0) {
            int var13 = Model.field525[var8];
            int var14 = Model.field526[var8];
            int var15 = var11 * var14 - arg4 * var13 >> 16;
            var12 = var11 * var13 + arg4 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field525[var9];
            int var17 = Model.field526[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1136 = arg2 - var10;
        this.field1137 = arg3 - var11;
        this.field1138 = arg5 - var12;
        this.field1139 = arg6;
        this.field1140 = arg0;
        if (arg1 == 123) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method398(int arg0) {
        if (this.field1464.field298 >> 7 == this.field1085 && this.field1464.field299 >> 7 == this.field1086) {
            this.field1085 = 0;
        }
        for (int var2 = -1; var2 < this.field1344; ++var2) {
            PlayerEntity var3;
            int var4;
            if (var2 == -1) {
                var3 = this.field1464;
                var4 = this.field1342 << 14;
            } else {
                var3 = this.field1343[this.field1345[var2]];
                var4 = this.field1345[var2] << 14;
            }
            if (var3 != null && var3.method111(35155)) {
                var3.field375 = false;
                if ((field1327 && this.field1344 > 50 || this.field1344 > 200) && var2 != -1 && var3.field322 == var3.field303) {
                    var3.field375 = true;
                }
                int var5 = var3.field298 >> 7;
                int var6 = var3.field299 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field370 != null && field1354 >= var3.field365 && field1354 < var3.field366) {
                        var3.field375 = false;
                        var3.field364 = this.method449(this.field1333, field1131, var3.field299, var3.field298);
                        this.field1448.method62(var3.field373, var3.field372, this.field1333, var3, var3.field364, var3.field374, var3.field299, (Model) null, 60, var3.field298, var4, var3.field371, var3.field300, -753);
                    } else {
                        if ((var3.field298 & 127) == 64 && (var3.field299 & 127) == 64) {
                            if (this.field1252[var5][var6] == this.field1370) {
                                continue;
                            }
                            this.field1252[var5][var6] = this.field1370;
                        }
                        var3.field364 = this.method449(this.field1333, field1131, var3.field299, var3.field298);
                        this.field1448.method61(var3.field299, 60, var3.field364, (Model) null, var3.field300, var3.field301, var4, 4, var3.field298, var3, this.field1333);
                    }
                }
            }
        }
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        int var2 = 90 / arg0;
        if (!this.field1405 && !this.field1323 && !this.field1091) {
            ++field1354;
            if (!this.field1483) {
                this.method478(true);
            } else {
                this.method476((byte) -91);
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)I")
    public final int method399(byte arg0) {
        int var2 = 3;
        if (arg0 != 8) {
            return 2;
        } else {
            if (this.field1139 < 310) {
                int var3 = this.field1136 >> 7;
                int var4 = this.field1138 >> 7;
                int var5 = this.field1464.field298 >> 7;
                int var6 = this.field1464.field299 >> 7;
                if ((this.field1118[this.field1333][var3][var4] & 4) != 0) {
                    var2 = this.field1333;
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
                        if ((this.field1118[this.field1333][var3][var4] & 4) != 0) {
                            var2 = this.field1333;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field1118[this.field1333][var3][var4] & 4) != 0) {
                                var2 = this.field1333;
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
                        if ((this.field1118[this.field1333][var3][var4] & 4) != 0) {
                            var2 = this.field1333;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field1118[this.field1333][var3][var4] & 4) != 0) {
                                var2 = this.field1333;
                            }
                        }
                    }
                }
            }
            if ((this.field1118[this.field1333][this.field1464.field298 >> 7][this.field1464.field299 >> 7] & 4) != 0) {
                var2 = this.field1333;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)I")
    public final int method400(int arg0) {
        int var2 = this.method449(this.field1333, field1131, this.field1138, this.field1136);
        if (arg0 >= this.field1159 && arg0 <= this.field1159) {
            return var2 - this.field1137 < 800 && (this.field1118[this.field1333][this.field1136 >> 7][this.field1138 >> 7] & 4) != 0 ? this.field1333 : 3;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method401(int arg0) {
        if (arg0 > 0) {
            while (true) {
                int var2;
                do {
                    while (true) {
                        var2 = this.method5(0);
                        if (var2 == -1) {
                            return;
                        }
                        if (this.field1142 != -1 && this.field1181 == this.field1142) {
                            if (var2 == 8 && this.field1084.length() > 0) {
                                this.field1084 = this.field1084.substring(0, this.field1084.length() - 1);
                            }
                            break;
                        }
                        if (this.field1150) {
                            if (var2 >= 32 && var2 <= 122 && this.field1059.length() < 80) {
                                this.field1059 = this.field1059 + (char) var2;
                                this.field1176 = true;
                            }
                            if (var2 == 8 && this.field1059.length() > 0) {
                                this.field1059 = this.field1059.substring(0, this.field1059.length() - 1);
                                this.field1176 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                this.field1150 = false;
                                this.field1176 = true;
                                if (this.field1204 == 1) {
                                    long var3 = JString.method251(this.field1059);
                                    this.method483(var3, this.field1293);
                                }
                                if (this.field1204 == 2 && this.field1243 > 0) {
                                    long var5 = JString.method251(this.field1059);
                                    this.method440(var5, false);
                                }
                                if (this.field1204 == 3 && this.field1059.length() > 0) {
                                    this.field1451.method198(true, 6);
                                    this.field1451.method199(0);
                                    int var7 = this.field1451.field612;
                                    this.field1451.method205(this.field1276, 0);
                                    WordPack.method259(930, this.field1451, this.field1059);
                                    this.field1451.method208(this.field1451.field612 - var7, 1);
                                    this.field1059 = JString.method256((byte) 4, this.field1059);
                                    this.field1059 = WordFilter.method335(this.field1059, (byte) 2);
                                    this.method380(-823, 6, JString.method255(false, JString.method252(false, this.field1276)), this.field1059);
                                    if (this.field1117 == 2) {
                                        this.field1117 = 1;
                                        this.field1101 = true;
                                        this.field1451.method198(true, 197);
                                        this.field1451.method199(this.field1470);
                                        this.field1451.method199(this.field1117);
                                        this.field1451.method199(this.field1108);
                                    }
                                }
                                if (this.field1204 == 4 && this.field1306 < 100) {
                                    long var8 = JString.method251(this.field1059);
                                    this.method454((byte) 55, var8);
                                }
                                if (this.field1204 == 5 && this.field1306 > 0) {
                                    long var10 = JString.method251(this.field1059);
                                    this.method389(904, var10);
                                }
                            }
                        } else if (this.field1070) {
                            if (var2 >= 48 && var2 <= 57 && this.field1180.length() < 10) {
                                this.field1180 = this.field1180 + (char) var2;
                                this.field1176 = true;
                            }
                            if (var2 == 8 && this.field1180.length() > 0) {
                                this.field1180 = this.field1180.substring(0, this.field1180.length() - 1);
                                this.field1176 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                if (this.field1180.length() > 0) {
                                    int var12 = 0;
                                    try {
                                        var12 = Integer.parseInt(this.field1180);
                                    } catch (Exception var16) {
                                    }
                                    this.field1451.method198(true, 147);
                                    this.field1451.method203(var12);
                                }
                                this.field1070 = false;
                                this.field1176 = true;
                            }
                        } else if (this.field1294 == -1) {
                            if (var2 >= 32 && var2 <= 122 && this.field1416.length() < 80) {
                                this.field1416 = this.field1416 + (char) var2;
                                this.field1176 = true;
                            }
                            if (var2 == 8 && this.field1416.length() > 0) {
                                this.field1416 = this.field1416.substring(0, this.field1416.length() - 1);
                                this.field1176 = true;
                            }
                            if ((var2 == 13 || var2 == 10) && this.field1416.length() > 0) {
                                if (this.field1416.equals("::clientdrop") && (super.field14 != null || this.method477(105).indexOf("192.168.1.") != -1)) {
                                    this.method394(this.field1463);
                                } else if (this.field1416.startsWith("::")) {
                                    this.field1451.method198(true, 251);
                                    this.field1451.method199(this.field1416.length() - 1);
                                    this.field1451.method206(this.field1416.substring(2));
                                } else {
                                    byte var13 = 0;
                                    if (this.field1416.startsWith("yellow:")) {
                                        var13 = 0;
                                        this.field1416 = this.field1416.substring(7);
                                    }
                                    if (this.field1416.startsWith("red:")) {
                                        var13 = 1;
                                        this.field1416 = this.field1416.substring(4);
                                    }
                                    if (this.field1416.startsWith("green:")) {
                                        var13 = 2;
                                        this.field1416 = this.field1416.substring(6);
                                    }
                                    if (this.field1416.startsWith("cyan:")) {
                                        var13 = 3;
                                        this.field1416 = this.field1416.substring(5);
                                    }
                                    if (this.field1416.startsWith("purple:")) {
                                        var13 = 4;
                                        this.field1416 = this.field1416.substring(7);
                                    }
                                    if (this.field1416.startsWith("white:")) {
                                        var13 = 5;
                                        this.field1416 = this.field1416.substring(6);
                                    }
                                    if (this.field1416.startsWith("flash1:")) {
                                        var13 = 6;
                                        this.field1416 = this.field1416.substring(7);
                                    }
                                    if (this.field1416.startsWith("flash2:")) {
                                        var13 = 7;
                                        this.field1416 = this.field1416.substring(7);
                                    }
                                    if (this.field1416.startsWith("flash3:")) {
                                        var13 = 8;
                                        this.field1416 = this.field1416.substring(7);
                                    }
                                    if (this.field1416.startsWith("glow1:")) {
                                        var13 = 9;
                                        this.field1416 = this.field1416.substring(6);
                                    }
                                    if (this.field1416.startsWith("glow2:")) {
                                        var13 = 10;
                                        this.field1416 = this.field1416.substring(6);
                                    }
                                    if (this.field1416.startsWith("glow3:")) {
                                        var13 = 11;
                                        this.field1416 = this.field1416.substring(6);
                                    }
                                    byte var14 = 0;
                                    if (this.field1416.startsWith("wave:")) {
                                        var14 = 1;
                                        this.field1416 = this.field1416.substring(5);
                                    }
                                    if (this.field1416.startsWith("scroll:")) {
                                        var14 = 2;
                                        this.field1416 = this.field1416.substring(7);
                                    }
                                    this.field1451.method198(true, 42);
                                    this.field1451.method199(0);
                                    int var15 = this.field1451.field612;
                                    this.field1451.method199(var13);
                                    this.field1451.method199(var14);
                                    WordPack.method259(930, this.field1451, this.field1416);
                                    this.field1451.method208(this.field1451.field612 - var15, 1);
                                    this.field1416 = JString.method256((byte) 4, this.field1416);
                                    this.field1416 = WordFilter.method335(this.field1416, (byte) 2);
                                    this.field1464.field310 = this.field1416;
                                    this.field1464.field312 = var13;
                                    this.field1464.field313 = var14;
                                    this.field1464.field311 = 150;
                                    this.method380(-823, 2, this.field1464.field356, this.field1464.field310);
                                    if (this.field1470 == 2) {
                                        this.field1470 = 3;
                                        this.field1101 = true;
                                        this.field1451.method198(true, 197);
                                        this.field1451.method199(this.field1470);
                                        this.field1451.method199(this.field1117);
                                        this.field1451.method199(this.field1108);
                                    }
                                }
                                this.field1416 = "";
                                this.field1176 = true;
                            }
                        }
                    }
                } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
                if (this.field1084.length() < 12) {
                    this.field1084 = this.field1084 + (char) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method402(int arg0) {
        try {
            this.field1477 = -1;
            this.field1069.method232();
            this.field1484.method232();
            this.field1379.method232();
            this.field1261.method232();
            Pix3D.method156(229);
            this.method415(4);
            this.field1448.method50(true);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1369[var2].method295(true);
            }
            System.gc();
            World var3 = new World(772, this.field1161, 104, this.field1118, 104);
            byte[] var4 = new byte[100000];
            int var5 = this.field1116.length;
            World.field34 = World3D.field218;
            for (int var6 = 0; var6 < var5; ++var6) {
                int var7 = this.field1330[var6] >> 8;
                int var8 = this.field1330[var6] & 255;
                if (var7 == 33 && var8 >= 71 && var8 <= 73) {
                    World.field34 = false;
                }
            }
            if (World.field34) {
                this.field1448.method51((byte) -126, this.field1333);
            } else {
                this.field1448.method51((byte) -126, 0);
            }
            this.field1451.method198(true, 126);
            for (int var9 = 0; var9 < var5; ++var9) {
                int var10 = (this.field1330[var9] >> 8) * 64 - this.field1473;
                int var11 = (this.field1330[var9] & 255) * 64 - this.field1474;
                byte[] var12 = this.field1116[var9];
                if (var12 != null) {
                    int var13 = (new Packet(575, var12)).method214();
                    BZip2.method238(var4, var13, var12, var12.length - 4, 4);
                    var3.method15((this.field1198 - 6) * 8, 0, var4, var10, var11, (this.field1199 - 6) * 8);
                } else if (this.field1199 < 800) {
                    var3.method14((byte) 7, var11, 64, 64, var10);
                }
            }
            this.field1451.method198(true, 126);
            for (int var14 = 0; var14 < var5; ++var14) {
                byte[] var15 = this.field1349[var14];
                if (var15 != null) {
                    int var16 = (new Packet(575, var15)).method214();
                    BZip2.method238(var4, var16, var15, var15.length - 4, 4);
                    int var17 = (this.field1330[var14] >> 8) * 64 - this.field1473;
                    int var18 = (this.field1330[var14] & 255) * 64 - this.field1474;
                    var3.method16(this.field1484, this.field1448, 15680, var17, this.field1369, var4, var18);
                }
            }
            this.field1451.method198(true, 126);
            var3.method18(this.field1448, false, this.field1369);
            this.field1213.method235(735);
            this.field1451.method198(true, 126);
            for (LocEntity var19 = (LocEntity) this.field1484.method228(); var19 != null; var19 = (LocEntity) this.field1484.method230(735)) {
                if ((this.field1118[1][var19.field644][var19.field645] & 2) == 2) {
                    --var19.field642;
                    if (var19.field642 < 0) {
                        var19.method107();
                    }
                }
            }
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method451(var20, var21);
                }
            }
            for (LocMerged var22 = (LocMerged) this.field1149.method228(); var22 != null; var22 = (LocMerged) this.field1149.method230(735)) {
                this.method475(var22.field630, var22.field629, var22.field628, var22.field626, var22.field627, 221, var22.field624, var22.field625);
            }
        } catch (Exception var24) {
        }
        LocType.field820.method104();
        System.gc();
        if (arg0 == 8) {
            Pix3D.method157(false, 20);
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method403(int arg0) {
        this.field1167 += arg0;
        for (int var2 = -1; var2 < this.field1344; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1342;
            } else {
                var6 = this.field1345[var2];
            }
            PlayerEntity var7 = this.field1343[var6];
            if (var7 != null && var7.field311 > 0) {
                --var7.field311;
                if (var7.field311 == 0) {
                    var7.field310 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field1318; ++var3) {
            int var4 = this.field1319[var3];
            NpcEntity var5 = this.field1317[var4];
            if (var5 != null && var5.field311 > 0) {
                --var5.field311;
                if (var5.field311 == 0) {
                    var5.field310 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILkb;I)V")
    private final void method404(int arg0, Packet arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1346; ++var4) {
            int var5 = this.field1347[var4];
            NpcEntity var6 = this.field1317[var5];
            int var7 = arg1.method209();
            if ((var7 & 2) == 2) {
                int var8 = arg1.method211();
                if (var8 == 65535) {
                    var8 = -1;
                }
                if (var6.field325 == var8) {
                    var6.field329 = 0;
                }
                int var9 = arg1.method209();
                if (var8 == -1 || var6.field325 == -1 || SeqType.field999[var8].field1007 > SeqType.field999[var6.field325].field1007 || SeqType.field999[var6.field325].field1007 == 0) {
                    var6.field325 = var8;
                    var6.field326 = 0;
                    var6.field327 = 0;
                    var6.field328 = var9;
                    var6.field329 = 0;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field319 = arg1.method211();
                if (var6.field319 == 65535) {
                    var6.field319 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field310 = arg1.method216();
                var6.field311 = 100;
            }
            if ((var7 & 16) == 16) {
                var6.field314 = arg1.method209();
                var6.field315 = arg1.method209();
                var6.field316 = field1354 + 400;
                var6.field317 = arg1.method209();
                var6.field318 = arg1.method209();
            }
            if ((var7 & 32) == 32) {
                var6.field352 = NpcType.method281(arg1.method211());
                var6.field305 = var6.field352.field835;
                var6.field306 = var6.field352.field836;
                var6.field307 = var6.field352.field837;
                var6.field308 = var6.field352.field838;
                var6.field303 = var6.field352.field834;
            }
            if ((var7 & 64) == 64) {
                var6.field330 = arg1.method211();
                int var10 = arg1.method214();
                var6.field334 = var10 >> 16;
                var6.field333 = (var10 & 65535) + field1354;
                var6.field331 = 0;
                var6.field332 = 0;
                if (var6.field333 > field1354) {
                    var6.field331 = -1;
                }
                if (var6.field330 == 65535) {
                    var6.field330 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field320 = arg1.method211();
                var6.field321 = arg1.method211();
            }
        }
        if (this.field1274 != arg2) {
            this.field1451.method199(3);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLhc;)Z")
    public final boolean method405(boolean arg0, Component arg1) {
        if (arg0) {
            this.field1313 = this.field1310.method246();
        }
        if (arg1.field948 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field948.length; ++var3) {
                int var4 = this.method372(var3, -254, arg1);
                int var5 = arg1.field949[var3];
                if (arg1.field948[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field948[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field948[var3] == 4) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILz;III)V")
    public final void method406(int arg0, PlayerEntity arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 0) {
            this.field1451.method199(158);
        }
        if (this.field1464 != arg1) {
            if (this.field1164 < 400) {
                String var6 = arg1.field356 + method384(this.field1464.field362, 0, arg1.field362) + " (level-" + arg1.field362 + ")";
                if (this.field1455 == 1) {
                    this.field1158[this.field1164] = "Use " + this.field1459 + " with @whi@" + var6;
                    this.field1422[this.field1164] = 103;
                    this.field1423[this.field1164] = arg2;
                    this.field1420[this.field1164] = arg3;
                    this.field1421[this.field1164] = arg4;
                    ++this.field1164;
                } else if (this.field1465 == 1) {
                    if ((this.field1467 & 8) == 8) {
                        this.field1158[this.field1164] = this.field1468 + " @whi@" + var6;
                        this.field1422[this.field1164] = 48;
                        this.field1423[this.field1164] = arg2;
                        this.field1420[this.field1164] = arg3;
                        this.field1421[this.field1164] = arg4;
                        ++this.field1164;
                    }
                } else {
                    this.field1158[this.field1164] = "Follow @whi@" + var6;
                    this.field1422[this.field1164] = 1741;
                    this.field1423[this.field1164] = arg2;
                    this.field1420[this.field1164] = arg3;
                    this.field1421[this.field1164] = arg4;
                    ++this.field1164;
                    if (this.field1146 == 0) {
                        this.field1158[this.field1164] = "Trade with @whi@" + var6;
                        this.field1422[this.field1164] = 1528;
                        this.field1423[this.field1164] = arg2;
                        this.field1420[this.field1164] = arg3;
                        this.field1421[this.field1164] = arg4;
                        ++this.field1164;
                    }
                    if (this.field1172 > 0) {
                        this.field1158[this.field1164] = "Attack @whi@" + var6;
                        if (this.field1464.field362 >= arg1.field362) {
                            this.field1422[this.field1164] = 593;
                        } else {
                            this.field1422[this.field1164] = 2593;
                        }
                        this.field1423[this.field1164] = arg2;
                        this.field1420[this.field1164] = arg3;
                        this.field1421[this.field1164] = arg4;
                        ++this.field1164;
                    }
                    if (this.field1113 == 1) {
                        this.field1158[this.field1164] = "Fight @whi@" + var6;
                        this.field1422[this.field1164] = 593;
                        this.field1423[this.field1164] = arg2;
                        this.field1420[this.field1164] = arg3;
                        this.field1421[this.field1164] = arg4;
                        ++this.field1164;
                    }
                    if (this.field1113 == 2) {
                        this.field1158[this.field1164] = "Duel-with @whi@" + var6;
                        this.field1422[this.field1164] = 1596;
                        this.field1423[this.field1164] = arg2;
                        this.field1420[this.field1164] = arg3;
                        this.field1421[this.field1164] = arg4;
                        ++this.field1164;
                    }
                }
                for (int var7 = 0; var7 < this.field1164; ++var7) {
                    if (this.field1422[var7] == 981) {
                        this.field1158[var7] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lhc;I)Z")
    public final boolean method407(Component arg0, int arg1) {
        if (arg1 <= 0) {
            this.field1168 = this.field1119.method209();
        }
        int var3 = arg0.field942;
        if (var3 == 201) {
            this.field1176 = true;
            this.field1070 = false;
            this.field1150 = true;
            this.field1059 = "";
            this.field1204 = 1;
            this.field1409 = "Enter name of friend to add to list";
        }
        if (var3 == 202) {
            this.field1176 = true;
            this.field1070 = false;
            this.field1150 = true;
            this.field1059 = "";
            this.field1204 = 2;
            this.field1409 = "Enter name of friend to delete from list";
        }
        if (var3 == 205) {
            this.field1171 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field1176 = true;
                this.field1070 = false;
                this.field1150 = true;
                this.field1059 = "";
                this.field1204 = 4;
                this.field1409 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field1176 = true;
                this.field1070 = false;
                this.field1150 = true;
                this.field1059 = "";
                this.field1204 = 5;
                this.field1409 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field1336[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = IdkType.field923 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= IdkType.field923) {
                                var6 = 0;
                            }
                        }
                        if (!IdkType.field924[var6].field930 && IdkType.field924[var6].field925 == var4 + (this.field1401 ? 0 : 7)) {
                            this.field1336[var4] = var6;
                            this.field1424 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field1406[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field1205[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field1205[var7].length) {
                        var9 = 0;
                    }
                }
                this.field1406[var7] = var9;
                this.field1424 = true;
            }
            if (var3 == 324 && !this.field1401) {
                this.field1401 = true;
                this.method386(false);
            }
            if (var3 == 325 && this.field1401) {
                this.field1401 = false;
                this.method386(false);
            }
            if (var3 != 326) {
                if (var3 == 613) {
                    this.field1391 = !this.field1391;
                }
                if (var3 >= 601 && var3 <= 612) {
                    this.method378(954);
                    if (this.field1084.length() > 0) {
                        this.field1451.method198(true, 252);
                        this.field1451.method205(JString.method251(this.field1084), 0);
                        this.field1451.method199(var3 - 601);
                        this.field1451.method199(this.field1391 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field1451.method198(true, 239);
                this.field1451.method199(this.field1401 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field1451.method199(this.field1336[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field1451.method199(this.field1406[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)Z")
    public final boolean method408(int arg0) {
        if (arg0 != 30850) {
            this.field1322 = null;
        }
        if (this.field1135 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1135.method31();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1168 == -1) {
                    this.field1135.method32(this.field1119.field611, 0, 1);
                    this.field1168 = this.field1119.field611[0] & 255;
                    if (this.field1310 != null) {
                        this.field1168 = this.field1168 - this.field1310.method246() & 255;
                    }
                    this.field1167 = Protocol.field895[this.field1168];
                    --var2;
                }
                if (this.field1167 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1135.method32(this.field1119.field611, 0, 1);
                    this.field1167 = this.field1119.field611[0] & 255;
                    --var2;
                }
                if (this.field1167 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1135.method32(this.field1119.field611, 0, 2);
                    this.field1119.field612 = 0;
                    this.field1167 = this.field1119.method211();
                    var2 -= 2;
                }
                if (var2 < this.field1167) {
                    return false;
                }
                this.field1119.field612 = 0;
                this.field1135.method32(this.field1119.field611, 0, this.field1167);
                this.field1169 = 0;
                this.field1437 = this.field1436;
                this.field1436 = this.field1435;
                this.field1435 = this.field1168;
                if (this.field1168 == 153) {
                    int var3 = this.field1119.method211();
                    this.method388(var3, 49065);
                    if (this.field1294 != -1) {
                        this.field1294 = -1;
                        this.field1176 = true;
                    }
                    if (this.field1070) {
                        this.field1070 = false;
                        this.field1176 = true;
                    }
                    this.field1386 = var3;
                    this.field1092 = true;
                    this.field1285 = true;
                    this.field1142 = -1;
                    this.field1251 = false;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 180) {
                    int var4 = this.field1119.method211();
                    this.method388(var4, 49065);
                    if (this.field1386 != -1) {
                        this.field1386 = -1;
                        this.field1092 = true;
                        this.field1285 = true;
                    }
                    if (this.field1294 != -1) {
                        this.field1294 = -1;
                        this.field1176 = true;
                    }
                    if (this.field1070) {
                        this.field1070 = false;
                        this.field1176 = true;
                    }
                    this.field1142 = var4;
                    this.field1251 = false;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 201) {
                    long var5 = this.field1119.method215(6);
                    int var7 = this.field1119.method214();
                    int var8 = this.field1119.method209();
                    boolean var9 = false;
                    for (int var10 = 0; var10 < 100; ++var10) {
                        if (this.field1121[var10] == var7) {
                            var9 = true;
                            break;
                        }
                    }
                    if (var8 <= 1) {
                        for (int var11 = 0; var11 < this.field1306; ++var11) {
                            if (this.field1182[var11] == var5) {
                                var9 = true;
                                break;
                            }
                        }
                    }
                    if (!var9 && this.field1146 == 0) {
                        try {
                            this.field1121[this.field1415] = var7;
                            this.field1415 = (this.field1415 + 1) % 100;
                            String var12 = WordPack.method258((byte) 7, this.field1167 - 13, this.field1119);
                            String var13 = WordFilter.method335(var12, (byte) 2);
                            if (var8 > 1) {
                                this.method380(-823, 7, JString.method255(false, JString.method252(false, var5)), var13);
                            } else {
                                this.method380(-823, 3, JString.method255(false, JString.method252(false, var5)), var13);
                            }
                        } catch (Exception var181) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 112) {
                    String var15 = this.field1119.method216();
                    if (var15.endsWith(":tradereq:")) {
                        String var16 = var15.substring(0, var15.indexOf(":"));
                        long var17 = JString.method251(var16);
                        boolean var19 = false;
                        for (int var20 = 0; var20 < this.field1306; ++var20) {
                            if (this.field1182[var20] == var17) {
                                var19 = true;
                                break;
                            }
                        }
                        if (!var19 && this.field1146 == 0) {
                            this.method380(-823, 4, var16, "wishes to trade with you.");
                        }
                    } else if (!var15.endsWith(":duelreq:")) {
                        this.method380(-823, 0, "", var15);
                    } else {
                        String var21 = var15.substring(0, var15.indexOf(":"));
                        long var22 = JString.method251(var21);
                        boolean var24 = false;
                        for (int var25 = 0; var25 < this.field1306; ++var25) {
                            if (this.field1182[var25] == var22) {
                                var24 = true;
                                break;
                            }
                        }
                        if (!var24 && this.field1146 == 0) {
                            this.method380(-823, 8, var21, "wishes to duel with you.");
                        }
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 147) {
                    this.field1264 = this.field1119.method209();
                    this.field1265 = this.field1119.method209();
                    for (int var26 = this.field1264; var26 < this.field1264 + 8; ++var26) {
                        for (int var27 = this.field1265; var27 < this.field1265 + 8; ++var27) {
                            if (this.field1322[this.field1333][var26][var27] != null) {
                                this.field1322[this.field1333][var26][var27] = null;
                                this.method451(var26, var27);
                            }
                        }
                    }
                    for (LocMerged var28 = (LocMerged) this.field1149.method228(); var28 != null; var28 = (LocMerged) this.field1149.method230(735)) {
                        if (var28.field626 >= this.field1264 && var28.field626 < this.field1264 + 8 && var28.field627 >= this.field1265 && var28.field627 < this.field1265 + 8 && this.field1333 == var28.field624) {
                            this.method475(var28.field633, var28.field632, var28.field631, var28.field626, var28.field627, 221, var28.field624, var28.field625);
                            var28.method107();
                        }
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 98) {
                    this.field1268 = this.field1119.method209();
                    if (this.field1427 == this.field1268) {
                        if (this.field1268 == 3) {
                            this.field1427 = 1;
                        } else {
                            this.field1427 = 3;
                        }
                        this.field1092 = true;
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 132) {
                    InputTracking.method35((byte) 7, true);
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 125) {
                    this.field1085 = 0;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 42) {
                    this.field1353 = this.field1119.method209();
                    if (this.field1353 == 1) {
                        this.field1273 = this.field1119.method211();
                    }
                    if (this.field1353 >= 2 && this.field1353 <= 6) {
                        if (this.field1353 == 2) {
                            this.field1099 = 64;
                            this.field1100 = 64;
                        }
                        if (this.field1353 == 3) {
                            this.field1099 = 0;
                            this.field1100 = 64;
                        }
                        if (this.field1353 == 4) {
                            this.field1099 = 128;
                            this.field1100 = 64;
                        }
                        if (this.field1353 == 5) {
                            this.field1099 = 64;
                            this.field1100 = 0;
                        }
                        if (this.field1353 == 6) {
                            this.field1099 = 64;
                            this.field1100 = 128;
                        }
                        this.field1353 = 2;
                        this.field1096 = this.field1119.method211();
                        this.field1097 = this.field1119.method211();
                        this.field1098 = this.field1119.method209();
                    }
                    if (this.field1353 == 10) {
                        this.field1426 = this.field1119.method211();
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 80) {
                    int var29 = this.field1119.method211();
                    int var30 = this.field1119.method211();
                    Component.field933[var29].field981 = var30;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 231) {
                    int var31 = this.field1119.method211();
                    int var32 = this.field1119.method211();
                    if (this.field1294 != -1) {
                        this.field1294 = -1;
                        this.field1176 = true;
                    }
                    if (this.field1070) {
                        this.field1070 = false;
                        this.field1176 = true;
                    }
                    this.field1142 = var31;
                    this.field1386 = var32;
                    this.field1092 = true;
                    this.field1285 = true;
                    this.field1251 = false;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 133) {
                    int var33 = this.field1119.method211();
                    byte var34 = this.field1119.method210();
                    this.field1356[var33] = var34;
                    if (this.field1287[var33] != var34) {
                        this.field1287[var33] = var34;
                        this.method457(var33, -31746);
                        this.field1092 = true;
                        if (this.field1107 != -1) {
                            this.field1176 = true;
                        }
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 106) {
                    int var35 = this.field1119.method211();
                    this.method388(var35, 49065);
                    if (this.field1386 != -1) {
                        this.field1386 = -1;
                        this.field1092 = true;
                        this.field1285 = true;
                    }
                    this.field1294 = var35;
                    this.field1176 = true;
                    this.field1142 = -1;
                    this.field1251 = false;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 176) {
                    int var36 = this.field1119.method211();
                    String var37 = this.field1119.method216();
                    Component.field933[var36].field972 = var37;
                    if (this.field1111[this.field1427] == Component.field933[var36].field939) {
                        this.field1092 = true;
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 165) {
                    int var38 = this.field1119.method212();
                    this.field1107 = var38;
                    this.field1176 = true;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 255) {
                    if (this.field1386 != -1) {
                        this.field1386 = -1;
                        this.field1092 = true;
                        this.field1285 = true;
                    }
                    if (this.field1294 != -1) {
                        this.field1294 = -1;
                        this.field1176 = true;
                    }
                    if (this.field1070) {
                        this.field1070 = false;
                        this.field1176 = true;
                    }
                    this.field1142 = -1;
                    this.field1251 = false;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 38) {
                    this.field1092 = true;
                    int var39 = this.field1119.method211();
                    Component var40 = Component.field933[var39];
                    while (this.field1119.field612 < this.field1167) {
                        int var41 = this.field1119.method209();
                        int var42 = this.field1119.method211();
                        int var43 = this.field1119.method209();
                        if (var43 == 255) {
                            var43 = this.field1119.method214();
                        }
                        if (var41 >= 0 && var41 < var40.field934.length) {
                            var40.field934[var41] = var42;
                            var40.field935[var41] = var43;
                        }
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 213) {
                    this.field1470 = this.field1119.method209();
                    this.field1117 = this.field1119.method209();
                    this.field1108 = this.field1119.method209();
                    this.field1101 = true;
                    this.field1176 = true;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 48) {
                    int var44 = this.field1119.method211();
                    int var45 = this.field1119.method211();
                    NpcType var46 = NpcType.method281(var45);
                    Component.field933[var44].field979 = var46.method284(0);
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 174) {
                    this.field1305 = true;
                    this.field1410 = this.field1119.method209();
                    this.field1411 = this.field1119.method209();
                    this.field1412 = this.field1119.method211();
                    this.field1413 = this.field1119.method209();
                    this.field1414 = this.field1119.method209();
                    if (this.field1414 >= 100) {
                        this.field1136 = this.field1410 * 128 + 64;
                        this.field1138 = this.field1411 * 128 + 64;
                        this.field1137 = this.method449(this.field1333, field1131, this.field1411, this.field1410) - this.field1412;
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 218) {
                    int var47 = this.field1119.method211();
                    boolean var48 = this.field1119.method209() == 1;
                    Component.field933[var47].field953 = var48;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 117 || this.field1168 == 25 || this.field1168 == 127 || this.field1168 == 195 || this.field1168 == 1 || this.field1168 == 61 || this.field1168 == 246 || this.field1168 == 78 || this.field1168 == 214 || this.field1168 == 220) {
                    this.method387(this.field1168, (byte) 5, this.field1119);
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 3) {
                    int var49 = this.field1119.method211();
                    int var50 = this.field1119.method211();
                    if (this.field1198 == var49 && this.field1199 == var50 && this.field1277 != 0) {
                        this.field1168 = -1;
                        return true;
                    }
                    this.field1198 = var49;
                    this.field1199 = var50;
                    this.field1473 = (this.field1198 - 6) * 8;
                    this.field1474 = (this.field1199 - 6) * 8;
                    this.field1277 = 1;
                    this.field1213.method235(735);
                    this.field1247.method188("Loading - please wait.", 151, 257, field1263, 0);
                    this.field1247.method188("Loading - please wait.", 150, 256, field1263, 16777215);
                    this.field1213.method236(8, 11, super.field11, (byte) 5);
                    signlink.looprate(5);
                    int var51 = (this.field1167 - 2) / 10;
                    this.field1116 = new byte[var51][];
                    this.field1349 = new byte[var51][];
                    this.field1330 = new int[var51];
                    this.field1451.method198(true, 131);
                    this.field1451.method199(0);
                    int var52 = 0;
                    for (int var53 = 0; var53 < var51; ++var53) {
                        int var54 = this.field1119.method209();
                        int var55 = this.field1119.method209();
                        int var56 = this.field1119.method214();
                        int var57 = this.field1119.method214();
                        this.field1330[var53] = (var54 << 8) + var55;
                        if (var56 != 0) {
                            byte[] var58 = signlink.cacheload("m" + var54 + "_" + var55);
                            if (var58 != null) {
                                this.field1178.reset();
                                this.field1178.update(var58);
                                if ((int) this.field1178.getValue() != var56) {
                                    var58 = null;
                                }
                            }
                            if (var58 != null) {
                                this.field1116[var53] = var58;
                            } else {
                                this.field1277 = 0;
                                this.field1451.method199(0);
                                this.field1451.method199(var54);
                                this.field1451.method199(var55);
                                var52 += 3;
                            }
                        }
                        if (var57 != 0) {
                            byte[] var59 = signlink.cacheload("l" + var54 + "_" + var55);
                            if (var59 != null) {
                                this.field1178.reset();
                                this.field1178.update(var59);
                                if ((int) this.field1178.getValue() != var57) {
                                    var59 = null;
                                }
                            }
                            if (var59 != null) {
                                this.field1349[var53] = var59;
                            } else {
                                this.field1277 = 0;
                                this.field1451.method199(1);
                                this.field1451.method199(var54);
                                this.field1451.method199(var55);
                                var52 += 3;
                            }
                        }
                    }
                    this.field1451.method208(var52, 1);
                    signlink.looprate(50);
                    this.field1213.method235(735);
                    if (this.field1277 == 0) {
                        this.field1247.method188("Map area updated since last visit, so load will take longer this time only", 166, 257, field1263, 0);
                        this.field1247.method188("Map area updated since last visit, so load will take longer this time only", 165, 256, field1263, 16777215);
                    }
                    this.field1213.method236(8, 11, super.field11, (byte) 5);
                    int var60 = this.field1473 - this.field1475;
                    int var61 = this.field1474 - this.field1476;
                    this.field1475 = this.field1473;
                    this.field1476 = this.field1474;
                    for (int var62 = 0; var62 < 8192; ++var62) {
                        NpcEntity var63 = this.field1317[var62];
                        if (var63 != null) {
                            for (int var64 = 0; var64 < 10; ++var64) {
                                var63.field346[var64] -= var60;
                                var63.field347[var64] -= var61;
                            }
                            var63.field298 -= var60 * 128;
                            var63.field299 -= var61 * 128;
                        }
                    }
                    for (int var65 = 0; var65 < this.field1341; ++var65) {
                        PlayerEntity var66 = this.field1343[var65];
                        if (var66 != null) {
                            for (int var67 = 0; var67 < 10; ++var67) {
                                var66.field346[var67] -= var60;
                                var66.field347[var67] -= var61;
                            }
                            var66.field298 -= var60 * 128;
                            var66.field299 -= var61 * 128;
                        }
                    }
                    byte var68 = 0;
                    byte var69 = 104;
                    byte var70 = 1;
                    if (var60 < 0) {
                        var68 = 103;
                        var69 = -1;
                        var70 = -1;
                    }
                    byte var71 = 0;
                    byte var72 = 104;
                    byte var73 = 1;
                    if (var61 < 0) {
                        var71 = 103;
                        var72 = -1;
                        var73 = -1;
                    }
                    for (int var74 = var68; var69 != var74; var74 += var70) {
                        for (int var75 = var71; var72 != var75; var75 += var73) {
                            int var76 = var60 + var74;
                            int var77 = var61 + var75;
                            for (int var78 = 0; var78 < 4; ++var78) {
                                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                                    this.field1322[var78][var74][var75] = this.field1322[var78][var76][var77];
                                } else {
                                    this.field1322[var78][var74][var75] = null;
                                }
                            }
                        }
                    }
                    for (LocMerged var79 = (LocMerged) this.field1149.method228(); var79 != null; var79 = (LocMerged) this.field1149.method230(735)) {
                        var79.field626 -= var60;
                        var79.field627 -= var61;
                        if (var79.field626 < 0 || var79.field627 < 0 || var79.field626 >= 104 || var79.field627 >= 104) {
                            var79.method107();
                        }
                    }
                    if (this.field1085 != 0) {
                        this.field1085 -= var60;
                        this.field1086 -= var61;
                    }
                    this.field1305 = false;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 123) {
                    this.field1092 = true;
                    int var80 = this.field1119.method211();
                    Component var81 = Component.field933[var80];
                    int var82 = this.field1119.method209();
                    for (int var83 = 0; var83 < var82; ++var83) {
                        var81.field934[var83] = this.field1119.method211();
                        int var84 = this.field1119.method209();
                        if (var84 == 255) {
                            var84 = this.field1119.method214();
                        }
                        var81.field935[var83] = var84;
                    }
                    for (int var85 = var82; var85 < var81.field934.length; ++var85) {
                        var81.field934[var85] = 0;
                        var81.field935[var85] = 0;
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 55) {
                    for (int var86 = 0; var86 < this.field1343.length; ++var86) {
                        if (this.field1343[var86] != null) {
                            this.field1343[var86].field325 = -1;
                        }
                    }
                    for (int var87 = 0; var87 < this.field1317.length; ++var87) {
                        if (this.field1317[var87] != null) {
                            this.field1317[var87].field325 = -1;
                        }
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 66) {
                    int var88 = this.field1119.method209();
                    int var89 = this.field1119.method209();
                    int var90 = this.field1119.method211();
                    int var91 = this.field1119.method211();
                    int var92 = -1;
                    for (int var93 = 0; var93 < this.field1330.length; ++var93) {
                        if ((var88 << 8) + var89 == this.field1330[var93]) {
                            var92 = var93;
                        }
                    }
                    if (var92 != -1) {
                        if (this.field1116[var92] == null || this.field1116[var92].length != var91) {
                            this.field1116[var92] = new byte[var91];
                        }
                        this.field1119.method218((byte) 6, this.field1167 - 6, this.field1116[var92], var90);
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 212) {
                    int var94 = this.field1119.method211();
                    int var95 = this.field1119.method211();
                    int var96 = var95 >> 10 & 31;
                    int var97 = var95 >> 5 & 31;
                    int var98 = var95 & 31;
                    Component.field933[var94].field974 = (var98 << 3) + (var96 << 19) + (var97 << 11);
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 33) {
                    int var99 = this.field1119.method211();
                    int var100 = this.field1119.method211();
                    int var101 = this.field1119.method211();
                    ObjType var102 = ObjType.method287(var100);
                    Component.field933[var99].field979 = var102.method291(50);
                    Component.field933[var99].field984 = var102.field866;
                    Component.field933[var99].field985 = var102.field867;
                    Component.field933[var99].field983 = var102.field865 * 100 / var101;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 60) {
                    int var103 = this.field1119.method209();
                    int var104 = this.field1119.method209();
                    int var105 = -1;
                    for (int var106 = 0; var106 < this.field1330.length; ++var106) {
                        if ((var103 << 8) + var104 == this.field1330[var106]) {
                            var105 = var106;
                        }
                    }
                    if (var105 != -1) {
                        signlink.cachesave("l" + var103 + "_" + var104, this.field1349[var105]);
                        this.field1277 = 1;
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 169) {
                    int var107 = this.field1119.method211();
                    Component.field933[var107].field979 = this.field1464.method115(0);
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 100) {
                    int var108 = this.field1119.method211();
                    int var109 = this.field1119.method209();
                    if (var108 == 65535) {
                        var108 = -1;
                    }
                    this.field1111[var109] = var108;
                    this.field1092 = true;
                    this.field1285 = true;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 191) {
                    int var110 = this.field1119.method211();
                    int var111 = this.field1119.method212();
                    int var112 = this.field1119.method212();
                    Component var113 = Component.field933[var110];
                    var113.field945 = var111;
                    var113.field946 = var112;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 68) {
                    InputTracking.method34((byte) 4);
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 248) {
                    int var114 = this.field1119.method211();
                    int var115 = this.field1119.method211();
                    Component.field933[var114].field979 = new Model(-26552, var115);
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 240) {
                    this.field1305 = true;
                    this.field1429 = this.field1119.method209();
                    this.field1430 = this.field1119.method209();
                    this.field1431 = this.field1119.method211();
                    this.field1432 = this.field1119.method209();
                    this.field1433 = this.field1119.method209();
                    if (this.field1433 >= 100) {
                        int var116 = this.field1429 * 128 + 64;
                        int var117 = this.field1430 * 128 + 64;
                        int var118 = this.method449(this.field1333, field1131, this.field1430, this.field1429) - this.field1431;
                        int var119 = var116 - this.field1136;
                        int var120 = var118 - this.field1137;
                        int var121 = var117 - this.field1138;
                        int var122 = (int) Math.sqrt((double) (var119 * var119 + var121 * var121));
                        this.field1139 = (int) (Math.atan2((double) var120, (double) var122) * 325.949D) & 2047;
                        this.field1140 = (int) (Math.atan2((double) var119, (double) var121) * -325.949D) & 2047;
                        if (this.field1139 < 128) {
                            this.field1139 = 128;
                        }
                        if (this.field1139 > 383) {
                            this.field1139 = 383;
                        }
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 94) {
                    this.field1092 = true;
                    int var123 = this.field1119.method209();
                    int var124 = this.field1119.method214();
                    int var125 = this.field1119.method209();
                    this.field1425[var123] = var124;
                    this.field1144[var123] = var125;
                    this.field1373[var123] = 1;
                    for (int var126 = 0; var126 < 98; ++var126) {
                        if (var124 >= field1280[var126]) {
                            this.field1373[var123] = var126 + 2;
                        }
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 171) {
                    this.field1279 = this.field1119.method214();
                    this.field1184 = this.field1119.method211();
                    this.field1262 = this.field1119.method209();
                    this.field1365 = this.field1119.method211();
                    if (this.field1279 != 0 && this.field1142 == -1) {
                        signlink.dnslookup(JString.method254(this.field1279, -774));
                        this.method378(954);
                        short var127 = 650;
                        if (this.field1262 != 201) {
                            var127 = 655;
                        }
                        this.field1084 = "";
                        this.field1391 = false;
                        for (int var128 = 0; var128 < Component.field933.length; ++var128) {
                            if (Component.field933[var128] != null && Component.field933[var128].field942 == var127) {
                                this.field1142 = Component.field933[var128].field939;
                                break;
                            }
                        }
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 250) {
                    this.field1264 = this.field1119.method209();
                    this.field1265 = this.field1119.method209();
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 192) {
                    this.field1264 = this.field1119.method209();
                    this.field1265 = this.field1119.method209();
                    while (this.field1119.field612 < this.field1167) {
                        int var129 = this.field1119.method209();
                        this.method387(var129, (byte) 5, this.field1119);
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 71) {
                    int var130 = this.field1119.method209();
                    int var131 = this.field1119.method209();
                    int var132 = this.field1119.method209();
                    int var133 = this.field1119.method209();
                    this.field1189[var130] = true;
                    this.field1469[var130] = var131;
                    this.field1371[var130] = var132;
                    this.field1284[var130] = var133;
                    this.field1275[var130] = 0;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 235) {
                    int var134 = this.field1119.method211();
                    int var135 = this.field1119.method214();
                    this.field1356[var134] = var135;
                    if (this.field1287[var134] != var135) {
                        this.field1287[var134] = var135;
                        this.method457(var134, -31746);
                        this.field1092 = true;
                        if (this.field1107 != -1) {
                            this.field1176 = true;
                        }
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 12) {
                    int var136 = this.field1119.method209();
                    int var137 = this.field1119.method209();
                    int var138 = -1;
                    for (int var139 = 0; var139 < this.field1330.length; ++var139) {
                        if ((var136 << 8) + var137 == this.field1330[var139]) {
                            var138 = var139;
                        }
                    }
                    if (var138 != -1) {
                        signlink.cachesave("m" + var136 + "_" + var137, this.field1116[var138]);
                        this.field1277 = 1;
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 140) {
                    long var140 = this.field1119.method215(6);
                    int var142 = this.field1119.method209();
                    String var143 = JString.method255(false, JString.method252(false, var140));
                    for (int var144 = 0; var144 < this.field1243; ++var144) {
                        if (this.field1234[var144] == var140) {
                            if (this.field1320[var144] != var142) {
                                this.field1320[var144] = var142;
                                this.field1092 = true;
                                if (var142 > 0) {
                                    this.method380(-823, 5, "", var143 + " has logged in.");
                                }
                                if (var142 == 0) {
                                    this.method380(-823, 5, "", var143 + " has logged out.");
                                }
                            }
                            var143 = null;
                            break;
                        }
                    }
                    if (var143 != null && this.field1243 < 100) {
                        this.field1234[this.field1243] = var140;
                        this.field1328[this.field1243] = var143;
                        this.field1320[this.field1243] = var142;
                        ++this.field1243;
                        this.field1092 = true;
                    }
                    boolean var145 = false;
                    while (!var145) {
                        var145 = true;
                        for (int var146 = 0; var146 < this.field1243 - 1; ++var146) {
                            if (this.field1320[var146] != field1324 && this.field1320[var146 + 1] == field1324 || this.field1320[var146] == 0 && this.field1320[var146 + 1] != 0) {
                                int var147 = this.field1320[var146];
                                this.field1320[var146] = this.field1320[var146 + 1];
                                this.field1320[var146 + 1] = var147;
                                String var148 = this.field1328[var146];
                                this.field1328[var146] = this.field1328[var146 + 1];
                                this.field1328[var146 + 1] = var148;
                                long var149 = this.field1234[var146];
                                this.field1234[var146] = this.field1234[var146 + 1];
                                this.field1234[var146 + 1] = var149;
                                this.field1092 = true;
                                var145 = false;
                            }
                        }
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 49) {
                    this.method466(681, this.field1167, this.field1119);
                    if (this.field1277 == 1) {
                        this.field1277 = 2;
                        World.field35 = this.field1333;
                        this.method402(this.field1454);
                    }
                    if (field1327 && this.field1277 == 2 && World.field35 != this.field1333) {
                        this.field1213.method235(735);
                        this.field1247.method188("Loading - please wait.", 151, 257, field1263, 0);
                        this.field1247.method188("Loading - please wait.", 150, 256, field1263, 16777215);
                        this.field1213.method236(8, 11, super.field11, (byte) 5);
                        World.field35 = this.field1333;
                        this.method402(this.field1454);
                    }
                    if (this.field1477 != this.field1333 && this.field1277 == 2) {
                        this.field1477 = this.field1333;
                        this.method410(-880, this.field1333);
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 35) {
                    int var151 = this.field1119.method209();
                    int var152 = this.field1119.method209();
                    int var153 = this.field1119.method211();
                    int var154 = this.field1119.method211();
                    int var155 = -1;
                    for (int var156 = 0; var156 < this.field1330.length; ++var156) {
                        if ((var151 << 8) + var152 == this.field1330[var156]) {
                            var155 = var156;
                        }
                    }
                    if (var155 != -1) {
                        if (this.field1349[var155] == null || this.field1349[var155].length != var154) {
                            this.field1349[var155] = new byte[var154];
                        }
                        this.field1119.method218((byte) 6, this.field1167 - 6, this.field1349[var155], var153);
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 113) {
                    this.field1306 = this.field1167 / 8;
                    for (int var157 = 0; var157 < this.field1306; ++var157) {
                        this.field1182[var157] = this.field1119.method215(6);
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 72) {
                    this.field1235 = this.field1119.method209();
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 47) {
                    this.field1305 = false;
                    for (int var158 = 0; var158 < 5; ++var158) {
                        this.field1189[var158] = false;
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 128) {
                    this.method390(this.field1119, 306, this.field1167);
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 85) {
                    this.field1427 = this.field1119.method209();
                    this.field1092 = true;
                    this.field1285 = true;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 107) {
                    if (this.field1427 == 12) {
                        this.field1092 = true;
                    }
                    this.field1331 = this.field1119.method209();
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 202) {
                    int var159 = this.field1119.method211();
                    int var160 = this.field1119.method209();
                    int var161 = this.field1119.method211();
                    if (this.field1160 && !field1327 && this.field1253 < 50) {
                        this.field1361[this.field1253] = var159;
                        this.field1203[this.field1253] = var160;
                        this.field1106[this.field1253] = Wave.field748[var159] + var161;
                        ++this.field1253;
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 216) {
                    for (int var162 = 0; var162 < this.field1287.length; ++var162) {
                        if (this.field1356[var162] != this.field1287[var162]) {
                            this.field1287[var162] = this.field1356[var162];
                            this.method457(var162, -31746);
                            this.field1092 = true;
                        }
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 92) {
                    String var163 = this.field1119.method216();
                    int var164 = this.field1119.method214();
                    int var165 = this.field1119.method214();
                    if (!var163.equals(this.field1350) && this.field1134 && !field1327) {
                        this.method425(var165, var163, -48, var164);
                    }
                    this.field1350 = var163;
                    this.field1315 = var164;
                    this.field1109 = var165;
                    this.field1143 = 0;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 254) {
                    this.field1150 = false;
                    this.field1070 = true;
                    this.field1180 = "";
                    this.field1176 = true;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 253) {
                    int var166 = this.field1119.method211();
                    int var167 = this.field1119.method211();
                    int var168 = this.field1119.method211();
                    Component var169 = Component.field933[var166];
                    Model var170 = var169.field979;
                    if (var170 != null) {
                        var170.method133(var167, var168);
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 57) {
                    if (this.field1427 == 12) {
                        this.field1092 = true;
                    }
                    this.field1314 = this.field1119.method212();
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 230) {
                    if (this.field1134 && !field1327) {
                        int var171 = this.field1119.method211();
                        int var172 = this.field1119.method214();
                        int var173 = this.field1167 - 6;
                        byte[] var174 = new byte[var172];
                        BZip2.method238(var174, var172, this.field1119.field611, var173, this.field1119.field612);
                        this.method460(false, false, var174, var172);
                        this.field1143 = var171;
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 242) {
                    this.field1202 = this.field1119.method211() * 30;
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 39) {
                    this.method379(-41589);
                    this.field1168 = -1;
                    return false;
                }
                if (this.field1168 == 186) {
                    int var175 = this.field1119.method211();
                    Component var176 = Component.field933[var175];
                    for (int var177 = 0; var177 < var176.field934.length; ++var177) {
                        var176.field934[var177] = -1;
                        var176.field934[var177] = 0;
                    }
                    this.field1168 = -1;
                    return true;
                }
                if (this.field1168 == 177) {
                    this.field1094 = this.field1119.method211();
                    this.field1168 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1168 + "," + this.field1167 + " - " + this.field1436 + "," + this.field1437);
                this.method379(-41589);
            } catch (IOException var182) {
                this.method394(this.field1463);
            } catch (Exception var183) {
                String var179 = "T2 - " + this.field1168 + "," + this.field1436 + "," + this.field1437 + " - " + this.field1167 + "," + (this.field1464.field346[0] + this.field1473) + "," + (this.field1464.field347[0] + this.field1474) + " - ";
                for (int var180 = 0; var180 < this.field1167 && var180 < 50; ++var180) {
                    var179 = var179 + this.field1119.field611[var180] + ",";
                }
                signlink.reporterror(var179);
                this.method379(-41589);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLkb;I)V")
    private final void method409(byte arg0, Packet arg1, int arg2) {
        arg1.method219(33724);
        int var4 = arg1.method220(false, 8);
        if (var4 < this.field1318) {
            for (int var5 = var4; var5 < this.field1318; ++var5) {
                this.field1450[this.field1449++] = this.field1319[var5];
            }
        }
        if (var4 > this.field1318) {
            signlink.reporterror(this.field1123 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1318 = 0;
            if (arg0 != 78) {
                this.field1322 = null;
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1319[var6];
                NpcEntity var8 = this.field1317[var7];
                int var9 = arg1.method220(false, 1);
                if (var9 == 0) {
                    this.field1319[this.field1318++] = var7;
                    var8.field342 = field1354;
                } else {
                    int var10 = arg1.method220(false, 2);
                    if (var10 == 0) {
                        this.field1319[this.field1318++] = var7;
                        var8.field342 = field1354;
                        this.field1347[this.field1346++] = var7;
                    } else if (var10 == 1) {
                        this.field1319[this.field1318++] = var7;
                        var8.field342 = field1354;
                        int var11 = arg1.method220(false, 3);
                        var8.method110(42815, false, var11);
                        int var12 = arg1.method220(false, 1);
                        if (var12 == 1) {
                            this.field1347[this.field1346++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1319[this.field1318++] = var7;
                        var8.field342 = field1354;
                        int var13 = arg1.method220(false, 3);
                        var8.method110(42815, true, var13);
                        int var14 = arg1.method220(false, 3);
                        var8.method110(42815, true, var14);
                        int var15 = arg1.method220(false, 1);
                        if (var15 == 1) {
                            this.field1347[this.field1346++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1450[this.field1449++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method410(int arg0, int arg1) {
        while (arg0 >= 0) {
            this.field1148 = -198;
        }
        int[] var3 = this.field1087.field572;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var14 = (103 - var6) * 512 * 4 + 24628;
            for (int var15 = 1; var15 < 103; ++var15) {
                if ((this.field1118[arg1][var15][var6] & 24) == 0) {
                    this.field1448.method86(var3, var14, 512, arg1, var15, var6);
                }
                if (arg1 < 3 && (this.field1118[arg1 + 1][var15][var6] & 8) != 0) {
                    this.field1448.method86(var3, var14, 512, arg1 + 1, var15, var6);
                }
                var14 += 4;
            }
        }
        this.field1087.method170(735);
        for (int var7 = 1; var7 < 103; ++var7) {
            for (int var13 = 1; var13 < 103; ++var13) {
                if ((this.field1118[arg1][var13][var7] & 24) == 0) {
                    this.method411(2, arg1, var7, var13);
                }
                if (arg1 < 3 && (this.field1118[arg1 + 1][var13][var7] & 8) != 0) {
                    this.method411(2, arg1 + 1, var7, var13);
                }
            }
        }
        this.field1213.method235(735);
        this.field1479 = 0;
        for (int var8 = 0; var8 < 104; ++var8) {
            for (int var9 = 0; var9 < 104; ++var9) {
                int var10 = this.field1448.method80(this.field1333, var8, var9);
                if (var10 != 0) {
                    int var11 = var10 >> 14 & 32767;
                    int var12 = LocType.method275(var11).field808;
                    if (var12 >= 0) {
                        this.field1088[this.field1479] = this.field1296[var12];
                        this.field1480[this.field1479] = var8;
                        this.field1481[this.field1479] = var9;
                        ++this.field1479;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)V")
    public final void method411(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1448.method77(arg1, arg3, arg2);
        if (var5 != 0) {
            int var6 = this.field1448.method81(arg1, arg3, arg2, var5);
            int var7 = var6 >> 6 & 3;
            int var8 = var6 & 31;
            int var9 = 15658734;
            if (var5 > 0) {
                var9 = 15597568;
            }
            int[] var10 = this.field1087.field572;
            int var11 = (103 - arg2) * 512 * 4 + arg3 * 4 + 24624;
            int var12 = var5 >> 14 & 32767;
            LocType var13 = LocType.method275(var12);
            if (var13.field809 != -1) {
                Pix8 var14 = this.field1321[var13.field809];
                if (var14 != null) {
                    int var15 = (var13.field794 * 4 - var14.field584) / 2;
                    int var16 = (var13.field795 * 4 - var14.field585) / 2;
                    var14.method186(arg3 * 4 + 48 + var15, (104 - arg2 - var13.field795) * 4 + 48 + var16, -141);
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
        int var17 = this.field1448.method79(arg1, arg3, arg2);
        if (var17 != 0) {
            int var18 = this.field1448.method81(arg1, arg3, arg2, var17);
            int var19 = var18 >> 6 & 3;
            int var20 = var18 & 31;
            int var21 = var17 >> 14 & 32767;
            LocType var22 = LocType.method275(var21);
            if (var22.field809 != -1) {
                Pix8 var23 = this.field1321[var22.field809];
                if (var23 != null) {
                    int var24 = (var22.field794 * 4 - var23.field584) / 2;
                    int var25 = (var22.field795 * 4 - var23.field585) / 2;
                    var23.method186(arg3 * 4 + 48 + var24, (104 - arg2 - var22.field795) * 4 + 48 + var25, -141);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = this.field1087.field572;
                int var28 = (103 - arg2) * 512 * 4 + arg3 * 4 + 24624;
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
        int var29 = this.field1448.method80(arg1, arg3, arg2);
        if (arg0 != 2) {
            this.field1168 = this.field1119.method209();
        }
        if (var29 != 0) {
            int var30 = var29 >> 14 & 32767;
            LocType var31 = LocType.method275(var30);
            if (var31.field809 != -1) {
                Pix8 var32 = this.field1321[var31.field809];
                if (var32 != null) {
                    int var33 = (var31.field794 * 4 - var32.field584) / 2;
                    int var34 = (var31.field795 * 4 - var32.field585) / 2;
                    var32.method186(arg3 * 4 + 48 + var33, (104 - arg2 - var31.field795) * 4 + 48 + var34, -141);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method412(int arg0) {
        if (arg0 < 7 || arg0 > 7) {
            field1372 = 439;
        }
        for (int var2 = 0; var2 < this.field1318; ++var2) {
            NpcEntity var3 = this.field1317[this.field1319[var2]];
            int var4 = (this.field1319[var2] << 14) + 536870912;
            if (var3 != null && var3.method111(35155)) {
                int var5 = var3.field298 >> 7;
                int var6 = var3.field299 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field302 == 1 && (var3.field298 & 127) == 64 && (var3.field299 & 127) == 64) {
                        if (this.field1252[var5][var6] == this.field1370) {
                            continue;
                        }
                        this.field1252[var5][var6] = this.field1370;
                    }
                    this.field1448.method61(var3.field299, (var3.field302 - 1) * 64 + 60, this.method449(this.field1333, field1131, var3.field299, var3.field298), (Model) null, var3.field300, var3.field301, var4, 4, var3.field298, var3, this.field1333);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;Lz;III)V")
    private final void method413(Packet arg0, PlayerEntity arg1, int arg2, int arg3, int arg4) {
        this.field1167 += arg3;
        if ((arg4 & 1) == 1) {
            int var6 = arg0.method209();
            byte[] var7 = new byte[var6];
            Packet var8 = new Packet(575, var7);
            arg0.method218((byte) 6, var6, var7, 0);
            this.field1348[arg2] = var8;
            arg1.method113(0, var8);
        }
        if ((arg4 & 2) == 2) {
            int var9 = arg0.method211();
            if (var9 == 65535) {
                var9 = -1;
            }
            if (arg1.field325 == var9) {
                arg1.field329 = 0;
            }
            int var10 = arg0.method209();
            if (var9 == -1 || arg1.field325 == -1 || SeqType.field999[var9].field1007 > SeqType.field999[arg1.field325].field1007 || SeqType.field999[arg1.field325].field1007 == 0) {
                arg1.field325 = var9;
                arg1.field326 = 0;
                arg1.field327 = 0;
                arg1.field328 = var10;
                arg1.field329 = 0;
            }
        }
        if ((arg4 & 4) == 4) {
            arg1.field319 = arg0.method211();
            if (arg1.field319 == 65535) {
                arg1.field319 = -1;
            }
        }
        if ((arg4 & 8) == 8) {
            arg1.field310 = arg0.method216();
            arg1.field312 = 0;
            arg1.field313 = 0;
            arg1.field311 = 150;
            this.method380(-823, 2, arg1.field356, arg1.field310);
        }
        if ((arg4 & 16) == 16) {
            arg1.field314 = arg0.method209();
            arg1.field315 = arg0.method209();
            arg1.field316 = field1354 + 400;
            arg1.field317 = arg0.method209();
            arg1.field318 = arg0.method209();
        }
        if ((arg4 & 32) == 32) {
            arg1.field320 = arg0.method211();
            arg1.field321 = arg0.method211();
        }
        if ((arg4 & 64) == 64) {
            int var11 = arg0.method211();
            int var12 = arg0.method209();
            int var13 = arg0.method209();
            int var14 = arg0.field612;
            if (arg1.field356 != null) {
                long var15 = JString.method251(arg1.field356);
                boolean var17 = false;
                if (var12 <= 1) {
                    for (int var18 = 0; var18 < this.field1306; ++var18) {
                        if (this.field1182[var18] == var15) {
                            var17 = true;
                            break;
                        }
                    }
                }
                if (!var17 && this.field1146 == 0) {
                    try {
                        String var19 = WordPack.method258((byte) 7, var13, arg0);
                        String var20 = WordFilter.method335(var19, (byte) 2);
                        arg1.field310 = var20;
                        arg1.field312 = var11 >> 8;
                        arg1.field313 = var11 & 255;
                        arg1.field311 = 150;
                        if (var12 > 1) {
                            this.method380(-823, 1, arg1.field356, var20);
                        } else {
                            this.method380(-823, 2, arg1.field356, var20);
                        }
                    } catch (Exception var23) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg0.field612 = var13 + var14;
        }
        if ((arg4 & 256) == 256) {
            arg1.field330 = arg0.method211();
            int var22 = arg0.method214();
            arg1.field334 = var22 >> 16;
            arg1.field333 = (var22 & 65535) + field1354;
            arg1.field331 = 0;
            arg1.field332 = 0;
            if (arg1.field333 > field1354) {
                arg1.field331 = -1;
            }
            if (arg1.field330 == 65535) {
                arg1.field330 = -1;
            }
        }
        if ((arg4 & 512) == 512) {
            arg1.field335 = arg0.method209();
            arg1.field337 = arg0.method209();
            arg1.field336 = arg0.method209();
            arg1.field338 = arg0.method209();
            arg1.field339 = arg0.method211() + field1354;
            arg1.field340 = arg0.method211() + field1354;
            arg1.field341 = arg0.method209();
            arg1.field345 = 0;
            arg1.field346[0] = arg1.field336;
            arg1.field347[0] = arg1.field338;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public final String method414(boolean arg0, int arg1) {
        if (arg0) {
            this.field1168 = -1;
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public final void method13(int arg0, String arg1, int arg2) {
        this.method444(35);
        if (this.field1460 == null) {
            super.method13(arg0, arg1, 0);
        } else {
            this.field1394.method235(735);
            short var4 = 360;
            short var5 = 200;
            if (arg2 != 0) {
                this.field1168 = -1;
            }
            byte var6 = 20;
            this.field1248.method188("RuneScape is loading - please wait...", var5 / 2 - 26 - var6, var4 / 2, field1263, 16777215);
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method150(var7, 712, 34, 9179409, 304, var4 / 2 - 152);
            Pix2D.method150(var7 + 1, 712, 32, 0, 302, var4 / 2 - 151);
            Pix2D.method149(arg0 * 3, 30, 9179409, var7 + 2, (byte) -37, var4 / 2 - 150);
            Pix2D.method149(300 - arg0 * 3, 30, 0, var7 + 2, (byte) -37, arg0 * 3 + (var4 / 2 - 150));
            this.field1248.method188(arg1, var5 / 2 + 5 - var6, var4 / 2, field1263, 16777215);
            this.field1394.method236(214, 186, super.field11, (byte) 5);
            if (this.field1489) {
                this.field1489 = false;
                if (!this.field1272) {
                    this.field1395.method236(0, 0, super.field11, (byte) 5);
                    this.field1396.method236(661, 0, super.field11, (byte) 5);
                }
                this.field1392.method236(128, 0, super.field11, (byte) 5);
                this.field1393.method236(214, 386, super.field11, (byte) 5);
                this.field1397.method236(0, 265, super.field11, (byte) 5);
                this.field1398.method236(574, 265, super.field11, (byte) 5);
                this.field1399.method236(128, 186, super.field11, (byte) 5);
                this.field1400.method236(574, 186, super.field11, (byte) 5);
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method415(int arg0) {
        LocType.field820.method104();
        LocType.field821.method104();
        NpcType.field850.method104();
        ObjType.field892.method104();
        ObjType.field893.method104();
        PlayerEntity.field376.method104();
        SpotAnimType.field1027.method104();
        if (arg0 < 4 || arg0 > 4) {
            this.field1168 = this.field1119.method209();
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method416(int arg0) {
        if (this.field1214 == null) {
            this.method393(0);
            super.field12 = null;
            this.field1392 = null;
            this.field1393 = null;
            this.field1394 = null;
            this.field1395 = null;
            this.field1396 = null;
            this.field1397 = null;
            this.field1398 = null;
            this.field1399 = null;
            this.field1400 = null;
            this.field1214 = new PixMap(929, 479, 96, this.method11(101));
            this.field1212 = new PixMap(929, 168, 160, this.method11(101));
            Pix2D.method148(false);
            this.field1104.method186(0, 0, -141);
            this.field1211 = new PixMap(929, 190, 261, this.method11(101));
            if (arg0 >= 0) {
                field1434 = !field1434;
            }
            this.field1213 = new PixMap(929, 512, 334, this.method11(101));
            Pix2D.method148(false);
            this.field1231 = new PixMap(929, 501, 61, this.method11(101));
            this.field1232 = new PixMap(929, 288, 40, this.method11(101));
            this.field1233 = new PixMap(929, 269, 66, this.method11(101));
            this.field1489 = true;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method417(byte arg0) {
        if (arg0 != 70) {
            field1372 = this.field1310.method246();
        }
        for (int var2 = 0; var2 < this.field1318; ++var2) {
            int var3 = this.field1319[var2];
            NpcEntity var4 = this.field1317[var3];
            if (var4 != null) {
                this.method418(var4.field352.field831, var4, (byte) 6);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILx;B)V")
    public final void method418(int arg0, PathingEntity arg1, byte arg2) {
        if (arg1.field298 < 128 || arg1.field299 < 128 || arg1.field298 >= 13184 || arg1.field299 >= 13184) {
            arg1.field325 = -1;
            arg1.field330 = -1;
            arg1.field339 = 0;
            arg1.field340 = 0;
            arg1.field298 = arg1.field346[0] * 128 + arg1.field302 * 64;
            arg1.field299 = arg1.field347[0] * 128 + arg1.field302 * 64;
            arg1.field345 = 0;
        }
        if (this.field1464 == arg1 && (arg1.field298 < 1536 || arg1.field299 < 1536 || arg1.field298 >= 11776 || arg1.field299 >= 11776)) {
            arg1.field325 = -1;
            arg1.field330 = -1;
            arg1.field339 = 0;
            arg1.field340 = 0;
            arg1.field298 = arg1.field346[0] * 128 + arg1.field302 * 64;
            arg1.field299 = arg1.field347[0] * 128 + arg1.field302 * 64;
            arg1.field345 = 0;
        }
        if (arg1.field339 > field1354) {
            this.method419(true, arg1);
        } else if (arg1.field340 >= field1354) {
            this.method420(this.field1292, arg1);
        } else {
            this.method421(arg1, (byte) 2);
        }
        this.method422(arg1, 21710);
        this.method423(true, arg1);
        if (arg2 != 6) {
            this.field1451.method199(39);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLx;)V")
    public final void method419(boolean arg0, PathingEntity arg1) {
        int var3 = arg1.field339 - field1354;
        int var4 = arg1.field335 * 128 + arg1.field302 * 64;
        int var5 = arg1.field337 * 128 + arg1.field302 * 64;
        arg1.field298 += (var4 - arg1.field298) / var3;
        arg1.field299 += (var5 - arg1.field299) / var3;
        arg1.field349 = 0;
        this.field1483 &= arg0;
        if (arg1.field341 == 0) {
            arg1.field344 = 1024;
        }
        if (arg1.field341 == 1) {
            arg1.field344 = 1536;
        }
        if (arg1.field341 == 2) {
            arg1.field344 = 0;
        }
        if (arg1.field341 == 3) {
            arg1.field344 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILx;)V")
    public final void method420(int arg0, PathingEntity arg1) {
        int var3 = 48 / arg0;
        if (field1354 == arg1.field340 || arg1.field325 == -1 || arg1.field328 != 0 || arg1.field327 + 1 > SeqType.field999[arg1.field325].field1003[arg1.field326]) {
            int var4 = arg1.field340 - arg1.field339;
            int var5 = field1354 - arg1.field339;
            int var6 = arg1.field335 * 128 + arg1.field302 * 64;
            int var7 = arg1.field337 * 128 + arg1.field302 * 64;
            int var8 = arg1.field336 * 128 + arg1.field302 * 64;
            int var9 = arg1.field338 * 128 + arg1.field302 * 64;
            arg1.field298 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg1.field299 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg1.field349 = 0;
        if (arg1.field341 == 0) {
            arg1.field344 = 1024;
        }
        if (arg1.field341 == 1) {
            arg1.field344 = 1536;
        }
        if (arg1.field341 == 2) {
            arg1.field344 = 0;
        }
        if (arg1.field341 == 3) {
            arg1.field344 = 512;
        }
        arg1.field300 = arg1.field344;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lx;B)V")
    public final void method421(PathingEntity arg0, byte arg1) {
        arg0.field322 = arg0.field303;
        if (arg0.field345 == 0) {
            arg0.field349 = 0;
        } else {
            if (arg0.field325 != -1 && arg0.field328 == 0) {
                SeqType var3 = SeqType.field999[arg0.field325];
                if (var3.field1005 == null) {
                    ++arg0.field349;
                    return;
                }
            }
            int var4 = arg0.field298;
            int var5 = arg0.field299;
            if (arg1 == 2) {
                boolean var6 = false;
            } else {
                this.field1322 = null;
            }
            int var7 = arg0.field346[arg0.field345 - 1] * 128 + arg0.field302 * 64;
            int var8 = arg0.field347[arg0.field345 - 1] * 128 + arg0.field302 * 64;
            if (var7 - var4 <= 256 && var7 - var4 >= -256 && var8 - var5 <= 256 && var8 - var5 >= -256) {
                if (var4 < var7) {
                    if (var5 < var8) {
                        arg0.field344 = 1280;
                    } else if (var5 > var8) {
                        arg0.field344 = 1792;
                    } else {
                        arg0.field344 = 1536;
                    }
                } else if (var4 > var7) {
                    if (var5 < var8) {
                        arg0.field344 = 768;
                    } else if (var5 > var8) {
                        arg0.field344 = 256;
                    } else {
                        arg0.field344 = 512;
                    }
                } else if (var5 < var8) {
                    arg0.field344 = 1024;
                } else {
                    arg0.field344 = 0;
                }
                int var9 = arg0.field344 - arg0.field300 & 2047;
                if (var9 > 1024) {
                    var9 -= 2048;
                }
                int var10 = arg0.field306;
                if (var9 >= -256 && var9 <= 256) {
                    var10 = arg0.field305;
                } else if (var9 >= 256 && var9 < 768) {
                    var10 = arg0.field308;
                } else if (var9 >= -768 && var9 <= -256) {
                    var10 = arg0.field307;
                }
                if (var10 == -1) {
                    var10 = arg0.field305;
                }
                arg0.field322 = var10;
                int var11 = 4;
                if (arg0.field344 != arg0.field300 && arg0.field319 == -1) {
                    var11 = 2;
                }
                if (arg0.field345 > 2) {
                    var11 = 6;
                }
                if (arg0.field345 > 3) {
                    var11 = 8;
                }
                if (arg0.field349 > 0 && arg0.field345 > 1) {
                    var11 = 8;
                    --arg0.field349;
                }
                if (arg0.field348[arg0.field345 - 1]) {
                    var11 <<= 1;
                }
                if (var11 >= 8 && arg0.field322 == arg0.field305 && arg0.field309 != -1) {
                    arg0.field322 = arg0.field309;
                }
                if (var4 < var7) {
                    arg0.field298 += var11;
                    if (arg0.field298 > var7) {
                        arg0.field298 = var7;
                    }
                } else if (var4 > var7) {
                    arg0.field298 -= var11;
                    if (arg0.field298 < var7) {
                        arg0.field298 = var7;
                    }
                }
                if (var5 < var8) {
                    arg0.field299 += var11;
                    if (arg0.field299 > var8) {
                        arg0.field299 = var8;
                    }
                } else if (var5 > var8) {
                    arg0.field299 -= var11;
                    if (arg0.field299 < var8) {
                        arg0.field299 = var8;
                    }
                }
                if (arg0.field298 == var7 && arg0.field299 == var8) {
                    --arg0.field345;
                }
            } else {
                arg0.field298 = var7;
                arg0.field299 = var8;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lx;I)V")
    public final void method422(PathingEntity arg0, int arg1) {
        if (this.field1148 == arg1) {
            if (arg0.field319 != -1 && arg0.field319 < 32768) {
                NpcEntity var3 = this.field1317[arg0.field319];
                if (var3 != null) {
                    int var4 = arg0.field298 - var3.field298;
                    int var5 = arg0.field299 - var3.field299;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field344 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field319 >= 32768) {
                int var6 = arg0.field319 - 32768;
                if (this.field1094 == var6) {
                    var6 = this.field1342;
                }
                PlayerEntity var7 = this.field1343[var6];
                if (var7 != null) {
                    int var8 = arg0.field298 - var7.field298;
                    int var9 = arg0.field299 - var7.field299;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field344 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field320 != 0 || arg0.field321 != 0) && (arg0.field345 == 0 || arg0.field349 > 0)) {
                int var10 = arg0.field298 - (arg0.field320 - this.field1473 - this.field1473) * 64;
                int var11 = arg0.field299 - (arg0.field321 - this.field1474 - this.field1474) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field344 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field320 = 0;
                arg0.field321 = 0;
            }
            int var12 = arg0.field344 - arg0.field300 & 2047;
            if (var12 != 0) {
                if (var12 >= 32 && var12 <= 2016) {
                    if (var12 > 1024) {
                        arg0.field300 -= 32;
                    } else {
                        arg0.field300 += 32;
                    }
                } else {
                    arg0.field300 = arg0.field344;
                }
                arg0.field300 &= 2047;
                if (arg0.field322 == arg0.field303 && arg0.field344 != arg0.field300) {
                    if (arg0.field304 != -1) {
                        arg0.field322 = arg0.field304;
                        return;
                    }
                    arg0.field322 = arg0.field305;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZLx;)V")
    public final void method423(boolean arg0, PathingEntity arg1) {
        if (!arg0) {
            this.field1168 = -1;
        }
        arg1.field301 = false;
        if (arg1.field322 != -1) {
            SeqType var3 = SeqType.field999[arg1.field322];
            ++arg1.field324;
            if (arg1.field323 < var3.field1000 && arg1.field324 > var3.field1003[arg1.field323]) {
                arg1.field324 = 0;
                ++arg1.field323;
            }
            if (arg1.field323 >= var3.field1000) {
                arg1.field324 = 0;
                arg1.field323 = 0;
            }
        }
        if (arg1.field325 != -1 && arg1.field328 == 0) {
            SeqType var4 = SeqType.field999[arg1.field325];
            ++arg1.field327;
            while (arg1.field326 < var4.field1000 && arg1.field327 > var4.field1003[arg1.field326]) {
                arg1.field327 -= var4.field1003[arg1.field326];
                ++arg1.field326;
            }
            if (arg1.field326 >= var4.field1000) {
                arg1.field326 -= var4.field1004;
                ++arg1.field329;
                if (arg1.field329 >= var4.field1010) {
                    arg1.field325 = -1;
                }
                if (arg1.field326 < 0 || arg1.field326 >= var4.field1000) {
                    arg1.field325 = -1;
                }
            }
            arg1.field301 = var4.field1006;
        }
        if (arg1.field328 > 0) {
            --arg1.field328;
        }
        if (arg1.field330 != -1 && field1354 >= arg1.field333) {
            if (arg1.field331 < 0) {
                arg1.field331 = 0;
            }
            SeqType var5 = SpotAnimType.field1015[arg1.field330].field1018;
            ++arg1.field332;
            while (arg1.field331 < var5.field1000 && arg1.field332 > var5.field1003[arg1.field331]) {
                arg1.field332 -= var5.field1003[arg1.field331];
                ++arg1.field331;
            }
            if (arg1.field331 >= var5.field1000) {
                if (arg1.field331 < 0 || arg1.field331 >= var5.field1000) {
                    arg1.field330 = -1;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method424(int arg0) {
        if (arg0 != 4833) {
            this.field1168 = this.field1119.method209();
        }
        if (this.field1489) {
            this.field1489 = false;
            this.field1219.method236(0, 11, super.field11, (byte) 5);
            this.field1220.method236(0, 375, super.field11, (byte) 5);
            this.field1221.method236(729, 5, super.field11, (byte) 5);
            this.field1222.method236(752, 231, super.field11, (byte) 5);
            this.field1223.method236(0, 0, super.field11, (byte) 5);
            this.field1224.method236(561, 0, super.field11, (byte) 5);
            this.field1225.method236(520, 11, super.field11, (byte) 5);
            this.field1226.method236(520, 231, super.field11, (byte) 5);
            this.field1227.method236(501, 375, super.field11, (byte) 5);
            this.field1228.method236(0, 345, super.field11, (byte) 5);
            this.field1092 = true;
            this.field1176 = true;
            this.field1285 = true;
            this.field1101 = true;
            if (this.field1277 != 2) {
                this.field1213.method236(8, 11, super.field11, (byte) 5);
                this.field1212.method236(561, 5, super.field11, (byte) 5);
            }
        }
        if (this.field1277 == 2) {
            this.method375(236);
        }
        if (this.field1383 && this.field1190 == 1) {
            this.field1092 = true;
        }
        if (this.field1386 != -1) {
            boolean var2 = this.method396(this.field1271, false, this.field1386);
            if (var2) {
                this.field1092 = true;
            }
        }
        if (this.field1291 == 2) {
            this.field1092 = true;
        }
        if (this.field1300 == 2) {
            this.field1092 = true;
        }
        if (this.field1092) {
            this.method392(true);
            this.field1092 = false;
        }
        if (this.field1294 == -1) {
            this.field1208.field952 = this.field1387 - this.field1179 - 77;
            if (super.field18 > 453 && super.field18 < 565 && super.field19 > 350) {
                this.method364(this.field1387, super.field18 - 22, super.field19 - 375, 8, 463, false, 77, 0, this.field1208);
            }
            int var3 = this.field1387 - 77 - this.field1208.field952;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1387 - 77) {
                var3 = this.field1387 - 77;
            }
            if (this.field1179 != var3) {
                this.field1179 = var3;
                this.field1176 = true;
            }
            ++field1082;
            if (field1082 > 87) {
                field1082 = 0;
                this.field1451.method198(true, 225);
            }
        }
        if (this.field1294 != -1) {
            boolean var4 = this.method396(this.field1271, false, this.field1294);
            if (var4) {
                this.field1176 = true;
            }
        }
        if (this.field1291 == 3) {
            this.field1176 = true;
        }
        if (this.field1300 == 3) {
            this.field1176 = true;
        }
        if (this.field1362 != null) {
            this.field1176 = true;
        }
        if (this.field1383 && this.field1190 == 2) {
            this.field1176 = true;
        }
        if (this.field1176) {
            this.method430(419);
            this.field1176 = false;
        }
        if (this.field1277 == 2) {
            this.method453(false);
            this.field1212.method236(561, 5, super.field11, (byte) 5);
        }
        if (this.field1268 != -1) {
            this.field1285 = true;
        }
        if (this.field1285) {
            if (this.field1268 != -1 && this.field1427 == this.field1268) {
                this.field1268 = -1;
                this.field1451.method198(true, 50);
                this.field1451.method199(this.field1427);
            }
            this.field1285 = false;
            this.field1233.method235(735);
            this.field1309.method186(0, 0, -141);
            if (this.field1386 == -1) {
                if (this.field1111[this.field1427] != -1) {
                    if (this.field1427 == 0) {
                        this.field1151.method186(29, 30, -141);
                    }
                    if (this.field1427 == 1) {
                        this.field1152.method186(59, 29, -141);
                    }
                    if (this.field1427 == 2) {
                        this.field1152.method186(87, 29, -141);
                    }
                    if (this.field1427 == 3) {
                        this.field1153.method186(115, 29, -141);
                    }
                    if (this.field1427 == 4) {
                        this.field1155.method186(156, 29, -141);
                    }
                    if (this.field1427 == 5) {
                        this.field1155.method186(184, 29, -141);
                    }
                    if (this.field1427 == 6) {
                        this.field1154.method186(212, 30, -141);
                    }
                }
                if (this.field1111[0] != -1 && (this.field1268 != 0 || field1354 % 20 < 10)) {
                    this.field1270[0].method186(35, 34, -141);
                }
                if (this.field1111[1] != -1 && (this.field1268 != 1 || field1354 % 20 < 10)) {
                    this.field1270[1].method186(59, 32, -141);
                }
                if (this.field1111[2] != -1 && (this.field1268 != 2 || field1354 % 20 < 10)) {
                    this.field1270[2].method186(86, 32, -141);
                }
                if (this.field1111[3] != -1 && (this.field1268 != 3 || field1354 % 20 < 10)) {
                    this.field1270[3].method186(121, 33, -141);
                }
                if (this.field1111[4] != -1 && (this.field1268 != 4 || field1354 % 20 < 10)) {
                    this.field1270[4].method186(157, 34, -141);
                }
                if (this.field1111[5] != -1 && (this.field1268 != 5 || field1354 % 20 < 10)) {
                    this.field1270[5].method186(185, 32, -141);
                }
                if (this.field1111[6] != -1 && (this.field1268 != 6 || field1354 % 20 < 10)) {
                    this.field1270[6].method186(212, 34, -141);
                }
            }
            this.field1233.method236(520, 165, super.field11, (byte) 5);
            this.field1232.method235(735);
            this.field1308.method186(0, 0, -141);
            if (this.field1386 == -1) {
                if (this.field1111[this.field1427] != -1) {
                    if (this.field1427 == 7) {
                        this.field1236.method186(49, 0, -141);
                    }
                    if (this.field1427 == 8) {
                        this.field1237.method186(81, 0, -141);
                    }
                    if (this.field1427 == 9) {
                        this.field1237.method186(108, 0, -141);
                    }
                    if (this.field1427 == 10) {
                        this.field1238.method186(136, 1, -141);
                    }
                    if (this.field1427 == 11) {
                        this.field1240.method186(178, 0, -141);
                    }
                    if (this.field1427 == 12) {
                        this.field1240.method186(205, 0, -141);
                    }
                    if (this.field1427 == 13) {
                        this.field1239.method186(233, 0, -141);
                    }
                }
                if (this.field1111[8] != -1 && (this.field1268 != 8 || field1354 % 20 < 10)) {
                    this.field1270[7].method186(80, 2, -141);
                }
                if (this.field1111[9] != -1 && (this.field1268 != 9 || field1354 % 20 < 10)) {
                    this.field1270[8].method186(107, 3, -141);
                }
                if (this.field1111[10] != -1 && (this.field1268 != 10 || field1354 % 20 < 10)) {
                    this.field1270[9].method186(142, 4, -141);
                }
                if (this.field1111[11] != -1 && (this.field1268 != 11 || field1354 % 20 < 10)) {
                    this.field1270[10].method186(179, 2, -141);
                }
                if (this.field1111[12] != -1 && (this.field1268 != 12 || field1354 % 20 < 10)) {
                    this.field1270[11].method186(206, 2, -141);
                }
                if (this.field1111[13] != -1 && (this.field1268 != 13 || field1354 % 20 < 10)) {
                    this.field1270[12].method186(230, 2, -141);
                }
            }
            this.field1232.method236(501, 492, super.field11, (byte) 5);
            this.field1213.method235(735);
        }
        if (this.field1101) {
            this.field1101 = false;
            this.field1231.method235(735);
            this.field1307.method186(0, 0, -141);
            this.field1247.method189(this.field1157, "Public chat", 16777215, 57, 33, true);
            if (this.field1470 == 0) {
                this.field1247.method189(this.field1157, "On", 65280, 57, 46, true);
            }
            if (this.field1470 == 1) {
                this.field1247.method189(this.field1157, "Friends", 16776960, 57, 46, true);
            }
            if (this.field1470 == 2) {
                this.field1247.method189(this.field1157, "Off", 16711680, 57, 46, true);
            }
            if (this.field1470 == 3) {
                this.field1247.method189(this.field1157, "Hide", 65535, 57, 46, true);
            }
            this.field1247.method189(this.field1157, "Private chat", 16777215, 186, 33, true);
            if (this.field1117 == 0) {
                this.field1247.method189(this.field1157, "On", 65280, 186, 46, true);
            }
            if (this.field1117 == 1) {
                this.field1247.method189(this.field1157, "Friends", 16776960, 186, 46, true);
            }
            if (this.field1117 == 2) {
                this.field1247.method189(this.field1157, "Off", 16711680, 186, 46, true);
            }
            this.field1247.method189(this.field1157, "Trade/duel", 16777215, 326, 33, true);
            if (this.field1108 == 0) {
                this.field1247.method189(this.field1157, "On", 65280, 326, 46, true);
            }
            if (this.field1108 == 1) {
                this.field1247.method189(this.field1157, "Friends", 16776960, 326, 46, true);
            }
            if (this.field1108 == 2) {
                this.field1247.method189(this.field1157, "Off", 16711680, 326, 46, true);
            }
            this.field1247.method189(this.field1157, "Report abuse", 16777215, 462, 38, true);
            this.field1231.method236(0, 471, super.field11, (byte) 5);
            this.field1213.method235(735);
        }
        this.field1271 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;II)V")
    public final void method425(int arg0, String arg1, int arg2, int arg3) {
        if (arg1 != null) {
            Object var5 = this.field1257;
            synchronized (this.field1257) {
                this.field1366 = arg1;
                this.field1461 = arg3;
                this.field1452 = arg0;
            }
            if (arg2 >= 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 218);
            if (arg0.length != 4) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
            } else {
                field1324 = Integer.parseInt(arg0[0]);
                field1325 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method473((byte) 107);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
                        return;
                    }
                    method428(field1230);
                }
                if (arg0[3].equals("free")) {
                    field1326 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
                        return;
                    }
                    field1326 = true;
                }
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(-258, 789, 532);
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
                if (super.field14 != null) {
                    return new URL("http://127.0.0.1:" + (field1325 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZZ)V")
    public final void method426(int arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            signlink.midivol = arg0;
            if (arg1) {
                signlink.midi = "voladjust";
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILib;)V")
    public final void method427(int arg0, Pix8 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1080.length; ++var4) {
            this.field1080[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1080[var17] = (int) (Math.random() * 256.0D);
        }
        this.field1167 += arg0;
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field1081[var16] = (this.field1080[var16 - 1] + this.field1080[var16 + 1] + this.field1080[var16 - 128] + this.field1080[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field1080;
            this.field1080 = this.field1081;
            this.field1081 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field585; ++var8) {
                for (int var9 = 0; var9 < arg1.field584; ++var9) {
                    if (arg1.field582[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field586;
                        int var11 = var8 + 16 + arg1.field587;
                        int var12 = (var11 << 7) + var10;
                        this.field1080[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public static final void method428(boolean arg0) {
        if (!arg0) {
            World3D.field218 = false;
            Pix3D.field546 = false;
            field1327 = false;
            World.field34 = false;
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method429(int arg0) {
        for (int var2 = -1; var2 < this.field1344; ++var2) {
            int var4;
            if (var2 == -1) {
                var4 = this.field1342;
            } else {
                var4 = this.field1345[var2];
            }
            PlayerEntity var5 = this.field1343[var4];
            if (var5 != null) {
                this.method418(1, var5, (byte) 6);
            }
        }
        int var3 = 50 / arg0;
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method430(int arg0) {
        this.field1214.method235(735);
        Pix3D.field557 = this.field1077;
        this.field1105.method186(0, 0, -141);
        if (arg0 <= 0) {
            this.field1241 = this.field1310.method246();
        }
        if (this.field1150) {
            this.field1248.method188(this.field1409, 40, 239, field1263, 0);
            this.field1248.method188(this.field1059 + "*", 60, 239, field1263, 128);
        } else if (this.field1070) {
            this.field1248.method188("Enter amount to transfer:", 40, 239, field1263, 0);
            this.field1248.method188(this.field1180 + "*", 60, 239, field1263, 128);
        } else if (this.field1362 != null) {
            this.field1248.method188(this.field1362, 40, 239, field1263, 0);
            this.field1248.method188("Click to continue", 60, 239, field1263, 128);
        } else if (this.field1294 != -1) {
            this.method448(0, 0, 4, 0, Component.field933[this.field1294]);
        } else if (this.field1107 != -1) {
            this.method448(0, 0, 4, 0, Component.field933[this.field1107]);
        } else {
            PixFont var2 = this.field1247;
            int var3 = 0;
            Pix2D.method147(0, 463, 77, true, 0);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1378[var4] != null) {
                    int var5 = this.field1376[var4];
                    int var6 = 70 - var3 * 14 + this.field1179;
                    if (var5 == 0) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(1, 0, 4, this.field1378[var4], var6);
                        }
                        ++var3;
                    }
                    if (var5 == 1) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(1, 16777215, 4, this.field1377[var4] + ":", var6);
                            var2.method191(1, 255, 12 + var2.method190(this.field1377[var4], (byte) 3), this.field1378[var4], var6);
                        }
                        ++var3;
                    }
                    if (var5 == 2 && (this.field1470 == 0 || this.field1470 == 1 && this.method370(34304, this.field1377[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(1, 0, 4, this.field1377[var4] + ":", var6);
                            var2.method191(1, 255, 12 + var2.method190(this.field1377[var4], (byte) 3), this.field1378[var4], var6);
                        }
                        ++var3;
                    }
                    if ((var5 == 3 || var5 == 7) && this.field1129 == 0 && (var5 == 7 || this.field1117 == 0 || this.field1117 == 1 && this.method370(34304, this.field1377[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(1, 0, 4, "From " + this.field1377[var4] + ":", var6);
                            var2.method191(1, 8388608, 12 + var2.method190("From " + this.field1377[var4], (byte) 3), this.field1378[var4], var6);
                        }
                        ++var3;
                    }
                    if (var5 == 4 && (this.field1108 == 0 || this.field1108 == 1 && this.method370(34304, this.field1377[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(1, 8388736, 4, this.field1377[var4] + " " + this.field1378[var4], var6);
                        }
                        ++var3;
                    }
                    if (var5 == 5 && this.field1129 == 0 && this.field1117 < 2) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(1, 8388608, 4, this.field1378[var4], var6);
                        }
                        ++var3;
                    }
                    if (var5 == 6 && this.field1129 == 0 && this.field1117 < 2) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(1, 0, 4, "To " + this.field1377[var4] + ":", var6);
                            var2.method191(1, 8388608, 12 + var2.method190("To " + this.field1377[var4], (byte) 3), this.field1378[var4], var6);
                        }
                        ++var3;
                    }
                    if (var5 == 8 && (this.field1108 == 0 || this.field1108 == 1 && this.method370(34304, this.field1377[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(1, 13350793, 4, this.field1377[var4] + " " + this.field1378[var4], var6);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method146(true);
            this.field1387 = var3 * 14 + 7;
            if (this.field1387 < 78) {
                this.field1387 = 78;
            }
            this.method365(0, 463, 77, this.field1387, 0, this.field1387 - this.field1179 - 77);
            var2.method191(1, 0, 4, JString.method255(false, this.field1123) + ":", 90);
            var2.method191(1, 255, 6 + var2.method190(this.field1123 + ": ", (byte) 3), this.field1416 + "*", 90);
            Pix2D.method151(1, 77, 0, 0, 479);
        }
        if (this.field1383 && this.field1190 == 2) {
            this.method373(true);
        }
        this.field1214.method236(22, 375, super.field11, (byte) 5);
        this.field1213.method235(735);
        Pix3D.field557 = this.field1079;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lhc;B)Z")
    public final boolean method431(Component arg0, byte arg1) {
        int var3 = arg0.field942;
        if (arg1 != 6) {
            this.field1382 = !this.field1382;
        }
        if (var3 >= 1 && var3 <= 200) {
            if (var3 >= 101) {
                var3 -= 101;
            } else {
                --var3;
            }
            this.field1158[this.field1164] = "Remove @whi@" + this.field1328[var3];
            this.field1422[this.field1164] = 804;
            ++this.field1164;
            this.field1158[this.field1164] = "Message @whi@" + this.field1328[var3];
            this.field1422[this.field1164] = 125;
            ++this.field1164;
            return true;
        } else if (var3 >= 401 && var3 <= 500) {
            this.field1158[this.field1164] = "Remove @whi@" + arg0.field972;
            this.field1422[this.field1164] = 521;
            ++this.field1164;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)Z")
    public final boolean method432(int arg0, byte arg1) {
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field1422[arg0];
            if (arg1 != -15) {
                this.field1125 = -341;
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 447;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method433(boolean arg0, int arg1) {
        if (arg0) {
            this.method6();
        }
        if (!field1327) {
            if (Pix3D.field565[17] >= arg1) {
                Pix8 var3 = Pix3D.field559[17];
                int var4 = var3.field585 * var3.field584 - 1;
                int var5 = this.field1271 * var3.field584 * 2;
                byte[] var6 = var3.field582;
                byte[] var7 = this.field1072;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field582 = var7;
                this.field1072 = var6;
                Pix3D.method160(259, 17);
            }
            if (Pix3D.field565[24] >= arg1) {
                Pix8 var9 = Pix3D.field559[24];
                int var10 = var9.field585 * var9.field584 - 1;
                int var11 = this.field1271 * var9.field584 * 2;
                byte[] var12 = var9.field582;
                byte[] var13 = this.field1072;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field582 = var13;
                this.field1072 = var12;
                Pix3D.method160(259, 24);
                return;
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

    @OriginalMember(owner = "client", name = "c", descriptor = "(Lkb;II)V")
    private final void method434(Packet arg0, int arg1, int arg2) {
        arg0.method219(33724);
        int var4 = arg0.method220(false, 1);
        if (arg2 >= 3 && arg2 <= 3) {
            if (var4 != 0) {
                int var5 = arg0.method220(false, 2);
                if (var5 == 0) {
                    this.field1347[this.field1346++] = this.field1342;
                } else if (var5 == 1) {
                    int var6 = arg0.method220(false, 3);
                    this.field1464.method110(42815, false, var6);
                    int var7 = arg0.method220(false, 1);
                    if (var7 == 1) {
                        this.field1347[this.field1346++] = this.field1342;
                    }
                } else if (var5 == 2) {
                    int var8 = arg0.method220(false, 3);
                    this.field1464.method110(42815, true, var8);
                    int var9 = arg0.method220(false, 3);
                    this.field1464.method110(42815, true, var9);
                    int var10 = arg0.method220(false, 1);
                    if (var10 == 1) {
                        this.field1347[this.field1346++] = this.field1342;
                    }
                } else if (var5 == 3) {
                    this.field1333 = arg0.method220(false, 2);
                    int var11 = arg0.method220(false, 7);
                    int var12 = arg0.method220(false, 7);
                    int var13 = arg0.method220(false, 1);
                    this.field1464.method109(698, var11, var12, var13 == 1);
                    int var14 = arg0.method220(false, 1);
                    if (var14 == 1) {
                        this.field1347[this.field1346++] = this.field1342;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)V")
    public final void method435(int arg0, int arg1, int arg2) {
        if (arg0 <= 0) {
            field1230 = !field1230;
        }
        if (this.field1129 != 0) {
            int var4 = 0;
            if (this.field1202 != 0) {
                var4 = 1;
            }
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field1378[var5] != null) {
                    int var6 = this.field1376[var5];
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field1117 == 0 || this.field1117 == 1 && this.method370(34304, this.field1377[var5]))) {
                        int var7 = 329 - var4 * 13;
                        if (super.field18 > 8 && super.field18 < 520 && arg1 - 11 > var7 - 10 && arg1 - 11 <= var7 + 3) {
                            if (this.field1090) {
                                this.field1158[this.field1164] = "Report abuse @whi@" + this.field1377[var5];
                                this.field1422[this.field1164] = 2316;
                                ++this.field1164;
                            }
                            this.field1158[this.field1164] = "Add ignore @whi@" + this.field1377[var5];
                            this.field1422[this.field1164] = 2158;
                            ++this.field1164;
                            this.field1158[this.field1164] = "Add friend @whi@" + this.field1377[var5];
                            this.field1422[this.field1164] = 2447;
                            ++this.field1164;
                        }
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                    if ((var6 == 5 || var6 == 6) && this.field1117 < 2) {
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1324 = Integer.parseInt(this.getParameter("nodeid"));
        field1325 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method473((byte) 107);
        } else {
            method428(field1230);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1326 = false;
        } else {
            field1326 = true;
        }
        this.method2(532, 789, -10157);
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method436(int arg0, int arg1) {
        if (arg1 >= 0) {
            if (this.field1070) {
                this.field1070 = false;
                this.field1176 = true;
            }
            int var3 = this.field1420[arg1];
            int var4 = this.field1421[arg1];
            int var5 = this.field1422[arg1];
            int var6 = this.field1423[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 988 || var5 == 345 || var5 == 249 || var5 == 960 || var5 == 40) {
                NpcEntity var7 = this.field1317[var6];
                if (var7 != null) {
                    this.method474(1, var7.field347[0], this.field1464.field347[0], 2, 0, 737, this.field1464.field346[0], 0, var7.field346[0], false, 0, 1);
                    this.field1215 = super.field21;
                    this.field1216 = super.field22;
                    this.field1218 = 2;
                    this.field1217 = 0;
                    if (var5 == 960) {
                        this.field1451.method198(true, 114);
                    }
                    if (var5 == 249) {
                        this.field1451.method198(true, 89);
                    }
                    if (var5 == 40) {
                        this.field1451.method198(true, 198);
                    }
                    if (var5 == 345) {
                        field1304 += var6;
                        if (field1304 >= 116) {
                            this.field1451.method198(true, 217);
                        }
                        this.field1451.method198(true, 191);
                    }
                    if (var5 == 988) {
                        this.field1451.method198(true, 236);
                    }
                    this.field1451.method200(var6);
                }
            }
            if (var5 == 73 && !this.field1251) {
                this.field1451.method198(true, 218);
                this.field1451.method200(var4);
                this.field1251 = true;
            }
            if (var5 == 316) {
                String var8 = this.field1158[arg1];
                int var9 = var8.indexOf("@whi@");
                if (var9 != -1) {
                    this.method378(954);
                    this.field1084 = var8.substring(var9 + 5).trim();
                    this.field1391 = false;
                    for (int var10 = 0; var10 < Component.field933.length; ++var10) {
                        if (Component.field933[var10] != null && Component.field933[var10].field942 == 600) {
                            this.field1181 = this.field1142 = Component.field933[var10].field939;
                            break;
                        }
                    }
                }
            }
            if (var5 == 543) {
                boolean var11 = this.method474(0, var4, this.field1464.field347[0], 2, 0, 737, this.field1464.field346[0], 0, var3, false, 0, 0);
                if (!var11) {
                    this.method474(1, var4, this.field1464.field347[0], 2, 0, 737, this.field1464.field346[0], 0, var3, false, 0, 1);
                }
                this.field1215 = super.field21;
                this.field1216 = super.field22;
                this.field1218 = 2;
                this.field1217 = 0;
                this.field1451.method198(true, 241);
                this.field1451.method200(this.field1473 + var3);
                this.field1451.method200(this.field1474 + var4);
                this.field1451.method200(var6);
                this.field1451.method200(this.field1466);
            }
            if (var5 == 798) {
                ++field1472;
                if (field1472 >= 135) {
                    this.field1451.method198(true, 253);
                    this.field1451.method200(10151);
                }
                this.method445(207, true, var3, var4, var6);
            }
            if (var5 == 1308) {
                ObjType var13 = ObjType.method287(var6);
                String var14;
                if (var13.field862 != null) {
                    var14 = new String(var13.field862);
                } else {
                    var14 = "It's a " + var13.field861 + ".";
                }
                this.method380(-823, 0, "", var14);
            }
            if (var5 == 357) {
                this.field1455 = 1;
                this.field1456 = var3;
                this.field1457 = var4;
                this.field1458 = var6;
                this.field1459 = ObjType.method287(var6).field861;
                this.field1465 = 0;
            } else {
                if (var5 == 309) {
                    this.method378(954);
                }
                if (var5 == 1418) {
                    int var15 = var6 >> 14 & 32767;
                    LocType var16 = LocType.method275(var15);
                    String var17;
                    if (var16.field791 != null) {
                        var17 = new String(var16.field791);
                    } else {
                        var17 = "It's a " + var16.field790 + ".";
                    }
                    this.method380(-823, 0, "", var17);
                }
                if (var5 == 871 || var5 == 526 || var5 == 156 || var5 == 120 || var5 == 796) {
                    if (var5 == 526) {
                        this.field1451.method198(true, 0);
                    }
                    if (var5 == 120) {
                        this.field1451.method198(true, 112);
                    }
                    if (var5 == 871) {
                        field1340 += var6;
                        if (field1340 >= 76) {
                            this.field1451.method198(true, 214);
                            this.field1451.method199(171);
                        }
                        this.field1451.method198(true, 140);
                    }
                    if (var5 == 156) {
                        ++field1332;
                        if (field1332 >= 62) {
                            this.field1451.method198(true, 82);
                            this.field1451.method199(142);
                        }
                        this.field1451.method198(true, 155);
                    }
                    if (var5 == 796) {
                        if ((var6 & 3) == 0) {
                            ++field1229;
                        }
                        if (field1229 >= 124) {
                            this.field1451.method198(true, 167);
                            this.field1451.method203(0);
                        }
                        this.field1451.method198(true, 122);
                    }
                    this.field1451.method200(var6);
                    this.field1451.method200(var3);
                    this.field1451.method200(var4);
                    this.field1288 = 0;
                    this.field1289 = var4;
                    this.field1290 = var3;
                    this.field1291 = 2;
                    if (Component.field933[var4].field939 == this.field1142) {
                        this.field1291 = 1;
                    }
                    if (Component.field933[var4].field939 == this.field1294) {
                        this.field1291 = 3;
                    }
                }
                if (var5 == 203) {
                    boolean var18 = this.method474(0, var4, this.field1464.field347[0], 2, 0, 737, this.field1464.field346[0], 0, var3, false, 0, 0);
                    if (!var18) {
                        this.method474(1, var4, this.field1464.field347[0], 2, 0, 737, this.field1464.field346[0], 0, var3, false, 0, 1);
                    }
                    this.field1215 = super.field21;
                    this.field1216 = super.field22;
                    this.field1218 = 2;
                    this.field1217 = 0;
                    this.field1451.method198(true, 183);
                    this.field1451.method200(this.field1473 + var3);
                    this.field1451.method200(this.field1474 + var4);
                    this.field1451.method200(var6);
                    this.field1451.method200(this.field1458);
                    this.field1451.method200(this.field1456);
                    this.field1451.method200(this.field1457);
                }
                if (var5 == 873) {
                    this.method445(196, true, var3, var4, var6);
                }
                if (var5 == 48) {
                    PlayerEntity var20 = this.field1343[var6];
                    if (var20 != null) {
                        this.method474(1, var20.field347[0], this.field1464.field347[0], 2, 0, 737, this.field1464.field346[0], 0, var20.field346[0], false, 0, 1);
                        this.field1215 = super.field21;
                        this.field1216 = super.field22;
                        this.field1218 = 2;
                        this.field1217 = 0;
                        this.field1451.method198(true, 39);
                        this.field1451.method200(var6);
                        this.field1451.method200(this.field1466);
                    }
                }
                if (var5 == 829) {
                    field1162 += var4;
                    if (field1162 >= 132) {
                        this.field1451.method198(true, 27);
                        this.field1451.method200(17379);
                    }
                    this.method445(223, true, var3, var4, var6);
                }
                if (var5 == 737 && this.method445(9, true, var3, var4, var6)) {
                    this.field1451.method200(this.field1466);
                }
                if (var5 == 672) {
                    this.field1451.method198(true, 222);
                    this.field1451.method200(var4);
                    Component var21 = Component.field933[var4];
                    if (var21.field947 != null && var21.field947[0][0] == 5) {
                        int var22 = var21.field947[0][1];
                        if (this.field1287[var22] != var21.field949[0]) {
                            this.field1287[var22] = var21.field949[0];
                            this.method457(var22, -31746);
                            this.field1092 = true;
                        }
                    }
                }
                if (var5 == 505 && this.method445(139, true, var3, var4, var6)) {
                    this.field1451.method200(this.field1458);
                    this.field1451.method200(this.field1456);
                    this.field1451.method200(this.field1457);
                }
                if (var5 == 56 || var5 == 321 || var5 == 552 || var5 == 43 || var5 == 687) {
                    boolean var23 = this.method474(0, var4, this.field1464.field347[0], 2, 0, 737, this.field1464.field346[0], 0, var3, false, 0, 0);
                    if (!var23) {
                        this.method474(1, var4, this.field1464.field347[0], 2, 0, 737, this.field1464.field346[0], 0, var3, false, 0, 1);
                    }
                    this.field1215 = super.field21;
                    this.field1216 = super.field22;
                    this.field1218 = 2;
                    this.field1217 = 0;
                    if (var5 == 687) {
                        ++field1083;
                        if (field1083 >= 121) {
                            this.field1451.method198(true, 13);
                            this.field1451.method199(128);
                        }
                        this.field1451.method198(true, 192);
                    }
                    if (var5 == 43) {
                        this.field1451.method198(true, 143);
                    }
                    if (var5 == 321) {
                        this.field1451.method198(true, 48);
                    }
                    if (var5 == 56) {
                        this.field1451.method198(true, 91);
                    }
                    if (var5 == 552) {
                        this.field1451.method198(true, 226);
                    }
                    this.field1451.method200(this.field1473 + var3);
                    this.field1451.method200(this.field1474 + var4);
                    this.field1451.method200(var6);
                }
                if (var5 == 500) {
                    NpcEntity var25 = this.field1317[var6];
                    if (var25 != null) {
                        this.method474(1, var25.field347[0], this.field1464.field347[0], 2, 0, 737, this.field1464.field346[0], 0, var25.field346[0], false, 0, 1);
                        this.field1215 = super.field21;
                        this.field1216 = super.field22;
                        this.field1218 = 2;
                        this.field1217 = 0;
                        this.field1451.method198(true, 244);
                        this.field1451.method200(var6);
                        this.field1451.method200(this.field1466);
                    }
                }
                if (var5 == 706) {
                    Component var26 = Component.field933[var4];
                    boolean var27 = true;
                    if (var26.field942 > 0) {
                        var27 = this.method407(var26, 815);
                    }
                    if (var27) {
                        this.field1451.method198(true, 222);
                        this.field1451.method200(var4);
                    }
                }
                if (var5 == 981) {
                    if (!this.field1383) {
                        this.field1448.method89(super.field22 - 11, true, super.field21 - 8);
                    } else {
                        this.field1448.method89(var4 - 11, true, var3 - 8);
                    }
                }
                if (var5 == 595 || var5 == 835) {
                    String var28 = this.field1158[arg1];
                    int var29 = var28.indexOf("@whi@");
                    if (var29 != -1) {
                        String var30 = var28.substring(var29 + 5).trim();
                        String var31 = JString.method255(false, JString.method252(false, JString.method251(var30)));
                        boolean var32 = false;
                        for (int var33 = 0; var33 < this.field1344; ++var33) {
                            PlayerEntity var34 = this.field1343[this.field1345[var33]];
                            if (var34 != null && var34.field356 != null && var34.field356.equalsIgnoreCase(var31)) {
                                this.method474(1, var34.field347[0], this.field1464.field347[0], 2, 0, 737, this.field1464.field346[0], 0, var34.field346[0], false, 0, 1);
                                if (var5 == 595) {
                                    this.field1451.method198(true, 245);
                                }
                                if (var5 == 835) {
                                    this.field1451.method198(true, 173);
                                }
                                this.field1451.method200(this.field1345[var33]);
                                var32 = true;
                                break;
                            }
                        }
                        if (!var32) {
                            this.method380(-823, 0, "", "Unable to find " + var31);
                        }
                    }
                }
                if (var5 == 104) {
                    this.method445(168, true, var3, var4, var6);
                }
                if (var5 == 125) {
                    String var35 = this.field1158[arg1];
                    int var36 = var35.indexOf("@whi@");
                    if (var36 != -1) {
                        long var37 = JString.method251(var35.substring(var36 + 5).trim());
                        int var39 = -1;
                        for (int var40 = 0; var40 < this.field1243; ++var40) {
                            if (this.field1234[var40] == var37) {
                                var39 = var40;
                                break;
                            }
                        }
                        if (var39 != -1 && this.field1320[var39] > 0) {
                            this.field1176 = true;
                            this.field1070 = false;
                            this.field1150 = true;
                            this.field1059 = "";
                            this.field1204 = 3;
                            this.field1276 = this.field1234[var39];
                            this.field1409 = "Enter message to send to " + this.field1328[var39];
                        }
                    }
                }
                if (var5 == 237) {
                    this.field1451.method198(true, 106);
                    this.field1451.method200(var6);
                    this.field1451.method200(var3);
                    this.field1451.method200(var4);
                    this.field1451.method200(this.field1458);
                    this.field1451.method200(this.field1456);
                    this.field1451.method200(this.field1457);
                    this.field1288 = 0;
                    this.field1289 = var4;
                    this.field1290 = var3;
                    this.field1291 = 2;
                    if (Component.field933[var4].field939 == this.field1142) {
                        this.field1291 = 1;
                    }
                    if (Component.field933[var4].field939 == this.field1294) {
                        this.field1291 = 3;
                    }
                }
                if (var5 == 103) {
                    PlayerEntity var41 = this.field1343[var6];
                    if (var41 != null) {
                        this.method474(1, var41.field347[0], this.field1464.field347[0], 2, 0, 737, this.field1464.field346[0], 0, var41.field346[0], false, 0, 1);
                        this.field1215 = super.field21;
                        this.field1216 = super.field22;
                        this.field1218 = 2;
                        this.field1217 = 0;
                        this.field1451.method198(true, 184);
                        this.field1451.method200(var6);
                        this.field1451.method200(this.field1458);
                        this.field1451.method200(this.field1456);
                        this.field1451.method200(this.field1457);
                    }
                }
                if (var5 == 941) {
                    Component var42 = Component.field933[var4];
                    this.field1465 = 1;
                    this.field1466 = var4;
                    this.field1467 = var42.field988;
                    this.field1455 = 0;
                    String var43 = var42.field986;
                    if (var43.indexOf(" ") != -1) {
                        var43 = var43.substring(0, var43.indexOf(" "));
                    }
                    String var44 = var42.field986;
                    if (var44.indexOf(" ") != -1) {
                        var44 = var44.substring(var44.indexOf(" ") + 1);
                    }
                    this.field1468 = var43 + " " + var42.field987 + " " + var44;
                    if (this.field1467 == 16) {
                        this.field1092 = true;
                        this.field1427 = 3;
                        this.field1285 = true;
                    }
                } else {
                    if (var5 == 493) {
                        NpcEntity var45 = this.field1317[var6];
                        if (var45 != null) {
                            this.method474(1, var45.field347[0], this.field1464.field347[0], 2, 0, 737, this.field1464.field346[0], 0, var45.field346[0], false, 0, 1);
                            this.field1215 = super.field21;
                            this.field1216 = super.field22;
                            this.field1218 = 2;
                            this.field1217 = 0;
                            this.field1451.method198(true, 36);
                            this.field1451.method200(var6);
                            this.field1451.method200(this.field1458);
                            this.field1451.method200(this.field1456);
                            this.field1451.method200(this.field1457);
                        }
                    }
                    if (var5 == 1974) {
                        ObjType var46 = ObjType.method287(var6);
                        String var47;
                        if (var4 >= 100000) {
                            var47 = var4 + " x " + var46.field861;
                        } else if (var46.field862 != null) {
                            var47 = new String(var46.field862);
                        } else {
                            var47 = "It's a " + var46.field861 + ".";
                        }
                        this.method380(-823, 0, "", var47);
                    }
                    if (var5 == 1814) {
                        NpcEntity var48 = this.field1317[var6];
                        if (var48 != null) {
                            String var49;
                            if (var48.field352.field830 != null) {
                                var49 = new String(var48.field352.field830);
                            } else {
                                var49 = "It's a " + var48.field352.field829 + ".";
                            }
                            this.method380(-823, 0, "", var49);
                        }
                    }
                    if (var5 == 1659) {
                        this.method445(181, true, var3, var4, var6);
                    }
                    if (var5 == 134 || var5 == 701 || var5 == 570 || var5 == 719 || var5 == 440) {
                        if (var5 == 440) {
                            this.field1451.method198(true, 31);
                        }
                        if (var5 == 701) {
                            this.field1451.method198(true, 47);
                        }
                        if (var5 == 570) {
                            this.field1451.method198(true, 121);
                        }
                        if (var5 == 719) {
                            this.field1451.method198(true, 186);
                        }
                        if (var5 == 134) {
                            this.field1451.method198(true, 90);
                        }
                        this.field1451.method200(var6);
                        this.field1451.method200(var3);
                        this.field1451.method200(var4);
                        this.field1288 = 0;
                        this.field1289 = var4;
                        this.field1290 = var3;
                        this.field1291 = 2;
                        if (Component.field933[var4].field939 == this.field1142) {
                            this.field1291 = 1;
                        }
                        if (Component.field933[var4].field939 == this.field1294) {
                            this.field1291 = 3;
                        }
                    }
                    if (var5 == 1528 || var5 == 1741 || var5 == 593 || var5 == 1596) {
                        PlayerEntity var50 = this.field1343[var6];
                        if (var50 != null) {
                            this.method474(1, var50.field347[0], this.field1464.field347[0], 2, 0, 737, this.field1464.field346[0], 0, var50.field346[0], false, 0, 1);
                            this.field1215 = super.field21;
                            this.field1216 = super.field22;
                            this.field1218 = 2;
                            this.field1217 = 0;
                            if (var5 == 1528) {
                                this.field1451.method198(true, 245);
                            }
                            if (var5 == 593) {
                                this.field1451.method198(true, 28);
                            }
                            if (var5 == 1596) {
                                this.field1451.method198(true, 173);
                            }
                            if (var5 == 1741) {
                                if ((var6 & 3) == 0) {
                                    ++field1338;
                                }
                                if (field1338 >= 139) {
                                    this.field1451.method198(true, 84);
                                    this.field1451.method203(0);
                                }
                                this.field1451.method198(true, 63);
                            }
                            this.field1451.method200(var6);
                        }
                    }
                    if (var5 == 447 || var5 == 158 || var5 == 804 || var5 == 521) {
                        String var51 = this.field1158[arg1];
                        int var52 = var51.indexOf("@whi@");
                        if (var52 != -1) {
                            long var53 = JString.method251(var51.substring(var52 + 5).trim());
                            if (var5 == 447) {
                                this.method483(var53, this.field1293);
                            }
                            if (var5 == 158) {
                                this.method454((byte) 55, var53);
                            }
                            if (var5 == 804) {
                                this.method440(var53, false);
                            }
                            if (var5 == 521) {
                                this.method389(904, var53);
                            }
                        }
                    }
                    if (var5 == 63) {
                        this.field1451.method198(true, 158);
                        this.field1451.method200(var6);
                        this.field1451.method200(var3);
                        this.field1451.method200(var4);
                        this.field1451.method200(this.field1466);
                        this.field1288 = 0;
                        this.field1289 = var4;
                        this.field1290 = var3;
                        this.field1291 = 2;
                        if (Component.field933[var4].field939 == this.field1142) {
                            this.field1291 = 1;
                        }
                        if (Component.field933[var4].field939 == this.field1294) {
                            this.field1291 = 3;
                        }
                    }
                    if (var5 == 967) {
                        this.field1451.method198(true, 222);
                        this.field1451.method200(var4);
                        Component var55 = Component.field933[var4];
                        if (var55.field947 != null && var55.field947[0][0] == 5) {
                            int var56 = var55.field947[0][1];
                            this.field1287[var56] = 1 - this.field1287[var56];
                            this.method457(var56, -31746);
                            this.field1092 = true;
                        }
                    }
                    this.field1455 = 0;
                    this.field1167 += arg0;
                    this.field1465 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZ)V")
    public final void method437(int arg0, int arg1, boolean arg2) {
        int var4 = 0;
        if (arg2) {
            this.field1322 = null;
        }
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field1378[var5] != null) {
                int var6 = this.field1376[var5];
                int var7 = 70 - var4 * 14 + this.field1179 + 4;
                if (var7 < -20) {
                    break;
                }
                if (var6 == 0) {
                    ++var4;
                }
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1470 == 0 || this.field1470 == 1 && this.method370(34304, this.field1377[var5]))) {
                    if (arg0 > var7 - 14 && arg0 <= var7 && !this.field1377[var5].equals(this.field1464.field356)) {
                        if (this.field1090) {
                            this.field1158[this.field1164] = "Report abuse @whi@" + this.field1377[var5];
                            this.field1422[this.field1164] = 316;
                            ++this.field1164;
                        }
                        this.field1158[this.field1164] = "Add ignore @whi@" + this.field1377[var5];
                        this.field1422[this.field1164] = 158;
                        ++this.field1164;
                        this.field1158[this.field1164] = "Add friend @whi@" + this.field1377[var5];
                        this.field1422[this.field1164] = 447;
                        ++this.field1164;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field1129 == 0 && (var6 == 7 || this.field1117 == 0 || this.field1117 == 1 && this.method370(34304, this.field1377[var5]))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        if (this.field1090) {
                            this.field1158[this.field1164] = "Report abuse @whi@" + this.field1377[var5];
                            this.field1422[this.field1164] = 316;
                            ++this.field1164;
                        }
                        this.field1158[this.field1164] = "Add ignore @whi@" + this.field1377[var5];
                        this.field1422[this.field1164] = 158;
                        ++this.field1164;
                        this.field1158[this.field1164] = "Add friend @whi@" + this.field1377[var5];
                        this.field1422[this.field1164] = 447;
                        ++this.field1164;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field1108 == 0 || this.field1108 == 1 && this.method370(34304, this.field1377[var5]))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field1158[this.field1164] = "Accept trade @whi@" + this.field1377[var5];
                        this.field1422[this.field1164] = 595;
                        ++this.field1164;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field1129 == 0 && this.field1117 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field1108 == 0 || this.field1108 == 1 && this.method370(34304, this.field1377[var5]))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field1158[this.field1164] = "Accept duel @whi@" + this.field1377[var5];
                        this.field1422[this.field1164] = 835;
                        ++this.field1164;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIB)I")
    public final int method438(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = 256 - arg0;
        if (arg3 == 8) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        return ((arg1 & 16711935) * arg0 + (arg2 & 16711935) * var5 & -16711936) + ((arg1 & 65280) * arg0 + (arg2 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method439(int arg0) {
        if (this.field1300 == 0) {
            int var2 = super.field20;
            if (arg0 <= 0) {
                this.field1168 = this.field1119.method209();
            }
            if (this.field1465 == 1 && super.field21 >= 520 && super.field22 >= 165 && super.field21 <= 788 && super.field22 <= 230) {
                var2 = 0;
            }
            if (this.field1383) {
                if (var2 != 1) {
                    int var3 = super.field18;
                    int var4 = super.field19;
                    if (this.field1190 == 0) {
                        var3 -= 8;
                        var4 -= 11;
                    }
                    if (this.field1190 == 1) {
                        var3 -= 562;
                        var4 -= 231;
                    }
                    if (this.field1190 == 2) {
                        var3 -= 22;
                        var4 -= 375;
                    }
                    if (var3 < this.field1191 - 10 || var3 > this.field1193 + this.field1191 + 10 || var4 < this.field1192 - 10 || var4 > this.field1194 + this.field1192 + 10) {
                        this.field1383 = false;
                        if (this.field1190 == 1) {
                            this.field1092 = true;
                        }
                        if (this.field1190 == 2) {
                            this.field1176 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field1191;
                    int var6 = this.field1192;
                    int var7 = this.field1193;
                    int var8 = super.field21;
                    int var9 = super.field22;
                    if (this.field1190 == 0) {
                        var8 -= 8;
                        var9 -= 11;
                    }
                    if (this.field1190 == 1) {
                        var8 -= 562;
                        var9 -= 231;
                    }
                    if (this.field1190 == 2) {
                        var8 -= 22;
                        var9 -= 375;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field1164; ++var11) {
                        int var12 = (this.field1164 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method436(0, var10);
                    }
                    this.field1383 = false;
                    if (this.field1190 == 1) {
                        this.field1092 = true;
                    }
                    if (this.field1190 == 2) {
                        this.field1176 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field1164 > 0) {
                    int var13 = this.field1422[this.field1164 - 1];
                    if (var13 == 134 || var13 == 701 || var13 == 570 || var13 == 719 || var13 == 440 || var13 == 871 || var13 == 526 || var13 == 156 || var13 == 120 || var13 == 796 || var13 == 357) {
                        int var14 = this.field1420[this.field1164 - 1];
                        int var15 = this.field1421[this.field1164 - 1];
                        Component var16 = Component.field933[var15];
                        if (var16.field959) {
                            this.field1417 = false;
                            this.field1255 = 0;
                            this.field1298 = var15;
                            this.field1299 = var14;
                            this.field1300 = 2;
                            this.field1301 = super.field21;
                            this.field1302 = super.field22;
                            if (Component.field933[var15].field939 == this.field1142) {
                                this.field1300 = 1;
                            }
                            if (Component.field933[var15].field939 == this.field1294) {
                                this.field1300 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field1295 == 1 || this.method432(this.field1164 - 1, (byte) -15)) && this.field1164 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field1164 > 0) {
                    this.method436(0, this.field1164 - 1);
                }
                if (var2 != 2 || this.field1164 <= 0) {
                    return;
                }
                this.method458(-4311);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method440(long arg0, boolean arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1243; ++var4) {
                if (this.field1234[var4] == arg0) {
                    --this.field1243;
                    this.field1092 = true;
                    for (int var5 = var4; var5 < this.field1243; ++var5) {
                        this.field1328[var5] = this.field1328[var5 + 1];
                        this.field1320[var5] = this.field1320[var5 + 1];
                        this.field1234[var5] = this.field1234[var5 + 1];
                    }
                    this.field1451.method198(true, 210);
                    this.field1451.method205(arg0, 0);
                    break;
                }
            }
            if (!arg1) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method441(byte arg0) {
        short var2 = 256;
        if (this.field1266 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1266 > 768) {
                    this.field1185[var3] = this.method438(1024 - this.field1266, this.field1187[var3], this.field1186[var3], (byte) 8);
                } else if (this.field1266 > 256) {
                    this.field1185[var3] = this.field1187[var3];
                } else {
                    this.field1185[var3] = this.method438(256 - this.field1266, this.field1186[var3], this.field1187[var3], (byte) 8);
                }
            }
        } else if (this.field1267 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1267 > 768) {
                    this.field1185[var4] = this.method438(1024 - this.field1267, this.field1188[var4], this.field1186[var4], (byte) 8);
                } else if (this.field1267 > 256) {
                    this.field1185[var4] = this.field1188[var4];
                } else {
                    this.field1185[var4] = this.method438(256 - this.field1267, this.field1186[var4], this.field1188[var4], (byte) 8);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1185[var5] = this.field1186[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1395.field658[var6] = this.field1206.field572[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1183[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1418[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1185[var26];
                    int var30 = this.field1395.field658[var8];
                    this.field1395.field658[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        if (arg0 != 98) {
            this.field1451.method199(67);
        }
        this.field1395.method236(0, 0, super.field11, (byte) 5);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1396.field658[var10] = this.field1207.field572[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1183[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1418[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1185[var18];
                    int var22 = this.field1396.field658[var16];
                    this.field1396.field658[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field1396.method236(661, 0, super.field11, (byte) 5);
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method442(int arg0) {
        if (arg0 != 865) {
            field1174 = this.field1310.method246();
        }
        this.method385(false);
        if (this.field1218 == 1) {
            this.field1381[this.field1217 / 100].method173(this.field1215 - 8 - 8, this.field1216 - 8 - 11, -141);
        }
        if (this.field1218 == 2) {
            this.field1381[this.field1217 / 100 + 4].method173(this.field1215 - 8 - 8, this.field1216 - 8 - 11, -141);
            ++field1363;
            if (field1363 > 161) {
                field1363 = 0;
                this.field1451.method198(true, 128);
                this.field1451.method200(9331);
            }
        }
        if (this.field1142 != -1) {
            this.method396(this.field1271, false, this.field1142);
            this.method448(0, 0, 4, 0, Component.field933[this.field1142]);
        }
        this.method446(-901);
        if (!this.field1383) {
            this.method443(4);
            this.method368(4);
        } else if (this.field1190 == 0) {
            this.method373(true);
        }
        if (this.field1235 == 1) {
            if (this.field1172 <= 0 && this.field1113 != 1) {
                this.field1130[1].method173(472, 296, -141);
            } else {
                this.field1130[1].method173(472, 258, -141);
            }
        }
        if (this.field1172 > 0) {
            this.field1130[0].method173(472, 296, -141);
            this.field1247.method188("Level: " + this.field1172, 329, 484, field1263, 16776960);
        }
        if (this.field1113 == 1) {
            this.field1130[6].method173(472, 296, -141);
            this.field1247.method188("Arena", 329, 484, field1263, 16776960);
        }
        if (this.field1202 != 0) {
            int var2 = this.field1202 / 50;
            int var3 = var2 / 60;
            int var4 = var2 % 60;
            if (var4 < 10) {
                this.field1247.method191(1, 16776960, 4, "System update in: " + var3 + ":0" + var4, 329);
            } else {
                this.field1247.method191(1, 16776960, 4, "System update in: " + var3 + ":" + var4, 329);
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method443(int arg0) {
        if (this.field1300 == 0) {
            this.field1158[0] = "Cancel";
            this.field1422[0] = 1333;
            this.field1164 = 1;
            this.method435(565, super.field19, super.field18);
            this.field1374 = 0;
            if (super.field18 > 8 && super.field19 > 11 && super.field18 < 520 && super.field19 < 345) {
                if (this.field1142 != -1) {
                    this.method377(224, 0, Component.field933[this.field1142], super.field18, 8, super.field19, 11);
                } else {
                    this.method471(67);
                }
            }
            if (this.field1374 != this.field1058) {
                this.field1058 = this.field1374;
            }
            this.field1374 = 0;
            if (super.field18 > 562 && super.field19 > 231 && super.field18 < 752 && super.field19 < 492) {
                if (this.field1386 != -1) {
                    this.method377(224, 0, Component.field933[this.field1386], super.field18, 562, super.field19, 231);
                } else if (this.field1111[this.field1427] != -1) {
                    this.method377(224, 0, Component.field933[this.field1111[this.field1427]], super.field18, 562, super.field19, 231);
                }
            }
            if (this.field1374 != this.field1256) {
                this.field1092 = true;
                this.field1256 = this.field1374;
            }
            this.field1374 = 0;
            if (super.field18 > 22 && super.field19 > 375 && super.field18 < 431 && super.field19 < 471) {
                if (this.field1294 != -1) {
                    this.method377(224, 0, Component.field933[this.field1294], super.field18, 22, super.field19, 375);
                } else {
                    this.method437(super.field19 - 375, super.field18 - 22, this.field1173);
                }
            }
            if (this.field1294 != -1 && this.field1388 != this.field1374) {
                this.field1176 = true;
                this.field1388 = this.field1374;
            }
            boolean var2 = false;
            if (arg0 != 4) {
                this.field1173 = !this.field1173;
            }
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field1164 - 1; ++var3) {
                    if (this.field1422[var3] < 1000 && this.field1422[var3 + 1] > 1000) {
                        String var4 = this.field1158[var3];
                        this.field1158[var3] = this.field1158[var3 + 1];
                        this.field1158[var3 + 1] = var4;
                        int var5 = this.field1422[var3];
                        this.field1422[var3] = this.field1422[var3 + 1];
                        this.field1422[var3 + 1] = var5;
                        int var6 = this.field1420[var3];
                        this.field1420[var3] = this.field1420[var3 + 1];
                        this.field1420[var3 + 1] = var6;
                        int var7 = this.field1421[var3];
                        this.field1421[var3] = this.field1421[var3 + 1];
                        this.field1421[var3 + 1] = var7;
                        int var8 = this.field1423[var3];
                        this.field1423[var3] = this.field1423[var3 + 1];
                        this.field1423[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method444(int arg0) {
        if (this.field1392 == null) {
            super.field12 = null;
            this.field1214 = null;
            this.field1212 = null;
            this.field1211 = null;
            this.field1213 = null;
            this.field1231 = null;
            this.field1232 = null;
            this.field1233 = null;
            this.field1395 = new PixMap(929, 128, 265, this.method11(101));
            Pix2D.method148(false);
            this.field1396 = new PixMap(929, 128, 265, this.method11(101));
            int var2 = 21 / arg0;
            Pix2D.method148(false);
            this.field1392 = new PixMap(929, 533, 186, this.method11(101));
            Pix2D.method148(false);
            this.field1393 = new PixMap(929, 360, 146, this.method11(101));
            Pix2D.method148(false);
            this.field1394 = new PixMap(929, 360, 200, this.method11(101));
            Pix2D.method148(false);
            this.field1397 = new PixMap(929, 214, 267, this.method11(101));
            Pix2D.method148(false);
            this.field1398 = new PixMap(929, 215, 267, this.method11(101));
            Pix2D.method148(false);
            this.field1399 = new PixMap(929, 86, 79, this.method11(101));
            Pix2D.method148(false);
            this.field1400 = new PixMap(929, 87, 79, this.method11(101));
            Pix2D.method148(false);
            if (this.field1460 != null) {
                this.method447(0);
                this.method395((byte) -42);
            }
            this.field1489 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIII)Z")
    public final boolean method445(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        int var6 = arg4 >> 14 & 32767;
        int var7 = this.field1448.method81(this.field1333, arg2, arg3, arg4);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            this.field1483 &= arg1;
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method474(0, arg3, this.field1464.field347[0], 2, var9, 737, this.field1464.field346[0], 0, arg2, false, var8 + 1, 0);
            } else {
                LocType var10 = LocType.method275(var6);
                int var11;
                int var12;
                if (var9 != 0 && var9 != 2) {
                    var11 = var10.field795;
                    var12 = var10.field794;
                } else {
                    var11 = var10.field794;
                    var12 = var10.field795;
                }
                int var13 = var10.field818;
                if (var9 != 0) {
                    var13 = (var13 >> 4 - var9) + (var13 << var9 & 15);
                }
                this.method474(var12, arg3, this.field1464.field347[0], 2, 0, 737, this.field1464.field346[0], var13, arg2, false, 0, var11);
            }
            this.field1215 = super.field21;
            this.field1216 = super.field22;
            this.field1218 = 2;
            this.field1217 = 0;
            this.field1451.method198(true, arg0);
            this.field1451.method200(this.field1473 + arg2);
            this.field1451.method200(this.field1474 + arg3);
            this.field1451.method200(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method446(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        int var3 = (this.field1464.field298 >> 7) + this.field1473;
        int var4 = (this.field1464.field299 >> 7) + this.field1474;
        if (var3 >= 2944 && var3 < 3392 && var4 >= 3520 && var4 < 6400) {
            this.field1172 = (var4 - 3520) / 8 + 1;
        } else if (var3 >= 2944 && var3 < 3392 && var4 >= 9920 && var4 < 12800) {
            this.field1172 = (var4 - 9920) / 8 + 1;
        } else {
            this.field1172 = 0;
        }
        this.field1113 = 0;
        if (var3 >= 3328 && var3 < 3392 && var4 >= 3200 && var4 < 3264) {
            int var5 = var3 & 63;
            int var6 = var4 & 63;
            if (var5 >= 4 && var5 <= 29 && var6 >= 44 && var6 <= 58) {
                this.field1113 = 1;
            }
            if (var5 >= 36 && var5 <= 61 && var6 >= 44 && var6 <= 58) {
                this.field1113 = 1;
            }
            if (var5 >= 4 && var5 <= 29 && var6 >= 25 && var6 <= 39) {
                this.field1113 = 1;
            }
            if (var5 >= 36 && var5 <= 61 && var6 >= 25 && var6 <= 39) {
                this.field1113 = 1;
            }
            if (var5 >= 4 && var5 <= 29 && var6 >= 6 && var6 <= 20) {
                this.field1113 = 1;
            }
            if (var5 >= 36 && var5 <= 61 && var6 >= 6 && var6 <= 20) {
                this.field1113 = 1;
            }
        }
        if (this.field1113 == 0 && var3 >= 3328 && var3 <= 3393 && var4 >= 3203 && var4 <= 3325) {
            this.field1113 = 2;
        }
        this.field1146 = 0;
        if (var3 >= 3053 && var3 <= 3156 && var4 >= 3056 && var4 <= 3136) {
            this.field1146 = 1;
        }
        if (var3 >= 3072 && var3 <= 3118 && var4 >= 9492 && var4 <= 9535) {
            this.field1146 = 1;
        }
        if (this.field1146 == 1 && var3 >= 3139 && var3 <= 3199 && var4 >= 3008 && var4 <= 3062) {
            this.field1146 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method447(int arg0) {
        byte[] var2 = this.field1460.method250((byte[]) null, 3, "title.dat");
        Pix32 var3 = new Pix32(var2, this);
        this.field1395.method235(735);
        var3.method171(0, field1372, 0);
        this.field1396.method235(735);
        var3.method171(-661, field1372, 0);
        this.field1392.method235(735);
        var3.method171(-128, field1372, 0);
        this.field1393.method235(735);
        var3.method171(-214, field1372, -386);
        this.field1394.method235(735);
        var3.method171(-214, field1372, -186);
        this.field1397.method235(735);
        var3.method171(0, field1372, -265);
        this.field1398.method235(735);
        var3.method171(-574, field1372, -265);
        this.field1399.method235(735);
        var3.method171(-128, field1372, -186);
        this.field1400.method235(735);
        var3.method171(-574, field1372, -186);
        int[] var4 = new int[var3.field573];
        for (int var5 = 0; var5 < var3.field574; ++var5) {
            for (int var10 = 0; var10 < var3.field573; ++var10) {
                var4[var10] = var3.field572[var3.field573 * var5 + (var3.field573 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field573; ++var11) {
                var3.field572[var3.field573 * var5 + var11] = var4[var11];
            }
        }
        this.field1395.method235(735);
        var3.method171(394, field1372, 0);
        this.field1396.method235(735);
        var3.method171(-267, field1372, 0);
        this.field1392.method235(735);
        var3.method171(266, field1372, 0);
        this.field1393.method235(735);
        var3.method171(180, field1372, -386);
        this.field1394.method235(735);
        var3.method171(180, field1372, -186);
        this.field1397.method235(735);
        var3.method171(394, field1372, -265);
        this.field1398.method235(735);
        var3.method171(-180, field1372, -265);
        this.field1399.method235(735);
        this.field1167 += arg0;
        var3.method171(212, field1372, -186);
        this.field1400.method235(735);
        var3.method171(-180, field1372, -186);
        Pix32 var6 = new Pix32(this.field1460, "logo", 0);
        this.field1392.method235(735);
        var6.method173(super.field9 / 2 - var6.field573 / 2 - 128, 18, -141);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILhc;)V")
    public final void method448(int arg0, int arg1, int arg2, int arg3, Component arg4) {
        if (arg2 < 4 || arg2 > 4) {
            this.field1159 = -62;
        }
        if (arg4.field940 == 0 && arg4.field954 != null) {
            if (!arg4.field953 || this.field1058 == arg4.field938 || this.field1256 == arg4.field938 || this.field1388 == arg4.field938) {
                int var6 = Pix2D.field537;
                int var7 = Pix2D.field535;
                int var8 = Pix2D.field538;
                int var9 = Pix2D.field536;
                Pix2D.method147(arg3, arg4.field943 + arg1, arg4.field944 + arg3, true, arg1);
                int var10 = arg4.field954.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg4.field955[var11] + arg1;
                    int var13 = arg4.field956[var11] + arg3 - arg0;
                    Component var14 = Component.field933[arg4.field954[var11]];
                    int var15 = var14.field945 + var12;
                    int var16 = var14.field946 + var13;
                    if (var14.field942 > 0) {
                        this.method468(var14, (byte) 3);
                    }
                    if (var14.field940 == 0) {
                        if (var14.field952 > var14.field951 - var14.field944) {
                            var14.field952 = var14.field951 - var14.field944;
                        }
                        if (var14.field952 < 0) {
                            var14.field952 = 0;
                        }
                        this.method448(var14.field952, var15, 4, var16, var14);
                        if (var14.field951 > var14.field944) {
                            this.method365(var16, var14.field943 + var15, var14.field944, var14.field951, 0, var14.field952);
                        }
                    } else if (var14.field940 != 1) {
                        if (var14.field940 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field944; ++var18) {
                                for (int var19 = 0; var19 < var14.field943; ++var19) {
                                    int var20 = (var14.field962 + 32) * var19 + var15;
                                    int var21 = (var14.field963 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field965[var17];
                                        var21 += var14.field966[var17];
                                    }
                                    if (var14.field934[var17] <= 0) {
                                        if (var14.field964 != null && var17 < 20) {
                                            Pix32 var27 = var14.field964[var17];
                                            if (var27 != null) {
                                                var27.method173(var20, var21, -141);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field934[var17] - 1;
                                        Pix32 var25 = ObjType.method292(var24, 0, var14.field935[var17]);
                                        if (this.field1300 != 0 && this.field1299 == var17 && this.field1298 == var14.field938) {
                                            var22 = super.field18 - this.field1301;
                                            var23 = super.field19 - this.field1302;
                                            if (var22 < 5 && var22 > -5) {
                                                var22 = 0;
                                            }
                                            if (var23 < 5 && var23 > -5) {
                                                var23 = 0;
                                            }
                                            if (this.field1255 < 5) {
                                                var22 = 0;
                                                var23 = 0;
                                            }
                                            var25.method177(var20 + var22, 128, 372, var21 + var23);
                                        } else if (this.field1291 != 0 && this.field1290 == var17 && this.field1289 == var14.field938) {
                                            var25.method177(var20, 128, 372, var21);
                                        } else {
                                            var25.method173(var20, var21, -141);
                                        }
                                        if (var25.field577 == 33 || var14.field935[var17] != 1) {
                                            int var26 = var14.field935[var17];
                                            this.field1246.method191(1, 0, var20 + 1 + var22, method367(2, var26), var21 + 10 + var23);
                                            this.field1246.method191(1, 16776960, var20 + var22, method367(2, var26), var21 + 9 + var23);
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field940 == 3) {
                            if (var14.field968) {
                                Pix2D.method149(var14.field943, var14.field944, var14.field974, var16, (byte) -37, var15);
                            } else {
                                Pix2D.method150(var16, 712, var14.field944, var14.field974, var14.field943, var15);
                            }
                        } else if (var14.field940 == 4) {
                            PixFont var28 = var14.field971;
                            int var29 = var14.field974;
                            String var30 = var14.field972;
                            if ((this.field1388 == var14.field938 || this.field1256 == var14.field938 || this.field1058 == var14.field938) && var14.field976 != 0) {
                                var29 = var14.field976;
                            }
                            if (this.method405(false, var14)) {
                                var29 = var14.field975;
                                if (var14.field973.length() > 0) {
                                    var30 = var14.field973;
                                }
                            }
                            if (var14.field941 == 6 && this.field1251) {
                                var30 = "Please wait...";
                                var29 = var14.field974;
                            }
                            int var31 = var28.field600 + var16;
                            while (var30.length() > 0) {
                                if (var30.indexOf("%") != -1) {
                                    label245: while (true) {
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
                                                                            break label245;
                                                                        }
                                                                        var30 = var30.substring(0, var36) + this.method414(false, this.method372(4, -254, var14)) + var30.substring(var36 + 2);
                                                                    }
                                                                }
                                                                var30 = var30.substring(0, var35) + this.method414(false, this.method372(3, -254, var14)) + var30.substring(var35 + 2);
                                                            }
                                                        }
                                                        var30 = var30.substring(0, var34) + this.method414(false, this.method372(2, -254, var14)) + var30.substring(var34 + 2);
                                                    }
                                                }
                                                var30 = var30.substring(0, var33) + this.method414(false, this.method372(1, -254, var14)) + var30.substring(var33 + 2);
                                            }
                                        }
                                        var30 = var30.substring(0, var32) + this.method414(false, this.method372(0, -254, var14)) + var30.substring(var32 + 2);
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
                                if (var14.field969) {
                                    var28.method189(this.field1157, var38, var29, var14.field943 / 2 + var15, var31, var14.field970);
                                } else {
                                    var28.method193(931, var14.field970, var38, var31, var15, var29);
                                }
                                var31 += var28.field600;
                            }
                        } else if (var14.field940 == 5) {
                            Pix32 var39;
                            if (this.method405(false, var14)) {
                                var39 = var14.field978;
                            } else {
                                var39 = var14.field977;
                            }
                            if (var39 != null) {
                                var39.method173(var15, var16, -141);
                            }
                        } else if (var14.field940 == 6) {
                            int var40 = Pix3D.field551;
                            int var41 = Pix3D.field552;
                            Pix3D.field551 = var14.field943 / 2 + var15;
                            Pix3D.field552 = var14.field944 / 2 + var16;
                            int var42 = Pix3D.field555[var14.field984] * var14.field983 >> 16;
                            int var43 = Pix3D.field556[var14.field984] * var14.field983 >> 16;
                            boolean var44 = this.method405(false, var14);
                            int var45;
                            if (var44) {
                                var45 = var14.field982;
                            } else {
                                var45 = var14.field981;
                            }
                            Model var46;
                            if (var45 == -1) {
                                var46 = var14.method315(-1, -1, var44);
                            } else {
                                SeqType var47 = SeqType.field999[var45];
                                var46 = var14.method315(var47.field1001[var14.field936], var47.field1002[var14.field936], var44);
                            }
                            if (var46 != null) {
                                var46.method139(0, var14.field985, 0, var14.field984, 0, var42, var43);
                            }
                            Pix3D.field551 = var40;
                            Pix3D.field552 = var41;
                        } else if (var14.field940 == 7) {
                            PixFont var48 = var14.field971;
                            int var49 = 0;
                            for (int var50 = 0; var50 < var14.field944; ++var50) {
                                for (int var51 = 0; var51 < var14.field943; ++var51) {
                                    if (var14.field934[var49] > 0) {
                                        ObjType var52 = ObjType.method287(var14.field934[var49] - 1);
                                        String var53 = var52.field861;
                                        if (var52.field873 || var14.field935[var49] != 1) {
                                            var53 = var53 + " x" + method484((byte) 1, var14.field935[var49]);
                                        }
                                        int var54 = (var14.field962 + 115) * var51 + var15;
                                        int var55 = (var14.field963 + 12) * var50 + var16;
                                        if (var14.field969) {
                                            var48.method189(this.field1157, var53, var14.field974, var14.field943 / 2 + var54, var55, var14.field970);
                                        } else {
                                            var48.method193(931, var14.field970, var53, var55, var54, var14.field974);
                                        }
                                    }
                                    ++var49;
                                }
                            }
                        }
                    }
                }
                Pix2D.method147(var7, var8, var9, true, var6);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)I")
    public final int method449(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 7;
        int var6 = arg2 >> 7;
        int var7 = arg0;
        if (arg0 < 3 && (this.field1118[1][var5][var6] & 2) == 2) {
            var7 = arg0 + 1;
        }
        int var8 = arg3 & 127;
        int var9 = arg2 & 127;
        int var10 = (128 - var8) * this.field1161[var7][var5][var6] + this.field1161[var7][var5 + 1][var6] * var8 >> 7;
        int var11 = (128 - var8) * this.field1161[var7][var5][var6 + 1] + this.field1161[var7][var5 + 1][var6 + 1] * var8 >> 7;
        return arg1 >= 0 ? this.field1380 : (128 - var9) * var10 + var9 * var11 >> 7;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;ZI)V")
    private final void method450(Packet arg0, boolean arg1, int arg2) {
        int var4 = arg0.method220(false, 8);
        if (var4 < this.field1344) {
            for (int var5 = var4; var5 < this.field1344; ++var5) {
                this.field1450[this.field1449++] = this.field1345[var5];
            }
        }
        if (var4 > this.field1344) {
            signlink.reporterror(this.field1123 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1344 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1345[var6];
                PlayerEntity var8 = this.field1343[var7];
                int var9 = arg0.method220(false, 1);
                if (var9 == 0) {
                    this.field1345[this.field1344++] = var7;
                    var8.field342 = field1354;
                } else {
                    int var10 = arg0.method220(false, 2);
                    if (var10 == 0) {
                        this.field1345[this.field1344++] = var7;
                        var8.field342 = field1354;
                        this.field1347[this.field1346++] = var7;
                    } else if (var10 == 1) {
                        this.field1345[this.field1344++] = var7;
                        var8.field342 = field1354;
                        int var11 = arg0.method220(false, 3);
                        var8.method110(42815, false, var11);
                        int var12 = arg0.method220(false, 1);
                        if (var12 == 1) {
                            this.field1347[this.field1346++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1345[this.field1344++] = var7;
                        var8.field342 = field1354;
                        int var13 = arg0.method220(false, 3);
                        var8.method110(42815, true, var13);
                        int var14 = arg0.method220(false, 3);
                        var8.method110(42815, true, var14);
                        int var15 = arg0.method220(false, 1);
                        if (var15 == 1) {
                            this.field1347[this.field1346++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1450[this.field1449++] = var7;
                    }
                }
            }
            if (!arg1) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method451(int arg0, int arg1) {
        LinkList var3 = this.field1322[this.field1333][arg0][arg1];
        if (var3 == null) {
            this.field1448.method76(this.field1333, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method228(); var6 != null; var6 = (ObjStackEntity) var3.method230(735)) {
                ObjType var16 = ObjType.method287(var6.field294);
                int var17 = var16.field874;
                if (var16.field873) {
                    var17 = (var6.field295 + 1) * var17;
                }
                if (var17 > var4) {
                    var4 = var17;
                    var5 = var6;
                }
            }
            var3.method226((byte) 4, var5);
            int var7 = -1;
            int var8 = -1;
            int var9 = 0;
            int var10 = 0;
            for (ObjStackEntity var11 = (ObjStackEntity) var3.method228(); var11 != null; var11 = (ObjStackEntity) var3.method230(735)) {
                if (var5.field294 != var11.field294 && var7 == -1) {
                    var7 = var11.field294;
                    var9 = var11.field295;
                }
                if (var5.field294 != var11.field294 && var11.field294 != var7 && var8 == -1) {
                    var8 = var11.field294;
                    var10 = var11.field295;
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
            ObjType var15 = ObjType.method287(var5.field294);
            this.field1448.method57(var14, arg1, arg0, this.field1333, var15.method291(var5.field295), this.method449(this.field1333, field1131, arg1 * 128 + 64, arg0 * 128 + 64), var13, var12, 0);
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method452(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method453(boolean arg0) {
        this.field1212.method235(735);
        int var2 = this.field1486 + this.field1066 & 2047;
        int var3 = this.field1464.field298 / 32 + 48;
        int var4 = 464 - this.field1464.field299 / 32;
        this.field1087.method179(-438, 21, this.field1197, 151, 9, var4, var2, this.field1482, this.field1195 + 256, var3, 146);
        this.field1352.method179(-438, 0, this.field1147, 33, 0, 25, this.field1066, this.field1141, 256, 25, 33);
        for (int var5 = 0; var5 < this.field1479; ++var5) {
            int var25 = this.field1480[var5] * 4 + 2 - this.field1464.field298 / 32;
            int var26 = this.field1481[var5] * 4 + 2 - this.field1464.field299 / 32;
            this.method455(833, var26, var25, this.field1088[var5]);
        }
        for (int var6 = 0; var6 < 104; ++var6) {
            for (int var21 = 0; var21 < 104; ++var21) {
                LinkList var22 = this.field1322[this.field1333][var6][var21];
                if (var22 != null) {
                    int var23 = var6 * 4 + 2 - this.field1464.field298 / 32;
                    int var24 = var21 * 4 + 2 - this.field1464.field299 / 32;
                    this.method455(833, var24, var23, this.field1060);
                }
            }
        }
        for (int var7 = 0; var7 < this.field1318; ++var7) {
            NpcEntity var18 = this.field1317[this.field1319[var7]];
            if (var18 != null && var18.method111(35155) && var18.field352.field846) {
                int var19 = var18.field298 / 32 - this.field1464.field298 / 32;
                int var20 = var18.field299 / 32 - this.field1464.field299 / 32;
                this.method455(833, var20, var19, this.field1061);
            }
        }
        if (arg0) {
            field1263 = !field1263;
        }
        for (int var8 = 0; var8 < this.field1344; ++var8) {
            PlayerEntity var11 = this.field1343[this.field1345[var8]];
            if (var11 != null && var11.method111(35155)) {
                int var12 = var11.field298 / 32 - this.field1464.field298 / 32;
                int var13 = var11.field299 / 32 - this.field1464.field299 / 32;
                boolean var14 = false;
                long var15 = JString.method251(var11.field356);
                for (int var17 = 0; var17 < this.field1243; ++var17) {
                    if (this.field1234[var17] == var15 && this.field1320[var17] != 0) {
                        var14 = true;
                        break;
                    }
                }
                if (var14) {
                    this.method455(833, var13, var12, this.field1063);
                } else {
                    this.method455(833, var13, var12, this.field1062);
                }
            }
        }
        if (this.field1085 != 0) {
            int var9 = this.field1085 * 4 + 2 - this.field1464.field298 / 32;
            int var10 = this.field1086 * 4 + 2 - this.field1464.field299 / 32;
            this.method455(833, var10, var9, this.field1112);
        }
        Pix2D.method149(3, 3, 16777215, 82, (byte) -37, 93);
        this.field1213.method235(735);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BJ)V")
    public final void method454(byte arg0, long arg1) {
        if (arg0 != 55) {
            this.field1168 = this.field1119.method209();
        }
        if (arg1 != 0L) {
            if (this.field1306 >= 100) {
                this.method380(-823, 0, "", "Your ignore list is full. Max of 100 hit");
            } else {
                String var4 = JString.method255(false, JString.method252(false, arg1));
                for (int var5 = 0; var5 < this.field1306; ++var5) {
                    if (this.field1182[var5] == arg1) {
                        this.method380(-823, 0, "", var4 + " is already on your ignore list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1243; ++var6) {
                    if (this.field1234[var6] == arg1) {
                        this.method380(-823, 0, "", "Please remove " + var4 + " from your friend list first");
                        return;
                    }
                }
                this.field1182[this.field1306++] = arg1;
                this.field1092 = true;
                this.field1451.method198(true, 175);
                this.field1451.method205(arg1, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILhb;)V")
    public final void method455(int arg0, int arg1, int arg2, Pix32 arg3) {
        int var5 = this.field1486 + this.field1066 & 2047;
        int var6 = arg1 * arg1 + arg2 * arg2;
        if (var6 <= 6400) {
            int var7 = Model.field525[var5];
            int var8 = Model.field526[var5];
            int var9 = var7 * 256 / (this.field1195 + 256);
            int var10 = var8 * 256 / (this.field1195 + 256);
            int var11 = 32 / arg0;
            int var12 = arg1 * var9 + arg2 * var10 >> 16;
            int var13 = arg1 * var10 - arg2 * var9 >> 16;
            if (var6 > 2500) {
                arg3.method180(var12 + 94 - arg3.field577 / 2, 9, 83 - var13 - arg3.field578 / 2, this.field1104);
            } else {
                arg3.method173(var12 + 94 - arg3.field577 / 2, 83 - var13 - arg3.field578 / 2, -141);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method456(byte arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1418[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1418[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1419[var14] = (this.field1418[var14 - 1] + this.field1418[var14 + 1] + this.field1418[var14 - 128] + this.field1418[var14 + 128]) / 4;
            }
        }
        if (arg0 != 0) {
            field1174 = 22;
        }
        this.field1281 += 128;
        if (this.field1281 > this.field1080.length) {
            this.field1281 -= this.field1080.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method427(0, this.field1071[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field1419[var11 + 128] - this.field1080[this.field1281 + var11 & this.field1080.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field1418[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field1183[var8] = this.field1183[var8 + 1];
        }
        this.field1183[var2 - 1] = (int) (Math.sin((double) field1354 / 14.0D) * 16.0D + Math.sin((double) field1354 / 15.0D) * 14.0D + Math.sin((double) field1354 / 16.0D) * 12.0D);
        if (this.field1266 > 0) {
            this.field1266 -= 4;
        }
        if (this.field1267 > 0) {
            this.field1267 -= 4;
        }
        if (this.field1266 == 0 && this.field1267 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field1266 = 1024;
            }
            if (var9 == 1) {
                this.field1267 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method457(int arg0, int arg1) {
        int var3 = VarpType.field1029[arg0].field1037;
        if (var3 != 0) {
            int var4 = this.field1287[arg0];
            if (this.field1316 != arg1) {
                this.field1128 = !this.field1128;
            }
            if (var3 == 1) {
                if (var4 == 1) {
                    Pix3D.method162(0.9D, field1122);
                }
                if (var4 == 2) {
                    Pix3D.method162(0.8D, field1122);
                }
                if (var4 == 3) {
                    Pix3D.method162(0.7D, field1122);
                }
                if (var4 == 4) {
                    Pix3D.method162(0.6D, field1122);
                }
                ObjType.field893.method104();
                this.field1489 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field1134;
                if (var4 == 0) {
                    this.method426(0, this.field1134, this.field1382);
                    this.field1134 = true;
                }
                if (var4 == 1) {
                    this.method426(-400, this.field1134, this.field1382);
                    this.field1134 = true;
                }
                if (var4 == 2) {
                    this.method426(-800, this.field1134, this.field1382);
                    this.field1134 = true;
                }
                if (var4 == 3) {
                    this.method426(-1200, this.field1134, this.field1382);
                    this.field1134 = true;
                }
                if (var4 == 4) {
                    this.field1134 = false;
                }
                if (this.field1134 != var5) {
                    if (this.field1134) {
                        this.method425(this.field1109, this.field1350, -48, this.field1315);
                    } else {
                        this.method464((byte) 38);
                    }
                    this.field1143 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field1160 = true;
                    this.method463(-35024, 0);
                }
                if (var4 == 1) {
                    this.field1160 = true;
                    this.method463(-35024, -400);
                }
                if (var4 == 2) {
                    this.field1160 = true;
                    this.method463(-35024, -800);
                }
                if (var4 == 3) {
                    this.field1160 = true;
                    this.method463(-35024, -1200);
                }
                if (var4 == 4) {
                    this.field1160 = false;
                }
            }
            if (var3 == 5) {
                this.field1295 = var4;
            }
            if (var3 == 6) {
                this.field1471 = var4;
            }
            if (var3 == 8) {
                this.field1129 = var4;
                this.field1176 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method458(int arg0) {
        int var2 = this.field1248.method190("Choose Option", (byte) 3);
        for (int var3 = 0; var3 < this.field1164; ++var3) {
            int var11 = this.field1248.method190(this.field1158[var3], (byte) 3);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        if (arg0 != -4311) {
            this.field1380 = this.field1310.method246();
        }
        var2 += 8;
        int var4 = this.field1164 * 15 + 21;
        if (super.field21 > 8 && super.field22 > 11 && super.field21 < 520 && super.field22 < 345) {
            int var5 = super.field21 - 8 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field22 - 11;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field1383 = true;
            this.field1190 = 0;
            this.field1191 = var5;
            this.field1192 = var6;
            this.field1193 = var2;
            this.field1194 = this.field1164 * 15 + 22;
        }
        if (super.field21 > 562 && super.field22 > 231 && super.field21 < 752 && super.field22 < 492) {
            int var7 = super.field21 - 562 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field22 - 231;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field1383 = true;
            this.field1190 = 1;
            this.field1191 = var7;
            this.field1192 = var8;
            this.field1193 = var2;
            this.field1194 = this.field1164 * 15 + 22;
        }
        if (super.field21 > 22 && super.field22 > 375 && super.field21 < 501 && super.field22 < 471) {
            int var9 = super.field21 - 22 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field22 - 375;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field1383 = true;
            this.field1190 = 2;
            this.field1191 = var9;
            this.field1192 = var10;
            this.field1193 = var2;
            this.field1194 = this.field1164 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;II)Lub;")
    public final Jagfile method459(int arg0, String arg1, String arg2, int arg3, int arg4) {
        int var6 = 5;
        byte[] var7 = signlink.cacheload(arg2);
        if (arg0 != 0) {
            throw new NullPointerException();
        } else {
            if (var7 != null) {
                this.field1178.reset();
                this.field1178.update(var7);
                int var8 = (int) this.field1178.getValue();
                if (arg4 != var8) {
                    var7 = null;
                }
            }
            if (var7 != null) {
                return new Jagfile(-470, var7);
            } else {
                while (var7 == null) {
                    this.method13(arg3, "Requesting " + arg1, 0);
                    try {
                        int var10 = 0;
                        DataInputStream var11 = this.method479(arg2 + arg4);
                        byte[] var12 = new byte[6];
                        var11.readFully(var12, 0, 6);
                        Packet var13 = new Packet(575, var12);
                        var13.field612 = 3;
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
                                this.method13(arg3, "Loading " + arg1 + " - " + var18 + "%", 0);
                            }
                            var10 = var18;
                        }
                        var11.close();
                    } catch (IOException var22) {
                        var7 = null;
                        for (int var19 = var6; var19 > 0; --var19) {
                            this.method13(arg3, "Error loading - Will retry in " + var19 + " secs.", 0);
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
                signlink.cachesave(arg2, var7);
                return new Jagfile(-470, var7);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ[BI)V")
    public final void method460(boolean arg0, boolean arg1, byte[] arg2, int arg3) {
        signlink.midifade = arg1 ? 1 : 0;
        signlink.midisave(arg2, arg3);
        if (arg0) {
            this.field1292 = this.field1310.method246();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB[B)Z")
    public final boolean method461(int arg0, byte arg1, byte[] arg2) {
        if (this.field1127 != arg1) {
            throw new NullPointerException();
        } else {
            return arg2 == null ? true : signlink.wavesave(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)Z")
    public final boolean method462(int arg0) {
        int var2 = 70 / arg0;
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method463(int arg0, int arg1) {
        signlink.wavevol = arg1;
        if (arg0 != -35024) {
            this.field1274 = this.field1310.method246();
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method464(byte arg0) {
        if (arg0 != 38) {
            this.field1168 = this.field1119.method209();
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Lkb;II)V")
    private final void method465(Packet arg0, int arg1, int arg2) {
        if (this.field1485 == arg2) {
            for (int var4 = 0; var4 < this.field1346; ++var4) {
                int var5 = this.field1347[var4];
                PlayerEntity var6 = this.field1343[var5];
                int var7 = arg0.method209();
                if ((var7 & 128) == 128) {
                    var7 += arg0.method209() << 8;
                }
                this.method413(arg0, var6, var5, 0, var7);
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        int var2 = 54 / arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field14 != null ? super.field14 : this;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILkb;)V")
    private final void method466(int arg0, int arg1, Packet arg2) {
        this.field1449 = 0;
        int var4 = 30 / arg0;
        this.field1346 = 0;
        this.method434(arg2, arg1, 3);
        this.method450(arg2, false, arg1);
        this.method381(arg2, arg1, 0);
        this.method465(arg2, arg1, -24040);
        for (int var5 = 0; var5 < this.field1449; ++var5) {
            int var7 = this.field1450[var5];
            if (field1354 != this.field1343[var7].field342) {
                this.field1343[var7] = null;
            }
        }
        if (arg2.field612 != arg1) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field612 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field1344; ++var6) {
                if (this.field1343[this.field1345[var6]] == null) {
                    signlink.reporterror(this.field1123 + " null entry in pl list - pos:" + var6 + " size:" + this.field1344);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method467(int arg0) {
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (this.field1277 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1069.method228(); var2 != null; var2 = (LocSpawned) this.field1069.method230(735)) {
                if (field1354 >= var2.field641) {
                    this.method475(var2.field640, var2.field639, var2.field638, var2.field636, var2.field637, 221, var2.field634, var2.field635);
                    var2.method107();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lhc;B)V")
    public final void method468(Component arg0, byte arg1) {
        if (arg1 != 3) {
            this.field1451.method199(36);
        }
        int var3 = arg0.field942;
        if (var3 >= 1 && var3 <= 100) {
            --var3;
            if (var3 >= this.field1243) {
                arg0.field972 = "";
                arg0.field941 = 0;
            } else {
                arg0.field972 = this.field1328[var3];
                arg0.field941 = 1;
            }
        } else if (var3 >= 101 && var3 <= 200) {
            var3 -= 101;
            if (var3 >= this.field1243) {
                arg0.field972 = "";
                arg0.field941 = 0;
            } else {
                if (this.field1320[var3] == 0) {
                    arg0.field972 = "@red@Offline";
                } else if (this.field1320[var3] == field1324) {
                    arg0.field972 = "@gre@World-" + (this.field1320[var3] - 9);
                } else {
                    arg0.field972 = "@yel@World-" + (this.field1320[var3] - 9);
                }
                arg0.field941 = 1;
            }
        } else if (var3 == 203) {
            arg0.field951 = this.field1243 * 15 + 20;
            if (arg0.field951 <= arg0.field944) {
                arg0.field951 = arg0.field944 + 1;
            }
        } else if (var3 >= 401 && var3 <= 500) {
            var3 -= 401;
            if (var3 >= this.field1306) {
                arg0.field972 = "";
                arg0.field941 = 0;
            } else {
                arg0.field972 = JString.method255(false, JString.method252(false, this.field1182[var3]));
                arg0.field941 = 1;
            }
        } else if (var3 == 503) {
            arg0.field951 = this.field1306 * 15 + 20;
            if (arg0.field951 <= arg0.field944) {
                arg0.field951 = arg0.field944 + 1;
            }
        } else if (var3 == 327) {
            arg0.field984 = 150;
            arg0.field985 = (int) (Math.sin((double) field1354 / 40.0D) * 256.0D) & 2047;
            if (this.field1424) {
                this.field1424 = false;
                Model[] var4 = new Model[7];
                int var5 = 0;
                for (int var6 = 0; var6 < 7; ++var6) {
                    int var9 = this.field1336[var6];
                    if (var9 >= 0) {
                        var4[var5++] = IdkType.field924[var9].method312();
                    }
                }
                Model var7 = new Model(0, var4, var5);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field1406[var8] != 0) {
                        var7.method133(field1205[var8][0], field1205[var8][this.field1406[var8]]);
                        if (var8 == 1) {
                            var7.method133(field1145[0], field1145[this.field1406[var8]]);
                        }
                    }
                }
                var7.method126(true);
                var7.method127(SeqType.field999[this.field1464.field303].field1001[0], -227);
                var7.method136(64, 850, -30, -50, -30, true);
                arg0.field979 = var7;
            }
        } else if (var3 == 324) {
            if (this.field1244 == null) {
                this.field1244 = arg0.field977;
                this.field1245 = arg0.field978;
            }
            if (this.field1401) {
                arg0.field977 = this.field1245;
            } else {
                arg0.field977 = this.field1244;
            }
        } else if (var3 == 325) {
            if (this.field1244 == null) {
                this.field1244 = arg0.field977;
                this.field1245 = arg0.field978;
            }
            if (this.field1401) {
                arg0.field977 = this.field1244;
            } else {
                arg0.field977 = this.field1245;
            }
        } else if (var3 == 600) {
            arg0.field972 = this.field1084;
            if (field1354 % 20 < 10) {
                arg0.field972 = arg0.field972 + "|";
            } else {
                arg0.field972 = arg0.field972 + " ";
            }
        } else {
            if (var3 == 613) {
                if (this.field1090) {
                    if (this.field1391) {
                        arg0.field974 = 16711680;
                        arg0.field972 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else {
                        arg0.field974 = 16777215;
                        arg0.field972 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else {
                    arg0.field972 = "";
                }
            }
            if (var3 == 650 || var3 == 655) {
                if (this.field1279 != 0) {
                    String var10;
                    if (this.field1184 == 0) {
                        var10 = "earlier today";
                    } else if (this.field1184 == 1) {
                        var10 = "yesterday";
                    } else {
                        var10 = this.field1184 + " days ago";
                    }
                    arg0.field972 = "You last logged in " + var10 + " from: " + signlink.dns;
                } else {
                    arg0.field972 = "";
                }
            }
            if (var3 == 651) {
                if (this.field1365 == 0) {
                    arg0.field972 = "0 unread messages";
                    arg0.field974 = 16776960;
                }
                if (this.field1365 == 1) {
                    arg0.field972 = "1 unread message";
                    arg0.field974 = 65280;
                }
                if (this.field1365 > 1) {
                    arg0.field972 = this.field1365 + " unread messages";
                    arg0.field974 = 65280;
                }
            }
            if (var3 == 652) {
                if (this.field1262 == 201) {
                    arg0.field972 = "";
                } else if (this.field1262 == 200) {
                    arg0.field972 = "You have not yet set any password recovery questions.";
                } else {
                    String var11;
                    if (this.field1262 == 0) {
                        var11 = "Earlier today";
                    } else if (this.field1262 == 1) {
                        var11 = "Yesterday";
                    } else {
                        var11 = this.field1262 + " days ago";
                    }
                    arg0.field972 = var11 + " you changed your recovery questions";
                }
            }
            if (var3 == 653) {
                if (this.field1262 == 201) {
                    arg0.field972 = "";
                } else if (this.field1262 == 200) {
                    arg0.field972 = "We strongly recommend you do so now to secure your account.";
                } else {
                    arg0.field972 = "If you do not remember making this change then cancel it immediately";
                }
            }
            if (var3 == 654) {
                if (this.field1262 == 201) {
                    arg0.field972 = "";
                } else if (this.field1262 == 200) {
                    arg0.field972 = "Do this from the 'account management' area on our front webpage";
                } else {
                    arg0.field972 = "Do this from the 'account management' area on our front webpage";
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILx;)V")
    public final void method469(boolean arg0, int arg1, PathingEntity arg2) {
        if (!arg0) {
            field1230 = !field1230;
        }
        this.method470(arg2.field299, arg1, arg2.field298, 25880);
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IIII)V")
    public final void method470(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 128 && arg0 >= 128 && arg2 <= 13056 && arg0 <= 13056) {
            int var5 = this.method449(this.field1333, field1131, arg0, arg2) - arg1;
            if (arg3 == 25880) {
                int var6 = arg2 - this.field1136;
                int var7 = var5 - this.field1137;
                int var8 = arg0 - this.field1138;
                int var9 = Model.field525[this.field1139];
                int var10 = Model.field526[this.field1139];
                int var11 = Model.field525[this.field1140];
                int var12 = Model.field526[this.field1140];
                int var13 = var6 * var12 + var8 * var11 >> 16;
                int var14 = var8 * var12 - var6 * var11 >> 16;
                int var16 = var7 * var10 - var9 * var14 >> 16;
                int var17 = var7 * var9 + var10 * var14 >> 16;
                if (var17 >= 50) {
                    this.field1165 = (var13 << 9) / var17 + Pix3D.field551;
                    this.field1166 = (var16 << 9) / var17 + Pix3D.field552;
                } else {
                    this.field1165 = -1;
                    this.field1166 = -1;
                }
            }
        } else {
            this.field1165 = -1;
            this.field1166 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method471(int arg0) {
        if (this.field1455 == 0 && this.field1465 == 0) {
            this.field1158[this.field1164] = "Walk here";
            this.field1422[this.field1164] = 981;
            this.field1420[this.field1164] = super.field18;
            this.field1421[this.field1164] = super.field19;
            ++this.field1164;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < Model.field523; ++var3) {
            int var5 = Model.field524[var3];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var2 != var5) {
                var2 = var5;
                if (var8 == 2 && this.field1448.method81(this.field1333, var6, var7, var5) >= 0) {
                    LocType var10 = LocType.method275(var9);
                    if (this.field1455 == 1) {
                        this.field1158[this.field1164] = "Use " + this.field1459 + " with @cya@" + var10.field790;
                        this.field1422[this.field1164] = 505;
                        this.field1423[this.field1164] = var5;
                        this.field1420[this.field1164] = var6;
                        this.field1421[this.field1164] = var7;
                        ++this.field1164;
                    } else if (this.field1465 == 1) {
                        if ((this.field1467 & 4) == 4) {
                            this.field1158[this.field1164] = this.field1468 + " @cya@" + var10.field790;
                            this.field1422[this.field1164] = 737;
                            this.field1423[this.field1164] = var5;
                            this.field1420[this.field1164] = var6;
                            this.field1421[this.field1164] = var7;
                            ++this.field1164;
                        }
                    } else {
                        if (var10.field806 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field806[var11] != null) {
                                    this.field1158[this.field1164] = var10.field806[var11] + " @cya@" + var10.field790;
                                    if (var11 == 0) {
                                        this.field1422[this.field1164] = 798;
                                    }
                                    if (var11 == 1) {
                                        this.field1422[this.field1164] = 829;
                                    }
                                    if (var11 == 2) {
                                        this.field1422[this.field1164] = 873;
                                    }
                                    if (var11 == 3) {
                                        this.field1422[this.field1164] = 104;
                                    }
                                    if (var11 == 4) {
                                        this.field1422[this.field1164] = 1659;
                                    }
                                    this.field1423[this.field1164] = var5;
                                    this.field1420[this.field1164] = var6;
                                    this.field1421[this.field1164] = var7;
                                    ++this.field1164;
                                }
                            }
                        }
                        this.field1158[this.field1164] = "Examine @cya@" + var10.field790;
                        this.field1422[this.field1164] = 1418;
                        this.field1423[this.field1164] = var5;
                        this.field1420[this.field1164] = var6;
                        this.field1421[this.field1164] = var7;
                        ++this.field1164;
                    }
                }
                if (var8 == 1) {
                    NpcEntity var12 = this.field1317[var9];
                    if (var12.field352.field831 == 1 && (var12.field298 & 127) == 64 && (var12.field299 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field1318; ++var13) {
                            NpcEntity var14 = this.field1317[this.field1319[var13]];
                            if (var14 != null && var12 != var14 && var14.field352.field831 == 1 && var12.field298 == var14.field298 && var12.field299 == var14.field299) {
                                this.method485(var6, this.field1319[var13], var14.field352, var7, -28641);
                            }
                        }
                    }
                    this.method485(var6, var9, var12.field352, var7, -28641);
                }
                if (var8 == 0) {
                    PlayerEntity var15 = this.field1343[var9];
                    if ((var15.field298 & 127) == 64 && (var15.field299 & 127) == 64) {
                        for (int var16 = 0; var16 < this.field1318; ++var16) {
                            NpcEntity var19 = this.field1317[this.field1319[var16]];
                            if (var19 != null && var19.field352.field831 == 1 && var15.field298 == var19.field298 && var15.field299 == var19.field299) {
                                this.method485(var6, this.field1319[var16], var19.field352, var7, -28641);
                            }
                        }
                        for (int var17 = 0; var17 < this.field1344; ++var17) {
                            PlayerEntity var18 = this.field1343[this.field1345[var17]];
                            if (var18 != null && var15 != var18 && var15.field298 == var18.field298 && var15.field299 == var18.field299) {
                                this.method406(981, var18, this.field1345[var17], var6, var7);
                            }
                        }
                    }
                    this.method406(981, var15, var9, var6, var7);
                }
                if (var8 == 3) {
                    LinkList var20 = this.field1322[this.field1333][var6][var7];
                    if (var20 != null) {
                        for (ObjStackEntity var21 = (ObjStackEntity) var20.method229(false); var21 != null; var21 = (ObjStackEntity) var20.method231(false)) {
                            ObjType var22 = ObjType.method287(var21.field294);
                            if (this.field1455 == 1) {
                                this.field1158[this.field1164] = "Use " + this.field1459 + " with @lre@" + var22.field861;
                                this.field1422[this.field1164] = 203;
                                this.field1423[this.field1164] = var21.field294;
                                this.field1420[this.field1164] = var6;
                                this.field1421[this.field1164] = var7;
                                ++this.field1164;
                            } else if (this.field1465 == 1) {
                                if ((this.field1467 & 1) == 1) {
                                    this.field1158[this.field1164] = this.field1468 + " @lre@" + var22.field861;
                                    this.field1422[this.field1164] = 543;
                                    this.field1423[this.field1164] = var21.field294;
                                    this.field1420[this.field1164] = var6;
                                    this.field1421[this.field1164] = var7;
                                    ++this.field1164;
                                }
                            } else {
                                for (int var23 = 4; var23 >= 0; --var23) {
                                    if (var22.field876 != null && var22.field876[var23] != null) {
                                        this.field1158[this.field1164] = var22.field876[var23] + " @lre@" + var22.field861;
                                        if (var23 == 0) {
                                            this.field1422[this.field1164] = 56;
                                        }
                                        if (var23 == 1) {
                                            this.field1422[this.field1164] = 321;
                                        }
                                        if (var23 == 2) {
                                            this.field1422[this.field1164] = 552;
                                        }
                                        if (var23 == 3) {
                                            this.field1422[this.field1164] = 43;
                                        }
                                        if (var23 == 4) {
                                            this.field1422[this.field1164] = 687;
                                        }
                                        this.field1423[this.field1164] = var21.field294;
                                        this.field1420[this.field1164] = var6;
                                        this.field1421[this.field1164] = var7;
                                        ++this.field1164;
                                    } else if (var23 == 2) {
                                        this.field1158[this.field1164] = "Take @lre@" + var22.field861;
                                        this.field1422[this.field1164] = 552;
                                        this.field1423[this.field1164] = var21.field294;
                                        this.field1420[this.field1164] = var6;
                                        this.field1421[this.field1164] = var7;
                                        ++this.field1164;
                                    }
                                }
                                this.field1158[this.field1164] = "Examine @lre@" + var22.field861;
                                this.field1422[this.field1164] = 1308;
                                this.field1423[this.field1164] = var21.field294;
                                this.field1420[this.field1164] = var6;
                                this.field1421[this.field1164] = var7;
                                ++this.field1164;
                            }
                        }
                    }
                }
            }
        }
        int var4 = 34 / arg0;
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method472(int arg0) {
        this.field1167 += arg0;
        int var2 = this.field1464.field298 + this.field1209;
        int var3 = this.field1464.field299 + this.field1359;
        if (this.field1258 - var2 < -500 || this.field1258 - var2 > 500 || this.field1259 - var3 < -500 || this.field1259 - var3 > 500) {
            this.field1258 = var2;
            this.field1259 = var3;
        }
        if (this.field1258 != var2) {
            this.field1258 += (var2 - this.field1258) / 16;
        }
        if (this.field1259 != var3) {
            this.field1259 += (var3 - this.field1259) / 16;
        }
        if (super.field23[1] == 1) {
            this.field1067 += (-24 - this.field1067) / 2;
        } else if (super.field23[2] == 1) {
            this.field1067 += (24 - this.field1067) / 2;
        } else {
            this.field1067 /= 2;
        }
        if (super.field23[3] == 1) {
            this.field1068 += (12 - this.field1068) / 2;
        } else if (super.field23[4] == 1) {
            this.field1068 += (-12 - this.field1068) / 2;
        } else {
            this.field1068 /= 2;
        }
        this.field1066 = this.field1067 / 2 + this.field1066 & 2047;
        this.field1065 += this.field1068 / 2;
        if (this.field1065 < 128) {
            this.field1065 = 128;
        }
        if (this.field1065 > 383) {
            this.field1065 = 383;
        }
        int var4 = this.field1258 >> 7;
        int var5 = this.field1259 >> 7;
        int var6 = this.method449(this.field1333, field1131, this.field1259, this.field1258);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    int var10 = this.field1333;
                    if (var10 < 3 && (this.field1118[1][var8][var9] & 2) == 2) {
                        ++var10;
                    }
                    int var11 = var6 - this.field1161[var10][var8][var9];
                    if (var11 > var7) {
                        var7 = var11;
                    }
                }
            }
        }
        ++field1367;
        if (field1367 > 77) {
            field1367 = 0;
            this.field1451.method198(true, 57);
        }
        int var12 = var7 * 192;
        if (var12 > 98048) {
            var12 = 98048;
        }
        if (var12 < 32768) {
            var12 = 32768;
        }
        if (var12 > this.field1364) {
            this.field1364 += (var12 - this.field1364) / 24;
        } else if (var12 < this.field1364) {
            this.field1364 += (var12 - this.field1364) / 80;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public static final void method473(byte arg0) {
        World3D.field218 = true;
        Pix3D.field546 = true;
        field1327 = true;
        World.field34 = true;
        if (arg0 != 107) {
            field1131 = -432;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIIIIZII)Z")
    public final boolean method474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1355[var15][var35] = 0;
                this.field1250[var15][var35] = 99999999;
            }
        }
        int var16 = arg6;
        int var17 = arg2;
        if (arg5 <= 0) {
            this.field1451.method199(139);
        }
        this.field1355[arg6][arg2] = 99;
        this.field1250[arg6][arg2] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1073[var18] = arg6;
        int var36 = var18 + 1;
        this.field1074[var18] = arg2;
        boolean var20 = false;
        int var21 = this.field1073.length;
        int[][] var22 = this.field1369[this.field1333].field907;
        while (var36 != var19) {
            var16 = this.field1073[var19];
            var17 = this.field1074[var19];
            var19 = (var19 + 1) % var21;
            if (arg8 == var16 && arg1 == var17) {
                var20 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && this.field1369[this.field1333].method304(arg10 - 1, arg8, arg1, var17, arg4, true, var16)) {
                    var20 = true;
                    break;
                }
                if (arg10 < 10 && this.field1369[this.field1333].method305(false, arg1, var17, arg10 - 1, arg8, arg4, var16)) {
                    var20 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg0 != 0 && this.field1369[this.field1333].method306(arg1, arg8, var17, arg7, var16, true, arg0, arg11)) {
                var20 = true;
                break;
            }
            int var34 = this.field1250[var16][var17] + 1;
            if (var16 > 0 && this.field1355[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1073[var36] = var16 - 1;
                this.field1074[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1355[var16 - 1][var17] = 2;
                this.field1250[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1355[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1073[var36] = var16 + 1;
                this.field1074[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1355[var16 + 1][var17] = 8;
                this.field1250[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1355[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1073[var36] = var16;
                this.field1074[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1355[var16][var17 - 1] = 1;
                this.field1250[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1355[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1073[var36] = var16;
                this.field1074[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1355[var16][var17 + 1] = 4;
                this.field1250[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1355[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1073[var36] = var16 - 1;
                this.field1074[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1355[var16 - 1][var17 - 1] = 3;
                this.field1250[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1355[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1073[var36] = var16 + 1;
                this.field1074[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1355[var16 + 1][var17 - 1] = 9;
                this.field1250[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1355[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1073[var36] = var16 - 1;
                this.field1074[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1355[var16 - 1][var17 + 1] = 6;
                this.field1250[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1355[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1073[var36] = var16 + 1;
                this.field1074[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1355[var16 + 1][var17 + 1] = 12;
                this.field1250[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1462 = 0;
        if (!var20) {
            if (arg9) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg8 - var24; var25 <= arg8 + var24; ++var25) {
                        for (int var26 = arg1 - var24; var26 <= arg1 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1250[var25][var26] < var23) {
                                var23 = this.field1250[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1462 = 1;
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
        this.field1073[var27] = var16;
        int var37 = var27 + 1;
        this.field1074[var27] = var17;
        int var28;
        int var29 = var28 = this.field1355[var16][var17];
        while (arg6 != var16 || arg2 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1073[var37] = var16;
                this.field1074[var37++] = var17;
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
            var29 = this.field1355[var16][var17];
        }
        if (var37 <= 0) {
            if (arg3 == 1) {
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
            int var31 = this.field1073[var37];
            int var32 = this.field1074[var37];
            field1311 += var30;
            if (field1311 >= 121) {
                this.field1451.method198(true, 215);
                this.field1451.method200(19217);
            }
            if (arg3 == 0) {
                this.field1451.method198(true, 74);
                this.field1451.method199(var30 + var30 + 3);
            }
            if (arg3 == 1) {
                this.field1451.method198(true, 37);
                this.field1451.method199(var30 + var30 + 3 + 14);
            }
            if (arg3 == 2) {
                this.field1451.method198(true, 73);
                this.field1451.method199(var30 + var30 + 3);
            }
            if (super.field23[5] == 1) {
                this.field1451.method199(1);
            } else {
                this.field1451.method199(0);
            }
            this.field1451.method200(this.field1473 + var31);
            this.field1451.method200(this.field1474 + var32);
            this.field1085 = this.field1073[0];
            this.field1086 = this.field1074[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1451.method199(this.field1073[var37] - var31);
                this.field1451.method199(this.field1074[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    public final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 <= 0) {
            this.field1322 = null;
        }
        if (arg3 >= 1 && arg4 >= 1 && arg3 <= 102 && arg4 <= 102) {
            if (field1327 && this.field1333 != arg6) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg7 == 0) {
                var9 = this.field1448.method77(arg6, arg3, arg4);
            }
            if (arg7 == 1) {
                var9 = this.field1448.method78(arg3, (byte) 116, arg4, arg6);
            }
            if (arg7 == 2) {
                var9 = this.field1448.method79(arg6, arg3, arg4);
            }
            if (arg7 == 3) {
                var9 = this.field1448.method80(arg6, arg3, arg4);
            }
            if (var9 != 0) {
                int var13 = this.field1448.method81(arg6, arg3, arg4, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg7 == 0) {
                    this.field1448.method72(0, arg4, arg6, arg3);
                    LocType var17 = LocType.method275(var14);
                    if (var17.field796) {
                        this.field1369[arg6].method300(arg4, var16, arg3, var15, var17.field797, 16629);
                    }
                }
                if (arg7 == 1) {
                    this.field1448.method73(arg6, arg4, true, arg3);
                }
                if (arg7 == 2) {
                    this.field1448.method74(arg4, arg3, arg6, -11465);
                    LocType var18 = LocType.method275(var14);
                    if (var18.field794 + arg3 > 103 || var18.field794 + arg4 > 103 || var18.field795 + arg3 > 103 || var18.field795 + arg4 > 103) {
                        return;
                    }
                    if (var18.field796) {
                        this.field1369[arg6].method301(var16, arg3, var18.field795, arg4, var18.field797, var18.field794, 5);
                    }
                }
                if (arg7 == 3) {
                    this.field1448.method75(false, arg4, arg3, arg6);
                    LocType var19 = LocType.method275(var14);
                    if (var19.field796 && var19.field798) {
                        this.field1369[arg6].method303((byte) 5, arg4, arg3);
                    }
                }
            }
            if (arg2 >= 0) {
                int var20 = arg6;
                if (arg6 < 3 && (this.field1118[1][arg3][arg4] & 2) == 2) {
                    var20 = arg6 + 1;
                }
                World.method28(this.field1448, this.field1484, this.field1161, arg4, arg3, var20, -360, this.field1369[arg6], arg2, arg6, arg0, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method476(byte arg0) {
        if (this.field1202 > 1) {
            --this.field1202;
        }
        if (this.field1171 > 0) {
            --this.field1171;
        }
        for (int var2 = 0; var2 < 5 && this.method408(this.field1478); ++var2) {
        }
        if (this.field1483) {
            int var10002;
            for (int var3 = 0; var3 < this.field1253; ++var3) {
                if (this.field1106[var3] <= 0) {
                    boolean var4 = false;
                    try {
                        if (this.field1361[var3] == this.field1242 && this.field1203[var3] == this.field1351) {
                            if (!this.method462(421)) {
                                var4 = true;
                            }
                        } else {
                            Packet var5 = Wave.method264(this.field1203[var3], 3, this.field1361[var3]);
                            if (System.currentTimeMillis() + (long) (var5.field612 / 22) > (long) (this.field1102 / 22) + this.field1132) {
                                this.field1102 = var5.field612;
                                this.field1132 = System.currentTimeMillis();
                                if (this.method461(var5.field612, (byte) 0, var5.field611)) {
                                    this.field1242 = this.field1361[var3];
                                    this.field1351 = this.field1203[var3];
                                } else {
                                    var4 = true;
                                }
                            }
                        }
                    } catch (Exception var21) {
                    }
                    if (var4 && this.field1106[var3] != -5) {
                        this.field1106[var3] = -5;
                    } else {
                        --this.field1253;
                        for (int var7 = var3; var7 < this.field1253; ++var7) {
                            this.field1361[var7] = this.field1361[var7 + 1];
                            this.field1203[var7] = this.field1203[var7 + 1];
                            this.field1106[var7] = this.field1106[var7 + 1];
                        }
                        --var3;
                    }
                } else {
                    var10002 = this.field1106[var3]--;
                }
            }
            if (this.field1143 > 0) {
                this.field1143 -= 20;
                if (this.field1143 < 0) {
                    this.field1143 = 0;
                }
                if (this.field1143 == 0 && this.field1134 && !field1327) {
                    this.method425(this.field1109, this.field1350, -48, this.field1315);
                }
            }
            if (InputTracking.field73) {
                Packet var8 = InputTracking.method36(866);
                if (var8 != null) {
                    this.field1451.method198(true, 53);
                    this.field1451.method200(var8.field612);
                    this.field1451.method207(var8.field612, var8.field611, 25772, 0);
                    var8.method197(false);
                }
            }
            ++this.field1169;
            if (this.field1169 > 750) {
                this.method394(this.field1463);
            }
            this.method429(617);
            this.method417((byte) 70);
            this.method403(0);
            this.method467(-523);
            if ((super.field23[1] == 1 || super.field23[2] == 1 || super.field23[3] == 1 || super.field23[4] == 1) && this.field1260++ > 5) {
                this.field1260 = 0;
                this.field1451.method198(true, 109);
                this.field1451.method200(this.field1065);
                this.field1451.method200(this.field1066);
                this.field1451.method199(this.field1486);
                this.field1451.method199(this.field1195);
            }
            ++this.field1271;
            if (this.field1218 != 0) {
                this.field1217 += 20;
                if (this.field1217 >= 400) {
                    this.field1218 = 0;
                }
            }
            if (this.field1291 != 0) {
                ++this.field1288;
                if (this.field1288 >= 15) {
                    if (this.field1291 == 2) {
                        this.field1092 = true;
                    }
                    if (this.field1291 == 3) {
                        this.field1176 = true;
                    }
                    this.field1291 = 0;
                }
            }
            if (this.field1300 != 0) {
                ++this.field1255;
                if (super.field18 > this.field1301 + 5 || super.field18 < this.field1301 - 5 || super.field19 > this.field1302 + 5 || super.field19 < this.field1302 - 5) {
                    this.field1417 = true;
                }
                if (super.field17 == 0) {
                    if (this.field1300 == 2) {
                        this.field1092 = true;
                    }
                    if (this.field1300 == 3) {
                        this.field1176 = true;
                    }
                    this.field1300 = 0;
                    if (this.field1417 && this.field1255 >= 5) {
                        this.field1385 = -1;
                        this.method443(4);
                        if (this.field1385 == this.field1298 && this.field1384 != this.field1299) {
                            Component var9 = Component.field933[this.field1298];
                            int var10 = var9.field934[this.field1384];
                            var9.field934[this.field1384] = var9.field934[this.field1299];
                            var9.field934[this.field1299] = var10;
                            int var11 = var9.field935[this.field1384];
                            var9.field935[this.field1384] = var9.field935[this.field1299];
                            var9.field935[this.field1299] = var11;
                            this.field1451.method198(true, 80);
                            this.field1451.method200(this.field1298);
                            this.field1451.method200(this.field1299);
                            this.field1451.method200(this.field1384);
                        }
                    } else if ((this.field1295 == 1 || this.method432(this.field1164 - 1, (byte) -15)) && this.field1164 > 2) {
                        this.method458(-4311);
                    } else if (this.field1164 > 0) {
                        this.method436(0, this.field1164 - 1);
                    }
                    this.field1288 = 10;
                    super.field20 = 0;
                }
            }
            if (World3D.field252 != -1) {
                int var12 = World3D.field252;
                int var13 = World3D.field253;
                boolean var14 = this.method474(0, var13, this.field1464.field347[0], 0, 0, 737, this.field1464.field346[0], 0, var12, true, 0, 0);
                World3D.field252 = -1;
                if (var14) {
                    this.field1215 = super.field21;
                    this.field1216 = super.field22;
                    this.field1218 = 1;
                    this.field1217 = 0;
                }
            }
            if (super.field20 == 1 && this.field1362 != null) {
                this.field1362 = null;
                this.field1176 = true;
                super.field20 = 0;
            }
            this.method439(480);
            this.method391(this.field1163);
            this.method383((byte) 78);
            if (arg0 != -91) {
                this.field1463 = 318;
            }
            this.method376(38236);
            if (super.field17 == 1 || super.field20 == 1) {
                ++this.field1408;
            }
            if (this.field1277 == 2) {
                this.method472(this.field1133);
            }
            if (this.field1277 == 2 && this.field1305) {
                this.method366(true);
            }
            for (int var15 = 0; var15 < 5; ++var15) {
                var10002 = this.field1275[var15]++;
            }
            this.method401(51);
            ++field1339;
            if (field1339 > 54) {
                field1339 = 0;
                this.field1451.method198(true, 180);
            }
            ++super.field16;
            if (super.field16 > 4500) {
                this.field1171 = 250;
                super.field16 -= 500;
                this.field1451.method198(true, 161);
            }
            ++this.field1076;
            if (this.field1076 > 500) {
                this.field1076 = 0;
                int var16 = (int) (Math.random() * 8.0D);
                if ((var16 & 1) == 1) {
                    this.field1209 += this.field1210;
                }
                if ((var16 & 2) == 2) {
                    this.field1359 += this.field1360;
                }
                if ((var16 & 4) == 4) {
                    this.field1200 += this.field1201;
                }
            }
            if (this.field1209 < -50) {
                this.field1210 = 2;
            }
            if (this.field1209 > 50) {
                this.field1210 = -2;
            }
            if (this.field1359 < -55) {
                this.field1360 = 2;
            }
            if (this.field1359 > 55) {
                this.field1360 = -2;
            }
            if (this.field1200 < -40) {
                this.field1201 = 1;
            }
            if (this.field1200 > 40) {
                this.field1201 = -1;
            }
            ++this.field1488;
            if (this.field1488 > 500) {
                this.field1488 = 0;
                int var17 = (int) (Math.random() * 8.0D);
                if ((var17 & 1) == 1) {
                    this.field1486 += this.field1487;
                }
                if ((var17 & 2) == 2) {
                    this.field1195 += this.field1196;
                }
            }
            if (this.field1486 < -60) {
                this.field1487 = 2;
            }
            if (this.field1486 > 60) {
                this.field1487 = -2;
            }
            if (this.field1195 < -20) {
                this.field1196 = 1;
            }
            if (this.field1195 > 10) {
                this.field1196 = -1;
            }
            ++this.field1170;
            if (this.field1170 > 50) {
                this.field1451.method198(true, 126);
            }
            try {
                if (this.field1135 != null && this.field1451.field612 > 0) {
                    this.field1135.method33(this.field1451.field612, false, this.field1451.field611, 0);
                    this.field1451.field612 = 0;
                    this.field1170 = 0;
                }
            } catch (IOException var19) {
                this.method394(this.field1463);
            } catch (Exception var20) {
                this.method379(-41589);
            }
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)Ljava/lang/String;")
    public final String method477(int arg0) {
        if (arg0 <= 0) {
            this.method6();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field14 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method478(boolean arg0) {
        this.field1483 &= arg0;
        if (this.field1297 == 0) {
            int var2 = super.field9 / 2 - 80;
            int var3 = super.field10 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field20 == 1 && super.field21 >= var2 - 75 && super.field21 <= var2 + 75 && super.field22 >= var14 - 20 && super.field22 <= var14 + 20) {
                this.field1297 = 3;
                this.field1368 = 0;
            }
            int var4 = super.field9 / 2 + 80;
            if (super.field20 == 1 && super.field21 >= var4 - 75 && super.field21 <= var4 + 75 && super.field22 >= var14 - 20 && super.field22 <= var14 + 20) {
                this.field1357 = "";
                this.field1358 = "Enter your username & password.";
                this.field1297 = 2;
                this.field1368 = 0;
            }
        } else if (this.field1297 == 2) {
            int var5 = super.field10 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field20 == 1 && super.field22 >= var16 - 15 && super.field22 < var16) {
                this.field1368 = 0;
            }
            var5 = var16 + 15;
            if (super.field20 == 1 && super.field22 >= var5 - 15 && super.field22 < var5) {
                this.field1368 = 1;
            }
            var5 += 15;
            int var6 = super.field9 / 2 - 80;
            int var7 = super.field10 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field20 == 1 && super.field21 >= var6 - 75 && super.field21 <= var6 + 75 && super.field22 >= var17 - 20 && super.field22 <= var17 + 20) {
                this.method382(this.field1123, this.field1124, false);
            }
            int var8 = super.field9 / 2 + 80;
            if (super.field20 == 1 && super.field21 >= var8 - 75 && super.field21 <= var8 + 75 && super.field22 >= var17 - 20 && super.field22 <= var17 + 20) {
                this.field1297 = 0;
                this.field1123 = "";
                this.field1124 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method5(0);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field1490.length(); ++var11) {
                        if (var9 == field1490.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field1368 == 0) {
                        if (var9 == 8 && this.field1123.length() > 0) {
                            this.field1123 = this.field1123.substring(0, this.field1123.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1368 = 1;
                        }
                        if (var10) {
                            this.field1123 = this.field1123 + (char) var9;
                        }
                        if (this.field1123.length() > 12) {
                            this.field1123 = this.field1123.substring(0, 12);
                        }
                    } else if (this.field1368 == 1) {
                        if (var9 == 8 && this.field1124.length() > 0) {
                            this.field1124 = this.field1124.substring(0, this.field1124.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field1368 = 0;
                        }
                        if (var10) {
                            this.field1124 = this.field1124 + (char) var9;
                        }
                        if (this.field1124.length() > 20) {
                            this.field1124 = this.field1124.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field1297 == 3) {
                int var12 = super.field9 / 2;
                int var13 = super.field10 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field20 == 1 && super.field21 >= var12 - 75 && super.field21 <= var12 + 75 && super.field22 >= var18 - 20 && super.field22 <= var18 + 20) {
                    this.field1297 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method479(String arg0) throws IOException {
        return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method9(byte arg0) {
        if (!this.field1405 && !this.field1323 && !this.field1091) {
            if (!this.field1483) {
                this.method487(field1174);
            } else {
                this.method424(4833);
            }
            this.field1408 = 0;
            if (arg0 == 3) {
                boolean var2 = false;
            }
        } else {
            this.method488(451);
        }
    }

    @OriginalMember(owner = "client", name = "N", descriptor = "(I)V")
    public final void method480(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        for (ProjectileEntity var3 = (ProjectileEntity) this.field1261.method228(); var3 != null; var3 = (ProjectileEntity) this.field1261.method230(735)) {
            if (this.field1333 == var3.field381 && field1354 <= var3.field387) {
                if (field1354 >= var3.field386) {
                    if (var3.field390 > 0) {
                        NpcEntity var4 = this.field1317[var3.field390 - 1];
                        if (var4 != null) {
                            var3.method116(30695, var4.field298, this.method449(var3.field381, field1131, var4.field299, var4.field298) - var3.field385, var4.field299, field1354);
                        }
                    }
                    if (var3.field390 < 0) {
                        int var5 = -var3.field390 - 1;
                        PlayerEntity var6;
                        if (this.field1094 == var5) {
                            var6 = this.field1464;
                        } else {
                            var6 = this.field1343[var5];
                        }
                        if (var6 != null) {
                            var3.method116(30695, var6.field298, this.method449(var3.field381, field1131, var6.field299, var6.field298) - var3.field385, var6.field299, field1354);
                        }
                    }
                    var3.method117(this.field1271, -20);
                    this.field1448.method61((int) var3.field393, 60, (int) var3.field394, (Model) null, var3.field400, false, -1, 4, (int) var3.field392, var3, this.field1333);
                }
            } else {
                var3.method107();
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        SpotAnimEntity var2 = (SpotAnimEntity) this.field1379.method228();
        if (!arg0) {
            this.field1451.method199(103);
        }
        while (var2 != null) {
            if (this.field1333 == var2.field407 && !var2.field413) {
                if (field1354 >= var2.field406) {
                    var2.method118(0, this.field1271);
                    if (var2.field413) {
                        var2.method107();
                    } else {
                        this.field1448.method61(var2.field409, 60, var2.field410, (Model) null, 0, false, -1, 4, var2.field408, var2, var2.field407);
                    }
                }
            } else {
                var2.method107();
            }
            var2 = (SpotAnimEntity) this.field1379.method230(735);
        }
    }

    @OriginalMember(owner = "client", name = "O", descriptor = "(I)V")
    public final void method482(int arg0) {
        this.field1438 = 0;
        for (int var2 = -1; var2 < this.field1344 + this.field1318; ++var2) {
            PathingEntity var17;
            if (var2 == -1) {
                var17 = this.field1464;
            } else if (var2 < this.field1344) {
                var17 = this.field1343[this.field1345[var2]];
            } else {
                var17 = this.field1317[this.field1319[var2 - this.field1344]];
            }
            if (var17 != null && var17.method111(35155)) {
                if (var2 >= this.field1344) {
                    if (this.field1353 == 1 && this.field1319[var2 - this.field1344] == this.field1273 && field1354 % 20 < 10) {
                        this.method469(this.field1114, var17.field343 + 15, var17);
                        if (this.field1165 > -1) {
                            this.field1130[2].method173(this.field1165 - 12, this.field1166 - 28, -141);
                        }
                    }
                } else {
                    int var18 = 30;
                    PlayerEntity var19 = (PlayerEntity) var17;
                    if (var19.field359 != 0) {
                        this.method469(this.field1114, var17.field343 + 15, var17);
                        if (this.field1165 > -1) {
                            for (int var20 = 0; var20 < 8; ++var20) {
                                if ((var19.field359 & 1 << var20) != 0) {
                                    this.field1130[var20].method173(this.field1165 - 12, this.field1166 - var18, -141);
                                    var18 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1353 == 10 && this.field1345[var2] == this.field1426) {
                        this.method469(this.field1114, var17.field343 + 15, var17);
                        if (this.field1165 > -1) {
                            this.field1130[7].method173(this.field1165 - 12, this.field1166 - var18, -141);
                        }
                    }
                }
                if (var17.field310 != null && (var2 >= this.field1344 || this.field1470 == 0 || this.field1470 == 3 || this.field1470 == 1 && this.method370(34304, ((PlayerEntity) var17).field356))) {
                    this.method469(this.field1114, var17.field343, var17);
                    if (this.field1165 > -1 && this.field1438 < this.field1439) {
                        this.field1443[this.field1438] = this.field1248.method190(var17.field310, (byte) 3) / 2;
                        this.field1442[this.field1438] = this.field1248.field600;
                        this.field1440[this.field1438] = this.field1165;
                        this.field1441[this.field1438] = this.field1166;
                        this.field1444[this.field1438] = var17.field312;
                        this.field1445[this.field1438] = var17.field313;
                        this.field1446[this.field1438] = var17.field311;
                        this.field1447[this.field1438++] = var17.field310;
                        if (this.field1471 == 0 && var17.field313 == 1) {
                            this.field1442[this.field1438] += 10;
                            this.field1441[this.field1438] += 5;
                        }
                        if (this.field1471 == 0 && var17.field313 == 2) {
                            this.field1443[this.field1438] = 60;
                        }
                    }
                }
                if (var17.field316 > field1354 + 100) {
                    this.method469(this.field1114, var17.field343 + 15, var17);
                    if (this.field1165 > -1) {
                        int var21 = var17.field317 * 30 / var17.field318;
                        if (var21 > 30) {
                            var21 = 30;
                        }
                        Pix2D.method149(var21, 5, 65280, this.field1166 - 3, (byte) -37, this.field1165 - 15);
                        Pix2D.method149(30 - var21, 5, 16711680, this.field1166 - 3, (byte) -37, this.field1165 - 15 + var21);
                    }
                }
                if (var17.field316 > field1354 + 330) {
                    this.method469(this.field1114, var17.field343 / 2, var17);
                    if (this.field1165 > -1) {
                        this.field1269[var17.field315].method173(this.field1165 - 12, this.field1166 - 12, -141);
                        this.field1246.method188(String.valueOf(var17.field314), this.field1166 + 4, this.field1165, field1263, 0);
                        this.field1246.method188(String.valueOf(var17.field314), this.field1166 + 3, this.field1165 - 1, field1263, 16777215);
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field1438; ++var3) {
            int var4 = this.field1440[var3];
            int var5 = this.field1441[var3];
            int var6 = this.field1443[var3];
            int var7 = this.field1442[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var16 = 0; var16 < var3; ++var16) {
                    if (var5 + 2 > this.field1441[var16] - this.field1442[var16] && var5 - var7 < this.field1441[var16] + 2 && var4 - var6 < this.field1443[var16] + this.field1440[var16] && var4 + var6 > this.field1440[var16] - this.field1443[var16] && this.field1441[var16] - this.field1442[var16] < var5) {
                        var5 = this.field1441[var16] - this.field1442[var16];
                        var8 = true;
                    }
                }
            }
            this.field1165 = this.field1440[var3];
            this.field1166 = this.field1441[var3] = var5;
            String var9 = this.field1447[var3];
            if (this.field1471 == 0) {
                int var10 = 16776960;
                if (this.field1444[var3] < 6) {
                    var10 = this.field1177[this.field1444[var3]];
                }
                if (this.field1444[var3] == 6) {
                    var10 = this.field1370 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1444[var3] == 7) {
                    var10 = this.field1370 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1444[var3] == 8) {
                    var10 = this.field1370 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1444[var3] == 9) {
                    int var11 = 150 - this.field1446[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field1444[var3] == 10) {
                    int var12 = 150 - this.field1446[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field1444[var3] == 11) {
                    int var13 = 150 - this.field1446[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field1445[var3] == 0) {
                    this.field1248.method188(var9, this.field1166 + 1, this.field1165, field1263, 0);
                    this.field1248.method188(var9, this.field1166, this.field1165, field1263, var10);
                }
                if (this.field1445[var3] == 1) {
                    this.field1248.method192(0, var9, this.field1370, 670, this.field1165, this.field1166 + 1);
                    this.field1248.method192(var10, var9, this.field1370, 670, this.field1165, this.field1166);
                }
                if (this.field1445[var3] == 2) {
                    int var14 = this.field1248.method190(var9, (byte) 3);
                    int var15 = (150 - this.field1446[var3]) * (var14 + 100) / 150;
                    Pix2D.method147(0, this.field1165 + 50, 334, true, this.field1165 - 50);
                    this.field1248.method191(1, 0, this.field1165 + 50 - var15, var9, this.field1166 + 1);
                    this.field1248.method191(1, var10, this.field1165 + 50 - var15, var9, this.field1166);
                    Pix2D.method146(true);
                }
            } else {
                this.field1248.method188(var9, this.field1166 + 1, this.field1165, field1263, 0);
                this.field1248.method188(var9, this.field1166, this.field1165, field1263, 16776960);
            }
        }
        if (arg0 != 3) {
            this.field1114 = !this.field1114;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method483(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field1243 >= 100) {
                this.method380(-823, 0, "", "Your friends list is full. Max of 100 hit");
            } else {
                String var4 = JString.method255(false, JString.method252(false, arg0));
                for (int var5 = 0; var5 < this.field1243; ++var5) {
                    if (this.field1234[var5] == arg0) {
                        this.method380(-823, 0, "", var4 + " is already on your friend list");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1306; ++var6) {
                    if (this.field1182[var6] == arg0) {
                        this.method380(-823, 0, "", "Please remove " + var4 + " from your ignore list first");
                        return;
                    }
                }
                if (!var4.equals(this.field1464.field356)) {
                    this.field1328[this.field1243] = var4;
                    this.field1234[this.field1243] = arg0;
                    this.field1320[this.field1243] = 0;
                    ++this.field1243;
                    this.field1092 = true;
                    this.field1451.method198(true, 66);
                    this.field1451.method205(arg0, 0);
                    if (arg1 != 8) {
                        for (int var7 = 1; var7 > 0; ++var7) {
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)Ljava/lang/String;")
    private static final String method484(byte arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        if (arg0 == 1) {
            boolean var3 = false;
        } else {
            field1174 = 83;
        }
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILbc;II)V")
    public final void method485(int arg0, int arg1, NpcType arg2, int arg3, int arg4) {
        if (this.field1164 < 400) {
            String var6 = arg2.field829;
            if (arg4 != -28641) {
                this.field1334 = 242;
            }
            if (arg2.field847 != 0) {
                var6 = var6 + method384(this.field1464.field362, 0, arg2.field847) + " (level-" + arg2.field847 + ")";
            }
            if (this.field1455 == 1) {
                this.field1158[this.field1164] = "Use " + this.field1459 + " with @yel@" + var6;
                this.field1422[this.field1164] = 493;
                this.field1423[this.field1164] = arg1;
                this.field1420[this.field1164] = arg0;
                this.field1421[this.field1164] = arg3;
                ++this.field1164;
            } else {
                if (this.field1465 == 1) {
                    if ((this.field1467 & 2) == 2) {
                        this.field1158[this.field1164] = this.field1468 + " @yel@" + var6;
                        this.field1422[this.field1164] = 500;
                        this.field1423[this.field1164] = arg1;
                        this.field1420[this.field1164] = arg0;
                        this.field1421[this.field1164] = arg3;
                        ++this.field1164;
                        return;
                    }
                } else {
                    if (arg2.field842 != null) {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (arg2.field842[var7] != null && !arg2.field842[var7].equalsIgnoreCase("attack")) {
                                this.field1158[this.field1164] = arg2.field842[var7] + " @yel@" + var6;
                                if (var7 == 0) {
                                    this.field1422[this.field1164] = 988;
                                }
                                if (var7 == 1) {
                                    this.field1422[this.field1164] = 345;
                                }
                                if (var7 == 2) {
                                    this.field1422[this.field1164] = 249;
                                }
                                if (var7 == 3) {
                                    this.field1422[this.field1164] = 960;
                                }
                                if (var7 == 4) {
                                    this.field1422[this.field1164] = 40;
                                }
                                this.field1423[this.field1164] = arg1;
                                this.field1420[this.field1164] = arg0;
                                this.field1421[this.field1164] = arg3;
                                ++this.field1164;
                            }
                        }
                    }
                    if (arg2.field842 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (arg2.field842[var8] != null && arg2.field842[var8].equalsIgnoreCase("attack")) {
                                short var9 = 0;
                                if (arg2.field847 > this.field1464.field362) {
                                    var9 = 2000;
                                }
                                this.field1158[this.field1164] = arg2.field842[var8] + " @yel@" + var6;
                                if (var8 == 0) {
                                    this.field1422[this.field1164] = var9 + 988;
                                }
                                if (var8 == 1) {
                                    this.field1422[this.field1164] = var9 + 345;
                                }
                                if (var8 == 2) {
                                    this.field1422[this.field1164] = var9 + 249;
                                }
                                if (var8 == 3) {
                                    this.field1422[this.field1164] = var9 + 960;
                                }
                                if (var8 == 4) {
                                    this.field1422[this.field1164] = var9 + 40;
                                }
                                this.field1423[this.field1164] = arg1;
                                this.field1420[this.field1164] = arg0;
                                this.field1421[this.field1164] = arg3;
                                ++this.field1164;
                            }
                        }
                    }
                    this.field1158[this.field1164] = "Examine @yel@" + var6;
                    this.field1422[this.field1164] = 1814;
                    this.field1423[this.field1164] = arg1;
                    this.field1420[this.field1164] = arg0;
                    this.field1421[this.field1164] = arg3;
                    ++this.field1164;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method486(boolean arg0) {
        this.field1175 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1272) {
                this.method456((byte) 0);
                this.method456((byte) 0);
                this.method441((byte) 98);
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
        this.field1175 = false;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "P", descriptor = "(I)V")
    public final void method487(int arg0) {
        this.method444(35);
        this.field1394.method235(735);
        this.field1402.method186(0, 0, -141);
        short var2 = 360;
        short var3 = 200;
        if (arg0 == 0) {
            if (this.field1297 == 0) {
                int var4 = var3 / 2 - 20;
                this.field1248.method189(this.field1157, "Welcome to RuneScape", 16776960, var2 / 2, var4, true);
                int var15 = var4 + 30;
                int var5 = var2 / 2 - 80;
                int var6 = var3 / 2 + 20;
                this.field1403.method186(var5 - 73, var6 - 20, -141);
                this.field1248.method189(this.field1157, "New user", 16777215, var5, var6 + 5, true);
                int var7 = var2 / 2 + 80;
                this.field1403.method186(var7 - 73, var6 - 20, -141);
                this.field1248.method189(this.field1157, "Existing User", 16777215, var7, var6 + 5, true);
            }
            if (this.field1297 == 2) {
                int var8 = var3 / 2 - 40;
                if (this.field1357.length() > 0) {
                    this.field1248.method189(this.field1157, this.field1357, 16776960, var2 / 2, var8 - 15, true);
                    this.field1248.method189(this.field1157, this.field1358, 16776960, var2 / 2, var8, true);
                    var8 += 30;
                } else {
                    this.field1248.method189(this.field1157, this.field1358, 16776960, var2 / 2, var8 - 7, true);
                    var8 += 30;
                }
                this.field1248.method193(931, true, "Username: " + this.field1123 + (this.field1368 == 0 & field1354 % 40 < 20 ? "@yel@|" : ""), var8, var2 / 2 - 90, 16777215);
                var8 += 15;
                this.field1248.method193(931, true, "Password: " + JString.method257(this.field1124, (byte) 3) + (this.field1368 == 1 & field1354 % 40 < 20 ? "@yel@|" : ""), var8, var2 / 2 - 88, 16777215);
                var8 += 15;
                int var9 = var2 / 2 - 80;
                int var10 = var3 / 2 + 50;
                this.field1403.method186(var9 - 73, var10 - 20, -141);
                this.field1248.method189(this.field1157, "Login", 16777215, var9, var10 + 5, true);
                int var11 = var2 / 2 + 80;
                this.field1403.method186(var11 - 73, var10 - 20, -141);
                this.field1248.method189(this.field1157, "Cancel", 16777215, var11, var10 + 5, true);
            }
            if (this.field1297 == 3) {
                this.field1248.method189(this.field1157, "Create a free account", 16776960, var2 / 2, var3 / 2 - 60, true);
                int var12 = var3 / 2 - 35;
                this.field1248.method189(this.field1157, "To create a new account you need to", 16777215, var2 / 2, var12, true);
                int var16 = var12 + 15;
                this.field1248.method189(this.field1157, "go back to the main RuneScape webpage", 16777215, var2 / 2, var16, true);
                int var17 = var16 + 15;
                this.field1248.method189(this.field1157, "and choose the red 'create account'", 16777215, var2 / 2, var17, true);
                int var18 = var17 + 15;
                this.field1248.method189(this.field1157, "button at the top right of that page.", 16777215, var2 / 2, var18, true);
                int var19 = var18 + 15;
                int var13 = var2 / 2;
                int var14 = var3 / 2 + 50;
                this.field1403.method186(var13 - 73, var14 - 20, -141);
                this.field1248.method189(this.field1157, "Cancel", 16777215, var13, var14 + 5, true);
            }
            this.field1394.method236(214, 186, super.field11, (byte) 5);
            if (this.field1489) {
                this.field1489 = false;
                this.field1392.method236(128, 0, super.field11, (byte) 5);
                this.field1393.method236(214, 386, super.field11, (byte) 5);
                this.field1397.method236(0, 265, super.field11, (byte) 5);
                this.field1398.method236(574, 265, super.field11, (byte) 5);
                this.field1399.method236(128, 186, super.field11, (byte) 5);
                this.field1400.method236(574, 186, super.field11, (byte) 5);
            }
        }
    }

    @OriginalMember(owner = "client", name = "Q", descriptor = "(I)V")
    public final void method488(int arg0) {
        Graphics var2 = this.method11(101).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 789, 532);
        int var3 = 64 / arg0;
        this.method4(1, false);
        if (this.field1323) {
            this.field1272 = false;
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
        if (this.field1091) {
            this.field1272 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1405) {
            this.field1272 = false;
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

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field1280[var1] = var0 / 4;
        }
        field1324 = 10;
        field1326 = true;
        field1337 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field1404 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field1490 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    }
}
