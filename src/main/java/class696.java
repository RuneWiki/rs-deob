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

@OriginalClass("client!gd")
public abstract class class696 extends class570 {

    @OriginalMember(owner = "client!gd", name = "Sb", descriptor = "Lfca;")
    private class661 field8993 = new class661();

    @OriginalMember(owner = "client!gd", name = "ae", descriptor = "Z")
    public boolean field9105 = true;

    @OriginalMember(owner = "client!gd", name = "de", descriptor = "Loga;")
    public class588 field9108 = new class588();

    @OriginalMember(owner = "client!gd", name = "he", descriptor = "Loga;")
    public class588 field9112 = new class588();

    @OriginalMember(owner = "client!gd", name = "ie", descriptor = "Loga;")
    public class588 field9113 = new class588();

    @OriginalMember(owner = "client!gd", name = "je", descriptor = "Loga;")
    public class588 field9114 = new class588();

    @OriginalMember(owner = "client!gd", name = "ke", descriptor = "Loga;")
    private class588 field9115 = new class588();

    @OriginalMember(owner = "client!gd", name = "le", descriptor = "Loga;")
    private class588 field9116 = new class588();

    @OriginalMember(owner = "client!gd", name = "me", descriptor = "[F")
    private float[] field9117 = new float[16];

    @OriginalMember(owner = "client!gd", name = "Ke", descriptor = "I")
    public int field9141 = -1;

    @OriginalMember(owner = "client!gd", name = "Re", descriptor = "I")
    private int field9148 = -1;

    @OriginalMember(owner = "client!gd", name = "Ve", descriptor = "Z")
    public boolean field9152 = true;

    @OriginalMember(owner = "client!gd", name = "We", descriptor = "F")
    private float field9153 = 1.0F;

    @OriginalMember(owner = "client!gd", name = "Pe", descriptor = "I")
    public int field9146 = 0;

    @OriginalMember(owner = "client!gd", name = "ne", descriptor = "Z")
    private boolean field9118 = false;

    @OriginalMember(owner = "client!gd", name = "Le", descriptor = "Z")
    private boolean field9142 = false;

    @OriginalMember(owner = "client!gd", name = "De", descriptor = "Z")
    public boolean field9134 = false;

    @OriginalMember(owner = "client!gd", name = "Oe", descriptor = "I")
    private int field9145 = -1;

    @OriginalMember(owner = "client!gd", name = "se", descriptor = "I")
    public int field9123 = 0;

    @OriginalMember(owner = "client!gd", name = "te", descriptor = "[F")
    private float[] field9124 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!gd", name = "Qe", descriptor = "I")
    public int field9147 = 0;

    @OriginalMember(owner = "client!gd", name = "Xe", descriptor = "F")
    public float field9154 = -1.0F;

    @OriginalMember(owner = "client!gd", name = "Ie", descriptor = "I")
    public int field9139 = 8;

    @OriginalMember(owner = "client!gd", name = "we", descriptor = "I")
    public int field9127 = 0;

    @OriginalMember(owner = "client!gd", name = "ze", descriptor = "Z")
    public boolean field9130 = true;

    @OriginalMember(owner = "client!gd", name = "He", descriptor = "I")
    public int field9138 = 128;

    @OriginalMember(owner = "client!gd", name = "ef", descriptor = "Z")
    private boolean field9161 = false;

    @OriginalMember(owner = "client!gd", name = "gf", descriptor = "Z")
    public boolean field9163 = false;

    @OriginalMember(owner = "client!gd", name = "hf", descriptor = "I")
    private int field9164 = -1;

    @OriginalMember(owner = "client!gd", name = "ye", descriptor = "I")
    public int field9129 = 0;

    @OriginalMember(owner = "client!gd", name = "Se", descriptor = "I")
    private int field9149 = 0;

    @OriginalMember(owner = "client!gd", name = "jf", descriptor = "Z")
    private boolean field9165 = false;

    @OriginalMember(owner = "client!gd", name = "Me", descriptor = "F")
    public float field9143 = 1.0F;

    @OriginalMember(owner = "client!gd", name = "kf", descriptor = "F")
    public float field9166 = 3584.0F;

    @OriginalMember(owner = "client!gd", name = "Ne", descriptor = "I")
    public int field9144 = 0;

    @OriginalMember(owner = "client!gd", name = "yf", descriptor = "Z")
    public boolean field9180 = true;

    @OriginalMember(owner = "client!gd", name = "af", descriptor = "I")
    private int field9157 = 0;

    @OriginalMember(owner = "client!gd", name = "pf", descriptor = "Z")
    private boolean field9171 = false;

    @OriginalMember(owner = "client!gd", name = "tf", descriptor = "[F")
    public float[] field9175 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!gd", name = "re", descriptor = "F")
    public float field9122 = 3584.0F;

    @OriginalMember(owner = "client!gd", name = "Ee", descriptor = "I")
    public int field9135 = 50;

    @OriginalMember(owner = "client!gd", name = "zf", descriptor = "I")
    public int field9181 = 0;

    @OriginalMember(owner = "client!gd", name = "Gf", descriptor = "F")
    public float field9188 = 1.0F;

    @OriginalMember(owner = "client!gd", name = "xf", descriptor = "F")
    public float field9179 = 1.0F;

    @OriginalMember(owner = "client!gd", name = "Bf", descriptor = "I")
    public int field9183 = -1;

    @OriginalMember(owner = "client!gd", name = "df", descriptor = "[F")
    private float[] field9160 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!gd", name = "vf", descriptor = "I")
    public int field9177 = 0;

    @OriginalMember(owner = "client!gd", name = "mf", descriptor = "I")
    public int field9168 = 512;

    @OriginalMember(owner = "client!gd", name = "of", descriptor = "I")
    public int field9170 = 3584;

    @OriginalMember(owner = "client!gd", name = "sf", descriptor = "Z")
    public boolean field9174 = false;

    @OriginalMember(owner = "client!gd", name = "Mf", descriptor = "I")
    private int field9194 = 16777215;

    @OriginalMember(owner = "client!gd", name = "qf", descriptor = "Z")
    public boolean field9172 = false;

    @OriginalMember(owner = "client!gd", name = "Rf", descriptor = "I")
    private int field9199 = 0;

    @OriginalMember(owner = "client!gd", name = "Af", descriptor = "[F")
    private float[] field9182 = new float[16];

    @OriginalMember(owner = "client!gd", name = "Tf", descriptor = "I")
    public int field9201 = 3;

    @OriginalMember(owner = "client!gd", name = "nf", descriptor = "I")
    public int field9169 = 512;

    @OriginalMember(owner = "client!gd", name = "Ze", descriptor = "Z")
    public boolean field9156 = true;

    @OriginalMember(owner = "client!gd", name = "rf", descriptor = "F")
    public float field9173 = -1.0F;

    @OriginalMember(owner = "client!gd", name = "Of", descriptor = "I")
    private int field9196 = 0;

    @OriginalMember(owner = "client!gd", name = "Lf", descriptor = "[Ltu;")
    private class499[] field9193 = new class499[10];

    @OriginalMember(owner = "client!gd", name = "Cf", descriptor = "I")
    public int field9184 = 0;

    @OriginalMember(owner = "client!gd", name = "ag", descriptor = "Lmw;")
    public class687 field9208 = class272.field3571;

    @OriginalMember(owner = "client!gd", name = "Yf", descriptor = "I")
    private int field9206 = 1;

    @OriginalMember(owner = "client!gd", name = "Jf", descriptor = "Z")
    private boolean field9191 = false;

    @OriginalMember(owner = "client!gd", name = "Vf", descriptor = "[F")
    public float[] field9203 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!gd", name = "Xf", descriptor = "Z")
    public boolean field9205 = true;

    @OriginalMember(owner = "client!gd", name = "dg", descriptor = "Ljaa;")
    public class779 field9211 = class687.field8844;

    @OriginalMember(owner = "client!gd", name = "ig", descriptor = "[F")
    private float[] field9216 = new float[16];

    @OriginalMember(owner = "client!gd", name = "fg", descriptor = "F")
    public float field9213 = 1.0F;

    @OriginalMember(owner = "client!gd", name = "jg", descriptor = "I")
    public int field9217 = 0;

