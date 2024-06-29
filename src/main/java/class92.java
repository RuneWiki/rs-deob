import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class92 extends class167 {

    @OriginalMember(owner = "client!er", name = "ce", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field1312 = new Hashtable();

    @OriginalMember(owner = "client!er", name = "je", descriptor = "I")
    public int field1319 = 128;

    @OriginalMember(owner = "client!er", name = "ie", descriptor = "Lag;")
    private class635 field1318 = new class635();

    @OriginalMember(owner = "client!er", name = "me", descriptor = "Lbt;")
    private class40 field1322 = new class40();

    @OriginalMember(owner = "client!er", name = "ne", descriptor = "Lbt;")
    public class40 field1323 = new class40();

    @OriginalMember(owner = "client!er", name = "oe", descriptor = "I")
    public int field1324 = 8;

    @OriginalMember(owner = "client!er", name = "se", descriptor = "I")
    public int field1328 = 3;

    @OriginalMember(owner = "client!er", name = "qe", descriptor = "Z")
    private boolean field1326 = false;

    @OriginalMember(owner = "client!er", name = "re", descriptor = "Lor;")
    private class594 field1327 = new class594();

    @OriginalMember(owner = "client!er", name = "we", descriptor = "[Lsk;")
    private class577[] field1332 = new class577[4];

    @OriginalMember(owner = "client!er", name = "Ae", descriptor = "I")
    private int field1336 = -1;

    @OriginalMember(owner = "client!er", name = "ye", descriptor = "I")
    private int field1334 = -1;

    @OriginalMember(owner = "client!er", name = "ve", descriptor = "I")
    private int field1331 = -1;

    @OriginalMember(owner = "client!er", name = "De", descriptor = "[Lsk;")
    private class577[] field1339 = new class577[4];

    @OriginalMember(owner = "client!er", name = "Be", descriptor = "[Lsk;")
    private class577[] field1337 = new class577[4];

    @OriginalMember(owner = "client!er", name = "Fe", descriptor = "Lce;")
    private class283 field1341 = new class283();

    @OriginalMember(owner = "client!er", name = "Ge", descriptor = "Lsba;")
    private class200 field1342 = new class200(16);

    @OriginalMember(owner = "client!er", name = "Ie", descriptor = "Lor;")
    private class594 field1344 = new class594();

    @OriginalMember(owner = "client!er", name = "Me", descriptor = "Lor;")
    private class594 field1348 = new class594();

    @OriginalMember(owner = "client!er", name = "Ne", descriptor = "Lor;")
    private class594 field1349 = new class594();

    @OriginalMember(owner = "client!er", name = "Oe", descriptor = "Lor;")
    private class594 field1350 = new class594();

    @OriginalMember(owner = "client!er", name = "Pe", descriptor = "Lor;")
    private class594 field1351 = new class594();

    @OriginalMember(owner = "client!er", name = "Qe", descriptor = "Lor;")
    private class594 field1352 = new class594();

    @OriginalMember(owner = "client!er", name = "Re", descriptor = "Lor;")
    private class594 field1353 = new class594();

    @OriginalMember(owner = "client!er", name = "Te", descriptor = "Lbt;")
    public class40 field1355 = new class40();

    @OriginalMember(owner = "client!er", name = "bf", descriptor = "Lbt;")
    public class40 field1363 = new class40();

    @OriginalMember(owner = "client!er", name = "cf", descriptor = "Lbt;")
    public class40 field1364 = new class40();

    @OriginalMember(owner = "client!er", name = "yf", descriptor = "I")
    private int field1385 = -1;

    @OriginalMember(owner = "client!er", name = "ff", descriptor = "[F")
    private float[] field1367 = new float[4];

    @OriginalMember(owner = "client!er", name = "Of", descriptor = "I")
    private int field1401 = 0;

    @OriginalMember(owner = "client!er", name = "lf", descriptor = "F")
    private float field1372 = 1.0F;

    @OriginalMember(owner = "client!er", name = "kg", descriptor = "I")
    public int field1423 = 0;

    @OriginalMember(owner = "client!er", name = "Pf", descriptor = "F")
    private float field1402 = -1.0F;

    @OriginalMember(owner = "client!er", name = "uf", descriptor = "[F")
    public float[] field1381 = new float[4];

    @OriginalMember(owner = "client!er", name = "Mf", descriptor = "F")
    public float field1399 = 3584.0F;

    @OriginalMember(owner = "client!er", name = "sg", descriptor = "I")
    public int field1431 = -1;

    @OriginalMember(owner = "client!er", name = "ng", descriptor = "F")
    private float field1426 = 1.0F;

    @OriginalMember(owner = "client!er", name = "Df", descriptor = "I")
    private int field1390 = 0;

    @OriginalMember(owner = "client!er", name = "df", descriptor = "F")
    public float field1365 = 1.0F;

    @OriginalMember(owner = "client!er", name = "mg", descriptor = "F")
    public float field1425 = 1.0F;

    @OriginalMember(owner = "client!er", name = "tg", descriptor = "I")
    private int field1432 = 8448;

    @OriginalMember(owner = "client!er", name = "qg", descriptor = "I")
    private int field1429 = 0;

    @OriginalMember(owner = "client!er", name = "Jf", descriptor = "Z")
    private boolean field1396 = false;

    @OriginalMember(owner = "client!er", name = "Qf", descriptor = "F")
    private float field1403 = -1.0F;

    @OriginalMember(owner = "client!er", name = "gf", descriptor = "I")
    public int field1368 = 512;

    @OriginalMember(owner = "client!er", name = "Vf", descriptor = "I")
    public int field1408 = 512;

    @OriginalMember(owner = "client!er", name = "Fg", descriptor = "F")
    public float field1444 = -1.0F;

    @OriginalMember(owner = "client!er", name = "xf", descriptor = "F")
    private float field1384 = 0.0F;

    @OriginalMember(owner = "client!er", name = "dg", descriptor = "I")
    public int field1416 = 0;

    @OriginalMember(owner = "client!er", name = "jg", descriptor = "I")
    public int field1422 = -1;

    @OriginalMember(owner = "client!er", name = "Og", descriptor = "I")
    public int field1453 = 50;

    @OriginalMember(owner = "client!er", name = "Dg", descriptor = "F")
    public float field1442 = 3584.0F;

    @OriginalMember(owner = "client!er", name = "Eg", descriptor = "I")
    private int field1443 = 8448;

    @OriginalMember(owner = "client!er", name = "Yf", descriptor = "I")
    public int field1411 = -1;

    @OriginalMember(owner = "client!er", name = "fg", descriptor = "[Lcp;")
    private class674[] field1418 = new class674[class149.field2471];

    @OriginalMember(owner = "client!er", name = "Wg", descriptor = "Z")
    private boolean field1461 = true;

    @OriginalMember(owner = "client!er", name = "Zg", descriptor = "I")
    public int field1464 = -1;

    @OriginalMember(owner = "client!er", name = "ug", descriptor = "I")
    public int field1433 = 0;

    @OriginalMember(owner = "client!er", name = "Qg", descriptor = "[F")
    private float[] field1455 = new float[16];

    @OriginalMember(owner = "client!er", name = "ch", descriptor = "I")
    private int field1467 = 0;

    @OriginalMember(owner = "client!er", name = "Cg", descriptor = "F")
    public float field1441 = 1.0F;

    @OriginalMember(owner = "client!er", name = "rg", descriptor = "[F")
    private float[] field1430 = new float[4];

    @OriginalMember(owner = "client!er", name = "Lg", descriptor = "I")
    public int field1450 = 0;

    @OriginalMember(owner = "client!er", name = "bh", descriptor = "I")
    private int field1466 = 0;

    @OriginalMember(owner = "client!er", name = "xg", descriptor = "I")
    private int field1436 = 3584;

    @OriginalMember(owner = "client!er", name = "ih", descriptor = "F")
    public float field1473 = -1.0F;

    @OriginalMember(owner = "client!er", name = "jh", descriptor = "I")
    private int field1474 = 0;

    @OriginalMember(owner = "client!er", name = "Yg", descriptor = "[F")
    private float[] field1463 = new float[4];

    @OriginalMember(owner = "client!er", name = "dh", descriptor = "Ltba;")
    public class148 field1468 = new class148(8192);

    @OriginalMember(owner = "client!er", name = "lh", descriptor = "[B")
    public byte[] field1476 = new byte[16384];

    @OriginalMember(owner = "client!er", name = "nh", descriptor = "[I")
    public int[] field1478 = new int[1];

    @OriginalMember(owner = "client!er", name = "oh", descriptor = "[I")
    public int[] field1479 = new int[1];

    @OriginalMember(owner = "client!er", name = "mh", descriptor = "[I")
    public int[] field1477 = new int[1];

    @OriginalMember(owner = "client!er", name = "ge", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "client!er", name = "Id", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1292;

    @OriginalMember(owner = "client!er", name = "ld", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1269;

    @OriginalMember(owner = "client!er", name = "Bd", descriptor = "Ljaggl/OpenGL;")
    public OpenGL field1285;

    @OriginalMember(owner = "client!er", name = "jb", descriptor = "J")
    private long field1163;

    @OriginalMember(owner = "client!er", name = "Qd", descriptor = "J")
    private long field1300;

    @OriginalMember(owner = "client!er", name = "Xf", descriptor = "Z")
    public boolean field1410;

    @OriginalMember(owner = "client!er", name = "Bf", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "client!er", name = "Wf", descriptor = "Ljava/lang/String;")
    private String field1409;

    @OriginalMember(owner = "client!er", name = "Cf", descriptor = "Z")
    public boolean field1389;

    @OriginalMember(owner = "client!er", name = "lg", descriptor = "Z")
    public boolean field1424;

    @OriginalMember(owner = "client!er", name = "rf", descriptor = "Z")
    private boolean field1378;

    @OriginalMember(owner = "client!er", name = "pg", descriptor = "Z")
    public boolean field1428;

    @OriginalMember(owner = "client!er", name = "Hf", descriptor = "Z")
    public boolean field1394;

    @OriginalMember(owner = "client!er", name = "ef", descriptor = "Z")
    private boolean field1366;

    @OriginalMember(owner = "client!er", name = "ag", descriptor = "Ljava/lang/String;")
    private String field1413;

    @OriginalMember(owner = "client!er", name = "hh", descriptor = "Z")
    public boolean field1472;

    @OriginalMember(owner = "client!er", name = "qf", descriptor = "Z")
    private boolean field1377;

    @OriginalMember(owner = "client!er", name = "ee", descriptor = "Lle;")
    private class282 field1314;

    @OriginalMember(owner = "client!er", name = "te", descriptor = "Lou;")
    public class562 field1329;

    @OriginalMember(owner = "client!er", name = "ke", descriptor = "Lgw;")
    private class155 field1320;

    @OriginalMember(owner = "client!er", name = "he", descriptor = "Lru;")
    private class177 field1317;

    @OriginalMember(owner = "client!er", name = "fe", descriptor = "Lwda;")
    private class592 field1315;

    @OriginalMember(owner = "client!er", name = "td", descriptor = "[F")
    public static float[] field1277 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!er", name = "of", descriptor = "F")
    private float field1375;

    @OriginalMember(owner = "client!er", name = "Nf", descriptor = "F")
    public float field1400;

    @OriginalMember(owner = "client!er", name = "cg", descriptor = "F")
    public float field1415;

    @OriginalMember(owner = "client!er", name = "gg", descriptor = "F")
    public float field1419;

    @OriginalMember(owner = "client!er", name = "Jg", descriptor = "F")
    public float field1448;

    @OriginalMember(owner = "client!er", name = "Mg", descriptor = "F")
    public float field1451;

    @OriginalMember(owner = "client!er", name = "Vg", descriptor = "F")
    private float field1460;

    @OriginalMember(owner = "client!er", name = "fh", descriptor = "F")
    private float field1470;

    @OriginalMember(owner = "client!er", name = "gh", descriptor = "F")
    public float field1471;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!er", name = "s", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!er", name = "t", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!er", name = "u", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!er", name = "v", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!er", name = "w", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!er", name = "x", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!er", name = "y", descriptor = "I")
    private int field1126;

    @OriginalMember(owner = "client!er", name = "z", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!er", name = "A", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!er", name = "B", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!er", name = "C", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!er", name = "D", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!er", name = "E", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!er", name = "F", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!er", name = "G", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!er", name = "H", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!er", name = "I", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!er", name = "J", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!er", name = "K", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!er", name = "L", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!er", name = "M", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!er", name = "N", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!er", name = "O", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!er", name = "P", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!er", name = "Q", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!er", name = "R", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!er", name = "S", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!er", name = "T", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!er", name = "U", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!er", name = "V", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!er", name = "W", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!er", name = "X", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!er", name = "Y", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!er", name = "Z", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!er", name = "ab", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!er", name = "bb", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!er", name = "cb", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!er", name = "db", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!er", name = "eb", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!er", name = "fb", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!er", name = "gb", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!er", name = "hb", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!er", name = "ib", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!er", name = "kb", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!er", name = "lb", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!er", name = "mb", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!er", name = "nb", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!er", name = "ob", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!er", name = "pb", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!er", name = "qb", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!er", name = "sb", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!er", name = "tb", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!er", name = "ub", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!er", name = "vb", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!er", name = "wb", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!er", name = "xb", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!er", name = "yb", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!er", name = "zb", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!er", name = "Ab", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!er", name = "Bb", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!er", name = "Cb", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!er", name = "Db", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!er", name = "Eb", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!er", name = "Fb", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!er", name = "Gb", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!er", name = "Hb", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!er", name = "Ib", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!er", name = "Jb", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!er", name = "Kb", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!er", name = "Lb", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!er", name = "Mb", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!er", name = "Nb", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!er", name = "Ob", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!er", name = "Pb", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!er", name = "Qb", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!er", name = "Rb", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!er", name = "Sb", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!er", name = "Tb", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!er", name = "Ub", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!er", name = "Vb", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!er", name = "Wb", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!er", name = "Xb", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!er", name = "Yb", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!er", name = "Zb", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!er", name = "ac", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!er", name = "bc", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!er", name = "cc", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!er", name = "dc", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!er", name = "ec", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!er", name = "fc", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!er", name = "gc", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!er", name = "hc", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!er", name = "ic", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!er", name = "jc", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!er", name = "kc", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!er", name = "lc", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!er", name = "mc", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!er", name = "nc", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!er", name = "oc", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!er", name = "pc", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!er", name = "qc", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!er", name = "rc", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!er", name = "sc", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!er", name = "tc", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!er", name = "uc", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!er", name = "vc", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!er", name = "wc", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!er", name = "xc", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!er", name = "yc", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!er", name = "zc", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!er", name = "Ac", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!er", name = "Bc", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!er", name = "Cc", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!er", name = "Dc", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!er", name = "Ec", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!er", name = "Fc", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!er", name = "Gc", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!er", name = "Hc", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!er", name = "Ic", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!er", name = "Jc", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!er", name = "Kc", descriptor = "I")
    public int field1242;

    @OriginalMember(owner = "client!er", name = "Lc", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!er", name = "Mc", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!er", name = "Nc", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!er", name = "Oc", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!er", name = "Pc", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!er", name = "Qc", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!er", name = "Rc", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!er", name = "Sc", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!er", name = "Tc", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!er", name = "Uc", descriptor = "I")
    private int field1252;

    @OriginalMember(owner = "client!er", name = "Vc", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!er", name = "Wc", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!er", name = "Xc", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!er", name = "Yc", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!er", name = "Zc", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!er", name = "ad", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!er", name = "bd", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!er", name = "cd", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!er", name = "dd", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!er", name = "ed", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!er", name = "fd", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!er", name = "gd", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!er", name = "hd", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!er", name = "id", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!er", name = "jd", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!er", name = "kd", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!er", name = "md", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!er", name = "nd", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!er", name = "od", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!er", name = "pd", descriptor = "I")
    public int field1273;

    @OriginalMember(owner = "client!er", name = "qd", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!er", name = "rd", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!er", name = "sd", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!er", name = "ud", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!er", name = "vd", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!er", name = "wd", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!er", name = "xd", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!er", name = "yd", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!er", name = "zd", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!er", name = "Ad", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!er", name = "Cd", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!er", name = "Dd", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!er", name = "Ed", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!er", name = "Fd", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!er", name = "Gd", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!er", name = "Hd", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!er", name = "Jd", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!er", name = "Kd", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!er", name = "Ld", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!er", name = "Md", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!er", name = "Nd", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!er", name = "Od", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!er", name = "Pd", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!er", name = "Rd", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!er", name = "Sd", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!er", name = "Td", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!er", name = "Ud", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!er", name = "Vd", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!er", name = "Wd", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!er", name = "Xd", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!er", name = "Yd", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!er", name = "Zd", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!er", name = "ae", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!er", name = "be", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!er", name = "de", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!er", name = "le", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!er", name = "ue", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!er", name = "He", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client!er", name = "Je", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!er", name = "Ke", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!er", name = "Le", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client!er", name = "We", descriptor = "I")
    private int field1358;

    @OriginalMember(owner = "client!er", name = "Ze", descriptor = "I")
    private int field1361;

    @OriginalMember(owner = "client!er", name = "af", descriptor = "I")
    private int field1362;

    @OriginalMember(owner = "client!er", name = "hf", descriptor = "I")
    public int field1369;

    @OriginalMember(owner = "client!er", name = "nf", descriptor = "I")
    private int field1374;

    @OriginalMember(owner = "client!er", name = "vf", descriptor = "I")
    public int field1382;

    @OriginalMember(owner = "client!er", name = "wf", descriptor = "I")
    private int field1383;

    @OriginalMember(owner = "client!er", name = "zf", descriptor = "I")
    private int field1386;

    @OriginalMember(owner = "client!er", name = "Ff", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!er", name = "If", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!er", name = "Zf", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client!er", name = "hg", descriptor = "I")
    private int field1420;

    @OriginalMember(owner = "client!er", name = "og", descriptor = "I")
    private int field1427;

    @OriginalMember(owner = "client!er", name = "Sg", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client!er", name = "Ug", descriptor = "I")
    private int field1459;

    @OriginalMember(owner = "client!er", name = "kh", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client!er", name = "ph", descriptor = "I")
    private int field1480;

    @OriginalMember(owner = "client!er", name = "Ve", descriptor = "J")
    private long field1357;

    @OriginalMember(owner = "client!er", name = "Gf", descriptor = "Lwh;")
    public class133 field1393;

    @OriginalMember(owner = "client!er", name = "mf", descriptor = "Ld;")
    public class136 field1373;

    @OriginalMember(owner = "client!er", name = "sf", descriptor = "Ld;")
    public class136 field1379;

    @OriginalMember(owner = "client!er", name = "tf", descriptor = "Ld;")
    public class136 field1380;

    @OriginalMember(owner = "client!er", name = "Ef", descriptor = "Ld;")
    public class136 field1391;

    @OriginalMember(owner = "client!er", name = "Sf", descriptor = "Ld;")
    public class136 field1405;

    @OriginalMember(owner = "client!er", name = "bg", descriptor = "Ld;")
    public class136 field1414;

    @OriginalMember(owner = "client!er", name = "vg", descriptor = "Ld;")
    public class136 field1434;

    @OriginalMember(owner = "client!er", name = "Hg", descriptor = "Ld;")
    public class136 field1446;

    @OriginalMember(owner = "client!er", name = "Rg", descriptor = "Ld;")
    public class136 field1456;

    @OriginalMember(owner = "client!er", name = "Tg", descriptor = "Ld;")
    public class136 field1458;

    @OriginalMember(owner = "client!er", name = "Ee", descriptor = "Lwfa;")
    private class183 field1340;

    @OriginalMember(owner = "client!er", name = "Ng", descriptor = "Lcea;")
    private class197 field1452;

    @OriginalMember(owner = "client!er", name = "jf", descriptor = "Lcu;")
    private class202 field1370;

    @OriginalMember(owner = "client!er", name = "xe", descriptor = "Lnb;")
    private class276 field1333;

    @OriginalMember(owner = "client!er", name = "Af", descriptor = "Lnb;")
    public class276 field1387;

    @OriginalMember(owner = "client!er", name = "ig", descriptor = "Lvd;")
    private class36 field1421;

    @OriginalMember(owner = "client!er", name = "ah", descriptor = "Lvd;")
    private class36 field1465;

    @OriginalMember(owner = "client!er", name = "Kf", descriptor = "Lmk;")
    public class51 field1397;

    @OriginalMember(owner = "client!er", name = "Ig", descriptor = "Lmk;")
    public class51 field1447;

    @OriginalMember(owner = "client!er", name = "ze", descriptor = "Lsk;")
    private class577 field1335;

    @OriginalMember(owner = "client!er", name = "Ce", descriptor = "Lsk;")
    private class577 field1338;

    @OriginalMember(owner = "client!er", name = "wg", descriptor = "Llga;")
    private class662 field1435;

    @OriginalMember(owner = "client!er", name = "pe", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1325;

    @OriginalMember(owner = "client!er", name = "Se", descriptor = "Z")
    private boolean field1354;

    @OriginalMember(owner = "client!er", name = "Ue", descriptor = "Z")
    private boolean field1356;

    @OriginalMember(owner = "client!er", name = "Xe", descriptor = "Z")
    private boolean field1359;

    @OriginalMember(owner = "client!er", name = "Ye", descriptor = "Z")
    private boolean field1360;

    @OriginalMember(owner = "client!er", name = "kf", descriptor = "Z")
    public boolean field1371;

    @OriginalMember(owner = "client!er", name = "pf", descriptor = "Z")
    public boolean field1376;

    @OriginalMember(owner = "client!er", name = "Lf", descriptor = "Z")
    public boolean field1398;

    @OriginalMember(owner = "client!er", name = "Rf", descriptor = "Z")
    public boolean field1404;

    @OriginalMember(owner = "client!er", name = "Tf", descriptor = "Z")
    public boolean field1406;

    @OriginalMember(owner = "client!er", name = "Uf", descriptor = "Z")
    private boolean field1407;

    @OriginalMember(owner = "client!er", name = "eg", descriptor = "Z")
    private boolean field1417;

    @OriginalMember(owner = "client!er", name = "yg", descriptor = "Z")
    private boolean field1437;

    @OriginalMember(owner = "client!er", name = "zg", descriptor = "Z")
    public boolean field1438;

    @OriginalMember(owner = "client!er", name = "Ag", descriptor = "Z")
    private boolean field1439;

    @OriginalMember(owner = "client!er", name = "Bg", descriptor = "Z")
    public boolean field1440;

    @OriginalMember(owner = "client!er", name = "Kg", descriptor = "Z")
    private boolean field1449;

    @OriginalMember(owner = "client!er", name = "Pg", descriptor = "Z")
    public boolean field1454;

    @OriginalMember(owner = "client!er", name = "Xg", descriptor = "Z")
    private boolean field1462;

    @OriginalMember(owner = "client!er", name = "eh", descriptor = "Z")
    private boolean field1469;

    @OriginalMember(owner = "client!er", name = "rb", descriptor = "[Ldt;")
    public static class221[] field1171;

    @OriginalMember(owner = "client!er", name = "Gg", descriptor = "[Lep;")
    private class386[] field1445;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(II)V", line = 4)
    public final void method816(int arg0, int arg1) {
        ++field1251;
        if (arg0 != 1) {
            if (arg0 != 0) {
                if (~arg0 != -3) {
                    if (arg0 == 3) {
                        this.method857(8960, 8448, 260);
                    } else if (~arg0 == -5) {
                        this.method857(8960, 34023, 34023);
                    }
                } else {
                    this.method857(8960, 7681, 34165);
                }
            } else {
                this.method857(8960, 8448, 8448);
            }
        } else {
            this.method857(8960, 7681, 7681);
        }
        if (arg1 >= -115) {
            this.method355();
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)V", line = 34)
    public final void method300(boolean arg0) {
        ++field1225;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II[I[I)Lua;", line = 44)
    public final class617 method317(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field1266;
        return class51.method576(arg0, this, arg1, arg2, arg3, -2440);
    }

    @OriginalMember(owner = "client!er", name = "m", descriptor = "()Lfe;", line = 53)
    public final class530 method160() {
        ++field1224;
        int var1 = -1;
        if (this.field1413.indexOf("nvidia") == -1) {
            if (this.field1413.indexOf("intel") == -1) {
                if (this.field1413.indexOf("ati") != -1) {
                    var1 = 4098;
                }
            } else {
                var1 = 32902;
            }
        } else {
            var1 = 4318;
        }
        return new class530(var1, "OpenGL", this.field1457, this.field1409, 0L);
    }

    @OriginalMember(owner = "client!er", name = "h", descriptor = "()Lq;", line = 78)
    public final class393 method272() {
        ++field1165;
        return new class40();
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(II)I", line = 87)
    public final int method817(int arg0, int arg1) {
        ++field1169;
        if (arg0 != 5121 && ~arg0 != -5121) {
            if (arg0 != 5123 && ~arg0 != -5123) {
                if (~arg0 != arg1 && arg0 != 5124 && arg0 != 5126) {
                    throw new IllegalArgumentException("");
                } else {
                    return 4;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!er", name = "v", descriptor = "()[I", line = 106)
    public final int[] method353() {
        ++field1184;
        return new int[] { this.field1416, this.field1423, this.field1368, this.field1408 };
    }

    @OriginalMember(owner = "client!er", name = "oa", descriptor = "([I)V", line = 114)
    public final void method343(int[] arg0) {
        arg0[3] = this.field1429;
        arg0[2] = this.field1390;
        arg0[0] = this.field1466;
        ++field1152;
        arg0[1] = this.field1467;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lufa;[Lwt;Z)Lla;", line = 128)
    public final class418 method347(class632 arg0, class284[] arg1, boolean arg2) {
        ++field1294;
        return new class296(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!er", name = "i", descriptor = "(I)V", line = 137)
    private final void method818(int arg0) {
        this.field1375 = (float) (this.field1436 - this.field1433) + -this.field1384;
        ++field1185;
        this.field1415 = this.field1375 - (float) this.field1422 * this.field1426;
        if (this.field1415 < (float) this.field1453) {
            this.field1415 = (float) this.field1453;
        }
        OpenGL.glFogf(2915, this.field1415);
        OpenGL.glFogf(2916, this.field1375);
        class360.field5714[2] = (float) class453.method2846(255, this.field1411) / 255.0F;
        class360.field5714[0] = (float) class453.method2846(16711680, this.field1411) / 1.671168E7F;
        class360.field5714[1] = (float) class453.method2846(65280, this.field1411) / 65280.0F;
        OpenGL.glFogfv(2918, class360.field5714, arg0);
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(II)I", line = 156)
    public final int method323(int arg0, int arg1) {
        ++field1166;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIILlga;)V", line = 164)
    public final void method819(int arg0, int arg1, int arg2, int arg3, class662 arg4) {
        if (arg1 > 111) {
            ++field1148;
            int var6 = arg4.method691((byte) -38);
            int var7 = arg2 * this.method817(var6, -5126);
            this.method842(arg4, 11906);
            OpenGL.glDrawElements(arg3, arg0, var6, (long) var7 + arg4.method693(-32459));
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(IIII)V", line = 181)
    public final void method820(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 121) {
            ++field1302;
            OpenGL.glTexEnvi(8960, arg2 + 34184, arg0);
            OpenGL.glTexEnvi(8960, arg2 + 34200, arg1);
        }
    }

    @OriginalMember(owner = "client!er", name = "BA", descriptor = "()I", line = 197)
    public final int method322() {
        ++field1290;
        return this.field1453;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IF)V", line = 207)
    public final void method821(int arg0, float arg1) {
        if (arg0 < 98) {
            this.field1404 = true;
        }
        ++field1149;
        if (this.field1372 != arg1) {
            this.field1372 = arg1;
            if (~this.field1412 == -4) {
                this.method864(97);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(Z)V", line = 226)
    public final void method822(boolean arg0) {
        if (~this.field1358 != -3) {
            this.method865(false);
            this.method882((byte) -59, false);
            this.method866(false, -8);
            this.method869(false, 2929);
            this.method877(false, -32);
            this.method887(2, -2);
            this.field1358 = 2;
        }
        if (!arg0) {
            this.method889(-116, 53);
        }
        ++field1201;
    }

    @OriginalMember(owner = "client!er", name = "ya", descriptor = "()V", line = 247)
    public final void method136() {
        ++field1244;
        this.method877(true, -32);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BII)V", line = 260)
    public final synchronized void method823(byte arg0, int arg1, int arg2) {
        if (arg0 != 44) {
            this.field1362 = 110;
        }
        ++field1288;
        class160 var4 = new class160(arg2);
        var4.field844 = (long) arg1;
        this.field1348.method3463((byte) -87, var4);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZLsk;)V", line = 277)
    public final void method824(boolean arg0, class577 arg1) {
        ++field1203;
        if (~this.field1334 <= -1 && this.field1332[this.field1334] == arg1) {
            this.field1332[this.field1334--] = null;
            if (arg0) {
                this.field1381 = null;
            }
            arg1.method1973(-108);
            if (this.field1334 >= 0) {
                this.field1335 = this.field1332[this.field1334];
                this.field1335.method1976(false);
            } else {
                this.field1335 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I[Lcp;)V", line = 300)
    public final void method327(int arg0, class674[] arg1) {
        ++field1142;
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field1418[var3] = arg1[var3];
        }
        this.field1420 = arg0;
        if (~this.field1412 != -2) {
            this.method871(0);
        }
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(II)I", line = 326)
    public final int method825(int arg0, int arg1) {
        if (arg1 > -58) {
            return 77;
        } else {
            ++field1245;
            if (arg0 == 1) {
                return 7681;
            } else if (arg0 == 0) {
                return 8448;
            } else if (arg0 == 2) {
                return 34165;
            } else if (arg0 != 3) {
                if (~arg0 == -5) {
                    return 34023;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                return 260;
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lbt;B)V", line = 357)
    public final void method826(class40 arg0, byte arg1) {
        OpenGL.glLoadMatrixf(arg0.method513(-27428), 0);
        int var3 = -60 / ((47 - arg1) / 34);
        ++field1195;
    }

    @OriginalMember(owner = "client!er", name = "s", descriptor = "()V", line = 367)
    public final void method170() {
        OpenGL.glFinish();
        ++field1258;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)I", line = 375)
    public static final int method827(byte arg0) {
        ++field1309;
        if (class345.field5562 == null) {
            return 0;
        } else {
            return arg0 >= -87 ? -21 : class345.field5562.length * 2;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ldd;Ldd;FLdd;)Ldd;", line = 391)
    public final class654 method119(class654 arg0, class654 arg1, float arg2, class654 arg3) {
        ++field1123;
        if (arg0 != null && arg1 != null && this.field1371 && this.field1472) {
            class207 var5 = null;
            class202 var6 = (class202) arg0;
            class202 var7 = (class202) arg1;
            class58 var8 = var6.method196(25270);
            class58 var9 = var7.method196(25270);
            if (var8 != null && var9 != null) {
                int var10 = ~var8.field758 >= ~var9.field758 ? var9.field758 : var8.field758;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class207) {
                    class207 var11 = (class207) arg3;
                    if (var11.method1586((byte) -55) == var10) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class207(this, var10);
                }
                if (var5.method1587(-9993, var9, var8, arg2)) {
                    return var5;
                }
            }
        }
        return !(arg2 < 0.5F) ? arg1 : arg0;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lsk;I)V", line = 437)
    public final void method828(class577 arg0, int arg1) {
        ++field1179;
        if (!this.field1404) {
            if (this.field1331 < 0 || this.field1339[this.field1331] != arg0) {
                throw new RuntimeException();
            }
            this.field1339[this.field1331--] = null;
            arg0.method1966((byte) -113);
            if (this.field1331 < 0) {
                this.field1335 = this.field1338 = null;
            } else {
                this.field1335 = this.field1338 = this.field1339[this.field1331];
                this.field1335.method1977(-18856);
            }
        } else {
            this.method824(false, arg0);
            this.method879(arg0, 0);
        }
        if (arg1 != 0) {
            this.field1252 = -84;
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(BII)V", line = 472)
    public final synchronized void method829(byte arg0, int arg1, int arg2) {
        ++field1158;
        class160 var4 = new class160(arg2);
        var4.field844 = (long) arg1;
        this.field1351.method3463((byte) -87, var4);
        if (arg0 <= 99) {
            this.method168();
        }
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V", line = 486)
    public final void method301(int arg0) {
        ++field1287;
        if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field1319 = arg0;
            this.field1314.method2003(true);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(IIIIII)Ldd;", line = 499)
    public final class654 method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1143;
        return !this.field1371 ? null : new class10(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!er", name = "da", descriptor = "(IIII)V", line = 507)
    public final void method352(int arg0, int arg1, int arg2, int arg3) {
        if (~arg2 < ~this.field1273) {
            arg2 = this.field1273;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (this.field1242 < arg3) {
            arg3 = this.field1242;
        }
        ++field1311;
        if (~arg1 > -1) {
            arg1 = 0;
        }
        this.field1390 = arg2;
        this.field1467 = arg1;
        this.field1429 = arg3;
        this.field1466 = arg0;
        OpenGL.glEnable(3089);
        this.method890(-41);
        this.method897(-24727);
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V", line = 536)
    public final void method830(byte arg0) {
        if (this.field1358 != 4) {
            this.method865(false);
            this.method882((byte) -102, false);
            this.method866(false, -8);
            this.method869(false, 2929);
            this.method877(false, arg0 + -155);
            this.method887(arg0 + -121, -2);
            this.method889(82, 1);
            this.field1358 = 4;
        }
        if (arg0 == 123) {
            ++field1198;
        }
    }

    @OriginalMember(owner = "client!er", name = "j", descriptor = "(I)V", line = 558)
    private final void method831(int arg0) {
        ++field1222;
        if (arg0 != 0) {
            this.method309(-59, -86, -44, 101);
        }
        if (this.field1269 != null) {
            Dimension var2 = this.field1269.getSize();
            this.field1252 = var2.width;
            this.field1126 = var2.height;
        } else {
            this.field1252 = this.field1126 = 0;
        }
        if (this.field1338 == null) {
            this.field1273 = this.field1252;
            this.field1242 = this.field1126;
            this.method891((byte) -37);
        }
        this.method868((byte) -100);
        this.method281();
    }

    @OriginalMember(owner = "client!er", name = "V", descriptor = "(IIII)V", line = 589)
    public final void method271(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1429 > arg3) {
            this.field1429 = arg3;
        }
        if (this.field1390 > arg2) {
            this.field1390 = arg2;
        }
        if (~this.field1467 > ~arg1) {
            this.field1467 = arg1;
        }
        ++field1272;
        if (~this.field1466 > ~arg0) {
            this.field1466 = arg0;
        }
        OpenGL.glEnable(3089);
        this.method890(-66);
        this.method897(-24727);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ldd;)V", line = 620)
    public final void method264(class654 arg0) {
        this.field1370 = (class202) arg0;
        ++field1151;
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(Z)V", line = 628)
    private final void method832(boolean arg0) {
        ++field1255;
        float[] var2 = this.field1455;
        float var3 = (float) (-this.field1416 * this.field1453) / (float) this.field1368;
        float var4 = (float) ((this.field1273 - this.field1416) * this.field1453) / (float) this.field1368;
        float var5 = (float) (this.field1453 * this.field1423) / (float) this.field1408;
        float var6 = (float) ((-this.field1242 + this.field1423) * this.field1453) / (float) this.field1408;
        if (!arg0) {
            this.method268((int[]) null);
        }
        if (var3 != var4 && var5 != var6) {
            float var7 = (float) this.field1453 * 2.0F;
            var2[15] = 0.0F;
            var2[1] = 0.0F;
            var2[2] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[3] = 0.0F;
            var2[12] = 0.0F;
            var2[6] = 0.0F;
            var2[5] = var7 / (-var6 + var5);
            var2[9] = (var5 + var6) / (-var6 + var5);
            var2[11] = -1.0F;
            var2[8] = (var3 + var4) / (var4 - var3);
            var2[13] = 0.0F;
            var2[7] = 0.0F;
            var2[4] = 0.0F;
            var2[10] = this.field1460 = (float) (-(this.field1453 + this.field1436)) / (float) (-this.field1453 + this.field1436);
            var2[14] = this.field1470 = -((float) this.field1436 * var7) / (float) (-this.field1453 + this.field1436);
        } else {
            var2[8] = 0.0F;
            var2[1] = 0.0F;
            var2[3] = 0.0F;
            var2[10] = 1.0F;
            var2[15] = 1.0F;
            var2[11] = 0.0F;
            var2[12] = 0.0F;
            var2[7] = 0.0F;
            var2[5] = 1.0F;
            var2[2] = 0.0F;
            var2[0] = 1.0F;
            var2[4] = 0.0F;
            var2[6] = 0.0F;
            var2[13] = 0.0F;
            var2[9] = 0.0F;
            var2[14] = 0.0F;
        }
        this.method853(false);
    }

    @OriginalMember(owner = "client!er", name = "k", descriptor = "(I)V", line = 691)
    private final void method833(int arg0) {
        int var2 = -30 % ((arg0 - 8) / 32);
        ++field1279;
        if (this.field1437 && this.field1422 >= 0) {
            OpenGL.glEnable(2912);
        } else {
            OpenGL.glDisable(2912);
        }
    }

    @OriginalMember(owner = "client!er", name = "n", descriptor = "()Z", line = 705)
    public final boolean method319() {
        ++field1214;
        return this.field1317 != null && (~this.field1316 >= -2 || this.field1439);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZI)V", line = 715)
    public final void method834(boolean arg0, int arg1) {
        if (~this.field1459 != ~arg1) {
            OpenGL.glActiveTexture(33984 - -arg1);
            this.field1459 = arg1;
        }
        if (!arg0) {
            this.method334(false);
        }
        ++field1129;
    }

    @OriginalMember(owner = "client!er", name = "g", descriptor = "()V", line = 733)
    public final void method143() {
        ++field1186;
        if (this.field1377 && this.field1273 > 0 && ~this.field1242 < -1) {
            int var1 = this.field1466;
            int var2 = this.field1390;
            int var3 = this.field1467;
            int var4 = this.field1429;
            this.method281();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method868((byte) -115);
            this.method882((byte) -120, false);
            this.method866(false, -8);
            this.method869(false, 2929);
            this.method877(false, -32);
            this.method856(false, (class386) null);
            this.method887(2, -2);
            this.method816(1, -126);
            this.method889(64, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field1273, this.field1242, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method352(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IZI)V", line = 777)
    public final void method835(int arg0, boolean arg1, int arg2) {
        ++field1236;
        this.field1401 = arg0;
        this.field1474 = arg2;
        this.method891((byte) -125);
        if (arg1) {
            this.field1319 = 53;
        }
        this.method897(-24727);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V", line = 792)
    public final synchronized void method155(int arg0) {
        ++field1162;
        int var2 = 0;
        int var3 = arg0 & Integer.MAX_VALUE;
        while (!this.field1348.method3464(0)) {
            class160 var12 = (class160) this.field1348.method3471(0);
            class419.field6420[var2++] = (int) var12.field844;
            this.field1345 -= var12.field2728;
            if (var2 == 1000) {
                OpenGL.glDeleteBuffersARB(var2, class419.field6420, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteBuffersARB(var2, class419.field6420, 0);
            var2 = 0;
        }
        while (!this.field1349.method3464(0)) {
            class160 var11 = (class160) this.field1349.method3471(0);
            class419.field6420[var2++] = (int) var11.field844;
            this.field1346 -= var11.field2728;
            if (var2 == 1000) {
                OpenGL.glDeleteTextures(var2, class419.field6420, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteTextures(var2, class419.field6420, 0);
            var2 = 0;
        }
        while (!this.field1350.method3464(0)) {
            class160 var10 = (class160) this.field1350.method3471(0);
            class419.field6420[var2++] = var10.field2728;
            if (var2 == 1000) {
                OpenGL.glDeleteFramebuffersEXT(var2, class419.field6420, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var2, class419.field6420, 0);
            var2 = 0;
        }
        while (!this.field1351.method3464(0)) {
            class160 var9 = (class160) this.field1351.method3471(0);
            class419.field6420[var2++] = (int) var9.field844;
            this.field1343 -= var9.field2728;
            if (~var2 == -1001) {
                OpenGL.glDeleteRenderbuffersEXT(var2, class419.field6420, 0);
                var2 = 0;
            }
        }
        if (~var2 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var2, class419.field6420, 0);
            boolean var4 = false;
        }
        while (!this.field1344.method3464(0)) {
            class160 var8 = (class160) this.field1344.method3471(0);
            OpenGL.glDeleteLists((int) var8.field844, var8.field2728);
        }
        while (!this.field1352.method3464(0)) {
            class66 var7 = this.field1352.method3471(0);
            OpenGL.glDeleteProgramARB((int) var7.field844);
        }
        while (!this.field1353.method3464(0)) {
            class66 var6 = this.field1353.method3471(0);
            OpenGL.glDeleteObjectARB(var6.field844);
        }
        while (!this.field1344.method3464(0)) {
            class160 var5 = (class160) this.field1344.method3471(0);
            OpenGL.glDeleteLists((int) var5.field844, var5.field2728);
        }
        this.field1314.method2001((byte) 97);
        if (this.method338() > 100663296 && class112.method1033(-11752) > this.field1357 + 60000L) {
            System.gc();
            this.field1357 = class112.method1033(-11752);
        }
        this.field1330 = var3;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIZ)Lf;", line = 958)
    public final class702 method282(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1159;
        return new class183(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIILnc;IZIIIII)Z", line = 967)
    public static final boolean method836(int arg0, int arg1, int arg2, int arg3, class23 arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field1125;
        int var12 = arg11;
        int var13 = arg9;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = -var14 + arg11;
        class412.field6325[var14][var15] = 99;
        int var17 = arg9 - var15;
        if (arg6) {
            return false;
        } else {
            class314.field4937[var14][var15] = 0;
            byte var18 = 0;
            class343.field5540[var18] = arg11;
            int var19 = 0;
            int var35 = var18 + 1;
            class100.field1650[var18] = arg9;
            int[][] var20 = arg4.field351;
            while (true) {
                label286: while (true) {
                    int var21;
                    int var22;
                    int var23;
                    int var24;
                    int var26;
                    do {
                        do {
                            do {
                                label263: do {
                                    if (var35 == var19) {
                                        class408.field6295 = var12;
                                        class614.field8730 = var13;
                                        return false;
                                    }
                                    var13 = class100.field1650[var19];
                                    var12 = class343.field5540[var19];
                                    var21 = -var17 + var13;
                                    var19 = 4095 & var19 + 1;
                                    var22 = -var16 + var12;
                                    var23 = -arg4.field361 + var12;
                                    var24 = var13 - arg4.field367;
                                    if (arg10 != -4) {
                                        if (~arg10 != 2) {
                                            if (~arg10 != 1) {
                                                if (~arg10 != 0) {
                                                    if (arg10 != 0 && arg10 != 1 && ~arg10 != -3 && ~arg10 != -4 && arg10 != 9) {
                                                        if (arg4.method391(arg1, arg8, arg5, arg0, 12440, var13, arg10, var12)) {
                                                            class408.field6295 = var12;
                                                            class614.field8730 = var13;
                                                            return true;
                                                        }
                                                    } else if (arg4.method385(arg8, var13, arg5, arg10, -119, arg0, arg1, var12)) {
                                                        class614.field8730 = var13;
                                                        class408.field6295 = var12;
                                                        return true;
                                                    }
                                                } else if (arg4.method384(arg3, var12, var13, arg2, arg1, (byte) -126, arg7, arg0, arg8)) {
                                                    class614.field8730 = var13;
                                                    class408.field6295 = var12;
                                                    return true;
                                                }
                                            } else if (arg4.method380(arg7, var12, var13, arg0, arg8, -1, arg2, arg1, arg1, arg3)) {
                                                class614.field8730 = var13;
                                                class408.field6295 = var12;
                                                return true;
                                            }
                                        } else if (class580.method3403(var13, -119, arg7, arg1, arg8, arg3, var12, arg1, arg0)) {
                                            class614.field8730 = var13;
                                            class408.field6295 = var12;
                                            return true;
                                        }
                                    } else if (~arg0 == ~var12 && arg8 == var13) {
                                        class614.field8730 = var13;
                                        class408.field6295 = var12;
                                        return true;
                                    }
                                    var26 = class314.field4937[var22][var21] + 1;
                                    if (var22 > 0 && class412.field6325[var22 - 1][var21] == 0 && ~(1134821376 & var20[var23 + -1][var24]) == -1 && (1310982144 & var20[var23 - 1][arg1 + var24 - 1]) == 0) {
                                        int var27 = 1;
                                        while (true) {
                                            if (var27 >= arg1 + -1) {
                                                class343.field5540[var35] = var12 - 1;
                                                class100.field1650[var35] = var13;
                                                class412.field6325[var22 + -1][var21] = 2;
                                                var35 = var35 - -1 & 4095;
                                                class314.field4937[var22 - 1][var21] = var26;
                                                break;
                                            }
                                            if ((var20[var23 + -1][var24 - -var27] & 1336147968) != 0) {
                                                break;
                                            }
                                            ++var27;
                                        }
                                    }
                                    if (~(-arg1 + 128) < ~var22 && class412.field6325[var22 + 1][var21] == 0 && (var20[var23 - -arg1][var24] & 1625554944) == 0 && ~(2015625216 & var20[arg1 + var23][arg1 + -1 + var24]) == -1) {
                                        int var28 = 1;
                                        while (true) {
                                            if (~var28 <= ~(arg1 + -1)) {
                                                class343.field5540[var35] = var12 + 1;
                                                class100.field1650[var35] = var13;
                                                class412.field6325[var22 + 1][var21] = 8;
                                                var35 = 4095 & var35 + 1;
                                                class314.field4937[var22 + 1][var21] = var26;
                                                break;
                                            }
                                            if ((var20[arg1 + var23][var24 + var28] & 2028208128) != 0) {
                                                break;
                                            }
                                            ++var28;
                                        }
                                    }
                                    if (var21 > 0 && class412.field6325[var22][var21 - 1] == 0 && ~(var20[var23][var24 - 1] & 1134821376) == -1 && (1625554944 & var20[arg1 + var23 - 1][var24 - 1]) == 0) {
                                        int var29 = 1;
                                        while (true) {
                                            if (var29 >= arg1 + -1) {
                                                class343.field5540[var35] = var12;
                                                class100.field1650[var35] = var13 + -1;
                                                var35 = 4095 & var35 - -1;
                                                class412.field6325[var22][var21 + -1] = 1;
                                                class314.field4937[var22][var21 + -1] = var26;
                                                break;
                                            }
                                            if (~(1675886592 & var20[var23 - -var29][var24 + -1]) != -1) {
                                                break;
                                            }
                                            ++var29;
                                        }
                                    }
                                    if (-arg1 + 128 > var21 && class412.field6325[var22][var21 + 1] == 0 && ~(1310982144 & var20[var23][arg1 + var24]) == -1 && ~(2015625216 & var20[arg1 + var23 + -1][var24 - -arg1]) == -1) {
                                        int var30 = 1;
                                        while (true) {
                                            if (arg1 + -1 <= var30) {
                                                class343.field5540[var35] = var12;
                                                class100.field1650[var35] = var13 + 1;
                                                var35 = 4095 & var35 - -1;
                                                class412.field6325[var22][var21 + 1] = 4;
                                                class314.field4937[var22][var21 + 1] = var26;
                                                break;
                                            }
                                            if ((2116288512 & var20[var23 - -var30][arg1 + var24]) != 0) {
                                                break;
                                            }
                                            ++var30;
                                        }
                                    }
                                    if (~var22 < -1 && var21 > 0 && class412.field6325[var22 + -1][var21 - 1] == 0 && ~(var20[var23 + -1][var24 + -1] & 1134821376) == -1) {
                                        int var31 = 1;
                                        while (true) {
                                            if (arg1 <= var31) {
                                                class343.field5540[var35] = var12 - 1;
                                                class100.field1650[var35] = var13 + -1;
                                                class412.field6325[var22 + -1][var21 + -1] = 3;
                                                var35 = var35 + 1 & 4095;
                                                class314.field4937[var22 - 1][var21 + -1] = var26;
                                                break;
                                            }
                                            if ((var20[var23 + -1][var31 + -1 + var24] & 1336147968) != 0 || ~(1675886592 & var20[var31 + -1 + var23][var24 + -1]) != -1) {
                                                break;
                                            }
                                            ++var31;
                                        }
                                    }
                                    if (~(128 - arg1) < ~var22 && ~var21 < -1 && ~class412.field6325[var22 + 1][var21 + -1] == -1 && (1625554944 & var20[var23 - -arg1][var24 - 1]) == 0) {
                                        int var32 = 1;
                                        while (true) {
                                            if (~arg1 >= ~var32) {
                                                class343.field5540[var35] = var12 + 1;
                                                class100.field1650[var35] = var13 + -1;
                                                var35 = 4095 & var35 + 1;
                                                class412.field6325[var22 - -1][var21 + -1] = 9;
                                                class314.field4937[var22 + 1][var21 + -1] = var26;
                                                break;
                                            }
                                            if ((2028208128 & var20[arg1 + var23][var24 + var32 - 1]) != 0 || (1675886592 & var20[var23 + var32][var24 + -1]) != 0) {
                                                break;
                                            }
                                            ++var32;
                                        }
                                    }
                                    if (var22 > 0 && var21 < -arg1 + 128 && ~class412.field6325[var22 - 1][var21 + 1] == -1 && (var20[var23 + -1][arg1 + var24] & 1310982144) == 0) {
                                        for (int var33 = 1; var33 < arg1; ++var33) {
                                            if (~(1336147968 & var20[var23 + -1][var24 + var33]) != -1 || ~(2116288512 & var20[var23 - (1 - var33)][arg1 + var24]) != -1) {
                                                continue label263;
                                            }
                                        }
                                        class343.field5540[var35] = var12 + -1;
                                        class100.field1650[var35] = var13 + 1;
                                        var35 = var35 + 1 & 4095;
                                        class412.field6325[var22 - 1][var21 + 1] = 6;
                                        class314.field4937[var22 + -1][var21 + 1] = var26;
                                    }
                                } while (var22 >= -arg1 + 128);
                            } while (~(-arg1 + 128) >= ~var21);
                        } while (~class412.field6325[var22 + 1][var21 + 1] != -1);
                    } while (~(2015625216 & var20[arg1 + var23][var24 - -arg1]) != -1);
                    for (int var34 = 1; ~arg1 < ~var34; ++var34) {
                        if ((2116288512 & var20[var23 - -var34][arg1 + var24]) != 0 || ~(2028208128 & var20[arg1 + var23][var24 + var34]) != -1) {
                            continue label286;
                        }
                    }
                    class343.field5540[var35] = var12 - -1;
                    class100.field1650[var35] = var13 - -1;
                    var35 = var35 + 1 & 4095;
                    class412.field6325[var22 + 1][var21 + 1] = 12;
                    class314.field4937[var22 + 1][var21 + 1] = var26;
                }
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "pa", descriptor = "(III)V", line = 1400)
    public final void method313(int arg0, int arg1, int arg2) {
        if (this.field1411 != arg0 || this.field1422 != arg1 || this.field1433 != arg2) {
            this.field1411 = arg0;
            this.field1422 = arg1;
            this.field1433 = arg2;
            this.method818(0);
            this.method833(122);
        }
        ++field1141;
    }

    @OriginalMember(owner = "client!er", name = "l", descriptor = "(I)V", line = 1419)
    private final void method837(int arg0) {
        if (arg0 != -1) {
            this.field1395 = -100;
        }
        ++field1271;
        this.field1285.method3389();
    }

    @OriginalMember(owner = "client!er", name = "m", descriptor = "(I)V", line = 1430)
    private final void method838(int arg0) {
        if (this.field1412 != 2) {
            this.field1412 = 2;
            this.method894(-113);
            this.method846(~arg0);
            this.field1358 &= -8;
        }
        if (arg0 != -1) {
            this.field1444 = -0.5603872F;
        }
        ++field1303;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIIF)Lcp;", line = 1450)
    public final class674 method325(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field1293;
        return new class14(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!er", name = "n", descriptor = "(I)V", line = 1458)
    public static void method839(int arg0) {
        field1171 = null;
        if (arg0 != 17233) {
            method863(106, 18, -83);
        }
        field1277 = null;
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(B)V", line = 1471)
    public final void method840(byte arg0) {
        ++field1118;
        OpenGL.glPushMatrix();
        int var2 = 83 / ((42 - arg0) / 42);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(FFFB)V", line = 1481)
    private final void method841(float arg0, float arg1, float arg2, byte arg3) {
        OpenGL.glMatrixMode(5890);
        ++field1261;
        if (this.field1407) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg0, arg1, arg2);
        OpenGL.glMatrixMode(5888);
        this.field1407 = true;
        int var5 = -110 / (arg3 / 36);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Llga;I)V", line = 1501)
    public final void method842(class662 arg0, int arg1) {
        if (this.field1435 != arg0) {
            if (this.field1378) {
                OpenGL.glBindBufferARB(34963, arg0.method695(-589));
            }
            this.field1435 = arg0;
        }
        if (arg1 == 11906) {
            ++field1192;
        }
    }

    @OriginalMember(owner = "client!er", name = "ZA", descriptor = "(Z)V", line = 1521)
    public final void method334(boolean arg0) {
        this.field1461 = arg0;
        ++field1146;
        this.method847(62);
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(B)V", line = 1532)
    public final void method843(byte arg0) {
        if (arg0 != -22) {
            method827((byte) -121);
        }
        if (this.field1358 != 8) {
            this.method838(-1);
            this.method882((byte) -103, true);
            this.method869(true, 2929);
            this.method877(true, -32);
            this.method889(108, 1);
            this.field1358 = 8;
        }
        ++field1207;
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 1553)
    public final void method298(Canvas arg0) {
        this.field1300 = 0L;
        this.field1269 = null;
        ++field1297;
        if (arg0 != null && this.field1292 != arg0) {
            if (this.field1312.containsKey(arg0)) {
                Long var2 = (Long) this.field1312.get(arg0);
                this.field1300 = var2;
                this.field1269 = arg0;
            }
        } else {
            this.field1300 = this.field1163;
            this.field1269 = this.field1292;
        }
        if (this.field1269 != null && this.field1300 != 0L) {
            this.field1285.setSurface(this.field1300);
            this.method831(0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIIII)V", line = 1584)
    public final void method280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1268;
        OpenGL.glLineWidth((float) arg5);
        this.method345(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(Z)V", line = 1597)
    public final void method114(boolean arg0) {
        ++field1156;
    }

    @OriginalMember(owner = "client!er", name = "GA", descriptor = "(II)V", line = 1606)
    public final void method284(int arg0, int arg1) {
        if (~this.field1453 != ~arg0 || ~this.field1436 != ~arg1) {
            this.field1436 = arg1;
            this.field1453 = arg0;
            this.method832(true);
            this.method818(0);
            if (~this.field1412 == -4) {
                this.method864(-128);
            } else if (~this.field1412 == -3) {
                this.method894(-126);
            }
        }
        ++field1187;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIB)V", line = 1630)
    public final void method844(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -102) {
            this.field1385 = -64;
        }
        ++field1215;
        OpenGL.glTexEnvi(8960, arg2 + 34176, arg1);
        OpenGL.glTexEnvi(8960, arg2 + 34192, arg0);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(FFFIF)V", line = 1646)
    public final void method845(float arg0, float arg1, float arg2, int arg3, float arg4) {
        class360.field5714[3] = arg1;
        class360.field5714[2] = arg4;
        ++field1264;
        if (arg3 != 34161) {
            this.field1433 = -32;
        }
        class360.field5714[1] = arg2;
        class360.field5714[0] = arg0;
        OpenGL.glTexEnvfv(8960, 8705, class360.field5714, 0);
    }

    @OriginalMember(owner = "client!er", name = "o", descriptor = "(I)V", line = 1661)
    private final void method846(int arg0) {
        OpenGL.glLoadIdentity();
        ++field1160;
        OpenGL.glMultMatrixf(this.field1363.method513(arg0 + -27428), 0);
        if (this.field1396) {
            this.field1315.field8408.method2036(false);
        }
        this.method895(128);
        this.method871(arg0);
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(IIIII)V", line = 1676)
    public final void method329(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        ++field1200;
        if (this.field1466 <= arg0 + arg2 && -arg2 + arg0 <= this.field1390 && ~(arg1 - -arg2) <= ~this.field1467 && this.field1429 >= -arg2 + arg1) {
            this.method872(74);
            this.method889(56, arg4);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field1403) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 - 1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if ((float) var8 <= this.field1402) {
                OpenGL.glEnable(2832);
                OpenGL.glPointSize((float) var8);
                OpenGL.glBegin(0);
                OpenGL.glVertex2f(var6, var7);
                OpenGL.glEnd();
                OpenGL.glDisable(2832);
            } else {
                OpenGL.glBegin(6);
                OpenGL.glVertex2f(var6, var7);
                int var9 = 262144 / (arg2 * 6);
                if (var9 > 64) {
                    if (var9 > 512) {
                        var9 = 512;
                    }
                } else {
                    var9 = 64;
                }
                int var10 = class638.method3708(false, var9);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = 16384 - var10; ~var11 < -1; var11 -= var10) {
                    OpenGL.glVertex2f(class149.field2478[var11] * (float) arg2 + var6, class149.field2477[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "()I", line = 1752)
    public final int method267() {
        ++field1170;
        return 4;
    }

    @OriginalMember(owner = "client!er", name = "w", descriptor = "()Lq;", line = 1760)
    public final class393 method259() {
        ++field1134;
        return this.field1355;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfa;I)V", line = 1768)
    public class92(Canvas arg0, class214 arg1, int arg2) {
        super(arg1);
        this.field1316 = arg2;
        this.field1269 = this.field1292 = arg0;
        if (!class106.method1005("jaclib", (byte) 127)) {
            throw new RuntimeException("");
        } else if (!class106.method1005("jaggl", (byte) -25)) {
            throw new RuntimeException("");
        } else {
            try {
                this.field1285 = new OpenGL();
                this.field1300 = this.field1163 = this.field1285.init(arg0, 8, 8, 8, 24, 0, this.field1316);
                if (~this.field1163 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method888(-26242);
                    int var4 = this.method874(false);
                    if (~var4 != -1) {
                        throw new RuntimeException("");
                    } else {
                        this.field1388 = this.field1410 ? 33639 : 5121;
                        if (this.field1409.indexOf("radeon") != -1) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class698.method3944(' ', this.field1409.replace('/', ' '), -4);
                            for (int var9 = 0; ~var8.length < ~var9; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (var10.charAt(0) == 'x' && var10.length() >= 3 && class357.method2400(10, var10.substring(1, 3))) {
                                            var10 = var10.substring(1);
                                            var7 = true;
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var10 = var10.substring(2);
                                                var6 = true;
                                            }
                                            if (var10.length() >= 4 && class357.method2400(10, var10.substring(0, 4))) {
                                                var5 = class566.method3354((byte) -69, var10.substring(0, 4));
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var14) {
                                }
                            }
                            if (!var6 || var5 < 4000) {
                                this.field1389 = false;
                            }
                            if (!var7 && !var6) {
                                if (~var5 <= -7001 && var5 <= 9250) {
                                    this.field1424 = false;
                                }
                                if (~var5 <= -7001 && ~var5 >= -8000) {
                                    this.field1378 = false;
                                }
                            }
                            this.field1428 &= this.field1285.method3390("GL_ARB_half_float_pixel");
                            this.field1394 = true;
                            this.field1366 = this.field1378;
                        }
                        if (~this.field1413.indexOf("intel") != 0) {
                            this.field1472 = false;
                        }
                        this.field1377 = !this.field1413.equals("s3 graphics");
                        if (this.field1378) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var13) {
                                throw new RuntimeException("");
                            }
                        }
                        class597.method3480(true, false, (byte) 127);
                        this.field1326 = true;
                        this.field1314 = new class282(this, super.field2812);
                        this.method860((byte) 123);
                        this.field1329 = new class562(this);
                        this.field1320 = new class155(this);
                        if (this.field1320.method1285(-22)) {
                            this.field1317 = new class177(this);
                            if (!this.field1317.method1436((byte) 50)) {
                                this.field1317.method1432(true);
                                this.field1317 = null;
                            }
                        }
                        this.field1315 = new class592(this);
                        this.method885((byte) -83);
                        this.method831(0);
                        this.method143();
                    }
                }
            } catch (Throwable var15) {
                var15.printStackTrace();
                this.method132();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "p", descriptor = "(I)V", line = 1918)
    private final void method847(int arg0) {
        ++field1219;
        if (arg0 <= 50) {
            this.field1392 = 13;
        }
        OpenGL.glDepthMask(this.field1360 && this.field1461);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(FIF)V", line = 1929)
    public final void method848(float arg0, int arg1, float arg2) {
        int var4 = -67 / ((44 - arg1) / 55);
        this.field1384 = arg2;
        ++field1164;
        this.field1426 = arg0;
        this.method818(0);
    }

    @OriginalMember(owner = "client!er", name = "u", descriptor = "()Z", line = 1941)
    public final boolean method288() {
        ++field1124;
        return true;
    }

    @OriginalMember(owner = "client!er", name = "ra", descriptor = "(F)V", line = 1953)
    public final void method342(float arg0) {
        if (this.field1451 != arg0) {
            this.field1451 = arg0;
            this.method875(34);
        }
        ++field1147;
    }

    @OriginalMember(owner = "client!er", name = "k", descriptor = "()Z", line = 1969)
    public final boolean method294() {
        ++field1257;
        return false;
    }

    @OriginalMember(owner = "client!er", name = "i", descriptor = "()V", line = 1981)
    public final void method308() {
        ++field1237;
    }

    @OriginalMember(owner = "client!er", name = "U", descriptor = "()I", line = 1988)
    public final int method315() {
        ++field1240;
        return this.field1436;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(III)V", line = 1999)
    public final synchronized void method849(int arg0, int arg1, int arg2) {
        if (arg1 < 116) {
            this.method313(-89, 68, 80);
        }
        ++field1248;
        class160 var4 = new class160(arg0);
        var4.field844 = (long) arg2;
        this.field1349.method3463((byte) -87, var4);
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(IIII)V", line = 2014)
    public final void method850(int arg0, int arg1, int arg2, int arg3) {
        ++field1193;
        OpenGL.glDrawArrays(arg0, arg3, arg1);
        if (arg2 != 1) {
            this.method341(-89);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "()Z", line = 2028)
    public final boolean method266() {
        ++field1127;
        return false;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ltt;)V", line = 2036)
    public final void method354(class79 arg0) {
        this.field1318.method3696(arg0, this, (byte) -64, -1);
        ++field1120;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)Le;", line = 2049)
    public final class493 method290(int arg0) {
        ++field1243;
        class105 var2 = new class105(arg0);
        this.field1327.method3463((byte) -87, var2);
        return var2;
    }

    @OriginalMember(owner = "client!er", name = "va", descriptor = "(I)V", line = 2060)
    public final void method328(int arg0) {
        this.field1328 = 0;
        ++field1155;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field1328;
        }
        this.field1324 = 1 << this.field1328;
    }

    @OriginalMember(owner = "client!er", name = "g", descriptor = "(I)V", line = 2075)
    public final void method293(int arg0) {
        ++field1321;
        this.method888(-26242);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZIB)V", line = 2088)
    public final void method851(boolean arg0, int arg1, byte arg2) {
        if (arg2 >= -109) {
            this.field1341 = null;
        }
        this.method861(-9476, true, arg1, arg0);
        ++field1289;
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(B)V", line = 2100)
    public final void method852(byte arg0) {
        if (arg0 != 81) {
            this.field1449 = false;
        }
        ++field1173;
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "([IIIII)Lf;", line = 2111)
    public final class702 method306(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1304;
        return new class183(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(Z)V", line = 2122)
    private final void method853(boolean arg0) {
        this.field1455[10] = this.field1460;
        ++field1217;
        this.field1455[14] = this.field1470;
        this.field1399 = (float) this.field1436;
        if (arg0) {
            this.field1337 = null;
        }
        this.field1442 = (this.field1455[14] + (float) (-this.field1436)) / this.field1455[10];
    }

    @OriginalMember(owner = "client!er", name = "q", descriptor = "()Z", line = 2140)
    public final boolean method289() {
        ++field1161;
        return true;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILsk;)V", line = 2149)
    public final void method854(int arg0, class577 arg1) {
        ++field1140;
        if (this.field1334 >= 3) {
            throw new RuntimeException();
        } else {
            if (~this.field1334 <= -1) {
                this.field1332[this.field1334].method1973(-128);
            }
            int var3 = 109 % ((arg0 - 19) / 38);
            this.field1335 = this.field1332[++this.field1334] = arg1;
            this.field1335.method1976(false);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIIIIIII)V", line = 2169)
    public final void method299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method872(66);
        ++field1238;
        this.method889(109, arg9);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Le;)V", line = 2188)
    public final void method277(class493 arg0) {
        this.field1325 = ((class105) arg0).field1711;
        ++field1188;
        if (this.field1421 == null) {
            class148 var2 = new class148(80);
            if (this.field1410) {
                var2.method1241((byte) -90, -1.0F);
                var2.method1241((byte) -123, -1.0F);
                var2.method1241((byte) -94, 0.0F);
                var2.method1241((byte) -126, 0.0F);
                var2.method1241((byte) -126, 1.0F);
                var2.method1241((byte) -79, 1.0F);
                var2.method1241((byte) -120, -1.0F);
                var2.method1241((byte) -85, 0.0F);
                var2.method1241((byte) -76, 1.0F);
                var2.method1241((byte) -79, 1.0F);
                var2.method1241((byte) -93, 1.0F);
                var2.method1241((byte) -114, 1.0F);
                var2.method1241((byte) -128, 0.0F);
                var2.method1241((byte) -87, 1.0F);
                var2.method1241((byte) -119, 0.0F);
                var2.method1241((byte) -107, -1.0F);
                var2.method1241((byte) -91, 1.0F);
                var2.method1241((byte) -112, 0.0F);
                var2.method1241((byte) -56, 0.0F);
                var2.method1241((byte) -73, 0.0F);
            } else {
                var2.method1243(-79, -1.0F);
                var2.method1243(-123, -1.0F);
                var2.method1243(-113, 0.0F);
                var2.method1243(-97, 0.0F);
                var2.method1243(-103, 1.0F);
                var2.method1243(-128, 1.0F);
                var2.method1243(-71, -1.0F);
                var2.method1243(-98, 0.0F);
                var2.method1243(-112, 1.0F);
                var2.method1243(-83, 1.0F);
                var2.method1243(-116, 1.0F);
                var2.method1243(-63, 1.0F);
                var2.method1243(-109, 0.0F);
                var2.method1243(-69, 1.0F);
                var2.method1243(-72, 0.0F);
                var2.method1243(-100, -1.0F);
                var2.method1243(-96, 1.0F);
                var2.method1243(-63, 0.0F);
                var2.method1243(-115, 0.0F);
                var2.method1243(-63, 0.0F);
            }
            this.field1421 = this.method898(20, false, var2.field57, -101, var2.field96);
            this.field1397 = new class51(this.field1421, 5126, 3, 0);
            this.field1447 = new class51(this.field1421, 5126, 2, 12);
            this.field1318.method3689(113, this);
        }
    }

    @OriginalMember(owner = "client!er", name = "q", descriptor = "(I)V", line = 2253)
    public final void method855(int arg0) {
        int var2 = 14 / ((-23 - arg0) / 33);
        ++field1276;
        if (this.field1358 != 16) {
            this.method878(-30665);
            this.method882((byte) -69, true);
            this.method869(true, 2929);
            this.method877(true, -32);
            this.method889(72, 1);
            this.field1358 = 16;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZLep;)V", line = 2274)
    public final void method856(boolean arg0, class386 arg1) {
        if (!arg0) {
            ++field1180;
            class386 var3 = this.field1445[this.field1459];
            if (arg1 != var3) {
                if (arg1 == null) {
                    OpenGL.glDisable(var3.field5990);
                } else {
                    if (var3 != null) {
                        if (~arg1.field5990 != ~var3.field5990) {
                            OpenGL.glDisable(var3.field5990);
                            OpenGL.glEnable(arg1.field5990);
                        }
                    } else {
                        OpenGL.glEnable(arg1.field5990);
                    }
                    OpenGL.glBindTexture(arg1.field5990, arg1.method2516((byte) 116));
                }
                this.field1445[this.field1459] = arg1;
            }
            this.field1358 &= -2;
        }
    }

    @OriginalMember(owner = "client!er", name = "DA", descriptor = "()I", line = 2312)
    public final int method131() {
        ++field1212;
        int var1 = this.field1475;
        this.field1475 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(III)V", line = 2323)
    public final void method857(int arg0, int arg1, int arg2) {
        if (~this.field1459 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg2);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        } else {
            boolean var4 = false;
            if (this.field1443 != arg2) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                var4 = true;
                this.field1443 = arg2;
            }
            if (~this.field1432 != ~arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                var4 = true;
                this.field1432 = arg1;
            }
            if (var4) {
                this.field1358 &= -30;
            }
        }
        ++field1119;
        if (arg0 != 8960) {
            this.field1322 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(IIIIII)V", line = 2365)
    public final void method345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1295;
        this.method872(88);
        this.method889(77, arg5);
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var9 = var7 * var10;
            var8 *= var10;
        }
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var9 + 0.35F, (float) arg3 + var8 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!er", name = "JA", descriptor = "()V", line = 2399)
    public final void method281() {
        this.field1466 = 0;
        ++field1176;
        this.field1429 = this.field1242;
        this.field1390 = this.field1273;
        this.field1467 = 0;
        OpenGL.glDisable(3089);
        this.method890(-38);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lmk;Lmk;BLmk;Lmk;)V", line = 2414)
    public final void method858(class51 arg0, class51 arg1, byte arg2, class51 arg3, class51 arg4) {
        if (arg2 <= 42) {
            this.method272();
        }
        if (arg3 != null) {
            this.method859(34962, arg3.field690);
            OpenGL.glVertexPointer(arg3.field677, arg3.field684, this.field1465.method469(true), this.field1465.method471(true) - -((long) arg3.field680));
            OpenGL.glEnableClientState(32884);
        } else {
            OpenGL.glDisableClientState(32884);
        }
        ++field1168;
        if (arg4 == null) {
            OpenGL.glDisableClientState(32885);
        } else {
            this.method859(34962, arg4.field690);
            OpenGL.glNormalPointer(arg4.field684, this.field1465.method469(true), this.field1465.method471(true) - -((long) arg4.field680));
            OpenGL.glEnableClientState(32885);
        }
        if (arg1 == null) {
            OpenGL.glDisableClientState(32886);
        } else {
            this.method859(34962, arg1.field690);
            OpenGL.glColorPointer(arg1.field677, arg1.field684, this.field1465.method469(true), this.field1465.method471(true) - -((long) arg1.field680));
            OpenGL.glEnableClientState(32886);
        }
        if (arg0 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method859(34962, arg0.field690);
            OpenGL.glTexCoordPointer(arg0.field677, arg0.field684, this.field1465.method469(true), this.field1465.method471(true) - -((long) arg0.field680));
            OpenGL.glEnableClientState(32888);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILvd;)V", line = 2461)
    public final void method859(int arg0, class36 arg1) {
        ++field1135;
        if (this.field1465 != arg1) {
            if (this.field1378) {
                OpenGL.glBindBufferARB(34962, arg1.method470(-2834));
            }
            this.field1465 = arg1;
        }
        if (arg0 != 34962) {
            this.method828((class577) null, -107);
        }
    }

    @OriginalMember(owner = "client!er", name = "MA", descriptor = "(III[I)V", line = 2479)
    public final void method330(int arg0, int arg1, int arg2, int[] arg3) {
        ++field1232;
        float var5 = (float) arg2 * this.field1355.field555 + (float) arg0 * this.field1355.field540 + (float) arg1 * this.field1355.field532 + this.field1355.field543;
        if (!((float) this.field1453 > var5) && !(var5 > (float) this.field1436)) {
            int var6 = (int) (((float) arg2 * this.field1355.field571 + (float) arg0 * this.field1355.field547 + (float) arg1 * this.field1355.field551 + this.field1355.field556) * (float) this.field1368 / var5);
            arg3[0] = (int) ((float) var6 + -this.field1400);
            int var7 = (int) (((float) arg2 * this.field1355.field564 + (float) arg0 * this.field1355.field560 + (float) arg1 * this.field1355.field549 + this.field1355.field552) * (float) this.field1408 / var5);
            arg3[1] = (int) ((float) var7 + -this.field1471);
            arg3[2] = (int) var5;
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!er", name = "L", descriptor = "()V", line = 2503)
    public final void method314() {
        ++field1247;
        this.field1440 = false;
    }

    @OriginalMember(owner = "client!er", name = "f", descriptor = "(B)V", line = 2514)
    private final void method860(byte arg0) {
        this.field1445 = new class386[this.field1369];
        ++field1178;
        this.field1393 = new class133(this, 3553, 6408, 1, 1);
        new class133(this, 3553, 6408, 1, 1);
        new class133(this, 3553, 6408, 1, 1);
        this.field1446 = new class136(this);
        this.field1414 = new class136(this);
        this.field1379 = new class136(this);
        this.field1380 = new class136(this);
        this.field1391 = new class136(this);
        this.field1458 = new class136(this);
        this.field1434 = new class136(this);
        if (arg0 != 123) {
            this.field1456 = null;
        }
        this.field1373 = new class136(this);
        this.field1456 = new class136(this);
        this.field1405 = new class136(this);
        if (this.field1472) {
            this.field1387 = new class276(this);
            new class276(this);
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "()I", line = 2552)
    public final int method338() {
        ++field1226;
        return this.field1346 + this.field1345 - -this.field1343;
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V", line = 2562)
    public final void method336(int arg0) {
        ++field1283;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IZIZ)V", line = 2576)
    public final void method861(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (arg0 == -9476) {
            ++field1154;
            if (this.field1383 != arg2 || this.field1440 != this.field1396) {
                class133 var5 = null;
                int var6 = 0;
                byte var7 = 0;
                int var8 = 0;
                int var9 = !this.field1440 ? 0 : 3;
                if (~arg2 > -1) {
                    this.method867(arg0 + 15366);
                } else {
                    var5 = this.field1314.method2005(-114, arg2);
                    class258 var10 = super.field2812.method1610(18904, arg2);
                    if (~var10.field4123 == -1 && var10.field4116 == 0) {
                        this.method867(arg0 ^ -12802);
                    } else {
                        int var11 = var10.field4137 ? 64 : 128;
                        int var12 = var11 * 50;
                        this.method841((float) (this.field1330 % var12 * var10.field4123) / (float) var12, (float) (this.field1330 % var12 * var10.field4116) / (float) var12, 0.0F, (byte) -87);
                    }
                    if (!this.field1440) {
                        var8 = var10.field4138;
                        var9 = var10.field4134;
                        var7 = var10.field4130;
                    }
                    var6 = var10.field4140;
                }
                this.field1315.method3453((byte) -105, var7, var8, arg3, arg1, var9);
                if (!this.field1315.method3458(var6, var5, -24382)) {
                    this.method856(false, var5);
                    this.method816(var6, -124);
                }
                this.field1396 = this.field1440;
                this.field1383 = arg2;
            }
            this.field1358 &= -8;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 2643)
    public final void method103(Rectangle[] arg0, int arg1) throws class529 {
        this.method122();
        ++field1137;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(Lbt;B)V", line = 2652)
    public final void method862(class40 arg0, byte arg1) {
        OpenGL.glPushMatrix();
        if (arg1 != -57) {
            this.method859(62, (class36) null);
        }
        ++field1229;
        OpenGL.glMultMatrixf(arg0.method513(arg1 + -27371), 0);
    }

    @OriginalMember(owner = "client!er", name = "y", descriptor = "()V", line = 2665)
    public final void method122() throws class529 {
        try {
            this.field1285.swapBuffers();
        } catch (Exception var1) {
        }
        ++field1305;
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(III)I", line = 2686)
    public static final int method863(int arg0, int arg1, int arg2) {
        if (arg2 != 1583618783) {
            return -118;
        } else {
            ++field1181;
            int var3 = arg0 >>> 31;
            return (arg0 + var3) / arg1 + -var3;
        }
    }

    @OriginalMember(owner = "client!er", name = "x", descriptor = "()V", line = 2699)
    public final void method132() {
        ++field1267;
        for (class66 var1 = this.field1327.method3465((byte) 112); var1 != null; var1 = this.field1327.method3469(0)) {
            ((class105) var1).method1000(8);
        }
        if (this.field1320 != null) {
            this.field1320.method1282((byte) 95);
        }
        if (this.field1285 != null) {
            this.method837(-1);
            Enumeration var2 = this.field1312.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field1312.get(var3);
                this.field1285.releaseSurface(var3, var4);
            }
            this.field1285.release();
            this.field1285 = null;
        }
        if (this.field1326) {
            class655.method3770(true, false, 0);
            this.field1326 = false;
        }
    }

    @OriginalMember(owner = "client!er", name = "r", descriptor = "(I)V", line = 2743)
    private final void method864(int arg0) {
        ++field1275;
        float var2 = (float) (-this.field1416) * this.field1372 / (float) this.field1368;
        int var3 = -5 / ((arg0 - -73) / 52);
        float var4 = (float) (-this.field1423) * this.field1372 / (float) this.field1408;
        float var5 = (float) (-this.field1416 + this.field1273) * this.field1372 / (float) this.field1368;
        float var6 = (float) (-this.field1423 + this.field1242) * this.field1372 / (float) this.field1408;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (var2 != var5 && var4 != var6) {
            OpenGL.glOrtho((double) var2, (double) var5, (double) (-var6), (double) (-var4), (double) this.field1453, (double) this.field1436);
        }
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!er", name = "f", descriptor = "(Z)V", line = 2767)
    private final void method865(boolean arg0) {
        if (!arg0) {
            if (this.field1412 != 1) {
                OpenGL.glMatrixMode(5889);
                OpenGL.glLoadIdentity();
                if (this.field1273 > 0 && this.field1242 > 0) {
                    OpenGL.glOrtho(0.0D, (double) this.field1273, (double) this.field1242, 0.0D, -1.0D, 1.0D);
                }
                OpenGL.glMatrixMode(5888);
                OpenGL.glLoadIdentity();
                this.field1412 = 1;
                this.field1358 &= -25;
            }
            ++field1202;
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(ZI)V", line = 2794)
    public final void method866(boolean arg0, int arg1) {
        if (arg1 == -8) {
            ++field1218;
            if (this.field1462 == !arg0) {
                this.field1462 = arg0;
                this.method901((byte) 126);
                this.field1358 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "s", descriptor = "(I)V", line = 2814)
    private final void method867(int arg0) {
        if (arg0 == 5890) {
            if (this.field1407) {
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5888);
                this.field1407 = false;
            }
            ++field1278;
        }
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 2835)
    public final void method304(Canvas arg0) {
        ++field1262;
        if (this.field1292 == arg0) {
            throw new RuntimeException();
        } else if (this.field1312.containsKey(arg0)) {
            Long var2 = (Long) this.field1312.get(arg0);
            this.field1285.releaseSurface(arg0, var2);
            this.field1312.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!er", name = "CA", descriptor = "(IIII)V", line = 2854)
    public final void method332(int arg0, int arg1, int arg2, int arg3) {
        this.field1450 = arg3;
        this.field1395 = arg0;
        this.field1431 = arg1;
        ++field1256;
        this.field1464 = arg2;
        this.field1440 = true;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II[[I[[IIII)Li;", line = 2869)
    public final class37 method275(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field1259;
        return new class521(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!er", name = "VA", descriptor = "(IFFFFF)V", line = 2879)
    public final void method296(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field1145;
        boolean var7 = this.field1385 != arg0;
        if (var7 || this.field1444 != arg1 || this.field1473 != arg2) {
            this.field1473 = arg2;
            this.field1444 = arg1;
            this.field1385 = arg0;
            if (var7) {
                this.field1425 = (float) (this.field1385 & 16711680) / 1.671168E7F;
                this.field1365 = (float) (this.field1385 & 65280) / 65280.0F;
                this.field1441 = (float) (this.field1385 & 255) / 255.0F;
                this.method875(-127);
            }
            this.method900((byte) -65);
        }
        if (this.field1463[0] != arg3 || this.field1463[1] != arg4 || this.field1463[2] != arg5) {
            this.field1463[0] = arg3;
            this.field1463[1] = arg4;
            this.field1463[2] = arg5;
            this.field1430[1] = -arg4;
            this.field1430[2] = -arg5;
            this.field1430[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field1381[2] = arg5 * var8;
            this.field1381[1] = arg4 * var8;
            this.field1381[0] = arg3 * var8;
            this.field1367[2] = -this.field1381[2];
            this.field1367[1] = -this.field1381[1];
            this.field1367[0] = -this.field1381[0];
            this.method895(128);
            this.field1392 = (int) (arg5 * 256.0F / arg4);
            this.field1382 = (int) (arg3 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!er", name = "g", descriptor = "(B)V", line = 2930)
    public final void method868(byte arg0) {
        ++field1241;
        if (this.field1412 != 0) {
            this.field1412 = 0;
            this.field1358 &= -32;
        }
        int var2 = -54 / ((-41 - arg0) / 51);
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(ZI)V", line = 2948)
    public final void method869(boolean arg0, int arg1) {
        if (arg1 == 2929) {
            ++field1197;
            if (!this.field1356 == arg0) {
                if (arg0) {
                    OpenGL.glEnable(2929);
                } else {
                    OpenGL.glDisable(2929);
                }
                this.field1356 = arg0;
                this.field1358 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2969)
    public final void method291(Canvas arg0) {
        ++field1250;
        long var2 = 0L;
        if (arg0 != null && this.field1292 != arg0) {
            if (this.field1312.containsKey(arg0)) {
                Long var4 = (Long) this.field1312.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field1163;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field1285.surfaceResized(var2);
            if (this.field1269 == arg0) {
                this.method831(0);
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Luo;IIII)Lda;", line = 3001)
    public final class55 method287(class534 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1175;
        return new class136(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIZ)Lf;", line = 3010)
    public final class702 method350(int arg0, int arg1, boolean arg2) {
        ++field1157;
        return new class183(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!er", name = "t", descriptor = "()Z", line = 3018)
    public final boolean method262() {
        ++field1231;
        return true;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 3031)
    public final void method297(Canvas arg0) {
        ++field1307;
        if (this.field1292 == arg0) {
            throw new RuntimeException();
        } else if (!this.field1312.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field1285.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field1312.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BZ)V", line = 3068)
    public final void method870(byte arg0, boolean arg1) {
        ++field1189;
        if (arg0 >= -78) {
            this.field1336 = -12;
        }
        if (!arg1 != !this.field1469) {
            this.field1469 = arg1;
            this.method901((byte) 126);
        }
    }

    @OriginalMember(owner = "client!er", name = "t", descriptor = "(I)V", line = 3086)
    private final void method871(int arg0) {
        ++field1246;
        int var2;
        for (var2 = arg0; var2 < this.field1420; ++var2) {
            class674 var3 = this.field1418[var2];
            int var4 = var2 + 16386;
            class458.field6858[0] = (float) var3.method3857((byte) -35);
            class458.field6858[1] = (float) var3.method3851((byte) 45);
            class458.field6858[2] = (float) var3.method3859((byte) 117);
            class458.field6858[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class458.field6858, 0);
            int var5 = var3.method3854(-1);
            float var6 = var3.method3856((byte) -114) / 255.0F;
            class458.field6858[1] = (float) class453.method2846(var5 >> 8, 255) * var6;
            class458.field6858[0] = var6 * (float) (class453.method2846(16744556, var5) >> 16);
            class458.field6858[2] = (float) class453.method2846(255, var5) * var6;
            OpenGL.glLightfv(var4, 4609, class458.field6858, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method3860((byte) -122) * var3.method3860((byte) -122)));
            OpenGL.glEnable(var4);
        }
        while (~var2 > ~this.field1374) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field1374 = this.field1420;
    }

    @OriginalMember(owner = "client!er", name = "j", descriptor = "()V", line = 3128)
    public final void method135() {
        if (this.field1317 != null && this.field1317.method3327(98)) {
            this.field1320.method1289(this.field1317, 1);
            this.field1314.method2003(true);
        }
        ++field1249;
    }

    @OriginalMember(owner = "client!er", name = "u", descriptor = "(I)V", line = 3149)
    private final void method872(int arg0) {
        if (arg0 < 58) {
            this.field1335 = null;
        }
        ++field1274;
        if (~this.field1358 != -2) {
            this.method865(false);
            this.method882((byte) -34, false);
            this.method866(false, -8);
            this.method869(false, 2929);
            this.method877(false, -32);
            this.method856(false, (class386) null);
            this.method887(2, -2);
            this.method816(1, -120);
            this.field1358 = 1;
        }
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(ZI)V", line = 3172)
    public final synchronized void method873(boolean arg0, int arg1) {
        ++field1130;
        class160 var3 = new class160(arg1);
        if (arg0) {
            this.method864(8);
        }
        this.field1350.method3463((byte) -87, var3);
    }

    @OriginalMember(owner = "client!er", name = "g", descriptor = "(Z)I", line = 3191)
    private final int method874(boolean arg0) {
        ++field1233;
        this.field1413 = OpenGL.glGetString(7936).toLowerCase();
        int var2 = 0;
        this.field1409 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field1413.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (~this.field1413.indexOf("brian paul") != 0 || this.field1413.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class698.method3944(' ', var3.replace('.', ' '), -4);
        if (~var4.length > -3) {
            var2 |= 4;
        } else {
            try {
                int var5 = class566.method3354((byte) 33, var4[0]);
                int var6 = class566.method3354((byte) 68, var4[1]);
                this.field1457 = var5 * 10 + var6;
            } catch (NumberFormatException var8) {
                var2 |= 4;
            }
        }
        if (~this.field1457 > -13) {
            var2 |= 2;
        }
        if (!this.field1285.method3390("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field1285.method3390("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field1369 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field1427 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field1386 = var7[0];
        if (this.field1369 < 2 || ~this.field1427 > -3 || this.field1386 < 2) {
            var2 |= 16;
        }
        this.field1410 = Stream.method3620();
        this.field1449 = this.field1285.arePbuffersAvailable();
        this.field1378 = this.field1285.method3390("GL_ARB_vertex_buffer_object");
        this.field1417 = this.field1285.method3390("GL_ARB_multisample");
        this.field1454 = this.field1285.method3390("GL_ARB_vertex_program");
        this.field1285.method3390("GL_ARB_fragment_program");
        this.field1398 = this.field1285.method3390("GL_ARB_vertex_shader");
        this.field1438 = this.field1285.method3390("GL_ARB_fragment_shader");
        this.field1424 = this.field1285.method3390("GL_EXT_texture3D");
        this.field1428 = this.field1285.method3390("GL_ARB_texture_rectangle");
        this.field1371 = this.field1285.method3390("GL_ARB_texture_cube_map");
        this.field1389 = this.field1285.method3390("GL_ARB_texture_float");
        this.field1376 = arg0;
        this.field1472 = this.field1285.method3390("GL_EXT_framebuffer_object");
        this.field1404 = this.field1285.method3390("GL_EXT_framebuffer_blit");
        this.field1406 = this.field1285.method3390("GL_EXT_framebuffer_multisample");
        this.field1439 = this.field1404 & this.field1406;
        OpenGL.glGetFloatv(2834, class360.field5714, 0);
        this.field1403 = class360.field5714[0];
        this.field1402 = class360.field5714[1];
        return ~var2 != -1 ? var2 : 0;
    }

    @OriginalMember(owner = "client!er", name = "A", descriptor = "()V", line = 3273)
    public final void method176() {
        ++field1204;
        if (!this.field1472) {
            if (!this.field1449) {
                throw new RuntimeException("");
            }
            this.field1340.method1081(0, 0, this.field1273, this.field1242, 0, 0);
            this.field1285.setSurface(this.field1300);
        } else {
            if (this.field1338 != this.field1333) {
                throw new RuntimeException();
            }
            this.field1333.method1965(70, 0);
            this.field1333.method1965(97, 8);
            this.method828(this.field1333, 0);
        }
        this.field1273 = this.field1252;
        this.field1340 = null;
        this.field1242 = this.field1126;
        this.method868((byte) 97);
        this.method891((byte) -107);
        this.method281();
    }

    @OriginalMember(owner = "client!er", name = "f", descriptor = "()Z", line = 3305)
    public final boolean method261() {
        ++field1216;
        return true;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lf;Z)V", line = 3318)
    public final void method158(class702 arg0, boolean arg1) {
        ++field1191;
        this.field1340 = (class183) arg0;
        if (!this.field1472) {
            if (!this.field1449) {
                throw new RuntimeException("");
            }
            class356 var3 = (class356) this.field1342.method1558((long) (this.field1340.method1083() << 16 | this.field1340.method1075()), (byte) -93);
            if (var3 == null) {
                var3 = new class356(this, this.field1340.method1083(), this.field1340.method1075());
                class356 var5;
                for (this.field1347 += var3.field5685 * 4; ~this.field1347 < -2097153; this.field1347 -= var5.field5685) {
                    class98 var4 = this.field1341.method2006((byte) -52);
                    if (var4 == null) {
                        break;
                    }
                    var5 = (class356) var4;
                    var5.method958((byte) 69);
                    var5.method707((byte) -10);
                    this.field1285.releasePbuffer(var5.method2394(-1738626585));
                }
                this.field1342.method1564((long) (this.field1340.method1083() << 16 | this.field1340.method1075()), var3, (byte) 127);
            }
            this.field1341.method2013(0, var3);
            this.field1285.setPbuffer(var3.method2394(-1738626585));
        } else {
            if (this.field1333 == null) {
                this.field1333 = new class276(this);
            }
            if (this.field1338 == this.field1333) {
                throw new RuntimeException();
            }
            this.method881(false, this.field1333);
            if (arg1) {
                class106 var6 = (class106) this.field1342.method1558((long) (this.field1340.method1083() << 16 | this.field1340.method1075()), (byte) -93);
                if (var6 == null) {
                    var6 = new class106(this, 6402, this.field1340.method1083(), this.field1340.method1075());
                    class106 var8;
                    for (this.field1347 += var6.field1730; ~this.field1347 < -2097153; this.field1347 -= var8.field1730) {
                        class98 var7 = this.field1341.method2006((byte) -52);
                        if (var7 == null) {
                            break;
                        }
                        var8 = (class106) var7;
                        var8.method958((byte) 69);
                        var8.method707((byte) -90);
                        var8.method1004(-24);
                    }
                    this.field1342.method1564((long) (this.field1340.method1083() << 16 | this.field1340.method1075()), var6, (byte) 76);
                }
                this.field1341.method2013(0, var6);
                this.field1333.method1964((byte) 76, 8, var6);
            }
            this.field1333.method1968(0, this.field1340.field3070, (byte) 126);
        }
        this.field1273 = arg0.method1083();
        this.field1242 = arg0.method1075();
        this.method868((byte) -123);
        this.method891((byte) -103);
        this.method281();
    }

    @OriginalMember(owner = "client!er", name = "v", descriptor = "(I)V", line = 3417)
    private final void method875(int arg0) {
        class360.field5714[3] = 1.0F;
        class360.field5714[0] = this.field1451 * this.field1425;
        int var2 = -49 % ((arg0 - -37) / 42);
        class360.field5714[2] = this.field1451 * this.field1441;
        ++field1265;
        class360.field5714[1] = this.field1451 * this.field1365;
        OpenGL.glLightModelfv(2899, class360.field5714, 0);
    }

    @OriginalMember(owner = "client!er", name = "T", descriptor = "()I", line = 3432)
    public final int method340() {
        ++field1194;
        int var1 = this.field1480;
        this.field1480 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!er", name = "O", descriptor = "(IIIIII)Z", line = 3445)
    public final boolean method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1122;
        float var7 = (float) arg2 * this.field1355.field555 + (float) arg0 * this.field1355.field540 + (float) arg1 * this.field1355.field532 + this.field1355.field543;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field1355.field555 + (float) arg3 * this.field1355.field540 + (float) arg4 * this.field1355.field532 + this.field1355.field543;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field1453 > var7) || !(var8 < (float) this.field1453)) && (!((float) this.field1436 < var7) || !(var8 > (float) this.field1436))) {
            int var9 = (int) (((float) arg2 * this.field1355.field571 + (float) arg0 * this.field1355.field547 + (float) arg1 * this.field1355.field551 + this.field1355.field556) * (float) this.field1368 / var7);
            int var10 = (int) (((float) arg5 * this.field1355.field571 + (float) arg3 * this.field1355.field547 + (float) arg4 * this.field1355.field551 + this.field1355.field556) * (float) this.field1368 / var8);
            if ((float) var9 < this.field1400 && (float) var10 < this.field1400 || this.field1448 < (float) var9 && this.field1448 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field1355.field564 + (float) arg0 * this.field1355.field560 + (float) arg1 * this.field1355.field549 + this.field1355.field552) * (float) this.field1408 / var7);
                int var12 = (int) (((float) arg5 * this.field1355.field564 + (float) arg3 * this.field1355.field560 + (float) arg4 * this.field1355.field549 + this.field1355.field552) * (float) this.field1408 / var8);
                return (!((float) var11 < this.field1471) || !(this.field1471 > (float) var12)) && (!((float) var11 > this.field1419) || !(this.field1419 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!er", name = "B", descriptor = "()Z", line = 3483)
    public final boolean method355() {
        ++field1139;
        return true;
    }

    @OriginalMember(owner = "client!er", name = "z", descriptor = "()Z", line = 3492)
    public final boolean method168() {
        ++field1299;
        return this.field1317 != null && this.field1317.method3327(124);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lsk;B)V", line = 3501)
    public final void method876(class577 arg0, byte arg1) {
        ++field1206;
        if (~this.field1336 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field1336 <= -1) {
                this.field1337[this.field1336].method1971(true);
            }
            int var3 = 21 / ((-7 - arg1) / 42);
            this.field1338 = this.field1337[++this.field1336] = arg0;
            this.field1338.method1963(-122);
        }
    }

    @OriginalMember(owner = "client!er", name = "J", descriptor = "(IIIIII)V", line = 3518)
    public final void method335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1227;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method872(79);
        float var10 = (float) arg3 + var8;
        this.method889(97, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field1417) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field1417) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!er", name = "IA", descriptor = "(IIIIII[BII)V", line = 3552)
    public final void method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field1281;
        float var10;
        float var11;
        if (this.field1452 != null && ~arg2 >= ~this.field1452.field2178 && arg3 <= this.field1452.field2179) {
            this.field1452.method1155(0, arg3, 0, false, 10243, 0, arg2, 6406, arg6, 0);
            var10 = (float) arg2 * this.field1452.field3238 / (float) this.field1452.field2178;
            var11 = (float) arg3 * this.field1452.field3240 / (float) this.field1452.field2179;
        } else {
            this.field1452 = class174.method1420(arg2, false, 6406, arg6, arg3, 0, this, 6406);
            this.field1452.method1158(false, false, (byte) 72);
            var11 = this.field1452.field3240;
            var10 = this.field1452.field3238;
        }
        this.method822(true);
        this.method856(false, this.field1452);
        this.method889(127, arg8);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method893(arg5, 114);
        this.method857(8960, 34165, 34165);
        this.method844(768, 34166, 0, (byte) -102);
        this.method844(770, 5890, 2, (byte) -102);
        this.method820(34166, 770, 0, 121);
        this.method820(5890, 770, 2, 121);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        OpenGL.glBegin(7);
        float var15 = (float) arg3 + var13;
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var10);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var11, var10);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var11, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method844(768, 5890, 0, (byte) -102);
        this.method844(770, 34166, 2, (byte) -102);
        this.method820(5890, 770, 0, 121);
        this.method820(34166, 770, 2, 121);
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(ZI)V", line = 3611)
    public final void method877(boolean arg0, int arg1) {
        ++field1138;
        if (arg1 == -32) {
            if (this.field1360 != arg0) {
                this.field1360 = arg0;
                this.method847(arg1 ^ -91);
                this.field1358 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "w", descriptor = "(I)V", line = 3630)
    private final void method878(int arg0) {
        if (arg0 == -30665) {
            if (~this.field1412 != -4) {
                this.field1412 = 3;
                this.method864(arg0 ^ 30646);
                this.method846(0);
                this.field1358 &= -8;
            }
            ++field1121;
        }
    }

    @OriginalMember(owner = "client!er", name = "C", descriptor = "()Z", line = 3650)
    public final boolean method326() {
        ++field1196;
        return this.field1315.method3459(106, 3);
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(Lsk;I)V", line = 3658)
    public final void method879(class577 arg0, int arg1) {
        ++field1153;
        if (~this.field1336 <= -1 && this.field1337[this.field1336] == arg0) {
            this.field1337[this.field1336--] = null;
            arg0.method1971(true);
            if (this.field1336 >= arg1) {
                this.field1338 = this.field1337[this.field1336];
                this.field1338.method1963(-128);
            } else {
                this.field1338 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!er", name = "x", descriptor = "(I)Lqn;", line = 3686)
    public final class58 method880(int arg0) {
        if (arg0 <= 22) {
            this.method840((byte) 37);
        }
        ++field1270;
        return this.field1370 == null ? null : this.field1370.method196(25270);
    }

    @OriginalMember(owner = "client!er", name = "h", descriptor = "(IIII)[I", line = 3697)
    public final int[] method146(int arg0, int arg1, int arg2, int arg3) {
        ++field1254;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            OpenGL.glReadPixelsi(arg0, -var6 + this.field1242 + -arg1, arg2, 1, 32993, this.field1388, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(ZLsk;)V", line = 3718)
    public final void method881(boolean arg0, class577 arg1) {
        ++field1291;
        if (this.field1404) {
            this.method854(-83, arg1);
            this.method876(arg1, (byte) 126);
        } else {
            if (~this.field1331 <= -4) {
                throw new RuntimeException();
            }
            if (~this.field1331 <= -1) {
                this.field1339[this.field1331].method1966((byte) -85);
            }
            this.field1335 = this.field1338 = this.field1339[++this.field1331] = arg1;
            this.field1335.method1977(-18856);
        }
        if (arg0) {
            this.field1273 = -85;
        }
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "()Z", line = 3749)
    public final boolean method134() {
        ++field1301;
        if (this.field1317 != null) {
            if (!this.field1317.method3327(110)) {
                if (!this.field1320.method1284(this.field1317, 2)) {
                    return false;
                }
                this.field1314.method2003(true);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(BZ)V", line = 3774)
    public final void method882(byte arg0, boolean arg1) {
        ++field1133;
        if (arg0 > -29) {
            this.method833(-117);
        }
        if (this.field1437 != arg1) {
            this.field1437 = arg1;
            this.method833(-35);
            this.field1358 &= -32;
        }
    }

    @OriginalMember(owner = "client!er", name = "o", descriptor = "()Lq;", line = 3793)
    public final class393 method339() {
        ++field1308;
        return this.field1322;
    }

    @OriginalMember(owner = "client!er", name = "m", descriptor = "(IIIII)V", line = 3802)
    public final void method356(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method872(122);
        ++field1128;
        this.method889(64, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!er", name = "ja", descriptor = "(I)V", line = 3825)
    public final void method121(int arg0) {
        ++field1298;
        this.method889(70, 0);
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)I", line = 3838)
    public final int method286(int arg0, int arg1) {
        ++field1235;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!er", name = "r", descriptor = "()Z", line = 3847)
    public final boolean method324() {
        ++field1205;
        return this.field1417 && (!this.method168() || this.field1439);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IJ)V", line = 3855)
    public final synchronized void method883(int arg0, long arg1) {
        if (arg0 >= 86) {
            ++field1174;
            class66 var4 = new class66();
            var4.field844 = arg1;
            this.field1353.method3463((byte) -87, var4);
        }
    }

    @OriginalMember(owner = "client!er", name = "h", descriptor = "(B)V", line = 3876)
    public static final void method884(byte arg0) {
        int var1 = 2 / ((arg0 - 39) / 36);
        ++field1209;
        class83.field1024.method1517(false);
        class464.field6929.method458(-1846698589);
        class157.field2684.method1946(false);
        class271.field4377.setBackground(Color.black);
        class70.field890 = -1;
        class83.field1024 = class455.method2861((byte) 95, class271.field4377);
        class464.field6929 = class225.method1655(class271.field4377, true, 78);
    }

    @OriginalMember(owner = "client!er", name = "i", descriptor = "(B)V", line = 3893)
    private final void method885(byte arg0) {
        if (arg0 >= -63) {
            this.method277((class493) null);
        }
        ++field1234;
        this.method887(2, -2);
        for (int var2 = this.field1369 + -1; var2 >= 0; --var2) {
            this.method834(true, var2);
            this.method856(false, (class386) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method857(8960, 8448, 8448);
        this.method844(770, 34168, 2, (byte) -102);
        this.method867(5890);
        this.field1361 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field1362 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field1359 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field1354 = true;
        this.method882((byte) -83, true);
        this.method866(true, -8);
        this.method869(true, 2929);
        this.method877(true, -32);
        this.method868((byte) 28);
        this.field1285.setSwapInterval(0);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] var3 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
        for (int var4 = 0; var4 < 8; ++var4) {
            int var5 = 16384 - -var4;
            OpenGL.glLightfv(var5, 4608, var3, 0);
            OpenGL.glLightf(var5, 4615, 0.0F);
            OpenGL.glLightf(var5, 4616, 0.0F);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        OpenGL.glHint(3156, 4353);
        this.field1385 = this.field1411 = -1;
        this.method281();
    }

    @OriginalMember(owner = "client!er", name = "AA", descriptor = "(III[I)V", line = 3965)
    public final void method292(int arg0, int arg1, int arg2, int[] arg3) {
        ++field1210;
        float var5 = (float) arg2 * this.field1355.field555 + (float) arg0 * this.field1355.field540 + (float) arg1 * this.field1355.field532 + this.field1355.field543;
        if (!((float) this.field1453 > var5) && !((float) this.field1436 < var5)) {
            int var6 = (int) (((float) arg2 * this.field1355.field571 + (float) arg0 * this.field1355.field547 + (float) arg1 * this.field1355.field551 + this.field1355.field556) * (float) this.field1368 / var5);
            int var7 = (int) (((float) arg2 * this.field1355.field564 + (float) arg0 * this.field1355.field560 + (float) arg1 * this.field1355.field549 + this.field1355.field552) * (float) this.field1408 / var5);
            if ((float) var6 >= this.field1400 && (float) var6 <= this.field1448 && (float) var7 >= this.field1471 && this.field1419 >= (float) var7) {
                arg3[0] = (int) ((float) var6 + -this.field1400);
                arg3[1] = (int) ((float) var7 - this.field1471);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!er", name = "f", descriptor = "(II)I", line = 3995)
    public final int method886(int arg0, int arg1) {
        ++field1230;
        if (~arg1 != -6407 && ~arg1 != -6410) {
            if (arg1 != 6410 && ~arg1 != -34847 && ~arg1 != -34845) {
                if (~arg1 == -6408) {
                    return 3;
                } else if (~arg1 != -6409 && ~arg1 != -34848) {
                    if (~arg1 == -34844) {
                        return 6;
                    } else if (arg1 != 34842) {
                        if (~arg1 == -6403) {
                            return 3;
                        } else if (~arg1 == -6402) {
                            return 1;
                        } else {
                            int var3 = 56 % ((arg0 - -34) / 51);
                            throw new IllegalArgumentException("");
                        }
                    } else {
                        return 8;
                    }
                } else {
                    return 4;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!er", name = "g", descriptor = "(II)V", line = 4043)
    public final void method887(int arg0, int arg1) {
        if (arg0 == 2) {
            ++field1282;
            this.method851(true, arg1, (byte) -125);
        }
    }

    @OriginalMember(owner = "client!er", name = "y", descriptor = "(I)V", line = 4055)
    private final void method888(int arg0) {
        ++field1313;
        int var2 = 0;
        if (arg0 != -26242) {
            method884((byte) 20);
        }
        while (!this.field1285.method3388()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class549.method3313(1000L, 125);
        }
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(I)V", line = 4079)
    public final void method341(int arg0) {
        this.method837(-1);
        ++field1177;
    }

    @OriginalMember(owner = "client!er", name = "h", descriptor = "(II)V", line = 4088)
    public final void method889(int arg0, int arg1) {
        if (this.field1361 != arg1) {
            boolean var3;
            boolean var4;
            byte var5;
            if (~arg1 == -2) {
                var3 = true;
                var4 = true;
                var5 = 1;
            } else if (~arg1 != -3) {
                if (arg1 != 128) {
                    var4 = true;
                    var5 = 0;
                    var3 = false;
                } else {
                    var5 = 3;
                    var3 = true;
                    var4 = true;
                }
            } else {
                var3 = false;
                var5 = 2;
                var4 = true;
            }
            if (this.field1354 == !var4) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field1354 = var4;
            }
            if (var3 == !this.field1359) {
                if (!var3) {
                    OpenGL.glDisable(3008);
                } else {
                    OpenGL.glEnable(3008);
                }
                this.field1359 = var3;
            }
            if (~this.field1362 != ~var5) {
                if (var5 == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (var5 == 2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                } else if (var5 != 3) {
                    OpenGL.glDisable(3042);
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(774, 1);
                }
                this.field1362 = var5;
            }
            this.field1358 &= -29;
            this.field1361 = arg1;
        }
        ++field1221;
        if (arg0 <= 55) {
            this.method866(false, -104);
        }
    }

    @OriginalMember(owner = "client!er", name = "la", descriptor = "(IIII)V", line = 4182)
    public final void method318(int arg0, int arg1, int arg2, int arg3) {
        this.field1423 = arg1;
        ++field1239;
        this.field1416 = arg0;
        this.field1408 = arg3;
        this.field1368 = arg2;
        this.method832(true);
        this.method890(-75);
        if (~this.field1412 != -4) {
            if (this.field1412 == 2) {
                this.method894(-91);
                return;
            }
        } else {
            this.method864(72);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(FFF)V", line = 4204)
    public final void method144(float arg0, float arg1, float arg2) {
        ++field1253;
        class578.field8242 = arg1;
        class44.field617 = arg2;
        class313.field4924 = arg0;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIII)V", line = 4217)
    public final void method110(int arg0, int arg1, int arg2, int arg3) {
        ++field1263;
        this.field1320.method1286(arg2, arg0, arg1, -41, arg3);
    }

    @OriginalMember(owner = "client!er", name = "z", descriptor = "(I)V", line = 4229)
    private final void method890(int arg0) {
        this.field1400 = (float) (-this.field1416 + this.field1466);
        this.field1448 = (float) (-this.field1416 + this.field1390);
        ++field1260;
        int var2 = -101 % ((arg0 - 29) / 55);
        this.field1419 = (float) (-this.field1423 + this.field1429);
        this.field1471 = (float) (this.field1467 - this.field1423);
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "()V", line = 4242)
    public final void method182() {
        ++field1144;
        this.field1320.method1281((byte) 84);
    }

    @OriginalMember(owner = "client!er", name = "j", descriptor = "(B)V", line = 4253)
    private final void method891(byte arg0) {
        OpenGL.glViewport(this.field1474, this.field1401, this.field1273, this.field1242);
        if (arg0 > -29) {
            this.method266();
        }
        ++field1306;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZIIZ[B)Llga;", line = 4264)
    public final class662 method892(boolean arg0, int arg1, int arg2, boolean arg3, byte[] arg4) {
        ++field1208;
        if (!this.field1378 || arg3 && !this.field1366) {
            if (arg0) {
                this.method315();
            }
            return new class450(this, arg2, arg4, arg1);
        } else {
            return new class63(this, arg2, arg4, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!er", name = "i", descriptor = "(II)V", line = 4281)
    public final void method893(int arg0, int arg1) {
        ++field1131;
        class360.field5714[0] = (float) class453.method2846(arg0, 16711680) / 1.671168E7F;
        if (arg1 < 94) {
            this.method854(81, (class577) null);
        }
        class360.field5714[1] = (float) class453.method2846(65280, arg0) / 65280.0F;
        class360.field5714[3] = (float) (arg0 >>> 24) / 255.0F;
        class360.field5714[2] = (float) class453.method2846(255, arg0) / 255.0F;
        OpenGL.glTexEnvfv(8960, 8705, class360.field5714, 0);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lwt;Z)Lf;", line = 4303)
    public final class702 method265(class284 arg0, boolean arg1) {
        ++field1286;
        int[] var3 = new int[arg0.field4537 * arg0.field4535];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field4539 == null) {
            for (int var6 = 0; arg0.field4537 > var6; ++var6) {
                for (int var7 = 0; ~arg0.field4535 < ~var7; ++var7) {
                    int var8 = arg0.field4538[255 & arg0.field4532[var4++]];
                    var3[var5++] = var8 != 0 ? class81.method769(var8, -16777216) : 0;
                }
            }
        } else {
            for (int var9 = 0; arg0.field4537 > var9; ++var9) {
                for (int var11 = 0; arg0.field4535 > var11; ++var11) {
                    var3[var5++] = class81.method769(arg0.field4539[var4] << 24, arg0.field4538[class453.method2846(arg0.field4532[var4], 255)]);
                    ++var4;
                }
            }
        }
        class702 var10 = this.method306(var3, 0, arg0.field4535, arg0.field4535, arg0.field4537);
        var10.method1085(arg0.field4533, arg0.field4540, arg0.field4534, arg0.field4536);
        return var10;
    }

    @OriginalMember(owner = "client!er", name = "A", descriptor = "(I)V", line = 4368)
    private final void method894(int arg0) {
        OpenGL.glMatrixMode(5889);
        ++field1190;
        OpenGL.glLoadMatrixf(this.field1455, 0);
        OpenGL.glMatrixMode(5888);
        if (arg0 > -33) {
            this.method878(-64);
        }
    }

    @OriginalMember(owner = "client!er", name = "YA", descriptor = "(IIII)V", line = 4381)
    public final void method309(int arg0, int arg1, int arg2, int arg3) {
        ++field1167;
        if (!this.field1440) {
            throw new RuntimeException("");
        } else {
            this.field1450 = arg3;
            this.field1464 = arg2;
            this.field1395 = arg0;
            this.field1431 = arg1;
            if (this.field1396) {
                this.field1315.field8408.method2036(false);
                this.field1315.field8408.method2038(-121);
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "B", descriptor = "(I)V", line = 4406)
    public final void method895(int arg0) {
        OpenGL.glLightfv(16384, 4611, this.field1381, 0);
        if (arg0 != 128) {
            this.method892(true, 86, 87, false, (byte[]) null);
        }
        ++field1228;
        OpenGL.glLightfv(16385, 4611, this.field1367, 0);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIIILua;II)V", line = 4418)
    public final void method316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class617 arg6, int arg7, int arg8) {
        ++field1280;
        class385 var10 = (class385) arg6;
        class197 var11 = var10.field5984;
        this.method822(true);
        this.method856(false, var10.field5984);
        this.method889(61, arg5);
        this.method857(8960, 8448, 7681);
        this.method844(768, 34167, 0, (byte) -102);
        float var12 = var11.field3238 / (float) var11.field3231;
        float var13 = var11.field3240 / (float) var11.field3236;
        float var14 = (float) (-arg0) + (float) arg2;
        float var15 = (float) (-arg1) + (float) arg3;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var17 = var14 * var16;
        float var18 = var15 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (-arg7 + arg0) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method844(768, 5890, 0, (byte) -102);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ltt;I)V", line = 4460)
    public final void method320(class79 arg0, int arg1) {
        this.field1318.method3696(arg0, this, (byte) 127, arg1);
        ++field1296;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "([I)V", line = 4469)
    public final void method268(int[] arg0) {
        ++field1211;
        arg0[1] = this.field1242;
        arg0[0] = this.field1273;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljaclib/memory/Buffer;IIIZ)Lvd;", line = 4479)
    public final class36 method896(Buffer arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg1 != 768) {
            return null;
        } else {
            ++field1183;
            return (class36) (!this.field1378 || arg4 && !this.field1366 ? new class111(this, arg2, arg0) : new class288(this, arg2, arg0, arg3, arg4));
        }
    }

    @OriginalMember(owner = "client!er", name = "C", descriptor = "(I)V", line = 4496)
    private final void method897(int arg0) {
        if (arg0 != -24727) {
            this.method900((byte) 102);
        }
        if (this.field1390 >= this.field1466 && this.field1467 <= this.field1429) {
            OpenGL.glScissor(this.field1474 + this.field1466, this.field1401 - -this.field1242 + -this.field1429, -this.field1466 + this.field1390, this.field1429 - this.field1467);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        ++field1150;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IZII[B)Lvd;", line = 4514)
    public final class36 method898(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        ++field1213;
        if (!this.field1378 || arg1 && !this.field1366) {
            int var6 = -101 % ((29 - arg3) / 53);
            return new class111(this, arg0, arg4, arg2);
        } else {
            return new class288(this, arg0, arg4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!er", name = "j", descriptor = "(II)V", line = 4533)
    public final synchronized void method899(int arg0, int arg1) {
        if (arg0 == 1) {
            ++field1284;
            class66 var3 = new class66();
            var3.field844 = (long) arg1;
            this.field1352.method3463((byte) -87, var3);
        }
    }

    @OriginalMember(owner = "client!er", name = "k", descriptor = "(B)V", line = 4550)
    private final void method900(byte arg0) {
        ++field1223;
        class360.field5714[1] = this.field1444 * this.field1365;
        class360.field5714[3] = 1.0F;
        class360.field5714[2] = this.field1444 * this.field1441;
        class360.field5714[0] = this.field1444 * this.field1425;
        OpenGL.glLightfv(16384, 4609, class360.field5714, 0);
        class360.field5714[2] = -this.field1473 * this.field1441;
        if (arg0 > -15) {
            this.field1344 = null;
        }
        class360.field5714[0] = -this.field1473 * this.field1425;
        class360.field5714[1] = -this.field1473 * this.field1365;
        class360.field5714[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class360.field5714, 0);
    }

    @OriginalMember(owner = "client!er", name = "FA", descriptor = "(ILua;II)V", line = 4570)
    public final void method310(int arg0, class617 arg1, int arg2, int arg3) {
        ++field1182;
        class385 var5 = (class385) arg1;
        class197 var6 = var5.field5984;
        this.method822(true);
        this.method856(false, var5.field5984);
        this.method889(124, 1);
        this.method857(8960, 8448, 7681);
        this.method844(768, 34167, 0, (byte) -102);
        float var7 = var6.field3238 / (float) var6.field3231;
        float var8 = var6.field3240 / (float) var6.field3236;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field1466) * var7, (float) (-arg3 + this.field1467) * var8);
        OpenGL.glVertex2i(this.field1466, this.field1467);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field1466) * var7, (float) (-arg3 + this.field1429) * var8);
        OpenGL.glVertex2i(this.field1466, this.field1429);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field1390) * var7, (float) (this.field1429 - arg3) * var8);
        OpenGL.glVertex2i(this.field1390, this.field1429);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field1390) * var7, (float) (-arg3 + this.field1467) * var8);
        OpenGL.glVertex2i(this.field1390, this.field1467);
        OpenGL.glEnd();
        this.method844(768, 5890, 0, (byte) -102);
    }

    @OriginalMember(owner = "client!er", name = "XA", descriptor = "(IIIII)V", line = 4602)
    public final void method279(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method872(125);
        ++field1310;
        this.method889(89, arg4);
        float var6 = (float) arg0 + 0.35F;
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lq;)V", line = 4622)
    public final void method346(class393 arg0) {
        this.field1355.method512(arg0);
        ++field1220;
        this.field1363.method512(this.field1355);
        this.field1363.method520(25);
        this.field1364.method507(16383, this.field1363);
        if (~this.field1412 != -2) {
            this.method846(0);
        }
    }

    @OriginalMember(owner = "client!er", name = "l", descriptor = "(B)V", line = 4638)
    private final void method901(byte arg0) {
        if (this.field1462 && !this.field1469) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
        ++field1136;
        if (arg0 <= 125) {
            this.method288();
        }
    }

    @OriginalMember(owner = "client!er", name = "l", descriptor = "()Z", line = 4655)
    public final boolean method305() {
        ++field1172;
        return true;
    }

    @OriginalMember(owner = "client!er", name = "p", descriptor = "()Z", line = 4664)
    public final boolean method307() {
        ++field1132;
        return true;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIII)V", line = 4676)
    public final void method344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1199;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 + -1.0F;
        this.method872(88);
        float var10 = (float) arg3 + var8 - 1.0F;
        this.method889(113, arg5);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field1417) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field1417) {
            OpenGL.glEnable(32925);
        }
    }
}
