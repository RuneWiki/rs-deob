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

@OriginalClass("client")
public class client extends GameShell {

    @OriginalMember(owner = "client", name = "D", descriptor = "[Ljava/lang/String;")
    private String[] field978 = new String[500];

    @OriginalMember(owner = "client", name = "E", descriptor = "[Lgb;")
    private Pix32[] field979 = new Pix32[20];

    @OriginalMember(owner = "client", name = "F", descriptor = "Z")
    private boolean field980 = false;

    @OriginalMember(owner = "client", name = "I", descriptor = "[I")
    private int[] field983 = new int[151];

    @OriginalMember(owner = "client", name = "J", descriptor = "[I")
    private int[] field984 = new int[50];

    @OriginalMember(owner = "client", name = "K", descriptor = "[Lac;")
    private CollisionMap[] field985 = new CollisionMap[4];

    @OriginalMember(owner = "client", name = "S", descriptor = "Z")
    private boolean field993 = false;

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field996 = 90;

    @OriginalMember(owner = "client", name = "X", descriptor = "[Lgb;")
    private Pix32[] field998 = new Pix32[20];

    @OriginalMember(owner = "client", name = "eb", descriptor = "[I")
    private int[] field1005 = new int[8];

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field1006 = -1;

    @OriginalMember(owner = "client", name = "gb", descriptor = "I")
    private int field1007 = -1;

    @OriginalMember(owner = "client", name = "hb", descriptor = "I")
    private int field1008 = 383;

    @OriginalMember(owner = "client", name = "jb", descriptor = "[I")
    private int[] field1010 = new int[1000];

    @OriginalMember(owner = "client", name = "kb", descriptor = "[I")
    private int[] field1011 = new int[1000];

    @OriginalMember(owner = "client", name = "mb", descriptor = "Z")
    private boolean field1013 = false;

    @OriginalMember(owner = "client", name = "rb", descriptor = "Z")
    private boolean field1018 = false;

    @OriginalMember(owner = "client", name = "sb", descriptor = "Z")
    private boolean field1019 = false;

    @OriginalMember(owner = "client", name = "tb", descriptor = "[[I")
    private int[][] field1020 = new int[104][104];

    @OriginalMember(owner = "client", name = "vb", descriptor = "Lnb;")
    private LinkList field1022 = new LinkList(845);

    @OriginalMember(owner = "client", name = "wb", descriptor = "Z")
    private boolean field1023 = false;

    @OriginalMember(owner = "client", name = "xb", descriptor = "Ldc;")
    private Component field1024 = new Component();