    @OriginalMember(owner = "client!gd", name = "gg", descriptor = "[F")
    private float[] field9214 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!gd", name = "Ge", descriptor = "[F")
    public float[] field9137 = this.field9214;

    @OriginalMember(owner = "client!gd", name = "Te", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9150 = new Stream();

    @OriginalMember(owner = "client!gd", name = "pg", descriptor = "Loga;")
    private class588 field9223 = new class588();

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Ljava/awt/Canvas;")
    public Canvas field8919;

    @OriginalMember(owner = "client!gd", name = "ed", descriptor = "Ljava/awt/Canvas;")
    private Canvas field9057;

    @OriginalMember(owner = "client!gd", name = "Fe", descriptor = "I")
    public int field9136;

    @OriginalMember(owner = "client!gd", name = "Eb", descriptor = "Ljava/lang/Object;")
    public Object field8979;

    @OriginalMember(owner = "client!gd", name = "fc", descriptor = "Ljava/lang/Object;")
    private Object field9006;

    @OriginalMember(owner = "client!gd", name = "Fb", descriptor = "Lwm;")
    public class30 field8980;

    @OriginalMember(owner = "client!gd", name = "Qc", descriptor = "I")
    private int field9043;

    @OriginalMember(owner = "client!gd", name = "Sd", descriptor = "I")
    public int field9097;

    @OriginalMember(owner = "client!gd", name = "qd", descriptor = "I")
    private int field9069;

    @OriginalMember(owner = "client!gd", name = "Xb", descriptor = "I")
    public int field8998;

    @OriginalMember(owner = "client!gd", name = "Ye", descriptor = "I")
    public int field9155;

    @OriginalMember(owner = "client!gd", name = "Df", descriptor = "Lwf;")
    private class113 field9185;

    @OriginalMember(owner = "client!gd", name = "Kb", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field8985;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "[[B")
    public static byte[][] field8945 = new byte[250][];

    @OriginalMember(owner = "client!gd", name = "pe", descriptor = "F")
    public float field9120;

    @OriginalMember(owner = "client!gd", name = "bf", descriptor = "F")
    public float field9158;

    @OriginalMember(owner = "client!gd", name = "cf", descriptor = "F")
    public float field9159;

    @OriginalMember(owner = "client!gd", name = "uf", descriptor = "F")
    public float field9176;

    @OriginalMember(owner = "client!gd", name = "Hf", descriptor = "F")
    private float field9189;

    @OriginalMember(owner = "client!gd", name = "Pf", descriptor = "F")
    public float field9197;

    @OriginalMember(owner = "client!gd", name = "Qf", descriptor = "F")
    public float field9198;

    @OriginalMember(owner = "client!gd", name = "Sf", descriptor = "F")
    private float field9200;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field8920;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field8921;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field8925;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public static int field8926;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public static int field8927;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field8929;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public static int field8932;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
    public static int field8933;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public static int field8934;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public static int field8939;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    public static int field8940;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    public static int field8941;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "I")
    public static int field8944;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
    public static int field8946;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "I")
    public static int field8947;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "I")
    public static int field8948;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "I")
    public static int field8950;

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "I")
    public static int field8951;

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
    public static int field8952;

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "I")
    public static int field8954;

    @OriginalMember(owner = "client!gd", name = "gb", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!gd", name = "hb", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!gd", name = "ib", descriptor = "I")
    public static int field8957;

    @OriginalMember(owner = "client!gd", name = "jb", descriptor = "I")
    public static int field8958;

    @OriginalMember(owner = "client!gd", name = "kb", descriptor = "I")
    public static int field8959;

    @OriginalMember(owner = "client!gd", name = "lb", descriptor = "I")
    public static int field8960;

    @OriginalMember(owner = "client!gd", name = "mb", descriptor = "I")
    public static int field8961;

    @OriginalMember(owner = "client!gd", name = "nb", descriptor = "I")
    public static int field8962;

    @OriginalMember(owner = "client!gd", name = "ob", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!gd", name = "pb", descriptor = "I")
    public static int field8964;

    @OriginalMember(owner = "client!gd", name = "qb", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!gd", name = "rb", descriptor = "I")
    public static int field8966;

    @OriginalMember(owner = "client!gd", name = "sb", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!gd", name = "ub", descriptor = "I")
    public static int field8969;

    @OriginalMember(owner = "client!gd", name = "vb", descriptor = "I")
    public static int field8970;

    @OriginalMember(owner = "client!gd", name = "wb", descriptor = "I")
    public static int field8971;

    @OriginalMember(owner = "client!gd", name = "xb", descriptor = "I")
    public static int field8972;

    @OriginalMember(owner = "client!gd", name = "yb", descriptor = "I")
    public static int field8973;

    @OriginalMember(owner = "client!gd", name = "zb", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!gd", name = "Bb", descriptor = "I")
    public static int field8976;

    @OriginalMember(owner = "client!gd", name = "Cb", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!gd", name = "Db", descriptor = "I")
    public static int field8978;

    @OriginalMember(owner = "client!gd", name = "Gb", descriptor = "I")
    public static int field8981;

    @OriginalMember(owner = "client!gd", name = "Hb", descriptor = "I")
    public static int field8982;

    @OriginalMember(owner = "client!gd", name = "Ib", descriptor = "I")
    public static int field8983;

    @OriginalMember(owner = "client!gd", name = "Jb", descriptor = "I")
    public static int field8984;

    @OriginalMember(owner = "client!gd", name = "Lb", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!gd", name = "Mb", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!gd", name = "Nb", descriptor = "I")
    public static int field8988;

    @OriginalMember(owner = "client!gd", name = "Ob", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!gd", name = "Pb", descriptor = "I")
    public static int field8990;

    @OriginalMember(owner = "client!gd", name = "Qb", descriptor = "I")
    public static int field8991;

    @OriginalMember(owner = "client!gd", name = "Rb", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!gd", name = "Tb", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!gd", name = "Ub", descriptor = "I")
    public static int field8995;

    @OriginalMember(owner = "client!gd", name = "Vb", descriptor = "I")
    public static int field8996;

    @OriginalMember(owner = "client!gd", name = "Wb", descriptor = "I")
    public static int field8997;

    @OriginalMember(owner = "client!gd", name = "Yb", descriptor = "I")
    public static int field8999;

    @OriginalMember(owner = "client!gd", name = "Zb", descriptor = "I")
    public static int field9000;

    @OriginalMember(owner = "client!gd", name = "ac", descriptor = "I")
    public static int field9001;

    @OriginalMember(owner = "client!gd", name = "bc", descriptor = "I")
    public static int field9002;

    @OriginalMember(owner = "client!gd", name = "cc", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!gd", name = "dc", descriptor = "I")
    public static int field9004;

    @OriginalMember(owner = "client!gd", name = "ec", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!gd", name = "gc", descriptor = "I")
    public static int field9007;

    @OriginalMember(owner = "client!gd", name = "hc", descriptor = "I")
    public static int field9008;

    @OriginalMember(owner = "client!gd", name = "ic", descriptor = "I")
    public static int field9009;

    @OriginalMember(owner = "client!gd", name = "jc", descriptor = "I")
    public static int field9010;

    @OriginalMember(owner = "client!gd", name = "kc", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!gd", name = "lc", descriptor = "I")
    public static int field9012;

    @OriginalMember(owner = "client!gd", name = "mc", descriptor = "I")
    public static int field9013;

    @OriginalMember(owner = "client!gd", name = "nc", descriptor = "I")
    public static int field9014;

    @OriginalMember(owner = "client!gd", name = "oc", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!gd", name = "pc", descriptor = "I")
    public static int field9016;

    @OriginalMember(owner = "client!gd", name = "qc", descriptor = "I")
    public static int field9017;

    @OriginalMember(owner = "client!gd", name = "rc", descriptor = "I")
    public static int field9018;

    @OriginalMember(owner = "client!gd", name = "sc", descriptor = "I")
    public static int field9019;

    @OriginalMember(owner = "client!gd", name = "tc", descriptor = "I")
    public static int field9020;

    @OriginalMember(owner = "client!gd", name = "uc", descriptor = "I")
    public static int field9021;

    @OriginalMember(owner = "client!gd", name = "wc", descriptor = "I")
    public static int field9023;

    @OriginalMember(owner = "client!gd", name = "xc", descriptor = "I")
    public static int field9024;

    @OriginalMember(owner = "client!gd", name = "yc", descriptor = "I")
    public static int field9025;

    @OriginalMember(owner = "client!gd", name = "zc", descriptor = "I")
    public static int field9026;

    @OriginalMember(owner = "client!gd", name = "Ac", descriptor = "I")
    public static int field9027;

    @OriginalMember(owner = "client!gd", name = "Bc", descriptor = "I")
    public static int field9028;

    @OriginalMember(owner = "client!gd", name = "Cc", descriptor = "I")
    public static int field9029;

    @OriginalMember(owner = "client!gd", name = "Dc", descriptor = "I")
    public static int field9030;

    @OriginalMember(owner = "client!gd", name = "Ec", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!gd", name = "Fc", descriptor = "I")
    public static int field9032;

    @OriginalMember(owner = "client!gd", name = "Gc", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!gd", name = "Hc", descriptor = "I")
    public static int field9034;

    @OriginalMember(owner = "client!gd", name = "Ic", descriptor = "I")
    public static int field9035;

    @OriginalMember(owner = "client!gd", name = "Jc", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!gd", name = "Kc", descriptor = "I")
    public static int field9037;

    @OriginalMember(owner = "client!gd", name = "Lc", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!gd", name = "Mc", descriptor = "I")
    public static int field9039;

    @OriginalMember(owner = "client!gd", name = "Nc", descriptor = "I")
    public static int field9040;

    @OriginalMember(owner = "client!gd", name = "Oc", descriptor = "I")
    public static int field9041;

    @OriginalMember(owner = "client!gd", name = "Pc", descriptor = "I")
    public static int field9042;

    @OriginalMember(owner = "client!gd", name = "Rc", descriptor = "I")
    public static int field9044;

    @OriginalMember(owner = "client!gd", name = "Sc", descriptor = "I")
    public static int field9045;

    @OriginalMember(owner = "client!gd", name = "Tc", descriptor = "I")
    public static int field9046;

    @OriginalMember(owner = "client!gd", name = "Uc", descriptor = "I")
    public static int field9047;

    @OriginalMember(owner = "client!gd", name = "Vc", descriptor = "I")
    public static int field9048;

    @OriginalMember(owner = "client!gd", name = "Wc", descriptor = "I")
    public static int field9049;

    @OriginalMember(owner = "client!gd", name = "Xc", descriptor = "I")
    public static int field9050;

    @OriginalMember(owner = "client!gd", name = "Yc", descriptor = "I")
    public static int field9051;

    @OriginalMember(owner = "client!gd", name = "Zc", descriptor = "I")
    public static int field9052;

    @OriginalMember(owner = "client!gd", name = "ad", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!gd", name = "bd", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!gd", name = "cd", descriptor = "I")
    public static int field9055;

    @OriginalMember(owner = "client!gd", name = "dd", descriptor = "I")
    public static int field9056;

    @OriginalMember(owner = "client!gd", name = "fd", descriptor = "I")
    public static int field9058;

    @OriginalMember(owner = "client!gd", name = "gd", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!gd", name = "hd", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!gd", name = "id", descriptor = "I")
    public static int field9061;

    @OriginalMember(owner = "client!gd", name = "jd", descriptor = "I")
    public static int field9062;

    @OriginalMember(owner = "client!gd", name = "kd", descriptor = "I")
    public static int field9063;

    @OriginalMember(owner = "client!gd", name = "ld", descriptor = "I")
    public static int field9064;

    @OriginalMember(owner = "client!gd", name = "md", descriptor = "I")
    public static int field9065;

    @OriginalMember(owner = "client!gd", name = "nd", descriptor = "I")
    public static int field9066;

    @OriginalMember(owner = "client!gd", name = "od", descriptor = "I")
    public static int field9067;

    @OriginalMember(owner = "client!gd", name = "pd", descriptor = "I")
    public static int field9068;

    @OriginalMember(owner = "client!gd", name = "rd", descriptor = "I")
    public static int field9070;

    @OriginalMember(owner = "client!gd", name = "sd", descriptor = "I")
    public static int field9071;

    @OriginalMember(owner = "client!gd", name = "td", descriptor = "I")
    public static int field9072;

    @OriginalMember(owner = "client!gd", name = "ud", descriptor = "I")
    public static int field9073;

    @OriginalMember(owner = "client!gd", name = "vd", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!gd", name = "wd", descriptor = "I")
    public static int field9075;

    @OriginalMember(owner = "client!gd", name = "xd", descriptor = "I")
    public static int field9076;

    @OriginalMember(owner = "client!gd", name = "yd", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!gd", name = "zd", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!gd", name = "Ad", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!gd", name = "Bd", descriptor = "I")
    public static int field9080;

    @OriginalMember(owner = "client!gd", name = "Cd", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!gd", name = "Dd", descriptor = "I")
    public static int field9082;

    @OriginalMember(owner = "client!gd", name = "Ed", descriptor = "I")
    public static int field9083;

    @OriginalMember(owner = "client!gd", name = "Fd", descriptor = "I")
    public static int field9084;

    @OriginalMember(owner = "client!gd", name = "Gd", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!gd", name = "Hd", descriptor = "I")
    public static int field9086;

    @OriginalMember(owner = "client!gd", name = "Id", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!gd", name = "Jd", descriptor = "I")
    public static int field9088;

    @OriginalMember(owner = "client!gd", name = "Kd", descriptor = "I")
    public static int field9089;

    @OriginalMember(owner = "client!gd", name = "Ld", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!gd", name = "Md", descriptor = "I")
    public static int field9091;

    @OriginalMember(owner = "client!gd", name = "Nd", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!gd", name = "Od", descriptor = "I")
    public static int field9093;

    @OriginalMember(owner = "client!gd", name = "Pd", descriptor = "I")
    public static int field9094;

    @OriginalMember(owner = "client!gd", name = "Qd", descriptor = "I")
    public static int field9095;

    @OriginalMember(owner = "client!gd", name = "Rd", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!gd", name = "Td", descriptor = "I")
    public static int field9098;

    @OriginalMember(owner = "client!gd", name = "Ud", descriptor = "I")
    public static int field9099;

    @OriginalMember(owner = "client!gd", name = "Vd", descriptor = "I")
    public static int field9100;

    @OriginalMember(owner = "client!gd", name = "Wd", descriptor = "I")
    public static int field9101;

    @OriginalMember(owner = "client!gd", name = "Xd", descriptor = "I")
    public static int field9102;

    @OriginalMember(owner = "client!gd", name = "Yd", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!gd", name = "Zd", descriptor = "I")
    public int field9104;

    @OriginalMember(owner = "client!gd", name = "be", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!gd", name = "ce", descriptor = "I")
    public int field9107;

    @OriginalMember(owner = "client!gd", name = "ee", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!gd", name = "fe", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!gd", name = "ge", descriptor = "I")
    public int field9111;

    @OriginalMember(owner = "client!gd", name = "qe", descriptor = "I")
    public int field9121;

    @OriginalMember(owner = "client!gd", name = "ve", descriptor = "I")
    public int field9126;

    @OriginalMember(owner = "client!gd", name = "Ae", descriptor = "I")
    private int field9131;

    @OriginalMember(owner = "client!gd", name = "Be", descriptor = "I")
    public int field9132;

    @OriginalMember(owner = "client!gd", name = "ff", descriptor = "I")
    private int field9162;

    @OriginalMember(owner = "client!gd", name = "lf", descriptor = "I")
    public int field9167;

    @OriginalMember(owner = "client!gd", name = "Ff", descriptor = "I")
    public int field9187;

    @OriginalMember(owner = "client!gd", name = "Kf", descriptor = "I")
    public int field9192;

    @OriginalMember(owner = "client!gd", name = "bg", descriptor = "I")
    public int field9209;

    @OriginalMember(owner = "client!gd", name = "eg", descriptor = "I")
    public int field9212;

    @OriginalMember(owner = "client!gd", name = "Hg", descriptor = "I")
    private int field9241;

    @OriginalMember(owner = "client!gd", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!gd", name = "xe", descriptor = "Lsfa;")
    public class132 field9128;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Ljga;")
    public class135 field8918;

    @OriginalMember(owner = "client!gd", name = "ng", descriptor = "Lcq;")
    private class233 field9221;

    @OriginalMember(owner = "client!gd", name = "rg", descriptor = "Lcq;")
    private class233 field9225;

    @OriginalMember(owner = "client!gd", name = "Eg", descriptor = "Lcq;")
    private class233 field9238;

    @OriginalMember(owner = "client!gd", name = "lg", descriptor = "Lhq;")
    public class385 field9219;

    @OriginalMember(owner = "client!gd", name = "mg", descriptor = "Lhq;")
    public class385 field9220;

    @OriginalMember(owner = "client!gd", name = "og", descriptor = "Lhq;")
    public class385 field9222;

    @OriginalMember(owner = "client!gd", name = "sg", descriptor = "Lhq;")
    public class385 field9226;

    @OriginalMember(owner = "client!gd", name = "ug", descriptor = "Lhq;")
    public class385 field9228;

    @OriginalMember(owner = "client!gd", name = "vg", descriptor = "Lhq;")
    public class385 field9229;

    @OriginalMember(owner = "client!gd", name = "wg", descriptor = "Lhq;")
    public class385 field9230;

    @OriginalMember(owner = "client!gd", name = "yg", descriptor = "Lhq;")
    public class385 field9232;

    @OriginalMember(owner = "client!gd", name = "Ag", descriptor = "Lhq;")
    public class385 field9234;

    @OriginalMember(owner = "client!gd", name = "Dg", descriptor = "Lhq;")
    public class385 field9237;

    @OriginalMember(owner = "client!gd", name = "Je", descriptor = "Lgl;")
    private class414 field9140;

    @OriginalMember(owner = "client!gd", name = "Nf", descriptor = "Ltu;")
    private class499 field9195;

    @OriginalMember(owner = "client!gd", name = "Uf", descriptor = "Lrt;")
    private class509 field9202;

    @OriginalMember(owner = "client!gd", name = "xg", descriptor = "Ljj;")
    private class688 field9231;

    @OriginalMember(owner = "client!gd", name = "kg", descriptor = "Lco;")
    public class753 field9218;

    @OriginalMember(owner = "client!gd", name = "qg", descriptor = "Lco;")
    public class753 field9224;

    @OriginalMember(owner = "client!gd", name = "tg", descriptor = "Lco;")
    private class753 field9227;

    @OriginalMember(owner = "client!gd", name = "zg", descriptor = "Lco;")
    private class753 field9233;

    @OriginalMember(owner = "client!gd", name = "Bg", descriptor = "Lco;")
    public class753 field9235;

    @OriginalMember(owner = "client!gd", name = "Cg", descriptor = "Lco;")
    private class753 field9236;

    @OriginalMember(owner = "client!gd", name = "Fg", descriptor = "Lco;")
    public class753 field9239;

    @OriginalMember(owner = "client!gd", name = "vc", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field9022;

    @OriginalMember(owner = "client!gd", name = "tb", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field8968;

    @OriginalMember(owner = "client!gd", name = "Ab", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field8975;

    @OriginalMember(owner = "client!gd", name = "ue", descriptor = "Z")
    public boolean field9125;

    @OriginalMember(owner = "client!gd", name = "wf", descriptor = "Z")
    public boolean field9178;

    @OriginalMember(owner = "client!gd", name = "If", descriptor = "Z")
    public boolean field9190;

    @OriginalMember(owner = "client!gd", name = "Wf", descriptor = "Z")
    public boolean field9204;

    @OriginalMember(owner = "client!gd", name = "Zf", descriptor = "Z")
    public boolean field9207;

    @OriginalMember(owner = "client!gd", name = "Gg", descriptor = "Z")
    public boolean field9240;

    @OriginalMember(owner = "client!gd", name = "Ef", descriptor = "[Lsfa;")
    private class132[] field9186;

    @OriginalMember(owner = "client!gd", name = "Ce", descriptor = "[Lkka;")
    public class542[] field9133;

    @OriginalMember(owner = "client!gd", name = "oe", descriptor = "[Loga;")
    public class588[] field9119;

    @OriginalMember(owner = "client!gd", name = "Ue", descriptor = "[Ljf;")
    public class667[] field9151;

    @OriginalMember(owner = "client!gd", name = "cg", descriptor = "[Ljf;")
    public class667[] field9210;

    @OriginalMember(owner = "client!gd", name = "hg", descriptor = "[Lgu;")
    public class757[] field9215;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
    private final void method3708(int arg0) {
        this.field9197 = (float) (-this.field9127 + this.field9184);
        if (arg0 != 23239) {
            this.field9223 = null;
        }
        this.field9198 = (float) (-this.field9181 + this.field9177);
        this.field9176 = (float) (this.field9144 - this.field9127);
        ++field8969;
        this.field9158 = (float) (this.field9123 - this.field9181);
    }

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "(ILaa;II)V")
    public final void method940(int arg0, class596 arg1, int arg2, int arg3) {
        ++field9066;
        class218 var5 = (class218) arg1;
        class471 var6 = var5.field2968;
        this.method3746(false);
        this.method3756(10, var6);
        this.method3750(false, 1);
        this.method3759(false, class174.field2285, class174.field2285);
        this.method3736(class324.field4001, 0, (byte) -88);
        this.method3771(arg0, -9445);
        this.field9108.method3158(11663, (float) this.field8998, 0.0F, (float) this.field9097);
        this.method3761(0);
        this.field9119[0].method3158(11663, var6.method1129(-120, (float) this.field8998), 1.0F, var6.method1125(true, (float) this.field9097));
        this.field9119[0].method3164(0.0F, var6.method1125(true, (float) (-arg2)), var6.method1129(-126, (float) (-arg3)), 1);
        this.field9133[0] = class627.field7959;
        this.method3791(0);
        this.method3731((byte) 125);
        this.method3754(false);
        this.method3736(class171.field2262, 0, (byte) -88);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Liea;I)V")
    public abstract void method1158(class12 arg0, int arg1);

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "(Z)V")
    public final void method883(boolean arg0) {
        ++field8931;
        this.field9180 = arg0;
        this.method1168(28914);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILds;IILtn;)Lw;")
    public abstract class471 method1203(int arg0, class73 arg1, int arg2, int arg3, class749 arg4);

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "()Loha;")
    public final class465 method880() {
        ++field9076;
        return this.field9112;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lwq;)V")
    public final void method912(class705 arg0) {
        this.field9202.method2811(-1, arg0, -69, this);
        ++field8941;
    }

    @OriginalMember(owner = "client!gd", name = "la", descriptor = "()V")
    public final void method957() {
        ++field9030;
        this.field9184 = this.field9097;
        this.field9177 = 0;
        this.field9123 = this.field8998;
        this.field9144 = 0;
        if (this.field9240) {
            this.field9240 = false;
            this.method1163(14);
        }
        this.method3708(23239);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[I[I)Laa;")
    public final class596 method947(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field8988;
        return class120.method714(3, arg0, this, arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "(I)V")
    public abstract void method1181(int arg0);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field8957;
        float var10 = (float) (-arg0) + (float) arg2;
        float var11 = (float) (-arg1) + (float) arg3;
        float var12;
        if (var10 == 0.0F && var11 == 0.0F) {
            var12 = 1.0F;
        } else {
            float var13 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var11 * var11)));
            var11 *= var13;
            var12 = var10 * var13;
        }
        this.method3738(1);
        this.method3771(arg4, -9445);
        this.method3736(class324.field4001, 0, (byte) -88);
        this.method3718(0, class324.field4001, 1);
        this.method3750(false, arg5);
        this.method3765((byte) 116);
        this.method1154(false, 0);
        int var14 = arg8 % (arg6 + arg7);
        float var15 = (float) arg6 * var12;
        float var16 = (float) arg6 * var11;
        float var17 = 0.0F;
        float var18 = 0.0F;
        float var19 = var15;
        float var20 = var16;
        if (~var14 < ~arg6) {
            var17 = (float) (arg6 + arg7 + -var14) * var12;
            var18 = (float) (arg6 - -arg7 + -var14) * var11;
        } else {
            var19 = (float) (-var14 + arg6) * var12;
            var20 = (float) (-var14 + arg6) * var11;
        }
        float var21 = (float) arg0 + var17;
        float var22 = (float) arg1 + var18;
        float var23 = (float) arg7 * var12;
        float var24 = (float) arg7 * var11;
        while (true) {
            if (arg2 <= arg0) {
                if (var21 < (float) arg2) {
                    break;
                }
                if ((float) arg2 > var19 + var21) {
                    var19 = (float) arg2 - var21;
                }
            } else {
                if ((float) arg2 < var21) {
                    break;
                }
                if ((float) arg2 < var19 + var21) {
                    var19 = (float) arg2 + -var21;
                }
            }
            if (arg3 <= arg1) {
                if ((float) arg3 > var22) {
                    break;
                }
                if ((float) arg3 > var20 + var22) {
                    var20 = (float) arg3 + -var22;
                }
            } else {
                if ((float) arg3 < var22) {
                    break;
                }
                if ((float) arg3 < var20 + var22) {
                    var20 = (float) arg3 - var22;
                }
            }
            if (!this.method3729(0.0F, var19 + var21, var20 + var22, 0.0F, var22, var21, (byte) -6)) {
                return;
            }
            this.method3730(true);
            var21 += var19 + var23;
            var22 += var20 + var24;
            var19 = var15;
            var20 = var16;
        }
        this.method1154(true, 0);
        this.method3718(0, class171.field2262, 1);
        this.method3736(class171.field2262, 0, (byte) -88);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lne;[Lvi;Z)Lda;")
    public final class420 method1002(class166 arg0, class388[] arg1, boolean arg2) {
        ++field8951;
        return new class348(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILtn;I[BI)Lii;")
    public abstract class546 method1201(int arg0, int arg1, class749 arg2, int arg3, byte[] arg4, int arg5);

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "(I)V")
    public abstract void method1172(int arg0);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IF)V")
    public final void method3709(int arg0, float arg1) {
        if (arg0 != 1) {
            this.field9217 = 88;
        }
        if (this.field9153 != arg1) {
            this.field9153 = arg1;
            this.method3787((byte) 95);
        }
        ++field9002;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lza;)V")
    public final void method929(class270 arg0) {
        ++field9086;
        this.field9022 = ((class512) arg0).field6531;
        this.field8968 = this.field9022.method2532(32768, false);
    }

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "(I)I")
    public final int method3710(int arg0) {
        if (arg0 != 9207) {
            return 83;
        } else {
            ++field9023;
            return this.field9145;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)Ltu;")
    public class499 method1184(byte arg0, int arg1) {
        ++field8965;
        if (arg0 != 100) {
            this.field9097 = -111;
        }
        if (~arg1 != -7) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    return ~arg1 == -8 ? new class463(this) : new class653(this);
                } else {
                    return new class431(this, this.field8918);
                }
            } else {
                return new class141(this);
            }
        } else {
            return new class254(this);
        }
    }

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "(I)V")
    public abstract void method1168(int arg0);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILhu;)V")
    private final void method3711(int arg0, int arg1, class238 arg2) {
        ++field8997;
        this.method1200((byte) -119, 0, this.field9221);
        this.method1150(this.field9227, arg1 + 22732);
        if (arg1 != -22732) {
            this.method965();
        }
        this.method1191(arg2, false, 0, arg0);
    }

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "(I)V")
    public abstract void method1155(int arg0);

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "(II)V")
    public final void method3712(int arg0, int arg1) {
        ++field8924;
        if (arg0 != -14720) {
            this.method3714((byte) -68);
        }
        if (this.field9129 != arg1) {
            this.field9129 = arg1;
            this.method1155(-30551);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ltn;BLds;)Z")
    public abstract boolean method1188(class749 arg0, byte arg1, class73 arg2);

    @OriginalMember(owner = "client!gd", name = "aa", descriptor = "(IIIIII)V")
    public final void method921(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9033;
        this.method3738(1);
        this.method3771(arg4, -9445);
        this.method3736(class324.field4001, 0, (byte) -88);
        this.method3718(0, class324.field4001, 1);
        this.method3750(false, arg5);
        this.field9108.method3158(11663, (float) arg3, 1.0F, (float) arg2);
        this.field9108.method450(arg0, arg1, 0);
        this.method3761(0);
        this.method1154(false, 0);
        this.method3731((byte) 115);
        this.method1154(true, 0);
        this.method3718(0, class171.field2262, 1);
        this.method3736(class171.field2262, 0, (byte) -88);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ltn;[FZIIZ)Lw;")
    public final class471 method3713(class749 arg0, float[] arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        ++field9014;
        return arg2 ? null : this.method1190(0, arg5, 0, arg1, arg3, arg4, arg0, 0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public final void method3714(byte arg0) {
        this.field9133 = new class542[this.field9167];
        ++field9025;
        this.field9119 = new class588[this.field9167];
        this.field9210 = new class667[this.field9167];
        this.field9186 = new class132[this.field9167];
        this.field9151 = new class667[this.field9167];
        for (int var2 = 0; this.field9167 > var2; ++var2) {
            this.field9210[var2] = class137.field1820;
            this.field9151[var2] = class137.field1820;
            this.field9133[var2] = class558.field7097;
            this.field9119[var2] = new class588();
        }
        if (arg0 > 36) {
            this.field9215 = new class757[this.field9132 + -2];
            this.field9128 = this.method1203(1, class73.field990, 1, 1, class417.field5505);
            this.method929(new class512(262144));
            this.field9239 = this.method1175(-127, new class592[] { new class592(new class604[] { class604.field7665, class604.field7669 }) });
            this.field9235 = this.method1175(-124, new class592[] { new class592(new class604[] { class604.field7665, class604.field7667 }) });
            this.field9218 = this.method1175(-126, new class592[] { new class592(class604.field7665), new class592(class604.field7667), new class592(class604.field7669), new class592(class604.field7666) });
            this.field9224 = this.method1175(-100, new class592[] { new class592(class604.field7665), new class592(class604.field7667), new class592(class604.field7669) });
            this.field9220 = new class385(this, 0, 0, false, false);
            this.field9234 = new class385(this, 0, 0, true, true);
            this.field9226 = new class385(this, 0, 0, false, false);
            this.field9222 = new class385(this, 0, 0, true, true);
            this.field9229 = new class385(this, 0, 0, false, false);
            this.field9230 = new class385(this, 0, 0, true, true);
            this.field9237 = new class385(this, 0, 0, false, false);
            this.field9228 = new class385(this, 0, 0, true, true);
            this.field9232 = new class385(this, 0, 0, false, false);
            this.field9219 = new class385(this, 0, 0, true, true);
            this.field9202 = new class509(this);
            this.field9231 = this.method1179(true, 81);
            this.method3751(-10455);
            this.field8918 = new class135(this);
            this.field9193[1] = this.method1184((byte) 100, 1);
            this.field9193[2] = this.method1184((byte) 100, 2);
            this.field9193[4] = this.method1184((byte) 100, 4);
            this.field9193[5] = this.method1184((byte) 100, 5);
            this.field9193[6] = this.method1184((byte) 100, 6);
            this.field9193[7] = this.method1184((byte) 100, 7);
            this.field9193[3] = this.method1184((byte) 100, 3);
            this.field9193[8] = this.method1184((byte) 100, 8);
            this.field9193[9] = this.method1184((byte) 100, 9);
            if (!this.field9193[2].method200(true)) {
                this.field9193[2] = this.method1184((byte) 100, 0);
            }
            if (!this.field9193[4].method200(true)) {
                this.field9193[4] = this.field9193[2];
            }
            if (!this.field9193[8].method200(true)) {
                this.field9193[8] = this.field9193[4];
            }
            if (!this.field9193[9].method200(true)) {
                this.field9193[9] = this.field9193[8];
            }
            this.method1156((byte) -10);
            this.method957();
            this.method970();
        }
    }

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "()Z")
    public final boolean method900() {
        ++field8952;
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZLcja;I)V")
    public abstract void method1161(int arg0, boolean arg1, class83 arg2, int arg3);

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "(I)V")
    private final void method3715(int arg0) {
        if (!this.field9118) {
            float[] var2 = this.field9182;
            float var3 = (float) this.field9135;
            float var4 = (float) this.field9170;
            float var5 = (float) (-this.field9181) * this.field9153 / (float) this.field9169;
            float var6 = (float) (-this.field9127) * this.field9153 / (float) this.field9168;
            float var7 = (float) (-this.field9127 + this.field9097) * this.field9153 / (float) this.field9168;
            float var8 = (float) (-this.field9181 + this.field8998) * this.field9153 / (float) this.field9169;
            if (var6 != var7 && var5 != var8) {
                var2[14] = var3 / (-var4 + var3);
                var2[3] = 0.0F;
                var2[11] = 0.0F;
                var2[8] = 0.0F;
                var2[1] = 0.0F;
                var2[0] = 2.0F / (-var6 + var7);
                var2[13] = (var5 + var8) / (var8 - var5);
                var2[2] = 0.0F;
                var2[9] = 0.0F;
                var2[7] = 0.0F;
                var2[6] = 0.0F;
                var2[15] = 1.0F;
                var2[12] = (var6 + var7) / (var6 - var7);
                var2[4] = 0.0F;
                var2[10] = 1.0F / (var3 - var4);
                var2[5] = 2.0F / (-var5 + var8);
            } else {
                var2[2] = 0.0F;
                var2[7] = 0.0F;
                var2[13] = 0.0F;
                var2[1] = 0.0F;
                var2[3] = 0.0F;
                var2[0] = 1.0F;
                var2[12] = 0.0F;
                var2[10] = 1.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
                var2[14] = 0.0F;
                var2[15] = 1.0F;
                var2[11] = 0.0F;
                var2[4] = 0.0F;
                var2[5] = 1.0F;
                var2[8] = 0.0F;
            }
            this.method3752((byte) 14);
            this.field9118 = true;
        }
        if (arg0 != 5) {
            this.field9211 = null;
        }
        ++field9009;
    }

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "(IIIIIII)I")
    public final int method969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9026;
        int var8 = 0;
        float var9 = (float) arg2 * this.field9112.field7443 + (float) arg0 * this.field9112.field7466 + (float) arg1 * this.field9112.field7465 + this.field9112.field7438;
        float var10 = (float) arg5 * this.field9112.field7443 + (float) arg3 * this.field9112.field7466 + (float) arg4 * this.field9112.field7465 + this.field9112.field7438;
        if (var9 < (float) this.field9135 && var10 < (float) this.field9135) {
            var8 |= 16;
        } else if ((float) this.field9170 < var9 && (float) this.field9170 < var10) {
            var8 |= 32;
        }
        int var11 = (int) (((float) arg2 * this.field9112.field7454 + (float) arg0 * this.field9112.field7464 + (float) arg1 * this.field9112.field7423 + this.field9112.field7432) * (float) this.field9168 / (float) arg6);
        int var12 = (int) (((float) arg5 * this.field9112.field7454 + (float) arg3 * this.field9112.field7464 + (float) arg4 * this.field9112.field7423 + this.field9112.field7432) * (float) this.field9168 / (float) arg6);
        if (this.field9176 > (float) var11 && (float) var12 < this.field9176) {
            var8 |= 1;
        } else if ((float) var11 > this.field9197 && (float) var12 > this.field9197) {
            var8 |= 2;
        }
        int var13 = (int) (((float) arg2 * this.field9112.field7450 + (float) arg0 * this.field9112.field7447 + (float) arg1 * this.field9112.field7425 + this.field9112.field7461) * (float) this.field9169 / (float) arg6);
        int var14 = (int) (((float) arg5 * this.field9112.field7450 + (float) arg3 * this.field9112.field7447 + (float) arg4 * this.field9112.field7425 + this.field9112.field7461) * (float) this.field9169 / (float) arg6);
        if (this.field9198 > (float) var13 && this.field9198 > (float) var14) {
            var8 |= 4;
        } else if ((float) var13 > this.field9158 && (float) var14 > this.field9158) {
            var8 |= 8;
        }
        return var8;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)Ljj;")
    public abstract class688 method1179(boolean arg0, int arg1);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lvi;Z)Lpu;")
    public final class772 method977(class388 arg0, boolean arg1) {
        ++field8949;
        class772 var9;
        if (arg0.field4950 != 0 && arg0.field4946 != 0) {
            int[] var3 = new int[arg0.field4950 * arg0.field4946];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field4947 != null) {
                for (int var6 = 0; ~var6 > ~arg0.field4946; ++var6) {
                    for (int var7 = 0; ~arg0.field4950 < ~var7; ++var7) {
                        var3[var5++] = class77.method473(arg0.field4951[class249.method1625(255, arg0.field4949[var4])], arg0.field4947[var4] << 24);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; var8 < arg0.field4946; ++var8) {
                    for (int var10 = 0; var10 < arg0.field4950; ++var10) {
                        int var11 = arg0.field4951[255 & arg0.field4949[var4++]];
                        var3[var5++] = var11 == 0 ? 0 : class77.method473(var11, -16777216);
                    }
                }
            }
            var9 = this.method3078((byte) 71, arg0.field4946, arg0.field4950, var3, 0, arg0.field4950);
        } else {
            var9 = this.method3078((byte) 71, 1, 1, new int[1], 0, 1);
        }
        var9.method626(arg0.field4948, arg0.field4945, arg0.field4953, arg0.field4952);
        return var9;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIZ)Lpu;")
    public final class772 method990(int arg0, int arg1, boolean arg2) {
        ++field9041;
        return new class105(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method888(Canvas arg0) {
        this.field9057 = null;
        this.field9006 = null;
        ++field8992;
        if (arg0 != null && this.field8919 != arg0) {
            if (this.field8975.containsKey(arg0)) {
                this.field9006 = this.field8975.get(arg0);
                this.field9057 = arg0;
            }
        } else {
            this.field9006 = this.field8979;
            this.field9057 = this.field8919;
        }
        if (this.field9057 != null && this.field9006 != null) {
            this.method1189(this.field9006, this.field9057, (byte) -37);
            this.method3737(126);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BILtn;ZIIIB)Lw;")
    public abstract class471 method1170(byte[] arg0, int arg1, class749 arg2, boolean arg3, int arg4, int arg5, int arg6, byte arg7);

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "()Z")
    public final boolean method879() {
        ++field9071;
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "()[I")
    public final int[] method916() {
        ++field9078;
        return new int[] { this.field9127, this.field9181, this.field9168, this.field9169 };
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(ZI)V")
    public final void method3716(boolean arg0, int arg1) {
        ++field8970;
        if (this.field9178 != arg0) {
            this.field9178 = arg0;
            this.method1202(arg1 + 39);
            this.field9162 &= -32;
        }
        if (arg1 != -32) {
            this.field9227 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "(I)V")
    public final void method3717(int arg0) {
        if (~this.field9162 != -17) {
            this.method3772(-8);
            this.method3716(true, -32);
            this.method3760(true, -24009);
            this.method3766((byte) -107, true);
            this.method3750(false, 1);
            this.field9162 = 16;
        }
        if (arg0 == 4) {
            ++field9098;
        }
    }

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "(I)V")
    public abstract void method1176(int arg0);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILcja;I)V")
    public final void method3718(int arg0, class83 arg1, int arg2) {
        this.method1161(arg0, false, arg1, 0);
        ++field8920;
        if (arg2 != 1) {
            this.field9155 = 76;
        }
    }

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "(I)V")
    public abstract void method1180(int arg0);

    @OriginalMember(owner = "client!gd", name = "pa", descriptor = "()V")
    public final void method918() {
        ++field8934;
        this.field9190 = false;
    }

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "(IIII)V")
    public final void method928(int arg0, int arg1, int arg2, int arg3) {
        ++field8936;
        boolean var5 = false;
        if (this.field9144 < arg0) {
            var5 = true;
            this.field9144 = arg0;
        }
        if (~arg2 > ~this.field9184) {
            var5 = true;
            this.field9184 = arg2;
        }
        if (arg1 > this.field9177) {
            this.field9177 = arg1;
            var5 = true;
        }
        if (this.field9123 > arg3) {
            var5 = true;
            this.field9123 = arg3;
        }
        if (var5) {
            if (!this.field9240) {
                this.field9240 = true;
                this.method1163(14);
            }
            this.method1153(-119);
            this.method3708(23239);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIZ)Lpu;")
    public final class772 method955(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field9091;
        class105 var6 = new class105(this, arg2, arg3, arg4);
        var6.method622(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[IBIZ)Lw;")
    public final class471 method3719(int arg0, int[] arg1, byte arg2, int arg3, boolean arg4) {
        if (arg2 != -117) {
            return null;
        } else {
            ++field8966;
            return this.method1207(arg4, 0, arg0, (byte) -19, arg1, arg3, 0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
    public final void method3720(int arg0, boolean arg1) {
        if (arg0 < 0) {
            this.method893();
        }
        ++field9088;
        if (!arg1 != !this.field9163) {
            this.field9163 = arg1;
            this.method1187(-99);
            this.field9162 &= -8;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(IIIIII)V")
    public final void method973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9044;
        float var7 = (float) arg2 - (float) arg0;
        float var8 = (float) arg3 - (float) arg1;
        float var9;
        if (var7 == 0.0F && var8 == 0.0F) {
            var9 = 1.0F;
        } else {
            float var10 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
            var8 *= var10;
            var9 = var7 * var10;
        }
        if (this.method3729(0.0F, (float) arg2 + var9, (float) arg3 + var8, 0.0F, (float) arg1, (float) arg0, (byte) -6)) {
            this.method3738(1);
            this.method3771(arg4, -9445);
            this.method3736(class324.field4001, 0, (byte) -88);
            this.method3718(0, class324.field4001, 1);
            this.method3750(false, arg5);
            this.method3765((byte) 116);
            this.method1154(false, 0);
            this.method3730(true);
            this.method1154(true, 0);
            this.method3718(0, class171.field2262, 1);
            this.method3736(class171.field2262, 0, (byte) -88);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "()Z")
    public final boolean method906() {
        ++field8923;
        return false;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method1195(int arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BZ)Lcq;")
    public abstract class233 method1162(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
    public abstract void method1174(byte arg0);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B[F)[F")
    public final float[] method3721(byte arg0, float[] arg1) {
        arg1[4] = this.field9137[1];
        ++field9058;
        arg1[12] = this.field9137[3];
        arg1[8] = this.field9137[2];
        arg1[0] = this.field9137[0];
        arg1[1] = this.field9137[4];
        arg1[2] = this.field9137[8];
        arg1[5] = this.field9137[5];
        arg1[9] = this.field9137[6];
        arg1[13] = this.field9137[7];
        arg1[7] = this.field9137[13];
        if (arg0 != -120) {
            this.method1184((byte) -124, 3);
        }
        arg1[6] = this.field9137[9];
        arg1[3] = this.field9137[12];
        arg1[10] = this.field9137[10];
        arg1[14] = this.field9137[11];
        arg1[15] = this.field9137[15];
        arg1[11] = this.field9137[14];
        return arg1;
    }

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "()Z")
    public final boolean method960() {
        ++field9064;
        return false;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(IZ)V")
    public final void method3722(int arg0, boolean arg1) {
        ++field8958;
        if (arg0 <= -107) {
            if (!arg1 == this.field9152) {
                this.field9152 = arg1;
                this.method1165((byte) -84);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "(I)V")
    private final void method3723(int arg0) {
        if (class581.field7355 == this.field9211) {
            float var2 = this.method1169(127);
            this.field9108.method3164(0.0F, var2, var2, arg0 ^ -5988);
        }
        ++field8977;
        this.field9171 = false;
        if (arg0 == -5987) {
            this.method1159((byte) 94);
            if (this.field9195 != null) {
                this.field9195.method197((byte) 66);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ld;Lwm;II)V")
    public class696(Canvas arg0, Object arg1, class284 arg2, class30 arg3, int arg4, int arg5) {
        super(arg2);
        try {
            this.field9057 = this.field8919 = arg0;
            this.field9136 = arg4;
            this.field9006 = this.field8979 = arg1;
            this.field8980 = arg3;
            Dimension var7 = arg0.getSize();
            this.field9097 = this.field9043 = var7.width;
            this.field8998 = this.field9069 = var7.height;
            this.field9155 = arg5;
            class385.method2206(1708, true, false);
            if (super.field7199 != null) {
                this.field9185 = new class113(this, super.field7199);
                this.field8985 = new NativeInterface(super.field7199.method1736(false), this.field9155);
                for (int var8 = 0; ~super.field7199.method1736(false) < ~var8; ++var8) {
                    class191 var9 = super.field7199.method1732((byte) 8, var8);
                    if (var9 != null) {
                        this.field8985.initTextureMetrics(var8, var9.field2672, var9.field2661);
                    }
                }
            } else {
                this.field8985 = new NativeInterface(0, this.field9155);
                this.field9185 = null;
            }
        } catch (Throwable var11) {
            var11.printStackTrace();
            this.method3072(5);
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "(I)[F")
    public final float[] method3724(int arg0) {
        if (arg0 != 11766) {
            this.method3736((class83) null, 19, (byte) -52);
        }
        ++field8972;
        return this.field9214;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
    private final void method3725(byte arg0) {
        this.field9225 = this.method1162((byte) 31, true);
        ++field9050;
        this.field9225.method283(24, 12, -21048);
        if (arg0 < 115) {
            this.method903();
        }
        this.field9233 = this.method1175(-119, new class592[] { new class592(class604.field7665) });
    }

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "(I)V")
    public abstract void method1194(int arg0);

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(ZI)V")
    public abstract void method1157(boolean arg0, int arg1);

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "(I)V")
    public final void method995(int arg0) {
        ++field9047;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V")
    public abstract void method1186(byte arg0);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BII)V")
    public static final void method3726(byte arg0, int arg1, int arg2) {
        if (arg0 != 98) {
            method3755(-94);
        }
        ++field9011;
        class614 var3 = class497.method2759(1, 5977, (long) arg1);
        var3.method3277(639);
        var3.field7742 = arg2;
    }

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "()I")
    public final int method981() {
        ++field9048;
        return this.field9111 + this.field9107 + this.field9104;
    }

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "(I)V")
    private final void method3727(int arg0) {
        ++field9039;
        this.field9221 = this.method1162((byte) 31, false);
        this.field9221.method283(140, 28, -21048);
        if (arg0 > -86) {
            this.method1158((class12) null, 106);
        }
        for (int var2 = 0; var2 < 4; ++var2) {
            Buffer var3 = this.field9221.method286(16561, true);
            if (var3 != null) {
                Stream var4 = this.method3773(var3, (byte) -82);
                if (Stream.method2528()) {
                    var4.method2518(0.0F);
                    var4.method2518(0.0F);
                    var4.method2518(0.0F);
                    var4.method2518(0.0F);
                    var4.method2518(0.0F);
                    var4.method2518(0.0F);
                    var4.method2518(0.0F);
                    var4.method2518(0.0F);
                    var4.method2518(1.0F);
                    var4.method2518(0.0F);
                    var4.method2518(0.0F);
                    var4.method2518(1.0F);
                    var4.method2518(0.0F);
                    var4.method2518(1.0F);
                    var4.method2518(1.0F);
                    var4.method2518(1.0F);
                    var4.method2518(0.0F);
                    var4.method2518(1.0F);
                    var4.method2518(1.0F);
                    var4.method2518(1.0F);
                    var4.method2518(1.0F);
                    var4.method2518(1.0F);
                    var4.method2518(0.0F);
                    var4.method2518(0.0F);
                    var4.method2518(1.0F);
                    var4.method2518(0.0F);
                    var4.method2518(1.0F);
                    var4.method2518(0.0F);
                    var4.method2518(0.0F);
                    var4.method2518(0.0F);
                    var4.method2518(0.0F);
                    var4.method2518(0.0F);
                    var4.method2518(0.0F);
                    var4.method2518(0.0F);
                    var4.method2518(0.0F);
                } else {
                    var4.method2524(0.0F);
                    var4.method2524(0.0F);
                    var4.method2524(0.0F);
                    var4.method2524(0.0F);
                    var4.method2524(0.0F);
                    var4.method2524(0.0F);
                    var4.method2524(0.0F);
                    var4.method2524(0.0F);
                    var4.method2524(1.0F);
                    var4.method2524(0.0F);
                    var4.method2524(0.0F);
                    var4.method2524(1.0F);
                    var4.method2524(0.0F);
                    var4.method2524(1.0F);
                    var4.method2524(1.0F);
                    var4.method2524(1.0F);
                    var4.method2524(0.0F);
                    var4.method2524(1.0F);
                    var4.method2524(1.0F);
                    var4.method2524(1.0F);
                    var4.method2524(1.0F);
                    var4.method2524(1.0F);
                    var4.method2524(0.0F);
                    var4.method2524(0.0F);
                    var4.method2524(1.0F);
                    var4.method2524(0.0F);
                    var4.method2524(1.0F);
                    var4.method2524(0.0F);
                    var4.method2524(0.0F);
                    var4.method2524(0.0F);
                    var4.method2524(0.0F);
                    var4.method2524(0.0F);
                    var4.method2524(0.0F);
                    var4.method2524(0.0F);
                    var4.method2524(0.0F);
                }
                var4.method2519();
                if (this.field9221.method288(-12162)) {
                    break;
                }
            }
        }
        this.field9227 = this.method1175(98, new class592[] { new class592(new class604[] { class604.field7665, class604.field7669, class604.field7669 }) });
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;Z)V")
    public abstract void method1167(Object arg0, Canvas arg1, boolean arg2);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([[IIZI)Llha;")
    public abstract class445 method1182(int[][] arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "(IIIII)V")
    public final void method936(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method973(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        ++field9056;
    }

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "(I)V")
    public final void method939(int arg0) {
        ++field8948;
        if (~arg0 != -2) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILcja;ZZ)V")
    public abstract void method1205(int arg0, int arg1, class83 arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "(I)V")
    public abstract void method1204(int arg0);

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Z)Llha;")
    public final class445 method3728(boolean arg0) {
        ++field8927;
        if (arg0) {
            this.method896(36, -88, -32, 9, 120);
        }
        return this.field9140 != null ? this.field9140.method579(-126) : null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(FFFFFFB)Z")
    private final boolean method3729(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, byte arg6) {
        ++field9075;
        Buffer var8 = this.field9225.method286(16561, true);
        if (var8 == null) {
            return false;
        } else if (arg6 != -6) {
            return true;
        } else {
            Stream var9 = this.method3773(var8, (byte) -82);
            if (!Stream.method2528()) {
                var9.method2524(arg5);
                var9.method2524(arg4);
                var9.method2524(arg0);
                var9.method2524(arg1);
                var9.method2524(arg2);
                var9.method2524(arg3);
            } else {
                var9.method2518(arg5);
                var9.method2518(arg4);
                var9.method2518(arg0);
                var9.method2518(arg1);
                var9.method2518(arg2);
                var9.method2518(arg3);
            }
            var9.method2519();
            return this.field9225.method288(-12162);
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(Z)V")
    private final void method3730(boolean arg0) {
        this.method1200((byte) -127, 0, this.field9225);
        if (!arg0) {
            this.method3776((class588) null, -2);
        }
        ++field9046;
        this.method1150(this.field9233, 0);
        this.method1191(class525.field6674, !arg0, 0, 1);
    }

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "(IIIII)V")
    public final void method896(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method973(arg0, arg1, arg0 - -arg2, arg1, arg3, arg4);
        ++field9004;
    }

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "(I)V")
    public abstract void method1152(int arg0);

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(B)V")
    public final void method3731(byte arg0) {
        ++field8981;
        this.method3711(2, -22732, class467.field6043);
        if (arg0 < 75) {
            this.method964(56, -85, 21, -83, 72, -79, (class596) null, -27, -33);
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(Z)V")
    private final void method3732(boolean arg0) {
        this.field9216[14] = this.field9200;
        ++field9109;
        this.field9216[10] = this.field9189;
        if (!arg0) {
            this.field9176 = -1.7817068F;
        }
        this.field9166 = (this.field9216[14] + (float) (-this.field9170)) / this.field9216[10];
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method881(Canvas arg0, int arg1, int arg2) {
        ++field8994;
        Object var4 = null;
        if (arg0 != null && this.field8919 != arg0) {
            if (this.field8975.containsKey(arg0)) {
                var4 = this.field8975.get(arg0);
            }
        } else {
            var4 = this.field9006;
        }
        if (var4 == null) {
            throw new RuntimeException();
        } else {
            this.method1195(15797, var4, arg0);
            if (this.field9057 == arg0) {
                this.method3737(123);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(B)I")
    public final int method3733(byte arg0) {
        ++field9027;
        if (arg0 != 117) {
            this.field9231 = null;
        }
        return this.field9129;
    }

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "()Loha;")
    public final class465 method994() {
        ++field9034;
        return new class588();
    }

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "()Loha;")
    public final class465 method948() {
        ++field9055;
        return this.field9223;
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
    public void method963(int arg0) {
        ++field8974;
        if (this.field9185 != null) {
            this.field9185.method661(-1);
        }
        this.field9192 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "(I)V")
    private final void method3734(int arg0) {
        if (arg0 == -25) {
            ++field9037;
            if (class581.field7355 != this.field9211) {
                class779 var2 = this.field9211;
                this.field9211 = class581.field7355;
                if (var2.method4272((byte) 88)) {
                    this.method3764(75);
                }
                this.method3775(false);
                this.field9137 = this.field9117;
                this.method3779(-117);
                this.field9162 &= -25;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I")
    public final int method886(int arg0, int arg1) {
        ++field8984;
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIILhu;ZLjj;I)V")
    public abstract void method1151(int arg0, int arg1, int arg2, class238 arg3, boolean arg4, class688 arg5, int arg6);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(BI)Ljj;")
    public final class688 method3735(byte arg0, int arg1) {
        if (arg0 != -5) {
            this.method930((class615) null, -118, -37, -24, -51);
        }
        if (this.field9231.method287(128) < arg1 * 2) {
            this.field9231.method2016(arg1, -123);
        }
        ++field9054;
        return this.field9231;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lcja;IB)V")
    public final void method3736(class83 arg0, int arg1, byte arg2) {
        if (arg2 != -88) {
            this.field9236 = null;
        }
        this.method1205(arg1, 119, arg0, false, false);
        ++field9093;
    }

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "(I)V")
    private final void method3737(int arg0) {
        ++field9094;
        if (this.field9057 != null) {
            Dimension var2 = this.field9057.getSize();
            this.field9043 = var2.width;
            this.field9069 = var2.height;
        } else {
            this.field9043 = this.field9069 = 1;
        }
        this.field8998 = this.field9069;
        this.field9097 = this.field9043;
        this.method3786(-30504);
        this.method3777(105);
        this.method3787((byte) 95);
        this.method1176(14);
        this.method3708(23239);
        this.method3742(false);
        this.method957();
        if (arg0 <= 121) {
            this.field9190 = true;
        }
    }

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "(I)V")
    private final void method3738(int arg0) {
        ++field8976;
        if (arg0 == 1) {
            if (~this.field9162 != -2) {
                this.method3734(arg0 + -26);
                this.method3716(false, arg0 + -33);
                this.method3720(14, false);
                this.method3760(false, -24009);
                this.method3766((byte) -80, false);
                this.method3767(false, -2, false, (byte) 86);
                this.method3740(1, 126);
                this.method3756(10, this.field9128);
                this.field9162 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "(I)V")
    public abstract void method1163(int arg0);

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "(I)V")
    public final void method3739(int arg0) {
        ++field9051;
        if (arg0 != 12) {
            this.method3741(false);
        }
        if (~this.field9162 != -5) {
            this.method3734(-25);
            this.method3716(false, -32);
            this.method3720(25, false);
            this.method3760(false, -24009);
            this.method3766((byte) -51, false);
            this.method3767(false, -2, false, (byte) 86);
            this.method3750(false, 1);
            this.method3740(0, 80);
            this.field9162 = 4;
        }
    }

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "(II)V")
    public final void method3740(int arg0, int arg1) {
        if (arg0 != 1) {
            if (arg0 == 0) {
                this.method3759(false, class137.field1820, class137.field1820);
            } else if (~arg0 != -3) {
                if (~arg0 != -4) {
                    if (~arg0 == -5) {
                        this.method3759(false, class224.field3039, class224.field3039);
                    }
                } else {
                    this.method3759(false, class177.field2325, class137.field1820);
                }
            } else {
                this.method3759(false, class361.field4395, class174.field2285);
            }
        } else {
            this.method3759(false, class174.field2285, class174.field2285);
        }
        ++field9036;
        if (arg1 < 23) {
            this.method1200((byte) -85, 61, (class233) null);
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "()Z")
    public final boolean method993() {
        ++field8987;
        return false;
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(Z)I")
    public final int method3741(boolean arg0) {
        ++field8989;
        if (arg0) {
            this.field9228 = null;
        }
        return this.field9148;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public final void method972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field9077;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public final void method989(int arg0) {
        ++field8944;
        if (~arg0 <= -129 && ~arg0 >= -1025) {
            if (this.field9185 != null) {
                this.field9185.method663(-1);
            }
            this.field9138 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lsu;IIII)Lka;")
    public final class299 method930(class615 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8929;
        return new class385(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "(III)V")
    public final void method884(int arg0, int arg1, int arg2) {
        if (~this.field9141 != ~arg0 || this.field9183 != arg1 || ~this.field9147 != ~arg2) {
            this.field9183 = arg1;
            this.field9141 = arg0;
            this.field9147 = arg2;
            this.method3789(true);
            this.method1202(7);
        }
        ++field9035;
    }

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "(B)V")
    public abstract void method1165(byte arg0);

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "()Z")
    public final boolean method917() {
        ++field9038;
        return this.field9193[3].method200(true);
    }

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "(Z)V")
    public final void method3742(boolean arg0) {
        if (class687.field8844 != this.field9211) {
            class779 var2 = this.field9211;
            this.field9211 = class687.field8844;
            if (var2.method4272((byte) 103)) {
                this.method3764(-110);
            }
            this.field9137 = this.field9214;
            this.field9162 &= -32;
        }
        if (arg0) {
            this.method3758(-82);
        }
        ++field9042;
    }

    @OriginalMember(owner = "client!gd", name = "da", descriptor = "(III[I)V")
    public final void method987(int arg0, int arg1, int arg2, int[] arg3) {
        ++field8956;
        float var5 = this.field9112.method3145((float) arg0, (float) arg2, -85, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field9127;
            var7 = this.field9181;
        } else {
            var6 = (int) ((float) this.field9168 * this.field9112.method3146((float) arg2, (float) arg0, (byte) 121, (float) arg1) / var5);
            var7 = (int) ((float) this.field9169 * this.field9112.method3159(1, (float) arg2, (float) arg0, (float) arg1) / var5);
        }
        arg3[0] = (int) ((float) var6 - this.field9176);
        arg3[1] = (int) ((float) var7 - this.field9198);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!gd", name = "ZA", descriptor = "(IFFFFF)V")
    public final void method997(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field8986;
        boolean var7 = ~this.field9194 != ~arg0;
        if (var7 || this.field9154 != arg1 || this.field9173 != arg2) {
            this.field9173 = arg2;
            this.field9194 = arg0;
            this.field9154 = arg1;
            if (var7) {
                this.field9213 = (float) (this.field9194 & 255) / 255.0F;
                this.field9188 = (float) (65280 & this.field9194) / 65280.0F;
                this.field9179 = (float) (this.field9194 & 16711680) / 1.671168E7F;
                this.method1152(0);
            }
            this.field8985.setSunColour(this.field9179, this.field9188, this.field9213, arg1, arg2);
            this.method1206((byte) 111);
        }
        if (this.field9160[0] != arg3 || this.field9160[1] != arg4 || this.field9160[2] != arg5) {
            this.field9160[1] = arg4;
            this.field9160[2] = arg5;
            this.field9160[0] = arg3;
            this.field9124[1] = -arg4;
            this.field9124[0] = -arg3;
            this.field9124[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field9203[0] = arg3 * var8;
            this.field9203[2] = arg5 * var8;
            this.field9203[1] = arg4 * var8;
            this.field9175[0] = -this.field9203[0];
            this.field9175[1] = -this.field9203[1];
            this.field9175[2] = -this.field9203[2];
            this.field8985.setSunDirection(this.field9203[0], this.field9203[1], this.field9203[2]);
            this.method1204(5);
            this.field9126 = (int) (arg5 * 256.0F / arg4);
            this.field9187 = (int) (arg3 * 256.0F / arg4);
        }
        this.method1186((byte) -54);
    }

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "(I)V")
    public abstract void method1153(int arg0);

    @OriginalMember(owner = "client!gd", name = "JA", descriptor = "(IIIIII)I")
    public final int method978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9101;
        int var7 = 0;
        float var8 = (float) arg2 * this.field9112.field7443 + (float) arg0 * this.field9112.field7466 + (float) arg1 * this.field9112.field7465 + this.field9112.field7438;
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        float var9 = (float) arg5 * this.field9112.field7443 + (float) arg3 * this.field9112.field7466 + (float) arg4 * this.field9112.field7465 + this.field9112.field7438;
        if (var9 < 1.0F) {
            var9 = 1.0F;
        }
        if ((float) this.field9135 > var8 && (float) this.field9135 > var9) {
            var7 |= 16;
        } else if (var8 > (float) this.field9170 && (float) this.field9170 < var9) {
            var7 |= 32;
        }
        int var10 = (int) (((float) arg2 * this.field9112.field7454 + (float) arg0 * this.field9112.field7464 + (float) arg1 * this.field9112.field7423 + this.field9112.field7432) * (float) this.field9168 / var8);
        int var11 = (int) (((float) arg5 * this.field9112.field7454 + (float) arg3 * this.field9112.field7464 + (float) arg4 * this.field9112.field7423 + this.field9112.field7432) * (float) this.field9168 / var9);
        if ((float) var10 < this.field9176 && this.field9176 > (float) var11) {
            var7 |= 1;
        } else if ((float) var10 > this.field9197 && this.field9197 < (float) var11) {
            var7 |= 2;
        }
        int var12 = (int) (((float) arg2 * this.field9112.field7450 + (float) arg0 * this.field9112.field7447 + (float) arg1 * this.field9112.field7425 + this.field9112.field7461) * (float) this.field9169 / var8);
        int var13 = (int) (((float) arg5 * this.field9112.field7450 + (float) arg3 * this.field9112.field7447 + (float) arg4 * this.field9112.field7425 + this.field9112.field7461) * (float) this.field9169 / var9);
        if (this.field9198 > (float) var12 && this.field9198 > (float) var13) {
            var7 |= 4;
        } else if (this.field9158 < (float) var12 && this.field9158 < (float) var13) {
            var7 |= 8;
        }
        return var7;
    }

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "(I)Loga;")
    public final class588 method3743(int arg0) {
        if (!this.field9171) {
            this.field9116.method3160(this.field9114, this.field9108);
            this.field9171 = true;
        }
        if (arg0 != 2) {
            this.method929((class270) null);
        }
        ++field8971;
        return this.field9116;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILkka;)V")
    public final void method3744(int arg0, class542 arg1) {
        ++field9070;
        this.field9133[this.field9129] = arg1;
        if (arg0 > 52) {
            this.method3791(0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "()Z")
    public final boolean method992() {
        ++field8967;
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "(I)V")
    public final void method3745(int arg0) {
        ++field9028;
        if (arg0 != -18413) {
            this.field9232 = null;
        }
        if (~this.field9162 != -9) {
            this.method3749(-27752);
            this.method3716(true, -32);
            this.method3760(true, -24009);
            this.method3766((byte) -85, true);
            this.method3750(false, 1);
            this.field9162 = 8;
        }
    }

    @OriginalMember(owner = "client!gd", name = "ra", descriptor = "(IIII)V")
    public final void method952(int arg0, int arg1, int arg2, int arg3) {
        this.field9148 = arg2;
        this.field9196 = arg3;
        this.field9145 = arg1;
        this.field9190 = true;
        this.field9131 = arg0;
        ++field9031;
    }

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "(Z)V")
    public final void method3746(boolean arg0) {
        if (arg0) {
            this.method989(45);
        }
        ++field8925;
        if (~this.field9162 != -3) {
            this.method3734(-25);
            this.method3716(false, -32);
            this.method3720(6, false);
            this.method3760(false, -24009);
            this.method3766((byte) -102, false);
            this.method3767(false, -2, false, (byte) 86);
            this.field9162 = 2;
        }
    }

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "(I)I")
    public final int method3747(int arg0) {
        if (arg0 > -47) {
            this.field9188 = 0.18331757F;
        }
        ++field8938;
        return this.field9196;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIILaa;II)V")
    public final void method964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8) {
        ++field9084;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/Object;Ljava/awt/Canvas;B)V")
    public abstract void method1189(Object arg0, Canvas arg1, byte arg2);

    @OriginalMember(owner = "client!gd", name = "HA", descriptor = "(IIII[I)V")
    public final void method923(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        ++field9106;
        float var6 = this.field9112.method3145((float) arg0, (float) arg2, -29, (float) arg1);
        if (!((float) this.field9135 > var6) && !(var6 > (float) this.field9170)) {
            int var7 = (int) ((float) this.field9168 * this.field9112.method3146((float) arg2, (float) arg0, (byte) 70, (float) arg1) / (float) arg3);
            int var8 = (int) ((float) this.field9169 * this.field9112.method3159(1, (float) arg2, (float) arg0, (float) arg1) / (float) arg3);
            arg4[2] = (int) var6;
            arg4[0] = (int) ((float) var7 - this.field9176);
            arg4[1] = (int) ((float) var8 + -this.field9198);
        } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
        }
    }

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "(B)V")
    public abstract void method1164(byte arg0);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([IIIIIZ)Lpu;")
    public final class772 method885(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8939;
        return new class105(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "(I)V")
    public final void method3748(int arg0) {
        this.method3742(false);
        if (arg0 == 4) {
            ++field8955;
            this.method3779(arg0 ^ -112);
        }
    }

    @OriginalMember(owner = "client!gd", name = "xa", descriptor = "(F)V")
    public final void method946(float arg0) {
        ++field9063;
        if (this.field9143 != arg0) {
            this.field9143 = arg0;
            this.field8985.setAmbient(arg0);
            this.method1152(0);
            this.method1186((byte) -67);
        }
    }

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "()I")
    public final int method949() {
        ++field9032;
        return this.field9241;
    }

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "(I)V")
    private final void method3749(int arg0) {
        if (class7.field68 != this.field9211) {
            class779 var2 = this.field9211;
            this.field9211 = class7.field68;
            if (!var2.method4272((byte) 123)) {
                this.method3764(-103);
            }
            this.method3770((byte) 116);
            this.field9137 = this.field9216;
            this.method3779(119);
            this.field9162 &= -8;
        }
        if (arg0 != -27752) {
            this.field9146 = 28;
        }
        ++field9008;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public final void method889(Canvas arg0, int arg1, int arg2) {
        ++field9080;
        if (this.field8919 == arg0) {
            throw new RuntimeException();
        } else if (!this.field8975.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var4 = Class.forName("java.awt.Canvas");
                    Method var5 = var4.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var5.invoke(arg0, Boolean.TRUE);
                } catch (Exception var7) {
                }
                Object var6 = this.method1183(true, arg0);
                if (var6 == null) {
                    throw new RuntimeException();
                } else {
                    this.field8975.put(arg0, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "()I")
    public final int method951() {
        ++field9010;
        return this.field9135;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(ZI)V")
    public final void method3750(boolean arg0, int arg1) {
        if (arg0) {
            this.field9150 = null;
        }
        if (~this.field9206 != ~arg1) {
            boolean var3;
            class687 var4;
            boolean var5;
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    var3 = true;
                    var4 = class9.field79;
                    var5 = false;
                } else if (~arg1 == -129) {
                    var4 = class303.field3824;
                    var5 = true;
                    var3 = true;
                } else {
                    var4 = class62.field818;
                    var3 = false;
                    var5 = false;
                }
            } else {
                var4 = class272.field3571;
                var5 = true;
                var3 = true;
            }
            if (!var5 != !this.field9205) {
                this.field9205 = var5;
                this.method1180(92);
            }
            if (this.field9156 != var3) {
                this.field9156 = var3;
                this.method1164((byte) -127);
            }
            if (this.field9208 != var4) {
                this.field9208 = var4;
                this.method1196(2);
            }
            this.field9162 &= -29;
            this.field9206 = arg1;
        }
        ++field9099;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([I)V")
    public final void method942(int[] arg0) {
        arg0[1] = this.field8998;
        arg0[0] = this.field9097;
        ++field9062;
    }

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "(I)V")
    public final void method3751(int arg0) {
        ++field9005;
        Hashtable var2 = new Hashtable();
        if (this.field8975 != null && !this.field8975.isEmpty()) {
            Enumeration var3 = this.field8975.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method1183(true, var4));
            }
        }
        this.field8975 = var2;
        this.method3727(-101);
        this.method3725((byte) 122);
        this.method3782(0);
        if (arg0 != -10455) {
            this.field9153 = 0.77292895F;
        }
        this.field9202.method2810(this, (byte) -108);
    }

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "(B)V")
    private final void method3752(byte arg0) {
        this.field9122 = (float) this.field9170;
        if (arg0 != 14) {
            this.method1184((byte) 50, 68);
        }
        ++field9029;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ltea;)V")
    public final void method910(class589 arg0) {
        this.field9140 = (class414) arg0;
        ++field8959;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[BILtn;Z)Lw;")
    public final class471 method3753(int arg0, int arg1, byte[] arg2, int arg3, class749 arg4, boolean arg5) {
        if (arg0 < 47) {
            this.method1206((byte) 13);
        }
        ++field9065;
        return this.method1170(arg2, 0, arg4, arg5, arg1, 0, arg3, (byte) -118);
    }

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "(Z)V")
    public final void method3754(boolean arg0) {
        if (!arg0) {
            ++field9024;
            if (this.field9133[this.field9129] != class558.field7097) {
                this.field9133[this.field9129] = class558.field7097;
                this.field9119[this.field9129].method462();
                this.method3791(0);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)I")
    public final int method941(int arg0, int arg1) {
        ++field9049;
        return arg1 & arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Loha;)V")
    public final void method991(class465 arg0) {
        this.field9112 = (class588) arg0;
        ++field8999;
        this.field9114.method468(this.field9112);
        this.field9114.method3151(1);
        this.field9115.method3148(this.field9114, 0);
        this.field9113.method3148(this.field9112, 0);
        if (this.field9211.method4272((byte) 73)) {
            this.method3764(-83);
        }
    }

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "()Z")
    public final boolean method903() {
        ++field8962;
        return this.field9207;
    }

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "()Z")
    public final boolean method914() {
        ++field8983;
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "(I)Lza;")
    public final class270 method975(int arg0) {
        ++field9068;
        class512 var2 = new class512(arg0);
        this.field8993.method3593(var2, 15);
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIF)Lgu;")
    public final class757 method913(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field9090;
        return new class3(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lds;ILtn;)Z")
    public abstract boolean method1208(class73 arg0, int arg1, class749 arg2);

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "()Z")
    public final boolean method953() {
        ++field8996;
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lwq;I)V")
    public final void method980(class705 arg0, int arg1) {
        ++field8964;
        this.field9202.method2811(arg1, arg0, -31, this);
    }

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "(I)V")
    public static void method3755(int arg0) {
        field8945 = null;
        if (arg0 != 256) {
            method3781(-82, (short[][]) null, (float[][]) null);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILsfa;)V")
    public final void method3756(int arg0, class132 arg1) {
        if (arg0 != 10) {
            method3781(-69, (short[][]) null, (float[][]) null);
        }
        ++field9018;
        if (this.field9186[this.field9129] != arg1) {
            this.field9186[this.field9129] = arg1;
            if (arg1 != null) {
                arg1.method773((byte) -93);
            } else {
                this.method1160(true);
            }
            this.field9162 &= -2;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIII)Ltea;")
    public final class589 method956(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field9016;
        return new class101(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BILcq;)V")
    public abstract void method1200(byte arg0, int arg1, class233 arg2);

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "(B)V")
    public abstract void method1159(byte arg0);

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "(I)Loga;")
    public final class588 method3757(int arg0) {
        ++field9017;
        if (arg0 != -8) {
            this.method3778(15, false);
        }
        return this.field9119[this.field9129];
    }

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "(B)V")
    public void method1156(byte arg0) {
        this.method3768((byte) -35);
        if (arg0 == -10) {
            ++field8921;
        }
    }

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "(I)V")
    public final void method3758(int arg0) {
        ++field9102;
        Enumeration var2 = this.field8975.keys();
        if (arg0 != 0) {
            this.method1164((byte) 113);
        }
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method1167(this.field8975.get(var3), var3, true);
        }
        this.field9221.method284((byte) 43);
        this.field9225.method284((byte) 90);
        this.field9238.method284((byte) 92);
        this.field9234.method2204(72);
        this.field9222.method2204(127);
        this.field9230.method2204(104);
        this.field9228.method2204(arg0 + 36);
        this.field9219.method2204(110);
        this.field9202.method2814((byte) -128);
        this.field9231.method284((byte) 100);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLjf;Ljf;)V")
    public final void method3759(boolean arg0, class667 arg1, class667 arg2) {
        ++field9081;
        boolean var4 = arg0;
        if (this.field9151[this.field9129] != arg1) {
            this.field9151[this.field9129] = arg1;
            this.method1177(-56);
            var4 = true;
        }
        if (this.field9210[this.field9129] != arg2) {
            this.field9210[this.field9129] = arg2;
            this.method1181(1);
            var4 = true;
        }
        if (var4) {
            this.field9162 &= -30;
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(ZI)V")
    public final void method3760(boolean arg0, int arg1) {
        ++field8961;
        if (arg1 == -24009) {
            if (!this.field9174 != !arg0) {
                this.field9174 = arg0;
                this.method1171((byte) 47);
                this.field9162 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "(I)V")
    public final void method3761(int arg0) {
        ++field8930;
        this.field9105 = false;
        this.method3723(arg0 + -5987);
        if (arg0 != 0) {
            this.field9237 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BI)Z")
    public static final boolean method3762(byte[] arg0, int arg1) {
        ++field9021;
        class234 var2 = new class234(arg0);
        int var3 = var2.method1509(true);
        if (~var3 != -3) {
            return false;
        } else if (arg1 < 42) {
            return false;
        } else {
            boolean var4 = var2.method1509(true) == 1;
            if (var4) {
                class500.method2779(var2, 3);
            }
            class305.method1803(var2, -94);
            return true;
        }
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(ZI)V")
    public abstract void method1154(boolean arg0, int arg1);

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "(I)V")
    public abstract void method1187(int arg0);

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "(B)V")
    public void method1185(byte arg0) {
        ++field9073;
        this.field9209 = this.field9121;
        if (arg0 != 24) {
            this.method977((class388) null, true);
        }
        this.field9121 = 0;
    }

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "(I)Loga;")
    public final class588 method3763(int arg0) {
        if (arg0 != 1) {
            this.method3778(56, false);
        }
        ++field8960;
        return this.field9119[this.field9129];
    }

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "(I)V")
    public abstract void method1202(int arg0);

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "(I)F")
    public abstract float method1169(int arg0);

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "(I)V")
    private final void method3764(int arg0) {
        int var2 = -6 % ((arg0 - -11) / 43);
        ++field9060;
        this.field9171 = false;
        if (this.field9195 != null) {
            this.field9195.method199(-123);
        }
        this.method1172(0);
    }

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "(B)V")
    public final void method3765(byte arg0) {
        this.field9108.method462();
        if (arg0 != 116) {
            field9015 = 121;
        }
        ++field9089;
        this.field9105 = true;
        this.method3723(arg0 + -6103);
    }

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "(I)V")
    public abstract void method1196(int arg0);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method979(Canvas arg0) {
        ++field9059;
        if (this.field8919 == arg0) {
            throw new RuntimeException();
        } else if (this.field8975.containsKey(arg0)) {
            this.method1167(this.field8975.get(arg0), arg0, true);
            this.field8975.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "()I")
    public final int method893() {
        ++field8946;
        return this.field9132 - 2;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(BZ)V")
    public final void method3766(byte arg0, boolean arg1) {
        ++field8933;
        if (arg0 >= -11) {
            this.method992();
        }
        if (!arg1 != !this.field9172) {
            this.field9172 = arg1;
            this.method1168(28914);
            this.field9162 &= -32;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZIZB)V")
    public final void method3767(boolean arg0, int arg1, boolean arg2, byte arg3) {
        ++field8963;
        if (this.field9164 != arg1 || !this.field9165 != !this.field9190) {
            class471 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field9190 ? 3 : 0;
            if (~arg1 > -1) {
                this.method3754(false);
            } else {
                var5 = this.field9185.method660(arg1, -57);
                class191 var10 = super.field7199.method1732((byte) 126, arg1);
                if (var10.field2662 == 0 && ~var10.field2665 == -1) {
                    this.method3754(false);
                } else {
                    int var11 = var10.field2673 ? 64 : 128;
                    int var12 = var11 * 50;
                    class588 var13 = this.method3763(arg3 + -85);
                    var13.method3165((float) (this.field9192 % var12 * var10.field2662) / (float) var12, 0.0F, (float) (this.field9192 % var12 * var10.field2665) / (float) var12, 0);
                    this.method3744(118, class627.field7959);
                }
                if (!this.field9190) {
                    var7 = var10.field2680;
                    var8 = var10.field2664;
                    var9 = var10.field2678;
                }
                var6 = var10.field2677;
            }
            this.method3788(var8, var7, arg0, (byte) 123, var9, arg2);
            if (this.field9195 == null) {
                this.method3756(10, var5);
                this.method3740(var6, 46);
            } else {
                this.field9195.method206(var6, var5, 26917);
            }
            this.field9164 = arg1;
            this.field9165 = this.field9190;
        }
        this.field9162 &= -8;
        if (arg3 != 86) {
            this.field9135 = 17;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lco;I)V")
    public abstract void method1150(class753 arg0, int arg1);

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "(B)V")
    public abstract void method1206(byte arg0);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(IIIIII)V")
    public final void method911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8950;
        float var7 = this.method1169(121);
        this.method3738(1);
        this.method3771(arg4, -9445);
        this.method3736(class324.field4001, 0, (byte) -88);
        this.method3718(0, class324.field4001, 1);
        this.method3750(false, arg5);
        this.field9108.method3158(11663, (float) (arg3 + -1), 1.0F, (float) (arg2 + -1));
        this.field9108.method3164(0.0F, (float) arg0 - var7, (float) arg1 + -var7, 1);
        this.method3761(0);
        this.method1154(false, 0);
        this.method3711(4, -22732, class498.field6379);
        this.method1154(true, 0);
        this.method3718(0, class171.field2262, 1);
        this.method3736(class171.field2262, 0, (byte) -88);
    }

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "([I)V")
    public final void method924(int[] arg0) {
        ++field9082;
        arg0[0] = this.field9144;
        arg0[3] = this.field9123;
        arg0[1] = this.field9177;
        arg0[2] = this.field9184;
    }

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "()V")
    public void method919() {
        if (!this.field9142) {
            for (class337 var1 = this.field8993.method3591(0); var1 != null; var1 = this.field8993.method3600((byte) 47)) {
                ((class512) var1).method2826(true);
            }
            Enumeration var2 = this.field8975.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method1167(this.field8975.get(var3), var3, true);
            }
            class497.method2760(true, true, false);
            this.field8985.release();
            this.field9142 = true;
        }
        ++field9000;
    }

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "(III[I)V")
    public final void method901(int arg0, int arg1, int arg2, int[] arg3) {
        ++field9061;
        float var5 = this.field9112.method3145((float) arg0, (float) arg2, 124, (float) arg1);
        int var6;
        int var7;
        if (!(var5 < -0.0078125F) && !(var5 > 0.0078125F)) {
            var6 = this.field9181;
            var7 = this.field9127;
        } else {
            var7 = (int) ((float) this.field9168 * this.field9112.method3146((float) arg2, (float) arg0, (byte) 122, (float) arg1) / var5);
            var6 = (int) ((float) this.field9169 * this.field9112.method3159(1, (float) arg2, (float) arg0, (float) arg1) / var5);
        }
        arg3[0] = (int) ((float) var7 - this.field9176);
        arg3[1] = (int) ((float) var6 + -this.field9198);
        arg3[2] = (int) var5;
    }

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "(B)V")
    private final void method3768(byte arg0) {
        ++field9087;
        this.method1152(arg0 ^ -35);
        this.method1206((byte) 126);
        this.method1187(-86);
        this.method1185((byte) 24);
        this.method1204(arg0 + 40);
        this.method1186((byte) -87);
        this.method1165((byte) 93);
        this.method1171((byte) -127);
        this.method1168(arg0 + 28949);
        this.method1202(7);
        this.method1174((byte) -123);
        this.method1164((byte) -127);
        this.method1196(arg0 ^ -33);
        if (arg0 != -35) {
            this.method1163(8);
        }
        this.method1180(arg0 ^ 38);
        for (int var2 = this.field9167 + -1; ~var2 <= -1; --var2) {
            this.method3712(arg0 + -14685, var2);
            this.method1177(-39);
            this.method1181(1);
            this.method3754(false);
        }
        this.method1192(false);
        this.method1176(14);
        this.method1149(arg0 + 35);
        this.method1159((byte) 74);
        this.method1172(0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[Lgu;)V")
    public final void method908(int arg0, class757[] arg1) {
        for (int var3 = 0; ~arg0 < ~var3; ++var3) {
            this.field9215[var3] = arg1[var3];
        }
        ++field9096;
        this.field9121 = arg0;
        if (this.field9211.method4272((byte) 84)) {
            this.method1185((byte) 24);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lhu;ZII)V")
    public abstract void method1191(class238 arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)V")
    public final void method3769(int arg0, byte arg1) {
        this.method3771(arg1 | arg1 << 8 | arg1 << 24 | arg1 << 16, -9445);
        ++field8990;
        if (arg0 != -194934736) {
            this.method1159((byte) 114);
        }
    }

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "(I)V")
    public abstract void method1177(int arg0);

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "(B)V")
    private final void method3770(byte arg0) {
        if (arg0 == 116) {
            if (!this.field9161) {
                float[] var2 = this.field9216;
                float var3 = (float) (-this.field9127 * this.field9135) / (float) this.field9168;
                float var4 = (float) ((this.field9097 - this.field9127) * this.field9135) / (float) this.field9168;
                float var5 = (float) (this.field9181 * this.field9135) / (float) this.field9169;
                float var6 = (float) ((-this.field8998 + this.field9181) * this.field9135) / (float) this.field9169;
                if (var3 != var4 && var5 != var6) {
                    float var7 = (float) this.field9135 * 2.0F;
                    var2[9] = (var5 + var6) / (-var6 + var5);
                    var2[12] = 0.0F;
                    var2[4] = 0.0F;
                    var2[13] = 0.0F;
                    var2[14] = this.field9200 = (float) (this.field9170 * this.field9135) / (float) (-this.field9170 + this.field9135);
                    var2[7] = 0.0F;
                    var2[3] = 0.0F;
                    var2[11] = -1.0F;
                    var2[10] = this.field9189 = (float) this.field9170 / (float) (this.field9135 - this.field9170);
                    var2[15] = 0.0F;
                    var2[1] = 0.0F;
                    var2[5] = var7 / (var5 - var6);
                    var2[0] = var7 / (var4 - var3);
                    var2[8] = (var3 + var4) / (-var3 + var4);
                    var2[2] = 0.0F;
                    var2[6] = 0.0F;
                } else {
                    var2[9] = 0.0F;
                    var2[2] = 0.0F;
                    var2[5] = 1.0F;
                    var2[7] = 0.0F;
                    var2[12] = 0.0F;
                    var2[10] = 1.0F;
                    var2[1] = 0.0F;
                    var2[14] = 0.0F;
                    var2[13] = 0.0F;
                    var2[15] = 1.0F;
                    var2[4] = 0.0F;
                    var2[8] = 0.0F;
                    var2[3] = 0.0F;
                    var2[11] = 0.0F;
                    var2[6] = 0.0F;
                    var2[0] = 1.0F;
                }
                this.method3732(true);
                this.field9161 = true;
            }
            ++field8973;
        }
    }

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "(B)V")
    public abstract void method1171(byte arg0);

    @OriginalMember(owner = "client!gd", name = "EA", descriptor = "(IIII)V")
    public final void method971(int arg0, int arg1, int arg2, int arg3) {
        ++field9095;
        if (!this.field9190) {
            throw new RuntimeException("");
        } else {
            this.field9145 = arg1;
            this.field9196 = arg3;
            this.field9131 = arg0;
            this.field9148 = arg2;
            if (this.field9165) {
                this.field9193[3].method1766((byte) -117);
                this.field9193[3].method196(7);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "(II)V")
    public final void method3771(int arg0, int arg1) {
        ++field8942;
        if (~this.field9212 != ~arg0) {
            this.field9212 = arg0;
            this.method1192(false);
        }
        if (arg1 != -9445) {
            this.method3744(102, (class542) null);
        }
    }

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "(I)V")
    private final void method3772(int arg0) {
        if (class107.field1455 != this.field9211) {
            class779 var2 = this.field9211;
            this.field9211 = class107.field1455;
            if (!var2.method4272((byte) 88)) {
                this.method3764(arg0 ^ 124);
            }
            this.method3715(5);
            this.field9137 = this.field9182;
            this.method3779(94);
            this.field9162 &= -8;
        }
        if (arg0 == -8) {
            ++field9092;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljaclib/memory/Buffer;B)Ljaclib/memory/Stream;")
    public final Stream method3773(Buffer arg0, byte arg1) {
        ++field8922;
        if (arg1 != -82) {
            return null;
        } else {
            this.field9150.method2520(arg0);
            return this.field9150;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(BZ)V")
    public final void method3774(byte arg0, boolean arg1) {
        if (arg0 != 46) {
            this.field9145 = -95;
        }
        ++field9020;
        if (this.field9134 != arg1) {
            this.field9134 = arg1;
            this.method1187(-65);
        }
    }

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "(Z)V")
    private final void method3775(boolean arg0) {
        if (!this.field9191) {
            float[] var2 = this.field9117;
            if (this.field9097 != 0 && ~this.field8998 != -1) {
                var2[10] = 0.5F;
                var2[13] = 1.0F;
                var2[9] = 0.0F;
                var2[15] = 1.0F;
                var2[2] = 0.0F;
                var2[14] = 0.5F;
                var2[12] = -1.0F;
                var2[1] = 0.0F;
                var2[0] = 2.0F / (float) this.field9097;
                var2[6] = 0.0F;
                var2[11] = 0.0F;
                var2[3] = 0.0F;
                var2[5] = -2.0F / (float) this.field8998;
                var2[4] = 0.0F;
                var2[7] = 0.0F;
                var2[8] = 0.0F;
            } else {
                var2[4] = 0.0F;
                var2[12] = 0.0F;
                var2[15] = 1.0F;
                var2[0] = 1.0F;
                var2[5] = 1.0F;
                var2[14] = 0.0F;
                var2[13] = 0.0F;
                var2[7] = 0.0F;
                var2[10] = 1.0F;
                var2[1] = 0.0F;
                var2[11] = 0.0F;
                var2[8] = 0.0F;
                var2[3] = 0.0F;
                var2[2] = 0.0F;
                var2[9] = 0.0F;
                var2[6] = 0.0F;
            }
            this.field9191 = true;
        }
        if (arg0) {
            this.field9149 = 122;
        }
        ++field9083;
    }

    @OriginalMember(owner = "client!gd", name = "za", descriptor = "(IIIII)V")
    public final void method998(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field9013;
        this.method3738(1);
        this.method3771(arg3, -9445);
        this.method3736(class324.field4001, 0, (byte) -88);
        this.method3718(0, class324.field4001, 1);
        this.method3750(false, arg4);
        this.field9108.method3158(11663, (float) arg2, 1.0F, (float) arg2);
        this.field9108.method450(arg0, arg1, 0);
        this.method3761(0);
        this.method1154(false, 0);
        this.method1200((byte) -93, 0, this.field9238);
        this.method1150(this.field9236, 0);
        this.method1191(class467.field6043, false, 0, 256);
        this.method1154(true, 0);
        this.method3718(0, class171.field2262, 1);
        this.method3736(class171.field2262, 0, (byte) -88);
    }

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "(I)V")
    public final void method944(int arg0) {
        this.field9201 = 0;
        ++field8982;
        while (arg0 > 1) {
            arg0 >>= 1;
            ++this.field9201;
        }
        this.field9139 = 1 << this.field9201;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Loga;I)V")
    public final void method3776(class588 arg0, int arg1) {
        this.field9108.method468(arg0);
        if (arg1 == 262144) {
            ++field9085;
            this.field9105 = false;
            this.method3723(arg1 ^ -268131);
        }
    }

    @OriginalMember(owner = "client!gd", name = "DA", descriptor = "(IIII)V")
    public final void method967(int arg0, int arg1, int arg2, int arg3) {
        this.field9127 = arg0;
        this.field9169 = arg3;
        this.field9181 = arg1;
        ++field9074;
        this.field9168 = arg2;
        this.method3787((byte) 95);
        this.method3777(61);
        this.method3742(false);
        this.method3708(23239);
    }

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "(I)V")
    private final void method3777(int arg0) {
        int var2 = 13 / ((-13 - arg0) / 61);
        ++field9072;
        this.field9161 = false;
        this.method3770((byte) 116);
        if (class7.field68 == this.field9211) {
            this.method3779(97);
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(IZ)V")
    public final void method3778(int arg0, boolean arg1) {
        if (arg1 == !this.field9130) {
            this.field9130 = arg1;
            this.method1202(7);
        }
        if (arg0 != 0) {
            this.method3728(false);
        }
        ++field8932;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[Lls;)Lco;")
    public abstract class753 method1175(int arg0, class592[] arg1);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZIIB[III)Lw;")
    public abstract class471 method1207(boolean arg0, int arg1, int arg2, byte arg3, int[] arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "(Z)V")
    public abstract void method1160(boolean arg0);

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "(I)V")
    private final void method3779(int arg0) {
        ++field8954;
        int var2 = 13 / ((-64 - arg0) / 40);
        this.method1149(0);
        if (this.field9195 != null) {
            this.field9195.method203((byte) 13);
        }
    }

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "(I)V")
    public final void method982(int arg0) {
        ++field8953;
    }

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "(Z)V")
    public abstract void method1192(boolean arg0);

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public final void method892(int arg0) {
        ++field9001;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public final void method932(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class596 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field8947;
    }

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "(I)Loga;")
    public final class588 method3780(int arg0) {
        if (arg0 != 1) {
            return null;
        } else {
            ++field8926;
            return this.field9114;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public final class358 method890(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field9067;
        return new class574(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[[S[[F)[[S")
    public static final short[][] method3781(int arg0, short[][] arg1, float[][] arg2) {
        for (int var3 = 0; ~var3 > ~arg2.length; ++var3) {
            for (int var4 = 0; ~var4 > ~arg1[var3].length; ++var4) {
                arg1[var3][var4] = (short) ((int) (arg2[var3][var4] * 16383.0F));
            }
        }
        if (arg0 <= 114) {
            method3762((byte[]) null, -38);
        }
        ++field9003;
        return arg1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
    public final void method984(boolean arg0) {
        ++field8991;
    }

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "(I)V")
    private final void method3782(int arg0) {
        this.field9238 = this.method1162((byte) 31, false);
        ++field9045;
        this.field9238.method283(3096, 12, -21048);
        for (int var2 = arg0; ~var2 > -5; ++var2) {
            Buffer var3 = this.field9238.method286(16561, true);
            if (var3 != null) {
                Stream var4 = this.method3773(var3, (byte) -82);
                var4.method2518(0.0F);
                var4.method2518(0.0F);
                var4.method2518(0.0F);
                for (int var5 = 0; var5 <= 256; ++var5) {
                    double var6 = (double) (var5 * 2) * 3.141592653589793D / 256.0D;
                    float var8 = (float) Math.cos(var6);
                    float var9 = (float) Math.sin(var6);
                    if (!Stream.method2528()) {
                        var4.method2524(var9);
                        var4.method2524(var8);
                        var4.method2524(0.0F);
                    } else {
                        var4.method2518(var9);
                        var4.method2518(var8);
                        var4.method2518(0.0F);
                    }
                }
                var4.method2519();
                if (this.field9238.method288(-12162)) {
                    break;
                }
            }
        }
        this.field9236 = this.method1175(-100, new class592[] { new class592(class604.field7665) });
    }

    @OriginalMember(owner = "client!gd", name = "KA", descriptor = "(IIII)V")
    public final void method915(int arg0, int arg1, int arg2, int arg3) {
        ++field9052;
        if (arg0 <= 0 && arg2 >= this.field9097 + -1 && arg1 <= 0 && this.field8998 - 1 <= arg3) {
            this.method957();
        } else {
            this.field9123 = ~arg3 < ~this.field9097 ? 0 : arg3;
            this.field9184 = ~this.field9097 <= ~arg2 ? arg2 : 0;
            this.field9177 = ~arg1 > -1 ? 0 : arg1;
            this.field9144 = arg0 >= 0 ? arg0 : 0;
            if (!this.field9240) {
                this.field9240 = true;
                this.method1163(14);
            }
            this.method1153(-98);
            this.method3708(23239);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIII)V")
    public final void method935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8940;
        float var8 = (float) arg2 - (float) arg0;
        float var9 = (float) arg3 - (float) arg1;
        float var10 = 0.0F;
        float var11 = 1.0F;
        if (var8 != 0.0F || var9 != 0.0F) {
            var11 = (float) Math.sqrt((double) (var8 * var8 + var9 * var9));
            var10 = (float) Math.atan2((double) var9, (double) var8);
        }
        this.method3738(1);
        this.method3771(arg4, -9445);
        this.method3736(class324.field4001, 0, (byte) -88);
        this.method3718(0, class324.field4001, 1);
        this.method3750(false, arg6);
        this.field9108.method3158(11663, (float) arg5, 1.0F, var11);
        this.field9108.method450(0, -arg5 / 2, 0);
        this.field9108.method456((int) ((double) var10 * 2607.5945876176133D) & 16383);
        this.field9108.method450(arg0, arg1, 0);
        this.method3761(0);
        this.method1154(false, 0);
        this.method3731((byte) 112);
        this.method1154(true, 0);
        this.method3718(0, class171.field2262, 1);
        this.method3736(class171.field2262, 0, (byte) -88);
    }

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "(I)Loga;")
    public final class588 method3783(int arg0) {
        if (arg0 <= 26) {
            return null;
        } else {
            ++field9103;
            return this.field9108;
        }
    }

    @OriginalMember(owner = "client!gd", name = "XA", descriptor = "()I")
    public final int method985() {
        ++field8995;
        return this.field9170;
    }

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "(I)Loga;")
    public final class588 method3784(int arg0) {
        if (arg0 != -15173) {
            this.method880();
        }
        ++field9053;
        return this.field9115;
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(II)V")
    public final void method976(int arg0, int arg1) {
        ++field8928;
        if (~this.field9135 != ~arg0 || this.field9170 != arg1) {
            this.field9170 = arg1;
            this.field9135 = arg0;
            this.method3777(-122);
            this.method3787((byte) 95);
            this.method3789(true);
        }
    }

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "(IIIIII[BII)V")
    public final void method954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field9100;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLjava/awt/Canvas;)Ljava/lang/Object;")
    public abstract Object method1183(boolean arg0, Canvas arg1);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZI[FIILtn;I)Lw;")
    public abstract class471 method1190(int arg0, boolean arg1, int arg2, float[] arg3, int arg4, int arg5, class749 arg6, int arg7);

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "(I)V")
    public abstract void method1149(int arg0);

    @OriginalMember(owner = "client!gd", name = "gb", descriptor = "(I)I")
    public final int method3785(int arg0) {
        if (arg0 != 3261) {
            return 75;
        } else {
            ++field9040;
            return this.field9131;
        }
    }

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "()V")
    public final void method909() {
        if (this.field9185 != null) {
            this.field9185.method663(-1);
        }
        ++field8978;
    }

    @OriginalMember(owner = "client!gd", name = "hb", descriptor = "(I)V")
    private final void method3786(int arg0) {
        if (arg0 != -30504) {
            this.method3785(-81);
        }
        ++field9079;
        this.field9191 = false;
        if (class581.field7355 == this.field9211) {
            this.method3775(false);
            this.method3779(-104);
        }
    }

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "(B)V")
    private final void method3787(byte arg0) {
        if (arg0 == 95) {
            this.field9118 = false;
            ++field8935;
            this.method3715(5);
            if (class107.field1455 == this.field9211) {
                this.method3779(-105);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIZBIZ)V")
    private final void method3788(int arg0, int arg1, boolean arg2, byte arg3, int arg4, boolean arg5) {
        ++field8937;
        boolean var7 = arg2 & this.method917();
        if (!var7 && (arg4 == 4 || arg4 == 8 || ~arg4 == -10)) {
            arg4 = 2;
            arg0 = arg4 == 4 ? 1 & arg1 : 1;
            arg1 = 0;
        }
        if (arg4 != 0 && arg5) {
            arg4 |= Integer.MIN_VALUE;
        }
        int var8 = 43 / ((arg3 - -18) / 56);
        if (this.field9149 != arg4) {
            if (~this.field9149 != -1) {
                this.field9193[this.field9149 & Integer.MAX_VALUE].method205(0);
            }
            if (~arg4 != -1) {
                this.field9195 = this.field9193[Integer.MAX_VALUE & arg4];
                this.field9195.method201(91, arg5);
                this.field9195.method202(arg5, false);
                this.field9195.method204((byte) 54, arg0, arg1);
            } else {
                this.field9195 = null;
            }
            this.field9149 = arg4;
            this.field9199 = arg1;
            this.field9157 = arg0;
        } else if (this.field9149 != 0) {
            this.field9193[this.field9149 & Integer.MAX_VALUE].method202(arg5, false);
            if (~this.field9199 != ~arg1 || this.field9157 != arg0) {
                this.field9193[this.field9149 & Integer.MAX_VALUE].method204((byte) 43, arg0, arg1);
                this.field9157 = arg0;
                this.field9199 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "()Z")
    public final boolean method965() {
        ++field9007;
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "(Z)V")
    private final void method3789(boolean arg0) {
        if (!arg0) {
            this.method3724(-70);
        }
        ++field8943;
        if (this.field9195 != null) {
            this.field9195.method196(7);
        }
        this.method1174((byte) -83);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZBI)Ljaclib/memory/heap/NativeHeapBuffer;")
    public final NativeHeapBuffer method3790(boolean arg0, byte arg1, int arg2) {
        ++field9012;
        if (arg1 != 20) {
            this.field9206 = 40;
        }
        return this.field9022.method2532(arg2, arg0);
    }

    @OriginalMember(owner = "client!gd", name = "ib", descriptor = "(I)V")
    private final void method3791(int arg0) {
        ++field9110;
        this.method1194(2);
        if (this.field9195 != null) {
            this.field9195.method198((byte) 34);
        }
        if (arg0 != 0) {
            this.method948();
        }
    }
}
