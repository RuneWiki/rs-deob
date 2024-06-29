import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class66 extends class167 {

    @OriginalMember(owner = "client!jj", name = "jb", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field971 = new Hashtable();

    @OriginalMember(owner = "client!jj", name = "je", descriptor = "I")
    public int field1127 = 128;

    @OriginalMember(owner = "client!jj", name = "de", descriptor = "Lhc;")
    private class391 field1121 = new class391();

    @OriginalMember(owner = "client!jj", name = "ne", descriptor = "Lol;")
    private class249 field1131 = new class249();

    @OriginalMember(owner = "client!jj", name = "oe", descriptor = "Lol;")
    public class249 field1132 = new class249();

    @OriginalMember(owner = "client!jj", name = "qe", descriptor = "I")
    public int field1134 = 3;

    @OriginalMember(owner = "client!jj", name = "ue", descriptor = "Z")
    private boolean field1138 = false;

    @OriginalMember(owner = "client!jj", name = "te", descriptor = "I")
    public int field1137 = 8;

    @OriginalMember(owner = "client!jj", name = "se", descriptor = "Lfea;")
    private class47 field1136 = new class47();

    @OriginalMember(owner = "client!jj", name = "we", descriptor = "I")
    private int field1140 = -1;

    @OriginalMember(owner = "client!jj", name = "ye", descriptor = "[Lcu;")
    private class436[] field1142 = new class436[4];

    @OriginalMember(owner = "client!jj", name = "Ae", descriptor = "I")
    private int field1144 = -1;

    @OriginalMember(owner = "client!jj", name = "De", descriptor = "[Lcu;")
    private class436[] field1147 = new class436[4];

    @OriginalMember(owner = "client!jj", name = "Ce", descriptor = "[Lcu;")
    private class436[] field1146 = new class436[4];

    @OriginalMember(owner = "client!jj", name = "ze", descriptor = "I")
    private int field1143 = -1;

    @OriginalMember(owner = "client!jj", name = "He", descriptor = "Lfea;")
    private class47 field1151;

    @OriginalMember(owner = "client!jj", name = "Ie", descriptor = "Lfea;")
    private class47 field1152;

    @OriginalMember(owner = "client!jj", name = "Je", descriptor = "Lfea;")
    private class47 field1153;

    @OriginalMember(owner = "client!jj", name = "Ke", descriptor = "Lfea;")
    private class47 field1154;

    @OriginalMember(owner = "client!jj", name = "Le", descriptor = "Lfea;")
    private class47 field1155;

    @OriginalMember(owner = "client!jj", name = "Me", descriptor = "Lfea;")
    private class47 field1156;

    @OriginalMember(owner = "client!jj", name = "Ne", descriptor = "Lfea;")
    private class47 field1157;

    @OriginalMember(owner = "client!jj", name = "df", descriptor = "I")
    private int field1173;

    @OriginalMember(owner = "client!jj", name = "of", descriptor = "F")
    public float field1183;

    @OriginalMember(owner = "client!jj", name = "Qe", descriptor = "[F")
    private float[] field1160;

    @OriginalMember(owner = "client!jj", name = "Kf", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!jj", name = "Df", descriptor = "[F")
    private float[] field1198;

    @OriginalMember(owner = "client!jj", name = "Te", descriptor = "[Luca;")
    private class637[] field1163;

    @OriginalMember(owner = "client!jj", name = "Re", descriptor = "F")
    public float field1161;

    @OriginalMember(owner = "client!jj", name = "Nf", descriptor = "F")
    public float field1208;

    @OriginalMember(owner = "client!jj", name = "nf", descriptor = "F")
    private float field1182;

    @OriginalMember(owner = "client!jj", name = "Ef", descriptor = "I")
    private int field1199;

    @OriginalMember(owner = "client!jj", name = "hg", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!jj", name = "lg", descriptor = "F")
    private float field1232;

    @OriginalMember(owner = "client!jj", name = "gf", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "client!jj", name = "qg", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "client!jj", name = "sg", descriptor = "I")
    private int field1239;

    @OriginalMember(owner = "client!jj", name = "kg", descriptor = "F")
    private float field1231;

    @OriginalMember(owner = "client!jj", name = "Af", descriptor = "I")
    private int field1195;

    @OriginalMember(owner = "client!jj", name = "Tf", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client!jj", name = "ig", descriptor = "I")
    public int field1229;

    @OriginalMember(owner = "client!jj", name = "Lf", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "client!jj", name = "mg", descriptor = "I")
    private int field1233;

    @OriginalMember(owner = "client!jj", name = "og", descriptor = "Z")
    private boolean field1235;

    @OriginalMember(owner = "client!jj", name = "Yf", descriptor = "I")
    public int field1219;

    @OriginalMember(owner = "client!jj", name = "vf", descriptor = "I")
    private int field1190;

    @OriginalMember(owner = "client!jj", name = "xf", descriptor = "I")
    private int field1192;

    @OriginalMember(owner = "client!jj", name = "Ag", descriptor = "[F")
    public float[] field1247;

    @OriginalMember(owner = "client!jj", name = "cf", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "client!jj", name = "Lg", descriptor = "F")
    public float field1258;

    @OriginalMember(owner = "client!jj", name = "Pg", descriptor = "F")
    public float field1262;

    @OriginalMember(owner = "client!jj", name = "Sg", descriptor = "F")
    private float field1265;

    @OriginalMember(owner = "client!jj", name = "Pf", descriptor = "[F")
    private float[] field1210;

    @OriginalMember(owner = "client!jj", name = "Hg", descriptor = "F")
    private float field1254;

    @OriginalMember(owner = "client!jj", name = "bg", descriptor = "F")
    public float field1222;

    @OriginalMember(owner = "client!jj", name = "Og", descriptor = "I")
    public int field1261;

    @OriginalMember(owner = "client!jj", name = "Bg", descriptor = "F")
    public float field1248;

    @OriginalMember(owner = "client!jj", name = "Kg", descriptor = "I")
    private int field1257;

    @OriginalMember(owner = "client!jj", name = "Wf", descriptor = "[F")
    private float[] field1217;

    @OriginalMember(owner = "client!jj", name = "dh", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "client!jj", name = "Ig", descriptor = "I")
    private int field1255;

    @OriginalMember(owner = "client!jj", name = "Zg", descriptor = "F")
    public float field1272;

    @OriginalMember(owner = "client!jj", name = "eh", descriptor = "I")
    public int field1277;

    @OriginalMember(owner = "client!jj", name = "Zf", descriptor = "Ljv;")
    public class583 field1220;

    @OriginalMember(owner = "client!jj", name = "fh", descriptor = "[B")
    public byte[] field1278;

    @OriginalMember(owner = "client!jj", name = "hh", descriptor = "[I")
    public int[] field1280;

    @OriginalMember(owner = "client!jj", name = "ih", descriptor = "[I")
    public int[] field1281;

    @OriginalMember(owner = "client!jj", name = "jh", descriptor = "[I")
    public int[] field1282;

    @OriginalMember(owner = "client!jj", name = "Nd", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1105;

    @OriginalMember(owner = "client!jj", name = "lc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1025;

    @OriginalMember(owner = "client!jj", name = "fe", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!jj", name = "ic", descriptor = "Ljaggl/OpenGL;")
    private OpenGL field1022;

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "J")
    private long field949;

    @OriginalMember(owner = "client!jj", name = "Xc", descriptor = "J")
    private long field1063;

    @OriginalMember(owner = "client!jj", name = "sf", descriptor = "Z")
    public boolean field1187;

    @OriginalMember(owner = "client!jj", name = "Pe", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "client!jj", name = "Mf", descriptor = "Ljava/lang/String;")
    private String field1207;

    @OriginalMember(owner = "client!jj", name = "Vf", descriptor = "Z")
    public boolean field1216;

    @OriginalMember(owner = "client!jj", name = "Xf", descriptor = "Z")
    public boolean field1218;

    @OriginalMember(owner = "client!jj", name = "ff", descriptor = "Z")
    private boolean field1175;

    @OriginalMember(owner = "client!jj", name = "Oe", descriptor = "Z")
    public boolean field1158;

    @OriginalMember(owner = "client!jj", name = "eg", descriptor = "Z")
    private boolean field1225;

    @OriginalMember(owner = "client!jj", name = "Qf", descriptor = "Z")
    public boolean field1211;

    @OriginalMember(owner = "client!jj", name = "Xg", descriptor = "Ljava/lang/String;")
    private String field1270;

    @OriginalMember(owner = "client!jj", name = "Gf", descriptor = "Z")
    public boolean field1201;

    @OriginalMember(owner = "client!jj", name = "Se", descriptor = "Z")
    private boolean field1162;

    @OriginalMember(owner = "client!jj", name = "Sd", descriptor = "Lba;")
    private class606 field1110;

    @OriginalMember(owner = "client!jj", name = "ve", descriptor = "Lnv;")
    public class61 field1139;

    @OriginalMember(owner = "client!jj", name = "Vd", descriptor = "Lph;")
    private class441 field1113;

    @OriginalMember(owner = "client!jj", name = "me", descriptor = "Ltu;")
    private class10 field1130;

    @OriginalMember(owner = "client!jj", name = "Td", descriptor = "Lrd;")
    private class419 field1111;

    @OriginalMember(owner = "client!jj", name = "Cb", descriptor = "I")
    public static int field990 = 104;

    @OriginalMember(owner = "client!jj", name = "rd", descriptor = "Lio;")
    public static class151 field1083 = new class151(11, 0, 1, 2);

    @OriginalMember(owner = "client!jj", name = "lf", descriptor = "F")
    private float field1180;

    @OriginalMember(owner = "client!jj", name = "Cf", descriptor = "F")
    public float field1197;

    @OriginalMember(owner = "client!jj", name = "Of", descriptor = "F")
    public float field1209;

    @OriginalMember(owner = "client!jj", name = "Rf", descriptor = "F")
    private float field1212;

    @OriginalMember(owner = "client!jj", name = "ng", descriptor = "F")
    public float field1234;

    @OriginalMember(owner = "client!jj", name = "vg", descriptor = "F")
    public float field1242;

    @OriginalMember(owner = "client!jj", name = "xg", descriptor = "F")
    public float field1244;

    @OriginalMember(owner = "client!jj", name = "yg", descriptor = "F")
    public float field1245;

    @OriginalMember(owner = "client!jj", name = "Dg", descriptor = "F")
    private float field1250;

    @OriginalMember(owner = "client!jj", name = "ah", descriptor = "F")
    public float field1273;

    @OriginalMember(owner = "client!jj", name = "Mb", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!jj", name = "Nb", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!jj", name = "Ob", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!jj", name = "Pb", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!jj", name = "Qb", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!jj", name = "Rb", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!jj", name = "Sb", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!jj", name = "Tb", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!jj", name = "Ub", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!jj", name = "Vb", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!jj", name = "Wb", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!jj", name = "Yb", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!jj", name = "Zb", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!jj", name = "ac", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!jj", name = "bc", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!jj", name = "cc", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!jj", name = "dc", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!jj", name = "ec", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!jj", name = "fc", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!jj", name = "gc", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!jj", name = "hc", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!jj", name = "jc", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!jj", name = "kc", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!jj", name = "mc", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!jj", name = "nc", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!jj", name = "oc", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!jj", name = "pc", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!jj", name = "qc", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!jj", name = "rc", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!jj", name = "sc", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!jj", name = "tc", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!jj", name = "uc", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!jj", name = "vc", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!jj", name = "wc", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!jj", name = "xc", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!jj", name = "yc", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!jj", name = "zc", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!jj", name = "Ac", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!jj", name = "Bc", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!jj", name = "Cc", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!jj", name = "Dc", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!jj", name = "Ec", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!jj", name = "Fc", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!jj", name = "Gc", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!jj", name = "Hc", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!jj", name = "Ic", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!jj", name = "Jc", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!jj", name = "Kc", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!jj", name = "Lc", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!jj", name = "Mc", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!jj", name = "Nc", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!jj", name = "Oc", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!jj", name = "Pc", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!jj", name = "Qc", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!jj", name = "Rc", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!jj", name = "Sc", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!jj", name = "Tc", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!jj", name = "Uc", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!jj", name = "Vc", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!jj", name = "Wc", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!jj", name = "Yc", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!jj", name = "Zc", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!jj", name = "ad", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!jj", name = "bd", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!jj", name = "cd", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!jj", name = "dd", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!jj", name = "ed", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!jj", name = "fd", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!jj", name = "gd", descriptor = "I")
    private int field1072;

    @OriginalMember(owner = "client!jj", name = "hd", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!jj", name = "id", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!jj", name = "jd", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!jj", name = "kd", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!jj", name = "ld", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!jj", name = "md", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!jj", name = "nd", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!jj", name = "od", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!jj", name = "pd", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!jj", name = "qd", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!jj", name = "sd", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!jj", name = "td", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!jj", name = "ud", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!jj", name = "vd", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!jj", name = "wd", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!jj", name = "xd", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!jj", name = "yd", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!jj", name = "zd", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!jj", name = "Ad", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!jj", name = "Bd", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!jj", name = "Cd", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!jj", name = "Dd", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!jj", name = "Ed", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!jj", name = "Fd", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!jj", name = "Gd", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!jj", name = "Hd", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!jj", name = "Id", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!jj", name = "Jd", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!jj", name = "Kd", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!jj", name = "Ld", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!jj", name = "Md", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!jj", name = "Od", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!jj", name = "Pd", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!jj", name = "Qd", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!jj", name = "Rd", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!jj", name = "Ud", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!jj", name = "Xd", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!jj", name = "Yd", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!jj", name = "Zd", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!jj", name = "ae", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!jj", name = "be", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!jj", name = "ce", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!jj", name = "ee", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!jj", name = "ge", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!jj", name = "he", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!jj", name = "ie", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!jj", name = "ke", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!jj", name = "le", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!jj", name = "re", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!jj", name = "Ee", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!jj", name = "Fe", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "client!jj", name = "Ge", descriptor = "I")
    private int field1150;

    @OriginalMember(owner = "client!jj", name = "hf", descriptor = "I")
    private int field1177;

    @OriginalMember(owner = "client!jj", name = "jf", descriptor = "I")
    private int field1178;

    @OriginalMember(owner = "client!jj", name = "kf", descriptor = "I")
    private int field1179;

    @OriginalMember(owner = "client!jj", name = "uf", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "client!jj", name = "Ff", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!jj", name = "Jf", descriptor = "I")
    private int field1204;

    @OriginalMember(owner = "client!jj", name = "cg", descriptor = "I")
    private int field1223;

    @OriginalMember(owner = "client!jj", name = "dg", descriptor = "I")
    private int field1224;

    @OriginalMember(owner = "client!jj", name = "gg", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!jj", name = "jg", descriptor = "I")
    private int field1230;

    @OriginalMember(owner = "client!jj", name = "wg", descriptor = "I")
    private int field1243;

    @OriginalMember(owner = "client!jj", name = "zg", descriptor = "I")
    private int field1246;

    @OriginalMember(owner = "client!jj", name = "Cg", descriptor = "I")
    private int field1249;

    @OriginalMember(owner = "client!jj", name = "Mg", descriptor = "I")
    private int field1259;

    @OriginalMember(owner = "client!jj", name = "Tg", descriptor = "I")
    public int field1266;

    @OriginalMember(owner = "client!jj", name = "gh", descriptor = "I")
    private int field1279;

    @OriginalMember(owner = "client!jj", name = "kh", descriptor = "I")
    private int field1283;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!jj", name = "V", descriptor = "I")
    private int field957;

    @OriginalMember(owner = "client!jj", name = "W", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!jj", name = "X", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!jj", name = "Y", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!jj", name = "Z", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!jj", name = "ab", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!jj", name = "bb", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!jj", name = "cb", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!jj", name = "db", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!jj", name = "eb", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "client!jj", name = "fb", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!jj", name = "gb", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!jj", name = "hb", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!jj", name = "ib", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!jj", name = "kb", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!jj", name = "lb", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!jj", name = "mb", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!jj", name = "nb", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!jj", name = "ob", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!jj", name = "pb", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!jj", name = "qb", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!jj", name = "rb", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!jj", name = "sb", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!jj", name = "tb", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!jj", name = "ub", descriptor = "I")
    public int field982;

    @OriginalMember(owner = "client!jj", name = "vb", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!jj", name = "wb", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!jj", name = "xb", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!jj", name = "yb", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!jj", name = "zb", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!jj", name = "Ab", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!jj", name = "Bb", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!jj", name = "Db", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!jj", name = "Eb", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!jj", name = "Fb", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!jj", name = "Gb", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!jj", name = "Hb", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!jj", name = "Ib", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!jj", name = "Jb", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!jj", name = "Kb", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!jj", name = "Lb", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!jj", name = "ug", descriptor = "J")
    private long field1241;

    @OriginalMember(owner = "client!jj", name = "Xb", descriptor = "Lha;")
    public static class116 field1011;

    @OriginalMember(owner = "client!jj", name = "Fg", descriptor = "Lgw;")
    private class140 field1252;

    @OriginalMember(owner = "client!jj", name = "pg", descriptor = "Lol;")
    public class249 field1236;

    @OriginalMember(owner = "client!jj", name = "bh", descriptor = "Lol;")
    public class249 field1274;

    @OriginalMember(owner = "client!jj", name = "Ze", descriptor = "Las;")
    public class25 field1169;

    @OriginalMember(owner = "client!jj", name = "pf", descriptor = "Las;")
    public class25 field1184;

    @OriginalMember(owner = "client!jj", name = "If", descriptor = "Lfs;")
    public class353 field1203;

    @OriginalMember(owner = "client!jj", name = "Ye", descriptor = "Lhp;")
    public class355 field1168;

    @OriginalMember(owner = "client!jj", name = "Ve", descriptor = "Lla;")
    public class374 field1165;

    @OriginalMember(owner = "client!jj", name = "We", descriptor = "Lla;")
    public class374 field1166;

    @OriginalMember(owner = "client!jj", name = "af", descriptor = "Lla;")
    public class374 field1170;

    @OriginalMember(owner = "client!jj", name = "ef", descriptor = "Lla;")
    public class374 field1174;

    @OriginalMember(owner = "client!jj", name = "Sf", descriptor = "Lla;")
    public class374 field1213;

    @OriginalMember(owner = "client!jj", name = "ag", descriptor = "Lla;")
    public class374 field1221;

    @OriginalMember(owner = "client!jj", name = "fg", descriptor = "Lla;")
    public class374 field1226;

    @OriginalMember(owner = "client!jj", name = "Ng", descriptor = "Lla;")
    public class374 field1260;

    @OriginalMember(owner = "client!jj", name = "Vg", descriptor = "Lla;")
    public class374 field1268;

    @OriginalMember(owner = "client!jj", name = "Wg", descriptor = "Lla;")
    public class374 field1269;

    @OriginalMember(owner = "client!jj", name = "tf", descriptor = "Lpi;")
    private class423 field1188;

    @OriginalMember(owner = "client!jj", name = "zf", descriptor = "Lpi;")
    private class423 field1194;

    @OriginalMember(owner = "client!jj", name = "xe", descriptor = "Lcu;")
    private class436 field1141;

    @OriginalMember(owner = "client!jj", name = "Be", descriptor = "Lcu;")
    private class436 field1145;

    @OriginalMember(owner = "client!jj", name = "Ug", descriptor = "Lev;")
    private class544 field1267;

    @OriginalMember(owner = "client!jj", name = "mf", descriptor = "Log;")
    private class98 field1181;

    @OriginalMember(owner = "client!jj", name = "pe", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1133;

    @OriginalMember(owner = "client!jj", name = "Ue", descriptor = "Z")
    public boolean field1164;

    @OriginalMember(owner = "client!jj", name = "Xe", descriptor = "Z")
    public boolean field1167;

    @OriginalMember(owner = "client!jj", name = "bf", descriptor = "Z")
    private boolean field1171;

    @OriginalMember(owner = "client!jj", name = "qf", descriptor = "Z")
    public boolean field1185;

    @OriginalMember(owner = "client!jj", name = "rf", descriptor = "Z")
    private boolean field1186;

    @OriginalMember(owner = "client!jj", name = "wf", descriptor = "Z")
    private boolean field1191;

    @OriginalMember(owner = "client!jj", name = "yf", descriptor = "Z")
    private boolean field1193;

    @OriginalMember(owner = "client!jj", name = "Bf", descriptor = "Z")
    private boolean field1196;

    @OriginalMember(owner = "client!jj", name = "Hf", descriptor = "Z")
    private boolean field1202;

    @OriginalMember(owner = "client!jj", name = "Uf", descriptor = "Z")
    public boolean field1215;

    @OriginalMember(owner = "client!jj", name = "rg", descriptor = "Z")
    public boolean field1238;

    @OriginalMember(owner = "client!jj", name = "Eg", descriptor = "Z")
    private boolean field1251;

    @OriginalMember(owner = "client!jj", name = "Gg", descriptor = "Z")
    private boolean field1253;

    @OriginalMember(owner = "client!jj", name = "Jg", descriptor = "Z")
    public boolean field1256;

    @OriginalMember(owner = "client!jj", name = "Qg", descriptor = "Z")
    public boolean field1263;

    @OriginalMember(owner = "client!jj", name = "Rg", descriptor = "Z")
    private boolean field1264;

    @OriginalMember(owner = "client!jj", name = "Yg", descriptor = "Z")
    private boolean field1271;

    @OriginalMember(owner = "client!jj", name = "ch", descriptor = "Z")
    public boolean field1275;

    @OriginalMember(owner = "client!jj", name = "tg", descriptor = "[Laba;")
    private class222[] field1240;

    @OriginalMember(owner = "client!jj", name = "Wd", descriptor = "[S")
    public static short[] field1114;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "(I)V")
    public static void method512(int arg0) {
        field1083 = null;
        field1114 = null;
        field1011 = null;
        if (arg0 != 17447) {
            method512(-96);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)V")
    public final void method513(int arg0, boolean arg1) {
        ++field947;
        if (arg0 != 1) {
            this.field1185 = true;
        }
        if (!arg1 != !this.field1191) {
            this.field1191 = arg1;
            this.method534((byte) 65);
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(IZ)V")
    public final void method514(int arg0, boolean arg1) {
        ++field961;
        this.method541(arg1, -82, arg0);
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(IIIIII)Lkk;")
    public final class149 method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1016;
        return !this.field1185 ? null : new class37(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.method577((byte) -40);
        ++field968;
        this.method598(arg9, (byte) -126);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (arg6 >> 16), (byte) (arg6 >> 8), (byte) arg6, (byte) (arg6 >> 24));
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
        OpenGL.glColor4ub((byte) (arg8 >> 16), (byte) (arg8 >> 8), (byte) arg8, (byte) (arg8 >> 24));
        OpenGL.glVertex2f((float) arg4 + 0.35F, (float) arg5 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    private final void method516(byte arg0) {
        ++field964;
        OpenGL.glMatrixMode(5889);
        if (arg0 <= -111) {
            OpenGL.glLoadMatrixf(this.field1160, 0);
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "()Z")
    public final boolean method407() {
        ++field950;
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "la", descriptor = "(FF)V")
    public final void method517(float arg0, float arg1) {
        ++field1046;
        if (this.field1258 != arg0 || this.field1197 != arg1) {
            this.field1197 = arg1;
            this.field1258 = arg0;
            this.method533(1445);
            if (~this.field1179 == -4) {
                this.method644((byte) 127);
                return;
            }
            if (~this.field1179 != -3) {
                return;
            }
            this.method516((byte) -128);
        }
    }

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "(I)V")
    private final void method518(int arg0) {
        ++field940;
        if (this.field1025 != null) {
            Dimension var2 = this.field1025.getSize();
            this.field957 = var2.width;
            this.field1072 = var2.height;
        } else {
            this.field957 = this.field1072 = 0;
        }
        if (this.field1141 == null) {
            this.field982 = this.field1072;
            this.field966 = this.field957;
            this.method544((byte) -125);
        }
        if (arg0 != -18631) {
            this.field1227 = 61;
        }
        this.method547(arg0 ^ 18630);
        this.method657();
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(IIII)V")
    public final void method519(int arg0, int arg1, int arg2, int arg3) {
        this.field1276 = arg0;
        this.field1205 = arg1;
        ++field1094;
        this.field1277 = arg3;
        this.field1228 = arg2;
        this.method536(-57);
        this.method611((byte) 91);
        if (this.field1179 == 3) {
            this.method644((byte) 123);
        } else if (~this.field1179 == -3) {
            this.method516((byte) -119);
        }
    }

    @OriginalMember(owner = "client!jj", name = "YA", descriptor = "()I")
    public final int method120() {
        ++field976;
        int var1 = this.field1279;
        this.field1279 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lpi;B)V")
    public final void method520(class423 arg0, byte arg1) {
        int var3 = -124 / ((-14 - arg1) / 57);
        ++field1036;
        if (this.field1194 != arg0) {
            if (this.field1175) {
                OpenGL.glBindBufferARB(34962, arg0.method1553(-64));
            }
            this.field1194 = arg0;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public final void method521(int arg0) {
        ++field984;
        if (arg0 >= 128 && arg0 <= 1024) {
            this.field1127 = arg0;
            this.field1110.method3452(false);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIB)V")
    public final synchronized void method522(int arg0, int arg1, byte arg2) {
        ++field1034;
        class264 var4 = new class264(arg1);
        var4.field1798 = (long) arg0;
        this.field1152.method414(var4, (byte) 107);
        if (arg2 > -65) {
            this.method101(-48);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLgw;III)V")
    public final void method523(byte arg0, class140 arg1, int arg2, int arg3, int arg4) {
        ++field973;
        int var6 = arg1.method309(true);
        int var7 = arg3 * this.method538(121, var6);
        this.method540((byte) -25, arg1);
        OpenGL.glDrawElements(arg2, arg4, var6, (long) var7 + arg1.method305(-21337));
        if (arg0 != 61) {
            this.field1159 = 102;
        }
    }

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "()Z")
    public final boolean method524() {
        ++field1081;
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(Z)V")
    public final void method525(boolean arg0) {
        ++field1109;
    }

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "(I)V")
    private final void method526(int arg0) {
        ++field960;
        if (arg0 == 3) {
            if (this.field1253 && this.field1238 | this.field1229 >= 0) {
                OpenGL.glEnable(2912);
            } else {
                OpenGL.glDisable(2912);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IJ)V")
    public final synchronized void method527(int arg0, long arg1) {
        ++field1008;
        class108 var4 = new class108();
        if (arg0 != 209171688) {
            this.field1243 = -19;
        }
        var4.field1798 = arg1;
        this.field1157.method414(var4, (byte) 117);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIII)V")
    public final void method393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1051;
        OpenGL.glLineWidth((float) arg5);
        this.method628(arg0, arg1, arg2, arg3, arg4, arg6);
        OpenGL.glLineWidth(1.0F);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([IIIII)Lha;")
    public final class116 method528(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1104;
        return new class373(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "()Z")
    public final boolean method529() {
        ++field932;
        return this.field1111.method2520(-1, 3);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(FFBFF)V")
    public final void method530(float arg0, float arg1, byte arg2, float arg3, float arg4) {
        if (arg2 == 117) {
            class333.field4783[3] = arg3;
            class333.field4783[2] = arg1;
            class333.field4783[0] = arg4;
            ++field997;
            class333.field4783[1] = arg0;
            OpenGL.glTexEnvfv(8960, 8705, class333.field4783, 0);
        }
    }

    @OriginalMember(owner = "client!jj", name = "CA", descriptor = "()I")
    public final int method531() {
        ++field975;
        return this.field1172;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(IZ)V")
    public final void method532(int arg0, boolean arg1) {
        if (!this.field1253 != !arg1) {
            this.field1253 = arg1;
            this.method526(3);
            this.field1249 &= -32;
        }
        if (arg0 != 8960) {
            this.field1260 = null;
        }
        ++field952;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lld;IIII)Lr;")
    public final class519 method400(class560 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1095;
        return new class374(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "(I)V")
    private final void method533(int arg0) {
        ++field1078;
        if (arg0 != 1445) {
            this.field966 = -18;
        }
        if (this.field1197 != 0.0F) {
            float var2 = this.field1258 / (this.field1258 + this.field1197);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -this.field1180 * (1.0F - var2) / this.field1197;
            this.field1160[14] = this.field1180 * var3;
            this.field1160[10] = this.field1212 + var4;
        } else {
            this.field1160[10] = this.field1212;
            this.field1160[14] = this.field1180;
        }
        this.field1222 = (this.field1160[14] + (float) (-this.field1172)) / this.field1160[10];
        this.field1183 = (float) this.field1172 + -this.field1197;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V")
    private final void method534(byte arg0) {
        ++field1077;
        if (arg0 != 65) {
            this.field1139 = null;
        }
        if (this.field1264 && !this.field1191) {
            OpenGL.glEnable(2896);
        } else {
            OpenGL.glDisable(2896);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lcu;B)V")
    public final void method535(class436 arg0, byte arg1) {
        ++field1069;
        if (this.field1143 >= 0 && this.field1142[this.field1143] == arg0) {
            this.field1142[this.field1143--] = null;
            int var3 = 49 / ((48 - arg1) / 47);
            arg0.method2156(-72);
            if (this.field1143 >= 0) {
                this.field1145 = this.field1142[this.field1143];
                this.field1145.method2149(-58);
            } else {
                this.field1145 = null;
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "(I)V")
    private final void method536(int arg0) {
        ++field1024;
        float[] var2 = this.field1160;
        int var3 = 118 % ((arg0 - -9) / 46);
        float var4 = (float) (-this.field1276 * this.field1237) / (float) this.field1228;
        float var5 = (float) ((-this.field1276 + this.field966) * this.field1237) / (float) this.field1228;
        float var6 = (float) (this.field1237 * this.field1205) / (float) this.field1277;
        float var7 = (float) ((-this.field982 + this.field1205) * this.field1237) / (float) this.field1277;
        if (var4 != var5 && var6 != var7) {
            float var8 = (float) this.field1237 * 2.0F;
            var2[7] = 0.0F;
            var2[9] = (var6 + var7) / (-var7 + var6);
            var2[3] = 0.0F;
            var2[12] = 0.0F;
            var2[8] = (var4 + var5) / (var5 - var4);
            var2[1] = 0.0F;
            var2[6] = 0.0F;
            var2[5] = var8 / (-var7 + var6);
            var2[13] = 0.0F;
            var2[4] = 0.0F;
            var2[0] = var8 / (-var4 + var5);
            var2[10] = this.field1212 = (float) (-(this.field1172 - -this.field1237)) / (float) (-this.field1237 + this.field1172);
            var2[2] = 0.0F;
            var2[14] = this.field1180 = -((float) this.field1172 * var8) / (float) (-this.field1237 + this.field1172);
            var2[15] = 0.0F;
            var2[11] = -1.0F;
        } else {
            var2[0] = 1.0F;
            var2[8] = 0.0F;
            var2[5] = 1.0F;
            var2[15] = 1.0F;
            var2[11] = 0.0F;
            var2[13] = 0.0F;
            var2[14] = 0.0F;
            var2[7] = 0.0F;
            var2[1] = 0.0F;
            var2[6] = 0.0F;
            var2[2] = 0.0F;
            var2[4] = 0.0F;
            var2[10] = 1.0F;
            var2[3] = 0.0F;
            var2[12] = 0.0F;
            var2[9] = 0.0F;
        }
        this.method533(1445);
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "()I")
    public final int method537() {
        ++field1006;
        return this.field1237;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(II)I")
    public final int method538(int arg0, int arg1) {
        if (arg0 < 56) {
            this.method616(false, -64);
        }
        ++field1019;
        if (~arg1 != -5122 && ~arg1 != -5121) {
            if (arg1 != 5123 && ~arg1 != -5123) {
                if (arg1 != 5125 && arg1 != 5124 && arg1 != 5126) {
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

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lcu;Z)V")
    public final void method539(class436 arg0, boolean arg1) {
        ++field953;
        if (!this.field1275) {
            if (~this.field1140 <= -4) {
                throw new RuntimeException();
            }
            if (this.field1140 >= 0) {
                this.field1147[this.field1140].method2142(26666);
            }
            this.field1145 = this.field1141 = this.field1147[++this.field1140] = arg0;
            this.field1145.method2151((byte) -108);
        } else {
            this.method552(-109, arg0);
            this.method655(arg0, 3);
        }
        if (!arg1) {
            this.field1191 = false;
        }
    }

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "()V")
    public final void method122() {
        ++field1076;
        if (this.field1162 && this.field966 > 0 && ~this.field982 < -1) {
            int var1 = this.field1239;
            int var2 = this.field1255;
            int var3 = this.field1214;
            int var4 = this.field1192;
            this.method657();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method547(-1);
            this.method532(8960, false);
            this.method578(69, false);
            this.method561(true, false);
            this.method616(false, 0);
            this.method648(-75, (class222) null);
            this.method514(-2, true);
            this.method634(60, 1);
            this.method598(0, (byte) 122);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field966, this.field982, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method615(var1, var3, var2, var4);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLgw;)V")
    public final void method540(byte arg0, class140 arg1) {
        ++field967;
        if (this.field1252 != arg1) {
            if (this.field1175) {
                OpenGL.glBindBufferARB(34963, arg1.method302(false));
            }
            this.field1252 = arg1;
        }
        if (arg0 != -25) {
            this.method549((byte) -126, 64);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZII)V")
    public final void method541(boolean arg0, int arg1, int arg2) {
        ++field1043;
        this.method588(true, true, arg0, arg2);
        int var4 = -118 % ((58 - arg1) / 60);
    }

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "()F")
    public final float method542() {
        ++field1056;
        return this.field1258;
    }

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "(I)V")
    private final void method543(int arg0) {
        ++field983;
        if (arg0 >= -115) {
            this.field1219 = -39;
        }
        if (~this.field1179 != -4) {
            this.field1179 = 3;
            this.method644((byte) 115);
            this.method632((byte) 38);
            this.field1249 &= -8;
        }
    }

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "()V")
    public final void method83() {
        ++field1099;
        this.field1113.method2607(true);
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V")
    private final void method544(byte arg0) {
        ++field948;
        if (arg0 > -79) {
            this.method628(-91, -9, 19, -62, 106, 76);
        }
        OpenGL.glViewport(this.field1195, this.field1190, this.field966, this.field982);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[BZIB)Lgw;")
    public final class140 method545(int arg0, byte[] arg1, boolean arg2, int arg3, byte arg4) {
        ++field935;
        if (arg4 != -1) {
            this.field1155 = null;
        }
        return (class140) (!this.field1175 || arg2 && !this.field1225 ? new class34(this, arg0, arg1, arg3) : new class202(this, arg0, arg1, arg3, arg2));
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(B)V")
    private final void method546(byte arg0) {
        ++field988;
        this.field1274 = new class249();
        this.field1236 = new class249();
        this.field1240 = new class222[this.field1227];
        this.field1168 = new class355(this, 3553, 6408, 1, 1);
        new class355(this, 3553, 6408, 1, 1);
        new class355(this, 3553, 6408, 1, 1);
        this.field1170 = new class374(this);
        this.field1166 = new class374(this);
        this.field1268 = new class374(this);
        this.field1269 = new class374(this);
        this.field1260 = new class374(this);
        int var2 = -80 / ((arg0 - -68) / 52);
        this.field1226 = new class374(this);
        this.field1174 = new class374(this);
        this.field1221 = new class374(this);
        this.field1213 = new class374(this);
        this.field1165 = new class374(this);
        if (this.field1201) {
            this.field1203 = new class353(this);
            new class353(this);
        }
    }

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "(I)V")
    public final void method547(int arg0) {
        ++field1012;
        if (~this.field1179 != arg0) {
            this.field1179 = 0;
            this.field1249 &= -32;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lfba;Z)Lha;")
    public final class116 method548(class518 arg0, boolean arg1) {
        ++field1020;
        int[] var3 = new int[arg0.field7202 * arg0.field7195];
        int var4 = 0;
        int var5 = 0;
        if (arg0.field7196 == null) {
            for (int var6 = 0; ~var6 > ~arg0.field7195; ++var6) {
                for (int var7 = 0; var7 < arg0.field7202; ++var7) {
                    int var8 = arg0.field7198[255 & arg0.field7197[var4++]];
                    var3[var5++] = var8 != 0 ? class188.method1258(-16777216, var8) : 0;
                }
            }
        } else {
            for (int var9 = 0; ~var9 > ~arg0.field7195; ++var9) {
                for (int var11 = 0; ~var11 > ~arg0.field7202; ++var11) {
                    var3[var5++] = class188.method1258(arg0.field7198[class424.method2540(255, arg0.field7197[var4])], arg0.field7196[var4] << 24);
                    ++var4;
                }
            }
        }
        class116 var10 = this.method528(var3, 0, arg0.field7202, arg0.field7202, arg0.field7195);
        var10.method963(arg0.field7199, arg0.field7200, arg0.field7203, arg0.field7201);
        return var10;
    }

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "()V")
    public final void method153() {
        ++field1044;
        if (this.field1130 != null && this.field1130.method3074(1)) {
            this.field1113.method2606(this.field1130, true);
            this.field1110.method3452(false);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)V")
    public final void method549(byte arg0, int arg1) {
        class333.field4783[0] = (float) class424.method2540(arg1, 16711680) / 1.671168E7F;
        class333.field4783[2] = (float) class424.method2540(arg1, 255) / 255.0F;
        ++field1115;
        class333.field4783[1] = (float) class424.method2540(65280, arg1) / 65280.0F;
        class333.field4783[3] = (float) (arg1 >>> 24) / 255.0F;
        if (arg0 < 125) {
            this.method658(24, 65, 125, -23);
        }
        OpenGL.glTexEnvfv(8960, 8705, class333.field4783, 0);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIB)V")
    public final void method550(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 56) {
            this.method522(82, 43, (byte) 125);
        }
        OpenGL.glDrawArrays(arg1, arg0, arg2);
        ++field936;
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)V")
    public final void method551(byte arg0) {
        OpenGL.glPopMatrix();
        ++field1112;
        if (arg0 <= 120) {
            this.method570((byte[]) null, 31, true, -70, 10);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILcu;)V")
    public final void method552(int arg0, class436 arg1) {
        ++field1035;
        if (~this.field1143 <= -4) {
            throw new RuntimeException();
        } else {
            if (~this.field1143 <= -1) {
                this.field1142[this.field1143].method2156(-99);
            }
            int var3 = -71 % ((-20 - arg0) / 54);
            this.field1145 = this.field1142[++this.field1143] = arg1;
            this.field1145.method2149(-122);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lr;Lsh;Lm;Lpaa;I)V")
    public final void method553(class519 arg0, class616 arg1, class105 arg2, class315 arg3, int arg4) {
        arg0.method1379(arg2, arg3, arg4);
        ++field1089;
        this.method563(arg1);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)V")
    public final synchronized void method554(int arg0, int arg1, int arg2) {
        ++field992;
        class264 var4 = new class264(arg1);
        if (arg2 < 91) {
            this.field1183 = 0.11975427F;
        }
        var4.field1798 = (long) arg0;
        this.field1155.method414(var4, (byte) 119);
    }

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "()Z")
    public final boolean method555() {
        ++field1047;
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lkk;)V")
    public final void method556(class149 arg0) {
        this.field1267 = (class544) arg0;
        ++field987;
    }

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "(I)V")
    public final void method399(int arg0) {
        ++field1090;
        this.method651((byte) 98);
    }

    @OriginalMember(owner = "client!jj", name = "ta", descriptor = "(II)V")
    public final void method557(int arg0, int arg1) {
        ++field1061;
        if (this.field1237 != arg0 || ~this.field1172 != ~arg1) {
            this.field1237 = arg0;
            this.field1172 = arg1;
            this.method536(42);
            this.method620((byte) 54);
            if (this.field1179 != 3) {
                if (this.field1179 == 2) {
                    this.method516((byte) -120);
                    return;
                }
            } else {
                this.method644((byte) 125);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "(IIIIII)Z")
    public final boolean method558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1128;
        float var7 = (float) arg2 * this.field1274.field3632 + (float) arg0 * this.field1274.field3633 + (float) arg1 * this.field1274.field3638 + this.field1274.field3628;
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = (float) arg5 * this.field1274.field3632 + (float) arg3 * this.field1274.field3633 + (float) arg4 * this.field1274.field3638 + this.field1274.field3628;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!(var7 < (float) this.field1237) || !(var8 < (float) this.field1237)) && (!((float) this.field1172 < var7) || !(var8 > (float) this.field1172))) {
            int var9 = (int) (((float) arg2 * this.field1274.field3648 + (float) arg0 * this.field1274.field3630 + (float) arg1 * this.field1274.field3643 + this.field1274.field3629) * (float) this.field1228 / var7);
            int var10 = (int) (((float) arg5 * this.field1274.field3648 + (float) arg3 * this.field1274.field3630 + (float) arg4 * this.field1274.field3643 + this.field1274.field3629) * (float) this.field1228 / var8);
            if (this.field1245 > (float) var9 && this.field1245 > (float) var10 || this.field1273 < (float) var9 && this.field1273 < (float) var10) {
                return false;
            } else {
                int var11 = (int) (((float) arg2 * this.field1274.field3622 + (float) arg0 * this.field1274.field3624 + (float) arg1 * this.field1274.field3627 + this.field1274.field3619) * (float) this.field1277 / var7);
                int var12 = (int) (((float) arg5 * this.field1274.field3622 + (float) arg3 * this.field1274.field3624 + (float) arg4 * this.field1274.field3627 + this.field1274.field3619) * (float) this.field1277 / var8);
                return (!(this.field1244 > (float) var11) || !(this.field1244 > (float) var12)) && (!((float) var11 > this.field1234) || !((float) var12 > this.field1234));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIII)V")
    public final void method99(int arg0, int arg1, int arg2, int arg3) {
        ++field1054;
        this.field1113.method2612(arg0, arg1, arg3, arg2, -126);
    }

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "()Ldp;")
    public final class425 method85() {
        ++field959;
        int var1 = -1;
        if (~this.field1270.indexOf("nvidia") != 0) {
            var1 = 4318;
        } else if (this.field1270.indexOf("intel") == -1) {
            if (this.field1270.indexOf("ati") != -1) {
                var1 = 4098;
            }
        } else {
            var1 = 32902;
        }
        return new class425(var1, "OpenGL", this.field1204, this.field1207, 0L);
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "()Z")
    public final boolean method559() {
        ++field1080;
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
    public final int method560(int arg0, int arg1) {
        ++field945;
        return arg1 ^ arg0 & arg1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZZ)V")
    public final void method561(boolean arg0, boolean arg1) {
        if (this.field1171 == !arg1) {
            if (!arg1) {
                OpenGL.glDisable(2929);
            } else {
                OpenGL.glEnable(2929);
            }
            this.field1171 = arg1;
            this.field1249 &= -32;
        }
        ++field1066;
        if (!arg0) {
            this.field1239 = -96;
        }
    }

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "(III)V")
    public final void method562(int arg0, int arg1, int arg2) {
        ++field1017;
        if (~this.field1176 != ~arg0 || this.field1229 != arg1 || ~this.field1206 != ~arg2) {
            this.field1206 = arg2;
            this.field1229 = arg1;
            this.field1176 = arg0;
            if (this.field1238) {
                return;
            }
            this.method620((byte) 54);
            this.method526(3);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lsh;)V")
    public final void method563(class616 arg0) {
        ++field1021;
        this.field1121.method2366(arg0, 0, this);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLcu;)V")
    public final void method564(byte arg0, class436 arg1) {
        ++field941;
        if (arg0 <= 8) {
            this.method562(-45, -23, 14);
        }
        if (!this.field1275) {
            if (this.field1140 >= 0 && this.field1147[this.field1140] == arg1) {
                this.field1147[this.field1140--] = null;
                arg1.method2142(26666);
                if (this.field1140 >= 0) {
                    this.field1145 = this.field1141 = this.field1147[this.field1140];
                    this.field1145.method2151((byte) -108);
                } else {
                    this.field1145 = this.field1141 = null;
                }
            } else {
                throw new RuntimeException();
            }
        } else {
            this.method535(arg1, (byte) -91);
            this.method659(true, arg1);
        }
    }

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "()I")
    public final int method565() {
        ++field1068;
        return this.field1149 + this.field1148 + this.field1150;
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(B)V")
    private final void method566(byte arg0) {
        class333.field4783[2] = this.field1272 * this.field1208;
        if (arg0 != -101) {
            this.field1277 = 64;
        }
        ++field1096;
        class333.field4783[3] = 1.0F;
        class333.field4783[1] = this.field1272 * this.field1161;
        class333.field4783[0] = this.field1272 * this.field1262;
        OpenGL.glLightfv(16384, 4609, class333.field4783, 0);
        class333.field4783[2] = -this.field1248 * this.field1208;
        class333.field4783[0] = -this.field1248 * this.field1262;
        class333.field4783[1] = -this.field1248 * this.field1161;
        class333.field4783[3] = 1.0F;
        OpenGL.glLightfv(16385, 4609, class333.field4783, 0);
    }

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "()V")
    public final void method567() {
        ++field1031;
    }

    @OriginalMember(owner = "client!jj", name = "IA", descriptor = "(III[I)V")
    public final void method568(int arg0, int arg1, int arg2, int[] arg3) {
        ++field955;
        float var5 = (float) arg2 * this.field1274.field3632 + (float) arg0 * this.field1274.field3633 + (float) arg1 * this.field1274.field3638 + this.field1274.field3628;
        if (!(var5 < (float) this.field1237) && !(var5 > (float) this.field1172)) {
            int var6 = (int) (((float) arg2 * this.field1274.field3648 + (float) arg0 * this.field1274.field3630 + (float) arg1 * this.field1274.field3643 + this.field1274.field3629) * (float) this.field1228 / var5);
            int var7 = (int) (((float) arg2 * this.field1274.field3622 + (float) arg0 * this.field1274.field3624 + (float) arg1 * this.field1274.field3627 + this.field1274.field3619) * (float) this.field1277 / var5);
            if (this.field1245 <= (float) var6 && this.field1273 >= (float) var6 && this.field1244 <= (float) var7 && this.field1234 >= (float) var7) {
                arg3[0] = (int) ((float) var6 + -this.field1245);
                arg3[2] = (int) var5;
                arg3[1] = (int) ((float) var7 + -this.field1244);
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "()Z")
    public final boolean method141() {
        ++field1125;
        if (this.field1130 != null) {
            if (!this.field1130.method3074(1)) {
                if (!this.field1113.method2605(-1, this.field1130)) {
                    return false;
                }
                this.field1110.method3452(false);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "(F)V")
    public final void method569(float arg0) {
        ++field989;
        if (this.field1209 != arg0) {
            this.field1209 = arg0;
            this.method574(26);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([BIZII)Lpi;")
    public final class423 method570(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field1038;
        if (arg1 != 1) {
            this.field1121 = null;
        }
        return (class423) (!this.field1175 || arg2 && !this.field1225 ? new class598(this, arg3, arg0, arg4) : new class245(this, arg3, arg0, arg4, arg2));
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(FB)V")
    public final void method571(float arg0, byte arg1) {
        if (arg1 != 12) {
            this.method526(49);
        }
        if (this.field1182 != arg0) {
            this.field1182 = arg0;
            if (this.field1179 == 3) {
                this.method644((byte) 124);
            }
        }
        ++field958;
    }

    @OriginalMember(owner = "client!jj", name = "JA", descriptor = "(IIII)V")
    public final void method572(int arg0, int arg1, int arg2, int arg3) {
        ++field980;
        if (!this.field1238) {
            throw new RuntimeException("");
        } else {
            this.field1189 = arg0;
            this.field1261 = arg3;
            this.field1199 = arg1;
            this.field1219 = arg2;
            this.field1111.field6171.method2548(0);
            this.method620((byte) 54);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([Lr;Lm;[Lpaa;I)V")
    public final void method406(class519[] arg0, class105 arg1, class315[] arg2, int arg3) {
        ++field972;
        for (int var5 = 0; var5 < arg0.length; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method1379(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(IIIII)V")
    public final void method573(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method577((byte) -40);
        ++field1092;
        this.method598(arg4, (byte) -113);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f(var6, (float) arg2 + var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "(I)V")
    private final void method574(int arg0) {
        class333.field4783[3] = 1.0F;
        int var2 = 104 / ((-83 - arg0) / 39);
        class333.field4783[2] = this.field1209 * this.field1208;
        ++field970;
        class333.field4783[1] = this.field1209 * this.field1161;
        class333.field4783[0] = this.field1262 * this.field1209;
        OpenGL.glLightModelfv(2899, class333.field4783, 0);
    }

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "(B)V")
    public final void method575(byte arg0) {
        if (this.field1249 != 8) {
            this.method576((byte) -117);
            this.method532(arg0 + 9039, true);
            this.method561(true, true);
            this.method616(true, 0);
            this.method598(1, (byte) 20);
            this.field1249 = 8;
        }
        ++field1007;
        if (arg0 != -79) {
            this.method157();
        }
    }

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "(B)V")
    private final void method576(byte arg0) {
        if (arg0 <= -110) {
            ++field1108;
            if (~this.field1179 != -3) {
                this.field1179 = 2;
                this.method516((byte) -120);
                this.method632((byte) 61);
                this.field1249 &= -8;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "(B)V")
    private final void method577(byte arg0) {
        if (~this.field1249 != -2) {
            this.method599((byte) -126);
            this.method532(8960, false);
            this.method578(arg0 ^ -9, false);
            this.method561(true, false);
            this.method616(false, 0);
            this.method648(arg0 + 136, (class222) null);
            this.method514(-2, true);
            this.method634(arg0 ^ 2, 1);
            this.field1249 = 1;
        }
        if (arg0 != -40) {
            this.field1246 = -84;
        }
        ++field1032;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method402(Canvas arg0) {
        ++field974;
        long var2 = 0L;
        if (arg0 != null && this.field1105 != arg0) {
            if (this.field971.containsKey(arg0)) {
                Long var4 = (Long) this.field971.get(arg0);
                var2 = var4;
            }
        } else {
            var2 = this.field949;
        }
        if (var2 == 0L) {
            throw new RuntimeException();
        } else {
            this.field1022.surfaceResized(var2);
            if (this.field1025 == arg0) {
                this.method518(-18631);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "()V")
    public final void method95() {
        for (class108 var1 = this.field1136.method427(true); var1 != null; var1 = this.field1136.method420(false)) {
            ((class451) var1).method2662((byte) 120);
        }
        ++field939;
        if (this.field1113 != null) {
            this.field1113.method2604(false);
        }
        if (this.field1022 != null) {
            this.method651((byte) 127);
            Enumeration var2 = this.field971.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                Long var4 = (Long) this.field971.get(var3);
                this.field1022.releaseSurface(var3, var4);
            }
            this.field1022.release();
            this.field1022 = null;
        }
        if (this.field1138) {
            class246.method1560((byte) -115, false, true);
            this.field1138 = false;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(FFF)V")
    public final void method139(float arg0, float arg1, float arg2) {
        class297.field4268 = arg2;
        class529.field7355 = arg0;
        ++field937;
        class520.field7232 = arg1;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(IZ)V")
    public final void method578(int arg0, boolean arg1) {
        if (!this.field1264 != !arg1) {
            this.field1264 = arg1;
            this.method534((byte) 65);
            this.field1249 &= -8;
        }
        ++field1064;
        if (arg0 <= 14) {
            this.field1130 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "()V")
    public final void method94() throws class354 {
        try {
            this.field1022.swapBuffers();
        } catch (Exception var1) {
        }
        ++field996;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(II)I")
    public final int method579(int arg0, int arg1) {
        ++field1030;
        if (~arg1 != -2) {
            if (~arg1 != -1) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        return 260;
                    } else if (~arg1 == -5) {
                        return 34023;
                    } else if (arg0 != 14997) {
                        return -97;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    return 34165;
                }
            } else {
                return 8448;
            }
        } else {
            return 7681;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIZ)Lha;")
    public final class116 method580(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1120;
        return new class373(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "(IIII)V")
    public final void method581(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > this.field1239) {
            this.field1239 = arg0;
        }
        if (~arg2 > ~this.field1255) {
            this.field1255 = arg2;
        }
        if (~this.field1214 > ~arg1) {
            this.field1214 = arg1;
        }
        if (arg3 < this.field1192) {
            this.field1192 = arg3;
        }
        ++field1041;
        OpenGL.glEnable(3089);
        this.method611((byte) 91);
        this.method602((byte) -108);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public final class542 method405(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field1050;
        return new class247(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[I[I)Lpa;")
    public final class593 method582(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field1004;
        return class190.method1262(this, arg3, true, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "(I)V")
    private final void method583(int arg0) {
        ++field978;
        if (arg0 != 8960) {
            this.field1141 = null;
        }
        OpenGL.glDepthMask(this.field1196 && this.field1235);
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "()V")
    public final void method124() {
        OpenGL.glFinish();
        ++field1097;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(Z)V")
    private final void method584(boolean arg0) {
        if (arg0) {
            this.method139(-0.5914779F, -0.15315616F, 0.124065295F);
        }
        if (this.field1202) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field1202 = false;
        }
        ++field994;
    }

    @OriginalMember(owner = "client!jj", name = "xa", descriptor = "()V")
    public final void method585() {
        this.field1238 = false;
        ++field1075;
        this.field1111.method2522(false, 0, false, 64, 0, 0);
        this.method620((byte) 54);
        this.method526(3);
    }

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "(I)V")
    public final synchronized void method101(int arg0) {
        ++field1101;
        int var2 = arg0 & Integer.MAX_VALUE;
        int var3 = 0;
        while (!this.field1152.method424(2000)) {
            class264 var12 = (class264) this.field1152.method417((byte) 51);
            class10.field114[var3++] = (int) var12.field1798;
            this.field1148 -= var12.field3841;
            if (var3 == 1000) {
                OpenGL.glDeleteBuffersARB(var3, class10.field114, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class10.field114, 0);
            var3 = 0;
        }
        while (!this.field1153.method424(2000)) {
            class264 var11 = (class264) this.field1153.method417((byte) 51);
            class10.field114[var3++] = (int) var11.field1798;
            this.field1149 -= var11.field3841;
            if (var3 == 1000) {
                OpenGL.glDeleteTextures(var3, class10.field114, 0);
                var3 = 0;
            }
        }
        if (var3 > 0) {
            OpenGL.glDeleteTextures(var3, class10.field114, 0);
            var3 = 0;
        }
        while (!this.field1154.method424(2000)) {
            class264 var10 = (class264) this.field1154.method417((byte) 51);
            class10.field114[var3++] = var10.field3841;
            if (~var3 == -1001) {
                OpenGL.glDeleteFramebuffersEXT(var3, class10.field114, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteFramebuffersEXT(var3, class10.field114, 0);
            var3 = 0;
        }
        while (!this.field1155.method424(2000)) {
            class264 var9 = (class264) this.field1155.method417((byte) 51);
            class10.field114[var3++] = (int) var9.field1798;
            this.field1150 -= var9.field3841;
            if (var3 == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(var3, class10.field114, 0);
                var3 = 0;
            }
        }
        if (~var3 < -1) {
            OpenGL.glDeleteRenderbuffersEXT(var3, class10.field114, 0);
            boolean var4 = false;
        }
        while (!this.field1151.method424(2000)) {
            class264 var8 = (class264) this.field1151.method417((byte) 51);
            OpenGL.glDeleteLists((int) var8.field1798, var8.field3841);
        }
        while (!this.field1156.method424(2000)) {
            class108 var7 = this.field1156.method417((byte) 51);
            OpenGL.glDeleteProgramARB((int) var7.field1798);
        }
        while (!this.field1157.method424(2000)) {
            class108 var6 = this.field1157.method417((byte) 51);
            OpenGL.glDeleteObjectARB(var6.field1798);
        }
        while (!this.field1151.method424(2000)) {
            class264 var5 = (class264) this.field1151.method417((byte) 51);
            OpenGL.glDeleteLists((int) var5.field1798, var5.field3841);
        }
        this.field1110.method3453((byte) -86);
        if (~this.method565() < -100663297 && ~class508.method2860(false) < ~(this.field1241 + 60000L)) {
            System.gc();
            this.field1241 = class508.method2860(false);
        }
        this.field1135 = var2;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[Luca;)V")
    public final void method586(int arg0, class637[] arg1) {
        ++field1126;
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field1163[var3] = arg1[var3];
        }
        this.field1259 = arg0;
        if (this.field1179 != 1) {
            this.method617(-84);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lm;)V")
    public final void method587(class105 arg0) {
        this.field1274 = (class249) arg0;
        ++field1039;
        this.field1236.method1575(2, this.field1274);
        if (this.field1179 != 1) {
            this.method632((byte) -40);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZZZI)V")
    public final void method588(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        ++field1053;
        if (this.field1246 != arg3) {
            if (~arg3 > -1) {
                this.method584(false);
                this.method648(105, (class222) null);
                this.method634(-128, 0);
                if (!this.field1238) {
                    this.field1111.method2522(arg1, 0, arg2, 64, 0, 0);
                }
            } else {
                class355 var5 = this.field1110.method3454(3553, arg3);
                class576 var6 = super.field2443.method2387((byte) 127, arg3);
                if (~var6.field8215 == -1 && ~var6.field8214 == -1) {
                    this.method584(false);
                } else {
                    int var7 = var6.field8205 ? 64 : 128;
                    int var8 = var7 * 50;
                    this.method631((float) (this.field1135 % var8 * var6.field8215) / (float) var8, (float) (this.field1135 % var8 * var6.field8214) / (float) var8, 0.0F, 16533);
                }
                if (this.field1238) {
                    this.method648(-61, var5);
                    this.method634(44, var6.field8220);
                } else {
                    this.field1111.method2522(arg1, var6.field8210, arg2, 64, var6.field8206, var6.field8203);
                    if (!this.field1111.method2519(var6.field8220, var5, (byte) 123)) {
                        this.method648(-17, var5);
                        this.method634(-12, var6.field8220);
                    }
                }
            }
            this.field1246 = arg3;
        }
        this.field1249 &= -8;
        if (!arg0) {
            this.method142();
        }
    }

    @OriginalMember(owner = "client!jj", name = "UA", descriptor = "(IIIII)V")
    public final void method589(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method577((byte) -40);
        ++field1028;
        this.method598(arg4, (byte) -118);
        float var6 = (float) arg0 + 0.35F;
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        float var7 = (float) arg1 + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(var6, var7);
        OpenGL.glVertex2f((float) arg2 + var6, var7);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BFF)V")
    public final void method590(byte arg0, float arg1, float arg2) {
        ++field1067;
        this.field1265 = arg1;
        this.field1254 = arg2;
        if (!this.field1238) {
            this.method620((byte) 54);
        }
        int var4 = 10 / ((arg0 - -47) / 57);
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ln;I)V")
    public class66(Canvas arg0, class472 arg1, int arg2) {
        super(arg1);
        new class59();
        new class78(16);
        this.field1151 = new class47();
        this.field1152 = new class47();
        this.field1153 = new class47();
        this.field1154 = new class47();
        this.field1155 = new class47();
        this.field1156 = new class47();
        this.field1157 = new class47();
        this.field1173 = 8448;
        this.field1183 = 3584.0F;
        this.field1160 = new float[16];
        this.field1205 = 0;
        this.field1198 = new float[4];
        this.field1163 = new class637[class425.field6217];
        this.field1161 = 1.0F;
        this.field1208 = 1.0F;
        this.field1182 = 1.0F;
        this.field1199 = -1;
        this.field1228 = 512;
        this.field1232 = -1.0F;
        this.field1176 = -1;
        this.field1237 = 50;
        this.field1239 = 0;
        this.field1231 = -1.0F;
        this.field1195 = 0;
        this.field1214 = 0;
        this.field1229 = -1;
        this.field1206 = 0;
        this.field1233 = -1;
        this.field1235 = true;
        this.field1219 = -1;
        this.field1190 = 0;
        this.field1192 = 0;
        this.field1247 = new float[4];
        this.field1172 = 3584;
        this.field1258 = 3000.0F;
        this.field1262 = 1.0F;
        this.field1265 = 1.0F;
        this.field1210 = new float[4];
        this.field1254 = 0.0F;
        this.field1222 = 3584.0F;
        this.field1261 = 0;
        this.field1248 = -1.0F;
        this.field1257 = 8448;
        this.field1217 = new float[4];
        this.field1276 = 0;
        this.field1255 = 0;
        this.field1272 = -1.0F;
        this.field1277 = 512;
        this.field1220 = new class583(8192);
        this.field1278 = new byte[16384];
        this.field1280 = new int[1];
        this.field1281 = new int[1];
        this.field1282 = new int[1];
        this.field1025 = this.field1105 = arg0;
        this.field1123 = arg2;
        if (!class8.method31(false, "jaclib")) {
            throw new RuntimeException("");
        } else if (!class8.method31(false, "jaggl")) {
            throw new RuntimeException("");
        } else {
            try {
                this.field1022 = new OpenGL();
                this.field1063 = this.field949 = this.field1022.init(arg0, 8, 8, 8, 24, 0, this.field1123);
                if (~this.field949 == -1L) {
                    throw new RuntimeException("");
                } else {
                    this.method609(true);
                    int var4 = this.method641(-55);
                    if (var4 != 0) {
                        throw new RuntimeException("");
                    } else {
                        this.field1159 = this.field1187 ? 33639 : 5121;
                        if (~this.field1207.indexOf("radeon") != 0) {
                            int var5 = 0;
                            boolean var6 = false;
                            boolean var7 = false;
                            String[] var8 = class580.method3325((byte) 118, ' ', this.field1207.replace('/', ' '));
                            for (int var9 = 0; var9 < var8.length; ++var9) {
                                String var10 = var8[var9];
                                try {
                                    if (var10.length() > 0) {
                                        if (var10.charAt(0) == 'x' && var10.length() >= 3 && class331.method2052(var10.substring(1, 3), false)) {
                                            var10 = var10.substring(1);
                                            var7 = true;
                                        }
                                        if (var10.equals("hd")) {
                                            var6 = true;
                                        } else {
                                            if (var10.startsWith("hd")) {
                                                var6 = true;
                                                var10 = var10.substring(2);
                                            }
                                            if (~var10.length() <= -5 && class331.method2052(var10.substring(0, 4), false)) {
                                                var5 = class302.method1889(var10.substring(0, 4), false);
                                                break;
                                            }
                                        }
                                    }
                                } catch (Exception var16) {
                                }
                            }
                            if (!var6 || ~var5 > -4001) {
                                this.field1216 = false;
                            }
                            if (!var7 && !var6) {
                                if (var5 >= 7000 && ~var5 >= -9251) {
                                    this.field1218 = false;
                                }
                                if (~var5 <= -7001 && ~var5 >= -8000) {
                                    this.field1175 = false;
                                }
                            }
                            this.field1158 &= this.field1022.method3311("GL_ARB_half_float_pixel");
                            this.field1225 = this.field1175;
                            this.field1211 = true;
                        }
                        if (this.field1270.indexOf("intel") != -1) {
                            this.field1201 = false;
                        }
                        this.field1162 = !this.field1270.equals("s3 graphics");
                        if (this.field1175) {
                            try {
                                int[] var11 = new int[1];
                                OpenGL.glGenBuffersARB(1, var11, 0);
                            } catch (Throwable var14) {
                                throw new RuntimeException("");
                            }
                        }
                        class327.method2034(2, true, false);
                        this.field1138 = true;
                        this.field1110 = new class606(this, super.field2443);
                        this.method546((byte) 95);
                        this.field1139 = new class61(this);
                        this.field1113 = new class441(this);
                        if (this.field1113.method2609((byte) 100)) {
                            this.field1130 = new class10(this);
                            if (!this.field1130.method52(1)) {
                                this.field1130.method49(-122);
                                this.field1130 = null;
                            }
                        }
                        this.field1111 = new class419(this);
                        this.method627((byte) -75);
                        this.method518(-18631);
                        OpenGL.glClear(16640);
                        int var12 = 0;
                        while (true) {
                            try {
                                this.field1022.swapBuffers();
                                break;
                            } catch (Exception var15) {
                                if (var12++ > 5) {
                                    throw new RuntimeException("");
                                }
                                class210.method1342(-24, 100L);
                            }
                        }
                        OpenGL.glClear(16384);
                    }
                }
            } catch (Throwable var17) {
                var17.printStackTrace();
                this.method95();
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(II)V")
    public final synchronized void method591(int arg0, int arg1) {
        ++field956;
        class108 var3 = new class108();
        if (arg0 != 256) {
            this.field1176 = 63;
        }
        var3.field1798 = (long) arg1;
        this.field1156.method414(var3, (byte) 58);
    }

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "(ILpa;II)V")
    public final void method592(int arg0, class593 arg1, int arg2, int arg3) {
        ++field1026;
        class435 var5 = (class435) arg1;
        class98 var6 = var5.field6382;
        this.method597(false);
        this.method648(-15, var5.field6382);
        this.method598(1, (byte) 59);
        this.method656(-12645, 8448, 7681);
        this.method607(34167, 0, 768, -116);
        float var7 = var6.field1705 / (float) var6.field1704;
        float var8 = var6.field1702 / (float) var6.field1701;
        OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field1239) * var7, (float) (-arg3 + this.field1214) * var8);
        OpenGL.glVertex2i(this.field1239, this.field1214);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field1239) * var7, (float) (-arg3 + this.field1192) * var8);
        OpenGL.glVertex2i(this.field1239, this.field1192);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field1255) * var7, (float) (-arg3 + this.field1192) * var8);
        OpenGL.glVertex2i(this.field1255, this.field1192);
        OpenGL.glTexCoord2f((float) (-arg2 + this.field1255) * var7, (float) (-arg3 + this.field1214) * var8);
        OpenGL.glVertex2i(this.field1255, this.field1214);
        OpenGL.glEnd();
        this.method607(5890, 0, 768, 85);
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
    public final void method398(int arg0) {
        this.method609(true);
        ++field1013;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lu;)V")
    public final void method593(class424 arg0) {
        this.field1133 = ((class451) arg0).field6554;
        ++field1071;
        if (this.field1188 == null) {
            class583 var2 = new class583(80);
            if (this.field1187) {
                var2.method3339(-1.0F, -9720);
                var2.method3339(-1.0F, -9720);
                var2.method3339(0.0F, -9720);
                var2.method3339(0.0F, -9720);
                var2.method3339(1.0F, -9720);
                var2.method3339(1.0F, -9720);
                var2.method3339(-1.0F, -9720);
                var2.method3339(0.0F, -9720);
                var2.method3339(1.0F, -9720);
                var2.method3339(1.0F, -9720);
                var2.method3339(1.0F, -9720);
                var2.method3339(1.0F, -9720);
                var2.method3339(0.0F, -9720);
                var2.method3339(1.0F, -9720);
                var2.method3339(0.0F, -9720);
                var2.method3339(-1.0F, -9720);
                var2.method3339(1.0F, -9720);
                var2.method3339(0.0F, -9720);
                var2.method3339(0.0F, -9720);
                var2.method3339(0.0F, -9720);
            } else {
                var2.method3338(-1325457552, -1.0F);
                var2.method3338(-1325457552, -1.0F);
                var2.method3338(-1325457552, 0.0F);
                var2.method3338(-1325457552, 0.0F);
                var2.method3338(-1325457552, 1.0F);
                var2.method3338(-1325457552, 1.0F);
                var2.method3338(-1325457552, -1.0F);
                var2.method3338(-1325457552, 0.0F);
                var2.method3338(-1325457552, 1.0F);
                var2.method3338(-1325457552, 1.0F);
                var2.method3338(-1325457552, 1.0F);
                var2.method3338(-1325457552, 1.0F);
                var2.method3338(-1325457552, 0.0F);
                var2.method3338(-1325457552, 1.0F);
                var2.method3338(-1325457552, 0.0F);
                var2.method3338(-1325457552, -1.0F);
                var2.method3338(-1325457552, 1.0F);
                var2.method3338(-1325457552, 0.0F);
                var2.method3338(-1325457552, 0.0F);
                var2.method3338(-1325457552, 0.0F);
            }
            this.field1188 = this.method570(var2.field3952, 1, false, 20, var2.field3913);
            this.field1184 = new class25(this.field1188, 5126, 3, 0);
            this.field1169 = new class25(this.field1188, 5126, 2, 12);
            this.field1121.method2364(-125, this);
        }
    }

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "()Z")
    public final boolean method594() {
        ++field1124;
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "()Z")
    public final boolean method595() {
        ++field1001;
        return this.field1130 != null && (~this.field1123 >= -2 || this.field1271);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljaclib/memory/Buffer;IZZI)Lpi;")
    public final class423 method596(Buffer arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        if (!arg3) {
            this.field1252 = null;
        }
        ++field979;
        return (class423) (!this.field1175 || arg2 && !this.field1225 ? new class598(this, arg1, arg0) : new class245(this, arg1, arg0, arg4, arg2));
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(Z)V")
    public final void method597(boolean arg0) {
        if (arg0) {
            this.method400((class560) null, 84, -39, -113, 123);
        }
        ++field1040;
        if (this.field1249 != 2) {
            this.method599((byte) -128);
            this.method532(8960, false);
            this.method578(108, false);
            this.method561(true, false);
            this.method616(false, 0);
            this.method514(-2, !arg0);
            this.field1249 = 2;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)V")
    public final void method598(int arg0, byte arg1) {
        if (this.field1178 != arg0) {
            boolean var3;
            boolean var4;
            byte var5;
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    var3 = false;
                    var4 = true;
                    var5 = 2;
                } else if (arg0 == 128) {
                    var4 = true;
                    var5 = 3;
                    var3 = true;
                } else {
                    var3 = false;
                    var4 = true;
                    var5 = 0;
                }
            } else {
                var5 = 1;
                var3 = true;
                var4 = true;
            }
            if (!var4 == this.field1193) {
                OpenGL.glColorMask(var4, var4, var4, true);
                this.field1193 = var4;
            }
            if (this.field1251 == !var3) {
                if (var3) {
                    OpenGL.glEnable(3008);
                } else {
                    OpenGL.glDisable(3008);
                }
                this.field1251 = var3;
            }
            if (this.field1224 != var5) {
                if (~var5 != -2) {
                    if (var5 == 2) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                    } else if (var5 != 3) {
                        OpenGL.glDisable(3042);
                    } else {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(774, 1);
                    }
                } else {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                }
                this.field1224 = var5;
            }
            this.field1178 = arg0;
            this.field1249 &= -29;
        }
        int var6 = -62 / ((arg1 - -40) / 52);
        ++field965;
    }

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "(B)V")
    private final void method599(byte arg0) {
        int var2 = 80 / ((arg0 - -68) / 44);
        if (~this.field1179 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field966 < -1 && ~this.field982 < -1) {
                OpenGL.glOrtho(0.0D, (double) this.field966, (double) this.field982, 0.0D, -1.0D, 1.0D);
            }
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field1179 = 1;
            this.field1249 &= -25;
        }
        ++field995;
    }

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "(IFFFFF)V")
    public final void method600(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field944;
        boolean var7 = this.field1233 != arg0;
        if (var7 || this.field1272 != arg1 || this.field1248 != arg2) {
            this.field1248 = arg2;
            this.field1233 = arg0;
            this.field1272 = arg1;
            if (var7) {
                this.field1208 = (float) (255 & this.field1233) / 255.0F;
                this.field1262 = (float) (this.field1233 & 16711680) / 1.671168E7F;
                this.field1161 = (float) (65280 & this.field1233) / 65280.0F;
                this.method574(-123);
            }
            this.method566((byte) -101);
        }
        if (this.field1217[0] != arg3 || this.field1217[1] != arg4 || this.field1217[2] != arg5) {
            this.field1217[2] = arg5;
            this.field1217[0] = arg3;
            this.field1217[1] = arg4;
            this.field1198[2] = -arg5;
            this.field1198[1] = -arg4;
            this.field1198[0] = -arg3;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field1247[0] = arg3 * var8;
            this.field1247[1] = arg4 * var8;
            this.field1247[2] = arg5 * var8;
            this.field1210[0] = -this.field1247[0];
            this.field1210[2] = -this.field1247[2];
            this.field1210[1] = -this.field1247[1];
            this.method639(126);
            this.field1266 = (int) (arg3 * 256.0F / arg4);
            this.field1200 = (int) (arg5 * 256.0F / arg4);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIF)Luca;")
    public final class637 method601(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field933;
        return new class54(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "()V")
    public final void method142() {
        ++field943;
        this.method616(true, 0);
        OpenGL.glClear(256);
    }

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "(B)V")
    private final void method602(byte arg0) {
        ++field1015;
        if (~this.field1255 <= ~this.field1239 && this.field1214 <= this.field1192) {
            OpenGL.glScissor(this.field1239 + this.field1195, this.field1190 - (-this.field982 + this.field1192), -this.field1239 + this.field1255, -this.field1214 + this.field1192);
        } else {
            OpenGL.glScissor(0, 0, 0, 0);
        }
        if (arg0 != -108) {
            this.method546((byte) -29);
        }
    }

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "(I)V")
    public final void method603(int arg0) {
        ++field1045;
        if (arg0 <= -41) {
            if (~this.field1249 != -17) {
                this.method543(-122);
                this.method532(8960, true);
                this.method561(true, true);
                this.method616(true, 0);
                this.method598(1, (byte) 38);
                this.field1249 = 16;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "ba", descriptor = "()I")
    public final int method604() {
        ++field1093;
        int var1 = this.field1283;
        this.field1283 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method158(Rectangle[] arg0, int arg1) throws class354 {
        ++field969;
        this.method94();
    }

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "(IIII)[I")
    public final int[] method103(int arg0, int arg1, int arg2, int arg3) {
        ++field954;
        int[] var5 = new int[arg2 * arg3];
        for (int var6 = 0; ~arg3 < ~var6; ++var6) {
            OpenGL.glReadPixelsi(arg0, -arg1 + this.field982 + -var6, arg2, 1, 32993, this.field1159, var5, arg2 * var6);
        }
        return var5;
    }

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "()Z")
    public final boolean method157() {
        ++field991;
        return this.field1130 != null && this.field1130.method3074(1);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method605(Canvas arg0) {
        ++field977;
        if (this.field1105 == arg0) {
            throw new RuntimeException();
        } else if (this.field971.containsKey(arg0)) {
            Long var2 = (Long) this.field971.get(arg0);
            this.field1022.releaseSurface(arg0, var2);
            this.field971.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([Lr;Lsh;Lm;[Lpaa;I)V")
    public final void method397(class519[] arg0, class616 arg1, class105 arg2, class315[] arg3, int arg4) {
        this.method406(arg0, arg2, arg3, arg4);
        ++field993;
        this.method563(arg1);
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(II)V")
    public final synchronized void method606(int arg0, int arg1) {
        ++field1074;
        class264 var3 = new class264(arg0);
        this.field1154.method414(var3, (byte) 86);
        if (arg1 >= -69) {
            this.method633(-114, 47, -34, -80, -74, 51, (class593) null, 75, 27);
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(IIII)V")
    public final void method607(int arg0, int arg1, int arg2, int arg3) {
        OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
        ++field1014;
        OpenGL.glTexEnvi(8960, 34192 - -arg1, arg2);
        int var5 = 39 / ((arg3 - -49) / 51);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBI)V")
    public final void method608(int arg0, byte arg1, int arg2) {
        if (arg1 <= 97) {
            this.field1198 = null;
        }
        ++field1102;
        this.field1190 = arg2;
        this.field1195 = arg0;
        this.method544((byte) -111);
        this.method602((byte) -108);
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(Z)V")
    private final void method609(boolean arg0) {
        if (!arg0) {
            this.method550(-39, -23, 114, (byte) -85);
        }
        ++field1100;
        int var2 = 0;
        while (!this.field1022.method3310()) {
            if (var2++ > 5) {
                throw new RuntimeException("");
            }
            class210.method1342(-23, 1000L);
        }
    }

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "(I)V")
    public final void method610(int arg0) {
        ++field942;
        if (arg0 > -2) {
            this.method611((byte) -43);
        }
        OpenGL.glPushMatrix();
    }

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "(B)V")
    private final void method611(byte arg0) {
        ++field962;
        this.field1245 = (float) (-this.field1276 + this.field1239);
        this.field1273 = (float) (-this.field1276 + this.field1255);
        this.field1234 = (float) (-this.field1205 + this.field1192);
        this.field1244 = (float) (this.field1214 - this.field1205);
        if (arg0 != 91) {
            this.field1191 = false;
        }
    }

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "()I")
    public final int method612() {
        ++field1119;
        return 4;
    }

    @OriginalMember(owner = "client!jj", name = "ra", descriptor = "()F")
    public final float method613() {
        ++field981;
        return this.field1197;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)Lu;")
    public final class424 method614(int arg0) {
        ++field938;
        class451 var2 = new class451(arg0);
        this.field1136.method414(var2, (byte) 108);
        return var2;
    }

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "(IIII)V")
    public final void method615(int arg0, int arg1, int arg2, int arg3) {
        ++field1057;
        if (arg2 > this.field966) {
            arg2 = this.field966;
        }
        if (this.field982 < arg3) {
            arg3 = this.field982;
        }
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        this.field1239 = arg0;
        this.field1192 = arg3;
        this.field1255 = arg2;
        this.field1214 = arg1;
        OpenGL.glEnable(3089);
        this.method611((byte) 91);
        this.method602((byte) -108);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)V")
    public final void method616(boolean arg0, int arg1) {
        ++field1048;
        if (arg1 != 0) {
            this.method101(-6);
        }
        if (!this.field1196 != !arg0) {
            this.field1196 = arg0;
            this.method583(8960);
            this.field1249 &= -32;
        }
    }

    @OriginalMember(owner = "client!jj", name = "Z", descriptor = "(I)V")
    public final void method121(int arg0) {
        ++field1027;
        this.method598(0, (byte) 120);
        OpenGL.glClearColor((float) (16711680 & arg0) / 1.671168E7F, (float) (arg0 & 65280) / 65280.0F, (float) (255 & arg0) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "(I)V")
    private final void method617(int arg0) {
        if (arg0 >= -8) {
            this.field1160 = null;
        }
        ++field946;
        int var2;
        for (var2 = 0; ~this.field1259 < ~var2; ++var2) {
            class637 var3 = this.field1163[var2];
            int var4 = var2 + 16386;
            class333.field4790[0] = (float) var3.method3681(-27102);
            class333.field4790[1] = (float) var3.method3682(false);
            class333.field4790[2] = (float) var3.method3677(-26984);
            class333.field4790[3] = 1.0F;
            OpenGL.glLightfv(var4, 4611, class333.field4790, 0);
            int var5 = var3.method3679(1705);
            float var6 = var3.method3678(-23151) / 255.0F;
            class333.field4790[1] = (float) class424.method2540(255, var5 >> 8) * var6;
            class333.field4790[0] = var6 * (float) class424.method2540(255, var5 >> 16);
            class333.field4790[2] = var6 * (float) class424.method2540(255, var5);
            OpenGL.glLightfv(var4, 4609, class333.field4790, 0);
            OpenGL.glLightf(var4, 4617, 1.0F / (float) (var3.method3683(0) * var3.method3683(0)));
            OpenGL.glEnable(var4);
        }
        while (~this.field1223 < ~var2) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
        }
        this.field1223 = this.field1259;
    }

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "()Z")
    public final boolean method618() {
        ++field1058;
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(IBI)V")
    public final synchronized void method619(int arg0, byte arg1, int arg2) {
        if (arg1 == -9) {
            ++field1084;
            class264 var4 = new class264(arg0);
            var4.field1798 = (long) arg2;
            this.field1153.method414(var4, (byte) 121);
        }
    }

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "(B)V")
    private final void method620(byte arg0) {
        ++field1060;
        int var2;
        if (this.field1238) {
            OpenGL.glFogf(2915, 0.0F);
            OpenGL.glFogf(2916, 1.0F);
            var2 = this.field1199;
        } else {
            this.field1250 = (float) (this.field1172 - this.field1206) - this.field1254;
            this.field1242 = this.field1250 - (float) this.field1229 * this.field1265;
            if ((float) this.field1237 > this.field1242) {
                this.field1242 = (float) this.field1237;
            }
            OpenGL.glFogf(2915, this.field1242);
            OpenGL.glFogf(2916, this.field1250);
            var2 = this.field1176;
        }
        class333.field4783[1] = (float) class424.method2540(var2, 65280) / 65280.0F;
        class333.field4783[0] = (float) class424.method2540(16711680, var2) / 1.671168E7F;
        class333.field4783[2] = (float) class424.method2540(var2, 255) / 255.0F;
        OpenGL.glFogfv(2918, class333.field4783, 0);
        if (arg0 != 54) {
            this.field1170 = null;
        }
        if (this.field1238) {
            this.field1111.field6171.method2546(89);
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public final void method403(int arg0) {
        ++field1059;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
    public final void method621(boolean arg0) {
        this.field1235 = arg0;
        ++field1098;
        this.method583(8960);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILol;)V")
    public final void method622(int arg0, class249 arg1) {
        OpenGL.glLoadMatrixf(arg1.method1577((byte) 3), 0);
        if (arg0 != 363) {
            this.method528((int[]) null, -50, -63, -124, -1);
        }
        ++field1010;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method394(Canvas arg0) {
        this.field1063 = 0L;
        this.field1025 = null;
        ++field1079;
        if (arg0 != null && this.field1105 != arg0) {
            if (this.field971.containsKey(arg0)) {
                Long var2 = (Long) this.field971.get(arg0);
                this.field1063 = var2;
                this.field1025 = arg0;
            }
        } else {
            this.field1063 = this.field949;
            this.field1025 = this.field1105;
        }
        if (this.field1025 != null && this.field1063 != 0L) {
            this.field1022.setSurface(this.field1063);
            this.method518(-18631);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "()Lm;")
    public final class105 method623() {
        ++field1042;
        return new class249();
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method624(Canvas arg0) {
        ++field1106;
        if (this.field1105 == arg0) {
            throw new RuntimeException();
        } else if (!this.field971.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var6) {
                }
                long var4 = this.field1022.prepareSurface(arg0);
                if (var4 == -1L) {
                    throw new RuntimeException();
                } else {
                    this.field971.put(arg0, new Long(var4));
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "(B)V")
    public final void method625(byte arg0) {
        ++field1107;
        if (~this.field1249 != -5) {
            this.method599((byte) 44);
            this.method532(8960, false);
            this.method578(90, false);
            this.method561(true, false);
            this.method616(false, 0);
            this.method514(-2, true);
            this.method598(1, (byte) -114);
            this.field1249 = 4;
        }
        if (arg0 < 56) {
            this.field1278 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lrl;[Lfba;Z)Lra;")
    public final class259 method626(class633 arg0, class518[] arg1, boolean arg2) {
        ++field1033;
        return new class269(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "(B)V")
    private final void method627(byte arg0) {
        ++field998;
        this.method514(-2, true);
        for (int var2 = this.field1227 + -1; var2 >= 0; --var2) {
            this.method654(false, var2);
            this.method648(arg0 ^ 57, (class222) null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        this.method656(-12645, 8448, 8448);
        this.method607(34168, 2, 770, 110);
        this.method584(false);
        this.field1178 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        this.field1224 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        this.field1251 = true;
        OpenGL.glColorMask(true, true, true, true);
        this.field1193 = true;
        this.method532(8960, true);
        this.method578(arg0 ^ -48, true);
        this.method561(true, true);
        this.method616(true, arg0 + 75);
        this.method547(-1);
        this.field1022.setSwapInterval(0);
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
        int var4 = 0;
        if (arg0 == -75) {
            while (var4 < 8) {
                int var5 = var4 + 16384;
                OpenGL.glLightfv(var5, 4608, var3, 0);
                OpenGL.glLightf(var5, 4615, 0.0F);
                OpenGL.glLightf(var5, 4616, 0.0F);
                ++var4;
            }
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
            OpenGL.glFogf(2914, 0.95F);
            OpenGL.glFogi(2917, 9729);
            OpenGL.glHint(3156, 4353);
            this.field1233 = this.field1176 = -1;
            this.method657();
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(IIIIII)V")
    public final void method628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method577((byte) -40);
        ++field963;
        this.method598(arg5, (byte) -114);
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) arg3 - (float) arg1;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var8 * var9;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var11 = var7 * var9;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glVertex2f((float) arg2 + var11 + 0.35F, (float) arg3 + var10 + 0.35F);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "()Z")
    public final boolean method629() {
        ++field1085;
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "(B)Loj;")
    public final class498 method630(byte arg0) {
        ++field1122;
        if (arg0 >= -12) {
            return null;
        } else {
            return this.field1267 == null ? null : this.field1267.method323(true);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(FFFI)V")
    private final void method631(float arg0, float arg1, float arg2, int arg3) {
        OpenGL.glMatrixMode(5890);
        ++field1005;
        if (this.field1202) {
            OpenGL.glLoadIdentity();
        }
        OpenGL.glTranslatef(arg0, arg1, arg2);
        OpenGL.glMatrixMode(5888);
        this.field1202 = true;
        if (arg3 != 16533) {
            this.field1186 = true;
        }
    }

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "(B)V")
    private final void method632(byte arg0) {
        OpenGL.glLoadIdentity();
        ++field1029;
        OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        int var2 = -19 % ((3 - arg0) / 32);
        OpenGL.glMultMatrixf(this.field1274.method1577((byte) 3), 0);
        if (this.field1238) {
            this.field1111.field6171.method2548(0);
        }
        this.method639(127);
        this.method617(-101);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(Z)V")
    public final void method131(boolean arg0) {
        ++field934;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIILpa;II)V")
    public final void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class593 arg6, int arg7, int arg8) {
        ++field1018;
        class435 var10 = (class435) arg6;
        class98 var11 = var10.field6382;
        this.method597(false);
        this.method648(94, var10.field6382);
        this.method598(arg5, (byte) 98);
        this.method656(-12645, 8448, 7681);
        this.method607(34167, 0, 768, 55);
        float var12 = var11.field1705 / (float) var11.field1704;
        float var13 = var11.field1702 / (float) var11.field1701;
        float var14 = (float) (-arg0) + (float) arg2;
        float var15 = (float) arg3 - (float) arg1;
        float var16 = (float) (1.0D / Math.sqrt((double) (var14 * var14 + var15 * var15)));
        float var17 = var14 * var16;
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        float var18 = var15 * var16;
        OpenGL.glBegin(1);
        OpenGL.glTexCoord2f((float) (arg0 - arg7) * var12, (float) (-arg8 + arg1) * var13);
        OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
        OpenGL.glTexCoord2f((float) (-arg7 + arg2) * var12, (float) (-arg8 + arg3) * var13);
        OpenGL.glVertex2f((float) arg2 + var17 + 0.35F, (float) arg3 + var18 + 0.35F);
        OpenGL.glEnd();
        this.method607(5890, 0, 768, -108);
    }

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "(II)V")
    public final void method634(int arg0, int arg1) {
        int var3 = -126 / ((arg0 - -77) / 37);
        if (arg1 == 1) {
            this.method656(-12645, 7681, 7681);
        } else if (arg1 == 0) {
            this.method656(-12645, 8448, 8448);
        } else if (arg1 != 2) {
            if (arg1 != 3) {
                if (~arg1 == -5) {
                    this.method656(-12645, 34023, 34023);
                }
            } else {
                this.method656(-12645, 8448, 260);
            }
        } else {
            this.method656(-12645, 7681, 34165);
        }
        ++field1049;
    }

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "()Z")
    public final boolean method635() {
        ++field1023;
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Las;ZLas;Las;Las;)V")
    public final void method636(class25 arg0, boolean arg1, class25 arg2, class25 arg3, class25 arg4) {
        ++field1055;
        if (arg4 == null) {
            OpenGL.glDisableClientState(32884);
        } else {
            this.method520(arg4.field345, (byte) 117);
            OpenGL.glVertexPointer(arg4.field349, arg4.field350, this.field1194.method1559(17449), this.field1194.method1555(-10460) + (long) arg4.field347);
            OpenGL.glEnableClientState(32884);
        }
        if (arg2 != null) {
            this.method520(arg2.field345, (byte) -88);
            OpenGL.glNormalPointer(arg2.field350, this.field1194.method1559(17449), this.field1194.method1555(-10460) + (long) arg2.field347);
            OpenGL.glEnableClientState(32885);
        } else {
            OpenGL.glDisableClientState(32885);
        }
        if (arg3 != null) {
            this.method520(arg3.field345, (byte) -98);
            OpenGL.glColorPointer(arg3.field349, arg3.field350, this.field1194.method1559(17449), this.field1194.method1555(-10460) - -((long) arg3.field347));
            OpenGL.glEnableClientState(32886);
        } else {
            OpenGL.glDisableClientState(32886);
        }
        if (arg0 == null) {
            OpenGL.glDisableClientState(32888);
        } else {
            this.method520(arg0.field345, (byte) 116);
            OpenGL.glTexCoordPointer(arg0.field349, arg0.field350, this.field1194.method1559(17449), this.field1194.method1555(-10460) + (long) arg0.field347);
            OpenGL.glEnableClientState(32888);
        }
        if (arg1) {
            this.field1270 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()Lm;")
    public final class105 method637() {
        ++field985;
        return this.field1131;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIII)V")
    public final void method638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1082;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7 - 1.0F;
        this.method577((byte) -40);
        float var10 = (float) arg3 + var8 + -1.0F;
        this.method598(arg5, (byte) -98);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field1186) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field1186) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lkk;Lkk;FLkk;)Lkk;")
    public final class149 method104(class149 arg0, class149 arg1, float arg2, class149 arg3) {
        ++field999;
        if (arg0 != null && arg1 != null && this.field1185 && this.field1201) {
            class350 var5 = null;
            class544 var6 = (class544) arg0;
            class544 var7 = (class544) arg1;
            class498 var8 = var6.method323(true);
            class498 var9 = var7.method323(true);
            if (var8 != null && var9 != null) {
                int var10 = var9.field6976 >= var8.field6976 ? var9.field6976 : var8.field6976;
                if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class350) {
                    class350 var11 = (class350) arg3;
                    if (var10 == var11.method2127((byte) 122)) {
                        var5 = var11;
                    }
                }
                if (var5 == null) {
                    var5 = new class350(this, var10);
                }
                if (var5.method2128(arg2, var9, var8, 65535)) {
                    return var5;
                }
            }
        }
        return arg2 < 0.5F ? arg0 : arg1;
    }

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "(I)V")
    public final void method639(int arg0) {
        ++field1037;
        OpenGL.glLightfv(16384, 4611, this.field1247, 0);
        if (arg0 <= 124) {
            this.method636((class25) null, false, (class25) null, (class25) null, (class25) null);
        }
        OpenGL.glLightfv(16385, 4611, this.field1210, 0);
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "([I)V")
    public final void method640(int[] arg0) {
        arg0[1] = this.field1214;
        arg0[2] = this.field1255;
        arg0[0] = this.field1239;
        ++field1065;
        arg0[3] = this.field1192;
    }

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "(I)I")
    private final int method641(int arg0) {
        ++field1091;
        int var2 = 0;
        this.field1270 = OpenGL.glGetString(7936).toLowerCase();
        this.field1207 = OpenGL.glGetString(7937).toLowerCase();
        if (this.field1270.indexOf("microsoft") != -1) {
            var2 |= 1;
        }
        if (this.field1270.indexOf("brian paul") != -1 || this.field1270.indexOf("mesa") != -1) {
            var2 |= 1;
        }
        String var3 = OpenGL.glGetString(7938);
        String[] var4 = class580.method3325((byte) 118, ' ', var3.replace('.', ' '));
        if (var4.length >= 2) {
            try {
                int var5 = class302.method1889(var4[0], false);
                int var6 = class302.method1889(var4[1], false);
                this.field1204 = var5 * 10 - -var6;
            } catch (NumberFormatException var9) {
                var2 |= 4;
            }
        } else {
            var2 |= 4;
        }
        if (~this.field1204 > -13) {
            var2 |= 2;
        }
        if (!this.field1022.method3311("GL_ARB_multitexture")) {
            var2 |= 8;
        }
        if (!this.field1022.method3311("GL_ARB_texture_env_combine")) {
            var2 |= 32;
        }
        int[] var7 = new int[1];
        OpenGL.glGetIntegerv(34018, var7, 0);
        this.field1227 = var7[0];
        OpenGL.glGetIntegerv(34929, var7, 0);
        this.field1243 = var7[0];
        OpenGL.glGetIntegerv(34930, var7, 0);
        this.field1230 = var7[0];
        if (~this.field1227 > -3 || this.field1243 < 2 || this.field1230 < 2) {
            var2 |= 16;
        }
        int var8 = 53 % ((arg0 - -7) / 44);
        this.field1187 = Stream.method3248();
        this.field1022.arePbuffersAvailable();
        this.field1175 = this.field1022.method3311("GL_ARB_vertex_buffer_object");
        this.field1186 = this.field1022.method3311("GL_ARB_multisample");
        this.field1263 = this.field1022.method3311("GL_ARB_vertex_program");
        this.field1022.method3311("GL_ARB_fragment_program");
        this.field1256 = this.field1022.method3311("GL_ARB_vertex_shader");
        this.field1167 = this.field1022.method3311("GL_ARB_fragment_shader");
        this.field1218 = this.field1022.method3311("GL_EXT_texture3D");
        this.field1158 = this.field1022.method3311("GL_ARB_texture_rectangle");
        this.field1185 = this.field1022.method3311("GL_ARB_texture_cube_map");
        this.field1216 = this.field1022.method3311("GL_ARB_texture_float");
        this.field1164 = false;
        this.field1201 = this.field1022.method3311("GL_EXT_framebuffer_object");
        this.field1275 = this.field1022.method3311("GL_EXT_framebuffer_blit");
        this.field1215 = this.field1022.method3311("GL_EXT_framebuffer_multisample");
        this.field1271 = this.field1215 & this.field1275;
        OpenGL.glGetFloatv(2834, class333.field4783, 0);
        this.field1232 = class333.field4783[0];
        this.field1231 = class333.field4783[1];
        return var2 != 0 ? var2 : 0;
    }

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "(I)V")
    public final void method642(int arg0) {
        this.field1134 = 0;
        ++field1103;
        while (arg0 > 1) {
            ++this.field1134;
            arg0 >>= 1;
        }
        this.field1137 = 1 << this.field1134;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(IIII)V")
    public final void method643(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -31364) {
            this.field1267 = null;
        }
        OpenGL.glTexEnvi(8960, 34184 - -arg1, arg3);
        ++field1129;
        OpenGL.glTexEnvi(8960, arg1 + 34200, arg0);
    }

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "(B)V")
    private final void method644(byte arg0) {
        ++field1118;
        float var2 = (float) (-this.field1276) * this.field1182 / (float) this.field1228;
        float var3 = (float) (-this.field1205) * this.field1182 / (float) this.field1277;
        float var4 = (float) (-this.field1276 + this.field966) * this.field1182 / (float) this.field1228;
        float var5 = (float) (this.field982 - this.field1205) * this.field1182 / (float) this.field1277;
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (arg0 >= 111) {
            if (var2 != var4 && var3 != var5) {
                OpenGL.glOrtho((double) var2, (double) var4, (double) (-var5), (double) (-var3), (double) ((float) this.field1237 + -this.field1197), (double) ((float) this.field1172 + -this.field1197));
            }
            OpenGL.glMatrixMode(5888);
        }
    }

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "()Z")
    public final boolean method645() {
        ++field1009;
        return this.field1186 && (!this.method157() || this.field1271);
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(IZ)I")
    public final int method646(int arg0, boolean arg1) {
        ++field1088;
        if (arg1) {
            return -91;
        } else if (arg0 != 6406 && arg0 != 6409) {
            if (arg0 != 6410 && arg0 != 34846 && arg0 != 34844) {
                if (~arg0 != -6408) {
                    if (arg0 != 6408 && ~arg0 != -34848) {
                        if (~arg0 != -34844) {
                            if (~arg0 == -34843) {
                                return 8;
                            } else if (arg0 != 6402) {
                                if (~arg0 == -6402) {
                                    return 1;
                                } else {
                                    throw new IllegalArgumentException("");
                                }
                            } else {
                                return 3;
                            }
                        } else {
                            return 6;
                        }
                    } else {
                        return 4;
                    }
                } else {
                    return 3;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(ILol;)V")
    public final void method647(int arg0, class249 arg1) {
        ++field930;
        int var3 = 97 / ((-70 - arg0) / 46);
        OpenGL.glPushMatrix();
        OpenGL.glMultMatrixf(arg1.method1577((byte) 3), 0);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILaba;)V")
    public final void method648(int arg0, class222 arg1) {
        ++field1052;
        class222 var3 = this.field1240[this.field1177];
        if (arg1 != var3) {
            if (arg1 == null) {
                OpenGL.glDisable(var3.field3347);
            } else {
                if (var3 != null) {
                    if (~arg1.field3347 != ~var3.field3347) {
                        OpenGL.glDisable(var3.field3347);
                        OpenGL.glEnable(arg1.field3347);
                    }
                } else {
                    OpenGL.glEnable(arg1.field3347);
                }
                OpenGL.glBindTexture(arg1.field3347, arg1.method1481((byte) 98));
            }
            this.field1240[this.field1177] = arg1;
        }
        int var4 = -84 % ((28 - arg0) / 38);
        this.field1249 &= -2;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)I")
    public final int method649(int arg0, int arg1) {
        ++field1087;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "()Z")
    public final boolean method650() {
        ++field951;
        return false;
    }

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "(B)V")
    private final void method651(byte arg0) {
        if (arg0 <= 97) {
            this.method642(27);
        }
        ++field1117;
        this.field1022.method3312();
    }

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "(IIIII)V")
    public final void method652(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field986;
        if (~arg2 > -1) {
            arg2 = -arg2;
        }
        if (this.field1239 <= arg0 + arg2 && ~this.field1255 <= ~(-arg2 + arg0) && ~(arg1 + arg2) <= ~this.field1214 && this.field1192 >= arg1 - arg2) {
            this.method577((byte) -40);
            this.method598(arg4, (byte) -100);
            OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
            float var6 = (float) arg0 + 0.35F;
            float var7 = (float) arg1 + 0.35F;
            int var8 = arg2 << 1;
            if ((float) var8 < this.field1232) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(var6 + 1.0F, var7 + 1.0F);
                OpenGL.glVertex2f(var6 + 1.0F, var7 - 1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + -1.0F);
                OpenGL.glVertex2f(var6 + -1.0F, var7 + 1.0F);
                OpenGL.glEnd();
            } else if (this.field1231 >= (float) var8) {
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
                    if (~var9 < -513) {
                        var9 = 512;
                    }
                } else {
                    var9 = 64;
                }
                int var10 = class19.method216(var9, (byte) -2);
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                for (int var11 = -var10 + 16384; var11 > 0; var11 -= var10) {
                    OpenGL.glVertex2f(class459.field6614[var11] * (float) arg2 + var6, class459.field6606[var11] * (float) arg2 + var7);
                }
                OpenGL.glVertex2f((float) arg2 + var6, var7);
                OpenGL.glEnd();
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(IIIIII)V")
    public final void method653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1070;
        float var7 = (float) arg0 + 0.35F;
        float var8 = (float) arg1 + 0.35F;
        float var9 = (float) arg2 + var7;
        this.method577((byte) -40);
        float var10 = (float) arg3 + var8;
        this.method598(arg5, (byte) 90);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        if (this.field1186) {
            OpenGL.glDisable(32925);
        }
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(var7, var8);
        OpenGL.glVertex2f(var7, var10);
        OpenGL.glVertex2f(var9, var10);
        OpenGL.glVertex2f(var9, var8);
        OpenGL.glEnd();
        if (this.field1186) {
            OpenGL.glEnable(32925);
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(ZI)V")
    public final void method654(boolean arg0, int arg1) {
        ++field1116;
        if (!arg0) {
            if (this.field1177 != arg1) {
                OpenGL.glActiveTexture(33984 - -arg1);
                this.field1177 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lcu;I)V")
    public final void method655(class436 arg0, int arg1) {
        ++field1003;
        if (arg1 <= this.field1144) {
            throw new RuntimeException();
        } else {
            if (this.field1144 >= 0) {
                this.field1146[this.field1144].method2146((byte) 111);
            }
            this.field1141 = this.field1146[++this.field1144] = arg0;
            this.field1141.method2155((byte) -58);
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(III)V")
    public final void method656(int arg0, int arg1, int arg2) {
        if (~this.field1177 != -1) {
            OpenGL.glTexEnvi(8960, 34161, arg2);
            OpenGL.glTexEnvi(8960, 34162, arg1);
        } else {
            boolean var4 = false;
            if (~this.field1173 != ~arg2) {
                OpenGL.glTexEnvi(8960, 34161, arg2);
                this.field1173 = arg2;
                var4 = true;
            }
            if (this.field1257 != arg1) {
                OpenGL.glTexEnvi(8960, 34162, arg1);
                var4 = true;
                this.field1257 = arg1;
            }
            if (var4) {
                this.field1249 &= -30;
            }
        }
        if (arg0 != -12645) {
            this.method528((int[]) null, 121, 108, -125, 75);
        }
        ++field929;
    }

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "()V")
    public final void method657() {
        this.field1192 = this.field982;
        this.field1239 = 0;
        this.field1214 = 0;
        ++field1062;
        this.field1255 = this.field966;
        OpenGL.glDisable(3089);
        this.method611((byte) 91);
    }

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "(IIII)V")
    public final void method658(int arg0, int arg1, int arg2, int arg3) {
        this.field1261 = arg3;
        this.field1238 = true;
        this.field1199 = arg1;
        ++field1000;
        this.field1189 = arg0;
        this.field1219 = arg2;
        this.field1111.method2522(false, 0, false, 64, 0, 3);
        this.field1111.field6171.method2548(0);
        this.method620((byte) 54);
        this.method526(3);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZLcu;)V")
    public final void method659(boolean arg0, class436 arg1) {
        if (arg0) {
            ++field1002;
            if (this.field1144 >= 0 && this.field1146[this.field1144] == arg1) {
                this.field1146[this.field1144--] = null;
                arg1.method2146((byte) 124);
                if (this.field1144 >= 0) {
                    this.field1141 = this.field1146[this.field1144];
                    this.field1141.method2155((byte) -58);
                } else {
                    this.field1141 = null;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "()Z")
    public final boolean method660() {
        ++field931;
        return false;
    }

    @OriginalMember(owner = "client!jj", name = "za", descriptor = "(IIIIII[BII)V")
    public final void method661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field1073;
        float var10;
        float var11;
        if (this.field1181 != null && this.field1181.field5069 >= arg2 && this.field1181.field5070 >= arg3) {
            this.field1181.method2161(arg6, 0, arg2, (byte) 127, false, 0, 0, arg3, 6406, 0);
            var10 = (float) arg2 * this.field1181.field1705 / (float) this.field1181.field5069;
            var11 = (float) arg3 * this.field1181.field1702 / (float) this.field1181.field5070;
        } else {
            this.field1181 = class5.method12(6406, 6406, this, arg3, true, false, arg6, arg2);
            this.field1181.method2163(119, false, false);
            var11 = this.field1181.field1702;
            var10 = this.field1181.field1705;
        }
        this.method597(false);
        this.method648(100, this.field1181);
        this.method598(arg8, (byte) -102);
        OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
        this.method549((byte) 127, arg5);
        this.method656(-12645, 34165, 34165);
        this.method607(34166, 0, 768, 53);
        this.method607(5890, 2, 770, -127);
        this.method643(770, 0, -31364, 34166);
        this.method643(770, 2, -31364, 5890);
        float var12 = (float) arg0;
        float var13 = (float) arg1;
        float var14 = (float) arg2 + var12;
        float var15 = (float) arg3 + var13;
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(var12, var13);
        OpenGL.glTexCoord2f(0.0F, var10);
        OpenGL.glVertex2f(var12, var15);
        OpenGL.glTexCoord2f(var11, var10);
        OpenGL.glVertex2f(var14, var15);
        OpenGL.glTexCoord2f(var11, 0.0F);
        OpenGL.glVertex2f(var14, var13);
        OpenGL.glEnd();
        this.method607(5890, 0, 768, -121);
        this.method607(34166, 2, 770, -102);
        this.method643(770, 0, -31364, 5890);
        this.method643(770, 2, -31364, 34166);
    }
}
