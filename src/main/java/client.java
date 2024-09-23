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
    private boolean field990 = false;

    @OriginalMember(owner = "client", name = "H", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field994 = new CRC32();

    @OriginalMember(owner = "client", name = "I", descriptor = "Z")
    private boolean field995 = false;

    @OriginalMember(owner = "client", name = "U", descriptor = "Lob;")
    private LinkList field1007 = new LinkList(5);

    @OriginalMember(owner = "client", name = "V", descriptor = "Z")
    private boolean field1008 = false;

    @OriginalMember(owner = "client", name = "X", descriptor = "Z")
    private boolean field1010 = false;

    @OriginalMember(owner = "client", name = "Y", descriptor = "B")
    private byte field1011 = 9;

    @OriginalMember(owner = "client", name = "Z", descriptor = "Lob;")
    private LinkList field1012 = new LinkList(5);

    @OriginalMember(owner = "client", name = "cb", descriptor = "Z")
    private boolean field1015 = false;

    @OriginalMember(owner = "client", name = "db", descriptor = "Z")
    private boolean field1016 = true;

    @OriginalMember(owner = "client", name = "eb", descriptor = "[I")
    private int[] field1017 = new int[100];

    @OriginalMember(owner = "client", name = "hb", descriptor = "[[[Lob;")
    private LinkList[][][] field1020 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "tb", descriptor = "I")
    private int field1032 = 78;

    @OriginalMember(owner = "client", name = "vb", descriptor = "B")
    private byte field1034 = 71;

    @OriginalMember(owner = "client", name = "wb", descriptor = "B")
    private byte field1035 = 0;

    @OriginalMember(owner = "client", name = "xb", descriptor = "Z")
    private boolean field1036 = false;

    @OriginalMember(owner = "client", name = "yb", descriptor = "Z")
    private boolean field1037 = false;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field1039 = 3073;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "[J")
    private long[] field1040 = new long[100];

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field1041 = -1;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field1045 = 2;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "Ljava/lang/String;")
    private String field1050 = "";

    @OriginalMember(owner = "client", name = "Mb", descriptor = "B")
    private byte field1051 = 7;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "[I")
    private int[] field1052 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Rb", descriptor = "[Ljava/lang/String;")
    private String[] field1056 = new String[100];

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field1057 = -1;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "Z")
    private boolean field1059 = false;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "B")
    private byte field1060 = 8;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field1066 = 7;

    @OriginalMember(owner = "client", name = "hc", descriptor = "[I")
    private int[] field1072 = new int[8];

    @OriginalMember(owner = "client", name = "ic", descriptor = "[Lib;")
    private Pix8[] field1073 = new Pix8[50];

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field1074 = 10;

    @OriginalMember(owner = "client", name = "kc", descriptor = "[Ljava/lang/String;")
    private String[] field1075 = new String[500];

    @OriginalMember(owner = "client", name = "lc", descriptor = "[I")
    private int[] field1076 = new int[256];

    @OriginalMember(owner = "client", name = "nc", descriptor = "[I")
    private int[] field1078 = new int[4000];

    @OriginalMember(owner = "client", name = "oc", descriptor = "[I")
    private int[] field1079 = new int[4000];

    @OriginalMember(owner = "client", name = "qc", descriptor = "Z")
    private boolean field1081 = false;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field1088 = 962;

    @OriginalMember(owner = "client", name = "yc", descriptor = "Z")
    private boolean field1089 = false;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "[Lbc;")
    private CollisionMap[] field1092 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "Dc", descriptor = "Z")
    private boolean field1094 = false;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "Z")
    private boolean field1095 = false;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "Ljava/lang/String;")
    private String field1098 = "";

    @OriginalMember(owner = "client", name = "Ic", descriptor = "Ljava/lang/String;")
    private String field1099 = "";

    @OriginalMember(owner = "client", name = "Jc", descriptor = "Ljava/lang/String;")
    private String field1100 = "";

    @OriginalMember(owner = "client", name = "Kc", descriptor = "Lob;")
    private LinkList field1101 = new LinkList(5);

    @OriginalMember(owner = "client", name = "Lc", descriptor = "Z")
    private boolean field1102 = false;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field1104 = 2048;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field1105 = 2047;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "[Lz;")
    private PlayerEntity[] field1106 = new PlayerEntity[this.field1104];

    @OriginalMember(owner = "client", name = "Rc", descriptor = "[I")
    public int[] field1108 = new int[this.field1104];

    @OriginalMember(owner = "client", name = "Tc", descriptor = "[I")
    private int[] field1110 = new int[this.field1104];

    @OriginalMember(owner = "client", name = "Uc", descriptor = "[Lkb;")
    private Packet[] field1111 = new Packet[this.field1104];

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field1112 = -1;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field1113 = -1;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "Z")
    private boolean field1116 = false;

    @OriginalMember(owner = "client", name = "bd", descriptor = "Z")
    private boolean field1118 = false;

    @OriginalMember(owner = "client", name = "dd", descriptor = "[Z")
    private boolean[] field1120 = new boolean[5];

    @OriginalMember(owner = "client", name = "gd", descriptor = "[I")
    private int[] field1123 = new int[1000];

    @OriginalMember(owner = "client", name = "hd", descriptor = "[I")
    private int[] field1124 = new int[1000];

    @OriginalMember(owner = "client", name = "id", descriptor = "Z")
    private boolean field1125 = false;

    @OriginalMember(owner = "client", name = "pd", descriptor = "[I")
    private int[] field1132 = new int[50];

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field1134 = -374;

    @OriginalMember(owner = "client", name = "sd", descriptor = "I")
    private int field1135 = 42788;

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private int field1136 = -23085;

    @OriginalMember(owner = "client", name = "vd", descriptor = "[I")
    private int[] field1138 = new int[100];

    @OriginalMember(owner = "client", name = "wd", descriptor = "Ljava/lang/String;")
    private String field1139 = "";

    @OriginalMember(owner = "client", name = "xd", descriptor = "B")
    private byte field1140 = -48;

    @OriginalMember(owner = "client", name = "zd", descriptor = "[I")
    private int[] field1142 = new int[33];

    @OriginalMember(owner = "client", name = "Bd", descriptor = "[I")
    private int[] field1144 = new int[5];

    @OriginalMember(owner = "client", name = "Nd", descriptor = "[I")
    private int[] field1156 = new int[151];

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private int field1162 = -878;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private int field1164 = 647;

    @OriginalMember(owner = "client", name = "ae", descriptor = "[Ljava/lang/String;")
    private String[] field1169 = new String[100];

    @OriginalMember(owner = "client", name = "be", descriptor = "[I")
    private int[] field1170 = new int[33];

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field1175 = 7;

    @OriginalMember(owner = "client", name = "ie", descriptor = "[I")
    private int[] field1177 = new int[2000];

    @OriginalMember(owner = "client", name = "pe", descriptor = "[I")
    private int[] field1184 = new int[5];

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private final int field1185 = 100;

    @OriginalMember(owner = "client", name = "re", descriptor = "[I")
    private int[] field1186 = new int[100];

    @OriginalMember(owner = "client", name = "se", descriptor = "Z")
    private boolean field1187 = false;

    @OriginalMember(owner = "client", name = "ue", descriptor = "[I")
    public int[] field1189 = new int[1000];

    @OriginalMember(owner = "client", name = "ye", descriptor = "Z")
    private boolean field1193 = false;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field1194 = -984;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "[I")
    private int[] field1195 = new int[50];

    @OriginalMember(owner = "client", name = "De", descriptor = "[Lhb;")
    private Pix32[] field1198 = new Pix32[20];

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field1199 = 3353893;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field1200 = -14722;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "[I")
    private int[] field1201 = new int[500];

    @OriginalMember(owner = "client", name = "He", descriptor = "[I")
    private int[] field1202 = new int[500];

    @OriginalMember(owner = "client", name = "Ie", descriptor = "[I")
    private int[] field1203 = new int[500];

    @OriginalMember(owner = "client", name = "Je", descriptor = "[I")
    private int[] field1204 = new int[500];

    @OriginalMember(owner = "client", name = "Ke", descriptor = "[B")
    private byte[] field1205 = new byte[16384];

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field1208 = 2;

    @OriginalMember(owner = "client", name = "Te", descriptor = "[[I")
    private int[][] field1214 = new int[104][104];

    @OriginalMember(owner = "client", name = "Ue", descriptor = "[I")
    private int[] field1215 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field1216 = 801;

    @OriginalMember(owner = "client", name = "We", descriptor = "[I")
    private int[] field1217 = new int[151];

    @OriginalMember(owner = "client", name = "Xe", descriptor = "Lob;")
    private LinkList field1218 = new LinkList(5);

    @OriginalMember(owner = "client", name = "df", descriptor = "[I")
    private int[] field1224 = new int[5];

    @OriginalMember(owner = "client", name = "ef", descriptor = "[Ljava/lang/String;")
    private String[] field1225 = new String[100];

    @OriginalMember(owner = "client", name = "kf", descriptor = "I")
    private int field1230 = 1;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field1231 = 7759444;

    @OriginalMember(owner = "client", name = "mf", descriptor = "[Lhb;")
    private Pix32[] field1232 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field1233 = -1;

    @OriginalMember(owner = "client", name = "of", descriptor = "[[I")
    private int[][] field1234 = new int[104][104];

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field1236 = 2301979;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field1237 = -984;

    @OriginalMember(owner = "client", name = "sf", descriptor = "[I")
    private int[] field1238 = new int[7];

    @OriginalMember(owner = "client", name = "tf", descriptor = "[Lhb;")
    private Pix32[] field1239 = new Pix32[50];

    @OriginalMember(owner = "client", name = "uf", descriptor = "Lec;")
    private Component field1240 = new Component();

    @OriginalMember(owner = "client", name = "vf", descriptor = "B")
    private byte field1241 = -48;

    @OriginalMember(owner = "client", name = "wf", descriptor = "Ljava/lang/String;")
    private String field1242 = "";

    @OriginalMember(owner = "client", name = "xf", descriptor = "Z")
    private boolean field1243 = false;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "[I")
    private final int[] field1255 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "Kf", descriptor = "Lkb;")
    private Packet field1256 = Packet.method190(1, 32206);

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field1257 = 5063219;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "Z")
    private boolean field1261 = false;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field1262 = 3;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "Z")
    private boolean field1263 = true;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "[[I")
    private int[][] field1266 = new int[104][104];

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field1268 = 2;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "Z")
    private boolean field1271 = false;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field1278 = 128;

    @OriginalMember(owner = "client", name = "ng", descriptor = "B")
    private byte field1285 = 7;

    @OriginalMember(owner = "client", name = "ug", descriptor = "Lkb;")
    private Packet field1292 = Packet.method190(1, 32206);

    @OriginalMember(owner = "client", name = "Ag", descriptor = "Lob;")
    private LinkList field1298 = new LinkList(5);

    @OriginalMember(owner = "client", name = "Eg", descriptor = "Ljava/lang/String;")
    private String field1302 = "";

    @OriginalMember(owner = "client", name = "Fg", descriptor = "[I")
    private int[] field1303 = new int[50];

    @OriginalMember(owner = "client", name = "Gg", descriptor = "[I")
    private int[] field1304 = new int[5];

    @OriginalMember(owner = "client", name = "Hg", descriptor = "B")
    private byte field1305 = 2;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field1307 = -40161;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private int field1308 = 4;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "[Lhb;")
    private Pix32[] field1313 = new Pix32[8];

    @OriginalMember(owner = "client", name = "Qg", descriptor = "Lkb;")
    private Packet field1314 = Packet.method190(1, 32206);

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field1317 = -1;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "[Ly;")
    private NpcEntity[] field1319 = new NpcEntity[8192];

    @OriginalMember(owner = "client", name = "Xg", descriptor = "[I")
    public int[] field1321 = new int[8192];

    @OriginalMember(owner = "client", name = "Yg", descriptor = "[I")
    private int[] field1322 = new int[5];

    @OriginalMember(owner = "client", name = "bh", descriptor = "Z")
    private boolean field1325 = true;

    @OriginalMember(owner = "client", name = "ch", descriptor = "[J")
    private long[] field1326 = new long[100];

    @OriginalMember(owner = "client", name = "dh", descriptor = "Z")
    private boolean field1327 = false;

    @OriginalMember(owner = "client", name = "eh", descriptor = "Ljava/lang/String;")
    private String field1328 = "";

    @OriginalMember(owner = "client", name = "fh", descriptor = "Ljava/lang/String;")
    private String field1329 = "";

    @OriginalMember(owner = "client", name = "ih", descriptor = "Z")
    private boolean field1332 = false;

    @OriginalMember(owner = "client", name = "lh", descriptor = "[Lhb;")
    private Pix32[] field1335 = new Pix32[20];

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field1336 = -1;

    @OriginalMember(owner = "client", name = "xh", descriptor = "Z")
    private boolean field1347 = false;

    @OriginalMember(owner = "client", name = "yh", descriptor = "Ljava/lang/String;")
    private String field1348 = "127.0.0.1";

    @OriginalMember(owner = "client", name = "fb", descriptor = "Z")
    private static boolean field1018 = true;

    @OriginalMember(owner = "client", name = "gb", descriptor = "[I")
    public static final int[] field1019 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client", name = "sb", descriptor = "I")
    private static int field1031 = 460;

    @OriginalMember(owner = "client", name = "ub", descriptor = "[I")
    private static int[] field1033 = new int[99];

    @OriginalMember(owner = "client", name = "Kb", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1049;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "Ljava/lang/String;")
    private static String field1115;

    @OriginalMember(owner = "client", name = "yd", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1141;

    @OriginalMember(owner = "client", name = "ve", descriptor = "Z")
    private static boolean field1190;

    @OriginalMember(owner = "client", name = "vg", descriptor = "[[I")
    public static final int[][] field1293;

    @OriginalMember(owner = "client", name = "ab", descriptor = "I")
    private int field1013;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field1014;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field1022;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field1023;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field1024;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field1025;

    @OriginalMember(owner = "client", name = "nb", descriptor = "I")
    private int field1026;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field1038;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field1044;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field1054;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field1055;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field1062;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field1063;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field1065;

    @OriginalMember(owner = "client", name = "cc", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field1069;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field1077;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field1093;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field1097;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private int field1103;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field1107;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field1109;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field1117;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private int field1121;

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field1122;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private int field1126;

    @OriginalMember(owner = "client", name = "kd", descriptor = "I")
    private int field1127;

    @OriginalMember(owner = "client", name = "ld", descriptor = "I")
    private int field1128;

    @OriginalMember(owner = "client", name = "md", descriptor = "I")
    private int field1129;

    @OriginalMember(owner = "client", name = "nd", descriptor = "I")
    private int field1130;

    @OriginalMember(owner = "client", name = "od", descriptor = "I")
    private int field1131;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field1133;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field1137;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field1145;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field1146;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field1147;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field1149;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private int field1157;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private int field1158;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "I")
    private int field1159;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private int field1160;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field1161;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    private int field1165;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "I")
    private int field1166;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field1167;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private int field1168;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field1171;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field1172;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field1173;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field1174;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field1176;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field1178;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field1188;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private static int field1196;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field1206;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field1207;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field1210;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field1211;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client", name = "Se", descriptor = "I")
    private int field1213;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field1219;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client", name = "af", descriptor = "I")
    private int field1221;

    @OriginalMember(owner = "client", name = "bf", descriptor = "I")
    private int field1222;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field1223;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field1226;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field1229;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private int field1258;

    @OriginalMember(owner = "client", name = "Nf", descriptor = "I")
    private int field1259;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field1260;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field1265;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field1267;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field1270;

    @OriginalMember(owner = "client", name = "ag", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field1273;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field1274;

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    private int field1275;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private int field1276;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field1277;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field1280;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field1281;

    @OriginalMember(owner = "client", name = "kg", descriptor = "I")
    private int field1282;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field1287;

    @OriginalMember(owner = "client", name = "qg", descriptor = "I")
    private int field1288;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "I")
    private int field1306;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "I")
    private int field1320;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private int field1323;

    @OriginalMember(owner = "client", name = "ah", descriptor = "I")
    private int field1324;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client", name = "hh", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client", name = "E", descriptor = "I")
    private int field991;

    @OriginalMember(owner = "client", name = "F", descriptor = "I")
    private int field992;

    @OriginalMember(owner = "client", name = "G", descriptor = "I")
    private int field993;

    @OriginalMember(owner = "client", name = "J", descriptor = "I")
    private int field996;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "J")
    private long field1197;

    @OriginalMember(owner = "client", name = "cd", descriptor = "Ld;")
    private ClientStream field1119;

    @OriginalMember(owner = "client", name = "O", descriptor = "Ltb;")
    private Isaac field1001;

    @OriginalMember(owner = "client", name = "wc", descriptor = "Lub;")
    private Jagfile field1087;

    @OriginalMember(owner = "client", name = "Db", descriptor = "Lhb;")
    private Pix32 field1042;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Lhb;")
    private Pix32 field1043;

    @OriginalMember(owner = "client", name = "ke", descriptor = "Lhb;")
    private Pix32 field1179;

    @OriginalMember(owner = "client", name = "le", descriptor = "Lhb;")
    private Pix32 field1180;

    @OriginalMember(owner = "client", name = "me", descriptor = "Lhb;")
    private Pix32 field1181;

    @OriginalMember(owner = "client", name = "ne", descriptor = "Lhb;")
    private Pix32 field1182;

    @OriginalMember(owner = "client", name = "we", descriptor = "Lhb;")
    private Pix32 field1191;

    @OriginalMember(owner = "client", name = "xe", descriptor = "Lhb;")
    private Pix32 field1192;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "Lhb;")
    private Pix32 field1253;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "Lhb;")
    private Pix32 field1309;

    @OriginalMember(owner = "client", name = "P", descriptor = "Lib;")
    private Pix8 field1002;

    @OriginalMember(owner = "client", name = "Q", descriptor = "Lib;")
    private Pix8 field1003;

    @OriginalMember(owner = "client", name = "R", descriptor = "Lib;")
    private Pix8 field1004;

    @OriginalMember(owner = "client", name = "S", descriptor = "Lib;")
    private Pix8 field1005;

    @OriginalMember(owner = "client", name = "T", descriptor = "Lib;")
    private Pix8 field1006;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "Lib;")
    private Pix8 field1046;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "Lib;")
    private Pix8 field1047;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "Lib;")
    private Pix8 field1048;

    @OriginalMember(owner = "client", name = "rc", descriptor = "Lib;")
    private Pix8 field1082;

    @OriginalMember(owner = "client", name = "sc", descriptor = "Lib;")
    private Pix8 field1083;

    @OriginalMember(owner = "client", name = "tc", descriptor = "Lib;")
    private Pix8 field1084;

    @OriginalMember(owner = "client", name = "uc", descriptor = "Lib;")
    private Pix8 field1085;

    @OriginalMember(owner = "client", name = "vc", descriptor = "Lib;")
    private Pix8 field1086;

    @OriginalMember(owner = "client", name = "gf", descriptor = "Lib;")
    private Pix8 field1227;

    @OriginalMember(owner = "client", name = "hf", descriptor = "Lib;")
    private Pix8 field1228;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "Lib;")
    private Pix8 field1299;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "Lib;")
    private Pix8 field1300;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "Lib;")
    private Pix8 field1301;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "Lib;")
    private Pix8 field1315;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "Lib;")
    private Pix8 field1316;

    @OriginalMember(owner = "client", name = "jh", descriptor = "Lib;")
    private Pix8 field1333;

    @OriginalMember(owner = "client", name = "kh", descriptor = "Lib;")
    private Pix8 field1334;

    @OriginalMember(owner = "client", name = "ob", descriptor = "Ljb;")
    private PixFont field1027;

    @OriginalMember(owner = "client", name = "pb", descriptor = "Ljb;")
    private PixFont field1028;

    @OriginalMember(owner = "client", name = "qb", descriptor = "Ljb;")
    private PixFont field1029;

    @OriginalMember(owner = "client", name = "rb", descriptor = "Ljb;")
    private PixFont field1030;

    @OriginalMember(owner = "client", name = "N", descriptor = "Lqb;")
    private PixMap field1000;

    @OriginalMember(owner = "client", name = "yf", descriptor = "Lqb;")
    private PixMap field1244;

    @OriginalMember(owner = "client", name = "zf", descriptor = "Lqb;")
    private PixMap field1245;

    @OriginalMember(owner = "client", name = "Af", descriptor = "Lqb;")
    private PixMap field1246;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "Lqb;")
    private PixMap field1247;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "Lqb;")
    private PixMap field1248;

    @OriginalMember(owner = "client", name = "Df", descriptor = "Lqb;")
    private PixMap field1249;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Lqb;")
    private PixMap field1250;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "Lqb;")
    private PixMap field1251;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "Lqb;")
    private PixMap field1252;

    @OriginalMember(owner = "client", name = "wg", descriptor = "Lqb;")
    private PixMap field1294;

    @OriginalMember(owner = "client", name = "xg", descriptor = "Lqb;")
    private PixMap field1295;

    @OriginalMember(owner = "client", name = "yg", descriptor = "Lqb;")
    private PixMap field1296;

    @OriginalMember(owner = "client", name = "nh", descriptor = "Lqb;")
    private PixMap field1337;

    @OriginalMember(owner = "client", name = "oh", descriptor = "Lqb;")
    private PixMap field1338;

    @OriginalMember(owner = "client", name = "ph", descriptor = "Lqb;")
    private PixMap field1339;

    @OriginalMember(owner = "client", name = "qh", descriptor = "Lqb;")
    private PixMap field1340;

    @OriginalMember(owner = "client", name = "rh", descriptor = "Lqb;")
    private PixMap field1341;

    @OriginalMember(owner = "client", name = "sh", descriptor = "Lqb;")
    private PixMap field1342;

    @OriginalMember(owner = "client", name = "th", descriptor = "Lqb;")
    private PixMap field1343;

    @OriginalMember(owner = "client", name = "uh", descriptor = "Lqb;")
    private PixMap field1344;

    @OriginalMember(owner = "client", name = "vh", descriptor = "Lqb;")
    private PixMap field1345;

    @OriginalMember(owner = "client", name = "wh", descriptor = "Lqb;")
    private PixMap field1346;

    @OriginalMember(owner = "client", name = "K", descriptor = "Lqb;")
    private PixMap field997;

    @OriginalMember(owner = "client", name = "L", descriptor = "Lqb;")
    private PixMap field998;

    @OriginalMember(owner = "client", name = "M", descriptor = "Lqb;")
    private PixMap field999;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "Lz;")
    private PlayerEntity field1053;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "Lr;")
    private World3D field1096;

    @OriginalMember(owner = "client", name = "ib", descriptor = "Ljava/lang/String;")
    private String field1021;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "Ljava/lang/String;")
    public String field1064;

    @OriginalMember(owner = "client", name = "gc", descriptor = "Ljava/lang/String;")
    public String field1071;

    @OriginalMember(owner = "client", name = "Ad", descriptor = "Z")
    private static boolean field1143;

    @OriginalMember(owner = "client", name = "oe", descriptor = "Z")
    private static boolean field1183;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "[I")
    private int[] field1150;

    @OriginalMember(owner = "client", name = "Id", descriptor = "[I")
    private int[] field1151;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "[I")
    private int[] field1152;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "[I")
    private int[] field1153;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "[I")
    private int[] field1154;

    @OriginalMember(owner = "client", name = "Md", descriptor = "[I")
    private int[] field1155;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "[I")
    private int[] field1209;

    @OriginalMember(owner = "client", name = "rg", descriptor = "[I")
    private int[] field1289;

    @OriginalMember(owner = "client", name = "sg", descriptor = "[I")
    private int[] field1290;

    @OriginalMember(owner = "client", name = "tg", descriptor = "[I")
    private int[] field1291;

    @OriginalMember(owner = "client", name = "Ng", descriptor = "[I")
    private int[] field1311;

    @OriginalMember(owner = "client", name = "Og", descriptor = "[I")
    private int[] field1312;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "[Lib;")
    private Pix8[] field1269;

    @OriginalMember(owner = "client", name = "pf", descriptor = "[[B")
    private byte[][] field1235;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "[[B")
    private byte[][] field1318;

    @OriginalMember(owner = "client", name = "W", descriptor = "[[[B")
    private byte[][][] field1009;

    @OriginalMember(owner = "client", name = "pc", descriptor = "[[[I")
    private int[][][] field1080;

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method340(boolean arg0) {
        short var2 = 256;
        if (this.field1287 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1287 > 768) {
                    this.field1152[var3] = this.method437(746, this.field1153[var3], 1024 - this.field1287, this.field1154[var3]);
                } else if (this.field1287 > 256) {
                    this.field1152[var3] = this.field1154[var3];
                } else {
                    this.field1152[var3] = this.method437(746, this.field1154[var3], 256 - this.field1287, this.field1153[var3]);
                }
            }
        } else if (this.field1288 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1288 > 768) {
                    this.field1152[var4] = this.method437(746, this.field1153[var4], 1024 - this.field1288, this.field1155[var4]);
                } else if (this.field1288 > 256) {
                    this.field1152[var4] = this.field1155[var4];
                } else {
                    this.field1152[var4] = this.method437(746, this.field1155[var4], 256 - this.field1288, this.field1153[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1152[var5] = this.field1153[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1247.field655[var6] = this.field1042.field565[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1076[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field1150[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1152[var26];
                    int var30 = this.field1247.field655[var8];
                    this.field1247.field655[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field1247.method228(0, super.field13, 0, this.field1285);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field1248.field655[var10] = this.field1043.field565[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field1076[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field1150[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field1152[var18];
                    int var22 = this.field1248.field655[var16];
                    this.field1248.field655[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field1089 &= arg0;
        this.field1248.method228(661, super.field13, 0, this.field1285);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIB)I")
    public final int method341(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg1 >> 7;
        int var7 = arg2;
        if (arg2 < 3 && (this.field1009[1][var5][var6] & 2) == 2) {
            var7 = arg2 + 1;
        }
        int var8 = arg0 & 127;
        int var9 = arg1 & 127;
        if (arg3 == 9) {
            boolean var10 = false;
        } else {
            this.field1314.method193(6);
        }
        int var11 = (128 - var8) * this.field1080[var7][var5][var6] + this.field1080[var7][var5 + 1][var6] * var8 >> 7;
        int var12 = (128 - var8) * this.field1080[var7][var5][var6 + 1] + this.field1080[var7][var5 + 1][var6 + 1] * var8 >> 7;
        return (128 - var9) * var11 + var9 * var12 >> 7;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method342(int arg0, int arg1) {
        LinkList var3 = this.field1020[this.field1077][arg0][arg1];
        if (var3 == null) {
            this.field1096.method73(this.field1077, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjStackEntity var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method220(); var6 != null; var6 = (ObjStackEntity) var3.method222(35239)) {
                ObjType var14 = ObjType.method265(var6.field290);
                int var15 = var14.field822;
                if (var14.field821) {
                    var15 *= 10;
                }
                if (var15 > var4) {
                    var4 = var15;
                    var5 = var6;
                }
            }
            var3.method218(var5, 0);
            int var7 = -1;
            int var8 = -1;
            for (ObjStackEntity var9 = (ObjStackEntity) var3.method220(); var9 != null; var9 = (ObjStackEntity) var3.method222(35239)) {
                if (var5.field290 != var9.field290 && var7 == -1) {
                    var7 = var9.field290;
                }
                if (var5.field290 != var9.field290 && var9.field290 != var7 && var8 == -1) {
                    var8 = var9.field290;
                }
            }
            Model var10 = null;
            if (var7 != -1) {
                var10 = ObjType.method265(var7).method268();
            }
            Model var11 = null;
            if (var8 != -1) {
                var11 = ObjType.method265(var8).method268();
            }
            int var12 = (arg1 << 7) + arg0 + 1610612736;
            ObjType var13 = ObjType.method265(var5.field290);
            this.field1096.method57(arg0, this.method341(arg0 * 128 + 64, arg1 * 128 + 64, this.field1077, (byte) 9), var13.method268(), var10, var12, var11, arg1, false, this.field1077);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)I")
    public final int method343(boolean arg0) {
        int var2 = 3;
        if (arg0) {
            return 1;
        } else {
            if (this.field1276 < 310) {
                int var3 = this.field1273 >> 7;
                int var4 = this.field1275 >> 7;
                int var5 = this.field1053.field292 >> 7;
                int var6 = this.field1053.field293 >> 7;
                if ((this.field1009[this.field1077][var3][var4] & 4) != 0) {
                    var2 = this.field1077;
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
                        if ((this.field1009[this.field1077][var3][var4] & 4) != 0) {
                            var2 = this.field1077;
                        }
                        var10 += var9;
                        if (var10 >= 65536) {
                            var10 -= 65536;
                            if (var4 < var6) {
                                ++var4;
                            } else if (var4 > var6) {
                                --var4;
                            }
                            if ((this.field1009[this.field1077][var3][var4] & 4) != 0) {
                                var2 = this.field1077;
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
                        if ((this.field1009[this.field1077][var3][var4] & 4) != 0) {
                            var2 = this.field1077;
                        }
                        var12 += var11;
                        if (var12 >= 65536) {
                            var12 -= 65536;
                            if (var3 < var5) {
                                ++var3;
                            } else if (var3 > var5) {
                                --var3;
                            }
                            if ((this.field1009[this.field1077][var3][var4] & 4) != 0) {
                                var2 = this.field1077;
                            }
                        }
                    }
                }
            }
            if ((this.field1009[this.field1077][this.field1053.field292 >> 7][this.field1053.field293 >> 7] & 4) != 0) {
                var2 = this.field1077;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)I")
    public final int method344(int arg0) {
        if (arg0 < 5 || arg0 > 5) {
            this.field1020 = null;
        }
        int var2 = this.method341(this.field1273, this.field1275, this.field1077, (byte) 9);
        return var2 - this.field1274 < 800 && (this.field1009[this.field1077][this.field1273 >> 7][this.field1275 >> 7] & 4) != 0 ? this.field1077 : 3;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method345(int arg0) {
        if (arg0 != 0) {
            this.field1020 = null;
        }
        if (this.field1067 == 0 && this.field1061 == 0) {
            this.field1075[this.field1065] = "Walk here";
            this.field1203[this.field1065] = 404;
            this.field1201[this.field1065] = super.field20;
            this.field1202[this.field1065] = super.field21;
            ++this.field1065;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < Model.field512; ++var3) {
            int var4 = Model.field513[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field1096.method78(this.field1077, var5, var6, var4) >= 0) {
                    LocType var9 = LocType.method253(var8);
                    if (this.field1067 == 1) {
                        this.field1075[this.field1065] = "Use " + this.field1071 + " with @cya@" + var9.field741;
                        this.field1203[this.field1065] = 174;
                        this.field1204[this.field1065] = var4;
                        this.field1201[this.field1065] = var5;
                        this.field1202[this.field1065] = var6;
                        ++this.field1065;
                    } else if (this.field1061 == 1) {
                        if ((this.field1063 & 4) == 4) {
                            this.field1075[this.field1065] = this.field1064 + " @cya@" + var9.field741;
                            this.field1203[this.field1065] = 792;
                            this.field1204[this.field1065] = var4;
                            this.field1201[this.field1065] = var5;
                            this.field1202[this.field1065] = var6;
                            ++this.field1065;
                        }
                    } else {
                        if (var9.field757 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field757[var10] != null) {
                                    this.field1075[this.field1065] = var9.field757[var10] + " @cya@" + var9.field741;
                                    if (var10 == 0) {
                                        this.field1203[this.field1065] = 447;
                                    }
                                    if (var10 == 1) {
                                        this.field1203[this.field1065] = 846;
                                    }
                                    if (var10 == 2) {
                                        this.field1203[this.field1065] = 34;
                                    }
                                    if (var10 == 3) {
                                        this.field1203[this.field1065] = 310;
                                    }
                                    if (var10 == 4) {
                                        this.field1203[this.field1065] = 647;
                                    }
                                    this.field1204[this.field1065] = var4;
                                    this.field1201[this.field1065] = var5;
                                    this.field1202[this.field1065] = var6;
                                    ++this.field1065;
                                }
                            }
                        }
                        this.field1075[this.field1065] = "Examine @cya@" + var9.field741;
                        this.field1203[this.field1065] = 1419;
                        this.field1204[this.field1065] = var4;
                        this.field1201[this.field1065] = var5;
                        this.field1202[this.field1065] = var6;
                        ++this.field1065;
                    }
                }
                if (var7 == 1) {
                    NpcEntity var11 = this.field1319[var8];
                    if (var11.field346.field781 == 1 && (var11.field292 & 127) == 64 && (var11.field293 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field1320; ++var12) {
                            NpcEntity var13 = this.field1319[this.field1321[var12]];
                            if (var13 != null && var11 != var13 && var13.field346.field781 == 1 && var11.field292 == var13.field292 && var11.field293 == var13.field293) {
                                this.method416(var6, this.field1321[var12], var5, var13.field346, -687);
                            }
                        }
                    }
                    this.method416(var6, var8, var5, var11.field346, -687);
                }
                if (var7 == 0) {
                    PlayerEntity var14 = this.field1106[var8];
                    if ((var14.field292 & 127) == 64 && (var14.field293 & 127) == 64) {
                        for (int var15 = 0; var15 < this.field1320; ++var15) {
                            NpcEntity var18 = this.field1319[this.field1321[var15]];
                            if (var18 != null && var18.field346.field781 == 1 && var14.field292 == var18.field292 && var14.field293 == var18.field293) {
                                this.method416(var6, this.field1321[var15], var5, var18.field346, -687);
                            }
                        }
                        for (int var16 = 0; var16 < this.field1107; ++var16) {
                            PlayerEntity var17 = this.field1106[this.field1108[var16]];
                            if (var17 != null && var14 != var17 && var14.field292 == var17.field292 && var14.field293 == var17.field293) {
                                this.method436(0, var17, this.field1108[var16], var6, var5);
                            }
                        }
                    }
                    this.method436(0, var14, var8, var6, var5);
                }
                if (var7 == 3) {
                    LinkList var19 = this.field1020[this.field1077][var5][var6];
                    if (var19 != null) {
                        for (ObjStackEntity var20 = (ObjStackEntity) var19.method221(8); var20 != null; var20 = (ObjStackEntity) var19.method223(true)) {
                            ObjType var21 = ObjType.method265(var20.field290);
                            if (this.field1067 == 1) {
                                this.field1075[this.field1065] = "Use " + this.field1071 + " with @lre@" + var21.field809;
                                this.field1203[this.field1065] = 652;
                                this.field1204[this.field1065] = var20.field290;
                                this.field1201[this.field1065] = var5;
                                this.field1202[this.field1065] = var6;
                                ++this.field1065;
                            } else if (this.field1061 == 1) {
                                if ((this.field1063 & 1) == 1) {
                                    this.field1075[this.field1065] = this.field1064 + " @lre@" + var21.field809;
                                    this.field1203[this.field1065] = 926;
                                    this.field1204[this.field1065] = var20.field290;
                                    this.field1201[this.field1065] = var5;
                                    this.field1202[this.field1065] = var6;
                                    ++this.field1065;
                                }
                            } else {
                                for (int var22 = 4; var22 >= 0; --var22) {
                                    if (var21.field824 != null && var21.field824[var22] != null) {
                                        this.field1075[this.field1065] = var21.field824[var22] + " @lre@" + var21.field809;
                                        if (var22 == 0) {
                                            this.field1203[this.field1065] = 533;
                                        }
                                        if (var22 == 1) {
                                            this.field1203[this.field1065] = 947;
                                        }
                                        if (var22 == 2) {
                                            this.field1203[this.field1065] = 705;
                                        }
                                        if (var22 == 3) {
                                            this.field1203[this.field1065] = 912;
                                        }
                                        if (var22 == 4) {
                                            this.field1203[this.field1065] = 603;
                                        }
                                        this.field1204[this.field1065] = var20.field290;
                                        this.field1201[this.field1065] = var5;
                                        this.field1202[this.field1065] = var6;
                                        ++this.field1065;
                                    } else if (var22 == 2) {
                                        this.field1075[this.field1065] = "Take @lre@" + var21.field809;
                                        this.field1203[this.field1065] = 705;
                                        this.field1204[this.field1065] = var20.field290;
                                        this.field1201[this.field1065] = var5;
                                        this.field1202[this.field1065] = var6;
                                        ++this.field1065;
                                    }
                                }
                                this.field1075[this.field1065] = "Examine @lre@" + var21.field809;
                                this.field1203[this.field1065] = 1585;
                                this.field1204[this.field1065] = var20.field290;
                                this.field1201[this.field1065] = var5;
                                this.field1202[this.field1065] = var6;
                                ++this.field1065;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method346(int arg0) {
        if (this.field1174 == 1) {
            this.field1313[this.field1173 / 100].method169(this.field1172 - 8 - 11, this.field1216, this.field1171 - 8 - 8);
        }
        if (this.field1174 == 2) {
            this.field1313[this.field1173 / 100 + 4].method169(this.field1172 - 8 - 11, this.field1216, this.field1171 - 8 - 8);
        }
        if (this.field1317 != -1) {
            this.method378(this.field1125, Component.field870[this.field1317], 0, 0, 0);
        }
        int var2 = (this.field1053.field292 >> 7) + this.field1210;
        int var3 = (this.field1053.field293 >> 7) + this.field1211;
        if (arg0 >= 8 && arg0 <= 8) {
            if (var2 >= 2944 && var2 < 3392 && var3 >= 3520 && var3 < 6400) {
                this.field1090 = (var3 - 3520) / 8 + 1;
            } else {
                this.field1090 = 0;
            }
            if (!this.field1193) {
                this.method405(0);
                this.method440(this.field1134);
            } else if (this.field1022 == 0) {
                this.method401(9);
            }
            if (this.field1058 == 1) {
                this.field1198[1].method169(296, this.field1216, 5);
            }
            if (this.field1090 > 0) {
                this.field1198[0].method169(296, this.field1216, 472);
                this.field1028.method182(true, 329, 16776960, 484, "Level: " + this.field1090);
            } else if (field1018) {
                int var4 = 16776960;
                Runtime var5 = Runtime.getRuntime();
                long var6 = var5.totalMemory();
                long var8 = var5.freeMemory();
                if (!signlink.sunjava && var6 - var8 > 33554432L && field1114 > field1163 + 500) {
                    this.method382(this.field1307);
                    var5.gc();
                    int var10 = 16711680;
                    field1163 = field1114;
                }
            }
            if (this.field1093 != 0) {
                int var11 = this.field1093 / 50;
                int var12 = var11 / 60;
                int var13 = var11 % 60;
                if (var13 < 10) {
                    this.field1028.method182(true, 329, 16776960, 256, "System update in: " + var12 + ":0" + var13);
                } else {
                    this.field1028.method182(true, 329, 16776960, 256, "System update in: " + var12 + ":" + var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method347(int arg0) {
        SpotAnimEntity var2 = (SpotAnimEntity) this.field1012.method220();
        if (arg0 < 9 || arg0 > 9) {
            field1183 = !field1183;
        }
        while (var2 != null) {
            if (this.field1077 == var2.field400 && !var2.field406) {
                if (field1114 >= var2.field399) {
                    var2.method115(this.field1097, false);
                    if (var2.field406) {
                        var2.method104();
                    } else {
                        this.field1096.method61((Model) null, var2.field403, 5, var2.field402, 0, var2.field401, var2.field400, 0, var2, 60, -1);
                    }
                }
            } else {
                var2.method104();
            }
            var2 = (SpotAnimEntity) this.field1012.method222(35239);
        }
    }

    @OriginalMember(owner = "client", name = "getjinglelen", descriptor = "()I")
    public final int getjinglelen() {
        return signlink.jinglelen;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILec;I)I")
    public final int method348(int arg0, Component arg1, int arg2) {
        if (arg2 != -6815) {
            this.field1164 = 400;
        }
        if (arg1.field884 != null && arg0 < arg1.field884.length) {
            try {
                int[] var4 = arg1.field884[arg0];
                int var5 = 0;
                int var6 = 0;
                while (true) {
                    int var7 = var4[var6++];
                    if (var7 == 0) {
                        return var5;
                    }
                    if (var7 == 1) {
                        var5 += this.field1303[var4[var6++]];
                    }
                    if (var7 == 2) {
                        var5 += this.field1195[var4[var6++]];
                    }
                    if (var7 == 3) {
                        var5 += this.field1132[var4[var6++]];
                    }
                    if (var7 == 4) {
                        Component var8 = Component.field870[var4[var6++]];
                        int var9 = var4[var6++] + 1;
                        for (int var10 = 0; var10 < var8.field871.length; ++var10) {
                            if (var8.field871[var10] == var9) {
                                var5 += var8.field872[var10];
                            }
                        }
                    }
                    if (var7 == 5) {
                        var5 += this.field1177[var4[var6++]];
                    }
                    if (var7 == 6) {
                        var5 += field1033[this.field1195[var4[var6++]] - 1];
                    }
                    if (var7 == 7) {
                        var5 += this.field1177[var4[var6++]] * 100 / 46875;
                    }
                    if (var7 == 8) {
                        var5 += this.field1053.field355;
                    }
                    if (var7 == 9) {
                        for (int var11 = 0; var11 < 19; ++var11) {
                            if (var11 == 18) {
                                var11 = 20;
                            }
                            var5 += this.field1195[var11];
                        }
                    }
                    if (var7 == 10) {
                        Component var12 = Component.field870[var4[var6++]];
                        int var13 = var4[var6++] + 1;
                        for (int var14 = 0; var14 < var12.field871.length; ++var14) {
                            if (var12.field871[var14] == var13) {
                                var5 += 999999999;
                                break;
                            }
                        }
                    }
                    if (var7 == 11) {
                        var5 += this.field1310;
                    }
                    if (var7 == 12) {
                        var5 += this.field1264;
                    }
                }
            } catch (Exception var15) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLjava/lang/String;ILjava/lang/String;)Lub;")
    public final Jagfile method349(int arg0, boolean arg1, String arg2, int arg3, String arg4) {
        if (arg1) {
            field1196 = -388;
        }
        int var6 = 5;
        byte[] var7 = signlink.cacheload(arg4);
        if (var7 != null) {
            this.field994.reset();
            this.field994.update(var7);
            int var8 = (int) this.field994.getValue();
            if (arg0 != var8) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(var7, false);
        } else {
            while (var7 == null) {
                this.method13((byte) -75, arg3, "Requesting " + arg2);
                try {
                    int var10 = 0;
                    DataInputStream var11 = this.method428(arg4 + arg0);
                    byte[] var12 = new byte[6];
                    var11.readFully(var12, 0, 6);
                    Packet var13 = new Packet(var12, 4);
                    var13.field606 = 3;
                    int var14 = var13.method205() + 6;
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
                            this.method13((byte) -75, arg3, "Loading " + arg2 + " - " + var18 + "%");
                        }
                        var10 = var18;
                    }
                    var11.close();
                } catch (IOException var22) {
                    var7 = null;
                    for (int var19 = var6; var19 > 0; --var19) {
                        this.method13((byte) -75, arg3, "Error loading - Will retry in " + var19 + " secs.");
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
            return new Jagfile(var7, false);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method350(int arg0) {
        if (arg0 != 42545) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        Graphics var3 = this.method11(-36374).getGraphics();
        var3.setColor(Color.black);
        var3.fillRect(0, 0, 789, 532);
        this.method4((byte) 7, 1);
        if (this.field1187) {
            this.field1261 = false;
            var3.setFont(new Font("Helvetica", 1, 16));
            var3.setColor(Color.yellow);
            byte var4 = 35;
            var3.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var4);
            int var6 = var4 + 50;
            var3.setColor(Color.white);
            var3.drawString("To fix this try the following (in order):", 30, var6);
            int var7 = var6 + 50;
            var3.setColor(Color.white);
            var3.setFont(new Font("Helvetica", 1, 12));
            var3.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var7);
            int var8 = var7 + 30;
            var3.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var8);
            int var9 = var8 + 30;
            var3.drawString("3: Try using a different game-world", 30, var9);
            int var11 = var9 + 30;
            var3.drawString("4: Try rebooting your computer", 30, var11);
            int var13 = var11 + 30;
            var3.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var13);
        }
        if (this.field1271) {
            this.field1261 = false;
            var3.setFont(new Font("Helvetica", 1, 20));
            var3.setColor(Color.white);
            var3.drawString("Error - unable to load game!", 50, 50);
            var3.drawString("To play RuneScape make sure you play from", 50, 100);
            var3.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1327) {
            this.field1261 = false;
            var3.setColor(Color.yellow);
            byte var5 = 35;
            var3.drawString("Error a copy of RuneScape already appears to be loaded", 30, var5);
            int var10 = var5 + 50;
            var3.setColor(Color.white);
            var3.drawString("To fix this try the following (in order):", 30, var10);
            int var12 = var10 + 50;
            var3.setColor(Color.white);
            var3.setFont(new Font("Helvetica", 1, 12));
            var3.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var12);
            int var14 = var12 + 30;
            var3.drawString("2: Try rebooting your computer, and reloading", 30, var14);
            int var15 = var14 + 30;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)Z")
    public final boolean method351(int arg0) {
        if (arg0 != 0) {
            field1183 = !field1183;
        }
        if (this.field1119 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1119.method30();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1166 == -1) {
                    this.field1119.method31(this.field1256.field605, 0, 1);
                    this.field1166 = this.field1256.field605[0] & 255;
                    if (this.field1001 != null) {
                        this.field1166 = this.field1166 - this.field1001.method238() & 255;
                    }
                    this.field1165 = Protocol.field839[this.field1166];
                    --var2;
                }
                if (this.field1165 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1119.method31(this.field1256.field605, 0, 1);
                    this.field1165 = this.field1256.field605[0] & 255;
                    --var2;
                }
                if (this.field1165 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1119.method31(this.field1256.field605, 0, 2);
                    this.field1256.field606 = 0;
                    this.field1165 = this.field1256.method203();
                    var2 -= 2;
                }
                if (var2 < this.field1165) {
                    return false;
                }
                this.field1256.field606 = 0;
                this.field1119.method31(this.field1256.field605, 0, this.field1165);
                this.field1167 = 0;
                this.field1260 = this.field1259;
                this.field1259 = this.field1258;
                this.field1258 = this.field1166;
                if (this.field1166 == 55) {
                    int var3 = this.field1256.method201();
                    int var4 = this.field1256.method201();
                    int var5 = this.field1256.method203();
                    int var6 = this.field1256.method203();
                    int var7 = -1;
                    for (int var8 = 0; var8 < this.field1209.length; ++var8) {
                        if ((var3 << 8) + var4 == this.field1209[var8]) {
                            var7 = var8;
                        }
                    }
                    if (var7 != -1) {
                        if (this.field1318[var7] == null || this.field1318[var7].length != var6) {
                            this.field1318[var7] = new byte[var6];
                        }
                        this.field1256.method210(this.field1318[var7], this.field1165 - 6, 7, var5);
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 74) {
                    this.field1094 = false;
                    this.field1118 = true;
                    this.field1302 = "";
                    this.field1008 = true;
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 1) {
                    int var9 = this.field1256.method201();
                    int var10 = this.field1256.method201();
                    int var11 = this.field1256.method201();
                    int var12 = this.field1256.method201();
                    this.field1120[var9] = true;
                    this.field1224[var9] = var10;
                    this.field1184[var9] = var11;
                    this.field1304[var9] = var12;
                    this.field1322[var9] = 0;
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 86) {
                    if (this.field1262 == 12) {
                        this.field1102 = true;
                    }
                    this.field1264 = this.field1256.method203();
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 199) {
                    int var13 = this.field1256.method203();
                    int var14 = this.field1256.method203();
                    NpcType var15 = NpcType.method259(var14);
                    Component.field870[var13].field916 = var15.method262(0);
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 78) {
                    int var16 = this.field1256.method201();
                    int var17 = this.field1256.method201();
                    int var18 = -1;
                    for (int var19 = 0; var19 < this.field1209.length; ++var19) {
                        if ((var16 << 8) + var17 == this.field1209[var19]) {
                            var18 = var19;
                        }
                    }
                    if (var18 != -1) {
                        signlink.cachesave("l" + var16 + "_" + var17, this.field1235[var18]);
                        this.field1324 = 1;
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 44 || this.field1166 == 19 || this.field1166 == 114 || this.field1166 == 17 || this.field1166 == 144 || this.field1166 == 96 || this.field1166 == 217 || this.field1166 == 171 || this.field1166 == 140) {
                    this.method353(this.field1256, false, this.field1166);
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 136) {
                    int var20 = this.field1256.method203();
                    int var21 = this.field1256.method203();
                    int var22 = var21 >> 10 & 31;
                    int var23 = var21 >> 5 & 31;
                    int var24 = var21 & 31;
                    Component.field870[var20].field911 = (var24 << 3) + (var22 << 19) + (var23 << 11);
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 187) {
                    int var25 = this.field1256.method203();
                    int var26 = this.field1256.method203();
                    Component.field870[var25].field916 = new Model(var26, 298);
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 168) {
                    this.method362(15093, this.field1256, this.field1165);
                    if (this.field1324 == 1) {
                        this.field1324 = 2;
                        World.field36 = this.field1077;
                        this.method402(0);
                    }
                    if (field1018 && this.field1324 == 2 && World.field36 != this.field1077) {
                        this.field999.method227(-510);
                        this.field1028.method182(true, 151, 0, 257, "Loading - please wait.");
                        this.field1028.method182(true, 150, 16777215, 256, "Loading - please wait.");
                        this.field999.method228(8, super.field13, 11, this.field1285);
                        World.field36 = this.field1077;
                        this.method402(0);
                    }
                    if (this.field1233 != this.field1077 && this.field1324 == 2) {
                        this.field1233 = this.field1077;
                        this.method432(false, this.field1077);
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 76) {
                    this.field1037 = false;
                    for (int var27 = 0; var27 < 5; ++var27) {
                        this.field1120[var27] = false;
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 200) {
                    this.field1262 = this.field1256.method201();
                    this.field1102 = true;
                    this.field1347 = true;
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 34) {
                    this.field1037 = true;
                    this.field1219 = this.field1256.method201();
                    this.field1220 = this.field1256.method201();
                    this.field1221 = this.field1256.method203();
                    this.field1222 = this.field1256.method201();
                    this.field1223 = this.field1256.method201();
                    if (this.field1223 >= 100) {
                        this.field1273 = this.field1219 * 128 + 64;
                        this.field1275 = this.field1220 * 128 + 64;
                        this.field1274 = this.method341(this.field1219, this.field1220, this.field1077, (byte) 9) - this.field1221;
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 227) {
                    int var28 = this.field1256.method203();
                    int var29 = this.field1256.method203();
                    if (this.field1054 == var28 && this.field1055 == var29 && this.field1324 != 0) {
                        this.field1166 = -1;
                        return true;
                    }
                    this.field1054 = var28;
                    this.field1055 = var29;
                    this.field1210 = (this.field1054 - 6) * 8;
                    this.field1211 = (this.field1055 - 6) * 8;
                    this.field1324 = 1;
                    this.field999.method227(-510);
                    this.field1028.method182(true, 151, 0, 257, "Loading - please wait.");
                    this.field1028.method182(true, 150, 16777215, 256, "Loading - please wait.");
                    this.field999.method228(8, super.field13, 11, this.field1285);
                    signlink.looprate(5);
                    int var30 = (this.field1165 - 2) / 10;
                    this.field1318 = new byte[var30][];
                    this.field1235 = new byte[var30][];
                    this.field1209 = new int[var30];
                    this.field1314.method192(160, 188);
                    this.field1314.method193(0);
                    int var31 = 0;
                    for (int var32 = 0; var32 < var30; ++var32) {
                        int var33 = this.field1256.method201();
                        int var34 = this.field1256.method201();
                        int var35 = this.field1256.method206();
                        int var36 = this.field1256.method206();
                        this.field1209[var32] = (var33 << 8) + var34;
                        if (var35 != 0) {
                            byte[] var37 = signlink.cacheload("m" + var33 + "_" + var34);
                            if (var37 != null) {
                                this.field994.reset();
                                this.field994.update(var37);
                                if ((int) this.field994.getValue() != var35) {
                                    var37 = null;
                                }
                            }
                            if (var37 != null) {
                                this.field1318[var32] = var37;
                            } else {
                                this.field1324 = 0;
                                this.field1314.method193(0);
                                this.field1314.method193(var33);
                                this.field1314.method193(var34);
                                var31 += 3;
                            }
                        }
                        if (var36 != 0) {
                            byte[] var38 = signlink.cacheload("l" + var33 + "_" + var34);
                            if (var38 != null) {
                                this.field994.reset();
                                this.field994.update(var38);
                                if ((int) this.field994.getValue() != var36) {
                                    var38 = null;
                                }
                            }
                            if (var38 != null) {
                                this.field1235[var32] = var38;
                            } else {
                                this.field1324 = 0;
                                this.field1314.method193(1);
                                this.field1314.method193(var33);
                                this.field1314.method193(var34);
                                var31 += 3;
                            }
                        }
                    }
                    this.field1314.method200(var31, (byte) -12);
                    signlink.looprate(100);
                    int var39 = this.field1210 - this.field1212;
                    int var40 = this.field1211 - this.field1213;
                    this.field1212 = this.field1210;
                    this.field1213 = this.field1211;
                    for (int var41 = 0; var41 < 8192; ++var41) {
                        NpcEntity var42 = this.field1319[var41];
                        if (var42 != null) {
                            for (int var43 = 0; var43 < 10; ++var43) {
                                var42.field340[var43] -= var39;
                                var42.field341[var43] -= var40;
                            }
                            var42.field292 -= var39 * 128;
                            var42.field293 -= var40 * 128;
                        }
                    }
                    for (int var44 = 0; var44 < this.field1104; ++var44) {
                        PlayerEntity var45 = this.field1106[var44];
                        if (var45 != null) {
                            for (int var46 = 0; var46 < 10; ++var46) {
                                var45.field340[var46] -= var39;
                                var45.field341[var46] -= var40;
                            }
                            var45.field292 -= var39 * 128;
                            var45.field293 -= var40 * 128;
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
                                    this.field1020[var57][var53][var54] = this.field1020[var57][var55][var56];
                                } else {
                                    this.field1020[var57][var53][var54] = null;
                                }
                            }
                        }
                    }
                    for (LocMerged var58 = (LocMerged) this.field1101.method220(); var58 != null; var58 = (LocMerged) this.field1101.method222(35239)) {
                        var58.field620 -= var39;
                        var58.field621 -= var40;
                        if (var58.field620 < 0 || var58.field621 < 0 || var58.field620 >= 104 || var58.field621 >= 104) {
                            var58.method104();
                        }
                    }
                    this.field1037 = false;
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 197) {
                    this.field1102 = true;
                    int var59 = this.field1256.method203();
                    byte var60 = this.field1256.method202();
                    if (this.field1177[var59] != var60) {
                        this.field1177[var59] = var60;
                        this.method363(var59, (byte) 7);
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 141) {
                    for (int var61 = 0; var61 < this.field1106.length; ++var61) {
                        if (this.field1106[var61] != null) {
                            this.field1106[var61].field319 = -1;
                        }
                    }
                    for (int var62 = 0; var62 < this.field1319.length; ++var62) {
                        if (this.field1319[var62] != null) {
                            this.field1319[var62].field319 = -1;
                        }
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 38) {
                    int var63 = this.field1256.method203();
                    int var64 = this.field1256.method203();
                    Component.field870[var63].field918 = var64;
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 134) {
                    this.field1206 = this.field1256.method201();
                    this.field1207 = this.field1256.method201();
                    while (this.field1256.field606 < this.field1165) {
                        int var65 = this.field1256.method201();
                        this.method353(this.field1256, false, var65);
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 204) {
                    this.field1206 = this.field1256.method201();
                    this.field1207 = this.field1256.method201();
                    for (int var66 = this.field1206; var66 < this.field1206 + 8; ++var66) {
                        for (int var67 = this.field1207; var67 < this.field1207 + 8; ++var67) {
                            if (this.field1020[this.field1077][var66][var67] != null) {
                                this.field1020[this.field1077][var66][var67] = null;
                                this.method342(var66, var67);
                            }
                        }
                    }
                    for (LocMerged var68 = (LocMerged) this.field1101.method220(); var68 != null; var68 = (LocMerged) this.field1101.method222(35239)) {
                        if (var68.field620 >= this.field1206 && var68.field620 < this.field1206 + 8 && var68.field621 >= this.field1207 && var68.field621 < this.field1207 + 8 && this.field1077 == var68.field618) {
                            this.method435(true, var68.field618, var68.field627, var68.field621, var68.field620, var68.field619, var68.field625, var68.field626);
                            var68.method104();
                        }
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 163) {
                    this.field1206 = this.field1256.method201();
                    this.field1207 = this.field1256.method201();
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 157) {
                    int var69 = this.field1256.method201();
                    int var70 = this.field1256.method201();
                    int var71 = this.field1256.method203();
                    int var72 = this.field1256.method203();
                    int var73 = -1;
                    for (int var74 = 0; var74 < this.field1209.length; ++var74) {
                        if ((var69 << 8) + var70 == this.field1209[var74]) {
                            var73 = var74;
                        }
                    }
                    if (var73 != -1) {
                        if (this.field1235[var73] == null || this.field1235[var73].length != var72) {
                            this.field1235[var73] = new byte[var72];
                        }
                        this.field1256.method210(this.field1235[var73], this.field1165 - 6, 7, var71);
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 24) {
                    this.field1093 = this.field1256.method203() * 30;
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 131) {
                    int var75 = this.field1256.method203();
                    int var76 = this.field1256.method203();
                    int var77 = this.field1256.method203();
                    Component var78 = Component.field870[var75];
                    Model var79 = var78.field916;
                    if (var79 != null) {
                        var79.method129(var76, var77);
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 20) {
                    long var80 = this.field1256.method207(720);
                    int var82 = this.field1256.method206();
                    boolean var83 = false;
                    for (int var84 = 0; var84 < 100; ++var84) {
                        if (this.field1186[var84] == var82) {
                            var83 = true;
                            break;
                        }
                    }
                    for (int var85 = 0; var85 < this.field1265; ++var85) {
                        if (this.field1040[var85] == var80) {
                            var83 = true;
                            break;
                        }
                    }
                    if (!var83) {
                        this.field1186[this.field1038] = var82;
                        this.field1038 = (this.field1038 + 1) % 100;
                        String var86 = WordPack.method249(-17950, this.field1165 - 12, this.field1256);
                        String var87 = WordFilter.method312((byte) -82, var86);
                        this.method400(var87, 3, this.field1208, JString.method246(-580, JString.method244(true, var80)));
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 85) {
                    this.field1102 = true;
                    int var88 = this.field1256.method201();
                    int var89 = this.field1256.method206();
                    int var90 = this.field1256.method201();
                    this.field1132[var88] = var89;
                    this.field1303[var88] = var90;
                    this.field1195[var88] = 1;
                    for (int var91 = 0; var91 < 98; ++var91) {
                        if (var89 >= field1033[var91]) {
                            this.field1195[var88] = var91 + 2;
                        }
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 95) {
                    this.field1058 = this.field1256.method201();
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 248) {
                    int var92 = this.field1256.method203();
                    boolean var93 = this.field1256.method201() == 1;
                    Component.field870[var92].field890 = var93;
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 253) {
                    this.field1102 = true;
                    int var94 = this.field1256.method203();
                    Component var95 = Component.field870[var94];
                    int var96 = this.field1256.method201();
                    for (int var97 = 0; var97 < var96; ++var97) {
                        var95.field871[var97] = this.field1256.method203();
                        int var98 = this.field1256.method201();
                        if (var98 == 255) {
                            var98 = this.field1256.method206();
                        }
                        var95.field872[var97] = var98;
                    }
                    for (int var99 = var96; var99 < var95.field871.length; ++var99) {
                        var95.field871[var99] = 0;
                        var95.field872[var99] = 0;
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 210) {
                    int var100 = this.field1256.method203();
                    int var101 = this.field1256.method201();
                    this.field1052[var101] = var100;
                    this.field1102 = true;
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 192) {
                    this.method352(this.field1194);
                    this.field1166 = -1;
                    return false;
                }
                if (this.field1166 == 21) {
                    if (this.field1016) {
                        signlink.jingle = this.field1256.method208();
                        signlink.jinglelen = this.field1256.method203();
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 243) {
                    int var102 = this.field1256.method203();
                    Component var103 = Component.field870[var102];
                    for (int var104 = 0; var104 < var103.field871.length; ++var104) {
                        var103.field871[var104] = -1;
                        var103.field871[var104] = 0;
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 115) {
                    int var105 = this.field1256.method203();
                    this.method371(-553, var105);
                    if (this.field1057 != -1) {
                        this.field1057 = -1;
                        this.field1008 = true;
                    }
                    if (this.field1118) {
                        this.field1118 = false;
                        this.field1008 = true;
                    }
                    this.field1336 = var105;
                    this.field1102 = true;
                    this.field1347 = true;
                    this.field1317 = -1;
                    this.field1243 = false;
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 183) {
                    this.method364(this.field1256, this.field1165, 0);
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 87) {
                    int var106 = this.field1256.method203();
                    Component.field870[var106].field916 = this.field1053.method112(true);
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 137) {
                    int var107 = this.field1256.method203();
                    this.method371(-553, var107);
                    if (this.field1336 != -1) {
                        this.field1336 = -1;
                        this.field1102 = true;
                        this.field1347 = true;
                    }
                    if (this.field1057 != -1) {
                        this.field1057 = -1;
                        this.field1008 = true;
                    }
                    if (this.field1118) {
                        this.field1118 = false;
                        this.field1008 = true;
                    }
                    this.field1317 = var107;
                    this.field1243 = false;
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 50) {
                    int var108 = this.field1256.method201();
                    int var109 = this.field1256.method201();
                    int var110 = -1;
                    for (int var111 = 0; var111 < this.field1209.length; ++var111) {
                        if ((var108 << 8) + var109 == this.field1209[var111]) {
                            var110 = var111;
                        }
                    }
                    if (var110 != -1) {
                        signlink.cachesave("m" + var108 + "_" + var109, this.field1318[var110]);
                        this.field1324 = 1;
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 213) {
                    long var112 = this.field1256.method207(720);
                    int var114 = this.field1256.method201();
                    String var115 = JString.method246(-580, JString.method244(true, var112));
                    for (int var116 = 0; var116 < this.field993; ++var116) {
                        if (this.field1326[var116] == var112) {
                            if (this.field1138[var116] != var114) {
                                this.field1138[var116] = var114;
                                this.field1102 = true;
                                if (var114 > 0) {
                                    this.method400(var115 + " has logged in.", 5, this.field1208, "");
                                }
                                if (var114 == 0) {
                                    this.method400(var115 + " has logged out.", 5, this.field1208, "");
                                }
                            }
                            var115 = null;
                            break;
                        }
                    }
                    if (var115 != null && this.field993 < 100) {
                        this.field1326[this.field993] = var112;
                        this.field1056[this.field993] = var115;
                        this.field1138[this.field993] = var114;
                        ++this.field993;
                        this.field1102 = true;
                    }
                    boolean var117 = false;
                    while (!var117) {
                        var117 = true;
                        for (int var118 = 0; var118 < this.field993 - 1; ++var118) {
                            if (this.field1138[var118] != this.field1074 && this.field1138[var118 + 1] == this.field1074 || this.field1138[var118] == 0 && this.field1138[var118 + 1] != 0) {
                                int var119 = this.field1138[var118];
                                this.field1138[var118] = this.field1138[var118 + 1];
                                this.field1138[var118 + 1] = var119;
                                String var120 = this.field1056[var118];
                                this.field1056[var118] = this.field1056[var118 + 1];
                                this.field1056[var118 + 1] = var120;
                                long var121 = this.field1326[var118];
                                this.field1326[var118] = this.field1326[var118 + 1];
                                this.field1326[var118 + 1] = var121;
                                this.field1102 = true;
                                var117 = false;
                            }
                        }
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 212) {
                    if (this.field1262 == 12) {
                        this.field1102 = true;
                    }
                    this.field1310 = this.field1256.method201();
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 54) {
                    int var123 = this.field1256.method203();
                    this.method371(-553, var123);
                    if (this.field1336 != -1) {
                        this.field1336 = -1;
                        this.field1102 = true;
                        this.field1347 = true;
                    }
                    this.field1057 = var123;
                    this.field1008 = true;
                    this.field1317 = -1;
                    this.field1243 = false;
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 98) {
                    this.field1331 = this.field1256.method201();
                    this.field1117 = this.field1256.method201();
                    this.field1176 = this.field1256.method201();
                    this.field1010 = true;
                    this.field1008 = true;
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 16) {
                    this.field1102 = true;
                    int var124 = this.field1256.method203();
                    Component var125 = Component.field870[var124];
                    while (this.field1256.field606 < this.field1165) {
                        int var126 = this.field1256.method201();
                        int var127 = this.field1256.method203();
                        int var128 = this.field1256.method201();
                        if (var128 == 255) {
                            var128 = this.field1256.method206();
                        }
                        if (var126 >= 0 && var126 < var125.field871.length) {
                            var125.field871[var126] = var127;
                            var125.field872[var126] = var128;
                        }
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 128) {
                    int var129 = this.field1256.method203();
                    int var130 = this.field1256.method203();
                    if (this.field1057 != -1) {
                        this.field1057 = -1;
                        this.field1008 = true;
                    }
                    if (this.field1118) {
                        this.field1118 = false;
                        this.field1008 = true;
                    }
                    this.field1317 = var129;
                    this.field1336 = var130;
                    this.field1102 = true;
                    this.field1347 = true;
                    this.field1243 = false;
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 206) {
                    String var131 = this.field1256.method208();
                    if (!var131.equals(this.field1021)) {
                        this.field1021 = var131;
                        if (this.field1016) {
                            signlink.midi = var131;
                        }
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 108) {
                    this.field1041 = this.field1256.method203();
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 240) {
                    if (this.field1336 != -1) {
                        this.field1336 = -1;
                        this.field1102 = true;
                        this.field1347 = true;
                    }
                    if (this.field1057 != -1) {
                        this.field1057 = -1;
                        this.field1008 = true;
                    }
                    if (this.field1118) {
                        this.field1118 = false;
                        this.field1008 = true;
                    }
                    this.field1317 = -1;
                    this.field1243 = false;
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 30) {
                    this.field1102 = true;
                    int var132 = this.field1256.method203();
                    int var133 = this.field1256.method206();
                    if (this.field1177[var132] != var133) {
                        this.field1177[var132] = var133;
                        this.method363(var132, (byte) 7);
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 93) {
                    this.field1037 = true;
                    this.field1145 = this.field1256.method201();
                    this.field1146 = this.field1256.method201();
                    this.field1147 = this.field1256.method203();
                    this.field1148 = this.field1256.method201();
                    this.field1149 = this.field1256.method201();
                    if (this.field1149 >= 100) {
                        int var134 = this.field1145 * 128 + 64;
                        int var135 = this.field1146 * 128 + 64;
                        int var136 = this.method341(this.field1145, this.field1146, this.field1077, (byte) 9) - this.field1147;
                        int var137 = var134 - this.field1273;
                        int var138 = var136 - this.field1274;
                        int var139 = var135 - this.field1275;
                        int var140 = (int) Math.sqrt((double) (var137 * var137 + var139 * var139));
                        this.field1276 = (int) (Math.atan2((double) var138, (double) var140) * 325.949D) & 2047;
                        this.field1277 = (int) (Math.atan2((double) var137, (double) var139) * -325.949D) & 2047;
                        if (this.field1276 < 128) {
                            this.field1276 = 128;
                        }
                        if (this.field1276 > 383) {
                            this.field1276 = 383;
                        }
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 138) {
                    int var141 = this.field1256.method203();
                    String var142 = this.field1256.method208();
                    Component.field870[var141].field909 = var142;
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 10) {
                    int var143 = this.field1256.method203();
                    int var144 = this.field1256.method203();
                    int var145 = this.field1256.method203();
                    ObjType var146 = ObjType.method265(var144);
                    Component.field870[var143].field916 = var146.method268();
                    Component.field870[var143].field921 = var146.field814;
                    Component.field870[var143].field922 = var146.field815;
                    Component.field870[var143].field920 = var146.field813 * 100 / var145;
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 164) {
                    String var147 = this.field1256.method208();
                    if (!var147.endsWith(":tradereq:")) {
                        this.method400(var147, 0, this.field1208, "");
                    } else {
                        String var148 = var147.substring(0, var147.indexOf(":"));
                        long var149 = JString.method243(var148);
                        boolean var151 = false;
                        for (int var152 = 0; var152 < this.field1265; ++var152) {
                            if (this.field1040[var152] == var149) {
                                var151 = true;
                                break;
                            }
                        }
                        if (!var151) {
                            this.method400("wishes to trade with you.", 4, this.field1208, var148);
                        }
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 175) {
                    this.field1265 = this.field1165 / 8;
                    for (int var153 = 0; var153 < this.field1265; ++var153) {
                        this.field1040[var153] = this.field1256.method207(720);
                    }
                    this.field1166 = -1;
                    return true;
                }
                if (this.field1166 == 101) {
                    int var154 = this.field1256.method203();
                    int var155 = this.field1256.method204();
                    int var156 = this.field1256.method204();
                    Component var157 = Component.field870[var154];
                    var157.field882 = var155;
                    var157.field883 = var156;
                    this.field1166 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field1166 + "," + this.field1165 + " - " + this.field1259 + "," + this.field1260);
                this.method352(this.field1194);
            } catch (IOException var161) {
                this.method359(0);
            } catch (Exception var162) {
                String var159 = "T2 - " + this.field1166 + "," + this.field1259 + "," + this.field1260 + " - " + this.field1165 + "," + (this.field1053.field340[0] + this.field1210) + "," + (this.field1053.field341[0] + this.field1211) + " - ";
                for (int var160 = 0; var160 < this.field1165 && var160 < 50; ++var160) {
                    var159 = var159 + this.field1256.field605[var160] + ",";
                }
                signlink.reporterror(var159);
                this.method352(this.field1194);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method352(int arg0) {
        try {
            if (this.field1119 != null) {
                this.field1119.method28();
            }
        } catch (Exception var3) {
        }
        this.field1119 = null;
        this.field1089 = false;
        this.field1270 = 0;
        while (arg0 >= 0) {
            this.field1314.method193(253);
        }
        InputTracking.method34(6);
        this.field1098 = "";
        this.field1099 = "";
        this.field1100 = "";
        this.method382(this.field1307);
        this.field1096.method50(true);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field1092[var2].method272((byte) 5);
        }
        System.gc();
        if (this.field1016) {
            signlink.midi = "null";
        }
        this.field1021 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;ZI)V")
    public final void method353(Packet arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field1020 = null;
        }
        if (arg2 != 140 && arg2 != 171) {
            if (arg2 == 217) {
                int var4 = arg0.method201();
                int var5 = (var4 >> 4 & 7) + this.field1206;
                int var6 = (var4 & 7) + this.field1207;
                int var7 = arg0.method201();
                int var8 = var7 >> 2;
                int var9 = this.field1255[var8];
                int var10 = arg0.method203();
                if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                    int var11 = 0;
                    if (var9 == 1) {
                        var11 = this.field1096.method75(var5, var6, this.field1200, this.field1077);
                    }
                    if (var9 == 2) {
                        var11 = this.field1096.method76(this.field1077, var5, var6);
                    }
                    if (var11 != 0) {
                        LocEntity var12 = new LocEntity(var9, -69, this.field1077, var11 >> 14 & 32767, false, SeqType.field938[var10], var6, var5);
                        this.field1298.method217(var12);
                    }
                }
            } else if (arg2 == 96) {
                int var13 = arg0.method201();
                int var14 = (var13 >> 4 & 7) + this.field1206;
                int var15 = (var13 & 7) + this.field1207;
                int var16 = arg0.method203();
                if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                    ObjStackEntity var17 = new ObjStackEntity();
                    var17.field290 = var16;
                    if (this.field1020[this.field1077][var14][var15] == null) {
                        this.field1020[this.field1077][var14][var15] = new LinkList(5);
                    }
                    this.field1020[this.field1077][var14][var15].method217(var17);
                    this.method342(var14, var15);
                }
            } else if (arg2 == 144) {
                int var18 = arg0.method201();
                int var19 = (var18 >> 4 & 7) + this.field1206;
                int var20 = (var18 & 7) + this.field1207;
                int var21 = arg0.method203();
                if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                    LinkList var22 = this.field1020[this.field1077][var19][var20];
                    if (var22 != null) {
                        for (ObjStackEntity var23 = (ObjStackEntity) var22.method220(); var23 != null; var23 = (ObjStackEntity) var22.method222(35239)) {
                            if ((var21 & 32767) == var23.field290) {
                                var23.method104();
                                break;
                            }
                        }
                        if (var22.method220() == null) {
                            this.field1020[this.field1077][var19][var20] = null;
                        }
                        this.method342(var19, var20);
                    }
                }
            } else if (arg2 == 17) {
                int var24 = arg0.method201();
                int var25 = (var24 >> 4 & 7) + this.field1206;
                int var26 = (var24 & 7) + this.field1207;
                int var27 = var25 + arg0.method202();
                int var28 = var26 + arg0.method202();
                int var29 = arg0.method204();
                int var30 = arg0.method203();
                int var31 = arg0.method201();
                int var32 = arg0.method201();
                int var33 = arg0.method203();
                int var34 = arg0.method203();
                int var35 = arg0.method201();
                int var36 = arg0.method201();
                if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                    int var37 = var25 * 128 + 64;
                    int var38 = var26 * 128 + 64;
                    int var39 = var27 * 128 + 64;
                    int var40 = var28 * 128 + 64;
                    ProjectileEntity var41 = new ProjectileEntity(var37, -35843, field1114 + var34, var36, var30, this.method341(var37, var38, this.field1077, (byte) 9) - var31, this.field1077, var29, field1114 + var33, var35, var38, var32);
                    var41.method113(this.method341(var39, var40, this.field1077, (byte) 9) - var32, var40, field1114 + var33, var39, this.field1263);
                    this.field1218.method217(var41);
                }
            } else if (arg2 == 114) {
                int var42 = arg0.method201();
                int var43 = (var42 >> 4 & 7) + this.field1206;
                int var44 = (var42 & 7) + this.field1207;
                int var45 = arg0.method203();
                int var46 = arg0.method201();
                int var47 = arg0.method203();
                if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                    int var48 = var43 * 128 + 64;
                    int var49 = var44 * 128 + 64;
                    SpotAnimEntity var50 = new SpotAnimEntity(var49, false, this.method341(var48, var49, this.field1077, (byte) 9) - var46, var48, var47, var45, field1114, this.field1077);
                    this.field1012.method217(var50);
                }
            } else if (arg2 == 19) {
                int var51 = arg0.method201();
                int var52 = (var51 >> 4 & 7) + this.field1206;
                int var53 = (var51 & 7) + this.field1207;
                int var54 = arg0.method203();
                int var55 = arg0.method203();
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && this.field1041 != var55) {
                    ObjStackEntity var56 = new ObjStackEntity();
                    var56.field290 = var54;
                    if (this.field1020[this.field1077][var52][var53] == null) {
                        this.field1020[this.field1077][var52][var53] = new LinkList(5);
                    }
                    this.field1020[this.field1077][var52][var53].method217(var56);
                    this.method342(var52, var53);
                }
            } else {
                if (arg2 == 44) {
                    int var57 = arg0.method201();
                    int var58 = (var57 >> 4 & 7) + this.field1206;
                    int var59 = (var57 & 7) + this.field1207;
                    int var60 = arg0.method201();
                    int var61 = var60 >> 2;
                    int var62 = var60 & 3;
                    int var63 = this.field1255[var61];
                    int var64 = arg0.method203();
                    int var65 = arg0.method203();
                    int var66 = arg0.method203();
                    int var67 = arg0.method203();
                    byte var68 = arg0.method202();
                    byte var69 = arg0.method202();
                    byte var70 = arg0.method202();
                    byte var71 = arg0.method202();
                    PlayerEntity var72;
                    if (this.field1041 == var67) {
                        var72 = this.field1053;
                    } else {
                        var72 = this.field1106[var67];
                    }
                    if (var72 != null) {
                        LocSpawned var73 = new LocSpawned(field1114 + var65, var58, var59, var61, false, var63, this.field1077, var62, -1);
                        this.field1007.method217(var73);
                        LocSpawned var74 = new LocSpawned(field1114 + var66, var58, var59, var61, false, var63, this.field1077, var62, var64);
                        this.field1007.method217(var74);
                        int var75 = this.field1080[this.field1077][var58][var59];
                        int var76 = this.field1080[this.field1077][var58 + 1][var59];
                        int var77 = this.field1080[this.field1077][var58 + 1][var59 + 1];
                        int var78 = this.field1080[this.field1077][var58][var59 + 1];
                        LocType var79 = LocType.method253(var64);
                        var72.field358 = field1114 + var65;
                        var72.field359 = field1114 + var66;
                        var72.field363 = var79.method256(var61, var62, var75, var76, var77, var78, -1);
                        int var80 = var79.field745;
                        int var81 = var79.field746;
                        if (var62 == 1 || var62 == 3) {
                            var80 = var79.field746;
                            var81 = var79.field745;
                        }
                        var72.field360 = var58 * 128 + var80 * 64;
                        var72.field362 = var59 * 128 + var81 * 64;
                        var72.field361 = this.method341(var72.field360, var72.field362, this.field1077, (byte) 9);
                        if (var68 > var70) {
                            byte var82 = var68;
                            var68 = var70;
                            var70 = var82;
                        }
                        if (var69 > var71) {
                            byte var83 = var69;
                            var69 = var71;
                            var71 = var83;
                        }
                        var72.field364 = var58 + var68;
                        var72.field366 = var58 + var70;
                        var72.field365 = var59 + var69;
                        var72.field367 = var59 + var71;
                        return;
                    }
                }
            }
        } else {
            int var84 = arg0.method201();
            int var85 = (var84 >> 4 & 7) + this.field1206;
            int var86 = (var84 & 7) + this.field1207;
            int var87 = arg0.method201();
            int var88 = var87 >> 2;
            int var89 = var87 & 3;
            int var90 = this.field1255[var88];
            int var91;
            if (arg2 == 171) {
                var91 = -1;
            } else {
                var91 = arg0.method203();
            }
            if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                LocMerged var92 = null;
                for (LocMerged var93 = (LocMerged) this.field1101.method220(); var93 != null; var93 = (LocMerged) this.field1101.method222(35239)) {
                    if (this.field1077 == var93.field618 && var93.field620 == var85 && var93.field621 == var86 && var93.field619 == var90) {
                        var92 = var93;
                        break;
                    }
                }
                if (var92 == null) {
                    int var94 = 0;
                    int var95 = -1;
                    int var96 = 0;
                    int var97 = 0;
                    if (var90 == 0) {
                        var94 = this.field1096.method74(this.field1077, var85, var86);
                    }
                    if (var90 == 1) {
                        var94 = this.field1096.method75(var85, var86, this.field1200, this.field1077);
                    }
                    if (var90 == 2) {
                        var94 = this.field1096.method76(this.field1077, var85, var86);
                    }
                    if (var90 == 3) {
                        var94 = this.field1096.method77(this.field1077, var85, var86);
                    }
                    if (var94 != 0) {
                        int var98 = this.field1096.method78(this.field1077, var85, var86, var94);
                        var95 = var94 >> 14 & 32767;
                        var96 = var98 & 31;
                        var97 = var98 >> 6;
                    }
                    var92 = new LocMerged();
                    var92.field618 = this.field1077;
                    var92.field619 = var90;
                    var92.field620 = var85;
                    var92.field621 = var86;
                    var92.field625 = var95;
                    var92.field627 = var96;
                    var92.field626 = var97;
                    this.field1101.method217(var92);
                }
                var92.field622 = var91;
                var92.field624 = var88;
                var92.field623 = var89;
                this.method435(true, this.field1077, var88, var86, var85, var90, var91, var89);
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (!this.field1095) {
            super.run();
        } else {
            this.field1081 = true;
            try {
                long var1 = System.currentTimeMillis();
                int var3 = 0;
                int var4 = 20;
                while (this.field1261) {
                    this.method374((byte) 71);
                    this.method374((byte) 71);
                    this.method340(true);
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
            this.field1081 = false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;II)V")
    private final void method354(Packet arg0, int arg1, int arg2) {
        while (true) {
            if (arg0.field607 + 10 < arg1 * 8) {
                int var4 = arg0.method212(11, (byte) -46);
                if (var4 != 2047) {
                    if (this.field1106[var4] == null) {
                        this.field1106[var4] = new PlayerEntity();
                        if (this.field1111[var4] != null) {
                            this.field1106[var4].method110(this.field1111[var4], true);
                        }
                    }
                    this.field1108[this.field1107++] = var4;
                    PlayerEntity var5 = this.field1106[var4];
                    var5.field336 = field1114;
                    int var6 = arg0.method212(5, (byte) -46);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg0.method212(5, (byte) -46);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var5.method106((byte) 28, this.field1053.field340[0] + var6, this.field1053.field341[0] + var7);
                    this.field1110[this.field1109++] = var4;
                    continue;
                }
            }
            arg0.method213(this.field1051);
            if (arg2 < 0) {
                return;
            }
            for (int var8 = 1; var8 > 0; ++var8) {
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method355(int arg0) {
        int var2 = this.field1029.method184("Choose Option", true);
        for (int var3 = 0; var3 < this.field1065; ++var3) {
            int var9 = this.field1029.method184(this.field1075[var3], true);
            if (var9 > var2) {
                var2 = var9;
            }
        }
        if (this.field1136 != arg0) {
            this.field1166 = this.field1256.method201();
        }
        var2 += 8;
        int var4 = this.field1065 * 15 + 21;
        if (super.field23 > 8 && super.field24 > 11 && super.field23 < 520 && super.field24 < 345) {
            int var5 = super.field23 - 8 - var2 / 2;
            if (var2 + var5 > 512) {
                var5 = 512 - var2;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field24 - 11;
            if (var4 + var6 > 334) {
                var6 = 334 - var4;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            this.field1193 = true;
            this.field1022 = 0;
            this.field1023 = var5;
            this.field1024 = var6;
            this.field1025 = var2;
            this.field1026 = this.field1065 * 15 + 22;
        }
        if (super.field23 > 562 && super.field24 > 231 && super.field23 < 752 && super.field24 < 492) {
            int var7 = super.field23 - 562 - var2 / 2;
            if (var7 < 0) {
                var7 = 0;
            } else if (var2 + var7 > 190) {
                var7 = 190 - var2;
            }
            int var8 = super.field24 - 231;
            if (var8 < 0) {
                var8 = 0;
            } else if (var4 + var8 > 261) {
                var8 = 261 - var4;
            }
            this.field1193 = true;
            this.field1022 = 1;
            this.field1023 = var7;
            this.field1024 = var8;
            this.field1025 = var2;
            this.field1026 = this.field1065 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method356(boolean arg0) {
        if (arg0) {
            this.field1066 = this.field1001.method238();
        }
        if (this.field1324 == 2) {
            for (LocSpawned var2 = (LocSpawned) this.field1007.method220(); var2 != null; var2 = (LocSpawned) this.field1007.method222(35239)) {
                if (field1114 >= var2.field635) {
                    this.method435(true, var2.field628, var2.field634, var2.field631, var2.field630, var2.field629, var2.field632, var2.field633);
                    var2.method104();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method357(int arg0) {
        int var2 = 49 / arg0;
        while (true) {
            while (true) {
                do {
                    do {
                        do {
                            int var3;
                            do {
                                while (true) {
                                    var3 = this.method5(6542);
                                    if (var3 == -1) {
                                        return;
                                    }
                                    if (this.field1094) {
                                        if (var3 >= 32 && var3 <= 122 && this.field1242.length() < 80) {
                                            this.field1242 = this.field1242 + (char) var3;
                                            this.field1008 = true;
                                        }
                                        if (var3 == 8 && this.field1242.length() > 0) {
                                            this.field1242 = this.field1242.substring(0, this.field1242.length() - 1);
                                            this.field1008 = true;
                                        }
                                        break;
                                    }
                                    if (this.field1118) {
                                        if (var3 >= 48 && var3 <= 57 && this.field1302.length() < 10) {
                                            this.field1302 = this.field1302 + (char) var3;
                                            this.field1008 = true;
                                        }
                                        if (var3 == 8 && this.field1302.length() > 0) {
                                            this.field1302 = this.field1302.substring(0, this.field1302.length() - 1);
                                            this.field1008 = true;
                                        }
                                        if (var3 == 13 || var3 == 10) {
                                            if (this.field1302.length() > 0) {
                                                int var23 = 0;
                                                try {
                                                    var23 = Integer.parseInt(this.field1302);
                                                } catch (Exception var27) {
                                                }
                                                this.field1314.method192(160, 41);
                                                this.field1314.method196(var23);
                                            }
                                            this.field1118 = false;
                                            this.field1008 = true;
                                        }
                                    } else if (this.field1057 == -1) {
                                        if (var3 >= 32 && var3 <= 122 && this.field1139.length() < 80) {
                                            this.field1139 = this.field1139 + (char) var3;
                                            this.field1008 = true;
                                        }
                                        if (var3 == 8 && this.field1139.length() > 0) {
                                            this.field1139 = this.field1139.substring(0, this.field1139.length() - 1);
                                            this.field1008 = true;
                                        }
                                        if ((var3 == 13 || var3 == 10) && this.field1139.length() > 0) {
                                            if (this.field1139.equals("::clientdrop") && super.field16 != null) {
                                                this.method359(0);
                                            } else if (this.field1139.startsWith("::")) {
                                                this.field1314.method192(160, 237);
                                                this.field1314.method193(this.field1139.length() - 1);
                                                this.field1314.method198(this.field1139.substring(2));
                                            } else {
                                                byte var24 = 0;
                                                if (this.field1139.startsWith("yellow:")) {
                                                    var24 = 0;
                                                    this.field1139 = this.field1139.substring(7);
                                                }
                                                if (this.field1139.startsWith("red:")) {
                                                    var24 = 1;
                                                    this.field1139 = this.field1139.substring(4);
                                                }
                                                if (this.field1139.startsWith("green:")) {
                                                    var24 = 2;
                                                    this.field1139 = this.field1139.substring(6);
                                                }
                                                if (this.field1139.startsWith("cyan:")) {
                                                    var24 = 3;
                                                    this.field1139 = this.field1139.substring(5);
                                                }
                                                if (this.field1139.startsWith("purple:")) {
                                                    var24 = 4;
                                                    this.field1139 = this.field1139.substring(7);
                                                }
                                                if (this.field1139.startsWith("white:")) {
                                                    var24 = 5;
                                                    this.field1139 = this.field1139.substring(6);
                                                }
                                                if (this.field1139.startsWith("flash1:")) {
                                                    var24 = 6;
                                                    this.field1139 = this.field1139.substring(7);
                                                }
                                                if (this.field1139.startsWith("flash2:")) {
                                                    var24 = 7;
                                                    this.field1139 = this.field1139.substring(7);
                                                }
                                                if (this.field1139.startsWith("flash3:")) {
                                                    var24 = 8;
                                                    this.field1139 = this.field1139.substring(7);
                                                }
                                                if (this.field1139.startsWith("glow1:")) {
                                                    var24 = 9;
                                                    this.field1139 = this.field1139.substring(6);
                                                }
                                                if (this.field1139.startsWith("glow2:")) {
                                                    var24 = 10;
                                                    this.field1139 = this.field1139.substring(6);
                                                }
                                                if (this.field1139.startsWith("glow3:")) {
                                                    var24 = 11;
                                                    this.field1139 = this.field1139.substring(6);
                                                }
                                                byte var25 = 0;
                                                if (this.field1139.startsWith("wave:")) {
                                                    var25 = 1;
                                                    this.field1139 = this.field1139.substring(5);
                                                }
                                                if (this.field1139.startsWith("scroll:")) {
                                                    var25 = 2;
                                                    this.field1139 = this.field1139.substring(7);
                                                }
                                                this.field1314.method192(160, 54);
                                                this.field1314.method193(0);
                                                int var26 = this.field1314.field606;
                                                this.field1314.method193(var24);
                                                this.field1314.method193(var25);
                                                WordPack.method250(this.field1139, true, this.field1314);
                                                this.field1314.method200(this.field1314.field606 - var26, (byte) -12);
                                                this.field1139 = JString.method247(-4442, this.field1139);
                                                this.field1139 = WordFilter.method312((byte) -82, this.field1139);
                                                this.field1053.field304 = this.field1139;
                                                this.field1053.field306 = var24;
                                                this.field1053.field307 = var25;
                                                this.field1053.field305 = 150;
                                                this.method400(this.field1053.field304, 2, this.field1208, this.field1053.field349);
                                                if (this.field1331 == 2) {
                                                    this.field1331 = 1;
                                                    this.field1010 = true;
                                                    this.field1314.method192(160, 227);
                                                    this.field1314.method193(this.field1331);
                                                    this.field1314.method193(this.field1117);
                                                    this.field1314.method193(this.field1176);
                                                }
                                            }
                                            this.field1139 = "";
                                            this.field1008 = true;
                                        }
                                    }
                                }
                            } while (var3 != 13 && var3 != 10);
                            this.field1094 = false;
                            this.field1008 = true;
                            if (this.field1330 == 1 && this.field993 < 100) {
                                long var4 = JString.method243(this.field1242);
                                this.field1242 = JString.method246(-580, JString.method244(true, var4));
                                if (var4 != 0L) {
                                    boolean var6 = false;
                                    for (int var7 = 0; var7 < this.field993; ++var7) {
                                        if (this.field1326[var7] == var4) {
                                            this.method400(this.field1242 + " is already on your friend list", 0, this.field1208, "");
                                            var6 = true;
                                            break;
                                        }
                                    }
                                    for (int var8 = 0; var8 < this.field1265; ++var8) {
                                        if (this.field1040[var8] == var4) {
                                            this.method400("Please remove " + this.field1242 + " from your ignore list first", 0, this.field1208, "");
                                            var6 = true;
                                            break;
                                        }
                                    }
                                    if (this.field1242.equals(this.field1053.field349)) {
                                        var6 = true;
                                    }
                                    if (!var6) {
                                        this.field1056[this.field993] = this.field1242;
                                        this.field1326[this.field993] = var4;
                                        this.field1138[this.field993] = 0;
                                        ++this.field993;
                                        this.field1102 = true;
                                        this.field1314.method192(160, 28);
                                        this.field1314.method197(var4, -13709);
                                    }
                                }
                            }
                            if (this.field1330 == 2 && this.field993 > 0) {
                                long var9 = JString.method243(this.field1242);
                                this.field1242 = JString.method246(-580, JString.method244(true, var9));
                                if (var9 != 0L) {
                                    for (int var11 = 0; var11 < this.field993; ++var11) {
                                        if (this.field1326[var11] == var9) {
                                            --this.field993;
                                            this.field1102 = true;
                                            for (int var12 = var11; var12 < this.field993; ++var12) {
                                                this.field1056[var12] = this.field1056[var12 + 1];
                                                this.field1138[var12] = this.field1138[var12 + 1];
                                                this.field1326[var12] = this.field1326[var12 + 1];
                                            }
                                            this.field1314.method192(160, 195);
                                            this.field1314.method197(var9, -13709);
                                            break;
                                        }
                                    }
                                }
                            }
                            if (this.field1330 == 3 && this.field1242.length() > 0 && this.field996 >= 0 && this.field996 < this.field993) {
                                this.field1314.method192(160, 74);
                                this.field1314.method193(0);
                                int var13 = this.field1314.field606;
                                this.field1314.method197(this.field1326[this.field996], -13709);
                                WordPack.method250(this.field1242, true, this.field1314);
                                this.field1314.method200(this.field1314.field606 - var13, (byte) -12);
                                this.field1242 = JString.method247(-4442, this.field1242);
                                this.field1242 = WordFilter.method312((byte) -82, this.field1242);
                                this.method400(this.field1242, 6, this.field1208, this.field1056[this.field996]);
                                if (this.field1117 == 2) {
                                    this.field1117 = 1;
                                    this.field1010 = true;
                                    this.field1314.method192(160, 227);
                                    this.field1314.method193(this.field1331);
                                    this.field1314.method193(this.field1117);
                                    this.field1314.method193(this.field1176);
                                }
                            }
                            if (this.field1330 == 4 && this.field1265 < 100 && this.field1242.length() > 0) {
                                long var14 = JString.method243(this.field1242);
                                boolean var16 = false;
                                for (int var17 = 0; var17 < this.field1265; ++var17) {
                                    if (this.field1040[var17] == var14) {
                                        this.method400(this.field1242 + " is already on your ignore list", 0, this.field1208, "");
                                        var16 = true;
                                        break;
                                    }
                                }
                                for (int var18 = 0; var18 < this.field993; ++var18) {
                                    if (this.field1326[var18] == var14) {
                                        this.method400("Please remove " + this.field1242 + " from your friend list first", 0, this.field1208, "");
                                        var16 = true;
                                        break;
                                    }
                                }
                                if (!var16) {
                                    this.field1040[this.field1265++] = var14;
                                    this.field1102 = true;
                                    this.field1314.method192(160, 170);
                                    this.field1314.method197(var14, -13709);
                                }
                            }
                        } while (this.field1330 != 5);
                    } while (this.field1265 <= 0);
                } while (this.field1242.length() <= 0);
                long var19 = JString.method243(this.field1242);
                for (int var21 = 0; var21 < this.field1265; ++var21) {
                    if (this.field1040[var21] == var19) {
                        --this.field1265;
                        this.field1102 = true;
                        for (int var22 = var21; var22 < this.field1265; ++var22) {
                            this.field1040[var22] = this.field1040[var22 + 1];
                        }
                        this.field1314.method192(160, 97);
                        this.field1314.method197(var19, -13709);
                        break;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)V")
    public final void method358(byte arg0, int arg1) {
        if (arg0 != 6) {
            this.field1237 = 80;
        }
        if (!field1018 && Pix3D.field554[17] >= arg1) {
            Pix8 var3 = Pix3D.field548[17];
            int var4 = var3.field580 * var3.field579 - 1;
            int var5 = this.field1097 * var3.field579 * 2;
            byte[] var6 = var3.field577;
            byte[] var7 = this.field1205;
            for (int var8 = 0; var8 <= var4; ++var8) {
                var7[var8] = var6[var8 - var5 & var4];
            }
            var3.field577 = var7;
            this.field1205 = var6;
            Pix3D.method156(28230, 17);
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method359(int arg0) {
        this.field999.method227(-510);
        this.field1028.method182(true, 144, 0, 257, "Connection lost");
        this.field1028.method182(true, 143, 16777215, 256, "Connection lost");
        this.field1028.method182(true, 159, 0, 257, "Please wait - attempting to reestablish");
        this.field1028.method182(true, 158, 16777215, 256, "Please wait - attempting to reestablish");
        this.field999.method228(8, super.field13, 11, this.field1285);
        ClientStream var2 = this.field1119;
        this.field1089 = false;
        if (arg0 < 0 || arg0 > 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        this.method427(this.field1098, this.field1099, this.method396(-31414), true);
        if (!this.field1089) {
            this.method352(this.field1194);
        }
        try {
            var2.method28();
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLkb;)V")
    private final void method360(int arg0, byte arg1, Packet arg2) {
        arg2.method211(this.field1175);
        if (arg1 == 6) {
            int var4 = arg2.method212(8, (byte) -46);
            if (var4 < this.field1320) {
                for (int var5 = var4; var5 < this.field1320; ++var5) {
                    this.field1189[this.field1188++] = this.field1321[var5];
                }
            }
            if (var4 > this.field1320) {
                signlink.reporterror(this.field1098 + " Too many npcs");
                throw new RuntimeException("eek");
            } else {
                this.field1320 = 0;
                for (int var6 = 0; var6 < var4; ++var6) {
                    int var7 = this.field1321[var6];
                    NpcEntity var8 = this.field1319[var7];
                    int var9 = arg2.method212(1, (byte) -46);
                    if (var9 == 0) {
                        this.field1321[this.field1320++] = var7;
                        var8.field336 = field1114;
                    } else {
                        int var10 = arg2.method212(2, (byte) -46);
                        if (var10 == 0) {
                            this.field1321[this.field1320++] = var7;
                            var8.field336 = field1114;
                            this.field1110[this.field1109++] = var7;
                        } else if (var10 == 1) {
                            this.field1321[this.field1320++] = var7;
                            var8.field336 = field1114;
                            int var11 = arg2.method212(3, (byte) -46);
                            var8.method107(false, var11, 112);
                            int var12 = arg2.method212(1, (byte) -46);
                            if (var12 == 1) {
                                this.field1110[this.field1109++] = var7;
                            }
                        } else if (var10 == 2) {
                            this.field1321[this.field1320++] = var7;
                            var8.field336 = field1114;
                            int var13 = arg2.method212(3, (byte) -46);
                            var8.method107(true, var13, 112);
                            int var14 = arg2.method212(3, (byte) -46);
                            var8.method107(true, var14, 112);
                            int var15 = arg2.method212(1, (byte) -46);
                            if (var15 == 1) {
                                this.field1110[this.field1109++] = var7;
                            }
                        } else if (var10 == 3) {
                            this.field1189[this.field1188++] = var7;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method361(boolean arg0) {
        for (int var2 = -1; var2 < this.field1320 + this.field1107; ++var2) {
            PathingEntity var3;
            if (var2 == -1) {
                var3 = this.field1053;
            } else if (var2 < this.field1107) {
                var3 = this.field1106[this.field1108[var2]];
            } else {
                var3 = this.field1319[this.field1321[var2 - this.field1107]];
            }
            if (var3 != null && var3.method108(0)) {
                if (var2 < this.field1107) {
                    PlayerEntity var4 = (PlayerEntity) var3;
                    if (var4.field352 != 0) {
                        this.method368(var3.field337 + 15, this.field1035, var3);
                        if (this.field1112 > -1) {
                            int var5 = 28;
                            for (int var6 = 0; var6 < 8; ++var6) {
                                if ((var4.field352 & 1 << var6) != 0) {
                                    this.field1198[var6].method169(this.field1113 - var5, this.field1216, this.field1112 - 12);
                                    var5 -= 25;
                                }
                            }
                        }
                    }
                }
                if (var3.field304 != null && (var2 >= this.field1107 || this.field1331 == 0 || this.field1331 == 1 && this.method397(7, ((PlayerEntity) var3).field349))) {
                    this.method368(var3.field337, this.field1035, var3);
                    if (this.field1112 > -1) {
                        if (this.field1297 == 0) {
                            int var7 = 16776960;
                            if (var3.field306 < 6) {
                                var7 = this.field1215[var3.field306];
                            }
                            if (var3.field306 == 6) {
                                var7 = this.field1133 % 20 < 10 ? 16711680 : 16776960;
                            }
                            if (var3.field306 == 7) {
                                var7 = this.field1133 % 20 < 10 ? 255 : 65535;
                            }
                            if (var3.field306 == 8) {
                                var7 = this.field1133 % 20 < 10 ? 45056 : 8454016;
                            }
                            if (var3.field306 == 9) {
                                int var8 = 150 - var3.field305;
                                if (var8 < 50) {
                                    var7 = var8 * 1280 + 16711680;
                                } else if (var8 < 100) {
                                    var7 = 16776960 - (var8 - 50) * 327680;
                                } else if (var8 < 150) {
                                    var7 = (var8 - 100) * 5 + 65280;
                                }
                            }
                            if (var3.field306 == 10) {
                                int var9 = 150 - var3.field305;
                                if (var9 < 50) {
                                    var7 = var9 * 5 + 16711680;
                                } else if (var9 < 100) {
                                    var7 = 16711935 - (var9 - 50) * 327680;
                                } else if (var9 < 150) {
                                    var7 = (var9 - 100) * 327680 + 255 - (var9 - 100) * 5;
                                }
                            }
                            if (var3.field306 == 11) {
                                int var10 = 150 - var3.field305;
                                if (var10 < 50) {
                                    var7 = 16777215 - var10 * 327685;
                                } else if (var10 < 100) {
                                    var7 = (var10 - 50) * 327685 + 65280;
                                } else if (var10 < 150) {
                                    var7 = 16777215 - (var10 - 100) * 327680;
                                }
                            }
                            if (var3.field307 == 0) {
                                this.field1029.method182(true, this.field1113 + 1, 0, this.field1112, var3.field304);
                                this.field1029.method182(true, this.field1113, var7, this.field1112, var3.field304);
                            }
                            if (var3.field307 == 1) {
                                this.field1029.method186(9, this.field1113 + 1, 0, var3.field304, this.field1133, this.field1112);
                                this.field1029.method186(9, this.field1113, var7, var3.field304, this.field1133, this.field1112);
                            }
                            if (var3.field307 == 2) {
                                int var11 = this.field1029.method184(var3.field304, true);
                                int var12 = (150 - var3.field305) * (var11 + 100) / 150;
                                Pix2D.method143(334, this.field1112 + 50, 0, this.field1112 - 50, 17913);
                                this.field1029.method185(var3.field304, this.field1112 + 50 - var12, 0, true, this.field1113 + 1);
                                this.field1029.method185(var3.field304, this.field1112 + 50 - var12, var7, true, this.field1113);
                                Pix2D.method142(-971);
                            }
                        } else {
                            this.field1029.method182(true, this.field1113 + 1, 0, this.field1112, var3.field304);
                            this.field1029.method182(true, this.field1113, 16776960, this.field1112, var3.field304);
                        }
                    }
                }
                if (var3.field310 > field1114 + 100) {
                    this.method368(var3.field337 + 15, this.field1035, var3);
                    if (this.field1112 > -1) {
                        int var13 = var3.field311 * 30 / var3.field312;
                        if (var13 > 30) {
                            var13 = 30;
                        }
                        Pix2D.method145(65280, this.field1162, 5, this.field1113 - 3, var13, this.field1112 - 15);
                        Pix2D.method145(16711680, this.field1162, 5, this.field1113 - 3, 30 - var13, this.field1112 - 15 + var13);
                    }
                }
                if (var3.field310 > field1114 + 330) {
                    this.method368(var3.field337 / 2, this.field1035, var3);
                    if (this.field1112 > -1) {
                        this.field1335[var3.field309].method169(this.field1113 - 12, this.field1216, this.field1112 - 12);
                        this.field1027.method182(true, this.field1113 + 4, 0, this.field1112, String.valueOf(var3.field308));
                        this.field1027.method182(true, this.field1113 + 3, 16777215, this.field1112 - 1, String.valueOf(var3.field308));
                    }
                }
            }
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILkb;I)V")
    private final void method362(int arg0, Packet arg1, int arg2) {
        this.field1188 = 0;
        if (arg0 != 15093) {
            this.field1126 = this.field1001.method238();
        }
        this.field1109 = 0;
        this.method442(arg2, arg1, -721);
        this.method376(arg1, arg2, true);
        this.method354(arg1, arg2, -292);
        this.method391(arg1, 7, arg2);
        for (int var4 = 0; var4 < this.field1188; ++var4) {
            int var6 = this.field1189[var4];
            if (field1114 != this.field1106[var6].field336) {
                this.field1106[var6] = null;
            }
        }
        if (arg1.field606 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field606 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field1107; ++var5) {
                if (this.field1106[this.field1108[var5]] == null) {
                    signlink.reporterror(this.field1098 + " null entry in pl list - pos:" + var5 + " size:" + this.field1107);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IB)V")
    public final void method363(int arg0, byte arg1) {
        if (arg1 == 7) {
            int var3 = VarpType.field962[arg0].field970;
            if (var3 != 0) {
                int var4 = this.field1177[arg0];
                if (var3 == 1) {
                    if (var4 == 1) {
                        Pix3D.method158(0.9D, -433);
                    }
                    if (var4 == 2) {
                        Pix3D.method158(0.8D, -433);
                    }
                    if (var4 == 3) {
                        Pix3D.method158(0.7D, -433);
                    }
                    if (var4 == 4) {
                        Pix3D.method158(0.6D, -433);
                    }
                    ObjType.field837.method101();
                    this.field1036 = true;
                }
                if (var3 == 3) {
                    if (var4 == 1 && this.field1016) {
                        this.field1016 = false;
                        signlink.midi = "null";
                    }
                    if (var4 == 0 && !this.field1016) {
                        this.field1016 = true;
                        signlink.midi = this.field1021;
                    }
                }
                if (var3 == 5) {
                    this.field1103 = var4;
                }
                if (var3 == 6) {
                    this.field1297 = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Lkb;II)V")
    private final void method364(Packet arg0, int arg1, int arg2) {
        this.field1188 = 0;
        this.field1109 = 0;
        this.method360(arg1, (byte) 6, arg0);
        this.method415(2, arg0, arg1);
        int var4 = arg1 + arg2;
        this.method418(787, var4, arg0);
        for (int var5 = 0; var5 < this.field1188; ++var5) {
            int var7 = this.field1189[var5];
            if (field1114 != this.field1319[var7].field336) {
                this.field1319[var7].field346 = null;
                this.field1319[var7] = null;
            }
        }
        if (arg0.field606 != var4) {
            signlink.reporterror(this.field1098 + " size mismatch in getnpcpos - pos:" + arg0.field606 + " psize:" + var4);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field1320; ++var6) {
                if (this.field1319[this.field1321[var6]] == null) {
                    signlink.reporterror(this.field1098 + " null entry in npc list - pos:" + var6 + " size:" + this.field1320);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method365(int arg0) {
        while (arg0 >= 0) {
            this.field1020 = null;
        }
        for (int var2 = -1; var2 < this.field1107; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field1105;
            } else {
                var6 = this.field1108[var2];
            }
            PlayerEntity var7 = this.field1106[var6];
            if (var7 != null && var7.field305 > 0) {
                --var7.field305;
                if (var7.field305 == 0) {
                    var7.field304 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field1320; ++var3) {
            int var4 = this.field1321[var3];
            NpcEntity var5 = this.field1319[var4];
            if (var5 != null && var5.field305 > 0) {
                --var5.field305;
                if (var5.field305 == 0) {
                    var5.field304 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method366(int arg0) {
        if (this.field1000 == null) {
            this.method441(-43634);
            super.field14 = null;
            this.field1244 = null;
            this.field1245 = null;
            this.field1246 = null;
            this.field1247 = null;
            this.field1248 = null;
            this.field1249 = null;
            this.field1250 = null;
            this.field1251 = null;
            this.field1252 = null;
            this.field1000 = new PixMap(96, (byte) -58, this.method11(-36374), 479);
            this.field998 = new PixMap(160, (byte) -58, this.method11(-36374), 168);
            if (arg0 < 0) {
                Pix2D.method144(2);
                this.field1047.method180(0, this.field1216, 0);
                this.field997 = new PixMap(261, (byte) -58, this.method11(-36374), 190);
                this.field999 = new PixMap(334, (byte) -58, this.method11(-36374), 512);
                Pix2D.method144(2);
                this.field1294 = new PixMap(61, (byte) -58, this.method11(-36374), 501);
                this.field1295 = new PixMap(40, (byte) -58, this.method11(-36374), 288);
                this.field1296 = new PixMap(66, (byte) -58, this.method11(-36374), 269);
                this.field1036 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method367(int arg0) {
        if (arg0 != 1) {
            this.field1166 = this.field1256.method201();
        }
        this.field1015 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1238[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field862; ++var3) {
                if (IdkType.field863[var3].field864 == var2 + (this.field1325 ? 0 : 7)) {
                    this.field1238[var2] = var3;
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLx;)V")
    public final void method368(int arg0, byte arg1, PathingEntity arg2) {
        int var4 = arg2.field292;
        int var5 = arg2.field293;
        if (var4 >= 128 && var5 >= 128 && var4 <= 13056 && var5 <= 13056) {
            int var6 = this.method341(var4, var5, this.field1077, (byte) 9) - arg0;
            int var7 = var4 - this.field1273;
            int var8 = var6 - this.field1274;
            if (arg1 == 0) {
                boolean var9 = false;
            } else {
                this.field1020 = null;
            }
            int var10 = var5 - this.field1275;
            int var11 = Model.field514[this.field1276];
            int var12 = Model.field515[this.field1276];
            int var13 = Model.field514[this.field1277];
            int var14 = Model.field515[this.field1277];
            int var15 = var7 * var14 + var10 * var13 >> 16;
            int var16 = var10 * var14 - var7 * var13 >> 16;
            int var18 = var8 * var12 - var11 * var16 >> 16;
            int var19 = var8 * var11 + var12 * var16 >> 16;
            if (var19 >= 50) {
                this.field1112 = (var15 << 9) / var19 + Pix3D.field540;
                this.field1113 = (var18 << 9) / var19 + Pix3D.field541;
            } else {
                this.field1112 = -1;
                this.field1113 = -1;
            }
        } else {
            this.field1112 = -1;
            this.field1113 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method369(int arg0, int arg1) {
        if (arg1 < 2 || arg1 > 2) {
            this.field1216 = -265;
        }
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method370(byte arg0) {
        ++this.field1133;
        this.method420(7);
        this.method403(true);
        this.method417(-497);
        this.method347(9);
        this.method386(7);
        if (!this.field1037) {
            int var2 = this.field1278;
            if (this.field1284 / 256 > var2) {
                var2 = this.field1284 / 256;
            }
            if (this.field1120[4] && this.field1184[4] + 128 > var2) {
                var2 = this.field1184[4] + 128;
            }
            int var3 = this.field1279 + this.field1229 & 2047;
            this.method404(this.method341(this.field1282, this.field1283, this.field1077, (byte) 9) - 50, var2, this.field1283, (byte) 9, var2 * 3 + 600, this.field1282, var3);
        }
        int var4;
        if (!this.field1037) {
            var4 = this.method343(false);
        } else {
            var4 = this.method344(5);
        }
        int var5 = this.field1273;
        int var6 = this.field1274;
        int var7 = this.field1275;
        int var8 = this.field1276;
        int var9 = this.field1277;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field1120[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field1224[var10] * 2 + 1) - (double) this.field1224[var10] + Math.sin((double) this.field1304[var10] / 100.0D * (double) this.field1322[var10]) * (double) this.field1184[var10]);
                if (var10 == 0) {
                    this.field1273 += var12;
                }
                if (var10 == 1) {
                    this.field1274 += var12;
                }
                if (var10 == 2) {
                    this.field1275 += var12;
                }
                if (var10 == 3) {
                    this.field1277 = this.field1277 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field1276 += var12;
                    if (this.field1276 < 128) {
                        this.field1276 = 128;
                    }
                    if (this.field1276 > 383) {
                        this.field1276 = 383;
                    }
                }
            }
        }
        int var11 = Pix3D.field555;
        Model.field509 = true;
        Model.field512 = 0;
        Model.field510 = super.field20 - 8;
        Model.field511 = super.field21 - 11;
        Pix2D.method144(2);
        this.field1096.method87(this.field1273, var4, 2, this.field1274, this.field1275, this.field1276, this.field1277);
        this.field1096.method64(7);
        this.method361(false);
        this.method358((byte) 6, var11);
        if (arg0 != -95) {
            this.field1166 = -1;
        }
        this.method346(8);
        this.field999.method228(8, super.field13, 11, this.field1285);
        this.field1273 = var5;
        this.field1274 = var6;
        this.field1275 = var7;
        this.field1276 = var8;
        this.field1277 = var9;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method371(int arg0, int arg1) {
        Component var3 = Component.field870[arg1];
        for (int var4 = 0; var4 < var3.field891.length && var3.field891[var4] != -1; ++var4) {
            Component var5 = Component.field870[var3.field891[var4]];
            if (var5.field877 == 1) {
                this.method371(-553, var5.field875);
            }
            var5.field873 = 0;
            var5.field874 = 0;
        }
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZI)Z")
    public final boolean method372(int arg0, boolean arg1, int arg2) {
        boolean var4 = false;
        Component var5 = Component.field870[arg0];
        for (int var6 = 0; var6 < var5.field891.length && var5.field891[var6] != -1; ++var6) {
            Component var7 = Component.field870[var5.field891[var6]];
            if (var7.field877 == 1) {
                var4 |= this.method372(var7.field875, true, arg2);
            }
            if (var7.field918 != -1) {
                SeqType var8 = SeqType.field938[var7.field918];
                var7.field874 += arg2;
                while (var7.field874 > var8.field942[var7.field873]) {
                    var7.field874 -= var8.field942[var7.field873] + 1;
                    ++var7.field873;
                    if (var7.field873 >= var8.field939) {
                        var7.field873 -= var8.field943;
                        if (var7.field873 < 0 || var7.field873 >= var8.field939) {
                            var7.field873 = 0;
                        }
                    }
                    var4 = true;
                }
            }
        }
        if (!arg1) {
            throw new NullPointerException();
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
    public final void method373(String arg0, String arg1, int arg2) {
        try {
            this.field1328 = "";
            this.field1329 = "Connecting to server...";
            this.method399(false);
            this.field1119 = new ClientStream(this, 994, this.method423(this.field1272 + 43594));
            this.field1119.method31(this.field1256.field605, 0, 8);
            this.field1256.field606 = 0;
            this.field1197 = this.field1256.method207(720);
            this.field1314.field606 = 0;
            this.field1314.method193(10);
            this.field1314.method196((int) Math.random() * 99999999);
            this.field1314.method196((int) Math.random() * 99999999);
            this.field1314.method197(this.field1197, -13709);
            this.field1314.method196(arg2);
            this.field1314.method198(arg0);
            this.field1314.method198(arg1);
            this.field1314.method216(field1141, field1049, -623);
            this.field1292.field606 = 0;
            this.field1292.method193(17);
            this.field1292.method193(this.field1314.field606);
            this.field1292.method199(2, this.field1314.field605, 0, this.field1314.field606);
            this.field1119.method32(this.field1292.field605, this.field1292.field606, false, 0);
            int var4 = this.field1119.method29();
            if (var4 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var5) {
                }
                this.method373(arg0, arg1, arg2);
                return;
            }
            if (var4 == 2) {
                this.field1328 = "Username already taken.";
                this.field1329 = "Please choose a different name.";
                return;
            }
            if (var4 == 3) {
                this.field1270 = 2;
                this.method427(this.field1098, this.field1099, arg2, false);
                return;
            }
        } catch (IOException var6) {
            this.field1328 = "";
            this.field1329 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method374(byte arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field1150[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field1150[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field1151[var14] = (this.field1150[var14 - 1] + this.field1150[var14 + 1] + this.field1150[var14 - 128] + this.field1150[var14 + 128]) / 4;
            }
        }
        if (this.field1034 != arg0) {
            this.field1166 = -1;
        }
        this.field1323 += 128;
        if (this.field1323 > this.field1311.length) {
            this.field1323 -= this.field1311.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method422((byte) 57, this.field1269[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field1151[var11 + 128] - this.field1311[this.field1323 + var11 & this.field1311.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field1150[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field1076[var8] = this.field1076[var8 + 1];
        }
        this.field1076[var2 - 1] = (int) (Math.sin((double) field1114 / 14.0D) * 16.0D + Math.sin((double) field1114 / 15.0D) * 14.0D + Math.sin((double) field1114 / 16.0D) * 12.0D);
        if (this.field1287 > 0) {
            this.field1287 -= 4;
        }
        if (this.field1288 > 0) {
            this.field1288 -= 4;
        }
        if (this.field1287 == 0 && this.field1288 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field1287 = 1024;
            }
            if (var9 == 1) {
                this.field1288 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method375(boolean arg0) {
        if (this.field1244 == null) {
            super.field14 = null;
            this.field1000 = null;
            this.field998 = null;
            this.field997 = null;
            this.field999 = null;
            this.field1294 = null;
            this.field1295 = null;
            this.field1296 = null;
            this.field1247 = new PixMap(265, (byte) -58, this.method11(-36374), 128);
            Pix2D.method144(2);
            this.field1248 = new PixMap(265, (byte) -58, this.method11(-36374), 128);
            Pix2D.method144(2);
            this.field1244 = new PixMap(186, (byte) -58, this.method11(-36374), 533);
            Pix2D.method144(2);
            this.field1245 = new PixMap(146, (byte) -58, this.method11(-36374), 360);
            Pix2D.method144(2);
            this.field1246 = new PixMap(200, (byte) -58, this.method11(-36374), 360);
            Pix2D.method144(2);
            this.field1249 = new PixMap(267, (byte) -58, this.method11(-36374), 214);
            Pix2D.method144(2);
            this.field1250 = new PixMap(267, (byte) -58, this.method11(-36374), 215);
            Pix2D.method144(2);
            this.field1251 = new PixMap(79, (byte) -58, this.method11(-36374), 86);
            this.field1089 &= arg0;
            Pix2D.method144(2);
            this.field1252 = new PixMap(79, (byte) -58, this.method11(-36374), 87);
            Pix2D.method144(2);
            if (this.field1087 != null) {
                this.method430(false);
                this.method381(0);
            }
            this.field1036 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lkb;IZ)V")
    private final void method376(Packet arg0, int arg1, boolean arg2) {
        this.field1089 &= arg2;
        int var4 = arg0.method212(8, (byte) -46);
        if (var4 < this.field1107) {
            for (int var5 = var4; var5 < this.field1107; ++var5) {
                this.field1189[this.field1188++] = this.field1108[var5];
            }
        }
        if (var4 > this.field1107) {
            signlink.reporterror(this.field1098 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field1107 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field1108[var6];
                PlayerEntity var8 = this.field1106[var7];
                int var9 = arg0.method212(1, (byte) -46);
                if (var9 == 0) {
                    this.field1108[this.field1107++] = var7;
                    var8.field336 = field1114;
                } else {
                    int var10 = arg0.method212(2, (byte) -46);
                    if (var10 == 0) {
                        this.field1108[this.field1107++] = var7;
                        var8.field336 = field1114;
                        this.field1110[this.field1109++] = var7;
                    } else if (var10 == 1) {
                        this.field1108[this.field1107++] = var7;
                        var8.field336 = field1114;
                        int var11 = arg0.method212(3, (byte) -46);
                        var8.method107(false, var11, 112);
                        int var12 = arg0.method212(1, (byte) -46);
                        if (var12 == 1) {
                            this.field1110[this.field1109++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field1108[this.field1107++] = var7;
                        var8.field336 = field1114;
                        int var13 = arg0.method212(3, (byte) -46);
                        var8.method107(true, var13, 112);
                        int var14 = arg0.method212(3, (byte) -46);
                        var8.method107(true, var14, 112);
                        int var15 = arg0.method212(1, (byte) -46);
                        if (var15 == 1) {
                            this.field1110[this.field1109++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field1189[this.field1188++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method377(byte arg0) {
        int var2 = this.field1053.field292 + this.field1267;
        int var3 = this.field1053.field293 + this.field1044;
        if (this.field1282 - var2 < -500 || this.field1282 - var2 > 500 || this.field1283 - var3 < -500 || this.field1283 - var3 > 500) {
            this.field1282 = var2;
            this.field1283 = var3;
        }
        if (this.field1282 != var2) {
            this.field1282 += (var2 - this.field1282) / 16;
        }
        if (this.field1283 != var3) {
            this.field1283 += (var3 - this.field1283) / 16;
        }
        if (super.field25[1] == 1) {
            this.field1280 += (-24 - this.field1280) / 2;
        } else if (super.field25[2] == 1) {
            this.field1280 += (24 - this.field1280) / 2;
        } else {
            this.field1280 /= 2;
        }
        if (super.field25[3] == 1) {
            this.field1281 += (12 - this.field1281) / 2;
        } else if (super.field25[4] == 1) {
            this.field1281 += (-12 - this.field1281) / 2;
        } else {
            this.field1281 /= 2;
        }
        this.field1279 = this.field1280 / 2 + this.field1279 & 2047;
        this.field1278 += this.field1281 / 2;
        if (this.field1278 < 128) {
            this.field1278 = 128;
        }
        if (this.field1278 > 383) {
            this.field1278 = 383;
        }
        int var4 = this.field1282 >> 7;
        int var5 = this.field1283 >> 7;
        int var6 = this.method341(this.field1282, this.field1283, this.field1077, (byte) 9);
        int var7 = 0;
        if (arg0 != 2) {
            this.field1166 = -1;
        }
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    int var10 = this.field1077;
                    if (var10 < 3 && (this.field1009[1][var8][var9] & 2) == 2) {
                        ++var10;
                    }
                    int var11 = var6 - this.field1080[var10][var8][var9];
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
        if (var12 > this.field1284) {
            this.field1284 += (var12 - this.field1284) / 24;
        } else if (var12 < this.field1284) {
            this.field1284 += (var12 - this.field1284) / 80;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLec;III)V")
    public final void method378(boolean arg0, Component arg1, int arg2, int arg3, int arg4) {
        if (arg1.field877 == 0 && arg1.field891 != null) {
            if (!arg1.field890 || this.field1161 == arg1.field875 || this.field1286 == arg1.field875 || this.field1137 == arg1.field875) {
                int var6 = Pix2D.field527;
                int var7 = Pix2D.field525;
                int var8 = Pix2D.field528;
                int var9 = Pix2D.field526;
                Pix2D.method143(arg1.field881 + arg2, arg1.field880 + arg4, arg2, arg4, 17913);
                int var10 = arg1.field891.length;
                if (arg0) {
                    this.field1164 = 358;
                }
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg1.field892[var11] + arg4;
                    int var13 = arg1.field893[var11] + arg2 - arg3;
                    Component var14 = Component.field870[arg1.field891[var11]];
                    int var15 = var14.field882 + var12;
                    int var16 = var14.field883 + var13;
                    if (var14.field879 > 0) {
                        this.method392((byte) 36, var14);
                    }
                    if (var14.field877 == 0) {
                        if (var14.field889 > var14.field888 - var14.field881) {
                            var14.field889 = var14.field888 - var14.field881;
                        }
                        if (var14.field889 < 0) {
                            var14.field889 = 0;
                        }
                        this.method378(this.field1125, var14, var16, var14.field889, var15);
                        if (var14.field888 > var14.field881) {
                            this.method421(var16, false, var14.field880 + var15, var14.field888, var14.field889, var14.field881);
                        }
                    } else if (var14.field877 != 1) {
                        if (var14.field877 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field881; ++var18) {
                                for (int var19 = 0; var19 < var14.field880; ++var19) {
                                    int var20 = (var14.field899 + 32) * var19 + var15;
                                    int var21 = (var14.field900 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field902[var17];
                                        var21 += var14.field903[var17];
                                    }
                                    if (var14.field871[var17] <= 0) {
                                        if (var14.field901 != null && var17 < 20) {
                                            Pix32 var27 = var14.field901[var17];
                                            if (var27 != null) {
                                                var27.method169(var21, this.field1216, var20);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field871[var17] - 1;
                                        Pix32 var25 = ObjType.method269(var24, (byte) -11);
                                        if (this.field1129 != 0 && this.field1128 == var17 && this.field1127 == var14.field875) {
                                            var22 = super.field20 - this.field1130;
                                            var23 = super.field21 - this.field1131;
                                            if (var22 < 5 && var22 > -5) {
                                                var22 = 0;
                                            }
                                            if (var23 < 5 && var23 > -5) {
                                                var23 = 0;
                                            }
                                            var25.method171(false, var20 + var22, 128, var21 + var23);
                                        } else if (this.field1160 != 0 && this.field1159 == var17 && this.field1158 == var14.field875) {
                                            var25.method171(false, var20, 128, var21);
                                        } else {
                                            var25.method169(var21, this.field1216, var20);
                                        }
                                        if (var25.field570 == 33 || var14.field872[var17] != 1) {
                                            int var26 = var14.field872[var17];
                                            this.field1027.method185(String.valueOf(var26), var20 + 1 + var22, 0, true, var21 + 10 + var23);
                                            this.field1027.method185(String.valueOf(var26), var20 + var22, 16776960, true, var21 + 9 + var23);
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field877 == 3) {
                            if (var14.field905) {
                                Pix2D.method145(var14.field911, this.field1162, var14.field881, var16, var14.field880, var15);
                            } else {
                                Pix2D.method146(var14.field911, var16, 0, var14.field880, var14.field881, var15);
                            }
                        } else if (var14.field877 == 4) {
                            PixFont var28 = var14.field908;
                            int var29 = var14.field911;
                            String var30 = var14.field909;
                            if ((this.field1137 == var14.field875 || this.field1286 == var14.field875 || this.field1161 == var14.field875) && var14.field913 != 0) {
                                var29 = var14.field913;
                            }
                            if (this.method433((byte) 3, var14)) {
                                var29 = var14.field912;
                                if (var14.field910.length() > 0) {
                                    var30 = var14.field910;
                                }
                            }
                            if (var14.field878 == 6 && this.field1243) {
                                var30 = "Please wait...";
                                var29 = var14.field911;
                            }
                            int var31 = var28.field594 + var16;
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
                                                                        var30 = var30.substring(0, var36) + this.method369(this.method348(4, var14, -6815), 2) + var30.substring(var36 + 2);
                                                                    }
                                                                }
                                                                var30 = var30.substring(0, var35) + this.method369(this.method348(3, var14, -6815), 2) + var30.substring(var35 + 2);
                                                            }
                                                        }
                                                        var30 = var30.substring(0, var34) + this.method369(this.method348(2, var14, -6815), 2) + var30.substring(var34 + 2);
                                                    }
                                                }
                                                var30 = var30.substring(0, var33) + this.method369(this.method348(1, var14, -6815), 2) + var30.substring(var33 + 2);
                                            }
                                        }
                                        var30 = var30.substring(0, var32) + this.method369(this.method348(0, var14, -6815), 2) + var30.substring(var32 + 2);
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
                                if (var14.field906) {
                                    var28.method183(var31, var14.field880 / 2 + var15, var29, var38, 26631, var14.field907);
                                } else {
                                    var28.method187(-886, var14.field907, var15, var29, var31, var38);
                                }
                                var31 += var28.field594;
                            }
                        } else if (var14.field877 == 5) {
                            Pix32 var39;
                            if (this.method433((byte) 3, var14)) {
                                var39 = var14.field915;
                            } else {
                                var39 = var14.field914;
                            }
                            if (var39 != null) {
                                var39.method169(var16, this.field1216, var15);
                            }
                        } else if (var14.field877 == 6) {
                            int var40 = Pix3D.field540;
                            int var41 = Pix3D.field541;
                            Pix3D.field540 = var14.field880 / 2 + var15;
                            Pix3D.field541 = var14.field881 / 2 + var16;
                            int var42 = Pix3D.field544[var14.field921] * var14.field920 >> 16;
                            int var43 = Pix3D.field545[var14.field921] * var14.field920 >> 16;
                            Model var44;
                            if (var14.field918 == -1) {
                                var44 = var14.method292(-1, -1, this.method433((byte) 3, var14));
                            } else {
                                SeqType var45 = SeqType.field938[var14.field918];
                                var44 = var14.method292(var45.field940[var14.field873], var45.field941[var14.field873], this.method433((byte) 3, var14));
                            }
                            if (var44 != null) {
                                var44.method135(0, var14.field922, 0, var14.field921, 0, var42, var43);
                            }
                            Pix3D.field540 = var40;
                            Pix3D.field541 = var41;
                        } else if (var14.field877 == 7) {
                            PixFont var46 = var14.field908;
                            int var47 = 0;
                            for (int var48 = 0; var48 < var14.field881; ++var48) {
                                for (int var49 = 0; var49 < var14.field880; ++var49) {
                                    if (var14.field871[var47] > 0) {
                                        ObjType var50 = ObjType.method265(var14.field871[var47] - 1);
                                        String var51 = var50.field809;
                                        if (var50.field821 || var14.field872[var47] != 1) {
                                            var51 = var14.field872[var47] + "x " + var51;
                                        }
                                        int var52 = (var14.field899 + 115) * var49 + var15;
                                        int var53 = (var14.field900 + 12) * var48 + var16;
                                        if (var14.field906) {
                                            if (var14.field907) {
                                                var46.method182(true, var53 + 1, 0, var14.field880 / 2 + var52 + 1, var51);
                                            }
                                            var46.method182(true, var53, var14.field911, var14.field880 / 2 + var52, var51);
                                        } else {
                                            if (var14.field907) {
                                                var46.method185(var51, var52 + 1, 0, true, var53 + 1);
                                            }
                                            var46.method185(var51, var52, var14.field911, true, var53);
                                        }
                                    }
                                    ++var47;
                                }
                            }
                        }
                    }
                }
                Pix2D.method143(var9, var8, var7, var6, 17913);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILjava/lang/String;)V")
    public final void method13(byte arg0, int arg1, String arg2) {
        this.method375(true);
        if (arg0 != -75) {
            field1031 = 212;
        }
        if (this.field1087 == null) {
            super.method13((byte) -75, arg1, arg2);
        } else {
            this.field1246.method227(-510);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1029.method182(true, var5 / 2 - 26 - var6, 16777215, var4 / 2, "RuneScape is loading - please wait...");
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method146(9179409, var7, 0, 304, 34, var4 / 2 - 152);
            Pix2D.method146(0, var7 + 1, 0, 302, 32, var4 / 2 - 151);
            Pix2D.method145(9179409, this.field1162, 30, var7 + 2, arg1 * 3, var4 / 2 - 150);
            Pix2D.method145(0, this.field1162, 30, var7 + 2, 300 - arg1 * 3, arg1 * 3 + (var4 / 2 - 150));
            this.field1029.method182(true, var5 / 2 + 5 - var6, 16777215, var4 / 2, arg2);
            this.field1246.method228(214, super.field13, 186, this.field1285);
            if (this.field1036) {
                this.field1036 = false;
                if (!this.field1261) {
                    this.field1247.method228(0, super.field13, 0, this.field1285);
                    this.field1248.method228(661, super.field13, 0, this.field1285);
                }
                this.field1244.method228(128, super.field13, 0, this.field1285);
                this.field1245.method228(214, super.field13, 386, this.field1285);
                this.field1249.method228(0, super.field13, 265, this.field1285);
                this.field1250.method228(574, super.field13, 265, this.field1285);
                this.field1251.method228(128, super.field13, 186, this.field1285);
                this.field1252.method228(574, super.field13, 186, this.field1285);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method9(int arg0) {
        if (arg0 == -14379) {
            if (!this.field1327 && !this.field1187 && !this.field1271) {
                if (!this.field1089) {
                    this.method399(false);
                } else {
                    this.method413(this.field1039);
                }
                this.field1121 = 0;
            } else {
                this.method350(42545);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lz;BILkb;I)V")
    private final void method379(PlayerEntity arg0, byte arg1, int arg2, Packet arg3, int arg4) {
        if (arg1 == 2) {
            boolean var6 = false;
        } else {
            field1031 = this.field1001.method238();
        }
        if ((arg4 & 1) == 1) {
            int var7 = arg3.method201();
            byte[] var8 = new byte[var7];
            Packet var9 = new Packet(var8, 4);
            arg3.method210(var8, var7, 7, 0);
            this.field1111[arg2] = var9;
            arg0.method110(var9, true);
        }
        if ((arg4 & 2) == 2) {
            int var10 = arg3.method203();
            if (var10 == 65535) {
                var10 = -1;
            }
            if (arg0.field319 == var10) {
                arg0.field323 = 0;
            }
            int var11 = arg3.method201();
            if (var10 == -1 || arg0.field319 == -1 || SeqType.field938[var10].field946 > SeqType.field938[arg0.field319].field946 || SeqType.field938[arg0.field319].field946 == 0) {
                arg0.field319 = var10;
                arg0.field320 = 0;
                arg0.field321 = 0;
                arg0.field322 = var11;
                arg0.field323 = 0;
            }
        }
        if ((arg4 & 4) == 4) {
            arg0.field313 = arg3.method203();
            if (arg0.field313 == 65535) {
                arg0.field313 = -1;
            }
        }
        if ((arg4 & 8) == 8) {
            arg0.field304 = arg3.method208();
            arg0.field306 = 0;
            arg0.field307 = 0;
            arg0.field305 = 150;
            this.method400(arg0.field304, 2, this.field1208, arg0.field349);
        }
        if ((arg4 & 16) == 16) {
            arg0.field308 = arg3.method201();
            arg0.field309 = arg3.method201();
            arg0.field310 = field1114 + 400;
            arg0.field311 = arg3.method201();
            arg0.field312 = arg3.method201();
        }
        if ((arg4 & 32) == 32) {
            arg0.field314 = arg3.method203();
            arg0.field315 = arg3.method203();
        }
        if ((arg4 & 64) == 64) {
            int var12 = arg3.method203();
            int var13 = arg3.method201();
            int var14 = arg3.field606;
            if (arg0.field349 != null) {
                long var15 = JString.method243(arg0.field349);
                boolean var17 = false;
                for (int var18 = 0; var18 < this.field1265; ++var18) {
                    if (this.field1040[var18] == var15) {
                        var17 = true;
                        break;
                    }
                }
                if (!var17) {
                    String var19 = WordPack.method249(-17950, var13, arg3);
                    String var20 = WordFilter.method312((byte) -82, var19);
                    arg0.field304 = var20;
                    arg0.field306 = var12 >> 8;
                    arg0.field307 = var12 & 255;
                    arg0.field305 = 150;
                    this.method400(var20, 2, this.field1208, arg0.field349);
                }
            }
            arg3.field606 = var13 + var14;
        }
        if ((arg4 & 256) == 256) {
            arg0.field324 = arg3.method203();
            int var21 = arg3.method206();
            arg0.field328 = var21 >> 16;
            arg0.field327 = (var21 & 65535) + field1114;
            arg0.field325 = 0;
            arg0.field326 = 0;
            if (arg0.field327 > field1114) {
                arg0.field325 = -1;
            }
            if (arg0.field324 == 65535) {
                arg0.field324 = -1;
            }
        }
        if ((arg4 & 512) == 512) {
            arg0.field329 = arg3.method201();
            arg0.field331 = arg3.method201();
            arg0.field330 = arg3.method201();
            arg0.field332 = arg3.method201();
            arg0.field333 = arg3.method203() + field1114;
            arg0.field334 = arg3.method203() + field1114;
            arg0.field335 = arg3.method201();
            arg0.field339 = 0;
            arg0.field340[0] = arg0.field330;
            arg0.field341[0] = arg0.field332;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method380(boolean arg0) {
        this.field1089 &= arg0;
        if (this.field1270 == 0) {
            int var2 = super.field11 / 2;
            int var3 = super.field12 / 2 + 90;
            if (super.field22 == 1 && super.field23 >= var2 - 75 && super.field23 <= var2 + 75 && super.field24 >= var3 - 20 && super.field24 <= var3 + 20) {
                this.field1328 = "";
                this.field1329 = "Enter your username & password.";
                this.field1270 = 2;
                this.field1226 = 0;
                return;
            }
        } else if (this.field1270 == 1 || this.field1270 == 2) {
            int var4 = super.field12 / 2 - 30;
            int var11 = var4 + 30;
            if (super.field22 == 1 && super.field24 >= var11 - 15 && super.field24 < var11) {
                this.field1226 = 0;
            }
            var4 = var11 + 15;
            if (super.field22 == 1 && super.field24 >= var4 - 15 && super.field24 < var4) {
                this.field1226 = 1;
            }
            var4 += 15;
            if (super.field22 == 1 && super.field24 >= var4 - 15 && super.field24 < var4 && this.field1270 == 1) {
                this.field1226 = 2;
            }
            int var5 = super.field11 / 2 - 80;
            int var6 = super.field12 / 2 + 60;
            if (super.field22 == 1 && super.field23 >= var5 - 75 && super.field23 <= var5 + 75 && super.field24 >= var6 - 20 && super.field24 <= var6 + 20) {
                if (this.field1270 == 1) {
                    this.method373(this.field1098, this.field1099, this.method396(-31414));
                } else {
                    this.method427(this.field1098, this.field1099, this.method396(-31414), false);
                }
            }
            int var7 = super.field11 / 2 + 80;
            if (super.field22 == 1 && super.field23 >= var7 - 75 && super.field23 <= var7 + 75 && super.field24 >= var6 - 20 && super.field24 <= var6 + 20) {
                this.field1270 = 0;
            }
            while (true) {
                while (true) {
                    int var8 = this.method5(6542);
                    if (var8 == -1) {
                        return;
                    }
                    boolean var9 = false;
                    for (int var10 = 0; var10 < field1115.length(); ++var10) {
                        if (var8 == field1115.charAt(var10)) {
                            var9 = true;
                            break;
                        }
                    }
                    if (this.field1226 == 0) {
                        if (var8 == 8 && this.field1098.length() > 0) {
                            this.field1098 = this.field1098.substring(0, this.field1098.length() - 1);
                        }
                        if (var8 == 9 || var8 == 10 || var8 == 13) {
                            this.field1226 = 1;
                        }
                        if (var9) {
                            this.field1098 = this.field1098 + (char) var8;
                        }
                        if (this.field1098.length() > 12) {
                            this.field1098 = this.field1098.substring(0, 12);
                        }
                    } else if (this.field1226 == 1) {
                        if (var8 == 8 && this.field1099.length() > 0) {
                            this.field1099 = this.field1099.substring(0, this.field1099.length() - 1);
                        }
                        if (var8 == 9 || var8 == 10 || var8 == 13) {
                            if (this.field1270 == 1) {
                                this.field1226 = 2;
                            } else {
                                this.field1226 = 0;
                            }
                        }
                        if (var9) {
                            this.field1099 = this.field1099 + (char) var8;
                        }
                        if (this.field1099.length() > 20) {
                            this.field1099 = this.field1099.substring(0, 20);
                        }
                    } else if (this.field1226 == 2) {
                        if (var8 == 8 && this.field1100.length() > 0) {
                            this.field1100 = this.field1100.substring(0, this.field1100.length() - 1);
                        }
                        if (var8 == 9 || var8 == 10 || var8 == 13) {
                            this.field1226 = 0;
                        }
                        if (var9) {
                            this.field1100 = this.field1100 + (char) var8;
                        }
                        if (this.field1100.length() > 20) {
                            this.field1100 = this.field1100.substring(0, 20);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method381(int arg0) {
        if (arg0 != 0) {
            this.field1166 = -1;
        }
        this.field1315 = new Pix8(this.field1087, "titlebox", 0);
        this.field1316 = new Pix8(this.field1087, "titlebutton", 0);
        this.field1269 = new Pix8[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field1269[var2] = new Pix8(this.field1087, "runes", var2);
        }
        this.field1042 = new Pix32(128, 265);
        this.field1043 = new Pix32(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field1042.field565[var3] = this.field1247.field655[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field1043.field565[var4] = this.field1248.field655[var4];
        }
        this.field1153 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field1153[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field1153[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1153[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1153[var8 + 192] = 16777215;
        }
        this.field1154 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1154[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1154[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1154[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1154[var12 + 192] = 16777215;
        }
        this.field1155 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1155[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1155[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1155[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1155[var16 + 192] = 16777215;
        }
        this.field1152 = new int[256];
        this.field1311 = new int[32768];
        this.field1312 = new int[32768];
        this.method422((byte) 57, (Pix8) null);
        this.field1150 = new int[32768];
        this.field1151 = new int[32768];
        this.method13((byte) -75, 10, "Connecting to fileserver");
        if (!this.field1261) {
            this.field1095 = true;
            this.field1261 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method382(int arg0) {
        LocType.field771.method101();
        LocType.field772.method101();
        if (arg0 != -40161) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        NpcType.field800.method101();
        ObjType.field836.method101();
        ObjType.field837.method101();
        PlayerEntity.field369.method101();
        SpotAnimType.field959.method101();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIILec;II)V")
    public final void method383(int arg0, int arg1, int arg2, int arg3, Component arg4, int arg5, int arg6) {
        if (arg4.field877 == 0 && arg4.field891 != null && !arg4.field890) {
            if (arg3 >= arg2 && arg5 >= arg6 && arg3 <= arg4.field880 + arg2 && arg5 <= arg4.field881 + arg6) {
                int var8 = arg4.field891.length;
                if (this.field1308 != arg0) {
                    this.field1200 = 313;
                }
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg4.field892[var9] + arg2;
                    int var11 = arg4.field893[var9] + arg6 - arg1;
                    Component var12 = Component.field870[arg4.field891[var9]];
                    int var13 = var12.field882 + var10;
                    int var14 = var12.field883 + var11;
                    if ((var12.field887 >= 0 || var12.field913 != 0) && arg3 >= var13 && arg5 >= var14 && arg3 < var12.field880 + var13 && arg5 < var12.field881 + var14) {
                        if (var12.field887 >= 0) {
                            this.field1178 = var12.field887;
                        } else {
                            this.field1178 = var12.field875;
                        }
                    }
                    if (var12.field877 == 0) {
                        this.method383(4, var12.field889, var13, arg3, var12, arg5, var14);
                        if (var12.field888 > var12.field881) {
                            this.method424(true, var12.field888, arg3, var12, var12.field880 + var13, this.field1011, var12.field881, arg5, var14);
                        }
                    } else {
                        if (var12.field878 == 1 && arg3 >= var13 && arg5 >= var14 && arg3 < var12.field880 + var13 && arg5 < var12.field881 + var14) {
                            this.field1075[this.field1065] = var12.field926;
                            this.field1203[this.field1065] = 508;
                            this.field1202[this.field1065] = var12.field875;
                            ++this.field1065;
                        }
                        if (var12.field878 == 2 && this.field1061 == 0 && arg3 >= var13 && arg5 >= var14 && arg3 < var12.field880 + var13 && arg5 < var12.field881 + var14) {
                            String var15 = var12.field923;
                            if (var15.indexOf(" ") != -1) {
                                var15 = var15.substring(0, var15.indexOf(" "));
                            }
                            this.field1075[this.field1065] = var15 + " @gre@" + var12.field924;
                            this.field1203[this.field1065] = 458;
                            this.field1202[this.field1065] = var12.field875;
                            ++this.field1065;
                        }
                        if (var12.field878 == 3 && arg3 >= var13 && arg5 >= var14 && arg3 < var12.field880 + var13 && arg5 < var12.field881 + var14) {
                            this.field1075[this.field1065] = "Close";
                            this.field1203[this.field1065] = 850;
                            this.field1202[this.field1065] = var12.field875;
                            ++this.field1065;
                        }
                        if (var12.field878 == 4 && arg3 >= var13 && arg5 >= var14 && arg3 < var12.field880 + var13 && arg5 < var12.field881 + var14) {
                            this.field1075[this.field1065] = var12.field926;
                            this.field1203[this.field1065] = 170;
                            this.field1202[this.field1065] = var12.field875;
                            ++this.field1065;
                        }
                        if (var12.field878 == 5 && arg3 >= var13 && arg5 >= var14 && arg3 < var12.field880 + var13 && arg5 < var12.field881 + var14) {
                            this.field1075[this.field1065] = var12.field926;
                            this.field1203[this.field1065] = 638;
                            this.field1202[this.field1065] = var12.field875;
                            ++this.field1065;
                        }
                        if (var12.field878 == 6 && !this.field1243 && arg3 >= var13 && arg5 >= var14 && arg3 < var12.field880 + var13 && arg5 < var12.field881 + var14) {
                            this.field1075[this.field1065] = var12.field926;
                            this.field1203[this.field1065] = 199;
                            this.field1202[this.field1065] = var12.field875;
                            ++this.field1065;
                        }
                        if (var12.field877 == 2) {
                            int var16 = 0;
                            for (int var17 = 0; var17 < var12.field881; ++var17) {
                                for (int var18 = 0; var18 < var12.field880; ++var18) {
                                    int var19 = (var12.field899 + 32) * var18 + var13;
                                    int var20 = (var12.field900 + 32) * var17 + var14;
                                    if (var16 < 20) {
                                        var19 += var12.field902[var16];
                                        var20 += var12.field903[var16];
                                    }
                                    if (arg3 >= var19 && arg5 >= var20 && arg3 < var19 + 32 && arg5 < var20 + 32) {
                                        this.field1013 = var16;
                                        this.field1014 = var12.field875;
                                        if (var12.field871[var16] > 0) {
                                            ObjType var21 = ObjType.method265(var12.field871[var16] - 1);
                                            if (this.field1067 == 1 && var12.field897) {
                                                if (this.field1069 != var12.field875 || this.field1068 != var16) {
                                                    this.field1075[this.field1065] = "Use " + this.field1071 + " with @lre@" + var21.field809;
                                                    this.field1203[this.field1065] = 786;
                                                    this.field1204[this.field1065] = var21.field807;
                                                    this.field1201[this.field1065] = var16;
                                                    this.field1202[this.field1065] = var12.field875;
                                                    ++this.field1065;
                                                }
                                            } else if (this.field1061 == 1 && var12.field897) {
                                                if ((this.field1063 & 16) == 16) {
                                                    this.field1075[this.field1065] = this.field1064 + " @lre@" + var21.field809;
                                                    this.field1203[this.field1065] = 602;
                                                    this.field1204[this.field1065] = var21.field807;
                                                    this.field1201[this.field1065] = var16;
                                                    this.field1202[this.field1065] = var12.field875;
                                                    ++this.field1065;
                                                }
                                            } else {
                                                if (var12.field897) {
                                                    for (int var22 = 4; var22 >= 3; --var22) {
                                                        if (var21.field825 != null && var21.field825[var22] != null) {
                                                            this.field1075[this.field1065] = var21.field825[var22] + " @lre@" + var21.field809;
                                                            if (var22 == 3) {
                                                                this.field1203[this.field1065] = 294;
                                                            }
                                                            if (var22 == 4) {
                                                                this.field1203[this.field1065] = 622;
                                                            }
                                                            this.field1204[this.field1065] = var21.field807;
                                                            this.field1201[this.field1065] = var16;
                                                            this.field1202[this.field1065] = var12.field875;
                                                            ++this.field1065;
                                                        } else if (var22 == 4) {
                                                            this.field1075[this.field1065] = "Drop @lre@" + var21.field809;
                                                            this.field1203[this.field1065] = 622;
                                                            this.field1204[this.field1065] = var21.field807;
                                                            this.field1201[this.field1065] = var16;
                                                            this.field1202[this.field1065] = var12.field875;
                                                            ++this.field1065;
                                                        }
                                                    }
                                                }
                                                if (var12.field898) {
                                                    this.field1075[this.field1065] = "Use @lre@" + var21.field809;
                                                    this.field1203[this.field1065] = 517;
                                                    this.field1204[this.field1065] = var21.field807;
                                                    this.field1201[this.field1065] = var16;
                                                    this.field1202[this.field1065] = var12.field875;
                                                    ++this.field1065;
                                                }
                                                if (var12.field897 && var21.field825 != null) {
                                                    for (int var23 = 2; var23 >= 0; --var23) {
                                                        if (var21.field825[var23] != null) {
                                                            this.field1075[this.field1065] = var21.field825[var23] + " @lre@" + var21.field809;
                                                            if (var23 == 0) {
                                                                this.field1203[this.field1065] = 649;
                                                            }
                                                            if (var23 == 1) {
                                                                this.field1203[this.field1065] = 408;
                                                            }
                                                            if (var23 == 2) {
                                                                this.field1203[this.field1065] = 176;
                                                            }
                                                            this.field1204[this.field1065] = var21.field807;
                                                            this.field1201[this.field1065] = var16;
                                                            this.field1202[this.field1065] = var12.field875;
                                                            ++this.field1065;
                                                        }
                                                    }
                                                }
                                                if (var12.field904 != null) {
                                                    for (int var24 = 4; var24 >= 0; --var24) {
                                                        if (var12.field904[var24] != null) {
                                                            this.field1075[this.field1065] = var12.field904[var24] + " @lre@" + var21.field809;
                                                            if (var24 == 0) {
                                                                this.field1203[this.field1065] = 288;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field1203[this.field1065] = 776;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field1203[this.field1065] = 857;
                                                            }
                                                            if (var24 == 3) {
                                                                this.field1203[this.field1065] = 881;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field1203[this.field1065] = 688;
                                                            }
                                                            this.field1204[this.field1065] = var21.field807;
                                                            this.field1201[this.field1065] = var16;
                                                            this.field1202[this.field1065] = var12.field875;
                                                            ++this.field1065;
                                                        }
                                                    }
                                                }
                                                this.field1075[this.field1065] = "Examine @lre@" + var21.field809;
                                                this.field1203[this.field1065] = 1685;
                                                this.field1204[this.field1065] = var21.field807;
                                                ++this.field1065;
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

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method384(int arg0, int arg1) {
        if (arg1 >= 0) {
            if (this.field1118) {
                this.field1118 = false;
                this.field1008 = true;
            }
            int var3 = this.field1201[arg1];
            int var4 = this.field1202[arg1];
            int var5 = this.field1203[arg1];
            int var6 = this.field1204[arg1];
            if (var5 == 170) {
                this.field1314.method192(160, 167);
                this.field1314.method194(var4);
                Component var7 = Component.field870[var4];
                if (var7.field884 != null && var7.field884[0][0] == 5) {
                    int var8 = var7.field884[0][1];
                    this.field1177[var8] = 1 - this.field1177[var8];
                    this.method363(var8, (byte) 7);
                    this.field1102 = true;
                }
            }
            if (var5 == 647) {
                this.method395(var4, var3, var6, 734, 249);
            }
            if (var5 == 517) {
                this.field1067 = 1;
                this.field1068 = var3;
                this.field1069 = var4;
                this.field1070 = var6;
                this.field1071 = ObjType.method265(var6).field809;
                this.field1061 = 0;
            } else {
                if (var5 == 310) {
                    this.method395(var4, var3, var6, 734, 82);
                }
                if (var5 == 490 || var5 == 914 || var5 == 75 || var5 == 486 || var5 == 772) {
                    NpcEntity var9 = this.field1319[var6];
                    if (var9 != null) {
                        this.method398(var9.field341[0], true, 0, false, 1, 1, 0, 0, this.field1053.field341[0], this.field1053.field340[0], var9.field340[0]);
                        this.field1171 = super.field23;
                        this.field1172 = super.field24;
                        this.field1174 = 2;
                        this.field1173 = 0;
                        if (var5 == 75) {
                            this.field1314.method192(160, 228);
                        }
                        if (var5 == 914) {
                            this.field1314.method192(160, 55);
                        }
                        if (var5 == 490) {
                            this.field1314.method192(160, 160);
                        }
                        if (var5 == 486) {
                            this.field1314.method192(160, 88);
                        }
                        if (var5 == 772) {
                            this.field1314.method192(160, 37);
                        }
                        this.field1314.method194(var6);
                    }
                }
                if (var5 == 792 && this.method395(var4, var3, var6, 734, 177)) {
                    this.field1314.method194(this.field1062);
                }
                if (var5 == 174 && this.method395(var4, var3, var6, 734, 7)) {
                    this.field1314.method194(this.field1070);
                    this.field1314.method194(this.field1068);
                    this.field1314.method194(this.field1069);
                }
                if (var5 == 1318) {
                    NpcEntity var10 = this.field1319[var6];
                    if (var10 != null) {
                        String var11;
                        if (var10.field346.field780 != null) {
                            var11 = new String(var10.field346.field780);
                        } else {
                            var11 = "It's a " + var10.field346.field779 + ".";
                        }
                        this.method400(var11, 0, this.field1208, "");
                    }
                }
                if (var5 == 404) {
                    if (!this.field1193) {
                        this.field1096.method86(0, super.field23 - 8, super.field24 - 11);
                    } else {
                        this.field1096.method86(0, var3 - 8, var4 - 11);
                    }
                }
                if (var5 == 652) {
                    boolean var12 = this.method398(var4, true, 0, false, 0, 0, 0, 0, this.field1053.field341[0], this.field1053.field340[0], var3);
                    if (!var12) {
                        this.method398(var4, true, 0, false, 1, 1, 0, 0, this.field1053.field341[0], this.field1053.field340[0], var3);
                    }
                    this.field1171 = super.field23;
                    this.field1172 = super.field24;
                    this.field1174 = 2;
                    this.field1173 = 0;
                    this.field1314.method192(160, 209);
                    this.field1314.method194(this.field1210 + var3);
                    this.field1314.method194(this.field1211 + var4);
                    this.field1314.method194(var6);
                    this.field1314.method194(this.field1070);
                    this.field1314.method194(this.field1068);
                    this.field1314.method194(this.field1069);
                }
                if (var5 == 786) {
                    this.field1314.method192(160, 40);
                    this.field1314.method194(var6);
                    this.field1314.method194(var3);
                    this.field1314.method194(var4);
                    this.field1314.method194(this.field1070);
                    this.field1314.method194(this.field1068);
                    this.field1314.method194(this.field1069);
                    this.field1157 = 0;
                    this.field1158 = var4;
                    this.field1159 = var3;
                    this.field1160 = 2;
                    if (Component.field870[var4].field876 == this.field1317) {
                        this.field1160 = 1;
                    }
                    if (Component.field870[var4].field876 == this.field1057) {
                        this.field1160 = 3;
                    }
                }
                if (var5 == 364 || var5 == 900 || var5 == 487 || var5 == 953) {
                    PlayerEntity var14 = this.field1106[var6];
                    if (var14 != null) {
                        this.method398(var14.field341[0], true, 0, false, 1, 1, 0, 0, this.field1053.field341[0], this.field1053.field340[0], var14.field340[0]);
                        this.field1171 = super.field23;
                        this.field1172 = super.field24;
                        this.field1174 = 2;
                        this.field1173 = 0;
                        if (var5 == 900) {
                            this.field1314.method192(160, 3);
                        }
                        if (var5 == 953) {
                            this.field1314.method192(160, 232);
                        }
                        if (var5 == 364) {
                            this.field1314.method192(160, 216);
                        }
                        if (var5 == 487) {
                            this.field1314.method192(160, 13);
                        }
                        this.field1314.method194(var6);
                    }
                }
                if (var5 == 1419) {
                    int var15 = var6 >> 14 & 32767;
                    LocType var16 = LocType.method253(var15);
                    String var17;
                    if (var16.field742 != null) {
                        var17 = new String(var16.field742);
                    } else {
                        var17 = "It's a " + var16.field741 + ".";
                    }
                    this.method400(var17, 0, this.field1208, "");
                }
                if (var5 == 34) {
                    this.method395(var4, var3, var6, 734, 229);
                }
                if (var5 == 288 || var5 == 776 || var5 == 857 || var5 == 881 || var5 == 688) {
                    if (var5 == 776) {
                        this.field1314.method192(160, 53);
                    }
                    if (var5 == 688) {
                        this.field1314.method192(160, 220);
                    }
                    if (var5 == 857) {
                        this.field1314.method192(160, 146);
                    }
                    if (var5 == 288) {
                        this.field1314.method192(160, 184);
                    }
                    if (var5 == 881) {
                        this.field1314.method192(160, 240);
                    }
                    this.field1314.method194(var6);
                    this.field1314.method194(var3);
                    this.field1314.method194(var4);
                    this.field1157 = 0;
                    this.field1158 = var4;
                    this.field1159 = var3;
                    this.field1160 = 2;
                    if (Component.field870[var4].field876 == this.field1317) {
                        this.field1160 = 1;
                    }
                    if (Component.field870[var4].field876 == this.field1057) {
                        this.field1160 = 3;
                    }
                }
                if (var5 == 199 && !this.field1243) {
                    this.field1314.method192(160, 194);
                    this.field1314.method194(var4);
                    this.field1243 = true;
                }
                if (var5 == 985) {
                    NpcEntity var18 = this.field1319[var6];
                    if (var18 != null) {
                        this.method398(var18.field341[0], true, 0, false, 1, 1, 0, 0, this.field1053.field341[0], this.field1053.field340[0], var18.field340[0]);
                        this.field1171 = super.field23;
                        this.field1172 = super.field24;
                        this.field1174 = 2;
                        this.field1173 = 0;
                        this.field1314.method192(160, 144);
                        this.field1314.method194(var6);
                        this.field1314.method194(this.field1070);
                        this.field1314.method194(this.field1068);
                        this.field1314.method194(this.field1069);
                    }
                }
                if (var5 == 850) {
                    this.field1314.method192(160, 122);
                    if (this.field1336 != -1) {
                        this.field1336 = -1;
                        this.field1102 = true;
                        this.field1243 = false;
                        this.field1347 = true;
                    }
                    if (this.field1057 != -1) {
                        this.field1057 = -1;
                        this.field1008 = true;
                        this.field1243 = false;
                    }
                    this.field1317 = -1;
                }
                if (var5 == 926) {
                    boolean var19 = this.method398(var4, true, 0, false, 0, 0, 0, 0, this.field1053.field341[0], this.field1053.field340[0], var3);
                    if (!var19) {
                        this.method398(var4, true, 0, false, 1, 1, 0, 0, this.field1053.field341[0], this.field1053.field340[0], var3);
                    }
                    this.field1171 = super.field23;
                    this.field1172 = super.field24;
                    this.field1174 = 2;
                    this.field1173 = 0;
                    this.field1314.method192(160, 45);
                    this.field1314.method194(this.field1210 + var3);
                    this.field1314.method194(this.field1211 + var4);
                    this.field1314.method194(var6);
                    this.field1314.method194(this.field1062);
                }
                if (var5 == 602) {
                    this.field1314.method192(160, 231);
                    this.field1314.method194(var6);
                    this.field1314.method194(var3);
                    this.field1314.method194(var4);
                    this.field1314.method194(this.field1062);
                    this.field1157 = 0;
                    this.field1158 = var4;
                    this.field1159 = var3;
                    this.field1160 = 2;
                    if (Component.field870[var4].field876 == this.field1317) {
                        this.field1160 = 1;
                    }
                    if (Component.field870[var4].field876 == this.field1057) {
                        this.field1160 = 3;
                    }
                }
                if (var5 == 649 || var5 == 408 || var5 == 176 || var5 == 294 || var5 == 622) {
                    if (var5 == 176) {
                        this.field1314.method192(160, 9);
                    }
                    if (var5 == 622) {
                        this.field1314.method192(160, 110);
                    }
                    if (var5 == 649) {
                        this.field1314.method192(160, 80);
                    }
                    if (var5 == 408) {
                        this.field1314.method192(160, 139);
                    }
                    if (var5 == 294) {
                        this.field1314.method192(160, 26);
                    }
                    this.field1314.method194(var6);
                    this.field1314.method194(var3);
                    this.field1314.method194(var4);
                    this.field1157 = 0;
                    this.field1158 = var4;
                    this.field1159 = var3;
                    this.field1160 = 2;
                    if (Component.field870[var4].field876 == this.field1317) {
                        this.field1160 = 1;
                    }
                    if (Component.field870[var4].field876 == this.field1057) {
                        this.field1160 = 3;
                    }
                }
                if (var5 == 533 || var5 == 947 || var5 == 705 || var5 == 912 || var5 == 603) {
                    boolean var21 = this.method398(var4, true, 0, false, 0, 0, 0, 0, this.field1053.field341[0], this.field1053.field340[0], var3);
                    if (!var21) {
                        this.method398(var4, true, 0, false, 1, 1, 0, 0, this.field1053.field341[0], this.field1053.field340[0], var3);
                    }
                    this.field1171 = super.field23;
                    this.field1172 = super.field24;
                    this.field1174 = 2;
                    this.field1173 = 0;
                    if (var5 == 912) {
                        this.field1314.method192(160, 142);
                    }
                    if (var5 == 705) {
                        this.field1314.method192(160, 96);
                    }
                    if (var5 == 603) {
                        this.field1314.method192(160, 131);
                    }
                    if (var5 == 947) {
                        this.field1314.method192(160, 251);
                    }
                    if (var5 == 533) {
                        this.field1314.method192(160, 91);
                    }
                    this.field1314.method194(this.field1210 + var3);
                    this.field1314.method194(this.field1211 + var4);
                    this.field1314.method194(var6);
                }
                if (var5 == 1585 || var5 == 1685) {
                    ObjType var23 = ObjType.method265(var6);
                    String var24;
                    if (var23.field810 != null) {
                        var24 = new String(var23.field810);
                    } else {
                        var24 = "It's a " + var23.field809 + ".";
                    }
                    this.method400(var24, 0, this.field1208, "");
                }
                if (var5 == 638) {
                    this.field1314.method192(160, 167);
                    this.field1314.method194(var4);
                    Component var25 = Component.field870[var4];
                    if (var25.field884 != null && var25.field884[0][0] == 5) {
                        int var26 = var25.field884[0][1];
                        if (this.field1177[var26] != var25.field886[0]) {
                            this.field1177[var26] = var25.field886[0];
                            this.method363(var26, (byte) 7);
                            this.field1102 = true;
                        }
                    }
                }
                if (var5 == 447) {
                    this.method395(var4, var3, var6, 734, 16);
                }
                if (var5 == 458) {
                    Component var27 = Component.field870[var4];
                    this.field1061 = 1;
                    this.field1062 = var4;
                    this.field1063 = var27.field925;
                    this.field1067 = 0;
                    String var28 = var27.field923;
                    if (var28.indexOf(" ") != -1) {
                        var28 = var28.substring(0, var28.indexOf(" "));
                    }
                    String var29 = var27.field923;
                    if (var29.indexOf(" ") != -1) {
                        var29 = var29.substring(var29.indexOf(" ") + 1);
                    }
                    this.field1064 = var28 + " " + var27.field924 + " " + var29;
                    if (this.field1063 == 16) {
                        this.field1102 = true;
                        this.field1262 = 3;
                        this.field1347 = true;
                    }
                } else {
                    if (var5 == 508) {
                        Component var30 = Component.field870[var4];
                        boolean var31 = true;
                        if (var30.field879 > 0) {
                            var31 = this.method393(var30, (byte) 3);
                        }
                        if (var31) {
                            this.field1314.method192(160, 167);
                            this.field1314.method194(var4);
                        }
                    }
                    if (var5 == 846) {
                        this.method395(var4, var3, var6, 734, 171);
                    }
                    if (var5 == 946) {
                        NpcEntity var32 = this.field1319[var6];
                        if (var32 != null) {
                            this.method398(var32.field341[0], true, 0, false, 1, 1, 0, 0, this.field1053.field341[0], this.field1053.field340[0], var32.field340[0]);
                            this.field1171 = super.field23;
                            this.field1172 = super.field24;
                            this.field1174 = 2;
                            this.field1173 = 0;
                            this.field1314.method192(160, 213);
                            this.field1314.method194(var6);
                            this.field1314.method194(this.field1062);
                        }
                    }
                    if (var5 == 989) {
                        PlayerEntity var33 = this.field1106[var6];
                        if (var33 != null) {
                            this.method398(var33.field341[0], true, 0, false, 1, 1, 0, 0, this.field1053.field341[0], this.field1053.field340[0], var33.field340[0]);
                            this.field1171 = super.field23;
                            this.field1172 = super.field24;
                            this.field1174 = 2;
                            this.field1173 = 0;
                            this.field1314.method192(160, 172);
                            this.field1314.method194(var6);
                            this.field1314.method194(this.field1062);
                        }
                    }
                    if (var5 == 933) {
                        PlayerEntity var34 = this.field1106[var6];
                        if (var34 != null) {
                            this.method398(var34.field341[0], true, 0, false, 1, 1, 0, 0, this.field1053.field341[0], this.field1053.field340[0], var34.field340[0]);
                            this.field1171 = super.field23;
                            this.field1172 = super.field24;
                            this.field1174 = 2;
                            this.field1173 = 0;
                            this.field1314.method192(160, 10);
                            this.field1314.method194(var6);
                            this.field1314.method194(this.field1070);
                            this.field1314.method194(this.field1068);
                            this.field1314.method194(this.field1069);
                        }
                    }
                    this.field1067 = 0;
                    this.field1061 = 0;
                    if (this.field1066 != arg0) {
                        this.field1166 = this.field1256.method201();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method385(int arg0) {
        if (this.field1093 > 1) {
            --this.field1093;
        }
        for (int var2 = 0; var2 < 5 && this.method351(0); ++var2) {
        }
        if (this.field1089) {
            if (InputTracking.field72) {
                Packet var3 = InputTracking.method35(-800);
                if (var3 != null) {
                    this.field1314.method192(160, 35);
                    this.field1314.method194(var3.field606);
                    this.field1314.method199(2, var3.field605, 0, var3.field606);
                    var3.method191(0);
                }
            }
            ++this.field1167;
            if (this.field1167 > 750) {
                this.method359(0);
            }
            this.method439(116);
            this.method406(false);
            this.method365(-888);
            if (arg0 >= 0) {
                field1190 = !field1190;
            }
            this.method356(false);
            ++this.field1097;
            if (this.field1174 != 0) {
                this.field1173 += 20;
                if (this.field1173 >= 400) {
                    this.field1174 = 0;
                }
            }
            if (this.field1160 != 0) {
                ++this.field1157;
                if (this.field1157 >= 15) {
                    if (this.field1160 == 2) {
                        this.field1102 = true;
                    }
                    if (this.field1160 == 3) {
                        this.field1008 = true;
                    }
                    this.field1160 = 0;
                }
            }
            if (this.field1129 != 0) {
                if (super.field20 > this.field1130 + 5 || super.field20 < this.field1130 - 5 || super.field21 > this.field1131 + 5 || super.field21 < this.field1131 - 5) {
                    this.field1059 = true;
                }
                if (super.field19 == 0) {
                    if (this.field1129 == 2) {
                        this.field1102 = true;
                    }
                    if (this.field1129 == 3) {
                        this.field1008 = true;
                    }
                    this.field1129 = 0;
                    if (this.field1059) {
                        this.field1014 = -1;
                        this.method405(0);
                        if (this.field1127 == this.field1014 && this.field1128 != this.field1013) {
                            Component var4 = Component.field870[this.field1127];
                            int var5 = var4.field871[this.field1013];
                            var4.field871[this.field1013] = var4.field871[this.field1128];
                            var4.field871[this.field1128] = var5;
                            int var6 = var4.field872[this.field1013];
                            var4.field872[this.field1013] = var4.field872[this.field1128];
                            var4.field872[this.field1128] = var6;
                            this.field1314.method192(160, 61);
                            this.field1314.method194(this.field1127);
                            this.field1314.method194(this.field1128);
                            this.field1314.method194(this.field1013);
                        }
                    } else if (this.field1103 == 1 && this.field1065 > 2) {
                        this.method355(-23085);
                    } else if (this.field1065 > 0) {
                        this.method384(this.field1066, this.field1065 - 1);
                    }
                    this.field1157 = 10;
                    super.field22 = 0;
                }
            }
            if (World3D.field248 != -1) {
                int var7 = World3D.field248;
                int var8 = World3D.field249;
                boolean var9 = this.method398(var8, true, 0, true, 0, 0, 0, 0, this.field1053.field341[0], this.field1053.field340[0], var7);
                World3D.field248 = -1;
                if (var9) {
                    this.field1171 = super.field23;
                    this.field1172 = super.field24;
                    this.field1174 = 1;
                    this.field1173 = 0;
                }
            }
            this.method425(0);
            this.method394(this.field1135);
            this.method390(7);
            this.method389(962);
            if (super.field19 == 1 || super.field22 == 1) {
                ++this.field1121;
            }
            if (this.field1324 == 2) {
                this.method377((byte) 2);
            }
            if (this.field1324 == 2 && this.field1037) {
                this.method388(1);
            }
            for (int var10 = 0; var10 < 5; ++var10) {
                int var10002 = this.field1322[var10]++;
            }
            this.method357(206);
            ++super.field18;
            if (super.field18 > 4500) {
                super.field18 -= 500;
                this.field1314.method192(160, 126);
            }
            ++this.field1306;
            if (this.field1306 > 500) {
                this.field1306 = 0;
                int var11 = (int) (Math.random() * 8.0D);
                if ((var11 & 1) == 1) {
                    this.field1267 += this.field1268;
                }
                if ((var11 & 2) == 2) {
                    this.field1044 += this.field1045;
                }
                if ((var11 & 4) == 4) {
                    this.field1229 += this.field1230;
                }
            }
            if (this.field1267 < -50) {
                this.field1268 = 2;
            }
            if (this.field1267 > 50) {
                this.field1268 = -2;
            }
            if (this.field1044 < -55) {
                this.field1045 = 2;
            }
            if (this.field1044 > 55) {
                this.field1045 = -2;
            }
            if (this.field1229 < -40) {
                this.field1230 = 1;
            }
            if (this.field1229 > 40) {
                this.field1230 = -1;
            }
            ++this.field1168;
            if (this.field1168 > 50) {
                this.field1314.method192(160, 87);
            }
            try {
                if (this.field1119 != null && this.field1314.field606 > 0) {
                    this.field1119.method32(this.field1314.field605, this.field1314.field606, false, 0);
                    this.field1314.field606 = 0;
                    this.field1168 = 0;
                }
            } catch (IOException var13) {
                this.method359(0);
            } catch (Exception var14) {
                this.method352(this.field1194);
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method386(int arg0) {
        if (arg0 != 7) {
            this.field1166 = -1;
        }
        for (LocEntity var2 = (LocEntity) this.field1298.method220(); var2 != null; var2 = (LocEntity) this.field1298.method222(35239)) {
            boolean var3 = false;
            var2.field644 += this.field1097;
            if (var2.field643 == -1) {
                var2.field643 = 0;
                var3 = true;
            }
            label61: {
                do {
                    do {
                        if (var2.field644 <= var2.field642.field942[var2.field643]) {
                            break label61;
                        }
                        var2.field644 -= var2.field642.field942[var2.field643] + 1;
                        ++var2.field643;
                        var3 = true;
                    } while (var2.field643 < var2.field642.field939);
                    var2.field643 -= var2.field642.field943;
                } while (var2.field643 >= 0 && var2.field643 < var2.field642.field939);
                var2.method104();
                var3 = false;
            }
            if (var3) {
                int var4 = var2.field637;
                int var5 = var2.field639;
                int var6 = var2.field640;
                int var7 = 0;
                if (var2.field638 == 0) {
                    var7 = this.field1096.method74(var4, var5, var6);
                }
                if (var2.field638 == 1) {
                    var7 = this.field1096.method75(var5, var6, this.field1200, var4);
                }
                if (var2.field638 == 2) {
                    var7 = this.field1096.method76(var4, var5, var6);
                }
                if (var7 != 0 && (var7 >> 14 & 32767) == var2.field641) {
                    int var8 = this.field1080[var4][var5][var6];
                    int var9 = this.field1080[var4][var5 + 1][var6];
                    int var10 = this.field1080[var4][var5 + 1][var6 + 1];
                    int var11 = this.field1080[var4][var5][var6 + 1];
                    LocType var12 = LocType.method253(var2.field641);
                    int var13 = -1;
                    if (var2.field643 != -1) {
                        var13 = var2.field642.field940[var2.field643];
                    }
                    if (var2.field638 == 2) {
                        int var14 = this.field1096.method78(var4, var5, var6, var7);
                        int var15 = var14 & 31;
                        int var16 = var14 >> 6;
                        Model var17 = var12.method256(var15, var16, var8, var9, var10, var11, var13);
                        this.field1096.method66(var17, 959, var6, var5, var4);
                    } else if (var2.field638 == 1) {
                        Model var18 = var12.method256(4, 0, var8, var9, var10, var11, var13);
                        this.field1096.method67(38499, var5, var6, var18, var4);
                    } else if (var2.field638 == 0) {
                        int var19 = this.field1096.method78(var4, var5, var6, var7);
                        int var20 = var19 & 31;
                        int var21 = var19 >> 6;
                        Model var22 = var12.method256(var20, var21, var8, var9, var10, var11, var13);
                        this.field1096.method68(var22, this.field1305, var4, var6, var5);
                    }
                } else {
                    var2.method104();
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBI)Ljava/lang/String;")
    public static final String method387(int arg0, byte arg1, int arg2) {
        if (arg1 != -102) {
            field1190 = !field1190;
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

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method388(int arg0) {
        if (arg0 != 1) {
            this.field1166 = -1;
        }
        int var2 = this.field1219 * 128 + 64;
        int var3 = this.field1220 * 128 + 64;
        int var4 = this.method341(this.field1219, this.field1220, this.field1077, (byte) 9) - this.field1221;
        if (this.field1273 < var2) {
            this.field1273 += (var2 - this.field1273) * this.field1223 / 1000 + this.field1222;
            if (this.field1273 > var2) {
                this.field1273 = var2;
            }
        }
        if (this.field1273 > var2) {
            this.field1273 -= (this.field1273 - var2) * this.field1223 / 1000 + this.field1222;
            if (this.field1273 < var2) {
                this.field1273 = var2;
            }
        }
        if (this.field1274 < var4) {
            this.field1274 += (var4 - this.field1274) * this.field1223 / 1000 + this.field1222;
            if (this.field1274 > var4) {
                this.field1274 = var4;
            }
        }
        if (this.field1274 > var4) {
            this.field1274 -= (this.field1274 - var4) * this.field1223 / 1000 + this.field1222;
            if (this.field1274 < var4) {
                this.field1274 = var4;
            }
        }
        if (this.field1275 < var3) {
            this.field1275 += (var3 - this.field1275) * this.field1223 / 1000 + this.field1222;
            if (this.field1275 > var3) {
                this.field1275 = var3;
            }
        }
        if (this.field1275 > var3) {
            this.field1275 -= (this.field1275 - var3) * this.field1223 / 1000 + this.field1222;
            if (this.field1275 < var3) {
                this.field1275 = var3;
            }
        }
        int var5 = this.field1145 * 128 + 64;
        int var6 = this.field1146 * 128 + 64;
        int var7 = this.method341(this.field1145, this.field1146, this.field1077, (byte) 9) - this.field1147;
        int var8 = var5 - this.field1273;
        int var9 = var7 - this.field1274;
        int var10 = var6 - this.field1275;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field1276 < var12) {
            this.field1276 += (var12 - this.field1276) * this.field1149 / 1000 + this.field1148;
            if (this.field1276 > var12) {
                this.field1276 = var12;
            }
        }
        if (this.field1276 > var12) {
            this.field1276 -= (this.field1276 - var12) * this.field1149 / 1000 + this.field1148;
            if (this.field1276 < var12) {
                this.field1276 = var12;
            }
        }
        int var14 = var13 - this.field1277;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field1277 += this.field1149 * var14 / 1000 + this.field1148;
        }
        if (var14 < 0) {
            this.field1277 -= -var14 * this.field1149 / 1000 + this.field1148;
        }
        int var15 = var13 - this.field1277;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field1277 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method389(int arg0) {
        int var2 = 82 / arg0;
        if (super.field22 == 1) {
            if (super.field23 >= 8 && super.field23 <= 108 && super.field24 >= 490 && super.field24 <= 522) {
                this.field1331 = (this.field1331 + 1) % 3;
                this.field1010 = true;
                this.field1008 = true;
                this.field1314.method192(160, 227);
                this.field1314.method193(this.field1331);
                this.field1314.method193(this.field1117);
                this.field1314.method193(this.field1176);
            }
            if (super.field23 >= 137 && super.field23 <= 237 && super.field24 >= 490 && super.field24 <= 522) {
                this.field1117 = (this.field1117 + 1) % 3;
                this.field1010 = true;
                this.field1008 = true;
                this.field1314.method192(160, 227);
                this.field1314.method193(this.field1331);
                this.field1314.method193(this.field1117);
                this.field1314.method193(this.field1176);
            }
            if (super.field23 >= 275 && super.field23 <= 375 && super.field24 >= 490 && super.field24 <= 522) {
                this.field1176 = (this.field1176 + 1) % 3;
                this.field1010 = true;
                this.field1008 = true;
                this.field1314.method192(160, 227);
                this.field1314.method193(this.field1331);
                this.field1314.method193(this.field1117);
                this.field1314.method193(this.field1176);
            }
            boolean var10000;
            if (super.field23 >= 416 && super.field23 <= 516 && super.field24 >= 490 && super.field24 <= 522) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method390(int arg0) {
        if (arg0 != 7) {
            this.field1166 = -1;
        }
        if (super.field22 == 1) {
            if (super.field23 >= 549 && super.field23 <= 583 && super.field24 >= 195 && super.field24 < 231) {
                this.field1102 = true;
                this.field1262 = 0;
                this.field1347 = true;
            }
            if (super.field23 >= 579 && super.field23 <= 609 && super.field24 >= 194 && super.field24 < 231) {
                this.field1102 = true;
                this.field1262 = 1;
                this.field1347 = true;
            }
            if (super.field23 >= 607 && super.field23 <= 637 && super.field24 >= 194 && super.field24 < 231) {
                this.field1102 = true;
                this.field1262 = 2;
                this.field1347 = true;
            }
            if (super.field23 >= 635 && super.field23 <= 679 && super.field24 >= 194 && super.field24 < 229) {
                this.field1102 = true;
                this.field1262 = 3;
                this.field1347 = true;
            }
            if (super.field23 >= 676 && super.field23 <= 706 && super.field24 >= 194 && super.field24 < 231) {
                this.field1102 = true;
                this.field1262 = 4;
                this.field1347 = true;
            }
            if (super.field23 >= 704 && super.field23 <= 734 && super.field24 >= 194 && super.field24 < 231) {
                this.field1102 = true;
                this.field1262 = 5;
                this.field1347 = true;
            }
            if (super.field23 >= 732 && super.field23 <= 766 && super.field24 >= 195 && super.field24 < 231) {
                this.field1102 = true;
                this.field1262 = 6;
                this.field1347 = true;
            }
            if (super.field23 >= 582 && super.field23 <= 612 && super.field24 >= 492 && super.field24 < 529) {
                this.field1102 = true;
                this.field1262 = 8;
                this.field1347 = true;
            }
            if (super.field23 >= 609 && super.field23 <= 639 && super.field24 >= 492 && super.field24 < 529) {
                this.field1102 = true;
                this.field1262 = 9;
                this.field1347 = true;
            }
            if (super.field23 >= 637 && super.field23 <= 681 && super.field24 >= 493 && super.field24 < 528) {
                this.field1102 = true;
                this.field1262 = 10;
                this.field1347 = true;
            }
            if (super.field23 >= 679 && super.field23 <= 709 && super.field24 >= 492 && super.field24 < 529) {
                this.field1102 = true;
                this.field1262 = 11;
                this.field1347 = true;
            }
            if (super.field23 >= 706 && super.field23 <= 736 && super.field24 >= 492 && super.field24 < 529) {
                this.field1102 = true;
                this.field1262 = 12;
                this.field1347 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Lkb;II)V")
    private final void method391(Packet arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1109; ++var4) {
            int var5 = this.field1110[var4];
            PlayerEntity var6 = this.field1106[var5];
            int var7 = arg0.method201();
            if ((var7 & 128) == 128) {
                var7 += arg0.method201() << 8;
            }
            this.method379(var6, (byte) 2, var5, arg0, var7);
        }
        if (arg1 < 7 || arg1 > 7) {
            this.field1039 = this.field1001.method238();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLec;)V")
    public final void method392(byte arg0, Component arg1) {
        int var3 = arg1.field879;
        if (arg0 != 36) {
            this.field995 = !this.field995;
        }
        if (var3 >= 1 && var3 <= 100) {
            --var3;
            if (var3 >= this.field993) {
                arg1.field909 = "";
                arg1.field878 = 0;
            } else {
                arg1.field909 = this.field1056[var3];
                arg1.field878 = 1;
                if (arg1.field926 == null) {
                    arg1.field878 = 0;
                }
            }
        } else if (var3 >= 101 && var3 <= 200) {
            var3 -= 101;
            if (var3 >= this.field993) {
                arg1.field909 = "";
                arg1.field878 = 0;
            } else {
                if (this.field1138[var3] == 0) {
                    arg1.field909 = "@red@Offline";
                } else if (this.field1138[var3] == this.field1074) {
                    arg1.field909 = "@gre@World-" + (this.field1138[var3] - 9);
                } else {
                    arg1.field909 = "@yel@World-" + (this.field1138[var3] - 9);
                }
                arg1.field878 = 1;
                if (arg1.field926 == null) {
                    arg1.field878 = 0;
                }
            }
        } else if (var3 == 203) {
            arg1.field888 = this.field993 * 15 + 20;
            if (arg1.field888 <= arg1.field881) {
                arg1.field888 = arg1.field881 + 1;
            }
        } else if (var3 >= 401 && var3 <= 500) {
            var3 -= 401;
            if (var3 >= this.field1265) {
                arg1.field909 = "";
                arg1.field878 = 0;
            } else {
                arg1.field909 = JString.method246(-580, JString.method244(true, this.field1040[var3]));
            }
        } else if (var3 == 503) {
            arg1.field888 = this.field1265 * 15 + 20;
            if (arg1.field888 <= arg1.field881) {
                arg1.field888 = arg1.field881 + 1;
            }
        } else if (var3 != 327) {
            if (var3 == 324) {
                if (this.field1191 == null) {
                    this.field1191 = arg1.field914;
                    this.field1192 = arg1.field915;
                }
                if (this.field1325) {
                    arg1.field914 = this.field1192;
                } else {
                    arg1.field914 = this.field1191;
                }
            } else if (var3 == 325) {
                if (this.field1191 == null) {
                    this.field1191 = arg1.field914;
                    this.field1192 = arg1.field915;
                }
                if (this.field1325) {
                    arg1.field914 = this.field1191;
                } else {
                    arg1.field914 = this.field1192;
                }
            }
        } else {
            arg1.field921 = 150;
            arg1.field922 = (int) (Math.sin((double) field1114 / 40.0D) * 256.0D) & 2047;
            if (this.field1015) {
                this.field1015 = false;
                Model[] var4 = new Model[7];
                int var5 = 0;
                for (int var6 = 0; var6 < 7; ++var6) {
                    int var9 = this.field1238[var6];
                    if (var9 >= 0) {
                        var4[var5++] = IdkType.field863[var9].method289();
                    }
                }
                Model var7 = new Model(false, var5, var4);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field1144[var8] != 0) {
                        var7.method129(field1293[var8][0], field1293[var8][this.field1144[var8]]);
                        if (var8 == 1) {
                            var7.method129(field1019[0], field1019[this.field1144[var8]]);
                        }
                    }
                }
                var7.method122((byte) 3);
                var7.method123(7, SeqType.field938[this.field1053.field297].field940[0]);
                var7.method132(64, 850, -30, -50, -30, true);
                arg1.field916 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lec;B)Z")
    public final boolean method393(Component arg0, byte arg1) {
        if (arg1 == 3) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        int var5 = arg0.field879;
        if (var5 == 201) {
            this.field1008 = true;
            this.field1118 = false;
            this.field1094 = true;
            this.field1242 = "";
            this.field1330 = 1;
            this.field1050 = "Enter name of friend to add to list";
        }
        if (var5 == 202) {
            this.field1008 = true;
            this.field1118 = false;
            this.field1094 = true;
            this.field1242 = "";
            this.field1330 = 2;
            this.field1050 = "Enter name of friend to delete from list";
        }
        if (var5 >= 1 && var5 <= 200) {
            if (var5 >= 101) {
                var5 -= 101;
            } else {
                --var5;
            }
            if (this.field1138[var5] > 0) {
                this.field1008 = true;
                this.field1118 = false;
                this.field1094 = true;
                this.field1242 = "";
                this.field1330 = 3;
                this.field996 = var5;
                this.field1050 = "Enter message to send to " + this.field1056[var5];
            }
        }
        if (var5 == 501) {
            this.field1008 = true;
            this.field1118 = false;
            this.field1094 = true;
            this.field1242 = "";
            this.field1330 = 4;
            this.field1050 = "Enter name of player to add to list";
        }
        if (var5 == 502) {
            this.field1008 = true;
            this.field1118 = false;
            this.field1094 = true;
            this.field1242 = "";
            this.field1330 = 5;
            this.field1050 = "Enter name of player to delete from list";
        }
        if (var5 >= 300 && var5 <= 313) {
            int var6 = (var5 - 300) / 2;
            int var7 = var5 & 1;
            int var8 = this.field1238[var6];
            if (var8 != -1) {
                while (true) {
                    if (var7 == 0) {
                        --var8;
                        if (var8 < 0) {
                            var8 = IdkType.field862 - 1;
                        }
                    }
                    if (var7 == 1) {
                        ++var8;
                        if (var8 >= IdkType.field862) {
                            var8 = 0;
                        }
                    }
                    if (IdkType.field863[var8].field864 == var6 + (this.field1325 ? 0 : 7)) {
                        this.field1238[var6] = var8;
                        this.field1015 = true;
                        break;
                    }
                }
            }
        }
        if (var5 >= 314 && var5 <= 323) {
            int var9 = (var5 - 314) / 2;
            int var10 = var5 & 1;
            int var11 = this.field1144[var9];
            if (var10 == 0) {
                --var11;
                if (var11 < 0) {
                    var11 = field1293[var9].length - 1;
                }
            }
            if (var10 == 1) {
                ++var11;
                if (var11 >= field1293[var9].length) {
                    var11 = 0;
                }
            }
            this.field1144[var9] = var11;
            this.field1015 = true;
        }
        if (var5 == 324 && !this.field1325) {
            this.field1325 = true;
            this.method367(1);
        }
        if (var5 == 325 && this.field1325) {
            this.field1325 = false;
            this.method367(1);
        }
        if (var5 != 326) {
            return false;
        } else {
            this.field1314.method192(160, 134);
            this.field1314.method193(this.field1325 ? 0 : 1);
            for (int var12 = 0; var12 < 7; ++var12) {
                this.field1314.method193(this.field1238[var12]);
            }
            for (int var13 = 0; var13 < 5; ++var13) {
                this.field1314.method193(this.field1144[var13]);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(B)V")
    public final void method7(byte arg0) {
        if (!this.field1327 && !this.field1187 && !this.field1271) {
            ++field1114;
            if (arg0 != 3) {
                field1183 = !field1183;
            }
            if (!this.field1089) {
                this.method380(true);
            } else {
                this.method385(-595);
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method394(int arg0) {
        if (arg0 != 42788) {
            this.method6();
        }
        if (super.field22 == 1) {
            int var2 = super.field23 - 21 - 561;
            int var3 = super.field24 - 9 - 5;
            if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                var2 -= 73;
                var3 -= 75;
                int var4 = Pix3D.field544[this.field1279];
                int var5 = Pix3D.field545[this.field1279];
                int var6 = var2 * var5 + var3 * var4 >> 11;
                int var7 = var3 * var5 - var2 * var4 >> 11;
                int var8 = this.field1053.field292 + var6 >> 7;
                int var9 = this.field1053.field293 - var7 >> 7;
                this.method398(var9, true, 0, true, 0, 0, 0, 0, this.field1053.field341[0], this.field1053.field340[0], var8);
                return;
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
                    return new URL("http://" + this.field1348 + ":" + (this.field1272 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)Z")
    public final boolean method395(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 92 / arg3;
        int var7 = arg2 >> 14 & 32767;
        int var8 = this.field1096.method78(this.field1077, arg1, arg0, arg2);
        if (var8 == -1) {
            return false;
        } else {
            int var9 = var8 & 31;
            int var10 = var8 >> 6 & 3;
            if (var9 != 10 && var9 != 11 && var9 != 22) {
                this.method398(arg0, true, var9 + 1, false, 0, 0, 0, var10, this.field1053.field341[0], this.field1053.field340[0], arg1);
            } else {
                LocType var11 = LocType.method253(var7);
                int var12;
                int var13;
                if (var10 != 0 && var10 != 2) {
                    var12 = var11.field746;
                    var13 = var11.field745;
                } else {
                    var12 = var11.field745;
                    var13 = var11.field746;
                }
                int var14 = var11.field769;
                if (var10 != 0) {
                    var14 = (var14 >> 4 - var10) + (var14 << var10 & 15);
                }
                this.method398(arg0, true, 0, false, var13, var12, var14, 0, this.field1053.field341[0], this.field1053.field340[0], arg1);
            }
            this.field1171 = super.field23;
            this.field1172 = super.field24;
            this.field1174 = 2;
            this.field1173 = 0;
            this.field1314.method192(160, arg4);
            this.field1314.method194(this.field1210 + arg1);
            this.field1314.method194(this.field1211 + arg0);
            this.field1314.method194(var7);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)I")
    public final int method396(int arg0) {
        if (arg0 != -31414) {
            this.field1314.method193(236);
        }
        return 0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method397(int arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field993; ++var3) {
                if (arg1.equalsIgnoreCase(this.field1056[var3])) {
                    return true;
                }
            }
            if (arg0 < 7 || arg0 > 7) {
                field1183 = !field1183;
            }
            return arg1.equalsIgnoreCase(this.field1053.field349);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIZIIIIIII)Z")
    public final boolean method398(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        byte var12 = 104;
        byte var13 = 104;
        for (int var14 = 0; var14 < var12; ++var14) {
            for (int var34 = 0; var34 < var13; ++var34) {
                this.field1214[var14][var34] = 0;
                this.field1266[var14][var34] = 99999999;
            }
        }
        int var15 = arg9;
        int var16 = arg8;
        this.field1214[arg9][arg8] = 99;
        this.field1266[arg9][arg8] = 0;
        byte var17 = 0;
        int var18 = 0;
        this.field1078[var17] = arg9;
        this.field1089 &= arg1;
        int var35 = var17 + 1;
        this.field1079[var17] = arg8;
        boolean var19 = false;
        int var20 = this.field1078.length;
        int[][] var21 = this.field1092[this.field1077].field849;
        while (var35 != var18) {
            var15 = this.field1078[var18];
            var16 = this.field1079[var18];
            var18 = (var18 + 1) % var20;
            if (arg10 == var15 && arg0 == var16) {
                var19 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && this.field1092[this.field1077].method281(var16, arg2 - 1, arg7, arg0, arg10, 7, var15)) {
                    var19 = true;
                    break;
                }
                if (arg2 < 10 && this.field1092[this.field1077].method282(arg10, var16, (byte) -14, var15, arg2 - 1, arg0, arg7)) {
                    var19 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg4 != 0 && this.field1092[this.field1077].method283(arg6, this.field1164, arg5, arg0, arg4, arg10, var15, var16)) {
                var19 = true;
                break;
            }
            int var33 = this.field1266[var15][var16] + 1;
            if (var15 > 0 && this.field1214[var15 - 1][var16] == 0 && (var21[var15 - 1][var16] & 2621704) == 0) {
                this.field1078[var35] = var15 - 1;
                this.field1079[var35] = var16;
                var35 = (var35 + 1) % var20;
                this.field1214[var15 - 1][var16] = 2;
                this.field1266[var15 - 1][var16] = var33;
            }
            if (var15 < var12 - 1 && this.field1214[var15 + 1][var16] == 0 && (var21[var15 + 1][var16] & 2621824) == 0) {
                this.field1078[var35] = var15 + 1;
                this.field1079[var35] = var16;
                var35 = (var35 + 1) % var20;
                this.field1214[var15 + 1][var16] = 8;
                this.field1266[var15 + 1][var16] = var33;
            }
            if (var16 > 0 && this.field1214[var15][var16 - 1] == 0 && (var21[var15][var16 - 1] & 2621698) == 0) {
                this.field1078[var35] = var15;
                this.field1079[var35] = var16 - 1;
                var35 = (var35 + 1) % var20;
                this.field1214[var15][var16 - 1] = 1;
                this.field1266[var15][var16 - 1] = var33;
            }
            if (var16 < var13 - 1 && this.field1214[var15][var16 + 1] == 0 && (var21[var15][var16 + 1] & 2621728) == 0) {
                this.field1078[var35] = var15;
                this.field1079[var35] = var16 + 1;
                var35 = (var35 + 1) % var20;
                this.field1214[var15][var16 + 1] = 4;
                this.field1266[var15][var16 + 1] = var33;
            }
            if (var15 > 0 && var16 > 0 && this.field1214[var15 - 1][var16 - 1] == 0 && (var21[var15 - 1][var16 - 1] & 2621710) == 0 && (var21[var15 - 1][var16] & 2621704) == 0 && (var21[var15][var16 - 1] & 2621698) == 0) {
                this.field1078[var35] = var15 - 1;
                this.field1079[var35] = var16 - 1;
                var35 = (var35 + 1) % var20;
                this.field1214[var15 - 1][var16 - 1] = 3;
                this.field1266[var15 - 1][var16 - 1] = var33;
            }
            if (var15 < var12 - 1 && var16 > 0 && this.field1214[var15 + 1][var16 - 1] == 0 && (var21[var15 + 1][var16 - 1] & 2621827) == 0 && (var21[var15 + 1][var16] & 2621824) == 0 && (var21[var15][var16 - 1] & 2621698) == 0) {
                this.field1078[var35] = var15 + 1;
                this.field1079[var35] = var16 - 1;
                var35 = (var35 + 1) % var20;
                this.field1214[var15 + 1][var16 - 1] = 9;
                this.field1266[var15 + 1][var16 - 1] = var33;
            }
            if (var15 > 0 && var16 < var13 - 1 && this.field1214[var15 - 1][var16 + 1] == 0 && (var21[var15 - 1][var16 + 1] & 2621752) == 0 && (var21[var15 - 1][var16] & 2621704) == 0 && (var21[var15][var16 + 1] & 2621728) == 0) {
                this.field1078[var35] = var15 - 1;
                this.field1079[var35] = var16 + 1;
                var35 = (var35 + 1) % var20;
                this.field1214[var15 - 1][var16 + 1] = 6;
                this.field1266[var15 - 1][var16 + 1] = var33;
            }
            if (var15 < var12 - 1 && var16 < var13 - 1 && this.field1214[var15 + 1][var16 + 1] == 0 && (var21[var15 + 1][var16 + 1] & 2621920) == 0 && (var21[var15 + 1][var16] & 2621824) == 0 && (var21[var15][var16 + 1] & 2621728) == 0) {
                this.field1078[var35] = var15 + 1;
                this.field1079[var35] = var16 + 1;
                var35 = (var35 + 1) % var20;
                this.field1214[var15 + 1][var16 + 1] = 12;
                this.field1266[var15 + 1][var16 + 1] = var33;
            }
        }
        if (!var19) {
            if (arg3) {
                int var22 = 100;
                for (int var23 = 1; var23 < 2; ++var23) {
                    for (int var24 = arg10 - var23; var24 <= arg10 + var23; ++var24) {
                        for (int var25 = arg0 - var23; var25 <= arg0 + var23; ++var25) {
                            if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && this.field1266[var24][var25] < var22) {
                                var22 = this.field1266[var24][var25];
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
        this.field1078[var26] = var15;
        int var36 = var26 + 1;
        this.field1079[var26] = var16;
        int var27;
        int var28 = var27 = this.field1214[var15][var16];
        while (arg9 != var15 || arg8 != var16) {
            if (var27 != var28) {
                var27 = var28;
                this.field1078[var36] = var15;
                this.field1079[var36++] = var16;
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
            var28 = this.field1214[var15][var16];
        }
        if (var36 > 0) {
            int var29 = var36;
            if (var36 > 25) {
                var29 = 25;
            }
            --var36;
            int var30 = this.field1078[var36];
            int var31 = this.field1079[var36];
            if (super.field25[5] == 1) {
                this.field1314.method192(160, 230);
            } else {
                this.field1314.method192(160, 204);
            }
            this.field1314.method193(var29 + var29 + 2);
            this.field1314.method194(this.field1210 + var30);
            this.field1314.method194(this.field1211 + var31);
            for (int var32 = 1; var32 < var29; ++var32) {
                --var36;
                this.field1314.method193(this.field1078[var36] - var30);
                this.field1314.method193(this.field1079[var36] - var31);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method399(boolean arg0) {
        this.method375(true);
        this.field1246.method227(-510);
        this.field1315.method180(0, this.field1216, 0);
        short var2 = 360;
        short var3 = 200;
        if (this.field1270 == 0) {
            int var4 = var3 / 2 - 80;
            this.field1029.method183(var4, var2 / 2, 16776960, "Welcome to the RuneScape-2 BETA test.", 26631, true);
            int var11 = var4 + 15;
            int var12 = var11 + 15;
            this.field1027.method183(var12, var2 / 2, 16777215, "Please note this test version of the game is provided for ", 26631, true);
            int var13 = var12 + 15;
            this.field1027.method183(var13, var2 / 2, 16777215, "testing/preview purposes only. As such please bear in mind that:", 26631, true);
            int var14 = var13 + 15;
            int var15 = var14 + 10;
            this.field1027.method183(var15, var2 / 2, 16777215, "a) Everything you do/gain here will be forgotten when the beta ends.", 26631, true);
            int var16 = var15 + 15;
            this.field1027.method183(var16, var2 / 2, 16777215, "b) No customer support is available for the beta.", 26631, true);
            int var17 = var16 + 15;
            this.field1027.method183(var17, var2 / 2, 16777215, "c) The beta may be incomplete/buggy, we're still working on it.", 26631, true);
            int var18 = var17 + 15;
            this.field1027.method183(var18, var2 / 2, 16777215, "d) The beta may be totally unavailable at times.", 26631, true);
            int var19 = var18 + 15;
            int var5 = var2 / 2;
            int var6 = var3 / 2 + 65;
            this.field1316.method180(var6 - 20, this.field1216, var5 - 73);
            this.field1029.method183(var6 + 5, var2 / 2, 16777215, "Click here to login.", 26631, true);
        }
        if (this.field1270 == 1 || this.field1270 == 2) {
            int var7 = var3 / 2 - 50;
            if (this.field1328.length() > 0) {
                this.field1029.method183(var7 - 15, var2 / 2, 16776960, this.field1328, 26631, true);
                this.field1029.method183(var7, var2 / 2, 16776960, this.field1329, 26631, true);
                var7 += 30;
            } else {
                this.field1029.method183(var7 - 7, var2 / 2, 16776960, this.field1329, 26631, true);
                var7 += 30;
            }
            this.field1029.method187(-886, true, var2 / 2 - 90, 16777215, var7, "Username: " + this.field1098 + (this.field1226 == 0 & field1114 % 40 < 20 ? "@yel@|" : ""));
            var7 += 15;
            this.field1029.method187(-886, true, var2 / 2 - 88, 16777215, var7, "Password: " + JString.method248((byte) 1, this.field1099) + (this.field1226 == 1 & field1114 % 40 < 20 ? "@yel@|" : ""));
            var7 += 15;
            if (this.field1270 == 1) {
                this.field1029.method187(-886, true, var2 / 2 - 143, 16777215, var7, "Confirm Password: " + JString.method248((byte) 1, this.field1100) + (this.field1226 == 2 & field1114 % 40 < 20 ? "@yel@|" : ""));
            }
            int var8 = var2 / 2 - 80;
            int var9 = var3 / 2 + 40;
            this.field1316.method180(var9 - 20, this.field1216, var8 - 73);
            if (this.field1270 == 1) {
                this.field1029.method183(var9 + 5, var8, 16777215, "Create", 26631, true);
            } else {
                this.field1029.method183(var9 + 5, var8, 16777215, "Login", 26631, true);
            }
            int var10 = var2 / 2 + 80;
            this.field1316.method180(var9 - 20, this.field1216, var10 - 73);
            this.field1029.method183(var9 + 5, var10, 16777215, "Cancel", 26631, true);
        }
        this.field1246.method228(214, super.field13, 186, this.field1285);
        if (!arg0) {
            if (this.field1036) {
                this.field1036 = false;
                this.field1244.method228(128, super.field13, 0, this.field1285);
                this.field1245.method228(214, super.field13, 386, this.field1285);
                this.field1249.method228(0, super.field13, 265, this.field1285);
                this.field1250.method228(574, super.field13, 265, this.field1285);
                this.field1251.method228(128, super.field13, 186, this.field1285);
                this.field1252.method228(574, super.field13, 186, this.field1285);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
    public final void method400(String arg0, int arg1, int arg2, String arg3) {
        if (this.field1057 == -1) {
            this.field1008 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1017[var5] = this.field1017[var5 - 1];
            this.field1225[var5] = this.field1225[var5 - 1];
            this.field1169[var5] = this.field1169[var5 - 1];
        }
        this.field1017[0] = arg1;
        this.field1225[0] = arg3;
        this.field1169[0] = arg0;
        if (arg2 < 2 || arg2 > 2) {
            field1031 = this.field1001.method238();
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method401(int arg0) {
        int var2 = this.field1023;
        int var3 = this.field1024;
        int var4 = this.field1025;
        int var5 = this.field1026;
        int var6 = 6116423;
        Pix2D.method145(var6, this.field1162, var5, var3, var4, var2);
        Pix2D.method145(0, this.field1162, 16, var3 + 1, var4 - 2, var2 + 1);
        Pix2D.method146(0, var3 + 18, 0, var4 - 2, var5 - 19, var2 + 1);
        this.field1029.method185("Choose Option", var2 + 3, var6, true, var3 + 14);
        int var7 = super.field20;
        int var8 = super.field21;
        if (this.field1022 == 0) {
            var7 -= 8;
            var8 -= 11;
        }
        if (this.field1022 == 1) {
            var7 -= 562;
            var8 -= 231;
        }
        for (int var9 = 0; var9 < this.field1065; ++var9) {
            int var10 = (this.field1065 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field1029.method187(-886, true, var2 + 3, var11, var10, this.field1075[var9]);
        }
        if (arg0 == 9) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method402(int arg0) {
        try {
            this.field1233 = -1;
            this.field1007.method224();
            this.field1298.method224();
            this.field1012.method224();
            this.field1218.method224();
            Pix3D.method152(43753);
            this.method382(this.field1307);
            this.field1096.method50(true);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field1092[var2].method272((byte) 5);
            }
            System.gc();
            World var3 = new World(this.field1009, 104, 104, this.field1080, 362);
            byte[] var4 = new byte[100000];
            int var5 = this.field1318.length;
            World.field35 = World3D.field214;
            for (int var6 = 0; var6 < var5; ++var6) {
                int var7 = this.field1209[var6] >> 8;
                int var8 = this.field1209[var6] & 255;
                if (var7 == 33 && var8 >= 71 && var8 <= 73) {
                    World.field35 = false;
                }
            }
            if (field1018) {
                this.field1096.method51(this.field1077, 0);
            } else {
                this.field1096.method51(0, 0);
            }
            for (int var9 = 0; var9 < var5; ++var9) {
                int var10 = (this.field1209[var9] >> 8) * 64 - this.field1210;
                int var11 = (this.field1209[var9] & 255) * 64 - this.field1211;
                byte[] var12 = this.field1318[var9];
                if (var12 != null) {
                    int var13 = (new Packet(var12, 4)).method206();
                    BZip2.method230(var4, var13, var12, var12.length - 4, 4);
                    var3.method15(var11, -519, (this.field1054 - 6) * 8, (this.field1055 - 6) * 8, var4, var10);
                } else if (this.field1055 < 800) {
                    var3.method14(695, var11, 64, var10, 64);
                }
            }
            for (int var14 = 0; var14 < var5; ++var14) {
                byte[] var15 = this.field1235[var14];
                if (var15 != null) {
                    int var16 = (new Packet(var15, 4)).method206();
                    BZip2.method230(var4, var16, var15, var15.length - 4, 4);
                    int var17 = (this.field1209[var14] >> 8) * 64 - this.field1210;
                    int var18 = (this.field1209[var14] & 255) * 64 - this.field1211;
                    var3.method16(var4, (byte) 4, this.field1096, this.field1092, var18, var17, this.field1298);
                }
            }
            var3.method18(this.field1096, false, this.field1092);
            this.field999.method227(-510);
            for (LocEntity var19 = (LocEntity) this.field1298.method220(); var19 != null; var19 = (LocEntity) this.field1298.method222(35239)) {
                if ((this.field1009[1][var19.field639][var19.field640] & 2) == 2) {
                    --var19.field637;
                    if (var19.field637 < 0) {
                        var19.method104();
                    }
                }
            }
            for (int var20 = 0; var20 < 104; ++var20) {
                for (int var21 = 0; var21 < 104; ++var21) {
                    this.method342(var20, var21);
                }
            }
            for (LocMerged var22 = (LocMerged) this.field1101.method220(); var22 != null; var22 = (LocMerged) this.field1101.method222(35239)) {
                this.method435(true, var22.field618, var22.field624, var22.field621, var22.field620, var22.field619, var22.field622, var22.field623);
            }
        } catch (Exception var24) {
        }
        LocType.field771.method101();
        System.gc();
        if (arg0 == 0) {
            Pix3D.method153((byte) 3, 20);
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method403(boolean arg0) {
        for (int var2 = 0; var2 < this.field1320; ++var2) {
            NpcEntity var3 = this.field1319[this.field1321[var2]];
            int var4 = (this.field1321[var2] << 14) + 536870912;
            if (var3 != null && var3.method108(0)) {
                int var5 = var3.field292 >> 7;
                int var6 = var3.field293 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field296 == 1 && (var3.field292 & 127) == 64 && (var3.field293 & 127) == 64) {
                        if (this.field1234[var5][var6] == this.field1133) {
                            continue;
                        }
                        this.field1234[var5][var6] = this.field1133;
                    }
                    this.field1096.method61((Model) null, this.method341(var3.field292, var3.field293, this.field1077, (byte) 9), 5, var3.field293, var3.field294, var3.field292, this.field1077, var3.field295, var3, (var3.field296 - 1) * 64 + 60, var4);
                }
            }
        }
        if (!arg0) {
            this.field1166 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIBIII)V")
    public final void method404(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg1 & 2047;
        int var9 = 2048 - arg6 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg4;
        if (arg3 == 9) {
            if (var8 != 0) {
                int var13 = Model.field514[var8];
                int var14 = Model.field515[var8];
                int var15 = var11 * var14 - arg4 * var13 >> 16;
                var12 = var11 * var13 + arg4 * var14 >> 16;
                var11 = var15;
            }
            if (var9 != 0) {
                int var16 = Model.field514[var9];
                int var17 = Model.field515[var9];
                int var18 = var10 * var17 + var12 * var16 >> 16;
                var12 = var12 * var17 - var10 * var16 >> 16;
                var10 = var18;
            }
            this.field1273 = arg5 - var10;
            this.field1274 = arg0 - var11;
            this.field1275 = arg2 - var12;
            this.field1276 = arg1;
            this.field1277 = arg6;
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method405(int arg0) {
        if (this.field1129 == 0) {
            this.field1075[0] = "Cancel";
            this.field1203[0] = 1005;
            this.field1065 = 1;
            if (super.field20 > 8 && super.field21 > 11 && super.field20 < 520 && super.field21 < 345) {
                if (this.field1317 != -1) {
                    this.method383(4, 0, 8, super.field20, Component.field870[this.field1317], super.field21, 11);
                } else {
                    this.method345(0);
                }
            }
            if (this.field1178 != this.field1161) {
                this.field1161 = this.field1178;
            }
            this.field1178 = 0;
            if (super.field20 > 562 && super.field21 > 231 && super.field20 < 752 && super.field21 < 492) {
                if (this.field1336 != -1) {
                    this.method383(4, 0, 562, super.field20, Component.field870[this.field1336], super.field21, 231);
                } else if (this.field1052[this.field1262] != -1) {
                    this.method383(4, 0, 562, super.field20, Component.field870[this.field1052[this.field1262]], super.field21, 231);
                }
            }
            if (this.field1286 != this.field1178) {
                this.field1102 = true;
                this.field1286 = this.field1178;
            }
            this.field1178 = 0;
            if (super.field20 > 22 && super.field21 > 375 && super.field20 < 501 && super.field21 < 471 && this.field1057 != -1) {
                this.method383(4, 0, 22, super.field20, Component.field870[this.field1057], super.field21, 375);
            }
            if (this.field1057 != -1 && this.field1178 != this.field1137) {
                this.field1008 = true;
                this.field1137 = this.field1178;
            }
            boolean var2 = false;
            if (arg0 != 0) {
                this.field1166 = this.field1256.method201();
            }
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field1065 - 1; ++var3) {
                    if (this.field1203[var3] < 1000 && this.field1203[var3 + 1] > 1000) {
                        String var4 = this.field1075[var3];
                        this.field1075[var3] = this.field1075[var3 + 1];
                        this.field1075[var3 + 1] = var4;
                        int var5 = this.field1203[var3];
                        this.field1203[var3] = this.field1203[var3 + 1];
                        this.field1203[var3 + 1] = var5;
                        int var6 = this.field1201[var3];
                        this.field1201[var3] = this.field1201[var3 + 1];
                        this.field1201[var3 + 1] = var6;
                        int var7 = this.field1202[var3];
                        this.field1202[var3] = this.field1202[var3 + 1];
                        this.field1202[var3 + 1] = var7;
                        int var8 = this.field1204[var3];
                        this.field1204[var3] = this.field1204[var3 + 1];
                        this.field1204[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method406(boolean arg0) {
        if (!arg0) {
            for (int var2 = 0; var2 < this.field1320; ++var2) {
                int var3 = this.field1321[var2];
                NpcEntity var4 = this.field1319[var3];
                if (var4 != null) {
                    this.method407(true, var4.field346.field781, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILx;)V")
    public final void method407(boolean arg0, int arg1, PathingEntity arg2) {
        if (arg2.field292 < 128 || arg2.field293 < 128 || arg2.field292 >= 13184 || arg2.field293 >= 13184) {
            arg2.field319 = -1;
            arg2.field324 = -1;
            arg2.field333 = 0;
            arg2.field334 = 0;
            arg2.field292 = arg2.field340[0] * 128 + arg2.field296 * 64;
            arg2.field293 = arg2.field341[0] * 128 + arg2.field296 * 64;
            arg2.field339 = 0;
        }
        if (this.field1053 == arg2 && (arg2.field292 < 1536 || arg2.field293 < 1536 || arg2.field292 >= 11776 || arg2.field293 >= 11776)) {
            arg2.field319 = -1;
            arg2.field324 = -1;
            arg2.field333 = 0;
            arg2.field334 = 0;
            arg2.field292 = arg2.field340[0] * 128 + arg2.field296 * 64;
            arg2.field293 = arg2.field341[0] * 128 + arg2.field296 * 64;
            arg2.field339 = 0;
        }
        if (arg2.field333 > field1114) {
            this.method408(false, arg2);
        } else if (arg2.field334 >= field1114) {
            this.method409(arg2, false);
        } else {
            this.method410(0, arg2);
        }
        this.method411(arg2, 1);
        this.method412(true, arg2);
        if (!arg0) {
            this.field1314.method193(119);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLx;)V")
    public final void method408(boolean arg0, PathingEntity arg1) {
        int var3 = arg1.field333 - field1114;
        int var4 = arg1.field329 * 128 + arg1.field296 * 64;
        int var5 = arg1.field331 * 128 + arg1.field296 * 64;
        if (!arg0) {
            arg1.field292 += (var4 - arg1.field292) / var3;
            arg1.field293 += (var5 - arg1.field293) / var3;
            arg1.field343 = 0;
            if (arg1.field335 == 0) {
                arg1.field338 = 1024;
            }
            if (arg1.field335 == 1) {
                arg1.field338 = 1536;
            }
            if (arg1.field335 == 2) {
                arg1.field338 = 0;
            }
            if (arg1.field335 == 3) {
                arg1.field338 = 512;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lx;Z)V")
    public final void method409(PathingEntity arg0, boolean arg1) {
        if (field1114 == arg0.field334 || arg0.field319 == -1 || arg0.field322 != 0 || arg0.field321 + 1 > SeqType.field938[arg0.field319].field942[arg0.field320]) {
            int var3 = arg0.field334 - arg0.field333;
            int var4 = field1114 - arg0.field333;
            int var5 = arg0.field329 * 128 + arg0.field296 * 64;
            int var6 = arg0.field331 * 128 + arg0.field296 * 64;
            int var7 = arg0.field330 * 128 + arg0.field296 * 64;
            int var8 = arg0.field332 * 128 + arg0.field296 * 64;
            arg0.field292 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field293 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field343 = 0;
        if (arg0.field335 == 0) {
            arg0.field338 = 1024;
        }
        if (arg0.field335 == 1) {
            arg0.field338 = 1536;
        }
        if (arg0.field335 == 2) {
            arg0.field338 = 0;
        }
        if (arg0.field335 == 3) {
            arg0.field338 = 512;
        }
        arg0.field294 = arg0.field338;
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILx;)V")
    public final void method410(int arg0, PathingEntity arg1) {
        arg1.field316 = arg1.field297;
        if (arg1.field339 == 0) {
            arg1.field343 = 0;
        } else {
            if (arg1.field319 != -1 && arg1.field322 == 0) {
                SeqType var3 = SeqType.field938[arg1.field319];
                if (var3.field944 == null) {
                    ++arg1.field343;
                    return;
                }
            }
            int var4 = arg1.field292;
            int var5 = arg1.field293;
            int var6 = arg1.field340[arg1.field339 - 1] * 128 + arg1.field296 * 64;
            int var7 = arg1.field341[arg1.field339 - 1] * 128 + arg1.field296 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field338 = 1280;
                    } else if (var5 > var7) {
                        arg1.field338 = 1792;
                    } else {
                        arg1.field338 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field338 = 768;
                    } else if (var5 > var7) {
                        arg1.field338 = 256;
                    } else {
                        arg1.field338 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field338 = 1024;
                } else {
                    arg1.field338 = 0;
                }
                int var8 = arg1.field338 - arg1.field294 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field300;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field299;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field302;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field301;
                }
                if (var9 == -1) {
                    var9 = arg1.field299;
                }
                arg1.field316 = var9;
                this.field1165 += arg0;
                int var10 = 4;
                if (arg1.field338 != arg1.field294 && arg1.field313 == -1) {
                    var10 = 2;
                }
                if (arg1.field339 > 2) {
                    var10 = 6;
                }
                if (arg1.field339 > 3) {
                    var10 = 8;
                }
                if (arg1.field343 > 0 && arg1.field339 > 1) {
                    var10 = 8;
                    --arg1.field343;
                }
                if (arg1.field342[arg1.field339 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field316 == arg1.field299 && arg1.field303 != -1) {
                    arg1.field316 = arg1.field303;
                }
                if (var4 < var6) {
                    arg1.field292 += var10;
                    if (arg1.field292 > var6) {
                        arg1.field292 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field292 -= var10;
                    if (arg1.field292 < var6) {
                        arg1.field292 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field293 += var10;
                    if (arg1.field293 > var7) {
                        arg1.field293 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field293 -= var10;
                    if (arg1.field293 < var7) {
                        arg1.field293 = var7;
                    }
                }
                if (arg1.field292 == var6 && arg1.field293 == var7) {
                    --arg1.field339;
                }
            } else {
                arg1.field292 = var6;
                arg1.field293 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Lx;I)V")
    public final void method411(PathingEntity arg0, int arg1) {
        if (arg1 >= 1 && arg1 <= 1) {
            if (arg0.field313 != -1 && arg0.field313 < 32768) {
                NpcEntity var3 = this.field1319[arg0.field313];
                if (var3 != null) {
                    int var4 = arg0.field292 - var3.field292;
                    int var5 = arg0.field293 - var3.field293;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field338 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field313 >= 32768) {
                int var6 = arg0.field313 - 32768;
                if (this.field1041 == var6) {
                    var6 = this.field1105;
                }
                PlayerEntity var7 = this.field1106[var6];
                if (var7 != null) {
                    int var8 = arg0.field292 - var7.field292;
                    int var9 = arg0.field293 - var7.field293;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field338 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field314 != 0 || arg0.field315 != 0) && (arg0.field339 == 0 || arg0.field343 > 0)) {
                int var10 = arg0.field292 - (arg0.field314 - this.field1210 - this.field1210) * 64;
                int var11 = arg0.field293 - (arg0.field315 - this.field1211 - this.field1211) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field338 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field314 = 0;
                arg0.field315 = 0;
            }
            int var12 = arg0.field338 - arg0.field294 & 2047;
            if (var12 != 0) {
                if (var12 >= 32 && var12 <= 2016) {
                    if (var12 > 1024) {
                        arg0.field294 -= 32;
                    } else {
                        arg0.field294 += 32;
                    }
                } else {
                    arg0.field294 = arg0.field338;
                }
                arg0.field294 &= 2047;
                if (arg0.field316 == arg0.field297 && arg0.field338 != arg0.field294) {
                    if (arg0.field298 != -1) {
                        arg0.field316 = arg0.field298;
                        return;
                    }
                    arg0.field316 = arg0.field299;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZLx;)V")
    public final void method412(boolean arg0, PathingEntity arg1) {
        this.field1089 &= arg0;
        arg1.field295 = 0;
        if (arg1.field316 != -1) {
            SeqType var3 = SeqType.field938[arg1.field316];
            ++arg1.field318;
            if (arg1.field317 < var3.field939 && arg1.field318 > var3.field942[arg1.field317]) {
                arg1.field318 = 0;
                ++arg1.field317;
            }
            if (arg1.field317 >= var3.field939) {
                arg1.field318 = 0;
                arg1.field317 = 0;
            }
        }
        if (arg1.field319 != -1 && arg1.field322 == 0) {
            SeqType var4 = SeqType.field938[arg1.field319];
            ++arg1.field321;
            while (arg1.field320 < var4.field939 && arg1.field321 > var4.field942[arg1.field320]) {
                arg1.field321 -= var4.field942[arg1.field320];
                ++arg1.field320;
            }
            if (arg1.field320 >= var4.field939) {
                arg1.field320 -= var4.field943;
                ++arg1.field323;
                if (arg1.field323 >= var4.field949) {
                    arg1.field319 = -1;
                }
                if (arg1.field320 < 0 || arg1.field320 >= var4.field939) {
                    arg1.field319 = -1;
                }
            }
            arg1.field295 = var4.field945;
        }
        if (arg1.field322 > 0) {
            --arg1.field322;
        }
        if (arg1.field324 != -1 && field1114 >= arg1.field327) {
            if (arg1.field325 < 0) {
                arg1.field325 = 0;
            }
            SeqType var5 = SpotAnimType.field952[arg1.field324].field955;
            ++arg1.field326;
            while (arg1.field325 < var5.field939 && arg1.field326 > var5.field942[arg1.field325]) {
                arg1.field326 -= var5.field942[arg1.field325];
                ++arg1.field325;
            }
            if (arg1.field325 >= var5.field939) {
                arg1.field324 = -1;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method413(int arg0) {
        if (arg0 != 3073) {
            this.method6();
        }
        if (this.field1036) {
            this.field1036 = false;
            this.field1337.method228(0, super.field13, 11, this.field1285);
            this.field1338.method228(0, super.field13, 375, this.field1285);
            this.field1339.method228(729, super.field13, 5, this.field1285);
            this.field1340.method228(752, super.field13, 231, this.field1285);
            this.field1341.method228(0, super.field13, 0, this.field1285);
            this.field1342.method228(561, super.field13, 0, this.field1285);
            this.field1343.method228(520, super.field13, 11, this.field1285);
            this.field1344.method228(520, super.field13, 231, this.field1285);
            this.field1345.method228(501, super.field13, 375, this.field1285);
            this.field1346.method228(0, super.field13, 345, this.field1285);
            this.field1102 = true;
            this.field1008 = true;
            this.field1347 = true;
            this.field1010 = true;
            if (this.field1324 != 2) {
                this.field999.method228(8, super.field13, 11, this.field1285);
                this.field998.method228(561, super.field13, 5, this.field1285);
            }
        }
        if (this.field1324 == 2) {
            this.method370((byte) -95);
        }
        if (this.field1193 && this.field1022 == 1) {
            this.field1102 = true;
        }
        if (this.field1336 != -1) {
            boolean var2 = this.method372(this.field1336, true, this.field1097);
            if (var2) {
                this.field1102 = true;
            }
        }
        if (this.field1160 == 2) {
            this.field1102 = true;
        }
        if (this.field1129 == 2) {
            this.field1102 = true;
        }
        if (this.field1102) {
            this.method429((byte) 7);
            this.field1102 = false;
        }
        if (this.field1057 == -1) {
            this.field1240.field889 = this.field1032 - this.field1091 - 77;
            if (super.field20 > 453 && super.field20 < 565 && super.field21 > 350) {
                this.method424(false, this.field1032, super.field20 - 22, this.field1240, 463, this.field1011, 77, super.field21 - 375, 0);
            }
            int var3 = this.field1032 - 77 - this.field1240.field889;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1032 - 77) {
                var3 = this.field1032 - 77;
            }
            if (this.field1091 != var3) {
                this.field1091 = var3;
                this.field1008 = true;
            }
        }
        if (this.field1057 != -1) {
            boolean var4 = this.method372(this.field1057, true, this.field1097);
            if (var4) {
                this.field1008 = true;
            }
        }
        if (this.field1160 == 3) {
            this.field1008 = true;
        }
        if (this.field1129 == 3) {
            this.field1008 = true;
        }
        if (this.field1008) {
            this.method443((byte) 7);
            this.field1008 = false;
        }
        if (this.field1324 == 2) {
            if (field1018 && this.field1280 == 0 && field1114 - this.field992 > 25) {
                this.field992 = field1114;
                this.field991 = 1 - this.field991;
                if (this.field991 == 0) {
                    this.method426(true);
                } else {
                    this.field998.method228(561, super.field13, 5, this.field1285);
                }
            }
            if (!field1018) {
                this.method426(true);
                this.field998.method228(561, super.field13, 5, this.field1285);
            }
        }
        if (this.field1347) {
            this.field1347 = false;
            this.field1296.method227(-510);
            this.field1301.method180(0, this.field1216, 0);
            if (this.field1336 == -1) {
                if (this.field1262 == 0) {
                    this.field1002.method180(30, this.field1216, 29);
                }
                if (this.field1262 == 1) {
                    this.field1003.method180(29, this.field1216, 59);
                }
                if (this.field1262 == 2) {
                    this.field1003.method180(29, this.field1216, 87);
                }
                if (this.field1262 == 3) {
                    this.field1004.method180(29, this.field1216, 115);
                }
                if (this.field1262 == 4) {
                    this.field1006.method180(29, this.field1216, 156);
                }
                if (this.field1262 == 5) {
                    this.field1006.method180(29, this.field1216, 184);
                }
                if (this.field1262 == 6) {
                    this.field1005.method180(30, this.field1216, 212);
                }
                this.field1227.method180(33, this.field1216, 39);
            }
            this.field1296.method228(520, super.field13, 165, this.field1285);
            this.field1295.method227(-510);
            this.field1300.method180(0, this.field1216, 0);
            if (this.field1336 == -1) {
                if (this.field1262 == 7) {
                    this.field1082.method180(0, this.field1216, 49);
                }
                if (this.field1262 == 8) {
                    this.field1083.method180(0, this.field1216, 81);
                }
                if (this.field1262 == 9) {
                    this.field1083.method180(0, this.field1216, 108);
                }
                if (this.field1262 == 10) {
                    this.field1084.method180(1, this.field1216, 136);
                }
                if (this.field1262 == 11) {
                    this.field1086.method180(0, this.field1216, 178);
                }
                if (this.field1262 == 12) {
                    this.field1086.method180(0, this.field1216, 205);
                }
                if (this.field1262 == 13) {
                    this.field1085.method180(0, this.field1216, 233);
                }
                this.field1228.method180(4, this.field1216, 83);
            }
            this.field1295.method228(501, super.field13, 492, this.field1285);
            this.field999.method227(-510);
        }
        if (this.field1010) {
            this.field1010 = false;
            this.field1294.method227(-510);
            this.field1299.method180(0, this.field1216, 0);
            this.field1028.method183(33, 57, 16777215, "Public chat", 26631, true);
            if (this.field1331 == 0) {
                this.field1028.method183(46, 57, 65280, "On", 26631, true);
            }
            if (this.field1331 == 1) {
                this.field1028.method183(46, 57, 16776960, "Friends", 26631, true);
            }
            if (this.field1331 == 2) {
                this.field1028.method183(46, 57, 16711680, "Off", 26631, true);
            }
            this.field1028.method183(33, 186, 16777215, "Private chat", 26631, true);
            if (this.field1117 == 0) {
                this.field1028.method183(46, 186, 65280, "On", 26631, true);
            }
            if (this.field1117 == 1) {
                this.field1028.method183(46, 186, 16776960, "Friends", 26631, true);
            }
            if (this.field1117 == 2) {
                this.field1028.method183(46, 186, 16711680, "Off", 26631, true);
            }
            this.field1028.method183(33, 326, 16777215, "Trade/duel", 26631, true);
            if (this.field1176 == 0) {
                this.field1028.method183(46, 326, 65280, "On", 26631, true);
            }
            if (this.field1176 == 1) {
                this.field1028.method183(46, 326, 16776960, "Friends", 26631, true);
            }
            if (this.field1176 == 2) {
                this.field1028.method183(46, 326, 16711680, "Off", 26631, true);
            }
            this.field1294.method228(0, super.field13, 471, this.field1285);
            this.field999.method227(-510);
        }
        this.field1097 = 0;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)Ljava/lang/String;")
    public final String method414(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
        } else {
            this.field1314.method193(144);
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field16 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILkb;I)V")
    private final void method415(int arg0, Packet arg1, int arg2) {
        if (arg0 < 2 || arg0 > 2) {
            this.field1166 = -1;
        }
        while (arg1.field607 + 21 < arg2 * 8) {
            int var4 = arg1.method212(13, (byte) -46);
            if (var4 == 8191) {
                break;
            }
            if (this.field1319[var4] == null) {
                this.field1319[var4] = new NpcEntity();
            }
            NpcEntity var5 = this.field1319[var4];
            this.field1321[this.field1320++] = var4;
            var5.field336 = field1114;
            var5.field346 = NpcType.method259(arg1.method212(11, (byte) -46));
            var5.field296 = var5.field346.field781;
            var5.field299 = var5.field346.field785;
            var5.field300 = var5.field346.field786;
            var5.field301 = var5.field346.field787;
            var5.field302 = var5.field346.field788;
            var5.field297 = var5.field346.field784;
            int var6 = arg1.method212(5, (byte) -46);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg1.method212(5, (byte) -46);
            if (var7 > 15) {
                var7 -= 32;
            }
            var5.method106((byte) 28, this.field1053.field340[0] + var6, this.field1053.field341[0] + var7);
            int var8 = arg1.method212(1, (byte) -46);
            if (var8 == 1) {
                this.field1110[this.field1109++] = var4;
            }
        }
        arg1.method213(this.field1051);
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            signlink.startpriv(InetAddress.getLocalHost());
            client var1 = new client();
            if (arg0.length > 0) {
                var1.field1074 = Integer.parseInt(arg0[0]);
            }
            if (arg0.length > 1) {
                var1.field1272 = Integer.parseInt(arg0[1]);
            }
            if (arg0.length > 2 && arg0[2].equalsIgnoreCase("lowmem")) {
                method419(26953);
            } else {
                method438(-229);
            }
            var1.method1(0, 789, 532);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILyb;I)V")
    public final void method416(int arg0, int arg1, int arg2, NpcType arg3, int arg4) {
        if (this.field1065 < 400) {
            String var6 = arg3.field779;
            while (arg4 >= 0) {
                this.field1020 = null;
            }
            if (arg3.field797 != 0) {
                var6 = var6 + method387(arg3.field797, (byte) -102, this.field1053.field355) + " (level-" + arg3.field797 + ")";
            }
            if (this.field1067 == 1) {
                this.field1075[this.field1065] = "Use " + this.field1071 + " with @yel@" + var6;
                this.field1203[this.field1065] = 985;
                this.field1204[this.field1065] = arg1;
                this.field1201[this.field1065] = arg2;
                this.field1202[this.field1065] = arg0;
                ++this.field1065;
            } else {
                if (this.field1061 == 1) {
                    if ((this.field1063 & 2) == 2) {
                        this.field1075[this.field1065] = this.field1064 + " @yel@" + var6;
                        this.field1203[this.field1065] = 946;
                        this.field1204[this.field1065] = arg1;
                        this.field1201[this.field1065] = arg2;
                        this.field1202[this.field1065] = arg0;
                        ++this.field1065;
                        return;
                    }
                } else {
                    if (arg3.field792 != null) {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (arg3.field792[var7] != null) {
                                this.field1075[this.field1065] = arg3.field792[var7] + " @yel@" + var6;
                                if (var7 == 0) {
                                    this.field1203[this.field1065] = 490;
                                }
                                if (var7 == 1) {
                                    this.field1203[this.field1065] = 914;
                                }
                                if (var7 == 2) {
                                    this.field1203[this.field1065] = 75;
                                }
                                if (var7 == 3) {
                                    this.field1203[this.field1065] = 486;
                                }
                                if (var7 == 4) {
                                    this.field1203[this.field1065] = 772;
                                }
                                this.field1204[this.field1065] = arg1;
                                this.field1201[this.field1065] = arg2;
                                this.field1202[this.field1065] = arg0;
                                ++this.field1065;
                            }
                        }
                    }
                    this.field1075[this.field1065] = "Examine @yel@" + var6;
                    this.field1203[this.field1065] = 1318;
                    this.field1204[this.field1065] = arg1;
                    this.field1201[this.field1065] = arg2;
                    this.field1202[this.field1065] = arg0;
                    ++this.field1065;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method417(int arg0) {
        while (arg0 >= 0) {
            this.field1194 = this.field1001.method238();
        }
        for (ProjectileEntity var2 = (ProjectileEntity) this.field1218.method220(); var2 != null; var2 = (ProjectileEntity) this.field1218.method222(35239)) {
            if (this.field1077 == var2.field374 && field1114 <= var2.field380) {
                if (field1114 >= var2.field379) {
                    if (var2.field383 > 0) {
                        NpcEntity var3 = this.field1319[var2.field383 - 1];
                        if (var3 != null) {
                            var2.method113(this.method341(var3.field292, var3.field293, var2.field374, (byte) 9) - var2.field378, var3.field293, field1114, var3.field292, this.field1263);
                        }
                    }
                    if (var2.field383 < 0) {
                        int var4 = -var2.field383 - 1;
                        PlayerEntity var5;
                        if (this.field1041 == var4) {
                            var5 = this.field1053;
                        } else {
                            var5 = this.field1106[var4];
                        }
                        if (var5 != null) {
                            var2.method113(this.method341(var5.field292, var5.field293, var2.field374, (byte) 9) - var2.field378, var5.field293, field1114, var5.field292, this.field1263);
                        }
                    }
                    var2.method114(-877, this.field1097);
                    this.field1096.method61((Model) null, (int) var2.field387, 5, (int) var2.field386, var2.field393, (int) var2.field385, this.field1077, 0, var2, 60, -1);
                }
            } else {
                var2.method104();
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILkb;)V")
    private final void method418(int arg0, int arg1, Packet arg2) {
        for (int var4 = 0; var4 < this.field1109; ++var4) {
            int var5 = this.field1110[var4];
            NpcEntity var6 = this.field1319[var5];
            int var7 = arg2.method201();
            if ((var7 & 2) == 2) {
                int var8 = arg2.method203();
                if (var8 == 65535) {
                    var8 = -1;
                }
                if (var6.field319 == var8) {
                    var6.field323 = 0;
                }
                int var9 = arg2.method201();
                if (var8 == -1 || var6.field319 == -1 || SeqType.field938[var8].field946 > SeqType.field938[var6.field319].field946 || SeqType.field938[var6.field319].field946 == 0) {
                    var6.field319 = var8;
                    var6.field320 = 0;
                    var6.field321 = 0;
                    var6.field322 = var9;
                    var6.field323 = 0;
                }
            }
            if ((var7 & 4) == 4) {
                var6.field313 = arg2.method203();
                if (var6.field313 == 65535) {
                    var6.field313 = -1;
                }
            }
            if ((var7 & 8) == 8) {
                var6.field304 = arg2.method208();
                var6.field305 = 100;
            }
            if ((var7 & 16) == 16) {
                var6.field308 = arg2.method201();
                var6.field309 = arg2.method201();
                var6.field310 = field1114 + 400;
                var6.field311 = arg2.method201();
                var6.field312 = arg2.method201();
            }
            if ((var7 & 32) == 32) {
                var6.field346 = NpcType.method259(arg2.method203());
                var6.field299 = var6.field346.field785;
                var6.field300 = var6.field346.field786;
                var6.field301 = var6.field346.field787;
                var6.field302 = var6.field346.field788;
                var6.field297 = var6.field346.field784;
            }
            if ((var7 & 64) == 64) {
                var6.field324 = arg2.method203();
                int var10 = arg2.method206();
                var6.field328 = var10 >> 16;
                var6.field327 = (var10 & 65535) + field1114;
                var6.field325 = 0;
                var6.field326 = 0;
                if (var6.field327 > field1114) {
                    var6.field325 = -1;
                }
                if (var6.field324 == 65535) {
                    var6.field324 = -1;
                }
            }
            if ((var7 & 128) == 128) {
                var6.field314 = arg2.method203();
                var6.field315 = arg2.method203();
            }
        }
        if (arg0 <= 0) {
            field1031 = -106;
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public static final void method419(int arg0) {
        World3D.field214 = true;
        Pix3D.field535 = true;
        field1018 = true;
        if (arg0 == 26953) {
            World.field35 = true;
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method420(int arg0) {
        for (int var2 = -1; var2 < this.field1107; ++var2) {
            PlayerEntity var3;
            int var4;
            if (var2 == -1) {
                var3 = this.field1053;
                var4 = this.field1105 << 14;
            } else {
                var3 = this.field1106[this.field1108[var2]];
                var4 = this.field1108[var2] << 14;
            }
            if (var3 != null && var3.method108(0)) {
                var3.field368 = false;
                if ((field1018 && this.field1107 > 50 || this.field1107 > 200) && var2 != -1 && var3.field316 == var3.field297) {
                    var3.field368 = true;
                }
                int var5 = var3.field292 >> 7;
                int var6 = var3.field293 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field363 != null && field1114 >= var3.field358 && field1114 < var3.field359) {
                        var3.field368 = false;
                        var3.field357 = this.method341(var3.field292, var3.field293, this.field1077, (byte) 9);
                        this.field1096.method62(60, var3.field365, (Model) null, var3.field364, var3.field294, var3.field292, var3.field293, this.field1060, var4, var3.field357, var3, var3.field366, var3.field367, this.field1077);
                    } else {
                        if ((var3.field292 & 127) == 64 && (var3.field293 & 127) == 64) {
                            if (this.field1234[var5][var6] == this.field1133) {
                                continue;
                            }
                            this.field1234[var5][var6] = this.field1133;
                        }
                        var3.field357 = this.method341(var3.field292, var3.field293, this.field1077, (byte) 9);
                        this.field1096.method61((Model) null, var3.field357, 5, var3.field293, var3.field294, var3.field292, this.field1077, var3.field295, var3, 60, var4);
                    }
                }
            }
        }
        if (arg0 < 7 || arg0 > 7) {
            this.field1039 = this.field1001.method238();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        signlink.reporterror = false;
        try {
            if (this.field1119 != null) {
                this.field1119.method28();
            }
        } catch (Exception var2) {
        }
        this.field1119 = null;
        signlink.midi = "null";
        this.field1314 = null;
        this.field1292 = null;
        this.field1256 = null;
        this.field1209 = null;
        this.field1318 = null;
        this.field1235 = null;
        this.field1080 = null;
        this.field1009 = null;
        this.field1096 = null;
        this.field1092 = null;
        this.field1214 = null;
        this.field1266 = null;
        this.field1078 = null;
        this.field1079 = null;
        this.field1205 = null;
        this.field997 = null;
        this.field998 = null;
        this.field999 = null;
        this.field1000 = null;
        this.field1294 = null;
        this.field1295 = null;
        this.field1296 = null;
        this.field1337 = null;
        this.field1338 = null;
        this.field1339 = null;
        this.field1340 = null;
        this.field1341 = null;
        this.field1342 = null;
        this.field1343 = null;
        this.field1344 = null;
        this.field1345 = null;
        this.field1346 = null;
        if (arg0) {
            this.field1216 = this.field1001.method238();
        }
        this.field1046 = null;
        this.field1047 = null;
        this.field1048 = null;
        this.field1299 = null;
        this.field1300 = null;
        this.field1301 = null;
        this.field1227 = null;
        this.field1228 = null;
        this.field1002 = null;
        this.field1003 = null;
        this.field1004 = null;
        this.field1005 = null;
        this.field1006 = null;
        this.field1082 = null;
        this.field1083 = null;
        this.field1084 = null;
        this.field1085 = null;
        this.field1086 = null;
        this.field1253 = null;
        this.field1335 = null;
        this.field1198 = null;
        this.field1313 = null;
        this.field1179 = null;
        this.field1180 = null;
        this.field1181 = null;
        this.field1182 = null;
        this.field1073 = null;
        this.field1239 = null;
        this.field1234 = null;
        this.field1106 = null;
        this.field1108 = null;
        this.field1110 = null;
        this.field1111 = null;
        this.field1189 = null;
        this.field1319 = null;
        this.field1321 = null;
        this.field1020 = null;
        this.field1101 = null;
        this.field1007 = null;
        this.field1218 = null;
        this.field1012 = null;
        this.field1298 = null;
        this.field1201 = null;
        this.field1202 = null;
        this.field1203 = null;
        this.field1204 = null;
        this.field1075 = null;
        this.field1177 = null;
        this.field1123 = null;
        this.field1124 = null;
        this.field1232 = null;
        this.field1309 = null;
        this.field1056 = null;
        this.field1326 = null;
        this.field1138 = null;
        this.field1247 = null;
        this.field1248 = null;
        this.field1244 = null;
        this.field1245 = null;
        this.field1246 = null;
        this.field1249 = null;
        this.field1250 = null;
        this.field1251 = null;
        this.field1252 = null;
        this.method441(-43634);
        LocType.method252(300);
        NpcType.method258(300);
        ObjType.method264(300);
        FloType.field851 = null;
        IdkType.field863 = null;
        Component.field870 = null;
        UnkType.field930 = null;
        SeqType.field938 = null;
        SpotAnimType.field952 = null;
        SpotAnimType.field959 = null;
        VarpType.field962 = null;
        super.field14 = null;
        PlayerEntity.field369 = null;
        Pix3D.method149(300);
        World3D.method49(300);
        Model.method117(300);
        AnimBase.field78 = null;
        AnimFrame.field82 = null;
        System.gc();
        if (Linkable.field289) {
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIIII)V")
    public final void method421(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1333.method180(arg0, this.field1216, arg2);
        this.field1334.method180(arg0 + arg5 - 16, this.field1216, arg2);
        Pix2D.method145(this.field1236, this.field1162, arg5 - 32, arg0 + 16, 16, arg2);
        int var7 = (arg5 - 32) * arg5 / arg3;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg5 - 32 - var7) * arg4 / (arg3 - arg5);
        Pix2D.method145(this.field1257, this.field1162, var7, arg0 + 16 + var8, 16, arg2);
        Pix2D.method148(31405, this.field1231, arg0 + 16 + var8, arg2, var7);
        Pix2D.method148(31405, this.field1231, arg0 + 16 + var8, arg2 + 1, var7);
        Pix2D.method147(16, false, arg2, arg0 + 16 + var8, this.field1231);
        if (arg1) {
            this.method6();
        }
        Pix2D.method147(16, false, arg2, arg0 + 17 + var8, this.field1231);
        Pix2D.method148(31405, this.field1199, arg0 + 16 + var8, arg2 + 15, var7);
        Pix2D.method148(31405, this.field1199, arg0 + 17 + var8, arg2 + 14, var7 - 1);
        Pix2D.method147(16, false, arg2, arg0 + 15 + var8 + var7, this.field1199);
        Pix2D.method147(15, false, arg2 + 1, arg0 + 14 + var8 + var7, this.field1199);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLib;)V")
    public final void method422(byte arg0, Pix8 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1311.length; ++var4) {
            this.field1311[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var18 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1311[var18] = (int) (Math.random() * 256.0D);
        }
        if (arg0 != 57) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        for (int var7 = 0; var7 < 20; ++var7) {
            for (int var14 = 1; var14 < var3 - 1; ++var14) {
                for (int var16 = 1; var16 < 127; ++var16) {
                    int var17 = (var14 << 7) + var16;
                    this.field1312[var17] = (this.field1311[var17 - 1] + this.field1311[var17 + 1] + this.field1311[var17 - 128] + this.field1311[var17 + 128]) / 4;
                }
            }
            int[] var15 = this.field1311;
            this.field1311 = this.field1312;
            this.field1312 = var15;
        }
        if (arg1 != null) {
            int var8 = 0;
            for (int var9 = 0; var9 < arg1.field580; ++var9) {
                for (int var10 = 0; var10 < arg1.field579; ++var10) {
                    if (arg1.field577[var8++] != 0) {
                        int var11 = var10 + 16 + arg1.field581;
                        int var12 = var9 + 16 + arg1.field582;
                        int var13 = (var12 << 7) + var11;
                        this.field1311[var13] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        if (signlink.sunjava) {
            super.field8 = 5;
        }
        signlink.midi = "scape_main";
        if (field1143) {
            this.field1327 = true;
        } else {
            field1143 = true;
            boolean var1 = false;
            String var2 = this.method414((byte) 2);
            if (var2.endsWith("jagex.com")) {
                var1 = true;
            }
            if (var2.endsWith("runescape.com")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.252")) {
                var1 = true;
            }
            if (var2.endsWith("192.168.1.2")) {
                var1 = true;
            }
            if (var2.endsWith("69.1.68.43")) {
                var1 = true;
            }
            if (var2.endsWith("127.0.0.1")) {
                var1 = true;
            }
            if (!var1) {
                this.field1271 = true;
            } else {
                try {
                    int var3 = 5;
                    this.field1072[7] = 0;
                    while (this.field1072[7] == 0) {
                        this.method13((byte) -75, 10, "Connecting to fileserver");
                        try {
                            DataInputStream var4 = this.method428("crc" + (int) (Math.random() * 9.9999999E7D));
                            Packet var5 = new Packet(new byte[32], 4);
                            var4.readFully(var5.field605, 0, 32);
                            for (int var6 = 0; var6 < 8; ++var6) {
                                this.field1072[var6] = var5.method206();
                            }
                            var4.close();
                        } catch (IOException var50) {
                            for (int var7 = var3; var7 > 0; --var7) {
                                this.method13((byte) -75, 10, "Error loading - Will retry in " + var7 + " secs.");
                                try {
                                    Thread.sleep(1000L);
                                } catch (Exception var45) {
                                }
                            }
                            var3 *= 2;
                            if (var3 > 60) {
                                var3 = 60;
                            }
                        }
                    }
                    this.field1087 = this.method349(this.field1072[1], false, "title screen", 10, "title");
                    this.field1027 = new PixFont(true, this.field1087, "p11");
                    this.field1028 = new PixFont(true, this.field1087, "p12");
                    this.field1029 = new PixFont(true, this.field1087, "b12");
                    this.field1030 = new PixFont(true, this.field1087, "q8");
                    this.method430(false);
                    this.method381(0);
                    Jagfile var8 = this.method349(this.field1072[2], false, "config", 20, "config");
                    Jagfile var9 = this.method349(this.field1072[3], false, "interface", 30, "interface");
                    Jagfile var10 = this.method349(this.field1072[4], false, "2d graphics", 40, "media");
                    Jagfile var11 = this.method349(this.field1072[5], false, "3d graphics", 50, "models");
                    Jagfile var12 = this.method349(this.field1072[6], false, "textures", 60, "textures");
                    Jagfile var13 = this.method349(this.field1072[7], false, "chat system", 70, "wordenc");
                    this.field1009 = new byte[4][104][104];
                    this.field1080 = new int[4][105][105];
                    this.field1096 = new World3D(this.field1080, -4278, 4, 104, 104);
                    for (int var14 = 0; var14 < 4; ++var14) {
                        this.field1092[var14] = new CollisionMap(104, field1031, 104);
                    }
                    this.field1309 = new Pix32(512, 512);
                    this.method13((byte) -75, 80, "Unpacking media");
                    this.field1046 = new Pix8(var10, "invback", 0);
                    this.field1048 = new Pix8(var10, "chatback", 0);
                    this.field1047 = new Pix8(var10, "mapback", 0);
                    this.field1299 = new Pix8(var10, "backbase1", 0);
                    this.field1300 = new Pix8(var10, "backbase2", 0);
                    this.field1301 = new Pix8(var10, "backhmid1", 0);
                    this.field1227 = new Pix8(var10, "sideicons1", 0);
                    this.field1228 = new Pix8(var10, "sideicons2", 0);
                    this.field1253 = new Pix32(var10, "compass", 0);
                    try {
                        for (int var15 = 0; var15 < 50; ++var15) {
                            this.field1073[var15] = new Pix8(var10, "mapscene", var15);
                        }
                    } catch (Exception var49) {
                    }
                    try {
                        for (int var16 = 0; var16 < 50; ++var16) {
                            this.field1239[var16] = new Pix32(var10, "mapfunction", var16);
                        }
                    } catch (Exception var48) {
                    }
                    try {
                        for (int var17 = 0; var17 < 20; ++var17) {
                            this.field1335[var17] = new Pix32(var10, "hitmarks", var17);
                        }
                    } catch (Exception var47) {
                    }
                    try {
                        for (int var18 = 0; var18 < 20; ++var18) {
                            this.field1198[var18] = new Pix32(var10, "headicons", var18);
                        }
                    } catch (Exception var46) {
                    }
                    for (int var19 = 0; var19 < 8; ++var19) {
                        this.field1313[var19] = new Pix32(var10, "cross", var19);
                    }
                    this.field1179 = new Pix32(var10, "mapdots", 0);
                    this.field1180 = new Pix32(var10, "mapdots", 1);
                    this.field1181 = new Pix32(var10, "mapdots", 2);
                    this.field1182 = new Pix32(var10, "mapdots", 3);
                    this.field1333 = new Pix8(var10, "scrollbar", 0);
                    this.field1334 = new Pix8(var10, "scrollbar", 1);
                    this.field1002 = new Pix8(var10, "redstone1", 0);
                    this.field1003 = new Pix8(var10, "redstone2", 0);
                    this.field1004 = new Pix8(var10, "redstone3", 0);
                    this.field1005 = new Pix8(var10, "redstone1", 0);
                    this.field1005.method178(-25737);
                    this.field1006 = new Pix8(var10, "redstone2", 0);
                    this.field1006.method178(-25737);
                    this.field1082 = new Pix8(var10, "redstone1", 0);
                    this.field1082.method179(false);
                    this.field1083 = new Pix8(var10, "redstone2", 0);
                    this.field1083.method179(false);
                    this.field1084 = new Pix8(var10, "redstone3", 0);
                    this.field1084.method179(false);
                    this.field1085 = new Pix8(var10, "redstone1", 0);
                    this.field1085.method178(-25737);
                    this.field1085.method179(false);
                    this.field1086 = new Pix8(var10, "redstone2", 0);
                    this.field1086.method178(-25737);
                    this.field1086.method179(false);
                    Pix32 var20 = new Pix32(var10, "backleft1", 0);
                    this.field1337 = new PixMap(var20.field567, (byte) -58, this.method11(-36374), var20.field566);
                    var20.method167(0, field1196, 0);
                    Pix32 var21 = new Pix32(var10, "backleft2", 0);
                    this.field1338 = new PixMap(var21.field567, (byte) -58, this.method11(-36374), var21.field566);
                    var21.method167(0, field1196, 0);
                    Pix32 var22 = new Pix32(var10, "backright1", 0);
                    this.field1339 = new PixMap(var22.field567, (byte) -58, this.method11(-36374), var22.field566);
                    var22.method167(0, field1196, 0);
                    Pix32 var23 = new Pix32(var10, "backright2", 0);
                    this.field1340 = new PixMap(var23.field567, (byte) -58, this.method11(-36374), var23.field566);
                    var23.method167(0, field1196, 0);
                    Pix32 var24 = new Pix32(var10, "backtop1", 0);
                    this.field1341 = new PixMap(var24.field567, (byte) -58, this.method11(-36374), var24.field566);
                    var24.method167(0, field1196, 0);
                    Pix32 var25 = new Pix32(var10, "backtop2", 0);
                    this.field1342 = new PixMap(var25.field567, (byte) -58, this.method11(-36374), var25.field566);
                    var25.method167(0, field1196, 0);
                    Pix32 var26 = new Pix32(var10, "backvmid1", 0);
                    this.field1343 = new PixMap(var26.field567, (byte) -58, this.method11(-36374), var26.field566);
                    var26.method167(0, field1196, 0);
                    Pix32 var27 = new Pix32(var10, "backvmid2", 0);
                    this.field1344 = new PixMap(var27.field567, (byte) -58, this.method11(-36374), var27.field566);
                    var27.method167(0, field1196, 0);
                    Pix32 var28 = new Pix32(var10, "backvmid3", 0);
                    this.field1345 = new PixMap(var28.field567, (byte) -58, this.method11(-36374), var28.field566);
                    var28.method167(0, field1196, 0);
                    Pix32 var29 = new Pix32(var10, "backhmid2", 0);
                    this.field1346 = new PixMap(var29.field567, (byte) -58, this.method11(-36374), var29.field566);
                    var29.method167(0, field1196, 0);
                    this.method13((byte) -75, 85, "Unpacking textures");
                    Pix3D.method154(field1183, var12);
                    Pix3D.method158(0.8D, -433);
                    Pix3D.method153((byte) 3, 20);
                    this.method13((byte) -75, 85, "Unpacking models");
                    Model.method118(var11, false);
                    AnimBase.method47(213, var11);
                    AnimFrame.method48(213, var11);
                    this.method13((byte) -75, 85, "Unpacking config");
                    SeqType.method295(true, var8);
                    LocType.method251(var8);
                    FloType.method284(true, var8);
                    ObjType.method263(var8);
                    NpcType.method257(var8);
                    IdkType.method287(true, var8);
                    SpotAnimType.method297(true, var8);
                    VarpType.method300(true, var8);
                    this.method13((byte) -75, 90, "Unpacking interfaces");
                    PixFont[] var30 = new PixFont[] { this.field1027, this.field1028, this.field1029, this.field1030 };
                    Component.method291(-561, var10, var9, var30);
                    this.method13((byte) -75, 95, "Preparing game engine");
                    for (int var31 = 0; var31 < 33; ++var31) {
                        int var32 = 999;
                        int var33 = 0;
                        for (int var34 = 0; var34 < 35; ++var34) {
                            if (this.field1047.field577[this.field1047.field579 * var31 + var34] == 0) {
                                if (var32 == 999) {
                                    var32 = var34;
                                }
                            } else if (var32 != 999) {
                                var33 = var34;
                                break;
                            }
                        }
                        this.field1170[var31] = var32;
                        this.field1142[var31] = var33 - var32;
                    }
                    for (int var35 = 9; var35 < 160; ++var35) {
                        int var36 = 999;
                        int var37 = 0;
                        for (int var38 = 10; var38 < 168; ++var38) {
                            if (this.field1047.field577[this.field1047.field579 * var35 + var38] != 0 || var38 <= 34 && var35 <= 34) {
                                if (var36 != 999) {
                                    var37 = var38;
                                    break;
                                }
                            } else if (var36 == 999) {
                                var36 = var38;
                            }
                        }
                        this.field1156[var35 - 9] = var36 - 21;
                        this.field1217[var35 - 9] = var37 - var36;
                    }
                    Pix3D.method151(479, field1190, 96);
                    this.field1289 = Pix3D.field546;
                    Pix3D.method151(190, field1190, 261);
                    this.field1290 = Pix3D.field546;
                    Pix3D.method151(512, field1190, 334);
                    this.field1291 = Pix3D.field546;
                    int[] var39 = new int[9];
                    for (int var40 = 0; var40 < 9; ++var40) {
                        int var41 = var40 * 32 + 128 + 15;
                        int var42 = var41 * 3 + 600;
                        int var43 = Pix3D.field544[var41];
                        var39[var40] = var42 * var43 >> 16;
                    }
                    World3D.method84(512, 6, 334, var39, 800, 500);
                    WordFilter.method302(var13);
                } catch (Exception var51) {
                    this.field1187 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method423(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "getjingle", descriptor = "()Ljava/lang/String;")
    public final String getjingle() {
        if (signlink.jingle == null) {
            return "none";
        } else {
            String var1 = signlink.jingle + ".mid.gz";
            signlink.jingle = null;
            return var1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIILec;IBIII)V")
    public final void method424(boolean arg0, int arg1, int arg2, Component arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        if (arg5 == 9) {
            if (this.field1116) {
                this.field1254 = 32;
            } else {
                this.field1254 = 0;
            }
            this.field1116 = false;
            if (arg2 >= arg4 && arg2 < arg4 + 16 && arg7 >= arg8 && arg7 < arg8 + 16) {
                arg3.field889 -= this.field1121 * 4;
                if (arg0) {
                    this.field1102 = true;
                    return;
                }
            } else if (arg2 >= arg4 && arg2 < arg4 + 16 && arg7 >= arg6 + arg8 - 16 && arg7 < arg6 + arg8) {
                arg3.field889 += this.field1121 * 4;
                if (arg0) {
                    this.field1102 = true;
                    return;
                }
            } else {
                if (arg2 < arg4 - this.field1254 || arg2 >= arg4 + 16 + this.field1254 || arg7 < arg8 + 16 || arg7 >= arg6 + arg8 - 16 || this.field1121 <= 0) {
                    return;
                }
                int var10 = (arg6 - 32) * arg6 / arg1;
                if (var10 < 8) {
                    var10 = 8;
                }
                int var11 = arg7 - arg8 - 16 - var10 / 2;
                int var12 = arg6 - 32 - var10;
                arg3.field889 = (arg1 - arg6) * var11 / var12;
                if (arg0) {
                    this.field1102 = true;
                }
                this.field1116 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method425(int arg0) {
        if (this.field1129 == 0) {
            int var2 = super.field22;
            this.field1165 += arg0;
            if (this.field1061 == 1 && super.field23 >= 520 && super.field24 >= 165 && super.field23 <= 788 && super.field24 <= 230) {
                var2 = 0;
            }
            if (this.field1193) {
                if (var2 != 1) {
                    int var3 = super.field20;
                    int var4 = super.field21;
                    if (this.field1022 == 0) {
                        var3 -= 8;
                        var4 -= 11;
                    }
                    if (this.field1022 == 1) {
                        var3 -= 562;
                        var4 -= 231;
                    }
                    if (var3 < this.field1023 - 10 || var3 > this.field1025 + this.field1023 + 10 || var4 < this.field1024 - 10 || var4 > this.field1026 + this.field1024 + 10) {
                        this.field1193 = false;
                        if (this.field1022 == 1) {
                            this.field1102 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field1023;
                    int var6 = this.field1024;
                    int var7 = this.field1025;
                    int var8 = super.field23;
                    int var9 = super.field24;
                    if (this.field1022 == 0) {
                        var8 -= 8;
                        var9 -= 11;
                    }
                    if (this.field1022 == 1) {
                        var8 -= 562;
                        var9 -= 231;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field1065; ++var11) {
                        int var12 = (this.field1065 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method384(this.field1066, var10);
                    }
                    this.field1193 = false;
                    if (this.field1022 == 1) {
                        this.field1102 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field1065 > 0) {
                    int var13 = this.field1203[this.field1065 - 1];
                    if (var13 == 288 || var13 == 776 || var13 == 857 || var13 == 881 || var13 == 688 || var13 == 649 || var13 == 408 || var13 == 176 || var13 == 294 || var13 == 622 || var13 == 517) {
                        int var14 = this.field1201[this.field1065 - 1];
                        int var15 = this.field1202[this.field1065 - 1];
                        Component var16 = Component.field870[var15];
                        if (var16.field896) {
                            this.field1059 = false;
                            this.field1127 = var15;
                            this.field1128 = var14;
                            this.field1129 = 2;
                            this.field1130 = super.field23;
                            this.field1131 = super.field24;
                            if (Component.field870[var15].field876 == this.field1317) {
                                this.field1129 = 1;
                            }
                            if (Component.field870[var15].field876 == this.field1057) {
                                this.field1129 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && this.field1103 == 1 && this.field1065 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field1065 > 0) {
                    this.method384(this.field1066, this.field1065 - 1);
                }
                if (var2 != 2 || this.field1065 <= 0) {
                    return;
                }
                this.method355(-23085);
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method426(boolean arg0) {
        this.field998.method227(-510);
        int var2 = this.field1053.field292 / 32 + 48;
        int var3 = 464 - this.field1053.field293 / 32;
        this.field1309.method173(this.field1217, 146, 0, 151, this.field1156, 21, 9, var2, this.field1279, var3);
        this.field1253.method173(this.field1142, 33, 0, 33, this.field1170, 0, 0, 25, this.field1279, 25);
        for (int var4 = 0; var4 < this.field1122; ++var4) {
            int var22 = this.field1123[var4] * 4 + 2 - this.field1053.field292 / 32;
            int var23 = this.field1124[var4] * 4 + 2 - this.field1053.field293 / 32;
            this.method434(this.field1241, var23, this.field1232[var4], var22);
        }
        for (int var5 = 0; var5 < 104; ++var5) {
            for (int var18 = 0; var18 < 104; ++var18) {
                LinkList var19 = this.field1020[this.field1077][var5][var18];
                if (var19 != null) {
                    int var20 = var5 * 4 + 2 - this.field1053.field292 / 32;
                    int var21 = var18 * 4 + 2 - this.field1053.field293 / 32;
                    this.method434(this.field1241, var21, this.field1179, var20);
                }
            }
        }
        for (int var6 = 0; var6 < this.field1320; ++var6) {
            NpcEntity var15 = this.field1319[this.field1321[var6]];
            if (var15 != null && var15.method108(0) && var15.field346.field796) {
                int var16 = var15.field292 / 32 - this.field1053.field292 / 32;
                int var17 = var15.field293 / 32 - this.field1053.field293 / 32;
                this.method434(this.field1241, var17, this.field1180, var16);
            }
        }
        for (int var7 = 0; var7 < this.field1107; ++var7) {
            PlayerEntity var8 = this.field1106[this.field1108[var7]];
            if (var8 != null && var8.method108(0)) {
                int var9 = var8.field292 / 32 - this.field1053.field292 / 32;
                int var10 = var8.field293 / 32 - this.field1053.field293 / 32;
                boolean var11 = false;
                long var12 = JString.method243(var8.field349);
                for (int var14 = 0; var14 < this.field993; ++var14) {
                    if (this.field1326[var14] == var12 && this.field1138[var14] != 0) {
                        var11 = true;
                        break;
                    }
                }
                if (var11) {
                    this.method434(this.field1241, var10, this.field1182, var9);
                } else {
                    this.method434(this.field1241, var10, this.field1181, var9);
                }
            }
        }
        Pix2D.method145(16777215, this.field1162, 3, 82, 3, 93);
        this.field999.method227(-510);
        this.field1089 &= arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZ)V")
    public final void method427(String arg0, String arg1, int arg2, boolean arg3) {
        signlink.errorname = arg0;
        try {
            if (!arg3) {
                this.field1328 = "";
                this.field1329 = "Connecting to server...";
                this.method399(false);
            }
            this.field1119 = new ClientStream(this, 994, this.method423(this.field1272 + 43594));
            this.field1119.method31(this.field1256.field605, 0, 8);
            this.field1256.field606 = 0;
            this.field1197 = this.field1256.method207(720);
            int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1197 >> 32), (int) this.field1197 };
            this.field1314.field606 = 0;
            this.field1314.method193(10);
            this.field1314.method196(var5[0]);
            this.field1314.method196(var5[1]);
            this.field1314.method196(var5[2]);
            this.field1314.method196(var5[3]);
            this.field1314.method196(arg2);
            this.field1314.method198(arg0);
            this.field1314.method198(arg1);
            this.field1314.method216(field1141, field1049, -623);
            this.field1292.field606 = 0;
            if (arg3) {
                this.field1292.method193(18);
            } else {
                this.field1292.method193(16);
            }
            this.field1292.method193(this.field1314.field606 + 32 + 1);
            this.field1292.method193(194);
            for (int var6 = 0; var6 < 8; ++var6) {
                this.field1292.method196(this.field1072[var6]);
            }
            this.field1292.method199(2, this.field1314.field605, 0, this.field1314.field606);
            this.field1314.field610 = new Isaac(true, var5);
            for (int var7 = 0; var7 < 4; ++var7) {
                var5[var7] += 50;
            }
            this.field1001 = new Isaac(true, var5);
            this.field1119.method32(this.field1292.field605, this.field1292.field606, false, 0);
            int var8 = this.field1119.method29();
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var16) {
                }
                this.method427(arg0, arg1, arg2, arg3);
                return;
            }
            if (var8 == 2) {
                this.field1089 = true;
                this.field1314.field606 = 0;
                this.field1256.field606 = 0;
                this.field1166 = -1;
                this.field1258 = -1;
                this.field1259 = -1;
                this.field1260 = -1;
                this.field1165 = 0;
                this.field1167 = 0;
                this.field1093 = 0;
                this.field1065 = 0;
                this.field1193 = false;
                super.field18 = 0;
                for (int var9 = 0; var9 < 100; ++var9) {
                    this.field1169[var9] = null;
                }
                this.field1067 = 0;
                this.field1061 = 0;
                this.field1324 = 0;
                this.field1233 = -1;
                this.field1107 = 0;
                this.field1320 = 0;
                for (int var10 = 0; var10 < this.field1104; ++var10) {
                    this.field1106[var10] = null;
                    this.field1111[var10] = null;
                }
                for (int var11 = 0; var11 < 8192; ++var11) {
                    this.field1319[var11] = null;
                }
                this.field1053 = this.field1106[this.field1105] = new PlayerEntity();
                this.field1218.method224();
                this.field1012.method224();
                this.field1007.method224();
                for (int var12 = 0; var12 < 4; ++var12) {
                    for (int var13 = 0; var13 < 104; ++var13) {
                        for (int var14 = 0; var14 < 104; ++var14) {
                            this.field1020[var12][var13][var14] = null;
                        }
                    }
                }
                this.field1101 = new LinkList(5);
                this.field993 = 0;
                this.field1057 = -1;
                this.field1317 = -1;
                this.field1336 = -1;
                this.field1243 = false;
                this.field1262 = 3;
                this.field1118 = false;
                this.field1193 = false;
                this.field1094 = false;
                this.field1058 = 0;
                this.field1325 = true;
                this.method367(1);
                for (int var15 = 0; var15 < 5; ++var15) {
                    this.field1144[var15] = 0;
                }
                this.method366(-242);
                if (this.field1272 >= 3) {
                    InputTracking.method33(-282);
                }
                return;
            }
            if (var8 == 3) {
                this.field1328 = "";
                this.field1329 = "Invalid username or password.";
                return;
            }
            if (var8 == 4) {
                this.field1328 = "Your account has been disabled.";
                this.field1329 = "Please check your message-centre for details.";
                return;
            }
            if (var8 == 5) {
                this.field1328 = "Your account is already logged in.";
                this.field1329 = "Try again in 60 secs...";
                return;
            }
            if (var8 == 6) {
                this.field1328 = "RuneScape has been updated!";
                this.field1329 = "Please reload this page.";
                return;
            }
            if (var8 == 7) {
                this.field1328 = "This world is full.";
                this.field1329 = "Please use a different world.";
                return;
            }
            if (var8 == 8) {
                this.field1328 = "Unable to connect.";
                this.field1329 = "Login server offline.";
                return;
            }
            if (var8 == 9) {
                this.field1328 = "Login limit exceeded.";
                this.field1329 = "Too many connections from your address.";
                return;
            }
            if (var8 == 10) {
                this.field1328 = "Unable to connect.";
                this.field1329 = "Bad session id.";
                return;
            }
            if (var8 == 11) {
                this.field1329 = "Login server rejected session.";
                this.field1329 = "Please try again";
                return;
            }
            if (var8 == 12) {
                this.field1328 = "You need a members account to beta-test";
                this.field1329 = "Please subscribe, or play RS1 instead";
                return;
            }
            if (var8 == 13) {
                this.field1328 = "Could not complete login";
                this.field1329 = "Please try using a different world";
                return;
            }
            if (var8 == 14) {
                this.field1328 = "The server is being updated";
                this.field1329 = "Please wait 1 minute and try again";
                return;
            }
            if (var8 == 15) {
                this.field1089 = true;
                this.field1314.field606 = 0;
                this.field1256.field606 = 0;
                this.field1166 = -1;
                this.field1258 = -1;
                this.field1259 = -1;
                this.field1260 = -1;
                this.field1165 = 0;
                this.field1167 = 0;
                this.field1093 = 0;
                this.field1065 = 0;
                this.field1193 = false;
                if (this.field1272 >= 3) {
                    InputTracking.method33(-282);
                }
                return;
            }
            if (var8 == 16) {
                this.field1328 = "Login attempts exceeded";
                this.field1329 = "Please wait 1 minute and try again";
                return;
            }
        } catch (IOException var17) {
            this.field1328 = "";
            this.field1329 = "Error connecting to server.";
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method428(String arg0) throws IOException {
        return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method429(byte arg0) {
        this.field997.method227(-510);
        Pix3D.field546 = this.field1290;
        this.field1046.method180(0, this.field1216, 0);
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            this.field1162 = this.field1001.method238();
        }
        if (this.field1336 != -1) {
            this.method378(this.field1125, Component.field870[this.field1336], 0, 0, 0);
        } else if (this.field1052[this.field1262] != -1) {
            this.method378(this.field1125, Component.field870[this.field1052[this.field1262]], 0, 0, 0);
        }
        if (this.field1193 && this.field1022 == 1) {
            this.method401(9);
        }
        this.field997.method228(562, super.field13, 231, this.field1285);
        this.field999.method227(-510);
        Pix3D.field546 = this.field1291;
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method430(boolean arg0) {
        byte[] var2 = this.field1087.method242((byte) 6, (byte[]) null, "title.dat");
        Pix32 var3 = new Pix32(var2, this);
        this.field1247.method227(-510);
        var3.method167(0, field1196, 0);
        if (arg0) {
            field1183 = !field1183;
        }
        this.field1248.method227(-510);
        var3.method167(0, field1196, -661);
        this.field1244.method227(-510);
        var3.method167(0, field1196, -128);
        this.field1245.method227(-510);
        var3.method167(-386, field1196, -214);
        this.field1246.method227(-510);
        var3.method167(-186, field1196, -214);
        this.field1249.method227(-510);
        var3.method167(-265, field1196, 0);
        this.field1250.method227(-510);
        var3.method167(-265, field1196, -574);
        this.field1251.method227(-510);
        var3.method167(-186, field1196, -128);
        this.field1252.method227(-510);
        var3.method167(-186, field1196, -574);
        int[] var4 = new int[var3.field566];
        for (int var5 = 0; var5 < var3.field567; ++var5) {
            for (int var10 = 0; var10 < var3.field566; ++var10) {
                var4[var10] = var3.field565[var3.field566 * var5 + (var3.field566 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field566; ++var11) {
                var3.field565[var3.field566 * var5 + var11] = var4[var11];
            }
        }
        this.field1247.method227(-510);
        var3.method167(0, field1196, 394);
        this.field1248.method227(-510);
        var3.method167(0, field1196, -267);
        this.field1244.method227(-510);
        var3.method167(0, field1196, 266);
        this.field1245.method227(-510);
        var3.method167(-386, field1196, 180);
        this.field1246.method227(-510);
        var3.method167(-186, field1196, 180);
        this.field1249.method227(-510);
        var3.method167(-265, field1196, 394);
        this.field1250.method227(-510);
        var3.method167(-265, field1196, -180);
        this.field1251.method227(-510);
        var3.method167(-186, field1196, 212);
        this.field1252.method227(-510);
        var3.method167(-186, field1196, -180);
        Pix32 var6 = new Pix32(this.field1087, "logo", 0);
        this.field1244.method227(-510);
        var6.method169(18, this.field1216, super.field11 / 2 - var6.field566 / 2 - 128);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method10(boolean arg0) {
        this.field1036 = true;
        if (arg0) {
            this.field1020 = null;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)V")
    public final void method431(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1096.method74(arg3, arg1, arg0);
        if (var5 != 0) {
            int var6 = this.field1096.method78(arg3, arg1, arg0, var5);
            int var7 = var6 >> 6 & 3;
            int var8 = var6 & 31;
            int var9 = 15658734;
            if (var5 > 0) {
                var9 = 15597568;
            }
            int[] var10 = this.field1309.field565;
            int var11 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
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
        int var12 = this.field1096.method76(arg3, arg1, arg0);
        if (arg2 == -29363) {
            if (var12 != 0) {
                int var13 = this.field1096.method78(arg3, arg1, arg0, var12);
                int var14 = var13 >> 6 & 3;
                int var15 = var13 & 31;
                if (var15 == 9) {
                    int var16 = 15658734;
                    if (var12 > 0) {
                        var16 = 15597568;
                    }
                    int[] var17 = this.field1309.field565;
                    int var18 = (103 - arg0) * 512 * 4 + arg1 * 4 + 24624;
                    if (var14 != 0 && var14 != 2) {
                        var17[var18] = var16;
                        var17[var18 + 512 + 1] = var16;
                        var17[var18 + 1024 + 2] = var16;
                        var17[var18 + 1536 + 3] = var16;
                    } else {
                        var17[var18 + 1536] = var16;
                        var17[var18 + 1024 + 1] = var16;
                        var17[var18 + 512 + 2] = var16;
                        var17[var18 + 3] = var16;
                    }
                }
                if (var15 == 10 || var15 == 11) {
                    int var19 = var12 >> 14 & 32767;
                    LocType var20 = LocType.method253(var19);
                    if (var20.field760 == -1) {
                        return;
                    }
                    Pix8 var21 = this.field1073[var20.field760];
                    int var22 = (var20.field745 * 4 - var21.field579) / 2;
                    int var23 = (var20.field746 * 4 - var21.field580) / 2;
                    var21.method180((104 - arg0 - var20.field746) * 4 + 48 + var23, this.field1216, arg1 * 4 + 48 + var22);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method432(boolean arg0, int arg1) {
        int[] var3 = this.field1309.field565;
        if (arg0) {
            this.field1314.method193(234);
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var14 = (103 - var6) * 512 * 4 + 24628;
            for (int var15 = 1; var15 < 103; ++var15) {
                if ((this.field1009[arg1][var15][var6] & 24) == 0) {
                    this.field1096.method83(var3, var14, 512, arg1, var15, var6);
                }
                if (arg1 < 3 && (this.field1009[arg1 + 1][var15][var6] & 8) != 0) {
                    this.field1096.method83(var3, var14, 512, arg1 + 1, var15, var6);
                }
                var14 += 4;
            }
        }
        this.field1309.method166(-510);
        for (int var7 = 1; var7 < 103; ++var7) {
            for (int var13 = 1; var13 < 103; ++var13) {
                if ((this.field1009[arg1][var13][var7] & 24) == 0) {
                    this.method431(var7, var13, -29363, arg1);
                }
                if (arg1 < 3 && (this.field1009[arg1 + 1][var13][var7] & 8) != 0) {
                    this.method431(var7, var13, -29363, arg1 + 1);
                }
            }
        }
        this.field999.method227(-510);
        this.field1122 = 0;
        for (int var8 = 0; var8 < 104; ++var8) {
            for (int var9 = 0; var9 < 104; ++var9) {
                int var10 = this.field1096.method77(this.field1077, var8, var9);
                if (var10 != 0) {
                    int var11 = var10 >> 14 & 32767;
                    int var12 = LocType.method253(var11).field759;
                    if (var12 >= 0) {
                        this.field1232[this.field1122] = this.field1239[var12];
                        this.field1123[this.field1122] = var8;
                        this.field1124[this.field1122] = var9;
                        ++this.field1122;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BLec;)Z")
    public final boolean method433(byte arg0, Component arg1) {
        if (arg0 != 3) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg1.field885 == null) {
            return false;
        } else {
            for (int var4 = 0; var4 < arg1.field885.length; ++var4) {
                int var5 = this.method348(var4, arg1, -6815);
                int var6 = arg1.field886[var4];
                if (arg1.field885[var4] == 2) {
                    if (var5 >= var6) {
                        return false;
                    }
                } else if (arg1.field885[var4] == 3) {
                    if (var5 <= var6) {
                        return false;
                    }
                } else if (arg1.field885[var4] == 4) {
                    if (var5 == var6) {
                        return false;
                    }
                } else if (var5 != var6) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        this.field1272 = Integer.parseInt(this.getParameter("portoff"));
        this.field1074 = Integer.parseInt(this.getParameter("nodeid"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method419(26953);
        } else {
            method438(-229);
        }
        this.method2(true, 789, 532);
    }

    @OriginalMember(owner = "client", name = "gettune", descriptor = "()Ljava/lang/String;")
    public final String gettune() {
        if (signlink.midi == null) {
            return "none";
        } else {
            String var1 = signlink.midi + ".mid.gz";
            signlink.midi = null;
            return var1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILhb;I)V")
    public final void method434(byte arg0, int arg1, Pix32 arg2, int arg3) {
        int var5 = arg1 * arg1 + arg3 * arg3;
        if (this.field1140 != arg0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if (var5 <= 6400) {
            int var7 = Model.field514[this.field1279];
            int var8 = Model.field515[this.field1279];
            int var9 = arg1 * var7 + arg3 * var8 >> 16;
            int var10 = arg1 * var8 - arg3 * var7 >> 16;
            if (var5 > 2500) {
                arg2.method174(0, var9 + 94 - arg2.field566 / 2, this.field1047, 83 - var10 - arg2.field567 / 2);
            } else {
                arg2.method169(83 - var10 - arg2.field567 / 2, this.field1216, var9 + 94 - arg2.field566 / 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIIIIII)V")
    public final void method435(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1089 &= arg0;
        if (arg4 >= 1 && arg3 >= 1 && arg4 <= 102 && arg3 <= 102) {
            if (field1018 && this.field1077 != arg1) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg5 == 0) {
                var9 = this.field1096.method74(arg1, arg4, arg3);
            }
            if (arg5 == 1) {
                var9 = this.field1096.method75(arg4, arg3, this.field1200, arg1);
            }
            if (arg5 == 2) {
                var9 = this.field1096.method76(arg1, arg4, arg3);
            }
            if (arg5 == 3) {
                var9 = this.field1096.method77(arg1, arg4, arg3);
            }
            if (var9 != 0) {
                int var13 = this.field1096.method78(arg1, arg4, arg3, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg5 == 0) {
                    this.field1096.method69(this.field1126, arg1, arg4, arg3);
                    LocType var17 = LocType.method253(var14);
                    if (var17.field747) {
                        this.field1092[arg1].method277(918, arg4, var16, var17.field748, arg3, var15);
                    }
                }
                if (arg5 == 1) {
                    this.field1096.method70(arg4, arg1, 0, arg3);
                }
                if (arg5 == 2) {
                    this.field1096.method71(533, arg3, arg1, arg4);
                    LocType var18 = LocType.method253(var14);
                    if (var18.field745 + arg4 > 103 || var18.field745 + arg3 > 103 || var18.field746 + arg4 > 103 || var18.field746 + arg3 > 103) {
                        return;
                    }
                    if (var18.field747) {
                        this.field1092[arg1].method278(arg3, var18.field746, var18.field748, var18.field745, var16, arg4, false);
                    }
                }
                if (arg5 == 3) {
                    this.field1096.method72((byte) 52, arg3, arg4, arg1);
                    LocType var19 = LocType.method253(var14);
                    if (var19.field747 && var19.field749) {
                        this.field1092[arg1].method280(99, arg4, arg3);
                    }
                }
            }
            if (arg6 >= 0) {
                int var20 = arg1;
                if (arg1 < 3 && (this.field1009[1][arg4][arg3] & 2) == 2) {
                    var20 = arg1 + 1;
                }
                World.method27(arg6, this.field1096, arg2, arg7, arg1, arg4, this.field1092[arg1], this.field1298, this.field1080, arg3, (byte) 1, var20);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILz;III)V")
    public final void method436(int arg0, PlayerEntity arg1, int arg2, int arg3, int arg4) {
        this.field1165 += arg0;
        if (this.field1053 != arg1) {
            if (this.field1065 < 400) {
                String var6 = arg1.field349 + method387(arg1.field355, (byte) -102, this.field1053.field355) + " (level-" + arg1.field355 + ")";
                if (this.field1067 == 1) {
                    this.field1075[this.field1065] = "Use " + this.field1071 + " with @whi@" + var6;
                    this.field1203[this.field1065] = 933;
                    this.field1204[this.field1065] = arg2;
                    this.field1201[this.field1065] = arg4;
                    this.field1202[this.field1065] = arg3;
                    ++this.field1065;
                } else {
                    if (this.field1061 == 1) {
                        if ((this.field1063 & 8) == 8) {
                            this.field1075[this.field1065] = this.field1064 + " @whi@" + var6;
                            this.field1203[this.field1065] = 989;
                            this.field1204[this.field1065] = arg2;
                            this.field1201[this.field1065] = arg4;
                            this.field1202[this.field1065] = arg3;
                            ++this.field1065;
                            return;
                        }
                    } else {
                        this.field1075[this.field1065] = "Follow @whi@" + var6;
                        this.field1203[this.field1065] = 900;
                        this.field1204[this.field1065] = arg2;
                        this.field1201[this.field1065] = arg4;
                        this.field1202[this.field1065] = arg3;
                        ++this.field1065;
                        this.field1075[this.field1065] = "Trade with @whi@" + var6;
                        this.field1203[this.field1065] = 364;
                        this.field1204[this.field1065] = arg2;
                        this.field1201[this.field1065] = arg4;
                        this.field1202[this.field1065] = arg3;
                        ++this.field1065;
                        if (this.field1090 <= 0) {
                            return;
                        }
                        this.field1075[this.field1065] = "Attack @whi@" + var6;
                        this.field1203[this.field1065] = 487;
                        this.field1204[this.field1065] = arg2;
                        this.field1201[this.field1065] = arg4;
                        this.field1202[this.field1065] = arg3;
                        ++this.field1065;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)I")
    public final int method437(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 0) {
            field1031 = 226;
        }
        int var5 = 256 - arg2;
        return ((arg1 & 16711935) * var5 + (arg3 & 16711935) * arg2 & -16711936) + ((arg1 & 65280) * var5 + (arg3 & 65280) * arg2 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public static final void method438(int arg0) {
        World3D.field214 = false;
        Pix3D.field535 = false;
        field1018 = false;
        World.field35 = false;
        if (arg0 >= 0) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method439(int arg0) {
        for (int var2 = -1; var2 < this.field1107; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field1105;
            } else {
                var3 = this.field1108[var2];
            }
            PlayerEntity var4 = this.field1106[var3];
            if (var4 != null) {
                this.method407(true, 1, var4);
            }
        }
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method440(int arg0) {
        if (this.field1065 >= 2 || this.field1067 != 0 || this.field1061 != 0) {
            String var2;
            if (this.field1067 == 1 && this.field1065 < 2) {
                var2 = "Use " + this.field1071 + " with...";
            } else if (this.field1061 == 1 && this.field1065 < 2) {
                var2 = this.field1064 + "...";
            } else {
                var2 = this.field1075[this.field1065 - 1];
            }
            if (this.field1065 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1065 - 2) + " more options";
            }
            this.field1029.method187(-886, true, 4, 16777215, 15, var2);
            if (arg0 >= 0) {
                this.field1175 = -499;
            }
        }
    }

    @OriginalMember(owner = "client", name = "M", descriptor = "(I)V")
    public final void method441(int arg0) {
        this.field1261 = false;
        while (this.field1081) {
            this.field1261 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1315 = null;
        this.field1316 = null;
        this.field1269 = null;
        this.field1152 = null;
        this.field1153 = null;
        this.field1154 = null;
        this.field1155 = null;
        this.field1311 = null;
        this.field1312 = null;
        if (arg0 != -43634) {
            this.field1039 = this.field1001.method238();
        }
        this.field1150 = null;
        this.field1151 = null;
        this.field1042 = null;
        this.field1043 = null;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ILkb;I)V")
    private final void method442(int arg0, Packet arg1, int arg2) {
        arg1.method211(this.field1175);
        while (arg2 >= 0) {
            this.field1200 = 143;
        }
        int var4 = arg1.method212(1, (byte) -46);
        if (var4 != 0) {
            int var5 = arg1.method212(2, (byte) -46);
            if (var5 == 0) {
                this.field1110[this.field1109++] = this.field1105;
            } else if (var5 == 1) {
                int var6 = arg1.method212(3, (byte) -46);
                this.field1053.method107(false, var6, 112);
                int var7 = arg1.method212(1, (byte) -46);
                if (var7 == 1) {
                    this.field1110[this.field1109++] = this.field1105;
                }
            } else if (var5 == 2) {
                int var8 = arg1.method212(3, (byte) -46);
                this.field1053.method107(true, var8, 112);
                int var9 = arg1.method212(3, (byte) -46);
                this.field1053.method107(true, var9, 112);
                int var10 = arg1.method212(1, (byte) -46);
                if (var10 == 1) {
                    this.field1110[this.field1109++] = this.field1105;
                }
            } else if (var5 == 3) {
                this.field1077 = arg1.method212(2, (byte) -46);
                int var11 = arg1.method212(7, (byte) -46);
                int var12 = arg1.method212(7, (byte) -46);
                this.field1053.method106((byte) 28, var11, var12);
                int var13 = arg1.method212(1, (byte) -46);
                if (var13 == 1) {
                    this.field1110[this.field1109++] = this.field1105;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public final java.awt.Component method11(int arg0) {
        if (arg0 != -36374) {
            throw new NullPointerException();
        } else if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field16 != null ? super.field16 : this;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method443(byte arg0) {
        this.field1000.method227(-510);
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            this.field1020 = null;
        }
        Pix3D.field546 = this.field1289;
        this.field1048.method180(0, this.field1216, 0);
        if (this.field1094) {
            this.field1029.method182(true, 40, 0, 239, this.field1050);
            this.field1029.method182(true, 60, 128, 239, this.field1242 + "*");
        } else if (this.field1118) {
            this.field1029.method182(true, 40, 0, 239, "Enter amount to transfer:");
            this.field1029.method182(true, 60, 128, 239, this.field1302 + "*");
        } else if (this.field1057 != -1) {
            this.method378(this.field1125, Component.field870[this.field1057], 0, 0, 0);
        } else {
            int var3 = 0;
            Pix2D.method143(77, 463, 0, 0, 17913);
            for (int var4 = 0; var4 < 50; ++var4) {
                if (this.field1169[var4] != null) {
                    int var5 = this.field1017[var4];
                    int var6 = 70 - var3 * 14 + this.field1091;
                    if (var5 == 0) {
                        if (var6 > 0 && var6 < 110) {
                            this.field1030.method185(this.field1169[var4], 4, 0, true, var6);
                        }
                        ++var3;
                    }
                    if (var5 == 1) {
                        if (var6 > 0 && var6 < 110) {
                            this.field1030.method185(this.field1225[var4] + ":", 4, 16777215, true, var6);
                            this.field1030.method185(this.field1169[var4], 12 + this.field1030.method184(this.field1225[var4], true), 255, true, var6);
                        }
                        ++var3;
                    }
                    if (var5 == 2 && (this.field1331 == 0 || this.field1331 == 1 && this.method397(7, this.field1225[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            this.field1030.method185(this.field1225[var4] + ":", 4, 0, true, var6);
                            this.field1030.method185(this.field1169[var4], 12 + this.field1030.method184(this.field1225[var4], true), 255, true, var6);
                        }
                        ++var3;
                    }
                    if (var5 == 3 && (this.field1117 == 0 || this.field1117 == 1 && this.method397(7, this.field1225[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            this.field1030.method185("From " + this.field1225[var4] + ":", 4, 0, true, var6);
                            this.field1030.method185(this.field1169[var4], 12 + this.field1030.method184("From " + this.field1225[var4], true), 8388608, true, var6);
                        }
                        ++var3;
                    }
                    if (var5 == 4 && (this.field1176 == 0 || this.field1176 == 1 && this.method397(7, this.field1225[var4]))) {
                        if (var6 > 0 && var6 < 110) {
                            this.field1030.method185(this.field1225[var4] + " " + this.field1169[var4], 4, 8388736, true, var6);
                        }
                        ++var3;
                    }
                    if (var5 == 5 && this.field1117 < 2) {
                        if (var6 > 0 && var6 < 110) {
                            this.field1030.method185(this.field1169[var4], 4, 8388608, true, var6);
                        }
                        ++var3;
                    }
                    if (var5 == 6 && this.field1117 < 2) {
                        if (var6 > 0 && var6 < 110) {
                            this.field1030.method185("To " + this.field1225[var4] + ":", 4, 0, true, var6);
                            this.field1030.method185(this.field1169[var4], 12 + this.field1030.method184("To " + this.field1225[var4], true), 8388608, true, var6);
                        }
                        ++var3;
                    }
                }
            }
            Pix2D.method142(-971);
            this.field1032 = var3 * 14 + 7;
            if (this.field1032 < 78) {
                this.field1032 = 78;
            }
            this.method421(0, false, 463, this.field1032, this.field1032 - this.field1091 - 77, 77);
            this.field1030.method185(this.field1139 + "*", 3, 0, true, 90);
            Pix2D.method147(479, false, 0, 77, 0);
        }
        this.field1000.method228(22, super.field13, 375, this.field1285);
        this.field999.method227(-510);
        Pix3D.field546 = this.field1291;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field1033[var1] = var0 / 4;
        }
        field1049 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field1115 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field1141 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field1190 = true;
        field1293 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
    }
}
