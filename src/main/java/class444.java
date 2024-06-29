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

@OriginalClass("client!cb")
public abstract class class444 extends class208 {

    @OriginalMember(owner = "client!cb", name = "sd", descriptor = "Lbu;")
    private class19 field6063 = new class19();

    @OriginalMember(owner = "client!cb", name = "Dd", descriptor = "Z")
    public boolean field6074 = true;

    @OriginalMember(owner = "client!cb", name = "Ld", descriptor = "Lqn;")
    public class57 field6082 = new class57();

    @OriginalMember(owner = "client!cb", name = "Vd", descriptor = "Lqn;")
    public class57 field6092 = new class57();

    @OriginalMember(owner = "client!cb", name = "Wd", descriptor = "Lqn;")
    public class57 field6093 = new class57();

    @OriginalMember(owner = "client!cb", name = "Xd", descriptor = "Lqn;")
    public class57 field6094 = new class57();

    @OriginalMember(owner = "client!cb", name = "Yd", descriptor = "Lqn;")
    private class57 field6095 = new class57();

    @OriginalMember(owner = "client!cb", name = "Zd", descriptor = "Lqn;")
    private class57 field6096 = new class57();

    @OriginalMember(owner = "client!cb", name = "ke", descriptor = "F")
    public float field6107 = 1.0F;

    @OriginalMember(owner = "client!cb", name = "fe", descriptor = "Z")
    private boolean field6102 = false;

    @OriginalMember(owner = "client!cb", name = "ce", descriptor = "I")
    public int field6099 = 0;

    @OriginalMember(owner = "client!cb", name = "je", descriptor = "F")
    private float field6106 = 3000.0F;

    @OriginalMember(owner = "client!cb", name = "le", descriptor = "I")
    private int field6108 = 0;

    @OriginalMember(owner = "client!cb", name = "he", descriptor = "I")
    private int field6104 = -1;

    @OriginalMember(owner = "client!cb", name = "Ce", descriptor = "I")
    private int field6125 = 0;

    @OriginalMember(owner = "client!cb", name = "Me", descriptor = "F")
    private float field6135 = 1.0F;

    @OriginalMember(owner = "client!cb", name = "De", descriptor = "F")
    public float field6126 = -1.0F;

    @OriginalMember(owner = "client!cb", name = "ze", descriptor = "Z")
    public boolean field6122 = false;

    @OriginalMember(owner = "client!cb", name = "Ne", descriptor = "I")
    private int field6136 = 0;

    @OriginalMember(owner = "client!cb", name = "ve", descriptor = "F")
    public float field6118 = 3584.0F;

    @OriginalMember(owner = "client!cb", name = "Je", descriptor = "I")
    public int field6132 = 0;

    @OriginalMember(owner = "client!cb", name = "we", descriptor = "[Lgl;")
    private class516[] field6119 = new class516[10];

    @OriginalMember(owner = "client!cb", name = "Qe", descriptor = "Z")
    private boolean field6139 = false;

    @OriginalMember(owner = "client!cb", name = "xe", descriptor = "I")
    private int field6120 = 1;

    @OriginalMember(owner = "client!cb", name = "pe", descriptor = "I")
    private int field6112 = 0;

    @OriginalMember(owner = "client!cb", name = "Ke", descriptor = "I")
    public int field6133 = 0;

    @OriginalMember(owner = "client!cb", name = "Te", descriptor = "Z")
    public boolean field6142 = true;

    @OriginalMember(owner = "client!cb", name = "kf", descriptor = "[F")
    private float[] field6158 = new float[16];

