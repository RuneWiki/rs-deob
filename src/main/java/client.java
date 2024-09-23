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

    @OriginalMember(owner = "client", name = "I", descriptor = "Lob;")
    private LinkList field1087 = new LinkList(2);

    @OriginalMember(owner = "client", name = "K", descriptor = "Z")
    private boolean field1089 = false;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private final int field1090 = 100;

    @OriginalMember(owner = "client", name = "M", descriptor = "[I")
    private int[] field1091 = new int[100];

    @OriginalMember(owner = "client", name = "O", descriptor = "[I")
    private int[] field1093 = new int[5];

    @OriginalMember(owner = "client", name = "P", descriptor = "[J")
    private long[] field1094 = new long[100];

    @OriginalMember(owner = "client", name = "ab", descriptor = "Z")
    private boolean field1105 = false;

    @OriginalMember(owner = "client", name = "bb", descriptor = "Lob;")
    private LinkList field1106 = new LinkList(2);

    @OriginalMember(owner = "client", name = "cb", descriptor = "I")
    private int field1107 = -1;

    @OriginalMember(owner = "client", name = "db", descriptor = "[Lib;")
    private Pix8[] field1108 = new Pix8[50];

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field1110 = 2;

    @OriginalMember(owner = "client", name = "gb", descriptor = "Z")
    private boolean field1111 = false;

    @OriginalMember(owner = "client", name = "lb", descriptor = "[I")
    private int[] field1116 = new int[50];

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field1118 = 4;

    @OriginalMember(owner = "client", name = "ob", descriptor = "Z")
    private boolean field1119 = false;

    @OriginalMember(owner = "client", name = "ub", descriptor = "I")
    private int field1125 = -373;

    @OriginalMember(owner = "client", name = "vb", descriptor = "Z")
    private boolean field1126 = false;

    @OriginalMember(owner = "client", name = "xb", descriptor = "[I")
    private int[] field1128 = new int[50];

    @OriginalMember(owner = "client", name = "zb", descriptor = "Z")
    private boolean field1130 = false;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field1131 = -1;

    @OriginalMember(owner = "client", name = "Db", descriptor = "I")
    private int field1134 = 958;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "[I")
    private int[] field1137 = new int[5];

    @OriginalMember(owner = "client", name = "Hb", descriptor = "Ljava/lang/Object;")
    private Object field1138 = new Object();

    @OriginalMember(owner = "client", name = "Ib", descriptor = "Z")
    private boolean field1139 = true;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field1142 = 50;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "[I")
    private int[] field1143 = new int[this.field1142];

    @OriginalMember(owner = "client", name = "Nb", descriptor = "[I")
    private int[] field1144 = new int[this.field1142];

    @OriginalMember(owner = "client", name = "Ob", descriptor = "[I")
    private int[] field1145 = new int[this.field1142];

    @OriginalMember(owner = "client", name = "Pb", descriptor = "[I")
    private int[] field1146 = new int[this.field1142];

    @OriginalMember(owner = "client", name = "Qb", descriptor = "[I")
    private int[] field1147 = new int[this.field1142];

    @OriginalMember(owner = "client", name = "Rb", descriptor = "[I")
    private int[] field1148 = new int[this.field1142];

    @OriginalMember(owner = "client", name = "Sb", descriptor = "[I")
    private int[] field1149 = new int[this.field1142];

    @OriginalMember(owner = "client", name = "Tb", descriptor = "[Ljava/lang/String;")
    private String[] field1150 = new String[this.field1142];

    @OriginalMember(owner = "client", name = "Wb", descriptor = "[B")
    private byte[] field1153 = new byte[16384];

    @OriginalMember(owner = "client", name = "cc", descriptor = "Lkb;")
    private Packet field1159 = Packet.method196((byte) 2, 1);

    @OriginalMember(owner = "client", name = "fc", descriptor = "[Lib;")
    private Pix8[] field1162 = new Pix8[13];

    @OriginalMember(owner = "client", name = "gc", descriptor = "[I")
    private int[] field1163 = new int[5];

    @OriginalMember(owner = "client", name = "hc", descriptor = "B")
    private byte field1164 = -56;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field1167 = 508;

    @OriginalMember(owner = "client", name = "lc", descriptor = "Z")
    private boolean field1168 = true;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field1169 = -189;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field1171 = 3;

    @OriginalMember(owner = "client", name = "tc", descriptor = "[I")
    private int[] field1176 = new int[100];

    @OriginalMember(owner = "client", name = "uc", descriptor = "[Ljava/lang/String;")
    private String[] field1177 = new String[100];

    @OriginalMember(owner = "client", name = "vc", descriptor = "[Ljava/lang/String;")
    private String[] field1178 = new String[100];

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field1181 = 128;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field1188 = -767;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "B")
    private byte field1190 = 7;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "Lhc;")
    private Component field1192 = new Component();

    @OriginalMember(owner = "client", name = "Oc", descriptor = "Lob;")
    private LinkList field1197 = new LinkList(2);

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field1198 = 999;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field1199 = 2048;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field1200 = 2047;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "[Lz;")
    private PlayerEntity[] field1201 = new PlayerEntity[this.field1199];

    @OriginalMember(owner = "client", name = "Uc", descriptor = "[I")
    public int[] field1203 = new int[this.field1199];

    @OriginalMember(owner = "client", name = "Wc", descriptor = "[I")
    private int[] field1205 = new int[this.field1199];

    @OriginalMember(owner = "client", name = "Xc", descriptor = "[Lkb;")
    private Packet[] field1206 = new Packet[this.field1199];

    @OriginalMember(owner = "client", name = "Yc", descriptor = "[I")
    private int[] field1207 = new int[50];

    @OriginalMember(owner = "client", name = "Zc", descriptor = "[I")
    private final int[] field1208 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "dd", descriptor = "[Ljava/lang/String;")
    private String[] field1212 = new String[500];

    @OriginalMember(owner = "client", name = "ed", descriptor = "Z")
    private boolean field1213 = true;

    @OriginalMember(owner = "client", name = "fd", descriptor = "Z")
    private boolean field1214 = false;

    @OriginalMember(owner = "client", name = "gd", descriptor = "[I")
    private int[] field1215 = new int[2000];

    @OriginalMember(owner = "client", name = "hd", descriptor = "Z")
    private boolean field1216 = false;

    @OriginalMember(owner = "client", name = "ld", descriptor = "[I")
    private int[] field1220 = new int[500];

    @OriginalMember(owner = "client", name = "md", descriptor = "[I")
    private int[] field1221 = new int[500];

    @OriginalMember(owner = "client", name = "nd", descriptor = "[I")
    private int[] field1222 = new int[500];

    @OriginalMember(owner = "client", name = "od", descriptor = "[I")
    private int[] field1223 = new int[500];

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private int field1228 = -1;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field1229 = -1;

    @OriginalMember(owner = "client", name = "vd", descriptor = "I")
    private int field1230 = 3353893;

    @OriginalMember(owner = "client", name = "wd", descriptor = "Z")
    private boolean field1231 = true;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field1233 = 2;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field1234 = -1;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "[[I")
    private int[][] field1235 = new int[104][104];

    @OriginalMember(owner = "client", name = "Cd", descriptor = "[[I")
    private int[][] field1237 = new int[104][104];

    @OriginalMember(owner = "client", name = "Dd", descriptor = "Z")
    private boolean field1238 = false;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field1240 = 2;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "Ljava/lang/String;")
    private String field1241 = "";

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field1244 = 1;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "Z")
    private boolean field1246 = false;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field1250 = 4;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "Z")
    private boolean field1251 = false;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "[Lhb;")
    private Pix32[] field1253 = new Pix32[50];

    @OriginalMember(owner = "client", name = "Ud", descriptor = "Z")
    private boolean field1255 = false;

    @OriginalMember(owner = "client", name = "ge", descriptor = "[I")
    private int[] field1267 = new int[151];

    @OriginalMember(owner = "client", name = "ie", descriptor = "[Z")
    private boolean[] field1269 = new boolean[5];

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field1271 = 7759444;

    @OriginalMember(owner = "client", name = "re", descriptor = "[[[Lob;")
    private LinkList[][][] field1278 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "te", descriptor = "[I")
    private int[] field1280 = new int[1000];

    @OriginalMember(owner = "client", name = "ue", descriptor = "[I")
    private int[] field1281 = new int[1000];

    @OriginalMember(owner = "client", name = "xe", descriptor = "[I")
    private int[] field1284 = new int[4000];

    @OriginalMember(owner = "client", name = "ye", descriptor = "[I")
    private int[] field1285 = new int[4000];

    @OriginalMember(owner = "client", name = "Ae", descriptor = "Ljava/lang/String;")
    private String field1287 = "";

    @OriginalMember(owner = "client", name = "He", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1294 = new CRC32();

    @OriginalMember(owner = "client", name = "Ie", descriptor = "Z")
    private boolean field1295 = false;

    @OriginalMember(owner = "client", name = "Je", descriptor = "[Ly;")
    private NpcEntity[] field1296 = new NpcEntity[8192];

    @OriginalMember(owner = "client", name = "Le", descriptor = "[I")
    public int[] field1298 = new int[8192];

    @OriginalMember(owner = "client", name = "Me", descriptor = "[Ljava/lang/String;")
    private String[] field1299 = new String[100];

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field1300 = -1;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "Z")
    private boolean field1301 = true;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "Z")
    private boolean field1302 = false;

    @OriginalMember(owner = "client", name = "Re", descriptor = "B")
    private byte field1304 = 29;

    @OriginalMember(owner = "client", name = "Se", descriptor = "[[I")
    private int[][] field1305 = new int[104][104];

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field1306 = 9730;

    @OriginalMember(owner = "client", name = "Xe", descriptor = "I")
    private int field1310 = -43626;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field1312 = 35328;

    @OriginalMember(owner = "client", name = "af", descriptor = "Z")
    private boolean field1313 = false;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field1314 = 1;

    @OriginalMember(owner = "client", name = "gf", descriptor = "[I")
    private int[] field1319 = new int[2000];

    @OriginalMember(owner = "client", name = "hf", descriptor = "Z")
    private boolean field1320 = true;

    @OriginalMember(owner = "client", name = "uf", descriptor = "[I")
    private int[] field1332 = new int[100];

    @OriginalMember(owner = "client", name = "xf", descriptor = "Lkb;")
    private Packet field1335 = Packet.method196((byte) 2, 1);

    @OriginalMember(owner = "client", name = "yf", descriptor = "Lob;")
    private LinkList field1336 = new LinkList(2);

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private int field1338 = 4;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "B")
    private byte field1339 = 9;

    @OriginalMember(owner = "client", name = "Df", descriptor = "[I")
    public int[] field1341 = new int[1000];

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Z")
    private boolean field1342 = false;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "[I")
    private int[] field1344 = new int[50];

    @OriginalMember(owner = "client", name = "Hf", descriptor = "Ljava/lang/String;")
    private String field1345 = "";

    @OriginalMember(owner = "client", name = "If", descriptor = "Ljava/lang/String;")
    private String field1346 = "";

    @OriginalMember(owner = "client", name = "Kf", descriptor = "I")
    private int field1348 = 1;

    @OriginalMember(owner = "client", name = "Lf", descriptor = "Z")
    private boolean field1349 = false;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private int field1350 = -1;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "[I")
    private int[] field1351 = new int[33];

    @OriginalMember(owner = "client", name = "Pf", descriptor = "Lob;")
    private LinkList field1353 = new LinkList(2);

    @OriginalMember(owner = "client", name = "Rf", descriptor = "Lkb;")
    private Packet field1355 = Packet.method196((byte) 2, 1);

    @OriginalMember(owner = "client", name = "Sf", descriptor = "Z")
    private boolean field1356 = false;

    @OriginalMember(owner = "client", name = "dg", descriptor = "[I")
    private int[] field1367 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "gg", descriptor = "Ljava/lang/String;")
    private String field1370 = "";

    @OriginalMember(owner = "client", name = "jg", descriptor = "Z")
    private boolean field1373 = false;

    @OriginalMember(owner = "client", name = "mg", descriptor = "B")
    private byte field1376 = 3;

    @OriginalMember(owner = "client", name = "og", descriptor = "[Lhb;")
    private Pix32[] field1378 = new Pix32[20];

    @OriginalMember(owner = "client", name = "pg", descriptor = "[I")
    private int[] field1379 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Ig", descriptor = "B")
    private byte field1398 = 126;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "Z")
    private boolean field1405 = false;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "Ljava/lang/String;")
    private String field1407 = "";

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private int field1413 = -1;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private int field1415 = -1;

    @OriginalMember(owner = "client", name = "ah", descriptor = "I")
    private int field1416 = -1;

    @OriginalMember(owner = "client", name = "gh", descriptor = "B")
    private byte field1422 = 42;

    @OriginalMember(owner = "client", name = "xh", descriptor = "I")
    private int field1439 = -1;

    @OriginalMember(owner = "client", name = "yh", descriptor = "B")
    private byte field1440 = 123;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "I")
    private int field1443 = 2301979;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "Z")
    private boolean field1444 = false;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "[J")
    private long[] field1445 = new long[100];

    @OriginalMember(owner = "client", name = "Fh", descriptor = "Z")
    private boolean field1447 = false;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field1448 = -1;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "Z")
    private boolean field1453 = false;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field1454 = 9;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "B")
    private byte field1456 = 0;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "[Lhb;")
    private Pix32[] field1458 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Th", descriptor = "Ljava/lang/String;")
    private String field1461 = "";

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private int field1462 = 754;

    @OriginalMember(owner = "client", name = "ei", descriptor = "Z")
    private boolean field1472 = false;

    @OriginalMember(owner = "client", name = "fi", descriptor = "Z")
    private boolean field1473 = false;

    @OriginalMember(owner = "client", name = "gi", descriptor = "Ljava/lang/String;")
    private String field1474 = "";

    @OriginalMember(owner = "client", name = "hi", descriptor = "Ljava/lang/String;")
    private String field1475 = "";

    @OriginalMember(owner = "client", name = "ii", descriptor = "I")
    private int field1476 = 78;

    @OriginalMember(owner = "client", name = "ji", descriptor = "B")
    private byte field1477 = 5;

    @OriginalMember(owner = "client", name = "ki", descriptor = "[I")
    private int[] field1478 = new int[50];

    @OriginalMember(owner = "client", name = "ni", descriptor = "Z")
    private boolean field1481 = false;

    @OriginalMember(owner = "client", name = "vi", descriptor = "[I")
    private int[] field1489 = new int[9];

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field1490 = 3;

    @OriginalMember(owner = "client", name = "yi", descriptor = "[I")
    private int[] field1492 = new int[5];

    @OriginalMember(owner = "client", name = "Ai", descriptor = "[Lec;")
    private CollisionMap[] field1494 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "Bi", descriptor = "[Lhb;")
    private Pix32[] field1495 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "Ci", descriptor = "[I")
    private int[] field1496 = new int[7];

    @OriginalMember(owner = "client", name = "Di", descriptor = "[I")
    private int[] field1497 = new int[50];

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field1502 = 4;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "[I")
    private int[] field1503 = new int[151];

    @OriginalMember(owner = "client", name = "Oi", descriptor = "[I")
    private int[] field1508 = new int[5];

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private int field1511 = 2;

    @OriginalMember(owner = "client", name = "Si", descriptor = "Z")
    private boolean field1512 = false;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "[I")
    private int[] field1515 = new int[256];

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private int field1516 = -280;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "[Lhb;")
    private Pix32[] field1517 = new Pix32[8];

    @OriginalMember(owner = "client", name = "Yi", descriptor = "Z")
    private boolean field1518 = false;

    @OriginalMember(owner = "client", name = "fj", descriptor = "[I")
    private int[] field1525 = new int[33];

    @OriginalMember(owner = "client", name = "gj", descriptor = "I")
    private int field1526 = 5063219;

    @OriginalMember(owner = "client", name = "N", descriptor = "[I")
    private static int[] field1092 = new int[99];

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private static int field1112;

    @OriginalMember(owner = "client", name = "jb", descriptor = "Z")
    private static boolean field1114;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "B")
    private static byte field1136;

    @OriginalMember(owner = "client", name = "ac", descriptor = "B")
    private static byte field1157;

    @OriginalMember(owner = "client", name = "bc", descriptor = "Ljava/lang/String;")
    private static String field1158;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "[I")
    public static final int[] field1236;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private static int field1316;

    @OriginalMember(owner = "client", name = "tf", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1331;

    @OriginalMember(owner = "client", name = "ig", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1372;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "[[I")
    public static final int[][] field1510;

    @OriginalMember(owner = "client", name = "J", descriptor = "I")
    private int field1088;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private static int field1095;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field1096;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field1099;

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field1100;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field1101;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field1102;

    @OriginalMember(owner = "client", name = "Y", descriptor = "I")
    private int field1103;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private static int field1104;

    @OriginalMember(owner = "client", name = "eb", descriptor = "I")
    private int field1109;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private static int field1113;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field1117;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field1127;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field1132;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field1133;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private int field1135;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private int field1141;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field1154;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field1155;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1160;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field1161;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field1165;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field1166;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field1170;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field1179;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field1180;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field1182;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field1183;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field1184;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field1186;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field1189;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    private static int field1191;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field1202;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field1204;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field1209;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field1210;

    @OriginalMember(owner = "client", name = "cd", descriptor = "I")
    private int field1211;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field1218;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field1219;

    @OriginalMember(owner = "client", name = "pd", descriptor = "I")
    private static int field1224;

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field1226;

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field1232;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field1239;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field1242;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field1243;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private static int field1252;

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    private int field1257;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "I")
    private int field1258;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field1259;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field1265;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field1268;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "client", name = "me", descriptor = "I")
    private int field1273;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field1274;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field1275;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field1276;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private static int field1277;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field1282;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field1289;

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field1290;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field1291;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field1292;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field1303;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private static int field1315;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field1317;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private static int field1333;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private static int field1334;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private static int field1337;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field1340;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field1352;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private static int field1369;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field1371;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field1375;

    @OriginalMember(owner = "client", name = "ng", descriptor = "I")
    private int field1377;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field1381;

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field1382;

    @OriginalMember(owner = "client", name = "tg", descriptor = "I")
    private int field1383;

    @OriginalMember(owner = "client", name = "ug", descriptor = "I")
    private int field1384;

    @OriginalMember(owner = "client", name = "vg", descriptor = "I")
    private int field1385;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field1386;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field1387;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field1388;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field1389;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field1391;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field1394;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field1396;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client", name = "ih", descriptor = "I")
    private int field1424;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field1425;

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private int field1426;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field1427;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field1428;

    @OriginalMember(owner = "client", name = "nh", descriptor = "I")
    private int field1429;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field1430;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field1431;

    @OriginalMember(owner = "client", name = "qh", descriptor = "I")
    private int field1432;

    @OriginalMember(owner = "client", name = "rh", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field1434;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field1438;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field1446;

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private static int field1455;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private int field1460;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private static int field1466;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field1468;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private int field1470;

    @OriginalMember(owner = "client", name = "mi", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field1482;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private int field1483;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field1488;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private static int field1491;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private static int field1493;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "I")
    private int field1507;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "I")
    private int field1509;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field1514;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private int field1519;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field1520;

    @OriginalMember(owner = "client", name = "bj", descriptor = "I")
    private int field1521;

    @OriginalMember(owner = "client", name = "cj", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client", name = "dj", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field1524;

    @OriginalMember(owner = "client", name = "hj", descriptor = "I")
    private static int field1527;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "J")
    private long field1187;

    @OriginalMember(owner = "client", name = "id", descriptor = "J")
    private long field1217;

    @OriginalMember(owner = "client", name = "je", descriptor = "J")
    private long field1270;

    @OriginalMember(owner = "client", name = "kg", descriptor = "Ld;")
    private ClientStream field1374;

    @OriginalMember(owner = "client", name = "li", descriptor = "Ltb;")
    private Isaac field1479;

    @OriginalMember(owner = "client", name = "zh", descriptor = "Lub;")
    private Jagfile field1441;

    @OriginalMember(owner = "client", name = "S", descriptor = "Lhb;")
    private Pix32 field1097;

    @OriginalMember(owner = "client", name = "T", descriptor = "Lhb;")
    private Pix32 field1098;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "Lhb;")
    private Pix32 field1140;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "Lhb;")
    private Pix32 field1156;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "Lhb;")
    private Pix32 field1193;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "Lhb;")
    private Pix32 field1194;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "Lhb;")
    private Pix32 field1195;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "Lhb;")
    private Pix32 field1196;

    @OriginalMember(owner = "client", name = "hh", descriptor = "Lhb;")
    private Pix32 field1423;

    @OriginalMember(owner = "client", name = "Li", descriptor = "Lhb;")
    private Pix32 field1505;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "Lhb;")
    private Pix32 field1506;

    @OriginalMember(owner = "client", name = "pb", descriptor = "Lib;")
    private Pix8 field1120;

    @OriginalMember(owner = "client", name = "qb", descriptor = "Lib;")
    private Pix8 field1121;

    @OriginalMember(owner = "client", name = "rb", descriptor = "Lib;")
    private Pix8 field1122;

    @OriginalMember(owner = "client", name = "sb", descriptor = "Lib;")
    private Pix8 field1123;

    @OriginalMember(owner = "client", name = "tb", descriptor = "Lib;")
    private Pix8 field1124;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "Lib;")
    private Pix8 field1151;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "Lib;")
    private Pix8 field1152;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "Lib;")
    private Pix8 field1260;

    @OriginalMember(owner = "client", name = "ae", descriptor = "Lib;")
    private Pix8 field1261;

    @OriginalMember(owner = "client", name = "bh", descriptor = "Lib;")
    private Pix8 field1417;

    @OriginalMember(owner = "client", name = "ch", descriptor = "Lib;")
    private Pix8 field1418;

    @OriginalMember(owner = "client", name = "dh", descriptor = "Lib;")
    private Pix8 field1419;

    @OriginalMember(owner = "client", name = "eh", descriptor = "Lib;")
    private Pix8 field1420;

    @OriginalMember(owner = "client", name = "fh", descriptor = "Lib;")
    private Pix8 field1421;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Lib;")
    private Pix8 field1463;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Lib;")
    private Pix8 field1464;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "Lib;")
    private Pix8 field1465;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "Lib;")
    private Pix8 field1498;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "Lib;")
    private Pix8 field1499;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "Lib;")
    private Pix8 field1500;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "Ljb;")
    private PixFont field1449;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "Ljb;")
    private PixFont field1450;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "Ljb;")
    private PixFont field1451;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "Ljb;")
    private PixFont field1452;

    @OriginalMember(owner = "client", name = "pc", descriptor = "Lqb;")
    private PixMap field1172;

    @OriginalMember(owner = "client", name = "qc", descriptor = "Lqb;")
    private PixMap field1173;

    @OriginalMember(owner = "client", name = "rc", descriptor = "Lqb;")
    private PixMap field1174;

    @OriginalMember(owner = "client", name = "sc", descriptor = "Lqb;")
    private PixMap field1175;

    @OriginalMember(owner = "client", name = "be", descriptor = "Lqb;")
    private PixMap field1262;

    @OriginalMember(owner = "client", name = "ce", descriptor = "Lqb;")
    private PixMap field1263;

    @OriginalMember(owner = "client", name = "de", descriptor = "Lqb;")
    private PixMap field1264;

    @OriginalMember(owner = "client", name = "jf", descriptor = "Lqb;")
    private PixMap field1321;

    @OriginalMember(owner = "client", name = "kf", descriptor = "Lqb;")
    private PixMap field1322;

    @OriginalMember(owner = "client", name = "lf", descriptor = "Lqb;")
    private PixMap field1323;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Lqb;")
    private PixMap field1324;

    @OriginalMember(owner = "client", name = "nf", descriptor = "Lqb;")
    private PixMap field1325;

    @OriginalMember(owner = "client", name = "of", descriptor = "Lqb;")
    private PixMap field1326;

    @OriginalMember(owner = "client", name = "pf", descriptor = "Lqb;")
    private PixMap field1327;

    @OriginalMember(owner = "client", name = "qf", descriptor = "Lqb;")
    private PixMap field1328;

    @OriginalMember(owner = "client", name = "rf", descriptor = "Lqb;")
    private PixMap field1329;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "Lqb;")
    private PixMap field1357;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "Lqb;")
    private PixMap field1358;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "Lqb;")
    private PixMap field1359;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "Lqb;")
    private PixMap field1360;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "Lqb;")
    private PixMap field1361;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "Lqb;")
    private PixMap field1362;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "Lqb;")
    private PixMap field1363;

    @OriginalMember(owner = "client", name = "ag", descriptor = "Lqb;")
    private PixMap field1364;

    @OriginalMember(owner = "client", name = "bg", descriptor = "Lqb;")
    private PixMap field1365;

    @OriginalMember(owner = "client", name = "cg", descriptor = "Lqb;")
    private PixMap field1366;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "Lz;")
    private PlayerEntity field1185;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "Lr;")
    private World3D field1504;

    @OriginalMember(owner = "client", name = "yb", descriptor = "Ljava/lang/String;")
    private String field1129;

    @OriginalMember(owner = "client", name = "qd", descriptor = "Ljava/lang/String;")
    private String field1225;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "Ljava/lang/String;")
    public String field1293;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "Ljava/lang/String;")
    private String field1307;

    @OriginalMember(owner = "client", name = "di", descriptor = "Ljava/lang/String;")
    public String field1471;

    @OriginalMember(owner = "client", name = "kb", descriptor = "Z")
    private static boolean field1115;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "Z")
    private static boolean field1245;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "Z")
    private static boolean field1406;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "[I")
    private int[] field1248;

    @OriginalMember(owner = "client", name = "Od", descriptor = "[I")
    private int[] field1249;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "[I")
    private int[] field1392;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "[I")
    private int[] field1399;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "[I")
    private int[] field1400;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "[I")
    private int[] field1401;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "[I")
    private int[] field1402;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "[I")
    private int[] field1403;

    @OriginalMember(owner = "client", name = "qi", descriptor = "[I")
    private int[] field1484;

    @OriginalMember(owner = "client", name = "ri", descriptor = "[I")
    private int[] field1485;

    @OriginalMember(owner = "client", name = "si", descriptor = "[I")
    private int[] field1486;

    @OriginalMember(owner = "client", name = "ti", descriptor = "[I")
    private int[] field1487;

    @OriginalMember(owner = "client", name = "We", descriptor = "[Lib;")
    private Pix8[] field1309;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "[[B")
    private byte[][] field1459;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "[[B")
    private byte[][] field1501;

    @OriginalMember(owner = "client", name = "Md", descriptor = "[[[B")
    private byte[][][] field1247;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "[[[I")
    private int[][][] field1308;

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method363(int arg0) {
        if (arg0 >= 0) {
            this.field1355.method199(184);
        }
        if (super.field27 == 1) {
            int var2 = super.field28 - 21 - 561;
            int var3 = super.field29 - 9 - 5;
            if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                var2 -= 73;
                var3 -= 75;
                int var4 = this.field1182 + this.field1109 & 2047;
                int var5 = Pix3D.field559[var4];
                int var6 = Pix3D.field560[var4];
                int var7 = (this.field1347 + 256) * var5 >> 8;
                int var8 = (this.field1347 + 256) * var6 >> 8;
                int var9 = var2 * var8 + var3 * var7 >> 11;
                int var10 = var3 * var8 - var2 * var7 >> 11;
                int var11 = this.field1185.field305 + var9 >> 7;
                int var12 = this.field1185.field306 - var10 >> 7;
                boolean var13 = this.method454(this.field1185.field354[0], 0, 1, 0, var11, var12, true, 0, this.field1185.field353[0], 0, 1, 0);
                if (var13) {
                    this.field1355.method199(var2);
                    this.field1355.method199(var3);
                    this.field1355.method200(this.field1182);
                    this.field1355.method199(57);
                    this.field1355.method199(this.field1109);
                    this.field1355.method199(this.field1347);
                    this.field1355.method199(89);
                    this.field1355.method200(this.field1185.field305);
                    this.field1355.method200(this.field1185.field306);
                    this.field1355.method199(this.field1375);
                    this.field1355.method199(63);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIILhc;)V")
    public final void method364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, Component arg6) {
        if (arg6.field962 == 0 && arg6.field976 != null && !arg6.field975) {
            if (arg0 >= arg1 && arg3 >= arg4 && arg0 <= arg6.field965 + arg1 && arg3 <= arg6.field966 + arg4) {
                int var8 = arg6.field976.length;
                while (arg5 >= 0) {
                    this.field1409 = -1;
                }
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg6.field977[var9] + arg1;
                    int var11 = arg6.field978[var9] + arg4 - arg2;
                    Component var12 = Component.field955[arg6.field976[var9]];
                    int var13 = var12.field967 + var10;
                    int var14 = var12.field968 + var11;
                    if ((var12.field972 >= 0 || var12.field998 != 0) && arg0 >= var13 && arg3 >= var14 && arg0 < var12.field965 + var13 && arg3 < var12.field966 + var14) {
                        if (var12.field972 >= 0) {
                            this.field1457 = var12.field972;
                        } else {
                            this.field1457 = var12.field960;
                        }
                    }
                    if (var12.field962 == 0) {
                        this.method364(arg0, var13, var12.field974, arg3, var14, -772, var12);
                        if (var12.field973 > var12.field966) {
                            this.method378((byte) -42, var12, arg0, var14, var12.field966, var12.field973, var12.field965 + var13, arg3, true);
                        }
                    } else {
                        if (var12.field963 == 1 && arg0 >= var13 && arg3 >= var14 && arg0 < var12.field965 + var13 && arg3 < var12.field966 + var14) {
                            boolean var15 = false;
                            if (var12.field964 != 0) {
                                var15 = this.method365(false, var12);
                            }
                            if (!var15) {
                                this.field1212[this.field1343] = var12.field1011;
                                this.field1222[this.field1343] = 706;
                                this.field1221[this.field1343] = var12.field960;
                                ++this.field1343;
                            }
                        }
                        if (var12.field963 == 2 && this.field1468 == 0 && arg0 >= var13 && arg3 >= var14 && arg0 < var12.field965 + var13 && arg3 < var12.field966 + var14) {
                            String var16 = var12.field1008;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field1212[this.field1343] = var16 + " @gre@" + var12.field1009;
                            this.field1222[this.field1343] = 941;
                            this.field1221[this.field1343] = var12.field960;
                            ++this.field1343;
                        }
                        if (var12.field963 == 3 && arg0 >= var13 && arg3 >= var14 && arg0 < var12.field965 + var13 && arg3 < var12.field966 + var14) {
                            this.field1212[this.field1343] = "Close";
                            this.field1222[this.field1343] = 309;
                            this.field1221[this.field1343] = var12.field960;
                            ++this.field1343;
                        }
                        if (var12.field963 == 4 && arg0 >= var13 && arg3 >= var14 && arg0 < var12.field965 + var13 && arg3 < var12.field966 + var14) {
                            this.field1212[this.field1343] = var12.field1011;
                            this.field1222[this.field1343] = 967;
                            this.field1221[this.field1343] = var12.field960;
                            ++this.field1343;
                        }
                        if (var12.field963 == 5 && arg0 >= var13 && arg3 >= var14 && arg0 < var12.field965 + var13 && arg3 < var12.field966 + var14) {
                            this.field1212[this.field1343] = var12.field1011;
                            this.field1222[this.field1343] = 672;
                            this.field1221[this.field1343] = var12.field960;
                            ++this.field1343;
                        }
                        if (var12.field963 == 6 && !this.field1373 && arg0 >= var13 && arg3 >= var14 && arg0 < var12.field965 + var13 && arg3 < var12.field966 + var14) {
                            this.field1212[this.field1343] = var12.field1011;
                            this.field1222[this.field1343] = 73;
                            this.field1221[this.field1343] = var12.field960;
                            ++this.field1343;
                        }
                        if (var12.field962 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field966; ++var18) {
                                for (int var19 = 0; var19 < var12.field965; ++var19) {
                                    int var20 = (var12.field984 + 32) * var19 + var13;
                                    int var21 = (var12.field985 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field987[var17];
                                        var21 += var12.field988[var17];
                                    }
                                    if (arg0 >= var20 && arg3 >= var21 && arg0 < var20 + 32 && arg3 < var21 + 32) {
                                        this.field1218 = var17;
                                        this.field1219 = var12.field960;
                                        if (var12.field956[var17] > 0) {
                                            ObjType var22 = ObjType.method287(var12.field956[var17] - 1);
                                            if (this.field1289 == 1 && var12.field982) {
                                                if (this.field1291 != var12.field960 || this.field1290 != var17) {
                                                    this.field1212[this.field1343] = "Use " + this.field1293 + " with @lre@" + var22.field881;
                                                    this.field1222[this.field1343] = 237;
                                                    this.field1223[this.field1343] = var22.field879;
                                                    this.field1220[this.field1343] = var17;
                                                    this.field1221[this.field1343] = var12.field960;
                                                    ++this.field1343;
                                                }
                                            } else if (this.field1468 == 1 && var12.field982) {
                                                if ((this.field1470 & 16) == 16) {
                                                    this.field1212[this.field1343] = this.field1471 + " @lre@" + var22.field881;
                                                    this.field1222[this.field1343] = 63;
                                                    this.field1223[this.field1343] = var22.field879;
                                                    this.field1220[this.field1343] = var17;
                                                    this.field1221[this.field1343] = var12.field960;
                                                    ++this.field1343;
                                                }
                                            } else {
                                                if (var12.field982) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field897 != null && var22.field897[var23] != null) {
                                                            this.field1212[this.field1343] = var22.field897[var23] + " @lre@" + var22.field881;
                                                            if (var23 == 3) {
                                                                this.field1222[this.field1343] = 120;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field1222[this.field1343] = 796;
                                                            }
                                                            this.field1223[this.field1343] = var22.field879;
                                                            this.field1220[this.field1343] = var17;
                                                            this.field1221[this.field1343] = var12.field960;
                                                            ++this.field1343;
                                                        } else if (var23 == 4) {
                                                            this.field1212[this.field1343] = "Drop @lre@" + var22.field881;
                                                            this.field1222[this.field1343] = 796;
                                                            this.field1223[this.field1343] = var22.field879;
                                                            this.field1220[this.field1343] = var17;
                                                            this.field1221[this.field1343] = var12.field960;
                                                            ++this.field1343;
                                                        }
                                                    }
                                                }
                                                if (var12.field983) {
                                                    this.field1212[this.field1343] = "Use @lre@" + var22.field881;
                                                    this.field1222[this.field1343] = 357;
                                                    this.field1223[this.field1343] = var22.field879;
                                                    this.field1220[this.field1343] = var17;
                                                    this.field1221[this.field1343] = var12.field960;
                                                    ++this.field1343;
                                                }
                                                if (var12.field982 && var22.field897 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field897[var24] != null) {
                                                            this.field1212[this.field1343] = var22.field897[var24] + " @lre@" + var22.field881;
                                                            if (var24 == 0) {
                                                                this.field1222[this.field1343] = 871;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1222[this.field1343] = 526;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1222[this.field1343] = 156;
                                                            }
                                                            this.field1223[this.field1343] = var22.field879;
                                                            this.field1220[this.field1343] = var17;
                                                            this.field1221[this.field1343] = var12.field960;
                                                            ++this.field1343;
                                                        }
                                                    }
                                                }
                                                if (var12.field989 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field989[var25] != null) {
                                                            this.field1212[this.field1343] = var12.field989[var25] + " @lre@" + var22.field881;
                                                            if (var25 == 0) {
                                                                this.field1222[this.field1343] = 134;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field1222[this.field1343] = 701;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field1222[this.field1343] = 570;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field1222[this.field1343] = 719;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field1222[this.field1343] = 440;
                                                            }
                                                            this.field1223[this.field1343] = var22.field879;
                                                            this.field1220[this.field1343] = var17;
                                                            this.field1221[this.field1343] = var12.field960;
                                                            ++this.field1343;
                                                        }
                                                    }
                                                }
                                                this.field1212[this.field1343] = "Examine @lre@" + var22.field881;
                                                this.field1222[this.field1343] = 1974;
                                                this.field1223[this.field1343] = var22.field879;
                                                this.field1221[this.field1343] = var12.field957[var17];
                                                ++this.field1343;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLhc;)Z")
    public final boolean method365(boolean arg0, Component arg1) {
        int var3 = arg1.field964;
        if (arg0) {
            this.field1355.method199(11);
        }
        if (var3 >= 1 && var3 <= 200) {
            if (var3 >= 101) {
                var3 -= 101;
            } else {
                --var3;
            }
            this.field1212[this.field1343] = "Remove @whi@" + this.field1299[var3];
            this.field1222[this.field1343] = 804;
            ++this.field1343;
            this.field1212[this.field1343] = "Message @whi@" + this.field1299[var3];
            this.field1222[this.field1343] = 125;
            ++this.field1343;
            return true;
        } else if (var3 >= 401 && var3 <= 500) {
            this.field1212[this.field1343] = "Remove @whi@" + arg1.field994;
            this.field1222[this.field1343] = 521;
            ++this.field1343;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method366(byte arg0) {
        byte[] var2 = this.field1441.method250("title.dat", (byte[]) null, 8);
        if (arg0 != 9) {
            this.field1386 = this.field1479.method246();
        }
        Pix32 var3 = new Pix32(var2, this);
        this.field1324.method235((byte) 120);
        var3.method171(0, true, 0);
        this.field1325.method235((byte) 120);
        var3.method171(-661, true, 0);
        this.field1321.method235((byte) 120);
        var3.method171(-128, true, 0);
        this.field1322.method235((byte) 120);
        var3.method171(-214, true, -386);
        this.field1323.method235((byte) 120);
        var3.method171(-214, true, -186);
        this.field1326.method235((byte) 120);
        var3.method171(0, true, -265);
        this.field1327.method235((byte) 120);
        var3.method171(-574, true, -265);
        this.field1328.method235((byte) 120);
        var3.method171(-128, true, -186);
        this.field1329.method235((byte) 120);
        var3.method171(-574, true, -186);
        int[] var4 = new int[var3.field579];
        for (int var5 = 0; var5 < var3.field580; ++var5) {
            for (int var10 = 0; var10 < var3.field579; ++var10) {
                var4[var10] = var3.field578[var3.field579 * var5 + (var3.field579 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field579; ++var11) {
                var3.field578[var3.field579 * var5 + var11] = var4[var11];
            }
        }
        this.field1324.method235((byte) 120);
        var3.method171(394, true, 0);
        this.field1325.method235((byte) 120);
        var3.method171(-267, true, 0);
        this.field1321.method235((byte) 120);
        var3.method171(266, true, 0);
        this.field1322.method235((byte) 120);
        var3.method171(180, true, -386);
        this.field1323.method235((byte) 120);
        var3.method171(180, true, -186);
        this.field1326.method235((byte) 120);
        var3.method171(394, true, -265);
        this.field1327.method235((byte) 120);
        var3.method171(-180, true, -265);
        this.field1328.method235((byte) 120);
        var3.method171(212, true, -186);
        this.field1329.method235((byte) 120);
        var3.method171(-180, true, -186);
        Pix32 var6 = new Pix32(this.field1441, "logo", 0);
        this.field1321.method235((byte) 120);
        var6.method173(-790, super.field16 / 2 - var6.field579 / 2 - 128, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLhc;I)I")
    public final int method367(boolean arg0, Component arg1, int arg2) {
        if (!arg0) {
            this.field1386 = -193;
        }
        if (arg1.field969 != null && arg2 < arg1.field969.length) {
            try {
                int[] var4 = arg1.field969[arg2];
                int var5 = 0;
                int var6 = 0;
                while (true) {
                    int var7 = var4[var6++];
                    if (var7 == 0) {
                        return var5;
                    }
                    if (var7 == 1) {
                        var5 += this.field1478[var4[var6++]];
                    }
                    if (var7 == 2) {
                        var5 += this.field1128[var4[var6++]];
                    }
                    if (var7 == 3) {
                        var5 += this.field1344[var4[var6++]];
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
                        var5 += this.field1319[var4[var6++]];
                    }
                    if (var7 == 6) {
                        var5 += field1092[this.field1128[var4[var6++]] - 1];
                    }
                    if (var7 == 7) {
                        var5 += this.field1319[var4[var6++]] * 100 / 46875;
                    }
                    if (var7 == 8) {
                        var5 += this.field1185.field367;
                    }
                    if (var7 == 9) {
                        for (int var11 = 0; var11 < 19; ++var11) {
                            if (var11 == 18) {
                                var11 = 20;
                            }
                            var5 += this.field1128[var11];
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
                        var5 += this.field1467;
                    }
                    if (var7 == 12) {
                        var5 += this.field1377;
                    }
                    if (var7 == 13) {
                        int var15 = this.field1319[var4[var6++]];
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

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method368(byte arg0) {
        try {
            if (this.field1374 != null) {
                this.field1374.method29();
            }
        } catch (Exception var3) {
        }
        this.field1374 = null;
        this.field1105 = false;
        this.field1371 = 0;
        if (arg0 == 89) {
            this.field1474 = "";
            this.field1475 = "";
            InputTracking.method35(false, true);
            this.method449(false);
            this.field1504.method50(-169);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1494[var2].method295(true);
            }
            System.gc();
            this.method384((byte) 9);
            this.field1225 = null;
            this.field1286 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method369(int arg0) {
        label52: while (true) {
            if (arg0 >= 0) {
                int var6 = 1;
                while (true) {
                    if (var6 <= 0) {
                        continue label52;
                    }
                    ++var6;
                }
            }
            for (ProjectileEntity var2 = (ProjectileEntity) this.field1336.method228(); var2 != null; var2 = (ProjectileEntity) this.field1336.method230(0)) {
                if (this.field1170 == var2.field384 && field1311 <= var2.field390) {
                    if (field1311 >= var2.field389) {
                        if (var2.field393 > 0) {
                            NpcEntity var3 = this.field1296[var2.field393 - 1];
                            if (var3 != null) {
                                var2.method116(var3.field305, this.method447(var3.field306, var3.field305, true, var2.field384) - var2.field388, 0, var3.field306, field1311);
                            }
                        }
                        if (var2.field393 < 0) {
                            int var4 = -var2.field393 - 1;
                            PlayerEntity var5;
                            if (this.field1350 == var4) {
                                var5 = this.field1185;
                            } else {
                                var5 = this.field1201[var4];
                            }
                            if (var5 != null) {
                                var2.method116(var5.field305, this.method447(var5.field306, var5.field305, true, var2.field384) - var2.field388, 0, var5.field306, field1311);
                            }
                        }
                        var2.method117(0, this.field1135);
                        this.field1504.method61(60, var2.field403, (int) var2.field395, (int) var2.field397, -2146, -1, this.field1170, var2, (Model) null, (int) var2.field396, false);
                    }
                } else {
                    var2.method107();
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method370(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method371(int arg0) {
        if (this.field1412 > 0) {
            this.method368((byte) 89);
        } else {
            this.field1174.method235((byte) 120);
            this.field1450.method188(12097, 257, 144, "Connection lost", 0);
            this.field1450.method188(12097, 256, 143, "Connection lost", 16777215);
            this.field1450.method188(12097, 257, 159, "Please wait - attempting to reestablish", 0);
            this.field1450.method188(12097, 256, 158, "Please wait - attempting to reestablish", 16777215);
            int var2 = 91 / arg0;
            this.field1174.method236(11, super.field18, -3666, 8);
            this.field1154 = 0;
            ClientStream var3 = this.field1374;
            this.field1105 = false;
            this.method456(this.field1474, this.field1475, true);
            if (!this.field1105) {
                this.method368((byte) 89);
            }
            try {
                var3.method29();
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method372(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field1514; ++var4) {
                if (this.field1094[var4] == arg0) {
                    --this.field1514;
                    this.field1472 = true;
                    for (int var5 = var4; var5 < this.field1514; ++var5) {
                        this.field1094[var5] = this.field1094[var5 + 1];
                    }
                    this.field1355.method198(0, 68);
                    this.field1355.method205(6, arg0);
                    break;
                }
            }
            while (arg1 >= 0) {
                for (int var6 = 1; var6 > 0; ++var6) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BJ)V")
    public final void method373(byte arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field1096 >= 100) {
                this.method391("Your friends list is full. Max of 100 hit", 0, false, "");
            } else {
                String var4 = JString.method255(-148, JString.method252(arg1, -38644));
                for (int var5 = 0; var5 < this.field1096; ++var5) {
                    if (this.field1445[var5] == arg1) {
                        this.method391(var4 + " is already on your friend list", 0, false, "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1514; ++var6) {
                    if (this.field1094[var6] == arg1) {
                        this.method391("Please remove " + var4 + " from your ignore list first", 0, false, "");
                        return;
                    }
                }
                if (!var4.equals(this.field1185.field361)) {
                    this.field1299[this.field1096] = var4;
                    this.field1445[this.field1096] = arg1;
                    if (arg0 != -31) {
                        this.method6();
                    }
                    this.field1332[this.field1096] = 0;
                    ++this.field1096;
                    this.field1472 = true;
                    this.field1355.method198(0, 66);
                    this.field1355.method205(6, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method374(boolean arg0) {
        this.field1105 &= arg0;
        if (super.field27 == 1) {
            if (super.field28 >= 8 && super.field28 <= 108 && super.field29 >= 490 && super.field29 <= 522) {
                this.field1509 = (this.field1509 + 1) % 4;
                this.field1238 = true;
                this.field1342 = true;
                this.field1355.method198(0, 197);
                this.field1355.method199(this.field1509);
                this.field1355.method199(this.field1283);
                this.field1355.method199(this.field1242);
            }
            if (super.field28 >= 137 && super.field28 <= 237 && super.field29 >= 490 && super.field29 <= 522) {
                this.field1283 = (this.field1283 + 1) % 3;
                this.field1238 = true;
                this.field1342 = true;
                this.field1355.method198(0, 197);
                this.field1355.method199(this.field1509);
                this.field1355.method199(this.field1283);
                this.field1355.method199(this.field1242);
            }
            if (super.field28 >= 275 && super.field28 <= 375 && super.field29 >= 490 && super.field29 <= 522) {
                this.field1242 = (this.field1242 + 1) % 3;
                this.field1238 = true;
                this.field1342 = true;
                this.field1355.method198(0, 197);
                this.field1355.method199(this.field1509);
                this.field1355.method199(this.field1283);
                this.field1355.method199(this.field1242);
            }
            if (super.field28 >= 416 && super.field28 <= 516 && super.field29 >= 490 && super.field29 <= 522) {
                this.method398((byte) 3);
                this.field1287 = "";
                this.field1444 = false;
                for (int var2 = 0; var2 < Component.field955.length; ++var2) {
                    if (Component.field955[var2] != null && Component.field955[var2].field964 == 600) {
                        this.field1448 = this.field1413 = Component.field955[var2].field961;
                        break;
                    }
                }
            }
            ++field1527;
            if (field1527 > 195) {
                field1527 = 0;
                this.field1355.method198(0, 24);
                this.field1355.method199(239);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method375(int arg0) {
        while (arg0 >= 0) {
            this.field1278 = null;
        }
        if (this.field1488 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1353.method228(); var2 != null; var2 = (LocSpawned) this.field1353.method230(0)) {
                if (field1311 >= var2.field651) {
                    this.method445(var2.field645, 36300, var2.field649, var2.field650, var2.field647, var2.field646, var2.field644, var2.field648);
                    var2.method107();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method376(int arg0) {
        int var2 = this.field1185.field305 + this.field1239;
        int var3 = this.field1185.field306 + this.field1232;
        if (this.field1209 - var2 < -500 || this.field1209 - var2 > 500 || this.field1210 - var3 < -500 || this.field1210 - var3 > 500) {
            this.field1209 = var2;
            this.field1210 = var3;
        }
        if (this.field1209 != var2) {
            this.field1209 += (var2 - this.field1209) / 16;
        }
        if (this.field1210 != var3) {
            this.field1210 += (var3 - this.field1210) / 16;
        }
        if (super.field30[1] == 1) {
            this.field1183 += (-24 - this.field1183) / 2;
        } else if (super.field30[2] == 1) {
            this.field1183 += (24 - this.field1183) / 2;
        } else {
            this.field1183 /= 2;
        }
        if (super.field30[3] == 1) {
            this.field1184 += (12 - this.field1184) / 2;
        } else if (super.field30[4] == 1) {
            this.field1184 += (-12 - this.field1184) / 2;
        } else {
            this.field1184 /= 2;
        }
        this.field1182 = this.field1183 / 2 + this.field1182 & 2047;
        this.field1181 += this.field1184 / 2;
        if (arg0 == 0) {
            if (this.field1181 < 128) {
                this.field1181 = 128;
            }
            if (this.field1181 > 383) {
                this.field1181 = 383;
            }
            int var4 = this.field1209 >> 7;
            int var5 = this.field1210 >> 7;
            int var6 = this.method447(this.field1210, this.field1209, true, this.field1170);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field1170;
                        if (var10 < 3 && (this.field1247[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field1308[var10][var8][var9];
                        if (var11 > var7) {
                            var7 = var11;
                        }
                    }
                }
            }
            ++field1252;
            if (field1252 > 77) {
                field1252 = 0;
                this.field1355.method198(0, 57);
            }
            int var12 = var7 * 192;
            if (var12 > 98048) {
                var12 = 98048;
            }
            if (var12 < 32768) {
                var12 = 32768;
            }
            if (var12 > this.field1165) {
                this.field1165 += (var12 - this.field1165) / 24;
            } else if (var12 < this.field1165) {
                this.field1165 += (var12 - this.field1165) / 80;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method377(int arg0, int arg1) {
        int[] var3 = this.field1156.field578;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var15 = (103 - var6) * 512 * 4 + 24628;
            for (int var16 = 1; var16 < 103; ++var16) {
                if ((this.field1247[arg1][var16][var6] & 24) == 0) {
                    this.field1504.method86(var3, var15, 512, arg1, var16, var6);
                }
                if (arg1 < 3 && (this.field1247[arg1 + 1][var16][var6] & 8) != 0) {
                    this.field1504.method86(var3, var15, 512, arg1 + 1, var16, var6);
                }
                var15 += 4;
            }
        }
        this.field1156.method170((byte) 120);
        for (int var7 = 1; var7 < 103; ++var7) {
            for (int var14 = 1; var14 < 103; ++var14) {
                if ((this.field1247[arg1][var14][var7] & 24) == 0) {
                    this.method403(9, var14, arg1, var7);
                }
                if (arg1 < 3 && (this.field1247[arg1 + 1][var14][var7] & 8) != 0) {
                    this.method403(9, var14, arg1 + 1, var7);
                }
            }
        }
        this.field1174.method235((byte) 120);
        this.field1279 = 0;
        int var8 = 55 / arg0;
        for (int var9 = 0; var9 < 104; ++var9) {
            for (int var10 = 0; var10 < 104; ++var10) {
                int var11 = this.field1504.method80(this.field1170, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 32767;
                    int var13 = LocType.method275(var12).field827;
                    if (var13 >= 0) {
                        this.field1495[this.field1279] = this.field1253[var13];
                        this.field1280[this.field1279] = var9;
                        this.field1281[this.field1279] = var10;
                        ++this.field1279;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLhc;IIIIIIZ)V")
    public final void method378(byte arg0, Component arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        if (arg0 != -42) {
            this.field1409 = this.field1335.method209();
        }
        if (this.field1453) {
            this.field1507 = 32;
        } else {
            this.field1507 = 0;
        }
        this.field1453 = false;
        if (arg2 >= arg6 && arg2 < arg6 + 16 && arg7 >= arg3 && arg7 < arg3 + 16) {
            arg1.field974 -= this.field1161 * 4;
            if (arg8) {
                this.field1472 = true;
                return;
            }
        } else if (arg2 >= arg6 && arg2 < arg6 + 16 && arg7 >= arg3 + arg4 - 16 && arg7 < arg3 + arg4) {
            arg1.field974 += this.field1161 * 4;
            if (arg8) {
                this.field1472 = true;
                return;
            }
        } else {
            if (arg2 < arg6 - this.field1507 || arg2 >= arg6 + 16 + this.field1507 || arg7 < arg3 + 16 || arg7 >= arg3 + arg4 - 16 || this.field1161 <= 0) {
                return;
            }
            int var10 = (arg4 - 32) * arg4 / arg5;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg7 - arg3 - 16 - var10 / 2;
            int var12 = arg4 - 32 - var10;
            arg1.field974 = (arg5 - arg4) * var11 / var12;
            if (arg8) {
                this.field1472 = true;
            }
            this.field1453 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILhb;IZ)V")
    public final void method379(int arg0, Pix32 arg1, int arg2, boolean arg3) {
        int var5 = this.field1182 + this.field1109 & 2047;
        int var6 = arg0 * arg0 + arg2 * arg2;
        if (var6 <= 6400) {
            int var7 = Model.field524[var5];
            int var8 = Model.field525[var5];
            int var9 = var7 * 256 / (this.field1347 + 256);
            int var10 = var8 * 256 / (this.field1347 + 256);
            int var11 = arg0 * var10 + arg2 * var9 >> 16;
            int var12 = arg2 * var10 - arg0 * var9 >> 16;
            this.field1105 &= arg3;
            if (var6 > 2500) {
                arg1.method180(var11 + 94 - arg1.field583 / 2, 83 - var12 - arg1.field584 / 2, this.field1499, this.field1314);
            } else {
                arg1.method173(-790, var11 + 94 - arg1.field583 / 2, 83 - var12 - arg1.field584 / 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZII)V")
    public final void method380(boolean arg0, int arg1, int arg2) {
        signlink.midivol = arg1;
        if (this.field1306 != arg2) {
            this.method6();
        }
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method381(int arg0) {
        if (arg0 >= 0) {
            this.field1409 = -1;
        }
        this.method478(true);
        if (this.field1524 == 1) {
            this.field1517[this.field1523 / 100].method173(-790, this.field1521 - 8 - 8, this.field1522 - 8 - 11);
        }
        if (this.field1524 == 2) {
            this.field1517[this.field1523 / 100 + 4].method173(-790, this.field1521 - 8 - 8, this.field1522 - 8 - 11);
            ++field1466;
            if (field1466 > 161) {
                field1466 = 0;
                this.field1355.method198(0, 128);
                this.field1355.method200(9331);
            }
        }
        if (this.field1413 != -1) {
            this.method486(this.field1413, -25, this.field1135);
            this.method409(Component.field955[this.field1413], false, 0, 0, 0);
        }
        this.method484(26510);
        if (!this.field1246) {
            this.method443((byte) 9);
            this.method397(7);
        } else if (this.field1099 == 0) {
            this.method444(8);
        }
        if (this.field1186 == 1) {
            if (this.field1354 <= 0 && this.field1519 != 1) {
                this.field1378[1].method173(-790, 472, 296);
            } else {
                this.field1378[1].method173(-790, 472, 258);
            }
        }
        if (this.field1354 > 0) {
            this.field1378[0].method173(-790, 472, 296);
            this.field1450.method188(12097, 484, 329, "Level: " + this.field1354, 16776960);
        }
        if (this.field1519 == 1) {
            this.field1378[6].method173(-790, 472, 296);
            this.field1450.method188(12097, 484, 329, "Arena", 16776960);
        }
        if (this.field1513 != 0) {
            int var2 = this.field1513 / 50;
            int var3 = var2 / 60;
            int var4 = var2 % 60;
            if (var4 < 10) {
                this.field1450.method191(4, 16776960, (byte) 6, "System update in: " + var3 + ":0" + var4, 329);
            } else {
                this.field1450.method191(4, 16776960, (byte) 6, "System update in: " + var3 + ":" + var4, 329);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method382(boolean arg0) {
        if (this.field1321 == null) {
            super.field19 = null;
            this.field1175 = null;
            this.field1173 = null;
            this.field1172 = null;
            this.field1174 = null;
            this.field1262 = null;
            this.field1263 = null;
            this.field1264 = null;
            this.field1324 = new PixMap((byte) -121, 265, this.method11(field1316), 128);
            Pix2D.method148(14799);
            this.field1325 = new PixMap((byte) -121, 265, this.method11(field1316), 128);
            Pix2D.method148(14799);
            this.field1321 = new PixMap((byte) -121, 186, this.method11(field1316), 533);
            Pix2D.method148(14799);
            this.field1322 = new PixMap((byte) -121, 146, this.method11(field1316), 360);
            Pix2D.method148(14799);
            this.field1323 = new PixMap((byte) -121, 200, this.method11(field1316), 360);
            Pix2D.method148(14799);
            this.field1326 = new PixMap((byte) -121, 267, this.method11(field1316), 214);
            Pix2D.method148(14799);
            this.field1327 = new PixMap((byte) -121, 267, this.method11(field1316), 215);
            Pix2D.method148(14799);
            this.field1328 = new PixMap((byte) -121, 79, this.method11(field1316), 86);
            if (!arg0) {
                this.field1409 = -1;
            }
            Pix2D.method148(14799);
            this.field1329 = new PixMap((byte) -121, 79, this.method11(field1316), 87);
            Pix2D.method148(14799);
            if (this.field1441 != null) {
                this.method366((byte) 9);
                this.method476(field1157);
            }
            this.field1405 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)Z")
    public final boolean method383(int arg0, boolean arg1) {
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field1222[arg0];
            if (arg1) {
                this.field1250 = this.field1479.method246();
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 447;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method384(byte arg0) {
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 != 9) {
            this.field1409 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BII)V")
    public final void method385(byte arg0, int arg1, int arg2) {
        if (arg0 != -43) {
            this.field1139 = !this.field1139;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field1178[var5] != null) {
                int var6 = this.field1176[var5];
                int var7 = 70 - var4 * 14 + this.field1330 + 4;
                if (var7 < -20) {
                    break;
                }
                if (var6 == 0) {
                    ++var4;
                }
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field1509 == 0 || this.field1509 == 1 && this.method464(this.field1177[var5], this.field1188))) {
                    if (arg2 > var7 - 14 && arg2 <= var7 && !this.field1177[var5].equals(this.field1185.field361)) {
                        if (this.field1313) {
                            this.field1212[this.field1343] = "Report abuse @whi@" + this.field1177[var5];
                            this.field1222[this.field1343] = 316;
                            ++this.field1343;
                        }
                        this.field1212[this.field1343] = "Add ignore @whi@" + this.field1177[var5];
                        this.field1222[this.field1343] = 158;
                        ++this.field1343;
                        this.field1212[this.field1343] = "Add friend @whi@" + this.field1177[var5];
                        this.field1222[this.field1343] = 447;
                        ++this.field1343;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field1088 == 0 && (var6 == 7 || this.field1283 == 0 || this.field1283 == 1 && this.method464(this.field1177[var5], this.field1188))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        if (this.field1313) {
                            this.field1212[this.field1343] = "Report abuse @whi@" + this.field1177[var5];
                            this.field1222[this.field1343] = 316;
                            ++this.field1343;
                        }
                        this.field1212[this.field1343] = "Add ignore @whi@" + this.field1177[var5];
                        this.field1222[this.field1343] = 158;
                        ++this.field1343;
                        this.field1212[this.field1343] = "Add friend @whi@" + this.field1177[var5];
                        this.field1222[this.field1343] = 447;
                        ++this.field1343;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field1242 == 0 || this.field1242 == 1 && this.method464(this.field1177[var5], this.field1188))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field1212[this.field1343] = "Accept trade @whi@" + this.field1177[var5];
                        this.field1222[this.field1343] = 595;
                        ++this.field1343;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field1088 == 0 && this.field1283 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field1242 == 0 || this.field1242 == 1 && this.method464(this.field1177[var5], this.field1188))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field1212[this.field1343] = "Accept duel @whi@" + this.field1177[var5];
                        this.field1222[this.field1343] = 835;
                        ++this.field1343;
                    }
                    ++var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILkb;Lz;I)V")
    private final void method386(int arg0, int arg1, Packet arg2, PlayerEntity arg3, int arg4) {
        if (arg4 != 6748) {
            this.method6();
        }
        if ((arg1 & 1) == 1) {
            int var6 = arg2.method209();
            byte[] var7 = new byte[var6];
            Packet var8 = new Packet(0, var7);
            arg2.method218(0, var7, var6, false);
            this.field1206[arg0] = var8;
            arg3.method113((byte) 4, var8);
        }
        if ((arg1 & 2) == 2) {
            int var9 = arg2.method211();
            if (var9 == 65535) {
                var9 = -1;
            }
            if (arg3.field332 == var9) {
                arg3.field336 = 0;
            }
            int var10 = arg2.method209();
            if (var9 == -1 || arg3.field332 == -1 || SeqType.field1023[var9].field1031 > SeqType.field1023[arg3.field332].field1031 || SeqType.field1023[arg3.field332].field1031 == 0) {
                arg3.field332 = var9;
                arg3.field333 = 0;
                arg3.field334 = 0;
                arg3.field335 = var10;
                arg3.field336 = 0;
            }
        }
        if ((arg1 & 4) == 4) {
            arg3.field326 = arg2.method211();
            if (arg3.field326 == 65535) {
                arg3.field326 = -1;
            }
        }
        if ((arg1 & 8) == 8) {
            arg3.field317 = arg2.method216();
            arg3.field319 = 0;
            arg3.field320 = 0;
            arg3.field318 = 150;
            this.method391(arg3.field317, 2, false, arg3.field361);
        }
        if ((arg1 & 16) == 16) {
            arg3.field321 = arg2.method209();
            arg3.field322 = arg2.method209();
            arg3.field323 = field1311 + 400;
            arg3.field324 = arg2.method209();
            arg3.field325 = arg2.method209();
        }
        if ((arg1 & 32) == 32) {
            arg3.field327 = arg2.method211();
            arg3.field328 = arg2.method211();
        }
        if ((arg1 & 64) == 64) {
            int var11 = arg2.method211();
            int var12 = arg2.method209();
            int var13 = arg2.method209();
            int var14 = arg2.field621;
            if (arg3.field361 != null) {
                long var15 = JString.method251(arg3.field361);
                boolean var17 = false;
                if (var12 <= 1) {
                    for (int var18 = 0; var18 < this.field1514; ++var18) {
                        if (this.field1094[var18] == var15) {
                            var17 = true;
                            break;
                        }
                    }
                }
                if (!var17 && this.field1288 == 0) {
                    try {
                        String var19 = WordPack.method258(-137, var13, arg2);
                        String var20 = WordFilter.method335(var19, 0);
                        arg3.field317 = var20;
                        arg3.field319 = var11 >> 8;
                        arg3.field320 = var11 & 255;
                        arg3.field318 = 150;
                        if (var12 > 1) {
                            this.method391(var20, 1, false, arg3.field361);
                        } else {
                            this.method391(var20, 2, false, arg3.field361);
                        }
                    } catch (Exception var23) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg2.field621 = var13 + var14;
        }
        if ((arg1 & 256) == 256) {
            arg3.field337 = arg2.method211();
            int var22 = arg2.method214();
            arg3.field341 = var22 >> 16;
            arg3.field340 = (var22 & 65535) + field1311;
            arg3.field338 = 0;
            arg3.field339 = 0;
            if (arg3.field340 > field1311) {
                arg3.field338 = -1;
            }
            if (arg3.field337 == 65535) {
                arg3.field337 = -1;
            }
        }
        if ((arg1 & 512) == 512) {
            arg3.field342 = arg2.method209();
            arg3.field344 = arg2.method209();
            arg3.field343 = arg2.method209();
            arg3.field345 = arg2.method209();
            arg3.field346 = arg2.method211() + field1311;
            arg3.field347 = arg2.method211() + field1311;
            arg3.field348 = arg2.method209();
            arg3.field352 = 0;
            arg3.field353[0] = arg3.field343;
            arg3.field354[0] = arg3.field345;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method387(int arg0) {
        short var2 = 256;
        if (arg0 < 8 || arg0 > 8) {
            this.method6();
        }
        if (this.field1317 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1317 > 768) {
                    this.field1484[var3] = this.method480(this.field1398, 1024 - this.field1317, this.field1485[var3], this.field1486[var3]);
                } else if (this.field1317 > 256) {
                    this.field1484[var3] = this.field1486[var3];
                } else {
                    this.field1484[var3] = this.method480(this.field1398, 256 - this.field1317, this.field1486[var3], this.field1485[var3]);
                }
            }
        } else if (this.field1318 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1318 > 768) {
                    this.field1484[var4] = this.method480(this.field1398, 1024 - this.field1318, this.field1485[var4], this.field1487[var4]);
                } else if (this.field1318 > 256) {
                    this.field1484[var4] = this.field1487[var4];
                } else {
                    this.field1484[var4] = this.method480(this.field1398, 256 - this.field1318, this.field1487[var4], this.field1485[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1484[var5] = this.field1485[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1324.field670[var6] = this.field1097.field578[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1515[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1399[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1484[var26];
                    int var30 = this.field1324.field670[var8];
                    this.field1324.field670[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field1324.method236(0, super.field18, -3666, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1325.field670[var10] = this.field1098.field578[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1515[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1399[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1484[var18];
                    int var22 = this.field1325.field670[var16];
                    this.field1325.field670[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field1325.method236(0, super.field18, -3666, 661);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLkb;)V")
    private final void method388(int arg0, byte arg1, Packet arg2) {
        int var4 = arg2.method220(8, 0);
        if (var4 < this.field1202) {
            for (int var5 = var4; var5 < this.field1202; ++var5) {
                this.field1341[this.field1340++] = this.field1203[var5];
            }
        }
        if (var4 > this.field1202) {
            signlink.reporterror(this.field1474 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1202 = 0;
            if (this.field1339 != arg1) {
                this.field1409 = arg2.method209();
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1203[var6];
                PlayerEntity var8 = this.field1201[var7];
                int var9 = arg2.method220(1, 0);
                if (var9 == 0) {
                    this.field1203[this.field1202++] = var7;
                    var8.field349 = field1311;
                } else {
                    int var10 = arg2.method220(2, 0);
                    if (var10 == 0) {
                        this.field1203[this.field1202++] = var7;
                        var8.field349 = field1311;
                        this.field1205[this.field1204++] = var7;
                    } else if (var10 == 1) {
                        this.field1203[this.field1202++] = var7;
                        var8.field349 = field1311;
                        int var11 = arg2.method220(3, 0);
                        var8.method110(var11, false, (byte) 8);
                        int var12 = arg2.method220(1, 0);
                        if (var12 == 1) {
                            this.field1205[this.field1204++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1203[this.field1202++] = var7;
                        var8.field349 = field1311;
                        int var13 = arg2.method220(3, 0);
                        var8.method110(var13, true, (byte) 8);
                        int var14 = arg2.method220(3, 0);
                        var8.method110(var14, true, (byte) 8);
                        int var15 = arg2.method220(1, 0);
                        if (var15 == 1) {
                            this.field1205[this.field1204++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1341[this.field1340++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 219);
            if (arg0.length != 4) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
            } else {
                field1112 = Integer.parseInt(arg0[0]);
                field1113 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method474(field1191);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
                        return;
                    }
                    method401(-317);
                }
                if (arg0[3].equals("free")) {
                    field1114 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members]");
                        return;
                    }
                    field1114 = true;
                }
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method1(532, (byte) -14, 789);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method389(int arg0) {
        Graphics var2 = this.method11(field1316).getGraphics();
        var2.setColor(Color.black);
        if (arg0 != 0) {
            this.field1278 = null;
        }
        var2.fillRect(0, 0, 789, 532);
        this.method4(true, 1);
        if (this.field1447) {
            this.field1251 = false;
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
        if (this.field1518) {
            this.field1251 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1473) {
            this.field1251 = false;
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

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method390(boolean arg0) {
        if (arg0) {
            this.field1409 = -1;
        }
        for (int var2 = -1; var2 < this.field1202; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field1200;
            } else {
                var3 = this.field1203[var2];
            }
            PlayerEntity var4 = this.field1201[var3];
            if (var4 != null) {
                this.method420(-76, 1, var4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)V")
    public final void method391(String arg0, int arg1, boolean arg2, String arg3) {
        if (arg2) {
            this.field1355.method199(162);
        }
        if (arg1 == 0 && this.field1234 != -1) {
            this.field1307 = arg0;
            super.field27 = 0;
        }
        if (this.field1415 == -1) {
            this.field1342 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1176[var5] = this.field1176[var5 - 1];
            this.field1177[var5] = this.field1177[var5 - 1];
            this.field1178[var5] = this.field1178[var5 - 1];
        }
        this.field1176[0] = arg1;
        this.field1177[0] = arg3;
        this.field1178[0] = arg0;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method9(int arg0) {
        if (this.field1310 != arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (!this.field1473 && !this.field1447 && !this.field1518) {
            if (!this.field1105) {
                this.method392(false);
            } else {
                this.method426(0);
            }
            this.field1161 = 0;
        } else {
            this.method389(0);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method392(boolean arg0) {
        if (arg0) {
            this.field1355.method199(149);
        }
        this.method382(true);
        this.field1323.method235((byte) 120);
        this.field1260.method186(-790, 0, 0);
        short var2 = 360;
        short var3 = 200;
        if (this.field1371 == 0) {
            int var4 = var3 / 2 - 20;
            this.field1451.method189(var4, "Welcome to RuneScape", true, 16776960, (byte) 62, var2 / 2);
            int var15 = var4 + 30;
            int var5 = var2 / 2 - 80;
            int var6 = var3 / 2 + 20;
            this.field1261.method186(-790, var5 - 73, var6 - 20);
            this.field1451.method189(var6 + 5, "New user", true, 16777215, (byte) 62, var5);
            int var7 = var2 / 2 + 80;
            this.field1261.method186(-790, var7 - 73, var6 - 20);
            this.field1451.method189(var6 + 5, "Existing User", true, 16777215, (byte) 62, var7);
        }
        if (this.field1371 == 2) {
            int var8 = var3 / 2 - 40;
            if (this.field1345.length() > 0) {
                this.field1451.method189(var8 - 15, this.field1345, true, 16776960, (byte) 62, var2 / 2);
                this.field1451.method189(var8, this.field1346, true, 16776960, (byte) 62, var2 / 2);
                var8 += 30;
            } else {
                this.field1451.method189(var8 - 7, this.field1346, true, 16776960, (byte) 62, var2 / 2);
                var8 += 30;
            }
            this.field1451.method193(var2 / 2 - 90, 16777215, var8, "Username: " + this.field1474 + (this.field1482 == 0 & field1311 % 40 < 20 ? "@yel@|" : ""), 0, true);
            var8 += 15;
            this.field1451.method193(var2 / 2 - 88, 16777215, var8, "Password: " + JString.method257(4, this.field1475) + (this.field1482 == 1 & field1311 % 40 < 20 ? "@yel@|" : ""), 0, true);
            var8 += 15;
            int var9 = var2 / 2 - 80;
            int var10 = var3 / 2 + 50;
            this.field1261.method186(-790, var9 - 73, var10 - 20);
            this.field1451.method189(var10 + 5, "Login", true, 16777215, (byte) 62, var9);
            int var11 = var2 / 2 + 80;
            this.field1261.method186(-790, var11 - 73, var10 - 20);
            this.field1451.method189(var10 + 5, "Cancel", true, 16777215, (byte) 62, var11);
        }
        if (this.field1371 == 3) {
            this.field1451.method189(var3 / 2 - 60, "Create a free account", true, 16776960, (byte) 62, var2 / 2);
            int var12 = var3 / 2 - 35;
            this.field1451.method189(var12, "To create a new account you need to", true, 16777215, (byte) 62, var2 / 2);
            int var16 = var12 + 15;
            this.field1451.method189(var16, "go back to the main RuneScape webpage", true, 16777215, (byte) 62, var2 / 2);
            int var17 = var16 + 15;
            this.field1451.method189(var17, "and choose the red 'create account'", true, 16777215, (byte) 62, var2 / 2);
            int var18 = var17 + 15;
            this.field1451.method189(var18, "button at the top right of that page.", true, 16777215, (byte) 62, var2 / 2);
            int var19 = var18 + 15;
            int var13 = var2 / 2;
            int var14 = var3 / 2 + 50;
            this.field1261.method186(-790, var13 - 73, var14 - 20);
            this.field1451.method189(var14 + 5, "Cancel", true, 16777215, (byte) 62, var13);
        }
        this.field1323.method236(186, super.field18, -3666, 214);
        if (this.field1405) {
            this.field1405 = false;
            this.field1321.method236(0, super.field18, -3666, 128);
            this.field1322.method236(386, super.field18, -3666, 214);
            this.field1326.method236(265, super.field18, -3666, 0);
            this.field1327.method236(265, super.field18, -3666, 574);
            this.field1328.method236(186, super.field18, -3666, 128);
            this.field1329.method236(186, super.field18, -3666, 574);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILkb;I)V")
    private final void method393(int arg0, Packet arg1, int arg2) {
        arg1.method219(2);
        int var4 = arg1.method220(1, 0);
        if (var4 != 0) {
            int var5 = arg1.method220(2, 0);
            if (arg0 != 3) {
                this.field1409 = -1;
            }
            if (var5 == 0) {
                this.field1205[this.field1204++] = this.field1200;
            } else if (var5 == 1) {
                int var6 = arg1.method220(3, 0);
                this.field1185.method110(var6, false, (byte) 8);
                int var7 = arg1.method220(1, 0);
                if (var7 == 1) {
                    this.field1205[this.field1204++] = this.field1200;
                }
            } else if (var5 == 2) {
                int var8 = arg1.method220(3, 0);
                this.field1185.method110(var8, true, (byte) 8);
                int var9 = arg1.method220(3, 0);
                this.field1185.method110(var9, true, (byte) 8);
                int var10 = arg1.method220(1, 0);
                if (var10 == 1) {
                    this.field1205[this.field1204++] = this.field1200;
                }
            } else if (var5 == 3) {
                this.field1170 = arg1.method220(2, 0);
                int var11 = arg1.method220(7, 0);
                int var12 = arg1.method220(7, 0);
                int var13 = arg1.method220(1, 0);
                this.field1185.method109(var12, var13 == 1, var11, false);
                int var14 = arg1.method220(1, 0);
                if (var14 == 1) {
                    this.field1205[this.field1204++] = this.field1200;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method394(int arg0) {
        if (arg0 != 41690) {
            this.field1409 = -1;
        }
        int var2 = this.field1451.method190("Choose Option", true);
        for (int var3 = 0; var3 < this.field1343; ++var3) {
            int var11 = this.field1451.method190(this.field1212[var3], true);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        var2 += 8;
        int var4 = this.field1343 * 15 + 21;
        if (super.field28 > 8 && super.field29 > 11 && super.field28 < 520 && super.field29 < 345) {
            int var5 = super.field28 - 8 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field29 - 11;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field1246 = true;
            this.field1099 = 0;
            this.field1100 = var5;
            this.field1101 = var6;
            this.field1102 = var2;
            this.field1103 = this.field1343 * 15 + 22;
        }
        if (super.field28 > 562 && super.field29 > 231 && super.field28 < 752 && super.field29 < 492) {
            int var7 = super.field28 - 562 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field29 - 231;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field1246 = true;
            this.field1099 = 1;
            this.field1100 = var7;
            this.field1101 = var8;
            this.field1102 = var2;
            this.field1103 = this.field1343 * 15 + 22;
        }
        if (super.field28 > 22 && super.field29 > 375 && super.field28 < 501 && super.field29 < 471) {
            int var9 = super.field28 - 22 - var2 / 2;
            if (var9 < 0) {
                var9 = 0;
            } else if (var2 + var9 > 479) {
                var9 = 479 - var2;
            }
            int var10 = super.field29 - 375;
            if (var10 < 0) {
                var10 = 0;
            } else if (var4 + var10 > 96) {
                var10 = 96 - var4;
            }
            this.field1246 = true;
            this.field1099 = 2;
            this.field1100 = var9;
            this.field1101 = var10;
            this.field1102 = var2;
            this.field1103 = this.field1343 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field1255) {
            this.method442(24);
        } else if (this.field1089) {
            this.method488(-39294);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILkb;)V")
    public final void method395(byte arg0, int arg1, Packet arg2) {
        if (this.field1304 != arg0) {
            this.field1278 = null;
        }
        if (arg1 != 220 && arg1 != 214) {
            if (arg1 == 78) {
                int var4 = arg2.method209();
                int var5 = (var4 >> 4 & 7) + this.field1132;
                int var6 = (var4 & 7) + this.field1133;
                int var7 = arg2.method209();
                int var8 = var7 >> 2;
                int var9 = this.field1208[var8];
                int var10 = arg2.method211();
                if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                    int var11 = 0;
                    if (var9 == 0) {
                        var11 = this.field1504.method77(this.field1170, var5, var6);
                    }
                    if (var9 == 1) {
                        var11 = this.field1504.method78(this.field1170, 0, var6, var5);
                    }
                    if (var9 == 2) {
                        var11 = this.field1504.method79(this.field1170, var5, var6);
                    }
                    if (var9 == 3) {
                        var11 = this.field1504.method80(this.field1170, var5, var6);
                    }
                    if (var11 != 0) {
                        LocEntity var12 = new LocEntity(var9, var6, this.field1170, false, SeqType.field1023[var10], this.field1250, var11 >> 14 & 32767, var5);
                        this.field1197.method225(var12);
                    }
                }
            } else if (arg1 == 246) {
                int var13 = arg2.method209();
                int var14 = (var13 >> 4 & 7) + this.field1132;
                int var15 = (var13 & 7) + this.field1133;
                int var16 = arg2.method211();
                int var17 = arg2.method211();
                if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                    ObjStackEntity var18 = new ObjStackEntity();
                    var18.field302 = var16;
                    var18.field303 = var17;
                    if (this.field1278[this.field1170][var14][var15] == null) {
                        this.field1278[this.field1170][var14][var15] = new LinkList(2);
                    }
                    this.field1278[this.field1170][var14][var15].method225(var18);
                    this.method459(var14, var15);
                }
            } else if (arg1 == 61) {
                int var19 = arg2.method209();
                int var20 = (var19 >> 4 & 7) + this.field1132;
                int var21 = (var19 & 7) + this.field1133;
                int var22 = arg2.method211();
                if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                    LinkList var23 = this.field1278[this.field1170][var20][var21];
                    if (var23 != null) {
                        for (ObjStackEntity var24 = (ObjStackEntity) var23.method228(); var24 != null; var24 = (ObjStackEntity) var23.method230(0)) {
                            if ((var22 & 32767) == var24.field302) {
                                var24.method107();
                                break;
                            }
                        }
                        if (var23.method228() == null) {
                            this.field1278[this.field1170][var20][var21] = null;
                        }
                        this.method459(var20, var21);
                    }
                }
            } else if (arg1 == 1) {
                int var25 = arg2.method209();
                int var26 = (var25 >> 4 & 7) + this.field1132;
                int var27 = (var25 & 7) + this.field1133;
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
                    ProjectileEntity var42 = new ProjectileEntity(field1311 + var35, this.method447(var39, var38, true, this.field1170) - var32, var37, field1311 + var34, this.field1170, var30, var36, var39, this.field1338, var31, var38, var33);
                    var42.method116(var40, this.method447(var41, var40, true, this.field1170) - var33, 0, var41, field1311 + var34);
                    this.field1336.method225(var42);
                }
            } else if (arg1 == 195) {
                int var43 = arg2.method209();
                int var44 = (var43 >> 4 & 7) + this.field1132;
                int var45 = (var43 & 7) + this.field1133;
                int var46 = arg2.method211();
                int var47 = arg2.method209();
                int var48 = arg2.method211();
                if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
                    int var49 = var44 * 128 + 64;
                    int var50 = var45 * 128 + 64;
                    SpotAnimEntity var51 = new SpotAnimEntity(var46, var48, this.field1170, var50, var49, 7, field1311, this.method447(var50, var49, true, this.field1170) - var47);
                    this.field1106.method225(var51);
                }
            } else if (arg1 == 127) {
                int var52 = arg2.method209();
                int var53 = (var52 >> 4 & 7) + this.field1132;
                int var54 = (var52 & 7) + this.field1133;
                int var55 = arg2.method211();
                int var56 = arg2.method211();
                int var57 = arg2.method211();
                if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104 && this.field1350 != var57) {
                    ObjStackEntity var58 = new ObjStackEntity();
                    var58.field302 = var55;
                    var58.field303 = var56;
                    if (this.field1278[this.field1170][var53][var54] == null) {
                        this.field1278[this.field1170][var53][var54] = new LinkList(2);
                    }
                    this.field1278[this.field1170][var53][var54].method225(var58);
                    this.method459(var53, var54);
                }
            } else {
                if (arg1 == 25) {
                    int var59 = arg2.method209();
                    int var60 = (var59 >> 4 & 7) + this.field1132;
                    int var61 = (var59 & 7) + this.field1133;
                    int var62 = arg2.method209();
                    int var63 = var62 >> 2;
                    int var64 = var62 & 3;
                    int var65 = this.field1208[var63];
                    int var66 = arg2.method211();
                    int var67 = arg2.method211();
                    int var68 = arg2.method211();
                    int var69 = arg2.method211();
                    byte var70 = arg2.method210();
                    byte var71 = arg2.method210();
                    byte var72 = arg2.method210();
                    byte var73 = arg2.method210();
                    PlayerEntity var74;
                    if (this.field1350 == var69) {
                        var74 = this.field1185;
                    } else {
                        var74 = this.field1201[var69];
                    }
                    if (var74 != null) {
                        LocSpawned var75 = new LocSpawned(var64, this.field1170, var63, field1311 + var67, var65, -1, var61, var60, 478);
                        this.field1353.method225(var75);
                        LocSpawned var76 = new LocSpawned(var64, this.field1170, var63, field1311 + var68, var65, var66, var61, var60, 478);
                        this.field1353.method225(var76);
                        int var77 = this.field1308[this.field1170][var60][var61];
                        int var78 = this.field1308[this.field1170][var60 + 1][var61];
                        int var79 = this.field1308[this.field1170][var60 + 1][var61 + 1];
                        int var80 = this.field1308[this.field1170][var60][var61 + 1];
                        LocType var81 = LocType.method275(var66);
                        var74.field370 = field1311 + var67;
                        var74.field371 = field1311 + var68;
                        var74.field375 = var81.method278(var63, var64, var77, var78, var79, var80, -1);
                        int var82 = var81.field813;
                        int var83 = var81.field814;
                        if (var64 == 1 || var64 == 3) {
                            var82 = var81.field814;
                            var83 = var81.field813;
                        }
                        var74.field372 = var60 * 128 + var82 * 64;
                        var74.field374 = var61 * 128 + var83 * 64;
                        var74.field373 = this.method447(var74.field374, var74.field372, true, this.field1170);
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
                        var74.field376 = var60 + var70;
                        var74.field378 = var60 + var72;
                        var74.field377 = var61 + var71;
                        var74.field379 = var61 + var73;
                    }
                }
                if (arg1 == 117) {
                    int var86 = arg2.method209();
                    int var87 = (var86 >> 4 & 7) + this.field1132;
                    int var88 = (var86 & 7) + this.field1133;
                    int var89 = arg2.method211();
                    int var90 = arg2.method211();
                    int var91 = arg2.method211();
                    if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                        LinkList var92 = this.field1278[this.field1170][var87][var88];
                        if (var92 != null) {
                            for (ObjStackEntity var93 = (ObjStackEntity) var92.method228(); var93 != null; var93 = (ObjStackEntity) var92.method230(0)) {
                                if ((var89 & 32767) == var93.field302 && var93.field303 == var90) {
                                    var93.field303 = var91;
                                    break;
                                }
                            }
                            this.method459(var87, var88);
                        }
                    }
                }
            }
        } else {
            int var94 = arg2.method209();
            int var95 = (var94 >> 4 & 7) + this.field1132;
            int var96 = (var94 & 7) + this.field1133;
            int var97 = arg2.method209();
            int var98 = var97 >> 2;
            int var99 = var97 & 3;
            int var100 = this.field1208[var98];
            int var101;
            if (arg1 == 214) {
                var101 = -1;
            } else {
                var101 = arg2.method211();
            }
            if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                LocMerged var102 = null;
                for (LocMerged var103 = (LocMerged) this.field1087.method228(); var103 != null; var103 = (LocMerged) this.field1087.method230(0)) {
                    if (this.field1170 == var103.field633 && var103.field635 == var95 && var103.field636 == var96 && var103.field634 == var100) {
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
                        var104 = this.field1504.method77(this.field1170, var95, var96);
                    }
                    if (var100 == 1) {
                        var104 = this.field1504.method78(this.field1170, 0, var96, var95);
                    }
                    if (var100 == 2) {
                        var104 = this.field1504.method79(this.field1170, var95, var96);
                    }
                    if (var100 == 3) {
                        var104 = this.field1504.method80(this.field1170, var95, var96);
                    }
                    if (var104 != 0) {
                        int var108 = this.field1504.method81(this.field1170, var95, var96, var104);
                        var105 = var104 >> 14 & 32767;
                        var106 = var108 & 31;
                        var107 = var108 >> 6;
                    }
                    var102 = new LocMerged();
                    var102.field633 = this.field1170;
                    var102.field634 = var100;
                    var102.field635 = var95;
                    var102.field636 = var96;
                    var102.field640 = var105;
                    var102.field642 = var106;
                    var102.field641 = var107;
                    this.field1087.method225(var102);
                }
                var102.field637 = var101;
                var102.field639 = var98;
                var102.field638 = var99;
                this.method445(var100, 36300, var99, var98, var96, var95, this.field1170, var101);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLhc;)Z")
    public final boolean method396(byte arg0, Component arg1) {
        if (arg0 != -69) {
            throw new NullPointerException();
        } else {
            int var3 = arg1.field964;
            if (var3 == 201) {
                this.field1342 = true;
                this.field1302 = false;
                this.field1356 = true;
                this.field1370 = "";
                this.field1254 = 1;
                this.field1407 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field1342 = true;
                this.field1302 = false;
                this.field1356 = true;
                this.field1370 = "";
                this.field1254 = 2;
                this.field1407 = "Enter name of friend to delete from list";
            }
            if (var3 == 205) {
                this.field1412 = 250;
                return true;
            } else {
                if (var3 == 501) {
                    this.field1342 = true;
                    this.field1302 = false;
                    this.field1356 = true;
                    this.field1370 = "";
                    this.field1254 = 4;
                    this.field1407 = "Enter name of player to add to list";
                }
                if (var3 == 502) {
                    this.field1342 = true;
                    this.field1302 = false;
                    this.field1356 = true;
                    this.field1370 = "";
                    this.field1254 = 5;
                    this.field1407 = "Enter name of player to delete from list";
                }
                if (var3 >= 300 && var3 <= 313) {
                    int var4 = (var3 - 300) / 2;
                    int var5 = var3 & 1;
                    int var6 = this.field1496[var4];
                    if (var6 != -1) {
                        while (true) {
                            if (var5 == 0) {
                                --var6;
                                if (var6 < 0) {
                                    var6 = IdkType.field944 - 1;
                                }
                            }
                            if (var5 == 1) {
                                ++var6;
                                if (var6 >= IdkType.field944) {
                                    var6 = 0;
                                }
                            }
                            if (!IdkType.field945[var6].field951 && IdkType.field945[var6].field946 == var4 + (this.field1231 ? 0 : 7)) {
                                this.field1496[var4] = var6;
                                this.field1126 = true;
                                break;
                            }
                        }
                    }
                }
                if (var3 >= 314 && var3 <= 323) {
                    int var7 = (var3 - 314) / 2;
                    int var8 = var3 & 1;
                    int var9 = this.field1137[var7];
                    if (var8 == 0) {
                        --var9;
                        if (var9 < 0) {
                            var9 = field1510[var7].length - 1;
                        }
                    }
                    if (var8 == 1) {
                        ++var9;
                        if (var9 >= field1510[var7].length) {
                            var9 = 0;
                        }
                    }
                    this.field1137[var7] = var9;
                    this.field1126 = true;
                }
                if (var3 == 324 && !this.field1231) {
                    this.field1231 = true;
                    this.method432((byte) 7);
                }
                if (var3 == 325 && this.field1231) {
                    this.field1231 = false;
                    this.method432((byte) 7);
                }
                if (var3 != 326) {
                    if (var3 == 613) {
                        this.field1444 = !this.field1444;
                    }
                    if (var3 >= 601 && var3 <= 612) {
                        this.method398((byte) 3);
                        if (this.field1287.length() > 0) {
                            this.field1355.method198(0, 252);
                            this.field1355.method205(6, JString.method251(this.field1287));
                            this.field1355.method199(var3 - 601);
                            this.field1355.method199(this.field1444 ? 1 : 0);
                        }
                    }
                    return false;
                } else {
                    this.field1355.method198(0, 239);
                    this.field1355.method199(this.field1231 ? 0 : 1);
                    for (int var10 = 0; var10 < 7; ++var10) {
                        this.field1355.method199(this.field1496[var10]);
                    }
                    for (int var11 = 0; var11 < 5; ++var11) {
                        this.field1355.method199(this.field1137[var11]);
                    }
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method397(int arg0) {
        if (this.field1343 >= 2 || this.field1289 != 0 || this.field1468 != 0) {
            if (arg0 < 7 || arg0 > 7) {
                this.field1409 = -1;
            }
            String var2;
            if (this.field1289 == 1 && this.field1343 < 2) {
                var2 = "Use " + this.field1293 + " with...";
            } else if (this.field1468 == 1 && this.field1343 < 2) {
                var2 = this.field1471 + "...";
            } else {
                var2 = this.field1212[this.field1343 - 1];
            }
            if (this.field1343 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1343 - 2) + " more options";
            }
            this.field1451.method193(4, 16777215, 15, var2, 0, true);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method398(byte arg0) {
        this.field1355.method198(0, 153);
        if (arg0 != 3) {
            this.field1278 = null;
        }
        if (this.field1416 != -1) {
            this.field1416 = -1;
            this.field1472 = true;
            this.field1373 = false;
            this.field1214 = true;
        }
        if (this.field1415 != -1) {
            this.field1415 = -1;
            this.field1342 = true;
            this.field1373 = false;
        }
        this.field1413 = -1;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method399(int arg0, int arg1, int arg2) {
        if (arg1 >= 0) {
            field1316 = -60;
        }
        int var3 = arg2 - arg0;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method400(int arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field1096; ++var4) {
                if (this.field1445[var4] == arg1) {
                    --this.field1096;
                    this.field1472 = true;
                    for (int var5 = var4; var5 < this.field1096; ++var5) {
                        this.field1299[var5] = this.field1299[var5 + 1];
                        this.field1332[var5] = this.field1332[var5 + 1];
                        this.field1445[var5] = this.field1445[var5 + 1];
                    }
                    this.field1355.method198(0, 210);
                    this.field1355.method205(6, arg1);
                    break;
                }
            }
            if (arg0 >= 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public static final void method401(int arg0) {
        while (arg0 >= 0) {
            field1191 = -264;
        }
        World3D.field223 = false;
        Pix3D.field550 = false;
        field1115 = false;
        World.field41 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILkb;B)V")
    private final void method402(int arg0, Packet arg1, byte arg2) {
        if (arg2 != 76) {
            this.field1171 = 435;
        }
        for (int var4 = 0; var4 < this.field1204; ++var4) {
            int var5 = this.field1205[var4];
            PlayerEntity var6 = this.field1201[var5];
            int var7 = arg1.method209();
            if ((var7 & 128) == 128) {
                var7 += arg1.method209() << 8;
            }
            this.method386(var5, var7, arg1, var6, 6748);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)V")
    public final void method403(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1504.method77(arg2, arg1, arg3);
        if (var5 != 0) {
            int var6 = this.field1504.method81(arg2, arg1, arg3, var5);
            int var7 = var6 >> 6 & 3;
            int var8 = var6 & 31;
            int var9 = 15658734;
            if (var5 > 0) {
                var9 = 15597568;
            }
            int[] var10 = this.field1156.field578;
            int var11 = (103 - arg3) * 512 * 4 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 32767;
            LocType var13 = LocType.method275(var12);
            if (var13.field828 != -1) {
                Pix8 var14 = this.field1108[var13.field828];
                if (var14 != null) {
                    int var15 = (var13.field813 * 4 - var14.field592) / 2;
                    int var16 = (var13.field814 * 4 - var14.field593) / 2;
                    var14.method186(-790, arg1 * 4 + 48 + var15, (104 - arg3 - var13.field814) * 4 + 48 + var16);
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
        int var17 = this.field1504.method79(arg2, arg1, arg3);
        if (var17 != 0) {
            int var18 = this.field1504.method81(arg2, arg1, arg3, var17);
            int var19 = var18 >> 6 & 3;
            int var20 = var18 & 31;
            int var21 = var17 >> 14 & 32767;
            LocType var22 = LocType.method275(var21);
            if (var22.field828 != -1) {
                Pix8 var23 = this.field1108[var22.field828];
                if (var23 != null) {
                    int var24 = (var22.field813 * 4 - var23.field592) / 2;
                    int var25 = (var22.field814 * 4 - var23.field593) / 2;
                    var23.method186(-790, arg1 * 4 + 48 + var24, (104 - arg3 - var22.field814) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = this.field1156.field578;
                int var28 = (103 - arg3) * 512 * 4 + arg1 * 4 + 24624;
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
        int var29 = this.field1504.method80(arg2, arg1, arg3);
        if (arg0 < 9 || arg0 > 9) {
            field1191 = this.field1479.method246();
        }
        if (var29 != 0) {
            int var30 = var29 >> 14 & 32767;
            LocType var31 = LocType.method275(var30);
            if (var31.field828 != -1) {
                Pix8 var32 = this.field1108[var31.field828];
                if (var32 != null) {
                    int var33 = (var31.field813 * 4 - var32.field592) / 2;
                    int var34 = (var31.field814 * 4 - var32.field593) / 2;
                    var32.method186(-790, arg1 * 4 + 48 + var33, (104 - arg3 - var31.field814) * 4 + 48 + var34);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method7(byte arg0) {
        if (this.field1440 != arg0) {
            this.field1355.method199(214);
        }
        if (!this.field1473 && !this.field1447 && !this.field1518) {
            ++field1311;
            if (!this.field1105) {
                this.method440(35328);
            } else {
                this.method475(0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;IIII)V")
    public final void method404(PlayerEntity arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < this.field1502 || arg1 > this.field1502) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if (this.field1185 != arg0) {
            if (this.field1343 < 400) {
                String var7 = arg0.field361 + method399(arg0.field367, -492, this.field1185.field367) + " (level-" + arg0.field367 + ")";
                if (this.field1289 == 1) {
                    this.field1212[this.field1343] = "Use " + this.field1293 + " with @whi@" + var7;
                    this.field1222[this.field1343] = 103;
                    this.field1223[this.field1343] = arg4;
                    this.field1220[this.field1343] = arg2;
                    this.field1221[this.field1343] = arg3;
                    ++this.field1343;
                } else if (this.field1468 == 1) {
                    if ((this.field1470 & 8) == 8) {
                        this.field1212[this.field1343] = this.field1471 + " @whi@" + var7;
                        this.field1222[this.field1343] = 48;
                        this.field1223[this.field1343] = arg4;
                        this.field1220[this.field1343] = arg2;
                        this.field1221[this.field1343] = arg3;
                        ++this.field1343;
                    }
                } else {
                    this.field1212[this.field1343] = "Follow @whi@" + var7;
                    this.field1222[this.field1343] = 1741;
                    this.field1223[this.field1343] = arg4;
                    this.field1220[this.field1343] = arg2;
                    this.field1221[this.field1343] = arg3;
                    ++this.field1343;
                    if (this.field1288 == 0) {
                        this.field1212[this.field1343] = "Trade with @whi@" + var7;
                        this.field1222[this.field1343] = 1528;
                        this.field1223[this.field1343] = arg4;
                        this.field1220[this.field1343] = arg2;
                        this.field1221[this.field1343] = arg3;
                        ++this.field1343;
                    }
                    if (this.field1354 > 0) {
                        this.field1212[this.field1343] = "Attack @whi@" + var7;
                        if (this.field1185.field367 >= arg0.field367) {
                            this.field1222[this.field1343] = 593;
                        } else {
                            this.field1222[this.field1343] = 2593;
                        }
                        this.field1223[this.field1343] = arg4;
                        this.field1220[this.field1343] = arg2;
                        this.field1221[this.field1343] = arg3;
                        ++this.field1343;
                    }
                    if (this.field1519 == 1) {
                        this.field1212[this.field1343] = "Fight @whi@" + var7;
                        this.field1222[this.field1343] = 593;
                        this.field1223[this.field1343] = arg4;
                        this.field1220[this.field1343] = arg2;
                        this.field1221[this.field1343] = arg3;
                        ++this.field1343;
                    }
                    if (this.field1519 == 2) {
                        this.field1212[this.field1343] = "Duel-with @whi@" + var7;
                        this.field1222[this.field1343] = 1596;
                        this.field1223[this.field1343] = arg4;
                        this.field1220[this.field1343] = arg2;
                        this.field1221[this.field1343] = arg3;
                        ++this.field1343;
                    }
                }
                for (int var8 = 0; var8 < this.field1343; ++var8) {
                    if (this.field1222[var8] == 981) {
                        this.field1212[var8] = "Walk here @whi@" + var7;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLib;)V")
    public final void method405(byte arg0, Pix8 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1248.length; ++var4) {
            this.field1248[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1248[var17] = (int) (Math.random() * 256.0D);
        }
        if (arg0 != 8) {
            field1191 = this.field1479.method246();
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field1249[var16] = (this.field1248[var16 - 1] + this.field1248[var16 + 1] + this.field1248[var16 - 128] + this.field1248[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field1248;
            this.field1248 = this.field1249;
            this.field1249 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field593; ++var8) {
                for (int var9 = 0; var9 < arg1.field592; ++var9) {
                    if (arg1.field590[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field594;
                        int var11 = var8 + 16 + arg1.field595;
                        int var12 = (var11 << 7) + var10;
                        this.field1248[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;I)V")
    public final void method406(int arg0, int arg1, String arg2, int arg3) {
        if (arg2 != null) {
            Object var5 = this.field1138;
            synchronized (this.field1138) {
                this.field1129 = arg2;
                this.field1266 = arg1;
                this.field1428 = arg0;
            }
            if (arg3 != 801) {
                for (int var6 = 1; var6 > 0; ++var6) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILkb;I)V")
    private final void method407(int arg0, Packet arg1, int arg2) {
        if (arg2 != -37941) {
            this.field1355.method199(237);
        }
        arg1.method219(2);
        int var4 = arg1.method220(8, 0);
        if (var4 < this.field1297) {
            for (int var5 = var4; var5 < this.field1297; ++var5) {
                this.field1341[this.field1340++] = this.field1298[var5];
            }
        }
        if (var4 > this.field1297) {
            signlink.reporterror(this.field1474 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field1297 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1298[var6];
                NpcEntity var8 = this.field1296[var7];
                int var9 = arg1.method220(1, 0);
                if (var9 == 0) {
                    this.field1298[this.field1297++] = var7;
                    var8.field349 = field1311;
                } else {
                    int var10 = arg1.method220(2, 0);
                    if (var10 == 0) {
                        this.field1298[this.field1297++] = var7;
                        var8.field349 = field1311;
                        this.field1205[this.field1204++] = var7;
                    } else if (var10 == 1) {
                        this.field1298[this.field1297++] = var7;
                        var8.field349 = field1311;
                        int var11 = arg1.method220(3, 0);
                        var8.method110(var11, false, (byte) 8);
                        int var12 = arg1.method220(1, 0);
                        if (var12 == 1) {
                            this.field1205[this.field1204++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1298[this.field1297++] = var7;
                        var8.field349 = field1311;
                        int var13 = arg1.method220(3, 0);
                        var8.method110(var13, true, (byte) 8);
                        int var14 = arg1.method220(3, 0);
                        var8.method110(var14, true, (byte) 8);
                        int var15 = arg1.method220(1, 0);
                        if (var15 == 1) {
                            this.field1205[this.field1204++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1341[this.field1340++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZ)Ljava/lang/String;")
    private static final String method408(int arg0, boolean arg1) {
        String var2 = String.valueOf(arg0);
        if (arg1) {
            field1406 = !field1406;
        }
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lhc;ZIII)V")
    public final void method409(Component arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg0.field962 == 0 && arg0.field976 != null) {
            if (!arg0.field975 || this.field1352 == arg0.field960 || this.field1268 == arg0.field960 || this.field1282 == arg0.field960) {
                int var6 = Pix2D.field539;
                int var7 = Pix2D.field537;
                int var8 = Pix2D.field540;
                int var9 = Pix2D.field538;
                Pix2D.method147(arg0.field966 + arg2, this.field1516, arg4, arg2, arg0.field965 + arg4);
                if (arg1) {
                    this.field1409 = this.field1335.method209();
                }
                int var10 = arg0.field976.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg0.field977[var11] + arg4;
                    int var13 = arg0.field978[var11] + arg2 - arg3;
                    Component var14 = Component.field955[arg0.field976[var11]];
                    int var15 = var14.field967 + var12;
                    int var16 = var14.field968 + var13;
                    if (var14.field964 > 0) {
                        this.method415(var14, 4);
                    }
                    if (var14.field962 == 0) {
                        if (var14.field974 > var14.field973 - var14.field966) {
                            var14.field974 = var14.field973 - var14.field966;
                        }
                        if (var14.field974 < 0) {
                            var14.field974 = 0;
                        }
                        this.method409(var14, false, var16, var14.field974, var15);
                        if (var14.field973 > var14.field966) {
                            this.method431(var14.field966, -19, var16, var14.field974, var14.field965 + var15, var14.field973);
                        }
                    } else if (var14.field962 != 1) {
                        if (var14.field962 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field966; ++var18) {
                                for (int var19 = 0; var19 < var14.field965; ++var19) {
                                    int var20 = (var14.field984 + 32) * var19 + var15;
                                    int var21 = (var14.field985 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field987[var17];
                                        var21 += var14.field988[var17];
                                    }
                                    if (var14.field956[var17] <= 0) {
                                        if (var14.field986 != null && var17 < 20) {
                                            Pix32 var27 = var14.field986[var17];
                                            if (var27 != null) {
                                                var27.method173(-790, var20, var21);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field956[var17] - 1;
                                        Pix32 var25 = ObjType.method292(var24, var14.field957[var17], 763);
                                        if (this.field1274 != 0 && this.field1273 == var17 && this.field1272 == var14.field960) {
                                            var22 = super.field25 - this.field1275;
                                            var23 = super.field26 - this.field1276;
                                            if (var22 < 5 && var22 > -5) {
                                                var22 = 0;
                                            }
                                            if (var23 < 5 && var23 > -5) {
                                                var23 = 0;
                                            }
                                            if (this.field1127 < 5) {
                                                var22 = 0;
                                                var23 = 0;
                                            }
                                            var25.method177(var21 + var23, var20 + var22, 128, false);
                                        } else if (this.field1427 != 0 && this.field1426 == var17 && this.field1425 == var14.field960) {
                                            var25.method177(var21, var20, 128, false);
                                        } else {
                                            var25.method173(-790, var20, var21);
                                        }
                                        if (var25.field583 == 33 || var14.field957[var17] != 1) {
                                            int var26 = var14.field957[var17];
                                            this.field1449.method191(var20 + 1 + var22, 0, (byte) 6, method448(309, var26), var21 + 10 + var23);
                                            this.field1449.method191(var20 + var22, 16776960, (byte) 6, method448(309, var26), var21 + 9 + var23);
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field962 == 3) {
                            if (var14.field990) {
                                Pix2D.method149(var14.field996, -288, var15, var16, var14.field965, var14.field966);
                            } else {
                                Pix2D.method150(var14.field996, field1406, var15, var16, var14.field966, var14.field965);
                            }
                        } else if (var14.field962 == 4) {
                            PixFont var28 = var14.field993;
                            int var29 = var14.field996;
                            String var30 = var14.field994;
                            if ((this.field1282 == var14.field960 || this.field1268 == var14.field960 || this.field1352 == var14.field960) && var14.field998 != 0) {
                                var29 = var14.field998;
                            }
                            if (this.method437(var14, (byte) 0)) {
                                var29 = var14.field997;
                                if (var14.field995.length() > 0) {
                                    var30 = var14.field995;
                                }
                            }
                            if (var14.field963 == 6 && this.field1373) {
                                var30 = "Please wait...";
                                var29 = var14.field996;
                            }
                            int var31 = var28.field608 + var16;
                            while (var30.length() > 0) {
                                if (var30.indexOf("%") != -1) {
                                    label246: while (true) {
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
                                                                            break label246;
                                                                        }
                                                                        var30 = var30.substring(0, var36) + this.method414(false, this.method367(true, var14, 4)) + var30.substring(var36 + 2);
                                                                    }
                                                                }
                                                                var30 = var30.substring(0, var35) + this.method414(false, this.method367(true, var14, 3)) + var30.substring(var35 + 2);
                                                            }
                                                        }
                                                        var30 = var30.substring(0, var34) + this.method414(false, this.method367(true, var14, 2)) + var30.substring(var34 + 2);
                                                    }
                                                }
                                                var30 = var30.substring(0, var33) + this.method414(false, this.method367(true, var14, 1)) + var30.substring(var33 + 2);
                                            }
                                        }
                                        var30 = var30.substring(0, var32) + this.method414(false, this.method367(true, var14, 0)) + var30.substring(var32 + 2);
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
                                if (var14.field991) {
                                    var28.method189(var31, var38, var14.field992, var29, (byte) 62, var14.field965 / 2 + var15);
                                } else {
                                    var28.method193(var15, var29, var31, var38, 0, var14.field992);
                                }
                                var31 += var28.field608;
                            }
                        } else if (var14.field962 == 5) {
                            Pix32 var39;
                            if (this.method437(var14, (byte) 0)) {
                                var39 = var14.field1000;
                            } else {
                                var39 = var14.field999;
                            }
                            if (var39 != null) {
                                var39.method173(-790, var15, var16);
                            }
                        } else if (var14.field962 == 6) {
                            int var40 = Pix3D.field555;
                            int var41 = Pix3D.field556;
                            Pix3D.field555 = var14.field965 / 2 + var15;
                            Pix3D.field556 = var14.field966 / 2 + var16;
                            int var42 = Pix3D.field559[var14.field1006] * var14.field1005 >> 16;
                            int var43 = Pix3D.field560[var14.field1006] * var14.field1005 >> 16;
                            boolean var44 = this.method437(var14, (byte) 0);
                            int var45;
                            if (var44) {
                                var45 = var14.field1004;
                            } else {
                                var45 = var14.field1003;
                            }
                            Model var46;
                            if (var45 == -1) {
                                var46 = var14.method315(-1, -1, var44);
                            } else {
                                SeqType var47 = SeqType.field1023[var45];
                                var46 = var14.method315(var47.field1025[var14.field958], var47.field1026[var14.field958], var44);
                            }
                            if (var46 != null) {
                                var46.method139(0, var14.field1007, 0, var14.field1006, 0, var42, var43);
                            }
                            Pix3D.field555 = var40;
                            Pix3D.field556 = var41;
                        } else if (var14.field962 == 7) {
                            PixFont var48 = var14.field993;
                            int var49 = 0;
                            for (int var50 = 0; var50 < var14.field966; ++var50) {
                                for (int var51 = 0; var51 < var14.field965; ++var51) {
                                    if (var14.field956[var49] > 0) {
                                        ObjType var52 = ObjType.method287(var14.field956[var49] - 1);
                                        String var53 = var52.field881;
                                        if (var52.field893 || var14.field957[var49] != 1) {
                                            var53 = var53 + " x" + method408(var14.field957[var49], false);
                                        }
                                        int var54 = (var14.field984 + 115) * var51 + var15;
                                        int var55 = (var14.field985 + 12) * var50 + var16;
                                        if (var14.field991) {
                                            var48.method189(var55, var53, var14.field992, var14.field996, (byte) 62, var14.field965 / 2 + var54);
                                        } else {
                                            var48.method193(var54, var14.field996, var55, var53, 0, var14.field992);
                                        }
                                    }
                                    ++var49;
                                }
                            }
                        }
                    }
                }
                Pix2D.method147(var9, this.field1516, var6, var7, var8);
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)Ljava/lang/String;")
    public final String method410(boolean arg0) {
        if (arg0) {
            field1316 = this.field1479.method246();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field21 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method411(boolean arg0) {
        if (!arg0) {
            this.field1168 = !this.field1168;
        }
        this.field1141 = 0;
        for (int var2 = -1; var2 < this.field1297 + this.field1202; ++var2) {
            PathingEntity var17;
            if (var2 == -1) {
                var17 = this.field1185;
            } else if (var2 < this.field1202) {
                var17 = this.field1201[this.field1203[var2]];
            } else {
                var17 = this.field1296[this.field1298[var2 - this.field1202]];
            }
            if (var17 != null && var17.method111(true)) {
                if (var2 >= this.field1202) {
                    if (this.field1380 == 1 && this.field1298[var2 - this.field1202] == this.field1180 && field1311 % 20 < 10) {
                        this.method427(var17.field350 + 15, var17, 5);
                        if (this.field1228 > -1) {
                            this.field1378[2].method173(-790, this.field1228 - 12, this.field1229 - 28);
                        }
                    }
                } else {
                    int var18 = 30;
                    PlayerEntity var19 = (PlayerEntity) var17;
                    if (var19.field364 != 0) {
                        this.method427(var17.field350 + 15, var17, 5);
                        if (this.field1228 > -1) {
                            for (int var20 = 0; var20 < 8; ++var20) {
                                if ((var19.field364 & 1 << var20) != 0) {
                                    this.field1378[var20].method173(-790, this.field1228 - 12, this.field1229 - var18);
                                    var18 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field1380 == 10 && this.field1203[var2] == this.field1429) {
                        this.method427(var17.field350 + 15, var17, 5);
                        if (this.field1228 > -1) {
                            this.field1378[7].method173(-790, this.field1228 - 12, this.field1229 - var18);
                        }
                    }
                }
                if (var17.field317 != null && (var2 >= this.field1202 || this.field1509 == 0 || this.field1509 == 3 || this.field1509 == 1 && this.method464(((PlayerEntity) var17).field361, this.field1188))) {
                    this.method427(var17.field350, var17, 5);
                    if (this.field1228 > -1 && this.field1141 < this.field1142) {
                        this.field1146[this.field1141] = this.field1451.method190(var17.field317, true) / 2;
                        this.field1145[this.field1141] = this.field1451.field608;
                        this.field1143[this.field1141] = this.field1228;
                        this.field1144[this.field1141] = this.field1229;
                        this.field1147[this.field1141] = var17.field319;
                        this.field1148[this.field1141] = var17.field320;
                        this.field1149[this.field1141] = var17.field318;
                        this.field1150[this.field1141++] = var17.field317;
                        if (this.field1189 == 0 && var17.field320 == 1) {
                            this.field1145[this.field1141] += 10;
                            this.field1144[this.field1141] += 5;
                        }
                        if (this.field1189 == 0 && var17.field320 == 2) {
                            this.field1146[this.field1141] = 60;
                        }
                    }
                }
                if (var17.field323 > field1311 + 100) {
                    this.method427(var17.field350 + 15, var17, 5);
                    if (this.field1228 > -1) {
                        int var21 = var17.field324 * 30 / var17.field325;
                        if (var21 > 30) {
                            var21 = 30;
                        }
                        Pix2D.method149(65280, -288, this.field1228 - 15, this.field1229 - 3, var21, 5);
                        Pix2D.method149(16711680, -288, this.field1228 - 15 + var21, this.field1229 - 3, 30 - var21, 5);
                    }
                }
                if (var17.field323 > field1311 + 330) {
                    this.method427(var17.field350 / 2, var17, 5);
                    if (this.field1228 > -1) {
                        this.field1458[var17.field322].method173(-790, this.field1228 - 12, this.field1229 - 12);
                        this.field1449.method188(12097, this.field1228, this.field1229 + 4, String.valueOf(var17.field321), 0);
                        this.field1449.method188(12097, this.field1228 - 1, this.field1229 + 3, String.valueOf(var17.field321), 16777215);
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field1141; ++var3) {
            int var4 = this.field1143[var3];
            int var5 = this.field1144[var3];
            int var6 = this.field1146[var3];
            int var7 = this.field1145[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var16 = 0; var16 < var3; ++var16) {
                    if (var5 + 2 > this.field1144[var16] - this.field1145[var16] && var5 - var7 < this.field1144[var16] + 2 && var4 - var6 < this.field1146[var16] + this.field1143[var16] && var4 + var6 > this.field1143[var16] - this.field1146[var16] && this.field1144[var16] - this.field1145[var16] < var5) {
                        var5 = this.field1144[var16] - this.field1145[var16];
                        var8 = true;
                    }
                }
            }
            this.field1228 = this.field1143[var3];
            this.field1229 = this.field1144[var3] = var5;
            String var9 = this.field1150[var3];
            if (this.field1189 == 0) {
                int var10 = 16776960;
                if (this.field1147[var3] < 6) {
                    var10 = this.field1379[this.field1147[var3]];
                }
                if (this.field1147[var3] == 6) {
                    var10 = this.field1368 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field1147[var3] == 7) {
                    var10 = this.field1368 % 20 < 10 ? 255 : 65535;
                }
                if (this.field1147[var3] == 8) {
                    var10 = this.field1368 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field1147[var3] == 9) {
                    int var11 = 150 - this.field1149[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field1147[var3] == 10) {
                    int var12 = 150 - this.field1149[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field1147[var3] == 11) {
                    int var13 = 150 - this.field1149[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field1148[var3] == 0) {
                    this.field1451.method188(12097, this.field1228, this.field1229 + 1, var9, 0);
                    this.field1451.method188(12097, this.field1228, this.field1229, var9, var10);
                }
                if (this.field1148[var3] == 1) {
                    this.field1451.method192(431, this.field1228, this.field1229 + 1, var9, this.field1368, 0);
                    this.field1451.method192(431, this.field1228, this.field1229, var9, this.field1368, var10);
                }
                if (this.field1148[var3] == 2) {
                    int var14 = this.field1451.method190(var9, true);
                    int var15 = (150 - this.field1149[var3]) * (var14 + 100) / 150;
                    Pix2D.method147(334, this.field1516, this.field1228 - 50, 0, this.field1228 + 50);
                    this.field1451.method191(this.field1228 + 50 - var15, 0, (byte) 6, var9, this.field1229 + 1);
                    this.field1451.method191(this.field1228 + 50 - var15, var10, (byte) 6, var9, this.field1229);
                    Pix2D.method146(0);
                }
            } else {
                this.field1451.method188(12097, this.field1228, this.field1229 + 1, var9, 0);
                this.field1451.method188(12097, this.field1228, this.field1229, var9, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method412(boolean arg0) {
        this.field1172.method235((byte) 120);
        Pix3D.field561 = this.field1402;
        this.field1498.method186(-790, 0, 0);
        if (this.field1416 != -1) {
            this.method409(Component.field955[this.field1416], false, 0, 0, 0);
        } else if (this.field1367[this.field1490] != -1) {
            this.method409(Component.field955[this.field1367[this.field1490]], false, 0, 0, 0);
        }
        if (this.field1246 && this.field1099 == 1) {
            this.method444(8);
        }
        this.field1172.method236(231, super.field18, -3666, 562);
        this.field1174.method235((byte) 120);
        if (arg0) {
            this.field1355.method199(2);
        }
        Pix3D.field561 = this.field1403;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lbc;IZII)V")
    public final void method413(NpcType arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            this.field1409 = -1;
        }
        if (this.field1343 < 400) {
            String var6 = arg0.field848;
            if (arg0.field866 != 0) {
                var6 = var6 + method399(arg0.field866, -492, this.field1185.field367) + " (level-" + arg0.field866 + ")";
            }
            if (this.field1289 == 1) {
                this.field1212[this.field1343] = "Use " + this.field1293 + " with @yel@" + var6;
                this.field1222[this.field1343] = 493;
                this.field1223[this.field1343] = arg4;
                this.field1220[this.field1343] = arg3;
                this.field1221[this.field1343] = arg1;
                ++this.field1343;
            } else {
                if (this.field1468 == 1) {
                    if ((this.field1470 & 2) == 2) {
                        this.field1212[this.field1343] = this.field1471 + " @yel@" + var6;
                        this.field1222[this.field1343] = 500;
                        this.field1223[this.field1343] = arg4;
                        this.field1220[this.field1343] = arg3;
                        this.field1221[this.field1343] = arg1;
                        ++this.field1343;
                        return;
                    }
                } else {
                    if (arg0.field861 != null) {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (arg0.field861[var7] != null && !arg0.field861[var7].equalsIgnoreCase("attack")) {
                                this.field1212[this.field1343] = arg0.field861[var7] + " @yel@" + var6;
                                if (var7 == 0) {
                                    this.field1222[this.field1343] = 988;
                                }
                                if (var7 == 1) {
                                    this.field1222[this.field1343] = 345;
                                }
                                if (var7 == 2) {
                                    this.field1222[this.field1343] = 249;
                                }
                                if (var7 == 3) {
                                    this.field1222[this.field1343] = 960;
                                }
                                if (var7 == 4) {
                                    this.field1222[this.field1343] = 40;
                                }
                                this.field1223[this.field1343] = arg4;
                                this.field1220[this.field1343] = arg3;
                                this.field1221[this.field1343] = arg1;
                                ++this.field1343;
                            }
                        }
                    }
                    if (arg0.field861 != null) {
                        for (int var8 = 4; var8 >= 0; --var8) {
                            if (arg0.field861[var8] != null && arg0.field861[var8].equalsIgnoreCase("attack")) {
                                short var9 = 0;
                                if (arg0.field866 > this.field1185.field367) {
                                    var9 = 2000;
                                }
                                this.field1212[this.field1343] = arg0.field861[var8] + " @yel@" + var6;
                                if (var8 == 0) {
                                    this.field1222[this.field1343] = var9 + 988;
                                }
                                if (var8 == 1) {
                                    this.field1222[this.field1343] = var9 + 345;
                                }
                                if (var8 == 2) {
                                    this.field1222[this.field1343] = var9 + 249;
                                }
                                if (var8 == 3) {
                                    this.field1222[this.field1343] = var9 + 960;
                                }
                                if (var8 == 4) {
                                    this.field1222[this.field1343] = var9 + 40;
                                }
                                this.field1223[this.field1343] = arg4;
                                this.field1220[this.field1343] = arg3;
                                this.field1221[this.field1343] = arg1;
                                ++this.field1343;
                            }
                        }
                    }
                    this.field1212[this.field1343] = "Examine @yel@" + var6;
                    this.field1222[this.field1343] = 1814;
                    this.field1223[this.field1343] = arg4;
                    this.field1220[this.field1343] = arg3;
                    this.field1221[this.field1343] = arg1;
                    ++this.field1343;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)Ljava/lang/String;")
    public final String method414(boolean arg0, int arg1) {
        if (arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lhc;I)V")
    public final void method415(Component arg0, int arg1) {
        if (arg1 < 4 || arg1 > 4) {
            this.field1355.method199(180);
        }
        int var3 = arg0.field964;
        if (var3 >= 1 && var3 <= 100) {
            --var3;
            if (var3 >= this.field1096) {
                arg0.field994 = "";
                arg0.field963 = 0;
            } else {
                arg0.field994 = this.field1299[var3];
                arg0.field963 = 1;
            }
        } else if (var3 >= 101 && var3 <= 200) {
            var3 -= 101;
            if (var3 >= this.field1096) {
                arg0.field994 = "";
                arg0.field963 = 0;
            } else {
                if (this.field1332[var3] == 0) {
                    arg0.field994 = "@red@Offline";
                } else if (this.field1332[var3] == field1112) {
                    arg0.field994 = "@gre@World-" + (this.field1332[var3] - 9);
                } else {
                    arg0.field994 = "@yel@World-" + (this.field1332[var3] - 9);
                }
                arg0.field963 = 1;
            }
        } else if (var3 == 203) {
            arg0.field973 = this.field1096 * 15 + 20;
            if (arg0.field973 <= arg0.field966) {
                arg0.field973 = arg0.field966 + 1;
            }
        } else if (var3 >= 401 && var3 <= 500) {
            var3 -= 401;
            if (var3 >= this.field1514) {
                arg0.field994 = "";
                arg0.field963 = 0;
            } else {
                arg0.field994 = JString.method255(-148, JString.method252(this.field1094[var3], -38644));
                arg0.field963 = 1;
            }
        } else if (var3 == 503) {
            arg0.field973 = this.field1514 * 15 + 20;
            if (arg0.field973 <= arg0.field966) {
                arg0.field973 = arg0.field966 + 1;
            }
        } else if (var3 == 327) {
            arg0.field1006 = 150;
            arg0.field1007 = (int) (Math.sin((double) field1311 / 40.0D) * 256.0D) & 2047;
            if (this.field1126) {
                this.field1126 = false;
                Model[] var4 = new Model[7];
                int var5 = 0;
                for (int var6 = 0; var6 < 7; ++var6) {
                    int var9 = this.field1496[var6];
                    if (var9 >= 0) {
                        var4[var5++] = IdkType.field945[var9].method312();
                    }
                }
                Model var7 = new Model(6, var5, var4);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field1137[var8] != 0) {
                        var7.method133(field1510[var8][0], field1510[var8][this.field1137[var8]]);
                        if (var8 == 1) {
                            var7.method133(field1236[0], field1236[this.field1137[var8]]);
                        }
                    }
                }
                var7.method126(-36895);
                var7.method127(1, SeqType.field1023[this.field1185.field310].field1025[0]);
                var7.method136(64, 850, -30, -50, -30, true);
                arg0.field1001 = var7;
            }
        } else if (var3 == 324) {
            if (this.field1505 == null) {
                this.field1505 = arg0.field999;
                this.field1506 = arg0.field1000;
            }
            if (this.field1231) {
                arg0.field999 = this.field1506;
            } else {
                arg0.field999 = this.field1505;
            }
        } else if (var3 == 325) {
            if (this.field1505 == null) {
                this.field1505 = arg0.field999;
                this.field1506 = arg0.field1000;
            }
            if (this.field1231) {
                arg0.field999 = this.field1505;
            } else {
                arg0.field999 = this.field1506;
            }
        } else if (var3 == 600) {
            arg0.field994 = this.field1287;
            if (field1311 % 20 < 10) {
                arg0.field994 = arg0.field994 + "|";
            } else {
                arg0.field994 = arg0.field994 + " ";
            }
        } else {
            if (var3 == 613) {
                if (this.field1313) {
                    if (this.field1444) {
                        arg0.field996 = 16711680;
                        arg0.field994 = "Moderator option: Mute player for 48 hours: <ON>";
                    } else {
                        arg0.field996 = 16777215;
                        arg0.field994 = "Moderator option: Mute player for 48 hours: <OFF>";
                    }
                } else {
                    arg0.field994 = "";
                }
            }
            if (var3 == 650 || var3 == 655) {
                if (this.field1259 != 0) {
                    String var10;
                    if (this.field1160 == 0) {
                        var10 = "earlier today";
                    } else if (this.field1160 == 1) {
                        var10 = "yesterday";
                    } else {
                        var10 = this.field1160 + " days ago";
                    }
                    arg0.field994 = "You last logged in " + var10 + " from: " + signlink.dns;
                } else {
                    arg0.field994 = "";
                }
            }
            if (var3 == 651) {
                if (this.field1414 == 0) {
                    arg0.field994 = "0 unread messages";
                    arg0.field996 = 16776960;
                }
                if (this.field1414 == 1) {
                    arg0.field994 = "1 unread message";
                    arg0.field996 = 65280;
                }
                if (this.field1414 > 1) {
                    arg0.field994 = this.field1414 + " unread messages";
                    arg0.field996 = 65280;
                }
            }
            if (var3 == 652) {
                if (this.field1446 == 201) {
                    arg0.field994 = "";
                } else if (this.field1446 == 200) {
                    arg0.field994 = "You have not yet set any password recovery questions.";
                } else {
                    String var11;
                    if (this.field1446 == 0) {
                        var11 = "Earlier today";
                    } else if (this.field1446 == 1) {
                        var11 = "Yesterday";
                    } else {
                        var11 = this.field1446 + " days ago";
                    }
                    arg0.field994 = var11 + " you changed your recovery questions";
                }
            }
            if (var3 == 653) {
                if (this.field1446 == 201) {
                    arg0.field994 = "";
                } else if (this.field1446 == 200) {
                    arg0.field994 = "We strongly recommend you do so now to secure your account.";
                } else {
                    arg0.field994 = "If you do not remember making this change then cancel it immediately";
                }
            }
            if (var3 == 654) {
                if (this.field1446 == 201) {
                    arg0.field994 = "";
                } else if (this.field1446 == 200) {
                    arg0.field994 = "Do this from the 'account management' area on our front webpage";
                } else {
                    arg0.field994 = "Do this from the 'account management' area on our front webpage";
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;II)V")
    private final void method416(Packet arg0, int arg1, int arg2) {
        this.field1340 = 0;
        this.field1204 = 0;
        if (arg1 != 45899) {
            this.field1168 = !this.field1168;
        }
        this.method393(this.field1171, arg0, arg2);
        this.method388(arg2, (byte) 9, arg0);
        this.method453(arg0, arg2, this.field1119);
        this.method402(arg2, arg0, (byte) 76);
        for (int var4 = 0; var4 < this.field1340; ++var4) {
            int var6 = this.field1341[var4];
            if (field1311 != this.field1201[var6].field349) {
                this.field1201[var6] = null;
            }
        }
        if (arg0.field621 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field621 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1202; ++var5) {
                if (this.field1201[this.field1203[var5]] == null) {
                    signlink.reporterror(this.field1474 + " null entry in pl list - pos:" + var5 + " size:" + this.field1202);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method417(int arg0, int arg1) {
        this.field1408 += arg1;
        if (!field1115) {
            if (Pix3D.field569[17] >= arg0) {
                Pix8 var3 = Pix3D.field563[17];
                int var4 = var3.field593 * var3.field592 - 1;
                int var5 = this.field1135 * var3.field592 * 2;
                byte[] var6 = var3.field590;
                byte[] var7 = this.field1153;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field590 = var7;
                this.field1153 = var6;
                Pix3D.method160(-668, 17);
            }
            if (Pix3D.field569[24] >= arg0) {
                Pix8 var9 = Pix3D.field563[24];
                int var10 = var9.field593 * var9.field592 - 1;
                int var11 = this.field1135 * var9.field592 * 2;
                byte[] var12 = var9.field590;
                byte[] var13 = this.field1153;
                for (int var14 = 0; var14 <= var10; ++var14) {
                    var13[var14] = var12[var14 - var11 & var10];
                }
                var9.field590 = var13;
                this.field1153 = var12;
                Pix3D.method160(-668, 24);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method418(int arg0) {
        if (this.field1289 == 0 && this.field1468 == 0) {
            this.field1212[this.field1343] = "Walk here";
            this.field1222[this.field1343] = 981;
            this.field1220[this.field1343] = super.field25;
            this.field1221[this.field1343] = super.field26;
            ++this.field1343;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < Model.field522; ++var3) {
            int var4 = Model.field523[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1504.method81(this.field1170, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method275(var8);
                    if (this.field1289 == 1) {
                        this.field1212[this.field1343] = "Use " + this.field1293 + " with @cya@" + var9.field809;
                        this.field1222[this.field1343] = 505;
                        this.field1223[this.field1343] = var4;
                        this.field1220[this.field1343] = var5;
                        this.field1221[this.field1343] = var6;
                        ++this.field1343;
                    } else if (this.field1468 == 1) {
                        if ((this.field1470 & 4) == 4) {
                            this.field1212[this.field1343] = this.field1471 + " @cya@" + var9.field809;
                            this.field1222[this.field1343] = 737;
                            this.field1223[this.field1343] = var4;
                            this.field1220[this.field1343] = var5;
                            this.field1221[this.field1343] = var6;
                            ++this.field1343;
                        }
                    } else {
                        if (var9.field825 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field825[var10] != null) {
                                    this.field1212[this.field1343] = var9.field825[var10] + " @cya@" + var9.field809;
                                    if (var10 == 0) {
                                        this.field1222[this.field1343] = 798;
                                    }
                                    if (var10 == 1) {
                                        this.field1222[this.field1343] = 829;
                                    }
                                    if (var10 == 2) {
                                        this.field1222[this.field1343] = 873;
                                    }
                                    if (var10 == 3) {
                                        this.field1222[this.field1343] = 104;
                                    }
                                    if (var10 == 4) {
                                        this.field1222[this.field1343] = 1659;
                                    }
                                    this.field1223[this.field1343] = var4;
                                    this.field1220[this.field1343] = var5;
                                    this.field1221[this.field1343] = var6;
                                    ++this.field1343;
                                }
                            }
                        }
                        this.field1212[this.field1343] = "Examine @cya@" + var9.field809;
                        this.field1222[this.field1343] = 1418;
                        this.field1223[this.field1343] = var4;
                        this.field1220[this.field1343] = var5;
                        this.field1221[this.field1343] = var6;
                        ++this.field1343;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1296[var8];
                    if (var11.field358.field850 == 1 && (var11.field305 & 127) == 64 && (var11.field306 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1297; ++var12) {
                            NpcEntity var13 = this.field1296[this.field1298[var12]];
                            if (var13 != null && var11 != var13 && var13.field358.field850 == 1 && var11.field305 == var13.field305 && var11.field306 == var13.field306) {
                                this.method413(var13.field358, var6, true, var5, this.field1298[var12]);
                            }
                        }
                    }
                    this.method413(var11.field358, var6, true, var5, var8);
                }
                if (var7 == 0) {
                    PlayerEntity var14 = this.field1201[var8];
                    if ((var14.field305 & 127) == 64 && (var14.field306 & 127) == 64) {
                        for (int var15 = 0; var15 < this.field1297; ++var15) {
                            NpcEntity var18 = this.field1296[this.field1298[var15]];
                            if (var18 != null && var18.field358.field850 == 1 && var14.field305 == var18.field305 && var14.field306 == var18.field306) {
                                this.method413(var18.field358, var6, true, var5, this.field1298[var15]);
                            }
                        }
                        for (int var16 = 0; var16 < this.field1202; ++var16) {
                            PlayerEntity var17 = this.field1201[this.field1203[var16]];
                            if (var17 != null && var14 != var17 && var14.field305 == var17.field305 && var14.field306 == var17.field306) {
                                this.method404(var17, 4, var5, var6, this.field1203[var16]);
                            }
                        }
                    }
                    this.method404(var14, 4, var5, var6, var8);
                }
                if (var7 == 3) {
                    LinkList var19 = this.field1278[this.field1170][var5][var6];
                    if (var19 != null) {
                        for (ObjStackEntity var20 = (ObjStackEntity) var19.method229(this.field1179); var20 != null; var20 = (ObjStackEntity) var19.method231(false)) {
                            ObjType var21 = ObjType.method287(var20.field302);
                            if (this.field1289 == 1) {
                                this.field1212[this.field1343] = "Use " + this.field1293 + " with @lre@" + var21.field881;
                                this.field1222[this.field1343] = 203;
                                this.field1223[this.field1343] = var20.field302;
                                this.field1220[this.field1343] = var5;
                                this.field1221[this.field1343] = var6;
                                ++this.field1343;
                            } else if (this.field1468 == 1) {
                                if ((this.field1470 & 1) == 1) {
                                    this.field1212[this.field1343] = this.field1471 + " @lre@" + var21.field881;
                                    this.field1222[this.field1343] = 543;
                                    this.field1223[this.field1343] = var20.field302;
                                    this.field1220[this.field1343] = var5;
                                    this.field1221[this.field1343] = var6;
                                    ++this.field1343;
                                }
                            } else {
                                for (int var22 = 4; var22 >= 0; --var22) {
                                    if (var21.field896 != null && var21.field896[var22] != null) {
                                        this.field1212[this.field1343] = var21.field896[var22] + " @lre@" + var21.field881;
                                        if (var22 == 0) {
                                            this.field1222[this.field1343] = 56;
                                        }
                                        if (var22 == 1) {
                                            this.field1222[this.field1343] = 321;
                                        }
                                        if (var22 == 2) {
                                            this.field1222[this.field1343] = 552;
                                        }
                                        if (var22 == 3) {
                                            this.field1222[this.field1343] = 43;
                                        }
                                        if (var22 == 4) {
                                            this.field1222[this.field1343] = 687;
                                        }
                                        this.field1223[this.field1343] = var20.field302;
                                        this.field1220[this.field1343] = var5;
                                        this.field1221[this.field1343] = var6;
                                        ++this.field1343;
                                    } else if (var22 == 2) {
                                        this.field1212[this.field1343] = "Take @lre@" + var21.field881;
                                        this.field1222[this.field1343] = 552;
                                        this.field1223[this.field1343] = var20.field302;
                                        this.field1220[this.field1343] = var5;
                                        this.field1221[this.field1343] = var6;
                                        ++this.field1343;
                                    }
                                }
                                this.field1212[this.field1343] = "Examine @lre@" + var21.field881;
                                this.field1222[this.field1343] = 1308;
                                this.field1223[this.field1343] = var20.field302;
                                this.field1220[this.field1343] = var5;
                                this.field1221[this.field1343] = var6;
                                ++this.field1343;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 <= 0) {
            this.field1169 = this.field1479.method246();
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method419(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        for (int var3 = 0; var3 < this.field1297; ++var3) {
            int var4 = this.field1298[var3];
            NpcEntity var5 = this.field1296[var4];
            if (var5 != null) {
                this.method420(-76, var5.field358.field850, var5);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILx;)V")
    public final void method420(int arg0, int arg1, PathingEntity arg2) {
        if (arg2.field305 < 128 || arg2.field306 < 128 || arg2.field305 >= 13184 || arg2.field306 >= 13184) {
            arg2.field332 = -1;
            arg2.field337 = -1;
            arg2.field346 = 0;
            arg2.field347 = 0;
            arg2.field305 = arg2.field353[0] * 128 + arg2.field309 * 64;
            arg2.field306 = arg2.field354[0] * 128 + arg2.field309 * 64;
            arg2.field352 = 0;
        }
        if (this.field1185 == arg2 && (arg2.field305 < 1536 || arg2.field306 < 1536 || arg2.field305 >= 11776 || arg2.field306 >= 11776)) {
            arg2.field332 = -1;
            arg2.field337 = -1;
            arg2.field346 = 0;
            arg2.field347 = 0;
            arg2.field305 = arg2.field353[0] * 128 + arg2.field309 * 64;
            arg2.field306 = arg2.field354[0] * 128 + arg2.field309 * 64;
            arg2.field352 = 0;
        }
        if (arg2.field346 > field1311) {
            this.method421(arg2, 725);
        } else if (arg2.field347 >= field1311) {
            this.method422(true, arg2);
        } else {
            this.method423(9, arg2);
        }
        this.method424(arg2, false);
        if (arg0 >= 0) {
            this.field1409 = -1;
        }
        this.method425(262, arg2);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lx;I)V")
    public final void method421(PathingEntity arg0, int arg1) {
        int var3 = arg0.field346 - field1311;
        int var4 = arg0.field342 * 128 + arg0.field309 * 64;
        int var5 = arg0.field344 * 128 + arg0.field309 * 64;
        arg0.field305 += (var4 - arg0.field305) / var3;
        arg0.field306 += (var5 - arg0.field306) / var3;
        arg0.field356 = 0;
        int var6 = 39 / arg1;
        if (arg0.field348 == 0) {
            arg0.field351 = 1024;
        }
        if (arg0.field348 == 1) {
            arg0.field351 = 1536;
        }
        if (arg0.field348 == 2) {
            arg0.field351 = 0;
        }
        if (arg0.field348 == 3) {
            arg0.field351 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLx;)V")
    public final void method422(boolean arg0, PathingEntity arg1) {
        if (field1311 == arg1.field347 || arg1.field332 == -1 || arg1.field335 != 0 || arg1.field334 + 1 > SeqType.field1023[arg1.field332].field1027[arg1.field333]) {
            int var3 = arg1.field347 - arg1.field346;
            int var4 = field1311 - arg1.field346;
            int var5 = arg1.field342 * 128 + arg1.field309 * 64;
            int var6 = arg1.field344 * 128 + arg1.field309 * 64;
            int var7 = arg1.field343 * 128 + arg1.field309 * 64;
            int var8 = arg1.field345 * 128 + arg1.field309 * 64;
            arg1.field305 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field306 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field356 = 0;
        if (arg1.field348 == 0) {
            arg1.field351 = 1024;
        }
        if (arg1.field348 == 1) {
            arg1.field351 = 1536;
        }
        if (arg1.field348 == 2) {
            arg1.field351 = 0;
        }
        if (arg1.field348 == 3) {
            arg1.field351 = 512;
        }
        arg1.field307 = arg1.field351;
        this.field1105 &= arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILx;)V")
    public final void method423(int arg0, PathingEntity arg1) {
        arg1.field329 = arg1.field310;
        if (arg0 != 9) {
            this.field1409 = -1;
        }
        if (arg1.field352 == 0) {
            arg1.field356 = 0;
        } else {
            if (arg1.field332 != -1 && arg1.field335 == 0) {
                SeqType var3 = SeqType.field1023[arg1.field332];
                if (var3.field1029 == null) {
                    ++arg1.field356;
                    return;
                }
            }
            int var4 = arg1.field305;
            int var5 = arg1.field306;
            int var6 = arg1.field353[arg1.field352 - 1] * 128 + arg1.field309 * 64;
            int var7 = arg1.field354[arg1.field352 - 1] * 128 + arg1.field309 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field351 = 1280;
                    } else if (var5 > var7) {
                        arg1.field351 = 1792;
                    } else {
                        arg1.field351 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field351 = 768;
                    } else if (var5 > var7) {
                        arg1.field351 = 256;
                    } else {
                        arg1.field351 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field351 = 1024;
                } else {
                    arg1.field351 = 0;
                }
                int var8 = arg1.field351 - arg1.field307 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field313;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field312;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field315;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field314;
                }
                if (var9 == -1) {
                    var9 = arg1.field312;
                }
                arg1.field329 = var9;
                int var10 = 4;
                if (arg1.field351 != arg1.field307 && arg1.field326 == -1) {
                    var10 = 2;
                }
                if (arg1.field352 > 2) {
                    var10 = 6;
                }
                if (arg1.field352 > 3) {
                    var10 = 8;
                }
                if (arg1.field356 > 0 && arg1.field352 > 1) {
                    var10 = 8;
                    --arg1.field356;
                }
                if (arg1.field355[arg1.field352 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field329 == arg1.field312 && arg1.field316 != -1) {
                    arg1.field329 = arg1.field316;
                }
                if (var4 < var6) {
                    arg1.field305 += var10;
                    if (arg1.field305 > var6) {
                        arg1.field305 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field305 -= var10;
                    if (arg1.field305 < var6) {
                        arg1.field305 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field306 += var10;
                    if (arg1.field306 > var7) {
                        arg1.field306 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field306 -= var10;
                    if (arg1.field306 < var7) {
                        arg1.field306 = var7;
                    }
                }
                if (arg1.field305 == var6 && arg1.field306 == var7) {
                    --arg1.field352;
                }
            } else {
                arg1.field305 = var6;
                arg1.field306 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lx;Z)V")
    public final void method424(PathingEntity arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg0.field326 != -1 && arg0.field326 < 32768) {
            NpcEntity var4 = this.field1296[arg0.field326];
            if (var4 != null) {
                int var5 = arg0.field305 - var4.field305;
                int var6 = arg0.field306 - var4.field306;
                if (var5 != 0 || var6 != 0) {
                    arg0.field351 = (int) (Math.atan2((double) var5, (double) var6) * 325.949D) & 2047;
                }
            }
        }
        if (arg0.field326 >= 32768) {
            int var7 = arg0.field326 - 32768;
            if (this.field1350 == var7) {
                var7 = this.field1200;
            }
            PlayerEntity var8 = this.field1201[var7];
            if (var8 != null) {
                int var9 = arg0.field305 - var8.field305;
                int var10 = arg0.field306 - var8.field306;
                if (var9 != 0 || var10 != 0) {
                    arg0.field351 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 2047;
                }
            }
        }
        if ((arg0.field327 != 0 || arg0.field328 != 0) && (arg0.field352 == 0 || arg0.field356 > 0)) {
            int var11 = arg0.field305 - (arg0.field327 - this.field1430 - this.field1430) * 64;
            int var12 = arg0.field306 - (arg0.field328 - this.field1431 - this.field1431) * 64;
            if (var11 != 0 || var12 != 0) {
                arg0.field351 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 2047;
            }
            arg0.field327 = 0;
            arg0.field328 = 0;
        }
        int var13 = arg0.field351 - arg0.field307 & 2047;
        if (var13 != 0) {
            if (var13 >= 32 && var13 <= 2016) {
                if (var13 > 1024) {
                    arg0.field307 -= 32;
                } else {
                    arg0.field307 += 32;
                }
            } else {
                arg0.field307 = arg0.field351;
            }
            arg0.field307 &= 2047;
            if (arg0.field329 == arg0.field310 && arg0.field351 != arg0.field307) {
                if (arg0.field311 != -1) {
                    arg0.field329 = arg0.field311;
                    return;
                }
                arg0.field329 = arg0.field312;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILx;)V")
    public final void method425(int arg0, PathingEntity arg1) {
        int var3 = 22 / arg0;
        arg1.field308 = false;
        if (arg1.field329 != -1) {
            SeqType var4 = SeqType.field1023[arg1.field329];
            ++arg1.field331;
            if (arg1.field330 < var4.field1024 && arg1.field331 > var4.field1027[arg1.field330]) {
                arg1.field331 = 0;
                ++arg1.field330;
            }
            if (arg1.field330 >= var4.field1024) {
                arg1.field331 = 0;
                arg1.field330 = 0;
            }
        }
        if (arg1.field332 != -1 && arg1.field335 == 0) {
            SeqType var5 = SeqType.field1023[arg1.field332];
            ++arg1.field334;
            while (arg1.field333 < var5.field1024 && arg1.field334 > var5.field1027[arg1.field333]) {
                arg1.field334 -= var5.field1027[arg1.field333];
                ++arg1.field333;
            }
            if (arg1.field333 >= var5.field1024) {
                arg1.field333 -= var5.field1028;
                ++arg1.field336;
                if (arg1.field336 >= var5.field1034) {
                    arg1.field332 = -1;
                }
                if (arg1.field333 < 0 || arg1.field333 >= var5.field1024) {
                    arg1.field332 = -1;
                }
            }
            arg1.field308 = var5.field1030;
        }
        if (arg1.field335 > 0) {
            --arg1.field335;
        }
        if (arg1.field337 != -1 && field1311 >= arg1.field340) {
            if (arg1.field338 < 0) {
                arg1.field338 = 0;
            }
            SeqType var6 = SpotAnimType.field1039[arg1.field337].field1042;
            ++arg1.field339;
            while (arg1.field338 < var6.field1024 && arg1.field339 > var6.field1027[arg1.field338]) {
                arg1.field339 -= var6.field1027[arg1.field338];
                ++arg1.field338;
            }
            if (arg1.field338 >= var6.field1024) {
                if (arg1.field338 < 0 || arg1.field338 >= var6.field1024) {
                    arg1.field337 = -1;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method426(int arg0) {
        this.field1408 += arg0;
        if (this.field1405) {
            this.field1405 = false;
            this.field1357.method236(11, super.field18, -3666, 0);
            this.field1358.method236(375, super.field18, -3666, 0);
            this.field1359.method236(5, super.field18, -3666, 729);
            this.field1360.method236(231, super.field18, -3666, 752);
            this.field1361.method236(0, super.field18, -3666, 0);
            this.field1362.method236(0, super.field18, -3666, 561);
            this.field1363.method236(11, super.field18, -3666, 520);
            this.field1364.method236(231, super.field18, -3666, 520);
            this.field1365.method236(375, super.field18, -3666, 501);
            this.field1366.method236(345, super.field18, -3666, 0);
            this.field1472 = true;
            this.field1342 = true;
            this.field1214 = true;
            this.field1238 = true;
            if (this.field1488 != 2) {
                this.field1174.method236(11, super.field18, -3666, 8);
                this.field1173.method236(5, super.field18, -3666, 561);
            }
        }
        if (this.field1488 == 2) {
            this.method482(false);
        }
        if (this.field1246 && this.field1099 == 1) {
            this.field1472 = true;
        }
        if (this.field1416 != -1) {
            boolean var2 = this.method486(this.field1416, -25, this.field1135);
            if (var2) {
                this.field1472 = true;
            }
        }
        if (this.field1427 == 2) {
            this.field1472 = true;
        }
        if (this.field1274 == 2) {
            this.field1472 = true;
        }
        if (this.field1472) {
            this.method412(false);
            this.field1472 = false;
        }
        if (this.field1415 == -1) {
            this.field1192.field974 = this.field1476 - this.field1330 - 77;
            if (super.field25 > 453 && super.field25 < 565 && super.field26 > 350) {
                this.method378((byte) -42, this.field1192, super.field25 - 22, 0, 77, this.field1476, 463, super.field26 - 375, false);
            }
            int var3 = this.field1476 - 77 - this.field1192.field974;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1476 - 77) {
                var3 = this.field1476 - 77;
            }
            if (this.field1330 != var3) {
                this.field1330 = var3;
                this.field1342 = true;
            }
            ++field1334;
            if (field1334 > 87) {
                field1334 = 0;
                this.field1355.method198(0, 225);
            }
        }
        if (this.field1415 != -1) {
            boolean var4 = this.method486(this.field1415, -25, this.field1135);
            if (var4) {
                this.field1342 = true;
            }
        }
        if (this.field1427 == 3) {
            this.field1342 = true;
        }
        if (this.field1274 == 3) {
            this.field1342 = true;
        }
        if (this.field1307 != null) {
            this.field1342 = true;
        }
        if (this.field1246 && this.field1099 == 2) {
            this.field1342 = true;
        }
        if (this.field1342) {
            this.method433(false);
            this.field1342 = false;
        }
        if (this.field1488 == 2) {
            this.method457((byte) 5);
            this.field1173.method236(5, super.field18, -3666, 561);
        }
        if (this.field1439 != -1) {
            this.field1214 = true;
        }
        if (this.field1214) {
            if (this.field1439 != -1 && this.field1490 == this.field1439) {
                this.field1439 = -1;
                this.field1355.method198(0, 50);
                this.field1355.method199(this.field1490);
            }
            this.field1214 = false;
            this.field1264.method235((byte) 120);
            this.field1465.method186(-790, 0, 0);
            if (this.field1416 == -1) {
                if (this.field1367[this.field1490] != -1) {
                    if (this.field1490 == 0) {
                        this.field1417.method186(-790, 29, 30);
                    }
                    if (this.field1490 == 1) {
                        this.field1418.method186(-790, 59, 29);
                    }
                    if (this.field1490 == 2) {
                        this.field1418.method186(-790, 87, 29);
                    }
                    if (this.field1490 == 3) {
                        this.field1419.method186(-790, 115, 29);
                    }
                    if (this.field1490 == 4) {
                        this.field1421.method186(-790, 156, 29);
                    }
                    if (this.field1490 == 5) {
                        this.field1421.method186(-790, 184, 29);
                    }
                    if (this.field1490 == 6) {
                        this.field1420.method186(-790, 212, 30);
                    }
                }
                if (this.field1367[0] != -1 && (this.field1439 != 0 || field1311 % 20 < 10)) {
                    this.field1162[0].method186(-790, 35, 34);
                }
                if (this.field1367[1] != -1 && (this.field1439 != 1 || field1311 % 20 < 10)) {
                    this.field1162[1].method186(-790, 59, 32);
                }
                if (this.field1367[2] != -1 && (this.field1439 != 2 || field1311 % 20 < 10)) {
                    this.field1162[2].method186(-790, 86, 32);
                }
                if (this.field1367[3] != -1 && (this.field1439 != 3 || field1311 % 20 < 10)) {
                    this.field1162[3].method186(-790, 121, 33);
                }
                if (this.field1367[4] != -1 && (this.field1439 != 4 || field1311 % 20 < 10)) {
                    this.field1162[4].method186(-790, 157, 34);
                }
                if (this.field1367[5] != -1 && (this.field1439 != 5 || field1311 % 20 < 10)) {
                    this.field1162[5].method186(-790, 185, 32);
                }
                if (this.field1367[6] != -1 && (this.field1439 != 6 || field1311 % 20 < 10)) {
                    this.field1162[6].method186(-790, 212, 34);
                }
            }
            this.field1264.method236(165, super.field18, -3666, 520);
            this.field1263.method235((byte) 120);
            this.field1464.method186(-790, 0, 0);
            if (this.field1416 == -1) {
                if (this.field1367[this.field1490] != -1) {
                    if (this.field1490 == 7) {
                        this.field1120.method186(-790, 49, 0);
                    }
                    if (this.field1490 == 8) {
                        this.field1121.method186(-790, 81, 0);
                    }
                    if (this.field1490 == 9) {
                        this.field1121.method186(-790, 108, 0);
                    }
                    if (this.field1490 == 10) {
                        this.field1122.method186(-790, 136, 1);
                    }
                    if (this.field1490 == 11) {
                        this.field1124.method186(-790, 178, 0);
                    }
                    if (this.field1490 == 12) {
                        this.field1124.method186(-790, 205, 0);
                    }
                    if (this.field1490 == 13) {
                        this.field1123.method186(-790, 233, 0);
                    }
                }
                if (this.field1367[8] != -1 && (this.field1439 != 8 || field1311 % 20 < 10)) {
                    this.field1162[7].method186(-790, 80, 2);
                }
                if (this.field1367[9] != -1 && (this.field1439 != 9 || field1311 % 20 < 10)) {
                    this.field1162[8].method186(-790, 107, 3);
                }
                if (this.field1367[10] != -1 && (this.field1439 != 10 || field1311 % 20 < 10)) {
                    this.field1162[9].method186(-790, 142, 4);
                }
                if (this.field1367[11] != -1 && (this.field1439 != 11 || field1311 % 20 < 10)) {
                    this.field1162[10].method186(-790, 179, 2);
                }
                if (this.field1367[12] != -1 && (this.field1439 != 12 || field1311 % 20 < 10)) {
                    this.field1162[11].method186(-790, 206, 2);
                }
                if (this.field1367[13] != -1 && (this.field1439 != 13 || field1311 % 20 < 10)) {
                    this.field1162[12].method186(-790, 230, 2);
                }
            }
            this.field1263.method236(492, super.field18, -3666, 501);
            this.field1174.method235((byte) 120);
        }
        if (this.field1238) {
            this.field1238 = false;
            this.field1262.method235((byte) 120);
            this.field1463.method186(-790, 0, 0);
            this.field1450.method189(33, "Public chat", true, 16777215, (byte) 62, 57);
            if (this.field1509 == 0) {
                this.field1450.method189(46, "On", true, 65280, (byte) 62, 57);
            }
            if (this.field1509 == 1) {
                this.field1450.method189(46, "Friends", true, 16776960, (byte) 62, 57);
            }
            if (this.field1509 == 2) {
                this.field1450.method189(46, "Off", true, 16711680, (byte) 62, 57);
            }
            if (this.field1509 == 3) {
                this.field1450.method189(46, "Hide", true, 65535, (byte) 62, 57);
            }
            this.field1450.method189(33, "Private chat", true, 16777215, (byte) 62, 186);
            if (this.field1283 == 0) {
                this.field1450.method189(46, "On", true, 65280, (byte) 62, 186);
            }
            if (this.field1283 == 1) {
                this.field1450.method189(46, "Friends", true, 16776960, (byte) 62, 186);
            }
            if (this.field1283 == 2) {
                this.field1450.method189(46, "Off", true, 16711680, (byte) 62, 186);
            }
            this.field1450.method189(33, "Trade/duel", true, 16777215, (byte) 62, 326);
            if (this.field1242 == 0) {
                this.field1450.method189(46, "On", true, 65280, (byte) 62, 326);
            }
            if (this.field1242 == 1) {
                this.field1450.method189(46, "Friends", true, 16776960, (byte) 62, 326);
            }
            if (this.field1242 == 2) {
                this.field1450.method189(46, "Off", true, 16711680, (byte) 62, 326);
            }
            this.field1450.method189(38, "Report abuse", true, 16777215, (byte) 62, 462);
            this.field1262.method236(471, super.field18, -3666, 0);
            this.field1174.method235((byte) 120);
        }
        this.field1135 = 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILx;I)V")
    public final void method427(int arg0, PathingEntity arg1, int arg2) {
        this.method428(arg1.field306, arg1.field305, arg0, 23177);
        if (arg2 < 5 || arg2 > 5) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)V")
    public final void method428(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 128 && arg0 >= 128 && arg1 <= 13056 && arg0 <= 13056) {
            int var5 = this.method447(arg0, arg1, true, this.field1170) - arg2;
            if (arg3 != 23177) {
                this.field1409 = -1;
            }
            int var6 = arg1 - this.field1381;
            int var7 = var5 - this.field1382;
            int var8 = arg0 - this.field1383;
            int var9 = Model.field524[this.field1384];
            int var10 = Model.field525[this.field1384];
            int var11 = Model.field524[this.field1385];
            int var12 = Model.field525[this.field1385];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field1228 = (var13 << 9) / var17 + Pix3D.field555;
                this.field1229 = (var16 << 9) / var17 + Pix3D.field556;
            } else {
                this.field1228 = -1;
                this.field1229 = -1;
            }
        } else {
            this.field1228 = -1;
            this.field1229 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method429(boolean arg0) {
        int var2 = this.field1387 * 128 + 64;
        int var3 = this.field1388 * 128 + 64;
        int var4 = this.method447(this.field1388, this.field1387, true, this.field1170) - this.field1389;
        if (this.field1381 < var2) {
            this.field1381 += (var2 - this.field1381) * this.field1391 / 1000 + this.field1390;
            if (this.field1381 > var2) {
                this.field1381 = var2;
            }
        }
        if (this.field1381 > var2) {
            this.field1381 -= (this.field1381 - var2) * this.field1391 / 1000 + this.field1390;
            if (this.field1381 < var2) {
                this.field1381 = var2;
            }
        }
        if (this.field1382 < var4) {
            this.field1382 += (var4 - this.field1382) * this.field1391 / 1000 + this.field1390;
            if (this.field1382 > var4) {
                this.field1382 = var4;
            }
        }
        if (this.field1382 > var4) {
            this.field1382 -= (this.field1382 - var4) * this.field1391 / 1000 + this.field1390;
            if (this.field1382 < var4) {
                this.field1382 = var4;
            }
        }
        if (this.field1383 < var3) {
            this.field1383 += (var3 - this.field1383) * this.field1391 / 1000 + this.field1390;
            if (this.field1383 > var3) {
                this.field1383 = var3;
            }
        }
        if (this.field1383 > var3) {
            this.field1383 -= (this.field1383 - var3) * this.field1391 / 1000 + this.field1390;
            if (this.field1383 < var3) {
                this.field1383 = var3;
            }
        }
        int var5 = this.field1393 * 128 + 64;
        int var6 = this.field1394 * 128 + 64;
        if (!arg0) {
            this.field1409 = this.field1335.method209();
        }
        int var7 = this.method447(this.field1394, this.field1393, true, this.field1170) - this.field1395;
        int var8 = var5 - this.field1381;
        int var9 = var7 - this.field1382;
        int var10 = var6 - this.field1383;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1384 < var12) {
            this.field1384 += (var12 - this.field1384) * this.field1397 / 1000 + this.field1396;
            if (this.field1384 > var12) {
                this.field1384 = var12;
            }
        }
        if (this.field1384 > var12) {
            this.field1384 -= (this.field1384 - var12) * this.field1397 / 1000 + this.field1396;
            if (this.field1384 < var12) {
                this.field1384 = var12;
            }
        }
        int var14 = var13 - this.field1385;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1385 += this.field1397 * var14 / 1000 + this.field1396;
            this.field1385 &= 2047;
        }
        if (var14 < 0) {
            this.field1385 -= -var14 * this.field1397 / 1000 + this.field1396;
            this.field1385 &= 2047;
        }
        int var15 = var13 - this.field1385;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1385 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)V")
    public final void method430(int arg0, int arg1, int arg2) {
        if (this.field1088 != 0) {
            int var4 = 0;
            if (this.field1513 != 0) {
                var4 = 1;
            }
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field1178[var5] != null) {
                    int var6 = this.field1176[var5];
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field1283 == 0 || this.field1283 == 1 && this.method464(this.field1177[var5], this.field1188))) {
                        int var7 = 329 - var4 * 13;
                        if (super.field25 > 8 && super.field25 < 520 && arg0 - 11 > var7 - 10 && arg0 - 11 <= var7 + 3) {
                            if (this.field1313) {
                                this.field1212[this.field1343] = "Report abuse @whi@" + this.field1177[var5];
                                this.field1222[this.field1343] = 2316;
                                ++this.field1343;
                            }
                            this.field1212[this.field1343] = "Add ignore @whi@" + this.field1177[var5];
                            this.field1222[this.field1343] = 2158;
                            ++this.field1343;
                            this.field1212[this.field1343] = "Add friend @whi@" + this.field1177[var5];
                            this.field1222[this.field1343] = 2447;
                            ++this.field1343;
                        }
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                    if ((var6 == 5 || var6 == 6) && this.field1283 < 2) {
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                }
            }
            if (arg2 != 0) {
                this.field1314 = 159;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1151.method186(-790, arg4, arg2);
        this.field1152.method186(-790, arg4, arg0 + arg2 - 16);
        Pix2D.method149(this.field1443, -288, arg4, arg2 + 16, 16, arg0 - 32);
        int var7 = (arg0 - 32) * arg0 / arg5;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg0 - 32 - var7) * arg3 / (arg5 - arg0);
        if (arg1 >= 0) {
            this.field1409 = this.field1335.method209();
        }
        Pix2D.method149(this.field1526, -288, arg4, arg2 + 16 + var8, 16, var7);
        Pix2D.method152(arg2 + 16 + var8, 537, this.field1271, var7, arg4);
        Pix2D.method152(arg2 + 16 + var8, 537, this.field1271, var7, arg4 + 1);
        Pix2D.method151(this.field1271, arg2 + 16 + var8, arg4, 16, true);
        Pix2D.method151(this.field1271, arg2 + 17 + var8, arg4, 16, true);
        Pix2D.method152(arg2 + 16 + var8, 537, this.field1230, var7, arg4 + 15);
        Pix2D.method152(arg2 + 17 + var8, 537, this.field1230, var7 - 1, arg4 + 14);
        Pix2D.method151(this.field1230, arg2 + 15 + var8 + var7, arg4, 16, true);
        Pix2D.method151(this.field1230, arg2 + 14 + var8 + var7, arg4 + 1, 15, true);
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method432(byte arg0) {
        if (this.field1190 != arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field1126 = true;
        for (int var3 = 0; var3 < 7; ++var3) {
            this.field1496[var3] = -1;
            for (int var4 = 0; var4 < IdkType.field944; ++var4) {
                if (!IdkType.field945[var4].field951 && IdkType.field945[var4].field946 == var3 + (this.field1231 ? 0 : 7)) {
                    this.field1496[var3] = var4;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method433(boolean arg0) {
        this.field1175.method235((byte) 120);
        Pix3D.field561 = this.field1401;
        this.field1500.method186(-790, 0, 0);
        if (this.field1356) {
            this.field1451.method188(12097, 239, 40, this.field1407, 0);
            this.field1451.method188(12097, 239, 60, this.field1370 + "*", 128);
        } else if (this.field1302) {
            this.field1451.method188(12097, 239, 40, "Enter amount to transfer:", 0);
            this.field1451.method188(12097, 239, 60, this.field1241 + "*", 128);
        } else if (this.field1307 != null) {
            this.field1451.method188(12097, 239, 40, this.field1307, 0);
            this.field1451.method188(12097, 239, 60, "Click to continue", 128);
        } else if (this.field1415 != -1) {
            this.method409(Component.field955[this.field1415], false, 0, 0, 0);
        } else if (this.field1234 != -1) {
            this.method409(Component.field955[this.field1234], false, 0, 0, 0);
        } else {
            PixFont var2 = this.field1450;
            int var3 = 0;
            Pix2D.method147(77, this.field1516, 0, 0, 463);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1178[var4] != null) {
                    int var5 = this.field1176[var4];
                    int var6 = 70 - var3 * 14 + this.field1330;
                    if (var5 == 0) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(4, 0, (byte) 6, this.field1178[var4], var6);
                        }
                        ++var3;
                    }
                    if (var5 == 1) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(4, 16777215, (byte) 6, this.field1177[var4] + ":", var6);
                            var2.method191(12 + var2.method190(this.field1177[var4], true), 255, (byte) 6, this.field1178[var4], var6);
                        }
                        ++var3;
                    }
                    if (var5 == 2 && (this.field1509 == 0 || this.field1509 == 1 && this.method464(this.field1177[var4], this.field1188))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(4, 0, (byte) 6, this.field1177[var4] + ":", var6);
                            var2.method191(12 + var2.method190(this.field1177[var4], true), 255, (byte) 6, this.field1178[var4], var6);
                        }
                        ++var3;
                    }
                    if ((var5 == 3 || var5 == 7) && this.field1088 == 0 && (var5 == 7 || this.field1283 == 0 || this.field1283 == 1 && this.method464(this.field1177[var4], this.field1188))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(4, 0, (byte) 6, "From " + this.field1177[var4] + ":", var6);
                            var2.method191(12 + var2.method190("From " + this.field1177[var4], true), 8388608, (byte) 6, this.field1178[var4], var6);
                        }
                        ++var3;
                    }
                    if (var5 == 4 && (this.field1242 == 0 || this.field1242 == 1 && this.method464(this.field1177[var4], this.field1188))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(4, 8388736, (byte) 6, this.field1177[var4] + " " + this.field1178[var4], var6);
                        }
                        ++var3;
                    }
                    if (var5 == 5 && this.field1088 == 0 && this.field1283 < 2) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(4, 8388608, (byte) 6, this.field1178[var4], var6);
                        }
                        ++var3;
                    }
                    if (var5 == 6 && this.field1088 == 0 && this.field1283 < 2) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(4, 0, (byte) 6, "To " + this.field1177[var4] + ":", var6);
                            var2.method191(12 + var2.method190("To " + this.field1177[var4], true), 8388608, (byte) 6, this.field1178[var4], var6);
                        }
                        ++var3;
                    }
                    if (var5 == 8 && (this.field1242 == 0 || this.field1242 == 1 && this.method464(this.field1177[var4], this.field1188))) {
                        if (var6 > 0 && var6 < 110) {
                            var2.method191(4, 13350793, (byte) 6, this.field1177[var4] + " " + this.field1178[var4], var6);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method146(0);
            this.field1476 = var3 * 14 + 7;
            if (this.field1476 < 78) {
                this.field1476 = 78;
            }
            this.method431(77, -19, 0, this.field1476 - this.field1330 - 77, 463, this.field1476);
            var2.method191(4, 0, (byte) 6, JString.method255(-148, this.field1474) + ":", 90);
            var2.method191(6 + var2.method190(this.field1474 + ": ", true), 255, (byte) 6, this.field1461 + "*", 90);
            Pix2D.method151(0, 77, 0, 479, true);
        }
        if (this.field1246 && this.field1099 == 2) {
            this.method444(8);
        }
        this.field1175.method236(375, super.field18, -3666, 22);
        this.field1174.method235((byte) 120);
        Pix3D.field561 = this.field1403;
        if (arg0) {
            this.field1462 = 455;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)V")
    public final void method434(boolean arg0, int arg1) {
        if (arg0) {
            Component var3 = Component.field955[arg1];
            for (int var4 = 0; var4 < var3.field976.length && var3.field976[var4] != -1; ++var4) {
                Component var5 = Component.field955[var3.field976[var4]];
                if (var5.field962 == 1) {
                    this.method434(true, var5.field960);
                }
                var5.field958 = 0;
                var5.field959 = 0;
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)Z")
    public final boolean method435(int arg0) {
        if (arg0 != 47042) {
            this.field1409 = -1;
        }
        if (this.field1374 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1374.method31();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1409 == -1) {
                    this.field1374.method32(this.field1335.field620, 0, 1);
                    this.field1409 = this.field1335.field620[0] & 255;
                    if (this.field1479 != null) {
                        this.field1409 = this.field1409 - this.field1479.method246() & 255;
                    }
                    this.field1408 = Protocol.field917[this.field1409];
                    --var2;
                }
                if (this.field1408 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1374.method32(this.field1335.field620, 0, 1);
                    this.field1408 = this.field1335.field620[0] & 255;
                    --var2;
                }
                if (this.field1408 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1374.method32(this.field1335.field620, 0, 2);
                    this.field1335.field621 = 0;
                    this.field1408 = this.field1335.method211();
                    var2 -= 2;
                }
                if (var2 < this.field1408) {
                    return false;
                }
                this.field1335.field621 = 0;
                this.field1374.method32(this.field1335.field620, 0, this.field1408);
                this.field1410 = 0;
                this.field1258 = this.field1257;
                this.field1257 = this.field1256;
                this.field1256 = this.field1409;
                if (this.field1409 == 169) {
                    int var3 = this.field1335.method211();
                    Component.field955[var3].field1001 = this.field1185.method115(2);
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 212) {
                    int var4 = this.field1335.method211();
                    int var5 = this.field1335.method211();
                    int var6 = var5 >> 10 & 31;
                    int var7 = var5 >> 5 & 31;
                    int var8 = var5 & 31;
                    Component.field955[var4].field996 = (var8 << 3) + (var6 << 19) + (var7 << 11);
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 242) {
                    this.field1513 = this.field1335.method211() * 30;
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 235) {
                    int var9 = this.field1335.method211();
                    int var10 = this.field1335.method214();
                    this.field1215[var9] = var10;
                    if (this.field1319[var9] != var10) {
                        this.field1319[var9] = var10;
                        this.method441(false, var9);
                        this.field1472 = true;
                        if (this.field1234 != -1) {
                            this.field1342 = true;
                        }
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 202) {
                    int var11 = this.field1335.method211();
                    int var12 = this.field1335.method209();
                    int var13 = this.field1335.method211();
                    if (this.field1301 && !field1115 && this.field1520 < 50) {
                        this.field1207[this.field1520] = var11;
                        this.field1116[this.field1520] = var12;
                        this.field1497[this.field1520] = Wave.field768[var11] + var13;
                        ++this.field1520;
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 57) {
                    if (this.field1490 == 12) {
                        this.field1472 = true;
                    }
                    this.field1377 = this.field1335.method212();
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 39) {
                    this.method368((byte) 89);
                    this.field1409 = -1;
                    return false;
                }
                if (this.field1409 == 240) {
                    this.field1481 = true;
                    this.field1393 = this.field1335.method209();
                    this.field1394 = this.field1335.method209();
                    this.field1395 = this.field1335.method211();
                    this.field1396 = this.field1335.method209();
                    this.field1397 = this.field1335.method209();
                    if (this.field1397 >= 100) {
                        int var14 = this.field1393 * 128 + 64;
                        int var15 = this.field1394 * 128 + 64;
                        int var16 = this.method447(this.field1394, this.field1393, true, this.field1170) - this.field1395;
                        int var17 = var14 - this.field1381;
                        int var18 = var16 - this.field1382;
                        int var19 = var15 - this.field1383;
                        int var20 = (int) Math.sqrt((double) (var17 * var17 + var19 * var19));
                        this.field1384 = (int) (Math.atan2((double) var18, (double) var20) * 325.949D) & 2047;
                        this.field1385 = (int) (Math.atan2((double) var17, (double) var19) * -325.949D) & 2047;
                        if (this.field1384 < 128) {
                            this.field1384 = 128;
                        }
                        if (this.field1384 > 383) {
                            this.field1384 = 383;
                        }
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 201) {
                    long var21 = this.field1335.method215((byte) -79);
                    int var23 = this.field1335.method214();
                    int var24 = this.field1335.method209();
                    boolean var25 = false;
                    for (int var26 = 0; var26 < 100; ++var26) {
                        if (this.field1091[var26] == var23) {
                            var25 = true;
                            break;
                        }
                    }
                    if (var24 <= 1) {
                        for (int var27 = 0; var27 < this.field1514; ++var27) {
                            if (this.field1094[var27] == var21) {
                                var25 = true;
                                break;
                            }
                        }
                    }
                    if (!var25 && this.field1288 == 0) {
                        try {
                            this.field1091[this.field1480] = var23;
                            this.field1480 = (this.field1480 + 1) % 100;
                            String var28 = WordPack.method258(-137, this.field1408 - 13, this.field1335);
                            String var29 = WordFilter.method335(var28, 0);
                            if (var24 > 1) {
                                this.method391(var29, 7, false, JString.method255(-148, JString.method252(var21, -38644)));
                            } else {
                                this.method391(var29, 3, false, JString.method255(-148, JString.method252(var21, -38644)));
                            }
                        } catch (Exception var181) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 66) {
                    int var31 = this.field1335.method209();
                    int var32 = this.field1335.method209();
                    int var33 = this.field1335.method211();
                    int var34 = this.field1335.method211();
                    int var35 = -1;
                    for (int var36 = 0; var36 < this.field1392.length; ++var36) {
                        if ((var31 << 8) + var32 == this.field1392[var36]) {
                            var35 = var36;
                        }
                    }
                    if (var35 != -1) {
                        if (this.field1501[var35] == null || this.field1501[var35].length != var34) {
                            this.field1501[var35] = new byte[var34];
                        }
                        this.field1335.method218(var33, this.field1501[var35], this.field1408 - 6, false);
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 213) {
                    this.field1509 = this.field1335.method209();
                    this.field1283 = this.field1335.method209();
                    this.field1242 = this.field1335.method209();
                    this.field1238 = true;
                    this.field1342 = true;
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 177) {
                    this.field1350 = this.field1335.method211();
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 192) {
                    this.field1132 = this.field1335.method209();
                    this.field1133 = this.field1335.method209();
                    while (this.field1335.field621 < this.field1408) {
                        int var37 = this.field1335.method209();
                        this.method395(this.field1304, var37, this.field1335);
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 174) {
                    this.field1481 = true;
                    this.field1387 = this.field1335.method209();
                    this.field1388 = this.field1335.method209();
                    this.field1389 = this.field1335.method211();
                    this.field1390 = this.field1335.method209();
                    this.field1391 = this.field1335.method209();
                    if (this.field1391 >= 100) {
                        this.field1381 = this.field1387 * 128 + 64;
                        this.field1383 = this.field1388 * 128 + 64;
                        this.field1382 = this.method447(this.field1388, this.field1387, true, this.field1170) - this.field1389;
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 128) {
                    this.method463(this.field1335, this.field1408, 6);
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 112) {
                    String var38 = this.field1335.method216();
                    if (var38.endsWith(":tradereq:")) {
                        String var39 = var38.substring(0, var38.indexOf(":"));
                        long var40 = JString.method251(var39);
                        boolean var42 = false;
                        for (int var43 = 0; var43 < this.field1514; ++var43) {
                            if (this.field1094[var43] == var40) {
                                var42 = true;
                                break;
                            }
                        }
                        if (!var42 && this.field1288 == 0) {
                            this.method391("wishes to trade with you.", 4, false, var39);
                        }
                    } else if (!var38.endsWith(":duelreq:")) {
                        this.method391(var38, 0, false, "");
                    } else {
                        String var44 = var38.substring(0, var38.indexOf(":"));
                        long var45 = JString.method251(var44);
                        boolean var47 = false;
                        for (int var48 = 0; var48 < this.field1514; ++var48) {
                            if (this.field1094[var48] == var45) {
                                var47 = true;
                                break;
                            }
                        }
                        if (!var47 && this.field1288 == 0) {
                            this.method391("wishes to duel with you.", 8, false, var44);
                        }
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 230) {
                    if (this.field1213 && !field1115) {
                        int var49 = this.field1335.method211();
                        int var50 = this.field1335.method214();
                        int var51 = this.field1408 - 6;
                        byte[] var52 = new byte[var50];
                        BZip2.method238(var52, var50, this.field1335.field620, var51, this.field1335.field621);
                        this.method458(var50, false, 2, var52);
                        this.field1286 = var49;
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 250) {
                    this.field1132 = this.field1335.method209();
                    this.field1133 = this.field1335.method209();
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 48) {
                    int var53 = this.field1335.method211();
                    int var54 = this.field1335.method211();
                    NpcType var55 = NpcType.method281(var54);
                    Component.field955[var53].field1001 = var55.method284(2);
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 47) {
                    this.field1481 = false;
                    for (int var56 = 0; var56 < 5; ++var56) {
                        this.field1269[var56] = false;
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 35) {
                    int var57 = this.field1335.method209();
                    int var58 = this.field1335.method209();
                    int var59 = this.field1335.method211();
                    int var60 = this.field1335.method211();
                    int var61 = -1;
                    for (int var62 = 0; var62 < this.field1392.length; ++var62) {
                        if ((var57 << 8) + var58 == this.field1392[var62]) {
                            var61 = var62;
                        }
                    }
                    if (var61 != -1) {
                        if (this.field1459[var61] == null || this.field1459[var61].length != var60) {
                            this.field1459[var61] = new byte[var60];
                        }
                        this.field1335.method218(var59, this.field1459[var61], this.field1408 - 6, false);
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 153) {
                    int var63 = this.field1335.method211();
                    this.method434(true, var63);
                    if (this.field1415 != -1) {
                        this.field1415 = -1;
                        this.field1342 = true;
                    }
                    if (this.field1302) {
                        this.field1302 = false;
                        this.field1342 = true;
                    }
                    this.field1416 = var63;
                    this.field1472 = true;
                    this.field1214 = true;
                    this.field1413 = -1;
                    this.field1373 = false;
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 253) {
                    int var64 = this.field1335.method211();
                    int var65 = this.field1335.method211();
                    int var66 = this.field1335.method211();
                    Component var67 = Component.field955[var64];
                    Model var68 = var67.field1001;
                    if (var68 != null) {
                        var68.method133(var65, var66);
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 33) {
                    int var69 = this.field1335.method211();
                    int var70 = this.field1335.method211();
                    int var71 = this.field1335.method211();
                    ObjType var72 = ObjType.method287(var70);
                    Component.field955[var69].field1001 = var72.method291(50);
                    Component.field955[var69].field1006 = var72.field886;
                    Component.field955[var69].field1007 = var72.field887;
                    Component.field955[var69].field1005 = var72.field885 * 100 / var71;
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 60) {
                    int var73 = this.field1335.method209();
                    int var74 = this.field1335.method209();
                    int var75 = -1;
                    for (int var76 = 0; var76 < this.field1392.length; ++var76) {
                        if ((var73 << 8) + var74 == this.field1392[var76]) {
                            var75 = var76;
                        }
                    }
                    if (var75 != -1) {
                        signlink.cachesave("l" + var73 + "_" + var74, this.field1459[var75]);
                        this.field1488 = 1;
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 132) {
                    InputTracking.method35(true, true);
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 107) {
                    if (this.field1490 == 12) {
                        this.field1472 = true;
                    }
                    this.field1467 = this.field1335.method209();
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 255) {
                    if (this.field1416 != -1) {
                        this.field1416 = -1;
                        this.field1472 = true;
                        this.field1214 = true;
                    }
                    if (this.field1415 != -1) {
                        this.field1415 = -1;
                        this.field1342 = true;
                    }
                    if (this.field1302) {
                        this.field1302 = false;
                        this.field1342 = true;
                    }
                    this.field1413 = -1;
                    this.field1373 = false;
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 42) {
                    this.field1380 = this.field1335.method209();
                    if (this.field1380 == 1) {
                        this.field1180 = this.field1335.method211();
                    }
                    if (this.field1380 >= 2 && this.field1380 <= 6) {
                        if (this.field1380 == 2) {
                            this.field1437 = 64;
                            this.field1438 = 64;
                        }
                        if (this.field1380 == 3) {
                            this.field1437 = 0;
                            this.field1438 = 64;
                        }
                        if (this.field1380 == 4) {
                            this.field1437 = 128;
                            this.field1438 = 64;
                        }
                        if (this.field1380 == 5) {
                            this.field1437 = 64;
                            this.field1438 = 0;
                        }
                        if (this.field1380 == 6) {
                            this.field1437 = 64;
                            this.field1438 = 128;
                        }
                        this.field1380 = 2;
                        this.field1434 = this.field1335.method211();
                        this.field1435 = this.field1335.method211();
                        this.field1436 = this.field1335.method209();
                    }
                    if (this.field1380 == 10) {
                        this.field1429 = this.field1335.method211();
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 248) {
                    int var77 = this.field1335.method211();
                    int var78 = this.field1335.method211();
                    Component.field955[var77].field1001 = new Model(0, var78);
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 94) {
                    this.field1472 = true;
                    int var79 = this.field1335.method209();
                    int var80 = this.field1335.method214();
                    int var81 = this.field1335.method209();
                    this.field1344[var79] = var80;
                    this.field1478[var79] = var81;
                    this.field1128[var79] = 1;
                    for (int var82 = 0; var82 < 98; ++var82) {
                        if (var80 >= field1092[var82]) {
                            this.field1128[var79] = var82 + 2;
                        }
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 113) {
                    this.field1514 = this.field1408 / 8;
                    for (int var83 = 0; var83 < this.field1514; ++var83) {
                        this.field1094[var83] = this.field1335.method215((byte) -79);
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 123) {
                    this.field1472 = true;
                    int var84 = this.field1335.method211();
                    Component var85 = Component.field955[var84];
                    int var86 = this.field1335.method209();
                    for (int var87 = 0; var87 < var86; ++var87) {
                        var85.field956[var87] = this.field1335.method211();
                        int var88 = this.field1335.method209();
                        if (var88 == 255) {
                            var88 = this.field1335.method214();
                        }
                        var85.field957[var87] = var88;
                    }
                    for (int var89 = var86; var89 < var85.field956.length; ++var89) {
                        var85.field956[var89] = 0;
                        var85.field957[var89] = 0;
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 12) {
                    int var90 = this.field1335.method209();
                    int var91 = this.field1335.method209();
                    int var92 = -1;
                    for (int var93 = 0; var93 < this.field1392.length; ++var93) {
                        if ((var90 << 8) + var91 == this.field1392[var93]) {
                            var92 = var93;
                        }
                    }
                    if (var92 != -1) {
                        signlink.cachesave("m" + var90 + "_" + var91, this.field1501[var92]);
                        this.field1488 = 1;
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 231) {
                    int var94 = this.field1335.method211();
                    int var95 = this.field1335.method211();
                    if (this.field1415 != -1) {
                        this.field1415 = -1;
                        this.field1342 = true;
                    }
                    if (this.field1302) {
                        this.field1302 = false;
                        this.field1342 = true;
                    }
                    this.field1413 = var94;
                    this.field1416 = var95;
                    this.field1472 = true;
                    this.field1214 = true;
                    this.field1373 = false;
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 147) {
                    this.field1132 = this.field1335.method209();
                    this.field1133 = this.field1335.method209();
                    for (int var96 = this.field1132; var96 < this.field1132 + 8; ++var96) {
                        for (int var97 = this.field1133; var97 < this.field1133 + 8; ++var97) {
                            if (this.field1278[this.field1170][var96][var97] != null) {
                                this.field1278[this.field1170][var96][var97] = null;
                                this.method459(var96, var97);
                            }
                        }
                    }
                    for (LocMerged var98 = (LocMerged) this.field1087.method228(); var98 != null; var98 = (LocMerged) this.field1087.method230(0)) {
                        if (var98.field635 >= this.field1132 && var98.field635 < this.field1132 + 8 && var98.field636 >= this.field1133 && var98.field636 < this.field1133 + 8 && this.field1170 == var98.field633) {
                            this.method445(var98.field634, 36300, var98.field641, var98.field642, var98.field636, var98.field635, var98.field633, var98.field640);
                            var98.method107();
                        }
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 171) {
                    this.field1259 = this.field1335.method214();
                    this.field1160 = this.field1335.method211();
                    this.field1446 = this.field1335.method209();
                    this.field1414 = this.field1335.method211();
                    if (this.field1259 != 0 && this.field1413 == -1) {
                        signlink.dnslookup(JString.method254(this.field1259, true));
                        this.method398((byte) 3);
                        short var99 = 650;
                        if (this.field1446 != 201) {
                            var99 = 655;
                        }
                        this.field1287 = "";
                        this.field1444 = false;
                        for (int var100 = 0; var100 < Component.field955.length; ++var100) {
                            if (Component.field955[var100] != null && Component.field955[var100].field964 == var99) {
                                this.field1413 = Component.field955[var100].field961;
                                break;
                            }
                        }
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 72) {
                    this.field1186 = this.field1335.method209();
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 176) {
                    int var101 = this.field1335.method211();
                    String var102 = this.field1335.method216();
                    Component.field955[var101].field994 = var102;
                    if (this.field1367[this.field1490] == Component.field955[var101].field961) {
                        this.field1472 = true;
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 71) {
                    int var103 = this.field1335.method209();
                    int var104 = this.field1335.method209();
                    int var105 = this.field1335.method209();
                    int var106 = this.field1335.method209();
                    this.field1269[var103] = true;
                    this.field1163[var103] = var104;
                    this.field1492[var103] = var105;
                    this.field1508[var103] = var106;
                    this.field1093[var103] = 0;
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 68) {
                    InputTracking.method34(0);
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 106) {
                    int var107 = this.field1335.method211();
                    this.method434(true, var107);
                    if (this.field1416 != -1) {
                        this.field1416 = -1;
                        this.field1472 = true;
                        this.field1214 = true;
                    }
                    this.field1415 = var107;
                    this.field1342 = true;
                    this.field1413 = -1;
                    this.field1373 = false;
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 85) {
                    this.field1490 = this.field1335.method209();
                    this.field1472 = true;
                    this.field1214 = true;
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 140) {
                    long var108 = this.field1335.method215((byte) -79);
                    int var110 = this.field1335.method209();
                    String var111 = JString.method255(-148, JString.method252(var108, -38644));
                    for (int var112 = 0; var112 < this.field1096; ++var112) {
                        if (this.field1445[var112] == var108) {
                            if (this.field1332[var112] != var110) {
                                this.field1332[var112] = var110;
                                this.field1472 = true;
                                if (var110 > 0) {
                                    this.method391(var111 + " has logged in.", 5, false, "");
                                }
                                if (var110 == 0) {
                                    this.method391(var111 + " has logged out.", 5, false, "");
                                }
                            }
                            var111 = null;
                            break;
                        }
                    }
                    if (var111 != null && this.field1096 < 100) {
                        this.field1445[this.field1096] = var108;
                        this.field1299[this.field1096] = var111;
                        this.field1332[this.field1096] = var110;
                        ++this.field1096;
                        this.field1472 = true;
                    }
                    boolean var113 = false;
                    while (!var113) {
                        var113 = true;
                        for (int var114 = 0; var114 < this.field1096 - 1; ++var114) {
                            if (this.field1332[var114] != field1112 && this.field1332[var114 + 1] == field1112 || this.field1332[var114] == 0 && this.field1332[var114 + 1] != 0) {
                                int var115 = this.field1332[var114];
                                this.field1332[var114] = this.field1332[var114 + 1];
                                this.field1332[var114 + 1] = var115;
                                String var116 = this.field1299[var114];
                                this.field1299[var114] = this.field1299[var114 + 1];
                                this.field1299[var114 + 1] = var116;
                                long var117 = this.field1445[var114];
                                this.field1445[var114] = this.field1445[var114 + 1];
                                this.field1445[var114 + 1] = var117;
                                this.field1472 = true;
                                var113 = false;
                            }
                        }
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 165) {
                    int var119 = this.field1335.method212();
                    this.field1234 = var119;
                    this.field1342 = true;
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 216) {
                    for (int var120 = 0; var120 < this.field1319.length; ++var120) {
                        if (this.field1319[var120] != this.field1215[var120]) {
                            this.field1319[var120] = this.field1215[var120];
                            this.method441(false, var120);
                            this.field1472 = true;
                        }
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 117 || this.field1409 == 25 || this.field1409 == 127 || this.field1409 == 195 || this.field1409 == 1 || this.field1409 == 61 || this.field1409 == 246 || this.field1409 == 78 || this.field1409 == 214 || this.field1409 == 220) {
                    this.method395(this.field1304, this.field1409, this.field1335);
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 180) {
                    int var121 = this.field1335.method211();
                    this.method434(true, var121);
                    if (this.field1416 != -1) {
                        this.field1416 = -1;
                        this.field1472 = true;
                        this.field1214 = true;
                    }
                    if (this.field1415 != -1) {
                        this.field1415 = -1;
                        this.field1342 = true;
                    }
                    if (this.field1302) {
                        this.field1302 = false;
                        this.field1342 = true;
                    }
                    this.field1413 = var121;
                    this.field1373 = false;
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 125) {
                    this.field1154 = 0;
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 191) {
                    int var122 = this.field1335.method211();
                    int var123 = this.field1335.method212();
                    int var124 = this.field1335.method212();
                    Component var125 = Component.field955[var122];
                    var125.field967 = var123;
                    var125.field968 = var124;
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 3) {
                    int var126 = this.field1335.method211();
                    int var127 = this.field1335.method211();
                    if (this.field1226 == var126 && this.field1227 == var127 && this.field1488 != 0) {
                        this.field1409 = -1;
                        return true;
                    }
                    this.field1226 = var126;
                    this.field1227 = var127;
                    this.field1430 = (this.field1226 - 6) * 8;
                    this.field1431 = (this.field1227 - 6) * 8;
                    this.field1488 = 1;
                    this.field1174.method235((byte) 120);
                    this.field1450.method188(12097, 257, 151, "Loading - please wait.", 0);
                    this.field1450.method188(12097, 256, 150, "Loading - please wait.", 16777215);
                    this.field1174.method236(11, super.field18, -3666, 8);
                    signlink.looprate(5);
                    int var128 = (this.field1408 - 2) / 10;
                    this.field1501 = new byte[var128][];
                    this.field1459 = new byte[var128][];
                    this.field1392 = new int[var128];
                    this.field1355.method198(0, 131);
                    this.field1355.method199(0);
                    int var129 = 0;
                    for (int var130 = 0; var130 < var128; ++var130) {
                        int var131 = this.field1335.method209();
                        int var132 = this.field1335.method209();
                        int var133 = this.field1335.method214();
                        int var134 = this.field1335.method214();
                        this.field1392[var130] = (var131 << 8) + var132;
                        if (var133 != 0) {
                            byte[] var135 = signlink.cacheload("m" + var131 + "_" + var132);
                            if (var135 != null) {
                                this.field1294.reset();
                                this.field1294.update(var135);
                                if ((int) this.field1294.getValue() != var133) {
                                    var135 = null;
                                }
                            }
                            if (var135 != null) {
                                this.field1501[var130] = var135;
                            } else {
                                this.field1488 = 0;
                                this.field1355.method199(0);
                                this.field1355.method199(var131);
                                this.field1355.method199(var132);
                                var129 += 3;
                            }
                        }
                        if (var134 != 0) {
                            byte[] var136 = signlink.cacheload("l" + var131 + "_" + var132);
                            if (var136 != null) {
                                this.field1294.reset();
                                this.field1294.update(var136);
                                if ((int) this.field1294.getValue() != var134) {
                                    var136 = null;
                                }
                            }
                            if (var136 != null) {
                                this.field1459[var130] = var136;
                            } else {
                                this.field1488 = 0;
                                this.field1355.method199(1);
                                this.field1355.method199(var131);
                                this.field1355.method199(var132);
                                var129 += 3;
                            }
                        }
                    }
                    this.field1355.method208(var129, false);
                    signlink.looprate(50);
                    this.field1174.method235((byte) 120);
                    if (this.field1488 == 0) {
                        this.field1450.method188(12097, 257, 166, "Map area updated since last visit, so load will take longer this time only", 0);
                        this.field1450.method188(12097, 256, 165, "Map area updated since last visit, so load will take longer this time only", 16777215);
                    }
                    this.field1174.method236(11, super.field18, -3666, 8);
                    int var137 = this.field1430 - this.field1432;
                    int var138 = this.field1431 - this.field1433;
                    this.field1432 = this.field1430;
                    this.field1433 = this.field1431;
                    for (int var139 = 0; var139 < 8192; ++var139) {
                        NpcEntity var140 = this.field1296[var139];
                        if (var140 != null) {
                            for (int var141 = 0; var141 < 10; ++var141) {
                                var140.field353[var141] -= var137;
                                var140.field354[var141] -= var138;
                            }
                            var140.field305 -= var137 * 128;
                            var140.field306 -= var138 * 128;
                        }
                    }
                    for (int var142 = 0; var142 < this.field1199; ++var142) {
                        PlayerEntity var143 = this.field1201[var142];
                        if (var143 != null) {
                            for (int var144 = 0; var144 < 10; ++var144) {
                                var143.field353[var144] -= var137;
                                var143.field354[var144] -= var138;
                            }
                            var143.field305 -= var137 * 128;
                            var143.field306 -= var138 * 128;
                        }
                    }
                    byte var145 = 0;
                    byte var146 = 104;
                    byte var147 = 1;
                    if (var137 < 0) {
                        var145 = 103;
                        var146 = -1;
                        var147 = -1;
                    }
                    byte var148 = 0;
                    byte var149 = 104;
                    byte var150 = 1;
                    if (var138 < 0) {
                        var148 = 103;
                        var149 = -1;
                        var150 = -1;
                    }
                    for (int var151 = var145; var146 != var151; var151 += var147) {
                        for (int var152 = var148; var149 != var152; var152 += var150) {
                            int var153 = var137 + var151;
                            int var154 = var138 + var152;
                            for (int var155 = 0; var155 < 4; ++var155) {
                                if (var153 >= 0 && var154 >= 0 && var153 < 104 && var154 < 104) {
                                    this.field1278[var155][var151][var152] = this.field1278[var155][var153][var154];
                                } else {
                                    this.field1278[var155][var151][var152] = null;
                                }
                            }
                        }
                    }
                    for (LocMerged var156 = (LocMerged) this.field1087.method228(); var156 != null; var156 = (LocMerged) this.field1087.method230(0)) {
                        var156.field635 -= var137;
                        var156.field636 -= var138;
                        if (var156.field635 < 0 || var156.field636 < 0 || var156.field635 >= 104 || var156.field636 >= 104) {
                            var156.method107();
                        }
                    }
                    if (this.field1154 != 0) {
                        this.field1154 -= var137;
                        this.field1155 -= var138;
                    }
                    this.field1481 = false;
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 49) {
                    this.method416(this.field1335, 45899, this.field1408);
                    if (this.field1488 == 1) {
                        this.field1488 = 2;
                        World.field42 = this.field1170;
                        this.method471(508);
                    }
                    if (field1115 && this.field1488 == 2 && World.field42 != this.field1170) {
                        this.field1174.method235((byte) 120);
                        this.field1450.method188(12097, 257, 151, "Loading - please wait.", 0);
                        this.field1450.method188(12097, 256, 150, "Loading - please wait.", 16777215);
                        this.field1174.method236(11, super.field18, -3666, 8);
                        World.field42 = this.field1170;
                        this.method471(508);
                    }
                    if (this.field1300 != this.field1170 && this.field1488 == 2) {
                        this.field1300 = this.field1170;
                        this.method377(839, this.field1170);
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 92) {
                    String var157 = this.field1335.method216();
                    int var158 = this.field1335.method214();
                    int var159 = this.field1335.method214();
                    if (!var157.equals(this.field1225) && this.field1213 && !field1115) {
                        this.method406(var159, var158, var157, 801);
                    }
                    this.field1225 = var157;
                    this.field1265 = var158;
                    this.field1460 = var159;
                    this.field1286 = 0;
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 133) {
                    int var160 = this.field1335.method211();
                    byte var161 = this.field1335.method210();
                    this.field1215[var160] = var161;
                    if (this.field1319[var160] != var161) {
                        this.field1319[var160] = var161;
                        this.method441(false, var160);
                        this.field1472 = true;
                        if (this.field1234 != -1) {
                            this.field1342 = true;
                        }
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 55) {
                    for (int var162 = 0; var162 < this.field1201.length; ++var162) {
                        if (this.field1201[var162] != null) {
                            this.field1201[var162].field332 = -1;
                        }
                    }
                    for (int var163 = 0; var163 < this.field1296.length; ++var163) {
                        if (this.field1296[var163] != null) {
                            this.field1296[var163].field332 = -1;
                        }
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 80) {
                    int var164 = this.field1335.method211();
                    int var165 = this.field1335.method211();
                    Component.field955[var164].field1003 = var165;
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 38) {
                    this.field1472 = true;
                    int var166 = this.field1335.method211();
                    Component var167 = Component.field955[var166];
                    while (this.field1335.field621 < this.field1408) {
                        int var168 = this.field1335.method209();
                        int var169 = this.field1335.method211();
                        int var170 = this.field1335.method209();
                        if (var170 == 255) {
                            var170 = this.field1335.method214();
                        }
                        if (var168 >= 0 && var168 < var167.field956.length) {
                            var167.field956[var168] = var169;
                            var167.field957[var168] = var170;
                        }
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 100) {
                    int var171 = this.field1335.method211();
                    int var172 = this.field1335.method209();
                    if (var171 == 65535) {
                        var171 = -1;
                    }
                    this.field1367[var172] = var171;
                    this.field1472 = true;
                    this.field1214 = true;
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 186) {
                    int var173 = this.field1335.method211();
                    Component var174 = Component.field955[var173];
                    for (int var175 = 0; var175 < var174.field956.length; ++var175) {
                        var174.field956[var175] = -1;
                        var174.field956[var175] = 0;
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 218) {
                    int var176 = this.field1335.method211();
                    boolean var177 = this.field1335.method209() == 1;
                    Component.field955[var176].field975 = var177;
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 98) {
                    this.field1439 = this.field1335.method209();
                    if (this.field1490 == this.field1439) {
                        if (this.field1439 == 3) {
                            this.field1490 = 1;
                        } else {
                            this.field1490 = 3;
                        }
                        this.field1472 = true;
                    }
                    this.field1409 = -1;
                    return true;
                }
                if (this.field1409 == 254) {
                    this.field1356 = false;
                    this.field1302 = true;
                    this.field1241 = "";
                    this.field1342 = true;
                    this.field1409 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1409 + "," + this.field1408 + " - " + this.field1257 + "," + this.field1258);
                this.method368((byte) 89);
            } catch (IOException var182) {
                this.method371(928);
            } catch (Exception var183) {
                String var179 = "T2 - " + this.field1409 + "," + this.field1257 + "," + this.field1258 + " - " + this.field1408 + "," + (this.field1185.field353[0] + this.field1430) + "," + (this.field1185.field354[0] + this.field1431) + " - ";
                for (int var180 = 0; var180 < this.field1408 && var180 < 50; ++var180) {
                    var179 = var179 + this.field1335.field620[var180] + ",";
                }
                signlink.reporterror(var179);
                this.method368((byte) 89);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method436(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1399[(var2 - 2 << 7) + var3] = 255;
            }
        }
        if (arg0 < 9 || arg0 > 9) {
            this.method6();
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1399[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1400[var14] = (this.field1399[var14 - 1] + this.field1399[var14 + 1] + this.field1399[var14 - 128] + this.field1399[var14 + 128]) / 4;
            }
        }
        this.field1303 += 128;
        if (this.field1303 > this.field1248.length) {
            this.field1303 -= this.field1248.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method405((byte) 8, this.field1309[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field1400[var11 + 128] - this.field1248[this.field1303 + var11 & this.field1248.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field1399[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field1515[var8] = this.field1515[var8 + 1];
        }
        this.field1515[var2 - 1] = (int) (Math.sin((double) field1311 / 14.0D) * 16.0D + Math.sin((double) field1311 / 15.0D) * 14.0D + Math.sin((double) field1311 / 16.0D) * 12.0D);
        if (this.field1317 > 0) {
            this.field1317 -= 4;
        }
        if (this.field1318 > 0) {
            this.field1318 -= 4;
        }
        if (this.field1317 == 0 && this.field1318 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field1317 = 1024;
            }
            if (var9 == 1) {
                this.field1318 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lhc;B)Z")
    public final boolean method437(Component arg0, byte arg1) {
        if (arg0.field970 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field970.length; ++var3) {
                int var4 = this.method367(true, arg0, var3);
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
            if (arg1 != 0) {
                throw new NullPointerException();
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;BI)V")
    private final void method438(Packet arg0, byte arg1, int arg2) {
        while (true) {
            if (arg0.field622 + 21 < arg2 * 8) {
                int var4 = arg0.method220(13, 0);
                if (var4 != 8191) {
                    if (this.field1296[var4] == null) {
                        this.field1296[var4] = new NpcEntity();
                    }
                    NpcEntity var5 = this.field1296[var4];
                    this.field1298[this.field1297++] = var4;
                    var5.field349 = field1311;
                    var5.field358 = NpcType.method281(arg0.method220(11, 0));
                    var5.field309 = var5.field358.field850;
                    var5.field312 = var5.field358.field854;
                    var5.field313 = var5.field358.field855;
                    var5.field314 = var5.field358.field856;
                    var5.field315 = var5.field358.field857;
                    var5.field310 = var5.field358.field853;
                    int var6 = arg0.method220(5, 0);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg0.method220(5, 0);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var5.method109(this.field1185.field354[0] + var7, false, this.field1185.field353[0] + var6, false);
                    int var8 = arg0.method220(1, 0);
                    if (var8 == 1) {
                        this.field1205[this.field1204++] = var4;
                    }
                    continue;
                }
            }
            arg0.method221(-614);
            if (arg1 != 6) {
                this.field1409 = -1;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLjava/lang/String;IILjava/lang/String;)Lub;")
    public final Jagfile method439(byte arg0, String arg1, int arg2, int arg3, String arg4) {
        int var6 = 5;
        byte[] var7 = signlink.cacheload(arg4);
        if (var7 != null) {
            this.field1294.reset();
            this.field1294.update(var7);
            int var8 = (int) this.field1294.getValue();
            if (arg3 != var8) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(true, var7);
        } else {
            while (var7 == null) {
                this.method13(arg2, 0, "Requesting " + arg1);
                try {
                    int var10 = 0;
                    DataInputStream var11 = this.method477(arg4 + arg3);
                    byte[] var12 = new byte[6];
                    var11.readFully(var12, 0, 6);
                    Packet var13 = new Packet(0, var12);
                    var13.field621 = 3;
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
                            this.method13(arg2, 0, "Loading " + arg1 + " - " + var18 + "%");
                        }
                        var10 = var18;
                    }
                    var11.close();
                } catch (IOException var23) {
                    var7 = null;
                    for (int var19 = var6; var19 > 0; --var19) {
                        this.method13(arg2, 0, "Error loading - Will retry in " + var19 + " secs.");
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
            signlink.cachesave(arg4, var7);
            if (arg0 != -68) {
                for (int var20 = 1; var20 > 0; ++var20) {
                }
            }
            return new Jagfile(true, var7);
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method440(int arg0) {
        if (this.field1312 != arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field1371 == 0) {
            int var3 = super.field16 / 2 - 80;
            int var4 = super.field17 / 2 + 20;
            int var15 = var4 + 20;
            if (super.field27 == 1 && super.field28 >= var3 - 75 && super.field28 <= var3 + 75 && super.field29 >= var15 - 20 && super.field29 <= var15 + 20) {
                this.field1371 = 3;
                this.field1482 = 0;
            }
            int var5 = super.field16 / 2 + 80;
            if (super.field27 == 1 && super.field28 >= var5 - 75 && super.field28 <= var5 + 75 && super.field29 >= var15 - 20 && super.field29 <= var15 + 20) {
                this.field1345 = "";
                this.field1346 = "Enter your username & password.";
                this.field1371 = 2;
                this.field1482 = 0;
                return;
            }
        } else {
            if (this.field1371 == 2) {
                int var6 = super.field17 / 2 - 40;
                int var16 = var6 + 30;
                int var17 = var16 + 25;
                if (super.field27 == 1 && super.field29 >= var17 - 15 && super.field29 < var17) {
                    this.field1482 = 0;
                }
                var6 = var17 + 15;
                if (super.field27 == 1 && super.field29 >= var6 - 15 && super.field29 < var6) {
                    this.field1482 = 1;
                }
                var6 += 15;
                int var7 = super.field16 / 2 - 80;
                int var8 = super.field17 / 2 + 50;
                int var18 = var8 + 20;
                if (super.field27 == 1 && super.field28 >= var7 - 75 && super.field28 <= var7 + 75 && super.field29 >= var18 - 20 && super.field29 <= var18 + 20) {
                    this.method456(this.field1474, this.field1475, false);
                }
                int var9 = super.field16 / 2 + 80;
                if (super.field27 == 1 && super.field28 >= var9 - 75 && super.field28 <= var9 + 75 && super.field29 >= var18 - 20 && super.field29 <= var18 + 20) {
                    this.field1371 = 0;
                    this.field1474 = "";
                    this.field1475 = "";
                }
                while (true) {
                    while (true) {
                        int var10 = this.method5(0);
                        if (var10 == -1) {
                            return;
                        }
                        boolean var11 = false;
                        for (int var12 = 0; var12 < field1158.length(); ++var12) {
                            if (var10 == field1158.charAt(var12)) {
                                var11 = true;
                                break;
                            }
                        }
                        if (this.field1482 == 0) {
                            if (var10 == 8 && this.field1474.length() > 0) {
                                this.field1474 = this.field1474.substring(0, this.field1474.length() - 1);
                            }
                            if (var10 == 9 || var10 == 10 || var10 == 13) {
                                this.field1482 = 1;
                            }
                            if (var11) {
                                this.field1474 = this.field1474 + (char) var10;
                            }
                            if (this.field1474.length() > 12) {
                                this.field1474 = this.field1474.substring(0, 12);
                            }
                        } else if (this.field1482 == 1) {
                            if (var10 == 8 && this.field1475.length() > 0) {
                                this.field1475 = this.field1475.substring(0, this.field1475.length() - 1);
                            }
                            if (var10 == 9 || var10 == 10 || var10 == 13) {
                                this.field1482 = 0;
                            }
                            if (var11) {
                                this.field1475 = this.field1475 + (char) var10;
                            }
                            if (this.field1475.length() > 20) {
                                this.field1475 = this.field1475.substring(0, 20);
                            }
                        }
                    }
                }
            }
            if (this.field1371 != 3) {
                return;
            }
            int var13 = super.field16 / 2;
            int var14 = super.field17 / 2 + 50;
            int var19 = var14 + 20;
            if (super.field27 != 1 || super.field28 < var13 - 75 || super.field28 > var13 + 75 || super.field29 < var19 - 20 || super.field29 > var19 + 20) {
                return;
            }
            this.field1371 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(ZI)V")
    public final void method441(boolean arg0, int arg1) {
        if (arg0) {
            this.field1295 = !this.field1295;
        }
        int var3 = VarpType.field1054[arg1].field1062;
        if (var3 != 0) {
            int var4 = this.field1319[arg1];
            if (var3 == 1) {
                if (var4 == 1) {
                    Pix3D.method162(0.9D, true);
                }
                if (var4 == 2) {
                    Pix3D.method162(0.8D, true);
                }
                if (var4 == 3) {
                    Pix3D.method162(0.7D, true);
                }
                if (var4 == 4) {
                    Pix3D.method162(0.6D, true);
                }
                ObjType.field915.method104();
                this.field1405 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field1213;
                if (var4 == 0) {
                    this.method380(this.field1213, 0, 9730);
                    this.field1213 = true;
                }
                if (var4 == 1) {
                    this.method380(this.field1213, -400, 9730);
                    this.field1213 = true;
                }
                if (var4 == 2) {
                    this.method380(this.field1213, -800, 9730);
                    this.field1213 = true;
                }
                if (var4 == 3) {
                    this.method380(this.field1213, -1200, 9730);
                    this.field1213 = true;
                }
                if (var4 == 4) {
                    this.field1213 = false;
                }
                if (this.field1213 != var5) {
                    if (this.field1213) {
                        this.method406(this.field1460, this.field1265, this.field1225, 801);
                    } else {
                        this.method384((byte) 9);
                    }
                    this.field1286 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field1301 = true;
                    this.method470(0, 2);
                }
                if (var4 == 1) {
                    this.field1301 = true;
                    this.method470(-400, 2);
                }
                if (var4 == 2) {
                    this.field1301 = true;
                    this.method470(-800, 2);
                }
                if (var4 == 3) {
                    this.field1301 = true;
                    this.method470(-1200, 2);
                }
                if (var4 == 4) {
                    this.field1301 = false;
                }
            }
            if (var3 == 5) {
                this.field1442 = var4;
            }
            if (var3 == 6) {
                this.field1189 = var4;
            }
            if (var3 == 8) {
                this.field1088 = var4;
                this.field1342 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method442(int arg0) {
        this.field1349 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field1251) {
                this.method436(this.field1454);
                this.method436(this.field1454);
                this.method387(8);
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
        this.field1349 = false;
        if (arg0 <= 0) {
            this.field1278 = null;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method443(byte arg0) {
        if (this.field1274 == 0) {
            this.field1212[0] = "Cancel";
            this.field1222[0] = 1333;
            this.field1343 = 1;
            this.method430(super.field26, super.field25, 0);
            this.field1457 = 0;
            if (arg0 == 9) {
                if (super.field25 > 8 && super.field26 > 11 && super.field25 < 520 && super.field26 < 345) {
                    if (this.field1413 != -1) {
                        this.method364(super.field25, 8, 0, super.field26, 11, -772, Component.field955[this.field1413]);
                    } else {
                        this.method418(this.field1198);
                    }
                }
                if (this.field1457 != this.field1352) {
                    this.field1352 = this.field1457;
                }
                this.field1457 = 0;
                if (super.field25 > 562 && super.field26 > 231 && super.field25 < 752 && super.field26 < 492) {
                    if (this.field1416 != -1) {
                        this.method364(super.field25, 562, 0, super.field26, 231, -772, Component.field955[this.field1416]);
                    } else if (this.field1367[this.field1490] != -1) {
                        this.method364(super.field25, 562, 0, super.field26, 231, -772, Component.field955[this.field1367[this.field1490]]);
                    }
                }
                if (this.field1457 != this.field1268) {
                    this.field1472 = true;
                    this.field1268 = this.field1457;
                }
                this.field1457 = 0;
                if (super.field25 > 22 && super.field26 > 375 && super.field25 < 431 && super.field26 < 471) {
                    if (this.field1415 != -1) {
                        this.method364(super.field25, 22, 0, super.field26, 375, -772, Component.field955[this.field1415]);
                    } else {
                        this.method385((byte) -43, super.field25 - 22, super.field26 - 375);
                    }
                }
                if (this.field1415 != -1 && this.field1457 != this.field1282) {
                    this.field1342 = true;
                    this.field1282 = this.field1457;
                }
                boolean var2 = false;
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field1343 - 1; ++var3) {
                        if (this.field1222[var3] < 1000 && this.field1222[var3 + 1] > 1000) {
                            String var4 = this.field1212[var3];
                            this.field1212[var3] = this.field1212[var3 + 1];
                            this.field1212[var3 + 1] = var4;
                            int var5 = this.field1222[var3];
                            this.field1222[var3] = this.field1222[var3 + 1];
                            this.field1222[var3 + 1] = var5;
                            int var6 = this.field1220[var3];
                            this.field1220[var3] = this.field1220[var3 + 1];
                            this.field1220[var3 + 1] = var6;
                            int var7 = this.field1221[var3];
                            this.field1221[var3] = this.field1221[var3 + 1];
                            this.field1221[var3 + 1] = var7;
                            int var8 = this.field1223[var3];
                            this.field1223[var3] = this.field1223[var3 + 1];
                            this.field1223[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        if (field1316 != arg0) {
            this.field1409 = -1;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field21 != null ? super.field21 : this;
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method444(int arg0) {
        int var2 = this.field1100;
        int var3 = this.field1101;
        int var4 = this.field1102;
        int var5 = this.field1103;
        int var6 = 6116423;
        Pix2D.method149(var6, -288, var2, var3, var4, var5);
        if (arg0 >= 8 && arg0 <= 8) {
            Pix2D.method149(0, -288, var2 + 1, var3 + 1, var4 - 2, 16);
            Pix2D.method150(0, field1406, var2 + 1, var3 + 18, var5 - 19, var4 - 2);
            this.field1451.method191(var2 + 3, var6, (byte) 6, "Choose Option", var3 + 14);
            int var7 = super.field25;
            int var8 = super.field26;
            if (this.field1099 == 0) {
                var7 -= 8;
                var8 -= 11;
            }
            if (this.field1099 == 1) {
                var7 -= 562;
                var8 -= 231;
            }
            if (this.field1099 == 2) {
                var7 -= 22;
                var8 -= 375;
            }
            for (int var9 = 0; var9 < this.field1343; ++var9) {
                int var10 = (this.field1343 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                this.field1451.method193(var2 + 3, var11, var10, this.field1212[var9], 0, true);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 36300) {
            this.field1355.method199(43);
        }
        if (arg5 >= 1 && arg4 >= 1 && arg5 <= 102 && arg4 <= 102) {
            if (field1115 && this.field1170 != arg6) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg0 == 0) {
                var9 = this.field1504.method77(arg6, arg5, arg4);
            }
            if (arg0 == 1) {
                var9 = this.field1504.method78(arg6, 0, arg4, arg5);
            }
            if (arg0 == 2) {
                var9 = this.field1504.method79(arg6, arg5, arg4);
            }
            if (arg0 == 3) {
                var9 = this.field1504.method80(arg6, arg5, arg4);
            }
            if (var9 != 0) {
                int var13 = this.field1504.method81(arg6, arg5, arg4, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg0 == 0) {
                    this.field1504.method72(false, arg6, arg4, arg5);
                    LocType var17 = LocType.method275(var14);
                    if (var17.field815) {
                        this.field1494[arg6].method300(var16, arg4, -484, var15, arg5, var17.field816);
                    }
                }
                if (arg0 == 1) {
                    this.field1504.method73(arg4, arg6, arg5, true);
                }
                if (arg0 == 2) {
                    this.field1504.method74((byte) 83, arg6, arg5, arg4);
                    LocType var18 = LocType.method275(var14);
                    if (var18.field813 + arg5 > 103 || var18.field813 + arg4 > 103 || var18.field814 + arg5 > 103 || var18.field814 + arg4 > 103) {
                        return;
                    }
                    if (var18.field815) {
                        this.field1494[arg6].method301(arg4, var18.field813, var18.field814, var18.field816, var16, this.field1169, arg5);
                    }
                }
                if (arg0 == 3) {
                    this.field1504.method75(arg6, (byte) -63, arg5, arg4);
                    LocType var19 = LocType.method275(var14);
                    if (var19.field815 && var19.field817) {
                        this.field1494[arg6].method303(-701, arg4, arg5);
                    }
                }
            }
            if (arg7 >= 0) {
                int var20 = arg6;
                if (arg6 < 3 && (this.field1247[1][arg5][arg4] & 2) == 2) {
                    var20 = arg6 + 1;
                }
                World.method28(this.field1494[arg6], arg6, arg4, this.field1308, (byte) 1, arg7, this.field1197, arg5, arg3, this.field1504, var20, arg2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method8(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1374 != null) {
                this.field1374.method29();
            }
        } catch (Exception var2) {
        }
        this.field1374 = null;
        this.method384((byte) 9);
        this.field1320 = false;
        this.field1355 = null;
        this.field1159 = null;
        this.field1335 = null;
        this.field1392 = null;
        this.field1501 = null;
        this.field1459 = null;
        this.field1308 = null;
        this.field1247 = null;
        this.field1504 = null;
        this.field1494 = null;
        this.field1237 = null;
        this.field1235 = null;
        this.field1284 = null;
        this.field1285 = null;
        this.field1153 = null;
        this.field1172 = null;
        this.field1173 = null;
        this.field1174 = null;
        this.field1175 = null;
        this.field1262 = null;
        this.field1263 = null;
        this.field1264 = null;
        this.field1357 = null;
        this.field1358 = null;
        this.field1359 = null;
        this.field1360 = null;
        if (arg0 == -12828) {
            this.field1361 = null;
            this.field1362 = null;
            this.field1363 = null;
            this.field1364 = null;
            this.field1365 = null;
            this.field1366 = null;
            this.field1498 = null;
            this.field1499 = null;
            this.field1500 = null;
            this.field1463 = null;
            this.field1464 = null;
            this.field1465 = null;
            this.field1162 = null;
            this.field1417 = null;
            this.field1418 = null;
            this.field1419 = null;
            this.field1420 = null;
            this.field1421 = null;
            this.field1120 = null;
            this.field1121 = null;
            this.field1122 = null;
            this.field1123 = null;
            this.field1124 = null;
            this.field1140 = null;
            this.field1458 = null;
            this.field1378 = null;
            this.field1517 = null;
            this.field1193 = null;
            this.field1194 = null;
            this.field1195 = null;
            this.field1196 = null;
            this.field1108 = null;
            this.field1253 = null;
            this.field1305 = null;
            this.field1201 = null;
            this.field1203 = null;
            this.field1205 = null;
            this.field1206 = null;
            this.field1341 = null;
            this.field1296 = null;
            this.field1298 = null;
            this.field1278 = null;
            this.field1087 = null;
            this.field1353 = null;
            this.field1336 = null;
            this.field1106 = null;
            this.field1197 = null;
            this.field1220 = null;
            this.field1221 = null;
            this.field1222 = null;
            this.field1223 = null;
            this.field1212 = null;
            this.field1319 = null;
            this.field1280 = null;
            this.field1281 = null;
            this.field1495 = null;
            this.field1156 = null;
            this.field1299 = null;
            this.field1445 = null;
            this.field1332 = null;
            this.field1324 = null;
            this.field1325 = null;
            this.field1321 = null;
            this.field1322 = null;
            this.field1323 = null;
            this.field1326 = null;
            this.field1327 = null;
            this.field1328 = null;
            this.field1329 = null;
            this.method472((byte) 9);
            LocType.method274((byte) -123);
            NpcType.method280((byte) -123);
            ObjType.method286((byte) -123);
            FloType.field932 = null;
            IdkType.field945 = null;
            Component.field955 = null;
            UnkType.field1015 = null;
            SeqType.field1023 = null;
            SpotAnimType.field1039 = null;
            SpotAnimType.field1051 = null;
            VarpType.field1054 = null;
            super.field19 = null;
            PlayerEntity.field381 = null;
            Pix3D.method153((byte) -123);
            World3D.method49((byte) -123);
            Model.method120((byte) -123);
            AnimBase.field86 = null;
            AnimFrame.field90 = null;
            System.gc();
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method446(int arg0) {
        SpotAnimEntity var2 = (SpotAnimEntity) this.field1106.method228();
        if (arg0 >= 0) {
            this.field1134 = this.field1479.method246();
        }
        while (var2 != null) {
            if (this.field1170 == var2.field410 && !var2.field416) {
                if (field1311 >= var2.field409) {
                    var2.method118(-145, this.field1135);
                    if (var2.field416) {
                        var2.method107();
                    } else {
                        this.field1504.method61(60, 0, var2.field411, var2.field413, -2146, -1, var2.field410, var2, (Model) null, var2.field412, false);
                    }
                }
            } else {
                var2.method107();
            }
            var2 = (SpotAnimEntity) this.field1106.method230(0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZI)I")
    public final int method447(int arg0, int arg1, boolean arg2, int arg3) {
        int var5 = arg1 >> 7;
        int var6 = arg0 >> 7;
        int var7 = arg3;
        if (arg3 < 3 && (this.field1247[1][var5][var6] & 2) == 2) {
            var7 = arg3 + 1;
        }
        int var8 = arg1 & 127;
        int var9 = arg0 & 127;
        int var10 = (128 - var8) * this.field1308[var7][var5][var6] + this.field1308[var7][var5 + 1][var6] * var8 >> 7;
        this.field1105 &= arg2;
        int var11 = (128 - var8) * this.field1308[var7][var5][var6 + 1] + this.field1308[var7][var5 + 1][var6 + 1] * var8 >> 7;
        return (128 - var9) * var10 + var9 * var11 >> 7;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)Ljava/lang/String;")
    private static final String method448(int arg0, int arg1) {
        int var2 = 39 / arg0;
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field1112 = Integer.parseInt(this.getParameter("nodeid"));
        field1113 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method474(field1191);
        } else {
            method401(-317);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field1114 = false;
        } else {
            field1114 = true;
        }
        this.method2(789, 532, 2);
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method449(boolean arg0) {
        LocType.field839.method104();
        if (arg0) {
            this.field1278 = null;
        }
        LocType.field840.method104();
        NpcType.field869.method104();
        ObjType.field914.method104();
        ObjType.field915.method104();
        PlayerEntity.field381.method104();
        SpotAnimType.field1051.method104();
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method450(byte arg0) {
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            field1406 = !field1406;
        }
        for (LocEntity var3 = (LocEntity) this.field1197.method228(); var3 != null; var3 = (LocEntity) this.field1197.method230(0)) {
            boolean var4 = false;
            var3.field660 += this.field1135;
            if (var3.field659 == -1) {
                var3.field659 = 0;
                var4 = true;
            }
            label79: {
                do {
                    do {
                        if (var3.field660 <= var3.field658.field1027[var3.field659]) {
                            break label79;
                        }
                        var3.field660 -= var3.field658.field1027[var3.field659] + 1;
                        ++var3.field659;
                        var4 = true;
                    } while (var3.field659 < var3.field658.field1024);
                    var3.field659 -= var3.field658.field1028;
                } while (var3.field659 >= 0 && var3.field659 < var3.field658.field1024);
                var3.method107();
                var4 = false;
            }
            if (var4) {
                int var5 = var3.field653;
                int var6 = var3.field655;
                int var7 = var3.field656;
                int var8 = 0;
                if (var3.field654 == 0) {
                    var8 = this.field1504.method77(var5, var6, var7);
                }
                if (var3.field654 == 1) {
                    var8 = this.field1504.method78(var5, 0, var7, var6);
                }
                if (var3.field654 == 2) {
                    var8 = this.field1504.method79(var5, var6, var7);
                }
                if (var3.field654 == 3) {
                    var8 = this.field1504.method80(var5, var6, var7);
                }
                if (var8 != 0 && (var8 >> 14 & 32767) == var3.field657) {
                    int var9 = this.field1308[var5][var6][var7];
                    int var10 = this.field1308[var5][var6 + 1][var7];
                    int var11 = this.field1308[var5][var6 + 1][var7 + 1];
                    int var12 = this.field1308[var5][var6][var7 + 1];
                    LocType var13 = LocType.method275(var3.field657);
                    int var14 = -1;
                    if (var3.field659 != -1) {
                        var14 = var3.field658.field1025[var3.field659];
                    }
                    if (var3.field654 == 2) {
                        int var15 = this.field1504.method81(var5, var6, var7, var8);
                        int var16 = var15 & 31;
                        int var17 = var15 >> 6;
                        if (var16 == 11) {
                            var16 = 10;
                        }
                        Model var18 = var13.method278(var16, var17, var9, var10, var11, var12, var14);
                        this.field1504.method66(var5, var18, var6, var7, 969);
                    } else if (var3.field654 == 1) {
                        Model var19 = var13.method278(4, 0, var9, var10, var11, var12, var14);
                        this.field1504.method68(var6, -18674, var19, var7, var5);
                    } else if (var3.field654 == 0) {
                        int var20 = this.field1504.method81(var5, var6, var7, var8);
                        int var21 = var20 & 31;
                        int var22 = var20 >> 6;
                        if (var21 == 2) {
                            int var23 = var22 + 1 & 3;
                            Model var24 = var13.method278(2, var22 + 4, var9, var10, var11, var12, var14);
                            Model var25 = var13.method278(2, var23, var9, var10, var11, var12, var14);
                            this.field1504.method71(var6, var7, var24, -25867, var5, var25);
                        } else {
                            Model var26 = var13.method278(var21, var22, var9, var10, var11, var12, var14);
                            this.field1504.method70(7, var7, var6, var26, var5);
                        }
                    } else if (var3.field654 == 3) {
                        int var27 = this.field1504.method81(var5, var6, var7, var8);
                        int var28 = var27 >> 6;
                        Model var29 = var13.method278(22, var28, var9, var10, var11, var12, var14);
                        this.field1504.method69(var7, var6, var5, var29, true);
                    }
                } else {
                    var3.method107();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIBII)V")
    public final void method451(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        int var8 = 2048 - arg3 & 2047;
        int var9 = 2048 - arg5 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg2;
        if (var8 != 0) {
            int var13 = Model.field524[var8];
            int var14 = Model.field525[var8];
            int var15 = var11 * var14 - arg2 * var13 >> 16;
            var12 = var11 * var13 + arg2 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field524[var9];
            int var17 = Model.field525[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1381 = arg1 - var10;
        this.field1382 = arg6 - var11;
        if (arg4 != 34) {
            this.field1454 = this.field1479.method246();
        }
        this.field1383 = arg0 - var12;
        this.field1384 = arg3;
        this.field1385 = arg5;
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method452(byte arg0) {
        for (int var2 = -1; var2 < this.field1202; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1200;
            } else {
                var6 = this.field1203[var2];
            }
            PlayerEntity var7 = this.field1201[var6];
            if (var7 != null && var7.field318 > 0) {
                --var7.field318;
                if (var7.field318 == 0) {
                    var7.field317 = null;
                }
            }
        }
        if (this.field1422 != arg0) {
            this.method6();
        }
        for (int var3 = 0; var3 < this.field1297; ++var3) {
            int var4 = this.field1298[var3];
            NpcEntity var5 = this.field1296[var4];
            if (var5 != null && var5.field318 > 0) {
                --var5.field318;
                if (var5.field318 == 0) {
                    var5.field317 = null;
                }
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;IZ)V")
    private final void method453(Packet arg0, int arg1, boolean arg2) {
        while (true) {
            if (arg0.field622 + 10 < arg1 * 8) {
                int var4 = arg0.method220(11, 0);
                if (var4 != 2047) {
                    if (this.field1201[var4] == null) {
                        this.field1201[var4] = new PlayerEntity();
                        if (this.field1206[var4] != null) {
                            this.field1201[var4].method113((byte) 4, this.field1206[var4]);
                        }
                    }
                    this.field1203[this.field1202++] = var4;
                    PlayerEntity var5 = this.field1201[var4];
                    var5.field349 = field1311;
                    int var6 = arg0.method220(5, 0);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg0.method220(5, 0);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg0.method220(1, 0);
                    var5.method109(this.field1185.field354[0] + var7, var8 == 1, this.field1185.field353[0] + var6, false);
                    int var9 = arg0.method220(1, 0);
                    if (var9 == 1) {
                        this.field1205[this.field1204++] = var4;
                    }
                    continue;
                }
            }
            arg0.method221(-614);
            if (arg2) {
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIZIIIII)Z")
    public final boolean method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field1237[var15][var35] = 0;
                this.field1235[var15][var35] = 99999999;
            }
        }
        int var16 = arg8;
        int var17 = arg0;
        this.field1237[arg8][arg0] = 99;
        if (arg2 != 1) {
            this.field1111 = !this.field1111;
        }
        this.field1235[arg8][arg0] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field1284[var18] = arg8;
        int var36 = var18 + 1;
        this.field1285[var18] = arg0;
        boolean var20 = false;
        int var21 = this.field1284.length;
        int[][] var22 = this.field1494[this.field1170].field929;
        while (var36 != var19) {
            var16 = this.field1284[var19];
            var17 = this.field1285[var19];
            var19 = (var19 + 1) % var21;
            if (arg4 == var16 && arg5 == var17) {
                var20 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && this.field1494[this.field1170].method304(arg5, var16, (byte) 7, arg4, arg7, arg3 - 1, var17)) {
                    var20 = true;
                    break;
                }
                if (arg3 < 10 && this.field1494[this.field1170].method305(arg4, var16, 0, arg7, arg5, var17, arg3 - 1)) {
                    var20 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg11 != 0 && this.field1494[this.field1170].method306(arg9, arg4, arg11, arg5, var17, var16, arg1, 406)) {
                var20 = true;
                break;
            }
            int var34 = this.field1235[var16][var17] + 1;
            if (var16 > 0 && this.field1237[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 2621704) == 0) {
                this.field1284[var36] = var16 - 1;
                this.field1285[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1237[var16 - 1][var17] = 2;
                this.field1235[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field1237[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 2621824) == 0) {
                this.field1284[var36] = var16 + 1;
                this.field1285[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field1237[var16 + 1][var17] = 8;
                this.field1235[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field1237[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1284[var36] = var16;
                this.field1285[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1237[var16][var17 - 1] = 1;
                this.field1235[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field1237[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1284[var36] = var16;
                this.field1285[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1237[var16][var17 + 1] = 4;
                this.field1235[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field1237[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 2621710) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1284[var36] = var16 - 1;
                this.field1285[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1237[var16 - 1][var17 - 1] = 3;
                this.field1235[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field1237[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 2621827) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 - 1] & 2621698) == 0) {
                this.field1284[var36] = var16 + 1;
                this.field1285[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field1237[var16 + 1][var17 - 1] = 9;
                this.field1235[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field1237[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 2621752) == 0 && (var22[var16 - 1][var17] & 2621704) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1284[var36] = var16 - 1;
                this.field1285[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1237[var16 - 1][var17 + 1] = 6;
                this.field1235[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field1237[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 2621920) == 0 && (var22[var16 + 1][var17] & 2621824) == 0 && (var22[var16][var17 + 1] & 2621728) == 0) {
                this.field1284[var36] = var16 + 1;
                this.field1285[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field1237[var16 + 1][var17 + 1] = 12;
                this.field1235[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field1375 = 0;
        if (!var20) {
            if (arg6) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg4 - var24; var25 <= arg4 + var24; ++var25) {
                        for (int var26 = arg5 - var24; var26 <= arg5 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field1235[var25][var26] < var23) {
                                var23 = this.field1235[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field1375 = 1;
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
        this.field1284[var27] = var16;
        int var37 = var27 + 1;
        this.field1285[var27] = var17;
        int var28;
        int var29 = var28 = this.field1237[var16][var17];
        while (arg8 != var16 || arg0 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field1284[var37] = var16;
                this.field1285[var37++] = var17;
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
            var29 = this.field1237[var16][var17];
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
            int var31 = this.field1284[var37];
            int var32 = this.field1285[var37];
            field1104 += var30;
            if (field1104 >= 121) {
                this.field1355.method198(0, 215);
                this.field1355.method200(19217);
            }
            if (arg10 == 0) {
                this.field1355.method198(0, 74);
                this.field1355.method199(var30 + var30 + 3);
            }
            if (arg10 == 1) {
                this.field1355.method198(0, 37);
                this.field1355.method199(var30 + var30 + 3 + 14);
            }
            if (arg10 == 2) {
                this.field1355.method198(0, 73);
                this.field1355.method199(var30 + var30 + 3);
            }
            if (super.field30[5] == 1) {
                this.field1355.method199(1);
            } else {
                this.field1355.method199(0);
            }
            this.field1355.method200(this.field1430 + var31);
            this.field1355.method200(this.field1431 + var32);
            this.field1154 = this.field1284[0];
            this.field1155 = this.field1285[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field1355.method199(this.field1284[var37] - var31);
                this.field1355.method199(this.field1285[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method455(int arg0) {
        if (this.field1175 == null) {
            this.method472((byte) 9);
            super.field19 = null;
            this.field1321 = null;
            this.field1322 = null;
            this.field1323 = null;
            this.field1324 = null;
            this.field1325 = null;
            this.field1326 = null;
            if (arg0 >= 0) {
                field1316 = 11;
            }
            this.field1327 = null;
            this.field1328 = null;
            this.field1329 = null;
            this.field1175 = new PixMap((byte) -121, 96, this.method11(field1316), 479);
            this.field1173 = new PixMap((byte) -121, 160, this.method11(field1316), 168);
            Pix2D.method148(14799);
            this.field1499.method186(-790, 0, 0);
            this.field1172 = new PixMap((byte) -121, 261, this.method11(field1316), 190);
            this.field1174 = new PixMap((byte) -121, 334, this.method11(field1316), 512);
            Pix2D.method148(14799);
            this.field1262 = new PixMap((byte) -121, 61, this.method11(field1316), 501);
            this.field1263 = new PixMap((byte) -121, 40, this.method11(field1316), 288);
            this.field1264 = new PixMap((byte) -121, 66, this.method11(field1316), 269);
            this.field1405 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method456(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field1345 = "";
                this.field1346 = "Connecting to server...";
                this.method392(false);
            }
            this.field1374 = new ClientStream(this, (byte) 124, this.method370(field1113 + 43594));
            this.field1374.method32(this.field1335.field620, 0, 8);
            this.field1335.field621 = 0;
            this.field1187 = this.field1335.method215((byte) -79);
            int[] var4 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1187 >> 32), (int) this.field1187 };
            this.field1355.field621 = 0;
            this.field1355.method199(10);
            this.field1355.method203(var4[0]);
            this.field1355.method203(var4[1]);
            this.field1355.method203(var4[2]);
            this.field1355.method203(var4[3]);
            this.field1355.method203(signlink.uid);
            this.field1355.method206(arg0);
            this.field1355.method206(arg1);
            this.field1355.method224(this.field1164, field1372, field1331);
            this.field1159.field621 = 0;
            if (arg2) {
                this.field1159.method199(18);
            } else {
                this.field1159.method199(16);
            }
            this.field1159.method199(this.field1355.field621 + 36 + 1 + 1);
            this.field1159.method199(219);
            this.field1159.method199(field1115 ? 1 : 0);
            for (int var5 = 0; var5 < 9; ++var5) {
                this.field1159.method203(this.field1489[var5]);
            }
            this.field1159.method207(this.field1355.field621, this.field1355.field620, this.field1134, 0);
            this.field1355.field625 = new Isaac(var4, 0);
            for (int var6 = 0; var6 < 4; ++var6) {
                var4[var6] += 50;
            }
            this.field1479 = new Isaac(var4, 0);
            this.field1374.method33((byte) 1, 0, this.field1159.field620, this.field1159.field621);
            int var7 = this.field1374.method30();
            if (var7 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var15) {
                }
                this.method456(arg0, arg1, arg2);
                return;
            }
            if (var7 == 2 || var7 == 18) {
                if (var7 == 18) {
                    this.field1313 = true;
                } else {
                    this.field1313 = false;
                }
                InputTracking.method35(false, true);
                this.field1105 = true;
                this.field1355.field621 = 0;
                this.field1335.field621 = 0;
                this.field1409 = -1;
                this.field1256 = -1;
                this.field1257 = -1;
                this.field1258 = -1;
                this.field1408 = 0;
                this.field1410 = 0;
                this.field1513 = 0;
                this.field1412 = 0;
                this.field1380 = 0;
                this.field1343 = 0;
                this.field1246 = false;
                super.field23 = 0;
                for (int var8 = 0; var8 < 100; ++var8) {
                    this.field1178[var8] = null;
                }
                this.field1289 = 0;
                this.field1468 = 0;
                this.field1488 = 0;
                this.field1520 = 0;
                this.field1239 = (int) (Math.random() * 100.0D) - 50;
                this.field1232 = (int) (Math.random() * 110.0D) - 55;
                this.field1243 = (int) (Math.random() * 80.0D) - 40;
                this.field1109 = (int) (Math.random() * 120.0D) - 60;
                this.field1347 = (int) (Math.random() * 30.0D) - 20;
                this.field1182 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field1300 = -1;
                this.field1154 = 0;
                this.field1155 = 0;
                this.field1202 = 0;
                this.field1297 = 0;
                for (int var9 = 0; var9 < this.field1199; ++var9) {
                    this.field1201[var9] = null;
                    this.field1206[var9] = null;
                }
                for (int var10 = 0; var10 < 8192; ++var10) {
                    this.field1296[var10] = null;
                }
                this.field1185 = this.field1201[this.field1200] = new PlayerEntity();
                this.field1336.method232();
                this.field1106.method232();
                this.field1353.method232();
                for (int var11 = 0; var11 < 4; ++var11) {
                    for (int var12 = 0; var12 < 104; ++var12) {
                        for (int var13 = 0; var13 < 104; ++var13) {
                            this.field1278[var11][var12][var13] = null;
                        }
                    }
                }
                this.field1087 = new LinkList(2);
                this.field1096 = 0;
                this.field1234 = -1;
                this.field1415 = -1;
                this.field1413 = -1;
                this.field1416 = -1;
                this.field1373 = false;
                this.field1490 = 3;
                this.field1302 = false;
                this.field1246 = false;
                this.field1356 = false;
                this.field1307 = null;
                this.field1186 = 0;
                this.field1439 = -1;
                this.field1231 = true;
                this.method432((byte) 7);
                for (int var14 = 0; var14 < 5; ++var14) {
                    this.field1137[var14] = 0;
                }
                field1095 = 0;
                field1315 = 0;
                field1369 = 0;
                field1104 = 0;
                field1493 = 0;
                field1224 = 0;
                field1333 = 0;
                field1491 = 0;
                field1337 = 0;
                field1277 = 0;
                this.method455(-763);
                return;
            }
            if (var7 == 3) {
                this.field1345 = "";
                this.field1346 = "Invalid username or password.";
                return;
            }
            if (var7 == 4) {
                this.field1345 = "Your account has been disabled.";
                this.field1346 = "Please check your message-centre for details.";
                return;
            }
            if (var7 == 5) {
                this.field1345 = "Your account is already logged in.";
                this.field1346 = "Try again in 60 secs...";
                return;
            }
            if (var7 == 6) {
                this.field1345 = "RuneScape has been updated!";
                this.field1346 = "Please reload this page.";
                return;
            }
            if (var7 == 7) {
                this.field1345 = "This world is full.";
                this.field1346 = "Please use a different world.";
                return;
            }
            if (var7 == 8) {
                this.field1345 = "Unable to connect.";
                this.field1346 = "Login server offline.";
                return;
            }
            if (var7 == 9) {
                this.field1345 = "Login limit exceeded.";
                this.field1346 = "Too many connections from your address.";
                return;
            }
            if (var7 == 10) {
                this.field1345 = "Unable to connect.";
                this.field1346 = "Bad session id.";
                return;
            }
            if (var7 == 11) {
                this.field1346 = "Login server rejected session.";
                this.field1346 = "Please try again.";
                return;
            }
            if (var7 == 12) {
                this.field1345 = "You need a members account to login to this world.";
                this.field1346 = "Please subscribe, or use a different world.";
                return;
            }
            if (var7 == 13) {
                this.field1345 = "Could not complete login.";
                this.field1346 = "Please try using a different world.";
                return;
            }
            if (var7 == 14) {
                this.field1345 = "The server is being updated.";
                this.field1346 = "Please wait 1 minute and try again.";
                return;
            }
            if (var7 == 15) {
                this.field1105 = true;
                this.field1355.field621 = 0;
                this.field1335.field621 = 0;
                this.field1409 = -1;
                this.field1256 = -1;
                this.field1257 = -1;
                this.field1258 = -1;
                this.field1408 = 0;
                this.field1410 = 0;
                this.field1513 = 0;
                this.field1343 = 0;
                this.field1246 = false;
                return;
            }
            if (var7 == 16) {
                this.field1345 = "Login attempts exceeded.";
                this.field1346 = "Please wait 1 minute and try again.";
                return;
            }
            if (var7 == 17) {
                this.field1345 = "You are standing in a members-only area.";
                this.field1346 = "To play on this world move to a free area first";
                return;
            }
        } catch (IOException var16) {
            this.field1345 = "";
            this.field1346 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method457(byte arg0) {
        this.field1173.method235((byte) 120);
        int var2 = this.field1182 + this.field1109 & 2047;
        int var3 = this.field1185.field305 / 32 + 48;
        int var4 = 464 - this.field1185.field306 / 32;
        this.field1156.method179(var3, 146, 21, var4, 0, var2, this.field1347 + 256, 9, this.field1267, this.field1503, 151);
        this.field1140.method179(25, 33, 0, 25, 0, this.field1182, 256, 0, this.field1525, this.field1351, 33);
        for (int var5 = 0; var5 < this.field1279; ++var5) {
            int var25 = this.field1280[var5] * 4 + 2 - this.field1185.field305 / 32;
            int var26 = this.field1281[var5] * 4 + 2 - this.field1185.field306 / 32;
            this.method379(var25, this.field1495[var5], var26, true);
        }
        for (int var6 = 0; var6 < 104; ++var6) {
            for (int var21 = 0; var21 < 104; ++var21) {
                LinkList var22 = this.field1278[this.field1170][var6][var21];
                if (var22 != null) {
                    int var23 = var6 * 4 + 2 - this.field1185.field305 / 32;
                    int var24 = var21 * 4 + 2 - this.field1185.field306 / 32;
                    this.method379(var23, this.field1193, var24, true);
                }
            }
        }
        for (int var7 = 0; var7 < this.field1297; ++var7) {
            NpcEntity var18 = this.field1296[this.field1298[var7]];
            if (var18 != null && var18.method111(true) && var18.field358.field865) {
                int var19 = var18.field305 / 32 - this.field1185.field305 / 32;
                int var20 = var18.field306 / 32 - this.field1185.field306 / 32;
                this.method379(var19, this.field1194, var20, true);
            }
        }
        for (int var8 = 0; var8 < this.field1202; ++var8) {
            PlayerEntity var11 = this.field1201[this.field1203[var8]];
            if (var11 != null && var11.method111(true)) {
                int var12 = var11.field305 / 32 - this.field1185.field305 / 32;
                int var13 = var11.field306 / 32 - this.field1185.field306 / 32;
                boolean var14 = false;
                long var15 = JString.method251(var11.field361);
                for (int var17 = 0; var17 < this.field1096; ++var17) {
                    if (this.field1445[var17] == var15 && this.field1332[var17] != 0) {
                        var14 = true;
                        break;
                    }
                }
                if (var14) {
                    this.method379(var12, this.field1196, var13, true);
                } else {
                    this.method379(var12, this.field1195, var13, true);
                }
            }
        }
        if (this.field1154 != 0) {
            int var9 = this.field1154 * 4 + 2 - this.field1185.field305 / 32;
            int var10 = this.field1155 * 4 + 2 - this.field1185.field306 / 32;
            this.method379(var9, this.field1423, var10, true);
        }
        Pix2D.method149(16777215, -288, 93, 82, 3, 3);
        this.field1174.method235((byte) 120);
        if (this.field1477 != arg0) {
            this.field1483 = 201;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZI[B)V")
    public final void method458(int arg0, boolean arg1, int arg2, byte[] arg3) {
        signlink.midifade = arg1 ? 1 : 0;
        signlink.midisave(arg3, arg0);
        if (arg2 < 2 || arg2 > 2) {
            this.field1409 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method459(int arg0, int arg1) {
        LinkList var3 = this.field1278[this.field1170][arg0][arg1];
        if (var3 == null) {
            this.field1504.method76(this.field1170, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method228(); var6 != null; var6 = (ObjStackEntity) var3.method230(0)) {
                ObjType var16 = ObjType.method287(var6.field302);
                int var17 = var16.field894;
                if (var16.field893) {
                    var17 = (var6.field303 + 1) * var17;
                }
                if (var17 > var4) {
                    var4 = var17;
                    var5 = var6;
                }
            }
            var3.method226(var5, 683);
            int var7 = -1;
            int var8 = -1;
            int var9 = 0;
            int var10 = 0;
            for (ObjStackEntity var11 = (ObjStackEntity) var3.method228(); var11 != null; var11 = (ObjStackEntity) var3.method230(0)) {
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
            this.field1504.method57(var14, arg0, var13, var12, var15.method291(var5.field303), this.field1170, this.field1118, arg1, this.method447(arg1 * 128 + 64, arg0 * 128 + 64, true, this.field1170));
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)I")
    public final int method460(boolean arg0) {
        if (!arg0) {
            this.field1312 = 486;
        }
        int var2 = 3;
        if (this.field1384 < 310) {
            int var3 = this.field1381 >> 7;
            int var4 = this.field1383 >> 7;
            int var5 = this.field1185.field305 >> 7;
            int var6 = this.field1185.field306 >> 7;
            if ((this.field1247[this.field1170][var3][var4] & 4) != 0) {
                var2 = this.field1170;
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
                    if ((this.field1247[this.field1170][var3][var4] & 4) != 0) {
                        var2 = this.field1170;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field1247[this.field1170][var3][var4] & 4) != 0) {
                            var2 = this.field1170;
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
                    if ((this.field1247[this.field1170][var3][var4] & 4) != 0) {
                        var2 = this.field1170;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field1247[this.field1170][var3][var4] & 4) != 0) {
                            var2 = this.field1170;
                        }
                    }
                }
            }
        }
        if ((this.field1247[this.field1170][this.field1185.field305 >> 7][this.field1185.field306 >> 7] & 4) != 0) {
            var2 = this.field1170;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)I")
    public final int method461(boolean arg0) {
        int var2 = this.method447(this.field1383, this.field1381, true, this.field1170);
        if (arg0) {
            this.field1409 = this.field1335.method209();
        }
        return var2 - this.field1382 < 800 && (this.field1247[this.field1170][this.field1381 >> 7][this.field1383 >> 7] & 4) != 0 ? this.field1170 : 3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method462(long arg0, boolean arg1) {
        this.field1105 &= arg1;
        if (arg0 != 0L) {
            if (this.field1514 >= 100) {
                this.method391("Your ignore list is full. Max of 100 hit", 0, false, "");
            } else {
                String var4 = JString.method255(-148, JString.method252(arg0, -38644));
                for (int var5 = 0; var5 < this.field1514; ++var5) {
                    if (this.field1094[var5] == arg0) {
                        this.method391(var4 + " is already on your ignore list", 0, false, "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field1096; ++var6) {
                    if (this.field1445[var6] == arg0) {
                        this.method391("Please remove " + var4 + " from your friend list first", 0, false, "");
                        return;
                    }
                }
                this.field1094[this.field1514++] = arg0;
                this.field1472 = true;
                this.field1355.method198(0, 175);
                this.field1355.method205(6, arg0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lkb;II)V")
    private final void method463(Packet arg0, int arg1, int arg2) {
        this.field1340 = 0;
        this.field1204 = 0;
        if (arg2 != 6) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        this.method407(arg1, arg0, -37941);
        this.method438(arg0, (byte) 6, arg1);
        this.method473(arg1, arg0, true);
        for (int var5 = 0; var5 < this.field1340; ++var5) {
            int var7 = this.field1341[var5];
            if (field1311 != this.field1296[var7].field349) {
                this.field1296[var7].field358 = null;
                this.field1296[var7] = null;
            }
        }
        if (arg0.field621 != arg1) {
            signlink.reporterror(this.field1474 + " size mismatch in getnpcpos - pos:" + arg0.field621 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field1297; ++var6) {
                if (this.field1296[this.field1298[var6]] == null) {
                    signlink.reporterror(this.field1474 + " null entry in npc list - pos:" + var6 + " size:" + this.field1297);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method464(String arg0, int arg1) {
        if (arg1 >= 0) {
            this.field1355.method199(173);
        }
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1096; ++var3) {
                if (arg0.equalsIgnoreCase(this.field1299[var3])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(this.field1185.field361);
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method465(int arg0) {
        if (arg0 != -49) {
            this.field1409 = -1;
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method5(0);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field1413 != -1 && this.field1448 == this.field1413) {
                        if (var2 == 8 && this.field1287.length() > 0) {
                            this.field1287 = this.field1287.substring(0, this.field1287.length() - 1);
                        }
                        break;
                    }
                    if (this.field1356) {
                        if (var2 >= 32 && var2 <= 122 && this.field1370.length() < 80) {
                            this.field1370 = this.field1370 + (char) var2;
                            this.field1342 = true;
                        }
                        if (var2 == 8 && this.field1370.length() > 0) {
                            this.field1370 = this.field1370.substring(0, this.field1370.length() - 1);
                            this.field1342 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field1356 = false;
                            this.field1342 = true;
                            if (this.field1254 == 1) {
                                long var3 = JString.method251(this.field1370);
                                this.method373((byte) -31, var3);
                            }
                            if (this.field1254 == 2 && this.field1096 > 0) {
                                long var5 = JString.method251(this.field1370);
                                this.method400(-160, var5);
                            }
                            if (this.field1254 == 3 && this.field1370.length() > 0) {
                                this.field1355.method198(0, 6);
                                this.field1355.method199(0);
                                int var7 = this.field1355.field621;
                                this.field1355.method205(6, this.field1217);
                                WordPack.method259(this.field1370, (byte) -82, this.field1355);
                                this.field1355.method208(this.field1355.field621 - var7, false);
                                this.field1370 = JString.method256(0, this.field1370);
                                this.field1370 = WordFilter.method335(this.field1370, 0);
                                this.method391(this.field1370, 6, false, JString.method255(-148, JString.method252(this.field1217, -38644)));
                                if (this.field1283 == 2) {
                                    this.field1283 = 1;
                                    this.field1238 = true;
                                    this.field1355.method198(0, 197);
                                    this.field1355.method199(this.field1509);
                                    this.field1355.method199(this.field1283);
                                    this.field1355.method199(this.field1242);
                                }
                            }
                            if (this.field1254 == 4 && this.field1514 < 100) {
                                long var8 = JString.method251(this.field1370);
                                this.method462(var8, true);
                            }
                            if (this.field1254 == 5 && this.field1514 > 0) {
                                long var10 = JString.method251(this.field1370);
                                this.method372(var10, -615);
                            }
                        }
                    } else if (this.field1302) {
                        if (var2 >= 48 && var2 <= 57 && this.field1241.length() < 10) {
                            this.field1241 = this.field1241 + (char) var2;
                            this.field1342 = true;
                        }
                        if (var2 == 8 && this.field1241.length() > 0) {
                            this.field1241 = this.field1241.substring(0, this.field1241.length() - 1);
                            this.field1342 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field1241.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field1241);
                                } catch (Exception var16) {
                                }
                                this.field1355.method198(0, 147);
                                this.field1355.method203(var12);
                            }
                            this.field1302 = false;
                            this.field1342 = true;
                        }
                    } else if (this.field1415 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field1461.length() < 80) {
                            this.field1461 = this.field1461 + (char) var2;
                            this.field1342 = true;
                        }
                        if (var2 == 8 && this.field1461.length() > 0) {
                            this.field1461 = this.field1461.substring(0, this.field1461.length() - 1);
                            this.field1342 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field1461.length() > 0) {
                            if (this.field1461.equals("::clientdrop") && (super.field21 != null || this.method410(false).indexOf("192.168.1.") != -1)) {
                                this.method371(928);
                            } else if (this.field1461.startsWith("::")) {
                                this.field1355.method198(0, 251);
                                this.field1355.method199(this.field1461.length() - 1);
                                this.field1355.method206(this.field1461.substring(2));
                            } else {
                                byte var13 = 0;
                                if (this.field1461.startsWith("yellow:")) {
                                    var13 = 0;
                                    this.field1461 = this.field1461.substring(7);
                                }
                                if (this.field1461.startsWith("red:")) {
                                    var13 = 1;
                                    this.field1461 = this.field1461.substring(4);
                                }
                                if (this.field1461.startsWith("green:")) {
                                    var13 = 2;
                                    this.field1461 = this.field1461.substring(6);
                                }
                                if (this.field1461.startsWith("cyan:")) {
                                    var13 = 3;
                                    this.field1461 = this.field1461.substring(5);
                                }
                                if (this.field1461.startsWith("purple:")) {
                                    var13 = 4;
                                    this.field1461 = this.field1461.substring(7);
                                }
                                if (this.field1461.startsWith("white:")) {
                                    var13 = 5;
                                    this.field1461 = this.field1461.substring(6);
                                }
                                if (this.field1461.startsWith("flash1:")) {
                                    var13 = 6;
                                    this.field1461 = this.field1461.substring(7);
                                }
                                if (this.field1461.startsWith("flash2:")) {
                                    var13 = 7;
                                    this.field1461 = this.field1461.substring(7);
                                }
                                if (this.field1461.startsWith("flash3:")) {
                                    var13 = 8;
                                    this.field1461 = this.field1461.substring(7);
                                }
                                if (this.field1461.startsWith("glow1:")) {
                                    var13 = 9;
                                    this.field1461 = this.field1461.substring(6);
                                }
                                if (this.field1461.startsWith("glow2:")) {
                                    var13 = 10;
                                    this.field1461 = this.field1461.substring(6);
                                }
                                if (this.field1461.startsWith("glow3:")) {
                                    var13 = 11;
                                    this.field1461 = this.field1461.substring(6);
                                }
                                byte var14 = 0;
                                if (this.field1461.startsWith("wave:")) {
                                    var14 = 1;
                                    this.field1461 = this.field1461.substring(5);
                                }
                                if (this.field1461.startsWith("scroll:")) {
                                    var14 = 2;
                                    this.field1461 = this.field1461.substring(7);
                                }
                                this.field1355.method198(0, 42);
                                this.field1355.method199(0);
                                int var15 = this.field1355.field621;
                                this.field1355.method199(var13);
                                this.field1355.method199(var14);
                                WordPack.method259(this.field1461, (byte) -82, this.field1355);
                                this.field1355.method208(this.field1355.field621 - var15, false);
                                this.field1461 = JString.method256(0, this.field1461);
                                this.field1461 = WordFilter.method335(this.field1461, 0);
                                this.field1185.field317 = this.field1461;
                                this.field1185.field319 = var13;
                                this.field1185.field320 = var14;
                                this.field1185.field318 = 150;
                                this.method391(this.field1185.field317, 2, false, this.field1185.field361);
                                if (this.field1509 == 2) {
                                    this.field1509 = 3;
                                    this.field1238 = true;
                                    this.field1355.method198(0, 197);
                                    this.field1355.method199(this.field1509);
                                    this.field1355.method199(this.field1283);
                                    this.field1355.method199(this.field1242);
                                }
                            }
                            this.field1461 = "";
                            this.field1342 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field1287.length() < 12) {
                this.field1287 = this.field1287 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method466(int arg0) {
        if (arg0 <= 0) {
            this.field1310 = 374;
        }
        if (super.field27 == 1) {
            if (super.field28 >= 549 && super.field28 <= 583 && super.field29 >= 195 && super.field29 < 231 && this.field1367[0] != -1) {
                this.field1472 = true;
                this.field1490 = 0;
                this.field1214 = true;
            }
            if (super.field28 >= 579 && super.field28 <= 609 && super.field29 >= 194 && super.field29 < 231 && this.field1367[1] != -1) {
                this.field1472 = true;
                this.field1490 = 1;
                this.field1214 = true;
            }
            if (super.field28 >= 607 && super.field28 <= 637 && super.field29 >= 194 && super.field29 < 231 && this.field1367[2] != -1) {
                this.field1472 = true;
                this.field1490 = 2;
                this.field1214 = true;
            }
            if (super.field28 >= 635 && super.field28 <= 679 && super.field29 >= 194 && super.field29 < 229 && this.field1367[3] != -1) {
                this.field1472 = true;
                this.field1490 = 3;
                this.field1214 = true;
            }
            if (super.field28 >= 676 && super.field28 <= 706 && super.field29 >= 194 && super.field29 < 231 && this.field1367[4] != -1) {
                this.field1472 = true;
                this.field1490 = 4;
                this.field1214 = true;
            }
            if (super.field28 >= 704 && super.field28 <= 734 && super.field29 >= 194 && super.field29 < 231 && this.field1367[5] != -1) {
                this.field1472 = true;
                this.field1490 = 5;
                this.field1214 = true;
            }
            if (super.field28 >= 732 && super.field28 <= 766 && super.field29 >= 195 && super.field29 < 231 && this.field1367[6] != -1) {
                this.field1472 = true;
                this.field1490 = 6;
                this.field1214 = true;
            }
            if (super.field28 >= 550 && super.field28 <= 584 && super.field29 >= 492 && super.field29 < 528 && this.field1367[7] != -1) {
                this.field1472 = true;
                this.field1490 = 7;
                this.field1214 = true;
            }
            if (super.field28 >= 582 && super.field28 <= 612 && super.field29 >= 492 && super.field29 < 529 && this.field1367[8] != -1) {
                this.field1472 = true;
                this.field1490 = 8;
                this.field1214 = true;
            }
            if (super.field28 >= 609 && super.field28 <= 639 && super.field29 >= 492 && super.field29 < 529 && this.field1367[9] != -1) {
                this.field1472 = true;
                this.field1490 = 9;
                this.field1214 = true;
            }
            if (super.field28 >= 637 && super.field28 <= 681 && super.field29 >= 493 && super.field29 < 528 && this.field1367[10] != -1) {
                this.field1472 = true;
                this.field1490 = 10;
                this.field1214 = true;
            }
            if (super.field28 >= 679 && super.field28 <= 709 && super.field29 >= 492 && super.field29 < 529 && this.field1367[11] != -1) {
                this.field1472 = true;
                this.field1490 = 11;
                this.field1214 = true;
            }
            if (super.field28 >= 706 && super.field28 <= 736 && super.field29 >= 492 && super.field29 < 529 && this.field1367[12] != -1) {
                this.field1472 = true;
                this.field1490 = 12;
                this.field1214 = true;
            }
            if (super.field28 >= 734 && super.field28 <= 768 && super.field29 >= 492 && super.field29 < 528 && this.field1367[13] != -1) {
                this.field1472 = true;
                this.field1490 = 13;
                this.field1214 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method467(boolean arg0) {
        if (this.field1380 == 2) {
            this.method428((this.field1435 - this.field1431 << 7) + this.field1438, (this.field1434 - this.field1430 << 7) + this.field1437, this.field1436 * 2, 23177);
            if (!arg0) {
                this.field1312 = this.field1479.method246();
            }
            if (this.field1228 > -1 && field1311 % 20 < 10) {
                this.field1378[2].method173(-790, this.field1228 - 12, this.field1229 - 28);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I[BI)Z")
    public final boolean method468(int arg0, byte[] arg1, int arg2) {
        if (arg0 < 0 || arg0 > 0) {
            this.field1139 = !this.field1139;
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg2);
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)Z")
    public final boolean method469(boolean arg0) {
        if (arg0) {
            this.field1409 = this.field1335.method209();
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method470(int arg0, int arg1) {
        signlink.wavevol = arg0;
        if (this.field1511 != arg1) {
            this.field1409 = this.field1335.method209();
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method471(int arg0) {
        try {
            this.field1300 = -1;
            this.field1353.method232();
            this.field1197.method232();
            this.field1106.method232();
            this.field1336.method232();
            Pix3D.method156(false);
            this.method449(false);
            this.field1504.method50(-169);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1494[var2].method295(true);
            }
            System.gc();
            World var3 = new World(104, this.field1308, 0, 104, this.field1247);
            byte[] var4 = new byte[100000];
            int var5 = this.field1501.length;
            World.field41 = World3D.field223;
            for (int var6 = 0; var6 < var5; ++var6) {
                int var7 = this.field1392[var6] >> 8;
                int var8 = this.field1392[var6] & 255;
                if (var7 == 33 && var8 >= 71 && var8 <= 73) {
                    World.field41 = false;
                }
            }
            if (World.field41) {
                this.field1504.method51(this.field1170, 5);
            } else {
                this.field1504.method51(0, 5);
            }
            this.field1355.method198(0, 126);
            for (int var9 = 0; var9 < var5; ++var9) {
                int var10 = (this.field1392[var9] >> 8) * 64 - this.field1430;
                int var11 = (this.field1392[var9] & 255) * 64 - this.field1431;
                byte[] var12 = this.field1501[var9];
                if (var12 != null) {
                    int var13 = (new Packet(0, var12)).method214();
                    BZip2.method238(var4, var13, var12, var12.length - 4, 4);
                    var3.method15(-503, var4, (this.field1227 - 6) * 8, var10, (this.field1226 - 6) * 8, var11);
                } else if (this.field1227 < 800) {
                    var3.method14(-41617, var11, var10, 64, 64);
                }
            }
            this.field1355.method198(0, 126);
            for (int var14 = 0; var14 < var5; ++var14) {
                byte[] var15 = this.field1459[var14];
                if (var15 != null) {
                    int var16 = (new Packet(0, var15)).method214();
                    BZip2.method238(var4, var16, var15, var15.length - 4, 4);
                    int var17 = (this.field1392[var14] >> 8) * 64 - this.field1430;
                    int var18 = (this.field1392[var14] & 255) * 64 - this.field1431;
                    var3.method16(var17, var4, this.field1197, this.field1494, var18, -31192, this.field1504);
                }
            }
            this.field1355.method198(0, 126);
            var3.method18(this.field1504, (byte) 8, this.field1494);
            this.field1174.method235((byte) 120);
            this.field1355.method198(0, 126);
            for (LocEntity var19 = (LocEntity) this.field1197.method228(); var19 != null; var19 = (LocEntity) this.field1197.method230(0)) {
                if ((this.field1247[1][var19.field655][var19.field656] & 2) == 2) {
                    --var19.field653;
                    if (var19.field653 < 0) {
                        var19.method107();
                    }
                }
            }
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method459(var20, var21);
                }
            }
            for (LocMerged var22 = (LocMerged) this.field1087.method228(); var22 != null; var22 = (LocMerged) this.field1087.method230(0)) {
                this.method445(var22.field634, 36300, var22.field638, var22.field639, var22.field636, var22.field635, var22.field633, var22.field637);
            }
        } catch (Exception var25) {
        }
        LocType.field839.method104();
        System.gc();
        int var24 = 2 / arg0;
        Pix3D.method157(15, 20);
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method472(byte arg0) {
        this.field1251 = false;
        while (this.field1349) {
            this.field1251 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1260 = null;
        this.field1261 = null;
        this.field1309 = null;
        this.field1484 = null;
        if (arg0 == 9) {
            this.field1485 = null;
            this.field1486 = null;
            this.field1487 = null;
            this.field1248 = null;
            this.field1249 = null;
            this.field1399 = null;
            this.field1400 = null;
            this.field1097 = null;
            this.field1098 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        if (signlink.sunjava) {
            super.field13 = 5;
        }
        if (!field1115) {
            this.field1089 = true;
            this.field1320 = true;
            this.method12(this, 2);
            this.method406(40000, 12345678, "scape_main", 801);
        }
        if (field1245) {
            this.field1473 = true;
        } else {
            field1245 = true;
            boolean var1 = false;
            String var2 = this.method410(false);
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
                this.field1518 = true;
            } else {
                try {
                    int var3 = 5;
                    this.field1489[8] = 0;
                    while (this.field1489[8] == 0) {
                        this.method13(10, 0, "Connecting to fileserver");
                        try {
                            DataInputStream var4 = this.method477("crc" + (int) (Math.random() * 9.9999999E7D));
                            Packet var5 = new Packet(0, new byte[36]);
                            var4.readFully(var5.field620, 0, 36);
                            for (int var6 = 0; var6 < 9; ++var6) {
                                this.field1489[var6] = var5.method214();
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
                    this.field1441 = this.method439(field1136, "title screen", 10, this.field1489[1], "title");
                    this.field1449 = new PixFont("p11", -10272, this.field1441);
                    this.field1450 = new PixFont("p12", -10272, this.field1441);
                    this.field1451 = new PixFont("b12", -10272, this.field1441);
                    this.field1452 = new PixFont("q8", -10272, this.field1441);
                    this.method366((byte) 9);
                    this.method476(field1157);
                    Jagfile var8 = this.method439(field1136, "config", 15, this.field1489[2], "config");
                    Jagfile var9 = this.method439(field1136, "interface", 20, this.field1489[3], "interface");
                    Jagfile var10 = this.method439(field1136, "2d graphics", 30, this.field1489[4], "media");
                    Jagfile var11 = this.method439(field1136, "3d graphics", 40, this.field1489[5], "models");
                    Jagfile var12 = this.method439(field1136, "textures", 60, this.field1489[6], "textures");
                    Jagfile var13 = this.method439(field1136, "chat system", 65, this.field1489[7], "wordenc");
                    Jagfile var14 = this.method439(field1136, "sound effects", 70, this.field1489[8], "sounds");
                    this.field1247 = new byte[4][104][104];
                    this.field1308 = new int[4][105][105];
                    this.field1504 = new World3D(this.field1308, false, 4, 104, 104);
                    for (int var15 = 0; var15 < 4; ++var15) {
                        this.field1494[var15] = new CollisionMap(104, 104, 8);
                    }
                    this.field1156 = new Pix32(512, 512);
                    this.method13(75, 0, "Unpacking media");
                    this.field1498 = new Pix8(var10, "invback", 0);
                    this.field1500 = new Pix8(var10, "chatback", 0);
                    this.field1499 = new Pix8(var10, "mapback", 0);
                    this.field1463 = new Pix8(var10, "backbase1", 0);
                    this.field1464 = new Pix8(var10, "backbase2", 0);
                    this.field1465 = new Pix8(var10, "backhmid1", 0);
                    for (int var16 = 0; var16 < 13; ++var16) {
                        this.field1162[var16] = new Pix8(var10, "sideicons", var16);
                    }
                    this.field1140 = new Pix32(var10, "compass", 0);
                    try {
                        for (int var17 = 0; var17 < 50; ++var17) {
                            this.field1108[var17] = new Pix8(var10, "mapscene", var17);
                        }
                    } catch (Exception var53) {
                    }
                    try {
                        for (int var18 = 0; var18 < 50; ++var18) {
                            this.field1253[var18] = new Pix32(var10, "mapfunction", var18);
                        }
                    } catch (Exception var52) {
                    }
                    try {
                        for (int var19 = 0; var19 < 20; ++var19) {
                            this.field1458[var19] = new Pix32(var10, "hitmarks", var19);
                        }
                    } catch (Exception var51) {
                    }
                    try {
                        for (int var20 = 0; var20 < 20; ++var20) {
                            this.field1378[var20] = new Pix32(var10, "headicons", var20);
                        }
                    } catch (Exception var50) {
                    }
                    this.field1423 = new Pix32(var10, "mapflag", 0);
                    for (int var21 = 0; var21 < 8; ++var21) {
                        this.field1517[var21] = new Pix32(var10, "cross", var21);
                    }
                    this.field1193 = new Pix32(var10, "mapdots", 0);
                    this.field1194 = new Pix32(var10, "mapdots", 1);
                    this.field1195 = new Pix32(var10, "mapdots", 2);
                    this.field1196 = new Pix32(var10, "mapdots", 3);
                    this.field1151 = new Pix8(var10, "scrollbar", 0);
                    this.field1152 = new Pix8(var10, "scrollbar", 1);
                    this.field1417 = new Pix8(var10, "redstone1", 0);
                    this.field1418 = new Pix8(var10, "redstone2", 0);
                    this.field1419 = new Pix8(var10, "redstone3", 0);
                    this.field1420 = new Pix8(var10, "redstone1", 0);
                    this.field1420.method184(false);
                    this.field1421 = new Pix8(var10, "redstone2", 0);
                    this.field1421.method184(false);
                    this.field1120 = new Pix8(var10, "redstone1", 0);
                    this.field1120.method185((byte) 92);
                    this.field1121 = new Pix8(var10, "redstone2", 0);
                    this.field1121.method185((byte) 92);
                    this.field1122 = new Pix8(var10, "redstone3", 0);
                    this.field1122.method185((byte) 92);
                    this.field1123 = new Pix8(var10, "redstone1", 0);
                    this.field1123.method184(false);
                    this.field1123.method185((byte) 92);
                    this.field1124 = new Pix8(var10, "redstone2", 0);
                    this.field1124.method184(false);
                    this.field1124.method185((byte) 92);
                    Pix32 var22 = new Pix32(var10, "backleft1", 0);
                    this.field1357 = new PixMap((byte) -121, var22.field580, this.method11(field1316), var22.field579);
                    var22.method171(0, true, 0);
                    Pix32 var23 = new Pix32(var10, "backleft2", 0);
                    this.field1358 = new PixMap((byte) -121, var23.field580, this.method11(field1316), var23.field579);
                    var23.method171(0, true, 0);
                    Pix32 var24 = new Pix32(var10, "backright1", 0);
                    this.field1359 = new PixMap((byte) -121, var24.field580, this.method11(field1316), var24.field579);
                    var24.method171(0, true, 0);
                    Pix32 var25 = new Pix32(var10, "backright2", 0);
                    this.field1360 = new PixMap((byte) -121, var25.field580, this.method11(field1316), var25.field579);
                    var25.method171(0, true, 0);
                    Pix32 var26 = new Pix32(var10, "backtop1", 0);
                    this.field1361 = new PixMap((byte) -121, var26.field580, this.method11(field1316), var26.field579);
                    var26.method171(0, true, 0);
                    Pix32 var27 = new Pix32(var10, "backtop2", 0);
                    this.field1362 = new PixMap((byte) -121, var27.field580, this.method11(field1316), var27.field579);
                    var27.method171(0, true, 0);
                    Pix32 var28 = new Pix32(var10, "backvmid1", 0);
                    this.field1363 = new PixMap((byte) -121, var28.field580, this.method11(field1316), var28.field579);
                    var28.method171(0, true, 0);
                    Pix32 var29 = new Pix32(var10, "backvmid2", 0);
                    this.field1364 = new PixMap((byte) -121, var29.field580, this.method11(field1316), var29.field579);
                    var29.method171(0, true, 0);
                    Pix32 var30 = new Pix32(var10, "backvmid3", 0);
                    this.field1365 = new PixMap((byte) -121, var30.field580, this.method11(field1316), var30.field579);
                    var30.method171(0, true, 0);
                    Pix32 var31 = new Pix32(var10, "backhmid2", 0);
                    this.field1366 = new PixMap((byte) -121, var31.field580, this.method11(field1316), var31.field579);
                    var31.method171(0, true, 0);
                    this.method13(80, 0, "Unpacking textures");
                    Pix3D.method158(513, var12);
                    Pix3D.method162(0.8D, true);
                    Pix3D.method157(15, 20);
                    this.method13(83, 0, "Unpacking models");
                    Model.method121(335, var11);
                    AnimBase.method47(var11, 0);
                    AnimFrame.method48(var11, 0);
                    this.method13(86, 0, "Unpacking config");
                    SeqType.method318(var8, 3);
                    LocType.method273(var8);
                    FloType.method307(var8, 3);
                    ObjType.method285(var8);
                    NpcType.method279(var8);
                    IdkType.method310(var8, 3);
                    SpotAnimType.method320(var8, 3);
                    VarpType.method323(var8, 3);
                    ObjType.field878 = field1114;
                    if (!field1115) {
                        this.method13(90, 0, "Unpacking sounds");
                        byte[] var32 = var14.method250("sounds.dat", (byte[]) null, 8);
                        Packet var33 = new Packet(0, var32);
                        Wave.method263(var33, 3);
                    }
                    this.method13(92, 0, "Unpacking interfaces");
                    PixFont[] var34 = new PixFont[] { this.field1449, this.field1450, this.field1451, this.field1452 };
                    Component.method314(var34, var10, var9, (byte) 2);
                    this.method13(97, 0, "Preparing game engine");
                    for (int var35 = 0; var35 < 33; ++var35) {
                        int var36 = 999;
                        int var37 = 0;
                        for (int var38 = 0; var38 < 35; ++var38) {
                            if (this.field1499.field590[this.field1499.field592 * var35 + var38] == 0) {
                                if (var36 == 999) {
                                    var36 = var38;
                                }
                            } else if (var36 != 999) {
                                var37 = var38;
                                break;
                            }
                        }
                        this.field1351[var35] = var36;
                        this.field1525[var35] = var37 - var36;
                    }
                    for (int var39 = 9; var39 < 160; ++var39) {
                        int var40 = 999;
                        int var41 = 0;
                        for (int var42 = 10; var42 < 168; ++var42) {
                            if (this.field1499.field590[this.field1499.field592 * var39 + var42] != 0 || var42 <= 34 && var39 <= 34) {
                                if (var40 != 999) {
                                    var41 = var42;
                                    break;
                                }
                            } else if (var40 == 999) {
                                var40 = var42;
                            }
                        }
                        this.field1503[var39 - 9] = var40 - 21;
                        this.field1267[var39 - 9] = var41 - var40;
                    }
                    Pix3D.method155(96, 479, (byte) 52);
                    this.field1401 = Pix3D.field561;
                    Pix3D.method155(261, 190, (byte) 52);
                    this.field1402 = Pix3D.field561;
                    Pix3D.method155(334, 512, (byte) 52);
                    this.field1403 = Pix3D.field561;
                    int[] var43 = new int[9];
                    for (int var44 = 0; var44 < 9; ++var44) {
                        int var45 = var44 * 32 + 128 + 15;
                        int var46 = var45 * 3 + 600;
                        int var47 = Pix3D.field559[var45];
                        var43[var44] = var46 * var47 >> 16;
                    }
                    World3D.method87(334, 800, 512, -39672, 500, var43);
                    WordFilter.method325(var13);
                } catch (Exception var55) {
                    this.field1447 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILkb;Z)V")
    private final void method473(int arg0, Packet arg1, boolean arg2) {
        for (int var4 = 0; var4 < this.field1204; ++var4) {
            int var5 = this.field1205[var4];
            NpcEntity var6 = this.field1296[var5];
            int var7 = arg1.method209();
            if ((var7 & 2) == 2) {
                int var8 = arg1.method211();
                if (var8 == 65535) {
                    var8 = -1;
                }
                if (var6.field332 == var8) {
                    var6.field336 = 0;
                }
                int var9 = arg1.method209();
                if (var8 == -1 || var6.field332 == -1 || SeqType.field1023[var8].field1031 > SeqType.field1023[var6.field332].field1031 || SeqType.field1023[var6.field332].field1031 == 0) {
                    var6.field332 = var8;
                    var6.field333 = 0;
                    var6.field334 = 0;
                    var6.field335 = var9;
                    var6.field336 = 0;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field326 = arg1.method211();
                if (var6.field326 == 65535) {
                    var6.field326 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field317 = arg1.method216();
                var6.field318 = 100;
            }
            if ((var7 & 16) == 16) {
                var6.field321 = arg1.method209();
                var6.field322 = arg1.method209();
                var6.field323 = field1311 + 400;
                var6.field324 = arg1.method209();
                var6.field325 = arg1.method209();
            }
            if ((var7 & 32) == 32) {
                var6.field358 = NpcType.method281(arg1.method211());
                var6.field312 = var6.field358.field854;
                var6.field313 = var6.field358.field855;
                var6.field314 = var6.field358.field856;
                var6.field315 = var6.field358.field857;
                var6.field310 = var6.field358.field853;
            }
            if ((var7 & 64) == 64) {
                var6.field337 = arg1.method211();
                int var10 = arg1.method214();
                var6.field341 = var10 >> 16;
                var6.field340 = (var10 & 65535) + field1311;
                var6.field338 = 0;
                var6.field339 = 0;
                if (var6.field340 > field1311) {
                    var6.field338 = -1;
                }
                if (var6.field337 == 65535) {
                    var6.field337 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field327 = arg1.method211();
                var6.field328 = arg1.method211();
            }
        }
        this.field1105 &= arg2;
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public static final void method474(int arg0) {
        if (arg0 == 0) {
            World3D.field223 = true;
            Pix3D.field550 = true;
            field1115 = true;
            World.field41 = true;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method10(byte arg0) {
        if (this.field1456 != arg0) {
            this.field1355.method199(227);
        }
        this.field1405 = true;
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method475(int arg0) {
        if (this.field1513 > 1) {
            --this.field1513;
        }
        if (this.field1412 > 0) {
            --this.field1412;
        }
        for (int var2 = 0; var2 < 5 && this.method435(47042); ++var2) {
        }
        if (this.field1105) {
            int var10002;
            for (int var3 = 0; var3 < this.field1520; ++var3) {
                if (this.field1497[var3] <= 0) {
                    boolean var4 = false;
                    try {
                        if (this.field1207[var3] == this.field1131 && this.field1116[var3] == this.field1107) {
                            if (!this.method469(false)) {
                                var4 = true;
                            }
                        } else {
                            Packet var5 = Wave.method264(this.field1207[var3], this.field1116[var3], this.field1462);
                            if (System.currentTimeMillis() + (long) (var5.field621 / 22) > (long) (this.field1117 / 22) + this.field1270) {
                                this.field1117 = var5.field621;
                                this.field1270 = System.currentTimeMillis();
                                if (this.method468(0, var5.field620, var5.field621)) {
                                    this.field1131 = this.field1207[var3];
                                    this.field1107 = this.field1116[var3];
                                } else {
                                    var4 = true;
                                }
                            }
                        }
                    } catch (Exception var22) {
                    }
                    if (var4 && this.field1497[var3] != -5) {
                        this.field1497[var3] = -5;
                    } else {
                        --this.field1520;
                        for (int var7 = var3; var7 < this.field1520; ++var7) {
                            this.field1207[var7] = this.field1207[var7 + 1];
                            this.field1116[var7] = this.field1116[var7 + 1];
                            this.field1497[var7] = this.field1497[var7 + 1];
                        }
                        --var3;
                    }
                } else {
                    var10002 = this.field1497[var3]--;
                }
            }
            if (this.field1286 > 0) {
                this.field1286 -= 20;
                if (this.field1286 < 0) {
                    this.field1286 = 0;
                }
                if (this.field1286 == 0 && this.field1213 && !field1115) {
                    this.method406(this.field1460, this.field1265, this.field1225, 801);
                }
            }
            if (InputTracking.field78) {
                Packet var8 = InputTracking.method36(true);
                if (var8 != null) {
                    this.field1355.method198(0, 53);
                    this.field1355.method200(var8.field621);
                    this.field1355.method207(var8.field621, var8.field620, this.field1134, 0);
                    var8.method197(23);
                }
            }
            ++this.field1410;
            if (arg0 < 0 || arg0 > 0) {
                for (int var9 = 1; var9 > 0; ++var9) {
                }
            }
            if (this.field1410 > 750) {
                this.method371(928);
            }
            this.method390(false);
            this.method419(-579);
            this.method452((byte) 42);
            this.method375(-458);
            if ((super.field30[1] == 1 || super.field30[2] == 1 || super.field30[3] == 1 || super.field30[4] == 1) && this.field1211++ > 5) {
                this.field1211 = 0;
                this.field1355.method198(0, 109);
                this.field1355.method200(this.field1181);
                this.field1355.method200(this.field1182);
                this.field1355.method199(this.field1109);
                this.field1355.method199(this.field1347);
            }
            ++this.field1135;
            if (this.field1524 != 0) {
                this.field1523 += 20;
                if (this.field1523 >= 400) {
                    this.field1524 = 0;
                }
            }
            if (this.field1427 != 0) {
                ++this.field1424;
                if (this.field1424 >= 15) {
                    if (this.field1427 == 2) {
                        this.field1472 = true;
                    }
                    if (this.field1427 == 3) {
                        this.field1342 = true;
                    }
                    this.field1427 = 0;
                }
            }
            if (this.field1274 != 0) {
                ++this.field1127;
                if (super.field25 > this.field1275 + 5 || super.field25 < this.field1275 - 5 || super.field26 > this.field1276 + 5 || super.field26 < this.field1276 - 5) {
                    this.field1216 = true;
                }
                if (super.field24 == 0) {
                    if (this.field1274 == 2) {
                        this.field1472 = true;
                    }
                    if (this.field1274 == 3) {
                        this.field1342 = true;
                    }
                    this.field1274 = 0;
                    if (this.field1216 && this.field1127 >= 5) {
                        this.field1219 = -1;
                        this.method443((byte) 9);
                        if (this.field1272 == this.field1219 && this.field1273 != this.field1218) {
                            Component var10 = Component.field955[this.field1272];
                            int var11 = var10.field956[this.field1218];
                            var10.field956[this.field1218] = var10.field956[this.field1273];
                            var10.field956[this.field1273] = var11;
                            int var12 = var10.field957[this.field1218];
                            var10.field957[this.field1218] = var10.field957[this.field1273];
                            var10.field957[this.field1273] = var12;
                            this.field1355.method198(0, 80);
                            this.field1355.method200(this.field1272);
                            this.field1355.method200(this.field1273);
                            this.field1355.method200(this.field1218);
                        }
                    } else if ((this.field1442 == 1 || this.method383(this.field1343 - 1, false)) && this.field1343 > 2) {
                        this.method394(41690);
                    } else if (this.field1343 > 0) {
                        this.method481(0, this.field1343 - 1);
                    }
                    this.field1424 = 10;
                    super.field27 = 0;
                }
            }
            if (World3D.field257 != -1) {
                int var13 = World3D.field257;
                int var14 = World3D.field258;
                boolean var15 = this.method454(this.field1185.field354[0], 0, 1, 0, var13, var14, true, 0, this.field1185.field353[0], 0, 0, 0);
                World3D.field257 = -1;
                if (var15) {
                    this.field1521 = super.field28;
                    this.field1522 = super.field29;
                    this.field1524 = 1;
                    this.field1523 = 0;
                }
            }
            if (super.field27 == 1 && this.field1307 != null) {
                this.field1307 = null;
                this.field1342 = true;
                super.field27 = 0;
            }
            this.method479(34166);
            this.method363(-442);
            this.method466(345);
            this.method374(true);
            if (super.field24 == 1 || super.field27 == 1) {
                ++this.field1161;
            }
            if (this.field1488 == 2) {
                this.method376(0);
            }
            if (this.field1488 == 2 && this.field1481) {
                this.method429(true);
            }
            for (int var16 = 0; var16 < 5; ++var16) {
                var10002 = this.field1093[var16]++;
            }
            this.method465(-49);
            ++field1455;
            if (field1455 > 54) {
                field1455 = 0;
                this.field1355.method198(0, 180);
            }
            ++super.field23;
            if (super.field23 > 4500) {
                this.field1412 = 250;
                super.field23 -= 500;
                this.field1355.method198(0, 161);
            }
            ++this.field1166;
            if (this.field1166 > 500) {
                this.field1166 = 0;
                int var17 = (int) (Math.random() * 8.0D);
                if ((var17 & 1) == 1) {
                    this.field1239 += this.field1240;
                }
                if ((var17 & 2) == 2) {
                    this.field1232 += this.field1233;
                }
                if ((var17 & 4) == 4) {
                    this.field1243 += this.field1244;
                }
            }
            if (this.field1239 < -50) {
                this.field1240 = 2;
            }
            if (this.field1239 > 50) {
                this.field1240 = -2;
            }
            if (this.field1232 < -55) {
                this.field1233 = 2;
            }
            if (this.field1232 > 55) {
                this.field1233 = -2;
            }
            if (this.field1243 < -40) {
                this.field1244 = 1;
            }
            if (this.field1243 > 40) {
                this.field1244 = -1;
            }
            ++this.field1404;
            if (this.field1404 > 500) {
                this.field1404 = 0;
                int var18 = (int) (Math.random() * 8.0D);
                if ((var18 & 1) == 1) {
                    this.field1109 += this.field1110;
                }
                if ((var18 & 2) == 2) {
                    this.field1347 += this.field1348;
                }
            }
            if (this.field1109 < -60) {
                this.field1110 = 2;
            }
            if (this.field1109 > 60) {
                this.field1110 = -2;
            }
            if (this.field1347 < -20) {
                this.field1348 = 1;
            }
            if (this.field1347 > 10) {
                this.field1348 = -1;
            }
            ++this.field1411;
            if (this.field1411 > 50) {
                this.field1355.method198(0, 126);
            }
            try {
                if (this.field1374 != null && this.field1355.field621 > 0) {
                    this.field1374.method33((byte) 1, 0, this.field1355.field620, this.field1355.field621);
                    this.field1355.field621 = 0;
                    this.field1411 = 0;
                }
            } catch (IOException var20) {
                this.method371(928);
            } catch (Exception var21) {
                this.method368((byte) 89);
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method476(byte arg0) {
        if (arg0 == 5) {
            boolean var2 = false;
        } else {
            this.field1312 = -203;
        }
        this.field1260 = new Pix8(this.field1441, "titlebox", 0);
        this.field1261 = new Pix8(this.field1441, "titlebutton", 0);
        this.field1309 = new Pix8[12];
        for (int var3 = 0; var3 < 12; ++var3) {
            this.field1309[var3] = new Pix8(this.field1441, "runes", var3);
        }
        this.field1097 = new Pix32(128, 265);
        this.field1098 = new Pix32(128, 265);
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field1097.field578[var4] = this.field1324.field670[var4];
        }
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field1098.field578[var5] = this.field1325.field670[var5];
        }
        this.field1485 = new int[256];
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field1485[var6] = var6 * 262144;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1485[var7 + 64] = var7 * 1024 + 16711680;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1485[var8 + 128] = var8 * 4 + 16776960;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1485[var9 + 192] = 16777215;
        }
        this.field1486 = new int[256];
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1486[var10] = var10 * 1024;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1486[var11 + 64] = var11 * 4 + 65280;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1486[var12 + 128] = var12 * 262144 + 65535;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1486[var13 + 192] = 16777215;
        }
        this.field1487 = new int[256];
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1487[var14] = var14 * 4;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1487[var15 + 64] = var15 * 262144 + 255;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1487[var16 + 128] = var16 * 1024 + 16711935;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field1487[var17 + 192] = 16777215;
        }
        this.field1484 = new int[256];
        this.field1248 = new int[32768];
        this.field1249 = new int[32768];
        this.method405((byte) 8, (Pix8) null);
        this.field1399 = new int[32768];
        this.field1400 = new int[32768];
        this.method13(10, 0, "Connecting to fileserver");
        if (!this.field1251) {
            this.field1255 = true;
            this.field1251 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method477(String arg0) throws IOException {
        return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method478(boolean arg0) {
        if (this.field1088 != 0) {
            PixFont var2 = this.field1450;
            int var3 = 0;
            if (this.field1513 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field1178[var4] != null) {
                    int var5 = this.field1176[var4];
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field1283 == 0 || this.field1283 == 1 && this.method464(this.field1177[var4], this.field1188))) {
                        int var6 = 329 - var3 * 13;
                        var2.method191(4, 0, (byte) 6, "From " + this.field1177[var4] + ": " + this.field1178[var4], var6);
                        var2.method191(4, 65535, (byte) 6, "From " + this.field1177[var4] + ": " + this.field1178[var4], var6 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field1283 < 2) {
                        int var7 = 329 - var3 * 13;
                        var2.method191(4, 0, (byte) 6, this.field1178[var4], var7);
                        var2.method191(4, 65535, (byte) 6, this.field1178[var4], var7 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field1283 < 2) {
                        int var8 = 329 - var3 * 13;
                        var2.method191(4, 0, (byte) 6, "To " + this.field1177[var4] + ": " + this.field1178[var4], var8);
                        var2.method191(4, 65535, (byte) 6, "To " + this.field1177[var4] + ": " + this.field1178[var4], var8 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            this.field1105 &= arg0;
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field21 != null) {
                    return new URL("http://127.0.0.1:" + (field1113 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILjava/lang/String;)V")
    public final void method13(int arg0, int arg1, String arg2) {
        this.method382(true);
        if (this.field1441 == null) {
            super.method13(arg0, 0, arg2);
        } else {
            this.field1323.method235((byte) 120);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1451.method188(12097, var4 / 2, var5 / 2 - 26 - var6, "RuneScape is loading - please wait...", 16777215);
            this.field1408 += arg1;
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method150(9179409, field1406, var4 / 2 - 152, var7, 34, 304);
            Pix2D.method150(0, field1406, var4 / 2 - 151, var7 + 1, 32, 302);
            Pix2D.method149(9179409, -288, var4 / 2 - 150, var7 + 2, arg0 * 3, 30);
            Pix2D.method149(0, -288, arg0 * 3 + (var4 / 2 - 150), var7 + 2, 300 - arg0 * 3, 30);
            this.field1451.method188(12097, var4 / 2, var5 / 2 + 5 - var6, arg2, 16777215);
            this.field1323.method236(186, super.field18, -3666, 214);
            if (this.field1405) {
                this.field1405 = false;
                if (!this.field1251) {
                    this.field1324.method236(0, super.field18, -3666, 0);
                    this.field1325.method236(0, super.field18, -3666, 661);
                }
                this.field1321.method236(0, super.field18, -3666, 128);
                this.field1322.method236(386, super.field18, -3666, 214);
                this.field1326.method236(265, super.field18, -3666, 0);
                this.field1327.method236(265, super.field18, -3666, 574);
                this.field1328.method236(186, super.field18, -3666, 128);
                this.field1329.method236(186, super.field18, -3666, 574);
            }
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method479(int arg0) {
        if (arg0 == 34166) {
            if (this.field1274 == 0) {
                int var2 = super.field27;
                if (this.field1468 == 1 && super.field28 >= 520 && super.field29 >= 165 && super.field28 <= 788 && super.field29 <= 230) {
                    var2 = 0;
                }
                if (this.field1246) {
                    if (var2 != 1) {
                        int var3 = super.field25;
                        int var4 = super.field26;
                        if (this.field1099 == 0) {
                            var3 -= 8;
                            var4 -= 11;
                        }
                        if (this.field1099 == 1) {
                            var3 -= 562;
                            var4 -= 231;
                        }
                        if (this.field1099 == 2) {
                            var3 -= 22;
                            var4 -= 375;
                        }
                        if (var3 < this.field1100 - 10 || var3 > this.field1102 + this.field1100 + 10 || var4 < this.field1101 - 10 || var4 > this.field1103 + this.field1101 + 10) {
                            this.field1246 = false;
                            if (this.field1099 == 1) {
                                this.field1472 = true;
                            }
                            if (this.field1099 == 2) {
                                this.field1342 = true;
                            }
                        }
                    }
                    if (var2 == 1) {
                        int var5 = this.field1100;
                        int var6 = this.field1101;
                        int var7 = this.field1102;
                        int var8 = super.field28;
                        int var9 = super.field29;
                        if (this.field1099 == 0) {
                            var8 -= 8;
                            var9 -= 11;
                        }
                        if (this.field1099 == 1) {
                            var8 -= 562;
                            var9 -= 231;
                        }
                        if (this.field1099 == 2) {
                            var8 -= 22;
                            var9 -= 375;
                        }
                        int var10 = -1;
                        for (int var11 = 0; var11 < this.field1343; ++var11) {
                            int var12 = (this.field1343 - 1 - var11) * 15 + var6 + 31;
                            if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                                var10 = var11;
                            }
                        }
                        if (var10 != -1) {
                            this.method481(0, var10);
                        }
                        this.field1246 = false;
                        if (this.field1099 == 1) {
                            this.field1472 = true;
                        }
                        if (this.field1099 == 2) {
                            this.field1342 = true;
                            return;
                        }
                    }
                } else {
                    if (var2 == 1 && this.field1343 > 0) {
                        int var13 = this.field1222[this.field1343 - 1];
                        if (var13 == 134 || var13 == 701 || var13 == 570 || var13 == 719 || var13 == 440 || var13 == 871 || var13 == 526 || var13 == 156 || var13 == 120 || var13 == 796 || var13 == 357) {
                            int var14 = this.field1220[this.field1343 - 1];
                            int var15 = this.field1221[this.field1343 - 1];
                            Component var16 = Component.field955[var15];
                            if (var16.field981) {
                                this.field1216 = false;
                                this.field1127 = 0;
                                this.field1272 = var15;
                                this.field1273 = var14;
                                this.field1274 = 2;
                                this.field1275 = super.field28;
                                this.field1276 = super.field29;
                                if (Component.field955[var15].field961 == this.field1413) {
                                    this.field1274 = 1;
                                }
                                if (Component.field955[var15].field961 == this.field1415) {
                                    this.field1274 = 3;
                                }
                                return;
                            }
                        }
                    }
                    if (var2 == 1 && (this.field1442 == 1 || this.method383(this.field1343 - 1, false)) && this.field1343 > 2) {
                        var2 = 2;
                    }
                    if (var2 == 1 && this.field1343 > 0) {
                        this.method481(0, this.field1343 - 1);
                    }
                    if (var2 != 2 || this.field1343 <= 0) {
                        return;
                    }
                    this.method394(41690);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIII)I")
    public final int method480(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 126) {
            this.field1168 = !this.field1168;
        }
        int var5 = 256 - arg1;
        return ((arg2 & 16711935) * var5 + (arg3 & 16711935) * arg1 & -16711936) + ((arg2 & 65280) * var5 + (arg3 & 65280) * arg1 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method481(int arg0, int arg1) {
        this.field1408 += arg0;
        if (arg1 >= 0) {
            if (this.field1302) {
                this.field1302 = false;
                this.field1342 = true;
            }
            int var3 = this.field1220[arg1];
            int var4 = this.field1221[arg1];
            int var5 = this.field1222[arg1];
            int var6 = this.field1223[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 493) {
                NpcEntity var7 = this.field1296[var6];
                if (var7 != null) {
                    this.method454(this.field1185.field354[0], 0, 1, 0, var7.field353[0], var7.field354[0], false, 0, this.field1185.field353[0], 1, 2, 1);
                    this.field1521 = super.field28;
                    this.field1522 = super.field29;
                    this.field1524 = 2;
                    this.field1523 = 0;
                    this.field1355.method198(0, 36);
                    this.field1355.method200(var6);
                    this.field1355.method200(this.field1292);
                    this.field1355.method200(this.field1290);
                    this.field1355.method200(this.field1291);
                }
            }
            if (var5 == 134 || var5 == 701 || var5 == 570 || var5 == 719 || var5 == 440) {
                if (var5 == 719) {
                    this.field1355.method198(0, 186);
                }
                if (var5 == 701) {
                    this.field1355.method198(0, 47);
                }
                if (var5 == 134) {
                    this.field1355.method198(0, 90);
                }
                if (var5 == 570) {
                    this.field1355.method198(0, 121);
                }
                if (var5 == 440) {
                    this.field1355.method198(0, 31);
                }
                this.field1355.method200(var6);
                this.field1355.method200(var3);
                this.field1355.method200(var4);
                this.field1424 = 0;
                this.field1425 = var4;
                this.field1426 = var3;
                this.field1427 = 2;
                if (Component.field955[var4].field961 == this.field1413) {
                    this.field1427 = 1;
                }
                if (Component.field955[var4].field961 == this.field1415) {
                    this.field1427 = 3;
                }
            }
            if (var5 == 125) {
                String var8 = this.field1212[arg1];
                int var9 = var8.indexOf("@whi@");
                if (var9 != -1) {
                    long var10 = JString.method251(var8.substring(var9 + 5).trim());
                    int var12 = -1;
                    for (int var13 = 0; var13 < this.field1096; ++var13) {
                        if (this.field1445[var13] == var10) {
                            var12 = var13;
                            break;
                        }
                    }
                    if (var12 != -1 && this.field1332[var12] > 0) {
                        this.field1342 = true;
                        this.field1302 = false;
                        this.field1356 = true;
                        this.field1370 = "";
                        this.field1254 = 3;
                        this.field1217 = this.field1445[var12];
                        this.field1407 = "Enter message to send to " + this.field1299[var12];
                    }
                }
            }
            if (var5 == 1308) {
                ObjType var14 = ObjType.method287(var6);
                String var15;
                if (var14.field882 != null) {
                    var15 = new String(var14.field882);
                } else {
                    var15 = "It's a " + var14.field881 + ".";
                }
                this.method391(var15, 0, false, "");
            }
            if (var5 == 798) {
                ++field1337;
                if (field1337 >= 135) {
                    this.field1355.method198(0, 253);
                    this.field1355.method200(10151);
                }
                this.method483(var3, 207, -57, var4, var6);
            }
            if (var5 == 829) {
                field1369 += var4;
                if (field1369 >= 132) {
                    this.field1355.method198(0, 27);
                    this.field1355.method200(17379);
                }
                this.method483(var3, 223, -57, var4, var6);
            }
            if (var5 == 48) {
                PlayerEntity var16 = this.field1201[var6];
                if (var16 != null) {
                    this.method454(this.field1185.field354[0], 0, 1, 0, var16.field353[0], var16.field354[0], false, 0, this.field1185.field353[0], 1, 2, 1);
                    this.field1521 = super.field28;
                    this.field1522 = super.field29;
                    this.field1524 = 2;
                    this.field1523 = 0;
                    this.field1355.method198(0, 39);
                    this.field1355.method200(var6);
                    this.field1355.method200(this.field1469);
                }
            }
            if (var5 == 104) {
                this.method483(var3, 168, -57, var4, var6);
            }
            if (var5 == 237) {
                this.field1355.method198(0, 106);
                this.field1355.method200(var6);
                this.field1355.method200(var3);
                this.field1355.method200(var4);
                this.field1355.method200(this.field1292);
                this.field1355.method200(this.field1290);
                this.field1355.method200(this.field1291);
                this.field1424 = 0;
                this.field1425 = var4;
                this.field1426 = var3;
                this.field1427 = 2;
                if (Component.field955[var4].field961 == this.field1413) {
                    this.field1427 = 1;
                }
                if (Component.field955[var4].field961 == this.field1415) {
                    this.field1427 = 3;
                }
            }
            if (var5 == 203) {
                boolean var17 = this.method454(this.field1185.field354[0], 0, 1, 0, var3, var4, false, 0, this.field1185.field353[0], 0, 2, 0);
                if (!var17) {
                    this.method454(this.field1185.field354[0], 0, 1, 0, var3, var4, false, 0, this.field1185.field353[0], 1, 2, 1);
                }
                this.field1521 = super.field28;
                this.field1522 = super.field29;
                this.field1524 = 2;
                this.field1523 = 0;
                this.field1355.method198(0, 183);
                this.field1355.method200(this.field1430 + var3);
                this.field1355.method200(this.field1431 + var4);
                this.field1355.method200(var6);
                this.field1355.method200(this.field1292);
                this.field1355.method200(this.field1290);
                this.field1355.method200(this.field1291);
            }
            if (var5 == 981) {
                if (!this.field1246) {
                    this.field1504.method89(super.field29 - 11, super.field28 - 8, (byte) 7);
                } else {
                    this.field1504.method89(var4 - 11, var3 - 8, (byte) 7);
                }
            }
            if (var5 == 967) {
                this.field1355.method198(0, 222);
                this.field1355.method200(var4);
                Component var19 = Component.field955[var4];
                if (var19.field969 != null && var19.field969[0][0] == 5) {
                    int var20 = var19.field969[0][1];
                    this.field1319[var20] = 1 - this.field1319[var20];
                    this.method441(false, var20);
                    this.field1472 = true;
                }
            }
            if (var5 == 447 || var5 == 158 || var5 == 804 || var5 == 521) {
                String var21 = this.field1212[arg1];
                int var22 = var21.indexOf("@whi@");
                if (var22 != -1) {
                    long var23 = JString.method251(var21.substring(var22 + 5).trim());
                    if (var5 == 447) {
                        this.method373((byte) -31, var23);
                    }
                    if (var5 == 158) {
                        this.method462(var23, true);
                    }
                    if (var5 == 804) {
                        this.method400(-160, var23);
                    }
                    if (var5 == 521) {
                        this.method372(var23, -615);
                    }
                }
            }
            if (var5 == 316) {
                String var25 = this.field1212[arg1];
                int var26 = var25.indexOf("@whi@");
                if (var26 != -1) {
                    this.method398((byte) 3);
                    this.field1287 = var25.substring(var26 + 5).trim();
                    this.field1444 = false;
                    for (int var27 = 0; var27 < Component.field955.length; ++var27) {
                        if (Component.field955[var27] != null && Component.field955[var27].field964 == 600) {
                            this.field1448 = this.field1413 = Component.field955[var27].field961;
                            break;
                        }
                    }
                }
            }
            if (var5 == 103) {
                PlayerEntity var28 = this.field1201[var6];
                if (var28 != null) {
                    this.method454(this.field1185.field354[0], 0, 1, 0, var28.field353[0], var28.field354[0], false, 0, this.field1185.field353[0], 1, 2, 1);
                    this.field1521 = super.field28;
                    this.field1522 = super.field29;
                    this.field1524 = 2;
                    this.field1523 = 0;
                    this.field1355.method198(0, 184);
                    this.field1355.method200(var6);
                    this.field1355.method200(this.field1292);
                    this.field1355.method200(this.field1290);
                    this.field1355.method200(this.field1291);
                }
            }
            if (var5 == 357) {
                this.field1289 = 1;
                this.field1290 = var3;
                this.field1291 = var4;
                this.field1292 = var6;
                this.field1293 = ObjType.method287(var6).field881;
                this.field1468 = 0;
            } else {
                if (var5 == 543) {
                    boolean var29 = this.method454(this.field1185.field354[0], 0, 1, 0, var3, var4, false, 0, this.field1185.field353[0], 0, 2, 0);
                    if (!var29) {
                        this.method454(this.field1185.field354[0], 0, 1, 0, var3, var4, false, 0, this.field1185.field353[0], 1, 2, 1);
                    }
                    this.field1521 = super.field28;
                    this.field1522 = super.field29;
                    this.field1524 = 2;
                    this.field1523 = 0;
                    this.field1355.method198(0, 241);
                    this.field1355.method200(this.field1430 + var3);
                    this.field1355.method200(this.field1431 + var4);
                    this.field1355.method200(var6);
                    this.field1355.method200(this.field1469);
                }
                if (var5 == 1418) {
                    int var31 = var6 >> 14 & 32767;
                    LocType var32 = LocType.method275(var31);
                    String var33;
                    if (var32.field810 != null) {
                        var33 = new String(var32.field810);
                    } else {
                        var33 = "It's a " + var32.field809 + ".";
                    }
                    this.method391(var33, 0, false, "");
                }
                if (var5 == 595 || var5 == 835) {
                    String var34 = this.field1212[arg1];
                    int var35 = var34.indexOf("@whi@");
                    if (var35 != -1) {
                        String var36 = var34.substring(var35 + 5).trim();
                        String var37 = JString.method255(-148, JString.method252(JString.method251(var36), -38644));
                        boolean var38 = false;
                        for (int var39 = 0; var39 < this.field1202; ++var39) {
                            PlayerEntity var40 = this.field1201[this.field1203[var39]];
                            if (var40 != null && var40.field361 != null && var40.field361.equalsIgnoreCase(var37)) {
                                this.method454(this.field1185.field354[0], 0, 1, 0, var40.field353[0], var40.field354[0], false, 0, this.field1185.field353[0], 1, 2, 1);
                                if (var5 == 595) {
                                    this.field1355.method198(0, 245);
                                }
                                if (var5 == 835) {
                                    this.field1355.method198(0, 173);
                                }
                                this.field1355.method200(this.field1203[var39]);
                                var38 = true;
                                break;
                            }
                        }
                        if (!var38) {
                            this.method391("Unable to find " + var37, 0, false, "");
                        }
                    }
                }
                if (var5 == 1814) {
                    NpcEntity var41 = this.field1296[var6];
                    if (var41 != null) {
                        String var42;
                        if (var41.field358.field849 != null) {
                            var42 = new String(var41.field358.field849);
                        } else {
                            var42 = "It's a " + var41.field358.field848 + ".";
                        }
                        this.method391(var42, 0, false, "");
                    }
                }
                if (var5 == 505 && this.method483(var3, 139, -57, var4, var6)) {
                    this.field1355.method200(this.field1292);
                    this.field1355.method200(this.field1290);
                    this.field1355.method200(this.field1291);
                }
                if (var5 == 706) {
                    Component var43 = Component.field955[var4];
                    boolean var44 = true;
                    if (var43.field964 > 0) {
                        var44 = this.method396((byte) -69, var43);
                    }
                    if (var44) {
                        this.field1355.method198(0, 222);
                        this.field1355.method200(var4);
                    }
                }
                if (var5 == 73 && !this.field1373) {
                    this.field1355.method198(0, 218);
                    this.field1355.method200(var4);
                    this.field1373 = true;
                }
                if (var5 == 672) {
                    this.field1355.method198(0, 222);
                    this.field1355.method200(var4);
                    Component var45 = Component.field955[var4];
                    if (var45.field969 != null && var45.field969[0][0] == 5) {
                        int var46 = var45.field969[0][1];
                        if (this.field1319[var46] != var45.field971[0]) {
                            this.field1319[var46] = var45.field971[0];
                            this.method441(false, var46);
                            this.field1472 = true;
                        }
                    }
                }
                if (var5 == 988 || var5 == 345 || var5 == 249 || var5 == 960 || var5 == 40) {
                    NpcEntity var47 = this.field1296[var6];
                    if (var47 != null) {
                        this.method454(this.field1185.field354[0], 0, 1, 0, var47.field353[0], var47.field354[0], false, 0, this.field1185.field353[0], 1, 2, 1);
                        this.field1521 = super.field28;
                        this.field1522 = super.field29;
                        this.field1524 = 2;
                        this.field1523 = 0;
                        if (var5 == 345) {
                            field1333 += var6;
                            if (field1333 >= 116) {
                                this.field1355.method198(0, 217);
                            }
                            this.field1355.method198(0, 191);
                        }
                        if (var5 == 249) {
                            this.field1355.method198(0, 89);
                        }
                        if (var5 == 988) {
                            this.field1355.method198(0, 236);
                        }
                        if (var5 == 40) {
                            this.field1355.method198(0, 198);
                        }
                        if (var5 == 960) {
                            this.field1355.method198(0, 114);
                        }
                        this.field1355.method200(var6);
                    }
                }
                if (var5 == 873) {
                    this.method483(var3, 196, -57, var4, var6);
                }
                if (var5 == 309) {
                    this.method398((byte) 3);
                }
                if (var5 == 1974) {
                    ObjType var48 = ObjType.method287(var6);
                    String var49;
                    if (var4 >= 100000) {
                        var49 = var4 + " x " + var48.field881;
                    } else if (var48.field882 != null) {
                        var49 = new String(var48.field882);
                    } else {
                        var49 = "It's a " + var48.field881 + ".";
                    }
                    this.method391(var49, 0, false, "");
                }
                if (var5 == 871 || var5 == 526 || var5 == 156 || var5 == 120 || var5 == 796) {
                    if (var5 == 526) {
                        this.field1355.method198(0, 0);
                    }
                    if (var5 == 871) {
                        field1491 += var6;
                        if (field1491 >= 76) {
                            this.field1355.method198(0, 214);
                            this.field1355.method199(171);
                        }
                        this.field1355.method198(0, 140);
                    }
                    if (var5 == 120) {
                        this.field1355.method198(0, 112);
                    }
                    if (var5 == 156) {
                        ++field1095;
                        if (field1095 >= 62) {
                            this.field1355.method198(0, 82);
                            this.field1355.method199(142);
                        }
                        this.field1355.method198(0, 155);
                    }
                    if (var5 == 796) {
                        if ((var6 & 3) == 0) {
                            ++field1493;
                        }
                        if (field1493 >= 124) {
                            this.field1355.method198(0, 167);
                            this.field1355.method203(0);
                        }
                        this.field1355.method198(0, 122);
                    }
                    this.field1355.method200(var6);
                    this.field1355.method200(var3);
                    this.field1355.method200(var4);
                    this.field1424 = 0;
                    this.field1425 = var4;
                    this.field1426 = var3;
                    this.field1427 = 2;
                    if (Component.field955[var4].field961 == this.field1413) {
                        this.field1427 = 1;
                    }
                    if (Component.field955[var4].field961 == this.field1415) {
                        this.field1427 = 3;
                    }
                }
                if (var5 == 1528 || var5 == 1741 || var5 == 593 || var5 == 1596) {
                    PlayerEntity var50 = this.field1201[var6];
                    if (var50 != null) {
                        this.method454(this.field1185.field354[0], 0, 1, 0, var50.field353[0], var50.field354[0], false, 0, this.field1185.field353[0], 1, 2, 1);
                        this.field1521 = super.field28;
                        this.field1522 = super.field29;
                        this.field1524 = 2;
                        this.field1523 = 0;
                        if (var5 == 593) {
                            this.field1355.method198(0, 28);
                        }
                        if (var5 == 1596) {
                            this.field1355.method198(0, 173);
                        }
                        if (var5 == 1528) {
                            this.field1355.method198(0, 245);
                        }
                        if (var5 == 1741) {
                            if ((var6 & 3) == 0) {
                                ++field1224;
                            }
                            if (field1224 >= 139) {
                                this.field1355.method198(0, 84);
                                this.field1355.method203(0);
                            }
                            this.field1355.method198(0, 63);
                        }
                        this.field1355.method200(var6);
                    }
                }
                if (var5 == 1659) {
                    this.method483(var3, 181, -57, var4, var6);
                }
                if (var5 == 737 && this.method483(var3, 9, -57, var4, var6)) {
                    this.field1355.method200(this.field1469);
                }
                if (var5 == 63) {
                    this.field1355.method198(0, 158);
                    this.field1355.method200(var6);
                    this.field1355.method200(var3);
                    this.field1355.method200(var4);
                    this.field1355.method200(this.field1469);
                    this.field1424 = 0;
                    this.field1425 = var4;
                    this.field1426 = var3;
                    this.field1427 = 2;
                    if (Component.field955[var4].field961 == this.field1413) {
                        this.field1427 = 1;
                    }
                    if (Component.field955[var4].field961 == this.field1415) {
                        this.field1427 = 3;
                    }
                }
                if (var5 == 500) {
                    NpcEntity var51 = this.field1296[var6];
                    if (var51 != null) {
                        this.method454(this.field1185.field354[0], 0, 1, 0, var51.field353[0], var51.field354[0], false, 0, this.field1185.field353[0], 1, 2, 1);
                        this.field1521 = super.field28;
                        this.field1522 = super.field29;
                        this.field1524 = 2;
                        this.field1523 = 0;
                        this.field1355.method198(0, 244);
                        this.field1355.method200(var6);
                        this.field1355.method200(this.field1469);
                    }
                }
                if (var5 == 56 || var5 == 321 || var5 == 552 || var5 == 43 || var5 == 687) {
                    boolean var52 = this.method454(this.field1185.field354[0], 0, 1, 0, var3, var4, false, 0, this.field1185.field353[0], 0, 2, 0);
                    if (!var52) {
                        this.method454(this.field1185.field354[0], 0, 1, 0, var3, var4, false, 0, this.field1185.field353[0], 1, 2, 1);
                    }
                    this.field1521 = super.field28;
                    this.field1522 = super.field29;
                    this.field1524 = 2;
                    this.field1523 = 0;
                    if (var5 == 43) {
                        this.field1355.method198(0, 143);
                    }
                    if (var5 == 687) {
                        ++field1315;
                        if (field1315 >= 121) {
                            this.field1355.method198(0, 13);
                            this.field1355.method199(128);
                        }
                        this.field1355.method198(0, 192);
                    }
                    if (var5 == 56) {
                        this.field1355.method198(0, 91);
                    }
                    if (var5 == 552) {
                        this.field1355.method198(0, 226);
                    }
                    if (var5 == 321) {
                        this.field1355.method198(0, 48);
                    }
                    this.field1355.method200(this.field1430 + var3);
                    this.field1355.method200(this.field1431 + var4);
                    this.field1355.method200(var6);
                }
                if (var5 == 941) {
                    Component var54 = Component.field955[var4];
                    this.field1468 = 1;
                    this.field1469 = var4;
                    this.field1470 = var54.field1010;
                    this.field1289 = 0;
                    String var55 = var54.field1008;
                    if (var55.indexOf(" ") != -1) {
                        var55 = var55.substring(0, var55.indexOf(" "));
                    }
                    String var56 = var54.field1008;
                    if (var56.indexOf(" ") != -1) {
                        var56 = var56.substring(var56.indexOf(" ") + 1);
                    }
                    this.field1471 = var55 + " " + var54.field1009 + " " + var56;
                    if (this.field1470 == 16) {
                        this.field1472 = true;
                        this.field1490 = 3;
                        this.field1214 = true;
                    }
                } else {
                    this.field1289 = 0;
                    this.field1468 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method482(boolean arg0) {
        ++this.field1368;
        if (arg0) {
            this.method6();
        }
        this.method487((byte) 97);
        this.method485(0);
        this.method369(-266);
        this.method446(-211);
        this.method450(this.field1376);
        if (!this.field1481) {
            int var2 = this.field1181;
            if (this.field1165 / 256 > var2) {
                var2 = this.field1165 / 256;
            }
            if (this.field1269[4] && this.field1492[4] + 128 > var2) {
                var2 = this.field1492[4] + 128;
            }
            int var3 = this.field1243 + this.field1182 & 2047;
            this.method451(this.field1210, this.field1209, var2 * 3 + 600, var2, (byte) 34, var3, this.method447(this.field1185.field306, this.field1185.field305, true, this.field1170) - 50);
        }
        int var4;
        if (!this.field1481) {
            var4 = this.method460(true);
        } else {
            var4 = this.method461(false);
        }
        int var5 = this.field1381;
        int var6 = this.field1382;
        int var7 = this.field1383;
        int var8 = this.field1384;
        int var9 = this.field1385;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field1269[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field1163[var10] * 2 + 1) - (double) this.field1163[var10] + Math.sin((double) this.field1508[var10] / 100.0D * (double) this.field1093[var10]) * (double) this.field1492[var10]);
                if (var10 == 0) {
                    this.field1381 += var12;
                }
                if (var10 == 1) {
                    this.field1382 += var12;
                }
                if (var10 == 2) {
                    this.field1383 += var12;
                }
                if (var10 == 3) {
                    this.field1385 = this.field1385 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field1384 += var12;
                    if (this.field1384 < 128) {
                        this.field1384 = 128;
                    }
                    if (this.field1384 > 383) {
                        this.field1384 = 383;
                    }
                }
            }
        }
        int var11 = Pix3D.field570;
        Model.field519 = true;
        Model.field522 = 0;
        Model.field520 = super.field25 - 8;
        Model.field521 = super.field26 - 11;
        Pix2D.method148(14799);
        this.field1504.method90(0, this.field1382, this.field1384, var4, this.field1381, this.field1383, this.field1385);
        this.field1504.method64(8);
        this.method411(true);
        this.method467(true);
        this.method417(var11, 0);
        this.method381(this.field1125);
        this.field1174.method236(11, super.field18, -3666, 8);
        this.field1381 = var5;
        this.field1382 = var6;
        this.field1383 = var7;
        this.field1384 = var8;
        this.field1385 = var9;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)Z")
    public final boolean method483(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg4 >> 14 & 32767;
        int var7 = this.field1504.method81(this.field1170, arg0, arg3, arg4);
        if (var7 == -1) {
            return false;
        } else {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method454(this.field1185.field354[0], 0, 1, var8 + 1, arg0, arg3, false, var9, this.field1185.field353[0], 0, 2, 0);
            } else {
                LocType var10 = LocType.method275(var6);
                int var11;
                int var12;
                if (var9 != 0 && var9 != 2) {
                    var11 = var10.field814;
                    var12 = var10.field813;
                } else {
                    var11 = var10.field813;
                    var12 = var10.field814;
                }
                int var13 = var10.field837;
                if (var9 != 0) {
                    var13 = (var13 >> 4 - var9) + (var13 << var9 & 15);
                }
                this.method454(this.field1185.field354[0], var13, 1, 0, arg0, arg3, false, 0, this.field1185.field353[0], var11, 2, var12);
            }
            this.field1521 = super.field28;
            this.field1522 = super.field29;
            this.field1524 = 2;
            this.field1523 = 0;
            this.field1355.method198(0, arg1);
            this.field1355.method200(this.field1430 + arg0);
            this.field1355.method200(this.field1431 + arg3);
            while (arg2 >= 0) {
                this.method6();
            }
            this.field1355.method200(var6);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method484(int arg0) {
        int var2 = (this.field1185.field305 >> 7) + this.field1430;
        int var3 = (this.field1185.field306 >> 7) + this.field1431;
        if (var2 >= 2944 && var2 < 3392 && var3 >= 3520 && var3 < 6400) {
            this.field1354 = (var3 - 3520) / 8 + 1;
        } else if (var2 >= 2944 && var2 < 3392 && var3 >= 9920 && var3 < 12800) {
            this.field1354 = (var3 - 9920) / 8 + 1;
        } else {
            this.field1354 = 0;
        }
        this.field1519 = 0;
        if (arg0 != 26510) {
            this.field1278 = null;
        }
        if (var2 >= 3328 && var2 < 3392 && var3 >= 3200 && var3 < 3264) {
            int var4 = var2 & 63;
            int var5 = var3 & 63;
            if (var4 >= 4 && var4 <= 29 && var5 >= 44 && var5 <= 58) {
                this.field1519 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 44 && var5 <= 58) {
                this.field1519 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 25 && var5 <= 39) {
                this.field1519 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 25 && var5 <= 39) {
                this.field1519 = 1;
            }
            if (var4 >= 4 && var4 <= 29 && var5 >= 6 && var5 <= 20) {
                this.field1519 = 1;
            }
            if (var4 >= 36 && var4 <= 61 && var5 >= 6 && var5 <= 20) {
                this.field1519 = 1;
            }
        }
        if (this.field1519 == 0 && var2 >= 3328 && var2 <= 3393 && var3 >= 3203 && var3 <= 3325) {
            this.field1519 = 2;
        }
        this.field1288 = 0;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field1288 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field1288 = 1;
        }
        if (this.field1288 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field1288 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method485(int arg0) {
        for (int var2 = 0; var2 < this.field1297; ++var2) {
            NpcEntity var3 = this.field1296[this.field1298[var2]];
            int var4 = (this.field1298[var2] << 14) + 536870912;
            if (var3 != null && var3.method111(true)) {
                int var5 = var3.field305 >> 7;
                int var6 = var3.field306 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field309 == 1 && (var3.field305 & 127) == 64 && (var3.field306 & 127) == 64) {
                        if (this.field1305[var5][var6] == this.field1368) {
                            continue;
                        }
                        this.field1305[var5][var6] = this.field1368;
                    }
                    this.field1504.method61((var3.field309 - 1) * 64 + 60, var3.field307, var3.field305, this.method447(var3.field306, var3.field305, true, this.field1170), -2146, var4, this.field1170, var3, (Model) null, var3.field306, var3.field308);
                }
            }
        }
        this.field1408 += arg0;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)Z")
    public final boolean method486(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        Component var5 = Component.field955[arg0];
        for (int var6 = 0; var6 < var5.field976.length && var5.field976[var6] != -1; ++var6) {
            Component var7 = Component.field955[var5.field976[var6]];
            if (var7.field962 == 1) {
                var4 |= this.method486(var7.field960, -25, arg2);
            }
            if (var7.field962 == 6 && (var7.field1003 != -1 || var7.field1004 != -1)) {
                boolean var8 = this.method437(var7, (byte) 0);
                int var9;
                if (var8) {
                    var9 = var7.field1004;
                } else {
                    var9 = var7.field1003;
                }
                if (var9 != -1) {
                    SeqType var10 = SeqType.field1023[var9];
                    var7.field959 += arg2;
                    while (var7.field959 > var10.field1027[var7.field958]) {
                        var7.field959 -= var10.field1027[var7.field958] + 1;
                        ++var7.field958;
                        if (var7.field958 >= var10.field1024) {
                            var7.field958 -= var10.field1028;
                            if (var7.field958 < 0 || var7.field958 >= var10.field1024) {
                                var7.field958 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        while (arg1 >= 0) {
            this.field1409 = this.field1335.method209();
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method487(byte arg0) {
        if (arg0 != 97) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field1185.field305 >> 7 == this.field1154 && this.field1185.field306 >> 7 == this.field1155) {
            this.field1154 = 0;
        }
        for (int var3 = -1; var3 < this.field1202; ++var3) {
            PlayerEntity var4;
            int var5;
            if (var3 == -1) {
                var4 = this.field1185;
                var5 = this.field1200 << 14;
            } else {
                var4 = this.field1201[this.field1203[var3]];
                var5 = this.field1203[var3] << 14;
            }
            if (var4 != null && var4.method111(true)) {
                var4.field380 = false;
                if ((field1115 && this.field1202 > 50 || this.field1202 > 200) && var3 != -1 && var4.field329 == var4.field310) {
                    var4.field380 = true;
                }
                int var6 = var4.field305 >> 7;
                int var7 = var4.field306 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field375 != null && field1311 >= var4.field370 && field1311 < var4.field371) {
                        var4.field380 = false;
                        var4.field369 = this.method447(var4.field306, var4.field305, true, this.field1170);
                        this.field1504.method62(var4.field377, var4.field379, 5, var4.field369, var4.field306, var5, (Model) null, var4.field376, var4.field378, var4, this.field1170, 60, var4.field305, var4.field307);
                    } else {
                        if ((var4.field305 & 127) == 64 && (var4.field306 & 127) == 64) {
                            if (this.field1305[var6][var7] == this.field1368) {
                                continue;
                            }
                            this.field1305[var6][var7] = this.field1368;
                        }
                        var4.field369 = this.method447(var4.field306, var4.field305, true, this.field1170);
                        this.field1504.method61(60, var4.field307, var4.field305, var4.field369, -2146, var5, this.field1170, var4, (Model) null, var4.field306, var4.field308);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method488(int arg0) {
        this.field1089 = false;
        if (arg0 != -39294) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        while (this.field1320) {
            try {
                Thread.sleep(50L);
            } catch (Exception var17) {
            }
            Object var3 = this.field1138;
            String var4;
            int var5;
            int var6;
            synchronized (this.field1138) {
                var4 = this.field1129;
                var5 = this.field1266;
                var6 = this.field1428;
                this.field1129 = null;
                this.field1266 = 0;
                this.field1428 = 0;
            }
            if (var4 != null) {
                byte[] var7 = signlink.cacheload(var4 + ".mid");
                if (var7 != null && var5 != 12345678) {
                    this.field1294.reset();
                    this.field1294.update(var7);
                    int var8 = (int) this.field1294.getValue();
                    if (var5 != var8) {
                        var7 = null;
                    }
                }
                if (var7 == null) {
                    try {
                        DataInputStream var9 = this.method477(var4 + "_" + var5 + ".mid");
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
                int var14 = (new Packet(0, var7)).method214();
                byte[] var15 = new byte[var14];
                BZip2.method238(var15, var14, var7, var6, 4);
                this.method458(var14, true, 2, var15);
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field1092[var1] = var0 / 4;
        }
        field1112 = 10;
        field1114 = true;
        field1136 = -68;
        field1157 = 5;
        field1158 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field1236 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field1316 = 17194;
        field1331 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field1372 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field1510 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
    }
}
