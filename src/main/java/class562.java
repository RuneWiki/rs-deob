import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;
import java.awt.Canvas;
import java.awt.Dimension;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class class562 extends class167 {

    @OriginalMember(owner = "client!cf", name = "Md", descriptor = "Lhga;")
    private class158 field8086 = new class158();

    @OriginalMember(owner = "client!cf", name = "Sd", descriptor = "Z")
    public boolean field8092 = true;

    @OriginalMember(owner = "client!cf", name = "Rd", descriptor = "Lun;")
    public class391 field8091 = new class391();

    @OriginalMember(owner = "client!cf", name = "ae", descriptor = "Lun;")
    public class391 field8100 = new class391();

    @OriginalMember(owner = "client!cf", name = "be", descriptor = "Lun;")
    public class391 field8101 = new class391();

    @OriginalMember(owner = "client!cf", name = "ce", descriptor = "Lun;")
    public class391 field8102 = new class391();

    @OriginalMember(owner = "client!cf", name = "de", descriptor = "Lun;")
    private class391 field8103 = new class391();

    @OriginalMember(owner = "client!cf", name = "ee", descriptor = "Lun;")
    private class391 field8104 = new class391();

    @OriginalMember(owner = "client!cf", name = "ie", descriptor = "Lrg;")
    public class597 field8108 = class199.field3097;

    @OriginalMember(owner = "client!cf", name = "He", descriptor = "F")
    public float field8133 = 1.0F;

    @OriginalMember(owner = "client!cf", name = "se", descriptor = "F")
    private float field8118 = 1.0F;

    @OriginalMember(owner = "client!cf", name = "ue", descriptor = "I")
    public int field8120 = 3584;

    @OriginalMember(owner = "client!cf", name = "je", descriptor = "I")
    private int field8109 = 0;

    @OriginalMember(owner = "client!cf", name = "Se", descriptor = "I")
    public int field8144 = 3;

    @OriginalMember(owner = "client!cf", name = "Ee", descriptor = "Z")
    private boolean field8130 = false;

    @OriginalMember(owner = "client!cf", name = "cf", descriptor = "I")
    public int field8154 = -1;

    @OriginalMember(owner = "client!cf", name = "We", descriptor = "I")
    private int field8148 = 0;

    @OriginalMember(owner = "client!cf", name = "qe", descriptor = "I")
    public int field8116 = 8;

    @OriginalMember(owner = "client!cf", name = "Ue", descriptor = "Z")
    public boolean field8146 = true;

    @OriginalMember(owner = "client!cf", name = "ne", descriptor = "I")
    public int field8113 = 0;

    @OriginalMember(owner = "client!cf", name = "ke", descriptor = "[Lne;")
    private class292[] field8110 = new class292[10];

    @OriginalMember(owner = "client!cf", name = "Ge", descriptor = "I")
    public int field8132 = 0;

    @OriginalMember(owner = "client!cf", name = "ve", descriptor = "[F")
    private float[] field8121 = new float[16];

    @OriginalMember(owner = "client!cf", name = "df", descriptor = "Z")
    public boolean field8155 = false;

    @OriginalMember(owner = "client!cf", name = "Xe", descriptor = "Z")
    private boolean field8149 = false;

    @OriginalMember(owner = "client!cf", name = "ff", descriptor = "F")
    public float field8157 = 1.0F;

    @OriginalMember(owner = "client!cf", name = "pf", descriptor = "[F")
    private float[] field8166 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!cf", name = "ge", descriptor = "Loda;")
    public class103 field8106 = class1.field174;

    @OriginalMember(owner = "client!cf", name = "ze", descriptor = "I")
    private int field8125 = -1;

    @OriginalMember(owner = "client!cf", name = "tf", descriptor = "Z")
    public boolean field8170 = true;

    @OriginalMember(owner = "client!cf", name = "ef", descriptor = "I")
    private int field8156 = 0;

    @OriginalMember(owner = "client!cf", name = "lf", descriptor = "F")
    public float field8162 = 1.0F;

    @OriginalMember(owner = "client!cf", name = "fe", descriptor = "[F")
    public float[] field8105 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!cf", name = "oe", descriptor = "I")
    public int field8114 = 128;

    @OriginalMember(owner = "client!cf", name = "hf", descriptor = "F")
    public float field8159 = 1.0F;

    @OriginalMember(owner = "client!cf", name = "he", descriptor = "Z")
    private boolean field8107 = false;

    @OriginalMember(owner = "client!cf", name = "vf", descriptor = "Z")
    public boolean field8172 = false;

    @OriginalMember(owner = "client!cf", name = "Ie", descriptor = "I")
    public int field8134 = 0;

    @OriginalMember(owner = "client!cf", name = "af", descriptor = "I")
    public int field8152 = 0;

    @OriginalMember(owner = "client!cf", name = "Te", descriptor = "Z")
    private boolean field8145 = false;

    @OriginalMember(owner = "client!cf", name = "sf", descriptor = "Z")
    public boolean field8169 = true;

    @OriginalMember(owner = "client!cf", name = "Ef", descriptor = "I")
    public int field8181 = 0;

    @OriginalMember(owner = "client!cf", name = "le", descriptor = "I")
    public int field8111 = 0;

    @OriginalMember(owner = "client!cf", name = "Lf", descriptor = "I")
    public int field8188 = 0;

    @OriginalMember(owner = "client!cf", name = "Ff", descriptor = "Z")
    public boolean field8182 = false;

    @OriginalMember(owner = "client!cf", name = "zf", descriptor = "I")
    private int field8176 = 16777215;

    @OriginalMember(owner = "client!cf", name = "ye", descriptor = "F")
    public float field8124 = 3584.0F;

    @OriginalMember(owner = "client!cf", name = "Re", descriptor = "[F")
    public float[] field8143 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!cf", name = "Jf", descriptor = "Z")
    public boolean field8186 = false;

    @OriginalMember(owner = "client!cf", name = "Je", descriptor = "I")
    public int field8135 = 50;

    @OriginalMember(owner = "client!cf", name = "nf", descriptor = "F")
    public float field8164 = -1.0F;

    @OriginalMember(owner = "client!cf", name = "Kf", descriptor = "I")
    public int field8187 = -1;

    @OriginalMember(owner = "client!cf", name = "Ze", descriptor = "I")
    public int field8151 = 0;

    @OriginalMember(owner = "client!cf", name = "jf", descriptor = "F")
    public float field8160 = 3584.0F;

    @OriginalMember(owner = "client!cf", name = "te", descriptor = "Z")
    public boolean field8119 = true;

    @OriginalMember(owner = "client!cf", name = "Wf", descriptor = "I")
    private int field8199 = -1;

    @OriginalMember(owner = "client!cf", name = "yf", descriptor = "I")
    public int field8175 = 0;

    @OriginalMember(owner = "client!cf", name = "Bf", descriptor = "[F")
    private float[] field8178 = new float[16];

    @OriginalMember(owner = "client!cf", name = "Hf", descriptor = "[F")
    private float[] field8184 = new float[16];

    @OriginalMember(owner = "client!cf", name = "rf", descriptor = "[F")
    public float[] field8168 = this.field8166;

    @OriginalMember(owner = "client!cf", name = "Vf", descriptor = "F")
    public float field8198 = -1.0F;

    @OriginalMember(owner = "client!cf", name = "Af", descriptor = "I")
    private int field8177 = 0;

    @OriginalMember(owner = "client!cf", name = "ag", descriptor = "Z")
    private boolean field8203 = false;

    @OriginalMember(owner = "client!cf", name = "Sf", descriptor = "[F")
    private float[] field8195 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!cf", name = "Yf", descriptor = "Z")
    public boolean field8201 = true;

    @OriginalMember(owner = "client!cf", name = "Xf", descriptor = "I")
    public int field8200 = 512;

    @OriginalMember(owner = "client!cf", name = "qf", descriptor = "[F")
    private float[] field8167 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!cf", name = "Rf", descriptor = "Z")
    private boolean field8194 = false;

    @OriginalMember(owner = "client!cf", name = "Zf", descriptor = "I")
    public int field8202 = 0;

    @OriginalMember(owner = "client!cf", name = "Oe", descriptor = "I")
    public int field8140 = 512;

    @OriginalMember(owner = "client!cf", name = "Gf", descriptor = "I")
    private int field8183 = 1;

    @OriginalMember(owner = "client!cf", name = "cg", descriptor = "I")
    private int field8205 = -1;

    @OriginalMember(owner = "client!cf", name = "De", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8129 = new Stream();

    @OriginalMember(owner = "client!cf", name = "pg", descriptor = "Lun;")
    private class391 field8218 = new class391();

    @OriginalMember(owner = "client!cf", name = "Nf", descriptor = "I")
    public int field8190;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "Lom;")
    public class344 field7936;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "Ljava/lang/Object;")
    public Object field7911;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field7922;

    @OriginalMember(owner = "client!cf", name = "Gb", descriptor = "Ljava/awt/Canvas;")
    public Canvas field7976;

    @OriginalMember(owner = "client!cf", name = "sc", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8014;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    private int field7916;

    @OriginalMember(owner = "client!cf", name = "Bc", descriptor = "I")
    public int field8023;

    @OriginalMember(owner = "client!cf", name = "xd", descriptor = "I")
    private int field8071;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
    public int field7924;

    @OriginalMember(owner = "client!cf", name = "kf", descriptor = "I")
    public int field8161;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field7915;

    @OriginalMember(owner = "client!cf", name = "of", descriptor = "Lep;")
    private class389 field8165;

    @OriginalMember(owner = "client!cf", name = "pc", descriptor = "Lsb;")
    public static class266 field8011 = new class266(52, 7);

    @OriginalMember(owner = "client!cf", name = "Td", descriptor = "I")
    public static int field8093 = 0;

    @OriginalMember(owner = "client!cf", name = "Ae", descriptor = "F")
    public float field8126;

    @OriginalMember(owner = "client!cf", name = "Le", descriptor = "F")
    public float field8137;

    @OriginalMember(owner = "client!cf", name = "Pe", descriptor = "F")
    public float field8141;

    @OriginalMember(owner = "client!cf", name = "Ve", descriptor = "F")
    private float field8147;

    @OriginalMember(owner = "client!cf", name = "mf", descriptor = "F")
    public float field8163;

    @OriginalMember(owner = "client!cf", name = "Df", descriptor = "F")
    private float field8180;

    @OriginalMember(owner = "client!cf", name = "Of", descriptor = "F")
    public float field8191;

    @OriginalMember(owner = "client!cf", name = "bg", descriptor = "F")
    public float field8204;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    public static int field7912;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field7913;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field7914;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public static int field7917;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
    public static int field7925;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
    public static int field7927;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    public static int field7928;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    public static int field7930;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    public static int field7931;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    public static int field7932;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    public static int field7934;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    public static int field7935;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
    public static int field7939;

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "I")
    public static int field7940;

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "I")
    public static int field7941;

    @OriginalMember(owner = "client!cf", name = "Y", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!cf", name = "Z", descriptor = "I")
    public static int field7943;

    @OriginalMember(owner = "client!cf", name = "ab", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!cf", name = "bb", descriptor = "I")
    public static int field7945;

    @OriginalMember(owner = "client!cf", name = "cb", descriptor = "I")
    public static int field7946;

    @OriginalMember(owner = "client!cf", name = "db", descriptor = "I")
    public static int field7947;

    @OriginalMember(owner = "client!cf", name = "eb", descriptor = "I")
    public static int field7948;

    @OriginalMember(owner = "client!cf", name = "fb", descriptor = "I")
    public static int field7949;

    @OriginalMember(owner = "client!cf", name = "gb", descriptor = "I")
    public static int field7950;

    @OriginalMember(owner = "client!cf", name = "hb", descriptor = "I")
    public static int field7951;

    @OriginalMember(owner = "client!cf", name = "ib", descriptor = "I")
    public static int field7952;

    @OriginalMember(owner = "client!cf", name = "jb", descriptor = "I")
    public static int field7953;

    @OriginalMember(owner = "client!cf", name = "kb", descriptor = "I")
    public static int field7954;

    @OriginalMember(owner = "client!cf", name = "mb", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!cf", name = "nb", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!cf", name = "ob", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!cf", name = "pb", descriptor = "I")
    public static int field7959;

    @OriginalMember(owner = "client!cf", name = "qb", descriptor = "I")
    public static int field7960;

    @OriginalMember(owner = "client!cf", name = "rb", descriptor = "I")
    public static int field7961;

    @OriginalMember(owner = "client!cf", name = "sb", descriptor = "I")
    public static int field7962;

    @OriginalMember(owner = "client!cf", name = "tb", descriptor = "I")
    public static int field7963;

    @OriginalMember(owner = "client!cf", name = "ub", descriptor = "I")
    public static int field7964;

    @OriginalMember(owner = "client!cf", name = "vb", descriptor = "I")
    public static int field7965;

    @OriginalMember(owner = "client!cf", name = "wb", descriptor = "I")
    public static int field7966;

    @OriginalMember(owner = "client!cf", name = "xb", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!cf", name = "yb", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!cf", name = "zb", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!cf", name = "Ab", descriptor = "I")
    public static int field7970;

    @OriginalMember(owner = "client!cf", name = "Bb", descriptor = "I")
    public static int field7971;

    @OriginalMember(owner = "client!cf", name = "Cb", descriptor = "I")
    public static int field7972;

    @OriginalMember(owner = "client!cf", name = "Db", descriptor = "I")
    public static int field7973;

    @OriginalMember(owner = "client!cf", name = "Eb", descriptor = "I")
    public static int field7974;

    @OriginalMember(owner = "client!cf", name = "Fb", descriptor = "I")
    public static int field7975;

    @OriginalMember(owner = "client!cf", name = "Hb", descriptor = "I")
    public static int field7977;

    @OriginalMember(owner = "client!cf", name = "Ib", descriptor = "I")
    public static int field7978;

    @OriginalMember(owner = "client!cf", name = "Jb", descriptor = "I")
    public static int field7979;

    @OriginalMember(owner = "client!cf", name = "Kb", descriptor = "I")
    public static int field7980;

    @OriginalMember(owner = "client!cf", name = "Lb", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!cf", name = "Mb", descriptor = "I")
    public static int field7982;

    @OriginalMember(owner = "client!cf", name = "Nb", descriptor = "I")
    public static int field7983;

    @OriginalMember(owner = "client!cf", name = "Ob", descriptor = "I")
    public static int field7984;

    @OriginalMember(owner = "client!cf", name = "Pb", descriptor = "I")
    public static int field7985;

    @OriginalMember(owner = "client!cf", name = "Qb", descriptor = "I")
    public static int field7986;

    @OriginalMember(owner = "client!cf", name = "Rb", descriptor = "I")
    public static int field7987;

    @OriginalMember(owner = "client!cf", name = "Sb", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!cf", name = "Tb", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!cf", name = "Ub", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!cf", name = "Vb", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!cf", name = "Wb", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!cf", name = "Xb", descriptor = "I")
    public static int field7993;

    @OriginalMember(owner = "client!cf", name = "Yb", descriptor = "I")
    public static int field7994;

    @OriginalMember(owner = "client!cf", name = "Zb", descriptor = "I")
    public static int field7995;

    @OriginalMember(owner = "client!cf", name = "ac", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!cf", name = "cc", descriptor = "I")
    public static int field7998;

    @OriginalMember(owner = "client!cf", name = "dc", descriptor = "I")
    public static int field7999;

    @OriginalMember(owner = "client!cf", name = "ec", descriptor = "I")
    public static int field8000;

    @OriginalMember(owner = "client!cf", name = "fc", descriptor = "I")
    public static int field8001;

    @OriginalMember(owner = "client!cf", name = "gc", descriptor = "I")
    public static int field8002;

    @OriginalMember(owner = "client!cf", name = "hc", descriptor = "I")
    public static int field8003;

    @OriginalMember(owner = "client!cf", name = "ic", descriptor = "I")
    public static int field8004;

    @OriginalMember(owner = "client!cf", name = "jc", descriptor = "I")
    public static int field8005;

    @OriginalMember(owner = "client!cf", name = "kc", descriptor = "I")
    public static int field8006;

    @OriginalMember(owner = "client!cf", name = "lc", descriptor = "I")
    public static int field8007;

    @OriginalMember(owner = "client!cf", name = "mc", descriptor = "I")
    public static int field8008;

    @OriginalMember(owner = "client!cf", name = "nc", descriptor = "I")
    public static int field8009;

    @OriginalMember(owner = "client!cf", name = "oc", descriptor = "I")
    public static int field8010;

    @OriginalMember(owner = "client!cf", name = "qc", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!cf", name = "rc", descriptor = "I")
    public static int field8013;

    @OriginalMember(owner = "client!cf", name = "tc", descriptor = "I")
    public static int field8015;

    @OriginalMember(owner = "client!cf", name = "uc", descriptor = "I")
    public static int field8016;

    @OriginalMember(owner = "client!cf", name = "vc", descriptor = "I")
    public static int field8017;

    @OriginalMember(owner = "client!cf", name = "wc", descriptor = "I")
    public static int field8018;

    @OriginalMember(owner = "client!cf", name = "xc", descriptor = "I")
    public static int field8019;

    @OriginalMember(owner = "client!cf", name = "yc", descriptor = "I")
    public static int field8020;

    @OriginalMember(owner = "client!cf", name = "zc", descriptor = "I")
    public static int field8021;

    @OriginalMember(owner = "client!cf", name = "Ac", descriptor = "I")
    public static int field8022;

    @OriginalMember(owner = "client!cf", name = "Cc", descriptor = "I")
    public static int field8024;

    @OriginalMember(owner = "client!cf", name = "Dc", descriptor = "I")
    public static int field8025;

    @OriginalMember(owner = "client!cf", name = "Ec", descriptor = "I")
    public static int field8026;

    @OriginalMember(owner = "client!cf", name = "Fc", descriptor = "I")
    public static int field8027;

    @OriginalMember(owner = "client!cf", name = "Gc", descriptor = "I")
    public static int field8028;

    @OriginalMember(owner = "client!cf", name = "Hc", descriptor = "I")
    public static int field8029;

    @OriginalMember(owner = "client!cf", name = "Ic", descriptor = "I")
    public static int field8030;

    @OriginalMember(owner = "client!cf", name = "Jc", descriptor = "I")
    public static int field8031;

    @OriginalMember(owner = "client!cf", name = "Kc", descriptor = "I")
    public static int field8032;

    @OriginalMember(owner = "client!cf", name = "Lc", descriptor = "I")
    public static int field8033;

    @OriginalMember(owner = "client!cf", name = "Mc", descriptor = "I")
    public static int field8034;

    @OriginalMember(owner = "client!cf", name = "Nc", descriptor = "I")
    public static int field8035;

    @OriginalMember(owner = "client!cf", name = "Oc", descriptor = "I")
    public static int field8036;

    @OriginalMember(owner = "client!cf", name = "Pc", descriptor = "I")
    public static int field8037;

    @OriginalMember(owner = "client!cf", name = "Qc", descriptor = "I")
    public static int field8038;

    @OriginalMember(owner = "client!cf", name = "Rc", descriptor = "I")
    public static int field8039;

    @OriginalMember(owner = "client!cf", name = "Sc", descriptor = "I")
    public static int field8040;

    @OriginalMember(owner = "client!cf", name = "Tc", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!cf", name = "Uc", descriptor = "I")
    public static int field8042;

    @OriginalMember(owner = "client!cf", name = "Vc", descriptor = "I")
    public static int field8043;

    @OriginalMember(owner = "client!cf", name = "Wc", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!cf", name = "Xc", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!cf", name = "Yc", descriptor = "I")
    public static int field8046;

    @OriginalMember(owner = "client!cf", name = "Zc", descriptor = "I")
    public static int field8047;

    @OriginalMember(owner = "client!cf", name = "bd", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!cf", name = "cd", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!cf", name = "dd", descriptor = "I")
    public static int field8051;

    @OriginalMember(owner = "client!cf", name = "ed", descriptor = "I")
    public static int field8052;

    @OriginalMember(owner = "client!cf", name = "fd", descriptor = "I")
    public static int field8053;

    @OriginalMember(owner = "client!cf", name = "gd", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!cf", name = "hd", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!cf", name = "id", descriptor = "I")
    public static int field8056;

    @OriginalMember(owner = "client!cf", name = "jd", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!cf", name = "kd", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!cf", name = "ld", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!cf", name = "md", descriptor = "I")
    public static int field8060;

    @OriginalMember(owner = "client!cf", name = "nd", descriptor = "I")
    public static int field8061;

    @OriginalMember(owner = "client!cf", name = "od", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!cf", name = "pd", descriptor = "I")
    public static int field8063;

    @OriginalMember(owner = "client!cf", name = "qd", descriptor = "I")
    public static int field8064;

    @OriginalMember(owner = "client!cf", name = "rd", descriptor = "I")
    public static int field8065;

    @OriginalMember(owner = "client!cf", name = "sd", descriptor = "I")
    public static int field8066;

    @OriginalMember(owner = "client!cf", name = "td", descriptor = "I")
    public static int field8067;

    @OriginalMember(owner = "client!cf", name = "ud", descriptor = "I")
    public static int field8068;

    @OriginalMember(owner = "client!cf", name = "vd", descriptor = "I")
    public static int field8069;

    @OriginalMember(owner = "client!cf", name = "wd", descriptor = "I")
    public static int field8070;

    @OriginalMember(owner = "client!cf", name = "yd", descriptor = "I")
    public static int field8072;

    @OriginalMember(owner = "client!cf", name = "zd", descriptor = "I")
    public static int field8073;

    @OriginalMember(owner = "client!cf", name = "Ad", descriptor = "I")
    public static int field8074;

    @OriginalMember(owner = "client!cf", name = "Bd", descriptor = "I")
    public static int field8075;

    @OriginalMember(owner = "client!cf", name = "Cd", descriptor = "I")
    public static int field8076;

    @OriginalMember(owner = "client!cf", name = "Dd", descriptor = "I")
    public static int field8077;

    @OriginalMember(owner = "client!cf", name = "Ed", descriptor = "I")
    public static int field8078;

    @OriginalMember(owner = "client!cf", name = "Fd", descriptor = "I")
    public static int field8079;

    @OriginalMember(owner = "client!cf", name = "Gd", descriptor = "I")
    public static int field8080;

    @OriginalMember(owner = "client!cf", name = "Hd", descriptor = "I")
    public static int field8081;

    @OriginalMember(owner = "client!cf", name = "Id", descriptor = "I")
    public static int field8082;

    @OriginalMember(owner = "client!cf", name = "Jd", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!cf", name = "Kd", descriptor = "I")
    public static int field8084;

    @OriginalMember(owner = "client!cf", name = "Ld", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!cf", name = "Nd", descriptor = "I")
    public static int field8087;

    @OriginalMember(owner = "client!cf", name = "Od", descriptor = "I")
    public int field8088;

    @OriginalMember(owner = "client!cf", name = "Pd", descriptor = "I")
    public static int field8089;

    @OriginalMember(owner = "client!cf", name = "Qd", descriptor = "I")
    public static int field8090;

    @OriginalMember(owner = "client!cf", name = "Ud", descriptor = "I")
    public int field8094;

    @OriginalMember(owner = "client!cf", name = "Vd", descriptor = "I")
    public static int field8095;

    @OriginalMember(owner = "client!cf", name = "Wd", descriptor = "I")
    public int field8096;

    @OriginalMember(owner = "client!cf", name = "Xd", descriptor = "I")
    public static int field8097;

    @OriginalMember(owner = "client!cf", name = "Yd", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!cf", name = "Zd", descriptor = "I")
    public static int field8099;

    @OriginalMember(owner = "client!cf", name = "me", descriptor = "I")
    private int field8112;

    @OriginalMember(owner = "client!cf", name = "xe", descriptor = "I")
    public int field8123;

    @OriginalMember(owner = "client!cf", name = "Be", descriptor = "I")
    public int field8127;

    @OriginalMember(owner = "client!cf", name = "Ce", descriptor = "I")
    public int field8128;

    @OriginalMember(owner = "client!cf", name = "gf", descriptor = "I")
    public int field8158;

    @OriginalMember(owner = "client!cf", name = "wf", descriptor = "I")
    private int field8173;

    @OriginalMember(owner = "client!cf", name = "Cf", descriptor = "I")
    public int field8179;

    @OriginalMember(owner = "client!cf", name = "If", descriptor = "I")
    public int field8185;

    @OriginalMember(owner = "client!cf", name = "Mf", descriptor = "I")
    public int field8189;

    @OriginalMember(owner = "client!cf", name = "Uf", descriptor = "I")
    public int field8197;

    @OriginalMember(owner = "client!cf", name = "xg", descriptor = "I")
    private int field8226;

    @OriginalMember(owner = "client!cf", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!cf", name = "xf", descriptor = "Lhw;")
    public class116 field8174;

    @OriginalMember(owner = "client!cf", name = "dg", descriptor = "Lvl;")
    public class13 field8206;

    @OriginalMember(owner = "client!cf", name = "fg", descriptor = "Lvl;")
    public class13 field8208;

    @OriginalMember(owner = "client!cf", name = "gg", descriptor = "Lvl;")
    public class13 field8209;

    @OriginalMember(owner = "client!cf", name = "hg", descriptor = "Lvl;")
    public class13 field8210;

    @OriginalMember(owner = "client!cf", name = "lg", descriptor = "Lvl;")
    public class13 field8214;

    @OriginalMember(owner = "client!cf", name = "ng", descriptor = "Lvl;")
    public class13 field8216;

    @OriginalMember(owner = "client!cf", name = "qg", descriptor = "Lvl;")
    public class13 field8219;

    @OriginalMember(owner = "client!cf", name = "sg", descriptor = "Lvl;")
    public class13 field8221;

    @OriginalMember(owner = "client!cf", name = "tg", descriptor = "Lvl;")
    public class13 field8222;

    @OriginalMember(owner = "client!cf", name = "wg", descriptor = "Lvl;")
    public class13 field8225;

    @OriginalMember(owner = "client!cf", name = "Ne", descriptor = "Lcw;")
    private class165 field8139;

    @OriginalMember(owner = "client!cf", name = "Me", descriptor = "Lne;")
    private class292 field8138;

    @OriginalMember(owner = "client!cf", name = "Tf", descriptor = "Lhp;")
    private class301 field8196;

    @OriginalMember(owner = "client!cf", name = "mg", descriptor = "Lwl;")
    private class378 field8215;

    @OriginalMember(owner = "client!cf", name = "og", descriptor = "Lwl;")
    private class378 field8217;

    @OriginalMember(owner = "client!cf", name = "lb", descriptor = "Lj;")
    public class504 field7955;

    @OriginalMember(owner = "client!cf", name = "ug", descriptor = "Lor;")
    private class595 field8223;

    @OriginalMember(owner = "client!cf", name = "eg", descriptor = "Lkr;")
    private class693 field8207;

    @OriginalMember(owner = "client!cf", name = "ig", descriptor = "Lkr;")
    public class693 field8211;

    @OriginalMember(owner = "client!cf", name = "jg", descriptor = "Lkr;")
    public class693 field8212;

    @OriginalMember(owner = "client!cf", name = "kg", descriptor = "Lkr;")
    public class693 field8213;

    @OriginalMember(owner = "client!cf", name = "rg", descriptor = "Lkr;")
    public class693 field8220;

    @OriginalMember(owner = "client!cf", name = "vg", descriptor = "Lkr;")
    private class693 field8224;

    @OriginalMember(owner = "client!cf", name = "ad", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field8048;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field7920;

    @OriginalMember(owner = "client!cf", name = "bc", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field7997;

    @OriginalMember(owner = "client!cf", name = "we", descriptor = "Z")
    public boolean field8122;

    @OriginalMember(owner = "client!cf", name = "Fe", descriptor = "Z")
    public boolean field8131;

    @OriginalMember(owner = "client!cf", name = "Ye", descriptor = "Z")
    public boolean field8150;

    @OriginalMember(owner = "client!cf", name = "uf", descriptor = "Z")
    public boolean field8171;

    @OriginalMember(owner = "client!cf", name = "Pf", descriptor = "Z")
    public boolean field8192;

    @OriginalMember(owner = "client!cf", name = "yg", descriptor = "Z")
    public boolean field8227;

    @OriginalMember(owner = "client!cf", name = "pe", descriptor = "[Lhw;")
    private class116[] field8115;

    @OriginalMember(owner = "client!cf", name = "Qf", descriptor = "[Lun;")
    public class391[] field8193;

    @OriginalMember(owner = "client!cf", name = "re", descriptor = "[Lcb;")
    public class483[] field8117;

    @OriginalMember(owner = "client!cf", name = "bf", descriptor = "[Lcb;")
    public class483[] field8153;

    @OriginalMember(owner = "client!cf", name = "Ke", descriptor = "[Ljv;")
    public class71[] field8136;

    @OriginalMember(owner = "client!cf", name = "Qe", descriptor = "[Lff;")
    public class9[] field8142;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "(I)V")
    public abstract void method2841(int arg0);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)V")
    public final void method3187(int arg0, boolean arg1) {
        if (arg1 == !this.field8169) {
            this.field8169 = arg1;
            this.method2866((byte) -119);
        }
        ++field8082;
        if (arg0 != 12) {
            this.method2899(28);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIILfda;Z[BBI)Lhi;")
    public abstract class190 method2897(int arg0, int arg1, int arg2, class294 arg3, boolean arg4, byte[] arg5, byte arg6, int arg7);

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)Le;")
    public final class495 method32(int arg0) {
        ++field8032;
        class32 var2 = new class32(arg0);
        this.field8086.method1229(var2, (byte) 120);
        return var2;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZZ)V")
    public final void method3188(boolean arg0, boolean arg1) {
        ++field8062;
        if (!this.field8155 != !arg1) {
            this.field8155 = arg1;
            this.method2885(-29);
        }
        if (arg0) {
            this.field8094 = 31;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILr;)V")
    public static final void method3189(int arg0, class167 arg1) {
        ++field8075;
        int var2 = class640.field9206;
        int var3 = class43.field1086;
        int var4 = class134.field2391;
        int var5 = class337.field5033 + -3;
        byte var6 = 20;
        if (class430.field6212 == null || class223.field3358 == null) {
            if (class632.field9092.method2230((byte) -113, class433.field6251) && class632.field9092.method2230((byte) 75, class222.field3349)) {
                class430.field6212 = arg1.method170(class279.method1841(class632.field9092, class433.field6251, 0), true);
                class279 var7 = class279.method1841(class632.field9092, class222.field3349, 0);
                class223.field3358 = arg1.method170(var7, true);
                var7.method1849();
                class361.field5364 = arg1.method170(var7, true);
            } else {
                arg1.method4(var2, var3, var4, var6, 255 - class291.field4377 << 24 | class159.field2708, 1);
            }
        }
        if (class430.field6212 != null && class223.field3358 != null) {
            int var8 = (-(2 * class223.field3358.method1792()) + var4) / class430.field6212.method1792();
            for (int var9 = 0; ~var9 > ~var8; ++var9) {
                class430.field6212.method3914(var2 - -class223.field3358.method1792() - -(var9 * class430.field6212.method1792()), var3);
            }
            class223.field3358.method3914(var2, var3);
            class361.field5364.method3914(var2 - -var4 - class361.field5364.method1792(), var3);
        }
        class367.field5445.method2558(class265.field3899.method1733(255, class140.field2466), var3 - -14, class195.field3066 | -16777216, var2 - -3, (byte) -126, -1);
        arg1.method4(var2, var3 + var6, var4, var5 - var6, class159.field2708 | -class291.field4377 + 255 << 24, 1);
        int var10 = class410.field5945.method1931(arg0 + -15022);
        int var11 = class410.field5945.method1936(arg0 ^ -7941);
        int var12 = 0;
        for (class300 var13 = (class300) class126.field2292.method1224(-2); var13 != null; var13 = (class300) class126.field2292.method1232(-2)) {
            int var31 = (-var12 + -1 + class481.field6904) * 16 + var6 + 13 + var3;
            if (var2 < var10 && ~(var2 + var4) < ~var10 && ~(var31 + -13) > ~var11 && var31 + 4 > var11 && var13.field4463) {
                arg1.method4(var2, var31 + -12, var4, 16, class528.field7443 | 255 - class357.field5337 << 24, 1);
            }
            ++var12;
        }
        if ((class81.field1590 == null || class607.field8840 == null || class536.field7509 == null) && class632.field9092.method2230((byte) -101, class247.field3716) && class632.field9092.method2230((byte) 113, client.field4113) && class632.field9092.method2230((byte) -89, class236.field3511)) {
            class279 var14 = class279.method1841(class632.field9092, client.field4113, 0);
            class607.field8840 = arg1.method170(var14, true);
            var14.method1849();
            class703.field9887 = arg1.method170(var14, true);
            class81.field1590 = arg1.method170(class279.method1841(class632.field9092, class247.field3716, 0), true);
            class279 var15 = class279.method1841(class632.field9092, class236.field3511, 0);
            class536.field7509 = arg1.method170(var15, true);
            var15.method1849();
            class139.field2462 = arg1.method170(var15, true);
        }
        if (class81.field1590 != null && class607.field8840 != null && class536.field7509 != null) {
            int var16 = (var4 - class536.field7509.method1792() * 2) / class81.field1590.method1792();
            for (int var17 = 0; ~var17 > ~var16; ++var17) {
                class81.field1590.method3914(class536.field7509.method1792() + var2 - -(class81.field1590.method1792() * var17), -class81.field1590.method1785() + var5 + var3);
            }
            int var18 = (var5 - var6 + -class536.field7509.method1785()) / class607.field8840.method1785();
            for (int var19 = 0; var19 < var18; ++var19) {
                class607.field8840.method3914(var2, var3 - (-var6 - class607.field8840.method1785() * var19));
                class703.field9887.method3914(var2 - -var4 - class703.field9887.method1792(), var3 + var6 + var19 * class607.field8840.method1785());
            }
            class536.field7509.method3914(var2, -class536.field7509.method1785() + var5 + var3);
            class139.field2462.method3914(var2 + var4 + -class536.field7509.method1792(), var5 + var3 + -class536.field7509.method1785());
        }
        int var20 = 0;
        for (class300 var21 = (class300) class126.field2292.method1224(-2); var21 != null; var21 = (class300) class126.field2292.method1232(arg0 ^ 8059)) {
            int var22 = (-var20 + -1 + class481.field6904) * 16 + var3 + var6 + 13;
            int var23 = class195.field3066 | -16777216;
            if (~var2 > ~var10 && var10 < var2 + var4 && ~(var22 + -13) > ~var11 && var11 < var22 - -4 && var21.field4463) {
                var23 = class685.field9717 | -16777216;
            }
            int[] var24 = null;
            if (class129.method1095(-45, var21.field4465)) {
                var24 = class268.field3985.method258((int) var21.field4472, (byte) -67).field1971;
            } else if (var21.field4471 != -1) {
                var24 = class268.field3985.method258(var21.field4471, (byte) -67).field1971;
            } else if (!class219.method1522(72, var21.field4465)) {
                if (class602.method3438(var21.field4465, -71)) {
                    Object var25 = null;
                    class56 var26;
                    if (~var21.field4465 == -1002) {
                        var26 = class237.field3521.method3515((int) var21.field4472, 50);
                    } else {
                        var26 = class237.field3521.method3515((int) (var21.field4472 >>> 32 & 2147483647L), 50);
                    }
                    if (var26.field1248 != null) {
                        var26 = var26.method662(3433, class113.field2038);
                    }
                    if (var26 != null) {
                        var24 = var26.field1309;
                    }
                }
            } else {
                class436 var27 = (class436) class208.field3179.method2596((long) ((int) var21.field4472), arg0 ^ -8024);
                if (var27 != null) {
                    class22 var28 = var27.field6298;
                    class334 var29 = var28.field880;
                    if (var29.field4984 != null) {
                        var29 = var29.method2150(class113.field2038, -32224);
                    }
                    if (var29 != null) {
                        var24 = var29.field4996;
                    }
                }
            }
            String var30 = class121.method1047(var21, false);
            if (var24 != null) {
                var30 = var30 + class367.method2319((byte) -85, var24);
            }
            class367.field5445.method2549(var22, 0, var23, -116, class240.field3544, class126.field2308, var2 + 3, var30);
            ++var20;
            if (var21.field4460) {
                class173.field2851.method3914(var2 - (-5 + -class141.field2478.method286(var30, -5113)), var22 + -12);
            }
        }
        if (arg0 != -8059) {
            field8011 = null;
        }
        class135.method1112(class337.field5033, class640.field9206, class43.field1086, true, class134.field2391);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)Lun;")
    public final class391 method3190(byte arg0) {
        ++field8001;
        if (arg0 != 63) {
            this.field8199 = 0;
        }
        return this.field8091;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)Lun;")
    public final class391 method3191(byte arg0) {
        if (arg0 >= -73) {
            return null;
        } else {
            ++field8067;
            if (!this.field8107) {
                this.field8104.method2419(this.field8102, this.field8091);
                this.field8107 = true;
            }
            return this.field8104;
        }
    }

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "(IIII)V")
    public final void method144(int arg0, int arg1, int arg2, int arg3) {
        ++field8058;
        boolean var5 = false;
        if (~this.field8134 > ~arg0) {
            var5 = true;
            this.field8134 = arg0;
        }
        if (this.field8132 > arg2) {
            this.field8132 = arg2;
            var5 = true;
        }
        if (arg1 > this.field8175) {
            this.field8175 = arg1;
            var5 = true;
        }
        if (~arg3 > ~this.field8152) {
            var5 = true;
            this.field8152 = arg3;
        }
        if (var5) {
            if (!this.field8227) {
                this.field8227 = true;
                this.method2884((byte) -128);
            }
            this.method2841(8);
            this.method3193(1);
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(B)I")
    public final int method3192(byte arg0) {
        if (arg0 <= 31) {
            this.method3251(75);
        }
        ++field8008;
        return this.field8181;
    }

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "(I)V")
    public abstract void method2864(int arg0);

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "()Lq;")
    public final class396 method53() {
        ++field8002;
        return this.field8218;
    }

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "(I)V")
    private final void method3193(int arg0) {
        this.field8141 = (float) (-this.field8151 + this.field8152);
        this.field8163 = (float) (-this.field8202 + this.field8134);
        this.field8126 = (float) (-this.field8202 + this.field8132);
        this.field8191 = (float) (-this.field8151 + this.field8175);
        if (arg0 != 1) {
            this.field7976 = null;
        }
        ++field7993;
    }

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "()Z")
    public final boolean method147() {
        ++field8027;
        return true;
    }

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "(I)V")
    public abstract void method2899(int arg0);

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(B)V")
    public abstract void method2877(byte arg0);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIII)V")
    public final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8063;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var8 *= var10;
            var9 = var7 * var10;
        }
        if (this.method3197(0.0F, (float) arg3 + var8, (float) arg2 + var9, (float) arg1, -127, (float) arg0, 0.0F)) {
            this.method3230(-89);
            this.method3242((byte) -73, arg4);
            this.method3231(0, class370.field5487, (byte) -49);
            this.method3224(0, (byte) -80, class370.field5487);
            this.method3248(-3, arg5);
            this.method3239(0);
            this.method2843(false, false);
            this.method3216(true);
            this.method2843(false, true);
            this.method3224(0, (byte) -80, class435.field6296);
            this.method3231(0, class435.field6296, (byte) -89);
        }
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(B)V")
    private final void method3194(byte arg0) {
        if (class153.field2606 != this.field8106) {
            class103 var2 = this.field8106;
            this.field8106 = class153.field2606;
            if (!var2.method959((byte) -88)) {
                this.method3238((byte) 92);
            }
            this.method3215(-19963);
            this.field8168 = this.field8121;
            this.method3257(-102);
            this.field8112 &= -8;
        }
        int var3 = 127 % ((arg0 - -25) / 59);
        ++field7973;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lro;Lfda;B)Z")
    public abstract boolean method2848(class2 arg0, class294 arg1, byte arg2);

    @OriginalMember(owner = "client!cf", name = "XA", descriptor = "(IIIII)V")
    public final void method126(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7978;
        this.method41(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILwl;)V")
    public abstract void method2873(int arg0, int arg1, class378 arg2);

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(IIIIII)Ljs;")
    public final class304 method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7921;
        return new class114(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "(B)V")
    public abstract void method2883(byte arg0);

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(II)V")
    public final void method3195(int arg0, int arg1) {
        if (arg1 == 1) {
            this.method3232(class525.field7399, class525.field7399, (byte) -112);
        } else if (arg1 != 0) {
            if (~arg1 == -3) {
                this.method3232(class42.field1079, class525.field7399, (byte) -119);
            } else if (~arg1 != -4) {
                if (~arg1 == -5) {
                    this.method3232(class205.field3145, class205.field3145, (byte) -98);
                }
            } else {
                this.method3232(class121.field2184, class509.field7205, (byte) -116);
            }
        } else {
            this.method3232(class509.field7205, class509.field7205, (byte) -119);
        }
        ++field8099;
        if (arg0 != -12) {
            this.method126(-80, -99, -76, 99, 118);
        }
    }

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "(I)V")
    private final void method3196(int arg0) {
        ++field7927;
        this.method2890(85);
        this.method2867((byte) 127);
        this.method2885(arg0 + -128);
        this.method2875(true);
        this.method2850((byte) 108);
        this.method2899(11160);
        this.method2883((byte) -120);
        this.method2855(-1);
        this.method2854(arg0 ^ 2);
        this.method2866((byte) -119);
        this.method2891(true);
        this.method2865(true);
        this.method2895(false);
        this.method2887((byte) -36);
        for (int var2 = this.field8189 + -1; var2 >= 0; --var2) {
            this.method3223(15, var2);
            this.method2870(0);
            this.method2900((byte) -72);
            this.method3220((byte) -51);
        }
        this.method2894(arg0);
        this.method2893(75);
        this.method2881(true);
        this.method2892((byte) -56);
        this.method2864(126);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(FFFFIFF)Z")
    private final boolean method3197(float arg0, float arg1, float arg2, float arg3, int arg4, float arg5, float arg6) {
        ++field8095;
        Buffer var8 = this.field8215.method2167(-1926, true);
        if (var8 == null) {
            return false;
        } else if (arg4 > -99) {
            return true;
        } else {
            Stream var9 = this.method3219(var8, 1009);
            if (Stream.method3580()) {
                var9.method3582(arg5);
                var9.method3582(arg3);
                var9.method3582(arg6);
                var9.method3582(arg2);
                var9.method3582(arg1);
                var9.method3582(arg0);
            } else {
                var9.method3584(arg5);
                var9.method3584(arg3);
                var9.method3584(arg6);
                var9.method3584(arg2);
                var9.method3584(arg1);
                var9.method3584(arg0);
            }
            var9.method3576();
            return this.field8215.method2169((byte) 44);
        }
    }

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "(I)V")
    public abstract void method2890(int arg0);

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "(I)I")
    public final int method3198(int arg0) {
        ++field8041;
        if (arg0 != 0) {
            this.method93(116, 74, -6, (int[]) null);
        }
        return this.field8205;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(ZZ)Lwl;")
    public abstract class378 method2851(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(Z)V")
    public abstract void method2895(boolean arg0);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ltf;IZ)V")
    private final void method3199(class269 arg0, int arg1, boolean arg2) {
        this.method2873(1, 0, this.field8217);
        ++field8013;
        this.method2862(13427, this.field8207);
        if (arg2) {
            this.field8168 = null;
        }
        this.method2859(arg0, 0, 1, arg1);
    }

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "(I)V")
    private final void method3200(int arg0) {
        ++field7985;
        this.field8124 = (float) this.field8120;
        int var2 = 85 % ((6 - arg0) / 40);
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
    public final void method177(int arg0) {
        ++field7982;
        if (~arg0 <= -129 && arg0 <= 1024) {
            if (this.field8165 != null) {
                this.field8165.method2399(-21406);
            }
            this.field8114 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)I")
    public final int method35(int arg0, int arg1) {
        ++field8029;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lfda;[BIIII)Lgv;")
    public abstract class73 method2842(class294 arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIF)Lff;")
    public final class9 method139(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field8070;
        return new class106(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "()I")
    public final int method151() {
        ++field8049;
        return this.field8185 - 2;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(IIIIII)V")
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8012;
        float var7 = this.method2846(-15839);
        this.method3230(-80);
        this.method3242((byte) -73, arg4);
        this.method3231(0, class370.field5487, (byte) -28);
        this.method3224(0, (byte) -80, class370.field5487);
        this.method3248(-3, arg5);
        this.field8091.method2421((byte) -57, 1.0F, (float) (arg2 + -1), (float) (arg3 + -1));
        this.field8091.method2413(-106, (float) arg1 - var7, 0.0F, (float) arg0 + -var7);
        this.method3260((byte) -124);
        this.method2843(false, false);
        this.method3199(class65.field1441, 4, false);
        this.method2843(false, true);
        this.method3224(0, (byte) -80, class435.field6296);
        this.method3231(0, class435.field6296, (byte) -32);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BZ)V")
    public final void method3201(byte arg0, boolean arg1) {
        if (!this.field8150 != !arg1) {
            this.field8150 = arg1;
            this.method2866((byte) -119);
            this.field8112 &= -32;
        }
        if (arg0 != -68) {
            this.field8158 = 50;
        }
        ++field8059;
    }

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "(B)V")
    public abstract void method2900(byte arg0);

    @OriginalMember(owner = "client!cf", name = "oa", descriptor = "([I)V")
    public final void method131(int[] arg0) {
        arg0[0] = this.field8134;
        ++field8026;
        arg0[1] = this.field8175;
        arg0[2] = this.field8132;
        arg0[3] = this.field8152;
    }

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "(I)Lun;")
    public final class391 method3202(int arg0) {
        ++field7934;
        if (arg0 != 8370) {
            this.field8132 = -118;
        }
        return this.field8102;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILkr;)V")
    public abstract void method2862(int arg0, class693 arg1);

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "(B)V")
    private final void method3203(byte arg0) {
        this.field8184[10] = this.field8147;
        ++field7918;
        this.field8184[14] = this.field8180;
        this.field8160 = (this.field8184[14] + (float) (-this.field8120)) / this.field8184[10];
        if (arg0 <= 10) {
            this.field8159 = -0.23496786F;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method2868(byte arg0, Canvas arg1);

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(Z)V")
    public abstract void method2881(boolean arg0);

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "(I)V")
    public abstract void method2894(int arg0);

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "(B)V")
    public abstract void method2866(byte arg0);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
    public abstract void method2853(Object arg0, Canvas arg1, byte arg2);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIZ)Lf;")
    public final class702 method182(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field8010;
        class372 var6 = new class372(this, arg2, arg3, arg4);
        var6.method1742(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!cf", name = "ra", descriptor = "(F)V")
    public final void method143(float arg0) {
        if (this.field8157 != arg0) {
            this.field8157 = arg0;
            this.field7915.setAmbient(arg0);
            this.method2890(111);
            this.method2899(11160);
        }
        ++field8079;
    }

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "(I)V")
    public final void method3204(int arg0) {
        if (~this.field8112 != arg0) {
            this.method3243((byte) 108);
            this.method3201((byte) -68, true);
            this.method3237((byte) -97, true);
            this.method3253(arg0 + -25284, true);
            this.method3248(-3, 1);
            this.field8112 = 8;
        }
        ++field8074;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/awt/Canvas;BLjava/lang/Object;)V")
    public abstract void method2857(Canvas arg0, byte arg1, Object arg2);

    @OriginalMember(owner = "client!cf", name = "ZA", descriptor = "(Z)V")
    public final void method81(boolean arg0) {
        ++field7912;
        this.field8201 = arg0;
        this.method2854(2);
    }

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "(I)V")
    private final void method3205(int arg0) {
        ++field8003;
        this.field8194 = false;
        this.method3234(arg0 + 83);
        if (class157.field2687 == this.field8106) {
            this.method3257(-77);
        }
        if (arg0 != 14) {
            this.method3246(false, 106, (byte) 92);
        }
    }

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "(B)I")
    public final int method3206(byte arg0) {
        int var2 = -32 / ((arg0 - 59) / 43);
        ++field8030;
        return this.field8173;
    }

    @OriginalMember(owner = "client!cf", name = "YA", descriptor = "(IIII)V")
    public final void method39(int arg0, int arg1, int arg2, int arg3) {
        ++field7998;
        if (!this.field8192) {
            throw new RuntimeException("");
        } else {
            this.field8205 = arg1;
            this.field8173 = arg0;
            this.field8199 = arg2;
            this.field8156 = arg3;
            if (this.field8203) {
                this.field8110[3].method1327(115);
                this.field8110[3].method1326((byte) -110);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "(I)V")
    private final void method3207(int arg0) {
        this.field8217 = this.method2851(true, false);
        ++field7968;
        this.field8217.method2164(28, 3573, 140);
        if (arg0 != 3) {
            this.field8096 = 55;
        }
        for (int var2 = 0; var2 < 4; ++var2) {
            Buffer var3 = this.field8217.method2167(-1926, true);
            if (var3 != null) {
                Stream var4 = this.method3219(var3, arg0 ^ 1010);
                if (Stream.method3580()) {
                    var4.method3582(0.0F);
                    var4.method3582(0.0F);
                    var4.method3582(0.0F);
                    var4.method3582(0.0F);
                    var4.method3582(0.0F);
                    var4.method3582(0.0F);
                    var4.method3582(0.0F);
                    var4.method3582(0.0F);
                    var4.method3582(1.0F);
                    var4.method3582(0.0F);
                    var4.method3582(0.0F);
                    var4.method3582(1.0F);
                    var4.method3582(0.0F);
                    var4.method3582(1.0F);
                    var4.method3582(1.0F);
                    var4.method3582(1.0F);
                    var4.method3582(0.0F);
                    var4.method3582(1.0F);
                    var4.method3582(1.0F);
                    var4.method3582(1.0F);
                    var4.method3582(1.0F);
                    var4.method3582(1.0F);
                    var4.method3582(0.0F);
                    var4.method3582(0.0F);
                    var4.method3582(1.0F);
                    var4.method3582(0.0F);
                    var4.method3582(1.0F);
                    var4.method3582(0.0F);
                    var4.method3582(0.0F);
                    var4.method3582(0.0F);
                    var4.method3582(0.0F);
                    var4.method3582(0.0F);
                    var4.method3582(0.0F);
                    var4.method3582(0.0F);
                    var4.method3582(0.0F);
                } else {
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(1.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(1.0F);
                    var4.method3584(0.0F);
                    var4.method3584(1.0F);
                    var4.method3584(1.0F);
                    var4.method3584(1.0F);
                    var4.method3584(0.0F);
                    var4.method3584(1.0F);
                    var4.method3584(1.0F);
                    var4.method3584(1.0F);
                    var4.method3584(1.0F);
                    var4.method3584(1.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(1.0F);
                    var4.method3584(0.0F);
                    var4.method3584(1.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                    var4.method3584(0.0F);
                }
                var4.method3576();
                if (this.field8217.method2169((byte) -122)) {
                    break;
                }
            }
        }
        this.field8207 = this.method2878(-86, new class30[] { new class30(new class14[] { class14.field731, class14.field735, class14.field735 }) });
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "()Z")
    public final boolean method159() {
        ++field8054;
        return true;
    }

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "(I)V")
    public final void method3208(int arg0) {
        ++field7946;
        if (this.field8112 != 4) {
            this.method3236(-63);
            this.method3201((byte) -68, false);
            this.method3268(false, (byte) 115);
            this.method3237((byte) -99, false);
            this.method3253(-25293, false);
            this.method3222(-2, (byte) -110, false, false);
            this.method3248(-3, 1);
            this.method3195(arg0 ^ -6, 0);
            this.field8112 = 4;
        }
        if (arg0 != 14) {
            this.method171();
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(ZZ)V")
    public abstract void method2843(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "(I)V")
    private final void method3209(int arg0) {
        ++field7991;
        if (arg0 > -125) {
            this.method85(123, 97, -101, -47, 92);
        }
        this.method2849(-117);
        if (this.field8138 != null) {
            this.field8138.method759(-1);
        }
    }

    @OriginalMember(owner = "client!cf", name = "CA", descriptor = "(IIII)V")
    public final void method180(int arg0, int arg1, int arg2, int arg3) {
        this.field8156 = arg3;
        ++field7949;
        this.field8192 = true;
        this.field8205 = arg1;
        this.field8199 = arg2;
        this.field8173 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(III)Z")
    public static final boolean method3210(int arg0, int arg1, int arg2) {
        ++field8050;
        if (arg0 <= 30) {
            method3210(-127, -120, -100);
        }
        return false;
    }

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "(I)F")
    public abstract float method2846(int arg0);

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "(I)V")
    public abstract void method2893(int arg0);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[Lff;)V")
    public final void method75(int arg0, class9[] arg1) {
        ++field7970;
        for (int var3 = 0; arg0 > var3; ++var3) {
            this.field8142[var3] = arg1[var3];
        }
        this.field8197 = arg0;
        if (this.field8106.method959((byte) -86)) {
            this.method2875(true);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLfda;Lro;II)Lhi;")
    public abstract class190 method2898(byte arg0, class294 arg1, class2 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "(B)V")
    private final void method3211(byte arg0) {
        this.field8215 = this.method2851(true, true);
        ++field7926;
        if (arg0 == 81) {
            this.field8215.method2164(12, 3573, 24);
            this.field8224 = this.method2878(-76, new class30[] { new class30(class14.field731) });
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lun;I)V")
    public final void method3212(class391 arg0, int arg1) {
        this.field8091.method896(arg0);
        ++field8051;
        this.field8092 = false;
        this.method3254(false);
        if (arg1 != 0) {
            this.method48(102);
        }
    }

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "(B)V")
    public abstract void method2892(byte arg0);

    @OriginalMember(owner = "client!cf", name = "MA", descriptor = "(III[I)V")
    public final void method178(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7990;
        float var5 = this.field8100.method2418((float) arg1, (float) arg0, (float) arg2, (byte) 104);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field8202;
            var7 = this.field8151;
        } else {
            var6 = (int) ((float) this.field8200 * this.field8100.method2407((float) arg0, (byte) 89, (float) arg1, (float) arg2) / var5);
            var7 = (int) ((float) this.field8140 * this.field8100.method2420((float) arg1, false, (float) arg2, (float) arg0) / var5);
        }
        arg3[0] = (int) ((float) var6 - this.field8163);
        arg3[1] = (int) ((float) var7 - this.field8191);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "(B)V")
    public abstract void method2850(byte arg0);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public final class37 method113(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field7996;
        return new class268(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(Z)V")
    public abstract void method2865(boolean arg0);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z[[III)Lpu;")
    public abstract class524 method2844(boolean arg0, int[][] arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method185(Canvas arg0) {
        this.field7922 = null;
        this.field8014 = null;
        ++field8098;
        if (arg0 != null && this.field7976 != arg0) {
            if (this.field7997.containsKey(arg0)) {
                this.field7922 = this.field7997.get(arg0);
                this.field8014 = arg0;
            }
        } else {
            this.field7922 = this.field7911;
            this.field8014 = this.field7976;
        }
        if (this.field8014 != null && this.field7922 != null) {
            this.method2874(-18862, this.field7922, this.field8014);
            this.method3262(-3888);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(FI)V")
    public final void method3213(float arg0, int arg1) {
        ++field8080;
        if (arg1 < 63) {
            this.method3267(true);
        }
        if (this.field8118 != arg0) {
            this.field8118 = arg0;
            this.method3250(true);
        }
    }

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "()Z")
    public final boolean method12() {
        ++field8061;
        return this.field8131;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Lfa;Lom;II)V")
    public class562(Canvas arg0, Object arg1, class214 arg2, class344 arg3, int arg4, int arg5) {
        super(arg2);
        this.field8190 = arg4;
        this.field7936 = arg3;
        this.field7922 = this.field7911 = arg1;
        this.field8014 = this.field7976 = arg0;
        Dimension var7 = arg0.getSize();
        this.field8023 = this.field7916 = var7.width;
        this.field7924 = this.field8071 = var7.height;
        this.field8161 = arg5;
        class377.method2364(false, true, -40);
        if (super.field2768 == null) {
            this.field7915 = new NativeInterface(0, this.field8161);
            this.field8165 = null;
        } else {
            this.field8165 = new class389(this, super.field2768);
            this.field7915 = new NativeInterface(super.field2768.method1497((byte) -97), this.field8161);
            for (int var8 = 0; ~super.field2768.method1497((byte) -120) < ~var8; ++var8) {
                class699 var9 = super.field2768.method1500(var8, -106);
                if (var9 != null) {
                    this.field7915.initTextureMetrics(var8, var9.field9843, var9.field9838);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "pa", descriptor = "(III)V")
    public final void method152(int arg0, int arg1, int arg2) {
        if (~this.field8154 != ~arg0 || this.field8187 != arg1 || ~this.field8111 != ~arg2) {
            this.field8187 = arg1;
            this.field8111 = arg2;
            this.field8154 = arg0;
            this.method3227(true);
            this.method2866((byte) -119);
        }
        ++field7951;
    }

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "(B)[F")
    public final float[] method3214(byte arg0) {
        ++field7945;
        if (arg0 != -116) {
            this.field8205 = 110;
        }
        return this.field8166;
    }

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "(B)V")
    public abstract void method2867(byte arg0);

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "(B)V")
    public abstract void method2884(byte arg0);

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "(I)V")
    private final void method3215(int arg0) {
        if (!this.field8130) {
            float[] var2 = this.field8121;
            float var3 = (float) this.field8135;
            float var4 = (float) this.field8120;
            float var5 = (float) (-this.field8151) * this.field8118 / (float) this.field8140;
            float var6 = (float) (-this.field8202) * this.field8118 / (float) this.field8200;
            float var7 = (float) (-this.field8202 + this.field8023) * this.field8118 / (float) this.field8200;
            float var8 = (float) (-this.field8151 + this.field7924) * this.field8118 / (float) this.field8140;
            if (var6 != var7 && var5 != var8) {
                var2[11] = 0.0F;
                var2[0] = 2.0F / (-var6 + var7);
                var2[9] = 0.0F;
                var2[12] = (var6 + var7) / (var6 - var7);
                var2[6] = 0.0F;
                var2[7] = 0.0F;
                var2[13] = (var5 + var8) / (-var5 + var8);
                var2[10] = 1.0F / (-var4 + var3);
                var2[3] = 0.0F;
                var2[5] = 2.0F / (var8 - var5);
                var2[2] = 0.0F;
                var2[14] = var3 / (var3 - var4);
                var2[4] = 0.0F;
                var2[15] = 1.0F;
                var2[8] = 0.0F;
                var2[1] = 0.0F;
            } else {
                var2[13] = 0.0F;
                var2[8] = 0.0F;
                var2[6] = 0.0F;
                var2[11] = 0.0F;
                var2[2] = 0.0F;
                var2[1] = 0.0F;
                var2[12] = 0.0F;
                var2[4] = 0.0F;
                var2[10] = 1.0F;
                var2[5] = 1.0F;
                var2[9] = 0.0F;
                var2[14] = 0.0F;
                var2[15] = 1.0F;
                var2[7] = 0.0F;
                var2[0] = 1.0F;
                var2[3] = 0.0F;
            }
            this.method3200(-74);
            this.field8130 = true;
        }
        ++field7957;
        if (arg0 != -19963) {
            this.field8172 = false;
        }
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(Z)V")
    private final void method3216(boolean arg0) {
        ++field7966;
        this.method2873(1, 0, this.field8215);
        this.method2862(13427, this.field8224);
        if (!arg0) {
            this.method108(25, -7, -61, -44, 22, -70);
        }
        this.method2859(class336.field5029, 0, 1, 1);
    }

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "(I)V")
    public void method2852(int arg0) {
        this.method3196(arg0 ^ arg0);
        ++field7958;
    }

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "(I)V")
    public final void method3217(int arg0) {
        if (class1.field174 != this.field8106) {
            class103 var2 = this.field8106;
            this.field8106 = class1.field174;
            if (var2.method959((byte) -126)) {
                this.method3238((byte) -89);
            }
            this.field8168 = this.field8166;
            this.field8112 &= -32;
        }
        ++field8060;
        if (arg0 != -32) {
            this.method159();
        }
    }

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "()Z")
    public final boolean method127() {
        ++field7974;
        return false;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[FZIIILfda;I)Lhi;")
    public abstract class190 method2863(int arg0, float[] arg1, boolean arg2, int arg3, int arg4, int arg5, class294 arg6, int arg7);

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "(I)V")
    public abstract void method2855(int arg0);

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "(B)V")
    public final void method3218(byte arg0) {
        ++field8085;
        this.method3199(class645.field9293, 2, false);
        int var2 = 12 / ((arg0 - -10) / 50);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ltf;IIIIILor;)V")
    public abstract void method2872(class269 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class595 arg6);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field8090;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljaclib/memory/Buffer;I)Ljaclib/memory/Stream;")
    public final Stream method3219(Buffer arg0, int arg1) {
        ++field7965;
        this.field8129.method3579(arg0);
        if (arg1 != 1009) {
            this.method178(0, 53, 105, (int[]) null);
        }
        return this.field8129;
    }

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "(I)V")
    public abstract void method2885(int arg0);

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "(B)V")
    public final void method3220(byte arg0) {
        if (arg0 >= -14) {
            this.method168();
        }
        if (this.field8136[this.field8181] != class496.field7062) {
            this.field8136[this.field8181] = class496.field7062;
            this.field8193[this.field8181].method895();
            this.method3209(-126);
        }
        ++field8081;
    }

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "()Z")
    public final boolean method31() {
        ++field8042;
        return this.field8110[3].method604(24561);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()Lq;")
    public final class396 method169() {
        ++field7933;
        return this.field8100;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ[FBILfda;)Lhi;")
    public final class190 method3221(int arg0, boolean arg1, float[] arg2, byte arg3, int arg4, class294 arg5) {
        ++field8046;
        return arg3 != 88 ? null : this.method2863(arg4, arg2, arg1, 0, arg3 + -14213, 0, arg5, arg0);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBZZ)V")
    public final void method3222(int arg0, byte arg1, boolean arg2, boolean arg3) {
        if (arg1 >= -100) {
            this.method103();
        }
        ++field7923;
        if (~this.field8125 != ~arg0 || this.field8203 != this.field8192) {
            class190 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = !this.field8192 ? 0 : 3;
            if (arg0 < 0) {
                this.method3220((byte) -24);
            } else {
                var5 = this.field8165.method2396((byte) 100, arg0);
                class699 var10 = super.field2768.method1500(arg0, -18);
                if (~var10.field9852 == -1 && ~var10.field9834 == -1) {
                    this.method3220((byte) -111);
                } else {
                    int var11 = var10.field9836 ? 64 : 128;
                    int var12 = var11 * 50;
                    class391 var13 = this.method3240(true);
                    var13.method2415((float) (this.field8123 % var12 * var10.field9834) / (float) var12, (float) (this.field8123 % var12 * var10.field9852) / (float) var12, 0.0F, (byte) 30);
                    this.method3265((byte) -88, class662.field9533);
                }
                var6 = var10.field9835;
                if (!this.field8192) {
                    var8 = var10.field9826;
                    var7 = var10.field9849;
                    var9 = var10.field9829;
                }
            }
            this.method3233(var7, arg3, var9, Integer.MAX_VALUE, arg2, var8);
            if (this.field8138 == null) {
                this.method3266(-2, var5);
                this.method3195(-12, var6);
            } else {
                this.field8138.method603((byte) 73, var6, var5);
            }
            this.field8203 = this.field8192;
            this.field8125 = arg0;
        }
        this.field8112 &= -8;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIILua;II)V")
    public final void method24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class619 arg6, int arg7, int arg8) {
        ++field8020;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(II)V")
    public final void method3223(int arg0, int arg1) {
        if (~this.field8181 != ~arg1) {
            this.field8181 = arg1;
            this.method2888(arg0 + 21160);
        }
        ++field8072;
        if (arg0 != 15) {
            this.field7955 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIZ[II)Lhi;")
    public abstract class190 method2861(int arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6);

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "(I)V")
    public abstract void method2870(int arg0);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBLow;)V")
    public final void method3224(int arg0, byte arg1, class319 arg2) {
        this.method2860(arg0, (byte) 54, false, arg2);
        if (arg1 == -80) {
            ++field8069;
        }
    }

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "()V")
    public final void method103() {
        if (this.field8165 != null) {
            this.field8165.method2399(-21406);
        }
        ++field8016;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "()Z")
    public final boolean method173() {
        ++field8038;
        return false;
    }

    @OriginalMember(owner = "client!cf", name = "IA", descriptor = "(IIIIII[BII)V")
    public final void method76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field7971;
    }

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "()Lq;")
    public final class396 method168() {
        ++field7984;
        return new class391();
    }

    @OriginalMember(owner = "client!cf", name = "AA", descriptor = "(III[I)V")
    public final void method93(int arg0, int arg1, int arg2, int[] arg3) {
        ++field7992;
        float var5 = this.field8100.method2418((float) arg1, (float) arg0, (float) arg2, (byte) 104);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field8202;
            var7 = this.field8151;
        } else {
            var6 = (int) ((float) this.field8200 * this.field8100.method2407((float) arg0, (byte) 76, (float) arg1, (float) arg2) / var5);
            var7 = (int) ((float) this.field8140 * this.field8100.method2420((float) arg1, false, (float) arg2, (float) arg0) / var5);
        }
        arg3[0] = (int) ((float) var6 + -this.field8163);
        arg3[2] = (int) var5;
        arg3[1] = (int) ((float) var7 - this.field8191);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "()I")
    public final int method149() {
        ++field7983;
        return this.field8094 + this.field8088 + this.field8096;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II[I[I)Lua;")
    public final class619 method158(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field8018;
        return class79.method827(arg2, arg0, arg1, arg3, this, (byte) -128);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lfi;I)V")
    public final void method72(class518 arg0, int arg1) {
        this.field8196.method1983(arg1, -1, this, arg0);
        ++field8047;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ldaa;[Lvw;Z)Lla;")
    public final class421 method160(class11 arg0, class279[] arg1, boolean arg2) {
        ++field8037;
        return new class401(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)V")
    public final void method3225(boolean arg0, int arg1) {
        if (this.field8119 == !arg0) {
            this.field8119 = arg0;
            this.method2883((byte) -122);
        }
        ++field8084;
        int var3 = -11 % ((14 - arg1) / 59);
    }

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "(Z)V")
    public abstract void method2891(boolean arg0);

    @OriginalMember(owner = "client!cf", name = "da", descriptor = "(IIII)V")
    public final void method142(int arg0, int arg1, int arg2, int arg3) {
        ++field7979;
        if (~arg0 >= -1 && this.field8023 + -1 <= arg2 && arg1 <= 0 && ~(this.field7924 + -1) >= ~arg3) {
            this.method107();
        } else {
            this.field8134 = ~arg0 <= -1 ? arg0 : 0;
            this.field8175 = ~arg1 > -1 ? 0 : arg1;
            this.field8152 = ~arg3 >= ~this.field8023 ? arg3 : 0;
            this.field8132 = this.field8023 < arg2 ? 0 : arg2;
            if (!this.field8227) {
                this.field8227 = true;
                this.method2884((byte) -128);
            }
            this.method2841(8);
            this.method3193(1);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lq;)V")
    public final void method145(class396 arg0) {
        ++field8005;
        this.field8100 = (class391) arg0;
        this.field8102.method896(this.field8100);
        this.field8102.method2410((byte) -105);
        this.field8103.method2424(126, this.field8102);
        this.field8101.method2424(123, this.field8100);
        if (this.field8106.method959((byte) -80)) {
            this.method3238((byte) 82);
        }
    }

    @OriginalMember(owner = "client!cf", name = "JA", descriptor = "()V")
    public final void method107() {
        this.field8134 = 0;
        this.field8175 = 0;
        this.field8132 = this.field8023;
        this.field8152 = this.field7924;
        ++field7988;
        if (this.field8227) {
            this.field8227 = false;
            this.method2884((byte) -128);
        }
        this.method3193(1);
    }

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "(I)I")
    public final int method3226(int arg0) {
        if (arg0 != 0) {
            this.method2893(96);
        }
        ++field8078;
        return this.field8199;
    }

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "(I)V")
    public abstract void method2888(int arg0);

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "(B)V")
    public abstract void method2887(byte arg0);

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "(Z)V")
    private final void method3227(boolean arg0) {
        if (this.field8138 != null) {
            this.field8138.method1326((byte) -123);
        }
        ++field8034;
        this.method2891(arg0);
    }

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "(I)V")
    private final void method3228(int arg0) {
        if (!this.field8149) {
            float[] var2 = this.field8178;
            if (~this.field8023 != -1 && this.field7924 != 0) {
                var2[6] = 0.0F;
                var2[12] = -1.0F;
                var2[3] = 0.0F;
                var2[8] = 0.0F;
                var2[15] = 1.0F;
                var2[9] = 0.0F;
                var2[5] = -2.0F / (float) this.field7924;
                var2[10] = 0.5F;
                var2[11] = 0.0F;
                var2[0] = 2.0F / (float) this.field8023;
                var2[13] = 1.0F;
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[1] = 0.0F;
                var2[2] = 0.0F;
                var2[14] = 0.5F;
            } else {
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[9] = 0.0F;
                var2[8] = 0.0F;
                var2[13] = 0.0F;
                var2[7] = 0.0F;
                var2[0] = 1.0F;
                var2[15] = 1.0F;
                var2[14] = 0.0F;
                var2[2] = 0.0F;
                var2[11] = 0.0F;
                var2[3] = 0.0F;
                var2[4] = 0.0F;
                var2[10] = 1.0F;
                var2[12] = 0.0F;
                var2[5] = 1.0F;
            }
            this.field8149 = true;
        }
        if (arg0 <= -104) {
            ++field7919;
        }
    }

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "(B)V")
    public final void method3229(byte arg0) {
        if (arg0 == 20) {
            if (~this.field8112 != -17) {
                this.method3194((byte) -106);
                this.method3201((byte) -68, true);
                this.method3237((byte) -103, true);
                this.method3253(arg0 + -25313, true);
                this.method3248(arg0 + -23, 1);
                this.field8112 = 16;
            }
            ++field7948;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljs;)V")
    public final void method165(class304 arg0) {
        this.field8139 = (class165) arg0;
        ++field7960;
    }

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "(I)V")
    private final void method3230(int arg0) {
        ++field7941;
        if (this.field8112 != 1) {
            this.method3236(-75);
            this.method3201((byte) -68, false);
            this.method3268(false, (byte) 115);
            this.method3237((byte) -116, false);
            this.method3253(-25293, false);
            this.method3222(-2, (byte) -127, false, false);
            this.method3195(-12, 1);
            this.method3266(-2, this.field8174);
            this.field8112 = 1;
        }
        if (arg0 > -66) {
            this.field8173 = 76;
        }
    }

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)V")
    public void method122(int arg0) {
        ++field7956;
        if (this.field8165 != null) {
            this.field8165.method2398(true);
        }
        this.field8123 = Integer.MAX_VALUE & arg0;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method44(Canvas arg0) {
        ++field7925;
        Object var2 = null;
        if (arg0 != null && this.field7976 != arg0) {
            if (this.field7997.containsKey(arg0)) {
                var2 = this.field7997.get(arg0);
            }
        } else {
            var2 = this.field7922;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method2857(arg0, (byte) 56, var2);
            if (this.field8014 == arg0) {
                this.method3262(-3888);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILow;B)V")
    public final void method3231(int arg0, class319 arg1, byte arg2) {
        if (arg2 > -19) {
            this.method72((class518) null, -41);
        }
        this.method2845(arg1, 81, false, false, arg0);
        ++field8064;
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(II)Lne;")
    public class292 method2869(int arg0, int arg1) {
        ++field7940;
        if (arg0 != 7) {
            this.method59();
        }
        if (arg1 != 6) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    return arg1 == 7 ? new class48(this) : new class609(this);
                } else {
                    return new class63(this, this.field7955);
                }
            } else {
                return new class359(this);
            }
        } else {
            return new class546(this);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lcb;Lcb;B)V")
    public final void method3232(class483 arg0, class483 arg1, byte arg2) {
        ++field8089;
        if (arg2 > -88) {
            this.method3216(false);
        }
        boolean var4 = false;
        if (this.field8117[this.field8181] != arg0) {
            this.field8117[this.field8181] = arg0;
            var4 = true;
            this.method2870(0);
        }
        if (this.field8153[this.field8181] != arg1) {
            this.field8153[this.field8181] = arg1;
            var4 = true;
            this.method2900((byte) -42);
        }
        if (var4) {
            this.field8112 &= -30;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lvw;Z)Lf;")
    public final class702 method170(class279 arg0, boolean arg1) {
        ++field7964;
        class702 var9;
        if (~arg0.field4174 != -1 && ~arg0.field4171 != -1) {
            int[] var3 = new int[arg0.field4174 * arg0.field4171];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field4170 != null) {
                for (int var6 = 0; ~arg0.field4171 < ~var6; ++var6) {
                    for (int var7 = 0; arg0.field4174 > var7; ++var7) {
                        var3[var5++] = class2.method189(arg0.field4170[var4] << 24, arg0.field4169[class481.method2919(255, arg0.field4167[var4])]);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; ~var8 > ~arg0.field4171; ++var8) {
                    for (int var10 = 0; var10 < arg0.field4174; ++var10) {
                        int var11 = arg0.field4169[arg0.field4167[var4++] & 255];
                        var3[var5++] = ~var11 != -1 ? class2.method189(var11, -16777216) : 0;
                    }
                }
            }
            var9 = this.method54(var3, 0, arg0.field4174, arg0.field4174, arg0.field4171);
        } else {
            var9 = this.method54(new int[1], 0, 1, 1, 1);
        }
        var9.method1787(arg0.field4168, arg0.field4172, arg0.field4173, arg0.field4175);
        return var9;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZIIZI)V")
    private final void method3233(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field7959;
        boolean var7 = arg4 & this.method31();
        if (!var7 && (~arg2 == -5 || ~arg2 == -9 || arg2 == 9)) {
            arg2 = 2;
            arg5 = arg2 == 4 ? 1 & arg0 : 1;
            arg0 = 0;
        }
        if (arg2 != 0 && arg1) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field8148 != arg2) {
            if (this.field8148 != 0) {
                this.field8110[Integer.MAX_VALUE & this.field8148].method601(30);
            }
            if (~arg2 != -1) {
                this.field8138 = this.field8110[arg2 & Integer.MAX_VALUE];
                this.field8138.method599(arg1, (byte) -116);
                this.field8138.method602(arg1, (byte) 54);
                this.field8138.method600(arg0, arg3 + 2147483538, arg5);
            } else {
                this.field8138 = null;
            }
            this.field8148 = arg2;
            this.field8109 = arg0;
            this.field8177 = arg5;
        } else if (~this.field8148 != -1) {
            this.field8110[Integer.MAX_VALUE & this.field8148].method602(arg1, (byte) 54);
            if (~this.field8109 != ~arg0 || this.field8177 != arg5) {
                this.field8110[this.field8148 & Integer.MAX_VALUE].method600(arg0, 32, arg5);
                this.field8109 = arg0;
                this.field8177 = arg5;
            }
        }
        if (arg3 != Integer.MAX_VALUE) {
            this.field8190 = -1;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([IIIII)Lf;")
    public final class702 method54(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7969;
        return new class372(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method2874(int arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "()Z")
    public final boolean method114() {
        ++field7938;
        return true;
    }

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "(I)V")
    private final void method3234(int arg0) {
        if (arg0 <= 92) {
            this.method35(-88, -61);
        }
        ++field7942;
        if (!this.field8194) {
            float[] var2 = this.field8184;
            float var3 = (float) (-this.field8202 * this.field8135) / (float) this.field8200;
            float var4 = (float) ((-this.field8202 + this.field8023) * this.field8135) / (float) this.field8200;
            float var5 = (float) (this.field8151 * this.field8135) / (float) this.field8140;
            float var6 = (float) ((-this.field7924 + this.field8151) * this.field8135) / (float) this.field8140;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field8135 * 2.0F;
                var2[2] = 0.0F;
                var2[10] = this.field8147 = (float) this.field8120 / (float) (this.field8135 - this.field8120);
                var2[4] = 0.0F;
                var2[6] = 0.0F;
                var2[14] = this.field8180 = (float) (this.field8135 * this.field8120) / (float) (-this.field8120 + this.field8135);
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[3] = 0.0F;
                var2[7] = 0.0F;
                var2[13] = 0.0F;
                var2[1] = 0.0F;
                var2[0] = var7 / (-var3 + var4);
                var2[15] = 0.0F;
                var2[5] = var7 / (-var6 + var5);
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[12] = 0.0F;
                var2[11] = -1.0F;
            } else {
                var2[12] = 0.0F;
                var2[5] = 1.0F;
                var2[9] = 0.0F;
                var2[13] = 0.0F;
                var2[0] = 1.0F;
                var2[8] = 0.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[3] = 0.0F;
                var2[14] = 0.0F;
                var2[7] = 0.0F;
                var2[4] = 0.0F;
                var2[11] = 0.0F;
                var2[6] = 0.0F;
                var2[15] = 1.0F;
                var2[1] = 0.0F;
            }
            this.method3203((byte) 108);
            this.field8194 = true;
        }
    }

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "(I)I")
    public final int method3235(int arg0) {
        ++field8045;
        if (arg0 != 8) {
            this.field8220 = null;
        }
        return this.field8156;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(ZI)Lor;")
    public abstract class595 method2876(boolean arg0, int arg1);

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "(I)V")
    private final void method3236(int arg0) {
        if (class703.field9876 != this.field8106) {
            class103 var2 = this.field8106;
            this.field8106 = class703.field9876;
            if (var2.method959((byte) 43)) {
                this.method3238((byte) 83);
            }
            this.method3228(-125);
            this.field8168 = this.field8178;
            this.method3257(-114);
            this.field8112 &= -25;
        }
        ++field8087;
        if (arg0 > -14) {
            this.method84((class495) null);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBZLow;)V")
    public abstract void method2860(int arg0, byte arg1, boolean arg2, class319 arg3);

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "()Z")
    public final boolean method17() {
        ++field7947;
        return true;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(BZ)V")
    public final void method3237(byte arg0, boolean arg1) {
        if (this.field8172 != arg1) {
            this.field8172 = arg1;
            this.method2855(-1);
            this.field8112 &= -32;
        }
        ++field7935;
        if (arg0 > -67) {
            this.field8214 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "(B)V")
    private final void method3238(byte arg0) {
        int var2 = -31 / ((-28 - arg0) / 55);
        ++field8053;
        this.field8107 = false;
        if (this.field8138 != null) {
            this.field8138.method1323(true);
        }
        this.method2864(126);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public final void method146(int arg0) {
        ++field7928;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "(I)V")
    public final void method3239(int arg0) {
        ++field7932;
        this.field8091.method895();
        if (arg0 != 0) {
            this.field7924 = 82;
        }
        this.field8092 = true;
        this.method3254(false);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
    public final void method163(boolean arg0) {
        ++field8066;
    }

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "(Z)Lun;")
    public final class391 method3240(boolean arg0) {
        if (!arg0) {
            this.method131((int[]) null);
        }
        ++field7931;
        return this.field8193[this.field8181];
    }

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "(Z)V")
    public static void method3241(boolean arg0) {
        field8011 = null;
        if (!arg0) {
            field8011 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lnda;IIII)Lda;")
    public final class55 method37(class519 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8015;
        return new class13(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)V")
    public final void method3242(byte arg0, int arg1) {
        if (this.field8158 != arg1) {
            this.field8158 = arg1;
            this.method2894(0);
        }
        if (arg0 == -73) {
            ++field7961;
        }
    }

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "()V")
    public void method40() {
        ++field7917;
        if (!this.field8145) {
            for (class425 var1 = this.field8086.method1224(-2); var1 != null; var1 = this.field8086.method1232(-2)) {
                ((class32) var1).method511((byte) -113);
            }
            Enumeration var2 = this.field7997.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method2853(this.field7997.get(var3), var3, (byte) -75);
            }
            class543.method3130(true, false, 70);
            this.field7915.release();
            this.field8145 = true;
        }
    }

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "(B)V")
    private final void method3243(byte arg0) {
        if (arg0 <= 104) {
            this.method145((class396) null);
        }
        if (class157.field2687 != this.field8106) {
            class103 var2 = this.field8106;
            this.field8106 = class157.field2687;
            if (!var2.method959((byte) -103)) {
                this.method3238((byte) 66);
            }
            this.method3234(111);
            this.field8168 = this.field8184;
            this.method3257(-118);
            this.field8112 &= -8;
        }
        ++field8073;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Low;IZZI)V")
    public abstract void method2845(class319 arg0, int arg1, boolean arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)V")
    public final void method3244(int arg0, byte arg1) {
        if (arg0 == 1405835656) {
            this.method3242((byte) -73, arg1 << 8 | arg1 << 24 | arg1 << 16 | arg1);
            ++field7930;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)I")
    public final int method34(int arg0, int arg1) {
        ++field7939;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "(I)V")
    public final void method3245(int arg0) {
        ++field7975;
        Hashtable var2 = new Hashtable();
        if (arg0 == -27605) {
            if (this.field7997 != null && !this.field7997.isEmpty()) {
                Enumeration var3 = this.field7997.keys();
                while (var3.hasMoreElements()) {
                    Canvas var4 = (Canvas) var3.nextElement();
                    var2.put(var4, this.method2868((byte) 50, var4));
                }
            }
            this.field7997 = var2;
            this.method3207(arg0 + 27608);
            this.method3211((byte) 81);
            this.field8196.method1980((byte) -125, this);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIB)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method3246(boolean arg0, int arg1, byte arg2) {
        ++field7989;
        int var4 = -50 % ((arg2 - -27) / 38);
        return this.field8048.method3567(arg1, arg0);
    }

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "(B)V")
    public final void method3247(byte arg0) {
        ++field8056;
        this.method3217(-32);
        if (arg0 <= 77) {
            this.method3260((byte) -91);
        }
        this.method3257(-75);
    }

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "()V")
    public final void method59() {
        this.field8192 = false;
        ++field7913;
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(II)V")
    public final void method3248(int arg0, int arg1) {
        if (~this.field8183 != ~arg1) {
            boolean var3;
            boolean var4;
            class597 var5;
            if (arg1 == 1) {
                var3 = true;
                var4 = true;
                var5 = class199.field3097;
            } else if (~arg1 == -3) {
                var3 = false;
                var4 = true;
                var5 = class438.field6312;
            } else if (arg1 == 128) {
                var5 = class42.field1081;
                var3 = true;
                var4 = true;
            } else {
                var5 = class674.field9594;
                var4 = false;
                var3 = false;
            }
            if (!this.field8170 != !var3) {
                this.field8170 = var3;
                this.method2887((byte) -36);
            }
            if (var4 == !this.field8146) {
                this.field8146 = var4;
                this.method2865(true);
            }
            if (this.field8108 != var5) {
                this.field8108 = var5;
                this.method2895(false);
            }
            this.field8183 = arg1;
            this.field8112 &= -29;
        }
        ++field8076;
        if (arg0 != -3) {
            this.field8164 = 1.0361754F;
        }
    }

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "(I)V")
    private final void method3249(int arg0) {
        ++field8043;
        if (arg0 < 52) {
            this.field7920 = null;
        }
        this.field8149 = false;
        if (class703.field9876 == this.field8106) {
            this.method3228(-128);
            this.method3257(-128);
        }
    }

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "(Z)V")
    private final void method3250(boolean arg0) {
        if (arg0) {
            ++field8006;
            this.field8130 = false;
            this.method3215(-19963);
            if (class153.field2606 == this.field8106) {
                this.method3257(-101);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "()[I")
    public final int[] method109() {
        ++field7937;
        return new int[] { this.field8202, this.field8151, this.field8200, this.field8140 };
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([I)V")
    public final void method119(int[] arg0) {
        ++field8019;
        arg0[1] = this.field7924;
        arg0[0] = this.field8023;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIII)V")
    public final void method92(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7972;
    }

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "(I)V")
    public final void method3251(int arg0) {
        if (arg0 >= -4) {
            this.method48(-106);
        }
        if (~this.field8112 != -3) {
            this.method3236(-68);
            this.method3201((byte) -68, false);
            this.method3268(false, (byte) 115);
            this.method3237((byte) -119, false);
            this.method3253(-25293, false);
            this.method3222(-2, (byte) -115, false, false);
            this.field8112 = 2;
        }
        ++field7914;
    }

    @OriginalMember(owner = "client!cf", name = "GA", descriptor = "(II)V")
    public final void method11(int arg0, int arg1) {
        if (~this.field8135 != ~arg0 || ~this.field8120 != ~arg1) {
            this.field8120 = arg1;
            this.field8135 = arg0;
            this.method3205(14);
            this.method3250(true);
            this.method3227(true);
        }
        ++field8007;
    }

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "(B)Lun;")
    public final class391 method3252(byte arg0) {
        ++field8000;
        if (arg0 >= -31) {
            this.field7916 = 42;
        }
        return this.field8103;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(IZ)V")
    public final void method3253(int arg0, boolean arg1) {
        if (arg0 != -25293) {
            this.method178(-5, 9, -56, (int[]) null);
        }
        ++field7967;
        if (this.field8186 != arg1) {
            this.field8186 = arg1;
            this.method2854(2);
            this.field8112 &= -32;
        }
    }

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "(Z)V")
    private final void method3254(boolean arg0) {
        ++field7943;
        if (class703.field9876 == this.field8106) {
            float var2 = this.method2846(-15839);
            this.field8091.method2413(-105, var2, 0.0F, var2);
        }
        this.field8107 = arg0;
        this.method2892((byte) 68);
        if (this.field8138 != null) {
            this.field8138.method1325((byte) -119);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public final void method134(int arg0) {
        ++field7999;
    }

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "(B)V")
    public final void method3255(byte arg0) {
        ++field8033;
        this.field8153 = new class483[this.field8189];
        this.field8193 = new class391[this.field8189];
        this.field8136 = new class71[this.field8189];
        this.field8117 = new class483[this.field8189];
        this.field8115 = new class116[this.field8189];
        for (int var2 = 0; ~var2 > ~this.field8189; ++var2) {
            this.field8153[var2] = class509.field7205;
            this.field8117[var2] = class509.field7205;
            this.field8136[var2] = class496.field7062;
            this.field8193[var2] = new class391();
        }
        this.field8142 = new class9[this.field8185 + -2];
        this.field8174 = this.method2898((byte) 121, class121.field2214, class2.field372, 1, 1);
        this.method84(new class32(262144));
        this.field8212 = this.method2878(-98, new class30[] { new class30(new class14[] { class14.field731, class14.field735 }) });
        this.field8211 = this.method2878(-43, new class30[] { new class30(new class14[] { class14.field731, class14.field733 }) });
        this.field8220 = this.method2878(-98, new class30[] { new class30(class14.field731), new class30(class14.field733), new class30(class14.field735), new class30(class14.field732) });
        this.field8213 = this.method2878(-89, new class30[] { new class30(class14.field731), new class30(class14.field733), new class30(class14.field735) });
        this.field8216 = new class13(this, 0, 0, false, false);
        this.field8225 = new class13(this, 0, 0, true, true);
        this.field8206 = new class13(this, 0, 0, false, false);
        this.field8209 = new class13(this, 0, 0, true, true);
        this.field8222 = new class13(this, 0, 0, false, false);
        this.field8214 = new class13(this, 0, 0, true, true);
        this.field8219 = new class13(this, 0, 0, false, false);
        this.field8210 = new class13(this, 0, 0, true, true);
        this.field8208 = new class13(this, 0, 0, false, false);
        this.field8221 = new class13(this, 0, 0, true, true);
        this.field8196 = new class301(this);
        this.field8223 = this.method2876(true, 3);
        this.method3245(-27605);
        this.field7955 = new class504(this);
        this.field8110[1] = this.method2869(7, 1);
        this.field8110[2] = this.method2869(7, 2);
        this.field8110[4] = this.method2869(7, 4);
        this.field8110[5] = this.method2869(7, 5);
        this.field8110[6] = this.method2869(7, 6);
        this.field8110[7] = this.method2869(7, 7);
        this.field8110[3] = this.method2869(7, 3);
        this.field8110[8] = this.method2869(7, 8);
        this.field8110[9] = this.method2869(7, 9);
        if (!this.field8110[2].method604(24561)) {
            this.field8110[2] = this.method2869(7, 0);
        }
        if (!this.field8110[4].method604(24561)) {
            this.field8110[4] = this.field8110[2];
        }
        if (!this.field8110[8].method604(24561)) {
            this.field8110[8] = this.field8110[4];
        }
        if (!this.field8110[9].method604(24561)) {
            this.field8110[9] = this.field8110[8];
        }
        if (arg0 < 56) {
            this.method34(-66, 53);
        }
        this.method2852(-1);
        this.method107();
        this.method106();
    }

    @OriginalMember(owner = "client!cf", name = "BA", descriptor = "()I")
    public final int method66() {
        ++field7980;
        return this.field8135;
    }

    @OriginalMember(owner = "client!cf", name = "va", descriptor = "(I)V")
    public final void method48(int arg0) {
        ++field8057;
        this.field8144 = 0;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field8144;
        }
        this.field8116 = 1 << this.field8144;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(BI)Lor;")
    public final class595 method3256(byte arg0, int arg1) {
        if (arg0 != -33) {
            this.field8201 = true;
        }
        ++field8083;
        if (~this.field8223.method386(0) > ~(arg1 * 2)) {
            this.field8223.method380(arg1, (byte) -17);
        }
        return this.field8223;
    }

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "(IIIII)V")
    public final void method69(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method41(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        ++field7963;
    }

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "(I)V")
    private final void method3257(int arg0) {
        if (arg0 < -74) {
            ++field7994;
            this.method2881(true);
            if (this.field8138 != null) {
                this.field8138.method1322(0);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "(I)V")
    public abstract void method2849(int arg0);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIILpl;)V")
    public static final void method3258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class604 arg6) {
        if (arg0 != -9869) {
            method3189(-77, (class167) null);
        }
        ++field7944;
        class478.method2906(arg1, (byte) 64, arg6.field9806, arg6.field9814, arg6.field9815, arg3, arg2, arg5, arg4, 0);
    }

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "()Z")
    public final boolean method25() {
        ++field8025;
        return true;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[BIZLfda;I)Lhi;")
    public final class190 method3259(int arg0, byte[] arg1, int arg2, boolean arg3, class294 arg4, int arg5) {
        if (arg5 != 0) {
            this.field8180 = 1.5244154F;
        }
        ++field8065;
        return this.method2897(0, arg2, 0, arg4, arg3, arg1, (byte) 109, arg0);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Lro;Lfda;B)Z")
    public abstract boolean method2871(class2 arg0, class294 arg1, byte arg2);

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(IIIII)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7962;
    }

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "(B)V")
    public final void method3260(byte arg0) {
        this.field8092 = false;
        ++field7950;
        if (arg0 <= -117) {
            this.method3254(false);
        }
    }

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "()Z")
    public final boolean method171() {
        ++field8031;
        return true;
    }

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "()I")
    public final int method102() {
        ++field8035;
        return this.field8226;
    }

    @OriginalMember(owner = "client!cf", name = "FA", descriptor = "(ILua;II)V")
    public final void method120(int arg0, class619 arg1, int arg2, int arg3) {
        ++field8009;
        class520 var5 = (class520) arg1;
        class190 var6 = var5.field7368;
        this.method3251(-56);
        this.method3266(-2, var6);
        this.method3248(-3, 1);
        this.method3232(class525.field7399, class525.field7399, (byte) -122);
        this.method3231(0, class370.field5487, (byte) -114);
        this.method3242((byte) -73, arg0);
        this.field8091.method2421((byte) -98, 0.0F, (float) this.field8023, (float) this.field7924);
        this.method3260((byte) -125);
        this.field8193[0].method2421((byte) -86, 1.0F, var6.method467((float) this.field8023, -13359), var6.method471((float) this.field7924, 5235));
        this.field8193[0].method2413(-113, var6.method471((float) (-arg3), 5235), 0.0F, var6.method467((float) (-arg2), -13359));
        this.field8136[0] = class662.field9533;
        this.method3209(-128);
        this.method3218((byte) 45);
        this.method3220((byte) -67);
        this.method3231(0, class435.field6296, (byte) -84);
    }

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "(B)V")
    public static final void method3261(byte arg0) {
        ++field8022;
        if (arg0 > -82) {
            method3241(false);
        }
        if (!class233.method1571(class199.field3098, -113) && !class396.method2443(-10, class199.field3098)) {
            int var1 = class532.field7456.field8787[0] >> 3;
            int var2 = class532.field7456.field8785[0] >> 3;
            if (~var1 <= -1 && ~(class675.field9604 >> 3) < ~var1 && var2 >= 0 && ~(class218.field3316 >> 3) < ~var2) {
                class506.method3006(var2, 5000, 88, var1);
            } else {
                class506.method3006(class218.field3316 >> 4, 0, 127, class675.field9604 >> 4);
            }
        } else {
            class506.method3006(class537.field7518 >> 12, 5000, 115, class206.field3158 >> 12);
        }
        class574.method3297(7477);
        class590.method3366(1);
        class184.method1346(0);
        class435.method2640(-125);
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(BI)V")
    public abstract void method2886(byte arg0, int arg1);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[Lrk;)Lkr;")
    public abstract class693 method2878(int arg0, class30[] arg1);

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "(I)V")
    public abstract void method2854(int arg0);

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method23(Canvas arg0) {
        ++field8021;
        if (this.field7976 == arg0) {
            throw new RuntimeException();
        } else if (this.field7997.containsKey(arg0)) {
            this.method2853(this.field7997.get(arg0), arg0, (byte) -5);
            this.field7997.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "(I)V")
    private final void method3262(int arg0) {
        ++field7929;
        if (this.field8014 != null) {
            Dimension var2 = this.field8014.getSize();
            this.field8071 = var2.height;
            this.field7916 = var2.width;
        } else {
            this.field7916 = this.field8071 = 1;
        }
        if (arg0 != -3888) {
            this.method3232((class483) null, (class483) null, (byte) -100);
        }
        this.field7924 = this.field8071;
        this.field8023 = this.field7916;
        this.method3249(125);
        this.method3205(14);
        this.method3250(true);
        this.method2893(arg0 ^ -3886);
        this.method3193(1);
        this.method3217(-32);
        this.method107();
    }

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "(B)Lun;")
    public final class391 method3263(byte arg0) {
        ++field7987;
        int var2 = -67 / ((arg0 - -38) / 55);
        return this.field8193[this.field8181];
    }

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "()Z")
    public final boolean method74() {
        ++field7977;
        return true;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ltf;III)V")
    public abstract void method2859(class269 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lfi;)V")
    public final void method123(class518 arg0) {
        this.field8196.method1983(-1, -1, this, arg0);
        ++field7981;
    }

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "(IIIIII)V")
    public final void method4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8040;
        this.method3230(-107);
        this.method3242((byte) -73, arg4);
        this.method3231(0, class370.field5487, (byte) -56);
        this.method3224(0, (byte) -80, class370.field5487);
        this.method3248(-3, arg5);
        this.field8091.method2421((byte) 64, 1.0F, (float) arg2, (float) arg3);
        this.field8091.method891(arg0, arg1, 0);
        this.method3260((byte) -128);
        this.method2843(false, false);
        this.method3218((byte) 81);
        this.method2843(false, true);
        this.method3224(0, (byte) -80, class435.field6296);
        this.method3231(0, class435.field6296, (byte) -65);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([FB)[F")
    public final float[] method3264(float[] arg0, byte arg1) {
        arg0[12] = this.field8168[3];
        arg0[4] = this.field8168[1];
        ++field7952;
        arg0[8] = this.field8168[2];
        arg0[0] = this.field8168[0];
        arg0[13] = this.field8168[7];
        arg0[2] = this.field8168[8];
        arg0[5] = this.field8168[5];
        arg0[9] = this.field8168[6];
        arg0[1] = this.field8168[4];
        arg0[10] = this.field8168[10];
        arg0[6] = this.field8168[9];
        arg0[14] = this.field8168[11];
        if (arg1 < 20) {
            this.method3216(true);
        }
        arg0[3] = this.field8168[12];
        arg0[7] = this.field8168[13];
        arg0[15] = this.field8168[15];
        arg0[11] = this.field8168[14];
        return arg0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLjv;)V")
    public final void method3265(byte arg0, class71 arg1) {
        ++field7954;
        this.field8136[this.field8181] = arg1;
        this.method3209(-127);
        if (arg0 != -88) {
            this.field8014 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Le;)V")
    public final void method84(class495 arg0) {
        ++field8039;
        this.field8048 = ((class32) arg0).field955;
        this.field7920 = this.field8048.method3567(32768, false);
    }

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "()I")
    public final int method86() {
        ++field8044;
        return this.field8120;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZ)Lf;")
    public final class702 method186(int arg0, int arg1, boolean arg2) {
        ++field7995;
        return new class372(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLsh;)V")
    public abstract void method2858(byte arg0, class62 arg1);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILhw;)V")
    public final void method3266(int arg0, class116 arg1) {
        ++field7953;
        if (this.field8115[this.field8181] != arg1) {
            this.field8115[this.field8181] = arg1;
            if (arg1 == null) {
                this.method2877((byte) 29);
            } else {
                arg1.method773(-23993);
            }
            this.field8112 &= -2;
        }
        if (arg0 != -2) {
            this.method3249(-31);
        }
    }

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "(Z)V")
    public final void method3267(boolean arg0) {
        ++field8028;
        Enumeration var2 = this.field7997.keys();
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method2853(this.field7997.get(var3), var3, (byte) 119);
        }
        this.field8217.method382((byte) 84);
        this.field8215.method382((byte) 76);
        this.field8225.method353(2);
        if (!arg0) {
            this.field8209.method353(2);
            this.field8214.method353(2);
            this.field8210.method353(2);
            this.field8221.method353(2);
            this.field8196.method1988((byte) 104);
            this.field8223.method382((byte) 71);
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
    public final void method64(int arg0) {
        ++field8068;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method46(Canvas arg0) {
        ++field8052;
        if (this.field7976 == arg0) {
            throw new RuntimeException();
        } else if (!this.field7997.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method2868((byte) 50, arg0);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field7997.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "(Z)V")
    public void method2875(boolean arg0) {
        this.field8179 = this.field8197;
        ++field8024;
        if (!arg0) {
            this.method2869(-88, 86);
        }
        this.field8197 = 0;
    }

    @OriginalMember(owner = "client!cf", name = "la", descriptor = "(IIII)V")
    public final void method62(int arg0, int arg1, int arg2, int arg3) {
        this.field8202 = arg0;
        ++field8097;
        this.field8140 = arg3;
        this.field8151 = arg1;
        this.field8200 = arg2;
        this.method3250(true);
        this.method3205(14);
        this.method3217(-32);
        this.method3193(1);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZB)V")
    public final void method3268(boolean arg0, byte arg1) {
        if (!this.field8182 == arg0) {
            this.field8182 = arg0;
            this.method2885(-124);
            this.field8112 &= -8;
        }
        if (arg1 != 115) {
            this.field8135 = -126;
        }
        ++field8055;
    }

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "(Z)Lpu;")
    public final class524 method3269(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            ++field8004;
            return this.field8139 != null ? this.field8139.method1016((byte) -122) : null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[IBZI)Lhi;")
    public final class190 method3270(int arg0, int[] arg1, byte arg2, boolean arg3, int arg4) {
        if (arg2 != 50) {
            this.method3267(true);
        }
        ++field8077;
        return this.method2861(0, arg0, arg2 + -42, arg4, arg3, arg1, 0);
    }

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "(IIIIII)Z")
    public final boolean method33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8036;
        float var7 = this.field8100.method2418((float) arg1, (float) arg0, (float) arg2, (byte) 104);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field8100.method2418((float) arg4, (float) arg3, (float) arg5, (byte) 104);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field8135 > var7) || !(var8 < (float) this.field8135)) && (!((float) this.field8120 < var7) || !((float) this.field8120 < var8))) {
            int var9 = (int) ((float) this.field8200 * this.field8100.method2407((float) arg0, (byte) 103, (float) arg1, (float) arg2) / var7);
            int var10 = (int) ((float) this.field8200 * this.field8100.method2407((float) arg3, (byte) 88, (float) arg4, (float) arg5) / var8);
            if (this.field8163 > (float) var9 && (float) var10 < this.field8163 || this.field8126 < (float) var9 && this.field8126 < (float) var10) {
                return false;
            } else {
                int var11 = (int) ((float) this.field8140 * this.field8100.method2420((float) arg1, false, (float) arg2, (float) arg0) / var7);
                int var12 = (int) ((float) this.field8140 * this.field8100.method2420((float) arg4, false, (float) arg5, (float) arg3) / var8);
                return (!((float) var11 < this.field8191) || !((float) var12 < this.field8191)) && (!((float) var11 > this.field8141) || !(this.field8141 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "()Z")
    public final boolean method98() {
        ++field8017;
        return false;
    }

    @OriginalMember(owner = "client!cf", name = "VA", descriptor = "(IFFFFF)V")
    public final void method95(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field7986;
        boolean var7 = this.field8176 != arg0;
        if (var7 || this.field8198 != arg1 || this.field8164 != arg2) {
            this.field8164 = arg2;
            this.field8176 = arg0;
            this.field8198 = arg1;
            if (var7) {
                this.field8162 = (float) (16711680 & this.field8176) / 1.671168E7F;
                this.field8133 = (float) (this.field8176 & 255) / 255.0F;
                this.field8159 = (float) (65280 & this.field8176) / 65280.0F;
                this.method2890(92);
            }
            this.field7915.setSunColour(this.field8162, this.field8159, this.field8133, arg1, arg2);
            this.method2867((byte) 127);
        }
        if (this.field8195[0] != arg3 || this.field8195[1] != arg4 || this.field8195[2] != arg5) {
            this.field8195[1] = arg4;
            this.field8195[0] = arg3;
            this.field8195[2] = arg5;
            this.field8167[0] = -arg3;
            this.field8167[1] = -arg4;
            this.field8167[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field8105[0] = arg3 * var8;
            this.field8105[2] = arg5 * var8;
            this.field8105[1] = arg4 * var8;
            this.field8143[2] = -this.field8105[2];
            this.field8143[0] = -this.field8105[0];
            this.field8143[1] = -this.field8105[1];
            this.field7915.setSunDirection(this.field8105[0], this.field8105[1], this.field8105[2]);
            this.method2850((byte) 108);
            this.field8127 = (int) (arg5 * 256.0F / arg4);
            this.field8128 = (int) (arg3 * 256.0F / arg4);
        }
        this.method2899(11160);
    }
}