    @OriginalMember(owner = "client!cb", name = "Ae", descriptor = "[F")
    public float[] field6123 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };

    @OriginalMember(owner = "client!cb", name = "Ze", descriptor = "[F")
    private float[] field6148 = new float[16];

    @OriginalMember(owner = "client!cb", name = "hf", descriptor = "I")
    public int field6156 = 3;

    @OriginalMember(owner = "client!cb", name = "ef", descriptor = "I")
    public int field6153 = -1;

    @OriginalMember(owner = "client!cb", name = "ne", descriptor = "[F")
    private float[] field6110 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!cb", name = "Ye", descriptor = "I")
    public int field6147 = -1;

    @OriginalMember(owner = "client!cb", name = "pf", descriptor = "F")
    public float field6163 = -1.0F;

    @OriginalMember(owner = "client!cb", name = "bf", descriptor = "I")
    public int field6150 = 0;

    @OriginalMember(owner = "client!cb", name = "df", descriptor = "I")
    public int field6152 = 0;

    @OriginalMember(owner = "client!cb", name = "of", descriptor = "I")
    public int field6162 = -1;

    @OriginalMember(owner = "client!cb", name = "zf", descriptor = "Z")
    public boolean field6173 = false;

    @OriginalMember(owner = "client!cb", name = "nf", descriptor = "I")
    public int field6161 = 50;

    @OriginalMember(owner = "client!cb", name = "yf", descriptor = "I")
    public int field6172 = 0;

    @OriginalMember(owner = "client!cb", name = "se", descriptor = "I")
    public int field6115 = 3584;

    @OriginalMember(owner = "client!cb", name = "cf", descriptor = "[F")
    private float[] field6151 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!cb", name = "ff", descriptor = "Lhn;")
    public class616 field6154 = client.field3637;

    @OriginalMember(owner = "client!cb", name = "tf", descriptor = "Z")
    public boolean field6167 = true;

    @OriginalMember(owner = "client!cb", name = "Le", descriptor = "[F")
    public float[] field6134 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!cb", name = "gf", descriptor = "Z")
    public boolean field6155 = true;

    @OriginalMember(owner = "client!cb", name = "uf", descriptor = "Z")
    private boolean field6168 = false;

    @OriginalMember(owner = "client!cb", name = "re", descriptor = "I")
    public int field6114 = 0;

    @OriginalMember(owner = "client!cb", name = "xf", descriptor = "I")
    public int field6171 = 8;

    @OriginalMember(owner = "client!cb", name = "Of", descriptor = "I")
    public int field6188 = 512;

    @OriginalMember(owner = "client!cb", name = "Ee", descriptor = "I")
    private int field6127 = -1;

    @OriginalMember(owner = "client!cb", name = "oe", descriptor = "Z")
    public boolean field6111 = false;

    @OriginalMember(owner = "client!cb", name = "If", descriptor = "Lmo;")
    public class638 field6182 = class44.field518;

    @OriginalMember(owner = "client!cb", name = "rf", descriptor = "F")
    public float field6165 = 1.0F;

    @OriginalMember(owner = "client!cb", name = "Jf", descriptor = "I")
    public int field6183 = 0;

    @OriginalMember(owner = "client!cb", name = "Qf", descriptor = "F")
    public float field6190 = 1.0F;

    @OriginalMember(owner = "client!cb", name = "Gf", descriptor = "Z")
    public boolean field6180 = true;

    @OriginalMember(owner = "client!cb", name = "He", descriptor = "I")
    public int field6130 = 0;

    @OriginalMember(owner = "client!cb", name = "Lf", descriptor = "[F")
    private float[] field6185 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };

    @OriginalMember(owner = "client!cb", name = "ee", descriptor = "F")
    public float field6101 = 3584.0F;

    @OriginalMember(owner = "client!cb", name = "Cf", descriptor = "F")
    public float field6176 = 1.0F;

    @OriginalMember(owner = "client!cb", name = "Df", descriptor = "[F")
    private float[] field6177 = new float[16];

    @OriginalMember(owner = "client!cb", name = "Sf", descriptor = "I")
    public int field6192 = 0;

    @OriginalMember(owner = "client!cb", name = "Pf", descriptor = "I")
    public int field6189 = 128;

    @OriginalMember(owner = "client!cb", name = "Nf", descriptor = "Z")
    public boolean field6187 = false;

    @OriginalMember(owner = "client!cb", name = "Uf", descriptor = "Z")
    public boolean field6194 = true;

    @OriginalMember(owner = "client!cb", name = "Mf", descriptor = "Z")
    private boolean field6186 = false;

    @OriginalMember(owner = "client!cb", name = "Tf", descriptor = "I")
    private int field6193 = 16777215;

    @OriginalMember(owner = "client!cb", name = "Hf", descriptor = "I")
    public int field6181 = 512;

    @OriginalMember(owner = "client!cb", name = "Wf", descriptor = "[F")
    public float[] field6196 = this.field6110;

    @OriginalMember(owner = "client!cb", name = "Yf", descriptor = "Z")
    private boolean field6198 = false;

    @OriginalMember(owner = "client!cb", name = "We", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6145 = new Stream();

    @OriginalMember(owner = "client!cb", name = "Zf", descriptor = "Lqn;")
    private class57 field6199 = new class57();

    @OriginalMember(owner = "client!cb", name = "yb", descriptor = "Ljava/awt/Canvas;")
    public Canvas field5965;

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5922;

    @OriginalMember(owner = "client!cb", name = "vd", descriptor = "Lkda;")
    public class328 field6066;

    @OriginalMember(owner = "client!cb", name = "Ef", descriptor = "I")
    public int field6178;

    @OriginalMember(owner = "client!cb", name = "Fb", descriptor = "Ljava/lang/Object;")
    public Object field5972;

    @OriginalMember(owner = "client!cb", name = "Mb", descriptor = "Ljava/lang/Object;")
    private Object field5979;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    private int field5911;

    @OriginalMember(owner = "client!cb", name = "Zc", descriptor = "I")
    public int field6044;

    @OriginalMember(owner = "client!cb", name = "Ie", descriptor = "I")
    public int field6131;

    @OriginalMember(owner = "client!cb", name = "Xb", descriptor = "I")
    private int field5990;

    @OriginalMember(owner = "client!cb", name = "Ib", descriptor = "I")
    public int field5975;

    @OriginalMember(owner = "client!cb", name = "Vf", descriptor = "Lpo;")
    private class479 field6195;

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "Ljagex3/graphics2/hw/NativeInterface;")
    public NativeInterface field5945;

    @OriginalMember(owner = "client!cb", name = "Ub", descriptor = "[I")
    public static int[] field5987 = new int[250];

    @OriginalMember(owner = "client!cb", name = "ec", descriptor = "[I")
    public static int[] field5997 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!cb", name = "ae", descriptor = "F")
    public float field6097;

    @OriginalMember(owner = "client!cb", name = "ie", descriptor = "F")
    public float field6105;

    @OriginalMember(owner = "client!cb", name = "qe", descriptor = "F")
    public float field6113;

    @OriginalMember(owner = "client!cb", name = "ye", descriptor = "F")
    private float field6121;

    @OriginalMember(owner = "client!cb", name = "Pe", descriptor = "F")
    public float field6138;

    @OriginalMember(owner = "client!cb", name = "jf", descriptor = "F")
    private float field6157;

    @OriginalMember(owner = "client!cb", name = "mf", descriptor = "F")
    public float field6160;

    @OriginalMember(owner = "client!cb", name = "qf", descriptor = "F")
    private float field6164;

    @OriginalMember(owner = "client!cb", name = "Kf", descriptor = "F")
    public float field6184;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!cb", name = "gb", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!cb", name = "hb", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!cb", name = "ib", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!cb", name = "jb", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!cb", name = "kb", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!cb", name = "lb", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!cb", name = "mb", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!cb", name = "nb", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!cb", name = "ob", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!cb", name = "pb", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!cb", name = "qb", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!cb", name = "rb", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!cb", name = "sb", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!cb", name = "tb", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!cb", name = "ub", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!cb", name = "vb", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!cb", name = "wb", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!cb", name = "xb", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!cb", name = "zb", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!cb", name = "Ab", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!cb", name = "Bb", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!cb", name = "Cb", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!cb", name = "Db", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!cb", name = "Eb", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!cb", name = "Gb", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!cb", name = "Hb", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!cb", name = "Jb", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!cb", name = "Kb", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!cb", name = "Lb", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!cb", name = "Nb", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!cb", name = "Ob", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!cb", name = "Pb", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!cb", name = "Qb", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!cb", name = "Rb", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!cb", name = "Sb", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!cb", name = "Tb", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!cb", name = "Vb", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!cb", name = "Wb", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!cb", name = "Yb", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!cb", name = "Zb", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!cb", name = "ac", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!cb", name = "bc", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!cb", name = "cc", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!cb", name = "dc", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!cb", name = "fc", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!cb", name = "gc", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!cb", name = "hc", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!cb", name = "ic", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!cb", name = "jc", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!cb", name = "kc", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!cb", name = "lc", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!cb", name = "mc", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!cb", name = "nc", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!cb", name = "oc", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!cb", name = "pc", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!cb", name = "qc", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!cb", name = "rc", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!cb", name = "sc", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!cb", name = "tc", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!cb", name = "uc", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!cb", name = "vc", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!cb", name = "wc", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!cb", name = "yc", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!cb", name = "zc", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!cb", name = "Ac", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!cb", name = "Bc", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!cb", name = "Cc", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!cb", name = "Dc", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!cb", name = "Ec", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!cb", name = "Fc", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!cb", name = "Gc", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!cb", name = "Hc", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!cb", name = "Ic", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!cb", name = "Jc", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!cb", name = "Kc", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!cb", name = "Lc", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!cb", name = "Mc", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!cb", name = "Nc", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!cb", name = "Oc", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!cb", name = "Pc", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!cb", name = "Qc", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!cb", name = "Rc", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!cb", name = "Sc", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!cb", name = "Tc", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!cb", name = "Uc", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!cb", name = "Vc", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!cb", name = "Wc", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!cb", name = "Xc", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!cb", name = "Yc", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!cb", name = "ad", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!cb", name = "bd", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!cb", name = "cd", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!cb", name = "ed", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!cb", name = "fd", descriptor = "I")
    public static int field6050;

    @OriginalMember(owner = "client!cb", name = "gd", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!cb", name = "hd", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!cb", name = "jd", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!cb", name = "kd", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!cb", name = "ld", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!cb", name = "md", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!cb", name = "nd", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!cb", name = "od", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!cb", name = "pd", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!cb", name = "qd", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!cb", name = "rd", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!cb", name = "td", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!cb", name = "ud", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!cb", name = "wd", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!cb", name = "xd", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!cb", name = "yd", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!cb", name = "zd", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!cb", name = "Ad", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!cb", name = "Bd", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!cb", name = "Cd", descriptor = "I")
    public int field6073;

    @OriginalMember(owner = "client!cb", name = "Ed", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!cb", name = "Fd", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!cb", name = "Gd", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!cb", name = "Hd", descriptor = "I")
    public int field6078;

    @OriginalMember(owner = "client!cb", name = "Id", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!cb", name = "Jd", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!cb", name = "Kd", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!cb", name = "Md", descriptor = "I")
    public int field6083;

    @OriginalMember(owner = "client!cb", name = "Nd", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!cb", name = "Od", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!cb", name = "Pd", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!cb", name = "Qd", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!cb", name = "Rd", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!cb", name = "Sd", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!cb", name = "Td", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!cb", name = "Ud", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!cb", name = "de", descriptor = "I")
    public int field6100;

    @OriginalMember(owner = "client!cb", name = "Be", descriptor = "I")
    public int field6124;

    @OriginalMember(owner = "client!cb", name = "Fe", descriptor = "I")
    public int field6128;

    @OriginalMember(owner = "client!cb", name = "Ge", descriptor = "I")
    public int field6129;

    @OriginalMember(owner = "client!cb", name = "Re", descriptor = "I")
    private int field6140;

    @OriginalMember(owner = "client!cb", name = "Xe", descriptor = "I")
    public int field6146;

    @OriginalMember(owner = "client!cb", name = "af", descriptor = "I")
    public int field6149;

    @OriginalMember(owner = "client!cb", name = "sf", descriptor = "I")
    private int field6166;

    @OriginalMember(owner = "client!cb", name = "Bf", descriptor = "I")
    public int field6175;

    @OriginalMember(owner = "client!cb", name = "Rf", descriptor = "I")
    public int field6191;

    @OriginalMember(owner = "client!cb", name = "tg", descriptor = "I")
    private int field6219;

    @OriginalMember(owner = "client!cb", name = "peer", descriptor = "J")
    public long peer;

    @OriginalMember(owner = "client!cb", name = "cg", descriptor = "Lli;")
    public class364 field6202;

    @OriginalMember(owner = "client!cb", name = "dg", descriptor = "Lli;")
    public class364 field6203;

    @OriginalMember(owner = "client!cb", name = "eg", descriptor = "Lli;")
    public class364 field6204;

    @OriginalMember(owner = "client!cb", name = "fg", descriptor = "Lli;")
    public class364 field6205;

    @OriginalMember(owner = "client!cb", name = "kg", descriptor = "Lli;")
    public class364 field6210;

    @OriginalMember(owner = "client!cb", name = "ng", descriptor = "Lli;")
    public class364 field6213;

    @OriginalMember(owner = "client!cb", name = "og", descriptor = "Lli;")
    public class364 field6214;

    @OriginalMember(owner = "client!cb", name = "pg", descriptor = "Lli;")
    public class364 field6215;

    @OriginalMember(owner = "client!cb", name = "rg", descriptor = "Lli;")
    public class364 field6217;

    @OriginalMember(owner = "client!cb", name = "sg", descriptor = "Lli;")
    public class364 field6218;

    @OriginalMember(owner = "client!cb", name = "gg", descriptor = "Laf;")
    private class370 field6206;

    @OriginalMember(owner = "client!cb", name = "xc", descriptor = "Ljq;")
    public class438 field6016;

    @OriginalMember(owner = "client!cb", name = "me", descriptor = "Lgl;")
    private class516 field6109;

    @OriginalMember(owner = "client!cb", name = "ag", descriptor = "Lsk;")
    private class532 field6200;

    @OriginalMember(owner = "client!cb", name = "hg", descriptor = "Lsk;")
    public class532 field6207;

    @OriginalMember(owner = "client!cb", name = "jg", descriptor = "Lsk;")
    public class532 field6209;

    @OriginalMember(owner = "client!cb", name = "lg", descriptor = "Lsk;")
    public class532 field6211;

    @OriginalMember(owner = "client!cb", name = "mg", descriptor = "Lsk;")
    private class532 field6212;

    @OriginalMember(owner = "client!cb", name = "qg", descriptor = "Lsk;")
    public class532 field6216;

    @OriginalMember(owner = "client!cb", name = "Ve", descriptor = "Lpda;")
    private class538 field6144;

    @OriginalMember(owner = "client!cb", name = "Ff", descriptor = "Lpb;")
    public class563 field6179;

    @OriginalMember(owner = "client!cb", name = "bg", descriptor = "Lql;")
    private class628 field6201;

    @OriginalMember(owner = "client!cb", name = "ig", descriptor = "Lql;")
    private class628 field6208;

    @OriginalMember(owner = "client!cb", name = "te", descriptor = "Lto;")
    private class8 field6116;

    @OriginalMember(owner = "client!cb", name = "id", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field6053;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    public NativeHeapBuffer field5907;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "Ljava/util/Hashtable;")
    private Hashtable field5905;

    @OriginalMember(owner = "client!cb", name = "ue", descriptor = "Z")
    public boolean field6117;

    @OriginalMember(owner = "client!cb", name = "Se", descriptor = "Z")
    public boolean field6141;

    @OriginalMember(owner = "client!cb", name = "Ue", descriptor = "Z")
    public boolean field6143;

    @OriginalMember(owner = "client!cb", name = "lf", descriptor = "Z")
    public boolean field6159;

    @OriginalMember(owner = "client!cb", name = "wf", descriptor = "Z")
    public boolean field6170;

    @OriginalMember(owner = "client!cb", name = "ug", descriptor = "Z")
    public boolean field6220;

    @OriginalMember(owner = "client!cb", name = "Af", descriptor = "[Lus;")
    public class1[] field6174;

    @OriginalMember(owner = "client!cb", name = "Xf", descriptor = "[Lus;")
    public class1[] field6197;

    @OriginalMember(owner = "client!cb", name = "Oe", descriptor = "[Lkv;")
    public class227[] field6137;

    @OriginalMember(owner = "client!cb", name = "vf", descriptor = "[Lnm;")
    public class405[] field6169;

    @OriginalMember(owner = "client!cb", name = "dd", descriptor = "[Liq;")
    public static class521[] field6048;

    @OriginalMember(owner = "client!cb", name = "be", descriptor = "[Lpb;")
    private class563[] field6098;

    @OriginalMember(owner = "client!cb", name = "ge", descriptor = "[Lqn;")
    public class57[] field6103;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZB)V", line = 4)
    public final void method2566(boolean arg0, byte arg1) {
        if (!this.field6187 == arg0) {
            this.field6187 = arg0;
            this.method2571(0);
        }
        ++field5951;
        int var3 = -6 % ((arg1 - -3) / 46);
    }

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "()I", line = 20)
    public final int method513() {
        ++field5943;
        return this.field6129 + -2;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIII)V", line = 29)
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5932;
        float var7 = this.method2580((byte) 102);
        this.method2616((byte) -10);
        this.method2688(arg4, 28366);
        this.method2598(class314.field4331, 0, (byte) 59);
        this.method2655(0, -90, class314.field4331);
        this.method2650(arg5, (byte) 35);
        this.field6082.method381(1.0F, (float) (arg2 - 1), (float) (arg3 - 1), (byte) -60);
        this.field6082.method366((float) arg1 - var7, 0.0F, (float) arg0 + -var7, -6701);
        this.method2576((byte) 28);
        this.method2573(false, (byte) -85);
        this.method2588(class237.field3418, 4, 0);
        this.method2573(true, (byte) -112);
        this.method2655(0, -57, class453.field6405);
        this.method2598(class453.field6405, 0, (byte) 59);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lrd;)V", line = 51)
    public final void method488(class283 arg0) {
        this.field6116.method38(84, arg0, this);
        ++field5981;
    }

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "(I)V", line = 60)
    public final void method2569(int arg0) {
        if (this.field6166 != 8) {
            this.method2626(110);
            this.method2667(true, arg0 ^ -14395);
            this.method2657(true, -32);
            this.method2644(-49, true);
            this.method2650(1, (byte) 35);
            this.field6166 = 8;
        }
        if (arg0 != -14449) {
            this.method2611((byte) 107);
        }
        ++field6054;
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "()Z", line = 80)
    public final boolean method430() {
        ++field5956;
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lfd;IIII)Lr;", line = 90)
    public final class159 method491(class451 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6060;
        return new class364(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[I[I)Lpa;", line = 98)
    public final class311 method526(int arg0, int arg1, int[] arg2, int[] arg3) {
        ++field5954;
        return class410.method2409(arg0, arg1, 90, arg2, arg3, this);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)I", line = 106)
    public final int method478(int arg0, int arg1) {
        ++field5985;
        return arg1 | arg0;
    }

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "(I)V", line = 115)
    private final void method2572(int arg0) {
        if (arg0 != 1) {
            this.method426((class345) null);
        }
        ++field5959;
        if (class87.field1295 != this.field6154) {
            class616 var2 = this.field6154;
            this.field6154 = class87.field1295;
            if (var2.method3612(arg0 ^ -115)) {
                this.method2630(true);
            }
            this.method2590((byte) 68);
            this.field6196 = this.field6158;
            this.method2670(arg0 + -1);
            this.field6166 &= -25;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BZ)V", line = 142)
    public final void method2574(byte arg0, boolean arg1) {
        ++field5961;
        if (arg0 >= 105) {
            if (!this.field6167 == arg1) {
                this.field6167 = arg1;
                this.method2591(15385);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V", line = 162)
    public final void method2576(byte arg0) {
        this.field6074 = false;
        ++field6002;
        if (arg0 != 28) {
            this.field6114 = 110;
        }
        this.method2639(0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 175)
    public final void method461(int arg0) {
        ++field5947;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)I", line = 185)
    public final int method2577(byte arg0) {
        ++field5944;
        if (arg0 != -85) {
            this.method2668((byte) 91, (Object) null, (Canvas) null);
        }
        return this.field6125;
    }

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "()I", line = 196)
    public final int method454() {
        ++field6020;
        return this.field6083 + this.field6078 + this.field6073;
    }

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "()F", line = 205)
    public final float method450() {
        ++field6047;
        return this.field6106;
    }

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "(I)Lqn;", line = 218)
    public final class57 method2579(int arg0) {
        if (!this.field6102) {
            this.field6096.method365(this.field6094, this.field6082);
            this.field6102 = true;
        }
        ++field6065;
        int var2 = -93 % ((-11 - arg0) / 36);
        return this.field6096;
    }

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "()Z", line = 239)
    public final boolean method486() {
        ++field5918;
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lqm;Z)Lha;", line = 248)
    public final class53 method474(class126 arg0, boolean arg1) {
        ++field5940;
        class53 var9;
        if (arg0.field1767 != 0 && ~arg0.field1771 != -1) {
            int[] var3 = new int[arg0.field1771 * arg0.field1767];
            int var4 = 0;
            int var5 = 0;
            if (arg0.field1769 != null) {
                for (int var6 = 0; var6 < arg0.field1771; ++var6) {
                    for (int var7 = 0; ~var7 > ~arg0.field1767; ++var7) {
                        var3[var5++] = class473.method2847(arg0.field1772[class37.method245(255, arg0.field1773[var4])], arg0.field1769[var4] << 24);
                        ++var4;
                    }
                }
            } else {
                for (int var8 = 0; arg0.field1771 > var8; ++var8) {
                    for (int var10 = 0; var10 < arg0.field1767; ++var10) {
                        int var11 = arg0.field1772[255 & arg0.field1773[var4++]];
                        var3[var5++] = ~var11 != -1 ? class473.method2847(var11, -16777216) : 0;
                    }
                }
            }
            var9 = this.method466(var3, 0, arg0.field1767, arg0.field1767, arg0.field1771);
        } else {
            var9 = this.method466(new int[1], 0, 1, 1, 1);
        }
        var9.method324(arg0.field1766, arg0.field1770, arg0.field1765, arg0.field1768);
        return var9;
    }

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "()Z", line = 315)
    public final boolean method457() {
        ++field5974;
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(B)V", line = 323)
    private final void method2582(byte arg0) {
        if (arg0 >= 73) {
            if (this.field5922 != null) {
                Dimension var2 = this.field5922.getSize();
                this.field5911 = var2.width;
                this.field5990 = var2.height;
            } else {
                this.field5911 = this.field5990 = 1;
            }
            ++field5936;
            this.field5975 = this.field5990;
            this.field6044 = this.field5911;
            this.method2642(111);
            this.method2660(2692);
            this.method2594(true);
            this.method2618(11);
            this.method2614(63);
            this.method2686((byte) 85);
            this.method479();
        }
    }

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "(I)V", line = 365)
    private final void method2585(int arg0) {
        if (!this.field6186) {
            float[] var2 = this.field6177;
            float var3 = (float) (-this.field6133 * this.field6161) / (float) this.field6188;
            float var4 = (float) ((-this.field6133 + this.field6044) * this.field6161) / (float) this.field6188;
            float var5 = (float) (this.field6161 * this.field6130) / (float) this.field6181;
            float var6 = (float) ((-this.field5975 + this.field6130) * this.field6161) / (float) this.field6181;
            if (var3 != var4 && var5 != var6) {
                float var7 = (float) this.field6161 * 2.0F;
                var2[10] = this.field6164 = (float) this.field6115 / (float) (-this.field6115 + this.field6161);
                var2[13] = 0.0F;
                var2[0] = var7 / (var4 - var3);
                var2[11] = -1.0F;
                var2[9] = (var5 + var6) / (var5 - var6);
                var2[5] = var7 / (-var6 + var5);
                var2[8] = (var3 + var4) / (-var3 + var4);
                var2[2] = 0.0F;
                var2[1] = 0.0F;
                var2[6] = 0.0F;
                var2[3] = 0.0F;
                var2[12] = 0.0F;
                var2[4] = 0.0F;
                var2[15] = 0.0F;
                var2[7] = 0.0F;
                var2[14] = this.field6121 = (float) (this.field6161 * this.field6115) / (float) (this.field6161 - this.field6115);
            } else {
                var2[12] = 0.0F;
                var2[13] = 0.0F;
                var2[7] = 0.0F;
                var2[14] = 0.0F;
                var2[1] = 0.0F;
                var2[8] = 0.0F;
                var2[6] = 0.0F;
                var2[11] = 0.0F;
                var2[15] = 1.0F;
                var2[4] = 0.0F;
                var2[0] = 1.0F;
                var2[2] = 0.0F;
                var2[9] = 0.0F;
                var2[3] = 0.0F;
                var2[5] = 1.0F;
                var2[10] = 1.0F;
            }
            this.method2694((byte) -114);
            this.field6186 = true;
        }
        ++field5942;
        if (arg0 > -65) {
            this.field5922 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "(IIIII)V", line = 432)
    public final void method482(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6089;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZIIZIB)V", line = 440)
    private final void method2586(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5) {
        boolean var7 = arg3 & this.method464();
        ++field6062;
        if (!var7 && (~arg4 == -5 || arg4 == 8 || ~arg4 == -10)) {
            arg4 = 2;
            arg1 = arg4 != 4 ? 1 : arg2 & 1;
            arg2 = 0;
        }
        if (arg4 != 0 && arg0) {
            arg4 |= Integer.MIN_VALUE;
        }
        if (arg5 > 85) {
            if (this.field6112 != arg4) {
                if (this.field6112 != 0) {
                    this.field6119[Integer.MAX_VALUE & this.field6112].method197(false);
                }
                if (arg4 == 0) {
                    this.field6109 = null;
                } else {
                    this.field6109 = this.field6119[arg4 & Integer.MAX_VALUE];
                    this.field6109.method199((byte) -66, arg0);
                    this.field6109.method195(arg0, true);
                    this.field6109.method200(-104, arg2, arg1);
                }
                this.field6136 = arg2;
                this.field6108 = arg1;
                this.field6112 = arg4;
            } else if (this.field6112 != 0) {
                this.field6119[this.field6112 & Integer.MAX_VALUE].method195(arg0, true);
                if (this.field6136 != arg2 || this.field6108 != arg1) {
                    this.field6119[this.field6112 & Integer.MAX_VALUE].method200(17, arg2, arg1);
                    this.field6136 = arg2;
                    this.field6108 = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "(IIII)V", line = 497)
    public final void method510(int arg0, int arg1, int arg2, int arg3) {
        this.field6172 = this.field6044 < arg3 ? 0 : arg3;
        this.field6152 = arg1 >= 0 ? arg1 : 0;
        ++field5910;
        this.field6183 = this.field6044 < arg2 ? 0 : arg2;
        this.field6150 = ~arg0 > -1 ? 0 : arg0;
        if (this.field6150 <= 0 && this.field6183 >= this.field6044 && ~this.field6152 >= -1 && this.field6172 >= this.field5975) {
            this.method479();
        } else {
            if (!this.field6220) {
                this.field6220 = true;
                this.method2662(true);
            }
            this.method2593((byte) 61);
            this.method2614(-104);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIIIII)V", line = 525)
    public final void method523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field5916;
    }

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "(I)V", line = 533)
    public final void method502(int arg0) {
        ++field5960;
        if (arg0 != 1) {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lgf;II)V", line = 544)
    private final void method2588(class232 arg0, int arg1, int arg2) {
        ++field6090;
        this.method2584(true, this.field6212);
        this.method2617(this.field6201, 0, (byte) 120);
        this.method2587(arg0, 5, arg1, arg2);
    }

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "(I)V", line = 554)
    private final void method2589(int arg0) {
        if (arg0 != 0) {
            this.method2656(-25);
        }
        ++field6043;
        if (class37.field450 != this.field6154) {
            class616 var2 = this.field6154;
            this.field6154 = class37.field450;
            if (!var2.method3612(arg0 + 59)) {
                this.method2630(true);
            }
            this.method2692(4);
            this.field6196 = this.field6148;
            this.method2670(0);
            this.field6166 &= -8;
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(B)V", line = 582)
    private final void method2590(byte arg0) {
        if (arg0 >= 61) {
            if (!this.field6139) {
                float[] var2 = this.field6158;
                if (~this.field6044 != -1 && ~this.field5975 != -1) {
                    var2[13] = 1.0F;
                    var2[5] = -2.0F / (float) this.field5975;
                    var2[0] = 2.0F / (float) this.field6044;
                    var2[3] = 0.0F;
                    var2[4] = 0.0F;
                    var2[2] = 0.0F;
                    var2[10] = 0.5F;
                    var2[6] = 0.0F;
                    var2[11] = 0.0F;
                    var2[9] = 0.0F;
                    var2[8] = 0.0F;
                    var2[7] = 0.0F;
                    var2[12] = -1.0F;
                    var2[15] = 1.0F;
                    var2[1] = 0.0F;
                    var2[14] = 0.5F;
                } else {
                    var2[10] = 1.0F;
                    var2[1] = 0.0F;
                    var2[4] = 0.0F;
                    var2[13] = 0.0F;
                    var2[8] = 0.0F;
                    var2[9] = 0.0F;
                    var2[14] = 0.0F;
                    var2[2] = 0.0F;
                    var2[5] = 1.0F;
                    var2[6] = 0.0F;
                    var2[0] = 1.0F;
                    var2[15] = 1.0F;
                    var2[11] = 0.0F;
                    var2[3] = 0.0F;
                    var2[12] = 0.0F;
                    var2[7] = 0.0F;
                }
                this.field6139 = true;
            }
            ++field6081;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lqba;)V", line = 640)
    public final void method426(class345 arg0) {
        this.field6144 = (class538) arg0;
        ++field6006;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(Z)V", line = 655)
    private final void method2594(boolean arg0) {
        this.field6168 = false;
        ++field6035;
        if (class37.field450 == this.field6154) {
            this.method2692(4);
            this.method2670(0);
        }
        if (!arg0) {
            this.field6208 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIILpa;II)V", line = 674)
    public final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class311 arg6, int arg7, int arg8) {
        ++field6077;
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(Z)V", line = 682)
    private final void method2595(boolean arg0) {
        this.field6101 = (float) this.field6115 - this.field6157;
        ++field6086;
        if (!arg0) {
            this.method2626(2);
        }
    }

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "(B)[F", line = 695)
    public final float[] method2596(byte arg0) {
        ++field5926;
        if (arg0 != -109) {
            this.field6207 = null;
        }
        return this.field6110;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljaclib/memory/Buffer;I)Ljaclib/memory/Stream;", line = 706)
    public final Stream method2597(Buffer arg0, int arg1) {
        ++field6085;
        if (arg1 != 1) {
            this.method2641((byte[]) null, (class141) null, false, -76, -56, -27, 79, true);
        }
        this.field6145.method3443(arg0);
        return this.field6145;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lhm;IB)V", line = 719)
    public final void method2598(class188 arg0, int arg1, byte arg2) {
        this.method2612(false, arg1, (byte) 64, false, arg0);
        ++field6026;
        if (arg2 != 59) {
            this.field6123 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V", line = 730)
    public final void method459(int arg0) {
        ++field6064;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIII)V", line = 737)
    public final void method516(int arg0, int arg1, int arg2, int arg3) {
        this.field6188 = arg2;
        this.field6181 = arg3;
        this.field6133 = arg0;
        this.field6130 = arg1;
        ++field6039;
        this.method2594(true);
        this.method2660(2692);
        this.method2686((byte) 110);
        this.method2614(-118);
    }

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "(I)Lqn;", line = 752)
    public final class57 method2599(int arg0) {
        if (arg0 != 5) {
            this.method2649(-9, (class334[]) null);
        }
        ++field6015;
        return this.field6094;
    }

    @OriginalMember(owner = "client!cb", name = "xa", descriptor = "()V", line = 764)
    public final void method440() {
        this.field6117 = false;
        ++field5988;
        this.method2586(false, 0, 0, false, 0, (byte) 120);
        this.method2624(-125);
        this.method2591(15385);
    }

    @OriginalMember(owner = "client!cb", name = "JA", descriptor = "(IIII)V", line = 775)
    public final void method453(int arg0, int arg1, int arg2, int arg3) {
        ++field6014;
        if (!this.field6117) {
            throw new RuntimeException("");
        } else {
            if (~this.field6140 != ~arg0) {
                this.field6140 = arg0;
                if (this.field6109 != null) {
                    this.field6109.method1195((byte) 119);
                }
            }
            this.field6127 = arg2;
            this.field6162 = arg1;
            this.field6125 = arg3;
            this.method2624(-124);
        }
    }

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "(I)Lqn;", line = 798)
    public final class57 method2600(int arg0) {
        if (arg0 != 0) {
            this.field6183 = -84;
        }
        ++field5917;
        return this.field6103[this.field6099];
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "(Z)V", line = 812)
    public final void method2601(boolean arg0) {
        if (arg0) {
            this.field6131 = -68;
        }
        ++field5941;
        this.method2686((byte) 75);
        this.method2670(0);
    }

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "(B)Lwv;", line = 825)
    public final class31 method2603(byte arg0) {
        ++field6067;
        if (arg0 <= 38) {
            return null;
        } else {
            return this.field6144 == null ? null : this.field6144.method1826(false);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIF)Lnm;", line = 838)
    public final class405 method469(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        ++field5976;
        return new class222(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "(I)V", line = 849)
    public final void method463(int arg0) {
        this.field6156 = 0;
        ++field6091;
        while (~arg0 < -2) {
            arg0 >>= 1;
            ++this.field6156;
        }
        this.field6171 = 1 << this.field6156;
    }

    @OriginalMember(owner = "client!cb", name = "UA", descriptor = "(IIIII)V", line = 868)
    public final void method432(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method481(arg0, arg1, arg0 + arg2, arg1, arg3, arg4);
        ++field6061;
    }

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "(I)V", line = 876)
    public static void method2606(int arg0) {
        field6048 = null;
        field5987 = null;
        if (arg0 != -1) {
            method2606(33);
        }
        field5997 = null;
    }

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "(ILpa;II)V", line = 891)
    public final void method462(int arg0, class311 arg1, int arg2, int arg3) {
        ++field5963;
        class398 var5 = (class398) arg1;
        class422 var6 = var5.field5467;
        this.method2682(true);
        this.method2632(var6, 0);
        this.method2650(1, (byte) 35);
        this.method2643(class296.field4074, -10304, class296.field4074);
        this.method2598(class314.field4331, 0, (byte) 59);
        this.method2688(arg0, 28366);
        this.field6082.method381(0.0F, (float) this.field6044, (float) this.field5975, (byte) -60);
        this.method2576((byte) 28);
        this.field6103[0].method381(1.0F, var6.method1651((float) this.field6044, -128), var6.method1653((float) this.field5975, (byte) -122), (byte) -60);
        this.field6103[0].method366(var6.method1653((float) (-arg3), (byte) -126), 0.0F, var6.method1651((float) (-arg2), 64), -6701);
        this.field6137[0] = class210.field3107;
        this.method2697(0);
        this.method2678(2);
        this.method2664(61);
        this.method2598(class453.field6405, 0, (byte) 59);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IFFFFFF)Z", line = 917)
    private final boolean method2608(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6) {
        ++field6088;
        Buffer var8 = this.field6208.method282(arg0 + -13812, true);
        if (var8 == null) {
            return false;
        } else if (arg0 != 9) {
            return false;
        } else {
            Stream var9 = this.method2597(var8, 1);
            if (Stream.method3454()) {
                var9.method3446(arg5);
                var9.method3446(arg4);
                var9.method3446(arg2);
                var9.method3446(arg3);
                var9.method3446(arg6);
                var9.method3446(arg1);
            } else {
                var9.method3453(arg5);
                var9.method3453(arg4);
                var9.method3453(arg2);
                var9.method3453(arg3);
                var9.method3453(arg6);
                var9.method3453(arg1);
            }
            var9.method3448();
            return this.field6208.method280(28596);
        }
    }

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "(III)V", line = 957)
    public final void method489(int arg0, int arg1, int arg2) {
        ++field6027;
        if (~this.field6147 != ~arg0 || this.field6153 != arg1 || ~this.field6114 != ~arg2) {
            this.field6153 = arg1;
            this.field6147 = arg0;
            this.field6114 = arg2;
            if (this.field6117) {
                return;
            }
            this.method2624(-128);
            this.method2591(15385);
        }
    }

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "()Lm;", line = 982)
    public final class165 method522() {
        ++field5993;
        return new class57();
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(Z)V", line = 992)
    public final void method495(boolean arg0) {
        ++field5998;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)V", line = 1000)
    public final void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5964;
    }

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "(B)I", line = 1008)
    public final int method2611(byte arg0) {
        int var2 = 82 / ((-50 - arg0) / 35);
        ++field6024;
        return this.field6099;
    }

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "(B)V", line = 1021)
    public final void method2613(byte arg0) {
        this.field6082.method336();
        ++field5931;
        this.field6074 = true;
        if (arg0 <= 72) {
            this.field6117 = true;
        }
        this.method2639(0);
    }

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "(I)V", line = 1038)
    private final void method2614(int arg0) {
        int var2 = 22 % ((-59 - arg0) / 37);
        this.field6105 = (float) (this.field6152 - this.field6130);
        ++field6025;
        this.field6184 = (float) (-this.field6133 + this.field6183);
        this.field6138 = (float) (-this.field6130 + this.field6172);
        this.field6160 = (float) (this.field6150 - this.field6133);
    }

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "(I)V", line = 1052)
    private final void method2615(int arg0) {
        ++field5912;
        this.method2647(false);
        this.method2610(70);
        this.method2571(arg0 + 1);
        this.method2661(arg0 + -11);
        this.method2602((byte) -80);
        this.method2636(1);
        this.method2619(122);
        this.method2592((byte) 99);
        this.method2659(-25172);
        this.method2591(arg0 ^ -15386);
        this.method2607(-2);
        this.method2570(false);
        this.method2687(0);
        this.method2681(false);
        int var2 = this.field6128 - 1;
        if (arg0 != -1) {
            this.method502(-91);
        }
        while (~var2 <= -1) {
            this.method2646(var2, arg0 ^ -112);
            this.method2654((byte) 104);
            this.method2629((byte) 29);
            this.method2664(92);
            --var2;
        }
        this.method2628(1);
        this.method2618(11);
        this.method2621(0);
        this.method2683(0);
        this.method2620(-127);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([IIIII)Lha;", line = 1095)
    public final class53 method466(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5921;
        return new class446(this, arg3, arg4, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "()Z", line = 1103)
    public final boolean method499() {
        ++field6034;
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "(B)V", line = 1111)
    private final void method2616(byte arg0) {
        ++field5949;
        if (this.field6166 != 1) {
            this.method2572(1);
            this.method2667(false, 79);
            this.method2658(111, false);
            this.method2657(false, -32);
            this.method2644(-123, false);
            this.method2652(false, 128, -2, false);
            this.method2698(1, arg0 ^ -9);
            this.method2632(this.field6179, arg0 ^ -10);
            this.field6166 = 1;
        }
        if (arg0 != -10) {
            this.field6134 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "()Z", line = 1135)
    public final boolean method527() {
        ++field5937;
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 1144)
    public final void method515(Canvas arg0) {
        ++field5984;
        if (this.field5965 == arg0) {
            throw new RuntimeException();
        } else if (!this.field5905.containsKey(arg0)) {
            if (!arg0.isShowing()) {
                throw new RuntimeException();
            } else {
                try {
                    Class var2 = Class.forName("java.awt.Canvas");
                    Method var3 = var2.getMethod("setIgnoreRepaint", Boolean.TYPE);
                    var3.invoke(arg0, Boolean.TRUE);
                } catch (Exception var5) {
                }
                Object var4 = this.method2645(arg0, 24180);
                if (var4 == null) {
                    throw new RuntimeException();
                } else {
                    this.field5905.put(arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZII[BILaq;)Ljb;", line = 1192)
    public final class422 method2622(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4, class141 arg5) {
        if (arg2 != 3000) {
            return null;
        } else {
            ++field6021;
            return this.method2641(arg3, arg5, arg0, 0, arg1, 0, arg4, true);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILkv;)V", line = 1204)
    public final void method2623(int arg0, class227 arg1) {
        int var3 = 61 % ((26 - arg0) / 61);
        ++field5920;
        this.field6137[this.field6099] = arg1;
        this.method2697(0);
    }

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "(I)V", line = 1215)
    private final void method2624(int arg0) {
        if (arg0 <= -121) {
            ++field5986;
            if (this.field6109 != null) {
                this.field6109.method1200((byte) -117);
            }
            this.method2607(-2);
        }
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V", line = 1229)
    public final void method419(int arg0) {
        ++field6013;
        if (~arg0 <= -129 && arg0 <= 1024) {
            this.field6189 = arg0;
            this.field6195.method2888((byte) -106);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "()Z", line = 1244)
    public final boolean method434() {
        ++field6001;
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "(IIIIII)Z", line = 1253)
    public final boolean method496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5923;
        float var7 = this.field6092.method374((float) arg0, (float) arg2, (byte) 7, (float) arg1);
        if (var7 < 1.0F) {
            var7 = 1.0F;
        }
        float var8 = this.field6092.method374((float) arg3, (float) arg5, (byte) 7, (float) arg4);
        if (var8 < 1.0F) {
            var8 = 1.0F;
        }
        if ((!((float) this.field6161 > var7) || !(var8 < (float) this.field6161)) && (!(var7 > (float) this.field6115) || !(var8 > (float) this.field6115))) {
            int var9 = (int) ((float) this.field6188 * this.field6092.method377((float) arg1, (float) arg2, (float) arg0, 118) / var7);
            int var10 = (int) ((float) this.field6188 * this.field6092.method377((float) arg4, (float) arg5, (float) arg3, -126) / var8);
            if (this.field6160 > (float) var9 && this.field6160 > (float) var10 || this.field6184 < (float) var9 && (float) var10 > this.field6184) {
                return false;
            } else {
                int var11 = (int) ((float) this.field6181 * this.field6092.method372(19505, (float) arg0, (float) arg2, (float) arg1) / var7);
                int var12 = (int) ((float) this.field6181 * this.field6092.method372(19505, (float) arg3, (float) arg5, (float) arg4) / var8);
                return (!(this.field6105 > (float) var11) || !((float) var12 < this.field6105)) && (!(this.field6138 < (float) var11) || !(this.field6138 < (float) var12));
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)V", line = 1291)
    public final void method2625(byte arg0, int arg1) {
        if (arg1 == 1) {
            ++field6031;
            this.method2688(arg0 << 16 | arg0 << 24 | arg0 << 8 | arg0, arg1 ^ 28367);
        }
    }

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "(I)V", line = 1302)
    private final void method2626(int arg0) {
        if (class457.field6465 != this.field6154) {
            class616 var2 = this.field6154;
            this.field6154 = class457.field6465;
            if (!var2.method3612(57)) {
                this.method2630(true);
            }
            this.method2585(-87);
            this.field6196 = this.field6177;
            this.method2670(0);
            this.field6166 &= -8;
        }
        if (arg0 <= 96) {
            this.field6098 = null;
        }
        ++field5957;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "([I)V", line = 1328)
    public final void method431(int[] arg0) {
        arg0[2] = this.field6183;
        ++field5995;
        arg0[1] = this.field6152;
        arg0[0] = this.field6150;
        arg0[3] = this.field6172;
    }

    @OriginalMember(owner = "client!cb", name = "la", descriptor = "(FF)V", line = 1350)
    public final void method422(float arg0, float arg1) {
        if (this.field6106 != arg0 || this.field6157 != arg1) {
            this.field6157 = arg1;
            this.field6106 = arg0;
            this.method2595(true);
            this.method2694((byte) -105);
            this.method2594(true);
            this.method2660(2692);
        }
        ++field6071;
    }

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "(Z)V", line = 1368)
    private final void method2630(boolean arg0) {
        this.field6102 = false;
        ++field5978;
        if (this.field6109 != null) {
            this.field6109.method1198(true);
        }
        this.method2620(-79);
        if (!arg0) {
            this.field6196 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "()Z", line = 1388)
    public final boolean method437() {
        ++field6003;
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[IZZI)Ljb;", line = 1396)
    public final class422 method2631(int arg0, int[] arg1, boolean arg2, boolean arg3, int arg4) {
        if (arg3) {
            this.method2572(-85);
        }
        ++field5982;
        return this.method2691(arg4, 0, arg0, 0, arg1, arg2, 12441);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lpb;I)V", line = 1411)
    public final void method2632(class563 arg0, int arg1) {
        ++field5977;
        if (this.field6098[this.field6099] != arg0) {
            this.field6098[this.field6099] = arg0;
            if (arg0 == null) {
                this.method2673(7);
            } else {
                arg0.method22((byte) -122);
            }
            this.field6166 &= -2;
        }
        if (arg1 != 0) {
            this.method450();
        }
    }

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "()Z", line = 1432)
    public final boolean method530() {
        ++field5983;
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "(IIII)V", line = 1445)
    public final void method512(int arg0, int arg1, int arg2, int arg3) {
        if (~this.field6172 < ~arg3) {
            this.field6172 = arg3;
        }
        if (~this.field6152 > ~arg1) {
            this.field6152 = arg1;
        }
        if (~this.field6183 < ~arg2) {
            this.field6183 = arg2;
        }
        if (~this.field6150 > ~arg0) {
            this.field6150 = arg0;
        }
        ++field6080;
        if (this.field6150 <= 0 && ~this.field6044 >= ~this.field6183 && ~this.field6152 >= -1 && this.field5975 <= this.field6172) {
            this.method479();
        } else {
            if (!this.field6220) {
                this.field6220 = true;
                this.method2662(true);
            }
            this.method2593((byte) 118);
            this.method2614(-121);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZII)Ljaclib/memory/heap/NativeHeapBuffer;", line = 1482)
    public final NativeHeapBuffer method2634(boolean arg0, int arg1, int arg2) {
        ++field6010;
        return arg1 < 43 ? null : this.field6053.method3440(arg2, arg0);
    }

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "(I)V", line = 1493)
    public final void method2635(int arg0) {
        ++field6037;
        if (this.field6166 != 4) {
            this.method2572(1);
            this.method2667(false, 117);
            this.method2658(arg0 ^ -19818, false);
            this.method2657(false, -32);
            this.method2644(-89, false);
            this.method2652(false, 128, -2, false);
            this.method2650(1, (byte) 35);
            this.method2698(0, arg0 ^ -19837);
            this.field6166 = 4;
        }
        if (arg0 != -19838) {
            this.field6175 = -113;
        }
    }

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "(Z)V", line = 1519)
    private final void method2637(boolean arg0) {
        ++field5928;
        this.field6201 = this.method2627(false, -30125);
        if (!arg0) {
            this.method2690(-31, -81, true, (int[][]) null);
        }
        this.field6201.method1866(140, 28, (byte) -124);
        for (int var2 = 0; var2 < 4; ++var2) {
            Buffer var3 = this.field6201.method282(-13803, true);
            if (var3 != null) {
                Stream var4 = this.method2597(var3, 1);
                if (!Stream.method3454()) {
                    var4.method3453(0.0F);
                    var4.method3453(0.0F);
                    var4.method3453(0.0F);
                    var4.method3453(0.0F);
                    var4.method3453(0.0F);
                    var4.method3453(0.0F);
                    var4.method3453(0.0F);
                    var4.method3453(0.0F);
                    var4.method3453(1.0F);
                    var4.method3453(0.0F);
                    var4.method3453(0.0F);
                    var4.method3453(1.0F);
                    var4.method3453(0.0F);
                    var4.method3453(1.0F);
                    var4.method3453(1.0F);
                    var4.method3453(1.0F);
                    var4.method3453(0.0F);
                    var4.method3453(1.0F);
                    var4.method3453(1.0F);
                    var4.method3453(1.0F);
                    var4.method3453(1.0F);
                    var4.method3453(1.0F);
                    var4.method3453(0.0F);
                    var4.method3453(0.0F);
                    var4.method3453(1.0F);
                    var4.method3453(0.0F);
                    var4.method3453(1.0F);
                    var4.method3453(0.0F);
                    var4.method3453(0.0F);
                    var4.method3453(0.0F);
                    var4.method3453(0.0F);
                    var4.method3453(0.0F);
                    var4.method3453(0.0F);
                    var4.method3453(0.0F);
                    var4.method3453(0.0F);
                } else {
                    var4.method3446(0.0F);
                    var4.method3446(0.0F);
                    var4.method3446(0.0F);
                    var4.method3446(0.0F);
                    var4.method3446(0.0F);
                    var4.method3446(0.0F);
                    var4.method3446(0.0F);
                    var4.method3446(0.0F);
                    var4.method3446(1.0F);
                    var4.method3446(0.0F);
                    var4.method3446(0.0F);
                    var4.method3446(1.0F);
                    var4.method3446(0.0F);
                    var4.method3446(1.0F);
                    var4.method3446(1.0F);
                    var4.method3446(1.0F);
                    var4.method3446(0.0F);
                    var4.method3446(1.0F);
                    var4.method3446(1.0F);
                    var4.method3446(1.0F);
                    var4.method3446(1.0F);
                    var4.method3446(1.0F);
                    var4.method3446(0.0F);
                    var4.method3446(0.0F);
                    var4.method3446(1.0F);
                    var4.method3446(0.0F);
                    var4.method3446(1.0F);
                    var4.method3446(0.0F);
                    var4.method3446(0.0F);
                    var4.method3446(0.0F);
                    var4.method3446(0.0F);
                    var4.method3446(0.0F);
                    var4.method3446(0.0F);
                    var4.method3446(0.0F);
                    var4.method3446(0.0F);
                }
                var4.method3448();
                if (this.field6201.method280(28596)) {
                    break;
                }
            }
        }
        this.field6212 = this.method2649(-125, new class334[] { new class334(new class58[] { class58.field719, class58.field732, class58.field732 }) });
    }

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "(I)V", line = 1635)
    private final void method2639(int arg0) {
        ++field5925;
        if (class87.field1295 == this.field6154) {
            float var2 = this.method2580((byte) 100);
            this.field6082.method366(var2, 0.0F, var2, -6701);
        }
        this.field6102 = false;
        this.method2683(arg0);
        if (this.field6109 != null) {
            this.field6109.method1194(arg0 ^ 393216);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lqn;I)V", line = 1654)
    public final void method2640(class57 arg0, int arg1) {
        this.field6082.method337(arg0);
        ++field6059;
        this.field6074 = false;
        this.method2639(0);
        int var3 = -26 % ((arg1 - 66) / 50);
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(Ljava/awt/Canvas;)V", line = 1666)
    public final void method444(Canvas arg0) {
        ++field6068;
        this.field5979 = null;
        this.field5922 = null;
        if (arg0 != null && this.field5965 != arg0) {
            if (this.field5905.containsKey(arg0)) {
                this.field5979 = this.field5905.get(arg0);
                this.field5922 = arg0;
            }
        } else {
            this.field5922 = this.field5965;
            this.field5979 = this.field5972;
        }
        if (this.field5922 != null && this.field5979 != null) {
            this.method2668((byte) -8, this.field5979, this.field5922);
            this.method2582((byte) 117);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(IIIIII)V", line = 1697)
    public final void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2616((byte) -10);
        ++field6052;
        this.method2688(arg4, 28366);
        this.method2598(class314.field4331, 0, (byte) 59);
        this.method2655(0, -46, class314.field4331);
        this.method2650(arg5, (byte) 35);
        this.field6082.method381(1.0F, (float) arg2, (float) arg3, (byte) -60);
        this.field6082.method338(arg0, arg1, 0);
        this.method2576((byte) 28);
        this.method2573(false, (byte) -71);
        this.method2678(2);
        this.method2573(true, (byte) -128);
        this.method2655(0, -104, class453.field6405);
        this.method2598(class453.field6405, 0, (byte) 59);
    }

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "(I)V", line = 1718)
    private final void method2642(int arg0) {
        this.field6139 = false;
        ++field5955;
        if (arg0 > 29) {
            if (class87.field1295 == this.field6154) {
                this.method2590((byte) 71);
                this.method2670(0);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lus;ILus;)V", line = 1740)
    public final void method2643(class1 arg0, int arg1, class1 arg2) {
        ++field5924;
        boolean var4 = false;
        if (this.field6174[this.field6099] != arg2) {
            this.field6174[this.field6099] = arg2;
            var4 = true;
            this.method2654((byte) 104);
        }
        if (arg1 != -10304) {
            this.method2604((Canvas) null, true, (Object) null);
        }
        if (this.field6197[this.field6099] != arg0) {
            this.field6197[this.field6099] = arg0;
            this.method2629((byte) 91);
            var4 = true;
        }
        if (var4) {
            this.field6166 &= -30;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([Lr;Lrd;Lm;[Lpr;I)V", line = 1774)
    public final void method452(class159[] arg0, class283 arg1, class165 arg2, class381[] arg3, int arg4) {
        this.method507(arg0, arg2, arg3, arg4);
        ++field5962;
        this.method488(arg1);
    }

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "()Z", line = 1785)
    public final boolean method497() {
        ++field5913;
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZ)V", line = 1797)
    public final void method2644(int arg0, boolean arg1) {
        if (this.field6173 != arg1) {
            this.field6173 = arg1;
            this.method2659(-25172);
            this.field6166 &= -32;
        }
        if (arg0 < -31) {
            ++field5968;
        }
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(II)V", line = 1819)
    public final void method2646(int arg0, int arg1) {
        ++field5996;
        if (~this.field6099 != ~arg0) {
            this.field6099 = arg0;
            this.method2605((byte) -36);
        }
        if (arg1 <= 98) {
            this.field6182 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(II)Lgl;", line = 1837)
    public class516 method2648(int arg0, int arg1) {
        ++field5973;
        if (arg1 != 0) {
            return null;
        } else if (arg0 != 6) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    return ~arg0 == -8 ? new class495(this) : new class383(this);
                } else {
                    return new class586(this, this.field6016);
                }
            } else {
                return new class29(this);
            }
        } else {
            return new class116(this);
        }
    }

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "()Lm;", line = 1889)
    public final class165 method428() {
        ++field6045;
        return this.field6199;
    }

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "()V", line = 1898)
    public final void method479() {
        ++field6007;
        if (this.field6220) {
            this.field6220 = false;
            this.method2662(true);
        }
        this.field6150 = 0;
        this.field6172 = this.field5975;
        this.field6152 = 0;
        this.field6183 = this.field6044;
        this.method2614(-123);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)V", line = 1919)
    public final void method2650(int arg0, byte arg1) {
        ++field5953;
        if (arg1 != 35) {
            this.field6199 = null;
        }
        if (this.field6120 != arg0) {
            boolean var3;
            boolean var4;
            class638 var5;
            if (~arg0 == -2) {
                var3 = true;
                var4 = true;
                var5 = class44.field518;
            } else if (arg0 == 2) {
                var4 = true;
                var5 = class341.field4715;
                var3 = false;
            } else if (arg0 == 128) {
                var5 = class526.field7530;
                var4 = true;
                var3 = true;
            } else {
                var3 = false;
                var4 = false;
                var5 = class401.field5497;
            }
            if (this.field6142 != var3) {
                this.field6142 = var3;
                this.method2681(false);
            }
            if (this.field6155 != var4) {
                this.field6155 = var4;
                this.method2570(false);
            }
            if (this.field6182 != var5) {
                this.field6182 = var5;
                this.method2687(arg1 ^ 35);
            }
            this.field6120 = arg0;
            this.field6166 &= -29;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZIIZ)V", line = 1988)
    public final void method2652(boolean arg0, int arg1, int arg2, boolean arg3) {
        if (this.field6104 != arg2) {
            if (arg2 < 0) {
                this.method2664(101);
                this.method2632((class563) null, arg1 + -128);
                this.method2698(0, 1);
                if (!this.field6117) {
                    this.method2586(arg3, 0, 0, arg0, 0, (byte) 113);
                }
            } else {
                class422 var5 = this.field6195.method2887((byte) -105, arg2);
                class471 var6 = super.field3092.method110(arg2, (byte) 113);
                if (~var6.field6656 == -1 && var6.field6661 == 0) {
                    this.method2664(64);
                } else {
                    int var7 = var6.field6651 ? 64 : 128;
                    int var8 = var7 * 50;
                    class57 var9 = this.method2653((byte) -110);
                    var9.method369(20, (float) (this.field6100 % var8 * var6.field6661) / (float) var8, 0.0F, (float) (this.field6100 % var8 * var6.field6656) / (float) var8);
                    this.method2623(96, class210.field3107);
                }
                if (!this.field6117) {
                    this.method2586(arg3, var6.field6650, var6.field6649, arg0, var6.field6646, (byte) 110);
                }
                if (this.field6109 != null) {
                    this.field6109.method202(var5, var6.field6643, -1);
                } else {
                    this.method2632(var5, 0);
                    this.method2698(var6.field6643, 1);
                }
            }
            this.field6104 = arg2;
        }
        ++field6049;
        this.field6166 &= -8;
        if (arg1 != 128) {
            this.method2647(true);
        }
    }

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "(B)Lqn;", line = 2050)
    public final class57 method2653(byte arg0) {
        ++field6076;
        if (arg0 != -110) {
            this.method2634(false, 71, -83);
        }
        return this.field6103[this.field6099];
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILhm;)V", line = 2068)
    public final void method2655(int arg0, int arg1, class188 arg2) {
        this.method2581(arg0, false, 0, arg2);
        if (arg1 <= -37) {
            ++field6012;
        }
    }

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "(I)Lqn;", line = 2080)
    public final class57 method2656(int arg0) {
        ++field5914;
        if (arg0 != 2) {
            this.field6138 = -1.087853F;
        }
        return this.field6095;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(ZI)V", line = 2094)
    public final void method2657(boolean arg0, int arg1) {
        if (arg1 == -32) {
            ++field5991;
            if (this.field6122 == !arg0) {
                this.field6122 = arg0;
                this.method2592((byte) 70);
                this.field6166 &= -32;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[[I[[IIII)Lsa;", line = 2111)
    public final class176 method458(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field5969;
        return new class600(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(IIIIII)Lqba;", line = 2120)
    public final class345 method424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5939;
        return new class297(this, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(IZ)V", line = 2129)
    public final void method2658(int arg0, boolean arg1) {
        ++field6011;
        if (arg0 <= 1) {
            this.field6097 = -1.4992421F;
        }
        if (!arg1 == this.field6111) {
            this.field6111 = arg1;
            this.method2571(0);
            this.field6166 &= -8;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIZ)Lha;", line = 2147)
    public final class53 method442(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field6057;
        class446 var6 = new class446(this, arg2, arg3, arg4);
        var6.method320(0, 0, arg2, arg3, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "(I)V", line = 2160)
    private final void method2660(int arg0) {
        ++field6040;
        if (arg0 != 2692) {
            this.field6141 = true;
        }
        this.field6186 = false;
        this.method2585(arg0 ^ -2811);
        if (class457.field6465 == this.field6154) {
            this.method2670(0);
        }
    }

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "(I)V", line = 2175)
    public void method2661(int arg0) {
        ++field6005;
        if (arg0 <= -7) {
            this.field6149 = this.field6175;
            this.field6175 = 0;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IF)V", line = 2189)
    public final void method2663(int arg0, float arg1) {
        if (this.field6135 != arg1) {
            this.field6135 = arg1;
            this.method2594(true);
        }
        if (arg0 != -12075) {
            this.method469(23, -113, 116, 38, -48, 1.4406177F);
        }
        ++field6008;
    }

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "(I)V", line = 2205)
    public final void method2664(int arg0) {
        ++field5952;
        int var2 = -87 % ((arg0 - -26) / 37);
        if (this.field6137[this.field6099] != class636.field9304) {
            this.field6137[this.field6099] = class636.field9304;
            this.field6103[this.field6099].method336();
            this.method2697(0);
        }
    }

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "(I)V", line = 2223)
    public void method2665(int arg0) {
        if (arg0 != 7) {
            this.field5965 = null;
        }
        ++field6079;
        this.method2615(-1);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z", line = 2238)
    public static final boolean method2666(int arg0, int arg1, int arg2) {
        ++field6069;
        if (!class68.method538(arg2, -59, arg1)) {
            return false;
        } else {
            if (arg0 != -13624) {
                method2666(5, 76, 71);
            }
            return (45056 & arg1) != 0 | class162.method1157(arg2, arg1, arg0 ^ -13637) | class460.method2786(-112, arg2, arg1) ? true : (55 & arg2) == 0 & (class560.method3375(arg2, (byte) -128, arg1) | class245.method1551(arg1, arg0 + 13623, arg2));
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(ZI)V", line = 2257)
    public final void method2667(boolean arg0, int arg1) {
        if (!arg0 != !this.field6143) {
            this.field6143 = arg0;
            this.method2591(15385);
            this.field6166 &= -32;
        }
        if (arg1 > 36) {
            ++field6051;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Ljava/awt/Canvas;)V", line = 2275)
    public final void method503(Canvas arg0) {
        ++field5906;
        Object var2 = null;
        if (arg0 != null && this.field5965 != arg0) {
            if (this.field5905.containsKey(arg0)) {
                var2 = this.field5905.get(arg0);
            }
        } else {
            var2 = this.field5979;
        }
        if (var2 == null) {
            throw new RuntimeException();
        } else {
            this.method2604(arg0, false, var2);
            if (this.field5922 == arg0) {
                this.method2582((byte) 108);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/awt/Canvas;Ljava/lang/Object;Ln;Lkda;II)V", line = 2303)
    public class444(Canvas arg0, Object arg1, class17 arg2, class328 arg3, int arg4, int arg5) {
        super(arg2);
        this.field5922 = this.field5965 = arg0;
        this.field6066 = arg3;
        this.field6178 = arg4;
        this.field5979 = this.field5972 = arg1;
        Dimension var7 = arg0.getSize();
        this.field6044 = this.field5911 = var7.width;
        this.field6131 = arg5;
        this.field5975 = this.field5990 = var7.height;
        class582.method3473(false, true, -3);
        this.field6195 = new class479(this, super.field3092);
        this.field5945 = new NativeInterface(super.field3092.method112(123), this.field6131);
        for (int var8 = 0; ~var8 > ~super.field3092.method112(-127); ++var8) {
            class471 var9 = super.field3092.method110(var8, (byte) 120);
            if (var9 != null) {
                this.field5945.initTextureMetrics(var8, var9.field6660, var9.field6657);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "(I)V", line = 2342)
    private final void method2669(int arg0) {
        this.method2584(true, this.field6200);
        if (arg0 != -18643) {
            this.field6115 = 31;
        }
        ++field6017;
        this.method2617(this.field6208, 0, (byte) 107);
        this.method2587(class242.field3468, 5, 1, 0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lu;)V", line = 2356)
    public final void method448(class65 arg0) {
        ++field5908;
        this.field6053 = ((class2) arg0).field10;
        this.field5907 = this.field6053.method3440(32768, false);
    }

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "(I)V", line = 2371)
    private final void method2670(int arg0) {
        ++field6023;
        this.method2621(arg0);
        if (this.field6109 != null) {
            this.field6109.method1197(22908);
        }
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)Lu;", line = 2383)
    public final class65 method455(int arg0) {
        ++field5933;
        class2 var2 = new class2(arg0);
        this.field6063.method131(var2, 0);
        return var2;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(IZ)V", line = 2396)
    public final void method2671(int arg0, boolean arg1) {
        if (arg0 != 20977) {
            this.method481(65, 22, 10, 124, 24, -41);
        }
        if (!arg1 != !this.field6180) {
            this.field6180 = arg1;
            this.method2619(arg0 + -21046);
        }
        ++field6030;
    }

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "(I)I", line = 2413)
    public final int method2672(int arg0) {
        if (arg0 != 9) {
            this.field6109 = null;
        }
        ++field6042;
        return this.field6140;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([Lr;Lm;[Lpr;I)V", line = 2426)
    public final void method507(class159[] arg0, class165 arg1, class381[] arg2, int arg3) {
        ++field6041;
        for (int var5 = 0; arg0.length > var5; ++var5) {
            if (arg0[var5] != null) {
                arg0[var5].method93(arg1, arg2 == null ? null : arg2[var5], arg3);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "(B)I", line = 2445)
    public final int method2674(byte arg0) {
        if (arg0 <= 11) {
            this.method443(-127, -100, 19, 37);
        }
        ++field6075;
        return this.field6127;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)I", line = 2456)
    public final int method528(int arg0, int arg1) {
        ++field5930;
        return arg1 ^ arg1 & arg0;
    }

    @OriginalMember(owner = "client!cb", name = "ba", descriptor = "()I", line = 2465)
    public final int method525() {
        ++field6055;
        return this.field6219;
    }

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "(I)V", line = 2476)
    public final void method2675(int arg0) {
        ++field6019;
        Enumeration var2 = this.field5905.keys();
        if (arg0 != 2) {
            this.field6210 = null;
        }
        while (var2.hasMoreElements()) {
            Canvas var3 = (Canvas) var2.nextElement();
            this.method2676((byte) -116, var3, this.field5905.get(var3));
        }
        this.field6201.method281((byte) 120);
        this.field6208.method281((byte) 126);
        this.field6213.method2189(-83);
        this.field6202.method2189(83);
        this.field6205.method2189(-82);
        this.field6217.method2189(106);
        this.field6214.method2189(-70);
        this.field6116.method34(true);
        this.field6206.method281((byte) 94);
    }

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "(I)V", line = 2512)
    public final void method2677(int arg0) {
        if (arg0 != -11686) {
            this.method2689(true, -84);
        }
        ++field6058;
        Hashtable var2 = new Hashtable();
        if (this.field5905 != null && !this.field5905.isEmpty()) {
            Enumeration var3 = this.field5905.keys();
            while (var3.hasMoreElements()) {
                Canvas var4 = (Canvas) var3.nextElement();
                var2.put(var4, this.method2645(var4, arg0 + 35866));
            }
        }
        this.field5905 = var2;
        this.method2637(true);
        this.method2679(arg0 ^ -11685);
        this.field6116.method40(-30740, this);
    }

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "(I)V", line = 2547)
    public final void method2678(int arg0) {
        this.method2588(class230.field3373, arg0, 0);
        ++field5992;
    }

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "(IFFFFF)V", line = 2557)
    public final void method520(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        ++field6022;
        boolean var7 = ~this.field6193 != ~arg0;
        if (var7 || this.field6126 != arg1 || this.field6163 != arg2) {
            this.field6163 = arg2;
            this.field6193 = arg0;
            this.field6126 = arg1;
            if (var7) {
                this.field6176 = (float) (this.field6193 & 16711680) / 1.671168E7F;
                this.field6107 = (float) (255 & this.field6193) / 255.0F;
                this.field6165 = (float) (this.field6193 & 65280) / 65280.0F;
                this.method2647(false);
            }
            this.field5945.setSunColour(this.field6176, this.field6165, this.field6107, arg1, arg2);
            this.method2610(49);
        }
        if (this.field6151[0] != arg3 || this.field6151[1] != arg4 || this.field6151[2] != arg5) {
            this.field6151[2] = arg5;
            this.field6151[1] = arg4;
            this.field6151[0] = arg3;
            this.field6185[1] = -arg4;
            this.field6185[0] = -arg3;
            this.field6185[2] = -arg5;
            float var8 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field6134[0] = arg3 * var8;
            this.field6134[1] = arg4 * var8;
            this.field6134[2] = arg5 * var8;
            this.field6123[0] = -this.field6134[0];
            this.field6123[1] = -this.field6134[1];
            this.field6123[2] = -this.field6134[2];
            this.field5945.setSunDirection(this.field6134[0], this.field6134[1], this.field6134[2]);
            this.method2602((byte) -20);
            this.field6146 = (int) (arg3 * 256.0F / arg4);
            this.field6124 = (int) (arg5 * 256.0F / arg4);
        }
        this.method2636(1);
    }

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "(I)V", line = 2608)
    private final void method2679(int arg0) {
        ++field5970;
        if (arg0 != 1) {
            this.field6206 = null;
        }
        this.field6208 = this.method2627(true, -30125);
        this.field6208.method1866(24, 12, (byte) -89);
        this.field6200 = this.method2649(arg0 ^ -120, new class334[] { new class334(class58.field719) });
    }

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "(I)Lqn;", line = 2627)
    public final class57 method2680(int arg0) {
        ++field5994;
        if (arg0 != 0) {
            this.field6113 = -0.7326323F;
        }
        return this.field6082;
    }

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "()Z", line = 2639)
    public final boolean method471() {
        ++field5989;
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "za", descriptor = "(IIIIII[BII)V", line = 2650)
    public final void method517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        ++field5946;
    }

    @OriginalMember(owner = "client!cb", name = "ta", descriptor = "(II)V", line = 2659)
    public final void method451(int arg0, int arg1) {
        if (~this.field6161 != ~arg0 || ~this.field6115 != ~arg1) {
            this.field6161 = arg0;
            this.field6115 = arg1;
            this.method2660(2692);
            this.method2594(true);
            this.method2624(-126);
        }
        ++field6018;
    }

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "(Z)V", line = 2678)
    public final void method2682(boolean arg0) {
        if (this.field6166 != 2) {
            this.method2572(1);
            this.method2667(false, 68);
            this.method2658(26, false);
            this.method2657(false, -32);
            this.method2644(-33, false);
            this.method2652(false, 128, -2, false);
            this.field6166 = 2;
        }
        ++field6000;
        if (!arg0) {
            this.method2596((byte) -106);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[F)[F", line = 2701)
    public final float[] method2684(int arg0, float[] arg1) {
        arg1[0] = this.field6196[0];
        ++field6050;
        arg1[4] = this.field6196[1];
        arg1[12] = this.field6196[3];
        arg1[8] = this.field6196[2];
        arg1[1] = this.field6196[4];
        arg1[13] = this.field6196[7];
        arg1[9] = this.field6196[6];
        int var3 = -56 % ((52 - arg0) / 51);
        arg1[2] = this.field6196[8];
        arg1[5] = this.field6196[5];
        arg1[14] = this.field6196[11];
        arg1[10] = this.field6196[10];
        arg1[3] = this.field6196[12];
        arg1[6] = this.field6196[9];
        arg1[7] = this.field6196[13];
        arg1[15] = this.field6196[15];
        arg1[11] = this.field6196[14];
        return arg1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILaq;[FIZ)Ljb;", line = 2727)
    public final class422 method2685(int arg0, int arg1, class141 arg2, float[] arg3, int arg4, boolean arg5) {
        if (arg0 < 125) {
            this.method452((class159[]) null, (class283) null, (class165) null, (class381[]) null, 94);
        }
        ++field5904;
        return this.method2575(0, 0, (byte) -126, arg3, arg1, arg4, arg5, arg2);
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V", line = 2739)
    public void method484(int arg0) {
        ++field6070;
        this.field6195.method2884(0);
        this.field6100 = arg0 & Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "(B)V", line = 2751)
    public final void method2686(byte arg0) {
        ++field6032;
        if (arg0 > 44) {
            if (client.field3637 != this.field6154) {
                class616 var2 = this.field6154;
                this.field6154 = client.field3637;
                if (var2.method3612(71)) {
                    this.method2630(true);
                }
                this.field6166 &= -32;
                this.field6196 = this.field6110;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 2776)
    public final void method477(Canvas arg0) {
        ++field6084;
        if (this.field5965 == arg0) {
            throw new RuntimeException();
        } else if (this.field5905.containsKey(arg0)) {
            this.method2676((byte) -116, arg0, this.field5905.get(arg0));
            this.field5905.remove(arg0);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()V", line = 2797)
    public void method473() {
        ++field5929;
        if (!this.field6198) {
            for (class417 var1 = this.field6063.method124((byte) 42); var1 != null; var1 = this.field6063.method120(-101)) {
                ((class2) var1).method3((byte) -34);
            }
            Enumeration var2 = this.field5905.keys();
            while (var2.hasMoreElements()) {
                Canvas var3 = (Canvas) var2.nextElement();
                this.method2676((byte) -127, var3, this.field5905.get(var3));
            }
            class437.method2550(true, false, 19357);
            this.field5945.release();
            this.field6198 = true;
        }
    }

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "()V", line = 2833)
    public final void method485() {
        this.field6195.method2888((byte) -106);
        ++field5999;
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "(II)V", line = 2843)
    public final void method2688(int arg0, int arg1) {
        ++field6004;
        if (arg1 != 28366) {
            this.method496(47, 122, -38, -33, 48, -93);
        }
        if (this.field6191 != arg0) {
            this.field6191 = arg0;
            this.method2628(1);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lm;)V", line = 2862)
    public final void method483(class165 arg0) {
        ++field5948;
        this.field6092 = (class57) arg0;
        this.field6094.method337(this.field6092);
        this.field6094.method376(false);
        this.field6095.method380(-128, this.field6094);
        this.field6093.method380(-128, this.field6092);
        if (this.field6154.method3612(94)) {
            this.method2630(true);
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(ZI)Laf;", line = 2883)
    public final class370 method2689(boolean arg0, int arg1) {
        if (!arg0) {
            this.field6198 = false;
        }
        ++field5958;
        if (arg1 * 2 > this.field6206.method288(247)) {
            this.field6206.method287(-74, arg1);
        }
        return this.field6206;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V", line = 2901)
    public final void method460(boolean arg0) {
        this.field6194 = arg0;
        ++field5909;
        this.method2659(-25172);
    }

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "(I)V", line = 2914)
    private final void method2692(int arg0) {
        ++field5935;
        if (arg0 != 4) {
            this.method2577((byte) -75);
        }
        if (!this.field6168) {
            float[] var2 = this.field6148;
            float var3 = (float) this.field6161 - this.field6157;
            float var4 = (float) this.field6115 - this.field6157;
            float var5 = (float) (-this.field6130) * this.field6135 / (float) this.field6181;
            float var6 = (float) (-this.field6133) * this.field6135 / (float) this.field6188;
            float var7 = (float) (-this.field6133 + this.field6044) * this.field6135 / (float) this.field6188;
            float var8 = (float) (-this.field6130 + this.field5975) * this.field6135 / (float) this.field6181;
            if (var6 != var7 && var5 != var8) {
                var2[4] = 0.0F;
                var2[2] = 0.0F;
                var2[0] = 2.0F / (-var6 + var7);
                var2[14] = var3 / (var3 - var4);
                var2[7] = 0.0F;
                var2[15] = 1.0F;
                var2[11] = 0.0F;
                var2[6] = 0.0F;
                var2[10] = 1.0F / (-var4 + var3);
                var2[12] = (var6 + var7) / (var6 - var7);
                var2[13] = (var5 + var8) / (-var5 + var8);
                var2[3] = 0.0F;
                var2[8] = 0.0F;
                var2[5] = 2.0F / (var8 - var5);
                var2[9] = 0.0F;
                var2[1] = 0.0F;
            } else {
                var2[4] = 0.0F;
                var2[7] = 0.0F;
                var2[3] = 0.0F;
                var2[10] = 1.0F;
                var2[2] = 0.0F;
                var2[5] = 1.0F;
                var2[12] = 0.0F;
                var2[8] = 0.0F;
                var2[9] = 0.0F;
                var2[14] = 0.0F;
                var2[0] = 1.0F;
                var2[11] = 0.0F;
                var2[15] = 1.0F;
                var2[6] = 0.0F;
                var2[1] = 0.0F;
                var2[13] = 0.0F;
            }
            this.method2595(true);
            this.field6168 = true;
        }
    }

    @OriginalMember(owner = "client!cb", name = "ra", descriptor = "()F", line = 2984)
    public final float method472() {
        ++field6009;
        return this.field6157;
    }

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "(F)V", line = 2994)
    public final void method500(float arg0) {
        ++field5938;
        if (this.field6190 != arg0) {
            this.field6190 = arg0;
            this.field5945.setAmbient(arg0);
            this.method2647(false);
            this.method2636(1);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Llg;[Lqm;Z)Lra;", line = 3010)
    public final class92 method492(class352 arg0, class126[] arg1, boolean arg2) {
        ++field5967;
        return new class95(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!cb", name = "CA", descriptor = "()I", line = 3025)
    public final int method435() {
        ++field5950;
        return this.field6115;
    }

    @OriginalMember(owner = "client!cb", name = "IA", descriptor = "(III[I)V", line = 3034)
    public final void method475(int arg0, int arg1, int arg2, int[] arg3) {
        ++field6072;
        float var5 = this.field6092.method374((float) arg0, (float) arg2, (byte) 7, (float) arg1);
        if (!((float) this.field6161 > var5) && !((float) this.field6115 < var5)) {
            int var6 = (int) ((float) this.field6188 * this.field6092.method377((float) arg1, (float) arg2, (float) arg0, 112) / var5);
            int var7 = (int) ((float) this.field6181 * this.field6092.method372(19505, (float) arg0, (float) arg2, (float) arg1) / var5);
            if ((float) var6 >= this.field6160 && (float) var6 <= this.field6184 && (float) var7 >= this.field6105 && (float) var7 <= this.field6138) {
                arg3[0] = (int) ((float) var6 + -this.field6160);
                arg3[1] = (int) ((float) var7 + -this.field6105);
                arg3[2] = (int) var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "()Z", line = 3065)
    public final boolean method508() {
        ++field6028;
        return this.field6170;
    }

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "(IIII)V", line = 3077)
    public final void method443(int arg0, int arg1, int arg2, int arg3) {
        ++field5971;
        this.field6125 = arg3;
        this.field6127 = arg2;
        this.field6117 = true;
        this.field6140 = arg0;
        this.field6162 = arg1;
        this.method2586(false, 0, 0, false, 3, (byte) 100);
        if (this.field6109 != null) {
            this.field6109.method1195((byte) 126);
        }
        this.method2624(-123);
        this.method2591(15385);
    }

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "(I)V", line = 3096)
    public final void method2693(int arg0) {
        this.field6103 = new class57[this.field6128];
        this.field6197 = new class1[this.field6128];
        ++field5919;
        this.field6174 = new class1[this.field6128];
        this.field6137 = new class227[this.field6128];
        this.field6098 = new class563[this.field6128];
        for (int var2 = 0; ~var2 > ~this.field6128; ++var2) {
            this.field6197[var2] = class132.field1816;
            this.field6174[var2] = class132.field1816;
            this.field6137[var2] = class636.field9304;
            this.field6103[var2] = new class57();
        }
        this.field6169 = new class405[this.field6129 + -2];
        this.field6179 = this.method2695(1, 1, class194.field2874, arg0 + -7, class488.field6956);
        this.method448(new class2(262144));
        this.field6209 = this.method2649(-122, new class334[] { new class334(new class58[] { class58.field719, class58.field732 }) });
        this.field6211 = this.method2649(-119, new class334[] { new class334(new class58[] { class58.field719, class58.field729 }) });
        this.field6207 = this.method2649(-124, new class334[] { new class334(class58.field719), new class334(class58.field729), new class334(class58.field732), new class334(class58.field728) });
        this.field6216 = this.method2649(arg0 + -134, new class334[] { new class334(class58.field719), new class334(class58.field729), new class334(class58.field732) });
        this.field6210 = new class364(this, 0, 0, false, false);
        this.field6213 = new class364(this, 0, 0, true, true);
        this.field6218 = new class364(this, 0, 0, false, false);
        this.field6202 = new class364(this, 0, 0, true, true);
        this.field6215 = new class364(this, 0, 0, false, false);
        this.field6205 = new class364(this, 0, 0, true, true);
        this.field6204 = new class364(this, 0, 0, false, false);
        this.field6217 = new class364(this, 0, 0, true, true);
        this.field6203 = new class364(this, 0, 0, false, false);
        this.field6214 = new class364(this, 0, 0, true, true);
        this.field6116 = new class8(this);
        this.field6206 = this.method2638(true, false);
        this.method2677(-11686);
        this.field6016 = new class438(this);
        this.field6119[1] = this.method2648(1, 0);
        this.field6119[2] = this.method2648(2, arg0 + -7);
        this.field6119[4] = this.method2648(4, arg0 + -7);
        this.field6119[5] = this.method2648(5, 0);
        this.field6119[6] = this.method2648(6, 0);
        this.field6119[arg0] = this.method2648(7, 0);
        this.field6119[3] = this.method2648(3, 0);
        this.field6119[8] = this.method2648(8, 0);
        this.field6119[9] = this.method2648(9, 0);
        if (!this.field6119[2].method201((byte) -107)) {
            this.field6119[2] = this.method2648(0, 0);
        }
        if (!this.field6119[4].method201((byte) -118)) {
            this.field6119[4] = this.field6119[2];
        }
        if (!this.field6119[8].method201((byte) -71)) {
            this.field6119[8] = this.field6119[4];
        }
        if (!this.field6119[9].method201((byte) -84)) {
            this.field6119[9] = this.field6119[8];
        }
        this.method2665(7);
        this.method479();
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(IIIII)V", line = 3175)
    public final void method446(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method481(arg0, arg1, arg0, arg1 + arg2, arg3, arg4);
        ++field5966;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lr;Lrd;Lm;Lpr;I)V", line = 3183)
    public final void method511(class159 arg0, class283 arg1, class165 arg2, class381 arg3, int arg4) {
        arg0.method93(arg2, arg3, arg4);
        ++field5934;
        this.method488(arg1);
    }

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "(B)V", line = 3198)
    private final void method2694(byte arg0) {
        if (this.field6157 != 0.0F) {
            float var2 = this.field6106 / (this.field6157 + this.field6106);
            float var3 = var2 * var2;
            float var4 = (-var2 + 1.0F) * -this.field6121 * (1.0F - var2) / this.field6157;
            this.field6177[14] = this.field6121 * var3;
            this.field6177[10] = this.field6164 + var4;
        } else {
            this.field6177[10] = this.field6164;
            this.field6177[14] = this.field6121;
        }
        ++field6087;
        this.field6118 = (this.field6177[14] - (float) this.field6115) / this.field6177[10];
        if (arg0 > -104) {
            this.field6125 = -111;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()Z", line = 3230)
    public final boolean method438() {
        ++field6033;
        return false;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[Lnm;)V", line = 3238)
    public final void method429(int arg0, class405[] arg1) {
        ++field6038;
        for (int var3 = 0; var3 < arg0; ++var3) {
            this.field6169[var3] = arg1[var3];
        }
        this.field6175 = arg0;
        if (this.field6154.method3612(-95)) {
            this.method2661(-33);
        }
    }

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "(B)V", line = 3257)
    public final void method2696(byte arg0) {
        ++field5915;
        if (arg0 != -52) {
            this.method500(-0.36228877F);
        }
        if (this.field6166 != 16) {
            this.method2589(arg0 + 52);
            this.method2667(true, 110);
            this.method2657(true, arg0 + 20);
            this.method2644(-94, true);
            this.method2650(1, (byte) 35);
            this.field6166 = 16;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIIIII)V", line = 3278)
    public final void method481(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6046;
        float var7 = (float) (-arg0) + (float) arg2;
        float var8 = (float) (-arg1) + (float) arg3;
        float var9 = (float) (1.0D / Math.sqrt((double) (var7 * var7 + var8 * var8)));
        float var10 = var8 * var9;
        float var11 = var7 * var9;
        if (this.method2608(9, 0.0F, 0.0F, (float) arg2 + var11, (float) arg1, (float) arg0, (float) arg3 + var10)) {
            this.method2616((byte) -10);
            this.method2688(arg4, 28366);
            this.method2598(class314.field4331, 0, (byte) 59);
            this.method2655(0, -89, class314.field4331);
            this.method2650(arg5, (byte) 35);
            this.method2613((byte) 124);
            this.method2573(false, (byte) -114);
            this.method2669(-18643);
            this.method2573(true, (byte) -109);
            this.method2655(0, -83, class453.field6405);
            this.method2598(class453.field6405, 0, (byte) 59);
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "()I", line = 3310)
    public final int method524() {
        ++field6029;
        return this.field6161;
    }

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "(I)V", line = 3319)
    private final void method2697(int arg0) {
        if (arg0 != 0) {
            this.field5922 = null;
        }
        ++field5927;
        this.method2609(false);
        if (this.field6109 != null) {
            this.field6109.method1196(-3385);
        }
    }

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "()Z", line = 3334)
    public final boolean method464() {
        ++field5980;
        return this.field6119[3].method201((byte) -100);
    }

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "(II)V", line = 3345)
    public final void method2698(int arg0, int arg1) {
        ++field6056;
        if (arg0 != arg1) {
            if (arg0 != 0) {
                if (arg0 == 2) {
                    this.method2643(class296.field4074, -10304, class471.field6648);
                } else {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            this.method2643(class316.field4345, -10304, class316.field4345);
                            return;
                        }
                    } else {
                        this.method2643(class132.field1816, -10304, class533.field7939);
                    }
                }
            } else {
                this.method2643(class132.field1816, arg1 + -10305, class132.field1816);
            }
        } else {
            this.method2643(class296.field4074, arg1 ^ -10303, class296.field4074);
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(II)V")
    public abstract void method2567(int arg0, int arg1);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Laq;IIII[B)Lvi;")
    public abstract class462 method2568(class141 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5);

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(Z)V")
    public abstract void method2570(boolean arg0);

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "(I)V")
    public abstract void method2571(int arg0);

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(ZB)V")
    public abstract void method2573(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIB[FIIZLaq;)Ljb;")
    public abstract class422 method2575(int arg0, int arg1, byte arg2, float[] arg3, int arg4, int arg5, boolean arg6, class141 arg7);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLgf;IIIILaf;)V")
    public abstract void method2578(byte arg0, class232 arg1, int arg2, int arg3, int arg4, int arg5, class370 arg6);

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)F")
    public abstract float method2580(byte arg0);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZILhm;)V")
    public abstract void method2581(int arg0, boolean arg1, int arg2, class188 arg3);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILaq;Lui;)Z")
    public abstract boolean method2583(int arg0, class141 arg1, class194 arg2);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZLsk;)V")
    public abstract void method2584(boolean arg0, class532 arg1);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lgf;III)V")
    public abstract void method2587(class232 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "(I)V")
    public abstract void method2591(int arg0);

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "(B)V")
    public abstract void method2592(byte arg0);

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "(B)V")
    public abstract void method2593(byte arg0);

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "(B)V")
    public abstract void method2602(byte arg0);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/awt/Canvas;ZLjava/lang/Object;)V")
    public abstract void method2604(Canvas arg0, boolean arg1, Object arg2);

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "(B)V")
    public abstract void method2605(byte arg0);

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "(I)V")
    public abstract void method2607(int arg0);

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "(Z)V")
    public abstract void method2609(boolean arg0);

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "(I)V")
    public abstract void method2610(int arg0);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZIBZLhm;)V")
    public abstract void method2612(boolean arg0, int arg1, byte arg2, boolean arg3, class188 arg4);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lql;IB)V")
    public abstract void method2617(class628 arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "(I)V")
    public abstract void method2618(int arg0);

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "(I)V")
    public abstract void method2619(int arg0);

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "(I)V")
    public abstract void method2620(int arg0);

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "(I)V")
    public abstract void method2621(int arg0);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)Lql;")
    public abstract class628 method2627(boolean arg0, int arg1);

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "(I)V")
    public abstract void method2628(int arg0);

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "(B)V")
    public abstract void method2629(byte arg0);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLui;Laq;)Z")
    public abstract boolean method2633(byte arg0, class194 arg1, class141 arg2);

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "(I)V")
    public abstract void method2636(int arg0);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZZ)Laf;")
    public abstract class370 method2638(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([BLaq;ZIIIIZ)Ljb;")
    public abstract class422 method2641(byte[] arg0, class141 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ljava/lang/Object;")
    public abstract Object method2645(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "(Z)V")
    public abstract void method2647(boolean arg0);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[Lwj;)Lsk;")
    public abstract class532 method2649(int arg0, class334[] arg1);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLee;)V")
    public abstract void method2651(byte arg0, class582 arg1);

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "(B)V")
    public abstract void method2654(byte arg0);

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "(I)V")
    public abstract void method2659(int arg0);

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "(Z)V")
    public abstract void method2662(boolean arg0);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjava/lang/Object;Ljava/awt/Canvas;)V")
    public abstract void method2668(byte arg0, Object arg1, Canvas arg2);

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "(I)V")
    public abstract void method2673(int arg0);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjava/awt/Canvas;Ljava/lang/Object;)V")
    public abstract void method2676(byte arg0, Canvas arg1, Object arg2);

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "(Z)V")
    public abstract void method2681(boolean arg0);

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "(I)V")
    public abstract void method2683(int arg0);

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "(I)V")
    public abstract void method2687(int arg0);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIZ[[I)Lwv;")
    public abstract class31 method2690(int arg0, int arg1, boolean arg2, int[][] arg3);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIII[IZI)Ljb;")
    public abstract class422 method2691(int arg0, int arg1, int arg2, int arg3, int[] arg4, boolean arg5, int arg6);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILui;ILaq;)Ljb;")
    public abstract class422 method2695(int arg0, int arg1, class194 arg2, int arg3, class141 arg4);
}