    @OriginalMember(owner = "client", name = "yb", descriptor = "Z")
    private boolean field1025 = false;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "Ljb;")
    private Packet field1043 = Packet.method176(-836, 1);

    @OriginalMember(owner = "client", name = "Rb", descriptor = "Lnb;")
    private LinkList field1044 = new LinkList(845);

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field1045 = -1;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "B")
    private byte field1050 = 103;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field1051 = -1;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "B")
    private byte field1052 = 5;

    @OriginalMember(owner = "client", name = "ac", descriptor = "Z")
    private boolean field1053 = false;

    @OriginalMember(owner = "client", name = "bc", descriptor = "Z")
    private boolean field1054 = false;

    @OriginalMember(owner = "client", name = "cc", descriptor = "Ljb;")
    private Packet field1055 = Packet.method176(-836, 1);

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    private int field1056 = -1;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    private int field1057 = 2301979;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field1059 = 3;

    @OriginalMember(owner = "client", name = "sc", descriptor = "Z")
    private boolean field1071 = false;

    @OriginalMember(owner = "client", name = "tc", descriptor = "Z")
    private boolean field1072 = true;

    @OriginalMember(owner = "client", name = "xc", descriptor = "Z")
    private boolean field1076 = false;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1080 = new CRC32();

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field1081 = 2048;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private int field1082 = 2047;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "[Ly;")
    private PlayerEntity[] field1083 = new PlayerEntity[this.field1081];

    @OriginalMember(owner = "client", name = "Gc", descriptor = "[I")
    public int[] field1085 = new int[this.field1081];

    @OriginalMember(owner = "client", name = "Hc", descriptor = "[I")
    private int[] field1086 = new int[this.field1081];

    @OriginalMember(owner = "client", name = "Ic", descriptor = "[Ljb;")
    private Packet[] field1087 = new Packet[this.field1081];

    @OriginalMember(owner = "client", name = "Lc", descriptor = "[Ljava/lang/String;")
    private String[] field1090 = new String[100];

    @OriginalMember(owner = "client", name = "Nc", descriptor = "[I")
    private int[] field1092 = new int[7];

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private int field1094 = 4;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field1095 = 128;

    @OriginalMember(owner = "client", name = "bd", descriptor = "Z")
    private boolean field1106 = true;

    @OriginalMember(owner = "client", name = "cd", descriptor = "Z")
    private boolean field1107 = false;

    @OriginalMember(owner = "client", name = "id", descriptor = "I")
    private final int field1113 = 100;

    @OriginalMember(owner = "client", name = "jd", descriptor = "[I")
    private int[] field1114 = new int[100];

    @OriginalMember(owner = "client", name = "kd", descriptor = "[I")
    private final int[] field1115 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "ld", descriptor = "[I")
    private int[] field1116 = new int[500];

    @OriginalMember(owner = "client", name = "md", descriptor = "[I")
    private int[] field1117 = new int[500];

    @OriginalMember(owner = "client", name = "nd", descriptor = "[I")
    private int[] field1118 = new int[500];

    @OriginalMember(owner = "client", name = "od", descriptor = "[I")
    private int[] field1119 = new int[500];

    @OriginalMember(owner = "client", name = "pd", descriptor = "B")
    private byte field1120 = 5;

    @OriginalMember(owner = "client", name = "rd", descriptor = "[I")
    private int[] field1122 = new int[33];

    @OriginalMember(owner = "client", name = "sd", descriptor = "[[I")
    private int[][] field1123 = new int[104][104];

    @OriginalMember(owner = "client", name = "td", descriptor = "[Lgb;")
    private Pix32[] field1124 = new Pix32[50];

    @OriginalMember(owner = "client", name = "ud", descriptor = "Ljava/lang/String;")
    private String field1125 = "";

    @OriginalMember(owner = "client", name = "vd", descriptor = "Ljava/lang/String;")
    private String field1126 = "";

    @OriginalMember(owner = "client", name = "wd", descriptor = "Ljava/lang/String;")
    private String field1127 = "";

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field1129 = 2;

    @OriginalMember(owner = "client", name = "zd", descriptor = "[I")
    private int[] field1130 = new int[33];

    @OriginalMember(owner = "client", name = "Ad", descriptor = "Z")
    private boolean field1131 = false;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "[I")
    private int[] field1132 = new int[50];

    @OriginalMember(owner = "client", name = "Cd", descriptor = "[B")
    private byte[] field1133 = new byte[16384];

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field1138 = 3353893;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "Z")
    private boolean field1140 = false;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "Z")
    private boolean field1141 = true;

    @OriginalMember(owner = "client", name = "Md", descriptor = "[I")
    private int[] field1143 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "Od", descriptor = "[Lgb;")
    private Pix32[] field1145 = new Pix32[1000];

    @OriginalMember(owner = "client", name = "Pd", descriptor = "[I")
    private int[] field1146 = new int[256];

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[I")
    private int[] field1147 = new int[50];

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private int field1148 = -958;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "I")
    private int field1151 = 2;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "[[[Lnb;")
    private LinkList[][][] field1152 = new LinkList[4][104][104];

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field1155 = 1;

    @OriginalMember(owner = "client", name = "he", descriptor = "Ljava/lang/String;")
    private String field1164 = "";

    @OriginalMember(owner = "client", name = "ie", descriptor = "Ljava/lang/String;")
    private String field1165 = "";

    @OriginalMember(owner = "client", name = "ke", descriptor = "Z")
    private boolean field1167 = true;

    @OriginalMember(owner = "client", name = "me", descriptor = "[I")
    private int[] field1169 = new int[5];

    @OriginalMember(owner = "client", name = "pe", descriptor = "Z")
    private boolean field1172 = false;

    @OriginalMember(owner = "client", name = "te", descriptor = "[I")
    private int[] field1176 = new int[100];

    @OriginalMember(owner = "client", name = "ue", descriptor = "Ljb;")
    private Packet field1177 = Packet.method176(-836, 1);

    @OriginalMember(owner = "client", name = "ve", descriptor = "[J")
    private long[] field1178 = new long[100];

    @OriginalMember(owner = "client", name = "xe", descriptor = "[I")
    public int[] field1180 = new int[1000];

    @OriginalMember(owner = "client", name = "Ge", descriptor = "Z")
    private boolean field1189 = false;

    @OriginalMember(owner = "client", name = "He", descriptor = "I")
    private int field1190 = 268;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "Z")
    private boolean field1191 = false;

    @OriginalMember(owner = "client", name = "Je", descriptor = "[I")
    private int[] field1192 = new int[4000];

    @OriginalMember(owner = "client", name = "Ke", descriptor = "[I")
    private int[] field1193 = new int[4000];

    @OriginalMember(owner = "client", name = "Pe", descriptor = "I")
    private int field1198 = 10;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "[Ljava/lang/String;")
    private String[] field1199 = new String[100];

    @OriginalMember(owner = "client", name = "Re", descriptor = "[I")
    private int[] field1200 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "Ve", descriptor = "[I")
    private int[] field1204 = new int[151];

    @OriginalMember(owner = "client", name = "Xe", descriptor = "B")
    private byte field1206 = -21;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field1208 = -449;

    @OriginalMember(owner = "client", name = "af", descriptor = "Lnb;")
    private LinkList field1209 = new LinkList(845);

    @OriginalMember(owner = "client", name = "gf", descriptor = "Lnb;")
    private LinkList field1215 = new LinkList(845);

    @OriginalMember(owner = "client", name = "hf", descriptor = "[Lgb;")
    private Pix32[] field1216 = new Pix32[8];

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field1217 = -1;

    @OriginalMember(owner = "client", name = "pf", descriptor = "Z")
    private boolean field1223 = false;

    @OriginalMember(owner = "client", name = "tf", descriptor = "Ljava/lang/String;")
    private String field1227 = "127.0.0.1";

    @OriginalMember(owner = "client", name = "uf", descriptor = "Z")
    private boolean field1228 = false;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field1229 = -36905;

    @OriginalMember(owner = "client", name = "wf", descriptor = "[[I")
    private int[][] field1230 = new int[104][104];

    @OriginalMember(owner = "client", name = "Hf", descriptor = "Z")
    private boolean field1241 = false;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private int field1242 = 7759444;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "[Lhb;")
    private Pix8[] field1243 = new Pix8[50];

    @OriginalMember(owner = "client", name = "Kf", descriptor = "Lnb;")
    private LinkList field1244 = new LinkList(845);

    @OriginalMember(owner = "client", name = "Lf", descriptor = "Ljava/lang/String;")
    private String field1245 = "";

    @OriginalMember(owner = "client", name = "Mf", descriptor = "Ljava/lang/String;")
    private String field1246 = "";

    @OriginalMember(owner = "client", name = "Nf", descriptor = "Ljava/lang/String;")
    private String field1247 = "";

    @OriginalMember(owner = "client", name = "Of", descriptor = "Z")
    private boolean field1248 = false;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "I")
    private int field1256 = 5063219;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field1261 = 78;

    @OriginalMember(owner = "client", name = "cg", descriptor = "Ljava/lang/String;")
    private String field1262 = "";

    @OriginalMember(owner = "client", name = "dg", descriptor = "Z")
    private boolean field1263 = false;

    @OriginalMember(owner = "client", name = "eg", descriptor = "I")
    private int field1264 = -1;

    @OriginalMember(owner = "client", name = "sg", descriptor = "[Ljava/lang/String;")
    private String[] field1278 = new String[100];

    @OriginalMember(owner = "client", name = "ug", descriptor = "Z")
    private boolean field1280 = false;

    @OriginalMember(owner = "client", name = "vg", descriptor = "[Lx;")
    private NpcEntity[] field1281 = new NpcEntity[8192];

    @OriginalMember(owner = "client", name = "xg", descriptor = "[I")
    public int[] field1283 = new int[8192];

    @OriginalMember(owner = "client", name = "yg", descriptor = "[I")
    private int[] field1284 = new int[2000];

    @OriginalMember(owner = "client", name = "zg", descriptor = "[I")
    private int[] field1285 = new int[100];

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private int field1293 = -12807;

    @OriginalMember(owner = "client", name = "N", descriptor = "[I")
    public static final int[] field988 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client", name = "O", descriptor = "Ljava/lang/String;")
    private static String field989 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "lb", descriptor = "Z")
    private static boolean field1012 = true;

    @OriginalMember(owner = "client", name = "Db", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1030 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "lc", descriptor = "Z")
    private static boolean field1064 = true;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field1088 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client", name = "je", descriptor = "[I")
    private static int[] field1166 = new int[99];

    @OriginalMember(owner = "client", name = "Se", descriptor = "[[I")
    public static final int[][] field1201;

    @OriginalMember(owner = "client", name = "db", descriptor = "I")
    private int field1004;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field1009;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field1028;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field1029;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "I")
    private static int field1031;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field1032;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "client", name = "fc", descriptor = "I")
    private int field1058;

    @OriginalMember(owner = "client", name = "hc", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "client", name = "ic", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "client", name = "jc", descriptor = "I")
    private int field1062;

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field1063;

    @OriginalMember(owner = "client", name = "mc", descriptor = "I")
    private int field1065;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field1066;

    @OriginalMember(owner = "client", name = "oc", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "client", name = "pc", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field1069;

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field1073;

    @OriginalMember(owner = "client", name = "vc", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "client", name = "wc", descriptor = "I")
    private int field1075;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field1078;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field1079;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field1084;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field1089;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private int field1091;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "I")
    private int field1093;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field1096;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "I")
    private int field1097;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field1098;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "I")
    private int field1099;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field1100;

    @OriginalMember(owner = "client", name = "Wc", descriptor = "I")
    private int field1101;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field1102;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private int field1108;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field1112;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field1121;

    @OriginalMember(owner = "client", name = "xd", descriptor = "I")
    private int field1128;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field1144;

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field1149;

    @OriginalMember(owner = "client", name = "Td", descriptor = "I")
    private int field1150;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "I")
    private int field1154;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field1159;

    @OriginalMember(owner = "client", name = "de", descriptor = "I")
    private int field1160;

    @OriginalMember(owner = "client", name = "ee", descriptor = "I")
    private int field1161;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field1162;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field1163;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private int field1168;

    @OriginalMember(owner = "client", name = "ne", descriptor = "I")
    private int field1170;

    @OriginalMember(owner = "client", name = "oe", descriptor = "I")
    private int field1171;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field1173;

    @OriginalMember(owner = "client", name = "re", descriptor = "I")
    private int field1174;

    @OriginalMember(owner = "client", name = "se", descriptor = "I")
    private int field1175;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field1179;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field1181;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field1182;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "I")
    private int field1183;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field1184;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field1185;

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field1186;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field1187;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field1188;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field1194;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field1195;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field1196;

    @OriginalMember(owner = "client", name = "We", descriptor = "I")
    private int field1205;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field1207;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field1211;

    @OriginalMember(owner = "client", name = "df", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field1213;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field1251;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "I")
    private int field1252;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "I")
    private int field1253;

    @OriginalMember(owner = "client", name = "Uf", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "I")
    private int field1255;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field1265;

    @OriginalMember(owner = "client", name = "gg", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client", name = "ig", descriptor = "I")
    private int field1268;

    @OriginalMember(owner = "client", name = "jg", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client", name = "kg", descriptor = "I")
    private int field1270;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field1271;

    @OriginalMember(owner = "client", name = "mg", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "client", name = "ng", descriptor = "I")
    private int field1273;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field1274;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field1275;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field1282;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field1292;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field995;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field997;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "J")
    private long field1286;

    @OriginalMember(owner = "client", name = "yc", descriptor = "Ld;")
    private ClientStream field1077;

    @OriginalMember(owner = "client", name = "ub", descriptor = "Lsb;")
    private Isaac field1021;

    @OriginalMember(owner = "client", name = "hg", descriptor = "Ltb;")
    private Jagfile field1267;

    @OriginalMember(owner = "client", name = "zb", descriptor = "Lgb;")
    private Pix32 field1026;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "Lgb;")
    private Pix32 field1027;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "Lgb;")
    private Pix32 field1156;

    @OriginalMember(owner = "client", name = "ae", descriptor = "Lgb;")
    private Pix32 field1157;

    @OriginalMember(owner = "client", name = "be", descriptor = "Lgb;")
    private Pix32 field1158;

    @OriginalMember(owner = "client", name = "Te", descriptor = "Lgb;")
    private Pix32 field1202;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "Lgb;")
    private Pix32 field1203;

    @OriginalMember(owner = "client", name = "ff", descriptor = "Lgb;")
    private Pix32 field1214;

    @OriginalMember(owner = "client", name = "tg", descriptor = "Lgb;")
    private Pix32 field1279;

    @OriginalMember(owner = "client", name = "nb", descriptor = "Lhb;")
    private Pix8 field1014;

    @OriginalMember(owner = "client", name = "ob", descriptor = "Lhb;")
    private Pix8 field1015;

    @OriginalMember(owner = "client", name = "pb", descriptor = "Lhb;")
    private Pix8 field1016;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "Lhb;")
    private Pix8 field1104;

    @OriginalMember(owner = "client", name = "ad", descriptor = "Lhb;")
    private Pix8 field1105;

    @OriginalMember(owner = "client", name = "kf", descriptor = "Lhb;")
    private Pix8 field1218;

    @OriginalMember(owner = "client", name = "lf", descriptor = "Lhb;")
    private Pix8 field1219;

    @OriginalMember(owner = "client", name = "mf", descriptor = "Lhb;")
    private Pix8 field1220;

    @OriginalMember(owner = "client", name = "nf", descriptor = "Lhb;")
    private Pix8 field1221;

    @OriginalMember(owner = "client", name = "of", descriptor = "Lhb;")
    private Pix8 field1222;

    @OriginalMember(owner = "client", name = "qg", descriptor = "Lhb;")
    private Pix8 field1276;

    @OriginalMember(owner = "client", name = "rg", descriptor = "Lhb;")
    private Pix8 field1277;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "Lhb;")
    private Pix8 field1287;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "Lhb;")
    private Pix8 field1288;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "Lhb;")
    private Pix8 field1289;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "Lhb;")
    private Pix8 field1290;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "Lhb;")
    private Pix8 field1291;

    @OriginalMember(owner = "client", name = "L", descriptor = "Lhb;")
    private Pix8 field986;

    @OriginalMember(owner = "client", name = "M", descriptor = "Lhb;")
    private Pix8 field987;

    @OriginalMember(owner = "client", name = "P", descriptor = "Lhb;")
    private Pix8 field990;

    @OriginalMember(owner = "client", name = "Q", descriptor = "Lhb;")
    private Pix8 field991;

    @OriginalMember(owner = "client", name = "R", descriptor = "Lhb;")
    private Pix8 field992;

    @OriginalMember(owner = "client", name = "Z", descriptor = "Lib;")
    private PixFont field1000;

    @OriginalMember(owner = "client", name = "ab", descriptor = "Lib;")
    private PixFont field1001;

    @OriginalMember(owner = "client", name = "bb", descriptor = "Lib;")
    private PixFont field1002;

    @OriginalMember(owner = "client", name = "Y", descriptor = "Lib;")
    private PixFont field999;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "Lpb;")
    private PixMap field1034;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "Lpb;")
    private PixMap field1035;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "Lpb;")
    private PixMap field1036;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "Lpb;")
    private PixMap field1037;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "Lpb;")
    private PixMap field1038;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "Lpb;")
    private PixMap field1039;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "Lpb;")
    private PixMap field1040;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "Lpb;")
    private PixMap field1041;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "Lpb;")
    private PixMap field1042;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "Lpb;")
    private PixMap field1134;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "Lpb;")
    private PixMap field1135;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "Lpb;")
    private PixMap field1136;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "Lpb;")
    private PixMap field1137;

    @OriginalMember(owner = "client", name = "qf", descriptor = "Lpb;")
    private PixMap field1224;

    @OriginalMember(owner = "client", name = "rf", descriptor = "Lpb;")
    private PixMap field1225;

    @OriginalMember(owner = "client", name = "sf", descriptor = "Lpb;")
    private PixMap field1226;

    @OriginalMember(owner = "client", name = "xf", descriptor = "Lpb;")
    private PixMap field1231;

    @OriginalMember(owner = "client", name = "yf", descriptor = "Lpb;")
    private PixMap field1232;

    @OriginalMember(owner = "client", name = "zf", descriptor = "Lpb;")
    private PixMap field1233;

    @OriginalMember(owner = "client", name = "Af", descriptor = "Lpb;")
    private PixMap field1234;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "Lpb;")
    private PixMap field1235;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "Lpb;")
    private PixMap field1236;

    @OriginalMember(owner = "client", name = "Df", descriptor = "Lpb;")
    private PixMap field1237;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "Lpb;")
    private PixMap field1238;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "Lpb;")
    private PixMap field1239;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "Lpb;")
    private PixMap field1240;

    @OriginalMember(owner = "client", name = "Id", descriptor = "Ly;")
    private PlayerEntity field1139;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "Lq;")
    private World3D field1153;

    @OriginalMember(owner = "client", name = "rc", descriptor = "Ljava/lang/String;")
    public String field1070;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "Ljava/lang/String;")
    public String field1197;

    @OriginalMember(owner = "client", name = "bf", descriptor = "Ljava/lang/String;")
    private String field1210;

    @OriginalMember(owner = "client", name = "cb", descriptor = "Z")
    private static boolean field1003;

    @OriginalMember(owner = "client", name = "qb", descriptor = "[I")
    private int[] field1017;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "[I")
    private int[] field1046;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "[I")
    private int[] field1047;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "[I")
    private int[] field1048;

    @OriginalMember(owner = "client", name = "ed", descriptor = "[I")
    private int[] field1109;

    @OriginalMember(owner = "client", name = "fd", descriptor = "[I")
    private int[] field1110;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "[I")
    private int[] field1257;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "[I")
    private int[] field1258;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "[I")
    private int[] field1259;

    @OriginalMember(owner = "client", name = "ag", descriptor = "[I")
    private int[] field1260;

    @OriginalMember(owner = "client", name = "G", descriptor = "[I")
    private int[] field981;

    @OriginalMember(owner = "client", name = "H", descriptor = "[I")
    private int[] field982;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "[Lhb;")
    private Pix8[] field1033;

    @OriginalMember(owner = "client", name = "gd", descriptor = "[[B")
    private byte[][] field1111;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "[[B")
    private byte[][] field1142;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "[[[B")
    private byte[][][] field1250;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "[[[I")
    private int[][][] field1103;

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            signlink.startpriv(InetAddress.getLocalHost());
            client var1 = new client();
            if (arg0.length > 0) {
                var1.field1198 = Integer.parseInt(arg0[0]);
            }
            if (arg0.length > 1) {
                var1.field1187 = Integer.parseInt(arg0[1]);
            }
            if (arg0.length > 2 && arg0[2].equalsIgnoreCase("lowmem")) {
                method324(0);
            } else {
                method325(216);
            }
            var1.method1(532, (byte) 4, 789);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        this.field1187 = Integer.parseInt(this.getParameter("portoff"));
        this.field1198 = Integer.parseInt(this.getParameter("nodeid"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method324(0);
        } else {
            method325(216);
        }
        this.method2(532, (byte) 104, 789);
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public static final void method324(int arg0) {
        World3D.field202 = true;
        Pix3D.field520 = true;
        if (arg0 != 0) {
            field1031 = -45;
        }
        field1012 = true;
        World.field35 = true;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public static final void method325(int arg0) {
        int var1 = 50 / arg0;
        World3D.field202 = false;
        Pix3D.field520 = false;
        field1012 = false;
        World.field35 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method6() {
        if (signlink.sunjava) {
            super.field8 = 5;
        }
        signlink.midi = "scape_main";
        if (field1003) {
            this.field1053 = true;
        } else {
            field1003 = true;
            boolean var1 = false;
            String var2 = this.method396(0);
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
                this.field1280 = true;
            } else {
                try {
                    int var3 = 5;
                    this.field1005[7] = 0;
                    while (this.field1005[7] == 0) {
                        this.method13("Connecting to fileserver", 10, false);
                        try {
                            DataInputStream var4 = this.method397("crc" + (int) (Math.random() * 9.9999999E7D));
                            Packet var5 = new Packet(new byte[32], (byte) 63);
                            var4.readFully(var5.field585, 0, 32);
                            for (int var6 = 0; var6 < 8; ++var6) {
                                this.field1005[var6] = var5.method190();
                            }
                            var4.close();
                        } catch (IOException var50) {
                            for (int var7 = var3; var7 > 0; --var7) {
                                this.method13("Error loading - Will retry in " + var7 + " secs.", 10, false);
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
                    this.field1267 = this.method326("title", 5, "title screen", 10, this.field1005[1]);
                    this.field999 = new PixFont("p11", this.field1267, false);
                    this.field1000 = new PixFont("p12", this.field1267, false);
                    this.field1001 = new PixFont("b12", this.field1267, false);
                    this.field1002 = new PixFont("q8", this.field1267, false);
                    this.method327(5);
                    this.method332(field1064);
                    Jagfile var8 = this.method326("config", 5, "config", 20, this.field1005[2]);
                    Jagfile var9 = this.method326("interface", 5, "interface", 30, this.field1005[3]);
                    Jagfile var10 = this.method326("media", 5, "2d graphics", 40, this.field1005[4]);
                    Jagfile var11 = this.method326("models", 5, "3d graphics", 50, this.field1005[5]);
                    Jagfile var12 = this.method326("textures", 5, "textures", 60, this.field1005[6]);
                    Jagfile var13 = this.method326("wordenc", 5, "chat system", 70, this.field1005[7]);
                    this.field1250 = new byte[4][104][104];
                    this.field1103 = new int[4][105][105];
                    this.field1153 = new World3D(4, this.field1103, 104, (byte) 4, 104);
                    for (int var14 = 0; var14 < 4; ++var14) {
                        this.field985[var14] = new CollisionMap(104, -242, 104);
                    }
                    this.field1279 = new Pix32(512, 512, 0);
                    this.method13("Unpacking media", 80, false);
                    this.field990 = new Pix8(0, var10, "invback", 0);
                    this.field992 = new Pix8(0, var10, "chatback", 0);
                    this.field991 = new Pix8(0, var10, "mapback", 0);
                    this.field1014 = new Pix8(0, var10, "backbase1", 0);
                    this.field1015 = new Pix8(0, var10, "backbase2", 0);
                    this.field1016 = new Pix8(0, var10, "backhmid1", 0);
                    this.field1276 = new Pix8(0, var10, "sideicons1", 0);
                    this.field1277 = new Pix8(0, var10, "sideicons2", 0);
                    this.field1214 = new Pix32("compass", 154, 0, var10);
                    try {
                        for (int var15 = 0; var15 < 50; ++var15) {
                            this.field1243[var15] = new Pix8(0, var10, "mapscene", var15);
                        }
                    } catch (Exception var49) {
                    }
                    try {
                        for (int var16 = 0; var16 < 50; ++var16) {
                            this.field1124[var16] = new Pix32("mapfunction", 154, var16, var10);
                        }
                    } catch (Exception var48) {
                    }
                    try {
                        for (int var17 = 0; var17 < 20; ++var17) {
                            this.field998[var17] = new Pix32("hitmarks", 154, var17, var10);
                        }
                    } catch (Exception var47) {
                    }
                    try {
                        for (int var18 = 0; var18 < 20; ++var18) {
                            this.field979[var18] = new Pix32("headicons", 154, var18, var10);
                        }
                    } catch (Exception var46) {
                    }
                    for (int var19 = 0; var19 < 8; ++var19) {
                        this.field1216[var19] = new Pix32("cross", 154, var19, var10);
                    }
                    this.field1156 = new Pix32("mapdots", 154, 0, var10);
                    this.field1157 = new Pix32("mapdots", 154, 1, var10);
                    this.field1158 = new Pix32("mapdots", 154, 2, var10);
                    this.field986 = new Pix8(0, var10, "scrollbar", 0);
                    this.field987 = new Pix8(0, var10, "scrollbar", 1);
                    this.field1287 = new Pix8(0, var10, "redstone1", 0);
                    this.field1288 = new Pix8(0, var10, "redstone2", 0);
                    this.field1289 = new Pix8(0, var10, "redstone3", 0);
                    this.field1290 = new Pix8(0, var10, "redstone1", 0);
                    this.field1290.method164(5);
                    this.field1291 = new Pix8(0, var10, "redstone2", 0);
                    this.field1291.method164(5);
                    this.field1218 = new Pix8(0, var10, "redstone1", 0);
                    this.field1218.method165(409);
                    this.field1219 = new Pix8(0, var10, "redstone2", 0);
                    this.field1219.method165(409);
                    this.field1220 = new Pix8(0, var10, "redstone3", 0);
                    this.field1220.method165(409);
                    this.field1221 = new Pix8(0, var10, "redstone1", 0);
                    this.field1221.method164(5);
                    this.field1221.method165(409);
                    this.field1222 = new Pix8(0, var10, "redstone2", 0);
                    this.field1222.method164(5);
                    this.field1222.method165(409);
                    Pix32 var20 = new Pix32("backleft1", 154, 0, var10);
                    this.field1231 = new PixMap(var20.field549, 604, var20.field548, this.method11((byte) 8));
                    var20.method153(false, 0, 0);
                    Pix32 var21 = new Pix32("backleft2", 154, 0, var10);
                    this.field1232 = new PixMap(var21.field549, 604, var21.field548, this.method11((byte) 8));
                    var21.method153(false, 0, 0);
                    Pix32 var22 = new Pix32("backright1", 154, 0, var10);
                    this.field1233 = new PixMap(var22.field549, 604, var22.field548, this.method11((byte) 8));
                    var22.method153(false, 0, 0);
                    Pix32 var23 = new Pix32("backright2", 154, 0, var10);
                    this.field1234 = new PixMap(var23.field549, 604, var23.field548, this.method11((byte) 8));
                    var23.method153(false, 0, 0);
                    Pix32 var24 = new Pix32("backtop1", 154, 0, var10);
                    this.field1235 = new PixMap(var24.field549, 604, var24.field548, this.method11((byte) 8));
                    var24.method153(false, 0, 0);
                    Pix32 var25 = new Pix32("backtop2", 154, 0, var10);
                    this.field1236 = new PixMap(var25.field549, 604, var25.field548, this.method11((byte) 8));
                    var25.method153(false, 0, 0);
                    Pix32 var26 = new Pix32("backvmid1", 154, 0, var10);
                    this.field1237 = new PixMap(var26.field549, 604, var26.field548, this.method11((byte) 8));
                    var26.method153(false, 0, 0);
                    Pix32 var27 = new Pix32("backvmid2", 154, 0, var10);
                    this.field1238 = new PixMap(var27.field549, 604, var27.field548, this.method11((byte) 8));
                    var27.method153(false, 0, 0);
                    Pix32 var28 = new Pix32("backvmid3", 154, 0, var10);
                    this.field1239 = new PixMap(var28.field549, 604, var28.field548, this.method11((byte) 8));
                    var28.method153(false, 0, 0);
                    Pix32 var29 = new Pix32("backhmid2", 154, 0, var10);
                    this.field1240 = new PixMap(var29.field549, 604, var29.field548, this.method11((byte) 8));
                    var29.method153(false, 0, 0);
                    this.method13("Unpacking textures", 85, false);
                    Pix3D.method140(-377, var12);
                    Pix3D.method144(-217, 0.8D);
                    Pix3D.method139(20, (byte) 2);
                    this.method13("Unpacking models", 85, false);
                    Model.method104(var11, 0);
                    AnimBase.method33((byte) 4, var11);
                    AnimFrame.method34((byte) 4, var11);
                    this.method13("Unpacking config", 85, false);
                    SeqType.method279(var8, -47511);
                    LocType.method235(var8);
                    FloType.method268(var8, -47511);
                    ObjType.method247(var8);
                    NpcType.method241(var8);
                    IdkType.method271(var8, -47511);
                    SpotAnimType.method281(var8, -47511);
                    VarpType.method284(var8, -47511);
                    this.method13("Unpacking interfaces", 90, false);
                    PixFont[] var30 = new PixFont[] { this.field999, this.field1000, this.field1001, this.field1002 };
                    Component.method275(var30, var10, (byte) -60, var9);
                    this.method13("Preparing game engine", 95, false);
                    for (int var31 = 0; var31 < 33; ++var31) {
                        int var32 = 999;
                        int var33 = 0;
                        for (int var34 = 0; var34 < 35; ++var34) {
                            if (this.field991.field557[this.field991.field559 * var31 + var34] == 0) {
                                if (var32 == 999) {
                                    var32 = var34;
                                }
                            } else if (var32 != 999) {
                                var33 = var34;
                                break;
                            }
                        }
                        this.field1122[var31] = var32;
                        this.field1130[var31] = var33 - var32;
                    }
                    for (int var35 = 9; var35 < 160; ++var35) {
                        int var36 = 999;
                        int var37 = 0;
                        for (int var38 = 10; var38 < 168; ++var38) {
                            if (this.field991.field557[this.field991.field559 * var35 + var38] != 0 || var38 <= 34 && var35 <= 34) {
                                if (var36 != 999) {
                                    var37 = var38;
                                    break;
                                }
                            } else if (var36 == 999) {
                                var36 = var38;
                            }
                        }
                        this.field1204[var35 - 9] = var36 - 21;
                        this.field983[var35 - 9] = var37 - var36;
                    }
                    Pix3D.method137(479, 96, (byte) -44);
                    this.field1046 = Pix3D.field531;
                    Pix3D.method137(190, 261, (byte) -44);
                    this.field1047 = Pix3D.field531;
                    Pix3D.method137(512, 334, (byte) -44);
                    this.field1048 = Pix3D.field531;
                    int[] var39 = new int[9];
                    for (int var40 = 0; var40 < 9; ++var40) {
                        int var41 = var40 * 32 + 128 + 15;
                        int var42 = var41 * 3 + 600;
                        int var43 = Pix3D.field529[var41];
                        var39[var40] = var42 * var43 >> 16;
                    }
                    World3D.method69(0, 334, 512, 800, var39, 500);
                    WordFilter.method286(var13);
                } catch (Exception var51) {
                    this.field1248 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;II)Ltb;")
    public final Jagfile method326(String arg0, int arg1, String arg2, int arg3, int arg4) {
        int var6 = 5;
        byte[] var7 = signlink.cacheload(arg0);
        if (arg1 < 5 || arg1 > 5) {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
        if (var7 != null) {
            this.field1080.reset();
            this.field1080.update(var7);
            int var9 = (int) this.field1080.getValue();
            if (arg4 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new Jagfile(var7, 969);
        } else {
            while (var7 == null) {
                this.method13("Requesting " + arg2, arg3, false);
                try {
                    int var11 = 0;
                    DataInputStream var12 = this.method397(arg0 + arg4);
                    byte[] var13 = new byte[6];
                    var12.readFully(var13, 0, 6);
                    Packet var14 = new Packet(var13, (byte) 63);
                    var14.field586 = 3;
                    int var15 = var14.method189() + 6;
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
                            this.method13("Loading " + arg2 + " - " + var19 + "%", arg3, false);
                        }
                        var11 = var19;
                    }
                    var12.close();
                } catch (IOException var23) {
                    var7 = null;
                    for (int var20 = var6; var20 > 0; --var20) {
                        this.method13("Error loading - Will retry in " + var20 + " secs.", arg3, false);
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
            signlink.cachesave(arg0, var7);
            return new Jagfile(var7, 969);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method327(int arg0) {
        byte[] var2 = this.field1267.method225(0, (byte[]) null, "title.dat");
        Pix32 var3 = new Pix32(var2, this, 0);
        this.field1037.method210(0);
        var3.method153(false, 0, 0);
        this.field1038.method210(0);
        var3.method153(false, 0, -661);
        this.field1034.method210(0);
        var3.method153(false, 0, -128);
        if (arg0 != 5) {
            this.method6();
        }
        this.field1035.method210(0);
        var3.method153(false, -386, -214);
        this.field1036.method210(0);
        var3.method153(false, -186, -214);
        this.field1039.method210(0);
        var3.method153(false, -265, 0);
        this.field1040.method210(0);
        var3.method153(false, -265, -574);
        this.field1041.method210(0);
        var3.method153(false, -186, -128);
        this.field1042.method210(0);
        var3.method153(false, -186, -574);
        int[] var4 = new int[var3.field548];
        for (int var5 = 0; var5 < var3.field549; ++var5) {
            for (int var10 = 0; var10 < var3.field548; ++var10) {
                var4[var10] = var3.field547[var3.field548 * var5 + (var3.field548 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field548; ++var11) {
                var3.field547[var3.field548 * var5 + var11] = var4[var11];
            }
        }
        this.field1037.method210(0);
        var3.method153(false, 0, 394);
        this.field1038.method210(0);
        var3.method153(false, 0, -267);
        this.field1034.method210(0);
        var3.method153(false, 0, 266);
        this.field1035.method210(0);
        var3.method153(false, -386, 180);
        this.field1036.method210(0);
        var3.method153(false, -186, 180);
        this.field1039.method210(0);
        var3.method153(false, -265, 394);
        this.field1040.method210(0);
        var3.method153(false, -265, -180);
        this.field1041.method210(0);
        var3.method153(false, -186, 212);
        this.field1042.method210(0);
        var3.method153(false, -186, -180);
        Pix32 var6 = new Pix32("logo", 154, 0, this.field1267);
        this.field1034.method210(0);
        var6.method155(super.field11 / 2 - var6.field548 / 2 - 128, true, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public final void method13(String arg0, int arg1, boolean arg2) {
        this.method330(-905);
        if (this.field1267 == null) {
            super.method13(arg0, arg1, false);
        } else {
            this.field1036.method210(0);
            if (arg2) {
                field1031 = this.field1021.method221();
            }
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field1001.method168(var5 / 2 - 26 - var6, this.field1223, var4 / 2, 16777215, "RuneScape is loading - please wait...");
            int var7 = var5 / 2 - 18 - var6;
            Pix2D.method132(304, 34, var4 / 2 - 152, var7, true, 9179409);
            Pix2D.method132(302, 32, var4 / 2 - 151, var7 + 1, true, 0);
            Pix2D.method131(9179409, arg1 * 3, var7 + 2, false, 30, var4 / 2 - 150);
            Pix2D.method131(0, 300 - arg1 * 3, var7 + 2, false, 30, arg1 * 3 + (var4 / 2 - 150));
            this.field1001.method168(var5 / 2 + 5 - var6, this.field1223, var4 / 2, 16777215, arg0);
            this.field1036.method211(super.field13, 214, 186);
            if (this.field1191) {
                this.field1191 = false;
                if (!this.field1071) {
                    this.field1037.method211(super.field13, 0, 0);
                    this.field1038.method211(super.field13, 661, 0);
                }
                this.field1034.method211(super.field13, 128, 0);
                this.field1035.method211(super.field13, 214, 386);
                this.field1039.method211(super.field13, 0, 265);
                this.field1040.method211(super.field13, 574, 265);
                this.field1041.method211(super.field13, 128, 186);
                this.field1042.method211(super.field13, 574, 186);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (!this.field1053 && !this.field1248 && !this.field1280) {
            ++field994;
            if (arg0 != 0) {
                this.field1152 = null;
            }
            if (!this.field1172) {
                this.method331(0);
            } else {
                this.method344(4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method9(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            field1031 = -280;
        }
        if (!this.field1053 && !this.field1248 && !this.field1280) {
            if (!this.field1172) {
                this.method338(true);
            } else {
                this.method346(this.field1144);
            }
            this.field1251 = 0;
        } else {
            this.method328(this.field1050);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method328(byte arg0) {
        Graphics var2 = this.method11((byte) 8).getGraphics();
        var2.setColor(Color.black);
        if (arg0 != 103) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        var2.fillRect(0, 0, 789, 532);
        this.method4(1, 0);
        if (this.field1248) {
            this.field1071 = false;
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
        if (this.field1280) {
            this.field1071 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field1053) {
            this.field1071 = false;
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

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method10(int arg0) {
        this.field1191 = true;
        if (arg0 >= 0) {
            this.field1223 = !this.field1223;
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method329(byte arg0) {
        if (this.field1137 == null) {
            this.method333(0);
            super.field14 = null;
            this.field1034 = null;
            this.field1035 = null;
            this.field1036 = null;
            this.field1037 = null;
            this.field1038 = null;
            this.field1039 = null;
            this.field1040 = null;
            if (arg0 != 109) {
                this.field1144 = this.field1021.method221();
            }
            this.field1041 = null;
            this.field1042 = null;
            this.field1137 = new PixMap(96, 604, 479, this.method11((byte) 8));
            this.field1135 = new PixMap(160, 604, 168, this.method11((byte) 8));
            Pix2D.method130(2);
            this.field991.method166(0, true, 0);
            this.field1134 = new PixMap(261, 604, 190, this.method11((byte) 8));
            this.field1136 = new PixMap(334, 604, 512, this.method11((byte) 8));
            Pix2D.method130(2);
            this.field1224 = new PixMap(61, 604, 501, this.method11((byte) 8));
            this.field1225 = new PixMap(40, 604, 288, this.method11((byte) 8));
            this.field1226 = new PixMap(66, 604, 269, this.method11((byte) 8));
            this.field1191 = true;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method330(int arg0) {
        if (this.field1034 == null) {
            super.field14 = null;
            this.field1137 = null;
            this.field1135 = null;
            this.field1134 = null;
            this.field1136 = null;
            this.field1224 = null;
            this.field1225 = null;
            this.field1226 = null;
            this.field1037 = new PixMap(265, 604, 128, this.method11((byte) 8));
            Pix2D.method130(2);
            this.field1038 = new PixMap(265, 604, 128, this.method11((byte) 8));
            Pix2D.method130(2);
            this.field1034 = new PixMap(186, 604, 533, this.method11((byte) 8));
            Pix2D.method130(2);
            this.field1035 = new PixMap(146, 604, 360, this.method11((byte) 8));
            if (arg0 < 0) {
                Pix2D.method130(2);
                this.field1036 = new PixMap(200, 604, 360, this.method11((byte) 8));
                Pix2D.method130(2);
                this.field1039 = new PixMap(267, 604, 214, this.method11((byte) 8));
                Pix2D.method130(2);
                this.field1040 = new PixMap(267, 604, 215, this.method11((byte) 8));
                Pix2D.method130(2);
                this.field1041 = new PixMap(79, 604, 86, this.method11((byte) 8));
                Pix2D.method130(2);
                this.field1042 = new PixMap(79, 604, 87, this.method11((byte) 8));
                Pix2D.method130(2);
                if (this.field1267 != null) {
                    this.method327(5);
                    this.method332(field1064);
                }
                this.field1191 = true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method331(int arg0) {
        this.field1060 += arg0;
        if (this.field1032 == 0) {
            int var2 = super.field11 / 2;
            int var3 = super.field12 / 2 + 90;
            if (super.field22 == 1 && super.field23 >= var2 - 75 && super.field23 <= var2 + 75 && super.field24 >= var3 - 20 && super.field24 <= var3 + 20) {
                this.field1245 = "";
                this.field1246 = "Enter your username & password.";
                this.field1032 = 2;
                this.field1207 = 0;
                return;
            }
        } else if (this.field1032 == 1 || this.field1032 == 2) {
            int var4 = super.field12 / 2 - 30;
            int var11 = var4 + 30;
            if (super.field22 == 1 && super.field24 >= var11 - 15 && super.field24 < var11) {
                this.field1207 = 0;
            }
            var4 = var11 + 15;
            if (super.field22 == 1 && super.field24 >= var4 - 15 && super.field24 < var4) {
                this.field1207 = 1;
            }
            var4 += 15;
            if (super.field22 == 1 && super.field24 >= var4 - 15 && super.field24 < var4 && this.field1032 == 1) {
                this.field1207 = 2;
            }
            int var5 = super.field11 / 2 - 80;
            int var6 = super.field12 / 2 + 60;
            if (super.field22 == 1 && super.field23 >= var5 - 75 && super.field23 <= var5 + 75 && super.field24 >= var6 - 20 && super.field24 <= var6 + 20) {
                if (this.field1032 == 1) {
                    this.method340(this.method395(314), this.field1125, this.field1126, 0);
                } else {
                    this.method339(this.field1125, this.field1126, (byte) 12, this.method395(314), false);
                }
            }
            int var7 = super.field11 / 2 + 80;
            if (super.field22 == 1 && super.field23 >= var7 - 75 && super.field23 <= var7 + 75 && super.field24 >= var6 - 20 && super.field24 <= var6 + 20) {
                this.field1032 = 0;
            }
            while (true) {
                while (true) {
                    int var8 = this.method5(false);
                    if (var8 == -1) {
                        return;
                    }
                    boolean var9 = false;
                    for (int var10 = 0; var10 < field989.length(); ++var10) {
                        if (var8 == field989.charAt(var10)) {
                            var9 = true;
                            break;
                        }
                    }
                    if (this.field1207 == 0) {
                        if (var8 == 8 && this.field1125.length() > 0) {
                            this.field1125 = this.field1125.substring(0, this.field1125.length() - 1);
                        }
                        if (var8 == 9 || var8 == 10 || var8 == 13) {
                            this.field1207 = 1;
                        }
                        if (var9) {
                            this.field1125 = this.field1125 + (char) var8;
                        }
                        if (this.field1125.length() > 12) {
                            this.field1125 = this.field1125.substring(0, 12);
                        }
                    } else if (this.field1207 == 1) {
                        if (var8 == 8 && this.field1126.length() > 0) {
                            this.field1126 = this.field1126.substring(0, this.field1126.length() - 1);
                        }
                        if (var8 == 9 || var8 == 10 || var8 == 13) {
                            if (this.field1032 == 1) {
                                this.field1207 = 2;
                            } else {
                                this.field1207 = 0;
                            }
                        }
                        if (var9) {
                            this.field1126 = this.field1126 + (char) var8;
                        }
                        if (this.field1126.length() > 20) {
                            this.field1126 = this.field1126.substring(0, 20);
                        }
                    } else if (this.field1207 == 2) {
                        if (var8 == 8 && this.field1127.length() > 0) {
                            this.field1127 = this.field1127.substring(0, this.field1127.length() - 1);
                        }
                        if (var8 == 9 || var8 == 10 || var8 == 13) {
                            this.field1207 = 0;
                        }
                        if (var9) {
                            this.field1127 = this.field1127 + (char) var8;
                        }
                        if (this.field1127.length() > 20) {
                            this.field1127 = this.field1127.substring(0, 20);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method332(boolean arg0) {
        this.field1104 = new Pix8(0, this.field1267, "titlebox", 0);
        this.field1105 = new Pix8(0, this.field1267, "titlebutton", 0);
        this.field1033 = new Pix8[12];
        this.field1172 &= arg0;
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field1033[var2] = new Pix8(0, this.field1267, "runes", var2);
        }
        this.field1026 = new Pix32(128, 265, 0);
        this.field1027 = new Pix32(128, 265, 0);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field1026.field547[var3] = this.field1037.field634[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field1027.field547[var4] = this.field1038.field634[var4];
        }
        this.field1258 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field1258[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field1258[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field1258[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field1258[var8 + 192] = 16777215;
        }
        this.field1259 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field1259[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field1259[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field1259[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field1259[var12 + 192] = 16777215;
        }
        this.field1260 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field1260[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field1260[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field1260[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field1260[var16 + 192] = 16777215;
        }
        this.field1257 = new int[256];
        this.field1109 = new int[32768];
        this.field1110 = new int[32768];
        this.method334(0, (Pix8) null);
        this.field981 = new int[32768];
        this.field982 = new int[32768];
        this.method13("Connecting to fileserver", 10, false);
        if (!this.field1071) {
            this.field1263 = true;
            this.field1071 = true;
            this.method12(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (!this.field1263) {
            super.run();
        } else {
            this.field1131 = true;
            try {
                long var1 = System.currentTimeMillis();
                int var3 = 0;
                int var4 = 20;
                while (this.field1071) {
                    this.method335((byte) 9);
                    this.method335((byte) 9);
                    this.method337(-404);
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
            this.field1131 = false;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)V")
    public final void method333(int arg0) {
        this.field1071 = false;
        while (this.field1131) {
            this.field1071 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
        this.field1104 = null;
        this.field1105 = null;
        this.field1033 = null;
        this.field1257 = null;
        this.field1258 = null;
        this.field1259 = null;
        this.field1260 = null;
        this.field1109 = null;
        this.field1110 = null;
        this.field1060 += arg0;
        this.field981 = null;
        this.field982 = null;
        this.field1026 = null;
        this.field1027 = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILhb;)V")
    public final void method334(int arg0, Pix8 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field1109.length; ++var4) {
            this.field1109[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field1109[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field1110[var16] = (this.field1109[var16 - 1] + this.field1109[var16 + 1] + this.field1109[var16 - 128] + this.field1109[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field1109;
            this.field1109 = this.field1110;
            this.field1110 = var14;
        }
        this.field1060 += arg0;
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field560; ++var8) {
                for (int var9 = 0; var9 < arg1.field559; ++var9) {
                    if (arg1.field557[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field561;
                        int var11 = var8 + 16 + arg1.field562;
                        int var12 = (var11 << 7) + var10;
                        this.field1109[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method335(byte arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field981[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field981[var17] = 192;
        }
        if (arg0 != 9) {
            field1031 = -438;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field982[var14] = (this.field981[var14 - 1] + this.field981[var14 + 1] + this.field981[var14 - 128] + this.field981[var14 + 128]) / 4;
            }
        }
        this.field1211 += 128;
        if (this.field1211 > this.field1109.length) {
            this.field1211 -= this.field1109.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method334(0, this.field1033[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field982[var11 + 128] - this.field1109[this.field1211 + var11 & this.field1109.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field981[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field1146[var8] = this.field1146[var8 + 1];
        }
        this.field1146[var2 - 1] = (int) (Math.sin((double) field994 / 14.0D) * 16.0D + Math.sin((double) field994 / 15.0D) * 14.0D + Math.sin((double) field994 / 16.0D) * 12.0D);
        if (this.field1181 > 0) {
            this.field1181 -= 4;
        }
        if (this.field1182 > 0) {
            this.field1182 -= 4;
        }
        if (this.field1181 == 0 && this.field1182 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field1181 = 1024;
            }
            if (var9 == 1) {
                this.field1182 = 1024;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)I")
    public final int method336(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg3;
        this.field1060 += arg1;
        return ((arg0 & 16711935) * arg3 + (arg2 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg3 + (arg2 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method337(int arg0) {
        short var2 = 256;
        if (this.field1181 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field1181 > 768) {
                    this.field1257[var3] = this.method336(this.field1259[var3], 0, this.field1258[var3], 1024 - this.field1181);
                } else if (this.field1181 > 256) {
                    this.field1257[var3] = this.field1259[var3];
                } else {
                    this.field1257[var3] = this.method336(this.field1258[var3], 0, this.field1259[var3], 256 - this.field1181);
                }
            }
        } else if (this.field1182 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field1182 > 768) {
                    this.field1257[var4] = this.method336(this.field1260[var4], 0, this.field1258[var4], 1024 - this.field1182);
                } else if (this.field1182 > 256) {
                    this.field1257[var4] = this.field1260[var4];
                } else {
                    this.field1257[var4] = this.method336(this.field1258[var4], 0, this.field1260[var4], 256 - this.field1182);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field1257[var5] = this.field1258[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field1037.field634[var6] = this.field1026.field547[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field1146[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field981[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field1257[var26];
                    int var30 = this.field1037.field634[var8];
                    this.field1037.field634[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        if (arg0 < 0) {
            this.field1037.method211(super.field13, 0, 0);
            for (int var10 = 0; var10 < 33920; ++var10) {
                this.field1038.field634[var10] = this.field1027.field547[var10];
            }
            int var11 = 0;
            int var12 = 1176;
            for (int var13 = 1; var13 < var2 - 1; ++var13) {
                int var14 = (var2 - var13) * this.field1146[var13] / var2;
                int var15 = 103 - var14;
                int var16 = var12 + var14;
                for (int var17 = 0; var17 < var15; ++var17) {
                    int var18 = this.field981[var11++];
                    if (var18 != 0) {
                        int var20 = 256 - var18;
                        int var21 = this.field1257[var18];
                        int var22 = this.field1038.field634[var16];
                        this.field1038.field634[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                    } else {
                        ++var16;
                    }
                }
                var11 += 128 - var15;
                var12 = 128 - var15 - var14 + var16;
            }
            this.field1038.method211(super.field13, 661, 0);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method338(boolean arg0) {
        this.method330(-905);
        this.field1036.method210(0);
        this.field1172 &= arg0;
        this.field1104.method166(0, true, 0);
        short var2 = 360;
        short var3 = 200;
        if (this.field1032 == 0) {
            int var4 = var3 / 2 - 80;
            this.field1001.method169(var2 / 2, "Welcome to the RuneScape-2 BETA test.", var4, this.field1208, 16776960, true);
            int var11 = var4 + 15;
            int var12 = var11 + 15;
            this.field999.method169(var2 / 2, "Please note this test version of the game is provided for ", var12, this.field1208, 16777215, true);
            int var13 = var12 + 15;
            this.field999.method169(var2 / 2, "testing/preview purposes only. As such please bear in mind that:", var13, this.field1208, 16777215, true);
            int var14 = var13 + 15;
            int var15 = var14 + 10;
            this.field999.method169(var2 / 2, "a) Everything you do/gain here will be forgotten when the beta ends.", var15, this.field1208, 16777215, true);
            int var16 = var15 + 15;
            this.field999.method169(var2 / 2, "b) No customer support is available for the beta.", var16, this.field1208, 16777215, true);
            int var17 = var16 + 15;
            this.field999.method169(var2 / 2, "c) The beta may be incomplete/buggy, we're still working on it.", var17, this.field1208, 16777215, true);
            int var18 = var17 + 15;
            this.field999.method169(var2 / 2, "d) The beta may be totally unavailable at times.", var18, this.field1208, 16777215, true);
            int var19 = var18 + 15;
            int var5 = var2 / 2;
            int var6 = var3 / 2 + 65;
            this.field1105.method166(var5 - 73, true, var6 - 20);
            this.field1001.method169(var2 / 2, "Click here to login.", var6 + 5, this.field1208, 16777215, true);
        }
        if (this.field1032 == 1 || this.field1032 == 2) {
            int var7 = var3 / 2 - 50;
            if (this.field1245.length() > 0) {
                this.field1001.method169(var2 / 2, this.field1245, var7 - 15, this.field1208, 16776960, true);
                this.field1001.method169(var2 / 2, this.field1246, var7, this.field1208, 16776960, true);
                var7 += 30;
            } else {
                this.field1001.method169(var2 / 2, this.field1246, var7 - 7, this.field1208, 16776960, true);
                var7 += 30;
            }
            this.field1001.method173(true, var2 / 2 - 90, var7, 16777215, true, "Username: " + this.field1125 + (this.field1207 == 0 & field994 % 40 < 20 ? "@yel@|" : ""));
            var7 += 15;
            this.field1001.method173(true, var2 / 2 - 88, var7, 16777215, true, "Password: " + JString.method232(this.field1126, (byte) -37) + (this.field1207 == 1 & field994 % 40 < 20 ? "@yel@|" : ""));
            var7 += 15;
            if (this.field1032 == 1) {
                this.field1001.method173(true, var2 / 2 - 143, var7, 16777215, true, "Confirm Password: " + JString.method232(this.field1127, (byte) -37) + (this.field1207 == 2 & field994 % 40 < 20 ? "@yel@|" : ""));
            }
            int var8 = var2 / 2 - 80;
            int var9 = var3 / 2 + 40;
            this.field1105.method166(var8 - 73, true, var9 - 20);
            if (this.field1032 == 1) {
                this.field1001.method169(var8, "Create", var9 + 5, this.field1208, 16777215, true);
            } else {
                this.field1001.method169(var8, "Login", var9 + 5, this.field1208, 16777215, true);
            }
            int var10 = var2 / 2 + 80;
            this.field1105.method166(var10 - 73, true, var9 - 20);
            this.field1001.method169(var10, "Cancel", var9 + 5, this.field1208, 16777215, true);
        }
        this.field1036.method211(super.field13, 214, 186);
        if (this.field1191) {
            this.field1191 = false;
            this.field1034.method211(super.field13, 128, 0);
            this.field1035.method211(super.field13, 214, 386);
            this.field1039.method211(super.field13, 0, 265);
            this.field1040.method211(super.field13, 574, 265);
            this.field1041.method211(super.field13, 128, 186);
            this.field1042.method211(super.field13, 574, 186);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BIZ)V")
    public final void method339(String arg0, String arg1, byte arg2, int arg3, boolean arg4) {
        if (arg2 == 12) {
            try {
                if (!arg4) {
                    this.field1245 = "";
                    this.field1246 = "Connecting to server...";
                    this.method338(true);
                }
                this.field1077 = new ClientStream(-407, this.method398(this.field1187 + 43594), this);
                this.field1077.method31(this.field1055.field585, 0, 8);
                this.field1055.field586 = 0;
                this.field1286 = this.field1055.method191(1);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field1286 >> 32), (int) this.field1286 };
                this.field1043.field586 = 0;
                this.field1043.method178(10);
                this.field1043.method180(var6[0]);
                this.field1043.method180(var6[1]);
                this.field1043.method180(var6[2]);
                this.field1043.method180(var6[3]);
                this.field1043.method180(arg3);
                this.field1043.method182(arg0);
                this.field1043.method182(arg1);
                this.field1043.method200(field1030, true, field1088);
                this.field1177.field586 = 0;
                if (arg4) {
                    this.field1177.method178(18);
                } else {
                    this.field1177.method178(16);
                }
                this.field1177.method178(this.field1043.field586 + 32);
                for (int var7 = 0; var7 < 8; ++var7) {
                    this.field1177.method180(this.field1005[var7]);
                }
                this.field1177.method183(this.field1043.field586, false, 0, this.field1043.field585);
                this.field1043.field590 = new Isaac((byte) -73, var6);
                for (int var8 = 0; var8 < 4; ++var8) {
                    var6[var8] += 50;
                }
                this.field1021 = new Isaac((byte) -73, var6);
                this.field1077.method32(0, 0, this.field1177.field585, this.field1177.field586);
                int var9 = this.field1077.method29();
                if (var9 == 1) {
                    try {
                        Thread.sleep(2000L);
                    } catch (Exception var17) {
                    }
                    this.method339(arg0, arg1, (byte) 12, arg3, arg4);
                    return;
                }
                if (var9 == 2) {
                    this.field1172 = true;
                    this.field1043.field586 = 0;
                    this.field1055.field586 = 0;
                    this.field1061 = -1;
                    this.field1060 = 0;
                    this.field1062 = 0;
                    this.field1079 = 0;
                    if (!arg4) {
                        super.field18 = 0;
                        for (int var10 = 0; var10 < 100; ++var10) {
                            this.field1278[var10] = null;
                        }
                        this.field1066 = 0;
                        this.field1194 = 0;
                        this.field995 = 0;
                        this.field1217 = -1;
                        this.field1084 = 0;
                        this.field1282 = 0;
                        for (int var11 = 0; var11 < this.field1081; ++var11) {
                            this.field1083[var11] = null;
                            this.field1087[var11] = null;
                        }
                        for (int var12 = 0; var12 < 8192; ++var12) {
                            this.field1281[var12] = null;
                        }
                        this.field1139 = this.field1083[this.field1082] = new PlayerEntity();
                        this.field1244.method207();
                        this.field1022.method207();
                        this.field1215.method207();
                        int var13 = 0;
                        while (true) {
                            if (var13 >= 4) {
                                this.field1044 = new LinkList(845);
                                this.field1188 = 0;
                                this.field1264 = -1;
                                this.field1056 = -1;
                                this.field1051 = -1;
                                this.field1025 = false;
                                this.field1059 = 3;
                                this.field1054 = false;
                                this.field1228 = false;
                                this.field980 = false;
                                this.field1091 = 0;
                                this.field1072 = true;
                                this.method388((byte) 86);
                                for (int var16 = 0; var16 < 5; ++var16) {
                                    this.field1169[var16] = 0;
                                }
                                this.method329((byte) 109);
                                break;
                            }
                            for (int var14 = 0; var14 < 104; ++var14) {
                                for (int var15 = 0; var15 < 104; ++var15) {
                                    this.field1152[var13][var14][var15] = null;
                                }
                            }
                            ++var13;
                        }
                    }
                    return;
                }
                if (var9 == 3) {
                    this.field1245 = "";
                    this.field1246 = "Invalid username or password.";
                    return;
                }
                if (var9 == 4) {
                    this.field1245 = "Your account has been disabled.";
                    this.field1246 = "Please check your message-centre for details.";
                    return;
                }
                if (var9 == 5) {
                    this.field1245 = "Your account is already logged in.";
                    this.field1246 = "Try again in 60 secs...";
                    return;
                }
                if (var9 == 6) {
                    this.field1245 = "RuneScape has been updated!";
                    this.field1246 = "Please reload this page.";
                    return;
                }
                if (var9 == 7) {
                    this.field1245 = "This world is full.";
                    this.field1246 = "Please use a different world.";
                    return;
                }
                if (var9 == 8) {
                    this.field1245 = "Unable to connect.";
                    this.field1246 = "Login server offline.";
                    return;
                }
                if (var9 == 9) {
                    this.field1245 = "Login limit exceeded.";
                    this.field1246 = "Too many connections from your address.";
                    return;
                }
                if (var9 == 10) {
                    this.field1245 = "Unable to connect.";
                    this.field1246 = "Bad session id.";
                    return;
                }
                if (var9 == 11) {
                    this.field1245 = "Unable to connect.";
                    this.field1246 = "Login server rejected session.";
                    return;
                }
                if (var9 == 12) {
                    this.field1245 = "You need a members account to beta-test";
                    this.field1246 = "Please subscribe, or play RS1 instead";
                    return;
                }
                if (var9 == 13) {
                    this.field1245 = "Could not complete login";
                    this.field1246 = "Please try using a different world";
                    return;
                }
                if (var9 == 14) {
                    this.field1245 = "The server is being updated";
                    this.field1246 = "Please wait 1 minute and try again";
                    return;
                }
            } catch (IOException var18) {
                this.field1245 = "";
                this.field1246 = "Error connecting to server.";
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public final void method340(int arg0, String arg1, String arg2, int arg3) {
        if (arg3 != 0) {
            this.field1061 = this.field1055.method185();
        }
        try {
            this.field1245 = "";
            this.field1246 = "Connecting to server...";
            this.method338(true);
            this.field1077 = new ClientStream(-407, this.method398(this.field1187 + 43594), this);
            this.field1077.method31(this.field1055.field585, 0, 8);
            this.field1055.field586 = 0;
            this.field1286 = this.field1055.method191(1);
            this.field1043.field586 = 0;
            this.field1043.method178(10);
            this.field1043.method180((int) Math.random() * 99999999);
            this.field1043.method180((int) Math.random() * 99999999);
            this.field1043.method181(this.field1286, -771);
            this.field1043.method180(arg0);
            this.field1043.method182(arg1);
            this.field1043.method182(arg2);
            this.field1043.method200(field1030, true, field1088);
            this.field1177.field586 = 0;
            this.field1177.method178(17);
            this.field1177.method178(this.field1043.field586);
            this.field1177.method183(this.field1043.field586, false, 0, this.field1043.field585);
            this.field1077.method32(0, 0, this.field1177.field585, this.field1177.field586);
            int var5 = this.field1077.method29();
            if (var5 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var6) {
                }
                this.method340(arg0, arg1, arg2, 0);
                return;
            }
            if (var5 == 2) {
                this.field1245 = "Username already taken.";
                this.field1246 = "Please choose a different name.";
                return;
            }
            if (var5 == 3) {
                this.field1032 = 2;
                this.method339(this.field1125, this.field1126, (byte) 12, arg0, false);
                return;
            }
        } catch (IOException var7) {
            this.field1245 = "";
            this.field1246 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method8(byte arg0) {
        try {
            if (this.field1077 != null) {
                this.field1077.method28();
            }
        } catch (Exception var2) {
        }
        this.field1077 = null;
        signlink.midi = "null";
        this.field1043 = null;
        this.field1177 = null;
        this.field1055 = null;
        this.field1017 = null;
        this.field1111 = null;
        this.field1142 = null;
        this.field1103 = null;
        this.field1250 = null;
        this.field1153 = null;
        this.field985 = null;
        this.field1020 = null;
        this.field1123 = null;
        this.field1192 = null;
        this.field1193 = null;
        this.field1133 = null;
        this.field1134 = null;
        this.field1135 = null;
        this.field1136 = null;
        this.field1137 = null;
        this.field1224 = null;
        this.field1225 = null;
        this.field1226 = null;
        this.field1231 = null;
        this.field1232 = null;
        this.field1233 = null;
        this.field1234 = null;
        this.field1235 = null;
        this.field1236 = null;
        this.field1237 = null;
        this.field1238 = null;
        this.field1239 = null;
        this.field1240 = null;
        this.field990 = null;
        this.field991 = null;
        this.field992 = null;
        this.field1014 = null;
        this.field1015 = null;
        this.field1016 = null;
        this.field1276 = null;
        this.field1277 = null;
        this.field1287 = null;
        this.field1288 = null;
        this.field1289 = null;
        this.field1290 = null;
        this.field1291 = null;
        this.field1218 = null;
        this.field1219 = null;
        this.field1220 = null;
        this.field1221 = null;
        this.field1222 = null;
        this.field1214 = null;
        this.field998 = null;
        this.field979 = null;
        this.field1216 = null;
        this.field1156 = null;
        this.field1157 = null;
        this.field1158 = null;
        this.field1243 = null;
        this.field1124 = null;
        this.field1230 = null;
        this.field1083 = null;
        this.field1085 = null;
        this.field1086 = null;
        this.field1087 = null;
        this.field1180 = null;
        this.field1281 = null;
        this.field1283 = null;
        this.field1152 = null;
        this.field1044 = null;
        this.field1215 = null;
        this.field1244 = null;
        this.field1022 = null;
        this.field1209 = null;
        this.field1116 = null;
        this.field1117 = null;
        this.field1118 = null;
        this.field1119 = null;
        this.field978 = null;
        this.field1284 = null;
        this.field1010 = null;
        this.field1011 = null;
        this.field1145 = null;
        this.field1279 = null;
        this.field1199 = null;
        if (arg0 != -64) {
            field1031 = 60;
        }
        this.field1285 = null;
        this.field1037 = null;
        this.field1038 = null;
        this.field1034 = null;
        this.field1035 = null;
        this.field1036 = null;
        this.field1039 = null;
        this.field1040 = null;
        this.field1041 = null;
        this.field1042 = null;
        this.method333(0);
        LocType.method236(415);
        NpcType.method242(415);
        ObjType.method248(415);
        FloType.field838 = null;
        IdkType.field852 = null;
        Component.field862 = null;
        UnkType.field920 = null;
        SeqType.field927 = null;
        SpotAnimType.field944 = null;
        SpotAnimType.field951 = null;
        VarpType.field953 = null;
        super.field14 = null;
        PlayerEntity.field356 = null;
        Pix3D.method135(415);
        World3D.method35(415);
        Model.method103(415);
        AnimBase.field68 = null;
        AnimFrame.field73 = null;
        System.gc();
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method341(boolean arg0) {
        LocType.field748.method86();
        LocType.field749.method86();
        NpcType.field780.method86();
        ObjType.field820.method86();
        ObjType.field821.method86();
        PlayerEntity.field356.method86();
        SpotAnimType.field951.method86();
        if (arg0) {
            this.field1208 = 27;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method342(int arg0) {
        if (this.field1229 != arg0) {
            this.field1208 = this.field1021.method221();
        }
        try {
            if (this.field1077 != null) {
                this.field1077.method28();
            }
        } catch (Exception var3) {
        }
        this.field1077 = null;
        this.field1172 = false;
        this.field1032 = 0;
        this.field1125 = "";
        this.field1126 = "";
        this.field1127 = "";
        this.method341(false);
        this.field1153.method36(false);
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field985[var2].method256(573);
        }
        System.gc();
        if (this.field1106) {
            signlink.midi = "null";
        }
        this.field1210 = null;
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method343(byte arg0) {
        this.field1136.method210(0);
        this.field1000.method168(144, this.field1223, 257, 0, "Connection lost");
        this.field1000.method168(143, this.field1223, 256, 16777215, "Connection lost");
        this.field1000.method168(159, this.field1223, 257, 0, "Please wait - attempting to reestablish");
        this.field1000.method168(158, this.field1223, 256, 16777215, "Please wait - attempting to reestablish");
        this.field1136.method211(super.field13, 8, 11);
        this.field1172 = false;
        this.method339(this.field1125, this.field1126, (byte) 12, this.method395(314), true);
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.field1152 = null;
        }
        if (!this.field1172) {
            this.method342(-36905);
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method344(int arg0) {
        if (this.field1079 > 1) {
            --this.field1079;
        }
        for (int var2 = 0; var2 < 5 && this.method361(-359); ++var2) {
        }
        ++this.field1062;
        if (this.field1062 > 750) {
            this.method343((byte) 4);
        }
        this.method355(-31949);
        this.method357(0);
        for (int var3 = -1; var3 < this.field1084; ++var3) {
            int var4;
            if (var3 == -1) {
                var4 = this.field1082;
            } else {
                var4 = this.field1085[var3];
            }
            PlayerEntity var5 = this.field1083[var4];
            if (var5.field292 > 0) {
                --var5.field292;
                if (var5.field292 == 0) {
                    var5.field291 = null;
                }
            }
        }
        for (int var6 = 0; var6 < this.field1282; ++var6) {
            int var7 = this.field1283[var6];
            NpcEntity var8 = this.field1281[var7];
            if (var8.field292 > 0) {
                --var8.field292;
                if (var8.field292 == 0) {
                    var8.field291 = null;
                }
            }
        }
        if (this.field995 == 2) {
            for (LocSpawned var9 = (LocSpawned) this.field1215.method203(); var9 != null; var9 = (LocSpawned) this.field1215.method205(-14092)) {
                if (field994 >= var9.field615) {
                    this.method362(var9.field608, var9.field614, var9.field611, (byte) 120, var9.field610, var9.field609, var9.field613, var9.field612);
                    var9.method89();
                }
            }
        }
        ++this.field1108;
        if (arg0 < this.field1094 || arg0 > this.field1094) {
            this.field1152 = null;
        }
        if (this.field1186 != 0) {
            this.field1185 += 20;
            if (this.field1185 >= 400) {
                this.field1186 = 0;
            }
        }
        if (this.field1255 != 0) {
            ++this.field1252;
            if (this.field1252 >= 15) {
                if (this.field1255 == 2) {
                    this.field993 = true;
                }
                if (this.field1255 == 3) {
                    this.field1107 = true;
                }
                this.field1255 = 0;
            }
        }
        if (World3D.field236 != -1) {
            int var10 = World3D.field236;
            int var11 = World3D.field237;
            boolean var12 = this.method360(var11, true, 0, true, 0, var10, this.field1139.field327[0], 0, 0, 0, this.field1139.field328[0]);
            World3D.field236 = -1;
            if (var12) {
                this.field1183 = super.field23;
                this.field1184 = super.field24;
                this.field1186 = 1;
                this.field1185 = 0;
            }
        }
        this.method369(811);
        if (super.field22 == 1) {
            int var13 = super.field23 - 21 - 561;
            int var14 = super.field24 - 9 - 5;
            if (var13 >= 0 && var14 >= 0 && var13 < 146 && var14 < 151) {
                var13 -= 73;
                var14 -= 75;
                int var15 = Pix3D.field529[this.field1096];
                int var16 = Pix3D.field530[this.field1096];
                int var17 = var13 * var16 + var14 * var15 >> 11;
                int var18 = var14 * var16 - var13 * var15 >> 11;
                int var19 = this.field1139.field280 + var17 >> 7;
                int var20 = this.field1139.field281 - var18 >> 7;
                this.method360(var20, true, 0, true, 0, var19, this.field1139.field327[0], 0, 0, 0, this.field1139.field328[0]);
            }
        }
        if (super.field22 == 1) {
            if (super.field23 >= 549 && super.field23 <= 583 && super.field24 >= 195 && super.field24 < 231) {
                this.field993 = true;
                this.field1059 = 0;
                this.field1076 = true;
            }
            if (super.field23 >= 579 && super.field23 <= 609 && super.field24 >= 194 && super.field24 < 231) {
                this.field993 = true;
                this.field1059 = 1;
                this.field1076 = true;
            }
            if (super.field23 >= 607 && super.field23 <= 637 && super.field24 >= 194 && super.field24 < 231) {
                this.field993 = true;
                this.field1059 = 2;
                this.field1076 = true;
            }
            if (super.field23 >= 635 && super.field23 <= 679 && super.field24 >= 194 && super.field24 < 229) {
                this.field993 = true;
                this.field1059 = 3;
                this.field1076 = true;
            }
            if (super.field23 >= 676 && super.field23 <= 706 && super.field24 >= 194 && super.field24 < 231) {
                this.field993 = true;
                this.field1059 = 4;
                this.field1076 = true;
            }
            if (super.field23 >= 704 && super.field23 <= 734 && super.field24 >= 194 && super.field24 < 231) {
                this.field993 = true;
                this.field1059 = 5;
                this.field1076 = true;
            }
            if (super.field23 >= 732 && super.field23 <= 766 && super.field24 >= 195 && super.field24 < 231) {
                this.field993 = true;
                this.field1059 = 6;
                this.field1076 = true;
            }
            if (super.field23 >= 582 && super.field23 <= 612 && super.field24 >= 492 && super.field24 < 529) {
                this.field993 = true;
                this.field1059 = 8;
                this.field1076 = true;
            }
            if (super.field23 >= 609 && super.field23 <= 639 && super.field24 >= 492 && super.field24 < 529) {
                this.field993 = true;
                this.field1059 = 9;
                this.field1076 = true;
            }
            if (super.field23 >= 637 && super.field23 <= 681 && super.field24 >= 493 && super.field24 < 528) {
                this.field993 = true;
                this.field1059 = 10;
                this.field1076 = true;
            }
            if (super.field23 >= 679 && super.field23 <= 709 && super.field24 >= 492 && super.field24 < 529) {
                this.field993 = true;
                this.field1059 = 11;
                this.field1076 = true;
            }
        }
        if (super.field22 == 1) {
            if (super.field23 >= 8 && super.field23 <= 108 && super.field24 >= 490 && super.field24 <= 522) {
                this.field1149 = (this.field1149 + 1) % 3;
                this.field1241 = true;
                this.field1107 = true;
                this.field1043.method177(false, 173);
                this.field1043.method178(this.field1149);
                this.field1043.method178(this.field1112);
                this.field1043.method178(this.field1089);
            }
            if (super.field23 >= 137 && super.field23 <= 237 && super.field24 >= 490 && super.field24 <= 522) {
                this.field1112 = (this.field1112 + 1) % 3;
                this.field1241 = true;
                this.field1107 = true;
                this.field1043.method177(false, 173);
                this.field1043.method178(this.field1149);
                this.field1043.method178(this.field1112);
                this.field1043.method178(this.field1089);
            }
            if (super.field23 >= 275 && super.field23 <= 375 && super.field24 >= 490 && super.field24 <= 522) {
                this.field1089 = (this.field1089 + 1) % 3;
                this.field1241 = true;
                this.field1107 = true;
                this.field1043.method177(false, 173);
                this.field1043.method178(this.field1149);
                this.field1043.method178(this.field1112);
                this.field1043.method178(this.field1089);
            }
            boolean var10000;
            if (super.field23 >= 416 && super.field23 <= 516 && super.field24 >= 490 && super.field24 <= 522) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (super.field19 == 1 || super.field22 == 1) {
            ++this.field1251;
        }
        if (this.field995 == 2) {
            this.method345(this.field1019);
        }
        while (true) {
            while (true) {
                do {
                    do {
                        do {
                            int var21;
                            do {
                                while (true) {
                                    var21 = this.method5(false);
                                    if (var21 == -1) {
                                        ++super.field18;
                                        if (super.field18 > 4500) {
                                            super.field18 -= 500;
                                            this.field1043.method177(false, 135);
                                        }
                                        ++this.field1213;
                                        if (this.field1213 > 500) {
                                            this.field1213 = 0;
                                            int var39 = (int) (Math.random() * 8.0D);
                                            if ((var39 & 1) == 1) {
                                                this.field1128 += this.field1129;
                                            }
                                            if ((var39 & 2) == 2) {
                                                this.field1150 += this.field1151;
                                            }
                                            if ((var39 & 4) == 4) {
                                                this.field1154 += this.field1155;
                                            }
                                        }
                                        if (this.field1128 < -50) {
                                            this.field1129 = 2;
                                        }
                                        if (this.field1128 > 50) {
                                            this.field1129 = -2;
                                        }
                                        if (this.field1150 < -55) {
                                            this.field1151 = 2;
                                        }
                                        if (this.field1150 > 55) {
                                            this.field1151 = -2;
                                        }
                                        if (this.field1154 < -40) {
                                            this.field1155 = 1;
                                        }
                                        if (this.field1154 > 40) {
                                            this.field1155 = -1;
                                        }
                                        ++this.field1063;
                                        if (this.field1063 > 50) {
                                            this.field1043.method177(false, 223);
                                        }
                                        try {
                                            if (this.field1077 != null && this.field1043.field586 > 0) {
                                                this.field1077.method32(0, 0, this.field1043.field585, this.field1043.field586);
                                                this.field1043.field586 = 0;
                                                this.field1063 = 0;
                                                return;
                                            }
                                        } catch (IOException var41) {
                                            this.method343((byte) 4);
                                            return;
                                        } catch (Exception var42) {
                                            this.method342(-36905);
                                        }
                                        return;
                                    }
                                    if (this.field980) {
                                        if (var21 >= 32 && var21 <= 122 && this.field1262.length() < 80) {
                                            this.field1262 = this.field1262 + (char) var21;
                                            this.field1107 = true;
                                        }
                                        if (var21 == 8 && this.field1262.length() > 0) {
                                            this.field1262 = this.field1262.substring(0, this.field1262.length() - 1);
                                            this.field1107 = true;
                                        }
                                        break;
                                    }
                                    if (this.field1054) {
                                        if (var21 >= 48 && var21 <= 57 && this.field1165.length() < 10) {
                                            this.field1165 = this.field1165 + (char) var21;
                                            this.field1107 = true;
                                        }
                                        if (var21 == 8 && this.field1165.length() > 0) {
                                            this.field1165 = this.field1165.substring(0, this.field1165.length() - 1);
                                            this.field1107 = true;
                                        }
                                        if (var21 == 13 || var21 == 10) {
                                            if (this.field1165.length() > 0) {
                                                int var35 = 0;
                                                try {
                                                    var35 = Integer.parseInt(this.field1165);
                                                } catch (Exception var43) {
                                                }
                                                this.field1043.method177(false, 217);
                                                this.field1043.method180(var35);
                                            }
                                            this.field1054 = false;
                                            this.field1107 = true;
                                        }
                                    } else if (this.field1264 == -1) {
                                        if (var21 >= 32 && var21 <= 122 && this.field1164.length() < 80) {
                                            this.field1164 = this.field1164 + (char) var21;
                                            this.field1107 = true;
                                        }
                                        if (var21 == 8 && this.field1164.length() > 0) {
                                            this.field1164 = this.field1164.substring(0, this.field1164.length() - 1);
                                            this.field1107 = true;
                                        }
                                        if ((var21 == 13 || var21 == 10) && this.field1164.length() > 0) {
                                            if (this.field1164.equals("::clientdrop") && super.field16 != null) {
                                                this.method343((byte) 4);
                                            } else if (this.field1164.startsWith("::")) {
                                                this.field1043.method177(false, 37);
                                                this.field1043.method178(this.field1164.length() - 1);
                                                this.field1043.method182(this.field1164.substring(2));
                                            } else {
                                                byte var36 = 0;
                                                if (this.field1164.startsWith("yellow:")) {
                                                    var36 = 0;
                                                    this.field1164 = this.field1164.substring(7);
                                                }
                                                if (this.field1164.startsWith("red:")) {
                                                    var36 = 1;
                                                    this.field1164 = this.field1164.substring(4);
                                                }
                                                if (this.field1164.startsWith("green:")) {
                                                    var36 = 2;
                                                    this.field1164 = this.field1164.substring(6);
                                                }
                                                if (this.field1164.startsWith("cyan:")) {
                                                    var36 = 3;
                                                    this.field1164 = this.field1164.substring(5);
                                                }
                                                if (this.field1164.startsWith("purple:")) {
                                                    var36 = 4;
                                                    this.field1164 = this.field1164.substring(7);
                                                }
                                                if (this.field1164.startsWith("white:")) {
                                                    var36 = 5;
                                                    this.field1164 = this.field1164.substring(6);
                                                }
                                                if (this.field1164.startsWith("flash1:")) {
                                                    var36 = 6;
                                                    this.field1164 = this.field1164.substring(7);
                                                }
                                                if (this.field1164.startsWith("flash2:")) {
                                                    var36 = 7;
                                                    this.field1164 = this.field1164.substring(7);
                                                }
                                                if (this.field1164.startsWith("flash3:")) {
                                                    var36 = 8;
                                                    this.field1164 = this.field1164.substring(7);
                                                }
                                                if (this.field1164.startsWith("glow1:")) {
                                                    var36 = 9;
                                                    this.field1164 = this.field1164.substring(6);
                                                }
                                                if (this.field1164.startsWith("glow2:")) {
                                                    var36 = 10;
                                                    this.field1164 = this.field1164.substring(6);
                                                }
                                                if (this.field1164.startsWith("glow3:")) {
                                                    var36 = 11;
                                                    this.field1164 = this.field1164.substring(6);
                                                }
                                                byte var37 = 0;
                                                if (this.field1164.startsWith("wave:")) {
                                                    var37 = 1;
                                                    this.field1164 = this.field1164.substring(5);
                                                }
                                                if (this.field1164.startsWith("scroll:")) {
                                                    var37 = 2;
                                                    this.field1164 = this.field1164.substring(7);
                                                }
                                                this.field1043.method177(false, 18);
                                                this.field1043.method178(0);
                                                int var38 = this.field1043.field586;
                                                this.field1043.method178(var36);
                                                this.field1043.method178(var37);
                                                WordPack.method234(this.field1043, this.field1164, 0);
                                                this.field1043.method184(-529, this.field1043.field586 - var38);
                                                this.field1164 = JString.method231(this.field1164, 86);
                                                this.field1164 = WordFilter.method296(this.field1293, this.field1164);
                                                this.field1139.field291 = this.field1164;
                                                this.field1139.field293 = var36;
                                                this.field1139.field294 = var37;
                                                this.field1139.field292 = 150;
                                                this.method391(2, this.field1139.field336, this.field1139.field291, 36887);
                                                if (this.field1149 == 2) {
                                                    this.field1149 = 1;
                                                    this.field1241 = true;
                                                    this.field1043.method177(false, 173);
                                                    this.field1043.method178(this.field1149);
                                                    this.field1043.method178(this.field1112);
                                                    this.field1043.method178(this.field1089);
                                                }
                                            }
                                            this.field1164 = "";
                                            this.field1107 = true;
                                        }
                                    }
                                }
                            } while (var21 != 13 && var21 != 10);
                            this.field980 = false;
                            this.field1107 = true;
                            if (this.field1058 == 1 && this.field1188 < 100) {
                                this.field1262 = JString.method230(JString.method229(this.field1262, 535), -591);
                                if (this.field1262.length() > 0) {
                                    boolean var22 = false;
                                    for (int var23 = 0; var23 < this.field1188; ++var23) {
                                        if (this.field1199[var23].equals(this.field1262)) {
                                            var22 = true;
                                            break;
                                        }
                                    }
                                    if (this.field1262.equals(this.field1139.field336)) {
                                        var22 = true;
                                    }
                                    if (!var22) {
                                        this.field1199[this.field1188] = this.field1262;
                                        this.field1285[this.field1188] = 0;
                                        ++this.field1188;
                                        this.field993 = true;
                                        this.field1043.method177(false, 150);
                                        this.field1043.method181(JString.method226(this.field1262), -771);
                                    }
                                }
                            }
                            if (this.field1058 == 2 && this.field1188 > 0) {
                                this.field1262 = JString.method230(JString.method229(this.field1262, 535), -591);
                                if (this.field1262.length() > 0) {
                                    for (int var24 = 0; var24 < this.field1188; ++var24) {
                                        if (this.field1199[var24].equals(this.field1262)) {
                                            --this.field1188;
                                            this.field993 = true;
                                            for (int var25 = var24; var25 < this.field1188; ++var25) {
                                                this.field1199[var25] = this.field1199[var25 + 1];
                                                this.field1285[var25] = this.field1285[var25 + 1];
                                            }
                                            this.field1043.method177(false, 234);
                                            this.field1043.method181(JString.method226(this.field1262), -771);
                                            break;
                                        }
                                    }
                                }
                            }
                            if (this.field1058 == 3 && this.field1262.length() > 0 && this.field1078 >= 0 && this.field1078 < this.field1188) {
                                this.field1043.method177(false, 12);
                                this.field1043.method178(0);
                                int var26 = this.field1043.field586;
                                this.field1043.method181(JString.method226(this.field1199[this.field1078]), -771);
                                WordPack.method234(this.field1043, this.field1262, 0);
                                this.field1043.method184(-529, this.field1043.field586 - var26);
                                this.field1262 = JString.method231(this.field1262, 86);
                                this.field1262 = WordFilter.method296(this.field1293, this.field1262);
                                this.method391(6, this.field1199[this.field1078], this.field1262, 36887);
                                if (this.field1112 == 2) {
                                    this.field1112 = 1;
                                    this.field1241 = true;
                                    this.field1043.method177(false, 173);
                                    this.field1043.method178(this.field1149);
                                    this.field1043.method178(this.field1112);
                                    this.field1043.method178(this.field1089);
                                }
                            }
                            if (this.field1058 == 4 && this.field1168 < 100 && this.field1262.length() > 0) {
                                long var27 = JString.method226(this.field1262);
                                boolean var29 = false;
                                for (int var30 = 0; var30 < this.field1168; ++var30) {
                                    if (this.field1178[var30] == var27) {
                                        var29 = true;
                                        break;
                                    }
                                }
                                if (!var29) {
                                    this.field1178[this.field1168++] = var27;
                                    this.field993 = true;
                                    this.field1043.method177(false, 105);
                                    this.field1043.method181(var27, -771);
                                }
                            }
                        } while (this.field1058 != 5);
                    } while (this.field1168 <= 0);
                } while (this.field1262.length() <= 0);
                long var31 = JString.method226(this.field1262);
                for (int var33 = 0; var33 < this.field1168; ++var33) {
                    if (this.field1178[var33] == var31) {
                        --this.field1168;
                        this.field993 = true;
                        for (int var34 = var33; var34 < this.field1168; ++var34) {
                            this.field1178[var34] = this.field1178[var34 + 1];
                        }
                        this.field1043.method177(false, 92);
                        this.field1043.method181(var31, -771);
                        break;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method345(boolean arg0) {
        int var2 = this.field1139.field280 + this.field1128;
        int var3 = this.field1139.field281 + this.field1150;
        if (this.field1268 - var2 < -500 || this.field1268 - var2 > 500 || this.field1269 - var3 < -500 || this.field1269 - var3 > 500) {
            this.field1268 = var2;
            this.field1269 = var3;
        }
        if (this.field1268 != var2) {
            this.field1268 += (var2 - this.field1268) / 16;
        }
        if (this.field1269 != var3) {
            this.field1269 += (var3 - this.field1269) / 16;
        }
        if (super.field25[1] == 1) {
            this.field1270 += (-24 - this.field1270) / 2;
        } else if (super.field25[2] == 1) {
            this.field1270 += (24 - this.field1270) / 2;
        } else {
            this.field1270 /= 2;
        }
        if (super.field25[3] == 1) {
            this.field1271 += (12 - this.field1271) / 2;
        } else if (super.field25[4] == 1) {
            this.field1271 += (-12 - this.field1271) / 2;
        } else {
            this.field1271 /= 2;
        }
        this.field1097 = this.field1270 / 2 + this.field1097 & 2047;
        if (arg0) {
            this.field1061 = -1;
        }
        this.field1095 += this.field1271 / 2;
        this.field1096 = this.field1154 + this.field1097 & 2047;
        if (this.field1095 < 128) {
            this.field1095 = 128;
        }
        if (this.field1095 > 383) {
            this.field1095 = 383;
        }
        int var4 = this.field1268 >> 7;
        int var5 = this.field1269 >> 7;
        int var6 = this.method349(this.field1268, (byte) 42, this.field1269, this.field1205);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    int var10 = this.field1205;
                    if (var10 < 3 && (this.field1250[1][var8][var9] & 2) == 2) {
                        ++var10;
                    }
                    int var11 = var6 - this.field1103[var10][var8][var9];
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
        if (var12 > this.field1102) {
            this.field1102 += (var12 - this.field1102) / 24;
        } else {
            if (var12 < this.field1102) {
                this.field1102 += (var12 - this.field1102) / 80;
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method346(int arg0) {
        this.field1060 += arg0;
        if (this.field1191) {
            this.field1191 = false;
            this.field1231.method211(super.field13, 0, 11);
            this.field1232.method211(super.field13, 0, 375);
            this.field1233.method211(super.field13, 729, 5);
            this.field1234.method211(super.field13, 752, 231);
            this.field1235.method211(super.field13, 0, 0);
            this.field1236.method211(super.field13, 561, 0);
            this.field1237.method211(super.field13, 520, 11);
            this.field1238.method211(super.field13, 520, 231);
            this.field1239.method211(super.field13, 501, 375);
            this.field1240.method211(super.field13, 0, 345);
            this.field993 = true;
            this.field1107 = true;
            this.field1076 = true;
            this.field1241 = true;
            if (this.field995 != 2) {
                this.field1136.method211(super.field13, 8, 11);
                this.field1135.method211(super.field13, 561, 5);
            }
        }
        if (this.field995 == 2) {
            this.method347(44638);
        }
        if (this.field1228 && this.field1159 == 1) {
            this.field993 = true;
        }
        if (this.field1051 != -1) {
            boolean var2 = this.method384((byte) -91, this.field1108, this.field1051);
            if (var2) {
                this.field993 = true;
            }
        }
        if (this.field1255 == 2) {
            this.field993 = true;
        }
        if (this.field993) {
            this.method394(746);
            this.field993 = false;
        }
        if (this.field1264 == -1) {
            this.field1024.field879 = this.field1261 - this.field1212 - 77;
            if (super.field20 > 453 && super.field20 < 565 && super.field21 > 350) {
                this.method377(0, 463, super.field20 - 22, 77, super.field21 - 375, this.field1024, 0, false, this.field1261);
            }
            int var3 = this.field1261 - 77 - this.field1024.field879;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > this.field1261 - 77) {
                var3 = this.field1261 - 77;
            }
            if (this.field1212 != var3) {
                this.field1212 = var3;
                this.field1107 = true;
            }
        }
        if (this.field1264 != -1) {
            boolean var4 = this.method384((byte) -91, this.field1108, this.field1264);
            if (var4) {
                this.field1107 = true;
            }
        }
        if (this.field1255 == 3) {
            this.field1107 = true;
        }
        if (this.field1107) {
            this.method392(this.field1093);
            this.field1107 = false;
        }
        if (this.field995 == 2) {
            if (field1012 && this.field1270 == 0 && field994 - this.field1266 > 25) {
                this.field1266 = field994;
                this.field1265 = 1 - this.field1265;
                if (this.field1265 == 0) {
                    this.method389(421);
                } else {
                    this.field1135.method211(super.field13, 561, 5);
                }
            }
            if (!field1012) {
                this.method389(421);
                this.field1135.method211(super.field13, 561, 5);
            }
        }
        if (this.field1076) {
            this.field1076 = false;
            this.field1226.method210(0);
            this.field1016.method166(0, true, 0);
            if (this.field1051 == -1) {
                if (this.field1059 == 0) {
                    this.field1287.method166(29, true, 30);
                }
                if (this.field1059 == 1) {
                    this.field1288.method166(59, true, 29);
                }
                if (this.field1059 == 2) {
                    this.field1288.method166(87, true, 29);
                }
                if (this.field1059 == 3) {
                    this.field1289.method166(115, true, 29);
                }
                if (this.field1059 == 4) {
                    this.field1291.method166(156, true, 29);
                }
                if (this.field1059 == 5) {
                    this.field1291.method166(184, true, 29);
                }
                if (this.field1059 == 6) {
                    this.field1290.method166(212, true, 30);
                }
                this.field1276.method166(39, true, 33);
            }
            this.field1226.method211(super.field13, 520, 165);
            this.field1225.method210(0);
            this.field1015.method166(0, true, 0);
            if (this.field1051 == -1) {
                if (this.field1059 == 7) {
                    this.field1218.method166(49, true, 0);
                }
                if (this.field1059 == 8) {
                    this.field1219.method166(81, true, 0);
                }
                if (this.field1059 == 9) {
                    this.field1219.method166(108, true, 0);
                }
                if (this.field1059 == 10) {
                    this.field1220.method166(136, true, 1);
                }
                if (this.field1059 == 11) {
                    this.field1222.method166(178, true, 0);
                }
                if (this.field1059 == 12) {
                    this.field1222.method166(205, true, 0);
                }
                if (this.field1059 == 13) {
                    this.field1221.method166(233, true, 0);
                }
                this.field1277.method166(83, true, 4);
            }
            this.field1225.method211(super.field13, 501, 492);
            this.field1136.method210(0);
        }
        if (this.field1241) {
            this.field1241 = false;
            this.field1224.method210(0);
            this.field1014.method166(0, true, 0);
            this.field1000.method169(57, "Public chat", 33, this.field1208, 16777215, true);
            if (this.field1149 == 0) {
                this.field1000.method169(57, "On", 46, this.field1208, 65280, true);
            }
            if (this.field1149 == 1) {
                this.field1000.method169(57, "Friends", 46, this.field1208, 16776960, true);
            }
            if (this.field1149 == 2) {
                this.field1000.method169(57, "Off", 46, this.field1208, 16711680, true);
            }
            this.field1000.method169(186, "Private chat", 33, this.field1208, 16777215, true);
            if (this.field1112 == 0) {
                this.field1000.method169(186, "On", 46, this.field1208, 65280, true);
            }
            if (this.field1112 == 1) {
                this.field1000.method169(186, "Friends", 46, this.field1208, 16776960, true);
            }
            if (this.field1112 == 2) {
                this.field1000.method169(186, "Off", 46, this.field1208, 16711680, true);
            }
            this.field1000.method169(326, "Trade/duel", 33, this.field1208, 16777215, true);
            if (this.field1089 == 0) {
                this.field1000.method169(326, "On", 46, this.field1208, 65280, true);
            }
            if (this.field1089 == 1) {
                this.field1000.method169(326, "Friends", 46, this.field1208, 16776960, true);
            }
            if (this.field1089 == 2) {
                this.field1000.method169(326, "Off", 46, this.field1208, 16711680, true);
            }
            this.field1224.method211(super.field13, 0, 471);
            this.field1136.method210(0);
        }
        this.field1108 = 0;
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method347(int arg0) {
        ++this.field1292;
        for (int var2 = -1; var2 < this.field1084; ++var2) {
            PlayerEntity var64;
            int var65;
            if (var2 == -1) {
                var64 = this.field1139;
                var65 = this.field1082 << 14;
            } else {
                var64 = this.field1083[this.field1085[var2]];
                var65 = this.field1085[var2] << 14;
            }
            var64.field355 = false;
            if ((field1012 && this.field1084 > 50 || this.field1084 > 200) && var2 != -1 && var64.field303 == var64.field289) {
                var64.field355 = true;
            }
            if (var64.method98(-29424)) {
                int var66 = var64.field280 >> 7;
                int var67 = var64.field281 >> 7;
                if (var66 >= 0 && var66 < 104 && var67 >= 0 && var67 < 104) {
                    if (var64.field350 != null && field994 >= var64.field345 && field994 < var64.field346) {
                        var64.field355 = false;
                        var64.field344 = this.method349(var64.field280, (byte) 42, var64.field281, this.field1205);
                        this.field1153.method48(var64.field351, 823, var64.field352, var64.field344, var64.field354, this.field1205, var64.field280, (Model) null, var64.field281, var64.field282, var64.field353, var65, 60, var64);
                    } else {
                        if ((var64.field280 & 127) == 64 && (var64.field281 & 127) == 64) {
                            if (this.field1230[var66][var67] == this.field1292) {
                                continue;
                            }
                            this.field1230[var66][var67] = this.field1292;
                        }
                        var64.field344 = this.method349(var64.field280, (byte) 42, var64.field281, this.field1205);
                        this.field1153.method47(var64.field282, var64, var65, var64.field344, var64.field280, this.field1205, var64.field283, 60, var64.field281, true, (Model) null);
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field1282; ++var3) {
            NpcEntity var60 = this.field1281[this.field1283[var3]];
            int var61 = (this.field1283[var3] << 14) + 536870912;
            if (var60.method94(-29424)) {
                int var62 = var60.field280 >> 7;
                int var63 = var60.field281 >> 7;
                if (var62 >= 0 && var62 < 104 && var63 >= 0 && var63 < 104) {
                    if (var60.field284 == 1 && (var60.field280 & 127) == 64 && (var60.field281 & 127) == 64) {
                        if (this.field1230[var62][var63] == this.field1292) {
                            continue;
                        }
                        this.field1230[var62][var63] = this.field1292;
                    }
                    this.field1153.method47(var60.field282, var60, var61, this.method349(var60.field280, (byte) 42, var60.field281, this.field1205), var60.field280, this.field1205, var60.field283, (var60.field284 - 1) * 64 + 60, var60.field281, true, (Model) null);
                }
            }
        }
        for (ProjectileEntity var4 = (ProjectileEntity) this.field1244.method203(); var4 != null; var4 = (ProjectileEntity) this.field1244.method205(-14092)) {
            if (this.field1205 == var4.field359 && field994 <= var4.field365) {
                if (field994 >= var4.field364) {
                    if (var4.field368 > 0) {
                        NpcEntity var57 = this.field1281[var4.field368 - 1];
                        if (var57 != null) {
                            var4.method99(var57.field281, this.method349(var57.field280, (byte) 42, var57.field281, var4.field359) - var4.field363, var57.field280, this.field1008, field994);
                        }
                    }
                    if (var4.field368 < 0) {
                        int var58 = -var4.field368 - 1;
                        PlayerEntity var59;
                        if (this.field1045 == var58) {
                            var59 = this.field1139;
                        } else {
                            var59 = this.field1083[var58];
                        }
                        if (var59 != null) {
                            var4.method99(var59.field281, this.method349(var59.field280, (byte) 42, var59.field281, var4.field359) - var4.field363, var59.field280, this.field1008, field994);
                        }
                    }
                    var4.method100(0, this.field1108);
                    this.field1153.method47(var4.field378, var4, -1, (int) var4.field372, (int) var4.field370, this.field1205, 0, 60, (int) var4.field371, true, (Model) null);
                }
            } else {
                var4.method89();
            }
        }
        for (SpotAnimEntity var5 = (SpotAnimEntity) this.field1022.method203(); var5 != null; var5 = (SpotAnimEntity) this.field1022.method205(-14092)) {
            if (this.field1205 == var5.field385 && !var5.field391) {
                if (field994 >= var5.field384) {
                    var5.method101(this.field1108, 30001);
                    if (var5.field391) {
                        var5.method89();
                    } else {
                        this.field1153.method47(0, var5, -1, var5.field388, var5.field386, var5.field385, 0, 60, var5.field387, true, (Model) null);
                    }
                }
            } else {
                var5.method89();
            }
        }
        for (LocEntity var6 = (LocEntity) this.field1209.method203(); var6 != null; var6 = (LocEntity) this.field1209.method205(-14092)) {
            boolean var50 = false;
            var6.field623 += this.field1108;
            if (var6.field622 == -1) {
                var6.field622 = 0;
                var50 = true;
            }
            label448: {
                do {
                    do {
                        if (var6.field623 <= var6.field621.field931[var6.field622]) {
                            break label448;
                        }
                        var6.field623 -= var6.field621.field931[var6.field622] + 1;
                        ++var6.field622;
                        var50 = true;
                    } while (var6.field622 < var6.field621.field928);
                    var6.field622 -= var6.field621.field932;
                } while (var6.field622 >= 0 && var6.field622 < var6.field621.field928);
                var6.method89();
                var50 = false;
            }
            if (var50) {
                int var51 = 0;
                if (var6.field617 == 1) {
                    var51 = this.field1153.method60(var6.field616, var6.field619, (byte) -73, var6.field618);
                }
                if (var6.field617 == 2) {
                    var51 = this.field1153.method61(var6.field616, var6.field618, var6.field619);
                }
                if (var51 != 0 && (var51 >> 14 & 32767) == var6.field620) {
                    LocType var52 = LocType.method237(var6.field620);
                    int var53 = -1;
                    if (var6.field622 != -1) {
                        var53 = var6.field621.field929[var6.field622];
                    }
                    if (var6.field617 == 2) {
                        int var54 = this.field1153.method63(var6.field616, var6.field618, var6.field619, var51) >> 6;
                        Model var55 = var52.method240(10, var54, 0, 0, 0, 0, var53);
                        this.field1153.method52(var6.field616, var6.field618, var6.field619, var55, true);
                    } else if (var6.field617 == 1) {
                        Model var56 = var52.method240(4, 0, 0, 0, 0, 0, var53);
                        this.field1153.method53(var56, var6.field618, var6.field616, true, var6.field619);
                    }
                } else {
                    var6.method89();
                }
            }
        }
        int var7 = this.method349(this.field1268, (byte) 42, this.field1269, this.field1205);
        this.field1101 = this.field1095;
        if (this.field1102 / 256 > this.field1101) {
            this.field1101 = this.field1102 / 256;
        }
        this.method350(this.field1269, this.field1268, this.field1096, var7 - 50, 0, this.field1101, this.field1101 * 3 + 600);
        int var8 = 3;
        if (this.field1101 < 310) {
            int var9 = this.field1098 >> 7;
            int var10 = this.field1100 >> 7;
            int var11 = this.field1139.field280 >> 7;
            int var12 = this.field1139.field281 >> 7;
            if ((this.field1250[this.field1205][var9][var10] & 4) != 0) {
                var8 = this.field1205;
            }
            int var13;
            if (var11 > var9) {
                var13 = var11 - var9;
            } else {
                var13 = var9 - var11;
            }
            int var14;
            if (var12 > var10) {
                var14 = var12 - var10;
            } else {
                var14 = var10 - var12;
            }
            if (var13 > var14) {
                int var15 = var14 * 65536 / var13;
                int var16 = 32768;
                while (var9 != var11) {
                    if (var9 < var11) {
                        ++var9;
                    } else if (var9 > var11) {
                        --var9;
                    }
                    if ((this.field1250[this.field1205][var9][var10] & 4) != 0) {
                        var8 = this.field1205;
                    }
                    var16 += var15;
                    if (var16 >= 65536) {
                        var16 -= 65536;
                        if (var10 < var12) {
                            ++var10;
                        } else if (var10 > var12) {
                            --var10;
                        }
                        if ((this.field1250[this.field1205][var9][var10] & 4) != 0) {
                            var8 = this.field1205;
                        }
                    }
                }
            } else {
                int var17 = var13 * 65536 / var14;
                int var18 = 32768;
                while (var10 != var12) {
                    if (var10 < var12) {
                        ++var10;
                    } else if (var10 > var12) {
                        --var10;
                    }
                    if ((this.field1250[this.field1205][var9][var10] & 4) != 0) {
                        var8 = this.field1205;
                    }
                    var18 += var17;
                    if (var18 >= 65536) {
                        var18 -= 65536;
                        if (var9 < var11) {
                            ++var9;
                        } else if (var9 > var11) {
                            --var9;
                        }
                        if ((this.field1250[this.field1205][var9][var10] & 4) != 0) {
                            var8 = this.field1205;
                        }
                    }
                }
            }
        }
        if ((this.field1250[this.field1205][this.field1139.field280 >> 7][this.field1139.field281 >> 7] & 4) != 0) {
            var8 = this.field1205;
        }
        int var19 = Pix3D.field540;
        Model.field494 = true;
        Model.field497 = 0;
        Model.field495 = super.field20 - 8;
        Model.field496 = super.field21 - 11;
        if (arg0 == 44638) {
            Pix2D.method130(2);
            this.field1153.method72(this.field1098, this.field1099, this.field1100, this.field1101, this.field1096, var8);
            this.field1153.method50(false);
            for (int var20 = -1; var20 < this.field1282 + this.field1084; ++var20) {
                PathingEntity var39;
                if (var20 == -1) {
                    var39 = this.field1139;
                } else if (var20 < this.field1084) {
                    var39 = this.field1083[this.field1085[var20]];
                } else {
                    var39 = this.field1281[this.field1283[var20 - this.field1084]];
                }
                if (var20 < this.field1084) {
                    PlayerEntity var40 = (PlayerEntity) var39;
                    if (var40.field339 != 0) {
                        this.method348(var39.field324 + 15, 0, var39);
                        if (this.field1006 > -1) {
                            int var41 = 28;
                            for (int var42 = 0; var42 < 8; ++var42) {
                                if ((var40.field339 & 1 << var42) != 0) {
                                    this.field979[var42].method155(this.field1006 - 12, true, this.field1007 - var41);
                                    var41 -= 25;
                                }
                            }
                        }
                    }
                }
                if (var39.field291 != null && (var20 >= this.field1084 || this.field1149 == 0 || this.field1149 == 1 && this.method393(((PlayerEntity) var39).field336, (byte) -21))) {
                    this.method348(var39.field324, 0, var39);
                    if (this.field1006 > -1) {
                        if (this.field1065 == 0) {
                            int var43 = 16776960;
                            if (var39.field293 < 6) {
                                var43 = this.field1143[var39.field293];
                            }
                            if (var39.field293 == 6) {
                                var43 = this.field1292 % 20 < 10 ? 16711680 : 16776960;
                            }
                            if (var39.field293 == 7) {
                                var43 = this.field1292 % 20 < 10 ? 255 : 65535;
                            }
                            if (var39.field293 == 8) {
                                var43 = this.field1292 % 20 < 10 ? 45056 : 8454016;
                            }
                            if (var39.field293 == 9) {
                                int var44 = 150 - var39.field292;
                                if (var44 < 50) {
                                    var43 = var44 * 1280 + 16711680;
                                } else if (var44 < 100) {
                                    var43 = 16776960 - (var44 - 50) * 327680;
                                } else if (var44 < 150) {
                                    var43 = (var44 - 100) * 5 + 65280;
                                }
                            }
                            if (var39.field293 == 10) {
                                int var45 = 150 - var39.field292;
                                if (var45 < 50) {
                                    var43 = var45 * 5 + 16711680;
                                } else if (var45 < 100) {
                                    var43 = 16711935 - (var45 - 50) * 327680;
                                } else if (var45 < 150) {
                                    var43 = (var45 - 100) * 327680 + 255 - (var45 - 100) * 5;
                                }
                            }
                            if (var39.field293 == 11) {
                                int var46 = 150 - var39.field292;
                                if (var46 < 50) {
                                    var43 = 16777215 - var46 * 327685;
                                } else if (var46 < 100) {
                                    var43 = (var46 - 50) * 327685 + 65280;
                                } else if (var46 < 150) {
                                    var43 = 16777215 - (var46 - 100) * 327680;
                                }
                            }
                            if (var39.field294 == 0) {
                                this.field1001.method168(this.field1007 + 1, this.field1223, this.field1006, 0, var39.field291);
                                this.field1001.method168(this.field1007, this.field1223, this.field1006, var43, var39.field291);
                            }
                            if (var39.field294 == 1) {
                                this.field1001.method172(this.field1006, 0, (byte) 71, this.field1292, this.field1007 + 1, var39.field291);
                                this.field1001.method172(this.field1006, var43, (byte) 71, this.field1292, this.field1007, var39.field291);
                            }
                            if (var39.field294 == 2) {
                                int var47 = this.field1001.method170(331, var39.field291);
                                int var48 = (150 - var39.field292) * (var47 + 100) / 150;
                                Pix2D.method129(this.field1006 + 50, this.field1120, this.field1006 - 50, 0, 334);
                                this.field1001.method171(var39.field291, this.field1006 + 50 - var48, this.field1007 + 1, 0, -200);
                                this.field1001.method171(var39.field291, this.field1006 + 50 - var48, this.field1007, var43, -200);
                                Pix2D.method128((byte) 9);
                            }
                        } else {
                            this.field1001.method168(this.field1007 + 1, this.field1223, this.field1006, 0, var39.field291);
                            this.field1001.method168(this.field1007, this.field1223, this.field1006, 16776960, var39.field291);
                        }
                    }
                }
                if (var39.field297 > field994 + 100) {
                    this.method348(var39.field324 + 15, 0, var39);
                    if (this.field1006 > -1) {
                        int var49 = var39.field298 * 30 / var39.field299;
                        if (var49 > 30) {
                            var49 = 30;
                        }
                        Pix2D.method131(65280, var49, this.field1007 - 3, false, 5, this.field1006 - 15);
                        Pix2D.method131(16711680, 30 - var49, this.field1007 - 3, false, 5, this.field1006 - 15 + var49);
                    }
                }
                if (var39.field297 > field994 + 330) {
                    this.method348(var39.field324 / 2, 0, var39);
                    if (this.field1006 > -1) {
                        this.field998[var39.field296].method155(this.field1006 - 12, true, this.field1007 - 12);
                        this.field999.method168(this.field1007 + 4, this.field1223, this.field1006, 0, String.valueOf(var39.field295));
                        this.field999.method168(this.field1007 + 3, this.field1223, this.field1006 - 1, 16777215, String.valueOf(var39.field295));
                    }
                }
            }
            if (this.field1186 == 1) {
                this.field1216[this.field1185 / 100].method155(this.field1183 - 8 - 8, true, this.field1184 - 8 - 11);
            }
            if (this.field1186 == 2) {
                this.field1216[this.field1185 / 100 + 4].method155(this.field1183 - 8 - 8, true, this.field1184 - 8 - 11);
            }
            if (this.field1056 != -1) {
                this.method376(0, Component.field862[this.field1056], 0, 0, -204);
            }
            int var21 = (this.field1139.field280 >> 7) + this.field1272;
            int var22 = (this.field1139.field281 >> 7) + this.field1273;
            if (var21 >= 2944 && var21 < 3392 && var22 >= 3520 && var22 < 6400) {
                this.field1075 = (var22 - 3520) / 8 + 1;
            } else {
                this.field1075 = 0;
            }
            if (!this.field1228) {
                this.method371((byte) 0);
                this.method367(true);
            } else if (this.field1159 == 0) {
                this.method368(false);
            }
            if (!field1012 && Pix3D.field539[17] >= var19) {
                Pix8 var23 = Pix3D.field533[17];
                int var24 = var23.field560 * var23.field559 - 1;
                int var25 = this.field1108 * var23.field559 * 2;
                byte[] var26 = var23.field557;
                byte[] var27 = this.field1133;
                for (int var28 = 0; var28 <= var24; ++var28) {
                    var27[var28] = var26[var28 - var25 & var24];
                }
                var23.field557 = var27;
                this.field1133 = var26;
                Pix3D.method142(17, 423);
            }
            if (this.field1091 == 1) {
                this.field979[1].method155(5, true, 296);
            }
            if (this.field1075 > 0) {
                this.field979[0].method155(472, true, 296);
                this.field1000.method168(329, this.field1223, 484, 16776960, "Level: " + this.field1075);
            } else if (field1012) {
                int var29 = 16776960;
                Runtime var30 = Runtime.getRuntime();
                long var31 = var30.totalMemory();
                long var33 = var30.freeMemory();
                if (!signlink.sunjava && var31 - var33 > 33554432L && field994 > field1249 + 500) {
                    this.method341(false);
                    var30.gc();
                    int var35 = 16711680;
                    field1249 = field994;
                }
            }
            if (this.field1079 != 0) {
                int var36 = this.field1079 / 50;
                int var37 = var36 / 60;
                int var38 = var36 % 60;
                if (var38 < 10) {
                    this.field1000.method168(329, this.field1223, 256, 16776960, "System update in: " + var37 + ":0" + var38);
                } else {
                    this.field1000.method168(329, this.field1223, 256, 16776960, "System update in: " + var37 + ":" + var38);
                }
            }
            this.field1136.method211(super.field13, 8, 11);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILw;)V")
    public final void method348(int arg0, int arg1, PathingEntity arg2) {
        int var4 = arg2.field280;
        int var5 = arg2.field281;
        int var6 = this.method349(arg2.field280, (byte) 42, arg2.field281, this.field1205) - arg0;
        this.field1101 = this.field1095;
        if (this.field1102 / 256 > this.field1101) {
            this.field1101 = this.field1102 / 256;
        }
        int var7 = var4 - this.field1098;
        int var8 = var6 - this.field1099;
        this.field1060 += arg1;
        int var9 = var5 - this.field1100;
        int var10 = Model.field499[this.field1101];
        int var11 = Model.field500[this.field1101];
        int var12 = Model.field499[this.field1096];
        int var13 = Model.field500[this.field1096];
        int var14 = var7 * var13 + var9 * var12 >> 16;
        int var15 = var9 * var13 - var7 * var12 >> 16;
        int var17 = var8 * var11 - var10 * var15 >> 16;
        int var18 = var8 * var10 + var11 * var15 >> 16;
        if (var18 >= 50) {
            this.field1006 = (var14 << 9) / var18 + Pix3D.field525;
            this.field1007 = (var17 << 9) / var18 + Pix3D.field526;
        } else {
            this.field1006 = -1;
            this.field1007 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBII)I")
    public final int method349(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = arg0 >> 7;
        int var6 = arg2 >> 7;
        int var7 = arg3;
        if (arg3 < 3 && (this.field1250[1][var5][var6] & 2) == 2) {
            var7 = arg3 + 1;
        }
        int var8 = arg0 & 127;
        int var9 = arg2 & 127;
        int var10 = (128 - var8) * this.field1103[var7][var5][var6] + this.field1103[var7][var5 + 1][var6] * var8 >> 7;
        int var11 = (128 - var8) * this.field1103[var7][var5][var6 + 1] + this.field1103[var7][var5 + 1][var6 + 1] * var8 >> 7;
        if (arg1 != 42) {
            this.field1093 = -181;
        }
        return (128 - var9) * var10 + var9 * var11 >> 7;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg5 & 2047;
        int var9 = 2048 - arg2 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg6;
        if (var8 != 0) {
            int var13 = Model.field499[var8];
            int var14 = Model.field500[var8];
            int var15 = var11 * var14 - arg6 * var13 >> 16;
            var12 = var11 * var13 + arg6 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = Model.field499[var9];
            int var17 = Model.field500[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field1098 = arg1 - var10;
        if (arg4 != 0) {
            this.field1061 = -1;
        }
        this.field1099 = arg3 - var11;
        this.field1100 = arg0 - var12;
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method351(byte arg0) {
        try {
            this.field1217 = -1;
            this.field1215.method207();
            this.field1209.method207();
            this.field1022.method207();
            this.field1244.method207();
            Pix3D.method138(false);
            this.method341(false);
            this.field1153.method36(false);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field985[var2].method256(573);
            }
            System.gc();
            World var3 = new World(this.field1250, this.field1103, 104, 104, 8);
            byte[] var4 = new byte[100000];
            int var5 = this.field1111.length;
            if (field1012) {
                this.field1153.method37(this.field1205, -841);
            } else {
                this.field1153.method37(0, -841);
            }
            for (int var6 = 0; var6 < var5; ++var6) {
                int var7 = (this.field1017[var6] >> 8) * 64 - this.field1272;
                int var8 = (this.field1017[var6] & 255) * 64 - this.field1273;
                byte[] var9 = this.field1111[var6];
                if (var9 != null) {
                    int var10 = (new Packet(var9, (byte) 63)).method190();
                    BZip2.method213(var4, var10, var9, var9.length - 4, 4);
                    var3.method15(-16770, var4, (this.field1028 - 6) * 8, var8, var7, (this.field1029 - 6) * 8);
                } else if (this.field1029 < 800) {
                    var3.method14(var8, 64, 64, var7, (byte) -98);
                }
            }
            for (int var11 = 0; var11 < var5; ++var11) {
                byte[] var12 = this.field1142[var11];
                if (var12 != null) {
                    int var13 = (new Packet(var12, (byte) 63)).method190();
                    BZip2.method213(var4, var13, var12, var12.length - 4, 4);
                    int var14 = (this.field1017[var11] >> 8) * 64 - this.field1272;
                    int var15 = (this.field1017[var11] & 255) * 64 - this.field1273;
                    var3.method16(var4, this.field1209, this.field985, this.field1153, var15, var14, -576);
                }
            }
            var3.method18(this.field985, this.field1153, -910);
            this.field1136.method210(0);
            for (int var16 = 0; var16 < 104; ++var16) {
                for (int var17 = 0; var17 < 104; ++var17) {
                    this.method364(var16, var17);
                }
            }
            for (LocMerged var18 = (LocMerged) this.field1044.method203(); var18 != null; var18 = (LocMerged) this.field1044.method205(-14092)) {
                this.method362(var18.field598, var18.field604, var18.field601, (byte) 120, var18.field600, var18.field599, var18.field603, var18.field602);
            }
        } catch (Exception var21) {
        }
        LocType.field748.method86();
        System.gc();
        Pix3D.method139(20, (byte) 2);
        if (arg0 == 5) {
            boolean var20 = false;
        } else {
            this.field1061 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method352(int arg0, int arg1) {
        int[] var3 = this.field1279.field547;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var14 = (103 - var6) * 512 * 4 + 24628;
            for (int var15 = 1; var15 < 103; ++var15) {
                if ((this.field1250[arg0][var15][var6] & 24) == 0) {
                    this.field1153.method68(var3, var14, 512, arg0, var15, var6);
                }
                if (arg0 < 3 && (this.field1250[arg0 + 1][var15][var6] & 8) != 0) {
                    this.field1153.method68(var3, var14, 512, arg0 + 1, var15, var6);
                }
                var14 += 4;
            }
        }
        this.field1279.method152(0);
        for (int var7 = 1; var7 < 103; ++var7) {
            for (int var13 = 1; var13 < 103; ++var13) {
                if ((this.field1250[arg0][var13][var7] & 24) == 0) {
                    this.method353(false, var13, var7, arg0);
                }
                if (arg0 < 3 && (this.field1250[arg0 + 1][var13][var7] & 8) != 0) {
                    this.method353(false, var13, var7, arg0 + 1);
                }
            }
        }
        this.field1136.method210(0);
        if (arg1 >= 0) {
            this.field1019 = !this.field1019;
        }
        this.field1009 = 0;
        for (int var8 = 0; var8 < 104; ++var8) {
            for (int var9 = 0; var9 < 104; ++var9) {
                int var10 = this.field1153.method62(this.field1205, var8, var9);
                if (var10 != 0) {
                    int var11 = var10 >> 14 & 32767;
                    int var12 = LocType.method237(var11).field740;
                    if (var12 >= 0) {
                        this.field1145[this.field1009] = this.field1124[var12];
                        this.field1010[this.field1009] = var8;
                        this.field1011[this.field1009] = var9;
                        ++this.field1009;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIII)V")
    public final void method353(boolean arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1153.method59(arg3, arg1, arg2);
        if (var5 != 0) {
            int var6 = this.field1153.method63(arg3, arg1, arg2, var5);
            int var7 = var6 >> 6 & 3;
            int var8 = var6 & 31;
            int var9 = 15658734;
            if (var5 > 0) {
                var9 = 15597568;
            }
            int[] var10 = this.field1279.field547;
            int var11 = (103 - arg2) * 512 * 4 + arg1 * 4 + 24624;
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
        int var12 = this.field1153.method61(arg3, arg1, arg2);
        if (!arg0) {
            if (var12 != 0) {
                int var13 = this.field1153.method63(arg3, arg1, arg2, var12);
                int var14 = var13 >> 6 & 3;
                int var15 = var13 & 31;
                if (var15 == 9) {
                    int var16 = 15658734;
                    if (var12 > 0) {
                        var16 = 15597568;
                    }
                    int[] var17 = this.field1279.field547;
                    int var18 = (103 - arg2) * 512 * 4 + arg1 * 4 + 24624;
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
                    LocType var20 = LocType.method237(var19);
                    if (var20.field741 != -1) {
                        Pix8 var21 = this.field1243[var20.field741];
                        int var22 = (var20.field726 * 4 - var21.field559) / 2;
                        int var23 = (var20.field727 * 4 - var21.field560) / 2;
                        var21.method166(arg1 * 4 + 48 + var22, true, (104 - arg2 - var20.field727) * 4 + 48 + var23);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILw;I)V")
    public final void method354(byte arg0, int arg1, PathingEntity arg2, int arg3) {
        if (arg0 != 0) {
            this.field1061 = -1;
        }
        if (arg2 == null) {
            System.out.println("null entity");
        } else {
            if (arg2.field280 < 0 || arg2.field281 < 0 || arg2.field280 >= 13312 || arg2.field281 >= 13312) {
                arg2.field306 = -1;
                arg2.field311 = -1;
                arg2.field320 = 0;
                arg2.field321 = 0;
                arg2.field280 = arg2.field327[0] * 128 + arg2.field284 * 64;
                arg2.field281 = arg2.field328[0] * 128 + arg2.field284 * 64;
                arg2.field326 = 0;
            }
            boolean var5 = false;
            if (arg2.field306 != -1 && arg2.field309 == 0) {
                try {
                    SeqType var6 = SeqType.field927[arg2.field306];
                    if (var6.field933 == null) {
                        var5 = true;
                        ++arg2.field329;
                    }
                } catch (Exception var37) {
                    System.out.println("e2: " + arg2.field306);
                }
            }
            if (arg2.field320 > field994) {
                int var7 = arg2.field320 - field994;
                int var8 = arg2.field316 * 128 + arg2.field284 * 64;
                int var9 = arg2.field318 * 128 + arg2.field284 * 64;
                arg2.field280 += (var8 - arg2.field280) / var7;
                arg2.field281 += (var9 - arg2.field281) / var7;
                arg2.field329 = 0;
                if (arg2.field322 == 0) {
                    arg2.field325 = 1024;
                }
                if (arg2.field322 == 1) {
                    arg2.field325 = 1536;
                }
                if (arg2.field322 == 2) {
                    arg2.field325 = 0;
                }
                if (arg2.field322 == 3) {
                    arg2.field325 = 512;
                }
            } else if (arg2.field321 >= field994) {
                try {
                    if (field994 == arg2.field321 || !var5 || arg2.field308 + 1 > SeqType.field927[arg2.field306].field931[arg2.field307]) {
                        int var10 = arg2.field321 - arg2.field320;
                        int var11 = field994 - arg2.field320;
                        int var12 = arg2.field316 * 128 + arg2.field284 * 64;
                        int var13 = arg2.field318 * 128 + arg2.field284 * 64;
                        int var14 = arg2.field317 * 128 + arg2.field284 * 64;
                        int var15 = arg2.field319 * 128 + arg2.field284 * 64;
                        arg2.field280 = ((var10 - var11) * var12 + var11 * var14) / var10;
                        arg2.field281 = ((var10 - var11) * var13 + var11 * var15) / var10;
                    }
                    arg2.field329 = 0;
                    if (arg2.field322 == 0) {
                        arg2.field325 = 1024;
                    }
                    if (arg2.field322 == 1) {
                        arg2.field325 = 1536;
                    }
                    if (arg2.field322 == 2) {
                        arg2.field325 = 0;
                    }
                    if (arg2.field322 == 3) {
                        arg2.field325 = 512;
                    }
                    arg2.field282 = arg2.field325;
                } catch (Exception var42) {
                    System.out.println("e4: " + arg2.field306);
                }
            } else {
                try {
                    if (arg2.field326 == 0) {
                        arg2.field329 = 0;
                    }
                    if (arg2.field326 > 0 && !var5) {
                        int var16 = arg2.field280;
                        int var17 = arg2.field281;
                        int var18 = arg2.field327[arg2.field326 - 1] * 128 + arg2.field284 * 64;
                        int var19 = arg2.field328[arg2.field326 - 1] * 128 + arg2.field284 * 64;
                        if (var18 - var16 <= 256 && var18 - var16 >= -256 && var19 - var17 <= 256 && var19 - var17 >= -256) {
                            if (var16 < var18) {
                                if (var17 < var19) {
                                    arg2.field325 = 1280;
                                } else if (var17 > var19) {
                                    arg2.field325 = 1792;
                                } else {
                                    arg2.field325 = 1536;
                                }
                            } else if (var16 > var18) {
                                if (var17 < var19) {
                                    arg2.field325 = 768;
                                } else if (var17 > var19) {
                                    arg2.field325 = 256;
                                } else {
                                    arg2.field325 = 512;
                                }
                            } else if (var17 < var19) {
                                arg2.field325 = 1024;
                            } else {
                                arg2.field325 = 0;
                            }
                            int var20 = arg2.field325 - arg2.field282 & 2047;
                            if (var20 > 1024) {
                                var20 -= 2048;
                            }
                            int var21 = arg2.field286;
                            if (var20 >= -256 && var20 <= 256) {
                                var21 = arg2.field285;
                            } else if (var20 >= 256 && var20 < 768) {
                                var21 = arg2.field288;
                            } else if (var20 >= -768 && var20 <= -256) {
                                var21 = arg2.field287;
                            }
                            if (var21 == -1) {
                                var21 = arg2.field285;
                            }
                            if (arg2.field303 != var21) {
                                arg2.field303 = var21;
                                arg2.field304 = 0;
                                arg2.field305 = 0;
                            }
                            byte var22 = 4;
                            if (arg2.field325 != arg2.field282 && arg2.field300 == -1) {
                                var22 = 2;
                            }
                            if (arg2.field326 > 2) {
                                var22 = 6;
                            }
                            if (arg2.field326 > 3) {
                                var22 = 8;
                            }
                            if (arg2.field329 > 0 && arg2.field326 > 1) {
                                var22 = 8;
                                --arg2.field329;
                            }
                            if (var16 < var18) {
                                arg2.field280 += var22;
                                if (arg2.field280 > var18) {
                                    arg2.field280 = var18;
                                }
                            } else if (var16 > var18) {
                                arg2.field280 -= var22;
                                if (arg2.field280 < var18) {
                                    arg2.field280 = var18;
                                }
                            }
                            if (var17 < var19) {
                                arg2.field281 += var22;
                                if (arg2.field281 > var19) {
                                    arg2.field281 = var19;
                                }
                            } else if (var17 > var19) {
                                arg2.field281 -= var22;
                                if (arg2.field281 < var19) {
                                    arg2.field281 = var19;
                                }
                            }
                            if (arg2.field280 == var18 && arg2.field281 == var19) {
                                --arg2.field326;
                            }
                        } else {
                            arg2.field280 = var18;
                            arg2.field281 = var19;
                        }
                    } else {
                        arg2.field303 = arg2.field289;
                    }
                } catch (Exception var43) {
                    System.out.println("e5: " + arg2.field326);
                }
            }
            if (arg2.field300 != -1 && arg2.field300 < 32768) {
                try {
                    NpcEntity var23 = this.field1281[arg2.field300];
                    if (var23 != null) {
                        int var24 = arg2.field280 - var23.field280;
                        int var25 = arg2.field281 - var23.field281;
                        if (var24 != 0 || var25 != 0) {
                            arg2.field325 = (int) (Math.atan2((double) var24, (double) var25) * 325.949D) & 2047;
                        }
                    }
                } catch (Exception var41) {
                    System.out.println("e6: " + arg2.field300);
                }
            }
            if (arg2.field300 >= 32768) {
                try {
                    int var26 = arg2.field300 - 32768;
                    if (this.field1045 == var26) {
                        var26 = this.field1082;
                    }
                    PlayerEntity var27 = this.field1083[var26];
                    if (var27 != null) {
                        int var28 = arg2.field280 - var27.field280;
                        int var29 = arg2.field281 - var27.field281;
                        if (var28 != 0 || var29 != 0) {
                            arg2.field325 = (int) (Math.atan2((double) var28, (double) var29) * 325.949D) & 2047;
                        }
                    }
                } catch (Exception var40) {
                    System.out.println("e7: " + arg2.field300);
                }
            }
            if ((arg2.field301 != 0 || arg2.field302 != 0) && (arg2.field326 == 0 || arg2.field329 > 0)) {
                int var30 = arg2.field280 - (arg2.field301 - this.field1272 - this.field1272) * 64;
                int var31 = arg2.field281 - (arg2.field302 - this.field1273 - this.field1273) * 64;
                if (var30 != 0 || var31 != 0) {
                    arg2.field325 = (int) (Math.atan2((double) var30, (double) var31) * 325.949D) & 2047;
                }
                arg2.field301 = 0;
                arg2.field302 = 0;
            }
            int var32 = arg2.field325 - arg2.field282 & 2047;
            if (var32 != 0) {
                if (var32 >= 32 && var32 <= 2016) {
                    if (var32 > 1024) {
                        arg2.field282 -= 32;
                    } else {
                        arg2.field282 += 32;
                    }
                } else {
                    arg2.field282 = arg2.field325;
                }
                arg2.field282 &= 2047;
                if (arg2.field303 == arg2.field289) {
                    if (arg2.field290 != -1) {
                        arg2.field303 = arg2.field290;
                    } else {
                        arg2.field303 = arg2.field285;
                    }
                }
            }
            arg2.field283 = 0;
            if (arg2.field303 != -1) {
                try {
                    SeqType var33 = SeqType.field927[arg2.field303];
                    ++arg2.field305;
                    if (arg2.field304 < var33.field928 && arg2.field305 > var33.field931[arg2.field304]) {
                        arg2.field305 = 0;
                        ++arg2.field304;
                    }
                    if (arg2.field304 >= var33.field928) {
                        arg2.field305 = 0;
                        arg2.field304 = 0;
                    }
                } catch (Exception var36) {
                    System.out.println("e8: " + arg2.field303);
                }
            }
            if (arg2.field306 != -1 && arg2.field309 == 0) {
                try {
                    SeqType var34 = SeqType.field927[arg2.field306];
                    ++arg2.field308;
                    while (arg2.field307 < var34.field928 && arg2.field308 > var34.field931[arg2.field307]) {
                        arg2.field308 -= var34.field931[arg2.field307];
                        ++arg2.field307;
                    }
                    if (arg2.field307 >= var34.field928) {
                        arg2.field307 -= var34.field932;
                        ++arg2.field310;
                        if (arg2.field310 >= var34.field938) {
                            arg2.field306 = -1;
                        }
                        if (arg2.field307 < 0 || arg2.field307 >= var34.field928) {
                            arg2.field306 = -1;
                        }
                    }
                    arg2.field283 = var34.field934;
                } catch (Exception var39) {
                    System.out.println("e9: " + arg2.field306);
                }
            }
            if (arg2.field309 > 0) {
                --arg2.field309;
            }
            if (arg2.field311 != -1 && field994 >= arg2.field314) {
                try {
                    if (arg2.field312 < 0) {
                        arg2.field312 = 0;
                    }
                    SeqType var35 = SpotAnimType.field944[arg2.field311].field947;
                    ++arg2.field313;
                    while (arg2.field312 < var35.field928 && arg2.field313 > var35.field931[arg2.field312]) {
                        arg2.field313 -= var35.field931[arg2.field312];
                        ++arg2.field312;
                    }
                    if (arg2.field312 >= var35.field928) {
                        arg2.field311 = -1;
                        return;
                    }
                } catch (Exception var38) {
                    System.out.println("e10: " + arg2.field311);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method355(int arg0) {
        for (int var2 = -1; var2 < this.field1084; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field1082;
            } else {
                var3 = this.field1085[var2];
            }
            PlayerEntity var4 = this.field1083[var3];
            this.method354((byte) 0, 1, var4, var3 + 32768);
        }
        if (arg0 != -31949) {
            this.field1093 = -434;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method356(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1083[arg1] = null;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method357(int arg0) {
        this.field1060 += arg0;
        for (int var2 = 0; var2 < this.field1282; ++var2) {
            int var3 = this.field1283[var2];
            NpcEntity var4 = this.field1281[var3];
            this.method354((byte) 0, var4.field331.field761, var4, var3);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)V")
    public final void method358(int arg0, boolean arg1) {
        this.field1172 &= arg1;
        if (this.field1281[arg0] != null) {
            this.field1281[arg0].field331 = null;
        }
        this.field1281[arg0] = null;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIII)V")
    public final void method359(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= 0) {
            arg4 = this.field1055.method185();
        }
        int var6 = arg0 >> 14 & 32767;
        int var7 = this.field1153.method63(this.field1205, arg1, arg2, arg0);
        if (var7 != -1) {
            int var8 = var7 & 31;
            int var9 = var7 >> 6 & 3;
            if (var8 != 10 && var8 != 11 && var8 != 22) {
                this.method360(arg2, true, var8 + 1, false, 0, arg1, this.field1139.field327[0], 0, 0, var9, this.field1139.field328[0]);
            } else {
                LocType var10 = LocType.method237(var6);
                int var11;
                int var12;
                if (var9 != 0 && var9 != 2) {
                    var11 = var10.field727;
                    var12 = var10.field726;
                } else {
                    var11 = var10.field726;
                    var12 = var10.field727;
                }
                int var13 = var10.field747;
                if (var9 != 0) {
                    var13 = (var13 >> 4 - var9) + (var13 << var9 & 15);
                }
                this.method360(arg2, true, 0, false, var11, arg1, this.field1139.field327[0], var13, var12, 0, this.field1139.field328[0]);
            }
            this.field1183 = super.field23;
            this.field1184 = super.field24;
            this.field1186 = 2;
            this.field1185 = 0;
            this.field1043.method177(false, arg4);
            this.field1043.method179(this.field1272 + arg1);
            this.field1043.method179(this.field1273 + arg2);
            this.field1043.method179(var6);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIZIIIIIII)Z")
    public final boolean method360(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        byte var12 = 104;
        byte var13 = 104;
        for (int var14 = 0; var14 < var12; ++var14) {
            for (int var34 = 0; var34 < var13; ++var34) {
                this.field1020[var14][var34] = 0;
                this.field1123[var14][var34] = 99999999;
            }
        }
        int var15 = arg6;
        int var16 = arg10;
        this.field1020[arg6][arg10] = 99;
        this.field1172 &= arg1;
        this.field1123[arg6][arg10] = 0;
        byte var17 = 0;
        int var18 = 0;
        this.field1192[var17] = arg6;
        int var35 = var17 + 1;
        this.field1193[var17] = arg10;
        boolean var19 = false;
        int var20 = this.field1192.length;
        int[][] var21 = this.field985[this.field1205].field835;
        while (var35 != var18) {
            var15 = this.field1192[var18];
            var16 = this.field1193[var18];
            var18 = (var18 + 1) % var20;
            if (arg5 == var15 && arg0 == var16) {
                var19 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && this.field985[this.field1205].method265(var15, arg9, this.field1140, var16, arg0, arg2 - 1, arg5)) {
                    var19 = true;
                    break;
                }
                if (arg2 < 10 && this.field985[this.field1205].method266(arg0, var16, 0, arg2 - 1, arg5, var15, arg9)) {
                    var19 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg8 != 0 && this.field985[this.field1205].method267(arg8, var16, arg7, this.field996, var15, arg5, arg4, arg0)) {
                var19 = true;
                break;
            }
            int var33 = this.field1123[var15][var16] + 1;
            if (var15 > 0 && this.field1020[var15 - 1][var16] == 0 && (var21[var15 - 1][var16] & 2621704) == 0) {
                this.field1192[var35] = var15 - 1;
                this.field1193[var35] = var16;
                var35 = (var35 + 1) % var20;
                this.field1020[var15 - 1][var16] = 2;
                this.field1123[var15 - 1][var16] = var33;
            }
            if (var15 < var12 - 1 && this.field1020[var15 + 1][var16] == 0 && (var21[var15 + 1][var16] & 2621824) == 0) {
                this.field1192[var35] = var15 + 1;
                this.field1193[var35] = var16;
                var35 = (var35 + 1) % var20;
                this.field1020[var15 + 1][var16] = 8;
                this.field1123[var15 + 1][var16] = var33;
            }
            if (var16 > 0 && this.field1020[var15][var16 - 1] == 0 && (var21[var15][var16 - 1] & 2621698) == 0) {
                this.field1192[var35] = var15;
                this.field1193[var35] = var16 - 1;
                var35 = (var35 + 1) % var20;
                this.field1020[var15][var16 - 1] = 1;
                this.field1123[var15][var16 - 1] = var33;
            }
            if (var16 < var13 - 1 && this.field1020[var15][var16 + 1] == 0 && (var21[var15][var16 + 1] & 2621728) == 0) {
                this.field1192[var35] = var15;
                this.field1193[var35] = var16 + 1;
                var35 = (var35 + 1) % var20;
                this.field1020[var15][var16 + 1] = 4;
                this.field1123[var15][var16 + 1] = var33;
            }
            if (var15 > 0 && var16 > 0 && this.field1020[var15 - 1][var16 - 1] == 0 && (var21[var15 - 1][var16 - 1] & 2621710) == 0 && (var21[var15 - 1][var16] & 2621704) == 0 && (var21[var15][var16 - 1] & 2621698) == 0) {
                this.field1192[var35] = var15 - 1;
                this.field1193[var35] = var16 - 1;
                var35 = (var35 + 1) % var20;
                this.field1020[var15 - 1][var16 - 1] = 3;
                this.field1123[var15 - 1][var16 - 1] = var33;
            }
            if (var15 < var12 - 1 && var16 > 0 && this.field1020[var15 + 1][var16 - 1] == 0 && (var21[var15 + 1][var16 - 1] & 2621827) == 0 && (var21[var15 + 1][var16] & 2621824) == 0 && (var21[var15][var16 - 1] & 2621698) == 0) {
                this.field1192[var35] = var15 + 1;
                this.field1193[var35] = var16 - 1;
                var35 = (var35 + 1) % var20;
                this.field1020[var15 + 1][var16 - 1] = 9;
                this.field1123[var15 + 1][var16 - 1] = var33;
            }
            if (var15 > 0 && var16 < var13 - 1 && this.field1020[var15 - 1][var16 + 1] == 0 && (var21[var15 - 1][var16 + 1] & 2621752) == 0 && (var21[var15 - 1][var16] & 2621704) == 0 && (var21[var15][var16 + 1] & 2621728) == 0) {
                this.field1192[var35] = var15 - 1;
                this.field1193[var35] = var16 + 1;
                var35 = (var35 + 1) % var20;
                this.field1020[var15 - 1][var16 + 1] = 6;
                this.field1123[var15 - 1][var16 + 1] = var33;
            }
            if (var15 < var12 - 1 && var16 < var13 - 1 && this.field1020[var15 + 1][var16 + 1] == 0 && (var21[var15 + 1][var16 + 1] & 2621920) == 0 && (var21[var15 + 1][var16] & 2621824) == 0 && (var21[var15][var16 + 1] & 2621728) == 0) {
                this.field1192[var35] = var15 + 1;
                this.field1193[var35] = var16 + 1;
                var35 = (var35 + 1) % var20;
                this.field1020[var15 + 1][var16 + 1] = 12;
                this.field1123[var15 + 1][var16 + 1] = var33;
            }
        }
        if (!var19) {
            if (arg3) {
                int var22 = 100;
                for (int var23 = 1; var23 < 2; ++var23) {
                    for (int var24 = arg5 - var23; var24 <= arg5 + var23; ++var24) {
                        for (int var25 = arg0 - var23; var25 <= arg0 + var23; ++var25) {
                            if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && this.field1123[var24][var25] < var22) {
                                var22 = this.field1123[var24][var25];
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
        this.field1192[var26] = var15;
        int var36 = var26 + 1;
        this.field1193[var26] = var16;
        int var27;
        int var28 = var27 = this.field1020[var15][var16];
        while (arg6 != var15 || arg10 != var16) {
            if (var27 != var28) {
                var27 = var28;
                this.field1192[var36] = var15;
                this.field1193[var36++] = var16;
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
            var28 = this.field1020[var15][var16];
        }
        if (var36 > 0) {
            int var29 = var36;
            if (var36 > 25) {
                var29 = 25;
            }
            --var36;
            int var30 = this.field1192[var36];
            int var31 = this.field1193[var36];
            this.field1043.method177(false, 147);
            this.field1043.method178(var29 + var29 + 2);
            this.field1043.method179(this.field1272 + var30);
            this.field1043.method179(this.field1273 + var31);
            for (int var32 = 1; var32 < var29; ++var32) {
                --var36;
                this.field1043.method178(this.field1192[var36] - var30);
                this.field1043.method178(this.field1193[var36] - var31);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)Z")
    public final boolean method361(int arg0) {
        while (arg0 >= 0) {
            this.field1208 = this.field1021.method221();
        }
        if (this.field1077 == null) {
            return false;
        } else {
            try {
                int var2 = this.field1077.method30();
                if (var2 == 0) {
                    return false;
                }
                if (this.field1061 == -1) {
                    this.field1077.method31(this.field1055.field585, 0, 1);
                    this.field1061 = this.field1055.field585[0] & 255;
                    if (this.field1021 != null) {
                        this.field1061 = this.field1061 - this.field1021.method221() & 255;
                    }
                    this.field1060 = Protocol.field823[this.field1061];
                    --var2;
                }
                if (this.field1060 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field1077.method31(this.field1055.field585, 0, 1);
                    this.field1060 = this.field1055.field585[0] & 255;
                    --var2;
                }
                if (this.field1060 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field1077.method31(this.field1055.field585, 0, 2);
                    this.field1055.field586 = 0;
                    this.field1060 = this.field1055.method187();
                    var2 -= 2;
                }
                if (var2 < this.field1060) {
                    return false;
                }
                this.field1055.field586 = 0;
                this.field1077.method31(this.field1055.field585, 0, this.field1060);
                this.field1062 = 0;
                if (this.field1061 == 232) {
                    this.field1136.method210(0);
                    this.field1000.method168(151, this.field1223, 257, 0, "Loading - please wait.");
                    this.field1000.method168(150, this.field1223, 256, 16777215, "Loading - please wait.");
                    this.field1136.method211(super.field13, 8, 11);
                    this.field995 = 1;
                    this.field1028 = this.field1055.method187();
                    this.field1029 = this.field1055.method187();
                    this.field1272 = (this.field1028 - 6) * 8;
                    this.field1273 = (this.field1029 - 6) * 8;
                    signlink.looprate(5);
                    int var3 = (this.field1060 - 2) / 10;
                    this.field1111 = new byte[var3][];
                    this.field1142 = new byte[var3][];
                    this.field1017 = new int[var3];
                    this.field1043.method177(false, 117);
                    this.field1043.method178(0);
                    int var4 = 0;
                    for (int var5 = 0; var5 < var3; ++var5) {
                        int var6 = this.field1055.method185();
                        int var7 = this.field1055.method185();
                        int var8 = this.field1055.method190();
                        int var9 = this.field1055.method190();
                        this.field1017[var5] = (var6 << 8) + var7;
                        if (var8 != 0) {
                            byte[] var10 = signlink.cacheload("m" + var6 + "_" + var7);
                            if (var10 != null) {
                                this.field1080.reset();
                                this.field1080.update(var10);
                                if ((int) this.field1080.getValue() != var8) {
                                    var10 = null;
                                }
                            }
                            if (var10 != null) {
                                this.field1111[var5] = var10;
                            } else {
                                this.field995 = 0;
                                this.field1043.method178(0);
                                this.field1043.method178(var6);
                                this.field1043.method178(var7);
                                var4 += 3;
                            }
                        }
                        if (var9 != 0) {
                            byte[] var11 = signlink.cacheload("l" + var6 + "_" + var7);
                            if (var11 != null) {
                                this.field1080.reset();
                                this.field1080.update(var11);
                                if ((int) this.field1080.getValue() != var9) {
                                    var11 = null;
                                }
                            }
                            if (var11 != null) {
                                this.field1142[var5] = var11;
                            } else {
                                this.field995 = 0;
                                this.field1043.method178(1);
                                this.field1043.method178(var6);
                                this.field1043.method178(var7);
                                var4 += 3;
                            }
                        }
                    }
                    this.field1043.method184(-529, var4);
                    signlink.looprate(100);
                    int var12 = this.field1272 - this.field1274;
                    int var13 = this.field1273 - this.field1275;
                    this.field1274 = this.field1272;
                    this.field1275 = this.field1273;
                    int var14 = 0;
                    label588: while (true) {
                        if (var14 >= 8192) {
                            for (int var17 = 0; var17 < this.field1081; ++var17) {
                                PlayerEntity var18 = this.field1083[var17];
                                if (var18 != null) {
                                    for (int var19 = 0; var19 < 10; ++var19) {
                                        var18.field327[var19] -= var12;
                                        var18.field328[var19] -= var13;
                                    }
                                    var18.field280 -= var12 * 128;
                                    var18.field281 -= var13 * 128;
                                }
                            }
                            byte var20 = 0;
                            byte var21 = 104;
                            byte var22 = 1;
                            if (var12 < 0) {
                                var20 = 103;
                                var21 = -1;
                                var22 = -1;
                            }
                            byte var23 = 0;
                            byte var24 = 104;
                            byte var25 = 1;
                            if (var13 < 0) {
                                var23 = 103;
                                var24 = -1;
                                var25 = -1;
                            }
                            for (int var26 = var20; var21 != var26; var26 += var22) {
                                for (int var27 = var23; var24 != var27; var27 += var25) {
                                    int var28 = var12 + var26;
                                    int var29 = var13 + var27;
                                    for (int var30 = 0; var30 < 4; ++var30) {
                                        if (var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104) {
                                            this.field1152[var30][var26][var27] = this.field1152[var30][var28][var29];
                                        } else {
                                            this.field1152[var30][var26][var27] = null;
                                        }
                                    }
                                }
                            }
                            LocMerged var31 = (LocMerged) this.field1044.method203();
                            while (true) {
                                if (var31 == null) {
                                    break label588;
                                }
                                var31.field600 -= var12;
                                var31.field601 -= var13;
                                if (var31.field600 < 0 || var31.field601 < 0 || var31.field600 >= 104 || var31.field601 >= 104) {
                                    var31.method89();
                                }
                                var31 = (LocMerged) this.field1044.method205(-14092);
                            }
                        }
                        NpcEntity var15 = this.field1281[var14];
                        if (var15 != null) {
                            for (int var16 = 0; var16 < 10; ++var16) {
                                var15.field327[var16] -= var12;
                                var15.field328[var16] -= var13;
                            }
                            var15.field280 -= var12 * 128;
                            var15.field281 -= var13 * 128;
                        }
                        ++var14;
                    }
                } else if (this.field1061 == 217) {
                    this.field1091 = this.field1055.method185();
                } else if (this.field1061 == 248) {
                    int var32 = this.field1055.method187();
                    int var33 = this.field1055.method187();
                    int var34 = var33 >> 10 & 31;
                    int var35 = var33 >> 5 & 31;
                    int var36 = var33 & 31;
                    Component.field862[var32].field901 = (var36 << 3) + (var34 << 19) + (var35 << 11);
                } else if (this.field1061 == 98) {
                    this.field993 = true;
                    int var37 = this.field1055.method185();
                    int var38 = this.field1055.method190();
                    int var39 = this.field1055.method185();
                    this.field984[var37] = var38;
                    this.field1147[var37] = var39;
                    this.field1132[var37] = 1;
                    for (int var40 = 0; var40 < 98; ++var40) {
                        if (var38 >= field1166[var40]) {
                            this.field1132[var37] = var40 + 2;
                        }
                    }
                } else if (this.field1061 == 5) {
                    for (int var41 = 0; var41 < this.field1083.length; ++var41) {
                        if (this.field1083[var41] != null) {
                            this.field1083[var41].field306 = -1;
                        }
                    }
                    for (int var42 = 0; var42 < this.field1281.length; ++var42) {
                        if (this.field1281[var42] != null) {
                            this.field1281[var42].field306 = -1;
                        }
                    }
                } else if (this.field1061 == 47) {
                    this.method365(this.field1060, (byte) -47, this.field1055);
                    if (this.field995 == 1) {
                        this.field995 = 2;
                        World.field36 = this.field1205;
                        this.method351(this.field1052);
                    }
                    if (field1012 && this.field995 == 2 && World.field36 != this.field1205) {
                        this.field1136.method210(0);
                        this.field1000.method168(151, this.field1223, 257, 0, "Loading - please wait.");
                        this.field1000.method168(150, this.field1223, 256, 16777215, "Loading - please wait.");
                        this.field1136.method211(super.field13, 8, 11);
                        World.field36 = this.field1205;
                        this.method351(this.field1052);
                    }
                    if (this.field1217 != this.field1205 && this.field995 == 2) {
                        this.field1217 = this.field1205;
                        this.method352(this.field1205, this.field1148);
                    }
                } else if (this.field1061 == 234) {
                    int var43 = this.field1055.method187();
                    int var44 = this.field1055.method185();
                    this.field1200[var44] = var43;
                    this.field993 = true;
                } else if (this.field1061 == 156) {
                    String var45 = this.field1055.method192();
                    if (!var45.endsWith(":tradereq:")) {
                        this.method391(0, "", var45, 36887);
                    } else {
                        String var46 = var45.substring(0, var45.indexOf(":"));
                        long var47 = JString.method226(var46);
                        boolean var49 = false;
                        for (int var50 = 0; var50 < this.field1168; ++var50) {
                            if (this.field1178[var50] == var47) {
                                var49 = true;
                                break;
                            }
                        }
                        if (!var49) {
                            this.method391(4, var46, "wishes to trade with you.", 36887);
                        }
                    }
                } else if (this.field1061 == 220) {
                    this.field1149 = this.field1055.method185();
                    this.field1112 = this.field1055.method185();
                    this.field1089 = this.field1055.method185();
                    this.field1241 = true;
                    this.field1107 = true;
                } else if (this.field1061 == 149) {
                    int var51 = this.field1055.method187();
                    int var52 = this.field1055.method187();
                    Component.field862[var51].field908 = var52;
                } else if (this.field1061 == 95) {
                    this.field1073 = this.field1055.method185();
                    this.field1074 = this.field1055.method185();
                } else if (this.field1061 == 235) {
                    this.field993 = true;
                    int var53 = this.field1055.method187();
                    byte var54 = this.field1055.method186();
                    if (this.field1284[var53] != var54) {
                        this.field1284[var53] = var54;
                        this.method385(6, var53);
                    }
                } else if (this.field1061 == 123) {
                    int var55 = this.field1055.method187();
                    Component.field862[var55].field906 = this.field1139.method97(1);
                } else if (this.field1061 == 44) {
                    int var56 = this.field1055.method185();
                    int var57 = this.field1055.method185();
                    int var58 = -1;
                    for (int var59 = 0; var59 < this.field1017.length; ++var59) {
                        if ((var56 << 8) + var57 == this.field1017[var59]) {
                            var58 = var59;
                        }
                    }
                    if (var58 != -1) {
                        signlink.cachesave("l" + var56 + "_" + var57, this.field1142[var58]);
                        this.field995 = 1;
                    }
                } else if (this.field1061 == 171) {
                    int var60 = this.field1055.method187();
                    this.method383(1, var60);
                    if (this.field1051 != -1) {
                        this.field1051 = -1;
                        this.field993 = true;
                        this.field1076 = true;
                    }
                    if (this.field1264 != -1) {
                        this.field1264 = -1;
                        this.field1107 = true;
                    }
                    if (this.field1054) {
                        this.field1054 = false;
                        this.field1107 = true;
                    }
                    this.field1056 = var60;
                    this.field1025 = false;
                } else if (this.field1061 == 197) {
                    int var61 = this.field1055.method185();
                    int var62 = this.field1055.method185();
                    int var63 = this.field1055.method187();
                    int var64 = this.field1055.method187();
                    int var65 = -1;
                    for (int var66 = 0; var66 < this.field1017.length; ++var66) {
                        if ((var61 << 8) + var62 == this.field1017[var66]) {
                            var65 = var66;
                        }
                    }
                    if (var65 != -1) {
                        if (this.field1111[var65] == null || this.field1111[var65].length != var64) {
                            this.field1111[var65] = new byte[var64];
                        }
                        this.field1055.method194(var63, this.field1060 - 6, this.field1111[var65], false);
                    }
                } else if (this.field1061 == 181) {
                    int var67 = this.field1055.method187();
                    int var68 = this.field1055.method187();
                    NpcType var69 = NpcType.method243(var68);
                    Component.field862[var67].field906 = var69.method246(-502);
                } else if (this.field1061 == 68) {
                    this.field993 = true;
                    int var70 = this.field1055.method187();
                    Component var71 = Component.field862[var70];
                    while (this.field1055.field586 < this.field1060) {
                        int var72 = this.field1055.method185();
                        int var73 = this.field1055.method187();
                        int var74 = this.field1055.method185();
                        if (var74 == 255) {
                            var74 = this.field1055.method190();
                        }
                        if (var72 >= 0 && var72 < var71.field863.length) {
                            var71.field863[var72] = var73;
                            var71.field864[var72] = var74;
                        }
                    }
                } else if (this.field1061 != 153 && this.field1061 != 90 && this.field1061 != 59 && this.field1061 != 60 && this.field1061 != 250 && this.field1061 != 127 && this.field1061 != 175 && this.field1061 != 35 && this.field1061 != 22) {
                    if (this.field1061 == 61) {
                        int var75 = this.field1055.method187();
                        boolean var76 = this.field1055.method185() == 1;
                        Component.field862[var75].field880 = var76;
                    } else if (this.field1061 == 80) {
                        if (this.field1051 != -1) {
                            this.field1051 = -1;
                            this.field993 = true;
                            this.field1076 = true;
                        }
                        if (this.field1264 != -1) {
                            this.field1264 = -1;
                            this.field1107 = true;
                        }
                        if (this.field1054) {
                            this.field1054 = false;
                            this.field1107 = true;
                        }
                        this.field1056 = -1;
                        this.field1025 = false;
                    } else if (this.field1061 == 225) {
                        int var77 = this.field1055.method185();
                        int var78 = this.field1055.method185();
                        int var79 = this.field1055.method187();
                        int var80 = this.field1055.method187();
                        int var81 = -1;
                        for (int var82 = 0; var82 < this.field1017.length; ++var82) {
                            if ((var77 << 8) + var78 == this.field1017[var82]) {
                                var81 = var82;
                            }
                        }
                        if (var81 != -1) {
                            if (this.field1142[var81] == null || this.field1142[var81].length != var80) {
                                this.field1142[var81] = new byte[var80];
                            }
                            this.field1055.method194(var79, this.field1060 - 6, this.field1142[var81], false);
                        }
                    } else if (this.field1061 == 51) {
                        int var83 = this.field1055.method185();
                        int var84 = this.field1055.method185();
                        int var85 = -1;
                        for (int var86 = 0; var86 < this.field1017.length; ++var86) {
                            if ((var83 << 8) + var84 == this.field1017[var86]) {
                                var85 = var86;
                            }
                        }
                        if (var85 != -1) {
                            signlink.cachesave("m" + var83 + "_" + var84, this.field1111[var85]);
                            this.field995 = 1;
                        }
                    } else if (this.field1061 == 100) {
                        this.method366(this.field1055, true, this.field1060);
                    } else if (this.field1061 == 210) {
                        int var87 = this.field1055.method187();
                        Component var88 = Component.field862[var87];
                        for (int var89 = 0; var89 < var88.field863.length; ++var89) {
                            var88.field863[var89] = -1;
                            var88.field863[var89] = 0;
                        }
                    } else if (this.field1061 == 42) {
                        int var90 = this.field1055.method187();
                        int var91 = this.field1055.method187();
                        Component.field862[var90].field906 = new Model(var91, this.field1013);
                    } else if (this.field1061 == 254) {
                        this.field1059 = this.field1055.method185();
                        this.field993 = true;
                        this.field1076 = true;
                    } else if (this.field1061 == 114) {
                        long var92 = this.field1055.method191(1);
                        int var94 = this.field1055.method185();
                        String var95 = JString.method230(JString.method227((byte) -89, var92), -591);
                        for (int var96 = 0; var96 < this.field1188; ++var96) {
                            if (var95.equals(this.field1199[var96])) {
                                if (this.field1285[var96] != var94) {
                                    this.field1285[var96] = var94;
                                    this.field993 = true;
                                    if (var94 > 0) {
                                        this.method391(5, "", var95 + " has logged in.", 36887);
                                    }
                                    if (var94 == 0) {
                                        this.method391(5, "", var95 + " has logged out.", 36887);
                                    }
                                }
                                var95 = null;
                                break;
                            }
                        }
                        if (var95 != null && this.field1188 < 100) {
                            this.field1199[this.field1188] = var95;
                            this.field1285[this.field1188] = var94;
                            ++this.field1188;
                            this.field993 = true;
                        }
                        boolean var97 = false;
                        while (!var97) {
                            var97 = true;
                            for (int var98 = 0; var98 < this.field1188 - 1; ++var98) {
                                if (this.field1285[var98] != this.field1198 && this.field1285[var98 + 1] == this.field1198 || this.field1285[var98] == 0 && this.field1285[var98 + 1] != 0) {
                                    int var99 = this.field1285[var98];
                                    this.field1285[var98] = this.field1285[var98 + 1];
                                    this.field1285[var98 + 1] = var99;
                                    String var100 = this.field1199[var98];
                                    this.field1199[var98] = this.field1199[var98 + 1];
                                    this.field1199[var98 + 1] = var100;
                                    this.field993 = true;
                                    var97 = false;
                                }
                            }
                        }
                    } else if (this.field1061 == 159) {
                        String var101 = this.field1055.method192();
                        if (!var101.equals(this.field1210)) {
                            this.field1210 = var101;
                            if (this.field1106) {
                                signlink.midi = var101;
                            }
                        }
                    } else if (this.field1061 == 119) {
                        this.field993 = true;
                        int var102 = this.field1055.method187();
                        int var103 = this.field1055.method190();
                        if (this.field1284[var102] != var103) {
                            this.field1284[var102] = var103;
                            this.method385(6, var102);
                        }
                    } else if (this.field1061 == 138) {
                        int var104 = this.field1055.method187();
                        int var105 = this.field1055.method187();
                        if (this.field1264 != -1) {
                            this.field1264 = -1;
                            this.field1107 = true;
                        }
                        if (this.field1054) {
                            this.field1054 = false;
                            this.field1107 = true;
                        }
                        this.field1056 = var104;
                        this.field1051 = var105;
                        this.field993 = true;
                        this.field1076 = true;
                        this.field1025 = false;
                    } else if (this.field1061 == 48) {
                        this.field1073 = this.field1055.method185();
                        this.field1074 = this.field1055.method185();
                        while (this.field1055.field586 < this.field1060) {
                            int var106 = this.field1055.method185();
                            this.method363(true, this.field1055, var106);
                        }
                    } else if (this.field1061 == 27) {
                        this.field1045 = this.field1055.method187();
                    } else if (this.field1061 == 85) {
                        if (this.field1106) {
                            signlink.jingle = this.field1055.method192();
                            signlink.jinglelen = this.field1055.method187();
                        }
                    } else if (this.field1061 == 227) {
                        this.field993 = true;
                        int var107 = this.field1055.method187();
                        Component var108 = Component.field862[var107];
                        int var109 = this.field1055.method185();
                        for (int var110 = 0; var110 < var109; ++var110) {
                            var108.field863[var110] = this.field1055.method187();
                            int var111 = this.field1055.method185();
                            if (var111 == 255) {
                                var111 = this.field1055.method190();
                            }
                            var108.field864[var110] = var111;
                        }
                        for (int var112 = var109; var112 < var108.field863.length; ++var112) {
                            var108.field863[var112] = 0;
                            var108.field864[var112] = 0;
                        }
                    } else if (this.field1061 == 188) {
                        this.field1073 = this.field1055.method185();
                        this.field1074 = this.field1055.method185();
                        int var113 = this.field1073;
                        label695: while (true) {
                            if (var113 >= this.field1073 + 8) {
                                LocMerged var115 = (LocMerged) this.field1044.method203();
                                while (true) {
                                    if (var115 == null) {
                                        break label695;
                                    }
                                    if (var115.field600 >= this.field1073 && var115.field600 < this.field1073 + 8 && var115.field601 >= this.field1074 && var115.field601 < this.field1074 + 8 && this.field1205 == var115.field598) {
                                        this.method362(var115.field598, var115.field607, var115.field601, (byte) 120, var115.field600, var115.field599, var115.field606, var115.field605);
                                        var115.method89();
                                    }
                                    var115 = (LocMerged) this.field1044.method205(-14092);
                                }
                            }
                            for (int var114 = this.field1074; var114 < this.field1074 + 8; ++var114) {
                                if (this.field1152[this.field1205][var113][var114] != null) {
                                    this.field1152[this.field1205][var113][var114] = null;
                                    this.method364(var113, var114);
                                }
                            }
                            ++var113;
                        }
                    } else if (this.field1061 == 9) {
                        int var116 = this.field1055.method187();
                        String var117 = this.field1055.method192();
                        Component.field862[var116].field899 = var117;
                    } else {
                        if (this.field1061 == 126) {
                            this.method342(-36905);
                            return false;
                        }
                        if (this.field1061 != 229) {
                            if (this.field1061 == 6) {
                                this.field1168 = this.field1060 / 8;
                                for (int var126 = 0; var126 < this.field1168; ++var126) {
                                    this.field1178[var126] = this.field1055.method191(1);
                                }
                            } else if (this.field1061 == 53) {
                                this.field1079 = this.field1055.method187() * 30;
                            } else if (this.field1061 == 116) {
                                int var127 = this.field1055.method187();
                                this.method383(1, var127);
                                if (this.field1051 != -1) {
                                    this.field1051 = -1;
                                    this.field993 = true;
                                    this.field1076 = true;
                                }
                                this.field1264 = var127;
                                this.field1107 = true;
                                this.field1056 = -1;
                                this.field1025 = false;
                            } else if (this.field1061 == 107) {
                                int var128 = this.field1055.method187();
                                int var129 = this.field1055.method187();
                                int var130 = this.field1055.method187();
                                ObjType var131 = ObjType.method249(var129);
                                Component.field862[var128].field906 = var131.method252();
                                Component.field862[var128].field911 = var131.field798;
                                Component.field862[var128].field912 = var131.field799;
                                Component.field862[var128].field910 = var131.field797 * 100 / var130;
                            } else if (this.field1061 == 75) {
                                this.field980 = false;
                                this.field1054 = true;
                                this.field1165 = "";
                                this.field1107 = true;
                            } else if (this.field1061 == 124) {
                                int var132 = this.field1055.method187();
                                this.method383(1, var132);
                                if (this.field1264 != -1) {
                                    this.field1264 = -1;
                                    this.field1107 = true;
                                }
                                if (this.field1054) {
                                    this.field1054 = false;
                                    this.field1107 = true;
                                }
                                this.field1051 = var132;
                                this.field993 = true;
                                this.field1076 = true;
                                this.field1056 = -1;
                                this.field1025 = false;
                            }
                        } else {
                            long var118 = this.field1055.method191(1);
                            int var120 = this.field1055.method190();
                            boolean var121 = false;
                            for (int var122 = 0; var122 < 100; ++var122) {
                                if (this.field1114[var122] == var120) {
                                    var121 = true;
                                    break;
                                }
                            }
                            for (int var123 = 0; var123 < this.field1168; ++var123) {
                                if (this.field1178[var123] == var118) {
                                    var121 = true;
                                    break;
                                }
                            }
                            if (!var121) {
                                this.field1114[this.field1004] = var120;
                                this.field1004 = (this.field1004 + 1) % 100;
                                String var124 = WordPack.method233(false, this.field1055, this.field1060 - 12);
                                String var125 = WordFilter.method296(this.field1293, var124);
                                this.method391(3, JString.method230(JString.method227((byte) -89, var118), -591), var125, 36887);
                            }
                        }
                    }
                } else {
                    this.method363(true, this.field1055, this.field1061);
                }
                this.field1061 = -1;
            } catch (IOException var134) {
                this.method343((byte) 4);
            } catch (Exception var135) {
                this.method342(-36905);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIBIIII)V")
    public final void method362(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 120) {
            this.field1061 = -1;
        }
        if (!field1012 || this.field1205 == arg0) {
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg5 == 0) {
                var9 = this.field1153.method59(arg0, arg4, arg2);
            }
            if (arg5 == 1) {
                var9 = this.field1153.method60(arg0, arg2, (byte) -73, arg4);
            }
            if (arg5 == 2) {
                var9 = this.field1153.method61(arg0, arg4, arg2);
            }
            if (arg5 == 3) {
                var9 = this.field1153.method62(arg0, arg4, arg2);
            }
            if (var9 != 0) {
                int var13 = this.field1153.method63(arg0, arg4, arg2, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg5 == 0) {
                    this.field1153.method54(arg0, arg4, arg2, -415);
                    LocType var17 = LocType.method237(var14);
                    if (var17.field728) {
                        this.field985[arg0].method261(var17.field729, var16, arg4, 2, var15, arg2);
                    }
                }
                if (arg5 == 1) {
                    this.field1153.method55(arg0, -101, arg4, arg2);
                }
                if (arg5 == 2) {
                    this.field1153.method56(arg0, 685, arg2, arg4);
                    LocType var18 = LocType.method237(var14);
                    if (var18.field728) {
                        this.field985[arg0].method262(arg4, var18.field729, false, var18.field726, var18.field727, var16, arg2);
                    }
                }
                if (arg5 == 3) {
                    this.field1153.method57(arg0, arg2, arg4, (byte) 7);
                    LocType var19 = LocType.method237(var14);
                    if (var19.field728 && var19.field730) {
                        this.field985[arg0].method264(this.field1167, arg2, arg4);
                    }
                }
            }
            if (arg7 >= 0) {
                int var20 = arg0;
                if (arg0 < 3 && (this.field1250[1][arg4][arg2] & 2) == 2) {
                    var20 = arg0 + 1;
                }
                World.method27(var20, this.field1209, arg2, arg0, arg6, this.field985[arg0], this.field1103, arg7, this.field1153, arg4, arg1, 210);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLjb;I)V")
    public final void method363(boolean arg0, Packet arg1, int arg2) {
        if (!arg0) {
            this.field1043.method178(252);
        }
        if (arg2 != 22 && arg2 != 35) {
            if (arg2 == 175) {
                int var4 = arg1.method185();
                int var5 = (var4 >> 4 & 7) + this.field1073;
                int var6 = (var4 & 7) + this.field1074;
                int var7 = arg1.method185();
                int var8 = var7 >> 2;
                int var9 = this.field1115[var8];
                int var10 = arg1.method187();
                if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                    int var11 = 0;
                    if (var9 == 1) {
                        var11 = this.field1153.method60(this.field1205, var6, (byte) -73, var5);
                    }
                    if (var9 == 2) {
                        var11 = this.field1153.method61(this.field1205, var5, var6);
                    }
                    if (var11 != 0) {
                        LocEntity var12 = new LocEntity(var9, this.field1205, var11 >> 14 & 32767, 5858, SeqType.field927[var10], var5, var6);
                        this.field1209.method201(var12);
                    }
                }
            } else if (arg2 == 127) {
                int var13 = arg1.method185();
                int var14 = (var13 >> 4 & 7) + this.field1073;
                int var15 = (var13 & 7) + this.field1074;
                int var16 = arg1.method187();
                if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                    ObjStackEntity var17 = new ObjStackEntity();
                    var17.field277 = var16;
                    if (this.field1152[this.field1205][var14][var15] == null) {
                        this.field1152[this.field1205][var14][var15] = new LinkList(845);
                    }
                    this.field1152[this.field1205][var14][var15].method201(var17);
                    this.method364(var14, var15);
                }
            } else if (arg2 == 250) {
                int var18 = arg1.method185();
                int var19 = (var18 >> 4 & 7) + this.field1073;
                int var20 = (var18 & 7) + this.field1074;
                int var21 = arg1.method187();
                if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                    LinkList var22 = this.field1152[this.field1205][var19][var20];
                    if (var22 != null) {
                        for (ObjStackEntity var23 = (ObjStackEntity) var22.method203(); var23 != null; var23 = (ObjStackEntity) var22.method205(-14092)) {
                            if ((var21 & 32767) == var23.field277) {
                                var23.method89();
                                break;
                            }
                        }
                        if (var22.method203() == null) {
                            this.field1152[this.field1205][var19][var20] = null;
                        }
                        this.method364(var19, var20);
                    }
                }
            } else if (arg2 == 60) {
                int var24 = arg1.method185();
                int var25 = (var24 >> 4 & 7) + this.field1073;
                int var26 = (var24 & 7) + this.field1074;
                int var27 = var25 + arg1.method186();
                int var28 = var26 + arg1.method186();
                int var29 = arg1.method188();
                int var30 = arg1.method187();
                int var31 = arg1.method185();
                int var32 = arg1.method185();
                int var33 = arg1.method187();
                int var34 = arg1.method187();
                int var35 = arg1.method185();
                int var36 = arg1.method185();
                if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                    int var37 = var25 * 128 + 64;
                    int var38 = var26 * 128 + 64;
                    int var39 = var27 * 128 + 64;
                    int var40 = var28 * 128 + 64;
                    ProjectileEntity var41 = new ProjectileEntity(this.field1205, var36, var37, this.field1141, var35, this.method349(var37, (byte) 42, var38, this.field1205) - var31, var30, field994 + var33, var32, var38, field994 + var34, var29);
                    var41.method99(var40, this.method349(var39, (byte) 42, var40, this.field1205) - var32, var39, this.field1008, field994 + var33);
                    this.field1244.method201(var41);
                }
            } else if (arg2 == 59) {
                int var42 = arg1.method185();
                int var43 = (var42 >> 4 & 7) + this.field1073;
                int var44 = (var42 & 7) + this.field1074;
                int var45 = arg1.method187();
                int var46 = arg1.method185();
                int var47 = arg1.method187();
                if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                    int var48 = var43 * 128 + 64;
                    int var49 = var44 * 128 + 64;
                    SpotAnimEntity var50 = new SpotAnimEntity(this.method349(var48, (byte) 42, var49, this.field1205) - var46, 0, var47, var45, this.field1205, var48, var49, field994);
                    this.field1022.method201(var50);
                }
            } else if (arg2 == 90) {
                int var51 = arg1.method185();
                int var52 = (var51 >> 4 & 7) + this.field1073;
                int var53 = (var51 & 7) + this.field1074;
                int var54 = arg1.method187();
                int var55 = arg1.method187();
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && this.field1045 != var55) {
                    ObjStackEntity var56 = new ObjStackEntity();
                    var56.field277 = var54;
                    if (this.field1152[this.field1205][var52][var53] == null) {
                        this.field1152[this.field1205][var52][var53] = new LinkList(845);
                    }
                    this.field1152[this.field1205][var52][var53].method201(var56);
                    this.method364(var52, var53);
                }
            } else {
                if (arg2 == 153) {
                    int var57 = arg1.method185();
                    int var58 = (var57 >> 4 & 7) + this.field1073;
                    int var59 = (var57 & 7) + this.field1074;
                    int var60 = arg1.method185();
                    int var61 = var60 >> 2;
                    int var62 = var60 & 3;
                    int var63 = this.field1115[var61];
                    int var64 = arg1.method187();
                    int var65 = arg1.method187();
                    int var66 = arg1.method187();
                    int var67 = arg1.method187();
                    byte var68 = arg1.method186();
                    byte var69 = arg1.method186();
                    byte var70 = arg1.method186();
                    byte var71 = arg1.method186();
                    PlayerEntity var72;
                    if (this.field1045 == var67) {
                        var72 = this.field1139;
                    } else {
                        var72 = this.field1083[var67];
                    }
                    if (var72 != null) {
                        LocSpawned var73 = new LocSpawned(var61, (byte) 4, field994 + var65, this.field1205, var59, var62, -1, var63, var58);
                        this.field1215.method201(var73);
                        LocSpawned var74 = new LocSpawned(var61, (byte) 4, field994 + var66, this.field1205, var59, var62, var64, var63, var58);
                        this.field1215.method201(var74);
                        int var75 = this.field1103[this.field1205][var58][var59];
                        int var76 = this.field1103[this.field1205][var58 + 1][var59];
                        int var77 = this.field1103[this.field1205][var58 + 1][var59 + 1];
                        int var78 = this.field1103[this.field1205][var58][var59 + 1];
                        LocType var79 = LocType.method237(var64);
                        var72.field345 = field994 + var65;
                        var72.field346 = field994 + var66;
                        var72.field350 = var79.method240(var61, var62, var75, var76, var77, var78, -1);
                        int var80 = var79.field726;
                        int var81 = var79.field727;
                        if (var62 == 1 || var62 == 3) {
                            var80 = var79.field727;
                            var81 = var79.field726;
                        }
                        var72.field347 = var58 * 128 + var80 * 64;
                        var72.field349 = var59 * 128 + var81 * 64;
                        var72.field348 = this.method349(var72.field347, (byte) 42, var72.field349, this.field1205);
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
                        var72.field351 = var58 + var68;
                        var72.field353 = var58 + var70;
                        var72.field352 = var59 + var69;
                        var72.field354 = var59 + var71;
                    }
                }
            }
        } else {
            int var84 = arg1.method185();
            int var85 = (var84 >> 4 & 7) + this.field1073;
            int var86 = (var84 & 7) + this.field1074;
            int var87 = arg1.method185();
            int var88 = var87 >> 2;
            int var89 = var87 & 3;
            int var90 = this.field1115[var88];
            int var91;
            if (arg2 == 35) {
                var91 = -1;
            } else {
                var91 = arg1.method187();
            }
            if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                LocMerged var92 = null;
                for (LocMerged var93 = (LocMerged) this.field1044.method203(); var93 != null; var93 = (LocMerged) this.field1044.method205(-14092)) {
                    if (this.field1205 == var93.field598 && var93.field600 == var85 && var93.field601 == var86 && var93.field599 == var90) {
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
                        var94 = this.field1153.method59(this.field1205, var85, var86);
                    }
                    if (var90 == 1) {
                        var94 = this.field1153.method60(this.field1205, var86, (byte) -73, var85);
                    }
                    if (var90 == 2) {
                        var94 = this.field1153.method61(this.field1205, var85, var86);
                    }
                    if (var90 == 3) {
                        var94 = this.field1153.method62(this.field1205, var85, var86);
                    }
                    if (var94 != 0) {
                        int var98 = this.field1153.method63(this.field1205, var85, var86, var94);
                        var95 = var94 >> 14 & 32767;
                        var96 = var98 & 31;
                        var97 = var98 >> 6;
                    }
                    var92 = new LocMerged();
                    var92.field598 = this.field1205;
                    var92.field599 = var90;
                    var92.field600 = var85;
                    var92.field601 = var86;
                    var92.field605 = var95;
                    var92.field607 = var96;
                    var92.field606 = var97;
                    this.field1044.method201(var92);
                }
                var92.field602 = var91;
                var92.field604 = var88;
                var92.field603 = var89;
                this.method362(this.field1205, var88, var86, (byte) 120, var85, var90, var89, var91);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)V")
    public final void method364(int arg0, int arg1) {
        LinkList var3 = this.field1152[this.field1205][arg0][arg1];
        if (var3 == null) {
            this.field1153.method58(this.field1205, arg0, arg1);
        } else {
            int var4 = -99999999;
            ObjType var5 = null;
            for (ObjStackEntity var6 = (ObjStackEntity) var3.method203(); var6 != null; var6 = (ObjStackEntity) var3.method205(-14092)) {
                ObjType var8 = ObjType.method249(var6.field277);
                if (var8.field806 > var4) {
                    var4 = var8.field806;
                    var5 = var8;
                }
            }
            int var7 = (arg1 << 7) + arg0 + 1610612736;
            this.field1153.method43(this.method349(arg0 * 128 + 64, (byte) 42, arg1 * 128 + 64, this.field1205), this.field1205, var7, var5.method252(), arg0, (byte) 0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBLjb;)V")
    public final void method365(int arg0, byte arg1, Packet arg2) {
        if (arg1 == -47) {
            int var4 = 0;
            arg2.method195(0);
            this.field1205 = arg2.method196(737, 2);
            int var5 = arg2.method196(737, 7);
            int var6 = arg2.method196(737, 7);
            int var7 = arg2.method196(737, 1);
            if (var7 == 1) {
                this.field1086[var4++] = this.field1082;
            }
            this.field1139.method91(this.field1190, var5, var6);
            this.field1179 = 0;
            int var8 = arg2.method196(737, 8);
            if (var8 < this.field1282) {
                for (int var9 = var8; var9 < this.field1084; ++var9) {
                    this.field1180[this.field1179++] = this.field1085[var9];
                    this.field1083[this.field1085[var9]].field323 = true;
                }
            }
            this.field1084 = 0;
            for (int var10 = 0; var10 < var8; ++var10) {
                int var35 = this.field1085[var10];
                PlayerEntity var36 = this.field1083[var35];
                int var37 = arg2.method196(737, 1);
                if (var37 == 0) {
                    this.field1085[this.field1084++] = var35;
                } else {
                    int var38 = arg2.method196(737, 2);
                    if (var38 == 3) {
                        this.field1180[this.field1179++] = var35;
                        var36.field323 = true;
                    } else {
                        this.field1085[this.field1084++] = var35;
                        if (var38 == 0) {
                            this.field1086[var4++] = var35;
                        } else {
                            if (var38 == 2) {
                                this.field1086[var4++] = var35;
                            }
                            int var39 = arg2.method196(737, 3);
                            if (var39 == 0) {
                                var36.method92(false, 1, -1);
                            }
                            if (var39 == 1) {
                                var36.method92(false, 1, 0);
                            }
                            if (var39 == 2) {
                                var36.method92(false, 1, 1);
                            }
                            if (var39 == 3) {
                                var36.method92(false, 0, -1);
                            }
                            if (var39 == 4) {
                                var36.method92(false, 0, 1);
                            }
                            if (var39 == 5) {
                                var36.method92(false, -1, -1);
                            }
                            if (var39 == 6) {
                                var36.method92(false, -1, 0);
                            }
                            if (var39 == 7) {
                                var36.method92(false, -1, 1);
                            }
                        }
                    }
                }
            }
            while (true) {
                int var11 = arg2.method196(737, 11);
                if (var11 == 2047 || arg2.field587 + 10 >= arg0 * 8) {
                    arg2.method197(0);
                    for (int var15 = 0; var15 < var4; ++var15) {
                        int var18 = this.field1086[var15];
                        PlayerEntity var19 = this.field1083[var18];
                        int var20 = arg2.method185();
                        if ((var20 & 128) == 128) {
                            var20 += arg2.method185() << 8;
                        }
                        if ((var20 & 1) == 1) {
                            int var21 = arg2.method185();
                            byte[] var22 = new byte[var21];
                            Packet var23 = new Packet(var22, (byte) 63);
                            arg2.method194(0, var21, var22, false);
                            this.field1087[var18] = var23;
                            var19.method95(var23, -384);
                        }
                        if ((var20 & 2) == 2) {
                            int var24 = arg2.method187();
                            if (var24 == 65535) {
                                var24 = -1;
                            }
                            if (var19.field306 == var24) {
                                var19.field310 = 0;
                            }
                            int var25 = arg2.method185();
                            if (var24 == -1 || var19.field306 == -1 || SeqType.field927[var24].field935 > SeqType.field927[var19.field306].field935) {
                                var19.field306 = var24;
                                var19.field307 = 0;
                                var19.field308 = 0;
                                var19.field309 = var25;
                                var19.field310 = 0;
                            }
                        }
                        if ((var20 & 4) == 4) {
                            var19.field300 = arg2.method187();
                            if (var19.field300 == 65535) {
                                var19.field300 = -1;
                            }
                        }
                        if ((var20 & 8) == 8) {
                            var19.field291 = arg2.method192();
                            var19.field293 = 0;
                            var19.field294 = 0;
                            var19.field292 = 150;
                            this.method391(2, var19.field336, var19.field291, 36887);
                        }
                        if ((var20 & 16) == 16) {
                            var19.field295 = arg2.method185();
                            var19.field296 = arg2.method185();
                            var19.field297 = field994 + 400;
                            var19.field298 = arg2.method185();
                            var19.field299 = arg2.method185();
                        }
                        if ((var20 & 32) == 32) {
                            var19.field301 = arg2.method187();
                            var19.field302 = arg2.method187();
                        }
                        if ((var20 & 64) == 64) {
                            int var26 = arg2.method187();
                            int var27 = arg2.method185();
                            long var28 = JString.method226(var19.field336);
                            boolean var30 = false;
                            for (int var31 = 0; var31 < this.field1168; ++var31) {
                                if (this.field1178[var31] == var28) {
                                    var30 = true;
                                    break;
                                }
                            }
                            if (!var30) {
                                String var32 = WordPack.method233(false, arg2, var27);
                                String var33 = WordFilter.method296(this.field1293, var32);
                                var19.field291 = var33;
                                var19.field293 = var26 >> 8;
                                var19.field294 = var26 & 255;
                                var19.field292 = 150;
                                this.method391(2, var19.field336, var33, 36887);
                            }
                        }
                        if ((var20 & 256) == 256) {
                            var19.field311 = arg2.method187();
                            int var34 = arg2.method190();
                            var19.field315 = var34 >> 16;
                            var19.field314 = (var34 & 65535) + field994;
                            var19.field312 = 0;
                            var19.field313 = 0;
                            if (var19.field314 > field994) {
                                var19.field312 = -1;
                            }
                            if (var19.field311 == 65535) {
                                var19.field311 = -1;
                            }
                        }
                        if ((var20 & 512) == 512) {
                            var19.field316 = arg2.method185();
                            var19.field318 = arg2.method185();
                            var19.field317 = arg2.method185();
                            var19.field319 = arg2.method185();
                            var19.field320 = arg2.method187() + field994;
                            var19.field321 = arg2.method187() + field994;
                            var19.field322 = arg2.method185();
                            var19.field326 = 0;
                            var19.field327[0] = var19.field317;
                            var19.field328[0] = var19.field319;
                        }
                    }
                    for (int var16 = 0; var16 < this.field1179; ++var16) {
                        int var17 = this.field1180[var16];
                        if (this.field1083[var17].field323) {
                            this.method356(false, var17);
                        }
                    }
                    return;
                }
                if (this.field1083[var11] == null) {
                    this.field1083[var11] = new PlayerEntity();
                    if (this.field1087[var11] != null) {
                        this.field1083[var11].method95(this.field1087[var11], -384);
                    }
                }
                this.field1085[this.field1084++] = var11;
                PlayerEntity var12 = this.field1083[var11];
                var12.field323 = false;
                int var13 = arg2.method196(737, 5);
                if (var13 > 15) {
                    var13 -= 32;
                }
                int var14 = arg2.method196(737, 5);
                if (var14 > 15) {
                    var14 -= 32;
                }
                var12.method91(this.field1190, this.field1139.field327[0] + var13, this.field1139.field328[0] + var14);
                this.field1086[var4++] = var11;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljb;ZI)V")
    public final void method366(Packet arg0, boolean arg1, int arg2) {
        this.field1179 = 0;
        this.field1172 &= arg1;
        arg0.method195(0);
        int var4 = arg0.method196(737, 8);
        if (var4 < this.field1282) {
            for (int var5 = var4; var5 < this.field1282; ++var5) {
                this.field1180[this.field1179++] = this.field1283[var5];
                this.field1281[this.field1283[var5]].field323 = true;
            }
        }
        int var6 = 0;
        this.field1282 = 0;
        for (int var7 = 0; var7 < var4; ++var7) {
            int var22 = this.field1283[var7];
            NpcEntity var23 = this.field1281[var22];
            int var24 = arg0.method196(737, 1);
            if (var24 == 0) {
                this.field1283[this.field1282++] = var22;
            } else {
                int var25 = arg0.method196(737, 2);
                if (var25 == 3) {
                    this.field1180[this.field1179++] = var22;
                    var23.field323 = true;
                } else {
                    this.field1283[this.field1282++] = var22;
                    if (var25 == 0) {
                        this.field1086[var6++] = var22;
                    } else {
                        if (var25 == 2) {
                            this.field1086[var6++] = var22;
                        }
                        int var26 = arg0.method196(737, 3);
                        if (var26 == 0) {
                            var23.method92(false, 1, -1);
                        }
                        if (var26 == 1) {
                            var23.method92(false, 1, 0);
                        }
                        if (var26 == 2) {
                            var23.method92(false, 1, 1);
                        }
                        if (var26 == 3) {
                            var23.method92(false, 0, -1);
                        }
                        if (var26 == 4) {
                            var23.method92(false, 0, 1);
                        }
                        if (var26 == 5) {
                            var23.method92(false, -1, -1);
                        }
                        if (var26 == 6) {
                            var23.method92(false, -1, 0);
                        }
                        if (var26 == 7) {
                            var23.method92(false, -1, 1);
                        }
                    }
                }
            }
        }
        while (true) {
            int var8 = arg0.method196(737, 13);
            if (var8 == 8191 || arg0.field587 + 21 >= arg2 * 8) {
                arg0.method197(0);
                for (int var13 = 0; var13 < var6; ++var13) {
                    int var16 = this.field1086[var13];
                    NpcEntity var17 = this.field1281[var16];
                    int var18 = arg0.method185();
                    if ((var18 & 2) == 2) {
                        int var19 = arg0.method187();
                        if (var19 == 65535) {
                            var19 = -1;
                        }
                        if (var17.field306 == var19) {
                            var17.field310 = 0;
                        }
                        int var20 = arg0.method185();
                        if (var19 == -1 || var17.field306 == -1 || SeqType.field927[var19].field935 > SeqType.field927[var17.field306].field935) {
                            var17.field306 = var19;
                            var17.field307 = 0;
                            var17.field308 = 0;
                            var17.field309 = var20;
                            var17.field310 = 0;
                        }
                    }
                    if ((var18 & 4) == 4) {
                        var17.field300 = arg0.method187();
                        if (var17.field300 == 65535) {
                            var17.field300 = -1;
                        }
                    }
                    if ((var18 & 8) == 8) {
                        var17.field291 = arg0.method192();
                        var17.field292 = 100;
                    }
                    if ((var18 & 16) == 16) {
                        var17.field295 = arg0.method185();
                        var17.field296 = arg0.method185();
                        var17.field297 = field994 + 400;
                        var17.field298 = arg0.method185();
                        var17.field299 = arg0.method185();
                    }
                    if ((var18 & 32) == 32) {
                        var17.field331 = NpcType.method243(arg0.method187());
                        var17.field285 = var17.field331.field765;
                        var17.field286 = var17.field331.field766;
                        var17.field287 = var17.field331.field767;
                        var17.field288 = var17.field331.field768;
                        var17.field289 = var17.field331.field764;
                    }
                    if ((var18 & 64) == 64) {
                        var17.field311 = arg0.method187();
                        int var21 = arg0.method190();
                        var17.field315 = var21 >> 16;
                        var17.field314 = (var21 & 65535) + field994;
                        var17.field312 = 0;
                        var17.field313 = 0;
                        if (var17.field314 > field994) {
                            var17.field312 = -1;
                        }
                        if (var17.field311 == 65535) {
                            var17.field311 = -1;
                        }
                    }
                }
                for (int var14 = 0; var14 < this.field1179; ++var14) {
                    int var15 = this.field1180[var14];
                    if (this.field1281[var15].field323) {
                        this.method358(var15, true);
                    }
                }
                return;
            }
            this.field1283[this.field1282++] = var8;
            if (this.field1281[var8] == null) {
                this.field1281[var8] = new NpcEntity();
            }
            NpcEntity var9 = this.field1281[var8];
            var9.field323 = false;
            var9.field331 = NpcType.method243(arg0.method196(737, 11));
            var9.field284 = var9.field331.field761;
            var9.field285 = var9.field331.field765;
            var9.field286 = var9.field331.field766;
            var9.field287 = var9.field331.field767;
            var9.field288 = var9.field331.field768;
            var9.field289 = var9.field331.field764;
            int var10 = arg0.method196(737, 5);
            if (var10 > 15) {
                var10 -= 32;
            }
            int var11 = arg0.method196(737, 5);
            if (var11 > 15) {
                var11 -= 32;
            }
            var9.method91(this.field1190, this.field1139.field327[0] + var10, this.field1139.field328[0] + var11);
            int var12 = arg0.method196(737, 1);
            if (var12 == 1) {
                this.field1086[var6++] = var8;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public final void method367(boolean arg0) {
        this.field1172 &= arg0;
        if (this.field1175 >= 2 || this.field1066 != 0 || this.field1194 != 0) {
            String var2;
            if (this.field1066 == 1 && this.field1175 < 2) {
                var2 = "Use " + this.field1070 + " with...";
            } else if (this.field1194 == 1 && this.field1175 < 2) {
                var2 = this.field1197 + "...";
            } else {
                var2 = this.field978[this.field1175 - 1];
            }
            if (this.field1175 > 2) {
                var2 = var2 + "@whi@ / " + (this.field1175 - 2) + " more options";
            }
            this.field1001.method173(true, 4, 15, 16777215, true, var2);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method368(boolean arg0) {
        int var2 = this.field1160;
        int var3 = this.field1161;
        int var4 = this.field1162;
        int var5 = this.field1163;
        int var6 = 6116423;
        Pix2D.method131(var6, var4, var3, false, var5, var2);
        Pix2D.method131(0, var4 - 2, var3 + 1, false, 16, var2 + 1);
        Pix2D.method132(var4 - 2, var5 - 19, var2 + 1, var3 + 18, true, 0);
        this.field1001.method171("Choose Option", var2 + 3, var3 + 14, var6, -200);
        if (arg0) {
            this.method6();
        }
        int var7 = super.field20;
        int var8 = super.field21;
        if (this.field1159 == 0) {
            var7 -= 8;
            var8 -= 11;
        }
        if (this.field1159 == 1) {
            var7 -= 562;
            var8 -= 231;
        }
        for (int var9 = 0; var9 < this.field1175; ++var9) {
            int var10 = (this.field1175 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field1001.method173(true, var2 + 3, var10, var11, true, this.field978[var9]);
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method369(int arg0) {
        if (arg0 <= 0) {
            this.field1208 = 371;
        }
        int var2 = super.field22;
        if (this.field1194 == 1 && super.field23 >= 520 && super.field24 >= 165 && super.field23 <= 788 && super.field24 <= 230) {
            var2 = 0;
        }
        if (this.field1228) {
            if (var2 != 1) {
                int var3 = super.field20;
                int var4 = super.field21;
                if (this.field1159 == 0) {
                    var3 -= 8;
                    var4 -= 11;
                }
                if (this.field1159 == 1) {
                    var3 -= 562;
                    var4 -= 231;
                }
                if (var3 < this.field1160 - 10 || var3 > this.field1162 + this.field1160 + 10 || var4 < this.field1161 - 10 || var4 > this.field1163 + this.field1161 + 10) {
                    this.field1228 = false;
                    if (this.field1159 == 1) {
                        this.field993 = true;
                    }
                }
            }
            if (var2 == 1) {
                int var5 = this.field1160;
                int var6 = this.field1161;
                int var7 = this.field1162;
                int var8 = super.field23;
                int var9 = super.field24;
                if (this.field1159 == 0) {
                    var8 -= 8;
                    var9 -= 11;
                }
                if (this.field1159 == 1) {
                    var8 -= 562;
                    var9 -= 231;
                }
                int var10 = -1;
                for (int var11 = 0; var11 < this.field1175; ++var11) {
                    int var12 = (this.field1175 - 1 - var11) * 15 + var6 + 31;
                    if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                        var10 = var11;
                    }
                }
                if (var10 != -1) {
                    this.method370(var10, -753);
                }
                this.field1228 = false;
                if (this.field1159 == 1) {
                    this.field993 = true;
                    return;
                }
            }
        } else {
            if (var2 == 1 && this.field1171 == 1 && this.field1175 > 2) {
                var2 = 2;
            }
            if (var2 == 1 && this.field1175 > 0) {
                this.method370(this.field1175 - 1, -753);
            }
            if (var2 == 2 && this.field1175 > 0) {
                int var13 = this.field1001.method170(331, "Choose Option");
                for (int var14 = 0; var14 < this.field1175; ++var14) {
                    int var20 = this.field1001.method170(331, this.field978[var14]);
                    if (var20 > var13) {
                        var13 = var20;
                    }
                }
                var13 += 8;
                int var15 = this.field1175 * 15 + 21;
                if (super.field23 > 8 && super.field24 > 11 && super.field23 < 520 && super.field24 < 345) {
                    int var16 = super.field23 - 8 - var13 / 2;
                    if (var13 + var16 > 512) {
                        var16 = 512 - var13;
                    }
                    if (var16 < 0) {
                        var16 = 0;
                    }
                    int var17 = super.field24 - 11;
                    if (var15 + var17 > 334) {
                        var17 = 334 - var15;
                    }
                    if (var17 < 0) {
                        var17 = 0;
                    }
                    this.field1228 = true;
                    this.field1159 = 0;
                    this.field1160 = var16;
                    this.field1161 = var17;
                    this.field1162 = var13;
                    this.field1163 = this.field1175 * 15 + 22;
                }
                if (super.field23 > 562 && super.field24 > 231 && super.field23 < 752 && super.field24 < 492) {
                    int var18 = super.field23 - 562 - var13 / 2;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var13 + var18 > 190) {
                        var18 = 190 - var13;
                    }
                    int var19 = super.field24 - 231;
                    if (var19 < 0) {
                        var19 = 0;
                    } else if (var15 + var19 > 261) {
                        var19 = 261 - var15;
                    }
                    this.field1228 = true;
                    this.field1159 = 1;
                    this.field1160 = var18;
                    this.field1161 = var19;
                    this.field1162 = var13;
                    this.field1163 = this.field1175 * 15 + 22;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method370(int arg0, int arg1) {
        if (arg0 >= 0) {
            if (this.field1054) {
                this.field1054 = false;
                this.field1107 = true;
            }
            int var3 = this.field1116[arg0];
            int var4 = this.field1117[arg0];
            int var5 = this.field1118[arg0];
            int var6 = this.field1119[arg0];
            while (arg1 >= 0) {
                this.field1008 = this.field1021.method221();
            }
            if (var5 == 636) {
                PlayerEntity var7 = this.field1083[var6];
                if (var7 != null) {
                    this.method360(var7.field328[0], true, 0, false, 1, var7.field327[0], this.field1139.field327[0], 0, 1, 0, this.field1139.field328[0]);
                    this.field1183 = super.field23;
                    this.field1184 = super.field24;
                    this.field1186 = 2;
                    this.field1185 = 0;
                    this.field1043.method177(false, 185);
                    this.field1043.method179(var6);
                    this.field1043.method179(this.field1069);
                    this.field1043.method179(this.field1067);
                    this.field1043.method179(this.field1068);
                }
            }
            if (var5 == 1294) {
                int var8 = var6 >> 14 & 32767;
                LocType var9 = LocType.method237(var8);
                String var10;
                if (var9.field723 != null) {
                    var10 = new String(var9.field723);
                } else {
                    var10 = "It's a " + var9.field722 + ".";
                }
                this.method391(0, "", var10, 36887);
            }
            if (var5 == 700) {
                this.field1043.method177(false, 101);
                this.field1043.method179(var4);
                Component var11 = Component.field862[var4];
                if (var11.field874 != null && var11.field874[0][0] == 5) {
                    int var12 = var11.field874[0][1];
                    if (this.field1284[var12] != var11.field876[0]) {
                        this.field1284[var12] = var11.field876[0];
                        this.method385(6, var12);
                        this.field993 = true;
                    }
                }
            }
            if (var5 == 54) {
                this.method359(var6, var3, var4, 356, 249);
            }
            if (var5 == 806) {
                NpcEntity var13 = this.field1281[var6];
                if (var13 != null) {
                    this.method360(var13.field328[0], true, 0, false, 1, var13.field327[0], this.field1139.field327[0], 0, 1, 0, this.field1139.field328[0]);
                    this.field1183 = super.field23;
                    this.field1184 = super.field24;
                    this.field1186 = 2;
                    this.field1185 = 0;
                    this.field1043.method177(false, 28);
                    this.field1043.method179(var6);
                    this.field1043.method179(this.field1069);
                    this.field1043.method179(this.field1067);
                    this.field1043.method179(this.field1068);
                }
            }
            if (var5 == 243) {
                this.method359(var6, var3, var4, 356, 10);
                this.field1043.method179(this.field1195);
            }
            if (var5 == 17) {
                Component var14 = Component.field862[var4];
                this.field1194 = 1;
                this.field1195 = var4;
                this.field1196 = var14.field915;
                this.field1066 = 0;
                String var15 = var14.field913;
                if (var15.indexOf(" ") != -1) {
                    var15 = var15.substring(0, var15.indexOf(" "));
                }
                String var16 = var14.field913;
                if (var16.indexOf(" ") != -1) {
                    var16 = var16.substring(var16.indexOf(" ") + 1);
                }
                this.field1197 = var15 + " " + var14.field914 + " " + var16;
                if (this.field1196 == 16) {
                    this.field993 = true;
                    this.field1059 = 3;
                    this.field1076 = true;
                }
            } else {
                if (var5 == 284) {
                    if (!this.field1228) {
                        this.field1153.method71(super.field24 - 11, super.field23 - 8, (byte) 6);
                    } else {
                        this.field1153.method71(var4 - 11, var3 - 8, (byte) 6);
                    }
                }
                if (var5 == 669) {
                    this.field1066 = 1;
                    this.field1067 = var3;
                    this.field1068 = var4;
                    this.field1069 = var6;
                    this.field1070 = ObjType.method249(var6).field793;
                    this.field1194 = 0;
                } else {
                    if (var5 == 146) {
                        this.method359(var6, var3, var4, 356, 65);
                    }
                    if (var5 == 237) {
                        this.method359(var6, var3, var4, 356, 205);
                        this.field1043.method179(this.field1069);
                        this.field1043.method179(this.field1067);
                        this.field1043.method179(this.field1068);
                    }
                    if (var5 == 739) {
                        this.field1043.method177(false, 101);
                        this.field1043.method179(var4);
                        Component var17 = Component.field862[var4];
                        if (var17.field874 != null && var17.field874[0][0] == 5) {
                            int var18 = var17.field874[0][1];
                            this.field1284[var18] = 1 - this.field1284[var18];
                            this.method385(6, var18);
                            this.field993 = true;
                        }
                    }
                    if (var5 == 710 || var5 == 301 || var5 == 328 || var5 == 498 || var5 == 74) {
                        NpcEntity var19 = this.field1281[var6];
                        if (var19 != null) {
                            this.method360(var19.field328[0], true, 0, false, 1, var19.field327[0], this.field1139.field327[0], 0, 1, 0, this.field1139.field328[0]);
                            this.field1183 = super.field23;
                            this.field1184 = super.field24;
                            this.field1186 = 2;
                            this.field1185 = 0;
                            if (var5 == 328) {
                                this.field1043.method177(false, 107);
                            }
                            if (var5 == 301) {
                                this.field1043.method177(false, 152);
                            }
                            if (var5 == 498) {
                                this.field1043.method177(false, 119);
                            }
                            if (var5 == 74) {
                                this.field1043.method177(false, 8);
                            }
                            if (var5 == 710) {
                                this.field1043.method177(false, 41);
                            }
                            this.field1043.method179(var6);
                        }
                    }
                    if (var5 == 1682 || var5 == 1930 || var5 == 1754 || var5 == 1484) {
                        PlayerEntity var20 = this.field1083[var6];
                        if (var20 != null) {
                            this.method360(var20.field328[0], true, 0, false, 1, var20.field327[0], this.field1139.field327[0], 0, 1, 0, this.field1139.field328[0]);
                            this.field1183 = super.field23;
                            this.field1184 = super.field24;
                            this.field1186 = 2;
                            this.field1185 = 0;
                            if (var5 == 1930) {
                                this.field1043.method177(false, 212);
                            }
                            if (var5 == 1682) {
                                this.field1043.method177(false, 192);
                            }
                            if (var5 == 1484) {
                                this.field1043.method177(false, 172);
                            }
                            if (var5 == 1754) {
                                this.field1043.method177(false, 251);
                            }
                            this.field1043.method179(var6);
                        }
                    }
                    if (var5 == 462) {
                        this.method359(var6, var3, var4, 356, 233);
                    }
                    if (var5 == 1971 || var5 == 1258) {
                        ObjType var21 = ObjType.method249(var6);
                        String var22;
                        if (var21.field794 != null) {
                            var22 = new String(var21.field794);
                        } else {
                            var22 = "It's a " + var21.field793 + ".";
                        }
                        this.method391(0, "", var22, 36887);
                    }
                    if (var5 == 730) {
                        PlayerEntity var23 = this.field1083[var6];
                        if (var23 != null) {
                            this.method360(var23.field328[0], true, 0, false, 1, var23.field327[0], this.field1139.field327[0], 0, 1, 0, this.field1139.field328[0]);
                            this.field1183 = super.field23;
                            this.field1184 = super.field24;
                            this.field1186 = 2;
                            this.field1185 = 0;
                            this.field1043.method177(false, 252);
                            this.field1043.method179(var6);
                            this.field1043.method179(this.field1195);
                        }
                    }
                    if (var5 == 917 || var5 == 14 || var5 == 401 || var5 == 514 || var5 == 164) {
                        boolean var24 = this.method360(var4, true, 0, false, 0, var3, this.field1139.field327[0], 0, 0, 0, this.field1139.field328[0]);
                        if (!var24) {
                            this.method360(var4, true, 0, false, 1, var3, this.field1139.field327[0], 0, 1, 0, this.field1139.field328[0]);
                        }
                        this.field1183 = super.field23;
                        this.field1184 = super.field24;
                        this.field1186 = 2;
                        this.field1185 = 0;
                        if (var5 == 164) {
                            this.field1043.method177(false, 140);
                        }
                        if (var5 == 514) {
                            this.field1043.method177(false, 235);
                        }
                        if (var5 == 401) {
                            this.field1043.method177(false, 113);
                        }
                        if (var5 == 14) {
                            this.field1043.method177(false, 61);
                        }
                        if (var5 == 917) {
                            this.field1043.method177(false, 186);
                        }
                        this.field1043.method179(this.field1272 + var3);
                        this.field1043.method179(this.field1273 + var4);
                        this.field1043.method179(var6);
                    }
                    if (var5 == 677 || var5 == 522 || var5 == 249 || var5 == 247 || var5 == 296) {
                        if (var5 == 296) {
                            this.field1043.method177(false, 38);
                        }
                        if (var5 == 247) {
                            this.field1043.method177(false, 155);
                        }
                        if (var5 == 249) {
                            this.field1043.method177(false, 146);
                        }
                        if (var5 == 522) {
                            this.field1043.method177(false, 240);
                        }
                        if (var5 == 677) {
                            this.field1043.method177(false, 121);
                        }
                        this.field1043.method179(var6);
                        this.field1043.method179(var3);
                        this.field1043.method179(var4);
                        this.field1252 = 0;
                        this.field1253 = var4;
                        this.field1254 = var3;
                        this.field1255 = 2;
                        if (Component.field862[var4].field868 == this.field1056) {
                            this.field1255 = 1;
                        }
                        if (Component.field862[var4].field868 == this.field1264) {
                            this.field1255 = 3;
                        }
                    }
                    if (var5 == 883 && !this.field1025) {
                        this.field1043.method177(false, 167);
                        this.field1043.method179(var4);
                        this.field1025 = true;
                    }
                    if (var5 == 754) {
                        this.method359(var6, var3, var4, 356, 216);
                    }
                    if (var5 == 39) {
                        this.field1043.method177(false, 168);
                        this.field1043.method179(var6);
                        this.field1043.method179(var3);
                        this.field1043.method179(var4);
                        this.field1043.method179(this.field1069);
                        this.field1043.method179(this.field1067);
                        this.field1043.method179(this.field1068);
                        this.field1252 = 0;
                        this.field1253 = var4;
                        this.field1254 = var3;
                        this.field1255 = 2;
                        if (Component.field862[var4].field868 == this.field1056) {
                            this.field1255 = 1;
                        }
                        if (Component.field862[var4].field868 == this.field1264) {
                            this.field1255 = 3;
                        }
                    }
                    if (var5 == 981) {
                        this.method359(var6, var3, var4, 356, 221);
                    }
                    if (var5 == 454) {
                        this.field1043.method177(false, 213);
                        if (this.field1051 != -1) {
                            this.field1051 = -1;
                            this.field993 = true;
                            this.field1025 = false;
                            this.field1076 = true;
                        }
                        if (this.field1264 != -1) {
                            this.field1264 = -1;
                            this.field1107 = true;
                            this.field1025 = false;
                        }
                        this.field1056 = -1;
                    }
                    if (var5 == 759) {
                        Component var26 = Component.field862[var4];
                        boolean var27 = true;
                        if (var26.field871 > 0) {
                            var27 = this.method387(var26, 2);
                        }
                        if (var27) {
                            this.field1043.method177(false, 101);
                            this.field1043.method179(var4);
                        }
                    }
                    if (var5 == 160) {
                        boolean var28 = this.method360(var4, true, 0, false, 0, var3, this.field1139.field327[0], 0, 0, 0, this.field1139.field328[0]);
                        if (!var28) {
                            this.method360(var4, true, 0, false, 1, var3, this.field1139.field327[0], 0, 1, 0, this.field1139.field328[0]);
                        }
                        this.field1183 = super.field23;
                        this.field1184 = super.field24;
                        this.field1186 = 2;
                        this.field1185 = 0;
                        this.field1043.method177(false, 42);
                        this.field1043.method179(this.field1272 + var3);
                        this.field1043.method179(this.field1273 + var4);
                        this.field1043.method179(var6);
                        this.field1043.method179(this.field1069);
                        this.field1043.method179(this.field1067);
                        this.field1043.method179(this.field1068);
                    }
                    if (var5 == 678 || var5 == 523 || var5 == 836 || var5 == 548 || var5 == 62) {
                        if (var5 == 548) {
                            this.field1043.method177(false, 21);
                        }
                        if (var5 == 523) {
                            this.field1043.method177(false, 181);
                        }
                        if (var5 == 836) {
                            this.field1043.method177(false, 145);
                        }
                        if (var5 == 678) {
                            this.field1043.method177(false, 175);
                        }
                        if (var5 == 62) {
                            this.field1043.method177(false, 47);
                        }
                        this.field1043.method179(var6);
                        this.field1043.method179(var3);
                        this.field1043.method179(var4);
                        this.field1252 = 0;
                        this.field1253 = var4;
                        this.field1254 = var3;
                        this.field1255 = 2;
                        if (Component.field862[var4].field868 == this.field1056) {
                            this.field1255 = 1;
                        }
                        if (Component.field862[var4].field868 == this.field1264) {
                            this.field1255 = 3;
                        }
                    }
                    if (var5 == 130) {
                        NpcEntity var30 = this.field1281[var6];
                        if (var30 != null) {
                            this.method360(var30.field328[0], true, 0, false, 1, var30.field327[0], this.field1139.field327[0], 0, 1, 0, this.field1139.field328[0]);
                            this.field1183 = super.field23;
                            this.field1184 = super.field24;
                            this.field1186 = 2;
                            this.field1185 = 0;
                            this.field1043.method177(false, 189);
                            this.field1043.method179(var6);
                            this.field1043.method179(this.field1195);
                        }
                    }
                    if (var5 == 1725) {
                        NpcEntity var31 = this.field1281[var6];
                        if (var31 != null) {
                            String var32;
                            if (var31.field331.field760 != null) {
                                var32 = new String(var31.field331.field760);
                            } else {
                                var32 = "It's a " + var31.field331.field759 + ".";
                            }
                            this.method391(0, "", var32, 36887);
                        }
                    }
                    if (var5 == 449) {
                        this.field1043.method177(false, 247);
                        this.field1043.method179(var6);
                        this.field1043.method179(var3);
                        this.field1043.method179(var4);
                        this.field1043.method179(this.field1195);
                        this.field1252 = 0;
                        this.field1253 = var4;
                        this.field1254 = var3;
                        this.field1255 = 2;
                        if (Component.field862[var4].field868 == this.field1056) {
                            this.field1255 = 1;
                        }
                        if (Component.field862[var4].field868 == this.field1264) {
                            this.field1255 = 3;
                        }
                    }
                    if (var5 == 504) {
                        boolean var33 = this.method360(var4, true, 0, false, 0, var3, this.field1139.field327[0], 0, 0, 0, this.field1139.field328[0]);
                        if (!var33) {
                            this.method360(var4, true, 0, false, 1, var3, this.field1139.field327[0], 0, 1, 0, this.field1139.field328[0]);
                        }
                        this.field1183 = super.field23;
                        this.field1184 = super.field24;
                        this.field1186 = 2;
                        this.field1185 = 0;
                        this.field1043.method177(false, 244);
                        this.field1043.method179(this.field1272 + var3);
                        this.field1043.method179(this.field1273 + var4);
                        this.field1043.method179(var6);
                        this.field1043.method179(this.field1195);
                    }
                    this.field1066 = 0;
                    this.field1194 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method371(byte arg0) {
        this.field978[0] = "Cancel";
        this.field1118[0] = 1264;
        this.field1175 = 1;
        if (super.field20 > 8 && super.field21 > 11 && super.field20 < 520 && super.field21 < 345) {
            if (this.field1056 != -1) {
                this.method382(Component.field862[this.field1056], true, 8, super.field20, 0, super.field21, 11);
            } else {
                this.method372((byte) 123);
            }
        }
        if (this.field1170 != this.field1049) {
            this.field1049 = this.field1170;
        }
        this.field1170 = 0;
        if (arg0 == 0) {
            boolean var2 = false;
        } else {
            field1031 = this.field1021.method221();
        }
        if (super.field20 > 562 && super.field21 > 231 && super.field20 < 752 && super.field21 < 492) {
            if (this.field1051 != -1) {
                this.method382(Component.field862[this.field1051], true, 562, super.field20, 0, super.field21, 231);
            } else if (this.field1200[this.field1059] != -1) {
                this.method382(Component.field862[this.field1200[this.field1059]], true, 562, super.field20, 0, super.field21, 231);
            }
        }
        if (this.field1173 != this.field1170) {
            this.field993 = true;
            this.field1173 = this.field1170;
        }
        this.field1170 = 0;
        if (super.field20 > 22 && super.field21 > 375 && super.field20 < 501 && super.field21 < 471 && this.field1264 != -1) {
            this.method382(Component.field862[this.field1264], true, 22, super.field20, 0, super.field21, 375);
        }
        if (this.field1264 != -1 && this.field997 != this.field1170) {
            this.field1107 = true;
            this.field997 = this.field1170;
        }
        boolean var3 = false;
        while (!var3) {
            var3 = true;
            for (int var4 = 0; var4 < this.field1175 - 1; ++var4) {
                if (this.field1118[var4] < 1000 && this.field1118[var4 + 1] > 1000) {
                    String var5 = this.field978[var4];
                    this.field978[var4] = this.field978[var4 + 1];
                    this.field978[var4 + 1] = var5;
                    int var6 = this.field1118[var4];
                    this.field1118[var4] = this.field1118[var4 + 1];
                    this.field1118[var4 + 1] = var6;
                    int var7 = this.field1116[var4];
                    this.field1116[var4] = this.field1116[var4 + 1];
                    this.field1116[var4 + 1] = var7;
                    int var8 = this.field1117[var4];
                    this.field1117[var4] = this.field1117[var4 + 1];
                    this.field1117[var4 + 1] = var8;
                    int var9 = this.field1119[var4];
                    this.field1119[var4] = this.field1119[var4 + 1];
                    this.field1119[var4 + 1] = var9;
                    var3 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method372(byte arg0) {
        if (this.field1066 == 0 && this.field1194 == 0) {
            this.field978[this.field1175] = "Walk here";
            this.field1118[this.field1175] = 284;
            this.field1116[this.field1175] = super.field20;
            this.field1117[this.field1175] = super.field21;
            ++this.field1175;
        }
        for (int var2 = 0; var2 < Model.field497; ++var2) {
            int var3 = Model.field498[var2];
            int var4 = var3 & 127;
            int var5 = var3 >> 7 & 127;
            int var6 = var3 >> 29 & 3;
            int var7 = var3 >> 14 & 32767;
            if (var6 == 2 && this.field1153.method63(this.field1205, var4, var5, var3) >= 0) {
                LocType var8 = LocType.method237(var7);
                if (this.field1066 == 1) {
                    this.field978[this.field1175] = "Use " + this.field1070 + " with @cya@" + var8.field722;
                    this.field1118[this.field1175] = 237;
                    this.field1119[this.field1175] = var3;
                    this.field1116[this.field1175] = var4;
                    this.field1117[this.field1175] = var5;
                    ++this.field1175;
                } else if (this.field1194 == 1) {
                    if ((this.field1196 & 4) == 4) {
                        this.field978[this.field1175] = this.field1197 + " @cya@" + var8.field722;
                        this.field1118[this.field1175] = 243;
                        this.field1119[this.field1175] = var3;
                        this.field1116[this.field1175] = var4;
                        this.field1117[this.field1175] = var5;
                        ++this.field1175;
                    }
                } else {
                    if (var8.field738 != null) {
                        for (int var9 = 4; var9 >= 0; --var9) {
                            if (var8.field738[var9] != null) {
                                this.field978[this.field1175] = var8.field738[var9] + " @cya@" + var8.field722;
                                if (var9 == 0) {
                                    this.field1118[this.field1175] = 981;
                                }
                                if (var9 == 1) {
                                    this.field1118[this.field1175] = 462;
                                }
                                if (var9 == 2) {
                                    this.field1118[this.field1175] = 54;
                                }
                                if (var9 == 3) {
                                    this.field1118[this.field1175] = 146;
                                }
                                if (var9 == 4) {
                                    this.field1118[this.field1175] = 754;
                                }
                                this.field1119[this.field1175] = var3;
                                this.field1116[this.field1175] = var4;
                                this.field1117[this.field1175] = var5;
                                ++this.field1175;
                            }
                        }
                    }
                    this.field978[this.field1175] = "Examine @cya@" + var8.field722;
                    this.field1118[this.field1175] = 1294;
                    this.field1119[this.field1175] = var3;
                    this.field1116[this.field1175] = var4;
                    this.field1117[this.field1175] = var5;
                    ++this.field1175;
                }
            }
            if (var6 == 1) {
                NpcEntity var10 = this.field1281[var7];
                if (var10.field331.field761 == 1 && (var10.field280 & 127) == 64 && (var10.field281 & 127) == 64) {
                    for (int var11 = 0; var11 < this.field1282; ++var11) {
                        NpcEntity var12 = this.field1281[this.field1283[var11]];
                        if (var12 != null && var10 != var12 && var12.field331.field761 == 1 && var10.field280 == var12.field280 && var10.field281 == var12.field281) {
                            this.method373(var4, this.field1174, var12.field331, var5, this.field1283[var11]);
                        }
                    }
                }
                this.method373(var4, this.field1174, var10.field331, var5, var7);
            }
            if (var6 == 0) {
                PlayerEntity var13 = this.field1083[var7];
                if ((var13.field280 & 127) == 64 && (var13.field281 & 127) == 64) {
                    for (int var14 = 0; var14 < this.field1282; ++var14) {
                        NpcEntity var17 = this.field1281[this.field1283[var14]];
                        if (var17 != null && var17.field331.field761 == 1 && var13.field280 == var17.field280 && var13.field281 == var17.field281) {
                            this.method373(var4, this.field1174, var17.field331, var5, this.field1283[var14]);
                        }
                    }
                    for (int var15 = 0; var15 < this.field1084; ++var15) {
                        PlayerEntity var16 = this.field1083[this.field1085[var15]];
                        if (var16 != null && var13 != var16 && var13.field280 == var16.field280 && var13.field281 == var16.field281) {
                            this.method374(var5, var4, var16, 576, this.field1085[var15]);
                        }
                    }
                }
                this.method374(var5, var4, var13, 576, var7);
            }
            if (var6 == 3) {
                LinkList var18 = this.field1152[this.field1205][var4][var5];
                if (var18 != null) {
                    for (ObjStackEntity var19 = (ObjStackEntity) var18.method204((byte) 69); var19 != null; var19 = (ObjStackEntity) var18.method206((byte) 3)) {
                        ObjType var20 = ObjType.method249(var19.field277);
                        if (this.field1066 == 1) {
                            this.field978[this.field1175] = "Use " + this.field1070 + " with @lre@" + var20.field793;
                            this.field1118[this.field1175] = 160;
                            this.field1119[this.field1175] = var19.field277;
                            this.field1116[this.field1175] = var4;
                            this.field1117[this.field1175] = var5;
                            ++this.field1175;
                        } else if (this.field1194 == 1) {
                            if ((this.field1196 & 1) == 1) {
                                this.field978[this.field1175] = this.field1197 + " @lre@" + var20.field793;
                                this.field1118[this.field1175] = 504;
                                this.field1119[this.field1175] = var19.field277;
                                this.field1116[this.field1175] = var4;
                                this.field1117[this.field1175] = var5;
                                ++this.field1175;
                            }
                        } else {
                            for (int var21 = 4; var21 >= 0; --var21) {
                                if (var20.field808 != null && var20.field808[var21] != null) {
                                    this.field978[this.field1175] = var20.field808[var21] + " @lre@" + var20.field793;
                                    if (var21 == 0) {
                                        this.field1118[this.field1175] = 917;
                                    }
                                    if (var21 == 1) {
                                        this.field1118[this.field1175] = 14;
                                    }
                                    if (var21 == 2) {
                                        this.field1118[this.field1175] = 401;
                                    }
                                    if (var21 == 3) {
                                        this.field1118[this.field1175] = 514;
                                    }
                                    if (var21 == 4) {
                                        this.field1118[this.field1175] = 164;
                                    }
                                    this.field1119[this.field1175] = var19.field277;
                                    this.field1116[this.field1175] = var4;
                                    this.field1117[this.field1175] = var5;
                                    ++this.field1175;
                                } else if (var21 == 2) {
                                    this.field978[this.field1175] = "Take @lre@" + var20.field793;
                                    this.field1118[this.field1175] = 401;
                                    this.field1119[this.field1175] = var19.field277;
                                    this.field1116[this.field1175] = var4;
                                    this.field1117[this.field1175] = var5;
                                    ++this.field1175;
                                }
                            }
                            this.field978[this.field1175] = "Examine @lre@" + var20.field793;
                            this.field1118[this.field1175] = 1971;
                            this.field1119[this.field1175] = var19.field277;
                            this.field1116[this.field1175] = var4;
                            this.field1117[this.field1175] = var5;
                            ++this.field1175;
                        }
                    }
                }
            }
        }
        if (arg0 != 123) {
            this.method6();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILxb;II)V")
    public final void method373(int arg0, int arg1, NpcType arg2, int arg3, int arg4) {
        if (this.field1175 < 400) {
            String var6 = arg2.field759;
            this.field1060 += arg1;
            if (arg2.field777 != 0) {
                var6 = var6 + method375(arg2.field777, this.field1139.field342, (byte) 7) + " (level-" + arg2.field777 + ")";
            }
            if (this.field1066 == 1) {
                this.field978[this.field1175] = "Use " + this.field1070 + " with @yel@" + var6;
                this.field1118[this.field1175] = 806;
                this.field1119[this.field1175] = arg4;
                this.field1116[this.field1175] = arg0;
                this.field1117[this.field1175] = arg3;
                ++this.field1175;
            } else {
                if (this.field1194 == 1) {
                    if ((this.field1196 & 2) == 2) {
                        this.field978[this.field1175] = this.field1197 + " @yel@" + var6;
                        this.field1118[this.field1175] = 130;
                        this.field1119[this.field1175] = arg4;
                        this.field1116[this.field1175] = arg0;
                        this.field1117[this.field1175] = arg3;
                        ++this.field1175;
                        return;
                    }
                } else {
                    if (arg2.field772 != null) {
                        for (int var7 = 4; var7 >= 0; --var7) {
                            if (arg2.field772[var7] != null) {
                                this.field978[this.field1175] = arg2.field772[var7] + " @yel@" + var6;
                                if (var7 == 0) {
                                    this.field1118[this.field1175] = 710;
                                }
                                if (var7 == 1) {
                                    this.field1118[this.field1175] = 301;
                                }
                                if (var7 == 2) {
                                    this.field1118[this.field1175] = 328;
                                }
                                if (var7 == 3) {
                                    this.field1118[this.field1175] = 498;
                                }
                                if (var7 == 4) {
                                    this.field1118[this.field1175] = 74;
                                }
                                this.field1119[this.field1175] = arg4;
                                this.field1116[this.field1175] = arg0;
                                this.field1117[this.field1175] = arg3;
                                ++this.field1175;
                            }
                        }
                    }
                    this.field978[this.field1175] = "Examine @yel@" + var6;
                    this.field1118[this.field1175] = 1725;
                    this.field1119[this.field1175] = arg4;
                    this.field1116[this.field1175] = arg0;
                    this.field1117[this.field1175] = arg3;
                    ++this.field1175;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILy;II)V")
    public final void method374(int arg0, int arg1, PlayerEntity arg2, int arg3, int arg4) {
        if (arg3 > 0) {
            if (this.field1139 != arg2) {
                if (this.field1175 < 400) {
                    String var6 = arg2.field336 + method375(arg2.field342, this.field1139.field342, (byte) 7) + " (level-" + arg2.field342 + ")";
                    if (this.field1066 == 1) {
                        this.field978[this.field1175] = "Use " + this.field1070 + " with @whi@" + var6;
                        this.field1118[this.field1175] = 636;
                        this.field1119[this.field1175] = arg4;
                        this.field1116[this.field1175] = arg1;
                        this.field1117[this.field1175] = arg0;
                        ++this.field1175;
                    } else {
                        if (this.field1194 == 1) {
                            if ((this.field1196 & 8) == 8) {
                                this.field978[this.field1175] = this.field1197 + " @whi@" + var6;
                                this.field1118[this.field1175] = 730;
                                this.field1119[this.field1175] = arg4;
                                this.field1116[this.field1175] = arg1;
                                this.field1117[this.field1175] = arg0;
                                ++this.field1175;
                                return;
                            }
                        } else {
                            this.field978[this.field1175] = "Trade with @whi@" + var6;
                            this.field1118[this.field1175] = 1682;
                            this.field1119[this.field1175] = arg4;
                            this.field1116[this.field1175] = arg1;
                            this.field1117[this.field1175] = arg0;
                            ++this.field1175;
                            this.field978[this.field1175] = "Follow @whi@" + var6;
                            this.field1118[this.field1175] = 1930;
                            this.field1119[this.field1175] = arg4;
                            this.field1116[this.field1175] = arg1;
                            this.field1117[this.field1175] = arg0;
                            ++this.field1175;
                            if (this.field1075 > 0) {
                                this.field978[this.field1175] = "Attack @whi@" + var6;
                                this.field1118[this.field1175] = 1754;
                                this.field1119[this.field1175] = arg4;
                                this.field1116[this.field1175] = arg1;
                                this.field1117[this.field1175] = arg0;
                                ++this.field1175;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIB)Ljava/lang/String;")
    public static final String method375(int arg0, int arg1, byte arg2) {
        if (arg2 != 7) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILdc;III)V")
    public final void method376(int arg0, Component arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= 0) {
            field1064 = !field1064;
        }
        if (arg1.field869 == 0 && arg1.field881 != null) {
            if (!arg1.field880 || this.field1049 == arg1.field867 || this.field1173 == arg1.field867 || this.field997 == arg1.field867) {
                int var6 = Pix2D.field511;
                int var7 = Pix2D.field509;
                int var8 = Pix2D.field512;
                int var9 = Pix2D.field510;
                Pix2D.method129(arg1.field872 + arg3, this.field1120, arg3, arg2, arg1.field873 + arg2);
                int var10 = arg1.field881.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg1.field882[var11] + arg3;
                    int var13 = arg1.field883[var11] + arg2 - arg0;
                    Component var14 = Component.field862[arg1.field881[var11]];
                    if (var14.field871 > 0) {
                        this.method386(var14, 6);
                    }
                    if (var14.field869 == 0) {
                        if (var14.field879 > var14.field878 - var14.field873) {
                            var14.field879 = var14.field878 - var14.field873;
                        }
                        if (var14.field879 < 0) {
                            var14.field879 = 0;
                        }
                        this.method376(var14.field879, var14, var13, var12, -204);
                        if (var14.field878 > var14.field873) {
                            this.method378(var13, var14.field872 + var12, var14.field879, var14.field873, var14.field878, 5);
                        }
                    } else if (var14.field869 != 1) {
                        if (var14.field869 == 2) {
                            int var15 = 0;
                            for (int var16 = 0; var16 < var14.field873; ++var16) {
                                for (int var17 = 0; var17 < var14.field872; ++var17) {
                                    int var18 = (var14.field889 + 32) * var17 + var12;
                                    int var19 = (var14.field890 + 32) * var16 + var13;
                                    if (var15 < 20) {
                                        var18 += var14.field892[var15];
                                        var19 += var14.field893[var15];
                                    }
                                    if (var14.field863[var15] <= 0) {
                                        if (var14.field891 != null && var15 < 20) {
                                            Pix32 var23 = var14.field891[var15];
                                            if (var23 != null) {
                                                var23.method155(var18, true, var19);
                                            }
                                        }
                                    } else {
                                        int var20 = var14.field863[var15] - 1;
                                        Pix32 var21 = ObjType.method253(var20, -25063);
                                        if (this.field1255 != 0 && this.field1254 == var15 && this.field1253 == var14.field867) {
                                            var21.method157(4, var18, var19, 128);
                                        } else {
                                            var21.method155(var18, true, var19);
                                        }
                                        if (var21.field552 == 33 || var14.field864[var15] != 1) {
                                            int var22 = var14.field864[var15];
                                            this.field999.method171(String.valueOf(var22), var18 + 1, var19 + 10, 0, -200);
                                            this.field999.method171(String.valueOf(var22), var18, var19 + 9, 16776960, -200);
                                        }
                                    }
                                    ++var15;
                                }
                            }
                        } else if (var14.field869 == 3) {
                            if (var14.field895) {
                                Pix2D.method131(var14.field901, var14.field872, var13, false, var14.field873, var12);
                            } else {
                                Pix2D.method132(var14.field872, var14.field873, var12, var13, true, var14.field901);
                            }
                        } else if (var14.field869 == 4) {
                            PixFont var24 = var14.field898;
                            int var25 = var14.field901;
                            String var26 = var14.field899;
                            if ((this.field997 == var14.field867 || this.field1173 == var14.field867 || this.field1049 == var14.field867) && var14.field903 != 0) {
                                var25 = var14.field903;
                            }
                            if (this.method380(var14, -27654)) {
                                var25 = var14.field902;
                                if (var14.field900.length() > 0) {
                                    var26 = var14.field900;
                                }
                            }
                            if (var14.field870 == 6 && this.field1025) {
                                var26 = "Please wait...";
                                var25 = var14.field901;
                            }
                            int var27 = var24.field576 + var13;
                            while (var26.length() > 0) {
                                if (var26.indexOf("%") != -1) {
                                    label228: while (true) {
                                        int var28 = var26.indexOf("%1");
                                        if (var28 == -1) {
                                            while (true) {
                                                int var29 = var26.indexOf("%2");
                                                if (var29 == -1) {
                                                    while (true) {
                                                        int var30 = var26.indexOf("%3");
                                                        if (var30 == -1) {
                                                            while (true) {
                                                                int var31 = var26.indexOf("%4");
                                                                if (var31 == -1) {
                                                                    while (true) {
                                                                        int var32 = var26.indexOf("%5");
                                                                        if (var32 == -1) {
                                                                            break label228;
                                                                        }
                                                                        var26 = var26.substring(0, var32) + this.method379((byte) 3, this.method381(5, 4, var14)) + var26.substring(var32 + 2);
                                                                    }
                                                                }
                                                                var26 = var26.substring(0, var31) + this.method379((byte) 3, this.method381(5, 3, var14)) + var26.substring(var31 + 2);
                                                            }
                                                        }
                                                        var26 = var26.substring(0, var30) + this.method379((byte) 3, this.method381(5, 2, var14)) + var26.substring(var30 + 2);
                                                    }
                                                }
                                                var26 = var26.substring(0, var29) + this.method379((byte) 3, this.method381(5, 1, var14)) + var26.substring(var29 + 2);
                                            }
                                        }
                                        var26 = var26.substring(0, var28) + this.method379((byte) 3, this.method381(5, 0, var14)) + var26.substring(var28 + 2);
                                    }
                                }
                                int var33 = var26.indexOf("\\n");
                                String var34;
                                if (var33 != -1) {
                                    var34 = var26.substring(0, var33);
                                    var26 = var26.substring(var33 + 2);
                                } else {
                                    var34 = var26;
                                    var26 = "";
                                }
                                if (var14.field896) {
                                    var24.method169(var14.field872 / 2 + var12, var34, var27, this.field1208, var25, var14.field897);
                                } else {
                                    var24.method173(var14.field897, var12, var27, var25, true, var34);
                                }
                                var27 += var24.field576;
                            }
                        } else if (var14.field869 == 5) {
                            Pix32 var35;
                            if (this.method380(var14, -27654)) {
                                var35 = var14.field905;
                            } else {
                                var35 = var14.field904;
                            }
                            if (var35 != null) {
                                var35.method155(var12, true, var13);
                            }
                        } else if (var14.field869 == 6) {
                            int var36 = Pix3D.field525;
                            int var37 = Pix3D.field526;
                            Pix3D.field525 = var14.field872 / 2 + var12;
                            Pix3D.field526 = var14.field873 / 2 + var13;
                            int var38 = Pix3D.field529[var14.field911] * var14.field910 >> 16;
                            int var39 = Pix3D.field530[var14.field911] * var14.field910 >> 16;
                            Model var40;
                            if (var14.field908 == -1) {
                                var40 = var14.method276(-1, -1, this.method380(var14, -27654));
                            } else {
                                SeqType var41 = SeqType.field927[var14.field908];
                                var40 = var14.method276(var41.field929[var14.field865], var41.field930[var14.field865], this.method380(var14, -27654));
                            }
                            if (var40 != null) {
                                var40.method121(var38, var39, 0, 0, 0, 0, var14.field911, var14.field912);
                            }
                            Pix3D.field525 = var36;
                            Pix3D.field526 = var37;
                        } else if (var14.field869 == 7) {
                            PixFont var42 = var14.field898;
                            int var43 = 0;
                            for (int var44 = 0; var44 < var14.field873; ++var44) {
                                for (int var45 = 0; var45 < var14.field872; ++var45) {
                                    if (var14.field863[var43] > 0) {
                                        ObjType var46 = ObjType.method249(var14.field863[var43] - 1);
                                        String var47 = var46.field793;
                                        if (var46.field805 || var14.field864[var43] != 1) {
                                            var47 = var14.field864[var43] + "x " + var47;
                                        }
                                        int var48 = (var14.field889 + 115) * var45 + var12;
                                        int var49 = (var14.field890 + 12) * var44 + var13;
                                        if (var14.field896) {
                                            if (var14.field897) {
                                                var42.method168(var49 + 1, this.field1223, var14.field872 / 2 + var48 + 1, 0, var47);
                                            }
                                            var42.method168(var49, this.field1223, var14.field872 / 2 + var48, var14.field901, var47);
                                        } else {
                                            if (var14.field897) {
                                                var42.method171(var47, var48 + 1, var49 + 1, 0, -200);
                                            }
                                            var42.method171(var47, var48, var49, var14.field901, -200);
                                        }
                                    }
                                    ++var43;
                                }
                            }
                        }
                    }
                }
                Pix2D.method129(var8, this.field1120, var6, var7, var9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIILdc;IZI)V")
    public final void method377(int arg0, int arg1, int arg2, int arg3, int arg4, Component arg5, int arg6, boolean arg7, int arg8) {
        if (arg6 != 0) {
            for (int var10 = 1; var10 > 0; ++var10) {
            }
        }
        if (this.field1189) {
            this.field1121 = 32;
        } else {
            this.field1121 = 0;
        }
        this.field1189 = false;
        if (arg2 >= arg1 && arg2 < arg1 + 16 && arg4 >= arg0 && arg4 < arg0 + 16) {
            arg5.field879 -= this.field1251 * 4;
            if (arg7) {
                this.field993 = true;
                return;
            }
        } else if (arg2 >= arg1 && arg2 < arg1 + 16 && arg4 >= arg0 + arg3 - 16 && arg4 < arg0 + arg3) {
            arg5.field879 += this.field1251 * 4;
            if (arg7) {
                this.field993 = true;
                return;
            }
        } else if (arg2 >= arg1 - this.field1121 && arg2 < arg1 + 16 + this.field1121 && arg4 >= arg0 + 16 && arg4 < arg0 + arg3 - 16 && this.field1251 > 0) {
            int var11 = (arg3 - 32) * arg3 / arg8;
            if (var11 < 8) {
                var11 = 8;
            }
            int var12 = arg4 - arg0 - 16 - var11 / 2;
            int var13 = arg3 - 32 - var11;
            arg5.field879 = (arg8 - arg3) * var12 / var13;
            if (arg7) {
                this.field993 = true;
            }
            this.field1189 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field986.method166(arg1, true, arg0);
        this.field987.method166(arg1, true, arg0 + arg3 - 16);
        if (arg5 >= 5 && arg5 <= 5) {
            Pix2D.method131(this.field1057, 16, arg0 + 16, false, arg3 - 32, arg1);
            int var7 = (arg3 - 32) * arg3 / arg4;
            if (var7 < 8) {
                var7 = 8;
            }
            int var8 = (arg3 - 32 - var7) * arg2 / (arg4 - arg3);
            Pix2D.method131(this.field1256, 16, arg0 + 16 + var8, false, var7, arg1);
            Pix2D.method134(arg0 + 16 + var8, arg1, var7, false, this.field1242);
            Pix2D.method134(arg0 + 16 + var8, arg1 + 1, var7, false, this.field1242);
            Pix2D.method133(true, this.field1242, arg0 + 16 + var8, 16, arg1);
            Pix2D.method133(true, this.field1242, arg0 + 17 + var8, 16, arg1);
            Pix2D.method134(arg0 + 16 + var8, arg1 + 15, var7, false, this.field1138);
            Pix2D.method134(arg0 + 17 + var8, arg1 + 14, var7 - 1, false, this.field1138);
            Pix2D.method133(true, this.field1138, arg0 + 15 + var8 + var7, 16, arg1);
            Pix2D.method133(true, this.field1138, arg0 + 14 + var8 + var7, 15, arg1 + 1);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public final String method379(byte arg0, int arg1) {
        if (arg0 == 3) {
            boolean var3 = false;
        } else {
            field1031 = this.field1021.method221();
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ldc;I)Z")
    public final boolean method380(Component arg0, int arg1) {
        if (arg0.field875 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field875.length; ++var3) {
                int var4 = this.method381(5, var3, arg0);
                int var5 = arg0.field876[var3];
                if (arg0.field875[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field875[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field875[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg1 != -27654) {
                this.field1140 = !this.field1140;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILdc;)I")
    public final int method381(int arg0, int arg1, Component arg2) {
        if (arg0 != 5) {
            this.field1223 = !this.field1223;
        }
        if (arg2.field874 != null && arg1 < arg2.field874.length) {
            try {
                int[] var4 = arg2.field874[arg1];
                int var5 = 0;
                int var6 = 0;
                while (true) {
                    while (true) {
                        int var7;
                        do {
                            var7 = var4[var6++];
                            if (var7 == 0) {
                                return var5;
                            }
                            if (var7 == 1) {
                                var5 += this.field1147[var4[var6++]];
                            }
                            if (var7 == 2) {
                                var5 += this.field1132[var4[var6++]];
                            }
                            if (var7 == 3) {
                                var5 += this.field984[var4[var6++]];
                            }
                            if (var7 == 4) {
                                Component var8 = Component.field862[var4[var6++]];
                                int var9 = var4[var6++] + 1;
                                for (int var10 = 0; var10 < var8.field863.length; ++var10) {
                                    if (var8.field863[var10] == var9) {
                                        var5 += var8.field864[var10];
                                    }
                                }
                            }
                            if (var7 == 5) {
                                var5 += this.field1284[var4[var6++]];
                            }
                            if (var7 == 6) {
                                var5 += field1166[this.field1132[var4[var6++]] - 1];
                            }
                            if (var7 == 7) {
                                var5 += this.field1284[var4[var6++]] * 100 / 46875;
                            }
                            if (var7 == 8) {
                                var5 += this.field1139.field342;
                            }
                            if (var7 == 9) {
                                for (int var11 = 0; var11 < 19; ++var11) {
                                    var5 += this.field1132[var11];
                                }
                            }
                        } while (var7 != 10);
                        Component var12 = Component.field862[var4[var6++]];
                        int var13 = var4[var6++] + 1;
                        for (int var14 = 0; var14 < var12.field863.length; ++var14) {
                            if (var12.field863[var14] == var13) {
                                var5 += 999999999;
                                break;
                            }
                        }
                    }
                }
            } catch (Exception var15) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ldc;ZIIIII)V")
    public final void method382(Component arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0.field869 == 0 && arg0.field881 != null && !arg0.field880) {
            if (arg3 >= arg2 && arg5 >= arg6 && arg3 <= arg0.field872 + arg2 && arg5 <= arg0.field873 + arg6) {
                int var8 = arg0.field881.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg0.field882[var9] + arg2;
                    int var11 = arg0.field883[var9] + arg6 - arg4;
                    Component var12 = Component.field862[arg0.field881[var9]];
                    if ((var12.field877 >= 0 || var12.field903 != 0) && arg3 >= var10 && arg5 >= var11 && arg3 < var12.field872 + var10 && arg5 < var12.field873 + var11) {
                        if (var12.field877 >= 0) {
                            this.field1170 = var12.field877;
                        } else {
                            this.field1170 = var12.field867;
                        }
                    }
                    if (var12.field869 == 0) {
                        this.method382(var12, true, var10, arg3, var12.field879, arg5, var11);
                        if (var12.field878 > var12.field873) {
                            this.method377(var11, var12.field872 + var10, arg3, var12.field873, arg5, var12, 0, true, var12.field878);
                        }
                    } else {
                        if (var12.field870 == 1 && arg3 >= var10 && arg5 >= var11 && arg3 < var12.field872 + var10 && arg5 < var12.field873 + var11) {
                            this.field978[this.field1175] = var12.field916;
                            this.field1118[this.field1175] = 759;
                            this.field1117[this.field1175] = var12.field867;
                            ++this.field1175;
                        }
                        if (var12.field870 == 2 && this.field1194 == 0 && arg3 >= var10 && arg5 >= var11 && arg3 < var12.field872 + var10 && arg5 < var12.field873 + var11) {
                            String var13 = var12.field913;
                            if (var13.indexOf(" ") != -1) {
                                var13 = var13.substring(0, var13.indexOf(" "));
                            }
                            this.field978[this.field1175] = var13 + " @gre@" + var12.field914;
                            this.field1118[this.field1175] = 17;
                            this.field1117[this.field1175] = var12.field867;
                            ++this.field1175;
                        }
                        if (var12.field870 == 3 && arg3 >= var10 && arg5 >= var11 && arg3 < var12.field872 + var10 && arg5 < var12.field873 + var11) {
                            this.field978[this.field1175] = "Close";
                            this.field1118[this.field1175] = 454;
                            this.field1117[this.field1175] = var12.field867;
                            ++this.field1175;
                        }
                        if (var12.field870 == 4 && arg3 >= var10 && arg5 >= var11 && arg3 < var12.field872 + var10 && arg5 < var12.field873 + var11) {
                            this.field978[this.field1175] = var12.field916;
                            this.field1118[this.field1175] = 739;
                            this.field1117[this.field1175] = var12.field867;
                            ++this.field1175;
                        }
                        if (var12.field870 == 5 && arg3 >= var10 && arg5 >= var11 && arg3 < var12.field872 + var10 && arg5 < var12.field873 + var11) {
                            this.field978[this.field1175] = var12.field916;
                            this.field1118[this.field1175] = 700;
                            this.field1117[this.field1175] = var12.field867;
                            ++this.field1175;
                        }
                        if (var12.field870 == 6 && !this.field1025 && arg3 >= var10 && arg5 >= var11 && arg3 < var12.field872 + var10 && arg5 < var12.field873 + var11) {
                            this.field978[this.field1175] = var12.field916;
                            this.field1118[this.field1175] = 883;
                            this.field1117[this.field1175] = var12.field867;
                            ++this.field1175;
                        }
                        if (var12.field869 == 2) {
                            int var14 = 0;
                            for (int var15 = 0; var15 < var12.field873; ++var15) {
                                for (int var16 = 0; var16 < var12.field872; ++var16) {
                                    if (var12.field863[var14] > 0) {
                                        int var17 = (var12.field889 + 32) * var16 + var10;
                                        int var18 = (var12.field890 + 32) * var15 + var11;
                                        if (var14 < 20) {
                                            var17 += var12.field892[var14];
                                            var18 += var12.field893[var14];
                                        }
                                        if (arg3 >= var17 && arg5 >= var18 && arg3 < var17 + 32 && arg5 < var18 + 32) {
                                            ObjType var19 = ObjType.method249(var12.field863[var14] - 1);
                                            if (this.field1066 == 1 && var12.field887) {
                                                if (this.field1068 != var12.field867 || this.field1067 != var14) {
                                                    this.field978[this.field1175] = "Use " + this.field1070 + " with @lre@" + var19.field793;
                                                    this.field1118[this.field1175] = 39;
                                                    this.field1119[this.field1175] = var19.field791;
                                                    this.field1116[this.field1175] = var14;
                                                    this.field1117[this.field1175] = var12.field867;
                                                    ++this.field1175;
                                                }
                                            } else if (this.field1194 == 1 && var12.field887) {
                                                if ((this.field1196 & 16) == 16) {
                                                    this.field978[this.field1175] = this.field1197 + " @lre@" + var19.field793;
                                                    this.field1118[this.field1175] = 449;
                                                    this.field1119[this.field1175] = var19.field791;
                                                    this.field1116[this.field1175] = var14;
                                                    this.field1117[this.field1175] = var12.field867;
                                                    ++this.field1175;
                                                }
                                            } else {
                                                if (var12.field887) {
                                                    for (int var20 = 4; var20 >= 3; --var20) {
                                                        if (var19.field809 != null && var19.field809[var20] != null) {
                                                            this.field978[this.field1175] = var19.field809[var20] + " @lre@" + var19.field793;
                                                            if (var20 == 3) {
                                                                this.field1118[this.field1175] = 247;
                                                            }
                                                            if (var20 == 4) {
                                                                this.field1118[this.field1175] = 296;
                                                            }
                                                            this.field1119[this.field1175] = var19.field791;
                                                            this.field1116[this.field1175] = var14;
                                                            this.field1117[this.field1175] = var12.field867;
                                                            ++this.field1175;
                                                        } else if (var20 == 4) {
                                                            this.field978[this.field1175] = "Drop @lre@" + var19.field793;
                                                            this.field1118[this.field1175] = 296;
                                                            this.field1119[this.field1175] = var19.field791;
                                                            this.field1116[this.field1175] = var14;
                                                            this.field1117[this.field1175] = var12.field867;
                                                            ++this.field1175;
                                                        }
                                                    }
                                                }
                                                if (var12.field888) {
                                                    this.field978[this.field1175] = "Use @lre@" + var19.field793;
                                                    this.field1118[this.field1175] = 669;
                                                    this.field1119[this.field1175] = var19.field791;
                                                    this.field1116[this.field1175] = var14;
                                                    this.field1117[this.field1175] = var12.field867;
                                                    ++this.field1175;
                                                }
                                                if (var12.field887 && var19.field809 != null) {
                                                    for (int var21 = 2; var21 >= 0; --var21) {
                                                        if (var19.field809[var21] != null) {
                                                            this.field978[this.field1175] = var19.field809[var21] + " @lre@" + var19.field793;
                                                            if (var21 == 0) {
                                                                this.field1118[this.field1175] = 677;
                                                            }
                                                            if (var21 == 1) {
                                                                this.field1118[this.field1175] = 522;
                                                            }
                                                            if (var21 == 2) {
                                                                this.field1118[this.field1175] = 249;
                                                            }
                                                            this.field1119[this.field1175] = var19.field791;
                                                            this.field1116[this.field1175] = var14;
                                                            this.field1117[this.field1175] = var12.field867;
                                                            ++this.field1175;
                                                        }
                                                    }
                                                }
                                                if (var12.field894 != null) {
                                                    for (int var22 = 4; var22 >= 0; --var22) {
                                                        if (var12.field894[var22] != null) {
                                                            this.field978[this.field1175] = var12.field894[var22] + " @lre@" + var19.field793;
                                                            if (var22 == 0) {
                                                                this.field1118[this.field1175] = 678;
                                                            }
                                                            if (var22 == 1) {
                                                                this.field1118[this.field1175] = 523;
                                                            }
                                                            if (var22 == 2) {
                                                                this.field1118[this.field1175] = 836;
                                                            }
                                                            if (var22 == 3) {
                                                                this.field1118[this.field1175] = 548;
                                                            }
                                                            if (var22 == 4) {
                                                                this.field1118[this.field1175] = 62;
                                                            }
                                                            this.field1119[this.field1175] = var19.field791;
                                                            this.field1116[this.field1175] = var14;
                                                            this.field1117[this.field1175] = var12.field867;
                                                            ++this.field1175;
                                                        }
                                                    }
                                                }
                                                this.field978[this.field1175] = "Examine @lre@" + var19.field793;
                                                this.field1118[this.field1175] = 1258;
                                                this.field1119[this.field1175] = var19.field791;
                                                ++this.field1175;
                                            }
                                        }
                                    }
                                    ++var14;
                                }
                            }
                        }
                    }
                }
                this.field1172 &= arg1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method383(int arg0, int arg1) {
        Component var3 = Component.field862[arg1];
        for (int var4 = 0; var4 < var3.field881.length && var3.field881[var4] != -1; ++var4) {
            Component var5 = Component.field862[var3.field881[var4]];
            if (var5.field869 == 1) {
                this.method383(1, var5.field867);
            }
            var5.field865 = 0;
            var5.field866 = 0;
        }
        if (arg0 < 1 || arg0 > 1) {
            this.field1208 = -6;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BII)Z")
    public final boolean method384(byte arg0, int arg1, int arg2) {
        boolean var4 = false;
        Component var5 = Component.field862[arg2];
        for (int var6 = 0; var6 < var5.field881.length && var5.field881[var6] != -1; ++var6) {
            Component var7 = Component.field862[var5.field881[var6]];
            if (var7.field869 == 1) {
                var4 |= this.method384((byte) -91, arg1, var7.field867);
            }
            if (var7.field908 != -1) {
                SeqType var8 = SeqType.field927[var7.field908];
                var7.field866 += arg1;
                while (var7.field866 > var8.field931[var7.field865]) {
                    var7.field866 -= var8.field931[var7.field865] + 1;
                    ++var7.field865;
                    if (var7.field865 >= var8.field928) {
                        var7.field865 -= var8.field932;
                        if (var7.field865 < 0 || var7.field865 >= var8.field928) {
                            var7.field865 = 0;
                        }
                    }
                    var4 = true;
                }
            }
        }
        if (arg0 != -91) {
            this.field1152 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method385(int arg0, int arg1) {
        int var3 = VarpType.field953[arg1].field961;
        if (arg0 != 6) {
            this.field1293 = this.field1021.method221();
        }
        if (var3 != 0) {
            int var4 = this.field1284[arg1];
            if (var3 == 1) {
                if (var4 == 1) {
                    Pix3D.method144(-217, 0.9D);
                }
                if (var4 == 2) {
                    Pix3D.method144(-217, 0.8D);
                }
                if (var4 == 3) {
                    Pix3D.method144(-217, 0.7D);
                }
                if (var4 == 4) {
                    Pix3D.method144(-217, 0.6D);
                }
                ObjType.field821.method86();
                this.field1191 = true;
            }
            if (var3 == 3) {
                if (var4 == 1 && this.field1106) {
                    this.field1106 = false;
                    signlink.midi = "null";
                }
                if (var4 == 0 && !this.field1106) {
                    this.field1106 = true;
                    signlink.midi = this.field1210;
                }
            }
            if (var3 == 5) {
                this.field1171 = var4;
            }
            if (var3 == 6) {
                this.field1065 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ldc;I)V")
    public final void method386(Component arg0, int arg1) {
        int var3 = arg0.field871;
        if (arg1 != 6) {
            this.field1061 = -1;
        }
        if (var3 >= 1 && var3 <= 100) {
            --var3;
            if (var3 >= this.field1188) {
                arg0.field899 = "";
                arg0.field870 = 0;
            } else {
                arg0.field899 = this.field1199[var3];
                arg0.field870 = 1;
                if (arg0.field916 == null) {
                    arg0.field870 = 0;
                }
            }
        } else if (var3 >= 101 && var3 <= 200) {
            var3 -= 101;
            if (var3 >= this.field1188) {
                arg0.field899 = "";
                arg0.field870 = 0;
            } else {
                if (this.field1285[var3] == 0) {
                    arg0.field899 = "@red@Offline";
                } else if (this.field1285[var3] == this.field1198) {
                    arg0.field899 = "@gre@World-" + (this.field1285[var3] - 9);
                } else {
                    arg0.field899 = "@yel@World-" + (this.field1285[var3] - 9);
                }
                arg0.field870 = 1;
                if (arg0.field916 == null) {
                    arg0.field870 = 0;
                }
            }
        } else if (var3 == 203) {
            arg0.field878 = this.field1188 * 15 + 20;
            if (arg0.field878 <= arg0.field873) {
                arg0.field878 = arg0.field873 + 1;
            }
        } else if (var3 >= 401 && var3 <= 500) {
            var3 -= 401;
            if (var3 >= this.field1168) {
                arg0.field899 = "";
                arg0.field870 = 0;
            } else {
                arg0.field899 = JString.method230(JString.method227((byte) -89, this.field1178[var3]), -591);
            }
        } else if (var3 == 503) {
            arg0.field878 = this.field1168 * 15 + 20;
            if (arg0.field878 <= arg0.field873) {
                arg0.field878 = arg0.field873 + 1;
            }
        } else if (var3 != 327) {
            if (var3 == 324) {
                if (this.field1202 == null) {
                    this.field1202 = arg0.field904;
                    this.field1203 = arg0.field905;
                }
                if (this.field1072) {
                    arg0.field904 = this.field1203;
                } else {
                    arg0.field904 = this.field1202;
                }
            } else if (var3 == 325) {
                if (this.field1202 == null) {
                    this.field1202 = arg0.field904;
                    this.field1203 = arg0.field905;
                }
                if (this.field1072) {
                    arg0.field904 = this.field1202;
                } else {
                    arg0.field904 = this.field1203;
                }
            }
        } else {
            arg0.field911 = 150;
            arg0.field912 = (int) (Math.sin((double) field994 / 40.0D) * 256.0D) & 2047;
            if (this.field1023) {
                this.field1023 = false;
                Model[] var4 = new Model[7];
                int var5 = 0;
                for (int var6 = 0; var6 < 7; ++var6) {
                    int var9 = this.field1092[var6];
                    if (var9 >= 0) {
                        var4[var5++] = IdkType.field852[var9].method273();
                    }
                }
                Model var7 = new Model(var5, false, var4);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field1169[var8] != 0) {
                        var7.method115(field1201[var8][0], field1201[var8][this.field1169[var8]]);
                        if (var8 == 1) {
                            var7.method115(field988[0], field988[this.field1169[var8]]);
                        }
                    }
                }
                var7.method108(0);
                var7.method109(false, SeqType.field927[this.field1139.field289].field929[0]);
                var7.method118(64, 850, -30, -50, -30, true);
                arg0.field906 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Ldc;I)Z")
    public final boolean method387(Component arg0, int arg1) {
        int var3 = arg0.field871;
        if (arg1 != 2) {
            this.field1152 = null;
        }
        if (var3 == 201) {
            this.field1107 = true;
            this.field1054 = false;
            this.field980 = true;
            this.field1262 = "";
            this.field1058 = 1;
            this.field1247 = "Enter name of friend to add to list";
        }
        if (var3 == 202) {
            this.field1107 = true;
            this.field1054 = false;
            this.field980 = true;
            this.field1262 = "";
            this.field1058 = 2;
            this.field1247 = "Enter name of friend to delete from list";
        }
        if (var3 >= 1 && var3 <= 200) {
            if (var3 >= 101) {
                var3 -= 101;
            } else {
                --var3;
            }
            if (this.field1285[var3] > 0) {
                this.field1107 = true;
                this.field1054 = false;
                this.field980 = true;
                this.field1262 = "";
                this.field1058 = 3;
                this.field1078 = var3;
                this.field1247 = "Enter message to send to " + this.field1199[var3];
            }
        }
        if (var3 == 501) {
            this.field1107 = true;
            this.field1054 = false;
            this.field980 = true;
            this.field1262 = "";
            this.field1058 = 4;
            this.field1247 = "Enter name of player to add to list";
        }
        if (var3 == 502) {
            this.field1107 = true;
            this.field1054 = false;
            this.field980 = true;
            this.field1262 = "";
            this.field1058 = 5;
            this.field1247 = "Enter name of player to delete from list";
        }
        if (var3 >= 300 && var3 <= 313) {
            int var4 = (var3 - 300) / 2;
            int var5 = var3 & 1;
            int var6 = this.field1092[var4];
            if (var6 != -1) {
                while (true) {
                    if (var5 == 0) {
                        --var6;
                        if (var6 < 0) {
                            var6 = IdkType.field851 - 1;
                        }
                    }
                    if (var5 == 1) {
                        ++var6;
                        if (var6 >= IdkType.field851) {
                            var6 = 0;
                        }
                    }
                    if (IdkType.field852[var6].field853 == var4 + (this.field1072 ? 0 : 7)) {
                        this.field1092[var4] = var6;
                        this.field1023 = true;
                        break;
                    }
                }
            }
        }
        if (var3 >= 314 && var3 <= 323) {
            int var7 = (var3 - 314) / 2;
            int var8 = var3 & 1;
            int var9 = this.field1169[var7];
            if (var8 == 0) {
                --var9;
                if (var9 < 0) {
                    var9 = field1201[var7].length - 1;
                }
            }
            if (var8 == 1) {
                ++var9;
                if (var9 >= field1201[var7].length) {
                    var9 = 0;
                }
            }
            this.field1169[var7] = var9;
            this.field1023 = true;
        }
        if (var3 == 324 && !this.field1072) {
            this.field1072 = true;
            this.method388((byte) 86);
        }
        if (var3 == 325 && this.field1072) {
            this.field1072 = false;
            this.method388((byte) 86);
        }
        if (var3 != 326) {
            return false;
        } else {
            this.field1043.method177(false, 128);
            this.field1043.method178(this.field1072 ? 0 : 1);
            for (int var10 = 0; var10 < 7; ++var10) {
                this.field1043.method178(this.field1092[var10]);
            }
            for (int var11 = 0; var11 < 5; ++var11) {
                this.field1043.method178(this.field1169[var11]);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method388(byte arg0) {
        this.field1023 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field1092[var2] = -1;
            for (int var3 = 0; var3 < IdkType.field851; ++var3) {
                if (IdkType.field852[var3].field853 == var2 + (this.field1072 ? 0 : 7)) {
                    this.field1092[var2] = var3;
                    break;
                }
            }
        }
        if (arg0 != 86) {
            this.field1141 = !this.field1141;
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method389(int arg0) {
        int var2 = 51 / arg0;
        this.field1135.method210(0);
        int var3 = this.field1139.field280 / 32 + 48;
        int var4 = 464 - this.field1139.field281 / 32;
        this.field1279.method159(21, var3, var4, this.field1096, 151, -22915, this.field983, 146, this.field1204, 9);
        this.field1214.method159(0, 25, 25, this.field1096, 33, -22915, this.field1130, 33, this.field1122, 0);
        for (int var5 = 0; var5 < this.field1009; ++var5) {
            int var19 = this.field1010[var5] * 4 + 2 - this.field1139.field280 / 32;
            int var20 = this.field1011[var5] * 4 + 2 - this.field1139.field281 / 32;
            this.method390(var19, var20, 945, this.field1145[var5]);
        }
        for (int var6 = 0; var6 < 104; ++var6) {
            for (int var15 = 0; var15 < 104; ++var15) {
                LinkList var16 = this.field1152[this.field1205][var6][var15];
                if (var16 != null) {
                    int var17 = var6 * 4 + 2 - this.field1139.field280 / 32;
                    int var18 = var15 * 4 + 2 - this.field1139.field281 / 32;
                    this.method390(var17, var18, 945, this.field1156);
                }
            }
        }
        for (int var7 = 0; var7 < this.field1282; ++var7) {
            NpcEntity var12 = this.field1281[this.field1283[var7]];
            if (var12 != null && var12.method94(-29424) && var12.field331.field776) {
                int var13 = var12.field280 / 32 - this.field1139.field280 / 32;
                int var14 = var12.field281 / 32 - this.field1139.field281 / 32;
                this.method390(var13, var14, 945, this.field1157);
            }
        }
        for (int var8 = 0; var8 < this.field1084; ++var8) {
            PlayerEntity var9 = this.field1083[this.field1085[var8]];
            if (var9 != null && var9.method98(-29424)) {
                int var10 = var9.field280 / 32 - this.field1139.field280 / 32;
                int var11 = var9.field281 / 32 - this.field1139.field281 / 32;
                this.method390(var10, var11, 945, this.field1158);
            }
        }
        Pix2D.method131(16777215, 3, 82, false, 3, 93);
        this.field1136.method210(0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILgb;)V")
    public final void method390(int arg0, int arg1, int arg2, Pix32 arg3) {
        int var5 = arg0 * arg0 + arg1 * arg1;
        int var6 = 4 / arg2;
        if (var5 <= 6400) {
            int var7 = Model.field499[this.field1096];
            int var8 = Model.field500[this.field1096];
            int var9 = arg0 * var8 + arg1 * var7 >> 16;
            int var10 = arg1 * var8 - arg0 * var7 >> 16;
            if (var5 > 2500) {
                arg3.method160(this.field991, var9 + 94 - arg3.field548 / 2, 0, 83 - var10 - arg3.field549 / 2);
            } else {
                arg3.method155(var9 + 94 - arg3.field548 / 2, true, 83 - var10 - arg3.field549 / 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public final void method391(int arg0, String arg1, String arg2, int arg3) {
        if (this.field1264 == -1) {
            this.field1107 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field1176[var5] = this.field1176[var5 - 1];
            this.field1090[var5] = this.field1090[var5 - 1];
            this.field1278[var5] = this.field1278[var5 - 1];
        }
        this.field1176[0] = arg0;
        this.field1090[0] = arg1;
        this.field1278[0] = arg2;
        if (arg3 != 36887) {
            this.field1223 = !this.field1223;
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method392(int arg0) {
        this.field1137.method210(0);
        if (arg0 != 0) {
            this.field1013 = !this.field1013;
        }
        Pix3D.field531 = this.field1046;
        this.field992.method166(0, true, 0);
        if (this.field980) {
            this.field1001.method168(40, this.field1223, 239, 0, this.field1247);
            this.field1001.method168(60, this.field1223, 239, 128, this.field1262 + "*");
        } else if (this.field1054) {
            this.field1001.method168(40, this.field1223, 239, 0, "Enter amount to transfer:");
            this.field1001.method168(60, this.field1223, 239, 128, this.field1165 + "*");
        } else if (this.field1264 != -1) {
            this.method376(0, Component.field862[this.field1264], 0, 0, -204);
        } else {
            int var2 = 0;
            Pix2D.method129(463, this.field1120, 0, 0, 77);
            for (int var3 = 0; var3 < 50; ++var3) {
                if (this.field1278[var3] != null) {
                    int var4 = this.field1176[var3];
                    int var5 = 70 - var2 * 14 + this.field1212;
                    if (var4 == 0) {
                        if (var5 > 0 && var5 < 110) {
                            this.field1002.method171(this.field1278[var3], 4, var5, 0, -200);
                        }
                        ++var2;
                    }
                    if (var4 == 1) {
                        if (var5 > 0 && var5 < 110) {
                            this.field1002.method171(this.field1090[var3] + ":", 4, var5, 16777215, -200);
                            this.field1002.method171(this.field1278[var3], 12 + this.field1002.method170(331, this.field1090[var3]), var5, 255, -200);
                        }
                        ++var2;
                    }
                    if (var4 == 2 && (this.field1149 == 0 || this.field1149 == 1 && this.method393(this.field1090[var3], (byte) -21))) {
                        if (var5 > 0 && var5 < 110) {
                            this.field1002.method171(this.field1090[var3] + ":", 4, var5, 0, -200);
                            this.field1002.method171(this.field1278[var3], 12 + this.field1002.method170(331, this.field1090[var3]), var5, 255, -200);
                        }
                        ++var2;
                    }
                    if (var4 == 3 && (this.field1112 == 0 || this.field1112 == 1 && this.method393(this.field1090[var3], (byte) -21))) {
                        if (var5 > 0 && var5 < 110) {
                            this.field1002.method171("From " + this.field1090[var3] + ":", 4, var5, 0, -200);
                            this.field1002.method171(this.field1278[var3], 12 + this.field1002.method170(331, "From " + this.field1090[var3]), var5, 8388608, -200);
                        }
                        ++var2;
                    }
                    if (var4 == 4 && (this.field1089 == 0 || this.field1089 == 1 && this.method393(this.field1090[var3], (byte) -21))) {
                        if (var5 > 0 && var5 < 110) {
                            this.field1002.method171(this.field1090[var3] + " " + this.field1278[var3], 4, var5, 8388736, -200);
                        }
                        ++var2;
                    }
                    if (var4 == 5 && this.field1112 < 2) {
                        if (var5 > 0 && var5 < 110) {
                            this.field1002.method171(this.field1278[var3], 4, var5, 8388608, -200);
                        }
                        ++var2;
                    }
                    if (var4 == 6 && this.field1112 < 2) {
                        if (var5 > 0 && var5 < 110) {
                            this.field1002.method171("To " + this.field1090[var3] + ":", 4, var5, 0, -200);
                            this.field1002.method171(this.field1278[var3], 12 + this.field1002.method170(331, "To " + this.field1090[var3]), var5, 8388608, -200);
                        }
                        ++var2;
                    }
                }
            }
            Pix2D.method128((byte) 9);
            this.field1261 = var2 * 14 + 7;
            if (this.field1261 < 78) {
                this.field1261 = 78;
            }
            this.method378(0, 463, this.field1261 - this.field1212 - 77, 77, this.field1261, 5);
            this.field1002.method171(this.field1164 + "*", 3, 90, 0, -200);
            Pix2D.method133(true, 0, 77, 479, 0);
        }
        this.field1137.method211(super.field13, 22, 375);
        this.field1136.method210(0);
        Pix3D.field531 = this.field1048;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method393(String arg0, byte arg1) {
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field1188; ++var3) {
                if (arg0.equalsIgnoreCase(this.field1199[var3])) {
                    return true;
                }
            }
            if (this.field1206 != arg1) {
                throw new NullPointerException();
            } else {
                return arg0.equalsIgnoreCase(this.field1139.field336);
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method394(int arg0) {
        this.field1134.method210(0);
        Pix3D.field531 = this.field1047;
        this.field990.method166(0, true, 0);
        if (this.field1051 != -1) {
            this.method376(0, Component.field862[this.field1051], 0, 0, -204);
        } else if (this.field1200[this.field1059] != -1) {
            this.method376(0, Component.field862[this.field1200[this.field1059]], 0, 0, -204);
        }
        if (this.field1228 && this.field1159 == 1) {
            this.method368(false);
        }
        this.field1134.method211(super.field13, 562, 231);
        this.field1136.method210(0);
        Pix3D.field531 = this.field1048;
        if (arg0 <= 0) {
            this.field1144 = -361;
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)I")
    public final int method395(int arg0) {
        int var2 = 45 / arg0;
        return 0;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)Ljava/awt/Component;")
    public final java.awt.Component method11(byte arg0) {
        if (arg0 != 8) {
            this.field1061 = -1;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field16 != null ? super.field16 : this;
        }
    }

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field16 != null) {
                    return new URL("http://" + this.field1227 + ":" + (this.field1187 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)Ljava/lang/String;")
    public final String method396(int arg0) {
        this.field1060 += arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field16 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
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
    public final DataInputStream method397(String arg0) throws IOException {
        return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method398(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
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

    @OriginalMember(owner = "client", name = "getjinglelen", descriptor = "()I")
    public final int getjinglelen() {
        return signlink.jinglelen;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + 300.0D * Math.pow(2.0D, (double) var2 / 7.0D));
            var0 += var3;
            field1166[var1] = var0 / 4;
        }
        field1201 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
    }
}
